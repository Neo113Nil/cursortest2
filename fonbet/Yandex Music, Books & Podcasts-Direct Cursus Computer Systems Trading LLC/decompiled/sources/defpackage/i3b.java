package defpackage;

/* loaded from: classes.dex */
public final class i3b implements c3b {
    public hce b;
    public rjs c;
    public ukd a = skd.a;
    public int d = 1;

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
        i3b i3bVar = new i3b();
        i3bVar.a = this.a;
        i3bVar.b = this.b;
        i3bVar.c = this.c;
        i3bVar.d = this.d;
        return i3bVar;
    }

    public final String toString() {
        return "EmittableImage(modifier=" + this.a + ", provider=" + this.b + ", colorFilterParams=" + this.c + ", contentScale=" + ((Object) id6.a(this.d)) + ')';
    }
}
