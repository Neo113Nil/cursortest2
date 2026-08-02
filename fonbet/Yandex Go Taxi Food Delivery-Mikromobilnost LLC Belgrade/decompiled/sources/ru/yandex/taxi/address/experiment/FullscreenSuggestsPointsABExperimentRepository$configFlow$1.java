package ru.yandex.taxi.address.experiment;

import defpackage.d6z;
import defpackage.kks;
import defpackage.mv0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o0j;
import defpackage.yw0;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkks;", "experiment", "Lru/yandex/taxi/theme/ThemeType;", "<unused var>", "Lru/yandex/taxi/address/experiment/e;", "<anonymous>", "(Lkks;Lru/yandex/taxi/theme/ThemeType;)Lru/yandex/taxi/address/experiment/e;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.address.experiment.FullscreenSuggestsPointsABExperimentRepository$configFlow$1", f = "FullscreenSuggestsPointsABExperimentRepository.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes9.dex */
final class FullscreenSuggestsPointsABExperimentRepository$configFlow$1 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FullscreenSuggestsPointsABExperimentRepository$configFlow$1(d dVar, Continuation continuation) {
        super(3, continuation);
        this.this$0 = dVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        FullscreenSuggestsPointsABExperimentRepository$configFlow$1 fullscreenSuggestsPointsABExperimentRepository$configFlow$1 = new FullscreenSuggestsPointsABExperimentRepository$configFlow$1(this.this$0, (Continuation) obj3);
        fullscreenSuggestsPointsABExperimentRepository$configFlow$1.L$0 = (kks) obj;
        return fullscreenSuggestsPointsABExperimentRepository$configFlow$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        kks kksVar = (kks) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        if (kksVar == null) {
            return null;
        }
        mv0 mv0Var = kksVar.e;
        d dVar = this.this$0;
        dVar.getClass();
        o0j o0jVar = new o0j("", "", "", "");
        yw0 c = dVar.c(mv0Var);
        mv0 mv0Var2 = kksVar.f;
        return new e(c, dVar.c(mv0Var2), dVar.c(mv0Var2), dVar.c(mv0Var), dVar.c(mv0Var2), d6z.Y(kksVar, kksVar.g), d6z.Y(kksVar, kksVar.h), "", d6z.Y(kksVar, kksVar.i), "", "", o0jVar, "", "", "", kksVar.j, d6z.Y(kksVar, kksVar.k), d6z.Y(kksVar, kksVar.l), kksVar.m, null, null, false, 7340032);
    }
}
