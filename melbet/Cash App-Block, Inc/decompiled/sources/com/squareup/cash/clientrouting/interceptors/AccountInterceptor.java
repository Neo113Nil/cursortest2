package com.squareup.cash.clientrouting.interceptors;

import app.cash.broadway.navigation.Navigator;
import app.cash.molecule.PlatformKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.account.backend.AccountholderAccountRepository$GetAccountResult;
import com.squareup.cash.account.backend.RealAccountholderAccountRepository;
import com.squareup.cash.account.screens.AccountSwitcherScreen;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.cdf.account.AccountAwareRoutingFetchedAccounts;
import com.squareup.cash.cdf.account.AccountSwitchAccountViewSwitcher;
import com.squareup.cash.cdf.account.FetchedAccounts;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.cash.clientroutes.Matcher$Companion$viewCashOutClientRoute$1$result$1$1;
import com.squareup.cash.clientroutes.RealClientRouteFormatter;
import com.squareup.cash.clientrouting.UtilsKt;
import com.squareup.cash.clientrouting.data.RoutingParams;
import com.squareup.cash.clientrouting.data.TargetDestination;
import com.squareup.cash.clientrouting.routers.account.MultipleAccountsRouter;
import com.squareup.cash.clientrouting.routers.account.MultipleAccountsRouter$Factory$Impl;
import com.squareup.cash.clientrouting.routers.account.RoutableAccount;
import com.squareup.cash.clientrouting.routers.account.RoutableAccountsProvider;
import com.squareup.cash.db.WireAdapter;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.cash.observability.types.ReportedError;
import com.squareup.cash.session.backend.SessionManager;
import com.squareup.protos.cash.janus.syncvalues.FullAccount;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.EnumSet;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.collections.SetsKt___SetsKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes.dex */
public final class AccountInterceptor implements Interceptor {
    public final WireAdapter accountAwareFeature;
    public final RealAccountholderAccountRepository accountholderAccountRepository;
    public final Analytics analytics;
    public final MultipleAccountsRouter multipleAccountsRouter;
    public final RoutableAccountsProvider routableAccountsSource;
    public final RealClientRouteFormatter routeFormatter;

    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"com/squareup/cash/clientrouting/interceptors/AccountInterceptor$AccountAwareRoutingError", "Lcom/squareup/cash/observability/types/ReportedError;", "UnknownAccountIdentifier", "AccountAwareFetchingFailed", "Lcom/squareup/cash/clientrouting/interceptors/AccountInterceptor$AccountAwareRoutingError$AccountAwareFetchingFailed;", "Lcom/squareup/cash/clientrouting/interceptors/AccountInterceptor$AccountAwareRoutingError$UnknownAccountIdentifier;", "real"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public abstract class AccountAwareRoutingError extends ReportedError {

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/squareup/cash/clientrouting/interceptors/AccountInterceptor$AccountAwareRoutingError$AccountAwareFetchingFailed;", "Lcom/squareup/cash/clientrouting/interceptors/AccountInterceptor$AccountAwareRoutingError;", "real"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class AccountAwareFetchingFailed extends AccountAwareRoutingError {
            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof AccountAwareFetchingFailed);
            }

            @Override // com.squareup.cash.clientrouting.interceptors.AccountInterceptor.AccountAwareRoutingError
            public final String getAccountIdentifier() {
                return null;
            }

            @Override // java.lang.Throwable
            public final Throwable getCause() {
                return null;
            }

            @Override // com.squareup.cash.clientrouting.interceptors.AccountInterceptor.AccountAwareRoutingError
            public final String getClientRoute() {
                return null;
            }

            public final int hashCode() {
                throw null;
            }

            @Override // java.lang.Throwable
            public final String toString() {
                return "AccountAwareFetchingFailed(accountIdentifier=null, clientRoute=null, cause=null)";
            }
        }

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/squareup/cash/clientrouting/interceptors/AccountInterceptor$AccountAwareRoutingError$UnknownAccountIdentifier;", "Lcom/squareup/cash/clientrouting/interceptors/AccountInterceptor$AccountAwareRoutingError;", "real"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class UnknownAccountIdentifier extends AccountAwareRoutingError {
            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof UnknownAccountIdentifier);
            }

            @Override // com.squareup.cash.clientrouting.interceptors.AccountInterceptor.AccountAwareRoutingError
            public final String getAccountIdentifier() {
                return null;
            }

            @Override // com.squareup.cash.clientrouting.interceptors.AccountInterceptor.AccountAwareRoutingError
            public final String getClientRoute() {
                return null;
            }

            public final int hashCode() {
                throw null;
            }

            @Override // java.lang.Throwable
            public final String toString() {
                return "UnknownAccountIdentifier(accountIdentifier=null, clientRoute=null)";
            }
        }

        public String getAccountIdentifier() {
            return null;
        }

        public String getClientRoute() {
            return null;
        }

        @Override // com.squareup.cash.observability.types.FeatureError
        public final Set getFeatures() {
            return null;
        }

        @Override // com.squareup.cash.observability.types.ReportedError
        /* renamed from: getGroupingDescriptor */
        public final String getF1113type() {
            return null;
        }

        @Override // java.lang.Throwable
        public final String getMessage() {
            return null;
        }

        @Override // com.squareup.cash.observability.types.ReportedError
        public final Map getMetadata() {
            return BalanceFeedKt$$ExternalSyntheticOutline0.m("Route", MapsKt__MapsKt.mapOf(new Pair("client_route", getClientRoute()), new Pair("account_identifier", getAccountIdentifier())));
        }
    }

    /* loaded from: classes6.dex */
    public final class RoutingAccount {
        public final String customerToken;
        public final FullAccount fullAccount;

        public RoutingAccount(FullAccount fullAccount, String str) {
            str.getClass();
            this.customerToken = str;
            this.fullAccount = fullAccount;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RoutingAccount)) {
                return false;
            }
            RoutingAccount routingAccount = (RoutingAccount) obj;
            return Intrinsics.areEqual(this.customerToken, routingAccount.customerToken) && Intrinsics.areEqual(this.fullAccount, routingAccount.fullAccount);
        }

        public final String getCustomerToken() {
            return this.customerToken;
        }

        public final FullAccount getFullAccount() {
            return this.fullAccount;
        }

        public final int hashCode() {
            int hashCode = this.customerToken.hashCode() * 31;
            FullAccount fullAccount = this.fullAccount;
            return hashCode + (fullAccount == null ? 0 : fullAccount.hashCode());
        }

        public final String toString() {
            return "RoutingAccount(customerToken=" + this.customerToken + ", fullAccount=" + this.fullAccount + ")";
        }
    }

    public AccountInterceptor(MultipleAccountsRouter$Factory$Impl multipleAccountsRouter$Factory$Impl, WireAdapter wireAdapter, RealClientRouteFormatter realClientRouteFormatter, RealAccountholderAccountRepository realAccountholderAccountRepository, RoutableAccountsProvider routableAccountsProvider, ErrorReporter errorReporter, Analytics analytics, Navigator navigator) {
        navigator.getClass();
        this.accountAwareFeature = wireAdapter;
        this.routeFormatter = realClientRouteFormatter;
        this.accountholderAccountRepository = realAccountholderAccountRepository;
        this.routableAccountsSource = routableAccountsProvider;
        this.analytics = analytics;
        this.multipleAccountsRouter = multipleAccountsRouter$Factory$Impl.create(navigator);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getRoutingAccount(String str, ClientRoute clientRoute, ContinuationImpl continuationImpl) {
        AccountInterceptor$getRoutingAccount$1 accountInterceptor$getRoutingAccount$1;
        int i;
        String customerToken;
        AccountholderAccountRepository$GetAccountResult accountholderAccountRepository$GetAccountResult;
        if (continuationImpl instanceof AccountInterceptor$getRoutingAccount$1) {
            accountInterceptor$getRoutingAccount$1 = (AccountInterceptor$getRoutingAccount$1) continuationImpl;
            int i2 = accountInterceptor$getRoutingAccount$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                accountInterceptor$getRoutingAccount$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = accountInterceptor$getRoutingAccount$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = accountInterceptor$getRoutingAccount$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    RoutableAccount tryLoadAccountUsingIdentifier = this.routableAccountsSource.tryLoadAccountUsingIdentifier(str);
                    if (tryLoadAccountUsingIdentifier != null && (customerToken = tryLoadAccountUsingIdentifier.getCustomerToken()) != null) {
                        trackFetchedAccount(customerToken);
                        FullAccount m3470unboximpl = tryLoadAccountUsingIdentifier instanceof RoutableAccount.Account ? ((RoutableAccount.Account) tryLoadAccountUsingIdentifier).m3470unboximpl() : null;
                        return new RoutingAccount(m3470unboximpl != null ? m3470unboximpl : null, customerToken);
                    }
                    accountInterceptor$getRoutingAccount$1.label = 1;
                    obj = this.accountholderAccountRepository.getAccountBySwitchingIdentifier(str, accountInterceptor$getRoutingAccount$1);
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
                accountholderAccountRepository$GetAccountResult = (AccountholderAccountRepository$GetAccountResult) obj;
                if (accountholderAccountRepository$GetAccountResult instanceof AccountholderAccountRepository$GetAccountResult.Successful) {
                    if (Intrinsics.areEqual(accountholderAccountRepository$GetAccountResult, AccountholderAccountRepository$GetAccountResult.NotFound.INSTANCE)) {
                        this.analytics.track(new AccountAwareRoutingFetchedAccounts(FetchedAccounts.TARGET_ACCOUNT_NOT_FOUND), null);
                        return null;
                    }
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                AccountholderAccountRepository$GetAccountResult.Successful successful = (AccountholderAccountRepository$GetAccountResult.Successful) accountholderAccountRepository$GetAccountResult;
                String str2 = successful.getAccount().account_id;
                if (str2 == null) {
                    return null;
                }
                trackFetchedAccount(str2);
                return new RoutingAccount(successful.getAccount(), str2);
            }
        }
        accountInterceptor$getRoutingAccount$1 = new AccountInterceptor$getRoutingAccount$1(this, continuationImpl);
        Object obj2 = accountInterceptor$getRoutingAccount$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = accountInterceptor$getRoutingAccount$1.label;
        if (i != 0) {
        }
        accountholderAccountRepository$GetAccountResult = (AccountholderAccountRepository$GetAccountResult) obj2;
        if (accountholderAccountRepository$GetAccountResult instanceof AccountholderAccountRepository$GetAccountResult.Successful) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object intercept(ClientRoute clientRoute, RoutingParams routingParams, ContinuationImpl continuationImpl) {
        AccountInterceptor$intercept$1 accountInterceptor$intercept$1;
        int i;
        RoutingAccount routingAccount;
        Set flags;
        RoutingParams.Flag flag;
        if (continuationImpl instanceof AccountInterceptor$intercept$1) {
            accountInterceptor$intercept$1 = (AccountInterceptor$intercept$1) continuationImpl;
            int i2 = accountInterceptor$intercept$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                accountInterceptor$intercept$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = accountInterceptor$intercept$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = accountInterceptor$intercept$1.label;
                boolean z = true;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    String accountIdentifier = clientRoute.getAccountIdentifier();
                    if (accountIdentifier == null) {
                        routingAccount = null;
                        String customerToken = routingAccount != null ? routingAccount.getCustomerToken() : null;
                        flags = routingParams.getFlags();
                        flag = RoutingParams.Flag.ForwardedForAccountSwitch;
                        if (!flags.contains(flag) || Intrinsics.areEqual(customerToken, PlatformKt.activeAccountTokenOrNull((SessionManager) this.accountAwareFeature.adapter))) {
                            return Boolean.FALSE;
                        }
                        TargetDestination.RouteDestination routeDestination = UtilsKt.toRouteDestination(clientRoute, this.routeFormatter, RoutingParams.copy$default(routingParams, null, null, SetsKt___SetsKt.plus(routingParams.getFlags(), flag), 383));
                        int ordinal = clientRoute.getSpec().getAccountRequirement().getValue().ordinal();
                        MultipleAccountsRouter multipleAccountsRouter = this.multipleAccountsRouter;
                        if (ordinal == 0) {
                            if (routingAccount != null) {
                                multipleAccountsRouter.route(new ClientRoute.SwitchAccount(routingAccount.getCustomerToken()), routingAccount.getFullAccount(), routeDestination);
                            }
                            z = false;
                        } else if (ordinal != 1) {
                            if (ordinal != 2) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return null;
                            }
                            if (routingAccount != null) {
                                multipleAccountsRouter.route(new ClientRoute.SwitchAccount(routingAccount.getCustomerToken()), routingAccount.getFullAccount(), routeDestination);
                            }
                            z = false;
                        } else if (routingAccount == null) {
                            new ClientRoute.ViewProfileSwitcher(new Matcher$Companion$viewCashOutClientRoute$1$result$1$1());
                            AccountSwitchAccountViewSwitcher.Entrypoint entrypoint = AccountSwitchAccountViewSwitcher.Entrypoint.CLIENT_ROUTE;
                            EnumSet.noneOf(RoutingParams.Flag.class).getClass();
                            multipleAccountsRouter.getClass();
                            multipleAccountsRouter.navigator.goTo(new AccountSwitcherScreen(entrypoint, null, routeDestination));
                        } else {
                            multipleAccountsRouter.route(new ClientRoute.SwitchAccount(routingAccount.getCustomerToken()), routingAccount.getFullAccount(), routeDestination);
                        }
                        return Boolean.valueOf(z);
                    }
                    accountInterceptor$intercept$1.L$0 = clientRoute;
                    accountInterceptor$intercept$1.L$1 = routingParams;
                    accountInterceptor$intercept$1.label = 1;
                    obj = getRoutingAccount(accountIdentifier, clientRoute, accountInterceptor$intercept$1);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    routingParams = accountInterceptor$intercept$1.L$1;
                    clientRoute = accountInterceptor$intercept$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                }
                routingAccount = (RoutingAccount) obj;
                if (routingAccount != null) {
                }
                flags = routingParams.getFlags();
                flag = RoutingParams.Flag.ForwardedForAccountSwitch;
                if (flags.contains(flag)) {
                }
                return Boolean.FALSE;
            }
        }
        accountInterceptor$intercept$1 = new AccountInterceptor$intercept$1(this, continuationImpl);
        Object obj3 = accountInterceptor$intercept$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = accountInterceptor$intercept$1.label;
        boolean z2 = true;
        if (i != 0) {
        }
        routingAccount = (RoutingAccount) obj3;
        if (routingAccount != null) {
        }
        flags = routingParams.getFlags();
        flag = RoutingParams.Flag.ForwardedForAccountSwitch;
        if (flags.contains(flag)) {
        }
        return Boolean.FALSE;
    }

    public final void trackFetchedAccount(String str) {
        boolean areEqual = Intrinsics.areEqual(str, PlatformKt.activeAccountTokenOrNull((SessionManager) this.accountAwareFeature.adapter));
        Analytics analytics = this.analytics;
        if (areEqual) {
            analytics.track(new AccountAwareRoutingFetchedAccounts(FetchedAccounts.ALREADY_IN_TARGET_ACCOUNT), null);
        } else {
            analytics.track(new AccountAwareRoutingFetchedAccounts(FetchedAccounts.FOUND_TARGET_ACCOUNT), null);
        }
    }
}
