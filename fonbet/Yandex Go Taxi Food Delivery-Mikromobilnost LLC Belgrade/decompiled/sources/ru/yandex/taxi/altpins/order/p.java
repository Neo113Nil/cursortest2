package ru.yandex.taxi.altpins.order;

import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.taxi.order.models.api.response.OrderStatusInfo;
import defpackage.cwa1;
import defpackage.e02;
import defpackage.hit;
import defpackage.ly6;
import defpackage.my6;
import defpackage.o2y0;
import defpackage.pdc;
import defpackage.pwy0;
import defpackage.t61;
import defpackage.tcc;
import defpackage.tje;
import defpackage.tls;
import defpackage.tpr;
import defpackage.tt2;
import defpackage.ufu;
import defpackage.uyj;
import defpackage.wt00;
import defpackage.y641;
import defpackage.ysg;
import defpackage.zy6;
import defpackage.zzs;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Ref$ObjectRef;
import ru.yandex.taxi.object.DriveState;
import ru.yandex.taxi.theme.ThemeType;

/* loaded from: classes9.dex */
public final class p implements y641 {
    public final tt2 a;
    public final pdc b;
    public final f c;
    public final hit d;
    public final ysg e;
    public final e02 f;
    public final wt00 g;
    public final ru.yandex.taxi.design.utils.b h;
    public final pwy0 i;

    public p(tt2 tt2Var, pdc pdcVar, f fVar, hit hitVar, ysg ysgVar, e02 e02Var, wt00 wt00Var, ru.yandex.taxi.design.utils.b bVar, pwy0 pwy0Var) {
        this.a = tt2Var;
        this.b = pdcVar;
        this.c = fVar;
        this.d = hitVar;
        this.e = ysgVar;
        this.f = e02Var;
        this.g = wt00Var;
        this.h = bVar;
        this.i = pwy0Var;
    }

    public static boolean e(TaxiOrder taxiOrder) {
        OrderStatusInfo.AlternativeDestination alternativeDestination = taxiOrder.V().j0;
        return (alternativeDestination != null ? alternativeDestination.getF() : null) != null && taxiOrder.V().i == DriveState.COMPLETE && taxiOrder.l.getA();
    }

    public final my6 a(ly6 ly6Var, zy6 zy6Var) {
        String a = ly6Var.getA();
        String c = ly6Var.getC();
        ufu ufuVar = (ufu) this.b;
        return new my6(a, ufuVar.i(c), ufuVar.b(ly6Var.getB()), null, zy6Var, null, null, false, false, 16308);
    }

    public final void b(o2y0 o2y0Var) {
        c(o2y0Var, new WalkingInfoBlockInteractorImpl$onCancelWalkingRoute$1());
    }

    public final void c(o2y0 o2y0Var, tls tlsVar) {
        t61 t61Var = this.f.a;
        t61Var.getClass();
        t61Var.a.a("AltpinB.PedestrianRouteTrackingView.ResetButton.Tap", new HashMap(), 1, new HashMap());
        tje.N(this.d.a, null, null, new WalkingInfoBlockInteractorImpl$onCancelWalkingRoute$2(this, o2y0Var, tlsVar, null), 3);
    }

    public final void d(o2y0 o2y0Var) {
        t61 t61Var = this.f.a;
        t61Var.getClass();
        t61Var.a.a("AltpinB.PedestrianRouteTrackingView.Tap", new HashMap(), 1, new HashMap());
        OrderStatusInfo.AlternativeDestination alternativeDestination = o2y0Var.b().V().j0;
        if (alternativeDestination == null) {
            return;
        }
        List d = alternativeDestination.getD();
        ArrayList arrayList = new ArrayList(tcc.n(d, 10));
        Iterator it = d.iterator();
        while (it.hasNext()) {
            arrayList.add(cwa1.d((zzs) it.next()));
        }
        zzs a = alternativeDestination.getA().getA();
        this.g.a(o2y0Var.b().m(), a, arrayList);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [T, ru.yandex.taxi.theme.ThemeType] */
    public final tpr f(o2y0 o2y0Var) {
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
        ref$ObjectRef2.element = ThemeType.LIGHT;
        k kVar = new k(kotlinx.coroutines.flow.e.t(kotlinx.coroutines.flow.e.X(this.i.a(), new WalkingInfoBlockInteractorImpl$stateFlow$$inlined$flatMapLatest$1(null, o2y0Var, this, ref$ObjectRef, ref$ObjectRef2))), this);
        this.a.getClass();
        return kotlinx.coroutines.flow.e.F(kVar, uyj.a);
    }
}
