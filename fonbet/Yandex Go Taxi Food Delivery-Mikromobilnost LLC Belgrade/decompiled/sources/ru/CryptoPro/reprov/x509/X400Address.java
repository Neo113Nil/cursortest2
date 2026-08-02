package ru.CryptoPro.reprov.x509;

import defpackage.w511;
import java.io.IOException;
import ru.CryptoPro.reprov.array.DerOutputStream;
import ru.CryptoPro.reprov.array.DerValue;

/* loaded from: classes4.dex */
public class X400Address implements GeneralNameInterface {
    byte[] nameValue;

    public X400Address(DerValue derValue) throws IOException {
        this.nameValue = null;
        this.nameValue = derValue.toByteArray();
    }

    @Override // ru.CryptoPro.reprov.x509.GeneralNameInterface
    public int constrains(GeneralNameInterface generalNameInterface) throws UnsupportedOperationException {
        if (generalNameInterface == null || generalNameInterface.getType() != 3) {
            return -1;
        }
        w511.x("Narrowing, widening, and match are not supported for X400Address.");
        return 0;
    }

    @Override // ru.CryptoPro.reprov.x509.GeneralNameInterface
    public void encode(DerOutputStream derOutputStream) throws IOException {
        derOutputStream.putDerValue(new DerValue(this.nameValue));
    }

    @Override // ru.CryptoPro.reprov.x509.GeneralNameInterface
    public int getType() {
        return 3;
    }

    @Override // ru.CryptoPro.reprov.x509.GeneralNameInterface
    public int subtreeDepth() throws UnsupportedOperationException {
        throw new UnsupportedOperationException("subtreeDepth not supported for X400Address");
    }

    public String toString() {
        return "X400Address: <DER-encoded value>";
    }

    public X400Address(byte[] bArr) {
        this.nameValue = bArr;
    }
}
