package ru.yandex.taxi.polling;

import defpackage.g9z;
import defpackage.jl40;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.persuggest.domain.model.CoordinateProvider$Source;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lvpr;", "Landroid/location/Location;", "", "it", "Lzy11;", "<anonymous>", "(Lvpr;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.polling.LocationsFlowRepository$addSendErrorOnCompletion$1", f = "LocationsFlowRepository.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class LocationsFlowRepository$addSendErrorOnCompletion$1 extends SuspendLambda implements zls {
    final /* synthetic */ CoordinateProvider$Source $source;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocationsFlowRepository$addSendErrorOnCompletion$1(e eVar, CoordinateProvider$Source coordinateProvider$Source, Continuation continuation) {
        super(3, continuation);
        this.this$0 = eVar;
        this.$source = coordinateProvider$Source;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        LocationsFlowRepository$addSendErrorOnCompletion$1 locationsFlowRepository$addSendErrorOnCompletion$1 = new LocationsFlowRepository$addSendErrorOnCompletion$1(this.this$0, this.$source, (Continuation) obj3);
        locationsFlowRepository$addSendErrorOnCompletion$1.L$0 = (Throwable) obj2;
        zy11 zy11Var = zy11.a;
        locationsFlowRepository$addSendErrorOnCompletion$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Throwable th = (Throwable) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        boolean l = jl40.l(th != null ? th.getMessage() : null, "CANCEL_BY_ON_DESTROY_MESSAGE");
        zy11 zy11Var = zy11.a;
        if (!l) {
            if (!jl40.l(th != null ? th.getMessage() : null, "CANCEL_BY_ON_STOP_MESSAGE")) {
                g9z g9zVar = this.this$0.f;
                if (th == null) {
                    th = new IllegalStateException("throwable is null for " + this.$source);
                }
                String str = "collect is end for " + this.$source;
                g9zVar.getClass();
                g9z.a(th, str);
            }
        }
        return zy11Var;
    }
}
