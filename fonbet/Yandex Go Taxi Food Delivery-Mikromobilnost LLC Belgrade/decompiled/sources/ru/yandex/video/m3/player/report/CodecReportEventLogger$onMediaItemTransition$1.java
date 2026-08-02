package ru.yandex.video.m3.player.report;

import defpackage.fe10;
import defpackage.h42;
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
@mvg(c = "ru.yandex.video.m3.player.report.CodecReportEventLogger$onMediaItemTransition$1", f = "CodecReportEventLogger.kt", l = {59}, m = "invokeSuspend")
/* loaded from: classes7.dex */
public final class CodecReportEventLogger$onMediaItemTransition$1 extends SuspendLambda implements wls {
    final /* synthetic */ h42 $eventTime;
    final /* synthetic */ fe10 $mediaItem;
    final /* synthetic */ int $reason;
    int label;
    final /* synthetic */ CodecReportEventLogger this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CodecReportEventLogger$onMediaItemTransition$1(CodecReportEventLogger codecReportEventLogger, h42 h42Var, fe10 fe10Var, int i, Continuation<? super CodecReportEventLogger$onMediaItemTransition$1> continuation) {
        super(2, continuation);
        this.this$0 = codecReportEventLogger;
        this.$eventTime = h42Var;
        this.$mediaItem = fe10Var;
        this.$reason = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<zy11> create(Object obj, Continuation<?> continuation) {
        return new CodecReportEventLogger$onMediaItemTransition$1(this.this$0, this.$eventTime, this.$mediaItem, this.$reason, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(tse tseVar, Continuation<? super zy11> continuation) {
        return ((CodecReportEventLogger$onMediaItemTransition$1) create(tseVar, continuation)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object enqueueLog;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            final CodecReportEventLogger codecReportEventLogger = this.this$0;
            final h42 h42Var = this.$eventTime;
            final fe10 fe10Var = this.$mediaItem;
            final int i2 = this.$reason;
            sls slsVar = new sls() { // from class: ru.yandex.video.m3.player.report.CodecReportEventLogger$onMediaItemTransition$1.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // defpackage.sls
                public final String invoke() {
                    String buildOnMediaItemTransitionString;
                    buildOnMediaItemTransitionString = CodecReportEventLogger.this.buildOnMediaItemTransitionString(h42Var, fe10Var, i2);
                    return buildOnMediaItemTransitionString;
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
        return zy11.a;
    }
}
