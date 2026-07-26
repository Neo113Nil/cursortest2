package android.content.Context;

import android.app.Activity;
import android.app.Notification;
import android.content.Context.FrostHunterTransitionListenerShadowVisionNovaX9521;
import android.graphics.Insets;
import android.view.View;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public abstract class FrostHunterRemoteConfigPulseLegendStorm6177 {
    public static void FrostHunterAlertDialogAuroraDelta3200(Notification.Builder builder, boolean z) {
        builder.setAllowSystemGeneratedContextualActions(z);
    }

    public static ContentCaptureSession FrostHunterAlphaAnimationNeoCosmos5761(View view) {
        return view.getContentCaptureSession();
    }

    public static ViewStructure FrostHunterBundlePulseFusionHero2475(ContentCaptureSession contentCaptureSession, AutofillId autofillId, long j) {
        return contentCaptureSession.newVirtualViewStructure(autofillId, j);
    }

    public static Insets FrostHunterCameraXPixelTurboCosmos9814(int i, int i2, int i3, int i4) {
        return Insets.of(i, i2, i3, i4);
    }

    public static AutofillId FrostHunterConstraintSetCloneMasterUltraRogue2633(ContentCaptureSession contentCaptureSession, AutofillId autofillId, long j) {
        return contentCaptureSession.newAutofillId(autofillId, j);
    }

    public static final void FrostHunterFlowMaxDragonHero5809(Activity activity, FrostHunterTransitionListenerShadowVisionNovaX9521.FrostHunterTransitionManagerOmegaNeoMaster3754 frostHunterTransitionManagerOmegaNeoMaster3754) {
        activity.registerActivityLifecycleCallbacks(frostHunterTransitionManagerOmegaNeoMaster3754);
    }

    public static void FrostHunterFragmentBetaMegaVortex6025(Notification.Action.Builder builder) {
        builder.setContextual(false);
    }

    public static void FrostHunterKeyframeGammaGamma1197(Notification.Builder builder) {
        builder.setBubbleMetadata(null);
    }

    public static void FrostHunterLevelListDrawableFusionDragonHero2232(ContentCaptureSession contentCaptureSession, AutofillId autofillId, String str) {
        contentCaptureSession.notifyViewTextChanged(autofillId, str);
    }

    public static void FrostHunterLifecycleBlazeGammaElite2889(ContentCaptureSession contentCaptureSession, AutofillId autofillId) {
        contentCaptureSession.notifyViewDisappeared(autofillId);
    }

    public static void FrostHunterRemoteConfigSpeedSpeed8566(ContentCaptureSession contentCaptureSession, AutofillId autofillId, long[] jArr) {
        contentCaptureSession.notifyViewsDisappeared(autofillId, jArr);
    }

    public static void FrostHunterServiceEliteCelestialThunder1757(ContentCaptureSession contentCaptureSession, ViewStructure viewStructure) {
        contentCaptureSession.notifyViewAppeared(viewStructure);
    }
}
