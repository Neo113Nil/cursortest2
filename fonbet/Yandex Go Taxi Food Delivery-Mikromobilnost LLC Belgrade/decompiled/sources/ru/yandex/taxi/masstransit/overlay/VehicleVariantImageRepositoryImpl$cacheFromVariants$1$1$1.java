package ru.yandex.taxi.masstransit.overlay;

import defpackage.f631;
import defpackage.g631;
import defpackage.g92;
import defpackage.jpx0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.obv;
import defpackage.tpr;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.masstransit.overlay.VehicleVariantImageRepositoryImpl$cacheFromVariants$1$1$1", f = "VehicleVariantImageRepositoryImpl.kt", l = {46}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class VehicleVariantImageRepositoryImpl$cacheFromVariants$1$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ g631 $it;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VehicleVariantImageRepositoryImpl$cacheFromVariants$1$1$1(d dVar, g631 g631Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = dVar;
        this.$it = g631Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new VehicleVariantImageRepositoryImpl$cacheFromVariants$1$1$1(this.this$0, this.$it, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((VehicleVariantImageRepositoryImpl$cacheFromVariants$1$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            d dVar = this.this$0;
            g631 g631Var = this.$it;
            dVar.getClass();
            String str = g631Var.c;
            tpr g92Var = str.length() == 0 ? new g92(2, new f631(g631Var, null)) : new c(dVar.b.b().i(new obv(str, null, 6, 0)).c().f(), g631Var);
            jpx0 jpx0Var = new jpx0(7, this.this$0);
            this.label = 1;
            if (g92Var.collect(jpx0Var, this) == coroutineSingletons) {
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
