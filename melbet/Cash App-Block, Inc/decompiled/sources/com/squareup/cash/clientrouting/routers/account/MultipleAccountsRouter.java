package com.squareup.cash.clientrouting.routers.account;

import android.content.res.Resources;
import android.icu.text.MessageFormat;
import app.cash.broadway.navigation.Navigator;
import app.cash.broadway.screen.Screen;
import com.squareup.cash.R;
import com.squareup.cash.account.backend.AccountSwitcher$AccountSwitchInitiationSource;
import com.squareup.cash.account.backend.ManagedAccountFlipDirection;
import com.squareup.cash.account.screens.AccountSwitcherScreen;
import com.squareup.cash.account.screens.ManagedAccountAnimationInfo;
import com.squareup.cash.account.screens.SwitchFullAccountLoadingScreen;
import com.squareup.cash.cdf.account.AccountSwitchAccountViewSwitcher;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.cash.clientrouting.data.RoutingParams;
import com.squareup.cash.clientrouting.data.TargetDestination;
import com.squareup.cash.clientrouting.routers.account.RoutableAccount;
import com.squareup.cash.family.profileselection.api.FamilyProfile;
import com.squareup.cash.family.profileselection.real.RealFamilyProfileManager;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.protos.cash.janus.syncvalues.FullAccount;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.MapsKt__MapsJVMKt;

/* loaded from: classes.dex */
public final class MultipleAccountsRouter {
    public final RealFamilyProfileManager familyProfileManager;
    public final Navigator navigator;
    public final RoutableAccountsProvider routableAccountsProvider;
    public final AndroidStringManager stringManager;

    public MultipleAccountsRouter(RoutableAccountsProvider routableAccountsProvider, RealFamilyProfileManager realFamilyProfileManager, AndroidStringManager androidStringManager, Navigator navigator) {
        navigator.getClass();
        this.routableAccountsProvider = routableAccountsProvider;
        this.familyProfileManager = realFamilyProfileManager;
        this.stringManager = androidStringManager;
        this.navigator = navigator;
    }

    public static void route$default(MultipleAccountsRouter multipleAccountsRouter, ClientRoute.SwitchAccountFromFlow switchAccountFromFlow) {
        String targetCustomerToken;
        multipleAccountsRouter.getClass();
        switchAccountFromFlow.getClass();
        RoutableAccount tryLoadAccountUsingIdentifier = multipleAccountsRouter.routableAccountsProvider.tryLoadAccountUsingIdentifier(switchAccountFromFlow.getTargetCustomerToken());
        if (tryLoadAccountUsingIdentifier == null) {
            tryLoadAccountUsingIdentifier = null;
        }
        FullAccount m3470unboximpl = tryLoadAccountUsingIdentifier instanceof RoutableAccount.Account ? ((RoutableAccount.Account) tryLoadAccountUsingIdentifier).m3470unboximpl() : null;
        FullAccount fullAccount = m3470unboximpl == null ? null : m3470unboximpl;
        if (tryLoadAccountUsingIdentifier == null || (targetCustomerToken = tryLoadAccountUsingIdentifier.getCustomerToken()) == null) {
            targetCustomerToken = switchAccountFromFlow.getTargetCustomerToken();
        }
        multipleAccountsRouter.navigator.goTo(new SwitchFullAccountLoadingScreen(fullAccount, targetCustomerToken, switchAccountFromFlow.getFlowToken(), null, tryLoadAccountUsingIdentifier instanceof RoutableAccount.Sponsor ? AccountSwitcher$AccountSwitchInitiationSource.MANAGED_ACCOUNT_BACK : AccountSwitcher$AccountSwitchInitiationSource.CLIENT_ROUTE, multipleAccountsRouter.toManagedAccountAnimationInfo(tryLoadAccountUsingIdentifier)));
    }

    public final void route(ClientRoute.SwitchAccount switchAccount, FullAccount fullAccount, TargetDestination.RouteDestination routeDestination) {
        String targetCustomerToken;
        switchAccount.getClass();
        RoutableAccount tryLoadAccountUsingIdentifier = this.routableAccountsProvider.tryLoadAccountUsingIdentifier(switchAccount.getTargetCustomerToken());
        if (tryLoadAccountUsingIdentifier == null) {
            FullAccount fullAccount2 = fullAccount != null ? fullAccount : null;
            tryLoadAccountUsingIdentifier = fullAccount2 != null ? RoutableAccount.Account.m3468boximpl(fullAccount2) : null;
        }
        if (tryLoadAccountUsingIdentifier == null || (targetCustomerToken = tryLoadAccountUsingIdentifier.getCustomerToken()) == null) {
            targetCustomerToken = switchAccount.getTargetCustomerToken();
        }
        String str = targetCustomerToken;
        FullAccount m3470unboximpl = tryLoadAccountUsingIdentifier instanceof RoutableAccount.Account ? ((RoutableAccount.Account) tryLoadAccountUsingIdentifier).m3470unboximpl() : null;
        this.navigator.goTo(new SwitchFullAccountLoadingScreen(m3470unboximpl == null ? fullAccount : m3470unboximpl, str, null, routeDestination, tryLoadAccountUsingIdentifier instanceof RoutableAccount.Sponsor ? AccountSwitcher$AccountSwitchInitiationSource.MANAGED_ACCOUNT_BACK : AccountSwitcher$AccountSwitchInitiationSource.CLIENT_ROUTE, toManagedAccountAnimationInfo(tryLoadAccountUsingIdentifier)));
    }

    public final ManagedAccountAnimationInfo toManagedAccountAnimationInfo(RoutableAccount routableAccount) {
        boolean z = routableAccount instanceof RoutableAccount.Dependent;
        AndroidStringManager androidStringManager = this.stringManager;
        if (z) {
            return new ManagedAccountAnimationInfo(androidStringManager.get(R.string.account_aware_switch_to_managed_account), ManagedAccountFlipDirection.TO_KID);
        }
        if (!(routableAccount instanceof RoutableAccount.Sponsor)) {
            return null;
        }
        Object value = this.familyProfileManager.familyProfile.$$delegate_0.getValue();
        FamilyProfile.ManagedAccount managedAccount = value instanceof FamilyProfile.ManagedAccount ? (FamilyProfile.ManagedAccount) value : null;
        String str = managedAccount != null ? managedAccount.sponsorFirstName : null;
        if (str == null) {
            str = "";
        }
        Map mapOf = MapsKt__MapsJVMKt.mapOf(new Pair("name", str));
        mapOf.getClass();
        Resources resources = androidStringManager.resources;
        resources.getClass();
        String format2 = new MessageFormat(resources.getString(R.string.account_aware_switch_back_to_sponsor)).format(mapOf);
        format2.getClass();
        return new ManagedAccountAnimationInfo(format2, ManagedAccountFlipDirection.TO_SPONSOR);
    }

    public static void route$default(MultipleAccountsRouter multipleAccountsRouter, ClientRoute.ViewProfileSwitcher viewProfileSwitcher, RoutingParams routingParams) {
        AccountSwitchAccountViewSwitcher.Entrypoint entrypoint = AccountSwitchAccountViewSwitcher.Entrypoint.CLIENT_ROUTE;
        multipleAccountsRouter.getClass();
        viewProfileSwitcher.getClass();
        routingParams.getClass();
        Navigator navigator = multipleAccountsRouter.navigator;
        Screen exitScreen = routingParams.getExitScreen();
        if (exitScreen == null) {
            exitScreen = null;
        }
        navigator.goTo(new AccountSwitcherScreen(entrypoint, exitScreen, null));
    }
}
