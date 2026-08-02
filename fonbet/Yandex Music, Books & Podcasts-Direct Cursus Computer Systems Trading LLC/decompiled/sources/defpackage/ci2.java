package defpackage;

/* loaded from: classes5.dex */
public final class ci2 extends z {
    public final int d;
    public final z[] e;

    public ci2(z[] zVarArr) {
        super(D(zVarArr), false);
        this.e = zVarArr;
        this.d = 1000;
    }

    public static byte[] D(z[] zVarArr) {
        int length = zVarArr.length;
        if (length == 0) {
            return new byte[]{0};
        }
        if (length == 1) {
            return zVarArr[0].a;
        }
        int i = length - 1;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            byte[] bArr = zVarArr[i3].a;
            if (bArr[0] != 0) {
                xq0.x("only the last nested bitstring can have padding");
                return null;
            }
            i2 += bArr.length - 1;
        }
        byte[] bArr2 = zVarArr[i].a;
        byte b = bArr2[0];
        byte[] bArr3 = new byte[i2 + bArr2.length];
        bArr3[0] = b;
        int i4 = 1;
        for (z zVar : zVarArr) {
            byte[] bArr4 = zVar.a;
            int length2 = bArr4.length - 1;
            System.arraycopy(bArr4, 1, bArr3, i4, length2);
            i4 += length2;
        }
        return bArr3;
    }

    @Override // defpackage.s0
    public final void u(qxp qxpVar, boolean z) {
        boolean v = v();
        byte[] bArr = this.a;
        if (!v) {
            int length = bArr.length;
            qxpVar.A(3, z);
            qxpVar.t(length);
            qxpVar.s(bArr, 0, length);
            return;
        }
        qxpVar.A(35, z);
        qxpVar.q(128);
        z[] zVarArr = this.e;
        if (zVarArr != null) {
            qxpVar.C(zVarArr);
        } else if (bArr.length >= 2) {
            byte b = bArr[0];
            int length2 = bArr.length;
            int i = length2 - 1;
            int i2 = this.d;
            int i3 = i2 - 1;
            while (i > i3) {
                qxpVar.q(3);
                qxpVar.t(i2);
                qxpVar.q(0);
                qxpVar.s(bArr, length2 - i, i3);
                i -= i3;
            }
            qxpVar.q(3);
            qxpVar.t(i + 1);
            qxpVar.q(b);
            qxpVar.s(bArr, length2 - i, i);
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
        z[] zVarArr = this.e;
        if (zVarArr != null) {
            for (z zVar : zVarArr) {
                i += zVar.w(true);
            }
            return i;
        }
        if (bArr.length < 2) {
            return i;
        }
        int length = bArr.length - 2;
        int i2 = this.d;
        int i3 = i2 - 1;
        int i4 = length / i3;
        return qxp.n(bArr.length - (i3 * i4), true) + (qxp.n(i2, true) * i4) + i;
    }

    public ci2(byte[] bArr, int i) {
        super(bArr, i);
        this.e = null;
        this.d = 1000;
    }
}
