package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class yv3 {
    public static final yv3 a;
    public static final yv3 b;
    public static final /* synthetic */ yv3[] c;

    static {
        yv3 yv3Var = new yv3("ShowNext", 0);
        a = yv3Var;
        yv3 yv3Var2 = new yv3("ShowProcess", 1);
        b = yv3Var2;
        c = new yv3[]{yv3Var, yv3Var2};
    }

    public static yv3 valueOf(String str) {
        return (yv3) Enum.valueOf(yv3.class, str);
    }

    public static yv3[] values() {
        return (yv3[]) c.clone();
    }
}
