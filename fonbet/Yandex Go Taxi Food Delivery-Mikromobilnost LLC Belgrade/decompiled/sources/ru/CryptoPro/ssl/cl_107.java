package ru.CryptoPro.ssl;

/* loaded from: classes4.dex */
final class cl_107 extends cl_66 {
    public byte[] e;

    @Override // ru.CryptoPro.ssl.cl_66
    public final void a(cl_62 cl_62Var) {
        cl_62Var.e(this.d.a);
        byte[] bArr = this.e;
        if (bArr == null) {
            cl_62Var.e(0);
        } else {
            cl_62Var.b(bArr);
        }
    }

    @Override // ru.CryptoPro.ssl.cl_66
    public final int b() {
        byte[] bArr = this.e;
        if (bArr == null) {
            return 4;
        }
        return bArr.length + 4;
    }

    @Override // ru.CryptoPro.ssl.cl_66
    public String toString() {
        return "Extension " + this.d;
    }
}
