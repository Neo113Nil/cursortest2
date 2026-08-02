package com.squareup.cash.payments.views.coreflowsheet;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final /* synthetic */ class CoreFlowRealSheetState$$ExternalSyntheticLambda12 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ CoreFlowRealSheetState f$0;

    public /* synthetic */ CoreFlowRealSheetState$$ExternalSyntheticLambda12(CoreFlowRealSheetState coreFlowRealSheetState, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = coreFlowRealSheetState;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        CoreFlowRealSheetState coreFlowRealSheetState = this.f$0;
        Composer composer = (Composer) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                coreFlowRealSheetState.CreateDragAnchorsEffect(composer, Updater.updateChangedFlags(1));
                break;
            case 1:
                coreFlowRealSheetState.ProcessQueuedNestedFlingsEffect(composer, Updater.updateChangedFlags(1));
                break;
            default:
                coreFlowRealSheetState.HandleContentAndImeTransitionsEffect(composer, Updater.updateChangedFlags(1));
                break;
        }
        return Unit.INSTANCE;
    }
}
