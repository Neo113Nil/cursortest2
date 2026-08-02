package com.anythink.basead.exoplayer;

import android.util.Log;
import com.anythink.basead.exoplayer.h.af;

/* loaded from: classes.dex */
final class q {

    /* renamed from: l, reason: collision with root package name */
    private static final String f9473l = "MediaPeriodHolder";

    /* renamed from: a, reason: collision with root package name */
    public final com.anythink.basead.exoplayer.h.r f9474a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f9475b;

    /* renamed from: c, reason: collision with root package name */
    public final com.anythink.basead.exoplayer.h.y[] f9476c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean[] f9477d;

    /* renamed from: e, reason: collision with root package name */
    public long f9478e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f9479f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f9480g;

    /* renamed from: h, reason: collision with root package name */
    public r f9481h;
    public q i;

    /* renamed from: j, reason: collision with root package name */
    public af f9482j;

    /* renamed from: k, reason: collision with root package name */
    public com.anythink.basead.exoplayer.i.i f9483k;

    /* renamed from: m, reason: collision with root package name */
    private final z[] f9484m;

    /* renamed from: n, reason: collision with root package name */
    private final com.anythink.basead.exoplayer.i.h f9485n;

    /* renamed from: o, reason: collision with root package name */
    private final com.anythink.basead.exoplayer.h.s f9486o;

    /* renamed from: p, reason: collision with root package name */
    private com.anythink.basead.exoplayer.i.i f9487p;

    public q(z[] zVarArr, long j6, com.anythink.basead.exoplayer.i.h hVar, com.anythink.basead.exoplayer.j.b bVar, com.anythink.basead.exoplayer.h.s sVar, Object obj, r rVar) {
        this.f9484m = zVarArr;
        this.f9478e = j6 - rVar.f9489b;
        this.f9485n = hVar;
        this.f9486o = sVar;
        this.f9475b = com.anythink.basead.exoplayer.k.a.a(obj);
        this.f9481h = rVar;
        this.f9476c = new com.anythink.basead.exoplayer.h.y[zVarArr.length];
        this.f9477d = new boolean[zVarArr.length];
        com.anythink.basead.exoplayer.h.r a9 = sVar.a(rVar.f9488a, bVar);
        long j9 = rVar.f9490c;
        this.f9474a = j9 != Long.MIN_VALUE ? new com.anythink.basead.exoplayer.h.d(a9, true, 0L, j9) : a9;
    }

    private long d() {
        return this.f9478e;
    }

    private long e() {
        return this.f9481h.f9492e;
    }

    public final boolean a() {
        if (this.f9479f) {
            return !this.f9480g || this.f9474a.d() == Long.MIN_VALUE;
        }
        return false;
    }

    public final long b() {
        if (this.f9479f) {
            return this.f9474a.e();
        }
        return 0L;
    }

    public final void c() {
        a((com.anythink.basead.exoplayer.i.i) null);
        try {
            if (this.f9481h.f9490c != Long.MIN_VALUE) {
                this.f9486o.a(((com.anythink.basead.exoplayer.h.d) this.f9474a).f8379a);
            } else {
                this.f9486o.a(this.f9474a);
            }
        } catch (RuntimeException e9) {
            Log.e(f9473l, "Period release failed.", e9);
        }
    }

    private void b(float f2) {
        this.f9479f = true;
        this.f9482j = this.f9474a.b();
        a(f2);
        long b9 = b(this.f9481h.f9489b);
        long j6 = this.f9478e;
        r rVar = this.f9481h;
        this.f9478e = (rVar.f9489b - b9) + j6;
        this.f9481h = new r(rVar.f9488a, b9, rVar.f9490c, rVar.f9491d, rVar.f9492e, rVar.f9493f, rVar.f9494g);
    }

    private long d(long j6) {
        return j6 - this.f9478e;
    }

    private void e(long j6) {
        if (this.f9479f) {
            this.f9474a.a_(j6 - this.f9478e);
        }
    }

    public final long a(boolean z6) {
        if (!this.f9479f) {
            return this.f9481h.f9489b;
        }
        long d9 = this.f9474a.d();
        return (d9 == Long.MIN_VALUE && z6) ? this.f9481h.f9492e : d9;
    }

    private static void c(com.anythink.basead.exoplayer.i.i iVar) {
        for (int i = 0; i < iVar.f8767a; i++) {
            iVar.a(i);
            iVar.f8769c.a(i);
        }
    }

    public final boolean a(float f2) {
        com.anythink.basead.exoplayer.i.i a9 = this.f9485n.a(this.f9484m, this.f9482j);
        if (a9.a(this.f9487p)) {
            return false;
        }
        this.f9483k = a9;
        for (com.anythink.basead.exoplayer.i.f fVar : a9.f8769c.a()) {
            if (fVar != null) {
                fVar.a(f2);
            }
        }
        return true;
    }

    private long c(long j6) {
        return j6 + this.f9478e;
    }

    public final long b(long j6) {
        return a(j6, false, new boolean[this.f9484m.length]);
    }

    private static void b(com.anythink.basead.exoplayer.i.i iVar) {
        for (int i = 0; i < iVar.f8767a; i++) {
            boolean a9 = iVar.a(i);
            com.anythink.basead.exoplayer.i.f a10 = iVar.f8769c.a(i);
            if (a9 && a10 != null) {
                a10.a();
            }
        }
    }

    public final long a(long j6, boolean z6, boolean[] zArr) {
        int i = 0;
        while (true) {
            com.anythink.basead.exoplayer.i.i iVar = this.f9483k;
            boolean z9 = true;
            if (i >= iVar.f8767a) {
                break;
            }
            boolean[] zArr2 = this.f9477d;
            if (z6 || !iVar.a(this.f9487p, i)) {
                z9 = false;
            }
            zArr2[i] = z9;
            i++;
        }
        a(this.f9476c);
        a(this.f9483k);
        com.anythink.basead.exoplayer.i.g gVar = this.f9483k.f8769c;
        long a9 = this.f9474a.a(gVar.a(), this.f9477d, this.f9476c, zArr, j6);
        b(this.f9476c);
        this.f9480g = false;
        int i4 = 0;
        while (true) {
            com.anythink.basead.exoplayer.h.y[] yVarArr = this.f9476c;
            if (i4 >= yVarArr.length) {
                return a9;
            }
            if (yVarArr[i4] != null) {
                com.anythink.basead.exoplayer.k.a.b(this.f9483k.a(i4));
                if (this.f9484m[i4].a() != 5) {
                    this.f9480g = true;
                }
            } else {
                com.anythink.basead.exoplayer.k.a.b(gVar.a(i4) == null);
            }
            i4++;
        }
    }

    private void b(com.anythink.basead.exoplayer.h.y[] yVarArr) {
        int i = 0;
        while (true) {
            z[] zVarArr = this.f9484m;
            if (i >= zVarArr.length) {
                return;
            }
            if (zVarArr[i].a() == 5 && this.f9483k.a(i)) {
                yVarArr[i] = new com.anythink.basead.exoplayer.h.m();
            }
            i++;
        }
    }

    private void a(com.anythink.basead.exoplayer.i.i iVar) {
        com.anythink.basead.exoplayer.i.i iVar2 = this.f9487p;
        if (iVar2 != null) {
            c(iVar2);
        }
        this.f9487p = iVar;
        if (iVar != null) {
            b(iVar);
        }
    }

    private void a(com.anythink.basead.exoplayer.h.y[] yVarArr) {
        int i = 0;
        while (true) {
            z[] zVarArr = this.f9484m;
            if (i >= zVarArr.length) {
                return;
            }
            if (zVarArr[i].a() == 5) {
                yVarArr[i] = null;
            }
            i++;
        }
    }

    public final void a(long j6) {
        this.f9474a.c(j6 - this.f9478e);
    }
}
