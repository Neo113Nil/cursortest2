package com.yandex.passport.api;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class b2 {
    public static final b2 a;
    public static final b2 b;
    public static final b2 c;
    public static final b2 d;
    public static final b2 e;
    public static final b2 f;
    public static final /* synthetic */ b2[] g;

    static {
        b2 b2Var = new b2("BACKEND", 0);
        a = b2Var;
        b2 b2Var2 = new b2("FRONTEND", 1);
        b = b2Var2;
        b2 b2Var3 = new b2("WEBAM", 2);
        c = b2Var3;
        b2 b2Var4 = new b2("SOCIAL", 3);
        d = b2Var4;
        b2 b2Var5 = new b2("APP_LINK", 4);
        e = b2Var5;
        b2 b2Var6 = new b2("FRONTEND_ID", 5);
        f = b2Var6;
        g = new b2[]{b2Var, b2Var2, b2Var3, b2Var4, b2Var5, b2Var6};
    }

    public static b2 valueOf(String str) {
        return (b2) Enum.valueOf(b2.class, str);
    }

    public static b2[] values() {
        return (b2[]) g.clone();
    }
}
