package coil3.compose.internal;

import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.unit.Constraints;
import bo.app.yf$$ExternalSyntheticLambda10;
import java.util.List;

/* loaded from: classes3.dex */
public final class UtilsKt$UseMinConstraintsMeasurePolicy$1 implements MeasurePolicy {
    public static final UtilsKt$UseMinConstraintsMeasurePolicy$1 INSTANCE = new UtilsKt$UseMinConstraintsMeasurePolicy$1();

    @Override // androidx.compose.ui.layout.MeasurePolicy
    /* renamed from: measure-3p2s80s */
    public final MeasureResult mo138measure3p2s80s(MeasureScope measureScope, List list, long j) {
        return MeasureScope.layout$default(measureScope, Constraints.m1027getMinWidthimpl(j), Constraints.m1026getMinHeightimpl(j), new yf$$ExternalSyntheticLambda10(24));
    }
}
