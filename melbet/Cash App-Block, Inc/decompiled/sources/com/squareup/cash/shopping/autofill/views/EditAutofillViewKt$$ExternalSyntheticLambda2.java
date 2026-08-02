package com.squareup.cash.shopping.autofill.views;

import com.squareup.cash.account.settings.viewmodels.ArcadeAutofillSettingsDetailViewEvent;
import com.squareup.cash.shopping.autofill.viewmodels.DialogViewModel;
import com.squareup.cash.shopping.autofill.viewmodels.EditAutofillViewEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes7.dex */
public final /* synthetic */ class EditAutofillViewKt$$ExternalSyntheticLambda2 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Function1 f$0;
    public final /* synthetic */ DialogViewModel f$1;

    public /* synthetic */ EditAutofillViewKt$$ExternalSyntheticLambda2(int i, DialogViewModel dialogViewModel, Function1 function1) {
        this.$r8$classId = i;
        this.f$0 = function1;
        this.f$1 = dialogViewModel;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.invoke(new EditAutofillViewEvent.DiscardChangesDismissed(this.f$1.title));
                break;
            case 1:
                this.f$0.invoke(new ArcadeAutofillSettingsDetailViewEvent.DiscardChangesDismissed(this.f$1.title));
                break;
            case 2:
                this.f$0.invoke(new ArcadeAutofillSettingsDetailViewEvent.DiscardChangesDismissed(this.f$1.title));
                break;
            default:
                this.f$0.invoke(new EditAutofillViewEvent.DiscardChangesDismissed(this.f$1.title));
                break;
        }
        return Unit.INSTANCE;
    }
}
