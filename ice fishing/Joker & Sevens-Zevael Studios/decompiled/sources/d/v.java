package d;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class v implements androidx.lifecycle.s, d {

    /* renamed from: g, reason: collision with root package name */
    public final androidx.lifecycle.w f1543g;

    /* renamed from: h, reason: collision with root package name */
    public final q f1544h;

    /* renamed from: i, reason: collision with root package name */
    public w f1545i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ y f1546j;

    public v(y yVar, androidx.lifecycle.w wVar, q qVar) {
        pc.j.e(qVar, "onBackPressedCallback");
        this.f1546j = yVar;
        this.f1543g = wVar;
        this.f1544h = qVar;
        wVar.a(this);
    }

    @Override // androidx.lifecycle.s
    public final void b(androidx.lifecycle.u uVar, androidx.lifecycle.o oVar) {
        if (oVar != androidx.lifecycle.o.ON_START) {
            if (oVar != androidx.lifecycle.o.ON_STOP) {
                if (oVar == androidx.lifecycle.o.ON_DESTROY) {
                    cancel();
                    return;
                }
                return;
            } else {
                w wVar = this.f1545i;
                if (wVar != null) {
                    wVar.cancel();
                    return;
                }
                return;
            }
        }
        y yVar = this.f1546j;
        yVar.getClass();
        q qVar = this.f1544h;
        pc.j.e(qVar, "onBackPressedCallback");
        yVar.f1551b.addLast(qVar);
        w wVar2 = new w(yVar, qVar);
        qVar.f1532b.add(wVar2);
        yVar.d();
        qVar.f1533c = new x(0, yVar, y.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0, 0, 1);
        this.f1545i = wVar2;
    }

    @Override // d.d
    public final void cancel() {
        this.f1543g.f(this);
        this.f1544h.f1532b.remove(this);
        w wVar = this.f1545i;
        if (wVar != null) {
            wVar.cancel();
        }
        this.f1545i = null;
    }
}
