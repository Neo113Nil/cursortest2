package com.squareup.cash.payments.presenters;

import androidx.compose.runtime.MutableState;
import com.google.maps.android.compose.GoogleMapKt;
import com.squareup.cash.db.InstrumentLinkingConfig;
import com.squareup.cash.db2.profile.Profile;
import com.squareup.cash.instruments.backend.real.RealInstrumentSelectorManager;
import com.squareup.cash.instruments.common.BalanceSnapshot;
import com.squareup.cash.instruments.utils.SelectPaymentInstrumentOption;
import com.squareup.cash.instruments.viewmodels.InstrumentSelectionRowViewModel;
import com.squareup.cash.payments.screens.PaymentScreens;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.api.CashInstrumentType;
import com.squareup.protos.franklin.api.InstrumentSelection;
import com.squareup.protos.franklin.common.Orientation;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class MainPaymentPresenter$models$5$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ MutableState $actionText$delegate;
    public final /* synthetic */ MutableState $balanceSnapshot$delegate;
    public final /* synthetic */ MutableState $hasActiveSponsorship$delegate;
    public final /* synthetic */ MutableState $hasPassedIdv;
    public final /* synthetic */ MutableState $instrumentLinkingConfig;
    public final /* synthetic */ MutableState $instrumentSelection$delegate;
    public final /* synthetic */ MutableState $instrumentSelectionRowViewModel$delegate;
    public final /* synthetic */ MutableState $instruments$delegate;
    public final /* synthetic */ MutableState $isInstrumentSelectionOpen$delegate;
    public final /* synthetic */ MutableState $profile$delegate;
    public final /* synthetic */ List $recipients;
    public final /* synthetic */ MutableState $subtitle$delegate;
    public final /* synthetic */ MainPaymentPresenter this$0;

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PaymentScreens.MainPayment.SendCryptoCurrencyType.values().length];
            try {
                PaymentScreens.MainPayment.SendCryptoCurrencyType sendCryptoCurrencyType = PaymentScreens.MainPayment.SendCryptoCurrencyType.BTC;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                PaymentScreens.MainPayment.SendCryptoCurrencyType sendCryptoCurrencyType2 = PaymentScreens.MainPayment.SendCryptoCurrencyType.BTC;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainPaymentPresenter$models$5$1(MainPaymentPresenter mainPaymentPresenter, List list, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4, MutableState mutableState5, MutableState mutableState6, MutableState mutableState7, MutableState mutableState8, MutableState mutableState9, MutableState mutableState10, MutableState mutableState11, Continuation continuation) {
        super(2, continuation);
        this.this$0 = mainPaymentPresenter;
        this.$recipients = list;
        this.$instrumentLinkingConfig = mutableState;
        this.$hasPassedIdv = mutableState2;
        this.$instrumentSelection$delegate = mutableState3;
        this.$profile$delegate = mutableState4;
        this.$balanceSnapshot$delegate = mutableState5;
        this.$instruments$delegate = mutableState6;
        this.$hasActiveSponsorship$delegate = mutableState7;
        this.$subtitle$delegate = mutableState8;
        this.$isInstrumentSelectionOpen$delegate = mutableState9;
        this.$actionText$delegate = mutableState10;
        this.$instrumentSelectionRowViewModel$delegate = mutableState11;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MainPaymentPresenter$models$5$1(this.this$0, this.$recipients, this.$instrumentLinkingConfig, this.$hasPassedIdv, this.$instrumentSelection$delegate, this.$profile$delegate, this.$balanceSnapshot$delegate, this.$instruments$delegate, this.$hasActiveSponsorship$delegate, this.$subtitle$delegate, this.$isInstrumentSelectionOpen$delegate, this.$actionText$delegate, this.$instrumentSelectionRowViewModel$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((MainPaymentPresenter$models$5$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x025a, code lost:
    
        if (r7 == null) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0286, code lost:
    
        if (r4 != false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0297, code lost:
    
        if ((r0 != null ? r0.booleanValue() : false) != false) goto L68;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12, types: [java.lang.Object] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Boolean bool;
        SelectPaymentInstrumentOption.ExistingOption.ExistingInstrument existingInstrument;
        SelectPaymentInstrumentOption.ExistingOption.ExistingInstrument existingInstrument2;
        Object obj2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        SafeTrace.throwOnFailure(obj);
        MainPaymentPresenter mainPaymentPresenter = this.this$0;
        PaymentScreens.MainPayment mainPayment = mainPaymentPresenter.args;
        Orientation orientation = mainPayment.orientation;
        MutableState mutableState = this.$instrumentSelection$delegate;
        InstrumentSelection instrumentSelection = (InstrumentSelection) mutableState.getValue();
        MutableState mutableState2 = this.$profile$delegate;
        Profile profile = (Profile) mutableState2.getValue();
        CashInstrumentType cashInstrumentType = mainPayment.instrumentType;
        Money money = mainPayment.amountInProfileCurrency;
        MutableState mutableState3 = this.$balanceSnapshot$delegate;
        BalanceSnapshot balanceSnapshot = (BalanceSnapshot) mutableState3.getValue();
        MutableState mutableState4 = this.$instruments$delegate;
        List list = (List) mutableState4.getValue();
        MutableState mutableState5 = this.$instrumentLinkingConfig;
        InstrumentLinkingConfig instrumentLinkingConfig = (InstrumentLinkingConfig) mutableState5.getValue();
        MutableState mutableState6 = this.$hasPassedIdv;
        Boolean bool2 = (Boolean) mutableState6.getValue();
        boolean z = mainPayment.isFiatPayment;
        MutableState mutableState7 = this.$hasActiveSponsorship$delegate;
        mutableState.setValue(GoogleMapKt.loadInstrument(orientation, this.$recipients, instrumentSelection, profile, cashInstrumentType, money, balanceSnapshot, list, instrumentLinkingConfig, bool2, z, ((Boolean) mutableState7.getValue()).booleanValue(), false));
        RealInstrumentSelectorManager realInstrumentSelectorManager = mainPaymentPresenter.instrumentSelectorManager;
        Orientation orientation2 = mainPayment.orientation;
        InstrumentSelection instrumentSelection2 = (InstrumentSelection) mutableState.getValue();
        CashInstrumentType cashInstrumentType2 = mainPayment.instrumentType;
        Money money2 = mainPayment.amountInProfileCurrency;
        Profile profile2 = (Profile) mutableState2.getValue();
        BalanceSnapshot balanceSnapshot2 = (BalanceSnapshot) mutableState3.getValue();
        List list2 = (List) mutableState4.getValue();
        InstrumentLinkingConfig instrumentLinkingConfig2 = (InstrumentLinkingConfig) mutableState5.getValue();
        Boolean bool3 = (Boolean) mutableState6.getValue();
        boolean booleanValue = ((Boolean) mutableState7.getValue()).booleanValue();
        boolean z2 = true;
        String toolbarSubtitle = realInstrumentSelectorManager.getToolbarSubtitle(orientation2, this.$recipients, instrumentSelection2, cashInstrumentType2, money2, profile2, balanceSnapshot2, list2, instrumentLinkingConfig2, bool3, booleanValue, !mainPayment.isFiatPayment);
        MutableState mutableState8 = this.$subtitle$delegate;
        mutableState8.setValue(toolbarSubtitle);
        String toolbarCreditCardFee = realInstrumentSelectorManager.getToolbarCreditCardFee(mainPayment.orientation, this.$recipients, (InstrumentSelection) mutableState.getValue(), mainPayment.instrumentType, mainPayment.amountInProfileCurrency, (Profile) mutableState2.getValue(), (List) mutableState4.getValue(), (InstrumentLinkingConfig) mutableState5.getValue(), (Boolean) mutableState6.getValue(), ((Boolean) mutableState7.getValue()).booleanValue());
        String str = (String) mutableState8.getValue();
        InstrumentSelection instrumentSelection3 = (InstrumentSelection) mutableState.getValue();
        CashInstrumentType cashInstrumentType3 = mainPayment.instrumentType;
        Orientation orientation3 = mainPayment.orientation;
        Profile profile3 = (Profile) mutableState2.getValue();
        BalanceSnapshot balanceSnapshot3 = (BalanceSnapshot) mutableState3.getValue();
        List list3 = (List) mutableState4.getValue();
        InstrumentLinkingConfig instrumentLinkingConfig3 = (InstrumentLinkingConfig) mutableState5.getValue();
        Boolean bool4 = (Boolean) mutableState6.getValue();
        Money money3 = mainPayment.amountInProfileCurrency;
        boolean booleanValue2 = ((Boolean) this.$isInstrumentSelectionOpen$delegate.getValue()).booleanValue();
        String str2 = (String) this.$actionText$delegate.getValue();
        PaymentScreens.MainPayment.SendCryptoCurrencyType sendCryptoCurrencyType = mainPayment.sendCryptoCurrencyType;
        int i = sendCryptoCurrencyType == null ? -1 : WhenMappings.$EnumSwitchMapping$0[sendCryptoCurrencyType.ordinal()];
        InstrumentSelectionRowViewModel createInstrumentSelectionViewModel = realInstrumentSelectorManager.createInstrumentSelectionViewModel(str, toolbarCreditCardFee, this.$recipients, instrumentSelection3, cashInstrumentType3, orientation3, profile3, balanceSnapshot3, list3, instrumentLinkingConfig3, bool4, money3, booleanValue2, str2, i != 1 ? i != 2 ? mainPayment.amountInSelectedCurrency.currency_code : CurrencyCode.XUS : CurrencyCode.BTC, false);
        MutableState mutableState9 = this.$instrumentSelectionRowViewModel$delegate;
        mutableState9.setValue(createInstrumentSelectionViewModel);
        if (mainPaymentPresenter.autoSelectedInstrumentType != null) {
            InstrumentSelection instrumentSelection4 = (InstrumentSelection) mutableState.getValue();
            Profile profile4 = (Profile) mutableState2.getValue();
            BalanceSnapshot balanceSnapshot4 = (BalanceSnapshot) mutableState3.getValue();
            List list4 = (List) mutableState4.getValue();
            InstrumentLinkingConfig instrumentLinkingConfig4 = (InstrumentLinkingConfig) mutableState5.getValue();
            Boolean bool5 = (Boolean) mutableState6.getValue();
            Orientation orientation4 = mainPayment.orientation;
            Money money4 = mainPayment.amountInProfileCurrency;
            CashInstrumentType cashInstrumentType4 = mainPayment.instrumentType;
            List list5 = this.$recipients;
            list5.getClass();
            orientation4.getClass();
            money4.getClass();
            if (profile4 == null || balanceSnapshot4 == null || list4 == null || instrumentLinkingConfig4 == null || bool5 == null) {
                bool = null;
            } else {
                boolean booleanValue3 = bool5.booleanValue();
                int size = list5.size();
                Integer valueOf = Integer.valueOf(size);
                if (size <= 0) {
                    valueOf = null;
                }
                boolean isOnlyCashBalanceAndAmountAboveBalance = RealInstrumentSelectorManager.isOnlyCashBalanceAndAmountAboveBalance(balanceSnapshot4, money4, valueOf != null ? valueOf.intValue() : 1);
                List existingInstruments = GoogleMapKt.getExistingInstruments(list5, profile4, money4, (BalanceSnapshot) null, list4, instrumentLinkingConfig4, booleanValue3, false);
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : existingInstruments) {
                    if (obj3 instanceof SelectPaymentInstrumentOption.ExistingOption.ExistingInstrument) {
                        arrayList.add(obj3);
                    }
                }
                if (orientation4 != Orientation.BILL) {
                    if (instrumentSelection4 != null) {
                        Iterator it = arrayList.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                obj2 = null;
                                break;
                            }
                            obj2 = it.next();
                            if (Intrinsics.areEqual(((SelectPaymentInstrumentOption.ExistingOption.ExistingInstrument) obj2).instrument.token, instrumentSelection4.instrument_token)) {
                                break;
                            }
                        }
                        existingInstrument = (SelectPaymentInstrumentOption.ExistingOption.ExistingInstrument) obj2;
                    }
                    if (cashInstrumentType4 != null) {
                        Iterator it2 = arrayList.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                existingInstrument2 = 0;
                                break;
                            }
                            existingInstrument2 = it2.next();
                            if (((SelectPaymentInstrumentOption.ExistingOption.ExistingInstrument) existingInstrument2).instrument.cashInstrumentType == cashInstrumentType4) {
                                break;
                            }
                        }
                        existingInstrument = existingInstrument2;
                    } else {
                        existingInstrument = null;
                    }
                    SelectPaymentInstrumentOption.ExistingOption.ExistingInstrument existingInstrument3 = (SelectPaymentInstrumentOption.ExistingOption.ExistingInstrument) CollectionsKt.firstOrNull((List) arrayList);
                    if (existingInstrument == null) {
                        if (existingInstrument3 != null) {
                        }
                    }
                }
                z2 = false;
                bool = Boolean.valueOf(z2);
            }
        }
        InstrumentSelectionRowViewModel instrumentSelectionRowViewModel = (InstrumentSelectionRowViewModel) mutableState9.getValue();
        mainPaymentPresenter.autoSelectedInstrumentType = instrumentSelectionRowViewModel != null ? instrumentSelectionRowViewModel.cashInstrumentType : null;
        InstrumentSelectionRowViewModel instrumentSelectionRowViewModel2 = (InstrumentSelectionRowViewModel) mutableState9.getValue();
        mainPaymentPresenter.currentSelectedInstrumentType = instrumentSelectionRowViewModel2 != null ? instrumentSelectionRowViewModel2.cashInstrumentType : null;
        return Unit.INSTANCE;
    }
}
