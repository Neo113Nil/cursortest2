package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class vw7 {
    public static final vw7 a;
    public static final vw7 b;
    public static final vw7 c;
    public static final /* synthetic */ vw7[] d;

    static {
        vw7 vw7Var = new vw7("Success", 0);
        a = vw7Var;
        vw7 vw7Var2 = new vw7("Fail", 1);
        b = vw7Var2;
        vw7 vw7Var3 = new vw7("Cancel", 2);
        c = vw7Var3;
        d = new vw7[]{vw7Var, vw7Var2, vw7Var3};
    }

    public static vw7 valueOf(String str) {
        return (vw7) Enum.valueOf(vw7.class, str);
    }

    public static vw7[] values() {
        return (vw7[]) d.clone();
    }
}
