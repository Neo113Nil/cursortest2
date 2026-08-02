package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public abstract class o3k implements mxo {
    public final qsf A;
    public long B;
    public final buf C;
    public final aqi D;
    public final aqi E;
    public final x6k F;
    public final x6k G;
    public final x6k H;
    public final x6k I;
    public boolean a;
    public y2k b;
    public final x6k c;
    public final evj d;
    public int e;
    public int f;
    public long g;
    public long h;
    public float i;
    public float j;
    public final hq7 k;
    public final boolean l;
    public int m;
    public duf n;
    public boolean o;
    public final x6k p;
    public jx7 q;
    public final uoi r;
    public final u6k s;
    public final u6k t;
    public final zx7 u;
    public final zx7 v;
    public final euf w;
    public final oxa x;
    public final ih2 y;
    public final x6k z;

    public o3k(int i, float f) {
        double d = f;
        if (-0.5d > d || d > 0.5d) {
            vme.a("currentPageOffsetFraction " + f + " is not within the range -0.5 to 0.5");
        }
        this.c = szf.g0(new enj(0L));
        this.d = new evj(i, f, this);
        this.e = i;
        this.g = Long.MAX_VALUE;
        this.k = new hq7(new l3k(this, 1));
        this.l = true;
        this.m = -1;
        this.p = new x6k(r3k.b, wvo.e);
        this.q = r3k.c;
        this.r = new uoi();
        this.s = new u6k(-1);
        this.t = new u6k(i);
        ehv ehvVar = ehv.h;
        this.u = szf.T(ehvVar, new ztf(this, 2));
        this.v = szf.T(ehvVar, new ztf(this, 3));
        this.w = new euf(new l3k(this, 0));
        this.x = new oxa(11, (byte) 0);
        this.y = new ih2();
        this.z = szf.g0(null);
        this.A = new qsf(this, 2);
        this.B = ia6.b(0, 0, 15);
        this.C = new buf();
        this.D = wdg.J();
        this.E = wdg.J();
        Boolean bool = Boolean.FALSE;
        this.F = szf.g0(bool);
        this.G = szf.g0(bool);
        this.H = szf.g0(bool);
        this.I = szf.g0(bool);
    }

    public static /* synthetic */ Object g(o3k o3kVar, int i, act actVar, Continuation continuation, int i2) {
        tm0 tm0Var = actVar;
        if ((i2 & 4) != 0) {
            tm0Var = weo.Q(0.0f, 0.0f, null, 7);
        }
        return o3kVar.f(i, tm0Var, continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x007c, code lost:
    
        if (r8.a(r6, r7, r0) != r1) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x007e, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0059, code lost:
    
        if (r8 == r1) goto L27;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object u(o3k o3kVar, hqi hqiVar, Function2 function2, Continuation continuation) {
        m3k m3kVar;
        int i;
        if (continuation instanceof m3k) {
            m3kVar = (m3k) continuation;
            int i2 = m3kVar.o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                m3kVar.o = i2 - Integer.MIN_VALUE;
                Object obj = m3kVar.m;
                Object obj2 = nm6.a;
                i = m3kVar.o;
                if (i != 0) {
                    qgg.h0(obj);
                    m3kVar.j = o3kVar;
                    m3kVar.k = hqiVar;
                    m3kVar.l = (aur) function2;
                    m3kVar.o = 1;
                    Object e = o3kVar.y.e(m3kVar);
                    if (e != obj2) {
                        e = Unit.a;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        o3kVar = m3kVar.j;
                        qgg.h0(obj);
                        o3kVar.s.i(-1);
                        return Unit.a;
                    }
                    function2 = (Function2) m3kVar.l;
                    hqiVar = m3kVar.k;
                    o3kVar = m3kVar.j;
                    qgg.h0(obj);
                }
                if (!o3kVar.k.b()) {
                    o3kVar.t.i(o3kVar.j());
                }
                hq7 hq7Var = o3kVar.k;
                m3kVar.j = o3kVar;
                m3kVar.k = null;
                m3kVar.l = null;
                m3kVar.o = 2;
            }
        }
        m3kVar = new m3k(o3kVar, continuation);
        Object obj3 = m3kVar.m;
        Object obj22 = nm6.a;
        i = m3kVar.o;
        if (i != 0) {
        }
        if (!o3kVar.k.b()) {
        }
        hq7 hq7Var2 = o3kVar.k;
        m3kVar.j = o3kVar;
        m3kVar.k = null;
        m3kVar.l = null;
        m3kVar.o = 2;
    }

    public static Object v(int i, o3k o3kVar, Continuation continuation) {
        o3kVar.getClass();
        Object a = o3kVar.a(hqi.a, new l71(o3kVar, i, null, 7), continuation);
        return a == nm6.a ? a : Unit.a;
    }

    @Override // defpackage.mxo
    public final Object a(hqi hqiVar, Function2 function2, Continuation continuation) {
        return u(this, hqiVar, function2, continuation);
    }

    @Override // defpackage.mxo
    public final boolean b() {
        return this.k.b();
    }

    @Override // defpackage.mxo
    public final boolean c() {
        return ((Boolean) this.G.getValue()).booleanValue();
    }

    @Override // defpackage.mxo
    public final boolean d() {
        return ((Boolean) this.F.getValue()).booleanValue();
    }

    @Override // defpackage.mxo
    public final float e(float f) {
        return this.k.e(f);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00b4, code lost:
    
        if (r6.a(defpackage.hqi.a, r5, r0) != r1) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(int i, tm0 tm0Var, Continuation continuation) {
        j3k j3kVar;
        int i2;
        o3k o3kVar;
        double d;
        if (continuation instanceof j3k) {
            j3kVar = (j3k) continuation;
            int i3 = j3kVar.o;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                j3kVar.o = i3 - Integer.MIN_VALUE;
                Object obj = j3kVar.m;
                nm6 nm6Var = nm6.a;
                i2 = j3kVar.o;
                if (i2 != 0) {
                    qgg.h0(obj);
                    if ((i == j() && k() == 0.0f) || n() == 0) {
                        return Unit.a;
                    }
                    j3kVar.j = this;
                    j3kVar.k = tm0Var;
                    j3kVar.l = i;
                    j3kVar.o = 1;
                    Object e = this.y.e(j3kVar);
                    if (e != nm6Var) {
                        e = Unit.a;
                    }
                    if (e != nm6Var) {
                        o3kVar = this;
                    }
                    return nm6Var;
                }
                if (i2 != 1) {
                    if (i2 == 2) {
                        qgg.h0(obj);
                        return Unit.a;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i = j3kVar.l;
                tm0Var = j3kVar.k;
                o3k o3kVar2 = j3kVar.j;
                qgg.h0(obj);
                o3kVar = o3kVar2;
                tm0 tm0Var2 = tm0Var;
                d = 0.0f;
                if (-0.5d <= d || d > 0.5d) {
                    vme.a("pageOffsetFraction 0.0 is not within the range -0.5 to 0.5");
                }
                k3k k3kVar = new k3k(o3kVar, o3kVar.i(i), 0.0f * o3kVar.p(), tm0Var2, null);
                j3kVar.j = null;
                j3kVar.k = null;
                j3kVar.o = 2;
            }
        }
        j3kVar = new j3k(this, continuation);
        Object obj2 = j3kVar.m;
        nm6 nm6Var2 = nm6.a;
        i2 = j3kVar.o;
        if (i2 != 0) {
        }
        tm0 tm0Var22 = tm0Var;
        d = 0.0f;
        if (-0.5d <= d) {
        }
        vme.a("pageOffsetFraction 0.0 is not within the range -0.5 to 0.5");
        k3k k3kVar2 = new k3k(o3kVar, o3kVar.i(i), 0.0f * o3kVar.p(), tm0Var22, null);
        j3kVar.j = null;
        j3kVar.k = null;
        j3kVar.o = 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x012e A[Catch: all -> 0x0134, TRY_LEAVE, TryCatch #0 {all -> 0x0134, blocks: (B:28:0x00d1, B:30:0x00e4, B:32:0x00e8, B:34:0x00f4, B:38:0x012e, B:40:0x0124, B:44:0x010c), top: B:27:0x00d1 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x012b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h(y2k y2kVar, boolean z, boolean z2) {
        nfh nfhVar = y2kVar.j;
        float f = y2kVar.k;
        if (!z && this.a) {
            this.b = y2kVar;
            return;
        }
        boolean z3 = true;
        if (z) {
            this.a = true;
        }
        evj evjVar = this.d;
        if (z2) {
            ((t6k) evjVar.b).h(f);
        } else {
            evjVar.getClass();
            List list = y2kVar.a;
            evjVar.e = nfhVar != null ? nfhVar.d : null;
            if (evjVar.a || !list.isEmpty()) {
                evjVar.a = true;
                int i = nfhVar != null ? nfhVar.a : 0;
                ((u6k) evjVar.d).i(i);
                ((xtf) evjVar.f).a(i);
                ((t6k) evjVar.b).h(f);
            }
            if (this.m != -1) {
                int i2 = y2kVar.h;
                if (!list.isEmpty()) {
                    if (this.m != (this.o ? ((nfh) CollectionsKt.Y(list)).a + i2 + 1 : (((nfh) CollectionsKt.Q(list)).a - i2) - 1)) {
                        this.m = -1;
                        duf dufVar = this.n;
                        if (dufVar != null) {
                            dufVar.cancel();
                        }
                        this.n = null;
                    }
                }
            }
        }
        this.p.setValue(y2kVar);
        boolean z4 = y2kVar.m;
        int i3 = y2kVar.l;
        nfh nfhVar2 = y2kVar.i;
        this.F.setValue(Boolean.valueOf(z4));
        this.G.setValue(Boolean.valueOf(((nfhVar2 != null ? nfhVar2.a : 0) == 0 && i3 == 0) ? false : true));
        if (nfhVar2 != null) {
            this.e = nfhVar2.a;
        }
        this.f = i3;
        b2r G = wyf.G();
        Function1 e = G != null ? G.e() : null;
        b2r Q = wyf.Q(G);
        try {
            if (Math.abs(this.j) > 0.5f && this.l) {
                float f2 = this.j;
                if (l().e == bxj.a) {
                    if (Math.signum(f2) == Math.signum(-Float.intBitsToFloat((int) (r() & 4294967295L)))) {
                        if (z3) {
                            t(this.j, y2kVar);
                        }
                    }
                    if (s()) {
                        z3 = false;
                    }
                    if (z3) {
                    }
                } else {
                    if (Math.signum(f2) == Math.signum(-Float.intBitsToFloat((int) (r() >> 32)))) {
                        if (z3) {
                        }
                    }
                    if (s()) {
                    }
                    if (z3) {
                    }
                }
            }
            wyf.b0(G, Q, e);
            this.g = r3k.a(y2kVar, n());
            n();
            int g = (int) (y2kVar.e == bxj.b ? y2kVar.g() >> 32 : y2kVar.g() & 4294967295L);
            this.h = yhn.d(y2kVar.n.a(g, y2kVar.b, -y2kVar.f, y2kVar.d), 0, g);
        } catch (Throwable th) {
            wyf.b0(G, Q, e);
            throw th;
        }
    }

    public final int i(int i) {
        if (n() > 0) {
            return yhn.d(i, 0, n() - 1);
        }
        return 0;
    }

    public final int j() {
        return ((u6k) this.d.d).h();
    }

    public final float k() {
        return ((t6k) this.d.b).e();
    }

    public final y2k l() {
        return (y2k) this.p.getValue();
    }

    public final float m(int i) {
        boolean z = false;
        if (i >= 0 && i <= n()) {
            z = true;
        }
        if (!z) {
            StringBuilder q = k5r.q(i, "page ", " is not within the range 0 to ");
            q.append(n());
            vme.a(q.toString());
        }
        return (i - j()) - k();
    }

    public abstract int n();

    public final int o() {
        return ((y2k) this.p.getValue()).b;
    }

    public final int p() {
        return ((y2k) this.p.getValue()).c + o();
    }

    public final int q() {
        return ((Number) this.u.getValue()).intValue();
    }

    public final long r() {
        return ((enj) this.c.getValue()).a;
    }

    public final boolean s() {
        return ((int) Float.intBitsToFloat((int) (r() >> 32))) == 0 && ((int) Float.intBitsToFloat((int) (r() & 4294967295L))) == 0;
    }

    public final void t(float f, y2k y2kVar) {
        duf dufVar;
        duf dufVar2;
        duf dufVar3;
        if (this.l) {
            List list = y2kVar.a;
            int i = y2kVar.h;
            if (list.isEmpty()) {
                return;
            }
            boolean z = f > 0.0f;
            int i2 = z ? ((nfh) CollectionsKt.Y(list)).a + i + 1 : (((nfh) CollectionsKt.Q(list)).a - i) - 1;
            if (i2 < 0 || i2 >= n()) {
                return;
            }
            if (i2 != this.m) {
                if (this.o != z && (dufVar3 = this.n) != null) {
                    dufVar3.cancel();
                }
                this.o = z;
                this.m = i2;
                this.n = this.w.a(i2, this.B);
            }
            if (z) {
                if ((((nfh) CollectionsKt.Y(list)).l + (y2kVar.b + y2kVar.c)) - y2kVar.g >= f || (dufVar2 = this.n) == null) {
                    return;
                }
                dufVar2.a();
                return;
            }
            if (y2kVar.f - ((nfh) CollectionsKt.Q(list)).l >= (-f) || (dufVar = this.n) == null) {
                return;
            }
            dufVar.a();
        }
    }

    public final void w(float f, int i, boolean z) {
        evj evjVar = this.d;
        ((u6k) evjVar.d).i(i);
        ((xtf) evjVar.f).a(i);
        ((t6k) evjVar.b).h(f);
        evjVar.e = null;
        if (!z) {
            this.E.setValue(Unit.a);
            return;
        }
        mpf mpfVar = (mpf) this.z.getValue();
        if (mpfVar != null) {
            mpfVar.l();
        }
    }
}
