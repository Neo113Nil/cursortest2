package com.squareup.cash.moneybot.presenters;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.snapshots.SnapshotStateMap;
import app.cash.api.ApiResult;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import app.cash.versioned.Versioned;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.ImageLoader$Builder;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.google.android.gms.internal.mlkit_genai_prompt.zzabx;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.activity.backend.loader.RealActivityTokenFactory;
import com.squareup.cash.activity.backend.loader.RealSingleActivityManager$Factory$Impl;
import com.squareup.cash.activity.presenters.ActivityItemPresenter;
import com.squareup.cash.activity.presenters.DefaultActivityItemEventHandler$Factory$Impl;
import com.squareup.cash.appforeground.AppForegroundState;
import com.squareup.cash.appforeground.AppForegroundStateProvider;
import com.squareup.cash.cdf.moneybot.MoneybotQuickActionTap;
import com.squareup.cash.clientrouting.RealRouter;
import com.squareup.cash.clientrouting.RealRouter$Factory$Impl;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.featureflags.AmplitudeExperiments$MobileMoneybotChat;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.featureflags.RealFeatureFlagManager;
import com.squareup.cash.fileupload.real.RealAndroidFileParser;
import com.squareup.cash.graphics.backend.gl.core.EglCore;
import com.squareup.cash.graphics.views.AnimationsKt$takeUntil$1$1;
import com.squareup.cash.money.views.MoneyTabUIKt$$ExternalSyntheticLambda13;
import com.squareup.cash.moneybot.analytics.RealMoneybotAnalyticsService;
import com.squareup.cash.moneybot.backend.RealMoneybotChatMessagesCache;
import com.squareup.cash.moneybot.backend.api.MoneybotFlagsHelper;
import com.squareup.cash.moneybot.backend.api.managers.ChatManager;
import com.squareup.cash.moneybot.backend.api.managers.ChatSession;
import com.squareup.cash.moneybot.backend.api.managers.ChatSessionError;
import com.squareup.cash.moneybot.backend.api.managers.MoneybotDebugSettingsManager;
import com.squareup.cash.moneybot.backend.api.model.chat.Chat;
import com.squareup.cash.moneybot.backend.api.model.chat.ClientRenderable;
import com.squareup.cash.moneybot.backend.api.model.chat.Message;
import com.squareup.cash.moneybot.backend.real.managers.RealChatManager;
import com.squareup.cash.moneybot.backend.real.managers.RealChatSessionManager;
import com.squareup.cash.moneybot.backend.real.managers.RealChatSessionManager$Factory$Impl;
import com.squareup.cash.moneybot.backend.real.managers.RealMoneybotDisclosureManager;
import com.squareup.cash.moneybot.backend.real.managers.RealMoneybotPreambleManager;
import com.squareup.cash.moneybot.backend.real.managers.RealMoneybotPromptManager;
import com.squareup.cash.moneybot.backend.real.managers.RealMoneybotWidgetManager;
import com.squareup.cash.moneybot.components.api.ClientRenderablePluginRegistry;
import com.squareup.cash.moneybot.screens.HomeItemType;
import com.squareup.cash.moneybot.screens.MoneybotChatEntryPoint;
import com.squareup.cash.moneybot.screens.MoneybotChatScreen;
import com.squareup.cash.moneybot.viewmodels.chat.ChatFooterViewModel$Attachment$ImageAttachment;
import com.squareup.cash.moneybot.viewmodels.chat.MessageViewModel;
import com.squareup.cash.moneybot.viewmodels.chat.MoneybotChatViewEvent;
import com.squareup.cash.moneybot.viewmodels.chat.MoneybotChatViewEvent$SuggestionEvent$SuggestionMetadata;
import com.squareup.cash.moneybot.viewmodels.chat.MoneybotChatViewModel;
import com.squareup.cash.observability.protovalidation.HasObservability;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.cash.observability.types.SampleStrategy;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.storage.Storage;
import com.squareup.cash.util.clock.AndroidClock;
import com.squareup.protos.cash.kgoose.api.v3.ChatSessionStatus;
import com.squareup.protos.cash.kgoose.api.v3.FeedbackType;
import com.squareup.protos.cash.kgoose.api.v3.cash.CashKgooseService;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import dev.zacsweers.metro.LambdaProvider;
import dev.zacsweers.metro.Provider;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.SequencesKt___SequencesKt;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlowImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;
import timber.log.Timber;

/* loaded from: classes6.dex */
public final class MoneybotChatPresenter implements MoleculePresenter, HasObservability {
    public final RealMoneybotAnalyticsService analyticsService;
    public final RealAndroidFileParser androidFileParser;
    public final AppForegroundStateProvider appForegroundStateProvider;
    public final MoneybotChatScreen args;
    public final ParcelableSnapshotMutableState cameraCapturePath$delegate;
    public final ChatManager chatManager;
    public final RealMoneybotChatMessagesCache chatMessagesCache;
    public final RealChatSessionManager$Factory$Impl chatSessionManagerFactory;
    public final AndroidClock clock;
    public final ParcelableSnapshotMutableState composerText$delegate;
    public final MoneybotChatContentFactory contentFactory;
    public final ParcelableSnapshotMutableState didClickStartNewChat$delegate;
    public final ErrorReporter errorReporter;
    public final FeatureFlagManager featureFlagManager;
    public final ParcelableSnapshotMutableState hasTriggeredMemoryTooltipFetch$delegate;
    public final ParcelableSnapshotMutableState heldKickoffMessages$delegate;
    public final ParcelableSnapshotMutableState initialRequestKeyboardFocus$delegate;
    public final CoroutineContext ioContext;
    public final CashKgooseService kgooseService;
    public final ParcelableSnapshotMutableIntState loadChatRetryTrigger$delegate;
    public final EglCore memoryTooltipManager;
    public final MoneybotDebugSettingsManager moneybotDebugSettingsManager;
    public final RealMoneybotDisclosureManager moneybotDisclosureManager;
    public final MoneybotFlagsHelper moneybotFlagsHelper;
    public final RealMoneybotPreambleManager moneybotPreambleManager;
    public final RealMoneybotPromptManager moneybotPromptManager;
    public final RealMoneybotWidgetManager moneybotWidgetManager;
    public final BetterNavigator.ScreenNavigator navigator;
    public final SampleStrategy oneErrorPerAppSessionStrategy;
    public final ParcelableSnapshotMutableState pendingAttachments$delegate;
    public final ParcelableSnapshotMutableState pendingCancellation$delegate;
    public final ParcelableSnapshotMutableState pendingMessages$delegate;
    public final ParcelableSnapshotMutableState pendingStartChatMetadata$delegate;
    public final SharedFlowImpl pluginMessages = FlowKt.MutableSharedFlow$default(0, 1, null, 5);
    public final ClientRenderablePluginRegistry pluginRegistry;
    public final ParcelableSnapshotMutableState restoreInputText$delegate;
    public final RealRouter router;
    public final CoroutineScope scope;
    public final ParcelableSnapshotMutableState sendMessageAnimating$delegate;
    public final boolean showImageAttachmentButton;
    public final ParcelableSnapshotMutableState slashCommandMatches$delegate;
    public final ParcelableSnapshotMutableState slashCommands$delegate;
    public final Storage storage;
    public final ParcelableSnapshotMutableState streamingKickoffTexts$delegate;
    public final AndroidStringManager stringManager;
    public final SnapshotStateMap thumbStates;
    public final ParcelableSnapshotMutableState toastMessage$delegate;

    public final class ChatSessionState {
        public final ChatSession session;
        public final TokenStreamingState tokenStreamingState;
        public final ToolRequestState toolRequestInProgress;

        public ChatSessionState(ChatSession chatSession, TokenStreamingState tokenStreamingState, ToolRequestState toolRequestState) {
            chatSession.getClass();
            this.session = chatSession;
            this.tokenStreamingState = tokenStreamingState;
            this.toolRequestInProgress = toolRequestState;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ChatSessionState)) {
                return false;
            }
            ChatSessionState chatSessionState = (ChatSessionState) obj;
            return Intrinsics.areEqual(this.session, chatSessionState.session) && this.tokenStreamingState == chatSessionState.tokenStreamingState && this.toolRequestInProgress == chatSessionState.toolRequestInProgress;
        }

        public final int hashCode() {
            int hashCode = this.session.hashCode() * 31;
            TokenStreamingState tokenStreamingState = this.tokenStreamingState;
            int hashCode2 = (hashCode + (tokenStreamingState == null ? 0 : tokenStreamingState.hashCode())) * 31;
            ToolRequestState toolRequestState = this.toolRequestInProgress;
            return hashCode2 + (toolRequestState != null ? toolRequestState.hashCode() : 0);
        }

        public final String toString() {
            return "ChatSessionState(session=" + this.session + ", tokenStreamingState=" + this.tokenStreamingState + ", toolRequestInProgress=" + this.toolRequestInProgress + ")";
        }
    }

    public final class IndicatorCapturedState {
        public final Chat chat;
        public final List pendingMessages;
        public final boolean sendMessageAnimating;
        public final Set streamingKickoffTexts;
        public final TokenStreamingState tokenStreamingState;
        public final ToolRequestState toolRequestInProgress;

        public IndicatorCapturedState(TokenStreamingState tokenStreamingState, boolean z, ToolRequestState toolRequestState, Set set, List list, Chat chat) {
            set.getClass();
            list.getClass();
            this.tokenStreamingState = tokenStreamingState;
            this.sendMessageAnimating = z;
            this.toolRequestInProgress = toolRequestState;
            this.streamingKickoffTexts = set;
            this.pendingMessages = list;
            this.chat = chat;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof IndicatorCapturedState)) {
                return false;
            }
            IndicatorCapturedState indicatorCapturedState = (IndicatorCapturedState) obj;
            return this.tokenStreamingState == indicatorCapturedState.tokenStreamingState && this.sendMessageAnimating == indicatorCapturedState.sendMessageAnimating && this.toolRequestInProgress == indicatorCapturedState.toolRequestInProgress && Intrinsics.areEqual(this.streamingKickoffTexts, indicatorCapturedState.streamingKickoffTexts) && Intrinsics.areEqual(this.pendingMessages, indicatorCapturedState.pendingMessages) && Intrinsics.areEqual(this.chat, indicatorCapturedState.chat);
        }

        public final int hashCode() {
            TokenStreamingState tokenStreamingState = this.tokenStreamingState;
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((tokenStreamingState == null ? 0 : tokenStreamingState.hashCode()) * 31, 31, this.sendMessageAnimating);
            ToolRequestState toolRequestState = this.toolRequestInProgress;
            int m2 = Recorder$$ExternalSyntheticOutline2.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((m + (toolRequestState == null ? 0 : toolRequestState.hashCode())) * 31, 31, this.streamingKickoffTexts), 31, this.pendingMessages);
            Chat chat = this.chat;
            return m2 + (chat != null ? chat.hashCode() : 0);
        }

        public final String toString() {
            return "IndicatorCapturedState(tokenStreamingState=" + this.tokenStreamingState + ", sendMessageAnimating=" + this.sendMessageAnimating + ", toolRequestInProgress=" + this.toolRequestInProgress + ", streamingKickoffTexts=" + this.streamingKickoffTexts + ", pendingMessages=" + this.pendingMessages + ", chat=" + this.chat + ")";
        }
    }

    public interface PendingMessage {

        public final class Deferred implements PendingMessage {
            public final ClientRenderable clientRenderable;

            public /* synthetic */ Deferred(ClientRenderable clientRenderable) {
                this.clientRenderable = clientRenderable;
            }

            public final boolean equals(Object obj) {
                if (obj instanceof Deferred) {
                    return this.clientRenderable.equals(((Deferred) obj).clientRenderable);
                }
                return false;
            }

            public final int hashCode() {
                return this.clientRenderable.hashCode();
            }

            public final String toString() {
                return "Deferred(clientRenderable=" + this.clientRenderable + ")";
            }
        }

        public final class Resolved implements PendingMessage {
            public final MessageViewModel viewModel;

            public /* synthetic */ Resolved(MessageViewModel messageViewModel) {
                this.viewModel = messageViewModel;
            }

            public final boolean equals(Object obj) {
                if (obj instanceof Resolved) {
                    return this.viewModel.equals(((Resolved) obj).viewModel);
                }
                return false;
            }

            public final int hashCode() {
                return this.viewModel.hashCode();
            }

            public final String toString() {
                return "Resolved(viewModel=" + this.viewModel + ")";
            }
        }
    }

    public final class PluginMessage {
        public final boolean hidden;
        public final String message;

        public PluginMessage(String str, boolean z) {
            str.getClass();
            this.message = str;
            this.hidden = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PluginMessage)) {
                return false;
            }
            PluginMessage pluginMessage = (PluginMessage) obj;
            return Intrinsics.areEqual(this.message, pluginMessage.message) && this.hidden == pluginMessage.hidden;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.hidden) + (this.message.hashCode() * 31);
        }

        public final String toString() {
            return Request$Priority$EnumUnboxingLocalUtility.m("PluginMessage(message=", this.message, ", hidden=", ")", this.hidden);
        }
    }

    public interface StartNewChatAction {

        public final class Automatic implements StartNewChatAction {
            public static final Automatic INSTANCE = new Automatic();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof Automatic);
            }

            public final int hashCode() {
                return 1998708924;
            }

            public final String toString() {
                return "Automatic";
            }
        }

        public final class UserInitiated implements StartNewChatAction {
            public static final UserInitiated INSTANCE = new UserInitiated();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof UserInitiated);
            }

            public final int hashCode() {
                return 1309476721;
            }

            public final String toString() {
                return "UserInitiated";
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class TokenStreamingState {
        public static final /* synthetic */ TokenStreamingState[] $VALUES;
        public static final TokenStreamingState Complete;
        public static final TokenStreamingState InProgress;

        static {
            TokenStreamingState tokenStreamingState = new TokenStreamingState("InProgress", 0);
            InProgress = tokenStreamingState;
            TokenStreamingState tokenStreamingState2 = new TokenStreamingState("Complete", 1);
            Complete = tokenStreamingState2;
            $VALUES = new TokenStreamingState[]{tokenStreamingState, tokenStreamingState2};
        }

        public static TokenStreamingState valueOf(String str) {
            return (TokenStreamingState) Enum.valueOf(TokenStreamingState.class, str);
        }

        public static TokenStreamingState[] values() {
            return (TokenStreamingState[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class ToolRequestState {
        public static final /* synthetic */ ToolRequestState[] $VALUES;
        public static final ToolRequestState Complete;
        public static final ToolRequestState InProgress;

        static {
            ToolRequestState toolRequestState = new ToolRequestState("InProgress", 0);
            InProgress = toolRequestState;
            ToolRequestState toolRequestState2 = new ToolRequestState("Complete", 1);
            Complete = toolRequestState2;
            $VALUES = new ToolRequestState[]{toolRequestState, toolRequestState2};
        }

        public static ToolRequestState valueOf(String str) {
            return (ToolRequestState) Enum.valueOf(ToolRequestState.class, str);
        }

        public static ToolRequestState[] values() {
            return (ToolRequestState[]) $VALUES.clone();
        }
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;
        public static final /* synthetic */ int[] $EnumSwitchMapping$5;

        static {
            int[] iArr = new int[ChatSessionStatus.values().length];
            try {
                iArr[ChatSessionStatus.CHAT_SESSION_STATUS_INITIALIZED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ChatSessionStatus.CHAT_SESSION_STATUS_IDLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[MoneybotChatViewEvent.QuickActionTap.QuickActionType.values().length];
            try {
                iArr2[0] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                MoneybotChatViewEvent.QuickActionTap.QuickActionType quickActionType = MoneybotChatViewEvent.QuickActionTap.QuickActionType.COPY;
                iArr2[1] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                MoneybotChatViewEvent.QuickActionTap.QuickActionType quickActionType2 = MoneybotChatViewEvent.QuickActionTap.QuickActionType.COPY;
                iArr2[2] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            int[] iArr3 = new int[MoneybotChatViewEvent.RetryLoad.RetryType.values().length];
            try {
                iArr3[0] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$2 = iArr3;
            int[] iArr4 = new int[AppForegroundState.values().length];
            try {
                iArr4[0] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                AppForegroundState appForegroundState = AppForegroundState.FOREGROUND;
                iArr4[1] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            int[] iArr5 = new int[Message.Role.values().length];
            try {
                iArr5[1] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                Message.Role role = Message.Role.ROLE_UNSPECIFIED;
                iArr5[2] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            int[] iArr6 = new int[MoneybotChatEntryPoint.values().length];
            try {
                iArr6[2] = 1;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                MoneybotChatEntryPoint moneybotChatEntryPoint = MoneybotChatEntryPoint.MONEY;
                iArr6[0] = 2;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                MoneybotChatEntryPoint moneybotChatEntryPoint2 = MoneybotChatEntryPoint.MONEY;
                iArr6[3] = 3;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                MoneybotChatEntryPoint moneybotChatEntryPoint3 = MoneybotChatEntryPoint.MONEY;
                iArr6[4] = 4;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                MoneybotChatEntryPoint moneybotChatEntryPoint4 = MoneybotChatEntryPoint.MONEY;
                iArr6[1] = 5;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                MoneybotChatEntryPoint moneybotChatEntryPoint5 = MoneybotChatEntryPoint.MONEY;
                iArr6[5] = 6;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                MoneybotChatEntryPoint moneybotChatEntryPoint6 = MoneybotChatEntryPoint.MONEY;
                iArr6[6] = 7;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                MoneybotChatEntryPoint moneybotChatEntryPoint7 = MoneybotChatEntryPoint.MONEY;
                iArr6[7] = 8;
            } catch (NoSuchFieldError unused18) {
            }
            $EnumSwitchMapping$5 = iArr6;
            int[] iArr7 = new int[HomeItemType.values().length];
            try {
                iArr7[0] = 1;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                HomeItemType homeItemType = HomeItemType.WIDGET;
                iArr7[1] = 2;
            } catch (NoSuchFieldError unused20) {
            }
            int[] iArr8 = new int[MessageViewModel.MoneybotMessageViewModel.ThumbState.values().length];
            try {
                iArr8[0] = 1;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                MessageViewModel.MoneybotMessageViewModel.ThumbState thumbState = MessageViewModel.MoneybotMessageViewModel.ThumbState.NONE;
                iArr8[1] = 2;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                MessageViewModel.MoneybotMessageViewModel.ThumbState thumbState2 = MessageViewModel.MoneybotMessageViewModel.ThumbState.NONE;
                iArr8[2] = 3;
            } catch (NoSuchFieldError unused23) {
            }
        }
    }

    public MoneybotChatPresenter(ErrorReporter errorReporter, SampleStrategy sampleStrategy, RealRouter$Factory$Impl realRouter$Factory$Impl, ChatManager chatManager, CashKgooseService cashKgooseService, RealMoneybotPreambleManager realMoneybotPreambleManager, AndroidStringManager androidStringManager, AndroidClock androidClock, FeatureFlagManager featureFlagManager, RealMoneybotAnalyticsService realMoneybotAnalyticsService, AppForegroundStateProvider appForegroundStateProvider, MoneybotFlagsHelper moneybotFlagsHelper, RealMoneybotDisclosureManager realMoneybotDisclosureManager, RealMoneybotWidgetManager realMoneybotWidgetManager, RealMoneybotPromptManager realMoneybotPromptManager, RealMoneybotChatMessagesCache realMoneybotChatMessagesCache, RealAndroidFileParser realAndroidFileParser, EglCore eglCore, MoneybotDebugSettingsManager moneybotDebugSettingsManager, MoneybotChatContentFactory$Factory$Impl moneybotChatContentFactory$Factory$Impl, Storage storage, ClientRenderablePluginRegistry clientRenderablePluginRegistry, RealChatSessionManager$Factory$Impl realChatSessionManager$Factory$Impl, CoroutineScope coroutineScope, CoroutineContext coroutineContext, MoneybotChatScreen moneybotChatScreen, BetterNavigator.ScreenNavigator screenNavigator) {
        this.errorReporter = errorReporter;
        this.oneErrorPerAppSessionStrategy = sampleStrategy;
        this.chatManager = chatManager;
        this.kgooseService = cashKgooseService;
        this.moneybotPreambleManager = realMoneybotPreambleManager;
        this.stringManager = androidStringManager;
        this.clock = androidClock;
        this.featureFlagManager = featureFlagManager;
        this.analyticsService = realMoneybotAnalyticsService;
        this.appForegroundStateProvider = appForegroundStateProvider;
        this.moneybotFlagsHelper = moneybotFlagsHelper;
        this.moneybotDisclosureManager = realMoneybotDisclosureManager;
        this.moneybotWidgetManager = realMoneybotWidgetManager;
        this.moneybotPromptManager = realMoneybotPromptManager;
        this.chatMessagesCache = realMoneybotChatMessagesCache;
        this.androidFileParser = realAndroidFileParser;
        this.memoryTooltipManager = eglCore;
        this.moneybotDebugSettingsManager = moneybotDebugSettingsManager;
        this.storage = storage;
        this.pluginRegistry = clientRenderablePluginRegistry;
        this.chatSessionManagerFactory = realChatSessionManager$Factory$Impl;
        this.scope = coroutineScope;
        this.ioContext = coroutineContext;
        this.args = moneybotChatScreen;
        this.navigator = screenNavigator;
        this.router = realRouter$Factory$Impl.create$1(screenNavigator);
        MoneybotChatPresenter$$ExternalSyntheticLambda0 moneybotChatPresenter$$ExternalSyntheticLambda0 = new MoneybotChatPresenter$$ExternalSyntheticLambda0(this, 1);
        ImageLoader$Builder imageLoader$Builder = moneybotChatContentFactory$Factory$Impl.delegateFactory;
        ErrorReporter errorReporter2 = (ErrorReporter) ((LambdaProvider) imageLoader$Builder.application).lambda.invoke();
        AndroidStringManager androidStringManager2 = (AndroidStringManager) ((LambdaProvider) imageLoader$Builder.defaults).lambda.invoke();
        ActivityItemPresenter.Factory factory = (ActivityItemPresenter.Factory) ((Provider) imageLoader$Builder.mainCoroutineContextLazy).invoke();
        DefaultActivityItemEventHandler$Factory$Impl defaultActivityItemEventHandler$Factory$Impl = (DefaultActivityItemEventHandler$Factory$Impl) ((Provider) imageLoader$Builder.memoryCacheLazy).invoke();
        ClientRenderablePluginRegistry clientRenderablePluginRegistry2 = (ClientRenderablePluginRegistry) ((Provider) imageLoader$Builder.diskCacheLazy).invoke();
        MoneybotFlagsHelper moneybotFlagsHelper2 = (MoneybotFlagsHelper) ((Provider) imageLoader$Builder.eventListenerFactory).invoke();
        RealSingleActivityManager$Factory$Impl realSingleActivityManager$Factory$Impl = (RealSingleActivityManager$Factory$Impl) ((Provider) imageLoader$Builder.componentRegistry).invoke();
        RealActivityTokenFactory realActivityTokenFactory = (RealActivityTokenFactory) ((Provider) imageLoader$Builder.extras).invoke();
        errorReporter2.getClass();
        androidStringManager2.getClass();
        factory.getClass();
        defaultActivityItemEventHandler$Factory$Impl.getClass();
        clientRenderablePluginRegistry2.getClass();
        moneybotFlagsHelper2.getClass();
        realSingleActivityManager$Factory$Impl.getClass();
        realActivityTokenFactory.getClass();
        this.contentFactory = new MoneybotChatContentFactory(errorReporter2, androidStringManager2, factory, defaultActivityItemEventHandler$Factory$Impl, clientRenderablePluginRegistry2, moneybotFlagsHelper2, realSingleActivityManager$Factory$Impl, realActivityTokenFactory, screenNavigator, chatManager, moneybotChatPresenter$$ExternalSyntheticLambda0);
        EmptyList emptyList = EmptyList.INSTANCE;
        this.pendingMessages$delegate = Updater.mutableStateOf$default(emptyList);
        this.pendingAttachments$delegate = Updater.mutableStateOf$default(emptyList);
        this.heldKickoffMessages$delegate = Updater.mutableStateOf$default(emptyList);
        this.streamingKickoffTexts$delegate = Updater.mutableStateOf$default(EmptySet.INSTANCE);
        Boolean bool = Boolean.FALSE;
        this.sendMessageAnimating$delegate = Updater.mutableStateOf$default(bool);
        this.pendingCancellation$delegate = Updater.mutableStateOf$default(bool);
        this.pendingStartChatMetadata$delegate = Updater.mutableStateOf$default(null);
        this.showImageAttachmentButton = moneybotFlagsHelper.showImageAttachmentButton();
        this.cameraCapturePath$delegate = Updater.mutableStateOf$default(null);
        this.loadChatRetryTrigger$delegate = new ParcelableSnapshotMutableIntState(0);
        this.didClickStartNewChat$delegate = Updater.mutableStateOf$default(new Versioned(null, 0));
        this.initialRequestKeyboardFocus$delegate = Updater.mutableStateOf$default(Boolean.valueOf(moneybotChatScreen.shouldRequestKeyboardFocus));
        this.toastMessage$delegate = Updater.mutableStateOf$default(null);
        this.restoreInputText$delegate = Updater.mutableStateOf$default(null);
        this.slashCommands$delegate = Updater.mutableStateOf$default(emptyList);
        this.slashCommandMatches$delegate = Updater.mutableStateOf$default(emptyList);
        this.composerText$delegate = Updater.mutableStateOf$default("");
        this.hasTriggeredMemoryTooltipFetch$delegate = Updater.mutableStateOf$default(bool);
        ((RealFeatureFlagManager) featureFlagManager).currentValue(AmplitudeExperiments$MobileMoneybotChat.INSTANCE);
        this.thumbStates = new SnapshotStateMap();
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x008d, code lost:
    
        if (r8.displayToast(r9, r1) == r2) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x008f, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x005c, code lost:
    
        if (r10 == r2) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$cancelLastMessage(MoneybotChatPresenter moneybotChatPresenter, String str, ContinuationImpl continuationImpl) {
        MoneybotChatPresenter$cancelLastMessage$1 moneybotChatPresenter$cancelLastMessage$1;
        int i;
        ApiResult apiResult;
        ParcelableSnapshotMutableState parcelableSnapshotMutableState = moneybotChatPresenter.pendingCancellation$delegate;
        if (continuationImpl instanceof MoneybotChatPresenter$cancelLastMessage$1) {
            moneybotChatPresenter$cancelLastMessage$1 = (MoneybotChatPresenter$cancelLastMessage$1) continuationImpl;
            int i2 = moneybotChatPresenter$cancelLastMessage$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                moneybotChatPresenter$cancelLastMessage$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = moneybotChatPresenter$cancelLastMessage$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = moneybotChatPresenter$cancelLastMessage$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (str == null) {
                        Timber.Forest.e("Session ID is null, cannot cancel last message", new Object[0]);
                        parcelableSnapshotMutableState.setValue(Boolean.TRUE);
                        return Unit.INSTANCE;
                    }
                    ChatManager chatManager = moneybotChatPresenter.chatManager;
                    moneybotChatPresenter$cancelLastMessage$1.L$0 = str;
                    moneybotChatPresenter$cancelLastMessage$1.label = 1;
                    obj = ((RealChatManager) chatManager).cancelLastUserMessage(str, moneybotChatPresenter$cancelLastMessage$1);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            SafeTrace.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = moneybotChatPresenter$cancelLastMessage$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                }
                apiResult = (ApiResult) obj;
                if (!(apiResult instanceof ApiResult.Success)) {
                    parcelableSnapshotMutableState.setValue(Boolean.FALSE);
                    Timber.Forest.e(Recorder$$ExternalSyntheticOutline2.m("Successfully cancelled last message for session ", str), new Object[0]);
                    return Unit.INSTANCE;
                }
                if (!(apiResult instanceof ApiResult.Failure)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                parcelableSnapshotMutableState.setValue(Boolean.FALSE);
                MoneybotChatViewModel.Content.ToastMessage toastMessage = MoneybotChatViewModel.Content.ToastMessage.CancellationFailed;
                moneybotChatPresenter$cancelLastMessage$1.L$0 = null;
                moneybotChatPresenter$cancelLastMessage$1.label = 2;
            }
        }
        moneybotChatPresenter$cancelLastMessage$1 = new MoneybotChatPresenter$cancelLastMessage$1(moneybotChatPresenter, continuationImpl);
        Object obj3 = moneybotChatPresenter$cancelLastMessage$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = moneybotChatPresenter$cancelLastMessage$1.label;
        if (i != 0) {
        }
        apiResult = (ApiResult) obj3;
        if (!(apiResult instanceof ApiResult.Success)) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x005a, code lost:
    
        if (r8.displayToast(r9, r0) != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005c, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0048, code lost:
    
        if (kotlinx.coroutines.JobKt.m4182delayVtjQ1oo(r6, r0) == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$displayFeedbackSubmittedToast(MoneybotChatPresenter moneybotChatPresenter, String str, MessageViewModel.MoneybotMessageViewModel.ThumbState thumbState, ContinuationImpl continuationImpl) {
        MoneybotChatPresenter$displayFeedbackSubmittedToast$1 moneybotChatPresenter$displayFeedbackSubmittedToast$1;
        int i;
        if (continuationImpl instanceof MoneybotChatPresenter$displayFeedbackSubmittedToast$1) {
            moneybotChatPresenter$displayFeedbackSubmittedToast$1 = (MoneybotChatPresenter$displayFeedbackSubmittedToast$1) continuationImpl;
            int i2 = moneybotChatPresenter$displayFeedbackSubmittedToast$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                moneybotChatPresenter$displayFeedbackSubmittedToast$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = moneybotChatPresenter$displayFeedbackSubmittedToast$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = moneybotChatPresenter$displayFeedbackSubmittedToast$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    long j = MoneybotChatPresenterKt.FeedbackSheetThumbStateDelay;
                    moneybotChatPresenter$displayFeedbackSubmittedToast$1.L$0 = str;
                    moneybotChatPresenter$displayFeedbackSubmittedToast$1.L$1 = thumbState;
                    moneybotChatPresenter$displayFeedbackSubmittedToast$1.label = 1;
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            SafeTrace.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    thumbState = moneybotChatPresenter$displayFeedbackSubmittedToast$1.L$1;
                    str = moneybotChatPresenter$displayFeedbackSubmittedToast$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                }
                moneybotChatPresenter.updateThumbState(str, thumbState);
                MoneybotChatViewModel.Content.ToastMessage toastMessage = MoneybotChatViewModel.Content.ToastMessage.FeedbackSubmitted;
                moneybotChatPresenter$displayFeedbackSubmittedToast$1.L$0 = null;
                moneybotChatPresenter$displayFeedbackSubmittedToast$1.L$1 = null;
                moneybotChatPresenter$displayFeedbackSubmittedToast$1.label = 2;
            }
        }
        moneybotChatPresenter$displayFeedbackSubmittedToast$1 = new MoneybotChatPresenter$displayFeedbackSubmittedToast$1(moneybotChatPresenter, continuationImpl);
        Object obj3 = moneybotChatPresenter$displayFeedbackSubmittedToast$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = moneybotChatPresenter$displayFeedbackSubmittedToast$1.label;
        if (i != 0) {
        }
        moneybotChatPresenter.updateThumbState(str, thumbState);
        MoneybotChatViewModel.Content.ToastMessage toastMessage2 = MoneybotChatViewModel.Content.ToastMessage.FeedbackSubmitted;
        moneybotChatPresenter$displayFeedbackSubmittedToast$1.L$0 = null;
        moneybotChatPresenter$displayFeedbackSubmittedToast$1.L$1 = null;
        moneybotChatPresenter$displayFeedbackSubmittedToast$1.label = 2;
    }

    public static Set kickoffStreamingTexts(List list) {
        return SequencesKt___SequencesKt.toSet(SequencesKt___SequencesKt.map(SequencesKt___SequencesKt.filter(SequencesKt___SequencesKt.filter(CollectionsKt.asSequence(list), MoneybotChatPresenter$kickoffStreamingTexts$$inlined$filterIsInstance$1.INSTANCE), new MoneyTabUIKt$$ExternalSyntheticLambda13(20)), new MoneyTabUIKt$$ExternalSyntheticLambda13(21)));
    }

    public static Object sendMessage$default(MoneybotChatPresenter moneybotChatPresenter, RealChatSessionManager realChatSessionManager, String str, boolean z, List list, MoneybotChatViewEvent$SuggestionEvent$SuggestionMetadata moneybotChatViewEvent$SuggestionEvent$SuggestionMetadata, SuspendLambda suspendLambda, int i) {
        if ((i & 2) != 0) {
            z = false;
        }
        boolean z2 = z;
        if ((i & 4) != 0) {
            list = EmptyList.INSTANCE;
        }
        List list2 = list;
        if ((i & 8) != 0) {
            moneybotChatViewEvent$SuggestionEvent$SuggestionMetadata = null;
        }
        return moneybotChatPresenter.sendMessage(realChatSessionManager, str, z2, list2, moneybotChatViewEvent$SuggestionEvent$SuggestionMetadata, suspendLambda);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x008a -> B:10:0x008d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable buildMessages(String str, boolean z, List list, ContinuationImpl continuationImpl) {
        MoneybotChatPresenter$buildMessages$1 moneybotChatPresenter$buildMessages$1;
        int i;
        int i2;
        String str2;
        boolean z2;
        Iterator it;
        Collection collection;
        int i3;
        int i4;
        if (continuationImpl instanceof MoneybotChatPresenter$buildMessages$1) {
            moneybotChatPresenter$buildMessages$1 = (MoneybotChatPresenter$buildMessages$1) continuationImpl;
            int i5 = moneybotChatPresenter$buildMessages$1.label;
            if ((i5 & PKIFailureInfo.systemUnavail) != 0) {
                moneybotChatPresenter$buildMessages$1.label = i5 - PKIFailureInfo.systemUnavail;
                Object obj = moneybotChatPresenter$buildMessages$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = moneybotChatPresenter$buildMessages$1.label;
                Continuation continuation = null;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    ArrayList arrayList = new ArrayList();
                    i2 = 0;
                    str2 = str;
                    z2 = z;
                    it = list.iterator();
                    collection = arrayList;
                    i3 = 0;
                    i4 = 0;
                    if (!it.hasNext()) {
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i3 = moneybotChatPresenter$buildMessages$1.I$2;
                    i2 = moneybotChatPresenter$buildMessages$1.I$1;
                    i4 = moneybotChatPresenter$buildMessages$1.I$0;
                    boolean z3 = moneybotChatPresenter$buildMessages$1.Z$0;
                    it = moneybotChatPresenter$buildMessages$1.L$6;
                    collection = moneybotChatPresenter$buildMessages$1.L$4;
                    str2 = moneybotChatPresenter$buildMessages$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                    z2 = z3;
                    Message.ImageMessage imageMessage = (Message.ImageMessage) obj;
                    if (imageMessage != null) {
                        collection.add(imageMessage);
                    }
                    if (!it.hasNext()) {
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.addAll((List) collection);
                        if (str2 != null && str2.length() != 0) {
                            arrayList2.add(new Message.TextMessage(null, Message.Role.ROLE_USER, null, str2, false, z2, 16));
                        }
                        return arrayList2;
                    }
                    ChatFooterViewModel$Attachment$ImageAttachment chatFooterViewModel$Attachment$ImageAttachment = (ChatFooterViewModel$Attachment$ImageAttachment) it.next();
                    if (chatFooterViewModel$Attachment$ImageAttachment == null) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    moneybotChatPresenter$buildMessages$1.L$0 = str2;
                    moneybotChatPresenter$buildMessages$1.L$4 = collection;
                    moneybotChatPresenter$buildMessages$1.L$6 = it;
                    moneybotChatPresenter$buildMessages$1.Z$0 = z2;
                    moneybotChatPresenter$buildMessages$1.I$0 = i4;
                    moneybotChatPresenter$buildMessages$1.I$1 = i2;
                    moneybotChatPresenter$buildMessages$1.I$2 = i3;
                    moneybotChatPresenter$buildMessages$1.label = 1;
                    obj = JobKt.withContext(this.ioContext, new AnimationsKt$takeUntil$1$1(chatFooterViewModel$Attachment$ImageAttachment, this, continuation, 22), moneybotChatPresenter$buildMessages$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    Message.ImageMessage imageMessage2 = (Message.ImageMessage) obj;
                    if (imageMessage2 != null) {
                    }
                    if (!it.hasNext()) {
                    }
                }
            }
        }
        moneybotChatPresenter$buildMessages$1 = new MoneybotChatPresenter$buildMessages$1(this, continuationImpl);
        Object obj2 = moneybotChatPresenter$buildMessages$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = moneybotChatPresenter$buildMessages$1.label;
        Continuation continuation2 = null;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object displayToast(MoneybotChatViewModel.Content.ToastMessage toastMessage, ContinuationImpl continuationImpl) {
        MoneybotChatPresenter$displayToast$1 moneybotChatPresenter$displayToast$1;
        int i;
        if (continuationImpl instanceof MoneybotChatPresenter$displayToast$1) {
            moneybotChatPresenter$displayToast$1 = (MoneybotChatPresenter$displayToast$1) continuationImpl;
            int i2 = moneybotChatPresenter$displayToast$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                moneybotChatPresenter$displayToast$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = moneybotChatPresenter$displayToast$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = moneybotChatPresenter$displayToast$1.label;
                ParcelableSnapshotMutableState parcelableSnapshotMutableState = this.toastMessage$delegate;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    parcelableSnapshotMutableState.setValue(toastMessage);
                    long j = MoneybotChatPresenterKt.ToastMessageDuration;
                    moneybotChatPresenter$displayToast$1.label = 1;
                    if (JobKt.m4182delayVtjQ1oo(j, moneybotChatPresenter$displayToast$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                parcelableSnapshotMutableState.setValue(null);
                return Unit.INSTANCE;
            }
        }
        moneybotChatPresenter$displayToast$1 = new MoneybotChatPresenter$displayToast$1(this, continuationImpl);
        Object obj2 = moneybotChatPresenter$displayToast$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = moneybotChatPresenter$displayToast$1.label;
        ParcelableSnapshotMutableState parcelableSnapshotMutableState2 = this.toastMessage$delegate;
        if (i != 0) {
        }
        parcelableSnapshotMutableState2.setValue(null);
        return Unit.INSTANCE;
    }

    public final Versioned getDidClickStartNewChat() {
        return (Versioned) this.didClickStartNewChat$delegate.getValue();
    }

    @Override // com.squareup.cash.observability.protovalidation.HasObservability
    public final ErrorReporter getErrorReporter() {
        return this.errorReporter;
    }

    @Override // com.squareup.cash.observability.protovalidation.HasObservability
    public final SampleStrategy getOneErrorPerAppSessionStrategy() {
        return this.oneErrorPerAppSessionStrategy;
    }

    public final List getPendingMessages() {
        return (List) this.pendingMessages$delegate.getValue();
    }

    public final Set getStreamingKickoffTexts() {
        return (Set) this.streamingKickoffTexts$delegate.getValue();
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    @Override // app.cash.broadway.presenter.molecule.MoleculePresenter
    public final java.lang.Object models(kotlinx.coroutines.flow.Flow r59, androidx.compose.runtime.Composer r60, int r61) {
        /*
            Method dump skipped, instructions count: 3520
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.cash.moneybot.presenters.MoneybotChatPresenter.models(kotlinx.coroutines.flow.Flow, androidx.compose.runtime.Composer, int):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0123, code lost:
    
        if (r0 == r6) goto L46;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object sendMessage(RealChatSessionManager realChatSessionManager, String str, boolean z, List list, MoneybotChatViewEvent$SuggestionEvent$SuggestionMetadata moneybotChatViewEvent$SuggestionEvent$SuggestionMetadata, ContinuationImpl continuationImpl) {
        MoneybotChatPresenter$sendMessage$1 moneybotChatPresenter$sendMessage$1;
        Object obj;
        Serializable serializable;
        int i;
        MoneybotChatViewEvent$SuggestionEvent$SuggestionMetadata moneybotChatViewEvent$SuggestionEvent$SuggestionMetadata2;
        RealChatSessionManager realChatSessionManager2;
        String str2;
        boolean z2;
        List list2;
        ChatSessionError chatSessionError;
        String str3 = str;
        boolean z3 = z;
        List list3 = list;
        if (continuationImpl instanceof MoneybotChatPresenter$sendMessage$1) {
            moneybotChatPresenter$sendMessage$1 = (MoneybotChatPresenter$sendMessage$1) continuationImpl;
            int i2 = moneybotChatPresenter$sendMessage$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                moneybotChatPresenter$sendMessage$1.label = i2 - PKIFailureInfo.systemUnavail;
                obj = moneybotChatPresenter$sendMessage$1.result;
                serializable = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = moneybotChatPresenter$sendMessage$1.label;
                ParcelableSnapshotMutableState parcelableSnapshotMutableState = this.restoreInputText$delegate;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    parcelableSnapshotMutableState.setValue(null);
                    moneybotChatPresenter$sendMessage$1.L$0 = realChatSessionManager;
                    moneybotChatPresenter$sendMessage$1.L$1 = str3;
                    moneybotChatPresenter$sendMessage$1.L$2 = list3;
                    moneybotChatViewEvent$SuggestionEvent$SuggestionMetadata2 = moneybotChatViewEvent$SuggestionEvent$SuggestionMetadata;
                    moneybotChatPresenter$sendMessage$1.L$3 = moneybotChatViewEvent$SuggestionEvent$SuggestionMetadata2;
                    moneybotChatPresenter$sendMessage$1.Z$0 = z3;
                    moneybotChatPresenter$sendMessage$1.label = 1;
                    Serializable buildMessages = buildMessages(str3, z3, list3, moneybotChatPresenter$sendMessage$1);
                    if (buildMessages != serializable) {
                        realChatSessionManager2 = realChatSessionManager;
                        obj = buildMessages;
                    }
                    return serializable;
                }
                if (i == 1) {
                    boolean z4 = moneybotChatPresenter$sendMessage$1.Z$0;
                    MoneybotChatViewEvent$SuggestionEvent$SuggestionMetadata moneybotChatViewEvent$SuggestionEvent$SuggestionMetadata3 = moneybotChatPresenter$sendMessage$1.L$3;
                    list3 = moneybotChatPresenter$sendMessage$1.L$2;
                    String str4 = moneybotChatPresenter$sendMessage$1.L$1;
                    realChatSessionManager2 = moneybotChatPresenter$sendMessage$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                    z3 = z4;
                    str3 = str4;
                    moneybotChatViewEvent$SuggestionEvent$SuggestionMetadata2 = moneybotChatViewEvent$SuggestionEvent$SuggestionMetadata3;
                } else {
                    if (i != 2) {
                        if (i != 3) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        List list4 = moneybotChatPresenter$sendMessage$1.L$2;
                        SafeTrace.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    z2 = moneybotChatPresenter$sendMessage$1.Z$0;
                    list2 = moneybotChatPresenter$sendMessage$1.L$2;
                    str2 = moneybotChatPresenter$sendMessage$1.L$1;
                    SafeTrace.throwOnFailure(obj);
                    chatSessionError = (ChatSessionError) obj;
                    if (chatSessionError != null) {
                        return Unit.INSTANCE;
                    }
                    moneybotChatPresenter$sendMessage$1.L$0 = null;
                    moneybotChatPresenter$sendMessage$1.L$1 = null;
                    moneybotChatPresenter$sendMessage$1.L$2 = null;
                    moneybotChatPresenter$sendMessage$1.L$3 = null;
                    moneybotChatPresenter$sendMessage$1.Z$0 = z2;
                    moneybotChatPresenter$sendMessage$1.label = 3;
                    if (!z2) {
                        parcelableSnapshotMutableState.setValue(str2);
                        this.pendingAttachments$delegate.setValue(list2);
                    }
                    setPendingMessages(EmptyList.INSTANCE);
                    setStreamingKickoffTexts(EmptySet.INSTANCE);
                    Object displayToast = displayToast(chatSessionError instanceof ChatSessionError.NetworkError ? MoneybotChatViewModel.Content.ToastMessage.NetworkError : MoneybotChatViewModel.Content.ToastMessage.SendFailed, moneybotChatPresenter$sendMessage$1);
                    if (displayToast != serializable) {
                        displayToast = Unit.INSTANCE;
                    }
                }
                ArrayList plus = CollectionsKt.plus((Iterable) obj, (Collection) this.heldKickoffMessages$delegate.getValue());
                if (!z3) {
                    setPendingMessages(CollectionsKt.plus((Collection) getPendingMessages(), (Object) new PendingMessage.Resolved(new MessageViewModel.UserMessageViewModel(str3, false, 4))));
                }
                String str5 = moneybotChatViewEvent$SuggestionEvent$SuggestionMetadata2 == null ? moneybotChatViewEvent$SuggestionEvent$SuggestionMetadata2.suggestionsId : null;
                Message[] messageArr = (Message[]) plus.toArray(new Message[0]);
                Message[] messageArr2 = (Message[]) Arrays.copyOf(messageArr, messageArr.length);
                moneybotChatPresenter$sendMessage$1.L$0 = null;
                moneybotChatPresenter$sendMessage$1.L$1 = str3;
                moneybotChatPresenter$sendMessage$1.L$2 = list3;
                moneybotChatPresenter$sendMessage$1.L$3 = null;
                moneybotChatPresenter$sendMessage$1.Z$0 = z3;
                moneybotChatPresenter$sendMessage$1.label = 2;
                obj = realChatSessionManager2.sendMessages(str5, messageArr2, moneybotChatPresenter$sendMessage$1);
                if (obj != serializable) {
                    List list5 = list3;
                    str2 = str3;
                    z2 = z3;
                    list2 = list5;
                    chatSessionError = (ChatSessionError) obj;
                    if (chatSessionError != null) {
                    }
                }
                return serializable;
            }
        }
        moneybotChatPresenter$sendMessage$1 = new MoneybotChatPresenter$sendMessage$1(this, continuationImpl);
        obj = moneybotChatPresenter$sendMessage$1.result;
        serializable = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = moneybotChatPresenter$sendMessage$1.label;
        ParcelableSnapshotMutableState parcelableSnapshotMutableState2 = this.restoreInputText$delegate;
        if (i != 0) {
        }
        ArrayList plus2 = CollectionsKt.plus((Iterable) obj, (Collection) this.heldKickoffMessages$delegate.getValue());
        if (!z3) {
        }
        if (moneybotChatViewEvent$SuggestionEvent$SuggestionMetadata2 == null) {
        }
        Message[] messageArr3 = (Message[]) plus2.toArray(new Message[0]);
        Message[] messageArr22 = (Message[]) Arrays.copyOf(messageArr3, messageArr3.length);
        moneybotChatPresenter$sendMessage$1.L$0 = null;
        moneybotChatPresenter$sendMessage$1.L$1 = str3;
        moneybotChatPresenter$sendMessage$1.L$2 = list3;
        moneybotChatPresenter$sendMessage$1.L$3 = null;
        moneybotChatPresenter$sendMessage$1.Z$0 = z3;
        moneybotChatPresenter$sendMessage$1.label = 2;
        obj = realChatSessionManager2.sendMessages(str5, messageArr22, moneybotChatPresenter$sendMessage$1);
        if (obj != serializable) {
        }
        return serializable;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0070, code lost:
    
        if (displayToast(r8, r0) == r1) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0085, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0083, code lost:
    
        if (displayToast(r8, r0) == r1) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x005b, code lost:
    
        if (r10 == r1) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object sendMessages(RealChatSessionManager realChatSessionManager, List list, ContinuationImpl continuationImpl) {
        MoneybotChatPresenter$sendMessages$1 moneybotChatPresenter$sendMessages$1;
        int i;
        ChatSessionError chatSessionError;
        if (continuationImpl instanceof MoneybotChatPresenter$sendMessages$1) {
            moneybotChatPresenter$sendMessages$1 = (MoneybotChatPresenter$sendMessages$1) continuationImpl;
            int i2 = moneybotChatPresenter$sendMessages$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                moneybotChatPresenter$sendMessages$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = moneybotChatPresenter$sendMessages$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = moneybotChatPresenter$sendMessages$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    setPendingMessages(toPendingMessages(list));
                    Message[] messageArr = (Message[]) list.toArray(new Message[0]);
                    Message[] messageArr2 = (Message[]) Arrays.copyOf(messageArr, messageArr.length);
                    moneybotChatPresenter$sendMessages$1.label = 1;
                    obj = realChatSessionManager.sendMessages(null, messageArr2, moneybotChatPresenter$sendMessages$1);
                } else {
                    if (i != 1) {
                        if (i == 2 || i == 3) {
                            SafeTrace.throwOnFailure(obj);
                            return Boolean.FALSE;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                chatSessionError = (ChatSessionError) obj;
                if (!Intrinsics.areEqual(chatSessionError, ChatSessionError.NetworkError.INSTANCE)) {
                    MoneybotChatViewModel.Content.ToastMessage toastMessage = MoneybotChatViewModel.Content.ToastMessage.NetworkError;
                    moneybotChatPresenter$sendMessages$1.label = 2;
                } else {
                    if (!Intrinsics.areEqual(chatSessionError, ChatSessionError.RequestFailed.INSTANCE)) {
                        return Boolean.TRUE;
                    }
                    MoneybotChatViewModel.Content.ToastMessage toastMessage2 = MoneybotChatViewModel.Content.ToastMessage.SendFailed;
                    moneybotChatPresenter$sendMessages$1.label = 3;
                }
            }
        }
        moneybotChatPresenter$sendMessages$1 = new MoneybotChatPresenter$sendMessages$1(this, continuationImpl);
        Object obj3 = moneybotChatPresenter$sendMessages$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = moneybotChatPresenter$sendMessages$1.label;
        if (i != 0) {
        }
        chatSessionError = (ChatSessionError) obj3;
        if (!Intrinsics.areEqual(chatSessionError, ChatSessionError.NetworkError.INSTANCE)) {
        }
    }

    public final void setPendingMessages(List list) {
        this.pendingMessages$delegate.setValue(list);
    }

    public final void setStreamingKickoffTexts(Set set) {
        this.streamingKickoffTexts$delegate.setValue(set);
    }

    public final void submitFeedback(String str, String str2, FeedbackType feedbackType, String str3, String str4) {
        if (str == null || StringsKt.isBlank(str) || StringsKt.isBlank(str2)) {
            return;
        }
        JobKt.launch$default(this.scope, null, null, new MoneybotChatPresenter$models$6$1(this, str, feedbackType, str3, str4, str2, (Continuation) null), 3);
    }

    public final void submitQuickActionTap(String str, String str2, MoneybotQuickActionTap.QuickActionType quickActionType) {
        this.analyticsService.analytics.track(new MoneybotQuickActionTap(str, str2, quickActionType), null);
    }

    public final ArrayList toPendingMessages(List list) {
        Iterable iterable;
        PendingMessage deferred;
        Iterable iterable2;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Message message = (Message) it.next();
            if (message.getHiddenByServer()) {
                iterable2 = EmptyList.INSTANCE;
            } else {
                if (message instanceof Message.TextMessage) {
                    Message.TextMessage textMessage = (Message.TextMessage) message;
                    int ordinal = textMessage.role.ordinal();
                    MessageViewModel moneybotMessageViewModel = ordinal != 1 ? ordinal != 2 ? null : new MessageViewModel.MoneybotMessageViewModel(textMessage.messageId, zzabx.getEscapedText(textMessage), true, false, null, null, getStreamingKickoffTexts().contains(zzabx.getEscapedText(textMessage)), null, EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_NAVBAR_DARK_APPEARANCE_VALUE) : new MessageViewModel.UserMessageViewModel(textMessage.text, false, 4);
                    iterable = CollectionsKt__CollectionsKt.listOfNotNull(moneybotMessageViewModel != null ? new PendingMessage.Resolved(moneybotMessageViewModel) : null);
                } else if (message instanceof Message.ToolResponse) {
                    Message.ToolResponse toolResponse = (Message.ToolResponse) message;
                    List<Message.ToolResponse.UserContent> list2 = toolResponse.results;
                    ArrayList arrayList2 = new ArrayList();
                    for (Message.ToolResponse.UserContent userContent : list2) {
                        if (userContent instanceof Message.ToolResponse.UserContent.Text) {
                            deferred = new PendingMessage.Resolved(new MessageViewModel.MoneybotMessageViewModel(toolResponse.messageId, StringsKt__StringsJVMKt.replace$default(((Message.ToolResponse.UserContent.Text) userContent).text, "$", "\\$"), true, false, null, null, false, null, EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE));
                        } else {
                            if (!(userContent instanceof ClientRenderable)) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return null;
                            }
                            deferred = new PendingMessage.Deferred((ClientRenderable) userContent);
                        }
                        arrayList2.add(deferred);
                    }
                    iterable = arrayList2;
                } else {
                    iterable = EmptyList.INSTANCE;
                }
                iterable2 = iterable;
            }
            CollectionsKt__MutableCollectionsKt.addAll(iterable2, arrayList);
        }
        return arrayList;
    }

    public final void updateThumbState(String str, MessageViewModel.MoneybotMessageViewModel.ThumbState thumbState) {
        int ordinal = thumbState.ordinal();
        SnapshotStateMap snapshotStateMap = this.thumbStates;
        if (ordinal == 0) {
            snapshotStateMap.remove(str);
        } else if (ordinal == 1 || ordinal == 2) {
            snapshotStateMap.put(str, thumbState);
        } else {
            Drop$$ExternalSyntheticBUOutline0.m1m();
        }
    }
}
