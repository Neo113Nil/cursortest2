package D1;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: b, reason: collision with root package name */
    public static final n f551b = new n(2);

    /* renamed from: c, reason: collision with root package name */
    public static final n f552c = new n(0);

    /* renamed from: d, reason: collision with root package name */
    public static final n f553d;

    /* renamed from: e, reason: collision with root package name */
    public static final n f554e;

    /* renamed from: f, reason: collision with root package name */
    public static final n f555f;

    /* renamed from: g, reason: collision with root package name */
    public static final u1.g f556g;

    /* renamed from: h, reason: collision with root package name */
    public static final boolean f557h;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f558a;

    static {
        n nVar = new n(1);
        f553d = nVar;
        f554e = new n(3);
        f555f = nVar;
        f556g = u1.g.a(nVar, "com.bumptech.glide.load.resource.bitmap.Downsampler.DownsampleStrategy");
        f557h = true;
    }

    public /* synthetic */ n(int i) {
        this.f558a = i;
    }

    public final int a(int i, int i4, int i6, int i9) {
        switch (this.f558a) {
            case 0:
                if (b(i, i4, i6, i9) != 1.0f) {
                    break;
                }
                break;
            case 2:
                if (f557h) {
                }
                break;
        }
        return 2;
    }

    public final float b(int i, int i4, int i6, int i9) {
        switch (this.f558a) {
            case 0:
                return Math.min(1.0f, f551b.b(i, i4, i6, i9));
            case 1:
                return Math.max(i6 / i, i9 / i4);
            case 2:
                if (f557h) {
                    return Math.min(i6 / i, i9 / i4);
                }
                if (Math.max(i4 / i9, i / i6) == 0) {
                    return 1.0f;
                }
                return 1.0f / Integer.highestOneBit(r2);
            default:
                return 1.0f;
        }
    }
}
