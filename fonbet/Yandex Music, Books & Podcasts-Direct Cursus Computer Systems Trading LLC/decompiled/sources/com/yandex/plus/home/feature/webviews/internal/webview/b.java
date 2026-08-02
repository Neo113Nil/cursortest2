package com.yandex.plus.home.feature.webviews.internal.webview;

import android.net.Uri;
import android.webkit.JavascriptInterface;
import com.yandex.passport.data.network.l;
import com.yandex.passport.internal.ui.bouncer.model.middleware.o;
import com.yandex.plus.core.graphql.type.a1;
import com.yandex.plus.home.feature.webviews.internal.container.t;
import com.yandex.plus.home.feature.webviews.internal.container.u;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.b2;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.b6;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.d5;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.e2;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.g5;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.h6;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.j3;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.k6;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.l2;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.l4;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.n6;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.o2;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.o3;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.o4;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.r2;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.s5;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.u3;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.v1;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.v5;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.x2;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.x4;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.y1;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.y5;
import com.yandex.plus.home.internal.di.y;
import com.yandex.plus.webview.api.contract.k;
import defpackage.bqi;
import defpackage.btf;
import defpackage.jyr;
import defpackage.t7o;
import defpackage.vdr;
import defpackage.xdr;
import defpackage.z7o;
import java.util.Arrays;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public abstract class b extends com.yandex.plus.webview.api.contract.a implements g, com.yandex.plus.webview.api.a, com.yandex.plus.webview.core.i, com.yandex.plus.webview.api.contract.j, com.yandex.plus.webview.api.contract.i {
    public final /* synthetic */ k e;
    public final l f;
    public final u g;
    public final com.yandex.plus.home.analytics.f h;
    public final a1 i;
    public final com.yandex.plus.bdui.plus.content.controller.f j;
    public final com.yandex.plus.home.plaque.plugin.internal.proxy.a k;
    public final com.yandex.plus.home.analytics.diagnostic.webview.a l;
    public final com.yandex.plus.home.analytics.diagnostic.messaging.b m;
    public final com.yandex.plus.home.analytics.payment.e n;
    public final y o;
    public final h p;
    public final Function0 q;
    public final o r;
    public final com.yandex.plus.bdui.plus.content.controller.f s;
    public final com.yandex.plus.home.feature.webviews.internalapi.a t;
    public final com.yandex.plus.log.api.b u;
    public final kotlinx.coroutines.a v;
    public final kotlinx.coroutines.a w;
    public final jyr x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(com.yandex.plus.webview.api.contract.message.d dVar, com.yandex.passport.internal.core.accounts.h hVar, com.yandex.plus.bdui.plus.content.controller.f fVar, l lVar, u uVar, com.yandex.plus.home.analytics.f fVar2, a1 a1Var, com.yandex.plus.bdui.plus.content.controller.f fVar3, com.yandex.plus.home.plaque.plugin.internal.proxy.a aVar, com.yandex.plus.home.analytics.diagnostic.webview.a aVar2, com.yandex.plus.home.analytics.diagnostic.messaging.b bVar, com.yandex.plus.home.analytics.payment.e eVar, y yVar, h hVar2, Function0 function0, o oVar, com.yandex.plus.bdui.plus.content.controller.f fVar4, com.yandex.plus.home.feature.webviews.internalapi.a aVar3, com.yandex.plus.log.api.b bVar2, kotlinx.coroutines.a aVar4, kotlinx.coroutines.a aVar5) {
        super(dVar, hVar, aVar4);
        uVar.getClass();
        fVar2.getClass();
        a1Var.getClass();
        fVar3.getClass();
        aVar.getClass();
        aVar2.getClass();
        bVar.getClass();
        yVar.getClass();
        hVar2.getClass();
        fVar4.getClass();
        bVar2.getClass();
        aVar4.getClass();
        aVar5.getClass();
        this.e = new k();
        this.f = lVar;
        this.g = uVar;
        this.h = fVar2;
        this.i = a1Var;
        this.j = fVar3;
        this.k = aVar;
        this.l = aVar2;
        this.m = bVar;
        this.n = eVar;
        this.o = yVar;
        this.p = hVar2;
        this.q = function0;
        this.r = oVar;
        this.s = fVar4;
        this.t = aVar3;
        this.u = bVar2;
        this.v = aVar4;
        this.w = aVar5;
        this.x = btf.b(new com.yandex.plus.home.feature.webviews.internal.smart.a(fVar, 1));
    }

    public static final com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.l y(b bVar, b2 b2Var, Boolean bool, boolean z, boolean z2, String str) {
        bVar.getClass();
        return new com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.l(b2Var.a, b2Var.b, bool, z, z2, str);
    }

    public abstract String A();

    public void B(l4 l4Var) {
        l4Var.getClass();
        Uri uri = l4Var.b;
        String A = A();
        com.yandex.plus.log.api.a aVar = com.yandex.plus.log.api.a.b;
        com.yandex.plus.log.api.b bVar = this.u;
        if (bVar.b(aVar)) {
            bVar.c(aVar, A, "handleOpenUrlMessage() outMessage=" + l4Var);
        }
        u uVar = this.g;
        ((t) uVar).w(uri);
        Object E = this.f.E(l4Var);
        if (!(E instanceof t7o)) {
            u.b(uVar, (com.yandex.plus.home.feature.webviews.internal.uri.j) E, true, null, 60);
        }
        Throwable a = z7o.a(E);
        if (a != null) {
            String A2 = A();
            com.yandex.plus.log.api.a aVar2 = com.yandex.plus.log.api.a.e;
            if (bVar.b(aVar2)) {
                bVar.a(aVar2, A2, "handleOpenUrlMessage() error", a);
            }
            String uri2 = uri.toString();
            uri2.getClass();
            this.m.c(uri2);
        }
    }

    public final void C(v1 v1Var) {
        v1Var.getClass();
        String A = A();
        com.yandex.plus.log.api.a aVar = com.yandex.plus.log.api.a.b;
        com.yandex.plus.log.api.b bVar = this.u;
        if (bVar.b(aVar)) {
            bVar.c(aVar, A, "sendMessage() message=" + v1Var);
        }
        v(v1Var);
    }

    @Override // com.yandex.plus.webview.api.a
    public final void b(String str) {
        str.getClass();
        String A = A();
        com.yandex.plus.log.api.a aVar = com.yandex.plus.log.api.a.b;
        com.yandex.plus.log.api.b bVar = this.u;
        if (bVar.b(aVar)) {
            bVar.c(aVar, A, "onPageLoadingFinished()");
        }
    }

    @Override // com.yandex.plus.webview.core.i
    public final void d(int i, String str, String str2, String str3, boolean z) {
        if (z) {
            this.p.j("ssl error", str, true);
        }
        this.l.e(i, str, str2, str3, z);
    }

    @Override // com.yandex.plus.webview.api.contract.d
    public final void h() {
        String A = A();
        com.yandex.plus.log.api.a aVar = com.yandex.plus.log.api.a.b;
        com.yandex.plus.log.api.b bVar = this.u;
        if (bVar.b(aVar)) {
            bVar.c(aVar, A, "onLoadStartCommand");
        }
        bqi b = this.e.b();
        Boolean bool = Boolean.FALSE;
        xdr xdrVar = (xdr) b;
        xdrVar.getClass();
        xdrVar.m(null, bool);
    }

    @Override // com.yandex.plus.webview.api.contract.i
    public final void i() {
        String A = A();
        com.yandex.plus.log.api.a aVar = com.yandex.plus.log.api.a.b;
        com.yandex.plus.log.api.b bVar = this.u;
        if (bVar.b(aVar)) {
            bVar.c(aVar, A, "onReadyTimeout()");
        }
        this.p.c();
    }

    @Override // com.yandex.plus.webview.core.i
    public final void k(int i, String str, String str2, String str3, boolean z) {
        if (z) {
            this.p.j(String.format("connection error, error code = %d", Arrays.copyOf(new Object[]{Integer.valueOf(i)}, 1)), str, false);
        }
        this.l.c(i, str, str2, str3, z);
    }

    @Override // com.yandex.plus.webview.api.contract.a, com.yandex.plus.webview.api.javascript.a
    @JavascriptInterface
    public void onMessage(@NotNull String str) {
        str.getClass();
        String A = A();
        com.yandex.plus.log.api.a aVar = com.yandex.plus.log.api.a.b;
        com.yandex.plus.log.api.b bVar = this.u;
        if (bVar.b(aVar)) {
            bVar.c(aVar, A, "onMessage: ".concat(str));
        }
        super.onMessage(str);
    }

    @Override // com.yandex.plus.webview.api.contract.i
    public final void onReady() {
        String A = A();
        com.yandex.plus.log.api.a aVar = com.yandex.plus.log.api.a.b;
        com.yandex.plus.log.api.b bVar = this.u;
        if (bVar.b(aVar)) {
            bVar.c(aVar, A, "onReady()");
        }
        this.p.m();
    }

    @Override // com.yandex.plus.webview.api.contract.j
    public final vdr q() {
        return this.e.b();
    }

    @Override // com.yandex.plus.webview.core.i
    public final void u(int i, String str, String str2, String str3, boolean z) {
        str3.getClass();
        if (z) {
            this.p.j(String.format("http error, status code = %d", Arrays.copyOf(new Object[]{Integer.valueOf(i)}, 1)), str, false);
        }
        this.l.b(i, str, str2, str3, z);
    }

    @Override // com.yandex.plus.webview.api.contract.a
    public final void x(com.yandex.plus.webview.api.contract.message.d dVar) {
        dVar.getClass();
        dVar.c(o4.class, new a(1, this, b.class, "handleOptionStatusRequest", "handleOptionStatusRequest(Lcom/yandex/plus/home/feature/webviews/internalapi/bridge/dto/OutMessage$OptionStatusRequest;)V", 0, 11));
        int i = 0;
        int i2 = 1;
        dVar.c(b2.class, new a(i2, this, b.class, "handleChangeOptionStatusRequest", "handleChangeOptionStatusRequest(Lcom/yandex/plus/home/feature/webviews/internalapi/bridge/dto/OutMessage$ChangeOptionStatusRequest;)V", i, 15));
        dVar.c(k6.class, new a(i2, this, b.class, "handleUserBoughtSubscription", "handleUserBoughtSubscription(Lcom/yandex/plus/home/feature/webviews/internalapi/bridge/dto/OutMessage$UserBoughtSubscription;)V", i, 16));
        dVar.c(h6.class, new a(i2, this, b.class, "handleUpdateTargetsState", "handleUpdateTargetsState(Lcom/yandex/plus/home/feature/webviews/internalapi/bridge/dto/OutMessage$UpdateTargetsState;)V", i, 17));
        dVar.c(l2.class, new a(i2, this, b.class, "handleCriticalError", "handleCriticalError(Lcom/yandex/plus/home/feature/webviews/internalapi/bridge/dto/OutMessage$CriticalError;)V", i, 18));
        dVar.c(n6.class, new a(i2, this, b.class, "handleUserCardRequest", "handleUserCardRequest(Lcom/yandex/plus/home/feature/webviews/internalapi/bridge/dto/OutMessage$UserCardRequest;)V", i, 19));
        dVar.c(y5.class, new a(i2, this, b.class, "handleSuccessScreenShown", "handleSuccessScreenShown(Lcom/yandex/plus/home/feature/webviews/internalapi/bridge/dto/OutMessage$SuccessScreenShown;)V", i, 20));
        dVar.c(v5.class, new a(i2, this, b.class, "handleSuccessScreenButtonTapped", "handleSuccessScreenButtonTapped(Lcom/yandex/plus/home/feature/webviews/internalapi/bridge/dto/OutMessage$SuccessScreenButtonTapped;)V", i, 21));
        dVar.c(u3.class, new a(i2, this, b.class, "handleOpenSmart", "handleOpenSmart(Lcom/yandex/plus/home/feature/webviews/internalapi/bridge/dto/OutMessage$OpenSmart;)V", i, 22));
        dVar.c(g5.class, new a(i2, this, b.class, "handleSendMetricsEvent", "handleSendMetricsEvent(Lcom/yandex/plus/home/feature/webviews/internalapi/bridge/dto/OutMessage$SendMetricsEvent;)V", i, 1));
        dVar.c(l4.class, new a(i2, this, b.class, "handleOpenUrl", "handleOpenUrl(Lcom/yandex/plus/home/feature/webviews/internalapi/bridge/dto/OutMessage$OpenUrl;)V", i, 2));
        dVar.c(e2.class, new a(i2, this, b.class, "handleCloseCurrentWebView", "handleCloseCurrentWebView(Lcom/yandex/plus/home/feature/webviews/internalapi/bridge/dto/OutMessage$CloseCurrentWebView;)V", i, 3));
        dVar.c(x4.class, new a(i2, this, b.class, "handleReady", "handleReady(Lcom/yandex/plus/home/feature/webviews/internalapi/bridge/dto/OutMessage$Ready;)V", i, 4));
        dVar.c(o3.class, new a(i2, this, b.class, "handleNeedAuthorization", "handleNeedAuthorization(Lcom/yandex/plus/home/feature/webviews/internalapi/bridge/dto/OutMessage$NeedAuthorization;)V", i, 5));
        dVar.c(x2.class, new a(i2, this, b.class, "handleLogoutRequest", "handleLogoutRequest(Lcom/yandex/plus/home/feature/webviews/internalapi/bridge/dto/OutMessage$LogoutRequest;)V", i, 6));
        dVar.c(d5.class, new a(i2, this, b.class, "handleSendBroadcastEvent", "handleSendBroadcastEvent(Lcom/yandex/plus/home/feature/webviews/internalapi/bridge/dto/OutMessage$SendBroadcastEvent;)V", i, 7));
        dVar.c(s5.class, new a(i2, this, b.class, "handleShowServiceInfo", "handleShowServiceInfo(Lcom/yandex/plus/home/feature/webviews/internalapi/bridge/dto/OutMessage$ShowServiceInfo;)V", i, 8));
        dVar.c(b6.class, new a(i2, this, b.class, "handleTreasuryStateRequest", "handleTreasuryStateRequest(Lcom/yandex/plus/home/feature/webviews/internalapi/bridge/dto/OutMessage$TreasuryStateRequest;)V", i, 9));
        dVar.c(y1.class, new a(i2, this, b.class, "handleCallbackEvent", "handleCallbackEvent(Lcom/yandex/plus/home/feature/webviews/internalapi/bridge/dto/OutMessage$CallbackEvent;)V", i, 10));
        dVar.c(j3.class, new a(i2, this, b.class, "handleVibrateRequest", "handleVibrateRequest(Lcom/yandex/plus/home/feature/webviews/internalapi/bridge/dto/OutMessage$NativeVibrateRequest;)V", i, 12));
        dVar.c(o2.class, new a(i2, this, b.class, "handleDisableSwipeClose", "handleDisableSwipeClose(Lcom/yandex/plus/home/feature/webviews/internalapi/bridge/dto/OutMessage$DisableSwipeClose;)V", i, 13));
        dVar.c(r2.class, new a(i2, this, b.class, "handleEnableSwipeClose", "handleEnableSwipeClose(Lcom/yandex/plus/home/feature/webviews/internalapi/bridge/dto/OutMessage$EnableSwipeClose;)V", i, 14));
        z(dVar);
    }

    public abstract void z(com.yandex.plus.webview.api.contract.message.d dVar);
}
