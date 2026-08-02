package com.squareup.cash.profile.presenters.trustedcontact;

import androidx.biometric.AuthenticatorUtils;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.Updater;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import com.squareup.address.typeahead.backend.api.AddressKt;
import com.squareup.cash.R;
import com.squareup.cash.account.settings.viewmodels.trustedcontact.InvestingContactViewModel;
import com.squareup.cash.account.settings.viewmodels.trustedcontact.TrustedContactSettingViewModel;
import com.squareup.cash.clientsync.SyncRangeQueries$$ExternalSyntheticLambda1;
import com.squareup.cash.clientsync.readers.AndroidSyncValueSpecs;
import com.squareup.cash.clientsync.readers.SyncValueReader;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.retro.presenters.SelectPaymentPlanBlockerPresenter$models$1$2;
import com.squareup.cash.sheet.BottomSheet$$ExternalSyntheticLambda2;
import com.squareup.protos.cash.trustedcontact.SyncTrustedContact;
import com.squareup.protos.common.location.GlobalAddress;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.StateFlow;

/* loaded from: classes7.dex */
public final class InvestingContactPresenter implements MoleculePresenter {
    public final /* synthetic */ int $r8$classId;
    public final Lazy flowPresenter$delegate;
    public final TrustedContactFlowPresenter$Factory$Impl flowPresenterFactory;
    public final BetterNavigator.ScreenNavigator navigator;
    public final AndroidStringManager stringManager;
    public final SyncValueReader syncValueReader;

    public InvestingContactPresenter(SyncValueReader syncValueReader, AndroidStringManager androidStringManager, TrustedContactFlowPresenter$Factory$Impl trustedContactFlowPresenter$Factory$Impl, BetterNavigator.ScreenNavigator screenNavigator, int i) {
        this.$r8$classId = i;
        switch (i) {
            case 1:
                this.syncValueReader = syncValueReader;
                this.stringManager = androidStringManager;
                this.flowPresenterFactory = trustedContactFlowPresenter$Factory$Impl;
                this.navigator = screenNavigator;
                this.flowPresenter$delegate = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new BottomSheet$$ExternalSyntheticLambda2(this, 10));
                break;
            default:
                this.syncValueReader = syncValueReader;
                this.stringManager = androidStringManager;
                this.flowPresenterFactory = trustedContactFlowPresenter$Factory$Impl;
                this.navigator = screenNavigator;
                this.flowPresenter$delegate = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new BottomSheet$$ExternalSyntheticLambda2(this, 9));
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // app.cash.broadway.presenter.molecule.MoleculePresenter
    public final Object models(Flow flow, Composer composer, int i) {
        switch (this.$r8$classId) {
            case 0:
                flow.getClass();
                GapComposer gapComposer = (GapComposer) composer;
                gapComposer.startReplaceGroup(-1777513536);
                Object rememberedValue = gapComposer.rememberedValue();
                NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
                if (rememberedValue == neverEqualPolicy) {
                    EmptyList emptyList = EmptyList.INSTANCE;
                    AndroidStringManager androidStringManager = this.stringManager;
                    InvestingContactViewModel investingContactViewModel = new InvestingContactViewModel(emptyList, androidStringManager.get(R.string.trusted_contact_details_edit), androidStringManager.get(R.string.trusted_contact_details_remove), androidStringManager.get(R.string.trusted_contact_details_close), null, null, null, null);
                    gapComposer.updateRememberedValue(investingContactViewModel);
                    rememberedValue = investingContactViewModel;
                }
                InvestingContactViewModel investingContactViewModel2 = (InvestingContactViewModel) rememberedValue;
                Updater.LaunchedEffect(gapComposer, flow, new SelectPaymentPlanBlockerPresenter$models$1$2(flow, 0 == true ? 1 : 0, this, 19));
                Object rememberedValue2 = gapComposer.rememberedValue();
                if (rememberedValue2 == neverEqualPolicy) {
                    rememberedValue2 = this.syncValueReader.getFirstValueOrDefault(AndroidSyncValueSpecs.TrustedContact, null, new SyncRangeQueries$$ExternalSyntheticLambda1(18));
                    gapComposer.updateRememberedValue(rememberedValue2);
                }
                SyncTrustedContact syncTrustedContact = (SyncTrustedContact) Updater.collectAsState((StateFlow) rememberedValue2, null, gapComposer, 1).getValue();
                if (syncTrustedContact != null) {
                    GlobalAddress globalAddress = syncTrustedContact.address;
                    String str = syncTrustedContact.first_name;
                    str.getClass();
                    String m = Recorder$$ExternalSyntheticOutline2.m(str, " ", syncTrustedContact.last_name);
                    String str2 = syncTrustedContact.email_address;
                    String str3 = syncTrustedContact.phone_number;
                    String buildAsString = globalAddress != null ? AddressKt.buildAsString(globalAddress, false) : null;
                    List filterNotNull = ArraysKt___ArraysKt.filterNotNull(new String[]{m, syncTrustedContact.email_address, syncTrustedContact.phone_number, globalAddress != null ? AddressKt.buildAsString(globalAddress, true) : null});
                    String str4 = investingContactViewModel2.editButtonLabel;
                    String str5 = investingContactViewModel2.removeButtonLabel;
                    String str6 = investingContactViewModel2.closeButtonLabel;
                    str4.getClass();
                    str5.getClass();
                    str6.getClass();
                    investingContactViewModel2 = new InvestingContactViewModel(filterNotNull, str4, str5, str6, m, str2, str3, buildAsString);
                }
                gapComposer.end(false);
                return investingContactViewModel2;
            default:
                return models(flow, composer, i);
        }
    }

    @Override // app.cash.broadway.presenter.molecule.MoleculePresenter
    public TrustedContactSettingViewModel models(Flow flow, Composer composer, int i) {
        TrustedContactSettingViewModel trustedContactSettingViewModel;
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(-1655474350);
        Object rememberedValue = gapComposer.rememberedValue();
        Continuation continuation = null;
        if (rememberedValue == Composer.Companion.Empty) {
            rememberedValue = this.syncValueReader.getFirstValueOrDefault(AndroidSyncValueSpecs.TrustedContact, null, new SyncRangeQueries$$ExternalSyntheticLambda1(18));
            gapComposer.updateRememberedValue(rememberedValue);
        }
        MutableState collectAsState = Updater.collectAsState((StateFlow) rememberedValue, null, gapComposer, 1);
        Updater.LaunchedEffect(gapComposer, flow, new SelectPaymentPlanBlockerPresenter$models$1$2(flow, continuation, this, 20));
        SyncTrustedContact syncTrustedContact = (SyncTrustedContact) collectAsState.getValue();
        AndroidStringManager androidStringManager = this.stringManager;
        if (syncTrustedContact == null) {
            String str = androidStringManager.get(R.string.trusted_contact_setting_title);
            String str2 = androidStringManager.get(R.string.trusted_contact_setting_description_add);
            final String str3 = androidStringManager.get(R.string.trusted_contact_setting_add);
            trustedContactSettingViewModel = new TrustedContactSettingViewModel(str, str2, new AuthenticatorUtils(str3) { // from class: com.squareup.cash.account.settings.viewmodels.trustedcontact.TrustedContactSettingViewModel$ActionRow$AddTrustedContactRow
                public final String label;

                {
                    str3.getClass();
                    this.label = str3;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof TrustedContactSettingViewModel$ActionRow$AddTrustedContactRow) && Intrinsics.areEqual(this.label, ((TrustedContactSettingViewModel$ActionRow$AddTrustedContactRow) obj).label);
                }

                public final int hashCode() {
                    return this.label.hashCode();
                }

                public final String toString() {
                    return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("AddTrustedContactRow(label=", this.label, ")");
                }
            });
        } else {
            String str4 = androidStringManager.get(R.string.trusted_contact_setting_title);
            String str5 = androidStringManager.get(R.string.trusted_contact_setting_description_open);
            String str6 = syncTrustedContact.first_name;
            str6.getClass();
            String str7 = syncTrustedContact.last_name;
            str7.getClass();
            final String str8 = str6 + " " + str7;
            trustedContactSettingViewModel = new TrustedContactSettingViewModel(str4, str5, new AuthenticatorUtils(str8) { // from class: com.squareup.cash.account.settings.viewmodels.trustedcontact.TrustedContactSettingViewModel$ActionRow$OpenTrustedContactRow
                public final String name;

                {
                    this.name = str8;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof TrustedContactSettingViewModel$ActionRow$OpenTrustedContactRow) && this.name.equals(((TrustedContactSettingViewModel$ActionRow$OpenTrustedContactRow) obj).name);
                }

                public final int hashCode() {
                    return this.name.hashCode();
                }

                public final String toString() {
                    return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("OpenTrustedContactRow(name=", this.name, ")");
                }
            });
        }
        gapComposer.end(false);
        return trustedContactSettingViewModel;
    }
}
