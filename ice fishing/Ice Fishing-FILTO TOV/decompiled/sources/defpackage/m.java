package defpackage;

import android.graphics.Point;
import android.graphics.Rect;
import android.view.ScrollCaptureCallback;
import android.view.ScrollCaptureSession;
import android.view.ScrollCaptureTarget;
import android.view.autofill.AutofillId;
import android.view.translation.ViewTranslationRequest;
import android.view.translation.ViewTranslationResponse;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class m {
    public static /* synthetic */ ViewTranslationRequest.Builder XnEVoBF0td1l(AutofillId autofillId, long j) {
        return new ViewTranslationRequest.Builder(autofillId, j);
    }

    public static /* synthetic */ void YmKjaVtbfp5Z() {
    }

    public static /* bridge */ /* synthetic */ ScrollCaptureSession encWxUiV2(Object obj) {
        return (ScrollCaptureSession) obj;
    }

    public static /* bridge */ /* synthetic */ ViewTranslationResponse iwATDS1i01k(Object obj) {
        return (ViewTranslationResponse) obj;
    }

    public static /* synthetic */ ScrollCaptureTarget mOu10nynGul(c cVar, Rect rect, Point point, ScrollCaptureCallback scrollCaptureCallback) {
        return new ScrollCaptureTarget(cVar, rect, point, scrollCaptureCallback);
    }
}
