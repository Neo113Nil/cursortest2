package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import com.ybsdk.core.design.spoiler.SpoilerTextView;
import com.ybsdk.widgets.common.WidgetWithToggleView;

/* loaded from: classes4.dex */
public final class y861 implements zo31 {
    public final FrameLayout a;
    public final ProgressBar b;
    public final AppCompatImageView c;
    public final FrameLayout d;
    public final AppCompatImageView e;
    public final TextView f;
    public final SpoilerTextView g;
    public final WidgetWithToggleView h;

    public y861(FrameLayout frameLayout, ProgressBar progressBar, AppCompatImageView appCompatImageView, FrameLayout frameLayout2, AppCompatImageView appCompatImageView2, TextView textView, SpoilerTextView spoilerTextView, WidgetWithToggleView widgetWithToggleView) {
        this.a = frameLayout;
        this.b = progressBar;
        this.c = appCompatImageView;
        this.d = frameLayout2;
        this.e = appCompatImageView2;
        this.f = textView;
        this.g = spoilerTextView;
        this.h = widgetWithToggleView;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
