package ru.yandex.taxi.masstransit.discovery;

import com.yandex.go.address.models.Address;
import com.yandex.go.address.models.ZoneAddress;
import com.yandex.mapkit.geometry.Point;
import defpackage.ah00;
import defpackage.b0x0;
import defpackage.fh00;
import defpackage.g8e;
import defpackage.gci0;
import defpackage.gh00;
import defpackage.jst;
import defpackage.ny61;
import defpackage.tu30;
import defpackage.zy11;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.e;

/* loaded from: classes6.dex */
public final class a {
    public final ah00 a;
    public final tu30 b;
    public final b0x0 c;

    public a(ah00 ah00Var, tu30 tu30Var, b0x0 b0x0Var) {
        this.a = ah00Var;
        this.b = tu30Var;
        this.c = b0x0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        MtDiscoveryMapPositionInteractor$setMapPosition$1 mtDiscoveryMapPositionInteractor$setMapPosition$1;
        int i;
        Address address;
        if (continuationImpl instanceof MtDiscoveryMapPositionInteractor$setMapPosition$1) {
            mtDiscoveryMapPositionInteractor$setMapPosition$1 = (MtDiscoveryMapPositionInteractor$setMapPosition$1) continuationImpl;
            int i2 = mtDiscoveryMapPositionInteractor$setMapPosition$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mtDiscoveryMapPositionInteractor$setMapPosition$1.label = i2 - Integer.MIN_VALUE;
                Object obj = mtDiscoveryMapPositionInteractor$setMapPosition$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mtDiscoveryMapPositionInteractor$setMapPosition$1.label;
                if (i != 0) {
                    b.b(obj);
                    gci0 d = e.d(this.c.a);
                    MtDiscoveryMapPositionInteractor$setMapPosition$2 mtDiscoveryMapPositionInteractor$setMapPosition$2 = new MtDiscoveryMapPositionInteractor$setMapPosition$2(2, null);
                    mtDiscoveryMapPositionInteractor$setMapPosition$1.label = 1;
                    if (e.x(d, mtDiscoveryMapPositionInteractor$setMapPosition$2, mtDiscoveryMapPositionInteractor$setMapPosition$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                }
                ZoneAddress zoneAddress = this.b.a().a;
                address = zoneAddress == null ? zoneAddress.a : null;
                if (address == null) {
                    Point point = new Point(address.B().a, address.B().b);
                    gh00 gh00Var = (gh00) this.a;
                    gh00Var.q(new fh00(gh00Var, point, 17.0f));
                } else {
                    g8e.B(jst.e, "Transport.InitMapPosition", null, "try to set map position with null source address", 2);
                }
                return zy11.a;
            }
        }
        mtDiscoveryMapPositionInteractor$setMapPosition$1 = new MtDiscoveryMapPositionInteractor$setMapPosition$1(this, continuationImpl);
        Object obj2 = mtDiscoveryMapPositionInteractor$setMapPosition$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mtDiscoveryMapPositionInteractor$setMapPosition$1.label;
        if (i != 0) {
        }
        ZoneAddress zoneAddress2 = this.b.a().a;
        if (zoneAddress2 == null) {
        }
        if (address == null) {
        }
        return zy11.a;
    }
}
