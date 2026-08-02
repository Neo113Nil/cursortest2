package ru.yandex.taxi.hiredriver;

import defpackage.cmt;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.opq0;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.hiredriver.HireDriverRepository$sendUserData$2", f = "HireDriverRepository.kt", l = {28}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class HireDriverRepository$sendUserData$2 extends SuspendLambda implements wls {
    final /* synthetic */ Map<String, String> $queryParams;
    final /* synthetic */ opq0 $sendRequest;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HireDriverRepository$sendUserData$2(c cVar, opq0 opq0Var, Map map, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
        this.$sendRequest = opq0Var;
        this.$queryParams = map;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new HireDriverRepository$sendUserData$2(this.this$0, this.$sendRequest, this.$queryParams, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((HireDriverRepository$sendUserData$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            cmt<zy11> a = ((HireDriverApi) this.this$0.e.getValue()).a(UUID.randomUUID().toString(), this.$sendRequest, this.$queryParams);
            this.label = 1;
            if (ru.yandex.taxi.network.api.a.a(a, null, this) == coroutineSingletons) {
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
