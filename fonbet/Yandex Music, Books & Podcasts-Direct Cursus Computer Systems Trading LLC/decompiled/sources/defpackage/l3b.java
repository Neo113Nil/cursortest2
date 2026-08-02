package defpackage;

/* loaded from: classes.dex */
public final class l3b implements c3b {
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
        l3b l3bVar = new l3b();
        l3bVar.a = this.a;
        return l3bVar;
    }

    public final String toString() {
        return "EmittableSpacer(modifier=" + this.a + ')';
    }
}
