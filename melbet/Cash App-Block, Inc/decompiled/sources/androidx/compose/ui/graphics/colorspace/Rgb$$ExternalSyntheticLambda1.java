package androidx.compose.ui.graphics.colorspace;

import kotlin.ranges.RangesKt___RangesKt;

/* loaded from: classes.dex */
public final /* synthetic */ class Rgb$$ExternalSyntheticLambda1 implements DoubleFunction {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Rgb f$0;

    public /* synthetic */ Rgb$$ExternalSyntheticLambda1(Rgb rgb, int i) {
        this.$r8$classId = i;
        this.f$0 = rgb;
    }

    @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
    public final double invoke(double d) {
        int i = this.$r8$classId;
        Rgb rgb = this.f$0;
        switch (i) {
            case 0:
                return RangesKt___RangesKt.coerceIn(rgb.oetfOrig.invoke(d), rgb.min, rgb.max);
            default:
                return rgb.eotfOrig.invoke(RangesKt___RangesKt.coerceIn(d, rgb.min, rgb.max));
        }
    }
}
