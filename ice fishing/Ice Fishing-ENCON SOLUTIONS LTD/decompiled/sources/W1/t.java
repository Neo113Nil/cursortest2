package W1;

import a.AbstractC0083a;
import i1.AbstractC0251h;

/* loaded from: classes.dex */
public final class t extends j {

    /* renamed from: e, reason: collision with root package name */
    public final transient byte[][] f1908e;

    /* renamed from: f, reason: collision with root package name */
    public final transient int[] f1909f;

    public t(byte[][] bArr, int[] iArr) {
        super(j.f1876d.f1877a);
        this.f1908e = bArr;
        this.f1909f = iArr;
    }

    @Override // W1.j
    public final int a() {
        return this.f1909f[this.f1908e.length - 1];
    }

    @Override // W1.j
    public final String b() {
        return new j(j()).b();
    }

    @Override // W1.j
    public final byte[] c() {
        return j();
    }

    @Override // W1.j
    public final byte d(int i2) {
        byte[][] bArr = this.f1908e;
        int length = bArr.length - 1;
        int[] iArr = this.f1909f;
        AbstractC0083a.d(iArr[length], i2, 1L);
        int b2 = X1.b.b(this, i2);
        return bArr[b2][(i2 - (b2 == 0 ? 0 : iArr[b2 - 1])) + iArr[bArr.length + b2]];
    }

    @Override // W1.j
    public final boolean e(int i2, byte[] other, int i3, int i4) {
        kotlin.jvm.internal.i.e(other, "other");
        if (i2 < 0 || i2 > a() - i4 || i3 < 0 || i3 > other.length - i4) {
            return false;
        }
        int i5 = i4 + i2;
        int b2 = X1.b.b(this, i2);
        while (i2 < i5) {
            int[] iArr = this.f1909f;
            int i6 = b2 == 0 ? 0 : iArr[b2 - 1];
            int i7 = iArr[b2] - i6;
            byte[][] bArr = this.f1908e;
            int i8 = iArr[bArr.length + b2];
            int min = Math.min(i5, i7 + i6) - i2;
            if (!AbstractC0083a.c((i2 - i6) + i8, i3, min, bArr[b2], other)) {
                return false;
            }
            i3 += min;
            i2 += min;
            b2++;
        }
        return true;
    }

    @Override // W1.j
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof j) {
            j jVar = (j) obj;
            if (jVar.a() == a() && f(jVar, a())) {
                return true;
            }
        }
        return false;
    }

    @Override // W1.j
    public final boolean f(j other, int i2) {
        kotlin.jvm.internal.i.e(other, "other");
        if (a() - i2 < 0) {
            return false;
        }
        int b2 = X1.b.b(this, 0);
        int i3 = 0;
        int i4 = 0;
        while (i3 < i2) {
            int[] iArr = this.f1909f;
            int i5 = b2 == 0 ? 0 : iArr[b2 - 1];
            int i6 = iArr[b2] - i5;
            byte[][] bArr = this.f1908e;
            int i7 = iArr[bArr.length + b2];
            int min = Math.min(i2, i6 + i5) - i3;
            if (!other.e(i4, bArr[b2], (i3 - i5) + i7, min)) {
                return false;
            }
            i4 += min;
            i3 += min;
            b2++;
        }
        return true;
    }

    @Override // W1.j
    public final j g() {
        return new j(j()).g();
    }

    @Override // W1.j
    public final int hashCode() {
        int i2 = this.f1878b;
        if (i2 != 0) {
            return i2;
        }
        byte[][] bArr = this.f1908e;
        int length = bArr.length;
        int i3 = 0;
        int i4 = 1;
        int i5 = 0;
        while (i3 < length) {
            int[] iArr = this.f1909f;
            int i6 = iArr[length + i3];
            int i7 = iArr[i3];
            byte[] bArr2 = bArr[i3];
            int i8 = (i7 - i5) + i6;
            while (i6 < i8) {
                i4 = (i4 * 31) + bArr2[i6];
                i6++;
            }
            i3++;
            i5 = i7;
        }
        this.f1878b = i4;
        return i4;
    }

    @Override // W1.j
    public final void i(g buffer, int i2) {
        kotlin.jvm.internal.i.e(buffer, "buffer");
        int b2 = X1.b.b(this, 0);
        int i3 = 0;
        while (i3 < i2) {
            int[] iArr = this.f1909f;
            int i4 = b2 == 0 ? 0 : iArr[b2 - 1];
            int i5 = iArr[b2] - i4;
            byte[][] bArr = this.f1908e;
            int i6 = iArr[bArr.length + b2];
            int min = Math.min(i2, i5 + i4) - i3;
            int i7 = (i3 - i4) + i6;
            r rVar = new r(bArr[b2], i7, i7 + min, true);
            r rVar2 = buffer.f1874a;
            if (rVar2 == null) {
                rVar.f1904g = rVar;
                rVar.f1903f = rVar;
                buffer.f1874a = rVar;
            } else {
                r rVar3 = rVar2.f1904g;
                kotlin.jvm.internal.i.b(rVar3);
                rVar3.b(rVar);
            }
            i3 += min;
            b2++;
        }
        buffer.f1875b += i2;
    }

    public final byte[] j() {
        byte[] bArr = new byte[a()];
        byte[][] bArr2 = this.f1908e;
        int length = bArr2.length;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i2 < length) {
            int[] iArr = this.f1909f;
            int i5 = iArr[length + i2];
            int i6 = iArr[i2];
            int i7 = i6 - i3;
            AbstractC0251h.M(i4, i5, i5 + i7, bArr2[i2], bArr);
            i4 += i7;
            i2++;
            i3 = i6;
        }
        return bArr;
    }

    @Override // W1.j
    public final String toString() {
        return new j(j()).toString();
    }
}
