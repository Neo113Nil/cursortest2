package defpackage;

import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import com.ybsdk.widgets.common.shimmer.ShimmerFrameLayout;

/* loaded from: classes3.dex */
public final class uz51 implements zo31 {
    public final ShimmerFrameLayout a;
    public final AppCompatImageView b;
    public final AppCompatImageView c;
    public final TextView d;

    public uz51(ShimmerFrameLayout shimmerFrameLayout, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, TextView textView) {
        this.a = shimmerFrameLayout;
        this.b = appCompatImageView;
        this.c = appCompatImageView2;
        this.d = textView;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
