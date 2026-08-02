package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class ff3 {
    public static final ff3 a;
    public static final ff3 b;
    public static final /* synthetic */ ff3[] c;

    static {
        ff3 ff3Var = new ff3("Hidden", 0);
        a = ff3Var;
        ff3 ff3Var2 = new ff3("ReadyToShow", 1);
        b = ff3Var2;
        c = new ff3[]{ff3Var, ff3Var2};
    }

    public static ff3 valueOf(String str) {
        return (ff3) Enum.valueOf(ff3.class, str);
    }

    public static ff3[] values() {
        return (ff3[]) c.clone();
    }
}
