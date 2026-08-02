package com.squareup.cash.payments.views;

import com.squareup.cash.afterpayapplet.viewmodels.viewevents.AfterpayAppletHomeViewEvent;
import com.squareup.cash.borrow.viewmodels.BorrowHomeOverlayEvent;
import com.squareup.cash.investing.viewmodels.search.InvestingSearchViewEvent;
import com.squareup.cash.payments.viewmodels.PersonalizePaymentRecipientViewEvent;
import com.squareup.cash.payments.viewmodels.QuickPayViewEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public final class QuickPayViewKt$QuickPay$1$1$1$2$2$1$1 implements Function0 {
    public final /* synthetic */ Function1 $onEvent;
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ QuickPayViewKt$QuickPay$1$1$1$2$2$1$1(int i, Function1 function1) {
        this.$r8$classId = i;
        this.$onEvent = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        Function1 function1 = this.$onEvent;
        switch (i) {
            case 0:
                function1.invoke(QuickPayViewEvent.SelectInstrumentClick.INSTANCE);
                break;
            case 1:
                function1.invoke(AfterpayAppletHomeViewEvent.PrepurchaseToggleViewed.INSTANCE);
                break;
            case 2:
                function1.invoke(BorrowHomeOverlayEvent.BulletinInfoOverlayEvent.Dismiss.INSTANCE);
                break;
            case 3:
                function1.invoke(InvestingSearchViewEvent.ResetFiltersClicked.INSTANCE);
                break;
            case 4:
                function1.invoke(PersonalizePaymentRecipientViewEvent.ReceiptTapped.INSTANCE);
                break;
            case 5:
                function1.invoke(PersonalizePaymentRecipientViewEvent.ShowMoreReactions.INSTANCE);
                break;
            case 6:
                function1.invoke(PersonalizePaymentRecipientViewEvent.DismissOverlay.INSTANCE);
                break;
            default:
                function1.invoke(PersonalizePaymentRecipientViewEvent.Close.INSTANCE);
                break;
        }
        return Unit.INSTANCE;
    }
}
