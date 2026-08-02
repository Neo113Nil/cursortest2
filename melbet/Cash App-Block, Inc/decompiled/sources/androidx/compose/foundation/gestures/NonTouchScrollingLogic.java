package androidx.compose.foundation.gestures;

import androidx.camera.camera2.pipe.compat.VirtualCameraState$connect$2$1;
import androidx.camera.video.Recorder;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.unit.Density;
import bo.app.a$$ExternalSyntheticBUOutline0;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.JobKt;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes3.dex */
public abstract class NonTouchScrollingLogic {
    public Density density;
    public boolean isScrolling;
    public final Function2 onScrollStopped;
    public final ScrollingLogic scrollingLogic;
    public final Recorder.AnonymousClass4 velocityTracker = new Recorder.AnonymousClass4(14);

    public NonTouchScrollingLogic(ScrollingLogic scrollingLogic, Function2 function2, Density density) {
        this.scrollingLogic = scrollingLogic;
        this.onScrollStopped = function2;
        this.density = density;
    }

    public static void consume$foundation(PointerEvent pointerEvent) {
        List list = pointerEvent.changes;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((PointerInputChange) list.get(i)).consume();
        }
    }

    public final void updateDensity(Density density) {
        this.density = density;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object userScroll$foundation(Function2 function2, ContinuationImpl continuationImpl) {
        NonTouchScrollingLogic$userScroll$1 nonTouchScrollingLogic$userScroll$1;
        int i;
        if (continuationImpl instanceof NonTouchScrollingLogic$userScroll$1) {
            nonTouchScrollingLogic$userScroll$1 = (NonTouchScrollingLogic$userScroll$1) continuationImpl;
            int i2 = nonTouchScrollingLogic$userScroll$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                nonTouchScrollingLogic$userScroll$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = nonTouchScrollingLogic$userScroll$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = nonTouchScrollingLogic$userScroll$1.label;
                Continuation continuation = null;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.isScrolling = true;
                    VirtualCameraState$connect$2$1 virtualCameraState$connect$2$1 = new VirtualCameraState$connect$2$1(this, function2, continuation, 21);
                    nonTouchScrollingLogic$userScroll$1.label = 1;
                    if (JobKt.supervisorScope(virtualCameraState$connect$2$1, nonTouchScrollingLogic$userScroll$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                this.isScrolling = false;
                return Unit.INSTANCE;
            }
        }
        nonTouchScrollingLogic$userScroll$1 = new NonTouchScrollingLogic$userScroll$1(this, continuationImpl);
        Object obj2 = nonTouchScrollingLogic$userScroll$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = nonTouchScrollingLogic$userScroll$1.label;
        Continuation continuation2 = null;
        if (i != 0) {
        }
        this.isScrolling = false;
        return Unit.INSTANCE;
    }
}
