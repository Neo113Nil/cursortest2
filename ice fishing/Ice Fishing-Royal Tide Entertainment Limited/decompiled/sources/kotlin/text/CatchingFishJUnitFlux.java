package kotlin.text;

import android.app.Activity;
import android.app.Notification;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Insets;
import android.view.View;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;
import kotlin.text.CatchingFishLifecycleOkHttp;

/* loaded from: classes.dex */
public abstract class CatchingFishJUnitFlux {
    public static final void CatchingFishCloudMessaging(Activity activity, CatchingFishLifecycleOkHttp.CatchingFishPagingLibrary catchingFishPagingLibrary) {
        activity.registerActivityLifecycleCallbacks(catchingFishPagingLibrary);
    }

    public static AutofillId CatchingFishCoroutine(ContentCaptureSession contentCaptureSession, AutofillId autofillId, long j) {
        return contentCaptureSession.newAutofillId(autofillId, j);
    }

    public static void CatchingFishDaggerWebsocket(ContentCaptureSession contentCaptureSession, ViewStructure viewStructure) {
        contentCaptureSession.notifyViewAppeared(viewStructure);
    }

    public static void CatchingFishEspressoTesting(Notification.Builder builder, boolean z) {
        builder.setAllowSystemGeneratedContextualActions(z);
    }

    public static void CatchingFishFragmentHandler(Resources.Theme theme) {
        theme.rebase();
    }

    public static Insets CatchingFishLayout(int i, int i2, int i3, int i4) {
        return Insets.of(i, i2, i3, i4);
    }

    public static void CatchingFishOkHttp(Notification.Builder builder) {
        builder.setBubbleMetadata(null);
    }

    public static ContentCaptureSession CatchingFishParcelableFAB(View view) {
        return view.getContentCaptureSession();
    }

    public static ViewStructure CatchingFishReduxKtor(ContentCaptureSession contentCaptureSession, AutofillId autofillId, long j) {
        return contentCaptureSession.newVirtualViewStructure(autofillId, j);
    }

    public static String CatchingFishSnackbar(Context context) {
        return context.getOpPackageName();
    }

    public static void CatchingFishUnitTesting(Notification.Action.Builder builder) {
        builder.setContextual(false);
    }

    public static void CatchingFishViewModelFAB(ContentCaptureSession contentCaptureSession, AutofillId autofillId, long[] jArr) {
        contentCaptureSession.notifyViewsDisappeared(autofillId, jArr);
    }

    public static void CatchingFishViewModelScope(ContentCaptureSession contentCaptureSession, AutofillId autofillId, String str) {
        contentCaptureSession.notifyViewTextChanged(autofillId, str);
    }

    public static void CatchingFishWorkManager(ContentCaptureSession contentCaptureSession, AutofillId autofillId) {
        contentCaptureSession.notifyViewDisappeared(autofillId);
    }
}
