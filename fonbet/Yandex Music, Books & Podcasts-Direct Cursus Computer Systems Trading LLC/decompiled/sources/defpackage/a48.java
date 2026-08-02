package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public abstract class a48 {
    public static final y38 a;
    public static final x38 b;
    public static final /* synthetic */ a48[] c;

    static {
        y38 y38Var = new y38();
        a = y38Var;
        x38 x38Var = new x38();
        b = x38Var;
        c = new a48[]{y38Var, x38Var, new a48() { // from class: z38
        }};
    }

    public static a48 valueOf(String str) {
        return (a48) Enum.valueOf(a48.class, str);
    }

    public static a48[] values() {
        return (a48[]) c.clone();
    }
}
