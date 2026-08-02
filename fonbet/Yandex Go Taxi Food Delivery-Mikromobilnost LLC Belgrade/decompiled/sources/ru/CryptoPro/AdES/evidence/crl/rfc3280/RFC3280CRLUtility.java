package ru.CryptoPro.AdES.evidence.crl.rfc3280;

import defpackage.a2;
import defpackage.ayo;
import defpackage.b3;
import defpackage.c2;
import defpackage.c490;
import defpackage.fxs;
import defpackage.g2k;
import defpackage.gxs;
import defpackage.h2k;
import defpackage.h490;
import defpackage.i3;
import defpackage.j490;
import defpackage.jc51;
import defpackage.jqf;
import defpackage.kbs;
import defpackage.l490;
import defpackage.o2;
import defpackage.oyr;
import defpackage.s0x;
import defpackage.vd5;
import defpackage.w511;
import defpackage.x4e;
import java.io.IOException;
import java.math.BigInteger;
import java.security.PublicKey;
import java.security.cert.CertPathBuilderException;
import java.security.cert.CertPathValidatorException;
import java.security.cert.CertSelector;
import java.security.cert.Certificate;
import java.security.cert.PKIXBuilderParameters;
import java.security.cert.PKIXParameters;
import java.security.cert.TrustAnchor;
import java.security.cert.X509CRL;
import java.security.cert.X509CertSelector;
import java.security.cert.X509Certificate;
import java.security.cert.X509Extension;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.bouncycastle.jce.provider.AnnotatedException;
import ru.CryptoPro.JCP.tools.JCPLogger;
import ru.CryptoPro.JCP.tools.Platform;
import ru.CryptoPro.reprov.AndroidExtKeyUsageCertPathChecker;
import ru.CryptoPro.reprov.certpath.SunCertPathBuilder;

/* loaded from: classes4.dex */
class RFC3280CRLUtility extends CertPathValidatorUtilities {
    public static final String ANY_POLICY = "2.5.29.32.0";
    protected static final int CRL_SIGN = 6;
    protected static final int KEY_CERT_SIGN = 5;
    public static final String CERTIFICATE_POLICIES = ayo.J.a;
    public static final String POLICY_MAPPINGS = ayo.K.a;
    public static final String INHIBIT_ANY_POLICY = ayo.O.a;
    public static final String ISSUING_DISTRIBUTION_POINT = ayo.F.a;
    public static final String FRESHEST_CRL = ayo.N.a;
    public static final String DELTA_CRL_INDICATOR = ayo.E.a;
    public static final String POLICY_CONSTRAINTS = ayo.M.a;
    public static final String BASIC_CONSTRAINTS = ayo.B.a;
    public static final String CRL_DISTRIBUTION_POINTS = ayo.I.a;
    public static final String SUBJECT_ALTERNATIVE_NAME = ayo.z.a;
    public static final String NAME_CONSTRAINTS = ayo.H.a;
    public static final String AUTHORITY_KEY_IDENTIFIER = ayo.L.a;
    public static final String KEY_USAGE = ayo.y.a;
    public static final String CRL_NUMBER = ayo.C.a;

    private static BigInteger getSerialNumber(Object obj) {
        if (obj instanceof X509Certificate) {
            return ((X509Certificate) obj).getSerialNumber();
        }
        throw oyr.d(obj);
    }

    public static void processCRLB1(g2k g2kVar, Object obj, X509CRL x509crl) throws Exception {
        JCPLogger.subEnter();
        b3 extensionValue = CertPathValidatorUtilities.getExtensionValue(x509crl, ISSUING_DISTRIBUTION_POINT);
        boolean z = true;
        boolean z2 = extensionValue != null && s0x.n(extensionValue).x;
        try {
            byte[] encoded = PrincipalUtils.getIssuerPrincipal(x509crl).getEncoded();
            gxs gxsVar = g2kVar.c;
            if (gxsVar != null) {
                boolean z3 = false;
                for (fxs fxsVar : gxsVar.n()) {
                    if (fxsVar.b == 4) {
                        try {
                            if (Arrays.equals(fxsVar.a.toASN1Primitive().getEncoded(), encoded)) {
                                z3 = true;
                            }
                        } catch (IOException e) {
                            h490.b(e, "CRL issuer information from distribution point cannot be decoded.");
                            return;
                        }
                    }
                }
                if (z3 && !z2) {
                    h490.b(null, "Distribution point contains cRLIssuer field but CRL is not indirect.");
                    return;
                } else {
                    if (!z3) {
                        h490.b(null, "CRL issuer of CRL does not match CRL issuer of distribution point.");
                        return;
                    }
                    z = z3;
                }
            } else if (!PrincipalUtils.getIssuerPrincipal(x509crl).equals(PrincipalUtils.getEncodedIssuerPrincipal(obj))) {
                z = false;
            }
            if (z) {
                JCPLogger.subExit();
            } else {
                h490.b(null, "Cannot find matching CRL issuer for certificate.");
            }
        } catch (IOException e2) {
            throw new AnnotatedException(x4e.d(e2, new StringBuilder("Exception encoding CRL issuer: ")), e2);
        }
    }

    public static void processCRLB2(g2k g2kVar, Object obj, X509CRL x509crl) throws Exception {
        int i;
        fxs[] fxsVarArr;
        JCPLogger.subEnter();
        try {
            s0x n = s0x.n(CertPathValidatorUtilities.getExtensionValue(x509crl, ISSUING_DISTRIBUTION_POINT));
            if (n != null) {
                if (n.a != null) {
                    h2k h2kVar = s0x.n(n).a;
                    ArrayList arrayList = new ArrayList();
                    int i2 = h2kVar.b;
                    o2 o2Var = h2kVar.a;
                    if (i2 == 0) {
                        for (fxs fxsVar : gxs.m(o2Var).n()) {
                            arrayList.add(fxsVar);
                        }
                    }
                    if (h2kVar.b == 1) {
                        c2 c2Var = new c2();
                        try {
                            Enumeration B = i3.z(PrincipalUtils.getIssuerPrincipal(x509crl)).B();
                            while (B.hasMoreElements()) {
                                c2Var.a((a2) B.nextElement());
                            }
                            c2Var.a(o2Var);
                            arrayList.add(new fxs(jc51.m(new jqf(c2Var))));
                        } catch (Exception e) {
                            h490.b(e, "Could not read CRL issuer.");
                            return;
                        }
                    }
                    h2k h2kVar2 = g2kVar.a;
                    gxs gxsVar = g2kVar.c;
                    if (h2kVar2 == null) {
                        if (gxsVar == null) {
                            h490.b(null, "Either the cRLIssuer or the distributionPoint field must be contained in DistributionPoint.");
                            return;
                        }
                        fxs[] n2 = gxsVar.n();
                        while (i < n2.length) {
                            i = arrayList.contains(n2[i]) ? 0 : i + 1;
                        }
                        w511.s("No match for certificate CRL issuing distribution point name to cRLIssuer CRL distribution point.");
                        return;
                    }
                    int i3 = h2kVar2.b;
                    o2 o2Var2 = h2kVar2.a;
                    fxs[] n3 = i3 == 0 ? gxs.m(o2Var2).n() : null;
                    if (i3 == 1) {
                        if (gxsVar != null) {
                            fxsVarArr = gxsVar.n();
                        } else {
                            fxsVarArr = new fxs[1];
                            try {
                                fxsVarArr[0] = new fxs(jc51.m(PrincipalUtils.getEncodedIssuerPrincipal(obj).getEncoded()));
                            } catch (Exception e2) {
                                h490.b(e2, "Could not read certificate issuer.");
                                return;
                            }
                        }
                        n3 = fxsVarArr;
                        for (int i4 = 0; i4 < n3.length; i4++) {
                            Enumeration B2 = i3.z(n3[i4].a.toASN1Primitive()).B();
                            c2 c2Var2 = new c2();
                            while (B2.hasMoreElements()) {
                                c2Var2.a((a2) B2.nextElement());
                            }
                            c2Var2.a(o2Var2);
                            n3[i4] = new fxs(jc51.m(new jqf(c2Var2)));
                        }
                    }
                    if (n3 != null) {
                        while (i < n3.length) {
                            i = arrayList.contains(n3[i]) ? 0 : i + 1;
                        }
                    }
                    h490.b(null, "No match for certificate CRL issuing distribution point name to cRLIssuer CRL distribution point.");
                    return;
                }
                try {
                    vd5 m = vd5.m(CertPathValidatorUtilities.getExtensionValue((X509Extension) obj, BASIC_CONSTRAINTS));
                    if (obj instanceof X509Certificate) {
                        if (n.b && m != null && m.n()) {
                            h490.b(null, "CA Cert CRL only contains user certificates.");
                            return;
                        } else if (n.c && (m == null || !m.n())) {
                            h490.b(null, "End CRL only contains CA certificates.");
                            return;
                        }
                    }
                    if (n.y) {
                        h490.b(null, "onlyContainsAttributeCerts boolean is asserted.");
                        return;
                    }
                } catch (Exception e3) {
                    h490.b(e3, "Basic constraints extension could not be decoded.");
                    return;
                }
            }
            JCPLogger.subExit();
        } catch (Exception e4) {
            throw new Exception("Issuing distribution point extension could not be decoded.", e4);
        }
    }

    public static void processCRLC(X509CRL x509crl, X509CRL x509crl2, l490 l490Var) throws Exception {
        JCPLogger.subEnter();
        if (x509crl == null) {
            return;
        }
        try {
            s0x.n(CertPathValidatorUtilities.getExtensionValue(x509crl2, ISSUING_DISTRIBUTION_POINT));
            l490Var.getClass();
            JCPLogger.subExit();
        } catch (Exception e) {
            h490.b(e, "Issuing distribution point extension could not be decoded.");
        }
    }

    public static ReasonsMask processCRLD(X509CRL x509crl, g2k g2kVar) throws Exception {
        c490 c490Var;
        try {
            s0x n = s0x.n(CertPathValidatorUtilities.getExtensionValue(x509crl, ISSUING_DISTRIBUTION_POINT));
            if (n != null && (c490Var = n.w) != null && g2kVar.b != null) {
                return new ReasonsMask(g2kVar.b.z()).intersect(new ReasonsMask(c490Var.z()));
            }
            if ((n == null || n.w == null) && g2kVar.b == null) {
                return ReasonsMask.allReasons;
            }
            return (g2kVar.b == null ? ReasonsMask.allReasons : new ReasonsMask(g2kVar.b.z())).intersect(n == null ? ReasonsMask.allReasons : new ReasonsMask(n.w.z()));
        } catch (Exception e) {
            h490.b(e, "Issuing distribution point extension could not be decoded.");
            return null;
        }
    }

    public static Set processCRLF(X509CRL x509crl, Object obj, X509Certificate x509Certificate, PublicKey publicKey, l490 l490Var) throws Exception {
        X509Certificate x509Certificate2 = x509Certificate;
        X509CertSelector x509CertSelector = new X509CertSelector();
        try {
            x509CertSelector.setSubject(PrincipalUtils.getIssuerPrincipal(x509crl).getEncoded());
            j490 j490Var = new j490((CertSelector) x509CertSelector.clone());
            try {
                List list = l490Var.c;
                PKIXParameters pKIXParameters = l490Var.a;
                Collection<X509Certificate> findCertificates = CertPathValidatorUtilities.findCertificates(j490Var, list);
                findCertificates.addAll(CertPathValidatorUtilities.findCertificates(j490Var, pKIXParameters.getCertStores()));
                findCertificates.add(x509Certificate2);
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                for (X509Certificate x509Certificate3 : findCertificates) {
                    if (x509Certificate3.equals(x509Certificate2)) {
                        arrayList.add(x509Certificate3);
                        arrayList2.add(publicKey);
                    } else {
                        try {
                            SunCertPathBuilder sunCertPathBuilder = new SunCertPathBuilder();
                            X509CertSelector x509CertSelector2 = new X509CertSelector();
                            x509CertSelector2.setCertificate(x509Certificate3);
                            new ArrayList();
                            new HashMap();
                            new ArrayList();
                            new HashMap();
                            Date date = l490Var.b;
                            ArrayList arrayList3 = new ArrayList(l490Var.c);
                            HashMap hashMap = new HashMap(l490Var.w);
                            ArrayList arrayList4 = new ArrayList(l490Var.x);
                            HashMap hashMap2 = new HashMap(l490Var.y);
                            boolean z = l490Var.z;
                            Set set = l490Var.A;
                            Collections.unmodifiableList(arrayList3);
                            Collections.unmodifiableMap(new HashMap(hashMap));
                            Collections.unmodifiableList(arrayList4);
                            Collections.unmodifiableMap(new HashMap(hashMap2));
                            Set unmodifiableSet = Collections.unmodifiableSet(set);
                            Collections.unmodifiableSet(new HashSet());
                            PKIXBuilderParameters pKIXBuilderParameters = new PKIXBuilderParameters((Set<TrustAnchor>) unmodifiableSet, x509CertSelector2);
                            pKIXBuilderParameters.setDate(new Date(date.getTime()));
                            pKIXBuilderParameters.setCertPathCheckers(pKIXParameters.getCertPathCheckers());
                            pKIXBuilderParameters.setCertStores(pKIXParameters.getCertStores());
                            pKIXBuilderParameters.setAnyPolicyInhibited(pKIXParameters.isAnyPolicyInhibited());
                            pKIXBuilderParameters.setExplicitPolicyRequired(pKIXParameters.isExplicitPolicyRequired());
                            pKIXBuilderParameters.setPolicyMappingInhibited(pKIXParameters.isPolicyMappingInhibited());
                            pKIXBuilderParameters.setRevocationEnabled(z);
                            pKIXBuilderParameters.setInitialPolicies(pKIXParameters.getInitialPolicies());
                            pKIXBuilderParameters.setSigProvider(pKIXParameters.getSigProvider());
                            boolean z2 = Platform.isAndroid;
                            PKIXBuilderParameters pKIXBuilderParameters2 = z2 ? (PKIXBuilderParameters) pKIXBuilderParameters.clone() : pKIXBuilderParameters;
                            if (z2) {
                                pKIXBuilderParameters2.addCertPathChecker(new AndroidExtKeyUsageCertPathChecker());
                            }
                            pKIXBuilderParameters.setRevocationEnabled(false);
                            List<? extends Certificate> certificates = sunCertPathBuilder.engineBuild(pKIXBuilderParameters2).getCertPath().getCertificates();
                            arrayList.add(x509Certificate3);
                            arrayList2.add(CertPathValidatorUtilities.getNextWorkingKey(certificates, 0, null));
                            x509Certificate2 = x509Certificate;
                        } catch (CertPathBuilderException e) {
                            throw new Exception("Internal error.", e);
                        } catch (CertPathValidatorException e2) {
                            throw new Exception("Public key of issuer certificate of CRL could not be retrieved.", e2);
                        } catch (Exception e3) {
                            kbs.g(e3.getMessage());
                            return null;
                        }
                    }
                }
                HashSet hashSet = new HashSet();
                AnnotatedException annotatedException = null;
                for (int i = 0; i < arrayList.size(); i++) {
                    boolean[] keyUsage = ((X509Certificate) arrayList.get(i)).getKeyUsage();
                    if (keyUsage == null || (keyUsage.length >= 7 && keyUsage[6])) {
                        hashSet.add(arrayList2.get(i));
                    } else {
                        annotatedException = new AnnotatedException("Issuer certificate key usage extension does not permit CRL signing.", null);
                    }
                }
                if (hashSet.isEmpty() && annotatedException == null) {
                    w511.s("Cannot find a valid issuer certificate.");
                    return null;
                }
                if (!hashSet.isEmpty() || annotatedException == null) {
                    return hashSet;
                }
                throw annotatedException;
            } catch (AnnotatedException e4) {
                h490.b(e4, "Issuer certificate for CRL cannot be searched.");
                return null;
            }
        } catch (IOException e5) {
            h490.b(e5, "Subject criteria for certificate selector to find issuer certificate for CRL could not be set.");
            return null;
        }
    }

    public static PublicKey processCRLG(X509CRL x509crl, Set set) throws Exception {
        Iterator it = set.iterator();
        Exception e = null;
        while (it.hasNext()) {
            PublicKey publicKey = (PublicKey) it.next();
            try {
                x509crl.verify(publicKey);
                return publicKey;
            } catch (Exception e2) {
                e = e2;
            }
        }
        h490.b(e, "Cannot verify CRL.");
        return null;
    }

    public static X509CRL processCRLH(Set set, PublicKey publicKey) throws Exception {
        Iterator it = set.iterator();
        Exception e = null;
        while (it.hasNext()) {
            X509CRL x509crl = (X509CRL) it.next();
            try {
                x509crl.verify(publicKey);
                return x509crl;
            } catch (Exception e2) {
                e = e2;
            }
        }
        if (e == null) {
            return null;
        }
        h490.b(e, "Cannot verify delta CRL.");
        return null;
    }

    public static void processCRLI(Date date, X509CRL x509crl, Object obj, CertStatus certStatus, l490 l490Var) throws Exception {
        JCPLogger.subEnter();
        l490Var.getClass();
        JCPLogger.subExit();
    }

    public static void processCRLJ(Date date, X509CRL x509crl, Object obj, CertStatus certStatus) throws Exception {
        JCPLogger.subEnter();
        if (certStatus.getCertStatus() == 11) {
            CertPathValidatorUtilities.getCertStatus(date, x509crl, obj, certStatus);
        }
        JCPLogger.subExit();
    }
}
