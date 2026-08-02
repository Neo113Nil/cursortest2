package androidx.glance.session;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.sheet.RealSheetState$peek$3;
import com.withpersona.sdk2.inquiry.launchers.DocumentsSelectLauncherResult;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.FlowKt;
import papa.SafeTrace;

/* loaded from: classes3.dex */
public final class SessionWorkerKt$runSession$snapshotMonitor$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SessionWorkerKt$runSession$snapshotMonitor$1(int i) {
        super(2, null);
        this.$r8$classId = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.$r8$classId) {
            case 0:
                return new SessionWorkerKt$runSession$snapshotMonitor$1(2, continuation, 0);
            case 1:
                return new SessionWorkerKt$runSession$snapshotMonitor$1(2, continuation, 1);
            case 2:
                return new SessionWorkerKt$runSession$snapshotMonitor$1(2, continuation, 2);
            case 3:
                return new SessionWorkerKt$runSession$snapshotMonitor$1(2, continuation, 3);
            case 4:
                return new SessionWorkerKt$runSession$snapshotMonitor$1(2, continuation, 4);
            case 5:
                return new SessionWorkerKt$runSession$snapshotMonitor$1(2, continuation, 5);
            case 6:
                return new SessionWorkerKt$runSession$snapshotMonitor$1(2, continuation, 6);
            case 7:
                SessionWorkerKt$runSession$snapshotMonitor$1 sessionWorkerKt$runSession$snapshotMonitor$1 = new SessionWorkerKt$runSession$snapshotMonitor$1(2, continuation, 7);
                sessionWorkerKt$runSession$snapshotMonitor$1.label = ((Number) obj).intValue();
                return sessionWorkerKt$runSession$snapshotMonitor$1;
            case 8:
                return new SessionWorkerKt$runSession$snapshotMonitor$1(2, continuation, 8);
            case 9:
                SessionWorkerKt$runSession$snapshotMonitor$1 sessionWorkerKt$runSession$snapshotMonitor$12 = new SessionWorkerKt$runSession$snapshotMonitor$1(2, continuation, 9);
                sessionWorkerKt$runSession$snapshotMonitor$12.label = ((Number) obj).intValue();
                return sessionWorkerKt$runSession$snapshotMonitor$12;
            case 10:
                return new SessionWorkerKt$runSession$snapshotMonitor$1(2, continuation, 10);
            default:
                SessionWorkerKt$runSession$snapshotMonitor$1 sessionWorkerKt$runSession$snapshotMonitor$13 = new SessionWorkerKt$runSession$snapshotMonitor$1(2, continuation, 11);
                sessionWorkerKt$runSession$snapshotMonitor$13.label = ((Number) obj).intValue();
                return sessionWorkerKt$runSession$snapshotMonitor$13;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                return ((SessionWorkerKt$runSession$snapshotMonitor$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 1:
                return ((SessionWorkerKt$runSession$snapshotMonitor$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 2:
                return ((SessionWorkerKt$runSession$snapshotMonitor$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 3:
                return ((SessionWorkerKt$runSession$snapshotMonitor$1) create((Pair) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 4:
                ((SessionWorkerKt$runSession$snapshotMonitor$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                return CoroutineSingletons.COROUTINE_SUSPENDED;
            case 5:
                ((SessionWorkerKt$runSession$snapshotMonitor$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                return CoroutineSingletons.COROUTINE_SUSPENDED;
            case 6:
                ((SessionWorkerKt$runSession$snapshotMonitor$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                return CoroutineSingletons.COROUTINE_SUSPENDED;
            case 7:
                return ((SessionWorkerKt$runSession$snapshotMonitor$1) create(Integer.valueOf(((Number) obj).intValue()), (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 8:
                return ((SessionWorkerKt$runSession$snapshotMonitor$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 9:
                return ((SessionWorkerKt$runSession$snapshotMonitor$1) create(Integer.valueOf(((Number) obj).intValue()), (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 10:
                return ((SessionWorkerKt$runSession$snapshotMonitor$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            default:
                return ((SessionWorkerKt$runSession$snapshotMonitor$1) create(Integer.valueOf(((Number) obj).intValue()), (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Continuation continuation = null;
        switch (this.$r8$classId) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i = this.label;
                if (i == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.label = 1;
                    if (GlobalSnapshotManagerKt.globalSnapshotMonitor(this) == coroutineSingletons) {
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
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.label = 1;
                    if (JobKt.delay(3000L, this) == coroutineSingletons2) {
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
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                if (i3 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.label = 1;
                    if (JobKt.delay(1250L, this) == coroutineSingletons3) {
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
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i4 = this.label;
                if (i4 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.label = 1;
                    Object coroutineScope = JobKt.coroutineScope(new RealSheetState$peek$3.AnonymousClass2(2, continuation, 10), this);
                    return coroutineScope == coroutineSingletons4 ? coroutineSingletons4 : coroutineScope;
                }
                if (i4 == 1) {
                    SafeTrace.throwOnFailure(obj);
                    return obj;
                }
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 4:
                CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i5 = this.label;
                if (i5 != 0) {
                    if (i5 == 1) {
                        throw Recorder$$ExternalSyntheticOutline2.m(obj);
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                this.label = 1;
                JobKt.awaitCancellation(this);
                return coroutineSingletons5;
            case 5:
                CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i6 = this.label;
                if (i6 != 0) {
                    if (i6 == 1) {
                        throw Recorder$$ExternalSyntheticOutline2.m(obj);
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                this.label = 1;
                JobKt.awaitCancellation(this);
                return coroutineSingletons6;
            case 6:
                CoroutineSingletons coroutineSingletons7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i7 = this.label;
                if (i7 != 0) {
                    if (i7 == 1) {
                        throw Recorder$$ExternalSyntheticOutline2.m(obj);
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                this.label = 1;
                JobKt.awaitCancellation(this);
                return coroutineSingletons7;
            case 7:
                int i8 = this.label;
                CoroutineSingletons coroutineSingletons8 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                return Boolean.valueOf(i8 > 0);
            case 8:
                CoroutineSingletons coroutineSingletons9 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i9 = this.label;
                if (i9 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Duration.Companion companion = Duration.Companion;
                    long duration = DurationKt.toDuration(1, DurationUnit.SECONDS);
                    this.label = 1;
                    if (JobKt.m4182delayVtjQ1oo(duration, this) == coroutineSingletons9) {
                        return coroutineSingletons9;
                    }
                } else {
                    if (i9 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 9:
                int i10 = this.label;
                CoroutineSingletons coroutineSingletons10 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                return Boolean.valueOf(i10 == 0);
            case 10:
                CoroutineSingletons coroutineSingletons11 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i11 = this.label;
                if (i11 != 0) {
                    if (i11 == 1) {
                        SafeTrace.throwOnFailure(obj);
                        return obj;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                DocumentsSelectLauncherResult documentsSelectLauncherResult = new DocumentsSelectLauncherResult();
                this.label = 1;
                Object firstOrNull = FlowKt.firstOrNull(documentsSelectLauncherResult, this);
                return firstOrNull == coroutineSingletons11 ? coroutineSingletons11 : firstOrNull;
            default:
                CoroutineSingletons coroutineSingletons12 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                return Boolean.valueOf(this.label < 100);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SessionWorkerKt$runSession$snapshotMonitor$1(int i, Continuation continuation, int i2) {
        super(i, continuation);
        this.$r8$classId = i2;
    }
}
