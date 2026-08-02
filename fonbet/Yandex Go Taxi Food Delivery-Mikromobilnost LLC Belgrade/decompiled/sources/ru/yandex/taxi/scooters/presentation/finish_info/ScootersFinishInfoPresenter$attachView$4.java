package ru.yandex.taxi.scooters.presentation.finish_info;

import defpackage.imn0;
import defpackage.krl0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.xmn0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0014\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlin/Pair;", "Lcln0;", "Lxmn0;", "<destruct>", "Lzy11;", "<anonymous>", "(Lkotlin/Pair;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.scooters.presentation.finish_info.ScootersFinishInfoPresenter$attachView$4", f = "ScootersFinishInfoPresenter.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class ScootersFinishInfoPresenter$attachView$4 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersFinishInfoPresenter$attachView$4(d dVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ScootersFinishInfoPresenter$attachView$4 scootersFinishInfoPresenter$attachView$4 = new ScootersFinishInfoPresenter$attachView$4(this.this$0, continuation);
        scootersFinishInfoPresenter$attachView$4.L$0 = obj;
        return scootersFinishInfoPresenter$attachView$4;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        ScootersFinishInfoPresenter$attachView$4 scootersFinishInfoPresenter$attachView$4 = (ScootersFinishInfoPresenter$attachView$4) create((Pair) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        scootersFinishInfoPresenter$attachView$4.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Pair pair = (Pair) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        xmn0 xmn0Var = (xmn0) pair.getSecond();
        d dVar = this.this$0;
        krl0 krl0Var = dVar.y;
        imn0 imn0Var = dVar.L;
        krl0Var.b(imn0Var.a, imn0Var.f, xmn0Var != null ? new Integer(xmn0Var.f) : null, xmn0Var != null ? xmn0Var.e : null);
        return zy11.a;
    }
}
