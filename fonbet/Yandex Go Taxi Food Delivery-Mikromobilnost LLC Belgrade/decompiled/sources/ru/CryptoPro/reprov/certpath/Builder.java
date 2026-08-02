package ru.CryptoPro.reprov.certpath;

import defpackage.kbs;
import defpackage.ny61;
import defpackage.oyr;
import java.io.IOException;
import java.security.AccessController;
import java.security.cert.CertStore;
import java.security.cert.CertStoreException;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.PKIXBuilderParameters;
import java.security.cert.X509Certificate;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.Set;
import ru.CryptoPro.AdES.evidence.crl.rfc3280.RFC3280CRLUtility;
import ru.CryptoPro.JCP.tools.JCPLogger;
import ru.CryptoPro.reprov.utils.GetPropertyAction;
import ru.CryptoPro.reprov.x509.GeneralNameInterface;
import ru.CryptoPro.reprov.x509.GeneralNames;
import ru.CryptoPro.reprov.x509.GeneralSubtrees;
import ru.CryptoPro.reprov.x509.NameConstraintsExtension;
import ru.CryptoPro.reprov.x509.SubjectAlternativeNameExtension;
import ru.CryptoPro.reprov.x509.X500Name;
import ru.CryptoPro.reprov.x509.X500Principal;
import ru.CryptoPro.reprov.x509.X509CertImpl;

/* loaded from: classes4.dex */
abstract class Builder {
    public static final boolean f = getBooleanProperty("ru.CryptoPro.reprov.enableAIAcaIssuers", false);
    public Set a;
    public final PKIXBuilderParameters b;
    public final X500Principal c;
    public final Date d;
    public final X509CertSelector e;

    public Builder(PKIXBuilderParameters pKIXBuilderParameters, X500Principal x500Principal) {
        this.b = pKIXBuilderParameters;
        this.c = x500Principal;
        Date date = pKIXBuilderParameters.getDate();
        this.d = date == null ? new Date() : date;
        this.e = new X509CertSelector((java.security.cert.X509CertSelector) pKIXBuilderParameters.getTargetCertConstraints());
    }

    public static int a(X509Certificate x509Certificate, X500Name x500Name) {
        GeneralNames generalNames;
        try {
            X509CertImpl impl = X509CertImpl.toImpl(x509Certificate);
            if (!X500Name.asX500Name(impl.getSubjectX500PrincipalInternal()).equals(x500Name)) {
                SubjectAlternativeNameExtension subjectAlternativeNameExtension = impl.getSubjectAlternativeNameExtension();
                if (subjectAlternativeNameExtension != null && (generalNames = (GeneralNames) subjectAlternativeNameExtension.get(SubjectAlternativeNameExtension.SUBJECT_NAME)) != null) {
                    int size = generalNames.size();
                    for (int i = 0; i < size; i++) {
                        if (!generalNames.get(i).getName().equals(x500Name)) {
                        }
                    }
                }
                NameConstraintsExtension nameConstraintsExtension = impl.getNameConstraintsExtension();
                if (nameConstraintsExtension != null) {
                    NameConstraintsExtension nameConstraintsExtension2 = (NameConstraintsExtension) nameConstraintsExtension.clone();
                    JCPLogger.finer("Builder.targetDistance() merged constraints: ", String.valueOf(nameConstraintsExtension2));
                    GeneralSubtrees generalSubtrees = (GeneralSubtrees) nameConstraintsExtension2.get(NameConstraintsExtension.PERMITTED_SUBTREES);
                    GeneralSubtrees generalSubtrees2 = (GeneralSubtrees) nameConstraintsExtension2.get(NameConstraintsExtension.EXCLUDED_SUBTREES);
                    if (generalSubtrees != null) {
                        generalSubtrees.reduce(generalSubtrees2);
                    }
                    JCPLogger.finer("Builder.targetDistance() reduced constraints: ", generalSubtrees);
                    if (!nameConstraintsExtension2.verify(x500Name)) {
                        ny61.v("New certificate not allowed to sign certificate for target");
                        return 0;
                    }
                    if (generalSubtrees != null) {
                        int size2 = generalSubtrees.size();
                        for (int i2 = 0; i2 < size2; i2++) {
                            int b = b(generalSubtrees.get(i2).getName().getName(), x500Name, -1);
                            if (b >= 0) {
                                return b + 1;
                            }
                        }
                    }
                }
                return -1;
            }
            return 0;
        } catch (CertificateException e) {
            throw ((IOException) new IOException("Invalid certificate").initCause(e));
        }
    }

    public static int b(GeneralNameInterface generalNameInterface, GeneralNameInterface generalNameInterface2, int i) {
        int constrains = generalNameInterface.constrains(generalNameInterface2);
        if (constrains == -1) {
            JCPLogger.finer("Builder.distance(): Names are different types");
        } else {
            if (constrains == 0) {
                return 0;
            }
            if (constrains == 1 || constrains == 2) {
                return generalNameInterface2.subtreeDepth() - generalNameInterface.subtreeDepth();
            }
            if (constrains != 3) {
                return i;
            }
        }
        JCPLogger.finer("Builder.distance(): Names are same type but in different subtrees");
        return i;
    }

    public static int e(X500Name x500Name, X500Name x500Name2) {
        String str;
        int constrains = x500Name.constrains(x500Name2);
        if (constrains != -1) {
            if (constrains == 0) {
                return 0;
            }
            if (constrains != 1 && constrains != 2) {
                if (constrains != 3) {
                    return Integer.MAX_VALUE;
                }
                if (x500Name.getType() != 4) {
                    str = "Builder.hops(): hopDistance not implemented for this name type";
                } else {
                    X500Name commonAncestor = x500Name.commonAncestor(x500Name2);
                    if (commonAncestor != null) {
                        int subtreeDepth = commonAncestor.subtreeDepth();
                        return (x500Name2.subtreeDepth() + x500Name.subtreeDepth()) - (subtreeDepth * 2);
                    }
                    str = "Builder.hops(): Names are in different namespaces";
                }
            }
            return x500Name2.subtreeDepth() - x500Name.subtreeDepth();
        }
        str = "Builder.hops(): Names are different types";
        JCPLogger.finer(str);
        return Integer.MAX_VALUE;
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

    public final Set c() {
        if (this.a != null) {
            PKIXBuilderParameters pKIXBuilderParameters = this.b;
            Set<String> initialPolicies = pKIXBuilderParameters.getInitialPolicies();
            if (initialPolicies.isEmpty() || initialPolicies.contains(RFC3280CRLUtility.ANY_POLICY) || !pKIXBuilderParameters.isPolicyMappingInhibited()) {
                this.a = Collections.EMPTY_SET;
            } else {
                initialPolicies.add(RFC3280CRLUtility.ANY_POLICY);
                this.a = initialPolicies;
            }
        }
        return this.a;
    }

    public final boolean d(X509CertSelector x509CertSelector, ArrayList arrayList, AbstractCollection abstractCollection, boolean z) {
        X509Certificate certificate = x509CertSelector.getCertificate();
        boolean z2 = false;
        PKIXBuilderParameters pKIXBuilderParameters = this.b;
        if (certificate != null) {
            if (!x509CertSelector.match(certificate) || X509CertImpl.isSelfSigned(certificate, pKIXBuilderParameters.getSigProvider())) {
                return false;
            }
            JCPLogger.finer("Builder.addMatchingCerts: adding target cert");
            return abstractCollection.add(certificate);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            try {
                for (Certificate certificate2 : ((CertStore) it.next()).getCertificates(x509CertSelector)) {
                    if (!X509CertImpl.isSelfSigned((X509Certificate) certificate2, pKIXBuilderParameters.getSigProvider()) && abstractCollection.add((X509Certificate) certificate2)) {
                        z2 = true;
                    }
                }
                if (!z && z2) {
                    return true;
                }
            } catch (CertStoreException e) {
                JCPLogger.ignoredException(e);
            }
        }
        return z2;
    }
}
