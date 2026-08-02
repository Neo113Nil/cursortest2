package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class u74 {
    public static final klx a;
    public static final u74 b;
    public static final u74 c;
    public static final u74 d;
    public static final u74 e;
    public static final /* synthetic */ u74[] f;

    static {
        u74 u74Var = new u74("PHONE", 0);
        b = u74Var;
        u74 u74Var2 = new u74("PHONE_WITH_BLUETOOTH", 1);
        u74 u74Var3 = new u74("GLAGOL", 2);
        c = u74Var3;
        u74 u74Var4 = new u74("CHROME", 3);
        d = u74Var4;
        u74 u74Var5 = new u74("BLUETOOTH", 4);
        u74 u74Var6 = new u74("CONNECT", 5);
        e = u74Var6;
        f = new u74[]{u74Var, u74Var2, u74Var3, u74Var4, u74Var5, u74Var6};
        a = new klx(16);
    }

    public static u74 valueOf(String str) {
        return (u74) Enum.valueOf(u74.class, str);
    }

    public static u74[] values() {
        return (u74[]) f.clone();
    }
}
