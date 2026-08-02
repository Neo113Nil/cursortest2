package com.squareup.cash.family.applets.viewmodels;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class ApprovedContactsAppletTileViewModel$Uninstalled {
    public final String subtitle;
    public final String title;

    public ApprovedContactsAppletTileViewModel$Uninstalled(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.title = str;
        this.subtitle = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ApprovedContactsAppletTileViewModel$Uninstalled)) {
            return false;
        }
        ApprovedContactsAppletTileViewModel$Uninstalled approvedContactsAppletTileViewModel$Uninstalled = (ApprovedContactsAppletTileViewModel$Uninstalled) obj;
        return Intrinsics.areEqual(this.title, approvedContactsAppletTileViewModel$Uninstalled.title) && Intrinsics.areEqual(this.subtitle, approvedContactsAppletTileViewModel$Uninstalled.subtitle);
    }

    public final int hashCode() {
        return this.subtitle.hashCode() + (this.title.hashCode() * 31);
    }

    public final String toString() {
        return Boxes$$ExternalSyntheticOutline1.m("Uninstalled(title=", this.title, ", subtitle=", this.subtitle, ")");
    }
}
