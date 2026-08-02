package com.squareup.cash;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.taptopay.backend.api.TagCommunicationData;
import com.squareup.cash.work.data.api.ClockInEssentialsState;
import java.io.IOException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.TimeoutCancellationException;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import papa.SafeTrace;
import timber.log.Timber;

/* loaded from: classes7.dex */
public final class RealBugReportSender$copyDatabase$3 extends SuspendLambda implements Function3 {
    public final /* synthetic */ int $r8$classId;
    public /* synthetic */ FlowCollector L$0;
    public /* synthetic */ Throwable L$1;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RealBugReportSender$copyDatabase$3(int i, Continuation continuation, int i2) {
        super(i, continuation);
        this.$r8$classId = i2;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        FlowCollector flowCollector = (FlowCollector) obj;
        Throwable th = (Throwable) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.$r8$classId) {
            case 0:
                RealBugReportSender$copyDatabase$3 realBugReportSender$copyDatabase$3 = new RealBugReportSender$copyDatabase$3(3, continuation, 0);
                realBugReportSender$copyDatabase$3.L$0 = flowCollector;
                realBugReportSender$copyDatabase$3.L$1 = th;
                return realBugReportSender$copyDatabase$3.invokeSuspend(Unit.INSTANCE);
            case 1:
                RealBugReportSender$copyDatabase$3 realBugReportSender$copyDatabase$32 = new RealBugReportSender$copyDatabase$3(3, continuation, 1);
                realBugReportSender$copyDatabase$32.L$0 = flowCollector;
                realBugReportSender$copyDatabase$32.L$1 = th;
                return realBugReportSender$copyDatabase$32.invokeSuspend(Unit.INSTANCE);
            case 2:
                RealBugReportSender$copyDatabase$3 realBugReportSender$copyDatabase$33 = new RealBugReportSender$copyDatabase$3(3, continuation, 2);
                realBugReportSender$copyDatabase$33.L$0 = flowCollector;
                realBugReportSender$copyDatabase$33.L$1 = th;
                return realBugReportSender$copyDatabase$33.invokeSuspend(Unit.INSTANCE);
            case 3:
                RealBugReportSender$copyDatabase$3 realBugReportSender$copyDatabase$34 = new RealBugReportSender$copyDatabase$3(3, continuation, 3);
                realBugReportSender$copyDatabase$34.L$0 = flowCollector;
                realBugReportSender$copyDatabase$34.L$1 = th;
                return realBugReportSender$copyDatabase$34.invokeSuspend(Unit.INSTANCE);
            case 4:
                RealBugReportSender$copyDatabase$3 realBugReportSender$copyDatabase$35 = new RealBugReportSender$copyDatabase$3(3, continuation, 4);
                realBugReportSender$copyDatabase$35.L$0 = flowCollector;
                realBugReportSender$copyDatabase$35.L$1 = th;
                return realBugReportSender$copyDatabase$35.invokeSuspend(Unit.INSTANCE);
            case 5:
                RealBugReportSender$copyDatabase$3 realBugReportSender$copyDatabase$36 = new RealBugReportSender$copyDatabase$3(3, continuation, 5);
                realBugReportSender$copyDatabase$36.L$0 = flowCollector;
                realBugReportSender$copyDatabase$36.L$1 = th;
                return realBugReportSender$copyDatabase$36.invokeSuspend(Unit.INSTANCE);
            case 6:
                RealBugReportSender$copyDatabase$3 realBugReportSender$copyDatabase$37 = new RealBugReportSender$copyDatabase$3(3, continuation, 6);
                realBugReportSender$copyDatabase$37.L$0 = flowCollector;
                realBugReportSender$copyDatabase$37.L$1 = th;
                return realBugReportSender$copyDatabase$37.invokeSuspend(Unit.INSTANCE);
            default:
                RealBugReportSender$copyDatabase$3 realBugReportSender$copyDatabase$38 = new RealBugReportSender$copyDatabase$3(3, continuation, 7);
                realBugReportSender$copyDatabase$38.L$0 = flowCollector;
                realBugReportSender$copyDatabase$38.L$1 = th;
                return realBugReportSender$copyDatabase$38.invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00b3, code lost:
    
        if (r0.emit(r11, r10) == r6) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:?, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00db, code lost:
    
        if (r0.emit(r11, r10) == r6) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0103, code lost:
    
        if (r0.emit(r11, r10) == r6) goto L46;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                FlowCollector flowCollector = this.L$0;
                Throwable th = this.L$1;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i = this.label;
                if (i == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Timber.Forest.e("Error copying database", new Object[0], th);
                    this.L$0 = null;
                    this.L$1 = null;
                    this.label = 1;
                    FlowKt.ensureActive(flowCollector);
                    if (Unit.INSTANCE == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 1:
                FlowCollector flowCollector2 = this.L$0;
                Throwable th2 = this.L$1;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Timber.Forest.e("Error copying eligibility data", new Object[0], th2);
                    this.L$0 = null;
                    this.L$1 = null;
                    this.label = 1;
                    FlowKt.ensureActive(flowCollector2);
                    if (Unit.INSTANCE == coroutineSingletons2) {
                        return coroutineSingletons2;
                    }
                } else {
                    if (i2 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 2:
                FlowCollector flowCollector3 = this.L$0;
                Throwable th3 = this.L$1;
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                if (i3 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Timber.Forest.e("Error dumping back stack", new Object[0], th3);
                    this.L$0 = null;
                    this.L$1 = null;
                    this.label = 1;
                    FlowKt.ensureActive(flowCollector3);
                    if (Unit.INSTANCE == coroutineSingletons3) {
                        return coroutineSingletons3;
                    }
                } else {
                    if (i3 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 3:
                FlowCollector flowCollector4 = this.L$0;
                Throwable th4 = this.L$1;
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i4 = this.label;
                if (i4 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Timber.Forest.e("Error dumping view hierarchy", new Object[0], th4);
                    this.L$0 = null;
                    this.L$1 = null;
                    this.label = 1;
                    FlowKt.ensureActive(flowCollector4);
                    if (Unit.INSTANCE == coroutineSingletons4) {
                        return coroutineSingletons4;
                    }
                } else {
                    if (i4 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 4:
                FlowCollector flowCollector5 = this.L$0;
                Throwable th5 = this.L$1;
                CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i5 = this.label;
                if (i5 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Timber.Forest.e("Error saving preferences", new Object[0], th5);
                    this.L$0 = null;
                    this.L$1 = null;
                    this.label = 1;
                    FlowKt.ensureActive(flowCollector5);
                    if (Unit.INSTANCE == coroutineSingletons5) {
                        return coroutineSingletons5;
                    }
                } else {
                    if (i5 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 5:
                FlowCollector flowCollector6 = this.L$0;
                Throwable th6 = this.L$1;
                CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i6 = this.label;
                if (i6 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (th6 instanceof IOException) {
                        Timber.Forest.e("Connect failure " + th6, new Object[0]);
                        Boolean bool = Boolean.FALSE;
                        this.L$0 = null;
                        this.L$1 = null;
                        this.label = 1;
                        break;
                    } else if (th6 instanceof TimeoutCancellationException) {
                        Timber.Forest.e("Connect timeout " + th6, new Object[0]);
                        Boolean bool2 = Boolean.FALSE;
                        this.L$0 = null;
                        this.L$1 = null;
                        this.label = 2;
                        break;
                    } else {
                        if (!(th6 instanceof SecurityException)) {
                            throw th6;
                        }
                        Timber.Forest.e("Security exception " + th6, new Object[0]);
                        Boolean bool3 = Boolean.FALSE;
                        this.L$0 = null;
                        this.L$1 = null;
                        this.label = 3;
                        break;
                    }
                } else {
                    if (i6 != 1 && i6 != 2 && i6 != 3) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 6:
                FlowCollector flowCollector7 = this.L$0;
                Throwable th7 = this.L$1;
                CoroutineSingletons coroutineSingletons7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i7 = this.label;
                if (i7 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    TagCommunicationData tagCommunicationData = new TagCommunicationData(null, Recorder$$ExternalSyntheticOutline2.m("Transceive failure: ", th7.getLocalizedMessage()));
                    this.L$0 = null;
                    this.L$1 = null;
                    this.label = 1;
                    if (flowCollector7.emit(tagCommunicationData, this) == coroutineSingletons7) {
                        return coroutineSingletons7;
                    }
                } else {
                    if (i7 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            default:
                FlowCollector flowCollector8 = this.L$0;
                Throwable th8 = this.L$1;
                CoroutineSingletons coroutineSingletons8 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i8 = this.label;
                if (i8 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    ClockInEssentialsState.Error error = new ClockInEssentialsState.Error(th8);
                    this.L$0 = null;
                    this.L$1 = null;
                    this.label = 1;
                    if (flowCollector8.emit(error, this) == coroutineSingletons8) {
                        return coroutineSingletons8;
                    }
                } else {
                    if (i8 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
        }
    }
}
