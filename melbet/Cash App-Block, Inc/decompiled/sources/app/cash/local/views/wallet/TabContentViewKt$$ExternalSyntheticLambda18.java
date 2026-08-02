package app.cash.local.views.wallet;

import app.cash.local.viewmodels.LocalBottomModalViewEvent;
import com.squareup.cash.blockers.viewmodels.AtmPickerAmountBlockerViewEvent;
import com.squareup.cash.payments.viewmodels.PersonalizePaymentStickersViewEvent;
import com.squareup.cash.phoneplans.PhonePlansHomeViewEvent;
import com.squareup.cash.transfers.viewmodels.RecurringReloadConfigurationViewEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final /* synthetic */ class TabContentViewKt$$ExternalSyntheticLambda18 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Function1 f$0;
    public final /* synthetic */ int f$1;

    public /* synthetic */ TabContentViewKt$$ExternalSyntheticLambda18(int i, int i2, Function1 function1) {
        this.$r8$classId = i2;
        this.f$0 = function1;
        this.f$1 = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        int i2 = this.f$1;
        Function1 function1 = this.f$0;
        switch (i) {
            case 0:
                function1.invoke(Integer.valueOf(i2));
                break;
            case 1:
                function1.invoke(Integer.valueOf(i2));
                break;
            case 2:
                function1.invoke(Integer.valueOf(i2));
                break;
            case 3:
                function1.invoke(new LocalBottomModalViewEvent.CtaClicked(i2));
                break;
            case 4:
                function1.invoke(Integer.valueOf(i2));
                break;
            case 5:
                function1.invoke(new AtmPickerAmountBlockerViewEvent.ConfirmAtmPickerOption(i2));
                break;
            case 6:
                function1.invoke(new AtmPickerAmountBlockerViewEvent.SelectAtmPickerOption(i2));
                break;
            case 7:
                function1.invoke(Integer.valueOf(i2));
                break;
            case 8:
                function1.invoke(Integer.valueOf(i2));
                break;
            case 9:
                function1.invoke(Integer.valueOf(i2));
                break;
            case 10:
                function1.invoke(new PersonalizePaymentStickersViewEvent.StickerSelected(i2));
                break;
            case 11:
                function1.invoke(new PhonePlansHomeViewEvent.LinkClicked(i2));
                break;
            case 12:
                function1.invoke(new RecurringReloadConfigurationViewEvent.DaySelected(i2));
                break;
            case 13:
                function1.invoke(new RecurringReloadConfigurationViewEvent.DaySelected(i2));
                break;
            default:
                function1.invoke(Integer.valueOf(i2));
                break;
        }
        return Unit.INSTANCE;
    }
}
