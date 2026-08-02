package com.plaid.internal;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesList;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class J6 {
    public static final J6 DEBUG;
    public static final J6 ERROR;
    public static final J6 INFO;
    public static final J6 WARN;
    public static final /* synthetic */ J6[] a;
    public static final /* synthetic */ EnumEntries b;

    static {
        J6 j6 = new J6("DEBUG", 0);
        DEBUG = j6;
        J6 j62 = new J6("INFO", 1);
        INFO = j62;
        J6 j63 = new J6("WARN", 2);
        WARN = j63;
        J6 j64 = new J6("ERROR", 3);
        ERROR = j64;
        J6[] j6Arr = {j6, j62, j63, j64};
        a = j6Arr;
        b = new EnumEntriesList(j6Arr);
    }

    public J6(String str, int i) {
    }

    public static EnumEntries getEntries() {
        return b;
    }

    public static J6 valueOf(String str) {
        return (J6) Enum.valueOf(J6.class, str);
    }

    public static J6[] values() {
        return (J6[]) a.clone();
    }
}
