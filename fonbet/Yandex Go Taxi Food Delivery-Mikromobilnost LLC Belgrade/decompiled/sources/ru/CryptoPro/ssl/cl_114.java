package ru.CryptoPro.ssl;

import java.util.Arrays;

/* loaded from: classes4.dex */
final class cl_114 extends cl_66 {
    public final byte[] e;

    public cl_114(cl_46 cl_46Var, int i, cl_36 cl_36Var) {
        super(cl_36Var);
        byte[] bArr = new byte[i];
        this.e = bArr;
        if (i != 0) {
            cl_46Var.read(bArr);
        }
    }

    @Override // ru.CryptoPro.ssl.cl_66
    public final void a(cl_62 cl_62Var) {
        cl_62Var.e(this.d.a);
        cl_62Var.b(this.e);
    }

    @Override // ru.CryptoPro.ssl.cl_66
    public final int b() {
        return this.e.length + 4;
    }

    @Override // ru.CryptoPro.ssl.cl_66
    public String toString() {
        return "Unsupported extension " + this.d + ", data: " + Arrays.toString(this.e);
    }
}
