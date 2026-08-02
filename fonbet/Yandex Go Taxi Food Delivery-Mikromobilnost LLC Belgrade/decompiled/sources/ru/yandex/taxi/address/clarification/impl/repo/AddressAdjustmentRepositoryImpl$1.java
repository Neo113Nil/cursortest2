package ru.yandex.taxi.address.clarification.impl.repo;

import defpackage.dq0;
import defpackage.dvw;
import defpackage.e2t;
import defpackage.f2t;
import defpackage.j18;
import defpackage.mvg;
import defpackage.n35;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.address.clarification.impl.repo.AddressAdjustmentRepositoryImpl$1", f = "AddressAdjustmentRepositoryImpl.kt", l = {222}, m = "invokeSuspend", v = 2)
/* loaded from: classes9.dex */
final class AddressAdjustmentRepositoryImpl$1 extends SuspendLambda implements wls {
    final /* synthetic */ e2t $geoSuggestRepository;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddressAdjustmentRepositoryImpl$1(e2t e2tVar, a aVar, Continuation continuation) {
        super(2, continuation);
        this.$geoSuggestRepository = e2tVar;
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AddressAdjustmentRepositoryImpl$1(this.$geoSuggestRepository, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((AddressAdjustmentRepositoryImpl$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            e2t e2tVar = this.$geoSuggestRepository;
            a aVar = this.this$0;
            this.L$0 = e2tVar;
            this.L$1 = aVar;
            this.label = 1;
            j18 j18Var = new j18(1, dvw.b(this));
            j18Var.u();
            ((f2t) e2tVar).e.put("AddressClarificationRepositoryImpl", new dq0(0, aVar));
            j18Var.w(new n35(4));
            if (j18Var.s() == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        return zy11.a;
    }
}
