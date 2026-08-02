package ru.yandex.taxi.masstransit.datasource.routing;

import com.yandex.mapkit.RequestPoint;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ltse;", "Lkotlin/Result;", "", "Lcom/yandex/mapkit/transport/masstransit/Route;", "<anonymous>", "(Ltse;)Lkotlin/Result;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.masstransit.datasource.routing.MtRouteRequesterImpl$requestRoutesSuspend$2", f = "MtRouteRequesterImpl.kt", l = {36}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class MtRouteRequesterImpl$requestRoutesSuspend$2 extends SuspendLambda implements wls {
    final /* synthetic */ List<RequestPoint> $points;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MtRouteRequesterImpl$requestRoutesSuspend$2(b bVar, List list, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$points = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MtRouteRequesterImpl$requestRoutesSuspend$2(this.this$0, this.$points, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MtRouteRequesterImpl$requestRoutesSuspend$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.b.b(obj);
                b bVar = this.this$0;
                List<RequestPoint> list = this.$points;
                this.label = 1;
                obj = b.a(bVar, list, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
            }
            return new Result(obj);
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            return new Result(new Result.Failure(th));
        }
    }
}
