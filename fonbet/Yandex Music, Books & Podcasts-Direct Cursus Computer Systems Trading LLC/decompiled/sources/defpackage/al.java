package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.view.View;
import com.connectsdk.service.DeviceService;
import com.yandex.pulse.metrics.o;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes3.dex */
public final class al extends uif implements Function1 {
    public final /* synthetic */ int r;
    public final /* synthetic */ Object s;
    public final /* synthetic */ Object t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public al(hg3 hg3Var, Function0 function0) {
        super(1);
        this.r = 13;
        this.t = hg3Var;
        this.s = (uif) function0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v21, types: [kotlin.jvm.functions.Function0, uif] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        qnn qnnVar;
        Object obj2;
        List list;
        Object obj3;
        boolean z;
        Object obj4;
        int i = 8;
        switch (this.r) {
            case 0:
                return ((u4) this.t).invoke(((List) this.s).get(((Number) obj).intValue()));
            case 1:
                int intValue = ((Number) obj).intValue();
                return ((j3) this.t).invoke(Integer.valueOf(intValue), ((List) this.s).get(intValue));
            case 2:
                int intValue2 = ((Number) obj).intValue();
                return ((j3) this.t).invoke(Integer.valueOf(intValue2), ((ArrayList) this.s).get(intValue2));
            case 3:
                Context context = (Context) this.t;
                Context applicationContext = context.getApplicationContext();
                nf0 nf0Var = (nf0) this.s;
                applicationContext.registerComponentCallbacks(nf0Var);
                return new mf0(0, context, nf0Var);
            case 4:
                Context context2 = (Context) this.t;
                Context applicationContext2 = context2.getApplicationContext();
                of0 of0Var = (of0) this.s;
                applicationContext2.registerComponentCallbacks(of0Var);
                return new mf0(1, context2, of0Var);
            case 5:
                return new rne((bxf) this.t, new k5(3, (th0) this.s));
            case 6:
                rne rneVar = (rne) this.t;
                synchronized (rneVar.c) {
                    try {
                        rneVar.e = true;
                        eqi eqiVar = rneVar.d;
                        Object[] objArr = eqiVar.a;
                        int i2 = eqiVar.c;
                        for (int i3 = 0; i3 < i2; i3++) {
                            wgj wgjVar = (wgj) ((cbv) objArr[i3]).get();
                            if (wgjVar != null && (qnnVar = wgjVar.b) != null) {
                                qnnVar.closeConnection();
                                wgjVar.b = null;
                            }
                        }
                        rneVar.d.i();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                lcs lcsVar = ((th0) this.s).b;
                lcsVar.b.set(null);
                lcsVar.a.b();
                return Unit.a;
            case 7:
                jhm jhmVar = (jhm) this.t;
                jhmVar.setPositionProvider((ohm) this.s);
                jhmVar.w();
                return new wh0(0);
            case 8:
                bj0 bj0Var = (bj0) this.t;
                cj0 cj0Var = (cj0) this.s;
                synchronized (bj0Var.f) {
                    bj0Var.h.remove(cj0Var);
                }
                return Unit.a;
            case 9:
                ((dj0) this.t).a.removeFrameCallback((cj0) this.s);
                return Unit.a;
            case 10:
                ((mpf) this.t).c0(((yci) obj).f((yci) this.s));
                return Unit.a;
            case 11:
                ((jsk) obj).d((ksk) this.t, 0, 0, ((zd6) this.s).c.e());
                return Unit.a;
            case 12:
                return ((zs0) this.t).invoke(((ArrayList) this.s).get(((Number) obj).intValue()));
            case 13:
                Function1 function1 = (Function1) obj;
                function1.getClass();
                ((hg3) this.t).submit(new qf0((Function0) this.s, function1));
                return Unit.a;
            case 14:
                String str = (String) obj;
                str.getClass();
                dj2 dj2Var = (dj2) this.t;
                dj2Var.f = str;
                n9i n9iVar = (n9i) this.s;
                if (str.equals(n9iVar.a)) {
                    g0c g0cVar = dj2Var.e;
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    r1f r1fVar = r1f.a;
                    vtm k = su4.k("При обновлении токена авторизации получен такой же токен", linkedHashMap, DeviceService.KEY_DESC, linkedHashMap);
                    ci0 ci0Var = qjb.a;
                    ci0Var.a = su4.g(1, ci0Var.a);
                    k.u(qee.n() + ci0Var.a, "eventus_id");
                    ((x60) g0cVar).a(su4.j(k, "event_name", "received_same_oauth_token", "received_same_oauth_token", k));
                }
                return new n9i(str, n9iVar.b);
            case 15:
                List list2 = (List) obj;
                list2.getClass();
                rl2 rl2Var = (rl2) this.t;
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("https://qr.nspk.ru/"));
                intent.addCategory("android.intent.category.BROWSABLE");
                Context context3 = rl2Var.a;
                PackageManager packageManager = context3.getPackageManager();
                List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse("https://www.example.com")), 0);
                queryIntentActivities.getClass();
                List<ResolveInfo> queryIntentActivities2 = packageManager.queryIntentActivities(intent, 64);
                queryIntentActivities2.getClass();
                ArrayList arrayList = new ArrayList();
                for (Object obj5 : queryIntentActivities2) {
                    ResolveInfo resolveInfo = (ResolveInfo) obj5;
                    Iterator<T> it = queryIntentActivities.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj4 = it.next();
                            if (Intrinsics.d(resolveInfo.activityInfo.packageName, ((ResolveInfo) obj4).activityInfo.packageName)) {
                            }
                        } else {
                            obj4 = null;
                        }
                    }
                    if (obj4 == null) {
                        arrayList.add(obj5);
                    }
                }
                PackageManager packageManager2 = context3.getPackageManager();
                ArrayList arrayList2 = new ArrayList();
                List<ApplicationInfo> installedApplications = packageManager2.getInstalledApplications(0);
                installedApplications.getClass();
                for (ApplicationInfo applicationInfo : installedApplications) {
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj6 : list2) {
                        String str2 = ((hgj) obj6).d;
                        if (str2 != null) {
                            String str3 = applicationInfo.packageName;
                            str3.getClass();
                            z = StringsKt.M(str3, str2, false);
                        } else {
                            z = false;
                        }
                        if (z) {
                            arrayList3.add(obj6);
                        }
                    }
                    Iterator it2 = arrayList3.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            obj2 = it2.next();
                            if (Intrinsics.d(((hgj) obj2).d, applicationInfo.packageName)) {
                            }
                        } else {
                            obj2 = null;
                        }
                    }
                    hgj hgjVar = (hgj) obj2;
                    if (hgjVar == null) {
                        hgjVar = (hgj) CollectionsKt.firstOrNull(arrayList3);
                    }
                    if (hgjVar == null) {
                        list = list2;
                    } else {
                        String str4 = hgjVar.h;
                        String str5 = hgjVar.c;
                        Boolean bool = hgjVar.g;
                        Boolean bool2 = hgjVar.f;
                        String str6 = hgjVar.e;
                        Iterator it3 = arrayList.iterator();
                        while (true) {
                            if (it3.hasNext()) {
                                obj3 = it3.next();
                                list = list2;
                                if (!Intrinsics.d(((ResolveInfo) obj3).activityInfo.packageName, applicationInfo.packageName)) {
                                    list2 = list;
                                }
                            } else {
                                list = list2;
                                obj3 = null;
                            }
                        }
                        ResolveInfo resolveInfo2 = (ResolveInfo) obj3;
                        if (resolveInfo2 != null) {
                            arrayList2.add(new fl2(resolveInfo2.activityInfo.loadLabel(packageManager2).toString(), str5, resolveInfo2, str6 == null ? "" : str6, qdq.B(bool2), str4, qdq.C(bool)));
                        } else {
                            Intent intent2 = new Intent();
                            intent2.setPackage(applicationInfo.packageName);
                            intent2.addCategory("android.intent.category.LAUNCHER");
                            ResolveInfo resolveActivity = packageManager2.resolveActivity(intent2, 0);
                            if (resolveActivity != null) {
                                arrayList2.add(new fl2(resolveActivity.activityInfo.loadLabel(packageManager2).toString(), str5, resolveActivity, str6 == null ? "" : str6, qdq.B(bool2), str4, qdq.C(bool)));
                            }
                        }
                    }
                    list2 = list;
                }
                HashSet hashSet = new HashSet();
                ArrayList arrayList4 = new ArrayList();
                Iterator it4 = arrayList2.iterator();
                while (it4.hasNext()) {
                    Object next = it4.next();
                    if (hashSet.add(((fl2) next).b)) {
                        arrayList4.add(next);
                    }
                }
                qdq.A(new ha0(8, (kpm) this.s, arrayList4));
                return Unit.a;
            case 16:
                View view = (View) obj;
                if (!(view instanceof mm9)) {
                    return Boolean.TRUE;
                }
                mm9 mm9Var = (mm9) view;
                ob8 div = mm9Var.getDiv();
                if (div == null) {
                    return Boolean.FALSE;
                }
                pm9 path = mm9Var.getPath();
                if (path == null) {
                    return Boolean.FALSE;
                }
                ((hp8) this.t).b((e23) this.s, view, div, path.g());
                return Boolean.FALSE;
            case 17:
                ybs ybsVar = (ybs) obj;
                if (!Intrinsics.d((ybs) this.t, ybsVar)) {
                    ((Function1) this.s).invoke(ybsVar);
                }
                return Unit.a;
            case 18:
                wle wleVar = (wle) obj;
                wleVar.getClass();
                String str7 = wleVar.k;
                str7.getClass();
                y7g.e = str7;
                j03 j03Var = (j03) this.t;
                x60 x60Var = j03Var.h;
                String str8 = wleVar.h;
                str8.getClass();
                x60Var.b.a.put("purchase_token", str8);
                wm wmVar = x60Var.b;
                if (wleVar.j != null) {
                    wmVar.a.put("acquirer", "kassa");
                }
                String str9 = wleVar.l;
                yhk yhkVar = wleVar.o;
                String str10 = yhkVar != null ? yhkVar.a : null;
                String str11 = wleVar.m;
                str9.getClass();
                str11.getClass();
                LinkedHashMap linkedHashMap2 = wmVar.a;
                linkedHashMap2.put("purchase_total_amount", str9);
                if (str10 != null) {
                    linkedHashMap2.put("purchase_card_amount", str10);
                }
                linkedHashMap2.put("purchase_currency", str11);
                int i4 = q7w.b;
                String valueOf = String.valueOf(System.currentTimeMillis());
                valueOf.getClass();
                wmVar.a.put("initialization_id", valueOf);
                j03Var.l = wleVar;
                j03Var.m = ((dhk) this.s).b;
                j03Var.p = Intrinsics.d(wleVar.g, "psp");
                j03Var.q = wleVar.q;
                qre qreVar = wleVar.t;
                j03Var.k.invoke(qreVar);
                ((x60) j03Var.g).a(gut.M(qreVar != null ? qreVar.a : null));
                return nif.d(wleVar);
            case 19:
                k13 k13Var = (k13) obj;
                k13Var.getClass();
                bz2 bz2Var = new bz2(5, (jzi) this.t);
                t23 t23Var = (t23) this.s;
                g0c g0cVar2 = t23Var.k;
                String str12 = k13Var.d;
                str12.getClass();
                String concat = "Получен purchase token привязочного платежа: ".concat(str12);
                LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                r1f r1fVar2 = r1f.a;
                linkedHashMap3.put("sbp_bind_purchase_token", new jkr(str12));
                linkedHashMap3.put(DeviceService.KEY_DESC, new jkr(concat));
                vtm vtmVar = new vtm((Map) linkedHashMap3);
                ci0 ci0Var2 = qjb.a;
                ci0Var2.a = su4.g(1, ci0Var2.a);
                vtmVar.u(qee.n() + ci0Var2.a, "eventus_id");
                ((x60) g0cVar2).a(su4.j(vtmVar, "event_name", "bind_sbp_token_received_purchase_token", "bind_sbp_token_received_purchase_token", vtmVar));
                n20 n20Var = new n20();
                t23Var.o = n20Var;
                return mif.a(mif.a(fxf.V(new p23(t23Var, str12, 1), new m40(13, bz2Var), new xdh((Object) null, new zfm(), t23Var.m.a, n20Var)), lhb.z0, rq1.H, 1), rq1.I, null, 5).c(new q23(t23Var, 1));
            case 20:
                i3j i3jVar = (i3j) obj;
                i3jVar.getClass();
                String str13 = i3jVar.a;
                t23 t23Var2 = (t23) this.t;
                bj4 bj4Var = new bj4(str13, t23Var2.h, 2);
                g0c g0cVar3 = t23Var2.k;
                String concat2 = "Завершение привязки: bind_card_binding_id = ".concat(str13);
                LinkedHashMap linkedHashMap4 = new LinkedHashMap();
                r1f r1fVar3 = r1f.a;
                linkedHashMap4.put("bind_card_binding_id", new jkr(str13));
                linkedHashMap4.put(DeviceService.KEY_DESC, new jkr(concat2));
                vtm vtmVar2 = new vtm((Map) linkedHashMap4);
                ci0 ci0Var3 = qjb.a;
                ci0Var3.a = up6.z(1) + ci0Var3.a;
                vtmVar2.u(qee.n() + ci0Var3.a, "eventus_id");
                x60 x60Var2 = (x60) g0cVar3;
                x60Var2.a(su4.j(vtmVar2, "event_name", "bind_new_card_binding_completed", "bind_new_card_binding_completed", vtmVar2));
                LinkedHashMap linkedHashMap5 = new LinkedHashMap();
                vtm k2 = su4.k("Запрос на верификацию новой карты", linkedHashMap5, DeviceService.KEY_DESC, linkedHashMap5);
                ci0Var3.a = up6.z(1) + ci0Var3.a;
                k2.u(qee.n() + ci0Var3.a, "eventus_id");
                qne j = su4.j(k2, "event_name", "bind_new_card_verify_verify", "bind_new_card_verify_verify", k2);
                yop C = t23Var2.f.a.C(bj4Var, k9i.t, p1j.a);
                x60Var2.b(j, C);
                return mif.a(C, new lj0(i, t23Var2, i3jVar, (jzi) this.s), null, 5);
            case 21:
                mwt mwtVar = (mwt) obj;
                mwtVar.getClass();
                t23 t23Var3 = (t23) this.t;
                g0c g0cVar4 = t23Var3.k;
                String str14 = mwtVar.b;
                String str15 = mwtVar.c;
                String str16 = mwtVar.a;
                String str17 = mwtVar.d;
                String str18 = str17 == null ? "" : str17;
                String str19 = str15 == null ? "" : str15;
                String o = ouj.o(ouj.o(ouj.o("Начало верификации новой карты при привязке через Vera: bind_card_binding_id = ".concat(str14), ", bind_card_verification_id = ", str16), ", bind_card_message_code = ", str18), ", bind_card_status = ", str19);
                LinkedHashMap linkedHashMap6 = new LinkedHashMap();
                r1f r1fVar4 = r1f.a;
                w1g.B(linkedHashMap6, "bind_card_binding_id", new jkr(str14));
                w1g.B(linkedHashMap6, "bind_card_verification_id", new jkr(str16));
                w1g.B(linkedHashMap6, "bind_card_message_code", new jkr(str18));
                w1g.B(linkedHashMap6, "bind_card_status", new jkr(str19));
                w1g.B(linkedHashMap6, DeviceService.KEY_DESC, new jkr(o));
                vtm vtmVar3 = new vtm((Map) linkedHashMap6);
                ci0 ci0Var4 = qjb.a;
                ci0Var4.a = su4.g(1, ci0Var4.a);
                vtmVar3.u(qee.n() + ci0Var4.a, "eventus_id");
                ((x60) g0cVar4).a(su4.j(vtmVar3, "event_name", "new_card_binding_psp_verification_started", "new_card_binding_psp_verification_started", vtmVar3));
                if (Intrinsics.d(str15, "warning")) {
                    ((x60) g0cVar4).a(gut.M0(str17 == null ? "" : str17));
                    return nif.c(new k03(q1c.C, r1c.b, null, mwtVar.c, str17 == null ? "" : str17));
                }
                xzi xziVar = (xzi) this.s;
                xdh xdhVar = new xdh(new o23(xziVar, 0), new o23(xziVar, 1), g0cVar4);
                n20 n20Var2 = new n20();
                t23Var3.o = n20Var2;
                return mif.b(mif.a(fxf.V(new p23(t23Var3, str16, 2), new d03(xdhVar, 1), new xdh((Object) null, new zfm(), t23Var3.m.a, n20Var2)), lhb.z0, rq1.K, 1).c(new q23(t23Var3, 3)), new m40(15, mwtVar), null, 5);
            case 22:
                jsk.l((jsk) obj, (ksk) this.t, 0, 0, ((y43) this.s).o, 4);
                return Unit.a;
            case 23:
                int intValue3 = ((Number) obj).intValue();
                return ((t83) this.t).invoke(Integer.valueOf(intValue3), ((ArrayList) this.s).get(intValue3));
            case 24:
                opf opfVar = (opf) obj;
                opfVar.a();
                jpa.C(opfVar, ((zxj) this.t).j, (ai3) this.s, 0.0f, null, 60);
                return Unit.a;
            case 25:
                opf opfVar2 = (opf) obj;
                opfVar2.a();
                jpa.C(opfVar2, (nh0) this.t, (ai3) this.s, 0.0f, null, 60);
                return Unit.a;
            case 26:
                ((eqi) ((xzi) this.t).a).l((cc6) this.s);
                return Unit.a;
            case 27:
                wh3 wh3Var = (wh3) this.t;
                Object obj7 = wh3Var.b;
                vh3 vh3Var = (vh3) this.s;
                synchronized (obj7) {
                    wh3Var.d.remove(vh3Var);
                    if (wh3Var.d.isEmpty()) {
                        wh3Var.f.set(0);
                    }
                }
                return Unit.a;
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                long j2 = ((enj) obj).a;
                cds cdsVar = (cds) ((aqi) this.t).getValue();
                if (cdsVar != null) {
                    ((Function1) this.s).invoke(Integer.valueOf(cdsVar.b.i(j2)));
                }
                return Unit.a;
            default:
                int intValue4 = ((Number) obj).intValue();
                return ((t83) this.t).invoke(Integer.valueOf(intValue4), ((ArrayList) this.s).get(intValue4));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ al(int i, Object obj, Object obj2) {
        super(1);
        this.r = i;
        this.t = obj;
        this.s = obj2;
    }
}
