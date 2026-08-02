package defpackage;

import android.content.SharedPreferences;
import androidx.compose.ui.layout.a;
import androidx.compose.ui.platform.AndroidComposeView;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class lf0 extends uif implements Function2 {
    public final /* synthetic */ int r;
    public final /* synthetic */ Object s;
    public final /* synthetic */ Object t;
    public final /* synthetic */ Object u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lf0(Map map, Function2 function2, jx7 jx7Var) {
        super(2);
        this.r = 9;
        this.s = map;
        this.u = function2;
        this.t = jx7Var;
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, java.util.Map] */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.r;
        int i2 = 1;
        Object obj3 = this.u;
        Object obj4 = this.t;
        ?? r6 = this.s;
        switch (i) {
            case 0:
                hq5 hq5Var = (hq5) obj;
                int intValue = ((Number) obj2).intValue();
                oq5 oq5Var = (oq5) hq5Var;
                if (oq5Var.P(intValue & 1, (intValue & 3) != 2)) {
                    es5.a((AndroidComposeView) r6, (ej0) obj4, (Function2) obj3, oq5Var, 0);
                } else {
                    oq5Var.S();
                }
                return Unit.a;
            case 1:
                hq5 hq5Var2 = (hq5) obj;
                int intValue2 = ((Number) obj2).intValue();
                oq5 oq5Var2 = (oq5) hq5Var2;
                if (oq5Var2.P(intValue2 & 1, (intValue2 & 3) != 2)) {
                    etn.l(mb6.a.a(Float.valueOf(d85.d(((d85) ((aqi) r6).getValue()).a))), ild.C(-1699085201, new gl3(i2, (pyc) obj3, (o0k) obj4), oq5Var2), oq5Var2, 56);
                } else {
                    oq5Var2.S();
                }
                return Unit.a;
            case 2:
                ((Number) obj2).intValue();
                es5.a((uzj) r6, (ej0) obj4, (Function2) obj3, (hq5) obj, rvf.R(1));
                return Unit.a;
            case 3:
                ((Number) obj2).intValue();
                j66.k((yci) r6, (qbs) obj4, (wn5) obj3, (hq5) obj, rvf.R(385));
                return Unit.a;
            case 4:
                hq5 hq5Var3 = (hq5) obj;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var3 = (oq5) hq5Var3;
                    if (oq5Var3.z()) {
                        oq5Var3.S();
                        return Unit.a;
                    }
                }
                cfs.a(false, (wbl) r6, ild.s(hq5Var3, -1642474985, new s30(19, (yci) obj4, (sdr) obj3)), hq5Var3, 384);
                return Unit.a;
            case 5:
                String str = (String) obj;
                String str2 = (String) obj2;
                str.getClass();
                str2.getClass();
                Set<String> stringSet = ((sk2) ((ix6) r6).b).a.getStringSet(str2, new LinkedHashSet());
                stringSet.getClass();
                LinkedHashSet z0 = CollectionsKt.z0(stringSet);
                if (!z0.contains(str)) {
                    ((tqn) obj4).a = true;
                    z0.add(str);
                    ((SharedPreferences.Editor) ((sld) obj3).b).putStringSet(str2, z0);
                }
                return Unit.a;
            case 6:
                ((Number) obj2).intValue();
                hag.b((qe7) r6, (jag) obj4, (yci) obj3, (hq5) obj, rvf.R(1));
                return Unit.a;
            case 7:
                List list = (List) obj;
                list.getClass();
                ((AtomicReference) r6).set(list);
                ((AtomicReference) obj4).set((Exception) obj2);
                ((CountDownLatch) obj3).countDown();
                return Unit.a;
            case 8:
                float floatValue = ((Number) obj).floatValue();
                ((Number) obj2).floatValue();
                uqn uqnVar = (uqn) r6;
                iyo iyoVar = (iyo) obj4;
                long g = iyoVar.g(iyoVar.c(floatValue - uqnVar.a));
                iyo iyoVar2 = ((hyo) obj3).a;
                uqnVar.a += iyoVar.c(iyoVar.f(iyo.a(iyoVar2, iyoVar2.j, g, 1)));
                return Unit.a;
            case 9:
                float floatValue2 = ((Number) obj).floatValue();
                float floatValue3 = ((Number) obj2).floatValue();
                ((ctc) ((Function2) obj3).invoke(uah.c(Float.valueOf(floatValue2), r6), uah.c(Float.valueOf(floatValue3), r6))).getClass();
                return Float.valueOf(fxf.I(floatValue2, floatValue3, 0.6f));
            default:
                hq5 hq5Var4 = (hq5) obj;
                int intValue3 = ((Number) obj2).intValue();
                oq5 oq5Var4 = (oq5) hq5Var4;
                if (oq5Var4.P(intValue3 & 1, (intValue3 & 3) != 2)) {
                    yci c = a.c(vci.a, "border");
                    float f = lyj.a;
                    yci c2 = androidx.compose.ui.draw.a.c(c, new ol6(((nmq) ((aqi) r6).getValue()).a, (o0k) obj4));
                    wn5 wn5Var = (wn5) obj3;
                    kfh d = ug3.d(b2c.b, true);
                    int i3 = oq5Var4.P;
                    androidx.compose.runtime.internal.a l = oq5Var4.l();
                    yci H = vnj.H(oq5Var4, c2);
                    xp5.T.getClass();
                    grb grbVar = wp5.b;
                    oq5Var4.d0();
                    if (oq5Var4.O) {
                        oq5Var4.k(grbVar);
                    } else {
                        oq5Var4.n0();
                    }
                    g0g.U(oq5Var4, d, wp5.f);
                    g0g.U(oq5Var4, l, wp5.e);
                    kb5 kb5Var = wp5.g;
                    if (oq5Var4.O || !Intrinsics.d(oq5Var4.K(), Integer.valueOf(i3))) {
                        ouj.x(i3, oq5Var4, i3, kb5Var);
                    }
                    g0g.U(oq5Var4, H, wp5.d);
                    oq5Var4.Z(-392406993);
                    wn5Var.invoke(oq5Var4, 0);
                    oq5Var4.p(false);
                    oq5Var4.p(true);
                } else {
                    oq5Var4.S();
                }
                return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lf0(Object obj, Object obj2, Object obj3, int i, int i2) {
        super(2);
        this.r = i2;
        this.s = obj;
        this.t = obj2;
        this.u = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lf0(int i, Object obj, Object obj2, Object obj3) {
        super(2);
        this.r = i;
        this.s = obj;
        this.t = obj2;
        this.u = obj3;
    }
}
