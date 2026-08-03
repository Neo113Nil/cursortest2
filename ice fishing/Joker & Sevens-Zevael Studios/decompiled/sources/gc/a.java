package gc;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: g, reason: collision with root package name */
    public static final a f2559g;

    /* renamed from: h, reason: collision with root package name */
    public static final a f2560h;

    /* renamed from: i, reason: collision with root package name */
    public static final a f2561i;

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ a[] f2562j;

    static {
        a aVar = new a("COROUTINE_SUSPENDED", 0);
        f2559g = aVar;
        a aVar2 = new a("UNDECIDED", 1);
        f2560h = aVar2;
        a aVar3 = new a("RESUMED", 2);
        f2561i = aVar3;
        f2562j = new a[]{aVar, aVar2, aVar3};
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f2562j.clone();
    }
}
