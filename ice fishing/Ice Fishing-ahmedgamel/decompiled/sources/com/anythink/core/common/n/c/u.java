package com.anythink.core.common.n.c;

import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Arrays;

/* loaded from: classes.dex */
final class u extends f {

    /* renamed from: f, reason: collision with root package name */
    final transient byte[][] f16710f;

    /* renamed from: g, reason: collision with root package name */
    final transient int[] f16711g;

    public u(c cVar, int i) {
        super(null);
        y.a(cVar.f16634c, 0L, i);
        s sVar = cVar.f16633b;
        int i4 = 0;
        int i6 = 0;
        int i9 = 0;
        while (i6 < i) {
            int i10 = sVar.f16703e;
            int i11 = sVar.f16702d;
            if (i10 == i11) {
                throw new AssertionError("s.limit == s.pos");
            }
            i6 += i10 - i11;
            i9++;
            sVar = sVar.f16706h;
        }
        this.f16710f = new byte[i9][];
        this.f16711g = new int[i9 * 2];
        s sVar2 = cVar.f16633b;
        int i12 = 0;
        while (i4 < i) {
            byte[][] bArr = this.f16710f;
            bArr[i12] = sVar2.f16701c;
            int i13 = sVar2.f16703e;
            int i14 = sVar2.f16702d;
            int i15 = (i13 - i14) + i4;
            i4 = i15 > i ? i : i15;
            int[] iArr = this.f16711g;
            iArr[i12] = i4;
            iArr[bArr.length + i12] = i14;
            sVar2.f16704f = true;
            i12++;
            sVar2 = sVar2.f16706h;
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
        int i = this.f16648d;
        if (i != 0) {
            return i;
        }
        int length = this.f16710f.length;
        int i4 = 0;
        int i6 = 1;
        int i9 = 0;
        while (i4 < length) {
            byte[] bArr = this.f16710f[i4];
            int[] iArr = this.f16711g;
            int i10 = iArr[length + i4];
            int i11 = iArr[i4];
            int i12 = (i11 - i9) + i10;
            while (i10 < i12) {
                i6 = (i6 * 31) + bArr[i10];
                i10++;
            }
            i4++;
            i9 = i11;
        }
        this.f16648d = i6;
        return i6;
    }

    @Override // com.anythink.core.common.n.c.f
    public final f i() {
        return n().i();
    }

    @Override // com.anythink.core.common.n.c.f
    public final int j() {
        return this.f16711g[this.f16710f.length - 1];
    }

    @Override // com.anythink.core.common.n.c.f
    public final byte[] k() {
        int[] iArr = this.f16711g;
        byte[][] bArr = this.f16710f;
        byte[] bArr2 = new byte[iArr[bArr.length - 1]];
        int length = bArr.length;
        int i = 0;
        int i4 = 0;
        while (i < length) {
            int[] iArr2 = this.f16711g;
            int i6 = iArr2[length + i];
            int i9 = iArr2[i];
            System.arraycopy(this.f16710f[i], i6, bArr2, i4, i9 - i4);
            i++;
            i4 = i9;
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
        int binarySearch = Arrays.binarySearch(this.f16711g, 0, this.f16710f.length, i + 1);
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
        y.a(this.f16711g[this.f16710f.length - 1], i, 1L);
        int c9 = c(i);
        int i4 = c9 == 0 ? 0 : this.f16711g[c9 - 1];
        int[] iArr = this.f16711g;
        byte[][] bArr = this.f16710f;
        return bArr[c9][(i - i4) + iArr[bArr.length + c9]];
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
            int length = this.f16710f.length;
            int i = 0;
            int i4 = 0;
            while (i < length) {
                int[] iArr = this.f16711g;
                int i6 = iArr[length + i];
                int i9 = iArr[i];
                outputStream.write(this.f16710f[i], i6, i9 - i4);
                i++;
                i4 = i9;
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
        int length = this.f16710f.length;
        int i = 0;
        int i4 = 0;
        while (i < length) {
            int[] iArr = this.f16711g;
            int i6 = iArr[length + i];
            int i9 = iArr[i];
            s sVar = new s(this.f16710f[i], i6, (i6 + i9) - i4, true, false);
            s sVar2 = cVar.f16633b;
            if (sVar2 == null) {
                sVar.i = sVar;
                sVar.f16706h = sVar;
                cVar.f16633b = sVar;
            } else {
                sVar2.i.a(sVar);
            }
            i++;
            i4 = i9;
        }
        cVar.f16634c += i4;
    }

    @Override // com.anythink.core.common.n.c.f
    public final boolean a(int i, f fVar, int i4, int i6) {
        if (i < 0 || i > j() - i6) {
            return false;
        }
        int c9 = c(i);
        while (i6 > 0) {
            int i9 = c9 == 0 ? 0 : this.f16711g[c9 - 1];
            int min = Math.min(i6, ((this.f16711g[c9] - i9) + i9) - i);
            int[] iArr = this.f16711g;
            byte[][] bArr = this.f16710f;
            if (!fVar.a(i4, bArr[c9], (i - i9) + iArr[bArr.length + c9], min)) {
                return false;
            }
            i += min;
            i4 += min;
            i6 -= min;
            c9++;
        }
        return true;
    }

    @Override // com.anythink.core.common.n.c.f
    public final boolean a(int i, byte[] bArr, int i4, int i6) {
        if (i < 0 || i > j() - i6 || i4 < 0 || i4 > bArr.length - i6) {
            return false;
        }
        int c9 = c(i);
        while (i6 > 0) {
            int i9 = c9 == 0 ? 0 : this.f16711g[c9 - 1];
            int min = Math.min(i6, ((this.f16711g[c9] - i9) + i9) - i);
            int[] iArr = this.f16711g;
            byte[][] bArr2 = this.f16710f;
            if (!y.a(bArr2[c9], (i - i9) + iArr[bArr2.length + c9], bArr, i4, min)) {
                return false;
            }
            i += min;
            i4 += min;
            i6 -= min;
            c9++;
        }
        return true;
    }

    @Override // com.anythink.core.common.n.c.f
    public final int a(byte[] bArr, int i) {
        return n().a(bArr, i);
    }
}
