package ru.yandex.video.m3.ab.interactor.update;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.a;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lvpr;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {1, 8, 0})
@mvg(c = "ru.yandex.video.m3.ab.interactor.update.AbConfigUpdateSchedulerImpl$startUpdateFlow$1", f = "AbConfigUpdateSchedulerImpl.kt", l = {HProv.ALG_SID_SHA3_256, HProv.ALG_SID_SHA3_384}, m = "invokeSuspend")
/* loaded from: classes7.dex */
public final class AbConfigUpdateSchedulerImpl$startUpdateFlow$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ AbConfigUpdateSchedulerImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbConfigUpdateSchedulerImpl$startUpdateFlow$1(AbConfigUpdateSchedulerImpl abConfigUpdateSchedulerImpl, Continuation<? super AbConfigUpdateSchedulerImpl$startUpdateFlow$1> continuation) {
        super(2, continuation);
        this.this$0 = abConfigUpdateSchedulerImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<zy11> create(Object obj, Continuation<?> continuation) {
        return new AbConfigUpdateSchedulerImpl$startUpdateFlow$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(vpr vprVar, Continuation<? super zy11> continuation) {
        return ((AbConfigUpdateSchedulerImpl$startUpdateFlow$1) create(vprVar, continuation)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0056, code lost:
    
        if (kotlinx.coroutines.a.i(r4, r10) == r0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0061, code lost:
    
        if (r11 == r0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0063, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x006e, code lost:
    
        if (r4 == (-1)) goto L24;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0061 -> B:6:0x0064). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        long j;
        long j2;
        long j3;
        long j4;
        long j5;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            long currentTimeMillis = System.currentTimeMillis();
            j = this.this$0.lastUpdateTime;
            long j6 = currentTimeMillis - j;
            j2 = this.this$0.pollingPeriod;
            if (j6 > j2) {
                j5 = 0;
            } else {
                j3 = this.this$0.pollingPeriod;
                j4 = this.this$0.lastUpdateTime;
                j5 = j3 - (currentTimeMillis - j4);
            }
            if (a.p(get_context())) {
                this.label = 1;
            }
            return zy11.a;
        }
        if (i == 1) {
            b.b(obj);
            AbConfigUpdateSchedulerImpl abConfigUpdateSchedulerImpl = this.this$0;
            this.label = 2;
            obj = abConfigUpdateSchedulerImpl.update(this);
        } else {
            if (i != 2) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
            j5 = ((Number) obj).longValue();
        }
    }
}
