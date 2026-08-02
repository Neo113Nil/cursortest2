package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class mth implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ sth b;
    public final /* synthetic */ lrl c;

    public /* synthetic */ mth(sth sthVar, lrl lrlVar, int i) {
        this.a = i;
        this.b = sthVar;
        this.c = lrlVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                sth sthVar = this.b;
                nsh nshVar = sthVar.l;
                lrl lrlVar = this.c;
                nshVar.Q(lrlVar.i1());
                sthVar.j.R(lrlVar.f0().a(17) ? lrlVar.V() : sis.a);
                break;
            default:
                this.b.l.Q(this.c.i1());
                break;
        }
    }
}
