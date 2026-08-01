package i8;

import a.AbstractC0422a;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f38079n = 0;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f38080a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f38081b;

    /* renamed from: c, reason: collision with root package name */
    public final int f38082c;

    /* renamed from: d, reason: collision with root package name */
    public final int f38083d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f38084e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f38085f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f38086g;

    /* renamed from: h, reason: collision with root package name */
    public final int f38087h;
    public final int i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f38088j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f38089k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f38090l;

    /* renamed from: m, reason: collision with root package name */
    public String f38091m;

    static {
        int i = R7.a.f2760w;
        R7.c unit = R7.c.f2766w;
        kotlin.jvm.internal.h.e(unit, "unit");
        long f3 = R7.a.f(unit.compareTo(unit) <= 0 ? AbstractC0422a.k(com.bumptech.glide.d.e(Integer.MAX_VALUE, unit, R7.c.f2764u)) : AbstractC0422a.w(Integer.MAX_VALUE, unit), unit);
        if (f3 >= 0) {
            return;
        }
        throw new IllegalArgumentException(("maxStale < 0: " + f3).toString());
    }

    public c(boolean z3, boolean z6, int i, int i6, boolean z9, boolean z10, boolean z11, int i9, int i10, boolean z12, boolean z13, boolean z14, String str) {
        this.f38080a = z3;
        this.f38081b = z6;
        this.f38082c = i;
        this.f38083d = i6;
        this.f38084e = z9;
        this.f38085f = z10;
        this.f38086g = z11;
        this.f38087h = i9;
        this.i = i10;
        this.f38088j = z12;
        this.f38089k = z13;
        this.f38090l = z14;
        this.f38091m = str;
    }

    public final String toString() {
        String str = this.f38091m;
        if (str != null) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        if (this.f38080a) {
            sb.append("no-cache, ");
        }
        if (this.f38081b) {
            sb.append("no-store, ");
        }
        int i = this.f38082c;
        if (i != -1) {
            sb.append("max-age=");
            sb.append(i);
            sb.append(", ");
        }
        int i6 = this.f38083d;
        if (i6 != -1) {
            sb.append("s-maxage=");
            sb.append(i6);
            sb.append(", ");
        }
        if (this.f38084e) {
            sb.append("private, ");
        }
        if (this.f38085f) {
            sb.append("public, ");
        }
        if (this.f38086g) {
            sb.append("must-revalidate, ");
        }
        int i9 = this.f38087h;
        if (i9 != -1) {
            sb.append("max-stale=");
            sb.append(i9);
            sb.append(", ");
        }
        int i10 = this.i;
        if (i10 != -1) {
            sb.append("min-fresh=");
            sb.append(i10);
            sb.append(", ");
        }
        if (this.f38088j) {
            sb.append("only-if-cached, ");
        }
        if (this.f38089k) {
            sb.append("no-transform, ");
        }
        if (this.f38090l) {
            sb.append("immutable, ");
        }
        if (sb.length() == 0) {
            return "";
        }
        kotlin.jvm.internal.h.d(sb.delete(sb.length() - 2, sb.length()), "delete(...)");
        String sb2 = sb.toString();
        this.f38091m = sb2;
        return sb2;
    }
}
