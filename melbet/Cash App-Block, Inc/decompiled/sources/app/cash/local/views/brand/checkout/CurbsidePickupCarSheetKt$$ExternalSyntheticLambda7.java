package app.cash.local.views.brand.checkout;

import androidx.compose.foundation.text.input.TextFieldState;
import app.cash.local.viewmodels.CurbsidePickupCarViewEvent;
import com.squareup.cash.moneybot.viewmodels.textinput.MoneybotTextInputViewEvent;
import com.squareup.cash.work.viewmodels.DeclareCashTipBottomSheetViewEvent;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt__StringsJVMKt;

/* loaded from: classes3.dex */
public final /* synthetic */ class CurbsidePickupCarSheetKt$$ExternalSyntheticLambda7 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Function1 f$0;
    public final /* synthetic */ TextFieldState f$1;

    public /* synthetic */ CurbsidePickupCarSheetKt$$ExternalSyntheticLambda7(int i, TextFieldState textFieldState, Function1 function1) {
        this.$r8$classId = i;
        this.f$0 = function1;
        this.f$1 = textFieldState;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        TextFieldState textFieldState = this.f$1;
        Function1 function1 = this.f$0;
        switch (i) {
            case 0:
                function1.invoke(new CurbsidePickupCarViewEvent.Confirm(textFieldState.getValue$foundation().text.toString()));
                break;
            case 1:
                function1.invoke(textFieldState.getValue$foundation().text.toString());
                break;
            case 2:
                function1.invoke(new MoneybotTextInputViewEvent.ContinueTapped(textFieldState.getValue$foundation().text.toString()));
                break;
            case 3:
                function1.invoke(new DeclareCashTipBottomSheetViewEvent.SaveClicked(textFieldState.getValue$foundation().text.toString()));
                break;
            default:
                String obj = textFieldState.getValue$foundation().text.toString();
                Locale locale = Locale.getDefault();
                locale.getClass();
                obj.getClass();
                function1.invoke(StringsKt__StringsJVMKt.replace(obj, DecimalFormatSymbols.getInstance(locale).getDecimalSeparator(), '.', false));
                break;
        }
        return Unit.INSTANCE;
    }
}
