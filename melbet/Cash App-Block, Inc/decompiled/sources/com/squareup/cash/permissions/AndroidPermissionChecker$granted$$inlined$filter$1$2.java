package com.squareup.cash.permissions;

import androidx.compose.foundation.gestures.DefaultDraggableAnchors;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.gms.internal.mlkit_genai_prompt.zzaho;
import com.squareup.cash.R;
import com.squareup.cash.account.settings.viewmodels.BlockedAccountsSectionViewEvent$TapViewAll;
import com.squareup.cash.account.settings.viewmodels.ProfilePrivacyReadyViewModel$ProfileSecurityPolicy;
import com.squareup.cash.account.settings.viewmodels.ProfilePrivacyViewEvent;
import com.squareup.cash.api.AsyncResult;
import com.squareup.cash.clipboard.ClipboardItem;
import com.squareup.cash.data.profile.JurisdictionConfigManager$JurisdictionConfig;
import com.squareup.cash.data.profile.PublicProfile;
import com.squareup.cash.featureflags.FeatureFlag$EnabledDisabledAmplitudeExperiment$Options;
import com.squareup.cash.payments.backend.api.BackgroundMetadata;
import com.squareup.cash.payments.backend.api.P2pSettingsManager$P2pSettings;
import com.squareup.cash.payments.backend.api.StickerMetadata;
import com.squareup.cash.payments.presenters.MainPaymentPresenter$models$lambda$48$$inlined$map$1$2$1;
import com.squareup.cash.payments.presenters.PaymentConfigurationPresenter$models$14$1$invokeSuspend$lambda$0$$inlined$map$1$2$1;
import com.squareup.cash.payments.presenters.PersonalizePaymentStickersPresenter$models$lambda$0$$inlined$map$1$2$1;
import com.squareup.cash.payments.presenters.RealPersonalizePaymentManager$loadBackgrounds$$inlined$map$1$2$1;
import com.squareup.cash.payments.presenters.RealPersonalizePaymentManager$loadStickers$$inlined$map$1$2$1;
import com.squareup.cash.payments.viewmodels.LocalSticker;
import com.squareup.cash.payments.viewmodels.Sticker;
import com.squareup.cash.payments.views.coreflowsheet.CoreFlowRealSheetState$awaitDismissalDragDisabled$$inlined$filter$1$2$1;
import com.squareup.cash.payments.views.coreflowsheet.CoreFlowRealSheetState$awaitDismissalDragEnabled$$inlined$mapNotNull$1$2$1;
import com.squareup.cash.payments.views.coreflowsheet.CoreFlowSheetPosition;
import com.squareup.cash.pools.backend.real.PoolsRefresher$setup$1$2$invokeSuspend$$inlined$map$1$2$1;
import com.squareup.cash.pools.presenters.PoolInvitePeopleListPresenter$models$lambda$12$$inlined$map$1$2$1;
import com.squareup.cash.portfolio.graphs.RealInvestingCryptoGraphHeaderPresenter$special$$inlined$map$1$2$1;
import com.squareup.cash.prepurchasecashcard.presenters.PrepurchaseCashCardPlanningPresenter$models$lambda$0$$inlined$map$1$2$1;
import com.squareup.cash.profile.devicemanager.presenters.DataLoadingState;
import com.squareup.cash.profile.devicemanager.presenters.DeviceManagerDeviceDetailsPresenter$models$1$1$invokeSuspend$$inlined$filterIsInstance$1$2$1;
import com.squareup.cash.profile.devicemanager.presenters.DeviceManagerDeviceDetailsPresenter$models$1$1$invokeSuspend$$inlined$map$1$2$1;
import com.squareup.cash.profile.presenters.IncomingRequestsPresenter$models$1$1$invokeSuspend$$inlined$map$1$2$1;
import com.squareup.cash.profile.presenters.ProfileCashtagRequiredPresenter$models$lambda$1$$inlined$map$1$2$1;
import com.squareup.cash.profile.presenters.ProfileConfirmSignOutPresenter$models$lambda$1$$inlined$map$1$2$1;
import com.squareup.cash.profile.presenters.ProfilePresenter$genericProfileElementsPresenter$lambda$0$$inlined$mapNotNull$1$2$1;
import com.squareup.cash.profile.presenters.ProfilePresenter$models$lambda$13$$inlined$filterIsInstance$1$2$1;
import com.squareup.cash.profile.presenters.ProfilePresenter$models$lambda$13$$inlined$map$1$2$1;
import com.squareup.cash.profile.presenters.ProfilePresenter$models$lambda$2$$inlined$map$1$2$1;
import com.squareup.cash.profile.presenters.ProfilePrivacyPresenter$emitAnalyticsEvents$lambda$0$$inlined$filter$1$2$1;
import com.squareup.cash.profile.presenters.ProfilePrivacyPresenter$emitAnalyticsEvents$lambda$0$$inlined$map$1$2$1;
import com.squareup.cash.profile.presenters.ProfilePrivacyPresenter$models$1$1$invokeSuspend$$inlined$map$1$2$1;
import com.squareup.cash.profile.presenters.ProfilePrivacyPresenter$models$lambda$15$$inlined$filterIsInstance$1$2$1;
import com.squareup.cash.profile.presenters.ProfilePrivacyPresenter$models$lambda$4$$inlined$map$1$2$1;
import com.squareup.cash.profile.presenters.ProfilePrivacyPresenter$models$lambda$6$$inlined$filterIsInstance$1$2$1;
import com.squareup.cash.profile.presenters.ProfilePrivacyPresenter$models$lambda$6$$inlined$map$1$2$1;
import com.squareup.cash.profile.presenters.ProfilePrivacyPresenter$models$lambda$7$$inlined$filterIsInstance$1$2$1;
import com.squareup.cash.profile.viewmodels.GenericProfileElementsViewEvent;
import com.squareup.cash.profile.viewmodels.ProfileViewEvent;
import com.squareup.cash.recipients.data.RecipientRepository$Result;
import com.squareup.cash.util.money.Moneys;
import com.squareup.lending.PrepurchaseCashCardAppletData;
import com.squareup.lending.sync_values.PrepurchaseCashCardAppletSyncData;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.franklin.privacy.IncomingRequestPolicy;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.random.Random;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.coroutines.flow.FlowCollector;
import okhttp3.internal.Tags;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class AndroidPermissionChecker$granted$$inlined$filter$1$2 implements FlowCollector {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ FlowCollector $this_unsafeFlow;

    /* renamed from: com.squareup.cash.permissions.AndroidPermissionChecker$granted$$inlined$filter$1$2$1, reason: invalid class name */
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
            return AndroidPermissionChecker$granted$$inlined$filter$1$2.this.emit(null, this);
        }
    }

    public /* synthetic */ AndroidPermissionChecker$granted$$inlined$filter$1$2(FlowCollector flowCollector, int i) {
        this.$r8$classId = i;
        this.$this_unsafeFlow = flowCollector;
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0318  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x0365  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x036f  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x03ad  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x03b7  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x03ee  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x03f8  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:330:0x042b  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x0435  */
    /* JADX WARN: Removed duplicated region for block: B:350:0x0467  */
    /* JADX WARN: Removed duplicated region for block: B:356:0x0471  */
    /* JADX WARN: Removed duplicated region for block: B:371:0x04b1  */
    /* JADX WARN: Removed duplicated region for block: B:377:0x04bb  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:392:0x04f0  */
    /* JADX WARN: Removed duplicated region for block: B:398:0x04fa  */
    /* JADX WARN: Removed duplicated region for block: B:410:0x052d  */
    /* JADX WARN: Removed duplicated region for block: B:416:0x0537  */
    /* JADX WARN: Removed duplicated region for block: B:428:0x0570  */
    /* JADX WARN: Removed duplicated region for block: B:434:0x057a  */
    /* JADX WARN: Removed duplicated region for block: B:446:0x05ad  */
    /* JADX WARN: Removed duplicated region for block: B:452:0x05b7  */
    /* JADX WARN: Removed duplicated region for block: B:468:0x0600  */
    /* JADX WARN: Removed duplicated region for block: B:474:0x060a  */
    /* JADX WARN: Removed duplicated region for block: B:488:0x0641  */
    /* JADX WARN: Removed duplicated region for block: B:494:0x064b  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:511:0x06a8  */
    /* JADX WARN: Removed duplicated region for block: B:517:0x06b2  */
    /* JADX WARN: Removed duplicated region for block: B:534:0x0706  */
    /* JADX WARN: Removed duplicated region for block: B:540:0x0710  */
    /* JADX WARN: Removed duplicated region for block: B:557:0x077f  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:563:0x0789  */
    /* JADX WARN: Removed duplicated region for block: B:578:0x07c4  */
    /* JADX WARN: Removed duplicated region for block: B:584:0x07ce  */
    /* JADX WARN: Removed duplicated region for block: B:599:0x0803  */
    /* JADX WARN: Removed duplicated region for block: B:605:0x080d  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x012d  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        AnonymousClass1 anonymousClass1;
        int i;
        MainPaymentPresenter$models$lambda$48$$inlined$map$1$2$1 mainPaymentPresenter$models$lambda$48$$inlined$map$1$2$1;
        int i2;
        PaymentConfigurationPresenter$models$14$1$invokeSuspend$lambda$0$$inlined$map$1$2$1 paymentConfigurationPresenter$models$14$1$invokeSuspend$lambda$0$$inlined$map$1$2$1;
        int i3;
        PersonalizePaymentStickersPresenter$models$lambda$0$$inlined$map$1$2$1 personalizePaymentStickersPresenter$models$lambda$0$$inlined$map$1$2$1;
        int i4;
        RealPersonalizePaymentManager$loadBackgrounds$$inlined$map$1$2$1 realPersonalizePaymentManager$loadBackgrounds$$inlined$map$1$2$1;
        int i5;
        RealPersonalizePaymentManager$loadStickers$$inlined$map$1$2$1 realPersonalizePaymentManager$loadStickers$$inlined$map$1$2$1;
        int i6;
        CoreFlowRealSheetState$awaitDismissalDragDisabled$$inlined$filter$1$2$1 coreFlowRealSheetState$awaitDismissalDragDisabled$$inlined$filter$1$2$1;
        int i7;
        CoreFlowRealSheetState$awaitDismissalDragEnabled$$inlined$mapNotNull$1$2$1 coreFlowRealSheetState$awaitDismissalDragEnabled$$inlined$mapNotNull$1$2$1;
        int i8;
        AndroidPermissionChecker$create$1$denied$$inlined$map$1$2$1 androidPermissionChecker$create$1$denied$$inlined$map$1$2$1;
        int i9;
        PoolsRefresher$setup$1$2$invokeSuspend$$inlined$map$1$2$1 poolsRefresher$setup$1$2$invokeSuspend$$inlined$map$1$2$1;
        int i10;
        PoolInvitePeopleListPresenter$models$lambda$12$$inlined$map$1$2$1 poolInvitePeopleListPresenter$models$lambda$12$$inlined$map$1$2$1;
        int i11;
        RealInvestingCryptoGraphHeaderPresenter$special$$inlined$map$1$2$1 realInvestingCryptoGraphHeaderPresenter$special$$inlined$map$1$2$1;
        int i12;
        PrepurchaseCashCardPlanningPresenter$models$lambda$0$$inlined$map$1$2$1 prepurchaseCashCardPlanningPresenter$models$lambda$0$$inlined$map$1$2$1;
        int i13;
        DeviceManagerDeviceDetailsPresenter$models$1$1$invokeSuspend$$inlined$filterIsInstance$1$2$1 deviceManagerDeviceDetailsPresenter$models$1$1$invokeSuspend$$inlined$filterIsInstance$1$2$1;
        int i14;
        DeviceManagerDeviceDetailsPresenter$models$1$1$invokeSuspend$$inlined$map$1$2$1 deviceManagerDeviceDetailsPresenter$models$1$1$invokeSuspend$$inlined$map$1$2$1;
        int i15;
        IncomingRequestsPresenter$models$1$1$invokeSuspend$$inlined$map$1$2$1 incomingRequestsPresenter$models$1$1$invokeSuspend$$inlined$map$1$2$1;
        int i16;
        ProfileCashtagRequiredPresenter$models$lambda$1$$inlined$map$1$2$1 profileCashtagRequiredPresenter$models$lambda$1$$inlined$map$1$2$1;
        int i17;
        CurrencyCode currencyCode;
        ProfileConfirmSignOutPresenter$models$lambda$1$$inlined$map$1$2$1 profileConfirmSignOutPresenter$models$lambda$1$$inlined$map$1$2$1;
        int i18;
        ProfilePresenter$genericProfileElementsPresenter$lambda$0$$inlined$mapNotNull$1$2$1 profilePresenter$genericProfileElementsPresenter$lambda$0$$inlined$mapNotNull$1$2$1;
        int i19;
        ProfilePresenter$models$lambda$13$$inlined$filterIsInstance$1$2$1 profilePresenter$models$lambda$13$$inlined$filterIsInstance$1$2$1;
        int i20;
        ProfilePresenter$models$lambda$13$$inlined$map$1$2$1 profilePresenter$models$lambda$13$$inlined$map$1$2$1;
        int i21;
        ProfilePresenter$models$lambda$2$$inlined$map$1$2$1 profilePresenter$models$lambda$2$$inlined$map$1$2$1;
        int i22;
        ProfilePrivacyPresenter$emitAnalyticsEvents$lambda$0$$inlined$filter$1$2$1 profilePrivacyPresenter$emitAnalyticsEvents$lambda$0$$inlined$filter$1$2$1;
        int i23;
        ProfilePrivacyPresenter$emitAnalyticsEvents$lambda$0$$inlined$map$1$2$1 profilePrivacyPresenter$emitAnalyticsEvents$lambda$0$$inlined$map$1$2$1;
        int i24;
        ProfilePrivacyPresenter$models$1$1$invokeSuspend$$inlined$map$1$2$1 profilePrivacyPresenter$models$1$1$invokeSuspend$$inlined$map$1$2$1;
        int i25;
        ProfilePrivacyPresenter$models$lambda$15$$inlined$filterIsInstance$1$2$1 profilePrivacyPresenter$models$lambda$15$$inlined$filterIsInstance$1$2$1;
        int i26;
        ProfilePrivacyPresenter$models$lambda$4$$inlined$map$1$2$1 profilePrivacyPresenter$models$lambda$4$$inlined$map$1$2$1;
        int i27;
        ProfilePrivacyPresenter$models$lambda$6$$inlined$filterIsInstance$1$2$1 profilePrivacyPresenter$models$lambda$6$$inlined$filterIsInstance$1$2$1;
        int i28;
        ProfilePrivacyPresenter$models$lambda$6$$inlined$map$1$2$1 profilePrivacyPresenter$models$lambda$6$$inlined$map$1$2$1;
        int i29;
        ProfilePrivacyPresenter$models$lambda$7$$inlined$filterIsInstance$1$2$1 profilePrivacyPresenter$models$lambda$7$$inlined$filterIsInstance$1$2$1;
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
                            if (((Boolean) obj).booleanValue()) {
                                anonymousClass1.label = 1;
                                if (flowCollector.emit(obj, anonymousClass1) == coroutineSingletons) {
                                    break;
                                }
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
                if (continuation instanceof MainPaymentPresenter$models$lambda$48$$inlined$map$1$2$1) {
                    mainPaymentPresenter$models$lambda$48$$inlined$map$1$2$1 = (MainPaymentPresenter$models$lambda$48$$inlined$map$1$2$1) continuation;
                    int i33 = mainPaymentPresenter$models$lambda$48$$inlined$map$1$2$1.label;
                    if ((i33 & PKIFailureInfo.systemUnavail) != 0) {
                        mainPaymentPresenter$models$lambda$48$$inlined$map$1$2$1.label = i33 - PKIFailureInfo.systemUnavail;
                        Object obj3 = mainPaymentPresenter$models$lambda$48$$inlined$map$1$2$1.result;
                        CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i2 = mainPaymentPresenter$models$lambda$48$$inlined$map$1$2$1.label;
                        if (i2 != 0) {
                            SafeTrace.throwOnFailure(obj3);
                            JurisdictionConfigManager$JurisdictionConfig jurisdictionConfigManager$JurisdictionConfig = (JurisdictionConfigManager$JurisdictionConfig) obj;
                            r9 = jurisdictionConfigManager$JurisdictionConfig != null ? jurisdictionConfigManager$JurisdictionConfig.availableP2pTargetRegions : null;
                            mainPaymentPresenter$models$lambda$48$$inlined$map$1$2$1.label = 1;
                            if (flowCollector.emit(r9, mainPaymentPresenter$models$lambda$48$$inlined$map$1$2$1) == coroutineSingletons3) {
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
                mainPaymentPresenter$models$lambda$48$$inlined$map$1$2$1 = new MainPaymentPresenter$models$lambda$48$$inlined$map$1$2$1(this, continuation);
                Object obj32 = mainPaymentPresenter$models$lambda$48$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons32 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = mainPaymentPresenter$models$lambda$48$$inlined$map$1$2$1.label;
                if (i2 != 0) {
                }
            case 2:
                if (continuation instanceof PaymentConfigurationPresenter$models$14$1$invokeSuspend$lambda$0$$inlined$map$1$2$1) {
                    paymentConfigurationPresenter$models$14$1$invokeSuspend$lambda$0$$inlined$map$1$2$1 = (PaymentConfigurationPresenter$models$14$1$invokeSuspend$lambda$0$$inlined$map$1$2$1) continuation;
                    int i34 = paymentConfigurationPresenter$models$14$1$invokeSuspend$lambda$0$$inlined$map$1$2$1.label;
                    if ((i34 & PKIFailureInfo.systemUnavail) != 0) {
                        paymentConfigurationPresenter$models$14$1$invokeSuspend$lambda$0$$inlined$map$1$2$1.label = i34 - PKIFailureInfo.systemUnavail;
                        Object obj4 = paymentConfigurationPresenter$models$14$1$invokeSuspend$lambda$0$$inlined$map$1$2$1.result;
                        CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i3 = paymentConfigurationPresenter$models$14$1$invokeSuspend$lambda$0$$inlined$map$1$2$1.label;
                        if (i3 != 0) {
                            SafeTrace.throwOnFailure(obj4);
                            ClipboardItem clipboardItem = (ClipboardItem) CollectionsKt.firstOrNull((List) obj);
                            r9 = clipboardItem != null ? clipboardItem.text : null;
                            paymentConfigurationPresenter$models$14$1$invokeSuspend$lambda$0$$inlined$map$1$2$1.label = 1;
                            if (flowCollector.emit(r9, paymentConfigurationPresenter$models$14$1$invokeSuspend$lambda$0$$inlined$map$1$2$1) == coroutineSingletons4) {
                                break;
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
                paymentConfigurationPresenter$models$14$1$invokeSuspend$lambda$0$$inlined$map$1$2$1 = new PaymentConfigurationPresenter$models$14$1$invokeSuspend$lambda$0$$inlined$map$1$2$1(this, continuation);
                Object obj42 = paymentConfigurationPresenter$models$14$1$invokeSuspend$lambda$0$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons42 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i3 = paymentConfigurationPresenter$models$14$1$invokeSuspend$lambda$0$$inlined$map$1$2$1.label;
                if (i3 != 0) {
                }
            case 3:
                if (continuation instanceof PersonalizePaymentStickersPresenter$models$lambda$0$$inlined$map$1$2$1) {
                    personalizePaymentStickersPresenter$models$lambda$0$$inlined$map$1$2$1 = (PersonalizePaymentStickersPresenter$models$lambda$0$$inlined$map$1$2$1) continuation;
                    int i35 = personalizePaymentStickersPresenter$models$lambda$0$$inlined$map$1$2$1.label;
                    if ((i35 & PKIFailureInfo.systemUnavail) != 0) {
                        personalizePaymentStickersPresenter$models$lambda$0$$inlined$map$1$2$1.label = i35 - PKIFailureInfo.systemUnavail;
                        Object obj5 = personalizePaymentStickersPresenter$models$lambda$0$$inlined$map$1$2$1.result;
                        CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i4 = personalizePaymentStickersPresenter$models$lambda$0$$inlined$map$1$2$1.label;
                        if (i4 != 0) {
                            SafeTrace.throwOnFailure(obj5);
                            List<LocalSticker> list = (List) obj;
                            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
                            for (LocalSticker localSticker : list) {
                                Random.Default.getClass();
                                arrayList.add(new Sticker(Random.defaultRandom.nextInt(), null, localSticker.mainUrl, localSticker.previewUrl, localSticker.id, localSticker.accessibilityDescription, 2));
                            }
                            ImmutableList immutableList = Tags.toImmutableList(arrayList);
                            personalizePaymentStickersPresenter$models$lambda$0$$inlined$map$1$2$1.label = 1;
                            if (flowCollector.emit(immutableList, personalizePaymentStickersPresenter$models$lambda$0$$inlined$map$1$2$1) == coroutineSingletons5) {
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
                personalizePaymentStickersPresenter$models$lambda$0$$inlined$map$1$2$1 = new PersonalizePaymentStickersPresenter$models$lambda$0$$inlined$map$1$2$1(this, continuation);
                Object obj52 = personalizePaymentStickersPresenter$models$lambda$0$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons52 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i4 = personalizePaymentStickersPresenter$models$lambda$0$$inlined$map$1$2$1.label;
                if (i4 != 0) {
                }
            case 4:
                if (continuation instanceof RealPersonalizePaymentManager$loadBackgrounds$$inlined$map$1$2$1) {
                    realPersonalizePaymentManager$loadBackgrounds$$inlined$map$1$2$1 = (RealPersonalizePaymentManager$loadBackgrounds$$inlined$map$1$2$1) continuation;
                    int i36 = realPersonalizePaymentManager$loadBackgrounds$$inlined$map$1$2$1.label;
                    if ((i36 & PKIFailureInfo.systemUnavail) != 0) {
                        realPersonalizePaymentManager$loadBackgrounds$$inlined$map$1$2$1.label = i36 - PKIFailureInfo.systemUnavail;
                        Object obj6 = realPersonalizePaymentManager$loadBackgrounds$$inlined$map$1$2$1.result;
                        CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i5 = realPersonalizePaymentManager$loadBackgrounds$$inlined$map$1$2$1.label;
                        if (i5 != 0) {
                            SafeTrace.throwOnFailure(obj6);
                            List list2 = (List) obj;
                            ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
                            Iterator it = list2.iterator();
                            while (it.hasNext()) {
                                arrayList2.add(zzaho.access$toBackground((BackgroundMetadata) it.next()));
                            }
                            realPersonalizePaymentManager$loadBackgrounds$$inlined$map$1$2$1.label = 1;
                            if (flowCollector.emit(arrayList2, realPersonalizePaymentManager$loadBackgrounds$$inlined$map$1$2$1) == coroutineSingletons6) {
                                break;
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
                realPersonalizePaymentManager$loadBackgrounds$$inlined$map$1$2$1 = new RealPersonalizePaymentManager$loadBackgrounds$$inlined$map$1$2$1(this, continuation);
                Object obj62 = realPersonalizePaymentManager$loadBackgrounds$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons62 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i5 = realPersonalizePaymentManager$loadBackgrounds$$inlined$map$1$2$1.label;
                if (i5 != 0) {
                }
            case 5:
                if (continuation instanceof RealPersonalizePaymentManager$loadStickers$$inlined$map$1$2$1) {
                    realPersonalizePaymentManager$loadStickers$$inlined$map$1$2$1 = (RealPersonalizePaymentManager$loadStickers$$inlined$map$1$2$1) continuation;
                    int i37 = realPersonalizePaymentManager$loadStickers$$inlined$map$1$2$1.label;
                    if ((i37 & PKIFailureInfo.systemUnavail) != 0) {
                        realPersonalizePaymentManager$loadStickers$$inlined$map$1$2$1.label = i37 - PKIFailureInfo.systemUnavail;
                        Object obj7 = realPersonalizePaymentManager$loadStickers$$inlined$map$1$2$1.result;
                        CoroutineSingletons coroutineSingletons7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i6 = realPersonalizePaymentManager$loadStickers$$inlined$map$1$2$1.label;
                        if (i6 != 0) {
                            SafeTrace.throwOnFailure(obj7);
                            List<StickerMetadata> list3 = (List) obj;
                            ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list3, 10));
                            for (StickerMetadata stickerMetadata : list3) {
                                arrayList3.add(new LocalSticker(stickerMetadata.id, stickerMetadata.mainUrl, stickerMetadata.previewUrl, stickerMetadata.accessibilityDescription));
                            }
                            realPersonalizePaymentManager$loadStickers$$inlined$map$1$2$1.label = 1;
                            if (flowCollector.emit(arrayList3, realPersonalizePaymentManager$loadStickers$$inlined$map$1$2$1) == coroutineSingletons7) {
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
                realPersonalizePaymentManager$loadStickers$$inlined$map$1$2$1 = new RealPersonalizePaymentManager$loadStickers$$inlined$map$1$2$1(this, continuation);
                Object obj72 = realPersonalizePaymentManager$loadStickers$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons72 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i6 = realPersonalizePaymentManager$loadStickers$$inlined$map$1$2$1.label;
                if (i6 != 0) {
                }
            case 6:
                if (continuation instanceof CoreFlowRealSheetState$awaitDismissalDragDisabled$$inlined$filter$1$2$1) {
                    coreFlowRealSheetState$awaitDismissalDragDisabled$$inlined$filter$1$2$1 = (CoreFlowRealSheetState$awaitDismissalDragDisabled$$inlined$filter$1$2$1) continuation;
                    int i38 = coreFlowRealSheetState$awaitDismissalDragDisabled$$inlined$filter$1$2$1.label;
                    if ((i38 & PKIFailureInfo.systemUnavail) != 0) {
                        coreFlowRealSheetState$awaitDismissalDragDisabled$$inlined$filter$1$2$1.label = i38 - PKIFailureInfo.systemUnavail;
                        Object obj8 = coreFlowRealSheetState$awaitDismissalDragDisabled$$inlined$filter$1$2$1.result;
                        CoroutineSingletons coroutineSingletons8 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i7 = coreFlowRealSheetState$awaitDismissalDragDisabled$$inlined$filter$1$2$1.label;
                        if (i7 != 0) {
                            SafeTrace.throwOnFailure(obj8);
                            if (((Boolean) obj).booleanValue()) {
                                coreFlowRealSheetState$awaitDismissalDragDisabled$$inlined$filter$1$2$1.label = 1;
                                if (flowCollector.emit(obj, coreFlowRealSheetState$awaitDismissalDragDisabled$$inlined$filter$1$2$1) == coroutineSingletons8) {
                                    break;
                                }
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
                coreFlowRealSheetState$awaitDismissalDragDisabled$$inlined$filter$1$2$1 = new CoreFlowRealSheetState$awaitDismissalDragDisabled$$inlined$filter$1$2$1(this, continuation);
                Object obj82 = coreFlowRealSheetState$awaitDismissalDragDisabled$$inlined$filter$1$2$1.result;
                CoroutineSingletons coroutineSingletons82 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i7 = coreFlowRealSheetState$awaitDismissalDragDisabled$$inlined$filter$1$2$1.label;
                if (i7 != 0) {
                }
            case 7:
                if (continuation instanceof CoreFlowRealSheetState$awaitDismissalDragEnabled$$inlined$mapNotNull$1$2$1) {
                    coreFlowRealSheetState$awaitDismissalDragEnabled$$inlined$mapNotNull$1$2$1 = (CoreFlowRealSheetState$awaitDismissalDragEnabled$$inlined$mapNotNull$1$2$1) continuation;
                    int i39 = coreFlowRealSheetState$awaitDismissalDragEnabled$$inlined$mapNotNull$1$2$1.label;
                    if ((i39 & PKIFailureInfo.systemUnavail) != 0) {
                        coreFlowRealSheetState$awaitDismissalDragEnabled$$inlined$mapNotNull$1$2$1.label = i39 - PKIFailureInfo.systemUnavail;
                        Object obj9 = coreFlowRealSheetState$awaitDismissalDragEnabled$$inlined$mapNotNull$1$2$1.result;
                        CoroutineSingletons coroutineSingletons9 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i8 = coreFlowRealSheetState$awaitDismissalDragEnabled$$inlined$mapNotNull$1$2$1.label;
                        if (i8 != 0) {
                            SafeTrace.throwOnFailure(obj9);
                            float positionOf = ((DefaultDraggableAnchors) obj).positionOf(CoreFlowSheetPosition.Hidden);
                            r9 = Math.abs(positionOf) <= Float.MAX_VALUE ? Float.valueOf(positionOf) : null;
                            if (r9 != null) {
                                coreFlowRealSheetState$awaitDismissalDragEnabled$$inlined$mapNotNull$1$2$1.label = 1;
                                if (flowCollector.emit(r9, coreFlowRealSheetState$awaitDismissalDragEnabled$$inlined$mapNotNull$1$2$1) == coroutineSingletons9) {
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
                coreFlowRealSheetState$awaitDismissalDragEnabled$$inlined$mapNotNull$1$2$1 = new CoreFlowRealSheetState$awaitDismissalDragEnabled$$inlined$mapNotNull$1$2$1(this, continuation);
                Object obj92 = coreFlowRealSheetState$awaitDismissalDragEnabled$$inlined$mapNotNull$1$2$1.result;
                CoroutineSingletons coroutineSingletons92 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i8 = coreFlowRealSheetState$awaitDismissalDragEnabled$$inlined$mapNotNull$1$2$1.label;
                if (i8 != 0) {
                }
            case 8:
                if (continuation instanceof AndroidPermissionChecker$create$1$denied$$inlined$map$1$2$1) {
                    androidPermissionChecker$create$1$denied$$inlined$map$1$2$1 = (AndroidPermissionChecker$create$1$denied$$inlined$map$1$2$1) continuation;
                    int i40 = androidPermissionChecker$create$1$denied$$inlined$map$1$2$1.label;
                    if ((i40 & PKIFailureInfo.systemUnavail) != 0) {
                        androidPermissionChecker$create$1$denied$$inlined$map$1$2$1.label = i40 - PKIFailureInfo.systemUnavail;
                        Object obj10 = androidPermissionChecker$create$1$denied$$inlined$map$1$2$1.result;
                        CoroutineSingletons coroutineSingletons10 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i9 = androidPermissionChecker$create$1$denied$$inlined$map$1$2$1.label;
                        if (i9 != 0) {
                            SafeTrace.throwOnFailure(obj10);
                            Unit unit = Unit.INSTANCE;
                            androidPermissionChecker$create$1$denied$$inlined$map$1$2$1.label = 1;
                            if (flowCollector.emit(unit, androidPermissionChecker$create$1$denied$$inlined$map$1$2$1) == coroutineSingletons10) {
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
                androidPermissionChecker$create$1$denied$$inlined$map$1$2$1 = new AndroidPermissionChecker$create$1$denied$$inlined$map$1$2$1(this, continuation);
                Object obj102 = androidPermissionChecker$create$1$denied$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons102 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i9 = androidPermissionChecker$create$1$denied$$inlined$map$1$2$1.label;
                if (i9 != 0) {
                }
            case 9:
                if (continuation instanceof PoolsRefresher$setup$1$2$invokeSuspend$$inlined$map$1$2$1) {
                    poolsRefresher$setup$1$2$invokeSuspend$$inlined$map$1$2$1 = (PoolsRefresher$setup$1$2$invokeSuspend$$inlined$map$1$2$1) continuation;
                    int i41 = poolsRefresher$setup$1$2$invokeSuspend$$inlined$map$1$2$1.label;
                    if ((i41 & PKIFailureInfo.systemUnavail) != 0) {
                        poolsRefresher$setup$1$2$invokeSuspend$$inlined$map$1$2$1.label = i41 - PKIFailureInfo.systemUnavail;
                        Object obj11 = poolsRefresher$setup$1$2$invokeSuspend$$inlined$map$1$2$1.result;
                        CoroutineSingletons coroutineSingletons11 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i10 = poolsRefresher$setup$1$2$invokeSuspend$$inlined$map$1$2$1.label;
                        if (i10 != 0) {
                            SafeTrace.throwOnFailure(obj11);
                            Boolean valueOf = Boolean.valueOf(((FeatureFlag$EnabledDisabledAmplitudeExperiment$Options) obj).enabled());
                            poolsRefresher$setup$1$2$invokeSuspend$$inlined$map$1$2$1.label = 1;
                            if (flowCollector.emit(valueOf, poolsRefresher$setup$1$2$invokeSuspend$$inlined$map$1$2$1) == coroutineSingletons11) {
                                break;
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
                poolsRefresher$setup$1$2$invokeSuspend$$inlined$map$1$2$1 = new PoolsRefresher$setup$1$2$invokeSuspend$$inlined$map$1$2$1(this, continuation);
                Object obj112 = poolsRefresher$setup$1$2$invokeSuspend$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons112 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i10 = poolsRefresher$setup$1$2$invokeSuspend$$inlined$map$1$2$1.label;
                if (i10 != 0) {
                }
            case 10:
                if (continuation instanceof PoolInvitePeopleListPresenter$models$lambda$12$$inlined$map$1$2$1) {
                    poolInvitePeopleListPresenter$models$lambda$12$$inlined$map$1$2$1 = (PoolInvitePeopleListPresenter$models$lambda$12$$inlined$map$1$2$1) continuation;
                    int i42 = poolInvitePeopleListPresenter$models$lambda$12$$inlined$map$1$2$1.label;
                    if ((i42 & PKIFailureInfo.systemUnavail) != 0) {
                        poolInvitePeopleListPresenter$models$lambda$12$$inlined$map$1$2$1.label = i42 - PKIFailureInfo.systemUnavail;
                        Object obj12 = poolInvitePeopleListPresenter$models$lambda$12$$inlined$map$1$2$1.result;
                        CoroutineSingletons coroutineSingletons12 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i11 = poolInvitePeopleListPresenter$models$lambda$12$$inlined$map$1$2$1.label;
                        if (i11 != 0) {
                            SafeTrace.throwOnFailure(obj12);
                            List list4 = ((RecipientRepository$Result) obj).sections;
                            poolInvitePeopleListPresenter$models$lambda$12$$inlined$map$1$2$1.label = 1;
                            if (flowCollector.emit(list4, poolInvitePeopleListPresenter$models$lambda$12$$inlined$map$1$2$1) == coroutineSingletons12) {
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
                poolInvitePeopleListPresenter$models$lambda$12$$inlined$map$1$2$1 = new PoolInvitePeopleListPresenter$models$lambda$12$$inlined$map$1$2$1(this, continuation);
                Object obj122 = poolInvitePeopleListPresenter$models$lambda$12$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons122 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i11 = poolInvitePeopleListPresenter$models$lambda$12$$inlined$map$1$2$1.label;
                if (i11 != 0) {
                }
            case 11:
                if (continuation instanceof RealInvestingCryptoGraphHeaderPresenter$special$$inlined$map$1$2$1) {
                    realInvestingCryptoGraphHeaderPresenter$special$$inlined$map$1$2$1 = (RealInvestingCryptoGraphHeaderPresenter$special$$inlined$map$1$2$1) continuation;
                    int i43 = realInvestingCryptoGraphHeaderPresenter$special$$inlined$map$1$2$1.label;
                    if ((i43 & PKIFailureInfo.systemUnavail) != 0) {
                        realInvestingCryptoGraphHeaderPresenter$special$$inlined$map$1$2$1.label = i43 - PKIFailureInfo.systemUnavail;
                        Object obj13 = realInvestingCryptoGraphHeaderPresenter$special$$inlined$map$1$2$1.result;
                        CoroutineSingletons coroutineSingletons13 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i12 = realInvestingCryptoGraphHeaderPresenter$special$$inlined$map$1$2$1.label;
                        if (i12 != 0) {
                            SafeTrace.throwOnFailure(obj13);
                            JurisdictionConfigManager$JurisdictionConfig jurisdictionConfigManager$JurisdictionConfig2 = (JurisdictionConfigManager$JurisdictionConfig) obj;
                            r9 = jurisdictionConfigManager$JurisdictionConfig2 != null ? jurisdictionConfigManager$JurisdictionConfig2.defaultCurrency : null;
                            realInvestingCryptoGraphHeaderPresenter$special$$inlined$map$1$2$1.label = 1;
                            if (flowCollector.emit(r9, realInvestingCryptoGraphHeaderPresenter$special$$inlined$map$1$2$1) == coroutineSingletons13) {
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
                realInvestingCryptoGraphHeaderPresenter$special$$inlined$map$1$2$1 = new RealInvestingCryptoGraphHeaderPresenter$special$$inlined$map$1$2$1(this, continuation);
                Object obj132 = realInvestingCryptoGraphHeaderPresenter$special$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons132 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i12 = realInvestingCryptoGraphHeaderPresenter$special$$inlined$map$1$2$1.label;
                if (i12 != 0) {
                }
            case 12:
                if (continuation instanceof PrepurchaseCashCardPlanningPresenter$models$lambda$0$$inlined$map$1$2$1) {
                    prepurchaseCashCardPlanningPresenter$models$lambda$0$$inlined$map$1$2$1 = (PrepurchaseCashCardPlanningPresenter$models$lambda$0$$inlined$map$1$2$1) continuation;
                    int i44 = prepurchaseCashCardPlanningPresenter$models$lambda$0$$inlined$map$1$2$1.label;
                    if ((i44 & PKIFailureInfo.systemUnavail) != 0) {
                        prepurchaseCashCardPlanningPresenter$models$lambda$0$$inlined$map$1$2$1.label = i44 - PKIFailureInfo.systemUnavail;
                        Object obj14 = prepurchaseCashCardPlanningPresenter$models$lambda$0$$inlined$map$1$2$1.result;
                        CoroutineSingletons coroutineSingletons14 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i13 = prepurchaseCashCardPlanningPresenter$models$lambda$0$$inlined$map$1$2$1.label;
                        if (i13 != 0) {
                            SafeTrace.throwOnFailure(obj14);
                            PrepurchaseCashCardAppletSyncData prepurchaseCashCardAppletSyncData = (PrepurchaseCashCardAppletSyncData) obj;
                            if (prepurchaseCashCardAppletSyncData != null) {
                                List list5 = prepurchaseCashCardAppletSyncData.alternative_locale_applet_data_list;
                                PrepurchaseCashCardAppletData prepurchaseCashCardAppletData = prepurchaseCashCardAppletSyncData.applet_data;
                                prepurchaseCashCardAppletData.getClass();
                                r9 = CollectionsKt.plus((Collection) list5, (Object) prepurchaseCashCardAppletData);
                            }
                            prepurchaseCashCardPlanningPresenter$models$lambda$0$$inlined$map$1$2$1.label = 1;
                            if (flowCollector.emit(r9, prepurchaseCashCardPlanningPresenter$models$lambda$0$$inlined$map$1$2$1) == coroutineSingletons14) {
                                break;
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
                prepurchaseCashCardPlanningPresenter$models$lambda$0$$inlined$map$1$2$1 = new PrepurchaseCashCardPlanningPresenter$models$lambda$0$$inlined$map$1$2$1(this, continuation);
                Object obj142 = prepurchaseCashCardPlanningPresenter$models$lambda$0$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons142 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i13 = prepurchaseCashCardPlanningPresenter$models$lambda$0$$inlined$map$1$2$1.label;
                if (i13 != 0) {
                }
            case 13:
                if (continuation instanceof DeviceManagerDeviceDetailsPresenter$models$1$1$invokeSuspend$$inlined$filterIsInstance$1$2$1) {
                    deviceManagerDeviceDetailsPresenter$models$1$1$invokeSuspend$$inlined$filterIsInstance$1$2$1 = (DeviceManagerDeviceDetailsPresenter$models$1$1$invokeSuspend$$inlined$filterIsInstance$1$2$1) continuation;
                    int i45 = deviceManagerDeviceDetailsPresenter$models$1$1$invokeSuspend$$inlined$filterIsInstance$1$2$1.label;
                    if ((i45 & PKIFailureInfo.systemUnavail) != 0) {
                        deviceManagerDeviceDetailsPresenter$models$1$1$invokeSuspend$$inlined$filterIsInstance$1$2$1.label = i45 - PKIFailureInfo.systemUnavail;
                        Object obj15 = deviceManagerDeviceDetailsPresenter$models$1$1$invokeSuspend$$inlined$filterIsInstance$1$2$1.result;
                        CoroutineSingletons coroutineSingletons15 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i14 = deviceManagerDeviceDetailsPresenter$models$1$1$invokeSuspend$$inlined$filterIsInstance$1$2$1.label;
                        if (i14 != 0) {
                            SafeTrace.throwOnFailure(obj15);
                            if (obj instanceof DataLoadingState.DataLoaded) {
                                deviceManagerDeviceDetailsPresenter$models$1$1$invokeSuspend$$inlined$filterIsInstance$1$2$1.label = 1;
                                if (flowCollector.emit(obj, deviceManagerDeviceDetailsPresenter$models$1$1$invokeSuspend$$inlined$filterIsInstance$1$2$1) == coroutineSingletons15) {
                                    break;
                                }
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
                deviceManagerDeviceDetailsPresenter$models$1$1$invokeSuspend$$inlined$filterIsInstance$1$2$1 = new DeviceManagerDeviceDetailsPresenter$models$1$1$invokeSuspend$$inlined$filterIsInstance$1$2$1(this, continuation);
                Object obj152 = deviceManagerDeviceDetailsPresenter$models$1$1$invokeSuspend$$inlined$filterIsInstance$1$2$1.result;
                CoroutineSingletons coroutineSingletons152 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i14 = deviceManagerDeviceDetailsPresenter$models$1$1$invokeSuspend$$inlined$filterIsInstance$1$2$1.label;
                if (i14 != 0) {
                }
            case 14:
                if (continuation instanceof DeviceManagerDeviceDetailsPresenter$models$1$1$invokeSuspend$$inlined$map$1$2$1) {
                    deviceManagerDeviceDetailsPresenter$models$1$1$invokeSuspend$$inlined$map$1$2$1 = (DeviceManagerDeviceDetailsPresenter$models$1$1$invokeSuspend$$inlined$map$1$2$1) continuation;
                    int i46 = deviceManagerDeviceDetailsPresenter$models$1$1$invokeSuspend$$inlined$map$1$2$1.label;
                    if ((i46 & PKIFailureInfo.systemUnavail) != 0) {
                        deviceManagerDeviceDetailsPresenter$models$1$1$invokeSuspend$$inlined$map$1$2$1.label = i46 - PKIFailureInfo.systemUnavail;
                        Object obj16 = deviceManagerDeviceDetailsPresenter$models$1$1$invokeSuspend$$inlined$map$1$2$1.result;
                        CoroutineSingletons coroutineSingletons16 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i15 = deviceManagerDeviceDetailsPresenter$models$1$1$invokeSuspend$$inlined$map$1$2$1.label;
                        if (i15 != 0) {
                            SafeTrace.throwOnFailure(obj16);
                            Object obj17 = ((DataLoadingState.DataLoaded) obj).data;
                            deviceManagerDeviceDetailsPresenter$models$1$1$invokeSuspend$$inlined$map$1$2$1.label = 1;
                            if (flowCollector.emit(obj17, deviceManagerDeviceDetailsPresenter$models$1$1$invokeSuspend$$inlined$map$1$2$1) == coroutineSingletons16) {
                                break;
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
                deviceManagerDeviceDetailsPresenter$models$1$1$invokeSuspend$$inlined$map$1$2$1 = new DeviceManagerDeviceDetailsPresenter$models$1$1$invokeSuspend$$inlined$map$1$2$1(this, continuation);
                Object obj162 = deviceManagerDeviceDetailsPresenter$models$1$1$invokeSuspend$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons162 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i15 = deviceManagerDeviceDetailsPresenter$models$1$1$invokeSuspend$$inlined$map$1$2$1.label;
                if (i15 != 0) {
                }
            case 15:
                if (continuation instanceof IncomingRequestsPresenter$models$1$1$invokeSuspend$$inlined$map$1$2$1) {
                    incomingRequestsPresenter$models$1$1$invokeSuspend$$inlined$map$1$2$1 = (IncomingRequestsPresenter$models$1$1$invokeSuspend$$inlined$map$1$2$1) continuation;
                    int i47 = incomingRequestsPresenter$models$1$1$invokeSuspend$$inlined$map$1$2$1.label;
                    if ((i47 & PKIFailureInfo.systemUnavail) != 0) {
                        incomingRequestsPresenter$models$1$1$invokeSuspend$$inlined$map$1$2$1.label = i47 - PKIFailureInfo.systemUnavail;
                        Object obj18 = incomingRequestsPresenter$models$1$1$invokeSuspend$$inlined$map$1$2$1.result;
                        CoroutineSingletons coroutineSingletons17 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i16 = incomingRequestsPresenter$models$1$1$invokeSuspend$$inlined$map$1$2$1.label;
                        if (i16 != 0) {
                            SafeTrace.throwOnFailure(obj18);
                            IncomingRequestPolicy incomingRequestPolicy = ((P2pSettingsManager$P2pSettings) obj).incomingRequestPolicy;
                            if (incomingRequestPolicy == null) {
                                incomingRequestPolicy = IncomingRequestPolicy.ALLOW_ALL;
                            }
                            incomingRequestsPresenter$models$1$1$invokeSuspend$$inlined$map$1$2$1.label = 1;
                            if (flowCollector.emit(incomingRequestPolicy, incomingRequestsPresenter$models$1$1$invokeSuspend$$inlined$map$1$2$1) == coroutineSingletons17) {
                                break;
                            }
                        } else if (i16 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj18);
                        }
                        break;
                    }
                }
                incomingRequestsPresenter$models$1$1$invokeSuspend$$inlined$map$1$2$1 = new IncomingRequestsPresenter$models$1$1$invokeSuspend$$inlined$map$1$2$1(this, continuation);
                Object obj182 = incomingRequestsPresenter$models$1$1$invokeSuspend$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons172 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i16 = incomingRequestsPresenter$models$1$1$invokeSuspend$$inlined$map$1$2$1.label;
                if (i16 != 0) {
                }
            case 16:
                if (continuation instanceof ProfileCashtagRequiredPresenter$models$lambda$1$$inlined$map$1$2$1) {
                    profileCashtagRequiredPresenter$models$lambda$1$$inlined$map$1$2$1 = (ProfileCashtagRequiredPresenter$models$lambda$1$$inlined$map$1$2$1) continuation;
                    int i48 = profileCashtagRequiredPresenter$models$lambda$1$$inlined$map$1$2$1.label;
                    if ((i48 & PKIFailureInfo.systemUnavail) != 0) {
                        profileCashtagRequiredPresenter$models$lambda$1$$inlined$map$1$2$1.label = i48 - PKIFailureInfo.systemUnavail;
                        Object obj19 = profileCashtagRequiredPresenter$models$lambda$1$$inlined$map$1$2$1.result;
                        CoroutineSingletons coroutineSingletons18 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i17 = profileCashtagRequiredPresenter$models$lambda$1$$inlined$map$1$2$1.label;
                        if (i17 != 0) {
                            SafeTrace.throwOnFailure(obj19);
                            JurisdictionConfigManager$JurisdictionConfig jurisdictionConfigManager$JurisdictionConfig3 = (JurisdictionConfigManager$JurisdictionConfig) obj;
                            String symbol = (jurisdictionConfigManager$JurisdictionConfig3 == null || (currencyCode = jurisdictionConfigManager$JurisdictionConfig3.defaultCurrency) == null) ? "" : Moneys.symbol(currencyCode);
                            profileCashtagRequiredPresenter$models$lambda$1$$inlined$map$1$2$1.label = 1;
                            if (flowCollector.emit(symbol, profileCashtagRequiredPresenter$models$lambda$1$$inlined$map$1$2$1) == coroutineSingletons18) {
                                break;
                            }
                        } else if (i17 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj19);
                        }
                        break;
                    }
                }
                profileCashtagRequiredPresenter$models$lambda$1$$inlined$map$1$2$1 = new ProfileCashtagRequiredPresenter$models$lambda$1$$inlined$map$1$2$1(this, continuation);
                Object obj192 = profileCashtagRequiredPresenter$models$lambda$1$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons182 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i17 = profileCashtagRequiredPresenter$models$lambda$1$$inlined$map$1$2$1.label;
                if (i17 != 0) {
                }
                break;
            case 17:
                if (continuation instanceof ProfileConfirmSignOutPresenter$models$lambda$1$$inlined$map$1$2$1) {
                    profileConfirmSignOutPresenter$models$lambda$1$$inlined$map$1$2$1 = (ProfileConfirmSignOutPresenter$models$lambda$1$$inlined$map$1$2$1) continuation;
                    int i49 = profileConfirmSignOutPresenter$models$lambda$1$$inlined$map$1$2$1.label;
                    if ((i49 & PKIFailureInfo.systemUnavail) != 0) {
                        profileConfirmSignOutPresenter$models$lambda$1$$inlined$map$1$2$1.label = i49 - PKIFailureInfo.systemUnavail;
                        Object obj20 = profileConfirmSignOutPresenter$models$lambda$1$$inlined$map$1$2$1.result;
                        CoroutineSingletons coroutineSingletons19 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i18 = profileConfirmSignOutPresenter$models$lambda$1$$inlined$map$1$2$1.label;
                        if (i18 != 0) {
                            SafeTrace.throwOnFailure(obj20);
                            Integer num = new Integer(((Boolean) obj).booleanValue() ? R.string.profile_sign_out_message_pending : R.string.profile_sign_out_message);
                            profileConfirmSignOutPresenter$models$lambda$1$$inlined$map$1$2$1.label = 1;
                            if (flowCollector.emit(num, profileConfirmSignOutPresenter$models$lambda$1$$inlined$map$1$2$1) == coroutineSingletons19) {
                                break;
                            }
                        } else if (i18 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj20);
                        }
                        break;
                    }
                }
                profileConfirmSignOutPresenter$models$lambda$1$$inlined$map$1$2$1 = new ProfileConfirmSignOutPresenter$models$lambda$1$$inlined$map$1$2$1(this, continuation);
                Object obj202 = profileConfirmSignOutPresenter$models$lambda$1$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons192 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i18 = profileConfirmSignOutPresenter$models$lambda$1$$inlined$map$1$2$1.label;
                if (i18 != 0) {
                }
            case 18:
                if (continuation instanceof ProfilePresenter$genericProfileElementsPresenter$lambda$0$$inlined$mapNotNull$1$2$1) {
                    profilePresenter$genericProfileElementsPresenter$lambda$0$$inlined$mapNotNull$1$2$1 = (ProfilePresenter$genericProfileElementsPresenter$lambda$0$$inlined$mapNotNull$1$2$1) continuation;
                    int i50 = profilePresenter$genericProfileElementsPresenter$lambda$0$$inlined$mapNotNull$1$2$1.label;
                    if ((i50 & PKIFailureInfo.systemUnavail) != 0) {
                        profilePresenter$genericProfileElementsPresenter$lambda$0$$inlined$mapNotNull$1$2$1.label = i50 - PKIFailureInfo.systemUnavail;
                        Object obj21 = profilePresenter$genericProfileElementsPresenter$lambda$0$$inlined$mapNotNull$1$2$1.result;
                        CoroutineSingletons coroutineSingletons20 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i19 = profilePresenter$genericProfileElementsPresenter$lambda$0$$inlined$mapNotNull$1$2$1.label;
                        if (i19 != 0) {
                            SafeTrace.throwOnFailure(obj21);
                            AsyncResult asyncResult = (AsyncResult) obj;
                            if (asyncResult != null) {
                                profilePresenter$genericProfileElementsPresenter$lambda$0$$inlined$mapNotNull$1$2$1.label = 1;
                                if (flowCollector.emit(asyncResult, profilePresenter$genericProfileElementsPresenter$lambda$0$$inlined$mapNotNull$1$2$1) == coroutineSingletons20) {
                                    break;
                                }
                            }
                        } else if (i19 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj21);
                        }
                        break;
                    }
                }
                profilePresenter$genericProfileElementsPresenter$lambda$0$$inlined$mapNotNull$1$2$1 = new ProfilePresenter$genericProfileElementsPresenter$lambda$0$$inlined$mapNotNull$1$2$1(this, continuation);
                Object obj212 = profilePresenter$genericProfileElementsPresenter$lambda$0$$inlined$mapNotNull$1$2$1.result;
                CoroutineSingletons coroutineSingletons202 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i19 = profilePresenter$genericProfileElementsPresenter$lambda$0$$inlined$mapNotNull$1$2$1.label;
                if (i19 != 0) {
                }
            case 19:
                if (continuation instanceof ProfilePresenter$models$lambda$13$$inlined$filterIsInstance$1$2$1) {
                    profilePresenter$models$lambda$13$$inlined$filterIsInstance$1$2$1 = (ProfilePresenter$models$lambda$13$$inlined$filterIsInstance$1$2$1) continuation;
                    int i51 = profilePresenter$models$lambda$13$$inlined$filterIsInstance$1$2$1.label;
                    if ((i51 & PKIFailureInfo.systemUnavail) != 0) {
                        profilePresenter$models$lambda$13$$inlined$filterIsInstance$1$2$1.label = i51 - PKIFailureInfo.systemUnavail;
                        Object obj23 = profilePresenter$models$lambda$13$$inlined$filterIsInstance$1$2$1.result;
                        CoroutineSingletons coroutineSingletons21 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i20 = profilePresenter$models$lambda$13$$inlined$filterIsInstance$1$2$1.label;
                        if (i20 != 0) {
                            SafeTrace.throwOnFailure(obj23);
                            if (obj instanceof ProfileViewEvent.GenericProfileElementsViewEventWrapper) {
                                profilePresenter$models$lambda$13$$inlined$filterIsInstance$1$2$1.label = 1;
                                if (flowCollector.emit(obj, profilePresenter$models$lambda$13$$inlined$filterIsInstance$1$2$1) == coroutineSingletons21) {
                                    break;
                                }
                            }
                        } else if (i20 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj23);
                        }
                        break;
                    }
                }
                profilePresenter$models$lambda$13$$inlined$filterIsInstance$1$2$1 = new ProfilePresenter$models$lambda$13$$inlined$filterIsInstance$1$2$1(this, continuation);
                Object obj232 = profilePresenter$models$lambda$13$$inlined$filterIsInstance$1$2$1.result;
                CoroutineSingletons coroutineSingletons212 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i20 = profilePresenter$models$lambda$13$$inlined$filterIsInstance$1$2$1.label;
                if (i20 != 0) {
                }
            case 20:
                if (continuation instanceof ProfilePresenter$models$lambda$13$$inlined$map$1$2$1) {
                    profilePresenter$models$lambda$13$$inlined$map$1$2$1 = (ProfilePresenter$models$lambda$13$$inlined$map$1$2$1) continuation;
                    int i52 = profilePresenter$models$lambda$13$$inlined$map$1$2$1.label;
                    if ((i52 & PKIFailureInfo.systemUnavail) != 0) {
                        profilePresenter$models$lambda$13$$inlined$map$1$2$1.label = i52 - PKIFailureInfo.systemUnavail;
                        Object obj24 = profilePresenter$models$lambda$13$$inlined$map$1$2$1.result;
                        CoroutineSingletons coroutineSingletons22 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i21 = profilePresenter$models$lambda$13$$inlined$map$1$2$1.label;
                        if (i21 != 0) {
                            SafeTrace.throwOnFailure(obj24);
                            GenericProfileElementsViewEvent genericProfileElementsViewEvent = ((ProfileViewEvent.GenericProfileElementsViewEventWrapper) obj).event;
                            profilePresenter$models$lambda$13$$inlined$map$1$2$1.label = 1;
                            if (flowCollector.emit(genericProfileElementsViewEvent, profilePresenter$models$lambda$13$$inlined$map$1$2$1) == coroutineSingletons22) {
                                break;
                            }
                        } else if (i21 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj24);
                        }
                        break;
                    }
                }
                profilePresenter$models$lambda$13$$inlined$map$1$2$1 = new ProfilePresenter$models$lambda$13$$inlined$map$1$2$1(this, continuation);
                Object obj242 = profilePresenter$models$lambda$13$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons222 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i21 = profilePresenter$models$lambda$13$$inlined$map$1$2$1.label;
                if (i21 != 0) {
                }
            case 21:
                if (continuation instanceof ProfilePresenter$models$lambda$2$$inlined$map$1$2$1) {
                    profilePresenter$models$lambda$2$$inlined$map$1$2$1 = (ProfilePresenter$models$lambda$2$$inlined$map$1$2$1) continuation;
                    int i53 = profilePresenter$models$lambda$2$$inlined$map$1$2$1.label;
                    if ((i53 & PKIFailureInfo.systemUnavail) != 0) {
                        profilePresenter$models$lambda$2$$inlined$map$1$2$1.label = i53 - PKIFailureInfo.systemUnavail;
                        Object obj25 = profilePresenter$models$lambda$2$$inlined$map$1$2$1.result;
                        CoroutineSingletons coroutineSingletons23 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i22 = profilePresenter$models$lambda$2$$inlined$map$1$2$1.label;
                        if (i22 != 0) {
                            SafeTrace.throwOnFailure(obj25);
                            JurisdictionConfigManager$JurisdictionConfig jurisdictionConfigManager$JurisdictionConfig4 = (JurisdictionConfigManager$JurisdictionConfig) obj;
                            r9 = jurisdictionConfigManager$JurisdictionConfig4 != null ? jurisdictionConfigManager$JurisdictionConfig4.defaultCurrency : null;
                            profilePresenter$models$lambda$2$$inlined$map$1$2$1.label = 1;
                            if (flowCollector.emit(r9, profilePresenter$models$lambda$2$$inlined$map$1$2$1) == coroutineSingletons23) {
                                break;
                            }
                        } else if (i22 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj25);
                        }
                        break;
                    }
                }
                profilePresenter$models$lambda$2$$inlined$map$1$2$1 = new ProfilePresenter$models$lambda$2$$inlined$map$1$2$1(this, continuation);
                Object obj252 = profilePresenter$models$lambda$2$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons232 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i22 = profilePresenter$models$lambda$2$$inlined$map$1$2$1.label;
                if (i22 != 0) {
                }
            case 22:
                if (continuation instanceof ProfilePrivacyPresenter$emitAnalyticsEvents$lambda$0$$inlined$filter$1$2$1) {
                    profilePrivacyPresenter$emitAnalyticsEvents$lambda$0$$inlined$filter$1$2$1 = (ProfilePrivacyPresenter$emitAnalyticsEvents$lambda$0$$inlined$filter$1$2$1) continuation;
                    int i54 = profilePrivacyPresenter$emitAnalyticsEvents$lambda$0$$inlined$filter$1$2$1.label;
                    if ((i54 & PKIFailureInfo.systemUnavail) != 0) {
                        profilePrivacyPresenter$emitAnalyticsEvents$lambda$0$$inlined$filter$1$2$1.label = i54 - PKIFailureInfo.systemUnavail;
                        Object obj26 = profilePrivacyPresenter$emitAnalyticsEvents$lambda$0$$inlined$filter$1$2$1.result;
                        CoroutineSingletons coroutineSingletons24 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i23 = profilePrivacyPresenter$emitAnalyticsEvents$lambda$0$$inlined$filter$1$2$1.label;
                        if (i23 != 0) {
                            SafeTrace.throwOnFailure(obj26);
                            if (((Boolean) obj).booleanValue()) {
                                profilePrivacyPresenter$emitAnalyticsEvents$lambda$0$$inlined$filter$1$2$1.label = 1;
                                if (flowCollector.emit(obj, profilePrivacyPresenter$emitAnalyticsEvents$lambda$0$$inlined$filter$1$2$1) == coroutineSingletons24) {
                                    break;
                                }
                            }
                        } else if (i23 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj26);
                        }
                        break;
                    }
                }
                profilePrivacyPresenter$emitAnalyticsEvents$lambda$0$$inlined$filter$1$2$1 = new ProfilePrivacyPresenter$emitAnalyticsEvents$lambda$0$$inlined$filter$1$2$1(this, continuation);
                Object obj262 = profilePrivacyPresenter$emitAnalyticsEvents$lambda$0$$inlined$filter$1$2$1.result;
                CoroutineSingletons coroutineSingletons242 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i23 = profilePrivacyPresenter$emitAnalyticsEvents$lambda$0$$inlined$filter$1$2$1.label;
                if (i23 != 0) {
                }
            case 23:
                if (continuation instanceof ProfilePrivacyPresenter$emitAnalyticsEvents$lambda$0$$inlined$map$1$2$1) {
                    profilePrivacyPresenter$emitAnalyticsEvents$lambda$0$$inlined$map$1$2$1 = (ProfilePrivacyPresenter$emitAnalyticsEvents$lambda$0$$inlined$map$1$2$1) continuation;
                    int i55 = profilePrivacyPresenter$emitAnalyticsEvents$lambda$0$$inlined$map$1$2$1.label;
                    if ((i55 & PKIFailureInfo.systemUnavail) != 0) {
                        profilePrivacyPresenter$emitAnalyticsEvents$lambda$0$$inlined$map$1$2$1.label = i55 - PKIFailureInfo.systemUnavail;
                        Object obj27 = profilePrivacyPresenter$emitAnalyticsEvents$lambda$0$$inlined$map$1$2$1.result;
                        CoroutineSingletons coroutineSingletons25 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i24 = profilePrivacyPresenter$emitAnalyticsEvents$lambda$0$$inlined$map$1$2$1.label;
                        if (i24 != 0) {
                            SafeTrace.throwOnFailure(obj27);
                            Boolean bool = Boolean.FALSE;
                            profilePrivacyPresenter$emitAnalyticsEvents$lambda$0$$inlined$map$1$2$1.label = 1;
                            if (flowCollector.emit(bool, profilePrivacyPresenter$emitAnalyticsEvents$lambda$0$$inlined$map$1$2$1) == coroutineSingletons25) {
                                break;
                            }
                        } else if (i24 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj27);
                        }
                        break;
                    }
                }
                profilePrivacyPresenter$emitAnalyticsEvents$lambda$0$$inlined$map$1$2$1 = new ProfilePrivacyPresenter$emitAnalyticsEvents$lambda$0$$inlined$map$1$2$1(this, continuation);
                Object obj272 = profilePrivacyPresenter$emitAnalyticsEvents$lambda$0$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons252 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i24 = profilePrivacyPresenter$emitAnalyticsEvents$lambda$0$$inlined$map$1$2$1.label;
                if (i24 != 0) {
                }
            case 24:
                if (continuation instanceof ProfilePrivacyPresenter$models$1$1$invokeSuspend$$inlined$map$1$2$1) {
                    profilePrivacyPresenter$models$1$1$invokeSuspend$$inlined$map$1$2$1 = (ProfilePrivacyPresenter$models$1$1$invokeSuspend$$inlined$map$1$2$1) continuation;
                    int i56 = profilePrivacyPresenter$models$1$1$invokeSuspend$$inlined$map$1$2$1.label;
                    if ((i56 & PKIFailureInfo.systemUnavail) != 0) {
                        profilePrivacyPresenter$models$1$1$invokeSuspend$$inlined$map$1$2$1.label = i56 - PKIFailureInfo.systemUnavail;
                        Object obj28 = profilePrivacyPresenter$models$1$1$invokeSuspend$$inlined$map$1$2$1.result;
                        CoroutineSingletons coroutineSingletons26 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i25 = profilePrivacyPresenter$models$1$1$invokeSuspend$$inlined$map$1$2$1.label;
                        if (i25 != 0) {
                            SafeTrace.throwOnFailure(obj28);
                            IncomingRequestPolicy incomingRequestPolicy2 = ((P2pSettingsManager$P2pSettings) obj).incomingRequestPolicy;
                            if (incomingRequestPolicy2 == null) {
                                incomingRequestPolicy2 = IncomingRequestPolicy.ALLOW_ALL;
                            }
                            ProfilePrivacyReadyViewModel$ProfileSecurityPolicy.RenderedPolicy renderedPolicy = new ProfilePrivacyReadyViewModel$ProfileSecurityPolicy.RenderedPolicy(incomingRequestPolicy2);
                            profilePrivacyPresenter$models$1$1$invokeSuspend$$inlined$map$1$2$1.label = 1;
                            if (flowCollector.emit(renderedPolicy, profilePrivacyPresenter$models$1$1$invokeSuspend$$inlined$map$1$2$1) == coroutineSingletons26) {
                                break;
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
                profilePrivacyPresenter$models$1$1$invokeSuspend$$inlined$map$1$2$1 = new ProfilePrivacyPresenter$models$1$1$invokeSuspend$$inlined$map$1$2$1(this, continuation);
                Object obj282 = profilePrivacyPresenter$models$1$1$invokeSuspend$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons262 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i25 = profilePrivacyPresenter$models$1$1$invokeSuspend$$inlined$map$1$2$1.label;
                if (i25 != 0) {
                }
            case 25:
                if (continuation instanceof ProfilePrivacyPresenter$models$lambda$15$$inlined$filterIsInstance$1$2$1) {
                    profilePrivacyPresenter$models$lambda$15$$inlined$filterIsInstance$1$2$1 = (ProfilePrivacyPresenter$models$lambda$15$$inlined$filterIsInstance$1$2$1) continuation;
                    int i57 = profilePrivacyPresenter$models$lambda$15$$inlined$filterIsInstance$1$2$1.label;
                    if ((i57 & PKIFailureInfo.systemUnavail) != 0) {
                        profilePrivacyPresenter$models$lambda$15$$inlined$filterIsInstance$1$2$1.label = i57 - PKIFailureInfo.systemUnavail;
                        Object obj29 = profilePrivacyPresenter$models$lambda$15$$inlined$filterIsInstance$1$2$1.result;
                        CoroutineSingletons coroutineSingletons27 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i26 = profilePrivacyPresenter$models$lambda$15$$inlined$filterIsInstance$1$2$1.label;
                        if (i26 != 0) {
                            SafeTrace.throwOnFailure(obj29);
                            if (obj instanceof ProfilePrivacyViewEvent.ToggleCashMeUrlSetting) {
                                profilePrivacyPresenter$models$lambda$15$$inlined$filterIsInstance$1$2$1.label = 1;
                                if (flowCollector.emit(obj, profilePrivacyPresenter$models$lambda$15$$inlined$filterIsInstance$1$2$1) == coroutineSingletons27) {
                                    break;
                                }
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
                profilePrivacyPresenter$models$lambda$15$$inlined$filterIsInstance$1$2$1 = new ProfilePrivacyPresenter$models$lambda$15$$inlined$filterIsInstance$1$2$1(this, continuation);
                Object obj292 = profilePrivacyPresenter$models$lambda$15$$inlined$filterIsInstance$1$2$1.result;
                CoroutineSingletons coroutineSingletons272 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i26 = profilePrivacyPresenter$models$lambda$15$$inlined$filterIsInstance$1$2$1.label;
                if (i26 != 0) {
                }
            case 26:
                if (continuation instanceof ProfilePrivacyPresenter$models$lambda$4$$inlined$map$1$2$1) {
                    profilePrivacyPresenter$models$lambda$4$$inlined$map$1$2$1 = (ProfilePrivacyPresenter$models$lambda$4$$inlined$map$1$2$1) continuation;
                    int i58 = profilePrivacyPresenter$models$lambda$4$$inlined$map$1$2$1.label;
                    if ((i58 & PKIFailureInfo.systemUnavail) != 0) {
                        profilePrivacyPresenter$models$lambda$4$$inlined$map$1$2$1.label = i58 - PKIFailureInfo.systemUnavail;
                        Object obj30 = profilePrivacyPresenter$models$lambda$4$$inlined$map$1$2$1.result;
                        CoroutineSingletons coroutineSingletons28 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i27 = profilePrivacyPresenter$models$lambda$4$$inlined$map$1$2$1.label;
                        if (i27 != 0) {
                            SafeTrace.throwOnFailure(obj30);
                            profilePrivacyPresenter$models$lambda$4$$inlined$map$1$2$1.label = 1;
                            if (flowCollector.emit((PublicProfile) obj, profilePrivacyPresenter$models$lambda$4$$inlined$map$1$2$1) == coroutineSingletons28) {
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
                profilePrivacyPresenter$models$lambda$4$$inlined$map$1$2$1 = new ProfilePrivacyPresenter$models$lambda$4$$inlined$map$1$2$1(this, continuation);
                Object obj302 = profilePrivacyPresenter$models$lambda$4$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons282 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i27 = profilePrivacyPresenter$models$lambda$4$$inlined$map$1$2$1.label;
                if (i27 != 0) {
                }
            case 27:
                if (continuation instanceof ProfilePrivacyPresenter$models$lambda$6$$inlined$filterIsInstance$1$2$1) {
                    profilePrivacyPresenter$models$lambda$6$$inlined$filterIsInstance$1$2$1 = (ProfilePrivacyPresenter$models$lambda$6$$inlined$filterIsInstance$1$2$1) continuation;
                    int i59 = profilePrivacyPresenter$models$lambda$6$$inlined$filterIsInstance$1$2$1.label;
                    if ((i59 & PKIFailureInfo.systemUnavail) != 0) {
                        profilePrivacyPresenter$models$lambda$6$$inlined$filterIsInstance$1$2$1.label = i59 - PKIFailureInfo.systemUnavail;
                        Object obj31 = profilePrivacyPresenter$models$lambda$6$$inlined$filterIsInstance$1$2$1.result;
                        CoroutineSingletons coroutineSingletons29 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i28 = profilePrivacyPresenter$models$lambda$6$$inlined$filterIsInstance$1$2$1.label;
                        if (i28 != 0) {
                            SafeTrace.throwOnFailure(obj31);
                            if (obj instanceof ProfilePrivacyViewEvent.BlockedAccountsEvent) {
                                profilePrivacyPresenter$models$lambda$6$$inlined$filterIsInstance$1$2$1.label = 1;
                                if (flowCollector.emit(obj, profilePrivacyPresenter$models$lambda$6$$inlined$filterIsInstance$1$2$1) == coroutineSingletons29) {
                                    break;
                                }
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
                profilePrivacyPresenter$models$lambda$6$$inlined$filterIsInstance$1$2$1 = new ProfilePrivacyPresenter$models$lambda$6$$inlined$filterIsInstance$1$2$1(this, continuation);
                Object obj312 = profilePrivacyPresenter$models$lambda$6$$inlined$filterIsInstance$1$2$1.result;
                CoroutineSingletons coroutineSingletons292 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i28 = profilePrivacyPresenter$models$lambda$6$$inlined$filterIsInstance$1$2$1.label;
                if (i28 != 0) {
                }
            case 28:
                if (continuation instanceof ProfilePrivacyPresenter$models$lambda$6$$inlined$map$1$2$1) {
                    profilePrivacyPresenter$models$lambda$6$$inlined$map$1$2$1 = (ProfilePrivacyPresenter$models$lambda$6$$inlined$map$1$2$1) continuation;
                    int i60 = profilePrivacyPresenter$models$lambda$6$$inlined$map$1$2$1.label;
                    if ((i60 & PKIFailureInfo.systemUnavail) != 0) {
                        profilePrivacyPresenter$models$lambda$6$$inlined$map$1$2$1.label = i60 - PKIFailureInfo.systemUnavail;
                        Object obj33 = profilePrivacyPresenter$models$lambda$6$$inlined$map$1$2$1.result;
                        CoroutineSingletons coroutineSingletons30 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i29 = profilePrivacyPresenter$models$lambda$6$$inlined$map$1$2$1.label;
                        if (i29 != 0) {
                            SafeTrace.throwOnFailure(obj33);
                            BlockedAccountsSectionViewEvent$TapViewAll blockedAccountsSectionViewEvent$TapViewAll = ((ProfilePrivacyViewEvent.BlockedAccountsEvent) obj).event;
                            profilePrivacyPresenter$models$lambda$6$$inlined$map$1$2$1.label = 1;
                            if (flowCollector.emit(blockedAccountsSectionViewEvent$TapViewAll, profilePrivacyPresenter$models$lambda$6$$inlined$map$1$2$1) == coroutineSingletons30) {
                                break;
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
                profilePrivacyPresenter$models$lambda$6$$inlined$map$1$2$1 = new ProfilePrivacyPresenter$models$lambda$6$$inlined$map$1$2$1(this, continuation);
                Object obj332 = profilePrivacyPresenter$models$lambda$6$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons302 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i29 = profilePrivacyPresenter$models$lambda$6$$inlined$map$1$2$1.label;
                if (i29 != 0) {
                }
            default:
                if (continuation instanceof ProfilePrivacyPresenter$models$lambda$7$$inlined$filterIsInstance$1$2$1) {
                    profilePrivacyPresenter$models$lambda$7$$inlined$filterIsInstance$1$2$1 = (ProfilePrivacyPresenter$models$lambda$7$$inlined$filterIsInstance$1$2$1) continuation;
                    int i61 = profilePrivacyPresenter$models$lambda$7$$inlined$filterIsInstance$1$2$1.label;
                    if ((i61 & PKIFailureInfo.systemUnavail) != 0) {
                        profilePrivacyPresenter$models$lambda$7$$inlined$filterIsInstance$1$2$1.label = i61 - PKIFailureInfo.systemUnavail;
                        Object obj34 = profilePrivacyPresenter$models$lambda$7$$inlined$filterIsInstance$1$2$1.result;
                        CoroutineSingletons coroutineSingletons31 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i30 = profilePrivacyPresenter$models$lambda$7$$inlined$filterIsInstance$1$2$1.label;
                        if (i30 != 0) {
                            SafeTrace.throwOnFailure(obj34);
                            if (obj instanceof ProfilePrivacyViewEvent.AllowedAccountsEvent) {
                                profilePrivacyPresenter$models$lambda$7$$inlined$filterIsInstance$1$2$1.label = 1;
                                if (flowCollector.emit(obj, profilePrivacyPresenter$models$lambda$7$$inlined$filterIsInstance$1$2$1) == coroutineSingletons31) {
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
                profilePrivacyPresenter$models$lambda$7$$inlined$filterIsInstance$1$2$1 = new ProfilePrivacyPresenter$models$lambda$7$$inlined$filterIsInstance$1$2$1(this, continuation);
                Object obj342 = profilePrivacyPresenter$models$lambda$7$$inlined$filterIsInstance$1$2$1.result;
                CoroutineSingletons coroutineSingletons312 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i30 = profilePrivacyPresenter$models$lambda$7$$inlined$filterIsInstance$1$2$1.label;
                if (i30 != 0) {
                }
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ AndroidPermissionChecker$granted$$inlined$filter$1$2(FlowCollector flowCollector, Object obj, int i) {
        this.$r8$classId = i;
        this.$this_unsafeFlow = flowCollector;
    }
}
