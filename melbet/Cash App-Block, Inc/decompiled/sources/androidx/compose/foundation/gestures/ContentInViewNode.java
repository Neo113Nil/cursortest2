package androidx.compose.foundation.gestures;

import androidx.compose.foundation.gestures.BringIntoViewSpec;
import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.relocation.BringIntoViewResponderNode$bringIntoView$2$1$1;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.ui.node.DepthSortedSetKt;
import androidx.compose.ui.node.MeasuredSizeAwareModifierNode;
import androidx.compose.ui.unit.IntSize;
import androidx.recyclerview.widget.RecyclerView;
import coil3.memory.MemoryCacheService;
import com.squareup.util.cash.Countries;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineName;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.JobKt;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes.dex */
public final class ContentInViewNode extends Modifier.Node implements CompositionLocalConsumerModifierNode, MeasuredSizeAwareModifierNode {
    public BringIntoViewSpec bringIntoViewSpec;
    public final ScrollableNode$$ExternalSyntheticLambda0 getFocusedRect;
    public boolean isAnimationRunning;
    public Orientation orientation;
    public boolean reverseDirection;
    public final ScrollingLogic scrollingLogic;
    public boolean trackingFocusedChild;
    public final MemoryCacheService bringIntoViewRequests = new MemoryCacheService(5);
    public long viewportSize = -1;

    public final class Request {
        public final CancellableContinuationImpl continuation;
        public final BringIntoViewResponderNode$bringIntoView$2$1$1 currentBounds;

        public Request(BringIntoViewResponderNode$bringIntoView$2$1$1 bringIntoViewResponderNode$bringIntoView$2$1$1, CancellableContinuationImpl cancellableContinuationImpl) {
            this.currentBounds = bringIntoViewResponderNode$bringIntoView$2$1$1;
            this.continuation = cancellableContinuationImpl;
        }

        public final String toString() {
            CancellableContinuationImpl cancellableContinuationImpl = this.continuation;
            CoroutineName coroutineName = (CoroutineName) cancellableContinuationImpl.context.get(CoroutineName.Key);
            String str = coroutineName != null ? coroutineName.name : null;
            StringBuilder sb = new StringBuilder("Request@");
            String num = Integer.toString(hashCode(), CharsKt.checkRadix(16));
            num.getClass();
            sb.append(num);
            sb.append(str != null ? JsonLogicResult$Success$$ExternalSyntheticOutline0.m("[", str, "](") : "(");
            sb.append("currentBounds()=");
            sb.append(this.currentBounds.invoke());
            sb.append(", continuation=");
            sb.append(cancellableContinuationImpl);
            sb.append(')');
            return sb.toString();
        }
    }

    public ContentInViewNode(Orientation orientation, ScrollingLogic scrollingLogic, boolean z, BringIntoViewSpec bringIntoViewSpec, ScrollableNode$$ExternalSyntheticLambda0 scrollableNode$$ExternalSyntheticLambda0) {
        this.orientation = orientation;
        this.scrollingLogic = scrollingLogic;
        this.reverseDirection = z;
        this.bringIntoViewSpec = bringIntoViewSpec;
        this.getFocusedRect = scrollableNode$$ExternalSyntheticLambda0;
    }

    /* renamed from: access$calculateScrollDelta-I_oMVgE, reason: not valid java name */
    public static final float m193access$calculateScrollDeltaI_oMVgE(ContentInViewNode contentInViewNode, BringIntoViewSpec bringIntoViewSpec, long j) {
        float f;
        Rect rect;
        int compare;
        long j2 = contentInViewNode.viewportSize;
        MutableVector mutableVector = (MutableVector) contentInViewNode.bringIntoViewRequests.imageLoader;
        int i = mutableVector.size - 1;
        Object[] objArr = mutableVector.content;
        if (i < objArr.length) {
            rect = null;
            while (true) {
                if (i < 0) {
                    f = RecyclerView.DECELERATION_RATE;
                    break;
                }
                Rect rect2 = (Rect) ((Request) objArr[i]).currentBounds.invoke();
                if (rect2 != null) {
                    long m634getSizeNHjbRc = rect2.m634getSizeNHjbRc();
                    long m3991toSizeozmzZPI = Countries.m3991toSizeozmzZPI(contentInViewNode.m195getViewportSizeOrZeroYbymL2g$foundation());
                    f = RecyclerView.DECELERATION_RATE;
                    int ordinal = contentInViewNode.orientation.ordinal();
                    if (ordinal == 0) {
                        compare = Float.compare(Float.intBitsToFloat((int) (m634getSizeNHjbRc & BodyPartID.bodyIdMax)), Float.intBitsToFloat((int) (m3991toSizeozmzZPI & BodyPartID.bodyIdMax)));
                    } else {
                        if (ordinal != 1) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return RecyclerView.DECELERATION_RATE;
                        }
                        compare = Float.compare(Float.intBitsToFloat((int) (m634getSizeNHjbRc >> 32)), Float.intBitsToFloat((int) (m3991toSizeozmzZPI >> 32)));
                    }
                    if (compare <= 0) {
                        rect = rect2;
                    } else if (rect == null) {
                        rect = rect2;
                    }
                }
                i--;
            }
        } else {
            f = RecyclerView.DECELERATION_RATE;
            rect = null;
        }
        if (rect == null) {
            Rect rect3 = contentInViewNode.trackingFocusedChild ? (Rect) contentInViewNode.getFocusedRect.invoke() : null;
            if (rect3 == null) {
                return f;
            }
            rect = rect3;
        }
        long m3991toSizeozmzZPI2 = Countries.m3991toSizeozmzZPI(j2);
        int ordinal2 = contentInViewNode.orientation.ordinal();
        if (ordinal2 == 0) {
            float f2 = rect.top;
            return bringIntoViewSpec.calculateScrollDistance(f2 - ((int) (j & BodyPartID.bodyIdMax)), rect.bottom - f2, Float.intBitsToFloat((int) (m3991toSizeozmzZPI2 & BodyPartID.bodyIdMax)));
        }
        if (ordinal2 == 1) {
            float f3 = rect.left;
            return bringIntoViewSpec.calculateScrollDistance(f3 - ((int) (j >> 32)), rect.right - f3, Float.intBitsToFloat((int) (m3991toSizeozmzZPI2 >> 32)));
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return f;
    }

    /* renamed from: isMaxVisible--EQwtKw$default, reason: not valid java name */
    public static boolean m194isMaxVisibleEQwtKw$default(ContentInViewNode contentInViewNode, Rect rect, long j, long j2, int i) {
        if ((i & 1) != 0) {
            j = contentInViewNode.m195getViewportSizeOrZeroYbymL2g$foundation();
        }
        long j3 = j;
        if ((i & 2) != 0) {
            j2 = 0;
        }
        long m198relocationOffsetfbGrOKE = contentInViewNode.m198relocationOffsetfbGrOKE(rect, j3, j2);
        return Math.abs(Float.intBitsToFloat((int) (m198relocationOffsetfbGrOKE >> 32))) <= 0.5f && Math.abs(Float.intBitsToFloat((int) (m198relocationOffsetfbGrOKE & BodyPartID.bodyIdMax))) <= 0.5f;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final boolean getShouldAutoInvalidate() {
        return false;
    }

    /* renamed from: getViewportSizeOrZero-YbymL2g$foundation, reason: not valid java name */
    public final long m195getViewportSizeOrZeroYbymL2g$foundation() {
        long j = this.viewportSize;
        if (IntSize.m1055equalsimpl0(j, -1L)) {
            return 0L;
        }
        return j;
    }

    /* renamed from: launchAnimation--gyyYBs, reason: not valid java name */
    public final void m196launchAnimationgyyYBs(long j) {
        BringIntoViewSpec bringIntoViewSpec = this.bringIntoViewSpec;
        if (bringIntoViewSpec == null) {
            bringIntoViewSpec = (BringIntoViewSpec) DepthSortedSetKt.currentValueOf(this, BringIntoViewSpec_androidKt.LocalBringIntoViewSpec);
        }
        BringIntoViewSpec bringIntoViewSpec2 = bringIntoViewSpec;
        if (this.isAnimationRunning) {
            InlineClassHelperKt.throwIllegalStateException("launchAnimation called when previous animation was running");
        }
        BringIntoViewSpec bringIntoViewSpec3 = this.bringIntoViewSpec;
        if (bringIntoViewSpec3 == null) {
            bringIntoViewSpec3 = (BringIntoViewSpec) DepthSortedSetKt.currentValueOf(this, BringIntoViewSpec_androidKt.LocalBringIntoViewSpec);
        }
        bringIntoViewSpec3.getClass();
        BringIntoViewSpec.Companion.getClass();
        int i = 0;
        JobKt.launch$default(getCoroutineScope(), null, CoroutineStart.UNDISPATCHED, new ContentInViewNode$launchAnimation$2(i, j, this, new UpdatableAnimationState(BringIntoViewSpec.Companion.DefaultScrollAnimationSpec), bringIntoViewSpec2, (Continuation) null), 1);
    }

    @Override // androidx.compose.ui.node.MeasuredSizeAwareModifierNode
    /* renamed from: onRemeasured-ozmzZPI, reason: not valid java name */
    public final void mo197onRemeasuredozmzZPI(long j) {
        int compare;
        long m195getViewportSizeOrZeroYbymL2g$foundation = m195getViewportSizeOrZeroYbymL2g$foundation();
        this.viewportSize = j;
        int ordinal = this.orientation.ordinal();
        if (ordinal == 0) {
            compare = Intrinsics.compare((int) (j & BodyPartID.bodyIdMax), (int) (m195getViewportSizeOrZeroYbymL2g$foundation & BodyPartID.bodyIdMax));
        } else {
            if (ordinal != 1) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return;
            }
            compare = Intrinsics.compare((int) (j >> 32), (int) (m195getViewportSizeOrZeroYbymL2g$foundation >> 32));
        }
        if (compare >= 0) {
            return;
        }
        long j2 = !this.reverseDirection ? this.orientation == Orientation.Vertical ? (((int) (m195getViewportSizeOrZeroYbymL2g$foundation & BodyPartID.bodyIdMax)) - ((int) (j & BodyPartID.bodyIdMax))) & BodyPartID.bodyIdMax : (((int) (m195getViewportSizeOrZeroYbymL2g$foundation >> 32)) - ((int) (j >> 32))) << 32 : 0L;
        Rect rect = (Rect) this.getFocusedRect.invoke();
        if (rect == null || this.isAnimationRunning || this.trackingFocusedChild || !m194isMaxVisibleEQwtKw$default(this, rect, m195getViewportSizeOrZeroYbymL2g$foundation, 0L, 2) || m194isMaxVisibleEQwtKw$default(this, rect, 0L, j2, 1)) {
            return;
        }
        this.trackingFocusedChild = true;
        m196launchAnimationgyyYBs(j2);
    }

    /* renamed from: relocationOffset-fbGrOKE, reason: not valid java name */
    public final long m198relocationOffsetfbGrOKE(Rect rect, long j, long j2) {
        long m3991toSizeozmzZPI = Countries.m3991toSizeozmzZPI(j);
        int ordinal = this.orientation.ordinal();
        if (ordinal == 0) {
            BringIntoViewSpec bringIntoViewSpec = this.bringIntoViewSpec;
            if (bringIntoViewSpec == null) {
                bringIntoViewSpec = (BringIntoViewSpec) DepthSortedSetKt.currentValueOf(this, BringIntoViewSpec_androidKt.LocalBringIntoViewSpec);
            }
            float f = rect.top;
            float calculateScrollDistance = bringIntoViewSpec.calculateScrollDistance(f - ((int) (j2 & BodyPartID.bodyIdMax)), rect.bottom - f, Float.intBitsToFloat((int) (m3991toSizeozmzZPI & BodyPartID.bodyIdMax)));
            return (Float.floatToRawIntBits(RecyclerView.DECELERATION_RATE) << 32) | (Float.floatToRawIntBits(calculateScrollDistance) & BodyPartID.bodyIdMax);
        }
        if (ordinal != 1) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return 0L;
        }
        BringIntoViewSpec bringIntoViewSpec2 = this.bringIntoViewSpec;
        if (bringIntoViewSpec2 == null) {
            bringIntoViewSpec2 = (BringIntoViewSpec) DepthSortedSetKt.currentValueOf(this, BringIntoViewSpec_androidKt.LocalBringIntoViewSpec);
        }
        float f2 = rect.left;
        return (Float.floatToRawIntBits(bringIntoViewSpec2.calculateScrollDistance(f2 - ((int) (j2 >> 32)), rect.right - f2, Float.intBitsToFloat((int) (m3991toSizeozmzZPI >> 32)))) << 32) | (Float.floatToRawIntBits(RecyclerView.DECELERATION_RATE) & BodyPartID.bodyIdMax);
    }
}
