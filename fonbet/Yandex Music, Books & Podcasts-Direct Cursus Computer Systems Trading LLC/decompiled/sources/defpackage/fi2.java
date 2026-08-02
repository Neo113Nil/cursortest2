package defpackage;

/* loaded from: classes5.dex */
public final class fi2 extends o0 {
    public final int d;
    public final o0[] e;

    public fi2(byte[] bArr, o0[] o0VarArr) {
        super(bArr);
        this.e = o0VarArr;
        this.d = 1000;
    }

    public static byte[] D(o0[] o0VarArr) {
        int length = o0VarArr.length;
        if (length == 0) {
            return o0.c;
        }
        if (length == 1) {
            return o0VarArr[0].a;
        }
        int i = 0;
        for (o0 o0Var : o0VarArr) {
            i += o0Var.a.length;
        }
        byte[] bArr = new byte[i];
        int i2 = 0;
        for (o0 o0Var2 : o0VarArr) {
            byte[] bArr2 = o0Var2.a;
            System.arraycopy(bArr2, 0, bArr, i2, bArr2.length);
            i2 += bArr2.length;
        }
        return bArr;
    }

    @Override // defpackage.s0
    public final void u(qxp qxpVar, boolean z) {
        boolean v = v();
        byte[] bArr = this.a;
        if (!v) {
            int length = bArr.length;
            qxpVar.A(4, z);
            qxpVar.t(length);
            qxpVar.s(bArr, 0, length);
            return;
        }
        qxpVar.A(36, z);
        qxpVar.q(128);
        o0[] o0VarArr = this.e;
        if (o0VarArr != null) {
            qxpVar.C(o0VarArr);
        } else {
            int i = 0;
            while (i < bArr.length) {
                int min = Math.min(bArr.length - i, this.d);
                qxpVar.A(4, true);
                qxpVar.t(min);
                qxpVar.s(bArr, i, min);
                i += min;
            }
        }
        qxpVar.q(0);
        qxpVar.q(0);
    }

    @Override // defpackage.s0
    public final boolean v() {
        return this.e != null || this.a.length > this.d;
    }

    @Override // defpackage.s0
    public final int w(boolean z) {
        boolean v = v();
        byte[] bArr = this.a;
        if (!v) {
            return qxp.n(bArr.length, z);
        }
        int i = z ? 4 : 3;
        o0[] o0VarArr = this.e;
        if (o0VarArr != null) {
            for (o0 o0Var : o0VarArr) {
                i += o0Var.w(true);
            }
            return i;
        }
        int length = bArr.length;
        int i2 = this.d;
        int i3 = length / i2;
        int n = (qxp.n(i2, true) * i3) + i;
        int length2 = bArr.length - (i3 * i2);
        return length2 > 0 ? qxp.n(length2, true) + n : n;
    }
}
