package com.squareup.cash.payments.views;

import androidx.compose.foundation.text.KeyboardActionScope;
import androidx.compose.ui.focus.FocusOwnerImpl;
import com.stripe.android.uicore.FocusManagerKtKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes8.dex */
public final /* synthetic */ class NoteInputViewKt$$ExternalSyntheticLambda2 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ FocusOwnerImpl f$0;

    public /* synthetic */ NoteInputViewKt$$ExternalSyntheticLambda2(FocusOwnerImpl focusOwnerImpl, int i) {
        this.$r8$classId = i;
        this.f$0 = focusOwnerImpl;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        ((KeyboardActionScope) obj).getClass();
        switch (i) {
            case 0:
                this.f$0.clearFocus(false);
                break;
            case 1:
                this.f$0.clearFocus(false);
                break;
            case 2:
                this.f$0.clearFocus(true);
                break;
            case 3:
                FocusManagerKtKt.m4065moveFocusSafelyMxy_nc0(this.f$0, 1);
                break;
            case 4:
                this.f$0.clearFocus(true);
                break;
            case 5:
                FocusManagerKtKt.m4065moveFocusSafelyMxy_nc0(this.f$0, 1);
                break;
            default:
                this.f$0.clearFocus(true);
                break;
        }
        return Unit.INSTANCE;
    }
}
