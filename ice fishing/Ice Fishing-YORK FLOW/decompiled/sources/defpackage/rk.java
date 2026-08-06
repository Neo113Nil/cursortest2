package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public abstract class rk {
    public static void JhCgjQRTAOCT(android.view.contentcapture.ContentCaptureSession contentCaptureSession, android.view.ViewStructure viewStructure) {
        contentCaptureSession.notifyViewAppeared(viewStructure);
    }

    public static android.graphics.Insets P05cfTpS5W5L(int i, int i2, int i3, int i4) {
        return android.graphics.Insets.of(i, i2, i3, i4);
    }

    public static void QiMR8OkAhezm(android.view.contentcapture.ContentCaptureSession contentCaptureSession, android.view.autofill.AutofillId autofillId, long[] jArr) {
        contentCaptureSession.notifyViewsDisappeared(autofillId, jArr);
    }

    public static void WDYagTQQm9ns(android.view.contentcapture.ContentCaptureSession contentCaptureSession, android.view.autofill.AutofillId autofillId) {
        contentCaptureSession.notifyViewDisappeared(autofillId);
    }

    public static android.view.contentcapture.ContentCaptureSession ZpBGe2uQfcn8(android.view.View view) {
        return view.getContentCaptureSession();
    }

    public static final void e6mdH7fiFuta(android.app.Activity activity, e21.ZpBGe2uQfcn8 zpBGe2uQfcn8) {
        activity.registerActivityLifecycleCallbacks(zpBGe2uQfcn8);
    }

    public static android.view.ViewStructure fWTAfUmVKrZq(android.view.contentcapture.ContentCaptureSession contentCaptureSession, android.view.autofill.AutofillId autofillId, long j) {
        return contentCaptureSession.newVirtualViewStructure(autofillId, j);
    }

    public static android.view.autofill.AutofillId giKS3J6vZuNy(android.view.contentcapture.ContentCaptureSession contentCaptureSession, android.view.autofill.AutofillId autofillId, long j) {
        return contentCaptureSession.newAutofillId(autofillId, j);
    }

    public static void oh71FJcDz6S2(android.view.contentcapture.ContentCaptureSession contentCaptureSession, android.view.autofill.AutofillId autofillId, java.lang.String str) {
        contentCaptureSession.notifyViewTextChanged(autofillId, str);
    }
}
