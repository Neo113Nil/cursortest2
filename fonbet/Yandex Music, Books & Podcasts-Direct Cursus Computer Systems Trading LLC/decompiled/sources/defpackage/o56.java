package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class o56 {
    public static final o56 a;
    public static final o56 b;
    public static final /* synthetic */ o56[] c;

    static {
        o56 o56Var = new o56("Online", 0);
        a = o56Var;
        o56 o56Var2 = new o56("Offline", 1);
        b = o56Var2;
        c = new o56[]{o56Var, o56Var2};
    }

    public static o56 valueOf(String str) {
        return (o56) Enum.valueOf(o56.class, str);
    }

    public static o56[] values() {
        return (o56[]) c.clone();
    }
}
