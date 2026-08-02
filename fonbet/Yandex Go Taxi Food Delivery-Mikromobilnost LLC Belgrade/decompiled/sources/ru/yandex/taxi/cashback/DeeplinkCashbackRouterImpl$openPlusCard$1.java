package ru.yandex.taxi.cashback;

import defpackage.g0h;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.w2d0;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.cashback.DeeplinkCashbackRouterImpl$openPlusCard$1", f = "DeeplinkCashbackRouterImpl.kt", l = {HProv.PP_HASHOID}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class DeeplinkCashbackRouterImpl$openPlusCard$1 extends SuspendLambda implements wls {
    final /* synthetic */ g0h $cardCloseListener;
    final /* synthetic */ w2d0 $plusHomeConfig;
    int label;
    final /* synthetic */ f this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeeplinkCashbackRouterImpl$openPlusCard$1(f fVar, w2d0 w2d0Var, g0h g0hVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = fVar;
        this.$plusHomeConfig = w2d0Var;
        this.$cardCloseListener = g0hVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DeeplinkCashbackRouterImpl$openPlusCard$1(this.this$0, this.$plusHomeConfig, this.$cardCloseListener, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((DeeplinkCashbackRouterImpl$openPlusCard$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            ru.yandex.taxi.cashback.interactors.i iVar = this.this$0.G;
            this.label = 1;
            if (iVar.a(this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        this.this$0.P(this.$plusHomeConfig, this.$cardCloseListener);
        return zy11.a;
    }
}
