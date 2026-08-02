package ru.yandex.taxi.web.deeplink;

import android.net.Uri;
import defpackage.cvu0;
import defpackage.gq41;
import defpackage.gw00;
import defpackage.iq41;
import defpackage.jl40;
import defpackage.ny61;
import defpackage.oyr;
import defpackage.tt2;
import kotlin.Pair;
import ru.yandex.taxi.web.deeplink.WebViewFromDeeplinkExperiment;

/* loaded from: classes6.dex */
public final class i {
    public final tt2 a;
    public final gq41 b;
    public final iq41 c;

    public i(tt2 tt2Var, gq41 gq41Var, iq41 iq41Var) {
        this.a = tt2Var;
        this.b = gq41Var;
        this.c = iq41Var;
    }

    public final WebViewFromDeeplinkExperiment.a a(WebViewFromDeeplinkExperiment.a aVar, String str, Uri uri) {
        WebViewFromDeeplinkExperiment.Companion.getClass();
        boolean l = jl40.l(aVar, WebViewFromDeeplinkExperiment.e);
        gq41 gq41Var = this.b;
        if (l) {
            gq41Var.getClass();
            gq41Var.a("OpenExternalWebViewUrl.IdNotFound", gw00.e(new Pair("url_id", str)));
            throw new IdNotFoundInExperimentException(str);
        }
        gq41Var.getClass();
        gq41Var.a("OpenExternalWebViewUrl.IdFounded", gw00.e(new Pair("url_id", str)));
        String str2 = aVar.b;
        if (str2.length() == 0) {
            ny61.g("Url is empty");
            return null;
        }
        for (String str3 : uri.getQueryParameterNames()) {
            String queryParameter = uri.getQueryParameter(str3);
            if (queryParameter != null) {
                str2 = cvu0.v(str2, oyr.p("{", str3, "}"), queryParameter, false);
            }
        }
        return WebViewFromDeeplinkExperiment.a.a(aVar, str2);
    }
}
