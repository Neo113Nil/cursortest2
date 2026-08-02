package ru.yandex.taxi.multiorder.tracked;

import defpackage.cm40;
import defpackage.fnt;
import defpackage.gwk0;
import defpackage.gya1;
import defpackage.ny61;
import defpackage.o2y0;
import defpackage.rcc;
import defpackage.ren;
import defpackage.sly;
import defpackage.taa;
import defpackage.tly;
import defpackage.vhz;
import defpackage.vpr;
import defpackage.wl40;
import defpackage.x101;
import defpackage.zuo0;
import defpackage.zy11;
import java.util.Iterator;
import kotlin.collections.builders.ListBuilder;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import ru.yandex.taxi.multiorder.multi.ServiceType;

/* loaded from: classes6.dex */
public final class a implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ cm40 b;

    public a(vpr vprVar, cm40 cm40Var) {
        this.a = vprVar;
        this.b = cm40Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        TrackedActiveOrderRepository$special$$inlined$map$1$2$1 trackedActiveOrderRepository$special$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof TrackedActiveOrderRepository$special$$inlined$map$1$2$1) {
            trackedActiveOrderRepository$special$$inlined$map$1$2$1 = (TrackedActiveOrderRepository$special$$inlined$map$1$2$1) continuation;
            int i2 = trackedActiveOrderRepository$special$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                trackedActiveOrderRepository$special$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = trackedActiveOrderRepository$special$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = trackedActiveOrderRepository$special$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    wl40 wl40Var = (wl40) obj;
                    this.b.getClass();
                    ListBuilder a = rcc.a();
                    for (ren renVar : wl40Var.c) {
                        a.add(new x101(gwk0.s(renVar.b), renVar.c.getId(), renVar.a));
                    }
                    for (fnt fntVar : wl40Var.d) {
                        a.add(new x101(ServiceType.DRIVE.getAlias(), gya1.e(fntVar), fntVar.a));
                    }
                    Iterator it = wl40Var.b.iterator();
                    while (it.hasNext()) {
                        tly a2 = ((sly) it.next()).a();
                        x101 x101Var = a2 != null ? new x101(ServiceType.LINKED.getAlias(), a2.t.getAnalyticsName(), a2.c.a) : null;
                        if (x101Var != null) {
                            a.add(x101Var);
                        }
                    }
                    for (o2y0 o2y0Var : wl40Var.a) {
                        a.add(new x101(ServiceType.TAXI.getAlias(), o2y0Var.c().toString(), o2y0Var.b().a));
                    }
                    Iterator it2 = wl40Var.e.iterator();
                    while (true) {
                        String str = "default";
                        if (!it2.hasNext()) {
                            break;
                        }
                        vhz vhzVar = (vhz) it2.next();
                        String alias = ServiceType.LOGISTICS.getAlias();
                        if (vhzVar.n) {
                            str = "completed";
                        }
                        a.add(new x101(alias, str, vhzVar.r));
                    }
                    Iterator it3 = wl40Var.f.iterator();
                    while (it3.hasNext()) {
                        a.add(new x101(ServiceType.SCOOTERS.getAlias(), "default", ((zuo0) it3.next()).getSessionId()));
                    }
                    Iterator it4 = wl40Var.g.iterator();
                    while (it4.hasNext()) {
                        a.add(new x101(ServiceType.CHARGERS.getAlias(), "default", ((taa) it4.next()).a()));
                    }
                    ListBuilder j = a.j();
                    trackedActiveOrderRepository$special$$inlined$map$1$2$1.L$0 = null;
                    trackedActiveOrderRepository$special$$inlined$map$1$2$1.L$1 = null;
                    trackedActiveOrderRepository$special$$inlined$map$1$2$1.L$2 = null;
                    trackedActiveOrderRepository$special$$inlined$map$1$2$1.L$3 = null;
                    trackedActiveOrderRepository$special$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(j, trackedActiveOrderRepository$special$$inlined$map$1$2$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                }
                return zy11.a;
            }
        }
        trackedActiveOrderRepository$special$$inlined$map$1$2$1 = new TrackedActiveOrderRepository$special$$inlined$map$1$2$1(this, continuation);
        Object obj22 = trackedActiveOrderRepository$special$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = trackedActiveOrderRepository$special$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
