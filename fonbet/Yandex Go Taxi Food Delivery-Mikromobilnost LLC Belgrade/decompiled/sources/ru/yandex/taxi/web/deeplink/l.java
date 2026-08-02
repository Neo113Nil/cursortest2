package ru.yandex.taxi.web.deeplink;

import defpackage.ag41;
import defpackage.bi41;
import defpackage.cu41;
import defpackage.gq41;
import defpackage.gw00;
import defpackage.i790;
import defpackage.m790;
import defpackage.tje;
import kotlin.Pair;
import ru.yandex.taxi.web.deeplink.WebViewFromDeeplinkExperiment;

/* loaded from: classes6.dex */
public final class l implements bi41 {
    public final /* synthetic */ m a;
    public final /* synthetic */ WebViewFromDeeplinkExperiment.a b;

    public l(m mVar, WebViewFromDeeplinkExperiment.a aVar) {
        this.a = mVar;
        this.b = aVar;
    }

    @Override // defpackage.bi41
    public final void onPageFinished(String str) {
        m mVar = this.a;
        gq41 gq41Var = mVar.H;
        String str2 = this.b.a;
        gq41Var.getClass();
        gq41Var.a("OpenExternalWebViewUrl.Successful", gw00.e(new Pair("url_id", str2)));
        ((ag41) mVar.R()).c(cu41.c);
    }

    @Override // defpackage.bi41
    public final void onPageLoadingError(m790 m790Var) {
        m mVar = this.a;
        ((ag41) mVar.R()).b(true);
        gq41 gq41Var = mVar.H;
        WebViewFromDeeplinkExperiment.a aVar = this.b;
        String str = aVar.a;
        gq41Var.getClass();
        gq41Var.a("OpenExternalWebViewUrl.Error", gw00.e(new Pair("url_id", str)));
        if (m790Var instanceof i790) {
            String str2 = aVar.a;
            gq41Var.getClass();
            gq41Var.a("OpenExternalWebViewUrl.AuthError", gw00.e(new Pair("url_id", str2)));
            tje.N(mVar.o(), gq41.b, null, new WebViewFromDeeplinkRouter$showInternal$loadingListener$1$onPageLoadingError$1(mVar, aVar, null), 2);
        }
    }
}
