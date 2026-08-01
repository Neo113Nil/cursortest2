package i8;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class s {

    /* renamed from: A, reason: collision with root package name */
    public static final s f38220A;

    /* renamed from: B, reason: collision with root package name */
    public static final s f38221B;

    /* renamed from: C, reason: collision with root package name */
    public static final /* synthetic */ s[] f38222C;

    /* renamed from: u, reason: collision with root package name */
    public static final b f38223u;

    /* renamed from: v, reason: collision with root package name */
    public static final s f38224v;

    /* renamed from: w, reason: collision with root package name */
    public static final s f38225w;

    /* renamed from: x, reason: collision with root package name */
    public static final s f38226x;

    /* renamed from: y, reason: collision with root package name */
    public static final s f38227y;

    /* renamed from: z, reason: collision with root package name */
    public static final s f38228z;

    /* renamed from: n, reason: collision with root package name */
    public final String f38229n;

    static {
        s sVar = new s("HTTP_1_0", 0, "http/1.0");
        f38224v = sVar;
        s sVar2 = new s("HTTP_1_1", 1, "http/1.1");
        f38225w = sVar2;
        s sVar3 = new s("SPDY_3", 2, "spdy/3.1");
        f38226x = sVar3;
        s sVar4 = new s("HTTP_2", 3, "h2");
        f38227y = sVar4;
        s sVar5 = new s("H2_PRIOR_KNOWLEDGE", 4, "h2_prior_knowledge");
        f38228z = sVar5;
        s sVar6 = new s("QUIC", 5, "quic");
        f38220A = sVar6;
        s sVar7 = new s("HTTP_3", 6, "h3");
        f38221B = sVar7;
        s[] sVarArr = {sVar, sVar2, sVar3, sVar4, sVar5, sVar6, sVar7};
        f38222C = sVarArr;
        com.bumptech.glide.e.b(sVarArr);
        f38223u = new b();
    }

    public s(String str, int i, String str2) {
        this.f38229n = str2;
    }

    public static s valueOf(String str) {
        return (s) Enum.valueOf(s.class, str);
    }

    public static s[] values() {
        return (s[]) f38222C.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f38229n;
    }
}
