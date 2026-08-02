package ru.yandex.taxi.masstransit.geopayment.checkout;

import android.os.Parcelable;
import com.yandex.payment.sdk.core.data.PaymentMethod;
import com.yandex.payment.sdk.core.data.PaymentToken;
import com.yandex.payment.sdk.model.data.PaymentTokenError;
import com.yandex.payment.sdk.ui.BaseActivity;
import com.yandex.payment.sdk.ui.preselect.PreselectActivity;
import com.yandex.xplat.payment.sdk.ApiMethodNameForAnalytics;
import defpackage.a60;
import defpackage.ksi0;
import defpackage.mrj;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o3a0;
import defpackage.qv90;
import defpackage.r6f;
import defpackage.sv90;
import defpackage.tse;
import defpackage.vfa0;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.masstransit.geopayment.checkout.PaymentRouter$selectedMethodObserver$1$1", f = "PaymentRouter.kt", l = {102}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class PaymentRouter$selectedMethodObserver$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ PaymentMethod $method;
    Object L$0;
    int label;
    final /* synthetic */ w this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentRouter$selectedMethodObserver$1$1(w wVar, PaymentMethod paymentMethod, Continuation continuation) {
        super(2, continuation);
        this.this$0 = wVar;
        this.$method = paymentMethod;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PaymentRouter$selectedMethodObserver$1$1(this.this$0, this.$method, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PaymentRouter$selectedMethodObserver$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        PaymentRouter$selectedMethodObserver$1$1 paymentRouter$selectedMethodObserver$1$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            w wVar = this.this$0;
            wVar.getClass();
            o3a0 o3a0Var = o3a0.b;
            o3a0Var.a.j(wVar.N);
            o3a0Var.a.m(null);
            vfa0 vfa0Var = (vfa0) this.this$0.n();
            e eVar = this.this$0.J;
            PaymentMethod paymentMethod = this.$method;
            String str = vfa0Var.b;
            int i2 = vfa0Var.c;
            String str2 = vfa0Var.d;
            String str3 = vfa0Var.e;
            this.L$0 = null;
            this.label = 1;
            paymentRouter$selectedMethodObserver$1$1 = this;
            obj = eVar.a(paymentMethod, str, i2, str2, str3, paymentRouter$selectedMethodObserver$1$1);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            paymentRouter$selectedMethodObserver$1$1 = this;
        }
        r6f r6fVar = (r6f) obj;
        if (r6fVar.b) {
            ksi0 ksi0Var = paymentRouter$selectedMethodObserver$1$1.this$0.M;
            if (ksi0Var != null) {
                r3 = ksi0Var.a(false, PreselectActivity.class).putExtra(BaseActivity.EXTRA_PAYMENT_CONTEXT, true).putExtra(BaseActivity.EXTRA_PAYMENT_TOKEN_ERROR, (Parcelable) new PaymentTokenError("Error creating payment"));
                sv90 sv90Var = qv90.a;
                ApiMethodNameForAnalytics apiMethodNameForAnalytics = ApiMethodNameForAnalytics.FAILED_PAYMENT;
                sv90Var.getClass();
                ksi0Var.i(new mrj(15, apiMethodNameForAnalytics));
            }
            if (r3 != null) {
                ((a60) paymentRouter$selectedMethodObserver$1$1.this$0.E).b(r3);
            }
        } else {
            PaymentToken paymentToken = new PaymentToken(r6fVar.a);
            ksi0 ksi0Var2 = paymentRouter$selectedMethodObserver$1$1.this$0.M;
            r3 = ksi0Var2 != null ? ksi0Var2.d(paymentToken, null) : null;
            if (r3 != null) {
                ((a60) paymentRouter$selectedMethodObserver$1$1.this$0.E).b(r3);
            }
        }
        return zy11.a;
    }
}
