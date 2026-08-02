package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class vf7 {
    public static final vf7 a;
    public static final vf7 b;
    public static final vf7 c;
    public static final /* synthetic */ vf7[] d;

    static {
        vf7 vf7Var = new vf7("PREFER_ARGB_8888", 0);
        a = vf7Var;
        vf7 vf7Var2 = new vf7("PREFER_RGB_565", 1);
        b = vf7Var2;
        d = new vf7[]{vf7Var, vf7Var2};
        c = vf7Var;
    }

    public static vf7 valueOf(String str) {
        return (vf7) Enum.valueOf(vf7.class, str);
    }

    public static vf7[] values() {
        return (vf7[]) d.clone();
    }
}
