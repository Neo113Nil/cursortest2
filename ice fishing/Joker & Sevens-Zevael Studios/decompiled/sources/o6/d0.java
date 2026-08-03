package o6;

import java.util.Set;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class d0 implements p6.b {

    /* renamed from: a, reason: collision with root package name */
    public final n6.a f5269a;

    /* renamed from: b, reason: collision with root package name */
    public final a f5270b;

    /* renamed from: c, reason: collision with root package name */
    public p6.g f5271c = null;

    /* renamed from: d, reason: collision with root package name */
    public Set f5272d = null;

    /* renamed from: e, reason: collision with root package name */
    public boolean f5273e = false;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ d f5274f;

    public d0(d dVar, n6.a aVar, a aVar2) {
        this.f5274f = dVar;
        this.f5269a = aVar;
        this.f5270b = aVar2;
    }

    @Override // p6.b
    public final void a(m6.b bVar) {
        this.f5274f.f5267m.post(new dd.i(16, this, bVar));
    }

    public final void b(m6.b bVar) {
        b0 b0Var = (b0) this.f5274f.f5264j.get(this.f5270b);
        if (b0Var != null) {
            b0Var.m(bVar);
        }
    }
}
