package com.squareup.cash.maps.presenter;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.ProduceStateScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.draw.RotateKt;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.coroutines.FlowUtil$createFlow$$inlined$map$1;
import androidx.room.util.DBUtil;
import app.cash.api.ApiResult;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import app.cash.local.presenters.LocalCashBalancePresenter;
import app.cash.local.presenters.LocalEditorialPresenter;
import app.cash.local.presenters.RealBrandFollowPresenter$models$2$1$1;
import app.cash.local.viewmodels.MenuItemAvailability;
import app.cash.local.viewmodels.OrderBuilderModel;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.request.OneShotDisposable;
import com.fillr.featuretoggle.UnleashContext;
import com.google.android.gms.internal.mlkit_vision_barcode.zzuh;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.maps.android.compose.CameraPositionState;
import com.squareup.cash.boost.backend.RealBoostProvider;
import com.squareup.cash.boost.backend.RealBoostRepository;
import com.squareup.cash.card.onboarding.DisclosurePresenter;
import com.squareup.cash.checks.VerifyCheckDialogPresenter;
import com.squareup.cash.collapsingtoolbar.views.CollapsingToolbarScaffoldState;
import com.squareup.cash.collapsingtoolbar.views.CollapsingToolbarState;
import com.squareup.cash.common.viewmodels.ColorModel;
import com.squareup.cash.data.transfers.RealTransferManager$addCash$$inlined$map$1;
import com.squareup.cash.genericelements.backend.GenericTreeElementsData;
import com.squareup.cash.genericelements.backend.RealGenericTreeElementsRepo;
import com.squareup.cash.genericelements.presenters.api.GenericTreeElementsRefreshTrigger$BoostContentUpdateTrigger;
import com.squareup.cash.genericelements.viewmodels.GenericTreeElementsViewModel;
import com.squareup.cash.invitations.InviteContactsPresenter$filterContacts$$inlined$map$1;
import com.squareup.cash.invitations.InviteErrorDialogKt;
import com.squareup.cash.invitations.InviteErrorPresenter;
import com.squareup.cash.keystore.RealKeyStoreProvider$setEntry$2;
import com.squareup.cash.limits.backend.api.CustomerLimitsModel;
import com.squareup.cash.limits.backend.real.RealLimitsStore;
import com.squareup.cash.limits.viewmodels.LimitItem;
import com.squareup.cash.limits.viewmodels.LimitItemViewModel;
import com.squareup.cash.limits.viewmodels.LimitUsageViewModel;
import com.squareup.cash.limits.viewmodels.LimitViewModel;
import com.squareup.cash.limits.viewmodels.LimitViewModelKt$WhenMappings;
import com.squareup.cash.limits.viewmodels.LimitViewModelKt$toFlatLimits$1$limitItems$1$1;
import com.squareup.cash.limits.viewmodels.LimitsCategoryViewModel$LimitsCategory;
import com.squareup.cash.limits.viewmodels.LimitsParsingErrorFactory;
import com.squareup.cash.limits.viewmodels.LimitsProtoParsingError;
import com.squareup.cash.limits.viewmodels.LimitsSectionType;
import com.squareup.cash.limits.viewmodels.LimitsType;
import com.squareup.cash.limits.viewmodels.ProgressViewModel;
import com.squareup.cash.maps.engine.googlemaps.GoogleMapEngine$Map$2$1$$ExternalSyntheticLambda0;
import com.squareup.cash.maps.viewmodels.CashMapViewEvent;
import com.squareup.cash.maps.viewmodels.CashMapViewModel;
import com.squareup.cash.maps.viewmodels.LocationViewModel;
import com.squareup.cash.maps.viewmodels.MapBoundary;
import com.squareup.cash.merchant.presenters.MerchantProfilePresenter$models$4$1$1;
import com.squareup.cash.merchant.presenters.SquareLoyaltyDetailsPresenter$State;
import com.squareup.cash.merchant.presenters.SquareLoyaltySheetPresenter$State;
import com.squareup.cash.merchant.screens.SquareLoyaltyDetailsScreen;
import com.squareup.cash.merchant.screens.SquareLoyaltySheetScreen;
import com.squareup.cash.moneybot.backend.RealMoneybotChatMessagesCache;
import com.squareup.cash.moneybot.backend.RealUserSessionPager;
import com.squareup.cash.moneybot.backend.api.GeneralMoneybotError;
import com.squareup.cash.moneybot.backend.api.managers.ChatManager;
import com.squareup.cash.moneybot.backend.api.managers.ChatSession;
import com.squareup.cash.moneybot.backend.api.model.chat.ChatKickoffParams;
import com.squareup.cash.moneybot.backend.api.model.chat.Message;
import com.squareup.cash.moneybot.backend.real.managers.RealChatManager;
import com.squareup.cash.moneybot.backend.real.managers.RealChatSessionManager;
import com.squareup.cash.moneybot.backend.real.managers.RealMoneybotPromptManager;
import com.squareup.cash.moneybot.genie.GenieViewKt$GenieView$1$1;
import com.squareup.cash.moneybot.presenters.MoneybotChatPresenter;
import com.squareup.cash.moneybot.presenters.MoneybotChatPresenter$models$chatSessionState$2$1$3;
import com.squareup.cash.moneybot.presenters.MoneybotHomePresenter;
import com.squareup.cash.moneybot.presenters.MoneybotOverflowMenuPresenter$loadNextPage$1$1;
import com.squareup.cash.moneybot.screens.MoneybotFeedbackAnswer;
import com.squareup.cash.moneybot.viewmodels.RecentChatHistoryViewModel$Loaded;
import com.squareup.cash.moneybot.viewmodels.chat.MessageViewModel;
import com.squareup.cash.music.presenters.MusicPresenter;
import com.squareup.cash.music.presenters.MusicPresenter$models$1$1;
import com.squareup.cash.music.presenters.MusicPresenter$models$2$1;
import com.squareup.cash.observability.protovalidation.ProtoParsingError;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.cash.observability.types.SampleStrategy;
import com.squareup.cash.offers.presenters.OffersDetailsPresenterV2$models$1$1$1;
import com.squareup.cash.offers.presenters.OffersFilterGroupSheetPresenter$models$sheet$2$1$1;
import com.squareup.cash.sharesheet.RealShareTargetsManager$shareTo$$inlined$flatMapLatest$1;
import com.squareup.cash.sharesheet.ShareSheetPresenter;
import com.squareup.cash.util.money.Moneys;
import com.squareup.cash.wallet.presenters.CardLockPresenter;
import com.squareup.cash.work.presenters.WorkHomePresenter;
import com.squareup.preferences.values.RecentMoneybotSession;
import com.squareup.protos.cash.cashlimitsxp.api.v1.GetCustomerLimitsRequest;
import com.squareup.protos.cash.cashlimitsxp.api.v1.GetCustomerLimitsResponse;
import com.squareup.protos.cash.cashlimitsxp.api.v1.GetCustomerLimitsResponse$FlatLimits$LimitUsage$LimitValue$CountLimit;
import com.squareup.protos.cash.cashlimitsxp.api.v1.GetCustomerLimitsResponse$FlatLimits$LimitUsage$LimitValue$MoneyLimit;
import com.squareup.protos.cash.cashlimitsxp.api.v1.GetCustomerLimitsResponse$Limits$FlatLimits;
import com.squareup.protos.cash.cashlimitsxp.api.v1.GetCustomerLimitsResponse$Limits$GroupedLimits;
import com.squareup.protos.cash.cashlimitsxp.api.v1.GetCustomerLimitsResponse$LimitsSection$LimitsCategory$LimitUsage$LimitValue$CountLimit;
import com.squareup.protos.cash.cashlimitsxp.api.v1.GetCustomerLimitsResponse$LimitsSection$LimitsCategory$LimitUsage$LimitValue$MoneyLimit;
import com.squareup.protos.cash.cashlimitsxp.api.v1.LimitsHubService;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.common.LocalizationConfig;
import com.squareup.util.cash.ColorsKt;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.collections.SetsKt___SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.StandaloneCoroutine;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__LimitKt$drop$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapConcat$$inlined$map$1;
import kotlinx.coroutines.flow.StateFlow;
import okio.ByteString;
import papa.SafeTrace;
import squareup.cash.savings.action.SavingsAction;
import timber.log.Timber;

/* loaded from: classes6.dex */
public final class CashMapPresenter$models$3$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ Object $hasLocationPermission$delegate;
    public Object $locationViewModel$delegate;
    public final /* synthetic */ int $r8$classId;
    public int label;
    public Object this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CashMapPresenter$models$3$1(int i, MutableState mutableState, Object obj, Object obj2, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = obj;
        this.$hasLocationPermission$delegate = obj2;
        this.$locationViewModel$delegate = mutableState;
    }

    private final Object invokeSuspend$com$squareup$cash$moneybot$presenters$MoneybotChatHistoryPresenter$models$1$1(Object obj) {
        MutableState mutableState = (MutableState) this.$hasLocationPermission$delegate;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            mutableState.setValue(Boolean.FALSE);
            RealUserSessionPager realUserSessionPager = (RealUserSessionPager) ((LocalEditorialPresenter) this.this$0).service;
            this.$locationViewModel$delegate = mutableState;
            this.label = 1;
            realUserSessionPager.nextCursor = null;
            realUserSessionPager._sessions.setValue(null);
            realUserSessionPager.hasMoreSessions = true;
            obj = realUserSessionPager.fetchNextPage(this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            mutableState = (MutableState) this.$locationViewModel$delegate;
            SafeTrace.throwOnFailure(obj);
        }
        mutableState.setValue(Boolean.valueOf(!(obj instanceof ApiResult.Success)));
        return Unit.INSTANCE;
    }

    private final Object invokeSuspend$com$squareup$cash$moneybot$presenters$MoneybotChatPresenter$models$4$1(Object obj) {
        MutableState mutableState;
        Object obj2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            MutableState mutableState2 = (MutableState) this.$hasLocationPermission$delegate;
            RealMoneybotPromptManager realMoneybotPromptManager = ((MoneybotChatPresenter) this.this$0).moneybotPromptManager;
            this.$locationViewModel$delegate = mutableState2;
            this.label = 1;
            Object inChatPrompts = realMoneybotPromptManager.getInChatPrompts(this);
            if (inChatPrompts == coroutineSingletons) {
                return coroutineSingletons;
            }
            obj = inChatPrompts;
            mutableState = mutableState2;
        } else {
            if (i != 1) {
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            mutableState = (MutableState) this.$locationViewModel$delegate;
            SafeTrace.throwOnFailure(obj);
        }
        ApiResult apiResult = (ApiResult) obj;
        if (apiResult instanceof ApiResult.Success) {
            obj2 = (List) ((ApiResult.Success) apiResult).response;
        } else {
            if (!(apiResult instanceof ApiResult.Failure)) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
            Timber.Forest.w("Failed to load in-chat prompts: " + apiResult, new Object[0]);
            obj2 = EmptyList.INSTANCE;
        }
        mutableState.setValue(obj2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r7v3, types: [androidx.compose.runtime.ParcelableSnapshotMutableState] */
    private final Object invokeSuspend$com$squareup$cash$moneybot$presenters$MoneybotChatPresenter$models$8$1$1(Object obj) {
        Object obj2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            MoneybotChatPresenter moneybotChatPresenter = (MoneybotChatPresenter) this.this$0;
            ChatKickoffParams chatKickoffParams = (ChatKickoffParams) this.$hasLocationPermission$delegate;
            RealChatSessionManager realChatSessionManager = (RealChatSessionManager) ((MutableState) this.$locationViewModel$delegate).getValue();
            this.label = 1;
            if (chatKickoffParams.sessionId != null) {
                obj2 = Unit.INSTANCE;
            } else if (chatKickoffParams.autoSend) {
                List resolveAllMessages = SavingsAction.Action.resolveAllMessages(moneybotChatPresenter, chatKickoffParams, moneybotChatPresenter.pluginRegistry.plugins.keySet());
                if (!resolveAllMessages.isEmpty()) {
                    moneybotChatPresenter.setStreamingKickoffTexts(SetsKt___SetsKt.plus(moneybotChatPresenter.getStreamingKickoffTexts(), (Iterable) MoneybotChatPresenter.kickoffStreamingTexts(resolveAllMessages)));
                    obj2 = moneybotChatPresenter.sendMessages(realChatSessionManager, resolveAllMessages, this);
                    if (obj2 != coroutineSingletons) {
                        obj2 = Unit.INSTANCE;
                    }
                }
                obj2 = Unit.INSTANCE;
            } else {
                ?? resolveAllMessages2 = SavingsAction.Action.resolveAllMessages(moneybotChatPresenter, chatKickoffParams, EmptySet.INSTANCE);
                if (resolveAllMessages2.isEmpty()) {
                    obj2 = Unit.INSTANCE;
                } else {
                    Iterable iterable = (Iterable) resolveAllMessages2;
                    if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                        Iterator it = iterable.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            Message message = (Message) it.next();
                            if (message instanceof Message.TextMessage) {
                                Message.TextMessage textMessage = (Message.TextMessage) message;
                                if (textMessage.role == Message.Role.ROLE_USER && !textMessage.hiddenByServer) {
                                    moneybotChatPresenter.errorReporter.report(new GeneralMoneybotError("Unsupported ClientKickoffParams: auto_send=false with visible user text message"), ErrorReporter.DefaultSamplingStrategy.INSTANCE);
                                    resolveAllMessages2 = new ArrayList();
                                    for (Object obj3 : iterable) {
                                        Message message2 = (Message) obj3;
                                        if (!message2.getHiddenByServer() && (!(message2 instanceof Message.TextMessage) || ((Message.TextMessage) message2).role != Message.Role.ROLE_USER)) {
                                            resolveAllMessages2.add(obj3);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    moneybotChatPresenter.setStreamingKickoffTexts(SetsKt___SetsKt.plus(moneybotChatPresenter.getStreamingKickoffTexts(), (Iterable) MoneybotChatPresenter.kickoffStreamingTexts(resolveAllMessages2)));
                    moneybotChatPresenter.heldKickoffMessages$delegate.setValue(resolveAllMessages2);
                    obj2 = Unit.INSTANCE;
                }
            }
            if (obj2 == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            SafeTrace.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }

    private final Object invokeSuspend$com$squareup$cash$moneybot$presenters$MoneybotChatPresenter$models$chatSessionState$2$1(Object obj) {
        MoneybotChatPresenter moneybotChatPresenter = (MoneybotChatPresenter) this.$hasLocationPermission$delegate;
        ProduceStateScope produceStateScope = (ProduceStateScope) this.this$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        Continuation continuation = null;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            RealChatSessionManager realChatSessionManager = (RealChatSessionManager) ((MutableState) this.$locationViewModel$delegate).getValue();
            realChatSessionManager.getClass();
            Flow distinctUntilChanged = FlowKt.distinctUntilChanged(new FlowKt__MergeKt$flatMapConcat$$inlined$map$1(new FlowUtil$createFlow$$inlined$map$1(ChatSession.NotInitialized.INSTANCE, FlowKt.channelFlow(new MusicPresenter$models$2$1(realChatSessionManager, continuation, 14)), new RealShareTargetsManager$shareTo$$inlined$flatMapLatest$1(moneybotChatPresenter, null)), new GenieViewKt$GenieView$1$1(moneybotChatPresenter, continuation, 17), 3));
            MoneybotChatPresenter$models$chatSessionState$2$1$3 moneybotChatPresenter$models$chatSessionState$2$1$3 = new MoneybotChatPresenter$models$chatSessionState$2$1$3(produceStateScope, moneybotChatPresenter, null);
            this.this$0 = null;
            this.label = 1;
            if (FlowKt.collectLatest(distinctUntilChanged, moneybotChatPresenter$models$chatSessionState$2$1$3, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            SafeTrace.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }

    private final Object invokeSuspend$com$squareup$cash$moneybot$presenters$MoneybotChatPresenter$processChatEvent$2$1(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            RealMoneybotPromptManager realMoneybotPromptManager = ((MoneybotChatPresenter) this.this$0).moneybotPromptManager;
            String str = (String) this.$locationViewModel$delegate;
            this.label = 1;
            obj = realMoneybotPromptManager.updateInChatPrompt(str, this);
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
        ApiResult apiResult = (ApiResult) obj;
        if (apiResult instanceof ApiResult.Success) {
            ((RealBrandFollowPresenter$models$2$1$1) this.$hasLocationPermission$delegate).invoke(((ApiResult.Success) apiResult).response);
        } else {
            if (!(apiResult instanceof ApiResult.Failure)) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
            Timber.Forest.w("Failed to update in-chat prompt: " + apiResult, new Object[0]);
        }
        return Unit.INSTANCE;
    }

    private final Object invokeSuspend$com$squareup$cash$moneybot$presenters$MoneybotDebugOverlayPresenter$models$$inlined$CollectEffect$1(Object obj) {
        CoroutineScope coroutineScope = (CoroutineScope) this.this$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            Flow flow = (Flow) this.$locationViewModel$delegate;
            OffersDetailsPresenterV2$models$1$1$1 offersDetailsPresenterV2$models$1$1$1 = new OffersDetailsPresenterV2$models$1$1$1(coroutineScope, (DisclosurePresenter) this.$hasLocationPermission$delegate, 20);
            this.this$0 = null;
            this.label = 1;
            if (flow.collect(offersDetailsPresenterV2$models$1$1$1, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            SafeTrace.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }

    private final Object invokeSuspend$com$squareup$cash$moneybot$presenters$MoneybotHomePresenter$processEvent$5(Object obj) {
        CoroutineScope coroutineScope = (CoroutineScope) this.this$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            MoneybotHomePresenter moneybotHomePresenter = (MoneybotHomePresenter) this.$locationViewModel$delegate;
            String str = (String) this.$hasLocationPermission$delegate;
            this.this$0 = null;
            this.label = 1;
            if (MoneybotHomePresenter.access$loadContent(moneybotHomePresenter, coroutineScope, str, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            SafeTrace.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0086, code lost:
    
        if (r2.setRecentSession(null, r11) == r4) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0088, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006d, code lost:
    
        if (r12 == r4) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0060, code lost:
    
        if (r12.removeSession(r0) == r4) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x004b, code lost:
    
        if (r12 == r4) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object invokeSuspend$com$squareup$cash$moneybot$presenters$MoneybotOverflowMenuPresenter$deleteSession$1(Object obj) {
        String str = (String) this.$hasLocationPermission$delegate;
        CardLockPresenter cardLockPresenter = (CardLockPresenter) this.$locationViewModel$delegate;
        RealMoneybotChatMessagesCache realMoneybotChatMessagesCache = (RealMoneybotChatMessagesCache) cardLockPresenter.cashAppTagManager;
        CoroutineScope coroutineScope = (CoroutineScope) this.this$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        int i2 = 1;
        Continuation continuation = null;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            ChatManager chatManager = (ChatManager) cardLockPresenter.cardLockFlowTypeProvider;
            this.this$0 = coroutineScope;
            this.label = 1;
            obj = ((RealChatManager) chatManager).deleteChat(str, this);
        } else if (i == 1) {
            SafeTrace.throwOnFailure(obj);
        } else {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        SafeTrace.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                RecentMoneybotSession recentMoneybotSession = (RecentMoneybotSession) obj;
                if (Intrinsics.areEqual(recentMoneybotSession != null ? recentMoneybotSession.sessionId : null, str)) {
                    this.this$0 = null;
                    this.label = 4;
                }
                return Unit.INSTANCE;
            }
            SafeTrace.throwOnFailure(obj);
            this.this$0 = null;
            this.label = 3;
            obj = realMoneybotChatMessagesCache.recentMoneybotSessionPref.get(this);
        }
        ApiResult apiResult = (ApiResult) obj;
        if (!(apiResult instanceof ApiResult.Success)) {
            if (!(apiResult instanceof ApiResult.Failure)) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
            StandaloneCoroutine standaloneCoroutine = (StandaloneCoroutine) cardLockPresenter.ioDispatcher;
            if (standaloneCoroutine != null) {
                standaloneCoroutine.cancel(null);
            }
            ((ParcelableSnapshotMutableState) cardLockPresenter.stringManager).setValue(RecentChatHistoryViewModel$Loaded.Error.Delete.INSTANCE);
            cardLockPresenter.ioDispatcher = JobKt.launch$default(coroutineScope, null, null, new MoneybotOverflowMenuPresenter$loadNextPage$1$1(cardLockPresenter, continuation, i2), 3);
            return Unit.INSTANCE;
        }
        RealUserSessionPager realUserSessionPager = (RealUserSessionPager) cardLockPresenter.analytics;
        this.this$0 = null;
        this.label = 2;
    }

    private final Object invokeSuspend$com$squareup$cash$moneybot$presenters$MoneybotOverflowMenuPresenter$models$2$1(Object obj) {
        MutableState mutableState = (MutableState) this.$hasLocationPermission$delegate;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            mutableState.setValue(Boolean.FALSE);
            RealUserSessionPager realUserSessionPager = (RealUserSessionPager) ((CardLockPresenter) this.this$0).analytics;
            this.$locationViewModel$delegate = mutableState;
            this.label = 1;
            realUserSessionPager.nextCursor = null;
            realUserSessionPager._sessions.setValue(null);
            realUserSessionPager.hasMoreSessions = true;
            obj = realUserSessionPager.fetchNextPage(this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            mutableState = (MutableState) this.$locationViewModel$delegate;
            SafeTrace.throwOnFailure(obj);
        }
        mutableState.setValue(Boolean.valueOf(!(obj instanceof ApiResult.Success)));
        return Unit.INSTANCE;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        Object obj2 = this.$hasLocationPermission$delegate;
        switch (i) {
            case 0:
                return new CashMapPresenter$models$3$1((CashMapPresenter) this.this$0, (MutableState) this.$locationViewModel$delegate, (MutableState) obj2, continuation, 0);
            case 1:
                return new CashMapPresenter$models$3$1(1, (MutableState) this.$locationViewModel$delegate, (ImmutableList) this.this$0, (CollapsingToolbarScaffoldState) obj2, continuation);
            case 2:
                CashMapPresenter$models$3$1 cashMapPresenter$models$3$1 = new CashMapPresenter$models$3$1((Flow) this.$locationViewModel$delegate, continuation, (InviteErrorPresenter) obj2, 2);
                cashMapPresenter$models$3$1.this$0 = obj;
                return cashMapPresenter$models$3$1;
            case 3:
                CashMapPresenter$models$3$1 cashMapPresenter$models$3$12 = new CashMapPresenter$models$3$1((RealLimitsStore) obj2, continuation);
                cashMapPresenter$models$3$12.$locationViewModel$delegate = obj;
                return cashMapPresenter$models$3$12;
            case 4:
                CashMapPresenter$models$3$1 cashMapPresenter$models$3$13 = new CashMapPresenter$models$3$1((Flow) this.$locationViewModel$delegate, continuation, (MusicPresenter) obj2, 4);
                cashMapPresenter$models$3$13.this$0 = obj;
                return cashMapPresenter$models$3$13;
            case 5:
                CashMapPresenter$models$3$1 cashMapPresenter$models$3$14 = new CashMapPresenter$models$3$1((Flow) this.$locationViewModel$delegate, continuation, (InviteErrorPresenter) obj2, 5);
                cashMapPresenter$models$3$14.this$0 = obj;
                return cashMapPresenter$models$3$14;
            case 6:
                return new CashMapPresenter$models$3$1((LocalCashBalancePresenter) this.this$0, (MutableState) this.$locationViewModel$delegate, (State) obj2, continuation, 6);
            case 7:
                return new CashMapPresenter$models$3$1(7, (MutableState) this.$locationViewModel$delegate, (CameraPositionState) this.this$0, (CashMapViewModel) obj2, continuation);
            case 8:
                return new CashMapPresenter$models$3$1(8, (MutableState) this.$locationViewModel$delegate, (CameraPositionState) this.this$0, (Function1) obj2, continuation);
            case 9:
                return new CashMapPresenter$models$3$1(9, (MutableState) this.$locationViewModel$delegate, (CashMapPresenter) this.this$0, (CashMapViewEvent) obj2, continuation);
            case 10:
                CashMapPresenter$models$3$1 cashMapPresenter$models$3$15 = new CashMapPresenter$models$3$1((Flow) this.$locationViewModel$delegate, continuation, (VerifyCheckDialogPresenter) obj2, 10);
                cashMapPresenter$models$3$15.this$0 = obj;
                return cashMapPresenter$models$3$15;
            case 11:
                CashMapPresenter$models$3$1 cashMapPresenter$models$3$16 = new CashMapPresenter$models$3$1((Flow) this.$locationViewModel$delegate, continuation, (LocalCashBalancePresenter) obj2, 11);
                cashMapPresenter$models$3$16.this$0 = obj;
                return cashMapPresenter$models$3$16;
            case 12:
                return new CashMapPresenter$models$3$1((ShareSheetPresenter) this.this$0, (MutableState) this.$locationViewModel$delegate, (ParcelableSnapshotMutableIntState) obj2, continuation, 12);
            case 13:
                CashMapPresenter$models$3$1 cashMapPresenter$models$3$17 = new CashMapPresenter$models$3$1((Flow) this.$locationViewModel$delegate, continuation, (ShareSheetPresenter) obj2, 13);
                cashMapPresenter$models$3$17.this$0 = obj;
                return cashMapPresenter$models$3$17;
            case 14:
                return new CashMapPresenter$models$3$1((ShareSheetPresenter) this.this$0, (MutableState) this.$locationViewModel$delegate, (MutableState) obj2, continuation, 14);
            case 15:
                return new CashMapPresenter$models$3$1((WorkHomePresenter) this.this$0, (MutableState) this.$locationViewModel$delegate, (MutableState) obj2, continuation, 15);
            case 16:
                CashMapPresenter$models$3$1 cashMapPresenter$models$3$18 = new CashMapPresenter$models$3$1((Flow) this.$locationViewModel$delegate, continuation, (MusicPresenter) obj2, 16);
                cashMapPresenter$models$3$18.this$0 = obj;
                return cashMapPresenter$models$3$18;
            case 17:
                CashMapPresenter$models$3$1 cashMapPresenter$models$3$19 = new CashMapPresenter$models$3$1((UnleashContext) this.$locationViewModel$delegate, (String) obj2, continuation, 17);
                cashMapPresenter$models$3$19.this$0 = obj;
                return cashMapPresenter$models$3$19;
            case 18:
                CashMapPresenter$models$3$1 cashMapPresenter$models$3$110 = new CashMapPresenter$models$3$1((Flow) this.$locationViewModel$delegate, continuation, (VerifyCheckDialogPresenter) obj2, 18);
                cashMapPresenter$models$3$110.this$0 = obj;
                return cashMapPresenter$models$3$110;
            case 19:
                return new CashMapPresenter$models$3$1((MoleculePresenter) this.this$0, (MutableState) obj2, continuation, 19);
            case 20:
                return new CashMapPresenter$models$3$1((MoneybotChatPresenter) this.this$0, (MoneybotFeedbackAnswer) this.$locationViewModel$delegate, (MessageViewModel.MoneybotMessageViewModel.ThumbState) obj2, continuation, 20);
            case 21:
                return new CashMapPresenter$models$3$1((MoleculePresenter) this.this$0, (MutableState) obj2, continuation, 21);
            case 22:
                return new CashMapPresenter$models$3$1(22, (MutableState) this.$locationViewModel$delegate, (MoneybotChatPresenter) this.this$0, (ChatKickoffParams) obj2, continuation);
            case 23:
                CashMapPresenter$models$3$1 cashMapPresenter$models$3$111 = new CashMapPresenter$models$3$1((MutableState) this.$locationViewModel$delegate, (MoneybotChatPresenter) obj2, continuation, 23);
                cashMapPresenter$models$3$111.this$0 = obj;
                return cashMapPresenter$models$3$111;
            case 24:
                return new CashMapPresenter$models$3$1((MoneybotChatPresenter) this.this$0, (String) this.$locationViewModel$delegate, (RealBrandFollowPresenter$models$2$1$1) obj2, continuation, 24);
            case 25:
                CashMapPresenter$models$3$1 cashMapPresenter$models$3$112 = new CashMapPresenter$models$3$1((Flow) this.$locationViewModel$delegate, continuation, (DisclosurePresenter) obj2, 25);
                cashMapPresenter$models$3$112.this$0 = obj;
                return cashMapPresenter$models$3$112;
            case 26:
                CashMapPresenter$models$3$1 cashMapPresenter$models$3$113 = new CashMapPresenter$models$3$1((MoneybotHomePresenter) this.$locationViewModel$delegate, (String) obj2, continuation, 26);
                cashMapPresenter$models$3$113.this$0 = obj;
                return cashMapPresenter$models$3$113;
            case 27:
                CashMapPresenter$models$3$1 cashMapPresenter$models$3$114 = new CashMapPresenter$models$3$1((CardLockPresenter) this.$locationViewModel$delegate, (String) obj2, continuation, 27);
                cashMapPresenter$models$3$114.this$0 = obj;
                return cashMapPresenter$models$3$114;
            case 28:
                return new CashMapPresenter$models$3$1((MoleculePresenter) this.this$0, (MutableState) obj2, continuation, 28);
            default:
                CashMapPresenter$models$3$1 cashMapPresenter$models$3$115 = new CashMapPresenter$models$3$1((Flow) this.$locationViewModel$delegate, continuation, (MusicPresenter) obj2, 29);
                cashMapPresenter$models$3$115.this$0 = obj;
                return cashMapPresenter$models$3$115;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 17:
                ((CashMapPresenter$models$3$1) create((ProducerScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                break;
        }
        return ((CashMapPresenter$models$3$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:276:0x0b43, code lost:
    
        if (r5.emit(com.squareup.cash.limits.backend.api.CustomerLimitsModel.Unavailable.INSTANCE, r44) == r2) goto L569;
     */
    /* JADX WARN: Code restructure failed: missing block: B:652:0x051e, code lost:
    
        if (r8 == r6) goto L231;
     */
    /* JADX WARN: Code restructure failed: missing block: B:653:0x050a, code lost:
    
        r2 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:655:0x0508, code lost:
    
        if (r5.emit(com.squareup.cash.limits.backend.api.CustomerLimitsModel.Loading.INSTANCE, r44) == r6) goto L231;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:275:0x0b36  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x05ef  */
    /* JADX WARN: Removed duplicated region for block: B:349:0x0600  */
    /* JADX WARN: Removed duplicated region for block: B:351:0x0606  */
    /* JADX WARN: Removed duplicated region for block: B:366:0x064e  */
    /* JADX WARN: Removed duplicated region for block: B:372:0x065f  */
    /* JADX WARN: Removed duplicated region for block: B:375:0x0667  */
    /* JADX WARN: Removed duplicated region for block: B:378:0x066f  */
    /* JADX WARN: Removed duplicated region for block: B:381:0x0677  */
    /* JADX WARN: Removed duplicated region for block: B:383:0x067d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:403:0x0753  */
    /* JADX WARN: Removed duplicated region for block: B:406:0x0756 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:414:0x070a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:433:0x067a  */
    /* JADX WARN: Removed duplicated region for block: B:434:0x0672  */
    /* JADX WARN: Removed duplicated region for block: B:435:0x066a  */
    /* JADX WARN: Removed duplicated region for block: B:436:0x0662  */
    /* JADX WARN: Removed duplicated region for block: B:449:0x060c  */
    /* JADX WARN: Removed duplicated region for block: B:451:0x0612  */
    /* JADX WARN: Removed duplicated region for block: B:456:0x0782 A[ADDED_TO_REGION, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:457:0x060f  */
    /* JADX WARN: Removed duplicated region for block: B:458:0x0603  */
    /* JADX WARN: Removed duplicated region for block: B:557:0x09c8 A[Catch: Exception -> 0x09e6, TryCatch #0 {Exception -> 0x09e6, blocks: (B:614:0x09b7, B:616:0x09bb, B:618:0x09c2, B:557:0x09c8, B:559:0x09cc, B:561:0x09d3, B:563:0x09d9, B:565:0x09df, B:566:0x09eb, B:568:0x09ef, B:569:0x09f8, B:571:0x09fc, B:572:0x0a05, B:573:0x0a36, B:575:0x0a3c, B:576:0x0a43, B:579:0x0a49, B:591:0x0a0b, B:593:0x0a11, B:594:0x0a18, B:596:0x0a1c, B:597:0x0a23, B:599:0x0a27, B:600:0x0a32, B:606:0x0a53, B:608:0x0a5b, B:610:0x0a58), top: B:613:0x09b7 }] */
    /* JADX WARN: Removed duplicated region for block: B:563:0x09d9 A[Catch: Exception -> 0x09e6, TryCatch #0 {Exception -> 0x09e6, blocks: (B:614:0x09b7, B:616:0x09bb, B:618:0x09c2, B:557:0x09c8, B:559:0x09cc, B:561:0x09d3, B:563:0x09d9, B:565:0x09df, B:566:0x09eb, B:568:0x09ef, B:569:0x09f8, B:571:0x09fc, B:572:0x0a05, B:573:0x0a36, B:575:0x0a3c, B:576:0x0a43, B:579:0x0a49, B:591:0x0a0b, B:593:0x0a11, B:594:0x0a18, B:596:0x0a1c, B:597:0x0a23, B:599:0x0a27, B:600:0x0a32, B:606:0x0a53, B:608:0x0a5b, B:610:0x0a58), top: B:613:0x09b7 }] */
    /* JADX WARN: Removed duplicated region for block: B:575:0x0a3c A[Catch: Exception -> 0x09e6, TryCatch #0 {Exception -> 0x09e6, blocks: (B:614:0x09b7, B:616:0x09bb, B:618:0x09c2, B:557:0x09c8, B:559:0x09cc, B:561:0x09d3, B:563:0x09d9, B:565:0x09df, B:566:0x09eb, B:568:0x09ef, B:569:0x09f8, B:571:0x09fc, B:572:0x0a05, B:573:0x0a36, B:575:0x0a3c, B:576:0x0a43, B:579:0x0a49, B:591:0x0a0b, B:593:0x0a11, B:594:0x0a18, B:596:0x0a1c, B:597:0x0a23, B:599:0x0a27, B:600:0x0a32, B:606:0x0a53, B:608:0x0a5b, B:610:0x0a58), top: B:613:0x09b7 }] */
    /* JADX WARN: Removed duplicated region for block: B:578:0x0a47  */
    /* JADX WARN: Removed duplicated region for block: B:581:0x0a70 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:585:0x09a2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:586:0x0a41  */
    /* JADX WARN: Removed duplicated region for block: B:590:0x0a09  */
    /* JADX WARN: Type inference failed for: r3v24, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v27, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v28, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v41, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r3v42, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v52, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r3v53, types: [java.util.List] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object access$centerOnUserLocation;
        CoroutineSingletons coroutineSingletons;
        Object customerLimits;
        ApiResult apiResult;
        Object obj2;
        FlowCollector flowCollector;
        CoroutineSingletons coroutineSingletons2;
        Pair pair;
        String valueOf;
        GetCustomerLimitsResponse.FlatLimits.LimitUsage.MoneyLimit moneyLimit;
        GetCustomerLimitsResponse.FlatLimits.LimitUsage.CountLimit countLimit;
        LimitUsageViewModel limitUsageViewModel;
        long j;
        long j2;
        LimitUsageViewModel.LimitValue countLimitValue;
        String str;
        ApiResult apiResult2;
        char c;
        LimitsSectionType limitsSectionType;
        FlowCollector flowCollector2;
        CoroutineSingletons coroutineSingletons3;
        Iterator it;
        Iterator it2;
        ?? listOf;
        Iterator it3;
        GetCustomerLimitsResponse.LimitsSection.LimitsCategory.LimitUsage.MoneyLimit moneyLimit2;
        GetCustomerLimitsResponse.LimitsSection.LimitsCategory.LimitUsage.CountLimit countLimit2;
        GetCustomerLimitsResponse.LimitsSection.LimitsCategory.LimitUsage.MoneyLimit moneyLimit3;
        GetCustomerLimitsResponse.LimitsSection.LimitsCategory.LimitUsage.CountLimit countLimit3;
        Money money;
        Long l;
        FlowCollector flowCollector3;
        CoroutineSingletons coroutineSingletons4;
        Object obj3;
        Object countProgress;
        Object access$userLocationInBoundary;
        Object genericElementTree;
        Object genericElementTree2;
        int i = this.$r8$classId;
        int i2 = 6;
        int i3 = 5;
        int i4 = 15;
        int i5 = 10;
        Object obj4 = this.$hasLocationPermission$delegate;
        int i6 = 1;
        switch (i) {
            case 0:
                CashMapPresenter cashMapPresenter = (CashMapPresenter) this.this$0;
                CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i7 = this.label;
                if (i7 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (cashMapPresenter.initialLocationModel != null) {
                        return Unit.INSTANCE;
                    }
                    this.label = 1;
                    access$centerOnUserLocation = CashMapPresenter.access$centerOnUserLocation(cashMapPresenter, this);
                    if (access$centerOnUserLocation == coroutineSingletons5) {
                        return coroutineSingletons5;
                    }
                } else {
                    if (i7 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    access$centerOnUserLocation = obj;
                }
                LocationViewModel locationViewModel = (LocationViewModel) access$centerOnUserLocation;
                if (locationViewModel != null) {
                    ((MutableState) this.$locationViewModel$delegate).setValue(locationViewModel);
                }
                ((MutableState) obj4).setValue(Boolean.valueOf(cashMapPresenter.hasAnyLocationPermission()));
                return Unit.INSTANCE;
            case 1:
                CollapsingToolbarScaffoldState collapsingToolbarScaffoldState = (CollapsingToolbarScaffoldState) obj4;
                MutableState mutableState = (MutableState) this.$locationViewModel$delegate;
                ImmutableList immutableList = (ImmutableList) this.this$0;
                CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i8 = this.label;
                if (i8 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (!immutableList.isEmpty() && ((Boolean) mutableState.getValue()).booleanValue() && !InviteErrorDialogKt.isExpanded(collapsingToolbarScaffoldState.toolbarState)) {
                        CollapsingToolbarState collapsingToolbarState = collapsingToolbarScaffoldState.toolbarState;
                        this.label = 1;
                        if (collapsingToolbarState.expand(0, this) == coroutineSingletons6) {
                            return coroutineSingletons6;
                        }
                    }
                } else {
                    if (i8 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                mutableState.setValue(Boolean.valueOf(immutableList.isEmpty()));
                return Unit.INSTANCE;
            case 2:
                CoroutineScope coroutineScope = (CoroutineScope) this.this$0;
                CoroutineSingletons coroutineSingletons7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i9 = this.label;
                if (i9 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow = (Flow) this.$locationViewModel$delegate;
                    OffersDetailsPresenterV2$models$1$1$1 offersDetailsPresenterV2$models$1$1$1 = new OffersDetailsPresenterV2$models$1$1$1(coroutineScope, (InviteErrorPresenter) obj4, 12);
                    this.this$0 = null;
                    this.label = 1;
                    if (flow.collect(offersDetailsPresenterV2$models$1$1$1, this) == coroutineSingletons7) {
                        return coroutineSingletons7;
                    }
                } else {
                    if (i9 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 3:
                RealLimitsStore realLimitsStore = (RealLimitsStore) obj4;
                SampleStrategy sampleStrategy = realLimitsStore.oneErrorPerAppSessionStrategy;
                ErrorReporter errorReporter = realLimitsStore.errorReporter;
                FlowCollector flowCollector4 = (FlowCollector) this.$locationViewModel$delegate;
                CoroutineSingletons coroutineSingletons8 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i10 = this.label;
                if (i10 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.$locationViewModel$delegate = flowCollector4;
                    this.label = 1;
                    break;
                } else {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            if (i10 != 3) {
                                if (i10 == 4) {
                                    SafeTrace.throwOnFailure(obj);
                                    return Unit.INSTANCE;
                                }
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            apiResult2 = (ApiResult) this.this$0;
                            SafeTrace.throwOnFailure(obj);
                            coroutineSingletons = coroutineSingletons8;
                            obj2 = null;
                            apiResult = apiResult2;
                            if (apiResult instanceof ApiResult.Failure) {
                                this.$locationViewModel$delegate = obj2;
                                this.this$0 = apiResult;
                                this.label = 4;
                                break;
                            }
                            return Unit.INSTANCE;
                        }
                        SafeTrace.throwOnFailure(obj);
                        customerLimits = obj;
                        apiResult = (ApiResult) customerLimits;
                        if (!(apiResult instanceof ApiResult.Success)) {
                            coroutineSingletons = coroutineSingletons8;
                            obj2 = null;
                            if (apiResult instanceof ApiResult.Failure) {
                            }
                            return Unit.INSTANCE;
                        }
                        OrderBuilderModel.OrderType orderType = ((GetCustomerLimitsResponse) ((ApiResult.Success) apiResult).response).limits;
                        boolean z = orderType instanceof GetCustomerLimitsResponse$Limits$GroupedLimits;
                        ColorModel colorModel = ColorModel.CashGreen.INSTANCE;
                        if (!z) {
                            flowCollector = flowCollector4;
                            coroutineSingletons2 = coroutineSingletons8;
                            if (orderType instanceof GetCustomerLimitsResponse$Limits$FlatLimits) {
                                GetCustomerLimitsResponse.FlatLimits flatLimits = ((GetCustomerLimitsResponse$Limits$FlatLimits) orderType).value;
                                LimitsSectionType limitsSectionType2 = LimitsSectionType.UNKNOWN;
                                flatLimits.getClass();
                                List<GetCustomerLimitsResponse.FlatLimits.LimitsCategory> list = flatLimits.limits_categories;
                                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
                                for (GetCustomerLimitsResponse.FlatLimits.LimitsCategory limitsCategory : list) {
                                    List<GetCustomerLimitsResponse.FlatLimits.LimitUsage> list2 = limitsCategory.limit_usages;
                                    ArrayList arrayList2 = new ArrayList();
                                    for (GetCustomerLimitsResponse.FlatLimits.LimitUsage limitUsage : list2) {
                                        LimitViewModelKt$toFlatLimits$1$limitItems$1$1 limitViewModelKt$toFlatLimits$1$limitItems$1$1 = LimitViewModelKt$toFlatLimits$1$limitItems$1$1.INSTANCE;
                                        limitUsage.getClass();
                                        MenuItemAvailability menuItemAvailability = limitUsage.limit_value;
                                        if (menuItemAvailability != null) {
                                            try {
                                                GetCustomerLimitsResponse$FlatLimits$LimitUsage$LimitValue$MoneyLimit getCustomerLimitsResponse$FlatLimits$LimitUsage$LimitValue$MoneyLimit = menuItemAvailability instanceof GetCustomerLimitsResponse$FlatLimits$LimitUsage$LimitValue$MoneyLimit ? (GetCustomerLimitsResponse$FlatLimits$LimitUsage$LimitValue$MoneyLimit) menuItemAvailability : null;
                                                if (getCustomerLimitsResponse$FlatLimits$LimitUsage$LimitValue$MoneyLimit != null) {
                                                    moneyLimit = getCustomerLimitsResponse$FlatLimits$LimitUsage$LimitValue$MoneyLimit.value;
                                                    if (menuItemAvailability != null) {
                                                        GetCustomerLimitsResponse$FlatLimits$LimitUsage$LimitValue$CountLimit getCustomerLimitsResponse$FlatLimits$LimitUsage$LimitValue$CountLimit = menuItemAvailability instanceof GetCustomerLimitsResponse$FlatLimits$LimitUsage$LimitValue$CountLimit ? (GetCustomerLimitsResponse$FlatLimits$LimitUsage$LimitValue$CountLimit) menuItemAvailability : null;
                                                        if (getCustomerLimitsResponse$FlatLimits$LimitUsage$LimitValue$CountLimit != null) {
                                                            countLimit = getCustomerLimitsResponse$FlatLimits$LimitUsage$LimitValue$CountLimit.value;
                                                            if (moneyLimit != null) {
                                                                Money money2 = moneyLimit.amount_used;
                                                                String str2 = money2 != null ? (String) limitViewModelKt$toFlatLimits$1$limitItems$1$1.invoke(money2) : "";
                                                                Money money3 = moneyLimit.amount_remaining;
                                                                String str3 = money3 != null ? (String) limitViewModelKt$toFlatLimits$1$limitItems$1$1.invoke(money3) : "";
                                                                Money money4 = moneyLimit.limit_threshold_amount;
                                                                countLimitValue = new LimitUsageViewModel.LimitValue.MoneyLimitValue(str2, str3, money4 != null ? (String) limitViewModelKt$toFlatLimits$1$limitItems$1$1.invoke(money4) : "");
                                                            } else if (countLimit != null) {
                                                                Long l2 = countLimit.count_used;
                                                                long longValue = l2 != null ? l2.longValue() : 0L;
                                                                Long l3 = countLimit.count_remaining;
                                                                long longValue2 = l3 != null ? l3.longValue() : 0L;
                                                                Long l4 = countLimit.limit_threshold_count;
                                                                if (l4 != null) {
                                                                    long longValue3 = l4.longValue();
                                                                    j = longValue2;
                                                                    j2 = longValue3;
                                                                } else {
                                                                    j = longValue2;
                                                                    j2 = 0;
                                                                }
                                                                countLimitValue = new LimitUsageViewModel.LimitValue.CountLimitValue(longValue, j, j2);
                                                            } else {
                                                                errorReporter.report(new LimitsProtoParsingError("FlatLimits.LimitUsage", menuItemAvailability == null ? ProtoParsingError.ErrorType.REQUIRED_FIELD_MISSING : ProtoParsingError.ErrorType.INVALID_TYPE_TO_SEALED_INTERFACE_MAPPING, "limit_value", null, "Limits"), sampleStrategy);
                                                                limitUsageViewModel = null;
                                                                if (limitUsageViewModel == null) {
                                                                    arrayList2.add(limitUsageViewModel);
                                                                }
                                                            }
                                                            Double d = limitUsage.consumed_proportion;
                                                            double doubleValue = d != null ? d.doubleValue() : 0.0d;
                                                            str = limitUsage.limit_threshold_type_text;
                                                            if (str == null) {
                                                                str = "";
                                                            }
                                                            limitUsageViewModel = new LimitUsageViewModel(doubleValue, str, countLimitValue);
                                                            if (limitUsageViewModel == null) {
                                                            }
                                                        }
                                                    }
                                                    countLimit = null;
                                                    if (moneyLimit != null) {
                                                    }
                                                    Double d2 = limitUsage.consumed_proportion;
                                                    if (d2 != null) {
                                                    }
                                                    str = limitUsage.limit_threshold_type_text;
                                                    if (str == null) {
                                                    }
                                                    limitUsageViewModel = new LimitUsageViewModel(doubleValue, str, countLimitValue);
                                                    if (limitUsageViewModel == null) {
                                                    }
                                                }
                                            } catch (Exception e) {
                                                throw RotateKt.toProtoParsingExceptionFor(e, Reflection.factory.getOrCreateKotlinClass(GetCustomerLimitsResponse.FlatLimits.LimitUsage.class), LimitsParsingErrorFactory.INSTANCE, null);
                                            }
                                        }
                                        moneyLimit = null;
                                        if (menuItemAvailability != null) {
                                        }
                                        countLimit = null;
                                        if (moneyLimit != null) {
                                        }
                                        Double d22 = limitUsage.consumed_proportion;
                                        if (d22 != null) {
                                        }
                                        str = limitUsage.limit_threshold_type_text;
                                        if (str == null) {
                                        }
                                        limitUsageViewModel = new LimitUsageViewModel(doubleValue, str, countLimitValue);
                                        if (limitUsageViewModel == null) {
                                        }
                                    }
                                    ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList2, 10));
                                    Iterator it4 = arrayList2.iterator();
                                    while (it4.hasNext()) {
                                        LimitUsageViewModel limitUsageViewModel2 = (LimitUsageViewModel) it4.next();
                                        limitUsageViewModel2.getClass();
                                        LimitUsageViewModel.LimitValue limitValue = limitUsageViewModel2.limitValue;
                                        if (limitValue instanceof LimitUsageViewModel.LimitValue.MoneyLimitValue) {
                                            valueOf = ((LimitUsageViewModel.LimitValue.MoneyLimitValue) limitValue).limitThresholdFormatted;
                                        } else {
                                            if (!(limitValue instanceof LimitUsageViewModel.LimitValue.CountLimitValue)) {
                                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                                return null;
                                            }
                                            valueOf = String.valueOf(((LimitUsageViewModel.LimitValue.CountLimitValue) limitValue).limitThreshold);
                                        }
                                        arrayList3.add(new LimitItem(limitUsageViewModel2.limitThresholdTypeText, valueOf));
                                    }
                                    String str4 = limitsCategory.header_text;
                                    List listOf2 = CollectionsKt__CollectionsJVMKt.listOf(new LimitsCategoryViewModel$LimitsCategory(null, CollectionsKt__CollectionsJVMKt.listOf(new LimitItemViewModel.StaticLimit(null, arrayList3, EmptyList.INSTANCE))));
                                    LimitsSectionType limitsSectionType3 = LimitsSectionType.UNKNOWN;
                                    arrayList.add(new LimitViewModel(str4, listOf2, colorModel, limitsSectionType2, null));
                                }
                                obj2 = null;
                                pair = new Pair(arrayList, LimitsType.FLAT);
                            } else {
                                obj2 = null;
                                if (orderType != null) {
                                    Drop$$ExternalSyntheticBUOutline0.m1m();
                                    return null;
                                }
                                pair = new Pair(EmptyList.INSTANCE, LimitsType.GROUPED);
                            }
                            if (apiResult instanceof ApiResult.Failure) {
                            }
                            return Unit.INSTANCE;
                        }
                        GetCustomerLimitsResponse.GroupedLimits groupedLimits = ((GetCustomerLimitsResponse$Limits$GroupedLimits) orderType).value;
                        groupedLimits.getClass();
                        List list3 = groupedLimits.limits_sections;
                        ArrayList arrayList4 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list3, 10));
                        Iterator it5 = list3.iterator();
                        while (it5.hasNext()) {
                            GetCustomerLimitsResponse.LimitsSection limitsSection = (GetCustomerLimitsResponse.LimitsSection) it5.next();
                            GetCustomerLimitsResponse.LimitsSection.SectionType sectionType = limitsSection.section_type;
                            ColorModel colorModel2 = (sectionType == null ? -1 : LimitViewModelKt$WhenMappings.$EnumSwitchMapping$1[sectionType.ordinal()]) == i6 ? ColorModel.Bitcoin.INSTANCE : colorModel;
                            List list4 = limitsSection.limits_categories;
                            ArrayList arrayList5 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list4, i5));
                            Iterator it6 = list4.iterator();
                            while (it6.hasNext()) {
                                GetCustomerLimitsResponse.LimitsSection.LimitsCategory limitsCategory2 = (GetCustomerLimitsResponse.LimitsSection.LimitsCategory) it6.next();
                                List list5 = limitsCategory2.limit_usages;
                                String str5 = limitsCategory2.header_text;
                                List list6 = limitsCategory2.progress_bars;
                                if (list5.isEmpty()) {
                                    flowCollector2 = flowCollector4;
                                    coroutineSingletons3 = coroutineSingletons8;
                                    it = it5;
                                    it2 = it6;
                                    if (list6.isEmpty()) {
                                        listOf = CollectionsKt__CollectionsJVMKt.listOf(new LimitItemViewModel.StaticLimit(null, null, EmptyList.INSTANCE));
                                    } else {
                                        ArrayList arrayList6 = new ArrayList();
                                        ArrayList arrayList7 = new ArrayList();
                                        for (Object obj5 : list6) {
                                            if (((GetCustomerLimitsResponse.LimitsSection.LimitsCategory.ProgressBar) obj5).progress == null) {
                                                arrayList6.add(obj5);
                                            } else {
                                                arrayList7.add(obj5);
                                            }
                                        }
                                        listOf = new ArrayList();
                                        if (!arrayList6.isEmpty()) {
                                            ArrayList arrayList8 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList6, 10));
                                            Iterator it7 = arrayList6.iterator();
                                            while (it7.hasNext()) {
                                                GetCustomerLimitsResponse.LimitsSection.LimitsCategory.ProgressBar progressBar = (GetCustomerLimitsResponse.LimitsSection.LimitsCategory.ProgressBar) it7.next();
                                                String str6 = progressBar.primary_display_text;
                                                if (str6 == null) {
                                                    str6 = "";
                                                }
                                                String str7 = progressBar.secondary_display_text;
                                                if (str7 == null) {
                                                    str7 = "";
                                                }
                                                if (str7.length() > 0) {
                                                    str6 = Recorder$$ExternalSyntheticOutline2.m(str6, " ", str7);
                                                }
                                                arrayList8.add(str6);
                                            }
                                            listOf.add(new LimitItemViewModel.StaticLimit(str5, null, arrayList8));
                                        }
                                        Iterator it8 = arrayList7.iterator();
                                        while (it8.hasNext()) {
                                            GetCustomerLimitsResponse.LimitsSection.LimitsCategory.ProgressBar progressBar2 = (GetCustomerLimitsResponse.LimitsSection.LimitsCategory.ProgressBar) it8.next();
                                            String str8 = progressBar2.primary_display_text;
                                            if (str8 == null) {
                                                errorReporter.report(new LimitsProtoParsingError("LimitsCategory.ProgressBar", ProtoParsingError.ErrorType.REQUIRED_FIELD_MISSING, "primary_display_text", null, "Limits"), sampleStrategy);
                                                it3 = it8;
                                            } else {
                                                String str9 = progressBar2.secondary_display_text;
                                                Double d3 = progressBar2.progress;
                                                GetCustomerLimitsResponse.LimitsSection.LimitsCategory.ProgressBar.Type type2 = progressBar2.f1249type;
                                                String str10 = progressBar2.color;
                                                it3 = it8;
                                                listOf.add(new LimitItemViewModel.ProgressBarLimit(str5, CollectionsKt__CollectionsJVMKt.listOf(new ProgressViewModel.SimpleProgress(str8, str9, d3, type2, str10 != null ? new ColorModel.Accented(ColorsKt.toColor(str10)) : colorModel2))));
                                            }
                                            it8 = it3;
                                        }
                                    }
                                } else {
                                    List list7 = limitsCategory2.limit_usages;
                                    if (!(list7 instanceof Collection) || !list7.isEmpty()) {
                                        Iterator it9 = list7.iterator();
                                        while (it9.hasNext()) {
                                            zzuh zzuhVar = ((GetCustomerLimitsResponse.LimitsSection.LimitsCategory.LimitUsage) it9.next()).limit_value;
                                            List list8 = list7;
                                            if (zzuhVar != null) {
                                                GetCustomerLimitsResponse$LimitsSection$LimitsCategory$LimitUsage$LimitValue$MoneyLimit getCustomerLimitsResponse$LimitsSection$LimitsCategory$LimitUsage$LimitValue$MoneyLimit = zzuhVar instanceof GetCustomerLimitsResponse$LimitsSection$LimitsCategory$LimitUsage$LimitValue$MoneyLimit ? (GetCustomerLimitsResponse$LimitsSection$LimitsCategory$LimitUsage$LimitValue$MoneyLimit) zzuhVar : null;
                                                if (getCustomerLimitsResponse$LimitsSection$LimitsCategory$LimitUsage$LimitValue$MoneyLimit != null) {
                                                    moneyLimit2 = getCustomerLimitsResponse$LimitsSection$LimitsCategory$LimitUsage$LimitValue$MoneyLimit.value;
                                                    Iterator it10 = it9;
                                                    if (zzuhVar != null) {
                                                        GetCustomerLimitsResponse$LimitsSection$LimitsCategory$LimitUsage$LimitValue$CountLimit getCustomerLimitsResponse$LimitsSection$LimitsCategory$LimitUsage$LimitValue$CountLimit = zzuhVar instanceof GetCustomerLimitsResponse$LimitsSection$LimitsCategory$LimitUsage$LimitValue$CountLimit ? (GetCustomerLimitsResponse$LimitsSection$LimitsCategory$LimitUsage$LimitValue$CountLimit) zzuhVar : null;
                                                        if (getCustomerLimitsResponse$LimitsSection$LimitsCategory$LimitUsage$LimitValue$CountLimit != null) {
                                                            countLimit2 = getCustomerLimitsResponse$LimitsSection$LimitsCategory$LimitUsage$LimitValue$CountLimit.value;
                                                            if ((moneyLimit2 != null ? moneyLimit2.amount_used : null) != null || moneyLimit2.amount_remaining == null) {
                                                                if ((countLimit2 != null ? countLimit2.count_used : null) == null || countLimit2.count_remaining == null) {
                                                                    list7 = list8;
                                                                    it9 = it10;
                                                                    it5 = it5;
                                                                    it6 = it6;
                                                                    flowCollector4 = flowCollector4;
                                                                    coroutineSingletons8 = coroutineSingletons8;
                                                                }
                                                            }
                                                            ArrayList arrayList9 = new ArrayList();
                                                            Iterator it11 = list8.iterator();
                                                            while (it11.hasNext()) {
                                                                GetCustomerLimitsResponse.LimitsSection.LimitsCategory.LimitUsage limitUsage2 = (GetCustomerLimitsResponse.LimitsSection.LimitsCategory.LimitUsage) it11.next();
                                                                zzuh zzuhVar2 = limitUsage2.limit_value;
                                                                Iterator it12 = it11;
                                                                Double d4 = limitUsage2.consumed_proportion;
                                                                String str11 = limitUsage2.limit_threshold_type_text;
                                                                String str12 = limitUsage2.header_text;
                                                                if (zzuhVar2 != null) {
                                                                    GetCustomerLimitsResponse$LimitsSection$LimitsCategory$LimitUsage$LimitValue$MoneyLimit getCustomerLimitsResponse$LimitsSection$LimitsCategory$LimitUsage$LimitValue$MoneyLimit2 = zzuhVar2 instanceof GetCustomerLimitsResponse$LimitsSection$LimitsCategory$LimitUsage$LimitValue$MoneyLimit ? (GetCustomerLimitsResponse$LimitsSection$LimitsCategory$LimitUsage$LimitValue$MoneyLimit) zzuhVar2 : null;
                                                                    if (getCustomerLimitsResponse$LimitsSection$LimitsCategory$LimitUsage$LimitValue$MoneyLimit2 != null) {
                                                                        moneyLimit3 = getCustomerLimitsResponse$LimitsSection$LimitsCategory$LimitUsage$LimitValue$MoneyLimit2.value;
                                                                        Iterator it13 = it5;
                                                                        if (zzuhVar2 != null) {
                                                                            GetCustomerLimitsResponse$LimitsSection$LimitsCategory$LimitUsage$LimitValue$CountLimit getCustomerLimitsResponse$LimitsSection$LimitsCategory$LimitUsage$LimitValue$CountLimit2 = zzuhVar2 instanceof GetCustomerLimitsResponse$LimitsSection$LimitsCategory$LimitUsage$LimitValue$CountLimit ? (GetCustomerLimitsResponse$LimitsSection$LimitsCategory$LimitUsage$LimitValue$CountLimit) zzuhVar2 : null;
                                                                            if (getCustomerLimitsResponse$LimitsSection$LimitsCategory$LimitUsage$LimitValue$CountLimit2 != null) {
                                                                                countLimit3 = getCustomerLimitsResponse$LimitsSection$LimitsCategory$LimitUsage$LimitValue$CountLimit2.value;
                                                                                money = moneyLimit3 != null ? moneyLimit3.amount_used : null;
                                                                                Iterator it14 = it6;
                                                                                Money money5 = moneyLimit3 != null ? moneyLimit3.amount_remaining : null;
                                                                                l = countLimit3 != null ? countLimit3.count_used : null;
                                                                                Long l5 = countLimit3 != null ? countLimit3.count_remaining : null;
                                                                                if (money != null || money5 == null) {
                                                                                    flowCollector3 = flowCollector4;
                                                                                    coroutineSingletons4 = coroutineSingletons8;
                                                                                    if (l != null || l5 == null) {
                                                                                        obj3 = null;
                                                                                        if (obj3 == null) {
                                                                                            arrayList9.add(obj3);
                                                                                        }
                                                                                        it11 = it12;
                                                                                        it5 = it13;
                                                                                        it6 = it14;
                                                                                        flowCollector4 = flowCollector3;
                                                                                        coroutineSingletons8 = coroutineSingletons4;
                                                                                    } else {
                                                                                        String str13 = (str12 == null || StringsKt.isBlank(str12)) ? null : str12;
                                                                                        String valueOf2 = String.valueOf(l.longValue());
                                                                                        String valueOf3 = String.valueOf(l5.longValue());
                                                                                        Long l6 = countLimit3.limit_threshold_count;
                                                                                        countProgress = new ProgressViewModel.CountProgress(str13, valueOf2, valueOf3, String.valueOf(l6 != null ? l6.longValue() : 0L), str11 == null ? "" : str11, d4 != null ? d4.doubleValue() : 0.0d, colorModel2);
                                                                                    }
                                                                                } else {
                                                                                    String str14 = (str12 == null || StringsKt.isBlank(str12)) ? null : str12;
                                                                                    Lazy lazy = Moneys.currencyLocaleMap$delegate;
                                                                                    CurrencyCode currencyCode = money.currency_code;
                                                                                    currencyCode.getClass();
                                                                                    double displayDivisor = Moneys.displayDivisor(currencyCode);
                                                                                    flowCollector3 = flowCollector4;
                                                                                    coroutineSingletons4 = coroutineSingletons8;
                                                                                    double amount = ((long) (Moneys.amount(money) / displayDivisor)) * displayDivisor;
                                                                                    if (Moneys.amount(money) - ((long) amount) != 0) {
                                                                                        amount = (r9 + 1) * displayDivisor;
                                                                                    }
                                                                                    String formatMoney = Moneys.formatMoney(Money.copy$default(money, Long.valueOf((long) amount), null, null, 6));
                                                                                    String formatMoney2 = Moneys.formatMoney(Moneys.roundedDown(money5));
                                                                                    Money money6 = moneyLimit3.limit_threshold_amount;
                                                                                    String formatMoney3 = money6 != null ? Moneys.formatMoney(Moneys.roundedDown(money6)) : null;
                                                                                    countProgress = new ProgressViewModel.MoneyProgress(str14, formatMoney, formatMoney2, formatMoney3 == null ? "" : formatMoney3, str11 == null ? "" : str11, d4 != null ? d4.doubleValue() : 0.0d, colorModel2);
                                                                                }
                                                                                obj3 = countProgress;
                                                                                if (obj3 == null) {
                                                                                }
                                                                                it11 = it12;
                                                                                it5 = it13;
                                                                                it6 = it14;
                                                                                flowCollector4 = flowCollector3;
                                                                                coroutineSingletons8 = coroutineSingletons4;
                                                                            }
                                                                        }
                                                                        countLimit3 = null;
                                                                        if (moneyLimit3 != null) {
                                                                        }
                                                                        Iterator it142 = it6;
                                                                        Money money52 = moneyLimit3 != null ? moneyLimit3.amount_remaining : null;
                                                                        l = countLimit3 != null ? countLimit3.count_used : null;
                                                                        if (countLimit3 != null) {
                                                                        }
                                                                        if (money != null) {
                                                                        }
                                                                        flowCollector3 = flowCollector4;
                                                                        coroutineSingletons4 = coroutineSingletons8;
                                                                        if (l != null) {
                                                                        }
                                                                        obj3 = null;
                                                                        if (obj3 == null) {
                                                                        }
                                                                        it11 = it12;
                                                                        it5 = it13;
                                                                        it6 = it142;
                                                                        flowCollector4 = flowCollector3;
                                                                        coroutineSingletons8 = coroutineSingletons4;
                                                                    }
                                                                }
                                                                moneyLimit3 = null;
                                                                Iterator it132 = it5;
                                                                if (zzuhVar2 != null) {
                                                                }
                                                                countLimit3 = null;
                                                                if (moneyLimit3 != null) {
                                                                }
                                                                Iterator it1422 = it6;
                                                                Money money522 = moneyLimit3 != null ? moneyLimit3.amount_remaining : null;
                                                                l = countLimit3 != null ? countLimit3.count_used : null;
                                                                if (countLimit3 != null) {
                                                                }
                                                                if (money != null) {
                                                                }
                                                                flowCollector3 = flowCollector4;
                                                                coroutineSingletons4 = coroutineSingletons8;
                                                                if (l != null) {
                                                                }
                                                                obj3 = null;
                                                                if (obj3 == null) {
                                                                }
                                                                it11 = it12;
                                                                it5 = it132;
                                                                it6 = it1422;
                                                                flowCollector4 = flowCollector3;
                                                                coroutineSingletons8 = coroutineSingletons4;
                                                            }
                                                            flowCollector2 = flowCollector4;
                                                            coroutineSingletons3 = coroutineSingletons8;
                                                            it = it5;
                                                            it2 = it6;
                                                            listOf = !arrayList9.isEmpty() ? CollectionsKt__CollectionsJVMKt.listOf(new LimitItemViewModel.ProgressBarLimit(null, arrayList9)) : EmptyList.INSTANCE;
                                                        }
                                                    }
                                                    countLimit2 = null;
                                                    if ((moneyLimit2 != null ? moneyLimit2.amount_used : null) != null) {
                                                    }
                                                    if ((countLimit2 != null ? countLimit2.count_used : null) == null) {
                                                    }
                                                    list7 = list8;
                                                    it9 = it10;
                                                    it5 = it5;
                                                    it6 = it6;
                                                    flowCollector4 = flowCollector4;
                                                    coroutineSingletons8 = coroutineSingletons8;
                                                }
                                            }
                                            moneyLimit2 = null;
                                            Iterator it102 = it9;
                                            if (zzuhVar != null) {
                                            }
                                            countLimit2 = null;
                                            if ((moneyLimit2 != null ? moneyLimit2.amount_used : null) != null) {
                                            }
                                            if ((countLimit2 != null ? countLimit2.count_used : null) == null) {
                                            }
                                            list7 = list8;
                                            it9 = it102;
                                            it5 = it5;
                                            it6 = it6;
                                            flowCollector4 = flowCollector4;
                                            coroutineSingletons8 = coroutineSingletons8;
                                        }
                                    }
                                    List<GetCustomerLimitsResponse.LimitsSection.LimitsCategory.LimitUsage> list9 = list7;
                                    flowCollector2 = flowCollector4;
                                    coroutineSingletons3 = coroutineSingletons8;
                                    it = it5;
                                    it2 = it6;
                                    ArrayList arrayList10 = new ArrayList();
                                    for (GetCustomerLimitsResponse.LimitsSection.LimitsCategory.LimitUsage limitUsage3 : list9) {
                                        String str15 = limitUsage3.limit_threshold_type_text;
                                        if (str15 == null) {
                                            str15 = "";
                                        }
                                        String str16 = limitUsage3.limit_threshold_text;
                                        if (str16 == null) {
                                            str16 = "";
                                        }
                                        if (str15.length() == 0) {
                                            str15 = null;
                                        } else if (str16.length() != 0) {
                                            str15 = Recorder$$ExternalSyntheticOutline2.m(str15, " ", str16);
                                        }
                                        if (str15 != null) {
                                            arrayList10.add(str15);
                                        }
                                    }
                                    listOf = !arrayList10.isEmpty() ? CollectionsKt__CollectionsJVMKt.listOf(new LimitItemViewModel.StaticLimit(null, null, arrayList10)) : EmptyList.INSTANCE;
                                }
                                arrayList5.add(new LimitsCategoryViewModel$LimitsCategory(str5, listOf));
                                it5 = it;
                                it6 = it2;
                                flowCollector4 = flowCollector2;
                                coroutineSingletons8 = coroutineSingletons3;
                            }
                            FlowCollector flowCollector5 = flowCollector4;
                            CoroutineSingletons coroutineSingletons9 = coroutineSingletons8;
                            Iterator it15 = it5;
                            String str17 = limitsSection.header_text;
                            GetCustomerLimitsResponse.LimitsSection.SectionType sectionType2 = limitsSection.section_type;
                            int i11 = sectionType2 != null ? LimitViewModelKt$WhenMappings.$EnumSwitchMapping$1[sectionType2.ordinal()] : -1;
                            if (i11 != 1) {
                                c = 2;
                                limitsSectionType = i11 != 2 ? i11 != 3 ? i11 != 4 ? i11 != 5 ? LimitsSectionType.UNKNOWN : LimitsSectionType.STOCKS : LimitsSectionType.DEPOSIT_AND_WITHDRAW : LimitsSectionType.SEND_AND_RECEIVE : LimitsSectionType.CASH_CARD;
                            } else {
                                c = 2;
                                limitsSectionType = LimitsSectionType.BITCOIN;
                            }
                            arrayList4.add(new LimitViewModel(str17, arrayList5, colorModel2, limitsSectionType, limitsSection.description_text));
                            it5 = it15;
                            flowCollector4 = flowCollector5;
                            coroutineSingletons8 = coroutineSingletons9;
                            i5 = 10;
                            i6 = 1;
                        }
                        flowCollector = flowCollector4;
                        coroutineSingletons2 = coroutineSingletons8;
                        pair = new Pair(arrayList4, LimitsType.GROUPED);
                        obj2 = null;
                        CustomerLimitsModel.Loaded loaded = new CustomerLimitsModel.Loaded((List) pair.first, (LimitsType) pair.second);
                        flowCollector4 = flowCollector;
                        this.$locationViewModel$delegate = flowCollector4;
                        this.this$0 = apiResult;
                        this.label = 3;
                        coroutineSingletons = coroutineSingletons2;
                        if (flowCollector4.emit(loaded, this) != coroutineSingletons) {
                            apiResult2 = apiResult;
                            apiResult = apiResult2;
                            if (apiResult instanceof ApiResult.Failure) {
                            }
                            return Unit.INSTANCE;
                        }
                        return coroutineSingletons;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                LimitsHubService limitsHubService = realLimitsStore.limitsHubService;
                GetCustomerLimitsRequest getCustomerLimitsRequest = new GetCustomerLimitsRequest(ByteString.EMPTY);
                this.$locationViewModel$delegate = flowCollector4;
                this.label = 2;
                customerLimits = limitsHubService.getCustomerLimits(getCustomerLimitsRequest, this);
                break;
            case 4:
                CoroutineScope coroutineScope2 = (CoroutineScope) this.this$0;
                CoroutineSingletons coroutineSingletons10 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i12 = this.label;
                if (i12 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow2 = (Flow) this.$locationViewModel$delegate;
                    OffersDetailsPresenterV2$models$1$1$1 offersDetailsPresenterV2$models$1$1$12 = new OffersDetailsPresenterV2$models$1$1$1(coroutineScope2, (MusicPresenter) obj4, 13);
                    this.this$0 = null;
                    this.label = 1;
                    if (flow2.collect(offersDetailsPresenterV2$models$1$1$12, this) == coroutineSingletons10) {
                        return coroutineSingletons10;
                    }
                } else {
                    if (i12 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 5:
                CoroutineScope coroutineScope3 = (CoroutineScope) this.this$0;
                CoroutineSingletons coroutineSingletons11 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i13 = this.label;
                if (i13 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow3 = (Flow) this.$locationViewModel$delegate;
                    OffersDetailsPresenterV2$models$1$1$1 offersDetailsPresenterV2$models$1$1$13 = new OffersDetailsPresenterV2$models$1$1$1(coroutineScope3, (InviteErrorPresenter) obj4, 14);
                    this.this$0 = null;
                    this.label = 1;
                    if (flow3.collect(offersDetailsPresenterV2$models$1$1$13, this) == coroutineSingletons11) {
                        return coroutineSingletons11;
                    }
                } else {
                    if (i13 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 6:
                MutableState mutableState2 = (MutableState) this.$locationViewModel$delegate;
                CoroutineSingletons coroutineSingletons12 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i14 = this.label;
                if (i14 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    mutableState2.setValue(Boolean.TRUE);
                    LocalCashBalancePresenter localCashBalancePresenter = (LocalCashBalancePresenter) this.this$0;
                    LocalizationConfig.LanguageDisclosure languageDisclosure = (LocalizationConfig.LanguageDisclosure) ((State) obj4).getValue();
                    this.label = 1;
                    if (LocalCashBalancePresenter.access$handleAccept(localCashBalancePresenter, languageDisclosure, this) == coroutineSingletons12) {
                        return coroutineSingletons12;
                    }
                } else {
                    if (i14 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                mutableState2.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
            case 7:
                CoroutineSingletons coroutineSingletons13 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i15 = this.label;
                if (i15 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (((GoogleMap) ((MutableState) this.$locationViewModel$delegate).getValue()) != null) {
                        CameraPositionState cameraPositionState = (CameraPositionState) this.this$0;
                        LocationViewModel locationViewModel2 = ((CashMapViewModel) obj4).locationViewModel;
                        OneShotDisposable newCameraPosition = CameraUpdateFactory.newCameraPosition(new CameraPosition(new LatLng(locationViewModel2.lat, locationViewModel2.lng), locationViewModel2.zoom, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE));
                        this.label = 1;
                        if (cameraPositionState.animate(newCameraPosition, Integer.MAX_VALUE, this) == coroutineSingletons13) {
                            return coroutineSingletons13;
                        }
                    }
                } else {
                    if (i15 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 8:
                CameraPositionState cameraPositionState2 = (CameraPositionState) this.this$0;
                CoroutineSingletons coroutineSingletons14 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i16 = this.label;
                if (i16 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    InviteContactsPresenter$filterContacts$$inlined$map$1 inviteContactsPresenter$filterContacts$$inlined$map$1 = new InviteContactsPresenter$filterContacts$$inlined$map$1(FlowKt.distinctUntilChanged(Updater.snapshotFlow(new GoogleMapEngine$Map$2$1$$ExternalSyntheticLambda0(cameraPositionState2, 0))), 29);
                    RealKeyStoreProvider$setEntry$2 realKeyStoreProvider$setEntry$2 = new RealKeyStoreProvider$setEntry$2(cameraPositionState2, (Function1) obj4, (MutableState) this.$locationViewModel$delegate, (Continuation) null, 7);
                    this.label = 1;
                    if (FlowKt.collectLatest(inviteContactsPresenter$filterContacts$$inlined$map$1, realKeyStoreProvider$setEntry$2, this) == coroutineSingletons14) {
                        return coroutineSingletons14;
                    }
                } else {
                    if (i16 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 9:
                CoroutineSingletons coroutineSingletons15 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i17 = this.label;
                if (i17 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    CashMapPresenter cashMapPresenter2 = (CashMapPresenter) this.this$0;
                    MapBoundary mapBoundary = ((CashMapViewEvent.MapMovementFinished) ((CashMapViewEvent) obj4)).boundary;
                    this.label = 1;
                    access$userLocationInBoundary = CashMapPresenter.access$userLocationInBoundary(cashMapPresenter2, mapBoundary, this);
                    if (access$userLocationInBoundary == coroutineSingletons15) {
                        return coroutineSingletons15;
                    }
                } else {
                    if (i17 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    access$userLocationInBoundary = obj;
                }
                Boolean bool = (Boolean) access$userLocationInBoundary;
                bool.booleanValue();
                ((MutableState) this.$locationViewModel$delegate).setValue(bool);
                return Unit.INSTANCE;
            case 10:
                CoroutineScope coroutineScope4 = (CoroutineScope) this.this$0;
                CoroutineSingletons coroutineSingletons16 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i18 = this.label;
                if (i18 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow4 = (Flow) this.$locationViewModel$delegate;
                    OffersDetailsPresenterV2$models$1$1$1 offersDetailsPresenterV2$models$1$1$14 = new OffersDetailsPresenterV2$models$1$1$1(coroutineScope4, (VerifyCheckDialogPresenter) obj4, i4);
                    this.this$0 = null;
                    this.label = 1;
                    if (flow4.collect(offersDetailsPresenterV2$models$1$1$14, this) == coroutineSingletons16) {
                        return coroutineSingletons16;
                    }
                } else {
                    if (i18 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 11:
                CoroutineScope coroutineScope5 = (CoroutineScope) this.this$0;
                CoroutineSingletons coroutineSingletons17 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i19 = this.label;
                if (i19 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow5 = (Flow) this.$locationViewModel$delegate;
                    OffersDetailsPresenterV2$models$1$1$1 offersDetailsPresenterV2$models$1$1$15 = new OffersDetailsPresenterV2$models$1$1$1(coroutineScope5, (LocalCashBalancePresenter) obj4, 16);
                    this.this$0 = null;
                    this.label = 1;
                    if (flow5.collect(offersDetailsPresenterV2$models$1$1$15, this) == coroutineSingletons17) {
                        return coroutineSingletons17;
                    }
                } else {
                    if (i19 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 12:
                CoroutineSingletons coroutineSingletons18 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i20 = this.label;
                if (i20 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    RealBoostRepository realBoostRepository = (RealBoostRepository) ((ShareSheetPresenter) this.this$0).analytics;
                    List list10 = (List) ((MutableState) this.$locationViewModel$delegate).getValue();
                    list10.getClass();
                    ArrayList arrayList11 = new ArrayList();
                    for (Object obj6 : list10) {
                        if (obj6 instanceof GenericTreeElementsRefreshTrigger$BoostContentUpdateTrigger) {
                            arrayList11.add(obj6);
                        }
                    }
                    ArrayList arrayList12 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList11, 10));
                    Iterator it16 = arrayList11.iterator();
                    while (it16.hasNext()) {
                        arrayList12.add(((GenericTreeElementsRefreshTrigger$BoostContentUpdateTrigger) it16.next()).boostTokens);
                    }
                    ArrayList flatten = CollectionsKt__IterablesKt.flatten(arrayList12);
                    RealBoostProvider realBoostProvider = realBoostRepository.boostProvider;
                    FlowKt__LimitKt$drop$$inlined$unsafeFlow$1 drop = FlowKt.drop(new RealTransferManager$addCash$$inlined$map$1(new RealTransferManager$addCash$$inlined$map$1(DBUtil.mapToList(DBUtil.toFlow(realBoostProvider.selectableRewardQueries.rewards()), realBoostProvider.ioDispatcher), realBoostProvider, i3), flatten, i2), 1);
                    MerchantProfilePresenter$models$4$1$1 merchantProfilePresenter$models$4$1$1 = new MerchantProfilePresenter$models$4$1$1((ParcelableSnapshotMutableIntState) obj4);
                    this.label = 1;
                    if (drop.collect(merchantProfilePresenter$models$4$1$1, this) == coroutineSingletons18) {
                        return coroutineSingletons18;
                    }
                } else {
                    if (i20 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 13:
                CoroutineScope coroutineScope6 = (CoroutineScope) this.this$0;
                CoroutineSingletons coroutineSingletons19 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i21 = this.label;
                if (i21 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow6 = (Flow) this.$locationViewModel$delegate;
                    OffersDetailsPresenterV2$models$1$1$1 offersDetailsPresenterV2$models$1$1$16 = new OffersDetailsPresenterV2$models$1$1$1(coroutineScope6, (ShareSheetPresenter) obj4, 18);
                    this.this$0 = null;
                    this.label = 1;
                    if (flow6.collect(offersDetailsPresenterV2$models$1$1$16, this) == coroutineSingletons19) {
                        return coroutineSingletons19;
                    }
                } else {
                    if (i21 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 14:
                CoroutineSingletons coroutineSingletons20 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i22 = this.label;
                if (i22 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    ShareSheetPresenter shareSheetPresenter = (ShareSheetPresenter) this.this$0;
                    RealGenericTreeElementsRepo realGenericTreeElementsRepo = (RealGenericTreeElementsRepo) shareSheetPresenter.shareTargetsManager;
                    SquareLoyaltyDetailsScreen squareLoyaltyDetailsScreen = (SquareLoyaltyDetailsScreen) shareSheetPresenter.profileManager;
                    String str18 = squareLoyaltyDetailsScreen.gteContext;
                    String str19 = squareLoyaltyDetailsScreen.merchantToken;
                    this.label = 1;
                    genericElementTree = realGenericTreeElementsRepo.getGenericElementTree(str18, str19, this);
                    if (genericElementTree == coroutineSingletons20) {
                        return coroutineSingletons20;
                    }
                } else {
                    if (i22 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    genericElementTree = obj;
                }
                ApiResult apiResult3 = (ApiResult) genericElementTree;
                if (apiResult3 instanceof ApiResult.Success) {
                    ((MutableState) this.$locationViewModel$delegate).setValue((GenericTreeElementsData) ((ApiResult.Success) apiResult3).response);
                } else {
                    if (!(apiResult3 instanceof ApiResult.Failure)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    MutableState mutableState3 = (MutableState) obj4;
                    SquareLoyaltyDetailsPresenter$State squareLoyaltyDetailsPresenter$State = (SquareLoyaltyDetailsPresenter$State) mutableState3.getValue();
                    mutableState3.setValue(new SquareLoyaltyDetailsPresenter$State(new GenericTreeElementsViewModel.Loaded(EmptyList.INSTANCE, new GenericTreeElementsViewModel.Loaded.Error("failed to load generic tree elements.")), squareLoyaltyDetailsPresenter$State.toolbarTitle, squareLoyaltyDetailsPresenter$State.alwaysShowToolbarTitle));
                }
                return Unit.INSTANCE;
            case 15:
                CoroutineSingletons coroutineSingletons21 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i23 = this.label;
                if (i23 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    WorkHomePresenter workHomePresenter = (WorkHomePresenter) this.this$0;
                    RealGenericTreeElementsRepo realGenericTreeElementsRepo2 = (RealGenericTreeElementsRepo) workHomePresenter.titleBarPresenter;
                    SquareLoyaltySheetScreen squareLoyaltySheetScreen = (SquareLoyaltySheetScreen) workHomePresenter.payPresenter;
                    String str20 = squareLoyaltySheetScreen.gteContext;
                    String str21 = squareLoyaltySheetScreen.merchantToken;
                    this.label = 1;
                    genericElementTree2 = realGenericTreeElementsRepo2.getGenericElementTree(str20, str21, this);
                    if (genericElementTree2 == coroutineSingletons21) {
                        return coroutineSingletons21;
                    }
                } else {
                    if (i23 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    genericElementTree2 = obj;
                }
                ApiResult apiResult4 = (ApiResult) genericElementTree2;
                if (apiResult4 instanceof ApiResult.Success) {
                    ((MutableState) this.$locationViewModel$delegate).setValue((GenericTreeElementsData) ((ApiResult.Success) apiResult4).response);
                } else {
                    if (!(apiResult4 instanceof ApiResult.Failure)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    MutableState mutableState4 = (MutableState) obj4;
                    mutableState4.setValue(new SquareLoyaltySheetPresenter$State(new GenericTreeElementsViewModel.Loaded(EmptyList.INSTANCE, new GenericTreeElementsViewModel.Loaded.Error("failed to load generic tree elements.")), ((SquareLoyaltySheetPresenter$State) mutableState4.getValue()).dismissEvent));
                }
                return Unit.INSTANCE;
            case 16:
                CoroutineScope coroutineScope7 = (CoroutineScope) this.this$0;
                CoroutineSingletons coroutineSingletons22 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i24 = this.label;
                if (i24 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow7 = (Flow) this.$locationViewModel$delegate;
                    OffersFilterGroupSheetPresenter$models$sheet$2$1$1 offersFilterGroupSheetPresenter$models$sheet$2$1$1 = new OffersFilterGroupSheetPresenter$models$sheet$2$1$1(i5, coroutineScope7, (MusicPresenter) obj4);
                    this.this$0 = null;
                    this.label = 1;
                    if (flow7.collect(offersFilterGroupSheetPresenter$models$sheet$2$1$1, this) == coroutineSingletons22) {
                        return coroutineSingletons22;
                    }
                } else {
                    if (i24 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 17:
                ProducerScope producerScope = (ProducerScope) this.this$0;
                CoroutineSingletons coroutineSingletons23 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i25 = this.label;
                if (i25 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    UnleashContext unleashContext = (UnleashContext) this.$locationViewModel$delegate;
                    StateFlow stateFlow = (StateFlow) unleashContext.properties;
                    MusicPresenter$models$1$1 musicPresenter$models$1$1 = new MusicPresenter$models$1$1(producerScope, unleashContext, (String) obj4, (Continuation) null, 5);
                    this.this$0 = null;
                    this.label = 1;
                    if (FlowKt.collectLatest(stateFlow, musicPresenter$models$1$1, this) == coroutineSingletons23) {
                        return coroutineSingletons23;
                    }
                } else {
                    if (i25 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                a$$ExternalSyntheticBUOutline0.m$1("SharedFlow never completes, this call should never return.");
                return null;
            case 18:
                CoroutineScope coroutineScope8 = (CoroutineScope) this.this$0;
                CoroutineSingletons coroutineSingletons24 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i26 = this.label;
                if (i26 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow8 = (Flow) this.$locationViewModel$delegate;
                    OffersDetailsPresenterV2$models$1$1$1 offersDetailsPresenterV2$models$1$1$17 = new OffersDetailsPresenterV2$models$1$1$1(coroutineScope8, (VerifyCheckDialogPresenter) obj4, 19);
                    this.this$0 = null;
                    this.label = 1;
                    if (flow8.collect(offersDetailsPresenterV2$models$1$1$17, this) == coroutineSingletons24) {
                        return coroutineSingletons24;
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
                return invokeSuspend$com$squareup$cash$moneybot$presenters$MoneybotChatHistoryPresenter$models$1$1(obj);
            case 20:
                CoroutineSingletons coroutineSingletons25 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i27 = this.label;
                if (i27 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.label = 1;
                    if (MoneybotChatPresenter.access$displayFeedbackSubmittedToast((MoneybotChatPresenter) this.this$0, ((MoneybotFeedbackAnswer.Submitted) ((MoneybotFeedbackAnswer) this.$locationViewModel$delegate)).messageId, (MessageViewModel.MoneybotMessageViewModel.ThumbState) obj4, this) == coroutineSingletons25) {
                        return coroutineSingletons25;
                    }
                } else {
                    if (i27 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 21:
                return invokeSuspend$com$squareup$cash$moneybot$presenters$MoneybotChatPresenter$models$4$1(obj);
            case 22:
                return invokeSuspend$com$squareup$cash$moneybot$presenters$MoneybotChatPresenter$models$8$1$1(obj);
            case 23:
                return invokeSuspend$com$squareup$cash$moneybot$presenters$MoneybotChatPresenter$models$chatSessionState$2$1(obj);
            case 24:
                return invokeSuspend$com$squareup$cash$moneybot$presenters$MoneybotChatPresenter$processChatEvent$2$1(obj);
            case 25:
                return invokeSuspend$com$squareup$cash$moneybot$presenters$MoneybotDebugOverlayPresenter$models$$inlined$CollectEffect$1(obj);
            case 26:
                return invokeSuspend$com$squareup$cash$moneybot$presenters$MoneybotHomePresenter$processEvent$5(obj);
            case 27:
                return invokeSuspend$com$squareup$cash$moneybot$presenters$MoneybotOverflowMenuPresenter$deleteSession$1(obj);
            case 28:
                return invokeSuspend$com$squareup$cash$moneybot$presenters$MoneybotOverflowMenuPresenter$models$2$1(obj);
            default:
                CoroutineScope coroutineScope9 = (CoroutineScope) this.this$0;
                CoroutineSingletons coroutineSingletons26 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i28 = this.label;
                if (i28 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow9 = (Flow) this.$locationViewModel$delegate;
                    OffersFilterGroupSheetPresenter$models$sheet$2$1$1 offersFilterGroupSheetPresenter$models$sheet$2$1$12 = new OffersFilterGroupSheetPresenter$models$sheet$2$1$1(i4, coroutineScope9, (MusicPresenter) obj4);
                    this.this$0 = null;
                    this.label = 1;
                    if (flow9.collect(offersFilterGroupSheetPresenter$models$sheet$2$1$12, this) == coroutineSingletons26) {
                        return coroutineSingletons26;
                    }
                } else {
                    if (i28 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CashMapPresenter$models$3$1(MoleculePresenter moleculePresenter, MutableState mutableState, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = moleculePresenter;
        this.$hasLocationPermission$delegate = mutableState;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CashMapPresenter$models$3$1(RealLimitsStore realLimitsStore, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = 3;
        this.$hasLocationPermission$delegate = realLimitsStore;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CashMapPresenter$models$3$1(Object obj, Object obj2, Object obj3, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = obj;
        this.$locationViewModel$delegate = obj2;
        this.$hasLocationPermission$delegate = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CashMapPresenter$models$3$1(Object obj, Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$locationViewModel$delegate = obj;
        this.$hasLocationPermission$delegate = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CashMapPresenter$models$3$1(Flow flow, Continuation continuation, MoleculePresenter moleculePresenter, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$locationViewModel$delegate = flow;
        this.$hasLocationPermission$delegate = moleculePresenter;
    }
}
