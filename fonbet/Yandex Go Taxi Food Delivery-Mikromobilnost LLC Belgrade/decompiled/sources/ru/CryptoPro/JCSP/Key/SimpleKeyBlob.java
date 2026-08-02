package ru.CryptoPro.JCSP.Key;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.security.InvalidKeyException;
import ru.CryptoPro.JCP.tools.Array;
import ru.CryptoPro.JCSP.CStructReader.CPseudoArray;
import ru.CryptoPro.JCSP.CStructReader.PubKeyInfoHeaderStructure;
import ru.CryptoPro.JCSP.CStructReader.StructException;

/* loaded from: classes4.dex */
public class SimpleKeyBlob {
    public static final String WRONG_OPEN_KEY_BLOB = "Wrong PrivateKeyBlob: ";
    private PubKeyInfoHeaderStructure a;
    private CPseudoArray b;
    private boolean c;

    public SimpleKeyBlob(byte[] bArr) throws InvalidKeyException {
        this.a = null;
        this.b = null;
        this.c = false;
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        this.a = new PubKeyInfoHeaderStructure();
        this.b = new CPseudoArray();
        try {
            this.a.read(byteArrayInputStream);
            this.b.read(byteArrayInputStream);
            this.c = true;
        } catch (StructException unused) {
            throw new InvalidKeyException("Wrong PrivateKeyBlob: ".concat("Wrong key length!"));
        }
    }

    public void clear() {
        this.a.clear();
        this.b.clear();
        this.c = false;
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
        if (this.c) {
            return this.a.keyParam.bitLen.value;
        }
        return 0;
    }

    public byte[] getBlob() {
        if (this.c) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(0);
            try {
                this.a.write(byteArrayOutputStream);
                this.b.write(byteArrayOutputStream);
                return byteArrayOutputStream.toByteArray();
            } catch (StructException unused) {
            }
        }
        return null;
    }

    public byte[] getExported() {
        if (this.c) {
            return this.b.value;
        }
        return null;
    }

    public int getKeyAlgID() {
        if (this.c) {
            return this.a.blobHeader.aiKeyAlg.value;
        }
        return 0;
    }

    public String toString() {
        return this.c ? "bType: ".concat(Byte.toString(this.a.blobHeader.bType.value)).concat("\n").concat("reserved: ".concat(Short.toString(this.a.blobHeader.reserved.value)).concat("\n")).concat("algorithm: ".concat(Integer.toString(this.a.blobHeader.aiKeyAlg.value)).concat("\n")).concat("bitLen: ".concat(Integer.toString(this.a.keyParam.bitLen.value)).concat("\n")).concat(Array.toHexString(this.b.value)) : "Must be generated first!";
    }

    public SimpleKeyBlob(byte[] bArr, int i, int i2) {
        this.a = null;
        this.b = null;
        this.c = false;
        this.a = new PubKeyInfoHeaderStructure((byte) 7, (short) 0, i, i2, 0);
        this.b = new CPseudoArray(bArr);
        this.c = true;
    }
}
