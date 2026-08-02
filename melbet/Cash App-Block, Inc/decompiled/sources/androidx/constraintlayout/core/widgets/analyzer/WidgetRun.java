package androidx.constraintlayout.core.widgets.analyzer;

import androidx.camera.core.CameraSelector$$ExternalSyntheticOutline0;
import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;

/* loaded from: classes3.dex */
public abstract class WidgetRun implements Dependency {
    public ConstraintWidget.DimensionBehaviour mDimensionBehavior;
    public RunGroup mRunGroup;
    public ConstraintWidget mWidget;
    public int matchConstraintsType;
    public final DimensionDependency mDimension = new DimensionDependency(this);
    public int orientation = 0;
    public boolean mResolved = false;
    public final DependencyNode start = new DependencyNode(this);
    public final DependencyNode end = new DependencyNode(this);
    public int mRunType = 1;

    public WidgetRun(ConstraintWidget constraintWidget) {
        this.mWidget = constraintWidget;
    }

    public static DependencyNode getTarget(ConstraintAnchor constraintAnchor) {
        ConstraintAnchor constraintAnchor2 = constraintAnchor.mTarget;
        if (constraintAnchor2 == null) {
            return null;
        }
        ConstraintWidget constraintWidget = constraintAnchor2.mOwner;
        int ordinal = CameraSelector$$ExternalSyntheticOutline0.ordinal(constraintAnchor2.mType);
        if (ordinal == 1) {
            return constraintWidget.mHorizontalRun.start;
        }
        if (ordinal == 2) {
            return constraintWidget.mVerticalRun.start;
        }
        if (ordinal == 3) {
            return constraintWidget.mHorizontalRun.end;
        }
        if (ordinal == 4) {
            return constraintWidget.mVerticalRun.end;
        }
        if (ordinal != 5) {
            return null;
        }
        return constraintWidget.mVerticalRun.baseline;
    }

    public final void addTarget(DependencyNode dependencyNode, DependencyNode dependencyNode2, int i, DimensionDependency dimensionDependency) {
        dependencyNode.mTargets.add(dependencyNode2);
        dependencyNode.mTargets.add(this.mDimension);
        dependencyNode.mMarginFactor = i;
        dependencyNode.mMarginDependency = dimensionDependency;
        dependencyNode2.mDependencies.add(dependencyNode);
        dimensionDependency.mDependencies.add(dependencyNode);
    }

    public abstract void apply();

    public abstract void applyToWidget();

    public abstract void clear();

    public final int getLimitedDimension(int i, int i2) {
        ConstraintWidget constraintWidget = this.mWidget;
        if (i2 == 0) {
            int i3 = constraintWidget.mMatchConstraintMaxWidth;
            int max = Math.max(constraintWidget.mMatchConstraintMinWidth, i);
            if (i3 > 0) {
                max = Math.min(i3, i);
            }
            if (max != i) {
                return max;
            }
        } else {
            int i4 = constraintWidget.mMatchConstraintMaxHeight;
            int max2 = Math.max(constraintWidget.mMatchConstraintMinHeight, i);
            if (i4 > 0) {
                max2 = Math.min(i4, i);
            }
            if (max2 != i) {
                return max2;
            }
        }
        return i;
    }

    public long getWrapDimension() {
        if (this.mDimension.resolved) {
            return r2.value;
        }
        return 0L;
    }

    public abstract boolean supportsWrapComputation();

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0053, code lost:
    
        if (r10.matchConstraintsType == 3) goto L51;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void updateRunCenter(ConstraintAnchor constraintAnchor, ConstraintAnchor constraintAnchor2, int i) {
        DependencyNode target = getTarget(constraintAnchor);
        DependencyNode target2 = getTarget(constraintAnchor2);
        if (target.resolved && target2.resolved) {
            int margin = constraintAnchor.getMargin() + target.value;
            int margin2 = target2.value - constraintAnchor2.getMargin();
            int i2 = margin2 - margin;
            DimensionDependency dimensionDependency = this.mDimension;
            if (!dimensionDependency.resolved) {
                ConstraintWidget.DimensionBehaviour dimensionBehaviour = this.mDimensionBehavior;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                if (dimensionBehaviour == dimensionBehaviour2) {
                    int i3 = this.matchConstraintsType;
                    if (i3 == 0) {
                        dimensionDependency.resolve(getLimitedDimension(i2, i));
                    } else if (i3 == 1) {
                        dimensionDependency.resolve(Math.min(getLimitedDimension(dimensionDependency.wrapValue, i), i2));
                    } else if (i3 == 2) {
                        ConstraintWidget constraintWidget = this.mWidget;
                        ConstraintWidget constraintWidget2 = constraintWidget.mParent;
                        if (constraintWidget2 != null) {
                            if ((i == 0 ? constraintWidget2.mHorizontalRun : constraintWidget2.mVerticalRun).mDimension.resolved) {
                                dimensionDependency.resolve(getLimitedDimension((int) ((r6.value * (i == 0 ? constraintWidget.mMatchConstraintPercentWidth : constraintWidget.mMatchConstraintPercentHeight)) + 0.5f), i));
                            }
                        }
                    } else if (i3 == 3) {
                        ConstraintWidget constraintWidget3 = this.mWidget;
                        WidgetRun widgetRun = constraintWidget3.mHorizontalRun;
                        if (widgetRun.mDimensionBehavior == dimensionBehaviour2 && widgetRun.matchConstraintsType == 3) {
                            VerticalWidgetRun verticalWidgetRun = constraintWidget3.mVerticalRun;
                            if (verticalWidgetRun.mDimensionBehavior == dimensionBehaviour2) {
                            }
                        }
                        if (i == 0) {
                            widgetRun = constraintWidget3.mVerticalRun;
                        }
                        DimensionDependency dimensionDependency2 = widgetRun.mDimension;
                        if (dimensionDependency2.resolved) {
                            float f = constraintWidget3.mDimensionRatio;
                            int i4 = dimensionDependency2.value;
                            dimensionDependency.resolve(i == 1 ? (int) ((i4 / f) + 0.5f) : (int) ((f * i4) + 0.5f));
                        }
                    }
                }
            }
            if (dimensionDependency.resolved) {
                int i5 = dimensionDependency.value;
                DependencyNode dependencyNode = this.end;
                DependencyNode dependencyNode2 = this.start;
                if (i5 == i2) {
                    dependencyNode2.resolve(margin);
                    dependencyNode.resolve(margin2);
                    return;
                }
                ConstraintWidget constraintWidget4 = this.mWidget;
                float f2 = i == 0 ? constraintWidget4.mHorizontalBiasPercent : constraintWidget4.mVerticalBiasPercent;
                if (target == target2) {
                    margin = target.value;
                    margin2 = target2.value;
                    f2 = 0.5f;
                }
                dependencyNode2.resolve((int) ((((margin2 - margin) - i5) * f2) + margin + 0.5f));
                dependencyNode.resolve(dependencyNode2.value + dimensionDependency.value);
            }
        }
    }

    public static void addTarget(DependencyNode dependencyNode, DependencyNode dependencyNode2, int i) {
        dependencyNode.mTargets.add(dependencyNode2);
        dependencyNode.mMargin = i;
        dependencyNode2.mDependencies.add(dependencyNode);
    }

    public static DependencyNode getTarget(ConstraintAnchor constraintAnchor, int i) {
        ConstraintAnchor constraintAnchor2 = constraintAnchor.mTarget;
        if (constraintAnchor2 == null) {
            return null;
        }
        ConstraintWidget constraintWidget = constraintAnchor2.mOwner;
        WidgetRun widgetRun = i == 0 ? constraintWidget.mHorizontalRun : constraintWidget.mVerticalRun;
        int ordinal = CameraSelector$$ExternalSyntheticOutline0.ordinal(constraintAnchor2.mType);
        if (ordinal == 1 || ordinal == 2) {
            return widgetRun.start;
        }
        if (ordinal == 3 || ordinal == 4) {
            return widgetRun.end;
        }
        return null;
    }
}
