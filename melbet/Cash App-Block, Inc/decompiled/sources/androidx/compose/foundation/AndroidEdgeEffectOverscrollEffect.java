package androidx.compose.foundation;

import android.content.Context;
import android.os.Build;
import android.widget.EdgeEffect;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Velocity;
import androidx.compose.ui.unit.VelocityKt;
import androidx.recyclerview.widget.RecyclerView;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.size.DimensionKt;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function2;
import kotlin.math.MathKt__MathJVMKt;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes.dex */
public final class AndroidEdgeEffectOverscrollEffect {
    public long containerSize;
    public final Density density;
    public final EdgeEffectWrapper edgeEffectWrapper;
    public final boolean invalidationEnabled;
    public final DelegatingNode node;
    public long pointerId;
    public long pointerPosition = 9205357640488583168L;
    public final ParcelableSnapshotMutableState redrawSignal;
    public boolean scrollCycleInProgress;

    public AndroidEdgeEffectOverscrollEffect(Context context, Density density, long j, PaddingValues paddingValues) {
        this.density = density;
        EdgeEffectWrapper edgeEffectWrapper = new EdgeEffectWrapper(context, ColorKt.m694toArgb8_81llA(j));
        this.edgeEffectWrapper = edgeEffectWrapper;
        this.redrawSignal = new ParcelableSnapshotMutableState(Unit.INSTANCE, NeverEqualPolicy.INSTANCE);
        this.invalidationEnabled = true;
        this.containerSize = 0L;
        this.pointerId = -1L;
        AndroidEdgeEffectOverscrollEffect$pointerInputNode$1 androidEdgeEffectOverscrollEffect$pointerInputNode$1 = new AndroidEdgeEffectOverscrollEffect$pointerInputNode$1(this, 0);
        PointerEvent pointerEvent = SuspendingPointerInputFilterKt.EmptyPointerEvent;
        SuspendingPointerInputModifierNodeImpl suspendingPointerInputModifierNodeImpl = new SuspendingPointerInputModifierNodeImpl(null, null, null, androidEdgeEffectOverscrollEffect$pointerInputNode$1);
        this.node = Build.VERSION.SDK_INT >= 31 ? new StretchOverscrollNode(suspendingPointerInputModifierNodeImpl, this, edgeEffectWrapper) : new GlowOverscrollNode(suspendingPointerInputModifierNodeImpl, this, edgeEffectWrapper, paddingValues);
    }

    public final void animateToReleaseIfNeeded() {
        boolean z;
        EdgeEffectWrapper edgeEffectWrapper = this.edgeEffectWrapper;
        EdgeEffect edgeEffect = edgeEffectWrapper.topEffect;
        boolean z2 = true;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z = !edgeEffect.isFinished();
        } else {
            z = false;
        }
        EdgeEffect edgeEffect2 = edgeEffectWrapper.bottomEffect;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z = !edgeEffect2.isFinished() || z;
        }
        EdgeEffect edgeEffect3 = edgeEffectWrapper.leftEffect;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z = !edgeEffect3.isFinished() || z;
        }
        EdgeEffect edgeEffect4 = edgeEffectWrapper.rightEffect;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            if (edgeEffect4.isFinished() && !z) {
                z2 = false;
            }
            z = z2;
        }
        if (z) {
            invalidateOverscroll$foundation();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0054, code lost:
    
        if (r17.invoke(r14, r2) == r3) goto L50;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /* renamed from: applyToFling-BMRW4eQ, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m165applyToFlingBMRW4eQ(long j, Function2 function2, ContinuationImpl continuationImpl) {
        AndroidEdgeEffectOverscrollEffect$applyToFling$1 androidEdgeEffectOverscrollEffect$applyToFling$1;
        int i;
        long j2;
        long m1069minusAH228Gc;
        if (continuationImpl instanceof AndroidEdgeEffectOverscrollEffect$applyToFling$1) {
            androidEdgeEffectOverscrollEffect$applyToFling$1 = (AndroidEdgeEffectOverscrollEffect$applyToFling$1) continuationImpl;
            int i2 = androidEdgeEffectOverscrollEffect$applyToFling$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                androidEdgeEffectOverscrollEffect$applyToFling$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = androidEdgeEffectOverscrollEffect$applyToFling$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = androidEdgeEffectOverscrollEffect$applyToFling$1.label;
                EdgeEffectWrapper edgeEffectWrapper = this.edgeEffectWrapper;
                if (i == 0) {
                    if (i == 1) {
                        SafeTrace.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    if (i != 2) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    j2 = androidEdgeEffectOverscrollEffect$applyToFling$1.J$0;
                    SafeTrace.throwOnFailure(obj);
                    m1069minusAH228Gc = Velocity.m1069minusAH228Gc(j2, ((Velocity) obj).m1073unboximpl());
                    this.scrollCycleInProgress = false;
                    if (Velocity.m1067getXimpl(m1069minusAH228Gc) <= RecyclerView.DECELERATION_RATE) {
                        CanvasKt.onAbsorbCompat(edgeEffectWrapper.getOrCreateLeftEffect(), MathKt__MathJVMKt.roundToInt(Velocity.m1067getXimpl(m1069minusAH228Gc)));
                    } else if (Velocity.m1067getXimpl(m1069minusAH228Gc) < RecyclerView.DECELERATION_RATE) {
                        CanvasKt.onAbsorbCompat(edgeEffectWrapper.getOrCreateRightEffect(), -MathKt__MathJVMKt.roundToInt(Velocity.m1067getXimpl(m1069minusAH228Gc)));
                    }
                    if (Velocity.m1068getYimpl(m1069minusAH228Gc) <= RecyclerView.DECELERATION_RATE) {
                        CanvasKt.onAbsorbCompat(edgeEffectWrapper.getOrCreateTopEffect(), MathKt__MathJVMKt.roundToInt(Velocity.m1068getYimpl(m1069minusAH228Gc)));
                    } else if (Velocity.m1068getYimpl(m1069minusAH228Gc) < RecyclerView.DECELERATION_RATE) {
                        CanvasKt.onAbsorbCompat(edgeEffectWrapper.getOrCreateBottomEffect(), -MathKt__MathJVMKt.roundToInt(Velocity.m1068getYimpl(m1069minusAH228Gc)));
                    }
                    animateToReleaseIfNeeded();
                    return Unit.INSTANCE;
                }
                SafeTrace.throwOnFailure(obj);
                if (Size.m644isEmptyimpl(this.containerSize)) {
                    Object m1064boximpl = Velocity.m1064boximpl(j);
                    androidEdgeEffectOverscrollEffect$applyToFling$1.label = 1;
                } else {
                    boolean isStretched = EdgeEffectWrapper.isStretched(edgeEffectWrapper.leftEffect);
                    Density density = this.density;
                    long Velocity = VelocityKt.Velocity((!isStretched || Velocity.m1067getXimpl(j) >= RecyclerView.DECELERATION_RATE) ? (!EdgeEffectWrapper.isStretched(edgeEffectWrapper.rightEffect) || Velocity.m1067getXimpl(j) <= RecyclerView.DECELERATION_RATE) ? 0.0f : -CanvasKt.absorbToRelaxIfNeeded(edgeEffectWrapper.getOrCreateRightEffect(), -Velocity.m1067getXimpl(j), Float.intBitsToFloat((int) (this.containerSize >> 32)), density) : CanvasKt.absorbToRelaxIfNeeded(edgeEffectWrapper.getOrCreateLeftEffect(), Velocity.m1067getXimpl(j), Float.intBitsToFloat((int) (this.containerSize >> 32)), density), (!EdgeEffectWrapper.isStretched(edgeEffectWrapper.topEffect) || Velocity.m1068getYimpl(j) >= RecyclerView.DECELERATION_RATE) ? (!EdgeEffectWrapper.isStretched(edgeEffectWrapper.bottomEffect) || Velocity.m1068getYimpl(j) <= RecyclerView.DECELERATION_RATE) ? 0.0f : -CanvasKt.absorbToRelaxIfNeeded(edgeEffectWrapper.getOrCreateBottomEffect(), -Velocity.m1068getYimpl(j), Float.intBitsToFloat((int) (BodyPartID.bodyIdMax & this.containerSize)), density) : CanvasKt.absorbToRelaxIfNeeded(edgeEffectWrapper.getOrCreateTopEffect(), Velocity.m1068getYimpl(j), Float.intBitsToFloat((int) (BodyPartID.bodyIdMax & this.containerSize)), density));
                    if (!Velocity.m1066equalsimpl0(Velocity)) {
                        invalidateOverscroll$foundation();
                    }
                    long m1069minusAH228Gc2 = Velocity.m1069minusAH228Gc(j, Velocity);
                    Object m1064boximpl2 = Velocity.m1064boximpl(m1069minusAH228Gc2);
                    androidEdgeEffectOverscrollEffect$applyToFling$1.J$0 = m1069minusAH228Gc2;
                    androidEdgeEffectOverscrollEffect$applyToFling$1.label = 2;
                    obj = function2.invoke(m1064boximpl2, androidEdgeEffectOverscrollEffect$applyToFling$1);
                    if (obj != obj2) {
                        j2 = m1069minusAH228Gc2;
                        m1069minusAH228Gc = Velocity.m1069minusAH228Gc(j2, ((Velocity) obj).m1073unboximpl());
                        this.scrollCycleInProgress = false;
                        if (Velocity.m1067getXimpl(m1069minusAH228Gc) <= RecyclerView.DECELERATION_RATE) {
                        }
                        if (Velocity.m1068getYimpl(m1069minusAH228Gc) <= RecyclerView.DECELERATION_RATE) {
                        }
                        animateToReleaseIfNeeded();
                        return Unit.INSTANCE;
                    }
                }
                return obj2;
            }
        }
        androidEdgeEffectOverscrollEffect$applyToFling$1 = new AndroidEdgeEffectOverscrollEffect$applyToFling$1(this, continuationImpl);
        Object obj3 = androidEdgeEffectOverscrollEffect$applyToFling$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = androidEdgeEffectOverscrollEffect$applyToFling$1.label;
        EdgeEffectWrapper edgeEffectWrapper2 = this.edgeEffectWrapper;
        if (i == 0) {
        }
    }

    /* renamed from: displacement-F1C5BW0$foundation, reason: not valid java name */
    public final long m166displacementF1C5BW0$foundation() {
        long j = this.pointerPosition;
        if ((9223372034707292159L & j) == 9205357640488583168L) {
            j = DimensionKt.m1466getCenteruvyYCjk(this.containerSize);
        }
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) / Float.intBitsToFloat((int) (this.containerSize >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & BodyPartID.bodyIdMax)) / Float.intBitsToFloat((int) (this.containerSize & BodyPartID.bodyIdMax));
        return (Float.floatToRawIntBits(intBitsToFloat2) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
    }

    public final void invalidateOverscroll$foundation() {
        if (this.invalidationEnabled) {
            this.redrawSignal.setValue(Unit.INSTANCE);
        }
    }

    /* renamed from: pullBottom-k-4lQ0M, reason: not valid java name */
    public final float m167pullBottomk4lQ0M(long j) {
        float intBitsToFloat = Float.intBitsToFloat((int) (m166displacementF1C5BW0$foundation() >> 32));
        int i = (int) (j & BodyPartID.bodyIdMax);
        float intBitsToFloat2 = Float.intBitsToFloat(i) / Float.intBitsToFloat((int) (this.containerSize & BodyPartID.bodyIdMax));
        EdgeEffect orCreateBottomEffect = this.edgeEffectWrapper.getOrCreateBottomEffect();
        return CanvasKt.getDistanceCompat(orCreateBottomEffect) == RecyclerView.DECELERATION_RATE ? Float.intBitsToFloat((int) (this.containerSize & BodyPartID.bodyIdMax)) * (-CanvasKt.onPullDistanceCompat(orCreateBottomEffect, -intBitsToFloat2, 1.0f - intBitsToFloat)) : Float.intBitsToFloat(i);
    }

    /* renamed from: pullLeft-k-4lQ0M, reason: not valid java name */
    public final float m168pullLeftk4lQ0M(long j) {
        float intBitsToFloat = Float.intBitsToFloat((int) (m166displacementF1C5BW0$foundation() & BodyPartID.bodyIdMax));
        int i = (int) (j >> 32);
        float intBitsToFloat2 = Float.intBitsToFloat(i) / Float.intBitsToFloat((int) (this.containerSize >> 32));
        EdgeEffect orCreateLeftEffect = this.edgeEffectWrapper.getOrCreateLeftEffect();
        return CanvasKt.getDistanceCompat(orCreateLeftEffect) == RecyclerView.DECELERATION_RATE ? Float.intBitsToFloat((int) (this.containerSize >> 32)) * CanvasKt.onPullDistanceCompat(orCreateLeftEffect, intBitsToFloat2, 1.0f - intBitsToFloat) : Float.intBitsToFloat(i);
    }

    /* renamed from: pullRight-k-4lQ0M, reason: not valid java name */
    public final float m169pullRightk4lQ0M(long j) {
        float intBitsToFloat = Float.intBitsToFloat((int) (m166displacementF1C5BW0$foundation() & BodyPartID.bodyIdMax));
        int i = (int) (j >> 32);
        float intBitsToFloat2 = Float.intBitsToFloat(i) / Float.intBitsToFloat((int) (this.containerSize >> 32));
        EdgeEffect orCreateRightEffect = this.edgeEffectWrapper.getOrCreateRightEffect();
        return CanvasKt.getDistanceCompat(orCreateRightEffect) == RecyclerView.DECELERATION_RATE ? Float.intBitsToFloat((int) (this.containerSize >> 32)) * (-CanvasKt.onPullDistanceCompat(orCreateRightEffect, -intBitsToFloat2, intBitsToFloat)) : Float.intBitsToFloat(i);
    }

    /* renamed from: pullTop-k-4lQ0M, reason: not valid java name */
    public final float m170pullTopk4lQ0M(long j) {
        float intBitsToFloat = Float.intBitsToFloat((int) (m166displacementF1C5BW0$foundation() >> 32));
        int i = (int) (j & BodyPartID.bodyIdMax);
        float intBitsToFloat2 = Float.intBitsToFloat(i) / Float.intBitsToFloat((int) (this.containerSize & BodyPartID.bodyIdMax));
        EdgeEffect orCreateTopEffect = this.edgeEffectWrapper.getOrCreateTopEffect();
        return CanvasKt.getDistanceCompat(orCreateTopEffect) == RecyclerView.DECELERATION_RATE ? Float.intBitsToFloat((int) (this.containerSize & BodyPartID.bodyIdMax)) * CanvasKt.onPullDistanceCompat(orCreateTopEffect, intBitsToFloat2, intBitsToFloat) : Float.intBitsToFloat(i);
    }

    /* renamed from: updateSize-uvyYCjk$foundation, reason: not valid java name */
    public final void m171updateSizeuvyYCjk$foundation(long j) {
        boolean m639equalsimpl0 = Size.m639equalsimpl0(this.containerSize, 0L);
        boolean m639equalsimpl02 = Size.m639equalsimpl0(j, this.containerSize);
        this.containerSize = j;
        if (!m639equalsimpl02) {
            long roundToInt = (MathKt__MathJVMKt.roundToInt(Float.intBitsToFloat((int) (j & BodyPartID.bodyIdMax))) & BodyPartID.bodyIdMax) | (MathKt__MathJVMKt.roundToInt(Float.intBitsToFloat((int) (j >> 32))) << 32);
            EdgeEffectWrapper edgeEffectWrapper = this.edgeEffectWrapper;
            edgeEffectWrapper.size = roundToInt;
            EdgeEffect edgeEffect = edgeEffectWrapper.topEffect;
            if (edgeEffect != null) {
                edgeEffect.setSize((int) (roundToInt >> 32), (int) (roundToInt & BodyPartID.bodyIdMax));
            }
            EdgeEffect edgeEffect2 = edgeEffectWrapper.bottomEffect;
            if (edgeEffect2 != null) {
                edgeEffect2.setSize((int) (roundToInt >> 32), (int) (roundToInt & BodyPartID.bodyIdMax));
            }
            EdgeEffect edgeEffect3 = edgeEffectWrapper.leftEffect;
            if (edgeEffect3 != null) {
                edgeEffect3.setSize((int) (roundToInt & BodyPartID.bodyIdMax), (int) (roundToInt >> 32));
            }
            EdgeEffect edgeEffect4 = edgeEffectWrapper.rightEffect;
            if (edgeEffect4 != null) {
                edgeEffect4.setSize((int) (roundToInt & BodyPartID.bodyIdMax), (int) (roundToInt >> 32));
            }
            EdgeEffect edgeEffect5 = edgeEffectWrapper.topEffectNegation;
            if (edgeEffect5 != null) {
                edgeEffect5.setSize((int) (roundToInt >> 32), (int) (roundToInt & BodyPartID.bodyIdMax));
            }
            EdgeEffect edgeEffect6 = edgeEffectWrapper.bottomEffectNegation;
            if (edgeEffect6 != null) {
                edgeEffect6.setSize((int) (roundToInt >> 32), (int) (roundToInt & BodyPartID.bodyIdMax));
            }
            EdgeEffect edgeEffect7 = edgeEffectWrapper.leftEffectNegation;
            if (edgeEffect7 != null) {
                edgeEffect7.setSize((int) (roundToInt & BodyPartID.bodyIdMax), (int) (roundToInt >> 32));
            }
            EdgeEffect edgeEffect8 = edgeEffectWrapper.rightEffectNegation;
            if (edgeEffect8 != null) {
                edgeEffect8.setSize((int) (BodyPartID.bodyIdMax & roundToInt), (int) (roundToInt >> 32));
            }
        }
        if (m639equalsimpl0 || m639equalsimpl02) {
            return;
        }
        animateToReleaseIfNeeded();
    }
}
