package ru.CryptoPro.reprov.certpath;

import java.io.IOException;
import java.security.PublicKey;
import java.security.cert.CertPathValidatorException;
import java.security.cert.CertificateException;
import java.security.cert.PKIXCertPathChecker;
import java.security.cert.X509Certificate;
import java.security.interfaces.DSAPublicKey;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import ru.CryptoPro.JCP.tools.JCPLogger;
import ru.CryptoPro.reprov.x509.GeneralName;
import ru.CryptoPro.reprov.x509.GeneralNames;
import ru.CryptoPro.reprov.x509.SubjectAlternativeNameExtension;
import ru.CryptoPro.reprov.x509.X500Name;
import ru.CryptoPro.reprov.x509.X500Principal;
import ru.CryptoPro.reprov.x509.X509CertImpl;

/* loaded from: classes4.dex */
class ForwardState implements State {
    public boolean A;
    public X500Principal a;
    public X509CertImpl b;
    public HashSet c;
    public CrlRevocationChecker crlChecker;
    public int w;
    public boolean x;
    public UntrustedChecker y;
    public ArrayList z;

    @Override // ru.CryptoPro.reprov.certpath.State
    public Object clone() {
        try {
            ForwardState forwardState = (ForwardState) super.clone();
            ArrayList arrayList = (ArrayList) this.z.clone();
            forwardState.z = arrayList;
            ListIterator listIterator = arrayList.listIterator();
            while (listIterator.hasNext()) {
                PKIXCertPathChecker pKIXCertPathChecker = (PKIXCertPathChecker) listIterator.next();
                if (pKIXCertPathChecker != null) {
                    listIterator.set((PKIXCertPathChecker) pKIXCertPathChecker.clone());
                }
            }
            forwardState.c = (HashSet) this.c.clone();
            return forwardState;
        } catch (CloneNotSupportedException e) {
            throw new InternalError(e.toString());
        }
    }

    public void initState(List list) throws CertPathValidatorException {
        this.c = new HashSet();
        this.w = 0;
        this.z = new ArrayList();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                PKIXCertPathChecker pKIXCertPathChecker = (PKIXCertPathChecker) it.next();
                if (pKIXCertPathChecker.isForwardCheckingSupported()) {
                    pKIXCertPathChecker.init(true);
                    this.z.add(pKIXCertPathChecker);
                }
            }
        }
        this.x = true;
    }

    @Override // ru.CryptoPro.reprov.certpath.State
    public boolean isInitial() {
        return this.x;
    }

    @Override // ru.CryptoPro.reprov.certpath.State
    public boolean keyParamsNeeded() {
        return this.A;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        try {
            sb.append("State [");
            sb.append("\n  issuerDN of last cert: ");
            sb.append(this.a);
            sb.append("\n  traversedCACerts: ");
            sb.append(this.w);
            sb.append("\n  init: ");
            sb.append(String.valueOf(this.x));
            sb.append("\n  keyParamsNeeded: ");
            sb.append(String.valueOf(this.A));
            sb.append("\n  subjectNamesTraversed: \n");
            sb.append(this.c);
            sb.append("]\n");
        } catch (Exception e) {
            JCPLogger.subThrown("ForwardState.toString() unexpected exception", e);
        }
        return sb.toString();
    }

    @Override // ru.CryptoPro.reprov.certpath.State
    public void updateState(X509Certificate x509Certificate) throws CertificateException, IOException, CertPathValidatorException {
        if (x509Certificate == null) {
            return;
        }
        X509CertImpl impl = X509CertImpl.toImpl(x509Certificate);
        PublicKey publicKey = impl.getPublicKey();
        if ((publicKey instanceof DSAPublicKey) && ((DSAPublicKey) publicKey).getParams() == null) {
            this.A = true;
        }
        this.b = impl;
        this.a = new X500Principal(x509Certificate.getIssuerX500Principal().getEncoded());
        if (!X509CertImpl.isSelfIssued(x509Certificate) && !this.x && x509Certificate.getBasicConstraints() != -1) {
            this.w++;
        }
        if (this.x || !X509CertImpl.isSelfIssued(x509Certificate)) {
            this.c.add(X500Name.asX500Name(new X500Principal(x509Certificate.getSubjectX500Principal().getEncoded())));
            try {
                SubjectAlternativeNameExtension subjectAlternativeNameExtension = impl.getSubjectAlternativeNameExtension();
                if (subjectAlternativeNameExtension != null) {
                    Iterator it = ((GeneralNames) subjectAlternativeNameExtension.get(SubjectAlternativeNameExtension.SUBJECT_NAME)).iterator();
                    while (it.hasNext()) {
                        this.c.add(((GeneralName) it.next()).getName());
                    }
                }
            } catch (Exception e) {
                JCPLogger.subThrown(e);
                throw new CertPathValidatorException(e);
            }
        }
        this.x = false;
    }
}
