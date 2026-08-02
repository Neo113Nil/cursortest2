package com.squareup.cash.recurringpayments.presenters;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.observability.backend.real.RealObservabilityManager;
import com.squareup.cash.recurringpayments.screens.SelectCadenceScreen;
import com.squareup.cash.recurringpayments.viewmodels.CadenceOption;
import com.squareup.cash.recurringpayments.viewmodels.SelectCadenceViewModel;
import com.squareup.cash.retro.presenters.SelectPaymentPlanBlockerPresenter$models$1$2;
import com.squareup.protos.franklin.api.FormBlocker;
import com.squareup.protos.franklin.api.RecurringPaymentBlocker;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlinx.coroutines.flow.Flow;

/* loaded from: classes7.dex */
public final class RealSelectCadencePresenter implements MoleculePresenter {
    public final Analytics analytics;
    public final SelectCadenceScreen args;
    public final BetterNavigator.ScreenNavigator navigator;
    public final RealObservabilityManager observabilityManager;

    public RealSelectCadencePresenter(SelectCadenceScreen selectCadenceScreen, BetterNavigator.ScreenNavigator screenNavigator, Analytics analytics, RealObservabilityManager realObservabilityManager) {
        selectCadenceScreen.getClass();
        this.args = selectCadenceScreen;
        this.navigator = screenNavigator;
        this.analytics = analytics;
        this.observabilityManager = realObservabilityManager;
    }

    @Override // app.cash.broadway.presenter.molecule.MoleculePresenter
    public final Object models(Flow flow, Composer composer, int i) {
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(784175950);
        RealObservabilityManager.startTrackingView$default(this.observabilityManager, "select_cadence_screen");
        Updater.LaunchedEffect(gapComposer, flow, new SelectPaymentPlanBlockerPresenter$models$1$2(flow, null, this, 27));
        RecurringPaymentBlocker.CadenceMenu cadenceMenu = this.args.cadenceMenu;
        FormBlocker.Element.LocalImageElement.Icon icon = cadenceMenu.icon;
        icon.getClass();
        RecurringPaymentBlocker.Text text = cadenceMenu.text;
        text.getClass();
        String str = text.title;
        str.getClass();
        RecurringPaymentBlocker.Text text2 = cadenceMenu.text;
        text2.getClass();
        String str2 = text2.subtitle;
        str2.getClass();
        List<RecurringPaymentBlocker.CadenceMenu.CadenceOption> list = cadenceMenu.cadence_options;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        for (RecurringPaymentBlocker.CadenceMenu.CadenceOption cadenceOption : list) {
            String str3 = cadenceOption.button_text;
            str3.getClass();
            RecurringPaymentBlocker.CadenceMenu.DayOfCadenceMenu dayOfCadenceMenu = cadenceOption.day_of_cadence_menu;
            dayOfCadenceMenu.getClass();
            String str4 = dayOfCadenceMenu.cadence;
            str4.getClass();
            arrayList.add(new CadenceOption(str3, str4));
        }
        SelectCadenceViewModel selectCadenceViewModel = new SelectCadenceViewModel(icon, str, str2, arrayList);
        gapComposer.end(false);
        return selectCadenceViewModel;
    }
}
