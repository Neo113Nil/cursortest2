package android.content.Context;

import android.graphics.Paint;
import android.text.style.LineHeightSpan;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterMapBlazeMega9173 implements LineHeightSpan {
    public final float FrostHunterCameraXPixelTurboCosmos9814;

    public FrostHunterMapBlazeMega9173(float f) {
        this.FrostHunterCameraXPixelTurboCosmos9814 = f;
    }

    @Override // android.text.style.LineHeightSpan
    public final void chooseHeight(CharSequence charSequence, int i, int i2, int i3, int i4, Paint.FontMetricsInt fontMetricsInt) {
        if (fontMetricsInt.descent - fontMetricsInt.ascent <= 0) {
            return;
        }
        int ceil = (int) Math.ceil(fontMetricsInt.descent * ((r0 * 1.0f) / r1));
        fontMetricsInt.descent = ceil;
        fontMetricsInt.ascent = ceil - ((int) Math.ceil(this.FrostHunterCameraXPixelTurboCosmos9814));
    }
}
