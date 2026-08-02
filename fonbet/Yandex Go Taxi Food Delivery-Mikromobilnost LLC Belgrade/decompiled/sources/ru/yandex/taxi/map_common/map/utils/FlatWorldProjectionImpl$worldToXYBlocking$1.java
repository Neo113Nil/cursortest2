package ru.yandex.taxi.map_common.map.utils;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import defpackage.zzs;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lcom/yandex/mapkit/geometry/geo/XYPoint;", "<anonymous>", "(Ltse;)Lcom/yandex/mapkit/geometry/geo/XYPoint;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.map_common.map.utils.FlatWorldProjectionImpl$worldToXYBlocking$1", f = "FlatWorldProjectionImpl.kt", l = {40}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class FlatWorldProjectionImpl$worldToXYBlocking$1 extends SuspendLambda implements wls {
    final /* synthetic */ zzs $geoPoint;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlatWorldProjectionImpl$worldToXYBlocking$1(a aVar, zzs zzsVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$geoPoint = zzsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new FlatWorldProjectionImpl$worldToXYBlocking$1(this.this$0, this.$geoPoint, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((FlatWorldProjectionImpl$worldToXYBlocking$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                kotlin.b.b(obj);
                return obj;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        a aVar = this.this$0;
        zzs zzsVar = this.$geoPoint;
        this.label = 1;
        aVar.getClass();
        Object b = aVar.b(ru.yandex.taxi.map.utils.a.F(zzsVar), this);
        return b == coroutineSingletons ? coroutineSingletons : b;
    }
}
