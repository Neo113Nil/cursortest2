package defpackage;

import android.view.View;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;

/* loaded from: classes10.dex */
public final class yee implements zee {
    public final ContentCaptureSession a;
    public final View b;

    public yee(ContentCaptureSession contentCaptureSession, View view) {
        this.a = contentCaptureSession;
        this.b = view;
    }

    public static yee g(ContentCaptureSession contentCaptureSession, View view) {
        return new yee(contentCaptureSession, view);
    }

    public final void a() {
        this.a.notifyViewsDisappeared(this.b.getAutofillId(), new long[]{Long.MIN_VALUE});
    }

    public final AutofillId b(long j) {
        return this.a.newAutofillId(this.b.getAutofillId(), j);
    }

    public final fv31 c(AutofillId autofillId, long j) {
        return new fv31(this.a.newVirtualViewStructure(autofillId, j));
    }

    public final void d(ViewStructure viewStructure) {
        this.a.notifyViewAppeared(viewStructure);
    }

    public final void e(AutofillId autofillId) {
        this.a.notifyViewDisappeared(autofillId);
    }

    public final void f(AutofillId autofillId, String str) {
        this.a.notifyViewTextChanged(autofillId, str);
    }
}
