package m0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class t0 {

    /* renamed from: g, reason: collision with root package name */
    public static final t0 f4763g;

    /* renamed from: h, reason: collision with root package name */
    public static final t0 f4764h;

    /* renamed from: i, reason: collision with root package name */
    public static final t0 f4765i;

    /* renamed from: j, reason: collision with root package name */
    public static final t0 f4766j;

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ t0[] f4767k;

    static {
        t0 t0Var = new t0("IGNORED", 0);
        f4763g = t0Var;
        t0 t0Var2 = new t0("SCHEDULED", 1);
        f4764h = t0Var2;
        t0 t0Var3 = new t0("DEFERRED", 2);
        f4765i = t0Var3;
        t0 t0Var4 = new t0("IMMINENT", 3);
        f4766j = t0Var4;
        f4767k = new t0[]{t0Var, t0Var2, t0Var3, t0Var4};
    }

    public static t0 valueOf(String str) {
        return (t0) Enum.valueOf(t0.class, str);
    }

    public static t0[] values() {
        return (t0[]) f4767k.clone();
    }
}
