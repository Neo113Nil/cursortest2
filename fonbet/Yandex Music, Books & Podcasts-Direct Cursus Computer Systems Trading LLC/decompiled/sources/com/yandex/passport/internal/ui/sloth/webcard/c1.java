package com.yandex.passport.internal.ui.sloth.webcard;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class c1 {
    public static final c1 a;
    public static final c1 b;
    public static final c1 c;
    public static final /* synthetic */ c1[] d;

    static {
        c1 c1Var = new c1("Top", 0);
        a = c1Var;
        c1 c1Var2 = new c1("Mid", 1);
        b = c1Var2;
        c1 c1Var3 = new c1("Bottom", 2);
        c = c1Var3;
        d = new c1[]{c1Var, c1Var2, c1Var3};
    }

    public static c1 valueOf(String str) {
        return (c1) Enum.valueOf(c1.class, str);
    }

    public static c1[] values() {
        return (c1[]) d.clone();
    }
}
