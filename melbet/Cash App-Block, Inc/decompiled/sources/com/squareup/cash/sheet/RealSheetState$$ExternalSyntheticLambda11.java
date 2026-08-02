package com.squareup.cash.sheet;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final /* synthetic */ class RealSheetState$$ExternalSyntheticLambda11 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ RealSheetState f$0;

    public /* synthetic */ RealSheetState$$ExternalSyntheticLambda11(RealSheetState realSheetState, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = realSheetState;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        RealSheetState realSheetState = this.f$0;
        Composer composer = (Composer) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                realSheetState.ProcessQueuedNestedFlingsEffect(composer, Updater.updateChangedFlags(1));
                break;
            default:
                realSheetState.CreateDragAnchorsEffect(composer, Updater.updateChangedFlags(1));
                break;
        }
        return Unit.INSTANCE;
    }
}
