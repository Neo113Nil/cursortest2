package com.squareup.cash.genericelements.components.base;

import com.squareup.cash.genericelements.viewmodels.GenericBaseViewModel;
import com.squareup.cash.genericelements.viewmodels.GenericTreeElementsViewEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public final /* synthetic */ class GenericArcadeButtonKt$$ExternalSyntheticLambda1 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ GenericBaseViewModel.ArcadeButtonViewModel f$0;
    public final /* synthetic */ Function1 f$1;

    public /* synthetic */ GenericArcadeButtonKt$$ExternalSyntheticLambda1(GenericBaseViewModel.ArcadeButtonViewModel arcadeButtonViewModel, Function1 function1, int i) {
        this.$r8$classId = i;
        this.f$0 = arcadeButtonViewModel;
        this.f$1 = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        Function1 function1 = this.f$1;
        GenericBaseViewModel.ArcadeButtonViewModel arcadeButtonViewModel = this.f$0;
        switch (i) {
            case 0:
                GenericTreeElementsViewEvent genericTreeElementsViewEvent = arcadeButtonViewModel.event;
                if (genericTreeElementsViewEvent != null) {
                    function1.invoke(genericTreeElementsViewEvent);
                }
                break;
            case 1:
                GenericTreeElementsViewEvent genericTreeElementsViewEvent2 = arcadeButtonViewModel.event;
                if (genericTreeElementsViewEvent2 != null) {
                    function1.invoke(genericTreeElementsViewEvent2);
                }
                break;
            default:
                GenericTreeElementsViewEvent genericTreeElementsViewEvent3 = arcadeButtonViewModel.event;
                if (genericTreeElementsViewEvent3 != null) {
                    function1.invoke(genericTreeElementsViewEvent3);
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
