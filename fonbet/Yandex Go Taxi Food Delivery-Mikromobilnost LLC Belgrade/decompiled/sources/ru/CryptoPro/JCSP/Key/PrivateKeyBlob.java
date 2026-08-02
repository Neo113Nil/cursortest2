package ru.CryptoPro.JCSP.Key;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.security.InvalidKeyException;
import ru.CryptoPro.JCP.tools.Array;
import ru.CryptoPro.JCSP.CStructReader.PrivateKeyBlobStructure;
import ru.CryptoPro.JCSP.CStructReader.StructException;

/* loaded from: classes4.dex */
public class PrivateKeyBlob {
    public static final String WRONG_PRIVATE_KEY_BLOB = "Wrong PrivateKeyBlob: ";
    private PrivateKeyBlobStructure a;
    private boolean b;

    public PrivateKeyBlob(byte[] bArr) throws InvalidKeyException {
        this.a = null;
        this.b = false;
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        PrivateKeyBlobStructure privateKeyBlobStructure = new PrivateKeyBlobStructure();
        this.a = privateKeyBlobStructure;
        try {
            privateKeyBlobStructure.read(byteArrayInputStream);
            if (!this.a.ifComplete()) {
                throw new InvalidKeyException("Wrong PrivateKeyBlob: ".concat("Wrong key length!"));
            }
            this.b = true;
        } catch (StructException unused) {
            throw new InvalidKeyException("Wrong PrivateKeyBlob: ".concat("Wrong key length!"));
        }
    }

    public void clear() {
        this.a.clear();
        this.b = false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PrivateKeyBlob) {
            return Array.compare(((PrivateKeyBlob) obj).getBlob(), getBlob());
        }
        return false;
    }

    public int getBitLen() {
        if (this.b && this.a.ifInit()) {
            return this.a.header.keyParam.bitLen.value;
        }
        return 0;
    }

    public byte[] getBlob() {
        if (this.b) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(0);
            try {
                this.a.write(byteArrayOutputStream);
                return byteArrayOutputStream.toByteArray();
            } catch (StructException unused) {
            }
        }
        return null;
    }

    public byte[] getExportedKey() {
        if (this.b && this.a.ifInit()) {
            return this.a.exported.value;
        }
        return null;
    }

    public int getKeyAlg() {
        if (this.b && this.a.ifInit()) {
            return this.a.header.blobHeader.aiKeyAlg.value;
        }
        return 0;
    }

    public short getReserved() {
        if (this.b && this.a.ifInit()) {
            return this.a.header.blobHeader.reserved.value;
        }
        return (short) 0;
    }

    public String toString() {
        return this.b ? "reserved: ".concat(Short.toString(getReserved())).concat("\n").concat("algorithm: ".concat(Integer.toString(getKeyAlg())).concat("\n")).concat("bitLen: ".concat(Integer.toString(getBitLen())).concat("\n")).concat(Array.toHexString(getExportedKey())) : "Must be generated first!";
    }

    public PrivateKeyBlob(byte[] bArr, int i, int i2) {
        this.a = null;
        this.b = false;
        this.a = new PrivateKeyBlobStructure(bArr, i, i2);
        this.b = true;
    }
}
