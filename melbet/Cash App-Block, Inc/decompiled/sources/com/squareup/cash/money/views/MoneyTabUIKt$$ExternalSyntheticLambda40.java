package com.squareup.cash.money.views;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyItemScopeImpl;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.ParcelableSnapshotMutableFloatState;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.recyclerview.widget.RecyclerView;
import coil3.compose.ConstraintsSizeResolver$$ExternalSyntheticLambda0;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;

/* loaded from: classes6.dex */
public final /* synthetic */ class MoneyTabUIKt$$ExternalSyntheticLambda40 implements Function3 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ ToolbarNestedScrollExpander f$0;

    public /* synthetic */ MoneyTabUIKt$$ExternalSyntheticLambda40(ToolbarNestedScrollExpander toolbarNestedScrollExpander, int i) {
        this.$r8$classId = i;
        this.f$0 = toolbarNestedScrollExpander;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.$r8$classId;
        ToolbarNestedScrollExpander toolbarNestedScrollExpander = this.f$0;
        switch (i) {
            case 0:
                MeasureScope measureScope = (MeasureScope) obj;
                Measurable measurable = (Measurable) obj2;
                measureScope.getClass();
                measurable.getClass();
                Placeable mo833measureBRTryo0 = measurable.mo833measureBRTryo0(((Constraints) obj3).value);
                float density = (measureScope.getDensity() * 24.0f) + mo833measureBRTryo0.height;
                ParcelableSnapshotMutableFloatState parcelableSnapshotMutableFloatState = toolbarNestedScrollExpander._toolbarHeight;
                if (density != parcelableSnapshotMutableFloatState.getFloatValue()) {
                    parcelableSnapshotMutableFloatState.setFloatValue(density);
                    toolbarNestedScrollExpander._toolbarScrollDelta.setFloatValue(density);
                }
                return MeasureScope.layout$default(measureScope, mo833measureBRTryo0.width, mo833measureBRTryo0.height, new ConstraintsSizeResolver$$ExternalSyntheticLambda0(mo833measureBRTryo0, 16));
            default:
                Composer composer = (Composer) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((LazyItemScopeImpl) obj).getClass();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
                    SpacerKt.Spacer(gapComposer, SizeKt.m277height3ABfNKs(Modifier.Companion.$$INSTANCE, ((Density) gapComposer.consume(CompositionLocalsKt.LocalDensity)).mo232toDpu2uoSUM(HypeWelcomeUIKt.isFullyExpanded(toolbarNestedScrollExpander) ? toolbarNestedScrollExpander._toolbarScrollDelta.getFloatValue() : RecyclerView.DECELERATION_RATE)));
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
        }
    }
}
