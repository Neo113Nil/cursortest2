package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class k22 {
    public static final k22 c;
    public static final k22 d;
    public static final k22 e;
    public static final k22 f;
    public static final k22 g;
    public static final k22 h;
    public static final k22 i;
    public static final /* synthetic */ k22[] j;
    public static final /* synthetic */ rdb k;
    public final Integer a;
    public final Integer b;

    static {
        k22 k22Var = new k22("SIZE_250_MB", 0, 250, 1048576);
        c = k22Var;
        k22 k22Var2 = new k22("SIZE_500_MB", 1, 500, 1048576);
        d = k22Var2;
        k22 k22Var3 = new k22("SIZE_1_GB", 2, 1, 1073741824);
        e = k22Var3;
        k22 k22Var4 = new k22("SIZE_2_GB", 3, 2, 1073741824);
        f = k22Var4;
        k22 k22Var5 = new k22("SIZE_3_GB", 4, 3, 1073741824);
        g = k22Var5;
        k22 k22Var6 = new k22("SIZE_4_GB", 5, 4, 1073741824);
        h = k22Var6;
        k22 k22Var7 = new k22("SIZE_NO_LIMIT", 6, null, null);
        i = k22Var7;
        k22[] k22VarArr = {k22Var, k22Var2, k22Var3, k22Var4, k22Var5, k22Var6, k22Var7};
        j = k22VarArr;
        k = new rdb(k22VarArr);
    }

    public k22(String str, int i2, Integer num, Integer num2) {
        this.a = num;
        this.b = num2;
    }

    public static k22 valueOf(String str) {
        return (k22) Enum.valueOf(k22.class, str);
    }

    public static k22[] values() {
        return (k22[]) j.clone();
    }

    public final Long a() {
        Integer num;
        if (this.a == null || (num = this.b) == null) {
            return null;
        }
        return Long.valueOf(r0.intValue() * num.intValue());
    }
}
