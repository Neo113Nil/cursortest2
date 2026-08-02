package ru.CryptoPro.reprov.x509;

import defpackage.ny61;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigInteger;
import ru.CryptoPro.reprov.array.DerInputStream;
import ru.CryptoPro.reprov.array.DerOutputStream;
import ru.CryptoPro.reprov.array.DerValue;
import ru.CryptoPro.reprov.utils.Debug;

/* loaded from: classes4.dex */
public class SerialNumber {
    private BigInteger serialNum;

    public SerialNumber(InputStream inputStream) throws IOException {
        construct(new DerValue(inputStream));
    }

    private void construct(DerValue derValue) throws IOException {
        this.serialNum = derValue.getBigInteger();
        if (derValue.data.available() == 0) {
            return;
        }
        ny61.v("Excess SerialNumber data");
    }

    public void encode(DerOutputStream derOutputStream) throws IOException {
        derOutputStream.putInteger(this.serialNum);
    }

    public BigInteger getNumber() {
        return this.serialNum;
    }

    public String toString() {
        return "SerialNumber: [" + Debug.toHexString(this.serialNum) + "]";
    }

    public SerialNumber(int i) {
        this.serialNum = BigInteger.valueOf(i);
    }

    public SerialNumber(BigInteger bigInteger) {
        this.serialNum = bigInteger;
    }

    public SerialNumber(DerInputStream derInputStream) throws IOException {
        construct(derInputStream.getDerValue());
    }

    public SerialNumber(DerValue derValue) throws IOException {
        construct(derValue);
    }
}
