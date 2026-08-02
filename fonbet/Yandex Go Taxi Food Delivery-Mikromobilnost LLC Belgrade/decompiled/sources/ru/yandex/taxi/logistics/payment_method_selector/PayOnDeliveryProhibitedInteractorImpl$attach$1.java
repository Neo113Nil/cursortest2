package ru.yandex.taxi.logistics.payment_method_selector;

import com.ybsdk.widgets.common.BlendingGradientView;
import defpackage.b2k;
import defpackage.cda0;
import defpackage.e4a0;
import defpackage.jl40;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.t140;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.flow.e;
import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.logistics.payment_method_selector.PayOnDeliveryProhibitedInteractorImpl$attach$1", f = "PayOnDeliveryProhibitedInteractorImpl.kt", l = {BlendingGradientView.BASE_ALPHA}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class PayOnDeliveryProhibitedInteractorImpl$attach$1 extends SuspendLambda implements wls {
    Object L$0;
    int label;
    final /* synthetic */ c this$0;

    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    /* renamed from: ru.yandex.taxi.logistics.payment_method_selector.PayOnDeliveryProhibitedInteractorImpl$attach$1$1, reason: invalid class name */
    final /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements wls {
        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            boolean l;
            e4a0 e4a0Var = (e4a0) obj;
            e4a0 e4a0Var2 = (e4a0) obj2;
            c cVar = (c) this.receiver;
            cda0 cda0Var = cVar.g;
            PaymentMethod$Type paymentMethod$Type = PaymentMethod$Type.CARGO_CORP;
            if (e4a0Var2 == paymentMethod$Type && cVar.k == null) {
                cVar.k = ((com.yandex.go.payments.paymentlist.data.c) cda0Var).g.q(e4a0Var2);
            }
            if (e4a0Var == paymentMethod$Type && e4a0Var2 == paymentMethod$Type) {
                String str = cVar.k;
                String q = ((com.yandex.go.payments.paymentlist.data.c) cda0Var).g.q(e4a0Var2);
                if (jl40.l(str, q)) {
                    l = true;
                } else {
                    cVar.k = q;
                    l = false;
                }
            } else {
                l = jl40.l(e4a0Var, e4a0Var2);
            }
            return Boolean.valueOf(l);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PayOnDeliveryProhibitedInteractorImpl$attach$1(Continuation continuation, c cVar) {
        super(2, continuation);
        this.this$0 = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PayOnDeliveryProhibitedInteractorImpl$attach$1(continuation, this.this$0);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PayOnDeliveryProhibitedInteractorImpl$attach$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            b2k s = e.s(this.this$0.a.e(), new AnonymousClass1(2, this.this$0, c.class, "areEquivalent", "areEquivalent(Lru/yandex/taxi/gopayments/model/PaymentMethod;Lru/yandex/taxi/gopayments/model/PaymentMethod;)Z", 0));
            t140 t140Var = new t140(this.this$0);
            this.L$0 = null;
            this.label = 1;
            if (s.collect(t140Var, this) == coroutineSingletons) {
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
