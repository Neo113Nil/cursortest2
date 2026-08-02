package defpackage;

import android.webkit.WebView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final /* synthetic */ class bq5 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ WebView b;

    public /* synthetic */ bq5(WebView webView, int i) {
        this.a = i;
        this.b = webView;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                this.b.goBack();
                break;
            case 1:
                WebView webView = this.b;
                webView.onResume();
                webView.resumeTimers();
                break;
            case 2:
                WebView webView2 = this.b;
                webView2.onPause();
                webView2.pauseTimers();
                break;
            default:
                this.b.goBack();
                break;
        }
        return Unit.a;
    }
}
