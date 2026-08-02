package androidx.constraintlayout.core.state.helpers;

import androidx.constraintlayout.compose.State;
import androidx.constraintlayout.core.state.HelperReference;
import androidx.constraintlayout.core.widgets.Flow;
import androidx.constraintlayout.core.widgets.HelperWidget;
import java.util.HashMap;

/* loaded from: classes3.dex */
public final class FlowReference extends HelperReference {
    public float mFirstHorizontalBias;
    public int mFirstHorizontalStyle;
    public float mFirstVerticalBias;
    public int mFirstVerticalStyle;
    public Flow mFlow;
    public int mHorizontalAlign;
    public int mHorizontalGap;
    public int mHorizontalStyle;
    public float mLastHorizontalBias;
    public int mLastHorizontalStyle;
    public float mLastVerticalBias;
    public int mLastVerticalStyle;
    public HashMap mMapPostMargin;
    public HashMap mMapPreMargin;
    public HashMap mMapWeights;
    public int mMaxElementsWrap;
    public int mOrientation;
    public int mPaddingBottom;
    public int mPaddingLeft;
    public int mPaddingRight;
    public int mPaddingTop;
    public int mVerticalAlign;
    public int mVerticalGap;
    public int mVerticalStyle;
    public int mWrapMode;

    public FlowReference(State state, int i) {
        super(state, i);
        this.mWrapMode = 0;
        this.mVerticalStyle = -1;
        this.mFirstVerticalStyle = -1;
        this.mLastVerticalStyle = -1;
        this.mHorizontalStyle = -1;
        this.mFirstHorizontalStyle = -1;
        this.mLastHorizontalStyle = -1;
        this.mVerticalAlign = 2;
        this.mHorizontalAlign = 2;
        this.mVerticalGap = 0;
        this.mHorizontalGap = 0;
        this.mPaddingLeft = 0;
        this.mPaddingRight = 0;
        this.mPaddingTop = 0;
        this.mPaddingBottom = 0;
        this.mMaxElementsWrap = -1;
        this.mOrientation = 0;
        this.mFirstVerticalBias = 0.5f;
        this.mLastVerticalBias = 0.5f;
        this.mFirstHorizontalBias = 0.5f;
        this.mLastHorizontalBias = 0.5f;
        if (i == 8) {
            this.mOrientation = 1;
        }
    }

    @Override // androidx.constraintlayout.core.state.HelperReference, androidx.constraintlayout.core.state.ConstraintReference, androidx.constraintlayout.core.state.Reference
    public final void apply() {
        getHelperWidget();
        setConstraintWidget(this.mFlow);
        Flow flow = this.mFlow;
        flow.mOrientation = this.mOrientation;
        flow.mWrapMode = this.mWrapMode;
        int i = this.mMaxElementsWrap;
        if (i != -1) {
            flow.mMaxElementsWrap = i;
        }
        int i2 = this.mPaddingLeft;
        if (i2 != 0) {
            flow.mResolvedPaddingLeft = i2;
        }
        int i3 = this.mPaddingTop;
        if (i3 != 0) {
            flow.mPaddingTop = i3;
        }
        int i4 = this.mPaddingRight;
        if (i4 != 0) {
            flow.mResolvedPaddingRight = i4;
        }
        int i5 = this.mPaddingBottom;
        if (i5 != 0) {
            flow.mPaddingBottom = i5;
        }
        int i6 = this.mHorizontalGap;
        if (i6 != 0) {
            flow.mHorizontalGap = i6;
        }
        int i7 = this.mVerticalGap;
        if (i7 != 0) {
            flow.mVerticalGap = i7;
        }
        float f = this.mHorizontalBias;
        if (f != 0.5f) {
            flow.mHorizontalBias = f;
        }
        float f2 = this.mFirstHorizontalBias;
        if (f2 != 0.5f) {
            flow.mFirstHorizontalBias = f2;
        }
        float f3 = this.mLastHorizontalBias;
        if (f3 != 0.5f) {
            flow.mLastHorizontalBias = f3;
        }
        float f4 = this.mVerticalBias;
        if (f4 != 0.5f) {
            flow.mVerticalBias = f4;
        }
        float f5 = this.mFirstVerticalBias;
        if (f5 != 0.5f) {
            flow.mFirstVerticalBias = f5;
        }
        float f6 = this.mLastVerticalBias;
        if (f6 != 0.5f) {
            flow.mLastVerticalBias = f6;
        }
        int i8 = this.mHorizontalAlign;
        if (i8 != 2) {
            flow.mHorizontalAlign = i8;
        }
        int i9 = this.mVerticalAlign;
        if (i9 != 2) {
            flow.mVerticalAlign = i9;
        }
        int i10 = this.mVerticalStyle;
        if (i10 != -1) {
            flow.mVerticalStyle = i10;
        }
        int i11 = this.mFirstVerticalStyle;
        if (i11 != -1) {
            flow.mFirstVerticalStyle = i11;
        }
        int i12 = this.mLastVerticalStyle;
        if (i12 != -1) {
            flow.mLastVerticalStyle = i12;
        }
        int i13 = this.mHorizontalStyle;
        if (i13 != -1) {
            flow.mHorizontalStyle = i13;
        }
        int i14 = this.mFirstHorizontalStyle;
        if (i14 != -1) {
            flow.mFirstHorizontalStyle = i14;
        }
        int i15 = this.mLastHorizontalStyle;
        if (i15 != -1) {
            flow.mLastHorizontalStyle = i15;
        }
        applyBase();
    }

    @Override // androidx.constraintlayout.core.state.HelperReference
    public final HelperWidget getHelperWidget() {
        if (this.mFlow == null) {
            this.mFlow = new Flow();
        }
        return this.mFlow;
    }
}
