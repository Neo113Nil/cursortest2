package com.squareup.cash.money.disclosure;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import com.squareup.cash.clientsync.readers.AndroidSyncValueSpecs;
import com.squareup.cash.clientsync.readers.SyncValueReader;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.money.views.MoneyTabUIKt$$ExternalSyntheticLambda5;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.unicorn.BankingTab;
import com.squareup.protos.unicorn.FdicDisclosureCopy;
import com.squareup.protos.unicorn.FdicInsuranceCustomerStatus;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.StateFlow;

/* loaded from: classes5.dex */
public final class DisclosureRepository implements MoleculePresenter {
    public final FeatureFlagManager featureFlagManager;
    public final SyncValueReader syncValueReader;

    public DisclosureRepository(SyncValueReader syncValueReader, FeatureFlagManager featureFlagManager) {
        this.syncValueReader = syncValueReader;
        this.featureFlagManager = featureFlagManager;
    }

    public final DisclosureItemModel models(Flow flow, Composer composer) {
        BankingTab.Disclosure disclosure;
        LocalizedString localizedString;
        LocalizedString localizedString2;
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(1786046014);
        Object rememberedValue = gapComposer.rememberedValue();
        SyncValueReader syncValueReader = this.syncValueReader;
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        if (rememberedValue == neverEqualPolicy) {
            rememberedValue = syncValueReader.getSingleValue(AndroidSyncValueSpecs.BankingTab);
            gapComposer.updateRememberedValue(rememberedValue);
        }
        String str = null;
        int i = 1;
        MutableState collectAsState = Updater.collectAsState((StateFlow) rememberedValue, null, gapComposer, 1);
        Object rememberedValue2 = gapComposer.rememberedValue();
        if (rememberedValue2 == neverEqualPolicy) {
            rememberedValue2 = syncValueReader.getSingleValue(AndroidSyncValueSpecs.FdicInsuranceCustomerStatus);
            gapComposer.updateRememberedValue(rememberedValue2);
        }
        MutableState collectAsState2 = Updater.collectAsState((StateFlow) rememberedValue2, null, gapComposer, 1);
        Object rememberedValue3 = gapComposer.rememberedValue();
        if (rememberedValue3 == neverEqualPolicy) {
            rememberedValue3 = Updater.derivedStateOf(new MoneyTabUIKt$$ExternalSyntheticLambda5(this, i));
            gapComposer.updateRememberedValue(rememberedValue3);
        }
        State state = (State) rememberedValue3;
        boolean changed = gapComposer.changed((BankingTab) collectAsState.getValue()) | gapComposer.changed((FdicInsuranceCustomerStatus) collectAsState2.getValue()) | gapComposer.changed(((Boolean) state.getValue()).booleanValue());
        Object rememberedValue4 = gapComposer.rememberedValue();
        if (changed || rememberedValue4 == neverEqualPolicy) {
            FdicInsuranceCustomerStatus fdicInsuranceCustomerStatus = (FdicInsuranceCustomerStatus) collectAsState2.getValue();
            BankingTab bankingTab = (BankingTab) collectAsState.getValue();
            boolean booleanValue = ((Boolean) state.getValue()).booleanValue();
            if (booleanValue && fdicInsuranceCustomerStatus != null && fdicInsuranceCustomerStatus.is_fdic_insured) {
                FdicDisclosureCopy fdicDisclosureCopy = fdicInsuranceCustomerStatus.money_tab_disclosure;
                if (fdicDisclosureCopy != null && (localizedString2 = fdicDisclosureCopy.insured_copy) != null) {
                    str = localizedString2.translated_value;
                }
            } else if (booleanValue && fdicInsuranceCustomerStatus != null && !fdicInsuranceCustomerStatus.is_fdic_insured) {
                FdicDisclosureCopy fdicDisclosureCopy2 = fdicInsuranceCustomerStatus.money_tab_disclosure;
                if (fdicDisclosureCopy2 != null && (localizedString = fdicDisclosureCopy2.uninsured_copy) != null) {
                    str = localizedString.translated_value;
                }
            } else if (bankingTab != null && (disclosure = bankingTab.disclosure) != null) {
                str = disclosure.text;
            }
            if (str == null) {
                str = "";
            }
            rememberedValue4 = new DisclosureItemModel(str);
            gapComposer.updateRememberedValue(rememberedValue4);
        }
        DisclosureItemModel disclosureItemModel = (DisclosureItemModel) rememberedValue4;
        gapComposer.end(false);
        return disclosureItemModel;
    }

    @Override // app.cash.broadway.presenter.molecule.MoleculePresenter
    public final /* bridge */ /* synthetic */ Object models(Flow flow, Composer composer, int i) {
        return models(flow, composer);
    }
}
