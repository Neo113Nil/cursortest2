package d1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: g, reason: collision with root package name */
    public static final a f1564g;

    /* renamed from: h, reason: collision with root package name */
    public static final a f1565h;

    /* renamed from: i, reason: collision with root package name */
    public static final a f1566i;

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ a[] f1567j;

    static {
        a aVar = new a("None", 0);
        f1564g = aVar;
        a aVar2 = new a("Cancelled", 1);
        f1565h = aVar2;
        a aVar3 = new a("Redirected", 2);
        f1566i = aVar3;
        f1567j = new a[]{aVar, aVar2, aVar3, new a("RedirectCancelled", 3)};
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f1567j.clone();
    }
}
