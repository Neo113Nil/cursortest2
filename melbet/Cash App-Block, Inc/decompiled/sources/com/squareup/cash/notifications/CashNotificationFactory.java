package com.squareup.cash.notifications;

import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.cash.clientroutes.RealClientRouteParser;
import com.squareup.cash.clientrouting.ClientRouteParserKt;
import com.squareup.cash.data.push.CashPushNotification;
import com.squareup.cash.notifications.CashNotification;
import com.squareup.cash.notifications.Op;
import com.squareup.cash.support.chat.backend.real.RealChatNotificationSuppressor;
import com.squareup.protos.franklin.common.appmessaging.AppMessageAction;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class CashNotificationFactory {
    public final RealChatNotificationSuppressor chatNotificationSuppressor;
    public final RealClientRouteParser clientRouteParser;

    public CashNotificationFactory(RealClientRouteParser realClientRouteParser, RealChatNotificationSuppressor realChatNotificationSuppressor) {
        realClientRouteParser.getClass();
        realChatNotificationSuppressor.getClass();
        this.clientRouteParser = realClientRouteParser;
        this.chatNotificationSuppressor = realChatNotificationSuppressor;
    }

    public final CashNotification asCashNotification(CashPushNotification cashPushNotification) {
        cashPushNotification.getClass();
        Op.Companion companion = Op.Companion;
        String op = cashPushNotification.getOp();
        companion.getClass();
        Op fromPush = Op.Companion.fromPush(op);
        if (cashPushNotification.getPaymentToken() != null && fromPush != Op.OPEN_URL) {
            return new CashNotification.PaymentNotification(cashPushNotification.getPaymentToken(), cashPushNotification.getPaymentAmount(), cashPushNotification.getVerificationInstrumentToken(), cashPushNotification);
        }
        switch (fromPush.ordinal()) {
            case 0:
                return new CashNotification.OtherNotification(cashPushNotification);
            case 1:
                AppMessageAction appMessageAction = cashPushNotification.getAppMessageAction();
                appMessageAction.getClass();
                return new CashNotification.AppMessageActionNotification(appMessageAction, cashPushNotification);
            case 2:
                return new CashNotification.PlayIntegrityDeviceChallengeNotification(cashPushNotification.getPlayIntegrityChallengeToken(), cashPushNotification);
            case 3:
                return new CashNotification.GetProfileNotification(cashPushNotification);
            case 4:
                return new CashNotification.GetRewardsNotification(cashPushNotification);
            case 5:
                return new CashNotification.HomeNotification(cashPushNotification);
            case 6:
                if (Intrinsics.areEqual(cashPushNotification.getUrl(), "/launch/activity")) {
                    return new CashNotification.AppMessageActionNotification(new AppMessageAction(AppMessageAction.Action.SHOW_ACTIVITY), cashPushNotification);
                }
                String url = cashPushNotification.getUrl();
                url.getClass();
                ClientRoute tryParse = ClientRouteParserKt.tryParse(this.clientRouteParser, url);
                if (tryParse instanceof ClientRoute.ClientScenario) {
                    return new CashNotification.ClientRouteNotification.ClientScenarioClientRouteNotification((ClientRoute.ClientScenario) tryParse, cashPushNotification);
                }
                if (tryParse instanceof ClientRoute.ViewSupportChatNewUnreadMessage) {
                    RealChatNotificationSuppressor realChatNotificationSuppressor = this.chatNotificationSuppressor;
                    if (realChatNotificationSuppressor.onChatScreen && realChatNotificationSuppressor.inForeground) {
                        r2 = true;
                    }
                    return new CashNotification.ClientRouteNotification.SupportChatMessageNotification(r2, new ClientRoute.ViewSupportChat(((ClientRoute.ViewSupportChatNewUnreadMessage) tryParse).accountIdentifier, 3), cashPushNotification);
                }
                if (tryParse instanceof ClientRoute.ViewSupportSurvey) {
                    return new CashNotification.ClientRouteNotification.SupportSurveyNotification((ClientRoute.ViewSupportSurvey) tryParse, cashPushNotification);
                }
                if (!(tryParse instanceof ClientRoute.ViewSupportPhoneVerification)) {
                    return tryParse instanceof ClientRoute.ViewSupportPhone ? new CashNotification.SupportPhoneStatusNotification((ClientRoute.ViewSupportPhone) tryParse, cashPushNotification) : ((tryParse instanceof ClientRoute.RequestReviewPrompt) || (tryParse instanceof ClientRoute.RefreshBitcoinInvoice) || (tryParse instanceof ClientRoute.RefreshAllAppMessagesInBackground) || (tryParse instanceof ClientRoute.CollectGpsLocationData) || (tryParse instanceof ClientRoute.UpdateAfterpayApplet)) ? new CashNotification.ClientRouteNotification.BackgroundClientRouteNotification(tryParse, cashPushNotification) : tryParse == null ? new CashNotification.OpenExternalUrlNotification(cashPushNotification) : new CashNotification.ClientRouteNotification.OtherClientRouteNotification(tryParse, cashPushNotification);
                }
                ClientRoute.ViewSupportPhoneVerification viewSupportPhoneVerification = (ClientRoute.ViewSupportPhoneVerification) tryParse;
                return new CashNotification.ClientRouteNotification.SupportPhoneVerificationNotification(viewSupportPhoneVerification, cashPushNotification, viewSupportPhoneVerification.getVerificationId());
            case 7:
                return new CashNotification.PasscodeChangedNotification(cashPushNotification.getInstrument(), cashPushNotification);
            case 8:
                CashPushNotification.ClearAppDataConfig clearAppDataConfig = cashPushNotification.getClearAppDataConfig();
                if ((clearAppDataConfig != null ? clearAppDataConfig.getClearAll() : null) == null) {
                    return new CashNotification.OtherNotification(cashPushNotification);
                }
                Boolean clearOnNextLaunch = cashPushNotification.getClearAppDataConfig().getClearAll().getClearOnNextLaunch();
                return new CashNotification$ClearAppDataNotification$ClearAll(clearOnNextLaunch != null ? clearOnNextLaunch.booleanValue() : false, cashPushNotification);
            default:
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
        }
    }
}
