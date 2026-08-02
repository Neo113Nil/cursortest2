package com.squareup.cash.family.familyhub.viewmodels;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class DependentAccessControlsViewModel {
    public final List allowanceItems;
    public final DependentNotificationsSectionModel notificationSettings;

    public DependentAccessControlsViewModel(List list, DependentNotificationsSectionModel dependentNotificationsSectionModel) {
        list.getClass();
        this.allowanceItems = list;
        this.notificationSettings = dependentNotificationsSectionModel;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DependentAccessControlsViewModel)) {
            return false;
        }
        DependentAccessControlsViewModel dependentAccessControlsViewModel = (DependentAccessControlsViewModel) obj;
        return Intrinsics.areEqual(this.allowanceItems, dependentAccessControlsViewModel.allowanceItems) && this.notificationSettings.equals(dependentAccessControlsViewModel.notificationSettings);
    }

    public final int hashCode() {
        return this.notificationSettings.hashCode() + (this.allowanceItems.hashCode() * 31);
    }

    public final String toString() {
        return "DependentAccessControlsViewModel(allowanceItems=" + this.allowanceItems + ", notificationSettings=" + this.notificationSettings + ")";
    }
}
