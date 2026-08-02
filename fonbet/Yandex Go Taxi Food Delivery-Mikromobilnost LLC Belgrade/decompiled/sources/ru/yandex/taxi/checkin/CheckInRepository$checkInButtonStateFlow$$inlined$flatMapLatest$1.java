package ru.yandex.taxi.checkin;

import com.yandex.go.taxi.order.models.api.TaxiOrder;
import defpackage.bvf0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pz40;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zls;
import defpackage.zy11;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "Lvpr;", "it", "Lzy11;", "<anonymous>"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.checkin.CheckInRepository$checkInButtonStateFlow$$inlined$flatMapLatest$1", f = "CheckInRepository.kt", l = {189}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
public final class CheckInRepository$checkInButtonStateFlow$$inlined$flatMapLatest$1 extends SuspendLambda implements zls {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheckInRepository$checkInButtonStateFlow$$inlined$flatMapLatest$1(Continuation continuation, d dVar) {
        super(3, continuation);
        this.this$0 = dVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        CheckInRepository$checkInButtonStateFlow$$inlined$flatMapLatest$1 checkInRepository$checkInButtonStateFlow$$inlined$flatMapLatest$1 = new CheckInRepository$checkInButtonStateFlow$$inlined$flatMapLatest$1((Continuation) obj3, this.this$0);
        checkInRepository$checkInButtonStateFlow$$inlined$flatMapLatest$1.L$0 = (vpr) obj;
        checkInRepository$checkInButtonStateFlow$$inlined$flatMapLatest$1.L$1 = obj2;
        return checkInRepository$checkInButtonStateFlow$$inlined$flatMapLatest$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        vpr vprVar = (vpr) this.L$0;
        Object obj2 = this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            d dVar = this.this$0;
            String str = ((TaxiOrder) obj2).a;
            LinkedHashMap linkedHashMap = dVar.h;
            tpr tprVar = (pz40) linkedHashMap.get(str);
            if (tprVar == null) {
                tprVar = bvf0.c(CheckInButtonState.IDLE);
                linkedHashMap.put(str, tprVar);
            }
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            if (kotlinx.coroutines.flow.e.u(tprVar, vprVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11.a;
    }
}
