package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class ao1 {
    public static final kjn a;
    public static final ao1 b;
    public static final ao1 c;
    public static final ao1 d;
    public static final /* synthetic */ ao1[] e;

    static {
        ao1 ao1Var = new ao1("Artists", 0);
        c = ao1Var;
        ao1 ao1Var2 = new ao1("Narrators", 1);
        d = ao1Var2;
        e = new ao1[]{ao1Var, ao1Var2};
        a = new kjn(14);
        b = ao1Var;
    }

    public static ao1 valueOf(String str) {
        return (ao1) Enum.valueOf(ao1.class, str);
    }

    public static ao1[] values() {
        return (ao1[]) e.clone();
    }
}
