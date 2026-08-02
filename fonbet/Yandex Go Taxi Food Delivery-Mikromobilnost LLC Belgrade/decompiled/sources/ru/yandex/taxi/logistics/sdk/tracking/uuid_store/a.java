package ru.yandex.taxi.logistics.sdk.tracking.uuid_store;

import defpackage.mme0;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import java.util.Map;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes9.dex */
public final class a implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ b b;

    public a(vpr vprVar, b bVar) {
        this.a = vprVar;
        this.b = bVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        TrackingLocalUuidPreferences$localUuidsMapFlow$$inlined$map$1$2$1 trackingLocalUuidPreferences$localUuidsMapFlow$$inlined$map$1$2$1;
        int i;
        Map f;
        if (continuation instanceof TrackingLocalUuidPreferences$localUuidsMapFlow$$inlined$map$1$2$1) {
            trackingLocalUuidPreferences$localUuidsMapFlow$$inlined$map$1$2$1 = (TrackingLocalUuidPreferences$localUuidsMapFlow$$inlined$map$1$2$1) continuation;
            int i2 = trackingLocalUuidPreferences$localUuidsMapFlow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                trackingLocalUuidPreferences$localUuidsMapFlow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = trackingLocalUuidPreferences$localUuidsMapFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = trackingLocalUuidPreferences$localUuidsMapFlow$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    b bVar = this.b;
                    String str = (String) ((mme0) obj).c(bVar.b);
                    if (str == null || (f = (Map) bVar.c.fromJson(str)) == null) {
                        f = kotlin.collections.b.f();
                    }
                    trackingLocalUuidPreferences$localUuidsMapFlow$$inlined$map$1$2$1.L$0 = null;
                    trackingLocalUuidPreferences$localUuidsMapFlow$$inlined$map$1$2$1.L$1 = null;
                    trackingLocalUuidPreferences$localUuidsMapFlow$$inlined$map$1$2$1.L$2 = null;
                    trackingLocalUuidPreferences$localUuidsMapFlow$$inlined$map$1$2$1.L$3 = null;
                    trackingLocalUuidPreferences$localUuidsMapFlow$$inlined$map$1$2$1.I$0 = 0;
                    trackingLocalUuidPreferences$localUuidsMapFlow$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(f, trackingLocalUuidPreferences$localUuidsMapFlow$$inlined$map$1$2$1) == coroutineSingletons) {
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
        trackingLocalUuidPreferences$localUuidsMapFlow$$inlined$map$1$2$1 = new TrackingLocalUuidPreferences$localUuidsMapFlow$$inlined$map$1$2$1(this, continuation);
        Object obj22 = trackingLocalUuidPreferences$localUuidsMapFlow$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = trackingLocalUuidPreferences$localUuidsMapFlow$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
