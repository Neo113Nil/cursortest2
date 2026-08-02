package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class h94 {
    public static final hs4 b;
    public static final h94 c;
    public static final h94 d;
    public static final h94 e;
    public static final h94 f;
    public static final h94 g;
    public static final /* synthetic */ h94[] h;
    public static final /* synthetic */ rdb i;
    public final String a;

    static {
        h94 h94Var = new h94("MODAL", 0, "modal");
        c = h94Var;
        h94 h94Var2 = new h94("INFORMATION", 1, "informational");
        d = h94Var2;
        h94 h94Var3 = new h94("FOREIGN_AGENT", 2, "foreignAgent");
        e = h94Var3;
        h94 h94Var4 = new h94("EXPLICIT", 3, "explicit");
        f = h94Var4;
        h94 h94Var5 = new h94("AGE_18", 4, "age18");
        g = h94Var5;
        h94[] h94VarArr = {h94Var, h94Var2, h94Var3, h94Var4, h94Var5};
        h = h94VarArr;
        i = new rdb(h94VarArr);
        b = new hs4(17);
    }

    public h94(String str, int i2, String str2) {
        this.a = str2;
    }

    public static h94 valueOf(String str) {
        return (h94) Enum.valueOf(h94.class, str);
    }

    public static h94[] values() {
        return (h94[]) h.clone();
    }
}
