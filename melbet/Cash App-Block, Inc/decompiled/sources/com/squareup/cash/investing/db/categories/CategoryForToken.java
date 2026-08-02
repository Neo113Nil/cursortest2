package com.squareup.cash.investing.db.categories;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.squareup.cash.investing.primitives.CategoryToken;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.franklin.common.SyncInvestmentCategory;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class CategoryForToken {
    public final String accent_color;
    public final String categoryName;
    public final Color category_color;
    public final String description;
    public final String filterName;
    public final String filterNamePlural;
    public final String filter_description;
    public final String filter_token;
    public final long id;
    public final String image_url;
    public final SyncInvestmentCategory.PrefixIcon prefix_icon;
    public final CategoryToken token;

    public CategoryForToken(long j, CategoryToken categoryToken, String str, String str2, String str3, SyncInvestmentCategory.PrefixIcon prefixIcon, String str4, Color color, String str5, String str6, String str7, String str8) {
        categoryToken.getClass();
        this.id = j;
        this.token = categoryToken;
        this.categoryName = str;
        this.description = str2;
        this.filter_description = str3;
        this.prefix_icon = prefixIcon;
        this.image_url = str4;
        this.category_color = color;
        this.accent_color = str5;
        this.filter_token = str6;
        this.filterName = str7;
        this.filterNamePlural = str8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CategoryForToken)) {
            return false;
        }
        CategoryForToken categoryForToken = (CategoryForToken) obj;
        return this.id == categoryForToken.id && Intrinsics.areEqual(this.token, categoryForToken.token) && this.categoryName.equals(categoryForToken.categoryName) && Intrinsics.areEqual(this.description, categoryForToken.description) && Intrinsics.areEqual(this.filter_description, categoryForToken.filter_description) && this.prefix_icon == categoryForToken.prefix_icon && Intrinsics.areEqual(this.image_url, categoryForToken.image_url) && Intrinsics.areEqual(this.category_color, categoryForToken.category_color) && Intrinsics.areEqual(this.accent_color, categoryForToken.accent_color) && Intrinsics.areEqual(this.filter_token, categoryForToken.filter_token) && Intrinsics.areEqual(this.filterName, categoryForToken.filterName) && Intrinsics.areEqual(this.filterNamePlural, categoryForToken.filterNamePlural);
    }

    public final int hashCode() {
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Long.hashCode(this.id) * 31, 31, this.token.value), 31, this.categoryName);
        String str = this.description;
        int hashCode = (m + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.filter_description;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        SyncInvestmentCategory.PrefixIcon prefixIcon = this.prefix_icon;
        int hashCode3 = (hashCode2 + (prefixIcon == null ? 0 : prefixIcon.hashCode())) * 31;
        String str3 = this.image_url;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Color color = this.category_color;
        int hashCode5 = (hashCode4 + (color == null ? 0 : color.hashCode())) * 31;
        String str4 = this.accent_color;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.filter_token;
        int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.filterName;
        int hashCode8 = (hashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.filterNamePlural;
        return hashCode8 + (str7 != null ? str7.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CategoryForToken(id=");
        sb.append(this.id);
        sb.append(", token=");
        sb.append(this.token);
        Boxes$$ExternalSyntheticOutline1.m(sb, ", categoryName=", this.categoryName, ", description=", this.description);
        sb.append(", filter_description=");
        sb.append(this.filter_description);
        sb.append(", prefix_icon=");
        sb.append(this.prefix_icon);
        sb.append(", image_url=");
        sb.append(this.image_url);
        sb.append(", category_color=");
        sb.append(this.category_color);
        Boxes$$ExternalSyntheticOutline1.m(sb, ", accent_color=", this.accent_color, ", filter_token=", this.filter_token);
        Boxes$$ExternalSyntheticOutline1.m(sb, ", filterName=", this.filterName, ", filterNamePlural=", this.filterNamePlural);
        sb.append(")");
        return sb.toString();
    }
}
