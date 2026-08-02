package defpackage;

import com.yandex.music.core.ui.compose.draggable.a;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final class p90 extends cw7 implements ofm, yr5 {
    public rma A;
    public qma B;
    public ot0 C;
    public x8a D;
    public long E;
    public yps F;
    public long G;
    public ja0 H;
    public bxj I;
    public jic J;
    public jic K;
    public jx7 L;
    public bxj q;
    public Function1 r;
    public boolean s;
    public uoi t;
    public zi3 u;
    public joa v;
    public boolean w;
    public boolean x;
    public pma y;
    public sma z;

    /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object V0(p90 p90Var, float f, cg6 cg6Var) {
        m90 m90Var;
        int i;
        uqn uqnVar;
        if (cg6Var instanceof m90) {
            m90Var = (m90) cg6Var;
            int i2 = m90Var.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                m90Var.m = i2 - Integer.MIN_VALUE;
                Object obj = m90Var.k;
                nm6 nm6Var = nm6.a;
                i = m90Var.m;
                if (i != 0) {
                    qgg.h0(obj);
                    if (p90Var.H.d()) {
                        ja0 ja0Var = p90Var.H;
                        m90Var.m = 1;
                        Object i3 = ja0Var.i(f, m90Var);
                        if (i3 != nm6Var) {
                            return i3;
                        }
                    } else {
                        uqn uqnVar2 = new uqn();
                        uqnVar2.a = f;
                        ja0 ja0Var2 = p90Var.H;
                        o90 o90Var = new o90(p90Var, uqnVar2, f, null);
                        m90Var.j = uqnVar2;
                        m90Var.m = 2;
                        Object b = ja0Var2.f.b(hqi.a, new w90(ja0Var2, o90Var, (Continuation) null), m90Var);
                        if (b != nm6Var) {
                            b = Unit.a;
                        }
                        if (b != nm6Var) {
                            uqnVar = uqnVar2;
                        }
                    }
                    return nm6Var;
                }
                if (i == 1) {
                    qgg.h0(obj);
                    return obj;
                }
                if (i != 2) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uqnVar = m90Var.j;
                qgg.h0(obj);
                return new Float(uqnVar.a);
            }
        }
        m90Var = new m90(p90Var, cg6Var);
        Object obj2 = m90Var.k;
        nm6 nm6Var2 = nm6.a;
        i = m90Var.m;
        if (i != 0) {
        }
        return new Float(uqnVar.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object W0(p90 p90Var, cg6 cg6Var) {
        zna znaVar;
        int i;
        if (cg6Var instanceof zna) {
            znaVar = (zna) cg6Var;
            int i2 = znaVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                znaVar.l = i2 - Integer.MIN_VALUE;
                Object obj = znaVar.j;
                nm6 nm6Var = nm6.a;
                i = znaVar.l;
                Continuation continuation = null;
                if (i != 0) {
                    qgg.h0(obj);
                    joa joaVar = p90Var.v;
                    if (joaVar != null) {
                        uoi uoiVar = p90Var.t;
                        if (uoiVar != null) {
                            ioa ioaVar = new ioa(joaVar);
                            znaVar.l = 1;
                            if (uoiVar.a(ioaVar, znaVar) == nm6Var) {
                                return nm6Var;
                            }
                        }
                    }
                    zma zmaVar = new zma(0L);
                    if (p90Var.n) {
                        x97.y(p90Var.G0(), null, null, new l5(p90Var, zmaVar, continuation, 17), 3);
                    }
                    return Unit.a;
                }
                if (i != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                p90Var.v = null;
                zma zmaVar2 = new zma(0L);
                if (p90Var.n) {
                }
                return Unit.a;
            }
        }
        znaVar = new zna(p90Var, cg6Var);
        Object obj2 = znaVar.j;
        nm6 nm6Var2 = nm6.a;
        i = znaVar.l;
        Continuation continuation2 = null;
        if (i != 0) {
        }
        p90Var.v = null;
        zma zmaVar22 = new zma(0L);
        if (p90Var.n) {
        }
        return Unit.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0056, code lost:
    
        if (r2.a(r5, r0) == r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object X0(p90 p90Var, xma xmaVar, cg6 cg6Var) {
        boa boaVar;
        int i;
        joa joaVar;
        uoi uoiVar;
        xma xmaVar2;
        joa joaVar2;
        if (cg6Var instanceof boa) {
            boaVar = (boa) cg6Var;
            int i2 = boaVar.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                boaVar.n = i2 - Integer.MIN_VALUE;
                Object obj = boaVar.l;
                nm6 nm6Var = nm6.a;
                i = boaVar.n;
                if (i != 0) {
                    qgg.h0(obj);
                    joa joaVar3 = p90Var.v;
                    if (joaVar3 != null && (r2 = p90Var.t) != null) {
                        ioa ioaVar = new ioa(joaVar3);
                        boaVar.j = xmaVar;
                        boaVar.k = null;
                        boaVar.n = 1;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        joaVar2 = boaVar.k;
                        xmaVar2 = boaVar.j;
                        qgg.h0(obj);
                        joaVar = joaVar2;
                        xmaVar = xmaVar2;
                        p90Var.v = joaVar;
                        long j = xmaVar.a;
                        return Unit.a;
                    }
                    xmaVar = boaVar.j;
                    qgg.h0(obj);
                }
                joaVar = new joa();
                uoiVar = p90Var.t;
                if (uoiVar != null) {
                    boaVar.j = xmaVar;
                    boaVar.k = joaVar;
                    boaVar.n = 2;
                    if (uoiVar.a(joaVar, boaVar) != nm6Var) {
                        xmaVar2 = xmaVar;
                        joaVar2 = joaVar;
                        joaVar = joaVar2;
                        xmaVar = xmaVar2;
                    }
                    return nm6Var;
                }
                p90Var.v = joaVar;
                long j2 = xmaVar.a;
                return Unit.a;
            }
        }
        boaVar = new boa(p90Var, cg6Var);
        Object obj2 = boaVar.l;
        nm6 nm6Var2 = nm6.a;
        i = boaVar.n;
        if (i != 0) {
        }
        joaVar = new joa();
        uoiVar = p90Var.t;
        if (uoiVar != null) {
        }
        p90Var.v = joaVar;
        long j22 = xmaVar.a;
        return Unit.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object Y0(p90 p90Var, zma zmaVar, cg6 cg6Var) {
        doa doaVar;
        int i;
        if (cg6Var instanceof doa) {
            doaVar = (doa) cg6Var;
            int i2 = doaVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                doaVar.m = i2 - Integer.MIN_VALUE;
                Object obj = doaVar.k;
                nm6 nm6Var = nm6.a;
                i = doaVar.m;
                Continuation continuation = null;
                if (i != 0) {
                    qgg.h0(obj);
                    joa joaVar = p90Var.v;
                    if (joaVar != null) {
                        uoi uoiVar = p90Var.t;
                        if (uoiVar != null) {
                            koa koaVar = new koa(joaVar);
                            doaVar.j = zmaVar;
                            doaVar.m = 1;
                            if (uoiVar.a(koaVar, doaVar) == nm6Var) {
                                return nm6Var;
                            }
                        }
                    }
                    zmaVar.getClass();
                    if (p90Var.n) {
                        x97.y(p90Var.G0(), null, null, new l5(p90Var, zmaVar, continuation, 17), 3);
                    }
                    return Unit.a;
                }
                if (i != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                zmaVar = doaVar.j;
                qgg.h0(obj);
                p90Var.v = null;
                zmaVar.getClass();
                if (p90Var.n) {
                }
                return Unit.a;
            }
        }
        doaVar = new doa(p90Var, cg6Var);
        Object obj2 = doaVar.k;
        nm6 nm6Var2 = nm6.a;
        i = doaVar.m;
        Continuation continuation2 = null;
        if (i != 0) {
        }
        p90Var.v = null;
        zmaVar.getClass();
        if (p90Var.n) {
        }
        return Unit.a;
    }

    public static void d1(p90 p90Var, lfm lfmVar, long j, long j2, int i) {
        if ((i & 4) != 0) {
            j2 = 0;
        }
        rma rmaVar = p90Var.A;
        if (rmaVar == null) {
            rmaVar = new rma();
            rmaVar.l = null;
            rmaVar.m = Long.MAX_VALUE;
            rmaVar.n = false;
            p90Var.A = rmaVar;
        }
        rmaVar.l = lfmVar;
        rmaVar.m = j;
        yps ypsVar = p90Var.F;
        bxj bxjVar = p90Var.q;
        if (ypsVar == null) {
            p90Var.F = new yps(0L, bxjVar);
        } else {
            ypsVar.a = bxjVar;
            ypsVar.b = j2;
        }
        rmaVar.n = false;
        p90Var.C = rmaVar;
    }

    @Override // defpackage.xci
    public final void K0() {
        h1(this.J);
    }

    @Override // defpackage.xci
    public final void L0() {
        this.w = false;
        Z0();
        this.G = 0L;
    }

    @Override // defpackage.ofm
    public final void Z() {
        if (this.x) {
            b1();
            if (this.w) {
                zi3 zi3Var = this.u;
                if (zi3Var == null) {
                    xq0.x("Events channel not initialized.");
                    return;
                }
                zi3Var.c(tma.a);
            }
            this.D = null;
        }
        this.x = false;
    }

    public final void Z0() {
        joa joaVar = this.v;
        if (joaVar != null) {
            uoi uoiVar = this.t;
            if (uoiVar != null) {
                uoiVar.b(new ioa(joaVar));
            }
            this.v = null;
        }
    }

    @Override // defpackage.sv7, defpackage.ofm
    public final void a() {
        Z();
        if (this.n) {
            jx7 jx7Var = bcx.F(this).y;
            jx7 jx7Var2 = this.L;
            if (jx7Var2 == null || !jx7Var2.equals(jx7Var)) {
                this.L = jx7Var;
                h1(this.J);
            }
        }
    }

    public final boolean a1() {
        return bcx.F(this).z == xof.b && this.I == bxj.b;
    }

    public final void b1() {
        pma pmaVar = this.y;
        if (pmaVar == null) {
            oma omaVar = oma.c;
            pmaVar = new pma();
            pmaVar.l = omaVar;
            pmaVar.m = false;
            this.y = pmaVar;
        }
        pmaVar.l = oma.c;
        pmaVar.m = false;
        this.C = pmaVar;
    }

    public final void c1(lfm lfmVar, long j, yps ypsVar) {
        qma qmaVar = this.B;
        if (qmaVar == null) {
            qmaVar = new qma();
            qmaVar.l = null;
            qmaVar.m = Long.MAX_VALUE;
            this.B = qmaVar;
        }
        qmaVar.l = lfmVar;
        qmaVar.m = j;
        ypsVar.b = 0L;
        this.C = qmaVar;
    }

    public final x8a e1() {
        x8a x8aVar = this.D;
        if (x8aVar != null) {
            return x8aVar;
        }
        xq0.x("Velocity Tracker not initialized.");
        return null;
    }

    public final void f1(long j, lfm lfmVar) {
        long K = bcx.E(this.a).K(0L);
        if (!enj.c(this.E, 9205357640488583168L) && !enj.c(K, this.E)) {
            this.G = enj.h(this.G, enj.g(K, this.E));
        }
        this.E = K;
        ezf.r(e1(), lfmVar);
        zi3 zi3Var = this.u;
        if (zi3Var != null) {
            zi3Var.c(new vma(j));
        } else {
            xq0.x("Events channel not initialized.");
        }
    }

    public final void g1(lfm lfmVar, lfm lfmVar2, long j) {
        if (this.D == null) {
            this.D = new x8a();
        }
        ezf.r(e1(), lfmVar);
        long g = enj.g(lfmVar2.c, j);
        this.G = 0L;
        if (((Boolean) this.r.invoke(new vfm(lfmVar.i))).booleanValue()) {
            if (!this.w) {
                if (this.u == null) {
                    this.u = men.g(Integer.MAX_VALUE, 6, null);
                }
                this.w = true;
                if (this.u == null) {
                    this.u = men.g(Integer.MAX_VALUE, 6, null);
                }
                x97.y(G0(), null, null, new foa(this, null), 3);
            }
            this.E = bcx.E(this).K(0L);
            zi3 zi3Var = this.u;
            if (zi3Var != null) {
                zi3Var.c(new xma(g));
            } else {
                xq0.x("Events channel not initialized.");
            }
        }
    }

    public final void h1(jic jicVar) {
        if (jicVar == null) {
            act actVar = b90.a;
            u10 u10Var = b90.b;
            jx7 jx7Var = bcx.F(this).y;
            this.L = jx7Var;
            jicVar = a.g(this.H, jx7Var, u10Var, actVar);
        }
        this.K = jicVar;
    }

    @Override // defpackage.ofm
    public final void o(ffm ffmVar, gfm gfmVar, long j) {
        Object obj;
        Object obj2;
        float abs;
        long j2;
        Object obj3;
        ffmVar.getClass();
        List list = ffmVar.a;
        boolean z = true;
        this.x = true;
        if (this.s) {
            int i = 0;
            if (this.C == null) {
                pma pmaVar = this.y;
                if (pmaVar == null) {
                    oma omaVar = oma.c;
                    pmaVar = new pma();
                    pmaVar.l = omaVar;
                    pmaVar.m = false;
                    this.y = pmaVar;
                }
                this.C = pmaVar;
            }
            ot0 ot0Var = this.C;
            if (ot0Var == null) {
                xq0.x("currentDragState should not be null");
                return;
            }
            if (ot0Var instanceof pma) {
                pma pmaVar2 = (pma) ot0Var;
                if (list.isEmpty()) {
                    return;
                }
                int size = list.size();
                while (i < size) {
                    if (!swf.z((lfm) list.get(i))) {
                        return;
                    } else {
                        i++;
                    }
                }
                lfm lfmVar = (lfm) CollectionsKt.Q(list);
                oma omaVar2 = xna.a[pmaVar2.l.ordinal()] == 1 ? this.H.l.getValue() != null ? oma.b : oma.a : pmaVar2.l;
                omaVar2.getClass();
                pmaVar2.l = omaVar2;
                if (gfmVar == gfm.a && omaVar2 == oma.b) {
                    lfmVar.a();
                    pmaVar2.m = true;
                }
                if (gfmVar == gfm.b) {
                    if (omaVar2 == oma.a) {
                        d1(this, lfmVar, lfmVar.a, 0L, 12);
                        return;
                    }
                    if (pmaVar2.m) {
                        g1(lfmVar, lfmVar, 0L);
                        f1(0L, lfmVar);
                        long j3 = lfmVar.a;
                        sma smaVar = this.z;
                        if (smaVar == null) {
                            smaVar = new sma();
                            smaVar.l = Long.MAX_VALUE;
                            this.z = smaVar;
                        }
                        smaVar.l = j3;
                        this.C = smaVar;
                        return;
                    }
                    return;
                }
                return;
            }
            Object obj4 = null;
            if (!(ot0Var instanceof rma)) {
                if (ot0Var instanceof qma) {
                    qma qmaVar = (qma) ot0Var;
                    if (gfmVar != gfm.c) {
                        return;
                    }
                    int size2 = list.size();
                    int i2 = 0;
                    while (true) {
                        if (i2 >= size2) {
                            break;
                        }
                        if (((lfm) list.get(i2)).b()) {
                            z = false;
                            break;
                        }
                        i2++;
                    }
                    int size3 = list.size();
                    while (true) {
                        if (i >= size3) {
                            break;
                        }
                        if (!((lfm) list.get(i)).d) {
                            i++;
                        } else if (!list.isEmpty()) {
                            if (z) {
                                long j4 = ((lfm) CollectionsKt.Q(list)).c;
                                lfm lfmVar2 = qmaVar.l;
                                lfmVar2.getClass();
                                long g = enj.g(j4, lfmVar2.c);
                                lfm lfmVar3 = qmaVar.l;
                                if (lfmVar3 != null) {
                                    d1(this, lfmVar3, qmaVar.m, g, 8);
                                    return;
                                } else {
                                    xq0.x("AwaitGesturePickup.initialDown was not initialized.");
                                    return;
                                }
                            }
                            return;
                        }
                    }
                    b1();
                    return;
                }
                if (!(ot0Var instanceof sma)) {
                    b6e.s();
                    return;
                }
                sma smaVar2 = (sma) ot0Var;
                if (gfmVar != gfm.b) {
                    return;
                }
                long j5 = smaVar2.l;
                int size4 = list.size();
                int i3 = 0;
                while (true) {
                    if (i3 >= size4) {
                        obj = null;
                        break;
                    }
                    obj = list.get(i3);
                    if (ywf.u(((lfm) obj).a, j5)) {
                        break;
                    } else {
                        i3++;
                    }
                }
                lfm lfmVar4 = (lfm) obj;
                if (lfmVar4 == null) {
                    return;
                }
                boolean B = swf.B(lfmVar4);
                tma tmaVar = tma.a;
                if (!B) {
                    if (!lfmVar4.b()) {
                        if (enj.d(swf.f0(lfmVar4, true)) == 0.0f) {
                            return;
                        }
                        f1(swf.f0(lfmVar4, false), lfmVar4);
                        lfmVar4.a();
                        return;
                    }
                    zi3 zi3Var = this.u;
                    if (zi3Var != null) {
                        zi3Var.c(tmaVar);
                        return;
                    } else {
                        xq0.x("Events channel not initialized.");
                        return;
                    }
                }
                int size5 = list.size();
                int i4 = 0;
                while (true) {
                    if (i4 >= size5) {
                        break;
                    }
                    Object obj5 = list.get(i4);
                    if (((lfm) obj5).d) {
                        obj4 = obj5;
                        break;
                    }
                    i4++;
                }
                lfm lfmVar5 = (lfm) obj4;
                if (lfmVar5 != null) {
                    smaVar2.l = lfmVar5.a;
                    return;
                }
                if (lfmVar4.b() || !swf.B(lfmVar4)) {
                    zi3 zi3Var2 = this.u;
                    if (zi3Var2 == null) {
                        xq0.x("Events channel not initialized.");
                        return;
                    }
                    zi3Var2.c(tmaVar);
                } else {
                    ezf.r(e1(), lfmVar4);
                    float e = ((aeu) men.t(this, es5.s)).e();
                    long b = e1().b(bzf.s(e, e));
                    e1().f();
                    zi3 zi3Var3 = this.u;
                    if (zi3Var3 == null) {
                        xq0.x("Events channel not initialized.");
                        return;
                    } else {
                        zi3Var3.c(new zma(bzf.s(Float.isNaN(yzt.b(b)) ? 0.0f : yzt.b(b), Float.isNaN(yzt.c(b)) ? 0.0f : yzt.c(b))));
                        this.x = false;
                    }
                }
                b1();
                return;
            }
            rma rmaVar = (rma) ot0Var;
            if (gfmVar == gfm.a) {
                return;
            }
            int size6 = list.size();
            int i5 = 0;
            while (true) {
                if (i5 >= size6) {
                    obj2 = null;
                    break;
                }
                obj2 = list.get(i5);
                if (ywf.u(((lfm) obj2).a, rmaVar.m)) {
                    break;
                } else {
                    i5++;
                }
            }
            lfm lfmVar6 = (lfm) obj2;
            if (lfmVar6 == null) {
                int size7 = list.size();
                int i6 = 0;
                while (true) {
                    if (i6 >= size7) {
                        obj3 = null;
                        break;
                    }
                    obj3 = list.get(i6);
                    if (((lfm) obj3).d) {
                        break;
                    } else {
                        i6++;
                    }
                }
                lfmVar6 = (lfm) obj3;
                if (lfmVar6 == null) {
                    b1();
                    return;
                }
                rmaVar.m = lfmVar6.a;
            }
            if (gfmVar == gfm.b) {
                if (lfmVar6.b()) {
                    lfm lfmVar7 = rmaVar.l;
                    if (lfmVar7 == null) {
                        xq0.x("AwaitTouchSlop.initialDown was not initialized");
                        return;
                    }
                    long j6 = rmaVar.m;
                    yps ypsVar = this.F;
                    if (ypsVar == null) {
                        xq0.x("AwaitTouchSlop.touchSlopDetector was not initialized");
                        return;
                    }
                    c1(lfmVar7, j6, ypsVar);
                } else if (swf.B(lfmVar6)) {
                    int size8 = list.size();
                    int i7 = 0;
                    while (true) {
                        if (i7 >= size8) {
                            break;
                        }
                        Object obj6 = list.get(i7);
                        if (((lfm) obj6).d) {
                            obj4 = obj6;
                            break;
                        }
                        i7++;
                    }
                    lfm lfmVar8 = (lfm) obj4;
                    if (lfmVar8 == null) {
                        b1();
                    } else {
                        rmaVar.m = lfmVar8.a;
                    }
                } else {
                    float a = vna.a((aeu) men.t(this, es5.s), lfmVar6.i);
                    yps ypsVar2 = this.F;
                    if (ypsVar2 == null) {
                        xq0.x("Touch slop detector not initialized.");
                        return;
                    }
                    long j7 = lfmVar6.c;
                    long j8 = lfmVar6.g;
                    ypsVar2.getClass();
                    long h = enj.h(ypsVar2.b, enj.g(j7, j8));
                    ypsVar2.b = h;
                    bxj bxjVar = ypsVar2.a;
                    if (bxjVar == null) {
                        abs = enj.d(h);
                    } else {
                        abs = Math.abs(bxjVar == bxj.b ? enj.e(h) : enj.f(h));
                    }
                    if (abs >= a) {
                        bxj bxjVar2 = ypsVar2.a;
                        long j9 = ypsVar2.b;
                        if (bxjVar2 == null) {
                            j2 = enj.g(ypsVar2.b, enj.i(a, enj.b(enj.d(j9), j9)));
                        } else {
                            bxj bxjVar3 = bxj.b;
                            float e2 = bxjVar2 == bxjVar3 ? enj.e(j9) : enj.f(j9);
                            long j10 = ypsVar2.b;
                            float signum = e2 - (Math.signum(ypsVar2.a == bxjVar3 ? enj.e(j10) : enj.f(j10)) * a);
                            long j11 = ypsVar2.b;
                            float f = ypsVar2.a == bxjVar3 ? enj.f(j11) : enj.e(j11);
                            j2 = ypsVar2.a == bxjVar3 ? swf.i(signum, f) : swf.i(f, signum);
                        }
                    } else {
                        j2 = 9205357640488583168L;
                    }
                    if (swf.U(j2)) {
                        lfmVar6.a();
                        lfm lfmVar9 = rmaVar.l;
                        lfmVar9.getClass();
                        g1(lfmVar9, lfmVar6, j2);
                        f1(j2, lfmVar6);
                        long j12 = lfmVar6.a;
                        sma smaVar3 = this.z;
                        if (smaVar3 == null) {
                            smaVar3 = new sma();
                            smaVar3.l = Long.MAX_VALUE;
                            this.z = smaVar3;
                        }
                        smaVar3.l = j12;
                        this.C = smaVar3;
                    } else {
                        rmaVar.n = true;
                    }
                }
            }
            if (gfmVar == gfm.c && rmaVar.n) {
                if (!lfmVar6.b()) {
                    rmaVar.n = false;
                    return;
                }
                lfm lfmVar10 = rmaVar.l;
                if (lfmVar10 == null) {
                    xq0.x("AwaitTouchSlop.initialDown was not initialized");
                    return;
                }
                long j13 = rmaVar.m;
                yps ypsVar3 = this.F;
                if (ypsVar3 != null) {
                    c1(lfmVar10, j13, ypsVar3);
                } else {
                    xq0.x("AwaitTouchSlop.touchSlopDetector was not initialized");
                }
            }
        }
    }
}
