package ad;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: g, reason: collision with root package name */
    public static final a f280g;

    /* renamed from: h, reason: collision with root package name */
    public static final a f281h;

    /* renamed from: i, reason: collision with root package name */
    public static final a f282i;

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ a[] f283j;

    static {
        a aVar = new a("SUSPEND", 0);
        f280g = aVar;
        a aVar2 = new a("DROP_OLDEST", 1);
        f281h = aVar2;
        a aVar3 = new a("DROP_LATEST", 2);
        f282i = aVar3;
        f283j = new a[]{aVar, aVar2, aVar3};
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f283j.clone();
    }
}
