package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class qu1 {
    public static final qu1 a;
    public static final qu1 b;
    public static final qu1 c;
    public static final qu1 d;
    public static final /* synthetic */ qu1[] e;

    static {
        qu1 qu1Var = new qu1("Like", 0);
        a = qu1Var;
        qu1 qu1Var2 = new qu1("UndoLike", 1);
        b = qu1Var2;
        qu1 qu1Var3 = new qu1("Dislike", 2);
        c = qu1Var3;
        qu1 qu1Var4 = new qu1("UndoDislike", 3);
        d = qu1Var4;
        e = new qu1[]{qu1Var, qu1Var2, qu1Var3, qu1Var4};
    }

    public static qu1 valueOf(String str) {
        return (qu1) Enum.valueOf(qu1.class, str);
    }

    public static qu1[] values() {
        return (qu1[]) e.clone();
    }
}
