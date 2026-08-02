package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class h74 {
    public static final h74 a;
    public static final h74 b;
    public static final h74 c;
    public static final h74 d;
    public static final /* synthetic */ h74[] e;

    static {
        h74 h74Var = new h74("GLAGOL", 0);
        a = h74Var;
        h74 h74Var2 = new h74("CHROME", 1);
        b = h74Var2;
        h74 h74Var3 = new h74("YNISON", 2);
        c = h74Var3;
        h74 h74Var4 = new h74("NONE", 3);
        d = h74Var4;
        e = new h74[]{h74Var, h74Var2, h74Var3, h74Var4};
    }

    public static h74 valueOf(String str) {
        return (h74) Enum.valueOf(h74.class, str);
    }

    public static h74[] values() {
        return (h74[]) e.clone();
    }
}
