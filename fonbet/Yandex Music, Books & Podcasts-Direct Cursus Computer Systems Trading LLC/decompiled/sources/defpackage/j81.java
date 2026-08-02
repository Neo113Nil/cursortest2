package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class j81 {
    public static final j81 a;
    public static final j81 b;
    public static final /* synthetic */ j81[] c;

    static {
        j81 j81Var = new j81("Wave", 0);
        a = j81Var;
        j81 j81Var2 = new j81("Collection", 1);
        b = j81Var2;
        c = new j81[]{j81Var, j81Var2};
    }

    public static j81 valueOf(String str) {
        return (j81) Enum.valueOf(j81.class, str);
    }

    public static j81[] values() {
        return (j81[]) c.clone();
    }
}
