package com.squareup.cash.card.onboarding;

import com.squareup.cash.card.onboarding.StampSheetViewEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public final /* synthetic */ class StampSheetV2Kt$$ExternalSyntheticLambda12 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Function1 f$0;
    public final /* synthetic */ StampSheetViewModel f$1;

    public /* synthetic */ StampSheetV2Kt$$ExternalSyntheticLambda12(int i, StampSheetViewModel stampSheetViewModel, Function1 function1) {
        this.$r8$classId = i;
        this.f$0 = function1;
        this.f$1 = stampSheetViewModel;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.invoke(new StampSheetViewEvent.Done(this.f$1.selectedStamps));
                break;
            default:
                this.f$0.invoke(new StampSheetViewEvent.Done(this.f$1.selectedStamps));
                break;
        }
        return Unit.INSTANCE;
    }
}
