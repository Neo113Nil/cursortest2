package i8;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class z {

    /* renamed from: A, reason: collision with root package name */
    public static final /* synthetic */ z[] f38265A;

    /* renamed from: u, reason: collision with root package name */
    public static final b f38266u;

    /* renamed from: v, reason: collision with root package name */
    public static final z f38267v;

    /* renamed from: w, reason: collision with root package name */
    public static final z f38268w;

    /* renamed from: x, reason: collision with root package name */
    public static final z f38269x;

    /* renamed from: y, reason: collision with root package name */
    public static final z f38270y;

    /* renamed from: z, reason: collision with root package name */
    public static final z f38271z;

    /* renamed from: n, reason: collision with root package name */
    public final String f38272n;

    static {
        z zVar = new z("TLS_1_3", 0, "TLSv1.3");
        f38267v = zVar;
        z zVar2 = new z("TLS_1_2", 1, "TLSv1.2");
        f38268w = zVar2;
        z zVar3 = new z("TLS_1_1", 2, "TLSv1.1");
        f38269x = zVar3;
        z zVar4 = new z("TLS_1_0", 3, "TLSv1");
        f38270y = zVar4;
        z zVar5 = new z("SSL_3_0", 4, "SSLv3");
        f38271z = zVar5;
        z[] zVarArr = {zVar, zVar2, zVar3, zVar4, zVar5};
        f38265A = zVarArr;
        com.bumptech.glide.e.b(zVarArr);
        f38266u = new b();
    }

    public z(String str, int i, String str2) {
        this.f38272n = str2;
    }

    public static z valueOf(String str) {
        return (z) Enum.valueOf(z.class, str);
    }

    public static z[] values() {
        return (z[]) f38265A.clone();
    }
}
