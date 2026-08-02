package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.ScrollState$$ExternalSyntheticLambda4;
import androidx.compose.ui.geometry.Offset;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.util.task.RepeatOnIntervalTaskRunner$repeatOn$2;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$FloatRef;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes.dex */
public abstract class ScrollableKt {
    public static final ScrollState$$ExternalSyntheticLambda4 CanDragCalculation = new ScrollState$$ExternalSyntheticLambda4(25);
    public static final ScrollableKt$NoOpScrollScope$1 NoOpScrollScope = new ScrollableKt$NoOpScrollScope$1();
    public static final ScrollableKt$DefaultScrollMotionDurationScale$1 DefaultScrollMotionDurationScale = new ScrollableKt$DefaultScrollMotionDurationScale$1();
    public static final ScrollableKt$UnityDensity$1 UnityDensity = new ScrollableKt$UnityDensity$1();

    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: access$semanticsScrollBy-d-4ec7I, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m240access$semanticsScrollByd4ec7I(ScrollingLogic scrollingLogic, long j, ContinuationImpl continuationImpl) {
        ScrollableKt$semanticsScrollBy$1 scrollableKt$semanticsScrollBy$1;
        int i;
        Ref$FloatRef ref$FloatRef;
        ScrollingLogic scrollingLogic2;
        if (continuationImpl instanceof ScrollableKt$semanticsScrollBy$1) {
            scrollableKt$semanticsScrollBy$1 = (ScrollableKt$semanticsScrollBy$1) continuationImpl;
            int i2 = scrollableKt$semanticsScrollBy$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                scrollableKt$semanticsScrollBy$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = scrollableKt$semanticsScrollBy$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scrollableKt$semanticsScrollBy$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    ref$FloatRef = new Ref$FloatRef();
                    MutatePriority mutatePriority = MutatePriority.Default;
                    RepeatOnIntervalTaskRunner$repeatOn$2 repeatOnIntervalTaskRunner$repeatOn$2 = new RepeatOnIntervalTaskRunner$repeatOn$2(scrollingLogic, j, ref$FloatRef, (Continuation) null, 3);
                    scrollableKt$semanticsScrollBy$1.L$0 = scrollingLogic;
                    scrollableKt$semanticsScrollBy$1.L$1 = ref$FloatRef;
                    scrollableKt$semanticsScrollBy$1.label = 1;
                    if (scrollingLogic.scroll(mutatePriority, repeatOnIntervalTaskRunner$repeatOn$2, scrollableKt$semanticsScrollBy$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    scrollingLogic2 = scrollingLogic;
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    Ref$FloatRef ref$FloatRef2 = scrollableKt$semanticsScrollBy$1.L$1;
                    ScrollingLogic scrollingLogic3 = scrollableKt$semanticsScrollBy$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                    ref$FloatRef = ref$FloatRef2;
                    scrollingLogic2 = scrollingLogic3;
                }
                return new Offset(scrollingLogic2.m248toOffsettuRUvjQ(ref$FloatRef.element));
            }
        }
        scrollableKt$semanticsScrollBy$1 = new ScrollableKt$semanticsScrollBy$1(continuationImpl);
        Object obj2 = scrollableKt$semanticsScrollBy$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scrollableKt$semanticsScrollBy$1.label;
        if (i != 0) {
        }
        return new Offset(scrollingLogic2.m248toOffsettuRUvjQ(ref$FloatRef.element));
    }
}
