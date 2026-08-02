package com.squareup.cash.clientrouting.routers.profile;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import app.cash.broadway.navigation.Navigator;
import app.cash.broadway.screen.Screen;
import app.cash.history.screens.HistoryScreens;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.cdf.customerprofile.CustomerProfileViewOpen;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.cash.clientrouting.analytics.AnalyticsParams;
import com.squareup.cash.clientrouting.analytics.RouteAnalyticsParams$ViewCustomerProfileAnalyticsParams;
import com.squareup.cash.clientrouting.data.FeatureContext;
import com.squareup.cash.clientrouting.data.RoutingParams;
import com.squareup.cash.clientrouting.fallback.CashtagBrandNavigator$Companion;
import com.squareup.cash.clientrouting.fallback.RealCashtagBrandNavigator$Factory$Impl;
import com.squareup.cash.db.contacts.Recipient;
import com.squareup.cash.globalsearch.screens.GlobalSearchScreen;
import com.squareup.cash.graphics.backend.gl.core.EglCore;
import com.squareup.cash.integration.analytics.RealUuidGenerator;
import com.squareup.cash.payments.screens.PaymentScreens$HomeScreens$Home;
import com.squareup.cash.profile.screens.ProfileLauncher;
import com.squareup.cash.profile.screens.ProfileScreens;
import com.squareup.cash.recipients.backend.real.RealRecipientFinder;
import com.squareup.protos.cash.cashface.api.GetProfileDetailsContext;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.JobKt;
import okio.ByteString;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class CustomerProfileRouter {
    public final EglCore cashtagBrandNavigator;
    public final CoroutineContext ioDispatcher;
    public final Navigator navigator;
    public final RealRecipientFinder recipientFinder;

    public CustomerProfileRouter(RealCashtagBrandNavigator$Factory$Impl realCashtagBrandNavigator$Factory$Impl, RealUuidGenerator realUuidGenerator, RealRecipientFinder realRecipientFinder, Navigator navigator, CoroutineContext coroutineContext) {
        navigator.getClass();
        this.recipientFinder = realRecipientFinder;
        this.navigator = navigator;
        this.ioDispatcher = coroutineContext;
        this.cashtagBrandNavigator = realCashtagBrandNavigator$Factory$Impl.create(navigator);
    }

    public static void route$default(CustomerProfileRouter customerProfileRouter, RoutingParams routingParams, ProfileScreens.ProfileScreen.Customer customer, ProfileScreens.ProfileScreen.Action.ActionType actionType, int i) {
        RouteAnalyticsParams$ViewCustomerProfileAnalyticsParams routeAnalyticsParams$ViewCustomerProfileAnalyticsParams;
        GetProfileDetailsContext getProfileDetailsContext;
        UUID generate;
        ProfileScreens.ProfileScreen.Action.ActionType actionType2 = (i & 4) != 0 ? ProfileScreens.ProfileScreen.Action.ActionType.PAY_OR_REQUEST : actionType;
        AnalyticsParams analyticsParams = routingParams.analyticsParams;
        RoutingParams.DeepLinkMetadata deepLinkMetadata = routingParams.deepLinkMetadata;
        String str = analyticsParams instanceof AnalyticsParams.InAppNotificationParams ? ((AnalyticsParams.InAppNotificationParams) analyticsParams).messageToken : null;
        if (analyticsParams instanceof AnalyticsParams.GlobalSearchAnalyticsParams) {
            AnalyticsParams.GlobalSearchAnalyticsParams globalSearchAnalyticsParams = (AnalyticsParams.GlobalSearchAnalyticsParams) analyticsParams;
            routeAnalyticsParams$ViewCustomerProfileAnalyticsParams = new RouteAnalyticsParams$ViewCustomerProfileAnalyticsParams(globalSearchAnalyticsParams.externalId, globalSearchAnalyticsParams.currentFlow, globalSearchAnalyticsParams.searchToken, globalSearchAnalyticsParams.queryToken);
        } else {
            routeAnalyticsParams$ViewCustomerProfileAnalyticsParams = null;
        }
        Screen screen = routingParams.origin;
        boolean z = screen instanceof GlobalSearchScreen;
        Screen screen2 = (z || screen == null) ? PaymentScreens$HomeScreens$Home.INSTANCE : screen;
        ProfileScreens.ProfileScreen.BackNavigationAction backNavigationAction = (z || (screen instanceof HistoryScreens.PaymentReceipt)) ? ProfileScreens.ProfileScreen.BackNavigationAction.BACK : ProfileScreens.ProfileScreen.BackNavigationAction.CLOSE;
        CustomerProfileViewOpen.EntryPoint entryPoint = deepLinkMetadata != null ? Intrinsics.areEqual(deepLinkMetadata.deepLinkSource, "IN_APP_SCANNER") ? CustomerProfileViewOpen.EntryPoint.SCAN_QR : CustomerProfileViewOpen.EntryPoint.SHARE_DEEP_LINK : CustomerProfileViewOpen.EntryPoint.VIEW_PROFILE_OVERFLOW_BUTTON;
        FeatureContext featureContext = routingParams.featureContext;
        FeatureContext.MoneybotChatContext moneybotChatContext = featureContext instanceof FeatureContext.MoneybotChatContext ? (FeatureContext.MoneybotChatContext) featureContext : null;
        BlockersData.MoneybotContext moneybotContext = moneybotChatContext != null ? new BlockersData.MoneybotContext(moneybotChatContext.sessionId, moneybotChatContext.toolRequestId) : null;
        Navigator navigator = customerProfileRouter.navigator;
        LinkedHashMap linkedHashMap = ProfileLauncher.launchedScreens;
        if (routeAnalyticsParams$ViewCustomerProfileAnalyticsParams == null || (getProfileDetailsContext = routeAnalyticsParams$ViewCustomerProfileAnalyticsParams.currentFlow) == null) {
            getProfileDetailsContext = GetProfileDetailsContext.ACTIVITY_PAYMENT_REQUEST_RECEIVER;
        }
        GetProfileDetailsContext getProfileDetailsContext2 = getProfileDetailsContext;
        if (routeAnalyticsParams$ViewCustomerProfileAnalyticsParams == null || (generate = routeAnalyticsParams$ViewCustomerProfileAnalyticsParams.externalId) == null) {
            generate = RealUuidGenerator.generate();
        }
        navigator.goTo(ProfileLauncher.profileFor(customer, actionType2, backNavigationAction, generate, getProfileDetailsContext2, entryPoint, screen2, z, new ProfileScreens.ProfileScreen.ProfileAnalytics(null, null, null, null, null, null, null, null, null, null, null, str, null, routeAnalyticsParams$ViewCustomerProfileAnalyticsParams != null ? routeAnalyticsParams$ViewCustomerProfileAnalyticsParams.searchToken : null, routeAnalyticsParams$ViewCustomerProfileAnalyticsParams != null ? routeAnalyticsParams$ViewCustomerProfileAnalyticsParams.externalId : null, routeAnalyticsParams$ViewCustomerProfileAnalyticsParams != null ? routeAnalyticsParams$ViewCustomerProfileAnalyticsParams.queryToken : null, null, null, null, null, null), deepLinkMetadata != null ? deepLinkMetadata.originalUrl : null, true, moneybotContext));
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object route(ClientRoute.ViewCustomerProfileWithButtonsConfig viewCustomerProfileWithButtonsConfig, RoutingParams routingParams, ContinuationImpl continuationImpl) {
        CustomerProfileRouter$route$1 customerProfileRouter$route$1;
        Object obj;
        Object obj2;
        int i;
        RoutingParams routingParams2;
        String str;
        String str2;
        RoutingParams routingParams3;
        ClientRoute.ViewCustomerProfileWithButtonsConfig viewCustomerProfileWithButtonsConfig2;
        Recipient recipient;
        String str3;
        List split$default;
        ClientRoute.ViewCustomerProfileWithButtonsConfig viewCustomerProfileWithButtonsConfig3 = viewCustomerProfileWithButtonsConfig;
        if (continuationImpl instanceof CustomerProfileRouter$route$1) {
            customerProfileRouter$route$1 = (CustomerProfileRouter$route$1) continuationImpl;
            int i2 = customerProfileRouter$route$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                customerProfileRouter$route$1.label = i2 - PKIFailureInfo.systemUnavail;
                CustomerProfileRouter$route$1 customerProfileRouter$route$12 = customerProfileRouter$route$1;
                obj = customerProfileRouter$route$12.result;
                obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = customerProfileRouter$route$12.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    String str4 = viewCustomerProfileWithButtonsConfig3.currency;
                    String str5 = viewCustomerProfileWithButtonsConfig3.name;
                    CustomerProfileRouter$route$recipient$1 customerProfileRouter$route$recipient$1 = new CustomerProfileRouter$route$recipient$1(this, str4, str5, null, 0);
                    customerProfileRouter$route$12.L$0 = viewCustomerProfileWithButtonsConfig3;
                    routingParams2 = routingParams;
                    customerProfileRouter$route$12.L$1 = routingParams2;
                    customerProfileRouter$route$12.L$2 = str4;
                    customerProfileRouter$route$12.L$3 = str5;
                    customerProfileRouter$route$12.label = 1;
                    obj = JobKt.withContext(this.ioDispatcher, customerProfileRouter$route$recipient$1, customerProfileRouter$route$12);
                    if (obj != obj2) {
                        str = str4;
                        str2 = str5;
                    }
                    return obj2;
                }
                if (i != 1) {
                    if (i != 2) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    recipient = customerProfileRouter$route$12.L$4;
                    routingParams3 = customerProfileRouter$route$12.L$1;
                    viewCustomerProfileWithButtonsConfig2 = customerProfileRouter$route$12.L$0;
                    SafeTrace.throwOnFailure(obj);
                    if (!((Boolean) obj).booleanValue()) {
                        return Unit.INSTANCE;
                    }
                    if (recipient == null || (str3 = recipient.customerId) == null) {
                        return Unit.INSTANCE;
                    }
                    ProfileScreens.ProfileScreen.Customer.CashCustomer cashCustomer = new ProfileScreens.ProfileScreen.Customer.CashCustomer(str3);
                    split$default = StringsKt__StringsKt.split$default(viewCustomerProfileWithButtonsConfig2.buttons, new String[]{","}, false, 0, 6, null);
                    List list = split$default;
                    ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        String lowerCase = StringsKt.trim((String) it.next()).toString().toLowerCase(Locale.ROOT);
                        lowerCase.getClass();
                        arrayList.add(lowerCase);
                    }
                    route$default(this, routingParams3, cashCustomer, arrayList.contains("none") ? ProfileScreens.ProfileScreen.Action.ActionType.NONE : (arrayList.contains("pay") && arrayList.contains("request")) ? ProfileScreens.ProfileScreen.Action.ActionType.PAY_OR_REQUEST : arrayList.contains("request") ? ProfileScreens.ProfileScreen.Action.ActionType.REQUEST : arrayList.contains("pay") ? ProfileScreens.ProfileScreen.Action.ActionType.PAY : ProfileScreens.ProfileScreen.Action.ActionType.PAY_OR_REQUEST, 8);
                    return Unit.INSTANCE;
                }
                str2 = customerProfileRouter$route$12.L$3;
                str = customerProfileRouter$route$12.L$2;
                routingParams2 = customerProfileRouter$route$12.L$1;
                viewCustomerProfileWithButtonsConfig3 = customerProfileRouter$route$12.L$0;
                SafeTrace.throwOnFailure(obj);
                Recipient recipient2 = (Recipient) obj;
                String m$1 = Recorder$$ExternalSyntheticOutline2.m$1(str, str2);
                String extractAttributionKey = CashtagBrandNavigator$Companion.extractAttributionKey(routingParams2);
                RoutingParams.DeepLinkMetadata deepLinkMetadata = routingParams2.deepLinkMetadata;
                String str6 = deepLinkMetadata == null ? deepLinkMetadata.originalUrl : null;
                String extractCouponCode = CashtagBrandNavigator$Companion.extractCouponCode(routingParams2);
                customerProfileRouter$route$12.L$0 = viewCustomerProfileWithButtonsConfig3;
                customerProfileRouter$route$12.L$1 = routingParams2;
                customerProfileRouter$route$12.L$2 = null;
                customerProfileRouter$route$12.L$3 = null;
                customerProfileRouter$route$12.L$4 = recipient2;
                customerProfileRouter$route$12.label = 2;
                obj = this.cashtagBrandNavigator.navigateToBrandProfile(m$1, recipient2, extractAttributionKey, str6, extractCouponCode);
                if (obj != obj2) {
                    routingParams3 = routingParams2;
                    viewCustomerProfileWithButtonsConfig2 = viewCustomerProfileWithButtonsConfig3;
                    recipient = recipient2;
                    if (!((Boolean) obj).booleanValue()) {
                    }
                }
                return obj2;
            }
        }
        customerProfileRouter$route$1 = new CustomerProfileRouter$route$1(this, continuationImpl);
        CustomerProfileRouter$route$1 customerProfileRouter$route$122 = customerProfileRouter$route$1;
        obj = customerProfileRouter$route$122.result;
        obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = customerProfileRouter$route$122.label;
        if (i != 0) {
        }
        Recipient recipient22 = (Recipient) obj;
        String m$12 = Recorder$$ExternalSyntheticOutline2.m$1(str, str2);
        String extractAttributionKey2 = CashtagBrandNavigator$Companion.extractAttributionKey(routingParams2);
        RoutingParams.DeepLinkMetadata deepLinkMetadata2 = routingParams2.deepLinkMetadata;
        if (deepLinkMetadata2 == null) {
        }
        String extractCouponCode2 = CashtagBrandNavigator$Companion.extractCouponCode(routingParams2);
        customerProfileRouter$route$122.L$0 = viewCustomerProfileWithButtonsConfig3;
        customerProfileRouter$route$122.L$1 = routingParams2;
        customerProfileRouter$route$122.L$2 = null;
        customerProfileRouter$route$122.L$3 = null;
        customerProfileRouter$route$122.L$4 = recipient22;
        customerProfileRouter$route$122.label = 2;
        obj = this.cashtagBrandNavigator.navigateToBrandProfile(m$12, recipient22, extractAttributionKey2, str6, extractCouponCode2);
        if (obj != obj2) {
        }
        return obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object route(ClientRoute.ViewCustomerProfileUsingCashtag viewCustomerProfileUsingCashtag, RoutingParams routingParams, ContinuationImpl continuationImpl) {
        CustomerProfileRouter$route$2 customerProfileRouter$route$2;
        Object obj;
        CoroutineSingletons coroutineSingletons;
        int i;
        String str;
        RoutingParams routingParams2;
        String str2;
        RoutingParams routingParams3;
        Recipient recipient;
        String str3;
        if (continuationImpl instanceof CustomerProfileRouter$route$2) {
            customerProfileRouter$route$2 = (CustomerProfileRouter$route$2) continuationImpl;
            int i2 = customerProfileRouter$route$2.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                customerProfileRouter$route$2.label = i2 - PKIFailureInfo.systemUnavail;
                CustomerProfileRouter$route$2 customerProfileRouter$route$22 = customerProfileRouter$route$2;
                obj = customerProfileRouter$route$22.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = customerProfileRouter$route$22.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    String str4 = viewCustomerProfileUsingCashtag.currency;
                    str = viewCustomerProfileUsingCashtag.name;
                    CustomerProfileRouter$route$recipient$1 customerProfileRouter$route$recipient$1 = new CustomerProfileRouter$route$recipient$1(this, str4, str, null, 1);
                    routingParams2 = routingParams;
                    customerProfileRouter$route$22.L$1 = routingParams2;
                    customerProfileRouter$route$22.L$2 = str4;
                    customerProfileRouter$route$22.L$3 = str;
                    customerProfileRouter$route$22.label = 1;
                    Object withContext = JobKt.withContext(this.ioDispatcher, customerProfileRouter$route$recipient$1, customerProfileRouter$route$22);
                    if (withContext != coroutineSingletons) {
                        str2 = str4;
                        obj = withContext;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    recipient = customerProfileRouter$route$22.L$4;
                    routingParams3 = customerProfileRouter$route$22.L$1;
                    SafeTrace.throwOnFailure(obj);
                    if (!((Boolean) obj).booleanValue()) {
                        return Unit.INSTANCE;
                    }
                    if (recipient != null && (str3 = recipient.customerId) != null) {
                        route$default(this, routingParams3, new ProfileScreens.ProfileScreen.Customer.CashCustomer(str3), null, 12);
                        return Unit.INSTANCE;
                    }
                    return Unit.INSTANCE;
                }
                String str5 = customerProfileRouter$route$22.L$3;
                String str6 = customerProfileRouter$route$22.L$2;
                RoutingParams routingParams4 = customerProfileRouter$route$22.L$1;
                SafeTrace.throwOnFailure(obj);
                str = str5;
                routingParams2 = routingParams4;
                str2 = str6;
                Recipient recipient2 = (Recipient) obj;
                String m$1 = Recorder$$ExternalSyntheticOutline2.m$1(str2, str);
                String extractAttributionKey = CashtagBrandNavigator$Companion.extractAttributionKey(routingParams2);
                RoutingParams.DeepLinkMetadata deepLinkMetadata = routingParams2.deepLinkMetadata;
                String str7 = deepLinkMetadata == null ? deepLinkMetadata.originalUrl : null;
                String extractCouponCode = CashtagBrandNavigator$Companion.extractCouponCode(routingParams2);
                customerProfileRouter$route$22.L$1 = routingParams2;
                customerProfileRouter$route$22.L$2 = null;
                customerProfileRouter$route$22.L$3 = null;
                customerProfileRouter$route$22.L$4 = recipient2;
                customerProfileRouter$route$22.label = 2;
                obj = this.cashtagBrandNavigator.navigateToBrandProfile(m$1, recipient2, extractAttributionKey, str7, extractCouponCode);
                if (obj != coroutineSingletons) {
                    routingParams3 = routingParams2;
                    recipient = recipient2;
                    if (!((Boolean) obj).booleanValue()) {
                    }
                }
                return coroutineSingletons;
            }
        }
        customerProfileRouter$route$2 = new CustomerProfileRouter$route$2(this, continuationImpl);
        CustomerProfileRouter$route$2 customerProfileRouter$route$222 = customerProfileRouter$route$2;
        obj = customerProfileRouter$route$222.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = customerProfileRouter$route$222.label;
        if (i != 0) {
        }
        Recipient recipient22 = (Recipient) obj;
        String m$12 = Recorder$$ExternalSyntheticOutline2.m$1(str2, str);
        String extractAttributionKey2 = CashtagBrandNavigator$Companion.extractAttributionKey(routingParams2);
        RoutingParams.DeepLinkMetadata deepLinkMetadata2 = routingParams2.deepLinkMetadata;
        if (deepLinkMetadata2 == null) {
        }
        String extractCouponCode2 = CashtagBrandNavigator$Companion.extractCouponCode(routingParams2);
        customerProfileRouter$route$222.L$1 = routingParams2;
        customerProfileRouter$route$222.L$2 = null;
        customerProfileRouter$route$222.L$3 = null;
        customerProfileRouter$route$222.L$4 = recipient22;
        customerProfileRouter$route$222.label = 2;
        obj = this.cashtagBrandNavigator.navigateToBrandProfile(m$12, recipient22, extractAttributionKey2, str7, extractCouponCode2);
        if (obj != coroutineSingletons) {
        }
        return coroutineSingletons;
    }

    public final void route(ClientRoute.ViewCustomerProfile viewCustomerProfile, RoutingParams routingParams) {
        viewCustomerProfile.getClass();
        routingParams.getClass();
        route$default(this, routingParams, new ProfileScreens.ProfileScreen.Customer.CashCustomer(viewCustomerProfile.customerToken), null, 12);
    }

    public final void route(ClientRoute.ViewCustomerProfileEmail viewCustomerProfileEmail, RoutingParams routingParams) {
        viewCustomerProfileEmail.getClass();
        routingParams.getClass();
        ByteString.Companion companion = ByteString.Companion;
        ByteString decodeBase64 = ByteString.Companion.decodeBase64(viewCustomerProfileEmail.base64EncodedEmail);
        decodeBase64.getClass();
        route$default(this, routingParams, new ProfileScreens.ProfileScreen.Customer.NonCashCustomer.WithEmail(decodeBase64.utf8(), (String) null), null, 12);
    }

    public final void route(ClientRoute.ViewCustomerProfileSms viewCustomerProfileSms, RoutingParams routingParams) {
        viewCustomerProfileSms.getClass();
        routingParams.getClass();
        ByteString.Companion companion = ByteString.Companion;
        ByteString decodeBase64 = ByteString.Companion.decodeBase64(viewCustomerProfileSms.base64EncodedSms);
        decodeBase64.getClass();
        route$default(this, routingParams, new ProfileScreens.ProfileScreen.Customer.NonCashCustomer.WithPhoneNumber(decodeBase64.utf8(), (String) null), null, 12);
    }

    public final void route(ClientRoute.DeprecatedViewCustomerProfileEmail deprecatedViewCustomerProfileEmail, RoutingParams routingParams) {
        deprecatedViewCustomerProfileEmail.getClass();
        routingParams.getClass();
        route$default(this, routingParams, new ProfileScreens.ProfileScreen.Customer.NonCashCustomer.WithEmail(deprecatedViewCustomerProfileEmail.email, (String) null), null, 12);
    }

    public final void route(ClientRoute.DeprecatedViewCustomerProfileSms deprecatedViewCustomerProfileSms, RoutingParams routingParams) {
        deprecatedViewCustomerProfileSms.getClass();
        routingParams.getClass();
        route$default(this, routingParams, new ProfileScreens.ProfileScreen.Customer.NonCashCustomer.WithPhoneNumber(deprecatedViewCustomerProfileSms.sms, (String) null), null, 12);
    }
}
