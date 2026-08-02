package com.fillr.browsersdk.model;

import android.app.Activity;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.webkit.JavascriptInterface;
import androidx.camera.core.FocusMeteringAction;
import androidx.core.os.CancellationSignal;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.caverock.androidsvg.SVG;
import com.fillr.browsersdk.Fillr;
import com.fillr.browsersdk.analytics.FillrAnalyticsEvents;
import com.fillr.browsersdk.apiclient.FillrMappingServiceClient;
import com.google.android.filament.Box;
import com.google.android.gms.internal.time.zzbq;
import com.google.android.gms.tasks.zzb;
import java.lang.ref.WeakReference;
import java.net.URL;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class JSNativeInterface {
    public final AutofillPrompt mPrompt;

    public JSNativeInterface(AutofillPrompt autofillPrompt) {
        this.mPrompt = autofillPrompt;
    }

    @JavascriptInterface
    public void activeElement(String str) {
        this.mPrompt.getClass();
    }

    @JavascriptInterface
    public void checkFields(String str) {
        this.mPrompt.getClass();
    }

    @JavascriptInterface
    public void fieldBlurred(String str) {
        this.mPrompt.getClass();
    }

    @JavascriptInterface
    public void fieldFocussed(String str, String str2) {
        new Handler(Looper.getMainLooper()).post(new Fillr.AnonymousClass2(this, str, str2, false, 5));
    }

    @JavascriptInterface
    public void formMutation(String str) {
        AutofillPrompt autofillPrompt = this.mPrompt;
        autofillPrompt.getClass();
        try {
            JSONObject jSONObject = new JSONObject(str);
            String replaceAll = !jSONObject.has("view_id") ? null : jSONObject.getString("view_id").replaceAll("[^0-9a-fA-F\\-]", "");
            Activity activity = autofillPrompt.mFillr.parentActivity;
            if (activity != null) {
                activity.runOnUiThread(new AutofillPrompt$$ExternalSyntheticLambda0(autofillPrompt, replaceAll, 0));
            }
        } catch (JSONException unused) {
            SVG svg = Fillr.getInstance().fillrConfig;
        }
    }

    @JavascriptInterface
    public void getCookie(String str, String str2) {
        AutofillPrompt autofillPrompt = this.mPrompt;
        autofillPrompt.getClass();
        try {
            FillrWebView fillrWebView = (FillrWebView) autofillPrompt.viewCache.get(this);
            String cookieValue = zzb.getInstance().getCookieValue(str, new URL(str2));
            if (cookieValue == null || fillrWebView == null) {
                return;
            }
            String str3 = str + "=" + cookieValue + "; path=/; max-age=14400";
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(str3);
            fillrWebView.loadJavascript("PopWidgetInterface.addCookie(" + jSONArray.toString() + ");");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x0052 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @JavascriptInterface
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void pageEvent(String str, String str2, String str3, String str4) {
        JSONObject jSONObject;
        View view;
        FillrCachedMapping fillrCachedMapping;
        AutofillPrompt autofillPrompt = this.mPrompt;
        autofillPrompt.getClass();
        Fillr fillr = Fillr.getInstance();
        if (fillr != null) {
            JSONObject jSONObject2 = null;
            try {
                jSONObject = new JSONObject(str4);
            } catch (JSONException unused) {
                jSONObject = null;
            }
            if (str2 != null) {
                FillrWidgetPageEvent fillrWidgetPageEvent = FillrWidgetPageEvent.LOAD;
                if (str2.startsWith("page-")) {
                    str2 = str2.replace("page-", "");
                }
            }
            FillrWidgetPageEvent fillrWidgetPageEvent2 = (FillrWidgetPageEvent) FillrWidgetPageEvent.VALUES.get(str2);
            FillrWebView fillrWebView = (FillrWebView) autofillPrompt.viewCache.get(this);
            if (fillrWebView != null) {
                WeakReference weakReference = fillrWebView.mWebView;
                if (weakReference.get() instanceof View) {
                    view = (View) weakReference.get();
                    if (str.contains("view_id")) {
                        try {
                            str = new JSONObject(str).getString("view_id");
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                    }
                    if (view != null || fillrWidgetPageEvent2 == null) {
                    }
                    if ((fillrWidgetPageEvent2.jsonRequired && jSONObject == null) || TextUtils.isEmpty(str3)) {
                        return;
                    }
                    FillrWidgetPageEvent fillrWidgetPageEvent3 = FillrWidgetPageEvent.CLICK;
                    if (fillrWidgetPageEvent2 == fillrWidgetPageEvent3 && (fillrCachedMapping = (FillrCachedMapping) autofillPrompt.lastNotifiedMapping.get(str)) != null) {
                        int i = fillrCachedMapping.numRefills - 1;
                        fillrCachedMapping.numRefills = i;
                        if (i < 0) {
                            fillrCachedMapping.numRefills = 0;
                        }
                    }
                    if (fillr.mEmbeddedBrowser != 3) {
                        return;
                    }
                    if (fillrWidgetPageEvent2 == fillrWidgetPageEvent3) {
                        autofillPrompt.clickCache.put(view, str4);
                        return;
                    }
                    try {
                        if (fillrWidgetPageEvent2 == FillrWidgetPageEvent.LOAD) {
                            autofillPrompt.urlCache.put(view, str3);
                        }
                        FocusMeteringAction focusMeteringAction = new FocusMeteringAction(str3);
                        focusMeteringAction.mMeteringPointsAe = fillrWidgetPageEvent2;
                        try {
                            jSONObject2 = new JSONObject(str4);
                        } catch (JSONException unused2) {
                        }
                        focusMeteringAction.mMeteringPointsAwb = jSONObject2;
                        JSONObject buildJson = focusMeteringAction.buildJson();
                        if (buildJson != null) {
                            autofillPrompt.dispatchPageEvent(buildJson);
                            return;
                        }
                        return;
                    } catch (Exception e2) {
                        e2.printStackTrace();
                        return;
                    }
                }
            }
            view = null;
            if (str.contains("view_id")) {
            }
            if (view != null) {
            }
        }
    }

    @JavascriptInterface
    public void setFields(String str) {
        AutofillPrompt autofillPrompt = this.mPrompt;
        autofillPrompt.getClass();
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("view_id")) {
                FillrWebView webViewForId = autofillPrompt.mWebViewMapper.getWebViewForId(!jSONObject.has("view_id") ? null : jSONObject.getString("view_id").replaceAll("[^0-9a-fA-F\\-]", ""));
                Fillr fillr = autofillPrompt.mFillr;
                Activity activity = fillr.parentActivity;
                if (activity != null) {
                    activity.runOnUiThread(new Fillr.AnonymousClass2(fillr, str, webViewForId, false, 0));
                    return;
                }
                return;
            }
            Fillr fillr2 = autofillPrompt.mFillr;
            FillrWebView fillrWebView = fillr2.mWebView;
            Activity activity2 = fillr2.parentActivity;
            if (activity2 != null) {
                activity2.runOnUiThread(new Fillr.AnonymousClass2(fillr2, str, fillrWebView, false, 0));
            }
        } catch (Exception unused) {
            SVG svg = Fillr.getInstance().fillrConfig;
        }
    }

    @JavascriptInterface
    public void setFillResult(String str) {
        this.mPrompt.mFillr.trackEvent(FillrAnalyticsEvents.FillrFillResult, str);
    }

    @JavascriptInterface
    public void setValues(String str, String str2) {
        AutofillPrompt autofillPrompt = this.mPrompt;
        autofillPrompt.getClass();
        SVG svg = Fillr.getInstance().fillrConfig;
        Fillr fillr = autofillPrompt.mFillr;
        if (fillr.mFillMode == 2 && fillr.mCaptureValueListener == null) {
            return;
        }
        Fillr fillr2 = autofillPrompt.mFillr;
        FillrMappingServiceClient fillrMappingServiceClient = new FillrMappingServiceClient(fillr2);
        boolean z = autofillPrompt.isNewPage;
        if (FillrMappingServiceClient.captureDialogManager == null) {
            CancellationSignal cancellationSignal = new CancellationSignal();
            cancellationSignal.mIsCanceled = false;
            cancellationSignal.mCancelInProgress = false;
            cancellationSignal.mOnCancelListener = fillr2;
            if (fillr2 != null) {
                LocalBroadcastManager.getInstance(fillr2.parentActivity).registerReceiver(new zzbq(cancellationSignal, 6), new IntentFilter("com.fillr.service.CaptureFieldsMappingService.SensitiveData"));
            }
            FillrMappingServiceClient.captureDialogManager = cancellationSignal;
        }
        if (fillrMappingServiceClient.delayCaptureValuesMappingRequestService) {
            return;
        }
        try {
            fillrMappingServiceClient.delayCaptureValuesMappingRequestService = true;
            Box intentBuilder = fillrMappingServiceClient.mFillr.getIntentBuilder();
            Intent intent = new Intent("com.fillr.service.CaptureFieldsMappingService");
            intent.setPackage((String) intentBuilder.mCenter);
            intent.putExtra("receiver", new FillrMappingServiceClient.AnonymousClass1(fillrMappingServiceClient, new Handler(), 0));
            intent.putExtra("com.fillr.jsonfields", str);
            intent.putExtra("com.fillr.jsonvalues", str2);
            intent.putExtra("com.fillr.isnewpage", z);
            intent.putExtra("com.fillr.autofillwidgetsource", ((FillrWidget) fillrMappingServiceClient.mFillr.getWidgetManager().iv).mWidgetSource);
            intent.putExtra("com.fillr.cartscraperwidgetsource", ((FillrWidget) fillrMappingServiceClient.mFillr.getWidgetManager().cipherText).mWidgetSource);
            intentBuilder.setIntentExtras(intent);
            fillrMappingServiceClient.startFillrService(intent);
            new Handler().postDelayed(new FillrMappingServiceClient.AnonymousClass2(fillrMappingServiceClient, 0), 2000L);
            autofillPrompt.isNewPage = false;
        } catch (Exception e) {
            e.getMessage();
            SVG svg2 = Fillr.getInstance().fillrConfig;
        }
    }

    @JavascriptInterface
    public void setWidgetVersion(String str) {
        this.mPrompt.getClass();
        FillrWidgetVersion.mobileWidgetVersion = str;
    }

    @JavascriptInterface
    public void storeCookie(String str, String str2, String str3) {
        this.mPrompt.getClass();
    }

    @JavascriptInterface
    public void fieldFocussed(String str) {
        this.mPrompt.getClass();
    }
}
