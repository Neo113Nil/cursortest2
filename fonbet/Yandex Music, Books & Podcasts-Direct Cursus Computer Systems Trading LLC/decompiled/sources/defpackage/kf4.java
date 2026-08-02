package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class kf4 {
    public static final kf4 a;
    public static final kf4 b;
    public static final kf4 c;
    public static final kf4 d;
    public static final kf4 e;
    public static final /* synthetic */ kf4[] f;

    static {
        kf4 kf4Var = new kf4("FIRST", 0);
        a = kf4Var;
        kf4 kf4Var2 = new kf4("NEW", 1);
        b = kf4Var2;
        kf4 kf4Var3 = new kf4("UP", 2);
        c = kf4Var3;
        kf4 kf4Var4 = new kf4("SAME", 3);
        d = kf4Var4;
        kf4 kf4Var5 = new kf4("DOWN", 4);
        e = kf4Var5;
        f = new kf4[]{kf4Var, kf4Var2, kf4Var3, kf4Var4, kf4Var5};
    }

    public static kf4 valueOf(String str) {
        return (kf4) Enum.valueOf(kf4.class, str);
    }

    public static kf4[] values() {
        return (kf4[]) f.clone();
    }
}
