package com.squareup.cash.cdf.asset;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class EntryPoint {
    public static final /* synthetic */ EntryPoint[] $VALUES;
    public static final EntryPoint AMOUNT_FIRST;
    public static final EntryPoint PERSON_FIRST;

    static {
        EntryPoint entryPoint = new EntryPoint("AMOUNT_FIRST", 0);
        AMOUNT_FIRST = entryPoint;
        EntryPoint entryPoint2 = new EntryPoint("PERSON_FIRST", 1);
        PERSON_FIRST = entryPoint2;
        $VALUES = new EntryPoint[]{entryPoint, entryPoint2};
    }

    public static EntryPoint valueOf(String str) {
        return (EntryPoint) Enum.valueOf(EntryPoint.class, str);
    }

    public static EntryPoint[] values() {
        return (EntryPoint[]) $VALUES.clone();
    }
}
