package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class qt0 {
    public static final qt0 a;
    public static final qt0 b;
    public static final /* synthetic */ qt0[] c;

    static {
        qt0 qt0Var = new qt0("MOBILE_INSTALL_EVENT", 0);
        a = qt0Var;
        qt0 qt0Var2 = new qt0("CUSTOM_APP_EVENTS", 1);
        b = qt0Var2;
        c = new qt0[]{qt0Var, qt0Var2};
    }

    public static qt0 valueOf(String str) {
        return (qt0) Enum.valueOf(qt0.class, str);
    }

    public static qt0[] values() {
        return (qt0[]) c.clone();
    }
}
