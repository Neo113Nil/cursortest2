package com.yandex.passport.api;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class w0 {
    public static final w0 a;
    public static final w0 b;
    public static final w0 c;
    public static final w0 d;
    public static final w0 e;
    public static final w0 f;
    public static final w0 g;
    public static final w0 h;
    public static final w0 i;
    public static final w0 j;
    public static final w0 k;
    public static final w0 l;
    public static final w0 m;
    public static final w0 n;
    public static final /* synthetic */ w0[] o;

    static {
        w0 w0Var = new w0("CAROUSEL", 0);
        a = w0Var;
        w0 w0Var2 = new w0("SOCIAL", 1);
        b = w0Var2;
        w0 w0Var3 = new w0("PASSWORD", 2);
        c = w0Var3;
        w0 w0Var4 = new w0("TOTP", 3);
        d = w0Var4;
        w0 w0Var5 = new w0("REGISTRATION", 4);
        e = w0Var5;
        w0 w0Var6 = new w0("PHONISH", 5);
        f = w0Var6;
        w0 w0Var7 = new w0("AUTOLOGIN", 6);
        g = w0Var7;
        w0 w0Var8 = new w0("EMPTY", 7);
        h = w0Var8;
        w0 w0Var9 = new w0("MAILISH_GIMAP", 8);
        i = w0Var9;
        w0 w0Var10 = new w0("MAGIC_LINK", 9);
        j = w0Var10;
        w0 w0Var11 = new w0("TRACK_ID", 10);
        w0 w0Var12 = new w0("QR_ON_TV", 11);
        k = w0Var12;
        w0 w0Var13 = new w0("SMS", 12);
        l = w0Var13;
        w0 w0Var14 = new w0("LOGIN_RESTORE", 13);
        m = w0Var14;
        w0 w0Var15 = new w0("REG_NEO_PHONISH", 14);
        n = w0Var15;
        o = new w0[]{w0Var, w0Var2, w0Var3, w0Var4, w0Var5, w0Var6, w0Var7, w0Var8, w0Var9, w0Var10, w0Var11, w0Var12, w0Var13, w0Var14, w0Var15};
    }

    public static w0 valueOf(String str) {
        return (w0) Enum.valueOf(w0.class, str);
    }

    public static w0[] values() {
        return (w0[]) o.clone();
    }
}
