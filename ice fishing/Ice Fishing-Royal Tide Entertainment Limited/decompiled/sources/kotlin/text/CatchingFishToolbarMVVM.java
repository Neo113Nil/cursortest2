package kotlin.text;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Message;
import android.view.View;
import android.webkit.PermissionRequest;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.catchingfish.fishcatcherpro.presentation.launch.MainActivity;

/* loaded from: classes.dex */
public final class CatchingFishToolbarMVVM extends WebChromeClient {
    public final CatchingFishEspressoPayPal CatchingFishCoroutine;
    public final CatchingFishViewModelIntent CatchingFishDaggerWebsocket;
    public final MainActivity CatchingFishParcelableFAB;
    public final CatchingFishViewMockkFlux CatchingFishReduxKtor;
    public final CatchingFishBundleGlide CatchingFishSnackbar;
    public final CatchingFishBundleGlide CatchingFishViewModelScope;
    public final CatchingFishFluxFluxBundle CatchingFishWorkManager;

    public CatchingFishToolbarMVVM(MainActivity mainActivity, CatchingFishBundleGlide catchingFishBundleGlide, CatchingFishEspressoPayPal catchingFishEspressoPayPal, CatchingFishViewMockkFlux catchingFishViewMockkFlux, CatchingFishViewModelIntent catchingFishViewModelIntent, CatchingFishFluxFluxBundle catchingFishFluxFluxBundle, CatchingFishBundleGlide catchingFishBundleGlide2) {
        CatchingFishFirebaseDagger.CatchingFishNavigation(catchingFishBundleGlide, "screenState");
        CatchingFishFirebaseDagger.CatchingFishNavigation(catchingFishEspressoPayPal, "webViewStack");
        CatchingFishFirebaseDagger.CatchingFishNavigation(catchingFishViewMockkFlux, "webViewConfigurator");
        CatchingFishFirebaseDagger.CatchingFishNavigation(catchingFishFluxFluxBundle, "cameraPermissionCoordinator");
        CatchingFishFirebaseDagger.CatchingFishNavigation(catchingFishBundleGlide2, "fileChooserCoordinator");
        this.CatchingFishParcelableFAB = mainActivity;
        this.CatchingFishSnackbar = catchingFishBundleGlide;
        this.CatchingFishCoroutine = catchingFishEspressoPayPal;
        this.CatchingFishReduxKtor = catchingFishViewMockkFlux;
        this.CatchingFishDaggerWebsocket = catchingFishViewModelIntent;
        this.CatchingFishWorkManager = catchingFishFluxFluxBundle;
        this.CatchingFishViewModelScope = catchingFishBundleGlide2;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onCreateWindow(WebView webView, boolean z, boolean z2, Message message) {
        CatchingFishFirebaseDagger.CatchingFishNavigation(webView, "view");
        WebView webView2 = new WebView(this.CatchingFishParcelableFAB);
        CatchingFishServiceKtorGson catchingFishServiceKtorGson = new CatchingFishServiceKtorGson(this.CatchingFishDaggerWebsocket, new CatchingFishGraphQLFirebase(1, this, webView2));
        this.CatchingFishReduxKtor.getClass();
        CatchingFishViewMockkFlux.CatchingFishParcelableFAB(webView2, false, this, catchingFishServiceKtorGson);
        webView2.getSettings().setUserAgentString(webView.getSettings().getUserAgentString());
        CatchingFishEspressoPayPal catchingFishEspressoPayPal = this.CatchingFishCoroutine;
        catchingFishEspressoPayPal.getClass();
        FrameLayout frameLayout = (FrameLayout) catchingFishEspressoPayPal.CatchingFishDaggerWebsocket;
        if (frameLayout != null) {
            frameLayout.addView(webView2);
        }
        Object obj = message != null ? message.obj : null;
        WebView.WebViewTransport webViewTransport = obj instanceof WebView.WebViewTransport ? (WebView.WebViewTransport) obj : null;
        if (webViewTransport == null) {
            return false;
        }
        webViewTransport.setWebView(webView2);
        message.sendToTarget();
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final void onPermissionRequest(PermissionRequest permissionRequest) {
        CatchingFishFirebaseDagger.CatchingFishNavigation(permissionRequest, "request");
        CatchingFishFluxFluxBundle catchingFishFluxFluxBundle = this.CatchingFishWorkManager;
        catchingFishFluxFluxBundle.getClass();
        MainActivity mainActivity = (MainActivity) catchingFishFluxFluxBundle.CatchingFishReduxKtor;
        if (CatchingFishGsonCardView.CatchingFishCloudMessaging(mainActivity, "android.permission.CAMERA") == 0) {
            View view = (View) ((CatchingFishFluxPicasso) catchingFishFluxFluxBundle.CatchingFishDaggerWebsocket).CatchingFishParcelableFAB();
            if (view == null) {
                view = mainActivity.getWindow().getDecorView();
                CatchingFishFirebaseDagger.CatchingFishRoomDatabase(view, "getDecorView(...)");
            }
            view.post(new CatchingFishMVPLayout(5, permissionRequest));
            return;
        }
        catchingFishFluxFluxBundle.CatchingFishWorkManager = permissionRequest;
        CatchingFishPayPalToast catchingFishPayPalToast = (CatchingFishPayPalToast) catchingFishFluxFluxBundle.CatchingFishViewModelScope;
        if (catchingFishPayPalToast != null) {
            catchingFishPayPalToast.CatchingFishFragmentHandler("android.permission.CAMERA");
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onProgressChanged(WebView webView, int i) {
        ((CatchingFishViewWidgetFAB) this.CatchingFishSnackbar.CatchingFishDaggerWebsocket).CatchingFishViewModelFAB(i);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onShowFileChooser(WebView webView, ValueCallback valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        CatchingFishPayPalToast catchingFishPayPalToast;
        CatchingFishBundleGlide catchingFishBundleGlide = this.CatchingFishViewModelScope;
        ValueCallback valueCallback2 = (ValueCallback) catchingFishBundleGlide.CatchingFishDaggerWebsocket;
        if (valueCallback2 != null) {
            valueCallback2.onReceiveValue(null);
        }
        catchingFishBundleGlide.CatchingFishDaggerWebsocket = valueCallback;
        if (fileChooserParams == null) {
            return true;
        }
        try {
            Intent createIntent = fileChooserParams.createIntent();
            if (createIntent == null || (catchingFishPayPalToast = (CatchingFishPayPalToast) catchingFishBundleGlide.CatchingFishWorkManager) == null) {
                return true;
            }
            catchingFishPayPalToast.CatchingFishFragmentHandler(createIntent);
            return true;
        } catch (ActivityNotFoundException unused) {
            ValueCallback valueCallback3 = (ValueCallback) catchingFishBundleGlide.CatchingFishDaggerWebsocket;
            if (valueCallback3 != null) {
                valueCallback3.onReceiveValue(null);
            }
            catchingFishBundleGlide.CatchingFishDaggerWebsocket = null;
            return false;
        }
    }
}
