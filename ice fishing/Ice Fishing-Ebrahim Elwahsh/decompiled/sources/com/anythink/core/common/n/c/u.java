package com.anythink.core.common.n.c;

import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Arrays;

/* loaded from: classes.dex */
final class u extends f {

    /* renamed from: f, reason: collision with root package name */
    final transient byte[][] f16081f;

    /* renamed from: g, reason: collision with root package name */
    final transient int[] f16082g;

    public u(c cVar, int i) {
        super(null);
        y.a(cVar.f16005c, 0L, i);
        s sVar = cVar.f16004b;
        int i4 = 0;
        int i9 = 0;
        int i10 = 0;
        while (i9 < i) {
            int i11 = sVar.f16074e;
            int i12 = sVar.f16073d;
            if (i11 == i12) {
                throw new AssertionError("s.limit == s.pos");
            }
            i9 += i11 - i12;
            i10++;
            sVar = sVar.f16077h;
        }
        this.f16081f = new byte[i10][];
        this.f16082g = new int[i10 * 2];
        s sVar2 = cVar.f16004b;
        int i13 = 0;
        while (i4 < i) {
            byte[][] bArr = this.f16081f;
            bArr[i13] = sVar2.f16072c;
            int i14 = sVar2.f16074e;
            int i15 = sVar2.f16073d;
            int i16 = (i14 - i15) + i4;
            i4 = i16 > i ? i : i16;
            int[] iArr = this.f16082g;
            iArr[i13] = i4;
            iArr[bArr.length + i13] = i15;
            sVar2.f16075f = true;
            i13++;
            sVar2 = sVar2.f16077h;
        }
    }

    private f n() {
        return new f(k());
    }

    private Object o() {
        return n();
    }

    @Override // com.anythink.core.common.n.c.f
    public final String a() {
        return n().a();
    }

    @Override // com.anythink.core.common.n.c.f
    public final String b() {
        return n().b();
    }

    @Override // com.anythink.core.common.n.c.f
    public final f c() {
        return n().c();
    }

    @Override // com.anythink.core.common.n.c.f
    public final f d() {
        return n().d();
    }

    @Override // com.anythink.core.common.n.c.f
    public final f e() {
        return n().e();
    }

    @Override // com.anythink.core.common.n.c.f
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            if (fVar.j() == j() && a(0, fVar, 0, j())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.anythink.core.common.n.c.f
    public final String f() {
        return n().f();
    }

    @Override // com.anythink.core.common.n.c.f
    public final String g() {
        return n().g();
    }

    @Override // com.anythink.core.common.n.c.f
    public final f h() {
        return n().h();
    }

    @Override // com.anythink.core.common.n.c.f
    public final int hashCode() {
        int i = this.f16019d;
        if (i != 0) {
            return i;
        }
        int length = this.f16081f.length;
        int i4 = 0;
        int i9 = 1;
        int i10 = 0;
        while (i4 < length) {
            byte[] bArr = this.f16081f[i4];
            int[] iArr = this.f16082g;
            int i11 = iArr[length + i4];
            int i12 = iArr[i4];
            int i13 = (i12 - i10) + i11;
            while (i11 < i13) {
                i9 = (i9 * 31) + bArr[i11];
                i11++;
            }
            i4++;
            i10 = i12;
        }
        this.f16019d = i9;
        return i9;
    }

    @Override // com.anythink.core.common.n.c.f
    public final f i() {
        return n().i();
    }

    @Override // com.anythink.core.common.n.c.f
    public final int j() {
        return this.f16082g[this.f16081f.length - 1];
    }

    @Override // com.anythink.core.common.n.c.f
    public final byte[] k() {
        int[] iArr = this.f16082g;
        byte[][] bArr = this.f16081f;
        byte[] bArr2 = new byte[iArr[bArr.length - 1]];
        int length = bArr.length;
        int i = 0;
        int i4 = 0;
        while (i < length) {
            int[] iArr2 = this.f16082g;
            int i9 = iArr2[length + i];
            int i10 = iArr2[i];
            System.arraycopy(this.f16081f[i], i9, bArr2, i4, i10 - i4);
            i++;
            i4 = i10;
        }
        return bArr2;
    }

    @Override // com.anythink.core.common.n.c.f
    public final byte[] l() {
        return k();
    }

    @Override // com.anythink.core.common.n.c.f
    public final ByteBuffer m() {
        return ByteBuffer.wrap(k()).asReadOnlyBuffer();
    }

    @Override // com.anythink.core.common.n.c.f
    public final String toString() {
        return n().toString();
    }

    private int c(int i) {
        int binarySearch = Arrays.binarySearch(this.f16082g, 0, this.f16081f.length, i + 1);
        return binarySearch >= 0 ? binarySearch : ~binarySearch;
    }

    @Override // com.anythink.core.common.n.c.f
    public final String a(Charset charset) {
        return n().a(charset);
    }

    @Override // com.anythink.core.common.n.c.f
    public final f b(f fVar) {
        return n().b(fVar);
    }

    @Override // com.anythink.core.common.n.c.f
    public final f a(f fVar) {
        return n().a(fVar);
    }

    @Override // com.anythink.core.common.n.c.f
    public final byte b(int i) {
        y.a(this.f16082g[this.f16081f.length - 1], i, 1L);
        int c4 = c(i);
        int i4 = c4 == 0 ? 0 : this.f16082g[c4 - 1];
        int[] iArr = this.f16082g;
        byte[][] bArr = this.f16081f;
        return bArr[c4][(i - i4) + iArr[bArr.length + c4]];
    }

    @Override // com.anythink.core.common.n.c.f
    public final f a(int i) {
        return n().a(i);
    }

    @Override // com.anythink.core.common.n.c.f
    public final f a(int i, int i4) {
        return n().a(i, i4);
    }

    @Override // com.anythink.core.common.n.c.f
    public final void a(OutputStream outputStream) {
        if (outputStream != null) {
            int length = this.f16081f.length;
            int i = 0;
            int i4 = 0;
            while (i < length) {
                int[] iArr = this.f16082g;
                int i9 = iArr[length + i];
                int i10 = iArr[i];
                outputStream.write(this.f16081f[i], i9, i10 - i4);
                i++;
                i4 = i10;
            }
            return;
        }
        throw new IllegalArgumentException("out == null");
    }

    @Override // com.anythink.core.common.n.c.f
    public final int b(byte[] bArr, int i) {
        return n().b(bArr, i);
    }

    @Override // com.anythink.core.common.n.c.f
    public final void a(c cVar) {
        int length = this.f16081f.length;
        int i = 0;
        int i4 = 0;
        while (i < length) {
            int[] iArr = this.f16082g;
            int i9 = iArr[length + i];
            int i10 = iArr[i];
            s sVar = new s(this.f16081f[i], i9, (i9 + i10) - i4, true, false);
            s sVar2 = cVar.f16004b;
            if (sVar2 == null) {
                sVar.i = sVar;
                sVar.f16077h = sVar;
                cVar.f16004b = sVar;
            } else {
                sVar2.i.a(sVar);
            }
            i++;
            i4 = i10;
        }
        cVar.f16005c += i4;
    }

    @Override // com.anythink.core.common.n.c.f
    public final boolean a(int i, f fVar, int i4, int i9) {
        if (i < 0 || i > j() - i9) {
            return false;
        }
        int c4 = c(i);
        while (i9 > 0) {
            int i10 = c4 == 0 ? 0 : this.f16082g[c4 - 1];
            int min = Math.min(i9, ((this.f16082g[c4] - i10) + i10) - i);
            int[] iArr = this.f16082g;
            byte[][] bArr = this.f16081f;
            if (!fVar.a(i4, bArr[c4], (i - i10) + iArr[bArr.length + c4], min)) {
                return false;
            }
            i += min;
            i4 += min;
            i9 -= min;
            c4++;
        }
        return true;
    }

    @Override // com.anythink.core.common.n.c.f
    public final boolean a(int i, byte[] bArr, int i4, int i9) {
        if (i < 0 || i > j() - i9 || i4 < 0 || i4 > bArr.length - i9) {
            return false;
        }
        int c4 = c(i);
        while (i9 > 0) {
            int i10 = c4 == 0 ? 0 : this.f16082g[c4 - 1];
            int min = Math.min(i9, ((this.f16082g[c4] - i10) + i10) - i);
            int[] iArr = this.f16082g;
            byte[][] bArr2 = this.f16081f;
            if (!y.a(bArr2[c4], (i - i10) + iArr[bArr2.length + c4], bArr, i4, min)) {
                return false;
            }
            i += min;
            i4 += min;
            i9 -= min;
            c4++;
        }
        return true;
    }

    @Override // com.anythink.core.common.n.c.f
    public final int a(byte[] bArr, int i) {
        return n().a(bArr, i);
    }
}
