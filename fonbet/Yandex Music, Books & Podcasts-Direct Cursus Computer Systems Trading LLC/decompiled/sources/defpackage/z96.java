package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class z96 {
    public static final z96 a;
    public static final z96 b;
    public static final z96 c;
    public static final z96 d;
    public static final /* synthetic */ z96[] e;

    static {
        z96 z96Var = new z96("FIXED", 0);
        a = z96Var;
        z96 z96Var2 = new z96("WRAP_CONTENT", 1);
        b = z96Var2;
        z96 z96Var3 = new z96("MATCH_CONSTRAINT", 2);
        c = z96Var3;
        z96 z96Var4 = new z96("MATCH_PARENT", 3);
        d = z96Var4;
        e = new z96[]{z96Var, z96Var2, z96Var3, z96Var4};
    }

    public static z96 valueOf(String str) {
        return (z96) Enum.valueOf(z96.class, str);
    }

    public static z96[] values() {
        return (z96[]) e.clone();
    }
}
