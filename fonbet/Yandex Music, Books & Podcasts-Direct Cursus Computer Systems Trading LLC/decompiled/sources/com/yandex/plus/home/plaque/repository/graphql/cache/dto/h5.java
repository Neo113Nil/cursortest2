package com.yandex.plus.home.plaque.repository.graphql.cache.dto;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class h5 {
    public static final h5 a;
    public static final h5 b;
    public static final /* synthetic */ h5[] c;

    static {
        h5 h5Var = new h5("HORIZONTAL", 0);
        a = h5Var;
        h5 h5Var2 = new h5("VERTICAL", 1);
        b = h5Var2;
        c = new h5[]{h5Var, h5Var2};
    }

    public static h5 valueOf(String str) {
        return (h5) Enum.valueOf(h5.class, str);
    }

    public static h5[] values() {
        return (h5[]) c.clone();
    }
}
