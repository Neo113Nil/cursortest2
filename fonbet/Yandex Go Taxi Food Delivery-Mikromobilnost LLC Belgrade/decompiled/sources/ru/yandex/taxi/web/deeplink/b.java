package ru.yandex.taxi.web.deeplink;

import defpackage.tje;
import defpackage.tt2;
import defpackage.uyj;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.web.deeplink.WebViewFromDeeplinkExperiment;

/* loaded from: classes6.dex */
public final class b {
    public final tt2 a;
    public final a b;
    public final WebViewFromDeeplinkJsNativeApi c;

    public b(tt2 tt2Var, a aVar, WebViewFromDeeplinkJsNativeApi webViewFromDeeplinkJsNativeApi) {
        this.a = tt2Var;
        this.b = aVar;
        this.c = webViewFromDeeplinkJsNativeApi;
    }

    public final Object a(WebViewFromDeeplinkExperiment.a aVar, ContinuationImpl continuationImpl) {
        this.a.getClass();
        return tje.k0(uyj.a, new WebViewFromDeeplinkConfigProvider$getConfig$2(this, aVar, null), continuationImpl);
    }
}
