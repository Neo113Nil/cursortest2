package defpackage;

/* loaded from: classes4.dex */
public final class a2h {
    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof a2h);
    }

    public final int hashCode() {
        return Long.hashCode(5000L) + (Long.hashCode(10000L) * 31);
    }

    public final String toString() {
        return "LyricsConfig(delaySwitchToFullScreenMs=10000, delaySwitchToSyncedScrollModeMs=5000)";
    }
}
