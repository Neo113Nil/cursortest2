package com.squareup.cash.moneybot.backend.real.managers;

import androidx.camera.core.CameraSelector$$ExternalSyntheticOutline0;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.ui.draw.RotateKt;
import androidx.media3.extractor.ts.DefaultTsPayloadReaderFactory;
import app.cash.api.ApiResult;
import app.cash.cdp.integration.CashCdpConfigProvider;
import app.cash.passcode.flows.RealPasscodeFlowStarter;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.fillr.featuretoggle.UnleashContext;
import com.google.mlkit.vision.text.internal.zzr;
import com.knotapi.knot.utilities.BreadcrumbHelper;
import com.miteksystems.misnap.camera.a.b;
import com.squareup.cash.account.presenters.settings.AccountSettingsCapabilityProvider;
import com.squareup.cash.account.presenters.settings.BusinessInfoSetting;
import com.squareup.cash.account.presenters.settings.FamilySetting;
import com.squareup.cash.account.presenters.settings.LimitsSetting;
import com.squareup.cash.account.presenters.settings.PasskeysSetting;
import com.squareup.cash.account.presenters.settings.PersonalSetting;
import com.squareup.cash.account.presenters.settings.SecuritySetting;
import com.squareup.cash.activity.backend.ActivityItem;
import com.squareup.cash.activity.backend.PaymentHistoryActivityItem;
import com.squareup.cash.activity.backend.RealActivityUpdatesNotifier;
import com.squareup.cash.activity.backend.ZiplineActivityItemFormatter;
import com.squareup.cash.activity.presenters.RealActivityItemPresenterFactory;
import com.squareup.cash.blockers.analytics.RealFlowTokenGenerator;
import com.squareup.cash.boost.backend.RealBoostRepository;
import com.squareup.cash.borrow.views.BorrowUiFactory;
import com.squareup.cash.cashapplite.cashin.RealLiteCashInRepo$MetroFactory;
import com.squareup.cash.clientroutes.ClientRoutesConfig;
import com.squareup.cash.clientroutes.PatternRedaction;
import com.squareup.cash.clientroutes.RealClientRouteParser;
import com.squareup.cash.clientrouting.RealClientRouteToScreenMapping;
import com.squareup.cash.clientsync.models.SyncTopic;
import com.squareup.cash.clientsync.readers.SyncValueReader;
import com.squareup.cash.clientsync.syncer.RealClientSyncer;
import com.squareup.cash.data.contacts.RealContactRepository;
import com.squareup.cash.data.db.AppConfigManager;
import com.squareup.cash.data.profile.RealProfileManager;
import com.squareup.cash.db.db.CashAccountDatabaseImpl;
import com.squareup.cash.eligibility.backend.real.RealFeatureEligibilityRepository;
import com.squareup.cash.featureflags.FeatureFlag$LongFeatureFlag;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.featureflags.LaunchDarklyFeatureFlags$MoneybotCachedSessionIdTimeoutSeconds;
import com.squareup.cash.featureflags.RealFeatureFlagManager;
import com.squareup.cash.featureflags.RealSessionFlags;
import com.squareup.cash.history.analytics.LoadTimeClock;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.integration.analytics.RealUuidGenerator;
import com.squareup.cash.keystore.RealMessageSigner;
import com.squareup.cash.knot.backend.real.RealKnotLauncher;
import com.squareup.cash.money.views.MoneyUiFactory;
import com.squareup.cash.moneybot.analytics.AnalyticsMappersKt;
import com.squareup.cash.moneybot.analytics.RealMoneybotAnalyticsService;
import com.squareup.cash.moneybot.backend.RealMoneybotChatMessagesCache;
import com.squareup.cash.moneybot.backend.api.CachedChat;
import com.squareup.cash.moneybot.backend.api.GeneralMoneybotError;
import com.squareup.cash.moneybot.backend.api.managers.ChatManager;
import com.squareup.cash.moneybot.backend.api.managers.ExecuteToolResult;
import com.squareup.cash.moneybot.backend.api.mappers.ChatActivityMappersKt;
import com.squareup.cash.moneybot.backend.api.mappers.MessageMappersKt;
import com.squareup.cash.moneybot.backend.api.model.chat.Chat;
import com.squareup.cash.moneybot.backend.api.model.chat.ChatActivity;
import com.squareup.cash.moneybot.backend.api.model.chat.ClientRenderable;
import com.squareup.cash.moneybot.backend.api.model.chat.ClientRenderableTapAction;
import com.squareup.cash.moneybot.backend.api.model.chat.Message;
import com.squareup.cash.moneybot.backend.api.model.chat.MessageList;
import com.squareup.cash.moneybot.backend.api.model.chat.Session;
import com.squareup.cash.moneybot.backend.api.model.chat.SessionPage;
import com.squareup.cash.moneybot.backend.api.model.chat.SlashCommand;
import com.squareup.cash.moneybot.backend.api.model.chat.TokenInfo;
import com.squareup.cash.moneybot.components.api.ClientRenderablePluginRegistry;
import com.squareup.cash.music.views.MusicViewFactory$MetroFactory;
import com.squareup.cash.music.views.MusicViewKt$$ExternalSyntheticLambda6;
import com.squareup.cash.observability.protovalidation.HasObservability;
import com.squareup.cash.observability.protovalidation.ProtoValidationScope;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.cash.observability.types.SampleStrategy;
import com.squareup.cash.payments.backend.real.RealActivityPaymentManager2;
import com.squareup.cash.payments.backend.real.RealPaymentActionCompletionDispatcher;
import com.squareup.cash.payments.backend.real.RealPaymentManager;
import com.squareup.cash.prepurchasecashcard.backend.RealPrepurchaseCashCardRepository;
import com.squareup.cash.reactions.real.RealReactionManager;
import com.squareup.cash.transfers.presenters.AddMoneyPresenter$Factory$Impl;
import com.squareup.cash.transfers.presenters.BalanceBasedAddCashDisabledDialogPresenter$Factory$Impl;
import com.squareup.cash.transfers.presenters.BalanceBasedAutoReloadConfirmationPresenter$Factory$Impl;
import com.squareup.cash.transfers.presenters.InstrumentDetailsPresenter$Factory$Impl;
import com.squareup.cash.transfers.presenters.InstrumentLinkingOptionsPresenter$Factory$Impl;
import com.squareup.cash.transfers.presenters.InstrumentNotLinkedPresenter$Factory$Impl;
import com.squareup.cash.transfers.presenters.LinkedAccountsNuxPresenter$Factory$Impl;
import com.squareup.cash.transfers.presenters.LinkedAccountsPresenter$Factory$Impl;
import com.squareup.cash.transfers.presenters.PendingTransfersConfirmationDialogPresenter$Factory$Impl;
import com.squareup.cash.transfers.presenters.RecurringReloadConfigurationPresenter$Factory$Impl;
import com.squareup.cash.transfers.presenters.RecurringReloadOptionPresenter$Factory$Impl;
import com.squareup.cash.transfers.presenters.RecurringReloadsChangeInstrumentPresenter$Factory$Impl;
import com.squareup.cash.transfers.presenters.RecurringReloadsDismissDialogPresenter$Factory$Impl;
import com.squareup.cash.transfers.presenters.ScheduledReloadConfirmationPresenter$Factory$Impl;
import com.squareup.cash.transfers.presenters.SetDefaultInstrumentPresenter$Factory$Impl;
import com.squareup.cash.transfers.presenters.TransfersRouterPresenter$Factory$Impl;
import com.squareup.cash.transfers.presenters.WithdrawPresenter$Factory$Impl;
import com.squareup.cash.util.RealDrawerOpener$MetroFactory;
import com.squareup.cash.util.clock.AndroidClock;
import com.squareup.cash.wallet.data.IssuedCardManager;
import com.squareup.cash.wallet.data.RealCashAppTagManager;
import com.squareup.cash.wallet.presenters.RealCardAppletTileRepository;
import com.squareup.cash.wallet.presenters.RealCardCustomizationRepository;
import com.squareup.cash.wallet.views.WalletUiFactory$MetroFactory;
import com.squareup.cash.work.presenters.WorkPresenterFactory;
import com.squareup.moshi.Moshi;
import com.squareup.preferences.KeyValue;
import com.squareup.protos.cash.kgoose.api.v3.Activity;
import com.squareup.protos.cash.kgoose.api.v3.CancelLastUserMessageRequest;
import com.squareup.protos.cash.kgoose.api.v3.ChatContext;
import com.squareup.protos.cash.kgoose.api.v3.ChatSessionStatus;
import com.squareup.protos.cash.kgoose.api.v3.DeleteUserSessionRequest;
import com.squareup.protos.cash.kgoose.api.v3.ExecuteToolRequest;
import com.squareup.protos.cash.kgoose.api.v3.ExecuteToolResponse;
import com.squareup.protos.cash.kgoose.api.v3.GetMessagesRequest;
import com.squareup.protos.cash.kgoose.api.v3.GetMessagesResponse;
import com.squareup.protos.cash.kgoose.api.v3.GetPresignedUrlRequest;
import com.squareup.protos.cash.kgoose.api.v3.GetPresignedUrlResponse;
import com.squareup.protos.cash.kgoose.api.v3.GetRuntimeMetadataRequest;
import com.squareup.protos.cash.kgoose.api.v3.GetUserSessionsRequest;
import com.squareup.protos.cash.kgoose.api.v3.GetUserSessionsResponse;
import com.squareup.protos.cash.kgoose.api.v3.ImageContent;
import com.squareup.protos.cash.kgoose.api.v3.InputMessage;
import com.squareup.protos.cash.kgoose.api.v3.ListSkillsRequest;
import com.squareup.protos.cash.kgoose.api.v3.ListSkillsResponse;
import com.squareup.protos.cash.kgoose.api.v3.Message;
import com.squareup.protos.cash.kgoose.api.v3.MessageContent;
import com.squareup.protos.cash.kgoose.api.v3.MessageType;
import com.squareup.protos.cash.kgoose.api.v3.Role;
import com.squareup.protos.cash.kgoose.api.v3.Skill;
import com.squareup.protos.cash.kgoose.api.v3.Source;
import com.squareup.protos.cash.kgoose.api.v3.TextContent;
import com.squareup.protos.cash.kgoose.api.v3.TokenUsageInfo;
import com.squareup.protos.cash.kgoose.api.v3.ToolCall;
import com.squareup.protos.cash.kgoose.api.v3.ToolEndpointService;
import com.squareup.protos.cash.kgoose.api.v3.ToolRequest;
import com.squareup.protos.cash.kgoose.api.v3.ToolResponse;
import com.squareup.protos.cash.kgoose.api.v3.UpdateSuggestionRequest;
import com.squareup.protos.cash.kgoose.api.v3.UserContent;
import com.squareup.protos.cash.kgoose.api.v3.cash.CashKgooseService;
import com.squareup.protos.cash.kgoose.api.v3.cash.CashSkillsService;
import com.squareup.protos.cash.postcard.app.PostcardClientService;
import com.squareup.protos.cash.ui.Icon;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import dev.zacsweers.metro.LambdaProvider;
import dev.zacsweers.metro.Provider;
import dev.zacsweers.metro.internal.DelegateFactory;
import dev.zacsweers.metro.internal.DoubleCheck;
import dev.zacsweers.metro.internal.Factory;
import dev.zacsweers.metro.internal.InstanceFactory;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyList;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import okio.ByteString;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class RealChatManager implements ChatManager, HasObservability {
    public final ZiplineActivityItemFormatter activityItemFormatter;
    public final RealMoneybotAnalyticsService analyticsService;
    public final RealMoneybotChatMessagesCache chatMessagesCache;
    public final AndroidClock clock;
    public final CoroutineContext computationContext;
    public final ErrorReporter errorReporter;
    public final CashKgooseService kgooseService;
    public final UnleashContext messagesStreamingSubscriber;
    public final RealMoneybotPreambleManager moneybotPreambleManager;
    public final SampleStrategy oneErrorPerAppSessionStrategy;
    public final ClientRenderablePluginRegistry pluginRegistry;
    public final long recentStalenessThresholdMs;
    public final zzr renderContextProvider;
    public final CashSkillsService skillsService;
    public final ToolEndpointService toolEndpointService;
    public final LinkedHashMap sessionCursors = new LinkedHashMap();
    public final LinkedHashMap sessionIdToChat = new LinkedHashMap();
    public final LinkedHashMap lastFinishedTokenizedMessage = new LinkedHashMap();

    public RealChatManager(ErrorReporter errorReporter, SampleStrategy sampleStrategy, CashKgooseService cashKgooseService, ToolEndpointService toolEndpointService, CashSkillsService cashSkillsService, DefaultTsPayloadReaderFactory defaultTsPayloadReaderFactory, UnleashContext unleashContext, FeatureFlagManager featureFlagManager, ZiplineActivityItemFormatter ziplineActivityItemFormatter, RealMoneybotAnalyticsService realMoneybotAnalyticsService, RealUuidGenerator realUuidGenerator, RealMoneybotChatMessagesCache realMoneybotChatMessagesCache, RealMoneybotPreambleManager realMoneybotPreambleManager, AndroidClock androidClock, zzr zzrVar, ClientRenderablePluginRegistry clientRenderablePluginRegistry, CoroutineContext coroutineContext) {
        this.errorReporter = errorReporter;
        this.oneErrorPerAppSessionStrategy = sampleStrategy;
        this.kgooseService = cashKgooseService;
        this.toolEndpointService = toolEndpointService;
        this.skillsService = cashSkillsService;
        this.messagesStreamingSubscriber = unleashContext;
        this.activityItemFormatter = ziplineActivityItemFormatter;
        this.analyticsService = realMoneybotAnalyticsService;
        this.chatMessagesCache = realMoneybotChatMessagesCache;
        this.moneybotPreambleManager = realMoneybotPreambleManager;
        this.clock = androidClock;
        this.renderContextProvider = zzrVar;
        this.pluginRegistry = clientRenderablePluginRegistry;
        this.computationContext = coroutineContext;
        this.recentStalenessThresholdMs = ((FeatureFlag$LongFeatureFlag.Value) ((RealFeatureFlagManager) featureFlagManager).peekCurrentValue(LaunchDarklyFeatureFlags$MoneybotCachedSessionIdTimeoutSeconds.INSTANCE)).value * 1000;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0033  */
    /* JADX WARN: Type inference failed for: r13v14, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r34v0, types: [com.squareup.cash.moneybot.backend.real.managers.RealChatManager, com.squareup.cash.observability.protovalidation.HasObservability] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x0275 -> B:10:0x027c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$onFullResponse(RealChatManager realChatManager, String str, GetMessagesResponse getMessagesResponse, ContinuationImpl continuationImpl) {
        RealChatManager$onFullResponse$1 realChatManager$onFullResponse$1;
        int i;
        String str2;
        String str3;
        Map map;
        TokenInfo tokenInfo;
        ArrayList arrayList;
        boolean containsKey;
        Iterable iterable;
        int i2;
        Map map2;
        Iterator it;
        String str4;
        ArrayList arrayList2;
        ChatSessionStatus chatSessionStatus;
        TokenInfo tokenInfo2;
        List list;
        List list2;
        LinkedHashMap linkedHashMap;
        ArrayList arrayList3;
        ChatSessionStatus chatSessionStatus2;
        TokenInfo tokenInfo3;
        RealChatManager$onFullResponse$1 realChatManager$onFullResponse$12;
        List<Message> list3;
        Iterator it2;
        ChatActivity chatActivity;
        PatternRedaction patternRedaction;
        String str5 = str;
        GetMessagesResponse getMessagesResponse2 = getMessagesResponse;
        Map map3 = realChatManager.pluginRegistry.plugins;
        ErrorReporter errorReporter = realChatManager.errorReporter;
        LinkedHashMap linkedHashMap2 = realChatManager.sessionCursors;
        LinkedHashMap linkedHashMap3 = realChatManager.sessionIdToChat;
        if (continuationImpl instanceof RealChatManager$onFullResponse$1) {
            realChatManager$onFullResponse$1 = (RealChatManager$onFullResponse$1) continuationImpl;
            int i3 = realChatManager$onFullResponse$1.label;
            if ((i3 & PKIFailureInfo.systemUnavail) != 0) {
                realChatManager$onFullResponse$1.label = i3 - PKIFailureInfo.systemUnavail;
                Object obj = realChatManager$onFullResponse$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realChatManager$onFullResponse$1.label;
                if (i != 0) {
                    str2 = null;
                    SafeTrace.throwOnFailure(obj);
                    if (getMessagesResponse2 == null) {
                        return linkedHashMap3.get(str5);
                    }
                    List<Message> list4 = getMessagesResponse2.messages;
                    String str6 = (String) linkedHashMap2.get(str5);
                    str3 = getMessagesResponse2.next_cursor;
                    ChatSessionStatus chatSessionStatus3 = getMessagesResponse2.status;
                    ErrorReporter.DefaultSamplingStrategy defaultSamplingStrategy = ErrorReporter.DefaultSamplingStrategy.INSTANCE;
                    if (chatSessionStatus3 == null) {
                        errorReporter.report(new GeneralMoneybotError(Recorder$$ExternalSyntheticOutline2.m("Chat status is null for session ", str5)), defaultSamplingStrategy);
                        chatSessionStatus3 = ChatSessionStatus.CHAT_SESSION_STATUS_UNSPECIFIED;
                    }
                    ChatSessionStatus chatSessionStatus4 = chatSessionStatus3;
                    List<Activity> list5 = getMessagesResponse2.session_activities;
                    ArrayList arrayList4 = new ArrayList();
                    Iterator it3 = list5.iterator();
                    while (it3.hasNext()) {
                        Map map4 = map3;
                        Activity activity = (Activity) it3.next();
                        try {
                            chatActivity = ChatActivityMappersKt.toChatActivity$default(realChatManager, activity, map4.keySet());
                            realChatManager$onFullResponse$12 = realChatManager$onFullResponse$1;
                            list3 = list4;
                            it2 = it3;
                        } catch (Exception e) {
                            realChatManager$onFullResponse$12 = realChatManager$onFullResponse$1;
                            list3 = list4;
                            it2 = it3;
                            errorReporter.report(new GeneralMoneybotError(CameraSelector$$ExternalSyntheticOutline0.m("Error parsing chat activity (", activity.id, ") for session ", str5), e), defaultSamplingStrategy);
                            chatActivity = null;
                        }
                        if (chatActivity != null) {
                            arrayList4.add(chatActivity);
                        }
                        it3 = it2;
                        map3 = map4;
                        realChatManager$onFullResponse$1 = realChatManager$onFullResponse$12;
                        list4 = list3;
                    }
                    map = map3;
                    RealChatManager$onFullResponse$1 realChatManager$onFullResponse$13 = realChatManager$onFullResponse$1;
                    List<Message> list6 = list4;
                    TokenUsageInfo tokenUsageInfo = getMessagesResponse2.token_usage_info;
                    if (tokenUsageInfo != null) {
                        String str7 = tokenUsageInfo.model_name;
                        Integer num = tokenUsageInfo.token_limit;
                        Integer num2 = tokenUsageInfo.token_usage;
                        TokenInfo tokenInfo4 = new TokenInfo(str7, num, num2);
                        if (str7 == null && num == null && num2 == null) {
                            tokenInfo4 = null;
                        }
                        tokenInfo = tokenInfo4;
                    } else {
                        tokenInfo = null;
                    }
                    linkedHashMap2.put(str5, str3);
                    if (list6.isEmpty()) {
                        Chat chat = (Chat) linkedHashMap3.get(str5);
                        if (chat == null) {
                            return null;
                        }
                        arrayList = arrayList4;
                        linkedHashMap3.put(str5, Chat.copy$default(chat, getMessagesResponse2.session_name, null, arrayList, chatSessionStatus4, tokenInfo, 2));
                    } else {
                        arrayList = arrayList4;
                    }
                    containsKey = realChatManager.lastFinishedTokenizedMessage.containsKey(str5);
                    if (!containsKey && (Intrinsics.areEqual(str6, str3) || str3 == null)) {
                        Chat chat2 = (Chat) linkedHashMap3.get(str5);
                        if (chat2 == null || (list = chat2.messages) == null) {
                            list = EmptyList.INSTANCE;
                        }
                        list2 = list;
                        linkedHashMap = linkedHashMap3;
                        arrayList3 = arrayList;
                        chatSessionStatus2 = chatSessionStatus4;
                        tokenInfo3 = tokenInfo;
                        Chat chat3 = new Chat(getMessagesResponse2.session_name, list2, arrayList3, chatSessionStatus2, tokenInfo3);
                        linkedHashMap.put(str5, chat3);
                        RealMoneybotChatMessagesCache realMoneybotChatMessagesCache = realChatManager.chatMessagesCache;
                        str5.getClass();
                        realMoneybotChatMessagesCache.cachedChats.put(str5, new CachedChat(chat3, str3, realMoneybotChatMessagesCache.clock.millis()));
                        return chat3;
                    }
                    Chat chat4 = (Chat) linkedHashMap3.get(str5);
                    if (chat4 == null || (iterable = chat4.messages) == null) {
                        iterable = EmptyList.INSTANCE;
                    }
                    Iterable iterable2 = iterable;
                    int mapCapacity = MapsKt__MapsJVMKt.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable2, 10));
                    if (mapCapacity < 16) {
                        mapCapacity = 16;
                    }
                    LinkedHashMap linkedHashMap4 = new LinkedHashMap(mapCapacity);
                    for (Object obj2 : iterable2) {
                        linkedHashMap4.put(((MessageList) obj2).messageId, obj2);
                    }
                    LinkedHashMap linkedHashMap5 = new LinkedHashMap(linkedHashMap4);
                    i2 = 0;
                    map2 = linkedHashMap5;
                    it = list6.iterator();
                    str4 = str3;
                    arrayList2 = arrayList;
                    chatSessionStatus = chatSessionStatus4;
                    tokenInfo2 = tokenInfo;
                    realChatManager$onFullResponse$1 = realChatManager$onFullResponse$13;
                    if (it.hasNext()) {
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    int i4 = realChatManager$onFullResponse$1.I$0;
                    boolean z = realChatManager$onFullResponse$1.Z$0;
                    map2 = realChatManager$onFullResponse$1.L$16;
                    Iterator it4 = realChatManager$onFullResponse$1.L$13;
                    tokenInfo2 = realChatManager$onFullResponse$1.L$8;
                    List list7 = realChatManager$onFullResponse$1.L$7;
                    chatSessionStatus = realChatManager$onFullResponse$1.L$6;
                    str4 = realChatManager$onFullResponse$1.L$5;
                    GetMessagesResponse getMessagesResponse3 = realChatManager$onFullResponse$1.L$2;
                    String str8 = realChatManager$onFullResponse$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                    map = map3;
                    it = it4;
                    LinkedHashMap linkedHashMap6 = linkedHashMap3;
                    i2 = i4;
                    str5 = str8;
                    ArrayList arrayList5 = list7;
                    MessageList messageList = (MessageList) obj;
                    map2.put(messageList.messageId, messageList);
                    containsKey = z;
                    getMessagesResponse2 = getMessagesResponse3;
                    linkedHashMap3 = linkedHashMap6;
                    str2 = null;
                    arrayList2 = arrayList5;
                    if (it.hasNext()) {
                        Message message = (Message) it.next();
                        Set keySet = map.keySet();
                        message.getClass();
                        keySet.getClass();
                        Map map5 = map2;
                        ArrayList arrayList6 = arrayList2;
                        PatternRedaction patternRedaction2 = new PatternRedaction(str2, str5, 1);
                        try {
                            try {
                                ProtoValidationScope protoValidationScope = new ProtoValidationScope(message, patternRedaction2, realChatManager);
                                linkedHashMap6 = linkedHashMap3;
                                String str9 = (String) protoValidationScope.reportIfNullAndContinue("id", (String) null, message.id);
                                Long l = (Long) protoValidationScope.reportIfNullAndContinue("created_at", (String) null, message.created);
                                Message.Role role = MessageMappersKt.toRole(protoValidationScope, message.role);
                                List<MessageContent> list8 = message.content;
                                ArrayList arrayList7 = new ArrayList();
                                Iterator it5 = list8.iterator();
                                while (it5.hasNext()) {
                                    ProtoValidationScope protoValidationScope2 = protoValidationScope;
                                    com.squareup.cash.moneybot.backend.api.model.chat.Message message$default = MessageMappersKt.toMessage$default(protoValidationScope2, (MessageContent) it5.next(), patternRedaction, role, str9, l, false, keySet, 32);
                                    Iterator it6 = it5;
                                    PatternRedaction patternRedaction3 = patternRedaction;
                                    String str10 = str9;
                                    Long l2 = l;
                                    if (message$default != null) {
                                        arrayList7.add(message$default);
                                    }
                                    l = l2;
                                    patternRedaction = patternRedaction3;
                                    str9 = str10;
                                    it5 = it6;
                                    protoValidationScope = protoValidationScope2;
                                }
                                MessageList messageList2 = new MessageList(str9, l, arrayList7);
                                realChatManager$onFullResponse$1.L$0 = str5;
                                realChatManager$onFullResponse$1.L$2 = getMessagesResponse2;
                                realChatManager$onFullResponse$1.L$5 = str4;
                                realChatManager$onFullResponse$1.L$6 = chatSessionStatus;
                                realChatManager$onFullResponse$1.L$7 = arrayList6;
                                realChatManager$onFullResponse$1.L$8 = tokenInfo2;
                                realChatManager$onFullResponse$1.L$13 = it;
                                realChatManager$onFullResponse$1.L$16 = map5;
                                realChatManager$onFullResponse$1.Z$0 = containsKey;
                                realChatManager$onFullResponse$1.I$0 = i2;
                                realChatManager$onFullResponse$1.label = 1;
                                Object formatMessages = realChatManager.formatMessages(messageList2, realChatManager$onFullResponse$1);
                                if (formatMessages == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                                arrayList5 = arrayList6;
                                getMessagesResponse3 = getMessagesResponse2;
                                z = containsKey;
                                obj = formatMessages;
                                map2 = map5;
                                MessageList messageList3 = (MessageList) obj;
                                map2.put(messageList3.messageId, messageList3);
                                containsKey = z;
                                getMessagesResponse2 = getMessagesResponse3;
                                linkedHashMap3 = linkedHashMap6;
                                str2 = null;
                                arrayList2 = arrayList5;
                                if (it.hasNext()) {
                                    linkedHashMap = linkedHashMap3;
                                    arrayList3 = arrayList2;
                                    list2 = CollectionsKt.sortedWith(CollectionsKt.toList(map2.values()), new b.C0008b(23));
                                    tokenInfo3 = tokenInfo2;
                                    chatSessionStatus2 = chatSessionStatus;
                                    str3 = str4;
                                    Chat chat32 = new Chat(getMessagesResponse2.session_name, list2, arrayList3, chatSessionStatus2, tokenInfo3);
                                    linkedHashMap.put(str5, chat32);
                                    RealMoneybotChatMessagesCache realMoneybotChatMessagesCache2 = realChatManager.chatMessagesCache;
                                    str5.getClass();
                                    realMoneybotChatMessagesCache2.cachedChats.put(str5, new CachedChat(chat32, str3, realMoneybotChatMessagesCache2.clock.millis()));
                                    return chat32;
                                }
                            } catch (Exception e2) {
                                e = e2;
                                patternRedaction2 = patternRedaction;
                                throw RotateKt.toProtoParsingExceptionFor(e, Reflection.factory.getOrCreateKotlinClass(com.squareup.protos.cash.kgoose.api.v3.Message.class), patternRedaction2, null);
                            }
                            patternRedaction = patternRedaction2;
                        } catch (Exception e3) {
                            e = e3;
                        }
                    }
                }
            }
        }
        realChatManager$onFullResponse$1 = new RealChatManager$onFullResponse$1(realChatManager, continuationImpl);
        Object obj3 = realChatManager$onFullResponse$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realChatManager$onFullResponse$1.label;
        if (i != 0) {
        }
    }

    public static boolean isVisibleUserSentMessage(InputMessage inputMessage) {
        if (Intrinsics.areEqual(inputMessage.hidden, Boolean.TRUE)) {
            return false;
        }
        Role role = inputMessage.role;
        if (role != null && role != Role.ROLE_USER) {
            return false;
        }
        List<MessageContent> list = inputMessage.message_contents;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            MessageContent.Content content = ((MessageContent) it.next()).content;
            if ((content instanceof MessageContent.Content.Image) || (content instanceof MessageContent.Content.Text)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object cancelLastUserMessage(String str, ContinuationImpl continuationImpl) {
        RealChatManager$cancelLastUserMessage$1 realChatManager$cancelLastUserMessage$1;
        int i;
        ApiResult apiResult;
        if (continuationImpl instanceof RealChatManager$cancelLastUserMessage$1) {
            realChatManager$cancelLastUserMessage$1 = (RealChatManager$cancelLastUserMessage$1) continuationImpl;
            int i2 = realChatManager$cancelLastUserMessage$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realChatManager$cancelLastUserMessage$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realChatManager$cancelLastUserMessage$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realChatManager$cancelLastUserMessage$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    CancelLastUserMessageRequest cancelLastUserMessageRequest = new CancelLastUserMessageRequest(null, str, ByteString.EMPTY);
                    realChatManager$cancelLastUserMessage$1.L$0 = str;
                    realChatManager$cancelLastUserMessage$1.label = 1;
                    obj = this.kgooseService.cancelLastUserMessage(cancelLastUserMessageRequest, realChatManager$cancelLastUserMessage$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = realChatManager$cancelLastUserMessage$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                }
                apiResult = (ApiResult) obj;
                if (apiResult instanceof ApiResult.Failure) {
                    this.analyticsService.submitChatError(str, AnalyticsMappersKt.toErrorName((ApiResult.Failure) apiResult), "cancelLastUserMessage");
                }
                return apiResult;
            }
        }
        realChatManager$cancelLastUserMessage$1 = new RealChatManager$cancelLastUserMessage$1(this, continuationImpl);
        Object obj2 = realChatManager$cancelLastUserMessage$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realChatManager$cancelLastUserMessage$1.label;
        if (i != 0) {
        }
        apiResult = (ApiResult) obj2;
        if (apiResult instanceof ApiResult.Failure) {
        }
        return apiResult;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object deleteChat(String str, ContinuationImpl continuationImpl) {
        RealChatManager$deleteChat$1 realChatManager$deleteChat$1;
        int i;
        ApiResult apiResult;
        boolean z;
        if (continuationImpl instanceof RealChatManager$deleteChat$1) {
            realChatManager$deleteChat$1 = (RealChatManager$deleteChat$1) continuationImpl;
            int i2 = realChatManager$deleteChat$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realChatManager$deleteChat$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realChatManager$deleteChat$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realChatManager$deleteChat$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    DeleteUserSessionRequest deleteUserSessionRequest = new DeleteUserSessionRequest(str, null, null, ByteString.EMPTY);
                    realChatManager$deleteChat$1.L$0 = str;
                    realChatManager$deleteChat$1.label = 1;
                    obj = this.kgooseService.deleteUserSession(deleteUserSessionRequest, realChatManager$deleteChat$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = realChatManager$deleteChat$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                }
                apiResult = (ApiResult) obj;
                z = apiResult instanceof ApiResult.Failure;
                if (z) {
                    this.analyticsService.submitChatError(str, AnalyticsMappersKt.toErrorName((ApiResult.Failure) apiResult), "deleteUserSession");
                }
                if (!(apiResult instanceof ApiResult.Success)) {
                    apiResult = new ApiResult.Success(Unit.INSTANCE);
                } else if (!z) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                if (apiResult instanceof ApiResult.Success) {
                    str.getClass();
                    RealMoneybotChatMessagesCache realMoneybotChatMessagesCache = this.chatMessagesCache;
                    realMoneybotChatMessagesCache.cachedChats.remove(str);
                    realMoneybotChatMessagesCache.deletedSessionIds.add(str);
                    this.sessionIdToChat.remove(str);
                    this.sessionCursors.remove(str);
                    this.lastFinishedTokenizedMessage.remove(str);
                }
                return apiResult;
            }
        }
        realChatManager$deleteChat$1 = new RealChatManager$deleteChat$1(this, continuationImpl);
        Object obj2 = realChatManager$deleteChat$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realChatManager$deleteChat$1.label;
        if (i != 0) {
        }
        apiResult = (ApiResult) obj2;
        z = apiResult instanceof ApiResult.Failure;
        if (z) {
        }
        if (!(apiResult instanceof ApiResult.Success)) {
        }
        if (apiResult instanceof ApiResult.Success) {
        }
        return apiResult;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object executeTool(String str, String str2, String str3, String str4, String str5, ContinuationImpl continuationImpl) {
        RealChatManager$executeTool$1 realChatManager$executeTool$1;
        int i;
        String str6;
        Object obj;
        if (continuationImpl instanceof RealChatManager$executeTool$1) {
            realChatManager$executeTool$1 = (RealChatManager$executeTool$1) continuationImpl;
            int i2 = realChatManager$executeTool$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realChatManager$executeTool$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj2 = realChatManager$executeTool$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realChatManager$executeTool$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj2);
                    ExecuteToolRequest executeToolRequest = new ExecuteToolRequest(str, str2, str3, str4, str5, ByteString.EMPTY);
                    realChatManager$executeTool$1.L$3 = str4;
                    realChatManager$executeTool$1.label = 1;
                    obj2 = this.toolEndpointService.executeTool(executeToolRequest, realChatManager$executeTool$1);
                    if (obj2 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    str6 = str4;
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str6 = realChatManager$executeTool$1.L$3;
                    SafeTrace.throwOnFailure(obj2);
                }
                obj = (ApiResult) obj2;
                if (!(obj instanceof ApiResult.Failure)) {
                    if (!(obj instanceof ApiResult.Success)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    ExecuteToolResponse.Result result = ((ExecuteToolResponse) ((ApiResult.Success) obj).response).result;
                    if (result instanceof ExecuteToolResponse.Result.Error) {
                        obj = new ApiResult.Failure.NetworkFailure(new IllegalArgumentException(((ExecuteToolResponse.Result.Error) result).getValue().message));
                    } else if (result instanceof ExecuteToolResponse.Result.Success) {
                        obj = new ApiResult.Success(new ExecuteToolResult(((ExecuteToolResponse.Result.Success) result).getValue().client_route_url));
                    } else {
                        if (result != null) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        obj = new ApiResult.Failure.NetworkFailure(new IllegalArgumentException("ExecuteToolResponse result is missing"));
                    }
                }
                if (obj instanceof ApiResult.Failure) {
                    this.analyticsService.submitChatError(str6, AnalyticsMappersKt.toErrorName((ApiResult.Failure) obj), "executeTool");
                }
                return obj;
            }
        }
        realChatManager$executeTool$1 = new RealChatManager$executeTool$1(this, continuationImpl);
        Object obj22 = realChatManager$executeTool$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realChatManager$executeTool$1.label;
        if (i != 0) {
        }
        obj = (ApiResult) obj22;
        if (!(obj instanceof ApiResult.Failure)) {
        }
        if (obj instanceof ApiResult.Failure) {
        }
        return obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Type inference failed for: r11v0, types: [com.squareup.cash.moneybot.backend.real.managers.RealChatManager] */
    /* JADX WARN: Type inference failed for: r9v7, types: [java.util.Collection] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0089 -> B:10:0x008e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object formatMessages(MessageList messageList, ContinuationImpl continuationImpl) {
        RealChatManager$formatMessages$1 realChatManager$formatMessages$1;
        int i;
        ArrayList arrayList;
        int i2;
        Iterator it;
        int i3;
        int i4;
        if (continuationImpl instanceof RealChatManager$formatMessages$1) {
            realChatManager$formatMessages$1 = (RealChatManager$formatMessages$1) continuationImpl;
            int i5 = realChatManager$formatMessages$1.label;
            if ((i5 & PKIFailureInfo.systemUnavail) != 0) {
                realChatManager$formatMessages$1.label = i5 - PKIFailureInfo.systemUnavail;
                Object obj = realChatManager$formatMessages$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realChatManager$formatMessages$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(messageList, 10));
                    i2 = 0;
                    it = messageList.messages.iterator();
                    i3 = 0;
                    if (!it.hasNext()) {
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    int i6 = realChatManager$formatMessages$1.I$1;
                    i3 = realChatManager$formatMessages$1.I$0;
                    Collection collection = realChatManager$formatMessages$1.L$8;
                    MessageList messageList2 = realChatManager$formatMessages$1.L$7;
                    com.squareup.cash.moneybot.backend.api.model.chat.Message message = realChatManager$formatMessages$1.L$6;
                    it = realChatManager$formatMessages$1.L$4;
                    Collection collection2 = realChatManager$formatMessages$1.L$3;
                    SafeTrace.throwOnFailure(obj);
                    ArrayList arrayList2 = collection2;
                    com.squareup.cash.moneybot.backend.api.model.chat.Message message2 = (Message.ToolResponse) obj;
                    if (message2 == null) {
                        MessageList messageList3 = messageList2;
                        i4 = i6;
                        messageList = messageList3;
                    } else {
                        Collection collection3 = collection;
                        int i7 = i6;
                        messageList = messageList2;
                        i4 = i7;
                        collection = collection3;
                        message2 = message;
                    }
                    collection.add(message2);
                    i2 = i4;
                    arrayList = arrayList2;
                    if (!it.hasNext()) {
                        message = (com.squareup.cash.moneybot.backend.api.model.chat.Message) it.next();
                        Message.ToolResponse toolResponse = message instanceof Message.ToolResponse ? (Message.ToolResponse) message : null;
                        if (toolResponse != null) {
                            ArrayList arrayList3 = arrayList;
                            realChatManager$formatMessages$1.L$3 = arrayList3;
                            realChatManager$formatMessages$1.L$4 = it;
                            realChatManager$formatMessages$1.L$6 = message;
                            realChatManager$formatMessages$1.L$7 = messageList;
                            realChatManager$formatMessages$1.L$8 = arrayList3;
                            realChatManager$formatMessages$1.I$0 = i3;
                            realChatManager$formatMessages$1.I$1 = i2;
                            realChatManager$formatMessages$1.label = 1;
                            Object formatResponseActivity = formatResponseActivity(toolResponse, realChatManager$formatMessages$1);
                            if (formatResponseActivity == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            ArrayList arrayList4 = arrayList;
                            obj = formatResponseActivity;
                            messageList2 = messageList;
                            i6 = i2;
                            collection = arrayList4;
                            arrayList2 = arrayList4;
                            com.squareup.cash.moneybot.backend.api.model.chat.Message message22 = (Message.ToolResponse) obj;
                            if (message22 == null) {
                            }
                            collection.add(message22);
                            i2 = i4;
                            arrayList = arrayList2;
                            if (!it.hasNext()) {
                                return MessageList.copy$default(messageList, arrayList);
                            }
                        } else {
                            arrayList2 = arrayList;
                            i4 = i2;
                            collection = arrayList;
                            message22 = message;
                            collection.add(message22);
                            i2 = i4;
                            arrayList = arrayList2;
                            if (!it.hasNext()) {
                            }
                        }
                    }
                }
            }
        }
        realChatManager$formatMessages$1 = new RealChatManager$formatMessages$1(this, continuationImpl);
        Object obj2 = realChatManager$formatMessages$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realChatManager$formatMessages$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Type inference failed for: r14v5, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r1v20, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r7v17, types: [java.util.Collection] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0116 -> B:10:0x0128). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x014f -> B:13:0x0155). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00a8 -> B:16:0x00c6). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x0193 -> B:27:0x0196). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object formatResponseActivity(Message.ToolResponse toolResponse, ContinuationImpl continuationImpl) {
        RealChatManager$formatResponseActivity$1 realChatManager$formatResponseActivity$1;
        int i;
        ClientRenderable.ActivityList activityList;
        Message.ToolResponse toolResponse2;
        ArrayList arrayList;
        Iterator it;
        int i2;
        int i3;
        ClientRenderable.ActivityList activityList2;
        int i4;
        int i5;
        int i6;
        Message.ToolResponse toolResponse3;
        Message.ToolResponse.UserContent userContent;
        Object obj;
        CoroutineSingletons coroutineSingletons;
        Iterator it2;
        ArrayList arrayList2;
        RealChatManager realChatManager = this;
        if (continuationImpl instanceof RealChatManager$formatResponseActivity$1) {
            realChatManager$formatResponseActivity$1 = (RealChatManager$formatResponseActivity$1) continuationImpl;
            int i7 = realChatManager$formatResponseActivity$1.label;
            if ((i7 & PKIFailureInfo.systemUnavail) != 0) {
                realChatManager$formatResponseActivity$1.label = i7 - PKIFailureInfo.systemUnavail;
                Object obj2 = realChatManager$formatResponseActivity$1.result;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realChatManager$formatResponseActivity$1.label;
                if (i != 0) {
                    activityList = null;
                    SafeTrace.throwOnFailure(obj2);
                    toolResponse2 = toolResponse;
                    List list = toolResponse2.results;
                    arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
                    it = list.iterator();
                    i2 = 0;
                    i3 = 0;
                    if (it.hasNext()) {
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    int i8 = realChatManager$formatResponseActivity$1.I$6;
                    int i9 = realChatManager$formatResponseActivity$1.I$5;
                    int i10 = realChatManager$formatResponseActivity$1.I$4;
                    int i11 = realChatManager$formatResponseActivity$1.I$3;
                    int i12 = realChatManager$formatResponseActivity$1.I$2;
                    int i13 = realChatManager$formatResponseActivity$1.I$1;
                    int i14 = realChatManager$formatResponseActivity$1.I$0;
                    Collection collection = realChatManager$formatResponseActivity$1.L$17;
                    Message.ToolResponse toolResponse4 = realChatManager$formatResponseActivity$1.L$16;
                    Iterator it3 = realChatManager$formatResponseActivity$1.L$12;
                    activityList = null;
                    Collection collection2 = realChatManager$formatResponseActivity$1.L$10;
                    ClientRenderable.ActivityList activityList3 = realChatManager$formatResponseActivity$1.L$8;
                    Message.ToolResponse.UserContent userContent2 = realChatManager$formatResponseActivity$1.L$6;
                    Iterator it4 = realChatManager$formatResponseActivity$1.L$4;
                    Collection collection3 = realChatManager$formatResponseActivity$1.L$3;
                    SafeTrace.throwOnFailure(obj2);
                    RealChatManager$formatResponseActivity$1 realChatManager$formatResponseActivity$12 = realChatManager$formatResponseActivity$1;
                    ArrayList arrayList3 = collection3;
                    Object obj3 = obj2;
                    ArrayList arrayList4 = collection;
                    int i15 = i13;
                    int i16 = i11;
                    Iterator it5 = it3;
                    int i17 = i8;
                    RealChatManager$formatResponseActivity$1 realChatManager$formatResponseActivity$13 = realChatManager$formatResponseActivity$12;
                    ArrayList arrayList5 = collection2;
                    CoroutineSingletons coroutineSingletons3 = coroutineSingletons2;
                    Message.ToolResponse.UserContent userContent3 = userContent2;
                    if (obj3 instanceof ActivityItem) {
                        int i18 = i10;
                        activityList2 = activityList3;
                        toolResponse3 = toolResponse4;
                        i4 = i14;
                        i6 = i12;
                        i5 = i18;
                        userContent = userContent3;
                        it2 = it4;
                        arrayList2 = arrayList5;
                        coroutineSingletons = coroutineSingletons3;
                        obj = activityList;
                    } else {
                        Object obj4 = (ActivityItem) obj3;
                        CoroutineSingletons coroutineSingletons4 = coroutineSingletons3;
                        obj = obj4;
                        it2 = it4;
                        coroutineSingletons = coroutineSingletons4;
                        int i19 = i10;
                        activityList2 = activityList3;
                        toolResponse3 = toolResponse4;
                        i4 = i14;
                        i6 = i12;
                        i5 = i19;
                        userContent = userContent3;
                        arrayList2 = arrayList5;
                    }
                    if (obj != null) {
                        arrayList2.add(obj);
                    }
                    ArrayList arrayList6 = arrayList3;
                    ArrayList arrayList7 = arrayList2;
                    realChatManager$formatResponseActivity$1 = realChatManager$formatResponseActivity$13;
                    coroutineSingletons2 = coroutineSingletons;
                    it = it2;
                    realChatManager = this;
                    if (!it5.hasNext()) {
                        arrayList5 = arrayList7;
                        obj = (ActivityItem) it5.next();
                        coroutineSingletons = coroutineSingletons2;
                        if (obj instanceof PaymentHistoryActivityItem) {
                            realChatManager$formatResponseActivity$1.L$3 = arrayList6;
                            realChatManager$formatResponseActivity$1.L$4 = it;
                            realChatManager$formatResponseActivity$1.L$6 = userContent;
                            realChatManager$formatResponseActivity$1.L$8 = activityList2;
                            realChatManager$formatResponseActivity$1.L$10 = arrayList5;
                            realChatManager$formatResponseActivity$1.L$12 = it5;
                            realChatManager$formatResponseActivity$1.L$16 = toolResponse3;
                            realChatManager$formatResponseActivity$1.L$17 = arrayList4;
                            realChatManager$formatResponseActivity$1.I$0 = i4;
                            realChatManager$formatResponseActivity$1.I$1 = i15;
                            realChatManager$formatResponseActivity$1.I$2 = i6;
                            realChatManager$formatResponseActivity$1.I$3 = i16;
                            realChatManager$formatResponseActivity$1.I$4 = i5;
                            realChatManager$formatResponseActivity$1.I$5 = i9;
                            realChatManager$formatResponseActivity$1.I$6 = i17;
                            realChatManager$formatResponseActivity$1.label = 1;
                            Object format$default = ZiplineActivityItemFormatter.format$default(realChatManager.activityItemFormatter, (PaymentHistoryActivityItem) obj, realChatManager$formatResponseActivity$1);
                            coroutineSingletons3 = coroutineSingletons;
                            if (format$default == coroutineSingletons3) {
                                return coroutineSingletons3;
                            }
                            userContent3 = userContent;
                            obj3 = format$default;
                            int i20 = i4;
                            toolResponse4 = toolResponse3;
                            activityList3 = activityList2;
                            i10 = i5;
                            i12 = i6;
                            i14 = i20;
                            it4 = it;
                            realChatManager$formatResponseActivity$13 = realChatManager$formatResponseActivity$1;
                            arrayList3 = arrayList6;
                            if (obj3 instanceof ActivityItem) {
                            }
                            if (obj != null) {
                            }
                            ArrayList arrayList62 = arrayList3;
                            ArrayList arrayList72 = arrayList2;
                            realChatManager$formatResponseActivity$1 = realChatManager$formatResponseActivity$13;
                            coroutineSingletons2 = coroutineSingletons;
                            it = it2;
                            realChatManager = this;
                            if (!it5.hasNext()) {
                                CoroutineSingletons coroutineSingletons5 = coroutineSingletons2;
                                ArrayList arrayList8 = arrayList72;
                                String str = activityList2.requestId;
                                int i21 = activityList2.version;
                                String str2 = activityList2.title;
                                boolean z = activityList2.hasMore;
                                ClientRenderableTapAction clientRenderableTapAction = activityList2.tapAction;
                                arrayList8.getClass();
                                ClientRenderable.ActivityList activityList4 = new ClientRenderable.ActivityList(str, i21, str2, arrayList8, z, clientRenderableTapAction);
                                ArrayList arrayList9 = arrayList62;
                                toolResponse2 = toolResponse3;
                                i3 = i15;
                                i2 = i4;
                                arrayList = arrayList4;
                                Message.ToolResponse.UserContent userContent4 = activityList4;
                                arrayList.add(userContent4);
                                arrayList = arrayList9;
                                coroutineSingletons2 = coroutineSingletons5;
                                realChatManager = this;
                                if (it.hasNext()) {
                                    userContent4 = (Message.ToolResponse.UserContent) it.next();
                                    activityList2 = userContent4 instanceof ClientRenderable.ActivityList ? (ClientRenderable.ActivityList) userContent4 : activityList;
                                    if (activityList2 != null) {
                                        List list2 = ((ClientRenderable.ActivityList) userContent4).rows;
                                        ArrayList arrayList10 = new ArrayList();
                                        it5 = list2.iterator();
                                        arrayList62 = arrayList;
                                        arrayList4 = arrayList62;
                                        i4 = i2;
                                        i15 = i3;
                                        arrayList72 = arrayList10;
                                        i17 = 0;
                                        i5 = 0;
                                        i16 = 0;
                                        i6 = 0;
                                        toolResponse3 = toolResponse2;
                                        userContent = userContent4;
                                        i9 = 0;
                                        if (!it5.hasNext()) {
                                        }
                                    } else {
                                        coroutineSingletons5 = coroutineSingletons2;
                                        arrayList9 = arrayList;
                                        arrayList.add(userContent4);
                                        arrayList = arrayList9;
                                        coroutineSingletons2 = coroutineSingletons5;
                                        realChatManager = this;
                                        if (it.hasNext()) {
                                            ArrayList arrayList11 = arrayList;
                                            String str3 = toolResponse2.messageId;
                                            Message.Role role = toolResponse2.role;
                                            Long l = toolResponse2.created;
                                            String str4 = toolResponse2.requestId;
                                            Message.ToolResponse.ToolStatus toolStatus = toolResponse2.status;
                                            String str5 = toolResponse2.error;
                                            boolean z2 = toolResponse2.hiddenByServer;
                                            arrayList11.getClass();
                                            return new Message.ToolResponse(str3, role, l, str4, arrayList11, toolStatus, str5, z2);
                                        }
                                    }
                                }
                            }
                        } else {
                            it2 = it;
                            arrayList2 = arrayList5;
                            realChatManager$formatResponseActivity$13 = realChatManager$formatResponseActivity$1;
                            arrayList3 = arrayList62;
                            if (obj != null) {
                            }
                            ArrayList arrayList622 = arrayList3;
                            ArrayList arrayList722 = arrayList2;
                            realChatManager$formatResponseActivity$1 = realChatManager$formatResponseActivity$13;
                            coroutineSingletons2 = coroutineSingletons;
                            it = it2;
                            realChatManager = this;
                            if (!it5.hasNext()) {
                            }
                        }
                    }
                }
            }
        }
        realChatManager$formatResponseActivity$1 = new RealChatManager$formatResponseActivity$1(realChatManager, continuationImpl);
        Object obj22 = realChatManager$formatResponseActivity$1.result;
        CoroutineSingletons coroutineSingletons22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realChatManager$formatResponseActivity$1.label;
        if (i != 0) {
        }
    }

    public final CachedChat getCachedChat(String str) {
        str.getClass();
        CachedChat cachedChat = (CachedChat) this.chatMessagesCache.cachedChats.get(str);
        Chat chat = cachedChat != null ? cachedChat.chat : null;
        String str2 = cachedChat != null ? cachedChat.cursor : null;
        long j = cachedChat != null ? cachedChat.updatedAtMs : 0L;
        CachedChat cachedChat2 = new CachedChat(chat, str2, j);
        if (chat == null || this.clock.millis() - j >= this.recentStalenessThresholdMs) {
            return null;
        }
        return cachedChat2;
    }

    @Override // com.squareup.cash.observability.protovalidation.HasObservability
    public final ErrorReporter getErrorReporter() {
        return this.errorReporter;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getMessages(String str, ContinuationImpl continuationImpl) {
        RealChatManager$getMessages$1 realChatManager$getMessages$1;
        int i;
        ApiResult apiResult;
        if (continuationImpl instanceof RealChatManager$getMessages$1) {
            realChatManager$getMessages$1 = (RealChatManager$getMessages$1) continuationImpl;
            int i2 = realChatManager$getMessages$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realChatManager$getMessages$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realChatManager$getMessages$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realChatManager$getMessages$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    GetMessagesRequest getMessagesRequest = new GetMessagesRequest(str);
                    realChatManager$getMessages$1.L$1 = str;
                    realChatManager$getMessages$1.label = 1;
                    obj = this.kgooseService.getMessages(getMessagesRequest, realChatManager$getMessages$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = realChatManager$getMessages$1.L$1;
                    SafeTrace.throwOnFailure(obj);
                }
                apiResult = (ApiResult) obj;
                if (apiResult instanceof ApiResult.Failure) {
                    this.analyticsService.submitChatError(str, AnalyticsMappersKt.toErrorName((ApiResult.Failure) apiResult), "getMessages");
                }
                return apiResult;
            }
        }
        realChatManager$getMessages$1 = new RealChatManager$getMessages$1(this, continuationImpl);
        Object obj2 = realChatManager$getMessages$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realChatManager$getMessages$1.label;
        if (i != 0) {
        }
        apiResult = (ApiResult) obj2;
        if (apiResult instanceof ApiResult.Failure) {
        }
        return apiResult;
    }

    @Override // com.squareup.cash.observability.protovalidation.HasObservability
    public final SampleStrategy getOneErrorPerAppSessionStrategy() {
        return this.oneErrorPerAppSessionStrategy;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getPresignedUrl(String str, String str2, ContinuationImpl continuationImpl) {
        RealChatManager$getPresignedUrl$1 realChatManager$getPresignedUrl$1;
        int i;
        ApiResult apiResult;
        boolean z;
        if (continuationImpl instanceof RealChatManager$getPresignedUrl$1) {
            realChatManager$getPresignedUrl$1 = (RealChatManager$getPresignedUrl$1) continuationImpl;
            int i2 = realChatManager$getPresignedUrl$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realChatManager$getPresignedUrl$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realChatManager$getPresignedUrl$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realChatManager$getPresignedUrl$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    GetPresignedUrlRequest getPresignedUrlRequest = new GetPresignedUrlRequest(str, str2, null, ByteString.EMPTY);
                    realChatManager$getPresignedUrl$1.label = 1;
                    obj = this.kgooseService.getPresignedUrl(getPresignedUrlRequest, realChatManager$getPresignedUrl$1);
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
                apiResult = (ApiResult) obj;
                z = apiResult instanceof ApiResult.Failure;
                if (z) {
                    this.analyticsService.submitChatError(null, AnalyticsMappersKt.toErrorName((ApiResult.Failure) apiResult), "getPresignedUrl");
                }
                if (apiResult instanceof ApiResult.Success) {
                    if (z) {
                        return apiResult;
                    }
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                String str3 = ((GetPresignedUrlResponse) ((ApiResult.Success) apiResult).response).presigned_url;
                if (str3 == null) {
                    str3 = "";
                }
                return new ApiResult.Success(str3);
            }
        }
        realChatManager$getPresignedUrl$1 = new RealChatManager$getPresignedUrl$1(this, continuationImpl);
        Object obj2 = realChatManager$getPresignedUrl$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realChatManager$getPresignedUrl$1.label;
        if (i != 0) {
        }
        apiResult = (ApiResult) obj2;
        z = apiResult instanceof ApiResult.Failure;
        if (z) {
        }
        if (apiResult instanceof ApiResult.Success) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getRuntimeMetadata(ContinuationImpl continuationImpl) {
        RealChatManager$getRuntimeMetadata$1 realChatManager$getRuntimeMetadata$1;
        int i;
        ApiResult apiResult;
        if (continuationImpl instanceof RealChatManager$getRuntimeMetadata$1) {
            realChatManager$getRuntimeMetadata$1 = (RealChatManager$getRuntimeMetadata$1) continuationImpl;
            int i2 = realChatManager$getRuntimeMetadata$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realChatManager$getRuntimeMetadata$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realChatManager$getRuntimeMetadata$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realChatManager$getRuntimeMetadata$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    GetRuntimeMetadataRequest getRuntimeMetadataRequest = new GetRuntimeMetadataRequest(new ChatContext(Source.SOURCE_MONEYBOT_CHAT, null, null, this.renderContextProvider.getRenderContext(), 4177918), Boolean.TRUE, ByteString.EMPTY);
                    realChatManager$getRuntimeMetadata$1.label = 1;
                    obj = this.kgooseService.getRuntimeMetadata(getRuntimeMetadataRequest, realChatManager$getRuntimeMetadata$1);
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
                apiResult = (ApiResult) obj;
                if (apiResult instanceof ApiResult.Failure) {
                    this.analyticsService.submitChatError(null, AnalyticsMappersKt.toErrorName((ApiResult.Failure) apiResult), "getRuntimeMetadata");
                }
                return apiResult;
            }
        }
        realChatManager$getRuntimeMetadata$1 = new RealChatManager$getRuntimeMetadata$1(this, continuationImpl);
        Object obj2 = realChatManager$getRuntimeMetadata$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realChatManager$getRuntimeMetadata$1.label;
        if (i != 0) {
        }
        apiResult = (ApiResult) obj2;
        if (apiResult instanceof ApiResult.Failure) {
        }
        return apiResult;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getUserSessions(Long l, ContinuationImpl continuationImpl) {
        RealChatManager$getUserSessions$1 realChatManager$getUserSessions$1;
        int i;
        ApiResult apiResult;
        boolean z;
        Session session;
        String str;
        if (continuationImpl instanceof RealChatManager$getUserSessions$1) {
            realChatManager$getUserSessions$1 = (RealChatManager$getUserSessions$1) continuationImpl;
            int i2 = realChatManager$getUserSessions$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realChatManager$getUserSessions$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realChatManager$getUserSessions$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realChatManager$getUserSessions$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    List listOf = CollectionsKt__CollectionsJVMKt.listOf(Source.SOURCE_MONEYBOT_CHAT);
                    Long l2 = new Long(25L);
                    EmptyList emptyList = EmptyList.INSTANCE;
                    GetUserSessionsRequest getUserSessionsRequest = new GetUserSessionsRequest(null, l2, l, null, emptyList, listOf, emptyList, null, ByteString.EMPTY);
                    realChatManager$getUserSessions$1.label = 1;
                    obj = this.kgooseService.getUserSessions(getUserSessionsRequest, realChatManager$getUserSessions$1);
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
                apiResult = (ApiResult) obj;
                z = apiResult instanceof ApiResult.Failure;
                if (z) {
                    this.analyticsService.submitChatError(null, AnalyticsMappersKt.toErrorName((ApiResult.Failure) apiResult), "getUserSessions");
                }
                if (apiResult instanceof ApiResult.Success) {
                    if (z) {
                        return apiResult;
                    }
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                GetUserSessionsResponse getUserSessionsResponse = (GetUserSessionsResponse) ((ApiResult.Success) apiResult).response;
                List<com.squareup.protos.cash.kgoose.api.v3.Session> list = getUserSessionsResponse.sessions;
                ArrayList arrayList = new ArrayList();
                for (com.squareup.protos.cash.kgoose.api.v3.Session session2 : list) {
                    session2.getClass();
                    PatternRedaction patternRedaction = new PatternRedaction((String) null, session2.id, false);
                    try {
                        String str2 = session2.id;
                        try {
                            ProtoValidationScope.required(str2, "id");
                            str = str2;
                        } catch (Exception e) {
                            getErrorReporter().report(RotateKt.toProtoParsingExceptionFor(e, Reflection.factory.getOrCreateKotlinClass(session2.getClass()), patternRedaction, null), getOneErrorPerAppSessionStrategy());
                            str = null;
                        }
                        if (str == null) {
                            session = null;
                        } else {
                            String str3 = session2.name;
                            Long l3 = session2.updated;
                            try {
                                ProtoValidationScope.required(l3, "updated");
                            } catch (Exception e2) {
                                getErrorReporter().report(RotateKt.toProtoParsingExceptionFor(e2, Reflection.factory.getOrCreateKotlinClass(session2.getClass()), patternRedaction, null), getOneErrorPerAppSessionStrategy());
                                l3 = null;
                            }
                            session = new Session(l3, str, str3);
                        }
                        if (session != null) {
                            arrayList.add(session);
                        }
                    } catch (Exception e3) {
                        throw RotateKt.toProtoParsingExceptionFor(e3, Reflection.factory.getOrCreateKotlinClass(com.squareup.protos.cash.kgoose.api.v3.Session.class), patternRedaction, null);
                    }
                }
                return new ApiResult.Success(new SessionPage(arrayList, getUserSessionsResponse.next_cursor));
            }
        }
        realChatManager$getUserSessions$1 = new RealChatManager$getUserSessions$1(this, continuationImpl);
        Object obj2 = realChatManager$getUserSessions$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realChatManager$getUserSessions$1.label;
        if (i != 0) {
        }
        apiResult = (ApiResult) obj2;
        z = apiResult instanceof ApiResult.Failure;
        if (z) {
        }
        if (apiResult instanceof ApiResult.Success) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x009e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object listSkills(ContinuationImpl continuationImpl) {
        RealChatManager$listSkills$1 realChatManager$listSkills$1;
        int i;
        ApiResult apiResult;
        String str;
        SlashCommand slashCommand;
        if (continuationImpl instanceof RealChatManager$listSkills$1) {
            realChatManager$listSkills$1 = (RealChatManager$listSkills$1) continuationImpl;
            int i2 = realChatManager$listSkills$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realChatManager$listSkills$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realChatManager$listSkills$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realChatManager$listSkills$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    ListSkillsRequest listSkillsRequest = new ListSkillsRequest(null, ByteString.EMPTY);
                    realChatManager$listSkills$1.label = 1;
                    obj = this.skillsService.listSkills(listSkillsRequest, realChatManager$listSkills$1);
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
                apiResult = (ApiResult) obj;
                if (apiResult instanceof ApiResult.Success) {
                    if (apiResult instanceof ApiResult.Failure) {
                        return apiResult;
                    }
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                List<Skill> list = ((ListSkillsResponse) ((ApiResult.Success) apiResult).response).skills;
                ArrayList arrayList = new ArrayList();
                for (Skill skill : list) {
                    skill.getClass();
                    com.squareup.protos.cash.kgoose.api.v3.SlashCommand slashCommand2 = skill.slash_command;
                    if (slashCommand2 != null && (str = slashCommand2.command) != null) {
                        String removePrefix = StringsKt.removePrefix("/", str);
                        String str2 = skill.slug;
                        if (str2 != null) {
                            String str3 = skill.name;
                            String str4 = str3 == null ? removePrefix : str3;
                            String str5 = slashCommand2.description;
                            if (str5 == null) {
                                str5 = "";
                            }
                            String str6 = str5;
                            Icon icon = slashCommand2.icon;
                            slashCommand = new SlashCommand(str2, removePrefix, str4, str6, icon != null ? icon.arcade_id : null);
                            if (slashCommand == null) {
                                arrayList.add(slashCommand);
                            }
                        }
                    }
                    slashCommand = null;
                    if (slashCommand == null) {
                    }
                }
                return new ApiResult.Success(arrayList);
            }
        }
        realChatManager$listSkills$1 = new RealChatManager$listSkills$1(this, continuationImpl);
        Object obj2 = realChatManager$listSkills$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realChatManager$listSkills$1.label;
        if (i != 0) {
        }
        apiResult = (ApiResult) obj2;
        if (apiResult instanceof ApiResult.Success) {
        }
    }

    public final Object sendMessages(String str, String str2, com.squareup.cash.moneybot.backend.api.model.chat.Message[] messageArr, ContinuationImpl continuationImpl) {
        Role role;
        MessageType messageType;
        int i;
        String str3;
        MessageContent.Content toolResponse;
        UserContent userContent;
        UserContent userContent2;
        ToolRequest.Result error;
        com.squareup.cash.moneybot.backend.api.model.chat.Message[] messageArr2 = messageArr;
        ArrayList arrayList = new ArrayList(messageArr2.length);
        int length = messageArr2.length;
        int i2 = 0;
        while (true) {
            int i3 = 2;
            if (i2 >= length) {
                return JobKt.withContext(this.computationContext, new RealChatManager$pushMessagesToKgoose$2(this, arrayList, str2, str, new MusicViewKt$$ExternalSyntheticLambda6(i3, this, str), null), continuationImpl);
            }
            com.squareup.cash.moneybot.backend.api.model.chat.Message message = messageArr2[i2];
            Message.Role role2 = message.getRole();
            role2.getClass();
            int ordinal = role2.ordinal();
            UserContent userContent3 = null;
            if (ordinal == 0) {
                role = Role.ROLE_UNSPECIFIED;
            } else if (ordinal == 1) {
                role = Role.ROLE_USER;
            } else if (ordinal == 2) {
                role = Role.ROLE_ASSISTANT;
            } else {
                if (ordinal != 3) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                role = Role.ROLE_SYSTEM;
            }
            Role role3 = role;
            boolean z = message instanceof Message.TextMessage;
            if (z) {
                messageType = MessageType.MESSAGE_TYPE_TEXT;
            } else if (message instanceof Message.ImageMessage) {
                messageType = MessageType.MESSAGE_TYPE_IMAGE;
            } else if (message instanceof Message.ToolRequest) {
                messageType = MessageType.MESSAGE_TYPE_TOOL_REQUEST;
            } else {
                if (!(message instanceof Message.ToolResponse)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                messageType = MessageType.MESSAGE_TYPE_TOOL_RESPONSE;
            }
            if (z) {
                toolResponse = new MessageContent.Content.Text(new TextContent(((Message.TextMessage) message).text));
            } else if (message instanceof Message.ImageMessage) {
                Message.ImageMessage imageMessage = (Message.ImageMessage) message;
                toolResponse = new MessageContent.Content.Image(new ImageContent(Boolean.valueOf(imageMessage.requiresPresignedUrl), imageMessage.data, imageMessage.mimeType, imageMessage.s3Uri, ByteString.EMPTY));
            } else {
                if (message instanceof Message.ToolRequest) {
                    Message.ToolRequest toolRequest = (Message.ToolRequest) message;
                    String str4 = toolRequest.requestId;
                    String str5 = toolRequest.tooltip;
                    Message.ToolRequest.ToolRequestContent toolRequestContent = toolRequest.content;
                    if (toolRequestContent instanceof Message.ToolRequest.ToolRequestContent.ToolCall) {
                        Message.ToolRequest.ToolRequestContent.ToolCall toolCall = (Message.ToolRequest.ToolRequestContent.ToolCall) toolRequestContent;
                        i = length;
                        error = new ToolRequest.Result.Value(new ToolCall(Boolean.valueOf(toolCall.needsApproval), toolCall.name, toolCall.arguments, ByteString.EMPTY));
                    } else {
                        i = length;
                        if (!(toolRequestContent instanceof Message.ToolRequest.ToolRequestContent.Error)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        error = new ToolRequest.Result.Error(((Message.ToolRequest.ToolRequestContent.Error) toolRequestContent).error);
                    }
                    toolResponse = new MessageContent.Content.ToolRequest(new ToolRequest(str4, null, error, str5, null, ByteString.EMPTY));
                } else {
                    i = length;
                    if (!(message instanceof Message.ToolResponse)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    Message.ToolResponse toolResponse2 = (Message.ToolResponse) message;
                    String str6 = toolResponse2.requestId;
                    int ordinal2 = toolResponse2.status.ordinal();
                    if (ordinal2 == 0) {
                        str3 = "";
                    } else if (ordinal2 == 1) {
                        str3 = "success";
                    } else {
                        if (ordinal2 != 2) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        str3 = BreadcrumbHelper.Category.ERROR;
                    }
                    String str7 = str3;
                    List<Message.ToolResponse.UserContent> list = toolResponse2.results;
                    ArrayList arrayList2 = new ArrayList();
                    for (Message.ToolResponse.UserContent userContent4 : list) {
                        userContent4.getClass();
                        if (userContent4 instanceof Message.ToolResponse.UserContent.Text) {
                            userContent = userContent3;
                            userContent2 = new UserContent(new UserContent.Content.Text(new TextContent(((Message.ToolResponse.UserContent.Text) userContent4).text)), ByteString.EMPTY);
                        } else {
                            userContent = userContent3;
                            if (!(userContent4 instanceof ClientRenderable)) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return userContent;
                            }
                            userContent2 = userContent;
                        }
                        if (userContent2 != null) {
                            arrayList2.add(userContent2);
                        }
                        userContent3 = userContent;
                    }
                    toolResponse = new MessageContent.Content.ToolResponse(new ToolResponse(str6, str7, toolResponse2.error, null, arrayList2, ByteString.EMPTY));
                }
                ByteString byteString = ByteString.EMPTY;
                arrayList.add(new InputMessage(CollectionsKt__CollectionsJVMKt.listOf(new MessageContent(messageType, toolResponse, byteString)), Boolean.valueOf(message.getHiddenByServer()), null, role3, null, byteString));
                i2++;
                messageArr2 = messageArr;
                length = i;
            }
            i = length;
            ByteString byteString2 = ByteString.EMPTY;
            arrayList.add(new InputMessage(CollectionsKt__CollectionsJVMKt.listOf(new MessageContent(messageType, toolResponse, byteString2)), Boolean.valueOf(message.getHiddenByServer()), null, role3, null, byteString2));
            i2++;
            messageArr2 = messageArr;
            length = i;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object updateSuggestion(String str, ContinuationImpl continuationImpl) {
        RealChatManager$updateSuggestion$1 realChatManager$updateSuggestion$1;
        int i;
        ApiResult apiResult;
        if (continuationImpl instanceof RealChatManager$updateSuggestion$1) {
            realChatManager$updateSuggestion$1 = (RealChatManager$updateSuggestion$1) continuationImpl;
            int i2 = realChatManager$updateSuggestion$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realChatManager$updateSuggestion$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realChatManager$updateSuggestion$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realChatManager$updateSuggestion$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    UpdateSuggestionRequest updateSuggestionRequest = new UpdateSuggestionRequest(str, ByteString.EMPTY);
                    realChatManager$updateSuggestion$1.label = 1;
                    obj = this.kgooseService.updateSuggestion(updateSuggestionRequest, realChatManager$updateSuggestion$1);
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
                apiResult = (ApiResult) obj;
                if (apiResult instanceof ApiResult.Failure) {
                    this.analyticsService.submitChatError(null, AnalyticsMappersKt.toErrorName((ApiResult.Failure) apiResult), "updateSuggestion");
                }
                return apiResult;
            }
        }
        realChatManager$updateSuggestion$1 = new RealChatManager$updateSuggestion$1(this, continuationImpl);
        Object obj2 = realChatManager$updateSuggestion$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realChatManager$updateSuggestion$1.label;
        if (i != 0) {
        }
        apiResult = (ApiResult) obj2;
        if (apiResult instanceof ApiResult.Failure) {
        }
        return apiResult;
    }

    /* loaded from: classes.dex */
    public final class MetroFactory implements Factory {
        public final /* synthetic */ int $r8$classId;
        public final Provider activityItemFormatter;
        public final Provider analyticsService;
        public final Provider chatMessagesCache;
        public final Provider clock;
        public final Provider computationContext;
        public final Provider errorReporter;
        public final Provider extensionManager;
        public final Provider featureFlagManager;
        public final Provider kgooseService;
        public final Provider messagesStreamingSubscriber;
        public final Provider moneybotPreambleManager;
        public final Provider oneErrorPerAppSessionStrategy;
        public final Provider pluginRegistry;
        public final Provider renderContextProvider;
        public final Provider skillsService;
        public final Provider toolEndpointService;
        public final Provider uuidGenerator;

        public /* synthetic */ MetroFactory(Factory factory, Factory factory2, Factory factory3, Factory factory4, Factory factory5, Factory factory6, Factory factory7, Factory factory8, Factory factory9, Factory factory10, Factory factory11, Factory factory12, Factory factory13, Factory factory14, Factory factory15, Factory factory16, Factory factory17, int i) {
            this.$r8$classId = i;
            this.errorReporter = factory;
            this.oneErrorPerAppSessionStrategy = factory2;
            this.kgooseService = factory3;
            this.toolEndpointService = factory4;
            this.skillsService = factory5;
            this.featureFlagManager = factory6;
            this.activityItemFormatter = factory7;
            this.analyticsService = factory8;
            this.uuidGenerator = factory9;
            this.chatMessagesCache = factory10;
            this.moneybotPreambleManager = factory11;
            this.clock = factory12;
            this.pluginRegistry = factory13;
            this.computationContext = factory14;
            this.extensionManager = factory15;
            this.messagesStreamingSubscriber = factory16;
            this.renderContextProvider = factory17;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            int i = this.$r8$classId;
            Provider provider = this.renderContextProvider;
            Provider provider2 = this.messagesStreamingSubscriber;
            Provider provider3 = this.computationContext;
            Provider provider4 = this.pluginRegistry;
            Provider provider5 = this.clock;
            Provider provider6 = this.moneybotPreambleManager;
            Provider provider7 = this.chatMessagesCache;
            Provider provider8 = this.uuidGenerator;
            Provider provider9 = this.extensionManager;
            Provider provider10 = this.analyticsService;
            Provider provider11 = this.activityItemFormatter;
            Provider provider12 = this.featureFlagManager;
            Provider provider13 = this.skillsService;
            Provider provider14 = this.toolEndpointService;
            Provider provider15 = this.kgooseService;
            Provider provider16 = this.oneErrorPerAppSessionStrategy;
            Provider provider17 = this.errorReporter;
            switch (i) {
                case 0:
                    ErrorReporter errorReporter = (ErrorReporter) provider17.invoke();
                    SampleStrategy sampleStrategy = (SampleStrategy) provider16.invoke();
                    CashKgooseService cashKgooseService = (CashKgooseService) provider15.invoke();
                    ToolEndpointService toolEndpointService = (ToolEndpointService) provider14.invoke();
                    CashSkillsService cashSkillsService = (CashSkillsService) provider13.invoke();
                    DefaultTsPayloadReaderFactory defaultTsPayloadReaderFactory = (DefaultTsPayloadReaderFactory) ((RealExtensionManager$MetroFactory) provider9).invoke();
                    UnleashContext unleashContext = (UnleashContext) ((RealKnotLauncher.MetroFactory) provider2).invoke();
                    FeatureFlagManager featureFlagManager = (FeatureFlagManager) provider12.invoke();
                    ZiplineActivityItemFormatter ziplineActivityItemFormatter = (ZiplineActivityItemFormatter) provider11.invoke();
                    RealMoneybotAnalyticsService realMoneybotAnalyticsService = (RealMoneybotAnalyticsService) provider10.invoke();
                    RealUuidGenerator realUuidGenerator = (RealUuidGenerator) provider8.invoke();
                    RealMoneybotChatMessagesCache realMoneybotChatMessagesCache = (RealMoneybotChatMessagesCache) provider7.invoke();
                    RealMoneybotPreambleManager realMoneybotPreambleManager = (RealMoneybotPreambleManager) provider6.invoke();
                    AndroidClock androidClock = (AndroidClock) provider5.invoke();
                    zzr zzrVar = (zzr) ((RealMessageSigner.MetroFactory) provider).invoke();
                    ClientRenderablePluginRegistry clientRenderablePluginRegistry = (ClientRenderablePluginRegistry) provider4.invoke();
                    CoroutineContext coroutineContext = (CoroutineContext) provider3.invoke();
                    errorReporter.getClass();
                    sampleStrategy.getClass();
                    cashKgooseService.getClass();
                    toolEndpointService.getClass();
                    cashSkillsService.getClass();
                    featureFlagManager.getClass();
                    ziplineActivityItemFormatter.getClass();
                    realMoneybotAnalyticsService.getClass();
                    realUuidGenerator.getClass();
                    realMoneybotChatMessagesCache.getClass();
                    realMoneybotPreambleManager.getClass();
                    androidClock.getClass();
                    clientRenderablePluginRegistry.getClass();
                    coroutineContext.getClass();
                    return new RealChatManager(errorReporter, sampleStrategy, cashKgooseService, toolEndpointService, cashSkillsService, defaultTsPayloadReaderFactory, unleashContext, featureFlagManager, ziplineActivityItemFormatter, realMoneybotAnalyticsService, realUuidGenerator, realMoneybotChatMessagesCache, realMoneybotPreambleManager, androidClock, zzrVar, clientRenderablePluginRegistry, coroutineContext);
                case 1:
                    return new AccountSettingsCapabilityProvider((PersonalSetting) ((PersonalSetting.MetroFactory) provider17).invoke(), (BusinessInfoSetting) ((FamilySetting.MetroFactory) provider16).invoke(), (PasskeysSetting) ((PasskeysSetting.MetroFactory) provider15).invoke(), (SecuritySetting) ((CashCdpConfigProvider.MetroFactory) provider14).invoke(), (FamilySetting) ((FamilySetting.MetroFactory) provider13).invoke(), (LimitsSetting) ((RealPasscodeFlowStarter.MetroFactory) provider12).invoke(), (LimitsSetting) ((RealPasscodeFlowStarter.MetroFactory) provider11).invoke(), (SecuritySetting) ((CashCdpConfigProvider.MetroFactory) provider10).invoke(), (LimitsSetting) ((RealPasscodeFlowStarter.MetroFactory) provider8).invoke(), (LimitsSetting) ((RealPasscodeFlowStarter.MetroFactory) provider7).invoke(), (LimitsSetting) ((BorrowUiFactory.MetroFactory) provider6).invoke(), (FamilySetting) ((FamilySetting.MetroFactory) provider5).invoke(), (PersonalSetting) ((CashCdpConfigProvider.MetroFactory) provider4).invoke(), (SecuritySetting) ((CashCdpConfigProvider.MetroFactory) provider3).invoke(), (SecuritySetting) ((CashCdpConfigProvider.MetroFactory) provider9).invoke(), (SecuritySetting) ((CashCdpConfigProvider.MetroFactory) provider2).invoke(), (PasskeysSetting) ((PasskeysSetting.MetroFactory) provider).invoke());
                case 2:
                    RealReactionManager realReactionManager = (RealReactionManager) provider17.invoke();
                    RealPaymentManager realPaymentManager = (RealPaymentManager) provider16.invoke();
                    RealPaymentActionCompletionDispatcher realPaymentActionCompletionDispatcher = (RealPaymentActionCompletionDispatcher) provider15.invoke();
                    CoroutineContext coroutineContext2 = (CoroutineContext) provider14.invoke();
                    Moshi moshi = (Moshi) provider13.invoke();
                    RealFlowTokenGenerator realFlowTokenGenerator = (RealFlowTokenGenerator) provider12.invoke();
                    ClientRoutesConfig clientRoutesConfig = (ClientRoutesConfig) provider11.invoke();
                    RealClientRouteParser realClientRouteParser = (RealClientRouteParser) provider10.invoke();
                    RealClientRouteToScreenMapping realClientRouteToScreenMapping = (RealClientRouteToScreenMapping) provider8.invoke();
                    RealContactRepository realContactRepository = (RealContactRepository) provider7.invoke();
                    RealClientSyncer realClientSyncer = (RealClientSyncer) provider6.invoke();
                    LoadTimeClock loadTimeClock = (LoadTimeClock) provider5.invoke();
                    Analytics analytics = (Analytics) provider4.invoke();
                    RealActivityUpdatesNotifier realActivityUpdatesNotifier = (RealActivityUpdatesNotifier) provider3.invoke();
                    CashAccountDatabaseImpl cashAccountDatabaseImpl = (CashAccountDatabaseImpl) provider2.invoke();
                    AppConfigManager appConfigManager = (AppConfigManager) provider.invoke();
                    realReactionManager.getClass();
                    realPaymentManager.getClass();
                    realPaymentActionCompletionDispatcher.getClass();
                    coroutineContext2.getClass();
                    moshi.getClass();
                    realFlowTokenGenerator.getClass();
                    clientRoutesConfig.getClass();
                    realClientRouteParser.getClass();
                    realClientRouteToScreenMapping.getClass();
                    realContactRepository.getClass();
                    realClientSyncer.getClass();
                    loadTimeClock.getClass();
                    analytics.getClass();
                    realActivityUpdatesNotifier.getClass();
                    cashAccountDatabaseImpl.getClass();
                    appConfigManager.getClass();
                    return new RealActivityPaymentManager2(realReactionManager, realPaymentManager, realPaymentActionCompletionDispatcher, coroutineContext2, moshi, realFlowTokenGenerator, clientRoutesConfig, realClientRouteParser, realClientRouteToScreenMapping, realContactRepository, (DoubleCheck) provider9, realClientSyncer, loadTimeClock, analytics, realActivityUpdatesNotifier, cashAccountDatabaseImpl, appConfigManager);
                case 3:
                    BalanceBasedAutoReloadConfirmationPresenter$Factory$Impl balanceBasedAutoReloadConfirmationPresenter$Factory$Impl = (BalanceBasedAutoReloadConfirmationPresenter$Factory$Impl) ((InstanceFactory) provider17).value;
                    BalanceBasedAddCashDisabledDialogPresenter$Factory$Impl balanceBasedAddCashDisabledDialogPresenter$Factory$Impl = (BalanceBasedAddCashDisabledDialogPresenter$Factory$Impl) ((InstanceFactory) provider16).value;
                    PendingTransfersConfirmationDialogPresenter$Factory$Impl pendingTransfersConfirmationDialogPresenter$Factory$Impl = (PendingTransfersConfirmationDialogPresenter$Factory$Impl) ((InstanceFactory) provider15).value;
                    WithdrawPresenter$Factory$Impl withdrawPresenter$Factory$Impl = (WithdrawPresenter$Factory$Impl) ((InstanceFactory) provider14).value;
                    LinkedAccountsPresenter$Factory$Impl linkedAccountsPresenter$Factory$Impl = (LinkedAccountsPresenter$Factory$Impl) ((InstanceFactory) provider13).value;
                    LinkedAccountsNuxPresenter$Factory$Impl linkedAccountsNuxPresenter$Factory$Impl = (LinkedAccountsNuxPresenter$Factory$Impl) ((InstanceFactory) provider12).value;
                    InstrumentDetailsPresenter$Factory$Impl instrumentDetailsPresenter$Factory$Impl = (InstrumentDetailsPresenter$Factory$Impl) ((InstanceFactory) provider11).value;
                    InstrumentLinkingOptionsPresenter$Factory$Impl instrumentLinkingOptionsPresenter$Factory$Impl = (InstrumentLinkingOptionsPresenter$Factory$Impl) ((InstanceFactory) provider10).value;
                    AddMoneyPresenter$Factory$Impl addMoneyPresenter$Factory$Impl = (AddMoneyPresenter$Factory$Impl) ((InstanceFactory) provider8).value;
                    InstrumentNotLinkedPresenter$Factory$Impl instrumentNotLinkedPresenter$Factory$Impl = (InstrumentNotLinkedPresenter$Factory$Impl) ((InstanceFactory) provider7).value;
                    TransfersRouterPresenter$Factory$Impl transfersRouterPresenter$Factory$Impl = (TransfersRouterPresenter$Factory$Impl) ((InstanceFactory) provider6).value;
                    SetDefaultInstrumentPresenter$Factory$Impl setDefaultInstrumentPresenter$Factory$Impl = (SetDefaultInstrumentPresenter$Factory$Impl) ((InstanceFactory) provider5).value;
                    RecurringReloadOptionPresenter$Factory$Impl recurringReloadOptionPresenter$Factory$Impl = (RecurringReloadOptionPresenter$Factory$Impl) ((InstanceFactory) provider4).value;
                    RecurringReloadConfigurationPresenter$Factory$Impl recurringReloadConfigurationPresenter$Factory$Impl = (RecurringReloadConfigurationPresenter$Factory$Impl) ((InstanceFactory) provider3).value;
                    RecurringReloadsChangeInstrumentPresenter$Factory$Impl recurringReloadsChangeInstrumentPresenter$Factory$Impl = (RecurringReloadsChangeInstrumentPresenter$Factory$Impl) ((InstanceFactory) provider9).value;
                    RecurringReloadsDismissDialogPresenter$Factory$Impl recurringReloadsDismissDialogPresenter$Factory$Impl = (RecurringReloadsDismissDialogPresenter$Factory$Impl) ((InstanceFactory) provider2).value;
                    ScheduledReloadConfirmationPresenter$Factory$Impl scheduledReloadConfirmationPresenter$Factory$Impl = (ScheduledReloadConfirmationPresenter$Factory$Impl) ((InstanceFactory) provider).value;
                    balanceBasedAutoReloadConfirmationPresenter$Factory$Impl.getClass();
                    balanceBasedAddCashDisabledDialogPresenter$Factory$Impl.getClass();
                    pendingTransfersConfirmationDialogPresenter$Factory$Impl.getClass();
                    withdrawPresenter$Factory$Impl.getClass();
                    linkedAccountsPresenter$Factory$Impl.getClass();
                    linkedAccountsNuxPresenter$Factory$Impl.getClass();
                    instrumentDetailsPresenter$Factory$Impl.getClass();
                    instrumentLinkingOptionsPresenter$Factory$Impl.getClass();
                    addMoneyPresenter$Factory$Impl.getClass();
                    instrumentNotLinkedPresenter$Factory$Impl.getClass();
                    transfersRouterPresenter$Factory$Impl.getClass();
                    setDefaultInstrumentPresenter$Factory$Impl.getClass();
                    recurringReloadOptionPresenter$Factory$Impl.getClass();
                    recurringReloadConfigurationPresenter$Factory$Impl.getClass();
                    recurringReloadsChangeInstrumentPresenter$Factory$Impl.getClass();
                    recurringReloadsDismissDialogPresenter$Factory$Impl.getClass();
                    scheduledReloadConfirmationPresenter$Factory$Impl.getClass();
                    return new WorkPresenterFactory(balanceBasedAutoReloadConfirmationPresenter$Factory$Impl, balanceBasedAddCashDisabledDialogPresenter$Factory$Impl, pendingTransfersConfirmationDialogPresenter$Factory$Impl, withdrawPresenter$Factory$Impl, linkedAccountsPresenter$Factory$Impl, linkedAccountsNuxPresenter$Factory$Impl, instrumentDetailsPresenter$Factory$Impl, instrumentLinkingOptionsPresenter$Factory$Impl, addMoneyPresenter$Factory$Impl, instrumentNotLinkedPresenter$Factory$Impl, transfersRouterPresenter$Factory$Impl, setDefaultInstrumentPresenter$Factory$Impl, recurringReloadOptionPresenter$Factory$Impl, recurringReloadConfigurationPresenter$Factory$Impl, recurringReloadsChangeInstrumentPresenter$Factory$Impl, recurringReloadsDismissDialogPresenter$Factory$Impl, scheduledReloadConfirmationPresenter$Factory$Impl);
                default:
                    RealClientSyncer realClientSyncer2 = (RealClientSyncer) provider17.invoke();
                    IssuedCardManager issuedCardManager = (IssuedCardManager) provider16.invoke();
                    SyncValueReader syncValueReader = (SyncValueReader) provider15.invoke();
                    RealBoostRepository realBoostRepository = (RealBoostRepository) provider14.invoke();
                    PostcardClientService postcardClientService = (PostcardClientService) provider13.invoke();
                    RealFeatureEligibilityRepository realFeatureEligibilityRepository = (RealFeatureEligibilityRepository) provider12.invoke();
                    RealProfileManager realProfileManager = (RealProfileManager) provider11.invoke();
                    CashAccountDatabaseImpl cashAccountDatabaseImpl2 = (CashAccountDatabaseImpl) provider10.invoke();
                    RealCardCustomizationRepository realCardCustomizationRepository = (RealCardCustomizationRepository) ((MoneyUiFactory.MetroFactory) provider9).invoke();
                    RealPrepurchaseCashCardRepository realPrepurchaseCashCardRepository = (RealPrepurchaseCashCardRepository) provider8.invoke();
                    FeatureFlagManager featureFlagManager2 = (FeatureFlagManager) provider7.invoke();
                    KeyValue keyValue = (KeyValue) provider6.invoke();
                    RealCashAppTagManager realCashAppTagManager = (RealCashAppTagManager) provider5.invoke();
                    KeyValue keyValue2 = (KeyValue) provider4.invoke();
                    SyncTopic syncTopic = (SyncTopic) provider3.invoke();
                    CoroutineScope coroutineScope = (CoroutineScope) ((InstanceFactory) provider2).value;
                    CoroutineContext coroutineContext3 = (CoroutineContext) provider.invoke();
                    realClientSyncer2.getClass();
                    issuedCardManager.getClass();
                    syncValueReader.getClass();
                    realBoostRepository.getClass();
                    postcardClientService.getClass();
                    realFeatureEligibilityRepository.getClass();
                    realProfileManager.getClass();
                    cashAccountDatabaseImpl2.getClass();
                    realPrepurchaseCashCardRepository.getClass();
                    featureFlagManager2.getClass();
                    keyValue.getClass();
                    realCashAppTagManager.getClass();
                    keyValue2.getClass();
                    syncTopic.getClass();
                    coroutineScope.getClass();
                    coroutineContext3.getClass();
                    return new RealCardAppletTileRepository(realClientSyncer2, issuedCardManager, syncValueReader, realBoostRepository, postcardClientService, realFeatureEligibilityRepository, realProfileManager, cashAccountDatabaseImpl2, realCardCustomizationRepository, realPrepurchaseCashCardRepository, featureFlagManager2, keyValue, realCashAppTagManager, keyValue2, syncTopic, coroutineScope, coroutineContext3);
            }
        }

        public MetroFactory(LambdaProvider lambdaProvider, MusicViewFactory$MetroFactory musicViewFactory$MetroFactory, DoubleCheck doubleCheck, DoubleCheck doubleCheck2, DoubleCheck doubleCheck3, RealExtensionManager$MetroFactory realExtensionManager$MetroFactory, RealKnotLauncher.MetroFactory metroFactory, DoubleCheck doubleCheck4, DoubleCheck doubleCheck5, DoubleCheck doubleCheck6, LambdaProvider lambdaProvider2, DoubleCheck doubleCheck7, RealMessageSigner.MetroFactory metroFactory2, LambdaProvider lambdaProvider3, RealMessageSigner.MetroFactory metroFactory3, RealActivityItemPresenterFactory.MetroFactory metroFactory4, LambdaProvider lambdaProvider4) {
            this.$r8$classId = 0;
            this.errorReporter = lambdaProvider;
            this.oneErrorPerAppSessionStrategy = musicViewFactory$MetroFactory;
            this.kgooseService = doubleCheck;
            this.toolEndpointService = doubleCheck2;
            this.skillsService = doubleCheck3;
            this.extensionManager = realExtensionManager$MetroFactory;
            this.messagesStreamingSubscriber = metroFactory;
            this.featureFlagManager = doubleCheck4;
            this.activityItemFormatter = doubleCheck5;
            this.analyticsService = doubleCheck6;
            this.uuidGenerator = lambdaProvider2;
            this.chatMessagesCache = doubleCheck7;
            this.moneybotPreambleManager = metroFactory2;
            this.clock = lambdaProvider3;
            this.renderContextProvider = metroFactory3;
            this.pluginRegistry = metroFactory4;
            this.computationContext = lambdaProvider4;
        }

        public MetroFactory(DoubleCheck doubleCheck, DoubleCheck doubleCheck2, DoubleCheck doubleCheck3, LambdaProvider lambdaProvider, LambdaProvider lambdaProvider2, RealFlowTokenGenerator.MetroFactory metroFactory, DoubleCheck doubleCheck4, DoubleCheck doubleCheck5, RealLiteCashInRepo$MetroFactory realLiteCashInRepo$MetroFactory, RealSessionFlags.MetroFactory metroFactory2, DoubleCheck doubleCheck6, RealKnotLauncher.MetroFactory metroFactory3, DoubleCheck doubleCheck7, DoubleCheck doubleCheck8, DoubleCheck doubleCheck9, DoubleCheck doubleCheck10, DoubleCheck doubleCheck11) {
            this.$r8$classId = 2;
            this.errorReporter = doubleCheck;
            this.oneErrorPerAppSessionStrategy = doubleCheck2;
            this.kgooseService = doubleCheck3;
            this.toolEndpointService = lambdaProvider;
            this.skillsService = lambdaProvider2;
            this.featureFlagManager = metroFactory;
            this.activityItemFormatter = doubleCheck4;
            this.analyticsService = doubleCheck5;
            this.uuidGenerator = realLiteCashInRepo$MetroFactory;
            this.chatMessagesCache = metroFactory2;
            this.extensionManager = doubleCheck6;
            this.moneybotPreambleManager = metroFactory3;
            this.clock = doubleCheck7;
            this.pluginRegistry = doubleCheck8;
            this.computationContext = doubleCheck9;
            this.messagesStreamingSubscriber = doubleCheck10;
            this.renderContextProvider = doubleCheck11;
        }

        public MetroFactory(RealKnotLauncher.MetroFactory metroFactory, DoubleCheck doubleCheck, DoubleCheck doubleCheck2, DoubleCheck doubleCheck3, DoubleCheck doubleCheck4, DoubleCheck doubleCheck5, DelegateFactory delegateFactory, DoubleCheck doubleCheck6, MoneyUiFactory.MetroFactory metroFactory2, WalletUiFactory$MetroFactory walletUiFactory$MetroFactory, DoubleCheck doubleCheck7, DoubleCheck doubleCheck8, DoubleCheck doubleCheck9, DoubleCheck doubleCheck10, RealDrawerOpener$MetroFactory realDrawerOpener$MetroFactory, InstanceFactory instanceFactory, LambdaProvider lambdaProvider) {
            this.$r8$classId = 4;
            this.errorReporter = metroFactory;
            this.oneErrorPerAppSessionStrategy = doubleCheck;
            this.kgooseService = doubleCheck2;
            this.toolEndpointService = doubleCheck3;
            this.skillsService = doubleCheck4;
            this.featureFlagManager = doubleCheck5;
            this.activityItemFormatter = delegateFactory;
            this.analyticsService = doubleCheck6;
            this.extensionManager = metroFactory2;
            this.uuidGenerator = walletUiFactory$MetroFactory;
            this.chatMessagesCache = doubleCheck7;
            this.moneybotPreambleManager = doubleCheck8;
            this.clock = doubleCheck9;
            this.pluginRegistry = doubleCheck10;
            this.computationContext = realDrawerOpener$MetroFactory;
            this.messagesStreamingSubscriber = instanceFactory;
            this.renderContextProvider = lambdaProvider;
        }
    }
}
