package com.squareup.cash.fidesmo.views;

import androidx.compose.ui.graphics.Color;
import kotlin.ULong;

/* loaded from: classes6.dex */
public final class Pulse {
    public final long color;
    public final float startProgress;

    public Pulse(long j, float f) {
        this.color = j;
        this.startProgress = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Pulse)) {
            return false;
        }
        Pulse pulse = (Pulse) obj;
        return Color.m676equalsimpl0(this.color, pulse.color) && Float.compare(this.startProgress, pulse.startProgress) == 0;
    }

    public final int hashCode() {
        int i = Color.$r8$clinit;
        ULong.Companion companion = ULong.Companion;
        return Float.hashCode(this.startProgress) + (Long.hashCode(this.color) * 31);
    }

    public final String toString() {
        return "Pulse(color=" + Color.m682toStringimpl(this.color) + ", startProgress=" + this.startProgress + ")";
    }
}
