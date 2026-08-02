package com.squareup.cash.moneybot.presenters;

import android.content.res.Resources;
import android.icu.text.MessageFormat;
import androidx.cardview.widget.CardViewApi21Impl;
import androidx.compose.foundation.gestures.DefaultTransformableState;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.material3.DatePickerKt$$ExternalSyntheticLambda24;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.ParcelableSnapshotMutableLongState;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.platform.DelegatingSoftwareKeyboardController;
import androidx.glance.session.SessionWorkerKt$runSession$snapshotMonitor$1;
import androidx.room.util.DBUtil;
import app.cash.api.ApiResult;
import app.cash.badging.backend.RealBadger2$setup$lambda$0$$inlined$mapNotNull$1;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import app.cash.inputfieldtext.InputFieldText;
import app.cash.local.presenters.LocalCashBalancePresenter$models$$inlined$CollectEffect$1$1;
import app.cash.local.presenters.wallet.LocalHomePresenter;
import app.cash.local.presenters.wallet.TabContentPresenter$models$4$1$1$1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.fillr.e0;
import com.google.android.gms.internal.mlkit_vision_face.zzmn;
import com.squareup.cash.R;
import com.squareup.cash.account.navigation.RealAccountOutboundNavigator;
import com.squareup.cash.activity.backend.loader.RealActivitiesManager$activities$2$1$2;
import com.squareup.cash.banking.presenters.TransfersPresenter;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.boost.db.Reward$Adapter;
import com.squareup.cash.boost.db.RewardSlotQueries;
import com.squareup.cash.card.onboarding.core.CardSceneEffectKt$cardSettleFlow$$inlined$flatMapLatest$1;
import com.squareup.cash.cdf.asset.AssetRequestShareLink;
import com.squareup.cash.cdf.moneybot.HomeItemType;
import com.squareup.cash.cdf.moneybot.MoneybotChatStart;
import com.squareup.cash.common.viewmodels.ColorModel;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.data.blockers.FlowStarter;
import com.squareup.cash.data.blockers.RealFlowStarter;
import com.squareup.cash.formview.components.FormCashtag$8$invokeSuspend$$inlined$map$1;
import com.squareup.cash.formview.components.arcade.ArcadeFormTextInputGroupView;
import com.squareup.cash.globalsearch.backend.real.RealGlobalSearchRepository;
import com.squareup.cash.globalsearch.backend.real.RealGlobalSearchRepository$getInitialResults$1$1;
import com.squareup.cash.growtools.presenters.manager.autoinvest.GrowToolsAutoInvestManager;
import com.squareup.cash.growtools.presenters.manager.state.GrowToolsManagerState;
import com.squareup.cash.instruments.common.BalanceSnapshot;
import com.squareup.cash.instruments.presenters.InstrumentSelectionBlockerPresenter;
import com.squareup.cash.instruments.presenters.InstrumentSelectionPresenter$models$2$1$1;
import com.squareup.cash.instruments.views.InstrumentCellKt$$ExternalSyntheticLambda11;
import com.squareup.cash.investing.backend.api.NetworkStatus;
import com.squareup.cash.investing.backend.real.RealInvestmentEntitiesKt;
import com.squareup.cash.investing.backend.real.categories.RealCategoryBackend;
import com.squareup.cash.investing.db.WithHoldings;
import com.squareup.cash.investing.presenters.TradeEvent$TransferAllShares;
import com.squareup.cash.investing.presenters.TransferStockPresenter;
import com.squareup.cash.investing.presenters.TransferStockPresenter$models$3$1$2;
import com.squareup.cash.investing.presenters.search.InvestingSearchPresenter;
import com.squareup.cash.investing.primitives.CategoryToken;
import com.squareup.cash.investing.primitives.InvestingState;
import com.squareup.cash.keystore.AttestedKeyService;
import com.squareup.cash.keystore.RealMessageSigner;
import com.squareup.cash.merchant.views.MerchantBlockingViewKt$$ExternalSyntheticLambda15;
import com.squareup.cash.money.views.MoneyTabUIKt$$ExternalSyntheticLambda9;
import com.squareup.cash.moneybot.analytics.RealMoneybotAnalyticsService;
import com.squareup.cash.moneybot.backend.RealMoneybotChatMessagesCache;
import com.squareup.cash.moneybot.presenters.MoneybotChatPresenter;
import com.squareup.cash.moneybot.screens.HomeSourceContext;
import com.squareup.cash.moneybot.viewmodels.chat.MoneybotChatViewEvent$SuggestionEvent$SuggestionMetadata;
import com.squareup.cash.moneybot.viewmodels.chat.MoneybotChatViewModel;
import com.squareup.cash.music.presenters.MusicPresenter;
import com.squareup.cash.offers.db.OffersSheetQueries$ForSheetKeyQuery;
import com.squareup.cash.offers.presenters.OffersDetailsPresenter;
import com.squareup.cash.p2pblocking.presenters.BaseAllowlistSelectionPresenter;
import com.squareup.cash.p2pblocking.presenters.SearchState;
import com.squareup.cash.p2pblocking.viewmodels.AllowlistSelectionViewEvent;
import com.squareup.cash.p2pblocking.viewmodels.P2PFailureDialogModel;
import com.squareup.cash.p2pblocking.viewmodels.P2PListRowTapButtonEvent;
import com.squareup.cash.payments.backend.api.PaymentLinkRepository$CreatePaymentLinkResult;
import com.squareup.cash.payments.presenters.NearbyPayRequestPresenter$models$10$1$1$1;
import com.squareup.cash.payments.presenters.PaymentConfigurationPresenter;
import com.squareup.cash.payments.presenters.PaymentRouterData;
import com.squareup.cash.payments.presenters.QuickPayPresenter;
import com.squareup.cash.payments.screens.PaymentScreens$HomeScreens$Home;
import com.squareup.cash.payments.viewmodels.PaymentConfigurationViewModel;
import com.squareup.cash.phoneplans.WirelessProviderListPresenter;
import com.squareup.cash.pools.presenters.PoolsListPresenter;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.screens.blockers.AmountSheetSavedState;
import com.squareup.cash.sharesheet.ShareSheetPresenter;
import com.squareup.cash.util.clock.AndroidClock;
import com.squareup.cash.wallet.presenters.CardLockPresenter;
import com.squareup.cash.wallet.presenters.CardSchemePresenter$toHeroModule$3$1$1;
import com.squareup.preferences.values.RecentMoneybotSession;
import com.squareup.protos.cash.discover.api.app.v2.api.SearchRequest;
import com.squareup.protos.cash.fiatly.api.v2.GetPaymentUpdatesBySessionRequest;
import com.squareup.protos.cash.fiatly.api.v2.GetPaymentUpdatesBySessionResponse;
import com.squareup.protos.cash.fiatly.api.v2.GrpcP2pRealTimeServiceClient;
import com.squareup.protos.cash.kgoose.api.v3.FeedbackType;
import com.squareup.protos.cash.kgoose.api.v3.cash.CashKgooseService;
import com.squareup.protos.cash.kgoose.api.v3.cash.SubmitFeedbackRequest;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.api.UiAlias;
import com.squareup.protos.franklin.app.AppService;
import com.squareup.protos.franklin.app.GetFlowResponse;
import com.squareup.protos.franklin.app.GetHistoricalExchangeDataRequest;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.protos.franklin.common.SyncInvestmentCategory;
import com.squareup.protos.franklin.investing.common.HistoricalRange;
import com.squareup.wire.GrpcMethod;
import com.squareup.wire.WireGrpcClient;
import com.squareup.wire.internal.RealGrpcStreamingCall;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import dev.zacsweers.metro.internal.DoubleCheck;
import io.noties.markwon.MarkwonConfiguration;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Lazy;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.time.Duration;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.channels.ReceiveChannel;
import kotlinx.coroutines.flow.ChannelFlowBuilder;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SafeFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowImpl;
import kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest;
import net.idrnd.face.iad.capture.internal.o0;
import okhttp3.internal.publicsuffix.AssetPublicSuffixList;
import okio.ByteString;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class MoneybotChatPresenter$models$6$1 extends SuspendLambda implements Function2 {
    public Object $chatKickoffParams$delegate;
    public Object $chatSessionState$delegate;
    public final /* synthetic */ Object $currentSuggestionsId$delegate;
    public final /* synthetic */ int $r8$classId;
    public Object L$0;
    public Object L$1;
    public int label;
    public Object this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MoneybotChatPresenter$models$6$1(TransferStockPresenter transferStockPresenter, WithHoldings withHoldings, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, Channel channel, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = 10;
        this.L$0 = transferStockPresenter;
        this.L$1 = withHoldings;
        this.$chatSessionState$delegate = mutableState;
        this.$chatKickoffParams$delegate = mutableState2;
        this.$currentSuggestionsId$delegate = mutableState3;
        this.this$0 = channel;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v9 */
    private final Object invokeSuspend$com$squareup$cash$payments$presenters$NearbyPayRequestPresenter$models$10$1$1(Object obj) {
        CardLockPresenter cardLockPresenter = (CardLockPresenter) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                SafeTrace.throwOnFailure(obj);
                ChannelFlowBuilder channelFlow = FlowKt.channelFlow(new MoneybotChatPresenter$models$6$1((AssetPublicSuffixList) ((MarkwonConfiguration) cardLockPresenter.issuedCardManager).linkResolver, (String) this.L$0, null));
                NearbyPayRequestPresenter$models$10$1$1$1 nearbyPayRequestPresenter$models$10$1$1$1 = new NearbyPayRequestPresenter$models$10$1$1$1(this.this$0, (Object) cardLockPresenter, this.$currentSuggestionsId$delegate, this.$chatSessionState$delegate, 0);
                this.label = 1;
                Object collect = channelFlow.collect(nearbyPayRequestPresenter$models$10$1$1$1, this);
                this = collect;
                if (collect == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                this = this;
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Exception unused) {
            ((MutableState) this.$chatKickoffParams$delegate).setValue(Boolean.TRUE);
        }
        return Unit.INSTANCE;
    }

    private final Object invokeSuspend$com$squareup$cash$payments$presenters$PaymentConfigurationPresenter$models$28$13(Object obj) {
        MutableState mutableState;
        Object createPaymentLink;
        PaymentConfigurationPresenter paymentConfigurationPresenter;
        PaymentConfigurationViewModel.RequestShareOption requestShareOption;
        PaymentConfigurationPresenter paymentConfigurationPresenter2 = (PaymentConfigurationPresenter) this.this$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            paymentConfigurationPresenter2.analytics.track(new AssetRequestShareLink(paymentConfigurationPresenter2.paymentToken.toString(), paymentConfigurationPresenter2.flowToken), null);
            PaymentConfigurationViewModel paymentConfigurationViewModel = (PaymentConfigurationViewModel) ((MutableState) this.$chatKickoffParams$delegate).getValue();
            PaymentConfigurationViewModel.RequestShareOption requestShareOption2 = paymentConfigurationViewModel instanceof PaymentConfigurationViewModel.RequestShareOption ? (PaymentConfigurationViewModel.RequestShareOption) paymentConfigurationViewModel : null;
            if (requestShareOption2 != null) {
                String str = requestShareOption2.note;
                mutableState = (MutableState) this.$currentSuggestionsId$delegate;
                PaymentRouterData.ShareLink shareLink = ((PaymentRouterData) mutableState.getValue()).shareLink;
                if (shareLink != null && Intrinsics.areEqual(str, shareLink.note)) {
                    paymentConfigurationPresenter2.intentLauncher.shareText(shareLink.link, null, null);
                    return Unit.INSTANCE;
                }
                mutableState.setValue(PaymentRouterData.copy$default((PaymentRouterData) mutableState.getValue(), null, null, null, false, false, false, null, null, false, null, true, false, null, null, null, null, null, null, false, 16769023));
                AssetPublicSuffixList assetPublicSuffixList = paymentConfigurationPresenter2.paymentLinkRepository;
                Money money = ((PaymentRouterData) mutableState.getValue()).amount;
                this.L$0 = paymentConfigurationPresenter2;
                this.$chatSessionState$delegate = mutableState;
                this.L$1 = requestShareOption2;
                this.label = 1;
                createPaymentLink = assetPublicSuffixList.createPaymentLink(money, str, this);
                if (createPaymentLink == coroutineSingletons) {
                    return coroutineSingletons;
                }
                paymentConfigurationPresenter = paymentConfigurationPresenter2;
                requestShareOption = requestShareOption2;
            }
            return Unit.INSTANCE;
        }
        if (i != 1) {
            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        requestShareOption = (PaymentConfigurationViewModel.RequestShareOption) this.L$1;
        MutableState mutableState2 = (MutableState) this.$chatSessionState$delegate;
        PaymentConfigurationPresenter paymentConfigurationPresenter3 = (PaymentConfigurationPresenter) this.L$0;
        SafeTrace.throwOnFailure(obj);
        mutableState = mutableState2;
        paymentConfigurationPresenter = paymentConfigurationPresenter3;
        createPaymentLink = obj;
        PaymentLinkRepository$CreatePaymentLinkResult paymentLinkRepository$CreatePaymentLinkResult = (PaymentLinkRepository$CreatePaymentLinkResult) createPaymentLink;
        if (paymentLinkRepository$CreatePaymentLinkResult instanceof PaymentLinkRepository$CreatePaymentLinkResult.LinkCreated) {
            PaymentRouterData paymentRouterData = (PaymentRouterData) mutableState.getValue();
            String str2 = ((PaymentLinkRepository$CreatePaymentLinkResult.LinkCreated) paymentLinkRepository$CreatePaymentLinkResult).link;
            mutableState.setValue(PaymentRouterData.copy$default(paymentRouterData, null, null, null, false, false, false, null, null, false, null, false, false, new PaymentRouterData.ShareLink(str2, requestShareOption.note, true), null, null, null, null, null, false, 16744447));
            paymentConfigurationPresenter.intentLauncher.shareText(str2, null, null);
        } else if (paymentLinkRepository$CreatePaymentLinkResult instanceof PaymentLinkRepository$CreatePaymentLinkResult.HasBlockers) {
            BetterNavigator.ScreenNavigator screenNavigator = paymentConfigurationPresenter.navigator;
            FlowStarter flowStarter = paymentConfigurationPresenter.flowStarter;
            GetFlowResponse getFlowResponse = ((PaymentLinkRepository$CreatePaymentLinkResult.HasBlockers) paymentLinkRepository$CreatePaymentLinkResult).response;
            BlockersData.AnalyticsData analyticsData = new BlockersData.AnalyticsData(BlockersData.AnalyticsData.Source.P2P, paymentConfigurationPresenter.flowToken, 4);
            RealFlowStarter realFlowStarter = (RealFlowStarter) flowStarter;
            getFlowResponse.getClass();
            BlockersData startFlow$default = FlowStarter.startFlow$default(realFlowStarter, BlockersData.Flow.CLIENT_SCENARIO, PaymentScreens$HomeScreens$Home.INSTANCE, null, getFlowResponse.client_scenario, getFlowResponse.token, null, analyticsData, null, null, 852);
            ResponseContext responseContext = getFlowResponse.response_context;
            if (responseContext != null) {
                startFlow$default = startFlow$default.updateFromResponseContext(responseContext, false);
            }
            screenNavigator.goTo(realFlowStarter.blockersDataNavigator.getNext(null, startFlow$default));
        } else {
            if (!Intrinsics.areEqual(paymentLinkRepository$CreatePaymentLinkResult, PaymentLinkRepository$CreatePaymentLinkResult.Failed.INSTANCE)) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
            mutableState.setValue(PaymentRouterData.copy$default((PaymentRouterData) mutableState.getValue(), null, null, null, false, false, false, null, null, false, null, false, true, null, null, null, null, null, null, false, 16760831));
        }
        mutableState.setValue(PaymentRouterData.copy$default((PaymentRouterData) mutableState.getValue(), null, null, null, false, false, false, null, null, false, null, false, false, null, null, null, null, null, null, false, 16769023));
        return Unit.INSTANCE;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:24:0x002f
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1179)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0052 A[Catch: CancellationException -> 0x002f, TRY_ENTER, TryCatch #0 {CancellationException -> 0x002f, blocks: (B:9:0x0015, B:17:0x0052, B:21:0x0079), top: B:8:0x0015 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0050 -> B:10:0x002f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final java.lang.Object invokeSuspend$com$squareup$cash$payments$views$personalization$TransformableKt$transformable$3$1$1(java.lang.Object r11) {
        /*
            r10 = this;
            java.lang.Object r0 = r10.$chatSessionState$delegate
            r3 = r0
            kotlinx.coroutines.channels.Channel r3 = (kotlinx.coroutines.channels.Channel) r3
            java.lang.Object r0 = r10.this$0
            kotlinx.coroutines.CoroutineScope r0 = (kotlinx.coroutines.CoroutineScope) r0
            kotlin.coroutines.intrinsics.CoroutineSingletons r7 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r10.label
            r8 = 2
            r9 = 1
            if (r1 == 0) goto L2c
            if (r1 == r9) goto L20
            if (r1 != r8) goto L19
            papa.SafeTrace.throwOnFailure(r11)     // Catch: java.util.concurrent.CancellationException -> L2f
            goto L2f
        L19:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            bo.app.a$$ExternalSyntheticBUOutline0.m$1(r10)
            r10 = 0
            return r10
        L20:
            java.lang.Object r1 = r10.L$1
            kotlin.jvm.internal.Ref$ObjectRef r1 = (kotlin.jvm.internal.Ref$ObjectRef) r1
            java.lang.Object r2 = r10.L$0
            kotlin.jvm.internal.Ref$ObjectRef r2 = (kotlin.jvm.internal.Ref$ObjectRef) r2
            papa.SafeTrace.throwOnFailure(r11)
            goto L4a
        L2c:
            papa.SafeTrace.throwOnFailure(r11)
        L2f:
            boolean r11 = kotlinx.coroutines.JobKt.isActive(r0)
            if (r11 == 0) goto L7e
            kotlin.jvm.internal.Ref$ObjectRef r1 = new kotlin.jvm.internal.Ref$ObjectRef
            r1.<init>()
            r10.this$0 = r0
            r10.L$0 = r1
            r10.L$1 = r1
            r10.label = r9
            java.lang.Object r11 = r3.receive(r10)
            if (r11 != r7) goto L49
            goto L7d
        L49:
            r2 = r1
        L4a:
            r1.element = r11
            java.lang.Object r11 = r2.element
            boolean r11 = r11 instanceof com.squareup.cash.payments.views.personalization.TransformationState$TransformationStarted
            if (r11 == 0) goto L2f
            java.lang.Object r11 = r10.$chatKickoffParams$delegate     // Catch: java.util.concurrent.CancellationException -> L2f
            androidx.compose.foundation.gestures.DefaultTransformableState r11 = (androidx.compose.foundation.gestures.DefaultTransformableState) r11     // Catch: java.util.concurrent.CancellationException -> L2f
            androidx.compose.foundation.MutatePriority r1 = androidx.compose.foundation.MutatePriority.Default     // Catch: java.util.concurrent.CancellationException -> L2f
            com.squareup.cash.pools.presenters.PoolsListPresenter$models$2$2 r1 = new com.squareup.cash.pools.presenters.PoolsListPresenter$models$2$2     // Catch: java.util.concurrent.CancellationException -> L2f
            java.lang.Object r4 = r10.$currentSuggestionsId$delegate     // Catch: java.util.concurrent.CancellationException -> L2f
            kotlin.jvm.functions.Function0 r4 = (kotlin.jvm.functions.Function0) r4     // Catch: java.util.concurrent.CancellationException -> L2f
            r6 = 6
            r5 = 0
            r1.<init>(r2, r3, r4, r5, r6)     // Catch: java.util.concurrent.CancellationException -> L2f
            r10.this$0 = r0     // Catch: java.util.concurrent.CancellationException -> L2f
            r10.L$0 = r5     // Catch: java.util.concurrent.CancellationException -> L2f
            r10.L$1 = r5     // Catch: java.util.concurrent.CancellationException -> L2f
            r10.label = r8     // Catch: java.util.concurrent.CancellationException -> L2f
            androidx.camera.camera2.pipe.compat.VirtualCameraState$connect$2$1 r2 = new androidx.camera.camera2.pipe.compat.VirtualCameraState$connect$2$1     // Catch: java.util.concurrent.CancellationException -> L2f
            r2.<init>(r11, r1, r5)     // Catch: java.util.concurrent.CancellationException -> L2f
            java.lang.Object r11 = kotlinx.coroutines.JobKt.coroutineScope(r2, r10)     // Catch: java.util.concurrent.CancellationException -> L2f
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED     // Catch: java.util.concurrent.CancellationException -> L2f
            if (r11 != r1) goto L79
            goto L7b
        L79:
            kotlin.Unit r11 = kotlin.Unit.INSTANCE     // Catch: java.util.concurrent.CancellationException -> L2f
        L7b:
            if (r11 != r7) goto L2f
        L7d:
            return r7
        L7e:
            kotlin.Unit r10 = kotlin.Unit.INSTANCE
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.cash.moneybot.presenters.MoneybotChatPresenter$models$6$1.invokeSuspend$com$squareup$cash$payments$views$personalization$TransformableKt$transformable$3$1$1(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        Object obj2 = this.$currentSuggestionsId$delegate;
        switch (i) {
            case 0:
                return new MoneybotChatPresenter$models$6$1((MoneybotChatPresenter) this.this$0, (MutableState) this.$chatSessionState$delegate, (MutableState) this.$chatKickoffParams$delegate, (MutableState) obj2, continuation);
            case 1:
                MoneybotChatPresenter$models$6$1 moneybotChatPresenter$models$6$1 = new MoneybotChatPresenter$models$6$1((Flow) this.L$1, continuation, (MutableState) this.$chatSessionState$delegate, (ArcadeFormTextInputGroupView) this.this$0, (FocusRequester) this.$chatKickoffParams$delegate, (DelegatingSoftwareKeyboardController) obj2);
                moneybotChatPresenter$models$6$1.L$0 = obj;
                return moneybotChatPresenter$models$6$1;
            case 2:
                MoneybotChatPresenter$models$6$1 moneybotChatPresenter$models$6$12 = new MoneybotChatPresenter$models$6$1((RealGlobalSearchRepository) this.this$0, (String) this.L$0, (String) this.$chatSessionState$delegate, (String) this.$chatKickoffParams$delegate, (SearchRequest.Origin) obj2, continuation);
                moneybotChatPresenter$models$6$12.L$1 = obj;
                return moneybotChatPresenter$models$6$12;
            case 3:
                MoneybotChatPresenter$models$6$1 moneybotChatPresenter$models$6$13 = new MoneybotChatPresenter$models$6$1((Flow) this.L$1, continuation, this.this$0, obj2, (MutableState) this.$chatSessionState$delegate, (MutableState) this.$chatKickoffParams$delegate, 3);
                moneybotChatPresenter$models$6$13.L$0 = obj;
                return moneybotChatPresenter$models$6$13;
            case 4:
                MoneybotChatPresenter$models$6$1 moneybotChatPresenter$models$6$14 = new MoneybotChatPresenter$models$6$1((Flow) this.L$1, continuation, (e0) this.this$0, (GrowToolsManagerState) this.$chatKickoffParams$delegate, (CoroutineScope) obj2, (MutableState) this.$chatSessionState$delegate, 4);
                moneybotChatPresenter$models$6$14.L$0 = obj;
                return moneybotChatPresenter$models$6$14;
            case 5:
                MoneybotChatPresenter$models$6$1 moneybotChatPresenter$models$6$15 = new MoneybotChatPresenter$models$6$1((Flow) this.L$1, continuation, this.this$0, obj2, (MutableState) this.$chatSessionState$delegate, (MutableState) this.$chatKickoffParams$delegate, 5);
                moneybotChatPresenter$models$6$15.L$0 = obj;
                return moneybotChatPresenter$models$6$15;
            case 6:
                MoneybotChatPresenter$models$6$1 moneybotChatPresenter$models$6$16 = new MoneybotChatPresenter$models$6$1((Flow) this.L$1, continuation, (MoleculePresenter) this.this$0, this.$chatSessionState$delegate, (State) this.$chatKickoffParams$delegate, obj2, 6);
                moneybotChatPresenter$models$6$16.L$0 = obj;
                return moneybotChatPresenter$models$6$16;
            case 7:
                MoneybotChatPresenter$models$6$1 moneybotChatPresenter$models$6$17 = new MoneybotChatPresenter$models$6$1((Flow) this.L$1, continuation, (MoleculePresenter) this.this$0, this.$chatSessionState$delegate, (State) this.$chatKickoffParams$delegate, obj2, 7);
                moneybotChatPresenter$models$6$17.L$0 = obj;
                return moneybotChatPresenter$models$6$17;
            case 8:
                MoneybotChatPresenter$models$6$1 moneybotChatPresenter$models$6$18 = new MoneybotChatPresenter$models$6$1((Flow) this.L$1, continuation, (MoleculePresenter) this.this$0, this.$chatSessionState$delegate, (State) this.$chatKickoffParams$delegate, obj2, 8);
                moneybotChatPresenter$models$6$18.L$0 = obj;
                return moneybotChatPresenter$models$6$18;
            case 9:
                MoneybotChatPresenter$models$6$1 moneybotChatPresenter$models$6$19 = new MoneybotChatPresenter$models$6$1((HistoricalRange) this.$chatSessionState$delegate, (CurrencyCode) this.$chatKickoffParams$delegate, (Reward$Adapter) obj2, continuation, 9);
                moneybotChatPresenter$models$6$19.this$0 = obj;
                return moneybotChatPresenter$models$6$19;
            case 10:
                return new MoneybotChatPresenter$models$6$1((TransferStockPresenter) this.L$0, (WithHoldings) this.L$1, (MutableState) this.$chatSessionState$delegate, (MutableState) this.$chatKickoffParams$delegate, (MutableState) obj2, (Channel) this.this$0, continuation);
            case 11:
                MoneybotChatPresenter$models$6$1 moneybotChatPresenter$models$6$110 = new MoneybotChatPresenter$models$6$1((Flow) this.L$1, continuation, (InvestingSearchPresenter) this.this$0, (MutableState) this.$chatSessionState$delegate, (MutableState) this.$chatKickoffParams$delegate, (ColorModel) obj2, 11);
                moneybotChatPresenter$models$6$110.L$0 = obj;
                return moneybotChatPresenter$models$6$110;
            case 12:
                MoneybotChatPresenter$models$6$1 moneybotChatPresenter$models$6$111 = new MoneybotChatPresenter$models$6$1((InvestingSearchPresenter) this.L$1, (Collection) this.this$0, (ColorModel) obj2, (MutableState) this.$chatSessionState$delegate, (MutableState) this.$chatKickoffParams$delegate, continuation);
                moneybotChatPresenter$models$6$111.L$0 = obj;
                return moneybotChatPresenter$models$6$111;
            case 13:
                MoneybotChatPresenter$models$6$1 moneybotChatPresenter$models$6$112 = new MoneybotChatPresenter$models$6$1((Flow) this.L$1, continuation, this.this$0, this.$chatKickoffParams$delegate, obj2, (MutableState) this.$chatSessionState$delegate, 13);
                moneybotChatPresenter$models$6$112.L$0 = obj;
                return moneybotChatPresenter$models$6$112;
            case 14:
                MoneybotChatPresenter$models$6$1 moneybotChatPresenter$models$6$113 = new MoneybotChatPresenter$models$6$1((Flow) this.L$1, continuation, (ShareSheetPresenter) this.this$0, (MutableState) this.$chatSessionState$delegate, (State) obj2, (MutableState) this.$chatKickoffParams$delegate);
                moneybotChatPresenter$models$6$113.L$0 = obj;
                return moneybotChatPresenter$models$6$113;
            case 15:
                return new MoneybotChatPresenter$models$6$1((MoneybotChatPresenter) this.this$0, (String) this.L$0, (FeedbackType) this.L$1, (String) this.$chatSessionState$delegate, (String) this.$chatKickoffParams$delegate, (String) obj2, continuation);
            case 16:
                MoneybotChatPresenter$models$6$1 moneybotChatPresenter$models$6$114 = new MoneybotChatPresenter$models$6$1((Flow) this.L$1, continuation, this.this$0, obj2, (MutableState) this.$chatSessionState$delegate, (MutableState) this.$chatKickoffParams$delegate, 16);
                moneybotChatPresenter$models$6$114.L$0 = obj;
                return moneybotChatPresenter$models$6$114;
            case 17:
                return new MoneybotChatPresenter$models$6$1((MoneybotChatViewModel.Content.Chat) this.L$0, (LazyListState) this.L$1, (MutableState) this.$chatSessionState$delegate, (MutableState) this.$chatKickoffParams$delegate, (ParcelableSnapshotMutableIntState) this.this$0, (ParcelableSnapshotMutableIntState) obj2, continuation, 17);
            case 18:
                MoneybotChatPresenter$models$6$1 moneybotChatPresenter$models$6$115 = new MoneybotChatPresenter$models$6$1((Flow) this.L$1, continuation, this.this$0, obj2, (MutableState) this.$chatSessionState$delegate, (MutableState) this.$chatKickoffParams$delegate, 18);
                moneybotChatPresenter$models$6$115.L$0 = obj;
                return moneybotChatPresenter$models$6$115;
            case 19:
                MoneybotChatPresenter$models$6$1 moneybotChatPresenter$models$6$116 = new MoneybotChatPresenter$models$6$1((AssetPublicSuffixList) obj2, (String) this.L$0, continuation);
                moneybotChatPresenter$models$6$116.$chatKickoffParams$delegate = obj;
                return moneybotChatPresenter$models$6$116;
            case 20:
                MoneybotChatPresenter$models$6$1 moneybotChatPresenter$models$6$117 = new MoneybotChatPresenter$models$6$1((Flow) this.L$1, continuation, (MoleculePresenter) this.this$0, this.$chatSessionState$delegate, (State) this.$chatKickoffParams$delegate, obj2, 20);
                moneybotChatPresenter$models$6$117.L$0 = obj;
                return moneybotChatPresenter$models$6$117;
            case 21:
                return new MoneybotChatPresenter$models$6$1((BaseAllowlistSelectionPresenter) this.L$1, (MutableState) obj2, (MutableState) this.this$0, continuation);
            case 22:
                return new MoneybotChatPresenter$models$6$1((BaseAllowlistSelectionPresenter) this.L$0, (AllowlistSelectionViewEvent) this.L$1, (MutableState) this.$chatSessionState$delegate, (MutableState) this.$chatKickoffParams$delegate, (ParcelableSnapshotMutableIntState) this.this$0, (ParcelableSnapshotMutableIntState) obj2, continuation, 22);
            case 23:
                MoneybotChatPresenter$models$6$1 moneybotChatPresenter$models$6$118 = new MoneybotChatPresenter$models$6$1((Flow) this.L$1, continuation, (LocalHomePresenter) this.this$0, (Ref$ObjectRef) this.$chatSessionState$delegate, (State) this.$chatKickoffParams$delegate, (State) obj2, 23);
                moneybotChatPresenter$models$6$118.L$0 = obj;
                return moneybotChatPresenter$models$6$118;
            case 24:
                MoneybotChatPresenter$models$6$1 moneybotChatPresenter$models$6$119 = new MoneybotChatPresenter$models$6$1((Flow) this.L$1, continuation, (MoleculePresenter) this.this$0, this.$chatSessionState$delegate, (State) this.$chatKickoffParams$delegate, obj2, 24);
                moneybotChatPresenter$models$6$119.L$0 = obj;
                return moneybotChatPresenter$models$6$119;
            case 25:
                return new MoneybotChatPresenter$models$6$1((CardLockPresenter) this.L$1, (String) this.L$0, (SnapshotStateList) this.this$0, (ParcelableSnapshotMutableLongState) obj2, (MutableState) this.$chatSessionState$delegate, (MutableState) this.$chatKickoffParams$delegate, continuation);
            case 26:
                return new MoneybotChatPresenter$models$6$1((PaymentConfigurationPresenter) this.this$0, (MutableState) this.$chatKickoffParams$delegate, (MutableState) obj2, continuation);
            case 27:
                MoneybotChatPresenter$models$6$1 moneybotChatPresenter$models$6$120 = new MoneybotChatPresenter$models$6$1((Flow) this.L$1, continuation, (MoleculePresenter) this.this$0, this.$chatSessionState$delegate, (State) this.$chatKickoffParams$delegate, obj2, 27);
                moneybotChatPresenter$models$6$120.L$0 = obj;
                return moneybotChatPresenter$models$6$120;
            case 28:
                MoneybotChatPresenter$models$6$1 moneybotChatPresenter$models$6$121 = new MoneybotChatPresenter$models$6$1((Channel) this.$chatSessionState$delegate, (DefaultTransformableState) this.$chatKickoffParams$delegate, (Function0) obj2, continuation, 28);
                moneybotChatPresenter$models$6$121.this$0 = obj;
                return moneybotChatPresenter$models$6$121;
            default:
                MoneybotChatPresenter$models$6$1 moneybotChatPresenter$models$6$122 = new MoneybotChatPresenter$models$6$1((Flow) this.L$1, continuation, (MoleculePresenter) this.this$0, this.$chatSessionState$delegate, (State) this.$chatKickoffParams$delegate, obj2, 29);
                moneybotChatPresenter$models$6$122.L$0 = obj;
                return moneybotChatPresenter$models$6$122;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 19:
                ((MoneybotChatPresenter$models$6$1) create((ProducerScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                break;
        }
        return ((MoneybotChatPresenter$models$6$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:137:0x038d, code lost:
    
        if (r11 != r10) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x03aa, code lost:
    
        if (r5 == r10) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x03d2, code lost:
    
        if (r5.collect(r6, r18) == r10) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x03d5, code lost:
    
        return r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x032f, code lost:
    
        if (r5 == r10) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x047d, code lost:
    
        if (androidx.cardview.widget.CardViewApi21Impl.scrollToPosition(r1, r9, r6, false, r18) == r11) goto L165;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:?, code lost:
    
        return r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x046e, code lost:
    
        if (kotlinx.coroutines.flow.FlowKt.first(r6, r12, r18) == r11) goto L165;
     */
    /* JADX WARN: Code restructure failed: missing block: B:310:0x07ca, code lost:
    
        if (kotlinx.coroutines.JobKt.delay(r10, r18) != r3) goto L256;
     */
    /* JADX WARN: Code restructure failed: missing block: B:446:0x0ad5, code lost:
    
        if (com.squareup.cash.moneybot.presenters.MoneybotChatPresenter.access$cancelLastMessage(r0, r12, r18) == r3) goto L410;
     */
    /* JADX WARN: Removed duplicated region for block: B:293:0x0761  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x0774  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x07a4  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x07b9  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x07a9  */
    /* JADX WARN: Removed duplicated region for block: B:429:0x0a76  */
    /* JADX WARN: Removed duplicated region for block: B:432:0x0a83  */
    /* JADX WARN: Removed duplicated region for block: B:442:0x0aa6  */
    /* JADX WARN: Removed duplicated region for block: B:445:0x0acb  */
    /* JADX WARN: Removed duplicated region for block: B:449:0x0aab  */
    /* JADX WARN: Removed duplicated region for block: B:454:0x0a87  */
    /* JADX WARN: Removed duplicated region for block: B:455:0x0a7a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:130:0x03d2 -> B:122:0x0336). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:276:0x07ca -> B:252:0x073a). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i;
        HomeSourceContext homeSourceContext;
        String str;
        HomeItemType homeItemType;
        com.squareup.cash.moneybot.screens.HomeItemType homeItemType2;
        HomeItemType homeItemType3;
        GetHistoricalExchangeDataRequest getHistoricalExchangeDataRequest;
        GetHistoricalExchangeDataRequest getHistoricalExchangeDataRequest2;
        FlowCollector flowCollector;
        Object obj2;
        ApiResult apiResult;
        boolean z;
        Object obj3;
        Flow formCashtag$8$invokeSuspend$$inlined$map$1;
        Object first;
        Map map;
        Map map2;
        Object obj4;
        Object obj5;
        o0 o0Var;
        GetPaymentUpdatesBySessionRequest getPaymentUpdatesBySessionRequest;
        SearchState searchState;
        Object performSearch;
        MutableState mutableState;
        SearchState copy$default;
        Object handleRowTap;
        int i2 = this.$r8$classId;
        int i3 = 4;
        int i4 = 2;
        Object obj6 = this.$currentSuggestionsId$delegate;
        int i5 = 1;
        Continuation continuation = null;
        switch (i2) {
            case 0:
                MoneybotChatPresenter moneybotChatPresenter = (MoneybotChatPresenter) this.this$0;
                RealMoneybotChatMessagesCache realMoneybotChatMessagesCache = moneybotChatPresenter.chatMessagesCache;
                ParcelableSnapshotMutableState parcelableSnapshotMutableState = moneybotChatPresenter.pendingStartChatMetadata$delegate;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = this.label;
                if (i == 0) {
                    SafeTrace.throwOnFailure(obj);
                    String sessionId = ((MoneybotChatPresenter.ChatSessionState) ((MutableState) this.$chatSessionState$delegate).getValue()).session.getSessionId();
                    if (sessionId == null) {
                        moneybotChatPresenter.setPendingMessages(EmptyList.INSTANCE);
                        moneybotChatPresenter.setStreamingKickoffTexts(EmptySet.INSTANCE);
                        parcelableSnapshotMutableState.setValue(null);
                        ((MutableState) obj6).setValue(null);
                        return Unit.INSTANCE;
                    }
                    realMoneybotChatMessagesCache.cachedScrollPosition = null;
                    ((MutableState) this.$chatKickoffParams$delegate).setValue(null);
                    HomeSourceContext homeSourceContext2 = moneybotChatPresenter.args.homeSourceContext;
                    if (Intrinsics.areEqual(moneybotChatPresenter.getDidClickStartNewChat().value, MoneybotChatPresenter.StartNewChatAction.UserInitiated.INSTANCE)) {
                        homeSourceContext2 = null;
                    }
                    RecentMoneybotSession recentMoneybotSession = new RecentMoneybotSession(sessionId, new Long(moneybotChatPresenter.clock.millis()));
                    this.L$0 = sessionId;
                    this.L$1 = homeSourceContext2;
                    this.label = 1;
                    if (realMoneybotChatMessagesCache.setRecentSession(recentMoneybotSession, this) != coroutineSingletons) {
                        homeSourceContext = homeSourceContext2;
                        str = sessionId;
                        RealMoneybotAnalyticsService realMoneybotAnalyticsService = moneybotChatPresenter.analyticsService;
                        MoneybotChatViewEvent$SuggestionEvent$SuggestionMetadata moneybotChatViewEvent$SuggestionEvent$SuggestionMetadata = (MoneybotChatViewEvent$SuggestionEvent$SuggestionMetadata) parcelableSnapshotMutableState.getValue();
                        if (moneybotChatViewEvent$SuggestionEvent$SuggestionMetadata == null) {
                        }
                        if (homeSourceContext == null) {
                        }
                        if (homeSourceContext != null) {
                        }
                        homeItemType = null;
                        realMoneybotAnalyticsService.analytics.track(new MoneybotChatStart(realMoneybotAnalyticsService.chatId, str, r13, null, r15, homeItemType, homeSourceContext == null ? homeSourceContext.itemId : null), null);
                        parcelableSnapshotMutableState.setValue(null);
                        if (((Boolean) moneybotChatPresenter.pendingCancellation$delegate.getValue()).booleanValue()) {
                        }
                        return Unit.INSTANCE;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i == 2) {
                        SafeTrace.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                homeSourceContext = (HomeSourceContext) this.L$1;
                String str2 = (String) this.L$0;
                SafeTrace.throwOnFailure(obj);
                str = str2;
                RealMoneybotAnalyticsService realMoneybotAnalyticsService2 = moneybotChatPresenter.analyticsService;
                MoneybotChatViewEvent$SuggestionEvent$SuggestionMetadata moneybotChatViewEvent$SuggestionEvent$SuggestionMetadata2 = (MoneybotChatViewEvent$SuggestionEvent$SuggestionMetadata) parcelableSnapshotMutableState.getValue();
                String str3 = moneybotChatViewEvent$SuggestionEvent$SuggestionMetadata2 == null ? moneybotChatViewEvent$SuggestionEvent$SuggestionMetadata2.suggestionsId : null;
                String str4 = homeSourceContext == null ? homeSourceContext.sessionId : null;
                if (homeSourceContext != null || (homeItemType2 = homeSourceContext.itemType) == null) {
                    homeItemType = null;
                } else {
                    int ordinal = homeItemType2.ordinal();
                    if (ordinal == 0) {
                        homeItemType3 = HomeItemType.NEXT_BEST_ACTION;
                    } else {
                        if (ordinal != 1) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        homeItemType3 = HomeItemType.WIDGET;
                    }
                    homeItemType = homeItemType3;
                }
                realMoneybotAnalyticsService2.analytics.track(new MoneybotChatStart(realMoneybotAnalyticsService2.chatId, str, str3, null, str4, homeItemType, homeSourceContext == null ? homeSourceContext.itemId : null), null);
                parcelableSnapshotMutableState.setValue(null);
                if (((Boolean) moneybotChatPresenter.pendingCancellation$delegate.getValue()).booleanValue()) {
                    this.L$0 = null;
                    this.L$1 = null;
                    this.label = 2;
                    break;
                }
                return Unit.INSTANCE;
            case 1:
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i6 = this.label;
                if (i6 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow = (Flow) this.L$1;
                    LocalCashBalancePresenter$models$$inlined$CollectEffect$1$1 localCashBalancePresenter$models$$inlined$CollectEffect$1$1 = new LocalCashBalancePresenter$models$$inlined$CollectEffect$1$1(coroutineScope, (MutableState) this.$chatSessionState$delegate, (ArcadeFormTextInputGroupView) this.this$0, (FocusRequester) this.$chatKickoffParams$delegate, (DelegatingSoftwareKeyboardController) obj6);
                    this.L$0 = null;
                    this.label = 1;
                    if (flow.collect(localCashBalancePresenter$models$$inlined$CollectEffect$1$1, this) == coroutineSingletons2) {
                        return coroutineSingletons2;
                    }
                } else {
                    if (i6 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 2:
                ProducerScope producerScope = (ProducerScope) this.L$1;
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i7 = this.label;
                if (i7 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    RealGlobalSearchRepository$getInitialResults$1$1 realGlobalSearchRepository$getInitialResults$1$1 = new RealGlobalSearchRepository$getInitialResults$1$1((RealGlobalSearchRepository) this.this$0, (String) this.L$0, (String) this.$chatSessionState$delegate, producerScope, (String) this.$chatKickoffParams$delegate, (SearchRequest.Origin) obj6, null);
                    this.L$1 = null;
                    this.label = 1;
                    if (JobKt.coroutineScope(realGlobalSearchRepository$getInitialResults$1$1, this) == coroutineSingletons3) {
                        return coroutineSingletons3;
                    }
                } else {
                    if (i7 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 3:
                CoroutineScope coroutineScope2 = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i8 = this.label;
                if (i8 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow2 = (Flow) this.L$1;
                    LocalCashBalancePresenter$models$$inlined$CollectEffect$1$1 localCashBalancePresenter$models$$inlined$CollectEffect$1$12 = new LocalCashBalancePresenter$models$$inlined$CollectEffect$1$1(coroutineScope2, (GrowToolsAutoInvestManager) this.this$0, (GrowToolsManagerState) obj6, (MutableState) this.$chatSessionState$delegate, (MutableState) this.$chatKickoffParams$delegate, 25);
                    this.L$0 = null;
                    this.label = 1;
                    if (flow2.collect(localCashBalancePresenter$models$$inlined$CollectEffect$1$12, this) == coroutineSingletons4) {
                        return coroutineSingletons4;
                    }
                } else {
                    if (i8 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 4:
                CoroutineScope coroutineScope3 = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i9 = this.label;
                if (i9 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow3 = (Flow) this.L$1;
                    NearbyPayRequestPresenter$models$10$1$1$1 nearbyPayRequestPresenter$models$10$1$1$1 = new NearbyPayRequestPresenter$models$10$1$1$1(coroutineScope3, (e0) this.this$0, (GrowToolsManagerState) this.$chatKickoffParams$delegate, (CoroutineScope) obj6, (MutableState) this.$chatSessionState$delegate, 8);
                    this.L$0 = null;
                    this.label = 1;
                    if (flow3.collect(nearbyPayRequestPresenter$models$10$1$1$1, this) == coroutineSingletons5) {
                        return coroutineSingletons5;
                    }
                } else {
                    if (i9 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 5:
                CoroutineScope coroutineScope4 = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i10 = this.label;
                if (i10 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow4 = (Flow) this.L$1;
                    LocalCashBalancePresenter$models$$inlined$CollectEffect$1$1 localCashBalancePresenter$models$$inlined$CollectEffect$1$13 = new LocalCashBalancePresenter$models$$inlined$CollectEffect$1$1(coroutineScope4, (RealAccountOutboundNavigator) this.this$0, (GrowToolsManagerState) obj6, (MutableState) this.$chatSessionState$delegate, (MutableState) this.$chatKickoffParams$delegate, 26);
                    this.L$0 = null;
                    this.label = 1;
                    if (flow4.collect(localCashBalancePresenter$models$$inlined$CollectEffect$1$13, this) == coroutineSingletons6) {
                        return coroutineSingletons6;
                    }
                } else {
                    if (i10 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 6:
                CoroutineScope coroutineScope5 = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i11 = this.label;
                if (i11 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow5 = (Flow) this.L$1;
                    LocalCashBalancePresenter$models$$inlined$CollectEffect$1$1 localCashBalancePresenter$models$$inlined$CollectEffect$1$14 = new LocalCashBalancePresenter$models$$inlined$CollectEffect$1$1(27, (MutableState) this.$chatSessionState$delegate, (MutableState) this.$chatKickoffParams$delegate, (MutableState) obj6, (InstrumentSelectionBlockerPresenter) this.this$0, coroutineScope5);
                    this.L$0 = null;
                    this.label = 1;
                    if (flow5.collect(localCashBalancePresenter$models$$inlined$CollectEffect$1$14, this) == coroutineSingletons7) {
                        return coroutineSingletons7;
                    }
                } else {
                    if (i11 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 7:
                CoroutineScope coroutineScope6 = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons8 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i12 = this.label;
                if (i12 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow6 = (Flow) this.L$1;
                    InstrumentSelectionPresenter$models$2$1$1 instrumentSelectionPresenter$models$2$1$1 = new InstrumentSelectionPresenter$models$2$1$1(coroutineScope6, (TransfersPresenter) this.this$0, (MutableState) this.$chatSessionState$delegate, (MutableState) this.$chatKickoffParams$delegate, (MutableState) obj6);
                    this.L$0 = null;
                    this.label = 1;
                    if (flow6.collect(instrumentSelectionPresenter$models$2$1$1, this) == coroutineSingletons8) {
                        return coroutineSingletons8;
                    }
                } else {
                    if (i12 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 8:
                CoroutineScope coroutineScope7 = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons9 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i13 = this.label;
                if (i13 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow7 = (Flow) this.L$1;
                    NearbyPayRequestPresenter$models$10$1$1$1 nearbyPayRequestPresenter$models$10$1$1$12 = new NearbyPayRequestPresenter$models$10$1$1$1(11, (MutableState) this.$chatSessionState$delegate, (MutableState) obj6, (MutableState) this.$chatKickoffParams$delegate, (PoolsListPresenter) this.this$0, coroutineScope7);
                    this.L$0 = null;
                    this.label = 1;
                    if (flow7.collect(nearbyPayRequestPresenter$models$10$1$1$12, this) == coroutineSingletons9) {
                        return coroutineSingletons9;
                    }
                } else {
                    if (i13 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 9:
                Reward$Adapter reward$Adapter = (Reward$Adapter) obj6;
                StateFlowImpl stateFlowImpl = (StateFlowImpl) reward$Adapter.boost_detail_rowsAdapter;
                FlowCollector flowCollector2 = (FlowCollector) this.this$0;
                CoroutineSingletons coroutineSingletons10 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i14 = this.label;
                if (i14 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    getHistoricalExchangeDataRequest = new GetHistoricalExchangeDataRequest((HistoricalRange) this.$chatSessionState$delegate, ((CurrencyCode) this.$chatKickoffParams$delegate).name());
                } else {
                    if (i14 == 1) {
                        FlowCollector flowCollector3 = (FlowCollector) this.L$1;
                        GetHistoricalExchangeDataRequest getHistoricalExchangeDataRequest3 = (GetHistoricalExchangeDataRequest) this.L$0;
                        SafeTrace.throwOnFailure(obj);
                        getHistoricalExchangeDataRequest2 = getHistoricalExchangeDataRequest3;
                        flowCollector = flowCollector3;
                        obj2 = obj;
                        apiResult = (ApiResult) obj2;
                        z = apiResult instanceof ApiResult.Success;
                        if (z) {
                            stateFlowImpl.getClass();
                            stateFlowImpl.updateState(null, NetworkStatus.Available.INSTANCE);
                        }
                        if (apiResult instanceof ApiResult.Failure) {
                            NetworkStatus networkStatus = (NetworkStatus) stateFlowImpl.getValue();
                            NetworkStatus.Unavailable unavailable = (networkStatus instanceof NetworkStatus.Unavailable ? (NetworkStatus.Unavailable) networkStatus : null) != null ? new NetworkStatus.Unavailable(((NetworkStatus.Unavailable) networkStatus).sinceMillis) : new NetworkStatus.Unavailable(((AndroidClock) reward$Adapter.boost_detail_bottom_upsellAdapter).millis());
                            stateFlowImpl.getClass();
                            stateFlowImpl.updateState(null, unavailable);
                        }
                        obj3 = !z ? ((ApiResult.Success) apiResult).response : null;
                        this.this$0 = flowCollector2;
                        this.L$0 = getHistoricalExchangeDataRequest2;
                        this.L$1 = null;
                        this.label = 2;
                        if (flowCollector.emit(obj3, this) != coroutineSingletons10) {
                            getHistoricalExchangeDataRequest = getHistoricalExchangeDataRequest2;
                            long m4167getInWholeMillisecondsimpl = Duration.m4167getInWholeMillisecondsimpl(RealInvestmentEntitiesKt.INVESTING_LIVE_INTERVAL);
                            this.this$0 = flowCollector2;
                            this.L$0 = getHistoricalExchangeDataRequest;
                            this.label = 3;
                        }
                        return coroutineSingletons10;
                    }
                    if (i14 == 2) {
                        getHistoricalExchangeDataRequest = (GetHistoricalExchangeDataRequest) this.L$0;
                        SafeTrace.throwOnFailure(obj);
                        long m4167getInWholeMillisecondsimpl2 = Duration.m4167getInWholeMillisecondsimpl(RealInvestmentEntitiesKt.INVESTING_LIVE_INTERVAL);
                        this.this$0 = flowCollector2;
                        this.L$0 = getHistoricalExchangeDataRequest;
                        this.label = 3;
                        break;
                    } else {
                        if (i14 != 3) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        getHistoricalExchangeDataRequest = (GetHistoricalExchangeDataRequest) this.L$0;
                        SafeTrace.throwOnFailure(obj);
                    }
                }
                GetHistoricalExchangeDataRequest getHistoricalExchangeDataRequest4 = getHistoricalExchangeDataRequest;
                if (!JobKt.isActive(getContext())) {
                    return Unit.INSTANCE;
                }
                AppService appService = (AppService) reward$Adapter.avatarsAdapter;
                this.this$0 = flowCollector2;
                this.L$0 = getHistoricalExchangeDataRequest4;
                this.L$1 = flowCollector2;
                this.label = 1;
                obj2 = appService.getHistoricalExchangeData(getHistoricalExchangeDataRequest4, this);
                if (obj2 != coroutineSingletons10) {
                    getHistoricalExchangeDataRequest2 = getHistoricalExchangeDataRequest4;
                    flowCollector = flowCollector2;
                    apiResult = (ApiResult) obj2;
                    z = apiResult instanceof ApiResult.Success;
                    if (z) {
                    }
                    if (apiResult instanceof ApiResult.Failure) {
                    }
                    if (!z) {
                    }
                    this.this$0 = flowCollector2;
                    this.L$0 = getHistoricalExchangeDataRequest2;
                    this.L$1 = null;
                    this.label = 2;
                    if (flowCollector.emit(obj3, this) != coroutineSingletons10) {
                    }
                }
                return coroutineSingletons10;
            case 10:
                WithHoldings withHoldings = (WithHoldings) this.L$1;
                CoroutineSingletons coroutineSingletons11 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i15 = this.label;
                if (i15 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    TransferStockPresenter transferStockPresenter = (TransferStockPresenter) this.L$0;
                    BalanceSnapshot balanceSnapshot = (BalanceSnapshot) ((MutableState) this.$chatSessionState$delegate).getValue();
                    balanceSnapshot.getClass();
                    String str5 = balanceSnapshot.token;
                    String str6 = withHoldings.units;
                    str6.getClass();
                    TradeEvent$TransferAllShares tradeEvent$TransferAllShares = new TradeEvent$TransferAllShares(str6);
                    AmountSheetSavedState amountSheetSavedState = (AmountSheetSavedState) ((MutableState) this.$chatKickoffParams$delegate).getValue();
                    MoneyTabUIKt$$ExternalSyntheticLambda9 moneyTabUIKt$$ExternalSyntheticLambda9 = new MoneyTabUIKt$$ExternalSyntheticLambda9(i5, (MutableState) obj6);
                    TransferStockPresenter$models$3$1$2 transferStockPresenter$models$3$1$2 = new TransferStockPresenter$models$3$1$2((Channel) this.this$0, continuation, i4);
                    this.label = 1;
                    if (TransferStockPresenter.access$handleTradeEvent(transferStockPresenter, withHoldings, str5, tradeEvent$TransferAllShares, amountSheetSavedState, moneyTabUIKt$$ExternalSyntheticLambda9, transferStockPresenter$models$3$1$2, this) == coroutineSingletons11) {
                        return coroutineSingletons11;
                    }
                } else {
                    if (i15 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 11:
                CoroutineScope coroutineScope8 = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons12 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i16 = this.label;
                if (i16 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow8 = (Flow) this.L$1;
                    CardSchemePresenter$toHeroModule$3$1$1 cardSchemePresenter$toHeroModule$3$1$1 = new CardSchemePresenter$toHeroModule$3$1$1(coroutineScope8, (InvestingSearchPresenter) this.this$0, (MutableState) this.$chatSessionState$delegate, (MutableState) this.$chatKickoffParams$delegate, (ColorModel) obj6, 1);
                    this.L$0 = null;
                    this.label = 1;
                    if (flow8.collect(cardSchemePresenter$toHeroModule$3$1$1, this) == coroutineSingletons12) {
                        return coroutineSingletons12;
                    }
                } else {
                    if (i16 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 12:
                InvestingSearchPresenter investingSearchPresenter = (InvestingSearchPresenter) this.L$1;
                CoroutineScope coroutineScope9 = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons13 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i17 = this.label;
                if (i17 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    CategoryToken categoryToken = investingSearchPresenter.categoryToken;
                    RealCategoryBackend realCategoryBackend = investingSearchPresenter.categoryBackend;
                    int i18 = 20;
                    if (categoryToken == null) {
                        RewardSlotQueries rewardSlotQueries = realCategoryBackend.filterGroupQueries;
                        UiAlias.Type.Companion companion = SyncInvestmentCategory.CategoryType.Companion;
                        InstrumentCellKt$$ExternalSyntheticLambda11 instrumentCellKt$$ExternalSyntheticLambda11 = new InstrumentCellKt$$ExternalSyntheticLambda11(i3);
                        rewardSlotQueries.getClass();
                        formCashtag$8$invokeSuspend$$inlined$map$1 = DBUtil.mapToList(DBUtil.toFlow(new OffersSheetQueries$ForSheetKeyQuery(rewardSlotQueries, new MerchantBlockingViewKt$$ExternalSyntheticLambda15(i18, instrumentCellKt$$ExternalSyntheticLambda11, rewardSlotQueries))), realCategoryBackend.ioDispatcher);
                    } else {
                        formCashtag$8$invokeSuspend$$inlined$map$1 = new FormCashtag$8$invokeSuspend$$inlined$map$1(realCategoryBackend.categoryDetails(categoryToken), i18);
                    }
                    ChannelFlowTransformLatest transformLatest = FlowKt.transformLatest(formCashtag$8$invokeSuspend$$inlined$map$1, new CardSceneEffectKt$cardSettleFlow$$inlined$flatMapLatest$1((MutableState) this.$chatSessionState$delegate, (ColorModel) obj6, investingSearchPresenter, (Collection) this.this$0, null, coroutineScope9));
                    TabContentPresenter$models$4$1$1$1 tabContentPresenter$models$4$1$1$1 = new TabContentPresenter$models$4$1$1$1((MutableState) this.$chatKickoffParams$delegate, continuation, 13);
                    this.L$0 = null;
                    this.label = 1;
                    if (FlowKt.collectLatest(transformLatest, tabContentPresenter$models$4$1$1$1, this) == coroutineSingletons13) {
                        return coroutineSingletons13;
                    }
                } else {
                    if (i17 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 13:
                CoroutineScope coroutineScope10 = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons14 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i19 = this.label;
                if (i19 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow9 = (Flow) this.L$1;
                    NearbyPayRequestPresenter$models$10$1$1$1 nearbyPayRequestPresenter$models$10$1$1$13 = new NearbyPayRequestPresenter$models$10$1$1$1(coroutineScope10, (MoneybotHomePresenter) this.this$0, (InvestingState) this.$chatKickoffParams$delegate, (State) obj6, (MutableState) this.$chatSessionState$delegate, 18);
                    this.L$0 = null;
                    this.label = 1;
                    if (flow9.collect(nearbyPayRequestPresenter$models$10$1$1$13, this) == coroutineSingletons14) {
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
                CoroutineScope coroutineScope11 = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons15 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i20 = this.label;
                if (i20 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow10 = (Flow) this.L$1;
                    NearbyPayRequestPresenter$models$10$1$1$1 nearbyPayRequestPresenter$models$10$1$1$14 = new NearbyPayRequestPresenter$models$10$1$1$1(21, (MutableState) this.$chatSessionState$delegate, (MutableState) this.$chatKickoffParams$delegate, (State) obj6, (ShareSheetPresenter) this.this$0, coroutineScope11);
                    this.L$0 = null;
                    this.label = 1;
                    if (flow10.collect(nearbyPayRequestPresenter$models$10$1$1$14, this) == coroutineSingletons15) {
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
                    CashKgooseService cashKgooseService = ((MoneybotChatPresenter) this.this$0).kgooseService;
                    SubmitFeedbackRequest submitFeedbackRequest = new SubmitFeedbackRequest((String) this.L$0, (FeedbackType) this.L$1, (String) this.$chatSessionState$delegate, (String) this.$chatKickoffParams$delegate, (String) obj6, ByteString.EMPTY);
                    this.label = 1;
                    if (cashKgooseService.submitFeedback(submitFeedbackRequest, this) == coroutineSingletons16) {
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
                CoroutineScope coroutineScope12 = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons17 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i22 = this.label;
                if (i22 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow11 = (Flow) this.L$1;
                    NearbyPayRequestPresenter$models$10$1$1$1 nearbyPayRequestPresenter$models$10$1$1$15 = new NearbyPayRequestPresenter$models$10$1$1$1((Object) coroutineScope12, this.this$0, obj6, (MutableState) this.$chatSessionState$delegate, (MutableState) this.$chatKickoffParams$delegate, 22);
                    this.L$0 = null;
                    this.label = 1;
                    if (flow11.collect(nearbyPayRequestPresenter$models$10$1$1$15, this) == coroutineSingletons17) {
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
                ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState = (ParcelableSnapshotMutableIntState) this.this$0;
                LazyListState lazyListState = (LazyListState) this.L$1;
                MutableState mutableState2 = (MutableState) this.$chatSessionState$delegate;
                MoneybotChatViewModel.Content.Chat chat = (MoneybotChatViewModel.Content.Chat) this.L$0;
                CoroutineSingletons coroutineSingletons18 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i23 = this.label;
                if (i23 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (!chat.messages.isEmpty() && !((Boolean) mutableState2.getValue()).booleanValue()) {
                        SafeFlow snapshotFlow = Updater.snapshotFlow(new DatePickerKt$$ExternalSyntheticLambda24(lazyListState, 8));
                        SessionWorkerKt$runSession$snapshotMonitor$1 sessionWorkerKt$runSession$snapshotMonitor$1 = new SessionWorkerKt$runSession$snapshotMonitor$1(i4, continuation, 7);
                        this.label = 1;
                        break;
                    } else {
                        return Unit.INSTANCE;
                    }
                } else {
                    if (i23 != 1) {
                        if (i23 != 2) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                        ((MutableState) this.$chatKickoffParams$delegate).setValue(Boolean.valueOf(!lazyListState.getCanScrollForward()));
                        parcelableSnapshotMutableIntState.setIntValue(CardViewApi21Impl.latestUserMessageIndex(chat.messages));
                        if (CardViewApi21Impl.hasActiveResponseAfterLatestUserMessage(chat)) {
                            ((ParcelableSnapshotMutableIntState) obj6).setIntValue(parcelableSnapshotMutableIntState.getIntValue());
                        }
                        mutableState2.setValue(Boolean.TRUE);
                        return Unit.INSTANCE;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                MoneybotChatViewModel.Content.Chat.InitialScrollPosition initialScrollPosition = chat.initialScrollPosition;
                int i24 = initialScrollPosition.index;
                int i25 = initialScrollPosition.offset;
                this.label = 2;
                break;
            case 18:
                CoroutineScope coroutineScope13 = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons19 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i26 = this.label;
                if (i26 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow12 = (Flow) this.L$1;
                    CardSchemePresenter$toHeroModule$3$1$1 cardSchemePresenter$toHeroModule$3$1$12 = new CardSchemePresenter$toHeroModule$3$1$1(coroutineScope13, (MusicPresenter) this.this$0, (MutableStateFlow) obj6, (MutableState) this.$chatSessionState$delegate, (MutableState) this.$chatKickoffParams$delegate);
                    this.L$0 = null;
                    this.label = 1;
                    if (flow12.collect(cardSchemePresenter$toHeroModule$3$1$12, this) == coroutineSingletons19) {
                        return coroutineSingletons19;
                    }
                } else {
                    if (i26 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 19:
                AssetPublicSuffixList assetPublicSuffixList = (AssetPublicSuffixList) obj6;
                ProducerScope producerScope2 = (ProducerScope) this.$chatKickoffParams$delegate;
                CoroutineSingletons coroutineSingletons20 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i27 = this.label;
                if (i27 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    RealBadger2$setup$lambda$0$$inlined$mapNotNull$1 realBadger2$setup$lambda$0$$inlined$mapNotNull$1 = new RealBadger2$setup$lambda$0$$inlined$mapNotNull$1((StateFlow) assetPublicSuffixList.readCompleteLatch, 24);
                    this.$chatKickoffParams$delegate = producerScope2;
                    this.label = 1;
                    first = FlowKt.first(realBadger2$setup$lambda$0$$inlined$mapNotNull$1, this);
                    break;
                } else if (i27 == 1) {
                    SafeTrace.throwOnFailure(obj);
                    first = obj;
                } else if (i27 == 2) {
                    GetPaymentUpdatesBySessionRequest getPaymentUpdatesBySessionRequest2 = (GetPaymentUpdatesBySessionRequest) this.$chatSessionState$delegate;
                    o0Var = (o0) this.this$0;
                    map2 = (Map) this.L$1;
                    SafeTrace.throwOnFailure(obj);
                    obj5 = ((Result) obj).value;
                    getPaymentUpdatesBySessionRequest = getPaymentUpdatesBySessionRequest2;
                    Object obj7 = getPaymentUpdatesBySessionRequest;
                    if (Result.m4120exceptionOrNullimpl(obj5) == null) {
                        obj7 = obj5;
                    }
                    this.$chatKickoffParams$delegate = producerScope2;
                    this.L$1 = map2;
                    this.this$0 = null;
                    this.$chatSessionState$delegate = null;
                    this.label = 3;
                    obj4 = o0Var.executeIn(producerScope2, (GetPaymentUpdatesBySessionRequest) obj7, this);
                    break;
                } else if (i27 == 3) {
                    Map map3 = (Map) this.L$1;
                    SafeTrace.throwOnFailure(obj);
                    map2 = map3;
                    obj4 = obj;
                    Flow flowOn = FlowKt.flowOn(FlowKt.receiveAsFlow((ReceiveChannel) obj4), (CoroutineContext) assetPublicSuffixList.bytes);
                    RealActivitiesManager$activities$2$1$2 realActivitiesManager$activities$2$1$2 = new RealActivitiesManager$activities$2$1$2(producerScope2, 6);
                    this.$chatKickoffParams$delegate = producerScope2;
                    this.L$1 = map2;
                    this.this$0 = null;
                    this.$chatSessionState$delegate = null;
                    this.label = 4;
                    break;
                } else {
                    if (i27 != 4) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    map = (Map) this.L$1;
                    SafeTrace.throwOnFailure(obj);
                    map2 = map;
                    o0Var = zzmn.asGrpcServerStreamingCall(new RealGrpcStreamingCall((WireGrpcClient) ((GrpcP2pRealTimeServiceClient) ((DoubleCheck) assetPublicSuffixList.listRead).getValue()).client, new GrpcMethod("/squareup.cash.fiatly.api.v2beta.P2pRealTimeService/GetPaymentUpdatesBySession", GetPaymentUpdatesBySessionRequest.ADAPTER, GetPaymentUpdatesBySessionResponse.ADAPTER)));
                    map2.getClass();
                    ((RealGrpcStreamingCall) o0Var.a).requestMetadata = map2;
                    GetPaymentUpdatesBySessionRequest getPaymentUpdatesBySessionRequest3 = new GetPaymentUpdatesBySessionRequest((String) this.L$0, EmptyList.INSTANCE, null, ByteString.EMPTY);
                    RealMessageSigner realMessageSigner = (RealMessageSigner) assetPublicSuffixList.exceptionBytes;
                    AttestedKeyService attestedKeyService = (AttestedKeyService) ((Lazy) assetPublicSuffixList.path).getValue();
                    this.$chatKickoffParams$delegate = producerScope2;
                    this.L$1 = map2;
                    this.this$0 = o0Var;
                    this.$chatSessionState$delegate = getPaymentUpdatesBySessionRequest3;
                    this.label = 2;
                    obj5 = realMessageSigner.m3594signyxL6bBk(getPaymentUpdatesBySessionRequest3, attestedKeyService, true, (r10 & 8) != 0, this);
                    getPaymentUpdatesBySessionRequest = getPaymentUpdatesBySessionRequest3;
                    break;
                }
                map = (Map) first;
                map2 = map;
                o0Var = zzmn.asGrpcServerStreamingCall(new RealGrpcStreamingCall((WireGrpcClient) ((GrpcP2pRealTimeServiceClient) ((DoubleCheck) assetPublicSuffixList.listRead).getValue()).client, new GrpcMethod("/squareup.cash.fiatly.api.v2beta.P2pRealTimeService/GetPaymentUpdatesBySession", GetPaymentUpdatesBySessionRequest.ADAPTER, GetPaymentUpdatesBySessionResponse.ADAPTER)));
                map2.getClass();
                ((RealGrpcStreamingCall) o0Var.a).requestMetadata = map2;
                GetPaymentUpdatesBySessionRequest getPaymentUpdatesBySessionRequest32 = new GetPaymentUpdatesBySessionRequest((String) this.L$0, EmptyList.INSTANCE, null, ByteString.EMPTY);
                RealMessageSigner realMessageSigner2 = (RealMessageSigner) assetPublicSuffixList.exceptionBytes;
                AttestedKeyService attestedKeyService2 = (AttestedKeyService) ((Lazy) assetPublicSuffixList.path).getValue();
                this.$chatKickoffParams$delegate = producerScope2;
                this.L$1 = map2;
                this.this$0 = o0Var;
                this.$chatSessionState$delegate = getPaymentUpdatesBySessionRequest32;
                this.label = 2;
                obj5 = realMessageSigner2.m3594signyxL6bBk(getPaymentUpdatesBySessionRequest32, attestedKeyService2, true, (r10 & 8) != 0, this);
                getPaymentUpdatesBySessionRequest = getPaymentUpdatesBySessionRequest32;
            case 20:
                CoroutineScope coroutineScope14 = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons21 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i28 = this.label;
                if (i28 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow13 = (Flow) this.L$1;
                    NearbyPayRequestPresenter$models$10$1$1$1 nearbyPayRequestPresenter$models$10$1$1$16 = new NearbyPayRequestPresenter$models$10$1$1$1(24, (MutableState) this.$chatSessionState$delegate, (MutableState) obj6, (MutableState) this.$chatKickoffParams$delegate, (OffersDetailsPresenter) this.this$0, coroutineScope14);
                    this.L$0 = null;
                    this.label = 1;
                    if (flow13.collect(nearbyPayRequestPresenter$models$10$1$1$16, this) == coroutineSingletons21) {
                        return coroutineSingletons21;
                    }
                } else {
                    if (i28 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 21:
                BaseAllowlistSelectionPresenter baseAllowlistSelectionPresenter = (BaseAllowlistSelectionPresenter) this.L$1;
                MutableState mutableState3 = (MutableState) obj6;
                CoroutineSingletons coroutineSingletons22 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i29 = this.label;
                if (i29 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    SearchState searchState2 = (SearchState) mutableState3.getValue();
                    mutableState3.setValue(SearchState.copy$default((SearchState) mutableState3.getValue(), null, true, 5));
                    try {
                        String obj8 = ((InputFieldText) ((MutableState) this.this$0).getValue()).getValue().toString();
                        String str7 = baseAllowlistSelectionPresenter.forCustomerToken;
                        this.L$0 = searchState2;
                        this.$chatSessionState$delegate = mutableState3;
                        this.$chatKickoffParams$delegate = mutableState3;
                        this.label = 1;
                        performSearch = baseAllowlistSelectionPresenter.performSearch(obj8, str7, this);
                        if (performSearch == coroutineSingletons22) {
                            return coroutineSingletons22;
                        }
                        searchState = searchState2;
                        mutableState = mutableState3;
                    } catch (Exception unused) {
                        searchState = searchState2;
                        copy$default = SearchState.copy$default(searchState, null, false, 5);
                        mutableState3.setValue(copy$default);
                        return Unit.INSTANCE;
                    }
                } else {
                    if (i29 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    mutableState3 = (MutableState) this.$chatKickoffParams$delegate;
                    MutableState mutableState4 = (MutableState) this.$chatSessionState$delegate;
                    searchState = (SearchState) this.L$0;
                    try {
                        SafeTrace.throwOnFailure(obj);
                        mutableState = mutableState4;
                        performSearch = obj;
                    } catch (Exception unused2) {
                        mutableState3 = mutableState4;
                        copy$default = SearchState.copy$default(searchState, null, false, 5);
                        mutableState3.setValue(copy$default);
                        return Unit.INSTANCE;
                    }
                }
                try {
                    copy$default = (SearchState) performSearch;
                } catch (Exception unused3) {
                    mutableState3 = mutableState;
                    copy$default = SearchState.copy$default(searchState, null, false, 5);
                    mutableState3.setValue(copy$default);
                    return Unit.INSTANCE;
                }
                mutableState3.setValue(copy$default);
                return Unit.INSTANCE;
            case 22:
                MutableState mutableState5 = (MutableState) this.$chatSessionState$delegate;
                BaseAllowlistSelectionPresenter baseAllowlistSelectionPresenter2 = (BaseAllowlistSelectionPresenter) this.L$0;
                String str8 = baseAllowlistSelectionPresenter2.firstName;
                AndroidStringManager androidStringManager = baseAllowlistSelectionPresenter2.stringManager;
                LinkedHashSet linkedHashSet = baseAllowlistSelectionPresenter2.syncedCustomers;
                CoroutineSingletons coroutineSingletons23 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i30 = this.label;
                try {
                    if (i30 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        P2PListRowTapButtonEvent p2PListRowTapButtonEvent = ((AllowlistSelectionViewEvent.TapCustomerButton) ((AllowlistSelectionViewEvent) this.L$1)).tapButtonEvent;
                        this.label = 1;
                        handleRowTap = baseAllowlistSelectionPresenter2.handleRowTap(p2PListRowTapButtonEvent, mutableState5, this);
                        if (handleRowTap == coroutineSingletons23) {
                            return coroutineSingletons23;
                        }
                    } else {
                        if (i30 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                        handleRowTap = obj;
                    }
                    BaseAllowlistSelectionPresenter.RowTapResult rowTapResult = (BaseAllowlistSelectionPresenter.RowTapResult) handleRowTap;
                    if (rowTapResult instanceof BaseAllowlistSelectionPresenter.RowTapResult.Success) {
                        if (((BaseAllowlistSelectionPresenter.RowTapResult.Success) rowTapResult).requiresUpdateSearchResults) {
                            MutableState mutableState6 = (MutableState) this.$chatKickoffParams$delegate;
                            mutableState6.setValue(BaseAllowlistSelectionPresenter.updateSearchResults(((BaseAllowlistSelectionPresenter.RowTapResult.Success) rowTapResult).customerToken, ((BaseAllowlistSelectionPresenter.RowTapResult.Success) rowTapResult).toAdd, (SearchState) mutableState6.getValue()));
                        }
                        linkedHashSet.clear();
                        linkedHashSet.addAll(((BaseAllowlistSelectionPresenter.RowTapResult.Success) rowTapResult).updatedSyncedCustomers);
                        ((ParcelableSnapshotMutableIntState) this.this$0).setIntValue(linkedHashSet.size());
                        ((ParcelableSnapshotMutableIntState) obj6).setIntValue(baseAllowlistSelectionPresenter2.pendingChanges.size());
                    }
                } catch (BaseAllowlistSelectionPresenter.ExceededAllowlistLimitException e) {
                    String str9 = str8 == null ? "" : str8;
                    Resources resources = androidStringManager.resources;
                    resources.getClass();
                    String format2 = new MessageFormat(resources.getString(R.string.allow_list_exceeded_limit_dialog_title)).format(new Object[]{str9});
                    format2.getClass();
                    Integer num = new Integer(e.limit);
                    if (str8 == null) {
                        str8 = "";
                    }
                    Object[] objArr = {num, str8};
                    Resources resources2 = androidStringManager.resources;
                    resources2.getClass();
                    String format3 = new MessageFormat(resources2.getString(R.string.allow_list_exceeded_limit_dialog_body)).format(objArr);
                    format3.getClass();
                    mutableState5.setValue(new P2PFailureDialogModel(format2, format3, androidStringManager.get(R.string.allow_list_exceeded_limit_dialog_button)));
                }
                return Unit.INSTANCE;
            case 23:
                CoroutineScope coroutineScope15 = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons24 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i31 = this.label;
                if (i31 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow14 = (Flow) this.L$1;
                    CardSchemePresenter$toHeroModule$3$1$1 cardSchemePresenter$toHeroModule$3$1$13 = new CardSchemePresenter$toHeroModule$3$1$1(coroutineScope15, (LocalHomePresenter) this.this$0, (Ref$ObjectRef) this.$chatSessionState$delegate, (State) this.$chatKickoffParams$delegate, (State) obj6);
                    this.L$0 = null;
                    this.label = 1;
                    if (flow14.collect(cardSchemePresenter$toHeroModule$3$1$13, this) == coroutineSingletons24) {
                        return coroutineSingletons24;
                    }
                } else {
                    if (i31 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 24:
                CoroutineScope coroutineScope16 = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons25 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i32 = this.label;
                if (i32 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow15 = (Flow) this.L$1;
                    CardSchemePresenter$toHeroModule$3$1$1 cardSchemePresenter$toHeroModule$3$1$14 = new CardSchemePresenter$toHeroModule$3$1$1(coroutineScope16, (CardLockPresenter) this.this$0, (MutableState) this.$chatSessionState$delegate, (MutableState) this.$chatKickoffParams$delegate, (MutableState) obj6, 7);
                    this.L$0 = null;
                    this.label = 1;
                    if (flow15.collect(cardSchemePresenter$toHeroModule$3$1$14, this) == coroutineSingletons25) {
                        return coroutineSingletons25;
                    }
                } else {
                    if (i32 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 25:
                return invokeSuspend$com$squareup$cash$payments$presenters$NearbyPayRequestPresenter$models$10$1$1(obj);
            case 26:
                return invokeSuspend$com$squareup$cash$payments$presenters$PaymentConfigurationPresenter$models$28$13(obj);
            case 27:
                CoroutineScope coroutineScope17 = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons26 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i33 = this.label;
                if (i33 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow16 = (Flow) this.L$1;
                    CardSchemePresenter$toHeroModule$3$1$1 cardSchemePresenter$toHeroModule$3$1$15 = new CardSchemePresenter$toHeroModule$3$1$1(coroutineScope17, (QuickPayPresenter) this.this$0, (MutableState) this.$chatSessionState$delegate, (MutableState) this.$chatKickoffParams$delegate, (MutableState) obj6, 9);
                    this.L$0 = null;
                    this.label = 1;
                    if (flow16.collect(cardSchemePresenter$toHeroModule$3$1$15, this) == coroutineSingletons26) {
                        return coroutineSingletons26;
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
                return invokeSuspend$com$squareup$cash$payments$views$personalization$TransformableKt$transformable$3$1$1(obj);
            default:
                CoroutineScope coroutineScope18 = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons27 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i34 = this.label;
                if (i34 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow17 = (Flow) this.L$1;
                    CardSchemePresenter$toHeroModule$3$1$1 cardSchemePresenter$toHeroModule$3$1$16 = new CardSchemePresenter$toHeroModule$3$1$1(coroutineScope18, (WirelessProviderListPresenter) this.this$0, (MutableState) this.$chatSessionState$delegate, (MutableState) this.$chatKickoffParams$delegate, (MutableState) obj6, 10);
                    this.L$0 = null;
                    this.label = 1;
                    if (flow17.collect(cardSchemePresenter$toHeroModule$3$1$16, this) == coroutineSingletons27) {
                        return coroutineSingletons27;
                    }
                } else {
                    if (i34 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MoneybotChatPresenter$models$6$1(RealGlobalSearchRepository realGlobalSearchRepository, String str, String str2, String str3, SearchRequest.Origin origin, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = 2;
        this.this$0 = realGlobalSearchRepository;
        this.L$0 = str;
        this.$chatSessionState$delegate = str2;
        this.$chatKickoffParams$delegate = str3;
        this.$currentSuggestionsId$delegate = origin;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MoneybotChatPresenter$models$6$1(InvestingSearchPresenter investingSearchPresenter, Collection collection, ColorModel colorModel, MutableState mutableState, MutableState mutableState2, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = 12;
        this.L$1 = investingSearchPresenter;
        this.this$0 = collection;
        this.$currentSuggestionsId$delegate = colorModel;
        this.$chatSessionState$delegate = mutableState;
        this.$chatKickoffParams$delegate = mutableState2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MoneybotChatPresenter$models$6$1(MoneybotChatPresenter moneybotChatPresenter, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = 0;
        this.this$0 = moneybotChatPresenter;
        this.$chatSessionState$delegate = mutableState;
        this.$chatKickoffParams$delegate = mutableState2;
        this.$currentSuggestionsId$delegate = mutableState3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MoneybotChatPresenter$models$6$1(MoneybotChatPresenter moneybotChatPresenter, String str, FeedbackType feedbackType, String str2, String str3, String str4, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = 15;
        this.this$0 = moneybotChatPresenter;
        this.L$0 = str;
        this.L$1 = feedbackType;
        this.$chatSessionState$delegate = str2;
        this.$chatKickoffParams$delegate = str3;
        this.$currentSuggestionsId$delegate = str4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MoneybotChatPresenter$models$6$1(BaseAllowlistSelectionPresenter baseAllowlistSelectionPresenter, MutableState mutableState, MutableState mutableState2, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = 21;
        this.L$1 = baseAllowlistSelectionPresenter;
        this.$currentSuggestionsId$delegate = mutableState;
        this.this$0 = mutableState2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MoneybotChatPresenter$models$6$1(PaymentConfigurationPresenter paymentConfigurationPresenter, MutableState mutableState, MutableState mutableState2, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = 26;
        this.this$0 = paymentConfigurationPresenter;
        this.$chatKickoffParams$delegate = mutableState;
        this.$currentSuggestionsId$delegate = mutableState2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MoneybotChatPresenter$models$6$1(CardLockPresenter cardLockPresenter, String str, SnapshotStateList snapshotStateList, ParcelableSnapshotMutableLongState parcelableSnapshotMutableLongState, MutableState mutableState, MutableState mutableState2, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = 25;
        this.L$1 = cardLockPresenter;
        this.L$0 = str;
        this.this$0 = snapshotStateList;
        this.$currentSuggestionsId$delegate = parcelableSnapshotMutableLongState;
        this.$chatSessionState$delegate = mutableState;
        this.$chatKickoffParams$delegate = mutableState2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MoneybotChatPresenter$models$6$1(Object obj, Object obj2, MutableState mutableState, MutableState mutableState2, ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState, ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState2, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.L$0 = obj;
        this.L$1 = obj2;
        this.$chatSessionState$delegate = mutableState;
        this.$chatKickoffParams$delegate = mutableState2;
        this.this$0 = parcelableSnapshotMutableIntState;
        this.$currentSuggestionsId$delegate = parcelableSnapshotMutableIntState2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MoneybotChatPresenter$models$6$1(Object obj, Object obj2, Object obj3, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$chatSessionState$delegate = obj;
        this.$chatKickoffParams$delegate = obj2;
        this.$currentSuggestionsId$delegate = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MoneybotChatPresenter$models$6$1(Flow flow, Continuation continuation, MutableState mutableState, ArcadeFormTextInputGroupView arcadeFormTextInputGroupView, FocusRequester focusRequester, DelegatingSoftwareKeyboardController delegatingSoftwareKeyboardController) {
        super(2, continuation);
        this.$r8$classId = 1;
        this.L$1 = flow;
        this.$chatSessionState$delegate = mutableState;
        this.this$0 = arcadeFormTextInputGroupView;
        this.$chatKickoffParams$delegate = focusRequester;
        this.$currentSuggestionsId$delegate = delegatingSoftwareKeyboardController;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MoneybotChatPresenter$models$6$1(Flow flow, Continuation continuation, MoleculePresenter moleculePresenter, Object obj, State state, Object obj2, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.L$1 = flow;
        this.this$0 = moleculePresenter;
        this.$chatSessionState$delegate = obj;
        this.$chatKickoffParams$delegate = state;
        this.$currentSuggestionsId$delegate = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MoneybotChatPresenter$models$6$1(Flow flow, Continuation continuation, ShareSheetPresenter shareSheetPresenter, MutableState mutableState, State state, MutableState mutableState2) {
        super(2, continuation);
        this.$r8$classId = 14;
        this.L$1 = flow;
        this.this$0 = shareSheetPresenter;
        this.$chatSessionState$delegate = mutableState;
        this.$currentSuggestionsId$delegate = state;
        this.$chatKickoffParams$delegate = mutableState2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MoneybotChatPresenter$models$6$1(Flow flow, Continuation continuation, Object obj, Object obj2, MutableState mutableState, MutableState mutableState2, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.L$1 = flow;
        this.this$0 = obj;
        this.$currentSuggestionsId$delegate = obj2;
        this.$chatSessionState$delegate = mutableState;
        this.$chatKickoffParams$delegate = mutableState2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MoneybotChatPresenter$models$6$1(Flow flow, Continuation continuation, Object obj, Object obj2, Object obj3, MutableState mutableState, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.L$1 = flow;
        this.this$0 = obj;
        this.$chatKickoffParams$delegate = obj2;
        this.$currentSuggestionsId$delegate = obj3;
        this.$chatSessionState$delegate = mutableState;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MoneybotChatPresenter$models$6$1(AssetPublicSuffixList assetPublicSuffixList, String str, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = 19;
        this.$currentSuggestionsId$delegate = assetPublicSuffixList;
        this.L$0 = str;
    }
}
