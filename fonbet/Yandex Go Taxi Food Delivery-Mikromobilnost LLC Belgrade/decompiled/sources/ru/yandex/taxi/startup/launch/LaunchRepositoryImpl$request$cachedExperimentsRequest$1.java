package ru.yandex.taxi.startup.launch;

import com.yandex.go.experiments.api.ExperimentSource;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lhd7;", "<anonymous>", "(Ltse;)Lhd7;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.startup.launch.LaunchRepositoryImpl$request$cachedExperimentsRequest$1", f = "LaunchRepositoryImpl.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes10.dex */
final class LaunchRepositoryImpl$request$cachedExperimentsRequest$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ l this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LaunchRepositoryImpl$request$cachedExperimentsRequest$1(l lVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = lVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LaunchRepositoryImpl$request$cachedExperimentsRequest$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((LaunchRepositoryImpl$request$cachedExperimentsRequest$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            kotlin.b.b(obj);
            return this.this$0.i.b(ExperimentSource.LAUNCH, true);
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
