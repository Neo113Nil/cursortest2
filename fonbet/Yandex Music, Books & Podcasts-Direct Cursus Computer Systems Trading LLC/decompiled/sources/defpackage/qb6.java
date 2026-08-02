package defpackage;

import android.os.Build;
import android.view.View;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;
import java.util.Objects;

/* loaded from: classes.dex */
public final class qb6 {
    public final Object a;
    public final View b;

    public qb6(ContentCaptureSession contentCaptureSession, View view) {
        this.a = contentCaptureSession;
        this.b = view;
    }

    public final void a() {
        if (Build.VERSION.SDK_INT >= 29) {
            ContentCaptureSession d = jj4.d(this.a);
            ke2 p = hag.p(this.b);
            Objects.requireNonNull(p);
            d.notifyViewsDisappeared(xq0.g(p.a), new long[]{Long.MIN_VALUE});
        }
    }

    public final AutofillId b(long j) {
        if (Build.VERSION.SDK_INT < 29) {
            return null;
        }
        ContentCaptureSession d = jj4.d(this.a);
        ke2 p = hag.p(this.b);
        Objects.requireNonNull(p);
        return d.newAutofillId(xq0.g(p.a), j);
    }

    public final vtm c(AutofillId autofillId, long j) {
        if (Build.VERSION.SDK_INT >= 29) {
            return new vtm(jj4.d(this.a).newVirtualViewStructure(autofillId, j));
        }
        return null;
    }

    public final void d(ViewStructure viewStructure) {
        if (Build.VERSION.SDK_INT >= 29) {
            jj4.d(this.a).notifyViewAppeared(viewStructure);
        }
    }

    public final void e(AutofillId autofillId) {
        if (Build.VERSION.SDK_INT >= 29) {
            jj4.d(this.a).notifyViewDisappeared(autofillId);
        }
    }

    public final void f(AutofillId autofillId, String str) {
        if (Build.VERSION.SDK_INT >= 29) {
            ((ContentCaptureSession) this.a).notifyViewTextChanged(autofillId, str);
        }
    }
}
