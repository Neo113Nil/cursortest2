package kotlin.text;

import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/* loaded from: classes.dex */
public final class CatchingFishServiceKtorGson extends WebViewClient {
    public final CatchingFishViewModelIntent CatchingFishParcelableFAB;
    public final CatchingFishGraphQLFirebase CatchingFishSnackbar;

    public CatchingFishServiceKtorGson(CatchingFishViewModelIntent catchingFishViewModelIntent, CatchingFishGraphQLFirebase catchingFishGraphQLFirebase) {
        CatchingFishFirebaseDagger.CatchingFishNavigation(catchingFishViewModelIntent, "routeHandler");
        this.CatchingFishParcelableFAB = catchingFishViewModelIntent;
        this.CatchingFishSnackbar = catchingFishGraphQLFirebase;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        if (str != null) {
            CatchingFishViewModelIntent catchingFishViewModelIntent = this.CatchingFishParcelableFAB;
            catchingFishViewModelIntent.getClass();
            CatchingFishGraphQLFirebase catchingFishGraphQLFirebase = this.CatchingFishSnackbar;
            CatchingFishFirebaseDagger.CatchingFishNavigation(catchingFishGraphQLFirebase, "closePopup");
            String str2 = null;
            if (CatchingFishGradleMVVM.CatchingFishViewModelScope(str) && !CatchingFishRoomMVVMWidget.CatchingFishMutableLiveData(str, "/gp/p/loading")) {
                str2 = CatchingFishMoshiFluxMoshi.CatchingFishFragmentHandler(str);
            }
            if (str2 == null) {
                return;
            }
            catchingFishGraphQLFirebase.CatchingFishParcelableFAB();
            ((CatchingFishManifestMVI) catchingFishViewModelIntent.CatchingFishDaggerWebsocket).CatchingFishSnackbar(str2);
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        CatchingFishFirebaseDagger.CatchingFishNavigation(webView, "view");
        CatchingFishFirebaseDagger.CatchingFishNavigation(webResourceRequest, "request");
        String uri = webResourceRequest.getUrl().toString();
        CatchingFishFirebaseDagger.CatchingFishRoomDatabase(uri, "toString(...)");
        return this.CatchingFishParcelableFAB.CatchingFishUnitTesting(uri, this.CatchingFishSnackbar, false);
    }
}
