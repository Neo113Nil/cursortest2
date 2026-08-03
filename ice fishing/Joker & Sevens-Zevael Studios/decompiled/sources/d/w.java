package d;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class w implements d {

    /* renamed from: g, reason: collision with root package name */
    public final q f1547g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ y f1548h;

    public w(y yVar, q qVar) {
        pc.j.e(qVar, "onBackPressedCallback");
        this.f1548h = yVar;
        this.f1547g = qVar;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [oc.a, pc.h] */
    @Override // d.d
    public final void cancel() {
        y yVar = this.f1548h;
        bc.k kVar = yVar.f1551b;
        q qVar = this.f1547g;
        kVar.remove(qVar);
        if (pc.j.a(yVar.f1552c, qVar)) {
            qVar.getClass();
            yVar.f1552c = null;
        }
        qVar.f1532b.remove(this);
        ?? r02 = qVar.f1533c;
        if (r02 != 0) {
            r02.invoke();
        }
        qVar.f1533c = null;
    }
}
