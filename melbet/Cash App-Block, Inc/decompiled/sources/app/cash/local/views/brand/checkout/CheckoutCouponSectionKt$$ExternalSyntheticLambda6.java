package app.cash.local.views.brand.checkout;

import androidx.compose.foundation.text.input.KeyboardActionHandler;
import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.foundation.text.input.TextFieldStateKt;
import bo.app.q2$$ExternalSyntheticLambda8;
import com.squareup.cash.moneybot.viewmodels.textinput.MoneybotTextInputViewEvent;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;

/* loaded from: classes3.dex */
public final /* synthetic */ class CheckoutCouponSectionKt$$ExternalSyntheticLambda6 implements KeyboardActionHandler {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ TextFieldState f$0;
    public final /* synthetic */ Function1 f$1;

    public /* synthetic */ CheckoutCouponSectionKt$$ExternalSyntheticLambda6(int i, TextFieldState textFieldState, Function1 function1) {
        this.$r8$classId = i;
        this.f$0 = textFieldState;
        this.f$1 = function1;
    }

    @Override // androidx.compose.foundation.text.input.KeyboardActionHandler
    public final void onKeyboardAction(q2$$ExternalSyntheticLambda8 q2__externalsyntheticlambda8) {
        int i = this.$r8$classId;
        Function1 function1 = this.f$1;
        TextFieldState textFieldState = this.f$0;
        switch (i) {
            case 0:
                String obj = textFieldState.getValue$foundation().text.toString();
                if (!StringsKt.isBlank(obj)) {
                    function1.invoke(obj);
                    TextFieldStateKt.clearText(textFieldState);
                    break;
                }
                break;
            default:
                String obj2 = textFieldState.getValue$foundation().text.toString();
                if (obj2.length() <= 0) {
                    obj2 = null;
                }
                if (obj2 != null) {
                    function1.invoke(new MoneybotTextInputViewEvent.ContinueTapped(obj2));
                    break;
                }
                break;
        }
    }
}
