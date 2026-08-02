package ru.CryptoPro.reprov.certpath;

import defpackage.g8e;
import defpackage.kbs;
import defpackage.oyr;
import java.io.IOException;
import java.security.AccessController;
import java.security.InvalidAlgorithmParameterException;
import java.security.PublicKey;
import java.security.cert.CRL;
import java.security.cert.CRLException;
import java.security.cert.CertPathBuilder;
import java.security.cert.CertPathValidatorException;
import java.security.cert.CertStore;
import java.security.cert.CertStoreException;
import java.security.cert.PKIXBuilderParameters;
import java.security.cert.PKIXCertPathBuilderResult;
import java.security.cert.TrustAnchor;
import java.security.cert.X509CRL;
import java.security.cert.X509CRLSelector;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.security.auth.x500.X500Principal;
import ru.CryptoPro.JCP.tools.JCPLogger;
import ru.CryptoPro.reprov.array.DerValue;
import ru.CryptoPro.reprov.certpath.URICertStore;
import ru.CryptoPro.reprov.utils.GetPropertyAction;
import ru.CryptoPro.reprov.x509.CRLDistributionPointsExtension;
import ru.CryptoPro.reprov.x509.DistributionPoint;
import ru.CryptoPro.reprov.x509.DistributionPointName;
import ru.CryptoPro.reprov.x509.GeneralName;
import ru.CryptoPro.reprov.x509.GeneralNameInterface;
import ru.CryptoPro.reprov.x509.GeneralNames;
import ru.CryptoPro.reprov.x509.IssuingDistributionPointExtension;
import ru.CryptoPro.reprov.x509.PKIXExtensions;
import ru.CryptoPro.reprov.x509.RDN;
import ru.CryptoPro.reprov.x509.ReasonFlags;
import ru.CryptoPro.reprov.x509.URIName;
import ru.CryptoPro.reprov.x509.X500Name;

/* loaded from: classes4.dex */
public class DistributionPointFetcher {
    public static final boolean[] a = {true, true, true, true, true, true, true, true, true};
    public static final boolean b;

    static {
        b = getBooleanProperty("com.sun.security.enableCRLDP", false) || getBooleanProperty("com.ibm.security.enableCRLDP", false);
    }

    public static Collection a(X509CRLSelector x509CRLSelector, X509Certificate x509Certificate, DistributionPoint distributionPoint, boolean[] zArr, boolean z, PublicKey publicKey, String str, List list, Set set, Date date) {
        GeneralNames fullName = distributionPoint.getFullName();
        if (fullName == null) {
            RDN relativeName = distributionPoint.getRelativeName();
            if (relativeName == null) {
                return Collections.EMPTY_SET;
            }
            try {
                GeneralNames cRLIssuer = distributionPoint.getCRLIssuer();
                if (cRLIssuer == null) {
                    fullName = b(new X500Name(x509Certificate.getIssuerX500Principal().getEncoded()), relativeName);
                } else {
                    if (cRLIssuer.size() != 1) {
                        return Collections.EMPTY_SET;
                    }
                    fullName = b((X500Name) cRLIssuer.get(0).getName(), relativeName);
                }
            } catch (IOException unused) {
                return Collections.EMPTY_SET;
            }
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList(2);
        Iterator it = fullName.iterator();
        while (true) {
            X509CRL x509crl = null;
            if (!it.hasNext()) {
                break;
            }
            GeneralName generalName = (GeneralName) it.next();
            if (generalName.getType() == 4) {
                X500Name x500Name = (X500Name) generalName.getName();
                X500Principal issuerX500Principal = x509Certificate.getIssuerX500Principal();
                JCPLogger.finer("Trying to fetch CRL from DP ", x500Name);
                X509CRLSelector x509CRLSelector2 = new X509CRLSelector();
                x509CRLSelector2.addIssuer(new X500Principal(x500Name.asX500Principal().getEncoded()));
                x509CRLSelector2.addIssuer(issuerX500Principal);
                ArrayList arrayList3 = new ArrayList();
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    try {
                        Iterator<? extends CRL> it3 = ((CertStore) it2.next()).getCRLs(x509CRLSelector2).iterator();
                        while (it3.hasNext()) {
                            arrayList3.add((X509CRL) it3.next());
                        }
                    } catch (CertStoreException e) {
                        JCPLogger.fine("Non-fatal exception while retrieving CRLs: ", (Throwable) e);
                    }
                }
                arrayList.addAll(arrayList3);
            } else if (generalName.getType() == 6) {
                try {
                    Collection<? extends CRL> cRLs = URICertStore.getInstance(new URICertStore.URICertStoreParameters(((URIName) generalName.getName()).getURI())).getCRLs(null);
                    if (!cRLs.isEmpty()) {
                        x509crl = (X509CRL) cRLs.iterator().next();
                    }
                } catch (Exception e2) {
                    JCPLogger.warning("Exception getting CRL from CertStore: ", (Throwable) e2);
                }
                if (x509crl != null) {
                    arrayList.add(x509crl);
                }
            }
        }
        Iterator it4 = arrayList.iterator();
        while (it4.hasNext()) {
            X509CRL x509crl2 = (X509CRL) it4.next();
            try {
                x509CRLSelector.setIssuerNames(null);
                if (x509CRLSelector.match(x509crl2) && c(x509Certificate, distributionPoint, x509crl2, zArr, z, publicKey, str, set, list, date)) {
                    arrayList2.add(x509crl2);
                } else {
                    JCPLogger.finer("CRL does not satisfy the cert selector (match) or some other options (verifyCRL)");
                }
            } catch (Exception e3) {
                JCPLogger.subThrown("Exception verifying CRL:", e3);
            }
        }
        return arrayList2;
    }

    public static GeneralNames b(X500Name x500Name, RDN rdn) {
        ArrayList arrayList = new ArrayList(x500Name.rdns());
        arrayList.add(rdn);
        X500Name x500Name2 = new X500Name((RDN[]) arrayList.toArray(new RDN[0]));
        GeneralNames generalNames = new GeneralNames();
        generalNames.add(new GeneralName(x500Name2));
        return generalNames;
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x00fc, code lost:
    
        if (r6 == false) goto L156;
     */
    /* JADX WARN: Removed duplicated region for block: B:124:0x020b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:136:0x021d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean c(X509Certificate x509Certificate, DistributionPoint distributionPoint, X509CRL x509crl, boolean[] zArr, boolean z, PublicKey publicKey, String str, Set set, List list, Date date) {
        X500Name x500Name;
        boolean z2;
        Object clone;
        int i;
        boolean z3;
        PublicKey publicKey2;
        byte[] extensionValue = x509crl.getExtensionValue(PKIXExtensions.IssuingDistributionPoint_Id.toString());
        IssuingDistributionPointExtension issuingDistributionPointExtension = extensionValue != null ? new IssuingDistributionPointExtension(Boolean.FALSE, new DerValue(extensionValue).getOctetString()) : null;
        X500Principal issuerX500Principal = x509Certificate.getIssuerX500Principal();
        X500Principal issuerX500Principal2 = x509crl.getIssuerX500Principal();
        X500Name x500Name2 = new X500Name(issuerX500Principal.getEncoded());
        X500Name x500Name3 = new X500Name(issuerX500Principal2.getEncoded());
        GeneralNames cRLIssuer = distributionPoint.getCRLIssuer();
        if (cRLIssuer != null) {
            if (issuingDistributionPointExtension != null && !((Boolean) issuingDistributionPointExtension.get(IssuingDistributionPointExtension.INDIRECT_CRL)).equals(Boolean.FALSE)) {
                Iterator it = cRLIssuer.iterator();
                x500Name = null;
                boolean z4 = false;
                while (!z4 && it.hasNext()) {
                    GeneralNameInterface name = ((GeneralName) it.next()).getName();
                    if (x500Name3.equals(name)) {
                        x500Name = (X500Name) name;
                        z4 = true;
                    }
                }
                z2 = z4;
            }
            return false;
        }
        if (!x500Name3.equals(x500Name2)) {
            JCPLogger.finer("crl issuer does not equal cert issuer");
            return false;
        }
        x500Name = null;
        if (z2 || z) {
            if (issuingDistributionPointExtension != null) {
                DistributionPointName distributionPointName = (DistributionPointName) issuingDistributionPointExtension.get(IssuingDistributionPointExtension.POINT);
                if (distributionPointName != null) {
                    GeneralNames fullName = distributionPointName.getFullName();
                    if (fullName == null) {
                        RDN relativeName = distributionPointName.getRelativeName();
                        if (relativeName == null) {
                            JCPLogger.finer("IDP must be relative or full DN");
                            return false;
                        }
                        JCPLogger.finer("IDP relativeName:", relativeName);
                        fullName = b(x500Name3, relativeName);
                    }
                    if (distributionPoint.getFullName() == null && distributionPoint.getRelativeName() == null) {
                        Iterator it2 = cRLIssuer.iterator();
                        boolean z5 = false;
                        while (!z5 && it2.hasNext()) {
                            GeneralNameInterface name2 = ((GeneralName) it2.next()).getName();
                            Iterator it3 = fullName.iterator();
                            while (!z5 && it3.hasNext()) {
                                z5 = name2.equals(((GeneralName) it3.next()).getName());
                            }
                        }
                    } else {
                        GeneralNames fullName2 = distributionPoint.getFullName();
                        if (fullName2 == null) {
                            RDN relativeName2 = distributionPoint.getRelativeName();
                            if (relativeName2 == null) {
                                JCPLogger.finer("DP must be relative or full DN");
                                return false;
                            }
                            JCPLogger.finer("DP relativeName:", relativeName2);
                            if (!z2) {
                                fullName2 = b(x500Name2, relativeName2);
                            } else {
                                if (cRLIssuer.size() != 1) {
                                    JCPLogger.finer("must only be one CRL issuer when relative name present");
                                    return false;
                                }
                                fullName2 = b(x500Name, relativeName2);
                            }
                        }
                        Iterator it4 = fullName.iterator();
                        boolean z6 = false;
                        while (!z6 && it4.hasNext()) {
                            GeneralNameInterface name3 = ((GeneralName) it4.next()).getName();
                            JCPLogger.finer("idpName: ", name3);
                            Iterator it5 = fullName2.iterator();
                            while (!z6 && it5.hasNext()) {
                                GeneralNameInterface name4 = ((GeneralName) it5.next()).getName();
                                JCPLogger.finer("pointName: ", name4);
                                z6 = name3.equals(name4);
                            }
                        }
                        if (!z6) {
                            JCPLogger.finer("IDP name does not match DP name");
                            return false;
                        }
                    }
                }
                Boolean bool = (Boolean) issuingDistributionPointExtension.get(IssuingDistributionPointExtension.ONLY_USER_CERTS);
                Boolean bool2 = Boolean.TRUE;
                if (bool.equals(bool2) && x509Certificate.getBasicConstraints() != -1) {
                    JCPLogger.finer("cert must be a EE cert");
                    return false;
                }
                if (((Boolean) issuingDistributionPointExtension.get(IssuingDistributionPointExtension.ONLY_CA_CERTS)).equals(bool2) && x509Certificate.getBasicConstraints() == -1) {
                    JCPLogger.finer("cert must be a CA cert");
                    return false;
                }
                if (((Boolean) issuingDistributionPointExtension.get(IssuingDistributionPointExtension.ONLY_ATTRIBUTE_CERTS)).equals(bool2)) {
                    JCPLogger.finer("cert must not be an AA cert");
                    return false;
                }
            }
            boolean[] zArr2 = new boolean[9];
            ReasonFlags reasonFlags = issuingDistributionPointExtension != null ? (ReasonFlags) issuingDistributionPointExtension.get(IssuingDistributionPointExtension.REASONS) : null;
            boolean[] reasonFlags2 = distributionPoint.getReasonFlags();
            if (reasonFlags == null) {
                if (issuingDistributionPointExtension == null || reasonFlags == null) {
                    if (reasonFlags2 != null) {
                        clone = reasonFlags2.clone();
                        zArr2 = (boolean[]) clone;
                    } else {
                        zArr2 = new boolean[9];
                        Arrays.fill(zArr2, true);
                    }
                }
                z3 = false;
                while (i < zArr2.length) {
                }
                if (z3) {
                }
            } else if (reasonFlags2 != null) {
                boolean[] flags = reasonFlags.getFlags();
                for (int i2 = 0; i2 < flags.length; i2++) {
                    if (flags[i2] && reasonFlags2[i2]) {
                        zArr2[i2] = true;
                    }
                }
                z3 = false;
                for (i = 0; i < zArr2.length && !z3; i++) {
                    if (!zArr[i] && zArr2[i]) {
                        z3 = true;
                    }
                }
                if (z3) {
                    if (z2) {
                        X509CertSelector x509CertSelector = new X509CertSelector();
                        x509CertSelector.setSubject(x500Name3.asX500Principal());
                        x509CertSelector.setKeyUsage(new boolean[]{false, false, false, false, false, false, true});
                        try {
                            PKIXBuilderParameters pKIXBuilderParameters = new PKIXBuilderParameters((Set<TrustAnchor>) set, x509CertSelector);
                            pKIXBuilderParameters.setCertStores(list);
                            pKIXBuilderParameters.setSigProvider(str);
                            pKIXBuilderParameters.setDate(date);
                            try {
                                publicKey2 = ((PKIXCertPathBuilderResult) CertPathBuilder.getInstance("PKIX").build(pKIXBuilderParameters)).getPublicKey();
                            } catch (Exception e) {
                                CRLException cRLException = new CRLException();
                                cRLException.initCause(e.getCause());
                                throw cRLException;
                            }
                        } catch (InvalidAlgorithmParameterException e2) {
                            CRLException cRLException2 = new CRLException();
                            cRLException2.initCause(e2.getCause());
                            throw cRLException2;
                        }
                    } else {
                        publicKey2 = publicKey;
                    }
                    try {
                        AlgorithmChecker.a(publicKey2, x509crl);
                        try {
                            x509crl.verify(publicKey2, str);
                            Set<String> criticalExtensionOIDs = x509crl.getCriticalExtensionOIDs();
                            if (criticalExtensionOIDs != null) {
                                criticalExtensionOIDs.remove(PKIXExtensions.IssuingDistributionPoint_Id.toString());
                                if (!criticalExtensionOIDs.isEmpty()) {
                                    JCPLogger.finer("Unrecognized critical extension(s) in CRL:" + criticalExtensionOIDs);
                                    Iterator<String> it6 = criticalExtensionOIDs.iterator();
                                    while (it6.hasNext()) {
                                        JCPLogger.finer(it6.next());
                                    }
                                }
                            }
                            for (int i3 = 0; i3 < zArr2.length; i3++) {
                                if (!zArr[i3] && zArr2[i3]) {
                                    zArr[i3] = true;
                                }
                            }
                            return true;
                        } catch (Exception unused) {
                            StringBuilder sb = new StringBuilder("CRL signature failed to verify, cert: ");
                            sb.append(x509Certificate.getClass().getCanonicalName());
                            sb.append(", key: ");
                            g8e.D(sb, publicKey2 != null ? publicKey2.getClass().getCanonicalName() : null, ", provider: ", str, ", class: ");
                            sb.append(x509crl.getClass().getCanonicalName());
                            JCPLogger.finer(sb.toString());
                            return false;
                        }
                    } catch (CertPathValidatorException e3) {
                        JCPLogger.finer("CRL signature algorithm check failed: " + e3);
                        return false;
                    }
                }
            } else {
                clone = reasonFlags.getFlags().clone();
                zArr2 = (boolean[]) clone;
                z3 = false;
                while (i < zArr2.length) {
                    if (!zArr[i]) {
                        z3 = true;
                    }
                }
                if (z3) {
                }
            }
        }
        return false;
    }

    public static boolean getBooleanProperty(String str, boolean z) {
        String str2 = (String) AccessController.doPrivileged(new GetPropertyAction(str));
        if (str2 == null) {
            return z;
        }
        if (str2.equalsIgnoreCase("false")) {
            return false;
        }
        if (str2.equalsIgnoreCase("true")) {
            return true;
        }
        kbs.g(oyr.p("Value of ", str, " must either be 'true' or 'false'"));
        return false;
    }

    public static Collection getCRLs(X509CRLSelector x509CRLSelector, boolean z, PublicKey publicKey, String str, List list, boolean[] zArr, Set set, Date date) throws CertStoreException {
        X509Certificate certificateChecking;
        if (b && (certificateChecking = x509CRLSelector.getCertificateChecking()) != null) {
            try {
                byte[] extensionValue = certificateChecking.getExtensionValue(PKIXExtensions.CRLDistributionPoints_Id.toString());
                CRLDistributionPointsExtension cRLDistributionPointsExtension = extensionValue != null ? new CRLDistributionPointsExtension(Boolean.FALSE, new DerValue(extensionValue).getOctetString()) : null;
                if (cRLDistributionPointsExtension == null) {
                    JCPLogger.finer("No CRLDP ext");
                    return Collections.EMPTY_SET;
                }
                List list2 = (List) cRLDistributionPointsExtension.get(CRLDistributionPointsExtension.POINTS);
                ArrayList arrayList = new ArrayList();
                Iterator it = list2.iterator();
                while (it.hasNext() && !Arrays.equals(zArr, a)) {
                    arrayList.addAll(a(x509CRLSelector, certificateChecking, (DistributionPoint) it.next(), zArr, z, publicKey, str, list, set, date));
                }
                JCPLogger.finerFormat("Returning {0} CRLs", Integer.valueOf(arrayList.size()));
                return arrayList;
            } catch (IOException unused) {
                return Collections.EMPTY_SET;
            }
        }
        return Collections.EMPTY_SET;
    }
}
