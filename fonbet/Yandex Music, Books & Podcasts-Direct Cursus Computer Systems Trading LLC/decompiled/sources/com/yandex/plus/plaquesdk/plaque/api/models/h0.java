package com.yandex.plus.plaquesdk.plaque.api.models;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class h0 {
    public static final h0 a;
    public static final h0 b;
    public static final h0 c;
    public static final /* synthetic */ h0[] d;

    static {
        h0 h0Var = new h0("REST", 0);
        a = h0Var;
        h0 h0Var2 = new h0("GRAPHQL", 1);
        b = h0Var2;
        h0 h0Var3 = new h0("NONE", 2);
        c = h0Var3;
        d = new h0[]{h0Var, h0Var2, h0Var3};
    }

    public static h0 valueOf(String str) {
        return (h0) Enum.valueOf(h0.class, str);
    }

    public static h0[] values() {
        return (h0[]) d.clone();
    }
}
