package com.squareup.cash.investing.db.categories;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class MapForToken {
    public final List category_map;

    public MapForToken(List list) {
        this.category_map = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MapForToken) && Intrinsics.areEqual(this.category_map, ((MapForToken) obj).category_map);
    }

    public final int hashCode() {
        List list = this.category_map;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        return CameraState$Type$EnumUnboxingLocalUtility.m("MapForToken(category_map=", ")", this.category_map);
    }
}
