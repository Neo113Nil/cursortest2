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
public class CertificateSubjectUniqueIdentity implements CertAttrSet {
    public static final String ID = "id";
    public static final String IDENT = "x509.info.subjectID";
    public static final String NAME = "subjectID";
    private UniqueIdentity id;

    public CertificateSubjectUniqueIdentity(InputStream inputStream) throws IOException {
        this.id = new UniqueIdentity(new DerValue(inputStream));
    }

    @Override // ru.CryptoPro.reprov.x509.CertAttrSet
    public void delete(String str) throws IOException {
        if (str.equalsIgnoreCase("id")) {
            this.id = null;
        } else {
            ny61.v("Attribute name not recognized by CertAttrSet: CertificateSubjectUniqueIdentity.");
        }
    }

    @Override // ru.CryptoPro.reprov.x509.CertAttrSet
    public void encode(OutputStream outputStream) throws IOException {
        DerOutputStream derOutputStream = new DerOutputStream();
        this.id.encode(derOutputStream, DerValue.createTag(DerValue.TAG_CONTEXT, false, (byte) 2));
        outputStream.write(derOutputStream.toByteArray());
    }

    @Override // ru.CryptoPro.reprov.x509.CertAttrSet
    public Object get(String str) throws IOException {
        if (str.equalsIgnoreCase("id")) {
            return this.id;
        }
        ny61.v("Attribute name not recognized by CertAttrSet: CertificateSubjectUniqueIdentity.");
        return null;
    }

    @Override // ru.CryptoPro.reprov.x509.CertAttrSet
    public Enumeration getElements() {
        return n.s("id");
    }

    @Override // ru.CryptoPro.reprov.x509.CertAttrSet
    public String getName() {
        return "subjectID";
    }

    @Override // ru.CryptoPro.reprov.x509.CertAttrSet
    public void set(String str, Object obj) throws IOException {
        if (!(obj instanceof UniqueIdentity)) {
            ny61.v("Attribute must be of type UniqueIdentity.");
        } else if (str.equalsIgnoreCase("id")) {
            this.id = (UniqueIdentity) obj;
        } else {
            ny61.v("Attribute name not recognized by CertAttrSet: CertificateSubjectUniqueIdentity.");
        }
    }

    @Override // ru.CryptoPro.reprov.x509.CertAttrSet
    public String toString() {
        UniqueIdentity uniqueIdentity = this.id;
        return uniqueIdentity == null ? "" : uniqueIdentity.toString();
    }

    public CertificateSubjectUniqueIdentity(DerInputStream derInputStream) throws IOException {
        this.id = new UniqueIdentity(derInputStream);
    }

    public CertificateSubjectUniqueIdentity(DerValue derValue) throws IOException {
        this.id = new UniqueIdentity(derValue);
    }

    public CertificateSubjectUniqueIdentity(UniqueIdentity uniqueIdentity) {
        this.id = uniqueIdentity;
    }
}
