package com.squareup.cash.recurringpayments.presenters;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.observability.backend.real.RealObservabilityManager;
import com.squareup.cash.recurringpayments.screens.SelectDayOfCadenceScreen;
import com.squareup.cash.recurringpayments.viewmodels.DayOfCadenceOption;
import com.squareup.cash.recurringpayments.viewmodels.SelectDayOfCadenceViewModel;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.retro.presenters.SelectPaymentPlanBlockerPresenter$models$1$2;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.franklin.api.RecurringPaymentBlocker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlinx.coroutines.flow.Flow;

/* loaded from: classes7.dex */
public final class RealSelectDayOfCadencePresenter implements MoleculePresenter {
    public final Analytics analytics;
    public final SelectDayOfCadenceScreen args;
    public final BetterNavigator.ScreenNavigator navigator;
    public final RealObservabilityManager observabilityManager;

    public RealSelectDayOfCadencePresenter(AndroidStringManager androidStringManager, Analytics analytics, SelectDayOfCadenceScreen selectDayOfCadenceScreen, BetterNavigator.ScreenNavigator screenNavigator, RealObservabilityManager realObservabilityManager) {
        selectDayOfCadenceScreen.getClass();
        this.analytics = analytics;
        this.args = selectDayOfCadenceScreen;
        this.navigator = screenNavigator;
        this.observabilityManager = realObservabilityManager;
    }

    @Override // app.cash.broadway.presenter.molecule.MoleculePresenter
    public final Object models(Flow flow, Composer composer, int i) {
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(968717167);
        RealObservabilityManager.startTrackingView$default(this.observabilityManager, "select_day_of_cadence_screen");
        Updater.LaunchedEffect(gapComposer, flow, new SelectPaymentPlanBlockerPresenter$models$1$2(flow, null, this, 28));
        RecurringPaymentBlocker.CadenceMenu.DayOfCadenceMenu dayOfCadenceMenu = this.args.dayOfCadenceMenu;
        RecurringPaymentBlocker.Text text = dayOfCadenceMenu.text;
        String str = text != null ? text.title : null;
        if (str == null) {
            a$$ExternalSyntheticBUOutline0.m$3("Required value was null.");
            return null;
        }
        String str2 = text != null ? text.subtitle : null;
        if (str2 == null) {
            a$$ExternalSyntheticBUOutline0.m$3("Required value was null.");
            return null;
        }
        List<RecurringPaymentBlocker.CadenceMenu.DayOfCadenceOption> list = dayOfCadenceMenu.day_of_cadence_options;
        if (list == null) {
            a$$ExternalSyntheticBUOutline0.m$3("Required value was null.");
            return null;
        }
        List<RecurringPaymentBlocker.CadenceMenu.DayOfCadenceOption> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
        Iterator<T> it = list2.iterator();
        while (true) {
            boolean z = false;
            if (!it.hasNext()) {
                SelectDayOfCadenceViewModel selectDayOfCadenceViewModel = new SelectDayOfCadenceViewModel(str, str2, arrayList);
                gapComposer.end(false);
                return selectDayOfCadenceViewModel;
            }
            RecurringPaymentBlocker.CadenceMenu.DayOfCadenceOption dayOfCadenceOption = (RecurringPaymentBlocker.CadenceMenu.DayOfCadenceOption) it.next();
            Image image = dayOfCadenceOption.button_icon;
            String str3 = dayOfCadenceOption.button_text;
            str3.getClass();
            RecurringPaymentBlocker.CadenceMenu.DayOfCadenceOption.TextAlignment textAlignment = dayOfCadenceOption.button_text_horizontal_alignment;
            Integer num = dayOfCadenceOption.day_of_cadence;
            Boolean bool = dayOfCadenceOption.should_display_day_picker;
            if (bool != null) {
                z = bool.booleanValue();
            }
            arrayList.add(new DayOfCadenceOption(image, str3, textAlignment, num, z, dayOfCadenceOption.day_picker));
        }
    }
}
