package com.squareup.cash.family.familyhub.viewmodels;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class FamilyListGroup {
    public final List items;

    public FamilyListGroup(List list) {
        list.getClass();
        this.items = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FamilyListGroup) && Intrinsics.areEqual(this.items, ((FamilyListGroup) obj).items);
    }

    public final int hashCode() {
        return this.items.hashCode();
    }

    public final String toString() {
        return CameraState$Type$EnumUnboxingLocalUtility.m("FamilyListGroup(items=", ")", this.items);
    }
}
