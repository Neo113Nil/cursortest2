package h2;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final a f2686a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2687b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2688c;

    /* renamed from: d, reason: collision with root package name */
    public final int f2689d;

    /* renamed from: e, reason: collision with root package name */
    public final int f2690e;

    /* renamed from: f, reason: collision with root package name */
    public final float f2691f;

    /* renamed from: g, reason: collision with root package name */
    public final float f2692g;

    public n(a aVar, int i10, int i11, int i12, int i13, float f10, float f11) {
        this.f2686a = aVar;
        this.f2687b = i10;
        this.f2688c = i11;
        this.f2689d = i12;
        this.f2690e = i13;
        this.f2691f = f10;
        this.f2692g = f11;
    }

    public final int a(int i10) {
        int i11 = this.f2688c;
        int i12 = this.f2687b;
        return uc.e.h(i10, i12, i11) - i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return this.f2686a.equals(nVar.f2686a) && this.f2687b == nVar.f2687b && this.f2688c == nVar.f2688c && this.f2689d == nVar.f2689d && this.f2690e == nVar.f2690e && Float.compare(this.f2691f, nVar.f2691f) == 0 && Float.compare(this.f2692g, nVar.f2692g) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f2692g) + a4.d.b(this.f2691f, v.f.b(this.f2690e, v.f.b(this.f2689d, v.f.b(this.f2688c, v.f.b(this.f2687b, this.f2686a.hashCode() * 31, 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ParagraphInfo(paragraph=");
        sb.append(this.f2686a);
        sb.append(", startIndex=");
        sb.append(this.f2687b);
        sb.append(", endIndex=");
        sb.append(this.f2688c);
        sb.append(", startLineIndex=");
        sb.append(this.f2689d);
        sb.append(", endLineIndex=");
        sb.append(this.f2690e);
        sb.append(", top=");
        sb.append(this.f2691f);
        sb.append(", bottom=");
        return a4.d.k(sb, this.f2692g, ')');
    }
}
