package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class j48 {
    public static final j48 a;
    public static final j48 b;
    public static final j48 c;
    public static final /* synthetic */ j48[] d;

    static {
        j48 j48Var = new j48("BEFORE", 0);
        a = j48Var;
        j48 j48Var2 = new j48("ON", 1);
        b = j48Var2;
        j48 j48Var3 = new j48("AFTER", 2);
        c = j48Var3;
        d = new j48[]{j48Var, j48Var2, j48Var3};
    }

    public static j48 valueOf(String str) {
        return (j48) Enum.valueOf(j48.class, str);
    }

    public static j48[] values() {
        return (j48[]) d.clone();
    }
}
