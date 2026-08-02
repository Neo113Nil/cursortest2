package com.yandex.plus.bdui.plus.scenario;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.util.DisplayMetrics;
import android.view.accessibility.AccessibilityManager;
import androidx.fragment.app.t;
import com.connectsdk.discovery.provider.ssdp.SSDPDeviceDescriptionParser;
import com.yandex.passport.internal.methods.performer.v0;
import com.yandex.passport.internal.ui.sloth.authsdk.h0;
import com.yandex.passport.sloth.command.data.k0;
import com.yandex.plus.bdui.a0;
import com.yandex.plus.bdui.b0;
import com.yandex.plus.bdui.plus.checkout.content.serializer.dto.r1;
import com.yandex.plus.bdui.plus.content.serializer.h2;
import com.yandex.plus.bdui.r;
import com.yandex.plus.bdui.s;
import com.yandex.plus.bdui.u;
import com.yandex.plus.bdui.v;
import com.yandex.plus.bdui.w;
import com.yandex.plus.bdui.y;
import com.yandex.plus.bdui.z;
import com.yandex.plus.core.benchmark.x;
import defpackage.af7;
import defpackage.akl;
import defpackage.ant;
import defpackage.apo;
import defpackage.b6e;
import defpackage.bh;
import defpackage.bnd;
import defpackage.btf;
import defpackage.c1t;
import defpackage.c5b;
import defpackage.c76;
import defpackage.cd6;
import defpackage.de6;
import defpackage.deq;
import defpackage.dv7;
import defpackage.dzj;
import defpackage.e5b;
import defpackage.ee7;
import defpackage.eeq;
import defpackage.efo;
import defpackage.ek2;
import defpackage.en9;
import defpackage.ern;
import defpackage.ev7;
import defpackage.evw;
import defpackage.ezj;
import defpackage.f6p;
import defpackage.fe7;
import defpackage.fk2;
import defpackage.g0q;
import defpackage.g6a;
import defpackage.geq;
import defpackage.gh7;
import defpackage.gk2;
import defpackage.gso;
import defpackage.h0l;
import defpackage.heq;
import defpackage.hnt;
import defpackage.iso;
import defpackage.iun;
import defpackage.jip;
import defpackage.joj;
import defpackage.jt6;
import defpackage.jun;
import defpackage.jy7;
import defpackage.jyr;
import defpackage.kb6;
import defpackage.ke7;
import defpackage.kkp;
import defpackage.knt;
import defpackage.kt4;
import defpackage.le3;
import defpackage.lnt;
import defpackage.lsc;
import defpackage.ly7;
import defpackage.mdn;
import defpackage.mmf;
import defpackage.msc;
import defpackage.nun;
import defpackage.nyf;
import defpackage.o3a;
import defpackage.o91;
import defpackage.og;
import defpackage.os;
import defpackage.oy7;
import defpackage.pe7;
import defpackage.ps;
import defpackage.pyc;
import defpackage.q98;
import defpackage.qg;
import defpackage.qne;
import defpackage.qpj;
import defpackage.qs;
import defpackage.r7b;
import defpackage.r98;
import defpackage.reg;
import defpackage.ri7;
import defpackage.spn;
import defpackage.t0a;
import defpackage.t4a;
import defpackage.t4d;
import defpackage.t75;
import defpackage.tah;
import defpackage.tf6;
import defpackage.tpn;
import defpackage.tzi;
import defpackage.u75;
import defpackage.uah;
import defpackage.ub6;
import defpackage.v75;
import defpackage.vb6;
import defpackage.vtn;
import defpackage.vwb;
import defpackage.vx6;
import defpackage.wxd;
import defpackage.wxf;
import defpackage.xiu;
import defpackage.xq0;
import defpackage.xqn;
import defpackage.xxd;
import defpackage.xz0;
import defpackage.yfx;
import defpackage.yg;
import defpackage.ytn;
import defpackage.z3;
import defpackage.z75;
import defpackage.ztn;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.OkHttpClient;
import timber.log.Timber;

/* loaded from: classes4.dex */
public final class m {
    public static final NumberFormat G = NumberFormat.getInstance(Locale.US);
    public final kotlinx.coroutines.a A;
    public final tf6 B;
    public final tf6 C;
    public final com.yandex.plus.log.api.b D;
    public final jyr E;
    public final Function2 F;
    public final r a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final Long f;
    public final com.yandex.plus.bdui.plus.checkout.h g;
    public final com.yandex.plus.bdui.plus.checkout.h h;
    public final com.yandex.plus.bdui.content.b i;
    public final com.yandex.plus.metrica.utils.i j;
    public final String k;
    public final com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.common.di.k l;
    public final com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.common.di.j m;
    public final com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.ui.o n;
    public final com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.ui.o o;
    public final com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.ui.o p;
    public final com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.ui.q q;
    public final List r;
    public final com.yandex.plus.bdui.plus.checkout.m s;
    public final com.yandex.plus.bdui.plus.checkout.o t;
    public final com.yandex.plus.bdui.plus.content.controller.f u;
    public final com.yandex.plus.bdui.flex.factory.e v;
    public final x w;
    public final com.yandex.plus.bdui.templating.render.a x;
    public final com.yandex.plus.bdui.plus.checkout.k y;
    public final kotlinx.coroutines.a z;

    public m(r rVar, String str, String str2, String str3, String str4, Long l, com.yandex.plus.bdui.plus.checkout.h hVar, com.yandex.plus.bdui.plus.checkout.h hVar2, com.yandex.plus.bdui.content.b bVar, com.yandex.plus.metrica.utils.i iVar, String str5, com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.common.di.k kVar, com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.common.di.j jVar, com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.ui.o oVar, com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.ui.o oVar2, com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.ui.o oVar3, com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.ui.q qVar, List list, com.yandex.plus.bdui.plus.checkout.m mVar, com.yandex.plus.bdui.plus.checkout.o oVar4, com.yandex.plus.bdui.plus.checkout.action.a aVar, androidx.core.app.q qVar2, com.yandex.plus.bdui.plus.content.controller.f fVar, com.yandex.plus.bdui.flex.factory.e eVar, x xVar, com.yandex.plus.bdui.templating.render.a aVar2, com.yandex.plus.bdui.plus.checkout.k kVar2, kotlinx.coroutines.a aVar3, kotlinx.coroutines.a aVar4, tf6 tf6Var, tf6 tf6Var2, com.yandex.plus.log.api.b bVar2) {
        p[] pVarArr = p.a;
        rVar.getClass();
        str.getClass();
        iVar.getClass();
        xVar.getClass();
        aVar3.getClass();
        aVar4.getClass();
        bVar2.getClass();
        this.a = rVar;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = l;
        this.g = hVar;
        this.h = hVar2;
        this.i = bVar;
        this.j = iVar;
        this.k = str5;
        this.l = kVar;
        this.m = jVar;
        this.n = oVar;
        this.o = oVar2;
        this.p = oVar3;
        this.q = qVar;
        this.r = list;
        this.s = mVar;
        this.t = oVar4;
        this.u = fVar;
        this.v = eVar;
        this.w = xVar;
        this.x = aVar2;
        this.y = kVar2;
        this.z = aVar3;
        this.A = aVar4;
        this.B = tf6Var;
        this.C = tf6Var2;
        this.D = bVar2;
        this.E = btf.b(new com.yandex.plus.bdui.plus.content.serializer.b(25));
        Function2 function2 = mVar.b().d;
        if (function2 != null) {
            this.F = function2;
        } else {
            xq0.x("Controller factory must be defined for failure content descriptor!");
            throw null;
        }
    }

    public static void c(boolean z, com.yandex.passport.internal.social.d dVar, com.yandex.plus.bdui.m mVar, com.yandex.plus.bdui.query.b bVar) {
        if (dVar.b == 0 && z) {
            mVar.a.a(new com.yandex.plus.bdui.plus.action.f(new com.yandex.plus.bdui.l(new com.yandex.plus.bdui.g(com.yandex.plus.bdui.f.b), null), bVar), new com.yandex.plus.bdui.action.h(com.yandex.plus.bdui.shared.b.a), null);
        }
    }

    public final com.yandex.plus.bdui.document.e a(boolean z) {
        return new com.yandex.plus.bdui.document.e(new com.yandex.plus.bdui.plus.checkout.content.n(z ? new com.yandex.plus.bdui.plus.action.f(new com.yandex.plus.bdui.l(com.yandex.plus.bdui.e.a, null)) : null), null, com.yandex.plus.bdui.shared.b.a, null);
    }

    public final Map b(Context context) {
        return uah.e(new Pair(CommonUrlParts.LOCALE, this.g.invoke()), new Pair("theme", ((Boolean) this.i.invoke()).booleanValue() ? "DARK" : "LIGHT"), new Pair("displaySize", G.format(Float.valueOf(com.yandex.plus.home.common.utils.a.c(context)))), new Pair("dpi", String.valueOf(context.getResources().getDisplayMetrics().densityDpi)));
    }

    public final com.yandex.plus.bdui.query.e d(t tVar, String str, s sVar, Map map, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, l lVar, com.yandex.plus.bdui.plus.analytics.c cVar) {
        String str2;
        ArrayList arrayList5 = new ArrayList(v75.o(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList5.add(((b0) it.next()).getSupportedFeatures());
        }
        ArrayList arrayList6 = new ArrayList(v75.o(arrayList2, 10));
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            arrayList6.add(((b0) it2.next()).getSupportedFeatures());
        }
        ArrayList g0 = CollectionsKt.g0(arrayList5, arrayList6);
        ArrayList arrayList7 = new ArrayList(v75.o(arrayList3, 10));
        Iterator it3 = arrayList3.iterator();
        while (it3.hasNext()) {
            arrayList7.add(((b0) it3.next()).getSupportedFeatures());
        }
        ArrayList g02 = CollectionsKt.g0(g0, arrayList7);
        ArrayList arrayList8 = new ArrayList(v75.o(arrayList4, 10));
        Iterator it4 = arrayList4.iterator();
        while (it4.hasNext()) {
            arrayList8.add(((b0) it4.next()).getSupportedFeatures());
        }
        ArrayList h0 = CollectionsKt.h0(CollectionsKt.g0(CollectionsKt.g0(g02, arrayList8), t75.c(lVar.getSupportedFeatures())), cVar.getSupportedFeatures());
        Map map2 = e5b.a;
        map2.getClass();
        Iterator it5 = h0.iterator();
        while (it5.hasNext()) {
            map2 = com.yandex.plus.core.network.api.utils.a.y(map2, (Map) it5.next());
        }
        Map b = tah.b(new Pair("idempotencyKey", t75.c(UUID.randomUUID().toString())));
        this.l.invoke();
        DisplayMetrics displayMetrics = tVar.getResources().getDisplayMetrics();
        displayMetrics.getClass();
        Pair pair = new Pair("screenWidth", Integer.valueOf(Math.min(displayMetrics.widthPixels, displayMetrics.heightPixels)));
        DisplayMetrics displayMetrics2 = tVar.getResources().getDisplayMetrics();
        displayMetrics2.getClass();
        Pair pair2 = new Pair("screenHeight", Integer.valueOf(Math.max(displayMetrics2.widthPixels, displayMetrics2.heightPixels)));
        Pair pair3 = new Pair("flowId", sVar.a);
        Pair pair4 = new Pair("flowVersion", sVar.b);
        LinkedHashMap linkedHashMap = new LinkedHashMap(tah.a(map2.size()));
        for (Map.Entry entry : map2.entrySet()) {
            a0 a0Var = (a0) entry.getKey();
            if (Intrinsics.d(a0Var, com.yandex.plus.bdui.t.a)) {
                str2 = "actions";
            } else if (Intrinsics.d(a0Var, v.a)) {
                str2 = "contentTypes";
            } else if (Intrinsics.d(a0Var, y.a)) {
                str2 = "scaffolds";
            } else if (Intrinsics.d(a0Var, z.a)) {
                str2 = "sharedDataSlices";
            } else if (Intrinsics.d(a0Var, com.yandex.plus.bdui.x.a)) {
                str2 = "placeholders";
            } else if (Intrinsics.d(a0Var, u.a)) {
                str2 = "analyticsTransport";
            } else {
                if (!(a0Var instanceof w)) {
                    b6e.s();
                    return null;
                }
                str2 = ((w) a0Var).a;
            }
            linkedHashMap.put(str2, entry.getValue());
        }
        Pair pair5 = new Pair("supported", linkedHashMap);
        Pair pair6 = new Pair("brand", ((com.yandex.plus.core.strings.a) this.h.b).toString());
        p[] pVarArr = p.a;
        Pair pair7 = new Pair("platform", "ANDROID");
        Pair pair8 = new Pair("os", "Android");
        Pair pair9 = new Pair("osVersion", Build.VERSION.RELEASE);
        Pair pair10 = new Pair("apiLevel", Integer.valueOf(Build.VERSION.SDK_INT));
        Pair pair11 = new Pair("appId", this.d);
        Pair pair12 = new Pair("appVersion", this.e);
        Object systemService = tVar.getSystemService("accessibility");
        AccessibilityManager accessibilityManager = systemService instanceof AccessibilityManager ? (AccessibilityManager) systemService : null;
        Pair pair13 = new Pair("isScreenReaderEnabled", Boolean.valueOf(accessibilityManager != null && accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()));
        Pair pair14 = new Pair("manufacturer", Build.MANUFACTURER);
        Pair pair15 = new Pair(CommonUrlParts.MODEL, Build.MODEL);
        com.yandex.plus.metrica.utils.i iVar = this.j;
        return new com.yandex.plus.bdui.query.e(str, b, r1.w(r1.w(r1.v(pair, pair2, pair3, pair4, pair5, pair6, pair7, pair8, pair9, pair10, pair11, pair12, pair13, pair14, pair15, new Pair("uuid", iVar.b()), new Pair("deviceId", iVar.a()), new Pair("clid", this.k), new Pair("appVersionCode", this.f), new Pair(SSDPDeviceDescriptionParser.TAG_LOCATION, null), new Pair("geoPinPosition", null)), b(tVar), false), map, false));
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0625  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0a24  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0a7b  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0b01  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0b33 A[LOOP:17: B:175:0x0b2d->B:177:0x0b33, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0b83  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0bf7  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0c87  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0cad  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0cbe A[LOOP:21: B:215:0x0cb8->B:217:0x0cbe, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0d02  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0d27  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0d37 A[LOOP:23: B:233:0x0d31->B:235:0x0d37, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0d78 A[LOOP:24: B:238:0x0d72->B:240:0x0d78, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0d98 A[LOOP:25: B:243:0x0d92->B:245:0x0d98, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0ee1  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00bf A[LOOP:1: B:22:0x00b9->B:24:0x00bf, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0f03  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0220 A[LOOP:2: B:27:0x021a->B:29:0x0220, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x023b A[LOOP:3: B:32:0x0235->B:34:0x023b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x02a8 A[LOOP:5: B:48:0x02a2->B:50:0x02a8, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x02ee A[LOOP:7: B:63:0x02e8->B:65:0x02ee, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0368  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0385 A[LOOP:9: B:79:0x037f->B:81:0x0385, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x03a6  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x055b  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x056c A[LOOP:12: B:97:0x0566->B:99:0x056c, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final n e(t tVar, int i, String str, s sVar, boolean z, Map map, Bundle bundle) {
        com.yandex.plus.bdui.plus.benchmarks.a aVar;
        com.yandex.passport.internal.social.d dVar;
        Iterator it;
        Iterator it2;
        Iterator it3;
        Iterator it4;
        Iterator it5;
        Iterator it6;
        Iterator it7;
        Iterator it8;
        Iterator it9;
        Iterator it10;
        Iterator it11;
        xqn xqnVar;
        int a;
        Iterator it12;
        Iterator it13;
        xqn xqnVar2;
        Iterator it14;
        Iterator it15;
        Iterator it16;
        Iterator it17;
        Iterator it18;
        Iterator it19;
        Iterator it20;
        int a2;
        Iterator it21;
        Iterator it22;
        Iterator it23;
        Iterator it24;
        Iterator it25;
        com.yandex.plus.bdui.query.e eVar;
        s sVar2;
        Iterator it26;
        ArrayList arrayList;
        Iterator it27;
        ArrayList arrayList2;
        com.yandex.plus.log.api.b bVar;
        jip jipVar;
        Iterator it28;
        com.yandex.plus.log.api.b bVar2;
        jip jipVar2;
        tVar.getClass();
        str.getClass();
        sVar.getClass();
        map.getClass();
        xqn xqnVar3 = new xqn();
        final int i2 = 0;
        b bVar3 = new b(this, 0);
        Long l = (Long) bVar3.invoke();
        q qVar = bundle != null ? (q) ((Parcelable) vwb.O(bundle, q.class, "PlusDocumentScenario.LastSessionState[" + sVar + ']')) : null;
        x xVar = this.w;
        if (qVar != null) {
            Long l2 = qVar.a;
            if (Intrinsics.d(l2, l)) {
                com.yandex.passport.internal.social.d dVar2 = new com.yandex.passport.internal.social.d(l2, qVar.b, qVar.c);
                aVar = new com.yandex.plus.bdui.plus.benchmarks.a(xVar, qVar.d, qVar.e);
                dVar = dVar2;
                final com.yandex.plus.bdui.plus.benchmarks.a aVar2 = aVar;
                final int i3 = 1;
                com.yandex.plus.bdui.plus.analytics.c cVar = (com.yandex.plus.bdui.plus.analytics.c) this.y.invoke(new Function0() { // from class: com.yandex.plus.bdui.plus.scenario.d
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i2) {
                            case 0:
                                return aVar2;
                            default:
                                return (com.yandex.plus.core.benchmark.t) aVar2.c.getValue();
                        }
                    }
                }, new Function0() { // from class: com.yandex.plus.bdui.plus.scenario.d
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i3) {
                            case 0:
                                return aVar2;
                            default:
                                return (com.yandex.plus.core.benchmark.t) aVar2.c.getValue();
                        }
                    }
                }, new b(this, 2));
                List list = this.r;
                ArrayList arrayList3 = new ArrayList();
                it = list.iterator();
                while (it.hasNext()) {
                    Function1 function1 = ((o) it.next()).a;
                    if (function1 != null) {
                        arrayList3.add(function1);
                    }
                }
                ArrayList arrayList4 = new ArrayList();
                it2 = arrayList3.iterator();
                while (it2.hasNext()) {
                    z75.t(arrayList4, (Iterable) ((Function1) it2.next()).invoke(cVar));
                }
                com.yandex.plus.bdui.plus.query.a aVar3 = (com.yandex.plus.bdui.plus.query.a) this.E.getValue();
                e eVar2 = new e(dVar, 1);
                e eVar3 = new e(dVar, 2);
                t0a t0aVar = new t0a(xqnVar3, 5);
                final com.yandex.plus.log.api.b bVar4 = this.D;
                Function2 function2 = new Function2(this) { // from class: com.yandex.plus.bdui.plus.scenario.i
                    public final /* synthetic */ m b;

                    {
                        this.b = this;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        s sVar3 = (s) obj;
                        Function0 function0 = (Function0) obj2;
                        switch (i2) {
                            case 0:
                                sVar3.getClass();
                                function0.getClass();
                                return new com.yandex.plus.bdui.plus.action.serializer.r(function0, this.b.u, bVar4, 0);
                            default:
                                sVar3.getClass();
                                function0.getClass();
                                return new com.yandex.plus.bdui.plus.action.serializer.r(function0, this.b.u, bVar4, 1);
                        }
                    }
                };
                kt4 kt4Var = new kt4(aVar3, t0aVar, this, bVar4, tVar, eVar3, 10);
                e5b e5bVar = e5b.a;
                e5bVar.getClass();
                com.yandex.plus.bdui.action.b bVar5 = new com.yandex.plus.bdui.action.b("PlusNextDocumentAction", function2, ern.a(com.yandex.plus.bdui.plus.action.z.class), kt4Var, e5bVar, true);
                com.yandex.plus.bdui.action.b bVar6 = new com.yandex.plus.bdui.action.b("PlusCloseAction", new com.yandex.plus.bdui.plus.a(bVar4, 16), ern.a(com.yandex.plus.bdui.plus.action.f.class), new pyc(this) { // from class: com.yandex.plus.bdui.plus.scenario.c
                    public final /* synthetic */ m b;

                    {
                        this.b = this;
                    }

                    @Override // defpackage.pyc
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        s sVar3 = (s) obj;
                        Function0 function0 = (Function0) obj2;
                        switch (i3) {
                            case 0:
                                sVar3.getClass();
                                function0.getClass();
                                ((com.yandex.plus.bdui.flex.action.b) obj3).getClass();
                                return new com.yandex.plus.bdui.plus.action.k(new h2(1, this.b.s, com.yandex.plus.bdui.plus.e.class, "getFailureContent", "getFailureContent(Lcom/yandex/plus/bdui/failure/Failure;)Lcom/yandex/plus/bdui/content/FailureContent;", 0, 25), function0, bVar4);
                            case 1:
                                com.yandex.plus.bdui.flex.action.b bVar7 = (com.yandex.plus.bdui.flex.action.b) obj3;
                                sVar3.getClass();
                                function0.getClass();
                                bVar7.getClass();
                                m mVar = this.b;
                                return new com.yandex.plus.bdui.plus.action.g(bVar7, mVar.x, mVar.z, mVar.A, bVar4);
                            case 2:
                                sVar3.getClass();
                                function0.getClass();
                                ((com.yandex.plus.bdui.flex.action.b) obj3).getClass();
                                return new com.yandex.plus.bdui.plus.action.i(this.b.C, bVar4, 0);
                            default:
                                sVar3.getClass();
                                function0.getClass();
                                ((com.yandex.plus.bdui.flex.action.b) obj3).getClass();
                                return new com.yandex.plus.bdui.plus.action.i(this.b.C, bVar4, 1);
                        }
                    }
                }, e5bVar, true);
                com.yandex.plus.bdui.plus.a aVar4 = new com.yandex.plus.bdui.plus.a(bVar4, 17);
                final int i4 = 2;
                final int i5 = 3;
                final int i6 = 0;
                ArrayList g0 = CollectionsKt.g0(arrayList4, u75.h(bVar5, bVar6, new com.yandex.plus.bdui.action.b("PlusDelayAction", aVar4, ern.a(com.yandex.plus.bdui.plus.action.h.class), new pyc(this) { // from class: com.yandex.plus.bdui.plus.scenario.c
                    public final /* synthetic */ m b;

                    {
                        this.b = this;
                    }

                    @Override // defpackage.pyc
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        s sVar3 = (s) obj;
                        Function0 function0 = (Function0) obj2;
                        switch (i4) {
                            case 0:
                                sVar3.getClass();
                                function0.getClass();
                                ((com.yandex.plus.bdui.flex.action.b) obj3).getClass();
                                return new com.yandex.plus.bdui.plus.action.k(new h2(1, this.b.s, com.yandex.plus.bdui.plus.e.class, "getFailureContent", "getFailureContent(Lcom/yandex/plus/bdui/failure/Failure;)Lcom/yandex/plus/bdui/content/FailureContent;", 0, 25), function0, bVar4);
                            case 1:
                                com.yandex.plus.bdui.flex.action.b bVar7 = (com.yandex.plus.bdui.flex.action.b) obj3;
                                sVar3.getClass();
                                function0.getClass();
                                bVar7.getClass();
                                m mVar = this.b;
                                return new com.yandex.plus.bdui.plus.action.g(bVar7, mVar.x, mVar.z, mVar.A, bVar4);
                            case 2:
                                sVar3.getClass();
                                function0.getClass();
                                ((com.yandex.plus.bdui.flex.action.b) obj3).getClass();
                                return new com.yandex.plus.bdui.plus.action.i(this.b.C, bVar4, 0);
                            default:
                                sVar3.getClass();
                                function0.getClass();
                                ((com.yandex.plus.bdui.flex.action.b) obj3).getClass();
                                return new com.yandex.plus.bdui.plus.action.i(this.b.C, bVar4, 1);
                        }
                    }
                }, e5bVar, true), new com.yandex.plus.bdui.action.b("PlusMultiAction", new com.yandex.plus.bdui.plus.a(bVar4, 18), ern.a(com.yandex.plus.bdui.plus.action.l.class), new pyc(this) { // from class: com.yandex.plus.bdui.plus.scenario.c
                    public final /* synthetic */ m b;

                    {
                        this.b = this;
                    }

                    @Override // defpackage.pyc
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        s sVar3 = (s) obj;
                        Function0 function0 = (Function0) obj2;
                        switch (i5) {
                            case 0:
                                sVar3.getClass();
                                function0.getClass();
                                ((com.yandex.plus.bdui.flex.action.b) obj3).getClass();
                                return new com.yandex.plus.bdui.plus.action.k(new h2(1, this.b.s, com.yandex.plus.bdui.plus.e.class, "getFailureContent", "getFailureContent(Lcom/yandex/plus/bdui/failure/Failure;)Lcom/yandex/plus/bdui/content/FailureContent;", 0, 25), function0, bVar4);
                            case 1:
                                com.yandex.plus.bdui.flex.action.b bVar7 = (com.yandex.plus.bdui.flex.action.b) obj3;
                                sVar3.getClass();
                                function0.getClass();
                                bVar7.getClass();
                                m mVar = this.b;
                                return new com.yandex.plus.bdui.plus.action.g(bVar7, mVar.x, mVar.z, mVar.A, bVar4);
                            case 2:
                                sVar3.getClass();
                                function0.getClass();
                                ((com.yandex.plus.bdui.flex.action.b) obj3).getClass();
                                return new com.yandex.plus.bdui.plus.action.i(this.b.C, bVar4, 0);
                            default:
                                sVar3.getClass();
                                function0.getClass();
                                ((com.yandex.plus.bdui.flex.action.b) obj3).getClass();
                                return new com.yandex.plus.bdui.plus.action.i(this.b.C, bVar4, 1);
                        }
                    }
                }, e5bVar, true), new com.yandex.plus.bdui.action.b("PlusSendAnalyticsAction", new com.yandex.plus.bdui.plus.a(bVar4, 19), ern.a(com.yandex.plus.bdui.plus.action.p.class), new f6p(23, cVar, bVar4), e5bVar, false), new com.yandex.plus.bdui.action.b("PlusRemoteAction", new Function2(this) { // from class: com.yandex.plus.bdui.plus.scenario.i
                    public final /* synthetic */ m b;

                    {
                        this.b = this;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        s sVar3 = (s) obj;
                        Function0 function0 = (Function0) obj2;
                        switch (i3) {
                            case 0:
                                sVar3.getClass();
                                function0.getClass();
                                return new com.yandex.plus.bdui.plus.action.serializer.r(function0, this.b.u, bVar4, 0);
                            default:
                                sVar3.getClass();
                                function0.getClass();
                                return new com.yandex.plus.bdui.plus.action.serializer.r(function0, this.b.u, bVar4, 1);
                        }
                    }
                }, ern.a(com.yandex.plus.bdui.plus.action.a0.class), new mdn(aVar3, bVar4, this, tVar, 15), e5bVar, true), new com.yandex.plus.bdui.action.b(null, null, ern.a(com.yandex.plus.bdui.plus.action.n.class), new mdn(eVar2, bVar4, this, eVar3, 16), e5bVar, true), new com.yandex.plus.bdui.action.b(null, null, ern.a(com.yandex.plus.bdui.plus.action.j.class), new pyc(this) { // from class: com.yandex.plus.bdui.plus.scenario.c
                    public final /* synthetic */ m b;

                    {
                        this.b = this;
                    }

                    @Override // defpackage.pyc
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        s sVar3 = (s) obj;
                        Function0 function0 = (Function0) obj2;
                        switch (i6) {
                            case 0:
                                sVar3.getClass();
                                function0.getClass();
                                ((com.yandex.plus.bdui.flex.action.b) obj3).getClass();
                                return new com.yandex.plus.bdui.plus.action.k(new h2(1, this.b.s, com.yandex.plus.bdui.plus.e.class, "getFailureContent", "getFailureContent(Lcom/yandex/plus/bdui/failure/Failure;)Lcom/yandex/plus/bdui/content/FailureContent;", 0, 25), function0, bVar4);
                            case 1:
                                com.yandex.plus.bdui.flex.action.b bVar7 = (com.yandex.plus.bdui.flex.action.b) obj3;
                                sVar3.getClass();
                                function0.getClass();
                                bVar7.getClass();
                                m mVar = this.b;
                                return new com.yandex.plus.bdui.plus.action.g(bVar7, mVar.x, mVar.z, mVar.A, bVar4);
                            case 2:
                                sVar3.getClass();
                                function0.getClass();
                                ((com.yandex.plus.bdui.flex.action.b) obj3).getClass();
                                return new com.yandex.plus.bdui.plus.action.i(this.b.C, bVar4, 0);
                            default:
                                sVar3.getClass();
                                function0.getClass();
                                ((com.yandex.plus.bdui.flex.action.b) obj3).getClass();
                                return new com.yandex.plus.bdui.plus.action.i(this.b.C, bVar4, 1);
                        }
                    }
                }, e5bVar, true)));
                ArrayList arrayList5 = new ArrayList();
                it3 = list.iterator();
                while (it3.hasNext()) {
                    arrayList5.add(((o) it3.next()).b);
                }
                ArrayList arrayList6 = new ArrayList();
                it4 = arrayList5.iterator();
                while (it4.hasNext()) {
                    z75.t(arrayList6, (Iterable) ((Function1) it4.next()).invoke(cVar));
                }
                v0 v0Var = new v0(9);
                e5b e5bVar2 = e5b.a;
                e5bVar2.getClass();
                ArrayList g02 = CollectionsKt.g0(arrayList6, xz0.w(new com.yandex.plus.bdui.content.c[]{new com.yandex.plus.bdui.content.c(null, null, ern.a(com.yandex.plus.bdui.plus.checkout.content.n.class), v0Var, e5bVar2), this.s.b()}));
                ArrayList arrayList7 = new ArrayList();
                it5 = list.iterator();
                while (it5.hasNext()) {
                    Function2 function22 = ((o) it5.next()).c;
                    if (function22 != null) {
                        arrayList7.add(function22);
                    }
                }
                ArrayList arrayList8 = new ArrayList();
                it6 = arrayList7.iterator();
                while (it6.hasNext()) {
                    z75.t(arrayList8, (Iterable) ((Function2) it6.next()).invoke(g02, cVar));
                }
                ArrayList g03 = CollectionsKt.g0(arrayList8, c5b.a);
                ArrayList arrayList9 = new ArrayList();
                it7 = list.iterator();
                while (it7.hasNext()) {
                    Function0 function0 = ((o) it7.next()).d;
                    if (function0 != null) {
                        arrayList9.add(function0);
                    }
                }
                ArrayList arrayList10 = new ArrayList();
                it8 = arrayList9.iterator();
                while (it8.hasNext()) {
                    z75.t(arrayList10, (Iterable) ((Function0) it8.next()).invoke());
                }
                com.yandex.plus.bdui.plus.content.controller.f fVar = this.u;
                com.yandex.plus.log.api.b bVar7 = this.D;
                com.yandex.plus.bdui.plus.b bVar8 = new com.yandex.plus.bdui.plus.b(fVar, bVar7, 14);
                e5b e5bVar3 = e5b.a;
                e5bVar3.getClass();
                ArrayList g04 = CollectionsKt.g0(arrayList10, u75.h(new com.yandex.plus.bdui.model.a("analytics", bVar8, ern.a(com.yandex.plus.bdui.plus.shared.e.class), e5bVar3), new com.yandex.plus.bdui.model.a("payload", new com.yandex.plus.bdui.plus.b(fVar, bVar7, 15), ern.a(com.yandex.plus.bdui.plus.shared.g.class), e5bVar3), new com.yandex.plus.bdui.model.a("flowStepId", new com.yandex.plus.bdui.plus.a(bVar7, 20), ern.a(com.yandex.plus.bdui.plus.shared.h.class), e5bVar3)));
                ArrayList arrayList11 = new ArrayList();
                it9 = list.iterator();
                while (it9.hasNext()) {
                    Function0 function02 = ((o) it9.next()).e;
                    if (function02 != null) {
                        arrayList11.add(function02);
                    }
                }
                ArrayList arrayList12 = new ArrayList();
                it10 = arrayList11.iterator();
                while (it10.hasNext()) {
                    z75.t(arrayList12, (Iterable) ((Function0) it10.next()).invoke());
                }
                ArrayList arrayList13 = new ArrayList();
                it11 = arrayList12.iterator();
                while (it11.hasNext()) {
                    com.yandex.plus.bdui.plus.data.a aVar5 = (com.yandex.plus.bdui.plus.data.a) it11.next();
                    aVar5.getClass();
                    Set set = com.yandex.plus.bdui.plus.data.a.a;
                    ArrayList arrayList14 = new ArrayList(v75.o(set, 10));
                    Iterator it29 = set.iterator();
                    while (it29.hasNext()) {
                        arrayList14.add(new Pair((String) it29.next(), aVar5));
                    }
                    z75.t(arrayList13, arrayList14);
                }
                Map n = uah.n(arrayList13);
                com.yandex.plus.bdui.plus.content.controller.f fVar2 = new com.yandex.plus.bdui.plus.content.controller.f(CollectionsKt.A0(n.values()), bVar7);
                xqn xqnVar4 = new xqn();
                ps psVar = new ps(this, z, dVar);
                o91 o91Var = new o91(this, z, dVar);
                e eVar4 = new e(dVar, 0);
                j jVar = new j(dVar, xqnVar4, this, z);
                f fVar3 = new f(dVar, bVar3);
                e eVar5 = eVar4;
                com.yandex.plus.core.network.api.interceptors.c cVar2 = new com.yandex.plus.core.network.api.interceptors.c(this.b, new b(this, 1), new com.yandex.plus.bdui.plus.checkout.content.controller.w(0, this.j, com.yandex.plus.metrica.utils.i.class, "getUuid", "getUuid()Ljava/lang/String;", 0, 16), new com.yandex.plus.bdui.plus.checkout.content.controller.w(0, this.j, com.yandex.plus.metrica.utils.i.class, "getDeviceId", "getDeviceId()Ljava/lang/String;", 0, 17), new com.yandex.plus.core.graphql.daily.progress.s(7), this.c, this.d, this.e, "PlusPaySdk");
                com.yandex.plus.core.network.api.interceptors.f fVar4 = new com.yandex.plus.core.network.api.interceptors.f(new h2(1, this.q, com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.ui.q.class, "refresh", "refresh(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 24), new v0(10), bVar7);
                joj jojVar = (joj) this.p.invoke();
                ArrayList arrayList15 = jojVar.c;
                arrayList15.add(cVar2);
                arrayList15.add(new com.yandex.plus.core.network.api.interceptors.a(new qs(this, null, 23)));
                arrayList15.add(fVar4);
                com.yandex.plus.bdui.plus.checkout.h hVar = new com.yandex.plus.bdui.plus.checkout.h(5, new OkHttpClient(jojVar));
                v0 v0Var2 = new v0(11);
                final com.yandex.passport.internal.ui.bouncer.o oVar = new com.yandex.passport.internal.ui.bouncer.o(25, this, sVar);
                final com.yandex.plus.bdui.flex.ui.content.c cVar3 = new com.yandex.plus.bdui.flex.ui.content.c(25, this);
                this.a.getClass();
                final kotlinx.coroutines.a aVar6 = this.z;
                aVar6.getClass();
                kotlinx.coroutines.a aVar7 = this.A;
                aVar7.getClass();
                xqn xqnVar5 = new xqn();
                t0a t0aVar2 = new t0a(xqnVar5, 1);
                xqnVar = new xqn();
                xqn xqnVar6 = new xqn();
                final com.yandex.plus.bdui.flex.utils.b bVar9 = new com.yandex.plus.bdui.flex.utils.b(new com.yandex.plus.bdui.q(2, new com.yandex.plus.bdui.flex.action.d(bVar7), com.yandex.plus.bdui.flex.action.d.class, "getActionDispatcher", "getActionDispatcher(Lcom/yandex/plus/bdui/flex/utils/FlexPlusMappers;Lflex/core/action/ActionDispatcher;)Lcom/yandex/plus/bdui/action/ActionDispatcher;", 0, 0));
                xqn xqnVar7 = new xqn();
                t0a t0aVar3 = new t0a(xqnVar7, 2);
                com.yandex.plus.bdui.flex.action.b bVar10 = new com.yandex.plus.bdui.flex.action.b(t0aVar3, bVar9, bVar7);
                c76 c76Var = new c76(btf.b(new h0(25, bVar9)), 27);
                t0a t0aVar4 = new t0a(xqnVar6, 3);
                a = tah.a(v75.o(g0, 10));
                if (a < 16) {
                    a = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(a);
                it12 = g0.iterator();
                while (it12.hasNext()) {
                    com.yandex.plus.bdui.action.b bVar11 = (com.yandex.plus.bdui.action.b) it12.next();
                    LinkedHashMap linkedHashMap2 = linkedHashMap;
                    linkedHashMap2.put(bVar11.c, new h0l(bVar11, sVar, t0aVar4, bVar10, 8));
                    fVar3 = fVar3;
                    linkedHashMap = linkedHashMap2;
                    dVar = dVar;
                    t0aVar2 = t0aVar2;
                    bVar7 = bVar7;
                    eVar5 = eVar5;
                    jVar = jVar;
                    xqnVar6 = xqnVar6;
                    hVar = hVar;
                    g04 = g04;
                }
                t0a t0aVar5 = t0aVar2;
                xqn xqnVar8 = xqnVar6;
                ArrayList arrayList16 = g04;
                f fVar5 = fVar3;
                com.yandex.plus.bdui.plus.checkout.h hVar2 = hVar;
                j jVar2 = jVar;
                com.yandex.passport.internal.social.d dVar3 = dVar;
                com.yandex.plus.log.api.b bVar12 = bVar7;
                e eVar6 = eVar5;
                LinkedHashMap linkedHashMap3 = linkedHashMap;
                com.yandex.plus.bdui.flex.factory.e eVar7 = this.v;
                com.yandex.plus.bdui.plus.checkout.o oVar2 = this.t;
                final tf6 tf6Var = this.C;
                t4d t4dVar = new t4d(bVar9, linkedHashMap3, eVar7, fVar2, oVar2, tf6Var, bVar12, 3);
                com.yandex.plus.bdui.flex.factory.e eVar8 = eVar7;
                com.yandex.plus.log.api.b bVar13 = bVar12;
                ArrayList arrayList17 = new ArrayList(v75.o(g0, 10));
                it13 = g0.iterator();
                while (it13.hasNext()) {
                    com.yandex.plus.bdui.action.b bVar14 = (com.yandex.plus.bdui.action.b) it13.next();
                    com.yandex.plus.log.api.a aVar8 = com.yandex.plus.log.api.a.c;
                    com.yandex.plus.bdui.flex.factory.e eVar9 = eVar8;
                    if (bVar13.b(aVar8)) {
                        it28 = it13;
                        bVar13.c(aVar8, "ActionDescriptorsProvider", "Add action descriptor of type " + bVar14.a);
                    } else {
                        it28 = it13;
                    }
                    String str2 = bVar14.a;
                    Function2 function23 = bVar14.b;
                    com.yandex.plus.bdui.flex.factory.b bVar15 = function23 != null ? new com.yandex.plus.bdui.flex.factory.b(function23, sVar, c76Var, 0) : null;
                    c5b c5bVar = c5b.a;
                    if (str2 == null || bVar15 == null) {
                        bVar2 = bVar13;
                        jipVar2 = null;
                    } else {
                        bVar2 = bVar13;
                        jipVar2 = new jip(str2, bVar15);
                    }
                    arrayList17.add(new bh(jipVar2, ern.a(com.yandex.plus.bdui.flex.action.e.class), t4dVar, c5bVar));
                    it13 = it28;
                    eVar8 = eVar9;
                    bVar13 = bVar2;
                }
                com.yandex.plus.log.api.b bVar16 = bVar13;
                com.yandex.plus.bdui.flex.factory.e eVar10 = eVar8;
                h0l h0lVar = new h0l(bVar9, g0, oVar2, bVar16, 9);
                c5b c5bVar2 = c5b.a;
                ArrayList h0 = CollectionsKt.h0(arrayList17, new bh(null, ern.a(ke7.class), h0lVar, c5bVar2));
                t0a t0aVar6 = new t0a(xqnVar, 4);
                en9 en9Var = new en9(3, t0aVar6);
                androidx.fragment.app.y supportFragmentManager = tVar.getSupportFragmentManager();
                supportFragmentManager.getClass();
                bnd bndVar = new bnd(23);
                nyf lifecycle = tVar.getLifecycle();
                lifecycle.getClass();
                gh7 gh7Var = new gh7();
                gh7Var.a = new LinkedHashMap();
                Handler handler = new Handler(Looper.getMainLooper());
                if (!tVar.isDestroyed() || tVar.isFinishing()) {
                    xqnVar2 = xqnVar;
                    Timber.INSTANCE.e(tVar + " is destroyed", new Object[0]);
                } else {
                    gh7Var.b = tVar;
                    xqnVar2 = xqnVar;
                    handler.post(new jt6(15, gh7Var, lifecycle));
                }
                final c1t c1tVar = new c1t(en9Var, supportFragmentManager, i, bndVar, new vx6(21, gh7Var, tVar, t0aVar6));
                List h = u75.h(new bh(new jip("ReloadAction", new com.yandex.plus.bdui.flex.factory.d(0, vtn.INSTANCE, vtn.class, "serializer", "serializer()Lkotlinx/serialization/KSerializer;", 0, 1)), ern.a(vtn.class), new k0(15), c5bVar2), new bh(new jip("RedirectAction", new com.yandex.plus.bdui.flex.factory.d(0, tpn.Companion, spn.class, "serializer", "serializer()Lkotlinx/serialization/KSerializer;", 0, 2)), ern.a(tpn.class), new k0(16), c5bVar2), new bh(new jip("UpdateDocumentAction", new com.yandex.plus.bdui.flex.factory.d(0, knt.Companion, hnt.class, "serializer", "serializer()Lkotlinx/serialization/KSerializer;", 0, 3)), ern.a(knt.class), new k0(17), c5bVar2));
                final int i7 = 0;
                bh bhVar = new bh(new jip("ForwardAction", new com.yandex.plus.bdui.flex.factory.d(0, msc.Companion, lsc.class, "serializer", "serializer()Lkotlinx/serialization/KSerializer;", 0, 6)), ern.a(msc.class), new Function0() { // from class: com.yandex.plus.bdui.flex.factory.a
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i7) {
                            case 0:
                                return new gk2(2, c1tVar);
                            case 1:
                                return new gk2(0, c1tVar);
                            case 2:
                                return new gk2(4, c1tVar);
                            case 3:
                                return new gk2(6, c1tVar);
                            case 4:
                                return new gk2(1, c1tVar);
                            case 5:
                                return new gk2(5, c1tVar);
                            default:
                                return new gk2(3, c1tVar);
                        }
                    }
                }, c5bVar2);
                final int i8 = 1;
                final int i9 = 2;
                final int i10 = 3;
                final int i11 = 4;
                final int i12 = 5;
                final int i13 = 6;
                List h2 = u75.h(bhVar, new bh(new jip("BackwardAction", new com.yandex.plus.bdui.flex.factory.d(0, fk2.Companion, ek2.class, "serializer", "serializer()Lkotlinx/serialization/KSerializer;", 0, 7)), ern.a(fk2.class), new Function0() { // from class: com.yandex.plus.bdui.flex.factory.a
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i8) {
                            case 0:
                                return new gk2(2, c1tVar);
                            case 1:
                                return new gk2(0, c1tVar);
                            case 2:
                                return new gk2(4, c1tVar);
                            case 3:
                                return new gk2(6, c1tVar);
                            case 4:
                                return new gk2(1, c1tVar);
                            case 5:
                                return new gk2(5, c1tVar);
                            default:
                                return new gk2(3, c1tVar);
                        }
                    }
                }, c5bVar2), new bh(new jip("OverlayAction", new com.yandex.plus.bdui.flex.factory.d(0, ezj.Companion, dzj.class, "serializer", "serializer()Lkotlinx/serialization/KSerializer;", 0, 8)), ern.a(ezj.class), new Function0() { // from class: com.yandex.plus.bdui.flex.factory.a
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i9) {
                            case 0:
                                return new gk2(2, c1tVar);
                            case 1:
                                return new gk2(0, c1tVar);
                            case 2:
                                return new gk2(4, c1tVar);
                            case 3:
                                return new gk2(6, c1tVar);
                            case 4:
                                return new gk2(1, c1tVar);
                            case 5:
                                return new gk2(5, c1tVar);
                            default:
                                return new gk2(3, c1tVar);
                        }
                    }
                }, c5bVar2), new bh(new jip("ShowPopupAction", new com.yandex.plus.bdui.flex.factory.d(0, heq.Companion, geq.class, "serializer", "serializer()Lkotlinx/serialization/KSerializer;", 0, 9)), ern.a(heq.class), new Function0() { // from class: com.yandex.plus.bdui.flex.factory.a
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i10) {
                            case 0:
                                return new gk2(2, c1tVar);
                            case 1:
                                return new gk2(0, c1tVar);
                            case 2:
                                return new gk2(4, c1tVar);
                            case 3:
                                return new gk2(6, c1tVar);
                            case 4:
                                return new gk2(1, c1tVar);
                            case 5:
                                return new gk2(5, c1tVar);
                            default:
                                return new gk2(3, c1tVar);
                        }
                    }
                }, c5bVar2), new bh(new jip("DismissAction", new com.yandex.plus.bdui.flex.factory.d(0, r98.Companion, q98.class, "serializer", "serializer()Lkotlinx/serialization/KSerializer;", 0, 10)), ern.a(r98.class), new Function0() { // from class: com.yandex.plus.bdui.flex.factory.a
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i11) {
                            case 0:
                                return new gk2(2, c1tVar);
                            case 1:
                                return new gk2(0, c1tVar);
                            case 2:
                                return new gk2(4, c1tVar);
                            case 3:
                                return new gk2(6, c1tVar);
                            case 4:
                                return new gk2(1, c1tVar);
                            case 5:
                                return new gk2(5, c1tVar);
                            default:
                                return new gk2(3, c1tVar);
                        }
                    }
                }, c5bVar2), new bh(new jip("ShowOverlayAction", new com.yandex.plus.bdui.flex.factory.d(0, eeq.Companion, deq.class, "serializer", "serializer()Lkotlinx/serialization/KSerializer;", 0, 4)), ern.a(eeq.class), new Function0() { // from class: com.yandex.plus.bdui.flex.factory.a
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i12) {
                            case 0:
                                return new gk2(2, c1tVar);
                            case 1:
                                return new gk2(0, c1tVar);
                            case 2:
                                return new gk2(4, c1tVar);
                            case 3:
                                return new gk2(6, c1tVar);
                            case 4:
                                return new gk2(1, c1tVar);
                            case 5:
                                return new gk2(5, c1tVar);
                            default:
                                return new gk2(3, c1tVar);
                        }
                    }
                }, c5bVar2), new bh(new jip("HideOverlayAction", new com.yandex.plus.bdui.flex.factory.d(0, xxd.Companion, wxd.class, "serializer", "serializer()Lkotlinx/serialization/KSerializer;", 0, 5)), ern.a(xxd.class), new Function0() { // from class: com.yandex.plus.bdui.flex.factory.a
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i13) {
                            case 0:
                                return new gk2(2, c1tVar);
                            case 1:
                                return new gk2(0, c1tVar);
                            case 2:
                                return new gk2(4, c1tVar);
                            case 3:
                                return new gk2(6, c1tVar);
                            case 4:
                                return new gk2(1, c1tVar);
                            case 5:
                                return new gk2(5, c1tVar);
                            default:
                                return new gk2(3, c1tVar);
                        }
                    }
                }, c5bVar2));
                bh bhVar2 = new bh(new jip("RemoteAction", new com.yandex.plus.bdui.flex.factory.d(0, jun.Companion, iun.class, "serializer", "serializer()Lkotlinx/serialization/KSerializer;", 0, 11)), ern.a(jun.class), new com.yandex.plus.bdui.content.b(1, t0aVar3, tf6Var), t75.c(new nun()));
                bh bhVar3 = new bh(new jip("DelayedAction", new evw(0, ev7.Companion, dv7.class, "serializer", "serializer()Lkotlinx/serialization/KSerializer;", 0, 29)), ern.a(ev7.class), new akl(tf6Var, 1), c5bVar2);
                bh bhVar4 = new bh(new jip("DebounceAction", new com.yandex.plus.bdui.flex.factory.d(0, fe7.Companion, ee7.class, "serializer", "serializer()Lkotlinx/serialization/KSerializer;", 0, 0)), ern.a(fe7.class), new akl(tf6Var, 2), c5bVar2);
                bh bhVar5 = new bh(null, ern.a(reg.class), new os(t0aVar5, aVar6, aVar7, tf6Var, oVar2, bVar9, 3), c5bVar2);
                final int i14 = 0;
                bh bhVar6 = new bh(null, ern.a(ytn.class), new Function0() { // from class: com.yandex.plus.bdui.flex.factory.c
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i14) {
                            case 0:
                                return new ztn(aVar6, tf6Var, 0);
                            case 1:
                                return new ztn(aVar6, tf6Var, 2);
                            default:
                                return new ztn(aVar6, tf6Var, 1);
                        }
                    }
                }, c5bVar2);
                final int i15 = 1;
                final int i16 = 2;
                ArrayList g05 = CollectionsKt.g0(h0, CollectionsKt.g0(CollectionsKt.h0(CollectionsKt.g0(h, h2), bhVar2), u75.h(bhVar3, bhVar4, bhVar5, bhVar6, new bh(null, ern.a(lnt.class), new Function0() { // from class: com.yandex.plus.bdui.flex.factory.c
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i15) {
                            case 0:
                                return new ztn(aVar6, tf6Var, 0);
                            case 1:
                                return new ztn(aVar6, tf6Var, 2);
                            default:
                                return new ztn(aVar6, tf6Var, 1);
                        }
                    }
                }, c5bVar2), new bh(null, ern.a(ant.class), new Function0() { // from class: com.yandex.plus.bdui.flex.factory.c
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i16) {
                            case 0:
                                return new ztn(aVar6, tf6Var, 0);
                            case 1:
                                return new ztn(aVar6, tf6Var, 2);
                            default:
                                return new ztn(aVar6, tf6Var, 1);
                        }
                    }
                }, c5bVar2))));
                com.yandex.plus.bdui.flex.ui.o oVar3 = new com.yandex.plus.bdui.flex.ui.o(new kt4(psVar, o91Var, oVar2, aVar6, aVar7, bVar16, 9), bVar16);
                ArrayList arrayList18 = new ArrayList();
                it14 = g02.iterator();
                while (it14.hasNext()) {
                    com.yandex.plus.bdui.content.c cVar4 = (com.yandex.plus.bdui.content.c) it14.next();
                    Function2 function24 = cVar4.d;
                    Pair pair = function24 != null ? new Pair(cVar4.c, new com.yandex.plus.bdui.flex.factory.h(function24, sVar, 0)) : null;
                    if (pair != null) {
                        arrayList18.add(pair);
                    }
                }
                com.yandex.plus.bdui.flex.ui.content.g gVar = new com.yandex.plus.bdui.flex.ui.content.g(bVar9, uah.n(arrayList18), v0Var2, eVar10, fVar2, oVar3, aVar6, tf6Var, bVar16);
                com.yandex.plus.log.api.b bVar17 = bVar16;
                ArrayList arrayList19 = g02;
                ArrayList arrayList20 = new ArrayList(v75.o(arrayList19, 10));
                it15 = arrayList19.iterator();
                while (it15.hasNext()) {
                    com.yandex.plus.bdui.content.c cVar5 = (com.yandex.plus.bdui.content.c) it15.next();
                    com.yandex.plus.log.api.a aVar9 = com.yandex.plus.log.api.a.c;
                    if (bVar17.b(aVar9)) {
                        arrayList2 = arrayList19;
                        bVar17.c(aVar9, "ContentDescriptorsProvider", "Add content descriptor of type " + cVar5.a);
                    } else {
                        arrayList2 = arrayList19;
                    }
                    String str3 = cVar5.a;
                    Function2 function25 = cVar5.b;
                    com.yandex.plus.bdui.flex.factory.b bVar18 = function25 != null ? new com.yandex.plus.bdui.flex.factory.b(function25, sVar, c76Var, 2) : null;
                    c5b c5bVar3 = c5b.a;
                    if (str3 == null || bVar18 == null) {
                        bVar = bVar17;
                        jipVar = null;
                    } else {
                        bVar = bVar17;
                        jipVar = new jip(str3, bVar18);
                    }
                    arrayList20.add(new de6(jipVar, ern.a(com.yandex.plus.bdui.flex.content.a.class), gVar, c5bVar3));
                    arrayList19 = arrayList2;
                    bVar17 = bVar;
                }
                com.yandex.plus.log.api.b bVar19 = bVar17;
                ArrayList arrayList21 = arrayList19;
                ArrayList h02 = CollectionsKt.h0(arrayList20, new de6(null, ern.a(pe7.class), new vb6() { // from class: com.yandex.plus.bdui.flex.factory.i
                    @Override // defpackage.vb6
                    public final ub6 a(r7b r7bVar, kb6 kb6Var) {
                        r7bVar.getClass();
                        kb6Var.getClass();
                        return new com.yandex.plus.bdui.flex.ui.content.a(r7bVar, com.yandex.plus.bdui.flex.utils.b.this, oVar, cVar3);
                    }
                }, c5b.a));
                ArrayList arrayList22 = new ArrayList();
                it16 = arrayList21.iterator();
                while (it16.hasNext()) {
                    com.yandex.plus.bdui.content.c cVar6 = (com.yandex.plus.bdui.content.c) it16.next();
                    Function2 function26 = cVar6.d;
                    Pair pair2 = function26 != null ? new Pair(cVar6.c, new com.yandex.plus.bdui.flex.factory.h(function26, sVar, 1)) : null;
                    if (pair2 != null) {
                        arrayList22.add(pair2);
                    }
                }
                Map n2 = uah.n(arrayList22);
                ArrayList arrayList23 = new ArrayList();
                it17 = g03.iterator();
                while (it17.hasNext()) {
                    com.yandex.plus.bdui.scaffold.a aVar10 = (com.yandex.plus.bdui.scaffold.a) it17.next();
                    arrayList23.add(new Pair(aVar10.b, new com.yandex.passport.internal.ui.bouncer.o(20, aVar10.c, sVar)));
                }
                com.yandex.plus.bdui.flex.ui.scaffold.c cVar7 = new com.yandex.plus.bdui.flex.ui.scaffold.c(bVar9, n2, uah.n(arrayList23), v0Var2, eVar10, fVar2, oVar3, aVar6, tf6Var, bVar19);
                com.yandex.plus.log.api.b bVar20 = bVar19;
                ArrayList arrayList24 = g03;
                ArrayList arrayList25 = new ArrayList(v75.o(arrayList24, 10));
                it18 = arrayList24.iterator();
                while (it18.hasNext()) {
                    com.yandex.plus.bdui.scaffold.a aVar11 = (com.yandex.plus.bdui.scaffold.a) it18.next();
                    com.yandex.plus.log.api.a aVar12 = com.yandex.plus.log.api.a.c;
                    if (bVar20.b(aVar12)) {
                        aVar11.getClass();
                        arrayList = arrayList24;
                        it27 = it18;
                        bVar20.c(aVar12, "ScaffoldDescriptorsProvider", "Add scaffold descriptor of type TopBottomScaffold");
                    } else {
                        arrayList = arrayList24;
                        it27 = it18;
                    }
                    aVar11.getClass();
                    arrayList25.add(new iso(new jip("TopBottomScaffold", new com.yandex.plus.bdui.flex.factory.m(aVar11.a, sVar, c76Var, 0)), ern.a(com.yandex.plus.bdui.flex.scaffold.a.class), cVar7));
                    it18 = it27;
                    arrayList24 = arrayList;
                }
                ArrayList arrayList26 = arrayList24;
                ArrayList h03 = CollectionsKt.h0(arrayList25, new iso(null, ern.a(af7.class), new com.yandex.plus.bdui.flex.factory.n()));
                ArrayList arrayList27 = arrayList16;
                ArrayList arrayList28 = new ArrayList(v75.o(arrayList27, 10));
                it19 = arrayList27.iterator();
                while (it19.hasNext()) {
                    com.yandex.plus.bdui.model.a aVar13 = (com.yandex.plus.bdui.model.a) it19.next();
                    com.yandex.plus.log.api.a aVar14 = com.yandex.plus.log.api.a.c;
                    ArrayList arrayList29 = arrayList27;
                    if (bVar20.b(aVar14)) {
                        it26 = it19;
                        bVar20.c(aVar14, "SliceParsersProvider", "Add shared data descriptor of type ".concat(aVar13.a));
                    } else {
                        it26 = it19;
                    }
                    com.yandex.plus.log.api.b bVar21 = bVar20;
                    arrayList28.add(new com.yandex.plus.bdui.flex.document.a(bVar9, aVar13.a, new com.yandex.plus.bdui.flex.factory.p(0, aVar13, sVar, c76Var), aVar13.c, bVar21));
                    bVar20 = bVar21;
                    arrayList27 = arrayList29;
                    it19 = it26;
                }
                com.yandex.plus.log.api.b bVar22 = bVar20;
                ArrayList arrayList30 = arrayList27;
                com.yandex.plus.bdui.p pVar = com.yandex.plus.bdui.p.a;
                qg qgVar = new qg(3);
                qg qgVar2 = new qg(4);
                qg qgVar3 = new qg(2);
                og ogVar = new og(new xiu(g05, bVar22), new com.yandex.plus.bdui.flex.factory.e(bVar22, 1));
                bVar22.getClass();
                le3 le3Var = new le3();
                le3Var.a = bVar22;
                ArrayList arrayList31 = new ArrayList();
                it20 = h02.iterator();
                while (it20.hasNext()) {
                    qg qgVar4 = qgVar3;
                    jip jipVar3 = ((de6) it20.next()).a;
                    if (jipVar3 != null) {
                        arrayList31.add(jipVar3);
                    }
                    qgVar3 = qgVar4;
                }
                qg qgVar5 = qgVar3;
                a2 = tah.a(v75.o(arrayList31, 10));
                if (a2 < 16) {
                    a2 = 16;
                }
                LinkedHashMap linkedHashMap4 = new LinkedHashMap(a2);
                it21 = arrayList31.iterator();
                while (it21.hasNext()) {
                    Iterator it30 = it21;
                    jip jipVar4 = (jip) it21.next();
                    linkedHashMap4.put(jipVar4.a, btf.b(jipVar4.b));
                    it21 = it30;
                    ogVar = ogVar;
                }
                og ogVar2 = ogVar;
                le3Var.b = linkedHashMap4;
                cd6 cd6Var = new cd6(le3Var, new com.yandex.plus.bdui.flex.factory.e(bVar22, 2));
                bVar22.getClass();
                qne qneVar = new qne();
                qneVar.a = bVar22;
                ArrayList arrayList32 = new ArrayList();
                it22 = h03.iterator();
                while (it22.hasNext()) {
                    cd6 cd6Var2 = cd6Var;
                    jip jipVar5 = ((iso) it22.next()).a;
                    if (jipVar5 != null) {
                        arrayList32.add(jipVar5);
                    }
                    cd6Var = cd6Var2;
                }
                cd6 cd6Var3 = cd6Var;
                int a3 = tah.a(v75.o(arrayList32, 10));
                LinkedHashMap linkedHashMap5 = new LinkedHashMap(a3 >= 16 ? a3 : 16);
                for (it23 = arrayList32.iterator(); it23.hasNext(); it23 = it23) {
                    jip jipVar6 = (jip) it23.next();
                    linkedHashMap5.put(jipVar6.a, btf.b(jipVar6.b));
                }
                qneVar.b = linkedHashMap5;
                gso gsoVar = new gso(qneVar, new com.yandex.plus.bdui.flex.factory.e(bVar22, 3));
                g0q g0qVar = new g0q(arrayList28);
                qg qgVar6 = new qg(6);
                qg qgVar7 = new qg(7);
                ArrayList arrayList33 = new ArrayList();
                it24 = g05.iterator();
                while (it24.hasNext()) {
                    z75.t(arrayList33, ((bh) it24.next()).d);
                }
                ArrayList arrayList34 = new ArrayList();
                it25 = h02.iterator();
                while (it25.hasNext()) {
                    z75.t(arrayList34, ((de6) it25.next()).d);
                    g0qVar = g0qVar;
                }
                com.yandex.passport.sloth.ui.dependencies.m mVar = new com.yandex.passport.sloth.ui.dependencies.m(qgVar, qgVar2, qgVar5, cd6Var3, gsoVar, ogVar2, g0qVar, qgVar6, qgVar7, CollectionsKt.g0(arrayList33, arrayList34));
                com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.ui.o oVar4 = this.n;
                com.yandex.passport.data.network.l lVar = new com.yandex.passport.data.network.l(oVar4);
                com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.ui.o oVar5 = this.o;
                com.yandex.passport.internal.core.accounts.h hVar3 = new com.yandex.passport.internal.core.accounts.h(lVar, t75.c(new com.yandex.plus.bdui.flex.factory.j(oVar5)), new com.yandex.passport.sloth.ui.c(4, hVar2), bVar22);
                le3 le3Var2 = new le3();
                le3Var2.a = mVar;
                le3Var2.b = btf.b(new z3(7, le3Var2));
                yg ygVar = new yg(hVar3, le3Var2, aVar7, new com.yandex.plus.bdui.flex.factory.e(bVar9, bVar22));
                c5b c5bVar4 = c5b.a;
                xqnVar7.a = new ri7(ygVar, c5bVar4);
                xqnVar5.a = new com.yandex.plus.bdui.flex.factory.l(bVar9, new tzi(new g6a(new com.yandex.passport.internal.core.accounts.h(new com.yandex.passport.data.network.l(oVar4), t75.c(new com.yandex.plus.bdui.flex.factory.j(oVar5)), new com.yandex.passport.sloth.ui.c(4, hVar2), bVar22), new yfx(mVar), aVar7, null), c5bVar4), psVar, cVar3);
                o3a o3aVar = new o3a((t4a) xqnVar5.a, new kkp(new jy7(g05, bVar22), new com.yandex.plus.bdui.o(bVar22)), new oy7(h03, new com.yandex.passport.internal.storage.d(26), bVar22), new ly7(h02, new com.yandex.passport.internal.storage.d(25), bVar22), new apo(9), new com.yandex.passport.internal.core.accounts.h(bVar9, psVar, oVar, cVar3, 8), new efo(22, new com.yandex.plus.bdui.o(bVar22)), null);
                xqnVar2.a = o3aVar;
                com.yandex.plus.bdui.flex.a aVar15 = new com.yandex.plus.bdui.flex.a(o3aVar, bVar9, jVar2, fVar5);
                xqnVar8.a = aVar15;
                a aVar16 = new a(aVar15, new com.yandex.passport.internal.ui.bouncer.o(26, this, eVar6));
                qpj onBackPressedDispatcher = tVar.getOnBackPressedDispatcher();
                onBackPressedDispatcher.getClass();
                wxf.k(onBackPressedDispatcher, tVar, new mmf(xqnVar4, 2));
                xqnVar3.a = aVar16;
                eVar = (com.yandex.plus.bdui.query.e) dVar3.d;
                if (eVar != null) {
                    sVar2 = sVar;
                    eVar = d(tVar, str, sVar, map, g0, arrayList21, arrayList26, arrayList30, new l(n), cVar);
                } else {
                    sVar2 = sVar;
                }
                ((com.yandex.plus.core.benchmark.t) aVar2.c.getValue()).a();
                ((com.yandex.plus.bdui.a) xqnVar3.a).a(eVar, null);
                n nVar = new n((com.yandex.plus.bdui.a) xqnVar3.a, sVar2, dVar3, aVar2);
                tVar.getLifecycle().a(new k(nVar));
                return nVar;
            }
        }
        com.yandex.passport.internal.social.d dVar4 = new com.yandex.passport.internal.social.d(l, null, 0);
        aVar = new com.yandex.plus.bdui.plus.benchmarks.a(xVar, null, null);
        dVar = dVar4;
        final com.yandex.plus.bdui.plus.benchmarks.a aVar22 = aVar;
        final int i32 = 1;
        com.yandex.plus.bdui.plus.analytics.c cVar8 = (com.yandex.plus.bdui.plus.analytics.c) this.y.invoke(new Function0() { // from class: com.yandex.plus.bdui.plus.scenario.d
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return aVar22;
                    default:
                        return (com.yandex.plus.core.benchmark.t) aVar22.c.getValue();
                }
            }
        }, new Function0() { // from class: com.yandex.plus.bdui.plus.scenario.d
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i32) {
                    case 0:
                        return aVar22;
                    default:
                        return (com.yandex.plus.core.benchmark.t) aVar22.c.getValue();
                }
            }
        }, new b(this, 2));
        List list2 = this.r;
        ArrayList arrayList35 = new ArrayList();
        it = list2.iterator();
        while (it.hasNext()) {
        }
        ArrayList arrayList42 = new ArrayList();
        it2 = arrayList35.iterator();
        while (it2.hasNext()) {
        }
        com.yandex.plus.bdui.plus.query.a aVar32 = (com.yandex.plus.bdui.plus.query.a) this.E.getValue();
        e eVar22 = new e(dVar, 1);
        e eVar32 = new e(dVar, 2);
        t0a t0aVar7 = new t0a(xqnVar3, 5);
        final com.yandex.plus.log.api.b bVar42 = this.D;
        Function2 function27 = new Function2(this) { // from class: com.yandex.plus.bdui.plus.scenario.i
            public final /* synthetic */ m b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                s sVar3 = (s) obj;
                Function0 function03 = (Function0) obj2;
                switch (i2) {
                    case 0:
                        sVar3.getClass();
                        function03.getClass();
                        return new com.yandex.plus.bdui.plus.action.serializer.r(function03, this.b.u, bVar42, 0);
                    default:
                        sVar3.getClass();
                        function03.getClass();
                        return new com.yandex.plus.bdui.plus.action.serializer.r(function03, this.b.u, bVar42, 1);
                }
            }
        };
        kt4 kt4Var2 = new kt4(aVar32, t0aVar7, this, bVar42, tVar, eVar32, 10);
        e5b e5bVar4 = e5b.a;
        e5bVar4.getClass();
        com.yandex.plus.bdui.action.b bVar52 = new com.yandex.plus.bdui.action.b("PlusNextDocumentAction", function27, ern.a(com.yandex.plus.bdui.plus.action.z.class), kt4Var2, e5bVar4, true);
        com.yandex.plus.bdui.action.b bVar62 = new com.yandex.plus.bdui.action.b("PlusCloseAction", new com.yandex.plus.bdui.plus.a(bVar42, 16), ern.a(com.yandex.plus.bdui.plus.action.f.class), new pyc(this) { // from class: com.yandex.plus.bdui.plus.scenario.c
            public final /* synthetic */ m b;

            {
                this.b = this;
            }

            @Override // defpackage.pyc
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                s sVar3 = (s) obj;
                Function0 function03 = (Function0) obj2;
                switch (i32) {
                    case 0:
                        sVar3.getClass();
                        function03.getClass();
                        ((com.yandex.plus.bdui.flex.action.b) obj3).getClass();
                        return new com.yandex.plus.bdui.plus.action.k(new h2(1, this.b.s, com.yandex.plus.bdui.plus.e.class, "getFailureContent", "getFailureContent(Lcom/yandex/plus/bdui/failure/Failure;)Lcom/yandex/plus/bdui/content/FailureContent;", 0, 25), function03, bVar42);
                    case 1:
                        com.yandex.plus.bdui.flex.action.b bVar72 = (com.yandex.plus.bdui.flex.action.b) obj3;
                        sVar3.getClass();
                        function03.getClass();
                        bVar72.getClass();
                        m mVar2 = this.b;
                        return new com.yandex.plus.bdui.plus.action.g(bVar72, mVar2.x, mVar2.z, mVar2.A, bVar42);
                    case 2:
                        sVar3.getClass();
                        function03.getClass();
                        ((com.yandex.plus.bdui.flex.action.b) obj3).getClass();
                        return new com.yandex.plus.bdui.plus.action.i(this.b.C, bVar42, 0);
                    default:
                        sVar3.getClass();
                        function03.getClass();
                        ((com.yandex.plus.bdui.flex.action.b) obj3).getClass();
                        return new com.yandex.plus.bdui.plus.action.i(this.b.C, bVar42, 1);
                }
            }
        }, e5bVar4, true);
        com.yandex.plus.bdui.plus.a aVar42 = new com.yandex.plus.bdui.plus.a(bVar42, 17);
        final int i42 = 2;
        final int i52 = 3;
        final int i62 = 0;
        ArrayList g06 = CollectionsKt.g0(arrayList42, u75.h(bVar52, bVar62, new com.yandex.plus.bdui.action.b("PlusDelayAction", aVar42, ern.a(com.yandex.plus.bdui.plus.action.h.class), new pyc(this) { // from class: com.yandex.plus.bdui.plus.scenario.c
            public final /* synthetic */ m b;

            {
                this.b = this;
            }

            @Override // defpackage.pyc
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                s sVar3 = (s) obj;
                Function0 function03 = (Function0) obj2;
                switch (i42) {
                    case 0:
                        sVar3.getClass();
                        function03.getClass();
                        ((com.yandex.plus.bdui.flex.action.b) obj3).getClass();
                        return new com.yandex.plus.bdui.plus.action.k(new h2(1, this.b.s, com.yandex.plus.bdui.plus.e.class, "getFailureContent", "getFailureContent(Lcom/yandex/plus/bdui/failure/Failure;)Lcom/yandex/plus/bdui/content/FailureContent;", 0, 25), function03, bVar42);
                    case 1:
                        com.yandex.plus.bdui.flex.action.b bVar72 = (com.yandex.plus.bdui.flex.action.b) obj3;
                        sVar3.getClass();
                        function03.getClass();
                        bVar72.getClass();
                        m mVar2 = this.b;
                        return new com.yandex.plus.bdui.plus.action.g(bVar72, mVar2.x, mVar2.z, mVar2.A, bVar42);
                    case 2:
                        sVar3.getClass();
                        function03.getClass();
                        ((com.yandex.plus.bdui.flex.action.b) obj3).getClass();
                        return new com.yandex.plus.bdui.plus.action.i(this.b.C, bVar42, 0);
                    default:
                        sVar3.getClass();
                        function03.getClass();
                        ((com.yandex.plus.bdui.flex.action.b) obj3).getClass();
                        return new com.yandex.plus.bdui.plus.action.i(this.b.C, bVar42, 1);
                }
            }
        }, e5bVar4, true), new com.yandex.plus.bdui.action.b("PlusMultiAction", new com.yandex.plus.bdui.plus.a(bVar42, 18), ern.a(com.yandex.plus.bdui.plus.action.l.class), new pyc(this) { // from class: com.yandex.plus.bdui.plus.scenario.c
            public final /* synthetic */ m b;

            {
                this.b = this;
            }

            @Override // defpackage.pyc
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                s sVar3 = (s) obj;
                Function0 function03 = (Function0) obj2;
                switch (i52) {
                    case 0:
                        sVar3.getClass();
                        function03.getClass();
                        ((com.yandex.plus.bdui.flex.action.b) obj3).getClass();
                        return new com.yandex.plus.bdui.plus.action.k(new h2(1, this.b.s, com.yandex.plus.bdui.plus.e.class, "getFailureContent", "getFailureContent(Lcom/yandex/plus/bdui/failure/Failure;)Lcom/yandex/plus/bdui/content/FailureContent;", 0, 25), function03, bVar42);
                    case 1:
                        com.yandex.plus.bdui.flex.action.b bVar72 = (com.yandex.plus.bdui.flex.action.b) obj3;
                        sVar3.getClass();
                        function03.getClass();
                        bVar72.getClass();
                        m mVar2 = this.b;
                        return new com.yandex.plus.bdui.plus.action.g(bVar72, mVar2.x, mVar2.z, mVar2.A, bVar42);
                    case 2:
                        sVar3.getClass();
                        function03.getClass();
                        ((com.yandex.plus.bdui.flex.action.b) obj3).getClass();
                        return new com.yandex.plus.bdui.plus.action.i(this.b.C, bVar42, 0);
                    default:
                        sVar3.getClass();
                        function03.getClass();
                        ((com.yandex.plus.bdui.flex.action.b) obj3).getClass();
                        return new com.yandex.plus.bdui.plus.action.i(this.b.C, bVar42, 1);
                }
            }
        }, e5bVar4, true), new com.yandex.plus.bdui.action.b("PlusSendAnalyticsAction", new com.yandex.plus.bdui.plus.a(bVar42, 19), ern.a(com.yandex.plus.bdui.plus.action.p.class), new f6p(23, cVar8, bVar42), e5bVar4, false), new com.yandex.plus.bdui.action.b("PlusRemoteAction", new Function2(this) { // from class: com.yandex.plus.bdui.plus.scenario.i
            public final /* synthetic */ m b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                s sVar3 = (s) obj;
                Function0 function03 = (Function0) obj2;
                switch (i32) {
                    case 0:
                        sVar3.getClass();
                        function03.getClass();
                        return new com.yandex.plus.bdui.plus.action.serializer.r(function03, this.b.u, bVar42, 0);
                    default:
                        sVar3.getClass();
                        function03.getClass();
                        return new com.yandex.plus.bdui.plus.action.serializer.r(function03, this.b.u, bVar42, 1);
                }
            }
        }, ern.a(com.yandex.plus.bdui.plus.action.a0.class), new mdn(aVar32, bVar42, this, tVar, 15), e5bVar4, true), new com.yandex.plus.bdui.action.b(null, null, ern.a(com.yandex.plus.bdui.plus.action.n.class), new mdn(eVar22, bVar42, this, eVar32, 16), e5bVar4, true), new com.yandex.plus.bdui.action.b(null, null, ern.a(com.yandex.plus.bdui.plus.action.j.class), new pyc(this) { // from class: com.yandex.plus.bdui.plus.scenario.c
            public final /* synthetic */ m b;

            {
                this.b = this;
            }

            @Override // defpackage.pyc
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                s sVar3 = (s) obj;
                Function0 function03 = (Function0) obj2;
                switch (i62) {
                    case 0:
                        sVar3.getClass();
                        function03.getClass();
                        ((com.yandex.plus.bdui.flex.action.b) obj3).getClass();
                        return new com.yandex.plus.bdui.plus.action.k(new h2(1, this.b.s, com.yandex.plus.bdui.plus.e.class, "getFailureContent", "getFailureContent(Lcom/yandex/plus/bdui/failure/Failure;)Lcom/yandex/plus/bdui/content/FailureContent;", 0, 25), function03, bVar42);
                    case 1:
                        com.yandex.plus.bdui.flex.action.b bVar72 = (com.yandex.plus.bdui.flex.action.b) obj3;
                        sVar3.getClass();
                        function03.getClass();
                        bVar72.getClass();
                        m mVar2 = this.b;
                        return new com.yandex.plus.bdui.plus.action.g(bVar72, mVar2.x, mVar2.z, mVar2.A, bVar42);
                    case 2:
                        sVar3.getClass();
                        function03.getClass();
                        ((com.yandex.plus.bdui.flex.action.b) obj3).getClass();
                        return new com.yandex.plus.bdui.plus.action.i(this.b.C, bVar42, 0);
                    default:
                        sVar3.getClass();
                        function03.getClass();
                        ((com.yandex.plus.bdui.flex.action.b) obj3).getClass();
                        return new com.yandex.plus.bdui.plus.action.i(this.b.C, bVar42, 1);
                }
            }
        }, e5bVar4, true)));
        ArrayList arrayList52 = new ArrayList();
        it3 = list2.iterator();
        while (it3.hasNext()) {
        }
        ArrayList arrayList62 = new ArrayList();
        it4 = arrayList52.iterator();
        while (it4.hasNext()) {
        }
        v0 v0Var3 = new v0(9);
        e5b e5bVar22 = e5b.a;
        e5bVar22.getClass();
        ArrayList g022 = CollectionsKt.g0(arrayList62, xz0.w(new com.yandex.plus.bdui.content.c[]{new com.yandex.plus.bdui.content.c(null, null, ern.a(com.yandex.plus.bdui.plus.checkout.content.n.class), v0Var3, e5bVar22), this.s.b()}));
        ArrayList arrayList72 = new ArrayList();
        it5 = list2.iterator();
        while (it5.hasNext()) {
        }
        ArrayList arrayList82 = new ArrayList();
        it6 = arrayList72.iterator();
        while (it6.hasNext()) {
        }
        ArrayList g032 = CollectionsKt.g0(arrayList82, c5b.a);
        ArrayList arrayList92 = new ArrayList();
        it7 = list2.iterator();
        while (it7.hasNext()) {
        }
        ArrayList arrayList102 = new ArrayList();
        it8 = arrayList92.iterator();
        while (it8.hasNext()) {
        }
        com.yandex.plus.bdui.plus.content.controller.f fVar6 = this.u;
        com.yandex.plus.log.api.b bVar72 = this.D;
        com.yandex.plus.bdui.plus.b bVar82 = new com.yandex.plus.bdui.plus.b(fVar6, bVar72, 14);
        e5b e5bVar32 = e5b.a;
        e5bVar32.getClass();
        ArrayList g042 = CollectionsKt.g0(arrayList102, u75.h(new com.yandex.plus.bdui.model.a("analytics", bVar82, ern.a(com.yandex.plus.bdui.plus.shared.e.class), e5bVar32), new com.yandex.plus.bdui.model.a("payload", new com.yandex.plus.bdui.plus.b(fVar6, bVar72, 15), ern.a(com.yandex.plus.bdui.plus.shared.g.class), e5bVar32), new com.yandex.plus.bdui.model.a("flowStepId", new com.yandex.plus.bdui.plus.a(bVar72, 20), ern.a(com.yandex.plus.bdui.plus.shared.h.class), e5bVar32)));
        ArrayList arrayList112 = new ArrayList();
        it9 = list2.iterator();
        while (it9.hasNext()) {
        }
        ArrayList arrayList122 = new ArrayList();
        it10 = arrayList112.iterator();
        while (it10.hasNext()) {
        }
        ArrayList arrayList132 = new ArrayList();
        it11 = arrayList122.iterator();
        while (it11.hasNext()) {
        }
        Map n3 = uah.n(arrayList132);
        com.yandex.plus.bdui.plus.content.controller.f fVar22 = new com.yandex.plus.bdui.plus.content.controller.f(CollectionsKt.A0(n3.values()), bVar72);
        xqn xqnVar42 = new xqn();
        ps psVar2 = new ps(this, z, dVar);
        o91 o91Var2 = new o91(this, z, dVar);
        e eVar42 = new e(dVar, 0);
        j jVar3 = new j(dVar, xqnVar42, this, z);
        f fVar32 = new f(dVar, bVar3);
        e eVar52 = eVar42;
        com.yandex.plus.core.network.api.interceptors.c cVar22 = new com.yandex.plus.core.network.api.interceptors.c(this.b, new b(this, 1), new com.yandex.plus.bdui.plus.checkout.content.controller.w(0, this.j, com.yandex.plus.metrica.utils.i.class, "getUuid", "getUuid()Ljava/lang/String;", 0, 16), new com.yandex.plus.bdui.plus.checkout.content.controller.w(0, this.j, com.yandex.plus.metrica.utils.i.class, "getDeviceId", "getDeviceId()Ljava/lang/String;", 0, 17), new com.yandex.plus.core.graphql.daily.progress.s(7), this.c, this.d, this.e, "PlusPaySdk");
        com.yandex.plus.core.network.api.interceptors.f fVar42 = new com.yandex.plus.core.network.api.interceptors.f(new h2(1, this.q, com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.ui.q.class, "refresh", "refresh(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 24), new v0(10), bVar72);
        joj jojVar2 = (joj) this.p.invoke();
        ArrayList arrayList152 = jojVar2.c;
        arrayList152.add(cVar22);
        arrayList152.add(new com.yandex.plus.core.network.api.interceptors.a(new qs(this, null, 23)));
        arrayList152.add(fVar42);
        com.yandex.plus.bdui.plus.checkout.h hVar4 = new com.yandex.plus.bdui.plus.checkout.h(5, new OkHttpClient(jojVar2));
        v0 v0Var22 = new v0(11);
        final com.yandex.passport.internal.ui.bouncer.o oVar6 = new com.yandex.passport.internal.ui.bouncer.o(25, this, sVar);
        final com.yandex.plus.bdui.flex.ui.content.c cVar32 = new com.yandex.plus.bdui.flex.ui.content.c(25, this);
        this.a.getClass();
        final kotlinx.coroutines.a aVar62 = this.z;
        aVar62.getClass();
        kotlinx.coroutines.a aVar72 = this.A;
        aVar72.getClass();
        xqn xqnVar52 = new xqn();
        t0a t0aVar22 = new t0a(xqnVar52, 1);
        xqnVar = new xqn();
        xqn xqnVar62 = new xqn();
        final com.yandex.plus.bdui.flex.utils.b bVar92 = new com.yandex.plus.bdui.flex.utils.b(new com.yandex.plus.bdui.q(2, new com.yandex.plus.bdui.flex.action.d(bVar72), com.yandex.plus.bdui.flex.action.d.class, "getActionDispatcher", "getActionDispatcher(Lcom/yandex/plus/bdui/flex/utils/FlexPlusMappers;Lflex/core/action/ActionDispatcher;)Lcom/yandex/plus/bdui/action/ActionDispatcher;", 0, 0));
        xqn xqnVar72 = new xqn();
        t0a t0aVar32 = new t0a(xqnVar72, 2);
        com.yandex.plus.bdui.flex.action.b bVar102 = new com.yandex.plus.bdui.flex.action.b(t0aVar32, bVar92, bVar72);
        c76 c76Var2 = new c76(btf.b(new h0(25, bVar92)), 27);
        t0a t0aVar42 = new t0a(xqnVar62, 3);
        a = tah.a(v75.o(g06, 10));
        if (a < 16) {
        }
        LinkedHashMap linkedHashMap6 = new LinkedHashMap(a);
        it12 = g06.iterator();
        while (it12.hasNext()) {
        }
        t0a t0aVar52 = t0aVar22;
        xqn xqnVar82 = xqnVar62;
        ArrayList arrayList162 = g042;
        f fVar52 = fVar32;
        com.yandex.plus.bdui.plus.checkout.h hVar22 = hVar4;
        j jVar22 = jVar3;
        com.yandex.passport.internal.social.d dVar32 = dVar;
        com.yandex.plus.log.api.b bVar122 = bVar72;
        e eVar62 = eVar52;
        LinkedHashMap linkedHashMap32 = linkedHashMap6;
        com.yandex.plus.bdui.flex.factory.e eVar72 = this.v;
        com.yandex.plus.bdui.plus.checkout.o oVar22 = this.t;
        final tf6 tf6Var2 = this.C;
        t4d t4dVar2 = new t4d(bVar92, linkedHashMap32, eVar72, fVar22, oVar22, tf6Var2, bVar122, 3);
        com.yandex.plus.bdui.flex.factory.e eVar82 = eVar72;
        com.yandex.plus.log.api.b bVar132 = bVar122;
        ArrayList arrayList172 = new ArrayList(v75.o(g06, 10));
        it13 = g06.iterator();
        while (it13.hasNext()) {
        }
        com.yandex.plus.log.api.b bVar162 = bVar132;
        com.yandex.plus.bdui.flex.factory.e eVar102 = eVar82;
        h0l h0lVar2 = new h0l(bVar92, g06, oVar22, bVar162, 9);
        c5b c5bVar22 = c5b.a;
        ArrayList h04 = CollectionsKt.h0(arrayList172, new bh(null, ern.a(ke7.class), h0lVar2, c5bVar22));
        t0a t0aVar62 = new t0a(xqnVar, 4);
        en9 en9Var2 = new en9(3, t0aVar62);
        androidx.fragment.app.y supportFragmentManager2 = tVar.getSupportFragmentManager();
        supportFragmentManager2.getClass();
        bnd bndVar2 = new bnd(23);
        nyf lifecycle2 = tVar.getLifecycle();
        lifecycle2.getClass();
        gh7 gh7Var2 = new gh7();
        gh7Var2.a = new LinkedHashMap();
        Handler handler2 = new Handler(Looper.getMainLooper());
        if (tVar.isDestroyed()) {
        }
        xqnVar2 = xqnVar;
        Timber.INSTANCE.e(tVar + " is destroyed", new Object[0]);
        final c1t c1tVar2 = new c1t(en9Var2, supportFragmentManager2, i, bndVar2, new vx6(21, gh7Var2, tVar, t0aVar62));
        List h3 = u75.h(new bh(new jip("ReloadAction", new com.yandex.plus.bdui.flex.factory.d(0, vtn.INSTANCE, vtn.class, "serializer", "serializer()Lkotlinx/serialization/KSerializer;", 0, 1)), ern.a(vtn.class), new k0(15), c5bVar22), new bh(new jip("RedirectAction", new com.yandex.plus.bdui.flex.factory.d(0, tpn.Companion, spn.class, "serializer", "serializer()Lkotlinx/serialization/KSerializer;", 0, 2)), ern.a(tpn.class), new k0(16), c5bVar22), new bh(new jip("UpdateDocumentAction", new com.yandex.plus.bdui.flex.factory.d(0, knt.Companion, hnt.class, "serializer", "serializer()Lkotlinx/serialization/KSerializer;", 0, 3)), ern.a(knt.class), new k0(17), c5bVar22));
        final int i72 = 0;
        bh bhVar7 = new bh(new jip("ForwardAction", new com.yandex.plus.bdui.flex.factory.d(0, msc.Companion, lsc.class, "serializer", "serializer()Lkotlinx/serialization/KSerializer;", 0, 6)), ern.a(msc.class), new Function0() { // from class: com.yandex.plus.bdui.flex.factory.a
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i72) {
                    case 0:
                        return new gk2(2, c1tVar2);
                    case 1:
                        return new gk2(0, c1tVar2);
                    case 2:
                        return new gk2(4, c1tVar2);
                    case 3:
                        return new gk2(6, c1tVar2);
                    case 4:
                        return new gk2(1, c1tVar2);
                    case 5:
                        return new gk2(5, c1tVar2);
                    default:
                        return new gk2(3, c1tVar2);
                }
            }
        }, c5bVar22);
        final int i82 = 1;
        final int i92 = 2;
        final int i102 = 3;
        final int i112 = 4;
        final int i122 = 5;
        final int i132 = 6;
        List h22 = u75.h(bhVar7, new bh(new jip("BackwardAction", new com.yandex.plus.bdui.flex.factory.d(0, fk2.Companion, ek2.class, "serializer", "serializer()Lkotlinx/serialization/KSerializer;", 0, 7)), ern.a(fk2.class), new Function0() { // from class: com.yandex.plus.bdui.flex.factory.a
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i82) {
                    case 0:
                        return new gk2(2, c1tVar2);
                    case 1:
                        return new gk2(0, c1tVar2);
                    case 2:
                        return new gk2(4, c1tVar2);
                    case 3:
                        return new gk2(6, c1tVar2);
                    case 4:
                        return new gk2(1, c1tVar2);
                    case 5:
                        return new gk2(5, c1tVar2);
                    default:
                        return new gk2(3, c1tVar2);
                }
            }
        }, c5bVar22), new bh(new jip("OverlayAction", new com.yandex.plus.bdui.flex.factory.d(0, ezj.Companion, dzj.class, "serializer", "serializer()Lkotlinx/serialization/KSerializer;", 0, 8)), ern.a(ezj.class), new Function0() { // from class: com.yandex.plus.bdui.flex.factory.a
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i92) {
                    case 0:
                        return new gk2(2, c1tVar2);
                    case 1:
                        return new gk2(0, c1tVar2);
                    case 2:
                        return new gk2(4, c1tVar2);
                    case 3:
                        return new gk2(6, c1tVar2);
                    case 4:
                        return new gk2(1, c1tVar2);
                    case 5:
                        return new gk2(5, c1tVar2);
                    default:
                        return new gk2(3, c1tVar2);
                }
            }
        }, c5bVar22), new bh(new jip("ShowPopupAction", new com.yandex.plus.bdui.flex.factory.d(0, heq.Companion, geq.class, "serializer", "serializer()Lkotlinx/serialization/KSerializer;", 0, 9)), ern.a(heq.class), new Function0() { // from class: com.yandex.plus.bdui.flex.factory.a
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i102) {
                    case 0:
                        return new gk2(2, c1tVar2);
                    case 1:
                        return new gk2(0, c1tVar2);
                    case 2:
                        return new gk2(4, c1tVar2);
                    case 3:
                        return new gk2(6, c1tVar2);
                    case 4:
                        return new gk2(1, c1tVar2);
                    case 5:
                        return new gk2(5, c1tVar2);
                    default:
                        return new gk2(3, c1tVar2);
                }
            }
        }, c5bVar22), new bh(new jip("DismissAction", new com.yandex.plus.bdui.flex.factory.d(0, r98.Companion, q98.class, "serializer", "serializer()Lkotlinx/serialization/KSerializer;", 0, 10)), ern.a(r98.class), new Function0() { // from class: com.yandex.plus.bdui.flex.factory.a
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i112) {
                    case 0:
                        return new gk2(2, c1tVar2);
                    case 1:
                        return new gk2(0, c1tVar2);
                    case 2:
                        return new gk2(4, c1tVar2);
                    case 3:
                        return new gk2(6, c1tVar2);
                    case 4:
                        return new gk2(1, c1tVar2);
                    case 5:
                        return new gk2(5, c1tVar2);
                    default:
                        return new gk2(3, c1tVar2);
                }
            }
        }, c5bVar22), new bh(new jip("ShowOverlayAction", new com.yandex.plus.bdui.flex.factory.d(0, eeq.Companion, deq.class, "serializer", "serializer()Lkotlinx/serialization/KSerializer;", 0, 4)), ern.a(eeq.class), new Function0() { // from class: com.yandex.plus.bdui.flex.factory.a
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i122) {
                    case 0:
                        return new gk2(2, c1tVar2);
                    case 1:
                        return new gk2(0, c1tVar2);
                    case 2:
                        return new gk2(4, c1tVar2);
                    case 3:
                        return new gk2(6, c1tVar2);
                    case 4:
                        return new gk2(1, c1tVar2);
                    case 5:
                        return new gk2(5, c1tVar2);
                    default:
                        return new gk2(3, c1tVar2);
                }
            }
        }, c5bVar22), new bh(new jip("HideOverlayAction", new com.yandex.plus.bdui.flex.factory.d(0, xxd.Companion, wxd.class, "serializer", "serializer()Lkotlinx/serialization/KSerializer;", 0, 5)), ern.a(xxd.class), new Function0() { // from class: com.yandex.plus.bdui.flex.factory.a
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i132) {
                    case 0:
                        return new gk2(2, c1tVar2);
                    case 1:
                        return new gk2(0, c1tVar2);
                    case 2:
                        return new gk2(4, c1tVar2);
                    case 3:
                        return new gk2(6, c1tVar2);
                    case 4:
                        return new gk2(1, c1tVar2);
                    case 5:
                        return new gk2(5, c1tVar2);
                    default:
                        return new gk2(3, c1tVar2);
                }
            }
        }, c5bVar22));
        bh bhVar22 = new bh(new jip("RemoteAction", new com.yandex.plus.bdui.flex.factory.d(0, jun.Companion, iun.class, "serializer", "serializer()Lkotlinx/serialization/KSerializer;", 0, 11)), ern.a(jun.class), new com.yandex.plus.bdui.content.b(1, t0aVar32, tf6Var2), t75.c(new nun()));
        bh bhVar32 = new bh(new jip("DelayedAction", new evw(0, ev7.Companion, dv7.class, "serializer", "serializer()Lkotlinx/serialization/KSerializer;", 0, 29)), ern.a(ev7.class), new akl(tf6Var2, 1), c5bVar22);
        bh bhVar42 = new bh(new jip("DebounceAction", new com.yandex.plus.bdui.flex.factory.d(0, fe7.Companion, ee7.class, "serializer", "serializer()Lkotlinx/serialization/KSerializer;", 0, 0)), ern.a(fe7.class), new akl(tf6Var2, 2), c5bVar22);
        bh bhVar52 = new bh(null, ern.a(reg.class), new os(t0aVar52, aVar62, aVar72, tf6Var2, oVar22, bVar92, 3), c5bVar22);
        final int i142 = 0;
        bh bhVar62 = new bh(null, ern.a(ytn.class), new Function0() { // from class: com.yandex.plus.bdui.flex.factory.c
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i142) {
                    case 0:
                        return new ztn(aVar62, tf6Var2, 0);
                    case 1:
                        return new ztn(aVar62, tf6Var2, 2);
                    default:
                        return new ztn(aVar62, tf6Var2, 1);
                }
            }
        }, c5bVar22);
        final int i152 = 1;
        final int i162 = 2;
        ArrayList g052 = CollectionsKt.g0(h04, CollectionsKt.g0(CollectionsKt.h0(CollectionsKt.g0(h3, h22), bhVar22), u75.h(bhVar32, bhVar42, bhVar52, bhVar62, new bh(null, ern.a(lnt.class), new Function0() { // from class: com.yandex.plus.bdui.flex.factory.c
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i152) {
                    case 0:
                        return new ztn(aVar62, tf6Var2, 0);
                    case 1:
                        return new ztn(aVar62, tf6Var2, 2);
                    default:
                        return new ztn(aVar62, tf6Var2, 1);
                }
            }
        }, c5bVar22), new bh(null, ern.a(ant.class), new Function0() { // from class: com.yandex.plus.bdui.flex.factory.c
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i162) {
                    case 0:
                        return new ztn(aVar62, tf6Var2, 0);
                    case 1:
                        return new ztn(aVar62, tf6Var2, 2);
                    default:
                        return new ztn(aVar62, tf6Var2, 1);
                }
            }
        }, c5bVar22))));
        com.yandex.plus.bdui.flex.ui.o oVar32 = new com.yandex.plus.bdui.flex.ui.o(new kt4(psVar2, o91Var2, oVar22, aVar62, aVar72, bVar162, 9), bVar162);
        ArrayList arrayList182 = new ArrayList();
        it14 = g022.iterator();
        while (it14.hasNext()) {
        }
        com.yandex.plus.bdui.flex.ui.content.g gVar2 = new com.yandex.plus.bdui.flex.ui.content.g(bVar92, uah.n(arrayList182), v0Var22, eVar102, fVar22, oVar32, aVar62, tf6Var2, bVar162);
        com.yandex.plus.log.api.b bVar172 = bVar162;
        ArrayList arrayList192 = g022;
        ArrayList arrayList202 = new ArrayList(v75.o(arrayList192, 10));
        it15 = arrayList192.iterator();
        while (it15.hasNext()) {
        }
        com.yandex.plus.log.api.b bVar192 = bVar172;
        ArrayList arrayList212 = arrayList192;
        ArrayList h022 = CollectionsKt.h0(arrayList202, new de6(null, ern.a(pe7.class), new vb6() { // from class: com.yandex.plus.bdui.flex.factory.i
            @Override // defpackage.vb6
            public final ub6 a(r7b r7bVar, kb6 kb6Var) {
                r7bVar.getClass();
                kb6Var.getClass();
                return new com.yandex.plus.bdui.flex.ui.content.a(r7bVar, com.yandex.plus.bdui.flex.utils.b.this, oVar6, cVar32);
            }
        }, c5b.a));
        ArrayList arrayList222 = new ArrayList();
        it16 = arrayList212.iterator();
        while (it16.hasNext()) {
        }
        Map n22 = uah.n(arrayList222);
        ArrayList arrayList232 = new ArrayList();
        it17 = g032.iterator();
        while (it17.hasNext()) {
        }
        com.yandex.plus.bdui.flex.ui.scaffold.c cVar72 = new com.yandex.plus.bdui.flex.ui.scaffold.c(bVar92, n22, uah.n(arrayList232), v0Var22, eVar102, fVar22, oVar32, aVar62, tf6Var2, bVar192);
        com.yandex.plus.log.api.b bVar202 = bVar192;
        ArrayList arrayList242 = g032;
        ArrayList arrayList252 = new ArrayList(v75.o(arrayList242, 10));
        it18 = arrayList242.iterator();
        while (it18.hasNext()) {
        }
        ArrayList arrayList262 = arrayList242;
        ArrayList h032 = CollectionsKt.h0(arrayList252, new iso(null, ern.a(af7.class), new com.yandex.plus.bdui.flex.factory.n()));
        ArrayList arrayList272 = arrayList162;
        ArrayList arrayList282 = new ArrayList(v75.o(arrayList272, 10));
        it19 = arrayList272.iterator();
        while (it19.hasNext()) {
        }
        com.yandex.plus.log.api.b bVar222 = bVar202;
        ArrayList arrayList302 = arrayList272;
        com.yandex.plus.bdui.p pVar2 = com.yandex.plus.bdui.p.a;
        qg qgVar8 = new qg(3);
        qg qgVar22 = new qg(4);
        qg qgVar32 = new qg(2);
        og ogVar3 = new og(new xiu(g052, bVar222), new com.yandex.plus.bdui.flex.factory.e(bVar222, 1));
        bVar222.getClass();
        le3 le3Var3 = new le3();
        le3Var3.a = bVar222;
        ArrayList arrayList312 = new ArrayList();
        it20 = h022.iterator();
        while (it20.hasNext()) {
        }
        qg qgVar52 = qgVar32;
        a2 = tah.a(v75.o(arrayList312, 10));
        if (a2 < 16) {
        }
        LinkedHashMap linkedHashMap42 = new LinkedHashMap(a2);
        it21 = arrayList312.iterator();
        while (it21.hasNext()) {
        }
        og ogVar22 = ogVar3;
        le3Var3.b = linkedHashMap42;
        cd6 cd6Var4 = new cd6(le3Var3, new com.yandex.plus.bdui.flex.factory.e(bVar222, 2));
        bVar222.getClass();
        qne qneVar2 = new qne();
        qneVar2.a = bVar222;
        ArrayList arrayList322 = new ArrayList();
        it22 = h032.iterator();
        while (it22.hasNext()) {
        }
        cd6 cd6Var32 = cd6Var4;
        int a32 = tah.a(v75.o(arrayList322, 10));
        LinkedHashMap linkedHashMap52 = new LinkedHashMap(a32 >= 16 ? a32 : 16);
        while (it23.hasNext()) {
        }
        qneVar2.b = linkedHashMap52;
        gso gsoVar2 = new gso(qneVar2, new com.yandex.plus.bdui.flex.factory.e(bVar222, 3));
        g0q g0qVar2 = new g0q(arrayList282);
        qg qgVar62 = new qg(6);
        qg qgVar72 = new qg(7);
        ArrayList arrayList332 = new ArrayList();
        it24 = g052.iterator();
        while (it24.hasNext()) {
        }
        ArrayList arrayList342 = new ArrayList();
        it25 = h022.iterator();
        while (it25.hasNext()) {
        }
        com.yandex.passport.sloth.ui.dependencies.m mVar2 = new com.yandex.passport.sloth.ui.dependencies.m(qgVar8, qgVar22, qgVar52, cd6Var32, gsoVar2, ogVar22, g0qVar2, qgVar62, qgVar72, CollectionsKt.g0(arrayList332, arrayList342));
        com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.ui.o oVar42 = this.n;
        com.yandex.passport.data.network.l lVar2 = new com.yandex.passport.data.network.l(oVar42);
        com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.ui.o oVar52 = this.o;
        com.yandex.passport.internal.core.accounts.h hVar32 = new com.yandex.passport.internal.core.accounts.h(lVar2, t75.c(new com.yandex.plus.bdui.flex.factory.j(oVar52)), new com.yandex.passport.sloth.ui.c(4, hVar22), bVar222);
        le3 le3Var22 = new le3();
        le3Var22.a = mVar2;
        le3Var22.b = btf.b(new z3(7, le3Var22));
        yg ygVar2 = new yg(hVar32, le3Var22, aVar72, new com.yandex.plus.bdui.flex.factory.e(bVar92, bVar222));
        c5b c5bVar42 = c5b.a;
        xqnVar72.a = new ri7(ygVar2, c5bVar42);
        xqnVar52.a = new com.yandex.plus.bdui.flex.factory.l(bVar92, new tzi(new g6a(new com.yandex.passport.internal.core.accounts.h(new com.yandex.passport.data.network.l(oVar42), t75.c(new com.yandex.plus.bdui.flex.factory.j(oVar52)), new com.yandex.passport.sloth.ui.c(4, hVar22), bVar222), new yfx(mVar2), aVar72, null), c5bVar42), psVar2, cVar32);
        o3a o3aVar2 = new o3a((t4a) xqnVar52.a, new kkp(new jy7(g052, bVar222), new com.yandex.plus.bdui.o(bVar222)), new oy7(h032, new com.yandex.passport.internal.storage.d(26), bVar222), new ly7(h022, new com.yandex.passport.internal.storage.d(25), bVar222), new apo(9), new com.yandex.passport.internal.core.accounts.h(bVar92, psVar2, oVar6, cVar32, 8), new efo(22, new com.yandex.plus.bdui.o(bVar222)), null);
        xqnVar2.a = o3aVar2;
        com.yandex.plus.bdui.flex.a aVar152 = new com.yandex.plus.bdui.flex.a(o3aVar2, bVar92, jVar22, fVar52);
        xqnVar82.a = aVar152;
        a aVar162 = new a(aVar152, new com.yandex.passport.internal.ui.bouncer.o(26, this, eVar62));
        qpj onBackPressedDispatcher2 = tVar.getOnBackPressedDispatcher();
        onBackPressedDispatcher2.getClass();
        wxf.k(onBackPressedDispatcher2, tVar, new mmf(xqnVar42, 2));
        xqnVar3.a = aVar162;
        eVar = (com.yandex.plus.bdui.query.e) dVar32.d;
        if (eVar != null) {
        }
        ((com.yandex.plus.core.benchmark.t) aVar22.c.getValue()).a();
        ((com.yandex.plus.bdui.a) xqnVar3.a).a(eVar, null);
        n nVar2 = new n((com.yandex.plus.bdui.a) xqnVar3.a, sVar2, dVar32, aVar22);
        tVar.getLifecycle().a(new k(nVar2));
        return nVar2;
    }
}
