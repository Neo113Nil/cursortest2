package com.squareup.cash.investing.viewmodels.categories;

import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.cash.investing.primitives.CategoryToken;
import com.squareup.protos.cash.ui.Color;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class InvestingCategoryTileContentModel {
    public final Color backgroundColor;
    public final String imageUrl;
    public final String title;
    public final CategoryToken token;

    public InvestingCategoryTileContentModel(String str, String str2, Color color, CategoryToken categoryToken) {
        str.getClass();
        str2.getClass();
        color.getClass();
        categoryToken.getClass();
        this.imageUrl = str;
        this.title = str2;
        this.backgroundColor = color;
        this.token = categoryToken;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InvestingCategoryTileContentModel)) {
            return false;
        }
        InvestingCategoryTileContentModel investingCategoryTileContentModel = (InvestingCategoryTileContentModel) obj;
        return Intrinsics.areEqual(this.imageUrl, investingCategoryTileContentModel.imageUrl) && Intrinsics.areEqual(this.title, investingCategoryTileContentModel.title) && Intrinsics.areEqual(this.backgroundColor, investingCategoryTileContentModel.backgroundColor) && Intrinsics.areEqual(this.token, investingCategoryTileContentModel.token);
    }

    public final int hashCode() {
        return this.token.value.hashCode() + SVG$Unit$EnumUnboxingLocalUtility.m(this.backgroundColor, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.imageUrl.hashCode() * 31, 31, this.title), 31);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("InvestingCategoryTileContentModel(imageUrl=", this.imageUrl, ", title=", this.title, ", backgroundColor=");
        m.append(this.backgroundColor);
        m.append(", token=");
        m.append(this.token);
        m.append(")");
        return m.toString();
    }
}
