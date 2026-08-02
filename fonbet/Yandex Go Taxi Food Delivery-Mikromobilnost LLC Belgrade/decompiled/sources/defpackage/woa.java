package defpackage;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.yandex.go.chargers.qr.ChargersQrCameraPreview;

/* loaded from: classes12.dex */
public final class woa implements zo31 {
    public final ConstraintLayout a;
    public final ChargersQrCameraPreview b;
    public final Guideline c;

    public woa(ConstraintLayout constraintLayout, ChargersQrCameraPreview chargersQrCameraPreview, Guideline guideline) {
        this.a = constraintLayout;
        this.b = chargersQrCameraPreview;
        this.c = guideline;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
