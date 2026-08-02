package com.anythink.basead.exoplayer.h;

import com.anythink.basead.exoplayer.e.m;
import com.anythink.basead.exoplayer.h.w;
import java.io.EOFException;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class x implements com.anythink.basead.exoplayer.e.m {

    /* renamed from: a, reason: collision with root package name */
    public static final int f8643a = -1;

    /* renamed from: b, reason: collision with root package name */
    private static final int f8644b = 32;

    /* renamed from: c, reason: collision with root package name */
    private final com.anythink.basead.exoplayer.j.b f8645c;

    /* renamed from: d, reason: collision with root package name */
    private final int f8646d;

    /* renamed from: e, reason: collision with root package name */
    private final w f8647e;

    /* renamed from: f, reason: collision with root package name */
    private final w.a f8648f;

    /* renamed from: g, reason: collision with root package name */
    private final com.anythink.basead.exoplayer.k.s f8649g;

    /* renamed from: h, reason: collision with root package name */
    private a f8650h;
    private a i;

    /* renamed from: j, reason: collision with root package name */
    private a f8651j;

    /* renamed from: k, reason: collision with root package name */
    private com.anythink.basead.exoplayer.m f8652k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f8653l;

    /* renamed from: m, reason: collision with root package name */
    private com.anythink.basead.exoplayer.m f8654m;

    /* renamed from: n, reason: collision with root package name */
    private long f8655n;

    /* renamed from: o, reason: collision with root package name */
    private long f8656o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f8657p;

    /* renamed from: q, reason: collision with root package name */
    private b f8658q;

    public interface b {
        void i();
    }

    public x(com.anythink.basead.exoplayer.j.b bVar) {
        this.f8645c = bVar;
        int d9 = bVar.d();
        this.f8646d = d9;
        this.f8647e = new w();
        this.f8648f = new w.a();
        this.f8649g = new com.anythink.basead.exoplayer.k.s(32);
        a aVar = new a(0L, d9);
        this.f8650h = aVar;
        this.i = aVar;
        this.f8651j = aVar;
    }

    private void c(int i) {
        this.f8647e.b(i);
    }

    private void l() {
        this.f8647e.a();
        a(this.f8650h);
        a aVar = new a(0L, this.f8646d);
        this.f8650h = aVar;
        this.i = aVar;
        this.f8651j = aVar;
        this.f8656o = 0L;
        this.f8645c.b();
    }

    private void m() {
        this.f8657p = true;
    }

    private int n() {
        return this.f8647e.e();
    }

    private void o() {
        c(this.f8647e.l());
    }

    public final void a(int i) {
        long a9 = this.f8647e.a(i);
        this.f8656o = a9;
        if (a9 != 0) {
            a aVar = this.f8650h;
            if (a9 != aVar.f8659a) {
                while (this.f8656o > aVar.f8660b) {
                    aVar = aVar.f8663e;
                }
                a aVar2 = aVar.f8663e;
                a(aVar2);
                a aVar3 = new a(aVar.f8660b, this.f8646d);
                aVar.f8663e = aVar3;
                if (this.f8656o == aVar.f8660b) {
                    aVar = aVar3;
                }
                this.f8651j = aVar;
                if (this.i == aVar2) {
                    this.i = aVar3;
                    return;
                }
                return;
            }
        }
        a(this.f8650h);
        a aVar4 = new a(this.f8656o, this.f8646d);
        this.f8650h = aVar4;
        this.i = aVar4;
        this.f8651j = aVar4;
    }

    public final int b() {
        return this.f8647e.b();
    }

    public final int d() {
        return this.f8647e.c();
    }

    public final int e() {
        return this.f8647e.d();
    }

    public final com.anythink.basead.exoplayer.m f() {
        return this.f8647e.g();
    }

    public final long g() {
        return this.f8647e.h();
    }

    public final long h() {
        return this.f8647e.i();
    }

    public final void i() {
        this.f8647e.j();
        this.i = this.f8650h;
    }

    public final void j() {
        c(this.f8647e.m());
    }

    public final int k() {
        return this.f8647e.k();
    }

    private int d(int i) {
        a aVar = this.f8651j;
        if (!aVar.f8661c) {
            aVar.a(this.f8645c.a(), new a(this.f8651j.f8660b, this.f8646d));
        }
        return Math.min(i, (int) (this.f8651j.f8660b - this.f8656o));
    }

    private void e(int i) {
        long j6 = this.f8656o + i;
        this.f8656o = j6;
        a aVar = this.f8651j;
        if (j6 == aVar.f8660b) {
            this.f8651j = aVar.f8663e;
        }
    }

    public final boolean b(int i) {
        return this.f8647e.c(i);
    }

    public final boolean c() {
        return this.f8647e.f();
    }

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final long f8659a;

        /* renamed from: b, reason: collision with root package name */
        public final long f8660b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f8661c;

        /* renamed from: d, reason: collision with root package name */
        public com.anythink.basead.exoplayer.j.a f8662d;

        /* renamed from: e, reason: collision with root package name */
        public a f8663e;

        public a(long j6, int i) {
            this.f8659a = j6;
            this.f8660b = j6 + i;
        }

        public final void a(com.anythink.basead.exoplayer.j.a aVar, a aVar2) {
            this.f8662d = aVar;
            this.f8663e = aVar2;
            this.f8661c = true;
        }

        public final int a(long j6) {
            return ((int) (j6 - this.f8659a)) + this.f8662d.f8806b;
        }

        public final a a() {
            this.f8662d = null;
            a aVar = this.f8663e;
            this.f8663e = null;
            return aVar;
        }
    }

    private void b(long j6) {
        while (true) {
            a aVar = this.i;
            if (j6 < aVar.f8660b) {
                return;
            } else {
                this.i = aVar.f8663e;
            }
        }
    }

    private void c(long j6) {
        a aVar;
        if (j6 == -1) {
            return;
        }
        while (true) {
            aVar = this.f8650h;
            if (j6 < aVar.f8660b) {
                break;
            }
            this.f8645c.a(aVar.f8662d);
            this.f8650h = this.f8650h.a();
        }
        if (this.i.f8659a < aVar.f8659a) {
            this.i = aVar;
        }
    }

    public final void a(long j6, boolean z6, boolean z9) {
        c(this.f8647e.a(j6, z6, z9));
    }

    public final int a(long j6, boolean z6) {
        return this.f8647e.a(j6, z6);
    }

    public final int a(com.anythink.basead.exoplayer.n nVar, com.anythink.basead.exoplayer.c.e eVar, boolean z6, boolean z9, long j6) {
        int a9 = this.f8647e.a(nVar, eVar, z6, z9, this.f8652k, this.f8648f);
        if (a9 == -5) {
            this.f8652k = nVar.f9469a;
            return -5;
        }
        if (a9 != -4) {
            if (a9 == -3) {
                return -3;
            }
            throw new IllegalStateException();
        }
        if (!eVar.c()) {
            if (eVar.f7529f < j6) {
                eVar.b(Integer.MIN_VALUE);
            }
            if (eVar.g()) {
                w.a aVar = this.f8648f;
                long j9 = aVar.f8641b;
                int i = 1;
                this.f8649g.a(1);
                a(j9, this.f8649g.f9288a, 1);
                long j10 = j9 + 1;
                byte b9 = this.f8649g.f9288a[0];
                boolean z10 = (b9 & com.anythink.core.common.s.a.c.f17103a) != 0;
                int i4 = b9 & Byte.MAX_VALUE;
                com.anythink.basead.exoplayer.c.b bVar = eVar.f7527d;
                if (bVar.f7505a == null) {
                    bVar.f7505a = new byte[16];
                }
                a(j10, bVar.f7505a, i4);
                long j11 = j10 + i4;
                if (z10) {
                    this.f8649g.a(2);
                    a(j11, this.f8649g.f9288a, 2);
                    j11 += 2;
                    i = this.f8649g.e();
                }
                int i6 = i;
                com.anythink.basead.exoplayer.c.b bVar2 = eVar.f7527d;
                int[] iArr = bVar2.f7508d;
                if (iArr == null || iArr.length < i6) {
                    iArr = new int[i6];
                }
                int[] iArr2 = iArr;
                int[] iArr3 = bVar2.f7509e;
                if (iArr3 == null || iArr3.length < i6) {
                    iArr3 = new int[i6];
                }
                int[] iArr4 = iArr3;
                if (z10) {
                    int i9 = i6 * 6;
                    this.f8649g.a(i9);
                    a(j11, this.f8649g.f9288a, i9);
                    j11 += i9;
                    this.f8649g.c(0);
                    for (int i10 = 0; i10 < i6; i10++) {
                        iArr2[i10] = this.f8649g.e();
                        iArr4[i10] = this.f8649g.m();
                    }
                } else {
                    iArr2[0] = 0;
                    iArr4[0] = aVar.f8640a - ((int) (j11 - aVar.f8641b));
                }
                m.a aVar2 = aVar.f8642c;
                com.anythink.basead.exoplayer.c.b bVar3 = eVar.f7527d;
                bVar3.a(i6, iArr2, iArr4, aVar2.f7970b, bVar3.f7505a, aVar2.f7969a, aVar2.f7971c, aVar2.f7972d);
                long j12 = aVar.f8641b;
                int i11 = (int) (j11 - j12);
                aVar.f8641b = j12 + i11;
                aVar.f8640a -= i11;
            }
            eVar.d(this.f8648f.f8640a);
            w.a aVar3 = this.f8648f;
            long j13 = aVar3.f8641b;
            ByteBuffer byteBuffer = eVar.f7528e;
            int i12 = aVar3.f8640a;
            b(j13);
            while (i12 > 0) {
                int min = Math.min(i12, (int) (this.i.f8660b - j13));
                a aVar4 = this.i;
                byteBuffer.put(aVar4.f8662d.f8805a, aVar4.a(j13), min);
                i12 -= min;
                j13 += min;
                a aVar5 = this.i;
                if (j13 == aVar5.f8660b) {
                    this.i = aVar5.f8663e;
                }
            }
        }
        return -4;
    }

    private void a(com.anythink.basead.exoplayer.c.e eVar, w.a aVar) {
        long j6 = aVar.f8641b;
        int i = 1;
        this.f8649g.a(1);
        a(j6, this.f8649g.f9288a, 1);
        long j9 = j6 + 1;
        byte b9 = this.f8649g.f9288a[0];
        boolean z6 = (b9 & com.anythink.core.common.s.a.c.f17103a) != 0;
        int i4 = b9 & Byte.MAX_VALUE;
        com.anythink.basead.exoplayer.c.b bVar = eVar.f7527d;
        if (bVar.f7505a == null) {
            bVar.f7505a = new byte[16];
        }
        a(j9, bVar.f7505a, i4);
        long j10 = j9 + i4;
        if (z6) {
            this.f8649g.a(2);
            a(j10, this.f8649g.f9288a, 2);
            j10 += 2;
            i = this.f8649g.e();
        }
        int i6 = i;
        com.anythink.basead.exoplayer.c.b bVar2 = eVar.f7527d;
        int[] iArr = bVar2.f7508d;
        if (iArr == null || iArr.length < i6) {
            iArr = new int[i6];
        }
        int[] iArr2 = iArr;
        int[] iArr3 = bVar2.f7509e;
        if (iArr3 == null || iArr3.length < i6) {
            iArr3 = new int[i6];
        }
        int[] iArr4 = iArr3;
        if (z6) {
            int i9 = i6 * 6;
            this.f8649g.a(i9);
            a(j10, this.f8649g.f9288a, i9);
            j10 += i9;
            this.f8649g.c(0);
            for (int i10 = 0; i10 < i6; i10++) {
                iArr2[i10] = this.f8649g.e();
                iArr4[i10] = this.f8649g.m();
            }
        } else {
            iArr2[0] = 0;
            iArr4[0] = aVar.f8640a - ((int) (j10 - aVar.f8641b));
        }
        m.a aVar2 = aVar.f8642c;
        com.anythink.basead.exoplayer.c.b bVar3 = eVar.f7527d;
        bVar3.a(i6, iArr2, iArr4, aVar2.f7970b, bVar3.f7505a, aVar2.f7969a, aVar2.f7971c, aVar2.f7972d);
        long j11 = aVar.f8641b;
        int i11 = (int) (j10 - j11);
        aVar.f8641b = j11 + i11;
        aVar.f8640a -= i11;
    }

    private void a(long j6, ByteBuffer byteBuffer, int i) {
        b(j6);
        while (i > 0) {
            int min = Math.min(i, (int) (this.i.f8660b - j6));
            a aVar = this.i;
            byteBuffer.put(aVar.f8662d.f8805a, aVar.a(j6), min);
            i -= min;
            j6 += min;
            a aVar2 = this.i;
            if (j6 == aVar2.f8660b) {
                this.i = aVar2.f8663e;
            }
        }
    }

    private void a(long j6, byte[] bArr, int i) {
        b(j6);
        int i4 = i;
        while (i4 > 0) {
            int min = Math.min(i4, (int) (this.i.f8660b - j6));
            a aVar = this.i;
            System.arraycopy(aVar.f8662d.f8805a, aVar.a(j6), bArr, i - i4, min);
            i4 -= min;
            j6 += min;
            a aVar2 = this.i;
            if (j6 == aVar2.f8660b) {
                this.i = aVar2.f8663e;
            }
        }
    }

    public final void a(b bVar) {
        this.f8658q = bVar;
    }

    public final void a(long j6) {
        if (this.f8655n != j6) {
            this.f8655n = j6;
            this.f8653l = true;
        }
    }

    @Override // com.anythink.basead.exoplayer.e.m
    public final void a(com.anythink.basead.exoplayer.m mVar) {
        com.anythink.basead.exoplayer.m mVar2;
        long j6 = this.f8655n;
        if (mVar == null) {
            mVar2 = null;
        } else {
            if (j6 != 0) {
                long j9 = mVar.f9454l;
                if (j9 != Long.MAX_VALUE) {
                    mVar2 = mVar.a(j9 + j6);
                }
            }
            mVar2 = mVar;
        }
        boolean a9 = this.f8647e.a(mVar2);
        this.f8654m = mVar;
        this.f8653l = false;
        b bVar = this.f8658q;
        if (bVar == null || !a9) {
            return;
        }
        bVar.i();
    }

    @Override // com.anythink.basead.exoplayer.e.m
    public final int a(com.anythink.basead.exoplayer.e.f fVar, int i, boolean z6) {
        int d9 = d(i);
        a aVar = this.f8651j;
        int a9 = fVar.a(aVar.f8662d.f8805a, aVar.a(this.f8656o), d9);
        if (a9 != -1) {
            e(a9);
            return a9;
        }
        if (z6) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // com.anythink.basead.exoplayer.e.m
    public final void a(com.anythink.basead.exoplayer.k.s sVar, int i) {
        while (i > 0) {
            int d9 = d(i);
            a aVar = this.f8651j;
            sVar.a(aVar.f8662d.f8805a, aVar.a(this.f8656o), d9);
            i -= d9;
            e(d9);
        }
    }

    @Override // com.anythink.basead.exoplayer.e.m
    public final void a(long j6, int i, int i4, int i6, m.a aVar) {
        if (this.f8653l) {
            a(this.f8654m);
        }
        if (this.f8657p) {
            if ((i & 1) == 0 || !this.f8647e.a(j6)) {
                return;
            } else {
                this.f8657p = false;
            }
        }
        this.f8647e.a(j6 + this.f8655n, i, (this.f8656o - i4) - i6, i4, aVar);
    }

    private void a(a aVar) {
        if (aVar.f8661c) {
            a aVar2 = this.f8651j;
            int i = (((int) (aVar2.f8659a - aVar.f8659a)) / this.f8646d) + (aVar2.f8661c ? 1 : 0);
            com.anythink.basead.exoplayer.j.a[] aVarArr = new com.anythink.basead.exoplayer.j.a[i];
            for (int i4 = 0; i4 < i; i4++) {
                aVarArr[i4] = aVar.f8662d;
                aVar = aVar.a();
            }
            this.f8645c.a(aVarArr);
        }
    }

    private static com.anythink.basead.exoplayer.m a(com.anythink.basead.exoplayer.m mVar, long j6) {
        if (mVar == null) {
            return null;
        }
        if (j6 == 0) {
            return mVar;
        }
        long j9 = mVar.f9454l;
        return j9 != Long.MAX_VALUE ? mVar.a(j9 + j6) : mVar;
    }

    public final void a() {
        this.f8647e.a();
        a(this.f8650h);
        a aVar = new a(0L, this.f8646d);
        this.f8650h = aVar;
        this.i = aVar;
        this.f8651j = aVar;
        this.f8656o = 0L;
        this.f8645c.b();
    }
}
