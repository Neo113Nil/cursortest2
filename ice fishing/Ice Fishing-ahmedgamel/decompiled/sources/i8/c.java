package i8;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f38198n = 0;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f38199a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f38200b;

    /* renamed from: c, reason: collision with root package name */
    public final int f38201c;

    /* renamed from: d, reason: collision with root package name */
    public final int f38202d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f38203e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f38204f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f38205g;

    /* renamed from: h, reason: collision with root package name */
    public final int f38206h;
    public final int i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f38207j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f38208k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f38209l;

    /* renamed from: m, reason: collision with root package name */
    public String f38210m;

    static {
        int i = R7.a.f2887w;
        R7.c unit = R7.c.f2893w;
        kotlin.jvm.internal.h.e(unit, "unit");
        long f2 = R7.a.f(unit.compareTo(unit) <= 0 ? S0.f.l(X2.a.d(Integer.MAX_VALUE, unit, R7.c.f2891u)) : S0.f.w(Integer.MAX_VALUE, unit), unit);
        if (f2 >= 0) {
            return;
        }
        throw new IllegalArgumentException(("maxStale < 0: " + f2).toString());
    }

    public c(boolean z6, boolean z9, int i, int i4, boolean z10, boolean z11, boolean z12, int i6, int i9, boolean z13, boolean z14, boolean z15, String str) {
        this.f38199a = z6;
        this.f38200b = z9;
        this.f38201c = i;
        this.f38202d = i4;
        this.f38203e = z10;
        this.f38204f = z11;
        this.f38205g = z12;
        this.f38206h = i6;
        this.i = i9;
        this.f38207j = z13;
        this.f38208k = z14;
        this.f38209l = z15;
        this.f38210m = str;
    }

    public final String toString() {
        String str = this.f38210m;
        if (str != null) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        if (this.f38199a) {
            sb.append("no-cache, ");
        }
        if (this.f38200b) {
            sb.append("no-store, ");
        }
        int i = this.f38201c;
        if (i != -1) {
            sb.append("max-age=");
            sb.append(i);
            sb.append(", ");
        }
        int i4 = this.f38202d;
        if (i4 != -1) {
            sb.append("s-maxage=");
            sb.append(i4);
            sb.append(", ");
        }
        if (this.f38203e) {
            sb.append("private, ");
        }
        if (this.f38204f) {
            sb.append("public, ");
        }
        if (this.f38205g) {
            sb.append("must-revalidate, ");
        }
        int i6 = this.f38206h;
        if (i6 != -1) {
            sb.append("max-stale=");
            sb.append(i6);
            sb.append(", ");
        }
        int i9 = this.i;
        if (i9 != -1) {
            sb.append("min-fresh=");
            sb.append(i9);
            sb.append(", ");
        }
        if (this.f38207j) {
            sb.append("only-if-cached, ");
        }
        if (this.f38208k) {
            sb.append("no-transform, ");
        }
        if (this.f38209l) {
            sb.append("immutable, ");
        }
        if (sb.length() == 0) {
            return "";
        }
        kotlin.jvm.internal.h.d(sb.delete(sb.length() - 2, sb.length()), "delete(...)");
        String sb2 = sb.toString();
        this.f38210m = sb2;
        return sb2;
    }
}
