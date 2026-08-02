package ru.CryptoPro.ssl;

import defpackage.dy31;
import java.util.Arrays;

/* loaded from: classes4.dex */
final class cl_89 extends cl_66 {
    public final byte[] e;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public cl_89(cl_46 cl_46Var, int i) {
        super(r0);
        cl_36 cl_36Var = cl_36.k;
        if (i < 1) {
            dy31.j(cl_36Var, " extension");
            throw null;
        }
        int c = cl_46Var.c();
        if (c + 1 != i) {
            dy31.j(cl_36Var, " extension");
            throw null;
        }
        byte[] bArr = new byte[c];
        this.e = bArr;
        if (c != 0) {
            cl_46Var.read(bArr, 0, c);
        }
    }

    @Override // ru.CryptoPro.ssl.cl_66
    public final void a(cl_62 cl_62Var) {
        cl_62Var.e(this.d.a);
        byte[] bArr = this.e;
        cl_62Var.e(bArr.length + 1);
        cl_62Var.d(bArr);
    }

    @Override // ru.CryptoPro.ssl.cl_66
    public final int b() {
        return this.e.length + 5;
    }

    public final boolean c() {
        return this.e.length == 0;
    }

    @Override // ru.CryptoPro.ssl.cl_66
    public String toString() {
        StringBuilder sb = new StringBuilder("Extension ");
        sb.append(this.d);
        sb.append(", renegotiated_connection: ");
        byte[] bArr = this.e;
        sb.append(bArr.length == 0 ? "<empty>" : Arrays.toString(bArr));
        return sb.toString();
    }

    public cl_89(byte[] bArr, byte[] bArr2) {
        super(cl_36.k);
        if (bArr.length == 0) {
            this.e = new byte[0];
            return;
        }
        byte[] bArr3 = new byte[bArr.length + bArr2.length];
        this.e = bArr3;
        System.arraycopy(bArr, 0, bArr3, 0, bArr.length);
        if (bArr2.length != 0) {
            System.arraycopy(bArr2, 0, bArr3, bArr.length, bArr2.length);
        }
    }
}
