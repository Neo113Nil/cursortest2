package com.squareup.cash.card.onboarding;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class IconGridSection implements ProductDetailsPageSection {
    public final List iconCells;
    public final String title;

    public final class IconCell {
        public final String description;
        public final String iconId;
        public final String title;

        public IconCell(String str, String str2, String str3) {
            str.getClass();
            this.iconId = str;
            this.title = str2;
            this.description = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof IconCell)) {
                return false;
            }
            IconCell iconCell = (IconCell) obj;
            return Intrinsics.areEqual(this.iconId, iconCell.iconId) && this.title.equals(iconCell.title) && this.description.equals(iconCell.description);
        }

        public final int hashCode() {
            return this.description.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.iconId.hashCode() * 31, 31, this.title);
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("IconCell(iconId=", this.iconId, ", title=", this.title, ", description="), this.description, ")");
        }
    }

    public IconGridSection(String str, List list) {
        list.getClass();
        this.title = str;
        this.iconCells = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IconGridSection)) {
            return false;
        }
        IconGridSection iconGridSection = (IconGridSection) obj;
        return Intrinsics.areEqual(this.title, iconGridSection.title) && Intrinsics.areEqual(this.iconCells, iconGridSection.iconCells);
    }

    public final int hashCode() {
        String str = this.title;
        return this.iconCells.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return CameraState$Type$EnumUnboxingLocalUtility.m("IconGridSection(title=", this.title, ", iconCells=", ")", this.iconCells);
    }
}
