package androidx.compose.foundation;

import androidx.compose.ui.semantics.ProgressBarRangeInfo;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.ranges.ClosedFloatingPointRange;
import kotlin.ranges.RangesKt___RangesKt;

/* loaded from: classes3.dex */
public final /* synthetic */ class ProgressSemanticsKt$$ExternalSyntheticLambda0 implements Function1 {
    public final /* synthetic */ float f$0;
    public final /* synthetic */ ClosedFloatingPointRange f$1;
    public final /* synthetic */ int f$2;

    public /* synthetic */ ProgressSemanticsKt$$ExternalSyntheticLambda0(float f, ClosedFloatingPointRange closedFloatingPointRange, int i) {
        this.f$0 = f;
        this.f$1 = closedFloatingPointRange;
        this.f$2 = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Float valueOf = Float.valueOf(this.f$0);
        ClosedFloatingPointRange closedFloatingPointRange = this.f$1;
        SemanticsPropertiesKt.setProgressBarRangeInfo((SemanticsPropertyReceiver) obj, new ProgressBarRangeInfo(((Number) RangesKt___RangesKt.coerceIn(valueOf, closedFloatingPointRange)).floatValue(), closedFloatingPointRange, this.f$2));
        return Unit.INSTANCE;
    }
}
