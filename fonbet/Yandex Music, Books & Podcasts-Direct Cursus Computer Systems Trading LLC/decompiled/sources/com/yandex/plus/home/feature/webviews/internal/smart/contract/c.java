package com.yandex.plus.home.feature.webviews.internal.smart.contract;

import com.yandex.passport.internal.ui.bouncer.roundabout.k;
import com.yandex.plus.home.feature.webviews.internal.f;
import com.yandex.plus.home.feature.webviews.internal.smart.h;
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
    public c(boolean z, boolean z2, WebViewContainer webViewContainer, com.yandex.plus.home.feature.webviews.internal.bridge.c cVar, f fVar, Function0 function0, i iVar, com.yandex.plus.home.feature.webviews.internal.simple.d dVar, h hVar, k kVar, com.yandex.plus.home.feature.webviews.internal.simple.d dVar2, h hVar2, com.yandex.plus.core.network.ssl.a aVar, w wVar, long j, com.yandex.plus.home.feature.webviews.internal.webview.h hVar3, b bVar, kotlinx.coroutines.a aVar2) {
        super(z, z2, webViewContainer, cVar, fVar, function0, null, iVar, dVar, hVar, kVar, dVar2, hVar2, aVar, wVar, true, j, aVar2, 64);
        com.yandex.plus.home.feature.webviews.internalapi.a aVar3 = com.yandex.plus.home.feature.webviews.internalapi.a.a;
        cVar.getClass();
        function0.getClass();
        iVar.getClass();
        aVar.getClass();
        hVar3.getClass();
        aVar2.getClass();
        this.u = btf.b(new com.yandex.plus.bdui.content.b(bVar, hVar3));
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.webview.d
    public final List r() {
        return t75.c((a) this.u.getValue());
    }
}
