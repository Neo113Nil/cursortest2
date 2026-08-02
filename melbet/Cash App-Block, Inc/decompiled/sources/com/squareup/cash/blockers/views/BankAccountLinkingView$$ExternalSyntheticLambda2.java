package com.squareup.cash.blockers.views;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import com.squareup.cash.blockers.viewmodels.BankAccountLinkingViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final /* synthetic */ class BankAccountLinkingView$$ExternalSyntheticLambda2 implements Function2 {
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ BankAccountLinkingViewModel f$0;
    public final /* synthetic */ Function1 f$1;
    public final /* synthetic */ BankAccountLinkingView f$2;

    public /* synthetic */ BankAccountLinkingView$$ExternalSyntheticLambda2(BankAccountLinkingViewModel bankAccountLinkingViewModel, Function1 function1, BankAccountLinkingView bankAccountLinkingView) {
        this.f$0 = bankAccountLinkingViewModel;
        this.f$1 = function1;
        this.f$2 = bankAccountLinkingView;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        BankAccountLinkingView bankAccountLinkingView = this.f$2;
        Composer composer = (Composer) obj;
        Integer num = (Integer) obj2;
        switch (i) {
            case 0:
                int intValue = num.intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    SsnViewKt.BankAccountLinking(this.f$0, this.f$1, bankAccountLinkingView.focusRequester, null, gapComposer, 0);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            default:
                num.getClass();
                bankAccountLinkingView.Content(this.f$0, this.f$1, composer, Updater.updateChangedFlags(1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ BankAccountLinkingView$$ExternalSyntheticLambda2(BankAccountLinkingView bankAccountLinkingView, BankAccountLinkingViewModel bankAccountLinkingViewModel, Function1 function1, int i) {
        this.f$2 = bankAccountLinkingView;
        this.f$0 = bankAccountLinkingViewModel;
        this.f$1 = function1;
    }
}
