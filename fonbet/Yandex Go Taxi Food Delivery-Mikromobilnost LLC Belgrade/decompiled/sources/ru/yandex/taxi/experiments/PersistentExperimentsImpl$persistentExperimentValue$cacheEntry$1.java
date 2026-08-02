package ru.yandex.taxi.experiments;

import defpackage.clw0;
import defpackage.dxd;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.y1b0;
import defpackage.zy11;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u000b\u0012\u0002\b\u00030\u0001¢\u0006\u0002\b\u0002*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltse;", "Lz1b0;", "Lkotlin/jvm/internal/EnhancedNullability;", "<anonymous>", "(Ltse;)Lz1b0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.experiments.PersistentExperimentsImpl$persistentExperimentValue$cacheEntry$1", f = "PersistentExperimentsImpl.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes9.dex */
final class PersistentExperimentsImpl$persistentExperimentValue$cacheEntry$1 extends SuspendLambda implements wls {
    final /* synthetic */ clw0 $expInfo;
    int label;
    final /* synthetic */ p this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PersistentExperimentsImpl$persistentExperimentValue$cacheEntry$1(p pVar, clw0 clw0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = pVar;
        this.$expInfo = clw0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PersistentExperimentsImpl$persistentExperimentValue$cacheEntry$1(this.this$0, this.$expInfo, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PersistentExperimentsImpl$persistentExperimentValue$cacheEntry$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        p pVar = this.this$0;
        ConcurrentHashMap concurrentHashMap = pVar.f;
        clw0 clw0Var = this.$expInfo;
        return concurrentHashMap.computeIfAbsent(clw0Var, new dxd(8, new y1b0(pVar, clw0Var, 1)));
    }
}
