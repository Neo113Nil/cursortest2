package defpackage;

import androidx.compose.foundation.lazy.layout.b;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class tsf implements mxo {
    public static final apo w = dag.B(xce.E, lhb.B0);
    public boolean b;
    public ksf c;
    public final nsf d;
    public float g;
    public mpf j;
    public final euf o;
    public final x6k t;
    public final x6k u;
    public final awc v;
    public final e0 a = new e0(5, (byte) 0);
    public final x6k e = new x6k(wsf.a, wvo.e);
    public final uoi f = new uoi();
    public final hq7 h = new hq7(new kma(23, this));
    public final boolean i = true;
    public final qsf k = new qsf(this, 0);
    public final ih2 l = new ih2();
    public final b m = new b();
    public final oxa n = new oxa(11, (byte) 0);
    public final qzc p = new qzc(8, this);
    public final buf q = new buf();
    public final aqi r = wdg.J();
    public final aqi s = wdg.J();

    public tsf(int i, int i2) {
        this.d = new nsf(i, i2, 0);
        this.o = new euf(new wk8(this, i, 3));
        Boolean bool = Boolean.FALSE;
        this.t = szf.g0(bool);
        this.u = szf.g0(bool);
        this.v = new awc(9);
    }

    public static Object j(tsf tsfVar, int i, aur aurVar) {
        tsfVar.getClass();
        Object a = tsfVar.a(hqi.a, new ssf(tsfVar, i, null), aurVar);
        return a == nm6.a ? a : Unit.a;
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
        rsf rsfVar;
        int i;
        tsf tsfVar;
        Function2 function22;
        if (continuation instanceof rsf) {
            rsfVar = (rsf) continuation;
            int i2 = rsfVar.o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                rsfVar.o = i2 - Integer.MIN_VALUE;
                Object obj = rsfVar.m;
                nm6 nm6Var = nm6.a;
                i = rsfVar.o;
                if (i != 0) {
                    qgg.h0(obj);
                    rsfVar.j = this;
                    rsfVar.k = hqiVar;
                    rsfVar.l = (aur) function2;
                    rsfVar.o = 1;
                    if (this.l.e(rsfVar) != nm6Var) {
                        tsfVar = this;
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
                Function2 function23 = (Function2) rsfVar.l;
                hqiVar = rsfVar.k;
                tsfVar = rsfVar.j;
                qgg.h0(obj);
                function22 = function23;
                hq7 hq7Var = tsfVar.h;
                rsfVar.j = null;
                rsfVar.k = null;
                rsfVar.l = null;
                rsfVar.o = 2;
            }
        }
        rsfVar = new rsf(this, continuation);
        Object obj2 = rsfVar.m;
        nm6 nm6Var2 = nm6.a;
        i = rsfVar.o;
        if (i != 0) {
        }
        hq7 hq7Var2 = tsfVar.h;
        rsfVar.j = null;
        rsfVar.k = null;
        rsfVar.l = null;
        rsfVar.o = 2;
    }

    @Override // defpackage.mxo
    public final boolean b() {
        return this.h.b();
    }

    @Override // defpackage.mxo
    public final boolean c() {
        return ((Boolean) this.u.getValue()).booleanValue();
    }

    @Override // defpackage.mxo
    public final boolean d() {
        return ((Boolean) this.t.getValue()).booleanValue();
    }

    @Override // defpackage.mxo
    public final float e(float f) {
        return this.h.e(f);
    }

    public final void f(ksf ksfVar, boolean z, boolean z2) {
        lsf lsfVar;
        int i;
        lsf lsfVar2;
        if (!z && this.b) {
            this.c = ksfVar;
            return;
        }
        if (z) {
            this.b = true;
        }
        float f = this.g;
        float f2 = ksfVar.d;
        List list = ksfVar.l;
        int i2 = ksfVar.b;
        msf msfVar = ksfVar.a;
        this.g = f - f2;
        this.e.setValue(ksfVar);
        this.u.setValue(Boolean.valueOf(((msfVar != null ? msfVar.a : 0) == 0 && i2 == 0) ? false : true));
        this.t.setValue(Boolean.valueOf(ksfVar.c));
        nsf nsfVar = this.d;
        if (z2) {
            nsfVar.getClass();
            if (!(((float) i2) >= 0.0f)) {
                vme.c("scrollOffset should be non-negative");
            }
            nsfVar.c.i(i2);
        } else {
            nsfVar.getClass();
            nsfVar.e = (msfVar == null || (lsfVar2 = (lsf) xz0.z(msfVar.b)) == null) ? null : lsfVar2.b;
            if (nsfVar.d || ksfVar.o > 0) {
                nsfVar.d = true;
                if (!(((float) i2) >= 0.0f)) {
                    vme.c("scrollOffset should be non-negative (" + i2 + ')');
                }
                nsfVar.a((msfVar == null || (lsfVar = (lsf) xz0.z(msfVar.b)) == null) ? 0 : lsfVar.a, i2);
            }
            if (this.i) {
                e0 e0Var = this.a;
                eqi eqiVar = (eqi) e0Var.d;
                if (e0Var.c != -1) {
                    bxj bxjVar = ksfVar.p;
                    if (!list.isEmpty()) {
                        if (e0Var.b) {
                            lsf lsfVar3 = (lsf) CollectionsKt.Y(list);
                            i = (bxjVar == bxj.a ? lsfVar3.u : lsfVar3.v) + 1;
                        } else {
                            lsf lsfVar4 = (lsf) CollectionsKt.Q(list);
                            i = (bxjVar == bxj.a ? lsfVar4.u : lsfVar4.v) - 1;
                        }
                        if (e0Var.c != i) {
                            e0Var.c = -1;
                            Object[] objArr = eqiVar.a;
                            int i3 = eqiVar.c;
                            for (int i4 = 0; i4 < i3; i4++) {
                                ((duf) objArr[i4]).cancel();
                            }
                            eqiVar.i();
                        }
                    }
                }
            }
        }
        if (z) {
            this.v.I(ksfVar.f, ksfVar.i, ksfVar.h);
        }
    }

    public final int g() {
        return this.d.b.h();
    }

    public final ksf h() {
        return (ksf) this.e.getValue();
    }

    /* JADX WARN: Type inference failed for: r14v5, types: [kotlin.jvm.functions.Function1, uif] */
    public final void i(float f, ksf ksfVar) {
        int i;
        int i2;
        boolean z;
        if (this.i) {
            e0 e0Var = this.a;
            eqi eqiVar = (eqi) e0Var.d;
            List list = ksfVar.l;
            bxj bxjVar = ksfVar.p;
            if (list.isEmpty()) {
                return;
            }
            boolean z2 = f < 0.0f;
            if (z2) {
                lsf lsfVar = (lsf) CollectionsKt.Y(list);
                i = (bxjVar == bxj.a ? lsfVar.u : lsfVar.v) + 1;
                i2 = ((lsf) CollectionsKt.Y(list)).a + 1;
            } else {
                lsf lsfVar2 = (lsf) CollectionsKt.Q(list);
                i = (bxjVar == bxj.a ? lsfVar2.u : lsfVar2.v) - 1;
                i2 = ((lsf) CollectionsKt.Q(list)).a - 1;
            }
            if (i2 < 0 || i2 >= ksfVar.o) {
                return;
            }
            if (i == e0Var.c || i < 0) {
                z = z2;
            } else {
                if (e0Var.b != z2) {
                    Object[] objArr = eqiVar.a;
                    int i3 = eqiVar.c;
                    for (int i4 = 0; i4 < i3; i4++) {
                        ((duf) objArr[i4]).cancel();
                    }
                }
                e0Var.b = z2;
                e0Var.c = i;
                eqiVar.i();
                qzc qzcVar = this.p;
                qzcVar.getClass();
                ArrayList arrayList = new ArrayList();
                tsf tsfVar = (tsf) qzcVar.b;
                b2r G = wyf.G();
                Function1 e = G != null ? G.e() : null;
                b2r Q = wyf.Q(G);
                try {
                    ksf ksfVar2 = tsfVar.b ? tsfVar.c : (ksf) tsfVar.e.getValue();
                    if (ksfVar2 != null) {
                        List list2 = (List) ksfVar2.k.invoke(Integer.valueOf(i));
                        int size = list2.size();
                        int i5 = 0;
                        while (i5 < size) {
                            Pair pair = (Pair) list2.get(i5);
                            tsf tsfVar2 = tsfVar;
                            boolean z3 = z2;
                            arrayList.add(tsfVar.o.a(((Number) pair.a).intValue(), ((ga6) pair.b).a));
                            i5++;
                            tsfVar = tsfVar2;
                            z2 = z3;
                        }
                    }
                    z = z2;
                    wyf.b0(G, Q, e);
                    eqiVar.f(arrayList, eqiVar.c);
                } catch (Throwable th) {
                    wyf.b0(G, Q, e);
                    throw th;
                }
            }
            if (!z) {
                if (ksfVar.m - qwp.h0((lsf) CollectionsKt.Q(list), bxjVar) < f) {
                    Object[] objArr2 = eqiVar.a;
                    int i6 = eqiVar.c;
                    for (int i7 = 0; i7 < i6; i7++) {
                        ((duf) objArr2[i7]).a();
                    }
                    return;
                }
                return;
            }
            lsf lsfVar3 = (lsf) CollectionsKt.Y(list);
            if (((qwp.h0(lsfVar3, bxjVar) + ((int) (bxjVar == bxj.a ? lsfVar3.s & 4294967295L : lsfVar3.s >> 32))) + ksfVar.r) - ksfVar.n < (-f)) {
                Object[] objArr3 = eqiVar.a;
                int i8 = eqiVar.c;
                for (int i9 = 0; i9 < i8; i9++) {
                    ((duf) objArr3[i9]).a();
                }
            }
        }
    }
}
