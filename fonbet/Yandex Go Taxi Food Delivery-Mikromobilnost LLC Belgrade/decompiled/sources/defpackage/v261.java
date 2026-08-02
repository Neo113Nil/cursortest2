package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import com.ybsdk.widgets.common.shimmer.ShimmerFrameLayout;

/* loaded from: classes13.dex */
public final class v261 implements zo31 {
    public final ShimmerFrameLayout a;
    public final ImageView b;
    public final SwitchCompat c;
    public final TextView d;

    public v261(ShimmerFrameLayout shimmerFrameLayout, ImageView imageView, SwitchCompat switchCompat, TextView textView) {
        this.a = shimmerFrameLayout;
        this.b = imageView;
        this.c = switchCompat;
        this.d = textView;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
