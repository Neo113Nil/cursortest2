package defpackage;

import android.net.http.SslError;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;

/* loaded from: classes3.dex */
public final class j0h implements tdv {
    public final /* synthetic */ aqi a;

    public j0h(aqi aqiVar) {
        this.a = aqiVar;
    }

    @Override // defpackage.tdv
    public final void b(String str) {
        this.a.setValue(Boolean.FALSE);
    }

    @Override // defpackage.tdv
    public final void d(WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        if (webResourceRequest.isForMainFrame()) {
            this.a.setValue(Boolean.FALSE);
        }
    }

    @Override // defpackage.tdv
    public final void l(WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        if (webResourceRequest.isForMainFrame()) {
            this.a.setValue(Boolean.FALSE);
        }
    }

    @Override // defpackage.tdv
    public final void m(SslError sslError) {
        sslError.getClass();
        this.a.setValue(Boolean.FALSE);
    }
}
