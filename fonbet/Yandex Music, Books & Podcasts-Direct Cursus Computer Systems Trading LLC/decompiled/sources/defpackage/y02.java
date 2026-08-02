package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class y02 {
    public static final y02 a;
    public static final y02 b;
    public static final /* synthetic */ y02[] c;

    static {
        y02 y02Var = new y02("VIEW_LIST", 0);
        a = y02Var;
        y02 y02Var2 = new y02("VIEW_GRID", 1);
        b = y02Var2;
        c = new y02[]{y02Var, y02Var2};
    }

    public static y02 valueOf(String str) {
        return (y02) Enum.valueOf(y02.class, str);
    }

    public static y02[] values() {
        return (y02[]) c.clone();
    }

    public final int a() {
        int ordinal = ordinal();
        if (ordinal == 0) {
            return 1;
        }
        if (ordinal == 1) {
            return 2;
        }
        b6e.s();
        return 0;
    }
}
