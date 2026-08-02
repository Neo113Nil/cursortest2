package skeletor.render;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.yandex.urbanads.internal.navigation.UrbanAdsBottomSheetFragment;
import defpackage.ksh0;
import defpackage.lgh0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import skeletor.render.ui.RoundedCornersFrameLayout;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lskeletor/render/SkeletonBlock;", "Lcom/facebook/shimmer/ShimmerFrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", UrbanAdsBottomSheetFragment.CORNER_RADIUS, "Lzy11;", "setCorners", "(I)V", "Lskeletor/render/ui/RoundedCornersFrameLayout;", "innerBlock", "Lskeletor/render/ui/RoundedCornersFrameLayout;", "renderer_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes10.dex */
public final class SkeletonBlock extends ShimmerFrameLayout {
    private RoundedCornersFrameLayout innerBlock;

    public SkeletonBlock(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        View.inflate(context, ksh0.skeleton_block, this);
        this.innerBlock = (RoundedCornersFrameLayout) findViewById(lgh0.inner);
    }

    public final void setCorners(int cornerRadius) {
        RoundedCornersFrameLayout roundedCornersFrameLayout = this.innerBlock;
        if (roundedCornersFrameLayout == null) {
            return;
        }
        roundedCornersFrameLayout.setCornersRadius(cornerRadius);
    }

    public /* synthetic */ SkeletonBlock(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SkeletonBlock(Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
    }
}
