package com.squareup.cash.sharesheet;

import androidx.compose.foundation.gestures.PressGestureScope;
import androidx.compose.runtime.State;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.SpanStyle;
import androidx.media3.common.util.StuckPlayerDetector;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.util.DBUtil;
import androidx.webkit.internal.WebViewGlueCommunicator;
import app.cash.badging.backend.FinishSetupTileBadgeCounter;
import app.cash.badging.backend.RealBadger2$setup$lambda$0$$inlined$mapNotNull$1;
import app.cash.local.backend.real.LocalInMemoryDatabase;
import app.cash.local.primitives.BrandSpot;
import app.cash.passcode.backend.AppLockMonitor$special$$inlined$map$2;
import app.cash.passcode.presenters.EndAppLockPresenter;
import app.cash.sqldelight.coroutines.FlowQuery$mapToList$$inlined$map$1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.fidesmo.sec.delivery.ServiceDeliveryClient;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.google.mlkit.vision.face.FaceDetection;
import com.google.zxing.BinaryBitmap;
import com.knotapi.knot.utilities.BreadcrumbHelper;
import com.squareup.cash.R;
import com.squareup.cash.account.settings.viewmodels.ProfilePrivacyViewEvent;
import com.squareup.cash.activity.backend.ActivityItem;
import com.squareup.cash.activity.backend.loader.Activities;
import com.squareup.cash.activity.backend.loader.LoadingState;
import com.squareup.cash.badging.db.BadgeQueries$VersionQuery;
import com.squareup.cash.banking.real.RealDisclosureProvider$special$$inlined$map$1;
import com.squareup.cash.blockers.presenters.StatusResultPresenter;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.boost.backend.RealBoostProvider;
import com.squareup.cash.boost.db.RewardSlotQueries;
import com.squareup.cash.card.onboarding.CardModelView;
import com.squareup.cash.card.onboarding.CardModelView$getActiveHeat$2$2;
import com.squareup.cash.card.onboarding.CardPreviewPresenter;
import com.squareup.cash.card.onboarding.CardPreviewViewEvent;
import com.squareup.cash.card.onboarding.CardPreviewViewModel;
import com.squareup.cash.card.onboarding.RealCardDetailsCreator;
import com.squareup.cash.card.onboarding.StyledCardViewModelKt;
import com.squareup.cash.card.onboarding.db.CardStudio;
import com.squareup.cash.card.onboarding.screens.CardPreviewScreen;
import com.squareup.cash.cdf.cashcard.CashCardOrderTap;
import com.squareup.cash.cdf.moneybot.MoneybotMessageClientReceive;
import com.squareup.cash.checks.CaptureCheckFacePresenter$models$2$1$1;
import com.squareup.cash.clientsync.readers.AndroidSyncValueSpecs;
import com.squareup.cash.clientsync.readers.SyncValueReader;
import com.squareup.cash.common.messaging.screens.FailureMessageBlockerScreen;
import com.squareup.cash.composeUi.foundation.text.HighlightedLink;
import com.squareup.cash.composeUi.foundation.text.LinkTapDetectorState;
import com.squareup.cash.crypto.backend.performance.RealBitcoinPerformanceDataRepo;
import com.squareup.cash.data.blockers.BlockersHelper;
import com.squareup.cash.data.blockers.RealBlockersHelper;
import com.squareup.cash.data.blockers.RealBlockersHelper$skipBlocker$1;
import com.squareup.cash.data.contacts.RealContactRepository$recents$$inlined$mapItems$1;
import com.squareup.cash.data.contacts.RealContactSync$syncRequest$2;
import com.squareup.cash.data.js.ZiplineHistoryDataJavaScripter;
import com.squareup.cash.data.profile.PublicProfile;
import com.squareup.cash.data.profile.RealProfileManager;
import com.squareup.cash.db.db.CashAccountDatabaseImpl;
import com.squareup.cash.db2.entities.PaymentQueries;
import com.squareup.cash.db2.entities.PaymentQueries$$ExternalSyntheticLambda3;
import com.squareup.cash.db2.entities.PaymentQueries$forToken$2;
import com.squareup.cash.family.applets.data.FormattedTimestamp;
import com.squareup.cash.family.applets.data.RealFamilyAppletTileRepository;
import com.squareup.cash.fidesmo.api.FidesmoDeviceState;
import com.squareup.cash.fidesmo.api.FidesmoProvisioningError;
import com.squareup.cash.fidesmo.real.RealFidesmoClient;
import com.squareup.cash.formview.components.FormCashtag$8$invokeSuspend$$inlined$map$1;
import com.squareup.cash.google.pay.RealGooglePayer$createWallet$$inlined$map$1;
import com.squareup.cash.graphics.swampgl.GLThread$start$2;
import com.squareup.cash.graphics.swampgl.components.Transform$special$$inlined$map$1;
import com.squareup.cash.history.backend.real.RealLegacyActivityEntityManager;
import com.squareup.cash.history.navigation.PaymentActionHandler;
import com.squareup.cash.history.presenters.RealActivityInvitePresenter;
import com.squareup.cash.investing.backend.real.PersistentHistoricalDataCache;
import com.squareup.cash.investing.backend.real.RealInvestingHistoricalData;
import com.squareup.cash.investing.backend.real.RealInvestingHistoricalData$bitcoin$1$bitcoinData$2;
import com.squareup.cash.investing.backend.real.RealInvestmentEntitiesKt;
import com.squareup.cash.investing.backend.real.metrics.RealInvestingMetrics;
import com.squareup.cash.investing.db.InvestingPortfolioGraphCacheQueries$$ExternalSyntheticLambda4;
import com.squareup.cash.investing.db.InvestingPortfolioGraphCacheQueries$bitcoin$2;
import com.squareup.cash.investing.db.InvestmentEntityQueries;
import com.squareup.cash.investing.primitives.InvestmentEntityToken;
import com.squareup.cash.invitations.InviteContactsPresenter$includingEmail$$inlined$map$1;
import com.squareup.cash.invitations.InviteContactsPresenter$special$$inlined$map$1;
import com.squareup.cash.moneybot.backend.api.managers.ChatSession;
import com.squareup.cash.moneybot.backend.api.managers.ChatSessionError;
import com.squareup.cash.moneybot.backend.api.model.chat.Chat;
import com.squareup.cash.moneybot.backend.api.model.chat.Message;
import com.squareup.cash.moneybot.backend.api.model.chat.MessageList;
import com.squareup.cash.moneybot.presenters.MoneybotChatPresenter;
import com.squareup.cash.moneybot.viewmodels.chat.MoneybotChatViewModel;
import com.squareup.cash.nearby.views.DotGridKt$DotGrid$3$1;
import com.squareup.cash.observability.backend.real.RealObservabilityManager;
import com.squareup.cash.payments.backend.api.PaymentAction;
import com.squareup.cash.payments.backend.api.RenderedPayment;
import com.squareup.cash.payments.presenters.NearbyPayRequestPresenter$models$10$1$1$1;
import com.squareup.cash.payments.views.QuickPayViewKt$QuickPay$1$1$1$2$1$3$1;
import com.squareup.cash.permissions.AndroidPermissionChecker$granted$$inlined$map$2$2;
import com.squareup.cash.phoneplans.WirelessProviderListPresenter$models$1$1$1;
import com.squareup.cash.profile.presenters.ProfilePrivacyPresenter;
import com.squareup.cash.recipients.backend.api.RecipientSearchResults;
import com.squareup.cash.recipients.backend.real.RealSuggestedRecipientsVendor;
import com.squareup.cash.recipients.data.RealRecipientRepository;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.savings.backend.api.model.SavingsFolder;
import com.squareup.cash.savings.backend.real.PersistentActiveGoalStore;
import com.squareup.cash.sharesheet.RealShareTargetsManager$TargetPreparationState;
import com.squareup.cash.sharesheet.ShareTargetsManager$ShareResult;
import com.squareup.cash.support.backend.api.SupportActivityItemLoader;
import com.squareup.cash.util.money.CurrencyConverter$Factory;
import com.squareup.cash.util.money.RealCurrencyConverter;
import com.squareup.cash.wallet.roundups.CardsRoundUpsItemViewModel;
import com.squareup.cash.work.data.api.AssignedJobProviderKt$jobs$$inlined$map$1;
import com.squareup.cash.work.data.real.RealAssignedJobProvider;
import com.squareup.cash.work.data.real.RealAssignedJobProvider$getMerchantMemberships$lambda$0$$inlined$map$1$2;
import com.squareup.cash.work.data.real.RealGetClockInControlsUseCase;
import com.squareup.cash.work.data.real.RealGetClockInControlsUseCase$getControls$1$1;
import com.squareup.cash.work.data.real.RealTeamMemberIdProvider;
import com.squareup.cash.work.identifiers.MerchantIdentifier;
import com.squareup.cash.work.identifiers.PersonIdentifier;
import com.squareup.cash.work.presenters.WorkReviewTermsBanner$configFlow$$inlined$map$1;
import com.squareup.cash.work.tinygraph.models.EntityType;
import com.squareup.cash.work.tinygraph.real.RealMembershipRepository;
import com.squareup.cash.work.tinygraph.real.RealMerchantRepository;
import com.squareup.kotterknife.Lazy;
import com.squareup.protos.cash.activity.api.v1.ActivityRowSection;
import com.squareup.protos.cash.cashbusinessaccounts.KybEligibilityWarning;
import com.squareup.protos.cash.investautomator.model.Automation;
import com.squareup.protos.cash.kgoose.api.v3.ChatSessionStatus;
import com.squareup.protos.cash.marketdata.model.InvestmentEntityStats;
import com.squareup.protos.cash.marketdata.server.GetInvestingMetricsResponse;
import com.squareup.protos.cash.marketprices.service.GetInvestmentEntityHistoricalDataResponse;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.franklin.api.ClientScenario;
import com.squareup.protos.franklin.app.GetHistoricalExchangeDataRequest;
import com.squareup.protos.franklin.app.SetCardCustomizationRequest;
import com.squareup.protos.franklin.cards.CardCustomizationData;
import com.squareup.protos.franklin.cards.CardTheme;
import com.squareup.protos.franklin.cards.TouchData;
import com.squareup.protos.franklin.common.RoundUpsElement;
import com.squareup.protos.franklin.common.SuggestedRecipientsData;
import com.squareup.protos.franklin.investing.common.HistoricalRange;
import com.squareup.protos.franklin.ui.UiInvestingAutomation;
import com.squareup.util.cash.Countries;
import com.squareup.util.coroutines.FlowExtensionsKt$combine$$inlined$combine$1;
import com.squareup.util.coroutines.FlowExtensionsKt$doOnFirst$$inlined$map$1;
import com.squareup.util.coroutines.StateFlowKt;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import io.noties.markwon.MarkwonConfiguration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.NotImplementedError;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.collections.SetsKt___SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.channels.ProducerCoroutine;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.flow.EmptyFlow;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapConcat$$inlined$map$1;
import kotlinx.coroutines.flow.FlowKt__MergeKt$flattenConcat$1$1;
import kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.FlowKt__ZipKt$combine$1$1;
import kotlinx.coroutines.flow.FlowKt__ZipKt$nullArrayFactory$1;
import kotlinx.coroutines.flow.SafeFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest;
import kotlinx.coroutines.flow.internal.CombineKt;
import okhttp3.internal.publicsuffix.AssetPublicSuffixList;
import okio.ByteString;
import papa.SafeTrace;
import timber.log.Timber;

/* loaded from: classes6.dex */
public final class RealShareTargetsManager$shareTo$$inlined$flatMapLatest$1 extends SuspendLambda implements Function3 {
    public final /* synthetic */ int $r8$classId;
    public /* synthetic */ Object $target$inlined;
    public Object L$0;
    public /* synthetic */ Object L$1;
    public int label;
    public final /* synthetic */ Object this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealShareTargetsManager$shareTo$$inlined$flatMapLatest$1(RealFidesmoClient realFidesmoClient, ServiceDeliveryClient serviceDeliveryClient, ProducerScope producerScope, Continuation continuation) {
        super(3, continuation);
        this.$r8$classId = 11;
        this.L$1 = realFidesmoClient;
        this.$target$inlined = serviceDeliveryClient;
        this.this$0 = producerScope;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v23, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v10, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v5, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r8v6 */
    private final Object invokeSuspend$com$squareup$cash$moneybot$presenters$MoneybotChatPresenter$models$chatSessionState$2$1$1(Object obj) {
        ?? r6;
        ?? r8;
        List list;
        List list2;
        List list3;
        List list4;
        ChatSessionStatus chatSessionStatus;
        MoneybotChatPresenter moneybotChatPresenter = (MoneybotChatPresenter) this.this$0;
        ChatSession chatSession = (ChatSession) this.L$1;
        ChatSession chatSession2 = (ChatSession) this.$target$inlined;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        Chat chat = null;
        if (i != 0) {
            if (i != 1) {
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ChatSession chatSession3 = (ChatSession) this.L$0;
            SafeTrace.throwOnFailure(obj);
            return chatSession3;
        }
        SafeTrace.throwOnFailure(obj);
        String sessionId = chatSession2.getSessionId();
        Chat chat2 = chatSession.getChat();
        ChatSessionStatus chatSessionStatus2 = chat2 != null ? chat2.status : null;
        Chat chat3 = chatSession2.getChat();
        if (chat3 != null && (chatSessionStatus = chat3.status) != null) {
            boolean z = chatSessionStatus2 == ChatSessionStatus.CHAT_SESSION_STATUS_UNSPECIFIED && chatSessionStatus == ChatSessionStatus.CHAT_SESSION_STATUS_IDLE;
            if (chatSessionStatus2 != chatSessionStatus && !z && chatSessionStatus == ChatSessionStatus.CHAT_SESSION_STATUS_IDLE) {
                moneybotChatPresenter.contentFactory.thinkingTextIndex = 0;
            }
        }
        boolean z2 = chatSession2 instanceof ChatSession.Error;
        if (z2) {
            moneybotChatPresenter.setPendingMessages(EmptyList.INSTANCE);
            moneybotChatPresenter.setStreamingKickoffTexts(EmptySet.INSTANCE);
        }
        if (z2 && !((ChatSession.Error) chatSession2).error.equals(ChatSessionError.StreamingInterrupted.INSTANCE) && (chatSession instanceof ChatSession.Ok)) {
            MoneybotChatViewModel.Content.ToastMessage toastMessage = MoneybotChatViewModel.Content.ToastMessage.RefreshFailed;
            this.L$1 = null;
            this.$target$inlined = null;
            this.L$0 = chatSession2;
            this.label = 1;
            if (moneybotChatPresenter.displayToast(toastMessage, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (z2 && (chatSession instanceof ChatSession.Ok)) {
                ChatSession.Ok ok = (ChatSession.Ok) chatSession;
                Chat chat4 = ((ChatSession.Error) chatSession2).chat;
                AndroidStringManager androidStringManager = moneybotChatPresenter.stringManager;
                if (chat4 != null) {
                    List list5 = chat4.messages;
                    MessageList messageList = (MessageList) CollectionsKt.last(list5);
                    Message message = (Message) CollectionsKt.last((List) messageList);
                    boolean z3 = message instanceof Message.TextMessage;
                    if (z3) {
                        Message.TextMessage textMessage = (Message.TextMessage) message;
                        if (!textMessage.isFinal && textMessage.role == Message.Role.ROLE_ASSISTANT) {
                            chat = Chat.copy$default(chat4, null, CollectionsKt.plus((Iterable) CollectionsKt__CollectionsJVMKt.listOf(MessageList.copy$default(messageList, CollectionsKt.plus((Iterable) CollectionsKt__CollectionsJVMKt.listOf(Message.TextMessage.copy$default(textMessage, textMessage.text + androidStringManager.get(R.string.moneybot_streaming_error), true)), (Collection) CollectionsKt.dropLast(1, messageList)))), (Collection) CollectionsKt.dropLast(1, list5)), null, ChatSessionStatus.CHAT_SESSION_STATUS_IDLE, null, 21);
                        }
                    }
                    chat = (z3 && ((Message.TextMessage) message).role == Message.Role.ROLE_USER) ? Chat.copy$default(chat4, null, CollectionsKt.plus((Iterable) CollectionsKt__CollectionsJVMKt.listOf(new MessageList(null, null, CollectionsKt__CollectionsJVMKt.listOf(new Message.TextMessage(null, Message.Role.ROLE_ASSISTANT, Long.valueOf(moneybotChatPresenter.clock.millis()), androidStringManager.get(R.string.moneybot_streaming_error), true, false, 32)))), (Collection) list5), null, ChatSessionStatus.CHAT_SESSION_STATUS_IDLE, null, 21) : chat4;
                }
                return new ChatSession.Ok(chat, ok.sessionId, ok.isWaitingForResponse);
            }
            if (chatSession2 instanceof ChatSession.Ok) {
                Chat chat5 = ((ChatSession.Ok) chatSession2).chat;
                Chat chat6 = chatSession.getChat();
                if (chat6 == null || (list4 = chat6.messages) == null) {
                    r6 = EmptyList.INSTANCE;
                } else {
                    ArrayList flatten = CollectionsKt__IterablesKt.flatten(list4);
                    r6 = new ArrayList();
                    Iterator it = flatten.iterator();
                    while (it.hasNext()) {
                        Object next = it.next();
                        if (((Message) next).getRole() != Message.Role.ROLE_SYSTEM) {
                            r6.add(next);
                        }
                    }
                }
                ArrayList arrayList = new ArrayList();
                Iterator it2 = ((Iterable) r6).iterator();
                while (it2.hasNext()) {
                    String messageId = ((Message) it2.next()).getMessageId();
                    if (messageId != null) {
                        arrayList.add(messageId);
                    }
                }
                Set set = CollectionsKt.toSet(arrayList);
                if (chat5 == null || (list3 = chat5.messages) == null) {
                    r8 = EmptyList.INSTANCE;
                } else {
                    ArrayList flatten2 = CollectionsKt__IterablesKt.flatten(list3);
                    r8 = new ArrayList();
                    Iterator it3 = flatten2.iterator();
                    while (it3.hasNext()) {
                        Object next2 = it3.next();
                        if (((Message) next2).getRole() != Message.Role.ROLE_SYSTEM) {
                            r8.add(next2);
                        }
                    }
                }
                Iterable iterable = (Iterable) r8;
                ArrayList arrayList2 = new ArrayList();
                Iterator it4 = iterable.iterator();
                while (it4.hasNext()) {
                    String messageId2 = ((Message) it4.next()).getMessageId();
                    if (messageId2 != null) {
                        arrayList2.add(messageId2);
                    }
                }
                Set minus = SetsKt___SetsKt.minus(CollectionsKt.toSet(arrayList2), (Iterable) set);
                ArrayList arrayList3 = new ArrayList();
                for (Object obj2 : iterable) {
                    Message message2 = (Message) obj2;
                    if (CollectionsKt.contains(minus, message2.getMessageId()) && !message2.getHiddenByServer() && (((message2 instanceof Message.TextMessage) && ((Message.TextMessage) message2).role == Message.Role.ROLE_ASSISTANT) || ((message2 instanceof Message.ToolResponse) && !((Message.ToolResponse) message2).results.isEmpty()))) {
                        arrayList3.add(obj2);
                    }
                }
                if (!arrayList3.isEmpty()) {
                    moneybotChatPresenter.analyticsService.analytics.track(new MoneybotMessageClientReceive(sessionId, ((Message) CollectionsKt.last((List) arrayList3)).getMessageId()), null);
                }
                Chat chat7 = chatSession.getChat();
                Iterable flatten3 = (chat7 == null || (list2 = chat7.messages) == null) ? EmptyList.INSTANCE : CollectionsKt__IterablesKt.flatten(list2);
                Iterable flatten4 = (chat5 == null || (list = chat5.messages) == null) ? EmptyList.INSTANCE : CollectionsKt__IterablesKt.flatten(list);
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                Iterator it5 = flatten3.iterator();
                while (it5.hasNext()) {
                    String messageId3 = ((Message) it5.next()).getMessageId();
                    if (messageId3 != null) {
                        linkedHashSet.add(messageId3);
                    }
                }
                Iterable iterable2 = flatten4;
                LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                Iterator it6 = iterable2.iterator();
                while (it6.hasNext()) {
                    String messageId4 = ((Message) it6.next()).getMessageId();
                    if (messageId4 != null) {
                        linkedHashSet2.add(messageId4);
                    }
                }
                Set minus2 = SetsKt___SetsKt.minus((Set) linkedHashSet2, (Iterable) linkedHashSet);
                ArrayList arrayList4 = new ArrayList();
                for (Object obj3 : iterable2) {
                    if (CollectionsKt.contains(minus2, ((Message) obj3).getMessageId())) {
                        arrayList4.add(obj3);
                    }
                }
                if (!arrayList4.isEmpty() && !moneybotChatPresenter.getPendingMessages().isEmpty()) {
                    moneybotChatPresenter.setPendingMessages(EmptyList.INSTANCE);
                    return chatSession2;
                }
            } else if ((chatSession2 instanceof ChatSession.NotInitialized) && moneybotChatPresenter.getDidClickStartNewChat().value != null) {
                return new ChatSession.Ok(null, null, false);
            }
        }
        return chatSession2;
    }

    private final Object invokeSuspend$com$squareup$cash$support$views$article$ArticleActivityItemRowKt$ArticleActivityItemRow$lambda$1$$inlined$flatMapLatest$1(Object obj) {
        FlowCollector flowCollector = (FlowCollector) this.L$0;
        Object obj2 = this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            Flow loadItem = ((SupportActivityItemLoader) this.$target$inlined).loadItem((String) this.this$0);
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            if (FlowKt.emitAll(flowCollector, loadItem, this) == coroutineSingletons) {
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

    private final Object invokeSuspend$com$squareup$cash$transactionpicker$presenters$RealTransactionLoader$getViewModels$1$1$1(Object obj) {
        FlowCollector flowCollector = (FlowCollector) this.L$0;
        Throwable th = (Throwable) this.L$1;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        Continuation continuation = null;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            Timber.Forest.e("Could not load activities with regex null", new Object[0], th);
            MarkwonConfiguration markwonConfiguration = (MarkwonConfiguration) this.$target$inlined;
            ZiplineHistoryDataJavaScripter ziplineHistoryDataJavaScripter = (ZiplineHistoryDataJavaScripter) this.this$0;
            RealShareTargetsManager$addSmsTarget$$inlined$map$1 transactions = markwonConfiguration.getTransactions(ziplineHistoryDataJavaScripter, true);
            RealShareTargetsManager$addSmsTarget$$inlined$map$1 transactions2 = markwonConfiguration.getTransactions(ziplineHistoryDataJavaScripter, false);
            CardModelView.AnonymousClass1.AnonymousClass4 anonymousClass4 = new CardModelView.AnonymousClass1.AnonymousClass4(3, continuation, 17);
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            FlowKt.ensureActive(flowCollector);
            Object combineInternal = CombineKt.combineInternal(this, FlowKt__ZipKt$nullArrayFactory$1.INSTANCE, new FlowKt__ZipKt$combine$1$1(anonymousClass4, continuation, 0), flowCollector, new Flow[]{transactions, transactions2});
            if (combineInternal != CoroutineSingletons.COROUTINE_SUSPENDED) {
                combineInternal = Unit.INSTANCE;
            }
            if (combineInternal != CoroutineSingletons.COROUTINE_SUSPENDED) {
                combineInternal = Unit.INSTANCE;
            }
            if (combineInternal == obj2) {
                return obj2;
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

    private final Object invokeSuspend$com$squareup$cash$work$data$real$RealAssignedJobProvider$getMerchantMemberships$$inlined$flatMapLatest$1(Object obj) {
        FlowCollector flowCollector = (FlowCollector) this.L$0;
        Object obj2 = this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            ChannelFlowTransformLatest memberships$default = RealMembershipRepository.getMemberships$default(((RealAssignedJobProvider) this.$target$inlined).membershipRepository, EntityType.JOB, EntityType.PERSON_WRAPPER, (String) this.this$0);
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            FlowKt.ensureActive(flowCollector);
            Object collect = memberships$default.collect(new RealAssignedJobProvider$getMerchantMemberships$lambda$0$$inlined$map$1$2(flowCollector, (MerchantIdentifier) obj2, 0), this);
            if (collect != coroutineSingletons) {
                collect = Unit.INSTANCE;
            }
            if (collect != coroutineSingletons) {
                collect = Unit.INSTANCE;
            }
            if (collect == coroutineSingletons) {
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

    private final Object invokeSuspend$com$squareup$cash$work$data$real$RealGetClockInControlsUseCase$getControls$$inlined$flatMapLatest$1(Object obj) {
        Flow distinctUntilChanged;
        final RealGetClockInControlsUseCase realGetClockInControlsUseCase = (RealGetClockInControlsUseCase) this.$target$inlined;
        FlowCollector flowCollector = (FlowCollector) this.L$0;
        Object obj2 = this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        final int i2 = 1;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            RealMerchantRepository realMerchantRepository = realGetClockInControlsUseCase.merchantRepository;
            String str = ((MerchantIdentifier) obj2).entityId;
            final FlowKt__MergeKt$flatMapConcat$$inlined$map$1 flowKt__MergeKt$flatMapConcat$$inlined$map$1 = (FlowKt__MergeKt$flatMapConcat$$inlined$map$1) realMerchantRepository.getById(str);
            Flow flow = new Flow() { // from class: com.squareup.cash.work.data.real.RealGetClockInControlsUseCase$getOverridePermission$$inlined$map$1
                @Override // kotlinx.coroutines.flow.Flow
                public final Object collect(FlowCollector flowCollector2, Continuation continuation) {
                    int i3 = i2;
                    RealGetClockInControlsUseCase realGetClockInControlsUseCase2 = realGetClockInControlsUseCase;
                    FlowKt__MergeKt$flatMapConcat$$inlined$map$1 flowKt__MergeKt$flatMapConcat$$inlined$map$12 = flowKt__MergeKt$flatMapConcat$$inlined$map$1;
                    switch (i3) {
                        case 0:
                            Object collect = flowKt__MergeKt$flatMapConcat$$inlined$map$12.collect(new AssignedJobProviderKt$jobs$$inlined$map$1.AnonymousClass2(flowCollector2, realGetClockInControlsUseCase2), continuation);
                            if (collect != CoroutineSingletons.COROUTINE_SUSPENDED) {
                                break;
                            }
                            break;
                        default:
                            Object collect2 = flowKt__MergeKt$flatMapConcat$$inlined$map$12.collect(new FlowExtensionsKt$doOnFirst$$inlined$map$1.AnonymousClass2(flowCollector2, realGetClockInControlsUseCase2, 2), continuation);
                            if (collect2 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                                break;
                            }
                            break;
                    }
                    return Unit.INSTANCE;
                }
            };
            FlowExtensionsKt$combine$$inlined$combine$1 flowExtensionsKt$combine$$inlined$combine$1 = new FlowExtensionsKt$combine$$inlined$combine$1(14, realGetClockInControlsUseCase.settingRepository.getAllByMerchantId(str), realGetClockInControlsUseCase);
            PersonIdentifier personIdentifier = realGetClockInControlsUseCase.currentUserProvider.getPersonIdentifier();
            if (personIdentifier == null) {
                distinctUntilChanged = new AppLockMonitor$special$$inlined$map$2(Boolean.FALSE, 19);
            } else {
                final FlowKt__MergeKt$flatMapConcat$$inlined$map$1 membership = realGetClockInControlsUseCase.membershipRepository.getMembership(EntityType.MERCHANT_WRAPPER, str, EntityType.PERSON_WRAPPER, personIdentifier.entityId);
                final int i3 = 0;
                distinctUntilChanged = FlowKt.distinctUntilChanged(new Flow() { // from class: com.squareup.cash.work.data.real.RealGetClockInControlsUseCase$getOverridePermission$$inlined$map$1
                    @Override // kotlinx.coroutines.flow.Flow
                    public final Object collect(FlowCollector flowCollector2, Continuation continuation) {
                        int i32 = i3;
                        RealGetClockInControlsUseCase realGetClockInControlsUseCase2 = realGetClockInControlsUseCase;
                        FlowKt__MergeKt$flatMapConcat$$inlined$map$1 flowKt__MergeKt$flatMapConcat$$inlined$map$12 = membership;
                        switch (i32) {
                            case 0:
                                Object collect = flowKt__MergeKt$flatMapConcat$$inlined$map$12.collect(new AssignedJobProviderKt$jobs$$inlined$map$1.AnonymousClass2(flowCollector2, realGetClockInControlsUseCase2), continuation);
                                if (collect != CoroutineSingletons.COROUTINE_SUSPENDED) {
                                    break;
                                }
                                break;
                            default:
                                Object collect2 = flowKt__MergeKt$flatMapConcat$$inlined$map$12.collect(new FlowExtensionsKt$doOnFirst$$inlined$map$1.AnonymousClass2(flowCollector2, realGetClockInControlsUseCase2, 2), continuation);
                                if (collect2 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                                    break;
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                });
            }
            FinishSetupTileBadgeCounter combine = FlowKt.combine(flow, flowExtensionsKt$combine$$inlined$combine$1, distinctUntilChanged, new RealGetClockInControlsUseCase$getControls$1$1(realGetClockInControlsUseCase, (Instant) this.this$0, null));
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            if (FlowKt.emitAll(flowCollector, combine, this) == coroutineSingletons) {
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

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.$r8$classId;
        Object obj4 = this.this$0;
        switch (i) {
            case 0:
                RealShareTargetsManager$shareTo$$inlined$flatMapLatest$1 realShareTargetsManager$shareTo$$inlined$flatMapLatest$1 = new RealShareTargetsManager$shareTo$$inlined$flatMapLatest$1((Continuation) obj3, (ShareTarget) this.$target$inlined, (StuckPlayerDetector) obj4, 0);
                realShareTargetsManager$shareTo$$inlined$flatMapLatest$1.L$0 = (FlowCollector) obj;
                realShareTargetsManager$shareTo$$inlined$flatMapLatest$1.L$1 = obj2;
                return realShareTargetsManager$shareTo$$inlined$flatMapLatest$1.invokeSuspend(Unit.INSTANCE);
            case 1:
                RealShareTargetsManager$shareTo$$inlined$flatMapLatest$1 realShareTargetsManager$shareTo$$inlined$flatMapLatest$12 = new RealShareTargetsManager$shareTo$$inlined$flatMapLatest$1((Continuation) obj3, (LocalInMemoryDatabase) this.$target$inlined, (BrandSpot) obj4, 1);
                realShareTargetsManager$shareTo$$inlined$flatMapLatest$12.L$0 = (FlowCollector) obj;
                realShareTargetsManager$shareTo$$inlined$flatMapLatest$12.L$1 = obj2;
                return realShareTargetsManager$shareTo$$inlined$flatMapLatest$12.invokeSuspend(Unit.INSTANCE);
            case 2:
                RealShareTargetsManager$shareTo$$inlined$flatMapLatest$1 realShareTargetsManager$shareTo$$inlined$flatMapLatest$13 = new RealShareTargetsManager$shareTo$$inlined$flatMapLatest$1((Continuation) obj3, (EndAppLockPresenter) this.$target$inlined, (ClientScenario) obj4, 2);
                realShareTargetsManager$shareTo$$inlined$flatMapLatest$13.L$0 = (FlowCollector) obj;
                realShareTargetsManager$shareTo$$inlined$flatMapLatest$13.L$1 = obj2;
                return realShareTargetsManager$shareTo$$inlined$flatMapLatest$13.invokeSuspend(Unit.INSTANCE);
            case 3:
                RealShareTargetsManager$shareTo$$inlined$flatMapLatest$1 realShareTargetsManager$shareTo$$inlined$flatMapLatest$14 = new RealShareTargetsManager$shareTo$$inlined$flatMapLatest$1((Continuation) obj3, (QuickPayViewKt$QuickPay$1$1$1$2$1$3$1) this.$target$inlined, (StatusResultPresenter) obj4, 3);
                realShareTargetsManager$shareTo$$inlined$flatMapLatest$14.L$0 = (FlowCollector) obj;
                realShareTargetsManager$shareTo$$inlined$flatMapLatest$14.L$1 = obj2;
                return realShareTargetsManager$shareTo$$inlined$flatMapLatest$14.invokeSuspend(Unit.INSTANCE);
            case 4:
                RealShareTargetsManager$shareTo$$inlined$flatMapLatest$1 realShareTargetsManager$shareTo$$inlined$flatMapLatest$15 = new RealShareTargetsManager$shareTo$$inlined$flatMapLatest$1((Continuation) obj3, (RealBoostProvider) this.$target$inlined, (FlowQuery$mapToList$$inlined$map$1) obj4, 4);
                realShareTargetsManager$shareTo$$inlined$flatMapLatest$15.L$0 = (FlowCollector) obj;
                realShareTargetsManager$shareTo$$inlined$flatMapLatest$15.L$1 = obj2;
                return realShareTargetsManager$shareTo$$inlined$flatMapLatest$15.invokeSuspend(Unit.INSTANCE);
            case 5:
                RealShareTargetsManager$shareTo$$inlined$flatMapLatest$1 realShareTargetsManager$shareTo$$inlined$flatMapLatest$16 = new RealShareTargetsManager$shareTo$$inlined$flatMapLatest$1((Continuation) obj3, (RealBoostProvider) this.$target$inlined, (String) obj4, 5);
                realShareTargetsManager$shareTo$$inlined$flatMapLatest$16.L$0 = (FlowCollector) obj;
                realShareTargetsManager$shareTo$$inlined$flatMapLatest$16.L$1 = obj2;
                return realShareTargetsManager$shareTo$$inlined$flatMapLatest$16.invokeSuspend(Unit.INSTANCE);
            case 6:
                RealShareTargetsManager$shareTo$$inlined$flatMapLatest$1 realShareTargetsManager$shareTo$$inlined$flatMapLatest$17 = new RealShareTargetsManager$shareTo$$inlined$flatMapLatest$1((Continuation) obj3, (BinaryBitmap) this.$target$inlined, (KybEligibilityWarning.RestrictedFeature) obj4, 6);
                realShareTargetsManager$shareTo$$inlined$flatMapLatest$17.L$0 = (FlowCollector) obj;
                realShareTargetsManager$shareTo$$inlined$flatMapLatest$17.L$1 = obj2;
                return realShareTargetsManager$shareTo$$inlined$flatMapLatest$17.invokeSuspend(Unit.INSTANCE);
            case 7:
                RealShareTargetsManager$shareTo$$inlined$flatMapLatest$1 realShareTargetsManager$shareTo$$inlined$flatMapLatest$18 = new RealShareTargetsManager$shareTo$$inlined$flatMapLatest$1((Continuation) obj3, (CardPreviewPresenter) this.$target$inlined, (CardPreviewViewModel) obj4, 7);
                realShareTargetsManager$shareTo$$inlined$flatMapLatest$18.L$0 = (FlowCollector) obj;
                realShareTargetsManager$shareTo$$inlined$flatMapLatest$18.L$1 = obj2;
                return realShareTargetsManager$shareTo$$inlined$flatMapLatest$18.invokeSuspend(Unit.INSTANCE);
            case 8:
                long j = ((Offset) obj2).packedValue;
                RealShareTargetsManager$shareTo$$inlined$flatMapLatest$1 realShareTargetsManager$shareTo$$inlined$flatMapLatest$19 = new RealShareTargetsManager$shareTo$$inlined$flatMapLatest$1((Ref$ObjectRef) this.$target$inlined, (LinkTapDetectorState) obj4, (Continuation) obj3, 8);
                realShareTargetsManager$shareTo$$inlined$flatMapLatest$19.L$1 = (PressGestureScope) obj;
                return realShareTargetsManager$shareTo$$inlined$flatMapLatest$19.invokeSuspend(Unit.INSTANCE);
            case 9:
                RealShareTargetsManager$shareTo$$inlined$flatMapLatest$1 realShareTargetsManager$shareTo$$inlined$flatMapLatest$110 = new RealShareTargetsManager$shareTo$$inlined$flatMapLatest$1((Continuation) obj3, (RealBitcoinPerformanceDataRepo) this.$target$inlined, (CurrencyConverter$Factory) obj4, 9);
                realShareTargetsManager$shareTo$$inlined$flatMapLatest$110.L$0 = (FlowCollector) obj;
                realShareTargetsManager$shareTo$$inlined$flatMapLatest$110.L$1 = obj2;
                return realShareTargetsManager$shareTo$$inlined$flatMapLatest$110.invokeSuspend(Unit.INSTANCE);
            case 10:
                RealShareTargetsManager$shareTo$$inlined$flatMapLatest$1 realShareTargetsManager$shareTo$$inlined$flatMapLatest$111 = new RealShareTargetsManager$shareTo$$inlined$flatMapLatest$1((Continuation) obj3, (List) this.$target$inlined, (RealFamilyAppletTileRepository) obj4, 10);
                realShareTargetsManager$shareTo$$inlined$flatMapLatest$111.L$0 = (FlowCollector) obj;
                realShareTargetsManager$shareTo$$inlined$flatMapLatest$111.L$1 = (Object[]) obj2;
                return realShareTargetsManager$shareTo$$inlined$flatMapLatest$111.invokeSuspend(Unit.INSTANCE);
            case 11:
                RealShareTargetsManager$shareTo$$inlined$flatMapLatest$1 realShareTargetsManager$shareTo$$inlined$flatMapLatest$112 = new RealShareTargetsManager$shareTo$$inlined$flatMapLatest$1((RealFidesmoClient) this.L$1, (ServiceDeliveryClient) this.$target$inlined, (ProducerScope) obj4, (Continuation) obj3);
                realShareTargetsManager$shareTo$$inlined$flatMapLatest$112.L$0 = (Throwable) obj2;
                return realShareTargetsManager$shareTo$$inlined$flatMapLatest$112.invokeSuspend(Unit.INSTANCE);
            case 12:
                RealShareTargetsManager$shareTo$$inlined$flatMapLatest$1 realShareTargetsManager$shareTo$$inlined$flatMapLatest$113 = new RealShareTargetsManager$shareTo$$inlined$flatMapLatest$1((Continuation) obj3, (RealLegacyActivityEntityManager) this.$target$inlined, (String) obj4, 12);
                realShareTargetsManager$shareTo$$inlined$flatMapLatest$113.L$0 = (FlowCollector) obj;
                realShareTargetsManager$shareTo$$inlined$flatMapLatest$113.L$1 = obj2;
                return realShareTargetsManager$shareTo$$inlined$flatMapLatest$113.invokeSuspend(Unit.INSTANCE);
            case 13:
                RealShareTargetsManager$shareTo$$inlined$flatMapLatest$1 realShareTargetsManager$shareTo$$inlined$flatMapLatest$114 = new RealShareTargetsManager$shareTo$$inlined$flatMapLatest$1((Continuation) obj3, (PaymentActionHandler) this.$target$inlined, (PaymentAction.LinkCardAction) obj4, 13);
                realShareTargetsManager$shareTo$$inlined$flatMapLatest$114.L$0 = (FlowCollector) obj;
                realShareTargetsManager$shareTo$$inlined$flatMapLatest$114.L$1 = obj2;
                return realShareTargetsManager$shareTo$$inlined$flatMapLatest$114.invokeSuspend(Unit.INSTANCE);
            case 14:
                RealShareTargetsManager$shareTo$$inlined$flatMapLatest$1 realShareTargetsManager$shareTo$$inlined$flatMapLatest$115 = new RealShareTargetsManager$shareTo$$inlined$flatMapLatest$1((Continuation) obj3, (HistoricalRange) this.$target$inlined, (RealInvestingHistoricalData) obj4, 14);
                realShareTargetsManager$shareTo$$inlined$flatMapLatest$115.L$0 = (FlowCollector) obj;
                realShareTargetsManager$shareTo$$inlined$flatMapLatest$115.L$1 = obj2;
                return realShareTargetsManager$shareTo$$inlined$flatMapLatest$115.invokeSuspend(Unit.INSTANCE);
            case 15:
                RealShareTargetsManager$shareTo$$inlined$flatMapLatest$1 realShareTargetsManager$shareTo$$inlined$flatMapLatest$116 = new RealShareTargetsManager$shareTo$$inlined$flatMapLatest$1((Continuation) obj3, (RealInvestingHistoricalData) this.$target$inlined, (InvestmentEntityToken) obj4, 15);
                realShareTargetsManager$shareTo$$inlined$flatMapLatest$116.L$0 = (FlowCollector) obj;
                realShareTargetsManager$shareTo$$inlined$flatMapLatest$116.L$1 = obj2;
                return realShareTargetsManager$shareTo$$inlined$flatMapLatest$116.invokeSuspend(Unit.INSTANCE);
            case 16:
                RealShareTargetsManager$shareTo$$inlined$flatMapLatest$1 realShareTargetsManager$shareTo$$inlined$flatMapLatest$117 = new RealShareTargetsManager$shareTo$$inlined$flatMapLatest$1((Continuation) obj3, (RealInvestingMetrics) this.$target$inlined, (InvestmentEntityToken) obj4, 16);
                realShareTargetsManager$shareTo$$inlined$flatMapLatest$117.L$0 = (FlowCollector) obj;
                realShareTargetsManager$shareTo$$inlined$flatMapLatest$117.L$1 = obj2;
                return realShareTargetsManager$shareTo$$inlined$flatMapLatest$117.invokeSuspend(Unit.INSTANCE);
            case 17:
                RealShareTargetsManager$shareTo$$inlined$flatMapLatest$1 realShareTargetsManager$shareTo$$inlined$flatMapLatest$118 = new RealShareTargetsManager$shareTo$$inlined$flatMapLatest$1((Continuation) obj3, (MarkwonConfiguration) this.$target$inlined, (RoundUpsElement) obj4, 17);
                realShareTargetsManager$shareTo$$inlined$flatMapLatest$118.L$0 = (FlowCollector) obj;
                realShareTargetsManager$shareTo$$inlined$flatMapLatest$118.L$1 = obj2;
                return realShareTargetsManager$shareTo$$inlined$flatMapLatest$118.invokeSuspend(Unit.INSTANCE);
            case 18:
                RealShareTargetsManager$shareTo$$inlined$flatMapLatest$1 realShareTargetsManager$shareTo$$inlined$flatMapLatest$119 = new RealShareTargetsManager$shareTo$$inlined$flatMapLatest$1((MoneybotChatPresenter) obj4, (Continuation) obj3);
                realShareTargetsManager$shareTo$$inlined$flatMapLatest$119.L$1 = (ChatSession) obj;
                realShareTargetsManager$shareTo$$inlined$flatMapLatest$119.$target$inlined = (ChatSession) obj2;
                return realShareTargetsManager$shareTo$$inlined$flatMapLatest$119.invokeSuspend(Unit.INSTANCE);
            case 19:
                RealShareTargetsManager$shareTo$$inlined$flatMapLatest$1 realShareTargetsManager$shareTo$$inlined$flatMapLatest$120 = new RealShareTargetsManager$shareTo$$inlined$flatMapLatest$1((Continuation) obj3, (ProfilePrivacyPresenter) this.$target$inlined, (State) obj4, 19);
                realShareTargetsManager$shareTo$$inlined$flatMapLatest$120.L$0 = (FlowCollector) obj;
                realShareTargetsManager$shareTo$$inlined$flatMapLatest$120.L$1 = obj2;
                return realShareTargetsManager$shareTo$$inlined$flatMapLatest$120.invokeSuspend(Unit.INSTANCE);
            case 20:
                RealShareTargetsManager$shareTo$$inlined$flatMapLatest$1 realShareTargetsManager$shareTo$$inlined$flatMapLatest$121 = new RealShareTargetsManager$shareTo$$inlined$flatMapLatest$1((Continuation) obj3, (Lazy) this.$target$inlined, (AppLockMonitor$special$$inlined$map$2) obj4, 20);
                realShareTargetsManager$shareTo$$inlined$flatMapLatest$121.L$0 = (FlowCollector) obj;
                realShareTargetsManager$shareTo$$inlined$flatMapLatest$121.L$1 = obj2;
                return realShareTargetsManager$shareTo$$inlined$flatMapLatest$121.invokeSuspend(Unit.INSTANCE);
            case 21:
                RealShareTargetsManager$shareTo$$inlined$flatMapLatest$1 realShareTargetsManager$shareTo$$inlined$flatMapLatest$122 = new RealShareTargetsManager$shareTo$$inlined$flatMapLatest$1((Continuation) obj3, (Flow) this.$target$inlined, (RealSuggestedRecipientsVendor) obj4, 21);
                realShareTargetsManager$shareTo$$inlined$flatMapLatest$122.L$0 = (FlowCollector) obj;
                realShareTargetsManager$shareTo$$inlined$flatMapLatest$122.L$1 = obj2;
                return realShareTargetsManager$shareTo$$inlined$flatMapLatest$122.invokeSuspend(Unit.INSTANCE);
            case 22:
                RealShareTargetsManager$shareTo$$inlined$flatMapLatest$1 realShareTargetsManager$shareTo$$inlined$flatMapLatest$123 = new RealShareTargetsManager$shareTo$$inlined$flatMapLatest$1((Continuation) obj3, (RealSuggestedRecipientsVendor) this.$target$inlined, (SuggestedRecipientsData) obj4, 22);
                realShareTargetsManager$shareTo$$inlined$flatMapLatest$123.L$0 = (FlowCollector) obj;
                realShareTargetsManager$shareTo$$inlined$flatMapLatest$123.L$1 = obj2;
                return realShareTargetsManager$shareTo$$inlined$flatMapLatest$123.invokeSuspend(Unit.INSTANCE);
            case 23:
                RealShareTargetsManager$shareTo$$inlined$flatMapLatest$1 realShareTargetsManager$shareTo$$inlined$flatMapLatest$124 = new RealShareTargetsManager$shareTo$$inlined$flatMapLatest$1((Continuation) obj3, (RealRecipientRepository) this.$target$inlined, (Map) obj4, 23);
                realShareTargetsManager$shareTo$$inlined$flatMapLatest$124.L$0 = (FlowCollector) obj;
                realShareTargetsManager$shareTo$$inlined$flatMapLatest$124.L$1 = obj2;
                return realShareTargetsManager$shareTo$$inlined$flatMapLatest$124.invokeSuspend(Unit.INSTANCE);
            case 24:
                RealShareTargetsManager$shareTo$$inlined$flatMapLatest$1 realShareTargetsManager$shareTo$$inlined$flatMapLatest$125 = new RealShareTargetsManager$shareTo$$inlined$flatMapLatest$1((Continuation) obj3, (PersistentActiveGoalStore) this.$target$inlined, (String) obj4, 24);
                realShareTargetsManager$shareTo$$inlined$flatMapLatest$125.L$0 = (FlowCollector) obj;
                realShareTargetsManager$shareTo$$inlined$flatMapLatest$125.L$1 = obj2;
                return realShareTargetsManager$shareTo$$inlined$flatMapLatest$125.invokeSuspend(Unit.INSTANCE);
            case 25:
                RealShareTargetsManager$shareTo$$inlined$flatMapLatest$1 realShareTargetsManager$shareTo$$inlined$flatMapLatest$126 = new RealShareTargetsManager$shareTo$$inlined$flatMapLatest$1((Continuation) obj3, (SupportActivityItemLoader) this.$target$inlined, (String) obj4, 25);
                realShareTargetsManager$shareTo$$inlined$flatMapLatest$126.L$0 = (FlowCollector) obj;
                realShareTargetsManager$shareTo$$inlined$flatMapLatest$126.L$1 = obj2;
                return realShareTargetsManager$shareTo$$inlined$flatMapLatest$126.invokeSuspend(Unit.INSTANCE);
            case 26:
                RealShareTargetsManager$shareTo$$inlined$flatMapLatest$1 realShareTargetsManager$shareTo$$inlined$flatMapLatest$127 = new RealShareTargetsManager$shareTo$$inlined$flatMapLatest$1((MarkwonConfiguration) this.$target$inlined, (ZiplineHistoryDataJavaScripter) obj4, (Continuation) obj3, 26);
                realShareTargetsManager$shareTo$$inlined$flatMapLatest$127.L$0 = (FlowCollector) obj;
                realShareTargetsManager$shareTo$$inlined$flatMapLatest$127.L$1 = (Throwable) obj2;
                return realShareTargetsManager$shareTo$$inlined$flatMapLatest$127.invokeSuspend(Unit.INSTANCE);
            case 27:
                RealShareTargetsManager$shareTo$$inlined$flatMapLatest$1 realShareTargetsManager$shareTo$$inlined$flatMapLatest$128 = new RealShareTargetsManager$shareTo$$inlined$flatMapLatest$1((Continuation) obj3, (RealAssignedJobProvider) this.$target$inlined, (String) obj4, 27);
                realShareTargetsManager$shareTo$$inlined$flatMapLatest$128.L$0 = (FlowCollector) obj;
                realShareTargetsManager$shareTo$$inlined$flatMapLatest$128.L$1 = obj2;
                return realShareTargetsManager$shareTo$$inlined$flatMapLatest$128.invokeSuspend(Unit.INSTANCE);
            case 28:
                RealShareTargetsManager$shareTo$$inlined$flatMapLatest$1 realShareTargetsManager$shareTo$$inlined$flatMapLatest$129 = new RealShareTargetsManager$shareTo$$inlined$flatMapLatest$1((Continuation) obj3, (RealGetClockInControlsUseCase) this.$target$inlined, (Instant) obj4, 28);
                realShareTargetsManager$shareTo$$inlined$flatMapLatest$129.L$0 = (FlowCollector) obj;
                realShareTargetsManager$shareTo$$inlined$flatMapLatest$129.L$1 = obj2;
                return realShareTargetsManager$shareTo$$inlined$flatMapLatest$129.invokeSuspend(Unit.INSTANCE);
            default:
                RealShareTargetsManager$shareTo$$inlined$flatMapLatest$1 realShareTargetsManager$shareTo$$inlined$flatMapLatest$130 = new RealShareTargetsManager$shareTo$$inlined$flatMapLatest$1((Continuation) obj3, (RealTeamMemberIdProvider) this.$target$inlined, (PersonIdentifier) obj4, 29);
                realShareTargetsManager$shareTo$$inlined$flatMapLatest$130.L$0 = (FlowCollector) obj;
                realShareTargetsManager$shareTo$$inlined$flatMapLatest$130.L$1 = obj2;
                return realShareTargetsManager$shareTo$$inlined$flatMapLatest$130.invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:446:0x0907, code lost:
    
        if (r7 == null) goto L387;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v56 */
    /* JADX WARN: Type inference failed for: r12v57 */
    /* JADX WARN: Type inference failed for: r12v58 */
    /* JADX WARN: Type inference failed for: r12v59 */
    /* JADX WARN: Type inference failed for: r12v60 */
    /* JADX WARN: Type inference failed for: r12v61 */
    /* JADX WARN: Type inference failed for: r12v62 */
    /* JADX WARN: Type inference failed for: r12v63 */
    /* JADX WARN: Type inference failed for: r12v64 */
    /* JADX WARN: Type inference failed for: r12v65 */
    /* JADX WARN: Type inference failed for: r12v66 */
    /* JADX WARN: Type inference failed for: r12v67 */
    /* JADX WARN: Type inference failed for: r5v6, types: [com.squareup.cash.sharesheet.RealShareTargetsManager$addSmsTarget$$inlined$map$1] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        AppLockMonitor$special$$inlined$map$2 appLockMonitor$special$$inlined$map$2;
        AppLockMonitor$special$$inlined$map$2 appLockMonitor$special$$inlined$map$22;
        Flow flow;
        Flow realActivityInvitePresenter;
        boolean z;
        Object obj2;
        LinkTapDetectorState linkTapDetectorState;
        SpanStyle spanStyle;
        Object loaded;
        Instant displayInstant;
        FormattedTimestamp.Loaded loaded2;
        ActivityItem activityItem;
        Flow appLockMonitor$special$$inlined$map$23;
        Automation automation;
        Flow inviteContactsPresenter$special$$inlined$map$1;
        int i = this.$r8$classId;
        int i2 = 16;
        int i3 = 18;
        int i4 = 5;
        int i5 = 3;
        int i6 = 0;
        int i7 = 19;
        Object obj3 = this.this$0;
        Object obj4 = null;
        ?? r12 = 0;
        ?? r122 = 0;
        ?? r123 = 0;
        ?? r124 = 0;
        ?? r125 = 0;
        ?? r126 = 0;
        switch (i) {
            case 0:
                StuckPlayerDetector stuckPlayerDetector = (StuckPlayerDetector) obj3;
                ShareTarget shareTarget = (ShareTarget) this.$target$inlined;
                FlowCollector flowCollector = (FlowCollector) this.L$0;
                Object obj5 = this.L$1;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i8 = this.label;
                if (i8 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    RealShareTargetsManager$TargetPreparationState realShareTargetsManager$TargetPreparationState = (RealShareTargetsManager$TargetPreparationState) obj5;
                    if (realShareTargetsManager$TargetPreparationState instanceof RealShareTargetsManager$TargetPreparationState.Loading) {
                        appLockMonitor$special$$inlined$map$2 = new AppLockMonitor$special$$inlined$map$2(new ShareTargetsManager$ShareResult.Loading(shareTarget.getTitle()), 19);
                    } else if (realShareTargetsManager$TargetPreparationState instanceof RealShareTargetsManager$TargetPreparationState.Ready) {
                        appLockMonitor$special$$inlined$map$2 = new RealShareTargetsManager$addSmsTarget$$inlined$map$1(((RealProfileManager) stuckPlayerDetector.playerListener).currencyCode(), shareTarget, stuckPlayerDetector);
                    } else {
                        if (!(realShareTargetsManager$TargetPreparationState instanceof RealShareTargetsManager$TargetPreparationState.FailedToLoad)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        appLockMonitor$special$$inlined$map$2 = new AppLockMonitor$special$$inlined$map$2(new ShareTargetsManager$ShareResult.Failure(shareTarget.getTitle(), ((RealShareTargetsManager$TargetPreparationState.FailedToLoad) realShareTargetsManager$TargetPreparationState).failureMessage), 19);
                    }
                    this.L$0 = null;
                    this.L$1 = null;
                    this.label = 1;
                    if (FlowKt.emitAll(flowCollector, appLockMonitor$special$$inlined$map$2, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i8 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 1:
                FlowCollector flowCollector2 = (FlowCollector) this.L$0;
                Object obj6 = this.L$1;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i9 = this.label;
                if (i9 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    BrandSpot brandSpot = (BrandSpot) obj6;
                    LinkedHashMap linkedHashMap = ((LocalInMemoryDatabase) this.$target$inlined).brands;
                    if (brandSpot == null) {
                        brandSpot = (BrandSpot) obj3;
                    }
                    Flow distinctUntilChanged = FlowKt.distinctUntilChanged(LocalInMemoryDatabase.getOrPutFlow$default(linkedHashMap, brandSpot));
                    this.L$0 = null;
                    this.L$1 = null;
                    this.label = 1;
                    if (FlowKt.emitAll(flowCollector2, distinctUntilChanged, this) == coroutineSingletons2) {
                        return coroutineSingletons2;
                    }
                } else {
                    if (i9 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 2:
                FlowCollector flowCollector3 = (FlowCollector) this.L$0;
                Object obj7 = this.L$1;
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i10 = this.label;
                if (i10 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    EndAppLockPresenter endAppLockPresenter = (EndAppLockPresenter) this.$target$inlined;
                    RealBlockersHelper realBlockersHelper = (RealBlockersHelper) endAppLockPresenter.accountOutboundNavigator;
                    BlockersScreens.RemoteSkipScreen remoteSkipScreen = (BlockersScreens.RemoteSkipScreen) endAppLockPresenter.navigatorSwitcher;
                    SafeFlow skipBlocker = realBlockersHelper.skipBlocker(remoteSkipScreen.current, remoteSkipScreen.blockersData, (ClientScenario) obj3);
                    this.L$0 = null;
                    this.L$1 = null;
                    this.label = 1;
                    if (FlowKt.emitAll(flowCollector3, skipBlocker, this) == coroutineSingletons3) {
                        return coroutineSingletons3;
                    }
                } else {
                    if (i10 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 3:
                FlowCollector flowCollector4 = (FlowCollector) this.L$0;
                Object obj8 = this.L$1;
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i11 = this.label;
                if (i11 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    BlockersHelper.BlockersAction blockersAction = (BlockersHelper.BlockersAction) obj8;
                    if (blockersAction instanceof BlockersHelper.BlockersAction.ToggleSpinner) {
                        ((QuickPayViewKt$QuickPay$1$1$1$2$1$3$1) this.$target$inlined).invoke();
                        flow = EmptyFlow.INSTANCE;
                    } else {
                        if (blockersAction instanceof BlockersHelper.BlockersAction.ShowError) {
                            appLockMonitor$special$$inlined$map$22 = new AppLockMonitor$special$$inlined$map$2(new FailureMessageBlockerScreen(((StatusResultPresenter) obj3).args.getBlockersData(), r122 == true ? 1 : 0, r12 == true ? 1 : 0, 6), 19);
                        } else {
                            int i12 = 19;
                            if (!(blockersAction instanceof BlockersHelper.BlockersAction.ShowScreen)) {
                                OptionalProvider$$ExternalSyntheticLambda0.m$1(blockersAction, "Unexpected action: ");
                                return null;
                            }
                            appLockMonitor$special$$inlined$map$22 = new AppLockMonitor$special$$inlined$map$2(((BlockersHelper.BlockersAction.ShowScreen) blockersAction).screen, i12);
                        }
                        flow = appLockMonitor$special$$inlined$map$22;
                    }
                    this.L$0 = null;
                    this.L$1 = null;
                    this.label = 1;
                    if (FlowKt.emitAll(flowCollector4, flow, this) == coroutineSingletons4) {
                        return coroutineSingletons4;
                    }
                } else {
                    if (i11 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 4:
                Flow flow2 = (FlowQuery$mapToList$$inlined$map$1) obj3;
                RealBoostProvider realBoostProvider = (RealBoostProvider) this.$target$inlined;
                FlowCollector flowCollector5 = (FlowCollector) this.L$0;
                Object obj9 = this.L$1;
                CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i13 = this.label;
                if (i13 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    String str = (String) obj9;
                    if (str != null && realBoostProvider.networkInfo.isNetworkAvailable()) {
                        flow2 = FlowKt.transformLatest(flow2, new RealShareTargetsManager$shareTo$$inlined$flatMapLatest$1((Continuation) (r123 == true ? 1 : 0), realBoostProvider, str, i4));
                    }
                    this.L$0 = null;
                    this.L$1 = null;
                    this.label = 1;
                    if (FlowKt.emitAll(flowCollector5, flow2, this) == coroutineSingletons5) {
                        return coroutineSingletons5;
                    }
                } else {
                    if (i13 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 5:
                RealBoostProvider realBoostProvider2 = (RealBoostProvider) this.$target$inlined;
                FlowCollector flowCollector6 = (FlowCollector) this.L$0;
                Object obj10 = this.L$1;
                CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i14 = this.label;
                if (i14 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    List list = (List) obj10;
                    if (list.isEmpty()) {
                        Timber.Forest.e(new AssertionError("Trying to override empty slots."));
                        realActivityInvitePresenter = new AppLockMonitor$special$$inlined$map$2(EmptyList.INSTANCE, 19);
                    } else {
                        realActivityInvitePresenter = new RealActivityInvitePresenter(i4, new RealBadger2$setup$lambda$0$$inlined$mapNotNull$1(realBoostProvider2.getBoost((String) obj3), 24), realBoostProvider2, list);
                    }
                    this.L$0 = null;
                    this.L$1 = null;
                    this.label = 1;
                    if (FlowKt.emitAll(flowCollector6, realActivityInvitePresenter, this) == coroutineSingletons6) {
                        return coroutineSingletons6;
                    }
                } else {
                    if (i14 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 6:
                FlowCollector flowCollector7 = (FlowCollector) this.L$0;
                Object obj11 = this.L$1;
                CoroutineSingletons coroutineSingletons7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i15 = this.label;
                if (i15 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    StateFlow singleValue = ((SyncValueReader) ((BinaryBitmap) this.$target$inlined).matrix).getSingleValue(AndroidSyncValueSpecs.C4bKybEligibilityWarning);
                    this.L$0 = null;
                    this.L$1 = null;
                    this.label = 1;
                    FlowKt.ensureActive(flowCollector7);
                    Object collect = singleValue.collect(new CaptureCheckFacePresenter$models$2$1$1.AnonymousClass1(1, new FlowKt__MergeKt$flattenConcat$1$1(flowCollector7, i2), (KybEligibilityWarning.RestrictedFeature) obj3), this);
                    if (collect != coroutineSingletons7) {
                        collect = Unit.INSTANCE;
                    }
                    if (collect != coroutineSingletons7) {
                        collect = Unit.INSTANCE;
                    }
                    if (collect != coroutineSingletons7) {
                        collect = Unit.INSTANCE;
                    }
                    if (collect == coroutineSingletons7) {
                        return coroutineSingletons7;
                    }
                } else {
                    if (i15 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 7:
                CardPreviewPresenter cardPreviewPresenter = (CardPreviewPresenter) this.$target$inlined;
                CardPreviewScreen cardPreviewScreen = cardPreviewPresenter.args;
                FlowCollector flowCollector8 = (FlowCollector) this.L$0;
                Object obj12 = this.L$1;
                CoroutineSingletons coroutineSingletons8 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i16 = this.label;
                if (i16 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Triple triple = (Triple) obj12;
                    CardPreviewViewEvent.OrderCard orderCard = (CardPreviewViewEvent.OrderCard) triple.first;
                    CardStudio cardStudio = (CardStudio) triple.second;
                    Map map = (Map) triple.third;
                    cardPreviewPresenter.analytics.track(new CashCardOrderTap(String.valueOf(cardPreviewScreen.blockersData.clientScenario), cardPreviewScreen.blockersData.flowToken, Boolean.valueOf(cardPreviewPresenter.hasCustomization)), null);
                    CardTheme cardTheme = cardStudio.card_theme;
                    String str2 = cardTheme != null ? cardTheme.token : null;
                    str2.getClass();
                    CardPreviewPresenter.access$trackFpsMetadata(cardPreviewPresenter, str2, orderCard.averageFps);
                    TouchData touchData = cardStudio.touch_data;
                    if (touchData != null) {
                        if (!cardPreviewScreen.customizationEligible) {
                            touchData = null;
                            break;
                        }
                    }
                    touchData = new TouchData(new Float(RecyclerView.DECELERATION_RATE), new Float(RecyclerView.DECELERATION_RATE), (List) null, (List) null, 28);
                    ByteString createSignatureBytes = RealCardDetailsCreator.createSignatureBytes(StyledCardViewModelKt.toCustomizationDetails(touchData, map));
                    int i17 = CardPreviewPresenter.WhenMappings.$EnumSwitchMapping$0[cardPreviewScreen.cashtagDisplay.ordinal()];
                    if (i17 == 1) {
                        z = false;
                    } else if (i17 == 2) {
                        z = cardStudio.cashtag_enabled;
                    } else {
                        if (i17 != 3) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        z = true;
                    }
                    CardTheme cardTheme2 = cardStudio.card_theme;
                    cardTheme2.getClass();
                    SafeFlow safeFlow = new SafeFlow(new RealBlockersHelper$skipBlocker$1(cardPreviewPresenter, new SetCardCustomizationRequest(cardPreviewScreen.blockersData.requestContext, createSignatureBytes, "image/png", cardTheme2.token, touchData, Boolean.valueOf(z), CardCustomizationData.CustomizationArea.FULL_FACE, ByteString.EMPTY), (CardPreviewViewModel) obj3, (Continuation) null));
                    this.L$0 = null;
                    this.L$1 = null;
                    this.label = 1;
                    if (FlowKt.emitAll(flowCollector8, safeFlow, this) == coroutineSingletons8) {
                        return coroutineSingletons8;
                    }
                } else {
                    if (i16 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 8:
                PressGestureScope pressGestureScope = (PressGestureScope) this.L$1;
                CoroutineSingletons coroutineSingletons9 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i18 = this.label;
                if (i18 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    AnnotatedString.Range range = (AnnotatedString.Range) ((Ref$ObjectRef) this.$target$inlined).element;
                    if (range != null) {
                        LinkTapDetectorState linkTapDetectorState2 = (LinkTapDetectorState) obj3;
                        Iterator it = ((AnnotatedString) linkTapDetectorState2.text$delegate.getValue()).getSpanStyles().iterator();
                        while (true) {
                            if (it.hasNext()) {
                                obj2 = it.next();
                                AnnotatedString.Range range2 = (AnnotatedString.Range) obj2;
                                if (((SpanStyle) range2.item).textForegroundStyle.mo1007getColor0d7_KjU() == 16 || range2.start != range.start || range2.end != range.end) {
                                }
                            } else {
                                obj2 = null;
                            }
                        }
                        AnnotatedString.Range range3 = (AnnotatedString.Range) obj2;
                        linkTapDetectorState2.highlightedLink$delegate.setValue(new HighlightedLink(range, Color.m675copywmQWz5c$default(0.25f, (range3 == null || (spanStyle = (SpanStyle) range3.item) == null) ? Color.Transparent : spanStyle.textForegroundStyle.mo1007getColor0d7_KjU(), 14)));
                        this.L$1 = null;
                        this.L$0 = linkTapDetectorState2;
                        this.label = 1;
                        if (pressGestureScope.tryAwaitRelease(this) == coroutineSingletons9) {
                            return coroutineSingletons9;
                        }
                        linkTapDetectorState = linkTapDetectorState2;
                    }
                    return Unit.INSTANCE;
                }
                if (i18 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                linkTapDetectorState = (LinkTapDetectorState) this.L$0;
                SafeTrace.throwOnFailure(obj);
                linkTapDetectorState.highlightedLink$delegate.setValue(null);
                return Unit.INSTANCE;
            case 9:
                FlowCollector flowCollector9 = (FlowCollector) this.L$0;
                Object obj13 = this.L$1;
                CoroutineSingletons coroutineSingletons10 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i19 = this.label;
                if (i19 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    FlowKt__ZipKt$combine$$inlined$unsafeFlow$1 convert = WebViewGlueCommunicator.convert(Countries.asMoney(((RealBitcoinPerformanceDataRepo) this.$target$inlined).bitcoinBalance), ((RealCurrencyConverter.Factory) ((CurrencyConverter$Factory) obj3)).get((CurrencyCode) obj13));
                    this.L$0 = null;
                    this.L$1 = null;
                    this.label = 1;
                    if (FlowKt.emitAll(flowCollector9, convert, this) == coroutineSingletons10) {
                        return coroutineSingletons10;
                    }
                } else {
                    if (i19 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 10:
                List list2 = (List) this.$target$inlined;
                FlowCollector flowCollector10 = (FlowCollector) this.L$0;
                Object[] objArr = (Object[]) this.L$1;
                CoroutineSingletons coroutineSingletons11 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i20 = this.label;
                if (i20 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Activities[] activitiesArr = (Activities[]) objArr;
                    int length = activitiesArr.length;
                    int i21 = 0;
                    while (true) {
                        if (i21 >= length) {
                            int length2 = activitiesArr.length;
                            int i22 = 0;
                            while (true) {
                                if (i22 >= length2) {
                                    int length3 = activitiesArr.length;
                                    int i23 = 0;
                                    while (true) {
                                        if (i23 >= length3) {
                                            loaded = new FormattedTimestamp.Loaded(null);
                                        } else {
                                            List list3 = activitiesArr[i23].recentActivities;
                                            if (list3 == null || list3.isEmpty()) {
                                                i23++;
                                            } else {
                                                ArrayList arrayList = new ArrayList();
                                                for (Activities activities : activitiesArr) {
                                                    List list4 = activities.recentActivities;
                                                    if (list4 != null) {
                                                        ArrayList arrayList2 = new ArrayList();
                                                        for (Object obj14 : list4) {
                                                            if (((ActivityItem) obj14).getSection() != ActivityRowSection.UPCOMING) {
                                                                arrayList2.add(obj14);
                                                            }
                                                        }
                                                        activityItem = (ActivityItem) CollectionsKt.getOrNull(0, arrayList2);
                                                    } else {
                                                        activityItem = null;
                                                    }
                                                    if (activityItem != null) {
                                                        arrayList.add(activityItem);
                                                    }
                                                }
                                                Iterator it2 = arrayList.iterator();
                                                if (it2.hasNext()) {
                                                    displayInstant = ((ActivityItem) it2.next()).getDisplayInstant();
                                                    while (it2.hasNext()) {
                                                        Instant displayInstant2 = ((ActivityItem) it2.next()).getDisplayInstant();
                                                        if (displayInstant.compareTo(displayInstant2) < 0) {
                                                            displayInstant = displayInstant2;
                                                        }
                                                    }
                                                } else {
                                                    displayInstant = null;
                                                }
                                                if (displayInstant == null) {
                                                    loaded2 = new FormattedTimestamp.Loaded(null);
                                                } else {
                                                    String formatDate$default = AssetPublicSuffixList.formatDate$default(((RealFamilyAppletTileRepository) obj3).timestampFormatter, displayInstant, 2);
                                                    RealFamilyAppletTileRepository.formattedTimestampCache.put(list2, formatDate$default);
                                                    loaded2 = new FormattedTimestamp.Loaded(formatDate$default);
                                                }
                                                loaded = loaded2;
                                            }
                                        }
                                    }
                                } else if (activitiesArr[i22].loadingState == LoadingState.ERROR) {
                                    String str3 = (String) RealFamilyAppletTileRepository.formattedTimestampCache.get(list2);
                                    loaded = str3 != null ? new FormattedTimestamp.Loaded(str3) : FormattedTimestamp.Error.INSTANCE;
                                } else {
                                    i22++;
                                }
                            }
                        } else if (activitiesArr[i21].loadingState == LoadingState.LOADING) {
                            String str4 = (String) RealFamilyAppletTileRepository.formattedTimestampCache.get(list2);
                            loaded = str4 != null ? new FormattedTimestamp.Loaded(str4) : FormattedTimestamp.Loading.INSTANCE;
                        } else {
                            i21++;
                        }
                    }
                    this.L$0 = null;
                    this.L$1 = null;
                    this.label = 1;
                    if (flowCollector10.emit(loaded, this) == coroutineSingletons11) {
                        return coroutineSingletons11;
                    }
                } else {
                    if (i20 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 11:
                RealFidesmoClient realFidesmoClient = (RealFidesmoClient) this.L$1;
                Throwable th = (Throwable) this.L$0;
                CoroutineSingletons coroutineSingletons12 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i24 = this.label;
                if (i24 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Timber.Forest.e("Delivery flow exception", new Object[0], th);
                    RealObservabilityManager realObservabilityManager = realFidesmoClient.observabilityManager;
                    Pair pair = new Pair("stage", "delivery_flow");
                    String message = th.getMessage();
                    if (message == null) {
                        message = Reflection.factory.getOrCreateKotlinClass(th.getClass()).getSimpleName();
                    }
                    realObservabilityManager.logEvent("fidesmo_provisioning_delivery_error", MapsKt__MapsKt.mapOf(pair, new Pair(BreadcrumbHelper.Category.ERROR, message)));
                    RealFidesmoClient.access$markDeliveryFailed(realFidesmoClient, (ServiceDeliveryClient) this.$target$inlined, "Delivery exception: " + Reflection.factory.getOrCreateKotlinClass(th.getClass()).getSimpleName());
                    FidesmoDeviceState.Error error = new FidesmoDeviceState.Error(new FidesmoProvisioningError.GenericDeliveryFailed(null));
                    this.L$0 = null;
                    this.label = 1;
                    if (((ProducerCoroutine) ((ProducerScope) obj3))._channel.send(error, this) == coroutineSingletons12) {
                        return coroutineSingletons12;
                    }
                } else {
                    if (i24 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 12:
                RealLegacyActivityEntityManager realLegacyActivityEntityManager = (RealLegacyActivityEntityManager) this.$target$inlined;
                FlowCollector flowCollector11 = (FlowCollector) this.L$0;
                Object obj15 = this.L$1;
                CoroutineSingletons coroutineSingletons13 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i25 = this.label;
                if (i25 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    PaymentQueries paymentQueries = realLegacyActivityEntityManager.cashDatabase.paymentQueries;
                    String str5 = (String) obj3;
                    paymentQueries.getClass();
                    str5.getClass();
                    PaymentQueries$forToken$2 paymentQueries$forToken$2 = PaymentQueries$forToken$2.INSTANCE;
                    Flow flowOn = FlowKt.flowOn(new Transform$special$$inlined$map$1(DBUtil.mapToOneOrNull(DBUtil.toFlow(new PaymentQueries.ForTokenQuery(paymentQueries, str5, new PaymentQueries$$ExternalSyntheticLambda3(paymentQueries, i6))), realLegacyActivityEntityManager.ioDispatcher), (ZiplineHistoryDataJavaScripter) obj15, 13), realLegacyActivityEntityManager.jsDispatcher);
                    this.L$0 = null;
                    this.L$1 = null;
                    this.label = 1;
                    if (FlowKt.emitAll(flowCollector11, flowOn, this) == coroutineSingletons13) {
                        return coroutineSingletons13;
                    }
                } else {
                    if (i25 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 13:
                PaymentActionHandler paymentActionHandler = (PaymentActionHandler) this.$target$inlined;
                FlowCollector flowCollector12 = (FlowCollector) this.L$0;
                Object obj16 = this.L$1;
                CoroutineSingletons coroutineSingletons14 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i26 = this.label;
                if (i26 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    RenderedPayment renderedPayment = (RenderedPayment) obj16;
                    Flow customerForId = paymentActionHandler.customerStore.getCustomerForId(renderedPayment.theirId);
                    this.L$0 = null;
                    this.L$1 = null;
                    this.label = 1;
                    FlowKt.ensureActive(flowCollector12);
                    Object collect2 = customerForId.collect(new FlowKt__MergeKt$flattenConcat$1$1(new NearbyPayRequestPresenter$models$10$1$1$1(flowCollector12, renderedPayment, paymentActionHandler, (PaymentAction.LinkCardAction) obj3, 9), i2), this);
                    if (collect2 != coroutineSingletons14) {
                        collect2 = Unit.INSTANCE;
                    }
                    if (collect2 != coroutineSingletons14) {
                        collect2 = Unit.INSTANCE;
                    }
                    if (collect2 != coroutineSingletons14) {
                        collect2 = Unit.INSTANCE;
                    }
                    if (collect2 == coroutineSingletons14) {
                        return coroutineSingletons14;
                    }
                } else {
                    if (i26 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 14:
                HistoricalRange historicalRange = (HistoricalRange) this.$target$inlined;
                RealInvestingHistoricalData realInvestingHistoricalData = (RealInvestingHistoricalData) obj3;
                FlowCollector flowCollector13 = (FlowCollector) this.L$0;
                Object obj17 = this.L$1;
                CoroutineSingletons coroutineSingletons15 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i27 = this.label;
                if (i27 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    CurrencyCode currencyCode = (CurrencyCode) obj17;
                    int i28 = 12;
                    FormCashtag$8$invokeSuspend$$inlined$map$1 formCashtag$8$invokeSuspend$$inlined$map$1 = new FormCashtag$8$invokeSuspend$$inlined$map$1(new RealGooglePayer$createWallet$$inlined$map$1(new FlowKt__MergeKt$flatMapConcat$$inlined$map$1(new RealActivityInvitePresenter(i3, realInvestingHistoricalData.tickerFlow, realInvestingHistoricalData, new GetHistoricalExchangeDataRequest(historicalRange, currencyCode.name())), new RealInvestingHistoricalData$bitcoin$1$bitcoinData$2(realInvestingHistoricalData, null, i6), i5), i4), i28);
                    PersistentHistoricalDataCache persistentHistoricalDataCache = realInvestingHistoricalData.cache;
                    RewardSlotQueries queries = persistentHistoricalDataCache.getQueries();
                    queries.getClass();
                    InvestingPortfolioGraphCacheQueries$bitcoin$2 investingPortfolioGraphCacheQueries$bitcoin$2 = InvestingPortfolioGraphCacheQueries$bitcoin$2.INSTANCE;
                    SafeFlow flow3 = DBUtil.toFlow(new BadgeQueries$VersionQuery(queries, currencyCode, historicalRange, new InvestingPortfolioGraphCacheQueries$$ExternalSyntheticLambda4(queries, i6)));
                    CoroutineContext coroutineContext = persistentHistoricalDataCache.ioDispatcher;
                    Continuation continuation = null;
                    Flow runUntil = StateFlowKt.runUntil(FlowKt.distinctUntilChanged(new FlowKt__ZipKt$combine$$inlined$unsafeFlow$1(FlowKt.distinctUntilChanged(new FlowKt__MergeKt$flatMapConcat$$inlined$map$1(new GLThread$start$2(persistentHistoricalDataCache, currencyCode, historicalRange, continuation, 13), FlowKt.merge(new RealDisclosureProvider$special$$inlined$map$1(DBUtil.mapToOneNotNull(flow3, coroutineContext), i28), FlowKt.flowOn(new RealShareableAssetsManager$download$lambda$0$$inlined$map$1(new FlowKt__MergeKt$flatMapConcat$$inlined$map$1(formCashtag$8$invokeSuspend$$inlined$map$1, new DotGridKt$DotGrid$3$1(persistentHistoricalDataCache, currencyCode, historicalRange, continuation, 10), i5), persistentHistoricalDataCache, currencyCode, historicalRange, 2), coroutineContext)))), FaceDetection.m2065timerForAgeWn2Vu4Y(realInvestingHistoricalData.bitcoinNetworkStatus, realInvestingHistoricalData.clock, realInvestingHistoricalData.computationDispatcher, RealInvestmentEntitiesKt.INVESTING_STALENESS_THRESHOLD), new CardModelView$getActiveHeat$2$2(realInvestingHistoricalData, continuation, 11), i6)), realInvestingHistoricalData.signOut);
                    this.L$0 = null;
                    this.L$1 = null;
                    this.label = 1;
                    if (FlowKt.emitAll(flowCollector13, runUntil, this) == coroutineSingletons15) {
                        return coroutineSingletons15;
                    }
                } else {
                    if (i27 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 15:
                RealInvestingHistoricalData realInvestingHistoricalData2 = (RealInvestingHistoricalData) this.$target$inlined;
                FlowCollector flowCollector14 = (FlowCollector) this.L$0;
                Object obj18 = this.L$1;
                CoroutineSingletons coroutineSingletons16 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i29 = this.label;
                if (i29 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    GetInvestmentEntityHistoricalDataResponse getInvestmentEntityHistoricalDataResponse = (GetInvestmentEntityHistoricalDataResponse) obj18;
                    List list5 = getInvestmentEntityHistoricalDataResponse.price_ticks;
                    Long l = getInvestmentEntityHistoricalDataResponse.end_time;
                    Flow appLockMonitor$special$$inlined$map$24 = (list5.isEmpty() || (l != null && realInvestingHistoricalData2.clock.millis() > TimeUnit.SECONDS.toMillis(l.longValue()))) ? new AppLockMonitor$special$$inlined$map$2(getInvestmentEntityHistoricalDataResponse, 19) : new RealActivityInvitePresenter(19, realInvestingHistoricalData2.investmentEntities.stockDetails((InvestmentEntityToken) obj3), getInvestmentEntityHistoricalDataResponse, realInvestingHistoricalData2);
                    this.L$0 = null;
                    this.L$1 = null;
                    this.label = 1;
                    if (FlowKt.emitAll(flowCollector14, appLockMonitor$special$$inlined$map$24, this) == coroutineSingletons16) {
                        return coroutineSingletons16;
                    }
                } else {
                    if (i29 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 16:
                FlowCollector flowCollector15 = (FlowCollector) this.L$0;
                Object obj19 = this.L$1;
                CoroutineSingletons coroutineSingletons17 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i30 = this.label;
                if (i30 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    GetInvestingMetricsResponse getInvestingMetricsResponse = (GetInvestingMetricsResponse) obj19;
                    RealInvestingMetrics realInvestingMetrics = (RealInvestingMetrics) this.$target$inlined;
                    InvestmentEntityToken investmentEntityToken = (InvestmentEntityToken) obj3;
                    realInvestingMetrics.getClass();
                    InvestmentEntityStats investmentEntityStats = getInvestingMetricsResponse.stats;
                    Flow appLockMonitor$special$$inlined$map$25 = investmentEntityStats == null ? new AppLockMonitor$special$$inlined$map$2(getInvestingMetricsResponse, 19) : new WorkReviewTermsBanner$configFlow$$inlined$map$1(realInvestingMetrics.entityPriceRefresher.observe(CollectionsKt__CollectionsJVMKt.listOf(investmentEntityToken)), investmentEntityToken, getInvestingMetricsResponse, investmentEntityStats, realInvestingMetrics, 4);
                    this.L$0 = null;
                    this.L$1 = null;
                    this.label = 1;
                    if (FlowKt.emitAll(flowCollector15, appLockMonitor$special$$inlined$map$25, this) == coroutineSingletons17) {
                        return coroutineSingletons17;
                    }
                } else {
                    if (i30 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 17:
                RoundUpsElement roundUpsElement = (RoundUpsElement) obj3;
                FlowCollector flowCollector16 = (FlowCollector) this.L$0;
                Object obj20 = this.L$1;
                CoroutineSingletons coroutineSingletons18 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i31 = this.label;
                if (i31 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    UiInvestingAutomation uiInvestingAutomation = (UiInvestingAutomation) obj20;
                    if (uiInvestingAutomation == null || (automation = uiInvestingAutomation.automation) == null) {
                        appLockMonitor$special$$inlined$map$23 = new AppLockMonitor$special$$inlined$map$2(new CardsRoundUpsItemViewModel(roundUpsElement, null), 19);
                    } else {
                        Automation.AutomationStatus automationStatus = automation.status;
                        MarkwonConfiguration markwonConfiguration = (MarkwonConfiguration) this.$target$inlined;
                        AndroidStringManager androidStringManager = (AndroidStringManager) markwonConfiguration.linkResolver;
                        Automation.AutomationTarget automationTarget = automation.target;
                        automationStatus.getClass();
                        int ordinal = automationStatus.ordinal();
                        String str6 = "";
                        if (ordinal != 0) {
                            if (ordinal == 1) {
                                automationTarget.getClass();
                                String str7 = automationTarget.display_name;
                                Automation.AutomationTarget.Type type2 = automationTarget.f1279type;
                                type2.getClass();
                                int ordinal2 = type2.ordinal();
                                if (ordinal2 != 0) {
                                    if (ordinal2 == 1) {
                                        str6 = androidStringManager.get(R.string.stocks_as_selected_roundups_destination_in_cards_tab);
                                    } else if (ordinal2 == 2 || ordinal2 == 3) {
                                        str6 = str7;
                                    } else {
                                        if (ordinal2 != 4) {
                                            Drop$$ExternalSyntheticBUOutline0.m1m();
                                            return null;
                                        }
                                        str6 = androidStringManager.get(R.string.savings_goals_as_selected_roundups_destination_in_cards_tab);
                                    }
                                }
                            } else {
                                if (ordinal != 2) {
                                    Drop$$ExternalSyntheticBUOutline0.m1m();
                                    return null;
                                }
                                str6 = androidStringManager.get(R.string.roundups_turned_off_in_cards_tab);
                            }
                        }
                        RoundUpsElement copy$default = RoundUpsElement.copy$default(roundUpsElement, null, str6, null, null, null, null, null, 2455);
                        int ordinal3 = automationStatus.ordinal();
                        if (ordinal3 == 0) {
                            throw new NotImplementedError(null, 1, null);
                        }
                        if (ordinal3 == 1) {
                            automationTarget.getClass();
                            Automation.AutomationTarget.Type type3 = automationTarget.f1279type;
                            type3.getClass();
                            int ordinal4 = type3.ordinal();
                            if (ordinal4 == 0) {
                                throw new NotImplementedError(null, 1, null);
                            }
                            if (ordinal4 == 1) {
                                InvestmentEntityQueries investmentEntityQueries = ((CashAccountDatabaseImpl) markwonConfiguration.theme).investmentEntityQueries;
                                String str8 = automationTarget.identifier;
                                str8.getClass();
                                inviteContactsPresenter$special$$inlined$map$1 = new InviteContactsPresenter$special$$inlined$map$1(FlowKt.distinctUntilChanged(DBUtil.mapToOneOrNull(DBUtil.toFlow(investmentEntityQueries.forToken(str8)), (CoroutineContext) markwonConfiguration.spansFactory)), markwonConfiguration, 8);
                            } else if (ordinal4 == 2) {
                                inviteContactsPresenter$special$$inlined$map$1 = new AppLockMonitor$special$$inlined$map$2(CardsRoundUpsItemViewModel.DestinationAvatar.Bitcoin.INSTANCE, 19);
                            } else if (ordinal4 == 3) {
                                inviteContactsPresenter$special$$inlined$map$1 = new AppLockMonitor$special$$inlined$map$2(CardsRoundUpsItemViewModel.DestinationAvatar.Savings.INSTANCE, 19);
                            } else {
                                if (ordinal4 != 4) {
                                    Drop$$ExternalSyntheticBUOutline0.m1m();
                                    return null;
                                }
                                inviteContactsPresenter$special$$inlined$map$1 = new AppLockMonitor$special$$inlined$map$2(r124 == true ? 1 : 0, 19);
                            }
                        } else {
                            if (ordinal3 != 2) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return null;
                            }
                            inviteContactsPresenter$special$$inlined$map$1 = new AppLockMonitor$special$$inlined$map$2(r125 == true ? 1 : 0, 19);
                        }
                        appLockMonitor$special$$inlined$map$23 = new InviteContactsPresenter$special$$inlined$map$1(inviteContactsPresenter$special$$inlined$map$1, copy$default, 9);
                    }
                    this.L$0 = null;
                    this.L$1 = null;
                    this.label = 1;
                    if (FlowKt.emitAll(flowCollector16, appLockMonitor$special$$inlined$map$23, this) == coroutineSingletons18) {
                        return coroutineSingletons18;
                    }
                } else {
                    if (i31 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 18:
                return invokeSuspend$com$squareup$cash$moneybot$presenters$MoneybotChatPresenter$models$chatSessionState$2$1$1(obj);
            case 19:
                FlowCollector flowCollector17 = (FlowCollector) this.L$0;
                Object obj21 = this.L$1;
                CoroutineSingletons coroutineSingletons19 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i32 = this.label;
                if (i32 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    ProfilePrivacyPresenter profilePrivacyPresenter = (ProfilePrivacyPresenter) this.$target$inlined;
                    int i33 = ProfilePrivacyPresenter.$r8$clinit;
                    SafeFlow safeFlow2 = new SafeFlow(new RealContactSync$syncRequest$2.AnonymousClass1((PublicProfile) ((State) obj3).getValue(), (ProfilePrivacyViewEvent.ToggleCashMeUrlSetting) obj21, profilePrivacyPresenter, null));
                    this.L$0 = null;
                    this.L$1 = null;
                    this.label = 1;
                    if (FlowKt.emitAll(flowCollector17, safeFlow2, this) == coroutineSingletons19) {
                        return coroutineSingletons19;
                    }
                } else {
                    if (i32 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 20:
                FlowCollector flowCollector18 = (FlowCollector) this.L$0;
                Object obj22 = this.L$1;
                CoroutineSingletons coroutineSingletons20 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i34 = this.label;
                if (i34 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Pair pair2 = new Pair((RecipientSearchResults.LocalContacts) obj22, new RecipientSearchResults.ServerSuggestion(null, EmptyList.INSTANCE));
                    this.L$0 = null;
                    this.L$1 = null;
                    this.label = 1;
                    FlowKt.ensureActive(flowCollector18);
                    Object emit = flowCollector18.emit(pair2, this);
                    if (emit != CoroutineSingletons.COROUTINE_SUSPENDED) {
                        emit = Unit.INSTANCE;
                    }
                    if (emit != CoroutineSingletons.COROUTINE_SUSPENDED) {
                        emit = Unit.INSTANCE;
                    }
                    if (emit == coroutineSingletons20) {
                        return coroutineSingletons20;
                    }
                } else {
                    if (i34 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 21:
                FlowCollector flowCollector19 = (FlowCollector) this.L$0;
                Object obj23 = this.L$1;
                CoroutineSingletons coroutineSingletons21 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i35 = this.label;
                if (i35 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    ChannelFlowTransformLatest transformLatest = FlowKt.transformLatest((Flow) this.$target$inlined, new RealShareTargetsManager$shareTo$$inlined$flatMapLatest$1((Continuation) (r126 == true ? 1 : 0), (RealSuggestedRecipientsVendor) obj3, (SuggestedRecipientsData) obj23, 22));
                    this.L$0 = null;
                    this.L$1 = null;
                    this.label = 1;
                    if (FlowKt.emitAll(flowCollector19, transformLatest, this) == coroutineSingletons21) {
                        return coroutineSingletons21;
                    }
                } else {
                    if (i35 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 22:
                FlowCollector flowCollector20 = (FlowCollector) this.L$0;
                Object obj24 = this.L$1;
                CoroutineSingletons coroutineSingletons22 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i36 = this.label;
                if (i36 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    RealContactRepository$recents$$inlined$mapItems$1 recents = ((RealSuggestedRecipientsVendor) this.$target$inlined).contactRepository.recents(((Number) obj24).longValue());
                    this.L$0 = null;
                    this.L$1 = null;
                    this.label = 1;
                    FlowKt.ensureActive(flowCollector20);
                    Object collect3 = recents.collect(new WirelessProviderListPresenter$models$1$1$1(i3, flowCollector20, (SuggestedRecipientsData) obj3), this);
                    if (collect3 != coroutineSingletons22) {
                        collect3 = Unit.INSTANCE;
                    }
                    if (collect3 != coroutineSingletons22) {
                        collect3 = Unit.INSTANCE;
                    }
                    if (collect3 == coroutineSingletons22) {
                        return coroutineSingletons22;
                    }
                } else {
                    if (i36 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 23:
                FlowCollector flowCollector21 = (FlowCollector) this.L$0;
                Object obj25 = this.L$1;
                CoroutineSingletons coroutineSingletons23 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i37 = this.label;
                if (i37 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.L$0 = null;
                    this.L$1 = null;
                    this.label = 1;
                    FlowKt.ensureActive(flowCollector21);
                    Object collect4 = ((RealRecipientRepository) this.$target$inlined).allowlistRepository.getAllowlistedTokensIfActive().collect(new AndroidPermissionChecker$granted$$inlined$map$2$2(25, flowCollector21, (Map) obj3, (List) obj25), this);
                    if (collect4 != coroutineSingletons23) {
                        collect4 = Unit.INSTANCE;
                    }
                    if (collect4 != coroutineSingletons23) {
                        collect4 = Unit.INSTANCE;
                    }
                    if (collect4 == coroutineSingletons23) {
                        return coroutineSingletons23;
                    }
                } else {
                    if (i37 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 24:
                FlowCollector flowCollector22 = (FlowCollector) this.L$0;
                Object obj26 = this.L$1;
                CoroutineSingletons coroutineSingletons24 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i38 = this.label;
                if (i38 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj27 : (List) obj26) {
                        SavingsFolder savingsFolder = (SavingsFolder) obj27;
                        SavingsFolder.GoalFolder goalFolder = savingsFolder instanceof SavingsFolder.GoalFolder ? (SavingsFolder.GoalFolder) savingsFolder : null;
                        if (Intrinsics.areEqual(goalFolder != null ? goalFolder.token : null, (String) obj3)) {
                            arrayList3.add(obj27);
                        }
                    }
                    Object singleOrNull = CollectionsKt.singleOrNull((List) arrayList3);
                    Flow access$buildProviderFlowFromLocalStatus = PersistentActiveGoalStore.access$buildProviderFlowFromLocalStatus((PersistentActiveGoalStore) this.$target$inlined, singleOrNull instanceof SavingsFolder.GoalFolder ? (SavingsFolder.GoalFolder) singleOrNull : null);
                    this.L$0 = null;
                    this.L$1 = null;
                    this.label = 1;
                    if (FlowKt.emitAll(flowCollector22, access$buildProviderFlowFromLocalStatus, this) == coroutineSingletons24) {
                        return coroutineSingletons24;
                    }
                } else {
                    if (i38 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 25:
                return invokeSuspend$com$squareup$cash$support$views$article$ArticleActivityItemRowKt$ArticleActivityItemRow$lambda$1$$inlined$flatMapLatest$1(obj);
            case 26:
                return invokeSuspend$com$squareup$cash$transactionpicker$presenters$RealTransactionLoader$getViewModels$1$1$1(obj);
            case 27:
                return invokeSuspend$com$squareup$cash$work$data$real$RealAssignedJobProvider$getMerchantMemberships$$inlined$flatMapLatest$1(obj);
            case 28:
                return invokeSuspend$com$squareup$cash$work$data$real$RealGetClockInControlsUseCase$getControls$$inlined$flatMapLatest$1(obj);
            default:
                FlowCollector flowCollector23 = (FlowCollector) this.L$0;
                Object obj28 = this.L$1;
                CoroutineSingletons coroutineSingletons25 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i39 = this.label;
                if (i39 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    MerchantIdentifier merchantIdentifier = (MerchantIdentifier) obj28;
                    Flow appLockMonitor$special$$inlined$map$26 = merchantIdentifier == null ? new AppLockMonitor$special$$inlined$map$2(obj4, i7) : new InviteContactsPresenter$includingEmail$$inlined$map$1(((RealTeamMemberIdProvider) this.$target$inlined).membershipRepository.getMembership(EntityType.MERCHANT_WRAPPER, merchantIdentifier.entityId, EntityType.PERSON_WRAPPER, ((PersonIdentifier) obj3).entityId), i5);
                    this.L$0 = null;
                    this.L$1 = null;
                    this.label = 1;
                    if (FlowKt.emitAll(flowCollector23, appLockMonitor$special$$inlined$map$26, this) == coroutineSingletons25) {
                        return coroutineSingletons25;
                    }
                } else {
                    if (i39 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealShareTargetsManager$shareTo$$inlined$flatMapLatest$1(MoneybotChatPresenter moneybotChatPresenter, Continuation continuation) {
        super(3, continuation);
        this.$r8$classId = 18;
        this.this$0 = moneybotChatPresenter;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RealShareTargetsManager$shareTo$$inlined$flatMapLatest$1(Object obj, Object obj2, Continuation continuation, int i) {
        super(3, continuation);
        this.$r8$classId = i;
        this.$target$inlined = obj;
        this.this$0 = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RealShareTargetsManager$shareTo$$inlined$flatMapLatest$1(Continuation continuation, Object obj, Object obj2, int i) {
        super(3, continuation);
        this.$r8$classId = i;
        this.$target$inlined = obj;
        this.this$0 = obj2;
    }
}
