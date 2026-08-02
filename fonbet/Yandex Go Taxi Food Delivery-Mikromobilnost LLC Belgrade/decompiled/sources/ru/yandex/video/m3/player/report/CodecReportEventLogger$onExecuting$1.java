package ru.yandex.video.m3.player.report;

import defpackage.bc10;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.sls;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {1, 8, 0})
@mvg(c = "ru.yandex.video.m3.player.report.CodecReportEventLogger$onExecuting$1", f = "CodecReportEventLogger.kt", l = {340}, m = "invokeSuspend")
/* loaded from: classes7.dex */
public final class CodecReportEventLogger$onExecuting$1 extends SuspendLambda implements wls {
    final /* synthetic */ bc10 $state;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ CodecReportEventLogger this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CodecReportEventLogger$onExecuting$1(CodecReportEventLogger codecReportEventLogger, bc10 bc10Var, Continuation<? super CodecReportEventLogger$onExecuting$1> continuation) {
        super(2, continuation);
        this.this$0 = codecReportEventLogger;
        this.$state = bc10Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<zy11> create(Object obj, Continuation<?> continuation) {
        CodecReportEventLogger$onExecuting$1 codecReportEventLogger$onExecuting$1 = new CodecReportEventLogger$onExecuting$1(this.this$0, this.$state, continuation);
        codecReportEventLogger$onExecuting$1.L$0 = obj;
        return codecReportEventLogger$onExecuting$1;
    }

    @Override // defpackage.wls
    public final Object invoke(tse tseVar, Continuation<? super zy11> continuation) {
        return ((CodecReportEventLogger$onExecuting$1) create(tseVar, continuation)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object enqueueLog;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                b.b(obj);
                CodecReportEventLogger codecReportEventLogger = this.this$0;
                final bc10 bc10Var = this.$state;
                sls slsVar = new sls() { // from class: ru.yandex.video.m3.player.report.CodecReportEventLogger$onExecuting$1$1$1
                    {
                        super(0);
                    }

                    @Override // defpackage.sls
                    public final String invoke() {
                        return UtilKt.toLogString(bc10.this);
                    }
                };
                this.label = 1;
                enqueueLog = codecReportEventLogger.enqueueLog(slsVar, this);
                if (enqueueLog == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                b.b(obj);
            }
        } catch (Throwable unused) {
        }
        return zy11.a;
    }
}
