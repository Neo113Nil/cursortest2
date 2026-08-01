package com.google.android.datatransport;

import android.app.Activity;
import android.app.Notification;
import android.graphics.Insets;
import android.view.View;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;
import com.google.android.datatransport.WinterFlowControllerNode;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public abstract class WinterFlowBackendSubsystem {
    public static void WinterFlowArrayNetwork(ContentCaptureSession contentCaptureSession, ViewStructure viewStructure) {
        contentCaptureSession.notifyViewAppeared(viewStructure);
    }

    public static ViewStructure WinterFlowCacheManagerAgent(ContentCaptureSession contentCaptureSession, AutofillId autofillId, long j) {
        return contentCaptureSession.newVirtualViewStructure(autofillId, j);
    }

    public static AutofillId WinterFlowHookDataSource(ContentCaptureSession contentCaptureSession, AutofillId autofillId, long j) {
        return contentCaptureSession.newAutofillId(autofillId, j);
    }

    public static void WinterFlowResponseEngine(Notification.Builder builder, boolean z) {
        builder.setAllowSystemGeneratedContextualActions(z);
    }

    public static Insets WinterFlowRouterRouter(int i, int i2, int i3, int i4) {
        return Insets.of(i, i2, i3, i4);
    }

    public static ContentCaptureSession WinterFlowRouterStructure(View view) {
        return view.getContentCaptureSession();
    }

    public static void WinterFlowServerProtocol(Notification.Action.Builder builder) {
        builder.setContextual(false);
    }

    public static final void WinterFlowSyntax(Activity activity, WinterFlowControllerNode.WinterFlowSyntaxEvent winterFlowSyntaxEvent) {
        activity.registerActivityLifecycleCallbacks(winterFlowSyntaxEvent);
    }

    public static void WinterFlowTransactionAgent(Notification.Builder builder) {
        builder.setBubbleMetadata(null);
    }

    public static void WinterFlowTransactionManagerStrategy(ContentCaptureSession contentCaptureSession, AutofillId autofillId, String str) {
        contentCaptureSession.notifyViewTextChanged(autofillId, str);
    }

    public static void WinterFlowUnitTestResponse(ContentCaptureSession contentCaptureSession, AutofillId autofillId, long[] jArr) {
        contentCaptureSession.notifyViewsDisappeared(autofillId, jArr);
    }

    public static void WinterFlowVariableVersionControl(ContentCaptureSession contentCaptureSession, AutofillId autofillId) {
        contentCaptureSession.notifyViewDisappeared(autofillId);
    }
}
