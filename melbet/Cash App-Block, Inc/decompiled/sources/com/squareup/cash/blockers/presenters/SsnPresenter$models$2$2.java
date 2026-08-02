package com.squareup.cash.blockers.presenters;

import android.graphics.Bitmap;
import android.os.Parcelable;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProduceStateScope;
import androidx.compose.ui.node.PointerInputModifierNodeKt;
import androidx.core.text.TextUtilsCompat;
import androidx.glance.session.SessionWorker$doWork$2$2;
import androidx.paging.CachedPagingDataKt$cachedIn$4;
import androidx.paging.PagingDataPresenter$collectFrom$2;
import app.cash.api.ApiResult;
import app.cash.local.db.LocalTabContentQueries;
import app.cash.local.presenters.pos.LocalPosCheckInPresenter;
import app.cash.local.presenters.wallet.LocalHomePresenter;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.plaid.internal.EnumC0170g;
import com.squareup.cardcustomizations.signature.Signature;
import com.squareup.cardcustomizations.signature.SignatureState;
import com.squareup.cash.aiedge.MLKitTitleGenerator$1;
import com.squareup.cash.api.ContextKt;
import com.squareup.cash.badging.db.BadgeQueries$$ExternalSyntheticLambda5;
import com.squareup.cash.bitcoin.presenters.map.BitcoinMapPresenter;
import com.squareup.cash.bitcoin.presenters.payinusd.BitcoinPayInUsdPreference;
import com.squareup.cash.bitcoin.presenters.payinusd.RealBitcoinPayInUsdPreferenceManager;
import com.squareup.cash.bitcoin.presenters.performance.details.TimeoutKt;
import com.squareup.cash.blockers.actions.presenters.BlockerActionConfirmSheetPresenter;
import com.squareup.cash.blockers.actions.presenters.BlockerActionDialogActionPresenter;
import com.squareup.cash.blockers.actions.util.CdfUtilsKt;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.blockers.flow.RealMultiBlockerFacilitator;
import com.squareup.cash.blockers.flow.api.MultiBlockerFacilitator$Resolver;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.blockers.viewmodels.FileBlockerViewEvent;
import com.squareup.cash.blockers.viewmodels.FilesetUploadViewEvent;
import com.squareup.cash.blockers.viewmodels.PasscodeViewEvent;
import com.squareup.cash.blockers.viewmodels.PlaidLinkViewEvent;
import com.squareup.cash.blockers.viewmodels.PlaidLinkViewModel;
import com.squareup.cash.blockers.viewmodels.SignatureViewEvent;
import com.squareup.cash.blockers.viewmodels.SsnViewEvent;
import com.squareup.cash.blockers.viewmodels.StripeLinkViewModel;
import com.squareup.cash.blockers.views.PasscodeViewKt$Passcode$3$1$1$1$2;
import com.squareup.cash.boost.db.RewardQueries;
import com.squareup.cash.borrow.backend.BorrowDataReadUtilsKt$hasBorrowData$$inlined$map$1$2;
import com.squareup.cash.braze.RealBrazeManager$openSession$1$1;
import com.squareup.cash.card.onboarding.CardModelView$iconTexture$$inlined$map$1;
import com.squareup.cash.card.onboarding.DisclosurePresenter;
import com.squareup.cash.cdf.blockerflow.BlockerFlowInteractTriggerScheduledAction;
import com.squareup.cash.cdf.instrument.InstrumentLinkAuthenticateInstitution;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.cash.common.messaging.screens.FailureMessageBlockerScreen;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.crypto.backend.performance.BitcoinPerformanceSummary;
import com.squareup.cash.data.blockers.BlockersDataNavigator;
import com.squareup.cash.data.blockers.BlockersHelper;
import com.squareup.cash.data.blockers.FlowStarter;
import com.squareup.cash.data.blockers.RealBlockersHelper;
import com.squareup.cash.data.profile.RealProfileManager;
import com.squareup.cash.data.transfers.RealTransferManager;
import com.squareup.cash.data.transfers.RealTransferManager$addCash$$inlined$map$1;
import com.squareup.cash.data.transfers.TransferManager;
import com.squareup.cash.deposits.physical.screens.AddressResult;
import com.squareup.cash.deposits.physical.screens.SelectedSearchAddressResult;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.maps.viewmodels.LocationViewModel;
import com.squareup.cash.music.presenters.MusicPresenter$models$2$1;
import com.squareup.cash.payments.screens.PaymentScreens$HomeScreens$Home;
import com.squareup.cash.plaid.api.Institution;
import com.squareup.cash.plaid.api.PlaidLinkParams;
import com.squareup.cash.plaid.api.PlaidLinkResult;
import com.squareup.cash.profile.screens.ProfileScreens;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.stripe.api.StripeLinkParams;
import com.squareup.cash.transfers.data.TransferData;
import com.squareup.cash.transfers.data.TransferType;
import com.squareup.cash.wallet.presenters.CardLockPresenter;
import com.squareup.protos.cash.cashfileuploads.app.DeleteFileRequest;
import com.squareup.protos.cash.lynx.api.v1_0.InitiateStripeLinkRequest;
import com.squareup.protos.cash.lynx.api.v1_0.InitiateStripeLinkResponse;
import com.squareup.protos.cash.lynx.api.v1_0.StripeBankLinkingService;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.api.BlockerAction;
import com.squareup.protos.franklin.api.ClientScenario;
import com.squareup.protos.franklin.api.HelpItem;
import com.squareup.protos.franklin.api.UiAlias;
import com.squareup.protos.franklin.app.AppService;
import com.squareup.protos.franklin.app.EndFlowRequest;
import com.squareup.protos.franklin.app.PlaidLinkTokenCreateRequest;
import com.squareup.protos.franklin.app.PlaidLinkTokenCreateResponse;
import com.squareup.protos.franklin.app.SetSignatureResponse;
import com.squareup.protos.franklin.app.SubmitBlockerRequest;
import com.squareup.protos.franklin.app.SubmitBlockerResponse;
import com.squareup.protos.franklin.app.UnregisterAliasRequest;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.protos.franklin.common.appmessaging.AppMessageAction;
import com.squareup.util.coroutines.Signal;
import com.squareup.util.coroutines.StateFlowKt;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.jvm.internal.ConvertFromJavaKt$$Lambda$4;
import kotlin.reflect.jvm.internal.KClassImpl$Data$$Lambda$23;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.channels.BufferedChannel;
import kotlinx.coroutines.flow.ChannelAsFlow;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.StateFlowImpl;
import okio.ByteString;
import okio.Utf8;
import papa.SafeTrace;
import squareup.cash.earnings.EarnerCategory;

/* loaded from: classes4.dex */
public final class SsnPresenter$models$2$2 extends SuspendLambda implements Function2 {
    public final /* synthetic */ Object $event;
    public final /* synthetic */ int $r8$classId;
    public int label;
    public /* synthetic */ Object this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SsnPresenter$models$2$2(Object obj, Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = obj;
        this.$event = obj2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        Object obj2 = this.$event;
        switch (i) {
            case 0:
                return new SsnPresenter$models$2$2((SsnPresenter) this.this$0, (SsnViewEvent) obj2, continuation, 0);
            case 1:
                return new SsnPresenter$models$2$2((BitcoinMapPresenter) this.this$0, (AddressResult) obj2, continuation, 1);
            case 2:
                SsnPresenter$models$2$2 ssnPresenter$models$2$2 = new SsnPresenter$models$2$2((RealBitcoinPayInUsdPreferenceManager) obj2, continuation, 2);
                ssnPresenter$models$2$2.this$0 = obj;
                return ssnPresenter$models$2$2;
            case 3:
                SsnPresenter$models$2$2 ssnPresenter$models$2$22 = new SsnPresenter$models$2$2((BitcoinPerformanceSummary) obj2, continuation, 3);
                ssnPresenter$models$2$22.this$0 = obj;
                return ssnPresenter$models$2$22;
            case 4:
                return new SsnPresenter$models$2$2((BlockerActionConfirmSheetPresenter) this.this$0, (MutableState) obj2, continuation, 4);
            case 5:
                return new SsnPresenter$models$2$2((BlockerActionDialogActionPresenter) this.this$0, (String) obj2, continuation, 5);
            case 6:
                return new SsnPresenter$models$2$2((RealMultiBlockerFacilitator) this.this$0, (RealMultiBlockerFacilitator.GroupResolver) obj2, continuation, 6);
            case 7:
                return new SsnPresenter$models$2$2((AtmPickerAmountBlockerPresenter) this.this$0, (BlockerAction) obj2, continuation, 7);
            case 8:
                SsnPresenter$models$2$2 ssnPresenter$models$2$23 = new SsnPresenter$models$2$2((LocalPosCheckInPresenter) obj2, continuation, 8);
                ssnPresenter$models$2$23.this$0 = obj;
                return ssnPresenter$models$2$23;
            case 9:
                return new SsnPresenter$models$2$2((BlockerContainerPresenter) this.this$0, (BlockerAction) obj2, continuation, 9);
            case 10:
                return new SsnPresenter$models$2$2((CalendarBlockerPresenter) this.this$0, (BlockerAction) obj2, continuation, 10);
            case 11:
                return new SsnPresenter$models$2$2((CashtagPresenter) this.this$0, (BlockerAction) obj2, continuation, 11);
            case 12:
                return new SsnPresenter$models$2$2((EarnerEnrollmentBlockerPresenter) this.this$0, (EarnerCategory) obj2, continuation, 12);
            case 13:
                return new SsnPresenter$models$2$2((FileBlockerPresenter) this.this$0, (FileBlockerViewEvent) obj2, continuation, 13);
            case 14:
                return new SsnPresenter$models$2$2((FilesetUploadPresenter) this.this$0, (KClassImpl$Data$$Lambda$23) obj2, continuation, 14);
            case 15:
                return new SsnPresenter$models$2$2((FilesetUploadPresenter) this.this$0, (ConvertFromJavaKt$$Lambda$4) obj2, continuation, 15);
            case 16:
                return new SsnPresenter$models$2$2((FilesetUploadPresenter) this.this$0, (FilesetUploadViewEvent) obj2, continuation, 16);
            case 17:
                return new SsnPresenter$models$2$2((GpsLocationConsentBlockerPresenter) this.this$0, (MutableState) obj2, continuation, 17);
            case 18:
                SsnPresenter$models$2$2 ssnPresenter$models$2$24 = new SsnPresenter$models$2$2((PasscodeConfirmTypeTransformer) obj2, continuation, 18);
                ssnPresenter$models$2$24.this$0 = obj;
                return ssnPresenter$models$2$24;
            case 19:
                SsnPresenter$models$2$2 ssnPresenter$models$2$25 = new SsnPresenter$models$2$2((PasscodeVerifyTypeTransformer) obj2, continuation, 19);
                ssnPresenter$models$2$25.this$0 = obj;
                return ssnPresenter$models$2$25;
            case 20:
                return new SsnPresenter$models$2$2((PlaidLinkPresenter) this.this$0, (MutableState) obj2, continuation, 20);
            case 21:
                return new SsnPresenter$models$2$2((PlaidLinkPresenter) this.this$0, (PlaidLinkViewEvent) obj2, continuation, 21);
            case 22:
                return new SsnPresenter$models$2$2((PromotionPanePresenter) this.this$0, (List) obj2, continuation, 22);
            case 23:
                return new SsnPresenter$models$2$2((PromotionPanePresenter) this.this$0, (AppMessageAction) obj2, continuation, 23);
            case 24:
                return new SsnPresenter$models$2$2((PromotionPanePresenter) this.this$0, (String) obj2, continuation, 24);
            case 25:
                return new SsnPresenter$models$2$2((RequestPushNotificationsBlockerPresenter) this.this$0, (MutableState) obj2, continuation, 25);
            case 26:
                return new SsnPresenter$models$2$2((SavingsTransferOptionSelectionPresenter) this.this$0, (BlockerAction) obj2, continuation, 26);
            case 27:
                return new SsnPresenter$models$2$2((DisclosurePresenter) this.this$0, (CardLockPresenter) obj2, continuation, 27);
            case 28:
                return new SsnPresenter$models$2$2((SignatureViewEvent) this.this$0, (LocalHomePresenter) obj2, continuation, 28);
            default:
                return new SsnPresenter$models$2$2((DisclosurePresenter) this.this$0, (MutableState) obj2, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
        }
        return ((SsnPresenter$models$2$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:142:0x037c, code lost:
    
        if (kotlinx.coroutines.JobKt.withContext(r2, r3, r59) == r1) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:?, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x0364, code lost:
    
        if (r2 == r1) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:216:0x0500, code lost:
    
        if (r0.emit(r3, r59) == r1) goto L190;
     */
    /* JADX WARN: Code restructure failed: missing block: B:218:?, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:220:0x04ec, code lost:
    
        if (r2 == r1) goto L190;
     */
    /* JADX WARN: Code restructure failed: missing block: B:234:0x0546, code lost:
    
        if (r0.emit(r3, r59) == r1) goto L207;
     */
    /* JADX WARN: Code restructure failed: missing block: B:236:?, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:238:0x0532, code lost:
    
        if (r2 == r1) goto L207;
     */
    /* JADX WARN: Code restructure failed: missing block: B:425:0x08ad, code lost:
    
        if (com.squareup.cash.data.blockers.BlockersHelper.handleBlockerAction$default(r2, r1, r2, null, null, false, null, null, r59, com.plaid.internal.EnumC0170g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE) == r12) goto L372;
     */
    /* JADX WARN: Code restructure failed: missing block: B:427:?, code lost:
    
        return r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:432:0x0879, code lost:
    
        if (kotlinx.coroutines.JobKt.delay(r2, r59) == r12) goto L372;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object access$centerOnSearchAddress;
        Object submitBlocker;
        Object invoke;
        Object invoke2;
        Object plaidLinkTokenCreate;
        InstrumentLinkAuthenticateInstitution.Status status;
        InstrumentLinkAuthenticateInstitution.Status status2;
        Object obj2;
        Object unregisterAlias;
        Object first;
        Object trackBlockerSubmissionAnalytics$default;
        Object createStripeLinkToken;
        int i = this.$r8$classId;
        int i2 = 20;
        int i3 = 14;
        int i4 = 4;
        int i5 = 0;
        Object obj3 = this.$event;
        boolean z = true;
        Continuation continuation = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i6 = this.label;
                if (i6 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    SsnPresenter ssnPresenter = (SsnPresenter) this.this$0;
                    RealBlockersHelper realBlockersHelper = (RealBlockersHelper) ssnPresenter.blockersHelper;
                    HelpItem helpItem = ((SsnViewEvent.HelpItemClick) ((SsnViewEvent) obj3)).item;
                    BlockersScreens.SsnScreen ssnScreen = (BlockersScreens.SsnScreen) ssnPresenter.args;
                    CachedPagingDataKt$cachedIn$4 cachedPagingDataKt$cachedIn$4 = new CachedPagingDataKt$cachedIn$4(2, null, 6);
                    this.label = 1;
                    if (realBlockersHelper.performHelpAction(helpItem, ssnScreen, null, cachedPagingDataKt$cachedIn$4, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i6 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 1:
                BitcoinMapPresenter bitcoinMapPresenter = (BitcoinMapPresenter) this.this$0;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i7 = this.label;
                if (i7 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.label = 1;
                    access$centerOnSearchAddress = BitcoinMapPresenter.access$centerOnSearchAddress(bitcoinMapPresenter, (SelectedSearchAddressResult) ((AddressResult) obj3), this);
                    if (access$centerOnSearchAddress == coroutineSingletons2) {
                        return coroutineSingletons2;
                    }
                } else {
                    if (i7 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    access$centerOnSearchAddress = obj;
                }
                LocationViewModel locationViewModel = (LocationViewModel) access$centerOnSearchAddress;
                if (locationViewModel != null) {
                    bitcoinMapPresenter.cashMapPresenter.searchLocation(locationViewModel);
                }
                return Unit.INSTANCE;
            case 2:
                Pair pair = (Pair) this.this$0;
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i8 = this.label;
                if (i8 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    BitcoinPayInUsdPreference bitcoinPayInUsdPreference = (BitcoinPayInUsdPreference) pair.first;
                    BitcoinPayInUsdPreference bitcoinPayInUsdPreference2 = (BitcoinPayInUsdPreference) pair.second;
                    if (bitcoinPayInUsdPreference2 != null && bitcoinPayInUsdPreference2.equals(bitcoinPayInUsdPreference)) {
                        StateFlowImpl stateFlowImpl = ((RealBitcoinPayInUsdPreferenceManager) obj3).cachedOverride;
                        this.this$0 = null;
                        this.label = 1;
                        stateFlowImpl.setValue(null);
                        if (Unit.INSTANCE == coroutineSingletons3) {
                            return coroutineSingletons3;
                        }
                    }
                } else {
                    if (i8 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 3:
                ProduceStateScope produceStateScope = (ProduceStateScope) this.this$0;
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i9 = this.label;
                if (i9 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    BitcoinPerformanceSummary bitcoinPerformanceSummary = (BitcoinPerformanceSummary) obj3;
                    if (!(bitcoinPerformanceSummary instanceof BitcoinPerformanceSummary.Loaded) || !((BitcoinPerformanceSummary.Loaded) bitcoinPerformanceSummary).isStale) {
                        produceStateScope.setValue(Boolean.FALSE);
                        return Unit.INSTANCE;
                    }
                    if (((Boolean) produceStateScope.getValue()).booleanValue()) {
                        return Unit.INSTANCE;
                    }
                    long j = TimeoutKt.STALE_TIMEOUT_DURATION;
                    this.this$0 = produceStateScope;
                    this.label = 1;
                    if (JobKt.m4182delayVtjQ1oo(j, this) == coroutineSingletons4) {
                        return coroutineSingletons4;
                    }
                } else {
                    if (i9 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                produceStateScope.setValue(Boolean.TRUE);
                return Unit.INSTANCE;
            case 4:
                BlockerActionConfirmSheetPresenter blockerActionConfirmSheetPresenter = (BlockerActionConfirmSheetPresenter) this.this$0;
                Long l = blockerActionConfirmSheetPresenter.scheduledActionDelayMs;
                CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i10 = this.label;
                if (i10 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (!((Boolean) ((MutableState) obj3).getValue()).booleanValue()) {
                        long longValue = l.longValue();
                        this.label = 1;
                        break;
                    }
                    return Unit.INSTANCE;
                }
                if (i10 != 1) {
                    if (i10 == 2) {
                        SafeTrace.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                BlockerAction blockerAction = blockerActionConfirmSheetPresenter.scheduledAction;
                if (blockerAction != null) {
                    com.squareup.cash.cdf.BlockerAction cdfBlockerAction = CdfUtilsKt.toCdfBlockerAction(blockerAction);
                    if (cdfBlockerAction != null) {
                        blockerActionConfirmSheetPresenter.analytics.track(new BlockerFlowInteractTriggerScheduledAction(new Integer((int) l.longValue()), cdfBlockerAction), null);
                    }
                    RealBlockersHelper realBlockersHelper2 = blockerActionConfirmSheetPresenter.blockersHelper;
                    BlockersScreens.BlockerActionConfirmSheetScreen blockerActionConfirmSheetScreen = blockerActionConfirmSheetPresenter.args;
                    this.label = 2;
                    break;
                } else {
                    blockerActionConfirmSheetPresenter.navigator.goTo(blockerActionConfirmSheetPresenter.args.blockersData.exitScreen);
                }
                return Unit.INSTANCE;
            case 5:
                CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i11 = this.label;
                if (i11 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    BlockerActionDialogActionPresenter blockerActionDialogActionPresenter = (BlockerActionDialogActionPresenter) this.this$0;
                    MultiBlockerFacilitator$Resolver multiBlockerFacilitator$Resolver = blockerActionDialogActionPresenter.blockerResolver;
                    EndFlowRequest endFlowRequest = new EndFlowRequest(blockerActionDialogActionPresenter.args.blockersData.requestContext, (String) obj3, 4);
                    this.label = 1;
                    if (multiBlockerFacilitator$Resolver.resolve(endFlowRequest, this) == coroutineSingletons6) {
                        return coroutineSingletons6;
                    }
                } else {
                    if (i11 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 6:
                RealMultiBlockerFacilitator realMultiBlockerFacilitator = (RealMultiBlockerFacilitator) this.this$0;
                RealMultiBlockerFacilitator.GroupResolver groupResolver = (RealMultiBlockerFacilitator.GroupResolver) obj3;
                BlockersData blockersData = (BlockersData) groupResolver.firstChild;
                String str = (String) groupResolver.prev;
                CoroutineSingletons coroutineSingletons7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i12 = this.label;
                if (i12 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    LocalTabContentQueries localTabContentQueries = realMultiBlockerFacilitator.queries;
                    localTabContentQueries.getClass();
                    str.getClass();
                    List executeAsList = new RewardQueries.ForIdsQuery(localTabContentQueries, str, new BadgeQueries$$ExternalSyntheticLambda5(localTabContentQueries, i2)).executeAsList();
                    if (executeAsList.isEmpty()) {
                        a$$ExternalSyntheticBUOutline0.m$1("Check failed.");
                        return null;
                    }
                    AppService appService = realMultiBlockerFacilitator.franklinAppService;
                    ClientScenario clientScenario = blockersData.clientScenario;
                    clientScenario.getClass();
                    String str2 = blockersData.flowToken;
                    SubmitBlockerRequest submitBlockerRequest = new SubmitBlockerRequest(str, executeAsList, 10);
                    this.label = 1;
                    submitBlocker = appService.submitBlocker(clientScenario, str2, submitBlockerRequest, this);
                    if (submitBlocker == coroutineSingletons7) {
                        return coroutineSingletons7;
                    }
                } else {
                    if (i12 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    submitBlocker = obj;
                }
                ApiResult apiResult = (ApiResult) submitBlocker;
                if (apiResult instanceof ApiResult.Success) {
                    SubmitBlockerResponse submitBlockerResponse = (SubmitBlockerResponse) ((ApiResult.Success) apiResult).response;
                    ResponseContext mergeResponseContexts = ContextKt.mergeResponseContexts(submitBlockerResponse.app_response_context, submitBlockerResponse.blocker_response_context, submitBlockerResponse.flow_response_context);
                    return Matcher$$ExternalSyntheticOutline0.m(mergeResponseContexts, mergeResponseContexts);
                }
                if (apiResult instanceof ApiResult.Failure) {
                    return apiResult;
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            case 7:
                CoroutineSingletons coroutineSingletons8 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i13 = this.label;
                if (i13 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    AtmPickerAmountBlockerPresenter atmPickerAmountBlockerPresenter = (AtmPickerAmountBlockerPresenter) this.this$0;
                    BlockersScreens.AtmPickerAmountBlockerScreen atmPickerAmountBlockerScreen = atmPickerAmountBlockerPresenter.args;
                    BlockerAction dismissAction = atmPickerAmountBlockerScreen.getDismissAction();
                    this.label = 1;
                    if (BlockersHelper.handleBlockerAction$default(atmPickerAmountBlockerPresenter.blockersHelper, (BlockerAction) obj3, atmPickerAmountBlockerScreen, null, null, false, dismissAction, null, this, EnumC0170g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE) == coroutineSingletons8) {
                        return coroutineSingletons8;
                    }
                } else {
                    if (i13 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 8:
                CoroutineScope coroutineScope = (CoroutineScope) this.this$0;
                CoroutineSingletons coroutineSingletons9 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i14 = this.label;
                if (i14 != 0) {
                    if (i14 == 1) {
                        SafeTrace.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                LocalPosCheckInPresenter localPosCheckInPresenter = (LocalPosCheckInPresenter) obj3;
                SharedFlowImpl sharedFlowImpl = ((RealTransferManager) ((TransferManager) localPosCheckInPresenter.stringManager)).actions;
                PasscodeViewKt$Passcode$3$1$1$1$2 passcodeViewKt$Passcode$3$1$1$1$2 = new PasscodeViewKt$Passcode$3$1$1$1$2(i3, localPosCheckInPresenter, coroutineScope);
                this.this$0 = null;
                this.label = 1;
                sharedFlowImpl.collect(passcodeViewKt$Passcode$3$1$1$1$2, this);
                return coroutineSingletons9;
            case 9:
                CoroutineSingletons coroutineSingletons10 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i15 = this.label;
                if (i15 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    BlockerContainerPresenter blockerContainerPresenter = (BlockerContainerPresenter) this.this$0;
                    BlockersScreens.BlockerContainerScreen blockerContainerScreen = blockerContainerPresenter.args;
                    this.label = 1;
                    if (BlockersHelper.handleBlockerAction$default(blockerContainerPresenter.blockersHelper, (BlockerAction) obj3, blockerContainerScreen, null, null, false, null, null, this, EnumC0170g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE) == coroutineSingletons10) {
                        return coroutineSingletons10;
                    }
                } else {
                    if (i15 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 10:
                CoroutineSingletons coroutineSingletons11 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i16 = this.label;
                if (i16 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    CalendarBlockerPresenter calendarBlockerPresenter = (CalendarBlockerPresenter) this.this$0;
                    BlockersScreens.CalendarBlockerScreen calendarBlockerScreen = calendarBlockerPresenter.args;
                    this.label = 1;
                    if (BlockersHelper.handleBlockerAction$default(calendarBlockerPresenter.blockersHelper, (BlockerAction) obj3, calendarBlockerScreen, null, null, false, null, null, this, EnumC0170g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE) == coroutineSingletons11) {
                        return coroutineSingletons11;
                    }
                } else {
                    if (i16 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 11:
                CoroutineSingletons coroutineSingletons12 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i17 = this.label;
                if (i17 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    CashtagPresenter cashtagPresenter = (CashtagPresenter) this.this$0;
                    BlockersScreens.CashtagScreen cashtagScreen = cashtagPresenter.args;
                    this.label = 1;
                    if (BlockersHelper.handleBlockerAction$default(cashtagPresenter.blockersHelper, (BlockerAction) obj3, cashtagScreen, null, null, false, null, null, this, EnumC0170g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE) == coroutineSingletons12) {
                        return coroutineSingletons12;
                    }
                } else {
                    if (i17 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 12:
                CoroutineSingletons coroutineSingletons13 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i18 = this.label;
                if (i18 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.label = 1;
                    if (EarnerEnrollmentBlockerPresenter.access$progressToNextScreen((EarnerEnrollmentBlockerPresenter) this.this$0, (EarnerCategory) obj3, this) == coroutineSingletons13) {
                        return coroutineSingletons13;
                    }
                } else {
                    if (i18 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 13:
                CoroutineSingletons coroutineSingletons14 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i19 = this.label;
                if (i19 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    FileBlockerPresenter fileBlockerPresenter = (FileBlockerPresenter) this.this$0;
                    RealBlockersHelper realBlockersHelper3 = fileBlockerPresenter.blockersHelper;
                    BlockerAction blockerAction2 = ((FileBlockerViewEvent.BlockerActionClick) ((FileBlockerViewEvent) obj3)).action;
                    BlockersScreens.FileBlockerScreen fileBlockerScreen = fileBlockerPresenter.args;
                    this.label = 1;
                    if (BlockersHelper.handleBlockerAction$default(realBlockersHelper3, blockerAction2, fileBlockerScreen, null, null, false, null, null, this, EnumC0170g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE) == coroutineSingletons14) {
                        return coroutineSingletons14;
                    }
                } else {
                    if (i19 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 14:
                CoroutineSingletons coroutineSingletons15 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i20 = this.label;
                if (i20 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow granted = ((FilesetUploadPresenter) this.this$0).cameraPermission.$readonly.granted();
                    ClientScenarioLauncherPresenter$models$1$1$1 clientScenarioLauncherPresenter$models$1$1$1 = new ClientScenarioLauncherPresenter$models$1$1$1((KClassImpl$Data$$Lambda$23) obj3, i2);
                    this.label = 1;
                    Object collect = granted.collect(new BorrowDataReadUtilsKt$hasBorrowData$$inlined$map$1$2(clientScenarioLauncherPresenter$models$1$1$1, i4), this);
                    if (collect != coroutineSingletons15) {
                        collect = Unit.INSTANCE;
                    }
                    if (collect == coroutineSingletons15) {
                        return coroutineSingletons15;
                    }
                } else {
                    if (i20 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 15:
                CoroutineSingletons coroutineSingletons16 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i21 = this.label;
                if (i21 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow denied = ((FilesetUploadPresenter) this.this$0).cameraPermission.$readonly.denied();
                    ClientScenarioLauncherPresenter$models$1$1$1 clientScenarioLauncherPresenter$models$1$1$12 = new ClientScenarioLauncherPresenter$models$1$1$1((ConvertFromJavaKt$$Lambda$4) obj3, 21);
                    this.label = 1;
                    if (denied.collect(clientScenarioLauncherPresenter$models$1$1$12, this) == coroutineSingletons16) {
                        return coroutineSingletons16;
                    }
                } else {
                    if (i21 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 16:
                CoroutineSingletons coroutineSingletons17 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i22 = this.label;
                if (i22 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    FilesetUploadPresenter filesetUploadPresenter = (FilesetUploadPresenter) this.this$0;
                    String str3 = ((FilesetUploadViewEvent.RemoveFile) ((FilesetUploadViewEvent) obj3)).id;
                    this.label = 1;
                    Object deleteFile = filesetUploadPresenter.service.deleteFile(new DeleteFileRequest(str3, ByteString.EMPTY), this);
                    if (deleteFile != coroutineSingletons17) {
                        deleteFile = Unit.INSTANCE;
                    }
                    if (deleteFile == coroutineSingletons17) {
                        return coroutineSingletons17;
                    }
                } else {
                    if (i22 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 17:
                CoroutineSingletons coroutineSingletons18 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i23 = this.label;
                if (i23 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    CardModelView$iconTexture$$inlined$map$1 cardModelView$iconTexture$$inlined$map$1 = ((GpsLocationConsentBlockerPresenter) this.this$0).locationPermissionDenials;
                    MusicPresenter$models$2$1.AnonymousClass1 anonymousClass1 = new MusicPresenter$models$2$1.AnonymousClass1(12, (MutableState) obj3);
                    this.label = 1;
                    if (cardModelView$iconTexture$$inlined$map$1.collect(anonymousClass1, this) == coroutineSingletons18) {
                        return coroutineSingletons18;
                    }
                } else {
                    if (i23 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 18:
                FlowCollector flowCollector = (FlowCollector) this.this$0;
                CoroutineSingletons coroutineSingletons19 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i24 = this.label;
                if (i24 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    SessionWorker$doWork$2$2 sessionWorker$doWork$2$2 = ((PasscodeConfirmTypeTransformer) obj3).biometricsToken;
                    this.this$0 = flowCollector;
                    this.label = 1;
                    invoke = sessionWorker$doWork$2$2.invoke(this);
                    break;
                } else {
                    if (i24 != 1) {
                        if (i24 == 2) {
                            SafeTrace.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    invoke = obj;
                }
                String str4 = (String) invoke;
                if (str4 != null) {
                    PasscodeViewEvent.VerifyPasscode.WithFingerprint withFingerprint = new PasscodeViewEvent.VerifyPasscode.WithFingerprint(str4);
                    this.this$0 = null;
                    this.label = 2;
                    break;
                }
                return Unit.INSTANCE;
            case 19:
                FlowCollector flowCollector2 = (FlowCollector) this.this$0;
                CoroutineSingletons coroutineSingletons20 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i25 = this.label;
                if (i25 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    SessionWorker$doWork$2$2 sessionWorker$doWork$2$22 = ((PasscodeVerifyTypeTransformer) obj3).biometricsToken;
                    this.this$0 = flowCollector2;
                    this.label = 1;
                    invoke2 = sessionWorker$doWork$2$22.invoke(this);
                    break;
                } else {
                    if (i25 != 1) {
                        if (i25 == 2) {
                            SafeTrace.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    invoke2 = obj;
                }
                String str5 = (String) invoke2;
                if (str5 != null) {
                    PasscodeViewEvent.VerifyPasscode.WithFingerprint withFingerprint2 = new PasscodeViewEvent.VerifyPasscode.WithFingerprint(str5);
                    this.this$0 = null;
                    this.label = 2;
                    break;
                }
                return Unit.INSTANCE;
            case 20:
                PlaidLinkPresenter plaidLinkPresenter = (PlaidLinkPresenter) this.this$0;
                BlockersScreens.PlaidLinkScreen plaidLinkScreen = plaidLinkPresenter.args;
                CoroutineSingletons coroutineSingletons21 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i26 = this.label;
                if (i26 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    PlaidLinkPresenter.trackInstrumentLink$default(plaidLinkPresenter, InstrumentLinkAuthenticateInstitution.Status.START, null, null, null, null, null, 62);
                    PlaidLinkTokenCreateRequest plaidLinkTokenCreateRequest = new PlaidLinkTokenCreateRequest(Boolean.valueOf(plaidLinkScreen.blockersData.manualAchEnabled), plaidLinkScreen.blockersData.clientScenario, plaidLinkScreen.plaidLinkingConfig, ByteString.EMPTY);
                    AppService appService2 = plaidLinkPresenter.appService;
                    this.label = 1;
                    plaidLinkTokenCreate = appService2.plaidLinkTokenCreate(plaidLinkTokenCreateRequest, this);
                    if (plaidLinkTokenCreate == coroutineSingletons21) {
                        return coroutineSingletons21;
                    }
                } else {
                    if (i26 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    plaidLinkTokenCreate = obj;
                }
                ApiResult apiResult2 = (ApiResult) plaidLinkTokenCreate;
                if (apiResult2 instanceof ApiResult.Failure) {
                    ApiResult.Failure failure = (ApiResult.Failure) apiResult2;
                    plaidLinkPresenter.navigator.goTo(new FailureMessageBlockerScreen(plaidLinkScreen.blockersData, TextUtilsCompat.errorMessaging(plaidLinkPresenter.stringManager, failure, null).message, objArr == true ? 1 : 0, i4));
                    PlaidLinkPresenter.trackInstrumentLink$default(plaidLinkPresenter, InstrumentLinkAuthenticateInstitution.Status.FAILURE, null, null, null, failure, "Cannot retrieve Plaid link token", 14);
                } else {
                    if (!(apiResult2 instanceof ApiResult.Success)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    String str6 = ((PlaidLinkTokenCreateResponse) ((ApiResult.Success) apiResult2).response).link_token;
                    if (str6 == null) {
                        a$$ExternalSyntheticBUOutline0.m$1("link_token is required");
                        return null;
                    }
                    ((MutableState) obj3).setValue(new PlaidLinkViewModel.Ready(new PlaidLinkParams(str6)));
                }
                return Unit.INSTANCE;
            case 21:
                CoroutineSingletons coroutineSingletons22 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i27 = this.label;
                if (i27 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    PlaidLinkPresenter plaidLinkPresenter2 = (PlaidLinkPresenter) this.this$0;
                    PlaidLinkResult plaidLinkResult = ((PlaidLinkViewEvent.ReceivedResult) ((PlaidLinkViewEvent) obj3)).result;
                    this.label = 1;
                    if (plaidLinkResult instanceof PlaidLinkResult.Success) {
                        obj2 = plaidLinkPresenter2.handleLinkSuccess((PlaidLinkResult.Success) plaidLinkResult, this);
                        if (obj2 != coroutineSingletons22) {
                            obj2 = Unit.INSTANCE;
                        }
                    } else {
                        if (!(plaidLinkResult instanceof PlaidLinkResult.Exit)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        PlaidLinkResult.Exit exit = (PlaidLinkResult.Exit) plaidLinkResult;
                        BlockersDataNavigator blockersDataNavigator = plaidLinkPresenter2.blockersDataNavigator;
                        BetterNavigator.ScreenNavigator screenNavigator = plaidLinkPresenter2.navigator;
                        BlockersScreens.PlaidLinkScreen plaidLinkScreen2 = plaidLinkPresenter2.args;
                        BlockersData blockersData2 = plaidLinkScreen2.blockersData;
                        if (blockersData2.hasLinkedCard) {
                            screenNavigator.goTo(blockersDataNavigator.getSkip(plaidLinkScreen2, blockersData2));
                            status = InstrumentLinkAuthenticateInstitution.Status.SKIP;
                        } else if (!plaidLinkPresenter2.hasSearched) {
                            status = InstrumentLinkAuthenticateInstitution.Status.CANCEL;
                            plaidLinkPresenter2.blockerFlowAnalytics.onFlowCancelled(blockersData2);
                            screenNavigator.goTo(blockersData2.exitScreen);
                        } else if (blockersData2.manualAchEnabled) {
                            status = InstrumentLinkAuthenticateInstitution.Status.MANUAL_LINK;
                            screenNavigator.goTo(new BlockersScreens.BankAccountLinkingScreen(blockersData2, objArr2 == true ? 1 : 0, z, 58));
                        } else {
                            InstrumentLinkAuthenticateInstitution.Status status3 = InstrumentLinkAuthenticateInstitution.Status.SEARCH;
                            screenNavigator.goTo(blockersDataNavigator.getSkip(plaidLinkScreen2, blockersData2));
                            status2 = status3;
                            Institution institution = exit.institution;
                            PlaidLinkPresenter.trackInstrumentLink$default(plaidLinkPresenter2, status2, null, institution.id, institution.name, null, null, 50);
                            obj2 = Unit.INSTANCE;
                        }
                        status2 = status;
                        Institution institution2 = exit.institution;
                        PlaidLinkPresenter.trackInstrumentLink$default(plaidLinkPresenter2, status2, null, institution2.id, institution2.name, null, null, 50);
                        obj2 = Unit.INSTANCE;
                    }
                    if (obj2 == coroutineSingletons22) {
                        return coroutineSingletons22;
                    }
                } else {
                    if (i27 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 22:
                List list = (List) obj3;
                PromotionPanePresenter promotionPanePresenter = (PromotionPanePresenter) this.this$0;
                CoroutineSingletons coroutineSingletons23 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i28 = this.label;
                if (i28 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    RealProfileManager realProfileManager = promotionPanePresenter.profileManager;
                    String str7 = (String) list.get(1);
                    UiAlias.Type valueOf = UiAlias.Type.valueOf((String) list.get(0));
                    this.label = 1;
                    unregisterAlias = realProfileManager.appService.unregisterAlias(ClientScenario.PROFILE, null, new UnregisterAliasRequest(null, new UiAlias(valueOf, str7), ByteString.EMPTY), this);
                    break;
                } else {
                    if (i28 != 1) {
                        if (i28 == 2) {
                            SafeTrace.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    unregisterAlias = obj;
                }
                if (((ApiResult) unregisterAlias) instanceof ApiResult.Failure) {
                    CoroutineContext coroutineContext = promotionPanePresenter.uiDispatcher;
                    MLKitTitleGenerator$1 mLKitTitleGenerator$1 = new MLKitTitleGenerator$1(promotionPanePresenter, objArr3 == true ? 1 : 0, 29);
                    this.label = 2;
                    break;
                }
                return Unit.INSTANCE;
            case 23:
                PromotionPanePresenter promotionPanePresenter2 = (PromotionPanePresenter) this.this$0;
                CoroutineSingletons coroutineSingletons24 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i29 = this.label;
                if (i29 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    TransferManager transferManager = promotionPanePresenter2.transferManager;
                    String str8 = ((AppMessageAction) obj3).action_argument;
                    str8.getClass();
                    RealTransferManager$addCash$$inlined$map$1 realTransferManager$addCash$$inlined$map$1 = new RealTransferManager$addCash$$inlined$map$1(((RealTransferManager) transferManager).transferData(TransferType.ADD_CASH, false), new Money(new Long(Long.parseLong(str8)), CurrencyCode.USD, 4), i5);
                    this.label = 1;
                    first = FlowKt.first(realTransferManager$addCash$$inlined$map$1, this);
                    if (first == coroutineSingletons24) {
                        return coroutineSingletons24;
                    }
                } else {
                    if (i29 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    first = obj;
                }
                promotionPanePresenter2.navigator.goTo(new BlockersScreens.BalanceTransferLoading(BlockersData.copy$default(FlowStarter.startTransferFlow$default((FlowStarter) promotionPanePresenter2.flowStarter.getValue(), PaymentScreens$HomeScreens$Home.INSTANCE, null, 6), null, null, null, null, null, null, null, null, false, false, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, (TransferData) first, null, null, null, null, null, null, null, null, null, false, null, null, null, -1, 65531)));
                return Unit.INSTANCE;
            case 24:
                CoroutineSingletons coroutineSingletons25 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i30 = this.label;
                if (i30 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    PromotionPanePresenter promotionPanePresenter3 = (PromotionPanePresenter) this.this$0;
                    Signal signal = promotionPanePresenter3.signOut;
                    PagingDataPresenter$collectFrom$2 pagingDataPresenter$collectFrom$2 = new PagingDataPresenter$collectFrom$2(promotionPanePresenter3, (String) obj3, objArr4 == true ? 1 : 0, 22);
                    this.label = 1;
                    if (StateFlowKt.until(signal, pagingDataPresenter$collectFrom$2, this) == coroutineSingletons25) {
                        return coroutineSingletons25;
                    }
                } else {
                    if (i30 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 25:
                CoroutineSingletons coroutineSingletons26 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i31 = this.label;
                if (i31 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    RequestPushNotificationsBlockerPresenter requestPushNotificationsBlockerPresenter = (RequestPushNotificationsBlockerPresenter) this.this$0;
                    List list2 = RequestPushNotificationsBlockerPresenter.ACCOUNT_HOLDER_LEVEL_CATEGORIES;
                    Map map = (Map) ((MutableState) obj3).getValue();
                    this.label = 1;
                    if (RequestPushNotificationsBlockerPresenter.access$checkAndRequestNotificationPermissions(requestPushNotificationsBlockerPresenter, map, this) == coroutineSingletons26) {
                        return coroutineSingletons26;
                    }
                } else {
                    if (i31 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 26:
                SavingsTransferOptionSelectionPresenter savingsTransferOptionSelectionPresenter = (SavingsTransferOptionSelectionPresenter) this.this$0;
                BlockersScreens.SavingsTransferOptionSelectionScreen savingsTransferOptionSelectionScreen = savingsTransferOptionSelectionPresenter.args;
                CoroutineSingletons coroutineSingletons27 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i32 = this.label;
                if (i32 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    savingsTransferOptionSelectionPresenter.blockerFlowAnalytics.onFlowCancelled(savingsTransferOptionSelectionScreen.getBlockersData());
                    this.label = 1;
                    if (BlockersHelper.handleBlockerAction$default(savingsTransferOptionSelectionPresenter.blockersHelper, (BlockerAction) obj3, savingsTransferOptionSelectionScreen, null, null, false, null, null, this, EnumC0170g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE) == coroutineSingletons27) {
                        return coroutineSingletons27;
                    }
                } else {
                    if (i32 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 27:
                CoroutineSingletons coroutineSingletons28 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i33 = this.label;
                if (i33 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    ChannelAsFlow consumeAsFlow = FlowKt.consumeAsFlow((BufferedChannel) ((DisclosurePresenter) this.this$0).navigator);
                    RealBrazeManager$openSession$1$1 realBrazeManager$openSession$1$1 = new RealBrazeManager$openSession$1$1((CardLockPresenter) obj3, 9);
                    this.label = 1;
                    if (consumeAsFlow.collect(realBrazeManager$openSession$1$1, this) == coroutineSingletons28) {
                        return coroutineSingletons28;
                    }
                } else {
                    if (i33 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 28:
                LocalHomePresenter localHomePresenter = (LocalHomePresenter) obj3;
                BetterNavigator.ScreenNavigator screenNavigator2 = (BetterNavigator.ScreenNavigator) localHomePresenter.navigator;
                AndroidStringManager androidStringManager = (AndroidStringManager) localHomePresenter.featureFlagManager;
                BlockersScreens.SignatureScreen signatureScreen = (BlockersScreens.SignatureScreen) localHomePresenter.syncer;
                CoroutineSingletons coroutineSingletons29 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i34 = this.label;
                if (i34 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    ByteString.Companion companion = ByteString.Companion;
                    Signature signature$customizations = ((SignatureState) ((SignatureViewEvent.Submit) ((SignatureViewEvent) this.this$0)).signatureProvider.f$0).getSignature$customizations();
                    Bitmap bitmap = signature$customizations != null ? signature$customizations.getBitmap() : null;
                    bitmap.getClass();
                    Bitmap copy = bitmap.copy(Bitmap.Config.ARGB_8888, false);
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(copy.getAllocationByteCount());
                    try {
                        if (!copy.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream)) {
                            throw new IllegalStateException("Failed to compress bitmap");
                        }
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        byteArray.getClass();
                        byteArrayOutputStream.close();
                        byte[] copyOf = Arrays.copyOf(byteArray, byteArray.length);
                        ByteString byteString = new ByteString(Arrays.copyOf(copyOf, copyOf.length));
                        Analytics analytics = (Analytics) localHomePresenter.clearMarketingBadgesIfNeeded;
                        BlockersData blockersData3 = signatureScreen.blockersData;
                        PagingDataPresenter$collectFrom$2 pagingDataPresenter$collectFrom$22 = new PagingDataPresenter$collectFrom$2(localHomePresenter, byteString, continuation, 27);
                        this.label = 1;
                        trackBlockerSubmissionAnalytics$default = PointerInputModifierNodeKt.trackBlockerSubmissionAnalytics$default(8, blockersData3, analytics, androidStringManager, this, null, pagingDataPresenter$collectFrom$22);
                        if (trackBlockerSubmissionAnalytics$default == coroutineSingletons29) {
                            return coroutineSingletons29;
                        }
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            Utf8.closeFinally(byteArrayOutputStream, th);
                            throw th2;
                        }
                    }
                } else {
                    if (i34 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    trackBlockerSubmissionAnalytics$default = obj;
                }
                ApiResult apiResult3 = (ApiResult) trackBlockerSubmissionAnalytics$default;
                if (apiResult3 instanceof ApiResult.Success) {
                    BlockersData blockersData4 = signatureScreen.blockersData;
                    ResponseContext responseContext = ((SetSignatureResponse) ((ApiResult.Success) apiResult3).response).response_context;
                    responseContext.getClass();
                    Parcelable.Creator<BlockersData> creator = BlockersData.CREATOR;
                    screenNavigator2.goTo(((BlockersDataNavigator) localHomePresenter.tabContentPresenterFactory).getNext(signatureScreen, blockersData4.updateFromResponseContext(responseContext, false)));
                } else if (apiResult3 instanceof ApiResult.Failure) {
                    screenNavigator2.goTo(new ProfileScreens.ErrorScreen(TextUtilsCompat.errorMessaging(androidStringManager, (ApiResult.Failure) apiResult3, null).message, null, 14));
                }
                return Unit.INSTANCE;
            default:
                DisclosurePresenter disclosurePresenter = (DisclosurePresenter) this.this$0;
                CoroutineSingletons coroutineSingletons30 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i35 = this.label;
                if (i35 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    DisclosurePresenter.trackInstrumentLink$default(disclosurePresenter, InstrumentLinkAuthenticateInstitution.Status.START, null, null, null, null, 30);
                    InitiateStripeLinkRequest initiateStripeLinkRequest = new InitiateStripeLinkRequest(null, ByteString.EMPTY);
                    StripeBankLinkingService stripeBankLinkingService = (StripeBankLinkingService) disclosurePresenter.appService;
                    String str9 = ((BlockersScreens.StripeLinkScreen) disclosurePresenter.args).blockersData.flowToken;
                    this.label = 1;
                    createStripeLinkToken = stripeBankLinkingService.createStripeLinkToken(str9, initiateStripeLinkRequest, this);
                    if (createStripeLinkToken == coroutineSingletons30) {
                        return coroutineSingletons30;
                    }
                } else {
                    if (i35 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    createStripeLinkToken = obj;
                }
                ApiResult apiResult4 = (ApiResult) createStripeLinkToken;
                if (apiResult4 instanceof ApiResult.Failure) {
                    ApiResult.Failure failure2 = (ApiResult.Failure) apiResult4;
                    DisclosurePresenter.trackInstrumentLink$default(disclosurePresenter, InstrumentLinkAuthenticateInstitution.Status.FAILURE, null, null, failure2, "Cannot retrieve Stripe link token", 6);
                    disclosurePresenter.exitWithError(failure2);
                } else {
                    if (!(apiResult4 instanceof ApiResult.Success)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    InitiateStripeLinkResponse initiateStripeLinkResponse = (InitiateStripeLinkResponse) ((ApiResult.Success) apiResult4).response;
                    String str10 = initiateStripeLinkResponse.client_secret;
                    if (str10 == null) {
                        a$$ExternalSyntheticBUOutline0.m$1("client_secret is required");
                        return null;
                    }
                    String str11 = initiateStripeLinkResponse.publishable_key;
                    if (str11 == null) {
                        a$$ExternalSyntheticBUOutline0.m$1("publishable_key is required");
                        return null;
                    }
                    ((MutableState) obj3).setValue(new StripeLinkViewModel.Ready(new StripeLinkParams(str10, str11)));
                }
                return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SsnPresenter$models$2$2(Object obj, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$event = obj;
    }
}
