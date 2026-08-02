package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class rr3 {
    public static final rr3 a;
    public static final rr3 b;
    public static final rr3 c;
    public static final /* synthetic */ rr3[] d;

    static {
        rr3 rr3Var = new rr3("Own", 0);
        a = rr3Var;
        rr3 rr3Var2 = new rr3("AutoCache", 1);
        b = rr3Var2;
        rr3 rr3Var3 = new rr3("All", 2);
        c = rr3Var3;
        d = new rr3[]{rr3Var, rr3Var2, rr3Var3};
    }

    public static rr3 valueOf(String str) {
        return (rr3) Enum.valueOf(rr3.class, str);
    }

    public static rr3[] values() {
        return (rr3[]) d.clone();
    }
}
