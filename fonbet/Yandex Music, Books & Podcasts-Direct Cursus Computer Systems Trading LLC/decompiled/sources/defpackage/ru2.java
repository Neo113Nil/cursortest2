package defpackage;

import com.yandex.passport.internal.entities.j;
import com.yandex.plus.home.api.lifecycle.a;
import com.yandex.plus.home.api.lifecycle.c;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;
import ru.kinopoisk.sdk.easylogin.internal.C1212s0;

/* loaded from: classes5.dex */
public final /* synthetic */ class ru2 implements uyf {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ru2(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.uyf
    public final void Q(dzf dzfVar, kyf kyfVar) {
        WeakHashMap weakHashMap;
        Set<gc8> keySet;
        switch (this.a) {
            case 0:
                su2.a((su2) this.b, dzfVar, kyfVar);
                return;
            case 1:
                aqi aqiVar = (aqi) this.b;
                int i = acb.a[kyfVar.ordinal()];
                if (i == 1) {
                    bcb.b = null;
                    aqiVar.setValue(Boolean.TRUE);
                    return;
                } else {
                    if (i != 2) {
                        return;
                    }
                    bcb.b = Long.valueOf(System.currentTimeMillis());
                    aqiVar.setValue(Boolean.FALSE);
                    return;
                }
            case 2:
                ((xdr) this.b).m(null, kyfVar.a());
                return;
            case 3:
                cwj cwjVar = (cwj) ((mvj) this.b).j.getValue();
                gvj gvjVar = cwjVar.m;
                int i2 = xvj.a[kyfVar.ordinal()];
                if (i2 == 1) {
                    ((zhk) gvjVar.c.getValue()).d();
                    return;
                }
                if (i2 == 2) {
                    cwjVar.G();
                    return;
                }
                if (i2 == 3) {
                    ((zhk) gvjVar.c.getValue()).a();
                    return;
                }
                if (i2 != 4) {
                    return;
                }
                rar rarVar = cwjVar.B;
                if (rarVar != null) {
                    rarVar.g(null);
                }
                cwjVar.B = null;
                cwjVar.D = null;
                return;
            case 4:
                adl adlVar = (adl) this.b;
                Iterator it = adlVar.p.a.iterator();
                if (it.hasNext()) {
                    if (it.next() != null) {
                        l1j.f();
                        return;
                    } else {
                        adlVar.requireActivity().getClass();
                        adlVar.g.m();
                        throw null;
                    }
                }
                return;
            case 5:
                jdl jdlVar = (jdl) this.b;
                ddl ddlVar = jdl.G;
                Iterator it2 = jdlVar.n.a.iterator();
                if (it2.hasNext()) {
                    if (it2.next() != null) {
                        l1j.f();
                        return;
                    } else {
                        jdlVar.requireActivity().getClass();
                        jdlVar.g.m();
                        throw null;
                    }
                }
                return;
            case 6:
                stn stnVar = (stn) this.b;
                synchronized (stnVar.c) {
                    if (rtn.a[kyfVar.ordinal()] == 1 && (weakHashMap = (WeakHashMap) stnVar.b.remove(dzfVar)) != null && (keySet = weakHashMap.keySet()) != null) {
                        for (gc8 gc8Var : keySet) {
                            gc8Var.w();
                            stnVar.a.a(gc8Var);
                        }
                    }
                }
                return;
            case 7:
                bnh bnhVar = (bnh) this.b;
                if (kyfVar == kyf.ON_START) {
                    bnhVar.c = true;
                    return;
                } else {
                    if (kyfVar == kyf.ON_STOP) {
                        bnhVar.c = false;
                        return;
                    }
                    return;
                }
            case 8:
                orq orqVar = (orq) this.b;
                if (kyfVar == kyf.ON_DESTROY) {
                    orqVar.k();
                    return;
                }
                return;
            case 9:
                e8s e8sVar = (e8s) ((h7s) this.b).i.getValue();
                y6s y6sVar = e8sVar.n;
                int i3 = a8s.a[kyfVar.ordinal()];
                if (i3 == 1) {
                    vek vekVar = (vek) y6sVar.a();
                    vekVar.getClass();
                    vek.b(vekVar, xgr.g, null, 6);
                    ((zhk) y6sVar.a.getValue()).d();
                    return;
                }
                if (i3 == 2) {
                    e8sVar.G();
                    return;
                }
                if (i3 == 3) {
                    ((zhk) y6sVar.a.getValue()).a();
                    return;
                }
                if (i3 != 4) {
                    return;
                }
                rar rarVar2 = e8sVar.A;
                if (rarVar2 != null) {
                    rarVar2.g(null);
                }
                rar rarVar3 = e8sVar.B;
                if (rarVar3 != null) {
                    rarVar3.g(null);
                }
                rar rarVar4 = e8sVar.C;
                if (rarVar4 != null) {
                    rarVar4.g(null);
                }
                e8sVar.A = null;
                e8sVar.B = null;
                return;
            case 10:
                z5 z5Var = (z5) this.b;
                if (kyfVar == kyf.ON_DESTROY) {
                    z5Var.m();
                    return;
                }
                return;
            case 11:
                j jVar = (j) this.b;
                switch (c.a[kyfVar.ordinal()]) {
                    case 1:
                        jVar.p(a.a);
                        return;
                    case 2:
                        jVar.p(a.b);
                        return;
                    case 3:
                        jVar.p(a.d);
                        return;
                    case 4:
                        jVar.p(a.c);
                        return;
                    case 5:
                        jVar.p(a.e);
                        return;
                    case 6:
                        jVar.p(a.f);
                        return;
                    case 7:
                        return;
                    default:
                        b6e.s();
                        return;
                }
            default:
                C1212s0.a((ltm) this.b, dzfVar, kyfVar);
                return;
        }
    }
}
