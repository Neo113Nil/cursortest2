package com.squareup.cash.blockers.viewmodels;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.ui.Icon;
import com.squareup.protos.franklin.api.NotificationCategory;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class RequestPushNotificationsBlockerViewModel {
    public final Icon icon;
    public final String primaryButton;
    public final boolean showToggles;
    public final String skipButton;
    public final String subtitle;
    public final String title;
    public final List toggles;

    public final class NotificationToggle {
        public final NotificationCategory category;
        public final boolean enabled;
        public final Icon icon;
        public final String title;

        public NotificationToggle(NotificationCategory notificationCategory, String str, Icon icon, boolean z) {
            this.category = notificationCategory;
            this.title = str;
            this.icon = icon;
            this.enabled = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NotificationToggle)) {
                return false;
            }
            NotificationToggle notificationToggle = (NotificationToggle) obj;
            return this.category == notificationToggle.category && this.title.equals(notificationToggle.title) && Intrinsics.areEqual(this.icon, notificationToggle.icon) && this.enabled == notificationToggle.enabled;
        }

        public final int hashCode() {
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.category.hashCode() * 31, 31, this.title);
            Icon icon = this.icon;
            return Boolean.hashCode(this.enabled) + ((m + (icon == null ? 0 : icon.hashCode())) * 31);
        }

        public final String toString() {
            return "NotificationToggle(category=" + this.category + ", title=" + this.title + ", icon=" + this.icon + ", enabled=" + this.enabled + ")";
        }
    }

    public RequestPushNotificationsBlockerViewModel(String str, String str2, String str3, Icon icon, String str4, boolean z, ArrayList arrayList) {
        re$$ExternalSyntheticOutline0.m1432m(str, str2, str3);
        this.primaryButton = str;
        this.title = str2;
        this.subtitle = str3;
        this.icon = icon;
        this.skipButton = str4;
        this.showToggles = z;
        this.toggles = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RequestPushNotificationsBlockerViewModel)) {
            return false;
        }
        RequestPushNotificationsBlockerViewModel requestPushNotificationsBlockerViewModel = (RequestPushNotificationsBlockerViewModel) obj;
        return Intrinsics.areEqual(this.primaryButton, requestPushNotificationsBlockerViewModel.primaryButton) && Intrinsics.areEqual(this.title, requestPushNotificationsBlockerViewModel.title) && Intrinsics.areEqual(this.subtitle, requestPushNotificationsBlockerViewModel.subtitle) && Intrinsics.areEqual(this.icon, requestPushNotificationsBlockerViewModel.icon) && Intrinsics.areEqual(this.skipButton, requestPushNotificationsBlockerViewModel.skipButton) && this.showToggles == requestPushNotificationsBlockerViewModel.showToggles && this.toggles.equals(requestPushNotificationsBlockerViewModel.toggles);
    }

    public final int hashCode() {
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.primaryButton.hashCode() * 31, 31, this.title), 31, this.subtitle);
        Icon icon = this.icon;
        int hashCode = (m + (icon == null ? 0 : icon.hashCode())) * 31;
        String str = this.skipButton;
        return Boolean.hashCode(false) + Recorder$$ExternalSyntheticOutline2.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.showToggles), 31, this.toggles);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("RequestPushNotificationsBlockerViewModel(primaryButton=", this.primaryButton, ", title=", this.title, ", subtitle=");
        m.append(this.subtitle);
        m.append(", icon=");
        m.append(this.icon);
        m.append(", skipButton=");
        NavAction$$ExternalSyntheticOutline0.m(m, this.skipButton, ", showToggles=", this.showToggles, ", toggles=");
        return CameraState$Type$EnumUnboxingLocalUtility.m(m, this.toggles, ", closeButton=false)");
    }
}
