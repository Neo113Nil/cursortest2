package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import com.ybsdk.feature.kyc.internal.screens.photo.views.SelfieGuideView;

/* loaded from: classes3.dex */
public final class va61 implements zo31 {
    public final SelfieGuideView a;
    public final TextView b;
    public final AppCompatImageView c;
    public final LinearLayout d;
    public final TextView e;

    public va61(SelfieGuideView selfieGuideView, TextView textView, AppCompatImageView appCompatImageView, LinearLayout linearLayout, TextView textView2) {
        this.a = selfieGuideView;
        this.b = textView;
        this.c = appCompatImageView;
        this.d = linearLayout;
        this.e = textView2;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
