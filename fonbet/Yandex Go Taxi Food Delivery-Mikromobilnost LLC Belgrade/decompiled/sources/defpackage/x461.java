package defpackage;

import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import com.ybsdk.widgets.common.shimmer.ShimmerFrameLayout;

/* loaded from: classes3.dex */
public final class x461 implements zo31 {
    public final ShimmerFrameLayout a;
    public final TextView b;
    public final AppCompatImageView c;
    public final TextView d;
    public final AppCompatImageView e;

    public x461(ShimmerFrameLayout shimmerFrameLayout, TextView textView, AppCompatImageView appCompatImageView, TextView textView2, AppCompatImageView appCompatImageView2) {
        this.a = shimmerFrameLayout;
        this.b = textView;
        this.c = appCompatImageView;
        this.d = textView2;
        this.e = appCompatImageView2;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
