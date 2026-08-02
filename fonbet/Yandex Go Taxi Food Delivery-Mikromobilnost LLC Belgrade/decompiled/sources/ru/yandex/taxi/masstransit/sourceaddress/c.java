package ru.yandex.taxi.masstransit.sourceaddress;

import com.yandex.go.zone.model.Zone;
import com.yandex.go.zone.repository.o;
import defpackage.jqr;
import defpackage.jst;
import defpackage.mdh;
import defpackage.ny61;
import defpackage.pv0;
import defpackage.sjh;
import defpackage.tpr;
import defpackage.tt2;
import defpackage.tu30;
import defpackage.uyj;
import defpackage.xby;
import defpackage.zzs;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.m0;
import ru.yandex.taxi.persuggest.domain.model.RoutePointType;
import ru.yandex.taxi.search.suggest.i;

/* loaded from: classes6.dex */
public final class c {
    public final i a;
    public final o b;
    public final com.yandex.go.zone.interactors.b c;
    public final tt2 d;
    public final tu30 e;

    public c(i iVar, o oVar, com.yandex.go.zone.interactors.b bVar, tt2 tt2Var, tu30 tu30Var) {
        this.a = iVar;
        this.b = oVar;
        this.c = bVar;
        this.d = tt2Var;
        this.e = tu30Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(c cVar, pv0 pv0Var, ContinuationImpl continuationImpl) {
        UpdateSourceAddressInteractor$fetchZone$1 updateSourceAddressInteractor$fetchZone$1;
        int i;
        cVar.getClass();
        try {
            if (continuationImpl instanceof UpdateSourceAddressInteractor$fetchZone$1) {
                updateSourceAddressInteractor$fetchZone$1 = (UpdateSourceAddressInteractor$fetchZone$1) continuationImpl;
                int i2 = updateSourceAddressInteractor$fetchZone$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    updateSourceAddressInteractor$fetchZone$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = updateSourceAddressInteractor$fetchZone$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = updateSourceAddressInteractor$fetchZone$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        com.yandex.go.zone.interactors.b bVar = cVar.c;
                        String zoneName = pv0Var.a.getZoneName();
                        zzs B = pv0Var.a.B();
                        updateSourceAddressInteractor$fetchZone$1.L$0 = null;
                        updateSourceAddressInteractor$fetchZone$1.label = 1;
                        obj = bVar.d(zoneName, B, updateSourceAddressInteractor$fetchZone$1);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                    }
                    return (Zone) obj;
                }
            }
            if (i != 0) {
            }
            return (Zone) obj;
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            xby.l(jst.e, "Transport.Address.ZoneFetchingError", null, th, "Zone fetching error", 2);
            return null;
        }
        updateSourceAddressInteractor$fetchZone$1 = new UpdateSourceAddressInteractor$fetchZone$1(cVar, continuationImpl);
        Object obj2 = updateSourceAddressInteractor$fetchZone$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = updateSourceAddressInteractor$fetchZone$1.label;
    }

    public final Object b(SuspendLambda suspendLambda) {
        tpr k;
        k = this.a.k(RoutePointType.TRANSPORT_A, false);
        kotlinx.coroutines.flow.o oVar = new kotlinx.coroutines.flow.o(new jqr(new m0(new b(k), com.yandex.go.coroutines.b.d(this.b.c(), new UpdateSourceAddressInteractor$zoneInfoFlow$$inlined$start$1(null, this)), new UpdateSourceAddressInteractor$startSourceAddressUpdates$2(null, this)), new UpdateSourceAddressInteractor$startSourceAddressUpdates$3(2, this.e, tu30.class, "updateSource", "updateSource(Lcom/yandex/go/address/models/ZoneAddress;)V", 4), 3), new UpdateSourceAddressInteractor$startSourceAddressUpdates$4(3, null));
        this.d.getClass();
        sjh sjhVar = uyj.a;
        return e.j(e.F(oVar, mdh.b), suspendLambda);
    }
}
