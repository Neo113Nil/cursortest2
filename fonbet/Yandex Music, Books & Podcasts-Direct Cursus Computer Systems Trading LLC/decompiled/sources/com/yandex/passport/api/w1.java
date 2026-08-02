package com.yandex.passport.api;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class w1 {
    public static final w1 a;
    public static final w1 b;
    public static final w1 c;
    public static final w1 d;
    public static final w1 e;
    public static final w1 f;
    public static final w1 g;
    public static final w1 h;
    public static final w1 i;
    public static final w1 j;
    public static final w1 k;
    public static final w1 l;
    public static final w1 m;
    public static final w1 n;
    public static final /* synthetic */ w1[] o;

    static {
        w1 w1Var = new w1("SOCIAL_VKONTAKTE", 0);
        a = w1Var;
        w1 w1Var2 = new w1("SOCIAL_FACEBOOK", 1);
        b = w1Var2;
        w1 w1Var3 = new w1("SOCIAL_TWITTER", 2);
        c = w1Var3;
        w1 w1Var4 = new w1("SOCIAL_ODNOKLASSNIKI", 3);
        d = w1Var4;
        w1 w1Var5 = new w1("SOCIAL_MAILRU", 4);
        e = w1Var5;
        w1 w1Var6 = new w1("SOCIAL_GOOGLE", 5);
        f = w1Var6;
        w1 w1Var7 = new w1("SOCIAL_ESIA", 6);
        g = w1Var7;
        w1 w1Var8 = new w1("SOCIAL_TV_1001", 7);
        h = w1Var8;
        w1 w1Var9 = new w1("MAILISH_GOOGLE", 8);
        i = w1Var9;
        w1 w1Var10 = new w1("MAILISH_OUTLOOK", 9);
        j = w1Var10;
        w1 w1Var11 = new w1("MAILISH_MAILRU", 10);
        k = w1Var11;
        w1 w1Var12 = new w1("MAILISH_YAHOO", 11);
        l = w1Var12;
        w1 w1Var13 = new w1("MAILISH_RAMBLER", 12);
        m = w1Var13;
        w1 w1Var14 = new w1("MAILISH_OTHER", 13);
        n = w1Var14;
        o = new w1[]{w1Var, w1Var2, w1Var3, w1Var4, w1Var5, w1Var6, w1Var7, w1Var8, w1Var9, w1Var10, w1Var11, w1Var12, w1Var13, w1Var14};
    }

    public static w1 valueOf(String str) {
        return (w1) Enum.valueOf(w1.class, str);
    }

    public static w1[] values() {
        return (w1[]) o.clone();
    }
}
