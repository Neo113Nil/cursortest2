package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class l17 {
    public static final l17 a;
    public static final l17 b;
    public static final /* synthetic */ l17[] c;

    static {
        l17 l17Var = new l17("FULL", 0);
        a = l17Var;
        l17 l17Var2 = new l17("MASKED", 1);
        b = l17Var2;
        c = new l17[]{l17Var, l17Var2};
    }

    public static l17 valueOf(String str) {
        return (l17) Enum.valueOf(l17.class, str);
    }

    public static l17[] values() {
        return (l17[]) c.clone();
    }
}
