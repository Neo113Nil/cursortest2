package defpackage;

/* loaded from: classes4.dex */
public final class e13 implements rzm {
    public final /* synthetic */ int a = 0;
    public final rzm b;
    public final szm c;

    public e13(rzm rzmVar, rzm rzmVar2) {
        this.b = rzmVar;
        this.c = rzmVar2;
    }

    @Override // defpackage.szm
    public final Object get() {
        switch (this.a) {
            case 0:
                t28 t28Var = (t28) this.b.get();
                g0c g0cVar = (g0c) this.c.get();
                t28Var.getClass();
                g0cVar.getClass();
                return new hos(t28Var, g0cVar);
            case 1:
                bxi bxiVar = (bxi) this.b.get();
                g0c g0cVar2 = (g0c) this.c.get();
                bxiVar.getClass();
                g0cVar2.getClass();
                return new zfm();
            default:
                xyi xyiVar = (xyi) this.c.get();
                qac qacVar = (qac) this.b.get();
                xyiVar.getClass();
                qacVar.getClass();
                return new ogp();
        }
    }

    public e13(z6u z6uVar, szm szmVar, rzm rzmVar) {
        this.c = szmVar;
        this.b = rzmVar;
    }

    public e13(l48 l48Var, rzm rzmVar, toe toeVar) {
        this.b = rzmVar;
        this.c = toeVar;
    }
}
