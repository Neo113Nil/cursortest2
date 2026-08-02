package com.squareup.cash.navigation;

import com.squareup.cash.activity.screens.ActivityScreen;
import com.squareup.cash.money.navigation.real.RealMoneyNavigatorHelper;
import com.squareup.cash.treehouse.android.broadway.TreehouseScreen;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class CashTabProviderNavigatorHelper {
    public CashTabProviderNavigatorHelper(RealMoneyNavigatorHelper realMoneyNavigatorHelper) {
    }

    public static boolean isActivityScreen(Object obj) {
        if (obj instanceof ActivityScreen) {
            return true;
        }
        if (!(obj instanceof TreehouseScreen)) {
            return false;
        }
        TreehouseScreen treehouseScreen = (TreehouseScreen) obj;
        return Intrinsics.areEqual(treehouseScreen.f1218app, "activity") && Intrinsics.areEqual(treehouseScreen.link, "feed");
    }
}
