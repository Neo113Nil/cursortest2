package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class dk1 {
    public static final dk1 a;
    public static final dk1 b;
    public static final /* synthetic */ dk1[] c;

    static {
        dk1 dk1Var = new dk1("DATE", 0);
        a = dk1Var;
        dk1 dk1Var2 = new dk1("ALPHABET", 1);
        b = dk1Var2;
        c = new dk1[]{dk1Var, dk1Var2};
    }

    public static dk1 valueOf(String str) {
        return (dk1) Enum.valueOf(dk1.class, str);
    }

    public static dk1[] values() {
        return (dk1[]) c.clone();
    }
}
