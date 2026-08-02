package ru.yandex.taxi.linked_order.router.ambulance;

import android.content.Context;
import defpackage.a3v;
import defpackage.aj7;
import defpackage.amp0;
import defpackage.jl40;
import defpackage.l12;
import defpackage.m12;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.q5z;
import defpackage.qu;
import defpackage.t12;
import defpackage.tje;
import defpackage.tse;
import defpackage.u12;
import defpackage.v12;
import defpackage.w12;
import defpackage.w511;
import defpackage.wls;
import defpackage.x12;
import defpackage.y12;
import defpackage.yi7;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.linked_order.router.ambulance.AmbulanceLinkedOrderRouter$content$1$1$1", f = "AmbulanceLinkedOrderRouter.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class AmbulanceLinkedOrderRouter$content$1$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ x12 $action;
    final /* synthetic */ y12 $ambulanceLinkedOrderUiActionInteractor;
    final /* synthetic */ m12 $innerNavigator;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AmbulanceLinkedOrderRouter$content$1$1$1(y12 y12Var, x12 x12Var, m12 m12Var, Continuation continuation) {
        super(2, continuation);
        this.$ambulanceLinkedOrderUiActionInteractor = y12Var;
        this.$action = x12Var;
        this.$innerNavigator = m12Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AmbulanceLinkedOrderRouter$content$1$1$1(this.$ambulanceLinkedOrderUiActionInteractor, this.$action, this.$innerNavigator, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        AmbulanceLinkedOrderRouter$content$1$1$1 ambulanceLinkedOrderRouter$content$1$1$1 = (AmbulanceLinkedOrderRouter$content$1$1$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        ambulanceLinkedOrderRouter$content$1$1$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        y12 y12Var = this.$ambulanceLinkedOrderUiActionInteractor;
        x12 x12Var = this.$action;
        m12 m12Var = this.$innerNavigator;
        if (x12Var instanceof u12) {
            ((aj7) ((yi7) y12Var.b.b)).b(((u12) x12Var).a, false);
        } else if (x12Var instanceof v12) {
            q5z.c0(((v12) x12Var).a, null, y12Var.a.a, 0);
        } else {
            y12Var.getClass();
            if (jl40.l(x12Var, t12.a)) {
                m12Var.a.r(new qu(9));
            } else {
                if (!(x12Var instanceof w12)) {
                    w511.b();
                    return null;
                }
                amp0 amp0Var = y12Var.c;
                a3v a3vVar = (a3v) amp0Var.b;
                l12 l12Var = (l12) amp0Var.c;
                Context context = (Context) amp0Var.a;
                a3vVar.F8(tje.u(50, context), tje.u(50, context) + ((w12) x12Var).a, l12Var);
            }
        }
        return zy11.a;
    }
}
