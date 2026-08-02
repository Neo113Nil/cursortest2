package com.squareup.cash.borrow.presenters;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.Updater;
import androidx.core.text.TextUtilsCompat;
import app.cash.api.ApiResult;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import com.miteksystems.misnap.camera.a.n;
import com.squareup.cash.amountslider.viewmodels.AmountPickerViewModel;
import com.squareup.cash.amountslider.viewmodels.AmountSelectorWidgetModel;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.boost.backend.RealBoostSelector$removeBoost$1;
import com.squareup.cash.borrow.screens.LoanAmountPicker;
import com.squareup.cash.borrow.viewmodels.LoanSelectorItem;
import com.squareup.cash.common.messaging.api.ErrorMessaging;
import com.squareup.cash.common.messaging.screens.FailureMessageScreen;
import com.squareup.cash.common.moneyformatter.MoneyFormatterConfig;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.moneyformatter.api.MoneyFormatter;
import com.squareup.cash.moneyformatter.real.LocalizedMoneyFormatter;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.screens.Back;
import com.squareup.cash.util.money.Moneys;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.common.Money;
import com.squareup.protos.lending.InitiateLoanData;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.Flow;

/* loaded from: classes5.dex */
public final class LoanAmountPickerPresenter implements MoleculePresenter {
    public final Analytics analytics;
    public final LoanAmountPicker args;
    public final String flowToken;
    public final n loanFlowStarter;
    public final Mode mode;
    public final MoneyFormatter moneyFormatter;
    public final BetterNavigator.ScreenNavigator navigator;
    public final AndroidStringManager stringManager;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class Mode {
        public static final /* synthetic */ Mode[] $VALUES;
        public static final Mode CONDENSED;
        public static final Mode FULL;

        static {
            Mode mode = new Mode("CONDENSED", 0);
            CONDENSED = mode;
            Mode mode2 = new Mode("FULL", 1);
            FULL = mode2;
            $VALUES = new Mode[]{mode, mode2};
        }

        public static Mode valueOf(String str) {
            return (Mode) Enum.valueOf(Mode.class, str);
        }

        public static Mode[] values() {
            return (Mode[]) $VALUES.clone();
        }
    }

    public LoanAmountPickerPresenter(AndroidStringManager androidStringManager, n nVar, Analytics analytics, LocalizedMoneyFormatter.Factory factory, Mode mode, LoanAmountPicker loanAmountPicker, BetterNavigator.ScreenNavigator screenNavigator) {
        loanAmountPicker.getClass();
        this.stringManager = androidStringManager;
        this.loanFlowStarter = nVar;
        this.analytics = analytics;
        this.mode = mode;
        this.args = loanAmountPicker;
        this.navigator = screenNavigator;
        this.moneyFormatter = factory.create(MoneyFormatterConfig.COMPACT);
        String flowToken = loanAmountPicker.getFlowToken();
        if (flowToken == null) {
            BlockersData.Flow.INSTANCE.getClass();
            flowToken = BlockersData.Flow.Companion.generateToken();
        }
        this.flowToken = flowToken;
    }

    public static void updateWith(MutableState mutableState) {
        mutableState.setValue(Integer.valueOf(((Number) mutableState.getValue()).intValue() + 1));
    }

    public final void handleInitiateLoanFailure(ApiResult.Failure failure, MutableState mutableState) {
        int ordinal = this.mode.ordinal();
        BetterNavigator.ScreenNavigator screenNavigator = this.navigator;
        if (ordinal == 0) {
            screenNavigator.goTo(Back.INSTANCE);
        } else {
            if (ordinal != 1) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return;
            }
            mutableState.setValue(Integer.valueOf(((Number) mutableState.getValue()).intValue() - 1));
        }
        ErrorMessaging errorMessaging = TextUtilsCompat.errorMessaging(this.stringManager, failure, null);
        screenNavigator.goTo(new FailureMessageScreen(errorMessaging.title, errorMessaging.message, null, this.args, null, 20));
    }

    @Override // app.cash.broadway.presenter.molecule.MoleculePresenter
    public final Object models(Flow flow, Composer composer, int i) {
        String str;
        String str2;
        Object ready;
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(1387721962);
        Object rememberedValue = gapComposer.rememberedValue();
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        if (rememberedValue == neverEqualPolicy) {
            rememberedValue = Updater.mutableStateOf$default(0);
            gapComposer.updateRememberedValue(rememberedValue);
        }
        MutableState mutableState = (MutableState) rememberedValue;
        Continuation continuation = null;
        if (this.mode == Mode.CONDENSED) {
            gapComposer.startReplaceGroup(-1730053673);
            Unit unit = Unit.INSTANCE;
            boolean changedInstance = gapComposer.changedInstance(this);
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new LoanAmountPickerPresenter$models$1$1(this, null);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            Updater.LaunchedEffect(gapComposer, unit, (Function2) rememberedValue2);
            gapComposer.end(false);
        } else {
            gapComposer.startReplaceGroup(-1729714440);
            gapComposer.end(false);
        }
        Updater.LaunchedEffect(gapComposer, flow, new RealBoostSelector$removeBoost$1(flow, continuation, this, mutableState, 14));
        if (((Number) mutableState.getValue()).intValue() > 0) {
            ready = new AmountPickerViewModel.Loading();
        } else {
            InitiateLoanData loanData = this.args.getLoanData();
            List<InitiateLoanData.QuickLoanOption> list = loanData.quick_loan_options;
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                Money money = ((InitiateLoanData.QuickLoanOption) it.next()).amount;
                money.getClass();
                arrayList.add(money);
            }
            ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                Money money2 = (Money) it2.next();
                arrayList2.add(new LoanSelectorItem.Amount(money2, this.moneyFormatter.format(money2)));
            }
            ArrayList plus = CollectionsKt.plus((Collection) arrayList2, (Object) new LoanSelectorItem.CustomAmount());
            boolean z = Moneys.amount(loanData.maximum_loan_amount) >= Moneys.amount(loanData.minimum_loan_amount);
            LocalizedString localizedString = loanData.title;
            localizedString.getClass();
            String str3 = localizedString.translated_value;
            str3.getClass();
            if (z) {
                LocalizedString localizedString2 = loanData.subtitle;
                localizedString2.getClass();
                str = localizedString2.translated_value;
                str.getClass();
            } else {
                str = "";
            }
            String str4 = str;
            if (z) {
                str2 = null;
            } else {
                LocalizedString localizedString3 = loanData.subtitle;
                localizedString3.getClass();
                String str5 = localizedString3.translated_value;
                str5.getClass();
                str2 = str5;
            }
            LocalizedString localizedString4 = loanData.primary_button_text;
            localizedString4.getClass();
            String str6 = localizedString4.translated_value;
            str6.getClass();
            Money money3 = loanData.minimum_loan_amount;
            money3.getClass();
            AmountPickerViewModel.Ready.Amount.MoneyAmount moneyAmount = new AmountPickerViewModel.Ready.Amount.MoneyAmount(money3);
            Money money4 = loanData.maximum_loan_amount;
            money4.getClass();
            ready = new AmountPickerViewModel.Ready(str3, str4, str6, moneyAmount, new AmountPickerViewModel.Ready.Amount.MoneyAmount(money4), false, null, new AmountSelectorWidgetModel(plus), null, null, z, false, str2, null, 11104);
        }
        gapComposer.end(false);
        return ready;
    }
}
