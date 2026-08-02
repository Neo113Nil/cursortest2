package defpackage;

/* loaded from: classes4.dex */
public final class qs2 implements rzm {
    public final /* synthetic */ int a;
    public final cr b;
    public final rzm c;
    public final szm d;

    public /* synthetic */ qs2(cr crVar, rzm rzmVar, rzm rzmVar2, int i) {
        this.a = i;
        this.b = crVar;
        this.c = rzmVar;
        this.d = rzmVar2;
    }

    @Override // defpackage.szm
    public final Object get() {
        switch (this.a) {
            case 0:
                t28 t28Var = (t28) this.c.get();
                g0c g0cVar = (g0c) this.d.get();
                t28Var.getClass();
                g0cVar.getClass();
                cr crVar = this.b;
                return new tbk(wxf.Q((jdk) crVar.c), new yx3(((pyh) crVar.e).a), t28Var, ((ln) crVar.f).p, g0cVar);
            default:
                l9i l9iVar = (l9i) this.c.get();
                g0c g0cVar2 = (g0c) this.d.get();
                l9iVar.getClass();
                g0cVar2.getClass();
                jdk jdkVar = (jdk) this.b.c;
                czd czdVar = new czd();
                wxf.Q(jdkVar);
                return czdVar;
        }
    }
}
