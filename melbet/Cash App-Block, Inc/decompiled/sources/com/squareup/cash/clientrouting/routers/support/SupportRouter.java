package com.squareup.cash.clientrouting.routers.support;

import app.cash.broadway.navigation.Navigator;
import app.cash.broadway.screen.Screen;
import app.cash.history.screens.HistoryScreens;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.gms.internal.mlkit_vision_face.zzkp;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.activity.backend.ActivityItemKt;
import com.squareup.cash.banking.screens.BankingScreens;
import com.squareup.cash.benefits.screens.BenefitsScreen;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.cdf.customersupport.CustomerSupportAccessStart;
import com.squareup.cash.cdf.customersupport.CustomerSupportPhoneViewStatus;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.cash.clientrouting.analytics.AnalyticsParams;
import com.squareup.cash.clientrouting.data.RoutingParams;
import com.squareup.cash.featureflags.AmplitudeExperiments$ClientSupportAutomationConnectedSupportHome;
import com.squareup.cash.featureflags.FeatureFlag$EnabledDisabledAmplitudeExperiment$Options;
import com.squareup.cash.featureflags.RealFeatureFlagManager;
import com.squareup.cash.money.screens.MoneyTabScreen;
import com.squareup.cash.moneybot.screens.MoneybotChatScreen;
import com.squareup.cash.payments.screens.PaymentScreens$HomeScreens$Home;
import com.squareup.cash.profile.screens.ProfileScreens;
import com.squareup.cash.screens.Finish;
import com.squareup.cash.screens.MainScreens;
import com.squareup.cash.support.chat.backend.real.RealChatNotificationSuppressor;
import com.squareup.cash.support.chat.screens.SupportChatScreens;
import com.squareup.cash.support.navigation.RealSupportNavigator;
import com.squareup.cash.support.navigation.SupportNavigator$Source;
import com.squareup.cash.support.screens.SupportScreens;
import com.squareup.cash.util.clock.AndroidClock;
import com.squareup.cash.wallet.screens.WalletHomeScreen;
import com.squareup.cropview.Edge;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class SupportRouter {
    public final RealChatNotificationSuppressor chatNotificationSuppressor;
    public final Navigator navigator;
    public final RealSupportNavigator supportNavigator;

    /* loaded from: classes.dex */
    public final class Factory {
        public final RealChatNotificationSuppressor chatNotificationSuppressor;
        public final AndroidClock clock;
        public final RealSupportNavigator supportNavigator;

        public Factory(RealSupportNavigator realSupportNavigator, RealChatNotificationSuppressor realChatNotificationSuppressor, AndroidClock androidClock) {
            this.supportNavigator = realSupportNavigator;
            this.chatNotificationSuppressor = realChatNotificationSuppressor;
            this.clock = androidClock;
        }
    }

    public SupportRouter(Navigator navigator, RealSupportNavigator realSupportNavigator, RealChatNotificationSuppressor realChatNotificationSuppressor, AndroidClock androidClock) {
        navigator.getClass();
        this.navigator = navigator;
        this.supportNavigator = realSupportNavigator;
        this.chatNotificationSuppressor = realChatNotificationSuppressor;
    }

    public static String extractFlowTokenFromOrigin(Screen screen) {
        if (screen instanceof SupportChatScreens.FlowScreen.ChatScreen) {
            return ((SupportChatScreens.FlowScreen.ChatScreen) screen).flowToken;
        }
        if (screen instanceof SupportScreens.FlowScreens) {
            return ((SupportScreens.FlowScreens) screen).getData().flowToken;
        }
        return null;
    }

    public static String toPaymentToken(RoutingParams routingParams) {
        Screen screen = routingParams.origin;
        if (screen instanceof HistoryScreens.PaymentReceipt) {
            return ActivityItemKt.getItemId(((HistoryScreens.PaymentReceipt) screen).activityItemKey.activityItemGlobalId);
        }
        return null;
    }

    public static SupportNavigator$Source toSource(RoutingParams routingParams) {
        RoutingParams.DeepLinkMetadata deepLinkMetadata = routingParams.deepLinkMetadata;
        String str = routingParams.source;
        if (deepLinkMetadata != null) {
            return SupportNavigator$Source.DEEP_LINK;
        }
        Screen screen = routingParams.origin;
        return screen instanceof HistoryScreens.PaymentReceipt ? SupportNavigator$Source.RECEIPT : screen instanceof MoneybotChatScreen ? SupportNavigator$Source.MONEYBOT : screen instanceof ProfileScreens ? SupportNavigator$Source.PROFILE : screen instanceof BlockersScreens ? SupportNavigator$Source.BLOCKER_FLOW : screen instanceof WalletHomeScreen ? SupportNavigator$Source.CARD : screen instanceof BenefitsScreen ? SupportNavigator$Source.BENEFITS : ((screen instanceof MoneyTabScreen) || (screen instanceof BankingScreens) || Intrinsics.areEqual(str, "MONEY_TAB")) ? SupportNavigator$Source.MONEY : Intrinsics.areEqual(str, "support_sync_value") ? SupportNavigator$Source.SYNC_VALUE : Intrinsics.areEqual(str, "PUSH_NOTIFICATION") ? SupportNavigator$Source.NOTIFICATION : SupportNavigator$Source.UNKNOWN;
    }

    public final void route(ClientRoute.ViewSupportForTransaction viewSupportForTransaction, RoutingParams routingParams) {
        viewSupportForTransaction.getClass();
        routingParams.getClass();
        String str = viewSupportForTransaction.entityId;
        Screen screen = routingParams.exitScreen;
        if (screen == null) {
            screen = new Finish(null);
        }
        Screen screen2 = screen;
        SupportNavigator$Source source = toSource(routingParams);
        RealSupportNavigator realSupportNavigator = this.supportNavigator;
        Screen showUnauthenticatedArticleScreenIfNecessary = realSupportNavigator.showUnauthenticatedArticleScreenIfNecessary(source);
        if (showUnauthenticatedArticleScreenIfNecessary == null) {
            BlockersData.Flow.INSTANCE.getClass();
            String generateToken = BlockersData.Flow.Companion.generateToken();
            SupportScreens.FlowScreens.Data data = new SupportScreens.FlowScreens.Data(generateToken, null, str, screen2, EnumC0170g.SDK_ASSET_ICON_QUESTION_VALUE);
            if (((FeatureFlag$EnabledDisabledAmplitudeExperiment$Options) ((RealFeatureFlagManager) realSupportNavigator.featureFlagManager).currentValue(AmplitudeExperiments$ClientSupportAutomationConnectedSupportHome.INSTANCE)).enabled()) {
                RealSupportNavigator.logAccessSupport$default(realSupportNavigator, source, CustomerSupportAccessStart.Destination.NODE, screen2, generateToken, data.paymentToken, null, null, 96);
                showUnauthenticatedArticleScreenIfNecessary = new SupportScreens.FlowScreens.ArticleScreen(SupportScreens.FlowScreens.SupportArticleConfig.ByTransactionId.INSTANCE, data, source == SupportNavigator$Source.RECEIPT, 4);
            } else {
                RealSupportNavigator.logAccessSupport$default(realSupportNavigator, source, CustomerSupportAccessStart.Destination.HOME, screen2, generateToken, str, null, null, 96);
                showUnauthenticatedArticleScreenIfNecessary = new SupportScreens.FlowScreens.SupportHomeScreen(null, data, null, 60);
            }
        }
        this.navigator.goTo(showUnauthenticatedArticleScreenIfNecessary);
    }

    public final void route(ClientRoute.ViewSupportSurvey viewSupportSurvey, RoutingParams routingParams) {
        viewSupportSurvey.getClass();
        routingParams.getClass();
        RealChatNotificationSuppressor realChatNotificationSuppressor = this.chatNotificationSuppressor;
        if (realChatNotificationSuppressor.onSurveyScreenState && realChatNotificationSuppressor.inForeground) {
            return;
        }
        this.navigator.goTo(this.supportNavigator.startSupportSurvey(viewSupportSurvey.surveyToken));
    }

    public final void route(ClientRoute.ViewSupport viewSupport, RoutingParams routingParams) {
        viewSupport.getClass();
        routingParams.getClass();
        String extractFlowTokenFromOrigin = extractFlowTokenFromOrigin(routingParams.origin);
        String paymentToken = toPaymentToken(routingParams);
        Screen screen = routingParams.exitScreen;
        if (screen == null) {
            screen = new Finish(null);
        }
        SupportNavigator$Source source = toSource(routingParams);
        BlockersData.MoneybotContext moneybotContext = zzkp.moneybotContext(routingParams);
        this.navigator.goTo(RealSupportNavigator.startSupportFlow$default(this.supportNavigator, null, paymentToken, screen, source, moneybotContext, extractFlowTokenFromOrigin, 5));
    }

    public final void route(ClientRoute.ViewSupportChat viewSupportChat, RoutingParams routingParams) {
        viewSupportChat.getClass();
        routingParams.getClass();
        String extractFlowTokenFromOrigin = extractFlowTokenFromOrigin(routingParams.origin);
        String paymentToken = toPaymentToken(routingParams);
        Screen screen = routingParams.exitScreen;
        if (screen == null) {
            screen = new Finish(null);
        }
        SupportNavigator$Source source = toSource(routingParams);
        BlockersData.MoneybotContext moneybotContext = zzkp.moneybotContext(routingParams);
        this.navigator.goTo(RealSupportNavigator.startSupportChat$default(this.supportNavigator, null, paymentToken, screen, source, moneybotContext, extractFlowTokenFromOrigin, 1));
    }

    public final void route(ClientRoute.ViewSupportHome viewSupportHome, RoutingParams routingParams) {
        viewSupportHome.getClass();
        routingParams.getClass();
        String extractFlowTokenFromOrigin = extractFlowTokenFromOrigin(routingParams.origin);
        String paymentToken = toPaymentToken(routingParams);
        Screen screen = routingParams.exitScreen;
        if (screen == null) {
            screen = new Finish(null);
        }
        SupportNavigator$Source source = toSource(routingParams);
        BlockersData.MoneybotContext moneybotContext = zzkp.moneybotContext(routingParams);
        this.navigator.goTo(this.supportNavigator.startSupportHome(paymentToken, screen, source, moneybotContext, extractFlowTokenFromOrigin));
    }

    public final void route(ClientRoute.ViewSupportNode viewSupportNode, RoutingParams routingParams) {
        viewSupportNode.getClass();
        routingParams.getClass();
        String extractFlowTokenFromOrigin = extractFlowTokenFromOrigin(routingParams.origin);
        String str = viewSupportNode.supportNodeToken;
        String paymentToken = toPaymentToken(routingParams);
        Screen screen = routingParams.exitScreen;
        if (screen == null) {
            screen = PaymentScreens$HomeScreens$Home.INSTANCE;
        }
        SupportNavigator$Source source = toSource(routingParams);
        BlockersData.MoneybotContext moneybotContext = zzkp.moneybotContext(routingParams);
        this.navigator.goTo(RealSupportNavigator.startSupportFlow$default(this.supportNavigator, str, paymentToken, screen, source, moneybotContext, extractFlowTokenFromOrigin, 4));
    }

    public final void route(ClientRoute.ViewSupportScreenshotRequest viewSupportScreenshotRequest, RoutingParams routingParams) {
        SupportScreens.ScreenshotScreen.SubmissionTarget submissionTarget;
        viewSupportScreenshotRequest.getClass();
        routingParams.getClass();
        SupportScreens.ScreenshotScreen.Trigger trigger = routingParams.origin instanceof SupportChatScreens ? SupportScreens.ScreenshotScreen.Trigger.SUPPORT_CHAT : SupportScreens.ScreenshotScreen.Trigger.NOTIFICATION;
        AnalyticsParams analyticsParams = routingParams.analyticsParams;
        AnalyticsParams.SupportAnalyticsParams supportAnalyticsParams = analyticsParams instanceof AnalyticsParams.SupportAnalyticsParams ? (AnalyticsParams.SupportAnalyticsParams) analyticsParams : null;
        String str = supportAnalyticsParams != null ? supportAnalyticsParams.flowToken : null;
        Edge.Companion companion = SupportScreens.ScreenshotScreen.SubmissionTarget.Companion;
        String str2 = viewSupportScreenshotRequest.submissionTarget;
        companion.getClass();
        if (str2.equals("session-recorder")) {
            submissionTarget = SupportScreens.ScreenshotScreen.SubmissionTarget.SESSION_RECORDER;
        } else if (str2.equals("support-chat")) {
            submissionTarget = SupportScreens.ScreenshotScreen.SubmissionTarget.SUPPORT_CHAT;
        } else {
            a$$ExternalSyntheticBUOutline0.m$3("Unknown submission target: ".concat(str2));
            return;
        }
        this.navigator.goTo(new SupportScreens.ScreenshotScreen.ScreenshotConfirmScreen(new SupportScreens.ScreenshotScreen.ScreenshotArgs(trigger, str, viewSupportScreenshotRequest.screenshotRequestId, submissionTarget)));
    }

    public final void route(ClientRoute.ViewSupportChatFromMoneybot viewSupportChatFromMoneybot, RoutingParams routingParams) {
        viewSupportChatFromMoneybot.getClass();
        routingParams.getClass();
        Screen screen = routingParams.exitScreen;
        if (screen == null) {
            screen = new Finish(null);
        }
        this.navigator.goTo(RealSupportNavigator.startSupportChat$default(this.supportNavigator, null, null, screen, SupportNavigator$Source.MONEYBOT, new BlockersData.MoneybotContext(viewSupportChatFromMoneybot.sessionId, viewSupportChatFromMoneybot.routeId), null, 35));
    }

    public final void route(ClientRoute.ViewSupportIncident viewSupportIncident, RoutingParams routingParams) {
        SupportScreens.FlowScreens.SupportIncidentDetailsScreen.Source source;
        viewSupportIncident.getClass();
        routingParams.getClass();
        Screen screen = routingParams.exitScreen;
        if (screen == null) {
            screen = new Finish(null);
        }
        Screen screen2 = screen;
        SupportNavigator$Source supportNavigator$Source = SupportNavigator$Source.NOTIFICATION;
        String str = viewSupportIncident.incidentId;
        RealSupportNavigator realSupportNavigator = this.supportNavigator;
        Screen showUnauthenticatedArticleScreenIfNecessary = realSupportNavigator.showUnauthenticatedArticleScreenIfNecessary(supportNavigator$Source);
        if (showUnauthenticatedArticleScreenIfNecessary == null) {
            BlockersData.Flow.INSTANCE.getClass();
            String generateToken = BlockersData.Flow.Companion.generateToken();
            RealSupportNavigator.logAccessSupport$default(realSupportNavigator, supportNavigator$Source, CustomerSupportAccessStart.Destination.INCIDENT, screen2, generateToken, null, null, null, 112);
            SupportScreens.FlowScreens.Data data = new SupportScreens.FlowScreens.Data(generateToken, null, null, screen2, EnumC0170g.SDK_ASSET_ICON_SUBTRACT_VALUE);
            if (RealSupportNavigator.WhenMappings.$EnumSwitchMapping$0[1] == 1) {
                source = SupportScreens.FlowScreens.SupportIncidentDetailsScreen.Source.NOTIFICATION;
            } else {
                source = SupportScreens.FlowScreens.SupportIncidentDetailsScreen.Source.UNKNOWN;
            }
            showUnauthenticatedArticleScreenIfNecessary = new SupportScreens.FlowScreens.SupportIncidentDetailsScreen(data, str, false, source);
        }
        this.navigator.goTo(showUnauthenticatedArticleScreenIfNecessary);
    }

    public final void route(ClientRoute.ViewSupportPhone viewSupportPhone, RoutingParams routingParams) {
        CustomerSupportPhoneViewStatus.Trigger trigger;
        viewSupportPhone.getClass();
        routingParams.getClass();
        boolean z = routingParams.exitScreen != null;
        SupportNavigator$Source supportNavigator$Source = SupportNavigator$Source.UNKNOWN;
        RealSupportNavigator realSupportNavigator = this.supportNavigator;
        Screen showUnauthenticatedArticleScreenIfNecessary = realSupportNavigator.showUnauthenticatedArticleScreenIfNecessary(supportNavigator$Source);
        if (showUnauthenticatedArticleScreenIfNecessary == null) {
            BlockersData.Flow.INSTANCE.getClass();
            String generateToken = BlockersData.Flow.Companion.generateToken();
            if (z) {
                supportNavigator$Source = SupportNavigator$Source.NOTIFICATION;
            }
            RealSupportNavigator.logAccessSupport$default(realSupportNavigator, supportNavigator$Source, CustomerSupportAccessStart.Destination.PHONE_STATUS, null, generateToken, null, null, null, 116);
            if (z) {
                trigger = CustomerSupportPhoneViewStatus.Trigger.NOTIFICATION;
            } else {
                trigger = CustomerSupportPhoneViewStatus.Trigger.REQUEST_CALL_FLOW;
            }
            showUnauthenticatedArticleScreenIfNecessary = new SupportScreens.SupportPhoneStatusScreen(z, generateToken, trigger);
        }
        this.navigator.goTo(showUnauthenticatedArticleScreenIfNecessary);
    }

    public final void route(ClientRoute.ViewSupportChatNewUnreadMessage viewSupportChatNewUnreadMessage, RoutingParams routingParams) {
        viewSupportChatNewUnreadMessage.getClass();
        routingParams.getClass();
        route(new ClientRoute.ViewSupportChat(viewSupportChatNewUnreadMessage.accountIdentifier, 3), routingParams);
    }

    public static void route(ClientRoute.SessionReplayRecord sessionReplayRecord, RoutingParams routingParams) {
        sessionReplayRecord.getClass();
        routingParams.getClass();
    }

    public final void route(ClientRoute.ViewSupportPhoneVerification viewSupportPhoneVerification, RoutingParams routingParams) {
        SupportScreens.PhoneVerificationScreen.Source source;
        viewSupportPhoneVerification.getClass();
        routingParams.getClass();
        String str = viewSupportPhoneVerification.verificationId;
        SupportNavigator$Source source2 = toSource(routingParams);
        str.getClass();
        SupportNavigator$Source supportNavigator$Source = SupportNavigator$Source.UNKNOWN;
        RealSupportNavigator realSupportNavigator = this.supportNavigator;
        MainScreens showUnauthenticatedArticleScreenIfNecessary = realSupportNavigator.showUnauthenticatedArticleScreenIfNecessary(supportNavigator$Source);
        if (showUnauthenticatedArticleScreenIfNecessary == null) {
            BlockersData.Flow.INSTANCE.getClass();
            String generateToken = BlockersData.Flow.Companion.generateToken();
            RealSupportNavigator.logAccessSupport$default(realSupportNavigator, source2, CustomerSupportAccessStart.Destination.PHONE_VERIFICATION, null, generateToken, null, null, null, 116);
            int ordinal = source2.ordinal();
            if (ordinal == 1) {
                source = SupportScreens.PhoneVerificationScreen.Source.NOTIFICATION;
            } else if (ordinal != 5) {
                source = SupportScreens.PhoneVerificationScreen.Source.UNKNOWN;
            } else {
                source = SupportScreens.PhoneVerificationScreen.Source.SYNC_VALUE;
            }
            showUnauthenticatedArticleScreenIfNecessary = new SupportScreens.PhoneVerificationScreen(str, generateToken, source);
        }
        this.navigator.goTo(showUnauthenticatedArticleScreenIfNecessary);
    }
}
