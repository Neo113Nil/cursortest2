package ru.CryptoPro.ssl;

import java.security.PublicKey;
import java.security.interfaces.ECPublicKey;

/* loaded from: classes4.dex */
final class cl_24 extends cl_47 {
    public byte[] b;

    public cl_24(PublicKey publicKey) {
        ECPublicKey eCPublicKey = (ECPublicKey) publicKey;
        this.b = cl_73.d(eCPublicKey.getW(), eCPublicKey.getParams().getCurve());
    }

    @Override // ru.CryptoPro.ssl.cl_47
    public final void a(cl_62 cl_62Var) {
        cl_62Var.d(this.b);
    }

    @Override // ru.CryptoPro.ssl.cl_47
    public final int c() {
        return this.b.length + 1;
    }

    @Override // ru.CryptoPro.ssl.cl_47
    public final String d() {
        StringBuffer stringBuffer = new StringBuffer("*** ECDHClientKeyExchange\n");
        stringBuffer.append(cl_47.a("ECDH Public value", this.b));
        return stringBuffer.toString();
    }

    @Override // ru.CryptoPro.ssl.cl_47
    public final int a() {
        return 16;
    }
}
