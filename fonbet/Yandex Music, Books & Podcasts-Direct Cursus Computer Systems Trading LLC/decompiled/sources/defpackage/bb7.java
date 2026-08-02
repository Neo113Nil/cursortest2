package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class bb7 {
    public static final bb7 a;
    public static final bb7 b;
    public static final bb7 c;
    public static final bb7 d;
    public static final /* synthetic */ bb7[] e;

    static {
        bb7 bb7Var = new bb7("MEMORY_CACHE", 0);
        a = bb7Var;
        bb7 bb7Var2 = new bb7("MEMORY", 1);
        b = bb7Var2;
        bb7 bb7Var3 = new bb7("DISK", 2);
        c = bb7Var3;
        bb7 bb7Var4 = new bb7("NETWORK", 3);
        d = bb7Var4;
        e = new bb7[]{bb7Var, bb7Var2, bb7Var3, bb7Var4};
    }

    public static bb7 valueOf(String str) {
        return (bb7) Enum.valueOf(bb7.class, str);
    }

    public static bb7[] values() {
        return (bb7[]) e.clone();
    }
}
