package ru.yandex.taxi.altpins.walking_route.modal;

import defpackage.e741;
import defpackage.f741;
import defpackage.jl40;
import defpackage.jst;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.w511;
import defpackage.wls;
import defpackage.xby;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.altpins.walking_route.modal.WalkingRoutePresenter$buttonClicked$1", f = "WalkingRoutePresenter.kt", l = {61}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
public final class WalkingRoutePresenter$buttonClicked$1 extends SuspendLambda implements wls {
    final /* synthetic */ f741 $action;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalkingRoutePresenter$buttonClicked$1(f741 f741Var, a aVar, Continuation continuation) {
        super(2, continuation);
        this.$action = f741Var;
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new WalkingRoutePresenter$buttonClicked$1(this.$action, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((WalkingRoutePresenter$buttonClicked$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            f741 f741Var = this.$action;
            if (jl40.l(f741Var, e741.a)) {
                a aVar = this.this$0;
                this.label = 1;
                if (a.Kg(aVar, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (f741Var != null) {
                    w511.b();
                    return null;
                }
                xby.l(jst.e, "ALTPIN_B:WALKING_ROUTE", null, null, "Try to handle a null button action", 6);
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        return zy11.a;
    }
}
