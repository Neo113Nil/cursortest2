package ru.yandex.taxi.di;

import defpackage.alf0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lcom/yandex/mapkit/geometry/geo/Projection;"}, k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "ru.yandex.taxi.di.MapCommonAppModule$Companion$provideProjection$1", f = "MapCommonAppModule.kt", l = {60}, m = "invokeSuspend", v = 2)
/* loaded from: classes9.dex */
final class MapCommonAppModule$Companion$provideProjection$1 extends SuspendLambda implements tls {
    final /* synthetic */ alf0 $projectionFactory;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapCommonAppModule$Companion$provideProjection$1(alf0 alf0Var, Continuation continuation) {
        super(1, continuation);
        this.$projectionFactory = alf0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new MapCommonAppModule$Companion$provideProjection$1(this.$projectionFactory, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((MapCommonAppModule$Companion$provideProjection$1) create((Continuation) obj)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                b.b(obj);
                return obj;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        alf0 alf0Var = this.$projectionFactory;
        this.label = 1;
        Object a = ((ru.yandex.taxi.map_common.map.utils.b) alf0Var).a(this);
        return a == coroutineSingletons ? coroutineSingletons : a;
    }
}
