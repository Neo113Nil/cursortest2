package app.cash.local.views.internal;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.ui.graphics.Color;
import com.squareup.cash.arcade.Icons;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.ULong;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class ExpandableSectionHeaderData {
    public final Icons icon;
    public final Color iconColor;
    public final String title;

    public ExpandableSectionHeaderData(Icons icons, Color color, String str) {
        str.getClass();
        this.icon = icons;
        this.iconColor = color;
        this.title = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ExpandableSectionHeaderData)) {
            return false;
        }
        ExpandableSectionHeaderData expandableSectionHeaderData = (ExpandableSectionHeaderData) obj;
        return this.icon == expandableSectionHeaderData.icon && this.iconColor.equals(expandableSectionHeaderData.iconColor) && Intrinsics.areEqual(this.title, expandableSectionHeaderData.title);
    }

    public final int hashCode() {
        int hashCode = this.icon.hashCode() * 31;
        long j = this.iconColor.value;
        ULong.Companion companion = ULong.Companion;
        return this.title.hashCode() + Recorder$$ExternalSyntheticOutline2.m(hashCode, 31, j);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ExpandableSectionHeaderData(icon=");
        sb.append(this.icon);
        sb.append(", iconColor=");
        sb.append(this.iconColor);
        sb.append(", title=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.title, ")");
    }
}
