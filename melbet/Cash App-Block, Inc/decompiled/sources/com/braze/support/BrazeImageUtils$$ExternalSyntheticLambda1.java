package com.braze.support;

import android.widget.ImageView;
import androidx.compose.foundation.lazy.grid.LazyGridState;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final /* synthetic */ class BrazeImageUtils$$ExternalSyntheticLambda1 implements Function0 {
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ float f$0;
    public final /* synthetic */ Object f$1;

    public /* synthetic */ BrazeImageUtils$$ExternalSyntheticLambda1(float f, ImageView imageView) {
        this.f$0 = f;
        this.f$1 = imageView;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        String resizeToBitmapDimensions$lambda$3;
        int i = this.$r8$classId;
        float f = this.f$0;
        Object obj = this.f$1;
        switch (i) {
            case 0:
                resizeToBitmapDimensions$lambda$3 = BrazeImageUtils.resizeToBitmapDimensions$lambda$3(f, (ImageView) obj);
                return resizeToBitmapDimensions$lambda$3;
            default:
                return Float.valueOf(((LazyGridState) obj).scrollPosition.index$delegate.getIntValue() == 0 ? Math.abs(r2.scrollPosition.scrollOffset$delegate.getIntValue()) / f : 1.0f);
        }
    }

    public /* synthetic */ BrazeImageUtils$$ExternalSyntheticLambda1(LazyGridState lazyGridState, float f) {
        this.f$1 = lazyGridState;
        this.f$0 = f;
    }
}
