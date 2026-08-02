package defpackage;

/* loaded from: classes.dex */
public final class iej implements c8t {
    public final z8t a;
    public final sce b;

    public iej(z8t z8tVar, sce sceVar) {
        this.a = z8tVar;
        this.b = sceVar;
    }

    @Override // defpackage.c8t
    public final void a() {
        sce sceVar = this.b;
        boolean z = sceVar instanceof bqr;
        z8t z8tVar = this.a;
        if (z) {
            z8tVar.f(((bqr) sceVar).a);
        } else if (sceVar instanceof pgb) {
            z8tVar.p(((pgb) sceVar).a);
        }
    }
}
