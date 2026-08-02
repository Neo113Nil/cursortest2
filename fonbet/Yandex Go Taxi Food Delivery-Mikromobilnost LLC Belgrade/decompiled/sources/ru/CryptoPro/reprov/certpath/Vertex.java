package ru.CryptoPro.reprov.certpath;

import defpackage.oyr;
import defpackage.qv10;
import java.security.GeneralSecurityException;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import ru.CryptoPro.JCP.tools.JCPLogger;
import ru.CryptoPro.reprov.x509.AuthorityKeyIdentifierExtension;
import ru.CryptoPro.reprov.x509.KeyIdentifier;
import ru.CryptoPro.reprov.x509.SubjectKeyIdentifierExtension;
import ru.CryptoPro.reprov.x509.X509CertImpl;

/* loaded from: classes4.dex */
class Vertex {
    public X509Certificate a;
    public int b;
    public GeneralSecurityException c;

    public String certToString() {
        X509Certificate x509Certificate = this.a;
        if (x509Certificate == null) {
            return "Cert:       Not an X509Certificate\n";
        }
        try {
            X509CertImpl impl = X509CertImpl.toImpl(x509Certificate);
            StringBuilder v = oyr.v("Issuer:     " + impl.getIssuerX500Principal() + "\n", "Subject:    ");
            v.append(impl.getSubjectX500Principal());
            v.append("\n");
            StringBuilder v2 = oyr.v(v.toString(), "SerialNum:  ");
            v2.append(impl.getSerialNumber().toString(16));
            v2.append("\n");
            StringBuilder v3 = oyr.v(v2.toString(), "Expires:    ");
            v3.append(impl.getNotAfter().toString());
            v3.append("\n");
            String sb = v3.toString();
            boolean[] issuerUniqueID = impl.getIssuerUniqueID();
            if (issuerUniqueID != null) {
                String concat = sb.concat("IssuerUID:  ");
                for (boolean z : issuerUniqueID) {
                    StringBuilder t = qv10.t(concat);
                    t.append(z ? 1 : 0);
                    concat = t.toString();
                }
                sb = concat.concat("\n");
            }
            boolean[] subjectUniqueID = impl.getSubjectUniqueID();
            if (subjectUniqueID != null) {
                String concat2 = sb.concat("SubjectUID: ");
                for (boolean z2 : subjectUniqueID) {
                    StringBuilder t2 = qv10.t(concat2);
                    t2.append(z2 ? 1 : 0);
                    concat2 = t2.toString();
                }
                sb = concat2.concat("\n");
            }
            try {
                SubjectKeyIdentifierExtension subjectKeyIdentifierExtension = impl.getSubjectKeyIdentifierExtension();
                if (subjectKeyIdentifierExtension != null) {
                    sb = sb + "SubjKeyID:  " + ((KeyIdentifier) subjectKeyIdentifierExtension.get("key_id")).toString();
                }
            } catch (Exception unused) {
                JCPLogger.warning("Vertex.certToString() unexpected exception");
            }
            try {
                AuthorityKeyIdentifierExtension authorityKeyIdentifierExtension = impl.getAuthorityKeyIdentifierExtension();
                if (authorityKeyIdentifierExtension == null) {
                    return sb;
                }
                return sb + "AuthKeyID:  " + ((KeyIdentifier) authorityKeyIdentifierExtension.get("key_id")).toString();
            } catch (Exception unused2) {
                JCPLogger.warning("Vertex.certToString() 2 unexpected exception");
                return sb;
            }
        } catch (CertificateException e) {
            JCPLogger.warning("Vertex.certToString() unexpected exception", (Throwable) e);
            return "";
        }
    }

    public Certificate getCertificate() {
        return this.a;
    }

    public int getIndex() {
        return this.b;
    }

    public Throwable getThrowable() {
        return this.c;
    }

    public String indexToString() {
        return oyr.m(this.b, "\n", new StringBuilder("Index:      "));
    }

    public String moreToString() {
        return oyr.t(new StringBuilder("Last cert?  "), this.b == -1 ? "Yes" : "No", "\n");
    }

    public String throwableToString() {
        String str;
        if (this.c != null) {
            str = "Exception:  " + this.c.toString();
        } else {
            str = "Exception:  null";
        }
        return str.concat("\n");
    }

    public String toString() {
        return certToString() + throwableToString() + indexToString();
    }
}
