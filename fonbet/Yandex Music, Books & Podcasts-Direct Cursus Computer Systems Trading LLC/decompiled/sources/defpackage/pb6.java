package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class pb6 {
    public static final pb6 a;
    public static final pb6 b;
    public static final /* synthetic */ pb6[] c;

    static {
        pb6 pb6Var = new pb6("VIEW_APPEAR", 0);
        a = pb6Var;
        pb6 pb6Var2 = new pb6("VIEW_DISAPPEAR", 1);
        b = pb6Var2;
        c = new pb6[]{pb6Var, pb6Var2};
    }

    public static pb6 valueOf(String str) {
        return (pb6) Enum.valueOf(pb6.class, str);
    }

    public static pb6[] values() {
        return (pb6[]) c.clone();
    }
}
