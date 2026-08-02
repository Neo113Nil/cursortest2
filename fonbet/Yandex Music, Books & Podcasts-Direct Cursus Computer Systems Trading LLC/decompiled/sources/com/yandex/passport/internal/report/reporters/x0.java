package com.yandex.passport.internal.report.reporters;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class x0 {
    public static final x0 a;
    public static final x0 b;
    public static final x0 c;
    public static final x0 d;
    public static final x0 e;
    public static final x0 f;
    public static final x0 g;
    public static final /* synthetic */ x0[] h;

    /* JADX INFO: Fake field, exist only in values array */
    x0 EF0;

    static {
        x0 x0Var = new x0("UNKNOWN", 0);
        x0 x0Var2 = new x0("REMOVE_ACCOUNT_API", 1);
        a = x0Var2;
        x0 x0Var3 = new x0("REMOVE_ACCOUNT_EXPLICITLY_API", 2);
        b = x0Var3;
        x0 x0Var4 = new x0("SSO_ACCOUNT_SYNC", 3);
        c = x0Var4;
        x0 x0Var5 = new x0("DELETE_ACCOUNT_USE_CASE", 4);
        d = x0Var5;
        x0 x0Var6 = new x0("AUTHENTICATOR", 5);
        e = x0Var6;
        x0 x0Var7 = new x0("Rotation", 6);
        f = x0Var7;
        x0 x0Var8 = new x0("Quarantine", 7);
        g = x0Var8;
        h = new x0[]{x0Var, x0Var2, x0Var3, x0Var4, x0Var5, x0Var6, x0Var7, x0Var8};
    }

    public static x0 valueOf(String str) {
        return (x0) Enum.valueOf(x0.class, str);
    }

    public static x0[] values() {
        return (x0[]) h.clone();
    }

    public final String a() {
        return "Master token revoked. Place: " + name() + '.';
    }
}
