package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class qi1 {
    public static final qi1 a;
    public static final qi1 b;
    public static final /* synthetic */ qi1[] c;

    static {
        qi1 qi1Var = new qi1("ONLINE", 0);
        a = qi1Var;
        qi1 qi1Var2 = new qi1("OFFLINE", 1);
        b = qi1Var2;
        c = new qi1[]{qi1Var, qi1Var2};
    }

    public static qi1 valueOf(String str) {
        return (qi1) Enum.valueOf(qi1.class, str);
    }

    public static qi1[] values() {
        return (qi1[]) c.clone();
    }
}
