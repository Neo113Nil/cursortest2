package ru.yandex.taxi.map_common.map;

import com.yandex.mapkit.MapKit;
import com.yandex.mapkit.MapKitFactory;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lzy11;", "<anonymous>", "()V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.map_common.map.MapKitManagerImpl$invokeCallback$1", f = "MapKitManagerImpl.kt", l = {242}, m = "invokeSuspend", v = 2)
/* loaded from: classes9.dex */
final class MapKitManagerImpl$invokeCallback$1 extends SuspendLambda implements tls {
    final /* synthetic */ wls $callback;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapKitManagerImpl$invokeCallback$1(wls wlsVar, Continuation continuation) {
        super(1, continuation);
        this.$callback = wlsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new MapKitManagerImpl$invokeCallback$1(this.$callback, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((MapKitManagerImpl$invokeCallback$1) create((Continuation) obj)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            wls wlsVar = this.$callback;
            MapKit mapKitFactory = MapKitFactory.getInstance();
            this.label = 1;
            if (wlsVar.invoke(mapKitFactory, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11.a;
    }
}
