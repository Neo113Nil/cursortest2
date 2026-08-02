package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class fl5 {
    public static final fl5 a;
    public static final fl5 b;
    public static final fl5 c;
    public static final fl5 d;
    public static final fl5 e;
    public static final /* synthetic */ fl5[] f;

    static {
        fl5 fl5Var = new fl5("Eq", 0);
        a = fl5Var;
        fl5 fl5Var2 = new fl5("Less", 1);
        b = fl5Var2;
        fl5 fl5Var3 = new fl5("Greater", 2);
        c = fl5Var3;
        fl5 fl5Var4 = new fl5("IncorrectFirstArg", 3);
        d = fl5Var4;
        fl5 fl5Var5 = new fl5("IncorrectSecondArg", 4);
        e = fl5Var5;
        f = new fl5[]{fl5Var, fl5Var2, fl5Var3, fl5Var4, fl5Var5};
    }

    public static fl5 valueOf(String str) {
        return (fl5) Enum.valueOf(fl5.class, str);
    }

    public static fl5[] values() {
        return (fl5[]) f.clone();
    }
}
