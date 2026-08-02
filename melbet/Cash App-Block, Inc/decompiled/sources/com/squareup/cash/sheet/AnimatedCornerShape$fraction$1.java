package com.squareup.cash.sheet;

import androidx.compose.foundation.shape.CornerSize;
import androidx.compose.ui.unit.Density;

/* loaded from: classes6.dex */
public final class AnimatedCornerShape$fraction$1 implements CornerSize {
    public final /* synthetic */ float $fraction;
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ CornerSize $this_fraction;

    public /* synthetic */ AnimatedCornerShape$fraction$1(CornerSize cornerSize, float f, int i) {
        this.$r8$classId = i;
        this.$this_fraction = cornerSize;
        this.$fraction = f;
    }

    @Override // androidx.compose.foundation.shape.CornerSize
    /* renamed from: toPx-TmRCtEA */
    public final float mo339toPxTmRCtEA(long j, Density density) {
        float mo339toPxTmRCtEA;
        int i = this.$r8$classId;
        float f = this.$fraction;
        CornerSize cornerSize = this.$this_fraction;
        density.getClass();
        switch (i) {
            case 0:
                mo339toPxTmRCtEA = cornerSize.mo339toPxTmRCtEA(j, density);
                break;
            default:
                mo339toPxTmRCtEA = cornerSize.mo339toPxTmRCtEA(j, density);
                break;
        }
        return mo339toPxTmRCtEA * f;
    }
}
