package com.anythink.basead.exoplayer.h;

import com.anythink.basead.exoplayer.e.m;
import com.anythink.basead.exoplayer.h.w;
import java.io.EOFException;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class x implements com.anythink.basead.exoplayer.e.m {

    /* renamed from: a, reason: collision with root package name */
    public static final int f7857a = -1;

    /* renamed from: b, reason: collision with root package name */
    private static final int f7858b = 32;

    /* renamed from: c, reason: collision with root package name */
    private final com.anythink.basead.exoplayer.j.b f7859c;

    /* renamed from: d, reason: collision with root package name */
    private final int f7860d;

    /* renamed from: e, reason: collision with root package name */
    private final w f7861e;

    /* renamed from: f, reason: collision with root package name */
    private final w.a f7862f;

    /* renamed from: g, reason: collision with root package name */
    private final com.anythink.basead.exoplayer.k.s f7863g;

    /* renamed from: h, reason: collision with root package name */
    private a f7864h;
    private a i;

    /* renamed from: j, reason: collision with root package name */
    private a f7865j;

    /* renamed from: k, reason: collision with root package name */
    private com.anythink.basead.exoplayer.m f7866k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f7867l;

    /* renamed from: m, reason: collision with root package name */
    private com.anythink.basead.exoplayer.m f7868m;

    /* renamed from: n, reason: collision with root package name */
    private long f7869n;

    /* renamed from: o, reason: collision with root package name */
    private long f7870o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f7871p;

    /* renamed from: q, reason: collision with root package name */
    private b f7872q;

    public interface b {
        void i();
    }

    public x(com.anythink.basead.exoplayer.j.b bVar) {
        this.f7859c = bVar;
        int d2 = bVar.d();
        this.f7860d = d2;
        this.f7861e = new w();
        this.f7862f = new w.a();
        this.f7863g = new com.anythink.basead.exoplayer.k.s(32);
        a aVar = new a(0L, d2);
        this.f7864h = aVar;
        this.i = aVar;
        this.f7865j = aVar;
    }

    private void c(int i) {
        this.f7861e.b(i);
    }

    private void l() {
        this.f7861e.a();
        a(this.f7864h);
        a aVar = new a(0L, this.f7860d);
        this.f7864h = aVar;
        this.i = aVar;
        this.f7865j = aVar;
        this.f7870o = 0L;
        this.f7859c.b();
    }

    private void m() {
        this.f7871p = true;
    }

    private int n() {
        return this.f7861e.e();
    }

    private void o() {
        c(this.f7861e.l());
    }

    public final void a(int i) {
        long a9 = this.f7861e.a(i);
        this.f7870o = a9;
        if (a9 != 0) {
            a aVar = this.f7864h;
            if (a9 != aVar.f7873a) {
                while (this.f7870o > aVar.f7874b) {
                    aVar = aVar.f7877e;
                }
                a aVar2 = aVar.f7877e;
                a(aVar2);
                a aVar3 = new a(aVar.f7874b, this.f7860d);
                aVar.f7877e = aVar3;
                if (this.f7870o == aVar.f7874b) {
                    aVar = aVar3;
                }
                this.f7865j = aVar;
                if (this.i == aVar2) {
                    this.i = aVar3;
                    return;
                }
                return;
            }
        }
        a(this.f7864h);
        a aVar4 = new a(this.f7870o, this.f7860d);
        this.f7864h = aVar4;
        this.i = aVar4;
        this.f7865j = aVar4;
    }

    public final int b() {
        return this.f7861e.b();
    }

    public final int d() {
        return this.f7861e.c();
    }

    public final int e() {
        return this.f7861e.d();
    }

    public final com.anythink.basead.exoplayer.m f() {
        return this.f7861e.g();
    }

    public final long g() {
        return this.f7861e.h();
    }

    public final long h() {
        return this.f7861e.i();
    }

    public final void i() {
        this.f7861e.j();
        this.i = this.f7864h;
    }

    public final void j() {
        c(this.f7861e.m());
    }

    public final int k() {
        return this.f7861e.k();
    }

    private int d(int i) {
        a aVar = this.f7865j;
        if (!aVar.f7875c) {
            aVar.a(this.f7859c.a(), new a(this.f7865j.f7874b, this.f7860d));
        }
        return Math.min(i, (int) (this.f7865j.f7874b - this.f7870o));
    }

    private void e(int i) {
        long j6 = this.f7870o + i;
        this.f7870o = j6;
        a aVar = this.f7865j;
        if (j6 == aVar.f7874b) {
            this.f7865j = aVar.f7877e;
        }
    }

    public final boolean b(int i) {
        return this.f7861e.c(i);
    }

    public final boolean c() {
        return this.f7861e.f();
    }

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final long f7873a;

        /* renamed from: b, reason: collision with root package name */
        public final long f7874b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f7875c;

        /* renamed from: d, reason: collision with root package name */
        public com.anythink.basead.exoplayer.j.a f7876d;

        /* renamed from: e, reason: collision with root package name */
        public a f7877e;

        public a(long j6, int i) {
            this.f7873a = j6;
            this.f7874b = j6 + i;
        }

        public final void a(com.anythink.basead.exoplayer.j.a aVar, a aVar2) {
            this.f7876d = aVar;
            this.f7877e = aVar2;
            this.f7875c = true;
        }

        public final int a(long j6) {
            return ((int) (j6 - this.f7873a)) + this.f7876d.f8020b;
        }

        public final a a() {
            this.f7876d = null;
            a aVar = this.f7877e;
            this.f7877e = null;
            return aVar;
        }
    }

    private void b(long j6) {
        while (true) {
            a aVar = this.i;
            if (j6 < aVar.f7874b) {
                return;
            } else {
                this.i = aVar.f7877e;
            }
        }
    }

    private void c(long j6) {
        a aVar;
        if (j6 == -1) {
            return;
        }
        while (true) {
            aVar = this.f7864h;
            if (j6 < aVar.f7874b) {
                break;
            }
            this.f7859c.a(aVar.f7876d);
            this.f7864h = this.f7864h.a();
        }
        if (this.i.f7873a < aVar.f7873a) {
            this.i = aVar;
        }
    }

    public final void a(long j6, boolean z3, boolean z6) {
        c(this.f7861e.a(j6, z3, z6));
    }

    public final int a(long j6, boolean z3) {
        return this.f7861e.a(j6, z3);
    }

    public final int a(com.anythink.basead.exoplayer.n nVar, com.anythink.basead.exoplayer.c.e eVar, boolean z3, boolean z6, long j6) {
        int a9 = this.f7861e.a(nVar, eVar, z3, z6, this.f7866k, this.f7862f);
        if (a9 == -5) {
            this.f7866k = nVar.f8683a;
            return -5;
        }
        if (a9 != -4) {
            if (a9 == -3) {
                return -3;
            }
            throw new IllegalStateException();
        }
        if (!eVar.c()) {
            if (eVar.f6743f < j6) {
                eVar.b(Integer.MIN_VALUE);
            }
            if (eVar.g()) {
                w.a aVar = this.f7862f;
                long j9 = aVar.f7855b;
                int i = 1;
                this.f7863g.a(1);
                a(j9, this.f7863g.f8502a, 1);
                long j10 = j9 + 1;
                byte b9 = this.f7863g.f8502a[0];
                boolean z9 = (b9 & com.anythink.core.common.s.a.c.f16316a) != 0;
                int i6 = b9 & Byte.MAX_VALUE;
                com.anythink.basead.exoplayer.c.b bVar = eVar.f6741d;
                if (bVar.f6719a == null) {
                    bVar.f6719a = new byte[16];
                }
                a(j10, bVar.f6719a, i6);
                long j11 = j10 + i6;
                if (z9) {
                    this.f7863g.a(2);
                    a(j11, this.f7863g.f8502a, 2);
                    j11 += 2;
                    i = this.f7863g.e();
                }
                int i9 = i;
                com.anythink.basead.exoplayer.c.b bVar2 = eVar.f6741d;
                int[] iArr = bVar2.f6722d;
                if (iArr == null || iArr.length < i9) {
                    iArr = new int[i9];
                }
                int[] iArr2 = iArr;
                int[] iArr3 = bVar2.f6723e;
                if (iArr3 == null || iArr3.length < i9) {
                    iArr3 = new int[i9];
                }
                int[] iArr4 = iArr3;
                if (z9) {
                    int i10 = i9 * 6;
                    this.f7863g.a(i10);
                    a(j11, this.f7863g.f8502a, i10);
                    j11 += i10;
                    this.f7863g.c(0);
                    for (int i11 = 0; i11 < i9; i11++) {
                        iArr2[i11] = this.f7863g.e();
                        iArr4[i11] = this.f7863g.m();
                    }
                } else {
                    iArr2[0] = 0;
                    iArr4[0] = aVar.f7854a - ((int) (j11 - aVar.f7855b));
                }
                m.a aVar2 = aVar.f7856c;
                com.anythink.basead.exoplayer.c.b bVar3 = eVar.f6741d;
                bVar3.a(i9, iArr2, iArr4, aVar2.f7184b, bVar3.f6719a, aVar2.f7183a, aVar2.f7185c, aVar2.f7186d);
                long j12 = aVar.f7855b;
                int i12 = (int) (j11 - j12);
                aVar.f7855b = j12 + i12;
                aVar.f7854a -= i12;
            }
            eVar.d(this.f7862f.f7854a);
            w.a aVar3 = this.f7862f;
            long j13 = aVar3.f7855b;
            ByteBuffer byteBuffer = eVar.f6742e;
            int i13 = aVar3.f7854a;
            b(j13);
            while (i13 > 0) {
                int min = Math.min(i13, (int) (this.i.f7874b - j13));
                a aVar4 = this.i;
                byteBuffer.put(aVar4.f7876d.f8019a, aVar4.a(j13), min);
                i13 -= min;
                j13 += min;
                a aVar5 = this.i;
                if (j13 == aVar5.f7874b) {
                    this.i = aVar5.f7877e;
                }
            }
        }
        return -4;
    }

    private void a(com.anythink.basead.exoplayer.c.e eVar, w.a aVar) {
        long j6 = aVar.f7855b;
        int i = 1;
        this.f7863g.a(1);
        a(j6, this.f7863g.f8502a, 1);
        long j9 = j6 + 1;
        byte b9 = this.f7863g.f8502a[0];
        boolean z3 = (b9 & com.anythink.core.common.s.a.c.f16316a) != 0;
        int i6 = b9 & Byte.MAX_VALUE;
        com.anythink.basead.exoplayer.c.b bVar = eVar.f6741d;
        if (bVar.f6719a == null) {
            bVar.f6719a = new byte[16];
        }
        a(j9, bVar.f6719a, i6);
        long j10 = j9 + i6;
        if (z3) {
            this.f7863g.a(2);
            a(j10, this.f7863g.f8502a, 2);
            j10 += 2;
            i = this.f7863g.e();
        }
        int i9 = i;
        com.anythink.basead.exoplayer.c.b bVar2 = eVar.f6741d;
        int[] iArr = bVar2.f6722d;
        if (iArr == null || iArr.length < i9) {
            iArr = new int[i9];
        }
        int[] iArr2 = iArr;
        int[] iArr3 = bVar2.f6723e;
        if (iArr3 == null || iArr3.length < i9) {
            iArr3 = new int[i9];
        }
        int[] iArr4 = iArr3;
        if (z3) {
            int i10 = i9 * 6;
            this.f7863g.a(i10);
            a(j10, this.f7863g.f8502a, i10);
            j10 += i10;
            this.f7863g.c(0);
            for (int i11 = 0; i11 < i9; i11++) {
                iArr2[i11] = this.f7863g.e();
                iArr4[i11] = this.f7863g.m();
            }
        } else {
            iArr2[0] = 0;
            iArr4[0] = aVar.f7854a - ((int) (j10 - aVar.f7855b));
        }
        m.a aVar2 = aVar.f7856c;
        com.anythink.basead.exoplayer.c.b bVar3 = eVar.f6741d;
        bVar3.a(i9, iArr2, iArr4, aVar2.f7184b, bVar3.f6719a, aVar2.f7183a, aVar2.f7185c, aVar2.f7186d);
        long j11 = aVar.f7855b;
        int i12 = (int) (j10 - j11);
        aVar.f7855b = j11 + i12;
        aVar.f7854a -= i12;
    }

    private void a(long j6, ByteBuffer byteBuffer, int i) {
        b(j6);
        while (i > 0) {
            int min = Math.min(i, (int) (this.i.f7874b - j6));
            a aVar = this.i;
            byteBuffer.put(aVar.f7876d.f8019a, aVar.a(j6), min);
            i -= min;
            j6 += min;
            a aVar2 = this.i;
            if (j6 == aVar2.f7874b) {
                this.i = aVar2.f7877e;
            }
        }
    }

    private void a(long j6, byte[] bArr, int i) {
        b(j6);
        int i6 = i;
        while (i6 > 0) {
            int min = Math.min(i6, (int) (this.i.f7874b - j6));
            a aVar = this.i;
            System.arraycopy(aVar.f7876d.f8019a, aVar.a(j6), bArr, i - i6, min);
            i6 -= min;
            j6 += min;
            a aVar2 = this.i;
            if (j6 == aVar2.f7874b) {
                this.i = aVar2.f7877e;
            }
        }
    }

    public final void a(b bVar) {
        this.f7872q = bVar;
    }

    public final void a(long j6) {
        if (this.f7869n != j6) {
            this.f7869n = j6;
            this.f7867l = true;
        }
    }

    @Override // com.anythink.basead.exoplayer.e.m
    public final void a(com.anythink.basead.exoplayer.m mVar) {
        com.anythink.basead.exoplayer.m mVar2;
        long j6 = this.f7869n;
        if (mVar == null) {
            mVar2 = null;
        } else {
            if (j6 != 0) {
                long j9 = mVar.f8668l;
                if (j9 != Long.MAX_VALUE) {
                    mVar2 = mVar.a(j9 + j6);
                }
            }
            mVar2 = mVar;
        }
        boolean a9 = this.f7861e.a(mVar2);
        this.f7868m = mVar;
        this.f7867l = false;
        b bVar = this.f7872q;
        if (bVar == null || !a9) {
            return;
        }
        bVar.i();
    }

    @Override // com.anythink.basead.exoplayer.e.m
    public final int a(com.anythink.basead.exoplayer.e.f fVar, int i, boolean z3) {
        int d2 = d(i);
        a aVar = this.f7865j;
        int a9 = fVar.a(aVar.f7876d.f8019a, aVar.a(this.f7870o), d2);
        if (a9 != -1) {
            e(a9);
            return a9;
        }
        if (z3) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // com.anythink.basead.exoplayer.e.m
    public final void a(com.anythink.basead.exoplayer.k.s sVar, int i) {
        while (i > 0) {
            int d2 = d(i);
            a aVar = this.f7865j;
            sVar.a(aVar.f7876d.f8019a, aVar.a(this.f7870o), d2);
            i -= d2;
            e(d2);
        }
    }

    @Override // com.anythink.basead.exoplayer.e.m
    public final void a(long j6, int i, int i6, int i9, m.a aVar) {
        if (this.f7867l) {
            a(this.f7868m);
        }
        if (this.f7871p) {
            if ((i & 1) == 0 || !this.f7861e.a(j6)) {
                return;
            } else {
                this.f7871p = false;
            }
        }
        this.f7861e.a(j6 + this.f7869n, i, (this.f7870o - i6) - i9, i6, aVar);
    }

    private void a(a aVar) {
        if (aVar.f7875c) {
            a aVar2 = this.f7865j;
            int i = (((int) (aVar2.f7873a - aVar.f7873a)) / this.f7860d) + (aVar2.f7875c ? 1 : 0);
            com.anythink.basead.exoplayer.j.a[] aVarArr = new com.anythink.basead.exoplayer.j.a[i];
            for (int i6 = 0; i6 < i; i6++) {
                aVarArr[i6] = aVar.f7876d;
                aVar = aVar.a();
            }
            this.f7859c.a(aVarArr);
        }
    }

    private static com.anythink.basead.exoplayer.m a(com.anythink.basead.exoplayer.m mVar, long j6) {
        if (mVar == null) {
            return null;
        }
        if (j6 == 0) {
            return mVar;
        }
        long j9 = mVar.f8668l;
        return j9 != Long.MAX_VALUE ? mVar.a(j9 + j6) : mVar;
    }

    public final void a() {
        this.f7861e.a();
        a(this.f7864h);
        a aVar = new a(0L, this.f7860d);
        this.f7864h = aVar;
        this.i = aVar;
        this.f7865j = aVar;
        this.f7870o = 0L;
        this.f7859c.b();
    }
}
