package ru.yandex.video.m3.ab.interactor.update;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.pvn;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.e;

@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0003\u001a\u00028\u0000H\u008a@"}, d2 = {"T", "R", "Lvpr;", "it", "Lzy11;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@mvg(c = "ru.yandex.video.m3.ab.interactor.update.AbConfigUpdateSchedulerImpl$initUpdatesWithState$$inlined$flatMapLatest$1", f = "AbConfigUpdateSchedulerImpl.kt", l = {189}, m = "invokeSuspend")
/* loaded from: classes7.dex */
public final class AbConfigUpdateSchedulerImpl$initUpdatesWithState$$inlined$flatMapLatest$1 extends SuspendLambda implements zls {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ AbConfigUpdateSchedulerImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbConfigUpdateSchedulerImpl$initUpdatesWithState$$inlined$flatMapLatest$1(Continuation continuation, AbConfigUpdateSchedulerImpl abConfigUpdateSchedulerImpl) {
        super(3, continuation);
        this.this$0 = abConfigUpdateSchedulerImpl;
    }

    public final Object invoke(vpr vprVar, Boolean bool, Continuation<? super zy11> continuation) {
        AbConfigUpdateSchedulerImpl$initUpdatesWithState$$inlined$flatMapLatest$1 abConfigUpdateSchedulerImpl$initUpdatesWithState$$inlined$flatMapLatest$1 = new AbConfigUpdateSchedulerImpl$initUpdatesWithState$$inlined$flatMapLatest$1(continuation, this.this$0);
        abConfigUpdateSchedulerImpl$initUpdatesWithState$$inlined$flatMapLatest$1.L$0 = vprVar;
        abConfigUpdateSchedulerImpl$initUpdatesWithState$$inlined$flatMapLatest$1.L$1 = bool;
        return abConfigUpdateSchedulerImpl$initUpdatesWithState$$inlined$flatMapLatest$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            vpr vprVar = (vpr) this.L$0;
            tpr startUpdateFlow = ((Boolean) this.L$1).booleanValue() ? this.this$0.startUpdateFlow() : pvn.a;
            this.label = 1;
            if (e.u(startUpdateFlow, vprVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        return zy11.a;
    }

    @Override // defpackage.zls
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((vpr) obj, (Boolean) obj2, (Continuation<? super zy11>) obj3);
    }
}
