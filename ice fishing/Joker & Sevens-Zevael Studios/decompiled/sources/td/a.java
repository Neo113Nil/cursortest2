package td;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: g, reason: collision with root package name */
    public static final a f6543g;

    /* renamed from: h, reason: collision with root package name */
    public static final a f6544h;

    /* renamed from: i, reason: collision with root package name */
    public static final a f6545i;

    /* renamed from: j, reason: collision with root package name */
    public static final a f6546j;

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ a[] f6547k;

    static {
        a aVar = new a("Game", 0);
        f6543g = aVar;
        a aVar2 = new a("Shop", 1);
        f6544h = aVar2;
        a aVar3 = new a("Rules", 2);
        f6545i = aVar3;
        a aVar4 = new a("Statistics", 3);
        f6546j = aVar4;
        f6547k = new a[]{aVar, aVar2, aVar3, aVar4};
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f6547k.clone();
    }
}
