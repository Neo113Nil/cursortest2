package ru.yandex.taxi.logistics.care.impl.auth;

import defpackage.b64;
import defpackage.cl7;
import defpackage.dvw;
import defpackage.j18;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qzj0;
import defpackage.tj;
import defpackage.tse;
import defpackage.uj;
import defpackage.um3;
import defpackage.vj;
import defpackage.wj;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import ru.yandex.taxi.analytics.Events$Zalogin$LoginContext;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.logistics.care.impl.auth.CareAuthInteractor$ensureAuthorizedAndInject$2", f = "CareAuthInteractor.kt", l = {66}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class CareAuthInteractor$ensureAuthorizedAndInject$2 extends SuspendLambda implements wls {
    Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CareAuthInteractor$ensureAuthorizedAndInject$2(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CareAuthInteractor$ensureAuthorizedAndInject$2(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((CareAuthInteractor$ensureAuthorizedAndInject$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [T, uj] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            a aVar = this.this$0;
            this.L$0 = aVar;
            this.label = 1;
            j18 j18Var = new j18(1, dvw.b(this));
            Ref$ObjectRef y = b64.y(j18Var);
            vj vjVar = new vj(3, y);
            cl7 cl7Var = new cl7(j18Var, vjVar);
            aVar.b.c(new um3(Events$Zalogin$LoginContext.CARE, new qzj0(null, new tj(7, new CareAuthInteractor$ensureAuthorizedAndInject$2$invokeSuspend$$inlined$suspendCallbackApi$2(1, cl7Var, cl7.class, "success", "success(Ljava/lang/Object;)V", 0), new CareAuthInteractor$ensureAuthorizedAndInject$2$invokeSuspend$$inlined$suspendCallbackApi$3(1, cl7Var, cl7.class, "error", "error(Ljava/lang/Throwable;)V", 0))), false, false, 28));
            y.element = uj.x;
            if (cl7Var.c()) {
                vjVar.invoke();
            } else {
                j18Var.w(new wj(cl7Var, 3));
            }
            if (j18Var.s() == coroutineSingletons) {
                return coroutineSingletons;
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
