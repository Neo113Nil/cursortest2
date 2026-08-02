package ru.yandex.taxi.logistics.sdk.tracking.impl.domain;

import defpackage.jl40;
import defpackage.jxh;
import defpackage.kxh;
import defpackage.lxh;
import defpackage.mvg;
import defpackage.mxh;
import defpackage.nxh;
import defpackage.ny61;
import defpackage.qoh;
import defpackage.tse;
import defpackage.w511;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 3, 0})
@mvg(c = "ru.yandex.taxi.logistics.sdk.tracking.impl.domain.TrackingActionsHandler$cancelOrder$1", f = "TrackingActionsHandler.kt", l = {342}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class TrackingActionsHandler$cancelOrder$1 extends SuspendLambda implements wls {
    final /* synthetic */ jxh $payload;
    int label;
    final /* synthetic */ l this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TrackingActionsHandler$cancelOrder$1(l lVar, jxh jxhVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = lVar;
        this.$payload = jxhVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TrackingActionsHandler$cancelOrder$1(this.this$0, this.$payload, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((TrackingActionsHandler$cancelOrder$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            l lVar = this.this$0;
            qoh a = lVar.e.a(lVar.a, this.$payload);
            this.label = 1;
            obj = a.s(this);
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
        nxh nxhVar = (nxh) obj;
        if (jl40.l(nxhVar, mxh.b)) {
            this.this$0.f.b();
        } else if (nxhVar instanceof lxh) {
            this.this$0.h(null);
        } else if (!(nxhVar instanceof kxh) && !jl40.l(nxhVar, mxh.a)) {
            w511.b();
            return null;
        }
        return zy11.a;
    }
}
