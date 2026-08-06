package J1;

import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f826n = 0;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f827a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f828b;

    /* renamed from: c, reason: collision with root package name */
    public final int f829c;

    /* renamed from: d, reason: collision with root package name */
    public final int f830d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f831e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f832f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f833g;

    /* renamed from: h, reason: collision with root package name */
    public final int f834h;

    /* renamed from: i, reason: collision with root package name */
    public final int f835i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f836j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f837k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f838l;

    /* renamed from: m, reason: collision with root package name */
    public String f839m;

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        kotlin.jvm.internal.i.e(timeUnit, "timeUnit");
        timeUnit.toSeconds(Integer.MAX_VALUE);
    }

    public c(boolean z2, boolean z3, int i2, int i3, boolean z4, boolean z5, boolean z6, int i4, int i5, boolean z7, boolean z8, boolean z9, String str) {
        this.f827a = z2;
        this.f828b = z3;
        this.f829c = i2;
        this.f830d = i3;
        this.f831e = z4;
        this.f832f = z5;
        this.f833g = z6;
        this.f834h = i4;
        this.f835i = i5;
        this.f836j = z7;
        this.f837k = z8;
        this.f838l = z9;
        this.f839m = str;
    }

    public final String toString() {
        String str = this.f839m;
        if (str != null) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        if (this.f827a) {
            sb.append("no-cache, ");
        }
        if (this.f828b) {
            sb.append("no-store, ");
        }
        int i2 = this.f829c;
        if (i2 != -1) {
            sb.append("max-age=");
            sb.append(i2);
            sb.append(", ");
        }
        int i3 = this.f830d;
        if (i3 != -1) {
            sb.append("s-maxage=");
            sb.append(i3);
            sb.append(", ");
        }
        if (this.f831e) {
            sb.append("private, ");
        }
        if (this.f832f) {
            sb.append("public, ");
        }
        if (this.f833g) {
            sb.append("must-revalidate, ");
        }
        int i4 = this.f834h;
        if (i4 != -1) {
            sb.append("max-stale=");
            sb.append(i4);
            sb.append(", ");
        }
        int i5 = this.f835i;
        if (i5 != -1) {
            sb.append("min-fresh=");
            sb.append(i5);
            sb.append(", ");
        }
        if (this.f836j) {
            sb.append("only-if-cached, ");
        }
        if (this.f837k) {
            sb.append("no-transform, ");
        }
        if (this.f838l) {
            sb.append("immutable, ");
        }
        if (sb.length() == 0) {
            return "";
        }
        sb.delete(sb.length() - 2, sb.length());
        String sb2 = sb.toString();
        kotlin.jvm.internal.i.d(sb2, "StringBuilder().apply(builderAction).toString()");
        this.f839m = sb2;
        return sb2;
    }
}
