package com.squareup.cash.core.navigationcontainer.models;

import com.squareup.cash.appmessages.InAppNotificationModel;
import com.squareup.cash.appmessages.TooltipAppMessageViewModel;
import com.squareup.cash.tabs.viewmodels.TabToolbarInternalViewModel;
import kotlinx.collections.immutable.ImmutableList;

/* loaded from: classes.dex */
public final class ContainerUiModel {
    public final Chrome chrome;
    public final NavigationModel navigation;

    public final class Chrome {
        public final boolean flatTabs;
        public final InAppNotificationModel inAppNotification;
        public final boolean navTransitionsEnabled;
        public final boolean sharedToolbarEnabled;
        public final TabToolbarInternalViewModel tabToolbarViewModel;
        public final MainScreensViewModel$TabTreatment tabTreatment;
        public final ImmutableList tabs;
        public final TooltipAppMessageViewModel tooltipAppMessage;

        public Chrome(MainScreensViewModel$TabTreatment mainScreensViewModel$TabTreatment, ImmutableList immutableList, InAppNotificationModel inAppNotificationModel, TooltipAppMessageViewModel tooltipAppMessageViewModel, TabToolbarInternalViewModel tabToolbarInternalViewModel, boolean z, boolean z2, boolean z3) {
            immutableList.getClass();
            inAppNotificationModel.getClass();
            tabToolbarInternalViewModel.getClass();
            this.tabTreatment = mainScreensViewModel$TabTreatment;
            this.tabs = immutableList;
            this.inAppNotification = inAppNotificationModel;
            this.tooltipAppMessage = tooltipAppMessageViewModel;
            this.tabToolbarViewModel = tabToolbarInternalViewModel;
            this.flatTabs = z;
            this.navTransitionsEnabled = z2;
            this.sharedToolbarEnabled = z3;
        }
    }

    public ContainerUiModel(NavigationModel navigationModel, Chrome chrome) {
        navigationModel.getClass();
        this.navigation = navigationModel;
        this.chrome = chrome;
    }
}
