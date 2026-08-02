package defpackage;

/* loaded from: classes.dex */
public final class h3b implements c3b {
    public ukd a = skd.a;

    @Override // defpackage.c3b
    public final void a(ukd ukdVar) {
        this.a = ukdVar;
    }

    @Override // defpackage.c3b
    public final ukd b() {
        return this.a;
    }

    @Override // defpackage.c3b
    public final c3b copy() {
        h3b h3bVar = new h3b();
        h3bVar.a = this.a;
        return h3bVar;
    }
}
