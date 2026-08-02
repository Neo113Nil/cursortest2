package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class wv1 {
    public static final wv1 a;
    public static final wv1 b;
    public static final /* synthetic */ wv1[] c;

    static {
        wv1 wv1Var = new wv1("DATE", 0);
        a = wv1Var;
        wv1 wv1Var2 = new wv1("ALPHABET", 1);
        b = wv1Var2;
        c = new wv1[]{wv1Var, wv1Var2};
    }

    public static wv1 valueOf(String str) {
        return (wv1) Enum.valueOf(wv1.class, str);
    }

    public static wv1[] values() {
        return (wv1[]) c.clone();
    }
}
