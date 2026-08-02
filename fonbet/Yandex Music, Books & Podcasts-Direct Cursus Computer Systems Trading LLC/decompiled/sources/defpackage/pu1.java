package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class pu1 {
    public static final pu1 a;
    public static final pu1 b;
    public static final pu1 c;
    public static final pu1 d;
    public static final pu1 e;
    public static final /* synthetic */ pu1[] f;

    static {
        pu1 pu1Var = new pu1("LIKE", 0);
        a = pu1Var;
        pu1 pu1Var2 = new pu1("UNDO_LIKE", 1);
        b = pu1Var2;
        pu1 pu1Var3 = new pu1("DISLIKE", 2);
        c = pu1Var3;
        pu1 pu1Var4 = new pu1("UNDO_DISLIKE", 3);
        d = pu1Var4;
        pu1 pu1Var5 = new pu1("NONE", 4);
        e = pu1Var5;
        f = new pu1[]{pu1Var, pu1Var2, pu1Var3, pu1Var4, pu1Var5};
    }

    public static pu1 valueOf(String str) {
        return (pu1) Enum.valueOf(pu1.class, str);
    }

    public static pu1[] values() {
        return (pu1[]) f.clone();
    }
}
