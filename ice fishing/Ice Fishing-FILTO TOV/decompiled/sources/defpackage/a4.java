package defpackage;

import android.app.Activity;
import android.graphics.Insets;
import android.view.View;
import android.view.ViewStructure;
import android.view.accessibility.AccessibilityManager;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;
import defpackage.as0;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public abstract class a4 {
    public static void AvO7iQsrTN(ContentCaptureSession contentCaptureSession, AutofillId autofillId, String str) {
        contentCaptureSession.notifyViewTextChanged(autofillId, str);
    }

    public static void EljAMC1QTz(ContentCaptureSession contentCaptureSession, AutofillId autofillId) {
        contentCaptureSession.notifyViewDisappeared(autofillId);
    }

    public static ContentCaptureSession GWasM1elztuh(View view) {
        return view.getContentCaptureSession();
    }

    public static final void JFJ3QoxA(Activity activity, as0.GWasM1elztuh gWasM1elztuh) {
        activity.registerActivityLifecycleCallbacks(gWasM1elztuh);
    }

    public static void OOA6hdeuvCS(ContentCaptureSession contentCaptureSession, ViewStructure viewStructure) {
        contentCaptureSession.notifyViewAppeared(viewStructure);
    }

    public static AutofillId X1lG3V04pd(ContentCaptureSession contentCaptureSession, AutofillId autofillId, long j) {
        return contentCaptureSession.newAutofillId(autofillId, j);
    }

    public static int Yi7zF1RB1(AccessibilityManager accessibilityManager, int i, int i2) {
        return accessibilityManager.getRecommendedTimeoutMillis(i, i2);
    }

    public static void encWxUiV2(ContentCaptureSession contentCaptureSession, AutofillId autofillId, long[] jArr) {
        contentCaptureSession.notifyViewsDisappeared(autofillId, jArr);
    }

    public static Insets mOu10nynGul(int i, int i2, int i3, int i4) {
        return Insets.of(i, i2, i3, i4);
    }

    public static ViewStructure xqGvceK5x(ContentCaptureSession contentCaptureSession, AutofillId autofillId, long j) {
        return contentCaptureSession.newVirtualViewStructure(autofillId, j);
    }
}
