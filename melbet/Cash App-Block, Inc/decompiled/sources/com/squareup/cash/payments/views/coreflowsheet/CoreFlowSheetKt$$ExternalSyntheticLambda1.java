package com.squareup.cash.payments.views.coreflowsheet;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.Modifier;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final /* synthetic */ class CoreFlowSheetKt$$ExternalSyntheticLambda1 implements Function2 {
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ Function0 f$0;
    public final /* synthetic */ Modifier f$1;
    public final /* synthetic */ CoreFlowRealSheetState f$2;
    public final /* synthetic */ CoreFlowSheetPeekPosition$FixedHeight f$3;
    public final /* synthetic */ ComposableLambdaImpl f$5;

    public /* synthetic */ CoreFlowSheetKt$$ExternalSyntheticLambda1(Function0 function0, Modifier modifier, CoreFlowRealSheetState coreFlowRealSheetState, CoreFlowSheetPeekPosition$FixedHeight coreFlowSheetPeekPosition$FixedHeight, ComposableLambdaImpl composableLambdaImpl) {
        this.f$0 = function0;
        this.f$1 = modifier;
        this.f$2 = coreFlowRealSheetState;
        this.f$3 = coreFlowSheetPeekPosition$FixedHeight;
        this.f$5 = composableLambdaImpl;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    CoreFlowSheetKt.TheCoreFlowSheet(this.f$0, this.f$1, this.f$2, this.f$3, this.f$5, gapComposer, 0);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                CoreFlowSheetKt.CoreFlowSheet(this.f$0, this.f$1, this.f$2, this.f$3, this.f$5, (Composer) obj, Updater.updateChangedFlags(1769473));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ CoreFlowSheetKt$$ExternalSyntheticLambda1(Function0 function0, Modifier modifier, CoreFlowRealSheetState coreFlowRealSheetState, CoreFlowSheetPeekPosition$FixedHeight coreFlowSheetPeekPosition$FixedHeight, ComposableLambdaImpl composableLambdaImpl, int i) {
        this.f$0 = function0;
        this.f$1 = modifier;
        this.f$2 = coreFlowRealSheetState;
        this.f$3 = coreFlowSheetPeekPosition$FixedHeight;
        this.f$5 = composableLambdaImpl;
    }
}
