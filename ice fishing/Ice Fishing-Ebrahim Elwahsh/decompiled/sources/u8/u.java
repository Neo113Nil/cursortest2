package u8;

import com.google.android.gms.internal.ads.CL;
import java.nio.charset.Charset;
import r7.AbstractC4978i;
import t0.AbstractC5051n;

/* loaded from: classes2.dex */
public final class u extends h {

    /* renamed from: x, reason: collision with root package name */
    public final transient byte[][] f41321x;

    /* renamed from: y, reason: collision with root package name */
    public final transient int[] f41322y;

    public u(byte[][] bArr, int[] iArr) {
        super(h.f41278w.f41279n);
        this.f41321x = bArr;
        this.f41322y = iArr;
    }

    @Override // u8.h
    public final int a() {
        return this.f41322y[this.f41321x.length - 1];
    }

    @Override // u8.h
    public final String c() {
        return new h(k()).c();
    }

    @Override // u8.h
    public final byte[] d() {
        return k();
    }

    @Override // u8.h
    public final byte e(int i) {
        byte[][] bArr = this.f41321x;
        int length = bArr.length - 1;
        int[] iArr = this.f41322y;
        b.d(iArr[length], i, 1L);
        int b9 = v8.b.b(this, i);
        return bArr[b9][(i - (b9 == 0 ? 0 : iArr[b9 - 1])) + iArr[bArr.length + b9]];
    }

    @Override // u8.h
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

    @Override // u8.h
    public final boolean f(int i, int i4, int i9, byte[] other) {
        kotlin.jvm.internal.h.e(other, "other");
        if (i < 0 || i > a() - i9 || i4 < 0 || i4 > other.length - i9) {
            return false;
        }
        int i10 = i9 + i;
        int b9 = v8.b.b(this, i);
        while (i < i10) {
            int[] iArr = this.f41322y;
            int i11 = b9 == 0 ? 0 : iArr[b9 - 1];
            int i12 = iArr[b9] - i11;
            byte[][] bArr = this.f41321x;
            int i13 = iArr[bArr.length + b9];
            int min = Math.min(i10, i12 + i11) - i;
            if (!b.a(bArr[b9], (i - i11) + i13, other, i4, min)) {
                return false;
            }
            i4 += min;
            i += min;
            b9++;
        }
        return true;
    }

    @Override // u8.h
    public final boolean g(h other, int i) {
        kotlin.jvm.internal.h.e(other, "other");
        if (a() - i >= 0) {
            int b9 = v8.b.b(this, 0);
            int i4 = 0;
            int i9 = 0;
            while (i4 < i) {
                int[] iArr = this.f41322y;
                int i10 = b9 == 0 ? 0 : iArr[b9 - 1];
                int i11 = iArr[b9] - i10;
                byte[][] bArr = this.f41321x;
                int i12 = iArr[bArr.length + b9];
                int min = Math.min(i, i11 + i10) - i4;
                if (other.f(i9, (i4 - i10) + i12, min, bArr[b9])) {
                    i9 += min;
                    i4 += min;
                    b9++;
                }
            }
            return true;
        }
        return false;
    }

    @Override // u8.h
    public final String h(Charset charset) {
        kotlin.jvm.internal.h.e(charset, "charset");
        return new h(k()).h(charset);
    }

    @Override // u8.h
    public final int hashCode() {
        int i = this.f41280u;
        if (i != 0) {
            return i;
        }
        byte[][] bArr = this.f41321x;
        int length = bArr.length;
        int i4 = 0;
        int i9 = 1;
        int i10 = 0;
        while (i4 < length) {
            int[] iArr = this.f41322y;
            int i11 = iArr[length + i4];
            int i12 = iArr[i4];
            byte[] bArr2 = bArr[i4];
            int i13 = (i12 - i10) + i11;
            while (i11 < i13) {
                i9 = (i9 * 31) + bArr2[i11];
                i11++;
            }
            i4++;
            i10 = i12;
        }
        this.f41280u = i9;
        return i9;
    }

    @Override // u8.h
    public final h i(int i, int i4) {
        if (i4 == -1234567890) {
            i4 = a();
        }
        if (i < 0) {
            throw new IllegalArgumentException(D.y.i(i, "beginIndex=", " < 0").toString());
        }
        if (i4 > a()) {
            StringBuilder l9 = CL.l(i4, "endIndex=", " > length(");
            l9.append(a());
            l9.append(')');
            throw new IllegalArgumentException(l9.toString().toString());
        }
        int i9 = i4 - i;
        if (i9 < 0) {
            throw new IllegalArgumentException(AbstractC5051n.c(i4, i, "endIndex=", " < beginIndex=").toString());
        }
        if (i == 0 && i4 == a()) {
            return this;
        }
        if (i == i4) {
            return h.f41278w;
        }
        int b9 = v8.b.b(this, i);
        int b10 = v8.b.b(this, i4 - 1);
        byte[][] bArr = this.f41321x;
        byte[][] bArr2 = (byte[][]) AbstractC4978i.L(bArr, b9, b10 + 1);
        int[] iArr = new int[bArr2.length * 2];
        int[] iArr2 = this.f41322y;
        if (b9 <= b10) {
            int i10 = b9;
            int i11 = 0;
            while (true) {
                iArr[i11] = Math.min(iArr2[i10] - i, i9);
                int i12 = i11 + 1;
                iArr[i11 + bArr2.length] = iArr2[bArr.length + i10];
                if (i10 == b10) {
                    break;
                }
                i10++;
                i11 = i12;
            }
        }
        int i13 = b9 != 0 ? iArr2[b9 - 1] : 0;
        int length = bArr2.length;
        iArr[length] = (i - i13) + iArr[length];
        return new u(bArr2, iArr);
    }

    @Override // u8.h
    public final h j() {
        return new h(k()).j();
    }

    @Override // u8.h
    public final byte[] k() {
        byte[] bArr = new byte[a()];
        byte[][] bArr2 = this.f41321x;
        int length = bArr2.length;
        int i = 0;
        int i4 = 0;
        int i9 = 0;
        while (i < length) {
            int[] iArr = this.f41322y;
            int i10 = iArr[length + i];
            int i11 = iArr[i];
            int i12 = i11 - i4;
            AbstractC4978i.J(bArr2[i], i9, bArr, i10, i10 + i12);
            i9 += i12;
            i++;
            i4 = i11;
        }
        return bArr;
    }

    @Override // u8.h
    public final void m(e buffer, int i) {
        kotlin.jvm.internal.h.e(buffer, "buffer");
        int b9 = v8.b.b(this, 0);
        int i4 = 0;
        while (i4 < i) {
            int[] iArr = this.f41322y;
            int i9 = b9 == 0 ? 0 : iArr[b9 - 1];
            int i10 = iArr[b9] - i9;
            byte[][] bArr = this.f41321x;
            int i11 = iArr[bArr.length + b9];
            int min = Math.min(i, i10 + i9) - i4;
            int i12 = (i4 - i9) + i11;
            s sVar = new s(bArr[b9], i12, i12 + min, true);
            s sVar2 = buffer.f41276n;
            if (sVar2 == null) {
                sVar.f41317g = sVar;
                sVar.f41316f = sVar;
                buffer.f41276n = sVar;
            } else {
                s sVar3 = sVar2.f41317g;
                kotlin.jvm.internal.h.b(sVar3);
                sVar3.b(sVar);
            }
            i4 += min;
            b9++;
        }
        buffer.f41277u += i;
    }

    @Override // u8.h
    public final String toString() {
        return new h(k()).toString();
    }
}
