package b6;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class b {

    /* renamed from: A, reason: collision with root package name */
    public static final b f5558A;

    /* renamed from: B, reason: collision with root package name */
    public static final /* synthetic */ b[] f5559B;

    /* renamed from: n, reason: collision with root package name */
    public static final b f5560n;

    /* renamed from: u, reason: collision with root package name */
    public static final b f5561u;

    /* renamed from: v, reason: collision with root package name */
    public static final b f5562v;

    /* renamed from: w, reason: collision with root package name */
    public static final b f5563w;

    /* renamed from: x, reason: collision with root package name */
    public static final b f5564x;

    /* renamed from: y, reason: collision with root package name */
    public static final b f5565y;

    /* renamed from: z, reason: collision with root package name */
    public static final b f5566z;

    static {
        b bVar = new b("STRING", 0);
        f5560n = bVar;
        b bVar2 = new b("BOOLEAN", 1);
        f5561u = bVar2;
        b bVar3 = new b("LONG", 2);
        f5562v = bVar3;
        b bVar4 = new b("DOUBLE", 3);
        f5563w = bVar4;
        b bVar5 = new b("STRING_ARRAY", 4);
        f5564x = bVar5;
        b bVar6 = new b("BOOLEAN_ARRAY", 5);
        f5565y = bVar6;
        b bVar7 = new b("LONG_ARRAY", 6);
        f5566z = bVar7;
        b bVar8 = new b("DOUBLE_ARRAY", 7);
        f5558A = bVar8;
        f5559B = new b[]{bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, bVar8};
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f5559B.clone();
    }
}
