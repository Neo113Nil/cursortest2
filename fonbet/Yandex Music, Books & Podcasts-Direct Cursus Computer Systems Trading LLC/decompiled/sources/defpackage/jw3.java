package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class jw3 {
    public static final jw3 a;
    public static final jw3 b;
    public static final jw3 c;
    public static final jw3 d;
    public static final /* synthetic */ jw3[] e;

    static {
        jw3 jw3Var = new jw3("CARD_NUMBER", 0);
        a = jw3Var;
        jw3 jw3Var2 = new jw3("CARD_NUMBER_VALID", 1);
        b = jw3Var2;
        jw3 jw3Var3 = new jw3("CARD_DETAILS", 2);
        c = jw3Var3;
        jw3 jw3Var4 = new jw3("CARD_DETAILS_VALID", 3);
        d = jw3Var4;
        e = new jw3[]{jw3Var, jw3Var2, jw3Var3, jw3Var4};
    }

    public static jw3 valueOf(String str) {
        return (jw3) Enum.valueOf(jw3.class, str);
    }

    public static jw3[] values() {
        return (jw3[]) e.clone();
    }
}
