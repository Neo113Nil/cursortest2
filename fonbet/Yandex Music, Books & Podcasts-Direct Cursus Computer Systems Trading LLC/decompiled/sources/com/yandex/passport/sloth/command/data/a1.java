package com.yandex.passport.sloth.command.data;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class a1 {
    public static final a1 a;
    public static final a1 b;
    public static final a1 c;
    public static final a1 d;
    public static final a1 e;
    public static final a1 f;
    public static final a1 g;
    public static final a1 h;
    public static final a1 i;
    public static final /* synthetic */ a1[] j;

    static {
        a1 a1Var = new a1("PORTAL", 0);
        a = a1Var;
        a1 a1Var2 = new a1("LITE", 1);
        b = a1Var2;
        a1 a1Var3 = new a1("SOCIAL", 2);
        c = a1Var3;
        a1 a1Var4 = new a1("PDD", 3);
        d = a1Var4;
        a1 a1Var5 = new a1("PHONISH", 4);
        e = a1Var5;
        a1 a1Var6 = new a1("MAILISH", 5);
        f = a1Var6;
        a1 a1Var7 = new a1("MUSIC_PHONISH", 6);
        g = a1Var7;
        a1 a1Var8 = new a1("CHILDISH", 7);
        h = a1Var8;
        a1 a1Var9 = new a1("UNDEFINED", 8);
        i = a1Var9;
        j = new a1[]{a1Var, a1Var2, a1Var3, a1Var4, a1Var5, a1Var6, a1Var7, a1Var8, a1Var9};
    }

    public static a1 valueOf(String str) {
        return (a1) Enum.valueOf(a1.class, str);
    }

    public static a1[] values() {
        return (a1[]) j.clone();
    }
}
