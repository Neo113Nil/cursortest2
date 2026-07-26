package android.content.Context;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.style.LeadingMarginSpan;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterGradleUltraTitan3852 implements LeadingMarginSpan {
    @Override // android.text.style.LeadingMarginSpan
    public final void drawLeadingMargin(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, boolean z, Layout layout) {
        int lineForOffset;
        if (layout == null || paint == null || (lineForOffset = layout.getLineForOffset(i6)) != layout.getLineCount() - 1) {
            return;
        }
        FrostHunterAdapterHeroTitan7326 frostHunterAdapterHeroTitan7326 = FrostHunterAnimatedVectorDrawableUltraPulse9884.FrostHunterAlphaAnimationNeoCosmos5761;
        if (layout.getEllipsisCount(lineForOffset) > 0) {
            float FrostHunterResourcesTitanHyperVision5823 = FrostHunterLiveDataNebulaVisionSpeed2164.FrostHunterResourcesTitanHyperVision5823(layout, lineForOffset, paint) + FrostHunterLiveDataNebulaVisionSpeed2164.FrostHunterCameraXTurboCelestialHero5430(layout, lineForOffset, paint);
            if (FrostHunterResourcesTitanHyperVision5823 == 0.0f) {
                return;
            }
            canvas.getClass();
            canvas.translate(FrostHunterResourcesTitanHyperVision5823, 0.0f);
        }
    }

    @Override // android.text.style.LeadingMarginSpan
    public final int getLeadingMargin(boolean z) {
        return 0;
    }
}
