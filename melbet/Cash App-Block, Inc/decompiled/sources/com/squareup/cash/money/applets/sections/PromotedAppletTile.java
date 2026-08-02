package com.squareup.cash.money.applets.sections;

import com.squareup.cash.money.core.ids.AppletId;
import com.squareup.protos.cash.ui.Image;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class PromotedAppletTile {
    public final AppletId appletId;
    public final Image image;
    public final String subtitle;
    public final String title;

    public PromotedAppletTile(AppletId appletId, String str, String str2, Image image) {
        this.appletId = appletId;
        this.title = str;
        this.subtitle = str2;
        this.image = image;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PromotedAppletTile)) {
            return false;
        }
        PromotedAppletTile promotedAppletTile = (PromotedAppletTile) obj;
        return this.appletId == promotedAppletTile.appletId && Intrinsics.areEqual(this.title, promotedAppletTile.title) && Intrinsics.areEqual(this.subtitle, promotedAppletTile.subtitle) && Intrinsics.areEqual(this.image, promotedAppletTile.image);
    }

    public final int hashCode() {
        int hashCode = this.appletId.hashCode() * 31;
        String str = this.title;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.subtitle;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Image image = this.image;
        return hashCode3 + (image != null ? image.hashCode() : 0);
    }

    public final String toString() {
        return "PromotedAppletTile(appletId=" + this.appletId + ", title=" + this.title + ", subtitle=" + this.subtitle + ", image=" + this.image + ")";
    }
}
