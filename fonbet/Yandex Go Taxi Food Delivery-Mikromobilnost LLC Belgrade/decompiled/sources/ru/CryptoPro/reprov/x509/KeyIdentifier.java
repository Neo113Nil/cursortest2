package ru.CryptoPro.reprov.x509;

import defpackage.ny61;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.util.Arrays;
import ru.CryptoPro.JCP.JCP;
import ru.CryptoPro.JCP.tools.Encoder;
import ru.CryptoPro.reprov.array.DerOutputStream;
import ru.CryptoPro.reprov.array.DerValue;

/* loaded from: classes4.dex */
public class KeyIdentifier {
    private byte[] octetString;

    public KeyIdentifier(PublicKey publicKey) throws IOException {
        DerValue derValue = new DerValue(publicKey.getEncoded());
        if (derValue.tag != 48) {
            ny61.v("PublicKey value is not a valid X.509 public key");
            throw null;
        }
        AlgorithmId.parse(derValue.data.getDerValue());
        byte[] byteArray = derValue.data.getUnalignedBitString().toByteArray();
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(JCP.DIGEST_SHA1);
            messageDigest.update(byteArray);
            this.octetString = messageDigest.digest();
        } catch (NoSuchAlgorithmException unused) {
            ny61.v("SHA1 not supported");
            throw null;
        }
    }

    public void encode(DerOutputStream derOutputStream) throws IOException {
        derOutputStream.putOctetString(this.octetString);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof KeyIdentifier) {
            return Arrays.equals(this.octetString, ((KeyIdentifier) obj).getIdentifier());
        }
        return false;
    }

    public byte[] getIdentifier() {
        return (byte[]) this.octetString.clone();
    }

    public int hashCode() {
        int i = 0;
        int i2 = 0;
        while (true) {
            byte[] bArr = this.octetString;
            if (i >= bArr.length) {
                return i2;
            }
            i2 += bArr[i] * i;
            i++;
        }
    }

    public String toString() {
        return ("KeyIdentifier [\n" + new Encoder().encodeBuffer(this.octetString)).concat("]\n");
    }

    public KeyIdentifier(DerValue derValue) throws IOException {
        this.octetString = derValue.getOctetString();
    }

    public KeyIdentifier(byte[] bArr) {
        this.octetString = (byte[]) bArr.clone();
    }
}
