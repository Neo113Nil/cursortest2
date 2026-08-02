package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class kf1 {
    public static final kf1 a;
    public static final kf1 b;
    public static final /* synthetic */ kf1[] c;

    /* JADX INFO: Fake field, exist only in values array */
    kf1 EF0;

    static {
        kf1 kf1Var = new kf1("Popular", 0);
        kf1 kf1Var2 = new kf1("FamiliarWave", 1);
        a = kf1Var2;
        kf1 kf1Var3 = new kf1("FamiliarCollection", 2);
        b = kf1Var3;
        c = new kf1[]{kf1Var, kf1Var2, kf1Var3};
    }

    public static kf1 valueOf(String str) {
        return (kf1) Enum.valueOf(kf1.class, str);
    }

    public static kf1[] values() {
        return (kf1[]) c.clone();
    }
}
