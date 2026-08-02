package ru.yandex.taxi.scooters.presentation.finish_info;

import defpackage.imn0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.ymn0;
import defpackage.zuo0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Ly1o0;", "<anonymous>", "(Ltse;)Ly1o0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.scooters.presentation.finish_info.ScootersFinishInfoRouter$provideModalView$2$1$newbieProgressInfoAsync$1", f = "ScootersFinishInfoRouter.kt", l = {HProv.PP_NK_SYNC}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class ScootersFinishInfoRouter$provideModalView$2$1$newbieProgressInfoAsync$1 extends SuspendLambda implements wls {
    final /* synthetic */ ymn0 $payload;
    final /* synthetic */ imn0 $scootersFinishInfo;
    int label;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersFinishInfoRouter$provideModalView$2$1$newbieProgressInfoAsync$1(e eVar, imn0 imn0Var, ymn0 ymn0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = eVar;
        this.$scootersFinishInfo = imn0Var;
        this.$payload = ymn0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ScootersFinishInfoRouter$provideModalView$2$1$newbieProgressInfoAsync$1(this.this$0, this.$scootersFinishInfo, this.$payload, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersFinishInfoRouter$provideModalView$2$1$newbieProgressInfoAsync$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                kotlin.b.b(obj);
                return obj;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        ru.yandex.taxi.scooters.presentation.feedback.newbie.a aVar = this.this$0.d0;
        imn0 imn0Var = this.$scootersFinishInfo;
        zuo0 zuo0Var = this.$payload.b;
        this.label = 1;
        Object a = aVar.a(imn0Var, zuo0Var, this);
        return a == coroutineSingletons ? coroutineSingletons : a;
    }
}
