package com.squareup.cash.profile.viewmodels;

import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class Category$CategoryListHeader$ToggleHeader {
    public final String description;
    public final boolean isToggledOn;

    public Category$CategoryListHeader$ToggleHeader(String str, boolean z) {
        str.getClass();
        this.description = str;
        this.isToggledOn = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Category$CategoryListHeader$ToggleHeader)) {
            return false;
        }
        Category$CategoryListHeader$ToggleHeader category$CategoryListHeader$ToggleHeader = (Category$CategoryListHeader$ToggleHeader) obj;
        return Intrinsics.areEqual(this.description, category$CategoryListHeader$ToggleHeader.description) && this.isToggledOn == category$CategoryListHeader$ToggleHeader.isToggledOn;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.isToggledOn) + (this.description.hashCode() * 31);
    }

    public final String toString() {
        return Request$Priority$EnumUnboxingLocalUtility.m("ToggleHeader(description=", this.description, ", isToggledOn=", ")", this.isToggledOn);
    }
}
