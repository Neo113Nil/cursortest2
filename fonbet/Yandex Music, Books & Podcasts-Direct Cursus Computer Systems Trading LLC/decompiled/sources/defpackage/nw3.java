package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class nw3 {
    public static final nw3 a;
    public static final nw3 b;
    public static final /* synthetic */ nw3[] c;

    static {
        nw3 nw3Var = new nw3("BindOnly", 0);
        a = nw3Var;
        nw3 nw3Var2 = new nw3("PayAndBind", 1);
        b = nw3Var2;
        c = new nw3[]{nw3Var, nw3Var2};
    }

    public static nw3 valueOf(String str) {
        return (nw3) Enum.valueOf(nw3.class, str);
    }

    public static nw3[] values() {
        return (nw3[]) c.clone();
    }
}
