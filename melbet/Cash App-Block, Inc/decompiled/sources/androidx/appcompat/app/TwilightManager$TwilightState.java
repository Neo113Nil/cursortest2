package androidx.appcompat.app;

/* loaded from: classes3.dex */
public final class TwilightManager$TwilightState {
    public boolean isNight;
    public long nextUpdate;

    public long availableTimeNanos() {
        if (this.isNight) {
            return Long.MAX_VALUE;
        }
        return Math.max(0L, this.nextUpdate - System.nanoTime());
    }
}
