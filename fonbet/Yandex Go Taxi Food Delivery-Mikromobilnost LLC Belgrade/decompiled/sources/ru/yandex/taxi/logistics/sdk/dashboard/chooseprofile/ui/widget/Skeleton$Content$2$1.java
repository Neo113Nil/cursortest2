package ru.yandex.taxi.logistics.sdk.dashboard.chooseprofile.ui.widget;

import defpackage.lhg;
import defpackage.mvg;
import defpackage.n351;
import defpackage.ny61;
import defpackage.sls0;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 3, 0})
@mvg(c = "ru.yandex.taxi.logistics.sdk.dashboard.chooseprofile.ui.widget.Skeleton$Content$2$1", f = "Skeleton.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class Skeleton$Content$2$1 extends SuspendLambda implements wls {
    final /* synthetic */ lhg $analyticsEventListener;
    final /* synthetic */ n351 $model;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Skeleton$Content$2$1(lhg lhgVar, n351 n351Var, Continuation continuation) {
        super(2, continuation);
        this.$analyticsEventListener = lhgVar;
        this.$model = n351Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new Skeleton$Content$2$1(this.$analyticsEventListener, this.$model, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        Skeleton$Content$2$1 skeleton$Content$2$1 = (Skeleton$Content$2$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        skeleton$Content$2$1.invokeSuspend(zy11Var);
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
        lhg lhgVar = this.$analyticsEventListener;
        sls0 sls0Var = (sls0) this.$model;
        sls0Var.getClass();
        sls0Var.getClass();
        lhgVar.c("Opened", null, null, null);
        return zy11.a;
    }
}
