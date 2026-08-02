package com.squareup.cash.mooncake.components;

import androidx.compose.foundation.pager.PagerLayoutInfoKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class MooncakeLargeIcon$DrawableResource$Tinted extends PagerLayoutInfoKt {
    public final int resId;
    public final Function1 tintOverride;

    public MooncakeLargeIcon$DrawableResource$Tinted(int i, Function1 function1) {
        this.resId = i;
        this.tintOverride = function1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MooncakeLargeIcon$DrawableResource$Tinted)) {
            return false;
        }
        MooncakeLargeIcon$DrawableResource$Tinted mooncakeLargeIcon$DrawableResource$Tinted = (MooncakeLargeIcon$DrawableResource$Tinted) obj;
        return this.resId == mooncakeLargeIcon$DrawableResource$Tinted.resId && Intrinsics.areEqual(this.tintOverride, mooncakeLargeIcon$DrawableResource$Tinted.tintOverride);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.resId) * 31;
        Function1 function1 = this.tintOverride;
        return hashCode + (function1 == null ? 0 : function1.hashCode());
    }

    public final String toString() {
        return "Tinted(resId=" + this.resId + ", tintOverride=" + this.tintOverride + ")";
    }
}
