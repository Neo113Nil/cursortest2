package yads;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class w21 {
    public static final w21 b;
    public static final w21 c;
    public static final w21 d;
    public static final w21 e;
    public static final /* synthetic */ w21[] f;

    static {
        w21 w21Var = new w21("PNG", 0);
        b = w21Var;
        w21 w21Var2 = new w21("JPEG", 1);
        c = w21Var2;
        w21 w21Var3 = new w21("GIF", 2);
        d = w21Var3;
        w21 w21Var4 = new w21("UNKNOWN", 3);
        e = w21Var4;
        f = new w21[]{w21Var, w21Var2, w21Var3, w21Var4};
    }

    public static w21 valueOf(String str) {
        return (w21) Enum.valueOf(w21.class, str);
    }

    public static w21[] values() {
        return (w21[]) f.clone();
    }
}
