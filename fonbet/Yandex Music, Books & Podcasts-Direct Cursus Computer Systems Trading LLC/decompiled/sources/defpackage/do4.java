package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class do4 {
    public static final do4 a;
    public static final do4 b;
    public static final do4 c;
    public static final /* synthetic */ do4[] d;

    static {
        do4 do4Var = new do4("AUTH", 0);
        a = do4Var;
        do4 do4Var2 = new do4("LEGAL_REASONS", 1);
        b = do4Var2;
        do4 do4Var3 = new do4("UNKNOWN", 2);
        c = do4Var3;
        d = new do4[]{do4Var, do4Var2, do4Var3};
    }

    public static do4 valueOf(String str) {
        return (do4) Enum.valueOf(do4.class, str);
    }

    public static do4[] values() {
        return (do4[]) d.clone();
    }
}
