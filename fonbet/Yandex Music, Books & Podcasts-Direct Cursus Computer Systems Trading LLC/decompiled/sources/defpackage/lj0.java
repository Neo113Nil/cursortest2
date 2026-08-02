package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.graphics.Canvas;
import android.view.View;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.media3.exoplayer.trackselection.a;
import androidx.recyclerview.widget.RecyclerView;
import com.connectsdk.service.DeviceService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
import ru.yandex.video.m3.data.dto.VideoData;

/* loaded from: classes.dex */
public final class lj0 extends uif implements Function1 {
    public final /* synthetic */ int r;
    public final /* synthetic */ Object s;
    public final /* synthetic */ Object t;
    public final /* synthetic */ Object u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lj0(j03 j03Var, awc awcVar, jtc jtcVar) {
        super(1);
        this.r = 5;
        bro[] broVarArr = bro.a;
        this.s = j03Var;
        this.t = awcVar;
        this.u = jtcVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ArrayList arrayList;
        n2k n2kVar;
        tje tjeVar;
        int i = this.r;
        t17 t17Var = null;
        Object obj2 = this.s;
        Object obj3 = this.u;
        Object obj4 = this.t;
        switch (i) {
            case 0:
                oj0 oj0Var = (oj0) obj2;
                mpf mpfVar = (mpf) obj3;
                oj0 oj0Var2 = (oj0) obj4;
                mu3 s = ((jpa) obj).q0().s();
                if (oj0Var.getView().getVisibility() != 8) {
                    oj0Var.x = true;
                    uzj uzjVar = mpfVar.n;
                    AndroidComposeView androidComposeView = uzjVar instanceof AndroidComposeView ? (AndroidComposeView) uzjVar : null;
                    if (androidComposeView != null) {
                        Canvas a = vd0.a(s);
                        androidComposeView.getAndroidViewsHandler$ui_release().getClass();
                        oj0Var2.draw(a);
                    }
                    oj0Var.x = false;
                }
                return Unit.a;
            case 1:
                return new yk0(0, (s2r) obj2, obj4, (hl0) obj3);
            case 2:
                ui2 ui2Var = (ui2) obj3;
                ((qpj) obj2).a((dzf) obj4, ui2Var);
                return new hi(5, ui2Var);
            case 3:
                ybs ybsVar = (ybs) obj;
                ((aqi) obj4).setValue(ybsVar);
                aqi aqiVar = (aqi) obj3;
                boolean d = Intrinsics.d((String) aqiVar.getValue(), ybsVar.a.b);
                mn0 mn0Var = ybsVar.a;
                aqiVar.setValue(mn0Var.b);
                if (!d) {
                    ((Function1) obj2).invoke(mn0Var.b);
                }
                return Unit.a;
            case 4:
                ihk ihkVar = (ihk) obj;
                jtc jtcVar = (jtc) obj3;
                n7b n7bVar = (n7b) obj4;
                ihkVar.getClass();
                String str = ihkVar.a;
                j03 j03Var = (j03) obj2;
                if (j03Var.p) {
                    str.getClass();
                    return mif.a(j03Var.e.a.C(new z9i(str, 0), vsf.A0, p1j.b), new yz2(j03Var, ihkVar, n7bVar, jtcVar, 0), null, 5);
                }
                String str2 = j03Var.a.a;
                String str3 = ihkVar.b;
                str.getClass();
                str3.getClass();
                hrr hrrVar = new hrr(str2, str, str3, 0);
                t28 t28Var = j03Var.d;
                return mif.a(yd5.I("supply_new_sbp_pay", t28Var.b, new qs6(16, t28Var, hrrVar)), new yz2(j03Var, ihkVar, n7bVar, jtcVar, 1), null, 5);
            case 5:
                jtc jtcVar2 = (jtc) obj3;
                awc awcVar = (awc) obj4;
                ihk ihkVar2 = (ihk) obj;
                ihkVar2.getClass();
                String str4 = ihkVar2.a;
                j03 j03Var2 = (j03) obj2;
                if (j03Var2.p) {
                    str4.getClass();
                    yop C = j03Var2.e.a.C(new z9i(str4, 1), vsf.A0, p1j.b);
                    bro[] broVarArr = bro.a;
                    return mif.a(C, new f03(j03Var2, ihkVar2, awcVar, jtcVar2, 0), null, 5);
                }
                String str5 = j03Var2.a.a;
                String str6 = ihkVar2.b;
                str4.getClass();
                str6.getClass();
                hrr hrrVar2 = new hrr(str5, str4, str6, 1);
                t28 t28Var2 = j03Var2.d;
                yop I = yd5.I("supply_sbp_pay", t28Var2.b, new qs6(17, t28Var2, hrrVar2));
                bro[] broVarArr2 = bro.a;
                return mif.a(I, new f03(j03Var2, ihkVar2, awcVar, jtcVar2, 1), null, 5);
            case 6:
                jos josVar = (jos) obj;
                josVar.getClass();
                String str7 = ((ihk) obj2).a;
                kos kosVar = josVar.a;
                String str8 = kosVar.b;
                j03 j03Var3 = (j03) obj4;
                z9h z9hVar = j03Var3.q;
                z9hVar.getClass();
                w9i w9iVar = new w9i(str7, str8, z9hVar, (String) obj3, kosVar.a);
                l9i l9iVar = j03Var3.e;
                return mif.a(mif.b(l9iVar.a.C(w9iVar, vsf.B0, p1j.a), new j9i(l9iVar, 0), null, 5), lhb.z0, new j9i(l9iVar, r7), 1);
            case 7:
                ihk ihkVar3 = (ihk) obj;
                ihkVar3.getClass();
                j03 j03Var4 = (j03) obj2;
                z9h z9hVar2 = j03Var4.q;
                z9hVar2.getClass();
                return mif.a(j03Var4.i.a((String) obj4, z9hVar2), new lj0(6, ihkVar3, j03Var4, (String) obj3), null, 5);
            case 8:
                l0u l0uVar = (l0u) obj;
                jzi jziVar = (jzi) obj3;
                l0uVar.getClass();
                t23 t23Var = (t23) obj2;
                x60 x60Var = t23Var.l;
                String str9 = l0uVar.a;
                x60Var.b.a.put("bind_card_purchase_token", str9);
                g0c g0cVar = t23Var.k;
                String concat = "Завершение верификации: bind_card_purchase_id = ".concat(str9);
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                r1f r1fVar = r1f.a;
                linkedHashMap.put("bind_card_purchase_id", new jkr(str9));
                linkedHashMap.put(DeviceService.KEY_DESC, new jkr(concat));
                vtm vtmVar = new vtm((Map) linkedHashMap);
                ci0 ci0Var = qjb.a;
                ci0Var.a = up6.z(1) + ci0Var.a;
                vtmVar.u(qee.n() + ci0Var.a, "eventus_id");
                x60 x60Var2 = (x60) g0cVar;
                x60Var2.a(su4.j(vtmVar, "event_name", "bind_new_card_verify_completed", "bind_new_card_verify_completed", vtmVar));
                boolean z = t23Var.j;
                String concat2 = "Поллинг верификационного платежа для новой карты: ".concat(z ? "включен" : "выключен");
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                linkedHashMap2.put("use_verification_polling", new mc3(z));
                linkedHashMap2.put(DeviceService.KEY_DESC, new jkr(concat2));
                vtm vtmVar2 = new vtm((Map) linkedHashMap2);
                ci0Var.a = up6.z(1) + ci0Var.a;
                vtmVar2.u(qee.n() + ci0Var.a, "eventus_id");
                qne j = su4.j(vtmVar2, "event_name", "bind_new_card_verify_polling_status", "bind_new_card_verify_polling_status", vtmVar2);
                yop b = z ? t23.b(t23Var, ((i3j) obj4).a, str9, new gi4(jziVar, g0cVar)) : t23.a(t23Var, str9, new gi4(jziVar, g0cVar));
                x60Var2.b(j, b);
                return b;
            case 9:
                l0u l0uVar2 = (l0u) obj;
                jzi jziVar2 = (jzi) obj3;
                l0uVar2.getClass();
                t23 t23Var2 = (t23) obj2;
                x60 x60Var3 = t23Var2.l;
                g0c g0cVar2 = t23Var2.k;
                String str10 = l0uVar2.a;
                x60Var3.b.a.put("bind_card_purchase_token", str10);
                return t23Var2.j ? t23.b(t23Var2, (String) obj4, str10, new gi4(jziVar2, g0cVar2)) : t23.a(t23Var2, str10, new gi4(jziVar2, g0cVar2));
            case 10:
                float floatValue = ((Number) obj).floatValue();
                dc6 dc6Var = (dc6) obj2;
                float f = dc6Var.q ? 1.0f : -1.0f;
                iyo iyoVar = dc6Var.p;
                long d2 = iyoVar.d(iyoVar.g(f * floatValue));
                iyo iyoVar2 = ((hyo) obj3).a;
                float f2 = iyoVar.f(iyoVar.d(iyo.a(iyoVar2, iyoVar2.j, d2, 1))) * f;
                if (Math.abs(f2) < Math.abs(floatValue)) {
                    ((r2f) obj4).g(n7w.c("Scroll animation cancelled because scroll was not consumed (" + f2 + " < " + floatValue + ')', null));
                }
                return Unit.a;
            case 11:
                jpa jpaVar = (jpa) obj;
                axf axfVar = (axf) obj2;
                dds d3 = axfVar.d();
                if (d3 != null) {
                    ybs ybsVar2 = (ybs) obj4;
                    mnj mnjVar = (mnj) obj3;
                    mu3 s2 = jpaVar.q0().s();
                    long j2 = ((rds) axfVar.z.getValue()).a;
                    long j3 = ((rds) axfVar.A.getValue()).a;
                    cds cdsVar = d3.a;
                    ogi ogiVar = cdsVar.b;
                    bds bdsVar = cdsVar.a;
                    gh0 gh0Var = axfVar.x;
                    long j4 = axfVar.y;
                    if (!rds.b(j2)) {
                        gh0Var.e(j4);
                        int d4 = mnjVar.d(rds.e(j2));
                        int d5 = mnjVar.d(rds.d(j2));
                        if (d4 != d5) {
                            s2.e(cdsVar.g(d4, d5), gh0Var);
                        }
                    } else if (!rds.b(j3)) {
                        long c = bdsVar.b.c();
                        d85 d85Var = c != 16 ? new d85(c) : null;
                        long j5 = d85Var != null ? d85Var.a : d85.b;
                        gh0Var.e(d85.b(j5, d85.d(j5) * 0.2f, 0.0f, 0.0f, 0.0f, 14));
                        int d6 = mnjVar.d(rds.e(j3));
                        int d7 = mnjVar.d(rds.d(j3));
                        if (d6 != d7) {
                            s2.e(cdsVar.g(d6, d7), gh0Var);
                        }
                    } else if (!rds.b(ybsVar2.b)) {
                        gh0Var.e(j4);
                        long j6 = ybsVar2.b;
                        int d8 = mnjVar.d(rds.e(j6));
                        int d9 = mnjVar.d(rds.d(j6));
                        if (d8 != d9) {
                            s2.e(cdsVar.g(d8, d9), gh0Var);
                        }
                    }
                    r7 = (!cdsVar.c() || bdsVar.f == 3) ? 0 : 1;
                    if (r7 != 0) {
                        long j7 = cdsVar.c;
                        ynn d10 = ywf.d(0L, (Float.floatToRawIntBits((int) (j7 >> 32)) << 32) | (Float.floatToRawIntBits((int) (j7 & 4294967295L)) & 4294967295L));
                        s2.r();
                        mu3.v(s2, d10);
                    }
                    c4r c4rVar = bdsVar.b.a;
                    aas aasVar = c4rVar.m;
                    bcs bcsVar = c4rVar.a;
                    if (aasVar == null) {
                        aasVar = aas.b;
                    }
                    aas aasVar2 = aasVar;
                    otp otpVar = c4rVar.n;
                    if (otpVar == null) {
                        otpVar = otp.d;
                    }
                    kpa kpaVar = c4rVar.p;
                    if (kpaVar == null) {
                        kpaVar = dbc.a;
                    }
                    kpa kpaVar2 = kpaVar;
                    try {
                        ai3 c2 = bcsVar.c();
                        zbs zbsVar = zbs.a;
                        if (c2 != null) {
                            ogiVar.m(s2, c2, bcsVar != zbsVar ? bcsVar.b() : 1.0f, otpVar, aasVar2, kpaVar2);
                        } else {
                            ogi.l(ogiVar, s2, bcsVar != zbsVar ? bcsVar.a() : d85.b, otpVar, aasVar2, kpaVar2, 32);
                        }
                        if (r7 != 0) {
                            s2.k();
                        }
                    } catch (Throwable th) {
                        if (r7 != 0) {
                            s2.k();
                        }
                        throw th;
                    }
                }
                return Unit.a;
            case 12:
                View view = (View) obj;
                view.getClass();
                xqn xqnVar = (xqn) obj2;
                t17 t17Var2 = view instanceof t17 ? (t17) view : null;
                if (t17Var2 != null) {
                    t17Var2.e((s17) obj4, new mt4(1, ((o17) obj3).x(), c27.class, "verifyCode", "verifyCode(Ljava/lang/String;)V", 0, 28));
                    t17Var = t17Var2;
                }
                xqnVar.a = t17Var;
                return Unit.a;
            case 13:
                sm0 sm0Var = (sm0) obj;
                uqn uqnVar = (uqn) obj2;
                float floatValue2 = ((Number) sm0Var.e.getValue()).floatValue() - uqnVar.a;
                float a2 = ((rwo) obj4).a(floatValue2);
                uqnVar.a = ((Number) sm0Var.e.getValue()).floatValue();
                ((uqn) obj3).a = ((Number) sm0Var.b()).floatValue();
                if (Math.abs(floatValue2 - a2) > 0.5f) {
                    sm0Var.a();
                }
                return Unit.a;
            case 14:
                ((VideoData) obj).getClass();
                Context context = (Context) obj2;
                rp7 rp7Var = (rp7) ((jzi) obj4).a;
                a aVar = new a(new us7());
                tp7 tp7Var = new tp7((s1) obj3, 1);
                context.getClass();
                s1 s1Var = new tp7(tp7Var.s, 0).s;
                return new t6s(context, rp7Var, aVar, new b2c(), new r6s(s1Var.e(), s1Var.a()));
            case 15:
                kxt kxtVar = (kxt) obj;
                gc8 gc8Var = (gc8) obj2;
                if (kxtVar instanceof cxt) {
                    Object d11 = kxtVar.d();
                    JSONObject jSONObject = d11 instanceof JSONObject ? (JSONObject) d11 : null;
                    if (jSONObject == null) {
                        gc8Var.I(new IllegalArgumentException("Invalid variable value"));
                    } else {
                        JSONObject jSONObject2 = new JSONObject();
                        Iterator<String> keys = jSONObject.keys();
                        while (keys.hasNext()) {
                            String next = keys.next();
                            jSONObject2.put(next, jSONObject.get(next));
                        }
                        String str11 = (String) obj3;
                        if (obj4 == null) {
                            jSONObject2.remove(str11);
                            ((cxt) kxtVar).j(jSONObject2);
                        } else {
                            ((cxt) kxtVar).j(jSONObject2.put(str11, obj4));
                        }
                    }
                } else {
                    gc8Var.I(new IllegalArgumentException("dict_set_value action requires dict variable"));
                }
                return kxtVar;
            case 16:
                tp8 tp8Var = (tp8) obj2;
                tp8Var.b((op8) obj4, (xzb) obj3);
                tp8Var.b.invalidate();
                return Unit.a;
            case 17:
                jt8 jt8Var = (jt8) obj2;
                xzb xzbVar = (xzb) obj4;
                ((p89) obj3).setGravity(vq1.O((du8) jt8Var.o.a(xzbVar), (eu8) jt8Var.p.a(xzbVar)));
                return Unit.a;
            case 18:
                jt8 jt8Var2 = (jt8) obj2;
                xzb xzbVar2 = (xzb) obj4;
                ((c2a) obj3).setGravity(vq1.O((du8) jt8Var2.o.a(xzbVar2), (eu8) jt8Var2.p.a(xzbVar2)));
                return Unit.a;
            case 19:
                u09 u09Var = (u09) ((hh9) obj2).getAdapter();
                if (u09Var != null) {
                    ArrayList w = qwp.w((pr8) obj4, ((e23) obj3).b);
                    ArrayList arrayList2 = u09Var.d;
                    zsd.H(new kr8(arrayList2, w)).a(new yfx(u09Var, w, false, 20));
                    u09Var.k = wvo.K(arrayList2, gd9.u, gd9.v);
                    u09Var.y();
                }
                return Unit.a;
            case 20:
                m39.G((lb9) obj2, (xzb) obj4, (k39) obj3);
                return Unit.a;
            case 21:
                ((Number) obj).longValue();
                ((c89) obj2).u.addAll(((pzb) obj4).f((xzb) obj3));
                return Unit.a;
            case 22:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                RecyclerView recyclerView = (RecyclerView) obj3;
                xqn xqnVar2 = (xqn) obj4;
                oc9 oc9Var = (oc9) obj2;
                qon adapter = oc9Var.getViewPager().getAdapter();
                hb9 hb9Var = adapter instanceof hb9 ? (hb9) adapter : null;
                if (hb9Var != null && hb9Var.t != booleanValue) {
                    hb9Var.t = booleanValue;
                    hb9Var.a.d(0, hb9Var.q.f(), null);
                    oc9 oc9Var2 = hb9Var.p;
                    oc9Var2.setCurrentItem$div_release(oc9Var2.getCurrentItem$div_release() + (booleanValue ? 2 : -2));
                }
                Object obj5 = xqnVar2.a;
                if (booleanValue) {
                    dpn dpnVar = (dpn) obj5;
                    if (dpnVar == null) {
                        dpnVar = new ib9(0, oc9Var);
                        xqnVar2.a = dpnVar;
                    }
                    recyclerView.t(dpnVar);
                } else {
                    dpn dpnVar2 = (dpn) obj5;
                    if (dpnVar2 != null && (arrayList = recyclerView.P0) != null) {
                        arrayList.remove(dpnVar2);
                    }
                }
                return Unit.a;
            case 23:
                oc9 oc9Var3 = (oc9) obj2;
                hb9 hb9Var2 = (hb9) oc9Var3.getViewPager().getAdapter();
                if (hb9Var2 != null) {
                    ArrayList w2 = qwp.w((pr8) obj4, ((e23) obj3).b);
                    ArrayList arrayList3 = hb9Var2.d;
                    int size = arrayList3.size();
                    hb9Var2.u = 0;
                    oc9 oc9Var4 = hb9Var2.p;
                    int currentItem$div_release = oc9Var4.getCurrentItem$div_release();
                    zsd.H(new kr8(arrayList3, w2)).a(new yfx(hb9Var2, w2, false, 20));
                    hb9Var2.k = wvo.K(arrayList3, gd9.u, gd9.v);
                    hb9Var2.y();
                    if (hb9Var2.u == size) {
                        oc9Var4.setCurrentItem$div_release(currentItem$div_release);
                    }
                    kc9 pagerOnItemsCountChange$div_release = oc9Var3.getPagerOnItemsCountChange$div_release();
                    if (pagerOnItemsCountChange$div_release != null && (tjeVar = (n2kVar = (n2k) ((uvg) pagerOnItemsCountChange$div_release).b).a) != null) {
                        n2kVar.f(tjeVar);
                    }
                    RecyclerView recyclerView2 = oc9Var3.getRecyclerView();
                    if (recyclerView2 != null) {
                        recyclerView2.z0(hb9Var2.C(oc9Var3.getCurrentItem$div_release()));
                    }
                    oc9Var3.getViewPager().addOnLayoutChangeListener(new f27(1, oc9Var3));
                }
                return Unit.a;
            case 24:
                si9.G((cj9) obj2, (qi9) obj4, (xzb) obj3);
                return Unit.a;
            case 25:
                Cursor a3 = ((tjn) obj).a();
                if (a3.getCount() != 0 && a3.moveToFirst()) {
                    do {
                        zm9 zm9Var = new zm9((dn9) obj2, a3);
                        if (((Boolean) ((r23) obj4).invoke(zm9Var)).booleanValue()) {
                            ((LinkedHashSet) obj3).add(zm9Var.c);
                        }
                        zm9Var.b = true;
                    } while (a3.moveToNext());
                }
                return Unit.a;
            case 26:
                v1s v1sVar = (v1s) obj3;
                xzb xzbVar3 = (xzb) obj4;
                vo9 vo9Var = (vo9) obj2;
                uo9 uo9Var = vo9Var.D;
                if (uo9Var == null) {
                    uo9Var = cp9.p;
                }
                ix8 ix8Var = uo9Var.v;
                ix8 ix8Var2 = vo9Var.E;
                szb szbVar = uo9Var.u;
                v1sVar.getLayoutParams().height = bg3.Z(Long.valueOf(((Number) ix8Var2.a.a(xzbVar3)).longValue() + ((Number) ix8Var2.f.a(xzbVar3)).longValue() + ((Number) ix8Var.a.a(xzbVar3)).longValue() + ((Number) ix8Var.f.a(xzbVar3)).longValue() + (szbVar != null ? ((Number) szbVar.a(xzbVar3)).longValue() : (long) (((Number) uo9Var.k.a(xzbVar3)).floatValue() * 1.3f))), v1sVar.getResources().getDisplayMetrics());
                return Unit.a;
            case 27:
                v1s titleLayout = ((lp9) obj2).getTitleLayout();
                xzb xzbVar4 = (xzb) obj4;
                uo9 uo9Var2 = (uo9) obj3;
                if (uo9Var2 == null) {
                    uo9Var2 = cp9.p;
                }
                cp9.H(titleLayout, xzbVar4, uo9Var2);
                return Unit.a;
            default:
                oce oceVar = (oce) obj;
                if (oceVar != null) {
                    grm grmVar = (grm) obj4;
                    e23 e23Var = (e23) obj3;
                    if (oceVar instanceof nce) {
                        grmVar.setImageDrawable(((nce) oceVar).a);
                    } else if (oceVar instanceof lce) {
                        grmVar.setImageBitmap(((lce) oceVar).a);
                    } else if (oceVar instanceof mce) {
                        wdp.n0(e23Var.a, ((mce) oceVar).a);
                    }
                    grmVar.setVisibility(0);
                }
                ((af9) obj2).setVisibility(0);
                return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lj0(p9 p9Var, View view, Object obj, Object obj2, int i) {
        super(1);
        this.r = i;
        this.s = view;
        this.t = obj;
        this.u = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lj0(oj0 oj0Var, mpf mpfVar, oj0 oj0Var2) {
        super(1);
        this.r = 0;
        this.s = oj0Var;
        this.u = mpfVar;
        this.t = oj0Var2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lj0(int i, Object obj, Object obj2, Object obj3) {
        super(1);
        this.r = i;
        this.s = obj;
        this.t = obj2;
        this.u = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lj0(oc9 oc9Var, xqn xqnVar, kb9 kb9Var, RecyclerView recyclerView) {
        super(1);
        this.r = 22;
        this.s = oc9Var;
        this.t = xqnVar;
        this.u = recyclerView;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lj0(uqn uqnVar, rwo rwoVar, uqn uqnVar2, om7 om7Var) {
        super(1);
        this.r = 13;
        this.s = uqnVar;
        this.t = rwoVar;
        this.u = uqnVar2;
    }
}
