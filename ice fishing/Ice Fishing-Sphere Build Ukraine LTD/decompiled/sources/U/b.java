package U;

/* loaded from: classes.dex */
public final class b implements h {

    /* renamed from: g, reason: collision with root package name */
    public static final b f1015g;

    /* renamed from: h, reason: collision with root package name */
    public static final b f1016h;

    /* renamed from: i, reason: collision with root package name */
    public static final b f1017i;

    /* renamed from: j, reason: collision with root package name */
    public static final b f1018j;

    /* renamed from: k, reason: collision with root package name */
    public static final b f1019k;

    /* renamed from: l, reason: collision with root package name */
    public static final b f1020l;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f1021e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f1022f;

    static {
        int i2 = 0;
        f1015g = new b("NONE", i2);
        f1016h = new b("FULL", i2);
        int i3 = 1;
        f1017i = new b("FLAT", i3);
        f1018j = new b("HALF_OPENED", i3);
        int i4 = 2;
        f1019k = new b("FOLD", i4);
        f1020l = new b("HINGE", i4);
    }

    public /* synthetic */ b(String str, int i2) {
        this.f1021e = i2;
        this.f1022f = str;
    }

    public String toString() {
        switch (this.f1021e) {
            case 0:
                return (String) this.f1022f;
            case 1:
                return (String) this.f1022f;
            case F.k.FLOAT_FIELD_NUMBER /* 2 */:
                return (String) this.f1022f;
            default:
                return super.toString();
        }
    }

    public b(V.a aVar) {
        this.f1021e = 3;
        int i2 = n.f1046b;
        this.f1022f = aVar;
    }
}
