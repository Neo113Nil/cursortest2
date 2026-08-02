package defpackage;

import androidx.compose.foundation.lazy.layout.b;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class fvf implements mxo {
    public static final apo w = dag.B(xce.F, vsf.w);
    public final e0 a;
    public boolean b;
    public bvf c;
    public final nsf d;
    public final x6k e;
    public final uoi f;
    public float g;
    public final hq7 h;
    public final boolean i;
    public mpf j;
    public final qsf k;
    public final ih2 l;
    public final b m;
    public final oxa n;
    public final euf o;
    public final n7b p;
    public final buf q;
    public final aqi r;
    public final x6k s;
    public final x6k t;
    public final aqi u;
    public final awc v;

    public fvf(int i, int i2) {
        e0 e0Var = new e0((char) 0, 6);
        e0Var.c = -1;
        this.a = e0Var;
        this.d = new nsf(i, i2, 1);
        this.e = new x6k(hvf.a, wvo.e);
        this.f = new uoi();
        this.h = new hq7(new kma(27, this));
        this.i = true;
        this.k = new qsf(this, 1);
        this.l = new ih2();
        this.m = new b();
        this.n = new oxa(11, (byte) 0);
        this.o = new euf(new wk8(this, i, 4));
        this.p = new n7b(this);
        this.q = new buf();
        this.r = wdg.J();
        Boolean bool = Boolean.FALSE;
        this.s = szf.g0(bool);
        this.t = szf.g0(bool);
        this.u = wdg.J();
        this.v = new awc(9);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0065, code lost:
    
        if (r8.a(r6, r7, r0) != r1) goto L23;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.mxo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(hqi hqiVar, Function2 function2, Continuation continuation) {
        evf evfVar;
        int i;
        fvf fvfVar;
        Function2 function22;
        if (continuation instanceof evf) {
            evfVar = (evf) continuation;
            int i2 = evfVar.o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                evfVar.o = i2 - Integer.MIN_VALUE;
                Object obj = evfVar.m;
                nm6 nm6Var = nm6.a;
                i = evfVar.o;
                if (i != 0) {
                    qgg.h0(obj);
                    evfVar.j = this;
                    evfVar.k = hqiVar;
                    evfVar.l = (aur) function2;
                    evfVar.o = 1;
                    if (this.l.e(evfVar) != nm6Var) {
                        fvfVar = this;
                        function22 = function2;
                    }
                    return nm6Var;
                }
                if (i != 1) {
                    if (i == 2) {
                        qgg.h0(obj);
                        return Unit.a;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                Function2 function23 = (Function2) evfVar.l;
                hqiVar = evfVar.k;
                fvfVar = evfVar.j;
                qgg.h0(obj);
                function22 = function23;
                hq7 hq7Var = fvfVar.h;
                evfVar.j = null;
                evfVar.k = null;
                evfVar.l = null;
                evfVar.o = 2;
            }
        }
        evfVar = new evf(this, continuation);
        Object obj2 = evfVar.m;
        nm6 nm6Var2 = nm6.a;
        i = evfVar.o;
        if (i != 0) {
        }
        hq7 hq7Var2 = fvfVar.h;
        evfVar.j = null;
        evfVar.k = null;
        evfVar.l = null;
        evfVar.o = 2;
    }

    @Override // defpackage.mxo
    public final boolean b() {
        return this.h.b();
    }

    @Override // defpackage.mxo
    public final boolean c() {
        return ((Boolean) this.t.getValue()).booleanValue();
    }

    @Override // defpackage.mxo
    public final boolean d() {
        return ((Boolean) this.s.getValue()).booleanValue();
    }

    @Override // defpackage.mxo
    public final float e(float f) {
        return this.h.e(f);
    }

    public final Object f(int i, int i2, Continuation continuation) {
        Object a = a(hqi.a, new ux2(this, i, i2, null, 2), continuation);
        return a == nm6.a ? a : Unit.a;
    }

    public final void g(bvf bvfVar, boolean z, boolean z2) {
        if (!z && this.b) {
            this.c = bvfVar;
            return;
        }
        if (z) {
            this.b = true;
        }
        cvf cvfVar = bvfVar.a;
        List list = bvfVar.k;
        int i = bvfVar.b;
        this.t.setValue(Boolean.valueOf(((cvfVar != null ? cvfVar.a : 0) == 0 && i == 0) ? false : true));
        this.s.setValue(Boolean.valueOf(bvfVar.c));
        this.g -= bvfVar.d;
        this.e.setValue(bvfVar);
        nsf nsfVar = this.d;
        if (z2) {
            nsfVar.getClass();
            if (!(((float) i) >= 0.0f)) {
                vme.c("scrollOffset should be non-negative");
            }
            nsfVar.c.i(i);
        } else {
            nsfVar.getClass();
            nsfVar.e = cvfVar != null ? cvfVar.l : null;
            if (nsfVar.d || bvfVar.n > 0) {
                nsfVar.d = true;
                if (!(((float) i) >= 0.0f)) {
                    vme.c("scrollOffset should be non-negative");
                }
                nsfVar.a(cvfVar != null ? cvfVar.a : 0, i);
            }
            if (this.i) {
                e0 e0Var = this.a;
                if (e0Var.c != -1 && !list.isEmpty()) {
                    if (e0Var.c != (e0Var.b ? ((cvf) CollectionsKt.Y(list)).a + 1 : ((cvf) CollectionsKt.Q(list)).a - 1)) {
                        e0Var.c = -1;
                        duf dufVar = (duf) e0Var.d;
                        if (dufVar != null) {
                            dufVar.cancel();
                        }
                        e0Var.d = null;
                    }
                }
            }
        }
        if (z) {
            this.v.I(bvfVar.f, bvfVar.i, bvfVar.h);
        }
    }

    public final int h() {
        return this.d.b.h();
    }

    public final int i() {
        return this.d.c.h();
    }

    public final bvf j() {
        return (bvf) this.e.getValue();
    }

    public final void k(float f, bvf bvfVar) {
        duf dufVar;
        duf dufVar2;
        duf dufVar3;
        if (this.i) {
            e0 e0Var = this.a;
            e0Var.getClass();
            List list = bvfVar.k;
            if (list.isEmpty()) {
                return;
            }
            boolean z = f < 0.0f;
            int i = z ? ((cvf) CollectionsKt.Y(list)).a + 1 : ((cvf) CollectionsKt.Q(list)).a - 1;
            if (i < 0 || i >= bvfVar.n) {
                return;
            }
            if (i != e0Var.c) {
                if (e0Var.b != z && (dufVar3 = (duf) e0Var.d) != null) {
                    dufVar3.cancel();
                }
                e0Var.b = z;
                e0Var.c = i;
                fvf fvfVar = (fvf) this.p.a;
                b2r G = wyf.G();
                Function1 e = G != null ? G.e() : null;
                b2r Q = wyf.Q(G);
                try {
                    long j = ((bvf) fvfVar.e.getValue()).j;
                    wyf.b0(G, Q, e);
                    e0Var.d = fvfVar.o.a(i, j);
                } catch (Throwable th) {
                    wyf.b0(G, Q, e);
                    throw th;
                }
            }
            if (!z) {
                if (bvfVar.l - ((cvf) CollectionsKt.Q(list)).p >= f || (dufVar = (duf) e0Var.d) == null) {
                    return;
                }
                dufVar.a();
                return;
            }
            cvf cvfVar = (cvf) CollectionsKt.Y(list);
            if (((cvfVar.p + cvfVar.q) + bvfVar.r) - bvfVar.m >= (-f) || (dufVar2 = (duf) e0Var.d) == null) {
                return;
            }
            dufVar2.a();
        }
    }

    public final void l(int i, int i2) {
        if (this.h.b()) {
            x97.y(((bvf) this.e.getValue()).h, null, null, new aq5(this, null, 2), 3);
        }
        n(i, i2, false);
    }

    public final Object m(int i, int i2, Continuation continuation) {
        Object a = a(hqi.a, new j50(this, i, i2, (Continuation) null), continuation);
        return a == nm6.a ? a : Unit.a;
    }

    public final void n(int i, int i2, boolean z) {
        nsf nsfVar = this.d;
        if (nsfVar.b.h() != i || nsfVar.c.h() != i2) {
            b bVar = this.m;
            bVar.e();
            bVar.b = null;
            bVar.c = -1;
        }
        nsfVar.a(i, i2);
        nsfVar.e = null;
        if (!z) {
            this.r.setValue(Unit.a);
            return;
        }
        mpf mpfVar = this.j;
        if (mpfVar != null) {
            mpfVar.l();
        }
    }
}
