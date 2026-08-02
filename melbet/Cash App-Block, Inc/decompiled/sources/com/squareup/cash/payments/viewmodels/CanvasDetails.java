package com.squareup.cash.payments.viewmodels;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class CanvasDetails {
    public final Size size;
    public final DevicePixelPosition start;

    public CanvasDetails() {
        this.size = Size.Zero;
        this.start = DevicePixelPosition.TopLeft;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CanvasDetails)) {
            return false;
        }
        CanvasDetails canvasDetails = (CanvasDetails) obj;
        return Intrinsics.areEqual(this.size, canvasDetails.size) && Intrinsics.areEqual(this.start, canvasDetails.start);
    }

    public final int hashCode() {
        return this.start.hashCode() + (this.size.hashCode() * 31);
    }

    public final String toString() {
        return "CanvasDetails(size=" + this.size + ", start=" + this.start + ")";
    }

    public CanvasDetails(Size size, DevicePixelPosition devicePixelPosition) {
        this.size = size;
        this.start = devicePixelPosition;
    }
}
