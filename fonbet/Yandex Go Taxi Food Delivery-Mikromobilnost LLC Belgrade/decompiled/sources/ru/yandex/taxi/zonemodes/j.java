package ru.yandex.taxi.zonemodes;

import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.zone.dto.objects.VerticalTariffDto;
import com.yandex.go.zone.dto.objects.ZoneVertical;
import com.yandex.go.zone.dto.objects.ZoneVerticalMulticlass;
import com.yandex.go.zone.model.Zone;
import com.yandex.go.zone.model.ZoneMode;
import com.yandex.go.zone.repository.o;
import defpackage.bvf0;
import defpackage.ck31;
import defpackage.e331;
import defpackage.ffx;
import defpackage.ike;
import defpackage.jl40;
import defpackage.mdh;
import defpackage.n20;
import defpackage.ny61;
import defpackage.o2y0;
import defpackage.rd61;
import defpackage.sd61;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tpr;
import defpackage.uyj;
import defpackage.wiq0;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.m0;
import kotlinx.coroutines.flow.n;
import kotlinx.coroutines.flow.n0;

/* loaded from: classes10.dex */
public final class j {
    public final sd61 a;
    public final o b;
    public final ck31 c;
    public final wiq0 d;
    public final n20 e;
    public final ike f = bvf0.b();
    public final ConcurrentHashMap g = new ConcurrentHashMap();
    public final n0 h = ffx.b(0, 1, BufferOverflow.DROP_OLDEST);

    public j(sd61 sd61Var, o oVar, ck31 ck31Var, wiq0 wiq0Var, n20 n20Var) {
        this.a = sd61Var;
        this.b = oVar;
        this.c = ck31Var;
        this.d = wiq0Var;
        this.e = n20Var;
        ((com.yandex.go.taxi.order.provider.a) n20Var).b(new e(this));
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00b3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:5:0x0088  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ZoneMode b(Zone zone, String str, String str2) {
        Object obj;
        Object obj2;
        String str3;
        Object obj3;
        ZoneMode zoneMode;
        Object obj4 = null;
        if (str2.length() != 0) {
            Iterator it = zone.w.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (jl40.l(((ZoneVertical) obj).a, str2)) {
                    break;
                }
            }
            ZoneVertical zoneVertical = (ZoneVertical) obj;
            if (zoneVertical != null) {
                ZoneVerticalMulticlass zoneVerticalMulticlass = zoneVertical.l;
                if (!jl40.l(str, "multiclass")) {
                    zoneVerticalMulticlass = null;
                }
                if (zoneVerticalMulticlass != null) {
                    str3 = zoneVerticalMulticlass.h;
                } else {
                    Iterator it2 = zoneVertical.f.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            obj2 = null;
                            break;
                        }
                        obj2 = it2.next();
                        if (jl40.l(((VerticalTariffDto) obj2).a, str)) {
                            break;
                        }
                    }
                    VerticalTariffDto verticalTariffDto = (VerticalTariffDto) obj2;
                    if (verticalTariffDto != null) {
                        str3 = verticalTariffDto.e;
                    }
                }
                Iterator it3 = zone.v.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        obj3 = null;
                        break;
                    }
                    obj3 = it3.next();
                    if (jl40.l(str3, ((ZoneMode) obj3).a)) {
                        break;
                    }
                }
                zoneMode = (ZoneMode) obj3;
                if (zoneMode == null) {
                    return zoneMode;
                }
                Iterator it4 = zone.v.iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        break;
                    }
                    Object next = it4.next();
                    if (((ZoneMode) next).b.contains(str)) {
                        obj4 = next;
                        break;
                    }
                }
                ZoneMode zoneMode2 = (ZoneMode) obj4;
                if (zoneMode2 != null) {
                    return zoneMode2;
                }
                ZoneMode.Companion.getClass();
                return ZoneMode.d;
            }
        }
        zoneMode = null;
        if (zoneMode == null) {
        }
    }

    public final kotlinx.coroutines.flow.internal.g a(tpr tprVar) {
        return kotlinx.coroutines.flow.e.X(kotlinx.coroutines.flow.e.t(new n(new b(this.h, this), new ZoneModesInteractorImpl$activeOrderFlow$2(this, null))), new ZoneModesInteractorImpl$currentZoneModeFlow$$inlined$flatMapLatest$1(null, this, tprVar));
    }

    public final void c(TaxiOrder taxiOrder) {
        Zone M = taxiOrder.M();
        if (M == null) {
            return;
        }
        tje.N(this.f, null, null, new ZoneModesInteractorImpl$saveZoneModeForOrder$1(this, taxiOrder, (ZoneMode) this.g.computeIfAbsent(taxiOrder.a, new rd61(0, new ZoneModesInteractorImpl$saveZoneModeForOrder$$inlined$computeIfAbsentCompat$1(new e331(this, M, taxiOrder)))), null), 3);
    }

    public final m0 d(tpr tprVar) {
        return new m0(new i(new n(this.b.s, new ZoneModesInteractorImpl$zoneFlow$1(this, null))), tprVar, new ZoneModesInteractorImpl$tariffZoneModeFlow$1(3, this, j.class, "zoneModeForTariffAndZone", "zoneModeForTariffAndZone(Lcom/yandex/go/zone/model/Zone;Lru/yandex/taxi/tariffs/model/BaseTariffInfo;)Lcom/yandex/go/zone/model/ZoneMode;", 4));
    }

    public final ZoneMode e(Zone zone, String str, String str2) {
        if (zone != null) {
            return b(zone, str, str2);
        }
        ZoneMode.Companion.getClass();
        return ZoneMode.d;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(o2y0 o2y0Var, ContinuationImpl continuationImpl) {
        ZoneModesInteractorImpl$zoneModeForOrderHolder$1 zoneModesInteractorImpl$zoneModeForOrderHolder$1;
        int i;
        String str;
        if (continuationImpl instanceof ZoneModesInteractorImpl$zoneModeForOrderHolder$1) {
            zoneModesInteractorImpl$zoneModeForOrderHolder$1 = (ZoneModesInteractorImpl$zoneModeForOrderHolder$1) continuationImpl;
            int i2 = zoneModesInteractorImpl$zoneModeForOrderHolder$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                zoneModesInteractorImpl$zoneModeForOrderHolder$1.label = i2 - Integer.MIN_VALUE;
                Object obj = zoneModesInteractorImpl$zoneModeForOrderHolder$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = zoneModesInteractorImpl$zoneModeForOrderHolder$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    Zone M = o2y0Var.b().M();
                    String x = o2y0Var.b().x();
                    String str2 = o2y0Var.b().b.V;
                    str = o2y0Var.b().a;
                    if (M != null) {
                        return b(M, x, str2);
                    }
                    ZoneMode zoneMode = (ZoneMode) this.g.get(str);
                    if (zoneMode != null) {
                        return zoneMode;
                    }
                    sd61 sd61Var = this.a;
                    zoneModesInteractorImpl$zoneModeForOrderHolder$1.L$0 = null;
                    zoneModesInteractorImpl$zoneModeForOrderHolder$1.L$1 = null;
                    zoneModesInteractorImpl$zoneModeForOrderHolder$1.L$2 = null;
                    zoneModesInteractorImpl$zoneModeForOrderHolder$1.L$3 = null;
                    zoneModesInteractorImpl$zoneModeForOrderHolder$1.L$4 = str;
                    zoneModesInteractorImpl$zoneModeForOrderHolder$1.label = 1;
                    sd61Var.a.getClass();
                    sjh sjhVar = uyj.a;
                    obj = tje.k0(mdh.b, new ZoneModesStorage$getZoneMode$2(sd61Var, str, null), zoneModesInteractorImpl$zoneModeForOrderHolder$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = (String) zoneModesInteractorImpl$zoneModeForOrderHolder$1.L$4;
                    kotlin.b.b(obj);
                }
                ZoneMode zoneMode2 = (ZoneMode) obj;
                this.g.put(str, zoneMode2);
                return zoneMode2;
            }
        }
        zoneModesInteractorImpl$zoneModeForOrderHolder$1 = new ZoneModesInteractorImpl$zoneModeForOrderHolder$1(this, continuationImpl);
        Object obj2 = zoneModesInteractorImpl$zoneModeForOrderHolder$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = zoneModesInteractorImpl$zoneModeForOrderHolder$1.label;
        if (i != 0) {
        }
        ZoneMode zoneMode22 = (ZoneMode) obj2;
        this.g.put(str, zoneMode22);
        return zoneMode22;
    }
}
