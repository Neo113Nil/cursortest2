package defpackage;

import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class rn4 {
    public static final rn4 b;
    public static final /* synthetic */ rn4[] c;
    public static final /* synthetic */ rdb d;
    public final String a;

    static {
        rn4 rn4Var = new rn4("HUAWEI", 0, "HuaweiAppGallery");
        rn4 rn4Var2 = new rn4("XIAOMI", 1, "MiStore");
        rn4 rn4Var3 = new rn4("SAMSUNG", 2, "Samsung");
        rn4 rn4Var4 = new rn4("PALM", 3, "Palm");
        rn4 rn4Var5 = new rn4("GPLAY", 4, "google-play");
        b = rn4Var5;
        rn4[] rn4VarArr = {rn4Var, rn4Var2, rn4Var3, rn4Var4, rn4Var5, new rn4("RUSTORE", 5, "RuStore"), new rn4("DEV", 6, CommonUrlParts.Values.FALSE_INTEGER)};
        c = rn4VarArr;
        d = new rdb(rn4VarArr);
    }

    public rn4(String str, int i, String str2) {
        this.a = str2;
    }

    public static rn4 valueOf(String str) {
        return (rn4) Enum.valueOf(rn4.class, str);
    }

    public static rn4[] values() {
        return (rn4[]) c.clone();
    }
}
