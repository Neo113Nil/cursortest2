package com.squareup.cash.shopping.db;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.squareup.protos.cash.cashsuggest.api.ShopInfoResponse;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class ShopInfoDetails {
    public final long id;
    public final ShopInfoResponse shop_info_response;
    public final long ttl_in_millis;

    public ShopInfoDetails(long j, long j2, ShopInfoResponse shopInfoResponse) {
        shopInfoResponse.getClass();
        this.id = j;
        this.ttl_in_millis = j2;
        this.shop_info_response = shopInfoResponse;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShopInfoDetails)) {
            return false;
        }
        ShopInfoDetails shopInfoDetails = (ShopInfoDetails) obj;
        return this.id == shopInfoDetails.id && this.ttl_in_millis == shopInfoDetails.ttl_in_millis && Intrinsics.areEqual(this.shop_info_response, shopInfoDetails.shop_info_response);
    }

    public final int hashCode() {
        return this.shop_info_response.hashCode() + Recorder$$ExternalSyntheticOutline2.m(Long.hashCode(this.id) * 31, 31, this.ttl_in_millis);
    }

    public final String toString() {
        StringBuilder m1149m = Boxes$$ExternalSyntheticOutline1.m1149m(this.id, "ShopInfoDetails(id=", ", ttl_in_millis=");
        m1149m.append(this.ttl_in_millis);
        m1149m.append(", shop_info_response=");
        m1149m.append(this.shop_info_response);
        m1149m.append(")");
        return m1149m.toString();
    }
}
