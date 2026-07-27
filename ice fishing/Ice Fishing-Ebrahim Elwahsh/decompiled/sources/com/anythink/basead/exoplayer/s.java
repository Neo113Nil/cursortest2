package com.anythink.basead.exoplayer;

import android.util.Pair;
import com.anythink.basead.exoplayer.ae;
import com.anythink.basead.exoplayer.h.s;
import com.anythink.basead.exoplayer.k.C0544a;

/* loaded from: classes.dex */
final class s {

    /* renamed from: a, reason: collision with root package name */
    private static final int f8866a = 100;

    /* renamed from: b, reason: collision with root package name */
    private final ae.a f8867b = new ae.a();

    /* renamed from: c, reason: collision with root package name */
    private final ae.b f8868c = new ae.b();

    /* renamed from: d, reason: collision with root package name */
    private long f8869d;

    /* renamed from: e, reason: collision with root package name */
    private ae f8870e;

    /* renamed from: f, reason: collision with root package name */
    private int f8871f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f8872g;

    /* renamed from: h, reason: collision with root package name */
    private q f8873h;
    private q i;

    /* renamed from: j, reason: collision with root package name */
    private q f8874j;

    /* renamed from: k, reason: collision with root package name */
    private int f8875k;

    /* renamed from: l, reason: collision with root package name */
    private Object f8876l;

    /* renamed from: m, reason: collision with root package name */
    private long f8877m;

    private boolean i() {
        q qVar;
        q e6 = e();
        if (e6 == null) {
            return true;
        }
        while (true) {
            int a9 = this.f8870e.a(e6.f8852h.f8859a.f7924a, this.f8867b, this.f8868c, this.f8871f, this.f8872g);
            while (true) {
                qVar = e6.i;
                if (qVar == null || e6.f8852h.f8864f) {
                    break;
                }
                e6 = qVar;
            }
            if (a9 == -1 || qVar == null || qVar.f8852h.f8859a.f7924a != a9) {
                break;
            }
            e6 = qVar;
        }
        boolean a10 = a(e6);
        r rVar = e6.f8852h;
        e6.f8852h = a(rVar, rVar.f8859a);
        return (a10 && f()) ? false : true;
    }

    public final void a(ae aeVar) {
        this.f8870e = aeVar;
    }

    public final q b() {
        return this.f8874j;
    }

    public final q c() {
        return this.f8873h;
    }

    public final q d() {
        return this.i;
    }

    public final q e() {
        return f() ? this.f8873h : this.f8874j;
    }

    public final boolean f() {
        return this.f8873h != null;
    }

    public final q g() {
        q qVar = this.i;
        C0544a.b((qVar == null || qVar.i == null) ? false : true);
        q qVar2 = this.i.i;
        this.i = qVar2;
        return qVar2;
    }

    public final q h() {
        q qVar = this.f8873h;
        if (qVar != null) {
            if (qVar == this.i) {
                this.i = qVar.i;
            }
            qVar.c();
            int i = this.f8875k - 1;
            this.f8875k = i;
            if (i == 0) {
                this.f8874j = null;
                q qVar2 = this.f8873h;
                this.f8876l = qVar2.f8846b;
                this.f8877m = qVar2.f8852h.f8859a.f7927d;
            }
            this.f8873h = this.f8873h.i;
        } else {
            q qVar3 = this.f8874j;
            this.f8873h = qVar3;
            this.i = qVar3;
        }
        return this.f8873h;
    }

    public final boolean a(int i) {
        this.f8871f = i;
        return i();
    }

    public final void b(boolean z8) {
        q e6 = e();
        if (e6 != null) {
            this.f8876l = z8 ? e6.f8846b : null;
            this.f8877m = e6.f8852h.f8859a.f7927d;
            e6.c();
            a(e6);
        } else if (!z8) {
            this.f8876l = null;
        }
        this.f8873h = null;
        this.f8874j = null;
        this.i = null;
        this.f8875k = 0;
    }

    public final boolean a(boolean z8) {
        this.f8872g = z8;
        return i();
    }

    public final boolean a(com.anythink.basead.exoplayer.h.r rVar) {
        q qVar = this.f8874j;
        return qVar != null && qVar.f8845a == rVar;
    }

    public final void a(long j9) {
        q qVar = this.f8874j;
        if (qVar == null || !qVar.f8850f) {
            return;
        }
        qVar.f8845a.a_(j9 - qVar.f8849e);
    }

    private long b(int i) {
        int a9;
        Object obj = this.f8870e.a(i, this.f8867b, true).f6500b;
        int i4 = this.f8867b.f6501c;
        Object obj2 = this.f8876l;
        if (obj2 != null && (a9 = this.f8870e.a(obj2)) != -1 && this.f8870e.a(a9, this.f8867b, false).f6501c == i4) {
            return this.f8877m;
        }
        for (q e6 = e(); e6 != null; e6 = e6.i) {
            if (e6.f8846b.equals(obj)) {
                return e6.f8852h.f8859a.f7927d;
            }
        }
        for (q e9 = e(); e9 != null; e9 = e9.i) {
            int a10 = this.f8870e.a(e9.f8846b);
            if (a10 != -1 && this.f8870e.a(a10, this.f8867b, false).f6501c == i4) {
                return e9.f8852h.f8859a.f7927d;
            }
        }
        long j9 = this.f8869d;
        this.f8869d = 1 + j9;
        return j9;
    }

    public final boolean a() {
        q qVar = this.f8874j;
        if (qVar != null) {
            return !qVar.f8852h.f8865g && qVar.a() && this.f8874j.f8852h.f8863e != b.f6539b && this.f8875k < 100;
        }
        return true;
    }

    public final r a(long j9, u uVar) {
        q qVar = this.f8874j;
        if (qVar == null) {
            return a(uVar.f8907c, uVar.f8909e, uVar.f8908d);
        }
        return a(qVar, j9);
    }

    public final com.anythink.basead.exoplayer.h.r a(z[] zVarArr, com.anythink.basead.exoplayer.i.h hVar, com.anythink.basead.exoplayer.j.b bVar, com.anythink.basead.exoplayer.h.s sVar, Object obj, r rVar) {
        r rVar2;
        long j9;
        q qVar = this.f8874j;
        if (qVar == null) {
            rVar2 = rVar;
            j9 = rVar2.f8860b;
        } else {
            rVar2 = rVar;
            j9 = qVar.f8849e + qVar.f8852h.f8863e;
        }
        q qVar2 = new q(zVarArr, j9, hVar, bVar, sVar, obj, rVar2);
        if (this.f8874j != null) {
            C0544a.b(f());
            this.f8874j.i = qVar2;
        }
        this.f8876l = null;
        this.f8874j = qVar2;
        this.f8875k++;
        return qVar2.f8845a;
    }

    public final boolean a(q qVar) {
        boolean z8 = false;
        C0544a.b(qVar != null);
        this.f8874j = qVar;
        while (true) {
            qVar = qVar.i;
            if (qVar != null) {
                if (qVar == this.i) {
                    this.i = this.f8873h;
                    z8 = true;
                }
                qVar.c();
                this.f8875k--;
            } else {
                this.f8874j.i = null;
                return z8;
            }
        }
    }

    private r b(int i, long j9, long j10) {
        s.a aVar = new s.a(i, j10);
        this.f8870e.a(aVar.f7924a, this.f8867b, false);
        int b9 = this.f8867b.b(j9);
        long a9 = b9 == -1 ? Long.MIN_VALUE : this.f8867b.a(b9);
        boolean b10 = b(aVar, a9);
        return new r(aVar, j9, a9, b.f6539b, a9 == Long.MIN_VALUE ? this.f8867b.f6502d : a9, b10, a(aVar, b10));
    }

    public final boolean a(s.a aVar, long j9) {
        int i = aVar.f7924a;
        q qVar = null;
        int i4 = i;
        for (q e6 = e(); e6 != null; e6 = e6.i) {
            if (qVar == null) {
                e6.f8852h = a(e6.f8852h, i4);
            } else {
                if (i4 == -1 || !e6.f8846b.equals(this.f8870e.a(i4, this.f8867b, true).f6500b)) {
                    return !a(qVar);
                }
                r a9 = a(qVar, j9);
                if (a9 == null) {
                    return !a(qVar);
                }
                r a10 = a(e6.f8852h, i4);
                e6.f8852h = a10;
                if (a10.f8860b != a9.f8860b || a10.f8861c != a9.f8861c || !a10.f8859a.equals(a9.f8859a)) {
                    return !a(qVar);
                }
            }
            if (e6.f8852h.f8864f) {
                i4 = this.f8870e.a(i4, this.f8867b, this.f8868c, this.f8871f, this.f8872g);
            }
            qVar = e6;
        }
        return true;
    }

    private boolean b(s.a aVar, long j9) {
        int c4 = this.f8870e.a(aVar.f7924a, this.f8867b, false).c();
        if (c4 == 0) {
            return true;
        }
        int i = c4 - 1;
        boolean a9 = aVar.a();
        if (this.f8867b.a(i) != Long.MIN_VALUE) {
            return !a9 && j9 == Long.MIN_VALUE;
        }
        int d2 = this.f8867b.d(i);
        if (d2 == -1) {
            return false;
        }
        return (a9 && aVar.f7925b == i && aVar.f7926c == d2 + (-1)) || (!a9 && this.f8867b.b(i) == d2);
    }

    public final r a(r rVar, int i) {
        return a(rVar, rVar.f8859a.a(i));
    }

    private s.a a(int i, long j9, long j10) {
        this.f8870e.a(i, this.f8867b, false);
        int a9 = this.f8867b.a(j9);
        if (a9 == -1) {
            return new s.a(i, j10);
        }
        return new s.a(i, a9, this.f8867b.b(a9), j10);
    }

    private static boolean a(q qVar, r rVar) {
        r rVar2 = qVar.f8852h;
        return rVar2.f8860b == rVar.f8860b && rVar2.f8861c == rVar.f8861c && rVar2.f8859a.equals(rVar.f8859a);
    }

    private r a(u uVar) {
        return a(uVar.f8907c, uVar.f8909e, uVar.f8908d);
    }

    private r a(q qVar, long j9) {
        r rVar = qVar.f8852h;
        if (rVar.f8864f) {
            int a9 = this.f8870e.a(rVar.f8859a.f7924a, this.f8867b, this.f8868c, this.f8871f, this.f8872g);
            if (a9 == -1) {
                return null;
            }
            int i = this.f8870e.a(a9, this.f8867b, true).f6501c;
            Object obj = this.f8867b.f6500b;
            long j10 = rVar.f8859a.f7927d;
            long j11 = 0;
            if (this.f8870e.a(i, this.f8868c, false).f6510f == a9) {
                Pair<Integer, Long> a10 = this.f8870e.a(this.f8868c, this.f8867b, i, b.f6539b, Math.max(0L, (qVar.f8849e + rVar.f8863e) - j9));
                if (a10 == null) {
                    return null;
                }
                a9 = ((Integer) a10.first).intValue();
                j11 = ((Long) a10.second).longValue();
                q qVar2 = qVar.i;
                if (qVar2 != null && qVar2.f8846b.equals(obj)) {
                    j10 = qVar.i.f8852h.f8859a.f7927d;
                } else {
                    j10 = this.f8869d;
                    this.f8869d = 1 + j10;
                }
            }
            long j12 = j11;
            return a(a(a9, j12, j10), j12, j12);
        }
        s.a aVar = rVar.f8859a;
        this.f8870e.a(aVar.f7924a, this.f8867b, false);
        if (aVar.a()) {
            int i4 = aVar.f7925b;
            int d2 = this.f8867b.d(i4);
            if (d2 == -1) {
                return null;
            }
            int a11 = this.f8867b.a(i4, aVar.f7926c);
            if (a11 < d2) {
                if (this.f8867b.b(i4, a11)) {
                    return a(aVar.f7924a, i4, a11, rVar.f8862d, aVar.f7927d);
                }
                return null;
            }
            return b(aVar.f7924a, rVar.f8862d, aVar.f7927d);
        }
        long j13 = rVar.f8861c;
        if (j13 != Long.MIN_VALUE) {
            int a12 = this.f8867b.a(j13);
            if (a12 == -1) {
                return b(aVar.f7924a, rVar.f8861c, aVar.f7927d);
            }
            int b9 = this.f8867b.b(a12);
            if (this.f8867b.b(a12, b9)) {
                return a(aVar.f7924a, a12, b9, rVar.f8861c, aVar.f7927d);
            }
            return null;
        }
        int c4 = this.f8867b.c();
        if (c4 == 0) {
            return null;
        }
        int i9 = c4 - 1;
        if (this.f8867b.a(i9) != Long.MIN_VALUE || this.f8867b.c(i9)) {
            return null;
        }
        int b10 = this.f8867b.b(i9);
        if (!this.f8867b.b(i9, b10)) {
            return null;
        }
        return a(aVar.f7924a, i9, b10, this.f8867b.f6502d, aVar.f7927d);
    }

    private r a(r rVar, s.a aVar) {
        long j9;
        long j10;
        long j11 = rVar.f8860b;
        long j12 = rVar.f8861c;
        boolean b9 = b(aVar, j12);
        boolean a9 = a(aVar, b9);
        this.f8870e.a(aVar.f7924a, this.f8867b, false);
        if (aVar.a()) {
            j10 = this.f8867b.c(aVar.f7925b, aVar.f7926c);
        } else if (j12 == Long.MIN_VALUE) {
            j10 = this.f8867b.f6502d;
        } else {
            j9 = j12;
            return new r(aVar, j11, j12, rVar.f8862d, j9, b9, a9);
        }
        j9 = j10;
        return new r(aVar, j11, j12, rVar.f8862d, j9, b9, a9);
    }

    private r a(s.a aVar, long j9, long j10) {
        this.f8870e.a(aVar.f7924a, this.f8867b, false);
        if (aVar.a()) {
            if (this.f8867b.b(aVar.f7925b, aVar.f7926c)) {
                return a(aVar.f7924a, aVar.f7925b, aVar.f7926c, j9, aVar.f7927d);
            }
            return null;
        }
        return b(aVar.f7924a, j10, aVar.f7927d);
    }

    private r a(int i, int i4, int i9, long j9, long j10) {
        s.a aVar = new s.a(i, i4, i9, j10);
        boolean b9 = b(aVar, Long.MIN_VALUE);
        boolean a9 = a(aVar, b9);
        return new r(aVar, i9 == this.f8867b.b(i4) ? this.f8867b.d() : 0L, Long.MIN_VALUE, j9, this.f8870e.a(aVar.f7924a, this.f8867b, false).c(aVar.f7925b, aVar.f7926c), b9, a9);
    }

    private boolean a(s.a aVar, boolean z8) {
        return !this.f8870e.a(this.f8870e.a(aVar.f7924a, this.f8867b, false).f6501c, this.f8868c, false).f6509e && this.f8870e.b(aVar.f7924a, this.f8867b, this.f8868c, this.f8871f, this.f8872g) && z8;
    }

    public final s.a a(int i, long j9) {
        long j10;
        int a9;
        Object obj = this.f8870e.a(i, this.f8867b, true).f6500b;
        int i4 = this.f8867b.f6501c;
        Object obj2 = this.f8876l;
        if (obj2 != null && (a9 = this.f8870e.a(obj2)) != -1 && this.f8870e.a(a9, this.f8867b, false).f6501c == i4) {
            j10 = this.f8877m;
        } else {
            q e6 = e();
            while (true) {
                if (e6 != null) {
                    if (e6.f8846b.equals(obj)) {
                        j10 = e6.f8852h.f8859a.f7927d;
                        break;
                    }
                    e6 = e6.i;
                } else {
                    q e9 = e();
                    while (true) {
                        if (e9 != null) {
                            int a10 = this.f8870e.a(e9.f8846b);
                            if (a10 != -1 && this.f8870e.a(a10, this.f8867b, false).f6501c == i4) {
                                j10 = e9.f8852h.f8859a.f7927d;
                                break;
                            }
                            e9 = e9.i;
                        } else {
                            j10 = this.f8869d;
                            this.f8869d = 1 + j10;
                            break;
                        }
                    }
                }
            }
        }
        return a(i, j9, j10);
    }
}
