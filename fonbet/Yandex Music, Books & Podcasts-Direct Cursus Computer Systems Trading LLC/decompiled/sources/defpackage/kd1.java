package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class kd1 {
    public static final kd1 a;
    public static final kd1 b;
    public static final /* synthetic */ kd1[] c;

    static {
        kd1 kd1Var = new kd1("FIRST", 0);
        a = kd1Var;
        kd1 kd1Var2 = new kd1("SECOND", 1);
        b = kd1Var2;
        c = new kd1[]{kd1Var, kd1Var2};
    }

    public static kd1 valueOf(String str) {
        return (kd1) Enum.valueOf(kd1.class, str);
    }

    public static kd1[] values() {
        return (kd1[]) c.clone();
    }
}
