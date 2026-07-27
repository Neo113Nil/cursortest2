package B1;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: b, reason: collision with root package name */
    public static final n f137b = new n(2);

    /* renamed from: c, reason: collision with root package name */
    public static final n f138c = new n(0);

    /* renamed from: d, reason: collision with root package name */
    public static final n f139d;

    /* renamed from: e, reason: collision with root package name */
    public static final n f140e;

    /* renamed from: f, reason: collision with root package name */
    public static final n f141f;

    /* renamed from: g, reason: collision with root package name */
    public static final s1.g f142g;

    /* renamed from: h, reason: collision with root package name */
    public static final boolean f143h;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f144a;

    static {
        n nVar = new n(1);
        f139d = nVar;
        f140e = new n(3);
        f141f = nVar;
        f142g = s1.g.a(nVar, "com.bumptech.glide.load.resource.bitmap.Downsampler.DownsampleStrategy");
        f143h = true;
    }

    public /* synthetic */ n(int i) {
        this.f144a = i;
    }

    public final int a(int i, int i6, int i9, int i10) {
        switch (this.f144a) {
            case 0:
                if (b(i, i6, i9, i10) != 1.0f) {
                    break;
                }
                break;
            case 2:
                if (f143h) {
                }
                break;
        }
        return 2;
    }

    public final float b(int i, int i6, int i9, int i10) {
        switch (this.f144a) {
            case 0:
                return Math.min(1.0f, f137b.b(i, i6, i9, i10));
            case 1:
                return Math.max(i9 / i, i10 / i6);
            case 2:
                if (f143h) {
                    return Math.min(i9 / i, i10 / i6);
                }
                if (Math.max(i6 / i10, i / i9) == 0) {
                    return 1.0f;
                }
                return 1.0f / Integer.highestOneBit(r2);
            default:
                return 1.0f;
        }
    }
}
