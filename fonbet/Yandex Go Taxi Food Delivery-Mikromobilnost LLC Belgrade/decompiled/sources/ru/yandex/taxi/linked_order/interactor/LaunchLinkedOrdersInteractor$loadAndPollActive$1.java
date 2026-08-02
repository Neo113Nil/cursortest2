package ru.yandex.taxi.linked_order.interactor;

import defpackage.jl40;
import defpackage.mvg;
import defpackage.nly;
import defpackage.ny61;
import defpackage.oly;
import defpackage.ply;
import defpackage.qly;
import defpackage.rly;
import defpackage.rol0;
import defpackage.sly;
import defpackage.sny;
import defpackage.vpr;
import defpackage.w511;
import defpackage.wls;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvpr;", "Lsly;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.linked_order.interactor.LaunchLinkedOrdersInteractor$loadAndPollActive$1", f = "LaunchLinkedOrdersInteractor.kt", l = {128, HProv.PP_ENUM_LOG}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class LaunchLinkedOrdersInteractor$loadAndPollActive$1 extends SuspendLambda implements wls {
    final /* synthetic */ sny $orderKey;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LaunchLinkedOrdersInteractor$loadAndPollActive$1(e eVar, sny snyVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = eVar;
        this.$orderKey = snyVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        LaunchLinkedOrdersInteractor$loadAndPollActive$1 launchLinkedOrdersInteractor$loadAndPollActive$1 = new LaunchLinkedOrdersInteractor$loadAndPollActive$1(this.this$0, this.$orderKey, continuation);
        launchLinkedOrdersInteractor$loadAndPollActive$1.L$0 = obj;
        return launchLinkedOrdersInteractor$loadAndPollActive$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((LaunchLinkedOrdersInteractor$loadAndPollActive$1) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        sly slyVar;
        vpr vprVar = (vpr) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        rly rlyVar = rly.a;
        zy11 zy11Var = zy11.a;
        try {
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable unused) {
            slyVar = rlyVar;
        }
        if (i == 0) {
            kotlin.b.b(obj);
            e eVar = this.this$0;
            sny snyVar = this.$orderKey;
            ru.yandex.taxi.linked_order.provider.i iVar = eVar.h;
            this.L$0 = vprVar;
            this.label = 1;
            obj = iVar.a(snyVar, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                return zy11Var;
            }
            kotlin.b.b(obj);
        }
        slyVar = (sly) obj;
        this.this$0.g.b(this.$orderKey.a, slyVar);
        this.this$0.getClass();
        if (!(slyVar instanceof ply) && !jl40.l(slyVar, qly.a) && !(slyVar instanceof oly)) {
            if (!jl40.l(slyVar, rlyVar) && !(slyVar instanceof nly)) {
                w511.b();
                return null;
            }
            rol0 b = this.this$0.h.b(this.$orderKey);
            LaunchLinkedOrdersInteractor$loadAndPollActive$1$orderPollingFlow$1 launchLinkedOrdersInteractor$loadAndPollActive$1$orderPollingFlow$1 = new LaunchLinkedOrdersInteractor$loadAndPollActive$1$orderPollingFlow$1(this.this$0, this.$orderKey, null);
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.label = 2;
            kotlinx.coroutines.flow.e.w(vprVar);
            Object collect = b.collect(new kotlinx.coroutines.flow.i0(vprVar, launchLinkedOrdersInteractor$loadAndPollActive$1$orderPollingFlow$1), this);
            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (collect != coroutineSingletons2) {
                collect = zy11Var;
            }
            if (collect != coroutineSingletons2) {
                collect = zy11Var;
            }
            if (collect == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return zy11Var;
    }
}
