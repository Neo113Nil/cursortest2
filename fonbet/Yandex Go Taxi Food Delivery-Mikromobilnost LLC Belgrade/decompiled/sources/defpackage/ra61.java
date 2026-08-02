package defpackage;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.ybsdk.feature.kyc.internal.screens.photo.views.CaptionButtonView;

/* loaded from: classes3.dex */
public final class ra61 implements zo31 {
    public final CaptionButtonView a;
    public final AppCompatImageView b;
    public final CircularProgressIndicator c;

    public ra61(CaptionButtonView captionButtonView, AppCompatImageView appCompatImageView, CircularProgressIndicator circularProgressIndicator) {
        this.a = captionButtonView;
        this.b = appCompatImageView;
        this.c = circularProgressIndicator;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
