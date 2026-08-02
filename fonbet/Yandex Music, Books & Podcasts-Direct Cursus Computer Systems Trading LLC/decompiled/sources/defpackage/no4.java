package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class no4 {
    public static final no4 a;
    public static final no4 b;
    public static final no4 c;
    public static final no4 d;
    public static final /* synthetic */ no4[] e;

    static {
        no4 no4Var = new no4("PROCESSED", 0);
        a = no4Var;
        no4 no4Var2 = new no4("REFUSED", 1);
        b = no4Var2;
        no4 no4Var3 = new no4("DROPPED", 2);
        c = no4Var3;
        no4 no4Var4 = new no4("MISCARRIED", 3);
        d = no4Var4;
        e = new no4[]{no4Var, no4Var2, no4Var3, no4Var4};
    }

    public static no4 valueOf(String str) {
        return (no4) Enum.valueOf(no4.class, str);
    }

    public static no4[] values() {
        return (no4[]) e.clone();
    }
}
