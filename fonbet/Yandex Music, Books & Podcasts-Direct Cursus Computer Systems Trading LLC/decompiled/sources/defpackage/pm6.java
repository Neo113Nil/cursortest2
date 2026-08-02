package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class pm6 {
    public static final pm6 a;
    public static final pm6 b;
    public static final pm6 c;
    public static final pm6 d;
    public static final /* synthetic */ pm6[] e;

    static {
        pm6 pm6Var = new pm6("DEFAULT", 0);
        a = pm6Var;
        pm6 pm6Var2 = new pm6("LAZY", 1);
        b = pm6Var2;
        pm6 pm6Var3 = new pm6("ATOMIC", 2);
        c = pm6Var3;
        pm6 pm6Var4 = new pm6("UNDISPATCHED", 3);
        d = pm6Var4;
        e = new pm6[]{pm6Var, pm6Var2, pm6Var3, pm6Var4};
    }

    public static pm6 valueOf(String str) {
        return (pm6) Enum.valueOf(pm6.class, str);
    }

    public static pm6[] values() {
        return (pm6[]) e.clone();
    }
}
