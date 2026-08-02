package androidx.compose.foundation.pager;

import androidx.collection.ObjectList$$ExternalSyntheticLambda0;
import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.foundation.gestures.snapping.SnapFlingBehavior;
import androidx.compose.runtime.ParcelableSnapshotMutableFloatState;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.recyclerview.widget.RecyclerView;
import bo.app.a$$ExternalSyntheticBUOutline0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.JobKt;
import net.oneformapp.schema.Schema;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes3.dex */
public final class PagerWrapperFlingBehavior implements FlingBehavior {
    public final SnapFlingBehavior originalFlingBehavior;
    public final PagerState pagerState;

    public PagerWrapperFlingBehavior(SnapFlingBehavior snapFlingBehavior, PagerState pagerState) {
        this.originalFlingBehavior = snapFlingBehavior;
        this.pagerState = pagerState;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // androidx.compose.foundation.gestures.FlingBehavior
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object performFling(ScrollScope scrollScope, float f, Continuation continuation) {
        PagerWrapperFlingBehavior$performFling$1 pagerWrapperFlingBehavior$performFling$1;
        int i;
        PagerState pagerState;
        Schema schema;
        Schema schema2;
        if (continuation instanceof PagerWrapperFlingBehavior$performFling$1) {
            pagerWrapperFlingBehavior$performFling$1 = (PagerWrapperFlingBehavior$performFling$1) continuation;
            int i2 = pagerWrapperFlingBehavior$performFling$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                pagerWrapperFlingBehavior$performFling$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = pagerWrapperFlingBehavior$performFling$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = pagerWrapperFlingBehavior$performFling$1.label;
                Continuation continuation2 = null;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    ObjectList$$ExternalSyntheticLambda0 objectList$$ExternalSyntheticLambda0 = new ObjectList$$ExternalSyntheticLambda0(24, this, scrollScope);
                    pagerWrapperFlingBehavior$performFling$1.label = 1;
                    obj = this.originalFlingBehavior.performFling(scrollScope, f, objectList$$ExternalSyntheticLambda0, pagerWrapperFlingBehavior$performFling$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                float floatValue = ((Number) obj).floatValue();
                pagerState = this.pagerState;
                schema = pagerState.scrollPosition;
                schema2 = pagerState.scrollPosition;
                if (((ParcelableSnapshotMutableFloatState) schema.fieldSortOrder).getFloatValue() != RecyclerView.DECELERATION_RATE && Math.abs(((ParcelableSnapshotMutableFloatState) schema2.fieldSortOrder).getFloatValue()) < 0.001d) {
                    int intValue = ((ParcelableSnapshotMutableIntState) schema2.elementTypes).getIntValue();
                    int i3 = 0;
                    if (pagerState.scrollableState.isScrollInProgress()) {
                        JobKt.launch$default(((PagerMeasureResult) pagerState.pagerLayoutInfoState.getValue()).coroutineScope, null, null, new PagerState$requestScrollToPage$1(i3, pagerState, continuation2), 3);
                    }
                    pagerState.snapToItem$foundation(intValue, RecyclerView.DECELERATION_RATE, false);
                } else {
                    new Float(((ParcelableSnapshotMutableFloatState) schema2.fieldSortOrder).getFloatValue());
                }
                return new Float(floatValue);
            }
        }
        pagerWrapperFlingBehavior$performFling$1 = new PagerWrapperFlingBehavior$performFling$1(this, (ContinuationImpl) continuation);
        Object obj2 = pagerWrapperFlingBehavior$performFling$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = pagerWrapperFlingBehavior$performFling$1.label;
        Continuation continuation22 = null;
        if (i != 0) {
        }
        float floatValue2 = ((Number) obj2).floatValue();
        pagerState = this.pagerState;
        schema = pagerState.scrollPosition;
        schema2 = pagerState.scrollPosition;
        if (((ParcelableSnapshotMutableFloatState) schema.fieldSortOrder).getFloatValue() != RecyclerView.DECELERATION_RATE) {
            int intValue2 = ((ParcelableSnapshotMutableIntState) schema2.elementTypes).getIntValue();
            int i32 = 0;
            if (pagerState.scrollableState.isScrollInProgress()) {
            }
            pagerState.snapToItem$foundation(intValue2, RecyclerView.DECELERATION_RATE, false);
            return new Float(floatValue2);
        }
        new Float(((ParcelableSnapshotMutableFloatState) schema2.fieldSortOrder).getFloatValue());
        return new Float(floatValue2);
    }
}
