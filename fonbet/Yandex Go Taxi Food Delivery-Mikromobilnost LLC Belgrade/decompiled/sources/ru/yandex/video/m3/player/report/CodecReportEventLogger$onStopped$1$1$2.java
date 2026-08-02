package ru.yandex.video.m3.player.report;

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
@mvg(c = "ru.yandex.video.m3.player.report.CodecReportEventLogger$onStopped$1$1$2", f = "CodecReportEventLogger.kt", l = {329, 330}, m = "invokeSuspend")
/* loaded from: classes7.dex */
public final class CodecReportEventLogger$onStopped$1$1$2 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ CodecReportEventLogger this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CodecReportEventLogger$onStopped$1$1$2(CodecReportEventLogger codecReportEventLogger, Continuation<? super CodecReportEventLogger$onStopped$1$1$2> continuation) {
        super(2, continuation);
        this.this$0 = codecReportEventLogger;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<zy11> create(Object obj, Continuation<?> continuation) {
        return new CodecReportEventLogger$onStopped$1$1$2(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(tse tseVar, Continuation<? super zy11> continuation) {
        return ((CodecReportEventLogger$onStopped$1$1$2) create(tseVar, continuation)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0038, code lost:
    
        if (r4 == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003a, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0026, code lost:
    
        if (r5 == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object enqueueLog;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            CodecInstancesObserver codecInstancesObserver = CodecInstancesObserver.INSTANCE;
            this.label = 1;
            obj = codecInstancesObserver.getCodecsForLog(this);
        } else {
            if (i != 1) {
                if (i == 2) {
                    b.b(obj);
                    return zy11.a;
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        final String str = (String) obj;
        CodecReportEventLogger codecReportEventLogger = this.this$0;
        sls slsVar = new sls() { // from class: ru.yandex.video.m3.player.report.CodecReportEventLogger$onStopped$1$1$2.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.sls
            public final String invoke() {
                return str;
            }
        };
        this.label = 2;
        enqueueLog = codecReportEventLogger.enqueueLog(slsVar, this);
    }
}
