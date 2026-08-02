package com.yandex.plus.home.feature.webviews.internal.stories.contract;

import com.yandex.plus.bdui.flex.factory.p;
import com.yandex.plus.home.feature.webviews.internal.f;
import com.yandex.plus.home.feature.webviews.internal.smart.h;
import com.yandex.plus.home.feature.webviews.internal.stories.l;
import com.yandex.plus.home.feature.webviews.internal.stories.m;
import com.yandex.plus.home.feature.webviews.internal.stories.n;
import com.yandex.plus.home.feature.webviews.internal.uri.w;
import com.yandex.plus.webview.api.WebViewContainer;
import com.yandex.plus.webview.core.i;
import defpackage.btf;
import defpackage.jyr;
import defpackage.u75;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class c extends com.yandex.plus.home.feature.webviews.internal.webview.d {
    public final l u;
    public final jyr v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(boolean z, boolean z2, WebViewContainer webViewContainer, com.yandex.plus.home.feature.webviews.internal.bridge.c cVar, f fVar, Function0 function0, l lVar, i iVar, com.yandex.plus.home.feature.webviews.internal.simple.d dVar, h hVar, m mVar, h hVar2, com.yandex.plus.core.network.ssl.a aVar, w wVar, long j, com.yandex.plus.home.feature.webviews.internal.webview.h hVar3, n nVar, b bVar, kotlinx.coroutines.a aVar2) {
        super(z, z2, webViewContainer, cVar, fVar, function0, lVar, iVar, dVar, hVar, mVar, null, hVar2, aVar, wVar, false, j, aVar2, 2048);
        com.yandex.plus.home.feature.webviews.internalapi.a aVar3 = com.yandex.plus.home.feature.webviews.internalapi.a.a;
        cVar.getClass();
        function0.getClass();
        iVar.getClass();
        aVar.getClass();
        hVar3.getClass();
        nVar.getClass();
        aVar2.getClass();
        this.u = lVar;
        this.v = btf.b(new p(bVar, hVar3, nVar));
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.webview.d
    public final List r() {
        return u75.h((a) this.v.getValue(), new com.yandex.plus.home.feature.webviews.internal.stories.a(this.u));
    }
}
