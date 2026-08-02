package defpackage;

import android.os.Bundle;
import android.webkit.WebView;

/* loaded from: classes3.dex */
public final class hev implements zoo {
    public final /* synthetic */ WebView a;

    public hev(WebView webView) {
        this.a = webView;
    }

    @Override // defpackage.zoo
    public final Object a(goo gooVar, Object obj) {
        Bundle bundle = (Bundle) obj;
        gooVar.getClass();
        bundle.getClass();
        this.a.saveState(bundle);
        return bundle;
    }

    @Override // defpackage.zoo
    public final Object f(Object obj) {
        this.a.restoreState((Bundle) obj);
        return new Bundle();
    }
}
