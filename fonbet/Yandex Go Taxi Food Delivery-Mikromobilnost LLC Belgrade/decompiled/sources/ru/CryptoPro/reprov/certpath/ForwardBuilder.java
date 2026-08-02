package ru.CryptoPro.reprov.certpath;

import defpackage.dy31;
import defpackage.er61;
import defpackage.w511;
import java.security.GeneralSecurityException;
import java.security.cert.CertPathValidatorException;
import java.security.cert.PKIXBuilderParameters;
import java.security.cert.PKIXCertPathChecker;
import java.security.cert.PKIXReason;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCP.tools.JCPLogger;
import ru.CryptoPro.reprov.x509.PKIXExtensions;
import ru.CryptoPro.reprov.x509.X500Name;
import ru.CryptoPro.reprov.x509.X500Principal;
import ru.CryptoPro.reprov.x509.X509CertImpl;

/* loaded from: classes4.dex */
class ForwardBuilder extends Builder {
    public final HashSet g;
    public final HashSet h;
    public final Set i;
    public X509CertSelector j;
    public X509CertSelector k;
    public X509CertSelector l;
    public TrustAnchor m;
    public final Comparator n;
    public final boolean o;
    public final boolean p;

    class PKIXCertComparator implements Comparator {
        public final Set a;

        public PKIXCertComparator(HashSet hashSet) {
            this.a = hashSet;
        }

        /* JADX WARN: Code restructure failed: missing block: B:64:0x0190, code lost:
        
            if (r1 != null) goto L63;
         */
        /* JADX WARN: Code restructure failed: missing block: B:65:?, code lost:
        
            return 1;
         */
        @Override // java.util.Comparator
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public int compare(X509Certificate x509Certificate, X509Certificate x509Certificate2) {
            if (x509Certificate.equals(x509Certificate2)) {
                return 0;
            }
            X500Principal x500Principal = new X500Principal(x509Certificate.getIssuerX500Principal().getEncoded());
            X500Principal x500Principal2 = new X500Principal(x509Certificate2.getIssuerX500Principal().getEncoded());
            X500Name asX500Name = X500Name.asX500Name(x500Principal);
            X500Name asX500Name2 = X500Name.asX500Name(x500Principal2);
            JCPLogger.finerFormat("{0} o1 Issuer: {1}", "PKIXCertComparator.compare()", x500Principal);
            JCPLogger.finerFormat("{0} o2 Issuer: {1}", "PKIXCertComparator.compare()", x500Principal2);
            JCPLogger.finer("PKIXCertComparator.compare()", " MATCH TRUSTED SUBJECT TEST...");
            Set set = this.a;
            boolean contains = set.contains(x500Principal);
            boolean contains2 = set.contains(x500Principal2);
            JCPLogger.finerFormat("{0} m1: {1}", "PKIXCertComparator.compare()", Boolean.valueOf(contains));
            JCPLogger.finerFormat("{0} m2: {1}", "PKIXCertComparator.compare()", Boolean.valueOf(contains2));
            if ((!contains || !contains2) && !contains) {
                if (contains2) {
                    return 1;
                }
                JCPLogger.finer("PKIXCertComparator.compare()", " NAMING DESCENDANT TEST...");
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    X500Name asX500Name3 = X500Name.asX500Name((X500Principal) it.next());
                    int b = Builder.b(asX500Name3, asX500Name, -1);
                    int b2 = Builder.b(asX500Name3, asX500Name2, -1);
                    JCPLogger.finerFormat("{0} distanceTto1: {1}", "PKIXCertComparator.compare()", Integer.valueOf(b));
                    JCPLogger.finerFormat("{0} distanceTto2 {1}", "PKIXCertComparator.compare()", Integer.valueOf(b2));
                    if (b > 0 || b2 > 0) {
                        if (b != b2 && ((b <= 0 || b2 > 0) && ((b <= 0 && b2 > 0) || b >= b2))) {
                            return 1;
                        }
                    }
                }
                JCPLogger.finer("PKIXCertComparator.compare()", " NAMING ANCESTOR TEST...");
                Iterator it2 = set.iterator();
                while (it2.hasNext()) {
                    X500Name asX500Name4 = X500Name.asX500Name((X500Principal) it2.next());
                    int b3 = Builder.b(asX500Name4, asX500Name, Integer.MAX_VALUE);
                    int b4 = Builder.b(asX500Name4, asX500Name2, Integer.MAX_VALUE);
                    JCPLogger.finerFormat("{0} distanceTto1: {1}", "PKIXCertComparator.compare()", Integer.valueOf(b3));
                    JCPLogger.finerFormat("{0} distanceTto2 {1}", "PKIXCertComparator.compare()", Integer.valueOf(b4));
                    if (b3 < 0 || b4 < 0) {
                        if (b3 != b4 && ((b3 >= 0 || b4 < 0) && ((b3 >= 0 && b4 < 0) || b3 <= b4))) {
                            return 1;
                        }
                    }
                }
                JCPLogger.finer("PKIXCertComparator.compare()", " SAME NAMESPACE AS TRUSTED TEST...");
                Iterator it3 = set.iterator();
                while (true) {
                    if (it3.hasNext()) {
                        X500Name asX500Name5 = X500Name.asX500Name((X500Principal) it3.next());
                        X500Name commonAncestor = asX500Name5.commonAncestor(asX500Name);
                        X500Name commonAncestor2 = asX500Name5.commonAncestor(asX500Name2);
                        JCPLogger.finerFormat("{0} tAo1: {1}", "PKIXCertComparator.compare()", String.valueOf(commonAncestor));
                        JCPLogger.finerFormat("{0} tAo2 {1}", "PKIXCertComparator.compare()", String.valueOf(commonAncestor2));
                        if (commonAncestor != null || commonAncestor2 != null) {
                            if (commonAncestor == null || commonAncestor2 == null) {
                                break;
                            }
                            int e = Builder.e(asX500Name5, asX500Name);
                            int e2 = Builder.e(asX500Name5, asX500Name2);
                            JCPLogger.finerFormat("{0} hopsTto1: {1}", "PKIXCertComparator.compare()", Integer.valueOf(e));
                            JCPLogger.finerFormat("{0} hopsTto2 {1}", "PKIXCertComparator.compare()", Integer.valueOf(e2));
                            if (e != e2) {
                                if (e > e2) {
                                    return 1;
                                }
                            }
                        }
                    } else {
                        JCPLogger.finer("PKIXCertComparator.compare()", " CERT ISSUER/SUBJECT COMPARISON TEST...");
                        X500Principal x500Principal3 = new X500Principal(x509Certificate.getSubjectX500Principal().getEncoded());
                        X500Principal x500Principal4 = new X500Principal(x509Certificate2.getSubjectX500Principal().getEncoded());
                        X500Name asX500Name6 = X500Name.asX500Name(x500Principal3);
                        X500Name asX500Name7 = X500Name.asX500Name(x500Principal4);
                        JCPLogger.finerFormat("{0} o1 Subject: {1}", "PKIXCertComparator.compare()", x500Principal3);
                        JCPLogger.finerFormat("{0} o2 Subject {1}", "PKIXCertComparator.compare()", x500Principal4);
                        int b5 = Builder.b(asX500Name6, asX500Name, Integer.MAX_VALUE);
                        int b6 = Builder.b(asX500Name7, asX500Name2, Integer.MAX_VALUE);
                        JCPLogger.finerFormat("{0} distanceStoI1: {1}", "PKIXCertComparator.compare()", Integer.valueOf(b5));
                        JCPLogger.finerFormat("{0} distanceStoI2 {1}", "PKIXCertComparator.compare()", Integer.valueOf(b6));
                        if (b6 <= b5) {
                            if (b6 < b5) {
                                return 1;
                            }
                            JCPLogger.finer("PKIXCertComparator.compare()", " no tests matched; RETURN 0");
                            return -1;
                        }
                    }
                }
            }
            return -1;
        }
    }

    public ForwardBuilder(PKIXBuilderParameters pKIXBuilderParameters, X500Principal x500Principal, boolean z, boolean z2) {
        super(pKIXBuilderParameters, x500Principal);
        this.o = true;
        this.p = false;
        Set<TrustAnchor> trustAnchors = pKIXBuilderParameters.getTrustAnchors();
        this.i = trustAnchors;
        this.g = new HashSet(trustAnchors.size());
        this.h = new HashSet(trustAnchors.size());
        for (TrustAnchor trustAnchor : trustAnchors) {
            X509Certificate trustedCert = trustAnchor.getTrustedCert();
            if (trustedCert != null) {
                this.g.add(trustedCert);
                if (trustedCert.getSubjectX500Principal() != null) {
                    this.h.add(new X500Principal(trustedCert.getSubjectX500Principal().getEncoded()));
                }
            } else if (trustAnchor.getCA() != null) {
                this.h.add(new X500Principal(trustAnchor.getCA().getEncoded()));
            }
        }
        this.n = new PKIXCertComparator(this.h);
        this.o = z;
        this.p = z2;
    }

    public final void f(X509Certificate x509Certificate, State state, LinkedList linkedList) {
        Collection<?> supportedExtensions;
        JCPLogger.finer("ForwardBuilder.verifyCert(SN: " + x509Certificate.getSerialNumber() + "\n  Issuer: " + x509Certificate.getIssuerX500Principal() + ")\n  Subject: " + x509Certificate.getSubjectX500Principal() + Extension.C_BRAKE);
        ForwardState forwardState = (ForwardState) state;
        forwardState.y.check(x509Certificate, Collections.EMPTY_SET);
        Iterator it = linkedList.iterator();
        boolean z = false;
        while (true) {
            boolean hasNext = it.hasNext();
            PKIXBuilderParameters pKIXBuilderParameters = this.b;
            if (!hasNext) {
                boolean contains = this.g.contains(x509Certificate);
                if (!contains) {
                    Set<String> criticalExtensionOIDs = x509Certificate.getCriticalExtensionOIDs();
                    if (criticalExtensionOIDs == null) {
                        criticalExtensionOIDs = Collections.EMPTY_SET;
                    }
                    Iterator it2 = forwardState.z.iterator();
                    while (it2.hasNext()) {
                        ((PKIXCertPathChecker) it2.next()).check(x509Certificate, criticalExtensionOIDs);
                    }
                    for (PKIXCertPathChecker pKIXCertPathChecker : pKIXBuilderParameters.getCertPathCheckers()) {
                        if (!pKIXCertPathChecker.isForwardCheckingSupported() && (supportedExtensions = pKIXCertPathChecker.getSupportedExtensions()) != null) {
                            criticalExtensionOIDs.removeAll(supportedExtensions);
                        }
                    }
                    if (!criticalExtensionOIDs.isEmpty()) {
                        criticalExtensionOIDs.remove(PKIXExtensions.BasicConstraints_Id.toString());
                        criticalExtensionOIDs.remove(PKIXExtensions.NameConstraints_Id.toString());
                        criticalExtensionOIDs.remove(PKIXExtensions.CertificatePolicies_Id.toString());
                        criticalExtensionOIDs.remove(PKIXExtensions.PolicyMappings_Id.toString());
                        criticalExtensionOIDs.remove(PKIXExtensions.PolicyConstraints_Id.toString());
                        criticalExtensionOIDs.remove(PKIXExtensions.InhibitAnyPolicy_Id.toString());
                        criticalExtensionOIDs.remove(PKIXExtensions.SubjectAlternativeName_Id.toString());
                        criticalExtensionOIDs.remove(PKIXExtensions.KeyUsage_Id.toString());
                        criticalExtensionOIDs.remove(PKIXExtensions.ExtendedKeyUsage_Id.toString());
                        if (!criticalExtensionOIDs.isEmpty()) {
                            String str = "Unrecognized critical extension(s): " + criticalExtensionOIDs;
                            JCPLogger.fine(str);
                            if (er61.a()) {
                                throw new CertPathValidatorException(str, null, null, -1, PKIXReason.UNRECOGNIZED_CRIT_EXT);
                            }
                            w511.y(str);
                            return;
                        }
                    }
                }
                if (forwardState.isInitial()) {
                    return;
                }
                if (!contains) {
                    if (x509Certificate.getBasicConstraints() == -1) {
                        w511.y("cert is NOT a CA cert");
                        return;
                    }
                    KeyChecker.a(x509Certificate);
                }
                if (pKIXBuilderParameters.isRevocationEnabled() && CrlRevocationChecker.e(x509Certificate) && !forwardState.keyParamsNeeded()) {
                    forwardState.crlChecker.check(forwardState.b, x509Certificate.getPublicKey(), true);
                }
                if (forwardState.keyParamsNeeded()) {
                    return;
                }
                try {
                    forwardState.b.verify(x509Certificate.getPublicKey(), pKIXBuilderParameters.getSigProvider());
                    return;
                } catch (Exception e) {
                    throw new GeneralSecurityException(e);
                }
            }
            X509Certificate x509Certificate2 = (X509Certificate) it.next();
            if (X509CertImpl.toImpl(x509Certificate2).getPolicyMappingsExtension() != null) {
                z = true;
            }
            JCPLogger.finer("policyMappingFound = ", Boolean.valueOf(z));
            if (!x509Certificate.equals(x509Certificate2) || (!pKIXBuilderParameters.isPolicyMappingInhibited() && z)) {
            }
        }
        JCPLogger.finer("loop detected!!");
        dy31.r("loop detected");
    }
}
