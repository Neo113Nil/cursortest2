package com.yandex.passport.api;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class i2 {
    public static final i2 a;
    public static final i2 b;
    public static final /* synthetic */ i2[] c;

    static {
        i2 i2Var = new i2("Allowed", 0);
        a = i2Var;
        i2 i2Var2 = new i2("Blocked", 1);
        b = i2Var2;
        c = new i2[]{i2Var, i2Var2};
    }

    public static i2 valueOf(String str) {
        return (i2) Enum.valueOf(i2.class, str);
    }

    public static i2[] values() {
        return (i2[]) c.clone();
    }
}
