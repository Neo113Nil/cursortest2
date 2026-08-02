package yads;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class jg0 {
    public static final jg0 b;
    public static final jg0 c;
    public static final jg0 d;
    public static final /* synthetic */ jg0[] e;

    static {
        jg0 jg0Var = new jg0("PHONE", 0);
        b = jg0Var;
        jg0 jg0Var2 = new jg0("TABLET", 1);
        c = jg0Var2;
        jg0 jg0Var3 = new jg0("TV", 2);
        d = jg0Var3;
        e = new jg0[]{jg0Var, jg0Var2, jg0Var3};
    }

    public static jg0 valueOf(String str) {
        return (jg0) Enum.valueOf(jg0.class, str);
    }

    public static jg0[] values() {
        return (jg0[]) e.clone();
    }
}
