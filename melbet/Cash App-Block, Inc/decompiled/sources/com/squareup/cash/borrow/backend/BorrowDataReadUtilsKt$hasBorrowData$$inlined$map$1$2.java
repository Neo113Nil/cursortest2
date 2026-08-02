package com.squareup.cash.borrow.backend;

import androidx.lifecycle.Lifecycle;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.bitcoin.viewmodels.applet.scroll.BitcoinHomeScrollViewEvent;
import com.squareup.cash.bitcoin.views.applet.BitcoinHomeViewKt$HandleScrollEvents$1$1$invokeSuspend$$inlined$map$1$2$1;
import com.squareup.cash.blockers.presenters.CardActivationQrScannerPresenter$models$1$1$invokeSuspend$$inlined$filter$1$2$1;
import com.squareup.cash.blockers.presenters.CashtagPresenter$guessCashtagCurrencySymbol$$inlined$map$1$2$1;
import com.squareup.cash.blockers.presenters.FilesetUploadPresenter$launchCameraPermissionHandler$1$1$invokeSuspend$$inlined$filter$1$2$1;
import com.squareup.cash.blockers.presenters.FormBlockerPresenter$models$lambda$0$$inlined$map$1$2$1;
import com.squareup.cash.blockers.presenters.GpsLocationConsentBlockerPresenter$special$$inlined$filter$1$2$1;
import com.squareup.cash.blockers.presenters.GpsLocationConsentBlockerPresenter$special$$inlined$filter$2$2$1;
import com.squareup.cash.blockers.presenters.GpsLocationConsentBlockerPresenter$special$$inlined$map$1$2$1;
import com.squareup.cash.blockers.presenters.InputCardInfoPresenter$models$lambda$0$$inlined$map$1$2$1;
import com.squareup.cash.blockers.presenters.InviteFriendsPresenter$onContactsPermissionGranted$$inlined$filter$1$2$1;
import com.squareup.cash.blockers.presenters.PasscodeConfirmTypeTransformer$transform$1$invokeSuspend$$inlined$filterIsInstance$1$2$1;
import com.squareup.cash.blockers.presenters.PasscodeGenericGatedEndpointTypeTransformer$transform$1$invokeSuspend$$inlined$filterIsInstance$1$2$1;
import com.squareup.cash.blockers.presenters.PasscodeVerifyTypeTransformer$transform$1$invokeSuspend$$inlined$filterIsInstance$1$2$1;
import com.squareup.cash.blockers.presenters.ReferralCodePresenter$models$lambda$1$$inlined$map$1$2$1;
import com.squareup.cash.blockers.presenters.RemoteSkipPresenter$models$1$1$invokeSuspend$$inlined$filterIsInstance$1$2$1;
import com.squareup.cash.blockers.viewmodels.PasscodeViewEvent;
import com.squareup.cash.blockers.viewmodels.RemoteSkipEvent$Retry;
import com.squareup.cash.boost.backend.BoostCategory;
import com.squareup.cash.boost.backend.RealBoostProvider$getMerchantNameForReward$$inlined$map$1$2$1;
import com.squareup.cash.boost.backend.RealBoostProvider$getSelectableRewardTokenForMerchant$$inlined$map$1$2$1;
import com.squareup.cash.boost.backend.RealBoostProvider$getSelectedRewardToken$$inlined$map$1$2$1;
import com.squareup.cash.boost.backend.RealBoostRepository$getAllOrderedBoosts$$inlined$map$1$2$1;
import com.squareup.cash.boost.backend.RealBoostRepository$getLockedBoostTokens$$inlined$map$1$2$1;
import com.squareup.cash.boost.backend.RealBoostRepository$getSelectedBoostTokens$$inlined$map$1$2$1;
import com.squareup.cash.boost.backend.RealBoostRepository$getYtdTotalSavings$$inlined$map$1$2$1;
import com.squareup.cash.boost.backend.RealBoostSelector$getOfferToken$lambda$0$$inlined$map$1$2$1;
import com.squareup.cash.boost.db.MerchantNameForRewardToken;
import com.squareup.cash.boost.db.RewardWithSelection;
import com.squareup.cash.boost.db.Slots;
import com.squareup.cash.boost.db.UserRewardsData;
import com.squareup.cash.bugreporting.presenters.BugReportingPresenter$models$lambda$3$$inlined$map$1$2$1;
import com.squareup.cash.clientsync.PayloadWithMetadata;
import com.squareup.cash.data.profile.ReferralManager$RewardStatus;
import com.squareup.cash.db.InstrumentLinkingConfig;
import com.squareup.cash.db.profile.ProfileAlias;
import com.squareup.cash.db2.profile.SelectRegion;
import com.squareup.cash.util.money.Moneys;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.api.UiAlias;
import com.squareup.protos.lending.sync_values.BorrowData;
import com.squareup.protos.lending.sync_values.GlobalBorrowData;
import com.squareup.protos.rewardly.common.RewardSlotState;
import com.squareup.util.cash.Cashtags;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowCollector;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes5.dex */
public final class BorrowDataReadUtilsKt$hasBorrowData$$inlined$map$1$2 implements FlowCollector {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ FlowCollector $this_unsafeFlow;

    /* renamed from: com.squareup.cash.borrow.backend.BorrowDataReadUtilsKt$hasBorrowData$$inlined$map$1$2$1, reason: invalid class name */
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
            return BorrowDataReadUtilsKt$hasBorrowData$$inlined$map$1$2.this.emit(null, this);
        }
    }

    public /* synthetic */ BorrowDataReadUtilsKt$hasBorrowData$$inlined$map$1$2(FlowCollector flowCollector, int i) {
        this.$r8$classId = i;
        this.$this_unsafeFlow = flowCollector;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x0370  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x037a  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x03ce  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x03d8  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x040c  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x0416  */
    /* JADX WARN: Removed duplicated region for block: B:339:0x046d  */
    /* JADX WARN: Removed duplicated region for block: B:345:0x0477  */
    /* JADX WARN: Removed duplicated region for block: B:360:0x04b1  */
    /* JADX WARN: Removed duplicated region for block: B:366:0x04bb  */
    /* JADX WARN: Removed duplicated region for block: B:380:0x04ed  */
    /* JADX WARN: Removed duplicated region for block: B:386:0x04f7  */
    /* JADX WARN: Removed duplicated region for block: B:398:0x052e  */
    /* JADX WARN: Removed duplicated region for block: B:404:0x0538  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:418:0x056a  */
    /* JADX WARN: Removed duplicated region for block: B:424:0x0574  */
    /* JADX WARN: Removed duplicated region for block: B:438:0x05a6  */
    /* JADX WARN: Removed duplicated region for block: B:444:0x05b0  */
    /* JADX WARN: Removed duplicated region for block: B:458:0x05e2  */
    /* JADX WARN: Removed duplicated region for block: B:464:0x05ec  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:478:0x0627  */
    /* JADX WARN: Removed duplicated region for block: B:484:0x0631  */
    /* JADX WARN: Removed duplicated region for block: B:496:0x0668  */
    /* JADX WARN: Removed duplicated region for block: B:502:0x0672  */
    /* JADX WARN: Removed duplicated region for block: B:514:0x06ac  */
    /* JADX WARN: Removed duplicated region for block: B:520:0x06b6  */
    /* JADX WARN: Removed duplicated region for block: B:538:0x06ff  */
    /* JADX WARN: Removed duplicated region for block: B:544:0x0709  */
    /* JADX WARN: Removed duplicated region for block: B:558:0x0740  */
    /* JADX WARN: Removed duplicated region for block: B:564:0x074a  */
    /* JADX WARN: Removed duplicated region for block: B:576:0x077c  */
    /* JADX WARN: Removed duplicated region for block: B:582:0x0786  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:596:0x07bd  */
    /* JADX WARN: Removed duplicated region for block: B:602:0x07c7  */
    /* JADX WARN: Removed duplicated region for block: B:614:0x0803  */
    /* JADX WARN: Removed duplicated region for block: B:620:0x080d  */
    /* JADX WARN: Removed duplicated region for block: B:634:0x0846  */
    /* JADX WARN: Removed duplicated region for block: B:640:0x0850  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:656:0x088b  */
    /* JADX WARN: Removed duplicated region for block: B:662:0x0895  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0128  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        AnonymousClass1 anonymousClass1;
        int i;
        BitcoinHomeViewKt$HandleScrollEvents$1$1$invokeSuspend$$inlined$map$1$2$1 bitcoinHomeViewKt$HandleScrollEvents$1$1$invokeSuspend$$inlined$map$1$2$1;
        int i2;
        CardActivationQrScannerPresenter$models$1$1$invokeSuspend$$inlined$filter$1$2$1 cardActivationQrScannerPresenter$models$1$1$invokeSuspend$$inlined$filter$1$2$1;
        int i3;
        CashtagPresenter$guessCashtagCurrencySymbol$$inlined$map$1$2$1 cashtagPresenter$guessCashtagCurrencySymbol$$inlined$map$1$2$1;
        int i4;
        FilesetUploadPresenter$launchCameraPermissionHandler$1$1$invokeSuspend$$inlined$filter$1$2$1 filesetUploadPresenter$launchCameraPermissionHandler$1$1$invokeSuspend$$inlined$filter$1$2$1;
        int i5;
        FormBlockerPresenter$models$lambda$0$$inlined$map$1$2$1 formBlockerPresenter$models$lambda$0$$inlined$map$1$2$1;
        int i6;
        GpsLocationConsentBlockerPresenter$special$$inlined$filter$1$2$1 gpsLocationConsentBlockerPresenter$special$$inlined$filter$1$2$1;
        int i7;
        GpsLocationConsentBlockerPresenter$special$$inlined$filter$2$2$1 gpsLocationConsentBlockerPresenter$special$$inlined$filter$2$2$1;
        int i8;
        GpsLocationConsentBlockerPresenter$special$$inlined$map$1$2$1 gpsLocationConsentBlockerPresenter$special$$inlined$map$1$2$1;
        int i9;
        InputCardInfoPresenter$models$lambda$0$$inlined$map$1$2$1 inputCardInfoPresenter$models$lambda$0$$inlined$map$1$2$1;
        int i10;
        InviteFriendsPresenter$onContactsPermissionGranted$$inlined$filter$1$2$1 inviteFriendsPresenter$onContactsPermissionGranted$$inlined$filter$1$2$1;
        int i11;
        PasscodeConfirmTypeTransformer$transform$1$invokeSuspend$$inlined$filterIsInstance$1$2$1 passcodeConfirmTypeTransformer$transform$1$invokeSuspend$$inlined$filterIsInstance$1$2$1;
        int i12;
        PasscodeGenericGatedEndpointTypeTransformer$transform$1$invokeSuspend$$inlined$filterIsInstance$1$2$1 passcodeGenericGatedEndpointTypeTransformer$transform$1$invokeSuspend$$inlined$filterIsInstance$1$2$1;
        int i13;
        PasscodeVerifyTypeTransformer$transform$1$invokeSuspend$$inlined$filterIsInstance$1$2$1 passcodeVerifyTypeTransformer$transform$1$invokeSuspend$$inlined$filterIsInstance$1$2$1;
        int i14;
        ReferralCodePresenter$models$lambda$1$$inlined$map$1$2$1 referralCodePresenter$models$lambda$1$$inlined$map$1$2$1;
        int i15;
        RemoteSkipPresenter$models$1$1$invokeSuspend$$inlined$filterIsInstance$1$2$1 remoteSkipPresenter$models$1$1$invokeSuspend$$inlined$filterIsInstance$1$2$1;
        int i16;
        RealBoostProvider$getMerchantNameForReward$$inlined$map$1$2$1 realBoostProvider$getMerchantNameForReward$$inlined$map$1$2$1;
        int i17;
        String str;
        RealBoostProvider$getSelectableRewardTokenForMerchant$$inlined$map$1$2$1 realBoostProvider$getSelectableRewardTokenForMerchant$$inlined$map$1$2$1;
        int i18;
        RealBoostProvider$getSelectedRewardToken$$inlined$map$1$2$1 realBoostProvider$getSelectedRewardToken$$inlined$map$1$2$1;
        int i19;
        RealBoostRepository$getAllOrderedBoosts$$inlined$map$1$2$1 realBoostRepository$getAllOrderedBoosts$$inlined$map$1$2$1;
        int i20;
        RealBoostRepository$getLockedBoostTokens$$inlined$map$1$2$1 realBoostRepository$getLockedBoostTokens$$inlined$map$1$2$1;
        int i21;
        RealBoostRepository$getSelectedBoostTokens$$inlined$map$1$2$1 realBoostRepository$getSelectedBoostTokens$$inlined$map$1$2$1;
        int i22;
        RealBoostRepository$getYtdTotalSavings$$inlined$map$1$2$1 realBoostRepository$getYtdTotalSavings$$inlined$map$1$2$1;
        int i23;
        RealBoostSelector$getOfferToken$lambda$0$$inlined$map$1$2$1 realBoostSelector$getOfferToken$lambda$0$$inlined$map$1$2$1;
        int i24;
        BorrowDataReadUtilsKt$allEntryPoints$$inlined$map$1$2$1 borrowDataReadUtilsKt$allEntryPoints$$inlined$map$1$2$1;
        int i25;
        Object obj2;
        BorrowDataReadUtilsKt$allEntryPoints$$inlined$map$2$2$1 borrowDataReadUtilsKt$allEntryPoints$$inlined$map$2$2$1;
        int i26;
        Object obj3;
        GlobalBorrowData globalBorrowData;
        RealBorrowDataManager$borrowHomeTiles$$inlined$map$1$2$1 realBorrowDataManager$borrowHomeTiles$$inlined$map$1$2$1;
        int i27;
        Object obj4;
        BorrowData borrowData;
        BorrowData.AppletData appletData;
        RealBorrowDataManager$borrowHomeTitle$$inlined$map$1$2$1 realBorrowDataManager$borrowHomeTitle$$inlined$map$1$2$1;
        int i28;
        String str2;
        BorrowData borrowData2;
        BorrowData.AppletData appletData2;
        LocalizedString localizedString;
        RealBorrowDataManager$borrowLandingFallbackClientRoute$$inlined$map$1$2$1 realBorrowDataManager$borrowLandingFallbackClientRoute$$inlined$map$1$2$1;
        int i29;
        BugReportingPresenter$models$lambda$3$$inlined$map$1$2$1 bugReportingPresenter$models$lambda$3$$inlined$map$1$2$1;
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
                        Object obj5 = anonymousClass1.result;
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i = anonymousClass1.label;
                        if (i != 0) {
                            SafeTrace.throwOnFailure(obj5);
                            Boolean valueOf = Boolean.valueOf(((PayloadWithMetadata) obj) != null);
                            anonymousClass1.label = 1;
                            if (flowCollector.emit(valueOf, anonymousClass1) == coroutineSingletons) {
                                break;
                            }
                        } else if (i != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj5);
                        }
                        break;
                    }
                }
                anonymousClass1 = new AnonymousClass1(continuation);
                Object obj52 = anonymousClass1.result;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = anonymousClass1.label;
                if (i != 0) {
                }
            case 1:
                if (continuation instanceof BitcoinHomeViewKt$HandleScrollEvents$1$1$invokeSuspend$$inlined$map$1$2$1) {
                    bitcoinHomeViewKt$HandleScrollEvents$1$1$invokeSuspend$$inlined$map$1$2$1 = (BitcoinHomeViewKt$HandleScrollEvents$1$1$invokeSuspend$$inlined$map$1$2$1) continuation;
                    int i33 = bitcoinHomeViewKt$HandleScrollEvents$1$1$invokeSuspend$$inlined$map$1$2$1.label;
                    if ((i33 & PKIFailureInfo.systemUnavail) != 0) {
                        bitcoinHomeViewKt$HandleScrollEvents$1$1$invokeSuspend$$inlined$map$1$2$1.label = i33 - PKIFailureInfo.systemUnavail;
                        Object obj6 = bitcoinHomeViewKt$HandleScrollEvents$1$1$invokeSuspend$$inlined$map$1$2$1.result;
                        CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i2 = bitcoinHomeViewKt$HandleScrollEvents$1$1$invokeSuspend$$inlined$map$1$2$1.label;
                        if (i2 != 0) {
                            SafeTrace.throwOnFailure(obj6);
                            Object obj7 = ((Boolean) obj).booleanValue() ? BitcoinHomeScrollViewEvent.ScrollStarted.INSTANCE : BitcoinHomeScrollViewEvent.ScrollStopped.INSTANCE;
                            bitcoinHomeViewKt$HandleScrollEvents$1$1$invokeSuspend$$inlined$map$1$2$1.label = 1;
                            if (flowCollector.emit(obj7, bitcoinHomeViewKt$HandleScrollEvents$1$1$invokeSuspend$$inlined$map$1$2$1) == coroutineSingletons3) {
                                break;
                            }
                        } else if (i2 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj6);
                        }
                        break;
                    }
                }
                bitcoinHomeViewKt$HandleScrollEvents$1$1$invokeSuspend$$inlined$map$1$2$1 = new BitcoinHomeViewKt$HandleScrollEvents$1$1$invokeSuspend$$inlined$map$1$2$1(this, continuation);
                Object obj62 = bitcoinHomeViewKt$HandleScrollEvents$1$1$invokeSuspend$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons32 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = bitcoinHomeViewKt$HandleScrollEvents$1$1$invokeSuspend$$inlined$map$1$2$1.label;
                if (i2 != 0) {
                }
            case 2:
                if (continuation instanceof CardActivationQrScannerPresenter$models$1$1$invokeSuspend$$inlined$filter$1$2$1) {
                    cardActivationQrScannerPresenter$models$1$1$invokeSuspend$$inlined$filter$1$2$1 = (CardActivationQrScannerPresenter$models$1$1$invokeSuspend$$inlined$filter$1$2$1) continuation;
                    int i34 = cardActivationQrScannerPresenter$models$1$1$invokeSuspend$$inlined$filter$1$2$1.label;
                    if ((i34 & PKIFailureInfo.systemUnavail) != 0) {
                        cardActivationQrScannerPresenter$models$1$1$invokeSuspend$$inlined$filter$1$2$1.label = i34 - PKIFailureInfo.systemUnavail;
                        Object obj8 = cardActivationQrScannerPresenter$models$1$1$invokeSuspend$$inlined$filter$1$2$1.result;
                        CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i3 = cardActivationQrScannerPresenter$models$1$1$invokeSuspend$$inlined$filter$1$2$1.label;
                        if (i3 != 0) {
                            SafeTrace.throwOnFailure(obj8);
                            if (Intrinsics.areEqual((String) obj, "android.permission.CAMERA")) {
                                cardActivationQrScannerPresenter$models$1$1$invokeSuspend$$inlined$filter$1$2$1.label = 1;
                                if (flowCollector.emit(obj, cardActivationQrScannerPresenter$models$1$1$invokeSuspend$$inlined$filter$1$2$1) == coroutineSingletons4) {
                                    break;
                                }
                            }
                        } else if (i3 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj8);
                        }
                        break;
                    }
                }
                cardActivationQrScannerPresenter$models$1$1$invokeSuspend$$inlined$filter$1$2$1 = new CardActivationQrScannerPresenter$models$1$1$invokeSuspend$$inlined$filter$1$2$1(this, continuation);
                Object obj82 = cardActivationQrScannerPresenter$models$1$1$invokeSuspend$$inlined$filter$1$2$1.result;
                CoroutineSingletons coroutineSingletons42 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i3 = cardActivationQrScannerPresenter$models$1$1$invokeSuspend$$inlined$filter$1$2$1.label;
                if (i3 != 0) {
                }
            case 3:
                if (continuation instanceof CashtagPresenter$guessCashtagCurrencySymbol$$inlined$map$1$2$1) {
                    cashtagPresenter$guessCashtagCurrencySymbol$$inlined$map$1$2$1 = (CashtagPresenter$guessCashtagCurrencySymbol$$inlined$map$1$2$1) continuation;
                    int i35 = cashtagPresenter$guessCashtagCurrencySymbol$$inlined$map$1$2$1.label;
                    if ((i35 & PKIFailureInfo.systemUnavail) != 0) {
                        cashtagPresenter$guessCashtagCurrencySymbol$$inlined$map$1$2$1.label = i35 - PKIFailureInfo.systemUnavail;
                        Object obj9 = cashtagPresenter$guessCashtagCurrencySymbol$$inlined$map$1$2$1.result;
                        CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i4 = cashtagPresenter$guessCashtagCurrencySymbol$$inlined$map$1$2$1.label;
                        if (i4 != 0) {
                            SafeTrace.throwOnFailure(obj9);
                            Set set = Cashtags.SUPPORTED_SYMBOLS;
                            String symbol = Moneys.symbol(Cashtags.guessCashtagCurrency(((SelectRegion) obj).region));
                            cashtagPresenter$guessCashtagCurrencySymbol$$inlined$map$1$2$1.label = 1;
                            if (flowCollector.emit(symbol, cashtagPresenter$guessCashtagCurrencySymbol$$inlined$map$1$2$1) == coroutineSingletons5) {
                                break;
                            }
                        } else if (i4 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj9);
                        }
                        break;
                    }
                }
                cashtagPresenter$guessCashtagCurrencySymbol$$inlined$map$1$2$1 = new CashtagPresenter$guessCashtagCurrencySymbol$$inlined$map$1$2$1(this, continuation);
                Object obj92 = cashtagPresenter$guessCashtagCurrencySymbol$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons52 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i4 = cashtagPresenter$guessCashtagCurrencySymbol$$inlined$map$1$2$1.label;
                if (i4 != 0) {
                }
            case 4:
                if (continuation instanceof FilesetUploadPresenter$launchCameraPermissionHandler$1$1$invokeSuspend$$inlined$filter$1$2$1) {
                    filesetUploadPresenter$launchCameraPermissionHandler$1$1$invokeSuspend$$inlined$filter$1$2$1 = (FilesetUploadPresenter$launchCameraPermissionHandler$1$1$invokeSuspend$$inlined$filter$1$2$1) continuation;
                    int i36 = filesetUploadPresenter$launchCameraPermissionHandler$1$1$invokeSuspend$$inlined$filter$1$2$1.label;
                    if ((i36 & PKIFailureInfo.systemUnavail) != 0) {
                        filesetUploadPresenter$launchCameraPermissionHandler$1$1$invokeSuspend$$inlined$filter$1$2$1.label = i36 - PKIFailureInfo.systemUnavail;
                        Object obj10 = filesetUploadPresenter$launchCameraPermissionHandler$1$1$invokeSuspend$$inlined$filter$1$2$1.result;
                        CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i5 = filesetUploadPresenter$launchCameraPermissionHandler$1$1$invokeSuspend$$inlined$filter$1$2$1.label;
                        if (i5 != 0) {
                            SafeTrace.throwOnFailure(obj10);
                            if (((Boolean) obj).booleanValue()) {
                                filesetUploadPresenter$launchCameraPermissionHandler$1$1$invokeSuspend$$inlined$filter$1$2$1.label = 1;
                                if (flowCollector.emit(obj, filesetUploadPresenter$launchCameraPermissionHandler$1$1$invokeSuspend$$inlined$filter$1$2$1) == coroutineSingletons6) {
                                    break;
                                }
                            }
                        } else if (i5 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj10);
                        }
                        break;
                    }
                }
                filesetUploadPresenter$launchCameraPermissionHandler$1$1$invokeSuspend$$inlined$filter$1$2$1 = new FilesetUploadPresenter$launchCameraPermissionHandler$1$1$invokeSuspend$$inlined$filter$1$2$1(this, continuation);
                Object obj102 = filesetUploadPresenter$launchCameraPermissionHandler$1$1$invokeSuspend$$inlined$filter$1$2$1.result;
                CoroutineSingletons coroutineSingletons62 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i5 = filesetUploadPresenter$launchCameraPermissionHandler$1$1$invokeSuspend$$inlined$filter$1$2$1.label;
                if (i5 != 0) {
                }
            case 5:
                if (continuation instanceof FormBlockerPresenter$models$lambda$0$$inlined$map$1$2$1) {
                    formBlockerPresenter$models$lambda$0$$inlined$map$1$2$1 = (FormBlockerPresenter$models$lambda$0$$inlined$map$1$2$1) continuation;
                    int i37 = formBlockerPresenter$models$lambda$0$$inlined$map$1$2$1.label;
                    if ((i37 & PKIFailureInfo.systemUnavail) != 0) {
                        formBlockerPresenter$models$lambda$0$$inlined$map$1$2$1.label = i37 - PKIFailureInfo.systemUnavail;
                        Object obj11 = formBlockerPresenter$models$lambda$0$$inlined$map$1$2$1.result;
                        CoroutineSingletons coroutineSingletons7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i6 = formBlockerPresenter$models$lambda$0$$inlined$map$1$2$1.label;
                        if (i6 != 0) {
                            SafeTrace.throwOnFailure(obj11);
                            Boolean bool = Boolean.TRUE;
                            formBlockerPresenter$models$lambda$0$$inlined$map$1$2$1.label = 1;
                            if (flowCollector.emit(bool, formBlockerPresenter$models$lambda$0$$inlined$map$1$2$1) == coroutineSingletons7) {
                                break;
                            }
                        } else if (i6 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj11);
                        }
                        break;
                    }
                }
                formBlockerPresenter$models$lambda$0$$inlined$map$1$2$1 = new FormBlockerPresenter$models$lambda$0$$inlined$map$1$2$1(this, continuation);
                Object obj112 = formBlockerPresenter$models$lambda$0$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons72 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i6 = formBlockerPresenter$models$lambda$0$$inlined$map$1$2$1.label;
                if (i6 != 0) {
                }
            case 6:
                if (continuation instanceof GpsLocationConsentBlockerPresenter$special$$inlined$filter$1$2$1) {
                    gpsLocationConsentBlockerPresenter$special$$inlined$filter$1$2$1 = (GpsLocationConsentBlockerPresenter$special$$inlined$filter$1$2$1) continuation;
                    int i38 = gpsLocationConsentBlockerPresenter$special$$inlined$filter$1$2$1.label;
                    if ((i38 & PKIFailureInfo.systemUnavail) != 0) {
                        gpsLocationConsentBlockerPresenter$special$$inlined$filter$1$2$1.label = i38 - PKIFailureInfo.systemUnavail;
                        Object obj12 = gpsLocationConsentBlockerPresenter$special$$inlined$filter$1$2$1.result;
                        CoroutineSingletons coroutineSingletons8 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i7 = gpsLocationConsentBlockerPresenter$special$$inlined$filter$1$2$1.label;
                        if (i7 != 0) {
                            SafeTrace.throwOnFailure(obj12);
                            if (((Boolean) obj).booleanValue()) {
                                gpsLocationConsentBlockerPresenter$special$$inlined$filter$1$2$1.label = 1;
                                if (flowCollector.emit(obj, gpsLocationConsentBlockerPresenter$special$$inlined$filter$1$2$1) == coroutineSingletons8) {
                                    break;
                                }
                            }
                        } else if (i7 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj12);
                        }
                        break;
                    }
                }
                gpsLocationConsentBlockerPresenter$special$$inlined$filter$1$2$1 = new GpsLocationConsentBlockerPresenter$special$$inlined$filter$1$2$1(this, continuation);
                Object obj122 = gpsLocationConsentBlockerPresenter$special$$inlined$filter$1$2$1.result;
                CoroutineSingletons coroutineSingletons82 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i7 = gpsLocationConsentBlockerPresenter$special$$inlined$filter$1$2$1.label;
                if (i7 != 0) {
                }
            case 7:
                if (continuation instanceof GpsLocationConsentBlockerPresenter$special$$inlined$filter$2$2$1) {
                    gpsLocationConsentBlockerPresenter$special$$inlined$filter$2$2$1 = (GpsLocationConsentBlockerPresenter$special$$inlined$filter$2$2$1) continuation;
                    int i39 = gpsLocationConsentBlockerPresenter$special$$inlined$filter$2$2$1.label;
                    if ((i39 & PKIFailureInfo.systemUnavail) != 0) {
                        gpsLocationConsentBlockerPresenter$special$$inlined$filter$2$2$1.label = i39 - PKIFailureInfo.systemUnavail;
                        Object obj13 = gpsLocationConsentBlockerPresenter$special$$inlined$filter$2$2$1.result;
                        CoroutineSingletons coroutineSingletons9 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i8 = gpsLocationConsentBlockerPresenter$special$$inlined$filter$2$2$1.label;
                        if (i8 != 0) {
                            SafeTrace.throwOnFailure(obj13);
                            String str3 = (String) obj;
                            if (Intrinsics.areEqual(str3, "android.permission.ACCESS_COARSE_LOCATION") || Intrinsics.areEqual(str3, "android.permission.ACCESS_FINE_LOCATION") || Intrinsics.areEqual(str3, "android.permission.ACCESS_BACKGROUND_LOCATION")) {
                                gpsLocationConsentBlockerPresenter$special$$inlined$filter$2$2$1.label = 1;
                                if (flowCollector.emit(obj, gpsLocationConsentBlockerPresenter$special$$inlined$filter$2$2$1) == coroutineSingletons9) {
                                    break;
                                }
                            }
                        } else if (i8 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj13);
                        }
                        break;
                    }
                }
                gpsLocationConsentBlockerPresenter$special$$inlined$filter$2$2$1 = new GpsLocationConsentBlockerPresenter$special$$inlined$filter$2$2$1(this, continuation);
                Object obj132 = gpsLocationConsentBlockerPresenter$special$$inlined$filter$2$2$1.result;
                CoroutineSingletons coroutineSingletons92 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i8 = gpsLocationConsentBlockerPresenter$special$$inlined$filter$2$2$1.label;
                if (i8 != 0) {
                }
                break;
            case 8:
                if (continuation instanceof GpsLocationConsentBlockerPresenter$special$$inlined$map$1$2$1) {
                    gpsLocationConsentBlockerPresenter$special$$inlined$map$1$2$1 = (GpsLocationConsentBlockerPresenter$special$$inlined$map$1$2$1) continuation;
                    int i40 = gpsLocationConsentBlockerPresenter$special$$inlined$map$1$2$1.label;
                    if ((i40 & PKIFailureInfo.systemUnavail) != 0) {
                        gpsLocationConsentBlockerPresenter$special$$inlined$map$1$2$1.label = i40 - PKIFailureInfo.systemUnavail;
                        Object obj14 = gpsLocationConsentBlockerPresenter$special$$inlined$map$1$2$1.result;
                        CoroutineSingletons coroutineSingletons10 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i9 = gpsLocationConsentBlockerPresenter$special$$inlined$map$1$2$1.label;
                        if (i9 != 0) {
                            SafeTrace.throwOnFailure(obj14);
                            Boolean valueOf2 = Boolean.valueOf(((Lifecycle.State) obj).isAtLeast(Lifecycle.State.RESUMED));
                            gpsLocationConsentBlockerPresenter$special$$inlined$map$1$2$1.label = 1;
                            if (flowCollector.emit(valueOf2, gpsLocationConsentBlockerPresenter$special$$inlined$map$1$2$1) == coroutineSingletons10) {
                                break;
                            }
                        } else if (i9 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj14);
                        }
                        break;
                    }
                }
                gpsLocationConsentBlockerPresenter$special$$inlined$map$1$2$1 = new GpsLocationConsentBlockerPresenter$special$$inlined$map$1$2$1(this, continuation);
                Object obj142 = gpsLocationConsentBlockerPresenter$special$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons102 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i9 = gpsLocationConsentBlockerPresenter$special$$inlined$map$1$2$1.label;
                if (i9 != 0) {
                }
            case 9:
                if (continuation instanceof InputCardInfoPresenter$models$lambda$0$$inlined$map$1$2$1) {
                    inputCardInfoPresenter$models$lambda$0$$inlined$map$1$2$1 = (InputCardInfoPresenter$models$lambda$0$$inlined$map$1$2$1) continuation;
                    int i41 = inputCardInfoPresenter$models$lambda$0$$inlined$map$1$2$1.label;
                    if ((i41 & PKIFailureInfo.systemUnavail) != 0) {
                        inputCardInfoPresenter$models$lambda$0$$inlined$map$1$2$1.label = i41 - PKIFailureInfo.systemUnavail;
                        Object obj15 = inputCardInfoPresenter$models$lambda$0$$inlined$map$1$2$1.result;
                        CoroutineSingletons coroutineSingletons11 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i10 = inputCardInfoPresenter$models$lambda$0$$inlined$map$1$2$1.label;
                        if (i10 != 0) {
                            SafeTrace.throwOnFailure(obj15);
                            Long l = new Long(((InstrumentLinkingConfig) obj).credit_card_fee_bps);
                            inputCardInfoPresenter$models$lambda$0$$inlined$map$1$2$1.label = 1;
                            if (flowCollector.emit(l, inputCardInfoPresenter$models$lambda$0$$inlined$map$1$2$1) == coroutineSingletons11) {
                                break;
                            }
                        } else if (i10 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj15);
                        }
                        break;
                    }
                }
                inputCardInfoPresenter$models$lambda$0$$inlined$map$1$2$1 = new InputCardInfoPresenter$models$lambda$0$$inlined$map$1$2$1(this, continuation);
                Object obj152 = inputCardInfoPresenter$models$lambda$0$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons112 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i10 = inputCardInfoPresenter$models$lambda$0$$inlined$map$1$2$1.label;
                if (i10 != 0) {
                }
            case 10:
                if (continuation instanceof InviteFriendsPresenter$onContactsPermissionGranted$$inlined$filter$1$2$1) {
                    inviteFriendsPresenter$onContactsPermissionGranted$$inlined$filter$1$2$1 = (InviteFriendsPresenter$onContactsPermissionGranted$$inlined$filter$1$2$1) continuation;
                    int i42 = inviteFriendsPresenter$onContactsPermissionGranted$$inlined$filter$1$2$1.label;
                    if ((i42 & PKIFailureInfo.systemUnavail) != 0) {
                        inviteFriendsPresenter$onContactsPermissionGranted$$inlined$filter$1$2$1.label = i42 - PKIFailureInfo.systemUnavail;
                        Object obj16 = inviteFriendsPresenter$onContactsPermissionGranted$$inlined$filter$1$2$1.result;
                        CoroutineSingletons coroutineSingletons12 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i11 = inviteFriendsPresenter$onContactsPermissionGranted$$inlined$filter$1$2$1.label;
                        if (i11 != 0) {
                            SafeTrace.throwOnFailure(obj16);
                            if (((Boolean) ((Pair) obj).first).booleanValue()) {
                                inviteFriendsPresenter$onContactsPermissionGranted$$inlined$filter$1$2$1.label = 1;
                                if (flowCollector.emit(obj, inviteFriendsPresenter$onContactsPermissionGranted$$inlined$filter$1$2$1) == coroutineSingletons12) {
                                    break;
                                }
                            }
                        } else if (i11 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj16);
                        }
                        break;
                    }
                }
                inviteFriendsPresenter$onContactsPermissionGranted$$inlined$filter$1$2$1 = new InviteFriendsPresenter$onContactsPermissionGranted$$inlined$filter$1$2$1(this, continuation);
                Object obj162 = inviteFriendsPresenter$onContactsPermissionGranted$$inlined$filter$1$2$1.result;
                CoroutineSingletons coroutineSingletons122 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i11 = inviteFriendsPresenter$onContactsPermissionGranted$$inlined$filter$1$2$1.label;
                if (i11 != 0) {
                }
            case 11:
                if (continuation instanceof PasscodeConfirmTypeTransformer$transform$1$invokeSuspend$$inlined$filterIsInstance$1$2$1) {
                    passcodeConfirmTypeTransformer$transform$1$invokeSuspend$$inlined$filterIsInstance$1$2$1 = (PasscodeConfirmTypeTransformer$transform$1$invokeSuspend$$inlined$filterIsInstance$1$2$1) continuation;
                    int i43 = passcodeConfirmTypeTransformer$transform$1$invokeSuspend$$inlined$filterIsInstance$1$2$1.label;
                    if ((i43 & PKIFailureInfo.systemUnavail) != 0) {
                        passcodeConfirmTypeTransformer$transform$1$invokeSuspend$$inlined$filterIsInstance$1$2$1.label = i43 - PKIFailureInfo.systemUnavail;
                        Object obj17 = passcodeConfirmTypeTransformer$transform$1$invokeSuspend$$inlined$filterIsInstance$1$2$1.result;
                        CoroutineSingletons coroutineSingletons13 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i12 = passcodeConfirmTypeTransformer$transform$1$invokeSuspend$$inlined$filterIsInstance$1$2$1.label;
                        if (i12 != 0) {
                            SafeTrace.throwOnFailure(obj17);
                            if (obj instanceof PasscodeViewEvent.VerifyPasscode) {
                                passcodeConfirmTypeTransformer$transform$1$invokeSuspend$$inlined$filterIsInstance$1$2$1.label = 1;
                                if (flowCollector.emit(obj, passcodeConfirmTypeTransformer$transform$1$invokeSuspend$$inlined$filterIsInstance$1$2$1) == coroutineSingletons13) {
                                    break;
                                }
                            }
                        } else if (i12 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj17);
                        }
                        break;
                    }
                }
                passcodeConfirmTypeTransformer$transform$1$invokeSuspend$$inlined$filterIsInstance$1$2$1 = new PasscodeConfirmTypeTransformer$transform$1$invokeSuspend$$inlined$filterIsInstance$1$2$1(this, continuation);
                Object obj172 = passcodeConfirmTypeTransformer$transform$1$invokeSuspend$$inlined$filterIsInstance$1$2$1.result;
                CoroutineSingletons coroutineSingletons132 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i12 = passcodeConfirmTypeTransformer$transform$1$invokeSuspend$$inlined$filterIsInstance$1$2$1.label;
                if (i12 != 0) {
                }
            case 12:
                if (continuation instanceof PasscodeGenericGatedEndpointTypeTransformer$transform$1$invokeSuspend$$inlined$filterIsInstance$1$2$1) {
                    passcodeGenericGatedEndpointTypeTransformer$transform$1$invokeSuspend$$inlined$filterIsInstance$1$2$1 = (PasscodeGenericGatedEndpointTypeTransformer$transform$1$invokeSuspend$$inlined$filterIsInstance$1$2$1) continuation;
                    int i44 = passcodeGenericGatedEndpointTypeTransformer$transform$1$invokeSuspend$$inlined$filterIsInstance$1$2$1.label;
                    if ((i44 & PKIFailureInfo.systemUnavail) != 0) {
                        passcodeGenericGatedEndpointTypeTransformer$transform$1$invokeSuspend$$inlined$filterIsInstance$1$2$1.label = i44 - PKIFailureInfo.systemUnavail;
                        Object obj18 = passcodeGenericGatedEndpointTypeTransformer$transform$1$invokeSuspend$$inlined$filterIsInstance$1$2$1.result;
                        CoroutineSingletons coroutineSingletons14 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i13 = passcodeGenericGatedEndpointTypeTransformer$transform$1$invokeSuspend$$inlined$filterIsInstance$1$2$1.label;
                        if (i13 != 0) {
                            SafeTrace.throwOnFailure(obj18);
                            if (obj instanceof PasscodeViewEvent.VerifyPasscode) {
                                passcodeGenericGatedEndpointTypeTransformer$transform$1$invokeSuspend$$inlined$filterIsInstance$1$2$1.label = 1;
                                if (flowCollector.emit(obj, passcodeGenericGatedEndpointTypeTransformer$transform$1$invokeSuspend$$inlined$filterIsInstance$1$2$1) == coroutineSingletons14) {
                                    break;
                                }
                            }
                        } else if (i13 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj18);
                        }
                        break;
                    }
                }
                passcodeGenericGatedEndpointTypeTransformer$transform$1$invokeSuspend$$inlined$filterIsInstance$1$2$1 = new PasscodeGenericGatedEndpointTypeTransformer$transform$1$invokeSuspend$$inlined$filterIsInstance$1$2$1(this, continuation);
                Object obj182 = passcodeGenericGatedEndpointTypeTransformer$transform$1$invokeSuspend$$inlined$filterIsInstance$1$2$1.result;
                CoroutineSingletons coroutineSingletons142 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i13 = passcodeGenericGatedEndpointTypeTransformer$transform$1$invokeSuspend$$inlined$filterIsInstance$1$2$1.label;
                if (i13 != 0) {
                }
            case 13:
                if (continuation instanceof PasscodeVerifyTypeTransformer$transform$1$invokeSuspend$$inlined$filterIsInstance$1$2$1) {
                    passcodeVerifyTypeTransformer$transform$1$invokeSuspend$$inlined$filterIsInstance$1$2$1 = (PasscodeVerifyTypeTransformer$transform$1$invokeSuspend$$inlined$filterIsInstance$1$2$1) continuation;
                    int i45 = passcodeVerifyTypeTransformer$transform$1$invokeSuspend$$inlined$filterIsInstance$1$2$1.label;
                    if ((i45 & PKIFailureInfo.systemUnavail) != 0) {
                        passcodeVerifyTypeTransformer$transform$1$invokeSuspend$$inlined$filterIsInstance$1$2$1.label = i45 - PKIFailureInfo.systemUnavail;
                        Object obj19 = passcodeVerifyTypeTransformer$transform$1$invokeSuspend$$inlined$filterIsInstance$1$2$1.result;
                        CoroutineSingletons coroutineSingletons15 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i14 = passcodeVerifyTypeTransformer$transform$1$invokeSuspend$$inlined$filterIsInstance$1$2$1.label;
                        if (i14 != 0) {
                            SafeTrace.throwOnFailure(obj19);
                            if (obj instanceof PasscodeViewEvent.VerifyPasscode) {
                                passcodeVerifyTypeTransformer$transform$1$invokeSuspend$$inlined$filterIsInstance$1$2$1.label = 1;
                                if (flowCollector.emit(obj, passcodeVerifyTypeTransformer$transform$1$invokeSuspend$$inlined$filterIsInstance$1$2$1) == coroutineSingletons15) {
                                    break;
                                }
                            }
                        } else if (i14 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj19);
                        }
                        break;
                    }
                }
                passcodeVerifyTypeTransformer$transform$1$invokeSuspend$$inlined$filterIsInstance$1$2$1 = new PasscodeVerifyTypeTransformer$transform$1$invokeSuspend$$inlined$filterIsInstance$1$2$1(this, continuation);
                Object obj192 = passcodeVerifyTypeTransformer$transform$1$invokeSuspend$$inlined$filterIsInstance$1$2$1.result;
                CoroutineSingletons coroutineSingletons152 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i14 = passcodeVerifyTypeTransformer$transform$1$invokeSuspend$$inlined$filterIsInstance$1$2$1.label;
                if (i14 != 0) {
                }
            case 14:
                if (continuation instanceof ReferralCodePresenter$models$lambda$1$$inlined$map$1$2$1) {
                    referralCodePresenter$models$lambda$1$$inlined$map$1$2$1 = (ReferralCodePresenter$models$lambda$1$$inlined$map$1$2$1) continuation;
                    int i46 = referralCodePresenter$models$lambda$1$$inlined$map$1$2$1.label;
                    if ((i46 & PKIFailureInfo.systemUnavail) != 0) {
                        referralCodePresenter$models$lambda$1$$inlined$map$1$2$1.label = i46 - PKIFailureInfo.systemUnavail;
                        Object obj20 = referralCodePresenter$models$lambda$1$$inlined$map$1$2$1.result;
                        CoroutineSingletons coroutineSingletons16 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i15 = referralCodePresenter$models$lambda$1$$inlined$map$1$2$1.label;
                        if (i15 != 0) {
                            SafeTrace.throwOnFailure(obj20);
                            Integer num = new Integer(((ReferralManager$RewardStatus) obj).minimum_code_length);
                            referralCodePresenter$models$lambda$1$$inlined$map$1$2$1.label = 1;
                            if (flowCollector.emit(num, referralCodePresenter$models$lambda$1$$inlined$map$1$2$1) == coroutineSingletons16) {
                                break;
                            }
                        } else if (i15 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj20);
                        }
                        break;
                    }
                }
                referralCodePresenter$models$lambda$1$$inlined$map$1$2$1 = new ReferralCodePresenter$models$lambda$1$$inlined$map$1$2$1(this, continuation);
                Object obj202 = referralCodePresenter$models$lambda$1$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons162 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i15 = referralCodePresenter$models$lambda$1$$inlined$map$1$2$1.label;
                if (i15 != 0) {
                }
            case 15:
                if (continuation instanceof RemoteSkipPresenter$models$1$1$invokeSuspend$$inlined$filterIsInstance$1$2$1) {
                    remoteSkipPresenter$models$1$1$invokeSuspend$$inlined$filterIsInstance$1$2$1 = (RemoteSkipPresenter$models$1$1$invokeSuspend$$inlined$filterIsInstance$1$2$1) continuation;
                    int i47 = remoteSkipPresenter$models$1$1$invokeSuspend$$inlined$filterIsInstance$1$2$1.label;
                    if ((i47 & PKIFailureInfo.systemUnavail) != 0) {
                        remoteSkipPresenter$models$1$1$invokeSuspend$$inlined$filterIsInstance$1$2$1.label = i47 - PKIFailureInfo.systemUnavail;
                        Object obj21 = remoteSkipPresenter$models$1$1$invokeSuspend$$inlined$filterIsInstance$1$2$1.result;
                        CoroutineSingletons coroutineSingletons17 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i16 = remoteSkipPresenter$models$1$1$invokeSuspend$$inlined$filterIsInstance$1$2$1.label;
                        if (i16 != 0) {
                            SafeTrace.throwOnFailure(obj21);
                            if (obj instanceof RemoteSkipEvent$Retry) {
                                remoteSkipPresenter$models$1$1$invokeSuspend$$inlined$filterIsInstance$1$2$1.label = 1;
                                if (flowCollector.emit(obj, remoteSkipPresenter$models$1$1$invokeSuspend$$inlined$filterIsInstance$1$2$1) == coroutineSingletons17) {
                                    break;
                                }
                            }
                        } else if (i16 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj21);
                        }
                        break;
                    }
                }
                remoteSkipPresenter$models$1$1$invokeSuspend$$inlined$filterIsInstance$1$2$1 = new RemoteSkipPresenter$models$1$1$invokeSuspend$$inlined$filterIsInstance$1$2$1(this, continuation);
                Object obj212 = remoteSkipPresenter$models$1$1$invokeSuspend$$inlined$filterIsInstance$1$2$1.result;
                CoroutineSingletons coroutineSingletons172 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i16 = remoteSkipPresenter$models$1$1$invokeSuspend$$inlined$filterIsInstance$1$2$1.label;
                if (i16 != 0) {
                }
            case 16:
                if (continuation instanceof RealBoostProvider$getMerchantNameForReward$$inlined$map$1$2$1) {
                    realBoostProvider$getMerchantNameForReward$$inlined$map$1$2$1 = (RealBoostProvider$getMerchantNameForReward$$inlined$map$1$2$1) continuation;
                    int i48 = realBoostProvider$getMerchantNameForReward$$inlined$map$1$2$1.label;
                    if ((i48 & PKIFailureInfo.systemUnavail) != 0) {
                        realBoostProvider$getMerchantNameForReward$$inlined$map$1$2$1.label = i48 - PKIFailureInfo.systemUnavail;
                        Object obj22 = realBoostProvider$getMerchantNameForReward$$inlined$map$1$2$1.result;
                        CoroutineSingletons coroutineSingletons18 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i17 = realBoostProvider$getMerchantNameForReward$$inlined$map$1$2$1.label;
                        if (i17 != 0) {
                            SafeTrace.throwOnFailure(obj22);
                            MerchantNameForRewardToken merchantNameForRewardToken = (MerchantNameForRewardToken) CollectionsKt.firstOrNull((List) obj);
                            str = merchantNameForRewardToken != null ? merchantNameForRewardToken.merchant_name : null;
                            realBoostProvider$getMerchantNameForReward$$inlined$map$1$2$1.label = 1;
                            if (flowCollector.emit(str, realBoostProvider$getMerchantNameForReward$$inlined$map$1$2$1) == coroutineSingletons18) {
                                break;
                            }
                        } else if (i17 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj22);
                        }
                        break;
                    }
                }
                realBoostProvider$getMerchantNameForReward$$inlined$map$1$2$1 = new RealBoostProvider$getMerchantNameForReward$$inlined$map$1$2$1(this, continuation);
                Object obj222 = realBoostProvider$getMerchantNameForReward$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons182 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i17 = realBoostProvider$getMerchantNameForReward$$inlined$map$1$2$1.label;
                if (i17 != 0) {
                }
            case 17:
                if (continuation instanceof RealBoostProvider$getSelectableRewardTokenForMerchant$$inlined$map$1$2$1) {
                    realBoostProvider$getSelectableRewardTokenForMerchant$$inlined$map$1$2$1 = (RealBoostProvider$getSelectableRewardTokenForMerchant$$inlined$map$1$2$1) continuation;
                    int i49 = realBoostProvider$getSelectableRewardTokenForMerchant$$inlined$map$1$2$1.label;
                    if ((i49 & PKIFailureInfo.systemUnavail) != 0) {
                        realBoostProvider$getSelectableRewardTokenForMerchant$$inlined$map$1$2$1.label = i49 - PKIFailureInfo.systemUnavail;
                        Object obj23 = realBoostProvider$getSelectableRewardTokenForMerchant$$inlined$map$1$2$1.result;
                        CoroutineSingletons coroutineSingletons19 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i18 = realBoostProvider$getSelectableRewardTokenForMerchant$$inlined$map$1$2$1.label;
                        if (i18 != 0) {
                            SafeTrace.throwOnFailure(obj23);
                            List list = (List) obj;
                            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                arrayList.add(((RewardWithSelection) it.next()).token);
                            }
                            Object firstOrNull = CollectionsKt.firstOrNull((List<? extends Object>) arrayList);
                            realBoostProvider$getSelectableRewardTokenForMerchant$$inlined$map$1$2$1.label = 1;
                            if (flowCollector.emit(firstOrNull, realBoostProvider$getSelectableRewardTokenForMerchant$$inlined$map$1$2$1) == coroutineSingletons19) {
                                break;
                            }
                        } else if (i18 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj23);
                        }
                        break;
                    }
                }
                realBoostProvider$getSelectableRewardTokenForMerchant$$inlined$map$1$2$1 = new RealBoostProvider$getSelectableRewardTokenForMerchant$$inlined$map$1$2$1(this, continuation);
                Object obj232 = realBoostProvider$getSelectableRewardTokenForMerchant$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons192 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i18 = realBoostProvider$getSelectableRewardTokenForMerchant$$inlined$map$1$2$1.label;
                if (i18 != 0) {
                }
            case 18:
                if (continuation instanceof RealBoostProvider$getSelectedRewardToken$$inlined$map$1$2$1) {
                    realBoostProvider$getSelectedRewardToken$$inlined$map$1$2$1 = (RealBoostProvider$getSelectedRewardToken$$inlined$map$1$2$1) continuation;
                    int i50 = realBoostProvider$getSelectedRewardToken$$inlined$map$1$2$1.label;
                    if ((i50 & PKIFailureInfo.systemUnavail) != 0) {
                        realBoostProvider$getSelectedRewardToken$$inlined$map$1$2$1.label = i50 - PKIFailureInfo.systemUnavail;
                        Object obj24 = realBoostProvider$getSelectedRewardToken$$inlined$map$1$2$1.result;
                        CoroutineSingletons coroutineSingletons20 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i19 = realBoostProvider$getSelectedRewardToken$$inlined$map$1$2$1.label;
                        if (i19 != 0) {
                            SafeTrace.throwOnFailure(obj24);
                            Object firstOrNull2 = CollectionsKt.firstOrNull((List<? extends Object>) obj);
                            realBoostProvider$getSelectedRewardToken$$inlined$map$1$2$1.label = 1;
                            if (flowCollector.emit(firstOrNull2, realBoostProvider$getSelectedRewardToken$$inlined$map$1$2$1) == coroutineSingletons20) {
                                break;
                            }
                        } else if (i19 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj24);
                        }
                        break;
                    }
                }
                realBoostProvider$getSelectedRewardToken$$inlined$map$1$2$1 = new RealBoostProvider$getSelectedRewardToken$$inlined$map$1$2$1(this, continuation);
                Object obj242 = realBoostProvider$getSelectedRewardToken$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons202 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i19 = realBoostProvider$getSelectedRewardToken$$inlined$map$1$2$1.label;
                if (i19 != 0) {
                }
            case 19:
                if (continuation instanceof RealBoostRepository$getAllOrderedBoosts$$inlined$map$1$2$1) {
                    realBoostRepository$getAllOrderedBoosts$$inlined$map$1$2$1 = (RealBoostRepository$getAllOrderedBoosts$$inlined$map$1$2$1) continuation;
                    int i51 = realBoostRepository$getAllOrderedBoosts$$inlined$map$1$2$1.label;
                    if ((i51 & PKIFailureInfo.systemUnavail) != 0) {
                        realBoostRepository$getAllOrderedBoosts$$inlined$map$1$2$1.label = i51 - PKIFailureInfo.systemUnavail;
                        Object obj25 = realBoostRepository$getAllOrderedBoosts$$inlined$map$1$2$1.result;
                        CoroutineSingletons coroutineSingletons21 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i20 = realBoostRepository$getAllOrderedBoosts$$inlined$map$1$2$1.label;
                        if (i20 != 0) {
                            SafeTrace.throwOnFailure(obj25);
                            Map map = (Map) obj;
                            ArrayList flatten = CollectionsKt__IterablesKt.flatten(ArraysKt___ArraysKt.filterNotNull(new List[]{map.get(BoostCategory.CUSTOM), map.get(BoostCategory.CAP), map.get(BoostCategory.REGULAR)}));
                            realBoostRepository$getAllOrderedBoosts$$inlined$map$1$2$1.label = 1;
                            if (flowCollector.emit(flatten, realBoostRepository$getAllOrderedBoosts$$inlined$map$1$2$1) == coroutineSingletons21) {
                                break;
                            }
                        } else if (i20 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj25);
                        }
                        break;
                    }
                }
                realBoostRepository$getAllOrderedBoosts$$inlined$map$1$2$1 = new RealBoostRepository$getAllOrderedBoosts$$inlined$map$1$2$1(this, continuation);
                Object obj252 = realBoostRepository$getAllOrderedBoosts$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons212 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i20 = realBoostRepository$getAllOrderedBoosts$$inlined$map$1$2$1.label;
                if (i20 != 0) {
                }
            case 20:
                if (continuation instanceof RealBoostRepository$getLockedBoostTokens$$inlined$map$1$2$1) {
                    realBoostRepository$getLockedBoostTokens$$inlined$map$1$2$1 = (RealBoostRepository$getLockedBoostTokens$$inlined$map$1$2$1) continuation;
                    int i52 = realBoostRepository$getLockedBoostTokens$$inlined$map$1$2$1.label;
                    if ((i52 & PKIFailureInfo.systemUnavail) != 0) {
                        realBoostRepository$getLockedBoostTokens$$inlined$map$1$2$1.label = i52 - PKIFailureInfo.systemUnavail;
                        Object obj26 = realBoostRepository$getLockedBoostTokens$$inlined$map$1$2$1.result;
                        CoroutineSingletons coroutineSingletons22 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i21 = realBoostRepository$getLockedBoostTokens$$inlined$map$1$2$1.label;
                        if (i21 != 0) {
                            SafeTrace.throwOnFailure(obj26);
                            ArrayList arrayList2 = new ArrayList();
                            for (Object obj27 : (List) obj) {
                                if (((Slots) obj27).state == RewardSlotState.LOCKED) {
                                    arrayList2.add(obj27);
                                }
                            }
                            ArrayList arrayList3 = new ArrayList();
                            Iterator it2 = arrayList2.iterator();
                            while (it2.hasNext()) {
                                String str4 = ((Slots) it2.next()).token;
                                if (str4 != null) {
                                    arrayList3.add(str4);
                                }
                            }
                            Set set2 = CollectionsKt.toSet(arrayList3);
                            realBoostRepository$getLockedBoostTokens$$inlined$map$1$2$1.label = 1;
                            if (flowCollector.emit(set2, realBoostRepository$getLockedBoostTokens$$inlined$map$1$2$1) == coroutineSingletons22) {
                                break;
                            }
                        } else if (i21 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj26);
                        }
                        break;
                    }
                }
                realBoostRepository$getLockedBoostTokens$$inlined$map$1$2$1 = new RealBoostRepository$getLockedBoostTokens$$inlined$map$1$2$1(this, continuation);
                Object obj262 = realBoostRepository$getLockedBoostTokens$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons222 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i21 = realBoostRepository$getLockedBoostTokens$$inlined$map$1$2$1.label;
                if (i21 != 0) {
                }
            case 21:
                if (continuation instanceof RealBoostRepository$getSelectedBoostTokens$$inlined$map$1$2$1) {
                    realBoostRepository$getSelectedBoostTokens$$inlined$map$1$2$1 = (RealBoostRepository$getSelectedBoostTokens$$inlined$map$1$2$1) continuation;
                    int i53 = realBoostRepository$getSelectedBoostTokens$$inlined$map$1$2$1.label;
                    if ((i53 & PKIFailureInfo.systemUnavail) != 0) {
                        realBoostRepository$getSelectedBoostTokens$$inlined$map$1$2$1.label = i53 - PKIFailureInfo.systemUnavail;
                        Object obj28 = realBoostRepository$getSelectedBoostTokens$$inlined$map$1$2$1.result;
                        CoroutineSingletons coroutineSingletons23 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i22 = realBoostRepository$getSelectedBoostTokens$$inlined$map$1$2$1.label;
                        if (i22 != 0) {
                            SafeTrace.throwOnFailure(obj28);
                            ArrayList arrayList4 = new ArrayList();
                            for (Object obj29 : (List) obj) {
                                if (((Slots) obj29).state == RewardSlotState.OCCUPIED) {
                                    arrayList4.add(obj29);
                                }
                            }
                            ArrayList arrayList5 = new ArrayList();
                            Iterator it3 = arrayList4.iterator();
                            while (it3.hasNext()) {
                                String str5 = ((Slots) it3.next()).token;
                                if (str5 != null) {
                                    arrayList5.add(str5);
                                }
                            }
                            Set set3 = CollectionsKt.toSet(arrayList5);
                            realBoostRepository$getSelectedBoostTokens$$inlined$map$1$2$1.label = 1;
                            if (flowCollector.emit(set3, realBoostRepository$getSelectedBoostTokens$$inlined$map$1$2$1) == coroutineSingletons23) {
                                break;
                            }
                        } else if (i22 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj28);
                        }
                        break;
                    }
                }
                realBoostRepository$getSelectedBoostTokens$$inlined$map$1$2$1 = new RealBoostRepository$getSelectedBoostTokens$$inlined$map$1$2$1(this, continuation);
                Object obj282 = realBoostRepository$getSelectedBoostTokens$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons232 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i22 = realBoostRepository$getSelectedBoostTokens$$inlined$map$1$2$1.label;
                if (i22 != 0) {
                }
            case 22:
                if (continuation instanceof RealBoostRepository$getYtdTotalSavings$$inlined$map$1$2$1) {
                    realBoostRepository$getYtdTotalSavings$$inlined$map$1$2$1 = (RealBoostRepository$getYtdTotalSavings$$inlined$map$1$2$1) continuation;
                    int i54 = realBoostRepository$getYtdTotalSavings$$inlined$map$1$2$1.label;
                    if ((i54 & PKIFailureInfo.systemUnavail) != 0) {
                        realBoostRepository$getYtdTotalSavings$$inlined$map$1$2$1.label = i54 - PKIFailureInfo.systemUnavail;
                        Object obj30 = realBoostRepository$getYtdTotalSavings$$inlined$map$1$2$1.result;
                        CoroutineSingletons coroutineSingletons24 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i23 = realBoostRepository$getYtdTotalSavings$$inlined$map$1$2$1.label;
                        if (i23 != 0) {
                            SafeTrace.throwOnFailure(obj30);
                            Money money = ((UserRewardsData) obj).ytd_total_saving;
                            realBoostRepository$getYtdTotalSavings$$inlined$map$1$2$1.label = 1;
                            if (flowCollector.emit(money, realBoostRepository$getYtdTotalSavings$$inlined$map$1$2$1) == coroutineSingletons24) {
                                break;
                            }
                        } else if (i23 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj30);
                        }
                        break;
                    }
                }
                realBoostRepository$getYtdTotalSavings$$inlined$map$1$2$1 = new RealBoostRepository$getYtdTotalSavings$$inlined$map$1$2$1(this, continuation);
                Object obj302 = realBoostRepository$getYtdTotalSavings$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons242 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i23 = realBoostRepository$getYtdTotalSavings$$inlined$map$1$2$1.label;
                if (i23 != 0) {
                }
            case 23:
                if (continuation instanceof RealBoostSelector$getOfferToken$lambda$0$$inlined$map$1$2$1) {
                    realBoostSelector$getOfferToken$lambda$0$$inlined$map$1$2$1 = (RealBoostSelector$getOfferToken$lambda$0$$inlined$map$1$2$1) continuation;
                    int i55 = realBoostSelector$getOfferToken$lambda$0$$inlined$map$1$2$1.label;
                    if ((i55 & PKIFailureInfo.systemUnavail) != 0) {
                        realBoostSelector$getOfferToken$lambda$0$$inlined$map$1$2$1.label = i55 - PKIFailureInfo.systemUnavail;
                        Object obj31 = realBoostSelector$getOfferToken$lambda$0$$inlined$map$1$2$1.result;
                        CoroutineSingletons coroutineSingletons25 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i24 = realBoostSelector$getOfferToken$lambda$0$$inlined$map$1$2$1.label;
                        if (i24 != 0) {
                            SafeTrace.throwOnFailure(obj31);
                            RewardWithSelection rewardWithSelection = (RewardWithSelection) obj;
                            str = rewardWithSelection != null ? rewardWithSelection.offerly_token : null;
                            realBoostSelector$getOfferToken$lambda$0$$inlined$map$1$2$1.label = 1;
                            if (flowCollector.emit(str, realBoostSelector$getOfferToken$lambda$0$$inlined$map$1$2$1) == coroutineSingletons25) {
                                break;
                            }
                        } else if (i24 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj31);
                        }
                        break;
                    }
                }
                realBoostSelector$getOfferToken$lambda$0$$inlined$map$1$2$1 = new RealBoostSelector$getOfferToken$lambda$0$$inlined$map$1$2$1(this, continuation);
                Object obj312 = realBoostSelector$getOfferToken$lambda$0$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons252 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i24 = realBoostSelector$getOfferToken$lambda$0$$inlined$map$1$2$1.label;
                if (i24 != 0) {
                }
            case 24:
                if (continuation instanceof BorrowDataReadUtilsKt$allEntryPoints$$inlined$map$1$2$1) {
                    borrowDataReadUtilsKt$allEntryPoints$$inlined$map$1$2$1 = (BorrowDataReadUtilsKt$allEntryPoints$$inlined$map$1$2$1) continuation;
                    int i56 = borrowDataReadUtilsKt$allEntryPoints$$inlined$map$1$2$1.label;
                    if ((i56 & PKIFailureInfo.systemUnavail) != 0) {
                        borrowDataReadUtilsKt$allEntryPoints$$inlined$map$1$2$1.label = i56 - PKIFailureInfo.systemUnavail;
                        Object obj32 = borrowDataReadUtilsKt$allEntryPoints$$inlined$map$1$2$1.result;
                        CoroutineSingletons coroutineSingletons26 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i25 = borrowDataReadUtilsKt$allEntryPoints$$inlined$map$1$2$1.label;
                        if (i25 != 0) {
                            SafeTrace.throwOnFailure(obj32);
                            PayloadWithMetadata payloadWithMetadata = (PayloadWithMetadata) obj;
                            if (payloadWithMetadata == null) {
                                obj2 = EmptyList.INSTANCE;
                            } else {
                                BorrowData.AppletData appletData3 = ((BorrowData) payloadWithMetadata.value).applet_data;
                                appletData3.getClass();
                                obj2 = appletData3.entry_points;
                            }
                            borrowDataReadUtilsKt$allEntryPoints$$inlined$map$1$2$1.label = 1;
                            if (flowCollector.emit(obj2, borrowDataReadUtilsKt$allEntryPoints$$inlined$map$1$2$1) == coroutineSingletons26) {
                                break;
                            }
                        } else if (i25 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj32);
                        }
                        break;
                    }
                }
                borrowDataReadUtilsKt$allEntryPoints$$inlined$map$1$2$1 = new BorrowDataReadUtilsKt$allEntryPoints$$inlined$map$1$2$1(this, continuation);
                Object obj322 = borrowDataReadUtilsKt$allEntryPoints$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons262 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i25 = borrowDataReadUtilsKt$allEntryPoints$$inlined$map$1$2$1.label;
                if (i25 != 0) {
                }
            case 25:
                if (continuation instanceof BorrowDataReadUtilsKt$allEntryPoints$$inlined$map$2$2$1) {
                    borrowDataReadUtilsKt$allEntryPoints$$inlined$map$2$2$1 = (BorrowDataReadUtilsKt$allEntryPoints$$inlined$map$2$2$1) continuation;
                    int i57 = borrowDataReadUtilsKt$allEntryPoints$$inlined$map$2$2$1.label;
                    if ((i57 & PKIFailureInfo.systemUnavail) != 0) {
                        borrowDataReadUtilsKt$allEntryPoints$$inlined$map$2$2$1.label = i57 - PKIFailureInfo.systemUnavail;
                        Object obj33 = borrowDataReadUtilsKt$allEntryPoints$$inlined$map$2$2$1.result;
                        CoroutineSingletons coroutineSingletons27 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i26 = borrowDataReadUtilsKt$allEntryPoints$$inlined$map$2$2$1.label;
                        if (i26 != 0) {
                            SafeTrace.throwOnFailure(obj33);
                            PayloadWithMetadata payloadWithMetadata2 = (PayloadWithMetadata) obj;
                            if (payloadWithMetadata2 == null || (globalBorrowData = (GlobalBorrowData) payloadWithMetadata2.value) == null || (obj3 = globalBorrowData.entry_points) == null) {
                                obj3 = EmptyList.INSTANCE;
                            }
                            borrowDataReadUtilsKt$allEntryPoints$$inlined$map$2$2$1.label = 1;
                            if (flowCollector.emit(obj3, borrowDataReadUtilsKt$allEntryPoints$$inlined$map$2$2$1) == coroutineSingletons27) {
                                break;
                            }
                        } else if (i26 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj33);
                        }
                        break;
                    }
                }
                borrowDataReadUtilsKt$allEntryPoints$$inlined$map$2$2$1 = new BorrowDataReadUtilsKt$allEntryPoints$$inlined$map$2$2$1(this, continuation);
                Object obj332 = borrowDataReadUtilsKt$allEntryPoints$$inlined$map$2$2$1.result;
                CoroutineSingletons coroutineSingletons272 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i26 = borrowDataReadUtilsKt$allEntryPoints$$inlined$map$2$2$1.label;
                if (i26 != 0) {
                }
                break;
            case 26:
                if (continuation instanceof RealBorrowDataManager$borrowHomeTiles$$inlined$map$1$2$1) {
                    realBorrowDataManager$borrowHomeTiles$$inlined$map$1$2$1 = (RealBorrowDataManager$borrowHomeTiles$$inlined$map$1$2$1) continuation;
                    int i58 = realBorrowDataManager$borrowHomeTiles$$inlined$map$1$2$1.label;
                    if ((i58 & PKIFailureInfo.systemUnavail) != 0) {
                        realBorrowDataManager$borrowHomeTiles$$inlined$map$1$2$1.label = i58 - PKIFailureInfo.systemUnavail;
                        Object obj34 = realBorrowDataManager$borrowHomeTiles$$inlined$map$1$2$1.result;
                        CoroutineSingletons coroutineSingletons28 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i27 = realBorrowDataManager$borrowHomeTiles$$inlined$map$1$2$1.label;
                        if (i27 != 0) {
                            SafeTrace.throwOnFailure(obj34);
                            PayloadWithMetadata payloadWithMetadata3 = (PayloadWithMetadata) obj;
                            if (payloadWithMetadata3 == null || (borrowData = (BorrowData) payloadWithMetadata3.value) == null || (appletData = borrowData.applet_data) == null || (obj4 = appletData.vertical_layout) == null) {
                                obj4 = EmptyList.INSTANCE;
                            }
                            realBorrowDataManager$borrowHomeTiles$$inlined$map$1$2$1.label = 1;
                            if (flowCollector.emit(obj4, realBorrowDataManager$borrowHomeTiles$$inlined$map$1$2$1) == coroutineSingletons28) {
                                break;
                            }
                        } else if (i27 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj34);
                        }
                        break;
                    }
                }
                realBorrowDataManager$borrowHomeTiles$$inlined$map$1$2$1 = new RealBorrowDataManager$borrowHomeTiles$$inlined$map$1$2$1(this, continuation);
                Object obj342 = realBorrowDataManager$borrowHomeTiles$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons282 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i27 = realBorrowDataManager$borrowHomeTiles$$inlined$map$1$2$1.label;
                if (i27 != 0) {
                }
                break;
            case 27:
                if (continuation instanceof RealBorrowDataManager$borrowHomeTitle$$inlined$map$1$2$1) {
                    realBorrowDataManager$borrowHomeTitle$$inlined$map$1$2$1 = (RealBorrowDataManager$borrowHomeTitle$$inlined$map$1$2$1) continuation;
                    int i59 = realBorrowDataManager$borrowHomeTitle$$inlined$map$1$2$1.label;
                    if ((i59 & PKIFailureInfo.systemUnavail) != 0) {
                        realBorrowDataManager$borrowHomeTitle$$inlined$map$1$2$1.label = i59 - PKIFailureInfo.systemUnavail;
                        Object obj35 = realBorrowDataManager$borrowHomeTitle$$inlined$map$1$2$1.result;
                        CoroutineSingletons coroutineSingletons29 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i28 = realBorrowDataManager$borrowHomeTitle$$inlined$map$1$2$1.label;
                        if (i28 != 0) {
                            SafeTrace.throwOnFailure(obj35);
                            PayloadWithMetadata payloadWithMetadata4 = (PayloadWithMetadata) obj;
                            if (payloadWithMetadata4 == null || (borrowData2 = (BorrowData) payloadWithMetadata4.value) == null || (appletData2 = borrowData2.applet_data) == null || (localizedString = appletData2.title) == null || (str2 = localizedString.translated_value) == null) {
                                str2 = "";
                            }
                            realBorrowDataManager$borrowHomeTitle$$inlined$map$1$2$1.label = 1;
                            if (flowCollector.emit(str2, realBorrowDataManager$borrowHomeTitle$$inlined$map$1$2$1) == coroutineSingletons29) {
                                break;
                            }
                        } else if (i28 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj35);
                        }
                        break;
                    }
                }
                realBorrowDataManager$borrowHomeTitle$$inlined$map$1$2$1 = new RealBorrowDataManager$borrowHomeTitle$$inlined$map$1$2$1(this, continuation);
                Object obj352 = realBorrowDataManager$borrowHomeTitle$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons292 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i28 = realBorrowDataManager$borrowHomeTitle$$inlined$map$1$2$1.label;
                if (i28 != 0) {
                }
                break;
            case 28:
                if (continuation instanceof RealBorrowDataManager$borrowLandingFallbackClientRoute$$inlined$map$1$2$1) {
                    realBorrowDataManager$borrowLandingFallbackClientRoute$$inlined$map$1$2$1 = (RealBorrowDataManager$borrowLandingFallbackClientRoute$$inlined$map$1$2$1) continuation;
                    int i60 = realBorrowDataManager$borrowLandingFallbackClientRoute$$inlined$map$1$2$1.label;
                    if ((i60 & PKIFailureInfo.systemUnavail) != 0) {
                        realBorrowDataManager$borrowLandingFallbackClientRoute$$inlined$map$1$2$1.label = i60 - PKIFailureInfo.systemUnavail;
                        Object obj36 = realBorrowDataManager$borrowLandingFallbackClientRoute$$inlined$map$1$2$1.result;
                        CoroutineSingletons coroutineSingletons30 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i29 = realBorrowDataManager$borrowLandingFallbackClientRoute$$inlined$map$1$2$1.label;
                        if (i29 != 0) {
                            SafeTrace.throwOnFailure(obj36);
                            PayloadWithMetadata payloadWithMetadata5 = (PayloadWithMetadata) obj;
                            payloadWithMetadata5.getClass();
                            String str6 = ((GlobalBorrowData) payloadWithMetadata5.value).fallback_client_route;
                            str6.getClass();
                            realBorrowDataManager$borrowLandingFallbackClientRoute$$inlined$map$1$2$1.label = 1;
                            if (flowCollector.emit(str6, realBorrowDataManager$borrowLandingFallbackClientRoute$$inlined$map$1$2$1) == coroutineSingletons30) {
                                break;
                            }
                        } else if (i29 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj36);
                        }
                        break;
                    }
                }
                realBorrowDataManager$borrowLandingFallbackClientRoute$$inlined$map$1$2$1 = new RealBorrowDataManager$borrowLandingFallbackClientRoute$$inlined$map$1$2$1(this, continuation);
                Object obj362 = realBorrowDataManager$borrowLandingFallbackClientRoute$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons302 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i29 = realBorrowDataManager$borrowLandingFallbackClientRoute$$inlined$map$1$2$1.label;
                if (i29 != 0) {
                }
            default:
                if (continuation instanceof BugReportingPresenter$models$lambda$3$$inlined$map$1$2$1) {
                    bugReportingPresenter$models$lambda$3$$inlined$map$1$2$1 = (BugReportingPresenter$models$lambda$3$$inlined$map$1$2$1) continuation;
                    int i61 = bugReportingPresenter$models$lambda$3$$inlined$map$1$2$1.label;
                    if ((i61 & PKIFailureInfo.systemUnavail) != 0) {
                        bugReportingPresenter$models$lambda$3$$inlined$map$1$2$1.label = i61 - PKIFailureInfo.systemUnavail;
                        Object obj37 = bugReportingPresenter$models$lambda$3$$inlined$map$1$2$1.result;
                        CoroutineSingletons coroutineSingletons31 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i30 = bugReportingPresenter$models$lambda$3$$inlined$map$1$2$1.label;
                        if (i30 != 0) {
                            SafeTrace.throwOnFailure(obj37);
                            ArrayList arrayList6 = new ArrayList();
                            for (Object obj38 : (List) obj) {
                                if (((ProfileAlias) obj38).f1121type == UiAlias.Type.EMAIL) {
                                    arrayList6.add(obj38);
                                }
                            }
                            bugReportingPresenter$models$lambda$3$$inlined$map$1$2$1.label = 1;
                            if (flowCollector.emit(arrayList6, bugReportingPresenter$models$lambda$3$$inlined$map$1$2$1) == coroutineSingletons31) {
                                break;
                            }
                        } else if (i30 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj37);
                        }
                        break;
                    }
                }
                bugReportingPresenter$models$lambda$3$$inlined$map$1$2$1 = new BugReportingPresenter$models$lambda$3$$inlined$map$1$2$1(this, continuation);
                Object obj372 = bugReportingPresenter$models$lambda$3$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons312 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i30 = bugReportingPresenter$models$lambda$3$$inlined$map$1$2$1.label;
                if (i30 != 0) {
                }
        }
        return Unit.INSTANCE;
    }
}
