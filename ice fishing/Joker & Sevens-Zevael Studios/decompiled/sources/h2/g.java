package h2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: g, reason: collision with root package name */
    public static final g f2662g;

    /* renamed from: h, reason: collision with root package name */
    public static final g f2663h;

    /* renamed from: i, reason: collision with root package name */
    public static final g f2664i;

    /* renamed from: j, reason: collision with root package name */
    public static final g f2665j;

    /* renamed from: k, reason: collision with root package name */
    public static final g f2666k;

    /* renamed from: l, reason: collision with root package name */
    public static final g f2667l;

    /* renamed from: m, reason: collision with root package name */
    public static final g f2668m;

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ g[] f2669n;

    static {
        g gVar = new g("Paragraph", 0);
        f2662g = gVar;
        g gVar2 = new g("Span", 1);
        f2663h = gVar2;
        g gVar3 = new g("VerbatimTts", 2);
        f2664i = gVar3;
        g gVar4 = new g("Url", 3);
        f2665j = gVar4;
        g gVar5 = new g("Link", 4);
        f2666k = gVar5;
        g gVar6 = new g("Clickable", 5);
        f2667l = gVar6;
        g gVar7 = new g("String", 6);
        f2668m = gVar7;
        f2669n = new g[]{gVar, gVar2, gVar3, gVar4, gVar5, gVar6, gVar7};
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) f2669n.clone();
    }
}
