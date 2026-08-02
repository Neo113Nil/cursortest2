package g8;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class t {

    /* renamed from: A, reason: collision with root package name */
    public static final /* synthetic */ C7.b f37772A;

    /* renamed from: v, reason: collision with root package name */
    public static final t f37773v;

    /* renamed from: w, reason: collision with root package name */
    public static final t f37774w;

    /* renamed from: x, reason: collision with root package name */
    public static final t f37775x;

    /* renamed from: y, reason: collision with root package name */
    public static final t f37776y;

    /* renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ t[] f37777z;

    /* renamed from: n, reason: collision with root package name */
    public final char f37778n;

    /* renamed from: u, reason: collision with root package name */
    public final char f37779u;

    static {
        t tVar = new t("OBJ", 0, '{', '}');
        f37773v = tVar;
        t tVar2 = new t("LIST", 1, '[', ']');
        f37774w = tVar2;
        t tVar3 = new t("MAP", 2, '{', '}');
        f37775x = tVar3;
        t tVar4 = new t("POLY_OBJ", 3, '[', ']');
        f37776y = tVar4;
        t[] tVarArr = {tVar, tVar2, tVar3, tVar4};
        f37777z = tVarArr;
        f37772A = X2.a.h(tVarArr);
    }

    public t(String str, int i, char c9, char c10) {
        this.f37778n = c9;
        this.f37779u = c10;
    }

    public static t valueOf(String str) {
        return (t) Enum.valueOf(t.class, str);
    }

    public static t[] values() {
        return (t[]) f37777z.clone();
    }
}
