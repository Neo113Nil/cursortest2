package ru.yandex.taxi.logistics.sdk.address_details.api;

import defpackage.bgc;
import defpackage.czh;
import defpackage.gzh;
import defpackage.izh;
import defpackage.jqr;
import defpackage.loj;
import defpackage.qs0;
import defpackage.sb0;
import defpackage.sls;
import defpackage.tls;
import defpackage.ts0;
import defpackage.ts11;
import defpackage.tt0;
import defpackage.wls;
import defpackage.zbd;
import defpackage.zls;
import defpackage.zni;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import ru.yandex.taxi.logistics.childrouter.api.ScreenMode;
import ru.yandex.taxi.logistics.sdk.address_details.api.a;
import ru.yandex.taxi.logistics.sdk.address_details.api.b;

/* loaded from: classes5.dex */
public final class b {
    public final gzh a;
    public final ts0 b;
    public final tt0 c;

    public b(gzh gzhVar, ts0 ts0Var, tt0 tt0Var) {
        this.a = gzhVar;
        this.b = ts0Var;
        this.c = tt0Var;
    }

    public static void a(final b bVar, ScreenMode screenMode, zls zlsVar, wls wlsVar, final zls zlsVar2, tls tlsVar, sb0 sb0Var, loj lojVar, final jqr jqrVar, final qs0 qs0Var, boolean z, int i) {
        ScreenMode screenMode2 = (i & 1) != 0 ? ScreenMode.FIXED : screenMode;
        final zls addressDetailsRouter$open$1 = (i & 4) != 0 ? new AddressDetailsRouter$open$1(3, null) : zlsVar;
        final wls addressDetailsRouter$open$2 = (i & 8) != 0 ? new AddressDetailsRouter$open$2(2, null) : wlsVar;
        final tls addressDetailsRouter$open$4 = (i & 32) != 0 ? new AddressDetailsRouter$open$4(1, null) : tlsVar;
        final sls bgcVar = (i & 64) != 0 ? new bgc(12) : sb0Var;
        final wls zbdVar = (i & 128) != 0 ? new zbd(9) : lojVar;
        boolean z2 = (i & 1024) != 0 ? false : z;
        final czh create = bVar.a.create();
        czh.a(create, new izh(new zni() { // from class: it0
            @Override // defpackage.zni
            public final xni create() {
                b bVar2 = b.this;
                ts0 ts0Var = bVar2.b;
                es0 es0Var = new es0();
                a aVar = new a(addressDetailsRouter$open$1, addressDetailsRouter$open$2, zlsVar2, addressDetailsRouter$open$4, create, jqrVar, bVar2, bgcVar, zbdVar);
                bc bcVar = ts0Var.a;
                bcVar.getClass();
                k2g k2gVar = new k2g(bcVar, 3);
                k2g k2gVar2 = new k2g(bcVar, 0);
                n3w a = n3w.a(aVar);
                qs0 qs0Var2 = qs0Var;
                l2g l2gVar = new l2g(qs0Var2, 3);
                lk lkVar = new lk(8, new k2g(bcVar, 1));
                k2g k2gVar3 = new k2g(bcVar, 2);
                xvf0 b = i5m.b(new g6((xvf0) a, (xvf0) l2gVar, (xvf0) lkVar, (xvf0) new lk(10, k2gVar3), (xvf0) new l2g(qs0Var2, 4), 3));
                k2g k2gVar4 = new k2g(bcVar, 4);
                l2g l2gVar2 = new l2g(qs0Var2, 1);
                xvf0 b2 = i5m.b(new upk0(b, 7));
                xvf0 b3 = i5m.b(hms0.a);
                xvf0 b4 = i5m.b(riz0.a);
                n3w n3wVar = y2r0.c;
                ArrayList arrayList = new ArrayList(3);
                List list = Collections.EMPTY_LIST;
                arrayList.add(b2);
                arrayList.add(b3);
                arrayList.add(b4);
                ss0 ss0Var = (ss0) i5m.b(new t4(k2gVar, i5m.b(new ht0(k2gVar2, b, k2gVar4, k2gVar3, i5m.b(new p4((Object) l2gVar2, (xvf0) new y2r0(arrayList, list), 5)), new l2g(qs0Var2, 0), new l2g(qs0Var2, 2))), n3w.a(es0Var), a, 4)).get();
                qcp0 qcp0Var = ss0Var.a;
                gt0 gt0Var = ss0Var.b;
                es0 es0Var2 = ss0Var.c;
                a aVar2 = ss0Var.d;
                qcp0Var.getClass();
                return new aoi(gt0Var, es0Var2, aVar2);
            }
        }, null, screenMode2, new ts11(false, z2, null, null, null, 495), null, "address_details", 6902));
    }
}
