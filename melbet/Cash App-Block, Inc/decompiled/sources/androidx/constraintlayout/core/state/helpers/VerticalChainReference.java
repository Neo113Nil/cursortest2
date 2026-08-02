package androidx.constraintlayout.core.state.helpers;

import androidx.constraintlayout.compose.State;
import androidx.constraintlayout.core.state.ConstraintReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class VerticalChainReference extends ChainReference {
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
                state.constraints(it.next()).clearVertical();
            }
        }
        Iterator it2 = arrayList.iterator();
        ConstraintReference constraintReference = null;
        ConstraintReference constraintReference2 = null;
        while (it2.hasNext()) {
            Object next = it2.next();
            ConstraintReference constraints = state.constraints(next);
            if (constraintReference2 == null) {
                Object obj = this.mTopToTop;
                if (obj != null) {
                    constraints.topToTop(obj);
                    constraints.margin(this.mMarginTop).marginGone(this.mMarginTopGone);
                } else {
                    Object obj2 = this.mTopToBottom;
                    if (obj2 != null) {
                        constraints.mLast = 10;
                        constraints.mTopToBottom = obj2;
                        constraints.margin(this.mMarginTop).marginGone(this.mMarginTopGone);
                    } else {
                        String obj3 = constraints.mKey.toString();
                        constraints.topToTop(0);
                        constraints.margin(Float.valueOf(getPreMargin(obj3))).marginGone(Float.valueOf(getPreGoneMargin(obj3)));
                    }
                }
                constraintReference2 = constraints;
            }
            if (constraintReference != null) {
                String obj4 = constraintReference.mKey.toString();
                String obj5 = constraints.mKey.toString();
                Object obj6 = constraints.mKey;
                constraintReference.mLast = 12;
                constraintReference.mBottomToTop = obj6;
                constraintReference.margin(Float.valueOf(getPostMargin(obj4))).marginGone(Float.valueOf(getPostGoneMargin(obj4)));
                Object obj7 = constraintReference.mKey;
                constraints.mLast = 10;
                constraints.mTopToBottom = obj7;
                constraints.margin(Float.valueOf(getPreMargin(obj5))).marginGone(Float.valueOf(getPreGoneMargin(obj5)));
            }
            String obj8 = next.toString();
            HashMap hashMap = this.mMapWeights;
            float floatValue = hashMap.containsKey(obj8) ? ((Float) hashMap.get(obj8)).floatValue() : -1.0f;
            if (floatValue != -1.0f) {
                constraints.mVerticalChainWeight = floatValue;
            }
            constraintReference = constraints;
        }
        if (constraintReference != null) {
            Object obj9 = this.mBottomToTop;
            if (obj9 != null) {
                constraintReference.mLast = 12;
                constraintReference.mBottomToTop = obj9;
                constraintReference.margin(this.mMarginBottom).marginGone(this.mMarginBottomGone);
            } else {
                Object obj10 = this.mBottomToBottom;
                if (obj10 != null) {
                    constraintReference.bottomToBottom(obj10);
                    constraintReference.margin(this.mMarginBottom).marginGone(this.mMarginBottomGone);
                } else {
                    String obj11 = constraintReference.mKey.toString();
                    constraintReference.bottomToBottom(0);
                    constraintReference.margin(Float.valueOf(getPostMargin(obj11))).marginGone(Float.valueOf(getPostGoneMargin(obj11)));
                }
            }
        }
        if (constraintReference2 == null) {
            return;
        }
        float f = this.mBias;
        if (f != 0.5f) {
            constraintReference2.mVerticalBias = f;
        }
        int ordinal = this.mStyle.ordinal();
        if (ordinal == 0) {
            constraintReference2.mVerticalChainStyle = 0;
        } else if (ordinal == 1) {
            constraintReference2.mVerticalChainStyle = 1;
        } else {
            if (ordinal != 2) {
                return;
            }
            constraintReference2.mVerticalChainStyle = 2;
        }
    }
}
