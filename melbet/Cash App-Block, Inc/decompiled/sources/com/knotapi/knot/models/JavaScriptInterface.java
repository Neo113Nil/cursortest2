package com.knotapi.knot.models;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.webkit.JavascriptInterface;
import com.knotapi.knot.Knot;
import com.knotapi.knot.interfaces.KnotEventDelegate;
import com.knotapi.knot.interfaces.MerchantClickDelegate;
import com.knotapi.knot.interfaces.MerchantWebViewDelegate;
import com.knotapi.knot.interfaces.WebAppLoadingListener;
import com.knotapi.knot.services.Reporter;
import com.knotapi.knot.ui.activities.KnotActivity;
import com.knotapi.knot.utilities.BreadcrumbHelper;
import com.knotapi.knot.utilities.Constants;
import com.knotapi.knot.webview.KnotView$$ExternalSyntheticLambda1;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class JavaScriptInterface {
    private static final String ERROR_CODE_KEY = "errorCode";
    private static final String ERROR_MESSAGE_KEY = "errorMessage";
    private static final String MERCHANT_KEY = "merchant";
    public static final String TAG = "Knot:JavaScriptInterface";
    Context context;
    Environment environment;
    Activity hostActivity;
    MerchantClickDelegate merchantClickDelegate;
    WebAppLoadingListener webAppLoadingListener;
    MerchantWebViewDelegate webViewDelegate;
    KnotEventDelegate knotEventDelegate = Knot.getInstance().getKnotEventDelegateListener();
    private volatile boolean isVaultApprovalDeeplinkOpening = false;

    public JavaScriptInterface(Environment environment, Context context, MerchantClickDelegate merchantClickDelegate, MerchantWebViewDelegate merchantWebViewDelegate, WebAppLoadingListener webAppLoadingListener, Activity activity) {
        this.context = context;
        this.environment = environment;
        this.merchantClickDelegate = merchantClickDelegate;
        this.webViewDelegate = merchantWebViewDelegate;
        this.webAppLoadingListener = webAppLoadingListener;
        this.hostActivity = activity;
    }

    private void handleException(Exception exc, String str) {
        Reporter.error(exc, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onCloseMerchantWebView$0(String str) {
        try {
            this.webViewDelegate.removeFragment(new JSONObject(str).optInt("merchantId"), false);
        } catch (Exception e) {
            handleException(e, "onCloseWebView");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onVaultApproval$2(String str) {
        try {
            try {
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
                intent.setFlags(268435456);
                this.context.startActivity(intent);
                Knot.close();
            } catch (ActivityNotFoundException unused) {
                handleException(new IllegalArgumentException("No activity found to handle deeplink: " + str), "onVaultApproval");
            } catch (Exception e) {
                handleException(e, "onVaultApproval");
            }
        } finally {
            this.isVaultApprovalDeeplinkOpening = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$startTask$1() {
        ((KnotActivity) this.hostActivity).triggerFinalStepOnActiveMerchantWebView();
    }

    @JavascriptInterface
    public void nativeRequestResponse(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            String optString = jSONObject.optString("filename");
            String optString2 = jSONObject.optString("script");
            if (optString.isEmpty() || optString2.isEmpty()) {
                return;
            }
            Activity activity = this.hostActivity;
            if (activity instanceof KnotActivity) {
                ((KnotActivity) activity).cacheDynamicAsset(optString, optString2);
            }
        } catch (Exception e) {
            handleException(e, "nativeRequestResponse");
        }
    }

    @JavascriptInterface
    public void onClose() {
        try {
            KnotEventDelegate knotEventDelegate = this.knotEventDelegate;
            if (knotEventDelegate != null) {
                knotEventDelegate.onExit();
            }
            BreadcrumbHelper.trackSession("OnClose event", BreadcrumbHelper.Category.EVENT);
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.knotapi.knot.models.JavaScriptInterface.1
                @Override // java.lang.Runnable
                public void run() {
                    Context context = JavaScriptInterface.this.context;
                    if (context == null || !(context instanceof Activity) || ((Activity) context).isFinishing()) {
                        return;
                    }
                    ((Activity) JavaScriptInterface.this.context).finish();
                }
            });
        } catch (Exception e) {
            handleException(e, "onClose");
        }
    }

    @JavascriptInterface
    public void onCloseMerchantWebView(String str) {
        new Handler(Looper.getMainLooper()).post(new JavaScriptInterface$$ExternalSyntheticLambda0(this, str, 0));
    }

    @JavascriptInterface
    public void onError(String str) {
        try {
            this.webViewDelegate.setNeedTimeOutCall(false);
            JSONObject jSONObject = new JSONObject(str);
            if (this.knotEventDelegate != null && jSONObject.has(ERROR_CODE_KEY)) {
                KnotError map = KnotErrorMapper.map(str);
                BreadcrumbHelper.trackSession("Error event: " + jSONObject.optString(ERROR_CODE_KEY), BreadcrumbHelper.Category.EVENT);
                this.knotEventDelegate.onError(map);
            }
            final String string2 = jSONObject.getString(ERROR_MESSAGE_KEY);
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.knotapi.knot.models.JavaScriptInterface.2
                @Override // java.lang.Runnable
                public void run() {
                    JavaScriptInterface.this.webViewDelegate.sendNativeLogEvent(null, Constants.META_CONSOLE_ERROR, "onError: " + string2, "");
                }
            });
        } catch (Exception e) {
            handleException(e, "onError");
        }
    }

    @JavascriptInterface
    public void onEvent(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            jSONObject.put("environment", this.environment.name());
            BreadcrumbHelper.trackSession("OnEvent: " + str, BreadcrumbHelper.Category.EVENT);
            if (jSONObject.has("metaData")) {
                Object obj = jSONObject.get("metaData");
                if (obj instanceof String) {
                    jSONObject.put("metaData", new JSONObject((String) obj));
                }
            } else {
                jSONObject.put("metaData", new JSONObject());
            }
            KnotEvent fromJson = KnotEventMapper.fromJson(jSONObject);
            Reporter.addBreadcrumb("Event received: " + fromJson, BreadcrumbHelper.Category.EVENT);
            if (fromJson.getTaskId().isEmpty()) {
                KnotEventDelegate knotEventDelegate = this.knotEventDelegate;
                if (knotEventDelegate != null) {
                    knotEventDelegate.onEvent(fromJson);
                    return;
                }
                return;
            }
            if (fromJson.getEvent().equals(Constants.lastEventKey) && fromJson.getTaskId().equals(Constants.lastTaskId)) {
                return;
            }
            KnotEventDelegate knotEventDelegate2 = this.knotEventDelegate;
            if (knotEventDelegate2 != null) {
                knotEventDelegate2.onEvent(fromJson);
            }
            Constants.lastEventKey = fromJson.getEvent();
            Constants.lastTaskId = fromJson.getTaskId();
        } catch (Exception e) {
            handleException(e, "onEvent");
        }
    }

    @JavascriptInterface
    public void onExit() {
        try {
            BreadcrumbHelper.trackSession("onExit event", BreadcrumbHelper.Category.EVENT);
            KnotEventDelegate knotEventDelegate = this.knotEventDelegate;
            if (knotEventDelegate != null) {
                knotEventDelegate.onExit();
            }
            ((Activity) this.context).finish();
        } catch (Exception e) {
            handleException(e, "onExit");
        }
    }

    @JavascriptInterface
    public void onInitWebView(String str) {
        try {
            this.merchantClickDelegate.didMerchantClick(str);
        } catch (Exception e) {
            handleException(e, "onInitWebView");
        }
    }

    @JavascriptInterface
    public void onLoadingFinished(String str) {
        try {
            this.webAppLoadingListener.onLoadingFinished();
        } catch (Exception e) {
            handleException(e, "onLogEvent");
        }
    }

    @JavascriptInterface
    public void onReOpenMerchantWebView(String str) {
        try {
            this.merchantClickDelegate.attachMerchantWebView(str);
        } catch (Exception e) {
            handleException(e, "onReOpenMerchantWebView");
        }
    }

    @JavascriptInterface
    public void onStartHaptics(String str) {
        try {
            this.webAppLoadingListener.onStartHaptics();
        } catch (Exception e) {
            handleException(e, "onStartHaptics");
        }
    }

    @JavascriptInterface
    public void onSuccess(String str) {
        try {
            this.webViewDelegate.setNeedTimeOutCall(false);
            JSONObject jSONObject = new JSONObject(str);
            String string2 = jSONObject.has(MERCHANT_KEY) ? jSONObject.getString(MERCHANT_KEY) : "";
            if (this.knotEventDelegate == null || string2.equals(Constants.lastMerchant)) {
                return;
            }
            BreadcrumbHelper.trackSession("Success event: ".concat(string2), BreadcrumbHelper.Category.EVENT);
            this.knotEventDelegate.onSuccess(jSONObject.getString(MERCHANT_KEY));
            Constants.lastMerchant = string2;
        } catch (Exception e) {
            handleException(e, "onSuccess");
        }
    }

    @JavascriptInterface
    public void onVaultApproval(String str) {
        try {
            synchronized (this) {
                try {
                    if (this.isVaultApprovalDeeplinkOpening) {
                        return;
                    }
                    int i = 1;
                    this.isVaultApprovalDeeplinkOpening = true;
                    String optString = new JSONObject(str).optString("approvalURL");
                    if (optString != null && !optString.isEmpty()) {
                        new Handler(Looper.getMainLooper()).post(new JavaScriptInterface$$ExternalSyntheticLambda0(this, optString, i));
                        return;
                    }
                    this.isVaultApprovalDeeplinkOpening = false;
                    handleException(new IllegalArgumentException("approvalURL not found in eventProperties"), "onVaultApproval");
                } finally {
                }
            }
        } catch (Exception e) {
            this.isVaultApprovalDeeplinkOpening = false;
            handleException(e, "onVaultApproval");
        }
    }

    @JavascriptInterface
    public void sendLegalLinksToNative(String str) {
        if (str == null || str.isEmpty()) {
            handleException(new IllegalArgumentException("URL is null or empty"), "sendInfoToNativeRequest");
            return;
        }
        try {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
            intent.setFlags(268435456);
            this.context.startActivity(intent);
        } catch (Exception e) {
            handleException(e, "sendInfoToNativeRequest");
        }
    }

    @JavascriptInterface
    public void startTask() {
        try {
            if (this.hostActivity instanceof KnotActivity) {
                new Handler(Looper.getMainLooper()).post(new KnotView$$ExternalSyntheticLambda1(this, 14));
            }
        } catch (Exception e) {
            handleException(e, "Error in startTask");
        }
    }
}
