package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import com.ybsdk.widgets.common.shimmer.ShimmerFrameLayout;

/* loaded from: classes13.dex */
public final class u261 implements zo31 {
    public final ShimmerFrameLayout a;
    public final TextView b;
    public final ImageView c;
    public final SwitchCompat d;
    public final TextView e;

    public u261(ShimmerFrameLayout shimmerFrameLayout, TextView textView, ImageView imageView, SwitchCompat switchCompat, TextView textView2) {
        this.a = shimmerFrameLayout;
        this.b = textView;
        this.c = imageView;
        this.d = switchCompat;
        this.e = textView2;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
