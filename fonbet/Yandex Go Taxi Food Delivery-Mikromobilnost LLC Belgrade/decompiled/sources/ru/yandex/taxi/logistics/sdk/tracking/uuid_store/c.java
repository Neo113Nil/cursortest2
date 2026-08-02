package ru.yandex.taxi.logistics.sdk.tracking.uuid_store;

import defpackage.jl40;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes5.dex */
public final class c implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ UUID b;

    public c(vpr vprVar, UUID uuid) {
        this.a = vprVar;
        this.b = uuid;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        TrackingLocalUuidStore$flowForUuid$$inlined$mapNotNull$1$2$1 trackingLocalUuidStore$flowForUuid$$inlined$mapNotNull$1$2$1;
        int i;
        Object obj2;
        if (continuation instanceof TrackingLocalUuidStore$flowForUuid$$inlined$mapNotNull$1$2$1) {
            trackingLocalUuidStore$flowForUuid$$inlined$mapNotNull$1$2$1 = (TrackingLocalUuidStore$flowForUuid$$inlined$mapNotNull$1$2$1) continuation;
            int i2 = trackingLocalUuidStore$flowForUuid$$inlined$mapNotNull$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                trackingLocalUuidStore$flowForUuid$$inlined$mapNotNull$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj3 = trackingLocalUuidStore$flowForUuid$$inlined$mapNotNull$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = trackingLocalUuidStore$flowForUuid$$inlined$mapNotNull$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj3);
                    Map map = (Map) obj;
                    Iterator it = map.keySet().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj2 = null;
                            break;
                        }
                        obj2 = it.next();
                        if (jl40.l(map.get((String) obj2), this.b)) {
                            break;
                        }
                    }
                    if (obj2 != null) {
                        trackingLocalUuidStore$flowForUuid$$inlined$mapNotNull$1$2$1.L$0 = null;
                        trackingLocalUuidStore$flowForUuid$$inlined$mapNotNull$1$2$1.L$1 = null;
                        trackingLocalUuidStore$flowForUuid$$inlined$mapNotNull$1$2$1.L$2 = null;
                        trackingLocalUuidStore$flowForUuid$$inlined$mapNotNull$1$2$1.L$3 = null;
                        trackingLocalUuidStore$flowForUuid$$inlined$mapNotNull$1$2$1.L$4 = null;
                        trackingLocalUuidStore$flowForUuid$$inlined$mapNotNull$1$2$1.I$0 = 0;
                        trackingLocalUuidStore$flowForUuid$$inlined$mapNotNull$1$2$1.label = 1;
                        if (this.a.emit(obj2, trackingLocalUuidStore$flowForUuid$$inlined$mapNotNull$1$2$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj3);
                }
                return zy11.a;
            }
        }
        trackingLocalUuidStore$flowForUuid$$inlined$mapNotNull$1$2$1 = new TrackingLocalUuidStore$flowForUuid$$inlined$mapNotNull$1$2$1(this, continuation);
        Object obj32 = trackingLocalUuidStore$flowForUuid$$inlined$mapNotNull$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = trackingLocalUuidStore$flowForUuid$$inlined$mapNotNull$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
