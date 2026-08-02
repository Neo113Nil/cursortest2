package ru.yandex.taxi.preorder.source.cars;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ldot0;", "<unused var>", "Lcom/yandex/go/navigation/screen/api/Screen;", "Lzy11;", "<anonymous>", "(Ldot0;Lcom/yandex/go/navigation/screen/api/Screen;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.preorder.source.cars.CarsImageResourceProvider$registerForInfoUpdates$1", f = "CarsImageResourceProvider.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class CarsImageResourceProvider$registerForInfoUpdates$1 extends SuspendLambda implements zls {
    int label;

    public CarsImageResourceProvider$registerForInfoUpdates$1() {
        super(3, null);
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        CarsImageResourceProvider$registerForInfoUpdates$1 carsImageResourceProvider$registerForInfoUpdates$1 = new CarsImageResourceProvider$registerForInfoUpdates$1(3, (Continuation) obj3);
        zy11 zy11Var = zy11.a;
        carsImageResourceProvider$registerForInfoUpdates$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            b.b(obj);
            return zy11.a;
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
