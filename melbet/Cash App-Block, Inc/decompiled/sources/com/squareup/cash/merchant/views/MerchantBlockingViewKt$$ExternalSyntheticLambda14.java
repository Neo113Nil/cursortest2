package com.squareup.cash.merchant.views;

import com.squareup.cash.merchant.viewmodels.MerchantBlockingViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public final /* synthetic */ class MerchantBlockingViewKt$$ExternalSyntheticLambda14 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Function1 f$0;
    public final /* synthetic */ MerchantBlockingViewModel.MerchantBlockingSectionViewModel.SectionList.SectionLoaded.SectionRow f$1;

    public /* synthetic */ MerchantBlockingViewKt$$ExternalSyntheticLambda14(Function1 function1, MerchantBlockingViewModel.MerchantBlockingSectionViewModel.SectionList.SectionLoaded.SectionRow sectionRow, int i) {
        this.$r8$classId = i;
        this.f$0 = function1;
        this.f$1 = sectionRow;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        MerchantBlockingViewModel.MerchantBlockingSectionViewModel.SectionList.SectionLoaded.SectionRow sectionRow = this.f$1;
        Function1 function1 = this.f$0;
        switch (i) {
            case 0:
                function1.invoke(sectionRow.rowAction);
                break;
            default:
                function1.invoke(sectionRow.button.action);
                break;
        }
        return Unit.INSTANCE;
    }
}
