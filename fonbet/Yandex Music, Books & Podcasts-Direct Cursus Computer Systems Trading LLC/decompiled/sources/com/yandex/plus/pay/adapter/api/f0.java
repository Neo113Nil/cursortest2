package com.yandex.plus.pay.adapter.api;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class f0 {
    public static final f0 a;
    public static final f0 b;
    public static final f0 c;
    public static final f0 d;
    public static final f0 e;
    public static final f0 f;
    public static final f0 g;
    public static final f0 h;
    public static final f0 i;
    public static final f0 j;
    public static final f0 k;
    public static final f0 l;
    public static final f0 m;
    public static final f0 n;
    public static final f0 o;
    public static final /* synthetic */ f0[] p;

    static {
        f0 f0Var = new f0("PAYMENT_TIMEOUT", 0);
        a = f0Var;
        f0 f0Var2 = new f0("BLACKLISTED", 1);
        b = f0Var2;
        f0 f0Var3 = new f0("EXPIRED_CARD", 2);
        c = f0Var3;
        f0 f0Var4 = new f0("USER_CANCELLED", 3);
        d = f0Var4;
        f0 f0Var5 = new f0("RESTRICTED_CARD", 4);
        e = f0Var5;
        f0 f0Var6 = new f0("FAIL_3DS", 5);
        f = f0Var6;
        f0 f0Var7 = new f0("NOT_ENOUGH_FUNDS", 6);
        g = f0Var7;
        f0 f0Var8 = new f0("INVALID_XRF_TOKEN", 7);
        h = f0Var8;
        f0 f0Var9 = new f0("OPERATION_CANCELLED", 8);
        i = f0Var9;
        f0 f0Var10 = new f0("AUTH_REJECT", 9);
        j = f0Var10;
        f0 f0Var11 = new f0("TIMEOUT_NO_SUCCESS", 10);
        k = f0Var11;
        f0 f0Var12 = new f0("TRANSACTION_NOT_PERMITTED", 11);
        l = f0Var12;
        f0 f0Var13 = new f0("LIMIT_EXCEEDED", 12);
        m = f0Var13;
        f0 f0Var14 = new f0("FAIL_PAYMENT_PARSING", 13);
        f0 f0Var15 = new f0("UNEXPECTED", 14);
        n = f0Var15;
        f0 f0Var16 = new f0("UNKNOWN", 15);
        o = f0Var16;
        p = new f0[]{f0Var, f0Var2, f0Var3, f0Var4, f0Var5, f0Var6, f0Var7, f0Var8, f0Var9, f0Var10, f0Var11, f0Var12, f0Var13, f0Var14, f0Var15, f0Var16};
    }

    public static f0 valueOf(String str) {
        return (f0) Enum.valueOf(f0.class, str);
    }

    public static f0[] values() {
        return (f0[]) p.clone();
    }
}
