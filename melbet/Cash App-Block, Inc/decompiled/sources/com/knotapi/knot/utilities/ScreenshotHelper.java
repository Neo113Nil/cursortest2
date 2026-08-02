package com.knotapi.knot.utilities;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Handler;
import android.os.Looper;
import android.view.ViewTreeObserver;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import androidx.camera.view.PreviewView$1$$ExternalSyntheticLambda2;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.google.android.material.button.MaterialButton$$ExternalSyntheticLambda3;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.knotapi.knot.interfaces.ScreenshotCallback;
import com.knotapi.knot.models.MerchantWebViewData;
import com.knotapi.knot.services.Reporter;
import com.knotapi.knot.utilities.WebAppJSFetcher;
import com.knotapi.knot.webview.KnotView;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import sqip.internal.CardEntryActivityController$$ExternalSyntheticLambda1;

/* loaded from: classes4.dex */
public class ScreenshotHelper {
    private static final String TAG = "ScreenshotHelper";
    private static String blurScreenshotsJsCode;

    public static void captureAndMaskScreenshot(final WebView webView, final ScreenshotCallback screenshotCallback) {
        try {
            String str = blurScreenshotsJsCode;
            if (str == null || str.isEmpty()) {
                blurScreenshotsJsCode = JsScripts.blurScreenshotsJsCode;
            }
            webView.evaluateJavascript(blurScreenshotsJsCode, new ValueCallback<String>() { // from class: com.knotapi.knot.utilities.ScreenshotHelper.2
                @Override // android.webkit.ValueCallback
                public void onReceiveValue(String str2) {
                    try {
                        String trim = str2.trim();
                        if (trim.startsWith("\"") && trim.endsWith("\"")) {
                            trim = trim.substring(1, trim.length() - 1);
                        }
                        JSONObject jSONObject = new JSONObject(trim.replace("\\\"", "\""));
                        final JSONArray jSONArray = jSONObject.getJSONArray("positions");
                        final double d = jSONObject.getDouble("devicePixelRatio");
                        webView.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.knotapi.knot.utilities.ScreenshotHelper.2.1
                            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                            public void onGlobalLayout() {
                                webView.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                                try {
                                    int scrollX = webView.getScrollX();
                                    int scrollY = webView.getScrollY();
                                    Bitmap createBitmap = Bitmap.createBitmap(webView.getWidth(), webView.getHeight(), Bitmap.Config.ARGB_8888);
                                    Canvas canvas = new Canvas(createBitmap);
                                    webView.draw(canvas);
                                    Paint paint = new Paint();
                                    paint.setColor(-16777216);
                                    paint.setAlpha(255);
                                    int i = 0;
                                    while (i < jSONArray.length()) {
                                        JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                                        double d2 = jSONObject2.getDouble("left") * d;
                                        double d3 = jSONObject2.getDouble("top") * d;
                                        double d4 = jSONObject2.getDouble("width") * d;
                                        double d5 = jSONObject2.getDouble("height");
                                        int i2 = i;
                                        double d6 = d;
                                        double d7 = d5 * d6;
                                        float f = (float) (d2 - (scrollX * d6));
                                        float f2 = (float) (d3 - (scrollY * d6));
                                        canvas.drawRect(new RectF(f, f2, ((float) d4) + f, ((float) d7) + f2), paint);
                                        i = i2 + 1;
                                    }
                                    screenshotCallback.onScreenshotReady(Helper.encodeImage(createBitmap));
                                } catch (Exception unused) {
                                    screenshotCallback.onScreenshotReady("");
                                }
                            }
                        });
                        webView.requestLayout();
                    } catch (JSONException unused) {
                        screenshotCallback.onScreenshotReady("");
                    }
                }
            });
        } catch (Exception unused) {
            screenshotCallback.onScreenshotReady("");
        }
    }

    public static void fetchScreenshotJS(JsonObject jsonObject, WebAppJSFetcher webAppJSFetcher) {
        if (jsonObject == null || !jsonObject.has("blur_screenshots_js_path")) {
            blurScreenshotsJsCode = JsScripts.blurScreenshotsJsCode;
            return;
        }
        JsonElement jsonElement = jsonObject.get("blur_screenshots_js_path");
        if (jsonElement == null) {
            blurScreenshotsJsCode = JsScripts.blurScreenshotsJsCode;
            return;
        }
        String trim = jsonElement.toString().trim();
        if (trim.startsWith("\"") && trim.endsWith("\"")) {
            trim = Boxes$$ExternalSyntheticOutline1.m1148m(1, 1, trim);
        }
        try {
            JsonElement jsonElement2 = JsonParser.parseString(trim.replace("\\\"", "\"")).getAsJsonObject().get("blurScreenshotsJS");
            if (jsonElement2 == null || !jsonElement2.isJsonPrimitive()) {
                blurScreenshotsJsCode = JsScripts.blurScreenshotsJsCode;
            } else {
                webAppJSFetcher.fetchJS(jsonElement2.getAsString(), new WebAppJSFetcher.JSFetchCallback() { // from class: com.knotapi.knot.utilities.ScreenshotHelper.1
                    @Override // com.knotapi.knot.utilities.WebAppJSFetcher.JSFetchCallback
                    public void onFetchFailed(Exception exc) {
                        String unused = ScreenshotHelper.blurScreenshotsJsCode = JsScripts.blurScreenshotsJsCode;
                    }

                    @Override // com.knotapi.knot.utilities.WebAppJSFetcher.JSFetchCallback
                    public void onJSCodeFetched(String str) {
                        String unused = ScreenshotHelper.blurScreenshotsJsCode = str;
                    }
                });
            }
        } catch (Exception unused) {
            blurScreenshotsJsCode = JsScripts.blurScreenshotsJsCode;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$startScreenshotFlow$0(KnotView knotView, MerchantWebViewData merchantWebViewData) {
        knotView.getWebViewDelegate().sendNativeLogEvent(merchantWebViewData);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$startScreenshotFlow$1(WebView webView, KnotView knotView, String str, String str2) {
        WebViewDataProcessor.processWebViewData(webView, knotView, str2, str, Constants.META_SCREENSHOT, null, new MaterialButton$$ExternalSyntheticLambda3(knotView, 9));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$startScreenshotFlow$2(WebView webView, KnotView knotView, String str) {
        captureAndMaskScreenshot(webView, new PreviewView$1$$ExternalSyntheticLambda2(15, webView, knotView, str));
    }

    public static void startScreenshotFlow(WebView webView, KnotView knotView, String str) {
        try {
            new Handler(Looper.getMainLooper()).post(new CardEntryActivityController$$ExternalSyntheticLambda1(10, webView, knotView, str));
        } catch (Exception e) {
            Reporter.error(e, "ScreenshotHelper startScreenshotFlow error occurred");
        }
    }
}
