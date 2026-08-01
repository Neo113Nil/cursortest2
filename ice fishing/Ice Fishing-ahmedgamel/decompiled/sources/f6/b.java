package f6;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class b {

    /* renamed from: A, reason: collision with root package name */
    public static final b f37514A;

    /* renamed from: B, reason: collision with root package name */
    public static final /* synthetic */ b[] f37515B;

    /* renamed from: n, reason: collision with root package name */
    public static final b f37516n;

    /* renamed from: u, reason: collision with root package name */
    public static final b f37517u;

    /* renamed from: v, reason: collision with root package name */
    public static final b f37518v;

    /* renamed from: w, reason: collision with root package name */
    public static final b f37519w;

    /* renamed from: x, reason: collision with root package name */
    public static final b f37520x;

    /* renamed from: y, reason: collision with root package name */
    public static final b f37521y;

    /* renamed from: z, reason: collision with root package name */
    public static final b f37522z;

    static {
        b bVar = new b("STRING", 0);
        f37516n = bVar;
        b bVar2 = new b("BOOLEAN", 1);
        f37517u = bVar2;
        b bVar3 = new b("LONG", 2);
        f37518v = bVar3;
        b bVar4 = new b("DOUBLE", 3);
        f37519w = bVar4;
        b bVar5 = new b("STRING_ARRAY", 4);
        f37520x = bVar5;
        b bVar6 = new b("BOOLEAN_ARRAY", 5);
        f37521y = bVar6;
        b bVar7 = new b("LONG_ARRAY", 6);
        f37522z = bVar7;
        b bVar8 = new b("DOUBLE_ARRAY", 7);
        f37514A = bVar8;
        f37515B = new b[]{bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, bVar8};
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f37515B.clone();
    }
}
