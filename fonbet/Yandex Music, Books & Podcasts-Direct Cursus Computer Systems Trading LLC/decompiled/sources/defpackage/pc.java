package defpackage;

import android.webkit.WebView;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final class pc implements na8 {
    public final /* synthetic */ int a;
    public final /* synthetic */ WebView b;
    public final /* synthetic */ aqi c;

    public /* synthetic */ pc(WebView webView, aqi aqiVar, int i) {
        this.a = i;
        this.b = webView;
        this.c = aqiVar;
    }

    @Override // defpackage.na8
    public final void a() {
        switch (this.a) {
            case 0:
                ((Function1) this.c.getValue()).invoke(this.b);
                break;
            default:
                ((Function1) this.c.getValue()).invoke(this.b);
                break;
        }
    }
}
