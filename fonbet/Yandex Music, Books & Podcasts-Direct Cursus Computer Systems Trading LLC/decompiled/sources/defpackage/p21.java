package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class p21 {
    public static final p21 a;
    public static final p21 b;
    public static final p21 c;
    public static final /* synthetic */ p21[] d;

    static {
        p21 p21Var = new p21("SIMPLE", 0);
        a = p21Var;
        p21 p21Var2 = new p21("TOP_ARTISTS", 1);
        b = p21Var2;
        p21 p21Var3 = new p21("EXPENDED", 2);
        c = p21Var3;
        d = new p21[]{p21Var, p21Var2, p21Var3};
    }

    public static p21 valueOf(String str) {
        return (p21) Enum.valueOf(p21.class, str);
    }

    public static p21[] values() {
        return (p21[]) d.clone();
    }
}
