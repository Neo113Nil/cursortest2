package androidx.constraintlayout.compose;

import androidx.camera.core.CameraSelector$$ExternalSyntheticOutline0;
import androidx.camera.core.streamsharing.StreamSharing$$ExternalSyntheticLambda1;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.constraintlayout.core.state.ConstraintReference;
import androidx.constraintlayout.core.state.HelperReference;
import androidx.constraintlayout.core.state.Reference;
import androidx.constraintlayout.core.state.helpers.AlignVerticallyReference;
import androidx.constraintlayout.core.state.helpers.BarrierReference;
import androidx.constraintlayout.core.state.helpers.Facade;
import androidx.constraintlayout.core.state.helpers.FlowReference;
import androidx.constraintlayout.core.state.helpers.GridReference;
import androidx.constraintlayout.core.state.helpers.GuidelineReference;
import androidx.constraintlayout.core.state.helpers.HorizontalChainReference;
import androidx.constraintlayout.core.state.helpers.VerticalChainReference;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes3.dex */
public final class State {
    public final Density density;
    public final ArrayList mBaselineNeeded;
    public final ArrayList mBaselineNeededWidgets;
    public boolean mDirtyBaselineNeededWidgets;
    public StreamSharing$$ExternalSyntheticLambda1 mDpToPixel;
    public final HashMap mHelperReferences;
    public boolean mIsLtr = true;
    public int mNumHelpers;
    public final ConstraintReference mParent;
    public final HashMap mReferences;
    public final HashMap mTags;
    public long rootIncomingConstraints;

    public State(Density density) {
        HashMap hashMap = new HashMap();
        this.mReferences = hashMap;
        this.mHelperReferences = new HashMap();
        this.mTags = new HashMap();
        ConstraintReference constraintReference = new ConstraintReference(this);
        this.mParent = constraintReference;
        this.mNumHelpers = 0;
        this.mBaselineNeeded = new ArrayList();
        this.mBaselineNeededWidgets = new ArrayList();
        this.mDirtyBaselineNeededWidgets = true;
        constraintReference.mKey = 0;
        hashMap.put(0, constraintReference);
        this.density = density;
        this.rootIncomingConstraints = ConstraintsKt.Constraints$default(0, 0, 0, 0, 15);
        LayoutDirection layoutDirection = LayoutDirection.Ltr;
        this.mDpToPixel = new StreamSharing$$ExternalSyntheticLambda1(this, 19);
    }

    public final void baselineNeededFor(Object obj) {
        this.mBaselineNeeded.add(obj);
        this.mDirtyBaselineNeededWidgets = true;
    }

    public final ConstraintReference constraints(Object obj) {
        HashMap hashMap = this.mReferences;
        Reference reference = (Reference) hashMap.get(obj);
        Reference reference2 = reference;
        if (reference == null) {
            ConstraintReference constraintReference = new ConstraintReference(this);
            hashMap.put(obj, constraintReference);
            constraintReference.mKey = obj;
            reference2 = constraintReference;
        }
        if (reference2 instanceof ConstraintReference) {
            return (ConstraintReference) reference2;
        }
        return null;
    }

    public final int convertDimension(Float f) {
        return Math.round(f.floatValue());
    }

    public final GuidelineReference guideline(int i, String str) {
        ConstraintReference constraints = constraints(str);
        Facade facade = constraints.mFacade;
        if (facade == null || !(facade instanceof GuidelineReference)) {
            GuidelineReference guidelineReference = new GuidelineReference(this);
            guidelineReference.mOrientation = i;
            guidelineReference.mKey = str;
            constraints.mFacade = guidelineReference;
            constraints.setConstraintWidget(guidelineReference.getConstraintWidget());
        }
        return (GuidelineReference) constraints.mFacade;
    }

    public final HelperReference helper(int i) {
        HelperReference helperReference;
        StringBuilder sb = new StringBuilder("__HELPER_KEY_");
        int i2 = this.mNumHelpers;
        this.mNumHelpers = i2 + 1;
        String m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i2, "__", sb);
        HashMap hashMap = this.mHelperReferences;
        HelperReference helperReference2 = (HelperReference) hashMap.get(m);
        HelperReference helperReference3 = helperReference2;
        if (helperReference2 == null) {
            int i3 = 4;
            int i4 = 1;
            switch (CameraSelector$$ExternalSyntheticOutline0.ordinal(i)) {
                case 0:
                    helperReference = new HorizontalChainReference(this, 1);
                    break;
                case 1:
                    helperReference = new VerticalChainReference(this, 2);
                    break;
                case 2:
                    AlignVerticallyReference alignVerticallyReference = new AlignVerticallyReference(this, i3, i4);
                    alignVerticallyReference.mBias = 0.5f;
                    helperReference = alignVerticallyReference;
                    break;
                case 3:
                    AlignVerticallyReference alignVerticallyReference2 = new AlignVerticallyReference(this, i3, 0);
                    alignVerticallyReference2.mBias = 0.5f;
                    helperReference = alignVerticallyReference2;
                    break;
                case 4:
                    helperReference = new BarrierReference(this, 5);
                    break;
                case 5:
                default:
                    helperReference = new HelperReference(this, i);
                    break;
                case 6:
                case 7:
                    helperReference = new FlowReference(this, i);
                    break;
                case 8:
                case 9:
                case 10:
                    helperReference = new GridReference(this, i);
                    break;
            }
            helperReference.mKey = m;
            hashMap.put(m, helperReference);
            helperReference3 = helperReference;
        }
        return helperReference3;
    }
}
