package f0;

import h2.h0;
import h2.p;
import s2.l;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public String f2184a;

    /* renamed from: b, reason: collision with root package name */
    public h0 f2185b;

    /* renamed from: c, reason: collision with root package name */
    public k2.d f2186c;

    /* renamed from: d, reason: collision with root package name */
    public int f2187d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f2188e;

    /* renamed from: f, reason: collision with root package name */
    public int f2189f;

    /* renamed from: g, reason: collision with root package name */
    public int f2190g;

    /* renamed from: i, reason: collision with root package name */
    public s2.c f2192i;

    /* renamed from: j, reason: collision with root package name */
    public h2.a f2193j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f2194k;

    /* renamed from: m, reason: collision with root package name */
    public b f2196m;

    /* renamed from: n, reason: collision with root package name */
    public p f2197n;

    /* renamed from: o, reason: collision with root package name */
    public l f2198o;

    /* renamed from: h, reason: collision with root package name */
    public long f2191h = a.f2172a;

    /* renamed from: l, reason: collision with root package name */
    public long f2195l = i7.b.e(0, 0);

    /* renamed from: p, reason: collision with root package name */
    public long f2199p = s2.b.g(0, 0, 0, 0);

    public d(String str, h0 h0Var, k2.d dVar, int i10, boolean z10, int i11, int i12) {
        this.f2184a = str;
        this.f2185b = h0Var;
        this.f2186c = dVar;
        this.f2187d = i10;
        this.f2188e = z10;
        this.f2189f = i11;
        this.f2190g = i12;
    }

    public final void a() {
        this.f2193j = null;
        this.f2197n = null;
        this.f2198o = null;
        this.f2199p = s2.b.g(0, 0, 0, 0);
        this.f2195l = i7.b.e(0, 0);
        this.f2194k = false;
    }

    public final void b(s2.c cVar) {
        long j3;
        s2.c cVar2 = this.f2192i;
        if (cVar != null) {
            int i10 = a.f2173b;
            j3 = a.a(cVar.c(), cVar.m());
        } else {
            j3 = a.f2172a;
        }
        if (cVar2 == null) {
            this.f2192i = cVar;
            this.f2191h = j3;
        } else if (cVar == null || this.f2191h != j3) {
            this.f2192i = cVar;
            this.f2191h = j3;
            a();
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ParagraphLayoutCache(paragraph=");
        sb.append(this.f2193j != null ? "<paragraph>" : "null");
        sb.append(", lastDensity=");
        long j3 = this.f2191h;
        int i10 = a.f2173b;
        sb.append((Object) ("InlineDensity(density=" + Float.intBitsToFloat((int) (j3 >> 32)) + ", fontScale=" + Float.intBitsToFloat((int) (j3 & 4294967295L)) + ')'));
        sb.append(')');
        return sb.toString();
    }
}
