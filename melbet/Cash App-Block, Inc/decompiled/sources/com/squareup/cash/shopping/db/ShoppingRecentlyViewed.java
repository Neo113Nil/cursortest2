package com.squareup.cash.shopping.db;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.squareup.protos.cash.customersearch.api.Metadata;
import com.squareup.protos.cash.ui.Color;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class ShoppingRecentlyViewed {
    public final Color accent_color;
    public final String action_url;
    public final String dark_image_url;
    public final ImageType imageType;
    public final String light_image_url;
    public final String subtitle;
    public final String title;
    public final String token;

    /* renamed from: type, reason: collision with root package name */
    public final Metadata.EntityType f1205type;
    public final long updated_at;

    public ShoppingRecentlyViewed(String str, String str2, String str3, String str4, String str5, long j, Color color, String str6, Metadata.EntityType entityType, ImageType imageType) {
        str.getClass();
        entityType.getClass();
        imageType.getClass();
        this.token = str;
        this.title = str2;
        this.light_image_url = str3;
        this.dark_image_url = str4;
        this.action_url = str5;
        this.updated_at = j;
        this.accent_color = color;
        this.subtitle = str6;
        this.f1205type = entityType;
        this.imageType = imageType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShoppingRecentlyViewed)) {
            return false;
        }
        ShoppingRecentlyViewed shoppingRecentlyViewed = (ShoppingRecentlyViewed) obj;
        return Intrinsics.areEqual(this.token, shoppingRecentlyViewed.token) && Intrinsics.areEqual(this.title, shoppingRecentlyViewed.title) && Intrinsics.areEqual(this.light_image_url, shoppingRecentlyViewed.light_image_url) && Intrinsics.areEqual(this.dark_image_url, shoppingRecentlyViewed.dark_image_url) && Intrinsics.areEqual(this.action_url, shoppingRecentlyViewed.action_url) && this.updated_at == shoppingRecentlyViewed.updated_at && Intrinsics.areEqual(this.accent_color, shoppingRecentlyViewed.accent_color) && Intrinsics.areEqual(this.subtitle, shoppingRecentlyViewed.subtitle) && this.f1205type == shoppingRecentlyViewed.f1205type && this.imageType == shoppingRecentlyViewed.imageType;
    }

    public final int hashCode() {
        int hashCode = this.token.hashCode() * 31;
        String str = this.title;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.light_image_url;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.dark_image_url;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.action_url;
        int m = Recorder$$ExternalSyntheticOutline2.m((hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31, 31, this.updated_at);
        Color color = this.accent_color;
        int hashCode5 = (m + (color == null ? 0 : color.hashCode())) * 31;
        String str5 = this.subtitle;
        return this.imageType.hashCode() + ((this.f1205type.hashCode() + ((hashCode5 + (str5 != null ? str5.hashCode() : 0)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ShoppingRecentlyViewed(token=", this.token, ", title=", this.title, ", light_image_url=");
        Boxes$$ExternalSyntheticOutline1.m(m, this.light_image_url, ", dark_image_url=", this.dark_image_url, ", action_url=");
        m.append(this.action_url);
        m.append(", updated_at=");
        m.append(this.updated_at);
        m.append(", accent_color=");
        m.append(this.accent_color);
        m.append(", subtitle=");
        m.append(this.subtitle);
        m.append(", type=");
        m.append(this.f1205type);
        m.append(", imageType=");
        m.append(this.imageType);
        m.append(")");
        return m.toString();
    }
}
