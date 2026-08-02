package com.squareup.cash.afterpayapplet.viewmodels;

import com.squareup.cash.common.viewmodels.ColorModel;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class TintedIcon {
    public final String iconId;
    public final ColorModel iconTintColor;

    public TintedIcon(String str, ColorModel colorModel) {
        str.getClass();
        this.iconId = str;
        this.iconTintColor = colorModel;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TintedIcon)) {
            return false;
        }
        TintedIcon tintedIcon = (TintedIcon) obj;
        return Intrinsics.areEqual(this.iconId, tintedIcon.iconId) && this.iconTintColor.equals(tintedIcon.iconTintColor);
    }

    public final int hashCode() {
        return this.iconTintColor.hashCode() + (this.iconId.hashCode() * 31);
    }

    public final String toString() {
        return "TintedIcon(iconId=" + this.iconId + ", iconTintColor=" + this.iconTintColor + ")";
    }
}
