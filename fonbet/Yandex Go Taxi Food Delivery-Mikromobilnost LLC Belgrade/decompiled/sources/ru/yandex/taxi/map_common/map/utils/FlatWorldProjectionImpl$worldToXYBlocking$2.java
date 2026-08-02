package ru.yandex.taxi.map_common.map.utils;

import com.yandex.mapkit.geometry.Point;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lcom/yandex/mapkit/geometry/geo/XYPoint;", "<anonymous>", "(Ltse;)Lcom/yandex/mapkit/geometry/geo/XYPoint;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.map_common.map.utils.FlatWorldProjectionImpl$worldToXYBlocking$2", f = "FlatWorldProjectionImpl.kt", l = {46}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class FlatWorldProjectionImpl$worldToXYBlocking$2 extends SuspendLambda implements wls {
    final /* synthetic */ Point $geoPoint;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlatWorldProjectionImpl$worldToXYBlocking$2(a aVar, Point point, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$geoPoint = point;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new FlatWorldProjectionImpl$worldToXYBlocking$2(this.this$0, this.$geoPoint, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((FlatWorldProjectionImpl$worldToXYBlocking$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
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
        Point point = this.$geoPoint;
        this.label = 1;
        Object b = aVar.b(point, this);
        return b == coroutineSingletons ? coroutineSingletons : b;
    }
}
