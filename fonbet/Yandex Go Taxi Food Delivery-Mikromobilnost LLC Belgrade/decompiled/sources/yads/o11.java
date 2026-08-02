package yads;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class o11 {
    public static final o11 b;
    public static final o11 c;
    public static final /* synthetic */ o11[] d;

    static {
        o11 o11Var = new o11("PROD", 0);
        b = o11Var;
        o11 o11Var2 = new o11("PREDEFINED", 1);
        c = o11Var2;
        d = new o11[]{o11Var, o11Var2};
    }

    public static o11 valueOf(String str) {
        return (o11) Enum.valueOf(o11.class, str);
    }

    public static o11[] values() {
        return (o11[]) d.clone();
    }
}
