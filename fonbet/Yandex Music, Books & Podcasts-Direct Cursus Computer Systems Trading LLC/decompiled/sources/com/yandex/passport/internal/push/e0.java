package com.yandex.passport.internal.push;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class e0 {
    public static final e0 a;
    public static final /* synthetic */ e0[] b;

    static {
        e0 e0Var = new e0("DEFAULT", 0);
        a = e0Var;
        b = new e0[]{e0Var, new e0("ID", 1), new e0("GREEN_ID", 2), new e0("GREEN_LOCK", 3)};
    }

    public static e0 valueOf(String str) {
        return (e0) Enum.valueOf(e0.class, str);
    }

    public static e0[] values() {
        return (e0[]) b.clone();
    }
}
