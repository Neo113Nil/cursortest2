package defpackage;

/* loaded from: classes3.dex */
public final class c2h {
    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof c2h);
    }

    public final int hashCode() {
        return Long.hashCode(5000L) + (Long.hashCode(10000L) * 31);
    }

    public final String toString() {
        return "LyricsConfig(switchToFullScreenMs=10000, switchToInteractiveModeMs=5000)";
    }
}
