package ru.yandex.video.m3.player.report;

import defpackage.cc10;
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
@mvg(c = "ru.yandex.video.m3.player.report.CodecReportEventLogger$onReleased$1$1$1", f = "CodecReportEventLogger.kt", l = {349, 350, 351, 352}, m = "invokeSuspend")
/* loaded from: classes7.dex */
public final class CodecReportEventLogger$onReleased$1$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ cc10 $state;
    Object L$0;
    int label;
    final /* synthetic */ CodecReportEventLogger this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CodecReportEventLogger$onReleased$1$1$1(cc10 cc10Var, CodecReportEventLogger codecReportEventLogger, Continuation<? super CodecReportEventLogger$onReleased$1$1$1> continuation) {
        super(2, continuation);
        this.$state = cc10Var;
        this.this$0 = codecReportEventLogger;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<zy11> create(Object obj, Continuation<?> continuation) {
        return new CodecReportEventLogger$onReleased$1$1$1(this.$state, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(tse tseVar, Continuation<? super zy11> continuation) {
        return ((CodecReportEventLogger$onReleased$1$1$1) create(tseVar, continuation)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0070, code lost:
    
        if (r7 == r0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0072, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005e, code lost:
    
        if (r8 == r0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0047, code lost:
    
        if (r8 == r0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x003c, code lost:
    
        if (r8.onCodecReleased(r1, r7) == r0) goto L25;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        final String str;
        Object enqueueLog;
        Object enqueueLog2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            CodecInstancesObserver codecInstancesObserver = CodecInstancesObserver.INSTANCE;
            String str2 = this.$state.c;
            this.label = 1;
        } else if (i == 1) {
            b.b(obj);
        } else if (i == 2) {
            b.b(obj);
            str = (String) obj;
            CodecReportEventLogger codecReportEventLogger = this.this$0;
            final cc10 cc10Var = this.$state;
            sls slsVar = new sls() { // from class: ru.yandex.video.m3.player.report.CodecReportEventLogger$onReleased$1$1$1.1
                {
                    super(0);
                }

                @Override // defpackage.sls
                public final String invoke() {
                    return UtilKt.toLogString(cc10.this);
                }
            };
            this.L$0 = str;
            this.label = 3;
            enqueueLog = codecReportEventLogger.enqueueLog(slsVar, this);
        } else {
            if (i != 3) {
                if (i == 4) {
                    b.b(obj);
                    return zy11.a;
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str = (String) this.L$0;
            b.b(obj);
            CodecReportEventLogger codecReportEventLogger2 = this.this$0;
            sls slsVar2 = new sls() { // from class: ru.yandex.video.m3.player.report.CodecReportEventLogger$onReleased$1$1$1.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // defpackage.sls
                public final String invoke() {
                    return str;
                }
            };
            this.L$0 = null;
            this.label = 4;
            enqueueLog2 = codecReportEventLogger2.enqueueLog(slsVar2, this);
        }
        CodecInstancesObserver codecInstancesObserver2 = CodecInstancesObserver.INSTANCE;
        this.label = 2;
        obj = codecInstancesObserver2.getCodecsForLog(this);
    }
}
