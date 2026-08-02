package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class do6 {
    public static final do6 a;
    public static final do6 b;
    public static final do6 c;
    public static final /* synthetic */ do6[] d;

    static {
        do6 do6Var = new do6("NULL", 0);
        a = do6Var;
        do6 do6Var2 = new do6("URI", 1);
        b = do6Var2;
        do6 do6Var3 = new do6("MEDIA", 2);
        do6 do6Var4 = new do6("FIXED", 3);
        c = do6Var4;
        d = new do6[]{do6Var, do6Var2, do6Var3, do6Var4};
    }

    public static do6 valueOf(String str) {
        return (do6) Enum.valueOf(do6.class, str);
    }

    public static do6[] values() {
        return (do6[]) d.clone();
    }
}
