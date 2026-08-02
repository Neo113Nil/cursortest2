package com.squareup.cash.profile.presenters;

import androidx.compose.ui.text.android.CanvasCompatO;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.account.settings.viewmodels.AliasesSectionEvent;
import com.squareup.cash.account.settings.viewmodels.AllowedAccountsSectionViewEvent$TapViewAll;
import com.squareup.cash.account.settings.viewmodels.PersonalScreenViewEvent;
import com.squareup.cash.account.settings.viewmodels.PersonalizedAdsSectionViewEvent;
import com.squareup.cash.account.settings.viewmodels.ProfilePasscodeSectionViewEvent;
import com.squareup.cash.account.settings.viewmodels.ProfilePrivacyViewEvent;
import com.squareup.cash.account.settings.viewmodels.ProfileSecurityViewEvent;
import com.squareup.cash.account.settings.viewmodels.trustedcontact.TrustedContactSettingViewEvent;
import com.squareup.cash.appmessages.AppMessageViewEvent;
import com.squareup.cash.data.profile.PublicProfile;
import com.squareup.cash.data.profile.ReferralManager$RewardStatus;
import com.squareup.cash.history.payments.viewmodels.ProfilePaymentHistoryViewEvent$ViewAll;
import com.squareup.cash.investing.db.Investing_settings;
import com.squareup.cash.lifecycle.ActivityEvent;
import com.squareup.cash.payments.backend.api.P2pSettingsManager$P2pSettings;
import com.squareup.cash.profile.presenters.notifications.ChannelListPresenter$handleToggleClick$lambda$0$$inlined$map$1$2$1;
import com.squareup.cash.profile.presenters.notifications.ProfileNotificationsHelperKt;
import com.squareup.cash.profile.presenters.notifications.ProfileNotificationsPresenter$loadAccountSelectorAccounts$2$invokeSuspend$$inlined$map$1$2$1;
import com.squareup.cash.profile.presenters.notifications.ProfileNotificationsPresenter$models$lambda$13$$inlined$map$1$2$1;
import com.squareup.cash.profile.presenters.personal.AliasesSectionPresenter$Result;
import com.squareup.cash.profile.presenters.personal.AliasesSectionPresenter$models$1$1$invokeSuspend$$inlined$map$1$2$1;
import com.squareup.cash.profile.presenters.personal.ProfilePersonalPresenter$models$lambda$0$$inlined$filterIsInstance$1$2$1;
import com.squareup.cash.profile.presenters.personal.ProfilePersonalPresenter$models$lambda$0$$inlined$map$1$2$1;
import com.squareup.cash.profile.presenters.personal.ProfilePersonalPresenter$models$lambda$1$$inlined$filterIsInstance$1$2$1;
import com.squareup.cash.profile.presenters.personal.ProfilePersonalPresenter$models$lambda$1$$inlined$map$1$2$1;
import com.squareup.cash.profile.presenters.searchprivacy.RealSearchPrivacySettingsPresenter$models$lambda$0$$inlined$map$1$2$1;
import com.squareup.cash.profile.screens.ProfileScreens;
import com.squareup.cash.profile.screens.ReferralStatusPresentationArgs$RewardInfo;
import com.squareup.cash.profile.viewmodels.GenericProfileElementsViewEvent;
import com.squareup.cash.profile.viewmodels.ProfileViewEvent;
import com.squareup.cash.promotionsreferrals.presenters.PromotionsReferralsHomePresenter$invitePromotionFlow$$inlined$map$1$2$1;
import com.squareup.cash.qrcodes.presenters.CashQrScannerPresenter$special$$inlined$filter$1$2$1;
import com.squareup.cash.qrcodes.presenters.CashQrScannerPresenter$special$$inlined$filter$2$2$1;
import com.squareup.protos.cash.notificationsettings.clientsync.v1.UiCategoryNotificationPreference;
import com.squareup.protos.cash.notificationsettings.clientsync.v1.UiNotificationSettings;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowCollector;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes7.dex */
public final class ProfileSecurityPresenter$special$$inlined$map$1$2 implements FlowCollector {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ FlowCollector $this_unsafeFlow;

    /* renamed from: com.squareup.cash.profile.presenters.ProfileSecurityPresenter$special$$inlined$map$1$2$1, reason: invalid class name */
    public final class AnonymousClass1 extends ContinuationImpl {
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= PKIFailureInfo.systemUnavail;
            return ProfileSecurityPresenter$special$$inlined$map$1$2.this.emit(null, this);
        }
    }

    public /* synthetic */ ProfileSecurityPresenter$special$$inlined$map$1$2(FlowCollector flowCollector, int i) {
        this.$r8$classId = i;
        this.$this_unsafeFlow = flowCollector;
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x034d  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0357  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x038f  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0399  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x03da  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x03e4  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x0416  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x0420  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x0452  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x045c  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x048e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x0498  */
    /* JADX WARN: Removed duplicated region for block: B:357:0x04ca  */
    /* JADX WARN: Removed duplicated region for block: B:363:0x04d4  */
    /* JADX WARN: Removed duplicated region for block: B:375:0x0507  */
    /* JADX WARN: Removed duplicated region for block: B:381:0x0511  */
    /* JADX WARN: Removed duplicated region for block: B:393:0x0543  */
    /* JADX WARN: Removed duplicated region for block: B:399:0x054d  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:413:0x057f  */
    /* JADX WARN: Removed duplicated region for block: B:419:0x0589  */
    /* JADX WARN: Removed duplicated region for block: B:431:0x05bb  */
    /* JADX WARN: Removed duplicated region for block: B:437:0x05c5  */
    /* JADX WARN: Removed duplicated region for block: B:451:0x05f7  */
    /* JADX WARN: Removed duplicated region for block: B:457:0x0601  */
    /* JADX WARN: Removed duplicated region for block: B:469:0x0631  */
    /* JADX WARN: Removed duplicated region for block: B:475:0x063b  */
    /* JADX WARN: Removed duplicated region for block: B:487:0x066d  */
    /* JADX WARN: Removed duplicated region for block: B:493:0x0677  */
    /* JADX WARN: Removed duplicated region for block: B:507:0x06ae  */
    /* JADX WARN: Removed duplicated region for block: B:513:0x06b8  */
    /* JADX WARN: Removed duplicated region for block: B:525:0x06ea  */
    /* JADX WARN: Removed duplicated region for block: B:531:0x06f4  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:545:0x0726  */
    /* JADX WARN: Removed duplicated region for block: B:551:0x0730  */
    /* JADX WARN: Removed duplicated region for block: B:563:0x0762  */
    /* JADX WARN: Removed duplicated region for block: B:569:0x076c  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0139  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        AnonymousClass1 anonymousClass1;
        int i;
        ProfilePrivacyPresenter$models$lambda$7$$inlined$map$1$2$1 profilePrivacyPresenter$models$lambda$7$$inlined$map$1$2$1;
        int i2;
        ProfilePrivacyPresenter$models$lambda$9$$inlined$filterIsInstance$1$2$1 profilePrivacyPresenter$models$lambda$9$$inlined$filterIsInstance$1$2$1;
        int i3;
        ProfilePrivacyPresenter$models$lambda$9$$inlined$map$1$2$1 profilePrivacyPresenter$models$lambda$9$$inlined$map$1$2$1;
        int i4;
        ProfileSecurityPresenter$emitAnalyticsEvents$lambda$0$$inlined$filter$1$2$1 profileSecurityPresenter$emitAnalyticsEvents$lambda$0$$inlined$filter$1$2$1;
        int i5;
        ProfileSecurityPresenter$emitAnalyticsEvents$lambda$0$$inlined$map$1$2$1 profileSecurityPresenter$emitAnalyticsEvents$lambda$0$$inlined$map$1$2$1;
        int i6;
        ProfileSecurityPresenter$models$lambda$1$$inlined$map$1$2$1 profileSecurityPresenter$models$lambda$1$$inlined$map$1$2$1;
        int i7;
        ProfileSecurityPresenter$models$lambda$11$$inlined$filterIsInstance$1$2$1 profileSecurityPresenter$models$lambda$11$$inlined$filterIsInstance$1$2$1;
        int i8;
        ProfileSecurityPresenter$models$lambda$11$$inlined$map$1$2$1 profileSecurityPresenter$models$lambda$11$$inlined$map$1$2$1;
        int i9;
        ProfileSecurityPresenter$models$lambda$12$$inlined$filterIsInstance$1$2$1 profileSecurityPresenter$models$lambda$12$$inlined$filterIsInstance$1$2$1;
        int i10;
        ProfileSecurityPresenter$models$lambda$12$$inlined$map$1$2$1 profileSecurityPresenter$models$lambda$12$$inlined$map$1$2$1;
        int i11;
        ProfileSecurityPresenter$models$lambda$7$$inlined$map$1$2$1 profileSecurityPresenter$models$lambda$7$$inlined$map$1$2$1;
        int i12;
        RealGenericProfileElementsPresenter$models$lambda$10$$inlined$filterIsInstance$1$2$1 realGenericProfileElementsPresenter$models$lambda$10$$inlined$filterIsInstance$1$2$1;
        int i13;
        RealGenericProfileElementsPresenter$models$lambda$10$$inlined$map$1$2$1 realGenericProfileElementsPresenter$models$lambda$10$$inlined$map$1$2$1;
        int i14;
        RealProfilePreviewPresenter$models$lambda$10$$inlined$filterIsInstance$1$2$1 realProfilePreviewPresenter$models$lambda$10$$inlined$filterIsInstance$1$2$1;
        int i15;
        RealProfilePreviewPresenter$models$lambda$10$$inlined$map$1$2$1 realProfilePreviewPresenter$models$lambda$10$$inlined$map$1$2$1;
        int i16;
        ReferralStatusPresenterKt$asRewardInfo$$inlined$map$1$2$1 referralStatusPresenterKt$asRewardInfo$$inlined$map$1$2$1;
        int i17;
        UnsupportedSettingPresenter$models$lambda$0$$inlined$map$1$2$1 unsupportedSettingPresenter$models$lambda$0$$inlined$map$1$2$1;
        int i18;
        ChannelListPresenter$handleToggleClick$lambda$0$$inlined$map$1$2$1 channelListPresenter$handleToggleClick$lambda$0$$inlined$map$1$2$1;
        int i19;
        ProfileNotificationsPresenter$loadAccountSelectorAccounts$2$invokeSuspend$$inlined$map$1$2$1 profileNotificationsPresenter$loadAccountSelectorAccounts$2$invokeSuspend$$inlined$map$1$2$1;
        int i20;
        ProfileNotificationsPresenter$models$lambda$13$$inlined$map$1$2$1 profileNotificationsPresenter$models$lambda$13$$inlined$map$1$2$1;
        int i21;
        AliasesSectionPresenter$models$1$1$invokeSuspend$$inlined$map$1$2$1 aliasesSectionPresenter$models$1$1$invokeSuspend$$inlined$map$1$2$1;
        int i22;
        ProfilePersonalPresenter$models$lambda$0$$inlined$filterIsInstance$1$2$1 profilePersonalPresenter$models$lambda$0$$inlined$filterIsInstance$1$2$1;
        int i23;
        ProfilePersonalPresenter$models$lambda$0$$inlined$map$1$2$1 profilePersonalPresenter$models$lambda$0$$inlined$map$1$2$1;
        int i24;
        ProfilePersonalPresenter$models$lambda$1$$inlined$filterIsInstance$1$2$1 profilePersonalPresenter$models$lambda$1$$inlined$filterIsInstance$1$2$1;
        int i25;
        ProfilePersonalPresenter$models$lambda$1$$inlined$map$1$2$1 profilePersonalPresenter$models$lambda$1$$inlined$map$1$2$1;
        int i26;
        RealSearchPrivacySettingsPresenter$models$lambda$0$$inlined$map$1$2$1 realSearchPrivacySettingsPresenter$models$lambda$0$$inlined$map$1$2$1;
        int i27;
        PromotionsReferralsHomePresenter$invitePromotionFlow$$inlined$map$1$2$1 promotionsReferralsHomePresenter$invitePromotionFlow$$inlined$map$1$2$1;
        int i28;
        CashQrScannerPresenter$special$$inlined$filter$1$2$1 cashQrScannerPresenter$special$$inlined$filter$1$2$1;
        int i29;
        CashQrScannerPresenter$special$$inlined$filter$2$2$1 cashQrScannerPresenter$special$$inlined$filter$2$2$1;
        int i30;
        int i31 = this.$r8$classId;
        FlowCollector flowCollector = this.$this_unsafeFlow;
        switch (i31) {
            case 0:
                if (continuation instanceof AnonymousClass1) {
                    anonymousClass1 = (AnonymousClass1) continuation;
                    int i32 = anonymousClass1.label;
                    if ((i32 & PKIFailureInfo.systemUnavail) != 0) {
                        anonymousClass1.label = i32 - PKIFailureInfo.systemUnavail;
                        Object obj2 = anonymousClass1.result;
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i = anonymousClass1.label;
                        if (i != 0) {
                            SafeTrace.throwOnFailure(obj2);
                            Boolean valueOf = Boolean.valueOf(((Investing_settings) obj).trusted_contact_enabled);
                            anonymousClass1.label = 1;
                            if (flowCollector.emit(valueOf, anonymousClass1) == coroutineSingletons) {
                                break;
                            }
                        } else if (i != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj2);
                        }
                        break;
                    }
                }
                anonymousClass1 = new AnonymousClass1(continuation);
                Object obj22 = anonymousClass1.result;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = anonymousClass1.label;
                if (i != 0) {
                }
            case 1:
                if (continuation instanceof ProfilePrivacyPresenter$models$lambda$7$$inlined$map$1$2$1) {
                    profilePrivacyPresenter$models$lambda$7$$inlined$map$1$2$1 = (ProfilePrivacyPresenter$models$lambda$7$$inlined$map$1$2$1) continuation;
                    int i33 = profilePrivacyPresenter$models$lambda$7$$inlined$map$1$2$1.label;
                    if ((i33 & PKIFailureInfo.systemUnavail) != 0) {
                        profilePrivacyPresenter$models$lambda$7$$inlined$map$1$2$1.label = i33 - PKIFailureInfo.systemUnavail;
                        Object obj3 = profilePrivacyPresenter$models$lambda$7$$inlined$map$1$2$1.result;
                        CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i2 = profilePrivacyPresenter$models$lambda$7$$inlined$map$1$2$1.label;
                        if (i2 != 0) {
                            SafeTrace.throwOnFailure(obj3);
                            AllowedAccountsSectionViewEvent$TapViewAll allowedAccountsSectionViewEvent$TapViewAll = ((ProfilePrivacyViewEvent.AllowedAccountsEvent) obj).event;
                            profilePrivacyPresenter$models$lambda$7$$inlined$map$1$2$1.label = 1;
                            if (flowCollector.emit(allowedAccountsSectionViewEvent$TapViewAll, profilePrivacyPresenter$models$lambda$7$$inlined$map$1$2$1) == coroutineSingletons3) {
                                break;
                            }
                        } else if (i2 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj3);
                        }
                        break;
                    }
                }
                profilePrivacyPresenter$models$lambda$7$$inlined$map$1$2$1 = new ProfilePrivacyPresenter$models$lambda$7$$inlined$map$1$2$1(this, continuation);
                Object obj32 = profilePrivacyPresenter$models$lambda$7$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons32 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = profilePrivacyPresenter$models$lambda$7$$inlined$map$1$2$1.label;
                if (i2 != 0) {
                }
            case 2:
                if (continuation instanceof ProfilePrivacyPresenter$models$lambda$9$$inlined$filterIsInstance$1$2$1) {
                    profilePrivacyPresenter$models$lambda$9$$inlined$filterIsInstance$1$2$1 = (ProfilePrivacyPresenter$models$lambda$9$$inlined$filterIsInstance$1$2$1) continuation;
                    int i34 = profilePrivacyPresenter$models$lambda$9$$inlined$filterIsInstance$1$2$1.label;
                    if ((i34 & PKIFailureInfo.systemUnavail) != 0) {
                        profilePrivacyPresenter$models$lambda$9$$inlined$filterIsInstance$1$2$1.label = i34 - PKIFailureInfo.systemUnavail;
                        Object obj4 = profilePrivacyPresenter$models$lambda$9$$inlined$filterIsInstance$1$2$1.result;
                        CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i3 = profilePrivacyPresenter$models$lambda$9$$inlined$filterIsInstance$1$2$1.label;
                        if (i3 != 0) {
                            SafeTrace.throwOnFailure(obj4);
                            if (obj instanceof ProfilePrivacyViewEvent.PersonalizedAdsEvent) {
                                profilePrivacyPresenter$models$lambda$9$$inlined$filterIsInstance$1$2$1.label = 1;
                                if (flowCollector.emit(obj, profilePrivacyPresenter$models$lambda$9$$inlined$filterIsInstance$1$2$1) == coroutineSingletons4) {
                                    break;
                                }
                            }
                        } else if (i3 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj4);
                        }
                        break;
                    }
                }
                profilePrivacyPresenter$models$lambda$9$$inlined$filterIsInstance$1$2$1 = new ProfilePrivacyPresenter$models$lambda$9$$inlined$filterIsInstance$1$2$1(this, continuation);
                Object obj42 = profilePrivacyPresenter$models$lambda$9$$inlined$filterIsInstance$1$2$1.result;
                CoroutineSingletons coroutineSingletons42 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i3 = profilePrivacyPresenter$models$lambda$9$$inlined$filterIsInstance$1$2$1.label;
                if (i3 != 0) {
                }
            case 3:
                if (continuation instanceof ProfilePrivacyPresenter$models$lambda$9$$inlined$map$1$2$1) {
                    profilePrivacyPresenter$models$lambda$9$$inlined$map$1$2$1 = (ProfilePrivacyPresenter$models$lambda$9$$inlined$map$1$2$1) continuation;
                    int i35 = profilePrivacyPresenter$models$lambda$9$$inlined$map$1$2$1.label;
                    if ((i35 & PKIFailureInfo.systemUnavail) != 0) {
                        profilePrivacyPresenter$models$lambda$9$$inlined$map$1$2$1.label = i35 - PKIFailureInfo.systemUnavail;
                        Object obj5 = profilePrivacyPresenter$models$lambda$9$$inlined$map$1$2$1.result;
                        CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i4 = profilePrivacyPresenter$models$lambda$9$$inlined$map$1$2$1.label;
                        if (i4 != 0) {
                            SafeTrace.throwOnFailure(obj5);
                            PersonalizedAdsSectionViewEvent personalizedAdsSectionViewEvent = ((ProfilePrivacyViewEvent.PersonalizedAdsEvent) obj).event;
                            profilePrivacyPresenter$models$lambda$9$$inlined$map$1$2$1.label = 1;
                            if (flowCollector.emit(personalizedAdsSectionViewEvent, profilePrivacyPresenter$models$lambda$9$$inlined$map$1$2$1) == coroutineSingletons5) {
                                break;
                            }
                        } else if (i4 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj5);
                        }
                        break;
                    }
                }
                profilePrivacyPresenter$models$lambda$9$$inlined$map$1$2$1 = new ProfilePrivacyPresenter$models$lambda$9$$inlined$map$1$2$1(this, continuation);
                Object obj52 = profilePrivacyPresenter$models$lambda$9$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons52 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i4 = profilePrivacyPresenter$models$lambda$9$$inlined$map$1$2$1.label;
                if (i4 != 0) {
                }
            case 4:
                if (continuation instanceof ProfileSecurityPresenter$emitAnalyticsEvents$lambda$0$$inlined$filter$1$2$1) {
                    profileSecurityPresenter$emitAnalyticsEvents$lambda$0$$inlined$filter$1$2$1 = (ProfileSecurityPresenter$emitAnalyticsEvents$lambda$0$$inlined$filter$1$2$1) continuation;
                    int i36 = profileSecurityPresenter$emitAnalyticsEvents$lambda$0$$inlined$filter$1$2$1.label;
                    if ((i36 & PKIFailureInfo.systemUnavail) != 0) {
                        profileSecurityPresenter$emitAnalyticsEvents$lambda$0$$inlined$filter$1$2$1.label = i36 - PKIFailureInfo.systemUnavail;
                        Object obj6 = profileSecurityPresenter$emitAnalyticsEvents$lambda$0$$inlined$filter$1$2$1.result;
                        CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i5 = profileSecurityPresenter$emitAnalyticsEvents$lambda$0$$inlined$filter$1$2$1.label;
                        if (i5 != 0) {
                            SafeTrace.throwOnFailure(obj6);
                            if (((Boolean) obj).booleanValue()) {
                                profileSecurityPresenter$emitAnalyticsEvents$lambda$0$$inlined$filter$1$2$1.label = 1;
                                if (flowCollector.emit(obj, profileSecurityPresenter$emitAnalyticsEvents$lambda$0$$inlined$filter$1$2$1) == coroutineSingletons6) {
                                    break;
                                }
                            }
                        } else if (i5 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj6);
                        }
                        break;
                    }
                }
                profileSecurityPresenter$emitAnalyticsEvents$lambda$0$$inlined$filter$1$2$1 = new ProfileSecurityPresenter$emitAnalyticsEvents$lambda$0$$inlined$filter$1$2$1(this, continuation);
                Object obj62 = profileSecurityPresenter$emitAnalyticsEvents$lambda$0$$inlined$filter$1$2$1.result;
                CoroutineSingletons coroutineSingletons62 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i5 = profileSecurityPresenter$emitAnalyticsEvents$lambda$0$$inlined$filter$1$2$1.label;
                if (i5 != 0) {
                }
            case 5:
                if (continuation instanceof ProfileSecurityPresenter$emitAnalyticsEvents$lambda$0$$inlined$map$1$2$1) {
                    profileSecurityPresenter$emitAnalyticsEvents$lambda$0$$inlined$map$1$2$1 = (ProfileSecurityPresenter$emitAnalyticsEvents$lambda$0$$inlined$map$1$2$1) continuation;
                    int i37 = profileSecurityPresenter$emitAnalyticsEvents$lambda$0$$inlined$map$1$2$1.label;
                    if ((i37 & PKIFailureInfo.systemUnavail) != 0) {
                        profileSecurityPresenter$emitAnalyticsEvents$lambda$0$$inlined$map$1$2$1.label = i37 - PKIFailureInfo.systemUnavail;
                        Object obj7 = profileSecurityPresenter$emitAnalyticsEvents$lambda$0$$inlined$map$1$2$1.result;
                        CoroutineSingletons coroutineSingletons7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i6 = profileSecurityPresenter$emitAnalyticsEvents$lambda$0$$inlined$map$1$2$1.label;
                        if (i6 != 0) {
                            SafeTrace.throwOnFailure(obj7);
                            Boolean bool = Boolean.FALSE;
                            profileSecurityPresenter$emitAnalyticsEvents$lambda$0$$inlined$map$1$2$1.label = 1;
                            if (flowCollector.emit(bool, profileSecurityPresenter$emitAnalyticsEvents$lambda$0$$inlined$map$1$2$1) == coroutineSingletons7) {
                                break;
                            }
                        } else if (i6 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj7);
                        }
                        break;
                    }
                }
                profileSecurityPresenter$emitAnalyticsEvents$lambda$0$$inlined$map$1$2$1 = new ProfileSecurityPresenter$emitAnalyticsEvents$lambda$0$$inlined$map$1$2$1(this, continuation);
                Object obj72 = profileSecurityPresenter$emitAnalyticsEvents$lambda$0$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons72 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i6 = profileSecurityPresenter$emitAnalyticsEvents$lambda$0$$inlined$map$1$2$1.label;
                if (i6 != 0) {
                }
            case 6:
                if (continuation instanceof ProfileSecurityPresenter$models$lambda$1$$inlined$map$1$2$1) {
                    profileSecurityPresenter$models$lambda$1$$inlined$map$1$2$1 = (ProfileSecurityPresenter$models$lambda$1$$inlined$map$1$2$1) continuation;
                    int i38 = profileSecurityPresenter$models$lambda$1$$inlined$map$1$2$1.label;
                    if ((i38 & PKIFailureInfo.systemUnavail) != 0) {
                        profileSecurityPresenter$models$lambda$1$$inlined$map$1$2$1.label = i38 - PKIFailureInfo.systemUnavail;
                        Object obj8 = profileSecurityPresenter$models$lambda$1$$inlined$map$1$2$1.result;
                        CoroutineSingletons coroutineSingletons8 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i7 = profileSecurityPresenter$models$lambda$1$$inlined$map$1$2$1.label;
                        if (i7 != 0) {
                            SafeTrace.throwOnFailure(obj8);
                            profileSecurityPresenter$models$lambda$1$$inlined$map$1$2$1.label = 1;
                            if (flowCollector.emit((PublicProfile) obj, profileSecurityPresenter$models$lambda$1$$inlined$map$1$2$1) == coroutineSingletons8) {
                                break;
                            }
                        } else if (i7 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj8);
                        }
                        break;
                    }
                }
                profileSecurityPresenter$models$lambda$1$$inlined$map$1$2$1 = new ProfileSecurityPresenter$models$lambda$1$$inlined$map$1$2$1(this, continuation);
                Object obj82 = profileSecurityPresenter$models$lambda$1$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons82 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i7 = profileSecurityPresenter$models$lambda$1$$inlined$map$1$2$1.label;
                if (i7 != 0) {
                }
            case 7:
                if (continuation instanceof ProfileSecurityPresenter$models$lambda$11$$inlined$filterIsInstance$1$2$1) {
                    profileSecurityPresenter$models$lambda$11$$inlined$filterIsInstance$1$2$1 = (ProfileSecurityPresenter$models$lambda$11$$inlined$filterIsInstance$1$2$1) continuation;
                    int i39 = profileSecurityPresenter$models$lambda$11$$inlined$filterIsInstance$1$2$1.label;
                    if ((i39 & PKIFailureInfo.systemUnavail) != 0) {
                        profileSecurityPresenter$models$lambda$11$$inlined$filterIsInstance$1$2$1.label = i39 - PKIFailureInfo.systemUnavail;
                        Object obj9 = profileSecurityPresenter$models$lambda$11$$inlined$filterIsInstance$1$2$1.result;
                        CoroutineSingletons coroutineSingletons9 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i8 = profileSecurityPresenter$models$lambda$11$$inlined$filterIsInstance$1$2$1.label;
                        if (i8 != 0) {
                            SafeTrace.throwOnFailure(obj9);
                            if (obj instanceof ProfileSecurityViewEvent.PasscodeEventWrapper) {
                                profileSecurityPresenter$models$lambda$11$$inlined$filterIsInstance$1$2$1.label = 1;
                                if (flowCollector.emit(obj, profileSecurityPresenter$models$lambda$11$$inlined$filterIsInstance$1$2$1) == coroutineSingletons9) {
                                    break;
                                }
                            }
                        } else if (i8 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj9);
                        }
                        break;
                    }
                }
                profileSecurityPresenter$models$lambda$11$$inlined$filterIsInstance$1$2$1 = new ProfileSecurityPresenter$models$lambda$11$$inlined$filterIsInstance$1$2$1(this, continuation);
                Object obj92 = profileSecurityPresenter$models$lambda$11$$inlined$filterIsInstance$1$2$1.result;
                CoroutineSingletons coroutineSingletons92 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i8 = profileSecurityPresenter$models$lambda$11$$inlined$filterIsInstance$1$2$1.label;
                if (i8 != 0) {
                }
            case 8:
                if (continuation instanceof ProfileSecurityPresenter$models$lambda$11$$inlined$map$1$2$1) {
                    profileSecurityPresenter$models$lambda$11$$inlined$map$1$2$1 = (ProfileSecurityPresenter$models$lambda$11$$inlined$map$1$2$1) continuation;
                    int i40 = profileSecurityPresenter$models$lambda$11$$inlined$map$1$2$1.label;
                    if ((i40 & PKIFailureInfo.systemUnavail) != 0) {
                        profileSecurityPresenter$models$lambda$11$$inlined$map$1$2$1.label = i40 - PKIFailureInfo.systemUnavail;
                        Object obj10 = profileSecurityPresenter$models$lambda$11$$inlined$map$1$2$1.result;
                        CoroutineSingletons coroutineSingletons10 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i9 = profileSecurityPresenter$models$lambda$11$$inlined$map$1$2$1.label;
                        if (i9 != 0) {
                            SafeTrace.throwOnFailure(obj10);
                            ProfilePasscodeSectionViewEvent profilePasscodeSectionViewEvent = ((ProfileSecurityViewEvent.PasscodeEventWrapper) obj).event;
                            profileSecurityPresenter$models$lambda$11$$inlined$map$1$2$1.label = 1;
                            if (flowCollector.emit(profilePasscodeSectionViewEvent, profileSecurityPresenter$models$lambda$11$$inlined$map$1$2$1) == coroutineSingletons10) {
                                break;
                            }
                        } else if (i9 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj10);
                        }
                        break;
                    }
                }
                profileSecurityPresenter$models$lambda$11$$inlined$map$1$2$1 = new ProfileSecurityPresenter$models$lambda$11$$inlined$map$1$2$1(this, continuation);
                Object obj102 = profileSecurityPresenter$models$lambda$11$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons102 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i9 = profileSecurityPresenter$models$lambda$11$$inlined$map$1$2$1.label;
                if (i9 != 0) {
                }
            case 9:
                if (continuation instanceof ProfileSecurityPresenter$models$lambda$12$$inlined$filterIsInstance$1$2$1) {
                    profileSecurityPresenter$models$lambda$12$$inlined$filterIsInstance$1$2$1 = (ProfileSecurityPresenter$models$lambda$12$$inlined$filterIsInstance$1$2$1) continuation;
                    int i41 = profileSecurityPresenter$models$lambda$12$$inlined$filterIsInstance$1$2$1.label;
                    if ((i41 & PKIFailureInfo.systemUnavail) != 0) {
                        profileSecurityPresenter$models$lambda$12$$inlined$filterIsInstance$1$2$1.label = i41 - PKIFailureInfo.systemUnavail;
                        Object obj11 = profileSecurityPresenter$models$lambda$12$$inlined$filterIsInstance$1$2$1.result;
                        CoroutineSingletons coroutineSingletons11 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i10 = profileSecurityPresenter$models$lambda$12$$inlined$filterIsInstance$1$2$1.label;
                        if (i10 != 0) {
                            SafeTrace.throwOnFailure(obj11);
                            if (obj instanceof ProfileSecurityViewEvent.TrustedContactViewEventWrapper) {
                                profileSecurityPresenter$models$lambda$12$$inlined$filterIsInstance$1$2$1.label = 1;
                                if (flowCollector.emit(obj, profileSecurityPresenter$models$lambda$12$$inlined$filterIsInstance$1$2$1) == coroutineSingletons11) {
                                    break;
                                }
                            }
                        } else if (i10 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj11);
                        }
                        break;
                    }
                }
                profileSecurityPresenter$models$lambda$12$$inlined$filterIsInstance$1$2$1 = new ProfileSecurityPresenter$models$lambda$12$$inlined$filterIsInstance$1$2$1(this, continuation);
                Object obj112 = profileSecurityPresenter$models$lambda$12$$inlined$filterIsInstance$1$2$1.result;
                CoroutineSingletons coroutineSingletons112 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i10 = profileSecurityPresenter$models$lambda$12$$inlined$filterIsInstance$1$2$1.label;
                if (i10 != 0) {
                }
            case 10:
                if (continuation instanceof ProfileSecurityPresenter$models$lambda$12$$inlined$map$1$2$1) {
                    profileSecurityPresenter$models$lambda$12$$inlined$map$1$2$1 = (ProfileSecurityPresenter$models$lambda$12$$inlined$map$1$2$1) continuation;
                    int i42 = profileSecurityPresenter$models$lambda$12$$inlined$map$1$2$1.label;
                    if ((i42 & PKIFailureInfo.systemUnavail) != 0) {
                        profileSecurityPresenter$models$lambda$12$$inlined$map$1$2$1.label = i42 - PKIFailureInfo.systemUnavail;
                        Object obj12 = profileSecurityPresenter$models$lambda$12$$inlined$map$1$2$1.result;
                        CoroutineSingletons coroutineSingletons12 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i11 = profileSecurityPresenter$models$lambda$12$$inlined$map$1$2$1.label;
                        if (i11 != 0) {
                            SafeTrace.throwOnFailure(obj12);
                            TrustedContactSettingViewEvent trustedContactSettingViewEvent = ((ProfileSecurityViewEvent.TrustedContactViewEventWrapper) obj).event;
                            profileSecurityPresenter$models$lambda$12$$inlined$map$1$2$1.label = 1;
                            if (flowCollector.emit(trustedContactSettingViewEvent, profileSecurityPresenter$models$lambda$12$$inlined$map$1$2$1) == coroutineSingletons12) {
                                break;
                            }
                        } else if (i11 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj12);
                        }
                        break;
                    }
                }
                profileSecurityPresenter$models$lambda$12$$inlined$map$1$2$1 = new ProfileSecurityPresenter$models$lambda$12$$inlined$map$1$2$1(this, continuation);
                Object obj122 = profileSecurityPresenter$models$lambda$12$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons122 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i11 = profileSecurityPresenter$models$lambda$12$$inlined$map$1$2$1.label;
                if (i11 != 0) {
                }
            case 11:
                if (continuation instanceof ProfileSecurityPresenter$models$lambda$7$$inlined$map$1$2$1) {
                    profileSecurityPresenter$models$lambda$7$$inlined$map$1$2$1 = (ProfileSecurityPresenter$models$lambda$7$$inlined$map$1$2$1) continuation;
                    int i43 = profileSecurityPresenter$models$lambda$7$$inlined$map$1$2$1.label;
                    if ((i43 & PKIFailureInfo.systemUnavail) != 0) {
                        profileSecurityPresenter$models$lambda$7$$inlined$map$1$2$1.label = i43 - PKIFailureInfo.systemUnavail;
                        Object obj13 = profileSecurityPresenter$models$lambda$7$$inlined$map$1$2$1.result;
                        CoroutineSingletons coroutineSingletons13 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i12 = profileSecurityPresenter$models$lambda$7$$inlined$map$1$2$1.label;
                        if (i12 != 0) {
                            SafeTrace.throwOnFailure(obj13);
                            Boolean bool2 = (Boolean) obj;
                            bool2.getClass();
                            profileSecurityPresenter$models$lambda$7$$inlined$map$1$2$1.label = 1;
                            if (flowCollector.emit(bool2, profileSecurityPresenter$models$lambda$7$$inlined$map$1$2$1) == coroutineSingletons13) {
                                break;
                            }
                        } else if (i12 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj13);
                        }
                        break;
                    }
                }
                profileSecurityPresenter$models$lambda$7$$inlined$map$1$2$1 = new ProfileSecurityPresenter$models$lambda$7$$inlined$map$1$2$1(this, continuation);
                Object obj132 = profileSecurityPresenter$models$lambda$7$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons132 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i12 = profileSecurityPresenter$models$lambda$7$$inlined$map$1$2$1.label;
                if (i12 != 0) {
                }
            case 12:
                if (continuation instanceof RealGenericProfileElementsPresenter$models$lambda$10$$inlined$filterIsInstance$1$2$1) {
                    realGenericProfileElementsPresenter$models$lambda$10$$inlined$filterIsInstance$1$2$1 = (RealGenericProfileElementsPresenter$models$lambda$10$$inlined$filterIsInstance$1$2$1) continuation;
                    int i44 = realGenericProfileElementsPresenter$models$lambda$10$$inlined$filterIsInstance$1$2$1.label;
                    if ((i44 & PKIFailureInfo.systemUnavail) != 0) {
                        realGenericProfileElementsPresenter$models$lambda$10$$inlined$filterIsInstance$1$2$1.label = i44 - PKIFailureInfo.systemUnavail;
                        Object obj14 = realGenericProfileElementsPresenter$models$lambda$10$$inlined$filterIsInstance$1$2$1.result;
                        CoroutineSingletons coroutineSingletons14 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i13 = realGenericProfileElementsPresenter$models$lambda$10$$inlined$filterIsInstance$1$2$1.label;
                        if (i13 != 0) {
                            SafeTrace.throwOnFailure(obj14);
                            if (obj instanceof GenericProfileElementsViewEvent.PaymentHistoryViewEvent) {
                                realGenericProfileElementsPresenter$models$lambda$10$$inlined$filterIsInstance$1$2$1.label = 1;
                                if (flowCollector.emit(obj, realGenericProfileElementsPresenter$models$lambda$10$$inlined$filterIsInstance$1$2$1) == coroutineSingletons14) {
                                    break;
                                }
                            }
                        } else if (i13 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj14);
                        }
                        break;
                    }
                }
                realGenericProfileElementsPresenter$models$lambda$10$$inlined$filterIsInstance$1$2$1 = new RealGenericProfileElementsPresenter$models$lambda$10$$inlined$filterIsInstance$1$2$1(this, continuation);
                Object obj142 = realGenericProfileElementsPresenter$models$lambda$10$$inlined$filterIsInstance$1$2$1.result;
                CoroutineSingletons coroutineSingletons142 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i13 = realGenericProfileElementsPresenter$models$lambda$10$$inlined$filterIsInstance$1$2$1.label;
                if (i13 != 0) {
                }
            case 13:
                if (continuation instanceof RealGenericProfileElementsPresenter$models$lambda$10$$inlined$map$1$2$1) {
                    realGenericProfileElementsPresenter$models$lambda$10$$inlined$map$1$2$1 = (RealGenericProfileElementsPresenter$models$lambda$10$$inlined$map$1$2$1) continuation;
                    int i45 = realGenericProfileElementsPresenter$models$lambda$10$$inlined$map$1$2$1.label;
                    if ((i45 & PKIFailureInfo.systemUnavail) != 0) {
                        realGenericProfileElementsPresenter$models$lambda$10$$inlined$map$1$2$1.label = i45 - PKIFailureInfo.systemUnavail;
                        Object obj15 = realGenericProfileElementsPresenter$models$lambda$10$$inlined$map$1$2$1.result;
                        CoroutineSingletons coroutineSingletons15 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i14 = realGenericProfileElementsPresenter$models$lambda$10$$inlined$map$1$2$1.label;
                        if (i14 != 0) {
                            SafeTrace.throwOnFailure(obj15);
                            ProfilePaymentHistoryViewEvent$ViewAll profilePaymentHistoryViewEvent$ViewAll = ((GenericProfileElementsViewEvent.PaymentHistoryViewEvent) obj).event;
                            realGenericProfileElementsPresenter$models$lambda$10$$inlined$map$1$2$1.label = 1;
                            if (flowCollector.emit(profilePaymentHistoryViewEvent$ViewAll, realGenericProfileElementsPresenter$models$lambda$10$$inlined$map$1$2$1) == coroutineSingletons15) {
                                break;
                            }
                        } else if (i14 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj15);
                        }
                        break;
                    }
                }
                realGenericProfileElementsPresenter$models$lambda$10$$inlined$map$1$2$1 = new RealGenericProfileElementsPresenter$models$lambda$10$$inlined$map$1$2$1(this, continuation);
                Object obj152 = realGenericProfileElementsPresenter$models$lambda$10$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons152 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i14 = realGenericProfileElementsPresenter$models$lambda$10$$inlined$map$1$2$1.label;
                if (i14 != 0) {
                }
            case 14:
                if (continuation instanceof RealProfilePreviewPresenter$models$lambda$10$$inlined$filterIsInstance$1$2$1) {
                    realProfilePreviewPresenter$models$lambda$10$$inlined$filterIsInstance$1$2$1 = (RealProfilePreviewPresenter$models$lambda$10$$inlined$filterIsInstance$1$2$1) continuation;
                    int i46 = realProfilePreviewPresenter$models$lambda$10$$inlined$filterIsInstance$1$2$1.label;
                    if ((i46 & PKIFailureInfo.systemUnavail) != 0) {
                        realProfilePreviewPresenter$models$lambda$10$$inlined$filterIsInstance$1$2$1.label = i46 - PKIFailureInfo.systemUnavail;
                        Object obj16 = realProfilePreviewPresenter$models$lambda$10$$inlined$filterIsInstance$1$2$1.result;
                        CoroutineSingletons coroutineSingletons16 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i15 = realProfilePreviewPresenter$models$lambda$10$$inlined$filterIsInstance$1$2$1.label;
                        if (i15 != 0) {
                            SafeTrace.throwOnFailure(obj16);
                            if (obj instanceof ProfileViewEvent.GenericProfileElementsViewEventWrapper) {
                                realProfilePreviewPresenter$models$lambda$10$$inlined$filterIsInstance$1$2$1.label = 1;
                                if (flowCollector.emit(obj, realProfilePreviewPresenter$models$lambda$10$$inlined$filterIsInstance$1$2$1) == coroutineSingletons16) {
                                    break;
                                }
                            }
                        } else if (i15 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj16);
                        }
                        break;
                    }
                }
                realProfilePreviewPresenter$models$lambda$10$$inlined$filterIsInstance$1$2$1 = new RealProfilePreviewPresenter$models$lambda$10$$inlined$filterIsInstance$1$2$1(this, continuation);
                Object obj162 = realProfilePreviewPresenter$models$lambda$10$$inlined$filterIsInstance$1$2$1.result;
                CoroutineSingletons coroutineSingletons162 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i15 = realProfilePreviewPresenter$models$lambda$10$$inlined$filterIsInstance$1$2$1.label;
                if (i15 != 0) {
                }
            case 15:
                if (continuation instanceof RealProfilePreviewPresenter$models$lambda$10$$inlined$map$1$2$1) {
                    realProfilePreviewPresenter$models$lambda$10$$inlined$map$1$2$1 = (RealProfilePreviewPresenter$models$lambda$10$$inlined$map$1$2$1) continuation;
                    int i47 = realProfilePreviewPresenter$models$lambda$10$$inlined$map$1$2$1.label;
                    if ((i47 & PKIFailureInfo.systemUnavail) != 0) {
                        realProfilePreviewPresenter$models$lambda$10$$inlined$map$1$2$1.label = i47 - PKIFailureInfo.systemUnavail;
                        Object obj17 = realProfilePreviewPresenter$models$lambda$10$$inlined$map$1$2$1.result;
                        CoroutineSingletons coroutineSingletons17 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i16 = realProfilePreviewPresenter$models$lambda$10$$inlined$map$1$2$1.label;
                        if (i16 != 0) {
                            SafeTrace.throwOnFailure(obj17);
                            GenericProfileElementsViewEvent genericProfileElementsViewEvent = ((ProfileViewEvent.GenericProfileElementsViewEventWrapper) obj).event;
                            realProfilePreviewPresenter$models$lambda$10$$inlined$map$1$2$1.label = 1;
                            if (flowCollector.emit(genericProfileElementsViewEvent, realProfilePreviewPresenter$models$lambda$10$$inlined$map$1$2$1) == coroutineSingletons17) {
                                break;
                            }
                        } else if (i16 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj17);
                        }
                        break;
                    }
                }
                realProfilePreviewPresenter$models$lambda$10$$inlined$map$1$2$1 = new RealProfilePreviewPresenter$models$lambda$10$$inlined$map$1$2$1(this, continuation);
                Object obj172 = realProfilePreviewPresenter$models$lambda$10$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons172 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i16 = realProfilePreviewPresenter$models$lambda$10$$inlined$map$1$2$1.label;
                if (i16 != 0) {
                }
            case 16:
                if (continuation instanceof ReferralStatusPresenterKt$asRewardInfo$$inlined$map$1$2$1) {
                    referralStatusPresenterKt$asRewardInfo$$inlined$map$1$2$1 = (ReferralStatusPresenterKt$asRewardInfo$$inlined$map$1$2$1) continuation;
                    int i48 = referralStatusPresenterKt$asRewardInfo$$inlined$map$1$2$1.label;
                    if ((i48 & PKIFailureInfo.systemUnavail) != 0) {
                        referralStatusPresenterKt$asRewardInfo$$inlined$map$1$2$1.label = i48 - PKIFailureInfo.systemUnavail;
                        Object obj18 = referralStatusPresenterKt$asRewardInfo$$inlined$map$1$2$1.result;
                        CoroutineSingletons coroutineSingletons18 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i17 = referralStatusPresenterKt$asRewardInfo$$inlined$map$1$2$1.label;
                        if (i17 != 0) {
                            SafeTrace.throwOnFailure(obj18);
                            ReferralManager$RewardStatus referralManager$RewardStatus = (ReferralManager$RewardStatus) obj;
                            ReferralStatusPresentationArgs$RewardInfo referralStatusPresentationArgs$RewardInfo = new ReferralStatusPresentationArgs$RewardInfo(referralManager$RewardStatus.available_reward_payments, referralManager$RewardStatus.completed_reward_payments, referralManager$RewardStatus.reward_payment_amount, referralManager$RewardStatus.expiration, referralManager$RewardStatus.reward_header_text, referralManager$RewardStatus.reward_main_text);
                            referralStatusPresenterKt$asRewardInfo$$inlined$map$1$2$1.label = 1;
                            if (flowCollector.emit(referralStatusPresentationArgs$RewardInfo, referralStatusPresenterKt$asRewardInfo$$inlined$map$1$2$1) == coroutineSingletons18) {
                                break;
                            }
                        } else if (i17 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj18);
                        }
                        break;
                    }
                }
                referralStatusPresenterKt$asRewardInfo$$inlined$map$1$2$1 = new ReferralStatusPresenterKt$asRewardInfo$$inlined$map$1$2$1(this, continuation);
                Object obj182 = referralStatusPresenterKt$asRewardInfo$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons182 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i17 = referralStatusPresenterKt$asRewardInfo$$inlined$map$1$2$1.label;
                if (i17 != 0) {
                }
            case 17:
                if (continuation instanceof UnsupportedSettingPresenter$models$lambda$0$$inlined$map$1$2$1) {
                    unsupportedSettingPresenter$models$lambda$0$$inlined$map$1$2$1 = (UnsupportedSettingPresenter$models$lambda$0$$inlined$map$1$2$1) continuation;
                    int i49 = unsupportedSettingPresenter$models$lambda$0$$inlined$map$1$2$1.label;
                    if ((i49 & PKIFailureInfo.systemUnavail) != 0) {
                        unsupportedSettingPresenter$models$lambda$0$$inlined$map$1$2$1.label = i49 - PKIFailureInfo.systemUnavail;
                        Object obj19 = unsupportedSettingPresenter$models$lambda$0$$inlined$map$1$2$1.result;
                        CoroutineSingletons coroutineSingletons19 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i18 = unsupportedSettingPresenter$models$lambda$0$$inlined$map$1$2$1.label;
                        if (i18 != 0) {
                            SafeTrace.throwOnFailure(obj19);
                            Boolean valueOf2 = Boolean.valueOf(CanvasCompatO.isRatePlanBusiness((P2pSettingsManager$P2pSettings) obj));
                            unsupportedSettingPresenter$models$lambda$0$$inlined$map$1$2$1.label = 1;
                            if (flowCollector.emit(valueOf2, unsupportedSettingPresenter$models$lambda$0$$inlined$map$1$2$1) == coroutineSingletons19) {
                                break;
                            }
                        } else if (i18 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj19);
                        }
                        break;
                    }
                }
                unsupportedSettingPresenter$models$lambda$0$$inlined$map$1$2$1 = new UnsupportedSettingPresenter$models$lambda$0$$inlined$map$1$2$1(this, continuation);
                Object obj192 = unsupportedSettingPresenter$models$lambda$0$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons192 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i18 = unsupportedSettingPresenter$models$lambda$0$$inlined$map$1$2$1.label;
                if (i18 != 0) {
                }
            case 18:
                if (continuation instanceof ChannelListPresenter$handleToggleClick$lambda$0$$inlined$map$1$2$1) {
                    channelListPresenter$handleToggleClick$lambda$0$$inlined$map$1$2$1 = (ChannelListPresenter$handleToggleClick$lambda$0$$inlined$map$1$2$1) continuation;
                    int i50 = channelListPresenter$handleToggleClick$lambda$0$$inlined$map$1$2$1.label;
                    if ((i50 & PKIFailureInfo.systemUnavail) != 0) {
                        channelListPresenter$handleToggleClick$lambda$0$$inlined$map$1$2$1.label = i50 - PKIFailureInfo.systemUnavail;
                        Object obj20 = channelListPresenter$handleToggleClick$lambda$0$$inlined$map$1$2$1.result;
                        CoroutineSingletons coroutineSingletons20 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i19 = channelListPresenter$handleToggleClick$lambda$0$$inlined$map$1$2$1.label;
                        if (i19 != 0) {
                            SafeTrace.throwOnFailure(obj20);
                            ArrayList aliases = ProfileNotificationsHelperKt.getAliases((List) obj);
                            channelListPresenter$handleToggleClick$lambda$0$$inlined$map$1$2$1.label = 1;
                            if (flowCollector.emit(aliases, channelListPresenter$handleToggleClick$lambda$0$$inlined$map$1$2$1) == coroutineSingletons20) {
                                break;
                            }
                        } else if (i19 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj20);
                        }
                        break;
                    }
                }
                channelListPresenter$handleToggleClick$lambda$0$$inlined$map$1$2$1 = new ChannelListPresenter$handleToggleClick$lambda$0$$inlined$map$1$2$1(this, continuation);
                Object obj202 = channelListPresenter$handleToggleClick$lambda$0$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons202 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i19 = channelListPresenter$handleToggleClick$lambda$0$$inlined$map$1$2$1.label;
                if (i19 != 0) {
                }
            case 19:
                if (continuation instanceof ProfileNotificationsPresenter$loadAccountSelectorAccounts$2$invokeSuspend$$inlined$map$1$2$1) {
                    profileNotificationsPresenter$loadAccountSelectorAccounts$2$invokeSuspend$$inlined$map$1$2$1 = (ProfileNotificationsPresenter$loadAccountSelectorAccounts$2$invokeSuspend$$inlined$map$1$2$1) continuation;
                    int i51 = profileNotificationsPresenter$loadAccountSelectorAccounts$2$invokeSuspend$$inlined$map$1$2$1.label;
                    if ((i51 & PKIFailureInfo.systemUnavail) != 0) {
                        profileNotificationsPresenter$loadAccountSelectorAccounts$2$invokeSuspend$$inlined$map$1$2$1.label = i51 - PKIFailureInfo.systemUnavail;
                        Object obj21 = profileNotificationsPresenter$loadAccountSelectorAccounts$2$invokeSuspend$$inlined$map$1$2$1.result;
                        CoroutineSingletons coroutineSingletons21 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i20 = profileNotificationsPresenter$loadAccountSelectorAccounts$2$invokeSuspend$$inlined$map$1$2$1.label;
                        if (i20 != 0) {
                            SafeTrace.throwOnFailure(obj21);
                            List list = ((UiNotificationSettings) obj).category_preferences;
                            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                arrayList.add(((UiCategoryNotificationPreference) it.next()).account_token);
                            }
                            List list2 = CollectionsKt.toList(CollectionsKt.toMutableSet(arrayList));
                            profileNotificationsPresenter$loadAccountSelectorAccounts$2$invokeSuspend$$inlined$map$1$2$1.label = 1;
                            if (flowCollector.emit(list2, profileNotificationsPresenter$loadAccountSelectorAccounts$2$invokeSuspend$$inlined$map$1$2$1) == coroutineSingletons21) {
                                break;
                            }
                        } else if (i20 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj21);
                        }
                        break;
                    }
                }
                profileNotificationsPresenter$loadAccountSelectorAccounts$2$invokeSuspend$$inlined$map$1$2$1 = new ProfileNotificationsPresenter$loadAccountSelectorAccounts$2$invokeSuspend$$inlined$map$1$2$1(this, continuation);
                Object obj212 = profileNotificationsPresenter$loadAccountSelectorAccounts$2$invokeSuspend$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons212 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i20 = profileNotificationsPresenter$loadAccountSelectorAccounts$2$invokeSuspend$$inlined$map$1$2$1.label;
                if (i20 != 0) {
                }
            case 20:
                if (continuation instanceof ProfileNotificationsPresenter$models$lambda$13$$inlined$map$1$2$1) {
                    profileNotificationsPresenter$models$lambda$13$$inlined$map$1$2$1 = (ProfileNotificationsPresenter$models$lambda$13$$inlined$map$1$2$1) continuation;
                    int i52 = profileNotificationsPresenter$models$lambda$13$$inlined$map$1$2$1.label;
                    if ((i52 & PKIFailureInfo.systemUnavail) != 0) {
                        profileNotificationsPresenter$models$lambda$13$$inlined$map$1$2$1.label = i52 - PKIFailureInfo.systemUnavail;
                        Object obj23 = profileNotificationsPresenter$models$lambda$13$$inlined$map$1$2$1.result;
                        CoroutineSingletons coroutineSingletons22 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i21 = profileNotificationsPresenter$models$lambda$13$$inlined$map$1$2$1.label;
                        if (i21 != 0) {
                            SafeTrace.throwOnFailure(obj23);
                            ArrayList aliases2 = ProfileNotificationsHelperKt.getAliases((List) obj);
                            profileNotificationsPresenter$models$lambda$13$$inlined$map$1$2$1.label = 1;
                            if (flowCollector.emit(aliases2, profileNotificationsPresenter$models$lambda$13$$inlined$map$1$2$1) == coroutineSingletons22) {
                                break;
                            }
                        } else if (i21 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj23);
                        }
                        break;
                    }
                }
                profileNotificationsPresenter$models$lambda$13$$inlined$map$1$2$1 = new ProfileNotificationsPresenter$models$lambda$13$$inlined$map$1$2$1(this, continuation);
                Object obj232 = profileNotificationsPresenter$models$lambda$13$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons222 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i21 = profileNotificationsPresenter$models$lambda$13$$inlined$map$1$2$1.label;
                if (i21 != 0) {
                }
            case 21:
                if (continuation instanceof AliasesSectionPresenter$models$1$1$invokeSuspend$$inlined$map$1$2$1) {
                    aliasesSectionPresenter$models$1$1$invokeSuspend$$inlined$map$1$2$1 = (AliasesSectionPresenter$models$1$1$invokeSuspend$$inlined$map$1$2$1) continuation;
                    int i53 = aliasesSectionPresenter$models$1$1$invokeSuspend$$inlined$map$1$2$1.label;
                    if ((i53 & PKIFailureInfo.systemUnavail) != 0) {
                        aliasesSectionPresenter$models$1$1$invokeSuspend$$inlined$map$1$2$1.label = i53 - PKIFailureInfo.systemUnavail;
                        Object obj24 = aliasesSectionPresenter$models$1$1$invokeSuspend$$inlined$map$1$2$1.result;
                        CoroutineSingletons coroutineSingletons23 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i22 = aliasesSectionPresenter$models$1$1$invokeSuspend$$inlined$map$1$2$1.label;
                        if (i22 != 0) {
                            SafeTrace.throwOnFailure(obj24);
                            AliasesSectionPresenter$Result.PopulatedList populatedList = new AliasesSectionPresenter$Result.PopulatedList((List) obj);
                            aliasesSectionPresenter$models$1$1$invokeSuspend$$inlined$map$1$2$1.label = 1;
                            if (flowCollector.emit(populatedList, aliasesSectionPresenter$models$1$1$invokeSuspend$$inlined$map$1$2$1) == coroutineSingletons23) {
                                break;
                            }
                        } else if (i22 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj24);
                        }
                        break;
                    }
                }
                aliasesSectionPresenter$models$1$1$invokeSuspend$$inlined$map$1$2$1 = new AliasesSectionPresenter$models$1$1$invokeSuspend$$inlined$map$1$2$1(this, continuation);
                Object obj242 = aliasesSectionPresenter$models$1$1$invokeSuspend$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons232 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i22 = aliasesSectionPresenter$models$1$1$invokeSuspend$$inlined$map$1$2$1.label;
                if (i22 != 0) {
                }
            case 22:
                if (continuation instanceof ProfilePersonalPresenter$models$lambda$0$$inlined$filterIsInstance$1$2$1) {
                    profilePersonalPresenter$models$lambda$0$$inlined$filterIsInstance$1$2$1 = (ProfilePersonalPresenter$models$lambda$0$$inlined$filterIsInstance$1$2$1) continuation;
                    int i54 = profilePersonalPresenter$models$lambda$0$$inlined$filterIsInstance$1$2$1.label;
                    if ((i54 & PKIFailureInfo.systemUnavail) != 0) {
                        profilePersonalPresenter$models$lambda$0$$inlined$filterIsInstance$1$2$1.label = i54 - PKIFailureInfo.systemUnavail;
                        Object obj25 = profilePersonalPresenter$models$lambda$0$$inlined$filterIsInstance$1$2$1.result;
                        CoroutineSingletons coroutineSingletons24 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i23 = profilePersonalPresenter$models$lambda$0$$inlined$filterIsInstance$1$2$1.label;
                        if (i23 != 0) {
                            SafeTrace.throwOnFailure(obj25);
                            if (obj instanceof PersonalScreenViewEvent.AppMessageEvent) {
                                profilePersonalPresenter$models$lambda$0$$inlined$filterIsInstance$1$2$1.label = 1;
                                if (flowCollector.emit(obj, profilePersonalPresenter$models$lambda$0$$inlined$filterIsInstance$1$2$1) == coroutineSingletons24) {
                                    break;
                                }
                            }
                        } else if (i23 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj25);
                        }
                        break;
                    }
                }
                profilePersonalPresenter$models$lambda$0$$inlined$filterIsInstance$1$2$1 = new ProfilePersonalPresenter$models$lambda$0$$inlined$filterIsInstance$1$2$1(this, continuation);
                Object obj252 = profilePersonalPresenter$models$lambda$0$$inlined$filterIsInstance$1$2$1.result;
                CoroutineSingletons coroutineSingletons242 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i23 = profilePersonalPresenter$models$lambda$0$$inlined$filterIsInstance$1$2$1.label;
                if (i23 != 0) {
                }
            case 23:
                if (continuation instanceof ProfilePersonalPresenter$models$lambda$0$$inlined$map$1$2$1) {
                    profilePersonalPresenter$models$lambda$0$$inlined$map$1$2$1 = (ProfilePersonalPresenter$models$lambda$0$$inlined$map$1$2$1) continuation;
                    int i55 = profilePersonalPresenter$models$lambda$0$$inlined$map$1$2$1.label;
                    if ((i55 & PKIFailureInfo.systemUnavail) != 0) {
                        profilePersonalPresenter$models$lambda$0$$inlined$map$1$2$1.label = i55 - PKIFailureInfo.systemUnavail;
                        Object obj26 = profilePersonalPresenter$models$lambda$0$$inlined$map$1$2$1.result;
                        CoroutineSingletons coroutineSingletons25 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i24 = profilePersonalPresenter$models$lambda$0$$inlined$map$1$2$1.label;
                        if (i24 != 0) {
                            SafeTrace.throwOnFailure(obj26);
                            Object obj27 = ((PersonalScreenViewEvent.AppMessageEvent) obj).event;
                            if (obj27 instanceof AppMessageViewEvent.AppMessageActionTaken) {
                                obj27 = AppMessageViewEvent.AppMessageActionTaken.copy$default((AppMessageViewEvent.AppMessageActionTaken) obj27, ProfileScreens.AccountInfoScreen.INSTANCE);
                            }
                            profilePersonalPresenter$models$lambda$0$$inlined$map$1$2$1.label = 1;
                            if (flowCollector.emit(obj27, profilePersonalPresenter$models$lambda$0$$inlined$map$1$2$1) == coroutineSingletons25) {
                                break;
                            }
                        } else if (i24 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj26);
                        }
                        break;
                    }
                }
                profilePersonalPresenter$models$lambda$0$$inlined$map$1$2$1 = new ProfilePersonalPresenter$models$lambda$0$$inlined$map$1$2$1(this, continuation);
                Object obj262 = profilePersonalPresenter$models$lambda$0$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons252 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i24 = profilePersonalPresenter$models$lambda$0$$inlined$map$1$2$1.label;
                if (i24 != 0) {
                }
            case 24:
                if (continuation instanceof ProfilePersonalPresenter$models$lambda$1$$inlined$filterIsInstance$1$2$1) {
                    profilePersonalPresenter$models$lambda$1$$inlined$filterIsInstance$1$2$1 = (ProfilePersonalPresenter$models$lambda$1$$inlined$filterIsInstance$1$2$1) continuation;
                    int i56 = profilePersonalPresenter$models$lambda$1$$inlined$filterIsInstance$1$2$1.label;
                    if ((i56 & PKIFailureInfo.systemUnavail) != 0) {
                        profilePersonalPresenter$models$lambda$1$$inlined$filterIsInstance$1$2$1.label = i56 - PKIFailureInfo.systemUnavail;
                        Object obj28 = profilePersonalPresenter$models$lambda$1$$inlined$filterIsInstance$1$2$1.result;
                        CoroutineSingletons coroutineSingletons26 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i25 = profilePersonalPresenter$models$lambda$1$$inlined$filterIsInstance$1$2$1.label;
                        if (i25 != 0) {
                            SafeTrace.throwOnFailure(obj28);
                            if (obj instanceof PersonalScreenViewEvent.AliasEvent) {
                                profilePersonalPresenter$models$lambda$1$$inlined$filterIsInstance$1$2$1.label = 1;
                                if (flowCollector.emit(obj, profilePersonalPresenter$models$lambda$1$$inlined$filterIsInstance$1$2$1) == coroutineSingletons26) {
                                    break;
                                }
                            }
                        } else if (i25 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj28);
                        }
                        break;
                    }
                }
                profilePersonalPresenter$models$lambda$1$$inlined$filterIsInstance$1$2$1 = new ProfilePersonalPresenter$models$lambda$1$$inlined$filterIsInstance$1$2$1(this, continuation);
                Object obj282 = profilePersonalPresenter$models$lambda$1$$inlined$filterIsInstance$1$2$1.result;
                CoroutineSingletons coroutineSingletons262 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i25 = profilePersonalPresenter$models$lambda$1$$inlined$filterIsInstance$1$2$1.label;
                if (i25 != 0) {
                }
            case 25:
                if (continuation instanceof ProfilePersonalPresenter$models$lambda$1$$inlined$map$1$2$1) {
                    profilePersonalPresenter$models$lambda$1$$inlined$map$1$2$1 = (ProfilePersonalPresenter$models$lambda$1$$inlined$map$1$2$1) continuation;
                    int i57 = profilePersonalPresenter$models$lambda$1$$inlined$map$1$2$1.label;
                    if ((i57 & PKIFailureInfo.systemUnavail) != 0) {
                        profilePersonalPresenter$models$lambda$1$$inlined$map$1$2$1.label = i57 - PKIFailureInfo.systemUnavail;
                        Object obj29 = profilePersonalPresenter$models$lambda$1$$inlined$map$1$2$1.result;
                        CoroutineSingletons coroutineSingletons27 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i26 = profilePersonalPresenter$models$lambda$1$$inlined$map$1$2$1.label;
                        if (i26 != 0) {
                            SafeTrace.throwOnFailure(obj29);
                            AliasesSectionEvent aliasesSectionEvent = ((PersonalScreenViewEvent.AliasEvent) obj).event;
                            profilePersonalPresenter$models$lambda$1$$inlined$map$1$2$1.label = 1;
                            if (flowCollector.emit(aliasesSectionEvent, profilePersonalPresenter$models$lambda$1$$inlined$map$1$2$1) == coroutineSingletons27) {
                                break;
                            }
                        } else if (i26 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj29);
                        }
                        break;
                    }
                }
                profilePersonalPresenter$models$lambda$1$$inlined$map$1$2$1 = new ProfilePersonalPresenter$models$lambda$1$$inlined$map$1$2$1(this, continuation);
                Object obj292 = profilePersonalPresenter$models$lambda$1$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons272 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i26 = profilePersonalPresenter$models$lambda$1$$inlined$map$1$2$1.label;
                if (i26 != 0) {
                }
            case 26:
                if (continuation instanceof RealSearchPrivacySettingsPresenter$models$lambda$0$$inlined$map$1$2$1) {
                    realSearchPrivacySettingsPresenter$models$lambda$0$$inlined$map$1$2$1 = (RealSearchPrivacySettingsPresenter$models$lambda$0$$inlined$map$1$2$1) continuation;
                    int i58 = realSearchPrivacySettingsPresenter$models$lambda$0$$inlined$map$1$2$1.label;
                    if ((i58 & PKIFailureInfo.systemUnavail) != 0) {
                        realSearchPrivacySettingsPresenter$models$lambda$0$$inlined$map$1$2$1.label = i58 - PKIFailureInfo.systemUnavail;
                        Object obj30 = realSearchPrivacySettingsPresenter$models$lambda$0$$inlined$map$1$2$1.result;
                        CoroutineSingletons coroutineSingletons28 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i27 = realSearchPrivacySettingsPresenter$models$lambda$0$$inlined$map$1$2$1.label;
                        if (i27 != 0) {
                            SafeTrace.throwOnFailure(obj30);
                            String str = ((PublicProfile) obj).fullName;
                            realSearchPrivacySettingsPresenter$models$lambda$0$$inlined$map$1$2$1.label = 1;
                            if (flowCollector.emit(str, realSearchPrivacySettingsPresenter$models$lambda$0$$inlined$map$1$2$1) == coroutineSingletons28) {
                                break;
                            }
                        } else if (i27 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj30);
                        }
                        break;
                    }
                }
                realSearchPrivacySettingsPresenter$models$lambda$0$$inlined$map$1$2$1 = new RealSearchPrivacySettingsPresenter$models$lambda$0$$inlined$map$1$2$1(this, continuation);
                Object obj302 = realSearchPrivacySettingsPresenter$models$lambda$0$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons282 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i27 = realSearchPrivacySettingsPresenter$models$lambda$0$$inlined$map$1$2$1.label;
                if (i27 != 0) {
                }
            case 27:
                if (continuation instanceof PromotionsReferralsHomePresenter$invitePromotionFlow$$inlined$map$1$2$1) {
                    promotionsReferralsHomePresenter$invitePromotionFlow$$inlined$map$1$2$1 = (PromotionsReferralsHomePresenter$invitePromotionFlow$$inlined$map$1$2$1) continuation;
                    int i59 = promotionsReferralsHomePresenter$invitePromotionFlow$$inlined$map$1$2$1.label;
                    if ((i59 & PKIFailureInfo.systemUnavail) != 0) {
                        promotionsReferralsHomePresenter$invitePromotionFlow$$inlined$map$1$2$1.label = i59 - PKIFailureInfo.systemUnavail;
                        Object obj31 = promotionsReferralsHomePresenter$invitePromotionFlow$$inlined$map$1$2$1.result;
                        CoroutineSingletons coroutineSingletons29 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i28 = promotionsReferralsHomePresenter$invitePromotionFlow$$inlined$map$1$2$1.label;
                        if (i28 != 0) {
                            SafeTrace.throwOnFailure(obj31);
                            Boolean valueOf3 = Boolean.valueOf(CanvasCompatO.isRatePlanBusiness((P2pSettingsManager$P2pSettings) obj));
                            promotionsReferralsHomePresenter$invitePromotionFlow$$inlined$map$1$2$1.label = 1;
                            if (flowCollector.emit(valueOf3, promotionsReferralsHomePresenter$invitePromotionFlow$$inlined$map$1$2$1) == coroutineSingletons29) {
                                break;
                            }
                        } else if (i28 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj31);
                        }
                        break;
                    }
                }
                promotionsReferralsHomePresenter$invitePromotionFlow$$inlined$map$1$2$1 = new PromotionsReferralsHomePresenter$invitePromotionFlow$$inlined$map$1$2$1(this, continuation);
                Object obj312 = promotionsReferralsHomePresenter$invitePromotionFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons292 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i28 = promotionsReferralsHomePresenter$invitePromotionFlow$$inlined$map$1$2$1.label;
                if (i28 != 0) {
                }
            case 28:
                if (continuation instanceof CashQrScannerPresenter$special$$inlined$filter$1$2$1) {
                    cashQrScannerPresenter$special$$inlined$filter$1$2$1 = (CashQrScannerPresenter$special$$inlined$filter$1$2$1) continuation;
                    int i60 = cashQrScannerPresenter$special$$inlined$filter$1$2$1.label;
                    if ((i60 & PKIFailureInfo.systemUnavail) != 0) {
                        cashQrScannerPresenter$special$$inlined$filter$1$2$1.label = i60 - PKIFailureInfo.systemUnavail;
                        Object obj33 = cashQrScannerPresenter$special$$inlined$filter$1$2$1.result;
                        CoroutineSingletons coroutineSingletons30 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i29 = cashQrScannerPresenter$special$$inlined$filter$1$2$1.label;
                        if (i29 != 0) {
                            SafeTrace.throwOnFailure(obj33);
                            if (Intrinsics.areEqual((String) obj, "android.permission.CAMERA")) {
                                cashQrScannerPresenter$special$$inlined$filter$1$2$1.label = 1;
                                if (flowCollector.emit(obj, cashQrScannerPresenter$special$$inlined$filter$1$2$1) == coroutineSingletons30) {
                                    break;
                                }
                            }
                        } else if (i29 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj33);
                        }
                        break;
                    }
                }
                cashQrScannerPresenter$special$$inlined$filter$1$2$1 = new CashQrScannerPresenter$special$$inlined$filter$1$2$1(this, continuation);
                Object obj332 = cashQrScannerPresenter$special$$inlined$filter$1$2$1.result;
                CoroutineSingletons coroutineSingletons302 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i29 = cashQrScannerPresenter$special$$inlined$filter$1$2$1.label;
                if (i29 != 0) {
                }
            default:
                if (continuation instanceof CashQrScannerPresenter$special$$inlined$filter$2$2$1) {
                    cashQrScannerPresenter$special$$inlined$filter$2$2$1 = (CashQrScannerPresenter$special$$inlined$filter$2$2$1) continuation;
                    int i61 = cashQrScannerPresenter$special$$inlined$filter$2$2$1.label;
                    if ((i61 & PKIFailureInfo.systemUnavail) != 0) {
                        cashQrScannerPresenter$special$$inlined$filter$2$2$1.label = i61 - PKIFailureInfo.systemUnavail;
                        Object obj34 = cashQrScannerPresenter$special$$inlined$filter$2$2$1.result;
                        CoroutineSingletons coroutineSingletons31 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i30 = cashQrScannerPresenter$special$$inlined$filter$2$2$1.label;
                        if (i30 != 0) {
                            SafeTrace.throwOnFailure(obj34);
                            ActivityEvent activityEvent = (ActivityEvent) obj;
                            if (activityEvent == ActivityEvent.RESUME || activityEvent == ActivityEvent.PAUSE) {
                                cashQrScannerPresenter$special$$inlined$filter$2$2$1.label = 1;
                                if (flowCollector.emit(obj, cashQrScannerPresenter$special$$inlined$filter$2$2$1) == coroutineSingletons31) {
                                    break;
                                }
                            }
                        } else if (i30 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj34);
                        }
                        break;
                    }
                }
                cashQrScannerPresenter$special$$inlined$filter$2$2$1 = new CashQrScannerPresenter$special$$inlined$filter$2$2$1(this, continuation);
                Object obj342 = cashQrScannerPresenter$special$$inlined$filter$2$2$1.result;
                CoroutineSingletons coroutineSingletons312 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i30 = cashQrScannerPresenter$special$$inlined$filter$2$2$1.label;
                if (i30 != 0) {
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
