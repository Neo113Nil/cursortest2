package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class be6 {
    public static final kjn a;
    public static final be6 b;
    public static final be6 c;
    public static final be6 d;
    public static final be6 e;
    public static final /* synthetic */ be6[] f;
    public static final /* synthetic */ rdb g;

    static {
        be6 be6Var = new be6("TRACK", 0);
        b = be6Var;
        be6 be6Var2 = new be6("SET", 1);
        c = be6Var2;
        be6 be6Var3 = new be6("TRAILER", 2);
        d = be6Var3;
        be6 be6Var4 = new be6("NON_MUSIC", 3);
        e = be6Var4;
        be6[] be6VarArr = {be6Var, be6Var2, be6Var3, be6Var4};
        f = be6VarArr;
        g = new rdb(be6VarArr);
        a = new kjn(18);
    }

    public static be6 valueOf(String str) {
        return (be6) Enum.valueOf(be6.class, str);
    }

    public static be6[] values() {
        return (be6[]) f.clone();
    }
}
