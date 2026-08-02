package ru.yandex.taxi.order;

import defpackage.jst;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o2y0;
import defpackage.tse;
import defpackage.wls;
import defpackage.ww70;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.video.m3.preload_manager.PreloadManagerBuilder;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.order.OrderFragmentPresenter$collapseCardWithTimeoutIfNeed$1", f = "OrderFragmentPresenter.kt", l = {PreloadManagerBuilder.MAXIMUM_TRACK_PRELOAD_TIMEOUT_IN_SEC}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class OrderFragmentPresenter$collapseCardWithTimeoutIfNeed$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ i this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderFragmentPresenter$collapseCardWithTimeoutIfNeed$1(i iVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = iVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new OrderFragmentPresenter$collapseCardWithTimeoutIfNeed$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((OrderFragmentPresenter$collapseCardWithTimeoutIfNeed$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.b.b(obj);
                i iVar = this.this$0;
                com.yandex.go.taxi.order.search.ui.c cVar = iVar.V;
                o2y0 o2y0Var = iVar.y0;
                this.label = 1;
                obj = cVar.b(o2y0Var, this);
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
            if (((Boolean) obj).booleanValue()) {
                ((ww70) this.this$0.Dg()).Me();
            }
        } catch (Throwable th) {
            jst.e.h("TaxiOrder.Navigation.collapseCardWithTimeoutIfNeed", "Failed to collapse card", th);
        }
        return zy11.a;
    }
}
