package com.squareup.cash.borrow.presenters;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.Updater;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import app.cash.broadway.screen.Screen;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.borrow.screens.BorrowHomeAmountPickerSheet;
import com.squareup.cash.borrow.viewmodels.BorrowAmountPickerViewModel;
import com.squareup.cash.clientrouting.RealRouter;
import com.squareup.cash.clientrouting.RealRouter$Factory$Impl;
import com.squareup.cash.clientrouting.data.RoutingParams;
import com.squareup.cash.common.moneyformatter.MoneyFormatterConfig;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.data.blockers.RealBlockersHelper$skipBlocker$1;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.moneyformatter.api.MoneyFormatter;
import com.squareup.cash.moneyformatter.real.LocalizedMoneyFormatter;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.common.Money;
import com.squareup.protos.lending.InitiateLoanData;
import com.withpersona.sdk2.inquiry.network.core.HttpStatusCode;
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
public final class BorrowHomeAmountPickerPresenter implements MoleculePresenter {
    public final Analytics analytics;
    public final BorrowHomeAmountPickerSheet args;
    public final String flowToken;
    public final MoneyFormatter moneyFormatter;
    public final BetterNavigator.ScreenNavigator navigator;
    public final RealRouter router;

    public BorrowHomeAmountPickerPresenter(LocalizedMoneyFormatter.Factory factory, RealRouter$Factory$Impl realRouter$Factory$Impl, Analytics analytics, BorrowHomeAmountPickerSheet borrowHomeAmountPickerSheet, BetterNavigator.ScreenNavigator screenNavigator) {
        borrowHomeAmountPickerSheet.getClass();
        this.analytics = analytics;
        this.args = borrowHomeAmountPickerSheet;
        this.navigator = screenNavigator;
        this.moneyFormatter = factory.create(MoneyFormatterConfig.COMPACT);
        this.router = realRouter$Factory$Impl.create$1(screenNavigator);
        BlockersData.Flow.INSTANCE.getClass();
        this.flowToken = BlockersData.Flow.Companion.generateToken();
    }

    @Override // app.cash.broadway.presenter.molecule.MoleculePresenter
    public final Object models(Flow flow, Composer composer, int i) {
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(-1180568715);
        Object rememberedValue = gapComposer.rememberedValue();
        Object obj = Composer.Companion.Empty;
        if (rememberedValue == obj) {
            rememberedValue = Updater.mutableStateOf$default(Boolean.FALSE);
            gapComposer.updateRememberedValue(rememberedValue);
        }
        MutableState mutableState = (MutableState) rememberedValue;
        InitiateLoanData initiateLoanData = this.args.pickerData;
        Unit unit = Unit.INSTANCE;
        boolean changedInstance = gapComposer.changedInstance(initiateLoanData) | gapComposer.changedInstance(this);
        Object rememberedValue2 = gapComposer.rememberedValue();
        if (changedInstance || rememberedValue2 == obj) {
            rememberedValue2 = new BorrowHomeAmountPickerPresenter$models$1$1(initiateLoanData, this, null);
            gapComposer.updateRememberedValue(rememberedValue2);
        }
        Updater.LaunchedEffect(gapComposer, unit, (Function2) rememberedValue2);
        Updater.LaunchedEffect(gapComposer, flow, new RealBlockersHelper$skipBlocker$1(flow, (Continuation) null, initiateLoanData, this, mutableState, 1));
        if (initiateLoanData.quick_loan_options.isEmpty()) {
            mutableState.setValue(Boolean.TRUE);
            InitiateLoanData.CustomLoanOption customLoanOption = initiateLoanData.custom_loan_option;
            customLoanOption.getClass();
            route(customLoanOption.action_url);
        }
        LocalizedString localizedString = initiateLoanData.title;
        localizedString.getClass();
        String str = localizedString.translated_value;
        str.getClass();
        LocalizedString localizedString2 = initiateLoanData.subtitle;
        String str2 = localizedString2 != null ? localizedString2.translated_value : null;
        LocalizedString localizedString3 = initiateLoanData.primary_button_text;
        localizedString3.getClass();
        String str3 = localizedString3.translated_value;
        str3.getClass();
        boolean booleanValue = ((Boolean) mutableState.getValue()).booleanValue();
        List<InitiateLoanData.QuickLoanOption> list = initiateLoanData.quick_loan_options;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            Money money = ((InitiateLoanData.QuickLoanOption) it.next()).amount;
            money.getClass();
            arrayList.add(this.moneyFormatter.format(money));
        }
        InitiateLoanData.CustomLoanOption customLoanOption2 = initiateLoanData.custom_loan_option;
        customLoanOption2.getClass();
        LocalizedString localizedString4 = customLoanOption2.display_string;
        localizedString4.getClass();
        String str4 = localizedString4.translated_value;
        str4.getClass();
        BorrowAmountPickerViewModel.Condensed condensed = new BorrowAmountPickerViewModel.Condensed(str, str2, str3, booleanValue, CollectionsKt.plus((Collection) arrayList, (Object) str4));
        gapComposer.end(false);
        return condensed;
    }

    public final void route(String str) {
        Screen screen = this.args.origin;
        this.router.route(new RoutingParams(screen, null, screen, null, null, null, HttpStatusCode.BAD_GATEWAY_502), str);
    }
}
