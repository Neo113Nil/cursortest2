package com.squareup.cash.core.navigationcontainer.models;

import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.appmessages.InAppNotificationModel;
import com.squareup.cash.appmessages.TooltipAppMessageViewModel;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.implementations.immutableList.AbstractPersistentList;

/* loaded from: classes.dex */
public final class MainScreensViewModel$Ready {
    public final boolean flatTabs;
    public final InAppNotificationModel inAppNotification;
    public final boolean navTransitionsEnabled;
    public final boolean sharedToolbarEnabled;
    public final MainScreensViewModel$TabTreatment tabTreatment;
    public final ImmutableList tabs;
    public final TooltipAppMessageViewModel tooltipAppMessage;

    public MainScreensViewModel$Ready(MainScreensViewModel$TabTreatment mainScreensViewModel$TabTreatment, AbstractPersistentList abstractPersistentList, InAppNotificationModel inAppNotificationModel, TooltipAppMessageViewModel tooltipAppMessageViewModel, boolean z, boolean z2, boolean z3) {
        abstractPersistentList.getClass();
        inAppNotificationModel.getClass();
        this.tabTreatment = mainScreensViewModel$TabTreatment;
        this.tabs = abstractPersistentList;
        this.inAppNotification = inAppNotificationModel;
        this.tooltipAppMessage = tooltipAppMessageViewModel;
        this.flatTabs = z;
        this.navTransitionsEnabled = z2;
        this.sharedToolbarEnabled = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MainScreensViewModel$Ready)) {
            return false;
        }
        MainScreensViewModel$Ready mainScreensViewModel$Ready = (MainScreensViewModel$Ready) obj;
        return this.tabTreatment.equals(mainScreensViewModel$Ready.tabTreatment) && Intrinsics.areEqual(this.tabs, mainScreensViewModel$Ready.tabs) && Intrinsics.areEqual(this.inAppNotification, mainScreensViewModel$Ready.inAppNotification) && Intrinsics.areEqual(this.tooltipAppMessage, mainScreensViewModel$Ready.tooltipAppMessage) && this.flatTabs == mainScreensViewModel$Ready.flatTabs && this.navTransitionsEnabled == mainScreensViewModel$Ready.navTransitionsEnabled && this.sharedToolbarEnabled == mainScreensViewModel$Ready.sharedToolbarEnabled;
    }

    public final int hashCode() {
        int hashCode = (this.inAppNotification.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(BalanceFeedKt$$ExternalSyntheticOutline0.m(this.tabs, this.tabTreatment.hashCode() * 31, 31), 31, false)) * 31;
        TooltipAppMessageViewModel tooltipAppMessageViewModel = this.tooltipAppMessage;
        return Boolean.hashCode(this.sharedToolbarEnabled) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode + (tooltipAppMessageViewModel != null ? tooltipAppMessageViewModel.hashCode() : 0)) * 31, 31, this.flatTabs), 31, this.navTransitionsEnabled);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Ready(tabTreatment=");
        sb.append(this.tabTreatment);
        sb.append(", tabs=");
        sb.append(this.tabs);
        sb.append(", moneybotFab=false, inAppNotification=");
        sb.append(this.inAppNotification);
        sb.append(", tooltipAppMessage=");
        sb.append(this.tooltipAppMessage);
        sb.append(", flatTabs=");
        re$$ExternalSyntheticOutline0.m(sb, this.flatTabs, ", navTransitionsEnabled=", this.navTransitionsEnabled, ", sharedToolbarEnabled=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.sharedToolbarEnabled, ")");
    }
}
