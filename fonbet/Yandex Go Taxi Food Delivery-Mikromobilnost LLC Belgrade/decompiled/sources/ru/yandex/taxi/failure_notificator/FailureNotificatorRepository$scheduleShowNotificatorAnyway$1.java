package ru.yandex.taxi.failure_notificator;

import defpackage.b9p;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.us50;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.failure_notificator.FailureNotificatorRepository$scheduleShowNotificatorAnyway$1", f = "FailureNotificatorRepository.kt", l = {245, 247, 248}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class FailureNotificatorRepository$scheduleShowNotificatorAnyway$1 extends SuspendLambda implements wls {
    final /* synthetic */ us50 $networkEvent;
    long J$0;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FailureNotificatorRepository$scheduleShowNotificatorAnyway$1(b bVar, us50 us50Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$networkEvent = us50Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new FailureNotificatorRepository$scheduleShowNotificatorAnyway$1(this.this$0, this.$networkEvent, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((FailureNotificatorRepository$scheduleShowNotificatorAnyway$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0057, code lost:
    
        if (r10.h(r1, r9) != r0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0031, code lost:
    
        if (r10 == r0) goto L24;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        long j;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i == 0) {
            kotlin.b.b(obj);
            b bVar = this.this$0;
            this.label = 1;
            obj = bVar.d(this);
        } else if (i == 1) {
            kotlin.b.b(obj);
        } else {
            if (i != 2) {
                if (i != 3) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                this.this$0.g(this.$networkEvent);
                return zy11Var;
            }
            j = this.J$0;
            kotlin.b.b(obj);
            b bVar2 = this.this$0;
            us50 us50Var = this.$networkEvent;
            this.J$0 = j;
            this.label = 3;
        }
        long j2 = ((b9p) obj).j;
        if (j2 <= 0) {
            return zy11Var;
        }
        this.J$0 = j2;
        this.label = 2;
        if (kotlinx.coroutines.a.i(j2, this) != coroutineSingletons) {
            j = j2;
            b bVar22 = this.this$0;
            us50 us50Var2 = this.$networkEvent;
            this.J$0 = j;
            this.label = 3;
        }
        return coroutineSingletons;
    }
}
