package rd;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class e0 {

    /* renamed from: g, reason: collision with root package name */
    public static final e0 f6135g;

    /* renamed from: h, reason: collision with root package name */
    public static final e0 f6136h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ e0[] f6137i;

    static {
        e0 e0Var = new e0("CORRECT", 0);
        f6135g = e0Var;
        e0 e0Var2 = new e0("INCORRECT", 1);
        f6136h = e0Var2;
        f6137i = new e0[]{e0Var, e0Var2};
    }

    public static e0 valueOf(String str) {
        return (e0) Enum.valueOf(e0.class, str);
    }

    public static e0[] values() {
        return (e0[]) f6137i.clone();
    }
}
