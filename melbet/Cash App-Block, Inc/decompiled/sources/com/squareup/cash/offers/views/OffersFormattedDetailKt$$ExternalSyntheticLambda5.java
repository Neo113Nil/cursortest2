package com.squareup.cash.offers.views;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.SubcomposeMeasureScope;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import com.stripe.android.financialconnections.ui.components.TextKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final /* synthetic */ class OffersFormattedDetailKt$$ExternalSyntheticLambda5 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ ComposableLambdaImpl f$0;
    public final /* synthetic */ ComposableLambdaImpl f$1;

    public /* synthetic */ OffersFormattedDetailKt$$ExternalSyntheticLambda5(ComposableLambdaImpl composableLambdaImpl, ComposableLambdaImpl composableLambdaImpl2) {
        this.$r8$classId = 0;
        this.f$0 = composableLambdaImpl;
        this.f$1 = composableLambdaImpl2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        ComposableLambdaImpl composableLambdaImpl = this.f$1;
        ComposableLambdaImpl composableLambdaImpl2 = this.f$0;
        switch (i) {
            case 0:
                SubcomposeMeasureScope subcomposeMeasureScope = (SubcomposeMeasureScope) obj;
                subcomposeMeasureScope.getClass();
                Placeable mo833measureBRTryo0 = ((Measurable) subcomposeMeasureScope.subcompose("onWidthMeasured", new ComposableLambdaImpl(new OffersFormattedDetailKt$$ExternalSyntheticLambda7(subcomposeMeasureScope.mo233toDpu2uoSUM(((Measurable) subcomposeMeasureScope.subcompose("contentToMeasure", composableLambdaImpl2).get(0)).mo833measureBRTryo0(ConstraintsKt.Constraints$default(0, 0, 0, 0, 15)).width), composableLambdaImpl), true, 262815647)).get(0)).mo833measureBRTryo0(((Constraints) obj2).value);
                break;
            case 1:
                ((Integer) obj2).getClass();
                UtilsKt.ProvideWidth(composableLambdaImpl2, composableLambdaImpl, (Composer) obj, Updater.updateChangedFlags(55));
                break;
            default:
                ((Integer) obj2).getClass();
                TextKt.FinancialConnectionsScaffold(composableLambdaImpl2, composableLambdaImpl, (Composer) obj, Updater.updateChangedFlags(55));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ OffersFormattedDetailKt$$ExternalSyntheticLambda5(ComposableLambdaImpl composableLambdaImpl, ComposableLambdaImpl composableLambdaImpl2, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = composableLambdaImpl;
        this.f$1 = composableLambdaImpl2;
    }
}
