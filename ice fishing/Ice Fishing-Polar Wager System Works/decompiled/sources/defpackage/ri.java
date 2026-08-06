package defpackage;

/* loaded from: classes.dex */
public abstract class ri {
    public static void AARZUJiTa(android.view.contentcapture.ContentCaptureSession contentCaptureSession, android.view.autofill.AutofillId autofillId, long[] jArr) {
        contentCaptureSession.notifyViewsDisappeared(autofillId, jArr);
    }

    public static android.graphics.Insets EXtogiMhuM(int i, int i2, int i3, int i4) {
        return android.graphics.Insets.of(i, i2, i3, i4);
    }

    public static void F7NU4MC0GW(android.view.contentcapture.ContentCaptureSession contentCaptureSession, android.view.ViewStructure viewStructure) {
        contentCaptureSession.notifyViewAppeared(viewStructure);
    }

    public static android.view.contentcapture.ContentCaptureSession IHQe1A4L2xu(android.view.View view) {
        return view.getContentCaptureSession();
    }

    public static void adDC3e2L(android.view.contentcapture.ContentCaptureSession contentCaptureSession, android.view.autofill.AutofillId autofillId) {
        contentCaptureSession.notifyViewDisappeared(autofillId);
    }

    public static android.view.autofill.AutofillId oh6vYeIP(android.view.contentcapture.ContentCaptureSession contentCaptureSession, android.view.autofill.AutofillId autofillId, long j) {
        return contentCaptureSession.newAutofillId(autofillId, j);
    }

    public static android.view.ViewStructure r1MBDhnF(android.view.contentcapture.ContentCaptureSession contentCaptureSession, android.view.autofill.AutofillId autofillId, long j) {
        return contentCaptureSession.newVirtualViewStructure(autofillId, j);
    }

    public static final void riuEU0zW4(android.app.Activity activity, ux0.IHQe1A4L2xu iHQe1A4L2xu) {
        activity.registerActivityLifecycleCallbacks(iHQe1A4L2xu);
    }

    public static void xiZrDbcSW0(android.view.contentcapture.ContentCaptureSession contentCaptureSession, android.view.autofill.AutofillId autofillId, java.lang.String str) {
        contentCaptureSession.notifyViewTextChanged(autofillId, str);
    }
}
