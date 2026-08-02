package defpackage;

import android.content.Context;
import com.yandex.go.requirements.comment.api.summary.data.models.CommentViewSource;
import com.yandex.go.requirements.comment.summary.ui.v3.data.a;
import com.yandex.go.requirements.comment.summary.ui.v3.data.c;
import com.yandex.go.requirements.comment.summary.ui.v3.data.h;
import com.yandex.go.requirements.comment.summary.ui.v3.domain.s;
import com.yandex.go.requirements.comment.summary.ui.v3.domain.t;
import com.yandex.go.route.interactor.b;

/* loaded from: classes13.dex */
public final class w extends u {
    public final i6r D;

    public w(i6r i6rVar) {
        this.D = i6rVar;
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        CommentViewSource commentViewSource = ((z) obj).a;
        i6r i6rVar = this.D;
        i6rVar.getClass();
        commentViewSource.getClass();
        xvf0 b = i5m.b(new cys0((xvf0) x5v0.a, (xvf0) new fwf(i6rVar, 0), 16));
        xvf0 b2 = i5m.b(fo21.a);
        xvf0 b3 = i5m.b(qli0.a);
        c0g c0gVar = (c0g) i6rVar;
        Context e2 = c0gVar.e2();
        q5z.h(e2);
        w030 C2 = c0gVar.C2();
        q5z.h(C2);
        zuj0 N2 = c0gVar.N2();
        q5z.h(N2);
        tt2 Z1 = c0gVar.Z1();
        q5z.h(Z1);
        c cVar = (c) b.get();
        h hVar = (h) b2.get();
        h hVar2 = (h) b2.get();
        pli0 pli0Var = (pli0) b3.get();
        c0g c0gVar2 = (c0g) i6rVar;
        dqe0 I2 = c0gVar2.I2();
        q5z.h(I2);
        wiq0 S2 = c0gVar2.S2();
        q5z.h(S2);
        b g = c0gVar2.g();
        q5z.h(g);
        s sVar = new s(I2, S2, g, c0gVar2.A.a.L());
        d0g d0gVar = c0gVar.A.a;
        d0gVar.getClass();
        zzf zzfVar = d0gVar.a;
        com.yandex.go.requirements.comment.summary.ui.v3.domain.b bVar = new com.yandex.go.requirements.comment.summary.ui.v3.domain.b(N2, Z1, cVar, hVar, new zmc(hVar2, pli0Var, sVar, new a((on2) zzfVar.w0.get(), new rz0((rqo) zzfVar.C.get(), 8)), new umc(), new rz0((rqo) d0gVar.a.C.get(), 8), commentViewSource));
        c29 c29Var = new c29(23, new c1x0((h) b2.get()));
        c1x0 c1x0Var = new c1x0((h) b2.get());
        c cVar2 = (c) b.get();
        c0g c0gVar3 = (c0g) i6rVar;
        dqe0 I22 = c0gVar3.I2();
        q5z.h(I22);
        wiq0 S22 = c0gVar3.S2();
        q5z.h(S22);
        b g2 = c0gVar3.g();
        q5z.h(g2);
        s sVar2 = new s(I22, S22, g2, c0gVar3.A.a.L());
        zzf zzfVar2 = d0gVar.a;
        t tVar = new t(cVar2, sVar2, new rz0((rqo) zzfVar2.C.get(), 7));
        zzf zzfVar3 = c0gVar.z;
        amc amcVar = (amc) zzfVar3.Vi.get();
        q5z.h(amcVar);
        h hVar3 = (h) b2.get();
        pli0 pli0Var2 = (pli0) b3.get();
        amc amcVar2 = (amc) zzfVar3.Vi.get();
        q5z.h(amcVar2);
        f580 f580Var = new f580((dqe0) zzfVar2.s2.get(), (arv0) zzfVar2.c9.get(), zzfVar2.x1(), new mb30((pho) zzfVar2.d0.get()), new ps21((pho) zzfVar2.d0.get()));
        wiq0 S23 = c0gVar.S2();
        q5z.h(S23);
        z(new t(e2, C2, bVar, new com.yandex.go.requirements.comment.summary.ui.v3.domain.a(c29Var, c1x0Var, tVar, amcVar, new v920(commentViewSource, hVar3, pli0Var2, amcVar2, f580Var, S23))), new v(this));
    }
}
