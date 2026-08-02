package com.yandex.plus.experiments.impl.cache;

import android.content.SharedPreferences;
import com.yandex.passport.internal.core.accounts.h;
import com.yandex.plus.bdui.flex.factory.p;
import com.yandex.plus.bdui.plus.checkout.content.serializer.dto.u;
import com.yandex.plus.core.data.common.b0;
import com.yandex.plus.core.graphql.a0;
import com.yandex.plus.core.graphql.fragment.e2;
import com.yandex.plus.core.graphql.fragment.v8;
import com.yandex.plus.core.graphql.g1;
import com.yandex.plus.core.graphql.j0;
import com.yandex.plus.core.graphql.n;
import com.yandex.plus.core.graphql.q;
import com.yandex.plus.core.graphql.q1;
import com.yandex.plus.core.graphql.s;
import com.yandex.plus.core.graphql.t;
import com.yandex.plus.core.graphql.t1;
import com.yandex.plus.core.graphql.type.w;
import com.yandex.plus.core.graphql.z;
import com.yandex.plus.experiments.api.cache.f;
import com.yandex.plus.home.dailyquests.repository.rest.prefs.d0;
import com.yandex.plus.home.dailyquests.repository.rest.prefs.y;
import com.yandex.plus.home.feature.panel.internal.e;
import com.yandex.plus.home.feature.webviews.internal.stories.k;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.b1;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.c1;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.f1;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.i1;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.v1;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.z0;
import com.yandex.plus.home.graphql.panel.g;
import com.yandex.plus.home.plaque.repository.graphql.cache.dto.w1;
import com.yandex.plus.home.repository.api.model.panel.i;
import com.yandex.plus.pay.ui.webview.paymentwidget.ui.d;
import defpackage.aur;
import defpackage.bck;
import defpackage.dfi;
import defpackage.dnb;
import defpackage.f1d;
import defpackage.f84;
import defpackage.ff7;
import defpackage.hrg;
import defpackage.i5f;
import defpackage.jtj;
import defpackage.jyr;
import defpackage.kkp;
import defpackage.kp0;
import defpackage.mm6;
import defpackage.nm6;
import defpackage.nuj;
import defpackage.q7g;
import defpackage.qgg;
import defpackage.r7o;
import defpackage.rar;
import defpackage.t6e;
import defpackage.t7o;
import defpackage.tah;
import defpackage.tkr;
import defpackage.uah;
import defpackage.web;
import defpackage.wis;
import defpackage.wsd;
import defpackage.x3f;
import defpackage.x6e;
import defpackage.x97;
import defpackage.ymb;
import defpackage.z7o;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;

/* loaded from: classes4.dex */
public final class b extends aur implements Function2 {
    public final /* synthetic */ int j;
    public /* synthetic */ Object k;
    public final /* synthetic */ Object l;
    public final /* synthetic */ Object m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(Object obj, Object obj2, Object obj3, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.k = obj;
        this.l = obj2;
        this.m = obj3;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                b bVar = new b((c) this.l, (f) this.m, continuation, 0);
                bVar.k = obj;
                return bVar;
            case 1:
                b bVar2 = new b((com.yandex.plus.home.analytics.diagnostic.server.b) this.l, (kkp) this.m, continuation, 1);
                bVar2.k = obj;
                return bVar2;
            case 2:
                return new b((d0) this.k, (Long) this.l, (y) this.m, continuation, 2);
            case 3:
                b bVar3 = new b((com.yandex.plus.home.feature.panel.internal.f) this.l, (i) this.m, continuation, 3);
                bVar3.k = obj;
                return bVar3;
            case 4:
                return new b((com.yandex.plus.home.feature.webviews.internal.bridge.b) this.k, (v1) this.l, (String) this.m, continuation, 4);
            case 5:
                return new b((k) this.k, (z0) this.l, (b1) this.m, continuation, 5);
            case 6:
                b bVar4 = new b((h) this.l, (String) this.m, continuation, 6);
                bVar4.k = obj;
                return bVar4;
            case 7:
                b bVar5 = new b((h) this.l, (v1) this.m, continuation, 7);
                bVar5.k = obj;
                return bVar5;
            case 8:
                b bVar6 = new b((com.yandex.plus.home.graphql.analytics.a) this.l, (kkp) this.m, continuation, 8);
                bVar6.k = obj;
                return bVar6;
            case 9:
                b bVar7 = new b((g) this.l, (String) this.m, continuation, 9);
                bVar7.k = obj;
                return bVar7;
            case 10:
                b bVar8 = new b((com.yandex.plus.home.plaque.plugin.internal.defaults.c) this.l, (com.yandex.plus.home.plaque.repository.graphql.cache.a) this.m, continuation, 10);
                bVar8.k = obj;
                return bVar8;
            case 11:
                b bVar9 = new b((com.yandex.plus.pay.graphql.analytics.b) this.l, (kkp) this.m, continuation, 11);
                bVar9.k = obj;
                return bVar9;
            case 12:
                b bVar10 = new b((com.yandex.plus.pay.graphql.analytics.c) this.l, (kkp) this.m, continuation, 12);
                bVar10.k = obj;
                return bVar10;
            default:
                b bVar11 = new b((d) this.l, (String) this.m, continuation, 13);
                bVar11.k = obj;
                return bVar11;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.j) {
            case 0:
                return ((b) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 1:
                return ((b) create((kp0) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 2:
                return ((b) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 3:
                return ((b) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 4:
                return ((b) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 5:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((b) create(bool, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 6:
                return ((b) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 7:
                return ((b) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 8:
                return ((b) create((kp0) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 9:
                return ((b) create((com.yandex.plus.home.repository.api.model.f) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 10:
                return ((b) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 11:
                return ((b) create((kp0) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 12:
                return ((b) create((kp0) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            default:
                return ((b) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:208:0x0357, code lost:
    
        if (r16 == false) goto L182;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x036e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01b3  */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object t7oVar;
        int T;
        t7o t7oVar2;
        Object obj2;
        t7o t7oVar3;
        Object obj3;
        Object t7oVar4;
        String str;
        String str2;
        String str3;
        String obj4;
        String str4;
        String name;
        q qVar;
        ArrayList<n> arrayList;
        int i = this.j;
        int i2 = 1;
        Object obj5 = this.l;
        Object obj6 = this.m;
        switch (i) {
            case 0:
                nm6 nm6Var = nm6.a;
                qgg.h0(obj);
                c cVar = (c) obj5;
                f fVar = (f) obj6;
                try {
                    r7o r7oVar = z7o.b;
                    x3f x3fVar = cVar.e;
                    x3fVar.getClass();
                    t7oVar = x3fVar.c(ff7.C(f.Companion.serializer()), fVar);
                } catch (Throwable th) {
                    r7o r7oVar2 = z7o.b;
                    t7oVar = new t7o(th);
                }
                if (t7oVar instanceof t7o) {
                    t7oVar = null;
                }
                String str5 = (String) t7oVar;
                if (str5 == null) {
                    return null;
                }
                SharedPreferences.Editor edit = cVar.f.edit();
                edit.putString(c.j(cVar), str5);
                edit.commit();
                return Unit.a;
            case 1:
                kp0 kp0Var = (kp0) this.k;
                nm6 nm6Var2 = nm6.a;
                qgg.h0(obj);
                web o = u.o(kp0Var);
                if (o != null) {
                    String str6 = o.a;
                    com.yandex.plus.home.analytics.diagnostic.server.b bVar = (com.yandex.plus.home.analytics.diagnostic.server.b) obj5;
                    kkp kkpVar = (kkp) obj6;
                    nuj nujVar = (nuj) kkpVar.b;
                    List l = u.l(kp0Var);
                    String n = l != null ? u.n(l) : null;
                    x6e x6eVar = (x6e) kp0Var.f.d(x6e.c);
                    Integer valueOf = x6eVar != null ? Integer.valueOf(x6eVar.a) : null;
                    String num = valueOf != null ? valueOf.toString() : null;
                    if (num == null) {
                        num = "";
                    }
                    Pair pair = new Pair("code", num);
                    if (n == null) {
                        n = "";
                    }
                    Map e = uah.e(pair, new Pair(CommonUrlParts.REQUEST_ID, n));
                    dnb dnbVar = bVar.a;
                    String name2 = nujVar.name();
                    ymb ymbVar = ymb.Backend;
                    dnbVar.a(name2, ymbVar, str6, e);
                    bVar.b((List) kkpVar.e, nujVar.name(), ymbVar, str6, e);
                }
                return Unit.a;
            case 2:
                nm6 nm6Var3 = nm6.a;
                qgg.h0(obj);
                d0 d0Var = (d0) this.k;
                SharedPreferences sharedPreferences = d0Var.c;
                sharedPreferences.getClass();
                SharedPreferences.Editor edit2 = sharedPreferences.edit();
                edit2.putString(d0.a(d0Var, (Long) obj5), x3f.d.c(y.Companion.serializer(), (y) obj6));
                edit2.commit();
                return Unit.a;
            case 3:
                Continuation continuation = null;
                mm6 mm6Var = (mm6) this.k;
                nm6 nm6Var4 = nm6.a;
                qgg.h0(obj);
                com.yandex.plus.home.feature.panel.internal.f fVar2 = (com.yandex.plus.home.feature.panel.internal.f) obj5;
                x97.y(mm6Var, null, null, new com.yandex.plus.bdui.ui.b(fVar2, (i) obj6, continuation, 13), 3);
                x97.y(mm6Var, null, null, new e(fVar2, continuation, 0), 3);
                x97.y(mm6Var, null, null, new e(fVar2, continuation, i2), 3);
                return Unit.a;
            case 4:
                nm6 nm6Var5 = nm6.a;
                qgg.h0(obj);
                v1 v1Var = (v1) obj5;
                String str7 = (String) obj6;
                int i3 = ((com.yandex.plus.home.feature.webviews.internal.bridge.b) this.k).q.a;
                v1Var.getClass();
                str7.getClass();
                switch (i3) {
                    case 15:
                        break;
                    default:
                        if (((v1Var instanceof f1) || (v1Var instanceof i1)) && (T = StringsKt.T(str7, "\"payload\":", 0, false, 6)) != -1) {
                            str7 = StringsKt.c0(str7, 10 + T, str7.length(), "<private>}").toString();
                            break;
                        }
                        break;
                }
                com.yandex.plus.core.analytics.logging.b bVar2 = com.yandex.plus.core.analytics.logging.b.c;
                String g = f1d.g("logInMessage() jsonMessage=", str7);
                jyr jyrVar = com.yandex.plus.core.analytics.logging.e.a;
                com.yandex.plus.core.analytics.logging.e.e(com.yandex.plus.core.analytics.logging.a.a, bVar2, g, null);
                return Unit.a;
            case 5:
                nm6 nm6Var6 = nm6.a;
                qgg.h0(obj);
                k kVar = (k) this.k;
                kVar.getClass();
                kVar.l0(new c1((z0) obj5, (b1) obj6));
                ((com.yandex.plus.home.feature.webviews.internal.stories.c) kVar.e).s();
                rar rarVar = kVar.z0;
                if (rarVar != null) {
                    rarVar.g(null);
                }
                return Unit.a;
            case 6:
                nm6 nm6Var7 = nm6.a;
                qgg.h0(obj);
                h hVar = (h) obj5;
                String str8 = (String) obj6;
                try {
                    r7o r7oVar3 = z7o.b;
                    obj2 = ((i5f) hVar.c).b((com.yandex.plus.home.feature.webviews.internal.bridge.f) hVar.d, str8);
                } catch (wis e2) {
                    r7o r7oVar4 = z7o.b;
                    t7oVar2 = new t7o(e2);
                    obj2 = t7oVar2;
                    return new z7o(obj2);
                } catch (CancellationException e3) {
                    throw e3;
                } catch (Throwable th2) {
                    r7o r7oVar5 = z7o.b;
                    t7oVar2 = new t7o(th2);
                    obj2 = t7oVar2;
                    return new z7o(obj2);
                }
                return new z7o(obj2);
            case 7:
                nm6 nm6Var8 = nm6.a;
                qgg.h0(obj);
                h hVar2 = (h) obj5;
                v1 v1Var2 = (v1) obj6;
                try {
                    r7o r7oVar6 = z7o.b;
                    obj3 = ((i5f) hVar2.c).c((com.yandex.plus.home.feature.webviews.internal.bridge.f) hVar2.e, v1Var2);
                } catch (wis e4) {
                    r7o r7oVar7 = z7o.b;
                    t7oVar3 = new t7o(e4);
                    obj3 = t7oVar3;
                    return new z7o(obj3);
                } catch (CancellationException e5) {
                    throw e5;
                } catch (Throwable th3) {
                    r7o r7oVar8 = z7o.b;
                    t7oVar3 = new t7o(th3);
                    obj3 = t7oVar3;
                    return new z7o(obj3);
                }
                return new z7o(obj3);
            case 8:
                kp0 kp0Var2 = (kp0) this.k;
                nm6 nm6Var9 = nm6.a;
                qgg.h0(obj);
                web o2 = u.o(kp0Var2);
                if (o2 != null) {
                    String name3 = ((nuj) ((kkp) obj6).b).name();
                    List l2 = u.l(kp0Var2);
                    String n2 = l2 != null ? u.n(l2) : null;
                    com.yandex.plus.core.graphql.exception.a K = com.yandex.plus.bdui.flex.ui.a.K(o2);
                    com.yandex.plus.core.analytics.logging.b bVar3 = com.yandex.plus.core.analytics.logging.b.a;
                    String b = com.yandex.plus.home.graphql.analytics.a.b(name3, K.getMessage(), n2);
                    jyr jyrVar2 = com.yandex.plus.core.analytics.logging.e.a;
                    com.yandex.plus.core.analytics.logging.e.e(com.yandex.plus.core.analytics.logging.a.e, bVar3, b, K);
                }
                return Unit.a;
            case 9:
                com.yandex.plus.home.repository.api.model.f fVar3 = (com.yandex.plus.home.repository.api.model.f) this.k;
                nm6 nm6Var10 = nm6.a;
                qgg.h0(obj);
                com.yandex.plus.core.analytics.logging.d dVar = ((g) obj5).h;
                String str9 = (String) obj6;
                com.yandex.plus.log.api.a aVar = com.yandex.plus.log.api.a.b;
                if (dVar.b(aVar)) {
                    dVar.a(aVar, "GraphQLPanelRepository", "getPanelFlow(" + str9 + "): " + fVar3, null);
                }
                return Unit.a;
            case 10:
                nm6 nm6Var11 = nm6.a;
                qgg.h0(obj);
                com.yandex.plus.home.plaque.plugin.internal.defaults.c cVar2 = (com.yandex.plus.home.plaque.plugin.internal.defaults.c) obj5;
                com.yandex.plus.home.plaque.repository.graphql.cache.a aVar2 = (com.yandex.plus.home.plaque.repository.graphql.cache.a) obj6;
                try {
                    r7o r7oVar9 = z7o.b;
                    String string = cVar2.c.getString(com.yandex.plus.home.plaque.plugin.internal.defaults.c.a(cVar2, aVar2), null);
                    t7oVar4 = string != null ? (w1) cVar2.d.b(w1.Companion.serializer(), string) : null;
                } catch (Throwable th4) {
                    r7o r7oVar10 = z7o.b;
                    t7oVar4 = new t7o(th4);
                }
                Throwable a = z7o.a(t7oVar4);
                if (a != null) {
                    com.yandex.plus.log.api.b bVar4 = cVar2.a;
                    com.yandex.plus.log.api.a aVar3 = com.yandex.plus.log.api.a.e;
                    if (bVar4.b(aVar3)) {
                        bVar4.a(aVar3, "DefaultPrefsGraphQlPlaqueDataSource", "getFallbackModel error", a);
                    }
                }
                if (t7oVar4 instanceof t7o) {
                    return null;
                }
                return t7oVar4;
            case 11:
                kp0 kp0Var3 = (kp0) this.k;
                nm6 nm6Var12 = nm6.a;
                qgg.h0(obj);
                web o3 = u.o(kp0Var3);
                com.yandex.plus.pay.graphql.analytics.b bVar5 = (com.yandex.plus.pay.graphql.analytics.b) obj5;
                ConcurrentHashMap concurrentHashMap = bVar5.d;
                if (o3 != null) {
                    String name4 = ((nuj) ((kkp) obj6).b).name();
                    List l3 = u.l(kp0Var3);
                    String n3 = l3 != null ? u.n(l3) : null;
                    com.yandex.plus.core.graphql.exception.a K2 = com.yandex.plus.bdui.flex.ui.a.K(o3);
                    bVar5.d(n3, name4, n3 != null ? (com.yandex.plus.pay.graphql.analytics.a) concurrentHashMap.remove(n3) : null, null, K2);
                    bVar5.b.e(com.yandex.plus.pay.api.log.b.a, hrg.r("Error during GraphQL operation. operationName = ", name4, "; errorMessage = ", K2.getMessage()), K2, n3);
                } else {
                    List l4 = u.l(kp0Var3);
                    if (l4 != null) {
                        Iterator it = l4.iterator();
                        Object obj7 = null;
                        boolean z = false;
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            } else {
                                Object next = it.next();
                                String str10 = ((t6e) next).a;
                                Locale locale = Locale.ROOT;
                                String lowerCase = str10.toLowerCase(locale);
                                lowerCase.getClass();
                                String lowerCase2 = "X-Request-Id".toLowerCase(locale);
                                lowerCase2.getClass();
                                if (lowerCase.equals(lowerCase2)) {
                                    if (!z) {
                                        z = true;
                                        obj7 = next;
                                    }
                                }
                            }
                        }
                        obj7 = null;
                        t6e t6eVar = (t6e) obj7;
                        if (t6eVar != null && (str2 = t6eVar.b) != null) {
                            str = StringsKt.t0(str2).toString();
                            if (str != null) {
                            }
                        }
                    }
                    str = null;
                    if (str != null) {
                    }
                }
                return Unit.a;
            case 12:
                kp0 kp0Var4 = (kp0) this.k;
                nm6 nm6Var13 = nm6.a;
                qgg.h0(obj);
                if (u.o(kp0Var4) == null) {
                    com.yandex.plus.pay.graphql.analytics.c cVar3 = (com.yandex.plus.pay.graphql.analytics.c) obj5;
                    List l5 = u.l(kp0Var4);
                    String n4 = l5 != null ? u.n(l5) : null;
                    nuj nujVar2 = (nuj) ((kkp) obj6).b;
                    com.yandex.plus.pay.diagnostic.impl.e eVar = cVar3.a;
                    jtj jtjVar = kp0Var4.c;
                    String name5 = nujVar2.name();
                    switch (name5.hashCode()) {
                        case -1935925833:
                            if (name5.equals("Offers") && (jtjVar instanceof q1) && (nujVar2 instanceof t1)) {
                                t1 t1Var = (t1) nujVar2;
                                if (((q1) jtjVar).a.c.isEmpty()) {
                                    String str11 = t1Var.c;
                                    String str12 = t1Var.b;
                                    eVar.getClass();
                                    str11.getClass();
                                    str12.getClass();
                                    bck bckVar = eVar.a;
                                    if (n4 == null) {
                                        n4 = "no_value";
                                    }
                                    LinkedHashMap m = dfi.m("requestId", n4, "additionalData", "no_value");
                                    m.put("target", str11);
                                    m.put("reason", str12);
                                    m.put("_meta", bck.c(new HashMap()));
                                    bckVar.d("Error.Subscription.Tarifficator.Offers.EmptyList", m);
                                    break;
                                }
                            }
                            break;
                        case -670115059:
                            if (name5.equals("Invoice") && (jtjVar instanceof g1)) {
                                List l6 = u.l(kp0Var4);
                                String p = l6 != null ? u.p(l6) : null;
                                v8 v8Var = ((g1) jtjVar).a.b;
                                w wVar = v8Var.b;
                                if (wVar == w.WAIT_FOR_UZUM || wVar == w.WAIT_FOR_SBP || wVar == w.CREATED_LEGACY || wVar == w.UNKNOWN__ || wVar == null) {
                                    if (wVar == null || (obj4 = wVar.toString()) == null) {
                                        str3 = null;
                                    } else {
                                        str3 = obj4.toLowerCase(Locale.ROOT);
                                        str3.getClass();
                                    }
                                    eVar.a(n4, p, v8Var.a, str3);
                                    break;
                                }
                            }
                            break;
                        case 710710897:
                            if (name5.equals("CreateInvoice") && (jtjVar instanceof j0)) {
                                List l7 = u.l(kp0Var4);
                                String p2 = l7 != null ? u.p(l7) : null;
                                v8 v8Var2 = ((j0) jtjVar).a.a.b;
                                w wVar2 = v8Var2.b;
                                if (wVar2 == w.FAILED || wVar2 == w.UNKNOWN__ || wVar2 == null) {
                                    if (wVar2 == null || (name = wVar2.name()) == null) {
                                        str4 = null;
                                    } else {
                                        str4 = name.toLowerCase(Locale.ROOT);
                                        str4.getClass();
                                    }
                                    eVar.a(n4, p2, v8Var2.a, str4);
                                    break;
                                }
                            }
                            break;
                        case 1903940685:
                            if (name5.equals("CompositeOfferDetails") && (jtjVar instanceof com.yandex.plus.core.graphql.i) && (nujVar2 instanceof a0)) {
                                a0 a0Var = (a0) nujVar2;
                                q7g q7gVar = a0Var.e;
                                com.yandex.plus.core.graphql.h hVar3 = ((com.yandex.plus.core.graphql.i) jtjVar).a;
                                e2 e2Var = hVar3.d;
                                t tVar = hVar3.c;
                                Boolean bool = e2Var.g;
                                if (a0Var.h && bool == null) {
                                    String str13 = (String) q7gVar.H();
                                    bck bckVar2 = eVar.a;
                                    String str14 = n4 == null ? "no_value" : n4;
                                    if (str13 == null) {
                                        str13 = "no_value";
                                    }
                                    LinkedHashMap m2 = dfi.m("requestId", str14, "additionalData", "no_value");
                                    m2.put("target", str13);
                                    m2.put("sessionId", "no_value");
                                    m2.put("_meta", bck.c(new HashMap()));
                                    bckVar2.d("Error.Subscription.Tarifficator.OfferDetails.NullSilent", m2);
                                }
                                boolean z2 = tVar == null || tVar.a.isEmpty() || tVar.e.isEmpty();
                                if (!a0Var.i && z2) {
                                    String str15 = (String) q7gVar.H();
                                    eVar.getClass();
                                    Map b2 = tah.b(new Pair("target", str15));
                                    bck bckVar3 = eVar.a;
                                    String str16 = n4 != null ? n4 : "no_value";
                                    x3f x3fVar2 = eVar.b;
                                    x3fVar2.getClass();
                                    tkr tkrVar = tkr.a;
                                    LinkedHashMap m3 = dfi.m("requestId", str16, "additionalData", x3fVar2.c(new wsd(tkrVar, ff7.C(tkrVar), 1), b2));
                                    m3.put("_meta", bck.c(new HashMap()));
                                    bckVar3.d("Error.Subscription.Tarifficator.OfferDetails.EmptyPaymentMethods", m3);
                                }
                                p pVar = new p(16, cVar3, n4, a0Var);
                                if (tVar != null) {
                                    Iterator it2 = tVar.e.iterator();
                                    while (it2.hasNext()) {
                                        qVar = ((s) it2.next()).f;
                                        if (qVar != null) {
                                            if (tVar == null) {
                                                ArrayList arrayList2 = tVar.e;
                                                ArrayList arrayList3 = new ArrayList();
                                                Iterator it3 = arrayList2.iterator();
                                                while (it3.hasNext()) {
                                                    n nVar = ((s) it3.next()).d;
                                                    if (nVar != null) {
                                                        arrayList3.add(nVar);
                                                    }
                                                }
                                                arrayList = new ArrayList();
                                                Iterator it4 = arrayList3.iterator();
                                                while (it4.hasNext()) {
                                                    Object next2 = it4.next();
                                                    z zVar = ((n) next2).c;
                                                    if (!((zVar != null ? zVar.a : null) == null && (zVar != null ? zVar.b : null) == null)) {
                                                        arrayList.add(next2);
                                                    }
                                                }
                                            } else {
                                                arrayList = null;
                                            }
                                            if (qVar != null) {
                                                com.yandex.plus.core.graphql.w wVar3 = qVar.b;
                                                if (new b0(wVar3.a, wVar3.b).d()) {
                                                    qVar = null;
                                                }
                                                if (qVar != null) {
                                                    pVar.invoke();
                                                }
                                            }
                                            if (arrayList != null) {
                                                for (n nVar2 : arrayList) {
                                                    z zVar2 = nVar2.c;
                                                    if (new b0(zVar2 != null ? zVar2.a : null, zVar2 != null ? zVar2.b : null).d()) {
                                                        nVar2 = null;
                                                    }
                                                    if (nVar2 != null) {
                                                        pVar.invoke();
                                                    }
                                                }
                                                break;
                                            }
                                        }
                                    }
                                }
                                qVar = null;
                                if (tVar == null) {
                                }
                                if (qVar != null) {
                                }
                                if (arrayList != null) {
                                }
                            }
                            break;
                    }
                }
                return Unit.a;
            default:
                mm6 mm6Var2 = (mm6) this.k;
                nm6 nm6Var14 = nm6.a;
                qgg.h0(obj);
                d dVar2 = (d) obj5;
                long j = dVar2.g;
                com.yandex.passport.sloth.ui.q qVar2 = new com.yandex.passport.sloth.ui.q(dVar2, (String) obj6, false, null, 16);
                mm6Var2.getClass();
                x97.y(mm6Var2, null, null, new f84(j, qVar2, (Continuation) null), 3);
                return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(Object obj, Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.l = obj;
        this.m = obj2;
    }
}
