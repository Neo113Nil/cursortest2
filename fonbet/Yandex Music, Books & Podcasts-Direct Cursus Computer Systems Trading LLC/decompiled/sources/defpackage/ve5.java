package defpackage;

import java.util.List;

/* loaded from: classes3.dex */
public final class ve5 {
    public final long a;
    public final gm5 b;
    public final gm5 c;
    public final gm5 d;
    public List e;

    public ve5(zzp zzpVar) {
        zzpVar.getClass();
        this.a = zzpVar.a();
        this.b = hld.j();
        this.c = hld.j();
        hld.j();
        this.d = hld.j();
        this.e = c5b.a;
    }

    public final void a(ze5 ze5Var) {
        this.d.U(ze5Var);
        boolean z = ze5Var instanceof ye5;
        gm5 gm5Var = this.c;
        if (z) {
            asj asjVar = ((ye5) ze5Var).a;
            this.b.U(asjVar.e);
            List list = asjVar.d;
            if (list != null) {
                gm5Var.U(list);
            }
        }
        if (ze5Var instanceof xe5) {
            gm5Var.U(c5b.a);
        }
    }
}
