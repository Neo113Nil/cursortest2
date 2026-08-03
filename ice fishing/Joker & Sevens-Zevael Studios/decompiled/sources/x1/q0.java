package x1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class q0 {

    /* renamed from: g, reason: collision with root package name */
    public static final q0 f8150g;

    /* renamed from: h, reason: collision with root package name */
    public static final q0 f8151h;

    /* renamed from: i, reason: collision with root package name */
    public static final q0 f8152i;

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ q0[] f8153j;

    static {
        q0 q0Var = new q0("IsPlacedInLookahead", 0);
        f8150g = q0Var;
        q0 q0Var2 = new q0("IsPlacedInApproach", 1);
        f8151h = q0Var2;
        q0 q0Var3 = new q0("IsNotPlaced", 2);
        f8152i = q0Var3;
        f8153j = new q0[]{q0Var, q0Var2, q0Var3};
    }

    public static q0 valueOf(String str) {
        return (q0) Enum.valueOf(q0.class, str);
    }

    public static q0[] values() {
        return (q0[]) f8153j.clone();
    }
}
