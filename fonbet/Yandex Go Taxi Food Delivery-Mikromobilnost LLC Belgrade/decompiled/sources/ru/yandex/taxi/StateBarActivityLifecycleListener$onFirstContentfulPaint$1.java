package ru.yandex.taxi;

import androidx.lifecycle.Lifecycle;
import defpackage.cey;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.i;
import ru.yandex.taxi.statebar.a;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.StateBarActivityLifecycleListener$onFirstContentfulPaint$1", f = "StateBarActivityLifecycleListener.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes9.dex */
final class StateBarActivityLifecycleListener$onFirstContentfulPaint$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ i this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StateBarActivityLifecycleListener$onFirstContentfulPaint$1(i iVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = iVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new StateBarActivityLifecycleListener$onFirstContentfulPaint$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        StateBarActivityLifecycleListener$onFirstContentfulPaint$1 stateBarActivityLifecycleListener$onFirstContentfulPaint$1 = (StateBarActivityLifecycleListener$onFirstContentfulPaint$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        stateBarActivityLifecycleListener$onFirstContentfulPaint$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        final i iVar = this.this$0;
        final int i = 0;
        cey.a(iVar.b, Lifecycle.Event.ON_START, new Runnable() { // from class: n3u0
            @Override // java.lang.Runnable
            public final void run() {
                int i2 = i;
                i iVar2 = iVar;
                switch (i2) {
                    case 0:
                        kf4 kf4Var = iVar2.d;
                        a aVar = iVar2.c;
                        kf4Var.a.b(aVar);
                        iVar2.e.b(aVar);
                        iVar2.f.b(aVar);
                        iVar2.g.b(aVar);
                        iVar2.h.b(aVar);
                        break;
                    default:
                        iVar2.d.a.stop();
                        iVar2.e.stop();
                        iVar2.f.stop();
                        iVar2.g.stop();
                        iVar2.h.stop();
                        break;
                }
            }
        });
        final i iVar2 = this.this$0;
        final int i2 = 1;
        cey.a(iVar2.b, Lifecycle.Event.ON_STOP, new Runnable() { // from class: n3u0
            @Override // java.lang.Runnable
            public final void run() {
                int i22 = i2;
                i iVar22 = iVar2;
                switch (i22) {
                    case 0:
                        kf4 kf4Var = iVar22.d;
                        a aVar = iVar22.c;
                        kf4Var.a.b(aVar);
                        iVar22.e.b(aVar);
                        iVar22.f.b(aVar);
                        iVar22.g.b(aVar);
                        iVar22.h.b(aVar);
                        break;
                    default:
                        iVar22.d.a.stop();
                        iVar22.e.stop();
                        iVar22.f.stop();
                        iVar22.g.stop();
                        iVar22.h.stop();
                        break;
                }
            }
        });
        return zy11.a;
    }
}
