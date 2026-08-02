package ru.CryptoPro.reprov.x509;

import defpackage.n;
import defpackage.ny61;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.PublicKey;
import java.util.Enumeration;
import ru.CryptoPro.reprov.array.DerInputStream;
import ru.CryptoPro.reprov.array.DerOutputStream;
import ru.CryptoPro.reprov.array.DerValue;

/* loaded from: classes4.dex */
public class CertificateX509Key implements CertAttrSet {
    public static final String IDENT = "x509.info.key";
    public static final String KEY = "value";
    public static final String NAME = "key";
    private PublicKey key;

    public CertificateX509Key(InputStream inputStream) throws IOException {
        this.key = X509Key.parse(new DerValue(inputStream));
    }

    @Override // ru.CryptoPro.reprov.x509.CertAttrSet
    public void delete(String str) throws IOException {
        if (str.equalsIgnoreCase("value")) {
            this.key = null;
        } else {
            ny61.v("Attribute name not recognized by CertAttrSet: CertificateX509Key.");
        }
    }

    @Override // ru.CryptoPro.reprov.x509.CertAttrSet
    public void encode(OutputStream outputStream) throws IOException {
        DerOutputStream derOutputStream = new DerOutputStream();
        derOutputStream.write(this.key.getEncoded());
        outputStream.write(derOutputStream.toByteArray());
    }

    @Override // ru.CryptoPro.reprov.x509.CertAttrSet
    public Object get(String str) throws IOException {
        if (str.equalsIgnoreCase("value")) {
            return this.key;
        }
        ny61.v("Attribute name not recognized by CertAttrSet: CertificateX509Key.");
        return null;
    }

    @Override // ru.CryptoPro.reprov.x509.CertAttrSet
    public Enumeration getElements() {
        return n.s("value");
    }

    @Override // ru.CryptoPro.reprov.x509.CertAttrSet
    public String getName() {
        return "key";
    }

    @Override // ru.CryptoPro.reprov.x509.CertAttrSet
    public void set(String str, Object obj) throws IOException {
        if (str.equalsIgnoreCase("value")) {
            this.key = (PublicKey) obj;
        } else {
            ny61.v("Attribute name not recognized by CertAttrSet: CertificateX509Key.");
        }
    }

    @Override // ru.CryptoPro.reprov.x509.CertAttrSet
    public String toString() {
        PublicKey publicKey = this.key;
        return publicKey == null ? "" : publicKey.toString();
    }

    public CertificateX509Key(PublicKey publicKey) {
        this.key = publicKey;
    }

    public CertificateX509Key(DerInputStream derInputStream) throws IOException {
        this.key = X509Key.parse(derInputStream.getDerValue());
    }
}
