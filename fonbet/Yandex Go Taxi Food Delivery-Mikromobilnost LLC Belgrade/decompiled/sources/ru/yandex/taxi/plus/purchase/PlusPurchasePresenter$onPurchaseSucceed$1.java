package ru.yandex.taxi.plus.purchase;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.rid0;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.plus.purchase.PlusPurchasePresenter$onPurchaseSucceed$1", f = "PlusPurchasePresenter.kt", l = {174}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class PlusPurchasePresenter$onPurchaseSucceed$1 extends SuspendLambda implements wls {
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlusPurchasePresenter$onPurchaseSucceed$1(d dVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PlusPurchasePresenter$onPurchaseSucceed$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PlusPurchasePresenter$onPurchaseSucceed$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0044  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        d dVar;
        d dVar2;
        rid0 rid0Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.b.b(obj);
                d dVar3 = this.this$0;
                try {
                    ru.yandex.taxi.plus.purchase.domain.a aVar = dVar3.z;
                    this.L$0 = dVar3;
                    this.L$1 = dVar3;
                    this.label = 1;
                    if (aVar.c(true, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    dVar2 = dVar3;
                    dVar = dVar2;
                } catch (Throwable unused) {
                    dVar = dVar3;
                    rid0Var = dVar.D;
                    if (rid0Var != null) {
                    }
                    return zy11.a;
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                dVar = (d) this.L$1;
                dVar2 = (d) this.L$0;
                try {
                    kotlin.b.b(obj);
                    ((Result) obj).getClass();
                } catch (Throwable unused2) {
                    rid0Var = dVar.D;
                    if (rid0Var != null) {
                        rid0Var.m();
                    }
                    return zy11.a;
                }
            }
            rid0 rid0Var2 = dVar2.D;
            if (rid0Var2 != null) {
                rid0Var2.h();
            }
            return zy11.a;
        } catch (CancellationException e) {
            throw e;
        }
    }
}
