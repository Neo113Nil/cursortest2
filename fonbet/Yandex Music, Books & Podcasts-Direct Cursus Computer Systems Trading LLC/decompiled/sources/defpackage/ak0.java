package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.view.View;
import com.connectsdk.service.DeviceService;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;
import ru.yandex.video.m3.data.dto.VideoData;

/* loaded from: classes.dex */
public final class ak0 extends uif implements Function1 {
    public final /* synthetic */ int r;
    public final /* synthetic */ Object s;
    public final /* synthetic */ Object t;
    public final /* synthetic */ Object u;
    public final /* synthetic */ Object v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ak0(ogk ogkVar, String str, awc awcVar, jtc jtcVar) {
        super(1);
        this.r = 22;
        bro[] broVarArr = bro.a;
        this.s = ogkVar;
        this.t = str;
        this.u = awcVar;
        this.v = jtcVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        List list;
        y7o F;
        n1j E;
        Object obj2;
        p6c p6cVar;
        int i = this.r;
        int i2 = 4;
        Object obj3 = this.v;
        Object obj4 = this.u;
        boolean z = false;
        Object obj5 = this.t;
        Object obj6 = this.s;
        switch (i) {
            case 0:
                sm0 sm0Var = (sm0) obj;
                Function1 function1 = (Function1) obj4;
                fk0 fk0Var = (fk0) obj6;
                vm0 vm0Var = fk0Var.c;
                v5g.W(sm0Var, vm0Var);
                x6k x6kVar = sm0Var.e;
                Object d = fk0Var.d(x6kVar.getValue());
                if (!Intrinsics.d(d, x6kVar.getValue())) {
                    vm0Var.b.setValue(d);
                    ((vm0) obj5).b.setValue(d);
                    if (function1 != null) {
                        function1.invoke(fk0Var);
                    }
                    sm0Var.a();
                    ((tqn) obj3).a = true;
                } else if (function1 != null) {
                    function1.invoke(fk0Var);
                }
                break;
            case 1:
                jtc jtcVar = (jtc) obj3;
                oxa oxaVar = (oxa) obj4;
                ihk ihkVar = (ihk) obj;
                ihkVar.getClass();
                String str = ihkVar.c;
                j03 j03Var = (j03) obj6;
                if (str != null) {
                    tbk tbkVar = j03Var.f;
                    String str2 = (String) obj5;
                    str2.getClass();
                    b13 b13Var = new b13(tbkVar.d, tbkVar.a.a, tbkVar.b.a, str, str2);
                    g0c g0cVar = tbkVar.e;
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    r1f r1fVar = r1f.a;
                    vtm k = su4.k("Процесс привязки GooglePay", linkedHashMap, DeviceService.KEY_DESC, linkedHashMap);
                    ci0 ci0Var = qjb.a;
                    ci0Var.a = su4.g(1, ci0Var.a);
                    k.u(qee.n() + ci0Var.a, "eventus_id");
                    qne j = su4.j(k, "event_name", "bind_google_pay", "bind_google_pay", k);
                    t28 t28Var = tbkVar.c;
                    yop b = mif.b(yd5.I("bind_google_pay_token", t28Var.b, new qs6(12, t28Var, b13Var)), kzj.J, null, 5);
                    ((x60) g0cVar).b(j, b);
                    break;
                } else {
                    break;
                }
            case 2:
                jtc jtcVar2 = (jtc) obj3;
                oxa oxaVar2 = (oxa) obj4;
                ihk ihkVar2 = (ihk) obj;
                g3j g3jVar = (g3j) obj5;
                ihkVar2.getClass();
                j03 j03Var2 = (j03) obj6;
                if (j03Var2.p) {
                    n3m n3mVar = new n3m(g3jVar.a, g3jVar.b, g3jVar.c, (String) null, g3jVar.d);
                    hos hosVar = j03Var2.i;
                    z9h z9hVar = j03Var2.q;
                    z9hVar.getClass();
                    break;
                } else {
                    grr grrVar = new grr(j03Var2.a.a, ihkVar2.a, ihkVar2.b, g3jVar.a, g3jVar.b, g3jVar.c, g3jVar.d, g3jVar.e);
                    t28 t28Var2 = j03Var2.d;
                    break;
                }
            case 3:
                axf axfVar = (axf) obj6;
                if (axfVar.b()) {
                    lcs lcsVar = (lcs) obj5;
                    pt0 pt0Var = axfVar.d;
                    nl6 nl6Var = axfVar.v;
                    nl6 nl6Var2 = axfVar.w;
                    xqn xqnVar = new xqn();
                    lma lmaVar = new lma(pt0Var, nl6Var, xqnVar);
                    muk mukVar = lcsVar.a;
                    mukVar.f((ybs) obj4, (ide) obj3, lmaVar, nl6Var2);
                    pcs pcsVar = new pcs(lcsVar, mukVar);
                    lcsVar.b.set(pcsVar);
                    xqnVar.a = pcsVar;
                    axfVar.e = pcsVar;
                }
                break;
            case 4:
                JSONArray jSONArray = (JSONArray) obj;
                int length = jSONArray.length();
                Integer num = (Integer) obj6;
                if (num != null && num.intValue() != length) {
                    if (yhn.m(0, length).q(num.intValue())) {
                        break;
                    } else {
                        ((gc8) obj5).I(new IndexOutOfBoundsException("Index out of bound (" + num + ") for mutation " + ((String) obj4) + " (" + length + ')'));
                        break;
                    }
                } else {
                    break;
                }
                break;
            case 5:
                kxt kxtVar = (kxt) obj;
                sml smlVar = (sml) obj4;
                bm8 bm8Var = (bm8) obj6;
                xzb xzbVar = (xzb) obj5;
                String str3 = (String) bm8Var.a.a(xzbVar);
                Object z2 = ot0.z(bm8Var.b, xzbVar);
                if (kxtVar instanceof zwt) {
                    zwt zwtVar = (zwt) kxtVar;
                    ArrayList v = smlVar.v(str3);
                    if (v != null) {
                        Object d2 = zwtVar.d();
                        d2.getClass();
                        JSONArray jSONArray2 = (JSONArray) d2;
                        dmr a = smlVar.a(new knn(10, jSONArray2), CollectionsKt.M(v));
                        if (a != null && smlVar.A(a, (String) CollectionsKt.Y(v), z2)) {
                            zwtVar.j(jSONArray2);
                            break;
                        }
                    }
                } else if (kxtVar instanceof cxt) {
                    cxt cxtVar = (cxt) kxtVar;
                    ArrayList v2 = smlVar.v(str3);
                    if (v2 != null) {
                        Object d3 = cxtVar.d();
                        d3.getClass();
                        JSONObject jSONObject = (JSONObject) d3;
                        dmr a2 = smlVar.a(new hjp(5, jSONObject), CollectionsKt.M(v2));
                        if (a2 != null && smlVar.A(a2, (String) CollectionsKt.Y(v2), z2)) {
                            cxtVar.j(jSONObject);
                            break;
                        }
                    }
                } else {
                    ((gc8) obj3).I(new RuntimeException("Action requires array or dictionary variable"));
                    break;
                }
                break;
            case 6:
                p89 p89Var = (p89) obj4;
                Rect G = rt8.G((rt8) obj5, (ix8) obj6, p89Var.getResources(), (xzb) obj3);
                int i3 = G.left;
                int i4 = G.top;
                int i5 = G.right;
                int i6 = G.bottom;
                p89Var.p = i3;
                p89Var.q = i5;
                p89Var.n = i4;
                p89Var.o = i6;
                p89Var.requestLayout();
                break;
            case 7:
                xzb xzbVar2 = (xzb) obj5;
                ((v19) obj6).setGravity(vq1.N((om8) ((szb) obj4).a(xzbVar2), (pm8) ((szb) obj3).a(xzbVar2)));
                break;
            case 8:
                xzb xzbVar3 = (xzb) obj4;
                ((d29) obj6).setGravity(vq1.N((om8) ((szb) obj5).a(xzbVar3), (pm8) ((szb) obj3).a(xzbVar3)));
                break;
            case 9:
                oce oceVar = (oce) obj;
                i29 i29Var = (i29) obj3;
                e23 e23Var = (e23) obj4;
                v29 v29Var = (v29) obj5;
                i39 i39Var = (i39) obj6;
                if (!i39Var.o()) {
                    if (oceVar instanceof lce) {
                        v29.I(v29Var, i39Var, e23Var, ((lce) oceVar).a, i29Var);
                    } else if (oceVar instanceof nce) {
                        if (i29Var.P == null && ((list = i29Var.t) == null || list.isEmpty())) {
                            i39Var.p();
                            v29.H(v29Var, i39Var, e23Var.a, ((nce) oceVar).a);
                        } else {
                            v29.I(v29Var, i39Var, e23Var, vq2.N(((nce) oceVar).a, 0, 0, 7), i29Var);
                        }
                    }
                }
                break;
            case 10:
                xzb xzbVar4 = (xzb) obj4;
                rt8.L((j79) obj6, (om8) ((szb) obj5).a(xzbVar4), (pm8) ((szb) obj3).a(xzbVar4));
                break;
            case 11:
                int intValue = ((Number) obj).intValue();
                oi9 oi9Var = (oi9) obj6;
                oi9Var.setText((CharSequence) ((ArrayList) obj5).get(intValue));
                Function1<String, Unit> valueUpdater = oi9Var.getValueUpdater();
                if (valueUpdater != null) {
                    valueUpdater.invoke(((di9) ((ei9) obj4).A.get(intValue)).b.a(((e23) obj3).b));
                }
                break;
            case 12:
                b2s b2sVar = (b2s) obj5;
                DisplayMetrics displayMetrics = (DisplayMetrics) obj3;
                xzb xzbVar5 = (xzb) obj4;
                ix8 ix8Var = (ix8) obj6;
                szb szbVar = ix8Var.e;
                szb szbVar2 = ix8Var.a;
                szb szbVar3 = ix8Var.f;
                szb szbVar4 = ix8Var.b;
                if (szbVar == null && szbVar4 == null) {
                    int w = bg3.w((Long) ix8Var.c.a(xzbVar5), displayMetrics);
                    int w2 = bg3.w((Long) szbVar3.a(xzbVar5), displayMetrics);
                    int w3 = bg3.w((Long) ix8Var.d.a(xzbVar5), displayMetrics);
                    int w4 = bg3.w((Long) szbVar2.a(xzbVar5), displayMetrics);
                    WeakHashMap weakHashMap = wdu.a;
                    b2sVar.setPaddingRelative(w, w2, w3, w4);
                } else {
                    int w5 = bg3.w(szbVar != null ? (Long) szbVar.a(xzbVar5) : null, displayMetrics);
                    int w6 = bg3.w((Long) szbVar3.a(xzbVar5), displayMetrics);
                    int w7 = bg3.w(szbVar4 != null ? (Long) szbVar4.a(xzbVar5) : null, displayMetrics);
                    int w8 = bg3.w((Long) szbVar2.a(xzbVar5), displayMetrics);
                    WeakHashMap weakHashMap2 = wdu.a;
                    b2sVar.setPaddingRelative(w5, w6, w7, w8);
                }
                break;
            case 13:
                xzb xzbVar6 = (xzb) obj3;
                d89 d89Var = (d89) obj6;
                gc8 gc8Var = ((e23) obj5).a;
                xq9 xq9Var = (xq9) obj4;
                szb szbVar5 = xq9Var.L;
                Long l = szbVar5 != null ? (Long) szbVar5.a(xzbVar6) : null;
                szb szbVar6 = xq9Var.M;
                er9.K(d89Var, gc8Var, l, szbVar6 != null ? (Long) szbVar6.a(xzbVar6) : null);
                break;
            case 14:
                pz9 pz9Var = (pz9) obj5;
                xzb xzbVar7 = (xzb) obj4;
                ((se9) obj6).h(lg3.N(pz9Var, xzbVar7), tz9.H((tz9) obj3, pz9Var, xzbVar7));
                break;
            case 15:
                ((oa8) obj).getClass();
                break;
            case 16:
                long j2 = ((enj) obj).a;
                ((aqi) obj6).setValue(Boolean.TRUE);
                joa joaVar = new joa();
                x97.y((mm6) obj5, null, null, new uoa(joaVar, null, 1), 3);
                ((aqi) obj3).setValue(joaVar);
                ((Function1) obj4).invoke(new enj(j2));
                break;
            case 17:
                long longValue = ((Number) obj).longValue();
                mm6 mm6Var = (mm6) obj3;
                uqn uqnVar = (uqn) obj4;
                xje xjeVar = (xje) obj5;
                sdr sdrVar = (sdr) ((aqi) obj6).getValue();
                long longValue2 = sdrVar != null ? ((Number) sdrVar.getValue()).longValue() : longValue;
                long j3 = xjeVar.c;
                eqi eqiVar = xjeVar.a;
                if (j3 == Long.MIN_VALUE || uqnVar.a != v5g.D(mm6Var.getCoroutineContext())) {
                    xjeVar.c = longValue;
                    Object[] objArr = eqiVar.a;
                    int i7 = eqiVar.c;
                    for (int i8 = 0; i8 < i7; i8++) {
                        ((wje) objArr[i8]).g = true;
                    }
                    uqnVar.a = v5g.D(mm6Var.getCoroutineContext());
                }
                float f = uqnVar.a;
                if (f == 0.0f) {
                    Object[] objArr2 = eqiVar.a;
                    int i9 = eqiVar.c;
                    for (int i10 = 0; i10 < i9; i10++) {
                        wje wjeVar = (wje) objArr2[i10];
                        wjeVar.d.setValue(wjeVar.e.c);
                        wjeVar.g = true;
                    }
                } else {
                    long j4 = (long) ((longValue2 - xjeVar.c) / f);
                    Object[] objArr3 = eqiVar.a;
                    int i11 = eqiVar.c;
                    int i12 = 0;
                    boolean z3 = true;
                    while (i12 < i11) {
                        wje wjeVar2 = (wje) objArr3[i12];
                        if (!wjeVar2.f) {
                            wjeVar2.i.b.setValue(Boolean.FALSE);
                            if (wjeVar2.g) {
                                wjeVar2.g = z;
                                wjeVar2.h = j4;
                            }
                            long j5 = j4 - wjeVar2.h;
                            wjeVar2.d.setValue(wjeVar2.e.f(j5));
                            wjeVar2.f = wjeVar2.e.c(j5);
                        }
                        if (!wjeVar2.f) {
                            z3 = false;
                        }
                        i12++;
                        z = false;
                    }
                    xjeVar.d.setValue(Boolean.valueOf(!z3));
                }
                break;
            case 18:
                euf eufVar = (euf) obj6;
                eufVar.c = new sfm((stf) obj5, (cnr) obj4, (smm) obj3);
                break;
            case 19:
                sm0 sm0Var2 = (sm0) obj;
                uqn uqnVar2 = (uqn) obj6;
                float floatValue = ((Number) sm0Var2.e.getValue()).floatValue() - uqnVar2.a;
                if (!cfi.a(floatValue)) {
                    if (!cfi.a(floatValue - d18.a((d18) obj5, (hyo) obj4, floatValue))) {
                        sm0Var2.a();
                        break;
                    } else {
                        uqnVar2.a += floatValue;
                    }
                }
                if (((Boolean) ((ii) obj3).invoke(Float.valueOf(uqnVar2.a))).booleanValue()) {
                    sm0Var2.a();
                }
            case 20:
                yo7 yo7Var = (yo7) obj;
                t1f t1fVar = (t1f) obj6;
                ozw ozwVar = (ozw) t1fVar.c;
                o1j o1jVar = (o1j) t1fVar.d;
                yo7Var.getClass();
                boolean z4 = yo7Var.b;
                xiu xiuVar = yo7Var.c;
                if (z4) {
                    if (xiuVar == null) {
                        break;
                    } else {
                        Function1 function12 = (Function1) obj4;
                        y7o j6 = ozwVar.j(new String((byte[]) ((qxp) xiuVar.c).a, (Charset) xiuVar.b));
                        if (j6.b()) {
                            r7w r7wVar = j6.b;
                            up6.D(r7wVar);
                            F = new y7o(null, o1jVar.f(new n1j(q1c.e, r1c.a, (Integer) null, f1d.g("Unable to deserialize JSON object: ", r7wVar.getMessage()), (String) null, 48)));
                        } else {
                            q1f q1fVar = (q1f) j6.a();
                            n1j z5 = o1jVar.z(q1fVar);
                            if (z5 != null) {
                                F = new y7o(null, o1jVar.f(z5));
                            } else {
                                y7o y7oVar = (y7o) function12.invoke(q1fVar);
                                if (y7oVar.b()) {
                                    r7w r7wVar2 = y7oVar.b;
                                    up6.D(r7wVar2);
                                    F = new y7o(null, o1jVar.f(new n1j(q1c.e, r1c.a, (Integer) null, hrg.r("Unable to parse JSON object: ", bkp.S(q1fVar), ", error: ", r7wVar2.getMessage()), (String) null, 48)));
                                } else {
                                    F = ngg.F(y7oVar.a());
                                }
                            }
                        }
                        break;
                    }
                } else {
                    int i13 = yo7Var.a;
                    if (xiuVar == null) {
                        E = new n1j(q1c.e, r1c.a, Integer.valueOf(i13), dfi.c(i13, "Bad status code: ", ": empty body"), (String) null, 48);
                    } else {
                        String str4 = new String((byte[]) ((qxp) xiuVar.c).a, (Charset) xiuVar.b);
                        y7o j7 = ozwVar.j(str4);
                        if (j7.b()) {
                            r7w r7wVar3 = j7.b;
                            up6.D(r7wVar3);
                            E = new n1j(q1c.e, r1c.a, Integer.valueOf(i13), hrg.p("Bad status code: ", i13, ": ", hrg.s("Failed to parse error body: \"", str4, "\", error: \"", r7wVar3.getMessage(), "\"")), (String) null, 48);
                        } else {
                            q1f q1fVar2 = (q1f) j7.a();
                            E = o1jVar.E(q1fVar2, i13);
                            if (E == null) {
                                E = new n1j(q1c.e, r1c.a, Integer.valueOf(i13), hrg.p("Bad status code: ", i13, ": ", hrg.s("Failed to extract error body: \"", str4, "\", json: \"", bkp.S(q1fVar2), "\"")), (String) null, 48);
                            }
                        }
                    }
                    n1j n1jVar = E;
                    break;
                }
            case 21:
                ((wle) obj).getClass();
                j03 j03Var3 = ((ogk) obj6).a;
                String str5 = (String) obj5;
                n7b n7bVar = (n7b) obj4;
                jtc jtcVar3 = (jtc) obj3;
                g0c g0cVar2 = j03Var3.g;
                boolean z6 = j03Var3.p;
                String concat = "Оплата через Систему Быстрых Платежей с возможностью привязки СБП токена ".concat(z6 ? "через PSP" : "через Trust");
                String str6 = z6 ? "new_sbp_payment_v2" : "new_sbp_payment";
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                r1f r1fVar2 = r1f.a;
                vtm k2 = su4.k(concat, linkedHashMap2, DeviceService.KEY_DESC, linkedHashMap2);
                ci0 ci0Var2 = qjb.a;
                ci0Var2.a = su4.g(1, ci0Var2.a);
                k2.u(qee.n() + ci0Var2.a, "eventus_id");
                qne j8 = su4.j(k2, "event_name", str6, str6, k2);
                yop a3 = mif.a(j03Var3.d(str5), new lj0(i2, j03Var3, n7bVar, jtcVar3), null, 5);
                ((x60) g0cVar2).b(j8, a3);
                break;
            case 22:
                ((wle) obj).getClass();
                j03 j03Var4 = ((ogk) obj6).a;
                bro[] broVarArr = bro.a;
                String str7 = (String) obj5;
                awc awcVar = (awc) obj4;
                jtc jtcVar4 = (jtc) obj3;
                g0c g0cVar3 = j03Var4.g;
                boolean z7 = j03Var4.p;
                String concat2 = "Оплата через Систему Быстрых Платежей ".concat(z7 ? "через PSP" : "через Trust");
                String str8 = z7 ? "sbp_payment_v2" : "sbp_payment";
                LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                r1f r1fVar3 = r1f.a;
                vtm k3 = su4.k(concat2, linkedHashMap3, DeviceService.KEY_DESC, linkedHashMap3);
                ci0 ci0Var3 = qjb.a;
                ci0Var3.a = su4.g(1, ci0Var3.a);
                k3.u(qee.n() + ci0Var3.a, "eventus_id");
                qne j9 = su4.j(k3, "event_name", str8, str8, k3);
                yop a4 = mif.a(j03Var4.d(str7), new lj0(j03Var4, awcVar, jtcVar4), null, 5);
                ((x60) g0cVar3).b(j9, a4);
                break;
            case 23:
                jom jomVar = (jom) obj;
                jomVar.getClass();
                jomVar.e = (String) obj6;
                jomVar.g = (VideoData) obj5;
                jomVar.h = (Long) obj4;
                jomVar.i = (String) obj3;
                break;
            case 24:
                q1f q1fVar3 = (q1f) obj;
                yks yksVar = (yks) obj6;
                q1fVar3.getClass();
                ArrayList arrayList = new ArrayList();
                z9h z9hVar2 = (z9h) q1fVar3;
                List<q1f> l2 = z9hVar2.l("flags");
                String g = z9hVar2.g("exp_boxes");
                if (g == null) {
                    g = "";
                }
                for (q1f q1fVar4 : l2) {
                    q1fVar4.getClass();
                    try {
                        z9h z9hVar3 = (z9h) q1fVar4;
                        p6cVar = new p6c(z9hVar3.o("name"), z9hVar3.o(Constants.KEY_VALUE));
                    } catch (RuntimeException unused) {
                        p6cVar = null;
                    }
                    if (p6cVar != null) {
                        arrayList.add(p6cVar);
                    }
                }
                SharedPreferences sharedPreferences = (SharedPreferences) obj5;
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    p6c p6cVar2 = (p6c) it.next();
                    String str9 = p6cVar2.a;
                    String str10 = p6cVar2.b;
                    Iterator it2 = q6c.H.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            obj2 = it2.next();
                            if (Intrinsics.d(((q6c) obj2).a, str9)) {
                            }
                        } else {
                            obj2 = null;
                        }
                    }
                    q6c q6cVar = (q6c) obj2;
                    if (q6cVar != null ? q6cVar.c : false) {
                        sharedPreferences.edit().putBoolean(str9, Boolean.parseBoolean(str10)).apply();
                    }
                    fhc fhcVar = fhc.b;
                    lc3 lc3Var = ygc.a;
                    fhcVar.a(fgq.F(str9, str10));
                }
                x60 x60Var = (x60) obj4;
                x60Var.getClass();
                x60Var.b.a.put("exp_boxes", g);
                String X = CollectionsKt.X(arrayList, null, null, null, zyt.x0, 31);
                String r = hrg.r("Получение фичефлагов: текущие активные эксперименты = ", g, ", feature_flags_response = ", X);
                LinkedHashMap linkedHashMap4 = new LinkedHashMap();
                r1f r1fVar4 = r1f.a;
                linkedHashMap4.put("exp_boxes", new jkr(g));
                linkedHashMap4.put("feature_flags_response", new jkr(X));
                vtm k4 = su4.k(r, linkedHashMap4, DeviceService.KEY_DESC, linkedHashMap4);
                ci0 ci0Var4 = qjb.a;
                ci0Var4.a = su4.g(1, ci0Var4.a);
                k4.u(qee.n() + ci0Var4.a, "eventus_id");
                qne A = su4.j(k4, "event_name", "get_feature_flags", "get_feature_flags", k4).A(null);
                x60 x60Var2 = (x60) ((g0c) obj3);
                x60Var2.getClass();
                x60Var2.a(A);
                Object value = ((jyr) yksVar.d).getValue();
                value.getClass();
                oac oacVar = (oac) ((u77) value).e.get();
                oacVar.getClass();
                break;
            case 25:
                pi7 pi7Var = (pi7) obj;
                pi7Var.getClass();
                Context context = (Context) obj6;
                context.getClass();
                vej vejVar = pi7Var.a;
                s9f[] s9fVarArr = pi7.h;
                vejVar.setValue(pi7Var, s9fVarArr[0], context);
                w2r w2rVar = (w2r) obj5;
                pi7Var.b.setValue(pi7Var, s9fVarArr[1], (uif) w2rVar.d);
                pi7Var.c.setValue(pi7Var, s9fVarArr[2], (i5f) obj4);
                pi7Var.d.setValue(pi7Var, s9fVarArr[3], (gku) obj3);
                pi7Var.e = w2rVar.b;
                pi7Var.f.setValue(pi7Var, s9fVarArr[4], 420000L);
                pi7Var.g.setValue(pi7Var, s9fVarArr[5], m9s.a);
                break;
            default:
                ecl eclVar = (ecl) obj;
                eclVar.getClass();
                eclVar.a = (bt2) obj6;
                eclVar.b = new f4m(6, (olr) obj5);
                t1 t1Var = ((d1) obj4).b;
                eclVar.c = Boolean.valueOf(t1Var.w);
                eclVar.d = Boolean.valueOf(t1Var.x);
                eclVar.e = Boolean.valueOf(t1Var.y);
                eclVar.f = t1Var.A;
                eclVar.g = Integer.valueOf(t1Var.B);
                eclVar.h = Boolean.valueOf(t1Var.C.a);
                eclVar.i = Integer.valueOf(t1Var.C.b);
                eclVar.k = Boolean.valueOf(t1Var.C.d);
                eclVar.j = Long.valueOf(t1Var.C.c);
                eclVar.l = Boolean.valueOf(t1Var.D);
                eclVar.m = Boolean.valueOf(t1Var.E);
                eclVar.n = Integer.valueOf(t1Var.z);
                eclVar.o = t1Var.I;
                eclVar.p = t1Var.J;
                eclVar.q = Boolean.valueOf(t1Var.K);
                eclVar.r = t1Var.L;
                eclVar.s = Boolean.valueOf(t1Var.M);
                eclVar.t = t1Var.N ? new jmr(t1Var.O, t1Var.P, t1Var.Q, t1Var.R, t1Var.S) : null;
                eclVar.u = (gcl) obj3;
                break;
        }
        return Unit.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ak0(ix8 ix8Var, xzb xzbVar, rt8 rt8Var, p89 p89Var, xzb xzbVar2) {
        super(1);
        this.r = 6;
        this.s = ix8Var;
        this.t = rt8Var;
        this.u = p89Var;
        this.v = xzbVar2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ak0(t1f t1fVar, Function1 function1, p1j p1jVar, e1j e1jVar) {
        super(1);
        this.r = 20;
        this.s = t1fVar;
        this.u = function1;
        this.t = p1jVar;
        this.v = e1jVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ak0(p9 p9Var, View view, Object obj, Object obj2, Object obj3, int i) {
        super(1);
        this.r = i;
        this.s = view;
        this.t = obj;
        this.u = obj2;
        this.v = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ak0(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        super(1);
        this.r = i;
        this.s = obj;
        this.t = obj2;
        this.u = obj3;
        this.v = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ak0(Function1 function1, aqi aqiVar, mm6 mm6Var, aqi aqiVar2) {
        super(1);
        this.r = 16;
        this.u = function1;
        this.s = aqiVar;
        this.t = mm6Var;
        this.v = aqiVar2;
    }
}
