package defpackage;

import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;

/* loaded from: classes3.dex */
public final class njt {
    public final kxi a;
    public final cvo b;
    public final zit c;
    public final jkt d;
    public final kpm e;
    public final xdr f;
    public final xdr g;

    public njt(kxi kxiVar, cvo cvoVar, zit zitVar, jkt jktVar, kpm kpmVar, qyf qyfVar) {
        cvoVar.getClass();
        jktVar.getClass();
        this.a = kxiVar;
        this.b = cvoVar;
        this.c = zitVar;
        this.d = jktVar;
        this.e = kpmVar;
        this.f = jktVar.g;
        this.g = jktVar.f;
        x97.y(qyfVar, null, null, new zts(this, null, 4), 3);
    }

    public final void a(yit yitVar, int i) {
        yitVar.getClass();
        this.c.a(yitVar);
        bjt bjtVar = this.d.e;
        int q = ezf.q((sjt) this.g.getValue());
        bjtVar.getClass();
        gjt gjtVar = (gjt) bjtVar.c;
        ajt q2 = bjt.q(yitVar, gjtVar.c.c, gjtVar.a, gjtVar.b, i, null, Integer.valueOf(q));
        nmb nmbVar = (nmb) bjtVar.d;
        String G = ((fnb) bjtVar.a).G();
        rht rhtVar = q2.a;
        rht rhtVar2 = rht.b;
        wjb wjbVar = rhtVar == rhtVar2 ? wjb.ObjectsGridScreen : wjb.ObjectsListScreen;
        String str = q2.b;
        pkb pkbVar = q2.e;
        int i2 = q2.f;
        String str2 = q2.c;
        String str3 = q2.d;
        nmbVar.n(rhtVar == rhtVar2 ? wjb.ObjectsGridScreen : wjb.ObjectsListScreen, q2.h, G, wjbVar, (r60 & 16) != 0 ? ilb.Fullscreen : null, (r60 & 32) != 0 ? glb.Fullscreen : null, (r60 & 64) != 0 ? "" : null, (r60 & 128) != 0 ? pkb.NonApplicable : null, (r60 & 256) != 0 ? "" : null, pkbVar, str, (r60 & 2048) != 0 ? 0 : i2, (r60 & 4096) != 0 ? 0 : 1, (r60 & RemoteCameraConfig.Notification.ID) != 0 ? "" : null, (r60 & 16384) != 0 ? 0 : 0, (32768 & r60) != 0 ? false : false, str3, str2, 1, (524288 & r60) != 0 ? 1 : 0, (1048576 & r60) != 0 ? 0 : q2.i, (2097152 & r60) != 0 ? "" : null, (4194304 & r60) != 0 ? "" : null, (8388608 & r60) != 0 ? "" : null, (16777216 & r60) != 0 ? 0 : 0, q2.g, ((cvo) bjtVar.b).a(), "", (r60 & 268435456) != 0 ? "" : null);
    }

    public final void b(int i, yit yitVar, boolean z, String str) {
        yitVar.getClass();
        str.getClass();
        bjt bjtVar = this.d.e;
        int q = ezf.q((sjt) this.g.getValue());
        fnb fnbVar = (fnb) bjtVar.a;
        gjt gjtVar = (gjt) bjtVar.c;
        if (z) {
            ajt q2 = bjt.q(yitVar, gjtVar.c.c, gjtVar.a, gjtVar.b, i, str, Integer.valueOf(q));
            nmb nmbVar = (nmb) bjtVar.d;
            String G = fnbVar.G();
            wjb wjbVar = q2.a == rht.b ? wjb.ObjectsGridScreen : wjb.ObjectsListScreen;
            String str2 = q2.b;
            nmb.p(nmbVar, G, wjbVar, null, null, null, null, null, q2.e, str2, q2.f, 1, null, 0, false, q2.d, q2.c, 0, q2.i, null, null, null, 0, q2.g, 8075388);
            return;
        }
        ajt q3 = bjt.q(yitVar, gjtVar.c.c, gjtVar.a, gjtVar.b, i, str, Integer.valueOf(q));
        nmb nmbVar2 = (nmb) bjtVar.d;
        String G2 = fnbVar.G();
        wjb wjbVar2 = q3.a == rht.b ? wjb.ObjectsGridScreen : wjb.ObjectsListScreen;
        String str3 = q3.b;
        nmb.j(nmbVar2, G2, wjbVar2, null, null, null, null, null, q3.e, str3, q3.f, 1, null, 0, false, q3.d, q3.c, 0, q3.i, null, q3.g, 8075388);
    }
}
