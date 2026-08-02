package com.squareup.cash.payments.views;

import com.squareup.cash.recipients.viewmodels.RecipientViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public final /* synthetic */ class RecipientListViewKt$$ExternalSyntheticLambda10 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Function1 f$0;
    public final /* synthetic */ RecipientViewModel f$1;

    public /* synthetic */ RecipientListViewKt$$ExternalSyntheticLambda10(Function1 function1, RecipientViewModel recipientViewModel, int i) {
        this.$r8$classId = i;
        this.f$0 = function1;
        this.f$1 = recipientViewModel;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        RecipientViewModel recipientViewModel = this.f$1;
        Function1 function1 = this.f$0;
        switch (i) {
            case 0:
                function1.invoke(recipientViewModel);
                return Unit.INSTANCE;
            case 1:
                function1.invoke(recipientViewModel);
                return Unit.INSTANCE;
            case 2:
                function1.invoke(recipientViewModel);
                return Unit.INSTANCE;
            case 3:
                function1.invoke(recipientViewModel);
                return Unit.INSTANCE;
            default:
                function1.invoke(recipientViewModel);
                return Boolean.TRUE;
        }
    }
}
