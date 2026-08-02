package androidx.constraintlayout.core.state.helpers;

import androidx.constraintlayout.compose.State;
import androidx.constraintlayout.core.state.ConstraintReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class HorizontalChainReference extends ChainReference {
    @Override // androidx.constraintlayout.core.state.HelperReference, androidx.constraintlayout.core.state.ConstraintReference, androidx.constraintlayout.core.state.Reference
    public final void apply() {
        State state;
        ArrayList arrayList = this.mReferences;
        Iterator it = arrayList.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            state = this.mHelperState;
            if (!hasNext) {
                break;
            } else {
                state.constraints(it.next()).clearHorizontal();
            }
        }
        Iterator it2 = arrayList.iterator();
        ConstraintReference constraintReference = null;
        ConstraintReference constraintReference2 = null;
        while (it2.hasNext()) {
            Object next = it2.next();
            ConstraintReference constraints = state.constraints(next);
            if (constraintReference2 == null) {
                Object obj = this.mStartToStart;
                if (obj != null) {
                    constraints.startToStart(obj);
                    constraints.margin(this.mMarginStart).marginGone(this.mMarginStartGone);
                } else {
                    Object obj2 = this.mStartToEnd;
                    if (obj2 != null) {
                        constraints.mLast = 6;
                        constraints.mStartToEnd = obj2;
                        constraints.margin(this.mMarginStart).marginGone(this.mMarginStartGone);
                    } else {
                        Object obj3 = this.mLeftToLeft;
                        if (obj3 != null) {
                            constraints.startToStart(obj3);
                            constraints.margin(this.mMarginLeft).marginGone(this.mMarginLeftGone);
                        } else {
                            Object obj4 = this.mLeftToRight;
                            if (obj4 != null) {
                                constraints.mLast = 6;
                                constraints.mStartToEnd = obj4;
                                constraints.margin(this.mMarginLeft).marginGone(this.mMarginLeftGone);
                            } else {
                                String obj5 = constraints.mKey.toString();
                                constraints.startToStart(0);
                                constraints.margin(Float.valueOf(getPreMargin(obj5))).marginGone(Float.valueOf(getPreGoneMargin(obj5)));
                            }
                        }
                    }
                }
                constraintReference2 = constraints;
            }
            if (constraintReference != null) {
                String obj6 = constraintReference.mKey.toString();
                String obj7 = constraints.mKey.toString();
                Object obj8 = constraints.mKey;
                constraintReference.mLast = 7;
                constraintReference.mEndToStart = obj8;
                constraintReference.margin(Float.valueOf(getPostMargin(obj6))).marginGone(Float.valueOf(getPostGoneMargin(obj6)));
                Object obj9 = constraintReference.mKey;
                constraints.mLast = 6;
                constraints.mStartToEnd = obj9;
                constraints.margin(Float.valueOf(getPreMargin(obj7))).marginGone(Float.valueOf(getPreGoneMargin(obj7)));
            }
            String obj10 = next.toString();
            HashMap hashMap = this.mMapWeights;
            float floatValue = hashMap.containsKey(obj10) ? ((Float) hashMap.get(obj10)).floatValue() : -1.0f;
            if (floatValue != -1.0f) {
                constraints.mHorizontalChainWeight = floatValue;
            }
            constraintReference = constraints;
        }
        if (constraintReference != null) {
            Object obj11 = this.mEndToStart;
            if (obj11 != null) {
                constraintReference.mLast = 7;
                constraintReference.mEndToStart = obj11;
                constraintReference.margin(this.mMarginEnd).marginGone(this.mMarginEndGone);
            } else {
                Object obj12 = this.mEndToEnd;
                if (obj12 != null) {
                    constraintReference.endToEnd(obj12);
                    constraintReference.margin(this.mMarginEnd).marginGone(this.mMarginEndGone);
                } else {
                    Object obj13 = this.mRightToLeft;
                    if (obj13 != null) {
                        constraintReference.mLast = 7;
                        constraintReference.mEndToStart = obj13;
                        constraintReference.margin(this.mMarginRight).marginGone(this.mMarginRightGone);
                    } else {
                        Object obj14 = this.mRightToRight;
                        if (obj14 != null) {
                            constraintReference.endToEnd(obj14);
                            constraintReference.margin(this.mMarginRight).marginGone(this.mMarginRightGone);
                        } else {
                            String obj15 = constraintReference.mKey.toString();
                            constraintReference.endToEnd(0);
                            constraintReference.margin(Float.valueOf(getPostMargin(obj15))).marginGone(Float.valueOf(getPostGoneMargin(obj15)));
                        }
                    }
                }
            }
        }
        if (constraintReference2 == null) {
            return;
        }
        float f = this.mBias;
        if (f != 0.5f) {
            constraintReference2.mHorizontalBias = f;
        }
        int ordinal = this.mStyle.ordinal();
        if (ordinal == 0) {
            constraintReference2.mHorizontalChainStyle = 0;
        } else if (ordinal == 1) {
            constraintReference2.mHorizontalChainStyle = 1;
        } else {
            if (ordinal != 2) {
                return;
            }
            constraintReference2.mHorizontalChainStyle = 2;
        }
    }
}
