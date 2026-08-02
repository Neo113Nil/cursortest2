package com.squareup.cash.account.manager.backend.real;

import androidx.compose.ui.text.android.CanvasCompatO;
import bo.app.a$$ExternalSyntheticBUOutline0;
import bo.app.yf$$ExternalSyntheticLambda2;
import com.squareup.cash.eligibility.backend.api.AccountSettingType$AccountDowngradeSettings;
import com.squareup.cash.eligibility.backend.api.AccountSettingType$AccountUpgradeSettings;
import com.squareup.cash.eligibility.backend.api.SettingsEligibilityManager$AccountSettingsResult;
import com.squareup.cash.eligibility.backend.real.RealSettingsEligibilityManager;
import com.squareup.cash.featureflags.FeatureFlag$StringFeatureFlag$Value;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.featureflags.LaunchDarklyFeatureFlags$BusinessAccountsProfileTaxExperience;
import com.squareup.cash.featureflags.RealFeatureFlagManager;
import com.squareup.cash.payments.backend.api.P2pSettingsManager$P2pSettings;
import com.squareup.cash.payments.backend.real.RealP2pSettingsManager;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes5.dex */
public final class RealAccountRatePlanManager {
    public final FeatureFlagManager featureFlagManager;
    public final Lazy p2pSettingsFlow$delegate = LazyKt.lazy(new yf$$ExternalSyntheticLambda2(this, 14));
    public final RealP2pSettingsManager p2pSettingsManager;
    public final RealSettingsEligibilityManager settingsEligibilityManager;

    public RealAccountRatePlanManager(FeatureFlagManager featureFlagManager, RealP2pSettingsManager realP2pSettingsManager, RealSettingsEligibilityManager realSettingsEligibilityManager) {
        this.featureFlagManager = featureFlagManager;
        this.p2pSettingsManager = realP2pSettingsManager;
        this.settingsEligibilityManager = realSettingsEligibilityManager;
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x004b, code lost:
    
        if (r9 == r1) goto L32;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object canDowngrade(ContinuationImpl continuationImpl) {
        RealAccountRatePlanManager$canDowngrade$1 realAccountRatePlanManager$canDowngrade$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        Object obj;
        int i2;
        boolean z;
        SettingsEligibilityManager$AccountSettingsResult settingsEligibilityManager$AccountSettingsResult;
        boolean containsKey;
        if (continuationImpl instanceof RealAccountRatePlanManager$canDowngrade$1) {
            realAccountRatePlanManager$canDowngrade$1 = (RealAccountRatePlanManager$canDowngrade$1) continuationImpl;
            int i3 = realAccountRatePlanManager$canDowngrade$1.label;
            if ((i3 & PKIFailureInfo.systemUnavail) != 0) {
                realAccountRatePlanManager$canDowngrade$1.label = i3 - PKIFailureInfo.systemUnavail;
                Object obj2 = realAccountRatePlanManager$canDowngrade$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realAccountRatePlanManager$canDowngrade$1.label;
                boolean z2 = false;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj2);
                    Flow flow = (Flow) this.p2pSettingsFlow$delegate.getValue();
                    realAccountRatePlanManager$canDowngrade$1.label = 1;
                    obj2 = FlowKt.firstOrNull(flow, realAccountRatePlanManager$canDowngrade$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        z = realAccountRatePlanManager$canDowngrade$1.Z$0;
                        i2 = realAccountRatePlanManager$canDowngrade$1.I$0;
                        SafeTrace.throwOnFailure(obj2);
                        settingsEligibilityManager$AccountSettingsResult = (SettingsEligibilityManager$AccountSettingsResult) obj2;
                        if (!(settingsEligibilityManager$AccountSettingsResult instanceof SettingsEligibilityManager$AccountSettingsResult.SettingsError)) {
                            containsKey = true;
                        } else {
                            if (!(settingsEligibilityManager$AccountSettingsResult instanceof SettingsEligibilityManager$AccountSettingsResult.SettingsLoaded)) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return null;
                            }
                            containsKey = ((SettingsEligibilityManager$AccountSettingsResult.SettingsLoaded) settingsEligibilityManager$AccountSettingsResult).cache.accountDowngrade.cache.containsKey(AccountSettingType$AccountDowngradeSettings.AccountDowngradeSubSetting.DOWNGRADE_TO_P2P);
                        }
                        if (i2 != 0 && z && containsKey) {
                            z2 = true;
                        }
                        return Boolean.valueOf(z2);
                    }
                    SafeTrace.throwOnFailure(obj2);
                }
                P2pSettingsManager$P2pSettings p2pSettingsManager$P2pSettings = (P2pSettingsManager$P2pSettings) obj2;
                int isRatePlanBusiness = p2pSettingsManager$P2pSettings == null ? CanvasCompatO.isRatePlanBusiness(p2pSettingsManager$P2pSettings) : 0;
                String str = ((FeatureFlag$StringFeatureFlag$Value) ((RealFeatureFlagManager) this.featureFlagManager).peekCurrentValue(LaunchDarklyFeatureFlags$BusinessAccountsProfileTaxExperience.INSTANCE)).value;
                boolean z3 = !Intrinsics.areEqual(str, "ENABLE_DOWNGRADE") || Intrinsics.areEqual(str, "ENABLE_ALL");
                realAccountRatePlanManager$canDowngrade$1.I$0 = isRatePlanBusiness;
                realAccountRatePlanManager$canDowngrade$1.Z$0 = z3;
                realAccountRatePlanManager$canDowngrade$1.label = 2;
                obj = this.settingsEligibilityManager.settings(realAccountRatePlanManager$canDowngrade$1);
                if (obj != coroutineSingletons) {
                    i2 = isRatePlanBusiness;
                    obj2 = obj;
                    z = z3;
                    settingsEligibilityManager$AccountSettingsResult = (SettingsEligibilityManager$AccountSettingsResult) obj2;
                    if (!(settingsEligibilityManager$AccountSettingsResult instanceof SettingsEligibilityManager$AccountSettingsResult.SettingsError)) {
                    }
                    if (i2 != 0) {
                        z2 = true;
                    }
                    return Boolean.valueOf(z2);
                }
                return coroutineSingletons;
            }
        }
        realAccountRatePlanManager$canDowngrade$1 = new RealAccountRatePlanManager$canDowngrade$1(this, continuationImpl);
        Object obj22 = realAccountRatePlanManager$canDowngrade$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realAccountRatePlanManager$canDowngrade$1.label;
        boolean z22 = false;
        if (i != 0) {
        }
        P2pSettingsManager$P2pSettings p2pSettingsManager$P2pSettings2 = (P2pSettingsManager$P2pSettings) obj22;
        if (p2pSettingsManager$P2pSettings2 == null) {
        }
        String str2 = ((FeatureFlag$StringFeatureFlag$Value) ((RealFeatureFlagManager) this.featureFlagManager).peekCurrentValue(LaunchDarklyFeatureFlags$BusinessAccountsProfileTaxExperience.INSTANCE)).value;
        if (Intrinsics.areEqual(str2, "ENABLE_DOWNGRADE")) {
        }
        realAccountRatePlanManager$canDowngrade$1.I$0 = isRatePlanBusiness;
        realAccountRatePlanManager$canDowngrade$1.Z$0 = z3;
        realAccountRatePlanManager$canDowngrade$1.label = 2;
        obj = this.settingsEligibilityManager.settings(realAccountRatePlanManager$canDowngrade$1);
        if (obj != coroutineSingletons) {
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0049, code lost:
    
        if (r9 == r1) goto L27;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object canUpgrade(ContinuationImpl continuationImpl) {
        RealAccountRatePlanManager$canUpgrade$1 realAccountRatePlanManager$canUpgrade$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        Object obj;
        int i2;
        Boolean bool;
        SettingsEligibilityManager$AccountSettingsResult settingsEligibilityManager$AccountSettingsResult;
        boolean containsKey;
        if (continuationImpl instanceof RealAccountRatePlanManager$canUpgrade$1) {
            realAccountRatePlanManager$canUpgrade$1 = (RealAccountRatePlanManager$canUpgrade$1) continuationImpl;
            int i3 = realAccountRatePlanManager$canUpgrade$1.label;
            if ((i3 & PKIFailureInfo.systemUnavail) != 0) {
                realAccountRatePlanManager$canUpgrade$1.label = i3 - PKIFailureInfo.systemUnavail;
                Object obj2 = realAccountRatePlanManager$canUpgrade$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realAccountRatePlanManager$canUpgrade$1.label;
                boolean z = false;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj2);
                    Flow flow = (Flow) this.p2pSettingsFlow$delegate.getValue();
                    realAccountRatePlanManager$canUpgrade$1.label = 1;
                    obj2 = FlowKt.firstOrNull(flow, realAccountRatePlanManager$canUpgrade$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        i2 = realAccountRatePlanManager$canUpgrade$1.I$0;
                        SafeTrace.throwOnFailure(obj2);
                        settingsEligibilityManager$AccountSettingsResult = (SettingsEligibilityManager$AccountSettingsResult) obj2;
                        if (!(settingsEligibilityManager$AccountSettingsResult instanceof SettingsEligibilityManager$AccountSettingsResult.SettingsError)) {
                            containsKey = false;
                        } else {
                            if (!(settingsEligibilityManager$AccountSettingsResult instanceof SettingsEligibilityManager$AccountSettingsResult.SettingsLoaded)) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return null;
                            }
                            containsKey = ((SettingsEligibilityManager$AccountSettingsResult.SettingsLoaded) settingsEligibilityManager$AccountSettingsResult).cache.accountUpgrade.cache.containsKey(AccountSettingType$AccountUpgradeSettings.AccountUpgradeSubSetting.UPGRADE_TO_BUSINESS);
                        }
                        if (i2 != 0 && containsKey) {
                            z = true;
                        }
                        return Boolean.valueOf(z);
                    }
                    SafeTrace.throwOnFailure(obj2);
                }
                P2pSettingsManager$P2pSettings p2pSettingsManager$P2pSettings = (P2pSettingsManager$P2pSettings) obj2;
                int booleanValue = (p2pSettingsManager$P2pSettings != null || (bool = p2pSettingsManager$P2pSettings.canUpgradeToBusiness) == null) ? 0 : bool.booleanValue();
                realAccountRatePlanManager$canUpgrade$1.I$0 = booleanValue;
                realAccountRatePlanManager$canUpgrade$1.label = 2;
                obj = this.settingsEligibilityManager.settings(realAccountRatePlanManager$canUpgrade$1);
                if (obj != coroutineSingletons) {
                    int i4 = booleanValue;
                    obj2 = obj;
                    i2 = i4;
                    settingsEligibilityManager$AccountSettingsResult = (SettingsEligibilityManager$AccountSettingsResult) obj2;
                    if (!(settingsEligibilityManager$AccountSettingsResult instanceof SettingsEligibilityManager$AccountSettingsResult.SettingsError)) {
                    }
                    if (i2 != 0) {
                        z = true;
                    }
                    return Boolean.valueOf(z);
                }
                return coroutineSingletons;
            }
        }
        realAccountRatePlanManager$canUpgrade$1 = new RealAccountRatePlanManager$canUpgrade$1(this, continuationImpl);
        Object obj22 = realAccountRatePlanManager$canUpgrade$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realAccountRatePlanManager$canUpgrade$1.label;
        boolean z2 = false;
        if (i != 0) {
        }
        P2pSettingsManager$P2pSettings p2pSettingsManager$P2pSettings2 = (P2pSettingsManager$P2pSettings) obj22;
        if (p2pSettingsManager$P2pSettings2 != null) {
        }
        realAccountRatePlanManager$canUpgrade$1.I$0 = booleanValue;
        realAccountRatePlanManager$canUpgrade$1.label = 2;
        obj = this.settingsEligibilityManager.settings(realAccountRatePlanManager$canUpgrade$1);
        if (obj != coroutineSingletons) {
        }
        return coroutineSingletons;
    }
}
