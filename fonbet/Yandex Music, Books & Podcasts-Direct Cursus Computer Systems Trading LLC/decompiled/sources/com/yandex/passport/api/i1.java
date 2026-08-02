package com.yandex.passport.api;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class i1 {
    public static final i1 a;
    public static final i1 b;
    public static final /* synthetic */ i1[] c;

    static {
        i1 i1Var = new i1("INCLUDE", 0);
        a = i1Var;
        i1 i1Var2 = new i1("EXCLUDE", 1);
        b = i1Var2;
        c = new i1[]{i1Var, i1Var2};
    }

    public static i1 valueOf(String str) {
        return (i1) Enum.valueOf(i1.class, str);
    }

    public static i1[] values() {
        return (i1[]) c.clone();
    }
}
