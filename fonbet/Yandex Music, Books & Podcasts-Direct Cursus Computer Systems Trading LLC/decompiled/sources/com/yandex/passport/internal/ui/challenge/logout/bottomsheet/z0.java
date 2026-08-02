package com.yandex.passport.internal.ui.challenge.logout.bottomsheet;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class z0 {
    public static final z0 a;
    public static final z0 b;
    public static final /* synthetic */ z0[] c;

    static {
        z0 z0Var = new z0("THIS", 0);
        a = z0Var;
        z0 z0Var2 = new z0("ALL", 1);
        b = z0Var2;
        c = new z0[]{z0Var, z0Var2};
    }

    public static z0 valueOf(String str) {
        return (z0) Enum.valueOf(z0.class, str);
    }

    public static z0[] values() {
        return (z0[]) c.clone();
    }
}
