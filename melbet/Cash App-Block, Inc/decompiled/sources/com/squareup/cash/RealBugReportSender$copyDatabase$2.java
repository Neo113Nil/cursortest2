package com.squareup.cash;

import java.io.File;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.FilesKt__FileReadWriteKt;
import kotlin.jvm.functions.Function2;
import okio.Okio;
import okio.Pipe$sink$1;
import papa.SafeTrace;

/* loaded from: classes5.dex */
public final class RealBugReportSender$copyDatabase$2 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public /* synthetic */ Object L$0;
    public final /* synthetic */ RealBugReportSender this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RealBugReportSender$copyDatabase$2(RealBugReportSender realBugReportSender, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = realBugReportSender;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        RealBugReportSender realBugReportSender = this.this$0;
        switch (i) {
            case 0:
                RealBugReportSender$copyDatabase$2 realBugReportSender$copyDatabase$2 = new RealBugReportSender$copyDatabase$2(realBugReportSender, continuation, 0);
                realBugReportSender$copyDatabase$2.L$0 = obj;
                return realBugReportSender$copyDatabase$2;
            default:
                RealBugReportSender$copyDatabase$2 realBugReportSender$copyDatabase$22 = new RealBugReportSender$copyDatabase$2(realBugReportSender, continuation, 1);
                realBugReportSender$copyDatabase$22.L$0 = obj;
                return realBugReportSender$copyDatabase$22;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        File file = (File) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((RealBugReportSender$copyDatabase$2) create(file, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                File file = (File) this.L$0;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                FilesKt__FileReadWriteKt.writeText$default(file, "Database name was null");
                return Unit.INSTANCE;
            default:
                File file2 = (File) this.L$0;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                Pipe$sink$1 sink$default = Okio.sink$default(file2);
                try {
                    this.this$0.featureEligibilityDumper.dump(sink$default);
                    sink$default.close();
                    return Unit.INSTANCE;
                } finally {
                }
        }
    }
}
