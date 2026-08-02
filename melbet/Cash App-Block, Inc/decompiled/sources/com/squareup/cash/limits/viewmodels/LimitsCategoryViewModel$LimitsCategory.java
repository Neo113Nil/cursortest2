package com.squareup.cash.limits.viewmodels;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class LimitsCategoryViewModel$LimitsCategory {
    public final String categoryHeader;
    public final List limits;

    public LimitsCategoryViewModel$LimitsCategory(String str, List list) {
        list.getClass();
        this.categoryHeader = str;
        this.limits = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LimitsCategoryViewModel$LimitsCategory)) {
            return false;
        }
        LimitsCategoryViewModel$LimitsCategory limitsCategoryViewModel$LimitsCategory = (LimitsCategoryViewModel$LimitsCategory) obj;
        return Intrinsics.areEqual(this.categoryHeader, limitsCategoryViewModel$LimitsCategory.categoryHeader) && Intrinsics.areEqual(this.limits, limitsCategoryViewModel$LimitsCategory.limits);
    }

    public final int hashCode() {
        String str = this.categoryHeader;
        return this.limits.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return CameraState$Type$EnumUnboxingLocalUtility.m("LimitsCategory(categoryHeader=", this.categoryHeader, ", limits=", ")", this.limits);
    }
}
