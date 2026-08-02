package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.ybsdk.screens.modal.SpoilerOnboardingBottomSheet;
import com.ybsdk.widgets.common.YbButtonView;

/* loaded from: classes6.dex */
public final class w861 implements zo31 {
    public final SpoilerOnboardingBottomSheet a;
    public final TextView b;
    public final ImageView c;
    public final YbButtonView d;
    public final YbButtonView e;
    public final TextView f;

    public w861(SpoilerOnboardingBottomSheet spoilerOnboardingBottomSheet, TextView textView, ImageView imageView, YbButtonView ybButtonView, YbButtonView ybButtonView2, TextView textView2) {
        this.a = spoilerOnboardingBottomSheet;
        this.b = textView;
        this.c = imageView;
        this.d = ybButtonView;
        this.e = ybButtonView2;
        this.f = textView2;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
