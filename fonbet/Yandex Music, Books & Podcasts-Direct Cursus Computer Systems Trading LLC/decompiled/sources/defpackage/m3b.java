package defpackage;

/* loaded from: classes.dex */
public final class m3b implements c3b {
    public fes b;
    public String a = "";
    public int c = Integer.MAX_VALUE;
    public ukd d = skd.a;

    @Override // defpackage.c3b
    public final void a(ukd ukdVar) {
        this.d = ukdVar;
    }

    @Override // defpackage.c3b
    public final ukd b() {
        return this.d;
    }

    @Override // defpackage.c3b
    public final c3b copy() {
        m3b m3bVar = new m3b();
        m3bVar.d = this.d;
        m3bVar.a = this.a;
        m3bVar.b = this.b;
        m3bVar.c = this.c;
        return m3bVar;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EmittableText(");
        sb.append(this.a);
        sb.append(", style=");
        sb.append(this.b);
        sb.append(", modifier=");
        sb.append(this.d);
        sb.append(", maxLines=");
        return vz1.r(sb, this.c, ')');
    }
}
