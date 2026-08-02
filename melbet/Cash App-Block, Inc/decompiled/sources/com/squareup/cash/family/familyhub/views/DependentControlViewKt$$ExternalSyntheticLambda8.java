package com.squareup.cash.family.familyhub.views;

import com.squareup.cash.family.familyhub.backend.api.ControlType;
import com.squareup.cash.family.familyhub.viewmodels.DependentControlViewEvent$P2PEvent$AllowlistToggleChanged;
import com.squareup.cash.family.familyhub.viewmodels.DependentControlViewEvent$ToggleEvent$ToggleChanged;
import com.squareup.cash.family.familyhub.viewmodels.DependentControlsToggleViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public final /* synthetic */ class DependentControlViewKt$$ExternalSyntheticLambda8 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Function1 f$0;
    public final /* synthetic */ DependentControlsToggleViewModel f$1;

    public /* synthetic */ DependentControlViewKt$$ExternalSyntheticLambda8(Function1 function1, DependentControlsToggleViewModel dependentControlsToggleViewModel, int i) {
        this.$r8$classId = i;
        this.f$0 = function1;
        this.f$1 = dependentControlsToggleViewModel;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        DependentControlsToggleViewModel dependentControlsToggleViewModel = this.f$1;
        Function1 function1 = this.f$0;
        switch (i) {
            case 0:
                function1.invoke(new DependentControlViewEvent$ToggleEvent$ToggleChanged(!dependentControlsToggleViewModel.toggleChecked, ControlType.CASH_CARD, null));
                break;
            default:
                function1.invoke(new DependentControlViewEvent$P2PEvent$AllowlistToggleChanged(!dependentControlsToggleViewModel.toggleChecked));
                break;
        }
        return Unit.INSTANCE;
    }
}
