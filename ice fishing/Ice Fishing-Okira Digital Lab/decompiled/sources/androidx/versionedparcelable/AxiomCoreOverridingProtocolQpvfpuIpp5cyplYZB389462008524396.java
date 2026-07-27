package androidx.versionedparcelable;

import android.app.Activity;
import android.app.Notification;
import android.graphics.Insets;
import android.view.View;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;
import androidx.versionedparcelable.TitanCloudMultithreadingReducerIBlwY1UGiK0UMpUn3957940387109102;

/* compiled from: r8-map-id-30b448d4aea92b7ca08aa98ecb87d6bc49bf391f2fd37f06e0a9b205a292647a */
/* loaded from: classes.dex */
public abstract class AxiomCoreOverridingProtocolQpvfpuIpp5cyplYZB389462008524396 {
    public static ViewStructure ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495(ContentCaptureSession contentCaptureSession, AutofillId autofillId, long j) {
        return contentCaptureSession.newVirtualViewStructure(autofillId, j);
    }

    public static AutofillId AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365(ContentCaptureSession contentCaptureSession, AutofillId autofillId, long j) {
        return contentCaptureSession.newAutofillId(autofillId, j);
    }

    public static Insets BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818(int i, int i2, int i3, int i4) {
        return Insets.of(i, i2, i3, i4);
    }

    public static void LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119(ContentCaptureSession contentCaptureSession, AutofillId autofillId) {
        contentCaptureSession.notifyViewDisappeared(autofillId);
    }

    public static void NovaLayerAlgorithmBinaryTreeGxb6K7UbuUZYJfSwmB11271590397480(Notification.Builder builder, boolean z) {
        builder.setAllowSystemGeneratedContextualActions(z);
    }

    public static ContentCaptureSession ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800(View view) {
        return view.getContentCaptureSession();
    }

    public static void ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB68147360471050(Notification.Builder builder) {
        builder.setBubbleMetadata(null);
    }

    public static void RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867(ContentCaptureSession contentCaptureSession, ViewStructure viewStructure) {
        contentCaptureSession.notifyViewAppeared(viewStructure);
    }

    public static void TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333(ContentCaptureSession contentCaptureSession, AutofillId autofillId, long[] jArr) {
        contentCaptureSession.notifyViewsDisappeared(autofillId, jArr);
    }

    public static final void UltraBufferProtocolShimPREYZ8knP0yoZyOmOf89330452059339(Activity activity, TitanCloudMultithreadingReducerIBlwY1UGiK0UMpUn3957940387109102.ObsidianEngineConcurrencyDispatcherRF9TTT2i8X3iod9rec98500235388015 obsidianEngineConcurrencyDispatcherRF9TTT2i8X3iod9rec98500235388015) {
        activity.registerActivityLifecycleCallbacks(obsidianEngineConcurrencyDispatcherRF9TTT2i8X3iod9rec98500235388015);
    }

    public static void YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170(ContentCaptureSession contentCaptureSession, AutofillId autofillId, String str) {
        contentCaptureSession.notifyViewTextChanged(autofillId, str);
    }

    public static void ZenithPathAsyncProxyYsuqZe7hEIApTFZo9S80308228701111(Notification.Action.Builder builder) {
        builder.setContextual(false);
    }
}
