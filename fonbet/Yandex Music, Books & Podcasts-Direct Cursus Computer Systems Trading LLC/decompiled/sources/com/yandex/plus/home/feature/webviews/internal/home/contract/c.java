package com.yandex.plus.home.feature.webviews.internal.home.contract;

import com.yandex.passport.internal.ui.bouncer.roundabout.k;
import com.yandex.plus.bdui.flex.factory.p;
import com.yandex.plus.bdui.q;
import com.yandex.plus.home.feature.webviews.internal.f;
import com.yandex.plus.home.feature.webviews.internal.home.j;
import com.yandex.plus.home.feature.webviews.internal.uri.w;
import com.yandex.plus.webview.api.WebViewContainer;
import com.yandex.plus.webview.core.i;
import defpackage.btf;
import defpackage.jyr;
import defpackage.t75;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class c extends com.yandex.plus.home.feature.webviews.internal.webview.d {
    public final jyr u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(boolean z, boolean z2, WebViewContainer webViewContainer, com.yandex.plus.home.feature.webviews.internal.bridge.c cVar, f fVar, Function0 function0, i iVar, com.yandex.plus.core.debug.panel.internal.presentation.controller.a aVar, q qVar, k kVar, q qVar2, com.yandex.plus.core.network.ssl.a aVar2, w wVar, long j, j jVar, j jVar2, b bVar, kotlinx.coroutines.a aVar3) {
        super(z, z2, webViewContainer, cVar, fVar, function0, null, iVar, aVar, qVar, kVar, null, qVar2, aVar2, wVar, false, j, aVar3, 2112);
        com.yandex.plus.home.feature.webviews.internalapi.a aVar4 = com.yandex.plus.home.feature.webviews.internalapi.a.a;
        cVar.getClass();
        function0.getClass();
        iVar.getClass();
        aVar2.getClass();
        jVar.getClass();
        jVar2.getClass();
        aVar3.getClass();
        this.u = btf.b(new p(bVar, jVar, jVar2));
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.webview.d
    public final List r() {
        return t75.c((a) this.u.getValue());
    }
}
