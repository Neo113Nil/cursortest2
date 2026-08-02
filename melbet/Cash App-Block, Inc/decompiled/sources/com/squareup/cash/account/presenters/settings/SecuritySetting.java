package com.squareup.cash.account.presenters.settings;

import androidx.compose.runtime.GapComposer;
import app.cash.badging.api.BadgingState;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.account.settings.viewmodels.AccountSettingsRow;
import com.squareup.cash.bitcoin.capability.RealBitcoinCapabilityProvider;
import com.squareup.cash.eligibility.backend.api.AccountSettingType$PromotionsAndReferralsSettings;
import com.squareup.cash.eligibility.backend.api.AccountSettingType$SecuritySettings;
import com.squareup.cash.eligibility.backend.api.AccountSettingType$ThemeSettings;
import com.squareup.cash.eligibility.backend.api.SettingVisibility;
import com.squareup.cash.eligibility.backend.api.SettingsEligibilityManager$AccountSettingsResult;
import com.squareup.cash.eligibility.backend.real.RealSettingsEligibilityManager;
import com.squareup.protos.cash.janus.api.GetAccountSettingsResponse;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes5.dex */
public final class SecuritySetting extends AccountSettingsCapability {
    public final /* synthetic */ int $r8$classId;
    public final RealBitcoinCapabilityProvider bitcoinCapabilityProvider;
    public final RealSettingsEligibilityManager settingsEligibilityManager;

    public /* synthetic */ SecuritySetting(RealBitcoinCapabilityProvider realBitcoinCapabilityProvider, RealSettingsEligibilityManager realSettingsEligibilityManager, int i) {
        this.$r8$classId = i;
        this.bitcoinCapabilityProvider = realBitcoinCapabilityProvider;
        this.settingsEligibilityManager = realSettingsEligibilityManager;
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0120  */
    @Override // com.squareup.cash.bitcoin.capability.BTCxCapability
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object checkAdditionalIsAvailable(Continuation continuation) {
        SecuritySetting$checkAdditionalIsAvailable$1 securitySetting$checkAdditionalIsAvailable$1;
        int i;
        SettingsEligibilityManager$AccountSettingsResult settingsEligibilityManager$AccountSettingsResult;
        LinkedBanksSetting$checkAdditionalIsAvailable$1 linkedBanksSetting$checkAdditionalIsAvailable$1;
        int i2;
        SettingsEligibilityManager$AccountSettingsResult settingsEligibilityManager$AccountSettingsResult2;
        PromotionsReferralsSetting$checkAdditionalIsAvailable$1 promotionsReferralsSetting$checkAdditionalIsAvailable$1;
        int i3;
        SettingsEligibilityManager$AccountSettingsResult settingsEligibilityManager$AccountSettingsResult3;
        SettingVisibility settingVisibility;
        ThemeSwitcherSetting$checkAdditionalIsAvailable$1 themeSwitcherSetting$checkAdditionalIsAvailable$1;
        int i4;
        SettingsEligibilityManager$AccountSettingsResult settingsEligibilityManager$AccountSettingsResult4;
        TrustedDevicesSetting$checkAdditionalIsAvailable$1 trustedDevicesSetting$checkAdditionalIsAvailable$1;
        int i5;
        SettingsEligibilityManager$AccountSettingsResult settingsEligibilityManager$AccountSettingsResult5;
        int i6 = this.$r8$classId;
        boolean z = false;
        RealSettingsEligibilityManager realSettingsEligibilityManager = this.settingsEligibilityManager;
        switch (i6) {
            case 0:
                if (continuation instanceof SecuritySetting$checkAdditionalIsAvailable$1) {
                    securitySetting$checkAdditionalIsAvailable$1 = (SecuritySetting$checkAdditionalIsAvailable$1) continuation;
                    int i7 = securitySetting$checkAdditionalIsAvailable$1.label;
                    if ((i7 & PKIFailureInfo.systemUnavail) != 0) {
                        securitySetting$checkAdditionalIsAvailable$1.label = i7 - PKIFailureInfo.systemUnavail;
                        Object obj = securitySetting$checkAdditionalIsAvailable$1.result;
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i = securitySetting$checkAdditionalIsAvailable$1.label;
                        if (i != 0) {
                            SafeTrace.throwOnFailure(obj);
                            securitySetting$checkAdditionalIsAvailable$1.label = 1;
                            obj = realSettingsEligibilityManager.settings(securitySetting$checkAdditionalIsAvailable$1);
                            if (obj == coroutineSingletons) {
                                break;
                            }
                        } else if (i != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj);
                        }
                        settingsEligibilityManager$AccountSettingsResult = (SettingsEligibilityManager$AccountSettingsResult) obj;
                        if (!(settingsEligibilityManager$AccountSettingsResult instanceof SettingsEligibilityManager$AccountSettingsResult.SettingsError)) {
                            if (!(settingsEligibilityManager$AccountSettingsResult instanceof SettingsEligibilityManager$AccountSettingsResult.SettingsLoaded)) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                break;
                            } else {
                                z = !((SettingsEligibilityManager$AccountSettingsResult.SettingsLoaded) settingsEligibilityManager$AccountSettingsResult).cache.security.cache.isEmpty();
                            }
                        }
                        break;
                    }
                }
                securitySetting$checkAdditionalIsAvailable$1 = new SecuritySetting$checkAdditionalIsAvailable$1(this, (ContinuationImpl) continuation);
                Object obj2 = securitySetting$checkAdditionalIsAvailable$1.result;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = securitySetting$checkAdditionalIsAvailable$1.label;
                if (i != 0) {
                }
                settingsEligibilityManager$AccountSettingsResult = (SettingsEligibilityManager$AccountSettingsResult) obj2;
                if (!(settingsEligibilityManager$AccountSettingsResult instanceof SettingsEligibilityManager$AccountSettingsResult.SettingsError)) {
                }
            case 1:
                if (continuation instanceof LinkedBanksSetting$checkAdditionalIsAvailable$1) {
                    linkedBanksSetting$checkAdditionalIsAvailable$1 = (LinkedBanksSetting$checkAdditionalIsAvailable$1) continuation;
                    int i8 = linkedBanksSetting$checkAdditionalIsAvailable$1.label;
                    if ((i8 & PKIFailureInfo.systemUnavail) != 0) {
                        linkedBanksSetting$checkAdditionalIsAvailable$1.label = i8 - PKIFailureInfo.systemUnavail;
                        Object obj3 = linkedBanksSetting$checkAdditionalIsAvailable$1.result;
                        CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i2 = linkedBanksSetting$checkAdditionalIsAvailable$1.label;
                        if (i2 != 0) {
                            SafeTrace.throwOnFailure(obj3);
                            linkedBanksSetting$checkAdditionalIsAvailable$1.label = 1;
                            obj3 = realSettingsEligibilityManager.settings(linkedBanksSetting$checkAdditionalIsAvailable$1);
                            if (obj3 == coroutineSingletons3) {
                                break;
                            }
                        } else if (i2 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj3);
                        }
                        settingsEligibilityManager$AccountSettingsResult2 = (SettingsEligibilityManager$AccountSettingsResult) obj3;
                        if (!(settingsEligibilityManager$AccountSettingsResult2 instanceof SettingsEligibilityManager$AccountSettingsResult.SettingsError)) {
                            if (!(settingsEligibilityManager$AccountSettingsResult2 instanceof SettingsEligibilityManager$AccountSettingsResult.SettingsLoaded)) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                break;
                            } else if (((SettingsEligibilityManager$AccountSettingsResult.SettingsLoaded) settingsEligibilityManager$AccountSettingsResult2).cache.linkedBanks.getSettingState() != SettingVisibility.HIDDEN) {
                                z = true;
                            }
                        }
                        break;
                    }
                }
                linkedBanksSetting$checkAdditionalIsAvailable$1 = new LinkedBanksSetting$checkAdditionalIsAvailable$1(this, (ContinuationImpl) continuation);
                Object obj32 = linkedBanksSetting$checkAdditionalIsAvailable$1.result;
                CoroutineSingletons coroutineSingletons32 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = linkedBanksSetting$checkAdditionalIsAvailable$1.label;
                if (i2 != 0) {
                }
                settingsEligibilityManager$AccountSettingsResult2 = (SettingsEligibilityManager$AccountSettingsResult) obj32;
                if (!(settingsEligibilityManager$AccountSettingsResult2 instanceof SettingsEligibilityManager$AccountSettingsResult.SettingsError)) {
                }
            case 2:
                if (continuation instanceof PromotionsReferralsSetting$checkAdditionalIsAvailable$1) {
                    promotionsReferralsSetting$checkAdditionalIsAvailable$1 = (PromotionsReferralsSetting$checkAdditionalIsAvailable$1) continuation;
                    int i9 = promotionsReferralsSetting$checkAdditionalIsAvailable$1.label;
                    if ((i9 & PKIFailureInfo.systemUnavail) != 0) {
                        promotionsReferralsSetting$checkAdditionalIsAvailable$1.label = i9 - PKIFailureInfo.systemUnavail;
                        Object obj4 = promotionsReferralsSetting$checkAdditionalIsAvailable$1.result;
                        CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i3 = promotionsReferralsSetting$checkAdditionalIsAvailable$1.label;
                        if (i3 != 0) {
                            SafeTrace.throwOnFailure(obj4);
                            promotionsReferralsSetting$checkAdditionalIsAvailable$1.label = 1;
                            obj4 = realSettingsEligibilityManager.settings(promotionsReferralsSetting$checkAdditionalIsAvailable$1);
                            if (obj4 == coroutineSingletons4) {
                                break;
                            }
                        } else if (i3 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj4);
                        }
                        settingsEligibilityManager$AccountSettingsResult3 = (SettingsEligibilityManager$AccountSettingsResult) obj4;
                        if (!(settingsEligibilityManager$AccountSettingsResult3 instanceof SettingsEligibilityManager$AccountSettingsResult.SettingsError)) {
                            if (!(settingsEligibilityManager$AccountSettingsResult3 instanceof SettingsEligibilityManager$AccountSettingsResult.SettingsLoaded)) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                break;
                            } else {
                                Map map = ((SettingsEligibilityManager$AccountSettingsResult.SettingsLoaded) settingsEligibilityManager$AccountSettingsResult3).cache.promotionsAndReferrals.cache;
                                if (map.get(AccountSettingType$PromotionsAndReferralsSettings.PromotionsAndReferralsSubSetting.INVITE_FRIENDS) == null && map.get(AccountSettingType$PromotionsAndReferralsSettings.PromotionsAndReferralsSubSetting.ENTER_CODE) == null) {
                                    settingVisibility = SettingVisibility.HIDDEN;
                                } else {
                                    Collection values = map.values();
                                    if (!(values instanceof Collection) || !values.isEmpty()) {
                                        Iterator it = values.iterator();
                                        while (it.hasNext()) {
                                            if (!Intrinsics.areEqual(((GetAccountSettingsResponse.SettingCollection.Setting) it.next()).editable, Boolean.FALSE)) {
                                                settingVisibility = SettingVisibility.VISIBLE;
                                            }
                                        }
                                    }
                                    settingVisibility = SettingVisibility.DISABLED;
                                }
                                if (settingVisibility != SettingVisibility.HIDDEN) {
                                    z = true;
                                }
                            }
                        }
                        break;
                    }
                }
                promotionsReferralsSetting$checkAdditionalIsAvailable$1 = new PromotionsReferralsSetting$checkAdditionalIsAvailable$1(this, (ContinuationImpl) continuation);
                Object obj42 = promotionsReferralsSetting$checkAdditionalIsAvailable$1.result;
                CoroutineSingletons coroutineSingletons42 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i3 = promotionsReferralsSetting$checkAdditionalIsAvailable$1.label;
                if (i3 != 0) {
                }
                settingsEligibilityManager$AccountSettingsResult3 = (SettingsEligibilityManager$AccountSettingsResult) obj42;
                if (!(settingsEligibilityManager$AccountSettingsResult3 instanceof SettingsEligibilityManager$AccountSettingsResult.SettingsError)) {
                }
                break;
            case 3:
                if (continuation instanceof ThemeSwitcherSetting$checkAdditionalIsAvailable$1) {
                    themeSwitcherSetting$checkAdditionalIsAvailable$1 = (ThemeSwitcherSetting$checkAdditionalIsAvailable$1) continuation;
                    int i10 = themeSwitcherSetting$checkAdditionalIsAvailable$1.label;
                    if ((i10 & PKIFailureInfo.systemUnavail) != 0) {
                        themeSwitcherSetting$checkAdditionalIsAvailable$1.label = i10 - PKIFailureInfo.systemUnavail;
                        Object obj5 = themeSwitcherSetting$checkAdditionalIsAvailable$1.result;
                        CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i4 = themeSwitcherSetting$checkAdditionalIsAvailable$1.label;
                        if (i4 != 0) {
                            SafeTrace.throwOnFailure(obj5);
                            themeSwitcherSetting$checkAdditionalIsAvailable$1.label = 1;
                            obj5 = realSettingsEligibilityManager.settings(themeSwitcherSetting$checkAdditionalIsAvailable$1);
                            if (obj5 == coroutineSingletons5) {
                                break;
                            }
                        } else if (i4 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj5);
                        }
                        settingsEligibilityManager$AccountSettingsResult4 = (SettingsEligibilityManager$AccountSettingsResult) obj5;
                        if (!(settingsEligibilityManager$AccountSettingsResult4 instanceof SettingsEligibilityManager$AccountSettingsResult.SettingsError)) {
                            if (!(settingsEligibilityManager$AccountSettingsResult4 instanceof SettingsEligibilityManager$AccountSettingsResult.SettingsLoaded)) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                break;
                            } else {
                                GetAccountSettingsResponse.SettingCollection.Setting setting = (GetAccountSettingsResponse.SettingCollection.Setting) ((SettingsEligibilityManager$AccountSettingsResult.SettingsLoaded) settingsEligibilityManager$AccountSettingsResult4).cache.theme.cache.get(AccountSettingType$ThemeSettings.ThemeSubSetting.MANAGE_THEME);
                                Boolean bool = setting != null ? setting.editable : null;
                                if ((Intrinsics.areEqual(bool, Boolean.FALSE) ? SettingVisibility.DISABLED : Intrinsics.areEqual(bool, Boolean.TRUE) ? SettingVisibility.VISIBLE : SettingVisibility.HIDDEN) != SettingVisibility.HIDDEN) {
                                    z = true;
                                }
                            }
                        }
                        break;
                    }
                }
                themeSwitcherSetting$checkAdditionalIsAvailable$1 = new ThemeSwitcherSetting$checkAdditionalIsAvailable$1(this, (ContinuationImpl) continuation);
                Object obj52 = themeSwitcherSetting$checkAdditionalIsAvailable$1.result;
                CoroutineSingletons coroutineSingletons52 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i4 = themeSwitcherSetting$checkAdditionalIsAvailable$1.label;
                if (i4 != 0) {
                }
                settingsEligibilityManager$AccountSettingsResult4 = (SettingsEligibilityManager$AccountSettingsResult) obj52;
                if (!(settingsEligibilityManager$AccountSettingsResult4 instanceof SettingsEligibilityManager$AccountSettingsResult.SettingsError)) {
                }
            default:
                if (continuation instanceof TrustedDevicesSetting$checkAdditionalIsAvailable$1) {
                    trustedDevicesSetting$checkAdditionalIsAvailable$1 = (TrustedDevicesSetting$checkAdditionalIsAvailable$1) continuation;
                    int i11 = trustedDevicesSetting$checkAdditionalIsAvailable$1.label;
                    if ((i11 & PKIFailureInfo.systemUnavail) != 0) {
                        trustedDevicesSetting$checkAdditionalIsAvailable$1.label = i11 - PKIFailureInfo.systemUnavail;
                        Object obj6 = trustedDevicesSetting$checkAdditionalIsAvailable$1.result;
                        CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i5 = trustedDevicesSetting$checkAdditionalIsAvailable$1.label;
                        if (i5 != 0) {
                            SafeTrace.throwOnFailure(obj6);
                            trustedDevicesSetting$checkAdditionalIsAvailable$1.label = 1;
                            obj6 = realSettingsEligibilityManager.settings(trustedDevicesSetting$checkAdditionalIsAvailable$1);
                            if (obj6 == coroutineSingletons6) {
                                break;
                            }
                        } else if (i5 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj6);
                        }
                        settingsEligibilityManager$AccountSettingsResult5 = (SettingsEligibilityManager$AccountSettingsResult) obj6;
                        if (!(settingsEligibilityManager$AccountSettingsResult5 instanceof SettingsEligibilityManager$AccountSettingsResult.SettingsError)) {
                            if (!(settingsEligibilityManager$AccountSettingsResult5 instanceof SettingsEligibilityManager$AccountSettingsResult.SettingsLoaded)) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                break;
                            } else {
                                z = ((SettingsEligibilityManager$AccountSettingsResult.SettingsLoaded) settingsEligibilityManager$AccountSettingsResult5).cache.security.isSubSettingEnabled(AccountSettingType$SecuritySettings.SecuritySubSetting.SECURITY_DEVICES);
                            }
                        }
                        break;
                    }
                }
                trustedDevicesSetting$checkAdditionalIsAvailable$1 = new TrustedDevicesSetting$checkAdditionalIsAvailable$1(this, (ContinuationImpl) continuation);
                Object obj62 = trustedDevicesSetting$checkAdditionalIsAvailable$1.result;
                CoroutineSingletons coroutineSingletons62 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i5 = trustedDevicesSetting$checkAdditionalIsAvailable$1.label;
                if (i5 != 0) {
                }
                settingsEligibilityManager$AccountSettingsResult5 = (SettingsEligibilityManager$AccountSettingsResult) obj62;
                if (!(settingsEligibilityManager$AccountSettingsResult5 instanceof SettingsEligibilityManager$AccountSettingsResult.SettingsError)) {
                }
        }
        return null;
    }

    @Override // com.squareup.cash.bitcoin.capability.BTCxCapability
    public final RealBitcoinCapabilityProvider getBitcoinCapabilityProvider() {
        int i = this.$r8$classId;
        return this.bitcoinCapabilityProvider;
    }

    @Override // com.squareup.cash.account.presenters.settings.AccountSettingsCapability
    public final AccountSettingsRow getRow(BadgingState badgingState, GapComposer gapComposer) {
        switch (this.$r8$classId) {
            case 0:
                badgingState.getClass();
                gapComposer.startReplaceGroup(1096165764);
                AccountSettingsRow.Security security = new AccountSettingsRow.Security(badgingState.identityVerification > 0);
                gapComposer.end(false);
                return security;
            case 1:
                badgingState.getClass();
                gapComposer.startReplaceGroup(-308932618);
                AccountSettingsRow.LinkedBanks linkedBanks = new AccountSettingsRow.LinkedBanks(badgingState.linkedBanks > 0);
                gapComposer.end(false);
                return linkedBanks;
            case 2:
                badgingState.getClass();
                gapComposer.startReplaceGroup(1535313670);
                gapComposer.end(false);
                return AccountSettingsRow.PromotionsReferrals.INSTANCE;
            case 3:
                badgingState.getClass();
                gapComposer.startReplaceGroup(2090577678);
                gapComposer.end(false);
                return AccountSettingsRow.ThemeSwitcher.INSTANCE;
            default:
                badgingState.getClass();
                gapComposer.startReplaceGroup(1577524256);
                gapComposer.end(false);
                return AccountSettingsRow.TrustedDevices.INSTANCE;
        }
    }
}
