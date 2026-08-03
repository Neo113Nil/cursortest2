package v1;

import java.util.Map;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class u implements f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7135a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f7136b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Map f7137c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ oc.c f7138d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ v f7139e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ a0 f7140f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ oc.c f7141g;

    public u(int i10, int i11, Map map, oc.c cVar, v vVar, a0 a0Var, oc.c cVar2) {
        this.f7135a = i10;
        this.f7136b = i11;
        this.f7137c = map;
        this.f7138d = cVar;
        this.f7139e = vVar;
        this.f7140f = a0Var;
        this.f7141g = cVar2;
    }

    @Override // v1.f0
    public final Map a() {
        return this.f7137c;
    }

    @Override // v1.f0
    public final void b() {
        x1.r rVar;
        x1.g0 g0Var = this.f7140f.f7052g;
        boolean t3 = this.f7139e.t();
        oc.c cVar = this.f7141g;
        if (!t3 || (rVar = g0Var.I.f7988c.U) == null) {
            cVar.invoke(g0Var.I.f7988c.f8127r);
        } else {
            cVar.invoke(rVar.f8127r);
        }
    }

    @Override // v1.f0
    public final int c() {
        return this.f7136b;
    }

    @Override // v1.f0
    public final oc.c d() {
        return this.f7138d;
    }

    @Override // v1.f0
    public final int e() {
        return this.f7135a;
    }
}
