package com.squareup.cash.account.presenters.settings;

import androidx.compose.runtime.GapComposer;
import androidx.compose.ui.text.android.CanvasCompatO;
import app.cash.badging.api.BadgingState;
import bo.app.a$$ExternalSyntheticBUOutline0;
import bo.app.yf$$ExternalSyntheticLambda2;
import com.squareup.cash.account.settings.viewmodels.AccountSettingsRow;
import com.squareup.cash.bitcoin.capability.RealBitcoinCapabilityProvider;
import com.squareup.cash.eligibility.backend.api.AccountSettingType$AccountDowngradeSettings;
import com.squareup.cash.eligibility.backend.api.SettingsEligibilityManager$AccountSettingsResult;
import com.squareup.cash.eligibility.backend.real.RealSettingsEligibilityManager;
import com.squareup.cash.featureflags.AmplitudeExperiments$MobileC4bKybEditBusinessAddress;
import com.squareup.cash.featureflags.FeatureFlag$EnabledDisabledAmplitudeExperiment$Options;
import com.squareup.cash.featureflags.FeatureFlag$StringFeatureFlag$Value;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.featureflags.LaunchDarklyFeatureFlags$BusinessAccountsProfileTaxExperience;
import com.squareup.cash.featureflags.RealFeatureFlagManager;
import com.squareup.cash.payments.backend.api.P2pSettingsManager$P2pSettings;
import com.squareup.cash.payments.backend.real.RealP2pSettingsManager;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes5.dex */
public final class BusinessInfoSetting extends AccountSettingsCapability {
    public final RealBitcoinCapabilityProvider bitcoinCapabilityProvider;
    public final FeatureFlagManager featureFlagManager;
    public final Lazy p2pSettingsFlow$delegate = LazyKt.lazy(new yf$$ExternalSyntheticLambda2(this, 15));
    public final RealP2pSettingsManager p2pSettingsManager;
    public final RealSettingsEligibilityManager settingsEligibilityManager;

    public BusinessInfoSetting(RealBitcoinCapabilityProvider realBitcoinCapabilityProvider, FeatureFlagManager featureFlagManager, RealP2pSettingsManager realP2pSettingsManager, RealSettingsEligibilityManager realSettingsEligibilityManager) {
        this.bitcoinCapabilityProvider = realBitcoinCapabilityProvider;
        this.featureFlagManager = featureFlagManager;
        this.p2pSettingsManager = realP2pSettingsManager;
        this.settingsEligibilityManager = realSettingsEligibilityManager;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* JADX WARN: Type inference failed for: r11v10, types: [int] */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v7 */
    @Override // com.squareup.cash.bitcoin.capability.BTCxCapability
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object checkAdditionalIsAvailable(Continuation continuation) {
        BusinessInfoSetting$checkAdditionalIsAvailable$1 businessInfoSetting$checkAdditionalIsAvailable$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        boolean z;
        boolean z2;
        boolean z3;
        SettingsEligibilityManager$AccountSettingsResult settingsEligibilityManager$AccountSettingsResult;
        boolean containsKey;
        Object firstOrNull;
        boolean z4;
        boolean z5;
        boolean z6;
        P2pSettingsManager$P2pSettings p2pSettingsManager$P2pSettings;
        if (continuation instanceof BusinessInfoSetting$checkAdditionalIsAvailable$1) {
            businessInfoSetting$checkAdditionalIsAvailable$1 = (BusinessInfoSetting$checkAdditionalIsAvailable$1) continuation;
            int i2 = businessInfoSetting$checkAdditionalIsAvailable$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                businessInfoSetting$checkAdditionalIsAvailable$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = businessInfoSetting$checkAdditionalIsAvailable$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = businessInfoSetting$checkAdditionalIsAvailable$1.label;
                boolean z7 = false;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    LaunchDarklyFeatureFlags$BusinessAccountsProfileTaxExperience launchDarklyFeatureFlags$BusinessAccountsProfileTaxExperience = LaunchDarklyFeatureFlags$BusinessAccountsProfileTaxExperience.INSTANCE;
                    RealFeatureFlagManager realFeatureFlagManager = (RealFeatureFlagManager) this.featureFlagManager;
                    String str = ((FeatureFlag$StringFeatureFlag$Value) realFeatureFlagManager.peekCurrentValue(launchDarklyFeatureFlags$BusinessAccountsProfileTaxExperience)).value;
                    boolean z8 = Intrinsics.areEqual(str, "ENABLE_TAX_INFO") || Intrinsics.areEqual(str, "ENABLE_ALL");
                    boolean enabled = ((FeatureFlag$EnabledDisabledAmplitudeExperiment$Options) realFeatureFlagManager.peekCurrentValue(AmplitudeExperiments$MobileC4bKybEditBusinessAddress.INSTANCE)).enabled();
                    String str2 = ((FeatureFlag$StringFeatureFlag$Value) realFeatureFlagManager.currentExperimentValue(launchDarklyFeatureFlags$BusinessAccountsProfileTaxExperience, false)).value;
                    boolean z9 = Intrinsics.areEqual(str2, "ENABLE_DOWNGRADE") || Intrinsics.areEqual(str2, "ENABLE_ALL");
                    businessInfoSetting$checkAdditionalIsAvailable$1.Z$0 = z8;
                    businessInfoSetting$checkAdditionalIsAvailable$1.Z$1 = enabled;
                    businessInfoSetting$checkAdditionalIsAvailable$1.Z$2 = z9;
                    businessInfoSetting$checkAdditionalIsAvailable$1.label = 1;
                    Object obj2 = this.settingsEligibilityManager.settings(businessInfoSetting$checkAdditionalIsAvailable$1);
                    if (obj2 != coroutineSingletons) {
                        z = z9;
                        obj = obj2;
                        z2 = z8;
                        z3 = enabled;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ?? r11 = businessInfoSetting$checkAdditionalIsAvailable$1.I$0;
                    z4 = businessInfoSetting$checkAdditionalIsAvailable$1.Z$2;
                    z5 = businessInfoSetting$checkAdditionalIsAvailable$1.Z$1;
                    z6 = businessInfoSetting$checkAdditionalIsAvailable$1.Z$0;
                    BusinessInfoSetting businessInfoSetting = businessInfoSetting$checkAdditionalIsAvailable$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                    containsKey = r11;
                    this = businessInfoSetting;
                    firstOrNull = obj;
                    p2pSettingsManager$P2pSettings = (P2pSettingsManager$P2pSettings) firstOrNull;
                    this.getClass();
                    if (p2pSettingsManager$P2pSettings == null ? CanvasCompatO.isRatePlanBusiness(p2pSettingsManager$P2pSettings) : false) {
                        ?? r112 = containsKey;
                        if (z6 || z5 || (z4 && r112 != false)) {
                            z7 = true;
                        }
                    }
                    return Boolean.valueOf(z7);
                }
                z = businessInfoSetting$checkAdditionalIsAvailable$1.Z$2;
                z3 = businessInfoSetting$checkAdditionalIsAvailable$1.Z$1;
                z2 = businessInfoSetting$checkAdditionalIsAvailable$1.Z$0;
                SafeTrace.throwOnFailure(obj);
                settingsEligibilityManager$AccountSettingsResult = (SettingsEligibilityManager$AccountSettingsResult) obj;
                if (!(settingsEligibilityManager$AccountSettingsResult instanceof SettingsEligibilityManager$AccountSettingsResult.SettingsError)) {
                    containsKey = true;
                } else {
                    if (!(settingsEligibilityManager$AccountSettingsResult instanceof SettingsEligibilityManager$AccountSettingsResult.SettingsLoaded)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    containsKey = ((SettingsEligibilityManager$AccountSettingsResult.SettingsLoaded) settingsEligibilityManager$AccountSettingsResult).cache.accountDowngrade.cache.containsKey(AccountSettingType$AccountDowngradeSettings.AccountDowngradeSubSetting.DOWNGRADE_TO_P2P);
                }
                Flow flow = (Flow) this.p2pSettingsFlow$delegate.getValue();
                businessInfoSetting$checkAdditionalIsAvailable$1.L$0 = this;
                businessInfoSetting$checkAdditionalIsAvailable$1.Z$0 = z2;
                businessInfoSetting$checkAdditionalIsAvailable$1.Z$1 = z3;
                businessInfoSetting$checkAdditionalIsAvailable$1.Z$2 = z;
                businessInfoSetting$checkAdditionalIsAvailable$1.I$0 = containsKey ? 1 : 0;
                businessInfoSetting$checkAdditionalIsAvailable$1.label = 2;
                firstOrNull = FlowKt.firstOrNull(flow, businessInfoSetting$checkAdditionalIsAvailable$1);
                if (firstOrNull != coroutineSingletons) {
                    z4 = z;
                    z5 = z3;
                    z6 = z2;
                    p2pSettingsManager$P2pSettings = (P2pSettingsManager$P2pSettings) firstOrNull;
                    this.getClass();
                    if (p2pSettingsManager$P2pSettings == null ? CanvasCompatO.isRatePlanBusiness(p2pSettingsManager$P2pSettings) : false) {
                    }
                    return Boolean.valueOf(z7);
                }
                return coroutineSingletons;
            }
        }
        businessInfoSetting$checkAdditionalIsAvailable$1 = new BusinessInfoSetting$checkAdditionalIsAvailable$1(this, (ContinuationImpl) continuation);
        Object obj3 = businessInfoSetting$checkAdditionalIsAvailable$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = businessInfoSetting$checkAdditionalIsAvailable$1.label;
        boolean z72 = false;
        if (i != 0) {
        }
        settingsEligibilityManager$AccountSettingsResult = (SettingsEligibilityManager$AccountSettingsResult) obj3;
        if (!(settingsEligibilityManager$AccountSettingsResult instanceof SettingsEligibilityManager$AccountSettingsResult.SettingsError)) {
        }
        Flow flow2 = (Flow) this.p2pSettingsFlow$delegate.getValue();
        businessInfoSetting$checkAdditionalIsAvailable$1.L$0 = this;
        businessInfoSetting$checkAdditionalIsAvailable$1.Z$0 = z2;
        businessInfoSetting$checkAdditionalIsAvailable$1.Z$1 = z3;
        businessInfoSetting$checkAdditionalIsAvailable$1.Z$2 = z;
        businessInfoSetting$checkAdditionalIsAvailable$1.I$0 = containsKey ? 1 : 0;
        businessInfoSetting$checkAdditionalIsAvailable$1.label = 2;
        firstOrNull = FlowKt.firstOrNull(flow2, businessInfoSetting$checkAdditionalIsAvailable$1);
        if (firstOrNull != coroutineSingletons) {
        }
        return coroutineSingletons;
    }

    @Override // com.squareup.cash.bitcoin.capability.BTCxCapability
    public final RealBitcoinCapabilityProvider getBitcoinCapabilityProvider() {
        return this.bitcoinCapabilityProvider;
    }

    @Override // com.squareup.cash.account.presenters.settings.AccountSettingsCapability
    public final AccountSettingsRow getRow(BadgingState badgingState, GapComposer gapComposer) {
        badgingState.getClass();
        gapComposer.startReplaceGroup(-465890748);
        gapComposer.end(false);
        return AccountSettingsRow.BusinessInfo.INSTANCE;
    }
}
