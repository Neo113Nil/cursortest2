package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class gs5 {
    public static final aaw b;
    public static final gs5 c;
    public static final gs5 d;
    public static final gs5 e;
    public static final gs5 f;
    public static final gs5 g;
    public static final /* synthetic */ gs5[] h;
    public static final /* synthetic */ rdb i;
    public final String a;

    static {
        gs5 gs5Var = new gs5("ExclamationIcon", 0, "exclamationIcon");
        gs5 gs5Var2 = new gs5("Age18Icon", 1, "age18Icon");
        c = gs5Var2;
        gs5 gs5Var3 = new gs5("ExplicitIcon", 2, "explicitIcon");
        d = gs5Var3;
        gs5 gs5Var4 = new gs5("Description", 3, "descriptionText");
        e = gs5Var4;
        gs5 gs5Var5 = new gs5("Modal", 4, "modal");
        f = gs5Var5;
        gs5 gs5Var6 = new gs5("ForeignAgent", 5, "foreignAgent");
        g = gs5Var6;
        gs5[] gs5VarArr = {gs5Var, gs5Var2, gs5Var3, gs5Var4, gs5Var5, gs5Var6, new gs5("Informational", 6, "informational")};
        h = gs5VarArr;
        i = new rdb(gs5VarArr);
        b = new aaw(17);
    }

    public gs5(String str, int i2, String str2) {
        this.a = str2;
    }

    public static gs5 valueOf(String str) {
        return (gs5) Enum.valueOf(gs5.class, str);
    }

    public static gs5[] values() {
        return (gs5[]) h.clone();
    }
}
