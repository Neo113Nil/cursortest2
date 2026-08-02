package com.yandex.passport.sloth.ui;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class e1 {
    public static final e1 a;
    public static final e1 b;
    public static final e1 c;
    public static final /* synthetic */ e1[] d;

    static {
        e1 e1Var = new e1("BACK", 0);
        a = e1Var;
        e1 e1Var2 = new e1("CANCEL", 1);
        b = e1Var2;
        e1 e1Var3 = new e1("FINISH_LOGIN", 2);
        c = e1Var3;
        d = new e1[]{e1Var, e1Var2, e1Var3};
    }

    public static e1 valueOf(String str) {
        return (e1) Enum.valueOf(e1.class, str);
    }

    public static e1[] values() {
        return (e1[]) d.clone();
    }
}
