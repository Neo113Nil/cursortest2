package ru.yandex.taxi.map_common.map.process;

import defpackage.mbp0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.zy11;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lzy11;", "<anonymous>", "()V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.map_common.map.process.MapComputationProcessorExtensionsKt$iterateByChunks$1", f = "MapComputationProcessorExtensions.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class MapComputationProcessorExtensionsKt$iterateByChunks$1 extends SuspendLambda implements tls {
    final /* synthetic */ tls $action;
    final /* synthetic */ List<Collection<Object>> $chunks;
    final /* synthetic */ int $currentIndex;
    final /* synthetic */ mbp0 $this_iterateByChunks;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapComputationProcessorExtensionsKt$iterateByChunks$1(tls tlsVar, List list, int i, mbp0 mbp0Var, Continuation continuation) {
        super(1, continuation);
        this.$action = tlsVar;
        this.$chunks = list;
        this.$currentIndex = i;
        this.$this_iterateByChunks = mbp0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new MapComputationProcessorExtensionsKt$iterateByChunks$1(this.$action, this.$chunks, this.$currentIndex, this.$this_iterateByChunks, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        MapComputationProcessorExtensionsKt$iterateByChunks$1 mapComputationProcessorExtensionsKt$iterateByChunks$1 = (MapComputationProcessorExtensionsKt$iterateByChunks$1) create((Continuation) obj);
        zy11 zy11Var = zy11.a;
        mapComputationProcessorExtensionsKt$iterateByChunks$1.invokeSuspend(zy11Var);
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
        this.$action.invoke(this.$chunks.get(this.$currentIndex));
        if (this.$currentIndex < this.$chunks.size() - 1) {
            mbp0 mbp0Var = this.$this_iterateByChunks;
            mbp0Var.a(MapComputationsProcessor$ExecuteOn.MAIN, new MapComputationProcessorExtensionsKt$iterateByChunks$1(this.$action, this.$chunks, this.$currentIndex + 1, mbp0Var, null));
        }
        return zy11.a;
    }
}
