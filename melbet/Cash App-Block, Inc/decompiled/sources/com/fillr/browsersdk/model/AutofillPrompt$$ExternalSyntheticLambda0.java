package com.fillr.browsersdk.model;

import com.caverock.androidsvg.SVG;
import com.fillr.browsersdk.Fillr;
import com.fillr.browsersdk.analytics.FillrAnalyticsEvents;
import com.fillr.n1;
import com.google.mlkit.vision.text.internal.zzr;
import com.squareup.cash.fillr.real.RealFillrWebManager;
import com.squareup.util.coroutines.StateFlowKt;
import java.util.UUID;

/* loaded from: classes4.dex */
public final /* synthetic */ class AutofillPrompt$$ExternalSyntheticLambda0 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ AutofillPrompt f$0;
    public final /* synthetic */ String f$1;

    public /* synthetic */ AutofillPrompt$$ExternalSyntheticLambda0(AutofillPrompt autofillPrompt, String str, int i) {
        this.$r8$classId = i;
        this.f$0 = autofillPrompt;
        this.f$1 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$r8$classId;
        String str = this.f$1;
        AutofillPrompt autofillPrompt = this.f$0;
        switch (i) {
            case 0:
                autofillPrompt.getClass();
                try {
                    n1 n1Var = autofillPrompt.mWebViewMapper;
                    FillrWebView fillrWebView = (FillrWebView) n1Var.a.get(UUID.fromString(str));
                    if (fillrWebView != null) {
                        fillrWebView.loadJavascript("PopWidgetInterface.getFields();");
                        break;
                    }
                } catch (Exception unused) {
                    SVG svg = Fillr.getInstance().fillrConfig;
                    return;
                }
                break;
            default:
                autofillPrompt.fieldFocusedListenerFlag = false;
                Fillr fillr = autofillPrompt.mFillr;
                zzr zzrVar = fillr.formEventListener;
                if (zzrVar != null) {
                    StateFlowKt.emitOrThrow(((RealFillrWebManager) zzrVar.zza).currentFocusedField, str);
                    fillr.trackEvent(FillrAnalyticsEvents.FillrSDK_FIELD_FOCUSED, new String[0]);
                    break;
                }
                break;
        }
    }
}
