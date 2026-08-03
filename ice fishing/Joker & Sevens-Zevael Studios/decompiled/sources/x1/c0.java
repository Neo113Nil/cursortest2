package x1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class c0 {

    /* renamed from: g, reason: collision with root package name */
    public static final c0 f7980g;

    /* renamed from: h, reason: collision with root package name */
    public static final c0 f7981h;

    /* renamed from: i, reason: collision with root package name */
    public static final c0 f7982i;

    /* renamed from: j, reason: collision with root package name */
    public static final c0 f7983j;

    /* renamed from: k, reason: collision with root package name */
    public static final c0 f7984k;

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ c0[] f7985l;

    static {
        c0 c0Var = new c0("Measuring", 0);
        f7980g = c0Var;
        c0 c0Var2 = new c0("LookaheadMeasuring", 1);
        f7981h = c0Var2;
        c0 c0Var3 = new c0("LayingOut", 2);
        f7982i = c0Var3;
        c0 c0Var4 = new c0("LookaheadLayingOut", 3);
        f7983j = c0Var4;
        c0 c0Var5 = new c0("Idle", 4);
        f7984k = c0Var5;
        f7985l = new c0[]{c0Var, c0Var2, c0Var3, c0Var4, c0Var5};
    }

    public static c0 valueOf(String str) {
        return (c0) Enum.valueOf(c0.class, str);
    }

    public static c0[] values() {
        return (c0[]) f7985l.clone();
    }
}
