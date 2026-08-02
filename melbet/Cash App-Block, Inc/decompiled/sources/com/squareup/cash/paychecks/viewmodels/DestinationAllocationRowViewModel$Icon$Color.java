package com.squareup.cash.paychecks.viewmodels;

import com.squareup.protos.cash.ui.Color;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class DestinationAllocationRowViewModel$Icon$Color {
    public final Color color;

    public DestinationAllocationRowViewModel$Icon$Color(Color color) {
        color.getClass();
        this.color = color;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DestinationAllocationRowViewModel$Icon$Color) && Intrinsics.areEqual(this.color, ((DestinationAllocationRowViewModel$Icon$Color) obj).color);
    }

    public final int hashCode() {
        return this.color.hashCode();
    }

    public final String toString() {
        return "Color(color=" + this.color + ")";
    }
}
