package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class ir2 {
    public static final ir2 a;
    public static final ir2 b;
    public static final ir2 c;
    public static final /* synthetic */ ir2[] d;

    static {
        ir2 ir2Var = new ir2("SLIDE", 0);
        a = ir2Var;
        ir2 ir2Var2 = new ir2("FADE", 1);
        b = ir2Var2;
        ir2 ir2Var3 = new ir2("NONE", 2);
        c = ir2Var3;
        d = new ir2[]{ir2Var, ir2Var2, ir2Var3};
    }

    public static ir2 valueOf(String str) {
        return (ir2) Enum.valueOf(ir2.class, str);
    }

    public static ir2[] values() {
        return (ir2[]) d.clone();
    }
}
