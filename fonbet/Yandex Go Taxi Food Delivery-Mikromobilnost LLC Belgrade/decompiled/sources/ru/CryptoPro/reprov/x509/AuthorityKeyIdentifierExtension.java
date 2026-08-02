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
public class AuthorityKeyIdentifierExtension extends Extension implements CertAttrSet {
    public static final String AUTH_NAME = "auth_name";
    public static final String IDENT = "x509.info.extensions.AuthorityKeyIdentifier";
    public static final String KEY_ID = "key_id";
    public static final String NAME = "AuthorityKeyIdentifier";
    public static final String SERIAL_NUMBER = "serial_number";
    private static final byte TAG_ID = 0;
    private static final byte TAG_NAMES = 1;
    private static final byte TAG_SERIAL_NUM = 2;
    private KeyIdentifier id;
    private GeneralNames names;
    private SerialNumber serialNum;

    public AuthorityKeyIdentifierExtension(Boolean bool, Object obj) throws IOException {
        this.id = null;
        this.names = null;
        this.serialNum = null;
        this.extensionId = PKIXExtensions.AuthorityKey_Id;
        this.critical = bool.booleanValue();
        byte[] bArr = (byte[]) obj;
        this.extensionValue = bArr;
        DerValue derValue = new DerValue(bArr);
        if (derValue.tag != 48) {
            ny61.v("Invalid encoding for AuthorityKeyIdentifierExtension.");
            throw null;
        }
        while (true) {
            DerInputStream derInputStream = derValue.data;
            if (derInputStream == null || derInputStream.available() == 0) {
                return;
            }
            DerValue derValue2 = derValue.data.getDerValue();
            if (!derValue2.isContextSpecific((byte) 0) || derValue2.isConstructed()) {
                if (derValue2.isContextSpecific((byte) 1) && derValue2.isConstructed()) {
                    if (this.names != null) {
                        ny61.v("Duplicate GeneralNames in AuthorityKeyIdentifier.");
                        throw null;
                    }
                    derValue2.resetTag((byte) 48);
                    this.names = new GeneralNames(derValue2);
                } else {
                    if (!derValue2.isContextSpecific((byte) 2) || derValue2.isConstructed()) {
                        break;
                    }
                    if (this.serialNum != null) {
                        ny61.v("Duplicate SerialNumber in AuthorityKeyIdentifier.");
                        throw null;
                    }
                    derValue2.resetTag((byte) 2);
                    this.serialNum = new SerialNumber(derValue2);
                }
            } else {
                if (this.id != null) {
                    ny61.v("Duplicate KeyIdentifier in AuthorityKeyIdentifier.");
                    throw null;
                }
                derValue2.resetTag((byte) 4);
                this.id = new KeyIdentifier(derValue2);
            }
        }
        ny61.v("Invalid encoding of AuthorityKeyIdentifierExtension.");
        throw null;
    }

    private void encodeThis() throws IOException {
        byte[] byteArray;
        if (this.id == null && this.names == null && this.serialNum == null) {
            byteArray = null;
        } else {
            DerOutputStream derOutputStream = new DerOutputStream();
            DerOutputStream derOutputStream2 = new DerOutputStream();
            if (this.id != null) {
                DerOutputStream derOutputStream3 = new DerOutputStream();
                this.id.encode(derOutputStream3);
                derOutputStream2.writeImplicit(DerValue.createTag(DerValue.TAG_CONTEXT, false, (byte) 0), derOutputStream3);
            }
            try {
                if (this.names != null) {
                    DerOutputStream derOutputStream4 = new DerOutputStream();
                    this.names.encode(derOutputStream4);
                    derOutputStream2.writeImplicit(DerValue.createTag(DerValue.TAG_CONTEXT, true, (byte) 1), derOutputStream4);
                }
                if (this.serialNum != null) {
                    DerOutputStream derOutputStream5 = new DerOutputStream();
                    this.serialNum.encode(derOutputStream5);
                    derOutputStream2.writeImplicit(DerValue.createTag(DerValue.TAG_CONTEXT, false, (byte) 2), derOutputStream5);
                }
                derOutputStream.write((byte) 48, derOutputStream2);
                byteArray = derOutputStream.toByteArray();
            } catch (Exception e) {
                throw new IOException(e.toString());
            }
        }
        this.extensionValue = byteArray;
    }

    @Override // ru.CryptoPro.reprov.x509.CertAttrSet
    public void delete(String str) throws IOException {
        if (str.equalsIgnoreCase("key_id")) {
            this.id = null;
        } else if (str.equalsIgnoreCase(AUTH_NAME)) {
            this.names = null;
        } else {
            if (!str.equalsIgnoreCase(SERIAL_NUMBER)) {
                ny61.v("Attribute name not recognized by CertAttrSet:AuthorityKeyIdentifier.");
                return;
            }
            this.serialNum = null;
        }
        encodeThis();
    }

    @Override // ru.CryptoPro.reprov.x509.Extension, java.security.cert.Extension, ru.CryptoPro.reprov.x509.CertAttrSet
    public void encode(OutputStream outputStream) throws IOException {
        DerOutputStream derOutputStream = new DerOutputStream();
        if (this.extensionValue == null) {
            this.extensionId = PKIXExtensions.AuthorityKey_Id;
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
        if (str.equalsIgnoreCase(AUTH_NAME)) {
            return this.names;
        }
        if (str.equalsIgnoreCase(SERIAL_NUMBER)) {
            return this.serialNum;
        }
        ny61.v("Attribute name not recognized by CertAttrSet:AuthorityKeyIdentifier.");
        return null;
    }

    @Override // ru.CryptoPro.reprov.x509.CertAttrSet
    public Enumeration getElements() {
        AttributeNameEnumeration attributeNameEnumeration = new AttributeNameEnumeration();
        attributeNameEnumeration.addElement("key_id");
        attributeNameEnumeration.addElement(AUTH_NAME);
        attributeNameEnumeration.addElement(SERIAL_NUMBER);
        return attributeNameEnumeration.elements();
    }

    @Override // ru.CryptoPro.reprov.x509.CertAttrSet
    public String getName() {
        return NAME;
    }

    @Override // ru.CryptoPro.reprov.x509.CertAttrSet
    public void set(String str, Object obj) throws IOException {
        String str2;
        if (str.equalsIgnoreCase("key_id")) {
            if (obj instanceof KeyIdentifier) {
                this.id = (KeyIdentifier) obj;
                encodeThis();
                return;
            } else {
                str2 = "Attribute value should be of type KeyIdentifier.";
                ny61.v(str2);
            }
        }
        if (str.equalsIgnoreCase(AUTH_NAME)) {
            if (obj instanceof GeneralNames) {
                this.names = (GeneralNames) obj;
                encodeThis();
                return;
            } else {
                str2 = "Attribute value should be of type GeneralNames.";
                ny61.v(str2);
            }
        }
        if (!str.equalsIgnoreCase(SERIAL_NUMBER)) {
            str2 = "Attribute name not recognized by CertAttrSet:AuthorityKeyIdentifier.";
        } else {
            if (obj instanceof SerialNumber) {
                this.serialNum = (SerialNumber) obj;
                encodeThis();
                return;
            }
            str2 = "Attribute value should be of type SerialNumber.";
        }
        ny61.v(str2);
    }

    @Override // ru.CryptoPro.reprov.x509.Extension, ru.CryptoPro.reprov.x509.CertAttrSet
    public String toString() {
        String t = oyr.t(new StringBuilder(), super.toString(), "AuthorityKeyIdentifier [\n");
        if (this.id != null) {
            StringBuilder t2 = qv10.t(t);
            t2.append(this.id.toString());
            t = t2.toString();
        }
        if (this.names != null) {
            StringBuilder t3 = qv10.t(t);
            t3.append(this.names.toString());
            t3.append("\n");
            t = t3.toString();
        }
        if (this.serialNum != null) {
            StringBuilder t4 = qv10.t(t);
            t4.append(this.serialNum.toString());
            t4.append("\n");
            t = t4.toString();
        }
        return t.concat("]\n");
    }

    public AuthorityKeyIdentifierExtension(KeyIdentifier keyIdentifier, GeneralNames generalNames, SerialNumber serialNumber) throws IOException {
        this.id = keyIdentifier;
        this.names = generalNames;
        this.serialNum = serialNumber;
        this.extensionId = PKIXExtensions.AuthorityKey_Id;
        this.critical = false;
        encodeThis();
    }
}
