package androidx.compose.ui.scrollcapture;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.CancellationSignal;
import android.view.ScrollCaptureCallback;
import android.view.ScrollCaptureSession;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.animation.BoundsAnimation$animate$1;
import androidx.compose.foundation.text.input.internal.HandwritingGestureApi34$$ExternalSyntheticLambda0;
import androidx.compose.material.SwipeableKt$swipeable$3$4$1;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.semantics.SemanticsNode;
import androidx.compose.ui.unit.IntRect;
import androidx.paging.FlowExtKt$simpleScan$1;
import androidx.paging.PageFetcher$flow$1;
import androidx.recyclerview.widget.RecyclerView;
import bo.app.a$$ExternalSyntheticBUOutline0;
import java.util.function.Consumer;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.math.MathKt__MathJVMKt;
import kotlin.ranges.RangesKt___RangesKt;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.NonCancellable;
import kotlinx.coroutines.StandaloneCoroutine;
import kotlinx.coroutines.internal.ContextScope;
import okio.Path$$ExternalSyntheticBUOutline0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes3.dex */
public final class ComposeScrollCaptureCallback implements ScrollCaptureCallback {
    public final AndroidComposeView composeView;
    public final ContextScope coroutineScope;
    public final ScrollCapture listener;
    public final SemanticsNode node;
    public final RelativeScroller scrollTracker;
    public final IntRect viewportBoundsInWindow;

    public ComposeScrollCaptureCallback(SemanticsNode semanticsNode, IntRect intRect, ContextScope contextScope, ScrollCapture scrollCapture, AndroidComposeView androidComposeView) {
        this.node = semanticsNode;
        this.viewportBoundsInWindow = intRect;
        this.listener = scrollCapture;
        this.composeView = androidComposeView;
        this.coroutineScope = JobKt.plus(DisableAnimationMotionDurationScale.INSTANCE, contextScope);
        this.scrollTracker = new RelativeScroller(intRect.getHeight(), new SwipeableKt$swipeable$3$4$1.AnonymousClass1(this, null));
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x008e, code lost:
    
        if (r3 == r1) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$onScrollCaptureImageRequest(ComposeScrollCaptureCallback composeScrollCaptureCallback, ScrollCaptureSession scrollCaptureSession, IntRect intRect, ContinuationImpl continuationImpl) {
        ComposeScrollCaptureCallback$onScrollCaptureImageRequest$2 composeScrollCaptureCallback$onScrollCaptureImageRequest$2;
        CoroutineSingletons coroutineSingletons;
        int i;
        int i2;
        int i3;
        Object scrollBy;
        ScrollCapture$onScrollCaptureSearch$2 scrollCapture$onScrollCaptureSearch$2;
        ScrollCaptureSession scrollCaptureSession2;
        IntRect intRect2;
        int i4;
        int i5;
        int coerceIn;
        int coerceIn2;
        if (continuationImpl instanceof ComposeScrollCaptureCallback$onScrollCaptureImageRequest$2) {
            composeScrollCaptureCallback$onScrollCaptureImageRequest$2 = (ComposeScrollCaptureCallback$onScrollCaptureImageRequest$2) continuationImpl;
            int i6 = composeScrollCaptureCallback$onScrollCaptureImageRequest$2.label;
            if ((i6 & PKIFailureInfo.systemUnavail) != 0) {
                composeScrollCaptureCallback$onScrollCaptureImageRequest$2.label = i6 - PKIFailureInfo.systemUnavail;
                Object obj = composeScrollCaptureCallback$onScrollCaptureImageRequest$2.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = composeScrollCaptureCallback$onScrollCaptureImageRequest$2.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    i2 = intRect.top;
                    i3 = intRect.bottom;
                    RelativeScroller relativeScroller = composeScrollCaptureCallback.scrollTracker;
                    composeScrollCaptureCallback$onScrollCaptureImageRequest$2.L$0 = scrollCaptureSession;
                    composeScrollCaptureCallback$onScrollCaptureImageRequest$2.L$1 = intRect;
                    composeScrollCaptureCallback$onScrollCaptureImageRequest$2.I$0 = i2;
                    composeScrollCaptureCallback$onScrollCaptureImageRequest$2.I$1 = i3;
                    composeScrollCaptureCallback$onScrollCaptureImageRequest$2.label = 1;
                    int i7 = relativeScroller.viewportSize;
                    if (i2 > i3) {
                        Path$$ExternalSyntheticBUOutline0.m$1((Object) Recorder$$ExternalSyntheticOutline2.m("Expected min=", i2, i3, " ≤ max="));
                        return null;
                    }
                    int i8 = i3 - i2;
                    if (i8 > i7) {
                        Path$$ExternalSyntheticBUOutline0.m$1((Object) Recorder$$ExternalSyntheticOutline2.m("Expected range (", i8, i7, ") to be ≤ viewportSize="));
                        return null;
                    }
                    float f = i2;
                    float f2 = relativeScroller.scrollAmount;
                    if (f < f2 || i3 > i7 + f2) {
                        scrollBy = relativeScroller.scrollBy((((i8 / 2) + i2) - (i7 / 2)) - f2, composeScrollCaptureCallback$onScrollCaptureImageRequest$2);
                        if (scrollBy != coroutineSingletons) {
                            scrollBy = Unit.INSTANCE;
                        }
                        if (scrollBy != coroutineSingletons) {
                            scrollBy = Unit.INSTANCE;
                        }
                    } else {
                        scrollBy = Unit.INSTANCE;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        i5 = composeScrollCaptureCallback$onScrollCaptureImageRequest$2.I$1;
                        i4 = composeScrollCaptureCallback$onScrollCaptureImageRequest$2.I$0;
                        intRect2 = composeScrollCaptureCallback$onScrollCaptureImageRequest$2.L$1;
                        scrollCaptureSession2 = (ScrollCaptureSession) composeScrollCaptureCallback$onScrollCaptureImageRequest$2.L$0;
                        SafeTrace.throwOnFailure(obj);
                        RelativeScroller relativeScroller2 = composeScrollCaptureCallback.scrollTracker;
                        coerceIn = RangesKt___RangesKt.coerceIn(i4 - MathKt__MathJVMKt.roundToInt(relativeScroller2.scrollAmount), 0, relativeScroller2.viewportSize);
                        RelativeScroller relativeScroller3 = composeScrollCaptureCallback.scrollTracker;
                        coerceIn2 = RangesKt___RangesKt.coerceIn(i5 - MathKt__MathJVMKt.roundToInt(relativeScroller3.scrollAmount), 0, relativeScroller3.viewportSize);
                        int i9 = intRect2.left;
                        int i10 = intRect2.right;
                        if (coerceIn != coerceIn2) {
                            return IntRect.Zero;
                        }
                        Canvas lockHardwareCanvas = scrollCaptureSession2.getSurface().lockHardwareCanvas();
                        try {
                            lockHardwareCanvas.save();
                            lockHardwareCanvas.translate(-i9, -coerceIn);
                            IntRect intRect3 = composeScrollCaptureCallback.viewportBoundsInWindow;
                            lockHardwareCanvas.translate(-intRect3.left, -intRect3.top);
                            composeScrollCaptureCallback.composeView.getRootView().draw(lockHardwareCanvas);
                            scrollCaptureSession2.getSurface().unlockCanvasAndPost(lockHardwareCanvas);
                            int roundToInt = MathKt__MathJVMKt.roundToInt(composeScrollCaptureCallback.scrollTracker.scrollAmount);
                            return new IntRect(i9, coerceIn + roundToInt, i10, coerceIn2 + roundToInt);
                        } catch (Throwable th) {
                            scrollCaptureSession2.getSurface().unlockCanvasAndPost(lockHardwareCanvas);
                            throw th;
                        }
                    }
                    int i11 = composeScrollCaptureCallback$onScrollCaptureImageRequest$2.I$1;
                    int i12 = composeScrollCaptureCallback$onScrollCaptureImageRequest$2.I$0;
                    IntRect intRect4 = composeScrollCaptureCallback$onScrollCaptureImageRequest$2.L$1;
                    ScrollCaptureSession scrollCaptureSession3 = (ScrollCaptureSession) composeScrollCaptureCallback$onScrollCaptureImageRequest$2.L$0;
                    SafeTrace.throwOnFailure(obj);
                    i2 = i12;
                    intRect = intRect4;
                    i3 = i11;
                    scrollCaptureSession = scrollCaptureSession3;
                }
                scrollCapture$onScrollCaptureSearch$2 = ScrollCapture$onScrollCaptureSearch$2.INSTANCE$1;
                composeScrollCaptureCallback$onScrollCaptureImageRequest$2.L$0 = scrollCaptureSession;
                composeScrollCaptureCallback$onScrollCaptureImageRequest$2.L$1 = intRect;
                composeScrollCaptureCallback$onScrollCaptureImageRequest$2.I$0 = i2;
                composeScrollCaptureCallback$onScrollCaptureImageRequest$2.I$1 = i3;
                composeScrollCaptureCallback$onScrollCaptureImageRequest$2.label = 2;
                if (Updater.getMonotonicFrameClock(composeScrollCaptureCallback$onScrollCaptureImageRequest$2.getContext()).withFrameNanos(composeScrollCaptureCallback$onScrollCaptureImageRequest$2, scrollCapture$onScrollCaptureSearch$2) != coroutineSingletons) {
                    scrollCaptureSession2 = scrollCaptureSession;
                    intRect2 = intRect;
                    i4 = i2;
                    i5 = i3;
                    RelativeScroller relativeScroller22 = composeScrollCaptureCallback.scrollTracker;
                    coerceIn = RangesKt___RangesKt.coerceIn(i4 - MathKt__MathJVMKt.roundToInt(relativeScroller22.scrollAmount), 0, relativeScroller22.viewportSize);
                    RelativeScroller relativeScroller32 = composeScrollCaptureCallback.scrollTracker;
                    coerceIn2 = RangesKt___RangesKt.coerceIn(i5 - MathKt__MathJVMKt.roundToInt(relativeScroller32.scrollAmount), 0, relativeScroller32.viewportSize);
                    int i92 = intRect2.left;
                    int i102 = intRect2.right;
                    if (coerceIn != coerceIn2) {
                    }
                }
                return coroutineSingletons;
            }
        }
        composeScrollCaptureCallback$onScrollCaptureImageRequest$2 = new ComposeScrollCaptureCallback$onScrollCaptureImageRequest$2(composeScrollCaptureCallback, continuationImpl);
        Object obj2 = composeScrollCaptureCallback$onScrollCaptureImageRequest$2.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = composeScrollCaptureCallback$onScrollCaptureImageRequest$2.label;
        if (i != 0) {
        }
        scrollCapture$onScrollCaptureSearch$2 = ScrollCapture$onScrollCaptureSearch$2.INSTANCE$1;
        composeScrollCaptureCallback$onScrollCaptureImageRequest$2.L$0 = scrollCaptureSession;
        composeScrollCaptureCallback$onScrollCaptureImageRequest$2.L$1 = intRect;
        composeScrollCaptureCallback$onScrollCaptureImageRequest$2.I$0 = i2;
        composeScrollCaptureCallback$onScrollCaptureImageRequest$2.I$1 = i3;
        composeScrollCaptureCallback$onScrollCaptureImageRequest$2.label = 2;
        if (Updater.getMonotonicFrameClock(composeScrollCaptureCallback$onScrollCaptureImageRequest$2.getContext()).withFrameNanos(composeScrollCaptureCallback$onScrollCaptureImageRequest$2, scrollCapture$onScrollCaptureSearch$2) != coroutineSingletons) {
        }
        return coroutineSingletons;
    }

    public final void onScrollCaptureEnd(Runnable runnable) {
        JobKt.launch$default(this.coroutineScope, NonCancellable.INSTANCE, null, new PageFetcher$flow$1(this, runnable, null, 8), 2);
    }

    public final void onScrollCaptureImageRequest(ScrollCaptureSession scrollCaptureSession, CancellationSignal cancellationSignal, Rect rect, Consumer consumer) {
        StandaloneCoroutine launch$default = JobKt.launch$default(this.coroutineScope, null, null, new FlowExtKt$simpleScan$1(this, scrollCaptureSession, rect, consumer, (Continuation) null, 16), 3);
        launch$default.invokeOnCompletion(new BoundsAnimation$animate$1(cancellationSignal, 16));
        cancellationSignal.setOnCancelListener(new HandwritingGestureApi34$$ExternalSyntheticLambda0(launch$default, 2));
    }

    public final void onScrollCaptureSearch(CancellationSignal cancellationSignal, Consumer consumer) {
        consumer.accept(ColorKt.toAndroidRect(this.viewportBoundsInWindow));
    }

    public final void onScrollCaptureStart(ScrollCaptureSession scrollCaptureSession, CancellationSignal cancellationSignal, Runnable runnable) {
        this.scrollTracker.scrollAmount = RecyclerView.DECELERATION_RATE;
        this.listener.scrollCaptureInProgress$delegate.setValue(Boolean.TRUE);
        runnable.run();
    }
}
