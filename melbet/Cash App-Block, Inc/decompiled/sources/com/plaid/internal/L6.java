package com.plaid.internal;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesList;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class L6 {
    public static final L6 ALL;
    public static final L6 ERRORS_ONLY;
    public static final L6 NONE;
    public static final /* synthetic */ L6[] a;
    public static final /* synthetic */ EnumEntries b;

    static {
        L6 l6 = new L6("NONE", 0);
        NONE = l6;
        L6 l62 = new L6("ERRORS_ONLY", 1);
        ERRORS_ONLY = l62;
        L6 l63 = new L6("ALL", 2);
        ALL = l63;
        L6[] l6Arr = {l6, l62, l63};
        a = l6Arr;
        b = new EnumEntriesList(l6Arr);
    }

    public L6(String str, int i) {
    }

    public static EnumEntries getEntries() {
        return b;
    }

    public static L6 valueOf(String str) {
        return (L6) Enum.valueOf(L6.class, str);
    }

    public static L6[] values() {
        return (L6[]) a.clone();
    }
}
