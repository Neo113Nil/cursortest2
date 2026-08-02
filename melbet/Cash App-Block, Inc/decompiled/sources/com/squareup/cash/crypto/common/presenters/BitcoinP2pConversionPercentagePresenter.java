package com.squareup.cash.crypto.common.presenters;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.ParcelableSnapshotMutableLongState;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.saveable.SaverKt;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import com.google.mlkit.vision.text.zzc;
import com.squareup.cash.R;
import com.squareup.cash.blockers.presenters.RealIdvPresenter$models$1$1;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.crypto.common.screens.CryptoCommonScreens;
import com.squareup.cash.crypto.common.viewmodels.BitcoinP2pConversionPercentageViewEvent;
import com.squareup.cash.crypto.common.viewmodels.BitcoinP2pConversionPercentageViewModel;
import com.squareup.cash.db.contacts.Recipient$$ExternalSyntheticLambda2;
import com.squareup.cash.dialog.ArcadeModal$$ExternalSyntheticLambda2;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.protos.franklin.blockers.BitcoinP2pConversionPercentageBlocker;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.flow.Flow;

/* loaded from: classes6.dex */
public final class BitcoinP2pConversionPercentagePresenter implements MoleculePresenter {
    public static final List DEFAULT_PICKER_OPTIONS = CollectionsKt__CollectionsKt.listOf((Object[]) new Long[]{100L, 1000L, 2500L, 5000L, 10000L});
    public final CryptoCommonScreens.BitcoinP2pConversionPercentageScreen args;
    public final BitcoinP2pConversionPercentageBlocker blocker;
    public final BetterNavigator.ScreenNavigator navigator;
    public final List pickerOptionsBps;
    public final AndroidStringManager stringManager;
    public final BitcoinP2pConversionPercentageSubmitter submitter;

    public BitcoinP2pConversionPercentagePresenter(BitcoinP2pConversionPercentageSubmitter bitcoinP2pConversionPercentageSubmitter, AndroidStringManager androidStringManager, CryptoCommonScreens.BitcoinP2pConversionPercentageScreen bitcoinP2pConversionPercentageScreen, BetterNavigator.ScreenNavigator screenNavigator) {
        List<Long> list;
        bitcoinP2pConversionPercentageScreen.getClass();
        this.submitter = bitcoinP2pConversionPercentageSubmitter;
        this.stringManager = androidStringManager;
        this.args = bitcoinP2pConversionPercentageScreen;
        this.navigator = screenNavigator;
        BitcoinP2pConversionPercentageBlocker bitcoinP2pConversionPercentageBlocker = bitcoinP2pConversionPercentageScreen.blocker;
        this.blocker = bitcoinP2pConversionPercentageBlocker;
        BitcoinP2pConversionPercentageBlocker.PercentageSelectionUI percentageSelectionUI = bitcoinP2pConversionPercentageBlocker.ui_elements;
        this.pickerOptionsBps = (percentageSelectionUI == null || (list = percentageSelectionUI.percentage_picker_options_in_basis_points) == null) ? DEFAULT_PICKER_OPTIONS : list;
    }

    @Override // app.cash.broadway.presenter.molecule.MoleculePresenter
    public final Object models(Flow flow, Composer composer, int i) {
        String str;
        BitcoinP2pConversionPercentageViewModel.Content.Action action;
        BitcoinP2pConversionPercentageViewModel.Content.Action action2;
        BitcoinP2pConversionPercentageViewModel.Content.AlertModel alertModel;
        BitcoinP2pConversionPercentageBlocker.AlertUI alertUI;
        BitcoinP2pConversionPercentageBlocker.Button button;
        BitcoinP2pConversionPercentageBlocker.Button button2;
        String str2;
        String str3;
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(273312599);
        Object[] objArr = new Object[0];
        boolean changedInstance = gapComposer.changedInstance(this);
        Object rememberedValue = gapComposer.rememberedValue();
        int i2 = 1;
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        if (changedInstance || rememberedValue == neverEqualPolicy) {
            rememberedValue = new ArcadeModal$$ExternalSyntheticLambda2(this, i2);
            gapComposer.updateRememberedValue(rememberedValue);
        }
        ParcelableSnapshotMutableLongState parcelableSnapshotMutableLongState = (ParcelableSnapshotMutableLongState) SaverKt.rememberSaveable(objArr, (Function0) rememberedValue, gapComposer, 0);
        Object[] objArr2 = new Object[0];
        Object rememberedValue2 = gapComposer.rememberedValue();
        if (rememberedValue2 == neverEqualPolicy) {
            rememberedValue2 = new Recipient$$ExternalSyntheticLambda2(3);
            gapComposer.updateRememberedValue(rememberedValue2);
        }
        MutableState mutableState = (MutableState) SaverKt.rememberSaveable(objArr2, (Function0) rememberedValue2, gapComposer, 48);
        Object[] objArr3 = new Object[0];
        Object rememberedValue3 = gapComposer.rememberedValue();
        if (rememberedValue3 == neverEqualPolicy) {
            rememberedValue3 = new Recipient$$ExternalSyntheticLambda2(4);
            gapComposer.updateRememberedValue(rememberedValue3);
        }
        MutableState mutableState2 = (MutableState) SaverKt.rememberSaveable(objArr3, (Function0) rememberedValue3, gapComposer, 48);
        Updater.LaunchedEffect(gapComposer, flow, new RealIdvPresenter$models$1$1(flow, (Continuation) null, (Object) this, (Object) parcelableSnapshotMutableLongState, mutableState2, mutableState, 17));
        if (((Boolean) mutableState.getValue()).booleanValue()) {
            gapComposer.end(false);
            return BitcoinP2pConversionPercentageViewModel.Loading.INSTANCE;
        }
        long longValue = parcelableSnapshotMutableLongState.getLongValue();
        boolean booleanValue = ((Boolean) mutableState2.getValue()).booleanValue();
        BitcoinP2pConversionPercentageBlocker bitcoinP2pConversionPercentageBlocker = this.blocker;
        BitcoinP2pConversionPercentageBlocker.PercentageSelectionUI percentageSelectionUI = bitcoinP2pConversionPercentageBlocker.ui_elements;
        String str4 = (percentageSelectionUI == null || (str3 = percentageSelectionUI.header) == null) ? "" : str3;
        String access$formatPercent = zzc.access$formatPercent(longValue);
        AndroidStringManager androidStringManager = this.stringManager;
        String str5 = androidStringManager.get(R.string.bitcoin_p2p_conversion_percentage_subtitle);
        BitcoinP2pConversionPercentageBlocker.PercentageSelectionUI percentageSelectionUI2 = bitcoinP2pConversionPercentageBlocker.ui_elements;
        List list = this.pickerOptionsBps;
        List list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
        Iterator it = list2.iterator();
        while (true) {
            String str6 = null;
            if (!it.hasNext()) {
                break;
            }
            long longValue2 = ((Number) it.next()).longValue();
            String access$formatPercent2 = zzc.access$formatPercent(longValue2);
            boolean z = longValue2 == longValue;
            if (percentageSelectionUI2 != null && (str2 = percentageSelectionUI2.percentage_option_accessibility_hint_template) != null) {
                str6 = String.format(str2, Arrays.copyOf(new Object[]{Long.valueOf(longValue2 / 100)}, 1));
            }
            arrayList.add(new BitcoinP2pConversionPercentageViewModel.Content.PickerOption(access$formatPercent2, longValue2, z, false, str6));
        }
        boolean z2 = !list.contains(Long.valueOf(longValue));
        if (percentageSelectionUI2 == null || (str = percentageSelectionUI2.custom_amount_subtitle) == null) {
            str = androidStringManager.get(R.string.bitcoin_p2p_conversion_custom_amount_label);
        }
        ArrayList plus = CollectionsKt.plus((Collection) arrayList, (Object) new BitcoinP2pConversionPercentageViewModel.Content.PickerOption(str, longValue, z2, true, percentageSelectionUI2 != null ? percentageSelectionUI2.custom_amount_accessibility_hint : null));
        if (percentageSelectionUI == null || (button2 = percentageSelectionUI.primary_button) == null) {
            action = null;
        } else {
            String str7 = button2.label;
            if (str7 == null) {
                str7 = "";
            }
            action = new BitcoinP2pConversionPercentageViewModel.Content.Action(str7, BitcoinP2pConversionPercentageViewEvent.Confirm.INSTANCE);
        }
        if (percentageSelectionUI == null || (button = percentageSelectionUI.secondary_button) == null) {
            action2 = null;
        } else {
            String str8 = button.label;
            if (str8 == null) {
                str8 = "";
            }
            action2 = new BitcoinP2pConversionPercentageViewModel.Content.Action(str8, BitcoinP2pConversionPercentageViewEvent.Disable.INSTANCE);
        }
        if (!booleanValue || (alertUI = bitcoinP2pConversionPercentageBlocker.exceeded_max_alert) == null) {
            alertModel = null;
        } else {
            String str9 = alertUI.title;
            if (str9 == null) {
                str9 = "";
            }
            String str10 = alertUI.detail;
            if (str10 == null) {
                str10 = "";
            }
            String str11 = alertUI.acknowledge_text;
            alertModel = new BitcoinP2pConversionPercentageViewModel.Content.AlertModel(str9, str10, str11 != null ? str11 : "");
        }
        BitcoinP2pConversionPercentageViewModel.Content content = new BitcoinP2pConversionPercentageViewModel.Content(str4, longValue, access$formatPercent, str5, plus, action, action2, alertModel, percentageSelectionUI != null ? percentageSelectionUI.sq_accessibility_label : null);
        gapComposer.end(false);
        return content;
    }
}
