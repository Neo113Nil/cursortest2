package ru.yandex.taxi.preorder.source.sourcepointzone;

import com.yandex.go.parks.nearest.data.models.NotSupportedAddressException;
import com.yandex.go.zone.interactors.b;
import com.yandex.go.zone.model.Zone;
import com.yandex.go.zone.repository.o;
import defpackage.dd61;
import defpackage.ny61;
import defpackage.pv0;
import defpackage.svd0;
import defpackage.zzs;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes9.dex */
public final class a implements svd0 {
    public final o a;
    public final b b;

    public a(o oVar, b bVar) {
        this.a = oVar;
        this.b = bVar;
    }

    public final Object a(pv0 pv0Var, boolean z, ContinuationImpl continuationImpl) {
        this.a.g();
        return b(pv0Var, z, continuationImpl);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(pv0 pv0Var, boolean z, ContinuationImpl continuationImpl) {
        ZoneAddressInfoInteractor$resolveZoneAddressInfo$2 zoneAddressInfoInteractor$resolveZoneAddressInfo$2;
        int i;
        Zone zone;
        if (continuationImpl instanceof ZoneAddressInfoInteractor$resolveZoneAddressInfo$2) {
            zoneAddressInfoInteractor$resolveZoneAddressInfo$2 = (ZoneAddressInfoInteractor$resolveZoneAddressInfo$2) continuationImpl;
            int i2 = zoneAddressInfoInteractor$resolveZoneAddressInfo$2.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                zoneAddressInfoInteractor$resolveZoneAddressInfo$2.label = i2 - Integer.MIN_VALUE;
                Object obj = zoneAddressInfoInteractor$resolveZoneAddressInfo$2.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = zoneAddressInfoInteractor$resolveZoneAddressInfo$2.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    String zoneName = pv0Var.a.getZoneName();
                    zzs B = pv0Var.a.B();
                    zoneAddressInfoInteractor$resolveZoneAddressInfo$2.L$0 = pv0Var;
                    zoneAddressInfoInteractor$resolveZoneAddressInfo$2.L$1 = null;
                    zoneAddressInfoInteractor$resolveZoneAddressInfo$2.Z$0 = z;
                    zoneAddressInfoInteractor$resolveZoneAddressInfo$2.label = 1;
                    obj = this.b.d(zoneName, B, zoneAddressInfoInteractor$resolveZoneAddressInfo$2);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    pv0Var = (pv0) zoneAddressInfoInteractor$resolveZoneAddressInfo$2.L$0;
                    kotlin.b.b(obj);
                }
                zone = (Zone) obj;
                if (zone == null && zone.h()) {
                    return new dd61(pv0Var, zone);
                }
                throw new NotSupportedAddressException(pv0Var.a, pv0Var.d);
            }
        }
        zoneAddressInfoInteractor$resolveZoneAddressInfo$2 = new ZoneAddressInfoInteractor$resolveZoneAddressInfo$2(this, continuationImpl);
        Object obj2 = zoneAddressInfoInteractor$resolveZoneAddressInfo$2.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = zoneAddressInfoInteractor$resolveZoneAddressInfo$2.label;
        if (i != 0) {
        }
        zone = (Zone) obj2;
        if (zone == null) {
        }
        throw new NotSupportedAddressException(pv0Var.a, pv0Var.d);
    }
}
