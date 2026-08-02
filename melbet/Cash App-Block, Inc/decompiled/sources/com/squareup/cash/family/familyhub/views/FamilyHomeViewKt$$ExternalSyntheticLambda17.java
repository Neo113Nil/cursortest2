package com.squareup.cash.family.familyhub.views;

import com.squareup.cash.family.familyhub.viewmodels.FamilyHomeViewEvent;
import com.squareup.cash.family.familyhub.viewmodels.FamilyPendingRequestRowModel;
import com.squareup.cash.family.familyhub.viewmodels.FamilyPendingRequestsViewEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public final /* synthetic */ class FamilyHomeViewKt$$ExternalSyntheticLambda17 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ FamilyPendingRequestRowModel f$0;
    public final /* synthetic */ Function1 f$1;

    public /* synthetic */ FamilyHomeViewKt$$ExternalSyntheticLambda17(FamilyPendingRequestRowModel familyPendingRequestRowModel, Function1 function1, int i) {
        this.$r8$classId = i;
        this.f$0 = familyPendingRequestRowModel;
        this.f$1 = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        Function1 function1 = this.f$1;
        FamilyPendingRequestRowModel familyPendingRequestRowModel = this.f$0;
        switch (i) {
            case 0:
                if (familyPendingRequestRowModel instanceof FamilyPendingRequestRowModel.Loaded) {
                    FamilyPendingRequestRowModel.Loaded loaded = (FamilyPendingRequestRowModel.Loaded) familyPendingRequestRowModel;
                    function1.invoke(new FamilyHomeViewEvent.TapPendingRequest(loaded.buttonUrl, loaded.requesterCustomerToken));
                }
                break;
            case 1:
                if (familyPendingRequestRowModel instanceof FamilyPendingRequestRowModel.Loaded) {
                    FamilyPendingRequestRowModel.Loaded loaded2 = (FamilyPendingRequestRowModel.Loaded) familyPendingRequestRowModel;
                    function1.invoke(new FamilyHomeViewEvent.TapPendingRequest(loaded2.buttonUrl, loaded2.requesterCustomerToken));
                }
                break;
            default:
                if (familyPendingRequestRowModel instanceof FamilyPendingRequestRowModel.Loaded) {
                    FamilyPendingRequestRowModel.Loaded loaded3 = (FamilyPendingRequestRowModel.Loaded) familyPendingRequestRowModel;
                    function1.invoke(new FamilyPendingRequestsViewEvent.TapOnPendingRequest(loaded3.buttonUrl, loaded3.requesterCustomerToken));
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
