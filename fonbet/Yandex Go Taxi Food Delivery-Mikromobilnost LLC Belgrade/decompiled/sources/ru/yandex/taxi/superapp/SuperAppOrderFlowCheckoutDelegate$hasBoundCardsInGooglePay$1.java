package ru.yandex.taxi.superapp;

import defpackage.ck7;
import defpackage.gcn;
import defpackage.h1p;
import defpackage.jst;
import defpackage.m7u;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.z6j0;
import defpackage.zy11;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.superapp.SuperAppOrderFlowCheckoutDelegate$hasBoundCardsInGooglePay$1", f = "SuperAppOrderFlowCheckoutDelegate.kt", l = {114}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class SuperAppOrderFlowCheckoutDelegate$hasBoundCardsInGooglePay$1 extends SuspendLambda implements wls {
    final /* synthetic */ gcn $callback;
    final /* synthetic */ z6j0 $params;
    Object L$0;
    int label;
    final /* synthetic */ j this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuperAppOrderFlowCheckoutDelegate$hasBoundCardsInGooglePay$1(gcn gcnVar, j jVar, z6j0 z6j0Var, Continuation continuation) {
        super(2, continuation);
        this.$callback = gcnVar;
        this.this$0 = jVar;
        this.$params = z6j0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SuperAppOrderFlowCheckoutDelegate$hasBoundCardsInGooglePay$1(this.$callback, this.this$0, this.$params, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SuperAppOrderFlowCheckoutDelegate$hasBoundCardsInGooglePay$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        j jVar;
        Throwable th;
        ck7 ck7Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.b.b(obj);
                j jVar2 = this.this$0;
                z6j0 z6j0Var = this.$params;
                try {
                    ru.yandex.taxi.superapp.payment.a aVar = jVar2.f;
                    h1p h1pVar = jVar2.b;
                    List list = z6j0Var.a;
                    if (list == null) {
                        list = EmptyList.a;
                    }
                    this.L$0 = jVar2;
                    this.label = 1;
                    Object e = aVar.a(h1pVar).e(list, this);
                    if (e == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    jVar = jVar2;
                    obj = e;
                } catch (Throwable th2) {
                    jVar = jVar2;
                    th = th2;
                    jst.e.k(th, String.format("SuperApp: %s google pay support check failed", Arrays.copyOf(new Object[]{jVar.b.getValue()}, 1)));
                    ck7Var = new ck7(th);
                    this.$callback.a(ck7Var);
                    return zy11.a;
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                jVar = (j) this.L$0;
                try {
                    kotlin.b.b(obj);
                } catch (Throwable th3) {
                    th = th3;
                    jst.e.k(th, String.format("SuperApp: %s google pay support check failed", Arrays.copyOf(new Object[]{jVar.b.getValue()}, 1)));
                    ck7Var = new ck7(th);
                    this.$callback.a(ck7Var);
                    return zy11.a;
                }
            }
            ck7Var = new ck7(new m7u((List) obj), null);
            this.$callback.a(ck7Var);
            return zy11.a;
        } catch (CancellationException e2) {
            throw e2;
        }
    }
}
