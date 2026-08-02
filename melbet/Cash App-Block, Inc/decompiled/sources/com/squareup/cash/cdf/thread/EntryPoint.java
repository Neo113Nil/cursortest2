package com.squareup.cash.cdf.thread;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class EntryPoint {
    public static final /* synthetic */ EntryPoint[] $VALUES = {new EntryPoint("URL", 0), new EntryPoint("PAYMENT_FLOW", 1), new EntryPoint("ACTIVITY_QAB", 2), new EntryPoint("ACTIVITY_RECEIPT_AVATAR", 3), new EntryPoint("ACTIVITY_ROW_AVATAR", 4), new EntryPoint("DISCOVER_QAB", 5), new EntryPoint("DISCOVER_SEARCH", 6), new EntryPoint("ADD_FAVORITES", 7), new EntryPoint("LIST_FAVORITES", 8)};

    /* JADX INFO: Fake field, exist only in values array */
    EntryPoint EF5;

    public static EntryPoint valueOf(String str) {
        return (EntryPoint) Enum.valueOf(EntryPoint.class, str);
    }

    public static EntryPoint[] values() {
        return (EntryPoint[]) $VALUES.clone();
    }
}
