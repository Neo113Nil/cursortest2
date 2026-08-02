package ru.yandex.taxi.preorder.source.domain;

import com.yandex.go.due.api.analytics.model.DueAnalyticDisplayContext;
import defpackage.hxx;
import defpackage.mvg;
import defpackage.n7l0;
import defpackage.ny61;
import defpackage.pep0;
import defpackage.pex0;
import defpackage.pvm;
import defpackage.qvm;
import defpackage.sls;
import defpackage.tls;
import defpackage.yn5;
import defpackage.ynm0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lzy11;", "<anonymous>", "()V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.preorder.source.domain.ShowDuePickerInteractorImpl$tryShowDuePicker$1", f = "ShowDuePickerInteractorImpl.kt", l = {44}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class ShowDuePickerInteractorImpl$tryShowDuePicker$1 extends SuspendLambda implements tls {
    final /* synthetic */ sls $orderTaxi;
    int label;
    final /* synthetic */ o this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShowDuePickerInteractorImpl$tryShowDuePicker$1(o oVar, sls slsVar, Continuation continuation) {
        super(1, continuation);
        this.this$0 = oVar;
        this.$orderTaxi = slsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new ShowDuePickerInteractorImpl$tryShowDuePicker$1(this.this$0, this.$orderTaxi, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((ShowDuePickerInteractorImpl$tryShowDuePicker$1) create((Continuation) obj)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            l lVar = new l(new n(((com.yandex.go.taxi.tariffs.internal.repository.k) this.this$0.b).j.b()));
            this.label = 1;
            obj = kotlinx.coroutines.flow.e.y(lVar, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        pex0 pex0Var = (pex0) obj;
        o oVar = this.this$0;
        sls slsVar = this.$orderTaxi;
        oVar.getClass();
        boolean z = pex0Var != null && pex0Var.z;
        ynm0 ynm0Var = oVar.c;
        if (ynm0Var.a(((com.yandex.go.taxi.tariffs.internal.repository.k) ynm0Var.a).m()) || !z) {
            ((pep0) oVar.e).f(new yn5(7, (pvm) oVar.a.get(), new n7l0(6, slsVar)), new qvm(DueAnalyticDisplayContext.SUMMARY), hxx.a);
        }
        return zy11.a;
    }
}
