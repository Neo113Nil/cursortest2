package defpackage;

/* loaded from: classes5.dex */
public final class gwe implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ owe b;

    public /* synthetic */ gwe(owe oweVar, int i) {
        this.a = i;
        this.b = oweVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                owe oweVar = this.b;
                oweVar.o = null;
                oweVar.i.I(2, "CONNECTING after backoff");
                owe.e(oweVar, r76.a);
                owe.g(oweVar);
                break;
            case 1:
                if (this.b.v.a == r76.d) {
                    this.b.i.I(2, "CONNECTING as requested");
                    owe.e(this.b, r76.a);
                    owe.g(this.b);
                    break;
                }
                break;
            case 2:
                if (this.b.v.a == r76.c) {
                    owe oweVar2 = this.b;
                    oweVar2.j.e();
                    rjp rjpVar = oweVar2.o;
                    if (rjpVar != null) {
                        rjpVar.c();
                        oweVar2.o = null;
                        oweVar2.m = null;
                    }
                    this.b.i.I(2, "CONNECTING; backoff interrupted");
                    owe.e(this.b, r76.a);
                    owe.g(this.b);
                    break;
                }
                break;
            default:
                owe oweVar3 = this.b;
                oweVar3.i.I(2, "Terminated");
                j8h j8hVar = ((i8h) oweVar3.d.c).k;
                j8hVar.z.remove(oweVar3);
                lte.b(j8hVar.O.c, oweVar3);
                j8h.q(j8hVar);
                break;
        }
    }
}
