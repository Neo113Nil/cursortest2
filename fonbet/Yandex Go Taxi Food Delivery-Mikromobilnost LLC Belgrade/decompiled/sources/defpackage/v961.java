package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.ybsdk.widgets.common.SkeletonView;
import com.ybsdk.widgets.common.shimmer.ShimmerFrameLayout;

/* loaded from: classes3.dex */
public final class v961 implements zo31 {
    public final ShimmerFrameLayout a;
    public final px6 b;
    public final LinearLayout c;
    public final FrameLayout d;
    public final SkeletonView e;
    public final SkeletonView f;
    public final SkeletonView g;

    public v961(ShimmerFrameLayout shimmerFrameLayout, px6 px6Var, LinearLayout linearLayout, FrameLayout frameLayout, SkeletonView skeletonView, SkeletonView skeletonView2, SkeletonView skeletonView3) {
        this.a = shimmerFrameLayout;
        this.b = px6Var;
        this.c = linearLayout;
        this.d = frameLayout;
        this.e = skeletonView;
        this.f = skeletonView2;
        this.g = skeletonView3;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
