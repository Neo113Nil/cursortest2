package defpackage;

import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final /* synthetic */ class rfw implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ufw b;

    public /* synthetic */ rfw(ufw ufwVar, int i) {
        this.a = i;
        this.b = ufwVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return (sfn) this.b.a.u.getValue();
            case 1:
                return (f5v) this.b.a.t.getValue();
            case 2:
                return new tfw(this.b);
            case 3:
                return (wfw) this.b.a.a.getValue();
            case 4:
                return (dew) this.b.a.d.getValue();
            case 5:
                blw blwVar = this.b.a;
                return new amw((oq7) blwVar.q.getValue(), (k1l) blwVar.r.getValue(), (k1l) blwVar.s.getValue());
            case 6:
                blw blwVar2 = this.b.a;
                return new hmw(((oq7) blwVar2.q.getValue()).a, (q7l) blwVar2.v.getValue(), (y3l) blwVar2.w.getValue(), (k1l) blwVar2.r.getValue(), (k1l) blwVar2.s.getValue(), (pfn) blwVar2.N.getValue(), (q9w) blwVar2.n.getValue(), blwVar2.O.n);
            case 7:
                return (jmw) this.b.a.g.getValue();
            case 8:
                return (rlw) this.b.a.l.getValue();
            case 9:
                return new msw((e2l) this.b.a.x.getValue());
            case 10:
                blw blwVar3 = this.b.a;
                return new cew((wdw) blwVar3.e.getValue(), (elw) blwVar3.z.getValue(), (fos) blwVar3.A.getValue(), (hwd) blwVar3.B.getValue(), (z66) blwVar3.C.getValue(), (frt) blwVar3.D.getValue(), blwVar3.E);
            case 11:
                return (ndw) this.b.a.f.getValue();
            case 12:
                return new sfw(this.b);
            case 13:
                return (fiw) this.b.a.j.getValue();
            case 14:
                return (hhw) this.b.a.k.getValue();
            case 15:
                return (jqw) this.b.a.i.getValue();
            case 16:
                return new ecw(this.b.a.y);
            case 17:
                return (rgw) this.b.a.b.getValue();
            default:
                return (biw) this.b.a.c.getValue();
        }
    }
}
