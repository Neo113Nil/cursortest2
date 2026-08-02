package com.yandex.passport.api;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class v1 {
    public static final v1 a;
    public static final /* synthetic */ v1[] b;

    /* JADX INFO: Fake field, exist only in values array */
    v1 EF0;

    static {
        v1 v1Var = new v1("Portrait", 0);
        v1 v1Var2 = new v1("Landscape", 1);
        v1 v1Var3 = new v1("None", 2);
        a = v1Var3;
        b = new v1[]{v1Var, v1Var2, v1Var3};
    }

    public static v1 valueOf(String str) {
        return (v1) Enum.valueOf(v1.class, str);
    }

    public static v1[] values() {
        return (v1[]) b.clone();
    }
}
