package defpackage;

import com.connectsdk.service.webos.lgcast.common.utils.StringUtil;
import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class rm implements ufg {
    public final vjg a;
    public final oq7 b;
    public final fm c;
    public final hwl d;
    public final sy7 e;
    public final xdr f;
    public final fkn g;

    public rm(vjg vjgVar, oq7 oq7Var, fm fmVar, hwl hwlVar, sy7 sy7Var) {
        vjgVar.getClass();
        oq7Var.getClass();
        fmVar.getClass();
        hwlVar.getClass();
        sy7Var.getClass();
        this.a = vjgVar;
        this.b = oq7Var;
        this.c = fmVar;
        this.d = hwlVar;
        this.e = sy7Var;
        xdr a = ydr.a(new hm(vjgVar.c));
        this.f = a;
        this.g = new fkn(a);
    }

    @Override // defpackage.rnq
    public final drf a() {
        return this.a;
    }

    @Override // defpackage.ufg
    public final pjc f(mm6 mm6Var, boolean z) {
        pjc k0;
        n7q n7qVar;
        n7q n7qVar2;
        mm6Var.getClass();
        oq7 oq7Var = this.b;
        d6l x = p6g.x((e6l) oq7Var.a.c.getValue());
        Continuation continuation = null;
        mwk b = (x == null || (n7qVar2 = x.a) == null) ? null : n7qVar2.b();
        mqs a = b != null ? b.a() : null;
        if (a == null) {
            xdr xdrVar = this.f;
            gm gmVar = gm.a;
            xdrVar.getClass();
            xdrVar.m(null, gmVar);
            d6l x2 = p6g.x((e6l) oq7Var.a.c.getValue());
            ssg.a(5, "AddTrackToPlaylistBlock", "cannot get track from state, currentPlayable: " + ((x2 == null || (n7qVar = x2.a) == null) ? null : n7qVar.b()), null);
            return new fs(15, new c73(a()));
        }
        ssg.a(3, "AddTrackToPlaylistBlock", "get playlists for track " + a.d() + StringUtil.SPACE + a.c, null);
        fm fmVar = this.c;
        fmVar.getClass();
        jul julVar = (jul) fmVar.b.getValue();
        julVar.getClass();
        eno c = new cus().c(a);
        oul oulVar = julVar.b;
        klg klgVar = oulVar.b;
        String str = oulVar.c.c().a;
        str.getClass();
        jyr jyrVar = i2q.e;
        if (lsq.v()) {
            l18 l18Var = l18.b;
            bdt I = hag.I(frt.class);
            qdc qdcVar = l18Var.a;
            qdcVar.getClass();
            ((frt) qdcVar.C(I)).c().a.getClass();
            xlg a2 = klgVar.a();
            String str2 = a2.e.c().a;
            str2.getClass();
            k0 = zsd.k0(a2.f.f(str2, new String[]{"playlist"}, new qlg(a2, str2, 3, null)), dm6.a);
        } else {
            k0 = zsd.k0(klgVar.c.d(str, 3, t75.c("3")), dm6.a);
        }
        return new qm(new em(new u21(10, c, k0, new gul(julVar, a, continuation, 1)), 0), this, a, b, 0);
    }
}
