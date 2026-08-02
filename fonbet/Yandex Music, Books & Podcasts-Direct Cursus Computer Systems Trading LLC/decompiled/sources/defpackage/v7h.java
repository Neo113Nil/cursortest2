package defpackage;

import java.util.Iterator;

/* loaded from: classes5.dex */
public final class v7h implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ j8h b;

    public /* synthetic */ v7h(j8h j8hVar, int i) {
        this.a = i;
        this.b = j8hVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.r(true);
                return;
            case 1:
                j8h j8hVar = this.b;
                if (j8hVar.F.get() || j8hVar.w == null) {
                    return;
                }
                j8hVar.r(false);
                j8h.o(j8hVar);
                return;
            case 2:
                this.b.s();
                if (this.b.x != null) {
                    this.b.x.getClass();
                }
                a8h a8hVar = this.b.w;
                if (a8hVar != null) {
                    ((ceg) a8hVar.a.c).x();
                    return;
                }
                return;
            case 3:
                j8h j8hVar2 = this.b;
                if (j8hVar2.F.get()) {
                    return;
                }
                if (j8hVar2.v) {
                    j8hVar2.m.e();
                    if (j8hVar2.v) {
                        j8hVar2.u.B();
                    }
                }
                Iterator it = j8hVar2.z.iterator();
                while (it.hasNext()) {
                    owe oweVar = (owe) it.next();
                    oweVar.j.execute(new gwe(oweVar, 2));
                }
                Iterator it2 = j8hVar2.C.iterator();
                if (it2.hasNext()) {
                    throw hrg.j(it2);
                }
                return;
            case 4:
                j8h j8hVar3 = this.b;
                j8hVar3.N.I(2, "Entering SHUTDOWN state");
                j8hVar3.r.i(r76.e);
                return;
            case 5:
                j8h j8hVar4 = this.b;
                if (j8hVar4.G) {
                    return;
                }
                j8hVar4.G = true;
                j8h.p(j8hVar4);
                return;
            default:
                j8h j8hVar5 = this.b;
                if (j8hVar5.w == null) {
                    return;
                }
                j8h.o(j8hVar5);
                return;
        }
    }
}
