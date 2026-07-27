package com.anythink.basead.exoplayer.h;

import com.anythink.basead.exoplayer.e.m;
import com.anythink.basead.exoplayer.h.w;
import java.io.EOFException;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class x implements com.anythink.basead.exoplayer.e.m {

    /* renamed from: a, reason: collision with root package name */
    public static final int f8014a = -1;

    /* renamed from: b, reason: collision with root package name */
    private static final int f8015b = 32;

    /* renamed from: c, reason: collision with root package name */
    private final com.anythink.basead.exoplayer.j.b f8016c;

    /* renamed from: d, reason: collision with root package name */
    private final int f8017d;

    /* renamed from: e, reason: collision with root package name */
    private final w f8018e;

    /* renamed from: f, reason: collision with root package name */
    private final w.a f8019f;

    /* renamed from: g, reason: collision with root package name */
    private final com.anythink.basead.exoplayer.k.s f8020g;

    /* renamed from: h, reason: collision with root package name */
    private a f8021h;
    private a i;

    /* renamed from: j, reason: collision with root package name */
    private a f8022j;

    /* renamed from: k, reason: collision with root package name */
    private com.anythink.basead.exoplayer.m f8023k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f8024l;

    /* renamed from: m, reason: collision with root package name */
    private com.anythink.basead.exoplayer.m f8025m;

    /* renamed from: n, reason: collision with root package name */
    private long f8026n;

    /* renamed from: o, reason: collision with root package name */
    private long f8027o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f8028p;

    /* renamed from: q, reason: collision with root package name */
    private b f8029q;

    public interface b {
        void i();
    }

    public x(com.anythink.basead.exoplayer.j.b bVar) {
        this.f8016c = bVar;
        int d2 = bVar.d();
        this.f8017d = d2;
        this.f8018e = new w();
        this.f8019f = new w.a();
        this.f8020g = new com.anythink.basead.exoplayer.k.s(32);
        a aVar = new a(0L, d2);
        this.f8021h = aVar;
        this.i = aVar;
        this.f8022j = aVar;
    }

    private void c(int i) {
        this.f8018e.b(i);
    }

    private void l() {
        this.f8018e.a();
        a(this.f8021h);
        a aVar = new a(0L, this.f8017d);
        this.f8021h = aVar;
        this.i = aVar;
        this.f8022j = aVar;
        this.f8027o = 0L;
        this.f8016c.b();
    }

    private void m() {
        this.f8028p = true;
    }

    private int n() {
        return this.f8018e.e();
    }

    private void o() {
        c(this.f8018e.l());
    }

    public final void a(int i) {
        long a9 = this.f8018e.a(i);
        this.f8027o = a9;
        if (a9 != 0) {
            a aVar = this.f8021h;
            if (a9 != aVar.f8030a) {
                while (this.f8027o > aVar.f8031b) {
                    aVar = aVar.f8034e;
                }
                a aVar2 = aVar.f8034e;
                a(aVar2);
                a aVar3 = new a(aVar.f8031b, this.f8017d);
                aVar.f8034e = aVar3;
                if (this.f8027o == aVar.f8031b) {
                    aVar = aVar3;
                }
                this.f8022j = aVar;
                if (this.i == aVar2) {
                    this.i = aVar3;
                    return;
                }
                return;
            }
        }
        a(this.f8021h);
        a aVar4 = new a(this.f8027o, this.f8017d);
        this.f8021h = aVar4;
        this.i = aVar4;
        this.f8022j = aVar4;
    }

    public final int b() {
        return this.f8018e.b();
    }

    public final int d() {
        return this.f8018e.c();
    }

    public final int e() {
        return this.f8018e.d();
    }

    public final com.anythink.basead.exoplayer.m f() {
        return this.f8018e.g();
    }

    public final long g() {
        return this.f8018e.h();
    }

    public final long h() {
        return this.f8018e.i();
    }

    public final void i() {
        this.f8018e.j();
        this.i = this.f8021h;
    }

    public final void j() {
        c(this.f8018e.m());
    }

    public final int k() {
        return this.f8018e.k();
    }

    private int d(int i) {
        a aVar = this.f8022j;
        if (!aVar.f8032c) {
            aVar.a(this.f8016c.a(), new a(this.f8022j.f8031b, this.f8017d));
        }
        return Math.min(i, (int) (this.f8022j.f8031b - this.f8027o));
    }

    private void e(int i) {
        long j9 = this.f8027o + i;
        this.f8027o = j9;
        a aVar = this.f8022j;
        if (j9 == aVar.f8031b) {
            this.f8022j = aVar.f8034e;
        }
    }

    public final boolean b(int i) {
        return this.f8018e.c(i);
    }

    public final boolean c() {
        return this.f8018e.f();
    }

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final long f8030a;

        /* renamed from: b, reason: collision with root package name */
        public final long f8031b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f8032c;

        /* renamed from: d, reason: collision with root package name */
        public com.anythink.basead.exoplayer.j.a f8033d;

        /* renamed from: e, reason: collision with root package name */
        public a f8034e;

        public a(long j9, int i) {
            this.f8030a = j9;
            this.f8031b = j9 + i;
        }

        public final void a(com.anythink.basead.exoplayer.j.a aVar, a aVar2) {
            this.f8033d = aVar;
            this.f8034e = aVar2;
            this.f8032c = true;
        }

        public final int a(long j9) {
            return ((int) (j9 - this.f8030a)) + this.f8033d.f8177b;
        }

        public final a a() {
            this.f8033d = null;
            a aVar = this.f8034e;
            this.f8034e = null;
            return aVar;
        }
    }

    private void b(long j9) {
        while (true) {
            a aVar = this.i;
            if (j9 < aVar.f8031b) {
                return;
            } else {
                this.i = aVar.f8034e;
            }
        }
    }

    private void c(long j9) {
        a aVar;
        if (j9 == -1) {
            return;
        }
        while (true) {
            aVar = this.f8021h;
            if (j9 < aVar.f8031b) {
                break;
            }
            this.f8016c.a(aVar.f8033d);
            this.f8021h = this.f8021h.a();
        }
        if (this.i.f8030a < aVar.f8030a) {
            this.i = aVar;
        }
    }

    public final void a(long j9, boolean z8, boolean z9) {
        c(this.f8018e.a(j9, z8, z9));
    }

    public final int a(long j9, boolean z8) {
        return this.f8018e.a(j9, z8);
    }

    public final int a(com.anythink.basead.exoplayer.n nVar, com.anythink.basead.exoplayer.c.e eVar, boolean z8, boolean z9, long j9) {
        int a9 = this.f8018e.a(nVar, eVar, z8, z9, this.f8023k, this.f8019f);
        if (a9 == -5) {
            this.f8023k = nVar.f8840a;
            return -5;
        }
        if (a9 != -4) {
            if (a9 == -3) {
                return -3;
            }
            throw new IllegalStateException();
        }
        if (!eVar.c()) {
            if (eVar.f6900f < j9) {
                eVar.b(Integer.MIN_VALUE);
            }
            if (eVar.g()) {
                w.a aVar = this.f8019f;
                long j10 = aVar.f8012b;
                int i = 1;
                this.f8020g.a(1);
                a(j10, this.f8020g.f8659a, 1);
                long j11 = j10 + 1;
                byte b9 = this.f8020g.f8659a[0];
                boolean z10 = (b9 & com.anythink.core.common.s.a.c.f16474a) != 0;
                int i4 = b9 & Byte.MAX_VALUE;
                com.anythink.basead.exoplayer.c.b bVar = eVar.f6898d;
                if (bVar.f6876a == null) {
                    bVar.f6876a = new byte[16];
                }
                a(j11, bVar.f6876a, i4);
                long j12 = j11 + i4;
                if (z10) {
                    this.f8020g.a(2);
                    a(j12, this.f8020g.f8659a, 2);
                    j12 += 2;
                    i = this.f8020g.e();
                }
                int i9 = i;
                com.anythink.basead.exoplayer.c.b bVar2 = eVar.f6898d;
                int[] iArr = bVar2.f6879d;
                if (iArr == null || iArr.length < i9) {
                    iArr = new int[i9];
                }
                int[] iArr2 = iArr;
                int[] iArr3 = bVar2.f6880e;
                if (iArr3 == null || iArr3.length < i9) {
                    iArr3 = new int[i9];
                }
                int[] iArr4 = iArr3;
                if (z10) {
                    int i10 = i9 * 6;
                    this.f8020g.a(i10);
                    a(j12, this.f8020g.f8659a, i10);
                    j12 += i10;
                    this.f8020g.c(0);
                    for (int i11 = 0; i11 < i9; i11++) {
                        iArr2[i11] = this.f8020g.e();
                        iArr4[i11] = this.f8020g.m();
                    }
                } else {
                    iArr2[0] = 0;
                    iArr4[0] = aVar.f8011a - ((int) (j12 - aVar.f8012b));
                }
                m.a aVar2 = aVar.f8013c;
                com.anythink.basead.exoplayer.c.b bVar3 = eVar.f6898d;
                bVar3.a(i9, iArr2, iArr4, aVar2.f7341b, bVar3.f6876a, aVar2.f7340a, aVar2.f7342c, aVar2.f7343d);
                long j13 = aVar.f8012b;
                int i12 = (int) (j12 - j13);
                aVar.f8012b = j13 + i12;
                aVar.f8011a -= i12;
            }
            eVar.d(this.f8019f.f8011a);
            w.a aVar3 = this.f8019f;
            long j14 = aVar3.f8012b;
            ByteBuffer byteBuffer = eVar.f6899e;
            int i13 = aVar3.f8011a;
            b(j14);
            while (i13 > 0) {
                int min = Math.min(i13, (int) (this.i.f8031b - j14));
                a aVar4 = this.i;
                byteBuffer.put(aVar4.f8033d.f8176a, aVar4.a(j14), min);
                i13 -= min;
                j14 += min;
                a aVar5 = this.i;
                if (j14 == aVar5.f8031b) {
                    this.i = aVar5.f8034e;
                }
            }
        }
        return -4;
    }

    private void a(com.anythink.basead.exoplayer.c.e eVar, w.a aVar) {
        long j9 = aVar.f8012b;
        int i = 1;
        this.f8020g.a(1);
        a(j9, this.f8020g.f8659a, 1);
        long j10 = j9 + 1;
        byte b9 = this.f8020g.f8659a[0];
        boolean z8 = (b9 & com.anythink.core.common.s.a.c.f16474a) != 0;
        int i4 = b9 & Byte.MAX_VALUE;
        com.anythink.basead.exoplayer.c.b bVar = eVar.f6898d;
        if (bVar.f6876a == null) {
            bVar.f6876a = new byte[16];
        }
        a(j10, bVar.f6876a, i4);
        long j11 = j10 + i4;
        if (z8) {
            this.f8020g.a(2);
            a(j11, this.f8020g.f8659a, 2);
            j11 += 2;
            i = this.f8020g.e();
        }
        int i9 = i;
        com.anythink.basead.exoplayer.c.b bVar2 = eVar.f6898d;
        int[] iArr = bVar2.f6879d;
        if (iArr == null || iArr.length < i9) {
            iArr = new int[i9];
        }
        int[] iArr2 = iArr;
        int[] iArr3 = bVar2.f6880e;
        if (iArr3 == null || iArr3.length < i9) {
            iArr3 = new int[i9];
        }
        int[] iArr4 = iArr3;
        if (z8) {
            int i10 = i9 * 6;
            this.f8020g.a(i10);
            a(j11, this.f8020g.f8659a, i10);
            j11 += i10;
            this.f8020g.c(0);
            for (int i11 = 0; i11 < i9; i11++) {
                iArr2[i11] = this.f8020g.e();
                iArr4[i11] = this.f8020g.m();
            }
        } else {
            iArr2[0] = 0;
            iArr4[0] = aVar.f8011a - ((int) (j11 - aVar.f8012b));
        }
        m.a aVar2 = aVar.f8013c;
        com.anythink.basead.exoplayer.c.b bVar3 = eVar.f6898d;
        bVar3.a(i9, iArr2, iArr4, aVar2.f7341b, bVar3.f6876a, aVar2.f7340a, aVar2.f7342c, aVar2.f7343d);
        long j12 = aVar.f8012b;
        int i12 = (int) (j11 - j12);
        aVar.f8012b = j12 + i12;
        aVar.f8011a -= i12;
    }

    private void a(long j9, ByteBuffer byteBuffer, int i) {
        b(j9);
        while (i > 0) {
            int min = Math.min(i, (int) (this.i.f8031b - j9));
            a aVar = this.i;
            byteBuffer.put(aVar.f8033d.f8176a, aVar.a(j9), min);
            i -= min;
            j9 += min;
            a aVar2 = this.i;
            if (j9 == aVar2.f8031b) {
                this.i = aVar2.f8034e;
            }
        }
    }

    private void a(long j9, byte[] bArr, int i) {
        b(j9);
        int i4 = i;
        while (i4 > 0) {
            int min = Math.min(i4, (int) (this.i.f8031b - j9));
            a aVar = this.i;
            System.arraycopy(aVar.f8033d.f8176a, aVar.a(j9), bArr, i - i4, min);
            i4 -= min;
            j9 += min;
            a aVar2 = this.i;
            if (j9 == aVar2.f8031b) {
                this.i = aVar2.f8034e;
            }
        }
    }

    public final void a(b bVar) {
        this.f8029q = bVar;
    }

    public final void a(long j9) {
        if (this.f8026n != j9) {
            this.f8026n = j9;
            this.f8024l = true;
        }
    }

    @Override // com.anythink.basead.exoplayer.e.m
    public final void a(com.anythink.basead.exoplayer.m mVar) {
        com.anythink.basead.exoplayer.m mVar2;
        long j9 = this.f8026n;
        if (mVar == null) {
            mVar2 = null;
        } else {
            if (j9 != 0) {
                long j10 = mVar.f8825l;
                if (j10 != Long.MAX_VALUE) {
                    mVar2 = mVar.a(j10 + j9);
                }
            }
            mVar2 = mVar;
        }
        boolean a9 = this.f8018e.a(mVar2);
        this.f8025m = mVar;
        this.f8024l = false;
        b bVar = this.f8029q;
        if (bVar == null || !a9) {
            return;
        }
        bVar.i();
    }

    @Override // com.anythink.basead.exoplayer.e.m
    public final int a(com.anythink.basead.exoplayer.e.f fVar, int i, boolean z8) {
        int d2 = d(i);
        a aVar = this.f8022j;
        int a9 = fVar.a(aVar.f8033d.f8176a, aVar.a(this.f8027o), d2);
        if (a9 != -1) {
            e(a9);
            return a9;
        }
        if (z8) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // com.anythink.basead.exoplayer.e.m
    public final void a(com.anythink.basead.exoplayer.k.s sVar, int i) {
        while (i > 0) {
            int d2 = d(i);
            a aVar = this.f8022j;
            sVar.a(aVar.f8033d.f8176a, aVar.a(this.f8027o), d2);
            i -= d2;
            e(d2);
        }
    }

    @Override // com.anythink.basead.exoplayer.e.m
    public final void a(long j9, int i, int i4, int i9, m.a aVar) {
        if (this.f8024l) {
            a(this.f8025m);
        }
        if (this.f8028p) {
            if ((i & 1) == 0 || !this.f8018e.a(j9)) {
                return;
            } else {
                this.f8028p = false;
            }
        }
        this.f8018e.a(j9 + this.f8026n, i, (this.f8027o - i4) - i9, i4, aVar);
    }

    private void a(a aVar) {
        if (aVar.f8032c) {
            a aVar2 = this.f8022j;
            int i = (((int) (aVar2.f8030a - aVar.f8030a)) / this.f8017d) + (aVar2.f8032c ? 1 : 0);
            com.anythink.basead.exoplayer.j.a[] aVarArr = new com.anythink.basead.exoplayer.j.a[i];
            for (int i4 = 0; i4 < i; i4++) {
                aVarArr[i4] = aVar.f8033d;
                aVar = aVar.a();
            }
            this.f8016c.a(aVarArr);
        }
    }

    private static com.anythink.basead.exoplayer.m a(com.anythink.basead.exoplayer.m mVar, long j9) {
        if (mVar == null) {
            return null;
        }
        if (j9 == 0) {
            return mVar;
        }
        long j10 = mVar.f8825l;
        return j10 != Long.MAX_VALUE ? mVar.a(j10 + j9) : mVar;
    }

    public final void a() {
        this.f8018e.a();
        a(this.f8021h);
        a aVar = new a(0L, this.f8017d);
        this.f8021h = aVar;
        this.i = aVar;
        this.f8022j = aVar;
        this.f8027o = 0L;
        this.f8016c.b();
    }
}
