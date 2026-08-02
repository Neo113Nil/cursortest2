package com.knotapi.knot.webview;

import android.os.Handler;
import android.os.Looper;
import android.webkit.JavascriptInterface;
import com.knotapi.knot.interfaces.MerchantWebViewDelegate;
import com.knotapi.knot.services.Reporter;
import com.knotapi.knot.services.SentryClient$$ExternalSyntheticLambda0;
import com.knotapi.knot.utilities.BreadcrumbHelper;
import com.knotapi.knot.utilities.Helper;
import com.knotapi.knot.utilities.ScreenshotHelper;
import java.io.PrintStream;
import org.json.JSONObject;
import sqip.internal.CardEntryActivityController$$ExternalSyntheticLambda1;

/* loaded from: classes4.dex */
public class JSInterfaceObject {
    public static final String TAG = "Knot:JSInterfaceObject";
    KnotView knotView;
    MerchantWebViewDelegate merchantWebViewDelegate;
    String onElementMessage = "";

    public JSInterfaceObject(KnotView knotView, MerchantWebViewDelegate merchantWebViewDelegate) {
        this.knotView = knotView;
        this.merchantWebViewDelegate = merchantWebViewDelegate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$addBreadcrumb$13(String str, String str2) {
        try {
            Reporter.addBreadcrumb(str, str2);
        } catch (Exception e) {
            Reporter.error(e, "Failed to add breadcrumb from JS");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onCardSwitchError$1(String str) {
        this.knotView.getWebViewDelegate().setNeedTimeOutCall(false);
        try {
            JSONObject jSONObject = new JSONObject(str);
            String optString = jSONObject.optString("errorMessage");
            String optString2 = jSONObject.optString("screenshot");
            PrintStream printStream = System.out;
            printStream.println("onCardSwitchError event: " + optString);
            String str2 = "(function() {    window.dispatchEvent(       new CustomEvent(           \"mobileBotError\",            {                bubbles: true,                detail: {                    merchantId: " + this.knotView.getBot().getMerchantId() + ",                    botId: " + this.knotView.getBot().getBotId() + ",                    errorMessage: \"" + optString + "\",                    screenshot: \"" + optString2 + "\"                }            }       )   );})();";
            printStream.println("errorScript: ".concat(str2));
            this.knotView.getWebViewDelegate().evaluateJS(str2);
            this.knotView.clear();
            this.knotView.getWebViewDelegate().removeFragment(this.knotView.bot.getBotId(), false);
        } catch (Exception e) {
            Reporter.error(e, "onCardSwitchError");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onCardSwitchLoggedIn$3(String str) {
        try {
            if (Helper.isValidJson(str)) {
                if (new JSONObject(str).optBoolean("shouldStartTaskImmediately", false)) {
                    this.knotView.finalStep();
                }
            } else {
                KnotView knotView = this.knotView;
                if (!knotView.isLoggedIn && knotView.bot.getMerchantId() != 454) {
                    this.knotView.loginDone();
                    return;
                }
                this.knotView.finalStep();
            }
        } catch (Exception e) {
            Reporter.error(e, "onCardSwitchLoggedIn");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onCardSwitchNativeError$2(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            KnotViewClient viewClient = this.knotView.getViewClient();
            viewClient.showErrorPage(viewClient.getErrorViewWithMessage(jSONObject));
        } catch (Exception e) {
            Reporter.error(e, "onCardSwitchNativeError");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onCardSwitchSuccess$0() {
        this.knotView.getWebViewDelegate().setNeedTimeOutCall(false);
        PrintStream printStream = System.out;
        printStream.println("onSuccess event");
        String str = "(function() {    window.dispatchEvent(       new CustomEvent(           \"mobileBotSuccess\",            {                bubbles: true,                detail: {                    merchantId: " + this.knotView.getBot().getMerchantId() + ",                    botId: " + this.knotView.getBot().getBotId() + "                }            }       )   );})();";
        printStream.println("successScript: ".concat(str));
        this.knotView.getWebViewDelegate().evaluateJS(str);
        this.knotView.clearCookies();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onElementMessage$10(String str) {
        if (str.equalsIgnoreCase(BreadcrumbHelper.Category.ERROR) || str.equals("\"error\"")) {
            this.knotView.openLinkDialog(true);
        }
        if (!this.onElementMessage.equalsIgnoreCase(str) && str.equals("\"link\"")) {
            this.knotView.openLinkDialog(false);
        }
        this.onElementMessage = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onFullReverseLogin$7(String str) {
        if (str != null) {
            try {
                if (str.isEmpty()) {
                    return;
                }
                this.merchantWebViewDelegate.sendFullReverseLoginEvent(str);
            } catch (Exception e) {
                Reporter.error(e, "onFullReverseLogin");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onMerchantTracking$8(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            int merchantId = this.knotView.getBot().getMerchantId();
            int botId = this.knotView.getBot().getBotId();
            jSONObject.put("merchantId", merchantId);
            jSONObject.put("botId", botId);
            String optString = jSONObject.optString("eventType");
            KnotView knotView = this.knotView;
            this.knotView.getWebViewDelegate().sendNativeLogEvent(Integer.valueOf(this.knotView.bot.getBotId()), optString, jSONObject.toString(), knotView != null ? knotView.getUrl() : "");
        } catch (Exception e) {
            Reporter.error(e, "onMerchantTracking");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onSendWebappError$5() {
        BreadcrumbHelper.trackForMerchant(this.knotView.bot.getMerchantName(), this.knotView.bot.getMerchantId(), "Webpage not available error", BreadcrumbHelper.Category.ERROR);
        Reporter.error(new Exception("webpage not available screen"), this.knotView.bot.getMerchantName() + " => " + this.knotView.getUrl());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onStartLoading$4() {
        this.knotView.showLoader();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onStopLoading$6() {
        this.knotView.hideLoader();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onUpdateBackButtonBehavior$11(String str) {
        boolean z;
        try {
            z = new JSONObject(str).optBoolean("disableBack");
        } catch (Exception e) {
            Reporter.error(e, "onUpdateBackButtonBehavior");
            z = false;
        }
        this.knotView.merchantViewListener.toggleBackButton(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onUserActionRequired$12() {
        this.knotView.getWebViewDelegate().sendUserActionEvent(this.knotView.getBot().getBotId());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$postStorageMessage$16(String str) {
        JSONObject optJSONObject;
        try {
            JSONObject jSONObject = new JSONObject(str);
            String optString = jSONObject.optString("type");
            if ("complete_storage".equals(optString)) {
                this.knotView.updateStorageData(jSONObject.optJSONObject("localStorage"), jSONObject.optJSONObject("sessionStorage"));
                this.knotView.handleStorageUpdateAndSendWorkflowData();
            } else {
                if (!"storage_delta".equals(optString) || (optJSONObject = jSONObject.optJSONObject("change")) == null) {
                    return;
                }
                this.knotView.updateStorageDelta(optJSONObject.optString("storageType"), optJSONObject.optString("key"), optJSONObject.optString("operation"), optJSONObject.optString("value"));
                this.knotView.handleStorageUpdateAndSendWorkflowData();
            }
        } catch (Exception e) {
            Reporter.error(e, "Error in postStorageMessage");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$sendDataToWebApp$15(String str, String str2) {
        try {
            String interceptedValues = this.knotView.mExtraInfo.getInterceptedValues();
            if (interceptedValues == null || interceptedValues.isEmpty()) {
                interceptedValues = "{}";
            }
            JSONObject jSONObject = new JSONObject(interceptedValues);
            jSONObject.put(str2, new JSONObject(str));
            this.knotView.mExtraInfo.setInterceptedValues(jSONObject.toString());
        } catch (Exception e) {
            Reporter.error(e, "Failed to handle named JSON payload in sendDataToWebApp");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$storeBreadcrumb$14(String str, String str2, String str3) {
        try {
            Reporter.storeBreadcrumb(str, str2, str3);
        } catch (Exception e) {
            Reporter.error(e, "Failed to store breadcrumb from JS");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$userIsLoggedIn$9() {
        this.knotView.finalStep();
    }

    @JavascriptInterface
    public void addBreadcrumb(String str, String str2) {
        new Handler(Looper.getMainLooper()).post(new KnotView$$ExternalSyntheticLambda0(2, str, str2));
    }

    @JavascriptInterface
    public void domChanged(String str) {
        if (str == null || str.isEmpty()) {
            str = "{}";
        }
        KnotView knotView = this.knotView;
        ScreenshotHelper.startScreenshotFlow(knotView, knotView, str);
    }

    @JavascriptInterface
    public void onCardSwitchError(String str) {
        new Handler(Looper.getMainLooper()).post(new JSInterfaceObject$$ExternalSyntheticLambda0(this, str, 5));
    }

    @JavascriptInterface
    public void onCardSwitchLoggedIn(String str) {
        new Handler(Looper.getMainLooper()).post(new JSInterfaceObject$$ExternalSyntheticLambda0(this, str, 4));
    }

    @JavascriptInterface
    public void onCardSwitchNativeError(String str) {
        new Handler(Looper.getMainLooper()).post(new JSInterfaceObject$$ExternalSyntheticLambda0(this, str, 6));
    }

    @JavascriptInterface
    public void onCardSwitchSuccess() {
        new Handler(Looper.getMainLooper()).post(new JSInterfaceObject$$ExternalSyntheticLambda6(this, 4));
    }

    @JavascriptInterface
    public void onElementMessage(String str) {
        new Handler(Looper.getMainLooper()).post(new JSInterfaceObject$$ExternalSyntheticLambda0(this, str, 1));
    }

    @JavascriptInterface
    public void onFullReverseLogin(String str) {
        new Handler(Looper.getMainLooper()).post(new JSInterfaceObject$$ExternalSyntheticLambda0(this, str, 7));
    }

    @JavascriptInterface
    public void onMerchantTracking(String str) {
        new Handler(Looper.getMainLooper()).post(new JSInterfaceObject$$ExternalSyntheticLambda0(this, str, 0));
    }

    @JavascriptInterface
    public void onSendWebappError() {
        new Handler(Looper.getMainLooper()).post(new JSInterfaceObject$$ExternalSyntheticLambda6(this, 5));
    }

    @JavascriptInterface
    public void onStartLoading() {
        new Handler(Looper.getMainLooper()).post(new JSInterfaceObject$$ExternalSyntheticLambda6(this, 2));
    }

    @JavascriptInterface
    public void onStopLoading(String str) {
        new Handler(Looper.getMainLooper()).post(new JSInterfaceObject$$ExternalSyntheticLambda6(this, 3));
    }

    @JavascriptInterface
    public void onUpdateBackButtonBehavior(String str) {
        new Handler(Looper.getMainLooper()).post(new JSInterfaceObject$$ExternalSyntheticLambda0(this, str, 2));
    }

    @JavascriptInterface
    public void onUserActionRequired() {
        new Handler(Looper.getMainLooper()).post(new JSInterfaceObject$$ExternalSyntheticLambda6(this, 0));
    }

    @JavascriptInterface
    public void postStorageMessage(String str) {
        if (str == null || str.isEmpty()) {
            return;
        }
        new Handler(Looper.getMainLooper()).post(new JSInterfaceObject$$ExternalSyntheticLambda0(this, str, 3));
    }

    @JavascriptInterface
    public void sendDataToWebApp(String str, String str2) {
        new Handler(Looper.getMainLooper()).post(new CardEntryActivityController$$ExternalSyntheticLambda1(14, this, str, str2));
    }

    @JavascriptInterface
    public void storeBreadcrumb(String str, String str2, String str3) {
        new Handler(Looper.getMainLooper()).post(new SentryClient$$ExternalSyntheticLambda0(str, str2, str3, 1));
    }

    @JavascriptInterface
    public void userIsLoggedIn() {
        new Handler(Looper.getMainLooper()).post(new JSInterfaceObject$$ExternalSyntheticLambda6(this, 1));
    }
}
