package m0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class z1 {

    /* renamed from: g, reason: collision with root package name */
    public static final z1 f4846g;

    /* renamed from: h, reason: collision with root package name */
    public static final z1 f4847h;

    /* renamed from: i, reason: collision with root package name */
    public static final z1 f4848i;

    /* renamed from: j, reason: collision with root package name */
    public static final z1 f4849j;

    /* renamed from: k, reason: collision with root package name */
    public static final z1 f4850k;

    /* renamed from: l, reason: collision with root package name */
    public static final z1 f4851l;

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ z1[] f4852m;

    static {
        z1 z1Var = new z1("ShutDown", 0);
        f4846g = z1Var;
        z1 z1Var2 = new z1("ShuttingDown", 1);
        f4847h = z1Var2;
        z1 z1Var3 = new z1("Inactive", 2);
        f4848i = z1Var3;
        z1 z1Var4 = new z1("InactivePendingWork", 3);
        f4849j = z1Var4;
        z1 z1Var5 = new z1("Idle", 4);
        f4850k = z1Var5;
        z1 z1Var6 = new z1("PendingWork", 5);
        f4851l = z1Var6;
        f4852m = new z1[]{z1Var, z1Var2, z1Var3, z1Var4, z1Var5, z1Var6};
    }

    public static z1 valueOf(String str) {
        return (z1) Enum.valueOf(z1.class, str);
    }

    public static z1[] values() {
        return (z1[]) f4852m.clone();
    }
}
