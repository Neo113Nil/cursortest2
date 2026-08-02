package ru.yandex.taxi.net.tracker;

import defpackage.hst;
import defpackage.jse;
import defpackage.jst;
import defpackage.ke00;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tje;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.net.tracker.BaseSmoothMovementTracker$forceLoadRouteOnce$1", f = "BaseSmoothMovementTracker.kt", l = {379}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class BaseSmoothMovementTracker$forceLoadRouteOnce$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseSmoothMovementTracker$forceLoadRouteOnce$1(e eVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new BaseSmoothMovementTracker$forceLoadRouteOnce$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((BaseSmoothMovementTracker$forceLoadRouteOnce$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.b.b(obj);
                this.this$0.R = true;
                e eVar = this.this$0;
                jse jseVar = eVar.B;
                BaseSmoothMovementTracker$forceLoadRouteOnce$1$1$1 baseSmoothMovementTracker$forceLoadRouteOnce$1$1$1 = new BaseSmoothMovementTracker$forceLoadRouteOnce$1$1$1(eVar, null);
                this.label = 1;
                if (tje.k0(jseVar, baseSmoothMovementTracker$forceLoadRouteOnce$1$1$1, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            hst hstVar = jst.e;
            ke00 a = hstVar.b.a();
            if (a != null && a.b(15)) {
                a.a(15, "SmoothMovementTracker", th, "forceLoadRouteOnce failed", hstVar.a);
            }
        }
        this.this$0.R = false;
        return zy11.a;
    }
}
