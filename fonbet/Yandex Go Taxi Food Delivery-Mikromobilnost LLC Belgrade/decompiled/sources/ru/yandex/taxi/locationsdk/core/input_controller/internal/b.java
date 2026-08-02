package ru.yandex.taxi.locationsdk.core.input_controller.internal;

import defpackage.bvf0;
import defpackage.jqr;
import defpackage.k7z;
import defpackage.m3f0;
import defpackage.mth;
import defpackage.ny61;
import defpackage.q6z;
import defpackage.rcz;
import defpackage.tpr;
import defpackage.zy11;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.n;
import kotlinx.coroutines.flow.o;
import ru.yandex.taxi.locationsdk.core.time.TimestampSelector;

/* loaded from: classes9.dex */
public final class b {
    public final d a;
    public final ru.yandex.taxi.locationsdk.core.location_bus.internal.a b;
    public final TimestampSelector c;
    public final rcz d;
    public final m3f0 e = new m3f0();

    public b(d dVar, ru.yandex.taxi.locationsdk.core.location_bus.internal.a aVar, TimestampSelector timestampSelector, rcz rczVar) {
        this.a = dVar;
        this.b = aVar;
        this.c = timestampSelector;
        this.d = rczVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0051, code lost:
    
        if (r8 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        InputControllerImpl$fetchLastKnownLocations$1 inputControllerImpl$fetchLastKnownLocations$1;
        int i;
        Iterator it;
        if (continuationImpl instanceof InputControllerImpl$fetchLastKnownLocations$1) {
            inputControllerImpl$fetchLastKnownLocations$1 = (InputControllerImpl$fetchLastKnownLocations$1) continuationImpl;
            int i2 = inputControllerImpl$fetchLastKnownLocations$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                inputControllerImpl$fetchLastKnownLocations$1.label = i2 - Integer.MIN_VALUE;
                Object obj = inputControllerImpl$fetchLastKnownLocations$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = inputControllerImpl$fetchLastKnownLocations$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    inputControllerImpl$fetchLastKnownLocations$1.label = 1;
                    obj = bvf0.n(new InputLocationProviderImpl$getAllLastKnownLocations$2(this.a, null), inputControllerImpl$fetchLastKnownLocations$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        it = (Iterator) inputControllerImpl$fetchLastKnownLocations$1.L$1;
                        kotlin.b.b(obj);
                        while (it.hasNext()) {
                            k7z k7zVar = (k7z) it.next();
                            inputControllerImpl$fetchLastKnownLocations$1.L$0 = null;
                            inputControllerImpl$fetchLastKnownLocations$1.L$1 = it;
                            inputControllerImpl$fetchLastKnownLocations$1.L$2 = null;
                            inputControllerImpl$fetchLastKnownLocations$1.label = 2;
                            if (this.b.a(k7zVar, true, inputControllerImpl$fetchLastKnownLocations$1) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        }
                        return zy11.a;
                    }
                    kotlin.b.b(obj);
                }
                it = ((Map) obj).values().iterator();
                while (it.hasNext()) {
                }
                return zy11.a;
            }
        }
        inputControllerImpl$fetchLastKnownLocations$1 = new InputControllerImpl$fetchLastKnownLocations$1(this, continuationImpl);
        Object obj2 = inputControllerImpl$fetchLastKnownLocations$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = inputControllerImpl$fetchLastKnownLocations$1.label;
        if (i != 0) {
        }
        it = ((Map) obj2).values().iterator();
        while (it.hasNext()) {
        }
        return zy11.a;
    }

    public final LinkedHashMap b(Set set) {
        ru.yandex.taxi.locationsdk.core.location_bus.internal.a aVar = this.b;
        ReentrantLock reentrantLock = aVar.c;
        reentrantLock.lock();
        try {
            LinkedHashMap linkedHashMap = aVar.d;
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                if (set.contains(new q6z(((q6z) entry.getKey()).a))) {
                    linkedHashMap2.put(entry.getKey(), entry.getValue());
                }
            }
            return linkedHashMap2;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final o c(tpr tprVar) {
        return ru.yandex.taxi.locationsdk.core.utils.a.a(kotlinx.coroutines.flow.e.X(kotlinx.coroutines.flow.e.t(tprVar), new InputControllerImpl$requestLocationUpdates$$inlined$flatMapLatest$1(null, this)), this.d, "ProcessorLocationControllerImpl/requestLocations");
    }

    public final o d(tpr tprVar, LinkedHashSet linkedHashSet) {
        return ru.yandex.taxi.locationsdk.core.utils.a.a(new n(c(tprVar), new InputControllerImpl$requestLocationUpdatesStartingWithLastKnown$1(this, linkedHashSet, null)), this.d, "ProcessorLocationControllerImpl/requestLocationUpdatesStartingWithLastKnown");
    }

    public final Object e(Continuation continuation) {
        tpr t = kotlinx.coroutines.flow.e.t(new mth(this.e.b, 12));
        d dVar = this.a;
        Object j = kotlinx.coroutines.flow.e.j(ru.yandex.taxi.locationsdk.core.utils.a.a(new jqr(ru.yandex.taxi.locationsdk.core.utils.a.a(kotlinx.coroutines.flow.e.i(new InputLocationProviderImpl$requestLocationUpdates$1(t, dVar, null)), dVar.c, "SourceLocationProviderOrchestrator"), new InputControllerImpl$start$2(2, this.b, ru.yandex.taxi.locationsdk.core.location_bus.internal.a.class, "acceptLocation", "acceptLocation(Lru/yandex/taxi/locationsdk/core/location/Location;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0), 3), this.d, "ProcessorLocationControllerImpl/start"), continuation);
        return j == CoroutineSingletons.COROUTINE_SUSPENDED ? j : zy11.a;
    }
}
