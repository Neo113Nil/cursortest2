package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import androidx.compose.foundation.layout.d;
import androidx.recyclerview.widget.RecyclerView;
import com.appsflyer.AppsFlyerLib;
import com.connectsdk.service.config.ServiceDescription;
import com.yandex.passport.api.z1;
import com.yandex.passport.internal.account.f;
import com.yandex.plus.adapter.auth.passport750.i;
import com.yandex.plus.bdui.r;
import com.yandex.plus.metrica.api.b;
import com.yandex.plus.pay.api.model.AppDistribution;
import com.yandex.plus.pay.ui.tarifficator.mobile.bdui.api.a;
import com.yandex.plus.paymentsdk.internal.method.e;
import com.yandex.pulse.metrics.o;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.R;

/* loaded from: classes4.dex */
public final /* synthetic */ class p3e implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ p3e(l13 l13Var, a8m a8mVar, i8m i8mVar, e8m e8mVar) {
        this.a = 16;
        this.b = l13Var;
        this.c = i8mVar;
        this.d = e8mVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r15v18 */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        lnu lnuVar;
        String str;
        rap rapVar;
        Object obj2;
        int i = 5;
        int i2 = 8;
        int i3 = 12;
        int i4 = 4;
        int i5 = 22;
        int i6 = 26;
        int i7 = 10;
        int i8 = 2;
        fcc fccVar = 0;
        r15 = null;
        String str2 = null;
        int i9 = 1;
        switch (this.a) {
            case 0:
                v3e v3eVar = (v3e) this.b;
                mqs mqsVar = (mqs) this.c;
                spd spdVar = (spd) this.d;
                ((mqs) obj).getClass();
                v3eVar.a.c(mqsVar, spdVar.c);
                break;
            case 1:
                u3e u3eVar = (u3e) this.b;
                thj thjVar = (thj) this.c;
                mdc mdcVar = (mdc) this.d;
                String str3 = (String) obj;
                str3.getClass();
                rmb rmbVar = u3eVar.g;
                if (mdcVar != null) {
                    ArrayList arrayList = mdcVar.a;
                    int i10 = mdcVar.b;
                    hcc hccVar = (hcc) arrayList.get(i10);
                    hccVar.getClass();
                    fccVar = new fcc(ServiceDescription.KEY_FILTER, hccVar.a, i10 + 1);
                }
                rmbVar.m(fccVar, thjVar, str3);
                break;
            case 2:
                to3 to3Var = (to3) this.b;
                a6e a6eVar = (a6e) this.c;
                ep3 ep3Var = (ep3) this.d;
                joj jojVar = (joj) obj;
                jojVar.getClass();
                jojVar.k = to3Var;
                jojVar.c.add(new up3(i7, a6eVar.b));
                jojVar.d.add(new up3(i8, ep3Var));
                break;
            case 3:
                ArrayList arrayList2 = (ArrayList) this.b;
                ygf ygfVar = (ygf) this.c;
                List list = (List) this.d;
                vuf vufVar = (vuf) obj;
                vufVar.getClass();
                vufVar.Z(arrayList2.size(), new sea(21, new rea(25), arrayList2), new vv(arrayList2, 18), new wn5(new t50(arrayList2, (Object) ygfVar, (Object) list, 11), -1091073711, true));
                break;
            case 4:
                dzf dzfVar = (dzf) this.b;
                an5 an5Var = new an5(2, (kyf) this.c, (aqi) this.d);
                dzfVar.getLifecycle().a(an5Var);
                break;
            case 5:
                v1h v1hVar = (v1h) this.b;
                jmj jmjVar = (jmj) this.c;
                Context context = (Context) this.d;
                n9b n9bVar = (n9b) obj;
                n9bVar.getClass();
                ubi ubiVar = n9bVar.a;
                if (v1hVar instanceof t1h) {
                    q5g.b(n9bVar, ((t1h) v1hVar).a);
                    lg3.D(n9bVar, 24);
                    ubiVar.a(vnj.b);
                    lg3.D(n9bVar, 32);
                } else if (v1hVar instanceof s1h) {
                    q5g.b(n9bVar, ((s1h) v1hVar).a);
                    ksw.y(n9bVar, jmjVar, d.x(d.c(vci.a, 1.0f), b2c.f, 2));
                } else if (!(v1hVar instanceof u1h)) {
                    b6e.s();
                    break;
                } else {
                    u1h u1hVar = (u1h) v1hVar;
                    q5g.b(n9bVar, u1hVar.a);
                    g1h g1hVar = u1hVar.b;
                    g1hVar.getClass();
                    context.getClass();
                    StringBuilder sb = new StringBuilder(16);
                    new ArrayList();
                    ArrayList arrayList3 = new ArrayList();
                    new ArrayList();
                    sb.append(g1hVar.g);
                    for (int i11 = 0; i11 < 3; i11++) {
                        sb.append('\n');
                    }
                    List list2 = g1hVar.e;
                    String o = (list2 == null || list2.isEmpty()) ? null : ouj.o(context.getString(R.string.lyrics_info_prefix_author), ": ", CollectionsKt.X(list2, ", ", null, null, null, 62));
                    String str4 = g1hVar.d.b;
                    if (str4 != null && str4.length() != 0) {
                        str2 = ouj.o(context.getString(R.string.lyrics_info_prefix_license), ": ", str4);
                    }
                    if (o != null) {
                        sb.append(o);
                        sb.append('\n');
                    }
                    if (str2 != null) {
                        sb.append(str2);
                    }
                    String sb2 = sb.toString();
                    ArrayList arrayList4 = new ArrayList(arrayList3.size());
                    int size = arrayList3.size();
                    for (int i12 = 0; i12 < size; i12++) {
                        arrayList4.add(((jn0) arrayList3.get(i12)).a(sb.length()));
                    }
                    ubiVar.a(new wn5(new o1h(new mn0(sb2, arrayList4), r14), 1773791489, true));
                }
                break;
            case 6:
                List list3 = (List) this.b;
                ynn ynnVar = (ynn) this.c;
                l8i l8iVar = (l8i) this.d;
                vuf vufVar2 = (vuf) obj;
                vufVar2.getClass();
                vufVar2.Z(list3.size(), null, new zcf(list3, i4), new wn5(new t50(list3, ynnVar, l8iVar, i3), -1091073711, true));
                break;
            case 7:
                ja0 ja0Var = (ja0) this.b;
                ksk kskVar = (ksk) this.c;
                Function1 function1 = (Function1) this.d;
                jsk jskVar = (jsk) obj;
                jskVar.getClass();
                ja0Var.getClass();
                float e = ja0Var.j.e();
                Float valueOf = Float.isNaN(e) ? null : Float.valueOf(e);
                if (valueOf == null) {
                    dfi.r("offset is NaN", "PlayerScreen");
                }
                if (valueOf != null) {
                    jsk.h(jskVar, kskVar, ((wpe) function1.invoke(valueOf)).a);
                }
                break;
            case 8:
                xli xliVar = (xli) this.b;
                mm6 mm6Var = (mm6) this.c;
                fvf fvfVar = (fvf) this.d;
                v0s v0sVar = (v0s) obj;
                v0sVar.getClass();
                xliVar.getClass();
                ime imeVar = xliVar.a.s;
                imeVar.getClass();
                nmb nmbVar = (nmb) imeVar.d;
                String G = ((fnb) imeVar.b).G();
                pkb pkbVar = pkb.Shortcut;
                t80 t80Var = v0sVar.c;
                String b = t80Var.b();
                sjb sjbVar = sjb.Ok;
                nmb.g(nmbVar, kmb.Tap, G, wjb.MusicHistoryScreen, null, null, null, null, null, pkbVar, b, 0, 0, null, t80Var.a() + 1, false, "HISTORY_TABS", "HISTORY_TABS", 0, 0, null, null, null, 0, "scroll_to", 16669944);
                x97.y(mm6Var, null, null, new zig(fvfVar, v0sVar, fccVar, 25), 3);
                break;
            case 9:
                String str5 = (String) this.b;
                mvi mviVar = (mvi) this.c;
                dvi dviVar = (dvi) this.d;
                vuf vufVar3 = (vuf) obj;
                vufVar3.getClass();
                vuf.Y(vufVar3, null, new wn5(new mf3(str5, i), -857962107, true), 3);
                vuf.Y(vufVar3, null, new wn5(new gab(i7, mviVar, dviVar), 381004462, true), 3);
                break;
            case 10:
                mqs mqsVar2 = (mqs) this.c;
                k68 k68Var = (k68) this.b;
                tbb tbbVar = (tbb) this.d;
                ((is6) obj).getClass();
                break;
            case 11:
                ArrayList arrayList5 = (ArrayList) this.b;
                mdj mdjVar = (mdj) this.c;
                fdj fdjVar = (fdj) this.d;
                vuf vufVar4 = (vuf) obj;
                vufVar4.getClass();
                vufVar4.Z(arrayList5.size(), new afg(i7, new d6h(i2), arrayList5), new vv(arrayList5, 26), new wn5(new t50(arrayList5, (Object) mdjVar, (Object) fdjVar, 14), -1091073711, true));
                break;
            case 12:
                lvf lvfVar = (lvf) this.b;
                wn5 wn5Var = (wn5) this.c;
                q0k q0kVar = (q0k) this.d;
                bsf bsfVar = (bsf) obj;
                bsfVar.getClass();
                bsfVar.Y(lvfVar.d(), new u8b(9, lvfVar), new u8b(8, lvfVar), new wn5(new f4k(lvfVar, wn5Var, i9), -1748819689, true));
                bsf.X(bsfVar, new hpj(19), new wn5(new gab(i5, lvfVar, q0kVar), -577984418, true), 5);
                break;
            case 13:
                f fVar = (f) this.b;
                String str6 = (String) this.c;
                String str7 = (String) this.d;
                com.yandex.passport.internal.properties.d dVar = (com.yandex.passport.internal.properties.d) obj;
                dVar.getClass();
                z1 z1Var = fVar.a;
                z1Var.getClass();
                dVar.a = z1Var;
                str6.getClass();
                dVar.b = str6;
                str7.getClass();
                dVar.c = str7;
                break;
            case 14:
                p8n p8nVar = (p8n) this.b;
                sdr sdrVar = (sdr) this.c;
                aqi aqiVar = (aqi) this.d;
                RecyclerView recyclerView = (RecyclerView) obj;
                recyclerView.getClass();
                ybn ybnVar = (ybn) sdrVar.getValue();
                ArrayList arrayList6 = p8nVar.f;
                ybnVar.getClass();
                ybn ybnVar2 = p8nVar.e;
                List list4 = ybnVar2 != null ? ybnVar2.a : null;
                List list5 = ybnVar.a;
                if (!Intrinsics.d(list4, list5)) {
                    p8nVar.e = ybnVar;
                    if (!Intrinsics.d(list5, arrayList6)) {
                        p8nVar.g = ybnVar.c;
                        arrayList6.clear();
                        arrayList6.addAll(list5);
                        p8nVar.g();
                    }
                }
                if (!((Boolean) aqiVar.getValue()).booleanValue()) {
                    int i13 = ((ybn) sdrVar.getValue()).b - 1;
                    recyclerView.z0(i13 >= 0 ? i13 : 0);
                    aqiVar.setValue(Boolean.TRUE);
                }
                break;
            case 15:
                dsl dslVar = (dsl) this.b;
                yrl yrlVar = (yrl) this.c;
                mm6 mm6Var2 = (mm6) this.d;
                n9b n9bVar2 = (n9b) obj;
                n9bVar2.getClass();
                if (Intrinsics.d(dslVar, asl.a) || Intrinsics.d(dslVar, bsl.a)) {
                    lg3.A(n9bVar2);
                } else if (!(dslVar instanceof csl)) {
                    b6e.s();
                    break;
                } else {
                    csl cslVar = (csl) dslVar;
                    boolean z = cslVar.f;
                    xbb xbbVar = cslVar.a;
                    if (z) {
                        nt0.m(n9bVar2, xbbVar, yrlVar.b(mm6Var2));
                    } else {
                        xv.n(n9bVar2, xbbVar);
                    }
                    String str8 = cslVar.b;
                    if (str8 != null) {
                        xv.l(n9bVar2, str8, new msj(0, yrlVar, yrl.class, "onDescriptionClick", "onDescriptionClick()V", 0, 14), null, 12);
                    }
                    if (!z && (lnuVar = cslVar.c) != null) {
                        o5g.p(n9bVar2, lnuVar, yrlVar.b(mm6Var2));
                    }
                    float f = 16;
                    lg3.D(n9bVar2, f);
                    Iterator it = cslVar.d.iterator();
                    while (it.hasNext()) {
                        ldg.d(n9bVar2, (o0m) it.next(), yrlVar);
                    }
                    lg3.D(n9bVar2, f);
                    Iterator it2 = cslVar.e.iterator();
                    while (it2.hasNext()) {
                        ldg.d(n9bVar2, (o0m) it2.next(), yrlVar);
                    }
                }
                break;
            case 16:
                l13 l13Var = (l13) this.b;
                i8m i8mVar = (i8m) this.c;
                final e8m e8mVar = (e8m) this.d;
                a aVar = (a) obj;
                aVar.getClass();
                bdt I = hag.I(e.class);
                qdc qdcVar = l13Var.a;
                Set set = l13Var.b;
                aVar.c = (e) qdcVar.D(I, l13Var, set);
                aVar.b = (com.yandex.plus.pay.ui.design.api.api.a) l13Var.a.D(hag.I(com.yandex.plus.pay.ui.design.api.api.a.class), l13Var, set);
                com.yandex.plus.divkit.api.f fVar2 = com.yandex.plus.divkit.api.f.a;
                LinkedHashMap g = uah.g(new Pair("restore_purchases", new z7m(0)), new Pair("feedback", new z7m(1)), new Pair("change_account", new z7m(2)), new Pair("promo_code", new z7m(3)));
                LinkedHashMap linkedHashMap = new LinkedHashMap(tah.a(g.size()));
                for (Map.Entry entry : g.entrySet()) {
                    linkedHashMap.put(entry.getKey(), new v5m((z7m) entry.getValue()));
                }
                LinkedHashMap g2 = uah.g(new Pair("ys_music_headline", new h8m(i8mVar)));
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(tah.a(g2.size()));
                for (Map.Entry entry2 : g2.entrySet()) {
                    linkedHashMap2.put(entry2.getKey(), new b6m((h8m) entry2.getValue()));
                }
                aVar.d = fVar2;
                aVar.e = linkedHashMap;
                aVar.f = linkedHashMap2;
                LinkedHashMap g3 = uah.g(new Pair("ym_appmetrica", new c8m()), new Pair("ym_appsflyer", new b8m() { // from class: d8m
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // defpackage.b8m
                    public final void a(String str9, Map map) {
                        str9.getClass();
                        e8m e8mVar2 = e8m.this;
                        AppsFlyerLib appsFlyerLib = (AppsFlyerLib) e8mVar2.b.getValue();
                        Context context2 = (Context) e8mVar2.a.getValue();
                        if (map == null) {
                            map = e5b.a;
                            map.getClass();
                        }
                        appsFlyerLib.logEvent(context2, str9, map);
                    }
                }));
                LinkedHashMap linkedHashMap3 = new LinkedHashMap(tah.a(g3.size()));
                for (Map.Entry entry3 : g3.entrySet()) {
                    linkedHashMap3.put(entry3.getKey(), new y5m((b8m) entry3.getValue()));
                }
                aVar.g = linkedHashMap3;
                aVar.a = r.a;
                break;
            case 17:
                u7m u7mVar = (u7m) this.b;
                l13 l13Var2 = (l13) this.c;
                b7m b7mVar = (b7m) this.d;
                com.yandex.plus.pay.internal.a aVar2 = (com.yandex.plus.pay.internal.a) obj;
                aVar2.getClass();
                aVar2.a = "music";
                aVar2.b = com.yandex.plus.pay.api.utils.a.a;
                aVar2.c = "music_mobile_app";
                aVar2.d = "music";
                aVar2.e = "ANDROID";
                bdt I2 = hag.I(Context.class);
                qdc qdcVar2 = l13Var2.a;
                Set set2 = l13Var2.b;
                aVar2.g = (Context) qdcVar2.D(I2, l13Var2, set2);
                aVar2.f = new z5m(b7mVar, u7mVar, 1);
                aVar2.h = new a6m(u7mVar, 0);
                bdt I3 = hag.I(f8m.class);
                qdc qdcVar3 = l13Var2.a;
                aVar2.l = (f8m) qdcVar3.D(I3, l13Var2, set2);
                aVar2.m = new z5m(u7mVar);
                aVar2.s = new com.yandex.plus.home.plaque.animator.internal.utils.a();
                String str9 = (String) sn4.a.getValue();
                str9.getClass();
                aVar2.i = str9;
                aVar2.k = ((w7m) qdcVar3.D(hag.I(w7m.class), l13Var2, set2)).a.a.c();
                aVar2.n = (g8m) qdcVar3.D(hag.I(g8m.class), l13Var2, set2);
                ft0 a = u7mVar.a();
                switch (a.ordinal()) {
                    case 0:
                        str = AppDistribution.GOOGLE_STORE;
                        break;
                    case 1:
                        str = AppDistribution.SAMSUNG_STORE;
                        break;
                    case 2:
                        str = AppDistribution.HUAWEI_STORE;
                        break;
                    case 3:
                        str = AppDistribution.XIAOMI_STORE;
                        break;
                    case 4:
                    case 5:
                    case 6:
                        str = a.a;
                        break;
                    default:
                        b6e.s();
                        break;
                }
                aVar2.j = str;
                aVar2.p = "24026391";
                aVar2.q = b.a;
                i iVar = (i) ((o5m) qdcVar3.D(hag.I(o5m.class), l13Var2, set2)).a.getValue();
                iVar.getClass();
                aVar2.r = iVar;
                break;
            case 18:
                Function2 function2 = (Function2) this.b;
                aqi aqiVar2 = (aqi) this.c;
                aqi aqiVar3 = (aqi) this.d;
                swt swtVar = (swt) obj;
                swtVar.getClass();
                int ordinal = swtVar.ordinal();
                if (ordinal == 0) {
                    rapVar = rap.a;
                } else if (ordinal != 1) {
                    b6e.s();
                    break;
                } else {
                    rapVar = rap.b;
                }
                function2.invoke(Float.valueOf(((Number) aqiVar2.getValue()).floatValue()), rapVar);
                aqiVar3.setValue(Boolean.FALSE);
                break;
            case 19:
                Function1 function12 = (Function1) this.b;
                poi poiVar = (poi) this.c;
                aqi aqiVar4 = (aqi) this.d;
                ((swt) obj).getClass();
                function12.invoke(Float.valueOf(((t6k) poiVar).e()));
                aqiVar4.setValue(Boolean.FALSE);
                break;
            case 20:
                String str10 = (String) this.b;
                Function1 function13 = (Function1) this.c;
                aqi aqiVar5 = (aqi) this.d;
                ybs ybsVar = (ybs) obj;
                ybsVar.getClass();
                aqiVar5.setValue(ybsVar);
                mn0 mn0Var = ybsVar.a;
                if (!Intrinsics.d(str10, mn0Var.b)) {
                    function13.invoke(mn0Var.b);
                }
                break;
            case 21:
                yrp yrpVar = (yrp) this.b;
                y3 y3Var = (y3) this.c;
                qnq qnqVar = (qnq) this.d;
                hjl hjlVar = (hjl) obj;
                hjlVar.getClass();
                jrp jrpVar = (jrp) y3Var.b;
                jrpVar.getClass();
                qnqVar.getClass();
                iwe iweVar = new iwe(i6, qnqVar, qnqVar.b);
                fnb fnbVar = qnqVar.d.a;
                jrpVar.getClass();
                fnbVar.getClass();
                break;
            case 22:
                tvp tvpVar = (tvp) this.b;
                Function2 function22 = (Function2) this.c;
                Context context2 = (Context) this.d;
                vuf vufVar5 = (vuf) obj;
                vufVar5.getClass();
                ArrayList arrayList7 = tvpVar.a;
                vufVar5.Z(arrayList7.size(), null, new wyl(arrayList7, 3), new wn5(new t50(arrayList7, (Object) function22, (Object) context2, 15), -1091073711, true));
                break;
            case 23:
                zwp zwpVar = (zwp) this.b;
                ovp ovpVar = (ovp) this.c;
                Function0 function0 = (Function0) this.d;
                ((is6) obj).getClass();
                swp swpVar = (swp) ovpVar.b.getValue();
                cxp cxpVar = (cxp) ovpVar.c.getValue();
                kun kunVar = ovpVar.e;
                l18 l18Var = l18.b;
                bdt I4 = hag.I(byb.class);
                qdc qdcVar4 = l18Var.a;
                qdcVar4.getClass();
                break;
            case 24:
                final u6q u6qVar = (u6q) this.b;
                vx1[] vx1VarArr = (vx1[]) this.c;
                mua muaVar = (mua) this.d;
                qqb qqbVar = (qqb) obj;
                final vx1[] vx1VarArr2 = (vx1[]) Arrays.copyOf(vx1VarArr, vx1VarArr.length);
                mxn mxnVar = new mxn() { // from class: q6q
                    @Override // defpackage.mxn
                    public final at2[] a(Handler handler, ccu ccuVar, fy1 fy1Var, nds ndsVar, c3i c3iVar) {
                        jp0 jp0Var = new jp0();
                        u6q u6qVar2 = u6q.this;
                        Object[] objArr = (Object[]) u6qVar2.h.invoke();
                        objArr.getClass();
                        int length = objArr.length;
                        vx1[] vx1VarArr3 = vx1VarArr2;
                        int length2 = vx1VarArr3.length;
                        Object[] copyOf = Arrays.copyOf(objArr, length + length2);
                        System.arraycopy(vx1VarArr3, 0, copyOf, length, length2);
                        jp0Var.d = new es6((vx1[]) copyOf);
                        Context context3 = u6qVar2.a;
                        dv1 dv1Var = dv1.g;
                        int i14 = dvt.a;
                        yv1 b2 = yv1.b(context3, dv1Var, null);
                        b2.getClass();
                        jp0Var.c = b2;
                        gk7 d = jp0Var.d();
                        jih jihVar = new jih(context3, new vg0(context3, false), rih.m0, false, handler, fy1Var, d);
                        oxf oxfVar = ((Class) sgc.b.getValue()) != null ? new oxf(handler, fy1Var, d) : null;
                        return oxfVar != null ? new at2[]{oxfVar, jihVar} : new jih[]{jihVar};
                    }
                };
                vq1.A(!qqbVar.x);
                qqbVar.c = new qo7(i4, mxnVar);
                Looper c = mal.c();
                vq1.A(!qqbVar.x);
                qqbVar.i = c;
                vq1.A(!qqbVar.x);
                qqbVar.f = new qo7(i9, muaVar);
                if (((Boolean) u6qVar.i.a.f.getValue()).booleanValue()) {
                    vq1.A(!qqbVar.x);
                    qqbVar.m = 2;
                }
                vq1.A(!qqbVar.x);
                qqbVar.w = false;
                vq1.A(!qqbVar.x);
                qqbVar.u = 4500L;
                break;
            case 25:
                zl zlVar = (zl) this.b;
                qnq qnqVar2 = (qnq) this.c;
                fhq fhqVar = (fhq) this.d;
                hjl hjlVar2 = (hjl) obj;
                hjlVar2.getClass();
                ((nnk) zlVar.b).getClass();
                qnqVar2.getClass();
                break;
            case 26:
                xhq xhqVar = (xhq) this.b;
                y3 y3Var2 = (y3) this.c;
                qnq qnqVar3 = (qnq) this.d;
                hjl hjlVar3 = (hjl) obj;
                hjlVar3.getClass();
                ((vx6) y3Var2.b).getClass();
                qnqVar3.getClass();
                break;
            case 27:
                x97.y((mm6) this.b, null, null, new v5p((cpa) this.c, (aqi) this.d, fccVar, i6), 3);
                break;
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                ep4 ep4Var = (ep4) this.b;
                String str11 = (String) this.c;
                Function0 function02 = (Function0) this.d;
                jfp jfpVar = (jfp) obj;
                jfpVar.getClass();
                xfp xfpVar = hfp.w;
                int ordinal2 = ep4Var.ordinal();
                if (ordinal2 == 0 || ordinal2 == 1) {
                    obj2 = c5b.a;
                } else if (ordinal2 != 2) {
                    b6e.s();
                    break;
                } else {
                    obj2 = t75.c(new nw6(str11, new g1j(22, function02)));
                }
                jfpVar.o(xfpVar, obj2);
                break;
            default:
                List list6 = (List) this.b;
                List list7 = (List) this.c;
                List list8 = (List) this.d;
                jfp jfpVar2 = (jfp) obj;
                jfpVar2.getClass();
                jfpVar2.o(hfp.w, CollectionsKt.g0(CollectionsKt.g0(list6, list7), list8));
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ p3e(int i, Object obj, Object obj2, Object obj3) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    public /* synthetic */ p3e(mqs mqsVar, k68 k68Var, tbb tbbVar) {
        this.a = 10;
        this.c = mqsVar;
        this.b = k68Var;
        this.d = tbbVar;
    }
}
