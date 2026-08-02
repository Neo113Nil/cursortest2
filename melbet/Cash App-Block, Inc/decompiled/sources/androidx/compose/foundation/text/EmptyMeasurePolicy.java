package androidx.compose.foundation.text;

import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.text.SaversKt$$ExternalSyntheticLambda2;
import androidx.compose.ui.unit.Constraints;
import java.util.List;

/* loaded from: classes.dex */
public final class EmptyMeasurePolicy implements MeasurePolicy {
    public static final EmptyMeasurePolicy INSTANCE = new EmptyMeasurePolicy();
    public static final SaversKt$$ExternalSyntheticLambda2 placementBlock = new SaversKt$$ExternalSyntheticLambda2(4);

    @Override // androidx.compose.ui.layout.MeasurePolicy
    /* renamed from: measure-3p2s80s */
    public final MeasureResult mo138measure3p2s80s(MeasureScope measureScope, List list, long j) {
        return MeasureScope.layout$default(measureScope, Constraints.m1025getMaxWidthimpl(j), Constraints.m1024getMaxHeightimpl(j), placementBlock);
    }
}
