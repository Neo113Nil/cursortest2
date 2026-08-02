package ru.CryptoPro.reprov.x509;

import defpackage.ny61;
import defpackage.oyr;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Enumeration;
import ru.CryptoPro.reprov.array.ArrayUtils;
import ru.CryptoPro.reprov.array.BitArray;
import ru.CryptoPro.reprov.array.DerOutputStream;
import ru.CryptoPro.reprov.array.DerValue;

/* loaded from: classes4.dex */
public class KeyUsageExtension extends Extension implements CertAttrSet {
    public static final String CRL_SIGN = "crl_sign";
    public static final String DATA_ENCIPHERMENT = "data_encipherment";
    public static final String DECIPHER_ONLY = "decipher_only";
    public static final String DIGITAL_SIGNATURE = "digital_signature";
    public static final String ENCIPHER_ONLY = "encipher_only";
    public static final String IDENT = "x509.info.extensions.KeyUsage";
    public static final String KEY_AGREEMENT = "key_agreement";
    public static final String KEY_CERTSIGN = "key_certsign";
    public static final String KEY_ENCIPHERMENT = "key_encipherment";
    public static final String NAME = "KeyUsage";
    public static final String NON_REPUDIATION = "non_repudiation";
    private boolean[] bitString;

    public KeyUsageExtension(Boolean bool, Object obj) throws IOException {
        this.extensionId = PKIXExtensions.KeyUsage_Id;
        this.critical = bool.booleanValue();
        byte[] bArr = (byte[]) obj;
        if (bArr[0] == 4) {
            this.extensionValue = new DerValue(bArr).getOctetString();
        } else {
            this.extensionValue = bArr;
        }
        this.bitString = new DerValue(this.extensionValue).getUnalignedBitString().toBooleanArray();
    }

    private void encodeThis() throws IOException {
        DerOutputStream derOutputStream = new DerOutputStream();
        derOutputStream.putUnalignedBitString(ArrayUtils.truncate(new BitArray(this.bitString)));
        this.extensionValue = derOutputStream.toByteArray();
    }

    private boolean isSet(int i) {
        return this.bitString[i];
    }

    @Override // ru.CryptoPro.reprov.x509.CertAttrSet
    public void delete(String str) throws IOException {
        int i;
        if (str.equalsIgnoreCase(DIGITAL_SIGNATURE)) {
            set(0, false);
        } else {
            if (str.equalsIgnoreCase(NON_REPUDIATION)) {
                i = 1;
            } else if (str.equalsIgnoreCase(KEY_ENCIPHERMENT)) {
                i = 2;
            } else if (str.equalsIgnoreCase(DATA_ENCIPHERMENT)) {
                i = 3;
            } else if (str.equalsIgnoreCase(KEY_AGREEMENT)) {
                i = 4;
            } else if (str.equalsIgnoreCase(KEY_CERTSIGN)) {
                i = 5;
            } else if (str.equalsIgnoreCase(CRL_SIGN)) {
                i = 6;
            } else if (str.equalsIgnoreCase(ENCIPHER_ONLY)) {
                i = 7;
            } else {
                if (!str.equalsIgnoreCase(DECIPHER_ONLY)) {
                    ny61.v("Attribute name not recognized by CertAttrSet:KeyUsage.");
                    return;
                }
                i = 8;
            }
            set(i, false);
        }
        encodeThis();
    }

    @Override // ru.CryptoPro.reprov.x509.Extension, java.security.cert.Extension, ru.CryptoPro.reprov.x509.CertAttrSet
    public void encode(OutputStream outputStream) throws IOException {
        DerOutputStream derOutputStream = new DerOutputStream();
        if (this.extensionValue == null) {
            this.extensionId = PKIXExtensions.KeyUsage_Id;
            this.critical = true;
            encodeThis();
        }
        super.encode(derOutputStream);
        outputStream.write(derOutputStream.toByteArray());
    }

    @Override // ru.CryptoPro.reprov.x509.CertAttrSet
    public Object get(String str) throws IOException {
        if (str.equalsIgnoreCase(DIGITAL_SIGNATURE)) {
            return Boolean.valueOf(isSet(0));
        }
        if (str.equalsIgnoreCase(NON_REPUDIATION)) {
            return Boolean.valueOf(isSet(1));
        }
        if (str.equalsIgnoreCase(KEY_ENCIPHERMENT)) {
            return Boolean.valueOf(isSet(2));
        }
        if (str.equalsIgnoreCase(DATA_ENCIPHERMENT)) {
            return Boolean.valueOf(isSet(3));
        }
        if (str.equalsIgnoreCase(KEY_AGREEMENT)) {
            return Boolean.valueOf(isSet(4));
        }
        if (str.equalsIgnoreCase(KEY_CERTSIGN)) {
            return Boolean.valueOf(isSet(5));
        }
        if (str.equalsIgnoreCase(CRL_SIGN)) {
            return Boolean.valueOf(isSet(6));
        }
        if (str.equalsIgnoreCase(ENCIPHER_ONLY)) {
            return Boolean.valueOf(isSet(7));
        }
        if (str.equalsIgnoreCase(DECIPHER_ONLY)) {
            return Boolean.valueOf(isSet(8));
        }
        ny61.v("Attribute name not recognized by CertAttrSet:KeyUsage.");
        return null;
    }

    public boolean[] getBits() {
        return (boolean[]) this.bitString.clone();
    }

    @Override // ru.CryptoPro.reprov.x509.CertAttrSet
    public Enumeration getElements() {
        AttributeNameEnumeration attributeNameEnumeration = new AttributeNameEnumeration();
        attributeNameEnumeration.addElement(DIGITAL_SIGNATURE);
        attributeNameEnumeration.addElement(NON_REPUDIATION);
        attributeNameEnumeration.addElement(KEY_ENCIPHERMENT);
        attributeNameEnumeration.addElement(DATA_ENCIPHERMENT);
        attributeNameEnumeration.addElement(KEY_AGREEMENT);
        attributeNameEnumeration.addElement(KEY_CERTSIGN);
        attributeNameEnumeration.addElement(CRL_SIGN);
        attributeNameEnumeration.addElement(ENCIPHER_ONLY);
        attributeNameEnumeration.addElement(DECIPHER_ONLY);
        return attributeNameEnumeration.elements();
    }

    @Override // ru.CryptoPro.reprov.x509.CertAttrSet
    public String getName() {
        return NAME;
    }

    @Override // ru.CryptoPro.reprov.x509.CertAttrSet
    public void set(String str, Object obj) throws IOException {
        String str2;
        int i;
        if (obj instanceof Boolean) {
            boolean booleanValue = ((Boolean) obj).booleanValue();
            if (str.equalsIgnoreCase(DIGITAL_SIGNATURE)) {
                i = 0;
            } else if (str.equalsIgnoreCase(NON_REPUDIATION)) {
                i = 1;
            } else if (str.equalsIgnoreCase(KEY_ENCIPHERMENT)) {
                i = 2;
            } else if (str.equalsIgnoreCase(DATA_ENCIPHERMENT)) {
                i = 3;
            } else if (str.equalsIgnoreCase(KEY_AGREEMENT)) {
                i = 4;
            } else if (str.equalsIgnoreCase(KEY_CERTSIGN)) {
                i = 5;
            } else if (str.equalsIgnoreCase(CRL_SIGN)) {
                i = 6;
            } else if (str.equalsIgnoreCase(ENCIPHER_ONLY)) {
                i = 7;
            } else if (str.equalsIgnoreCase(DECIPHER_ONLY)) {
                i = 8;
            } else {
                str2 = "Attribute name not recognized by CertAttrSet:KeyUsage.";
            }
            set(i, booleanValue);
            encodeThis();
            return;
        }
        str2 = "Attribute must be of type Boolean.";
        ny61.v(str2);
    }

    @Override // ru.CryptoPro.reprov.x509.Extension, ru.CryptoPro.reprov.x509.CertAttrSet
    public String toString() {
        String t = oyr.t(new StringBuilder(), super.toString(), "KeyUsage [\n");
        try {
            if (isSet(0)) {
                t = t.concat("  DigitalSignature\n");
            }
            if (isSet(1)) {
                t = t.concat("  Non_repudiation\n");
            }
            if (isSet(2)) {
                t = t.concat("  Key_Encipherment\n");
            }
            if (isSet(3)) {
                t = t.concat("  Data_Encipherment\n");
            }
            if (isSet(4)) {
                t = t.concat("  Key_Agreement\n");
            }
            if (isSet(5)) {
                t = t.concat("  Key_CertSign\n");
            }
            if (isSet(6)) {
                t = t.concat("  Crl_Sign\n");
            }
            if (isSet(7)) {
                t = t.concat("  Encipher_Only\n");
            }
            if (isSet(8)) {
                t = t.concat("  Decipher_Only\n");
            }
        } catch (ArrayIndexOutOfBoundsException unused) {
        }
        return t.concat("]\n");
    }

    public KeyUsageExtension() {
        this.extensionId = PKIXExtensions.KeyUsage_Id;
        this.critical = true;
        this.bitString = new boolean[0];
    }

    public KeyUsageExtension(BitArray bitArray) throws IOException {
        this.bitString = bitArray.toBooleanArray();
        this.extensionId = PKIXExtensions.KeyUsage_Id;
        this.critical = true;
        encodeThis();
    }

    public KeyUsageExtension(byte[] bArr) throws IOException {
        this.bitString = new BitArray(bArr.length * 8, bArr).toBooleanArray();
        this.extensionId = PKIXExtensions.KeyUsage_Id;
        this.critical = true;
        encodeThis();
    }

    public KeyUsageExtension(boolean[] zArr) throws IOException {
        this.bitString = zArr;
        this.extensionId = PKIXExtensions.KeyUsage_Id;
        this.critical = true;
        encodeThis();
    }

    private void set(int i, boolean z) {
        boolean[] zArr = this.bitString;
        if (i >= zArr.length) {
            boolean[] zArr2 = new boolean[i + 1];
            System.arraycopy(zArr, 0, zArr2, 0, zArr.length);
            this.bitString = zArr2;
        }
        this.bitString[i] = z;
    }
}
