package com.squareup.cash.notifications;

import com.squareup.cash.cdf.NotificationType;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.cash.data.push.CashPushNotification;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.api.Instrument;
import com.squareup.protos.franklin.common.appmessaging.AppMessageAction;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public abstract class CashNotification {
    public final String analyticsKey;
    public final String body;
    public final String category;
    public final String engagementReportingId;
    public final String imageUrl;
    public final String notificationCategory;
    public final CashPushNotification.Customer otherCustomer;
    public final boolean showNotification;
    public final String title;
    public final CashPushNotification.TriggerEntitySync triggerEntitySync;
    public final String url;

    public final class AppMessageActionNotification extends CashNotification {
        public final AppMessageAction appMessageAction;
        public final CashPushNotification notification;
        public final NotificationType notificationType;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AppMessageActionNotification(AppMessageAction appMessageAction, CashPushNotification cashPushNotification) {
            super(cashPushNotification);
            cashPushNotification.getClass();
            this.appMessageAction = appMessageAction;
            this.notification = cashPushNotification;
            this.notificationType = NotificationType.APP_MESSAGE_ACTION;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AppMessageActionNotification)) {
                return false;
            }
            AppMessageActionNotification appMessageActionNotification = (AppMessageActionNotification) obj;
            return this.appMessageAction.equals(appMessageActionNotification.appMessageAction) && Intrinsics.areEqual(this.notification, appMessageActionNotification.notification);
        }

        @Override // com.squareup.cash.notifications.CashNotification
        public final NotificationType getNotificationType() {
            return this.notificationType;
        }

        @Override // com.squareup.cash.notifications.CashNotification
        public final int getPriority() {
            return 0;
        }

        public final int hashCode() {
            return this.notification.hashCode() + (this.appMessageAction.hashCode() * 31);
        }

        public final String toString() {
            return "AppMessageActionNotification(appMessageAction=" + this.appMessageAction + ", notification=" + this.notification + ")";
        }
    }

    public abstract class ClientRouteNotification extends CashNotification {
        public final int priority;

        public final class BackgroundClientRouteNotification extends ClientRouteNotification {
            public final ClientRoute clientRoute;
            public final boolean hasBackgroundTasks;
            public final CashPushNotification notification;
            public final NotificationType notificationType;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public BackgroundClientRouteNotification(ClientRoute clientRoute, CashPushNotification cashPushNotification) {
                super(cashPushNotification);
                clientRoute.getClass();
                cashPushNotification.getClass();
                this.clientRoute = clientRoute;
                this.notification = cashPushNotification;
                this.notificationType = NotificationType.CLIENT_ROUTE_BACKGROUND;
                this.hasBackgroundTasks = true;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof BackgroundClientRouteNotification)) {
                    return false;
                }
                BackgroundClientRouteNotification backgroundClientRouteNotification = (BackgroundClientRouteNotification) obj;
                return Intrinsics.areEqual(this.clientRoute, backgroundClientRouteNotification.clientRoute) && Intrinsics.areEqual(this.notification, backgroundClientRouteNotification.notification);
            }

            @Override // com.squareup.cash.notifications.CashNotification.ClientRouteNotification
            public final ClientRoute getClientRoute() {
                return this.clientRoute;
            }

            @Override // com.squareup.cash.notifications.CashNotification
            public final boolean getHasBackgroundTasks() {
                return this.hasBackgroundTasks;
            }

            @Override // com.squareup.cash.notifications.CashNotification
            public final NotificationType getNotificationType() {
                return this.notificationType;
            }

            @Override // com.squareup.cash.notifications.CashNotification
            public final boolean getShowNotification() {
                return false;
            }

            public final int hashCode() {
                return this.notification.hashCode() + (this.clientRoute.hashCode() * 31);
            }

            public final String toString() {
                return "BackgroundClientRouteNotification(clientRoute=" + this.clientRoute + ", notification=" + this.notification + ")";
            }
        }

        public final class ClientScenarioClientRouteNotification extends ClientRouteNotification {
            public final ClientRoute.ClientScenario clientRoute;
            public final CashPushNotification notification;
            public final NotificationType notificationType;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ClientScenarioClientRouteNotification(ClientRoute.ClientScenario clientScenario, CashPushNotification cashPushNotification) {
                super(cashPushNotification);
                cashPushNotification.getClass();
                this.clientRoute = clientScenario;
                this.notification = cashPushNotification;
                this.notificationType = NotificationType.CLIENT_ROUTE_CLIENT_SCENARIO;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ClientScenarioClientRouteNotification)) {
                    return false;
                }
                ClientScenarioClientRouteNotification clientScenarioClientRouteNotification = (ClientScenarioClientRouteNotification) obj;
                return this.clientRoute.equals(clientScenarioClientRouteNotification.clientRoute) && Intrinsics.areEqual(this.notification, clientScenarioClientRouteNotification.notification);
            }

            @Override // com.squareup.cash.notifications.CashNotification.ClientRouteNotification
            public final ClientRoute getClientRoute() {
                return this.clientRoute;
            }

            @Override // com.squareup.cash.notifications.CashNotification
            public final NotificationType getNotificationType() {
                return this.notificationType;
            }

            public final int hashCode() {
                return this.notification.hashCode() + (this.clientRoute.hashCode() * 31);
            }

            public final String toString() {
                return "ClientScenarioClientRouteNotification(clientRoute=" + this.clientRoute + ", notification=" + this.notification + ")";
            }
        }

        public final class OtherClientRouteNotification extends ClientRouteNotification {
            public final ClientRoute clientRoute;
            public final CashPushNotification notification;
            public final NotificationType notificationType;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OtherClientRouteNotification(ClientRoute clientRoute, CashPushNotification cashPushNotification) {
                super(cashPushNotification);
                cashPushNotification.getClass();
                this.clientRoute = clientRoute;
                this.notification = cashPushNotification;
                this.notificationType = NotificationType.CLIENT_ROUTE;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof OtherClientRouteNotification)) {
                    return false;
                }
                OtherClientRouteNotification otherClientRouteNotification = (OtherClientRouteNotification) obj;
                return this.clientRoute.equals(otherClientRouteNotification.clientRoute) && Intrinsics.areEqual(this.notification, otherClientRouteNotification.notification);
            }

            @Override // com.squareup.cash.notifications.CashNotification.ClientRouteNotification
            public final ClientRoute getClientRoute() {
                return this.clientRoute;
            }

            @Override // com.squareup.cash.notifications.CashNotification
            public final NotificationType getNotificationType() {
                return this.notificationType;
            }

            public final int hashCode() {
                return this.notification.hashCode() + (this.clientRoute.hashCode() * 31);
            }

            public final String toString() {
                return "OtherClientRouteNotification(clientRoute=" + this.clientRoute + ", notification=" + this.notification + ")";
            }
        }

        public final class SupportChatMessageNotification extends ClientRouteNotification {
            public final ClientRoute.ViewSupportChat clientRoute;
            public final boolean hasBackgroundTasks;
            public final CashPushNotification notification;
            public final NotificationType notificationType;
            public final boolean showNotification;
            public final boolean suppressed;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SupportChatMessageNotification(boolean z, ClientRoute.ViewSupportChat viewSupportChat, CashPushNotification cashPushNotification) {
                super(cashPushNotification);
                cashPushNotification.getClass();
                this.suppressed = z;
                this.clientRoute = viewSupportChat;
                this.notification = cashPushNotification;
                this.notificationType = NotificationType.NEW_CHAT_MESSAGE;
                this.showNotification = z ? false : super.showNotification;
                this.hasBackgroundTasks = true;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof SupportChatMessageNotification)) {
                    return false;
                }
                SupportChatMessageNotification supportChatMessageNotification = (SupportChatMessageNotification) obj;
                return this.suppressed == supportChatMessageNotification.suppressed && this.clientRoute.equals(supportChatMessageNotification.clientRoute) && Intrinsics.areEqual(this.notification, supportChatMessageNotification.notification);
            }

            @Override // com.squareup.cash.notifications.CashNotification.ClientRouteNotification
            public final ClientRoute getClientRoute() {
                return this.clientRoute;
            }

            @Override // com.squareup.cash.notifications.CashNotification
            public final boolean getHasBackgroundTasks() {
                return this.hasBackgroundTasks;
            }

            @Override // com.squareup.cash.notifications.CashNotification
            public final NotificationType getNotificationType() {
                return this.notificationType;
            }

            @Override // com.squareup.cash.notifications.CashNotification.ClientRouteNotification, com.squareup.cash.notifications.CashNotification
            public final int getPriority() {
                return 0;
            }

            @Override // com.squareup.cash.notifications.CashNotification
            public final boolean getShowNotification() {
                return this.showNotification;
            }

            public final int hashCode() {
                return this.notification.hashCode() + ((this.clientRoute.hashCode() + (Boolean.hashCode(this.suppressed) * 31)) * 31);
            }

            public final String toString() {
                return "SupportChatMessageNotification(suppressed=" + this.suppressed + ", clientRoute=" + this.clientRoute + ", notification=" + this.notification + ")";
            }
        }

        public final class SupportPhoneVerificationNotification extends ClientRouteNotification {
            public final ClientRoute.ViewSupportPhoneVerification clientRoute;
            public final CashPushNotification notification;
            public final NotificationType notificationType;
            public final String verificationId;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SupportPhoneVerificationNotification(ClientRoute.ViewSupportPhoneVerification viewSupportPhoneVerification, CashPushNotification cashPushNotification, String str) {
                super(cashPushNotification);
                cashPushNotification.getClass();
                str.getClass();
                this.clientRoute = viewSupportPhoneVerification;
                this.notification = cashPushNotification;
                this.verificationId = str;
                this.notificationType = NotificationType.CLIENT_ROUTE;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof SupportPhoneVerificationNotification)) {
                    return false;
                }
                SupportPhoneVerificationNotification supportPhoneVerificationNotification = (SupportPhoneVerificationNotification) obj;
                return this.clientRoute.equals(supportPhoneVerificationNotification.clientRoute) && Intrinsics.areEqual(this.notification, supportPhoneVerificationNotification.notification) && Intrinsics.areEqual(this.verificationId, supportPhoneVerificationNotification.verificationId);
            }

            @Override // com.squareup.cash.notifications.CashNotification.ClientRouteNotification
            public final ClientRoute getClientRoute() {
                return this.clientRoute;
            }

            @Override // com.squareup.cash.notifications.CashNotification
            public final NotificationType getNotificationType() {
                return this.notificationType;
            }

            @Override // com.squareup.cash.notifications.CashNotification.ClientRouteNotification, com.squareup.cash.notifications.CashNotification
            public final int getPriority() {
                return 0;
            }

            public final int hashCode() {
                return this.verificationId.hashCode() + ((this.notification.hashCode() + (this.clientRoute.hashCode() * 31)) * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("SupportPhoneVerificationNotification(clientRoute=");
                sb.append(this.clientRoute);
                sb.append(", notification=");
                sb.append(this.notification);
                sb.append(", verificationId=");
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.verificationId, ")");
            }
        }

        public final class SupportSurveyNotification extends ClientRouteNotification {
            public final ClientRoute.ViewSupportSurvey clientRoute;
            public final CashPushNotification notification;
            public final NotificationType notificationType;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SupportSurveyNotification(ClientRoute.ViewSupportSurvey viewSupportSurvey, CashPushNotification cashPushNotification) {
                super(cashPushNotification);
                cashPushNotification.getClass();
                this.clientRoute = viewSupportSurvey;
                this.notification = cashPushNotification;
                this.notificationType = NotificationType.CLIENT_ROUTE;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof SupportSurveyNotification)) {
                    return false;
                }
                SupportSurveyNotification supportSurveyNotification = (SupportSurveyNotification) obj;
                return this.clientRoute.equals(supportSurveyNotification.clientRoute) && Intrinsics.areEqual(this.notification, supportSurveyNotification.notification);
            }

            @Override // com.squareup.cash.notifications.CashNotification.ClientRouteNotification
            public final ClientRoute getClientRoute() {
                return this.clientRoute;
            }

            @Override // com.squareup.cash.notifications.CashNotification
            public final NotificationType getNotificationType() {
                return this.notificationType;
            }

            @Override // com.squareup.cash.notifications.CashNotification.ClientRouteNotification, com.squareup.cash.notifications.CashNotification
            public final int getPriority() {
                return 0;
            }

            public final int hashCode() {
                return this.notification.hashCode() + (this.clientRoute.hashCode() * 31);
            }

            public final String toString() {
                return "SupportSurveyNotification(clientRoute=" + this.clientRoute + ", notification=" + this.notification + ")";
            }
        }

        public ClientRouteNotification(CashPushNotification cashPushNotification) {
            super(cashPushNotification);
            NotificationType notificationType = NotificationType.HOME;
            this.priority = -1;
        }

        public abstract ClientRoute getClientRoute();

        @Override // com.squareup.cash.notifications.CashNotification
        public int getPriority() {
            return this.priority;
        }
    }

    public final class GetProfileNotification extends CashNotification {
        public final boolean hasBackgroundTasks;
        public final CashPushNotification notification;
        public final NotificationType notificationType;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GetProfileNotification(CashPushNotification cashPushNotification) {
            super(cashPushNotification);
            cashPushNotification.getClass();
            this.notification = cashPushNotification;
            this.notificationType = NotificationType.GET_PROFILE;
            this.hasBackgroundTasks = true;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof GetProfileNotification) && Intrinsics.areEqual(this.notification, ((GetProfileNotification) obj).notification);
        }

        @Override // com.squareup.cash.notifications.CashNotification
        public final boolean getHasBackgroundTasks() {
            return this.hasBackgroundTasks;
        }

        @Override // com.squareup.cash.notifications.CashNotification
        public final NotificationType getNotificationType() {
            return this.notificationType;
        }

        @Override // com.squareup.cash.notifications.CashNotification
        public final int getPriority() {
            return 0;
        }

        public final int hashCode() {
            return this.notification.hashCode();
        }

        public final String toString() {
            return "GetProfileNotification(notification=" + this.notification + ")";
        }
    }

    public final class GetRewardsNotification extends CashNotification {
        public final boolean hasBackgroundTasks;
        public final CashPushNotification notification;
        public final NotificationType notificationType;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GetRewardsNotification(CashPushNotification cashPushNotification) {
            super(cashPushNotification);
            cashPushNotification.getClass();
            this.notification = cashPushNotification;
            this.notificationType = NotificationType.GET_REWARDS;
            this.hasBackgroundTasks = true;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof GetRewardsNotification) && Intrinsics.areEqual(this.notification, ((GetRewardsNotification) obj).notification);
        }

        @Override // com.squareup.cash.notifications.CashNotification
        public final boolean getHasBackgroundTasks() {
            return this.hasBackgroundTasks;
        }

        @Override // com.squareup.cash.notifications.CashNotification
        public final NotificationType getNotificationType() {
            return this.notificationType;
        }

        @Override // com.squareup.cash.notifications.CashNotification
        public final int getPriority() {
            return 0;
        }

        public final int hashCode() {
            return this.notification.hashCode();
        }

        public final String toString() {
            return "GetRewardsNotification(notification=" + this.notification + ")";
        }
    }

    public final class HomeNotification extends CashNotification {
        public final CashPushNotification notification;
        public final NotificationType notificationType;
        public final int priority;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public HomeNotification(CashPushNotification cashPushNotification) {
            super(cashPushNotification);
            cashPushNotification.getClass();
            this.notification = cashPushNotification;
            this.notificationType = NotificationType.HOME;
            this.priority = -1;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof HomeNotification) && Intrinsics.areEqual(this.notification, ((HomeNotification) obj).notification);
        }

        @Override // com.squareup.cash.notifications.CashNotification
        public final NotificationType getNotificationType() {
            return this.notificationType;
        }

        @Override // com.squareup.cash.notifications.CashNotification
        public final int getPriority() {
            return this.priority;
        }

        public final int hashCode() {
            return this.notification.hashCode();
        }

        public final String toString() {
            return "HomeNotification(notification=" + this.notification + ")";
        }
    }

    public final class OpenExternalUrlNotification extends CashNotification {
        public final CashPushNotification notification;
        public final NotificationType notificationType;
        public final int priority;
        public final String url;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OpenExternalUrlNotification(CashPushNotification cashPushNotification) {
            super(cashPushNotification);
            cashPushNotification.getClass();
            this.notification = cashPushNotification;
            this.notificationType = NotificationType.URL;
            this.priority = -1;
            String str = super.url;
            str.getClass();
            this.url = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OpenExternalUrlNotification) && Intrinsics.areEqual(this.notification, ((OpenExternalUrlNotification) obj).notification);
        }

        @Override // com.squareup.cash.notifications.CashNotification
        public final NotificationType getNotificationType() {
            return this.notificationType;
        }

        @Override // com.squareup.cash.notifications.CashNotification
        public final int getPriority() {
            return this.priority;
        }

        @Override // com.squareup.cash.notifications.CashNotification
        public final String getUrl() {
            return this.url;
        }

        public final int hashCode() {
            return this.notification.hashCode();
        }

        public final String toString() {
            return "OpenExternalUrlNotification(notification=" + this.notification + ")";
        }
    }

    public final class OtherNotification extends CashNotification {
        public final CashPushNotification notification;
        public final NotificationType notificationType;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OtherNotification(CashPushNotification cashPushNotification) {
            super(cashPushNotification);
            cashPushNotification.getClass();
            this.notification = cashPushNotification;
            this.notificationType = NotificationType.OTHER;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OtherNotification) && Intrinsics.areEqual(this.notification, ((OtherNotification) obj).notification);
        }

        @Override // com.squareup.cash.notifications.CashNotification
        public final NotificationType getNotificationType() {
            return this.notificationType;
        }

        @Override // com.squareup.cash.notifications.CashNotification
        public final int getPriority() {
            return 0;
        }

        public final int hashCode() {
            return this.notification.hashCode();
        }

        public final String toString() {
            return "OtherNotification(notification=" + this.notification + ")";
        }
    }

    public final class PasscodeChangedNotification extends CashNotification {
        public final boolean hasBackgroundTasks;
        public final Instrument instrument;
        public final CashPushNotification notification;
        public final NotificationType notificationType;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PasscodeChangedNotification(Instrument instrument, CashPushNotification cashPushNotification) {
            super(cashPushNotification);
            cashPushNotification.getClass();
            this.instrument = instrument;
            this.notification = cashPushNotification;
            this.notificationType = NotificationType.PASSCODE_CHANGE;
            this.hasBackgroundTasks = true;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PasscodeChangedNotification)) {
                return false;
            }
            PasscodeChangedNotification passcodeChangedNotification = (PasscodeChangedNotification) obj;
            return Intrinsics.areEqual(this.instrument, passcodeChangedNotification.instrument) && Intrinsics.areEqual(this.notification, passcodeChangedNotification.notification);
        }

        @Override // com.squareup.cash.notifications.CashNotification
        public final boolean getHasBackgroundTasks() {
            return this.hasBackgroundTasks;
        }

        @Override // com.squareup.cash.notifications.CashNotification
        public final NotificationType getNotificationType() {
            return this.notificationType;
        }

        @Override // com.squareup.cash.notifications.CashNotification
        public final int getPriority() {
            return 0;
        }

        public final int hashCode() {
            Instrument instrument = this.instrument;
            return this.notification.hashCode() + ((instrument == null ? 0 : instrument.hashCode()) * 31);
        }

        public final String toString() {
            return "PasscodeChangedNotification(instrument=" + this.instrument + ", notification=" + this.notification + ")";
        }
    }

    public final class PaymentNotification extends CashNotification {
        public final boolean hasBackgroundTasks;
        public final CashPushNotification notification;
        public final NotificationType notificationType;
        public final Money paymentAmount;
        public final String paymentToken;
        public final String verificationInstrumentToken;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PaymentNotification(String str, Money money, String str2, CashPushNotification cashPushNotification) {
            super(cashPushNotification);
            str.getClass();
            cashPushNotification.getClass();
            this.paymentToken = str;
            this.paymentAmount = money;
            this.verificationInstrumentToken = str2;
            this.notification = cashPushNotification;
            this.notificationType = NotificationType.PAYMENT;
            this.hasBackgroundTasks = true;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PaymentNotification)) {
                return false;
            }
            PaymentNotification paymentNotification = (PaymentNotification) obj;
            return Intrinsics.areEqual(this.paymentToken, paymentNotification.paymentToken) && Intrinsics.areEqual(this.paymentAmount, paymentNotification.paymentAmount) && Intrinsics.areEqual(this.verificationInstrumentToken, paymentNotification.verificationInstrumentToken) && Intrinsics.areEqual(this.notification, paymentNotification.notification);
        }

        @Override // com.squareup.cash.notifications.CashNotification
        public final boolean getHasBackgroundTasks() {
            return this.hasBackgroundTasks;
        }

        @Override // com.squareup.cash.notifications.CashNotification
        public final NotificationType getNotificationType() {
            return this.notificationType;
        }

        @Override // com.squareup.cash.notifications.CashNotification
        public final int getPriority() {
            return 0;
        }

        public final int hashCode() {
            int hashCode = this.paymentToken.hashCode() * 31;
            Money money = this.paymentAmount;
            int hashCode2 = (hashCode + (money == null ? 0 : money.hashCode())) * 31;
            String str = this.verificationInstrumentToken;
            return this.notification.hashCode() + ((hashCode2 + (str != null ? str.hashCode() : 0)) * 31);
        }

        public final String toString() {
            return "PaymentNotification(paymentToken=" + this.paymentToken + ", paymentAmount=" + this.paymentAmount + ", verificationInstrumentToken=" + this.verificationInstrumentToken + ", notification=" + this.notification + ")";
        }
    }

    public final class PlayIntegrityDeviceChallengeNotification extends CashNotification {
        public final String challengeToken;
        public final boolean hasBackgroundTasks;
        public final CashPushNotification notification;
        public final NotificationType notificationType;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PlayIntegrityDeviceChallengeNotification(String str, CashPushNotification cashPushNotification) {
            super(cashPushNotification);
            cashPushNotification.getClass();
            this.challengeToken = str;
            this.notification = cashPushNotification;
            this.notificationType = NotificationType.DEVICE_CHALLENGE;
            this.hasBackgroundTasks = true;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PlayIntegrityDeviceChallengeNotification)) {
                return false;
            }
            PlayIntegrityDeviceChallengeNotification playIntegrityDeviceChallengeNotification = (PlayIntegrityDeviceChallengeNotification) obj;
            return Intrinsics.areEqual(this.challengeToken, playIntegrityDeviceChallengeNotification.challengeToken) && Intrinsics.areEqual(this.notification, playIntegrityDeviceChallengeNotification.notification);
        }

        @Override // com.squareup.cash.notifications.CashNotification
        public final boolean getHasBackgroundTasks() {
            return this.hasBackgroundTasks;
        }

        @Override // com.squareup.cash.notifications.CashNotification
        public final NotificationType getNotificationType() {
            return this.notificationType;
        }

        @Override // com.squareup.cash.notifications.CashNotification
        public final int getPriority() {
            return 0;
        }

        public final int hashCode() {
            String str = this.challengeToken;
            return this.notification.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
        }

        public final String toString() {
            return "PlayIntegrityDeviceChallengeNotification(challengeToken=" + this.challengeToken + ", notification=" + this.notification + ")";
        }
    }

    public final class SupportPhoneStatusNotification extends ClientRouteNotification {
        public final ClientRoute.ViewSupportPhone clientRoute;
        public final boolean hasBackgroundTasks;
        public final CashPushNotification notification;
        public final NotificationType notificationType;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SupportPhoneStatusNotification(ClientRoute.ViewSupportPhone viewSupportPhone, CashPushNotification cashPushNotification) {
            super(cashPushNotification);
            cashPushNotification.getClass();
            this.clientRoute = viewSupportPhone;
            this.notification = cashPushNotification;
            this.notificationType = NotificationType.CLIENT_ROUTE;
            this.hasBackgroundTasks = true;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SupportPhoneStatusNotification)) {
                return false;
            }
            SupportPhoneStatusNotification supportPhoneStatusNotification = (SupportPhoneStatusNotification) obj;
            return this.clientRoute.equals(supportPhoneStatusNotification.clientRoute) && Intrinsics.areEqual(this.notification, supportPhoneStatusNotification.notification);
        }

        @Override // com.squareup.cash.notifications.CashNotification.ClientRouteNotification
        public final ClientRoute getClientRoute() {
            return this.clientRoute;
        }

        @Override // com.squareup.cash.notifications.CashNotification
        public final boolean getHasBackgroundTasks() {
            return this.hasBackgroundTasks;
        }

        @Override // com.squareup.cash.notifications.CashNotification
        public final NotificationType getNotificationType() {
            return this.notificationType;
        }

        @Override // com.squareup.cash.notifications.CashNotification.ClientRouteNotification, com.squareup.cash.notifications.CashNotification
        public final int getPriority() {
            return 0;
        }

        public final int hashCode() {
            return this.notification.hashCode() + (this.clientRoute.hashCode() * 31);
        }

        public final String toString() {
            return "SupportPhoneStatusNotification(clientRoute=" + this.clientRoute + ", notification=" + this.notification + ")";
        }
    }

    public CashNotification(CashPushNotification cashPushNotification) {
        String str = cashPushNotification.title;
        String str2 = cashPushNotification.body;
        this.showNotification = (str == null || str2 == null) ? false : true;
        this.analyticsKey = cashPushNotification.analyticsKey;
        CashPushNotification.APS aps = cashPushNotification.aps;
        this.title = str;
        this.body = str2;
        this.imageUrl = cashPushNotification.imageUrl;
        this.otherCustomer = cashPushNotification.otherCustomer;
        this.category = aps != null ? aps.category : null;
        this.notificationCategory = cashPushNotification.notificationCategory;
        this.engagementReportingId = cashPushNotification.engagementReportingId;
        this.url = cashPushNotification.url;
        this.triggerEntitySync = cashPushNotification.triggerEntitySync;
    }

    public final String getCategory() {
        return this.category;
    }

    public boolean getHasBackgroundTasks() {
        return (this.triggerEntitySync == null && this.imageUrl == null) ? false : true;
    }

    public final String getNotificationCategory() {
        return this.notificationCategory;
    }

    public abstract NotificationType getNotificationType();

    public abstract int getPriority();

    public boolean getShowNotification() {
        return this.showNotification;
    }

    public String getUrl() {
        return this.url;
    }
}
