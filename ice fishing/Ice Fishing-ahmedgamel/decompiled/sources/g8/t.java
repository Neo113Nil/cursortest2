package g8;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class t {

    /* renamed from: A, reason: collision with root package name */
    public static final /* synthetic */ C7.b f37746A;

    /* renamed from: v, reason: collision with root package name */
    public static final t f37747v;

    /* renamed from: w, reason: collision with root package name */
    public static final t f37748w;

    /* renamed from: x, reason: collision with root package name */
    public static final t f37749x;

    /* renamed from: y, reason: collision with root package name */
    public static final t f37750y;

    /* renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ t[] f37751z;

    /* renamed from: n, reason: collision with root package name */
    public final char f37752n;

    /* renamed from: u, reason: collision with root package name */
    public final char f37753u;

    static {
        t tVar = new t("OBJ", 0, '{', '}');
        f37747v = tVar;
        t tVar2 = new t("LIST", 1, '[', ']');
        f37748w = tVar2;
        t tVar3 = new t("MAP", 2, '{', '}');
        f37749x = tVar3;
        t tVar4 = new t("POLY_OBJ", 3, '[', ']');
        f37750y = tVar4;
        t[] tVarArr = {tVar, tVar2, tVar3, tVar4};
        f37751z = tVarArr;
        f37746A = com.bumptech.glide.e.b(tVarArr);
    }

    public t(String str, int i, char c9, char c10) {
        this.f37752n = c9;
        this.f37753u = c10;
    }

    public static t valueOf(String str) {
        return (t) Enum.valueOf(t.class, str);
    }

    public static t[] values() {
        return (t[]) f37751z.clone();
    }
}
