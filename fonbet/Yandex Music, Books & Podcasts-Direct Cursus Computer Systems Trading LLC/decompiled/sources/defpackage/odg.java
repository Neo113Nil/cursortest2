package defpackage;

/* loaded from: classes.dex */
public final class odg extends pdg implements uyf {
    public final dzf e;
    public final /* synthetic */ qdg f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public odg(qdg qdgVar, dzf dzfVar, xjj xjjVar) {
        super(qdgVar, xjjVar);
        this.f = qdgVar;
        this.e = dzfVar;
    }

    @Override // defpackage.uyf
    public final void Q(dzf dzfVar, kyf kyfVar) {
        dzf dzfVar2 = this.e;
        lyf b = dzfVar2.getLifecycle().b();
        if (b == lyf.a) {
            this.f.j(this.a);
            return;
        }
        lyf lyfVar = null;
        while (lyfVar != b) {
            a(d());
            lyfVar = b;
            b = dzfVar2.getLifecycle().b();
        }
    }

    @Override // defpackage.pdg
    public final void b() {
        this.e.getLifecycle().d(this);
    }

    @Override // defpackage.pdg
    public final boolean c(dzf dzfVar) {
        return this.e == dzfVar;
    }

    @Override // defpackage.pdg
    public final boolean d() {
        return this.e.getLifecycle().b().compareTo(lyf.d) >= 0;
    }
}
