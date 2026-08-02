package ru.yandex.taxi.plus.sdk.modal;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.ye;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.n0;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.plus.sdk.modal.SdkWebPlusScreen$showPlusHomeInternal$1", f = "SdkWebPlusScreen.kt", l = {HProv.ALG_SID_KECCAK_224}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class SdkWebPlusScreen$showPlusHomeInternal$1 extends SuspendLambda implements wls {
    final /* synthetic */ Runnable $onDismissCallback;
    final /* synthetic */ b $plusHome;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SdkWebPlusScreen$showPlusHomeInternal$1(b bVar, b bVar2, Runnable runnable, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$plusHome = bVar2;
        this.$onDismissCallback = runnable;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SdkWebPlusScreen$showPlusHomeInternal$1(this.this$0, this.$plusHome, this.$onDismissCallback, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SdkWebPlusScreen$showPlusHomeInternal$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            b bVar = this.this$0;
            n0 n0Var = bVar.a.J;
            ye yeVar = new ye(19, bVar, this.$plusHome, this.$onDismissCallback);
            this.label = 1;
            n0Var.getClass();
            if (n0.m(n0Var, yeVar, this) == coroutineSingletons) {
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
