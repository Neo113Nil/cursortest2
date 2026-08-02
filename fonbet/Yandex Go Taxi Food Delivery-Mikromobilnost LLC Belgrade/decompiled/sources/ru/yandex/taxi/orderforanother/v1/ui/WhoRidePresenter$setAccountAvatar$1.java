package ru.yandex.taxi.orderforanother.v1.ui;

import defpackage.kj;
import defpackage.mvg;
import defpackage.mz41;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.wz41;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.orderforanother.v1.ui.WhoRidePresenter$setAccountAvatar$1", f = "WhoRidePresenter.kt", l = {50}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class WhoRidePresenter$setAccountAvatar$1 extends SuspendLambda implements wls {
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ wz41 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WhoRidePresenter$setAccountAvatar$1(wz41 wz41Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = wz41Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new WhoRidePresenter$setAccountAvatar$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((WhoRidePresenter$setAccountAvatar$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        wz41 wz41Var;
        wz41 wz41Var2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                b.b(obj);
                wz41 wz41Var3 = this.this$0;
                try {
                    this.L$0 = wz41Var3;
                    this.L$1 = wz41Var3;
                    this.label = 1;
                    Object Kg = wz41.Kg(wz41Var3, this);
                    if (Kg == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    wz41Var2 = wz41Var3;
                    obj = Kg;
                } catch (Throwable unused) {
                    wz41Var = wz41Var3;
                    wz41Var.Lg();
                    return zy11.a;
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                wz41Var2 = (wz41) this.L$1;
                wz41Var = (wz41) this.L$0;
                try {
                    b.b(obj);
                } catch (Throwable unused2) {
                    wz41Var.Lg();
                    return zy11.a;
                }
            }
            kj kjVar = (kj) obj;
            wz41Var2.getClass();
            String str = kjVar != null ? kjVar.h : null;
            if (str == null) {
                wz41Var2.Lg();
            } else {
                ((mz41) wz41Var2.Dg()).showPhoto(str);
            }
            return zy11.a;
        } catch (CancellationException e) {
            throw e;
        }
    }
}
