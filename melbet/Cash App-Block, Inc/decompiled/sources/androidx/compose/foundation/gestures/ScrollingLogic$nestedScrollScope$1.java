package androidx.compose.foundation.gestures;

import androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect;
import androidx.compose.foundation.AndroidOverscroll_androidKt;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.EdgeEffectWrapper;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Size;
import androidx.recyclerview.widget.RecyclerView;
import com.squareup.cash.CashApp$$ExternalSyntheticLambda2;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes.dex */
public final class ScrollingLogic$nestedScrollScope$1 {
    public final /* synthetic */ ScrollingLogic this$0;

    public ScrollingLogic$nestedScrollScope$1(ScrollingLogic scrollingLogic) {
        this.this$0 = scrollingLogic;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0244 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0252  */
    /* renamed from: scrollByWithOverscroll-OzD1aCk, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long m250scrollByWithOverscrollOzD1aCk(int i, long j) {
        long j2;
        float intBitsToFloat;
        int i2;
        float m169pullRightk4lQ0M;
        float intBitsToFloat2;
        long floatToRawIntBits;
        long m625minusMKHz9U;
        boolean z;
        boolean z2;
        boolean z3;
        int i3;
        boolean z4;
        ScrollingLogic scrollingLogic = this.this$0;
        scrollingLogic.latestScrollSource = i;
        AndroidEdgeEffectOverscrollEffect androidEdgeEffectOverscrollEffect = scrollingLogic.overscrollEffect;
        if (androidEdgeEffectOverscrollEffect == null || !(scrollingLogic.scrollableState.getCanScrollForward() || scrollingLogic.scrollableState.getCanScrollBackward())) {
            return scrollingLogic.m245performScroll3eAAhYA(scrollingLogic.outerStateScope, j, i);
        }
        int i4 = scrollingLogic.latestScrollSource;
        CashApp$$ExternalSyntheticLambda2 cashApp$$ExternalSyntheticLambda2 = scrollingLogic.performScrollForOverscroll;
        EdgeEffectWrapper edgeEffectWrapper = androidEdgeEffectOverscrollEffect.edgeEffectWrapper;
        if (Size.m644isEmptyimpl(androidEdgeEffectOverscrollEffect.containerSize)) {
            return ((Offset) cashApp$$ExternalSyntheticLambda2.invoke(new Offset(j))).packedValue;
        }
        if (!androidEdgeEffectOverscrollEffect.scrollCycleInProgress) {
            if (EdgeEffectWrapper.isStretched(edgeEffectWrapper.leftEffect)) {
                androidEdgeEffectOverscrollEffect.m168pullLeftk4lQ0M(0L);
            }
            if (EdgeEffectWrapper.isStretched(edgeEffectWrapper.rightEffect)) {
                androidEdgeEffectOverscrollEffect.m169pullRightk4lQ0M(0L);
            }
            if (EdgeEffectWrapper.isStretched(edgeEffectWrapper.topEffect)) {
                androidEdgeEffectOverscrollEffect.m170pullTopk4lQ0M(0L);
            }
            if (EdgeEffectWrapper.isStretched(edgeEffectWrapper.bottomEffect)) {
                androidEdgeEffectOverscrollEffect.m167pullBottomk4lQ0M(0L);
            }
            androidEdgeEffectOverscrollEffect.scrollCycleInProgress = true;
        }
        int i5 = AndroidOverscroll_androidKt.$r8$clinit;
        float f = i4 == 2 ? 4.0f : 1.0f;
        long m627timestuRUvjQ = Offset.m627timestuRUvjQ(j, f);
        int i6 = (int) (j & BodyPartID.bodyIdMax);
        if (Float.intBitsToFloat(i6) != RecyclerView.DECELERATION_RATE) {
            if (!EdgeEffectWrapper.isStretched(edgeEffectWrapper.topEffect) || Float.intBitsToFloat(i6) >= RecyclerView.DECELERATION_RATE) {
                j2 = 4294967295L;
                if (EdgeEffectWrapper.isStretched(edgeEffectWrapper.bottomEffect) && Float.intBitsToFloat(i6) > RecyclerView.DECELERATION_RATE) {
                    float m167pullBottomk4lQ0M = androidEdgeEffectOverscrollEffect.m167pullBottomk4lQ0M(m627timestuRUvjQ);
                    if (!EdgeEffectWrapper.isStretched(edgeEffectWrapper.bottomEffect)) {
                        edgeEffectWrapper.getOrCreateBottomEffect().finish();
                    }
                    intBitsToFloat = m167pullBottomk4lQ0M == Float.intBitsToFloat((int) (m627timestuRUvjQ & BodyPartID.bodyIdMax)) ? Float.intBitsToFloat(i6) : m167pullBottomk4lQ0M / f;
                }
            } else {
                float m170pullTopk4lQ0M = androidEdgeEffectOverscrollEffect.m170pullTopk4lQ0M(m627timestuRUvjQ);
                j2 = 4294967295L;
                if (!EdgeEffectWrapper.isStretched(edgeEffectWrapper.topEffect)) {
                    edgeEffectWrapper.getOrCreateTopEffect().finish();
                }
                intBitsToFloat = m170pullTopk4lQ0M == Float.intBitsToFloat((int) (m627timestuRUvjQ & BodyPartID.bodyIdMax)) ? Float.intBitsToFloat(i6) : m170pullTopk4lQ0M / f;
            }
            i2 = (int) (j >> 32);
            if (Float.intBitsToFloat(i2) != RecyclerView.DECELERATION_RATE) {
                if (EdgeEffectWrapper.isStretched(edgeEffectWrapper.leftEffect) && Float.intBitsToFloat(i2) < RecyclerView.DECELERATION_RATE) {
                    m169pullRightk4lQ0M = androidEdgeEffectOverscrollEffect.m168pullLeftk4lQ0M(m627timestuRUvjQ);
                    if (!EdgeEffectWrapper.isStretched(edgeEffectWrapper.leftEffect)) {
                        edgeEffectWrapper.getOrCreateLeftEffect().finish();
                    }
                    if (m169pullRightk4lQ0M == Float.intBitsToFloat((int) (m627timestuRUvjQ >> 32))) {
                        intBitsToFloat2 = Float.intBitsToFloat(i2);
                    }
                    intBitsToFloat2 = m169pullRightk4lQ0M / f;
                } else if (EdgeEffectWrapper.isStretched(edgeEffectWrapper.rightEffect) && Float.intBitsToFloat(i2) > RecyclerView.DECELERATION_RATE) {
                    m169pullRightk4lQ0M = androidEdgeEffectOverscrollEffect.m169pullRightk4lQ0M(m627timestuRUvjQ);
                    if (!EdgeEffectWrapper.isStretched(edgeEffectWrapper.rightEffect)) {
                        edgeEffectWrapper.getOrCreateRightEffect().finish();
                    }
                    if (m169pullRightk4lQ0M == Float.intBitsToFloat((int) (m627timestuRUvjQ >> 32))) {
                        intBitsToFloat2 = Float.intBitsToFloat(i2);
                    }
                    intBitsToFloat2 = m169pullRightk4lQ0M / f;
                }
                floatToRawIntBits = (Float.floatToRawIntBits(intBitsToFloat2) << 32) | (Float.floatToRawIntBits(intBitsToFloat) & j2);
                if (!Offset.m622equalsimpl0(floatToRawIntBits, 0L)) {
                    androidEdgeEffectOverscrollEffect.invalidateOverscroll$foundation();
                }
                m625minusMKHz9U = Offset.m625minusMKHz9U(j, floatToRawIntBits);
                long j3 = ((Offset) cashApp$$ExternalSyntheticLambda2.invoke(new Offset(m625minusMKHz9U))).packedValue;
                long m625minusMKHz9U2 = Offset.m625minusMKHz9U(m625minusMKHz9U, j3);
                if ((Float.intBitsToFloat((int) (m625minusMKHz9U >> 32)) == RecyclerView.DECELERATION_RATE || Float.intBitsToFloat((int) (m625minusMKHz9U & j2)) != RecyclerView.DECELERATION_RATE) && ((Float.intBitsToFloat((int) (j3 >> 32)) != RecyclerView.DECELERATION_RATE || Float.intBitsToFloat((int) (j3 & j2)) != RecyclerView.DECELERATION_RATE) && (EdgeEffectWrapper.isStretched(edgeEffectWrapper.leftEffect) || EdgeEffectWrapper.isStretched(edgeEffectWrapper.topEffect) || EdgeEffectWrapper.isStretched(edgeEffectWrapper.rightEffect) || EdgeEffectWrapper.isStretched(edgeEffectWrapper.bottomEffect)))) {
                    androidEdgeEffectOverscrollEffect.animateToReleaseIfNeeded();
                }
                if (i4 == 1) {
                    int i7 = (int) (m625minusMKHz9U2 >> 32);
                    if (Float.intBitsToFloat(i7) > 0.5f) {
                        androidEdgeEffectOverscrollEffect.m168pullLeftk4lQ0M(m625minusMKHz9U2);
                    } else {
                        if (Float.intBitsToFloat(i7) >= -0.5f) {
                            z3 = false;
                            i3 = (int) (m625minusMKHz9U2 & j2);
                            if (Float.intBitsToFloat(i3) <= 0.5f) {
                                androidEdgeEffectOverscrollEffect.m170pullTopk4lQ0M(m625minusMKHz9U2);
                            } else if (Float.intBitsToFloat(i3) < -0.5f) {
                                androidEdgeEffectOverscrollEffect.m167pullBottomk4lQ0M(m625minusMKHz9U2);
                            } else {
                                z4 = false;
                                if (!z3 || z4) {
                                    z = true;
                                    if (!Offset.m622equalsimpl0(m625minusMKHz9U, 0L)) {
                                        if (!EdgeEffectWrapper.isAnimating(edgeEffectWrapper.leftEffect) || Float.intBitsToFloat(i2) >= RecyclerView.DECELERATION_RATE) {
                                            z2 = false;
                                        } else {
                                            CanvasKt.onReleaseWithOppositeDelta(edgeEffectWrapper.getOrCreateLeftEffect(), Float.intBitsToFloat(i2));
                                            z2 = EdgeEffectWrapper.isAnimating(edgeEffectWrapper.leftEffect);
                                        }
                                        if (EdgeEffectWrapper.isAnimating(edgeEffectWrapper.rightEffect) && Float.intBitsToFloat(i2) > RecyclerView.DECELERATION_RATE) {
                                            CanvasKt.onReleaseWithOppositeDelta(edgeEffectWrapper.getOrCreateRightEffect(), Float.intBitsToFloat(i2));
                                            z2 = z2 || EdgeEffectWrapper.isAnimating(edgeEffectWrapper.rightEffect);
                                        }
                                        if (EdgeEffectWrapper.isAnimating(edgeEffectWrapper.topEffect) && Float.intBitsToFloat(i6) < RecyclerView.DECELERATION_RATE) {
                                            CanvasKt.onReleaseWithOppositeDelta(edgeEffectWrapper.getOrCreateTopEffect(), Float.intBitsToFloat(i6));
                                            z2 = z2 || EdgeEffectWrapper.isAnimating(edgeEffectWrapper.topEffect);
                                        }
                                        if (EdgeEffectWrapper.isAnimating(edgeEffectWrapper.bottomEffect) && Float.intBitsToFloat(i6) > RecyclerView.DECELERATION_RATE) {
                                            CanvasKt.onReleaseWithOppositeDelta(edgeEffectWrapper.getOrCreateBottomEffect(), Float.intBitsToFloat(i6));
                                            z2 = z2 || EdgeEffectWrapper.isAnimating(edgeEffectWrapper.bottomEffect);
                                        }
                                        z = z2 || z;
                                    }
                                    if (z) {
                                        androidEdgeEffectOverscrollEffect.invalidateOverscroll$foundation();
                                    }
                                    return Offset.m626plusMKHz9U(floatToRawIntBits, j3);
                                }
                            }
                            z4 = true;
                            if (!z3) {
                            }
                            z = true;
                            if (!Offset.m622equalsimpl0(m625minusMKHz9U, 0L)) {
                            }
                            if (z) {
                            }
                            return Offset.m626plusMKHz9U(floatToRawIntBits, j3);
                        }
                        androidEdgeEffectOverscrollEffect.m169pullRightk4lQ0M(m625minusMKHz9U2);
                    }
                    z3 = true;
                    i3 = (int) (m625minusMKHz9U2 & j2);
                    if (Float.intBitsToFloat(i3) <= 0.5f) {
                    }
                    z4 = true;
                    if (!z3) {
                    }
                    z = true;
                    if (!Offset.m622equalsimpl0(m625minusMKHz9U, 0L)) {
                    }
                    if (z) {
                    }
                    return Offset.m626plusMKHz9U(floatToRawIntBits, j3);
                }
                z = false;
                if (!Offset.m622equalsimpl0(m625minusMKHz9U, 0L)) {
                }
                if (z) {
                }
                return Offset.m626plusMKHz9U(floatToRawIntBits, j3);
            }
            intBitsToFloat2 = 0.0f;
            floatToRawIntBits = (Float.floatToRawIntBits(intBitsToFloat2) << 32) | (Float.floatToRawIntBits(intBitsToFloat) & j2);
            if (!Offset.m622equalsimpl0(floatToRawIntBits, 0L)) {
            }
            m625minusMKHz9U = Offset.m625minusMKHz9U(j, floatToRawIntBits);
            long j32 = ((Offset) cashApp$$ExternalSyntheticLambda2.invoke(new Offset(m625minusMKHz9U))).packedValue;
            long m625minusMKHz9U22 = Offset.m625minusMKHz9U(m625minusMKHz9U, j32);
            if (Float.intBitsToFloat((int) (m625minusMKHz9U >> 32)) == RecyclerView.DECELERATION_RATE) {
            }
            androidEdgeEffectOverscrollEffect.animateToReleaseIfNeeded();
            if (i4 == 1) {
            }
            z = false;
            if (!Offset.m622equalsimpl0(m625minusMKHz9U, 0L)) {
            }
            if (z) {
            }
            return Offset.m626plusMKHz9U(floatToRawIntBits, j32);
        }
        j2 = 4294967295L;
        intBitsToFloat = 0.0f;
        i2 = (int) (j >> 32);
        if (Float.intBitsToFloat(i2) != RecyclerView.DECELERATION_RATE) {
        }
        intBitsToFloat2 = 0.0f;
        floatToRawIntBits = (Float.floatToRawIntBits(intBitsToFloat2) << 32) | (Float.floatToRawIntBits(intBitsToFloat) & j2);
        if (!Offset.m622equalsimpl0(floatToRawIntBits, 0L)) {
        }
        m625minusMKHz9U = Offset.m625minusMKHz9U(j, floatToRawIntBits);
        long j322 = ((Offset) cashApp$$ExternalSyntheticLambda2.invoke(new Offset(m625minusMKHz9U))).packedValue;
        long m625minusMKHz9U222 = Offset.m625minusMKHz9U(m625minusMKHz9U, j322);
        if (Float.intBitsToFloat((int) (m625minusMKHz9U >> 32)) == RecyclerView.DECELERATION_RATE) {
        }
        androidEdgeEffectOverscrollEffect.animateToReleaseIfNeeded();
        if (i4 == 1) {
        }
        z = false;
        if (!Offset.m622equalsimpl0(m625minusMKHz9U, 0L)) {
        }
        if (z) {
        }
        return Offset.m626plusMKHz9U(floatToRawIntBits, j322);
    }
}
