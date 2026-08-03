package g7;

import java.util.concurrent.Executor;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class j implements l, e, d, b {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f2540g;

    /* renamed from: h, reason: collision with root package name */
    public final Executor f2541h;

    /* renamed from: i, reason: collision with root package name */
    public final a f2542i;

    /* renamed from: j, reason: collision with root package name */
    public final o f2543j;

    public /* synthetic */ j(Executor executor, a aVar, o oVar, int i10) {
        this.f2540g = i10;
        this.f2541h = executor;
        this.f2542i = aVar;
        this.f2543j = oVar;
    }

    @Override // g7.l
    public final void a(o oVar) {
        switch (this.f2540g) {
            case 0:
                this.f2541h.execute(new dd.i(3, this, oVar));
                break;
            default:
                this.f2541h.execute(new dd.i(4, this, oVar));
                break;
        }
    }

    @Override // g7.b
    public void b() {
        this.f2543j.m();
    }

    @Override // g7.e
    public void d(Object obj) {
        this.f2543j.l(obj);
    }

    @Override // g7.d
    public void j(Exception exc) {
        this.f2543j.k(exc);
    }
}
