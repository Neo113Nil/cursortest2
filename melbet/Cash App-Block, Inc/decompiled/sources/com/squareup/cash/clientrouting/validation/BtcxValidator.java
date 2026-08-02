package com.squareup.cash.clientrouting.validation;

import com.squareup.cash.bitcoin.capability.RealBitcoinCapabilityProvider;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.cash.clientrouting.BTCxClientRouterLogger;
import com.squareup.cash.clientrouting.data.RoutingParams;
import com.squareup.cash.clientrouting.validation.ValidatorResult;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.reflect.KClass;

/* loaded from: classes.dex */
public final class BtcxValidator implements Validator {
    public static final List BTC_X_ALLOWED_CLIENT_ROUTES;
    public final List allowedRouteTypes;

    static {
        ReflectionFactory reflectionFactory = Reflection.factory;
        BTC_X_ALLOWED_CLIENT_ROUTES = CollectionsKt__CollectionsKt.listOf((Object[]) new KClass[]{reflectionFactory.getOrCreateKotlinClass(ClientRoute.ClientScenario.class), reflectionFactory.getOrCreateKotlinClass(ClientRoute.CollectGpsLocationData.class), reflectionFactory.getOrCreateKotlinClass(ClientRoute.Flow.class), reflectionFactory.getOrCreateKotlinClass(ClientRoute.FlowType.class), reflectionFactory.getOrCreateKotlinClass(ClientRoute.NoOperation.class), reflectionFactory.getOrCreateKotlinClass(ClientRoute.NoOperationWithPathParameter.class), reflectionFactory.getOrCreateKotlinClass(ClientRoute.NoOperationWithQueryParameter.class), reflectionFactory.getOrCreateKotlinClass(ClientRoute.RefreshAllAppMessagesInBackground.class), reflectionFactory.getOrCreateKotlinClass(ClientRoute.RemoveAppMessageInBackground.class), reflectionFactory.getOrCreateKotlinClass(ClientRoute.RefreshBitcoinInvoice.class), reflectionFactory.getOrCreateKotlinClass(ClientRoute.RequestReviewPrompt.class), reflectionFactory.getOrCreateKotlinClass(ClientRoute.VerifyEmail.class), reflectionFactory.getOrCreateKotlinClass(ClientRoute.VerifyMagicLink.class), reflectionFactory.getOrCreateKotlinClass(ClientRoute.ViewActivity.class), reflectionFactory.getOrCreateKotlinClass(ClientRoute.ViewThreadedCustomerActivity.class), reflectionFactory.getOrCreateKotlinClass(ClientRoute.ViewBitcoin.class), reflectionFactory.getOrCreateKotlinClass(ClientRoute.ViewBitcoinInvoice.class), reflectionFactory.getOrCreateKotlinClass(ClientRoute.ViewChatForRecipient.class), reflectionFactory.getOrCreateKotlinClass(ClientRoute.ViewCustomerProfile.class), reflectionFactory.getOrCreateKotlinClass(ClientRoute.DeprecatedViewCustomerProfileSms.class), reflectionFactory.getOrCreateKotlinClass(ClientRoute.DeprecatedViewCustomerProfileEmail.class), reflectionFactory.getOrCreateKotlinClass(ClientRoute.ViewCustomerProfileCashtag.class), reflectionFactory.getOrCreateKotlinClass(ClientRoute.ViewCustomerProfileEmail.class), reflectionFactory.getOrCreateKotlinClass(ClientRoute.ViewCustomerProfileSms.class), reflectionFactory.getOrCreateKotlinClass(ClientRoute.ViewNotificationPreferences.class), reflectionFactory.getOrCreateKotlinClass(ClientRoute.ViewPaymentDetails.class), reflectionFactory.getOrCreateKotlinClass(ClientRoute.ViewPaymentPad.class), reflectionFactory.getOrCreateKotlinClass(ClientRoute.ViewSecurityAndPrivacy.class), reflectionFactory.getOrCreateKotlinClass(ClientRoute.ViewPin.class), reflectionFactory.getOrCreateKotlinClass(ClientRoute.ViewProfile.class), reflectionFactory.getOrCreateKotlinClass(ClientRoute.ViewProfileDirectory.class), reflectionFactory.getOrCreateKotlinClass(ClientRoute.ViewProfilePersonal.class), reflectionFactory.getOrCreateKotlinClass(ClientRoute.ViewQrCodeScanner.class), reflectionFactory.getOrCreateKotlinClass(ClientRoute.ViewSendBitcoin.class), reflectionFactory.getOrCreateKotlinClass(ClientRoute.ViewStablecoin.class), reflectionFactory.getOrCreateKotlinClass(ClientRoute.ViewSupport.class), reflectionFactory.getOrCreateKotlinClass(ClientRoute.ViewSupportChat.class), reflectionFactory.getOrCreateKotlinClass(ClientRoute.ViewSupportChatNewUnreadMessage.class), reflectionFactory.getOrCreateKotlinClass(ClientRoute.ViewSupportPhone.class), reflectionFactory.getOrCreateKotlinClass(ClientRoute.ViewSupportHome.class), reflectionFactory.getOrCreateKotlinClass(ClientRoute.ViewSupportNode.class), reflectionFactory.getOrCreateKotlinClass(ClientRoute.ViewSupportSurvey.class), reflectionFactory.getOrCreateKotlinClass(ClientRoute.ViewFavorites.class), reflectionFactory.getOrCreateKotlinClass(ClientRoute.GetAppMessageByToken.class), reflectionFactory.getOrCreateKotlinClass(ClientRoute.InitiateBitcoinTransferDeprecated.class)});
    }

    public BtcxValidator(RealBitcoinCapabilityProvider realBitcoinCapabilityProvider, BTCxClientRouterLogger bTCxClientRouterLogger, List list) {
        this.allowedRouteTypes = list;
    }

    @Override // com.squareup.cash.clientrouting.validation.Validator
    public final ValidatorResult validate(ClientRoute clientRoute, RoutingParams routingParams) {
        clientRoute.getClass();
        routingParams.getClass();
        List list = this.allowedRouteTypes;
        if (list.isEmpty()) {
            list = BTC_X_ALLOWED_CLIENT_ROUTES;
        }
        list.contains(Reflection.factory.getOrCreateKotlinClass(clientRoute.getClass()));
        return ValidatorResult.Allowed.INSTANCE;
    }
}
