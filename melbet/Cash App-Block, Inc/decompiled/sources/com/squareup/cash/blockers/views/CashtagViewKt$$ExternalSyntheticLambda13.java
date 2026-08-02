package com.squareup.cash.blockers.views;

import androidx.compose.runtime.MutableState;
import androidx.compose.ui.text.input.TextFieldValue;
import app.cash.local.primitives.LocationToken;
import app.cash.local.viewmodels.fulfillment.FulfillmentPickerViewEvent;
import app.cash.local.viewmodels.marketingmessages.MarketingMessageViewEvent;
import com.squareup.cash.afterpayapplet.viewmodels.viewevents.AfterpayAppletMerchantSheetViewEvent;
import com.squareup.cash.banking.viewmodels.BetterOverdraftViewEvent;
import com.squareup.cash.bitcoin.viewmodels.map.BitcoinLocationFilter;
import com.squareup.cash.blockers.viewmodels.BankAccountLinkingViewEvent;
import com.squareup.cash.blockers.viewmodels.CardActivationQrViewEvent;
import com.squareup.cash.blockers.viewmodels.CashtagViewEvent;
import com.squareup.cash.deposits.physical.viewmodels.map.PaperMoneyDepositMapEvent;
import com.squareup.cash.earnings.viewmodels.home.EarningsHomeViewModel;
import com.squareup.cash.investing.components.custom.order.GraphState;
import com.squareup.cash.investing.viewmodels.custom.order.InvestingCustomOrderViewEvent;
import com.squareup.cash.investing.viewmodels.ordertype.autoinvest.InvestingFrequencyOption;
import com.squareup.cash.investing.viewmodels.ordertype.autoinvest.InvestingRecurringFrequencyPickerViewEvent;
import com.squareup.cash.moneybot.viewmodels.MoneybotPreambleEditorViewEvent;
import com.squareup.cash.moneybot.viewmodels.chat.MoneybotChatViewEvent;
import com.squareup.cash.multiplatform.investing.PriceValue;
import com.squareup.cash.onboarding.accountpicker.viewmodels.AliasPickerViewEvent;
import com.squareup.cash.paychecks.viewmodels.PaychecksHomeViewEvent;
import com.squareup.cash.work.identifiers.JobIdentifier;
import com.squareup.cash.work.identifiers.LocationIdentifier;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt__StringsJVMKt;

/* loaded from: classes4.dex */
public final /* synthetic */ class CashtagViewKt$$ExternalSyntheticLambda13 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Function1 f$0;
    public final /* synthetic */ MutableState f$1;

    public /* synthetic */ CashtagViewKt$$ExternalSyntheticLambda13(MutableState mutableState, Function1 function1, int i) {
        this.$r8$classId = i;
        this.f$1 = mutableState;
        this.f$0 = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        String obj;
        int i = this.$r8$classId;
        MutableState mutableState = this.f$1;
        Function1 function1 = this.f$0;
        switch (i) {
            case 0:
                function1.invoke(new CashtagViewEvent.NextClick(((TextFieldValue) mutableState.getValue()).annotatedString.text));
                break;
            case 1:
                LocationToken locationToken = (LocationToken) mutableState.getValue();
                String str = locationToken != null ? locationToken.value : null;
                str.getClass();
                function1.invoke(new FulfillmentPickerViewEvent.LocationSelected(str));
                break;
            case 2:
                mutableState.setValue(Boolean.TRUE);
                function1.invoke(MarketingMessageViewEvent.OfferSheetOpened.INSTANCE);
                break;
            case 3:
                if (!((Boolean) mutableState.getValue()).booleanValue()) {
                    function1.invoke(AfterpayAppletMerchantSheetViewEvent.SheetViewed.INSTANCE);
                    mutableState.setValue(Boolean.TRUE);
                }
                break;
            case 4:
                function1.invoke(BetterOverdraftViewEvent.SupportLinkClicked.INSTANCE);
                mutableState.setValue(Boolean.TRUE);
                break;
            case 5:
                function1.invoke((BitcoinLocationFilter) mutableState.getValue());
                break;
            case 6:
                String str2 = ((TextFieldValue) mutableState.getValue()).annotatedString.text;
                String str3 = "";
                if (str2 != null && (obj = str2.toString()) != null) {
                    str3 = StringsKt__StringsJVMKt.replace$default(obj, "-", "");
                }
                function1.invoke(new BankAccountLinkingViewEvent.Submit(str3));
                break;
            case 7:
                mutableState.setValue(Boolean.TRUE);
                function1.invoke(CardActivationQrViewEvent.Exit.INSTANCE);
                break;
            case 8:
                mutableState.setValue(Boolean.TRUE);
                function1.invoke(PaperMoneyDepositMapEvent.ViewFilters.INSTANCE);
                break;
            case 9:
                function1.invoke((List) mutableState.getValue());
                break;
            case 10:
                function1.invoke((EarningsHomeViewModel.EarnerModeSheet.DurationOption) mutableState.getValue());
                break;
            case 11:
                function1.invoke(new InvestingCustomOrderViewEvent.MetricPressed(((GraphState) mutableState.getValue()).currentPrice, ((PriceValue) ((GraphState) mutableState.getValue()).selectedPrice$delegate.getValue()).value));
                break;
            case 12:
                function1.invoke(new InvestingRecurringFrequencyPickerViewEvent.ConfirmPressed((InvestingFrequencyOption) mutableState.getValue()));
                break;
            case 13:
                mutableState.setValue(Boolean.valueOf(!((Boolean) mutableState.getValue()).booleanValue()));
                Boolean bool = (Boolean) mutableState.getValue();
                bool.getClass();
                function1.invoke(bool);
                break;
            case 14:
                Boolean bool2 = Boolean.FALSE;
                mutableState.setValue(bool2);
                function1.invoke(bool2);
                break;
            case 15:
                mutableState.setValue(Boolean.FALSE);
                function1.invoke(MoneybotChatViewEvent.RequestCameraCapture.INSTANCE);
                break;
            case 16:
                function1.invoke(new MoneybotPreambleEditorViewEvent.Save((String) mutableState.getValue()));
                break;
            case 17:
                function1.invoke(new AliasPickerViewEvent.AliasSelected((String) mutableState.getValue()));
                break;
            case 18:
                mutableState.setValue(Boolean.TRUE);
                function1.invoke(PaychecksHomeViewEvent.AlreadySetUpDirectDepositClick.INSTANCE);
                break;
            case 19:
                JobIdentifier jobIdentifier = (JobIdentifier) mutableState.getValue();
                if (jobIdentifier != null) {
                    function1.invoke(jobIdentifier);
                }
                break;
            case 20:
                LocationIdentifier locationIdentifier = (LocationIdentifier) mutableState.getValue();
                if (locationIdentifier != null) {
                    function1.invoke(locationIdentifier);
                }
                break;
            case 21:
                Object value = mutableState.getValue();
                if (value != null) {
                    function1.invoke(value);
                }
                break;
            default:
                function1.invoke((Map) mutableState.getValue());
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ CashtagViewKt$$ExternalSyntheticLambda13(Function1 function1, MutableState mutableState, int i) {
        this.$r8$classId = i;
        this.f$0 = function1;
        this.f$1 = mutableState;
    }
}
