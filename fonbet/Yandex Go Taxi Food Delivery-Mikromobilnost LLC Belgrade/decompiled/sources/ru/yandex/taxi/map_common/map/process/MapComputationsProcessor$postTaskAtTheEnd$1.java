package ru.yandex.taxi.map_common.map.process;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lzy11;", "<anonymous>", "()V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.map_common.map.process.MapComputationsProcessor$postTaskAtTheEnd$1", f = "MapComputationsProcessor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class MapComputationsProcessor$postTaskAtTheEnd$1 extends SuspendLambda implements tls {
    final /* synthetic */ Runnable $task;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapComputationsProcessor$postTaskAtTheEnd$1(Runnable runnable, Continuation continuation) {
        super(1, continuation);
        this.$task = runnable;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new MapComputationsProcessor$postTaskAtTheEnd$1(this.$task, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        MapComputationsProcessor$postTaskAtTheEnd$1 mapComputationsProcessor$postTaskAtTheEnd$1 = (MapComputationsProcessor$postTaskAtTheEnd$1) create((Continuation) obj);
        zy11 zy11Var = zy11.a;
        mapComputationsProcessor$postTaskAtTheEnd$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        this.$task.run();
        return zy11.a;
    }
}
