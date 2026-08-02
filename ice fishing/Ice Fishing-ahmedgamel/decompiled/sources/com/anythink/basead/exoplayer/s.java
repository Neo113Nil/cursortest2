package com.anythink.basead.exoplayer;

import android.util.Pair;
import com.anythink.basead.exoplayer.ae;
import com.anythink.basead.exoplayer.h.s;

/* loaded from: classes.dex */
final class s {

    /* renamed from: a, reason: collision with root package name */
    private static final int f9495a = 100;

    /* renamed from: b, reason: collision with root package name */
    private final ae.a f9496b = new ae.a();

    /* renamed from: c, reason: collision with root package name */
    private final ae.b f9497c = new ae.b();

    /* renamed from: d, reason: collision with root package name */
    private long f9498d;

    /* renamed from: e, reason: collision with root package name */
    private ae f9499e;

    /* renamed from: f, reason: collision with root package name */
    private int f9500f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f9501g;

    /* renamed from: h, reason: collision with root package name */
    private q f9502h;
    private q i;

    /* renamed from: j, reason: collision with root package name */
    private q f9503j;

    /* renamed from: k, reason: collision with root package name */
    private int f9504k;

    /* renamed from: l, reason: collision with root package name */
    private Object f9505l;

    /* renamed from: m, reason: collision with root package name */
    private long f9506m;

    private boolean i() {
        q qVar;
        q e9 = e();
        if (e9 == null) {
            return true;
        }
        while (true) {
            int a9 = this.f9499e.a(e9.f9481h.f9488a.f8553a, this.f9496b, this.f9497c, this.f9500f, this.f9501g);
            while (true) {
                qVar = e9.i;
                if (qVar == null || e9.f9481h.f9493f) {
                    break;
                }
                e9 = qVar;
            }
            if (a9 == -1 || qVar == null || qVar.f9481h.f9488a.f8553a != a9) {
                break;
            }
            e9 = qVar;
        }
        boolean a10 = a(e9);
        r rVar = e9.f9481h;
        e9.f9481h = a(rVar, rVar.f9488a);
        return (a10 && f()) ? false : true;
    }

    public final void a(ae aeVar) {
        this.f9499e = aeVar;
    }

    public final q b() {
        return this.f9503j;
    }

    public final q c() {
        return this.f9502h;
    }

    public final q d() {
        return this.i;
    }

    public final q e() {
        return f() ? this.f9502h : this.f9503j;
    }

    public final boolean f() {
        return this.f9502h != null;
    }

    public final q g() {
        q qVar = this.i;
        com.anythink.basead.exoplayer.k.a.b((qVar == null || qVar.i == null) ? false : true);
        q qVar2 = this.i.i;
        this.i = qVar2;
        return qVar2;
    }

    public final q h() {
        q qVar = this.f9502h;
        if (qVar != null) {
            if (qVar == this.i) {
                this.i = qVar.i;
            }
            qVar.c();
            int i = this.f9504k - 1;
            this.f9504k = i;
            if (i == 0) {
                this.f9503j = null;
                q qVar2 = this.f9502h;
                this.f9505l = qVar2.f9475b;
                this.f9506m = qVar2.f9481h.f9488a.f8556d;
            }
            this.f9502h = this.f9502h.i;
        } else {
            q qVar3 = this.f9503j;
            this.f9502h = qVar3;
            this.i = qVar3;
        }
        return this.f9502h;
    }

    public final boolean a(int i) {
        this.f9500f = i;
        return i();
    }

    public final void b(boolean z6) {
        q e9 = e();
        if (e9 != null) {
            this.f9505l = z6 ? e9.f9475b : null;
            this.f9506m = e9.f9481h.f9488a.f8556d;
            e9.c();
            a(e9);
        } else if (!z6) {
            this.f9505l = null;
        }
        this.f9502h = null;
        this.f9503j = null;
        this.i = null;
        this.f9504k = 0;
    }

    public final boolean a(boolean z6) {
        this.f9501g = z6;
        return i();
    }

    public final boolean a(com.anythink.basead.exoplayer.h.r rVar) {
        q qVar = this.f9503j;
        return qVar != null && qVar.f9474a == rVar;
    }

    public final void a(long j6) {
        q qVar = this.f9503j;
        if (qVar == null || !qVar.f9479f) {
            return;
        }
        qVar.f9474a.a_(j6 - qVar.f9478e);
    }

    private long b(int i) {
        int a9;
        Object obj = this.f9499e.a(i, this.f9496b, true).f7129b;
        int i4 = this.f9496b.f7130c;
        Object obj2 = this.f9505l;
        if (obj2 != null && (a9 = this.f9499e.a(obj2)) != -1 && this.f9499e.a(a9, this.f9496b, false).f7130c == i4) {
            return this.f9506m;
        }
        for (q e9 = e(); e9 != null; e9 = e9.i) {
            if (e9.f9475b.equals(obj)) {
                return e9.f9481h.f9488a.f8556d;
            }
        }
        for (q e10 = e(); e10 != null; e10 = e10.i) {
            int a10 = this.f9499e.a(e10.f9475b);
            if (a10 != -1 && this.f9499e.a(a10, this.f9496b, false).f7130c == i4) {
                return e10.f9481h.f9488a.f8556d;
            }
        }
        long j6 = this.f9498d;
        this.f9498d = 1 + j6;
        return j6;
    }

    public final boolean a() {
        q qVar = this.f9503j;
        if (qVar != null) {
            return !qVar.f9481h.f9494g && qVar.a() && this.f9503j.f9481h.f9492e != b.f7168b && this.f9504k < 100;
        }
        return true;
    }

    public final r a(long j6, u uVar) {
        q qVar = this.f9503j;
        if (qVar == null) {
            return a(uVar.f9536c, uVar.f9538e, uVar.f9537d);
        }
        return a(qVar, j6);
    }

    public final com.anythink.basead.exoplayer.h.r a(z[] zVarArr, com.anythink.basead.exoplayer.i.h hVar, com.anythink.basead.exoplayer.j.b bVar, com.anythink.basead.exoplayer.h.s sVar, Object obj, r rVar) {
        r rVar2;
        long j6;
        q qVar = this.f9503j;
        if (qVar == null) {
            rVar2 = rVar;
            j6 = rVar2.f9489b;
        } else {
            rVar2 = rVar;
            j6 = qVar.f9478e + qVar.f9481h.f9492e;
        }
        q qVar2 = new q(zVarArr, j6, hVar, bVar, sVar, obj, rVar2);
        if (this.f9503j != null) {
            com.anythink.basead.exoplayer.k.a.b(f());
            this.f9503j.i = qVar2;
        }
        this.f9505l = null;
        this.f9503j = qVar2;
        this.f9504k++;
        return qVar2.f9474a;
    }

    public final boolean a(q qVar) {
        boolean z6 = false;
        com.anythink.basead.exoplayer.k.a.b(qVar != null);
        this.f9503j = qVar;
        while (true) {
            qVar = qVar.i;
            if (qVar != null) {
                if (qVar == this.i) {
                    this.i = this.f9502h;
                    z6 = true;
                }
                qVar.c();
                this.f9504k--;
            } else {
                this.f9503j.i = null;
                return z6;
            }
        }
    }

    private r b(int i, long j6, long j9) {
        s.a aVar = new s.a(i, j9);
        this.f9499e.a(aVar.f8553a, this.f9496b, false);
        int b9 = this.f9496b.b(j6);
        long a9 = b9 == -1 ? Long.MIN_VALUE : this.f9496b.a(b9);
        boolean b10 = b(aVar, a9);
        return new r(aVar, j6, a9, b.f7168b, a9 == Long.MIN_VALUE ? this.f9496b.f7131d : a9, b10, a(aVar, b10));
    }

    public final boolean a(s.a aVar, long j6) {
        int i = aVar.f8553a;
        q qVar = null;
        int i4 = i;
        for (q e9 = e(); e9 != null; e9 = e9.i) {
            if (qVar == null) {
                e9.f9481h = a(e9.f9481h, i4);
            } else {
                if (i4 == -1 || !e9.f9475b.equals(this.f9499e.a(i4, this.f9496b, true).f7129b)) {
                    return !a(qVar);
                }
                r a9 = a(qVar, j6);
                if (a9 == null) {
                    return !a(qVar);
                }
                r a10 = a(e9.f9481h, i4);
                e9.f9481h = a10;
                if (a10.f9489b != a9.f9489b || a10.f9490c != a9.f9490c || !a10.f9488a.equals(a9.f9488a)) {
                    return !a(qVar);
                }
            }
            if (e9.f9481h.f9493f) {
                i4 = this.f9499e.a(i4, this.f9496b, this.f9497c, this.f9500f, this.f9501g);
            }
            qVar = e9;
        }
        return true;
    }

    private boolean b(s.a aVar, long j6) {
        int c9 = this.f9499e.a(aVar.f8553a, this.f9496b, false).c();
        if (c9 == 0) {
            return true;
        }
        int i = c9 - 1;
        boolean a9 = aVar.a();
        if (this.f9496b.a(i) != Long.MIN_VALUE) {
            return !a9 && j6 == Long.MIN_VALUE;
        }
        int d9 = this.f9496b.d(i);
        if (d9 == -1) {
            return false;
        }
        return (a9 && aVar.f8554b == i && aVar.f8555c == d9 + (-1)) || (!a9 && this.f9496b.b(i) == d9);
    }

    public final r a(r rVar, int i) {
        return a(rVar, rVar.f9488a.a(i));
    }

    private s.a a(int i, long j6, long j9) {
        this.f9499e.a(i, this.f9496b, false);
        int a9 = this.f9496b.a(j6);
        if (a9 == -1) {
            return new s.a(i, j9);
        }
        return new s.a(i, a9, this.f9496b.b(a9), j9);
    }

    private static boolean a(q qVar, r rVar) {
        r rVar2 = qVar.f9481h;
        return rVar2.f9489b == rVar.f9489b && rVar2.f9490c == rVar.f9490c && rVar2.f9488a.equals(rVar.f9488a);
    }

    private r a(u uVar) {
        return a(uVar.f9536c, uVar.f9538e, uVar.f9537d);
    }

    private r a(q qVar, long j6) {
        r rVar = qVar.f9481h;
        if (rVar.f9493f) {
            int a9 = this.f9499e.a(rVar.f9488a.f8553a, this.f9496b, this.f9497c, this.f9500f, this.f9501g);
            if (a9 == -1) {
                return null;
            }
            int i = this.f9499e.a(a9, this.f9496b, true).f7130c;
            Object obj = this.f9496b.f7129b;
            long j9 = rVar.f9488a.f8556d;
            long j10 = 0;
            if (this.f9499e.a(i, this.f9497c, false).f7139f == a9) {
                Pair<Integer, Long> a10 = this.f9499e.a(this.f9497c, this.f9496b, i, b.f7168b, Math.max(0L, (qVar.f9478e + rVar.f9492e) - j6));
                if (a10 == null) {
                    return null;
                }
                a9 = ((Integer) a10.first).intValue();
                j10 = ((Long) a10.second).longValue();
                q qVar2 = qVar.i;
                if (qVar2 != null && qVar2.f9475b.equals(obj)) {
                    j9 = qVar.i.f9481h.f9488a.f8556d;
                } else {
                    j9 = this.f9498d;
                    this.f9498d = 1 + j9;
                }
            }
            long j11 = j10;
            return a(a(a9, j11, j9), j11, j11);
        }
        s.a aVar = rVar.f9488a;
        this.f9499e.a(aVar.f8553a, this.f9496b, false);
        if (aVar.a()) {
            int i4 = aVar.f8554b;
            int d9 = this.f9496b.d(i4);
            if (d9 == -1) {
                return null;
            }
            int a11 = this.f9496b.a(i4, aVar.f8555c);
            if (a11 < d9) {
                if (this.f9496b.b(i4, a11)) {
                    return a(aVar.f8553a, i4, a11, rVar.f9491d, aVar.f8556d);
                }
                return null;
            }
            return b(aVar.f8553a, rVar.f9491d, aVar.f8556d);
        }
        long j12 = rVar.f9490c;
        if (j12 != Long.MIN_VALUE) {
            int a12 = this.f9496b.a(j12);
            if (a12 == -1) {
                return b(aVar.f8553a, rVar.f9490c, aVar.f8556d);
            }
            int b9 = this.f9496b.b(a12);
            if (this.f9496b.b(a12, b9)) {
                return a(aVar.f8553a, a12, b9, rVar.f9490c, aVar.f8556d);
            }
            return null;
        }
        int c9 = this.f9496b.c();
        if (c9 == 0) {
            return null;
        }
        int i6 = c9 - 1;
        if (this.f9496b.a(i6) != Long.MIN_VALUE || this.f9496b.c(i6)) {
            return null;
        }
        int b10 = this.f9496b.b(i6);
        if (!this.f9496b.b(i6, b10)) {
            return null;
        }
        return a(aVar.f8553a, i6, b10, this.f9496b.f7131d, aVar.f8556d);
    }

    private r a(r rVar, s.a aVar) {
        long j6;
        long j9;
        long j10 = rVar.f9489b;
        long j11 = rVar.f9490c;
        boolean b9 = b(aVar, j11);
        boolean a9 = a(aVar, b9);
        this.f9499e.a(aVar.f8553a, this.f9496b, false);
        if (aVar.a()) {
            j9 = this.f9496b.c(aVar.f8554b, aVar.f8555c);
        } else if (j11 == Long.MIN_VALUE) {
            j9 = this.f9496b.f7131d;
        } else {
            j6 = j11;
            return new r(aVar, j10, j11, rVar.f9491d, j6, b9, a9);
        }
        j6 = j9;
        return new r(aVar, j10, j11, rVar.f9491d, j6, b9, a9);
    }

    private r a(s.a aVar, long j6, long j9) {
        this.f9499e.a(aVar.f8553a, this.f9496b, false);
        if (aVar.a()) {
            if (this.f9496b.b(aVar.f8554b, aVar.f8555c)) {
                return a(aVar.f8553a, aVar.f8554b, aVar.f8555c, j6, aVar.f8556d);
            }
            return null;
        }
        return b(aVar.f8553a, j9, aVar.f8556d);
    }

    private r a(int i, int i4, int i6, long j6, long j9) {
        s.a aVar = new s.a(i, i4, i6, j9);
        boolean b9 = b(aVar, Long.MIN_VALUE);
        boolean a9 = a(aVar, b9);
        return new r(aVar, i6 == this.f9496b.b(i4) ? this.f9496b.d() : 0L, Long.MIN_VALUE, j6, this.f9499e.a(aVar.f8553a, this.f9496b, false).c(aVar.f8554b, aVar.f8555c), b9, a9);
    }

    private boolean a(s.a aVar, boolean z6) {
        return !this.f9499e.a(this.f9499e.a(aVar.f8553a, this.f9496b, false).f7130c, this.f9497c, false).f7138e && this.f9499e.b(aVar.f8553a, this.f9496b, this.f9497c, this.f9500f, this.f9501g) && z6;
    }

    public final s.a a(int i, long j6) {
        long j9;
        int a9;
        Object obj = this.f9499e.a(i, this.f9496b, true).f7129b;
        int i4 = this.f9496b.f7130c;
        Object obj2 = this.f9505l;
        if (obj2 != null && (a9 = this.f9499e.a(obj2)) != -1 && this.f9499e.a(a9, this.f9496b, false).f7130c == i4) {
            j9 = this.f9506m;
        } else {
            q e9 = e();
            while (true) {
                if (e9 != null) {
                    if (e9.f9475b.equals(obj)) {
                        j9 = e9.f9481h.f9488a.f8556d;
                        break;
                    }
                    e9 = e9.i;
                } else {
                    q e10 = e();
                    while (true) {
                        if (e10 != null) {
                            int a10 = this.f9499e.a(e10.f9475b);
                            if (a10 != -1 && this.f9499e.a(a10, this.f9496b, false).f7130c == i4) {
                                j9 = e10.f9481h.f9488a.f8556d;
                                break;
                            }
                            e10 = e10.i;
                        } else {
                            j9 = this.f9498d;
                            this.f9498d = 1 + j9;
                            break;
                        }
                    }
                }
            }
        }
        return a(i, j6, j9);
    }
}
