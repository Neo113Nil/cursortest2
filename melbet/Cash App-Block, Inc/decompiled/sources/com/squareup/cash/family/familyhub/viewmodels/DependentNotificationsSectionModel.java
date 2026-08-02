package com.squareup.cash.family.familyhub.viewmodels;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class DependentNotificationsSectionModel {
    public final String subtitle;
    public final String title;

    public DependentNotificationsSectionModel(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.title = str;
        this.subtitle = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DependentNotificationsSectionModel)) {
            return false;
        }
        DependentNotificationsSectionModel dependentNotificationsSectionModel = (DependentNotificationsSectionModel) obj;
        return Intrinsics.areEqual(this.title, dependentNotificationsSectionModel.title) && Intrinsics.areEqual(this.subtitle, dependentNotificationsSectionModel.subtitle);
    }

    public final int hashCode() {
        return this.subtitle.hashCode() + (this.title.hashCode() * 31);
    }

    public final String toString() {
        return Boxes$$ExternalSyntheticOutline1.m("DependentNotificationsSectionModel(title=", this.title, ", subtitle=", this.subtitle, ")");
    }
}
