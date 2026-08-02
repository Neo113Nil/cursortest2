package app.cash.cdp.api;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;

/* loaded from: classes.dex */
public final class FlushTrigger {
    public final long delayMillis;

    public /* synthetic */ FlushTrigger() {
        this(0L);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FlushTrigger) && this.delayMillis == ((FlushTrigger) obj).delayMillis;
    }

    public final int hashCode() {
        return Long.hashCode(this.delayMillis);
    }

    public final String toString() {
        return Boxes$$ExternalSyntheticOutline1.m(this.delayMillis, "FlushTrigger(delayMillis=", ")");
    }

    public FlushTrigger(long j) {
        this.delayMillis = j;
    }
}
