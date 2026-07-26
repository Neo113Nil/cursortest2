package android.content.Context;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.HashMap;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterShapeDrawableQuantumNeoNovaX6961 extends ViewGroup {
    public final HashMap FrostHunterCameraXPixelTurboCosmos9814;
    public final HashMap FrostHunterFlowMaxDragonHero5809;

    public FrostHunterShapeDrawableQuantumNeoNovaX6961(Context context) {
        super(context);
        setClipChildren(false);
        this.FrostHunterCameraXPixelTurboCosmos9814 = new HashMap();
        this.FrostHunterFlowMaxDragonHero5809 = new HashMap();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    public final HashMap<FrostHunterAnimatorSpeedBetaPixel3252, FrostHunterOnGlobalLayoutListenerTitanStrikeNovaX1439> getHolderToLayoutNode() {
        return this.FrostHunterCameraXPixelTurboCosmos9814;
    }

    public final HashMap<FrostHunterOnGlobalLayoutListenerTitanStrikeNovaX1439, FrostHunterAnimatorSpeedBetaPixel3252> getLayoutNodeToHolder() {
        return this.FrostHunterFlowMaxDragonHero5809;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final /* bridge */ /* synthetic */ ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        for (FrostHunterAnimatorSpeedBetaPixel3252 frostHunterAnimatorSpeedBetaPixel3252 : this.FrostHunterCameraXPixelTurboCosmos9814.keySet()) {
            frostHunterAnimatorSpeedBetaPixel3252.layout(frostHunterAnimatorSpeedBetaPixel3252.getLeft(), frostHunterAnimatorSpeedBetaPixel3252.getTop(), frostHunterAnimatorSpeedBetaPixel3252.getRight(), frostHunterAnimatorSpeedBetaPixel3252.getBottom());
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        if (!(View.MeasureSpec.getMode(i) == 1073741824)) {
            FrostHunterAudioManagerThunderTitan4297.FrostHunterAlphaAnimationNeoCosmos5761("widthMeasureSpec should be EXACTLY");
        }
        if (!(View.MeasureSpec.getMode(i2) == 1073741824)) {
            FrostHunterAudioManagerThunderTitan4297.FrostHunterAlphaAnimationNeoCosmos5761("heightMeasureSpec should be EXACTLY");
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
        for (FrostHunterAnimatorSpeedBetaPixel3252 frostHunterAnimatorSpeedBetaPixel3252 : this.FrostHunterCameraXPixelTurboCosmos9814.keySet()) {
            int i4 = frostHunterAnimatorSpeedBetaPixel3252.FrostHunterEditTextPulseHyperion1262;
            if (i4 != Integer.MIN_VALUE && (i3 = frostHunterAnimatorSpeedBetaPixel3252.FrostHunterDatabaseEliteShadowUltra2452) != Integer.MIN_VALUE) {
                frostHunterAnimatorSpeedBetaPixel3252.measure(i4, i3);
            }
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        cleanupLayoutState(this);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            FrostHunterOnGlobalLayoutListenerTitanStrikeNovaX1439 frostHunterOnGlobalLayoutListenerTitanStrikeNovaX1439 = (FrostHunterOnGlobalLayoutListenerTitanStrikeNovaX1439) this.FrostHunterCameraXPixelTurboCosmos9814.get(childAt);
            if (childAt.isLayoutRequested() && frostHunterOnGlobalLayoutListenerTitanStrikeNovaX1439 != null) {
                FrostHunterOnGlobalLayoutListenerTitanStrikeNovaX1439.FrostHunterPagingSourceEclipseDelta8255(frostHunterOnGlobalLayoutListenerTitanStrikeNovaX1439, false, 7);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onDescendantInvalidated(View view, View view2) {
    }
}
