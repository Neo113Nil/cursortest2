package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class nm1 {
    public static final nm1 a;
    public static final nm1 b;
    public static final /* synthetic */ nm1[] c;

    static {
        nm1 nm1Var = new nm1("Popular", 0);
        a = nm1Var;
        nm1 nm1Var2 = new nm1("Downloaded", 1);
        b = nm1Var2;
        c = new nm1[]{nm1Var, nm1Var2};
    }

    public static nm1 valueOf(String str) {
        return (nm1) Enum.valueOf(nm1.class, str);
    }

    public static nm1[] values() {
        return (nm1[]) c.clone();
    }
}
