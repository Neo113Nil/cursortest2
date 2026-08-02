package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class s84 {
    public static final s84 a;
    public static final s84 b;
    public static final s84 c;
    public static final s84 d;
    public static final s84 e;
    public static final s84 f;
    public static final /* synthetic */ s84[] g;

    static {
        s84 s84Var = new s84("CONNECTING", 0);
        a = s84Var;
        s84 s84Var2 = new s84("CONNECTED", 1);
        b = s84Var2;
        s84 s84Var3 = new s84("RESUMING", 2);
        c = s84Var3;
        s84 s84Var4 = new s84("SUSPENDED", 3);
        d = s84Var4;
        s84 s84Var5 = new s84("ENDING", 4);
        e = s84Var5;
        s84 s84Var6 = new s84("DISCONNECTED", 5);
        f = s84Var6;
        g = new s84[]{s84Var, s84Var2, s84Var3, s84Var4, s84Var5, s84Var6};
    }

    public static s84 valueOf(String str) {
        return (s84) Enum.valueOf(s84.class, str);
    }

    public static s84[] values() {
        return (s84[]) g.clone();
    }
}
