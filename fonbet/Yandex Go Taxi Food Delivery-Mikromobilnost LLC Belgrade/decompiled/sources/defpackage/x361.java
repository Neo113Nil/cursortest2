package defpackage;

import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import com.ybsdk.widgets.common.shimmer.ShimmerFrameLayout;

/* loaded from: classes3.dex */
public final class x361 implements zo31 {
    public final ShimmerFrameLayout a;
    public final AppCompatImageView b;
    public final TextView c;
    public final TextView d;

    public x361(ShimmerFrameLayout shimmerFrameLayout, AppCompatImageView appCompatImageView, TextView textView, TextView textView2) {
        this.a = shimmerFrameLayout;
        this.b = appCompatImageView;
        this.c = textView;
        this.d = textView2;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
