package ru.yandex.taxi.scooters;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.ymn0;
import defpackage.zuo0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.scooters.ScootersOrderRouter$loadAndShowFinishInfo$1", f = "ScootersOrderRouter.kt", l = {HProv.PP_ENUM_CONTAINER_EXTENSION}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class ScootersOrderRouter$loadAndShowFinishInfo$1 extends SuspendLambda implements wls {
    final /* synthetic */ zuo0 $scootersSessionState;
    Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersOrderRouter$loadAndShowFinishInfo$1(a aVar, zuo0 zuo0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$scootersSessionState = zuo0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ScootersOrderRouter$loadAndShowFinishInfo$1(this.this$0, this.$scootersSessionState, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersOrderRouter$loadAndShowFinishInfo$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        a aVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            a aVar2 = this.this$0;
            ru.yandex.taxi.scooters.presentation.finish_info.b bVar = (ru.yandex.taxi.scooters.presentation.finish_info.b) aVar2.I.get();
            zuo0 zuo0Var = this.$scootersSessionState;
            this.L$0 = aVar2;
            this.label = 1;
            Object a = bVar.a(zuo0Var, this);
            if (a == coroutineSingletons) {
                return coroutineSingletons;
            }
            obj = a;
            aVar = aVar2;
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            aVar = (a) this.L$0;
            b.b(obj);
        }
        aVar.R((ymn0) obj, true);
        return zy11.a;
    }
}
