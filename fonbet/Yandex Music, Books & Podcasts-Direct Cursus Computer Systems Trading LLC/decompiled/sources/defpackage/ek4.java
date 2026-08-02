package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class ek4 {
    public static final ofc a;
    public static final ek4 b;
    public static final ek4 c;
    public static final ek4 d;
    public static final /* synthetic */ ek4[] e;

    static {
        ek4 ek4Var = new ek4("TV", 0);
        b = ek4Var;
        ek4 ek4Var2 = new ek4("SPEAKER", 1);
        c = ek4Var2;
        ek4 ek4Var3 = new ek4("OTHER", 2);
        d = ek4Var3;
        e = new ek4[]{ek4Var, ek4Var2, ek4Var3};
        a = new ofc(17);
    }

    public static ek4 valueOf(String str) {
        return (ek4) Enum.valueOf(ek4.class, str);
    }

    public static ek4[] values() {
        return (ek4[]) e.clone();
    }
}
