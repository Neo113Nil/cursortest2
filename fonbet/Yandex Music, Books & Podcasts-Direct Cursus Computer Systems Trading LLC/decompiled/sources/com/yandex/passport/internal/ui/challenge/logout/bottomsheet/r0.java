package com.yandex.passport.internal.ui.challenge.logout.bottomsheet;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class r0 {
    public static final r0 a;
    public static final r0 b;
    public static final r0 c;
    public static final r0 d;
    public static final r0 e;
    public static final /* synthetic */ r0[] f;

    static {
        r0 r0Var = new r0("COLLAPSE", 0);
        a = r0Var;
        r0 r0Var2 = new r0("CANCEL", 1);
        b = r0Var2;
        r0 r0Var3 = new r0("LOGOUT_THIS_APP", 2);
        c = r0Var3;
        r0 r0Var4 = new r0("LOGOUT_ALL_APPS", 3);
        d = r0Var4;
        r0 r0Var5 = new r0("DELETE_ACCOUNT", 4);
        e = r0Var5;
        f = new r0[]{r0Var, r0Var2, r0Var3, r0Var4, r0Var5};
    }

    public static r0 valueOf(String str) {
        return (r0) Enum.valueOf(r0.class, str);
    }

    public static r0[] values() {
        return (r0[]) f.clone();
    }
}
