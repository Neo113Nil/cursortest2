package g2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: g, reason: collision with root package name */
    public static final a f2504g;

    /* renamed from: h, reason: collision with root package name */
    public static final a f2505h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ a[] f2506i;

    static {
        a aVar = new a("On", 0);
        f2504g = aVar;
        a aVar2 = new a("Off", 1);
        f2505h = aVar2;
        f2506i = new a[]{aVar, aVar2, new a("Indeterminate", 2)};
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f2506i.clone();
    }
}
