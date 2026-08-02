package ru.yandex.taxi.analytics;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleDestroyedException;
import androidx.lifecycle.m0;
import defpackage.g6u;
import defpackage.ike;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o400;
import defpackage.sjh;
import defpackage.sls;
import defpackage.tse;
import defpackage.uyj;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.analytics.AnalyticsManager$onAppConfiguration$1", f = "AnalyticsManager.kt", l = {385}, m = "invokeSuspend", v = 2)
/* loaded from: classes9.dex */
final class AnalyticsManager$onAppConfiguration$1 extends SuspendLambda implements wls {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    boolean Z$0;
    int label;
    final /* synthetic */ j this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnalyticsManager$onAppConfiguration$1(j jVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = jVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AnalyticsManager$onAppConfiguration$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((AnalyticsManager$onAppConfiguration$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            final j jVar = this.this$0;
            Lifecycle lifecycle = jVar.k;
            ike ikeVar = jVar.n;
            Lifecycle.State state = Lifecycle.State.RESUMED;
            sjh sjhVar = uyj.a;
            g6u g6uVar = o400.a.x;
            boolean G = g6uVar.G(get_context());
            if (!G) {
                if (lifecycle.b() == Lifecycle.State.DESTROYED) {
                    throw new LifecycleDestroyedException();
                }
                if (lifecycle.b().compareTo(state) >= 0) {
                    com.yandex.go.coroutines.b.g(ikeVar, null, null, new AnalyticsManager$startUserInfoUpdates$1(jVar, null), 3);
                    com.yandex.go.coroutines.b.g(ikeVar, null, null, new AnalyticsManager$createAdjustWrapperIfNeeded$1(jVar, null), 3);
                }
            }
            sls slsVar = new sls() { // from class: ru.yandex.taxi.analytics.AnalyticsManager$onAppConfiguration$1$invokeSuspend$$inlined$withResumed$1
                {
                    super(0);
                }

                @Override // defpackage.sls
                public final Object invoke() {
                    j jVar2 = j.this;
                    com.yandex.go.coroutines.b.g(jVar2.n, null, null, new AnalyticsManager$startUserInfoUpdates$1(jVar2, null), 3);
                    j jVar3 = j.this;
                    com.yandex.go.coroutines.b.g(jVar3.n, null, null, new AnalyticsManager$createAdjustWrapperIfNeeded$1(jVar3, null), 3);
                    return zy11.a;
                }
            };
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = null;
            this.Z$0 = G;
            this.label = 1;
            if (m0.a(lifecycle, state, G, g6uVar, slsVar, this) == coroutineSingletons) {
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
