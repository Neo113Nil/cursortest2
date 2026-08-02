package com.plaid.internal;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesList;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: com.plaid.internal.v6, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class EnumC0311v6 {
    public static final EnumC0311v6 ENQUEUE;
    public static final EnumC0311v6 ENQUEUE_AND_FLUSH;
    public static final EnumC0311v6 NO_ENQUEUE;
    public static final EnumC0311v6 UNKNOWN;
    public static final /* synthetic */ EnumC0311v6[] b;
    public static final /* synthetic */ EnumEntries c;
    public final String a;

    static {
        EnumC0311v6 enumC0311v6 = new EnumC0311v6("ENQUEUE", 0, "QUEUE_BEHAVIOR_ENQUEUE");
        ENQUEUE = enumC0311v6;
        EnumC0311v6 enumC0311v62 = new EnumC0311v6("ENQUEUE_AND_FLUSH", 1, "QUEUE_BEHAVIOR_ENQUEUE_AND_FLUSH");
        ENQUEUE_AND_FLUSH = enumC0311v62;
        EnumC0311v6 enumC0311v63 = new EnumC0311v6("NO_ENQUEUE", 2, "QUEUE_BEHAVIOR_NO_ENQUEUE");
        NO_ENQUEUE = enumC0311v63;
        EnumC0311v6 enumC0311v64 = new EnumC0311v6("UNKNOWN", 3, "QUEUE_BEHAVIOR_UNKNOWN");
        UNKNOWN = enumC0311v64;
        EnumC0311v6[] enumC0311v6Arr = {enumC0311v6, enumC0311v62, enumC0311v63, enumC0311v64};
        b = enumC0311v6Arr;
        c = new EnumEntriesList(enumC0311v6Arr);
    }

    public EnumC0311v6(String str, int i, String str2) {
        this.a = str2;
    }

    public static EnumEntries getEntries() {
        return c;
    }

    public static EnumC0311v6 valueOf(String str) {
        return (EnumC0311v6) Enum.valueOf(EnumC0311v6.class, str);
    }

    public static EnumC0311v6[] values() {
        return (EnumC0311v6[]) b.clone();
    }

    public final String getProtoString() {
        return this.a;
    }
}
