package com.knotapi.knot.utilities;

import android.webkit.WebView;
import com.knotapi.knot.models.Bot;
import com.knotapi.knot.models.MerchantWebViewData;
import com.knotapi.knot.services.Reporter;
import com.knotapi.knot.webview.KnotView;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class WebViewDataProcessor {
    private static final String TAG = "WebViewDataProcessor";

    public interface DataProcessingCallback {
        void onDataProcessed(MerchantWebViewData merchantWebViewData);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$processStorageDataAsync$0(MerchantWebViewData.Builder builder, DataProcessingCallback dataProcessingCallback, String str) {
        String str2;
        String str3;
        String str4 = "{}";
        if (str != null) {
            try {
            } catch (Exception e) {
                e = e;
                str2 = "{}";
            }
            if (!str.equals("null") && !str.equals("undefined")) {
                JSONObject jSONObject = new JSONObject(str);
                str2 = jSONObject.optString("l", "{}");
                try {
                    str4 = jSONObject.optString("s", "{}");
                } catch (Exception e2) {
                    e = e2;
                    Reporter.error(e, "WebViewDataProcessor processStorageDataAsync error occurred");
                    String str5 = str4;
                    str4 = str2;
                    str3 = str5;
                    builder.setLocalStorage(str4).setSessionStorage(str3);
                    dataProcessingCallback.onDataProcessed(builder.build());
                }
                String str52 = str4;
                str4 = str2;
                str3 = str52;
                builder.setLocalStorage(str4).setSessionStorage(str3);
                dataProcessingCallback.onDataProcessed(builder.build());
            }
        }
        str3 = "{}";
        builder.setLocalStorage(str4).setSessionStorage(str3);
        dataProcessingCallback.onDataProcessed(builder.build());
    }

    public static Map<String, String> processInteractionMetadata(String str) {
        if (str == null || str.isEmpty() || "{}".equals(str)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            HashMap hashMap = new HashMap();
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                hashMap.put(next, String.valueOf(jSONObject.get(next)));
            }
            return hashMap;
        } catch (JSONException unused) {
            return Collections.singletonMap("raw", str);
        }
    }

    private static void processStorageDataAsync(WebView webView, MerchantWebViewData.Builder builder, DataProcessingCallback dataProcessingCallback) {
        webView.evaluateJavascript(JsScripts.GET_LOCAL_SESSION_STORAGE, new SsoCookieHelper$1$$ExternalSyntheticLambda0(1, builder, dataProcessingCallback));
    }

    public static void processWebViewData(WebView webView, KnotView knotView, String str, String str2, String str3, String str4, DataProcessingCallback dataProcessingCallback) {
        Bot bot = knotView.bot;
        String url = (webView == null || webView.getUrl() == null) ? "" : webView.getUrl();
        MerchantWebViewData.Builder trigger = new MerchantWebViewData.Builder().setMessage(str).setScreenName(url).setCookies(Helper.formatCookiesForPuppeteer(knotView.getCookies())).setInteractionMap(processInteractionMetadata(str2)).setBotId(bot.getBotId()).setEventType(str3).setTrigger(str4);
        if (webView != null) {
            processStorageDataAsync(webView, trigger, dataProcessingCallback);
        } else {
            dataProcessingCallback.onDataProcessed(trigger.build());
        }
    }
}
