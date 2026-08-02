package com.squareup.cash.sheet;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.TwoWayConverterImpl;
import androidx.compose.animation.core.VectorizedAnimationSpec;
import com.squareup.cash.payments.views.coreflowsheet.CoreFlowRealSheetState$$ExternalSyntheticLambda1;
import kotlin.jvm.functions.Function0;

/* loaded from: classes6.dex */
public final class RealSheetStateKt$lazyAnimationSpec$1 implements AnimationSpec {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Function0 $spec;

    public /* synthetic */ RealSheetStateKt$lazyAnimationSpec$1(int i, Function0 function0) {
        this.$r8$classId = i;
        this.$spec = function0;
    }

    @Override // androidx.compose.animation.core.AnimationSpec
    public final VectorizedAnimationSpec vectorize(TwoWayConverterImpl twoWayConverterImpl) {
        int i = this.$r8$classId;
        Function0 function0 = this.$spec;
        twoWayConverterImpl.getClass();
        switch (i) {
            case 0:
                return ((AnimationSpec) ((RealSheetState$$ExternalSyntheticLambda1) function0).invoke()).vectorize(twoWayConverterImpl);
            default:
                return ((AnimationSpec) ((CoreFlowRealSheetState$$ExternalSyntheticLambda1) function0).invoke()).vectorize(twoWayConverterImpl);
        }
    }
}
