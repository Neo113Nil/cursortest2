package defpackage;

import java.security.MessageDigest;

/* loaded from: classes5.dex */
public final class mbp extends pn3 {
    public final transient byte[][] e;
    public final transient int[] f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mbp(byte[][] bArr, int[] iArr) {
        super(pn3.d.a);
        bArr.getClass();
        this.e = bArr;
        this.f = iArr;
    }

    private final Object writeReplace() {
        return w();
    }

    @Override // defpackage.pn3
    public final String a() {
        return w().a();
    }

    @Override // defpackage.pn3
    public final pn3 c(String str) {
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        byte[][] bArr = this.e;
        int length = bArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int[] iArr = this.f;
            int i3 = iArr[length + i];
            int i4 = iArr[i];
            messageDigest.update(bArr[i], i3, i4 - i2);
            i++;
            i2 = i4;
        }
        byte[] digest = messageDigest.digest();
        digest.getClass();
        return new pn3(digest);
    }

    @Override // defpackage.pn3
    public final int d() {
        return this.f[this.e.length - 1];
    }

    @Override // defpackage.pn3
    public final String e() {
        return w().e();
    }

    @Override // defpackage.pn3
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof pn3) {
            pn3 pn3Var = (pn3) obj;
            if (pn3Var.d() == d() && p(0, pn3Var, d())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.pn3
    public final pn3 f(pn3 pn3Var) {
        throw null;
    }

    @Override // defpackage.pn3
    public final int g(int i, byte[] bArr) {
        bArr.getClass();
        return w().g(i, bArr);
    }

    @Override // defpackage.pn3
    public final int hashCode() {
        int i = this.b;
        if (i != 0) {
            return i;
        }
        byte[][] bArr = this.e;
        int length = bArr.length;
        int i2 = 0;
        int i3 = 1;
        int i4 = 0;
        while (i2 < length) {
            int[] iArr = this.f;
            int i5 = iArr[length + i2];
            int i6 = iArr[i2];
            byte[] bArr2 = bArr[i2];
            int i7 = (i6 - i4) + i5;
            while (i5 < i7) {
                i3 = (i3 * 31) + bArr2[i5];
                i5++;
            }
            i2++;
            i4 = i6;
        }
        this.b = i3;
        return i3;
    }

    @Override // defpackage.pn3
    public final byte[] i() {
        return t();
    }

    @Override // defpackage.pn3
    public final byte k(int i) {
        byte[][] bArr = this.e;
        int length = bArr.length - 1;
        int[] iArr = this.f;
        ox6.A(iArr[length], i, 1L);
        int F = ghh.F(this, i);
        return bArr[F][(i - (F == 0 ? 0 : iArr[F - 1])) + iArr[bArr.length + F]];
    }

    @Override // defpackage.pn3
    public final int l(byte[] bArr) {
        bArr.getClass();
        return w().l(bArr);
    }

    @Override // defpackage.pn3
    public final boolean o(int i, int i2, int i3, byte[] bArr) {
        bArr.getClass();
        if (i < 0 || i > d() - i3 || i2 < 0 || i2 > bArr.length - i3) {
            return false;
        }
        int i4 = i3 + i;
        int F = ghh.F(this, i);
        while (i < i4) {
            int[] iArr = this.f;
            int i5 = F == 0 ? 0 : iArr[F - 1];
            int i6 = iArr[F] - i5;
            byte[][] bArr2 = this.e;
            int i7 = iArr[bArr2.length + F];
            int min = Math.min(i4, i6 + i5) - i;
            if (!ox6.u((i - i5) + i7, i2, min, bArr2[F], bArr)) {
                return false;
            }
            i2 += min;
            i += min;
            F++;
        }
        return true;
    }

    @Override // defpackage.pn3
    public final boolean p(int i, pn3 pn3Var, int i2) {
        pn3Var.getClass();
        if (i >= 0 && i <= d() - i2) {
            int i3 = i2 + i;
            int F = ghh.F(this, i);
            int i4 = 0;
            while (i < i3) {
                int[] iArr = this.f;
                int i5 = F == 0 ? 0 : iArr[F - 1];
                int i6 = iArr[F] - i5;
                byte[][] bArr = this.e;
                int i7 = iArr[bArr.length + F];
                int min = Math.min(i3, i6 + i5) - i;
                if (pn3Var.o(i4, (i - i5) + i7, min, bArr[F])) {
                    i4 += min;
                    i += min;
                    F++;
                }
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.pn3
    public final pn3 q(int i, int i2) {
        if (i2 == -1234567890) {
            i2 = d();
        }
        if (i < 0) {
            xq0.o(dfi.c(i, "beginIndex=", " < 0"));
            return null;
        }
        if (i2 > d()) {
            StringBuilder q = k5r.q(i2, "endIndex=", " > length(");
            q.append(d());
            q.append(')');
            throw new IllegalArgumentException(q.toString().toString());
        }
        int i3 = i2 - i;
        if (i3 < 0) {
            xq0.o(f1d.e(i2, i, "endIndex=", " < beginIndex="));
            return null;
        }
        if (i == 0 && i2 == d()) {
            return this;
        }
        if (i == i2) {
            return pn3.d;
        }
        int F = ghh.F(this, i);
        int F2 = ghh.F(this, i2 - 1);
        byte[][] bArr = this.e;
        byte[][] bArr2 = (byte[][]) uz0.k(F, F2 + 1, bArr);
        int[] iArr = new int[bArr2.length * 2];
        int[] iArr2 = this.f;
        if (F <= F2) {
            int i4 = F;
            int i5 = 0;
            while (true) {
                iArr[i5] = Math.min(iArr2[i4] - i, i3);
                int i6 = i5 + 1;
                iArr[i5 + bArr2.length] = iArr2[bArr.length + i4];
                if (i4 == F2) {
                    break;
                }
                i4++;
                i5 = i6;
            }
        }
        int i7 = F != 0 ? iArr2[F - 1] : 0;
        int length = bArr2.length;
        iArr[length] = (i - i7) + iArr[length];
        return new mbp(bArr2, iArr);
    }

    @Override // defpackage.pn3
    public final pn3 s() {
        return w().s();
    }

    @Override // defpackage.pn3
    public final byte[] t() {
        byte[] bArr = new byte[d()];
        byte[][] bArr2 = this.e;
        int length = bArr2.length;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i < length) {
            int[] iArr = this.f;
            int i4 = iArr[length + i];
            int i5 = iArr[i];
            int i6 = i5 - i2;
            uz0.d(i3, i4, i4 + i6, bArr2[i], bArr);
            i3 += i6;
            i++;
            i2 = i5;
        }
        return bArr;
    }

    @Override // defpackage.pn3
    public final String toString() {
        return w().toString();
    }

    @Override // defpackage.pn3
    public final void v(hi3 hi3Var, int i) {
        int F = ghh.F(this, 0);
        int i2 = 0;
        while (i2 < i) {
            int[] iArr = this.f;
            int i3 = F == 0 ? 0 : iArr[F - 1];
            int i4 = iArr[F] - i3;
            byte[][] bArr = this.e;
            int i5 = iArr[bArr.length + F];
            int min = Math.min(i, i4 + i3) - i2;
            int i6 = (i2 - i3) + i5;
            xap xapVar = new xap(bArr[F], i6, i6 + min, true, false);
            xap xapVar2 = hi3Var.a;
            if (xapVar2 == null) {
                xapVar.g = xapVar;
                xapVar.f = xapVar;
                hi3Var.a = xapVar;
            } else {
                xap xapVar3 = xapVar2.g;
                xapVar3.getClass();
                xapVar3.b(xapVar);
            }
            i2 += min;
            F++;
        }
        hi3Var.b += i;
    }

    public final pn3 w() {
        return new pn3(t());
    }
}
