package ru.yandex.taxi.superapp.orders.multi.tracking;

import android.content.Context;
import defpackage.a380;
import defpackage.ah00;
import defpackage.bu0;
import defpackage.ddf;
import defpackage.f4c0;
import defpackage.ft00;
import defpackage.hbp0;
import defpackage.jqr;
import defpackage.n3g;
import defpackage.o2y0;
import defpackage.pw21;
import defpackage.s58;
import defpackage.t48;
import defpackage.t58;
import defpackage.tje;
import defpackage.tse;
import defpackage.vu30;
import defpackage.x980;
import defpackage.xm00;
import defpackage.y280;
import defpackage.zy70;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.flow.e;
import ru.yandex.taxi.map.overlay.order.OrderMapOverlayComponent$Mode;
import ru.yandex.taxi.superapp.orders.carnumber.CarNumberBubbleOverlay$resume$$inlined$safeCollectIn$1;
import ru.yandex.taxi.superapp.orders.carnumber.d;

/* loaded from: classes6.dex */
public final class c {
    public final y280 a;
    public final zy70 b;
    public final bu0 c;
    public final HashMap d = new HashMap();
    public final HashMap e = new HashMap();
    public boolean f;

    public c(y280 y280Var, zy70 zy70Var, bu0 bu0Var) {
        this.a = y280Var;
        this.b = zy70Var;
        this.c = bu0Var;
    }

    public final void a() {
        zy70 zy70Var = this.b;
        boolean z = zy70Var.y;
        hbp0 hbp0Var = zy70Var.x;
        if (!z) {
            zy70Var.y = true;
            hbp0Var.a();
            tje.N(hbp0Var, null, null, new OrderListOverlayRecenter$start$$inlined$safeCollectIn$1(e.s(new b(new jqr(e.N(zy70Var.w, 1000L), new OrderListOverlayRecenter$start$1(zy70Var, null), 3), zy70Var), new vu30(20)), null, zy70Var), 3);
        }
        Iterator it = this.d.values().iterator();
        while (it.hasNext()) {
            ((com.yandex.go.taxi.order.map.overlay.c) it.next()).Ug();
        }
        for (s58 s58Var : this.e.values()) {
            s58Var.m = tje.N(s58Var.j, null, null, new CarNumberBubbleOverlay$resume$$inlined$safeCollectIn$1(new d(e.t(new ru.yandex.taxi.superapp.orders.carnumber.b(s58Var.f.e, s58Var)), s58Var), null, s58Var), 3);
        }
    }

    public final void b(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            o2y0 o2y0Var = (o2y0) it.next();
            HashMap hashMap = this.d;
            if (!hashMap.containsKey(o2y0Var)) {
                n3g e = pw21.e(this.a.a, o2y0Var, OrderMapOverlayComponent$Mode.MULTIPLE, this.b);
                com.yandex.go.taxi.order.map.overlay.c cVar = (com.yandex.go.taxi.order.map.overlay.c) e.B0.get();
                cVar.attach();
                hashMap.put(o2y0Var, cVar);
                if (list.size() > 1) {
                    a380 a380Var = (a380) e.k.get();
                    bu0 bu0Var = this.c;
                    this.e.put(o2y0Var, new s58(o2y0Var, (xm00) bu0Var.c, (Context) bu0Var.a, (ah00) bu0Var.d, (x980) bu0Var.e, a380Var, (ft00) bu0Var.f, (t48) bu0Var.g, (t58) bu0Var.h, (tse) bu0Var.b, (ddf) bu0Var.i));
                }
            }
        }
        if (this.f) {
            a();
        }
    }

    public final void c() {
        HashMap hashMap = this.d;
        for (com.yandex.go.taxi.order.map.overlay.c cVar : hashMap.values()) {
            cVar.Wg();
            cVar.detach();
        }
        hashMap.clear();
        HashMap hashMap2 = this.e;
        for (s58 s58Var : hashMap2.values()) {
            f4c0 f4c0Var = s58Var.n;
            if (f4c0Var != null) {
                s58Var.b.o(f4c0Var);
            }
            s58Var.n = null;
            s58Var.o = null;
            s58Var.p = null;
        }
        hashMap2.clear();
        zy70 zy70Var = this.b;
        zy70Var.x.b();
        zy70Var.y = false;
    }
}
