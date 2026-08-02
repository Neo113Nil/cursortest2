package ru.CryptoPro.reprov.certpath;

import defpackage.dy31;
import defpackage.er61;
import defpackage.ny61;
import java.io.IOException;
import java.security.cert.CertPathValidatorException;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.PKIXCertPathChecker;
import java.security.cert.PKIXReason;
import java.security.cert.X509Certificate;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import ru.CryptoPro.AdES.evidence.crl.rfc3280.RFC3280CRLUtility;
import ru.CryptoPro.JCP.tools.JCPLogger;
import ru.CryptoPro.reprov.x509.CertificatePoliciesExtension;
import ru.CryptoPro.reprov.x509.CertificatePolicyMap;
import ru.CryptoPro.reprov.x509.InhibitAnyPolicyExtension;
import ru.CryptoPro.reprov.x509.PKIXExtensions;
import ru.CryptoPro.reprov.x509.PolicyConstraintsExtension;
import ru.CryptoPro.reprov.x509.PolicyInformation;
import ru.CryptoPro.reprov.x509.PolicyMappingsExtension;
import ru.CryptoPro.reprov.x509.X509CertImpl;

/* loaded from: classes4.dex */
class PolicyChecker extends PKIXCertPathChecker {
    public static Set E;
    public int A;
    public int B;
    public int C;
    public int D;
    public final HashSet a;
    public final int b;
    public final boolean c;
    public final boolean w;
    public final boolean x;
    public final boolean y;
    public PolicyNodeImpl z;

    public PolicyChecker(Set set, int i, boolean z, boolean z2, boolean z3, boolean z4, PolicyNodeImpl policyNodeImpl) {
        if (set.isEmpty()) {
            HashSet hashSet = new HashSet(1);
            this.a = hashSet;
            hashSet.add(RFC3280CRLUtility.ANY_POLICY);
        } else {
            this.a = new HashSet(set);
        }
        this.b = i;
        this.c = z;
        this.w = z2;
        this.x = z3;
        this.y = z4;
        this.z = policyNodeImpl;
        init(false);
    }

    public static int a(int i, X509CertImpl x509CertImpl) {
        if (i > 0 && !X509CertImpl.isSelfIssued(x509CertImpl)) {
            i--;
        }
        try {
            PolicyConstraintsExtension policyConstraintsExtension = x509CertImpl.getPolicyConstraintsExtension();
            if (policyConstraintsExtension != null) {
                Integer num = (Integer) policyConstraintsExtension.get(PolicyConstraintsExtension.INHIBIT);
                int intValue = num.intValue();
                JCPLogger.finer("PolicyChecker.mergePolicyMapping() inhibit Index from cert = ", num);
                if (intValue != -1 && (i == -1 || intValue < i)) {
                    return intValue;
                }
            }
            return i;
        } catch (Exception e) {
            JCPLogger.subThrown("PolicyChecker.mergePolicyMapping unexpected exception", e);
            throw new CertPathValidatorException(e);
        }
    }

    public static int b(int i, X509CertImpl x509CertImpl, boolean z) {
        if (i > 0 && !X509CertImpl.isSelfIssued(x509CertImpl)) {
            i--;
        }
        try {
            PolicyConstraintsExtension policyConstraintsExtension = x509CertImpl.getPolicyConstraintsExtension();
            if (policyConstraintsExtension != null) {
                Integer num = (Integer) policyConstraintsExtension.get(PolicyConstraintsExtension.REQUIRE);
                int intValue = num.intValue();
                JCPLogger.finer("PolicyChecker.mergeExplicitPolicy() require Index from cert = ", num);
                if (z ? intValue == 0 : !(intValue == -1 || (i != -1 && intValue >= i))) {
                    return intValue;
                }
            }
            return i;
        } catch (Exception e) {
            JCPLogger.subThrown("PolicyChecker.mergeExplicitPolicy unexpected exception", e);
            throw new CertPathValidatorException(e);
        }
    }

    public static boolean c(int i, boolean z, PolicyNodeImpl policyNodeImpl, String str, Set set, boolean z2) {
        HashSet<PolicyNodeImpl> e;
        boolean z3;
        Set set2;
        String str2;
        JCPLogger.finer("PolicyChecker.processParents(): matchAny = ", Boolean.valueOf(z2));
        int i2 = i - 1;
        if (str.equals(RFC3280CRLUtility.ANY_POLICY)) {
            e = new HashSet();
            policyNodeImpl.c(i2, e);
        } else {
            e = policyNodeImpl.e(i2, str, z2);
        }
        boolean z4 = false;
        for (PolicyNodeImpl policyNodeImpl2 : e) {
            JCPLogger.finer("PolicyChecker.processParents() found parent:\n", policyNodeImpl2.h());
            policyNodeImpl2.getValidPolicy();
            if (str.equals(RFC3280CRLUtility.ANY_POLICY)) {
                for (String str3 : policyNodeImpl2.getExpectedPolicies()) {
                    Iterator children = policyNodeImpl2.getChildren();
                    while (true) {
                        if (!children.hasNext()) {
                            HashSet hashSet = new HashSet();
                            hashSet.add(str3);
                            new PolicyNodeImpl(policyNodeImpl2, str3, set, z, hashSet, false);
                            break;
                        }
                        String validPolicy = ((PolicyNodeImpl) children.next()).getValidPolicy();
                        if (str3.equals(validPolicy)) {
                            JCPLogger.finerFormat("{0} in parent's expected policy set already appears in child node", validPolicy);
                            break;
                        }
                    }
                }
                z3 = z;
                str2 = str;
                set2 = set;
            } else {
                z3 = z;
                set2 = set;
                HashSet hashSet2 = new HashSet();
                hashSet2.add(str);
                str2 = str;
                new PolicyNodeImpl(policyNodeImpl2, str2, set2, z3, hashSet2, false);
            }
            z4 = true;
            str = str2;
            set = set2;
            z = z3;
        }
        return z4;
    }

    public static int d(int i, X509CertImpl x509CertImpl) {
        if (i > 0 && !X509CertImpl.isSelfIssued(x509CertImpl)) {
            i--;
        }
        try {
            InhibitAnyPolicyExtension inhibitAnyPolicyExtension = (InhibitAnyPolicyExtension) x509CertImpl.getExtension(PKIXExtensions.InhibitAnyPolicy_Id);
            if (inhibitAnyPolicyExtension != null) {
                Integer num = (Integer) inhibitAnyPolicyExtension.get(InhibitAnyPolicyExtension.SKIP_CERTS);
                int intValue = num.intValue();
                JCPLogger.finer("PolicyChecker.mergeInhibitAnyPolicy() skipCerts Index from cert = ", num);
                if (intValue != -1 && intValue < i) {
                    return intValue;
                }
            }
            return i;
        } catch (Exception e) {
            JCPLogger.subThrown("PolicyChecker.mergeInhibitAnyPolicy unexpected exception", e);
            throw new CertPathValidatorException(e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v40, types: [java.util.Set] */
    @Override // java.security.cert.PKIXCertPathChecker
    public void check(Certificate certificate, Collection collection) throws CertPathValidatorException {
        Object obj;
        PolicyNodeImpl policyNodeImpl;
        CertificatePoliciesExtension certificatePoliciesExtension;
        String str;
        PolicyNodeImpl policyNodeImpl2;
        HashSet hashSet;
        boolean z;
        boolean z2;
        PolicyMappingsExtension policyMappingsExtension;
        String str2;
        boolean z3;
        HashSet hashSet2;
        CertificatePoliciesExtension certificatePoliciesExtension2;
        int i;
        String str3;
        boolean z4;
        X509Certificate x509Certificate = (X509Certificate) certificate;
        JCPLogger.finerFormat("PolicyChecker.checkPolicy() ---checking {0}...", "certificate policies");
        JCPLogger.finer("PolicyChecker.checkPolicy() certIndex = ", Integer.valueOf(this.D));
        JCPLogger.finer("PolicyChecker.checkPolicy() BEFORE PROCESSING: explicitPolicy = ", Integer.valueOf(this.A));
        JCPLogger.finer("PolicyChecker.checkPolicy() BEFORE PROCESSING: policyMapping = ", Integer.valueOf(this.B));
        JCPLogger.finer("PolicyChecker.checkPolicy() BEFORE PROCESSING: inhibitAnyPolicy = ", Integer.valueOf(this.C));
        JCPLogger.finer("PolicyChecker.checkPolicy() BEFORE PROCESSING: policyTree = ", this.z);
        try {
            X509CertImpl impl = X509CertImpl.toImpl(x509Certificate);
            int i2 = this.D;
            boolean z5 = i2 == this.b;
            int i3 = this.A;
            int i4 = this.B;
            int i5 = this.C;
            PolicyNodeImpl policyNodeImpl3 = this.z;
            HashSet hashSet3 = new HashSet();
            PolicyNodeImpl f = policyNodeImpl3 == null ? null : policyNodeImpl3.f(null);
            CertificatePoliciesExtension certificatePoliciesExtension3 = impl.getCertificatePoliciesExtension();
            if (certificatePoliciesExtension3 == null || f == null) {
                obj = "certificate policies";
                policyNodeImpl = null;
                certificatePoliciesExtension = certificatePoliciesExtension3;
                str = "Exception while retrieving policyOIDs";
                PolicyNodeImpl policyNodeImpl4 = f;
                if (certificatePoliciesExtension == null) {
                    JCPLogger.finer("PolicyChecker.processPolicies() no policies present in cert");
                    hashSet = hashSet3;
                    policyNodeImpl2 = null;
                } else {
                    policyNodeImpl2 = policyNodeImpl4;
                    hashSet = hashSet3;
                }
                z = false;
            } else {
                HashSet hashSet4 = hashSet3;
                PolicyNodeImpl policyNodeImpl5 = f;
                boolean isCritical = certificatePoliciesExtension3.isCritical();
                obj = "certificate policies";
                JCPLogger.finer("PolicyChecker.processPolicies() policiesCritical = ", Boolean.valueOf(isCritical));
                try {
                    List list = (List) certificatePoliciesExtension3.get(CertificatePoliciesExtension.POLICIES);
                    String str4 = "Exception while retrieving policyOIDs";
                    boolean z6 = this.y;
                    JCPLogger.finer("PolicyChecker.processPolicies() rejectPolicyQualifiers = ", Boolean.valueOf(z6));
                    Iterator it = list.iterator();
                    boolean z7 = false;
                    while (true) {
                        Iterator it2 = it;
                        if (it.hasNext()) {
                            PolicyInformation policyInformation = (PolicyInformation) it2.next();
                            int i6 = i2;
                            String objectIdentifier = policyInformation.getPolicyIdentifier().getIdentifier().toString();
                            if (objectIdentifier.equals(RFC3280CRLUtility.ANY_POLICY)) {
                                z7 = true;
                                hashSet4 = policyInformation.getPolicyQualifiers();
                                certificatePoliciesExtension2 = certificatePoliciesExtension3;
                                i = i5;
                                str3 = str4;
                                i2 = i6;
                                z4 = z6;
                            } else {
                                JCPLogger.finer("PolicyChecker.processPolicies() processing policy: ", objectIdentifier);
                                Set policyQualifiers = policyInformation.getPolicyQualifiers();
                                if (policyQualifiers.isEmpty() || !z6 || !isCritical) {
                                    certificatePoliciesExtension2 = certificatePoliciesExtension3;
                                    i = i5;
                                    str3 = str4;
                                    z4 = z6;
                                    i2 = i6;
                                    if (!c(i2, isCritical, policyNodeImpl5, objectIdentifier, policyQualifiers, false)) {
                                        c(i2, isCritical, policyNodeImpl5, objectIdentifier, policyQualifiers, true);
                                    }
                                } else {
                                    if (er61.a()) {
                                        throw new CertPathValidatorException("critical policy qualifiers present in certificate", null, null, -1, PKIXReason.INVALID_POLICY);
                                    }
                                    dy31.r("critical policy qualifiers present in certificate");
                                    policyNodeImpl2 = null;
                                }
                            }
                            certificatePoliciesExtension3 = certificatePoliciesExtension2;
                            z6 = z4;
                            it = it2;
                            str4 = str3;
                            i5 = i;
                        } else {
                            CertificatePoliciesExtension certificatePoliciesExtension4 = certificatePoliciesExtension3;
                            int i7 = i5;
                            str = str4;
                            policyNodeImpl = null;
                            if (!z7 || (i7 <= 0 && (z5 || !X509CertImpl.isSelfIssued(impl)))) {
                                certificatePoliciesExtension = certificatePoliciesExtension4;
                                hashSet2 = hashSet4;
                            } else {
                                JCPLogger.finer("PolicyChecker.processPolicies() processing policy: ", RFC3280CRLUtility.ANY_POLICY);
                                certificatePoliciesExtension = certificatePoliciesExtension4;
                                hashSet2 = hashSet4;
                                c(i2, isCritical, policyNodeImpl5, RFC3280CRLUtility.ANY_POLICY, hashSet2, true);
                            }
                            policyNodeImpl5.b(i2);
                            policyNodeImpl2 = !policyNodeImpl5.getChildren().hasNext() ? null : policyNodeImpl5;
                            z = isCritical;
                            hashSet = hashSet2;
                        }
                    }
                } catch (IOException e) {
                    throw new CertPathValidatorException("Exception while retrieving policyOIDs", e);
                }
            }
            if (policyNodeImpl2 == null || z5 || (policyMappingsExtension = impl.getPolicyMappingsExtension()) == null) {
                z2 = false;
            } else {
                JCPLogger.finer("PolicyChecker.processPolicyMappings() inside policyMapping check");
                try {
                    List list2 = (List) policyMappingsExtension.get(PolicyMappingsExtension.MAP);
                    int i8 = 0;
                    boolean z8 = false;
                    loop1: while (i8 < list2.size()) {
                        CertificatePolicyMap certificatePolicyMap = (CertificatePolicyMap) list2.get(i8);
                        List list3 = list2;
                        String objectIdentifier2 = certificatePolicyMap.getIssuerIdentifier().getIdentifier().toString();
                        String objectIdentifier3 = certificatePolicyMap.getSubjectIdentifier().getIdentifier().toString();
                        int i9 = i8;
                        JCPLogger.finer("PolicyChecker.processPolicyMappings() issuerDomain = ", objectIdentifier2);
                        JCPLogger.finer("PolicyChecker.processPolicyMappings() subjectDomain = ", objectIdentifier3);
                        if (objectIdentifier2.equals(RFC3280CRLUtility.ANY_POLICY)) {
                            if (er61.a()) {
                                throw new CertPathValidatorException("encountered an issuerDomainPolicy of ANY_POLICY", null, null, -1, PKIXReason.INVALID_POLICY);
                            }
                            str2 = "encountered an issuerDomainPolicy of ANY_POLICY";
                        } else if (!objectIdentifier3.equals(RFC3280CRLUtility.ANY_POLICY)) {
                            HashSet a = policyNodeImpl2.a(i2, objectIdentifier2);
                            int i10 = -1;
                            if (!a.isEmpty()) {
                                Iterator it3 = a.iterator();
                                while (it3.hasNext()) {
                                    Iterator it4 = it3;
                                    PolicyNodeImpl policyNodeImpl6 = (PolicyNodeImpl) it3.next();
                                    if (i4 > 0 || i4 == i10) {
                                        HashSet hashSet5 = policyNodeImpl6.f;
                                        z3 = z8;
                                        if (policyNodeImpl6.i) {
                                            ny61.r("PolicyNode is immutable");
                                            break loop1;
                                        }
                                        if (policyNodeImpl6.g) {
                                            hashSet5.clear();
                                            policyNodeImpl6.g = false;
                                        }
                                        hashSet5.add(objectIdentifier3);
                                    } else if (i4 == 0) {
                                        PolicyNodeImpl policyNodeImpl7 = (PolicyNodeImpl) policyNodeImpl6.getParent();
                                        JCPLogger.finer("PolicyChecker.processPolicyMappings() before deleting: policy tree = ", policyNodeImpl2);
                                        policyNodeImpl7.d(policyNodeImpl6);
                                        JCPLogger.finer("PolicyChecker.processPolicyMappings() after deleting: policy tree = ", policyNodeImpl2);
                                        z3 = true;
                                    } else {
                                        z3 = z8;
                                    }
                                    it3 = it4;
                                    z8 = z3;
                                    i10 = -1;
                                }
                            } else if (i4 > 0 || i4 == -1) {
                                Iterator it5 = policyNodeImpl2.a(i2, RFC3280CRLUtility.ANY_POLICY).iterator();
                                while (it5.hasNext()) {
                                    PolicyNodeImpl policyNodeImpl8 = (PolicyNodeImpl) ((PolicyNodeImpl) it5.next()).getParent();
                                    HashSet hashSet6 = new HashSet();
                                    hashSet6.add(objectIdentifier3);
                                    new PolicyNodeImpl(policyNodeImpl8, objectIdentifier2, hashSet, z, hashSet6, true);
                                }
                            }
                            i8 = i9 + 1;
                            list2 = list3;
                        } else {
                            if (er61.a()) {
                                throw new CertPathValidatorException("encountered a subjectDomainPolicy of ANY_POLICY", null, null, -1, PKIXReason.INVALID_POLICY);
                            }
                            str2 = "encountered a subjectDomainPolicy of ANY_POLICY";
                        }
                        dy31.r(str2);
                    }
                    z2 = false;
                    if (z8) {
                        policyNodeImpl2.b(i2);
                        if (!policyNodeImpl2.getChildren().hasNext()) {
                            JCPLogger.finer("setting rootNode to null");
                            policyNodeImpl2 = policyNodeImpl;
                        }
                    }
                } catch (IOException e2) {
                    throw new CertPathValidatorException("Exception while checking mapping", e2);
                }
            }
            if (policyNodeImpl2 != null) {
                HashSet hashSet7 = this.a;
                if (!hashSet7.contains(RFC3280CRLUtility.ANY_POLICY) && certificatePoliciesExtension != null) {
                    try {
                        Iterator it6 = ((List) certificatePoliciesExtension.get(CertificatePoliciesExtension.POLICIES)).iterator();
                        while (it6.hasNext()) {
                            String objectIdentifier4 = ((PolicyInformation) it6.next()).getPolicyIdentifier().getIdentifier().toString();
                            JCPLogger.finer("PolicyChecker.processPolicies() processing policy second time: ", objectIdentifier4);
                            Iterator it7 = policyNodeImpl2.a(i2, objectIdentifier4).iterator();
                            while (it7.hasNext()) {
                                PolicyNodeImpl policyNodeImpl9 = (PolicyNodeImpl) it7.next();
                                PolicyNodeImpl policyNodeImpl10 = (PolicyNodeImpl) policyNodeImpl9.getParent();
                                if (policyNodeImpl10.getValidPolicy().equals(RFC3280CRLUtility.ANY_POLICY) && !hashSet7.contains(objectIdentifier4) && !objectIdentifier4.equals(RFC3280CRLUtility.ANY_POLICY)) {
                                    JCPLogger.finer("PolicyChecker.processPolicies() before deleting: policy tree = ", policyNodeImpl2);
                                    policyNodeImpl10.d(policyNodeImpl9);
                                    JCPLogger.finer("PolicyChecker.processPolicies() after deleting: policy tree = ", policyNodeImpl2);
                                    z2 = true;
                                }
                            }
                        }
                        if (z2) {
                            policyNodeImpl2.b(i2);
                            if (!policyNodeImpl2.getChildren().hasNext()) {
                                policyNodeImpl2 = policyNodeImpl;
                            }
                        }
                        if (policyNodeImpl2 != null && z5) {
                            HashSet a2 = policyNodeImpl2.a(i2, RFC3280CRLUtility.ANY_POLICY);
                            if (!a2.isEmpty()) {
                                PolicyNodeImpl policyNodeImpl11 = (PolicyNodeImpl) a2.iterator().next();
                                PolicyNodeImpl policyNodeImpl12 = (PolicyNodeImpl) policyNodeImpl11.getParent();
                                policyNodeImpl12.d(policyNodeImpl11);
                                HashSet hashSet8 = new HashSet(hashSet7);
                                HashSet hashSet9 = new HashSet();
                                policyNodeImpl2.c(i2, hashSet9);
                                Iterator it8 = hashSet9.iterator();
                                while (it8.hasNext()) {
                                    hashSet8.remove(((PolicyNodeImpl) it8.next()).getValidPolicy());
                                }
                                if (hashSet8.isEmpty()) {
                                    policyNodeImpl2.b(i2);
                                    if (!policyNodeImpl2.getChildren().hasNext()) {
                                        policyNodeImpl2 = policyNodeImpl;
                                    }
                                } else {
                                    boolean isCritical2 = policyNodeImpl11.isCritical();
                                    Set policyQualifiers2 = policyNodeImpl11.getPolicyQualifiers();
                                    Iterator it9 = hashSet8.iterator();
                                    while (it9.hasNext()) {
                                        String str5 = (String) it9.next();
                                        new PolicyNodeImpl(policyNodeImpl12, str5, policyQualifiers2, isCritical2, Collections.singleton(str5), false);
                                    }
                                }
                            }
                        }
                    } catch (IOException e3) {
                        throw new CertPathValidatorException(str, e3);
                    }
                }
            }
            if (z5) {
                i3 = b(i3, impl, z5);
            }
            if (i3 == 0 && policyNodeImpl2 == null) {
                if (er61.a()) {
                    throw new CertPathValidatorException("non-null policy tree required and policy tree is null", null, null, -1, PKIXReason.INVALID_POLICY);
                }
                dy31.r("non-null policy tree required and policy tree is null");
                policyNodeImpl2 = policyNodeImpl;
            }
            this.z = policyNodeImpl2;
            if (!z5) {
                this.A = b(this.A, impl, z5);
                this.B = a(this.B, impl);
                this.C = d(this.C, impl);
            }
            this.D++;
            JCPLogger.finer("PolicyChecker.checkPolicy() AFTER PROCESSING: explicitPolicy = ", Integer.valueOf(this.A));
            JCPLogger.finer("PolicyChecker.checkPolicy() AFTER PROCESSING: policyMapping = ", Integer.valueOf(this.B));
            JCPLogger.finer("PolicyChecker.checkPolicy() AFTER PROCESSING: inhibitAnyPolicy = ", Integer.valueOf(this.C));
            JCPLogger.finer("PolicyChecker.checkPolicy() AFTER PROCESSING: policyTree = ", this.z);
            JCPLogger.finerFormat("PolicyChecker.checkPolicy() {0} verified", obj);
            if (collection == null || collection.isEmpty()) {
                return;
            }
            collection.remove(PKIXExtensions.CertificatePolicies_Id.toString());
            collection.remove(PKIXExtensions.PolicyMappings_Id.toString());
            collection.remove(PKIXExtensions.PolicyConstraints_Id.toString());
            collection.remove(PKIXExtensions.InhibitAnyPolicy_Id.toString());
        } catch (CertificateException e4) {
            throw new CertPathValidatorException(e4);
        }
    }

    @Override // java.security.cert.PKIXCertPathChecker
    public Set getSupportedExtensions() {
        if (E == null) {
            HashSet hashSet = new HashSet();
            E = hashSet;
            hashSet.add(PKIXExtensions.CertificatePolicies_Id.toString());
            E.add(PKIXExtensions.PolicyMappings_Id.toString());
            E.add(PKIXExtensions.PolicyConstraints_Id.toString());
            E.add(PKIXExtensions.InhibitAnyPolicy_Id.toString());
            E = Collections.unmodifiableSet(E);
        }
        return E;
    }

    @Override // java.security.cert.PKIXCertPathChecker, java.security.cert.CertPathChecker
    public void init(boolean z) throws CertPathValidatorException {
        if (z) {
            dy31.r("forward checking not supported");
            return;
        }
        this.D = 1;
        boolean z2 = this.c;
        int i = this.b;
        this.A = z2 ? 0 : i + 1;
        this.B = this.w ? 0 : i + 1;
        this.C = this.x ? 0 : i + 1;
    }

    @Override // java.security.cert.PKIXCertPathChecker, java.security.cert.CertPathChecker
    public boolean isForwardCheckingSupported() {
        return false;
    }
}
