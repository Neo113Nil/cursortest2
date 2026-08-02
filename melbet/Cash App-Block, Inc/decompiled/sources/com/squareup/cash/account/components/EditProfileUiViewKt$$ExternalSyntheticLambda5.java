package com.squareup.cash.account.components;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Modifier;
import com.squareup.cash.account.components.customer.EditCustomerProfileKt;
import com.squareup.cash.account.settings.viewmodels.EditProfileViewModel$EditCustomerProfileViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final /* synthetic */ class EditProfileUiViewKt$$ExternalSyntheticLambda5 implements Function2 {
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ EditProfileViewModel$EditCustomerProfileViewModel f$0;
    public final /* synthetic */ Modifier f$1;
    public final /* synthetic */ Function1 f$2;

    public /* synthetic */ EditProfileUiViewKt$$ExternalSyntheticLambda5(EditProfileViewModel$EditCustomerProfileViewModel editProfileViewModel$EditCustomerProfileViewModel, Modifier modifier, Function1 function1, int i) {
        this.f$0 = editProfileViewModel$EditCustomerProfileViewModel;
        this.f$1 = modifier;
        this.f$2 = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        Composer composer = (Composer) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                AccountToDoKt.EditProfileView(Updater.updateChangedFlags(1), composer, this.f$1, this.f$0, this.f$2);
                break;
            default:
                EditCustomerProfileKt.EditCustomerProfile(Updater.updateChangedFlags(385), composer, this.f$1, this.f$0, this.f$2);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ EditProfileUiViewKt$$ExternalSyntheticLambda5(EditProfileViewModel$EditCustomerProfileViewModel editProfileViewModel$EditCustomerProfileViewModel, Function1 function1, Modifier modifier, int i) {
        this.f$0 = editProfileViewModel$EditCustomerProfileViewModel;
        this.f$2 = function1;
        this.f$1 = modifier;
    }
}
