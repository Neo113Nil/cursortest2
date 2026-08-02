package ru.yandex.taxi.masstransit.router;

import com.yandex.go.layers.api.model.params.Mode;
import com.yandex.go.layers.api.model.params.Screen;
import defpackage.bp30;
import defpackage.bt00;
import defpackage.byx;
import defpackage.c430;
import defpackage.cyx;
import defpackage.dzw0;
import defpackage.e631;
import defpackage.ffe;
import defpackage.fif;
import defpackage.gh00;
import defpackage.l010;
import defpackage.l30;
import defpackage.lcw;
import defpackage.lx4;
import defpackage.lz00;
import defpackage.m010;
import defpackage.mfu0;
import defpackage.mz00;
import defpackage.pzt0;
import defpackage.qtb1;
import defpackage.rn00;
import defpackage.sy00;
import defpackage.tse;
import defpackage.uhx;
import defpackage.un0;
import defpackage.vy00;
import defpackage.w511;
import defpackage.x35;
import defpackage.y35;
import defpackage.ydf;
import defpackage.z9x0;
import java.util.List;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.flow.r0;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.activity.ContentContainer$ZOrder;
import ru.yandex.taxi.layers.presentation.optimalview.MapObservationView;
import ru.yandex.taxi.masstransit.model.MtMasstransitOverlayOwner;

/* loaded from: classes6.dex */
public final class e {
    public final sy00 a;
    public final lz00 b;
    public final cyx c;
    public final bt00 d;
    public final mfu0 e;
    public final fif f;
    public final m010 g;
    public final ru.yandex.taxi.masstransit.sourceaddress.c h;
    public final l010 i;
    public final e631 j;
    public final ru.yandex.taxi.masstransit.domain.d k;
    public final rn00 l;
    public l30 m;
    public byx n;

    public e(sy00 sy00Var, lz00 lz00Var, cyx cyxVar, bt00 bt00Var, mfu0 mfu0Var, fif fifVar, m010 m010Var, ru.yandex.taxi.masstransit.sourceaddress.c cVar, vy00 vy00Var, l010 l010Var, e631 e631Var, ru.yandex.taxi.masstransit.domain.d dVar, rn00 rn00Var) {
        this.a = sy00Var;
        this.b = lz00Var;
        this.c = cyxVar;
        this.d = bt00Var;
        this.e = mfu0Var;
        this.f = fifVar;
        this.g = m010Var;
        this.h = cVar;
        this.i = l010Var;
        this.j = e631Var;
        this.k = dVar;
        this.l = rn00Var;
    }

    public final void a() {
        m010 m010Var = this.g;
        ((z9x0) m010Var.d).b();
        ru.yandex.taxi.masstransit.overlay.e eVar = m010Var.c;
        eVar.e = null;
        eVar.b();
        gh00 gh00Var = (gh00) m010Var.a;
        gh00Var.I(false);
        gh00Var.v();
        ru.yandex.taxi.map_common.style.source.e eVar2 = (ru.yandex.taxi.map_common.style.source.e) this.d;
        eVar2.b();
        eVar2.c(3, "");
        lz00 lz00Var = this.b;
        MapObservationView mapObservationView = lz00Var.w;
        if (mapObservationView != null) {
            mapObservationView.detach();
            lz00Var.a.a.removeView(mapObservationView);
            lz00Var.w = null;
        }
        l30 l30Var = this.m;
        if (l30Var != null) {
            l30Var.cancel();
        }
        this.m = null;
        ru.yandex.taxi.masstransit.overlay.d dVar = (ru.yandex.taxi.masstransit.overlay.d) this.j;
        pzt0 pzt0Var = dVar.f;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        dVar.e.clear();
        r0 r0Var = this.e.a;
        Boolean bool = Boolean.TRUE;
        r0Var.getClass();
        r0Var.m(null, bool);
        this.n = null;
    }

    /* JADX WARN: Type inference failed for: r8v5, types: [T, java.util.List] */
    /* JADX WARN: Type inference failed for: r8v9, types: [T, java.util.List] */
    public final void b(y35 y35Var, mz00 mz00Var, tse tseVar, MtMasstransitOverlayOwner mtMasstransitOverlayOwner) {
        byx byxVar;
        sy00 sy00Var = this.a;
        lx4 lx4Var = sy00Var.a;
        ((ru.yandex.taxi.analytics.j) lx4Var).m.o.add(sy00Var.g);
        lz00 lz00Var = this.b;
        ffe ffeVar = lz00Var.a;
        boolean g = y35Var.getG();
        lcw lcwVar = lz00Var.c;
        if (lcwVar != null) {
            MapObservationView mapObservationView = lz00Var.w;
            if (mapObservationView != null && mapObservationView != null) {
                mapObservationView.detach();
                ffeVar.a.removeView(mapObservationView);
                lz00Var.w = null;
            }
            MapObservationView mapObservationView2 = (MapObservationView) lz00Var.b.get();
            lz00Var.w = mapObservationView2;
            mapObservationView2.setDisplayMessageEnabled(g);
            ContentContainer$ZOrder contentContainer$ZOrder = ContentContainer$ZOrder.MAP;
            ffeVar.a.addView(mapObservationView2);
            ffeVar.a(mapObservationView2, contentContainer$ZOrder);
            mapObservationView2.attach((ru.yandex.taxi.layers.presentation.optimalview.c) lcwVar.get());
        }
        int i = bp30.a[mtMasstransitOverlayOwner.ordinal()];
        if (i == 1) {
            byxVar = new byx(Screen.SUPERAPP_DISCOVERY_MAP, new c430(Mode.MASSTRANSIT, mz00Var.a, mz00Var.b));
        } else if (i != 2) {
            w511.b();
            return;
        } else {
            byxVar = new byx(Screen.DISCOVERY, new c430(Mode.MASSTRANSIT, mz00Var.a, mz00Var.b));
        }
        this.n = byxVar;
        this.c.b(byxVar);
        ru.yandex.taxi.map_common.style.source.e eVar = (ru.yandex.taxi.map_common.style.source.e) this.d;
        eVar.d("default");
        eVar.c(3, y35Var.getE());
        r0 r0Var = this.e.a;
        Boolean bool = Boolean.TRUE;
        r0Var.getClass();
        r0Var.m(null, bool);
        this.m = this.f.c(new ydf(4));
        l010 l010Var = this.i;
        m010 m010Var = this.g;
        m010Var.e.add(l010Var);
        m010Var.c.e = new uhx(7, m010Var);
        ((z9x0) m010Var.d).a(qtb1.j(null, null, null, null, null, null, null, HProv.PP_VERSION_TIMESTAMP));
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ?? i2 = y35Var.getI();
        ref$ObjectRef.element = i2;
        if (((List) i2).isEmpty()) {
            y35.a.getClass();
            ref$ObjectRef.element = x35.c;
        }
        ((gh00) m010Var.a).I(true);
        com.yandex.go.coroutines.b.g(tseVar, null, null, new MtMasstransitModeLifecycleListener$onLaunch$2(this, ref$ObjectRef, null), 3);
        com.yandex.go.coroutines.b.g(tseVar, null, null, new MtMasstransitModeLifecycleListener$onLaunch$3(this, null), 3);
        mz00Var.getClass();
    }

    public final void c(boolean z) {
        this.g.c.b.b(new dzw0(z, 5), false);
        cyx cyxVar = this.c;
        if (!z) {
            cyxVar.b(new byx(Screen.DISCOVERY, new c430(Mode.NORMAL, (kotlinx.serialization.json.b) null, (un0) null)));
            return;
        }
        byx byxVar = this.n;
        if (byxVar != null) {
            cyxVar.b(byxVar);
        }
    }
}
