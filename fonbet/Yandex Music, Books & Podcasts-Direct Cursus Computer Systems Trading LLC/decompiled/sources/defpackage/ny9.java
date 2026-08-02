package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class ny9 {
    public static final ny9 a;
    public static final ny9 b;
    public static final ny9 c;
    public static final ny9 d;
    public static final /* synthetic */ ny9[] e;

    static {
        ny9 ny9Var = new ny9("REGULAR", 0);
        a = ny9Var;
        ny9 ny9Var2 = new ny9("MEDIUM", 1);
        b = ny9Var2;
        ny9 ny9Var3 = new ny9("BOLD", 2);
        c = ny9Var3;
        ny9 ny9Var4 = new ny9("LIGHT", 3);
        d = ny9Var4;
        e = new ny9[]{ny9Var, ny9Var2, ny9Var3, ny9Var4};
    }

    public static ny9 valueOf(String str) {
        return (ny9) Enum.valueOf(ny9.class, str);
    }

    public static ny9[] values() {
        return (ny9[]) e.clone();
    }
}
