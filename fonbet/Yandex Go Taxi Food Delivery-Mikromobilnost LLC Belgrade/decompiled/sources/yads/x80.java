package yads;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class x80 {
    public static final x80 b;
    public static final x80 c;
    public static final x80 d;
    public static final /* synthetic */ x80[] e;

    static {
        x80 x80Var = new x80("SUCCESS", 0);
        b = x80Var;
        x80 x80Var2 = new x80("WARNING", 1);
        c = x80Var2;
        x80 x80Var3 = new x80("ERROR", 2);
        d = x80Var3;
        e = new x80[]{x80Var, x80Var2, x80Var3};
    }

    public static x80 valueOf(String str) {
        return (x80) Enum.valueOf(x80.class, str);
    }

    public static x80[] values() {
        return (x80[]) e.clone();
    }
}
