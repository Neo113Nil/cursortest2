package ru.yandex.taxi.masstransit.paymentcards;

import defpackage.g92;
import defpackage.h111;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.q111;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zls;
import defpackage.zy11;
import defpackage.zzs;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.m0;

@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "Lvpr;", "it", "Lzy11;", "<anonymous>"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.masstransit.paymentcards.TransportCardInteractorImpl$stateFlow$$inlined$flatMapLatest$1", f = "TransportCardInteractorImpl.kt", l = {189}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
public final class TransportCardInteractorImpl$stateFlow$$inlined$flatMapLatest$1 extends SuspendLambda implements zls {
    final /* synthetic */ zzs $srcGeoPoint$inlined;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransportCardInteractorImpl$stateFlow$$inlined$flatMapLatest$1(Continuation continuation, d dVar, zzs zzsVar) {
        super(3, continuation);
        this.this$0 = dVar;
        this.$srcGeoPoint$inlined = zzsVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        TransportCardInteractorImpl$stateFlow$$inlined$flatMapLatest$1 transportCardInteractorImpl$stateFlow$$inlined$flatMapLatest$1 = new TransportCardInteractorImpl$stateFlow$$inlined$flatMapLatest$1((Continuation) obj3, this.this$0, this.$srcGeoPoint$inlined);
        transportCardInteractorImpl$stateFlow$$inlined$flatMapLatest$1.L$0 = (vpr) obj;
        transportCardInteractorImpl$stateFlow$$inlined$flatMapLatest$1.L$1 = obj2;
        return transportCardInteractorImpl$stateFlow$$inlined$flatMapLatest$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        tpr g92Var;
        vpr vprVar = (vpr) this.L$0;
        Object obj2 = this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            q111 q111Var = (q111) obj2;
            if (q111Var.a) {
                g92Var = new m0(this.this$0.f.a(), this.this$0.g.c(this.$srcGeoPoint$inlined, q111Var.f), new TransportCardInteractorImpl$stateFlow$1$1(this.this$0, q111Var, null));
            } else {
                h111 h111Var = h111.k;
                g92Var = new g92(2, h111.k);
            }
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            if (e.u(g92Var, vprVar, this) == coroutineSingletons) {
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
