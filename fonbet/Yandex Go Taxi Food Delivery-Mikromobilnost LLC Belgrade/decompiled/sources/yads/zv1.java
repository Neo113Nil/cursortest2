package yads;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class zv1 {
    public static final zv1 b;
    public static final zv1 c;
    public static final /* synthetic */ zv1[] d;

    static {
        zv1 zv1Var = new zv1("LEFT", 0);
        b = zv1Var;
        zv1 zv1Var2 = new zv1("RIGHT", 1);
        c = zv1Var2;
        d = new zv1[]{zv1Var, zv1Var2};
    }

    public static zv1 valueOf(String str) {
        return (zv1) Enum.valueOf(zv1.class, str);
    }

    public static zv1[] values() {
        return (zv1[]) d.clone();
    }
}
