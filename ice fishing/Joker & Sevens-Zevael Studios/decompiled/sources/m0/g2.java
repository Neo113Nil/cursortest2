package m0;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class g2 extends fc.a implements yc.w {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ x0.b f4593h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ h2 f4594i;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public g2(x0.b bVar, h2 h2Var) {
        super(r0);
        yc.v vVar = yc.v.f8909g;
        this.f4593h = bVar;
        this.f4594i = h2Var;
    }

    @Override // yc.w
    public final void q(fc.i iVar, Throwable th) {
        x0.b bVar = this.f4593h;
        h2 h2Var = this.f4594i;
        u5.d.l(th, new y1(5, bVar, h2Var));
        yc.w wVar = (yc.w) h2Var.f4606g.v(yc.v.f8909g);
        if (wVar == null) {
            throw th;
        }
        wVar.q(iVar, th);
    }
}
