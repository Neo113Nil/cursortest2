package yads;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class nq1 {
    public static final nq1 b;
    public static final /* synthetic */ nq1[] c;

    static {
        nq1 nq1Var = new nq1();
        b = nq1Var;
        c = new nq1[]{nq1Var};
    }

    public static nq1 valueOf(String str) {
        return (nq1) Enum.valueOf(nq1.class, str);
    }

    public static nq1[] values() {
        return (nq1[]) c.clone();
    }
}
