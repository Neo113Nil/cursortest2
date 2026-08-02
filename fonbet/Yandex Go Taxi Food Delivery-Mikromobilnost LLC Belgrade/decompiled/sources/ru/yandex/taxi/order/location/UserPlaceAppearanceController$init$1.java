package ru.yandex.taxi.order.location;

import defpackage.l1t;
import defpackage.m1t;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.p1t;
import defpackage.q1t;
import defpackage.qo21;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lp1t;", ConfigConstants.CONFIG, "Lqo21;", "strategy", "Lzy11;", "<anonymous>", "(Lp1t;Lqo21;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.order.location.UserPlaceAppearanceController$init$1", f = "UserPlaceAppearanceController.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class UserPlaceAppearanceController$init$1 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserPlaceAppearanceController$init$1(a aVar, Continuation continuation) {
        super(3, continuation);
        this.this$0 = aVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        UserPlaceAppearanceController$init$1 userPlaceAppearanceController$init$1 = new UserPlaceAppearanceController$init$1(this.this$0, (Continuation) obj3);
        userPlaceAppearanceController$init$1.L$0 = (p1t) obj;
        userPlaceAppearanceController$init$1.L$1 = (qo21) obj2;
        zy11 zy11Var = zy11.a;
        userPlaceAppearanceController$init$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        p1t p1tVar = (p1t) this.L$0;
        qo21 qo21Var = (qo21) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        l1t l1tVar = this.this$0.b;
        if (!p1tVar.a || p1tVar.c) {
            q1t a = ((m1t) l1tVar).a();
            a.Q(qo21Var.c(), null);
            a.A0(false);
        } else {
            q1t a2 = ((m1t) l1tVar).a();
            a2.Q(qo21Var.d(), qo21Var.a());
            a2.A0(p1tVar.b);
        }
        return zy11.a;
    }
}
