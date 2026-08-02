package ru.yandex.taxi.superapp;

import defpackage.h1p;
import defpackage.jst;
import defpackage.kdn;
import defpackage.lea0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.oea0;
import defpackage.tls;
import defpackage.tse;
import defpackage.wls;
import defpackage.y8a0;
import defpackage.zy11;
import defpackage.zzs;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.superapp.SuperAppPaymentsDelegate$requestPaymentMethods$1", f = "SuperAppPaymentsDelegate.kt", l = {37}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class SuperAppPaymentsDelegate$requestPaymentMethods$1 extends SuspendLambda implements wls {
    final /* synthetic */ tls $callback;
    final /* synthetic */ zzs $geo;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ k this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuperAppPaymentsDelegate$requestPaymentMethods$1(tls tlsVar, k kVar, zzs zzsVar, Continuation continuation) {
        super(2, continuation);
        this.$callback = tlsVar;
        this.this$0 = kVar;
        this.$geo = zzsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SuperAppPaymentsDelegate$requestPaymentMethods$1(this.$callback, this.this$0, this.$geo, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SuperAppPaymentsDelegate$requestPaymentMethods$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        k kVar;
        Throwable th;
        k kVar2;
        y8a0 y8a0Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.b.b(obj);
                k kVar3 = this.this$0;
                zzs zzsVar = this.$geo;
                try {
                    ru.yandex.taxi.superapp.payment.a aVar = kVar3.c;
                    h1p h1pVar = kVar3.b;
                    this.L$0 = kVar3;
                    this.L$1 = kVar3;
                    this.label = 1;
                    Object c = aVar.c(h1pVar, zzsVar, this);
                    if (c == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    kVar = kVar3;
                    obj = c;
                    kVar2 = kVar;
                } catch (Throwable th2) {
                    kVar = kVar3;
                    th = th2;
                    jst.e.k(th, String.format("SuperApp: %s request payment methods failed", Arrays.copyOf(new Object[]{kVar.b.getValue()}, 1)));
                    y8a0Var = new y8a0(EmptyList.a, null);
                    this.$callback.invoke(y8a0Var);
                    return zy11.a;
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kVar = (k) this.L$1;
                kVar2 = (k) this.L$0;
                try {
                    kotlin.b.b(obj);
                } catch (Throwable th3) {
                    th = th3;
                    jst.e.k(th, String.format("SuperApp: %s request payment methods failed", Arrays.copyOf(new Object[]{kVar.b.getValue()}, 1)));
                    y8a0Var = new y8a0(EmptyList.a, null);
                    this.$callback.invoke(y8a0Var);
                    return zy11.a;
                }
            }
            oea0 oea0Var = (oea0) obj;
            List b = kVar2.e.b(oea0Var.a);
            kdn kdnVar = kVar2.e;
            lea0 lea0Var = oea0Var.c;
            kdnVar.getClass();
            y8a0Var = new y8a0(b, kdn.a(lea0Var));
            this.$callback.invoke(y8a0Var);
            return zy11.a;
        } catch (CancellationException e) {
            throw e;
        }
    }
}
