package androidx.camera.core.impl;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class Timebase {
    public static final /* synthetic */ Timebase[] $VALUES;
    public static final Timebase REALTIME;
    public static final Timebase UPTIME;

    static {
        Timebase timebase = new Timebase("UPTIME", 0);
        UPTIME = timebase;
        Timebase timebase2 = new Timebase("REALTIME", 1);
        REALTIME = timebase2;
        $VALUES = new Timebase[]{timebase, timebase2};
    }

    public static Timebase valueOf(String str) {
        return (Timebase) Enum.valueOf(Timebase.class, str);
    }

    public static Timebase[] values() {
        return (Timebase[]) $VALUES.clone();
    }
}
