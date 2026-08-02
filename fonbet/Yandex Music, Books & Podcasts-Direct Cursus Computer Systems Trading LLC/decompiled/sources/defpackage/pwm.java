package defpackage;

import android.net.http.SslError;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import com.yandex.music.payment.screen.promocode.viewmodel.a;

/* loaded from: classes3.dex */
public final class pwm implements tdv {
    public final /* synthetic */ a a;

    public pwm(a aVar) {
        this.a = aVar;
    }

    @Override // defpackage.tdv
    public final void b(String str) {
        this.a.K(str);
    }

    @Override // defpackage.tdv
    public final void d(WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        this.a.H(webResourceRequest, webResourceError);
    }

    @Override // defpackage.tdv
    public final void l(WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        this.a.J(webResourceRequest, webResourceResponse);
    }

    @Override // defpackage.tdv
    public final void m(SslError sslError) {
        sslError.getClass();
        a aVar = this.a;
        aVar.getClass();
        lum lumVar = aVar.n;
        Object value = aVar.p.getValue();
        swm swmVar = value instanceof swm ? (swm) value : null;
        if (swmVar != null) {
            lumVar.Z(swmVar.a, sslError);
        }
    }
}
