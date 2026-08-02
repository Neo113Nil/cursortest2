package com.squareup.cash.clientsync;

import androidx.compose.animation.core.MutatorMutex$mutate$2;
import androidx.lifecycle.Lifecycle;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.boost.db.Reward$Adapter;
import com.squareup.cash.clientsync.errors.ServerPushUnexpectedlyResetError;
import com.squareup.cash.clientsync.syncer.RealClientSyncer;
import com.squareup.cash.observability.types.SampleStrategy;
import com.squareup.cash.util.clock.AndroidClock;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.Map;
import java.util.concurrent.CancellationException;
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
import okhttp3.internal.http2.ErrorCode;
import okhttp3.internal.http2.StreamResetException;
import papa.SafeTrace;
import timber.log.Timber;

/* loaded from: classes.dex */
public final class CustomerStreamingSubscriber$setup$1$1$1$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ Lifecycle $lifecycle;
    public final /* synthetic */ Map $metadata;
    public final /* synthetic */ Reward$Adapter $streamingTimes;
    public int label;
    public final /* synthetic */ CustomerStreamingSubscriber this$0;

    /* loaded from: classes9.dex */
    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ErrorCode.values().length];
            try {
                ErrorCode.Companion companion = ErrorCode.Companion;
                iArr[8] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomerStreamingSubscriber$setup$1$1$1$1(Reward$Adapter reward$Adapter, CustomerStreamingSubscriber customerStreamingSubscriber, Map map, Lifecycle lifecycle, Continuation continuation) {
        super(2, continuation);
        this.$streamingTimes = reward$Adapter;
        this.this$0 = customerStreamingSubscriber;
        this.$metadata = map;
        this.$lifecycle = lifecycle;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CustomerStreamingSubscriber$setup$1$1$1$1(this.$streamingTimes, this.this$0, this.$metadata, this.$lifecycle, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((CustomerStreamingSubscriber$setup$1$1$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:5|6|7|15|16|17|18|19|20|21|22|(1:24)(1:37)) */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0071, code lost:
    
        if (r0 == r10) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0174, code lost:
    
        if (kotlinx.coroutines.JobKt.m4182delayVtjQ1oo(r2, r21) == r10) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0176, code lost:
    
        return r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x007c, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0083, code lost:
    
        r8 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x007a, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0081, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0082, code lost:
    
        r12 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x007e, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x007f, code lost:
    
        r12 = r7;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006f A[Catch: Exception -> 0x007a, CancellationException -> 0x007c, TRY_LEAVE, TryCatch #6 {CancellationException -> 0x007c, Exception -> 0x007a, blocks: (B:22:0x0063, B:37:0x006f), top: B:21:0x0063 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x009b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x0104 -> B:7:0x0045). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x0174 -> B:6:0x0177). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i;
        char c;
        int i2;
        String str;
        Reward$Adapter reward$Adapter;
        String str2;
        char c2;
        CancellationException e;
        Object withContext;
        CustomerStreamingSubscriber customerStreamingSubscriber = this.this$0;
        AndroidClock androidClock = customerStreamingSubscriber.clock;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = this.label;
        Lifecycle lifecycle = this.$lifecycle;
        Reward$Adapter reward$Adapter2 = this.$streamingTimes;
        char c3 = 2;
        int i4 = 1;
        String str3 = "CLIENTSYNC";
        int i5 = 0;
        if (i3 == 0) {
            SafeTrace.throwOnFailure(obj);
            reward$Adapter2.reward_selection_stateAdapter = new Long(androidClock.millis());
            Timber.Forest forest = Timber.Forest;
            forest.tag(str3);
            forest.d("Starting streaming.", new Object[i5]);
            RealClientSyncer realClientSyncer = customerStreamingSubscriber.clientSyncer;
            Map map = this.$metadata;
            this.label = i4;
            int i6 = i5;
            i = i6;
            withContext = JobKt.withContext(customerStreamingSubscriber.ioDispatcher, new MutatorMutex$mutate$2(reward$Adapter2, customerStreamingSubscriber, map, realClientSyncer, (Continuation) null, 4), this);
            if (withContext != CoroutineSingletons.COROUTINE_SUSPENDED) {
            }
        } else if (i3 == 1) {
            try {
                try {
                    SafeTrace.throwOnFailure(obj);
                    i = 0;
                } catch (Exception e2) {
                    e = e2;
                    i = i5;
                    reward$Adapter2.boost_attributesAdapter = new Long(androidClock.millis());
                    StreamResetException streamResetException = !(e instanceof StreamResetException) ? (StreamResetException) e : null;
                    if (streamResetException == null) {
                        Throwable cause = e.getCause();
                        streamResetException = cause instanceof StreamResetException ? (StreamResetException) cause : null;
                    }
                    if (streamResetException != null) {
                        if (WhenMappings.$EnumSwitchMapping$0[streamResetException.errorCode.ordinal()] == i4) {
                            Timber.Forest forest2 = Timber.Forest;
                            forest2.tag(str3);
                            forest2.i(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Streaming suspended by ", e.getMessage(), "."), new Object[i]);
                        } else {
                            c = c3;
                            str = str3;
                            int i7 = i4;
                            StreamResetException streamResetException2 = streamResetException;
                            i2 = i7;
                            customerStreamingSubscriber.errorReporter.report(new ServerPushUnexpectedlyResetError(streamResetException2, streamResetException.errorCode, lifecycle.getCurrentState(), this.$metadata, reward$Adapter2), (SampleStrategy) customerStreamingSubscriber.sampleStrategy$delegate.getValue());
                            i4 = i;
                            if (lifecycle.getCurrentState() == Lifecycle.State.RESUMED) {
                            }
                        }
                    }
                    c = c3;
                    i2 = i4;
                    str = str3;
                    i4 = i;
                    if (lifecycle.getCurrentState() == Lifecycle.State.RESUMED) {
                    }
                }
                c = c3;
                i2 = i4;
                str = str3;
                if (lifecycle.getCurrentState() == Lifecycle.State.RESUMED) {
                    Timber.Forest forest3 = Timber.Forest;
                    forest3.tag(str);
                    forest3.d("Stopping work.", new Object[0]);
                    return Unit.INSTANCE;
                }
                RealExponentialBackoff realExponentialBackoff = customerStreamingSubscriber.exponentialBackoff;
                if (i4 != 0) {
                    realExponentialBackoff.attempt = i;
                    Timber.Forest forest4 = Timber.Forest;
                    forest4.tag(str);
                    forest4.d("Still in a resumed state, immediately initializing next connection.", new Object[i]);
                    i4 = i2;
                    c3 = c;
                    str3 = str;
                    i5 = i;
                    Timber.Forest forest5 = Timber.Forest;
                    forest5.tag(str3);
                    forest5.d("Starting streaming.", new Object[i5]);
                    RealClientSyncer realClientSyncer2 = customerStreamingSubscriber.clientSyncer;
                    Map map2 = this.$metadata;
                    this.label = i4;
                    int i62 = i5;
                    i = i62;
                    withContext = JobKt.withContext(customerStreamingSubscriber.ioDispatcher, new MutatorMutex$mutate$2(reward$Adapter2, customerStreamingSubscriber, map2, realClientSyncer2, (Continuation) null, 4), this);
                    if (withContext != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    }
                } else {
                    long j = realExponentialBackoff.maxInterval;
                    DurationUnit durationUnit = DurationUnit.MILLISECONDS;
                    double m4175toDoubleimpl = Duration.m4175toDoubleimpl(j, durationUnit);
                    reward$Adapter = reward$Adapter2;
                    long j2 = realExponentialBackoff.baseInterval;
                    int i8 = realExponentialBackoff.attempt;
                    realExponentialBackoff.attempt = i8 + 1;
                    double min = Math.min(m4175toDoubleimpl, Duration.m4175toDoubleimpl(Duration.m4174timesUwyO8pc(j2, Math.pow(2.0d, i8)), durationUnit));
                    long duration = DurationKt.toDuration(realExponentialBackoff.random.nextDouble(0.0d, min) + (min / 2.0d), durationUnit);
                    Timber.Forest forest6 = Timber.Forest;
                    str2 = str;
                    forest6.tag(str2);
                    forest6.d(Boxes$$ExternalSyntheticOutline1.m(Duration.m4167getInWholeMillisecondsimpl(duration), "Still in a resumed state, delaying next connection by ", "ms."), new Object[0]);
                    c2 = 2;
                    this.label = 2;
                }
            } catch (CancellationException e3) {
                e = e3;
                int i9 = i5;
                String str4 = str3;
                Timber.Forest forest7 = Timber.Forest;
                forest7.tag(str4);
                forest7.d("Cancelled.", new Object[i9], e);
                throw e;
            }
        } else {
            if (i3 != 2) {
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            SafeTrace.throwOnFailure(obj);
            reward$Adapter = reward$Adapter2;
            c2 = 2;
            str2 = "CLIENTSYNC";
            try {
                c3 = c2;
                str3 = str2;
                reward$Adapter2 = reward$Adapter;
                i5 = 0;
                i4 = 1;
                forest5.tag(str3);
                forest5.d("Starting streaming.", new Object[i5]);
                RealClientSyncer realClientSyncer22 = customerStreamingSubscriber.clientSyncer;
                Map map22 = this.$metadata;
                this.label = i4;
                int i622 = i5;
                i = i622;
                withContext = JobKt.withContext(customerStreamingSubscriber.ioDispatcher, new MutatorMutex$mutate$2(reward$Adapter2, customerStreamingSubscriber, map22, realClientSyncer22, (Continuation) null, 4), this);
                if (withContext != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    withContext = Unit.INSTANCE;
                }
            } catch (CancellationException e4) {
                e = e4;
                i = i5;
            }
            Timber.Forest forest52 = Timber.Forest;
        }
    }
}
