package y8;

import com.google.android.gms.internal.ads.Wv;
import java.nio.charset.Charset;
import v7.AbstractC5118i;
import w.AbstractC5128c;

/* loaded from: classes2.dex */
public final class u extends h {

    /* renamed from: x, reason: collision with root package name */
    public final transient byte[][] f41968x;

    /* renamed from: y, reason: collision with root package name */
    public final transient int[] f41969y;

    public u(byte[][] bArr, int[] iArr) {
        super(h.f41925w.f41926n);
        this.f41968x = bArr;
        this.f41969y = iArr;
    }

    @Override // y8.h
    public final int a() {
        return this.f41969y[this.f41968x.length - 1];
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
        byte[][] bArr = this.f41968x;
        int length = bArr.length - 1;
        int[] iArr = this.f41969y;
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
    public final boolean f(int i, int i4, int i6, byte[] other) {
        kotlin.jvm.internal.h.e(other, "other");
        if (i < 0 || i > a() - i6 || i4 < 0 || i4 > other.length - i6) {
            return false;
        }
        int i9 = i6 + i;
        int b9 = z8.b.b(this, i);
        while (i < i9) {
            int[] iArr = this.f41969y;
            int i10 = b9 == 0 ? 0 : iArr[b9 - 1];
            int i11 = iArr[b9] - i10;
            byte[][] bArr = this.f41968x;
            int i12 = iArr[bArr.length + b9];
            int min = Math.min(i9, i11 + i10) - i;
            if (!b.a(bArr[b9], (i - i10) + i12, other, i4, min)) {
                return false;
            }
            i4 += min;
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
            int i4 = 0;
            int i6 = 0;
            while (i4 < i) {
                int[] iArr = this.f41969y;
                int i9 = b9 == 0 ? 0 : iArr[b9 - 1];
                int i10 = iArr[b9] - i9;
                byte[][] bArr = this.f41968x;
                int i11 = iArr[bArr.length + b9];
                int min = Math.min(i, i10 + i9) - i4;
                if (other.f(i6, (i4 - i9) + i11, min, bArr[b9])) {
                    i6 += min;
                    i4 += min;
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
        int i = this.f41927u;
        if (i != 0) {
            return i;
        }
        byte[][] bArr = this.f41968x;
        int length = bArr.length;
        int i4 = 0;
        int i6 = 1;
        int i9 = 0;
        while (i4 < length) {
            int[] iArr = this.f41969y;
            int i10 = iArr[length + i4];
            int i11 = iArr[i4];
            byte[] bArr2 = bArr[i4];
            int i12 = (i11 - i9) + i10;
            while (i10 < i12) {
                i6 = (i6 * 31) + bArr2[i10];
                i10++;
            }
            i4++;
            i9 = i11;
        }
        this.f41927u = i6;
        return i6;
    }

    @Override // y8.h
    public final h i(int i, int i4) {
        if (i4 == -1234567890) {
            i4 = a();
        }
        if (i < 0) {
            throw new IllegalArgumentException(D.x.j(i, "beginIndex=", " < 0").toString());
        }
        if (i4 > a()) {
            StringBuilder k9 = Wv.k(i4, "endIndex=", " > length(");
            k9.append(a());
            k9.append(')');
            throw new IllegalArgumentException(k9.toString().toString());
        }
        int i6 = i4 - i;
        if (i6 < 0) {
            throw new IllegalArgumentException(AbstractC5128c.c(i4, i, "endIndex=", " < beginIndex=").toString());
        }
        if (i == 0 && i4 == a()) {
            return this;
        }
        if (i == i4) {
            return h.f41925w;
        }
        int b9 = z8.b.b(this, i);
        int b10 = z8.b.b(this, i4 - 1);
        byte[][] bArr = this.f41968x;
        byte[][] bArr2 = (byte[][]) AbstractC5118i.x(bArr, b9, b10 + 1);
        int[] iArr = new int[bArr2.length * 2];
        int[] iArr2 = this.f41969y;
        if (b9 <= b10) {
            int i9 = b9;
            int i10 = 0;
            while (true) {
                iArr[i10] = Math.min(iArr2[i9] - i, i6);
                int i11 = i10 + 1;
                iArr[i10 + bArr2.length] = iArr2[bArr.length + i9];
                if (i9 == b10) {
                    break;
                }
                i9++;
                i10 = i11;
            }
        }
        int i12 = b9 != 0 ? iArr2[b9 - 1] : 0;
        int length = bArr2.length;
        iArr[length] = (i - i12) + iArr[length];
        return new u(bArr2, iArr);
    }

    @Override // y8.h
    public final h j() {
        return new h(k()).j();
    }

    @Override // y8.h
    public final byte[] k() {
        byte[] bArr = new byte[a()];
        byte[][] bArr2 = this.f41968x;
        int length = bArr2.length;
        int i = 0;
        int i4 = 0;
        int i6 = 0;
        while (i < length) {
            int[] iArr = this.f41969y;
            int i9 = iArr[length + i];
            int i10 = iArr[i];
            int i11 = i10 - i4;
            AbstractC5118i.v(bArr2[i], i6, bArr, i9, i9 + i11);
            i6 += i11;
            i++;
            i4 = i10;
        }
        return bArr;
    }

    @Override // y8.h
    public final void m(e buffer, int i) {
        kotlin.jvm.internal.h.e(buffer, "buffer");
        int b9 = z8.b.b(this, 0);
        int i4 = 0;
        while (i4 < i) {
            int[] iArr = this.f41969y;
            int i6 = b9 == 0 ? 0 : iArr[b9 - 1];
            int i9 = iArr[b9] - i6;
            byte[][] bArr = this.f41968x;
            int i10 = iArr[bArr.length + b9];
            int min = Math.min(i, i9 + i6) - i4;
            int i11 = (i4 - i6) + i10;
            s sVar = new s(bArr[b9], i11, i11 + min, true);
            s sVar2 = buffer.f41923n;
            if (sVar2 == null) {
                sVar.f41964g = sVar;
                sVar.f41963f = sVar;
                buffer.f41923n = sVar;
            } else {
                s sVar3 = sVar2.f41964g;
                kotlin.jvm.internal.h.b(sVar3);
                sVar3.b(sVar);
            }
            i4 += min;
            b9++;
        }
        buffer.f41924u += i;
    }

    @Override // y8.h
    public final String toString() {
        return new h(k()).toString();
    }
}
