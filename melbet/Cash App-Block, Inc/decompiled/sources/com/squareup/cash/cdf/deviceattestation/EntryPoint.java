package com.squareup.cash.cdf.deviceattestation;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class EntryPoint {
    public static final /* synthetic */ EntryPoint[] $VALUES;
    public static final EntryPoint INITIATE_SESSION;
    public static final EntryPoint PERSONA_DIDV;
    public static final EntryPoint PUSH_NOTIFICATION;
    public static final EntryPoint REFRESH_SESSION;
    public static final EntryPoint TTP;

    static {
        EntryPoint entryPoint = new EntryPoint("INITIATE_SESSION", 0);
        INITIATE_SESSION = entryPoint;
        EntryPoint entryPoint2 = new EntryPoint("REFRESH_SESSION", 1);
        REFRESH_SESSION = entryPoint2;
        EntryPoint entryPoint3 = new EntryPoint("PUSH_NOTIFICATION", 2);
        PUSH_NOTIFICATION = entryPoint3;
        EntryPoint entryPoint4 = new EntryPoint("PERSONA_DIDV", 3);
        PERSONA_DIDV = entryPoint4;
        EntryPoint entryPoint5 = new EntryPoint("TTP", 4);
        TTP = entryPoint5;
        $VALUES = new EntryPoint[]{entryPoint, entryPoint2, entryPoint3, entryPoint4, entryPoint5};
    }

    public static EntryPoint valueOf(String str) {
        return (EntryPoint) Enum.valueOf(EntryPoint.class, str);
    }

    public static EntryPoint[] values() {
        return (EntryPoint[]) $VALUES.clone();
    }
}
