package app.cash.local.views.brand.checkout;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Modifier;
import androidx.core.content.ContextCompat$Api28Impl;
import com.squareup.cash.account.components.AccountToDoKt;
import com.squareup.cash.bitcoin.views.applet.balance.BitcoinBalanceWidgetKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class CheckoutTipSectionKt$$ExternalSyntheticLambda13 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Modifier f$0;
    public final /* synthetic */ String f$1;
    public final /* synthetic */ Function1 f$2;

    public /* synthetic */ CheckoutTipSectionKt$$ExternalSyntheticLambda13(Modifier modifier, Function1 function1, String str, int i) {
        this.$r8$classId = 3;
        this.f$0 = modifier;
        this.f$2 = function1;
        this.f$1 = str;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        String str = this.f$1;
        Function1 function1 = this.f$2;
        Modifier modifier = this.f$0;
        Composer composer = (Composer) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                CheckoutTipSectionKt.CustomAmountInput(Updater.updateChangedFlags(7), composer, modifier, str, function1);
                break;
            case 1:
                AccountToDoKt.SwitchBusinessProfile(Updater.updateChangedFlags(391), composer, modifier, str, function1);
                break;
            case 2:
                BitcoinBalanceWidgetKt.BalanceSubAmount(Updater.updateChangedFlags(1), composer, modifier, str, function1);
                break;
            default:
                ContextCompat$Api28Impl.Emoji(Updater.updateChangedFlags(7), composer, modifier, str, function1);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ CheckoutTipSectionKt$$ExternalSyntheticLambda13(int i, int i2, Modifier modifier, String str, Function1 function1) {
        this.$r8$classId = i2;
        this.f$0 = modifier;
        this.f$1 = str;
        this.f$2 = function1;
    }

    public /* synthetic */ CheckoutTipSectionKt$$ExternalSyntheticLambda13(Function1 function1, String str, Modifier modifier, int i) {
        this.$r8$classId = 2;
        this.f$2 = function1;
        this.f$1 = str;
        this.f$0 = modifier;
    }
}
