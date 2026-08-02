package ru.yandex.taxi.logistics.sdk.tracking.impl.edit_order_details;

import com.adjust.sdk.network.ErrorCodes;
import com.yandex.passport.sloth.ui.dependencies.m;
import defpackage.bnn;
import defpackage.c1x0;
import defpackage.cjw0;
import defpackage.e0l0;
import defpackage.enn;
import defpackage.f4l0;
import defpackage.gc;
import defpackage.gnn;
import defpackage.gw00;
import defpackage.gzh;
import defpackage.h3y;
import defpackage.i5m;
import defpackage.j00;
import defpackage.jwh;
import defpackage.kbg;
import defpackage.kcz0;
import defpackage.loj;
import defpackage.lzf;
import defpackage.mhh;
import defpackage.mzf;
import defpackage.nfj;
import defpackage.pgi;
import defpackage.q5z;
import defpackage.qs0;
import defpackage.rs0;
import defpackage.smn;
import defpackage.tmn;
import defpackage.ts0;
import defpackage.tt0;
import defpackage.vmn;
import defpackage.x201;
import defpackage.xmn;
import defpackage.xvf0;
import defpackage.z501;
import defpackage.zmn;
import defpackage.zrm;
import kotlin.Pair;
import ru.yandex.taxi.logistics.childrouter.api.ScreenMode;
import ru.yandex.taxi.logistics.sdk.tracking.domain.impl.e;

/* loaded from: classes5.dex */
public final class a {
    public final String a;
    public final zrm b;

    public a(zrm zrmVar, String str) {
        this.a = str;
        this.b = zrmVar;
    }

    public final void a(boolean z) {
        String str = this.a;
        vmn vmnVar = new vmn(str, z);
        zrm zrmVar = this.b;
        kbg a = ((z501) zrmVar.c).a(str);
        m mVar = (m) zrmVar.b;
        mVar.getClass();
        xvf0 b = i5m.b(bnn.a);
        mzf mzfVar = new mzf(a, 0);
        lzf lzfVar = new lzf(mVar, 0);
        xvf0 b2 = i5m.b(mhh.a);
        xvf0 b3 = i5m.b(new pgi((xvf0) mzfVar, (xvf0) lzfVar, b2, 26, false));
        lzf lzfVar2 = new lzf(mVar, 4);
        lzf lzfVar3 = new lzf(mVar, 1);
        xvf0 b4 = i5m.b(new pgi((xvf0) new lzf(mVar, 3), b2, (xvf0) new lzf(mVar, 2), 25, (byte) 0));
        xvf0 b5 = i5m.b(tmn.a);
        rs0 rs0Var = new rs0(i5m.b(new gc(b3, mzfVar, lzfVar2, lzfVar3, b2, b4, b5, new lzf(mVar, 6), new lzf(mVar, 5))), b3, i5m.b(gnn.a), i5m.b(xmn.a), i5m.b(zmn.a), 0);
        gzh gzhVar = (gzh) mVar.d;
        q5z.h(gzhVar);
        ts0 ts0Var = (ts0) mVar.e;
        q5z.h(ts0Var);
        ru.yandex.taxi.logistics.sdk.address_details.api.b bVar = new ru.yandex.taxi.logistics.sdk.address_details.api.b(gzhVar, ts0Var, (tt0) b.get());
        h3y a2 = i5m.a(rs0Var);
        ru.yandex.taxi.logistics.sdk.delivery.edit.b bVar2 = (ru.yandex.taxi.logistics.sdk.delivery.edit.b) mVar.f;
        q5z.h(bVar2);
        jwh jwhVar = (jwh) mVar.b;
        q5z.h(jwhVar);
        e b6 = a.b();
        q5z.h(b6);
        e b7 = a.b();
        q5z.h(b7);
        kcz0 kcz0Var = new kcz0(jwhVar, new c1x0(new cjw0(b6, new j00(b7))));
        x201 x201Var = (x201) a.s.get();
        q5z.h(x201Var);
        e b8 = a.b();
        q5z.h(b8);
        ru.yandex.taxi.logistics.sdk.photocomments.domain.a aVar = (ru.yandex.taxi.logistics.sdk.photocomments.domain.a) b4.get();
        enn ennVar = new enn(vmnVar, bVar, a2, bVar2, kcz0Var, x201Var, b8, aVar, (smn) b5.get(), gzhVar);
        kcz0Var.x("DeliveryDetailsCard.Shown", gw00.e(new Pair("Is_Force", Boolean.valueOf(z))));
        f4l0 f4l0Var = ((qs0) a2.get()).b;
        e0l0 route = f4l0Var.getRoute();
        ScreenMode screenMode = ScreenMode.SLIDEABLE;
        qs0 qs0Var = (qs0) a2.get();
        ru.yandex.taxi.logistics.sdk.address_details.api.b.a(bVar, screenMode, null, null, new nfj(5, ennVar, f4l0Var), new EditOrderDetailsRouter$open$2(ennVar, f4l0Var, route, null), null, new loj(12, ennVar), aVar.e(gzhVar), qs0Var, false, ErrorCodes.THROWABLE);
    }
}
