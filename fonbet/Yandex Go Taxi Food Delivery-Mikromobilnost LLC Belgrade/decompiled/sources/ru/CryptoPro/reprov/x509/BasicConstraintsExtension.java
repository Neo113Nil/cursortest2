package ru.CryptoPro.reprov.x509;

import defpackage.ny61;
import defpackage.oyr;
import defpackage.qv10;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Enumeration;
import ru.CryptoPro.reprov.array.DerInputStream;
import ru.CryptoPro.reprov.array.DerOutputStream;
import ru.CryptoPro.reprov.array.DerValue;

/* loaded from: classes4.dex */
public class BasicConstraintsExtension extends Extension implements CertAttrSet {
    public static final String IDENT = "x509.info.extensions.BasicConstraints";
    public static final String IS_CA = "is_ca";
    public static final String NAME = "BasicConstraints";
    public static final String PATH_LEN = "path_len";
    private boolean ca;
    private int pathLen;

    public BasicConstraintsExtension(Boolean bool, Object obj) throws IOException {
        int integer;
        this.ca = false;
        this.pathLen = -1;
        this.extensionId = PKIXExtensions.BasicConstraints_Id;
        this.critical = bool.booleanValue();
        byte[] bArr = (byte[]) obj;
        this.extensionValue = bArr;
        DerValue derValue = new DerValue(bArr);
        if (derValue.tag != 48) {
            ny61.v("Invalid encoding of BasicConstraints");
            throw null;
        }
        DerInputStream derInputStream = derValue.data;
        if (derInputStream == null || derInputStream.available() == 0) {
            return;
        }
        DerValue derValue2 = derValue.data.getDerValue();
        if (derValue2.tag != 1) {
            return;
        }
        this.ca = derValue2.getBoolean();
        if (derValue.data.available() == 0) {
            integer = Integer.MAX_VALUE;
        } else {
            DerValue derValue3 = derValue.data.getDerValue();
            if (derValue3.tag != 2) {
                ny61.v("Invalid encoding of BasicConstraints");
                throw null;
            }
            integer = derValue3.getInteger();
        }
        this.pathLen = integer;
    }

    private void encodeThis() throws IOException {
        byte[] byteArray;
        if (this.ca || this.pathLen >= 0) {
            DerOutputStream derOutputStream = new DerOutputStream();
            DerOutputStream derOutputStream2 = new DerOutputStream();
            boolean z = this.ca;
            if (z) {
                derOutputStream2.putBoolean(z);
            }
            int i = this.pathLen;
            if (i >= 0) {
                derOutputStream2.putInteger(i);
            }
            derOutputStream.write((byte) 48, derOutputStream2);
            byteArray = derOutputStream.toByteArray();
        } else {
            byteArray = null;
        }
        this.extensionValue = byteArray;
    }

    @Override // ru.CryptoPro.reprov.x509.CertAttrSet
    public void delete(String str) throws IOException {
        if (str.equalsIgnoreCase(IS_CA)) {
            this.ca = false;
        } else {
            if (!str.equalsIgnoreCase(PATH_LEN)) {
                ny61.v("Attribute name not recognized by CertAttrSet:BasicConstraints.");
                return;
            }
            this.pathLen = -1;
        }
        encodeThis();
    }

    @Override // ru.CryptoPro.reprov.x509.Extension, java.security.cert.Extension, ru.CryptoPro.reprov.x509.CertAttrSet
    public void encode(OutputStream outputStream) throws IOException {
        DerOutputStream derOutputStream = new DerOutputStream();
        if (this.extensionValue == null) {
            this.extensionId = PKIXExtensions.BasicConstraints_Id;
            this.critical = this.ca;
            encodeThis();
        }
        super.encode(derOutputStream);
        outputStream.write(derOutputStream.toByteArray());
    }

    @Override // ru.CryptoPro.reprov.x509.CertAttrSet
    public Object get(String str) throws IOException {
        if (str.equalsIgnoreCase(IS_CA)) {
            return Boolean.valueOf(this.ca);
        }
        if (str.equalsIgnoreCase(PATH_LEN)) {
            return Integer.valueOf(String.valueOf(this.pathLen));
        }
        ny61.v("Attribute name not recognized by CertAttrSet:BasicConstraints.");
        return null;
    }

    @Override // ru.CryptoPro.reprov.x509.CertAttrSet
    public Enumeration getElements() {
        AttributeNameEnumeration attributeNameEnumeration = new AttributeNameEnumeration();
        attributeNameEnumeration.addElement(IS_CA);
        attributeNameEnumeration.addElement(PATH_LEN);
        return attributeNameEnumeration.elements();
    }

    @Override // ru.CryptoPro.reprov.x509.CertAttrSet
    public String getName() {
        return NAME;
    }

    @Override // ru.CryptoPro.reprov.x509.CertAttrSet
    public void set(String str, Object obj) throws IOException {
        String str2;
        if (str.equalsIgnoreCase(IS_CA)) {
            if (obj instanceof Boolean) {
                this.ca = ((Boolean) obj).booleanValue();
                encodeThis();
                return;
            } else {
                str2 = "Attribute value should be of type Boolean.";
                ny61.v(str2);
            }
        }
        if (!str.equalsIgnoreCase(PATH_LEN)) {
            str2 = "Attribute name not recognized by CertAttrSet:BasicConstraints.";
        } else {
            if (obj instanceof Integer) {
                this.pathLen = ((Integer) obj).intValue();
                encodeThis();
                return;
            }
            str2 = "Attribute value should be of type Integer.";
        }
        ny61.v(str2);
    }

    @Override // ru.CryptoPro.reprov.x509.Extension, ru.CryptoPro.reprov.x509.CertAttrSet
    public String toString() {
        String t = oyr.t(qv10.t(oyr.t(new StringBuilder(), super.toString(), "BasicConstraints:[\n")), this.ca ? "  CA:true" : "  CA:false", "\n");
        return (this.pathLen >= 0 ? oyr.m(this.pathLen, "\n", oyr.v(t, "  PathLen:")) : t.concat("  PathLen: undefined\n")).concat("]\n");
    }

    public BasicConstraintsExtension(Boolean bool, boolean z, int i) throws IOException {
        this.ca = z;
        this.pathLen = i;
        this.extensionId = PKIXExtensions.BasicConstraints_Id;
        this.critical = bool.booleanValue();
        encodeThis();
    }

    public BasicConstraintsExtension(boolean z, int i) throws IOException {
        this(Boolean.valueOf(z), z, i);
    }
}
