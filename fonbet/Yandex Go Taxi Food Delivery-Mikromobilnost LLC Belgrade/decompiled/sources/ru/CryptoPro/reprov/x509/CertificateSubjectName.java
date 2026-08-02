package ru.CryptoPro.reprov.x509;

import defpackage.n;
import defpackage.ny61;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Enumeration;
import ru.CryptoPro.reprov.array.DerInputStream;
import ru.CryptoPro.reprov.array.DerOutputStream;
import ru.CryptoPro.reprov.array.DerValue;

/* loaded from: classes4.dex */
public class CertificateSubjectName implements CertAttrSet {
    public static final String DN_NAME = "dname";
    public static final String DN_PRINCIPAL = "x500principal";
    public static final String IDENT = "x509.info.subject";
    public static final String NAME = "subject";
    private X500Name dnName;
    private X500Principal dnPrincipal;

    public CertificateSubjectName(InputStream inputStream) throws IOException {
        this.dnName = new X500Name(new DerValue(inputStream));
    }

    @Override // ru.CryptoPro.reprov.x509.CertAttrSet
    public void delete(String str) throws IOException {
        if (!str.equalsIgnoreCase("dname")) {
            ny61.v("Attribute name not recognized by CertAttrSet:CertificateSubjectName.");
        } else {
            this.dnName = null;
            this.dnPrincipal = null;
        }
    }

    @Override // ru.CryptoPro.reprov.x509.CertAttrSet
    public void encode(OutputStream outputStream) throws IOException {
        DerOutputStream derOutputStream = new DerOutputStream();
        this.dnName.encode(derOutputStream);
        outputStream.write(derOutputStream.toByteArray());
    }

    @Override // ru.CryptoPro.reprov.x509.CertAttrSet
    public Object get(String str) throws IOException {
        X500Name x500Name;
        if (str.equalsIgnoreCase("dname")) {
            return this.dnName;
        }
        if (!str.equalsIgnoreCase("x500principal")) {
            ny61.v("Attribute name not recognized by CertAttrSet:CertificateSubjectName.");
            return null;
        }
        if (this.dnPrincipal == null && (x500Name = this.dnName) != null) {
            this.dnPrincipal = x500Name.asX500Principal();
        }
        return this.dnPrincipal;
    }

    @Override // ru.CryptoPro.reprov.x509.CertAttrSet
    public Enumeration getElements() {
        return n.s("dname");
    }

    @Override // ru.CryptoPro.reprov.x509.CertAttrSet
    public String getName() {
        return "subject";
    }

    @Override // ru.CryptoPro.reprov.x509.CertAttrSet
    public void set(String str, Object obj) throws IOException {
        if (!(obj instanceof X500Name)) {
            ny61.v("Attribute must be of type X500Name.");
        } else if (!str.equalsIgnoreCase("dname")) {
            ny61.v("Attribute name not recognized by CertAttrSet:CertificateSubjectName.");
        } else {
            this.dnName = (X500Name) obj;
            this.dnPrincipal = null;
        }
    }

    @Override // ru.CryptoPro.reprov.x509.CertAttrSet
    public String toString() {
        X500Name x500Name = this.dnName;
        return x500Name == null ? "" : x500Name.toString();
    }

    public CertificateSubjectName(DerInputStream derInputStream) throws IOException {
        this.dnName = new X500Name(derInputStream);
    }

    public CertificateSubjectName(X500Name x500Name) {
        this.dnName = x500Name;
    }
}
