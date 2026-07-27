package kotlin.text;

import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/* loaded from: classes.dex */
public final class CatchingFishHiltRealm extends WebViewClient {
    public static final /* synthetic */ int CatchingFishSnackbar = 0;
    public final CatchingFishViewModelIntent CatchingFishParcelableFAB;

    public CatchingFishHiltRealm(CatchingFishViewModelIntent catchingFishViewModelIntent) {
        this.CatchingFishParcelableFAB = catchingFishViewModelIntent;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        CatchingFishFirebaseDagger.CatchingFishNavigation(webView, "view");
        CatchingFishFirebaseDagger.CatchingFishNavigation(webResourceRequest, "request");
        String uri = webResourceRequest.getUrl().toString();
        CatchingFishFirebaseDagger.CatchingFishRoomDatabase(uri, "toString(...)");
        return this.CatchingFishParcelableFAB.CatchingFishUnitTesting(uri, new CatchingFishMotionLayout(6), true);
    }
}
