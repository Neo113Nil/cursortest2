package ru.CryptoPro.reprov.certpath;

import java.io.IOException;
import java.security.PublicKey;
import java.security.cert.CertPathValidatorException;
import java.security.cert.CertificateException;
import java.security.cert.PKIXCertPathChecker;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import java.security.interfaces.DSAPublicKey;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import ru.CryptoPro.AdES.evidence.crl.rfc3280.RFC3280CRLUtility;
import ru.CryptoPro.JCP.tools.JCPLogger;
import ru.CryptoPro.reprov.x509.NameConstraintsExtension;
import ru.CryptoPro.reprov.x509.SubjectKeyIdentifierExtension;
import ru.CryptoPro.reprov.x509.X500Principal;
import ru.CryptoPro.reprov.x509.X509CertImpl;

/* loaded from: classes4.dex */
class ReverseState implements State {
    public int A;
    public PolicyNodeImpl B;
    public int C;
    public ArrayList D;
    public boolean E;
    public X500Principal a;
    public PublicKey b;
    public SubjectKeyIdentifierExtension c;
    public CrlRevocationChecker crlChecker;
    public boolean crlSign;
    public NameConstraintsExtension w;
    public int x;
    public int y;
    public int z;

    @Override // ru.CryptoPro.reprov.certpath.State
    public Object clone() {
        try {
            ReverseState reverseState = (ReverseState) super.clone();
            ArrayList arrayList = (ArrayList) this.D.clone();
            reverseState.D = arrayList;
            ListIterator listIterator = arrayList.listIterator();
            while (listIterator.hasNext()) {
                PKIXCertPathChecker pKIXCertPathChecker = (PKIXCertPathChecker) listIterator.next();
                if (pKIXCertPathChecker != null) {
                    listIterator.set((PKIXCertPathChecker) pKIXCertPathChecker.clone());
                }
            }
            NameConstraintsExtension nameConstraintsExtension = this.w;
            if (nameConstraintsExtension != null) {
                reverseState.w = (NameConstraintsExtension) nameConstraintsExtension.clone();
            }
            PolicyNodeImpl policyNodeImpl = this.B;
            if (policyNodeImpl != null) {
                reverseState.B = policyNodeImpl.f(null);
            }
            return reverseState;
        } catch (CloneNotSupportedException e) {
            throw new InternalError(e.toString());
        }
    }

    public void initState(int i, boolean z, boolean z2, boolean z3, List list) throws CertPathValidatorException {
        ArrayList arrayList;
        this.C = i == -1 ? Integer.MAX_VALUE : i;
        if (z) {
            this.x = 0;
        } else {
            this.x = i == -1 ? i : i + 2;
        }
        if (z2) {
            this.y = 0;
        } else {
            this.y = i == -1 ? i : i + 2;
        }
        if (z3) {
            this.z = 0;
        } else {
            if (i != -1) {
                i += 2;
            }
            this.z = i;
        }
        this.A = 1;
        HashSet hashSet = new HashSet(1);
        hashSet.add(RFC3280CRLUtility.ANY_POLICY);
        this.B = new PolicyNodeImpl(null, RFC3280CRLUtility.ANY_POLICY, null, false, hashSet, false);
        if (list != null) {
            arrayList = new ArrayList(list);
            this.D = arrayList;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((PKIXCertPathChecker) it.next()).init(false);
            }
        } else {
            arrayList = new ArrayList();
            this.D = arrayList;
        }
        this.crlSign = true;
        this.E = true;
    }

    @Override // ru.CryptoPro.reprov.certpath.State
    public boolean isInitial() {
        return this.E;
    }

    @Override // ru.CryptoPro.reprov.certpath.State
    public boolean keyParamsNeeded() {
        return false;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        try {
            stringBuffer.append("State [");
            stringBuffer.append("\n  subjectDN of last cert: " + this.a);
            stringBuffer.append("\n  subjectKeyIdentifier: ".concat(String.valueOf(this.c)));
            stringBuffer.append("\n  nameConstraints: ".concat(String.valueOf(this.w)));
            stringBuffer.append("\n  certIndex: " + this.A);
            stringBuffer.append("\n  explicitPolicy: " + this.x);
            stringBuffer.append("\n  policyMapping:  " + this.y);
            stringBuffer.append("\n  inhibitAnyPolicy:  " + this.z);
            stringBuffer.append("\n  rootNode: " + this.B);
            stringBuffer.append("\n  remainingCACerts: " + this.C);
            stringBuffer.append("\n  crlSign: " + this.crlSign);
            stringBuffer.append("\n  init: " + this.E);
            stringBuffer.append("\n]\n");
        } catch (Exception e) {
            JCPLogger.warning("ReverseState.toString() unexpected exception", (Throwable) e);
        }
        return stringBuffer.toString();
    }

    @Override // ru.CryptoPro.reprov.certpath.State
    public void updateState(X509Certificate x509Certificate) throws CertificateException, IOException, CertPathValidatorException {
        if (x509Certificate == null) {
            return;
        }
        this.a = new X500Principal(x509Certificate.getSubjectX500Principal().getEncoded());
        X509CertImpl impl = X509CertImpl.toImpl(x509Certificate);
        PublicKey publicKey = x509Certificate.getPublicKey();
        if ((publicKey instanceof DSAPublicKey) && ((DSAPublicKey) publicKey).getParams() == null) {
            publicKey = BasicChecker.a(publicKey, this.b);
        }
        this.b = publicKey;
        if (this.E) {
            this.E = false;
            return;
        }
        this.c = impl.getSubjectKeyIdentifierExtension();
        this.crlSign = CrlRevocationChecker.e(x509Certificate);
        NameConstraintsExtension nameConstraintsExtension = this.w;
        if (nameConstraintsExtension != null) {
            nameConstraintsExtension.merge(impl.getNameConstraintsExtension());
        } else {
            NameConstraintsExtension nameConstraintsExtension2 = impl.getNameConstraintsExtension();
            this.w = nameConstraintsExtension2;
            if (nameConstraintsExtension2 != null) {
                this.w = (NameConstraintsExtension) nameConstraintsExtension2.clone();
            }
        }
        this.x = PolicyChecker.b(this.x, impl, false);
        this.y = PolicyChecker.a(this.y, impl);
        this.z = PolicyChecker.d(this.z, impl);
        this.A++;
        int i = this.C;
        Set set = ConstraintsChecker.w;
        int basicConstraints = x509Certificate.getBasicConstraints();
        if (!X509CertImpl.isSelfIssued(x509Certificate)) {
            i--;
        }
        if (basicConstraints >= i) {
            basicConstraints = i;
        }
        this.C = basicConstraints;
        this.E = false;
    }

    public void updateState(TrustAnchor trustAnchor) throws CertificateException, IOException, CertPathValidatorException {
        X509Certificate trustedCert = trustAnchor.getTrustedCert();
        if (trustedCert != null) {
            updateState(trustedCert);
        } else {
            X500Principal x500Principal = new X500Principal(trustAnchor.getCA().getEncoded());
            PublicKey cAPublicKey = trustAnchor.getCAPublicKey();
            this.a = x500Principal;
            this.b = cAPublicKey;
        }
        Iterator it = this.D.iterator();
        while (it.hasNext()) {
            PKIXCertPathChecker pKIXCertPathChecker = (PKIXCertPathChecker) it.next();
            if (pKIXCertPathChecker instanceof AlgorithmChecker) {
                ((AlgorithmChecker) pKIXCertPathChecker).b(trustAnchor);
            }
        }
        this.E = false;
    }
}
