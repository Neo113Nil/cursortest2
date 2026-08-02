package app.cash.zipline.loader;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.gestures.ContentInViewNode$launchAnimation$2;
import androidx.compose.foundation.gestures.PressGestureScope;
import androidx.compose.foundation.interaction.MutableInteractionSourceImpl;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import androidx.compose.ui.geometry.Offset;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.RealImageLoader$execute$2;
import kotlin.Unit;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlin.text.MatcherMatchResult;
import kotlin.text.Regex;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1;
import okio.Path$$ExternalSyntheticBUOutline0;
import papa.SafeTrace;

/* loaded from: classes3.dex */
public final class FastCodeUpdatesKt$withDevelopmentServerPush$1 extends SuspendLambda implements Function3 {
    public final /* synthetic */ Object $httpClient;
    public /* synthetic */ long $pollingInterval;
    public final /* synthetic */ int $r8$classId = 1;
    public /* synthetic */ Object L$0;
    public /* synthetic */ Object L$1;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FastCodeUpdatesKt$withDevelopmentServerPush$1(MutableInteractionSourceImpl mutableInteractionSourceImpl, TextFieldSelectionState textFieldSelectionState, Continuation continuation) {
        super(3, continuation);
        this.L$1 = mutableInteractionSourceImpl;
        this.$httpClient = textFieldSelectionState;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.$r8$classId;
        Object obj4 = this.$httpClient;
        switch (i) {
            case 0:
                FastCodeUpdatesKt$withDevelopmentServerPush$1 fastCodeUpdatesKt$withDevelopmentServerPush$1 = new FastCodeUpdatesKt$withDevelopmentServerPush$1((ZiplineHttpClient) obj4, this.$pollingInterval, (Continuation) obj3);
                fastCodeUpdatesKt$withDevelopmentServerPush$1.L$0 = (FlowCollector) obj;
                fastCodeUpdatesKt$withDevelopmentServerPush$1.L$1 = (String) obj2;
                fastCodeUpdatesKt$withDevelopmentServerPush$1.invokeSuspend(Unit.INSTANCE);
                return CoroutineSingletons.COROUTINE_SUSPENDED;
            default:
                long j = ((Offset) obj2).packedValue;
                FastCodeUpdatesKt$withDevelopmentServerPush$1 fastCodeUpdatesKt$withDevelopmentServerPush$12 = new FastCodeUpdatesKt$withDevelopmentServerPush$1((MutableInteractionSourceImpl) this.L$1, (TextFieldSelectionState) obj4, (Continuation) obj3);
                fastCodeUpdatesKt$withDevelopmentServerPush$12.L$0 = (PressGestureScope) obj;
                fastCodeUpdatesKt$withDevelopmentServerPush$12.$pollingInterval = j;
                return fastCodeUpdatesKt$withDevelopmentServerPush$12.invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00e6, code lost:
    
        if (r0.emit(r5, r13) == r6) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00af, code lost:
    
        if (r14 == r6) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00ca, code lost:
    
        if (kotlinx.coroutines.flow.FlowKt.collect(r3, r13) == r6) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00d9, code lost:
    
        if (kotlinx.coroutines.JobKt.m4182delayVtjQ1oo(r2, r13) == r6) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:?, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0083, code lost:
    
        if (r0.emit(r5, r13) == r6) goto L45;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x00e6 -> B:28:0x0086). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        Object obj2 = this.$httpClient;
        Continuation continuation = null;
        switch (i) {
            case 0:
                FlowCollector flowCollector = (FlowCollector) this.L$0;
                String str = (String) this.L$1;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                int i3 = 0;
                if (i2 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.L$0 = flowCollector;
                    this.L$1 = str;
                    this.label = 1;
                    break;
                } else {
                    if (i2 != 1) {
                        if (i2 == 2) {
                            SafeTrace.throwOnFailure(obj);
                            FlowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1 flowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1 = new FlowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1((Flow) obj, new RealImageLoader$execute$2(flowCollector, str, continuation, 20), i3);
                            this.L$0 = flowCollector;
                            this.L$1 = str;
                            this.label = 3;
                            break;
                        } else if (i2 == 3) {
                            SafeTrace.throwOnFailure(obj);
                            long j = this.$pollingInterval;
                            this.L$0 = flowCollector;
                            this.L$1 = str;
                            this.label = 4;
                            break;
                        } else if (i2 == 4) {
                            SafeTrace.throwOnFailure(obj);
                            this.L$0 = flowCollector;
                            this.L$1 = str;
                            this.label = 5;
                            break;
                        } else if (i2 != 5) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                str.getClass();
                MatcherMatchResult matchAt = new Regex("([^/]+//[^/]+)").matchAt(0, str);
                if (matchAt == null) {
                    Path$$ExternalSyntheticBUOutline0.m$1((Object) "expected a URL but was ".concat(str));
                    return null;
                }
                String m$1 = Recorder$$ExternalSyntheticOutline2.m$1(matchAt.getValue(), "/ws");
                EmptyList emptyList = EmptyList.INSTANCE;
                this.L$0 = flowCollector;
                this.L$1 = str;
                this.label = 2;
                obj = ((ZiplineHttpClient) obj2).openDevelopmentServerWebSocket(m$1, emptyList, this);
                break;
            default:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i4 = this.label;
                if (i4 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    PressGestureScope pressGestureScope = (PressGestureScope) this.L$0;
                    long j2 = this.$pollingInterval;
                    MutableInteractionSourceImpl mutableInteractionSourceImpl = (MutableInteractionSourceImpl) this.L$1;
                    if (mutableInteractionSourceImpl != null) {
                        ContentInViewNode$launchAnimation$2 contentInViewNode$launchAnimation$2 = new ContentInViewNode$launchAnimation$2(pressGestureScope, (TextFieldSelectionState) obj2, j2, mutableInteractionSourceImpl, (Continuation) null);
                        this.label = 1;
                        if (JobKt.coroutineScope(contentInViewNode$launchAnimation$2, this) == coroutineSingletons2) {
                            return coroutineSingletons2;
                        }
                    }
                } else {
                    if (i4 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FastCodeUpdatesKt$withDevelopmentServerPush$1(ZiplineHttpClient ziplineHttpClient, long j, Continuation continuation) {
        super(3, continuation);
        this.$httpClient = ziplineHttpClient;
        this.$pollingInterval = j;
    }
}
