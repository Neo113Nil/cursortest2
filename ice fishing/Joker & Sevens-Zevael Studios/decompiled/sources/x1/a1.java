package x1;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class a1 {

    /* renamed from: a, reason: collision with root package name */
    public y0.m f7969a;

    /* renamed from: b, reason: collision with root package name */
    public int f7970b;

    /* renamed from: c, reason: collision with root package name */
    public o0.e f7971c;

    /* renamed from: d, reason: collision with root package name */
    public o0.e f7972d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f7973e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ c1 f7974f;

    public a1(c1 c1Var, y0.m mVar, int i10, o0.e eVar, o0.e eVar2, boolean z10) {
        this.f7974f = c1Var;
        this.f7969a = mVar;
        this.f7970b = i10;
        this.f7971c = eVar;
        this.f7972d = eVar2;
        this.f7973e = z10;
    }

    public final boolean a(int i10, int i11) {
        o0.e eVar = this.f7971c;
        int i12 = this.f7970b;
        y0.l lVar = (y0.l) eVar.f5134g[i10 + i12];
        y0.l lVar2 = (y0.l) this.f7972d.f5134g[i12 + i11];
        return pc.j.a(lVar, lVar2) || lVar.getClass() == lVar2.getClass();
    }
}
