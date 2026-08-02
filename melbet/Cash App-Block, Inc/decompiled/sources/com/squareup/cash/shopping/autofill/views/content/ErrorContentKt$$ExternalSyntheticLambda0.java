package com.squareup.cash.shopping.autofill.views.content;

import com.squareup.cash.shopping.autofill.viewmodels.AutofillViewEvent;
import com.squareup.cash.shopping.autofill.viewmodels.AutofillViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes7.dex */
public final /* synthetic */ class ErrorContentKt$$ExternalSyntheticLambda0 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Function1 f$0;
    public final /* synthetic */ AutofillViewModel.Error f$1;

    public /* synthetic */ ErrorContentKt$$ExternalSyntheticLambda0(Function1 function1, AutofillViewModel.Error error, int i) {
        this.$r8$classId = i;
        this.f$0 = function1;
        this.f$1 = error;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.invoke(new AutofillViewEvent.ErrorDialogDismissed(this.f$1.title));
                break;
            default:
                this.f$0.invoke(new AutofillViewEvent.ErrorDialogDismissed(this.f$1.title));
                break;
        }
        return Unit.INSTANCE;
    }
}
