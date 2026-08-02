package com.squareup.cash.blockers.presenters;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.gms.internal.mlkit_genai_prompt.zzafe;
import com.squareup.cash.bitcoin.views.send.MoveBitcoinViewKt$$ExternalSyntheticLambda3;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.blockers.screens.InstrumentSelectionData;
import com.squareup.cash.blockers.viewmodels.InstrumentSelectionListSheetViewModel;
import com.squareup.cash.cdf.instrument.InstrumentSelectTapOption;
import com.squareup.cash.cdf.instrument.InstrumentSelectViewOptions;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.instruments.viewmodels.InstrumentAvatarViewModel;
import com.squareup.cash.instruments.viewmodels.InstrumentOptionViewModel;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.screens.Redacted;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.franklin.api.ClientScenario;
import com.squareup.protos.franklin.blockers.InstrumentSelectionBlocker;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;

/* loaded from: classes4.dex */
public final class InstrumentSelectionListSheetPresenter implements MoleculePresenter {
    public final Analytics analytics;
    public final BlockersScreens.InstrumentSelectionListScreen args;
    public final BetterNavigator.ScreenNavigator navigator;

    public InstrumentSelectionListSheetPresenter(BlockersScreens.InstrumentSelectionListScreen instrumentSelectionListScreen, BetterNavigator.ScreenNavigator screenNavigator, Analytics analytics) {
        this.args = instrumentSelectionListScreen;
        this.navigator = screenNavigator;
        this.analytics = analytics;
    }

    public static InstrumentSelectTapOption.Action toAnalyticsAction(InstrumentSelectionData.InstrumentOption instrumentOption) {
        if (instrumentOption instanceof InstrumentSelectionData.InstrumentOption.Disabled) {
            return InstrumentSelectTapOption.Action.DISABLED;
        }
        if (instrumentOption instanceof InstrumentSelectionData.InstrumentOption.Enabled.SelectOption) {
            return InstrumentSelectTapOption.Action.SELECT;
        }
        if (instrumentOption instanceof InstrumentSelectionData.InstrumentOption.Enabled.ShowDialogOption) {
            return InstrumentSelectTapOption.Action.SHOW_DIALOG;
        }
        if (instrumentOption instanceof InstrumentSelectionData.InstrumentOption.Enabled.SubmitOption) {
            return InstrumentSelectTapOption.Action.SUBMIT;
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00e0  */
    @Override // app.cash.broadway.presenter.molecule.MoleculePresenter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object models(Flow flow, Composer composer, int i) {
        InstrumentOptionViewModel.SubtitleIcon subtitleIcon;
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(844599536);
        BlockersScreens.InstrumentSelectionListScreen instrumentSelectionListScreen = this.args;
        BlockersData blockersData = instrumentSelectionListScreen.blockersData;
        List list = instrumentSelectionListScreen.options;
        String str = blockersData.flowToken;
        ClientScenario clientScenario = blockersData.clientScenario;
        List list2 = list;
        this.analytics.track(new InstrumentSelectViewOptions(clientScenario != null ? clientScenario.name() : null, str, CollectionsKt.joinToString$default(list2, ",", null, null, 0, null, new MoveBitcoinViewKt$$ExternalSyntheticLambda3(this), 30)), null);
        Updater.LaunchedEffect(gapComposer, flow, new PasscodePresenter$models$1$2(flow, (Continuation) null, this, 5));
        String str2 = instrumentSelectionListScreen.title;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
        Iterator it = list2.iterator();
        while (true) {
            boolean z = false;
            if (!it.hasNext()) {
                InstrumentSelectionListSheetViewModel instrumentSelectionListSheetViewModel = new InstrumentSelectionListSheetViewModel(str2, instrumentSelectionListScreen.closeButtonText, arrayList);
                gapComposer.end(false);
                return instrumentSelectionListSheetViewModel;
            }
            InstrumentSelectionData.InstrumentOption instrumentOption = (InstrumentSelectionData.InstrumentOption) it.next();
            InstrumentSelectionData.InstrumentOption.Data data = instrumentOption.getData();
            boolean z2 = instrumentOption instanceof InstrumentSelectionData.InstrumentOption.Enabled;
            if (z2 && data.optionStyle == InstrumentSelectionBlocker.OptionStyle.NORMAL) {
                z = true;
            }
            InstrumentSelectionData.InstrumentOption.Enabled enabled = z2 ? (InstrumentSelectionData.InstrumentOption.Enabled) instrumentOption : null;
            Integer valueOf = enabled != null ? Integer.valueOf(enabled.getId()) : null;
            Image image = data.avatar;
            InstrumentSelectionData.InstrumentOption.IconStyle iconStyle = data.iconStyle;
            InstrumentAvatarViewModel instrumentAvatarViewModel = new InstrumentAvatarViewModel(image != null ? zzafe.toAvatarImage(image) : null, zzafe.toFallbackIcon(iconStyle), z);
            String str3 = (String) data.listTitle.getValue();
            if (!(iconStyle instanceof InstrumentSelectionData.InstrumentOption.IconStyle.NewLink)) {
                if (iconStyle instanceof InstrumentSelectionData.InstrumentOption.IconStyle.Card) {
                    subtitleIcon = InstrumentOptionViewModel.SubtitleIcon.CARD;
                } else if (iconStyle instanceof InstrumentSelectionData.InstrumentOption.IconStyle.Bank) {
                    subtitleIcon = InstrumentOptionViewModel.SubtitleIcon.BANK;
                } else if (!(iconStyle instanceof InstrumentSelectionData.InstrumentOption.IconStyle.Balance) && !(iconStyle instanceof InstrumentSelectionData.InstrumentOption.IconStyle.AppIcon) && !(iconStyle instanceof InstrumentSelectionData.InstrumentOption.IconStyle.GooglePayIcon) && !(iconStyle instanceof InstrumentSelectionData.InstrumentOption.IconStyle.EmojiIcon)) {
                    a$$ExternalSyntheticBUOutline0.m$1("Missing icon style to determine subtitle icon");
                    return null;
                }
                Redacted redacted = data.listSubtitlePrimary;
                String str4 = redacted == null ? (String) redacted.getValue() : null;
                Redacted redacted2 = data.listSubtitleSuffix;
                arrayList.add(new InstrumentSelectionListSheetViewModel.Option(valueOf, new InstrumentOptionViewModel(instrumentAvatarViewModel, str3, subtitleIcon, str4, redacted2 == null ? (String) redacted2.getValue() : null, data.listPillText, z)));
            }
            subtitleIcon = null;
            Redacted redacted3 = data.listSubtitlePrimary;
            if (redacted3 == null) {
            }
            Redacted redacted22 = data.listSubtitleSuffix;
            arrayList.add(new InstrumentSelectionListSheetViewModel.Option(valueOf, new InstrumentOptionViewModel(instrumentAvatarViewModel, str3, subtitleIcon, str4, redacted22 == null ? (String) redacted22.getValue() : null, data.listPillText, z)));
        }
    }
}
