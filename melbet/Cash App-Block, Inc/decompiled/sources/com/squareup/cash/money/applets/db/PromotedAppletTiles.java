package com.squareup.cash.money.applets.db;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.ui.Image;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class PromotedAppletTiles {
    public final String appletId;
    public final Image image;
    public final long sortOrder;
    public final String subtitle;
    public final String title;

    public PromotedAppletTiles(String str, long j, String str2, String str3, Image image) {
        str.getClass();
        this.appletId = str;
        this.sortOrder = j;
        this.title = str2;
        this.subtitle = str3;
        this.image = image;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PromotedAppletTiles)) {
            return false;
        }
        PromotedAppletTiles promotedAppletTiles = (PromotedAppletTiles) obj;
        return Intrinsics.areEqual(this.appletId, promotedAppletTiles.appletId) && this.sortOrder == promotedAppletTiles.sortOrder && Intrinsics.areEqual(this.title, promotedAppletTiles.title) && Intrinsics.areEqual(this.subtitle, promotedAppletTiles.subtitle) && Intrinsics.areEqual(this.image, promotedAppletTiles.image);
    }

    public final int hashCode() {
        int m = Recorder$$ExternalSyntheticOutline2.m(this.appletId.hashCode() * 31, 31, this.sortOrder);
        String str = this.title;
        int hashCode = (m + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.subtitle;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Image image = this.image;
        return hashCode2 + (image != null ? image.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = re$$ExternalSyntheticOutline0.m("PromotedAppletTiles(appletId=", this.appletId, ", sortOrder=", this.sortOrder);
        Boxes$$ExternalSyntheticOutline1.m(m, ", title=", this.title, ", subtitle=", this.subtitle);
        m.append(", image=");
        m.append(this.image);
        m.append(")");
        return m.toString();
    }
}
