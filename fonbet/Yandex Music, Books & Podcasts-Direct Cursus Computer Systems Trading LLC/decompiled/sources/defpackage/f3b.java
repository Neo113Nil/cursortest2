package defpackage;

/* loaded from: classes.dex */
public final class f3b implements c3b {
    public ukd a = skd.a;
    public b95 b = pum.a;

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
        f3b f3bVar = new f3b();
        f3bVar.a = this.a;
        f3bVar.b = this.b;
        return f3bVar;
    }

    public final String toString() {
        return "EmittableCircularProgressIndicator(modifier=" + this.a + ", color=" + this.b + ')';
    }
}
