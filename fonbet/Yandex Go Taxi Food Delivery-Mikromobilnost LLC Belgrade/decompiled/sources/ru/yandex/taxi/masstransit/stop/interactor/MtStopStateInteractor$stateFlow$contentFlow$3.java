package ru.yandex.taxi.masstransit.stop.interactor;

import defpackage.bms;
import defpackage.i440;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.z340;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lz340;", ClidProvider.STATE, "Li440;", "walkState", "Lru/yandex/taxi/theme/ThemeType;", "<unused var>", "Lkotlin/Pair;", "<anonymous>", "(Lz340;Li440;Lru/yandex/taxi/theme/ThemeType;)Lkotlin/Pair;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.masstransit.stop.interactor.MtStopStateInteractor$stateFlow$contentFlow$3", f = "MtStopStateInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class MtStopStateInteractor$stateFlow$contentFlow$3 extends SuspendLambda implements bms {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    @Override // defpackage.bms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        MtStopStateInteractor$stateFlow$contentFlow$3 mtStopStateInteractor$stateFlow$contentFlow$3 = new MtStopStateInteractor$stateFlow$contentFlow$3(4, (Continuation) obj4);
        mtStopStateInteractor$stateFlow$contentFlow$3.L$0 = (z340) obj;
        mtStopStateInteractor$stateFlow$contentFlow$3.L$1 = (i440) obj2;
        return mtStopStateInteractor$stateFlow$contentFlow$3.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        z340 z340Var = (z340) this.L$0;
        i440 i440Var = (i440) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            kotlin.b.b(obj);
            return new Pair(z340Var, i440Var);
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
