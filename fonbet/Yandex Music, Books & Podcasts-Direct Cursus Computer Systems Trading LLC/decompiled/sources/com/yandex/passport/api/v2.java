package com.yandex.passport.api;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class v2 {
    public static final v2 a;
    public static final v2 b;
    public static final v2 c;
    public static final /* synthetic */ v2[] d;

    static {
        v2 v2Var = new v2("FCM", 0);
        a = v2Var;
        v2 v2Var2 = new v2("HMS", 1);
        b = v2Var2;
        v2 v2Var3 = new v2("RuStore", 2);
        c = v2Var3;
        d = new v2[]{v2Var, v2Var2, v2Var3};
    }

    public static v2 valueOf(String str) {
        return (v2) Enum.valueOf(v2.class, str);
    }

    public static v2[] values() {
        return (v2[]) d.clone();
    }
}
