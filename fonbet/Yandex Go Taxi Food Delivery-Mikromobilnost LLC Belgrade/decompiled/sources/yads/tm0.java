package yads;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class tm0 {
    public static final tm0 b;
    public static final tm0 c;
    public static final /* synthetic */ tm0[] d;

    static {
        tm0 tm0Var = new tm0("FRAME", 0);
        b = tm0Var;
        tm0 tm0Var2 = new tm0("TRACE", 1);
        c = tm0Var2;
        d = new tm0[]{tm0Var, tm0Var2};
    }

    public static tm0 valueOf(String str) {
        return (tm0) Enum.valueOf(tm0.class, str);
    }

    public static tm0[] values() {
        return (tm0[]) d.clone();
    }
}
