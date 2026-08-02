package androidx.compose.foundation.layout;

import androidx.compose.foundation.ScrollState$$ExternalSyntheticLambda4;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.unit.Constraints;
import java.util.List;

/* loaded from: classes.dex */
public final class SpacerMeasurePolicy implements MeasurePolicy {
    public final /* synthetic */ int $r8$classId;
    public static final SpacerMeasurePolicy INSTANCE$1 = new SpacerMeasurePolicy(1);
    public static final SpacerMeasurePolicy INSTANCE = new SpacerMeasurePolicy(0);

    public /* synthetic */ SpacerMeasurePolicy(int i) {
        this.$r8$classId = i;
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    /* renamed from: measure-3p2s80s */
    public final MeasureResult mo138measure3p2s80s(MeasureScope measureScope, List list, long j) {
        switch (this.$r8$classId) {
            case 0:
                return MeasureScope.layout$default(measureScope, Constraints.m1023getHasFixedWidthimpl(j) ? Constraints.m1025getMaxWidthimpl(j) : 0, Constraints.m1022getHasFixedHeightimpl(j) ? Constraints.m1024getMaxHeightimpl(j) : 0, new ScrollState$$ExternalSyntheticLambda4(28));
            default:
                return MeasureScope.layout$default(measureScope, Constraints.m1027getMinWidthimpl(j), Constraints.m1026getMinHeightimpl(j), new ScrollState$$ExternalSyntheticLambda4(26));
        }
    }
}
