package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class kx1 {
    public static final kx1 a;
    public static final kx1 b;
    public static final kx1 c;
    public static final kx1 d;
    public static final kx1 e;
    public static final /* synthetic */ kx1[] f;

    static {
        kx1 kx1Var = new kx1("Bluetooth", 0);
        a = kx1Var;
        kx1 kx1Var2 = new kx1("Tv", 1);
        b = kx1Var2;
        kx1 kx1Var3 = new kx1("Wired", 2);
        c = kx1Var3;
        kx1 kx1Var4 = new kx1("Speaker", 3);
        d = kx1Var4;
        kx1 kx1Var5 = new kx1("Other", 4);
        e = kx1Var5;
        f = new kx1[]{kx1Var, kx1Var2, kx1Var3, kx1Var4, kx1Var5};
    }

    public static kx1 valueOf(String str) {
        return (kx1) Enum.valueOf(kx1.class, str);
    }

    public static kx1[] values() {
        return (kx1[]) f.clone();
    }
}
