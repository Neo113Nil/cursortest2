package com.squareup.cash.account.settings.viewmodels;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class ProfileUpsellViewEvent$UpsellRowClicked {
    public final String clientRouteUrl;
    public final String upsellType;

    public ProfileUpsellViewEvent$UpsellRowClicked(String str, String str2) {
        str.getClass();
        this.clientRouteUrl = str;
        this.upsellType = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProfileUpsellViewEvent$UpsellRowClicked)) {
            return false;
        }
        ProfileUpsellViewEvent$UpsellRowClicked profileUpsellViewEvent$UpsellRowClicked = (ProfileUpsellViewEvent$UpsellRowClicked) obj;
        return Intrinsics.areEqual(this.clientRouteUrl, profileUpsellViewEvent$UpsellRowClicked.clientRouteUrl) && Intrinsics.areEqual(this.upsellType, profileUpsellViewEvent$UpsellRowClicked.upsellType);
    }

    public final int hashCode() {
        int hashCode = this.clientRouteUrl.hashCode() * 31;
        String str = this.upsellType;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return Boxes$$ExternalSyntheticOutline1.m("UpsellRowClicked(clientRouteUrl=", this.clientRouteUrl, ", upsellType=", this.upsellType, ")");
    }
}
