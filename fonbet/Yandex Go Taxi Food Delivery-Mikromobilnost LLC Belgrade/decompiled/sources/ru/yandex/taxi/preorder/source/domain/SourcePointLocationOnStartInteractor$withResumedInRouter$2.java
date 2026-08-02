package ru.yandex.taxi.preorder.source.domain;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleDestroyedException;
import androidx.lifecycle.m0;
import defpackage.cey;
import defpackage.dfy;
import defpackage.efy;
import defpackage.g6u;
import defpackage.k20;
import defpackage.l8x;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o400;
import defpackage.seu;
import defpackage.sjh;
import defpackage.sls;
import defpackage.tse;
import defpackage.uft0;
import defpackage.uyj;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.preorder.source.domain.SourcePointLocationOnStartInteractor$withResumedInRouter$2", f = "SourcePointLocationOnStartInteractor.kt", l = {213}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class SourcePointLocationOnStartInteractor$withResumedInRouter$2 extends SuspendLambda implements wls {
    final /* synthetic */ Lifecycle $activityLifecycle;
    final /* synthetic */ sls $block;
    final /* synthetic */ Lifecycle $routerLifecycle;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    boolean Z$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SourcePointLocationOnStartInteractor$withResumedInRouter$2(Lifecycle lifecycle, Lifecycle lifecycle2, sls slsVar, Continuation continuation) {
        super(2, continuation);
        this.$routerLifecycle = lifecycle;
        this.$activityLifecycle = lifecycle2;
        this.$block = slsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        SourcePointLocationOnStartInteractor$withResumedInRouter$2 sourcePointLocationOnStartInteractor$withResumedInRouter$2 = new SourcePointLocationOnStartInteractor$withResumedInRouter$2(this.$routerLifecycle, this.$activityLifecycle, this.$block, continuation);
        sourcePointLocationOnStartInteractor$withResumedInRouter$2.L$0 = obj;
        return sourcePointLocationOnStartInteractor$withResumedInRouter$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SourcePointLocationOnStartInteractor$withResumedInRouter$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        int i2 = 1;
        if (i == 0) {
            kotlin.b.b(obj);
            k20 b = cey.b(this.$routerLifecycle, Lifecycle.Event.ON_STOP, new dfy(tseVar, i2));
            l8x l8xVar = (l8x) tseVar.getCoroutineContext().get(seu.C);
            if (l8xVar != null) {
                l8xVar.w(new efy(b, 1));
            }
            Lifecycle lifecycle = this.$activityLifecycle;
            sls slsVar = this.$block;
            Lifecycle.State state = Lifecycle.State.RESUMED;
            sjh sjhVar = uyj.a;
            g6u g6uVar = o400.a.x;
            boolean G = g6uVar.G(get_context());
            if (!G) {
                if (lifecycle.b() == Lifecycle.State.DESTROYED) {
                    throw new LifecycleDestroyedException();
                }
                if (lifecycle.b().compareTo(state) >= 0) {
                    slsVar.invoke();
                }
            }
            uft0 uft0Var = new uft0(slsVar);
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = null;
            this.L$4 = null;
            this.L$5 = null;
            this.Z$0 = G;
            this.label = 1;
            if (m0.a(lifecycle, state, G, g6uVar, uft0Var, this) == coroutineSingletons) {
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
