package com.anythink.basead.exoplayer;

import android.util.Log;
import com.anythink.basead.exoplayer.h.af;

/* loaded from: classes.dex */
final class q {

    /* renamed from: l, reason: collision with root package name */
    private static final String f8687l = "MediaPeriodHolder";

    /* renamed from: a, reason: collision with root package name */
    public final com.anythink.basead.exoplayer.h.r f8688a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f8689b;

    /* renamed from: c, reason: collision with root package name */
    public final com.anythink.basead.exoplayer.h.y[] f8690c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean[] f8691d;

    /* renamed from: e, reason: collision with root package name */
    public long f8692e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f8693f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f8694g;

    /* renamed from: h, reason: collision with root package name */
    public r f8695h;
    public q i;

    /* renamed from: j, reason: collision with root package name */
    public af f8696j;

    /* renamed from: k, reason: collision with root package name */
    public com.anythink.basead.exoplayer.i.i f8697k;

    /* renamed from: m, reason: collision with root package name */
    private final z[] f8698m;

    /* renamed from: n, reason: collision with root package name */
    private final com.anythink.basead.exoplayer.i.h f8699n;

    /* renamed from: o, reason: collision with root package name */
    private final com.anythink.basead.exoplayer.h.s f8700o;

    /* renamed from: p, reason: collision with root package name */
    private com.anythink.basead.exoplayer.i.i f8701p;

    public q(z[] zVarArr, long j6, com.anythink.basead.exoplayer.i.h hVar, com.anythink.basead.exoplayer.j.b bVar, com.anythink.basead.exoplayer.h.s sVar, Object obj, r rVar) {
        this.f8698m = zVarArr;
        this.f8692e = j6 - rVar.f8703b;
        this.f8699n = hVar;
        this.f8700o = sVar;
        this.f8689b = com.anythink.basead.exoplayer.k.a.a(obj);
        this.f8695h = rVar;
        this.f8690c = new com.anythink.basead.exoplayer.h.y[zVarArr.length];
        this.f8691d = new boolean[zVarArr.length];
        com.anythink.basead.exoplayer.h.r a9 = sVar.a(rVar.f8702a, bVar);
        long j9 = rVar.f8704c;
        this.f8688a = j9 != Long.MIN_VALUE ? new com.anythink.basead.exoplayer.h.d(a9, true, 0L, j9) : a9;
    }

    private long d() {
        return this.f8692e;
    }

    private long e() {
        return this.f8695h.f8706e;
    }

    public final boolean a() {
        if (this.f8693f) {
            return !this.f8694g || this.f8688a.d() == Long.MIN_VALUE;
        }
        return false;
    }

    public final long b() {
        if (this.f8693f) {
            return this.f8688a.e();
        }
        return 0L;
    }

    public final void c() {
        a((com.anythink.basead.exoplayer.i.i) null);
        try {
            if (this.f8695h.f8704c != Long.MIN_VALUE) {
                this.f8700o.a(((com.anythink.basead.exoplayer.h.d) this.f8688a).f7593a);
            } else {
                this.f8700o.a(this.f8688a);
            }
        } catch (RuntimeException e9) {
            Log.e(f8687l, "Period release failed.", e9);
        }
    }

    private void b(float f3) {
        this.f8693f = true;
        this.f8696j = this.f8688a.b();
        a(f3);
        long b9 = b(this.f8695h.f8703b);
        long j6 = this.f8692e;
        r rVar = this.f8695h;
        this.f8692e = (rVar.f8703b - b9) + j6;
        this.f8695h = new r(rVar.f8702a, b9, rVar.f8704c, rVar.f8705d, rVar.f8706e, rVar.f8707f, rVar.f8708g);
    }

    private long d(long j6) {
        return j6 - this.f8692e;
    }

    private void e(long j6) {
        if (this.f8693f) {
            this.f8688a.a_(j6 - this.f8692e);
        }
    }

    public final long a(boolean z3) {
        if (!this.f8693f) {
            return this.f8695h.f8703b;
        }
        long d2 = this.f8688a.d();
        return (d2 == Long.MIN_VALUE && z3) ? this.f8695h.f8706e : d2;
    }

    private static void c(com.anythink.basead.exoplayer.i.i iVar) {
        for (int i = 0; i < iVar.f7981a; i++) {
            iVar.a(i);
            iVar.f7983c.a(i);
        }
    }

    public final boolean a(float f3) {
        com.anythink.basead.exoplayer.i.i a9 = this.f8699n.a(this.f8698m, this.f8696j);
        if (a9.a(this.f8701p)) {
            return false;
        }
        this.f8697k = a9;
        for (com.anythink.basead.exoplayer.i.f fVar : a9.f7983c.a()) {
            if (fVar != null) {
                fVar.a(f3);
            }
        }
        return true;
    }

    private long c(long j6) {
        return j6 + this.f8692e;
    }

    public final long b(long j6) {
        return a(j6, false, new boolean[this.f8698m.length]);
    }

    private static void b(com.anythink.basead.exoplayer.i.i iVar) {
        for (int i = 0; i < iVar.f7981a; i++) {
            boolean a9 = iVar.a(i);
            com.anythink.basead.exoplayer.i.f a10 = iVar.f7983c.a(i);
            if (a9 && a10 != null) {
                a10.a();
            }
        }
    }

    public final long a(long j6, boolean z3, boolean[] zArr) {
        int i = 0;
        while (true) {
            com.anythink.basead.exoplayer.i.i iVar = this.f8697k;
            boolean z6 = true;
            if (i >= iVar.f7981a) {
                break;
            }
            boolean[] zArr2 = this.f8691d;
            if (z3 || !iVar.a(this.f8701p, i)) {
                z6 = false;
            }
            zArr2[i] = z6;
            i++;
        }
        a(this.f8690c);
        a(this.f8697k);
        com.anythink.basead.exoplayer.i.g gVar = this.f8697k.f7983c;
        long a9 = this.f8688a.a(gVar.a(), this.f8691d, this.f8690c, zArr, j6);
        b(this.f8690c);
        this.f8694g = false;
        int i6 = 0;
        while (true) {
            com.anythink.basead.exoplayer.h.y[] yVarArr = this.f8690c;
            if (i6 >= yVarArr.length) {
                return a9;
            }
            if (yVarArr[i6] != null) {
                com.anythink.basead.exoplayer.k.a.b(this.f8697k.a(i6));
                if (this.f8698m[i6].a() != 5) {
                    this.f8694g = true;
                }
            } else {
                com.anythink.basead.exoplayer.k.a.b(gVar.a(i6) == null);
            }
            i6++;
        }
    }

    private void b(com.anythink.basead.exoplayer.h.y[] yVarArr) {
        int i = 0;
        while (true) {
            z[] zVarArr = this.f8698m;
            if (i >= zVarArr.length) {
                return;
            }
            if (zVarArr[i].a() == 5 && this.f8697k.a(i)) {
                yVarArr[i] = new com.anythink.basead.exoplayer.h.m();
            }
            i++;
        }
    }

    private void a(com.anythink.basead.exoplayer.i.i iVar) {
        com.anythink.basead.exoplayer.i.i iVar2 = this.f8701p;
        if (iVar2 != null) {
            c(iVar2);
        }
        this.f8701p = iVar;
        if (iVar != null) {
            b(iVar);
        }
    }

    private void a(com.anythink.basead.exoplayer.h.y[] yVarArr) {
        int i = 0;
        while (true) {
            z[] zVarArr = this.f8698m;
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
        this.f8688a.c(j6 - this.f8692e);
    }
}
