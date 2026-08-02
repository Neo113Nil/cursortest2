package ru.yandex.video.m3.player.report;

import defpackage.ec10;
import defpackage.gc10;
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
@mvg(c = "ru.yandex.video.m3.player.report.CodecReportEventLogger$onStopped$1", f = "CodecReportEventLogger.kt", l = {326, 328}, m = "invokeSuspend")
/* loaded from: classes7.dex */
public final class CodecReportEventLogger$onStopped$1 extends SuspendLambda implements wls {
    final /* synthetic */ gc10 $state;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ CodecReportEventLogger this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CodecReportEventLogger$onStopped$1(CodecReportEventLogger codecReportEventLogger, gc10 gc10Var, Continuation<? super CodecReportEventLogger$onStopped$1> continuation) {
        super(2, continuation);
        this.this$0 = codecReportEventLogger;
        this.$state = gc10Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<zy11> create(Object obj, Continuation<?> continuation) {
        CodecReportEventLogger$onStopped$1 codecReportEventLogger$onStopped$1 = new CodecReportEventLogger$onStopped$1(this.this$0, this.$state, continuation);
        codecReportEventLogger$onStopped$1.L$0 = obj;
        return codecReportEventLogger$onStopped$1;
    }

    @Override // defpackage.wls
    public final Object invoke(tse tseVar, Continuation<? super zy11> continuation) {
        return ((CodecReportEventLogger$onStopped$1) create(tseVar, continuation)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0054, code lost:
    
        if (defpackage.bvf0.n(r7, r6) == r0) goto L22;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        final gc10 gc10Var;
        Object enqueueLog;
        CodecReportEventLogger codecReportEventLogger;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            CodecReportEventLogger codecReportEventLogger2 = this.this$0;
            gc10Var = this.$state;
            sls slsVar = new sls() { // from class: ru.yandex.video.m3.player.report.CodecReportEventLogger$onStopped$1$1$1
                {
                    super(0);
                }

                @Override // defpackage.sls
                public final String invoke() {
                    return UtilKt.toLogString(gc10.this);
                }
            };
            this.L$0 = codecReportEventLogger2;
            this.L$1 = gc10Var;
            this.label = 1;
            enqueueLog = codecReportEventLogger2.enqueueLog(slsVar, this);
            if (enqueueLog == coroutineSingletons) {
                return coroutineSingletons;
            }
            codecReportEventLogger = codecReportEventLogger2;
        } else {
            if (i != 1) {
                if (i == 2) {
                    b.b(obj);
                    return zy11.a;
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            gc10Var = (gc10) this.L$1;
            codecReportEventLogger = (CodecReportEventLogger) this.L$0;
            b.b(obj);
        }
        if (gc10Var instanceof ec10) {
            CodecReportEventLogger$onStopped$1$1$2 codecReportEventLogger$onStopped$1$1$2 = new CodecReportEventLogger$onStopped$1$1$2(codecReportEventLogger, null);
            this.L$0 = null;
            this.L$1 = null;
            this.label = 2;
        }
        return zy11.a;
    }
}
