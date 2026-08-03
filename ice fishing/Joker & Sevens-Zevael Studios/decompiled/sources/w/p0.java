package w;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class p0 {

    /* renamed from: g, reason: collision with root package name */
    public static final p0 f7480g;

    /* renamed from: h, reason: collision with root package name */
    public static final p0 f7481h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ p0[] f7482i;

    static {
        p0 p0Var = new p0("Default", 0);
        f7480g = p0Var;
        p0 p0Var2 = new p0("UserInput", 1);
        f7481h = p0Var2;
        f7482i = new p0[]{p0Var, p0Var2, new p0("PreventUserInput", 2)};
    }

    public static p0 valueOf(String str) {
        return (p0) Enum.valueOf(p0.class, str);
    }

    public static p0[] values() {
        return (p0[]) f7482i.clone();
    }
}
