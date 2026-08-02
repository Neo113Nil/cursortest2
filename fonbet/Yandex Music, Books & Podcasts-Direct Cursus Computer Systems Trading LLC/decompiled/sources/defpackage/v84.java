package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class v84 {
    public static final v84 a;
    public static final v84 b;
    public static final v84 c;
    public static final /* synthetic */ v84[] d;

    static {
        v84 v84Var = new v84("All", 0);
        a = v84Var;
        v84 v84Var2 = new v84("ChromecastOnly", 1);
        b = v84Var2;
        v84 v84Var3 = new v84("None", 2);
        c = v84Var3;
        d = new v84[]{v84Var, v84Var2, v84Var3};
    }

    public static v84 valueOf(String str) {
        return (v84) Enum.valueOf(v84.class, str);
    }

    public static v84[] values() {
        return (v84[]) d.clone();
    }
}
