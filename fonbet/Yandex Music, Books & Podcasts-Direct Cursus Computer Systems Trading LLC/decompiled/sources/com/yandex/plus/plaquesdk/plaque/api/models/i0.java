package com.yandex.plus.plaquesdk.plaque.api.models;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class i0 {
    public static final i0 a;
    public static final i0 b;
    public static final i0 c;
    public static final i0 d;
    public static final /* synthetic */ i0[] e;

    static {
        i0 i0Var = new i0("DEFAULT", 0);
        a = i0Var;
        i0 i0Var2 = new i0("CONDITIONAL", 1);
        b = i0Var2;
        i0 i0Var3 = new i0("PREFETCH", 2);
        c = i0Var3;
        i0 i0Var4 = new i0("FALLBACK", 3);
        d = i0Var4;
        e = new i0[]{i0Var, i0Var2, i0Var3, i0Var4};
    }

    public static i0 valueOf(String str) {
        return (i0) Enum.valueOf(i0.class, str);
    }

    public static i0[] values() {
        return (i0[]) e.clone();
    }
}
