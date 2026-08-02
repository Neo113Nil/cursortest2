package com.yandex.passport.internal.ui.sloth.ebs;

import android.content.Context;
import android.net.http.SslError;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.yandex.passport.internal.report.ke;
import com.yandex.passport.internal.report.reporters.p1;
import com.yandex.passport.internal.ui.sloth.webauthn.RegisterWebAuthNActivity;
import defpackage.a4g;
import defpackage.an5;
import defpackage.b6e;
import defpackage.bsd;
import defpackage.btf;
import defpackage.db;
import defpackage.dq7;
import defpackage.dzf;
import defpackage.ern;
import defpackage.gld;
import defpackage.jyr;
import defpackage.kpj;
import defpackage.ldi;
import defpackage.mn7;
import defpackage.oa8;
import defpackage.ocu;
import defpackage.rj7;
import defpackage.sdr;
import defpackage.tf6;
import defpackage.u75;
import defpackage.v75;
import defpackage.wqr;
import defpackage.x97;
import defpackage.xdr;
import defpackage.xq0;
import defpackage.zne;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final /* synthetic */ class i implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ i(String str, com.yandex.plus.acquisition.sdk.api.b bVar, Map map, com.yandex.plus.acquisition.sdk.pay.impl.analytics.a aVar) {
        this.a = 3;
        this.b = str;
        this.c = bVar;
        this.d = map;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ArrayList arrayList;
        Set set;
        String str;
        String str2;
        com.yandex.plus.core.analytics.metrica.f fVar;
        String str3;
        String str4;
        String str5;
        int i = 10;
        int i2 = 2;
        final int i3 = 0;
        final int i4 = 1;
        switch (this.a) {
            case 0:
                dzf dzfVar = (dzf) this.b;
                g1 g1Var = (g1) this.c;
                sdr sdrVar = (sdr) this.d;
                ((oa8) obj).getClass();
                an5 an5Var = new an5(5, g1Var, sdrVar);
                dzfVar.getLifecycle().a(an5Var);
                return new com.yandex.passport.internal.ui.challenge.logout.bottomsheet.t(dzfVar, an5Var, 1);
            case 1:
                com.yandex.passport.internal.ui.sloth.webauthn.b bVar = (com.yandex.passport.internal.ui.sloth.webauthn.b) this.b;
                com.yandex.passport.internal.ui.sloth.webauthn.f fVar2 = (com.yandex.passport.internal.ui.sloth.webauthn.f) this.c;
                RegisterWebAuthNActivity registerWebAuthNActivity = (RegisterWebAuthNActivity) this.d;
                kpj kpjVar = (kpj) obj;
                int i5 = RegisterWebAuthNActivity.a;
                kpjVar.getClass();
                p1 webAuthNReporter = bVar.getWebAuthNReporter();
                com.yandex.passport.common.core.f fVar3 = fVar2.a;
                webAuthNReporter.getClass();
                fVar3.getClass();
                webAuthNReporter.n(ke.d, new com.yandex.passport.internal.report.c(Long.valueOf(fVar3.b)));
                kpjVar.setEnabled(false);
                registerWebAuthNActivity.getOnBackPressedDispatcher().d();
                return Unit.a;
            case 2:
                dzf dzfVar2 = (dzf) this.b;
                WebView webView = (WebView) this.c;
                Bundle bundle = (Bundle) this.d;
                ((oa8) obj).getClass();
                an5 an5Var2 = new an5(6, webView, bundle);
                dzfVar2.getLifecycle().a(an5Var2);
                return new com.yandex.passport.internal.ui.challenge.logout.bottomsheet.t(dzfVar2, an5Var2, 2);
            case 3:
                String str6 = (String) this.b;
                com.yandex.plus.acquisition.sdk.api.b bVar2 = (com.yandex.plus.acquisition.sdk.api.b) this.c;
                Map map = (Map) this.d;
                com.yandex.plus.pay.api.analytics.b bVar3 = (com.yandex.plus.pay.api.analytics.b) obj;
                bVar3.getClass();
                bVar3.a = str6;
                if (bVar2 == null || (set = bVar2.a) == null) {
                    arrayList = null;
                } else {
                    Set<com.yandex.plus.acquisition.sdk.api.a> set2 = set;
                    arrayList = new ArrayList(v75.o(set2, 10));
                    for (com.yandex.plus.acquisition.sdk.api.a aVar : set2) {
                        arrayList.add(new com.yandex.plus.pay.api.analytics.e(aVar.a, aVar.b));
                    }
                }
                bVar3.b = arrayList != null ? CollectionsKt.A0(arrayList) : null;
                bVar3.c = bVar2 != null ? bVar2.b : null;
                for (Map.Entry entry : map.entrySet()) {
                    String str7 = (String) entry.getKey();
                    String str8 = (String) entry.getValue();
                    str7.getClass();
                    str8.getClass();
                    bVar3.d.put(str7, str8.toString());
                }
                return Unit.a;
            case 4:
                return new com.yandex.plus.bdui.action.c((com.yandex.plus.bdui.flex.utils.b) this.b, (ldi) this.c, ((com.yandex.plus.bdui.flex.action.d) this.d).a);
            case 5:
                com.yandex.plus.bdui.plus.action.e eVar = (com.yandex.plus.bdui.plus.action.e) this.b;
                com.yandex.plus.log.api.b bVar4 = eVar.b;
                com.yandex.plus.bdui.plus.action.d dVar = (com.yandex.plus.bdui.plus.action.d) this.c;
                com.yandex.plus.bdui.action.i iVar = (com.yandex.plus.bdui.action.i) this.d;
                Map map2 = iVar.d;
                com.yandex.plus.bdui.plus.auth.f fVar4 = (com.yandex.plus.bdui.plus.auth.f) obj;
                if (fVar4 instanceof com.yandex.plus.bdui.plus.auth.e) {
                    com.yandex.plus.log.api.a aVar2 = com.yandex.plus.log.api.a.c;
                    if (bVar4.b(aVar2)) {
                        bVar4.c(aVar2, "PlusAuthorizeActionHandler", "handle(); authorize succeeded for user with userId = " + ((com.yandex.plus.bdui.plus.auth.e) fVar4).a);
                    }
                    if (bVar4.b(aVar2)) {
                        bVar4.c(aVar2, "PlusAuthorizeActionHandler", "handle(); dispatch success action = " + dVar.a + " with payload = " + map2);
                    }
                    com.yandex.plus.bdui.plus.action.e.b(eVar, dVar.a, iVar);
                } else if (Intrinsics.d(fVar4, com.yandex.plus.bdui.plus.auth.c.a)) {
                    com.yandex.plus.log.api.a aVar3 = com.yandex.plus.log.api.a.c;
                    if (bVar4.b(aVar3)) {
                        bVar4.c(aVar3, "PlusAuthorizeActionHandler", "handle(); authorize cancelled");
                    }
                    com.yandex.plus.bdui.action.a aVar4 = dVar.b;
                    if (aVar4 != null) {
                        if (bVar4.b(aVar3)) {
                            bVar4.c(aVar3, "PlusAuthorizeActionHandler", "handle(); dispatch cancel action = " + aVar4 + " with payload = " + map2);
                        }
                        com.yandex.plus.bdui.plus.action.e.b(eVar, aVar4, iVar);
                    } else if (bVar4.b(aVar3)) {
                        bVar4.c(aVar3, "PlusAuthorizeActionHandler", "handle(); cancel action not defined");
                    }
                } else {
                    if (!(fVar4 instanceof com.yandex.plus.bdui.plus.auth.d)) {
                        b6e.s();
                        return null;
                    }
                    Throwable th = ((com.yandex.plus.bdui.plus.auth.d) fVar4).a;
                    com.yandex.plus.log.api.a aVar5 = com.yandex.plus.log.api.a.e;
                    if (bVar4.b(aVar5)) {
                        bVar4.a(aVar5, "PlusAuthorizeActionHandler", "handle(); authorize failed! ", th);
                    }
                    com.yandex.plus.bdui.action.a aVar6 = dVar.c;
                    if (aVar6 != null) {
                        com.yandex.plus.log.api.a aVar7 = com.yandex.plus.log.api.a.c;
                        if (bVar4.b(aVar7)) {
                            bVar4.c(aVar7, "PlusAuthorizeActionHandler", "handle(); dispatch error action = " + aVar6 + " with payload = " + map2);
                        }
                        com.yandex.plus.bdui.plus.action.e.b(eVar, aVar6, iVar);
                    } else {
                        com.yandex.plus.log.api.a aVar8 = com.yandex.plus.log.api.a.c;
                        if (bVar4.b(aVar8)) {
                            bVar4.c(aVar8, "PlusAuthorizeActionHandler", "handle(); error action not defined");
                        }
                    }
                }
                return Unit.a;
            case 6:
                com.yandex.plus.bdui.plus.scaffold.controller.b bVar5 = (com.yandex.plus.bdui.plus.scaffold.controller.b) this.b;
                ArrayList arrayList2 = (ArrayList) this.c;
                ArrayList arrayList3 = (ArrayList) this.d;
                com.yandex.plus.bdui.plus.scaffold.controller.a aVar9 = (com.yandex.plus.bdui.plus.scaffold.controller.a) obj;
                aVar9.getClass();
                FrameLayout frameLayout = bVar5.b;
                int i6 = 0;
                int i7 = 0;
                while (true) {
                    if (i7 < aVar9.getChildCount()) {
                        int i8 = i7 + 1;
                        View childAt = aVar9.getChildAt(i7);
                        if (childAt == null) {
                            rj7.m();
                            return null;
                        }
                        if (i6 < 0) {
                            u75.n();
                            throw null;
                        }
                        if (!frameLayout.equals(childAt)) {
                            i6++;
                            i7 = i8;
                        }
                    } else {
                        i6 = -1;
                    }
                }
                if (i6 < 0) {
                    xq0.x("Failed requirement.");
                    return null;
                }
                for (Pair pair : bVar5.c) {
                    ((com.yandex.plus.bdui.ui.a) pair.a).a((View) pair.b);
                }
                for (Pair pair2 : bVar5.d) {
                    ((com.yandex.plus.bdui.ui.a) pair2.a).a((View) pair2.b);
                }
                aVar9.removeViewsInLayout(0, i6);
                aVar9.removeViewsInLayout(1, aVar9.getChildCount() - 1);
                if (aVar9.getChildCount() != 1 || !Intrinsics.d(aVar9.getChildAt(0), bVar5.b)) {
                    xq0.x("Failed requirement.");
                    return null;
                }
                bVar5.c = com.yandex.plus.bdui.plus.scaffold.controller.b.a(arrayList2, aVar9);
                bVar5.d = com.yandex.plus.bdui.plus.scaffold.controller.b.a(arrayList3, aVar9);
                for (Object obj2 : bVar5.c) {
                    int i9 = i3 + 1;
                    if (i3 < 0) {
                        u75.n();
                        throw null;
                    }
                    aVar9.a((View) ((Pair) obj2).b, i3, 48);
                    i3 = i9;
                }
                Iterator it = bVar5.d.iterator();
                while (it.hasNext()) {
                    aVar9.a((View) ((Pair) it.next()).b, aVar9.getChildCount(), 80);
                }
                return Unit.a;
            case 7:
                com.yandex.plus.bdui.plus.webview.b bVar6 = (com.yandex.plus.bdui.plus.webview.b) this.b;
                com.yandex.plus.log.api.b bVar7 = bVar6.f;
                String str9 = (String) this.c;
                String str10 = (String) this.d;
                com.yandex.plus.bdui.plus.auth.f fVar5 = (com.yandex.plus.bdui.plus.auth.f) obj;
                fVar5.getClass();
                if (fVar5 instanceof com.yandex.plus.bdui.plus.auth.e) {
                    com.yandex.plus.log.api.a aVar10 = com.yandex.plus.log.api.a.c;
                    if (bVar7.b(aVar10)) {
                        bVar7.c(aVar10, "AuthorizeContract", "authorize(); authorize succeeded for user with userId=" + ((com.yandex.plus.bdui.plus.auth.e) fVar5).a);
                    }
                    bVar6.g = x97.y(bVar6.e, null, null, new ocu(bVar6, str10, str9, fVar5, (Continuation) null, 25), 3);
                } else if (fVar5.equals(com.yandex.plus.bdui.plus.auth.c.a)) {
                    com.yandex.plus.log.api.a aVar11 = com.yandex.plus.log.api.a.c;
                    if (bVar7.b(aVar11)) {
                        bVar7.c(aVar11, "AuthorizeContract", "authorize(); authorize cancelled");
                    }
                    bVar6.x(str9);
                } else {
                    if (!(fVar5 instanceof com.yandex.plus.bdui.plus.auth.d)) {
                        b6e.s();
                        return null;
                    }
                    Throwable th2 = ((com.yandex.plus.bdui.plus.auth.d) fVar5).a;
                    com.yandex.plus.log.api.a aVar12 = com.yandex.plus.log.api.a.e;
                    if (bVar7.b(aVar12)) {
                        bVar7.a(aVar12, "AuthorizeContract", "authorize(); authorize failed", th2);
                    }
                    bVar6.x(str9);
                }
                return Unit.a;
            case 8:
                com.yandex.plus.bdui.templating.render.a aVar13 = (com.yandex.plus.bdui.templating.render.a) this.b;
                com.yandex.plus.core.debug.panel.internal.presentation.view.i iVar2 = (com.yandex.plus.core.debug.panel.internal.presentation.view.i) this.c;
                com.yandex.plus.core.debug.panel.internal.presentation.view.d dVar2 = (com.yandex.plus.core.debug.panel.internal.presentation.view.d) this.d;
                List list = (List) obj;
                int i10 = com.yandex.plus.core.debug.panel.internal.presentation.view.d.o;
                list.getClass();
                aVar13.invoke(list);
                iVar2.invoke();
                dVar2.a();
                return Unit.a;
            case 9:
                com.yandex.plus.home.internal.di.u uVar = (com.yandex.plus.home.internal.di.u) this.b;
                com.yandex.plus.metrica.a aVar14 = (com.yandex.plus.metrica.a) this.c;
                com.yandex.plus.home.benchmark.d dVar3 = (com.yandex.plus.home.benchmark.d) this.d;
                ((com.yandex.plus.core.benchmark.l) obj).getClass();
                wqr n = a4g.n();
                ((com.yandex.plus.core.dispatcher.a) uVar.w).getClass();
                mn7 mn7Var = com.yandex.plus.core.dispatcher.a.e;
                tf6 e = gld.e(kotlin.coroutines.e.c(n, mn7Var));
                com.yandex.plus.metrica.utils.i iVar3 = (com.yandex.plus.metrica.utils.i) aVar14.b.getValue();
                com.yandex.plus.metrica.utils.z a = aVar14.a();
                com.yandex.plus.metrica.utils.z a2 = aVar14.a();
                com.yandex.plus.metrica.utils.z a3 = aVar14.a();
                ReentrantLock reentrantLock = com.yandex.plus.home.internal.di.s.a;
                com.yandex.plus.bdui.plus.checkout.content.controller.w wVar = new com.yandex.plus.bdui.plus.checkout.content.controller.w(0, a2, com.yandex.plus.metrica.utils.z.class, "getSessionController", "getSessionController()Lcom/yandex/plus/core/analytics/SessionController;", 0, 23);
                ((com.yandex.plus.core.dispatcher.a) uVar.w).getClass();
                bsd bsdVar = com.yandex.plus.core.dispatcher.a.d;
                ((com.yandex.plus.core.dispatcher.a) uVar.w).getClass();
                bsdVar.getClass();
                int i11 = 23;
                if (!com.yandex.plus.home.internal.di.s.c.getAndSet(true)) {
                    x97.y(gld.e(bsdVar), null, null, new db(2, 23, null), 3);
                }
                if (com.yandex.plus.home.internal.di.s.d == null) {
                    ReentrantLock reentrantLock2 = com.yandex.plus.home.internal.di.s.a;
                    reentrantLock2.lock();
                    try {
                        if (com.yandex.plus.home.internal.di.s.d == null && (fVar = (com.yandex.plus.core.analytics.metrica.f) wVar.invoke()) != null) {
                            com.yandex.plus.home.internal.di.s.d = new com.yandex.plus.bdui.templating.render.a(i, gld.e(mn7Var.plus(a4g.n())), fVar);
                        }
                    } finally {
                        reentrantLock2.unlock();
                    }
                }
                com.yandex.plus.adapter.auth.passport750.i iVar4 = uVar.d;
                com.yandex.plus.adapter.auth.api.c b = com.yandex.plus.bdui.flex.ui.a.b(uVar.b);
                int ordinal = uVar.b.ordinal();
                if (ordinal == 0) {
                    str = "jE22HNiRv5rbWsO6hy3X/0pdVzdr6Kd9gzOOGv29+3Yub1E8xzcrYLgPm3WZalQD";
                } else {
                    if (ordinal != 1) {
                        b6e.s();
                        return null;
                    }
                    str = "2ki1HdmQtMrWD8m4hy/fqhJR1ZTAzlUoo2dEu9SUU+1zL9QrUy47pcnLvL6ELcie";
                }
                String str11 = str;
                int ordinal2 = uVar.b.ordinal();
                if (ordinal2 == 0) {
                    str2 = "3hu1EYKUsp/TW5Xshynb+uwwALF5y1D9aPutP+8KT7qGdUnNaBIh1U3lq7MU7885";
                } else {
                    if (ordinal2 != 1) {
                        b6e.s();
                        return null;
                    }
                    str2 = "3h2+EdOU5c3XW5Tph3/cqcaVjYscnu2oLbIpqMSXdeVvXFYjTOfE8Xmjf8Wnffcy";
                }
                String str12 = str2;
                com.yandex.plus.core.analytics.logging.d dVar4 = uVar.x;
                ((com.yandex.plus.core.dispatcher.a) uVar.w).getClass();
                bsd bsdVar2 = com.yandex.plus.core.dispatcher.a.c;
                ((com.yandex.plus.core.dispatcher.a) uVar.w).getClass();
                dq7 dq7Var = com.yandex.plus.core.dispatcher.a.f;
                iVar4.getClass();
                bsdVar2.getClass();
                dq7Var.getClass();
                com.yandex.plus.domain.auth.impl.i iVar5 = new com.yandex.plus.domain.auth.impl.i(iVar4, b, str11, str12, dVar4, e, bsdVar2, dq7Var, "home_sdk");
                com.yandex.plus.home.internal.di.e eVar2 = new com.yandex.plus.home.internal.di.e(dVar3);
                com.yandex.plus.home.internal.di.d dVar5 = new com.yandex.plus.home.internal.di.d(uVar, iVar5, new com.yandex.plus.bdui.plus.checkout.content.controller.w(0, a, com.yandex.plus.metrica.utils.z.class, "getUserConsumer", "getUserConsumer()Lcom/yandex/plus/core/analytics/UserConsumer;", 0, 24), new com.yandex.plus.bdui.content.b(15, uVar, a3));
                com.yandex.passport.internal.core.accounts.h hVar = new com.yandex.passport.internal.core.accounts.h(uVar);
                com.yandex.plus.home.internal.di.p pVar = new com.yandex.plus.home.internal.di.p(uVar, dVar5, iVar5, iVar3);
                com.yandex.plus.home.internal.di.l lVar = new com.yandex.plus.home.internal.di.l(iVar3, uVar, dVar5, eVar2, pVar, hVar, iVar5, e);
                com.yandex.plus.home.plaque.feature.internal.presentation.b bVar8 = new com.yandex.plus.home.plaque.feature.internal.presentation.b();
                bVar8.a = btf.b(new com.yandex.plus.home.internal.di.f(lVar, eVar2, e));
                btf.b(new com.yandex.plus.bdui.content.b(22, bVar8, dVar5));
                btf.b(new com.yandex.plus.home.feature.panel.internal.shortcuts.daily.animation.a(9, bVar8));
                bVar8.b = btf.b(new com.yandex.plus.home.internal.di.f(lVar, i11));
                bVar8.c = btf.b(new com.yandex.plus.home.internal.di.f(lVar, 24));
                bVar8.d = btf.b(new com.yandex.plus.bdui.flex.factory.p(14, lVar, uVar, e));
                bVar8.e = btf.b(new com.yandex.plus.home.e(uVar, i4));
                bVar8.f = btf.b(new com.yandex.plus.home.e(uVar, i2));
                return new com.yandex.plus.home.t(uVar, eVar2, dVar5, pVar, lVar, bVar8, iVar5, e);
            case 10:
                com.yandex.plus.bdui.flex.ui.s sVar = (com.yandex.plus.bdui.flex.ui.s) this.b;
                com.yandex.plus.home.feature.webviews.internal.serviceinfo.b bVar9 = (com.yandex.plus.home.feature.webviews.internal.serviceinfo.b) this.c;
                zne zneVar = (zne) this.d;
                com.yandex.plus.core.debug.panel.internal.presentation.builder.a aVar15 = (com.yandex.plus.core.debug.panel.internal.presentation.builder.a) obj;
                aVar15.getClass();
                com.yandex.plus.metrica.utils.i iVar6 = (com.yandex.plus.metrica.utils.i) sVar.d;
                com.yandex.plus.core.debug.panel.api.data.a aVar16 = com.yandex.plus.core.debug.panel.api.data.a.a;
                com.yandex.plus.home.auth.f fVar6 = (com.yandex.plus.home.auth.f) sVar.c;
                fVar6.getClass();
                com.yandex.plus.domain.auth.impl.i iVar7 = fVar6.a;
                iVar7.getClass();
                Long id = ((com.yandex.plus.domain.auth.api.e) iVar7.h.getValue()).getId();
                String str13 = "no_value";
                if (id == null || (str3 = id.toString()) == null) {
                    str3 = "no_value";
                }
                com.yandex.plus.core.debug.panel.api.data.b bVar10 = new com.yandex.plus.core.debug.panel.api.data.b(aVar16, str3);
                com.yandex.plus.core.debug.panel.api.data.a aVar17 = com.yandex.plus.core.debug.panel.api.data.a.b;
                String a4 = iVar6.a();
                if (a4 == null) {
                    a4 = "no_value";
                }
                com.yandex.plus.core.debug.panel.api.data.b bVar11 = new com.yandex.plus.core.debug.panel.api.data.b(aVar17, a4);
                com.yandex.plus.core.debug.panel.api.data.b bVar12 = new com.yandex.plus.core.debug.panel.api.data.b(com.yandex.plus.core.debug.panel.api.data.a.c, com.yandex.plus.bdui.flex.ui.s.l());
                com.yandex.plus.core.debug.panel.api.data.b bVar13 = new com.yandex.plus.core.debug.panel.api.data.b(com.yandex.plus.core.debug.panel.api.data.a.d, com.yandex.plus.bdui.flex.ui.s.l());
                com.yandex.plus.core.debug.panel.api.data.a aVar18 = com.yandex.plus.core.debug.panel.api.data.a.e;
                String str14 = Build.VERSION.RELEASE;
                str14.getClass();
                com.yandex.plus.core.debug.panel.api.data.b bVar14 = new com.yandex.plus.core.debug.panel.api.data.b(aVar18, str14);
                com.yandex.plus.core.debug.panel.api.data.b bVar15 = new com.yandex.plus.core.debug.panel.api.data.b(com.yandex.plus.core.debug.panel.api.data.a.f, "110.0.0");
                com.yandex.plus.core.debug.panel.api.data.a aVar19 = com.yandex.plus.core.debug.panel.api.data.a.g;
                String b2 = iVar6.b();
                if (b2 == null) {
                    b2 = "no_value";
                }
                com.yandex.plus.core.debug.panel.api.data.b bVar16 = new com.yandex.plus.core.debug.panel.api.data.b(aVar19, b2);
                com.yandex.plus.core.debug.panel.api.data.b bVar17 = new com.yandex.plus.core.debug.panel.api.data.b(com.yandex.plus.core.debug.panel.api.data.a.h, ((com.yandex.plus.core.config.a) sVar.f).name());
                com.yandex.plus.core.debug.panel.api.data.b bVar18 = new com.yandex.plus.core.debug.panel.api.data.b(com.yandex.plus.core.debug.panel.api.data.a.i, "no_value");
                com.yandex.plus.core.debug.panel.api.data.a aVar20 = com.yandex.plus.core.debug.panel.api.data.a.j;
                if (bVar9 == null || (str4 = bVar9.a) == null) {
                    str4 = "no_value";
                }
                com.yandex.plus.core.debug.panel.api.data.b bVar19 = new com.yandex.plus.core.debug.panel.api.data.b(aVar20, str4);
                com.yandex.plus.core.debug.panel.api.data.a aVar21 = com.yandex.plus.core.debug.panel.api.data.a.k;
                if (bVar9 != null && (str5 = bVar9.b) != null) {
                    str13 = str5;
                }
                List h = u75.h(bVar10, bVar11, bVar12, bVar13, bVar14, bVar15, bVar16, bVar17, bVar18, bVar19, new com.yandex.plus.core.debug.panel.api.data.b(aVar21, str13));
                h.getClass();
                aVar15.a.addAll(h);
                xdr xdrVar = (xdr) sVar.g;
                xdrVar.getClass();
                aVar15.c = xdrVar;
                zneVar.getClass();
                aVar15.d = zneVar;
                return Unit.a;
            case 11:
                String str15 = (String) this.b;
                com.yandex.passport.internal.flags.experiments.p pVar2 = (com.yandex.passport.internal.flags.experiments.p) this.c;
                com.yandex.plus.pay.internal.g gVar = (com.yandex.plus.pay.internal.g) this.d;
                ((com.yandex.plus.core.benchmark.l) obj).getClass();
                com.yandex.plus.core.imageloader.b bVar20 = (com.yandex.plus.core.imageloader.b) pVar2.c;
                if (bVar20 == null) {
                    b6e.j(33, "Parameter PlusImageLoader is required for ", ern.a(com.yandex.plus.pay.ui.core.b.class));
                    return null;
                }
                com.yandex.plus.pay.a aVar22 = (com.yandex.plus.pay.a) pVar2.b;
                if (aVar22 == null) {
                    b6e.j(33, "Parameter PlusPay is required for ", ern.a(com.yandex.plus.pay.ui.core.b.class));
                    return null;
                }
                com.yandex.plus.home.dailyquests.feature.api.c cVar = (com.yandex.plus.home.dailyquests.feature.api.c) pVar2.d;
                com.yandex.plus.pay.internal.di.r c = gVar.c();
                Context context = c.l;
                com.yandex.plus.pay.ui.core.internal.di.d dVar6 = new com.yandex.plus.pay.ui.core.internal.di.d(str15, c.A, bVar20, aVar22, gVar, c, new com.yandex.plus.home.plaque.plugin.internal.proxy.a(i, new com.yandex.plus.resources.core.c(context, gVar.c().h)), new com.yandex.plus.home.internal.di.y(context, c.A), cVar);
                com.yandex.plus.pay.ui.core.internal.di.b bVar21 = new com.yandex.plus.pay.ui.core.internal.di.b(dVar6, 1);
                com.yandex.plus.pay.ui.core.internal.di.b bVar22 = new com.yandex.plus.pay.ui.core.internal.di.b(dVar6, 0);
                final com.yandex.passport.internal.entities.j jVar = new com.yandex.passport.internal.entities.j();
                jVar.a = dVar6;
                jVar.b = bVar21;
                jVar.c = bVar22;
                jVar.d = btf.b(new Function0() { // from class: com.yandex.plus.pay.ui.core.internal.di.f
                    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
                        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v1 com.yandex.plus.pay.ui.core.internal.a, still in use, count: 2, list:
                          (r2v1 com.yandex.plus.pay.ui.core.internal.a) from 0x0106: MOVE (r35v0 com.yandex.plus.pay.ui.core.internal.a) = (r2v1 com.yandex.plus.pay.ui.core.internal.a) (LINE:263)
                          (r2v1 com.yandex.plus.pay.ui.core.internal.a) from 0x003d: MOVE (r35v2 com.yandex.plus.pay.ui.core.internal.a) = (r2v1 com.yandex.plus.pay.ui.core.internal.a) (LINE:62)
                        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
                        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
                        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
                        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
                        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:447)
                        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
                        */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        /*
                            Method dump skipped, instructions count: 300
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.yandex.plus.pay.ui.core.internal.di.f.invoke():java.lang.Object");
                    }
                });
                jVar.e = btf.b(new Function0() { // from class: com.yandex.plus.pay.ui.core.internal.di.f
                    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
                        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v1 com.yandex.plus.pay.ui.core.internal.a, still in use, count: 2, list:
                          (r2v1 com.yandex.plus.pay.ui.core.internal.a) from 0x0106: MOVE (r35v0 com.yandex.plus.pay.ui.core.internal.a) = (r2v1 com.yandex.plus.pay.ui.core.internal.a) (LINE:263)
                          (r2v1 com.yandex.plus.pay.ui.core.internal.a) from 0x003d: MOVE (r35v2 com.yandex.plus.pay.ui.core.internal.a) = (r2v1 com.yandex.plus.pay.ui.core.internal.a) (LINE:62)
                        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
                        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
                        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
                        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
                        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:447)
                        */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        /*
                            Method dump skipped, instructions count: 300
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.yandex.plus.pay.ui.core.internal.di.f.invoke():java.lang.Object");
                    }
                });
                com.yandex.plus.home.plaque.plugin.internal.proxy.a aVar23 = new com.yandex.plus.home.plaque.plugin.internal.proxy.a(dVar6, bVar21, jVar);
                com.yandex.plus.pay.ui.core.internal.di.e eVar3 = com.yandex.plus.pay.ui.core.internal.di.e.d;
                eVar3.getClass();
                ((Map) ((jyr) eVar3.c).getValue()).put(str15, aVar23);
                return new com.yandex.plus.pay.ui.core.a(aVar23);
            default:
                WebView webView2 = (WebView) this.b;
                SslError sslError = (SslError) this.c;
                com.yandex.plus.webview.core.a aVar24 = (com.yandex.plus.webview.core.a) this.d;
                ((SslError) obj).getClass();
                boolean d = Intrinsics.d(webView2.getUrl(), sslError.getUrl());
                String url = webView2.getUrl();
                String url2 = d ? null : sslError.getUrl();
                int primaryError = sslError.getPrimaryError();
                String str16 = primaryError != 0 ? primaryError != 1 ? primaryError != 2 ? primaryError != 3 ? primaryError != 4 ? primaryError != 5 ? "No description" : "A generic error occurred" : "The date of the certificate is invalid" : "The certificate authority is not trusted" : "Hostname mismatch" : "The certificate has expired" : "The certificate is not yet valid";
                com.yandex.plus.log.api.b bVar23 = aVar24.a;
                com.yandex.plus.log.api.a aVar25 = com.yandex.plus.log.api.a.e;
                if (bVar23.b(aVar25)) {
                    bVar23.c(aVar25, "PlusWebViewClient", "onReceivedSslError() isMainFrame=" + d + ", mainFrameUrl=" + url + ", resourceUrl=" + url2 + ", errorCode=" + sslError.getPrimaryError() + ", description=" + str16);
                }
                aVar24.b.d(sslError.getPrimaryError(), url, url2, str16, d);
                return Unit.a;
        }
    }

    public /* synthetic */ i(int i, Object obj, Object obj2, Object obj3) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }
}
