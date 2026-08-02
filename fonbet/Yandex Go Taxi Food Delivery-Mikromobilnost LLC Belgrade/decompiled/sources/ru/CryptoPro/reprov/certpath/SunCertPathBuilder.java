package ru.CryptoPro.reprov.certpath;

import defpackage.dy31;
import defpackage.er61;
import defpackage.kbs;
import defpackage.unr0;
import java.io.IOException;
import java.security.AccessController;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.PublicKey;
import java.security.cert.CertPathBuilderException;
import java.security.cert.CertPathBuilderResult;
import java.security.cert.CertPathBuilderSpi;
import java.security.cert.CertPathParameters;
import java.security.cert.CertPathValidatorException;
import java.security.cert.CertSelector;
import java.security.cert.CertStore;
import java.security.cert.CertStoreException;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.CollectionCertStoreParameters;
import java.security.cert.PKIXBuilderParameters;
import java.security.cert.PKIXCertPathChecker;
import java.security.cert.PKIXReason;
import java.security.cert.PolicyNode;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import ru.CryptoPro.AdES.evidence.crl.rfc3280.RFC3280CRLUtility;
import ru.CryptoPro.JCP.JCP;
import ru.CryptoPro.JCP.tools.JCPLogger;
import ru.CryptoPro.reprov.x509.AccessDescription;
import ru.CryptoPro.reprov.x509.AuthorityInfoAccessExtension;
import ru.CryptoPro.reprov.x509.PKIXExtensions;
import ru.CryptoPro.reprov.x509.X500Principal;

/* loaded from: classes4.dex */
public final class SunCertPathBuilder extends CertPathBuilderSpi {
    public PKIXBuilderParameters a;
    public final CertificateFactory b;
    public boolean c = false;
    public X500Principal d;
    public PolicyNode e;
    public TrustAnchor f;
    public PublicKey g;
    public X509CertSelector h;
    public ArrayList i;
    public final boolean j;

    class CertStoreComparator implements Comparator {
        @Override // java.util.Comparator
        public int compare(CertStore certStore, CertStore certStore2) {
            boolean z = Builder.f;
            return (certStore.getType().equals("Collection") || (certStore.getCertStoreParameters() instanceof CollectionCertStoreParameters)) ? -1 : 1;
        }
    }

    public SunCertPathBuilder() throws CertPathBuilderException {
        this.j = false;
        try {
            this.b = CertificateFactory.getInstance(JCP.CERTIFICATE_FACTORY_NAME);
            GetBooleanSecurityPropertyAction getBooleanSecurityPropertyAction = new GetBooleanSecurityPropertyAction();
            getBooleanSecurityPropertyAction.a = "com.sun.security.onlyCheckRevocationOfEECert";
            this.j = ((Boolean) AccessController.doPrivileged(getBooleanSecurityPropertyAction)).booleanValue();
        } catch (CertificateException e) {
            throw new CertPathBuilderException(e);
        }
    }

    public final JCPCertPathBuilderResult a(ArrayList arrayList, boolean z) {
        this.c = false;
        this.f = null;
        this.g = null;
        this.e = null;
        LinkedList linkedList = new LinkedList();
        try {
            b(arrayList, linkedList, z);
            try {
                if (!this.c) {
                    return null;
                }
                JCPLogger.finer("SunCertPathBuilder.engineBuild() pathCompleted");
                Collections.reverse(linkedList);
                return new JCPCertPathBuilderResult(this.b.generateCertPath(linkedList), this.f, this.e, this.g, new AdjacencyList(arrayList));
            } catch (Exception e) {
                JCPLogger.fine("SunCertPathBuilder.engineBuild() exception in wrap-up", (Throwable) e);
                throw new JCPCertPathBuilderException("unable to find valid certification path to requested target", e, new AdjacencyList(arrayList));
            }
        } catch (Exception e2) {
            JCPLogger.fine("SunCertPathBuilder.engineBuild() exception in build");
            throw new JCPCertPathBuilderException("unable to find valid certification path to requested target", e2, new AdjacencyList(arrayList));
        }
    }

    public final void b(ArrayList arrayList, LinkedList linkedList, boolean z) {
        JCPLogger.finer("SunCertPathBuilder.buildForward()...");
        ForwardState forwardState = new ForwardState();
        forwardState.x = true;
        forwardState.A = false;
        forwardState.initState(this.a.getCertPathCheckers());
        arrayList.clear();
        arrayList.add(new LinkedList());
        PKIXBuilderParameters pKIXBuilderParameters = this.a;
        boolean z2 = this.j;
        forwardState.crlChecker = new CrlRevocationChecker(null, pKIXBuilderParameters, z2);
        forwardState.y = new UntrustedChecker();
        c(this.d, forwardState, new ForwardBuilder(this.a, this.d, z, z2), arrayList, linkedList);
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x033f  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0483  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x048c  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x04b3  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x04b5  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0491  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0335  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01af A[LOOP:2: B:82:0x01a9->B:84:0x01af, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01d9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(X500Principal x500Principal, ForwardState forwardState, ForwardBuilder forwardBuilder, ArrayList arrayList, LinkedList linkedList) {
        X509CertSelector x509CertSelector;
        PKIXBuilderParameters pKIXBuilderParameters;
        Date date;
        ArrayList arrayList2;
        int i;
        BasicChecker basicChecker;
        int i2;
        PolicyNodeImpl policyNodeImpl;
        PolicyNodeImpl f;
        Set<String> supportedExtensions;
        int i3;
        Date date2;
        BasicChecker basicChecker2;
        boolean z;
        AuthorityInfoAccessExtension authorityInfoAccessExtension;
        List accessDescriptions;
        ForwardState forwardState2 = forwardState;
        ForwardBuilder forwardBuilder2 = forwardBuilder;
        ArrayList arrayList3 = arrayList;
        LinkedList linkedList2 = linkedList;
        JCPLogger.finerFormat("SunCertPathBuilder.depthFirstSearchForward({0}, {1})", x500Principal, forwardState);
        ArrayList arrayList4 = this.i;
        boolean z2 = forwardBuilder2.o;
        PKIXBuilderParameters pKIXBuilderParameters2 = forwardBuilder2.b;
        Date date3 = forwardBuilder2.d;
        X509CertSelector x509CertSelector2 = forwardBuilder2.e;
        JCPLogger.finer("ForwardBuilder.getMatchingCerts()...");
        TreeSet<X509Certificate> treeSet = new TreeSet(forwardBuilder2.n);
        if (forwardState2.isInitial()) {
            JCPLogger.finer("ForwardBuilder.getMatchingEECerts()...");
            if (forwardBuilder2.j == null) {
                X509CertSelector x509CertSelector3 = (X509CertSelector) x509CertSelector2.clone();
                forwardBuilder2.j = x509CertSelector3;
                x509CertSelector3.setCertificateValid(date3);
                if (pKIXBuilderParameters2.isExplicitPolicyRequired()) {
                    forwardBuilder2.j.setPolicy(forwardBuilder2.c());
                }
                forwardBuilder2.j.setBasicConstraints(-2);
            }
            forwardBuilder2.d(forwardBuilder2.j, arrayList4, treeSet, z2);
        }
        JCPLogger.finer("ForwardBuilder.getMatchingCACerts()...");
        int size = treeSet.size();
        if (forwardState2.isInitial()) {
            if (x509CertSelector2.getBasicConstraints() != -2) {
                JCPLogger.finer("ForwardBuilder.getMatchingCACerts(): ca is target");
                if (forwardBuilder2.l == null) {
                    X509CertSelector x509CertSelector4 = (X509CertSelector) x509CertSelector2.clone();
                    forwardBuilder2.l = x509CertSelector4;
                    x509CertSelector4.setCertificateValid(date3);
                    if (pKIXBuilderParameters2.isExplicitPolicyRequired()) {
                        forwardBuilder2.l.setPolicy(forwardBuilder2.c());
                    }
                }
                forwardBuilder2.l.setBasicConstraints(forwardState2.w);
                x509CertSelector = forwardBuilder2.l;
            }
            boolean z3 = true;
            List<Vertex> list = (List) unr0.k(1, arrayList3);
            for (X509Certificate x509Certificate : treeSet) {
                Vertex vertex = new Vertex();
                vertex.a = x509Certificate;
                vertex.b = -1;
                list.add(vertex);
            }
            JCPLogger.finer("SunCertPathBuilder.depthFirstSearchForward(): certs.size=", Integer.valueOf(list.size()));
            for (Vertex vertex2 : list) {
                ForwardState forwardState3 = (ForwardState) forwardState2.clone();
                X509Certificate x509Certificate2 = (X509Certificate) vertex2.getCertificate();
                try {
                    forwardBuilder2.f(x509Certificate2, forwardState3, linkedList2);
                    for (TrustAnchor trustAnchor : forwardBuilder2.i) {
                        if (trustAnchor.getTrustedCert() == null) {
                            javax.security.auth.x500.X500Principal ca = trustAnchor.getCA();
                            PublicKey cAPublicKey = trustAnchor.getCAPublicKey();
                            if (ca == null || cAPublicKey == null || !ca.equals(x509Certificate2.getSubjectX500Principal()) || !cAPublicKey.equals(x509Certificate2.getPublicKey())) {
                                if (ca != null && ca.equals(x509Certificate2.getIssuerX500Principal())) {
                                    if (pKIXBuilderParameters2.isRevocationEnabled()) {
                                        try {
                                            new CrlRevocationChecker(trustAnchor, pKIXBuilderParameters2, forwardBuilder2.p).check(x509Certificate2, trustAnchor.getCAPublicKey(), true);
                                        } catch (CertPathValidatorException e) {
                                            JCPLogger.ignoredException(e);
                                        }
                                    }
                                    try {
                                        x509Certificate2.verify(trustAnchor.getCAPublicKey(), pKIXBuilderParameters2.getSigProvider());
                                    } catch (InvalidKeyException | Exception e2) {
                                        JCPLogger.ignoredException(e2);
                                        pKIXBuilderParameters2 = pKIXBuilderParameters2;
                                        date3 = date3;
                                    }
                                }
                            }
                            forwardBuilder2.m = trustAnchor;
                            JCPLogger.finer("SunCertPathBuilder.depthFirstSearchForward(): commencing final verification");
                            arrayList2 = new ArrayList(linkedList2);
                            if (forwardBuilder2.m.getTrustedCert() == null) {
                            }
                            HashSet hashSet = new HashSet(1);
                            hashSet.add(RFC3280CRLUtility.ANY_POLICY);
                            PolicyChecker policyChecker = new PolicyChecker(this.a.getInitialPolicies(), arrayList2.size(), this.a.isExplicitPolicyRequired(), this.a.isPolicyMappingInhibited(), this.a.isAnyPolicyInhibited(), this.a.getPolicyQualifiersRejected(), new PolicyNodeImpl(null, RFC3280CRLUtility.ANY_POLICY, null, false, hashSet, false));
                            ArrayList arrayList5 = new ArrayList(this.a.getCertPathCheckers());
                            arrayList5.add(0, policyChecker);
                            arrayList5.add(1, new AlgorithmChecker(forwardBuilder2.m));
                            if (forwardState3.keyParamsNeeded()) {
                            }
                            i2 = 0;
                            while (i2 < arrayList2.size()) {
                            }
                            JCPLogger.finer("SunCertPathBuilder.depthFirstSearchForward(): final verification succeeded - path completed!");
                            this.c = true;
                            if (forwardBuilder2.m.getTrustedCert() == null) {
                            }
                            this.f = forwardBuilder2.m;
                            if (basicChecker == null) {
                            }
                            this.g = basicChecker == null ? basicChecker.z : (linkedList2.size() == 0 ? forwardBuilder2.m.getTrustedCert() : (Certificate) linkedList2.get(linkedList2.size() - 1)).getPublicKey();
                            policyNodeImpl = policyChecker.z;
                            if (policyNodeImpl != null) {
                            }
                            this.e = f;
                            return;
                        }
                        if (x509Certificate2.equals(trustAnchor.getTrustedCert())) {
                            forwardBuilder2.m = trustAnchor;
                            JCPLogger.finer("SunCertPathBuilder.depthFirstSearchForward(): commencing final verification");
                            arrayList2 = new ArrayList(linkedList2);
                            if (forwardBuilder2.m.getTrustedCert() == null) {
                                arrayList2.add(0, x509Certificate2);
                            }
                            HashSet hashSet2 = new HashSet(1);
                            hashSet2.add(RFC3280CRLUtility.ANY_POLICY);
                            PolicyChecker policyChecker2 = new PolicyChecker(this.a.getInitialPolicies(), arrayList2.size(), this.a.isExplicitPolicyRequired(), this.a.isPolicyMappingInhibited(), this.a.isAnyPolicyInhibited(), this.a.getPolicyQualifiersRejected(), new PolicyNodeImpl(null, RFC3280CRLUtility.ANY_POLICY, null, false, hashSet2, false));
                            ArrayList arrayList52 = new ArrayList(this.a.getCertPathCheckers());
                            arrayList52.add(0, policyChecker2);
                            arrayList52.add(1, new AlgorithmChecker(forwardBuilder2.m));
                            if (forwardState3.keyParamsNeeded()) {
                                i = 2;
                                basicChecker = null;
                            } else {
                                PublicKey publicKey = x509Certificate2.getPublicKey();
                                if (forwardBuilder2.m.getTrustedCert() == null) {
                                    publicKey = forwardBuilder2.m.getCAPublicKey();
                                    JCPLogger.finer("SunCertPathBuilder.depthFirstSearchForward using buildParams public key: ", publicKey);
                                }
                                TrustAnchor trustAnchor2 = new TrustAnchor(x509Certificate2.getSubjectX500Principal(), publicKey, (byte[]) null);
                                BasicChecker basicChecker3 = new BasicChecker(trustAnchor2, date3, this.a.getSigProvider());
                                arrayList52.add(2, basicChecker3);
                                if (this.a.isRevocationEnabled()) {
                                    basicChecker2 = basicChecker3;
                                    arrayList52.add(3, new CrlRevocationChecker(trustAnchor2, this.a, this.j));
                                    i = 4;
                                } else {
                                    basicChecker2 = basicChecker3;
                                    i = 3;
                                }
                                basicChecker = basicChecker2;
                            }
                            i2 = 0;
                            while (i2 < arrayList2.size()) {
                                X509Certificate x509Certificate3 = (X509Certificate) arrayList2.get(i2);
                                ArrayList arrayList6 = arrayList2;
                                int i4 = i2;
                                JCPLogger.finer("current subject = ", x509Certificate3.getSubjectX500Principal());
                                Set<String> criticalExtensionOIDs = x509Certificate3.getCriticalExtensionOIDs();
                                if (criticalExtensionOIDs == null) {
                                    criticalExtensionOIDs = Collections.EMPTY_SET;
                                }
                                PKIXBuilderParameters pKIXBuilderParameters3 = pKIXBuilderParameters2;
                                int i5 = 0;
                                while (i5 < arrayList52.size()) {
                                    PKIXCertPathChecker pKIXCertPathChecker = (PKIXCertPathChecker) arrayList52.get(i5);
                                    if (i5 < i || !pKIXCertPathChecker.isForwardCheckingSupported()) {
                                        if (i4 == 0) {
                                            date2 = date3;
                                            pKIXCertPathChecker.init(false);
                                            if (i5 < i || !(pKIXCertPathChecker instanceof AlgorithmChecker)) {
                                                i3 = i5;
                                            } else {
                                                i3 = i5;
                                                ((AlgorithmChecker) pKIXCertPathChecker).b(forwardBuilder2.m);
                                            }
                                        } else {
                                            i3 = i5;
                                            date2 = date3;
                                        }
                                        try {
                                            pKIXCertPathChecker.check(x509Certificate3, criticalExtensionOIDs);
                                        } catch (CertPathValidatorException e3) {
                                            JCPLogger.subThrown("SunCertPathBuilder.depthFirstSearchForward(): final verification failed: ", e3);
                                            vertex2.c = e3;
                                            forwardState2 = forwardState;
                                            pKIXBuilderParameters2 = pKIXBuilderParameters3;
                                            date3 = date2;
                                            z3 = true;
                                        }
                                    } else {
                                        i3 = i5;
                                        date2 = date3;
                                    }
                                    i5 = i3 + 1;
                                    date3 = date2;
                                }
                                Date date4 = date3;
                                for (PKIXCertPathChecker pKIXCertPathChecker2 : this.a.getCertPathCheckers()) {
                                    if (pKIXCertPathChecker2.isForwardCheckingSupported() && (supportedExtensions = pKIXCertPathChecker2.getSupportedExtensions()) != null) {
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
                                        dy31.r(str);
                                        return;
                                    }
                                }
                                i2 = i4 + 1;
                                arrayList2 = arrayList6;
                                pKIXBuilderParameters2 = pKIXBuilderParameters3;
                                date3 = date4;
                            }
                            JCPLogger.finer("SunCertPathBuilder.depthFirstSearchForward(): final verification succeeded - path completed!");
                            this.c = true;
                            if (forwardBuilder2.m.getTrustedCert() == null) {
                                linkedList2.addFirst(x509Certificate2);
                            }
                            this.f = forwardBuilder2.m;
                            this.g = basicChecker == null ? basicChecker.z : (linkedList2.size() == 0 ? forwardBuilder2.m.getTrustedCert() : (Certificate) linkedList2.get(linkedList2.size() - 1)).getPublicKey();
                            policyNodeImpl = policyChecker2.z;
                            if (policyNodeImpl != null) {
                                f = null;
                            } else {
                                f = policyNodeImpl.f(null);
                                f.g();
                            }
                            this.e = f;
                            return;
                        }
                    }
                    pKIXBuilderParameters = pKIXBuilderParameters2;
                    date = date3;
                    linkedList2.addFirst(x509Certificate2);
                    forwardState3.updateState(x509Certificate2);
                    arrayList3.add(new LinkedList());
                    vertex2.b = arrayList3.size() - 1;
                    c(new X500Principal(x509Certificate2.getIssuerX500Principal().getEncoded()), forwardState3, forwardBuilder2, arrayList3, linkedList2);
                } catch (GeneralSecurityException e4) {
                    JCPLogger.ignoredException(e4);
                    vertex2.c = e4;
                    forwardState2 = forwardState;
                    forwardBuilder2 = forwardBuilder;
                    arrayList3 = arrayList;
                    linkedList2 = linkedList;
                }
                if (this.c) {
                    return;
                }
                JCPLogger.finer("SunCertPathBuilder.depthFirstSearchForward(): backtracking");
                linkedList.removeFirst();
                forwardState2 = forwardState;
                forwardBuilder2 = forwardBuilder;
                arrayList3 = arrayList;
                linkedList2 = linkedList;
                z3 = true;
                pKIXBuilderParameters2 = pKIXBuilderParameters;
                date3 = date;
            }
        }
        if (forwardBuilder2.k == null) {
            X509CertSelector x509CertSelector5 = new X509CertSelector();
            forwardBuilder2.k = x509CertSelector5;
            x509CertSelector5.setCertificateValid(date3);
            if (pKIXBuilderParameters2.isExplicitPolicyRequired()) {
                forwardBuilder2.k.setPolicy(forwardBuilder2.c());
            }
        }
        forwardBuilder2.k.setSubject(forwardState2.a.getEncoded());
        X509CertSelector x509CertSelector6 = forwardBuilder2.k;
        HashSet hashSet3 = forwardState2.c;
        CertPathHelper.a.getClass();
        x509CertSelector6.getClass();
        x509CertSelector6.K = Collections.EMPTY_SET;
        x509CertSelector6.L = hashSet3;
        forwardBuilder2.k.setBasicConstraints(forwardState2.w);
        x509CertSelector = forwardBuilder2.k;
        if (!forwardState2.isInitial()) {
            x509CertSelector2 = new X509CertSelector();
            x509CertSelector2.setSubject(forwardState2.a.getEncoded());
        }
        Iterator it = forwardBuilder2.g.iterator();
        while (true) {
            if (it.hasNext()) {
                X509Certificate x509Certificate4 = (X509Certificate) it.next();
                if (x509CertSelector2.match(x509Certificate4)) {
                    JCPLogger.finer("ForwardBuilder.getMatchingCACerts: found matching trust anchor");
                    if (treeSet.add(x509Certificate4) && !z2) {
                        break;
                    }
                }
            } else if ((!forwardState2.isInitial() && pKIXBuilderParameters2.getMaxPathLength() != -1 && pKIXBuilderParameters2.getMaxPathLength() <= forwardState2.w) || !forwardBuilder2.d(x509CertSelector, arrayList4, treeSet, z2) || z2) {
                if (!forwardState2.isInitial() && (z = Builder.f) && (authorityInfoAccessExtension = forwardState2.b.getAuthorityInfoAccessExtension()) != null && z && (accessDescriptions = authorityInfoAccessExtension.getAccessDescriptions()) != null && !accessDescriptions.isEmpty()) {
                    Iterator it2 = accessDescriptions.iterator();
                    while (it2.hasNext()) {
                        CertStore b = URICertStore.b((AccessDescription) it2.next());
                        if (b != null) {
                            try {
                                if (treeSet.addAll(b.getCertificates(forwardBuilder2.k)) && !z2) {
                                    break;
                                }
                            } catch (CertStoreException e5) {
                                JCPLogger.subThrown("exception getting certs from CertStore:", e5);
                            }
                        }
                    }
                }
                JCPLogger.finerFormat("ForwardBuilder.getMatchingCACerts: found {0} CA certs", Integer.valueOf(treeSet.size() - size));
            }
        }
        boolean z32 = true;
        List<Vertex> list2 = (List) unr0.k(1, arrayList3);
        while (r2.hasNext()) {
        }
        JCPLogger.finer("SunCertPathBuilder.depthFirstSearchForward(): certs.size=", Integer.valueOf(list2.size()));
        while (r10.hasNext()) {
        }
    }

    @Override // java.security.cert.CertPathBuilderSpi
    public CertPathBuilderResult engineBuild(CertPathParameters certPathParameters) throws CertPathBuilderException, InvalidAlgorithmParameterException {
        X500Principal x500Principal;
        X509Certificate certificate;
        if (!(certPathParameters instanceof PKIXBuilderParameters)) {
            kbs.t("inappropriate parameter type, must be an instance of PKIXBuilderParameters");
            return null;
        }
        PKIXBuilderParameters pKIXBuilderParameters = (PKIXBuilderParameters) certPathParameters;
        this.a = pKIXBuilderParameters;
        Iterator<TrustAnchor> it = pKIXBuilderParameters.getTrustAnchors().iterator();
        while (it.hasNext()) {
            if (it.next().getNameConstraints() != null) {
                kbs.t("name constraints in trust anchor not supported");
                return null;
            }
        }
        CertSelector targetCertConstraints = this.a.getTargetCertConstraints();
        if (!(targetCertConstraints instanceof java.security.cert.X509CertSelector)) {
            kbs.t("the targetCertConstraints parameter must be an X509CertSelector");
            return null;
        }
        try {
            X509CertSelector x509CertSelector = new X509CertSelector((java.security.cert.X509CertSelector) targetCertConstraints);
            this.h = x509CertSelector;
            if (x509CertSelector.getSubject() != null) {
                this.d = new X500Principal(this.h.getSubject().getEncoded());
            }
            if (this.d == null && (certificate = this.h.getCertificate()) != null && certificate.getSubjectX500Principal() != null) {
                this.d = new X500Principal(certificate.getSubjectX500Principal().getEncoded());
            }
            ArrayList arrayList = new ArrayList(this.a.getCertStores());
            this.i = arrayList;
            Collections.sort(arrayList, new CertStoreComparator());
            if (this.d == null) {
                ArrayList arrayList2 = this.i;
                X509CertSelector x509CertSelector2 = this.h;
                Iterator it2 = arrayList2.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        x500Principal = null;
                        break;
                    }
                    try {
                        Collection<? extends Certificate> certificates = ((CertStore) it2.next()).getCertificates(x509CertSelector2);
                        if (certificates.isEmpty()) {
                            continue;
                        } else {
                            X509Certificate x509Certificate = (X509Certificate) certificates.iterator().next();
                            if (x509Certificate.getSubjectX500Principal() != null) {
                                x500Principal = new X500Principal(x509Certificate.getSubjectX500Principal().getEncoded());
                                break;
                            }
                            continue;
                        }
                    } catch (CertStoreException e) {
                        JCPLogger.warning("SunCertPathBuilder.getTargetSubjectDN: non-fatal exception retrieving certs: ", (Throwable) e);
                    }
                }
                this.d = x500Principal;
            }
            if (this.d == null) {
                kbs.t("Could not determine unique target subject");
                return null;
            }
            ArrayList arrayList3 = new ArrayList();
            JCPCertPathBuilderResult a = a(arrayList3, false);
            if (a == null) {
                JCPLogger.finer("SunCertPathBuilder.engineBuild: 2nd pass");
                arrayList3.clear();
                a = a(arrayList3, true);
                if (a == null) {
                    throw new JCPCertPathBuilderException("unable to find valid certification path to requested target", new AdjacencyList(arrayList3));
                }
            }
            return a;
        } catch (IOException e2) {
            throw new InvalidAlgorithmParameterException("inappropriate selector parameters", e2);
        }
    }
}
