package androidx.compose.foundation.gestures;

import androidx.camera.video.Recorder;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.HistoricalChange;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.util.VelocityTracker1D;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Velocity;
import androidx.compose.ui.unit.VelocityKt;
import androidx.paging.FlowExtKt$simpleScan$1;
import androidx.recyclerview.widget.RecyclerView;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.RealImageLoader$execute$result$1;
import com.squareup.cash.wallet.views.HeroCardViewKt$Render$1$5$1;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.sequences.SequenceBuilderIterator;
import kotlin.sequences.SequencesKt__SequenceBuilderKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.StandaloneCoroutine;
import kotlinx.coroutines.channels.BufferedChannel;
import kotlinx.coroutines.channels.ChannelResult;
import okio.internal.FileSystem$commonDeleteRecursively$sequence$1;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.PapaEvent;
import papa.SafeTrace;

/* loaded from: classes3.dex */
public final class TrackpadScrollingLogic extends NonTouchScrollingLogic {
    public final BufferedChannel channel;
    public StandaloneCoroutine receivingPanEventsJob;

    public final class TrackpadScrollDelta {
        public final boolean isEnd;
        public final long timeMillis;
        public final long value;

        public TrackpadScrollDelta(boolean z, long j, long j2) {
            this.value = j;
            this.timeMillis = j2;
            this.isEnd = z;
        }

        public final TrackpadScrollDelta plus(TrackpadScrollDelta trackpadScrollDelta) {
            return new TrackpadScrollDelta(this.isEnd || trackpadScrollDelta.isEnd, Offset.m626plusMKHz9U(this.value, trackpadScrollDelta.value), Math.max(this.timeMillis, trackpadScrollDelta.timeMillis));
        }
    }

    public TrackpadScrollingLogic(ScrollingLogic scrollingLogic, HeroCardViewKt$Render$1$5$1.AnonymousClass2.C00682 c00682, Density density) {
        super(scrollingLogic, c00682, density);
        this.channel = PapaEvent.Channel$default(Integer.MAX_VALUE, null, null, 6);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x00d9, code lost:
    
        if (r0.invoke(r3, r7) != r8) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00db, code lost:
    
        return r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00b2, code lost:
    
        if (r16.userScroll$foundation(r0, r7) == r8) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$dispatchTrackpadScroll(TrackpadScrollingLogic trackpadScrollingLogic, ScrollingLogic scrollingLogic, TrackpadScrollDelta trackpadScrollDelta, ContinuationImpl continuationImpl) {
        TrackpadScrollingLogic$dispatchTrackpadScroll$1 trackpadScrollingLogic$dispatchTrackpadScroll$1;
        int i;
        trackpadScrollingLogic.getClass();
        Recorder.AnonymousClass4 anonymousClass4 = trackpadScrollingLogic.velocityTracker;
        if (continuationImpl instanceof TrackpadScrollingLogic$dispatchTrackpadScroll$1) {
            trackpadScrollingLogic$dispatchTrackpadScroll$1 = (TrackpadScrollingLogic$dispatchTrackpadScroll$1) continuationImpl;
            int i2 = trackpadScrollingLogic$dispatchTrackpadScroll$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                trackpadScrollingLogic$dispatchTrackpadScroll$1.label = i2 - PKIFailureInfo.systemUnavail;
                TrackpadScrollingLogic$dispatchTrackpadScroll$1 trackpadScrollingLogic$dispatchTrackpadScroll$12 = trackpadScrollingLogic$dispatchTrackpadScroll$1;
                Object obj = trackpadScrollingLogic$dispatchTrackpadScroll$12.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = trackpadScrollingLogic$dispatchTrackpadScroll$12.label;
                if (i != 0) {
                    Ref$ObjectRef m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(obj);
                    m.element = trackpadScrollDelta;
                    long j = trackpadScrollDelta.timeMillis;
                    long j2 = trackpadScrollDelta.value;
                    ((VelocityTracker1D) anonymousClass4.val$audioErrorConsumer).addDataPoint(j, Float.intBitsToFloat((int) (j2 >> 32)));
                    ((VelocityTracker1D) anonymousClass4.this$0).addDataPoint(j, Float.intBitsToFloat((int) (j2 & BodyPartID.bodyIdMax)));
                    TrackpadScrollDelta sumOrNull = sumOrNull(trackpadScrollingLogic.channel);
                    if (sumOrNull != null) {
                        long j3 = sumOrNull.timeMillis;
                        long j4 = sumOrNull.value;
                        ((VelocityTracker1D) anonymousClass4.val$audioErrorConsumer).addDataPoint(j3, Float.intBitsToFloat((int) (j4 >> 32)));
                        ((VelocityTracker1D) anonymousClass4.this$0).addDataPoint(j3, Float.intBitsToFloat((int) (j4 & BodyPartID.bodyIdMax)));
                        m.element = ((TrackpadScrollDelta) m.element).plus(sumOrNull);
                    }
                    Function2 realImageLoader$execute$result$1 = new RealImageLoader$execute$result$1(trackpadScrollingLogic, scrollingLogic, m, null, 3);
                    trackpadScrollingLogic$dispatchTrackpadScroll$12.label = 1;
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            SafeTrace.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                Function2 function2 = trackpadScrollingLogic.onScrollStopped;
                Velocity velocity = new Velocity(VelocityKt.Velocity(((VelocityTracker1D) anonymousClass4.val$audioErrorConsumer).calculateVelocity(Float.MAX_VALUE), ((VelocityTracker1D) anonymousClass4.this$0).calculateVelocity(Float.MAX_VALUE)));
                trackpadScrollingLogic$dispatchTrackpadScroll$12.label = 2;
            }
        }
        trackpadScrollingLogic$dispatchTrackpadScroll$1 = new TrackpadScrollingLogic$dispatchTrackpadScroll$1(trackpadScrollingLogic, continuationImpl);
        TrackpadScrollingLogic$dispatchTrackpadScroll$1 trackpadScrollingLogic$dispatchTrackpadScroll$122 = trackpadScrollingLogic$dispatchTrackpadScroll$1;
        Object obj3 = trackpadScrollingLogic$dispatchTrackpadScroll$122.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = trackpadScrollingLogic$dispatchTrackpadScroll$122.label;
        if (i != 0) {
        }
        Function2 function22 = trackpadScrollingLogic.onScrollStopped;
        Velocity velocity2 = new Velocity(VelocityKt.Velocity(((VelocityTracker1D) anonymousClass4.val$audioErrorConsumer).calculateVelocity(Float.MAX_VALUE), ((VelocityTracker1D) anonymousClass4.this$0).calculateVelocity(Float.MAX_VALUE)));
        trackpadScrollingLogic$dispatchTrackpadScroll$122.label = 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static TrackpadScrollDelta sumOrNull(BufferedChannel bufferedChannel) {
        TrackpadScrollDelta trackpadScrollDelta = null;
        SequenceBuilderIterator it = SequencesKt__SequenceBuilderKt.iterator(new FileSystem$commonDeleteRecursively$sequence$1(new TrackpadScrollingLogic$$ExternalSyntheticLambda0(bufferedChannel, 0), 0 == true ? 1 : 0, 2));
        while (it.hasNext()) {
            TrackpadScrollDelta trackpadScrollDelta2 = (TrackpadScrollDelta) it.next();
            if (trackpadScrollDelta != null) {
                trackpadScrollDelta2 = trackpadScrollDelta.plus(trackpadScrollDelta2);
            }
            trackpadScrollDelta = trackpadScrollDelta2;
        }
        return trackpadScrollDelta;
    }

    public final boolean onPan(PointerEvent pointerEvent) {
        boolean z;
        boolean z2;
        boolean z3;
        BufferedChannel bufferedChannel;
        ScrollingLogic scrollingLogic;
        PointerInputChange pointerInputChange = (PointerInputChange) CollectionsKt.firstOrNull(pointerEvent.changes);
        if (pointerInputChange != null) {
            List historical = pointerInputChange.getHistorical();
            int size = historical.size();
            int i = 0;
            z3 = false;
            while (true) {
                bufferedChannel = this.channel;
                scrollingLogic = this.scrollingLogic;
                if (i >= size) {
                    break;
                }
                HistoricalChange historicalChange = (HistoricalChange) historical.get(i);
                long j = historicalChange.panOffset ^ (-9223372034707292160L);
                if (!(scrollingLogic.m249toSingleAxisDeltaFromAnglek4lQ0M(scrollingLogic.m246reverseIfNeededMKHz9U(j)) == RecyclerView.DECELERATION_RATE)) {
                    z3 = !(bufferedChannel.mo1159trySendJP2dKIU(new TrackpadScrollDelta(false, j, historicalChange.uptimeMillis)) instanceof ChannelResult.Failed) || z3;
                }
                i++;
            }
            z = true;
            z2 = false;
            long j2 = pointerInputChange.panOffset ^ (-9223372034707292160L);
            boolean z4 = pointerEvent.f858type == 12;
            if (!(scrollingLogic.m249toSingleAxisDeltaFromAnglek4lQ0M(scrollingLogic.m246reverseIfNeededMKHz9U(j2)) == RecyclerView.DECELERATION_RATE) || z4) {
                if (!(bufferedChannel.mo1159trySendJP2dKIU(new TrackpadScrollDelta(z4, j2, pointerInputChange.uptimeMillis)) instanceof ChannelResult.Failed) || z3) {
                    z3 = true;
                }
            }
            return (!z3 || this.isScrolling) ? z : z2;
        }
        z = true;
        z2 = false;
        z3 = z2;
        if (z3) {
        }
    }

    /* renamed from: onPointerEvent-H0pRuoY, reason: not valid java name */
    public final void m251onPointerEventH0pRuoY(PointerEvent pointerEvent, PointerEventPass pointerEventPass, long j) {
        int i = pointerEvent.f858type;
        if (i == 10 || i == 11 || i == 12) {
            List list = pointerEvent.changes;
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (((PointerInputChange) list.get(i2)).isConsumed()) {
                    return;
                }
            }
            if (pointerEventPass == PointerEventPass.Initial && this.isScrolling) {
                onPan(pointerEvent);
                NonTouchScrollingLogic.consume$foundation(pointerEvent);
            }
            if (pointerEventPass == PointerEventPass.Main && !this.isScrolling && onPan(pointerEvent)) {
                NonTouchScrollingLogic.consume$foundation(pointerEvent);
            }
        }
    }

    public final void startReceivingEvents(CoroutineScope coroutineScope) {
        if (this.receivingPanEventsJob == null) {
            this.receivingPanEventsJob = JobKt.launch$default(coroutineScope, null, null, new FlowExtKt$simpleScan$1(this, null, 10), 3);
        }
    }
}
