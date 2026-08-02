package com.squareup.cash.blockers.views;

import androidx.compose.ui.platform.DelegatingSoftwareKeyboardController;
import com.squareup.cash.blockers.viewmodels.RegisterAliasViewEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final /* synthetic */ class RegisterAliasViewKt$$ExternalSyntheticLambda7 implements Function0 {
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ DelegatingSoftwareKeyboardController f$0;
    public final /* synthetic */ Function1 f$1;

    public /* synthetic */ RegisterAliasViewKt$$ExternalSyntheticLambda7(DelegatingSoftwareKeyboardController delegatingSoftwareKeyboardController, Function1 function1) {
        this.f$0 = delegatingSoftwareKeyboardController;
        this.f$1 = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        DelegatingSoftwareKeyboardController delegatingSoftwareKeyboardController = this.f$0;
        Function1 function1 = this.f$1;
        switch (i) {
            case 0:
                if (delegatingSoftwareKeyboardController != null) {
                    delegatingSoftwareKeyboardController.hide();
                }
                function1.invoke(RegisterAliasViewEvent.GoBack.INSTANCE);
                break;
            default:
                function1.invoke(new RegisterAliasViewEvent.HelpClick());
                if (delegatingSoftwareKeyboardController != null) {
                    delegatingSoftwareKeyboardController.hide();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ RegisterAliasViewKt$$ExternalSyntheticLambda7(Function1 function1, DelegatingSoftwareKeyboardController delegatingSoftwareKeyboardController) {
        this.f$1 = function1;
        this.f$0 = delegatingSoftwareKeyboardController;
    }
}
