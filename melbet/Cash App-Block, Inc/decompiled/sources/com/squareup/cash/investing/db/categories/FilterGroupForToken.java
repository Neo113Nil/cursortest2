package com.squareup.cash.investing.db.categories;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.datadog.android.rum.model.ViewEvent$State$EnumUnboxingLocalUtility;
import com.squareup.cash.investing.primitives.CategoryToken;
import com.squareup.cash.investing.primitives.FilterToken;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.franklin.common.SyncInvestmentCategory;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class FilterGroupForToken {
    public final String accent_color;
    public final Long categoryId;
    public final String categoryName;
    public final CategoryToken categoryToken;
    public final Color category_color;
    public final List category_map;
    public final String description;
    public final String filterName;
    public final FilterToken filterToken;
    public final String filter_description;
    public final String image_url;
    public final SyncInvestmentCategory.PrefixIcon prefix_icon;
    public final List subfilters;

    /* renamed from: type, reason: collision with root package name */
    public final SyncInvestmentCategory.CategoryType f1155type;

    public FilterGroupForToken(FilterToken filterToken, String str, List list, List list2, Long l, String str2, CategoryToken categoryToken, String str3, Color color, SyncInvestmentCategory.CategoryType categoryType, String str4, String str5, SyncInvestmentCategory.PrefixIcon prefixIcon, String str6) {
        str.getClass();
        this.filterToken = filterToken;
        this.filterName = str;
        this.subfilters = list;
        this.category_map = list2;
        this.categoryId = l;
        this.categoryName = str2;
        this.categoryToken = categoryToken;
        this.image_url = str3;
        this.category_color = color;
        this.f1155type = categoryType;
        this.description = str4;
        this.filter_description = str5;
        this.prefix_icon = prefixIcon;
        this.accent_color = str6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FilterGroupForToken)) {
            return false;
        }
        FilterGroupForToken filterGroupForToken = (FilterGroupForToken) obj;
        return this.filterToken.equals(filterGroupForToken.filterToken) && Intrinsics.areEqual(this.filterName, filterGroupForToken.filterName) && Intrinsics.areEqual(this.subfilters, filterGroupForToken.subfilters) && Intrinsics.areEqual(this.category_map, filterGroupForToken.category_map) && Intrinsics.areEqual(this.categoryId, filterGroupForToken.categoryId) && Intrinsics.areEqual(this.categoryName, filterGroupForToken.categoryName) && Intrinsics.areEqual(this.categoryToken, filterGroupForToken.categoryToken) && Intrinsics.areEqual(this.image_url, filterGroupForToken.image_url) && Intrinsics.areEqual(this.category_color, filterGroupForToken.category_color) && this.f1155type == filterGroupForToken.f1155type && Intrinsics.areEqual(this.description, filterGroupForToken.description) && Intrinsics.areEqual(this.filter_description, filterGroupForToken.filter_description) && this.prefix_icon == filterGroupForToken.prefix_icon && Intrinsics.areEqual(this.accent_color, filterGroupForToken.accent_color);
    }

    public final int hashCode() {
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.filterToken.value.hashCode() * 31, 31, this.filterName);
        List list = this.subfilters;
        int hashCode = (m + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.category_map;
        int hashCode2 = (hashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        Long l = this.categoryId;
        int hashCode3 = (hashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        String str = this.categoryName;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        CategoryToken categoryToken = this.categoryToken;
        int hashCode5 = (hashCode4 + (categoryToken == null ? 0 : categoryToken.value.hashCode())) * 31;
        String str2 = this.image_url;
        int hashCode6 = (hashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Color color = this.category_color;
        int hashCode7 = (hashCode6 + (color == null ? 0 : color.hashCode())) * 31;
        SyncInvestmentCategory.CategoryType categoryType = this.f1155type;
        int hashCode8 = (hashCode7 + (categoryType == null ? 0 : categoryType.hashCode())) * 31;
        String str3 = this.description;
        int hashCode9 = (hashCode8 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.filter_description;
        int hashCode10 = (hashCode9 + (str4 == null ? 0 : str4.hashCode())) * 31;
        SyncInvestmentCategory.PrefixIcon prefixIcon = this.prefix_icon;
        int hashCode11 = (hashCode10 + (prefixIcon == null ? 0 : prefixIcon.hashCode())) * 31;
        String str5 = this.accent_color;
        return hashCode11 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FilterGroupForToken(filterToken=");
        sb.append(this.filterToken);
        sb.append(", filterName=");
        sb.append(this.filterName);
        sb.append(", subfilters=");
        Request$Priority$EnumUnboxingLocalUtility.m(sb, this.subfilters, ", category_map=", this.category_map, ", categoryId=");
        ViewEvent$State$EnumUnboxingLocalUtility.m(this.categoryId, ", categoryName=", this.categoryName, ", categoryToken=", sb);
        sb.append(this.categoryToken);
        sb.append(", image_url=");
        sb.append(this.image_url);
        sb.append(", category_color=");
        sb.append(this.category_color);
        sb.append(", type=");
        sb.append(this.f1155type);
        sb.append(", description=");
        Boxes$$ExternalSyntheticOutline1.m(sb, this.description, ", filter_description=", this.filter_description, ", prefix_icon=");
        sb.append(this.prefix_icon);
        sb.append(", accent_color=");
        sb.append(this.accent_color);
        sb.append(")");
        return sb.toString();
    }
}
