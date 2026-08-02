package ru.yandex.taxi.preorder.summary.tariffpage.data.sourcedestination;

import android.view.ViewGroup;
import defpackage.mvg;
import defpackage.n0l0;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.o;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.preorder.summary.tariffpage.data.sourcedestination.RouteBlockDelegate$attach$1", f = "RouteBlockDelegate.kt", l = {174}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class RouteBlockDelegate$attach$1 extends SuspendLambda implements wls {
    final /* synthetic */ ViewGroup $container;
    final /* synthetic */ tpr $tariffFlow;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ n0l0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RouteBlockDelegate$attach$1(n0l0 n0l0Var, tpr tprVar, ViewGroup viewGroup, Continuation continuation) {
        super(2, continuation);
        this.this$0 = n0l0Var;
        this.$tariffFlow = tprVar;
        this.$container = viewGroup;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RouteBlockDelegate$attach$1(this.this$0, this.$tariffFlow, this.$container, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((RouteBlockDelegate$attach$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            n0l0 n0l0Var = this.this$0;
            tpr a = n0l0Var.d.a(n0l0Var.l, this.$tariffFlow);
            n0l0 n0l0Var2 = this.this$0;
            ViewGroup viewGroup = this.$container;
            o oVar = new o(a, new RouteBlockDelegate$attach$1$invokeSuspend$$inlined$safeCollect$1(com.yandex.go.coroutines.b.e(), null));
            e eVar = new e(n0l0Var2, viewGroup);
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.label = 1;
            if (oVar.collect(eVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11.a;
    }
}
