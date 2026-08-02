package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ybsdk.core.design.spoiler.SpoilerTextView;
import com.ybsdk.widgets.common.shimmer.ShimmerFrameLayout;

/* loaded from: classes3.dex */
public final class ua61 implements zo31 {
    public final ConstraintLayout a;
    public final ImageView b;
    public final ImageView c;
    public final TextView d;
    public final SpoilerTextView e;
    public final TextView f;
    public final ShimmerFrameLayout g;

    public ua61(ConstraintLayout constraintLayout, LinearLayout linearLayout, ImageView imageView, ImageView imageView2, ImageView imageView3, TextView textView, SpoilerTextView spoilerTextView, TextView textView2, ShimmerFrameLayout shimmerFrameLayout) {
        this.a = constraintLayout;
        this.b = imageView2;
        this.c = imageView3;
        this.d = textView;
        this.e = spoilerTextView;
        this.f = textView2;
        this.g = shimmerFrameLayout;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
