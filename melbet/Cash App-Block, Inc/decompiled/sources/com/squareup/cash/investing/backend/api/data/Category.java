package com.squareup.cash.investing.backend.api.data;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.squareup.cash.investing.primitives.CategoryToken;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.franklin.common.SyncInvestmentCategory;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class Category {
    public final Color color;
    public final String description;
    public final String filterDescription;
    public final long id;
    public final String imageUrl;
    public final String name;
    public final SyncInvestmentCategory.PrefixIcon prefixIcon;
    public final CategoryToken token;

    public Category(long j, CategoryToken categoryToken, String str, String str2, Color color, String str3, String str4, SyncInvestmentCategory.PrefixIcon prefixIcon) {
        categoryToken.getClass();
        str.getClass();
        this.id = j;
        this.token = categoryToken;
        this.name = str;
        this.imageUrl = str2;
        this.color = color;
        this.description = str3;
        this.filterDescription = str4;
        this.prefixIcon = prefixIcon;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Category)) {
            return false;
        }
        Category category = (Category) obj;
        return this.id == category.id && Intrinsics.areEqual(this.token, category.token) && Intrinsics.areEqual(this.name, category.name) && Intrinsics.areEqual(this.imageUrl, category.imageUrl) && Intrinsics.areEqual(this.color, category.color) && Intrinsics.areEqual(this.description, category.description) && Intrinsics.areEqual(this.filterDescription, category.filterDescription) && this.prefixIcon == category.prefixIcon;
    }

    public final int hashCode() {
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Long.hashCode(this.id) * 31, 31, this.token.value), 31, this.name);
        String str = this.imageUrl;
        int hashCode = (m + (str == null ? 0 : str.hashCode())) * 31;
        Color color = this.color;
        int hashCode2 = (hashCode + (color == null ? 0 : color.hashCode())) * 31;
        String str2 = this.description;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.filterDescription;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        SyncInvestmentCategory.PrefixIcon prefixIcon = this.prefixIcon;
        return hashCode4 + (prefixIcon != null ? prefixIcon.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Category(id=");
        sb.append(this.id);
        sb.append(", token=");
        sb.append(this.token);
        Boxes$$ExternalSyntheticOutline1.m(sb, ", name=", this.name, ", imageUrl=", this.imageUrl);
        sb.append(", color=");
        sb.append(this.color);
        sb.append(", description=");
        sb.append(this.description);
        sb.append(", filterDescription=");
        sb.append(this.filterDescription);
        sb.append(", prefixIcon=");
        sb.append(this.prefixIcon);
        sb.append(")");
        return sb.toString();
    }
}
