package com.squareup.cash.profile.screens;

import app.cash.broadway.screen.Screen;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.cdf.customerprofile.CustomerProfileViewOpen;
import com.squareup.cash.profile.screens.ProfileScreens;
import com.squareup.protos.cash.cashface.api.GetProfileDetailsContext;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.LinkedHashMap;
import java.util.UUID;

/* loaded from: classes6.dex */
public final class ProfileLauncher {
    public static final LinkedHashMap launchedScreens = new LinkedHashMap();

    public static String id(ProfileScreens.ProfileScreen.Customer customer) {
        if (customer instanceof ProfileScreens.ProfileScreen.Customer.CashCustomer) {
            return (String) ((ProfileScreens.ProfileScreen.Customer.CashCustomer) customer).customerId.getValue();
        }
        if (customer instanceof ProfileScreens.ProfileScreen.Customer.NonCashCustomer) {
            return (String) ((ProfileScreens.ProfileScreen.Customer.NonCashCustomer) customer).getAlias().getValue();
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return null;
    }

    public static void navigatingAwayFrom(Screen screen) {
        screen.getClass();
        String id = screen instanceof ProfileScreens.ProfileScreen ? id(((ProfileScreens.ProfileScreen) screen).customer) : null;
        if (id != null) {
        }
    }

    public static Screen profileFor(ProfileScreens.ProfileScreen.Customer customer, ProfileScreens.ProfileScreen.Action action, ProfileScreens.ProfileScreen.BackNavigationAction backNavigationAction, UUID uuid, GetProfileDetailsContext getProfileDetailsContext, CustomerProfileViewOpen.EntryPoint entryPoint, Screen screen, boolean z, ProfileScreens.ProfileScreen.ProfileAnalytics profileAnalytics, String str, boolean z2, BlockersData.MoneybotContext moneybotContext) {
        backNavigationAction.getClass();
        uuid.getClass();
        screen.getClass();
        int ordinal = getProfileDetailsContext.ordinal();
        LinkedHashMap linkedHashMap = launchedScreens;
        switch (ordinal) {
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                Screen screen2 = (Screen) linkedHashMap.get(id(customer));
                if (screen2 != null) {
                    return screen2;
                }
                break;
        }
        ProfileScreens.ProfileScreen profileScreen = new ProfileScreens.ProfileScreen(customer, action, backNavigationAction, uuid, getProfileDetailsContext, entryPoint, screen, z, profileAnalytics, str, false, z2, moneybotContext);
        if (getProfileDetailsContext != GetProfileDetailsContext.PAYMENT_FLOW && getProfileDetailsContext != GetProfileDetailsContext.BTC_PAYMENT_FLOW) {
            return profileScreen;
        }
        linkedHashMap.put(id(customer), profileScreen);
        return profileScreen;
    }

    public static Screen profileFor(ProfileScreens.ProfileScreen.Customer customer, ProfileScreens.ProfileScreen.Action.ActionType actionType, ProfileScreens.ProfileScreen.BackNavigationAction backNavigationAction, UUID uuid, GetProfileDetailsContext getProfileDetailsContext, CustomerProfileViewOpen.EntryPoint entryPoint, Screen screen, boolean z, ProfileScreens.ProfileScreen.ProfileAnalytics profileAnalytics, String str, boolean z2, BlockersData.MoneybotContext moneybotContext) {
        actionType.getClass();
        uuid.getClass();
        return profileFor(customer, new ProfileScreens.ProfileScreen.Action(actionType, null), backNavigationAction, uuid, getProfileDetailsContext, entryPoint, screen, z, profileAnalytics, str, z2, moneybotContext);
    }
}
