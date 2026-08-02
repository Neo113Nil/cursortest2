package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class yh4 {
    public static final yh4 a;
    public static final yh4 b;
    public static final yh4 c;
    public static final yh4 d;
    public static final /* synthetic */ yh4[] e;

    static {
        yh4 yh4Var = new yh4("CHAT_LIST", 0);
        a = yh4Var;
        yh4 yh4Var2 = new yh4("CHAT", 1);
        b = yh4Var2;
        yh4 yh4Var3 = new yh4("UNDEFINED", 2);
        c = yh4Var3;
        yh4 yh4Var4 = new yh4("PROFILE", 3);
        d = yh4Var4;
        e = new yh4[]{yh4Var, yh4Var2, yh4Var3, yh4Var4};
    }

    public static yh4 valueOf(String str) {
        return (yh4) Enum.valueOf(yh4.class, str);
    }

    public static yh4[] values() {
        return (yh4[]) e.clone();
    }
}
