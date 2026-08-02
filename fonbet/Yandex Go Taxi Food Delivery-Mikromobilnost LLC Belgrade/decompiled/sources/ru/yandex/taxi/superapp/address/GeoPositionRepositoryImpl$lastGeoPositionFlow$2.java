package ru.yandex.taxi.superapp.address;

import defpackage.h1p;
import defpackage.i0t;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.rvf0;
import defpackage.wls;
import defpackage.zy11;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Li0t;", "geoPositionWithAnalyticsData", "Lzy11;", "<anonymous>", "(Li0t;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.superapp.address.GeoPositionRepositoryImpl$lastGeoPositionFlow$2", f = "GeoPositionRepositoryImpl.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class GeoPositionRepositoryImpl$lastGeoPositionFlow$2 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ f this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GeoPositionRepositoryImpl$lastGeoPositionFlow$2(f fVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        GeoPositionRepositoryImpl$lastGeoPositionFlow$2 geoPositionRepositoryImpl$lastGeoPositionFlow$2 = new GeoPositionRepositoryImpl$lastGeoPositionFlow$2(this.this$0, continuation);
        geoPositionRepositoryImpl$lastGeoPositionFlow$2.L$0 = obj;
        return geoPositionRepositoryImpl$lastGeoPositionFlow$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        GeoPositionRepositoryImpl$lastGeoPositionFlow$2 geoPositionRepositoryImpl$lastGeoPositionFlow$2 = (GeoPositionRepositoryImpl$lastGeoPositionFlow$2) create((i0t) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        geoPositionRepositoryImpl$lastGeoPositionFlow$2.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        i0t i0tVar = (i0t) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        f fVar = this.this$0;
        rvf0 rvf0Var = fVar.b;
        h1p h1pVar = fVar.d;
        ConcurrentHashMap concurrentHashMap = rvf0Var.a;
        if (i0tVar != null) {
            concurrentHashMap.put(h1pVar, i0tVar);
        } else {
            concurrentHashMap.remove(h1pVar);
        }
        return zy11.a;
    }
}
