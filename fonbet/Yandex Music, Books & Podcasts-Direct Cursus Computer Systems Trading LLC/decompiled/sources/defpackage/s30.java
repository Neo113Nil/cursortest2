package defpackage;

import android.content.SharedPreferences;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.RemoteViews;
import androidx.compose.foundation.layout.c;
import androidx.compose.foundation.layout.d;
import androidx.compose.ui.layout.a;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.connectsdk.service.DeviceService;
import com.yandex.pulse.metrics.o;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class s30 extends uif implements Function2 {
    public final /* synthetic */ int r;
    public final /* synthetic */ Object s;
    public final /* synthetic */ Object t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public s30(df6 df6Var, Function1 function1) {
        super(2);
        this.r = 17;
        this.s = df6Var;
        this.t = (uif) function1;
    }

    /* JADX WARN: Type inference failed for: r12v17, types: [kotlin.jvm.functions.Function1, uif] */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.r;
        vci vciVar = vci.a;
        Object obj3 = this.t;
        Object obj4 = this.s;
        switch (i) {
            case 0:
                ((Number) obj2).intValue();
                z30.a((Function2) obj4, (Function2) obj3, (hq5) obj, rvf.R(7));
                return Unit.a;
            case 1:
                float floatValue = ((Number) obj).floatValue();
                float floatValue2 = ((Number) obj2).floatValue();
                ia0 ia0Var = ((ba0) obj4).a;
                ((t6k) ia0Var.l).h(floatValue);
                ((t6k) ia0Var.m).h(floatValue2);
                ((uqn) obj3).a = floatValue;
                return Unit.a;
            case 2:
                float floatValue3 = ((Number) obj).floatValue();
                float floatValue4 = ((Number) obj2).floatValue();
                ka0 ka0Var = ((da0) obj4).a;
                ka0Var.j.h(floatValue3);
                ka0Var.k.h(floatValue4);
                ((uqn) obj3).a = floatValue3;
                return Unit.a;
            case 3:
                ((Number) obj2).intValue();
                AndroidCompositionLocals_androidKt.a((AndroidComposeView) obj3, (Function2) obj4, (hq5) obj, rvf.R(1));
                return Unit.a;
            case 4:
                int intValue = ((Number) obj).intValue();
                qfp qfpVar = (qfp) obj2;
                tf0 tf0Var = (tf0) obj3;
                if (!((rfp) obj4).b.b(qfpVar.g)) {
                    tf0Var.k(intValue, qfpVar);
                    tf0Var.h.c(Unit.a);
                }
                return Unit.a;
            case 5:
                hq5 hq5Var = (hq5) obj;
                int intValue2 = ((Number) obj2).intValue();
                jhm jhmVar = (jhm) obj4;
                oq5 oq5Var = (oq5) hq5Var;
                if (oq5Var.P(intValue2 & 1, (intValue2 & 3) != 2)) {
                    yci b = nfp.b(vciVar, false, d5.G);
                    boolean h = oq5Var.h(jhmVar);
                    Object K = oq5Var.K();
                    if (h || K == gq5.a) {
                        K = new xh0(jhmVar, 1);
                        oq5Var.k0(K);
                    }
                    yci z = xv.z(a.f(b, (Function1) K), jhmVar.getCanCalculatePosition() ? 1.0f : 0.0f);
                    Function2 function2 = (Function2) ((aqi) obj3).getValue();
                    r30 r30Var = r30.d;
                    int i2 = oq5Var.P;
                    androidx.compose.runtime.internal.a l = oq5Var.l();
                    yci H = vnj.H(oq5Var, z);
                    xp5.T.getClass();
                    grb grbVar = wp5.b;
                    oq5Var.d0();
                    if (oq5Var.O) {
                        oq5Var.k(grbVar);
                    } else {
                        oq5Var.n0();
                    }
                    g0g.U(oq5Var, r30Var, wp5.f);
                    g0g.U(oq5Var, l, wp5.e);
                    kb5 kb5Var = wp5.g;
                    if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i2))) {
                        ouj.x(i2, oq5Var, i2, kb5Var);
                    }
                    g0g.U(oq5Var, H, wp5.d);
                    function2.invoke(oq5Var, 0);
                    oq5Var.p(true);
                } else {
                    oq5Var.S();
                }
                return Unit.a;
            case 6:
                ((Number) obj2).intValue();
                ild.a((RemoteViews) obj4, (ukd) obj3, (hq5) obj, 1);
                return Unit.a;
            case 7:
                View view = (View) obj;
                MotionEvent motionEvent = (MotionEvent) obj2;
                Function2 function22 = (Function2) obj4;
                if (function22 != null) {
                    function22.invoke(view, motionEvent);
                }
                GestureDetector gestureDetector = (GestureDetector) obj3;
                return Boolean.valueOf(gestureDetector != null ? gestureDetector.onTouchEvent(motionEvent) : false);
            case 8:
                ft7 ft7Var = (ft7) obj;
                String str = (String) obj2;
                ft7Var.getClass();
                str.getClass();
                ((ipo) obj4).c(ft7Var, str);
                g0c g0cVar = ((j03) obj3).g;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                r1f r1fVar = r1f.a;
                vtm k = su4.k("Обработка СБП-url", linkedHashMap, DeviceService.KEY_DESC, linkedHashMap);
                ci0 ci0Var = qjb.a;
                ci0Var.a = su4.g(1, ci0Var.a);
                k.u(qee.n() + ci0Var.a, "eventus_id");
                ((x60) g0cVar).a(su4.j(k, "event_name", "process_sbp_form_url", "process_sbp_form_url", k));
                return Unit.a;
            case 9:
                hq5 hq5Var2 = (hq5) obj;
                int intValue3 = ((Number) obj2).intValue();
                oq5 oq5Var2 = (oq5) hq5Var2;
                if (oq5Var2.P(intValue3 & 1, (intValue3 & 3) != 2)) {
                    ((wn5) obj4).invoke((c) obj3, oq5Var2, 0);
                } else {
                    oq5Var2.S();
                }
                return Unit.a;
            case 10:
                dnr dnrVar = (dnr) obj;
                long j = ((ga6) obj2).a;
                return ((kfh) obj4).b(dnrVar, dnrVar.i(Unit.a, new wn5(new s30(9, (wn5) obj3, new c(dnrVar, j)), -1945019079, true)), j);
            case 11:
                hq5 hq5Var3 = (hq5) obj;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var3 = (oq5) hq5Var3;
                    if (oq5Var3.z()) {
                        oq5Var3.S();
                        return Unit.a;
                    }
                }
                yci l2 = androidx.compose.foundation.layout.a.l(d.a(vciVar, al3.c, al3.d), (o0k) obj4);
                wn5 wn5Var = (wn5) obj3;
                nho a = lho.a(qx0.e, b2c.l, hq5Var3, 54);
                oq5 oq5Var4 = (oq5) hq5Var3;
                int i3 = oq5Var4.P;
                androidx.compose.runtime.internal.a l3 = oq5Var4.l();
                yci H2 = vnj.H(hq5Var3, l2);
                xp5.T.getClass();
                grb grbVar2 = wp5.b;
                oq5Var4.d0();
                if (oq5Var4.O) {
                    oq5Var4.k(grbVar2);
                } else {
                    oq5Var4.n0();
                }
                g0g.U(hq5Var3, a, wp5.f);
                g0g.U(hq5Var3, l3, wp5.e);
                kb5 kb5Var2 = wp5.g;
                if (oq5Var4.O || !Intrinsics.d(oq5Var4.K(), Integer.valueOf(i3))) {
                    ouj.x(i3, oq5Var4, i3, kb5Var2);
                }
                g0g.U(hq5Var3, H2, wp5.d);
                wn5Var.invoke(qho.a, hq5Var3, 6);
                oq5Var4.p(true);
                return Unit.a;
            case 12:
                jw3 jw3Var = (jw3) obj;
                jw3 jw3Var2 = (jw3) obj2;
                jw3Var.getClass();
                jw3Var2.getClass();
                xw3 xw3Var = (xw3) obj4;
                nw3 nw3Var = xw3Var.c;
                if (nw3Var == null) {
                    Intrinsics.j("cardInputMode");
                    throw null;
                }
                if (nw3Var == nw3.b && jw3Var2 != jw3Var && jw3Var2 == jw3.c && jw3Var == jw3.b) {
                    g0c g0cVar2 = xw3Var.d;
                    if (g0cVar2 == null) {
                        Intrinsics.j("eventReporter");
                        throw null;
                    }
                    ((x60) g0cVar2).a(gut.c0(qgg.I(xw3Var.getMode())));
                }
                Function1 function1 = (Function1) obj3;
                if (function1 != null) {
                    function1.invoke(jw3Var2);
                }
                return Unit.a;
            case 13:
                ((Number) obj2).intValue();
                jf0.i((ukd) obj4, (b95) obj3, (hq5) obj, 1);
                return Unit.a;
            case 14:
                hq5 hq5Var4 = (hq5) obj;
                int intValue4 = ((Number) obj2).intValue();
                oq5 oq5Var5 = (oq5) hq5Var4;
                if (oq5Var5.P(intValue4 & 1, (intValue4 & 3) != 2)) {
                    ((jfi) obj4).a.invoke(obj3, oq5Var5, 0);
                } else {
                    oq5Var5.S();
                }
                return Unit.a;
            case 15:
                ((Number) obj2).intValue();
                ((if6) obj4).a((df6) obj3, (hq5) obj, rvf.R(1));
                return Unit.a;
            case 16:
                ((Number) obj2).intValue();
                pf6.a((df6) obj4, (wn5) obj3, (hq5) obj, rvf.R(385));
                return Unit.a;
            case 17:
                hq5 hq5Var5 = (hq5) obj;
                int intValue5 = ((Number) obj2).intValue();
                oq5 oq5Var6 = (oq5) hq5Var5;
                if (oq5Var6.P(intValue5 & 1, (intValue5 & 3) != 2)) {
                    df6 df6Var = (df6) obj4;
                    pf6.a(df6Var, ild.C(1156688164, new yl0(df6Var, (Function1) obj3), oq5Var6), oq5Var6, 384);
                } else {
                    oq5Var6.S();
                }
                return Unit.a;
            case 18:
                jw3 jw3Var3 = (jw3) obj;
                jw3 jw3Var4 = (jw3) obj2;
                jw3Var3.getClass();
                jw3Var4.getClass();
                k17 k17Var = (k17) obj4;
                nw3 nw3Var2 = k17Var.c;
                if (nw3Var2 == null) {
                    Intrinsics.j("cardInputMode");
                    throw null;
                }
                if (nw3Var2 == nw3.b && jw3Var4 != jw3Var3 && jw3Var4 == jw3.c && jw3Var3 == jw3.b) {
                    g0c g0cVar3 = k17Var.d;
                    if (g0cVar3 == null) {
                        Intrinsics.j("eventReporter");
                        throw null;
                    }
                    ((x60) g0cVar3).a(gut.c0(qgg.I(k17Var.getMode())));
                }
                Function1 function12 = k17Var.f;
                if (function12 != null) {
                    function12.invoke(jw3Var4);
                }
                Function1 function13 = (Function1) obj3;
                if (function13 != null) {
                    function13.invoke(jw3Var4);
                }
                return Unit.a;
            case 19:
                hq5 hq5Var6 = (hq5) obj;
                yci yciVar = (yci) obj4;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var7 = (oq5) hq5Var6;
                    if (oq5Var7.z()) {
                        oq5Var7.S();
                        return Unit.a;
                    }
                }
                yci g = androidx.compose.foundation.layout.a.g(d.d(yciVar, 1.0f), hxe.a);
                oq5 oq5Var8 = (oq5) hq5Var6;
                oq5Var8.a0(1636734315);
                g95 g95Var = (g95) oq5Var8.j(cfs.a);
                oq5Var8.p(false);
                yci b2 = androidx.compose.foundation.a.b(g, g95Var.c, ugo.a(16));
                iz2 iz2Var = b2c.f;
                sdr sdrVar = (sdr) obj3;
                oq5Var8.a0(733328855);
                wg3 e = ug3.e(iz2Var, false, oq5Var8, 6);
                oq5Var8.a0(-1323940314);
                int i4 = oq5Var8.P;
                androidx.compose.runtime.internal.a l4 = oq5Var8.l();
                xp5.T.getClass();
                grb grbVar3 = wp5.b;
                wn5 A = ghh.A(b2);
                oq5Var8.d0();
                if (oq5Var8.O) {
                    oq5Var8.k(grbVar3);
                } else {
                    oq5Var8.n0();
                }
                kb5 kb5Var3 = wp5.f;
                g0g.U(oq5Var8, e, kb5Var3);
                kb5 kb5Var4 = wp5.e;
                g0g.U(oq5Var8, l4, kb5Var4);
                kb5 kb5Var5 = wp5.g;
                if (oq5Var8.O || !Intrinsics.d(oq5Var8.K(), Integer.valueOf(i4))) {
                    ouj.x(i4, oq5Var8, i4, kb5Var5);
                }
                A.invoke(new lrq(oq5Var8), oq5Var8, 0);
                oq5Var8.a0(2058660585);
                yci m = androidx.compose.foundation.layout.a.m(yciVar, 4);
                oq5Var8.a0(-483455358);
                ta5 a2 = sa5.a(qx0.c, b2c.n, oq5Var8, 0);
                oq5Var8.a0(-1323940314);
                int i5 = oq5Var8.P;
                androidx.compose.runtime.internal.a l5 = oq5Var8.l();
                wn5 A2 = ghh.A(m);
                oq5Var8.d0();
                if (oq5Var8.O) {
                    oq5Var8.k(grbVar3);
                } else {
                    oq5Var8.n0();
                }
                g0g.U(oq5Var8, a2, kb5Var3);
                g0g.U(oq5Var8, l5, kb5Var4);
                if (oq5Var8.O || !Intrinsics.d(oq5Var8.K(), Integer.valueOf(i5))) {
                    ouj.x(i5, oq5Var8, i5, kb5Var5);
                }
                A2.invoke(new lrq(oq5Var8), oq5Var8, 0);
                oq5Var8.a0(2058660585);
                qs5 qs5Var = lf7.a;
                lf7.i(6, oq5Var8, yciVar, ((qe7) sdrVar.getValue()).a);
                lf7.c(((qe7) sdrVar.getValue()).b, ((qe7) sdrVar.getValue()).i, ((qe7) sdrVar.getValue()).z, yciVar, oq5Var8, 6);
                lf7.g(((qe7) sdrVar.getValue()).c, ((qe7) sdrVar.getValue()).d, ((qe7) sdrVar.getValue()).z, yciVar, oq5Var8, 6);
                lf7.e(((qe7) sdrVar.getValue()).e, ((qe7) sdrVar.getValue()).z, yciVar, oq5Var8, 6);
                lf7.h(((qe7) sdrVar.getValue()).f, yciVar, oq5Var8, 6);
                lf7.f(((qe7) sdrVar.getValue()).g, ((qe7) sdrVar.getValue()).h, ((qe7) sdrVar.getValue()).j, ((qe7) sdrVar.getValue()).z, yciVar, oq5Var8, 6);
                oq5Var8.a0(-618953414);
                if (!((qe7) sdrVar.getValue()).z) {
                    lf7.d((qe7) sdrVar.getValue(), yciVar, oq5Var8, 0);
                }
                k5r.s(oq5Var8, false, false, true, false);
                k5r.s(oq5Var8, false, false, true, false);
                oq5Var8.p(false);
                return Unit.a;
            case 20:
                s7w s7wVar = (s7w) obj;
                String str2 = (String) obj2;
                SharedPreferences.Editor editor = (SharedPreferences.Editor) ((sld) obj3).b;
                s7wVar.getClass();
                str2.getClass();
                s7w s7wVar2 = (s7w) ((LinkedHashMap) obj4).get(str2);
                if (s7wVar2 == null) {
                    s7wVar2 = new s7w();
                }
                Set set = s7wVar.a;
                LinkedHashSet z0 = CollectionsKt.z0(u1g.F(CollectionsKt.y0(set), new m40(22, s7wVar2)));
                if (z0.size() == 0) {
                    editor.remove(str2);
                } else if (z0.size() < set.size()) {
                    editor.putStringSet(str2, z0);
                }
                return Unit.a;
            case 21:
                long j2 = ((enj) obj2).a;
                ezf.r((x8a) obj4, (lfm) obj);
                zi3 zi3Var = ((hoa) obj3).u;
                if (zi3Var != null) {
                    zi3Var.c(new wma(j2));
                }
                return Unit.a;
            case 22:
                ((Number) obj2).intValue();
                vwb.r((Integer) obj4, (yci) obj3, (hq5) obj, rvf.R(1));
                return Unit.a;
            case 23:
                Map map = (Map) obj;
                String str3 = (String) obj2;
                map.getClass();
                str3.getClass();
                if (((s7w) obj4).a.contains(str3)) {
                    ((ArrayList) obj3).add(map);
                }
                return Unit.a;
            case 24:
                s7w s7wVar3 = (s7w) obj;
                String str4 = (String) obj2;
                s7wVar3.getClass();
                str4.getClass();
                my0 my0Var = new my0();
                kma kmaVar = new kma(10, my0Var);
                Iterator it = s7wVar3.a.iterator();
                while (it.hasNext()) {
                    kmaVar.invoke(it.next());
                }
                y7o C = ((ozw) ((n7b) obj4).a).C(my0Var);
                if (C.c()) {
                    ((LinkedHashMap) obj3).put(str4, C.a());
                }
                return Unit.a;
            case 25:
                String str5 = (String) obj2;
                es6 es6Var = (es6) obj4;
                obj.getClass();
                str5.getClass();
                if (obj instanceof String) {
                    y7o j3 = ((ozw) ((n7b) es6Var.b).a).j((String) obj);
                    if (j3.c()) {
                        q1f q1fVar = (q1f) j3.a();
                        q1f q1fVar2 = q1fVar instanceof z9h ? (q1f) ((z9h) q1fVar).b.get(Constants.KEY_VALUE) : null;
                        if (q1fVar2 != null) {
                            ((LinkedHashMap) obj3).put(str5, q1fVar2);
                        } else {
                            LinkedHashMap linkedHashMap2 = sqg.a;
                            uwf.l("Couldn't deserialize value for flag \"" + str5 + "\":\n" + bkp.S((q1f) j3.a()));
                        }
                    } else {
                        LinkedHashMap linkedHashMap3 = sqg.a;
                        r7w r7wVar = j3.b;
                        up6.D(r7wVar);
                        uwf.l("Couldn't deserialize value for flag \"" + str5 + "\":\n" + r7wVar.getMessage());
                    }
                }
                return Unit.a;
            case 26:
                ((Number) obj2).intValue();
                bg3.g((fxa) obj4, (wn5) obj3, (hq5) obj, 49);
                return Unit.a;
            case 27:
                fyd fydVar = (fyd) obj;
                fyd fydVar2 = (fyd) obj2;
                fydVar.getClass();
                fydVar2.getClass();
                hiu hiuVar = (hiu) obj3;
                if (((pfg) obj4) == pfg.b) {
                    fydVar.a = hiuVar;
                    if (hiuVar != null) {
                        fydVar.b.a(hiuVar);
                    }
                } else {
                    fydVar2.a = hiuVar;
                    if (hiuVar != null) {
                        fydVar2.b.a(hiuVar);
                    }
                }
                return Unit.a;
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                hq5 hq5Var7 = (hq5) obj;
                int intValue6 = ((Number) obj2).intValue();
                oq5 oq5Var9 = (oq5) hq5Var7;
                if (oq5Var9.P(intValue6 & 1, (intValue6 & 3) != 2)) {
                    Boolean bool = (Boolean) ((spf) obj3).f.getValue();
                    boolean booleanValue = bool.booleanValue();
                    Function2 function23 = (Function2) obj4;
                    oq5Var9.c0(bool);
                    boolean g2 = oq5Var9.g(booleanValue);
                    if (booleanValue) {
                        function23.invoke(oq5Var9, 0);
                    } else {
                        if (oq5Var9.k != 0) {
                            pq5.c("No nodes can be emitted before calling dactivateToEndGroup");
                        }
                        if (!oq5Var9.O) {
                            if (g2) {
                                exq exqVar = oq5Var9.F;
                                int i6 = exqVar.g;
                                int i7 = exqVar.h;
                                iq5 iq5Var = oq5Var9.L;
                                iq5Var.getClass();
                                iq5Var.d(false);
                                iq5Var.b.a.G0(ktj.d);
                                pq5.a(i6, i7, oq5Var9.r);
                                oq5Var9.F.r();
                            } else {
                                oq5Var9.R();
                            }
                        }
                    }
                    if (oq5Var9.x && oq5Var9.F.i == oq5Var9.y) {
                        oq5Var9.y = -1;
                        oq5Var9.x = false;
                    }
                    oq5Var9.p(false);
                } else {
                    oq5Var9.S();
                }
                return Unit.a;
            default:
                jx7 jx7Var = (jx7) obj;
                long j4 = ((ga6) obj2).a;
                if (ga6.i(j4) == Integer.MAX_VALUE) {
                    vme.a("LazyVerticalGrid's width should be bound by parent.");
                }
                int i8 = ga6.i(j4);
                mx0 mx0Var = (mx0) obj3;
                int[] v0 = CollectionsKt.v0(((lpd) obj4).a(jx7Var, i8, jx7Var.L(mx0Var.o())));
                int[] iArr = new int[v0.length];
                mx0Var.w(jx7Var, i8, v0, xof.a, iArr);
                return new jtc(v0, iArr);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s30(int i, Object obj, Object obj2) {
        super(2);
        this.r = i;
        this.s = obj;
        this.t = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s30(spf spfVar, Function2 function2) {
        super(2);
        this.r = 28;
        this.t = spfVar;
        this.s = function2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s30(AndroidComposeView androidComposeView, Function2 function2, int i) {
        super(2);
        this.r = 3;
        this.t = androidComposeView;
        this.s = function2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s30(Object obj, Object obj2, int i, int i2) {
        super(2);
        this.r = i2;
        this.s = obj;
        this.t = obj2;
    }
}
