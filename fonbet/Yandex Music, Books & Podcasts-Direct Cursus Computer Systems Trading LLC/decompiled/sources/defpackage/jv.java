package defpackage;

import androidx.compose.foundation.layout.d;
import androidx.compose.ui.platform.a;
import androidx.fragment.app.y;
import com.yandex.music.core.ui.compose.b;
import io.appmetrica.analytics.BuildConfig;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.R;
import ru.yandex.music.data.wave.recommendations.StationId;

/* loaded from: classes3.dex */
public final /* synthetic */ class jv implements ryc {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ jv(Function1 function1, Function1 function12) {
        this.a = 14;
        this.b = (ezc) function1;
        this.c = (ezc) function12;
    }

    private final Object a(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        i5j i5jVar = (i5j) this.b;
        ynn ynnVar = (ynn) this.c;
        int intValue = ((Integer) obj).intValue();
        l5j l5jVar = (l5j) obj2;
        hq5 hq5Var = (hq5) obj3;
        int intValue2 = ((Integer) obj4).intValue();
        l5jVar.getClass();
        if ((intValue2 & 6) == 0) {
            i = (((oq5) hq5Var).d(intValue) ? 4 : 2) | intValue2;
        } else {
            i = intValue2;
        }
        if ((intValue2 & 48) == 0) {
            i |= ((oq5) hq5Var).f(l5jVar) ? 32 : 16;
        }
        oq5 oq5Var = (oq5) hq5Var;
        if (oq5Var.P(i & 1, (i & 147) != 146)) {
            boolean f = oq5Var.f(i5jVar) | ((i & 112) == 32) | ((i & 14) == 4);
            Object K = oq5Var.K();
            if (f || K == gq5.a) {
                K = new gva(i5jVar, l5jVar, intValue, 22);
                oq5Var.k0(K);
            }
            j66.z(l5jVar, intValue, i5jVar, b.b(a.a(com.yandex.music.core.ui.compose.a.b(vci.a, ynnVar, 0L, 0.0f, null, (Function2) K, 14), "new_releases_item"), intValue), oq5Var, ((i >> 3) & 14) | ((i << 3) & 112));
        } else {
            oq5Var.S();
        }
        return Unit.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [ezc, java.lang.Object, kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r2v1, types: [ezc, java.lang.Object, kotlin.jvm.functions.Function1] */
    private final Object d(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        final ?? r1 = (ezc) this.b;
        final ?? r2 = (ezc) this.c;
        Integer num = (Integer) obj;
        int intValue = num.intValue();
        final b9j b9jVar = (b9j) obj2;
        hq5 hq5Var = (hq5) obj3;
        int intValue2 = ((Integer) obj4).intValue();
        b9jVar.getClass();
        if ((intValue2 & 6) == 0) {
            i = (((oq5) hq5Var).d(intValue) ? 4 : 2) | intValue2;
        } else {
            i = intValue2;
        }
        if ((intValue2 & 48) == 0) {
            i |= ((oq5) hq5Var).f(b9jVar) ? 32 : 16;
        }
        oq5 oq5Var = (oq5) hq5Var;
        if (oq5Var.P(i & 1, (i & 147) != 146)) {
            x1g x1gVar = b9jVar.a;
            w3g w3gVar = b9jVar.b;
            yci c = b.c(a.a(vci.a, "collection_non_music_albums_block_item"), "collection_non_music_albums_block_item_index", num);
            int i2 = i & 112;
            boolean f = oq5Var.f(r1) | (i2 == 32);
            Object K = oq5Var.K();
            Object obj5 = gq5.a;
            if (f || K == obj5) {
                final int i3 = 0;
                K = new Function0(r1, b9jVar, i3) { // from class: h9j
                    public final /* synthetic */ int a;
                    public final /* synthetic */ ezc b;
                    public final /* synthetic */ b9j c;

                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        this.a = i3;
                        this.b = (ezc) r1;
                        this.c = b9jVar;
                    }

                    /* JADX WARN: Type inference failed for: r1v0, types: [ezc, kotlin.jvm.functions.Function1] */
                    /* JADX WARN: Type inference failed for: r1v1, types: [ezc, kotlin.jvm.functions.Function1] */
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (this.a) {
                            case 0:
                                this.b.invoke(this.c.c);
                                break;
                            default:
                                this.b.invoke(this.c.c);
                                break;
                        }
                        return Unit.a;
                    }
                };
                oq5Var.k0(K);
            }
            Function0 function0 = (Function0) K;
            boolean f2 = oq5Var.f(r2) | (i2 == 32);
            Object K2 = oq5Var.K();
            if (f2 || K2 == obj5) {
                final int i4 = 1;
                K2 = new Function0(r2, b9jVar, i4) { // from class: h9j
                    public final /* synthetic */ int a;
                    public final /* synthetic */ ezc b;
                    public final /* synthetic */ b9j c;

                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        this.a = i4;
                        this.b = (ezc) r2;
                        this.c = b9jVar;
                    }

                    /* JADX WARN: Type inference failed for: r1v0, types: [ezc, kotlin.jvm.functions.Function1] */
                    /* JADX WARN: Type inference failed for: r1v1, types: [ezc, kotlin.jvm.functions.Function1] */
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (this.a) {
                            case 0:
                                this.b.invoke(this.c.c);
                                break;
                            default:
                                this.b.invoke(this.c.c);
                                break;
                        }
                        return Unit.a;
                    }
                };
                oq5Var.k0(K2);
            }
            w1g.a(function0, x1gVar, w3gVar, c, false, (Function0) K2, oq5Var, 0, 16);
        } else {
            oq5Var.S();
        }
        return Unit.a;
    }

    private final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
        String[] strArr = (String[]) this.b;
        yoc yocVar = (yoc) this.c;
        int intValue = ((Integer) obj2).intValue();
        hq5 hq5Var = (hq5) obj3;
        ((Integer) obj4).getClass();
        ((cl0) obj).getClass();
        vci vciVar = vci.a;
        yci d = d.d(vciVar, 1.0f);
        kfh d2 = ug3.d(b2c.i, false);
        oq5 oq5Var = (oq5) hq5Var;
        int i = oq5Var.P;
        androidx.compose.runtime.internal.a l = oq5Var.l();
        yci H = vnj.H(hq5Var, d);
        xp5.T.getClass();
        grb grbVar = wp5.b;
        oq5Var.d0();
        if (oq5Var.O) {
            oq5Var.k(grbVar);
        } else {
            oq5Var.n0();
        }
        g0g.U(hq5Var, d2, wp5.f);
        g0g.U(hq5Var, l, wp5.e);
        kb5 kb5Var = wp5.g;
        if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i))) {
            ouj.x(i, oq5Var, i, kb5Var);
        }
        g0g.U(hq5Var, H, wp5.d);
        xcs.b(strArr[intValue], a.a(androidx.compose.foundation.a.k(androidx.compose.ui.focus.a.a(androidx.compose.foundation.layout.a.l(vciVar, ((prj) oq5Var.j(qrj.a)).c), yocVar), true, null), "onboarding_text"), ((dq0) ((oq5) hq5Var).j(eq0.a)).b.a, 0L, null, 0L, null, new o9s(3), 0L, 0, false, 0, 0, null, nu0.d(), hq5Var, 0, 0, 65016);
        oq5Var.p(true);
        return Unit.a;
    }

    private final Object h(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        lvf lvfVar = (lvf) this.b;
        g6p g6pVar = (g6p) this.c;
        androidx.compose.foundation.lazy.a aVar = (androidx.compose.foundation.lazy.a) obj;
        int intValue = ((Integer) obj2).intValue();
        hq5 hq5Var = (hq5) obj3;
        int intValue2 = ((Integer) obj4).intValue();
        aVar.getClass();
        if ((intValue2 & 6) == 0) {
            i = (((oq5) hq5Var).f(aVar) ? 4 : 2) | intValue2;
        } else {
            i = intValue2;
        }
        if ((intValue2 & 48) == 0) {
            i |= ((oq5) hq5Var).d(intValue) ? 32 : 16;
        }
        oq5 oq5Var = (oq5) hq5Var;
        if (oq5Var.P(i & 1, (i & 147) != 146)) {
            y7p y7pVar = (y7p) lvfVar.c(intValue);
            if (y7pVar == null) {
                return Unit.a;
            }
            yci g0 = f8g.g0(androidx.compose.foundation.lazy.a.a(aVar, vci.a), ((y7pVar instanceof p7p) || (y7pVar instanceof s7p)) ? 1.0f : 0.0f);
            boolean f = oq5Var.f(y7pVar) | oq5Var.h(g6pVar) | ((i & 112) == 32);
            Object K = oq5Var.K();
            if (f || K == gq5.a) {
                K = new x8l(y7pVar, g6pVar, intValue, 13);
                oq5Var.k0(K);
            }
            y5g.k(y7pVar, g6pVar, intValue, com.yandex.music.core.ui.compose.a.b(g0, null, 0L, 0.0f, null, (Function2) K, 15), oq5Var, (i << 3) & 896, 0);
        } else {
            oq5Var.S();
        }
        return Unit.a;
    }

    private final Object j(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        int i2;
        String str;
        vdr vdrVar = (vdr) this.b;
        bml bmlVar = (bml) this.c;
        sai saiVar = (sai) obj2;
        hq5 hq5Var = (hq5) obj3;
        int d = eta.d((Integer) obj4, (ua5) obj, saiVar);
        if ((d & 48) == 0) {
            d |= ((oq5) hq5Var).f(saiVar) ? 32 : 16;
        }
        oq5 oq5Var = (oq5) hq5Var;
        if (oq5Var.P(d & 1, (d & 145) != 144)) {
            String M = rvf.M(R.string.settings_storage_title, oq5Var);
            oq5Var.Z(-1243798846);
            Iterable<Pair> iterable = (Iterable) gld.M(vdrVar, oq5Var).getValue();
            ArrayList arrayList = new ArrayList(v75.o(iterable, 10));
            for (Pair pair : iterable) {
                thr thrVar = (thr) pair.a;
                boolean booleanValue = ((Boolean) pair.b).booleanValue();
                int ordinal = thrVar.ordinal();
                if (ordinal == 0) {
                    i = -813079423;
                    i2 = R.string.settings_storage_external;
                } else {
                    if (ordinal != 1) {
                        throw vz1.i(oq5Var, -813081336, false);
                    }
                    i = -813075968;
                    i2 = R.string.settings_storage_sd_card;
                }
                String n = vz1.n(oq5Var, i, i2, oq5Var, false);
                int ordinal2 = thrVar.ordinal();
                if (ordinal2 == 0) {
                    str = "external";
                } else {
                    if (ordinal2 != 1) {
                        b6e.s();
                        return null;
                    }
                    str = "sd_card";
                }
                arrayList.add(new hdp(thrVar, n, str, booleanValue));
            }
            oq5Var.p(false);
            boolean z = (d & 112) == 32;
            Object K = oq5Var.K();
            if (z || K == gq5.a) {
                qbp qbpVar = new qbp(0, saiVar, sai.class, "hide", "hide()V", 0, 14);
                oq5Var.k0(qbpVar);
                K = qbpVar;
            }
            hag.f(arrayList, M, bmlVar, (Function0) ((h9f) K), null, oq5Var, 0, 16);
        } else {
            oq5Var.S();
        }
        return Unit.a;
    }

    private final Object k(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        kjn kjnVar;
        hvq hvqVar = (hvq) this.b;
        kwq kwqVar = (kwq) this.c;
        ml4 ml4Var = (ml4) obj;
        int intValue = ((Integer) obj2).intValue();
        hq5 hq5Var = (hq5) obj3;
        int intValue2 = ((Integer) obj4).intValue();
        ml4Var.getClass();
        if ((intValue2 & 6) == 0) {
            i = (((oq5) hq5Var).f(ml4Var) ? 4 : 2) | intValue2;
        } else {
            i = intValue2;
        }
        if ((intValue2 & 48) == 0) {
            i |= ((oq5) hq5Var).d(intValue) ? 32 : 16;
        }
        if ((i & 147) == 146) {
            oq5 oq5Var = (oq5) hq5Var;
            if (oq5Var.z()) {
                oq5Var.S();
                return Unit.a;
            }
        }
        int i2 = i & 14;
        gld.v(ml4Var, hvqVar, hq5Var, i2);
        hld.m(ml4Var, hvqVar, hq5Var, i2);
        int i3 = ml4Var.b;
        oq5 oq5Var2 = (oq5) hq5Var;
        boolean h = oq5Var2.h(hvqVar);
        Object K = oq5Var2.K();
        kjn kjnVar2 = gq5.a;
        if (h || K == kjnVar2) {
            kjnVar = kjnVar2;
            vuq vuqVar = new vuq(0, hvqVar, hvq.class, "onBackClick", "onBackClick()V", 0, 2);
            oq5Var2.k0(vuqVar);
            K = vuqVar;
        } else {
            kjnVar = kjnVar2;
        }
        h9f h9fVar = (h9f) K;
        ptq ptqVar = kwqVar.a;
        String str = ptqVar.a;
        d85 b = ((xsq) ptqVar.b.get(ml4Var.a())).b();
        WeakHashMap weakHashMap = rqv.w;
        yci l = androidx.compose.foundation.layout.a.l(vci.a, p6g.n(z7l.h(oq5Var2).f, oq5Var2));
        Object K2 = oq5Var2.K();
        if (K2 == kjnVar) {
            K2 = new xnq(17);
            oq5Var2.k0(K2);
        }
        yci b2 = nfp.b(l, false, (Function1) K2);
        boolean z = i2 == 4;
        Object K3 = oq5Var2.K();
        if (z || K3 == kjnVar) {
            K3 = new nnf(ml4Var, 1);
            oq5Var2.k0(K3);
        }
        gwq.a(i3, (Function0) K3, str, (Function0) h9fVar, b, b2, oq5Var2, 0, 0);
        if (kwqVar.a.c) {
            oq5Var2.Z(-190616648);
            c3x.p(hvqVar, ((jx7) oq5Var2.j(es5.h)).c0(intValue), oq5Var2, 0);
        } else {
            oq5Var2.Z(-193609357);
        }
        oq5Var2.p(false);
        return Unit.a;
    }

    private final Object l(Object obj, Object obj2, Object obj3, Object obj4) {
        hsu hsuVar = (hsu) this.b;
        nru nruVar = (nru) this.c;
        sai saiVar = (sai) obj2;
        hq5 hq5Var = (hq5) obj3;
        int d = eta.d((Integer) obj4, (ua5) obj, saiVar);
        if ((d & 48) == 0) {
            d |= ((oq5) hq5Var).f(saiVar) ? 32 : 16;
        }
        if ((d & 145) == 144) {
            oq5 oq5Var = (oq5) hq5Var;
            if (oq5Var.z()) {
                oq5Var.S();
                return Unit.a;
            }
        }
        oq5 oq5Var2 = (oq5) hq5Var;
        boolean h = oq5Var2.h(nruVar) | ((d & 112) == 32);
        Object K = oq5Var2.K();
        if (h || K == gq5.a) {
            K = new xum(26, nruVar, saiVar);
            oq5Var2.k0(K);
        }
        wdg.p(hsuVar, nruVar, saiVar, (Function1) K, null, oq5Var2, (d << 3) & 896);
        return Unit.a;
    }

    private final Object m(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        gsu gsuVar = (gsu) this.b;
        nru nruVar = (nru) this.c;
        sai saiVar = (sai) obj;
        bci bciVar = (bci) obj2;
        hq5 hq5Var = (hq5) obj3;
        int intValue = ((Integer) obj4).intValue();
        saiVar.getClass();
        bciVar.getClass();
        if ((intValue & 6) == 0) {
            i = (((oq5) hq5Var).f(saiVar) ? 4 : 2) | intValue;
        } else {
            i = intValue;
        }
        if ((intValue & 48) == 0) {
            i |= (intValue & 64) == 0 ? ((oq5) hq5Var).f(bciVar) : ((oq5) hq5Var).h(bciVar) ? 32 : 16;
        }
        int i2 = i;
        if ((i2 & 147) == 146) {
            oq5 oq5Var = (oq5) hq5Var;
            if (oq5Var.z()) {
                oq5Var.S();
                return Unit.a;
            }
        }
        yd5.f(null, null, bciVar, null, null, false, false, false, 0L, 0L, 0.0f, ild.C(1744654219, new mdn(gsuVar, nruVar, saiVar, bciVar, 5), hq5Var), hq5Var, 100667392 | ((i2 << 6) & 7168), 3831);
        return Unit.a;
    }

    private final Object n(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        g5t g5tVar = (g5t) this.b;
        g5t g5tVar2 = (g5t) this.c;
        sai saiVar = (sai) obj;
        bci bciVar = (bci) obj2;
        hq5 hq5Var = (hq5) obj3;
        int intValue = ((Integer) obj4).intValue();
        saiVar.getClass();
        bciVar.getClass();
        if ((intValue & 6) == 0) {
            i = (((oq5) hq5Var).f(saiVar) ? 4 : 2) | intValue;
        } else {
            i = intValue;
        }
        if ((intValue & 48) == 0) {
            i |= (intValue & 64) == 0 ? ((oq5) hq5Var).f(bciVar) : ((oq5) hq5Var).h(bciVar) ? 32 : 16;
        }
        int i2 = i;
        oq5 oq5Var = (oq5) hq5Var;
        if (oq5Var.P(i2 & 1, (i2 & 147) != 146)) {
            fvf a = hvf.a(0, 0, oq5Var, 0, 3);
            yd5.f(null, null, bciVar, a, null, false, false, false, 0L, 0L, 0.0f, ild.C(-1778219246, new mdn(g5tVar, g5tVar2, saiVar, a, 8), oq5Var), oq5Var, 4096 | ((i2 << 6) & 7168), 4071);
        } else {
            oq5Var.S();
        }
        return Unit.a;
    }

    private final Object o(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        nlu nluVar = (nlu) this.b;
        hoq hoqVar = (hoq) this.c;
        int intValue = ((Integer) obj).intValue();
        ilu iluVar = (ilu) obj2;
        hq5 hq5Var = (hq5) obj3;
        int intValue2 = ((Integer) obj4).intValue();
        iluVar.getClass();
        dou douVar = iluVar.b;
        if ((intValue2 & 6) == 0) {
            i = (((oq5) hq5Var).d(intValue) ? 4 : 2) | intValue2;
        } else {
            i = intValue2;
        }
        if ((intValue2 & 48) == 0) {
            i |= (intValue2 & 64) == 0 ? ((oq5) hq5Var).f(iluVar) : ((oq5) hq5Var).h(iluVar) ? 32 : 16;
        }
        if ((i & 147) == 146) {
            oq5 oq5Var = (oq5) hq5Var;
            if (oq5Var.z()) {
                oq5Var.S();
                return Unit.a;
            }
        }
        StationId f = StationId.f(douVar.a);
        f.getClass();
        ArrayList R = o8g.R(douVar.b);
        qfn qfnVar = nluVar.d;
        kxi kxiVar = nluVar.b;
        k6l k6lVar = hoqVar.a;
        uwu uwuVar = hoqVar.b;
        qwu qwuVar = hoqVar.c;
        oq5 oq5Var2 = (oq5) hq5Var;
        boolean h = ((i & 112) == 32 || ((i & 64) != 0 && oq5Var2.h(iluVar))) | oq5Var2.h(nluVar) | ((i & 14) == 4);
        Object K = oq5Var2.K();
        if (h || K == gq5.a) {
            K = new hsl(nluVar, iluVar, intValue, 9);
            oq5Var2.k0(K);
        }
        y1g.a(iluVar.a, wyf.Y(f, R, kxiVar, (Function0) K, k6lVar, uwuVar, qwuVar, null, qfnVar, null, oq5Var2, 6, 0, 640), null, null, oq5Var2, 0, 12);
        return Unit.a;
    }

    private final Object p(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        jav javVar = (jav) this.b;
        ynn ynnVar = (ynn) this.c;
        int intValue = ((Integer) obj).intValue();
        nav navVar = (nav) obj2;
        hq5 hq5Var = (hq5) obj3;
        int intValue2 = ((Integer) obj4).intValue();
        kjn kjnVar = gq5.a;
        navVar.getClass();
        if ((intValue2 & 6) == 0) {
            i = (((oq5) hq5Var).d(intValue) ? 4 : 2) | intValue2;
        } else {
            i = intValue2;
        }
        if ((intValue2 & 48) == 0) {
            i |= ((oq5) hq5Var).f(navVar) ? 32 : 16;
        }
        int i2 = i;
        oq5 oq5Var = (oq5) hq5Var;
        if (oq5Var.P(i2 & 1, (i2 & 147) != 146)) {
            StationId stationId = navVar.g;
            List list = navVar.f;
            pfn b = javVar.b();
            kxi d = javVar.d();
            l18 l18Var = l18.b;
            bdt I = hag.I(k6l.class);
            qdc qdcVar = l18Var.a;
            qdcVar.getClass();
            k6l k6lVar = (k6l) qdcVar.C(I);
            bdt I2 = hag.I(uwu.class);
            qdc qdcVar2 = l18Var.a;
            qdcVar2.getClass();
            uwu uwuVar = (uwu) qdcVar2.C(I2);
            bdt I3 = hag.I(qwu.class);
            qdc qdcVar3 = l18Var.a;
            qdcVar3.getClass();
            qwu qwuVar = (qwu) qdcVar3.C(I3);
            int i3 = i2 & 112;
            int i4 = i2 & 14;
            boolean h = oq5Var.h(javVar) | (i3 == 32) | (i4 == 4);
            Object K = oq5Var.K();
            if (h || K == kjnVar) {
                K = new hsl(javVar, navVar, intValue, 10);
                oq5Var.k0(K);
            }
            owu Y = wyf.Y(stationId, list, d, (Function0) K, k6lVar, uwuVar, qwuVar, null, b, null, oq5Var, 6, 0, 640);
            vci vciVar = vci.a;
            boolean h2 = oq5Var.h(javVar) | (i3 == 32) | (i4 == 4);
            Object K2 = oq5Var.K();
            if (h2 || K2 == kjnVar) {
                K2 = new npu(javVar, navVar, intValue, 4);
                oq5Var.k0(K2);
            }
            qgg.s(navVar, Y, b.b(a.a(com.yandex.music.core.ui.compose.a.b(vciVar, ynnVar, 0L, 0.0f, null, (Function2) K2, 14), "waves_block_station_item"), intValue), 0.0f, oq5Var, (i2 >> 3) & 14);
        } else {
            oq5Var.S();
        }
        return Unit.a;
    }

    private final Object q(Object obj, Object obj2, Object obj3, Object obj4) {
        dwv dwvVar = (dwv) this.b;
        sdr sdrVar = (sdr) this.c;
        gwv gwvVar = (gwv) obj2;
        hq5 hq5Var = (hq5) obj3;
        ((Integer) obj4).getClass();
        ((cl0) obj).getClass();
        gwvVar.getClass();
        if (gwvVar.equals(fwv.a)) {
            oq5 oq5Var = (oq5) hq5Var;
            oq5Var.Z(-413117223);
            neg.q(oq5Var).invoke(xp3.u(d.r(vci.a, BuildConfig.API_LEVEL), ugo.a), oq5Var, 0);
            oq5Var.p(false);
        } else {
            if (!(gwvVar instanceof ewv)) {
                throw vz1.i((oq5) hq5Var, -983159311, false);
            }
            oq5 oq5Var2 = (oq5) hq5Var;
            oq5Var2.Z(-412894953);
            ldg.j(((ewv) gwvVar).a, dwvVar, sdrVar, oq5Var2, 0);
            oq5Var2.p(false);
        }
        return Unit.a;
    }

    private final Object r(Object obj, Object obj2, Object obj3, Object obj4) {
        lwv lwvVar = (lwv) this.b;
        fvf fvfVar = (fvf) this.c;
        rwv rwvVar = (rwv) obj2;
        hq5 hq5Var = (hq5) obj3;
        ((Integer) obj4).intValue();
        ((cl0) obj).getClass();
        rwvVar.getClass();
        int ordinal = rwvVar.ordinal();
        if (ordinal == 0) {
            oq5 oq5Var = (oq5) hq5Var;
            oq5Var.Z(196253349);
            wdg.r(lwvVar, fvfVar, oq5Var, 0);
            oq5Var.p(false);
        } else {
            if (ordinal != 1) {
                throw vz1.i((oq5) hq5Var, 196251749, false);
            }
            oq5 oq5Var2 = (oq5) hq5Var;
            oq5Var2.Z(196258869);
            wdg.y(lwvVar, oq5Var2, 0);
            oq5Var2.p(false);
        }
        return Unit.a;
    }

    private final Object s(Object obj, Object obj2, Object obj3, Object obj4) {
        uyv uyvVar = (uyv) this.b;
        geh gehVar = (geh) this.c;
        yyv yyvVar = (yyv) obj;
        bzv bzvVar = (bzv) obj2;
        jtv jtvVar = (jtv) obj3;
        boolean booleanValue = ((Boolean) obj4).booleanValue();
        yyvVar.getClass();
        bzvVar.getClass();
        jtvVar.getClass();
        uyvVar.getClass();
        nyv nyvVar = (nyv) yyvVar.a.get(gehVar);
        if (nyvVar == null) {
            return ysv.a;
        }
        jtv jtvVar2 = nyvVar.b;
        ktv ktvVar = nyvVar.c;
        String str = ktvVar.c;
        boolean z = ktvVar.f;
        boolean z2 = bzvVar instanceof zyv;
        wsv wsvVar = usv.a;
        if (z2) {
            zyv zyvVar = (zyv) bzvVar;
            if (zyvVar.d) {
                boolean equals = jtvVar2.equals(jtvVar);
                boolean equals2 = jtvVar2.equals(jtvVar);
                boolean z3 = zyvVar.f;
                boolean z4 = booleanValue || equals;
                wsvVar = new qsv(z, str, z3 ? gsv.a : equals2 ? new hsv(z4) : new isv(z4));
            }
        } else {
            if (!(bzvVar instanceof azv)) {
                b6e.s();
                return null;
            }
            azv azvVar = (azv) bzvVar;
            if (azvVar.d) {
                if (azvVar.f.equals(jtvVar2)) {
                    zzv zzvVar = azvVar.g;
                    String str2 = ktvVar.b;
                    boolean z5 = zzvVar instanceof xzv;
                    osv osvVar = msv.a;
                    if (!z5) {
                        if (!(zzvVar instanceof yzv)) {
                            b6e.s();
                            return null;
                        }
                        yzv yzvVar = (yzv) zzvVar;
                        if (str2.equals(yzvVar.b)) {
                            osvVar = new nsv(yzvVar.c, yzvVar.d, yzvVar.e, yzvVar.f);
                        }
                    }
                    wsvVar = new rsv(z, str, osvVar);
                } else {
                    wsvVar = tsv.a;
                }
            }
        }
        return new xsv(ktvVar, wsvVar);
    }

    @Override // defpackage.ryc
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        int i2;
        boolean z;
        boolean h;
        Object K;
        boolean h2;
        Object K2;
        int i3;
        int i4;
        oq5 oq5Var;
        int i5;
        boolean h3;
        Object K3;
        boolean h4;
        Object K4;
        int i6;
        int i7;
        int i8;
        int i9;
        owu owuVar;
        boolean z2;
        switch (this.a) {
            case 0:
                ryc rycVar = (ryc) this.b;
                pyc pycVar = (pyc) this.c;
                int intValue = ((Integer) obj).intValue();
                rt rtVar = (rt) obj2;
                hq5 hq5Var = (hq5) obj3;
                int intValue2 = ((Integer) obj4).intValue();
                Object obj5 = gq5.a;
                rtVar.getClass();
                oq oqVar = rtVar.b;
                if ((intValue2 & 6) == 0) {
                    i = (((oq5) hq5Var).d(intValue) ? 4 : 2) | intValue2;
                } else {
                    i = intValue2;
                }
                if ((intValue2 & 48) == 0) {
                    i |= (intValue2 & 64) == 0 ? ((oq5) hq5Var).f(rtVar) : ((oq5) hq5Var).h(rtVar) ? 32 : 16;
                }
                oq5 oq5Var2 = (oq5) hq5Var;
                if (oq5Var2.P(i & 1, (i & 147) != 146)) {
                    thj x = c3x.x(oqVar, intValue);
                    final g00 g00Var = (g00) rycVar.invoke(oqVar, x, oq5Var2, 0);
                    rab rabVar = rtVar.a;
                    oq5Var2.Z(-1774783452);
                    yci yciVar = vci.a;
                    if (pycVar != null) {
                        boolean f = oq5Var2.f(pycVar) | oq5Var2.h(x);
                        Object K5 = oq5Var2.K();
                        if (f || K5 == obj5) {
                            K5 = new su(pycVar, x, 0);
                            oq5Var2.k0(K5);
                        }
                        yciVar = com.yandex.music.core.ui.compose.a.b(yciVar, null, 0L, 0.0f, null, (Function2) K5, 15);
                    }
                    oq5Var2.p(false);
                    boolean h5 = oq5Var2.h(g00Var);
                    Object K6 = oq5Var2.K();
                    if (h5 || K6 == obj5) {
                        final int i10 = 0;
                        K6 = new Function0() { // from class: yu
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                switch (i10) {
                                    case 0:
                                        g00 g00Var2 = g00Var;
                                        rmb.j(g00Var2.a, wjb.AlbumScreen, g00Var2.b, null, 12);
                                        g00Var2.c.g.a(new iz(g00Var2.d, g00Var2.e));
                                        break;
                                    default:
                                        g00 g00Var3 = g00Var;
                                        rmb.j(g00Var3.a, wjb.BottomsheetScreen, g00Var3.b, null, 12);
                                        dy dyVar = g00Var3.c.d;
                                        oq oqVar2 = g00Var3.d;
                                        dyVar.getClass();
                                        oqVar2.getClass();
                                        lwg C = g0g.C(oqVar2, null);
                                        y supportFragmentManager = dyVar.a.getSupportFragmentManager();
                                        szf.R(supportFragmentManager, vz1.f(supportFragmentManager, C), ru.yandex.music.common.media.context.d.a());
                                        break;
                                }
                                return Unit.a;
                            }
                        };
                        oq5Var2.k0(K6);
                    }
                    Function0 function0 = (Function0) K6;
                    boolean h6 = oq5Var2.h(g00Var);
                    Object K7 = oq5Var2.K();
                    if (h6 || K7 == obj5) {
                        final int i11 = 1;
                        K7 = new Function0() { // from class: yu
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                switch (i11) {
                                    case 0:
                                        g00 g00Var2 = g00Var;
                                        rmb.j(g00Var2.a, wjb.AlbumScreen, g00Var2.b, null, 12);
                                        g00Var2.c.g.a(new iz(g00Var2.d, g00Var2.e));
                                        break;
                                    default:
                                        g00 g00Var3 = g00Var;
                                        rmb.j(g00Var3.a, wjb.BottomsheetScreen, g00Var3.b, null, 12);
                                        dy dyVar = g00Var3.c.d;
                                        oq oqVar2 = g00Var3.d;
                                        dyVar.getClass();
                                        oqVar2.getClass();
                                        lwg C = g0g.C(oqVar2, null);
                                        y supportFragmentManager = dyVar.a.getSupportFragmentManager();
                                        szf.R(supportFragmentManager, vz1.f(supportFragmentManager, C), ru.yandex.music.common.media.context.d.a());
                                        break;
                                }
                                return Unit.a;
                            }
                        };
                        oq5Var2.k0(K7);
                    }
                    irf.c(function0, rabVar, yciVar, (Function0) K7, oq5Var2, 0);
                } else {
                    oq5Var2.S();
                }
                return Unit.a;
            case 1:
                final u44 u44Var = (u44) this.b;
                bhs bhsVar = (bhs) this.c;
                final spd spdVar = (spd) obj;
                final r34 r34Var = (r34) obj2;
                hq5 hq5Var2 = (hq5) obj3;
                int intValue3 = ((Integer) obj4).intValue();
                kjn kjnVar = gq5.a;
                spdVar.getClass();
                r34Var.getClass();
                ahs ahsVar = r34Var.a;
                f24 f24Var = r34Var.b;
                int i12 = 2;
                switch (f24Var.ordinal()) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 5:
                    case 6:
                        i12 = 1;
                        break;
                    case 4:
                    case 7:
                        break;
                    default:
                        b6e.s();
                        return null;
                }
                yci c = b.c(b.b(vci.a, spdVar.c), "section", f24Var.name());
                oq5 oq5Var3 = (oq5) hq5Var2;
                int i13 = (intValue3 & 112) ^ 48;
                boolean h7 = oq5Var3.h(u44Var) | ((i13 > 32 && oq5Var3.f(r34Var)) || (intValue3 & 48) == 32) | oq5Var3.h(spdVar);
                Object K8 = oq5Var3.K();
                if (h7 || K8 == kjnVar) {
                    K8 = new sh1(14, u44Var, r34Var, spdVar);
                    oq5Var3.k0(K8);
                }
                yci b = com.yandex.music.core.ui.compose.a.b(c, null, 0L, 0.0f, null, (Function2) K8, 15);
                wn5 wn5Var = pd.c;
                wn5 C = ild.C(-851230942, new q2(23, r34Var), oq5Var3);
                boolean h8 = oq5Var3.h(u44Var);
                if (i13 <= 32 || !oq5Var3.f(r34Var)) {
                    i2 = intValue3;
                    if ((i2 & 48) != 32) {
                        z = false;
                        h = z | h8 | oq5Var3.h(spdVar);
                        K = oq5Var3.K();
                        if (!h || K == kjnVar) {
                            final int i14 = 0;
                            K = new Function1() { // from class: y44
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj6) {
                                    wjb wjbVar;
                                    int i15 = i14;
                                    spd spdVar2 = spdVar;
                                    r34 r34Var2 = r34Var;
                                    u44 u44Var2 = u44Var;
                                    ((ahs) obj6).getClass();
                                    switch (i15) {
                                        case 0:
                                            nnk nnkVar = u44Var2.a;
                                            r34Var2.getClass();
                                            spdVar2.getClass();
                                            x8a x8aVar = u44Var2.d;
                                            ahs ahsVar2 = r34Var2.a;
                                            f24 f24Var2 = r34Var2.b;
                                            if (x8aVar.e(ahsVar2.getTitle())) {
                                                rmb rmbVar = u44Var2.b;
                                                switch (f24Var2.ordinal()) {
                                                    case 0:
                                                        wjbVar = wjb.DownloadedContentScreen;
                                                        break;
                                                    case 1:
                                                        wjbVar = wjb.CollectionPlaylistsScreen;
                                                        break;
                                                    case 2:
                                                        wjbVar = wjb.CollectionAlbumsScreen;
                                                        break;
                                                    case 3:
                                                        wjbVar = wjb.CollectionKidsScreen;
                                                        break;
                                                    case 4:
                                                        wjbVar = wjb.CollectionAudiobooksScreen;
                                                        break;
                                                    case 5:
                                                        wjbVar = wjb.CollectionPodcastScreen;
                                                        break;
                                                    case 6:
                                                        wjbVar = wjb.CollectionVideoclipsScreen;
                                                        break;
                                                    case 7:
                                                        wjbVar = wjb.MultivibeScreen;
                                                        break;
                                                    default:
                                                        b6e.s();
                                                        break;
                                                }
                                                rmb.j(rmbVar, wjbVar, tt0.u(ahsVar2, spdVar2), null, 12);
                                                switch (f24Var2.ordinal()) {
                                                    case 0:
                                                        nnkVar.E(v35.m);
                                                        break;
                                                    case 1:
                                                        nnkVar.E(v35.e);
                                                        break;
                                                    case 2:
                                                        nnkVar.E(v35.f);
                                                        break;
                                                    case 3:
                                                        nnkVar.E(v35.a);
                                                        break;
                                                    case 4:
                                                        nnkVar.E(v35.j);
                                                        break;
                                                    case 5:
                                                        nnkVar.E(v35.k);
                                                        break;
                                                    case 6:
                                                        nnkVar.E(v35.g);
                                                        break;
                                                    case 7:
                                                        nnkVar.E(v35.u);
                                                        break;
                                                    default:
                                                        b6e.s();
                                                        break;
                                                }
                                            }
                                            break;
                                        default:
                                            u44Var2.getClass();
                                            r34Var2.getClass();
                                            spdVar2.getClass();
                                            rmb rmbVar2 = u44Var2.b;
                                            wjb wjbVar2 = wjb.ShortcutPinScreen;
                                            ahs ahsVar3 = r34Var2.a;
                                            rmb.j(rmbVar2, wjbVar2, tt0.u(ahsVar3, spdVar2), null, 12);
                                            nnk nnkVar2 = u44Var2.a;
                                            c44 c44Var = new c44(r34Var2.b, ahsVar3.getTitle(), r34Var2.c, spdVar2.c + 1);
                                            np2 np2Var = (np2) ((jyr) nnkVar2.b).getValue();
                                            if (np2Var != null) {
                                                kkp kkpVar = new kkp(c44Var, np2Var.g());
                                                y yVar = ((qnq) nnkVar2.a).a;
                                                yVar.getClass();
                                                sai saiVar = new sai(false);
                                                cvo cvoVar = cvo.i;
                                                e3s.X(o6m.b(wjbVar2, null, 6), yVar, null, saiVar, null, new wn5(new w34(kkpVar, saiVar, 0), 1316590688, true), 52);
                                            }
                                            break;
                                    }
                                    return Unit.a;
                                }
                            };
                            oq5Var3.k0(K);
                        }
                        Function1 function1 = (Function1) K;
                        h2 = oq5Var3.h(u44Var) | ((i13 <= 32 && oq5Var3.f(r34Var)) || (i2 & 48) == 32) | oq5Var3.h(spdVar);
                        K2 = oq5Var3.K();
                        if (!h2 || K2 == kjnVar) {
                            final int i15 = 1;
                            K2 = new Function1() { // from class: y44
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj6) {
                                    wjb wjbVar;
                                    int i152 = i15;
                                    spd spdVar2 = spdVar;
                                    r34 r34Var2 = r34Var;
                                    u44 u44Var2 = u44Var;
                                    ((ahs) obj6).getClass();
                                    switch (i152) {
                                        case 0:
                                            nnk nnkVar = u44Var2.a;
                                            r34Var2.getClass();
                                            spdVar2.getClass();
                                            x8a x8aVar = u44Var2.d;
                                            ahs ahsVar2 = r34Var2.a;
                                            f24 f24Var2 = r34Var2.b;
                                            if (x8aVar.e(ahsVar2.getTitle())) {
                                                rmb rmbVar = u44Var2.b;
                                                switch (f24Var2.ordinal()) {
                                                    case 0:
                                                        wjbVar = wjb.DownloadedContentScreen;
                                                        break;
                                                    case 1:
                                                        wjbVar = wjb.CollectionPlaylistsScreen;
                                                        break;
                                                    case 2:
                                                        wjbVar = wjb.CollectionAlbumsScreen;
                                                        break;
                                                    case 3:
                                                        wjbVar = wjb.CollectionKidsScreen;
                                                        break;
                                                    case 4:
                                                        wjbVar = wjb.CollectionAudiobooksScreen;
                                                        break;
                                                    case 5:
                                                        wjbVar = wjb.CollectionPodcastScreen;
                                                        break;
                                                    case 6:
                                                        wjbVar = wjb.CollectionVideoclipsScreen;
                                                        break;
                                                    case 7:
                                                        wjbVar = wjb.MultivibeScreen;
                                                        break;
                                                    default:
                                                        b6e.s();
                                                        break;
                                                }
                                                rmb.j(rmbVar, wjbVar, tt0.u(ahsVar2, spdVar2), null, 12);
                                                switch (f24Var2.ordinal()) {
                                                    case 0:
                                                        nnkVar.E(v35.m);
                                                        break;
                                                    case 1:
                                                        nnkVar.E(v35.e);
                                                        break;
                                                    case 2:
                                                        nnkVar.E(v35.f);
                                                        break;
                                                    case 3:
                                                        nnkVar.E(v35.a);
                                                        break;
                                                    case 4:
                                                        nnkVar.E(v35.j);
                                                        break;
                                                    case 5:
                                                        nnkVar.E(v35.k);
                                                        break;
                                                    case 6:
                                                        nnkVar.E(v35.g);
                                                        break;
                                                    case 7:
                                                        nnkVar.E(v35.u);
                                                        break;
                                                    default:
                                                        b6e.s();
                                                        break;
                                                }
                                            }
                                            break;
                                        default:
                                            u44Var2.getClass();
                                            r34Var2.getClass();
                                            spdVar2.getClass();
                                            rmb rmbVar2 = u44Var2.b;
                                            wjb wjbVar2 = wjb.ShortcutPinScreen;
                                            ahs ahsVar3 = r34Var2.a;
                                            rmb.j(rmbVar2, wjbVar2, tt0.u(ahsVar3, spdVar2), null, 12);
                                            nnk nnkVar2 = u44Var2.a;
                                            c44 c44Var = new c44(r34Var2.b, ahsVar3.getTitle(), r34Var2.c, spdVar2.c + 1);
                                            np2 np2Var = (np2) ((jyr) nnkVar2.b).getValue();
                                            if (np2Var != null) {
                                                kkp kkpVar = new kkp(c44Var, np2Var.g());
                                                y yVar = ((qnq) nnkVar2.a).a;
                                                yVar.getClass();
                                                sai saiVar = new sai(false);
                                                cvo cvoVar = cvo.i;
                                                e3s.X(o6m.b(wjbVar2, null, 6), yVar, null, saiVar, null, new wn5(new w34(kkpVar, saiVar, 0), 1316590688, true), 52);
                                            }
                                            break;
                                    }
                                    return Unit.a;
                                }
                            };
                            oq5Var3.k0(K2);
                        }
                        avf.j(ahsVar, b, i12, bhsVar, wn5Var, null, C, function1, (Function1) K2, oq5Var3, 1597440, 32);
                        return Unit.a;
                    }
                } else {
                    i2 = intValue3;
                }
                z = true;
                h = z | h8 | oq5Var3.h(spdVar);
                K = oq5Var3.K();
                if (!h) {
                }
                final int i142 = 0;
                K = new Function1() { // from class: y44
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj6) {
                        wjb wjbVar;
                        int i152 = i142;
                        spd spdVar2 = spdVar;
                        r34 r34Var2 = r34Var;
                        u44 u44Var2 = u44Var;
                        ((ahs) obj6).getClass();
                        switch (i152) {
                            case 0:
                                nnk nnkVar = u44Var2.a;
                                r34Var2.getClass();
                                spdVar2.getClass();
                                x8a x8aVar = u44Var2.d;
                                ahs ahsVar2 = r34Var2.a;
                                f24 f24Var2 = r34Var2.b;
                                if (x8aVar.e(ahsVar2.getTitle())) {
                                    rmb rmbVar = u44Var2.b;
                                    switch (f24Var2.ordinal()) {
                                        case 0:
                                            wjbVar = wjb.DownloadedContentScreen;
                                            break;
                                        case 1:
                                            wjbVar = wjb.CollectionPlaylistsScreen;
                                            break;
                                        case 2:
                                            wjbVar = wjb.CollectionAlbumsScreen;
                                            break;
                                        case 3:
                                            wjbVar = wjb.CollectionKidsScreen;
                                            break;
                                        case 4:
                                            wjbVar = wjb.CollectionAudiobooksScreen;
                                            break;
                                        case 5:
                                            wjbVar = wjb.CollectionPodcastScreen;
                                            break;
                                        case 6:
                                            wjbVar = wjb.CollectionVideoclipsScreen;
                                            break;
                                        case 7:
                                            wjbVar = wjb.MultivibeScreen;
                                            break;
                                        default:
                                            b6e.s();
                                            break;
                                    }
                                    rmb.j(rmbVar, wjbVar, tt0.u(ahsVar2, spdVar2), null, 12);
                                    switch (f24Var2.ordinal()) {
                                        case 0:
                                            nnkVar.E(v35.m);
                                            break;
                                        case 1:
                                            nnkVar.E(v35.e);
                                            break;
                                        case 2:
                                            nnkVar.E(v35.f);
                                            break;
                                        case 3:
                                            nnkVar.E(v35.a);
                                            break;
                                        case 4:
                                            nnkVar.E(v35.j);
                                            break;
                                        case 5:
                                            nnkVar.E(v35.k);
                                            break;
                                        case 6:
                                            nnkVar.E(v35.g);
                                            break;
                                        case 7:
                                            nnkVar.E(v35.u);
                                            break;
                                        default:
                                            b6e.s();
                                            break;
                                    }
                                }
                                break;
                            default:
                                u44Var2.getClass();
                                r34Var2.getClass();
                                spdVar2.getClass();
                                rmb rmbVar2 = u44Var2.b;
                                wjb wjbVar2 = wjb.ShortcutPinScreen;
                                ahs ahsVar3 = r34Var2.a;
                                rmb.j(rmbVar2, wjbVar2, tt0.u(ahsVar3, spdVar2), null, 12);
                                nnk nnkVar2 = u44Var2.a;
                                c44 c44Var = new c44(r34Var2.b, ahsVar3.getTitle(), r34Var2.c, spdVar2.c + 1);
                                np2 np2Var = (np2) ((jyr) nnkVar2.b).getValue();
                                if (np2Var != null) {
                                    kkp kkpVar = new kkp(c44Var, np2Var.g());
                                    y yVar = ((qnq) nnkVar2.a).a;
                                    yVar.getClass();
                                    sai saiVar = new sai(false);
                                    cvo cvoVar = cvo.i;
                                    e3s.X(o6m.b(wjbVar2, null, 6), yVar, null, saiVar, null, new wn5(new w34(kkpVar, saiVar, 0), 1316590688, true), 52);
                                }
                                break;
                        }
                        return Unit.a;
                    }
                };
                oq5Var3.k0(K);
                Function1 function12 = (Function1) K;
                h2 = oq5Var3.h(u44Var) | ((i13 <= 32 && oq5Var3.f(r34Var)) || (i2 & 48) == 32) | oq5Var3.h(spdVar);
                K2 = oq5Var3.K();
                if (!h2) {
                }
                final int i152 = 1;
                K2 = new Function1() { // from class: y44
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj6) {
                        wjb wjbVar;
                        int i1522 = i152;
                        spd spdVar2 = spdVar;
                        r34 r34Var2 = r34Var;
                        u44 u44Var2 = u44Var;
                        ((ahs) obj6).getClass();
                        switch (i1522) {
                            case 0:
                                nnk nnkVar = u44Var2.a;
                                r34Var2.getClass();
                                spdVar2.getClass();
                                x8a x8aVar = u44Var2.d;
                                ahs ahsVar2 = r34Var2.a;
                                f24 f24Var2 = r34Var2.b;
                                if (x8aVar.e(ahsVar2.getTitle())) {
                                    rmb rmbVar = u44Var2.b;
                                    switch (f24Var2.ordinal()) {
                                        case 0:
                                            wjbVar = wjb.DownloadedContentScreen;
                                            break;
                                        case 1:
                                            wjbVar = wjb.CollectionPlaylistsScreen;
                                            break;
                                        case 2:
                                            wjbVar = wjb.CollectionAlbumsScreen;
                                            break;
                                        case 3:
                                            wjbVar = wjb.CollectionKidsScreen;
                                            break;
                                        case 4:
                                            wjbVar = wjb.CollectionAudiobooksScreen;
                                            break;
                                        case 5:
                                            wjbVar = wjb.CollectionPodcastScreen;
                                            break;
                                        case 6:
                                            wjbVar = wjb.CollectionVideoclipsScreen;
                                            break;
                                        case 7:
                                            wjbVar = wjb.MultivibeScreen;
                                            break;
                                        default:
                                            b6e.s();
                                            break;
                                    }
                                    rmb.j(rmbVar, wjbVar, tt0.u(ahsVar2, spdVar2), null, 12);
                                    switch (f24Var2.ordinal()) {
                                        case 0:
                                            nnkVar.E(v35.m);
                                            break;
                                        case 1:
                                            nnkVar.E(v35.e);
                                            break;
                                        case 2:
                                            nnkVar.E(v35.f);
                                            break;
                                        case 3:
                                            nnkVar.E(v35.a);
                                            break;
                                        case 4:
                                            nnkVar.E(v35.j);
                                            break;
                                        case 5:
                                            nnkVar.E(v35.k);
                                            break;
                                        case 6:
                                            nnkVar.E(v35.g);
                                            break;
                                        case 7:
                                            nnkVar.E(v35.u);
                                            break;
                                        default:
                                            b6e.s();
                                            break;
                                    }
                                }
                                break;
                            default:
                                u44Var2.getClass();
                                r34Var2.getClass();
                                spdVar2.getClass();
                                rmb rmbVar2 = u44Var2.b;
                                wjb wjbVar2 = wjb.ShortcutPinScreen;
                                ahs ahsVar3 = r34Var2.a;
                                rmb.j(rmbVar2, wjbVar2, tt0.u(ahsVar3, spdVar2), null, 12);
                                nnk nnkVar2 = u44Var2.a;
                                c44 c44Var = new c44(r34Var2.b, ahsVar3.getTitle(), r34Var2.c, spdVar2.c + 1);
                                np2 np2Var = (np2) ((jyr) nnkVar2.b).getValue();
                                if (np2Var != null) {
                                    kkp kkpVar = new kkp(c44Var, np2Var.g());
                                    y yVar = ((qnq) nnkVar2.a).a;
                                    yVar.getClass();
                                    sai saiVar = new sai(false);
                                    cvo cvoVar = cvo.i;
                                    e3s.X(o6m.b(wjbVar2, null, 6), yVar, null, saiVar, null, new wn5(new w34(kkpVar, saiVar, 0), 1316590688, true), 52);
                                }
                                break;
                        }
                        return Unit.a;
                    }
                };
                oq5Var3.k0(K2);
                avf.j(ahsVar, b, i12, bhsVar, wn5Var, null, C, function12, (Function1) K2, oq5Var3, 1597440, 32);
                return Unit.a;
            case 2:
                ip4 ip4Var = (ip4) this.b;
                ynn ynnVar = (ynn) this.c;
                int intValue4 = ((Integer) obj).intValue();
                z9u z9uVar = (z9u) obj2;
                hq5 hq5Var3 = (hq5) obj3;
                int intValue5 = ((Integer) obj4).intValue();
                kjn kjnVar2 = gq5.a;
                z9uVar.getClass();
                if ((intValue5 & 6) == 0) {
                    i3 = (((oq5) hq5Var3).d(intValue4) ? 4 : 2) | intValue5;
                } else {
                    i3 = intValue5;
                }
                if ((intValue5 & 48) == 0) {
                    i3 |= (intValue5 & 64) == 0 ? ((oq5) hq5Var3).f(z9uVar) : ((oq5) hq5Var3).h(z9uVar) ? 32 : 16;
                }
                int i16 = i3;
                oq5 oq5Var4 = (oq5) hq5Var3;
                if (oq5Var4.P(i16 & 1, (i16 & 147) != 146)) {
                    int i17 = i16 & 14;
                    int i18 = i16 & 112;
                    boolean h9 = oq5Var4.h(ip4Var) | (i17 == 4) | (i18 == 32 || ((i16 & 64) != 0 && oq5Var4.h(z9uVar)));
                    Object K9 = oq5Var4.K();
                    if (h9 || K9 == kjnVar2) {
                        K9 = new de(ip4Var, intValue4, z9uVar, 6);
                        oq5Var4.k0(K9);
                    }
                    Function0 function02 = (Function0) K9;
                    yci b2 = b.b(a.a(vci.a, "video_clip_item"), z9uVar.a);
                    boolean h10 = (i18 == 32 || ((i16 & 64) != 0 && oq5Var4.h(z9uVar))) | oq5Var4.h(ip4Var) | (i17 == 4);
                    Object K10 = oq5Var4.K();
                    if (h10 || K10 == kjnVar2) {
                        K10 = new z2(ip4Var, z9uVar, intValue4, 14);
                        oq5Var4.k0(K10);
                    }
                    o5g.j(z9uVar, function02, com.yandex.music.core.ui.compose.a.b(b2, ynnVar, 0L, 0.0f, null, (Function2) K10, 14), oq5Var4, (i16 >> 3) & 14, 0);
                } else {
                    oq5Var4.S();
                }
                return Unit.a;
            case 3:
                g88 g88Var = (g88) this.b;
                n78 n78Var = (n78) this.c;
                hq5 hq5Var4 = (hq5) obj3;
                if ((eta.d((Integer) obj4, (ua5) obj, (sai) obj2) & 129) == 128) {
                    oq5 oq5Var5 = (oq5) hq5Var4;
                    if (oq5Var5.z()) {
                        oq5Var5.S();
                        return Unit.a;
                    }
                }
                oq5 oq5Var6 = (oq5) hq5Var4;
                Object K11 = oq5Var6.K();
                kjn kjnVar3 = gq5.a;
                if (K11 == kjnVar3) {
                    K11 = new o78(n78Var);
                    oq5Var6.k0(K11);
                }
                xee.h((o78) K11, g88Var, oq5Var6, 0);
                boolean h11 = oq5Var6.h(n78Var);
                Object K12 = oq5Var6.K();
                if (h11 || K12 == kjnVar3) {
                    ej6 ej6Var = new ej6(0, n78Var, n78.class, "onClose", "onClose()V", 0, 23);
                    oq5Var6.k0(ej6Var);
                    K12 = ej6Var;
                }
                wyf.c(null, null, null, null, (Function0) ((h9f) K12), oq5Var6, 0, 31);
                return Unit.a;
            case 4:
                xia xiaVar = (xia) this.b;
                bhs bhsVar2 = (bhs) this.c;
                spd spdVar2 = (spd) obj;
                dja djaVar = (dja) obj2;
                hq5 hq5Var5 = (hq5) obj3;
                int intValue6 = ((Integer) obj4).intValue();
                kjn kjnVar4 = gq5.a;
                spdVar2.getClass();
                djaVar.getClass();
                zgs zgsVar = djaVar.b;
                yia yiaVar = djaVar.a;
                int ordinal = yiaVar.ordinal();
                boolean z3 = true;
                if (ordinal != 0 && ordinal != 1) {
                    i4 = 2;
                    if (ordinal != 2) {
                        if (ordinal != 3 && ordinal != 4) {
                            b6e.s();
                            return null;
                        }
                    }
                    yci b3 = b.b(b.c(vci.a, "section", yiaVar.toString()), spdVar2.c);
                    oq5Var = (oq5) hq5Var5;
                    i5 = (intValue6 & 112) ^ 48;
                    h3 = oq5Var.h(xiaVar) | ((i5 <= 32 && oq5Var.f(djaVar)) || (intValue6 & 48) == 32) | oq5Var.h(spdVar2);
                    K3 = oq5Var.K();
                    if (!h3 || K3 == kjnVar4) {
                        K3 = new v48(2, xiaVar, djaVar, spdVar2);
                        oq5Var.k0(K3);
                    }
                    yci b4 = com.yandex.music.core.ui.compose.a.b(b3, null, 0L, 0.0f, null, (Function2) K3, 15);
                    boolean h12 = oq5Var.h(xiaVar);
                    if ((i5 > 32 || !oq5Var.f(djaVar)) && (intValue6 & 48) != 32) {
                        z3 = false;
                    }
                    h4 = h12 | z3 | oq5Var.h(spdVar2);
                    K4 = oq5Var.K();
                    if (!h4 || K4 == kjnVar4) {
                        K4 = new g3(27, xiaVar, djaVar, spdVar2);
                        oq5Var.k0(K4);
                    }
                    avf.j(zgsVar, b4, i4, bhsVar2, null, null, null, (Function1) K4, null, oq5Var, 0, 368);
                    return Unit.a;
                }
                i4 = 1;
                yci b32 = b.b(b.c(vci.a, "section", yiaVar.toString()), spdVar2.c);
                oq5Var = (oq5) hq5Var5;
                i5 = (intValue6 & 112) ^ 48;
                h3 = oq5Var.h(xiaVar) | ((i5 <= 32 && oq5Var.f(djaVar)) || (intValue6 & 48) == 32) | oq5Var.h(spdVar2);
                K3 = oq5Var.K();
                if (!h3) {
                }
                K3 = new v48(2, xiaVar, djaVar, spdVar2);
                oq5Var.k0(K3);
                yci b42 = com.yandex.music.core.ui.compose.a.b(b32, null, 0L, 0.0f, null, (Function2) K3, 15);
                boolean h122 = oq5Var.h(xiaVar);
                if (i5 > 32) {
                }
                z3 = false;
                h4 = h122 | z3 | oq5Var.h(spdVar2);
                K4 = oq5Var.K();
                if (!h4) {
                }
                K4 = new g3(27, xiaVar, djaVar, spdVar2);
                oq5Var.k0(K4);
                avf.j(zgsVar, b42, i4, bhsVar2, null, null, null, (Function1) K4, null, oq5Var, 0, 368);
                return Unit.a;
            case 5:
                d2b d2bVar = (d2b) this.b;
                ynn ynnVar2 = (ynn) this.c;
                int intValue7 = ((Integer) obj).intValue();
                nav navVar = (nav) obj2;
                hq5 hq5Var6 = (hq5) obj3;
                int intValue8 = ((Integer) obj4).intValue();
                kjn kjnVar5 = gq5.a;
                navVar.getClass();
                if ((intValue8 & 6) == 0) {
                    i6 = (((oq5) hq5Var6).d(intValue7) ? 4 : 2) | intValue8;
                } else {
                    i6 = intValue8;
                }
                if ((intValue8 & 48) == 0) {
                    i6 |= ((oq5) hq5Var6).f(navVar) ? 32 : 16;
                }
                int i19 = i6;
                oq5 oq5Var7 = (oq5) hq5Var6;
                if (oq5Var7.P(i19 & 1, (i19 & 147) != 146)) {
                    StationId stationId = navVar.g;
                    List list = navVar.f;
                    qfn qfnVar = d2bVar.e;
                    kxi kxiVar = d2bVar.b;
                    l18 l18Var = l18.b;
                    bdt I = hag.I(k6l.class);
                    qdc qdcVar = l18Var.a;
                    qdcVar.getClass();
                    k6l k6lVar = (k6l) qdcVar.C(I);
                    bdt I2 = hag.I(uwu.class);
                    qdc qdcVar2 = l18Var.a;
                    qdcVar2.getClass();
                    uwu uwuVar = (uwu) qdcVar2.C(I2);
                    bdt I3 = hag.I(qwu.class);
                    qdc qdcVar3 = l18Var.a;
                    qdcVar3.getClass();
                    qwu qwuVar = (qwu) qdcVar3.C(I3);
                    int i20 = i19 & 112;
                    int i21 = i19 & 14;
                    boolean h13 = oq5Var7.h(d2bVar) | (i20 == 32) | (i21 == 4);
                    Object K13 = oq5Var7.K();
                    if (h13 || K13 == kjnVar5) {
                        K13 = new de(d2bVar, navVar, intValue7, 15);
                        oq5Var7.k0(K13);
                    }
                    owu Y = wyf.Y(stationId, list, kxiVar, (Function0) K13, k6lVar, uwuVar, qwuVar, null, qfnVar, null, oq5Var7, 6, 0, 640);
                    vci vciVar = vci.a;
                    boolean h14 = oq5Var7.h(d2bVar) | (i20 == 32) | (i21 == 4);
                    Object K14 = oq5Var7.K();
                    if (h14 || K14 == kjnVar5) {
                        K14 = new gva(d2bVar, navVar, intValue7, 3);
                        oq5Var7.k0(K14);
                    }
                    qgg.s(navVar, Y, b.b(a.a(com.yandex.music.core.ui.compose.a.b(vciVar, ynnVar2, 0L, 0.0f, null, (Function2) K14, 14), "editorial_waves_block_item"), intValue7), 0.0f, oq5Var7, (i19 >> 3) & 14);
                } else {
                    oq5Var7.S();
                }
                return Unit.a;
            case 6:
                teb tebVar = (teb) this.b;
                yfx yfxVar = (yfx) this.c;
                hq5 hq5Var7 = (hq5) obj3;
                if ((eta.d((Integer) obj4, (ua5) obj, (sai) obj2) & 129) == 128) {
                    oq5 oq5Var8 = (oq5) hq5Var7;
                    if (oq5Var8.z()) {
                        oq5Var8.S();
                        return Unit.a;
                    }
                }
                oq5 oq5Var9 = (oq5) hq5Var7;
                Object K15 = oq5Var9.K();
                if (K15 == gq5.a) {
                    K15 = new seb(tebVar, yfxVar);
                    oq5Var9.k0(K15);
                }
                cxb.i((seb) K15, oq5Var9, 0);
                return Unit.a;
            case 7:
                List list2 = (List) this.b;
                wn5 wn5Var2 = (wn5) this.c;
                int intValue9 = ((Integer) obj2).intValue();
                ((Integer) obj4).getClass();
                ((b3k) obj).getClass();
                int size = intValue9 % list2.size();
                wn5Var2.invoke(Integer.valueOf(size), list2.get(size), (hq5) obj3, 0);
                return Unit.a;
            case 8:
                e7c e7cVar = (e7c) this.b;
                ynn ynnVar3 = (ynn) this.c;
                int intValue10 = ((Integer) obj).intValue();
                a7c a7cVar = (a7c) obj2;
                hq5 hq5Var8 = (hq5) obj3;
                int intValue11 = ((Integer) obj4).intValue();
                a7cVar.getClass();
                if ((intValue11 & 6) == 0) {
                    i7 = (((oq5) hq5Var8).d(intValue10) ? 4 : 2) | intValue11;
                } else {
                    i7 = intValue11;
                }
                if ((intValue11 & 48) == 0) {
                    i7 |= ((oq5) hq5Var8).f(a7cVar) ? 32 : 16;
                }
                oq5 oq5Var10 = (oq5) hq5Var8;
                if (oq5Var10.P(i7 & 1, (i7 & 147) != 146)) {
                    xee.n(a7cVar, intValue10, e7cVar, ynnVar3, null, oq5Var10, ((i7 >> 3) & 14) | ((i7 << 3) & 112));
                } else {
                    oq5Var10.S();
                }
                return Unit.a;
            case 9:
                ynn ynnVar4 = (ynn) this.b;
                khe kheVar = (khe) this.c;
                int intValue12 = ((Integer) obj).intValue();
                ehe eheVar = (ehe) obj2;
                hq5 hq5Var9 = (hq5) obj3;
                int intValue13 = ((Integer) obj4).intValue();
                kjn kjnVar6 = gq5.a;
                eheVar.getClass();
                if ((intValue13 & 6) == 0) {
                    i8 = (((oq5) hq5Var9).d(intValue12) ? 4 : 2) | intValue13;
                } else {
                    i8 = intValue13;
                }
                if ((intValue13 & 48) == 0) {
                    i8 |= ((oq5) hq5Var9).f(eheVar) ? 32 : 16;
                }
                int i22 = i8;
                oq5 oq5Var11 = (oq5) hq5Var9;
                if (oq5Var11.P(i22 & 1, (i22 & 147) != 146)) {
                    vci vciVar2 = vci.a;
                    int i23 = i22 & 14;
                    boolean f2 = oq5Var11.f(kheVar) | ((i22 & 112) == 32) | (i23 == 4);
                    Object K16 = oq5Var11.K();
                    if (f2 || K16 == kjnVar6) {
                        K16 = new gva(kheVar, eheVar, intValue12, 10);
                        oq5Var11.k0(K16);
                    }
                    yci b5 = b.b(a.a(com.yandex.music.core.ui.compose.a.b(vciVar2, ynnVar4, 0L, 0.0f, null, (Function2) K16, 14), "in_style_block_album"), intValue12);
                    boolean f3 = oq5Var11.f(kheVar) | (i23 == 4);
                    Object K17 = oq5Var11.K();
                    if (f3 || K17 == kjnVar6) {
                        K17 = new qo1(kheVar, intValue12, 2);
                        oq5Var11.k0(K17);
                    }
                    Function1 function13 = (Function1) K17;
                    boolean f4 = oq5Var11.f(kheVar);
                    Object K18 = oq5Var11.K();
                    if (f4 || K18 == kjnVar6) {
                        K18 = new lhd(7, kheVar);
                        oq5Var11.k0(K18);
                    }
                    jhe.d(eheVar, function13, b5, (Function1) K18, oq5Var11, (i22 >> 3) & 14);
                } else {
                    oq5Var11.S();
                }
                return Unit.a;
            case 10:
                ynn ynnVar5 = (ynn) this.b;
                l8i l8iVar = (l8i) this.c;
                spd spdVar3 = (spd) obj;
                f8i f8iVar = (f8i) obj2;
                hq5 hq5Var10 = (hq5) obj3;
                int intValue14 = ((Integer) obj4).intValue();
                kjn kjnVar7 = gq5.a;
                spdVar3.getClass();
                f8iVar.getClass();
                if (f8iVar instanceof c8i) {
                    oq5 oq5Var12 = (oq5) hq5Var10;
                    oq5Var12.Z(-1067182206);
                    c8i c8iVar = (c8i) f8iVar;
                    boolean h15 = oq5Var12.h(l8iVar);
                    Object K19 = oq5Var12.K();
                    if (h15 || K19 == kjnVar7) {
                        w4i w4iVar = new w4i(2, l8iVar, l8i.class, "onMixClick", "onMixClick(Lcom/yandex/music/mixes/api/data/MixesItemUi$Entity;Lcom/yandex/music/model/common/GridIndex;)V", 0, 1);
                        oq5Var12.k0(w4iVar);
                        K19 = w4iVar;
                    }
                    Function2 function2 = (Function2) ((h9f) K19);
                    boolean h16 = oq5Var12.h(l8iVar);
                    Object K20 = oq5Var12.K();
                    if (h16 || K20 == kjnVar7) {
                        wjd wjdVar = new wjd(4, l8iVar, l8i.class, "onVisibilityChanged", "onVisibilityChanged(Lcom/yandex/music/mixes/api/data/MixesItemUi$Entity;Lcom/yandex/music/model/common/GridIndex;ZLjava/lang/String;)V", 0, 1);
                        oq5Var12.k0(wjdVar);
                        K20 = wjdVar;
                    }
                    ngg.b(c8iVar, spdVar3, ynnVar5, function2, (ryc) ((h9f) K20), oq5Var12, ((intValue14 >> 3) & 14) | ((intValue14 << 3) & 112));
                    oq5Var12.p(false);
                } else if (f8iVar instanceof b8i) {
                    oq5 oq5Var13 = (oq5) hq5Var10;
                    oq5Var13.Z(-1066831720);
                    d6i d6iVar = ((b8i) f8iVar).a;
                    int i24 = (intValue14 & 112) ^ 48;
                    boolean z4 = true;
                    boolean h17 = oq5Var13.h(l8iVar) | ((i24 > 32 && oq5Var13.f(f8iVar)) || (intValue14 & 48) == 32) | oq5Var13.h(spdVar3);
                    Object K21 = oq5Var13.K();
                    if (h17 || K21 == kjnVar7) {
                        K21 = new cte(6, l8iVar, f8iVar, spdVar3);
                        oq5Var13.k0(K21);
                    }
                    Function0 function03 = (Function0) K21;
                    vci vciVar3 = vci.a;
                    boolean h18 = oq5Var13.h(l8iVar);
                    if ((i24 <= 32 || !oq5Var13.f(f8iVar)) && (intValue14 & 48) != 32) {
                        z4 = false;
                    }
                    boolean h19 = h18 | z4 | oq5Var13.h(spdVar3);
                    Object K22 = oq5Var13.K();
                    if (h19 || K22 == kjnVar7) {
                        K22 = new q6h(3, l8iVar, f8iVar, spdVar3);
                        oq5Var13.k0(K22);
                    }
                    pcg.e(d6iVar, function03, com.yandex.music.core.ui.compose.a.b(vciVar3, ynnVar5, 0L, 0.0f, null, (Function2) K22, 14), oq5Var13, 0);
                    oq5Var13.p(false);
                } else if (f8iVar.equals(d8i.a)) {
                    oq5 oq5Var14 = (oq5) hq5Var10;
                    oq5Var14.Z(519789681);
                    oq5Var14.p(false);
                } else {
                    if (!f8iVar.equals(e8i.a)) {
                        throw vz1.i((oq5) hq5Var10, 519762860, false);
                    }
                    oq5 oq5Var15 = (oq5) hq5Var10;
                    oq5Var15.Z(519791153);
                    oq5Var15.p(false);
                }
                return Unit.a;
            case 11:
                lvf lvfVar = (lvf) this.b;
                lti ltiVar = (lti) this.c;
                int intValue15 = ((Integer) obj2).intValue();
                hq5 hq5Var11 = (hq5) obj3;
                int intValue16 = ((Integer) obj4).intValue();
                ((androidx.compose.foundation.lazy.a) obj).getClass();
                if ((intValue16 & 48) == 0) {
                    intValue16 |= ((oq5) hq5Var11).d(intValue15) ? 32 : 16;
                }
                oq5 oq5Var16 = (oq5) hq5Var11;
                if (oq5Var16.P(intValue16 & 1, (intValue16 & 145) != 144)) {
                    eti etiVar = (eti) lvfVar.c(intValue15);
                    if (etiVar == null) {
                        return Unit.a;
                    }
                    asq.e(etiVar, intValue15, ltiVar.d, o70.RecentlyPlayed, a.a(vci.a, "my_shelf_recently_played_item"), oq5Var16, (intValue16 & 112) | 27648);
                } else {
                    oq5Var16.S();
                }
                return Unit.a;
            case 12:
                o2j o2jVar = (o2j) this.b;
                ynn ynnVar6 = (ynn) this.c;
                int intValue17 = ((Integer) obj).intValue();
                t2j t2jVar = (t2j) obj2;
                hq5 hq5Var12 = (hq5) obj3;
                int intValue18 = ((Integer) obj4).intValue();
                t2jVar.getClass();
                if ((intValue18 & 6) == 0) {
                    i9 = (((oq5) hq5Var12).d(intValue17) ? 4 : 2) | intValue18;
                } else {
                    i9 = intValue18;
                }
                if ((intValue18 & 48) == 0) {
                    i9 |= ((oq5) hq5Var12).f(t2jVar) ? 32 : 16;
                }
                oq5 oq5Var17 = (oq5) hq5Var12;
                if (oq5Var17.P(i9 & 1, (i9 & 147) != 146)) {
                    int i25 = ((i9 >> 3) & 14) | ((i9 << 3) & 112);
                    Object obj6 = gq5.a;
                    oq5Var17.Z(801427258);
                    if (((Boolean) oq5Var17.j(koe.a)).booleanValue()) {
                        owuVar = qrm.a;
                        oq5Var17.p(false);
                        z2 = false;
                    } else {
                        StationId f5 = StationId.f(t2jVar.a);
                        f5.getClass();
                        String str = t2jVar.b;
                        kxi kxiVar2 = o2jVar.b;
                        l18 l18Var2 = l18.b;
                        bdt I4 = hag.I(k6l.class);
                        qdc qdcVar4 = l18Var2.a;
                        qdcVar4.getClass();
                        k6l k6lVar2 = (k6l) qdcVar4.C(I4);
                        boolean h20 = ((((i25 & 112) ^ 48) > 32 && oq5Var17.d(intValue17)) || (i25 & 48) == 32) | oq5Var17.h(o2jVar) | ((((i25 & 14) ^ 6) > 4 && oq5Var17.f(t2jVar)) || (i25 & 6) == 4);
                        Object K23 = oq5Var17.K();
                        if (h20 || K23 == obj6) {
                            K23 = new de(o2jVar, t2jVar, intValue17, 28);
                            oq5Var17.k0(K23);
                        }
                        Function0 function04 = (Function0) K23;
                        str.getClass();
                        kxiVar2.getClass();
                        function04.getClass();
                        Object K24 = oq5Var17.K();
                        if (K24 == obj6) {
                            K24 = gld.R(g.a, oq5Var17);
                            oq5Var17.k0(K24);
                        }
                        mm6 mm6Var = (mm6) K24;
                        boolean f6 = oq5Var17.f(str) | oq5Var17.f(f5) | oq5Var17.f(null) | oq5Var17.f(null);
                        Object K25 = oq5Var17.K();
                        if (f6 || K25 == obj6) {
                            Object swuVar = new swu(f5, str, kxiVar2, function04, k6lVar2, mm6Var);
                            oq5Var17.k0(swuVar);
                            K25 = swuVar;
                        }
                        owuVar = (owu) K25;
                        z2 = false;
                        oq5Var17.p(false);
                    }
                    owu owuVar2 = owuVar;
                    String str2 = t2jVar.b;
                    s2j s2jVar = t2jVar.d;
                    d85 d85Var = s2jVar.a;
                    lnu lnuVar = new lnu(str2, null, d85Var != null ? d85Var.a : d85.n, null, t2jVar.c, null, null, s2jVar.b, 104);
                    vci vciVar4 = vci.a;
                    boolean h21 = oq5Var17.h(o2jVar) | ((i9 & 112) == 32 ? true : z2) | ((i9 & 14) == 4 ? true : z2);
                    Object K26 = oq5Var17.K();
                    if (h21 || K26 == obj6) {
                        K26 = new gva(o2jVar, t2jVar, intValue17, 20);
                        oq5Var17.k0(K26);
                    }
                    a4g.o(lnuVar, owuVar2, b.b(a.a(com.yandex.music.core.ui.compose.a.b(vciVar4, ynnVar6, 0L, 0.0f, null, (Function2) K26, 14), "neuromusic_block_station_item"), intValue17), 0.0f, oq5Var17, 0, 8);
                } else {
                    oq5Var17.S();
                }
                return Unit.a;
            case 13:
                return a(obj, obj2, obj3, obj4);
            case 14:
                return d(obj, obj2, obj3, obj4);
            case 15:
                return g(obj, obj2, obj3, obj4);
            case 16:
                List list3 = (List) this.b;
                aqi aqiVar = (aqi) this.c;
                int intValue19 = ((Integer) obj2).intValue();
                hq5 hq5Var13 = (hq5) obj3;
                int intValue20 = ((Integer) obj4).intValue();
                ((androidx.compose.foundation.lazy.a) obj).getClass();
                if ((intValue20 & 48) == 0) {
                    intValue20 |= ((oq5) hq5Var13).d(intValue19) ? 32 : 16;
                }
                oq5 oq5Var18 = (oq5) hq5Var13;
                if (oq5Var18.P(intValue20 & 1, (intValue20 & 145) != 144)) {
                    int intValue21 = ((Number) list3.get(intValue19 % list3.size())).intValue();
                    boolean z5 = intValue19 % 2 == 1;
                    Object K27 = oq5Var18.K();
                    if (K27 == gq5.a) {
                        K27 = new jc(aqiVar, 18);
                        oq5Var18.k0(K27);
                    }
                    a0g.j(intValue21, 384, oq5Var18, (Function0) K27, z5);
                } else {
                    oq5Var18.S();
                }
                return Unit.a;
            case 17:
                return h(obj, obj2, obj3, obj4);
            case 18:
                return j(obj, obj2, obj3, obj4);
            case 19:
                return k(obj, obj2, obj3, obj4);
            case 20:
                return l(obj, obj2, obj3, obj4);
            case 21:
                return m(obj, obj2, obj3, obj4);
            case 22:
                return n(obj, obj2, obj3, obj4);
            case 23:
                return o(obj, obj2, obj3, obj4);
            case 24:
                return p(obj, obj2, obj3, obj4);
            case 25:
                return q(obj, obj2, obj3, obj4);
            case 26:
                return r(obj, obj2, obj3, obj4);
            case 27:
                return s(obj, obj2, obj3, obj4);
            default:
                x97.y((tf6) this.b, null, null, new kuw((fuw) this.c, (enj) obj2, ((Float) obj3).floatValue(), (enj) obj, ((Long) obj4).longValue(), null), 3);
                return Unit.a;
        }
    }

    public /* synthetic */ jv(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }
}
