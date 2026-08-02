package ru.yandex.logistics.sdk.cargo_form.impl.screen_coupon.impl.ui;

import defpackage.cwc;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.yur;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.n0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 3, 0})
@mvg(c = "ru.yandex.logistics.sdk.cargo_form.impl.screen_coupon.impl.ui.CouponScreen$getView$1$1$1$1$1$1", f = "CouponScreen.kt", l = {50}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class CouponScreen$getView$1$1$1$1$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ yur $focusRequester;
    final /* synthetic */ b $viewModel;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CouponScreen$getView$1$1$1$1$1$1(b bVar, yur yurVar, Continuation continuation) {
        super(2, continuation);
        this.$viewModel = bVar;
        this.$focusRequester = yurVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CouponScreen$getView$1$1$1$1$1$1(this.$viewModel, this.$focusRequester, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((CouponScreen$getView$1$1$1$1$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            n0 n0Var = this.$viewModel.x;
            cwc cwcVar = new cwc(8, this.$focusRequester);
            this.label = 1;
            n0Var.getClass();
            if (n0.m(n0Var, cwcVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        ny61.A();
        return null;
    }
}
