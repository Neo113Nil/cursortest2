package com.squareup.cash.shopping.autofill.views;

import com.squareup.cash.account.settings.viewmodels.ArcadeAutofillSettingsDetailViewEvent;
import com.squareup.cash.shopping.autofill.viewmodels.EditAutofillViewEvent;
import com.squareup.cash.shopping.autofill.viewmodels.InputViewModel;
import com.squareup.util.android.PhoneNumbers;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;

/* loaded from: classes7.dex */
public final /* synthetic */ class EditAutofillViewKt$$ExternalSyntheticLambda11 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ InputViewModel.InputFieldViewModel f$0;
    public final /* synthetic */ Function1 f$1;

    public /* synthetic */ EditAutofillViewKt$$ExternalSyntheticLambda11(InputViewModel.InputFieldViewModel inputFieldViewModel, Function1 function1, int i) {
        this.$r8$classId = i;
        this.f$0 = inputFieldViewModel;
        this.f$1 = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        Function1 function1 = this.f$1;
        InputViewModel.InputFieldViewModel inputFieldViewModel = this.f$0;
        String str = (String) obj;
        switch (i) {
            case 0:
                str.getClass();
                InputViewModel.InputType inputType = inputFieldViewModel.f1203type;
                String str2 = inputFieldViewModel.value;
                if (inputType == InputViewModel.InputType.PHONE && str2 != null && (((str2.length() == 10 && !StringsKt.startsWith$default(str2, '1')) || (str2.length() == 11 && StringsKt.startsWith$default(str2, '1'))) && PhoneNumbers.normalize(str2) != null && str2.length() < str.length())) {
                    break;
                } else {
                    function1.invoke(new EditAutofillViewEvent.InputChanged(inputType, str));
                    break;
                }
            default:
                str.getClass();
                InputViewModel.InputType inputType2 = inputFieldViewModel.f1203type;
                String str3 = inputFieldViewModel.value;
                if (inputType2 == InputViewModel.InputType.PHONE && str3 != null && (((str3.length() == 10 && !StringsKt.startsWith$default(str3, '1')) || (str3.length() == 11 && StringsKt.startsWith$default(str3, '1'))) && PhoneNumbers.normalize(str3) != null && str3.length() < str.length())) {
                    break;
                } else {
                    function1.invoke(new ArcadeAutofillSettingsDetailViewEvent.InputChanged(inputType2, str));
                    break;
                }
        }
        return Unit.INSTANCE;
    }
}
