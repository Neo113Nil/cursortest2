package ru.yandex.taxi.scooters.data;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.uso0;
import defpackage.wls;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/yandex/go/scooters/api/domain/model/b;", "slowdownsInfo", "Lzy11;", "<anonymous>", "(Lcom/yandex/go/scooters/api/domain/model/b;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.scooters.data.ScootersSlowdownRepository$startToListenSlowdownRidingTogetherStateFlow$3", f = "ScootersSlowdownRepository.kt", l = {HProv.ALG_SID_SHA3_224}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class ScootersSlowdownRepository$startToListenSlowdownRidingTogetherStateFlow$3 extends SuspendLambda implements wls {
    long J$0;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ z this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersSlowdownRepository$startToListenSlowdownRidingTogetherStateFlow$3(z zVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = zVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ScootersSlowdownRepository$startToListenSlowdownRidingTogetherStateFlow$3 scootersSlowdownRepository$startToListenSlowdownRidingTogetherStateFlow$3 = new ScootersSlowdownRepository$startToListenSlowdownRidingTogetherStateFlow$3(this.this$0, continuation);
        scootersSlowdownRepository$startToListenSlowdownRidingTogetherStateFlow$3.L$0 = ((com.yandex.go.scooters.api.domain.model.b) obj).a;
        return scootersSlowdownRepository$startToListenSlowdownRidingTogetherStateFlow$3;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        List list = ((com.yandex.go.scooters.api.domain.model.b) obj).a;
        ScootersSlowdownRepository$startToListenSlowdownRidingTogetherStateFlow$3 scootersSlowdownRepository$startToListenSlowdownRidingTogetherStateFlow$3 = new ScootersSlowdownRepository$startToListenSlowdownRidingTogetherStateFlow$3(this.this$0, (Continuation) obj2);
        scootersSlowdownRepository$startToListenSlowdownRidingTogetherStateFlow$3.L$0 = list;
        return scootersSlowdownRepository$startToListenSlowdownRidingTogetherStateFlow$3.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        uso0 uso0Var;
        List list = (List) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i != 0) {
            if (i == 1) {
                kotlin.b.b(obj);
                return zy11Var;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        if (com.yandex.go.scooters.api.domain.model.b.a(list)) {
            z zVar = this.this$0;
            if (zVar.c && (uso0Var = zVar.b) != null) {
                long j = uso0Var.c;
                this.L$0 = null;
                this.J$0 = j;
                this.label = 1;
                if (kotlinx.coroutines.a.i(j, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
        }
        return zy11Var;
    }
}
