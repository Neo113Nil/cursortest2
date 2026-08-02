package com.yandex.plus.home.plaque.repository.graphql.cache.dto;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class s1 {
    public static final s1 a;
    public static final s1 b;
    public static final s1 c;
    public static final s1 d;
    public static final /* synthetic */ s1[] e;

    static {
        s1 s1Var = new s1("BOTTOM_LEFT", 0);
        a = s1Var;
        s1 s1Var2 = new s1("BOTTOM_RIGHT", 1);
        b = s1Var2;
        s1 s1Var3 = new s1("TOP_LEFT", 2);
        c = s1Var3;
        s1 s1Var4 = new s1("TOP_RIGHT", 3);
        d = s1Var4;
        e = new s1[]{s1Var, s1Var2, s1Var3, s1Var4};
    }

    public static s1 valueOf(String str) {
        return (s1) Enum.valueOf(s1.class, str);
    }

    public static s1[] values() {
        return (s1[]) e.clone();
    }
}
