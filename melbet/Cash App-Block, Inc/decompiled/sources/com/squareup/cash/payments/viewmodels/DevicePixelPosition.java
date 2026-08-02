package com.squareup.cash.payments.viewmodels;

import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes6.dex */
public final class DevicePixelPosition {
    public static final DevicePixelPosition TopLeft = new DevicePixelPosition(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE);
    public final float x;
    public final float y;

    public DevicePixelPosition(float f, float f2) {
        this.x = f;
        this.y = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DevicePixelPosition)) {
            return false;
        }
        DevicePixelPosition devicePixelPosition = (DevicePixelPosition) obj;
        return Float.compare(this.x, devicePixelPosition.x) == 0 && Float.compare(this.y, devicePixelPosition.y) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.y) + (Float.hashCode(this.x) * 31);
    }

    public final String toString() {
        return "DevicePixelPosition(x=" + this.x + ", y=" + this.y + ")";
    }
}
