package ru.yandex.taxi.layers.source.factory;

import defpackage.an00;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pvn;
import defpackage.wls;
import defpackage.ym00;
import defpackage.zm00;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\n\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "it", "Ltpr;", "<anonymous>"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.layers.source.factory.MapObjectFactory$createMapObject$lambda$0$$inlined$flatMapMerge$1", f = "MapObjectFactory.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
public final class MapObjectFactory$createMapObject$lambda$0$$inlined$flatMapMerge$1 extends SuspendLambda implements wls {
    final /* synthetic */ ym00 $bodyComponent$inlined;
    final /* synthetic */ an00 $contextWithBody$inlined;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapObjectFactory$createMapObject$lambda$0$$inlined$flatMapMerge$1(Continuation continuation, ym00 ym00Var, an00 an00Var) {
        super(2, continuation);
        this.$bodyComponent$inlined = ym00Var;
        this.$contextWithBody$inlined = an00Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        MapObjectFactory$createMapObject$lambda$0$$inlined$flatMapMerge$1 mapObjectFactory$createMapObject$lambda$0$$inlined$flatMapMerge$1 = new MapObjectFactory$createMapObject$lambda$0$$inlined$flatMapMerge$1(continuation, this.$bodyComponent$inlined, this.$contextWithBody$inlined);
        mapObjectFactory$createMapObject$lambda$0$$inlined$flatMapMerge$1.L$0 = obj;
        return mapObjectFactory$createMapObject$lambda$0$$inlined$flatMapMerge$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MapObjectFactory$createMapObject$lambda$0$$inlined$flatMapMerge$1) create(obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object obj2 = this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        zm00 zm00Var = (zm00) obj2;
        return (zm00Var.c() && this.$bodyComponent$inlined == null) ? pvn.a : zm00Var.a(this.$contextWithBody$inlined);
    }
}
