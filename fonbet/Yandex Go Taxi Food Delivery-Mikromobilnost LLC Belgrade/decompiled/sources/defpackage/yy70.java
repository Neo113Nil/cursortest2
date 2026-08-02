package defpackage;

import android.content.Context;
import com.yandex.go.coroutines.b;
import com.yandex.go.scooters.ui.ScootersOverlayHolder$start$$inlined$safeCollectIn$1;
import com.yandex.go.superapp.api.repository.SuperAppRecenterPointRepository$Type;
import com.yandex.go.superapp.order.multi.old.provider.g;
import com.yandex.go.taxi.order.provider.a;
import com.yandex.mapkit.ScreenRect;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.linked_order.overlay.LinkedMultiOrderOverlay$start$$inlined$safeCollectIn$1;
import ru.yandex.taxi.map.overlay.RecenterType;
import ru.yandex.taxi.order.OrderListOverlayStateProvider$onChange$$inlined$start$1;
import ru.yandex.taxi.order.j;
import ru.yandex.taxi.superapp.orders.multi.OrderListOverlay$start$$inlined$safeCollectIn$1;
import ru.yandex.taxi.superapp.orders.multi.OrderListOverlay$start$$inlined$safeCollectIn$2;
import ru.yandex.taxi.superapp.orders.multi.tracking.c;

/* loaded from: classes6.dex */
public final class yy70 implements n080, l390 {
    public final bx70 A;
    public final mly B;
    public final h760 C;
    public final y980 D;
    public final f09 E;
    public final hf2 F;
    public final x6o0 G;
    public final h080 H;
    public final a I;
    public final zyf J;
    public final oep0 K;
    public final com.yandex.go.delivery.tracking.map_overlay.a L;
    public boolean M;
    public boolean N;
    public int O;
    public jwp0 P;
    public o2y0 Q;
    public final i3y R = kotlin.a.a(new uh60(21, this));
    public final hbp0 S = new hbp0(new czo0(14), "", null);
    public final Context a;
    public final ah00 b;
    public final ry70 c;
    public final c w;
    public final bz70 x;
    public final ktp0 y;
    public final cz70 z;

    public yy70(Context context, ah00 ah00Var, ry70 ry70Var, c cVar, bz70 bz70Var, ktp0 ktp0Var, cz70 cz70Var, bx70 bx70Var, mly mlyVar, h760 h760Var, y980 y980Var, f09 f09Var, hf2 hf2Var, x6o0 x6o0Var, h080 h080Var, a aVar, zyf zyfVar, oep0 oep0Var, com.yandex.go.delivery.tracking.map_overlay.a aVar2) {
        this.a = context;
        this.b = ah00Var;
        this.c = ry70Var;
        this.w = cVar;
        this.x = bz70Var;
        this.y = ktp0Var;
        this.z = cz70Var;
        this.A = bx70Var;
        this.B = mlyVar;
        this.C = h760Var;
        this.D = y980Var;
        this.E = f09Var;
        this.F = hf2Var;
        this.G = x6o0Var;
        this.H = h080Var;
        this.I = aVar;
        this.J = zyfVar;
        this.K = oep0Var;
        this.L = aVar2;
    }

    @Override // defpackage.n080
    public final void A0(boolean z) {
    }

    @Override // defpackage.n080
    public final void Q(ro21 ro21Var, ro21 ro21Var2) {
    }

    @Override // defpackage.n080
    public final void a(boolean z) {
        if (this.M) {
            return;
        }
        bz70 bz70Var = this.x;
        hbp0 hbp0Var = bz70Var.d;
        r0 r0Var = bz70Var.e;
        a aVar = bz70Var.a;
        hbp0Var.a();
        bz70Var.c = aVar.b(new j(bz70Var));
        bz70Var.b();
        this.M = true;
        hbp0 hbp0Var2 = this.S;
        hbp0Var2.a();
        az70 az70Var = (az70) r0Var.getValue();
        if (az70Var == null) {
            az70Var = new az70(aVar.l(), bz70Var.a());
        }
        this.w.b(az70Var.b);
        tje.N(hbp0Var2, null, null, new OrderListOverlay$start$$inlined$safeCollectIn$1(e.t(e.o(e.t(new ru.yandex.taxi.superapp.orders.ui.e(this.c.a)))), null, this), 3);
        tje.N(hbp0Var2, null, null, new OrderListOverlay$start$$inlined$safeCollectIn$2(e.t(b.d(new mth(r0Var, 6), new OrderListOverlayStateProvider$onChange$$inlined$start$1(bz70Var, null))), null, this), 3);
        ((pep0) this.K).f((lfn) this.R.getValue(), new vfn(yaf0.c), hxx.a);
        mly mlyVar = this.B;
        g gVar = mlyVar.b;
        pzt0 pzt0Var = mlyVar.g;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        mlyVar.g = tje.N(mlyVar.a, null, null, new LinkedMultiOrderOverlay$start$$inlined$safeCollectIn$1(new ru.yandex.taxi.linked_order.overlay.b(gVar.h(), mlyVar), null, mlyVar), 3);
        mlyVar.a(gVar.a().b);
        this.C.a.g(RecenterType.ALL_ROUTE);
        this.D.a(true);
        x6o0 x6o0Var = this.G;
        pzt0 pzt0Var2 = x6o0Var.i;
        if (pzt0Var2 != null) {
            pzt0Var2.a(null);
        }
        x6o0Var.i = tje.N(x6o0Var.a, null, null, new ScootersOverlayHolder$start$$inlined$safeCollectIn$1(x6o0Var.b.h(), null, x6o0Var), 3);
        r0 r0Var2 = this.L.c.C;
        Boolean bool = Boolean.TRUE;
        r0Var2.getClass();
        r0Var2.m(null, bool);
        ((gh00) this.b).l();
    }

    @Override // defpackage.n080
    public final void b() {
        e(this.O);
    }

    @Override // defpackage.n080
    public final void d(boolean z) {
        this.N = false;
        c cVar = this.w;
        Iterator it = cVar.d.values().iterator();
        while (it.hasNext()) {
            ((com.yandex.go.taxi.order.map.overlay.c) it.next()).Wg();
        }
        Iterator it2 = cVar.e.values().iterator();
        while (it2.hasNext()) {
            pzt0 pzt0Var = ((s58) it2.next()).m;
            if (pzt0Var != null) {
                pzt0Var.a(null);
            }
        }
        zy70 zy70Var = cVar.b;
        zy70Var.x.b();
        zy70Var.y = false;
        cVar.f = false;
        jwp0 jwp0Var = this.P;
        if (jwp0Var != null) {
            this.E.Hg(jwp0Var);
        }
        this.F.f(z);
    }

    @Override // defpackage.n080
    public final void disableFocusOnPinWhenZooming() {
    }

    public final void e(int i) {
        this.O = i;
        a aVar = this.I;
        o2y0 u = aVar.u();
        h080 h080Var = this.H;
        int i2 = (u == null || u.b().V().j0 == null) ? h080Var.c : h080Var.h;
        o2y0 u2 = aVar.u();
        ScreenRect a = this.z.a(i, i2, (u2 == null || u2.b().V().j0 == null) ? 0 : h080Var.i);
        f09 f09Var = this.E;
        f09Var.getClass();
        u08 u08Var = new u08(10, f09Var, a);
        q09 q09Var = (q09) f09Var.w.x;
        if ((q09Var instanceof m09) || (q09Var instanceof p09)) {
            f09Var.x = u08Var;
        } else {
            u08Var.invoke();
        }
        ((gh00) this.b).a.g(this, a, false, 200L);
    }

    @Override // defpackage.n080
    public final void resume() {
        this.N = true;
        c cVar = this.w;
        if (!cVar.f) {
            cVar.f = true;
            cVar.a();
        }
        jwp0 jwp0Var = this.P;
        if (jwp0Var != null) {
            an8 an8Var = this.E.w;
            an8Var.getClass();
            an8Var.u(new o09(jwp0Var));
            this.F.e();
        }
    }

    @Override // defpackage.n080
    public final void stop() {
        this.M = false;
        bz70 bz70Var = this.x;
        bz70Var.c.cancel();
        bz70Var.d.b();
        bz70Var.f.clear();
        gh00 gh00Var = (gh00) this.b;
        if (gh00Var.a.e(this)) {
            gh00Var.r(this);
        }
        ((lfn) this.R.getValue()).i();
        this.w.c();
        this.S.b();
        mly mlyVar = this.B;
        pzt0 pzt0Var = mlyVar.g;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        mlyVar.g = null;
        HashMap hashMap = mlyVar.h;
        Iterator it = hashMap.entrySet().iterator();
        while (it.hasNext()) {
            ((ru.yandex.taxi.linked_order.map.b) ((Map.Entry) it.next()).getValue()).Ig();
        }
        hashMap.clear();
        n6w0 n6w0Var = mlyVar.c;
        SuperAppRecenterPointRepository$Type superAppRecenterPointRepository$Type = SuperAppRecenterPointRepository$Type.LINKED;
        n6w0Var.a.remove(superAppRecenterPointRepository$Type);
        n6w0Var.b.g(superAppRecenterPointRepository$Type);
        jwp0 jwp0Var = this.P;
        if (jwp0Var != null) {
            f09 f09Var = this.E;
            f09Var.Hg(jwp0Var);
            f09Var.Hg(jwp0Var);
            an8 an8Var = f09Var.w;
            an8Var.getClass();
            an8Var.u(new m09(jwp0Var));
        }
        this.Q = null;
        this.P = null;
        x6o0 x6o0Var = this.G;
        HashMap hashMap2 = x6o0Var.h;
        pzt0 pzt0Var2 = x6o0Var.i;
        if (pzt0Var2 != null) {
            pzt0Var2.a(null);
        }
        x6o0Var.i = null;
        hashMap2.forEach(new th5(11, new arm0(10)));
        hashMap2.clear();
        x6o0Var.g.clear();
        r0 r0Var = this.L.c.C;
        Boolean bool = Boolean.FALSE;
        r0Var.getClass();
        r0Var.m(null, bool);
    }
}
