package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class if5 {
    public static final if5 a;
    public static final if5 b;
    public static final if5 c;
    public static final if5 d;
    public static final /* synthetic */ if5[] e;

    static {
        if5 if5Var = new if5("Active", 0);
        a = if5Var;
        if5 if5Var2 = new if5("ActiveWithoutBorder", 1);
        b = if5Var2;
        if5 if5Var3 = new if5("ReadyToActive", 2);
        c = if5Var3;
        if5 if5Var4 = new if5("Disabled", 3);
        d = if5Var4;
        e = new if5[]{if5Var, if5Var2, if5Var3, if5Var4};
    }

    public static if5 valueOf(String str) {
        return (if5) Enum.valueOf(if5.class, str);
    }

    public static if5[] values() {
        return (if5[]) e.clone();
    }
}
