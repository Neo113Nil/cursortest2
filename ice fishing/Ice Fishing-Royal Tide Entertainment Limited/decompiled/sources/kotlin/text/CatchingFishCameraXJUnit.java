package kotlin.text;

import android.os.Build;
import android.view.View;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;
import java.util.Objects;

/* loaded from: classes.dex */
public final class CatchingFishCameraXJUnit {
    public final Object CatchingFishParcelableFAB;
    public final View CatchingFishSnackbar;

    public CatchingFishCameraXJUnit(ContentCaptureSession contentCaptureSession, View view) {
        this.CatchingFishParcelableFAB = contentCaptureSession;
        this.CatchingFishSnackbar = view;
    }

    public final AutofillId CatchingFishParcelableFAB(long j) {
        if (Build.VERSION.SDK_INT < 29) {
            return null;
        }
        ContentCaptureSession CatchingFishViewModelScope = CatchingFishLifecycle.CatchingFishViewModelScope(this.CatchingFishParcelableFAB);
        CatchingFishFABFlux CatchingFishSpannableWidget = CatchingFishOkHttpFAB.CatchingFishSpannableWidget(this.CatchingFishSnackbar);
        Objects.requireNonNull(CatchingFishSpannableWidget);
        return CatchingFishJUnitFlux.CatchingFishCoroutine(CatchingFishViewModelScope, CatchingFishLifecycleJUnit.CatchingFishLayout(CatchingFishSpannableWidget.CatchingFishReduxKtor), j);
    }
}
