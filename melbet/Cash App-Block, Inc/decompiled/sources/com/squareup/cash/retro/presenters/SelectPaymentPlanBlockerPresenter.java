package com.squareup.cash.retro.presenters;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.Updater;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.common.viewmodels.AvatarBadgeViewModel;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.data.blockers.BlockersDataNavigator;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.retro.viewmodels.SelectPaymentPlanViewModel;
import com.squareup.cash.ui.widget.StackedAvatarViewModel;
import com.squareup.cash.ui.widget.StackedAvatarViewModelKt;
import com.squareup.cash.wallet.presenters.CardSchemePresenter$models$3$1;
import com.squareup.protos.franklin.api.SelectPaymentPlanBlocker;
import com.squareup.protos.franklin.lending.LendingAppService;
import com.squareup.protos.franklin.ui.UiAvatar;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* loaded from: classes8.dex */
public final class SelectPaymentPlanBlockerPresenter implements MoleculePresenter {
    public final BlockersScreens.SelectPaymentPlanBlockerScreen args;
    public final BlockersDataNavigator blockersDataNavigator;
    public final LendingAppService lendingAppService;
    public final BetterNavigator.ScreenNavigator navigator;
    public final AndroidStringManager stringManager;

    public SelectPaymentPlanBlockerPresenter(LendingAppService lendingAppService, BlockersDataNavigator blockersDataNavigator, AndroidStringManager androidStringManager, BetterNavigator.ScreenNavigator screenNavigator, BlockersScreens.SelectPaymentPlanBlockerScreen selectPaymentPlanBlockerScreen) {
        selectPaymentPlanBlockerScreen.getClass();
        this.lendingAppService = lendingAppService;
        this.blockersDataNavigator = blockersDataNavigator;
        this.stringManager = androidStringManager;
        this.navigator = screenNavigator;
        this.args = selectPaymentPlanBlockerScreen;
    }

    public static Integer getPreselectedPaymentOptionIndex(SelectPaymentPlanBlocker selectPaymentPlanBlocker) {
        SelectPaymentPlanBlocker.PaymentsTimelineSection paymentsTimelineSection = selectPaymentPlanBlocker.payments_timeline_section;
        paymentsTimelineSection.getClass();
        SelectPaymentPlanBlocker.OptionsHalfSheetConfig optionsHalfSheetConfig = paymentsTimelineSection.options_half_sheet_config;
        if (optionsHalfSheetConfig != null) {
            return optionsHalfSheetConfig.preselected_option;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // app.cash.broadway.presenter.molecule.MoleculePresenter
    public final Object models(Flow flow, Composer composer, int i) {
        SelectPaymentPlanBlockerPresenter selectPaymentPlanBlockerPresenter;
        Integer num;
        String str;
        String str2;
        Throwable th;
        SelectPaymentPlanViewModel.SelectPaymentPlanHalfSheet.OptionsConfigSheet optionsConfigSheet;
        SelectPaymentPlanViewModel.SelectPaymentPlanHalfSheet selectPaymentPlanHalfSheet;
        SelectPaymentPlanViewModel.ButtonState buttonState;
        SelectPaymentPlanViewModel.SelectPaymentPlanHalfSheet.InfoHalfSheet infoHalfSheet;
        SelectPaymentPlanViewModel.SelectPaymentPlanHalfSheet.InfoHalfSheet infoHalfSheet2;
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(1576466588);
        Object rememberedValue = gapComposer.rememberedValue();
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        if (rememberedValue == neverEqualPolicy) {
            selectPaymentPlanBlockerPresenter = this;
            rememberedValue = Updater.mutableStateOf$default(selectPaymentPlanBlockerPresenter.args.data);
            gapComposer.updateRememberedValue(rememberedValue);
        } else {
            selectPaymentPlanBlockerPresenter = this;
        }
        MutableState mutableState = (MutableState) rememberedValue;
        Object rememberedValue2 = gapComposer.rememberedValue();
        if (rememberedValue2 == neverEqualPolicy) {
            rememberedValue2 = Updater.mutableStateOf$default(null);
            gapComposer.updateRememberedValue(rememberedValue2);
        }
        MutableState mutableState2 = (MutableState) rememberedValue2;
        Object rememberedValue3 = gapComposer.rememberedValue();
        if (rememberedValue3 == neverEqualPolicy) {
            rememberedValue3 = Updater.mutableStateOf$default(getPreselectedPaymentOptionIndex((SelectPaymentPlanBlocker) mutableState.getValue()));
            gapComposer.updateRememberedValue(rememberedValue3);
        }
        MutableState mutableState3 = (MutableState) rememberedValue3;
        Object rememberedValue4 = gapComposer.rememberedValue();
        if (rememberedValue4 == neverEqualPolicy) {
            rememberedValue4 = Updater.mutableStateOf$default(new SelectPaymentPlanViewModel.ButtonState.Loaded(((Integer) mutableState3.getValue()) != null));
            gapComposer.updateRememberedValue(rememberedValue4);
        }
        MutableState mutableState4 = (MutableState) rememberedValue4;
        Object rememberedValue5 = gapComposer.rememberedValue();
        if (rememberedValue5 == neverEqualPolicy) {
            rememberedValue5 = Updater.mutableStateOf$default(new SelectPaymentPlanViewModel.ButtonState.Loaded(true));
            gapComposer.updateRememberedValue(rememberedValue5);
        }
        MutableState mutableState5 = (MutableState) rememberedValue5;
        Updater.LaunchedEffect(gapComposer, flow, new CardSchemePresenter$models$3$1(flow, (Continuation) null, selectPaymentPlanBlockerPresenter, mutableState2, mutableState, mutableState3, mutableState4, mutableState5, 2));
        SelectPaymentPlanBlocker selectPaymentPlanBlocker = (SelectPaymentPlanBlocker) mutableState.getValue();
        SelectPaymentPlanViewModel.SelectPaymentPlanHalfSheet selectPaymentPlanHalfSheet2 = (SelectPaymentPlanViewModel.SelectPaymentPlanHalfSheet) mutableState2.getValue();
        Integer num2 = (Integer) mutableState3.getValue();
        SelectPaymentPlanViewModel.ButtonState buttonState2 = (SelectPaymentPlanViewModel.ButtonState) mutableState4.getValue();
        SelectPaymentPlanViewModel.ButtonState buttonState3 = (SelectPaymentPlanViewModel.ButtonState) mutableState5.getValue();
        SelectPaymentPlanBlocker.HeaderSection headerSection = selectPaymentPlanBlocker.header_section;
        headerSection.getClass();
        UiAvatar uiAvatar = headerSection.avatar;
        uiAvatar.getClass();
        StackedAvatarViewModel.Avatar avatar = StackedAvatarViewModelKt.toStackedAvatarViewModel(uiAvatar).avatar;
        UiAvatar uiAvatar2 = headerSection.avatar;
        uiAvatar2.getClass();
        AvatarBadgeViewModel extractAvatarBadgeViewModel = AvatarKt.extractAvatarBadgeViewModel(uiAvatar2, null);
        String str3 = headerSection.title;
        str3.getClass();
        SelectPaymentPlanViewModel.HeaderSection headerSection2 = new SelectPaymentPlanViewModel.HeaderSection(avatar, extractAvatarBadgeViewModel, str3, headerSection.subtitle, headerSection.body_primary_text, headerSection.body_secondary_text);
        SelectPaymentPlanBlocker.PaymentsTimelineSection paymentsTimelineSection = selectPaymentPlanBlocker.payments_timeline_section;
        paymentsTimelineSection.getClass();
        String str4 = paymentsTimelineSection.title;
        str4.getClass();
        SelectPaymentPlanBlocker.OptionsHalfSheetConfig optionsHalfSheetConfig = paymentsTimelineSection.options_half_sheet_config;
        String str5 = optionsHalfSheetConfig != null ? optionsHalfSheetConfig.button_title : null;
        if (optionsHalfSheetConfig != null) {
            String str6 = optionsHalfSheetConfig.half_sheet_title;
            str6.getClass();
            String str7 = optionsHalfSheetConfig.half_sheet_subtitle;
            String str8 = optionsHalfSheetConfig.submit_button_title;
            str8.getClass();
            th = null;
            SelectPaymentPlanViewModel.ButtonState.Loaded loaded = new SelectPaymentPlanViewModel.ButtonState.Loaded(num2 != null);
            List<SelectPaymentPlanBlocker.OptionsHalfSheetConfig.Option> list = optionsHalfSheetConfig.options;
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
            Iterator it = list.iterator();
            int i2 = 0;
            while (it.hasNext()) {
                Object next = it.next();
                int i3 = i2 + 1;
                if (i2 < 0) {
                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                    throw null;
                }
                SelectPaymentPlanBlocker.OptionsHalfSheetConfig.Option option = (SelectPaymentPlanBlocker.OptionsHalfSheetConfig.Option) next;
                Integer num3 = num2;
                Iterator it2 = it;
                String str9 = option.token;
                str9.getClass();
                String str10 = str4;
                String str11 = option.title;
                str11.getClass();
                String str12 = str5;
                arrayList.add(new SelectPaymentPlanViewModel.PaymentPlanOption(str9, str11, option.subtitle, num3 != null && i2 == num3.intValue()));
                num2 = num3;
                it = it2;
                i2 = i3;
                str4 = str10;
                str5 = str12;
            }
            num = num2;
            str = str4;
            str2 = str5;
            optionsConfigSheet = new SelectPaymentPlanViewModel.SelectPaymentPlanHalfSheet.OptionsConfigSheet(str6, str7, str8, loaded, arrayList);
        } else {
            num = num2;
            str = str4;
            str2 = str5;
            th = null;
            optionsConfigSheet = null;
        }
        List<SelectPaymentPlanBlocker.PaymentsTimelineSection.TimelineEvent> list2 = paymentsTimelineSection.timeline_events;
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
        for (SelectPaymentPlanBlocker.PaymentsTimelineSection.TimelineEvent timelineEvent : list2) {
            String str13 = timelineEvent.title;
            str13.getClass();
            String str14 = timelineEvent.value;
            str14.getClass();
            SelectPaymentPlanBlocker.PaymentsTimelineSection.TimelineEvent.State state = timelineEvent.state;
            state.getClass();
            String str15 = timelineEvent.body;
            SelectPaymentPlanBlocker.InfoHalfSheet infoHalfSheet3 = timelineEvent.info_half_sheet;
            if (infoHalfSheet3 != null) {
                String str16 = infoHalfSheet3.title;
                str16.getClass();
                String str17 = infoHalfSheet3.body;
                str17.getClass();
                String str18 = infoHalfSheet3.dismiss_button_title;
                str18.getClass();
                infoHalfSheet2 = new SelectPaymentPlanViewModel.SelectPaymentPlanHalfSheet.InfoHalfSheet(str16, str17, str18);
            } else {
                infoHalfSheet2 = th;
            }
            arrayList2.add(new SelectPaymentPlanViewModel.TimelineEvent(str13, str14, state, str15, infoHalfSheet2));
        }
        SelectPaymentPlanViewModel.PaymentsTimelineSection paymentsTimelineSection2 = new SelectPaymentPlanViewModel.PaymentsTimelineSection(str, str2, optionsConfigSheet, arrayList2, paymentsTimelineSection.description, paymentsTimelineSection.footer_list);
        SelectPaymentPlanBlocker.SummarySection summarySection = selectPaymentPlanBlocker.summary_section;
        summarySection.getClass();
        List<SelectPaymentPlanBlocker.SummarySection.Row> list3 = summarySection.rows;
        ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list3, 10));
        for (SelectPaymentPlanBlocker.SummarySection.Row row : list3) {
            String str19 = row.primary_text;
            str19.getClass();
            String str20 = row.secondary_text;
            String str21 = row.subtitle;
            SelectPaymentPlanBlocker.InfoHalfSheet infoHalfSheet4 = row.info_half_sheet;
            if (infoHalfSheet4 != null) {
                String str22 = infoHalfSheet4.title;
                str22.getClass();
                String str23 = infoHalfSheet4.body;
                str23.getClass();
                String str24 = infoHalfSheet4.dismiss_button_title;
                str24.getClass();
                infoHalfSheet = new SelectPaymentPlanViewModel.SelectPaymentPlanHalfSheet.InfoHalfSheet(str22, str23, str24);
            } else {
                infoHalfSheet = th;
            }
            arrayList3.add(new SelectPaymentPlanViewModel.SummaryRow(str19, str20, str21, infoHalfSheet));
        }
        SelectPaymentPlanViewModel.SummarySection summarySection2 = new SelectPaymentPlanViewModel.SummarySection(arrayList3);
        String str25 = selectPaymentPlanBlocker.submit_button_title;
        str25.getClass();
        boolean areEqual = Intrinsics.areEqual(selectPaymentPlanBlocker.requires_full_scroll, Boolean.TRUE);
        if (selectPaymentPlanHalfSheet2 instanceof SelectPaymentPlanViewModel.SelectPaymentPlanHalfSheet.OptionsConfigSheet) {
            SelectPaymentPlanViewModel.SelectPaymentPlanHalfSheet.OptionsConfigSheet optionsConfigSheet2 = (SelectPaymentPlanViewModel.SelectPaymentPlanHalfSheet.OptionsConfigSheet) selectPaymentPlanHalfSheet2;
            if (buttonState2 instanceof SelectPaymentPlanViewModel.ButtonState.Loaded) {
                buttonState = new SelectPaymentPlanViewModel.ButtonState.Loaded(num != null);
            } else {
                buttonState = SelectPaymentPlanViewModel.ButtonState.Loading.INSTANCE;
                if (!Intrinsics.areEqual(buttonState2, buttonState)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return th;
                }
            }
            SelectPaymentPlanViewModel.ButtonState buttonState4 = buttonState;
            List list4 = optionsConfigSheet2.options;
            ArrayList arrayList4 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list4, 10));
            int i4 = 0;
            for (Object obj : list4) {
                int i5 = i4 + 1;
                if (i4 < 0) {
                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                    throw th;
                }
                SelectPaymentPlanViewModel.PaymentPlanOption paymentPlanOption = (SelectPaymentPlanViewModel.PaymentPlanOption) obj;
                arrayList4.add(new SelectPaymentPlanViewModel.PaymentPlanOption(paymentPlanOption.token, paymentPlanOption.title, paymentPlanOption.subtitle, num != null && i4 == num.intValue()));
                i4 = i5;
            }
            String str26 = optionsConfigSheet2.title;
            String str27 = optionsConfigSheet2.subtitle;
            String str28 = optionsConfigSheet2.updateButtonTitle;
            str26.getClass();
            str28.getClass();
            selectPaymentPlanHalfSheet = new SelectPaymentPlanViewModel.SelectPaymentPlanHalfSheet.OptionsConfigSheet(str26, str27, str28, buttonState4, arrayList4);
        } else {
            selectPaymentPlanHalfSheet = selectPaymentPlanHalfSheet2;
        }
        SelectPaymentPlanViewModel selectPaymentPlanViewModel = new SelectPaymentPlanViewModel(headerSection2, paymentsTimelineSection2, summarySection2, str25, buttonState3, areEqual, selectPaymentPlanHalfSheet);
        gapComposer.end(false);
        return selectPaymentPlanViewModel;
    }
}
