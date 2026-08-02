package defpackage;

import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import com.ybsdk.feature.kyc.internal.screens.photo.views.MainPageGuideView;

/* loaded from: classes3.dex */
public final class ta61 implements zo31 {
    public final MainPageGuideView a;
    public final TextView b;
    public final AppCompatImageView c;
    public final TextView d;
    public final AppCompatImageView e;
    public final AppCompatImageView f;
    public final TextView g;
    public final AppCompatImageView h;
    public final TextView i;

    public ta61(MainPageGuideView mainPageGuideView, TextView textView, AppCompatImageView appCompatImageView, TextView textView2, AppCompatImageView appCompatImageView2, AppCompatImageView appCompatImageView3, TextView textView3, AppCompatImageView appCompatImageView4, TextView textView4) {
        this.a = mainPageGuideView;
        this.b = textView;
        this.c = appCompatImageView;
        this.d = textView2;
        this.e = appCompatImageView2;
        this.f = appCompatImageView3;
        this.g = textView3;
        this.h = appCompatImageView4;
        this.i = textView4;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
