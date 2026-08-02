package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.LinearSystem;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure$Measure;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure$Measurer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/* loaded from: classes3.dex */
public final class Flow extends VirtualLayout {
    public ConstraintWidget[] mDisplayedWidgets;
    public int mHorizontalStyle = -1;
    public int mVerticalStyle = -1;
    public int mFirstHorizontalStyle = -1;
    public int mFirstVerticalStyle = -1;
    public int mLastHorizontalStyle = -1;
    public int mLastVerticalStyle = -1;
    public float mHorizontalBias = 0.5f;
    public float mVerticalBias = 0.5f;
    public float mFirstHorizontalBias = 0.5f;
    public float mFirstVerticalBias = 0.5f;
    public float mLastHorizontalBias = 0.5f;
    public float mLastVerticalBias = 0.5f;
    public int mHorizontalGap = 0;
    public int mVerticalGap = 0;
    public int mHorizontalAlign = 2;
    public int mVerticalAlign = 2;
    public int mWrapMode = 0;
    public int mMaxElementsWrap = -1;
    public int mOrientation = 0;
    public final ArrayList mChainList = new ArrayList();
    public ConstraintWidget[] mAlignedBiggestElementsInRows = null;
    public ConstraintWidget[] mAlignedBiggestElementsInCols = null;
    public int[] mAlignedDimensions = null;
    public int mDisplayedWidgetsCount = 0;

    public final class WidgetsList {
        public ConstraintAnchor mBottom;
        public ConstraintAnchor mLeft;
        public int mMax;
        public int mOrientation;
        public int mPaddingBottom;
        public int mPaddingLeft;
        public int mPaddingRight;
        public int mPaddingTop;
        public ConstraintAnchor mRight;
        public ConstraintAnchor mTop;
        public ConstraintWidget mBiggest = null;
        public int mBiggestDimension = 0;
        public int mWidth = 0;
        public int mHeight = 0;
        public int mStartIndex = 0;
        public int mCount = 0;
        public int mNbMatchConstraintsWidgets = 0;

        public WidgetsList(int i, ConstraintAnchor constraintAnchor, ConstraintAnchor constraintAnchor2, ConstraintAnchor constraintAnchor3, ConstraintAnchor constraintAnchor4, int i2) {
            this.mOrientation = i;
            this.mLeft = constraintAnchor;
            this.mTop = constraintAnchor2;
            this.mRight = constraintAnchor3;
            this.mBottom = constraintAnchor4;
            this.mPaddingLeft = Flow.this.mResolvedPaddingLeft;
            this.mPaddingTop = Flow.this.mPaddingTop;
            this.mPaddingRight = Flow.this.mResolvedPaddingRight;
            this.mPaddingBottom = Flow.this.mPaddingBottom;
            this.mMax = i2;
        }

        public final void add(ConstraintWidget constraintWidget) {
            int i = this.mOrientation;
            int i2 = this.mMax;
            ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
            Flow flow = Flow.this;
            if (i == 0) {
                int widgetWidth = flow.getWidgetWidth(constraintWidget, i2);
                if (constraintWidget.mListDimensionBehaviors[0] == dimensionBehaviour) {
                    this.mNbMatchConstraintsWidgets++;
                    widgetWidth = 0;
                }
                this.mWidth = widgetWidth + (constraintWidget.mVisibility != 8 ? flow.mHorizontalGap : 0) + this.mWidth;
                int widgetHeight = flow.getWidgetHeight(constraintWidget, this.mMax);
                if (this.mBiggest == null || this.mBiggestDimension < widgetHeight) {
                    this.mBiggest = constraintWidget;
                    this.mBiggestDimension = widgetHeight;
                    this.mHeight = widgetHeight;
                }
            } else {
                int widgetWidth2 = flow.getWidgetWidth(constraintWidget, i2);
                int widgetHeight2 = flow.getWidgetHeight(constraintWidget, this.mMax);
                if (constraintWidget.mListDimensionBehaviors[1] == dimensionBehaviour) {
                    this.mNbMatchConstraintsWidgets++;
                    widgetHeight2 = 0;
                }
                this.mHeight = widgetHeight2 + (constraintWidget.mVisibility != 8 ? flow.mVerticalGap : 0) + this.mHeight;
                if (this.mBiggest == null || this.mBiggestDimension < widgetWidth2) {
                    this.mBiggest = constraintWidget;
                    this.mBiggestDimension = widgetWidth2;
                    this.mWidth = widgetWidth2;
                }
            }
            this.mCount++;
        }

        /* JADX WARN: Code restructure failed: missing block: B:85:0x0103, code lost:
        
            if (r24 != false) goto L89;
         */
        /* JADX WARN: Code restructure failed: missing block: B:86:0x0105, code lost:
        
            r9 = 1.0f - r9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:92:0x0115, code lost:
        
            if (r24 != false) goto L89;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void createConstraints(int i, boolean z, boolean z2) {
            Flow flow;
            int i2;
            int i3;
            int i4;
            ConstraintWidget constraintWidget;
            boolean z3;
            int i5;
            int i6;
            char c;
            float f;
            int i7;
            float f2;
            int i8;
            int i9 = this.mCount;
            int i10 = 0;
            while (true) {
                flow = Flow.this;
                if (i10 >= i9 || (i8 = this.mStartIndex + i10) >= flow.mDisplayedWidgetsCount) {
                    break;
                }
                ConstraintWidget constraintWidget2 = flow.mDisplayedWidgets[i8];
                if (constraintWidget2 != null) {
                    constraintWidget2.resetAnchors();
                }
                i10++;
            }
            if (i9 == 0 || this.mBiggest == null) {
                return;
            }
            boolean z4 = z2 && i == 0;
            int i11 = -1;
            int i12 = -1;
            for (int i13 = 0; i13 < i9; i13++) {
                int i14 = this.mStartIndex + (z ? (i9 - 1) - i13 : i13);
                if (i14 >= flow.mDisplayedWidgetsCount) {
                    break;
                }
                ConstraintWidget constraintWidget3 = flow.mDisplayedWidgets[i14];
                if (constraintWidget3 != null && constraintWidget3.mVisibility == 0) {
                    if (i11 == -1) {
                        i11 = i13;
                    }
                    i12 = i13;
                }
            }
            int i15 = this.mOrientation;
            ConstraintWidget constraintWidget4 = this.mBiggest;
            if (i15 == 0) {
                constraintWidget4.mVerticalChainStyle = flow.mVerticalStyle;
                ConstraintAnchor constraintAnchor = constraintWidget4.mBottom;
                ConstraintAnchor constraintAnchor2 = constraintWidget4.mTop;
                int i16 = this.mPaddingTop;
                if (i > 0) {
                    i16 += flow.mVerticalGap;
                }
                constraintAnchor2.connect(this.mTop, i16);
                if (z2) {
                    constraintAnchor.connect(this.mBottom, this.mPaddingBottom);
                }
                if (i > 0) {
                    this.mTop.mOwner.mBottom.connect(constraintAnchor2, 0);
                }
                if (flow.mVerticalAlign == 3 && !constraintWidget4.mHasBaseline) {
                    for (int i17 = 0; i17 < i9; i17++) {
                        int i18 = this.mStartIndex + (z ? (i9 - 1) - i17 : i17);
                        if (i18 >= flow.mDisplayedWidgetsCount) {
                            break;
                        }
                        constraintWidget = flow.mDisplayedWidgets[i18];
                        if (constraintWidget.mHasBaseline) {
                            break;
                        }
                    }
                }
                constraintWidget = constraintWidget4;
                int i19 = 0;
                ConstraintWidget constraintWidget5 = null;
                while (i19 < i9) {
                    int i20 = z ? (i9 - 1) - i19 : i19;
                    int i21 = this.mStartIndex + i20;
                    if (i21 >= flow.mDisplayedWidgetsCount) {
                        return;
                    }
                    ConstraintWidget constraintWidget6 = flow.mDisplayedWidgets[i21];
                    if (constraintWidget6 == null) {
                        i6 = i9;
                        z3 = z4;
                        i5 = i12;
                        c = 3;
                    } else {
                        ConstraintAnchor constraintAnchor3 = constraintWidget6.mTop;
                        ConstraintAnchor constraintAnchor4 = constraintWidget6.mBottom;
                        ConstraintAnchor constraintAnchor5 = constraintWidget6.mLeft;
                        z3 = z4;
                        if (i19 == 0) {
                            i5 = i12;
                            constraintWidget6.connect(constraintAnchor5, this.mLeft, this.mPaddingLeft);
                        } else {
                            i5 = i12;
                        }
                        if (i20 == 0) {
                            int i22 = flow.mHorizontalStyle;
                            float f3 = flow.mHorizontalBias;
                            if (z) {
                                f3 = 1.0f - f3;
                            }
                            if (this.mStartIndex == 0) {
                                i7 = flow.mFirstHorizontalStyle;
                                f = f3;
                                if (i7 != -1) {
                                    f2 = flow.mFirstHorizontalBias;
                                }
                            } else {
                                f = f3;
                            }
                            if (!z2 || (i7 = flow.mLastHorizontalStyle) == -1) {
                                i7 = i22;
                                f2 = f;
                            } else {
                                f2 = flow.mLastHorizontalBias;
                            }
                            constraintWidget6.mHorizontalChainStyle = i7;
                            constraintWidget6.mHorizontalBiasPercent = f2;
                        }
                        if (i19 == i9 - 1) {
                            i6 = i9;
                            constraintWidget6.connect(constraintWidget6.mRight, this.mRight, this.mPaddingRight);
                        } else {
                            i6 = i9;
                        }
                        if (constraintWidget5 != null) {
                            ConstraintAnchor constraintAnchor6 = constraintWidget5.mRight;
                            constraintAnchor5.connect(constraintAnchor6, flow.mHorizontalGap);
                            if (i19 == i11) {
                                int i23 = this.mPaddingLeft;
                                if (constraintAnchor5.isConnected()) {
                                    constraintAnchor5.mGoneMargin = i23;
                                }
                            }
                            constraintAnchor6.connect(constraintAnchor5, 0);
                            if (i19 == i5 + 1) {
                                int i24 = this.mPaddingRight;
                                if (constraintAnchor6.isConnected()) {
                                    constraintAnchor6.mGoneMargin = i24;
                                }
                            }
                        }
                        if (constraintWidget6 != constraintWidget4) {
                            int i25 = flow.mVerticalAlign;
                            c = 3;
                            if (i25 == 3 && constraintWidget.mHasBaseline && constraintWidget6 != constraintWidget && constraintWidget6.mHasBaseline) {
                                constraintWidget6.mBaseline.connect(constraintWidget.mBaseline, 0);
                            } else if (i25 == 0) {
                                constraintAnchor3.connect(constraintAnchor2, 0);
                            } else if (i25 == 1) {
                                constraintAnchor4.connect(constraintAnchor, 0);
                            } else if (z3) {
                                constraintAnchor3.connect(this.mTop, this.mPaddingTop);
                                constraintAnchor4.connect(this.mBottom, this.mPaddingBottom);
                            } else {
                                constraintAnchor3.connect(constraintAnchor2, 0);
                                constraintAnchor4.connect(constraintAnchor, 0);
                            }
                        } else {
                            c = 3;
                        }
                        constraintWidget5 = constraintWidget6;
                    }
                    i19++;
                    z4 = z3;
                    i12 = i5;
                    i9 = i6;
                }
                return;
            }
            int i26 = i9;
            boolean z5 = z4;
            int i27 = i12;
            constraintWidget4.mHorizontalChainStyle = flow.mHorizontalStyle;
            ConstraintAnchor constraintAnchor7 = constraintWidget4.mLeft;
            ConstraintAnchor constraintAnchor8 = constraintWidget4.mRight;
            int i28 = this.mPaddingLeft;
            if (i > 0) {
                i28 += flow.mHorizontalGap;
            }
            if (z) {
                constraintAnchor8.connect(this.mRight, i28);
                if (z2) {
                    constraintAnchor7.connect(this.mLeft, this.mPaddingRight);
                }
                if (i > 0) {
                    this.mRight.mOwner.mLeft.connect(constraintAnchor8, 0);
                }
            } else {
                constraintAnchor7.connect(this.mLeft, i28);
                if (z2) {
                    constraintAnchor8.connect(this.mRight, this.mPaddingRight);
                }
                if (i > 0) {
                    this.mLeft.mOwner.mRight.connect(constraintAnchor7, 0);
                }
            }
            int i29 = 0;
            ConstraintWidget constraintWidget7 = null;
            while (true) {
                int i30 = i26;
                if (i29 >= i30 || (i2 = this.mStartIndex + i29) >= flow.mDisplayedWidgetsCount) {
                    return;
                }
                ConstraintWidget constraintWidget8 = flow.mDisplayedWidgets[i2];
                if (constraintWidget8 == null) {
                    i26 = i30;
                } else {
                    ConstraintAnchor constraintAnchor9 = constraintWidget8.mLeft;
                    ConstraintAnchor constraintAnchor10 = constraintWidget8.mTop;
                    ConstraintAnchor constraintAnchor11 = constraintWidget8.mRight;
                    if (i29 == 0) {
                        constraintWidget8.connect(constraintAnchor10, this.mTop, this.mPaddingTop);
                        int i31 = flow.mVerticalStyle;
                        float f4 = flow.mVerticalBias;
                        if (this.mStartIndex == 0) {
                            i4 = flow.mFirstVerticalStyle;
                            i26 = i30;
                            i3 = -1;
                            if (i4 != -1) {
                                f4 = flow.mFirstVerticalBias;
                                i31 = i4;
                                constraintWidget8.mVerticalChainStyle = i31;
                                constraintWidget8.mVerticalBiasPercent = f4;
                            }
                        } else {
                            i26 = i30;
                            i3 = -1;
                        }
                        if (z2 && (i4 = flow.mLastVerticalStyle) != i3) {
                            f4 = flow.mLastVerticalBias;
                            i31 = i4;
                        }
                        constraintWidget8.mVerticalChainStyle = i31;
                        constraintWidget8.mVerticalBiasPercent = f4;
                    } else {
                        i26 = i30;
                    }
                    if (i29 == i26 - 1) {
                        constraintWidget8.connect(constraintWidget8.mBottom, this.mBottom, this.mPaddingBottom);
                    }
                    if (constraintWidget7 != null) {
                        ConstraintAnchor constraintAnchor12 = constraintWidget7.mBottom;
                        constraintAnchor10.connect(constraintAnchor12, flow.mVerticalGap);
                        if (i29 == i11) {
                            int i32 = this.mPaddingTop;
                            if (constraintAnchor10.isConnected()) {
                                constraintAnchor10.mGoneMargin = i32;
                            }
                        }
                        constraintAnchor12.connect(constraintAnchor10, 0);
                        if (i29 == i27 + 1) {
                            int i33 = this.mPaddingBottom;
                            if (constraintAnchor12.isConnected()) {
                                constraintAnchor12.mGoneMargin = i33;
                            }
                        }
                    }
                    if (constraintWidget8 != constraintWidget4) {
                        int i34 = flow.mHorizontalAlign;
                        if (!z) {
                            if (i34 == 0) {
                                constraintAnchor9.connect(constraintAnchor7, 0);
                            } else if (i34 == 1) {
                                constraintAnchor11.connect(constraintAnchor8, 0);
                            } else if (i34 == 2) {
                                if (z5) {
                                    constraintAnchor9.connect(this.mLeft, this.mPaddingLeft);
                                    constraintAnchor11.connect(this.mRight, this.mPaddingRight);
                                } else {
                                    constraintAnchor9.connect(constraintAnchor7, 0);
                                    constraintAnchor11.connect(constraintAnchor8, 0);
                                }
                            }
                            constraintWidget7 = constraintWidget8;
                        } else if (i34 == 0) {
                            constraintAnchor11.connect(constraintAnchor8, 0);
                        } else if (i34 == 1) {
                            constraintAnchor9.connect(constraintAnchor7, 0);
                        } else if (i34 == 2) {
                            constraintAnchor9.connect(constraintAnchor7, 0);
                            constraintAnchor11.connect(constraintAnchor8, 0);
                        }
                    }
                    constraintWidget7 = constraintWidget8;
                }
                i29++;
            }
        }

        public final int getHeight() {
            int i = this.mOrientation;
            int i2 = this.mHeight;
            return i == 1 ? i2 - Flow.this.mVerticalGap : i2;
        }

        public final int getWidth() {
            int i = this.mOrientation;
            int i2 = this.mWidth;
            return i == 0 ? i2 - Flow.this.mHorizontalGap : i2;
        }

        public final void measureMatchConstraints(int i) {
            Flow flow;
            int i2;
            int i3 = this.mNbMatchConstraintsWidgets;
            if (i3 == 0) {
                return;
            }
            int i4 = this.mCount;
            int i5 = i / i3;
            int i6 = 0;
            while (true) {
                flow = Flow.this;
                if (i6 >= i4 || (i2 = this.mStartIndex + i6) >= flow.mDisplayedWidgetsCount) {
                    break;
                }
                ConstraintWidget constraintWidget = flow.mDisplayedWidgets[i2];
                int i7 = this.mOrientation;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.FIXED;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                if (i7 == 0) {
                    if (constraintWidget != null) {
                        ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr = constraintWidget.mListDimensionBehaviors;
                        if (dimensionBehaviourArr[0] == dimensionBehaviour2 && constraintWidget.mMatchConstraintDefaultWidth == 0) {
                            flow.measure(constraintWidget, dimensionBehaviour, i5, dimensionBehaviourArr[1], constraintWidget.getHeight());
                        }
                    }
                } else if (constraintWidget != null) {
                    ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr2 = constraintWidget.mListDimensionBehaviors;
                    if (dimensionBehaviourArr2[1] == dimensionBehaviour2 && constraintWidget.mMatchConstraintDefaultHeight == 0) {
                        int i8 = i5;
                        flow.measure(constraintWidget, dimensionBehaviourArr2[0], constraintWidget.getWidth(), dimensionBehaviour, i8);
                        i5 = i8;
                    }
                }
                i6++;
            }
            this.mWidth = 0;
            this.mHeight = 0;
            this.mBiggest = null;
            this.mBiggestDimension = 0;
            int i9 = this.mCount;
            for (int i10 = 0; i10 < i9; i10++) {
                int i11 = this.mStartIndex + i10;
                if (i11 >= flow.mDisplayedWidgetsCount) {
                    return;
                }
                ConstraintWidget constraintWidget2 = flow.mDisplayedWidgets[i11];
                if (this.mOrientation == 0) {
                    int width = constraintWidget2.getWidth();
                    int i12 = flow.mHorizontalGap;
                    if (constraintWidget2.mVisibility == 8) {
                        i12 = 0;
                    }
                    this.mWidth = width + i12 + this.mWidth;
                    int widgetHeight = flow.getWidgetHeight(constraintWidget2, this.mMax);
                    if (this.mBiggest == null || this.mBiggestDimension < widgetHeight) {
                        this.mBiggest = constraintWidget2;
                        this.mBiggestDimension = widgetHeight;
                        this.mHeight = widgetHeight;
                    }
                } else {
                    int widgetWidth = flow.getWidgetWidth(constraintWidget2, this.mMax);
                    int widgetHeight2 = flow.getWidgetHeight(constraintWidget2, this.mMax);
                    int i13 = flow.mVerticalGap;
                    if (constraintWidget2.mVisibility == 8) {
                        i13 = 0;
                    }
                    this.mHeight = widgetHeight2 + i13 + this.mHeight;
                    if (this.mBiggest == null || this.mBiggestDimension < widgetWidth) {
                        this.mBiggest = constraintWidget2;
                        this.mBiggestDimension = widgetWidth;
                        this.mWidth = widgetWidth;
                    }
                }
            }
        }

        public final void setup(int i, ConstraintAnchor constraintAnchor, ConstraintAnchor constraintAnchor2, ConstraintAnchor constraintAnchor3, ConstraintAnchor constraintAnchor4, int i2, int i3, int i4, int i5, int i6) {
            this.mOrientation = i;
            this.mLeft = constraintAnchor;
            this.mTop = constraintAnchor2;
            this.mRight = constraintAnchor3;
            this.mBottom = constraintAnchor4;
            this.mPaddingLeft = i2;
            this.mPaddingTop = i3;
            this.mPaddingRight = i4;
            this.mPaddingBottom = i5;
            this.mMax = i6;
        }
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public final void addToSolver(LinearSystem linearSystem, boolean z) {
        ConstraintWidget constraintWidget;
        float f;
        int i;
        super.addToSolver(linearSystem, z);
        ConstraintWidget constraintWidget2 = this.mParent;
        boolean z2 = constraintWidget2 != null && ((ConstraintWidgetContainer) constraintWidget2).mIsRtl;
        int i2 = this.mWrapMode;
        ArrayList arrayList = this.mChainList;
        if (i2 != 0) {
            if (i2 == 1) {
                int size = arrayList.size();
                int i3 = 0;
                while (i3 < size) {
                    ((WidgetsList) arrayList.get(i3)).createConstraints(i3, z2, i3 == size + (-1));
                    i3++;
                }
            } else if (i2 != 2) {
                if (i2 == 3) {
                    int size2 = arrayList.size();
                    int i4 = 0;
                    while (i4 < size2) {
                        ((WidgetsList) arrayList.get(i4)).createConstraints(i4, z2, i4 == size2 + (-1));
                        i4++;
                    }
                }
            } else if (this.mAlignedDimensions != null && this.mAlignedBiggestElementsInCols != null && this.mAlignedBiggestElementsInRows != null) {
                for (int i5 = 0; i5 < this.mDisplayedWidgetsCount; i5++) {
                    this.mDisplayedWidgets[i5].resetAnchors();
                }
                int[] iArr = this.mAlignedDimensions;
                int i6 = iArr[0];
                int i7 = iArr[1];
                float f2 = this.mHorizontalBias;
                ConstraintWidget constraintWidget3 = null;
                int i8 = 0;
                while (i8 < i6) {
                    if (z2) {
                        i = (i6 - i8) - 1;
                        f = 1.0f - this.mHorizontalBias;
                    } else {
                        f = f2;
                        i = i8;
                    }
                    ConstraintWidget constraintWidget4 = this.mAlignedBiggestElementsInCols[i];
                    if (constraintWidget4 != null) {
                        ConstraintAnchor constraintAnchor = constraintWidget4.mLeft;
                        if (constraintWidget4.mVisibility != 8) {
                            if (i8 == 0) {
                                constraintWidget4.connect(constraintAnchor, this.mLeft, this.mResolvedPaddingLeft);
                                constraintWidget4.mHorizontalChainStyle = this.mHorizontalStyle;
                                constraintWidget4.mHorizontalBiasPercent = f;
                            }
                            if (i8 == i6 - 1) {
                                constraintWidget4.connect(constraintWidget4.mRight, this.mRight, this.mResolvedPaddingRight);
                            }
                            if (i8 > 0 && constraintWidget3 != null) {
                                ConstraintAnchor constraintAnchor2 = constraintWidget3.mRight;
                                constraintWidget4.connect(constraintAnchor, constraintAnchor2, this.mHorizontalGap);
                                constraintWidget3.connect(constraintAnchor2, constraintAnchor, 0);
                            }
                            constraintWidget3 = constraintWidget4;
                        }
                    }
                    i8++;
                    f2 = f;
                }
                for (int i9 = 0; i9 < i7; i9++) {
                    ConstraintWidget constraintWidget5 = this.mAlignedBiggestElementsInRows[i9];
                    if (constraintWidget5 != null) {
                        ConstraintAnchor constraintAnchor3 = constraintWidget5.mTop;
                        if (constraintWidget5.mVisibility != 8) {
                            if (i9 == 0) {
                                constraintWidget5.connect(constraintAnchor3, this.mTop, this.mPaddingTop);
                                constraintWidget5.mVerticalChainStyle = this.mVerticalStyle;
                                constraintWidget5.mVerticalBiasPercent = this.mVerticalBias;
                            }
                            if (i9 == i7 - 1) {
                                constraintWidget5.connect(constraintWidget5.mBottom, this.mBottom, this.mPaddingBottom);
                            }
                            if (i9 > 0 && constraintWidget3 != null) {
                                ConstraintAnchor constraintAnchor4 = constraintWidget3.mBottom;
                                constraintWidget5.connect(constraintAnchor3, constraintAnchor4, this.mVerticalGap);
                                constraintWidget3.connect(constraintAnchor4, constraintAnchor3, 0);
                            }
                            constraintWidget3 = constraintWidget5;
                        }
                    }
                }
                for (int i10 = 0; i10 < i6; i10++) {
                    for (int i11 = 0; i11 < i7; i11++) {
                        int i12 = (i11 * i6) + i10;
                        if (this.mOrientation == 1) {
                            i12 = (i10 * i7) + i11;
                        }
                        ConstraintWidget[] constraintWidgetArr = this.mDisplayedWidgets;
                        if (i12 < constraintWidgetArr.length && (constraintWidget = constraintWidgetArr[i12]) != null && constraintWidget.mVisibility != 8) {
                            ConstraintWidget constraintWidget6 = this.mAlignedBiggestElementsInCols[i10];
                            ConstraintWidget constraintWidget7 = this.mAlignedBiggestElementsInRows[i11];
                            if (constraintWidget != constraintWidget6) {
                                constraintWidget.connect(constraintWidget.mLeft, constraintWidget6.mLeft, 0);
                                constraintWidget.connect(constraintWidget.mRight, constraintWidget6.mRight, 0);
                            }
                            if (constraintWidget != constraintWidget7) {
                                constraintWidget.connect(constraintWidget.mTop, constraintWidget7.mTop, 0);
                                constraintWidget.connect(constraintWidget.mBottom, constraintWidget7.mBottom, 0);
                            }
                        }
                    }
                }
            }
        } else if (arrayList.size() > 0) {
            ((WidgetsList) arrayList.get(0)).createConstraints(0, z2, true);
        }
        this.mNeedsCallFromSolver = false;
    }

    @Override // androidx.constraintlayout.core.widgets.HelperWidget, androidx.constraintlayout.core.widgets.ConstraintWidget
    public final void copy(ConstraintWidget constraintWidget, HashMap hashMap) {
        super.copy(constraintWidget, hashMap);
        Flow flow = (Flow) constraintWidget;
        this.mHorizontalStyle = flow.mHorizontalStyle;
        this.mVerticalStyle = flow.mVerticalStyle;
        this.mFirstHorizontalStyle = flow.mFirstHorizontalStyle;
        this.mFirstVerticalStyle = flow.mFirstVerticalStyle;
        this.mLastHorizontalStyle = flow.mLastHorizontalStyle;
        this.mLastVerticalStyle = flow.mLastVerticalStyle;
        this.mHorizontalBias = flow.mHorizontalBias;
        this.mVerticalBias = flow.mVerticalBias;
        this.mFirstHorizontalBias = flow.mFirstHorizontalBias;
        this.mFirstVerticalBias = flow.mFirstVerticalBias;
        this.mLastHorizontalBias = flow.mLastHorizontalBias;
        this.mLastVerticalBias = flow.mLastVerticalBias;
        this.mHorizontalGap = flow.mHorizontalGap;
        this.mVerticalGap = flow.mVerticalGap;
        this.mHorizontalAlign = flow.mHorizontalAlign;
        this.mVerticalAlign = flow.mVerticalAlign;
        this.mWrapMode = flow.mWrapMode;
        this.mMaxElementsWrap = flow.mMaxElementsWrap;
        this.mOrientation = flow.mOrientation;
    }

    public final int getWidgetHeight(ConstraintWidget constraintWidget, int i) {
        ConstraintWidget constraintWidget2;
        if (constraintWidget == null) {
            return 0;
        }
        if (constraintWidget.mListDimensionBehaviors[1] == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
            int i2 = constraintWidget.mMatchConstraintDefaultHeight;
            if (i2 == 0) {
                return 0;
            }
            if (i2 == 2) {
                int i3 = (int) (constraintWidget.mMatchConstraintPercentHeight * i);
                if (i3 != constraintWidget.getHeight()) {
                    constraintWidget.mMeasureRequested = true;
                    measure(constraintWidget, constraintWidget.mListDimensionBehaviors[0], constraintWidget.getWidth(), ConstraintWidget.DimensionBehaviour.FIXED, i3);
                }
                return i3;
            }
            constraintWidget2 = constraintWidget;
            if (i2 == 1) {
                return constraintWidget2.getHeight();
            }
            if (i2 == 3) {
                return (int) ((constraintWidget2.getWidth() * constraintWidget2.mDimensionRatio) + 0.5f);
            }
        } else {
            constraintWidget2 = constraintWidget;
        }
        return constraintWidget2.getHeight();
    }

    public final int getWidgetWidth(ConstraintWidget constraintWidget, int i) {
        ConstraintWidget constraintWidget2;
        if (constraintWidget == null) {
            return 0;
        }
        if (constraintWidget.mListDimensionBehaviors[0] == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
            int i2 = constraintWidget.mMatchConstraintDefaultWidth;
            if (i2 == 0) {
                return 0;
            }
            if (i2 == 2) {
                int i3 = (int) (constraintWidget.mMatchConstraintPercentWidth * i);
                if (i3 != constraintWidget.getWidth()) {
                    constraintWidget.mMeasureRequested = true;
                    measure(constraintWidget, ConstraintWidget.DimensionBehaviour.FIXED, i3, constraintWidget.mListDimensionBehaviors[1], constraintWidget.getHeight());
                }
                return i3;
            }
            constraintWidget2 = constraintWidget;
            if (i2 == 1) {
                return constraintWidget2.getWidth();
            }
            if (i2 == 3) {
                return (int) ((constraintWidget2.getHeight() * constraintWidget2.mDimensionRatio) + 0.5f);
            }
        } else {
            constraintWidget2 = constraintWidget;
        }
        return constraintWidget2.getWidth();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:80:0x06b9  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x06d0  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x06ef  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x06f2  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x06d3  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x06be  */
    @Override // androidx.constraintlayout.core.widgets.VirtualLayout
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void measure(int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        ConstraintWidget[] constraintWidgetArr;
        int i7;
        int i8;
        int i9;
        int[] iArr;
        int i10;
        WidgetsList widgetsList;
        char c;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        Object obj;
        ConstraintWidget constraintWidget;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20 = this.mWidgetsCount;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
        if (i20 > 0) {
            ConstraintWidget constraintWidget2 = this.mParent;
            BasicMeasure$Measurer basicMeasure$Measurer = constraintWidget2 != null ? ((ConstraintWidgetContainer) constraintWidget2).mMeasurer : null;
            if (basicMeasure$Measurer == null) {
                this.mMeasuredWidth = 0;
                this.mMeasuredHeight = 0;
                this.mNeedsCallFromSolver = false;
                return;
            }
            for (int i21 = 0; i21 < this.mWidgetsCount; i21++) {
                ConstraintWidget constraintWidget3 = this.mWidgets[i21];
                if (constraintWidget3 != null && !(constraintWidget3 instanceof Guideline)) {
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = constraintWidget3.getDimensionBehaviour(0);
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = constraintWidget3.getDimensionBehaviour(1);
                    if (dimensionBehaviour3 != dimensionBehaviour || constraintWidget3.mMatchConstraintDefaultWidth == 1 || dimensionBehaviour4 != dimensionBehaviour || constraintWidget3.mMatchConstraintDefaultHeight == 1) {
                        if (dimensionBehaviour3 == dimensionBehaviour) {
                            dimensionBehaviour3 = dimensionBehaviour2;
                        }
                        if (dimensionBehaviour4 == dimensionBehaviour) {
                            dimensionBehaviour4 = dimensionBehaviour2;
                        }
                        BasicMeasure$Measure basicMeasure$Measure = this.mMeasure;
                        basicMeasure$Measure.horizontalBehavior = dimensionBehaviour3;
                        basicMeasure$Measure.verticalBehavior = dimensionBehaviour4;
                        basicMeasure$Measure.horizontalDimension = constraintWidget3.getWidth();
                        basicMeasure$Measure.verticalDimension = constraintWidget3.getHeight();
                        basicMeasure$Measurer.measure(constraintWidget3, basicMeasure$Measure);
                        constraintWidget3.setWidth(basicMeasure$Measure.measuredWidth);
                        constraintWidget3.setHeight(basicMeasure$Measure.measuredHeight);
                        constraintWidget3.setBaselineDistance(basicMeasure$Measure.measuredBaseline);
                    }
                }
            }
        }
        int i22 = this.mResolvedPaddingLeft;
        int i23 = this.mResolvedPaddingRight;
        int i24 = this.mPaddingTop;
        int i25 = this.mPaddingBottom;
        int[] iArr2 = new int[2];
        int i26 = (i2 - i22) - i23;
        int i27 = this.mOrientation;
        if (i27 == 1) {
            i26 = (i4 - i24) - i25;
        }
        int i28 = i26;
        int i29 = this.mHorizontalStyle;
        if (i27 == 0) {
            if (i29 == -1) {
                this.mHorizontalStyle = 0;
            }
            if (this.mVerticalStyle == -1) {
                this.mVerticalStyle = 0;
            }
        } else {
            if (i29 == -1) {
                this.mHorizontalStyle = 0;
            }
            if (this.mVerticalStyle == -1) {
                this.mVerticalStyle = 0;
            }
        }
        ConstraintWidget[] constraintWidgetArr2 = this.mWidgets;
        int i30 = 0;
        int i31 = 0;
        int i32 = 0;
        while (true) {
            i5 = this.mWidgetsCount;
            i6 = i22;
            if (i30 >= i5) {
                break;
            }
            if (this.mWidgets[i30].mVisibility == 8) {
                i31++;
            }
            i30++;
            i22 = i6;
        }
        if (i31 > 0) {
            ConstraintWidget[] constraintWidgetArr3 = new ConstraintWidget[i5 - i31];
            int i33 = 0;
            int i34 = 0;
            while (i33 < this.mWidgetsCount) {
                ConstraintWidget constraintWidget4 = this.mWidgets[i33];
                ConstraintWidget[] constraintWidgetArr4 = constraintWidgetArr3;
                if (constraintWidget4.mVisibility != 8) {
                    constraintWidgetArr4[i34] = constraintWidget4;
                    i34++;
                }
                i33++;
                constraintWidgetArr3 = constraintWidgetArr4;
            }
            i5 = i34;
            constraintWidgetArr = constraintWidgetArr3;
        } else {
            constraintWidgetArr = constraintWidgetArr2;
        }
        this.mDisplayedWidgets = constraintWidgetArr;
        this.mDisplayedWidgetsCount = i5;
        int i35 = this.mWrapMode;
        ArrayList arrayList = this.mChainList;
        if (i35 == 0) {
            i7 = i23;
            i8 = i24;
            i9 = i25;
            iArr = iArr2;
            i10 = i6;
            int i36 = this.mOrientation;
            if (i5 != 0) {
                if (arrayList.size() == 0) {
                    widgetsList = new WidgetsList(i36, this.mLeft, this.mTop, this.mRight, this.mBottom, i28);
                    arrayList.add(widgetsList);
                } else {
                    WidgetsList widgetsList2 = (WidgetsList) arrayList.get(0);
                    widgetsList2.mBiggestDimension = 0;
                    widgetsList2.mBiggest = null;
                    widgetsList2.mWidth = 0;
                    widgetsList2.mHeight = 0;
                    widgetsList2.mStartIndex = 0;
                    widgetsList2.mCount = 0;
                    widgetsList2.mNbMatchConstraintsWidgets = 0;
                    widgetsList2.setup(i36, this.mLeft, this.mTop, this.mRight, this.mBottom, this.mResolvedPaddingLeft, this.mPaddingTop, this.mResolvedPaddingRight, this.mPaddingBottom, i28);
                    widgetsList = widgetsList2;
                }
                for (int i37 = 0; i37 < i5; i37++) {
                    widgetsList.add(constraintWidgetArr[i37]);
                }
                i32 = 0;
                iArr[0] = widgetsList.getWidth();
                c = 1;
                iArr[1] = widgetsList.getHeight();
                int i38 = iArr[i32] + i10 + i7;
                int i39 = iArr[c] + i8 + i9;
                if (i != 1073741824) {
                }
                i11 = i3;
                if (i11 == 1073741824) {
                }
                this.mMeasuredWidth = i38;
                this.mMeasuredHeight = i39;
                setWidth(i38);
                setHeight(i39);
                this.mNeedsCallFromSolver = this.mWidgetsCount > 0 ? c : i32;
            }
            c = 1;
            int i382 = iArr[i32] + i10 + i7;
            int i392 = iArr[c] + i8 + i9;
            if (i != 1073741824) {
            }
            i11 = i3;
            if (i11 == 1073741824) {
            }
            this.mMeasuredWidth = i382;
            this.mMeasuredHeight = i392;
            setWidth(i382);
            setHeight(i392);
            this.mNeedsCallFromSolver = this.mWidgetsCount > 0 ? c : i32;
        }
        ConstraintAnchor constraintAnchor = this.mTop;
        ConstraintAnchor constraintAnchor2 = this.mLeft;
        ConstraintAnchor constraintAnchor3 = this.mRight;
        ConstraintAnchor constraintAnchor4 = this.mBottom;
        if (i35 == 1) {
            i7 = i23;
            i8 = i24;
            i9 = i25;
            iArr = iArr2;
            i10 = i6;
            int i40 = this.mOrientation;
            if (i5 != 0) {
                arrayList.clear();
                WidgetsList widgetsList3 = new WidgetsList(i40, this.mLeft, this.mTop, this.mRight, this.mBottom, i28);
                arrayList.add(widgetsList3);
                if (i40 == 0) {
                    i12 = 0;
                    int i41 = 0;
                    int i42 = 0;
                    while (i42 < i5) {
                        ConstraintWidget constraintWidget5 = constraintWidgetArr[i42];
                        int widgetWidth = getWidgetWidth(constraintWidget5, i28);
                        if (constraintWidget5.mListDimensionBehaviors[0] == dimensionBehaviour) {
                            i12++;
                        }
                        int i43 = i12;
                        boolean z = (i41 == i28 || (this.mHorizontalGap + i41) + widgetWidth > i28) && widgetsList3.mBiggest != null;
                        if (!z && i42 > 0 && (i14 = this.mMaxElementsWrap) > 0 && i42 % i14 == 0) {
                            z = true;
                        }
                        if (z) {
                            widgetsList3 = new WidgetsList(i40, this.mLeft, this.mTop, this.mRight, this.mBottom, i28);
                            widgetsList3.mStartIndex = i42;
                            arrayList.add(widgetsList3);
                        } else if (i42 > 0) {
                            i41 = this.mHorizontalGap + widgetWidth + i41;
                            widgetsList3.add(constraintWidget5);
                            i42++;
                            i12 = i43;
                        }
                        i41 = widgetWidth;
                        widgetsList3.add(constraintWidget5);
                        i42++;
                        i12 = i43;
                    }
                } else {
                    i12 = 0;
                    int i44 = 0;
                    int i45 = 0;
                    while (i45 < i5) {
                        ConstraintWidget constraintWidget6 = constraintWidgetArr[i45];
                        int widgetHeight = getWidgetHeight(constraintWidget6, i28);
                        if (constraintWidget6.mListDimensionBehaviors[1] == dimensionBehaviour) {
                            i12++;
                        }
                        int i46 = i12;
                        boolean z2 = (i44 == i28 || (this.mVerticalGap + i44) + widgetHeight > i28) && widgetsList3.mBiggest != null;
                        if (!z2 && i45 > 0 && (i13 = this.mMaxElementsWrap) > 0 && i45 % i13 == 0) {
                            z2 = true;
                        }
                        if (z2) {
                            widgetsList3 = new WidgetsList(i40, this.mLeft, this.mTop, this.mRight, this.mBottom, i28);
                            widgetsList3.mStartIndex = i45;
                            arrayList.add(widgetsList3);
                        } else if (i45 > 0) {
                            i44 = this.mVerticalGap + widgetHeight + i44;
                            widgetsList3.add(constraintWidget6);
                            i45++;
                            i12 = i46;
                        }
                        i44 = widgetHeight;
                        widgetsList3.add(constraintWidget6);
                        i45++;
                        i12 = i46;
                    }
                }
                int size = arrayList.size();
                int i47 = this.mResolvedPaddingLeft;
                int i48 = this.mPaddingTop;
                int i49 = this.mResolvedPaddingRight;
                int i50 = this.mPaddingBottom;
                ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr = this.mListDimensionBehaviors;
                boolean z3 = dimensionBehaviourArr[0] == dimensionBehaviour2 || dimensionBehaviourArr[1] == dimensionBehaviour2;
                if (i12 > 0 && z3) {
                    for (int i51 = 0; i51 < size; i51++) {
                        WidgetsList widgetsList4 = (WidgetsList) arrayList.get(i51);
                        if (i40 == 0) {
                            widgetsList4.measureMatchConstraints(i28 - widgetsList4.getWidth());
                        } else {
                            widgetsList4.measureMatchConstraints(i28 - widgetsList4.getHeight());
                        }
                    }
                }
                int i52 = i47;
                int i53 = i48;
                int i54 = i49;
                int i55 = i50;
                ConstraintAnchor constraintAnchor5 = constraintAnchor;
                ConstraintAnchor constraintAnchor6 = constraintAnchor2;
                int i56 = 0;
                int i57 = 0;
                ConstraintAnchor constraintAnchor7 = constraintAnchor3;
                ConstraintAnchor constraintAnchor8 = constraintAnchor4;
                for (int i58 = 0; i58 < size; i58++) {
                    WidgetsList widgetsList5 = (WidgetsList) arrayList.get(i58);
                    if (i40 == 0) {
                        if (i58 < size - 1) {
                            constraintAnchor8 = ((WidgetsList) arrayList.get(i58 + 1)).mBiggest.mTop;
                            i55 = 0;
                        } else {
                            i55 = this.mPaddingBottom;
                            constraintAnchor8 = constraintAnchor4;
                        }
                        ConstraintAnchor constraintAnchor9 = widgetsList5.mBiggest.mBottom;
                        widgetsList5.setup(i40, constraintAnchor6, constraintAnchor5, constraintAnchor7, constraintAnchor8, i52, i53, i54, i55, i28);
                        i56 = Math.max(i56, widgetsList5.getWidth());
                        int height = widgetsList5.getHeight() + i57;
                        if (i58 > 0) {
                            height += this.mVerticalGap;
                        }
                        i57 = height;
                        constraintAnchor5 = constraintAnchor9;
                        i53 = 0;
                    } else {
                        if (i58 < size - 1) {
                            constraintAnchor7 = ((WidgetsList) arrayList.get(i58 + 1)).mBiggest.mLeft;
                            i54 = 0;
                        } else {
                            i54 = this.mResolvedPaddingRight;
                            constraintAnchor7 = constraintAnchor3;
                        }
                        ConstraintAnchor constraintAnchor10 = widgetsList5.mBiggest.mRight;
                        widgetsList5.setup(i40, constraintAnchor6, constraintAnchor5, constraintAnchor7, constraintAnchor8, i52, i53, i54, i55, i28);
                        int width = widgetsList5.getWidth() + i56;
                        int max = Math.max(i57, widgetsList5.getHeight());
                        if (i58 > 0) {
                            width += this.mHorizontalGap;
                        }
                        i57 = max;
                        i56 = width;
                        constraintAnchor6 = constraintAnchor10;
                        i52 = 0;
                    }
                }
                iArr[0] = i56;
                iArr[1] = i57;
            }
        } else {
            if (i35 == 2) {
                i7 = i23;
                i8 = i24;
                i9 = i25;
                iArr = iArr2;
                i10 = i6;
                int i59 = this.mOrientation;
                int i60 = this.mMaxElementsWrap;
                if (i59 == 0) {
                    if (i60 <= 0) {
                        int i61 = 0;
                        i15 = 0;
                        for (int i62 = 0; i62 < i5; i62++) {
                            if (i62 > 0) {
                                i61 += this.mHorizontalGap;
                            }
                            ConstraintWidget constraintWidget7 = constraintWidgetArr[i62];
                            if (constraintWidget7 != null) {
                                int widgetWidth2 = getWidgetWidth(constraintWidget7, i28) + i61;
                                if (widgetWidth2 > i28) {
                                    break;
                                }
                                i15++;
                                i61 = widgetWidth2;
                            }
                        }
                    } else {
                        i15 = i60;
                    }
                    i60 = 0;
                } else {
                    if (i60 <= 0) {
                        int i63 = 0;
                        int i64 = 0;
                        for (int i65 = 0; i65 < i5; i65++) {
                            if (i65 > 0) {
                                i63 += this.mVerticalGap;
                            }
                            ConstraintWidget constraintWidget8 = constraintWidgetArr[i65];
                            if (constraintWidget8 != null) {
                                int widgetHeight2 = getWidgetHeight(constraintWidget8, i28) + i63;
                                if (widgetHeight2 > i28) {
                                    break;
                                }
                                i64++;
                                i63 = widgetHeight2;
                            }
                        }
                        i60 = i64;
                    }
                    i15 = 0;
                }
                if (this.mAlignedDimensions == null) {
                    this.mAlignedDimensions = new int[2];
                }
                boolean z4 = (i60 == 0 && i59 == 1) || (i15 == 0 && i59 == 0);
                while (!z4) {
                    if (i59 == 0) {
                        i60 = (int) Math.ceil(i5 / i15);
                    } else {
                        i15 = (int) Math.ceil(i5 / i60);
                    }
                    ConstraintWidget[] constraintWidgetArr5 = this.mAlignedBiggestElementsInCols;
                    if (constraintWidgetArr5 == null || constraintWidgetArr5.length < i15) {
                        obj = null;
                        this.mAlignedBiggestElementsInCols = new ConstraintWidget[i15];
                    } else {
                        obj = null;
                        Arrays.fill(constraintWidgetArr5, (Object) null);
                    }
                    ConstraintWidget[] constraintWidgetArr6 = this.mAlignedBiggestElementsInRows;
                    if (constraintWidgetArr6 == null || constraintWidgetArr6.length < i60) {
                        this.mAlignedBiggestElementsInRows = new ConstraintWidget[i60];
                    } else {
                        Arrays.fill(constraintWidgetArr6, obj);
                    }
                    for (int i66 = 0; i66 < i15; i66++) {
                        for (int i67 = 0; i67 < i60; i67++) {
                            int i68 = (i67 * i15) + i66;
                            if (i59 == 1) {
                                i68 = (i66 * i60) + i67;
                            }
                            if (i68 < constraintWidgetArr.length && (constraintWidget = constraintWidgetArr[i68]) != null) {
                                int widgetWidth3 = getWidgetWidth(constraintWidget, i28);
                                ConstraintWidget constraintWidget9 = this.mAlignedBiggestElementsInCols[i66];
                                if (constraintWidget9 == null || constraintWidget9.getWidth() < widgetWidth3) {
                                    this.mAlignedBiggestElementsInCols[i66] = constraintWidget;
                                }
                                int widgetHeight3 = getWidgetHeight(constraintWidget, i28);
                                ConstraintWidget constraintWidget10 = this.mAlignedBiggestElementsInRows[i67];
                                if (constraintWidget10 == null || constraintWidget10.getHeight() < widgetHeight3) {
                                    this.mAlignedBiggestElementsInRows[i67] = constraintWidget;
                                }
                            }
                        }
                    }
                    int i69 = 0;
                    for (int i70 = 0; i70 < i15; i70++) {
                        ConstraintWidget constraintWidget11 = this.mAlignedBiggestElementsInCols[i70];
                        if (constraintWidget11 != null) {
                            if (i70 > 0) {
                                i69 += this.mHorizontalGap;
                            }
                            i69 = getWidgetWidth(constraintWidget11, i28) + i69;
                        }
                    }
                    int i71 = 0;
                    for (int i72 = 0; i72 < i60; i72++) {
                        ConstraintWidget constraintWidget12 = this.mAlignedBiggestElementsInRows[i72];
                        if (constraintWidget12 != null) {
                            if (i72 > 0) {
                                i71 += this.mVerticalGap;
                            }
                            i71 = getWidgetHeight(constraintWidget12, i28) + i71;
                        }
                    }
                    iArr[0] = i69;
                    iArr[1] = i71;
                    if (i59 == 0) {
                        if (i69 > i28 && i15 > 1) {
                            i15--;
                        }
                        z4 = true;
                    } else {
                        if (i71 > i28 && i60 > 1) {
                            i60--;
                        }
                        z4 = true;
                    }
                }
                int[] iArr3 = this.mAlignedDimensions;
                iArr3[0] = i15;
                iArr3[1] = i60;
                c = 1;
                int i3822 = iArr[i32] + i10 + i7;
                int i3922 = iArr[c] + i8 + i9;
                if (i != 1073741824) {
                    i3822 = i2;
                } else {
                    if (i != Integer.MIN_VALUE) {
                        i11 = i3;
                        if (i != 0) {
                            i3822 = i32;
                        }
                        if (i11 == 1073741824) {
                            i3922 = i4;
                        } else if (i11 == Integer.MIN_VALUE) {
                            i3922 = Math.min(i3922, i4);
                        } else if (i11 != 0) {
                            i3922 = i32;
                        }
                        this.mMeasuredWidth = i3822;
                        this.mMeasuredHeight = i3922;
                        setWidth(i3822);
                        setHeight(i3922);
                        this.mNeedsCallFromSolver = this.mWidgetsCount > 0 ? c : i32;
                    }
                    i3822 = Math.min(i3822, i2);
                }
                i11 = i3;
                if (i11 == 1073741824) {
                }
                this.mMeasuredWidth = i3822;
                this.mMeasuredHeight = i3922;
                setWidth(i3822);
                setHeight(i3922);
                this.mNeedsCallFromSolver = this.mWidgetsCount > 0 ? c : i32;
            }
            if (i35 == 3) {
                int i73 = this.mOrientation;
                if (i5 != 0) {
                    arrayList.clear();
                    iArr = iArr2;
                    i9 = i25;
                    i10 = i6;
                    i7 = i23;
                    i8 = i24;
                    WidgetsList widgetsList6 = new WidgetsList(i73, this.mLeft, this.mTop, this.mRight, this.mBottom, i28);
                    arrayList.add(widgetsList6);
                    if (i73 == 0) {
                        int i74 = 0;
                        int i75 = 0;
                        i16 = 0;
                        int i76 = 0;
                        while (i74 < i5) {
                            i75++;
                            ConstraintWidget constraintWidget13 = constraintWidgetArr[i74];
                            int widgetWidth4 = getWidgetWidth(constraintWidget13, i28);
                            int i77 = i73;
                            if (constraintWidget13.mListDimensionBehaviors[0] == dimensionBehaviour) {
                                i16++;
                            }
                            int i78 = i16;
                            boolean z5 = (i76 == i28 || (this.mHorizontalGap + i76) + widgetWidth4 > i28) && widgetsList6.mBiggest != null;
                            if (!z5 && i74 > 0 && (i19 = this.mMaxElementsWrap) > 0 && i75 > i19) {
                                z5 = true;
                            }
                            if (z5) {
                                i18 = i74;
                                i73 = i77;
                                widgetsList6 = new WidgetsList(i73, this.mLeft, this.mTop, this.mRight, this.mBottom, i28);
                                widgetsList6.mStartIndex = i18;
                                arrayList.add(widgetsList6);
                                i76 = widgetWidth4;
                                i75 = 1;
                            } else {
                                i18 = i74;
                                i73 = i77;
                                i76 = i18 > 0 ? this.mHorizontalGap + widgetWidth4 + i76 : widgetWidth4;
                            }
                            widgetsList6.add(constraintWidget13);
                            i74 = i18 + 1;
                            i16 = i78;
                        }
                    } else {
                        int i79 = 0;
                        int i80 = 0;
                        int i81 = 0;
                        int i82 = 0;
                        while (i82 < i5) {
                            i79++;
                            ConstraintWidget constraintWidget14 = constraintWidgetArr[i82];
                            int widgetHeight4 = getWidgetHeight(constraintWidget14, i28);
                            if (constraintWidget14.mListDimensionBehaviors[1] == dimensionBehaviour) {
                                i80++;
                            }
                            int i83 = i80;
                            boolean z6 = (i81 == i28 || (this.mVerticalGap + i81) + widgetHeight4 > i28) && widgetsList6.mBiggest != null;
                            if (!z6 && i82 > 0 && (i17 = this.mMaxElementsWrap) > 0 && i79 > i17) {
                                z6 = true;
                            }
                            if (z6) {
                                widgetsList6 = new WidgetsList(i73, this.mLeft, this.mTop, this.mRight, this.mBottom, i28);
                                widgetsList6.mStartIndex = i82;
                                arrayList.add(widgetsList6);
                                i81 = widgetHeight4;
                                i79 = 1;
                            } else {
                                i81 = i82 > 0 ? this.mVerticalGap + widgetHeight4 + i81 : widgetHeight4;
                            }
                            widgetsList6.add(constraintWidget14);
                            i82++;
                            i80 = i83;
                        }
                        i16 = i80;
                    }
                    int size2 = arrayList.size();
                    int i84 = this.mResolvedPaddingLeft;
                    int i85 = this.mPaddingTop;
                    int i86 = this.mResolvedPaddingRight;
                    int i87 = this.mPaddingBottom;
                    ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr2 = this.mListDimensionBehaviors;
                    boolean z7 = dimensionBehaviourArr2[0] == dimensionBehaviour2 || dimensionBehaviourArr2[1] == dimensionBehaviour2;
                    if (i16 > 0 && z7) {
                        for (int i88 = 0; i88 < size2; i88++) {
                            WidgetsList widgetsList7 = (WidgetsList) arrayList.get(i88);
                            if (i73 == 0) {
                                widgetsList7.measureMatchConstraints(i28 - widgetsList7.getWidth());
                            } else {
                                widgetsList7.measureMatchConstraints(i28 - widgetsList7.getHeight());
                            }
                        }
                    }
                    int i89 = i84;
                    int i90 = i85;
                    int i91 = i86;
                    int i92 = i87;
                    ConstraintAnchor constraintAnchor11 = constraintAnchor;
                    ConstraintAnchor constraintAnchor12 = constraintAnchor2;
                    int i93 = 0;
                    int i94 = 0;
                    ConstraintAnchor constraintAnchor13 = constraintAnchor3;
                    ConstraintAnchor constraintAnchor14 = constraintAnchor4;
                    for (int i95 = 0; i95 < size2; i95++) {
                        WidgetsList widgetsList8 = (WidgetsList) arrayList.get(i95);
                        if (i73 == 0) {
                            if (i95 < size2 - 1) {
                                constraintAnchor14 = ((WidgetsList) arrayList.get(i95 + 1)).mBiggest.mTop;
                                i92 = 0;
                            } else {
                                i92 = this.mPaddingBottom;
                                constraintAnchor14 = constraintAnchor4;
                            }
                            ConstraintAnchor constraintAnchor15 = widgetsList8.mBiggest.mBottom;
                            widgetsList8.setup(i73, constraintAnchor12, constraintAnchor11, constraintAnchor13, constraintAnchor14, i89, i90, i91, i92, i28);
                            i93 = Math.max(i93, widgetsList8.getWidth());
                            int height2 = widgetsList8.getHeight() + i94;
                            if (i95 > 0) {
                                height2 += this.mVerticalGap;
                            }
                            i94 = height2;
                            constraintAnchor11 = constraintAnchor15;
                            i90 = 0;
                        } else {
                            if (i95 < size2 - 1) {
                                constraintAnchor13 = ((WidgetsList) arrayList.get(i95 + 1)).mBiggest.mLeft;
                                i91 = 0;
                            } else {
                                i91 = this.mResolvedPaddingRight;
                                constraintAnchor13 = constraintAnchor3;
                            }
                            ConstraintAnchor constraintAnchor16 = widgetsList8.mBiggest.mRight;
                            widgetsList8.setup(i73, constraintAnchor12, constraintAnchor11, constraintAnchor13, constraintAnchor14, i89, i90, i91, i92, i28);
                            int width2 = widgetsList8.getWidth() + i93;
                            int max2 = Math.max(i94, widgetsList8.getHeight());
                            if (i95 > 0) {
                                width2 += this.mHorizontalGap;
                            }
                            i94 = max2;
                            i93 = width2;
                            constraintAnchor12 = constraintAnchor16;
                            i89 = 0;
                        }
                    }
                    iArr[0] = i93;
                    iArr[1] = i94;
                }
            }
            i7 = i23;
            i8 = i24;
            i9 = i25;
            iArr = iArr2;
            i10 = i6;
        }
        c = 1;
        int i38222 = iArr[i32] + i10 + i7;
        int i39222 = iArr[c] + i8 + i9;
        if (i != 1073741824) {
        }
        i11 = i3;
        if (i11 == 1073741824) {
        }
        this.mMeasuredWidth = i38222;
        this.mMeasuredHeight = i39222;
        setWidth(i38222);
        setHeight(i39222);
        this.mNeedsCallFromSolver = this.mWidgetsCount > 0 ? c : i32;
    }
}
