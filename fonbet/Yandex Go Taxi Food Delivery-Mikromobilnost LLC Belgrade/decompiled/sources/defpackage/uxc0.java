package defpackage;

/* loaded from: classes10.dex */
public final class uxc0 {
    public final gfr a = new gfr();

    public final void a(vxc0 vxc0Var) {
        hfr hfrVar = vxc0Var.a;
        gfr gfrVar = this.a;
        gfrVar.getClass();
        for (int i = 0; i < hfrVar.a.size(); i++) {
            gfrVar.a(hfrVar.a(i));
        }
    }

    public final void b(int i, boolean z) {
        gfr gfrVar = this.a;
        if (z) {
            gfrVar.a(i);
        } else {
            gfrVar.getClass();
        }
    }

    public final vxc0 c() {
        return new vxc0(this.a.b());
    }
}
