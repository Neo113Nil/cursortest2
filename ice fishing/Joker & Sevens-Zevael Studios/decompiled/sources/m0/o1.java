package m0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class o1 {

    /* renamed from: g, reason: collision with root package name */
    public static final o1 f4692g;

    /* renamed from: h, reason: collision with root package name */
    public static final o1 f4693h;

    /* renamed from: i, reason: collision with root package name */
    public static final o1 f4694i;

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ o1[] f4695j;

    /* JADX INFO: Fake field, exist only in values array */
    o1 EF0;

    static {
        o1 o1Var = new o1("Invalid", 0);
        o1 o1Var2 = new o1("Cancelled", 1);
        f4692g = o1Var2;
        o1 o1Var3 = new o1("InitialPending", 2);
        o1 o1Var4 = new o1("RecomposePending", 3);
        o1 o1Var5 = new o1("Recomposing", 4);
        f4693h = o1Var5;
        o1 o1Var6 = new o1("ApplyPending", 5);
        f4694i = o1Var6;
        f4695j = new o1[]{o1Var, o1Var2, o1Var3, o1Var4, o1Var5, o1Var6, new o1("Applied", 6)};
    }

    public static o1 valueOf(String str) {
        return (o1) Enum.valueOf(o1.class, str);
    }

    public static o1[] values() {
        return (o1[]) f4695j.clone();
    }
}
