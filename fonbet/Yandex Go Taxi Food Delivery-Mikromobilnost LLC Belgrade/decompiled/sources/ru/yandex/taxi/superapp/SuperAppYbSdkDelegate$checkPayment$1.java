package ru.yandex.taxi.superapp;

import defpackage.b8w0;
import defpackage.bhb;
import defpackage.c8w0;
import defpackage.ck7;
import defpackage.g6u;
import defpackage.gcn;
import defpackage.jl40;
import defpackage.mvg;
import defpackage.nv51;
import defpackage.ny61;
import defpackage.o400;
import defpackage.os51;
import defpackage.ov51;
import defpackage.pv51;
import defpackage.qv51;
import defpackage.sjh;
import defpackage.tse;
import defpackage.uyj;
import defpackage.w511;
import defpackage.wls;
import defpackage.zy11;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.eatskit.dto.CheckPaymentResponse$Condition;
import ru.yandex.taxi.eatskit.dto.CheckPaymentResponse$Result;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.superapp.SuperAppYbSdkDelegate$checkPayment$1", f = "SuperAppYbSdkDelegate.kt", l = {83, 91}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class SuperAppYbSdkDelegate$checkPayment$1 extends SuspendLambda implements wls {
    final /* synthetic */ BigDecimal $amount;
    final /* synthetic */ gcn $callback;
    final /* synthetic */ os51 $money;
    final /* synthetic */ String $paymentMethodId;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ v this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "ru.yandex.taxi.superapp.SuperAppYbSdkDelegate$checkPayment$1$1", f = "SuperAppYbSdkDelegate.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: ru.yandex.taxi.superapp.SuperAppYbSdkDelegate$checkPayment$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        final /* synthetic */ gcn $callback;
        final /* synthetic */ ck7 $result;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(gcn gcnVar, ck7 ck7Var, Continuation continuation) {
            super(2, continuation);
            this.$callback = gcnVar;
            this.$result = ck7Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.$callback, this.$result, continuation);
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = (AnonymousClass1) create((tse) obj, (Continuation) obj2);
            zy11 zy11Var = zy11.a;
            anonymousClass1.invokeSuspend(zy11Var);
            return zy11Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            this.$callback.a(this.$result);
            return zy11.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuperAppYbSdkDelegate$checkPayment$1(v vVar, String str, BigDecimal bigDecimal, os51 os51Var, gcn gcnVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = vVar;
        this.$paymentMethodId = str;
        this.$amount = bigDecimal;
        this.$money = os51Var;
        this.$callback = gcnVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SuperAppYbSdkDelegate$checkPayment$1(this.this$0, this.$paymentMethodId, this.$amount, this.$money, this.$callback, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SuperAppYbSdkDelegate$checkPayment$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00ad, code lost:
    
        if (defpackage.tje.k0(r9, r2, r8) == r0) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00af, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0039, code lost:
    
        if (r9 == r0) goto L40;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CheckPaymentResponse$Result checkPaymentResponse$Result;
        CheckPaymentResponse$Condition checkPaymentResponse$Condition;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            com.yandex.go.yb.data.u uVar = this.this$0.b;
            String str = this.$paymentMethodId;
            BigDecimal bigDecimal = this.$amount;
            String str2 = this.$money.b;
            this.label = 1;
            obj = uVar.b(str, bigDecimal, str2, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                return zy11.a;
            }
            kotlin.b.b(obj);
        }
        qv51 qv51Var = (qv51) obj;
        c8w0 c8w0Var = this.this$0.e;
        boolean z = qv51Var instanceof pv51;
        if (z || jl40.l(qv51Var, nv51.a)) {
            checkPaymentResponse$Result = CheckPaymentResponse$Result.ALLOWED;
        } else {
            if (!jl40.l(qv51Var, ov51.a) && qv51Var != null) {
                w511.b();
                return null;
            }
            checkPaymentResponse$Result = CheckPaymentResponse$Result.DENIED;
        }
        if (z) {
            int i2 = b8w0.b[((pv51) qv51Var).a.ordinal()];
            if (i2 == 1) {
                checkPaymentResponse$Condition = CheckPaymentResponse$Condition.TOPUP;
            } else if (i2 == 2) {
                checkPaymentResponse$Condition = CheckPaymentResponse$Condition.IDENTIFICATION;
            } else {
                if (i2 != 3) {
                    w511.b();
                    return null;
                }
                checkPaymentResponse$Condition = CheckPaymentResponse$Condition.KYC;
            }
        } else {
            checkPaymentResponse$Condition = null;
        }
        ck7 ck7Var = new ck7(new bhb(checkPaymentResponse$Result, checkPaymentResponse$Condition), null);
        this.this$0.c.getClass();
        sjh sjhVar = uyj.a;
        g6u g6uVar = o400.a;
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$callback, ck7Var, null);
        this.L$0 = null;
        this.L$1 = null;
        this.label = 2;
    }
}
