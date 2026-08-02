package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class k48 {
    public static final k48 a;
    public static final k48 b;
    public static final k48 c;
    public static final /* synthetic */ k48[] d;

    static {
        k48 k48Var = new k48("Vertical", 0);
        a = k48Var;
        k48 k48Var2 = new k48("Horizontal", 1);
        b = k48Var2;
        k48 k48Var3 = new k48("Both", 2);
        c = k48Var3;
        d = new k48[]{k48Var, k48Var2, k48Var3};
    }

    public static k48 valueOf(String str) {
        return (k48) Enum.valueOf(k48.class, str);
    }

    public static k48[] values() {
        return (k48[]) d.clone();
    }
}
