package ru.CryptoPro.reprov.x509;

import defpackage.n;
import defpackage.ny61;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Enumeration;
import ru.CryptoPro.reprov.array.DerOutputStream;
import ru.CryptoPro.reprov.array.DerValue;

/* loaded from: classes4.dex */
public class SubjectKeyIdentifierExtension extends Extension implements CertAttrSet {
    public static final String IDENT = "x509.info.extensions.SubjectKeyIdentifier";
    public static final String KEY_ID = "key_id";
    public static final String NAME = "SubjectKeyIdentifier";
    private KeyIdentifier id;

    public SubjectKeyIdentifierExtension(Boolean bool, Object obj) throws IOException {
        this.id = null;
        this.extensionId = PKIXExtensions.SubjectKey_Id;
        this.critical = bool.booleanValue();
        byte[] bArr = (byte[]) obj;
        this.extensionValue = bArr;
        this.id = new KeyIdentifier(new DerValue(bArr));
    }

    private void encodeThis() throws IOException {
        byte[] byteArray;
        if (this.id == null) {
            byteArray = null;
        } else {
            DerOutputStream derOutputStream = new DerOutputStream();
            this.id.encode(derOutputStream);
            byteArray = derOutputStream.toByteArray();
        }
        this.extensionValue = byteArray;
    }

    @Override // ru.CryptoPro.reprov.x509.CertAttrSet
    public void delete(String str) throws IOException {
        if (!str.equalsIgnoreCase("key_id")) {
            ny61.v("Attribute name not recognized by CertAttrSet:SubjectKeyIdentifierExtension.");
        } else {
            this.id = null;
            encodeThis();
        }
    }

    @Override // ru.CryptoPro.reprov.x509.Extension, java.security.cert.Extension, ru.CryptoPro.reprov.x509.CertAttrSet
    public void encode(OutputStream outputStream) throws IOException {
        DerOutputStream derOutputStream = new DerOutputStream();
        if (this.extensionValue == null) {
            this.extensionId = PKIXExtensions.SubjectKey_Id;
            this.critical = false;
            encodeThis();
        }
        super.encode(derOutputStream);
        outputStream.write(derOutputStream.toByteArray());
    }

    @Override // ru.CryptoPro.reprov.x509.CertAttrSet
    public Object get(String str) throws IOException {
        if (str.equalsIgnoreCase("key_id")) {
            return this.id;
        }
        ny61.v("Attribute name not recognized by CertAttrSet:SubjectKeyIdentifierExtension.");
        return null;
    }

    @Override // ru.CryptoPro.reprov.x509.CertAttrSet
    public Enumeration getElements() {
        return n.s("key_id");
    }

    @Override // ru.CryptoPro.reprov.x509.CertAttrSet
    public String getName() {
        return NAME;
    }

    @Override // ru.CryptoPro.reprov.x509.CertAttrSet
    public void set(String str, Object obj) throws IOException {
        if (!str.equalsIgnoreCase("key_id")) {
            ny61.v("Attribute name not recognized by CertAttrSet:SubjectKeyIdentifierExtension.");
        } else if (!(obj instanceof KeyIdentifier)) {
            ny61.v("Attribute value should be of type KeyIdentifier.");
        } else {
            this.id = (KeyIdentifier) obj;
            encodeThis();
        }
    }

    @Override // ru.CryptoPro.reprov.x509.Extension, ru.CryptoPro.reprov.x509.CertAttrSet
    public String toString() {
        return super.toString() + "SubjectKeyIdentifier [\n" + String.valueOf(this.id) + "]\n";
    }

    public SubjectKeyIdentifierExtension(byte[] bArr) throws IOException {
        this.id = null;
        this.id = new KeyIdentifier(bArr);
        this.extensionId = PKIXExtensions.SubjectKey_Id;
        this.critical = false;
        encodeThis();
    }
}
