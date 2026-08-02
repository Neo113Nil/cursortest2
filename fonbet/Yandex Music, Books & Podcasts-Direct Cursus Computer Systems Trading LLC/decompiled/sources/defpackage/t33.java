package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class t33 {
    public static final t33 a;
    public static final t33 b;
    public static final t33 c;
    public static final /* synthetic */ t33[] d;

    static {
        t33 t33Var = new t33("NETWORK", 0);
        a = t33Var;
        t33 t33Var2 = new t33("DISK", 1);
        b = t33Var2;
        t33 t33Var3 = new t33("MEMORY", 2);
        c = t33Var3;
        d = new t33[]{t33Var, t33Var2, t33Var3};
    }

    public static t33 valueOf(String str) {
        return (t33) Enum.valueOf(t33.class, str);
    }

    public static t33[] values() {
        return (t33[]) d.clone();
    }
}
