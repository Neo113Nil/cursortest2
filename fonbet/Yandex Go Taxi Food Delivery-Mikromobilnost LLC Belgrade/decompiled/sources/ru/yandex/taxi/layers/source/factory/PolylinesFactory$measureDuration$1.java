package ru.yandex.taxi.layers.source.factory;

import defpackage.byx;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.layers.analytics.LayersService;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "conditions", "Lzy11;", "<anonymous>", "(Ljava/util/List;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.layers.source.factory.PolylinesFactory$measureDuration$1", f = "PolylinesFactory.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes9.dex */
final class PolylinesFactory$measureDuration$1 extends SuspendLambda implements wls {
    final /* synthetic */ byx $layersCondition;
    final /* synthetic */ long $startTime;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PolylinesFactory$measureDuration$1(e eVar, byx byxVar, long j, Continuation continuation) {
        super(2, continuation);
        this.this$0 = eVar;
        this.$layersCondition = byxVar;
        this.$startTime = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        PolylinesFactory$measureDuration$1 polylinesFactory$measureDuration$1 = new PolylinesFactory$measureDuration$1(this.this$0, this.$layersCondition, this.$startTime, continuation);
        polylinesFactory$measureDuration$1.L$0 = obj;
        return polylinesFactory$measureDuration$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        PolylinesFactory$measureDuration$1 polylinesFactory$measureDuration$1 = (PolylinesFactory$measureDuration$1) create((List) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        polylinesFactory$measureDuration$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        List list = (List) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        this.this$0.a.d(this.$layersCondition, LayersService.POLYLINES, list.size(), System.currentTimeMillis() - this.$startTime);
        return zy11.a;
    }
}
