package com.knotapi.knot.utilities;

import android.os.Handler;
import android.os.Looper;
import androidx.camera.core.ImageCapture$$ExternalSyntheticLambda3;
import com.knotapi.knot.interfaces.MerchantWebViewDelegate;
import com.knotapi.knot.models.Bot;
import com.knotapi.knot.models.MerchantWebViewData;
import com.knotapi.knot.services.Reporter;
import com.knotapi.knot.webview.KnotView;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class WorkflowValidationHelper {
    private final KnotView knotView;
    private final AtomicBoolean isProcessing = new AtomicBoolean(false);
    public boolean isUserAuthed = false;
    private String lastContentHash = "";

    public WorkflowValidationHelper(KnotView knotView) {
        this.knotView = knotView;
    }

    private String generateContentHash(MerchantWebViewData merchantWebViewData) {
        try {
            return String.valueOf((merchantWebViewData.getLocalStorage() + merchantWebViewData.getSessionStorage() + merchantWebViewData.getCookies() + merchantWebViewData.getScreenName()).hashCode());
        } catch (Exception unused) {
            return String.valueOf(System.currentTimeMillis());
        }
    }

    private boolean isUnique(String str) {
        return !str.equals(this.lastContentHash);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$processStreamData$0(String str, JSONObject jSONObject, JSONObject jSONObject2) {
        try {
            try {
                MerchantWebViewData build = new MerchantWebViewData.Builder().setMessage("").setScreenName(this.knotView.getUrl()).setCookies(Helper.formatCookiesForPuppeteer(this.knotView.getCookies())).setBotId(this.knotView.bot.getBotId()).setEventType(Constants.META_VALIDATE_WORKFLOW).setTrigger(str).setLocalStorage(jSONObject != null ? jSONObject.toString() : "{}").setSessionStorage(jSONObject2 != null ? jSONObject2.toString() : "{}").setInteractionMap(null).build();
                String generateContentHash = generateContentHash(build);
                if (isUnique(generateContentHash)) {
                    this.lastContentHash = generateContentHash;
                    sendWorkflowValidationToWebApp(build);
                }
                this.isProcessing.set(false);
            } catch (Exception e) {
                Reporter.error(e, "Error in processStreamData runnable");
                this.isProcessing.set(false);
            }
        } catch (Throwable th) {
            this.isProcessing.set(false);
            throw th;
        }
    }

    private void sendWorkflowValidationToWebApp(MerchantWebViewData merchantWebViewData) {
        try {
            MerchantWebViewDelegate webViewDelegate = this.knotView.getWebViewDelegate();
            if (webViewDelegate != null) {
                webViewDelegate.sendWebMessageToWebApp(merchantWebViewData);
            }
        } catch (Exception e) {
            Reporter.error(e, "Error sending VALIDATE_WORKFLOW to WebApp");
        }
    }

    public void collectAndSendWorkflowData(String str) {
        KnotView knotView = this.knotView;
        if (knotView == null || knotView.getWebViewDelegate() == null || !this.isProcessing.compareAndSet(false, true)) {
            return;
        }
        Bot bot = this.knotView.bot;
        if (bot != null && bot.getDisableWorkflowValidation()) {
            this.isProcessing.set(false);
            return;
        }
        try {
            processStreamData(this.knotView.getCurrentLocalStorage(), this.knotView.getCurrentSessionStorage(), str);
        } catch (Exception e) {
            this.isProcessing.set(false);
            Reporter.error(e, "Error fetching storage data in collectAndSendWorkflowData");
        }
    }

    public void processStreamData(JSONObject jSONObject, JSONObject jSONObject2, String str) {
        new Handler(Looper.getMainLooper()).post(new ImageCapture$$ExternalSyntheticLambda3(this, str, jSONObject, jSONObject2, 6));
    }
}
