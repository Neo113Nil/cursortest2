package ru.yandex.video.m3.player.report;

import defpackage.h42;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.sls;
import defpackage.tse;
import defpackage.wls;
import defpackage.yxc0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {1, 8, 0})
@mvg(c = "ru.yandex.video.m3.player.report.CodecReportEventLogger$onPositionDiscontinuity$1", f = "CodecReportEventLogger.kt", l = {53}, m = "invokeSuspend")
/* loaded from: classes7.dex */
public final class CodecReportEventLogger$onPositionDiscontinuity$1 extends SuspendLambda implements wls {
    final /* synthetic */ h42 $eventTime;
    final /* synthetic */ yxc0 $newPosition;
    final /* synthetic */ yxc0 $oldPosition;
    final /* synthetic */ int $reason;
    int label;
    final /* synthetic */ CodecReportEventLogger this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CodecReportEventLogger$onPositionDiscontinuity$1(CodecReportEventLogger codecReportEventLogger, h42 h42Var, yxc0 yxc0Var, yxc0 yxc0Var2, int i, Continuation<? super CodecReportEventLogger$onPositionDiscontinuity$1> continuation) {
        super(2, continuation);
        this.this$0 = codecReportEventLogger;
        this.$eventTime = h42Var;
        this.$oldPosition = yxc0Var;
        this.$newPosition = yxc0Var2;
        this.$reason = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<zy11> create(Object obj, Continuation<?> continuation) {
        return new CodecReportEventLogger$onPositionDiscontinuity$1(this.this$0, this.$eventTime, this.$oldPosition, this.$newPosition, this.$reason, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(tse tseVar, Continuation<? super zy11> continuation) {
        return ((CodecReportEventLogger$onPositionDiscontinuity$1) create(tseVar, continuation)).invokeSuspend(zy11.a);
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
            final yxc0 yxc0Var = this.$oldPosition;
            final yxc0 yxc0Var2 = this.$newPosition;
            final int i2 = this.$reason;
            sls slsVar = new sls() { // from class: ru.yandex.video.m3.player.report.CodecReportEventLogger$onPositionDiscontinuity$1.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // defpackage.sls
                public final String invoke() {
                    String buildOnPositionDiscontinuityLogString;
                    buildOnPositionDiscontinuityLogString = CodecReportEventLogger.this.buildOnPositionDiscontinuityLogString(h42Var, yxc0Var, yxc0Var2, i2);
                    return buildOnPositionDiscontinuityLogString;
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
