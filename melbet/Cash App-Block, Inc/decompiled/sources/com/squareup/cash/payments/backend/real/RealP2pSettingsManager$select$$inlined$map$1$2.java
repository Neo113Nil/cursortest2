package com.squareup.cash.payments.backend.real;

import androidx.compose.ui.text.android.CanvasCompatO;
import app.cash.sqldelight.Query;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.activity.backend.ActivityUpdatesNotifier$UpdateScope;
import com.squareup.cash.boost.db.Slots;
import com.squareup.cash.data.profile.PublicProfile;
import com.squareup.cash.db.contacts.Recipient;
import com.squareup.cash.db2.ExpressivePaymentsBackgroundConfig;
import com.squareup.cash.db2.ExpressivePaymentsStickerConfig;
import com.squareup.cash.db2.payment.PendingPayment;
import com.squareup.cash.db2.profile.BalanceData;
import com.squareup.cash.db2.profile.Profile;
import com.squareup.cash.db2.profile.SelectRegion;
import com.squareup.cash.offers.presenters.RealOffersDetailsStateManager$states$lambda$10$$inlined$map$1$2$1;
import com.squareup.cash.offers.presenters.RealOffersSearchPresenter$models$lambda$6$$inlined$map$1$2$1;
import com.squareup.cash.onboarding.check.checkers.ProfileIntegrityCheck$check$lambda$0$$inlined$filter$1$2$1;
import com.squareup.cash.onboarding.check.checkers.TabIntegrityCheck$check$lambda$0$$inlined$filterIsInstance$1$2$1;
import com.squareup.cash.p2pblocking.presenters.BaseAllowlistSelectionPresenter$models$2$1$invokeSuspend$$inlined$filterIsInstance$1$2$1;
import com.squareup.cash.p2pblocking.presenters.BaseAllowlistSelectionPresenter$models$lambda$10$$inlined$map$1$2$1;
import com.squareup.cash.p2pblocking.presenters.P2PListPresenter$models$lambda$1$$inlined$map$1$2$1;
import com.squareup.cash.p2pblocking.presenters.SelectCustomerPresenter$models$2$1$invokeSuspend$$inlined$filterIsInstance$1$2$1;
import com.squareup.cash.p2pblocking.presenters.SelectCustomerPresenter$models$lambda$6$$inlined$map$1$2$1;
import com.squareup.cash.p2pblocking.presenters.SelectCustomerPresenter$models$lambda$8$$inlined$map$1$2$1;
import com.squareup.cash.p2pblocking.viewmodels.AllowlistSelectionViewEvent;
import com.squareup.cash.p2pblocking.viewmodels.SelectCustomerViewEvent;
import com.squareup.cash.paymentpad.presenters.HomeViewPresenter$models$$inlined$filterIsInstance$1$2$1;
import com.squareup.cash.paymentpad.presenters.HomeViewPresenter$models$4$1$invokeSuspend$$inlined$filter$1$2$1;
import com.squareup.cash.paymentpad.presenters.HomeViewPresenter$models$lambda$2$$inlined$map$1$2$1;
import com.squareup.cash.paymentpad.presenters.LitePaymentPadPresenter$models$lambda$0$$inlined$map$1$2$1;
import com.squareup.cash.paymentpad.presenters.MainPaymentPadPresenter$models$lambda$0$$inlined$map$1$2$1;
import com.squareup.cash.paymentpad.presenters.MainPaymentPadPresenter$models$lambda$11$$inlined$map$1$2$1;
import com.squareup.cash.paymentpad.viewmodels.HomeViewEvent;
import com.squareup.cash.payments.backend.api.P2pSettingsManager$P2pSettings;
import com.squareup.cash.payments.backend.api.RemotePersonalizedPaymentLoadingState;
import com.squareup.cash.payments.backend.api.StickerMetadata;
import com.squareup.cash.session.backend.SyncState$Progress;
import com.squareup.cash.tabprovider.api.TabInfoState;
import com.squareup.cash.treehouse.activity.ActivityUpdate;
import com.squareup.cash.treehouse.activity.DeviceContact;
import com.squareup.protos.cash.postcard.CashAppCard;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.franklin.api.ClientScenario;
import com.squareup.protos.franklin.api.Region;
import com.squareup.protos.franklin.app.InitiatePaymentRequest;
import com.squareup.protos.franklin.common.RequestContext;
import com.squareup.protos.franklin.common.RetryContext;
import com.squareup.protos.franklin.ui.UiIdvState;
import com.squareup.protos.franklin.ui.UiStatusAndLimits;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
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

/* loaded from: classes6.dex */
public final class RealP2pSettingsManager$select$$inlined$map$1$2 implements FlowCollector {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ FlowCollector $this_unsafeFlow;

    /* renamed from: com.squareup.cash.payments.backend.real.RealP2pSettingsManager$select$$inlined$map$1$2$1, reason: invalid class name */
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
            return RealP2pSettingsManager$select$$inlined$map$1$2.this.emit(null, this);
        }
    }

    public RealP2pSettingsManager$select$$inlined$map$1$2(FlowCollector flowCollector, RealP2pSettingsManager realP2pSettingsManager) {
        this.$r8$classId = 0;
        this.$this_unsafeFlow = flowCollector;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0383  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x038d  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x03ec  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x03f6  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x0444  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x044e  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x0489  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x0493  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x04c6  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x04d0  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x0503  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:350:0x050d  */
    /* JADX WARN: Removed duplicated region for block: B:362:0x0546  */
    /* JADX WARN: Removed duplicated region for block: B:368:0x0550  */
    /* JADX WARN: Removed duplicated region for block: B:382:0x0589  */
    /* JADX WARN: Removed duplicated region for block: B:388:0x0593  */
    /* JADX WARN: Removed duplicated region for block: B:402:0x05c5  */
    /* JADX WARN: Removed duplicated region for block: B:408:0x05cf  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:420:0x0602  */
    /* JADX WARN: Removed duplicated region for block: B:426:0x060c  */
    /* JADX WARN: Removed duplicated region for block: B:438:0x063f  */
    /* JADX WARN: Removed duplicated region for block: B:444:0x0649  */
    /* JADX WARN: Removed duplicated region for block: B:458:0x067b  */
    /* JADX WARN: Removed duplicated region for block: B:464:0x0685  */
    /* JADX WARN: Removed duplicated region for block: B:479:0x06bc  */
    /* JADX WARN: Removed duplicated region for block: B:485:0x06c6  */
    /* JADX WARN: Removed duplicated region for block: B:497:0x06f9  */
    /* JADX WARN: Removed duplicated region for block: B:503:0x0703  */
    /* JADX WARN: Removed duplicated region for block: B:517:0x0735  */
    /* JADX WARN: Removed duplicated region for block: B:523:0x073f  */
    /* JADX WARN: Removed duplicated region for block: B:537:0x0771  */
    /* JADX WARN: Removed duplicated region for block: B:543:0x077b  */
    /* JADX WARN: Removed duplicated region for block: B:557:0x07b0  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:563:0x07ba  */
    /* JADX WARN: Removed duplicated region for block: B:578:0x07f5  */
    /* JADX WARN: Removed duplicated region for block: B:584:0x07ff  */
    /* JADX WARN: Removed duplicated region for block: B:599:0x0840  */
    /* JADX WARN: Removed duplicated region for block: B:605:0x084a  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0144  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        AnonymousClass1 anonymousClass1;
        int i;
        Object p2pSettingsManager$P2pSettings;
        RealOffersDetailsStateManager$states$lambda$10$$inlined$map$1$2$1 realOffersDetailsStateManager$states$lambda$10$$inlined$map$1$2$1;
        int i2;
        RealOffersSearchPresenter$models$lambda$6$$inlined$map$1$2$1 realOffersSearchPresenter$models$lambda$6$$inlined$map$1$2$1;
        int i3;
        ProfileIntegrityCheck$check$lambda$0$$inlined$filter$1$2$1 profileIntegrityCheck$check$lambda$0$$inlined$filter$1$2$1;
        int i4;
        TabIntegrityCheck$check$lambda$0$$inlined$filterIsInstance$1$2$1 tabIntegrityCheck$check$lambda$0$$inlined$filterIsInstance$1$2$1;
        int i5;
        BaseAllowlistSelectionPresenter$models$2$1$invokeSuspend$$inlined$filterIsInstance$1$2$1 baseAllowlistSelectionPresenter$models$2$1$invokeSuspend$$inlined$filterIsInstance$1$2$1;
        int i6;
        BaseAllowlistSelectionPresenter$models$lambda$10$$inlined$map$1$2$1 baseAllowlistSelectionPresenter$models$lambda$10$$inlined$map$1$2$1;
        int i7;
        P2PListPresenter$models$lambda$1$$inlined$map$1$2$1 p2PListPresenter$models$lambda$1$$inlined$map$1$2$1;
        int i8;
        SelectCustomerPresenter$models$2$1$invokeSuspend$$inlined$filterIsInstance$1$2$1 selectCustomerPresenter$models$2$1$invokeSuspend$$inlined$filterIsInstance$1$2$1;
        int i9;
        SelectCustomerPresenter$models$lambda$6$$inlined$map$1$2$1 selectCustomerPresenter$models$lambda$6$$inlined$map$1$2$1;
        int i10;
        SelectCustomerPresenter$models$lambda$8$$inlined$map$1$2$1 selectCustomerPresenter$models$lambda$8$$inlined$map$1$2$1;
        int i11;
        HomeViewPresenter$models$$inlined$filterIsInstance$1$2$1 homeViewPresenter$models$$inlined$filterIsInstance$1$2$1;
        int i12;
        HomeViewPresenter$models$4$1$invokeSuspend$$inlined$filter$1$2$1 homeViewPresenter$models$4$1$invokeSuspend$$inlined$filter$1$2$1;
        int i13;
        HomeViewPresenter$models$lambda$2$$inlined$map$1$2$1 homeViewPresenter$models$lambda$2$$inlined$map$1$2$1;
        int i14;
        LitePaymentPadPresenter$models$lambda$0$$inlined$map$1$2$1 litePaymentPadPresenter$models$lambda$0$$inlined$map$1$2$1;
        int i15;
        MainPaymentPadPresenter$models$lambda$0$$inlined$map$1$2$1 mainPaymentPadPresenter$models$lambda$0$$inlined$map$1$2$1;
        int i16;
        MainPaymentPadPresenter$models$lambda$11$$inlined$map$1$2$1 mainPaymentPadPresenter$models$lambda$11$$inlined$map$1$2$1;
        int i17;
        RealActivityPaymentManager2$activityUpdates$$inlined$map$1$2$1 realActivityPaymentManager2$activityUpdates$$inlined$map$1$2$1;
        int i18;
        Object item;
        RealActivityPaymentManager2$deviceContacts$$inlined$map$1$2$1 realActivityPaymentManager2$deviceContacts$$inlined$map$1$2$1;
        int i19;
        RealOfflineManager$retryPayments$lambda$0$$inlined$map$1$2$1 realOfflineManager$retryPayments$lambda$0$$inlined$map$1$2$1;
        int i20;
        RealPersonalizationRepository$loadBackgrounds$$inlined$map$1$2$1 realPersonalizationRepository$loadBackgrounds$$inlined$map$1$2$1;
        int i21;
        RealPersonalizationRepository$loadPersonalizationFromMosaic$1$invokeSuspend$$inlined$map$1$2$1 realPersonalizationRepository$loadPersonalizationFromMosaic$1$invokeSuspend$$inlined$map$1$2$1;
        int i22;
        RealPersonalizationRepository$loadPersonalizedPaymentTransactionFromPaymentHistory$$inlined$map$1$2$1 realPersonalizationRepository$loadPersonalizedPaymentTransactionFromPaymentHistory$$inlined$map$1$2$1;
        int i23;
        RealPersonalizationRepository$loadPersonalizedPaymentTransactionFromPaymentHistory$$inlined$map$2$2$1 realPersonalizationRepository$loadPersonalizedPaymentTransactionFromPaymentHistory$$inlined$map$2$2$1;
        int i24;
        RealPersonalizationRepository$loadStickers$$inlined$map$1$2$1 realPersonalizationRepository$loadStickers$$inlined$map$1$2$1;
        int i25;
        RealStatusAndLimitsManager$addCashEnabled$$inlined$map$1$2$1 realStatusAndLimitsManager$addCashEnabled$$inlined$map$1$2$1;
        int i26;
        RealStatusAndLimitsManager$addCashEnabled$$inlined$map$2$2$1 realStatusAndLimitsManager$addCashEnabled$$inlined$map$2$2$1;
        int i27;
        RealStatusAndLimitsManager$addCashEnabled$$inlined$map$3$2$1 realStatusAndLimitsManager$addCashEnabled$$inlined$map$3$2$1;
        int i28;
        RealStatusAndLimitsManager$hasPassedIdv$$inlined$map$1$2$1 realStatusAndLimitsManager$hasPassedIdv$$inlined$map$1$2$1;
        int i29;
        Boolean bool;
        int i30 = this.$r8$classId;
        FlowCollector flowCollector = this.$this_unsafeFlow;
        switch (i30) {
            case 0:
                if (continuation instanceof AnonymousClass1) {
                    anonymousClass1 = (AnonymousClass1) continuation;
                    int i31 = anonymousClass1.label;
                    if ((i31 & PKIFailureInfo.systemUnavail) != 0) {
                        anonymousClass1.label = i31 - PKIFailureInfo.systemUnavail;
                        Object obj2 = anonymousClass1.result;
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i = anonymousClass1.label;
                        if (i != 0) {
                            SafeTrace.throwOnFailure(obj2);
                            Profile profile = (Profile) obj;
                            p2pSettingsManager$P2pSettings = profile != null ? new P2pSettingsManager$P2pSettings(profile.request_minimum_note_length, profile.incoming_request_policy, profile.nearby_visibility, profile.rate_plan, Boolean.valueOf(profile.can_upgrade_to_business), profile.deposit_preference, profile.deposit_preference_data, null) : null;
                            anonymousClass1.label = 1;
                            if (flowCollector.emit(p2pSettingsManager$P2pSettings, anonymousClass1) == coroutineSingletons) {
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
                if (continuation instanceof RealOffersDetailsStateManager$states$lambda$10$$inlined$map$1$2$1) {
                    realOffersDetailsStateManager$states$lambda$10$$inlined$map$1$2$1 = (RealOffersDetailsStateManager$states$lambda$10$$inlined$map$1$2$1) continuation;
                    int i32 = realOffersDetailsStateManager$states$lambda$10$$inlined$map$1$2$1.label;
                    if ((i32 & PKIFailureInfo.systemUnavail) != 0) {
                        realOffersDetailsStateManager$states$lambda$10$$inlined$map$1$2$1.label = i32 - PKIFailureInfo.systemUnavail;
                        Object obj3 = realOffersDetailsStateManager$states$lambda$10$$inlined$map$1$2$1.result;
                        CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i2 = realOffersDetailsStateManager$states$lambda$10$$inlined$map$1$2$1.label;
                        if (i2 != 0) {
                            SafeTrace.throwOnFailure(obj3);
                            Pair pair = (Pair) obj;
                            CashAppCard.PhysicalCardOrderState physicalCardOrderState = (CashAppCard.PhysicalCardOrderState) pair.first;
                            if (((Boolean) pair.second).booleanValue()) {
                                physicalCardOrderState = CashAppCard.PhysicalCardOrderState.ACTIVATED;
                            }
                            realOffersDetailsStateManager$states$lambda$10$$inlined$map$1$2$1.label = 1;
                            if (flowCollector.emit(physicalCardOrderState, realOffersDetailsStateManager$states$lambda$10$$inlined$map$1$2$1) == coroutineSingletons3) {
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
                realOffersDetailsStateManager$states$lambda$10$$inlined$map$1$2$1 = new RealOffersDetailsStateManager$states$lambda$10$$inlined$map$1$2$1(this, continuation);
                Object obj32 = realOffersDetailsStateManager$states$lambda$10$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons32 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = realOffersDetailsStateManager$states$lambda$10$$inlined$map$1$2$1.label;
                if (i2 != 0) {
                }
            case 2:
                if (continuation instanceof RealOffersSearchPresenter$models$lambda$6$$inlined$map$1$2$1) {
                    realOffersSearchPresenter$models$lambda$6$$inlined$map$1$2$1 = (RealOffersSearchPresenter$models$lambda$6$$inlined$map$1$2$1) continuation;
                    int i33 = realOffersSearchPresenter$models$lambda$6$$inlined$map$1$2$1.label;
                    if ((i33 & PKIFailureInfo.systemUnavail) != 0) {
                        realOffersSearchPresenter$models$lambda$6$$inlined$map$1$2$1.label = i33 - PKIFailureInfo.systemUnavail;
                        Object obj4 = realOffersSearchPresenter$models$lambda$6$$inlined$map$1$2$1.result;
                        CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i3 = realOffersSearchPresenter$models$lambda$6$$inlined$map$1$2$1.label;
                        if (i3 != 0) {
                            SafeTrace.throwOnFailure(obj4);
                            Slots slots = (Slots) CollectionsKt.firstOrNull((List) obj);
                            p2pSettingsManager$P2pSettings = slots != null ? slots.token : null;
                            realOffersSearchPresenter$models$lambda$6$$inlined$map$1$2$1.label = 1;
                            if (flowCollector.emit(p2pSettingsManager$P2pSettings, realOffersSearchPresenter$models$lambda$6$$inlined$map$1$2$1) == coroutineSingletons4) {
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
                realOffersSearchPresenter$models$lambda$6$$inlined$map$1$2$1 = new RealOffersSearchPresenter$models$lambda$6$$inlined$map$1$2$1(this, continuation);
                Object obj42 = realOffersSearchPresenter$models$lambda$6$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons42 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i3 = realOffersSearchPresenter$models$lambda$6$$inlined$map$1$2$1.label;
                if (i3 != 0) {
                }
            case 3:
                if (continuation instanceof ProfileIntegrityCheck$check$lambda$0$$inlined$filter$1$2$1) {
                    profileIntegrityCheck$check$lambda$0$$inlined$filter$1$2$1 = (ProfileIntegrityCheck$check$lambda$0$$inlined$filter$1$2$1) continuation;
                    int i34 = profileIntegrityCheck$check$lambda$0$$inlined$filter$1$2$1.label;
                    if ((i34 & PKIFailureInfo.systemUnavail) != 0) {
                        profileIntegrityCheck$check$lambda$0$$inlined$filter$1$2$1.label = i34 - PKIFailureInfo.systemUnavail;
                        Object obj5 = profileIntegrityCheck$check$lambda$0$$inlined$filter$1$2$1.result;
                        CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i4 = profileIntegrityCheck$check$lambda$0$$inlined$filter$1$2$1.label;
                        if (i4 != 0) {
                            SafeTrace.throwOnFailure(obj5);
                            if (((SyncState$Progress) obj) != SyncState$Progress.IN_FLIGHT) {
                                profileIntegrityCheck$check$lambda$0$$inlined$filter$1$2$1.label = 1;
                                if (flowCollector.emit(obj, profileIntegrityCheck$check$lambda$0$$inlined$filter$1$2$1) == coroutineSingletons5) {
                                    break;
                                }
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
                profileIntegrityCheck$check$lambda$0$$inlined$filter$1$2$1 = new ProfileIntegrityCheck$check$lambda$0$$inlined$filter$1$2$1(this, continuation);
                Object obj52 = profileIntegrityCheck$check$lambda$0$$inlined$filter$1$2$1.result;
                CoroutineSingletons coroutineSingletons52 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i4 = profileIntegrityCheck$check$lambda$0$$inlined$filter$1$2$1.label;
                if (i4 != 0) {
                }
            case 4:
                if (continuation instanceof TabIntegrityCheck$check$lambda$0$$inlined$filterIsInstance$1$2$1) {
                    tabIntegrityCheck$check$lambda$0$$inlined$filterIsInstance$1$2$1 = (TabIntegrityCheck$check$lambda$0$$inlined$filterIsInstance$1$2$1) continuation;
                    int i35 = tabIntegrityCheck$check$lambda$0$$inlined$filterIsInstance$1$2$1.label;
                    if ((i35 & PKIFailureInfo.systemUnavail) != 0) {
                        tabIntegrityCheck$check$lambda$0$$inlined$filterIsInstance$1$2$1.label = i35 - PKIFailureInfo.systemUnavail;
                        Object obj6 = tabIntegrityCheck$check$lambda$0$$inlined$filterIsInstance$1$2$1.result;
                        CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i5 = tabIntegrityCheck$check$lambda$0$$inlined$filterIsInstance$1$2$1.label;
                        if (i5 != 0) {
                            SafeTrace.throwOnFailure(obj6);
                            if (obj instanceof TabInfoState.Ready) {
                                tabIntegrityCheck$check$lambda$0$$inlined$filterIsInstance$1$2$1.label = 1;
                                if (flowCollector.emit(obj, tabIntegrityCheck$check$lambda$0$$inlined$filterIsInstance$1$2$1) == coroutineSingletons6) {
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
                tabIntegrityCheck$check$lambda$0$$inlined$filterIsInstance$1$2$1 = new TabIntegrityCheck$check$lambda$0$$inlined$filterIsInstance$1$2$1(this, continuation);
                Object obj62 = tabIntegrityCheck$check$lambda$0$$inlined$filterIsInstance$1$2$1.result;
                CoroutineSingletons coroutineSingletons62 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i5 = tabIntegrityCheck$check$lambda$0$$inlined$filterIsInstance$1$2$1.label;
                if (i5 != 0) {
                }
            case 5:
                if (continuation instanceof BaseAllowlistSelectionPresenter$models$2$1$invokeSuspend$$inlined$filterIsInstance$1$2$1) {
                    baseAllowlistSelectionPresenter$models$2$1$invokeSuspend$$inlined$filterIsInstance$1$2$1 = (BaseAllowlistSelectionPresenter$models$2$1$invokeSuspend$$inlined$filterIsInstance$1$2$1) continuation;
                    int i36 = baseAllowlistSelectionPresenter$models$2$1$invokeSuspend$$inlined$filterIsInstance$1$2$1.label;
                    if ((i36 & PKIFailureInfo.systemUnavail) != 0) {
                        baseAllowlistSelectionPresenter$models$2$1$invokeSuspend$$inlined$filterIsInstance$1$2$1.label = i36 - PKIFailureInfo.systemUnavail;
                        Object obj7 = baseAllowlistSelectionPresenter$models$2$1$invokeSuspend$$inlined$filterIsInstance$1$2$1.result;
                        CoroutineSingletons coroutineSingletons7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i6 = baseAllowlistSelectionPresenter$models$2$1$invokeSuspend$$inlined$filterIsInstance$1$2$1.label;
                        if (i6 != 0) {
                            SafeTrace.throwOnFailure(obj7);
                            if (obj instanceof AllowlistSelectionViewEvent.ChangeSearchText) {
                                baseAllowlistSelectionPresenter$models$2$1$invokeSuspend$$inlined$filterIsInstance$1$2$1.label = 1;
                                if (flowCollector.emit(obj, baseAllowlistSelectionPresenter$models$2$1$invokeSuspend$$inlined$filterIsInstance$1$2$1) == coroutineSingletons7) {
                                    break;
                                }
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
                baseAllowlistSelectionPresenter$models$2$1$invokeSuspend$$inlined$filterIsInstance$1$2$1 = new BaseAllowlistSelectionPresenter$models$2$1$invokeSuspend$$inlined$filterIsInstance$1$2$1(this, continuation);
                Object obj72 = baseAllowlistSelectionPresenter$models$2$1$invokeSuspend$$inlined$filterIsInstance$1$2$1.result;
                CoroutineSingletons coroutineSingletons72 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i6 = baseAllowlistSelectionPresenter$models$2$1$invokeSuspend$$inlined$filterIsInstance$1$2$1.label;
                if (i6 != 0) {
                }
            case 6:
                if (continuation instanceof BaseAllowlistSelectionPresenter$models$lambda$10$$inlined$map$1$2$1) {
                    baseAllowlistSelectionPresenter$models$lambda$10$$inlined$map$1$2$1 = (BaseAllowlistSelectionPresenter$models$lambda$10$$inlined$map$1$2$1) continuation;
                    int i37 = baseAllowlistSelectionPresenter$models$lambda$10$$inlined$map$1$2$1.label;
                    if ((i37 & PKIFailureInfo.systemUnavail) != 0) {
                        baseAllowlistSelectionPresenter$models$lambda$10$$inlined$map$1$2$1.label = i37 - PKIFailureInfo.systemUnavail;
                        Object obj8 = baseAllowlistSelectionPresenter$models$lambda$10$$inlined$map$1$2$1.result;
                        CoroutineSingletons coroutineSingletons8 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i7 = baseAllowlistSelectionPresenter$models$lambda$10$$inlined$map$1$2$1.label;
                        if (i7 != 0) {
                            SafeTrace.throwOnFailure(obj8);
                            Region region = ((SelectRegion) obj).region;
                            baseAllowlistSelectionPresenter$models$lambda$10$$inlined$map$1$2$1.label = 1;
                            if (flowCollector.emit(region, baseAllowlistSelectionPresenter$models$lambda$10$$inlined$map$1$2$1) == coroutineSingletons8) {
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
                baseAllowlistSelectionPresenter$models$lambda$10$$inlined$map$1$2$1 = new BaseAllowlistSelectionPresenter$models$lambda$10$$inlined$map$1$2$1(this, continuation);
                Object obj82 = baseAllowlistSelectionPresenter$models$lambda$10$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons82 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i7 = baseAllowlistSelectionPresenter$models$lambda$10$$inlined$map$1$2$1.label;
                if (i7 != 0) {
                }
            case 7:
                if (continuation instanceof P2PListPresenter$models$lambda$1$$inlined$map$1$2$1) {
                    p2PListPresenter$models$lambda$1$$inlined$map$1$2$1 = (P2PListPresenter$models$lambda$1$$inlined$map$1$2$1) continuation;
                    int i38 = p2PListPresenter$models$lambda$1$$inlined$map$1$2$1.label;
                    if ((i38 & PKIFailureInfo.systemUnavail) != 0) {
                        p2PListPresenter$models$lambda$1$$inlined$map$1$2$1.label = i38 - PKIFailureInfo.systemUnavail;
                        Object obj9 = p2PListPresenter$models$lambda$1$$inlined$map$1$2$1.result;
                        CoroutineSingletons coroutineSingletons9 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i8 = p2PListPresenter$models$lambda$1$$inlined$map$1$2$1.label;
                        if (i8 != 0) {
                            SafeTrace.throwOnFailure(obj9);
                            Recipient recipient = (Recipient) obj;
                            p2pSettingsManager$P2pSettings = recipient != null ? recipient.getFirstName() : null;
                            p2PListPresenter$models$lambda$1$$inlined$map$1$2$1.label = 1;
                            if (flowCollector.emit(p2pSettingsManager$P2pSettings, p2PListPresenter$models$lambda$1$$inlined$map$1$2$1) == coroutineSingletons9) {
                                break;
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
                p2PListPresenter$models$lambda$1$$inlined$map$1$2$1 = new P2PListPresenter$models$lambda$1$$inlined$map$1$2$1(this, continuation);
                Object obj92 = p2PListPresenter$models$lambda$1$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons92 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i8 = p2PListPresenter$models$lambda$1$$inlined$map$1$2$1.label;
                if (i8 != 0) {
                }
            case 8:
                if (continuation instanceof SelectCustomerPresenter$models$2$1$invokeSuspend$$inlined$filterIsInstance$1$2$1) {
                    selectCustomerPresenter$models$2$1$invokeSuspend$$inlined$filterIsInstance$1$2$1 = (SelectCustomerPresenter$models$2$1$invokeSuspend$$inlined$filterIsInstance$1$2$1) continuation;
                    int i39 = selectCustomerPresenter$models$2$1$invokeSuspend$$inlined$filterIsInstance$1$2$1.label;
                    if ((i39 & PKIFailureInfo.systemUnavail) != 0) {
                        selectCustomerPresenter$models$2$1$invokeSuspend$$inlined$filterIsInstance$1$2$1.label = i39 - PKIFailureInfo.systemUnavail;
                        Object obj10 = selectCustomerPresenter$models$2$1$invokeSuspend$$inlined$filterIsInstance$1$2$1.result;
                        CoroutineSingletons coroutineSingletons10 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i9 = selectCustomerPresenter$models$2$1$invokeSuspend$$inlined$filterIsInstance$1$2$1.label;
                        if (i9 != 0) {
                            SafeTrace.throwOnFailure(obj10);
                            if (obj instanceof SelectCustomerViewEvent.ChangeSearchText) {
                                selectCustomerPresenter$models$2$1$invokeSuspend$$inlined$filterIsInstance$1$2$1.label = 1;
                                if (flowCollector.emit(obj, selectCustomerPresenter$models$2$1$invokeSuspend$$inlined$filterIsInstance$1$2$1) == coroutineSingletons10) {
                                    break;
                                }
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
                selectCustomerPresenter$models$2$1$invokeSuspend$$inlined$filterIsInstance$1$2$1 = new SelectCustomerPresenter$models$2$1$invokeSuspend$$inlined$filterIsInstance$1$2$1(this, continuation);
                Object obj102 = selectCustomerPresenter$models$2$1$invokeSuspend$$inlined$filterIsInstance$1$2$1.result;
                CoroutineSingletons coroutineSingletons102 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i9 = selectCustomerPresenter$models$2$1$invokeSuspend$$inlined$filterIsInstance$1$2$1.label;
                if (i9 != 0) {
                }
            case 9:
                if (continuation instanceof SelectCustomerPresenter$models$lambda$6$$inlined$map$1$2$1) {
                    selectCustomerPresenter$models$lambda$6$$inlined$map$1$2$1 = (SelectCustomerPresenter$models$lambda$6$$inlined$map$1$2$1) continuation;
                    int i40 = selectCustomerPresenter$models$lambda$6$$inlined$map$1$2$1.label;
                    if ((i40 & PKIFailureInfo.systemUnavail) != 0) {
                        selectCustomerPresenter$models$lambda$6$$inlined$map$1$2$1.label = i40 - PKIFailureInfo.systemUnavail;
                        Object obj11 = selectCustomerPresenter$models$lambda$6$$inlined$map$1$2$1.result;
                        CoroutineSingletons coroutineSingletons11 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i10 = selectCustomerPresenter$models$lambda$6$$inlined$map$1$2$1.label;
                        if (i10 != 0) {
                            SafeTrace.throwOnFailure(obj11);
                            String str = ((PublicProfile) obj).fullName;
                            selectCustomerPresenter$models$lambda$6$$inlined$map$1$2$1.label = 1;
                            if (flowCollector.emit(str, selectCustomerPresenter$models$lambda$6$$inlined$map$1$2$1) == coroutineSingletons11) {
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
                selectCustomerPresenter$models$lambda$6$$inlined$map$1$2$1 = new SelectCustomerPresenter$models$lambda$6$$inlined$map$1$2$1(this, continuation);
                Object obj112 = selectCustomerPresenter$models$lambda$6$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons112 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i10 = selectCustomerPresenter$models$lambda$6$$inlined$map$1$2$1.label;
                if (i10 != 0) {
                }
            case 10:
                if (continuation instanceof SelectCustomerPresenter$models$lambda$8$$inlined$map$1$2$1) {
                    selectCustomerPresenter$models$lambda$8$$inlined$map$1$2$1 = (SelectCustomerPresenter$models$lambda$8$$inlined$map$1$2$1) continuation;
                    int i41 = selectCustomerPresenter$models$lambda$8$$inlined$map$1$2$1.label;
                    if ((i41 & PKIFailureInfo.systemUnavail) != 0) {
                        selectCustomerPresenter$models$lambda$8$$inlined$map$1$2$1.label = i41 - PKIFailureInfo.systemUnavail;
                        Object obj12 = selectCustomerPresenter$models$lambda$8$$inlined$map$1$2$1.result;
                        CoroutineSingletons coroutineSingletons12 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i11 = selectCustomerPresenter$models$lambda$8$$inlined$map$1$2$1.label;
                        if (i11 != 0) {
                            SafeTrace.throwOnFailure(obj12);
                            Region region2 = ((SelectRegion) obj).region;
                            selectCustomerPresenter$models$lambda$8$$inlined$map$1$2$1.label = 1;
                            if (flowCollector.emit(region2, selectCustomerPresenter$models$lambda$8$$inlined$map$1$2$1) == coroutineSingletons12) {
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
                selectCustomerPresenter$models$lambda$8$$inlined$map$1$2$1 = new SelectCustomerPresenter$models$lambda$8$$inlined$map$1$2$1(this, continuation);
                Object obj122 = selectCustomerPresenter$models$lambda$8$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons122 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i11 = selectCustomerPresenter$models$lambda$8$$inlined$map$1$2$1.label;
                if (i11 != 0) {
                }
            case 11:
                if (continuation instanceof HomeViewPresenter$models$$inlined$filterIsInstance$1$2$1) {
                    homeViewPresenter$models$$inlined$filterIsInstance$1$2$1 = (HomeViewPresenter$models$$inlined$filterIsInstance$1$2$1) continuation;
                    int i42 = homeViewPresenter$models$$inlined$filterIsInstance$1$2$1.label;
                    if ((i42 & PKIFailureInfo.systemUnavail) != 0) {
                        homeViewPresenter$models$$inlined$filterIsInstance$1$2$1.label = i42 - PKIFailureInfo.systemUnavail;
                        Object obj13 = homeViewPresenter$models$$inlined$filterIsInstance$1$2$1.result;
                        CoroutineSingletons coroutineSingletons13 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i12 = homeViewPresenter$models$$inlined$filterIsInstance$1$2$1.label;
                        if (i12 != 0) {
                            SafeTrace.throwOnFailure(obj13);
                            if (obj instanceof HomeViewEvent.SuspensionsBannerClicked) {
                                homeViewPresenter$models$$inlined$filterIsInstance$1$2$1.label = 1;
                                if (flowCollector.emit(obj, homeViewPresenter$models$$inlined$filterIsInstance$1$2$1) == coroutineSingletons13) {
                                    break;
                                }
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
                homeViewPresenter$models$$inlined$filterIsInstance$1$2$1 = new HomeViewPresenter$models$$inlined$filterIsInstance$1$2$1(this, continuation);
                Object obj132 = homeViewPresenter$models$$inlined$filterIsInstance$1$2$1.result;
                CoroutineSingletons coroutineSingletons132 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i12 = homeViewPresenter$models$$inlined$filterIsInstance$1$2$1.label;
                if (i12 != 0) {
                }
            case 12:
                if (continuation instanceof HomeViewPresenter$models$4$1$invokeSuspend$$inlined$filter$1$2$1) {
                    homeViewPresenter$models$4$1$invokeSuspend$$inlined$filter$1$2$1 = (HomeViewPresenter$models$4$1$invokeSuspend$$inlined$filter$1$2$1) continuation;
                    int i43 = homeViewPresenter$models$4$1$invokeSuspend$$inlined$filter$1$2$1.label;
                    if ((i43 & PKIFailureInfo.systemUnavail) != 0) {
                        homeViewPresenter$models$4$1$invokeSuspend$$inlined$filter$1$2$1.label = i43 - PKIFailureInfo.systemUnavail;
                        Object obj14 = homeViewPresenter$models$4$1$invokeSuspend$$inlined$filter$1$2$1.result;
                        CoroutineSingletons coroutineSingletons14 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i13 = homeViewPresenter$models$4$1$invokeSuspend$$inlined$filter$1$2$1.label;
                        if (i13 != 0) {
                            SafeTrace.throwOnFailure(obj14);
                            if (Intrinsics.areEqual((Boolean) obj, Boolean.TRUE)) {
                                homeViewPresenter$models$4$1$invokeSuspend$$inlined$filter$1$2$1.label = 1;
                                if (flowCollector.emit(obj, homeViewPresenter$models$4$1$invokeSuspend$$inlined$filter$1$2$1) == coroutineSingletons14) {
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
                homeViewPresenter$models$4$1$invokeSuspend$$inlined$filter$1$2$1 = new HomeViewPresenter$models$4$1$invokeSuspend$$inlined$filter$1$2$1(this, continuation);
                Object obj142 = homeViewPresenter$models$4$1$invokeSuspend$$inlined$filter$1$2$1.result;
                CoroutineSingletons coroutineSingletons142 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i13 = homeViewPresenter$models$4$1$invokeSuspend$$inlined$filter$1$2$1.label;
                if (i13 != 0) {
                }
            case 13:
                if (continuation instanceof HomeViewPresenter$models$lambda$2$$inlined$map$1$2$1) {
                    homeViewPresenter$models$lambda$2$$inlined$map$1$2$1 = (HomeViewPresenter$models$lambda$2$$inlined$map$1$2$1) continuation;
                    int i44 = homeViewPresenter$models$lambda$2$$inlined$map$1$2$1.label;
                    if ((i44 & PKIFailureInfo.systemUnavail) != 0) {
                        homeViewPresenter$models$lambda$2$$inlined$map$1$2$1.label = i44 - PKIFailureInfo.systemUnavail;
                        Object obj15 = homeViewPresenter$models$lambda$2$$inlined$map$1$2$1.result;
                        CoroutineSingletons coroutineSingletons15 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i14 = homeViewPresenter$models$lambda$2$$inlined$map$1$2$1.label;
                        if (i14 != 0) {
                            SafeTrace.throwOnFailure(obj15);
                            Boolean valueOf = Boolean.valueOf(CanvasCompatO.isRatePlanBusiness((P2pSettingsManager$P2pSettings) obj));
                            homeViewPresenter$models$lambda$2$$inlined$map$1$2$1.label = 1;
                            if (flowCollector.emit(valueOf, homeViewPresenter$models$lambda$2$$inlined$map$1$2$1) == coroutineSingletons15) {
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
                homeViewPresenter$models$lambda$2$$inlined$map$1$2$1 = new HomeViewPresenter$models$lambda$2$$inlined$map$1$2$1(this, continuation);
                Object obj152 = homeViewPresenter$models$lambda$2$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons152 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i14 = homeViewPresenter$models$lambda$2$$inlined$map$1$2$1.label;
                if (i14 != 0) {
                }
            case 14:
                if (continuation instanceof LitePaymentPadPresenter$models$lambda$0$$inlined$map$1$2$1) {
                    litePaymentPadPresenter$models$lambda$0$$inlined$map$1$2$1 = (LitePaymentPadPresenter$models$lambda$0$$inlined$map$1$2$1) continuation;
                    int i45 = litePaymentPadPresenter$models$lambda$0$$inlined$map$1$2$1.label;
                    if ((i45 & PKIFailureInfo.systemUnavail) != 0) {
                        litePaymentPadPresenter$models$lambda$0$$inlined$map$1$2$1.label = i45 - PKIFailureInfo.systemUnavail;
                        Object obj16 = litePaymentPadPresenter$models$lambda$0$$inlined$map$1$2$1.result;
                        CoroutineSingletons coroutineSingletons16 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i15 = litePaymentPadPresenter$models$lambda$0$$inlined$map$1$2$1.label;
                        if (i15 != 0) {
                            SafeTrace.throwOnFailure(obj16);
                            CurrencyCode currencyCode = ((Profile) obj).default_currency;
                            litePaymentPadPresenter$models$lambda$0$$inlined$map$1$2$1.label = 1;
                            if (flowCollector.emit(currencyCode, litePaymentPadPresenter$models$lambda$0$$inlined$map$1$2$1) == coroutineSingletons16) {
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
                litePaymentPadPresenter$models$lambda$0$$inlined$map$1$2$1 = new LitePaymentPadPresenter$models$lambda$0$$inlined$map$1$2$1(this, continuation);
                Object obj162 = litePaymentPadPresenter$models$lambda$0$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons162 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i15 = litePaymentPadPresenter$models$lambda$0$$inlined$map$1$2$1.label;
                if (i15 != 0) {
                }
            case 15:
                if (continuation instanceof MainPaymentPadPresenter$models$lambda$0$$inlined$map$1$2$1) {
                    mainPaymentPadPresenter$models$lambda$0$$inlined$map$1$2$1 = (MainPaymentPadPresenter$models$lambda$0$$inlined$map$1$2$1) continuation;
                    int i46 = mainPaymentPadPresenter$models$lambda$0$$inlined$map$1$2$1.label;
                    if ((i46 & PKIFailureInfo.systemUnavail) != 0) {
                        mainPaymentPadPresenter$models$lambda$0$$inlined$map$1$2$1.label = i46 - PKIFailureInfo.systemUnavail;
                        Object obj17 = mainPaymentPadPresenter$models$lambda$0$$inlined$map$1$2$1.result;
                        CoroutineSingletons coroutineSingletons17 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i16 = mainPaymentPadPresenter$models$lambda$0$$inlined$map$1$2$1.label;
                        if (i16 != 0) {
                            SafeTrace.throwOnFailure(obj17);
                            CurrencyCode currencyCode2 = ((Profile) obj).default_currency;
                            mainPaymentPadPresenter$models$lambda$0$$inlined$map$1$2$1.label = 1;
                            if (flowCollector.emit(currencyCode2, mainPaymentPadPresenter$models$lambda$0$$inlined$map$1$2$1) == coroutineSingletons17) {
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
                mainPaymentPadPresenter$models$lambda$0$$inlined$map$1$2$1 = new MainPaymentPadPresenter$models$lambda$0$$inlined$map$1$2$1(this, continuation);
                Object obj172 = mainPaymentPadPresenter$models$lambda$0$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons172 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i16 = mainPaymentPadPresenter$models$lambda$0$$inlined$map$1$2$1.label;
                if (i16 != 0) {
                }
            case 16:
                if (continuation instanceof MainPaymentPadPresenter$models$lambda$11$$inlined$map$1$2$1) {
                    mainPaymentPadPresenter$models$lambda$11$$inlined$map$1$2$1 = (MainPaymentPadPresenter$models$lambda$11$$inlined$map$1$2$1) continuation;
                    int i47 = mainPaymentPadPresenter$models$lambda$11$$inlined$map$1$2$1.label;
                    if ((i47 & PKIFailureInfo.systemUnavail) != 0) {
                        mainPaymentPadPresenter$models$lambda$11$$inlined$map$1$2$1.label = i47 - PKIFailureInfo.systemUnavail;
                        Object obj18 = mainPaymentPadPresenter$models$lambda$11$$inlined$map$1$2$1.result;
                        CoroutineSingletons coroutineSingletons18 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i17 = mainPaymentPadPresenter$models$lambda$11$$inlined$map$1$2$1.label;
                        if (i17 != 0) {
                            SafeTrace.throwOnFailure(obj18);
                            P2pSettingsManager$P2pSettings p2pSettingsManager$P2pSettings2 = (P2pSettingsManager$P2pSettings) obj;
                            Boolean valueOf2 = Boolean.valueOf(p2pSettingsManager$P2pSettings2 != null ? CanvasCompatO.isRatePlanBusiness(p2pSettingsManager$P2pSettings2) : false);
                            mainPaymentPadPresenter$models$lambda$11$$inlined$map$1$2$1.label = 1;
                            if (flowCollector.emit(valueOf2, mainPaymentPadPresenter$models$lambda$11$$inlined$map$1$2$1) == coroutineSingletons18) {
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
                mainPaymentPadPresenter$models$lambda$11$$inlined$map$1$2$1 = new MainPaymentPadPresenter$models$lambda$11$$inlined$map$1$2$1(this, continuation);
                Object obj182 = mainPaymentPadPresenter$models$lambda$11$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons182 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i17 = mainPaymentPadPresenter$models$lambda$11$$inlined$map$1$2$1.label;
                if (i17 != 0) {
                }
            case 17:
                if (continuation instanceof RealActivityPaymentManager2$activityUpdates$$inlined$map$1$2$1) {
                    realActivityPaymentManager2$activityUpdates$$inlined$map$1$2$1 = (RealActivityPaymentManager2$activityUpdates$$inlined$map$1$2$1) continuation;
                    int i48 = realActivityPaymentManager2$activityUpdates$$inlined$map$1$2$1.label;
                    if ((i48 & PKIFailureInfo.systemUnavail) != 0) {
                        realActivityPaymentManager2$activityUpdates$$inlined$map$1$2$1.label = i48 - PKIFailureInfo.systemUnavail;
                        Object obj19 = realActivityPaymentManager2$activityUpdates$$inlined$map$1$2$1.result;
                        CoroutineSingletons coroutineSingletons19 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i18 = realActivityPaymentManager2$activityUpdates$$inlined$map$1$2$1.label;
                        if (i18 != 0) {
                            SafeTrace.throwOnFailure(obj19);
                            ActivityUpdatesNotifier$UpdateScope activityUpdatesNotifier$UpdateScope = (ActivityUpdatesNotifier$UpdateScope) obj;
                            if (Intrinsics.areEqual(activityUpdatesNotifier$UpdateScope, ActivityUpdatesNotifier$UpdateScope.Feed.INSTANCE)) {
                                item = ActivityUpdate.Feed.INSTANCE;
                            } else if (!(activityUpdatesNotifier$UpdateScope instanceof ActivityUpdatesNotifier$UpdateScope.Item)) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                break;
                            } else {
                                item = new ActivityUpdate.Item(((ActivityUpdatesNotifier$UpdateScope.Item) activityUpdatesNotifier$UpdateScope).itemId);
                            }
                            realActivityPaymentManager2$activityUpdates$$inlined$map$1$2$1.label = 1;
                            if (flowCollector.emit(item, realActivityPaymentManager2$activityUpdates$$inlined$map$1$2$1) == coroutineSingletons19) {
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
                realActivityPaymentManager2$activityUpdates$$inlined$map$1$2$1 = new RealActivityPaymentManager2$activityUpdates$$inlined$map$1$2$1(this, continuation);
                Object obj192 = realActivityPaymentManager2$activityUpdates$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons192 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i18 = realActivityPaymentManager2$activityUpdates$$inlined$map$1$2$1.label;
                if (i18 != 0) {
                }
            case 18:
                if (continuation instanceof RealActivityPaymentManager2$deviceContacts$$inlined$map$1$2$1) {
                    realActivityPaymentManager2$deviceContacts$$inlined$map$1$2$1 = (RealActivityPaymentManager2$deviceContacts$$inlined$map$1$2$1) continuation;
                    int i49 = realActivityPaymentManager2$deviceContacts$$inlined$map$1$2$1.label;
                    if ((i49 & PKIFailureInfo.systemUnavail) != 0) {
                        realActivityPaymentManager2$deviceContacts$$inlined$map$1$2$1.label = i49 - PKIFailureInfo.systemUnavail;
                        Object obj20 = realActivityPaymentManager2$deviceContacts$$inlined$map$1$2$1.result;
                        CoroutineSingletons coroutineSingletons20 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i19 = realActivityPaymentManager2$deviceContacts$$inlined$map$1$2$1.label;
                        if (i19 != 0) {
                            SafeTrace.throwOnFailure(obj20);
                            List<Recipient> list = (List) obj;
                            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
                            for (Recipient recipient2 : list) {
                                arrayList.add(new DeviceContact(recipient2.customerId, recipient2.sms, recipient2.email, recipient2.displayName, recipient2.lookupKey));
                            }
                            realActivityPaymentManager2$deviceContacts$$inlined$map$1$2$1.label = 1;
                            if (flowCollector.emit(arrayList, realActivityPaymentManager2$deviceContacts$$inlined$map$1$2$1) == coroutineSingletons20) {
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
                realActivityPaymentManager2$deviceContacts$$inlined$map$1$2$1 = new RealActivityPaymentManager2$deviceContacts$$inlined$map$1$2$1(this, continuation);
                Object obj202 = realActivityPaymentManager2$deviceContacts$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons202 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i19 = realActivityPaymentManager2$deviceContacts$$inlined$map$1$2$1.label;
                if (i19 != 0) {
                }
            case 19:
                if (continuation instanceof RealOfflineManager$retryPayments$lambda$0$$inlined$map$1$2$1) {
                    realOfflineManager$retryPayments$lambda$0$$inlined$map$1$2$1 = (RealOfflineManager$retryPayments$lambda$0$$inlined$map$1$2$1) continuation;
                    int i50 = realOfflineManager$retryPayments$lambda$0$$inlined$map$1$2$1.label;
                    if ((i50 & PKIFailureInfo.systemUnavail) != 0) {
                        realOfflineManager$retryPayments$lambda$0$$inlined$map$1$2$1.label = i50 - PKIFailureInfo.systemUnavail;
                        Object obj21 = realOfflineManager$retryPayments$lambda$0$$inlined$map$1$2$1.result;
                        CoroutineSingletons coroutineSingletons21 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i20 = realOfflineManager$retryPayments$lambda$0$$inlined$map$1$2$1.label;
                        if (i20 != 0) {
                            SafeTrace.throwOnFailure(obj21);
                            PendingPayment pendingPayment = (PendingPayment) obj;
                            ClientScenario clientScenario = pendingPayment.client_scenario;
                            if (clientScenario == null) {
                                clientScenario = ClientScenario.PAYMENT_FLOW;
                            }
                            InitiatePaymentRequest initiatePaymentRequest = pendingPayment.request;
                            long j = pendingPayment.created_at;
                            long j2 = pendingPayment.retry_count + 1;
                            initiatePaymentRequest.getClass();
                            RequestContext requestContext = initiatePaymentRequest.request_context;
                            Pair pair2 = new Pair(clientScenario, InitiatePaymentRequest.copy$default(initiatePaymentRequest, RequestContext.copy$default(requestContext == null ? new RequestContext(null, null, null, null, null, null, null, null, 8191) : requestContext, new RetryContext(Long.valueOf(j), Long.valueOf(j2), null, 60), null, null, null, null, null, null, null, null, null, null, null, 8190), null, null, null, null, null, null, null, null, null, 8388606));
                            realOfflineManager$retryPayments$lambda$0$$inlined$map$1$2$1.label = 1;
                            if (flowCollector.emit(pair2, realOfflineManager$retryPayments$lambda$0$$inlined$map$1$2$1) == coroutineSingletons21) {
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
                realOfflineManager$retryPayments$lambda$0$$inlined$map$1$2$1 = new RealOfflineManager$retryPayments$lambda$0$$inlined$map$1$2$1(this, continuation);
                Object obj212 = realOfflineManager$retryPayments$lambda$0$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons212 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i20 = realOfflineManager$retryPayments$lambda$0$$inlined$map$1$2$1.label;
                if (i20 != 0) {
                }
            case 20:
                if (continuation instanceof RealPersonalizationRepository$loadBackgrounds$$inlined$map$1$2$1) {
                    realPersonalizationRepository$loadBackgrounds$$inlined$map$1$2$1 = (RealPersonalizationRepository$loadBackgrounds$$inlined$map$1$2$1) continuation;
                    int i51 = realPersonalizationRepository$loadBackgrounds$$inlined$map$1$2$1.label;
                    if ((i51 & PKIFailureInfo.systemUnavail) != 0) {
                        realPersonalizationRepository$loadBackgrounds$$inlined$map$1$2$1.label = i51 - PKIFailureInfo.systemUnavail;
                        Object obj23 = realPersonalizationRepository$loadBackgrounds$$inlined$map$1$2$1.result;
                        CoroutineSingletons coroutineSingletons22 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i21 = realPersonalizationRepository$loadBackgrounds$$inlined$map$1$2$1.label;
                        if (i21 != 0) {
                            SafeTrace.throwOnFailure(obj23);
                            List list2 = (List) obj;
                            ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
                            Iterator it = list2.iterator();
                            while (it.hasNext()) {
                                arrayList2.add(RealPersonalizationRepositoryKt.toBackgroundMetadata((ExpressivePaymentsBackgroundConfig) it.next()));
                            }
                            realPersonalizationRepository$loadBackgrounds$$inlined$map$1$2$1.label = 1;
                            if (flowCollector.emit(arrayList2, realPersonalizationRepository$loadBackgrounds$$inlined$map$1$2$1) == coroutineSingletons22) {
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
                realPersonalizationRepository$loadBackgrounds$$inlined$map$1$2$1 = new RealPersonalizationRepository$loadBackgrounds$$inlined$map$1$2$1(this, continuation);
                Object obj232 = realPersonalizationRepository$loadBackgrounds$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons222 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i21 = realPersonalizationRepository$loadBackgrounds$$inlined$map$1$2$1.label;
                if (i21 != 0) {
                }
            case 21:
                Object emit = flowCollector.emit((RemotePersonalizedPaymentLoadingState) obj, continuation);
                if (emit != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 22:
                if (continuation instanceof RealPersonalizationRepository$loadPersonalizationFromMosaic$1$invokeSuspend$$inlined$map$1$2$1) {
                    realPersonalizationRepository$loadPersonalizationFromMosaic$1$invokeSuspend$$inlined$map$1$2$1 = (RealPersonalizationRepository$loadPersonalizationFromMosaic$1$invokeSuspend$$inlined$map$1$2$1) continuation;
                    int i52 = realPersonalizationRepository$loadPersonalizationFromMosaic$1$invokeSuspend$$inlined$map$1$2$1.label;
                    if ((i52 & PKIFailureInfo.systemUnavail) != 0) {
                        realPersonalizationRepository$loadPersonalizationFromMosaic$1$invokeSuspend$$inlined$map$1$2$1.label = i52 - PKIFailureInfo.systemUnavail;
                        Object obj24 = realPersonalizationRepository$loadPersonalizationFromMosaic$1$invokeSuspend$$inlined$map$1$2$1.result;
                        CoroutineSingletons coroutineSingletons23 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i22 = realPersonalizationRepository$loadPersonalizationFromMosaic$1$invokeSuspend$$inlined$map$1$2$1.label;
                        if (i22 != 0) {
                            SafeTrace.throwOnFailure(obj24);
                            Object executeAsOneOrNull = ((Query) obj).executeAsOneOrNull();
                            realPersonalizationRepository$loadPersonalizationFromMosaic$1$invokeSuspend$$inlined$map$1$2$1.label = 1;
                            if (flowCollector.emit(executeAsOneOrNull, realPersonalizationRepository$loadPersonalizationFromMosaic$1$invokeSuspend$$inlined$map$1$2$1) == coroutineSingletons23) {
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
                realPersonalizationRepository$loadPersonalizationFromMosaic$1$invokeSuspend$$inlined$map$1$2$1 = new RealPersonalizationRepository$loadPersonalizationFromMosaic$1$invokeSuspend$$inlined$map$1$2$1(this, continuation);
                Object obj242 = realPersonalizationRepository$loadPersonalizationFromMosaic$1$invokeSuspend$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons232 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i22 = realPersonalizationRepository$loadPersonalizationFromMosaic$1$invokeSuspend$$inlined$map$1$2$1.label;
                if (i22 != 0) {
                }
            case 23:
                if (continuation instanceof RealPersonalizationRepository$loadPersonalizedPaymentTransactionFromPaymentHistory$$inlined$map$1$2$1) {
                    realPersonalizationRepository$loadPersonalizedPaymentTransactionFromPaymentHistory$$inlined$map$1$2$1 = (RealPersonalizationRepository$loadPersonalizedPaymentTransactionFromPaymentHistory$$inlined$map$1$2$1) continuation;
                    int i53 = realPersonalizationRepository$loadPersonalizedPaymentTransactionFromPaymentHistory$$inlined$map$1$2$1.label;
                    if ((i53 & PKIFailureInfo.systemUnavail) != 0) {
                        realPersonalizationRepository$loadPersonalizedPaymentTransactionFromPaymentHistory$$inlined$map$1$2$1.label = i53 - PKIFailureInfo.systemUnavail;
                        Object obj25 = realPersonalizationRepository$loadPersonalizedPaymentTransactionFromPaymentHistory$$inlined$map$1$2$1.result;
                        CoroutineSingletons coroutineSingletons24 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i23 = realPersonalizationRepository$loadPersonalizedPaymentTransactionFromPaymentHistory$$inlined$map$1$2$1.label;
                        if (i23 != 0) {
                            SafeTrace.throwOnFailure(obj25);
                            Object executeAsOneOrNull2 = ((Query) obj).executeAsOneOrNull();
                            realPersonalizationRepository$loadPersonalizedPaymentTransactionFromPaymentHistory$$inlined$map$1$2$1.label = 1;
                            if (flowCollector.emit(executeAsOneOrNull2, realPersonalizationRepository$loadPersonalizedPaymentTransactionFromPaymentHistory$$inlined$map$1$2$1) == coroutineSingletons24) {
                                break;
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
                realPersonalizationRepository$loadPersonalizedPaymentTransactionFromPaymentHistory$$inlined$map$1$2$1 = new RealPersonalizationRepository$loadPersonalizedPaymentTransactionFromPaymentHistory$$inlined$map$1$2$1(this, continuation);
                Object obj252 = realPersonalizationRepository$loadPersonalizedPaymentTransactionFromPaymentHistory$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons242 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i23 = realPersonalizationRepository$loadPersonalizedPaymentTransactionFromPaymentHistory$$inlined$map$1$2$1.label;
                if (i23 != 0) {
                }
            case 24:
                if (continuation instanceof RealPersonalizationRepository$loadPersonalizedPaymentTransactionFromPaymentHistory$$inlined$map$2$2$1) {
                    realPersonalizationRepository$loadPersonalizedPaymentTransactionFromPaymentHistory$$inlined$map$2$2$1 = (RealPersonalizationRepository$loadPersonalizedPaymentTransactionFromPaymentHistory$$inlined$map$2$2$1) continuation;
                    int i54 = realPersonalizationRepository$loadPersonalizedPaymentTransactionFromPaymentHistory$$inlined$map$2$2$1.label;
                    if ((i54 & PKIFailureInfo.systemUnavail) != 0) {
                        realPersonalizationRepository$loadPersonalizedPaymentTransactionFromPaymentHistory$$inlined$map$2$2$1.label = i54 - PKIFailureInfo.systemUnavail;
                        Object obj26 = realPersonalizationRepository$loadPersonalizedPaymentTransactionFromPaymentHistory$$inlined$map$2$2$1.result;
                        CoroutineSingletons coroutineSingletons25 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i24 = realPersonalizationRepository$loadPersonalizedPaymentTransactionFromPaymentHistory$$inlined$map$2$2$1.label;
                        if (i24 != 0) {
                            SafeTrace.throwOnFailure(obj26);
                            Object executeAsOne = ((Query) obj).executeAsOne();
                            realPersonalizationRepository$loadPersonalizedPaymentTransactionFromPaymentHistory$$inlined$map$2$2$1.label = 1;
                            if (flowCollector.emit(executeAsOne, realPersonalizationRepository$loadPersonalizedPaymentTransactionFromPaymentHistory$$inlined$map$2$2$1) == coroutineSingletons25) {
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
                realPersonalizationRepository$loadPersonalizedPaymentTransactionFromPaymentHistory$$inlined$map$2$2$1 = new RealPersonalizationRepository$loadPersonalizedPaymentTransactionFromPaymentHistory$$inlined$map$2$2$1(this, continuation);
                Object obj262 = realPersonalizationRepository$loadPersonalizedPaymentTransactionFromPaymentHistory$$inlined$map$2$2$1.result;
                CoroutineSingletons coroutineSingletons252 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i24 = realPersonalizationRepository$loadPersonalizedPaymentTransactionFromPaymentHistory$$inlined$map$2$2$1.label;
                if (i24 != 0) {
                }
            case 25:
                if (continuation instanceof RealPersonalizationRepository$loadStickers$$inlined$map$1$2$1) {
                    realPersonalizationRepository$loadStickers$$inlined$map$1$2$1 = (RealPersonalizationRepository$loadStickers$$inlined$map$1$2$1) continuation;
                    int i55 = realPersonalizationRepository$loadStickers$$inlined$map$1$2$1.label;
                    if ((i55 & PKIFailureInfo.systemUnavail) != 0) {
                        realPersonalizationRepository$loadStickers$$inlined$map$1$2$1.label = i55 - PKIFailureInfo.systemUnavail;
                        Object obj27 = realPersonalizationRepository$loadStickers$$inlined$map$1$2$1.result;
                        CoroutineSingletons coroutineSingletons26 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i25 = realPersonalizationRepository$loadStickers$$inlined$map$1$2$1.label;
                        if (i25 != 0) {
                            SafeTrace.throwOnFailure(obj27);
                            List<ExpressivePaymentsStickerConfig> list3 = (List) obj;
                            ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list3, 10));
                            for (ExpressivePaymentsStickerConfig expressivePaymentsStickerConfig : list3) {
                                String str2 = expressivePaymentsStickerConfig.name;
                                String str3 = "";
                                if (str2 == null) {
                                    str2 = "";
                                }
                                String str4 = expressivePaymentsStickerConfig.main_url;
                                if (str4 == null) {
                                    str4 = "";
                                }
                                String str5 = expressivePaymentsStickerConfig.preview_url;
                                if (str5 != null) {
                                    str3 = str5;
                                }
                                arrayList3.add(new StickerMetadata(str2, str4, str3, expressivePaymentsStickerConfig.accessibility_description));
                            }
                            realPersonalizationRepository$loadStickers$$inlined$map$1$2$1.label = 1;
                            if (flowCollector.emit(arrayList3, realPersonalizationRepository$loadStickers$$inlined$map$1$2$1) == coroutineSingletons26) {
                                break;
                            }
                        } else if (i25 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj27);
                        }
                        break;
                    }
                }
                realPersonalizationRepository$loadStickers$$inlined$map$1$2$1 = new RealPersonalizationRepository$loadStickers$$inlined$map$1$2$1(this, continuation);
                Object obj272 = realPersonalizationRepository$loadStickers$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons262 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i25 = realPersonalizationRepository$loadStickers$$inlined$map$1$2$1.label;
                if (i25 != 0) {
                }
            case 26:
                if (continuation instanceof RealStatusAndLimitsManager$addCashEnabled$$inlined$map$1$2$1) {
                    realStatusAndLimitsManager$addCashEnabled$$inlined$map$1$2$1 = (RealStatusAndLimitsManager$addCashEnabled$$inlined$map$1$2$1) continuation;
                    int i56 = realStatusAndLimitsManager$addCashEnabled$$inlined$map$1$2$1.label;
                    if ((i56 & PKIFailureInfo.systemUnavail) != 0) {
                        realStatusAndLimitsManager$addCashEnabled$$inlined$map$1$2$1.label = i56 - PKIFailureInfo.systemUnavail;
                        Object obj28 = realStatusAndLimitsManager$addCashEnabled$$inlined$map$1$2$1.result;
                        CoroutineSingletons coroutineSingletons27 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i26 = realStatusAndLimitsManager$addCashEnabled$$inlined$map$1$2$1.label;
                        if (i26 != 0) {
                            SafeTrace.throwOnFailure(obj28);
                            BalanceData balanceData = (BalanceData) obj;
                            p2pSettingsManager$P2pSettings = balanceData != null ? Boolean.valueOf(balanceData.adding_cash_enabled) : null;
                            realStatusAndLimitsManager$addCashEnabled$$inlined$map$1$2$1.label = 1;
                            if (flowCollector.emit(p2pSettingsManager$P2pSettings, realStatusAndLimitsManager$addCashEnabled$$inlined$map$1$2$1) == coroutineSingletons27) {
                                break;
                            }
                        } else if (i26 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj28);
                        }
                        break;
                    }
                }
                realStatusAndLimitsManager$addCashEnabled$$inlined$map$1$2$1 = new RealStatusAndLimitsManager$addCashEnabled$$inlined$map$1$2$1(this, continuation);
                Object obj282 = realStatusAndLimitsManager$addCashEnabled$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons272 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i26 = realStatusAndLimitsManager$addCashEnabled$$inlined$map$1$2$1.label;
                if (i26 != 0) {
                }
            case 27:
                if (continuation instanceof RealStatusAndLimitsManager$addCashEnabled$$inlined$map$2$2$1) {
                    realStatusAndLimitsManager$addCashEnabled$$inlined$map$2$2$1 = (RealStatusAndLimitsManager$addCashEnabled$$inlined$map$2$2$1) continuation;
                    int i57 = realStatusAndLimitsManager$addCashEnabled$$inlined$map$2$2$1.label;
                    if ((i57 & PKIFailureInfo.systemUnavail) != 0) {
                        realStatusAndLimitsManager$addCashEnabled$$inlined$map$2$2$1.label = i57 - PKIFailureInfo.systemUnavail;
                        Object obj29 = realStatusAndLimitsManager$addCashEnabled$$inlined$map$2$2$1.result;
                        CoroutineSingletons coroutineSingletons28 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i27 = realStatusAndLimitsManager$addCashEnabled$$inlined$map$2$2$1.label;
                        if (i27 != 0) {
                            SafeTrace.throwOnFailure(obj29);
                            UiStatusAndLimits uiStatusAndLimits = (UiStatusAndLimits) obj;
                            p2pSettingsManager$P2pSettings = uiStatusAndLimits != null ? uiStatusAndLimits.adding_cash_enabled : null;
                            realStatusAndLimitsManager$addCashEnabled$$inlined$map$2$2$1.label = 1;
                            if (flowCollector.emit(p2pSettingsManager$P2pSettings, realStatusAndLimitsManager$addCashEnabled$$inlined$map$2$2$1) == coroutineSingletons28) {
                                break;
                            }
                        } else if (i27 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj29);
                        }
                        break;
                    }
                }
                realStatusAndLimitsManager$addCashEnabled$$inlined$map$2$2$1 = new RealStatusAndLimitsManager$addCashEnabled$$inlined$map$2$2$1(this, continuation);
                Object obj292 = realStatusAndLimitsManager$addCashEnabled$$inlined$map$2$2$1.result;
                CoroutineSingletons coroutineSingletons282 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i27 = realStatusAndLimitsManager$addCashEnabled$$inlined$map$2$2$1.label;
                if (i27 != 0) {
                }
            case 28:
                if (continuation instanceof RealStatusAndLimitsManager$addCashEnabled$$inlined$map$3$2$1) {
                    realStatusAndLimitsManager$addCashEnabled$$inlined$map$3$2$1 = (RealStatusAndLimitsManager$addCashEnabled$$inlined$map$3$2$1) continuation;
                    int i58 = realStatusAndLimitsManager$addCashEnabled$$inlined$map$3$2$1.label;
                    if ((i58 & PKIFailureInfo.systemUnavail) != 0) {
                        realStatusAndLimitsManager$addCashEnabled$$inlined$map$3$2$1.label = i58 - PKIFailureInfo.systemUnavail;
                        Object obj30 = realStatusAndLimitsManager$addCashEnabled$$inlined$map$3$2$1.result;
                        CoroutineSingletons coroutineSingletons29 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i28 = realStatusAndLimitsManager$addCashEnabled$$inlined$map$3$2$1.label;
                        if (i28 != 0) {
                            SafeTrace.throwOnFailure(obj30);
                            Boolean bool2 = (Boolean) obj;
                            Boolean valueOf3 = Boolean.valueOf(bool2 != null ? bool2.booleanValue() : false);
                            realStatusAndLimitsManager$addCashEnabled$$inlined$map$3$2$1.label = 1;
                            if (flowCollector.emit(valueOf3, realStatusAndLimitsManager$addCashEnabled$$inlined$map$3$2$1) == coroutineSingletons29) {
                                break;
                            }
                        } else if (i28 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj30);
                        }
                        break;
                    }
                }
                realStatusAndLimitsManager$addCashEnabled$$inlined$map$3$2$1 = new RealStatusAndLimitsManager$addCashEnabled$$inlined$map$3$2$1(this, continuation);
                Object obj302 = realStatusAndLimitsManager$addCashEnabled$$inlined$map$3$2$1.result;
                CoroutineSingletons coroutineSingletons292 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i28 = realStatusAndLimitsManager$addCashEnabled$$inlined$map$3$2$1.label;
                if (i28 != 0) {
                }
            default:
                if (continuation instanceof RealStatusAndLimitsManager$hasPassedIdv$$inlined$map$1$2$1) {
                    realStatusAndLimitsManager$hasPassedIdv$$inlined$map$1$2$1 = (RealStatusAndLimitsManager$hasPassedIdv$$inlined$map$1$2$1) continuation;
                    int i59 = realStatusAndLimitsManager$hasPassedIdv$$inlined$map$1$2$1.label;
                    if ((i59 & PKIFailureInfo.systemUnavail) != 0) {
                        realStatusAndLimitsManager$hasPassedIdv$$inlined$map$1$2$1.label = i59 - PKIFailureInfo.systemUnavail;
                        Object obj31 = realStatusAndLimitsManager$hasPassedIdv$$inlined$map$1$2$1.result;
                        CoroutineSingletons coroutineSingletons30 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i29 = realStatusAndLimitsManager$hasPassedIdv$$inlined$map$1$2$1.label;
                        if (i29 != 0) {
                            SafeTrace.throwOnFailure(obj31);
                            UiIdvState uiIdvState = (UiIdvState) obj;
                            if (uiIdvState != null && (bool = uiIdvState.has_verified_identity) != null) {
                                r5 = bool.booleanValue();
                            }
                            Boolean valueOf4 = Boolean.valueOf(r5);
                            realStatusAndLimitsManager$hasPassedIdv$$inlined$map$1$2$1.label = 1;
                            if (flowCollector.emit(valueOf4, realStatusAndLimitsManager$hasPassedIdv$$inlined$map$1$2$1) == coroutineSingletons30) {
                                break;
                            }
                        } else if (i29 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj31);
                        }
                        break;
                    }
                }
                realStatusAndLimitsManager$hasPassedIdv$$inlined$map$1$2$1 = new RealStatusAndLimitsManager$hasPassedIdv$$inlined$map$1$2$1(this, continuation);
                Object obj312 = realStatusAndLimitsManager$hasPassedIdv$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons302 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i29 = realStatusAndLimitsManager$hasPassedIdv$$inlined$map$1$2$1.label;
                if (i29 != 0) {
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ RealP2pSettingsManager$select$$inlined$map$1$2(FlowCollector flowCollector, int i) {
        this.$r8$classId = i;
        this.$this_unsafeFlow = flowCollector;
    }
}
