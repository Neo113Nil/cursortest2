package com.squareup.cash.deposits.physical.view.onboarding;

import androidx.compose.foundation.pager.PagerState;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import com.squareup.cash.deposits.physical.viewmodels.onboarding.PaperMoneyDepositOnboardingEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public final /* synthetic */ class PaperMoneyDepositOnboardingViewKt$$ExternalSyntheticLambda3 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Function1 f$0;
    public final /* synthetic */ PagerState f$1;

    public /* synthetic */ PaperMoneyDepositOnboardingViewKt$$ExternalSyntheticLambda3(Function1 function1, PagerState pagerState, int i) {
        this.$r8$classId = i;
        this.f$0 = function1;
        this.f$1 = pagerState;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.invoke(new PaperMoneyDepositOnboardingEvent.Close(((ParcelableSnapshotMutableIntState) this.f$1.scrollPosition.elementTypes).getIntValue()));
                break;
            default:
                this.f$0.invoke(new PaperMoneyDepositOnboardingEvent.ButtonClick(((ParcelableSnapshotMutableIntState) this.f$1.scrollPosition.elementTypes).getIntValue()));
                break;
        }
        return Unit.INSTANCE;
    }
}
