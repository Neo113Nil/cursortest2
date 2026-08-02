package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class bk2 {
    public static final bk2 a;
    public static final bk2 b;
    public static final /* synthetic */ bk2[] c;

    static {
        bk2 bk2Var = new bk2("EXPONENTIAL", 0);
        a = bk2Var;
        bk2 bk2Var2 = new bk2("LINEAR", 1);
        b = bk2Var2;
        c = new bk2[]{bk2Var, bk2Var2};
    }

    public static bk2 valueOf(String str) {
        return (bk2) Enum.valueOf(bk2.class, str);
    }

    public static bk2[] values() {
        return (bk2[]) c.clone();
    }
}
