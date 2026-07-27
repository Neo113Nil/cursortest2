package y8;

import com.icefishing.icefishinglive2.AbstractC4404f;
import java.nio.charset.Charset;
import v7.AbstractC5128i;

/* loaded from: classes2.dex */
public final class u extends h {

    /* renamed from: x, reason: collision with root package name */
    public final transient byte[][] f41994x;

    /* renamed from: y, reason: collision with root package name */
    public final transient int[] f41995y;

    public u(byte[][] bArr, int[] iArr) {
        super(h.f41951w.f41952n);
        this.f41994x = bArr;
        this.f41995y = iArr;
    }

    @Override // y8.h
    public final int a() {
        return this.f41995y[this.f41994x.length - 1];
    }

    @Override // y8.h
    public final String c() {
        return new h(k()).c();
    }

    @Override // y8.h
    public final byte[] d() {
        return k();
    }

    @Override // y8.h
    public final byte e(int i) {
        byte[][] bArr = this.f41994x;
        int length = bArr.length - 1;
        int[] iArr = this.f41995y;
        b.d(iArr[length], i, 1L);
        int b9 = z8.b.b(this, i);
        return bArr[b9][(i - (b9 == 0 ? 0 : iArr[b9 - 1])) + iArr[bArr.length + b9]];
    }

    @Override // y8.h
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return hVar.a() == a() && g(hVar, a());
    }

    @Override // y8.h
    public final boolean f(int i, int i6, int i9, byte[] other) {
        kotlin.jvm.internal.h.e(other, "other");
        if (i < 0 || i > a() - i9 || i6 < 0 || i6 > other.length - i9) {
            return false;
        }
        int i10 = i9 + i;
        int b9 = z8.b.b(this, i);
        while (i < i10) {
            int[] iArr = this.f41995y;
            int i11 = b9 == 0 ? 0 : iArr[b9 - 1];
            int i12 = iArr[b9] - i11;
            byte[][] bArr = this.f41994x;
            int i13 = iArr[bArr.length + b9];
            int min = Math.min(i10, i12 + i11) - i;
            if (!b.a(bArr[b9], (i - i11) + i13, other, i6, min)) {
                return false;
            }
            i6 += min;
            i += min;
            b9++;
        }
        return true;
    }

    @Override // y8.h
    public final boolean g(h other, int i) {
        kotlin.jvm.internal.h.e(other, "other");
        if (a() - i >= 0) {
            int b9 = z8.b.b(this, 0);
            int i6 = 0;
            int i9 = 0;
            while (i6 < i) {
                int[] iArr = this.f41995y;
                int i10 = b9 == 0 ? 0 : iArr[b9 - 1];
                int i11 = iArr[b9] - i10;
                byte[][] bArr = this.f41994x;
                int i12 = iArr[bArr.length + b9];
                int min = Math.min(i, i11 + i10) - i6;
                if (other.f(i9, (i6 - i10) + i12, min, bArr[b9])) {
                    i9 += min;
                    i6 += min;
                    b9++;
                }
            }
            return true;
        }
        return false;
    }

    @Override // y8.h
    public final String h(Charset charset) {
        kotlin.jvm.internal.h.e(charset, "charset");
        return new h(k()).h(charset);
    }

    @Override // y8.h
    public final int hashCode() {
        int i = this.f41953u;
        if (i != 0) {
            return i;
        }
        byte[][] bArr = this.f41994x;
        int length = bArr.length;
        int i6 = 0;
        int i9 = 1;
        int i10 = 0;
        while (i6 < length) {
            int[] iArr = this.f41995y;
            int i11 = iArr[length + i6];
            int i12 = iArr[i6];
            byte[] bArr2 = bArr[i6];
            int i13 = (i12 - i10) + i11;
            while (i11 < i13) {
                i9 = (i9 * 31) + bArr2[i11];
                i11++;
            }
            i6++;
            i10 = i12;
        }
        this.f41953u = i9;
        return i9;
    }

    @Override // y8.h
    public final h i(int i, int i6) {
        if (i6 == -1234567890) {
            i6 = a();
        }
        if (i < 0) {
            throw new IllegalArgumentException(D.y.k(i, "beginIndex=", " < 0").toString());
        }
        if (i6 > a()) {
            StringBuilder i9 = AbstractC4404f.i(i6, "endIndex=", " > length(");
            i9.append(a());
            i9.append(')');
            throw new IllegalArgumentException(i9.toString().toString());
        }
        int i10 = i6 - i;
        if (i10 < 0) {
            throw new IllegalArgumentException(u1.h.c(i6, i, "endIndex=", " < beginIndex=").toString());
        }
        if (i == 0 && i6 == a()) {
            return this;
        }
        if (i == i6) {
            return h.f41951w;
        }
        int b9 = z8.b.b(this, i);
        int b10 = z8.b.b(this, i6 - 1);
        byte[][] bArr = this.f41994x;
        byte[][] bArr2 = (byte[][]) AbstractC5128i.u(bArr, b9, b10 + 1);
        int[] iArr = new int[bArr2.length * 2];
        int[] iArr2 = this.f41995y;
        if (b9 <= b10) {
            int i11 = b9;
            int i12 = 0;
            while (true) {
                iArr[i12] = Math.min(iArr2[i11] - i, i10);
                int i13 = i12 + 1;
                iArr[i12 + bArr2.length] = iArr2[bArr.length + i11];
                if (i11 == b10) {
                    break;
                }
                i11++;
                i12 = i13;
            }
        }
        int i14 = b9 != 0 ? iArr2[b9 - 1] : 0;
        int length = bArr2.length;
        iArr[length] = (i - i14) + iArr[length];
        return new u(bArr2, iArr);
    }

    @Override // y8.h
    public final h j() {
        return new h(k()).j();
    }

    @Override // y8.h
    public final byte[] k() {
        byte[] bArr = new byte[a()];
        byte[][] bArr2 = this.f41994x;
        int length = bArr2.length;
        int i = 0;
        int i6 = 0;
        int i9 = 0;
        while (i < length) {
            int[] iArr = this.f41995y;
            int i10 = iArr[length + i];
            int i11 = iArr[i];
            int i12 = i11 - i6;
            AbstractC5128i.s(bArr2[i], i9, bArr, i10, i10 + i12);
            i9 += i12;
            i++;
            i6 = i11;
        }
        return bArr;
    }

    @Override // y8.h
    public final void m(e buffer, int i) {
        kotlin.jvm.internal.h.e(buffer, "buffer");
        int b9 = z8.b.b(this, 0);
        int i6 = 0;
        while (i6 < i) {
            int[] iArr = this.f41995y;
            int i9 = b9 == 0 ? 0 : iArr[b9 - 1];
            int i10 = iArr[b9] - i9;
            byte[][] bArr = this.f41994x;
            int i11 = iArr[bArr.length + b9];
            int min = Math.min(i, i10 + i9) - i6;
            int i12 = (i6 - i9) + i11;
            s sVar = new s(bArr[b9], i12, i12 + min, true);
            s sVar2 = buffer.f41949n;
            if (sVar2 == null) {
                sVar.f41990g = sVar;
                sVar.f41989f = sVar;
                buffer.f41949n = sVar;
            } else {
                s sVar3 = sVar2.f41990g;
                kotlin.jvm.internal.h.b(sVar3);
                sVar3.b(sVar);
            }
            i6 += min;
            b9++;
        }
        buffer.f41950u += i;
    }

    @Override // y8.h
    public final String toString() {
        return new h(k()).toString();
    }
}
