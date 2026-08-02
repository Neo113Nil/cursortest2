package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class t34 {
    public static final t34 a;
    public static final t34 b;
    public static final t34 c;
    public static final /* synthetic */ t34[] d;

    static {
        t34 t34Var = new t34("LIKED", 0);
        a = t34Var;
        t34 t34Var2 = new t34("CREATED", 1);
        b = t34Var2;
        t34 t34Var3 = new t34("MODIFIED", 2);
        c = t34Var3;
        d = new t34[]{t34Var, t34Var2, t34Var3};
    }

    public static t34 valueOf(String str) {
        return (t34) Enum.valueOf(t34.class, str);
    }

    public static t34[] values() {
        return (t34[]) d.clone();
    }
}
