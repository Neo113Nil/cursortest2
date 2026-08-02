package com.squareup.cash.profile.presenters.notifications;

import app.cash.broadway.screen.Screen;
import com.squareup.cash.R;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.data.blockers.FlowStarter;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.profile.screens.ProfileScreens;
import com.squareup.cash.profile.viewmodels.Category;
import com.squareup.cash.profile.viewmodels.CategoryListType;
import com.squareup.cash.resource.text.AndroidStringManager;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes6.dex */
public final class NotificationSectionPresenter {
    public final String accountToken;
    public final Analytics analytics;
    public final Screen args;
    public final FlowStarter blockersNavigator;
    public final List categoryPreferences;
    public final BetterNavigator.ScreenNavigator navigator;
    public final ArrayList preferences;
    public final AndroidStringManager stringManager;

    public NotificationSectionPresenter(AndroidStringManager androidStringManager, Analytics analytics, FlowStarter flowStarter, Screen screen, BetterNavigator.ScreenNavigator screenNavigator, List list, String str) {
        screen.getClass();
        list.getClass();
        this.stringManager = androidStringManager;
        this.analytics = analytics;
        this.blockersNavigator = flowStarter;
        this.args = screen;
        this.navigator = screenNavigator;
        this.categoryPreferences = list;
        this.accountToken = str;
        this.preferences = ProfileNotificationsHelperKt.filterAccountBasedCategories(str, list);
    }

    public final void openCategory(Category category, String str) {
        Category.CategoryType categoryType = category.categoryType;
        boolean z = categoryType instanceof Category.CategoryType.CategoryList;
        BetterNavigator.ScreenNavigator screenNavigator = this.navigator;
        if (!z) {
            if (categoryType instanceof Category.CategoryType.ChannelList) {
                screenNavigator.goTo(new ProfileScreens.ChannelListScreen(((Category.CategoryType.ChannelList) categoryType).notificationCategory, str));
                return;
            } else {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return;
            }
        }
        CategoryListType categoryListType = ((Category.CategoryType.CategoryList) categoryType).categoryListType;
        String str2 = this.stringManager.get(R.string.investing_category_title);
        if (((Category.CategoryType.CategoryList) category.categoryType).categoryListType != CategoryListType.INVESTING) {
            str2 = null;
        }
        screenNavigator.goTo(new ProfileScreens.CategoryListScreen(str2, categoryListType, str));
    }
}
