package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure$Measure;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure$Measurer;

/* loaded from: classes3.dex */
public abstract class VirtualLayout extends HelperWidget {
    public int mPaddingTop = 0;
    public int mPaddingBottom = 0;
    public int mPaddingStart = 0;
    public int mPaddingEnd = 0;
    public int mResolvedPaddingLeft = 0;
    public int mResolvedPaddingRight = 0;
    public boolean mNeedsCallFromSolver = false;
    public int mMeasuredWidth = 0;
    public int mMeasuredHeight = 0;
    public final BasicMeasure$Measure mMeasure = new BasicMeasure$Measure();
    public BasicMeasure$Measurer mMeasurer = null;

    public abstract void measure(int i, int i2, int i3, int i4);

    public final void measure(ConstraintWidget constraintWidget, ConstraintWidget.DimensionBehaviour dimensionBehaviour, int i, ConstraintWidget.DimensionBehaviour dimensionBehaviour2, int i2) {
        BasicMeasure$Measurer basicMeasure$Measurer;
        ConstraintWidget constraintWidget2;
        while (true) {
            basicMeasure$Measurer = this.mMeasurer;
            if (basicMeasure$Measurer != null || (constraintWidget2 = this.mParent) == null) {
                break;
            } else {
                this.mMeasurer = ((ConstraintWidgetContainer) constraintWidget2).mMeasurer;
            }
        }
        BasicMeasure$Measure basicMeasure$Measure = this.mMeasure;
        basicMeasure$Measure.horizontalBehavior = dimensionBehaviour;
        basicMeasure$Measure.verticalBehavior = dimensionBehaviour2;
        basicMeasure$Measure.horizontalDimension = i;
        basicMeasure$Measure.verticalDimension = i2;
        basicMeasure$Measurer.measure(constraintWidget, basicMeasure$Measure);
        constraintWidget.setWidth(basicMeasure$Measure.measuredWidth);
        constraintWidget.setHeight(basicMeasure$Measure.measuredHeight);
        constraintWidget.mHasBaseline = basicMeasure$Measure.measuredHasBaseline;
        constraintWidget.setBaselineDistance(basicMeasure$Measure.measuredBaseline);
    }

    @Override // androidx.constraintlayout.core.widgets.HelperWidget
    public final void updateConstraints() {
        for (int i = 0; i < this.mWidgetsCount; i++) {
            ConstraintWidget constraintWidget = this.mWidgets[i];
            if (constraintWidget != null) {
                constraintWidget.mInVirtualLayout = true;
            }
        }
    }
}
