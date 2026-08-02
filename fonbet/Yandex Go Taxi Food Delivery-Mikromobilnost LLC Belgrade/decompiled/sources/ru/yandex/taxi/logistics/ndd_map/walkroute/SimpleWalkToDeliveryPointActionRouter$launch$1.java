package ru.yandex.taxi.logistics.ndd_map.walkroute;

import defpackage.g641;
import defpackage.mvg;
import defpackage.nm00;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.n0;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.logistics.ndd_map.walkroute.SimpleWalkToDeliveryPointActionRouter$launch$1", f = "SimpleWalkToDeliveryPointActionRouter.kt", l = {30}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class SimpleWalkToDeliveryPointActionRouter$launch$1 extends SuspendLambda implements wls {
    final /* synthetic */ nm00 $actionInfo;
    final /* synthetic */ g641 $walkRouteOverlay;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SimpleWalkToDeliveryPointActionRouter$launch$1(b bVar, nm00 nm00Var, g641 g641Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$actionInfo = nm00Var;
        this.$walkRouteOverlay = g641Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SimpleWalkToDeliveryPointActionRouter$launch$1(this.this$0, this.$actionInfo, this.$walkRouteOverlay, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SimpleWalkToDeliveryPointActionRouter$launch$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object value;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            b bVar = this.this$0;
            nm00 nm00Var = this.$actionInfo;
            g641 g641Var = this.$walkRouteOverlay;
            bVar.getClass();
            g641Var.Hg(nm00Var.a, nm00Var.b, null);
            r0 r0Var = this.this$0.c.a;
            do {
                value = r0Var.getValue();
                ((Boolean) value).getClass();
            } while (!r0Var.k(value, Boolean.TRUE));
            n0 n0Var = this.this$0.e;
            this.label = 1;
            if (e.y(n0Var, this) == coroutineSingletons) {
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
