package defpackage;

import androidx.media3.session.i;
import java.util.List;

/* loaded from: classes.dex */
public final /* synthetic */ class aj7 implements ycg, qlh, dvh, fvh, ua6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;

    public /* synthetic */ aj7(long j, Object obj, int i) {
        this.c = obj;
        this.a = i;
        this.b = j;
    }

    @Override // defpackage.ua6
    public void accept(Object obj) {
        vpr vprVar = (vpr) this.c;
        uv6 uv6Var = (uv6) obj;
        vq1.B(vprVar.h);
        byte[] s = ofc.s(uv6Var.c, uv6Var.a);
        d7k d7kVar = vprVar.c;
        d7kVar.getClass();
        d7kVar.F(s.length, s);
        vprVar.a.b(d7kVar, s.length, 0);
        long j = uv6Var.b;
        dsc dscVar = vprVar.h;
        long j2 = this.b;
        if (j == -9223372036854775807L) {
            vq1.A(dscVar.s == Long.MAX_VALUE);
        } else {
            long j3 = dscVar.s;
            j2 = j3 == Long.MAX_VALUE ? j2 + j : j + j3;
        }
        vprVar.a.a(j2, this.a | 1, s.length, 0, null);
    }

    @Override // defpackage.qlh
    public void b(c9e c9eVar, int i) {
        ulh ulhVar = (ulh) this.c;
        c9eVar.n0(ulhVar.c, i, this.a, this.b);
    }

    @Override // defpackage.dvh
    public void e(lrl lrlVar, wrh wrhVar) {
        gvh gvhVar = (gvh) this.c;
        lrlVar.e0(gvhVar.M0(wrhVar, lrlVar, this.a), this.b);
    }

    @Override // defpackage.fvh
    public Object h(i iVar, wrh wrhVar, int i) {
        List list = (List) this.c;
        int i2 = this.a;
        return iVar.s(wrhVar, list, i2 == -1 ? iVar.t.v0() : i2, i2 == -1 ? iVar.t.J0() : this.b);
    }

    @Override // defpackage.ycg
    public void invoke(Object obj) {
        c80 c80Var = (c80) this.c;
        ((d80) obj).Y(this.a, this.b, c80Var);
    }

    public /* synthetic */ aj7(c80 c80Var, int i, long j, long j2) {
        this.c = c80Var;
        this.a = i;
        this.b = j;
    }

    public /* synthetic */ aj7(vpr vprVar, long j, int i) {
        this.c = vprVar;
        this.b = j;
        this.a = i;
    }
}
