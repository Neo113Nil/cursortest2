package i8;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class s {

    /* renamed from: A, reason: collision with root package name */
    public static final s f38339A;

    /* renamed from: B, reason: collision with root package name */
    public static final s f38340B;

    /* renamed from: C, reason: collision with root package name */
    public static final /* synthetic */ s[] f38341C;

    /* renamed from: u, reason: collision with root package name */
    public static final b f38342u;

    /* renamed from: v, reason: collision with root package name */
    public static final s f38343v;

    /* renamed from: w, reason: collision with root package name */
    public static final s f38344w;

    /* renamed from: x, reason: collision with root package name */
    public static final s f38345x;

    /* renamed from: y, reason: collision with root package name */
    public static final s f38346y;

    /* renamed from: z, reason: collision with root package name */
    public static final s f38347z;

    /* renamed from: n, reason: collision with root package name */
    public final String f38348n;

    static {
        s sVar = new s("HTTP_1_0", 0, "http/1.0");
        f38343v = sVar;
        s sVar2 = new s("HTTP_1_1", 1, "http/1.1");
        f38344w = sVar2;
        s sVar3 = new s("SPDY_3", 2, "spdy/3.1");
        f38345x = sVar3;
        s sVar4 = new s("HTTP_2", 3, "h2");
        f38346y = sVar4;
        s sVar5 = new s("H2_PRIOR_KNOWLEDGE", 4, "h2_prior_knowledge");
        f38347z = sVar5;
        s sVar6 = new s("QUIC", 5, "quic");
        f38339A = sVar6;
        s sVar7 = new s("HTTP_3", 6, "h3");
        f38340B = sVar7;
        s[] sVarArr = {sVar, sVar2, sVar3, sVar4, sVar5, sVar6, sVar7};
        f38341C = sVarArr;
        X2.a.h(sVarArr);
        f38342u = new b();
    }

    public s(String str, int i, String str2) {
        this.f38348n = str2;
    }

    public static s valueOf(String str) {
        return (s) Enum.valueOf(s.class, str);
    }

    public static s[] values() {
        return (s[]) f38341C.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f38348n;
    }
}
