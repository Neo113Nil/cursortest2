package com.yandex.passport.internal.ui.challenge.logout.bottomsheet;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class o1 {
    public static final o1 a;
    public static final o1 b;
    public static final /* synthetic */ o1[] c;

    static {
        o1 o1Var = new o1("ThisApp", 0);
        a = o1Var;
        o1 o1Var2 = new o1("AllAps", 1);
        b = o1Var2;
        c = new o1[]{o1Var, o1Var2};
    }

    public static o1 valueOf(String str) {
        return (o1) Enum.valueOf(o1.class, str);
    }

    public static o1[] values() {
        return (o1[]) c.clone();
    }
}
