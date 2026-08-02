package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class jn6 {
    public static final jn6 a;
    public static final jn6 b;
    public static final jn6 c;
    public static final /* synthetic */ jn6[] d;

    static {
        jn6 jn6Var = new jn6("Visible", 0);
        a = jn6Var;
        jn6 jn6Var2 = new jn6("LoadingVideoShot", 1);
        b = jn6Var2;
        jn6 jn6Var3 = new jn6("Hide", 2);
        c = jn6Var3;
        d = new jn6[]{jn6Var, jn6Var2, jn6Var3};
    }

    public static jn6 valueOf(String str) {
        return (jn6) Enum.valueOf(jn6.class, str);
    }

    public static jn6[] values() {
        return (jn6[]) d.clone();
    }
}
