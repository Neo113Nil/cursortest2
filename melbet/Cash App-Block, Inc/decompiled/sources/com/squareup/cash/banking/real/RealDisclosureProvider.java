package com.squareup.cash.banking.real;

import com.squareup.cash.banking.Disclosure;
import com.squareup.cash.banking.DisclosureForScreen;
import com.squareup.cash.clientsync.readers.AndroidSyncValueSpecs;
import com.squareup.cash.clientsync.readers.SyncValueReader;
import com.squareup.cash.data.profile.RealProfileManager;
import com.squareup.cash.observability.types.ErrorFeature;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.cash.observability.types.GenericDatadogError;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.franklin.api.Region;
import com.squareup.protos.unicorn.FdicDisclosureCopy;
import com.squareup.protos.unicorn.FdicInsuranceCustomerStatus;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.EmptyMap;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.collections.SetsKt__SetsJVMKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.StateFlow;

/* loaded from: classes5.dex */
public final class RealDisclosureProvider {
    public final StateFlow bankingTabFlow;
    public final ErrorReporter errorReporter;
    public final StateFlow fdicStatusFlow;
    public final RealDisclosureProvider$special$$inlined$map$1 regionFlow;

    public RealDisclosureProvider(SyncValueReader syncValueReader, ErrorReporter errorReporter, RealProfileManager realProfileManager) {
        this.errorReporter = errorReporter;
        this.regionFlow = new RealDisclosureProvider$special$$inlined$map$1(realProfileManager.region(), 0);
        this.bankingTabFlow = syncValueReader.getSingleValue(AndroidSyncValueSpecs.BankingTab);
        this.fdicStatusFlow = syncValueReader.getSingleValue(AndroidSyncValueSpecs.FdicInsuranceCustomerStatus);
    }

    public static final void access$errorIfUsCustomerReceivedNullFdicSyncValue(RealDisclosureProvider realDisclosureProvider, Region region, FdicInsuranceCustomerStatus fdicInsuranceCustomerStatus) {
        if (region == Region.USA && fdicInsuranceCustomerStatus == null) {
            ErrorReporter errorReporter = realDisclosureProvider.errorReporter;
            Set of = SetsKt__SetsJVMKt.setOf(ErrorFeature.BankingDisclosures.INSTANCE);
            EmptyMap emptyMap = EmptyMap.INSTANCE;
            emptyMap.getClass();
            of.getClass();
            errorReporter.report(new GenericDatadogError(of, "US customer did not receive FdicInsuranceCustomerStatus", MapsKt__MapsJVMKt.mapOf(new Pair("", emptyMap)), null), ErrorReporter.DefaultSamplingStrategy.INSTANCE);
        }
    }

    public static final Disclosure access$toDisclosure(RealDisclosureProvider realDisclosureProvider, FdicInsuranceCustomerStatus fdicInsuranceCustomerStatus, DisclosureForScreen disclosureForScreen) {
        FdicDisclosureCopy fdicDisclosureCopy;
        switch (disclosureForScreen.ordinal()) {
            case 0:
                fdicDisclosureCopy = fdicInsuranceCustomerStatus.account_profile_disclosure;
                break;
            case 1:
                fdicDisclosureCopy = fdicInsuranceCustomerStatus.balance_home_disclosure;
                break;
            case 2:
                fdicDisclosureCopy = fdicInsuranceCustomerStatus.benefits_booklet_disclosure;
                break;
            case 3:
                fdicDisclosureCopy = fdicInsuranceCustomerStatus.benefits_home_disclosure;
                break;
            case 4:
                fdicDisclosureCopy = fdicInsuranceCustomerStatus.cards_home_disclosure;
                break;
            case 5:
                fdicDisclosureCopy = fdicInsuranceCustomerStatus.savings_home_disclosure;
                break;
            case 6:
                fdicDisclosureCopy = fdicInsuranceCustomerStatus.paychecks_disclosure;
                break;
            case 7:
                fdicDisclosureCopy = fdicInsuranceCustomerStatus.money_tab_disclosure;
                break;
            default:
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
        }
        if (fdicDisclosureCopy == null) {
            return null;
        }
        if (fdicInsuranceCustomerStatus.is_fdic_insured) {
            LocalizedString localizedString = fdicDisclosureCopy.insured_copy;
            return new Disclosure(localizedString != null ? localizedString.translated_value : null, true);
        }
        LocalizedString localizedString2 = fdicDisclosureCopy.uninsured_copy;
        return new Disclosure(localizedString2 != null ? localizedString2.translated_value : null, false);
    }

    public final Flow disclosure(DisclosureForScreen disclosureForScreen, String str) {
        int ordinal = disclosureForScreen.ordinal();
        StateFlow stateFlow = this.bankingTabFlow;
        RealDisclosureProvider$special$$inlined$map$1 realDisclosureProvider$special$$inlined$map$1 = this.regionFlow;
        StateFlow stateFlow2 = this.fdicStatusFlow;
        switch (ordinal) {
            case 0:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                return new FlowKt__ZipKt$combine$$inlined$unsafeFlow$1(stateFlow2, realDisclosureProvider$special$$inlined$map$1, new RealDisclosureProvider$computeDisclosure$1(this, disclosureForScreen, str, null), 0);
            case 1:
                str.getClass();
                return FlowKt.combine(stateFlow, stateFlow2, realDisclosureProvider$special$$inlined$map$1, new RealDisclosureProvider$computeBalanceHomeDisclosure$1(this, str, null));
            case 7:
                str.getClass();
                return FlowKt.combine(stateFlow2, stateFlow, realDisclosureProvider$special$$inlined$map$1, new RealDisclosureProvider$computeMoneyTabDisclosure$1(this, str, null));
            default:
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
        }
    }
}
