package defpackage;

import androidx.compose.foundation.layout.d;
import com.yandex.passport.internal.entities.j;
import com.yandex.plus.bdui.m;
import com.yandex.plus.bdui.plus.checkout.div.e;
import com.yandex.plus.bdui.plus.checkout.o;
import com.yandex.plus.bdui.plus.content.controller.l;
import com.yandex.plus.bdui.s;
import com.yandex.plus.log.api.b;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class i11 implements Function2 {
    public final /* synthetic */ int a = 4;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;

    public /* synthetic */ i11(tvd tvdVar, iab iabVar, o8w o8wVar, hab habVar, Function0 function0, gvd gvdVar, pbu pbuVar, Function0 function02, dib dibVar, Function0 function03) {
        qo6 qo6Var = qo6.a;
        this.b = tvdVar;
        this.c = iabVar;
        this.i = o8wVar;
        this.g = habVar;
        this.e = function0;
        this.j = gvdVar;
        this.k = pbuVar;
        this.f = function02;
        this.d = dibVar;
        this.h = function03;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        boolean z2;
        float f;
        int i = this.a;
        vci vciVar = vci.a;
        Object obj3 = this.k;
        Object obj4 = this.j;
        Object obj5 = this.h;
        Object obj6 = this.f;
        Object obj7 = this.e;
        Object obj8 = this.d;
        Object obj9 = this.g;
        Object obj10 = this.i;
        Object obj11 = this.c;
        Object obj12 = this.b;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                vwb.b((k4k) obj12, (lvf) obj11, (mm1) obj10, (tmb) obj9, (dib) obj8, (Function0) obj7, (Function0) obj6, (Function0) obj5, (Function1) obj4, (Function1) obj3, (hq5) obj, rvf.R(4161));
                return Unit.a;
            case 1:
                k4k k4kVar = (k4k) obj12;
                lvf lvfVar = (lvf) obj11;
                dib dibVar = (dib) obj8;
                Function0 function0 = (Function0) obj7;
                Function2 function2 = (Function2) obj10;
                Function2 function22 = (Function2) obj4;
                Function0 function02 = (Function0) obj6;
                ml1 ml1Var = (ml1) obj3;
                tmb tmbVar = (tmb) obj9;
                Function0 function03 = (Function0) obj5;
                hq5 hq5Var = (hq5) obj;
                int intValue = ((Integer) obj2).intValue();
                oq5 oq5Var = (oq5) hq5Var;
                if (oq5Var.P(intValue & 1, (intValue & 3) != 2)) {
                    if (k4kVar.a) {
                        oq5Var.Z(1796854470);
                        int i2 = lvf.f;
                        xl1.d(lvfVar, dibVar, function0, function2, function22, function02, ml1Var, oq5Var, 8);
                        z = false;
                    } else {
                        z = false;
                        oq5Var.Z(1792576253);
                    }
                    oq5Var.p(z);
                    if (Intrinsics.d(k4kVar.b, i4k.a)) {
                        oq5Var.Z(1797322415);
                        z2 = false;
                        pd.g(6, 0, oq5Var, d.x(d.c(vciVar, 1.0f), null, 3));
                    } else {
                        z2 = false;
                        oq5Var.Z(1792576253);
                    }
                    oq5Var.p(z2);
                    if (k4kVar.c) {
                        oq5Var.Z(1797528286);
                        int i3 = lvf.f;
                        xl1.e(tmbVar, lvfVar, function0, function03, oq5Var, 72);
                    } else {
                        oq5Var.Z(1792576253);
                    }
                    oq5Var.p(z2);
                } else {
                    oq5Var.S();
                }
                return Unit.a;
            case 2:
                tvd tvdVar = (tvd) obj12;
                iab iabVar = (iab) obj11;
                o8w o8wVar = (o8w) obj10;
                hab habVar = (hab) obj9;
                Function0 function04 = (Function0) obj7;
                gvd gvdVar = (gvd) obj4;
                qo6 qo6Var = qo6.a;
                pbu pbuVar = (pbu) obj3;
                Function0 function05 = (Function0) obj6;
                dib dibVar2 = (dib) obj8;
                Function0 function06 = (Function0) obj5;
                hq5 hq5Var2 = (hq5) obj;
                int intValue2 = ((Integer) obj2).intValue();
                oq5 oq5Var2 = (oq5) hq5Var2;
                if (oq5Var2.P(intValue2 & 1, (intValue2 & 3) != 2)) {
                    boolean f2 = oq5Var2.f(tvdVar);
                    Object K = oq5Var2.K();
                    kjn kjnVar = gq5.a;
                    if (f2 || K == kjnVar) {
                        K = new nr(tvdVar, 12);
                        oq5Var2.k0(K);
                    }
                    yci s = wyf.s(vciVar, (Function0) K);
                    boolean z3 = iabVar.d.length() > 0;
                    if (o8wVar.b) {
                        oq5Var2.Z(1016035340);
                        f = 114 - 12;
                        oq5Var2.p(false);
                    } else {
                        oq5Var2.Z(1016119412);
                        f = 114;
                        oq5Var2.p(false);
                    }
                    float f3 = f;
                    wn5 C = ild.C(1572952898, new up(s, o8wVar, iabVar, function04, 9), oq5Var2);
                    wn5 C2 = ild.C(-124160081, new pr(iabVar, gvdVar, pbuVar, function05, tvdVar, dibVar2), oq5Var2);
                    wn5 wn5Var = bcx.a;
                    wn5 C3 = ild.C(-925309454, new la3(function06, iabVar, pbuVar, 0), oq5Var2);
                    boolean f4 = oq5Var2.f(tvdVar);
                    Object K2 = oq5Var2.K();
                    if (f4 || K2 == kjnVar) {
                        K2 = new nr(tvdVar, 13);
                        oq5Var2.k0(K2);
                    }
                    wdp.S(C, null, habVar, null, C2, null, wn5Var, C3, null, (Function0) K2, z3, f3, 0.0f, 0.0f, oq5Var2, 14180358, 0, 26922);
                } else {
                    oq5Var2.S();
                }
                return Unit.a;
            case 3:
                ((Integer) obj2).getClass();
                xv.k((wv5) obj12, (tz5) obj11, (rv5) obj10, (gvd) obj9, (tvd) obj5, (hab) obj4, (Function0) obj7, (dib) obj8, (Function0) obj6, (yci) obj3, (hq5) obj, rvf.R(9));
                return Unit.a;
            case 4:
                ((Integer) obj2).getClass();
                r2v.d((aqi) obj12, (sdr) obj11, (sdr) obj10, (sdr) obj9, (Function1) obj4, (Function0) obj7, (Function0) obj6, (Function1) obj3, (yci) obj8, (Function1) obj5, (hq5) obj, rvf.R(3457));
                return Unit.a;
            default:
                dzf dzfVar = (dzf) obj11;
                o oVar = (o) obj10;
                j jVar = (j) obj9;
                e eVar = (e) obj8;
                Map map = (Map) obj7;
                LinkedHashMap linkedHashMap = (LinkedHashMap) obj6;
                com.yandex.plus.bdui.flex.ui.content.d dVar = (com.yandex.plus.bdui.flex.ui.content.d) obj5;
                tf6 tf6Var = (tf6) obj4;
                b bVar = (b) obj3;
                s sVar = (s) obj;
                m mVar = (m) obj2;
                sVar.getClass();
                mVar.getClass();
                List<com.yandex.plus.bdui.plus.handler.d> list = (List) obj12;
                int a = tah.a(v75.o(list, 10));
                if (a < 16) {
                    a = 16;
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(a);
                for (com.yandex.plus.bdui.plus.handler.d dVar2 : list) {
                    linkedHashMap2.put(dVar2.a, dVar2.b.invoke(sVar, mVar));
                }
                return new l(mVar, dzfVar, oVar, jVar, eVar, map, linkedHashMap, linkedHashMap2, dVar, tf6Var, bVar);
        }
    }

    public /* synthetic */ i11(wv5 wv5Var, tz5 tz5Var, rv5 rv5Var, gvd gvdVar, tvd tvdVar, hab habVar, Function0 function0, dib dibVar, Function0 function02, yci yciVar, int i) {
        this.b = wv5Var;
        this.c = tz5Var;
        this.i = rv5Var;
        this.g = gvdVar;
        this.h = tvdVar;
        this.j = habVar;
        this.e = function0;
        this.d = dibVar;
        this.f = function02;
        this.k = yciVar;
    }

    public /* synthetic */ i11(aqi aqiVar, sdr sdrVar, sdr sdrVar2, sdr sdrVar3, Function1 function1, Function0 function0, Function0 function02, Function1 function12, yci yciVar, Function1 function13, int i) {
        this.b = aqiVar;
        this.c = sdrVar;
        this.i = sdrVar2;
        this.g = sdrVar3;
        this.j = function1;
        this.e = function0;
        this.f = function02;
        this.k = function12;
        this.d = yciVar;
        this.h = function13;
    }

    public /* synthetic */ i11(k4k k4kVar, lvf lvfVar, mm1 mm1Var, tmb tmbVar, dib dibVar, Function0 function0, Function0 function02, Function0 function03, Function1 function1, Function1 function12, int i) {
        this.b = k4kVar;
        this.c = lvfVar;
        this.i = mm1Var;
        this.g = tmbVar;
        this.d = dibVar;
        this.e = function0;
        this.f = function02;
        this.h = function03;
        this.j = function1;
        this.k = function12;
    }

    public /* synthetic */ i11(k4k k4kVar, lvf lvfVar, dib dibVar, Function0 function0, Function2 function2, Function2 function22, Function0 function02, ml1 ml1Var, tmb tmbVar, Function0 function03) {
        this.b = k4kVar;
        this.c = lvfVar;
        this.d = dibVar;
        this.e = function0;
        this.i = function2;
        this.j = function22;
        this.f = function02;
        this.k = ml1Var;
        this.g = tmbVar;
        this.h = function03;
    }

    public /* synthetic */ i11(List list, dzf dzfVar, o oVar, j jVar, e eVar, Map map, LinkedHashMap linkedHashMap, com.yandex.plus.bdui.flex.ui.content.d dVar, tf6 tf6Var, b bVar) {
        this.b = list;
        this.c = dzfVar;
        this.i = oVar;
        this.g = jVar;
        this.d = eVar;
        this.e = map;
        this.f = linkedHashMap;
        this.h = dVar;
        this.j = tf6Var;
        this.k = bVar;
    }
}
