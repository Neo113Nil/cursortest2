package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class un0 {
    public static final un0 a;
    public static final un0 b;
    public static final un0 c;
    public static final un0 d;
    public static final un0 e;
    public static final un0 f;
    public static final un0 g;
    public static final /* synthetic */ un0[] h;

    static {
        un0 un0Var = new un0("Paragraph", 0);
        a = un0Var;
        un0 un0Var2 = new un0("Span", 1);
        b = un0Var2;
        un0 un0Var3 = new un0("VerbatimTts", 2);
        c = un0Var3;
        un0 un0Var4 = new un0("Url", 3);
        d = un0Var4;
        un0 un0Var5 = new un0("Link", 4);
        e = un0Var5;
        un0 un0Var6 = new un0("Clickable", 5);
        f = un0Var6;
        un0 un0Var7 = new un0("String", 6);
        g = un0Var7;
        h = new un0[]{un0Var, un0Var2, un0Var3, un0Var4, un0Var5, un0Var6, un0Var7};
    }

    public static un0 valueOf(String str) {
        return (un0) Enum.valueOf(un0.class, str);
    }

    public static un0[] values() {
        return (un0[]) h.clone();
    }
}
