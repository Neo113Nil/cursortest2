package ru.CryptoPro.reprov.x509;

import java.io.IOException;
import ru.CryptoPro.reprov.array.BitArray;
import ru.CryptoPro.reprov.array.DerInputStream;
import ru.CryptoPro.reprov.array.DerOutputStream;
import ru.CryptoPro.reprov.array.DerValue;

/* loaded from: classes4.dex */
public class UniqueIdentity {
    private BitArray id;

    public UniqueIdentity(DerInputStream derInputStream) throws IOException {
        this.id = derInputStream.getDerValue().getUnalignedBitString(true);
    }

    public void encode(DerOutputStream derOutputStream, byte b) throws IOException {
        byte[] byteArray = this.id.toByteArray();
        int length = (byteArray.length * 8) - this.id.length();
        derOutputStream.write(b);
        derOutputStream.putLength(byteArray.length + 1);
        derOutputStream.write(length);
        derOutputStream.write(byteArray);
    }

    public boolean[] getId() {
        BitArray bitArray = this.id;
        if (bitArray == null) {
            return null;
        }
        return bitArray.toBooleanArray();
    }

    public String toString() {
        return "UniqueIdentity:" + this.id.toString() + "\n";
    }

    public UniqueIdentity(BitArray bitArray) {
        this.id = bitArray;
    }

    public UniqueIdentity(DerValue derValue) throws IOException {
        this.id = derValue.getUnalignedBitString(true);
    }

    public UniqueIdentity(byte[] bArr) {
        this.id = new BitArray(bArr.length * 8, bArr);
    }
}
