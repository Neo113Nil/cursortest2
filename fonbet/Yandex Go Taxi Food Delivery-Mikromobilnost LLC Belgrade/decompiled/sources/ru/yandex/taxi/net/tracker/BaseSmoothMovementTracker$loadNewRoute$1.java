package ru.yandex.taxi.net.tracker;

import defpackage.jse;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o201;
import defpackage.s8o;
import defpackage.tje;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.net.tracker.models.StopTrackException;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.net.tracker.BaseSmoothMovementTracker$loadNewRoute$1", f = "BaseSmoothMovementTracker.kt", l = {258}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class BaseSmoothMovementTracker$loadNewRoute$1 extends SuspendLambda implements wls {
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseSmoothMovementTracker$loadNewRoute$1(e eVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new BaseSmoothMovementTracker$loadNewRoute$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((BaseSmoothMovementTracker$loadNewRoute$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0053  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        e eVar;
        e eVar2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.b.b(obj);
                e eVar3 = this.this$0;
                try {
                    jse jseVar = eVar3.B;
                    BaseSmoothMovementTracker$loadNewRoute$1$1$routeData$1 baseSmoothMovementTracker$loadNewRoute$1$1$routeData$1 = new BaseSmoothMovementTracker$loadNewRoute$1$1$routeData$1(eVar3, null);
                    this.L$0 = eVar3;
                    this.L$1 = eVar3;
                    this.label = 1;
                    Object k0 = tje.k0(jseVar, baseSmoothMovementTracker$loadNewRoute$1$1$routeData$1, this);
                    if (k0 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    eVar = eVar3;
                    obj = k0;
                    eVar2 = eVar;
                } catch (Throwable th) {
                    th = th;
                    eVar = eVar3;
                    if (s8o.I(th) != null) {
                        eVar.M = r6.longValue();
                    }
                    if (th instanceof StopTrackException) {
                        eVar.h();
                        eVar.reset();
                    }
                    return zy11.a;
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                eVar = (e) this.L$1;
                eVar2 = (e) this.L$0;
                try {
                    kotlin.b.b(obj);
                } catch (Throwable th2) {
                    th = th2;
                    if (s8o.I(th) != null) {
                    }
                    if (th instanceof StopTrackException) {
                    }
                    return zy11.a;
                }
            }
            e.ae(eVar2, (o201) obj);
            return zy11.a;
        } catch (CancellationException e) {
            throw e;
        }
    }
}
