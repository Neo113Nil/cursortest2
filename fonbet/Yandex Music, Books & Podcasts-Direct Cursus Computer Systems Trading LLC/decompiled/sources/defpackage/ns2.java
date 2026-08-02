package defpackage;

/* loaded from: classes4.dex */
public final class ns2 implements rzm {
    public final /* synthetic */ int a;
    public final rzm b;
    public final szm c;
    public final szm d;

    public ns2(cr crVar, rzm rzmVar, rzm rzmVar2, rzm rzmVar3) {
        this.a = 1;
        this.b = rzmVar;
        this.c = rzmVar2;
        this.d = rzmVar3;
    }

    @Override // defpackage.szm
    public final Object get() {
        int i = this.a;
        szm szmVar = this.d;
        rzm rzmVar = this.b;
        szm szmVar2 = this.c;
        switch (i) {
            case 0:
                g0c g0cVar = (g0c) szmVar2.get();
                x60 x60Var = (x60) rzmVar.get();
                b0j b0jVar = (b0j) szmVar.get();
                g0cVar.getClass();
                x60Var.getClass();
                b0jVar.getClass();
                return new ls2(g0cVar, x60Var, b0jVar);
            case 1:
                atj atjVar = (atj) rzmVar.get();
                wm wmVar = (wm) szmVar2.get();
                e7w e7wVar = (e7w) szmVar.get();
                atjVar.getClass();
                wmVar.getClass();
                e7wVar.getClass();
                return new x60(u75.j(e7wVar, atjVar), wmVar);
            default:
                lnd lndVar = (lnd) szmVar2.get();
                tbk tbkVar = (tbk) rzmVar.get();
                mnd mndVar = (mnd) szmVar.get();
                lndVar.getClass();
                tbkVar.getClass();
                mndVar.getClass();
                return new end(lndVar, tbkVar, mndVar);
        }
    }

    public /* synthetic */ ns2(Object obj, rzm rzmVar, rzm rzmVar2, rzm rzmVar3, int i) {
        this.a = i;
        this.c = rzmVar;
        this.b = rzmVar2;
        this.d = rzmVar3;
    }
}
