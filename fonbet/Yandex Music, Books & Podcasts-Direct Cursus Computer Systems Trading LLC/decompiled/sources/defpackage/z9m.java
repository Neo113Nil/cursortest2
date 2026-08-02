package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.t;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.yandex.passport.data.network.l;
import com.yandex.passport.internal.core.accounts.h;
import com.yandex.passport.internal.ui.bouncer.model.middleware.o;
import com.yandex.passport.sloth.ui.c;
import com.yandex.plus.bdui.flex.ui.s;
import com.yandex.plus.bdui.plus.content.controller.f;
import com.yandex.plus.core.dispatcher.b;
import com.yandex.plus.core.graphql.type.a1;
import com.yandex.plus.home.analytics.payment.e;
import com.yandex.plus.home.api.webview.a;
import com.yandex.plus.home.feature.webviews.internal.uri.y;
import com.yandex.plus.home.feature.webviews.internalapi.analytics.payment.g;
import com.yandex.plus.home.graphql.subscription.d;
import com.yandex.plus.home.internal.di.u;
import com.yandex.plus.home.internal.di.v;
import com.yandex.plus.home.internal.di.z;
import com.yandex.plus.home.j;
import com.yandex.plus.metrica.utils.i;
import com.yandex.plus.pay.adapter.api.g0;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import ru.yandex.music.R;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lz9m;", "Ljnb;", "<init>", "()V", "plus-webview"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes3.dex */
public final class z9m extends jnb {
    public final jyr j;
    public final jyr k = l18.b.b(hag.I(m7m.class), true);
    public final jyr l;
    public final jyr m;

    public z9m() {
        final int i = 0;
        this.j = btf.b(new Function0(this) { // from class: x9m
            public final /* synthetic */ z9m b;

            {
                this.b = this;
            }

            /* JADX WARN: Removed duplicated region for block: B:22:0x0299  */
            /* JADX WARN: Removed duplicated region for block: B:36:0x0669  */
            @Override // kotlin.jvm.functions.Function0
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invoke() {
                Object obj;
                a1 a1Var;
                Object t7oVar;
                int i2 = i;
                z9m z9mVar = this.b;
                switch (i2) {
                    case 0:
                        return new y9m(z9mVar);
                    case 1:
                        m7m m7mVar = (m7m) z9mVar.k.getValue();
                        t requireActivity = z9mVar.requireActivity();
                        requireActivity.getClass();
                        l13 l13Var = m7mVar.a;
                        j jVar = (j) ((o7m) l13Var.a.D(hag.I(o7m.class), l13Var, l13Var.b)).a(requireActivity).a.getValue();
                        jVar.getClass();
                        return new o9m(requireActivity, new f((z) jVar.i.getValue(), a.a));
                    default:
                        o9m o9mVar = (o9m) z9mVar.l.getValue();
                        f fVar = o9mVar.b;
                        t tVar = o9mVar.a;
                        xqn xqnVar = new xqn();
                        xqn xqnVar2 = new xqn();
                        xqn xqnVar3 = new xqn();
                        xqn xqnVar4 = new xqn();
                        com.yandex.plus.home.api.config.a aVar = new com.yandex.plus.home.api.config.a();
                        aVar.a = null;
                        aVar.b = null;
                        aVar.c = null;
                        aVar.d = null;
                        aVar.e = null;
                        xqnVar.a = aVar;
                        z zVar = (z) fVar.c;
                        com.yandex.plus.core.locale.a aVar2 = zVar.q;
                        u uVar = zVar.a;
                        v vVar = zVar.R;
                        d dVar = zVar.z;
                        com.yandex.plus.home.feature.webviews.internalapi.animation.animator.a aVar3 = zVar.J;
                        c cVar = zVar.G;
                        b bVar = zVar.o;
                        com.yandex.plus.home.internal.di.c cVar2 = zVar.i;
                        Context m = com.yandex.plus.home.common.utils.a.m(tVar, aVar2.a());
                        com.yandex.plus.ui.core.theme.a aVar4 = (com.yandex.plus.ui.core.theme.a) zVar.L.a.getValue();
                        com.yandex.plus.core.theme.d dVar2 = zVar.E;
                        dVar2.getClass();
                        aVar4.getClass();
                        Context n = com.yandex.plus.home.common.utils.a.n(m, dVar2.a(m, aVar4), R.style.PlusSDK_WebViews_Fonts);
                        o oVar = new o();
                        if (xqnVar2.a == null) {
                            boolean r = com.yandex.plus.bdui.plus.checkout.content.serializer.dto.u.r(tVar, aVar4);
                            l lVar = new l(tVar);
                            if (!xz0.u(com.yandex.plus.core.a.a, tVar.getPackageName())) {
                                try {
                                    r7o r7oVar = z7o.b;
                                    int identifier = tVar.getResources().getIdentifier("plus_sdk_treasury_messages_logging_allowed", "bool", tVar.getPackageName());
                                    t7oVar = Boolean.valueOf(identifier != 0 ? tVar.getResources().getBoolean(identifier) : false);
                                } catch (Throwable th) {
                                    r7o r7oVar2 = z7o.b;
                                    t7oVar = new t7o(th);
                                }
                                Object obj2 = Boolean.FALSE;
                                if (t7oVar instanceof t7o) {
                                    t7oVar = obj2;
                                }
                                if (!((Boolean) t7oVar).booleanValue()) {
                                    a1Var = new a1(16);
                                    a1 a1Var2 = a1Var;
                                    com.yandex.plus.home.feature.webviews.internal.accessibility.b bVar2 = new com.yandex.plus.home.feature.webviews.internal.accessibility.b();
                                    a1 a1Var3 = zVar.j;
                                    ((com.yandex.plus.core.dispatcher.a) bVar).getClass();
                                    mn7 mn7Var = com.yandex.plus.core.dispatcher.a.e;
                                    f fVar2 = new f(a1Var3, mn7Var);
                                    com.yandex.plus.core.location.a aVar5 = zVar.n;
                                    dq7 dq7Var = com.yandex.plus.core.dispatcher.a.f;
                                    f fVar3 = new f((com.yandex.plus.home.ybsdk.a) null, aVar5, dq7Var);
                                    com.yandex.plus.home.feature.webviews.internal.purchase.subscription.b bVar3 = new com.yandex.plus.home.feature.webviews.internal.purchase.subscription.b(dVar);
                                    dVar.getClass();
                                    l lVar2 = new l();
                                    lVar2.a = dVar;
                                    g0 g0Var = zVar.A;
                                    g0Var.getClass();
                                    l lVar3 = new l();
                                    lVar3.a = g0Var;
                                    com.yandex.plus.home.plaque.feature.internal.presentation.b bVar4 = new com.yandex.plus.home.plaque.feature.internal.presentation.b();
                                    bVar4.a = bVar3;
                                    bVar4.b = lVar2;
                                    bVar4.c = lVar3;
                                    bVar4.d = new com.yandex.passport.common.mvi.d(bVar3.b, bVar4, 15);
                                    x0q b = y0q.b(0, 0, null, 7);
                                    bVar4.e = b;
                                    bVar4.f = new dkn(b);
                                    f fVar4 = new f(dq7Var);
                                    s sVar = new s(zVar.D, zVar.K, (Set) zVar.Q.invoke(), (Uri) vVar.invoke(), (Uri) zVar.S.invoke());
                                    Uri uri = (Uri) vVar.invoke();
                                    String str = zVar.g;
                                    String str2 = zVar.f;
                                    String str3 = zVar.h;
                                    com.yandex.plus.core.locale.a aVar6 = zVar.q;
                                    i iVar = zVar.p;
                                    com.yandex.plus.core.location.a aVar7 = zVar.n;
                                    String str4 = zVar.s;
                                    String str5 = zVar.t;
                                    g0 g0Var2 = zVar.w;
                                    Build.MANUFACTURER.getClass();
                                    Build.MODEL.getClass();
                                    com.yandex.plus.home.feature.webviews.internal.uri.t tVar2 = new com.yandex.plus.home.feature.webviews.internal.uri.t(sVar, zVar.K, uri, new com.yandex.plus.home.feature.panel.internal.shortcuts.daily.animation.a(8, fVar), str, str2, str3, aVar6, iVar, aVar7, str4, str5, g0Var2, Build.VERSION.SDK_INT, r, false);
                                    zVar.M.invoke();
                                    Set set = (Set) zVar.N.invoke();
                                    Set set2 = (Set) zVar.O.invoke();
                                    Set set3 = (Set) zVar.P.invoke();
                                    com.yandex.plus.home.internal.di.d dVar3 = cVar2.a;
                                    com.yandex.plus.home.internal.di.d dVar4 = cVar2.a;
                                    com.yandex.plus.home.analytics.diagnostic.webview.a aVar8 = (com.yandex.plus.home.analytics.diagnostic.webview.a) dVar3.y.getValue();
                                    com.yandex.plus.home.analytics.diagnostic.webview.a aVar9 = (com.yandex.plus.home.analytics.diagnostic.webview.a) dVar3.w.getValue();
                                    com.yandex.plus.home.analytics.diagnostic.webview.a aVar10 = (com.yandex.plus.home.analytics.diagnostic.webview.a) dVar3.x.getValue();
                                    com.yandex.plus.core.analytics.logging.d dVar5 = zVar.K;
                                    set.getClass();
                                    set2.getClass();
                                    set3.getClass();
                                    aVar8.getClass();
                                    aVar9.getClass();
                                    aVar10.getClass();
                                    dVar5.getClass();
                                    a1 a1Var4 = new a1(19);
                                    y yVar = new y(sVar, zVar.l);
                                    com.yandex.plus.home.auth.f fVar5 = zVar.l;
                                    bsd bsdVar = com.yandex.plus.core.dispatcher.a.c;
                                    a1 a1Var5 = zVar.j;
                                    com.yandex.plus.home.plaque.plugin.internal.proxy.a aVar11 = zVar.k;
                                    com.yandex.plus.home.analytics.diagnostic.webview.a d = cVar2.d(com.yandex.plus.home.feature.webviews.internalapi.analytics.diagnostic.b.a);
                                    com.yandex.plus.home.feature.webviews.internalapi.analytics.diagnostic.a aVar12 = com.yandex.plus.home.feature.webviews.internalapi.analytics.diagnostic.a.a;
                                    com.yandex.plus.home.analytics.diagnostic.messaging.b c = cVar2.c(aVar12);
                                    com.yandex.plus.home.analytics.diagnostic.messaging.a a = cVar2.a(aVar12);
                                    com.yandex.plus.home.analytics.f fVar6 = (com.yandex.plus.home.analytics.f) dVar4.s.getValue();
                                    com.yandex.plus.core.graphql.daily.progress.s sVar2 = zVar.T;
                                    com.yandex.plus.home.feature.webviews.internal.stories.i iVar2 = new com.yandex.plus.home.feature.webviews.internal.stories.i(0, (z) fVar.c, z.class, "createHomeWebViewLoadingBenchmark", "createHomeWebViewLoadingBenchmark()Lcom/yandex/plus/core/benchmark/ViewLoadingBenchmark;", 0, 6);
                                    com.yandex.plus.home.api.config.a aVar13 = (com.yandex.plus.home.api.config.a) xqnVar.a;
                                    if (xqnVar2.a != null) {
                                        obj = null;
                                        com.yandex.plus.home.feature.webviews.internal.container.factory.a aVar14 = new com.yandex.plus.home.feature.webviews.internal.container.factory.a(sVar, fVar5, bsdVar, mn7Var, dq7Var, a1Var5, fVar2, aVar11, d, c, a, fVar6, sVar2, iVar2, n, bVar2, aVar13, fVar4, zVar.e, (com.yandex.plus.home.feature.webviews.internalapi.analytics.a) dVar3.j.getValue(), (com.yandex.plus.home.analytics.payment.d) dVar4.o.getValue(), (e) dVar4.q.getValue(), (com.yandex.plus.home.analytics.payment.b) dVar4.p.getValue(), cVar2.b(g.a), (com.yandex.plus.home.analytics.payment.a) dVar4.J.getValue(), fVar3, oVar, bVar4, zVar.L, zVar.u, zVar.v, zVar.x, zVar.y, zVar.A, zVar.w, bVar3, a1Var2, new com.yandex.plus.core.network.ssl.a(uVar.a, "HomeWebView"), cVar, zVar.H, (com.yandex.plus.home.api.webview.b) xqnVar4.a, aVar3, zVar.F, zVar.K, zVar.c, zVar.d);
                                        com.yandex.plus.home.auth.f fVar7 = zVar.l;
                                        a1 a1Var6 = zVar.j;
                                        com.yandex.plus.home.plaque.plugin.internal.proxy.a aVar15 = zVar.k;
                                        com.yandex.plus.home.analytics.diagnostic.webview.a d2 = cVar2.d(com.yandex.plus.home.feature.webviews.internalapi.analytics.diagnostic.b.b);
                                        com.yandex.plus.home.feature.webviews.internalapi.analytics.diagnostic.a aVar16 = com.yandex.plus.home.feature.webviews.internalapi.analytics.diagnostic.a.b;
                                        com.yandex.plus.home.analytics.diagnostic.messaging.b c2 = cVar2.c(aVar16);
                                        com.yandex.plus.home.analytics.diagnostic.messaging.a a2 = cVar2.a(aVar16);
                                        com.yandex.plus.home.analytics.f fVar8 = (com.yandex.plus.home.analytics.f) dVar4.s.getValue();
                                        com.yandex.plus.core.graphql.daily.progress.s sVar3 = zVar.T;
                                        z zVar2 = (z) fVar.c;
                                        com.yandex.plus.home.feature.webviews.internal.stories.i iVar3 = new com.yandex.plus.home.feature.webviews.internal.stories.i(0, zVar2, z.class, "createStoriesWebViewLoadingBenchmark", "createStoriesWebViewLoadingBenchmark()Lcom/yandex/plus/core/benchmark/ViewLoadingBenchmark;", 0, 9);
                                        com.yandex.plus.home.api.config.a aVar17 = (com.yandex.plus.home.api.config.a) xqnVar.a;
                                        com.yandex.plus.home.feature.webviews.internalapi.analytics.a aVar18 = (com.yandex.plus.home.feature.webviews.internalapi.analytics.a) zVar2.i.a.k.getValue();
                                        com.yandex.plus.home.analytics.payment.d dVar6 = (com.yandex.plus.home.analytics.payment.d) dVar4.o.getValue();
                                        e eVar = (e) dVar4.q.getValue();
                                        com.yandex.plus.home.analytics.payment.b bVar5 = (com.yandex.plus.home.analytics.payment.b) dVar4.p.getValue();
                                        com.yandex.plus.home.analytics.payment.c b2 = cVar2.b(g.b);
                                        fkn fknVar = zVar.L;
                                        if (xqnVar2.a == null) {
                                            o77 o77Var = new o77(sVar, fVar7, bsdVar, mn7Var, dq7Var, a1Var6, fVar2, aVar15, d2, c2, a2, fVar8, sVar3, iVar3, fVar4, n, bVar2, aVar17, aVar18, dVar6, eVar, bVar5, b2, (com.yandex.plus.home.analytics.payment.a) dVar4.J.getValue(), oVar, bVar4, fknVar, zVar.u, zVar.v, zVar.x, zVar.A, zVar.w, a1Var2, new com.yandex.plus.core.network.ssl.a(uVar.a, "StoriesWebView"), cVar, zVar.H, (com.yandex.plus.home.api.webview.b) xqnVar4.a, aVar3, zVar.F, zVar.K, zVar.c, zVar.d);
                                            com.yandex.plus.home.analytics.diagnostic.webview.a d3 = cVar2.d(com.yandex.plus.home.feature.webviews.internalapi.analytics.diagnostic.b.c);
                                            z zVar3 = (z) fVar.c;
                                            com.yandex.plus.home.feature.webviews.internal.stories.i iVar4 = new com.yandex.plus.home.feature.webviews.internal.stories.i(0, zVar3, z.class, "createSimpleWebViewLoadingBenchmark", "createSimpleWebViewLoadingBenchmark()Lcom/yandex/plus/core/benchmark/ViewLoadingBenchmark;", 0, 7);
                                            com.yandex.plus.resources.core.a aVar19 = zVar3.u;
                                            ci0 ci0Var = zVar3.F;
                                            com.yandex.plus.home.feature.webviews.internalapi.analytics.a aVar20 = (com.yandex.plus.home.feature.webviews.internalapi.analytics.a) zVar3.i.a.l.getValue();
                                            com.yandex.plus.core.network.ssl.a aVar21 = new com.yandex.plus.core.network.ssl.a(uVar.a, "SimpleWebView");
                                            if (xqnVar3.a == null) {
                                                ce5 ce5Var = new ce5(n, sVar, yVar, yVar, bVar2, d3, iVar4, aVar19, ci0Var, aVar20, bsdVar, cVar, aVar21, (com.yandex.plus.home.api.webview.b) xqnVar4.a, aVar3, zVar.K);
                                                s sVar4 = new s(n, zVar.l, zVar.p, new c(9, fVar), bsdVar, zVar.e);
                                                com.yandex.plus.home.auth.f fVar9 = zVar.l;
                                                z zVar4 = (z) fVar.c;
                                                com.yandex.plus.home.feature.webviews.internal.stories.i iVar5 = new com.yandex.plus.home.feature.webviews.internal.stories.i(0, zVar4, z.class, "createSmartWebViewLoadingBenchmark", "createSmartWebViewLoadingBenchmark()Lcom/yandex/plus/core/benchmark/ViewLoadingBenchmark;", 0, 8);
                                                ((com.yandex.plus.core.dispatcher.a) zVar4.o).getClass();
                                                a1 a1Var7 = zVar.j;
                                                com.yandex.plus.home.plaque.plugin.internal.proxy.a aVar22 = zVar.k;
                                                com.yandex.plus.home.internal.di.y yVar2 = zVar.v;
                                                com.yandex.plus.core.graphql.daily.progress.s sVar5 = zVar.T;
                                                com.yandex.plus.home.feature.webviews.internalapi.analytics.diagnostic.a aVar23 = com.yandex.plus.home.feature.webviews.internalapi.analytics.diagnostic.a.c;
                                                com.yandex.plus.home.analytics.diagnostic.messaging.a a3 = cVar2.a(aVar23);
                                                com.yandex.plus.home.analytics.f fVar10 = (com.yandex.plus.home.analytics.f) dVar4.s.getValue();
                                                com.yandex.plus.home.analytics.diagnostic.messaging.b c3 = cVar2.c(aVar23);
                                                com.yandex.plus.resources.core.a aVar24 = zVar.u;
                                                com.yandex.plus.home.api.prefetch.l lVar4 = zVar.x;
                                                com.yandex.plus.home.feature.webviews.internalapi.analytics.a aVar25 = (com.yandex.plus.home.feature.webviews.internalapi.analytics.a) dVar3.m.getValue();
                                                com.yandex.plus.home.analytics.diagnostic.webview.a d4 = cVar2.d(com.yandex.plus.home.feature.webviews.internalapi.analytics.diagnostic.b.d);
                                                com.yandex.plus.core.network.ssl.a aVar26 = new com.yandex.plus.core.network.ssl.a(uVar.a, "SmartWebView");
                                                h hVar = zVar.H;
                                                if (xqnVar3.a == null) {
                                                    return new v9m(new com.yandex.plus.home.feature.webviews.internal.container.t(n, zVar.I, (a) fVar.b, aVar14, o77Var, ce5Var, new bi1(n, sVar, fVar9, bVar2, iVar5, bsdVar, dq7Var, mn7Var, a1Var7, fVar2, aVar22, fVar4, yVar2, sVar5, a3, fVar10, c3, aVar24, fVar3, lVar4, aVar25, d4, a1Var2, aVar26, cVar, hVar, (com.yandex.plus.home.api.webview.b) xqnVar4.a, aVar3, zVar.F, zVar.K), sVar4, sVar, yVar, oVar, (Integer) zVar.b0.invoke(), zVar.m, a1Var4, zVar.r, ((Number) zVar.c0.invoke()).intValue(), ((Number) zVar.d0.invoke()).intValue(), null, lVar, tVar2, zVar.B, zVar.C, new com.yandex.plus.home.feature.webviews.internal.overlap.g(), zVar.K, new com.yandex.plus.home.feature.webviews.internal.stories.i(0, zVar.l, com.yandex.plus.home.auth.f.class, "getAuthToken", "getAuthToken()Ljava/lang/String;", 0, 3), new com.yandex.plus.home.feature.webviews.internal.stories.i(0, zVar.l, com.yandex.plus.home.auth.f.class, "getIsAuthorizedFlow", "getIsAuthorizedFlow()Lkotlinx/coroutines/flow/Flow;", 0, 4), new com.yandex.plus.home.feature.webviews.internal.stories.i(0, zVar.l, com.yandex.plus.home.auth.f.class, "isYandexEmployee", "isYandexEmployee()Z", 0, 5), zVar.e, zVar.U, zVar.V, zVar.W, zVar.X, zVar.Y, zVar.Z, zVar.a0, zVar.e0, bsdVar));
                                                }
                                                l1j.f();
                                            } else {
                                                l1j.f();
                                            }
                                        } else {
                                            l1j.f();
                                        }
                                    } else {
                                        obj = null;
                                        l1j.f();
                                    }
                                }
                            }
                            a1Var = new a1(15);
                            a1 a1Var22 = a1Var;
                            com.yandex.plus.home.feature.webviews.internal.accessibility.b bVar22 = new com.yandex.plus.home.feature.webviews.internal.accessibility.b();
                            a1 a1Var32 = zVar.j;
                            ((com.yandex.plus.core.dispatcher.a) bVar).getClass();
                            mn7 mn7Var2 = com.yandex.plus.core.dispatcher.a.e;
                            f fVar22 = new f(a1Var32, mn7Var2);
                            com.yandex.plus.core.location.a aVar52 = zVar.n;
                            dq7 dq7Var2 = com.yandex.plus.core.dispatcher.a.f;
                            f fVar32 = new f((com.yandex.plus.home.ybsdk.a) null, aVar52, dq7Var2);
                            com.yandex.plus.home.feature.webviews.internal.purchase.subscription.b bVar32 = new com.yandex.plus.home.feature.webviews.internal.purchase.subscription.b(dVar);
                            dVar.getClass();
                            l lVar22 = new l();
                            lVar22.a = dVar;
                            g0 g0Var3 = zVar.A;
                            g0Var3.getClass();
                            l lVar32 = new l();
                            lVar32.a = g0Var3;
                            com.yandex.plus.home.plaque.feature.internal.presentation.b bVar42 = new com.yandex.plus.home.plaque.feature.internal.presentation.b();
                            bVar42.a = bVar32;
                            bVar42.b = lVar22;
                            bVar42.c = lVar32;
                            bVar42.d = new com.yandex.passport.common.mvi.d(bVar32.b, bVar42, 15);
                            x0q b3 = y0q.b(0, 0, null, 7);
                            bVar42.e = b3;
                            bVar42.f = new dkn(b3);
                            f fVar42 = new f(dq7Var2);
                            s sVar6 = new s(zVar.D, zVar.K, (Set) zVar.Q.invoke(), (Uri) vVar.invoke(), (Uri) zVar.S.invoke());
                            Uri uri2 = (Uri) vVar.invoke();
                            String str6 = zVar.g;
                            String str22 = zVar.f;
                            String str32 = zVar.h;
                            com.yandex.plus.core.locale.a aVar62 = zVar.q;
                            i iVar6 = zVar.p;
                            com.yandex.plus.core.location.a aVar72 = zVar.n;
                            String str42 = zVar.s;
                            String str52 = zVar.t;
                            g0 g0Var22 = zVar.w;
                            Build.MANUFACTURER.getClass();
                            Build.MODEL.getClass();
                            com.yandex.plus.home.feature.webviews.internal.uri.t tVar22 = new com.yandex.plus.home.feature.webviews.internal.uri.t(sVar6, zVar.K, uri2, new com.yandex.plus.home.feature.panel.internal.shortcuts.daily.animation.a(8, fVar), str6, str22, str32, aVar62, iVar6, aVar72, str42, str52, g0Var22, Build.VERSION.SDK_INT, r, false);
                            zVar.M.invoke();
                            Set set4 = (Set) zVar.N.invoke();
                            Set set22 = (Set) zVar.O.invoke();
                            Set set32 = (Set) zVar.P.invoke();
                            com.yandex.plus.home.internal.di.d dVar32 = cVar2.a;
                            com.yandex.plus.home.internal.di.d dVar42 = cVar2.a;
                            com.yandex.plus.home.analytics.diagnostic.webview.a aVar82 = (com.yandex.plus.home.analytics.diagnostic.webview.a) dVar32.y.getValue();
                            com.yandex.plus.home.analytics.diagnostic.webview.a aVar92 = (com.yandex.plus.home.analytics.diagnostic.webview.a) dVar32.w.getValue();
                            com.yandex.plus.home.analytics.diagnostic.webview.a aVar102 = (com.yandex.plus.home.analytics.diagnostic.webview.a) dVar32.x.getValue();
                            com.yandex.plus.core.analytics.logging.d dVar52 = zVar.K;
                            set4.getClass();
                            set22.getClass();
                            set32.getClass();
                            aVar82.getClass();
                            aVar92.getClass();
                            aVar102.getClass();
                            dVar52.getClass();
                            a1 a1Var42 = new a1(19);
                            y yVar3 = new y(sVar6, zVar.l);
                            com.yandex.plus.home.auth.f fVar52 = zVar.l;
                            bsd bsdVar2 = com.yandex.plus.core.dispatcher.a.c;
                            a1 a1Var52 = zVar.j;
                            com.yandex.plus.home.plaque.plugin.internal.proxy.a aVar112 = zVar.k;
                            com.yandex.plus.home.analytics.diagnostic.webview.a d5 = cVar2.d(com.yandex.plus.home.feature.webviews.internalapi.analytics.diagnostic.b.a);
                            com.yandex.plus.home.feature.webviews.internalapi.analytics.diagnostic.a aVar122 = com.yandex.plus.home.feature.webviews.internalapi.analytics.diagnostic.a.a;
                            com.yandex.plus.home.analytics.diagnostic.messaging.b c4 = cVar2.c(aVar122);
                            com.yandex.plus.home.analytics.diagnostic.messaging.a a4 = cVar2.a(aVar122);
                            com.yandex.plus.home.analytics.f fVar62 = (com.yandex.plus.home.analytics.f) dVar42.s.getValue();
                            com.yandex.plus.core.graphql.daily.progress.s sVar22 = zVar.T;
                            com.yandex.plus.home.feature.webviews.internal.stories.i iVar22 = new com.yandex.plus.home.feature.webviews.internal.stories.i(0, (z) fVar.c, z.class, "createHomeWebViewLoadingBenchmark", "createHomeWebViewLoadingBenchmark()Lcom/yandex/plus/core/benchmark/ViewLoadingBenchmark;", 0, 6);
                            com.yandex.plus.home.api.config.a aVar132 = (com.yandex.plus.home.api.config.a) xqnVar.a;
                            if (xqnVar2.a != null) {
                            }
                        } else {
                            obj = null;
                            l1j.f();
                        }
                        return obj;
                }
            }
        });
        final int i2 = 1;
        this.l = btf.b(new Function0(this) { // from class: x9m
            public final /* synthetic */ z9m b;

            {
                this.b = this;
            }

            /* JADX WARN: Removed duplicated region for block: B:22:0x0299  */
            /* JADX WARN: Removed duplicated region for block: B:36:0x0669  */
            @Override // kotlin.jvm.functions.Function0
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invoke() {
                Object obj;
                a1 a1Var;
                Object t7oVar;
                int i22 = i2;
                z9m z9mVar = this.b;
                switch (i22) {
                    case 0:
                        return new y9m(z9mVar);
                    case 1:
                        m7m m7mVar = (m7m) z9mVar.k.getValue();
                        t requireActivity = z9mVar.requireActivity();
                        requireActivity.getClass();
                        l13 l13Var = m7mVar.a;
                        j jVar = (j) ((o7m) l13Var.a.D(hag.I(o7m.class), l13Var, l13Var.b)).a(requireActivity).a.getValue();
                        jVar.getClass();
                        return new o9m(requireActivity, new f((z) jVar.i.getValue(), a.a));
                    default:
                        o9m o9mVar = (o9m) z9mVar.l.getValue();
                        f fVar = o9mVar.b;
                        t tVar = o9mVar.a;
                        xqn xqnVar = new xqn();
                        xqn xqnVar2 = new xqn();
                        xqn xqnVar3 = new xqn();
                        xqn xqnVar4 = new xqn();
                        com.yandex.plus.home.api.config.a aVar = new com.yandex.plus.home.api.config.a();
                        aVar.a = null;
                        aVar.b = null;
                        aVar.c = null;
                        aVar.d = null;
                        aVar.e = null;
                        xqnVar.a = aVar;
                        z zVar = (z) fVar.c;
                        com.yandex.plus.core.locale.a aVar2 = zVar.q;
                        u uVar = zVar.a;
                        v vVar = zVar.R;
                        d dVar = zVar.z;
                        com.yandex.plus.home.feature.webviews.internalapi.animation.animator.a aVar3 = zVar.J;
                        c cVar = zVar.G;
                        b bVar = zVar.o;
                        com.yandex.plus.home.internal.di.c cVar2 = zVar.i;
                        Context m = com.yandex.plus.home.common.utils.a.m(tVar, aVar2.a());
                        com.yandex.plus.ui.core.theme.a aVar4 = (com.yandex.plus.ui.core.theme.a) zVar.L.a.getValue();
                        com.yandex.plus.core.theme.d dVar2 = zVar.E;
                        dVar2.getClass();
                        aVar4.getClass();
                        Context n = com.yandex.plus.home.common.utils.a.n(m, dVar2.a(m, aVar4), R.style.PlusSDK_WebViews_Fonts);
                        o oVar = new o();
                        if (xqnVar2.a == null) {
                            boolean r = com.yandex.plus.bdui.plus.checkout.content.serializer.dto.u.r(tVar, aVar4);
                            l lVar = new l(tVar);
                            if (!xz0.u(com.yandex.plus.core.a.a, tVar.getPackageName())) {
                                try {
                                    r7o r7oVar = z7o.b;
                                    int identifier = tVar.getResources().getIdentifier("plus_sdk_treasury_messages_logging_allowed", "bool", tVar.getPackageName());
                                    t7oVar = Boolean.valueOf(identifier != 0 ? tVar.getResources().getBoolean(identifier) : false);
                                } catch (Throwable th) {
                                    r7o r7oVar2 = z7o.b;
                                    t7oVar = new t7o(th);
                                }
                                Object obj2 = Boolean.FALSE;
                                if (t7oVar instanceof t7o) {
                                    t7oVar = obj2;
                                }
                                if (!((Boolean) t7oVar).booleanValue()) {
                                    a1Var = new a1(16);
                                    a1 a1Var22 = a1Var;
                                    com.yandex.plus.home.feature.webviews.internal.accessibility.b bVar22 = new com.yandex.plus.home.feature.webviews.internal.accessibility.b();
                                    a1 a1Var32 = zVar.j;
                                    ((com.yandex.plus.core.dispatcher.a) bVar).getClass();
                                    mn7 mn7Var2 = com.yandex.plus.core.dispatcher.a.e;
                                    f fVar22 = new f(a1Var32, mn7Var2);
                                    com.yandex.plus.core.location.a aVar52 = zVar.n;
                                    dq7 dq7Var2 = com.yandex.plus.core.dispatcher.a.f;
                                    f fVar32 = new f((com.yandex.plus.home.ybsdk.a) null, aVar52, dq7Var2);
                                    com.yandex.plus.home.feature.webviews.internal.purchase.subscription.b bVar32 = new com.yandex.plus.home.feature.webviews.internal.purchase.subscription.b(dVar);
                                    dVar.getClass();
                                    l lVar22 = new l();
                                    lVar22.a = dVar;
                                    g0 g0Var3 = zVar.A;
                                    g0Var3.getClass();
                                    l lVar32 = new l();
                                    lVar32.a = g0Var3;
                                    com.yandex.plus.home.plaque.feature.internal.presentation.b bVar42 = new com.yandex.plus.home.plaque.feature.internal.presentation.b();
                                    bVar42.a = bVar32;
                                    bVar42.b = lVar22;
                                    bVar42.c = lVar32;
                                    bVar42.d = new com.yandex.passport.common.mvi.d(bVar32.b, bVar42, 15);
                                    x0q b3 = y0q.b(0, 0, null, 7);
                                    bVar42.e = b3;
                                    bVar42.f = new dkn(b3);
                                    f fVar42 = new f(dq7Var2);
                                    s sVar6 = new s(zVar.D, zVar.K, (Set) zVar.Q.invoke(), (Uri) vVar.invoke(), (Uri) zVar.S.invoke());
                                    Uri uri2 = (Uri) vVar.invoke();
                                    String str6 = zVar.g;
                                    String str22 = zVar.f;
                                    String str32 = zVar.h;
                                    com.yandex.plus.core.locale.a aVar62 = zVar.q;
                                    i iVar6 = zVar.p;
                                    com.yandex.plus.core.location.a aVar72 = zVar.n;
                                    String str42 = zVar.s;
                                    String str52 = zVar.t;
                                    g0 g0Var22 = zVar.w;
                                    Build.MANUFACTURER.getClass();
                                    Build.MODEL.getClass();
                                    com.yandex.plus.home.feature.webviews.internal.uri.t tVar22 = new com.yandex.plus.home.feature.webviews.internal.uri.t(sVar6, zVar.K, uri2, new com.yandex.plus.home.feature.panel.internal.shortcuts.daily.animation.a(8, fVar), str6, str22, str32, aVar62, iVar6, aVar72, str42, str52, g0Var22, Build.VERSION.SDK_INT, r, false);
                                    zVar.M.invoke();
                                    Set set4 = (Set) zVar.N.invoke();
                                    Set set22 = (Set) zVar.O.invoke();
                                    Set set32 = (Set) zVar.P.invoke();
                                    com.yandex.plus.home.internal.di.d dVar32 = cVar2.a;
                                    com.yandex.plus.home.internal.di.d dVar42 = cVar2.a;
                                    com.yandex.plus.home.analytics.diagnostic.webview.a aVar82 = (com.yandex.plus.home.analytics.diagnostic.webview.a) dVar32.y.getValue();
                                    com.yandex.plus.home.analytics.diagnostic.webview.a aVar92 = (com.yandex.plus.home.analytics.diagnostic.webview.a) dVar32.w.getValue();
                                    com.yandex.plus.home.analytics.diagnostic.webview.a aVar102 = (com.yandex.plus.home.analytics.diagnostic.webview.a) dVar32.x.getValue();
                                    com.yandex.plus.core.analytics.logging.d dVar52 = zVar.K;
                                    set4.getClass();
                                    set22.getClass();
                                    set32.getClass();
                                    aVar82.getClass();
                                    aVar92.getClass();
                                    aVar102.getClass();
                                    dVar52.getClass();
                                    a1 a1Var42 = new a1(19);
                                    y yVar3 = new y(sVar6, zVar.l);
                                    com.yandex.plus.home.auth.f fVar52 = zVar.l;
                                    bsd bsdVar2 = com.yandex.plus.core.dispatcher.a.c;
                                    a1 a1Var52 = zVar.j;
                                    com.yandex.plus.home.plaque.plugin.internal.proxy.a aVar112 = zVar.k;
                                    com.yandex.plus.home.analytics.diagnostic.webview.a d5 = cVar2.d(com.yandex.plus.home.feature.webviews.internalapi.analytics.diagnostic.b.a);
                                    com.yandex.plus.home.feature.webviews.internalapi.analytics.diagnostic.a aVar122 = com.yandex.plus.home.feature.webviews.internalapi.analytics.diagnostic.a.a;
                                    com.yandex.plus.home.analytics.diagnostic.messaging.b c4 = cVar2.c(aVar122);
                                    com.yandex.plus.home.analytics.diagnostic.messaging.a a4 = cVar2.a(aVar122);
                                    com.yandex.plus.home.analytics.f fVar62 = (com.yandex.plus.home.analytics.f) dVar42.s.getValue();
                                    com.yandex.plus.core.graphql.daily.progress.s sVar22 = zVar.T;
                                    com.yandex.plus.home.feature.webviews.internal.stories.i iVar22 = new com.yandex.plus.home.feature.webviews.internal.stories.i(0, (z) fVar.c, z.class, "createHomeWebViewLoadingBenchmark", "createHomeWebViewLoadingBenchmark()Lcom/yandex/plus/core/benchmark/ViewLoadingBenchmark;", 0, 6);
                                    com.yandex.plus.home.api.config.a aVar132 = (com.yandex.plus.home.api.config.a) xqnVar.a;
                                    if (xqnVar2.a != null) {
                                        obj = null;
                                        com.yandex.plus.home.feature.webviews.internal.container.factory.a aVar14 = new com.yandex.plus.home.feature.webviews.internal.container.factory.a(sVar6, fVar52, bsdVar2, mn7Var2, dq7Var2, a1Var52, fVar22, aVar112, d5, c4, a4, fVar62, sVar22, iVar22, n, bVar22, aVar132, fVar42, zVar.e, (com.yandex.plus.home.feature.webviews.internalapi.analytics.a) dVar32.j.getValue(), (com.yandex.plus.home.analytics.payment.d) dVar42.o.getValue(), (e) dVar42.q.getValue(), (com.yandex.plus.home.analytics.payment.b) dVar42.p.getValue(), cVar2.b(g.a), (com.yandex.plus.home.analytics.payment.a) dVar42.J.getValue(), fVar32, oVar, bVar42, zVar.L, zVar.u, zVar.v, zVar.x, zVar.y, zVar.A, zVar.w, bVar32, a1Var22, new com.yandex.plus.core.network.ssl.a(uVar.a, "HomeWebView"), cVar, zVar.H, (com.yandex.plus.home.api.webview.b) xqnVar4.a, aVar3, zVar.F, zVar.K, zVar.c, zVar.d);
                                        com.yandex.plus.home.auth.f fVar7 = zVar.l;
                                        a1 a1Var6 = zVar.j;
                                        com.yandex.plus.home.plaque.plugin.internal.proxy.a aVar15 = zVar.k;
                                        com.yandex.plus.home.analytics.diagnostic.webview.a d2 = cVar2.d(com.yandex.plus.home.feature.webviews.internalapi.analytics.diagnostic.b.b);
                                        com.yandex.plus.home.feature.webviews.internalapi.analytics.diagnostic.a aVar16 = com.yandex.plus.home.feature.webviews.internalapi.analytics.diagnostic.a.b;
                                        com.yandex.plus.home.analytics.diagnostic.messaging.b c2 = cVar2.c(aVar16);
                                        com.yandex.plus.home.analytics.diagnostic.messaging.a a2 = cVar2.a(aVar16);
                                        com.yandex.plus.home.analytics.f fVar8 = (com.yandex.plus.home.analytics.f) dVar42.s.getValue();
                                        com.yandex.plus.core.graphql.daily.progress.s sVar3 = zVar.T;
                                        z zVar2 = (z) fVar.c;
                                        com.yandex.plus.home.feature.webviews.internal.stories.i iVar3 = new com.yandex.plus.home.feature.webviews.internal.stories.i(0, zVar2, z.class, "createStoriesWebViewLoadingBenchmark", "createStoriesWebViewLoadingBenchmark()Lcom/yandex/plus/core/benchmark/ViewLoadingBenchmark;", 0, 9);
                                        com.yandex.plus.home.api.config.a aVar17 = (com.yandex.plus.home.api.config.a) xqnVar.a;
                                        com.yandex.plus.home.feature.webviews.internalapi.analytics.a aVar18 = (com.yandex.plus.home.feature.webviews.internalapi.analytics.a) zVar2.i.a.k.getValue();
                                        com.yandex.plus.home.analytics.payment.d dVar6 = (com.yandex.plus.home.analytics.payment.d) dVar42.o.getValue();
                                        e eVar = (e) dVar42.q.getValue();
                                        com.yandex.plus.home.analytics.payment.b bVar5 = (com.yandex.plus.home.analytics.payment.b) dVar42.p.getValue();
                                        com.yandex.plus.home.analytics.payment.c b2 = cVar2.b(g.b);
                                        fkn fknVar = zVar.L;
                                        if (xqnVar2.a == null) {
                                            o77 o77Var = new o77(sVar6, fVar7, bsdVar2, mn7Var2, dq7Var2, a1Var6, fVar22, aVar15, d2, c2, a2, fVar8, sVar3, iVar3, fVar42, n, bVar22, aVar17, aVar18, dVar6, eVar, bVar5, b2, (com.yandex.plus.home.analytics.payment.a) dVar42.J.getValue(), oVar, bVar42, fknVar, zVar.u, zVar.v, zVar.x, zVar.A, zVar.w, a1Var22, new com.yandex.plus.core.network.ssl.a(uVar.a, "StoriesWebView"), cVar, zVar.H, (com.yandex.plus.home.api.webview.b) xqnVar4.a, aVar3, zVar.F, zVar.K, zVar.c, zVar.d);
                                            com.yandex.plus.home.analytics.diagnostic.webview.a d3 = cVar2.d(com.yandex.plus.home.feature.webviews.internalapi.analytics.diagnostic.b.c);
                                            z zVar3 = (z) fVar.c;
                                            com.yandex.plus.home.feature.webviews.internal.stories.i iVar4 = new com.yandex.plus.home.feature.webviews.internal.stories.i(0, zVar3, z.class, "createSimpleWebViewLoadingBenchmark", "createSimpleWebViewLoadingBenchmark()Lcom/yandex/plus/core/benchmark/ViewLoadingBenchmark;", 0, 7);
                                            com.yandex.plus.resources.core.a aVar19 = zVar3.u;
                                            ci0 ci0Var = zVar3.F;
                                            com.yandex.plus.home.feature.webviews.internalapi.analytics.a aVar20 = (com.yandex.plus.home.feature.webviews.internalapi.analytics.a) zVar3.i.a.l.getValue();
                                            com.yandex.plus.core.network.ssl.a aVar21 = new com.yandex.plus.core.network.ssl.a(uVar.a, "SimpleWebView");
                                            if (xqnVar3.a == null) {
                                                ce5 ce5Var = new ce5(n, sVar6, yVar3, yVar3, bVar22, d3, iVar4, aVar19, ci0Var, aVar20, bsdVar2, cVar, aVar21, (com.yandex.plus.home.api.webview.b) xqnVar4.a, aVar3, zVar.K);
                                                s sVar4 = new s(n, zVar.l, zVar.p, new c(9, fVar), bsdVar2, zVar.e);
                                                com.yandex.plus.home.auth.f fVar9 = zVar.l;
                                                z zVar4 = (z) fVar.c;
                                                com.yandex.plus.home.feature.webviews.internal.stories.i iVar5 = new com.yandex.plus.home.feature.webviews.internal.stories.i(0, zVar4, z.class, "createSmartWebViewLoadingBenchmark", "createSmartWebViewLoadingBenchmark()Lcom/yandex/plus/core/benchmark/ViewLoadingBenchmark;", 0, 8);
                                                ((com.yandex.plus.core.dispatcher.a) zVar4.o).getClass();
                                                a1 a1Var7 = zVar.j;
                                                com.yandex.plus.home.plaque.plugin.internal.proxy.a aVar22 = zVar.k;
                                                com.yandex.plus.home.internal.di.y yVar2 = zVar.v;
                                                com.yandex.plus.core.graphql.daily.progress.s sVar5 = zVar.T;
                                                com.yandex.plus.home.feature.webviews.internalapi.analytics.diagnostic.a aVar23 = com.yandex.plus.home.feature.webviews.internalapi.analytics.diagnostic.a.c;
                                                com.yandex.plus.home.analytics.diagnostic.messaging.a a3 = cVar2.a(aVar23);
                                                com.yandex.plus.home.analytics.f fVar10 = (com.yandex.plus.home.analytics.f) dVar42.s.getValue();
                                                com.yandex.plus.home.analytics.diagnostic.messaging.b c3 = cVar2.c(aVar23);
                                                com.yandex.plus.resources.core.a aVar24 = zVar.u;
                                                com.yandex.plus.home.api.prefetch.l lVar4 = zVar.x;
                                                com.yandex.plus.home.feature.webviews.internalapi.analytics.a aVar25 = (com.yandex.plus.home.feature.webviews.internalapi.analytics.a) dVar32.m.getValue();
                                                com.yandex.plus.home.analytics.diagnostic.webview.a d4 = cVar2.d(com.yandex.plus.home.feature.webviews.internalapi.analytics.diagnostic.b.d);
                                                com.yandex.plus.core.network.ssl.a aVar26 = new com.yandex.plus.core.network.ssl.a(uVar.a, "SmartWebView");
                                                h hVar = zVar.H;
                                                if (xqnVar3.a == null) {
                                                    return new v9m(new com.yandex.plus.home.feature.webviews.internal.container.t(n, zVar.I, (a) fVar.b, aVar14, o77Var, ce5Var, new bi1(n, sVar6, fVar9, bVar22, iVar5, bsdVar2, dq7Var2, mn7Var2, a1Var7, fVar22, aVar22, fVar42, yVar2, sVar5, a3, fVar10, c3, aVar24, fVar32, lVar4, aVar25, d4, a1Var22, aVar26, cVar, hVar, (com.yandex.plus.home.api.webview.b) xqnVar4.a, aVar3, zVar.F, zVar.K), sVar4, sVar6, yVar3, oVar, (Integer) zVar.b0.invoke(), zVar.m, a1Var42, zVar.r, ((Number) zVar.c0.invoke()).intValue(), ((Number) zVar.d0.invoke()).intValue(), null, lVar, tVar22, zVar.B, zVar.C, new com.yandex.plus.home.feature.webviews.internal.overlap.g(), zVar.K, new com.yandex.plus.home.feature.webviews.internal.stories.i(0, zVar.l, com.yandex.plus.home.auth.f.class, "getAuthToken", "getAuthToken()Ljava/lang/String;", 0, 3), new com.yandex.plus.home.feature.webviews.internal.stories.i(0, zVar.l, com.yandex.plus.home.auth.f.class, "getIsAuthorizedFlow", "getIsAuthorizedFlow()Lkotlinx/coroutines/flow/Flow;", 0, 4), new com.yandex.plus.home.feature.webviews.internal.stories.i(0, zVar.l, com.yandex.plus.home.auth.f.class, "isYandexEmployee", "isYandexEmployee()Z", 0, 5), zVar.e, zVar.U, zVar.V, zVar.W, zVar.X, zVar.Y, zVar.Z, zVar.a0, zVar.e0, bsdVar2));
                                                }
                                                l1j.f();
                                            } else {
                                                l1j.f();
                                            }
                                        } else {
                                            l1j.f();
                                        }
                                    } else {
                                        obj = null;
                                        l1j.f();
                                    }
                                }
                            }
                            a1Var = new a1(15);
                            a1 a1Var222 = a1Var;
                            com.yandex.plus.home.feature.webviews.internal.accessibility.b bVar222 = new com.yandex.plus.home.feature.webviews.internal.accessibility.b();
                            a1 a1Var322 = zVar.j;
                            ((com.yandex.plus.core.dispatcher.a) bVar).getClass();
                            mn7 mn7Var22 = com.yandex.plus.core.dispatcher.a.e;
                            f fVar222 = new f(a1Var322, mn7Var22);
                            com.yandex.plus.core.location.a aVar522 = zVar.n;
                            dq7 dq7Var22 = com.yandex.plus.core.dispatcher.a.f;
                            f fVar322 = new f((com.yandex.plus.home.ybsdk.a) null, aVar522, dq7Var22);
                            com.yandex.plus.home.feature.webviews.internal.purchase.subscription.b bVar322 = new com.yandex.plus.home.feature.webviews.internal.purchase.subscription.b(dVar);
                            dVar.getClass();
                            l lVar222 = new l();
                            lVar222.a = dVar;
                            g0 g0Var32 = zVar.A;
                            g0Var32.getClass();
                            l lVar322 = new l();
                            lVar322.a = g0Var32;
                            com.yandex.plus.home.plaque.feature.internal.presentation.b bVar422 = new com.yandex.plus.home.plaque.feature.internal.presentation.b();
                            bVar422.a = bVar322;
                            bVar422.b = lVar222;
                            bVar422.c = lVar322;
                            bVar422.d = new com.yandex.passport.common.mvi.d(bVar322.b, bVar422, 15);
                            x0q b32 = y0q.b(0, 0, null, 7);
                            bVar422.e = b32;
                            bVar422.f = new dkn(b32);
                            f fVar422 = new f(dq7Var22);
                            s sVar62 = new s(zVar.D, zVar.K, (Set) zVar.Q.invoke(), (Uri) vVar.invoke(), (Uri) zVar.S.invoke());
                            Uri uri22 = (Uri) vVar.invoke();
                            String str62 = zVar.g;
                            String str222 = zVar.f;
                            String str322 = zVar.h;
                            com.yandex.plus.core.locale.a aVar622 = zVar.q;
                            i iVar62 = zVar.p;
                            com.yandex.plus.core.location.a aVar722 = zVar.n;
                            String str422 = zVar.s;
                            String str522 = zVar.t;
                            g0 g0Var222 = zVar.w;
                            Build.MANUFACTURER.getClass();
                            Build.MODEL.getClass();
                            com.yandex.plus.home.feature.webviews.internal.uri.t tVar222 = new com.yandex.plus.home.feature.webviews.internal.uri.t(sVar62, zVar.K, uri22, new com.yandex.plus.home.feature.panel.internal.shortcuts.daily.animation.a(8, fVar), str62, str222, str322, aVar622, iVar62, aVar722, str422, str522, g0Var222, Build.VERSION.SDK_INT, r, false);
                            zVar.M.invoke();
                            Set set42 = (Set) zVar.N.invoke();
                            Set set222 = (Set) zVar.O.invoke();
                            Set set322 = (Set) zVar.P.invoke();
                            com.yandex.plus.home.internal.di.d dVar322 = cVar2.a;
                            com.yandex.plus.home.internal.di.d dVar422 = cVar2.a;
                            com.yandex.plus.home.analytics.diagnostic.webview.a aVar822 = (com.yandex.plus.home.analytics.diagnostic.webview.a) dVar322.y.getValue();
                            com.yandex.plus.home.analytics.diagnostic.webview.a aVar922 = (com.yandex.plus.home.analytics.diagnostic.webview.a) dVar322.w.getValue();
                            com.yandex.plus.home.analytics.diagnostic.webview.a aVar1022 = (com.yandex.plus.home.analytics.diagnostic.webview.a) dVar322.x.getValue();
                            com.yandex.plus.core.analytics.logging.d dVar522 = zVar.K;
                            set42.getClass();
                            set222.getClass();
                            set322.getClass();
                            aVar822.getClass();
                            aVar922.getClass();
                            aVar1022.getClass();
                            dVar522.getClass();
                            a1 a1Var422 = new a1(19);
                            y yVar32 = new y(sVar62, zVar.l);
                            com.yandex.plus.home.auth.f fVar522 = zVar.l;
                            bsd bsdVar22 = com.yandex.plus.core.dispatcher.a.c;
                            a1 a1Var522 = zVar.j;
                            com.yandex.plus.home.plaque.plugin.internal.proxy.a aVar1122 = zVar.k;
                            com.yandex.plus.home.analytics.diagnostic.webview.a d52 = cVar2.d(com.yandex.plus.home.feature.webviews.internalapi.analytics.diagnostic.b.a);
                            com.yandex.plus.home.feature.webviews.internalapi.analytics.diagnostic.a aVar1222 = com.yandex.plus.home.feature.webviews.internalapi.analytics.diagnostic.a.a;
                            com.yandex.plus.home.analytics.diagnostic.messaging.b c42 = cVar2.c(aVar1222);
                            com.yandex.plus.home.analytics.diagnostic.messaging.a a42 = cVar2.a(aVar1222);
                            com.yandex.plus.home.analytics.f fVar622 = (com.yandex.plus.home.analytics.f) dVar422.s.getValue();
                            com.yandex.plus.core.graphql.daily.progress.s sVar222 = zVar.T;
                            com.yandex.plus.home.feature.webviews.internal.stories.i iVar222 = new com.yandex.plus.home.feature.webviews.internal.stories.i(0, (z) fVar.c, z.class, "createHomeWebViewLoadingBenchmark", "createHomeWebViewLoadingBenchmark()Lcom/yandex/plus/core/benchmark/ViewLoadingBenchmark;", 0, 6);
                            com.yandex.plus.home.api.config.a aVar1322 = (com.yandex.plus.home.api.config.a) xqnVar.a;
                            if (xqnVar2.a != null) {
                            }
                        } else {
                            obj = null;
                            l1j.f();
                        }
                        return obj;
                }
            }
        });
        final int i3 = 2;
        this.m = btf.b(new Function0(this) { // from class: x9m
            public final /* synthetic */ z9m b;

            {
                this.b = this;
            }

            /* JADX WARN: Removed duplicated region for block: B:22:0x0299  */
            /* JADX WARN: Removed duplicated region for block: B:36:0x0669  */
            @Override // kotlin.jvm.functions.Function0
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invoke() {
                Object obj;
                a1 a1Var;
                Object t7oVar;
                int i22 = i3;
                z9m z9mVar = this.b;
                switch (i22) {
                    case 0:
                        return new y9m(z9mVar);
                    case 1:
                        m7m m7mVar = (m7m) z9mVar.k.getValue();
                        t requireActivity = z9mVar.requireActivity();
                        requireActivity.getClass();
                        l13 l13Var = m7mVar.a;
                        j jVar = (j) ((o7m) l13Var.a.D(hag.I(o7m.class), l13Var, l13Var.b)).a(requireActivity).a.getValue();
                        jVar.getClass();
                        return new o9m(requireActivity, new f((z) jVar.i.getValue(), a.a));
                    default:
                        o9m o9mVar = (o9m) z9mVar.l.getValue();
                        f fVar = o9mVar.b;
                        t tVar = o9mVar.a;
                        xqn xqnVar = new xqn();
                        xqn xqnVar2 = new xqn();
                        xqn xqnVar3 = new xqn();
                        xqn xqnVar4 = new xqn();
                        com.yandex.plus.home.api.config.a aVar = new com.yandex.plus.home.api.config.a();
                        aVar.a = null;
                        aVar.b = null;
                        aVar.c = null;
                        aVar.d = null;
                        aVar.e = null;
                        xqnVar.a = aVar;
                        z zVar = (z) fVar.c;
                        com.yandex.plus.core.locale.a aVar2 = zVar.q;
                        u uVar = zVar.a;
                        v vVar = zVar.R;
                        d dVar = zVar.z;
                        com.yandex.plus.home.feature.webviews.internalapi.animation.animator.a aVar3 = zVar.J;
                        c cVar = zVar.G;
                        b bVar = zVar.o;
                        com.yandex.plus.home.internal.di.c cVar2 = zVar.i;
                        Context m = com.yandex.plus.home.common.utils.a.m(tVar, aVar2.a());
                        com.yandex.plus.ui.core.theme.a aVar4 = (com.yandex.plus.ui.core.theme.a) zVar.L.a.getValue();
                        com.yandex.plus.core.theme.d dVar2 = zVar.E;
                        dVar2.getClass();
                        aVar4.getClass();
                        Context n = com.yandex.plus.home.common.utils.a.n(m, dVar2.a(m, aVar4), R.style.PlusSDK_WebViews_Fonts);
                        o oVar = new o();
                        if (xqnVar2.a == null) {
                            boolean r = com.yandex.plus.bdui.plus.checkout.content.serializer.dto.u.r(tVar, aVar4);
                            l lVar = new l(tVar);
                            if (!xz0.u(com.yandex.plus.core.a.a, tVar.getPackageName())) {
                                try {
                                    r7o r7oVar = z7o.b;
                                    int identifier = tVar.getResources().getIdentifier("plus_sdk_treasury_messages_logging_allowed", "bool", tVar.getPackageName());
                                    t7oVar = Boolean.valueOf(identifier != 0 ? tVar.getResources().getBoolean(identifier) : false);
                                } catch (Throwable th) {
                                    r7o r7oVar2 = z7o.b;
                                    t7oVar = new t7o(th);
                                }
                                Object obj2 = Boolean.FALSE;
                                if (t7oVar instanceof t7o) {
                                    t7oVar = obj2;
                                }
                                if (!((Boolean) t7oVar).booleanValue()) {
                                    a1Var = new a1(16);
                                    a1 a1Var222 = a1Var;
                                    com.yandex.plus.home.feature.webviews.internal.accessibility.b bVar222 = new com.yandex.plus.home.feature.webviews.internal.accessibility.b();
                                    a1 a1Var322 = zVar.j;
                                    ((com.yandex.plus.core.dispatcher.a) bVar).getClass();
                                    mn7 mn7Var22 = com.yandex.plus.core.dispatcher.a.e;
                                    f fVar222 = new f(a1Var322, mn7Var22);
                                    com.yandex.plus.core.location.a aVar522 = zVar.n;
                                    dq7 dq7Var22 = com.yandex.plus.core.dispatcher.a.f;
                                    f fVar322 = new f((com.yandex.plus.home.ybsdk.a) null, aVar522, dq7Var22);
                                    com.yandex.plus.home.feature.webviews.internal.purchase.subscription.b bVar322 = new com.yandex.plus.home.feature.webviews.internal.purchase.subscription.b(dVar);
                                    dVar.getClass();
                                    l lVar222 = new l();
                                    lVar222.a = dVar;
                                    g0 g0Var32 = zVar.A;
                                    g0Var32.getClass();
                                    l lVar322 = new l();
                                    lVar322.a = g0Var32;
                                    com.yandex.plus.home.plaque.feature.internal.presentation.b bVar422 = new com.yandex.plus.home.plaque.feature.internal.presentation.b();
                                    bVar422.a = bVar322;
                                    bVar422.b = lVar222;
                                    bVar422.c = lVar322;
                                    bVar422.d = new com.yandex.passport.common.mvi.d(bVar322.b, bVar422, 15);
                                    x0q b32 = y0q.b(0, 0, null, 7);
                                    bVar422.e = b32;
                                    bVar422.f = new dkn(b32);
                                    f fVar422 = new f(dq7Var22);
                                    s sVar62 = new s(zVar.D, zVar.K, (Set) zVar.Q.invoke(), (Uri) vVar.invoke(), (Uri) zVar.S.invoke());
                                    Uri uri22 = (Uri) vVar.invoke();
                                    String str62 = zVar.g;
                                    String str222 = zVar.f;
                                    String str322 = zVar.h;
                                    com.yandex.plus.core.locale.a aVar622 = zVar.q;
                                    i iVar62 = zVar.p;
                                    com.yandex.plus.core.location.a aVar722 = zVar.n;
                                    String str422 = zVar.s;
                                    String str522 = zVar.t;
                                    g0 g0Var222 = zVar.w;
                                    Build.MANUFACTURER.getClass();
                                    Build.MODEL.getClass();
                                    com.yandex.plus.home.feature.webviews.internal.uri.t tVar222 = new com.yandex.plus.home.feature.webviews.internal.uri.t(sVar62, zVar.K, uri22, new com.yandex.plus.home.feature.panel.internal.shortcuts.daily.animation.a(8, fVar), str62, str222, str322, aVar622, iVar62, aVar722, str422, str522, g0Var222, Build.VERSION.SDK_INT, r, false);
                                    zVar.M.invoke();
                                    Set set42 = (Set) zVar.N.invoke();
                                    Set set222 = (Set) zVar.O.invoke();
                                    Set set322 = (Set) zVar.P.invoke();
                                    com.yandex.plus.home.internal.di.d dVar322 = cVar2.a;
                                    com.yandex.plus.home.internal.di.d dVar422 = cVar2.a;
                                    com.yandex.plus.home.analytics.diagnostic.webview.a aVar822 = (com.yandex.plus.home.analytics.diagnostic.webview.a) dVar322.y.getValue();
                                    com.yandex.plus.home.analytics.diagnostic.webview.a aVar922 = (com.yandex.plus.home.analytics.diagnostic.webview.a) dVar322.w.getValue();
                                    com.yandex.plus.home.analytics.diagnostic.webview.a aVar1022 = (com.yandex.plus.home.analytics.diagnostic.webview.a) dVar322.x.getValue();
                                    com.yandex.plus.core.analytics.logging.d dVar522 = zVar.K;
                                    set42.getClass();
                                    set222.getClass();
                                    set322.getClass();
                                    aVar822.getClass();
                                    aVar922.getClass();
                                    aVar1022.getClass();
                                    dVar522.getClass();
                                    a1 a1Var422 = new a1(19);
                                    y yVar32 = new y(sVar62, zVar.l);
                                    com.yandex.plus.home.auth.f fVar522 = zVar.l;
                                    bsd bsdVar22 = com.yandex.plus.core.dispatcher.a.c;
                                    a1 a1Var522 = zVar.j;
                                    com.yandex.plus.home.plaque.plugin.internal.proxy.a aVar1122 = zVar.k;
                                    com.yandex.plus.home.analytics.diagnostic.webview.a d52 = cVar2.d(com.yandex.plus.home.feature.webviews.internalapi.analytics.diagnostic.b.a);
                                    com.yandex.plus.home.feature.webviews.internalapi.analytics.diagnostic.a aVar1222 = com.yandex.plus.home.feature.webviews.internalapi.analytics.diagnostic.a.a;
                                    com.yandex.plus.home.analytics.diagnostic.messaging.b c42 = cVar2.c(aVar1222);
                                    com.yandex.plus.home.analytics.diagnostic.messaging.a a42 = cVar2.a(aVar1222);
                                    com.yandex.plus.home.analytics.f fVar622 = (com.yandex.plus.home.analytics.f) dVar422.s.getValue();
                                    com.yandex.plus.core.graphql.daily.progress.s sVar222 = zVar.T;
                                    com.yandex.plus.home.feature.webviews.internal.stories.i iVar222 = new com.yandex.plus.home.feature.webviews.internal.stories.i(0, (z) fVar.c, z.class, "createHomeWebViewLoadingBenchmark", "createHomeWebViewLoadingBenchmark()Lcom/yandex/plus/core/benchmark/ViewLoadingBenchmark;", 0, 6);
                                    com.yandex.plus.home.api.config.a aVar1322 = (com.yandex.plus.home.api.config.a) xqnVar.a;
                                    if (xqnVar2.a != null) {
                                        obj = null;
                                        com.yandex.plus.home.feature.webviews.internal.container.factory.a aVar14 = new com.yandex.plus.home.feature.webviews.internal.container.factory.a(sVar62, fVar522, bsdVar22, mn7Var22, dq7Var22, a1Var522, fVar222, aVar1122, d52, c42, a42, fVar622, sVar222, iVar222, n, bVar222, aVar1322, fVar422, zVar.e, (com.yandex.plus.home.feature.webviews.internalapi.analytics.a) dVar322.j.getValue(), (com.yandex.plus.home.analytics.payment.d) dVar422.o.getValue(), (e) dVar422.q.getValue(), (com.yandex.plus.home.analytics.payment.b) dVar422.p.getValue(), cVar2.b(g.a), (com.yandex.plus.home.analytics.payment.a) dVar422.J.getValue(), fVar322, oVar, bVar422, zVar.L, zVar.u, zVar.v, zVar.x, zVar.y, zVar.A, zVar.w, bVar322, a1Var222, new com.yandex.plus.core.network.ssl.a(uVar.a, "HomeWebView"), cVar, zVar.H, (com.yandex.plus.home.api.webview.b) xqnVar4.a, aVar3, zVar.F, zVar.K, zVar.c, zVar.d);
                                        com.yandex.plus.home.auth.f fVar7 = zVar.l;
                                        a1 a1Var6 = zVar.j;
                                        com.yandex.plus.home.plaque.plugin.internal.proxy.a aVar15 = zVar.k;
                                        com.yandex.plus.home.analytics.diagnostic.webview.a d2 = cVar2.d(com.yandex.plus.home.feature.webviews.internalapi.analytics.diagnostic.b.b);
                                        com.yandex.plus.home.feature.webviews.internalapi.analytics.diagnostic.a aVar16 = com.yandex.plus.home.feature.webviews.internalapi.analytics.diagnostic.a.b;
                                        com.yandex.plus.home.analytics.diagnostic.messaging.b c2 = cVar2.c(aVar16);
                                        com.yandex.plus.home.analytics.diagnostic.messaging.a a2 = cVar2.a(aVar16);
                                        com.yandex.plus.home.analytics.f fVar8 = (com.yandex.plus.home.analytics.f) dVar422.s.getValue();
                                        com.yandex.plus.core.graphql.daily.progress.s sVar3 = zVar.T;
                                        z zVar2 = (z) fVar.c;
                                        com.yandex.plus.home.feature.webviews.internal.stories.i iVar3 = new com.yandex.plus.home.feature.webviews.internal.stories.i(0, zVar2, z.class, "createStoriesWebViewLoadingBenchmark", "createStoriesWebViewLoadingBenchmark()Lcom/yandex/plus/core/benchmark/ViewLoadingBenchmark;", 0, 9);
                                        com.yandex.plus.home.api.config.a aVar17 = (com.yandex.plus.home.api.config.a) xqnVar.a;
                                        com.yandex.plus.home.feature.webviews.internalapi.analytics.a aVar18 = (com.yandex.plus.home.feature.webviews.internalapi.analytics.a) zVar2.i.a.k.getValue();
                                        com.yandex.plus.home.analytics.payment.d dVar6 = (com.yandex.plus.home.analytics.payment.d) dVar422.o.getValue();
                                        e eVar = (e) dVar422.q.getValue();
                                        com.yandex.plus.home.analytics.payment.b bVar5 = (com.yandex.plus.home.analytics.payment.b) dVar422.p.getValue();
                                        com.yandex.plus.home.analytics.payment.c b2 = cVar2.b(g.b);
                                        fkn fknVar = zVar.L;
                                        if (xqnVar2.a == null) {
                                            o77 o77Var = new o77(sVar62, fVar7, bsdVar22, mn7Var22, dq7Var22, a1Var6, fVar222, aVar15, d2, c2, a2, fVar8, sVar3, iVar3, fVar422, n, bVar222, aVar17, aVar18, dVar6, eVar, bVar5, b2, (com.yandex.plus.home.analytics.payment.a) dVar422.J.getValue(), oVar, bVar422, fknVar, zVar.u, zVar.v, zVar.x, zVar.A, zVar.w, a1Var222, new com.yandex.plus.core.network.ssl.a(uVar.a, "StoriesWebView"), cVar, zVar.H, (com.yandex.plus.home.api.webview.b) xqnVar4.a, aVar3, zVar.F, zVar.K, zVar.c, zVar.d);
                                            com.yandex.plus.home.analytics.diagnostic.webview.a d3 = cVar2.d(com.yandex.plus.home.feature.webviews.internalapi.analytics.diagnostic.b.c);
                                            z zVar3 = (z) fVar.c;
                                            com.yandex.plus.home.feature.webviews.internal.stories.i iVar4 = new com.yandex.plus.home.feature.webviews.internal.stories.i(0, zVar3, z.class, "createSimpleWebViewLoadingBenchmark", "createSimpleWebViewLoadingBenchmark()Lcom/yandex/plus/core/benchmark/ViewLoadingBenchmark;", 0, 7);
                                            com.yandex.plus.resources.core.a aVar19 = zVar3.u;
                                            ci0 ci0Var = zVar3.F;
                                            com.yandex.plus.home.feature.webviews.internalapi.analytics.a aVar20 = (com.yandex.plus.home.feature.webviews.internalapi.analytics.a) zVar3.i.a.l.getValue();
                                            com.yandex.plus.core.network.ssl.a aVar21 = new com.yandex.plus.core.network.ssl.a(uVar.a, "SimpleWebView");
                                            if (xqnVar3.a == null) {
                                                ce5 ce5Var = new ce5(n, sVar62, yVar32, yVar32, bVar222, d3, iVar4, aVar19, ci0Var, aVar20, bsdVar22, cVar, aVar21, (com.yandex.plus.home.api.webview.b) xqnVar4.a, aVar3, zVar.K);
                                                s sVar4 = new s(n, zVar.l, zVar.p, new c(9, fVar), bsdVar22, zVar.e);
                                                com.yandex.plus.home.auth.f fVar9 = zVar.l;
                                                z zVar4 = (z) fVar.c;
                                                com.yandex.plus.home.feature.webviews.internal.stories.i iVar5 = new com.yandex.plus.home.feature.webviews.internal.stories.i(0, zVar4, z.class, "createSmartWebViewLoadingBenchmark", "createSmartWebViewLoadingBenchmark()Lcom/yandex/plus/core/benchmark/ViewLoadingBenchmark;", 0, 8);
                                                ((com.yandex.plus.core.dispatcher.a) zVar4.o).getClass();
                                                a1 a1Var7 = zVar.j;
                                                com.yandex.plus.home.plaque.plugin.internal.proxy.a aVar22 = zVar.k;
                                                com.yandex.plus.home.internal.di.y yVar2 = zVar.v;
                                                com.yandex.plus.core.graphql.daily.progress.s sVar5 = zVar.T;
                                                com.yandex.plus.home.feature.webviews.internalapi.analytics.diagnostic.a aVar23 = com.yandex.plus.home.feature.webviews.internalapi.analytics.diagnostic.a.c;
                                                com.yandex.plus.home.analytics.diagnostic.messaging.a a3 = cVar2.a(aVar23);
                                                com.yandex.plus.home.analytics.f fVar10 = (com.yandex.plus.home.analytics.f) dVar422.s.getValue();
                                                com.yandex.plus.home.analytics.diagnostic.messaging.b c3 = cVar2.c(aVar23);
                                                com.yandex.plus.resources.core.a aVar24 = zVar.u;
                                                com.yandex.plus.home.api.prefetch.l lVar4 = zVar.x;
                                                com.yandex.plus.home.feature.webviews.internalapi.analytics.a aVar25 = (com.yandex.plus.home.feature.webviews.internalapi.analytics.a) dVar322.m.getValue();
                                                com.yandex.plus.home.analytics.diagnostic.webview.a d4 = cVar2.d(com.yandex.plus.home.feature.webviews.internalapi.analytics.diagnostic.b.d);
                                                com.yandex.plus.core.network.ssl.a aVar26 = new com.yandex.plus.core.network.ssl.a(uVar.a, "SmartWebView");
                                                h hVar = zVar.H;
                                                if (xqnVar3.a == null) {
                                                    return new v9m(new com.yandex.plus.home.feature.webviews.internal.container.t(n, zVar.I, (a) fVar.b, aVar14, o77Var, ce5Var, new bi1(n, sVar62, fVar9, bVar222, iVar5, bsdVar22, dq7Var22, mn7Var22, a1Var7, fVar222, aVar22, fVar422, yVar2, sVar5, a3, fVar10, c3, aVar24, fVar322, lVar4, aVar25, d4, a1Var222, aVar26, cVar, hVar, (com.yandex.plus.home.api.webview.b) xqnVar4.a, aVar3, zVar.F, zVar.K), sVar4, sVar62, yVar32, oVar, (Integer) zVar.b0.invoke(), zVar.m, a1Var422, zVar.r, ((Number) zVar.c0.invoke()).intValue(), ((Number) zVar.d0.invoke()).intValue(), null, lVar, tVar222, zVar.B, zVar.C, new com.yandex.plus.home.feature.webviews.internal.overlap.g(), zVar.K, new com.yandex.plus.home.feature.webviews.internal.stories.i(0, zVar.l, com.yandex.plus.home.auth.f.class, "getAuthToken", "getAuthToken()Ljava/lang/String;", 0, 3), new com.yandex.plus.home.feature.webviews.internal.stories.i(0, zVar.l, com.yandex.plus.home.auth.f.class, "getIsAuthorizedFlow", "getIsAuthorizedFlow()Lkotlinx/coroutines/flow/Flow;", 0, 4), new com.yandex.plus.home.feature.webviews.internal.stories.i(0, zVar.l, com.yandex.plus.home.auth.f.class, "isYandexEmployee", "isYandexEmployee()Z", 0, 5), zVar.e, zVar.U, zVar.V, zVar.W, zVar.X, zVar.Y, zVar.Z, zVar.a0, zVar.e0, bsdVar22));
                                                }
                                                l1j.f();
                                            } else {
                                                l1j.f();
                                            }
                                        } else {
                                            l1j.f();
                                        }
                                    } else {
                                        obj = null;
                                        l1j.f();
                                    }
                                }
                            }
                            a1Var = new a1(15);
                            a1 a1Var2222 = a1Var;
                            com.yandex.plus.home.feature.webviews.internal.accessibility.b bVar2222 = new com.yandex.plus.home.feature.webviews.internal.accessibility.b();
                            a1 a1Var3222 = zVar.j;
                            ((com.yandex.plus.core.dispatcher.a) bVar).getClass();
                            mn7 mn7Var222 = com.yandex.plus.core.dispatcher.a.e;
                            f fVar2222 = new f(a1Var3222, mn7Var222);
                            com.yandex.plus.core.location.a aVar5222 = zVar.n;
                            dq7 dq7Var222 = com.yandex.plus.core.dispatcher.a.f;
                            f fVar3222 = new f((com.yandex.plus.home.ybsdk.a) null, aVar5222, dq7Var222);
                            com.yandex.plus.home.feature.webviews.internal.purchase.subscription.b bVar3222 = new com.yandex.plus.home.feature.webviews.internal.purchase.subscription.b(dVar);
                            dVar.getClass();
                            l lVar2222 = new l();
                            lVar2222.a = dVar;
                            g0 g0Var322 = zVar.A;
                            g0Var322.getClass();
                            l lVar3222 = new l();
                            lVar3222.a = g0Var322;
                            com.yandex.plus.home.plaque.feature.internal.presentation.b bVar4222 = new com.yandex.plus.home.plaque.feature.internal.presentation.b();
                            bVar4222.a = bVar3222;
                            bVar4222.b = lVar2222;
                            bVar4222.c = lVar3222;
                            bVar4222.d = new com.yandex.passport.common.mvi.d(bVar3222.b, bVar4222, 15);
                            x0q b322 = y0q.b(0, 0, null, 7);
                            bVar4222.e = b322;
                            bVar4222.f = new dkn(b322);
                            f fVar4222 = new f(dq7Var222);
                            s sVar622 = new s(zVar.D, zVar.K, (Set) zVar.Q.invoke(), (Uri) vVar.invoke(), (Uri) zVar.S.invoke());
                            Uri uri222 = (Uri) vVar.invoke();
                            String str622 = zVar.g;
                            String str2222 = zVar.f;
                            String str3222 = zVar.h;
                            com.yandex.plus.core.locale.a aVar6222 = zVar.q;
                            i iVar622 = zVar.p;
                            com.yandex.plus.core.location.a aVar7222 = zVar.n;
                            String str4222 = zVar.s;
                            String str5222 = zVar.t;
                            g0 g0Var2222 = zVar.w;
                            Build.MANUFACTURER.getClass();
                            Build.MODEL.getClass();
                            com.yandex.plus.home.feature.webviews.internal.uri.t tVar2222 = new com.yandex.plus.home.feature.webviews.internal.uri.t(sVar622, zVar.K, uri222, new com.yandex.plus.home.feature.panel.internal.shortcuts.daily.animation.a(8, fVar), str622, str2222, str3222, aVar6222, iVar622, aVar7222, str4222, str5222, g0Var2222, Build.VERSION.SDK_INT, r, false);
                            zVar.M.invoke();
                            Set set422 = (Set) zVar.N.invoke();
                            Set set2222 = (Set) zVar.O.invoke();
                            Set set3222 = (Set) zVar.P.invoke();
                            com.yandex.plus.home.internal.di.d dVar3222 = cVar2.a;
                            com.yandex.plus.home.internal.di.d dVar4222 = cVar2.a;
                            com.yandex.plus.home.analytics.diagnostic.webview.a aVar8222 = (com.yandex.plus.home.analytics.diagnostic.webview.a) dVar3222.y.getValue();
                            com.yandex.plus.home.analytics.diagnostic.webview.a aVar9222 = (com.yandex.plus.home.analytics.diagnostic.webview.a) dVar3222.w.getValue();
                            com.yandex.plus.home.analytics.diagnostic.webview.a aVar10222 = (com.yandex.plus.home.analytics.diagnostic.webview.a) dVar3222.x.getValue();
                            com.yandex.plus.core.analytics.logging.d dVar5222 = zVar.K;
                            set422.getClass();
                            set2222.getClass();
                            set3222.getClass();
                            aVar8222.getClass();
                            aVar9222.getClass();
                            aVar10222.getClass();
                            dVar5222.getClass();
                            a1 a1Var4222 = new a1(19);
                            y yVar322 = new y(sVar622, zVar.l);
                            com.yandex.plus.home.auth.f fVar5222 = zVar.l;
                            bsd bsdVar222 = com.yandex.plus.core.dispatcher.a.c;
                            a1 a1Var5222 = zVar.j;
                            com.yandex.plus.home.plaque.plugin.internal.proxy.a aVar11222 = zVar.k;
                            com.yandex.plus.home.analytics.diagnostic.webview.a d522 = cVar2.d(com.yandex.plus.home.feature.webviews.internalapi.analytics.diagnostic.b.a);
                            com.yandex.plus.home.feature.webviews.internalapi.analytics.diagnostic.a aVar12222 = com.yandex.plus.home.feature.webviews.internalapi.analytics.diagnostic.a.a;
                            com.yandex.plus.home.analytics.diagnostic.messaging.b c422 = cVar2.c(aVar12222);
                            com.yandex.plus.home.analytics.diagnostic.messaging.a a422 = cVar2.a(aVar12222);
                            com.yandex.plus.home.analytics.f fVar6222 = (com.yandex.plus.home.analytics.f) dVar4222.s.getValue();
                            com.yandex.plus.core.graphql.daily.progress.s sVar2222 = zVar.T;
                            com.yandex.plus.home.feature.webviews.internal.stories.i iVar2222 = new com.yandex.plus.home.feature.webviews.internal.stories.i(0, (z) fVar.c, z.class, "createHomeWebViewLoadingBenchmark", "createHomeWebViewLoadingBenchmark()Lcom/yandex/plus/core/benchmark/ViewLoadingBenchmark;", 0, 6);
                            com.yandex.plus.home.api.config.a aVar13222 = (com.yandex.plus.home.api.config.a) xqnVar.a;
                            if (xqnVar2.a != null) {
                            }
                        } else {
                            obj = null;
                            l1j.f();
                        }
                        return obj;
                }
            }
        });
    }

    @Override // androidx.fragment.app.o
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        Context requireContext = requireContext();
        requireContext.getClass();
        ComposeView composeView = new ComposeView(requireContext, null, 0, 6, null);
        dzf viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        composeView.setViewCompositionStrategy(new sml(viewLifecycleOwner.getLifecycle()));
        composeView.setContent(new wn5(new w9m(this, 0), -1099397001, true));
        return composeView;
    }
}
