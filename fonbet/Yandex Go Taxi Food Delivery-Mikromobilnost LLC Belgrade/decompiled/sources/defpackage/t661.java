package defpackage;

import android.view.View;
import com.ybsdk.widgets.common.SkeletonView;
import com.ybsdk.widgets.common.shimmer.ShimmerFrameLayout;

/* loaded from: classes3.dex */
public final class t661 implements zo31 {
    public final /* synthetic */ int a;
    public final ShimmerFrameLayout b;
    public final SkeletonView c;
    public final SkeletonView d;

    public /* synthetic */ t661(ShimmerFrameLayout shimmerFrameLayout, SkeletonView skeletonView, SkeletonView skeletonView2, int i) {
        this.a = i;
        this.b = shimmerFrameLayout;
        this.c = skeletonView;
        this.d = skeletonView2;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        int i = this.a;
        return this.b;
    }

    public ShimmerFrameLayout o() {
        int i = this.a;
        return this.b;
    }
}
