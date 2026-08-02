package ru.yandex.taxi.preorder.source.domain;

import defpackage.gmb0;
import defpackage.jst;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pv0;
import defpackage.tls;
import defpackage.zy11;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lzy11;", "<anonymous>", "()V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.preorder.source.domain.SourcePickupPointInteractor$processPickupPoints$1", f = "SourcePickupPointInteractor.kt", l = {177}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class SourcePickupPointInteractor$processPickupPoints$1 extends SuspendLambda implements tls {
    final /* synthetic */ pv0 $info;
    Object L$0;
    int label;
    final /* synthetic */ r this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SourcePickupPointInteractor$processPickupPoints$1(r rVar, pv0 pv0Var, Continuation continuation) {
        super(1, continuation);
        this.this$0 = rVar;
        this.$info = pv0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new SourcePickupPointInteractor$processPickupPoints$1(this.this$0, this.$info, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((SourcePickupPointInteractor$processPickupPoints$1) create((Continuation) obj)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        r rVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.b.b(obj);
                r rVar2 = this.this$0;
                pv0 pv0Var = this.$info;
                ru.yandex.taxi.preorder.source.pickup.a aVar = rVar2.d;
                List list = pv0Var.e;
                String str = pv0Var.f;
                this.L$0 = rVar2;
                this.label = 1;
                Object e = aVar.e(str, list, this);
                if (e == coroutineSingletons) {
                    return coroutineSingletons;
                }
                obj = e;
                rVar = rVar2;
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                rVar = (r) this.L$0;
                kotlin.b.b(obj);
            }
            r.a(rVar, (gmb0) obj);
        } catch (CancellationException e2) {
            throw e2;
        } catch (Throwable th) {
            jst.e.k(th, "Error got while fetching pickup points");
        }
        return zy11.a;
    }
}
