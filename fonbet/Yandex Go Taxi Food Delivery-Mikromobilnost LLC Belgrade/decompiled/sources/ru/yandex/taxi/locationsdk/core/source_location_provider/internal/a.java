package ru.yandex.taxi.locationsdk.core.source_location_provider.internal;

import defpackage.ny61;
import defpackage.o0w;
import defpackage.q6z;
import defpackage.vpr;
import defpackage.zy11;
import java.util.Map;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import ru.yandex.taxi.locationsdk.core.priority.InputSourcePriority$Active;

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
        SourceLocationProviderImpl$requestLocationUpdates$$inlined$map$1$2$1 sourceLocationProviderImpl$requestLocationUpdates$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof SourceLocationProviderImpl$requestLocationUpdates$$inlined$map$1$2$1) {
            sourceLocationProviderImpl$requestLocationUpdates$$inlined$map$1$2$1 = (SourceLocationProviderImpl$requestLocationUpdates$$inlined$map$1$2$1) continuation;
            int i2 = sourceLocationProviderImpl$requestLocationUpdates$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                sourceLocationProviderImpl$requestLocationUpdates$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = sourceLocationProviderImpl$requestLocationUpdates$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = sourceLocationProviderImpl$requestLocationUpdates$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    Map map = (Map) obj;
                    String str = this.b.a;
                    Object obj3 = (InputSourcePriority$Active) map.get(str != null ? new q6z(str) : null);
                    if (obj3 == null) {
                        obj3 = o0w.a;
                    }
                    sourceLocationProviderImpl$requestLocationUpdates$$inlined$map$1$2$1.L$0 = null;
                    sourceLocationProviderImpl$requestLocationUpdates$$inlined$map$1$2$1.L$1 = null;
                    sourceLocationProviderImpl$requestLocationUpdates$$inlined$map$1$2$1.L$2 = null;
                    sourceLocationProviderImpl$requestLocationUpdates$$inlined$map$1$2$1.L$3 = null;
                    sourceLocationProviderImpl$requestLocationUpdates$$inlined$map$1$2$1.I$0 = 0;
                    sourceLocationProviderImpl$requestLocationUpdates$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(obj3, sourceLocationProviderImpl$requestLocationUpdates$$inlined$map$1$2$1) == coroutineSingletons) {
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
        sourceLocationProviderImpl$requestLocationUpdates$$inlined$map$1$2$1 = new SourceLocationProviderImpl$requestLocationUpdates$$inlined$map$1$2$1(this, continuation);
        Object obj22 = sourceLocationProviderImpl$requestLocationUpdates$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = sourceLocationProviderImpl$requestLocationUpdates$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
