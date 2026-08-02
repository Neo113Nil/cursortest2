package ru.CryptoPro.ssl;

/* loaded from: classes4.dex */
final class cl_20 extends cl_47 {
    public byte[] b;

    @Override // ru.CryptoPro.ssl.cl_47
    public final void a(cl_62 cl_62Var) {
        byte[] bArr = this.b;
        if (bArr == null || bArr.length == 0) {
            return;
        }
        cl_62Var.b(bArr);
    }

    @Override // ru.CryptoPro.ssl.cl_47
    public final int c() {
        byte[] bArr = this.b;
        if (bArr == null) {
            return 0;
        }
        return bArr.length + 2;
    }

    @Override // ru.CryptoPro.ssl.cl_47
    public final String d() {
        StringBuffer stringBuffer = new StringBuffer("*** ClientKeyExchange, DH\n");
        stringBuffer.append(cl_47.a("DH Public key", this.b));
        return stringBuffer.toString();
    }

    @Override // ru.CryptoPro.ssl.cl_47
    public final int a() {
        return 16;
    }
}
