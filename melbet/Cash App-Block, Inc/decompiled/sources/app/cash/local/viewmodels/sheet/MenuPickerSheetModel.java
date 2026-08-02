package app.cash.local.viewmodels.sheet;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class MenuPickerSheetModel {
    public final List menus;

    public MenuPickerSheetModel(List list) {
        list.getClass();
        this.menus = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MenuPickerSheetModel) && Intrinsics.areEqual(this.menus, ((MenuPickerSheetModel) obj).menus);
    }

    public final int hashCode() {
        return this.menus.hashCode();
    }

    public final String toString() {
        return CameraState$Type$EnumUnboxingLocalUtility.m("MenuPickerSheetModel(menus=", ")", this.menus);
    }
}
