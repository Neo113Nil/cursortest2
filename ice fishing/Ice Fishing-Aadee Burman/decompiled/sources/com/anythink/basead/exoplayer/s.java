package com.anythink.basead.exoplayer;

import android.util.Pair;
import com.anythink.basead.exoplayer.ae;
import com.anythink.basead.exoplayer.h.s;

/* loaded from: classes.dex */
final class s {

    /* renamed from: a, reason: collision with root package name */
    private static final int f8709a = 100;

    /* renamed from: b, reason: collision with root package name */
    private final ae.a f8710b = new ae.a();

    /* renamed from: c, reason: collision with root package name */
    private final ae.b f8711c = new ae.b();

    /* renamed from: d, reason: collision with root package name */
    private long f8712d;

    /* renamed from: e, reason: collision with root package name */
    private ae f8713e;

    /* renamed from: f, reason: collision with root package name */
    private int f8714f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f8715g;

    /* renamed from: h, reason: collision with root package name */
    private q f8716h;
    private q i;

    /* renamed from: j, reason: collision with root package name */
    private q f8717j;

    /* renamed from: k, reason: collision with root package name */
    private int f8718k;

    /* renamed from: l, reason: collision with root package name */
    private Object f8719l;

    /* renamed from: m, reason: collision with root package name */
    private long f8720m;

    private boolean i() {
        q qVar;
        q e9 = e();
        if (e9 == null) {
            return true;
        }
        while (true) {
            int a9 = this.f8713e.a(e9.f8695h.f8702a.f7767a, this.f8710b, this.f8711c, this.f8714f, this.f8715g);
            while (true) {
                qVar = e9.i;
                if (qVar == null || e9.f8695h.f8707f) {
                    break;
                }
                e9 = qVar;
            }
            if (a9 == -1 || qVar == null || qVar.f8695h.f8702a.f7767a != a9) {
                break;
            }
            e9 = qVar;
        }
        boolean a10 = a(e9);
        r rVar = e9.f8695h;
        e9.f8695h = a(rVar, rVar.f8702a);
        return (a10 && f()) ? false : true;
    }

    public final void a(ae aeVar) {
        this.f8713e = aeVar;
    }

    public final q b() {
        return this.f8717j;
    }

    public final q c() {
        return this.f8716h;
    }

    public final q d() {
        return this.i;
    }

    public final q e() {
        return f() ? this.f8716h : this.f8717j;
    }

    public final boolean f() {
        return this.f8716h != null;
    }

    public final q g() {
        q qVar = this.i;
        com.anythink.basead.exoplayer.k.a.b((qVar == null || qVar.i == null) ? false : true);
        q qVar2 = this.i.i;
        this.i = qVar2;
        return qVar2;
    }

    public final q h() {
        q qVar = this.f8716h;
        if (qVar != null) {
            if (qVar == this.i) {
                this.i = qVar.i;
            }
            qVar.c();
            int i = this.f8718k - 1;
            this.f8718k = i;
            if (i == 0) {
                this.f8717j = null;
                q qVar2 = this.f8716h;
                this.f8719l = qVar2.f8689b;
                this.f8720m = qVar2.f8695h.f8702a.f7770d;
            }
            this.f8716h = this.f8716h.i;
        } else {
            q qVar3 = this.f8717j;
            this.f8716h = qVar3;
            this.i = qVar3;
        }
        return this.f8716h;
    }

    public final boolean a(int i) {
        this.f8714f = i;
        return i();
    }

    public final void b(boolean z3) {
        q e9 = e();
        if (e9 != null) {
            this.f8719l = z3 ? e9.f8689b : null;
            this.f8720m = e9.f8695h.f8702a.f7770d;
            e9.c();
            a(e9);
        } else if (!z3) {
            this.f8719l = null;
        }
        this.f8716h = null;
        this.f8717j = null;
        this.i = null;
        this.f8718k = 0;
    }

    public final boolean a(boolean z3) {
        this.f8715g = z3;
        return i();
    }

    public final boolean a(com.anythink.basead.exoplayer.h.r rVar) {
        q qVar = this.f8717j;
        return qVar != null && qVar.f8688a == rVar;
    }

    public final void a(long j6) {
        q qVar = this.f8717j;
        if (qVar == null || !qVar.f8693f) {
            return;
        }
        qVar.f8688a.a_(j6 - qVar.f8692e);
    }

    private long b(int i) {
        int a9;
        Object obj = this.f8713e.a(i, this.f8710b, true).f6343b;
        int i6 = this.f8710b.f6344c;
        Object obj2 = this.f8719l;
        if (obj2 != null && (a9 = this.f8713e.a(obj2)) != -1 && this.f8713e.a(a9, this.f8710b, false).f6344c == i6) {
            return this.f8720m;
        }
        for (q e9 = e(); e9 != null; e9 = e9.i) {
            if (e9.f8689b.equals(obj)) {
                return e9.f8695h.f8702a.f7770d;
            }
        }
        for (q e10 = e(); e10 != null; e10 = e10.i) {
            int a10 = this.f8713e.a(e10.f8689b);
            if (a10 != -1 && this.f8713e.a(a10, this.f8710b, false).f6344c == i6) {
                return e10.f8695h.f8702a.f7770d;
            }
        }
        long j6 = this.f8712d;
        this.f8712d = 1 + j6;
        return j6;
    }

    public final boolean a() {
        q qVar = this.f8717j;
        if (qVar != null) {
            return !qVar.f8695h.f8708g && qVar.a() && this.f8717j.f8695h.f8706e != b.f6382b && this.f8718k < 100;
        }
        return true;
    }

    public final r a(long j6, u uVar) {
        q qVar = this.f8717j;
        if (qVar == null) {
            return a(uVar.f8750c, uVar.f8752e, uVar.f8751d);
        }
        return a(qVar, j6);
    }

    public final com.anythink.basead.exoplayer.h.r a(z[] zVarArr, com.anythink.basead.exoplayer.i.h hVar, com.anythink.basead.exoplayer.j.b bVar, com.anythink.basead.exoplayer.h.s sVar, Object obj, r rVar) {
        r rVar2;
        long j6;
        q qVar = this.f8717j;
        if (qVar == null) {
            rVar2 = rVar;
            j6 = rVar2.f8703b;
        } else {
            rVar2 = rVar;
            j6 = qVar.f8692e + qVar.f8695h.f8706e;
        }
        q qVar2 = new q(zVarArr, j6, hVar, bVar, sVar, obj, rVar2);
        if (this.f8717j != null) {
            com.anythink.basead.exoplayer.k.a.b(f());
            this.f8717j.i = qVar2;
        }
        this.f8719l = null;
        this.f8717j = qVar2;
        this.f8718k++;
        return qVar2.f8688a;
    }

    public final boolean a(q qVar) {
        boolean z3 = false;
        com.anythink.basead.exoplayer.k.a.b(qVar != null);
        this.f8717j = qVar;
        while (true) {
            qVar = qVar.i;
            if (qVar != null) {
                if (qVar == this.i) {
                    this.i = this.f8716h;
                    z3 = true;
                }
                qVar.c();
                this.f8718k--;
            } else {
                this.f8717j.i = null;
                return z3;
            }
        }
    }

    private r b(int i, long j6, long j9) {
        s.a aVar = new s.a(i, j9);
        this.f8713e.a(aVar.f7767a, this.f8710b, false);
        int b9 = this.f8710b.b(j6);
        long a9 = b9 == -1 ? Long.MIN_VALUE : this.f8710b.a(b9);
        boolean b10 = b(aVar, a9);
        return new r(aVar, j6, a9, b.f6382b, a9 == Long.MIN_VALUE ? this.f8710b.f6345d : a9, b10, a(aVar, b10));
    }

    public final boolean a(s.a aVar, long j6) {
        int i = aVar.f7767a;
        q qVar = null;
        int i6 = i;
        for (q e9 = e(); e9 != null; e9 = e9.i) {
            if (qVar == null) {
                e9.f8695h = a(e9.f8695h, i6);
            } else {
                if (i6 == -1 || !e9.f8689b.equals(this.f8713e.a(i6, this.f8710b, true).f6343b)) {
                    return !a(qVar);
                }
                r a9 = a(qVar, j6);
                if (a9 == null) {
                    return !a(qVar);
                }
                r a10 = a(e9.f8695h, i6);
                e9.f8695h = a10;
                if (a10.f8703b != a9.f8703b || a10.f8704c != a9.f8704c || !a10.f8702a.equals(a9.f8702a)) {
                    return !a(qVar);
                }
            }
            if (e9.f8695h.f8707f) {
                i6 = this.f8713e.a(i6, this.f8710b, this.f8711c, this.f8714f, this.f8715g);
            }
            qVar = e9;
        }
        return true;
    }

    private boolean b(s.a aVar, long j6) {
        int c9 = this.f8713e.a(aVar.f7767a, this.f8710b, false).c();
        if (c9 == 0) {
            return true;
        }
        int i = c9 - 1;
        boolean a9 = aVar.a();
        if (this.f8710b.a(i) != Long.MIN_VALUE) {
            return !a9 && j6 == Long.MIN_VALUE;
        }
        int d2 = this.f8710b.d(i);
        if (d2 == -1) {
            return false;
        }
        return (a9 && aVar.f7768b == i && aVar.f7769c == d2 + (-1)) || (!a9 && this.f8710b.b(i) == d2);
    }

    public final r a(r rVar, int i) {
        return a(rVar, rVar.f8702a.a(i));
    }

    private s.a a(int i, long j6, long j9) {
        this.f8713e.a(i, this.f8710b, false);
        int a9 = this.f8710b.a(j6);
        if (a9 == -1) {
            return new s.a(i, j9);
        }
        return new s.a(i, a9, this.f8710b.b(a9), j9);
    }

    private static boolean a(q qVar, r rVar) {
        r rVar2 = qVar.f8695h;
        return rVar2.f8703b == rVar.f8703b && rVar2.f8704c == rVar.f8704c && rVar2.f8702a.equals(rVar.f8702a);
    }

    private r a(u uVar) {
        return a(uVar.f8750c, uVar.f8752e, uVar.f8751d);
    }

    private r a(q qVar, long j6) {
        r rVar = qVar.f8695h;
        if (rVar.f8707f) {
            int a9 = this.f8713e.a(rVar.f8702a.f7767a, this.f8710b, this.f8711c, this.f8714f, this.f8715g);
            if (a9 == -1) {
                return null;
            }
            int i = this.f8713e.a(a9, this.f8710b, true).f6344c;
            Object obj = this.f8710b.f6343b;
            long j9 = rVar.f8702a.f7770d;
            long j10 = 0;
            if (this.f8713e.a(i, this.f8711c, false).f6353f == a9) {
                Pair<Integer, Long> a10 = this.f8713e.a(this.f8711c, this.f8710b, i, b.f6382b, Math.max(0L, (qVar.f8692e + rVar.f8706e) - j6));
                if (a10 == null) {
                    return null;
                }
                a9 = ((Integer) a10.first).intValue();
                j10 = ((Long) a10.second).longValue();
                q qVar2 = qVar.i;
                if (qVar2 != null && qVar2.f8689b.equals(obj)) {
                    j9 = qVar.i.f8695h.f8702a.f7770d;
                } else {
                    j9 = this.f8712d;
                    this.f8712d = 1 + j9;
                }
            }
            long j11 = j10;
            return a(a(a9, j11, j9), j11, j11);
        }
        s.a aVar = rVar.f8702a;
        this.f8713e.a(aVar.f7767a, this.f8710b, false);
        if (aVar.a()) {
            int i6 = aVar.f7768b;
            int d2 = this.f8710b.d(i6);
            if (d2 == -1) {
                return null;
            }
            int a11 = this.f8710b.a(i6, aVar.f7769c);
            if (a11 < d2) {
                if (this.f8710b.b(i6, a11)) {
                    return a(aVar.f7767a, i6, a11, rVar.f8705d, aVar.f7770d);
                }
                return null;
            }
            return b(aVar.f7767a, rVar.f8705d, aVar.f7770d);
        }
        long j12 = rVar.f8704c;
        if (j12 != Long.MIN_VALUE) {
            int a12 = this.f8710b.a(j12);
            if (a12 == -1) {
                return b(aVar.f7767a, rVar.f8704c, aVar.f7770d);
            }
            int b9 = this.f8710b.b(a12);
            if (this.f8710b.b(a12, b9)) {
                return a(aVar.f7767a, a12, b9, rVar.f8704c, aVar.f7770d);
            }
            return null;
        }
        int c9 = this.f8710b.c();
        if (c9 == 0) {
            return null;
        }
        int i9 = c9 - 1;
        if (this.f8710b.a(i9) != Long.MIN_VALUE || this.f8710b.c(i9)) {
            return null;
        }
        int b10 = this.f8710b.b(i9);
        if (!this.f8710b.b(i9, b10)) {
            return null;
        }
        return a(aVar.f7767a, i9, b10, this.f8710b.f6345d, aVar.f7770d);
    }

    private r a(r rVar, s.a aVar) {
        long j6;
        long j9;
        long j10 = rVar.f8703b;
        long j11 = rVar.f8704c;
        boolean b9 = b(aVar, j11);
        boolean a9 = a(aVar, b9);
        this.f8713e.a(aVar.f7767a, this.f8710b, false);
        if (aVar.a()) {
            j9 = this.f8710b.c(aVar.f7768b, aVar.f7769c);
        } else if (j11 == Long.MIN_VALUE) {
            j9 = this.f8710b.f6345d;
        } else {
            j6 = j11;
            return new r(aVar, j10, j11, rVar.f8705d, j6, b9, a9);
        }
        j6 = j9;
        return new r(aVar, j10, j11, rVar.f8705d, j6, b9, a9);
    }

    private r a(s.a aVar, long j6, long j9) {
        this.f8713e.a(aVar.f7767a, this.f8710b, false);
        if (aVar.a()) {
            if (this.f8710b.b(aVar.f7768b, aVar.f7769c)) {
                return a(aVar.f7767a, aVar.f7768b, aVar.f7769c, j6, aVar.f7770d);
            }
            return null;
        }
        return b(aVar.f7767a, j9, aVar.f7770d);
    }

    private r a(int i, int i6, int i9, long j6, long j9) {
        s.a aVar = new s.a(i, i6, i9, j9);
        boolean b9 = b(aVar, Long.MIN_VALUE);
        boolean a9 = a(aVar, b9);
        return new r(aVar, i9 == this.f8710b.b(i6) ? this.f8710b.d() : 0L, Long.MIN_VALUE, j6, this.f8713e.a(aVar.f7767a, this.f8710b, false).c(aVar.f7768b, aVar.f7769c), b9, a9);
    }

    private boolean a(s.a aVar, boolean z3) {
        return !this.f8713e.a(this.f8713e.a(aVar.f7767a, this.f8710b, false).f6344c, this.f8711c, false).f6352e && this.f8713e.b(aVar.f7767a, this.f8710b, this.f8711c, this.f8714f, this.f8715g) && z3;
    }

    public final s.a a(int i, long j6) {
        long j9;
        int a9;
        Object obj = this.f8713e.a(i, this.f8710b, true).f6343b;
        int i6 = this.f8710b.f6344c;
        Object obj2 = this.f8719l;
        if (obj2 != null && (a9 = this.f8713e.a(obj2)) != -1 && this.f8713e.a(a9, this.f8710b, false).f6344c == i6) {
            j9 = this.f8720m;
        } else {
            q e9 = e();
            while (true) {
                if (e9 != null) {
                    if (e9.f8689b.equals(obj)) {
                        j9 = e9.f8695h.f8702a.f7770d;
                        break;
                    }
                    e9 = e9.i;
                } else {
                    q e10 = e();
                    while (true) {
                        if (e10 != null) {
                            int a10 = this.f8713e.a(e10.f8689b);
                            if (a10 != -1 && this.f8713e.a(a10, this.f8710b, false).f6344c == i6) {
                                j9 = e10.f8695h.f8702a.f7770d;
                                break;
                            }
                            e10 = e10.i;
                        } else {
                            j9 = this.f8712d;
                            this.f8712d = 1 + j9;
                            break;
                        }
                    }
                }
            }
        }
        return a(i, j6, j9);
    }
}
