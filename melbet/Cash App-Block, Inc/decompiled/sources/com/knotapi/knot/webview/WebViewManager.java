package com.knotapi.knot.webview;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.knotapi.knot.interfaces.MerchantViewListener;
import com.knotapi.knot.interfaces.MerchantWebViewDelegate;
import com.knotapi.knot.models.Bot;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public class WebViewManager {
    private static final String TAG = "WebViewManager";
    private final Context context;
    private final Map<String, KnotView> webViewMap = new HashMap();

    public interface WebViewCreationCallback {
        void onWebViewCreated(KnotView knotView);
    }

    public WebViewManager(Context context) {
        this.context = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$createWebView$0(Bot bot, MerchantWebViewDelegate merchantWebViewDelegate, MerchantViewListener merchantViewListener, String str, WebViewCreationCallback webViewCreationCallback) {
        KnotView knotView = new KnotView(this.context);
        knotView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        setupWebView(knotView, bot, merchantWebViewDelegate, merchantViewListener);
        this.webViewMap.put(str, knotView);
        if (webViewCreationCallback != null) {
            try {
                webViewCreationCallback.onWebViewCreated(knotView);
            } catch (Exception unused) {
            }
        }
    }

    private void setupWebView(KnotView knotView, Bot bot, MerchantWebViewDelegate merchantWebViewDelegate, MerchantViewListener merchantViewListener) {
        knotView.init((Activity) this.context, merchantViewListener).setBot(bot).setDefaultSettings().start();
        PopupChromeClient popupChromeClient = PopupChromeClient.getInstance();
        popupChromeClient.init((FragmentActivity) this.context, knotView, merchantWebViewDelegate, bot);
        knotView.setWebChromeClient(popupChromeClient);
    }

    public void createWebView(String str, Bot bot, MerchantWebViewDelegate merchantWebViewDelegate, MerchantViewListener merchantViewListener, WebViewCreationCallback webViewCreationCallback) {
        if (str == null || str.isEmpty()) {
            a$$ExternalSyntheticBUOutline0.m$3("Tag cannot be null or empty");
        } else {
            new Handler(Looper.getMainLooper()).post(new WebViewManager$$ExternalSyntheticLambda0(this, bot, merchantWebViewDelegate, merchantViewListener, str, webViewCreationCallback, 0));
        }
    }

    public void destroyWebView(String str) {
        KnotView knotView;
        if (str == null || str.isEmpty() || (knotView = this.webViewMap.get(str)) == null) {
            return;
        }
        knotView.destroy();
        this.webViewMap.remove(str);
    }

    public KnotView getWebView(String str) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        return this.webViewMap.get(str);
    }
}
