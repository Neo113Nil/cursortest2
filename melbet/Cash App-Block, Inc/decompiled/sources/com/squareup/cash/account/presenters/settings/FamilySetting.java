package com.squareup.cash.account.presenters.settings;

import androidx.compose.runtime.GapComposer;
import app.cash.badging.api.BadgingState;
import app.cash.badging.backend.FinishSetupTileBadgeCounter;
import app.cash.local.views.LocalViewFactory;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.account.settings.viewmodels.AccountSettingsRow;
import com.squareup.cash.arcade.ArcadeModule$ProvideHapticVibratorMetroFactory;
import com.squareup.cash.bitcoin.capability.RealBitcoinCapabilityProvider;
import com.squareup.cash.eligibility.backend.api.AccountSettingType$FamilySettings;
import com.squareup.cash.eligibility.backend.api.AccountSettingType$ShoppingSettings;
import com.squareup.cash.eligibility.backend.api.EligibleFeature;
import com.squareup.cash.eligibility.backend.api.SettingsEligibilityManager$AccountSettingsResult;
import com.squareup.cash.eligibility.backend.real.RealFeatureEligibilityRepository;
import com.squareup.cash.eligibility.backend.real.RealSettingsEligibilityManager;
import com.squareup.cash.family.applets.backend.api.FamilyAppletConfig;
import com.squareup.cash.family.applets.backend.real.RealFamilyAppletConfigProvider;
import com.squareup.cash.family.familyhub.backend.real.RealFamilyAccountsManager;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.payments.backend.real.RealP2pSettingsManager;
import com.squareup.protos.cash.janus.api.GetAccountSettingsResponse;
import com.squareup.util.coroutines.DerivedStateFlow;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import dev.zacsweers.metro.Provider;
import dev.zacsweers.metro.internal.DoubleCheck;
import dev.zacsweers.metro.internal.Factory;
import java.util.Set;
import kotlin.collections.EmptySet;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapMerge$$inlined$map$1;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes5.dex */
public final class FamilySetting extends AccountSettingsCapability {
    public final /* synthetic */ int $r8$classId = 1;
    public final RealBitcoinCapabilityProvider bitcoinCapabilityProvider;
    public final Object familyAppletConfigProvider;
    public final RealFeatureEligibilityRepository featureEligibilityRepository;
    public final RealSettingsEligibilityManager settingsEligibilityManager;

    public FamilySetting(RealBitcoinCapabilityProvider realBitcoinCapabilityProvider, RealFeatureEligibilityRepository realFeatureEligibilityRepository, RealFamilyAccountsManager realFamilyAccountsManager, RealSettingsEligibilityManager realSettingsEligibilityManager) {
        this.bitcoinCapabilityProvider = realBitcoinCapabilityProvider;
        this.featureEligibilityRepository = realFeatureEligibilityRepository;
        this.familyAppletConfigProvider = realFamilyAccountsManager;
        this.settingsEligibilityManager = realSettingsEligibilityManager;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x005e, code lost:
    
        if (r11 == r2) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x004d, code lost:
    
        if (r11 == r2) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x00da, code lost:
    
        if (r11 == r2) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x00be, code lost:
    
        if (r11 == r2) goto L80;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00b5  */
    @Override // com.squareup.cash.bitcoin.capability.BTCxCapability
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object checkAdditionalIsAvailable(Continuation continuation) {
        FamilySetting$checkAdditionalIsAvailable$1 familySetting$checkAdditionalIsAvailable$1;
        Object obj;
        int i;
        ShoppingSetting$checkAdditionalIsAvailable$1 shoppingSetting$checkAdditionalIsAvailable$1;
        Object obj2;
        int i2;
        switch (this.$r8$classId) {
            case 0:
                if (continuation instanceof FamilySetting$checkAdditionalIsAvailable$1) {
                    familySetting$checkAdditionalIsAvailable$1 = (FamilySetting$checkAdditionalIsAvailable$1) continuation;
                    int i3 = familySetting$checkAdditionalIsAvailable$1.label;
                    if ((i3 & PKIFailureInfo.systemUnavail) != 0) {
                        familySetting$checkAdditionalIsAvailable$1.label = i3 - PKIFailureInfo.systemUnavail;
                        obj = familySetting$checkAdditionalIsAvailable$1.result;
                        Object obj3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i = familySetting$checkAdditionalIsAvailable$1.label;
                        if (i != 0) {
                            SafeTrace.throwOnFailure(obj);
                            familySetting$checkAdditionalIsAvailable$1.label = 1;
                            obj = passesSettingsEligibility(familySetting$checkAdditionalIsAvailable$1);
                            break;
                        } else {
                            if (i != 1) {
                                if (i != 2) {
                                    if (i == 3 || i == 4 || i == 5) {
                                        SafeTrace.throwOnFailure(obj);
                                        return obj;
                                    }
                                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                SafeTrace.throwOnFailure(obj);
                                FamilyAppletConfig familyAppletConfig = (FamilyAppletConfig) obj;
                                if (familyAppletConfig instanceof FamilyAppletConfig.Sponsor) {
                                    return Boolean.FALSE;
                                }
                                if (Intrinsics.areEqual(familyAppletConfig, FamilyAppletConfig.SponsoredTeen.INSTANCE)) {
                                    familySetting$checkAdditionalIsAvailable$1.label = 3;
                                    Object isMoneyFamiliesAppletEligible = isMoneyFamiliesAppletEligible(familySetting$checkAdditionalIsAvailable$1);
                                    if (isMoneyFamiliesAppletEligible != obj3) {
                                        return isMoneyFamiliesAppletEligible;
                                    }
                                } else if (Intrinsics.areEqual(familyAppletConfig, FamilyAppletConfig.Unverified.INSTANCE) || Intrinsics.areEqual(familyAppletConfig, FamilyAppletConfig.VerifiedNonSponsor.INSTANCE)) {
                                    familySetting$checkAdditionalIsAvailable$1.label = 4;
                                    Object isMoneyFamiliesAppletEligible2 = isMoneyFamiliesAppletEligible(familySetting$checkAdditionalIsAvailable$1);
                                    if (isMoneyFamiliesAppletEligible2 != obj3) {
                                        return isMoneyFamiliesAppletEligible2;
                                    }
                                } else {
                                    if (familyAppletConfig != null) {
                                        Drop$$ExternalSyntheticBUOutline0.m1m();
                                        return null;
                                    }
                                    familySetting$checkAdditionalIsAvailable$1.label = 5;
                                    Object isEligibleForPostIdvFallback = isEligibleForPostIdvFallback(familySetting$checkAdditionalIsAvailable$1);
                                    if (isEligibleForPostIdvFallback != obj3) {
                                        return isEligibleForPostIdvFallback;
                                    }
                                }
                                return obj3;
                            }
                            SafeTrace.throwOnFailure(obj);
                        }
                        if (!((Boolean) obj).booleanValue()) {
                            FlowKt__MergeKt$flatMapMerge$$inlined$map$1 familyAppletConfig2 = ((RealFamilyAppletConfigProvider) this.familyAppletConfigProvider).getFamilyAppletConfig();
                            familySetting$checkAdditionalIsAvailable$1.label = 2;
                            obj = FlowKt.firstOrNull(familyAppletConfig2, familySetting$checkAdditionalIsAvailable$1);
                            break;
                        } else {
                            return Boolean.FALSE;
                        }
                    }
                }
                familySetting$checkAdditionalIsAvailable$1 = new FamilySetting$checkAdditionalIsAvailable$1(this, (ContinuationImpl) continuation);
                obj = familySetting$checkAdditionalIsAvailable$1.result;
                Object obj32 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = familySetting$checkAdditionalIsAvailable$1.label;
                if (i != 0) {
                }
                if (!((Boolean) obj).booleanValue()) {
                }
                break;
            default:
                if (continuation instanceof ShoppingSetting$checkAdditionalIsAvailable$1) {
                    shoppingSetting$checkAdditionalIsAvailable$1 = (ShoppingSetting$checkAdditionalIsAvailable$1) continuation;
                    int i4 = shoppingSetting$checkAdditionalIsAvailable$1.label;
                    if ((i4 & PKIFailureInfo.systemUnavail) != 0) {
                        shoppingSetting$checkAdditionalIsAvailable$1.label = i4 - PKIFailureInfo.systemUnavail;
                        obj2 = shoppingSetting$checkAdditionalIsAvailable$1.result;
                        Object obj4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i2 = shoppingSetting$checkAdditionalIsAvailable$1.label;
                        if (i2 != 0) {
                            SafeTrace.throwOnFailure(obj2);
                            shoppingSetting$checkAdditionalIsAvailable$1.label = 1;
                            obj2 = isFeatureEligible(shoppingSetting$checkAdditionalIsAvailable$1);
                            break;
                        } else {
                            if (i2 != 1) {
                                if (i2 != 2) {
                                    if (i2 == 3) {
                                        SafeTrace.throwOnFailure(obj2);
                                        return obj2;
                                    }
                                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                SafeTrace.throwOnFailure(obj2);
                                if (((Boolean) obj2).booleanValue()) {
                                    shoppingSetting$checkAdditionalIsAvailable$1.label = 3;
                                    Object isSettingsEligible = isSettingsEligible(shoppingSetting$checkAdditionalIsAvailable$1);
                                    if (isSettingsEligible != obj4) {
                                        return isSettingsEligible;
                                    }
                                    return obj4;
                                }
                                return Boolean.FALSE;
                            }
                            SafeTrace.throwOnFailure(obj2);
                        }
                        if (((Boolean) obj2).booleanValue()) {
                            shoppingSetting$checkAdditionalIsAvailable$1.label = 2;
                            obj2 = isNotSponsored(shoppingSetting$checkAdditionalIsAvailable$1);
                            break;
                        }
                        return Boolean.FALSE;
                    }
                }
                shoppingSetting$checkAdditionalIsAvailable$1 = new ShoppingSetting$checkAdditionalIsAvailable$1(this, (ContinuationImpl) continuation);
                obj2 = shoppingSetting$checkAdditionalIsAvailable$1.result;
                Object obj42 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = shoppingSetting$checkAdditionalIsAvailable$1.label;
                if (i2 != 0) {
                }
                if (((Boolean) obj2).booleanValue()) {
                }
                return Boolean.FALSE;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0047 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object currentEligibleFeatures(ContinuationImpl continuationImpl) {
        FamilySetting$currentEligibleFeatures$1 familySetting$currentEligibleFeatures$1;
        int i;
        if (continuationImpl instanceof FamilySetting$currentEligibleFeatures$1) {
            familySetting$currentEligibleFeatures$1 = (FamilySetting$currentEligibleFeatures$1) continuationImpl;
            int i2 = familySetting$currentEligibleFeatures$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                familySetting$currentEligibleFeatures$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = familySetting$currentEligibleFeatures$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = familySetting$currentEligibleFeatures$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    FinishSetupTileBadgeCounter currentEligibleFeatures = this.featureEligibilityRepository.currentEligibleFeatures();
                    familySetting$currentEligibleFeatures$1.label = 1;
                    obj = FlowKt.firstOrNull(currentEligibleFeatures, familySetting$currentEligibleFeatures$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                Set set = (Set) obj;
                return set != null ? EmptySet.INSTANCE : set;
            }
        }
        familySetting$currentEligibleFeatures$1 = new FamilySetting$currentEligibleFeatures$1(this, continuationImpl);
        Object obj2 = familySetting$currentEligibleFeatures$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = familySetting$currentEligibleFeatures$1.label;
        if (i != 0) {
        }
        Set set2 = (Set) obj2;
        if (set2 != null) {
        }
    }

    @Override // com.squareup.cash.bitcoin.capability.BTCxCapability
    public final RealBitcoinCapabilityProvider getBitcoinCapabilityProvider() {
        int i = this.$r8$classId;
        return this.bitcoinCapabilityProvider;
    }

    @Override // com.squareup.cash.account.presenters.settings.AccountSettingsCapability
    public final AccountSettingsRow getRow(BadgingState badgingState, GapComposer gapComposer) {
        int i = this.$r8$classId;
        badgingState.getClass();
        switch (i) {
            case 0:
                gapComposer.startReplaceGroup(-44780220);
                AccountSettingsRow.Family family = new AccountSettingsRow.Family(badgingState.familyAccounts > 0);
                gapComposer.end(false);
                return family;
            default:
                gapComposer.startReplaceGroup(-286430076);
                gapComposer.end(false);
                return AccountSettingsRow.Shopping.INSTANCE;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object isEligibleForPostIdvFallback(ContinuationImpl continuationImpl) {
        FamilySetting$isEligibleForPostIdvFallback$1 familySetting$isEligibleForPostIdvFallback$1;
        int i;
        if (continuationImpl instanceof FamilySetting$isEligibleForPostIdvFallback$1) {
            familySetting$isEligibleForPostIdvFallback$1 = (FamilySetting$isEligibleForPostIdvFallback$1) continuationImpl;
            int i2 = familySetting$isEligibleForPostIdvFallback$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                familySetting$isEligibleForPostIdvFallback$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = familySetting$isEligibleForPostIdvFallback$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = familySetting$isEligibleForPostIdvFallback$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    familySetting$isEligibleForPostIdvFallback$1.label = 1;
                    obj = currentEligibleFeatures(familySetting$isEligibleForPostIdvFallback$1);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                Set set = (Set) obj;
                return Boolean.valueOf(!set.contains(EligibleFeature.MONEY_FAMILIES_APPLET) && set.contains(EligibleFeature.SPONSOR_ELIGIBLE));
            }
        }
        familySetting$isEligibleForPostIdvFallback$1 = new FamilySetting$isEligibleForPostIdvFallback$1(this, continuationImpl);
        Object obj3 = familySetting$isEligibleForPostIdvFallback$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = familySetting$isEligibleForPostIdvFallback$1.label;
        if (i != 0) {
        }
        Set set2 = (Set) obj3;
        return Boolean.valueOf(!set2.contains(EligibleFeature.MONEY_FAMILIES_APPLET) && set2.contains(EligibleFeature.SPONSOR_ELIGIBLE));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object isFeatureEligible(ContinuationImpl continuationImpl) {
        ShoppingSetting$isFeatureEligible$1 shoppingSetting$isFeatureEligible$1;
        int i;
        if (continuationImpl instanceof ShoppingSetting$isFeatureEligible$1) {
            shoppingSetting$isFeatureEligible$1 = (ShoppingSetting$isFeatureEligible$1) continuationImpl;
            int i2 = shoppingSetting$isFeatureEligible$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                shoppingSetting$isFeatureEligible$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = shoppingSetting$isFeatureEligible$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = shoppingSetting$isFeatureEligible$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    ShoppingSetting$isFeatureEligible$$inlined$map$1 shoppingSetting$isFeatureEligible$$inlined$map$1 = new ShoppingSetting$isFeatureEligible$$inlined$map$1(this.featureEligibilityRepository.currentEligibleFeatures(), 0);
                    shoppingSetting$isFeatureEligible$1.label = 1;
                    obj = FlowKt.firstOrNull(shoppingSetting$isFeatureEligible$$inlined$map$1, shoppingSetting$isFeatureEligible$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Boolean.valueOf(Intrinsics.areEqual(obj, Boolean.TRUE));
            }
        }
        shoppingSetting$isFeatureEligible$1 = new ShoppingSetting$isFeatureEligible$1(this, continuationImpl);
        Object obj2 = shoppingSetting$isFeatureEligible$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = shoppingSetting$isFeatureEligible$1.label;
        if (i != 0) {
        }
        return Boolean.valueOf(Intrinsics.areEqual(obj2, Boolean.TRUE));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object isMoneyFamiliesAppletEligible(ContinuationImpl continuationImpl) {
        FamilySetting$isMoneyFamiliesAppletEligible$1 familySetting$isMoneyFamiliesAppletEligible$1;
        int i;
        if (continuationImpl instanceof FamilySetting$isMoneyFamiliesAppletEligible$1) {
            familySetting$isMoneyFamiliesAppletEligible$1 = (FamilySetting$isMoneyFamiliesAppletEligible$1) continuationImpl;
            int i2 = familySetting$isMoneyFamiliesAppletEligible$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                familySetting$isMoneyFamiliesAppletEligible$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = familySetting$isMoneyFamiliesAppletEligible$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = familySetting$isMoneyFamiliesAppletEligible$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    familySetting$isMoneyFamiliesAppletEligible$1.label = 1;
                    obj = currentEligibleFeatures(familySetting$isMoneyFamiliesAppletEligible$1);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Boolean.valueOf(((Set) obj).contains(EligibleFeature.MONEY_FAMILIES_APPLET));
            }
        }
        familySetting$isMoneyFamiliesAppletEligible$1 = new FamilySetting$isMoneyFamiliesAppletEligible$1(this, continuationImpl);
        Object obj3 = familySetting$isMoneyFamiliesAppletEligible$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = familySetting$isMoneyFamiliesAppletEligible$1.label;
        if (i != 0) {
        }
        return Boolean.valueOf(((Set) obj3).contains(EligibleFeature.MONEY_FAMILIES_APPLET));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object isNotSponsored(ContinuationImpl continuationImpl) {
        ShoppingSetting$isNotSponsored$1 shoppingSetting$isNotSponsored$1;
        int i;
        if (continuationImpl instanceof ShoppingSetting$isNotSponsored$1) {
            shoppingSetting$isNotSponsored$1 = (ShoppingSetting$isNotSponsored$1) continuationImpl;
            int i2 = shoppingSetting$isNotSponsored$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                shoppingSetting$isNotSponsored$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = shoppingSetting$isNotSponsored$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = shoppingSetting$isNotSponsored$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    DerivedStateFlow isSponsored = ((RealFamilyAccountsManager) this.familyAppletConfigProvider).isSponsored();
                    shoppingSetting$isNotSponsored$1.label = 1;
                    obj = FlowKt.firstOrNull(isSponsored, shoppingSetting$isNotSponsored$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Boolean.valueOf(Intrinsics.areEqual(obj, Boolean.FALSE));
            }
        }
        shoppingSetting$isNotSponsored$1 = new ShoppingSetting$isNotSponsored$1(this, continuationImpl);
        Object obj2 = shoppingSetting$isNotSponsored$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = shoppingSetting$isNotSponsored$1.label;
        if (i != 0) {
        }
        return Boolean.valueOf(Intrinsics.areEqual(obj2, Boolean.FALSE));
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0077, code lost:
    
        if ((kotlin.jvm.internal.Intrinsics.areEqual(r3, java.lang.Boolean.FALSE) ? com.squareup.cash.eligibility.backend.api.SettingVisibility.DISABLED : kotlin.jvm.internal.Intrinsics.areEqual(r3, java.lang.Boolean.TRUE) ? com.squareup.cash.eligibility.backend.api.SettingVisibility.VISIBLE : com.squareup.cash.eligibility.backend.api.SettingVisibility.HIDDEN) != com.squareup.cash.eligibility.backend.api.SettingVisibility.HIDDEN) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object isSettingsEligible(ContinuationImpl continuationImpl) {
        ShoppingSetting$isSettingsEligible$1 shoppingSetting$isSettingsEligible$1;
        int i;
        SettingsEligibilityManager$AccountSettingsResult settingsEligibilityManager$AccountSettingsResult;
        if (continuationImpl instanceof ShoppingSetting$isSettingsEligible$1) {
            shoppingSetting$isSettingsEligible$1 = (ShoppingSetting$isSettingsEligible$1) continuationImpl;
            int i2 = shoppingSetting$isSettingsEligible$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                shoppingSetting$isSettingsEligible$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = shoppingSetting$isSettingsEligible$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = shoppingSetting$isSettingsEligible$1.label;
                boolean z = true;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    shoppingSetting$isSettingsEligible$1.label = 1;
                    obj = this.settingsEligibilityManager.settings(shoppingSetting$isSettingsEligible$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                settingsEligibilityManager$AccountSettingsResult = (SettingsEligibilityManager$AccountSettingsResult) obj;
                if (!(settingsEligibilityManager$AccountSettingsResult instanceof SettingsEligibilityManager$AccountSettingsResult.SettingsError)) {
                    if (!(settingsEligibilityManager$AccountSettingsResult instanceof SettingsEligibilityManager$AccountSettingsResult.SettingsLoaded)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    GetAccountSettingsResponse.SettingCollection.Setting setting = (GetAccountSettingsResponse.SettingCollection.Setting) ((SettingsEligibilityManager$AccountSettingsResult.SettingsLoaded) settingsEligibilityManager$AccountSettingsResult).cache.shopping.cache.get(AccountSettingType$ShoppingSettings.ShoppingSubSetting.VIEW_SHOPPING);
                    Boolean bool = setting != null ? setting.editable : null;
                }
                z = false;
                return Boolean.valueOf(z);
            }
        }
        shoppingSetting$isSettingsEligible$1 = new ShoppingSetting$isSettingsEligible$1(this, continuationImpl);
        Object obj2 = shoppingSetting$isSettingsEligible$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = shoppingSetting$isSettingsEligible$1.label;
        boolean z2 = true;
        if (i != 0) {
        }
        settingsEligibilityManager$AccountSettingsResult = (SettingsEligibilityManager$AccountSettingsResult) obj2;
        if (!(settingsEligibilityManager$AccountSettingsResult instanceof SettingsEligibilityManager$AccountSettingsResult.SettingsError)) {
        }
        z2 = false;
        return Boolean.valueOf(z2);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object passesSettingsEligibility(ContinuationImpl continuationImpl) {
        FamilySetting$passesSettingsEligibility$1 familySetting$passesSettingsEligibility$1;
        int i;
        SettingsEligibilityManager$AccountSettingsResult settingsEligibilityManager$AccountSettingsResult;
        boolean containsKey;
        if (continuationImpl instanceof FamilySetting$passesSettingsEligibility$1) {
            familySetting$passesSettingsEligibility$1 = (FamilySetting$passesSettingsEligibility$1) continuationImpl;
            int i2 = familySetting$passesSettingsEligibility$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                familySetting$passesSettingsEligibility$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = familySetting$passesSettingsEligibility$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = familySetting$passesSettingsEligibility$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    familySetting$passesSettingsEligibility$1.label = 1;
                    obj = this.settingsEligibilityManager.settings(familySetting$passesSettingsEligibility$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                settingsEligibilityManager$AccountSettingsResult = (SettingsEligibilityManager$AccountSettingsResult) obj;
                if (!(settingsEligibilityManager$AccountSettingsResult instanceof SettingsEligibilityManager$AccountSettingsResult.SettingsError)) {
                    containsKey = false;
                } else {
                    if (!(settingsEligibilityManager$AccountSettingsResult instanceof SettingsEligibilityManager$AccountSettingsResult.SettingsLoaded)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    containsKey = ((SettingsEligibilityManager$AccountSettingsResult.SettingsLoaded) settingsEligibilityManager$AccountSettingsResult).cache.family.cache.containsKey(AccountSettingType$FamilySettings.FamilySubSetting.INVITE_TEEN);
                }
                return Boolean.valueOf(containsKey);
            }
        }
        familySetting$passesSettingsEligibility$1 = new FamilySetting$passesSettingsEligibility$1(this, continuationImpl);
        Object obj2 = familySetting$passesSettingsEligibility$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = familySetting$passesSettingsEligibility$1.label;
        if (i != 0) {
        }
        settingsEligibilityManager$AccountSettingsResult = (SettingsEligibilityManager$AccountSettingsResult) obj2;
        if (!(settingsEligibilityManager$AccountSettingsResult instanceof SettingsEligibilityManager$AccountSettingsResult.SettingsError)) {
        }
        return Boolean.valueOf(containsKey);
    }

    /* loaded from: classes.dex */
    public final class MetroFactory implements Factory {
        public final /* synthetic */ int $r8$classId;
        public final Provider bitcoinCapabilityProvider;
        public final Provider familyAppletConfigProvider;
        public final DoubleCheck featureEligibilityRepository;
        public final DoubleCheck settingsEligibilityManager;

        public MetroFactory(ArcadeModule$ProvideHapticVibratorMetroFactory arcadeModule$ProvideHapticVibratorMetroFactory, LocalViewFactory.MetroFactory metroFactory, DoubleCheck doubleCheck, DoubleCheck doubleCheck2) {
            this.$r8$classId = 0;
            this.bitcoinCapabilityProvider = arcadeModule$ProvideHapticVibratorMetroFactory;
            this.familyAppletConfigProvider = metroFactory;
            this.featureEligibilityRepository = doubleCheck;
            this.settingsEligibilityManager = doubleCheck2;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            int i = this.$r8$classId;
            DoubleCheck doubleCheck = this.settingsEligibilityManager;
            Provider provider = this.familyAppletConfigProvider;
            DoubleCheck doubleCheck2 = this.featureEligibilityRepository;
            Provider provider2 = this.bitcoinCapabilityProvider;
            switch (i) {
                case 0:
                    RealBitcoinCapabilityProvider realBitcoinCapabilityProvider = (RealBitcoinCapabilityProvider) provider2.invoke();
                    RealFamilyAppletConfigProvider realFamilyAppletConfigProvider = (RealFamilyAppletConfigProvider) provider.invoke();
                    RealFeatureEligibilityRepository realFeatureEligibilityRepository = (RealFeatureEligibilityRepository) doubleCheck2.getValue();
                    RealSettingsEligibilityManager realSettingsEligibilityManager = (RealSettingsEligibilityManager) doubleCheck.getValue();
                    realBitcoinCapabilityProvider.getClass();
                    realFamilyAppletConfigProvider.getClass();
                    realFeatureEligibilityRepository.getClass();
                    realSettingsEligibilityManager.getClass();
                    return new FamilySetting(realBitcoinCapabilityProvider, realFamilyAppletConfigProvider, realFeatureEligibilityRepository, realSettingsEligibilityManager);
                case 1:
                    RealBitcoinCapabilityProvider realBitcoinCapabilityProvider2 = (RealBitcoinCapabilityProvider) provider2.invoke();
                    FeatureFlagManager featureFlagManager = (FeatureFlagManager) doubleCheck2.getValue();
                    RealP2pSettingsManager realP2pSettingsManager = (RealP2pSettingsManager) provider.invoke();
                    RealSettingsEligibilityManager realSettingsEligibilityManager2 = (RealSettingsEligibilityManager) doubleCheck.getValue();
                    realBitcoinCapabilityProvider2.getClass();
                    featureFlagManager.getClass();
                    realP2pSettingsManager.getClass();
                    realSettingsEligibilityManager2.getClass();
                    return new BusinessInfoSetting(realBitcoinCapabilityProvider2, featureFlagManager, realP2pSettingsManager, realSettingsEligibilityManager2);
                default:
                    RealBitcoinCapabilityProvider realBitcoinCapabilityProvider3 = (RealBitcoinCapabilityProvider) provider2.invoke();
                    RealFeatureEligibilityRepository realFeatureEligibilityRepository2 = (RealFeatureEligibilityRepository) doubleCheck2.getValue();
                    RealFamilyAccountsManager realFamilyAccountsManager = (RealFamilyAccountsManager) provider.invoke();
                    RealSettingsEligibilityManager realSettingsEligibilityManager3 = (RealSettingsEligibilityManager) doubleCheck.getValue();
                    realBitcoinCapabilityProvider3.getClass();
                    realFeatureEligibilityRepository2.getClass();
                    realFamilyAccountsManager.getClass();
                    realSettingsEligibilityManager3.getClass();
                    return new FamilySetting(realBitcoinCapabilityProvider3, realFeatureEligibilityRepository2, realFamilyAccountsManager, realSettingsEligibilityManager3);
            }
        }

        public /* synthetic */ MetroFactory(ArcadeModule$ProvideHapticVibratorMetroFactory arcadeModule$ProvideHapticVibratorMetroFactory, DoubleCheck doubleCheck, Factory factory, DoubleCheck doubleCheck2, int i) {
            this.$r8$classId = i;
            this.bitcoinCapabilityProvider = arcadeModule$ProvideHapticVibratorMetroFactory;
            this.featureEligibilityRepository = doubleCheck;
            this.familyAppletConfigProvider = factory;
            this.settingsEligibilityManager = doubleCheck2;
        }
    }

    public FamilySetting(RealBitcoinCapabilityProvider realBitcoinCapabilityProvider, RealFamilyAppletConfigProvider realFamilyAppletConfigProvider, RealFeatureEligibilityRepository realFeatureEligibilityRepository, RealSettingsEligibilityManager realSettingsEligibilityManager) {
        this.bitcoinCapabilityProvider = realBitcoinCapabilityProvider;
        this.familyAppletConfigProvider = realFamilyAppletConfigProvider;
        this.featureEligibilityRepository = realFeatureEligibilityRepository;
        this.settingsEligibilityManager = realSettingsEligibilityManager;
    }
}
