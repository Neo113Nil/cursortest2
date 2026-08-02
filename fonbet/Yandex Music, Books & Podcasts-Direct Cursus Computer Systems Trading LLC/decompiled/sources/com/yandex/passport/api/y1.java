package com.yandex.passport.api;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class y1 {
    public static final y1 a;
    public static final y1 b;
    public static final y1 c;
    public static final y1 d;
    public static final /* synthetic */ y1[] e;

    static {
        y1 y1Var = new y1("LIGHT", 0);
        a = y1Var;
        y1 y1Var2 = new y1("DARK", 1);
        b = y1Var2;
        y1 y1Var3 = new y1("LIGHT_CUSTOM", 2);
        c = y1Var3;
        y1 y1Var4 = new y1("FOLLOW_SYSTEM", 3);
        d = y1Var4;
        e = new y1[]{y1Var, y1Var2, y1Var3, y1Var4};
    }

    public static y1 valueOf(String str) {
        return (y1) Enum.valueOf(y1.class, str);
    }

    public static y1[] values() {
        return (y1[]) e.clone();
    }
}
