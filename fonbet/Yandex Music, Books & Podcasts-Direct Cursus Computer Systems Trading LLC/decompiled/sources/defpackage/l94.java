package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class l94 {
    public static final l94 a;
    public static final /* synthetic */ l94[] b;

    /* JADX INFO: Fake field, exist only in values array */
    l94 EF0;

    static {
        l94 l94Var = new l94("Kids", 0);
        l94 l94Var2 = new l94("Podcasts", 1);
        a = l94Var2;
        b = new l94[]{l94Var, l94Var2, new l94("Artist", 2), new l94("Charts", 3)};
    }

    public static l94 valueOf(String str) {
        return (l94) Enum.valueOf(l94.class, str);
    }

    public static l94[] values() {
        return (l94[]) b.clone();
    }
}
