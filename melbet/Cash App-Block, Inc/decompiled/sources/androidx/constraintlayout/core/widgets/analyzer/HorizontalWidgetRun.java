package androidx.constraintlayout.core.widgets.analyzer;

import androidx.camera.core.CameraSelector$$ExternalSyntheticOutline0;
import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.HelperWidget;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class HorizontalWidgetRun extends WidgetRun {
    public static final int[] sTempDimensions = new int[2];

    public static void computeInsetRatio(int[] iArr, int i, int i2, int i3, int i4, float f, int i5) {
        int i6 = i2 - i;
        int i7 = i4 - i3;
        if (i5 != -1) {
            if (i5 == 0) {
                iArr[0] = (int) ((i7 * f) + 0.5f);
                iArr[1] = i7;
                return;
            } else {
                if (i5 != 1) {
                    return;
                }
                iArr[0] = i6;
                iArr[1] = (int) ((i6 * f) + 0.5f);
                return;
            }
        }
        int i8 = (int) ((i7 * f) + 0.5f);
        int i9 = (int) ((i6 / f) + 0.5f);
        if (i8 <= i6) {
            iArr[0] = i8;
            iArr[1] = i7;
        } else if (i9 <= i7) {
            iArr[0] = i6;
            iArr[1] = i9;
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public final void apply() {
        ConstraintWidget constraintWidget;
        ConstraintWidget constraintWidget2;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour;
        ConstraintWidget constraintWidget3;
        ConstraintWidget constraintWidget4;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2;
        ConstraintWidget constraintWidget5 = this.mWidget;
        boolean z = constraintWidget5.measured;
        DimensionDependency dimensionDependency = this.mDimension;
        if (z) {
            dimensionDependency.resolve(constraintWidget5.getWidth());
        }
        boolean z2 = dimensionDependency.resolved;
        ArrayList arrayList = dimensionDependency.mDependencies;
        ArrayList arrayList2 = dimensionDependency.mTargets;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.MATCH_PARENT;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour5 = ConstraintWidget.DimensionBehaviour.FIXED;
        DependencyNode dependencyNode = this.end;
        DependencyNode dependencyNode2 = this.start;
        if (!z2) {
            ConstraintWidget constraintWidget6 = this.mWidget;
            ConstraintWidget.DimensionBehaviour dimensionBehaviour6 = constraintWidget6.mListDimensionBehaviors[0];
            this.mDimensionBehavior = dimensionBehaviour6;
            if (dimensionBehaviour6 != dimensionBehaviour4) {
                if (dimensionBehaviour6 == dimensionBehaviour3 && (constraintWidget4 = constraintWidget6.mParent) != null && ((dimensionBehaviour2 = constraintWidget4.mListDimensionBehaviors[0]) == dimensionBehaviour5 || dimensionBehaviour2 == dimensionBehaviour3)) {
                    int width = (constraintWidget4.getWidth() - this.mWidget.mLeft.getMargin()) - this.mWidget.mRight.getMargin();
                    WidgetRun.addTarget(dependencyNode2, constraintWidget4.mHorizontalRun.start, this.mWidget.mLeft.getMargin());
                    WidgetRun.addTarget(dependencyNode, constraintWidget4.mHorizontalRun.end, -this.mWidget.mRight.getMargin());
                    dimensionDependency.resolve(width);
                    return;
                }
                if (dimensionBehaviour6 == dimensionBehaviour5) {
                    dimensionDependency.resolve(constraintWidget6.getWidth());
                }
            }
        } else if (this.mDimensionBehavior == dimensionBehaviour3 && (constraintWidget2 = (constraintWidget = this.mWidget).mParent) != null && ((dimensionBehaviour = constraintWidget2.mListDimensionBehaviors[0]) == dimensionBehaviour5 || dimensionBehaviour == dimensionBehaviour3)) {
            WidgetRun.addTarget(dependencyNode2, constraintWidget2.mHorizontalRun.start, constraintWidget.mLeft.getMargin());
            WidgetRun.addTarget(dependencyNode, constraintWidget2.mHorizontalRun.end, -this.mWidget.mRight.getMargin());
            return;
        }
        if (dimensionDependency.resolved) {
            ConstraintWidget constraintWidget7 = this.mWidget;
            if (constraintWidget7.measured) {
                ConstraintAnchor[] constraintAnchorArr = constraintWidget7.mListAnchors;
                ConstraintAnchor constraintAnchor = constraintAnchorArr[0];
                ConstraintAnchor constraintAnchor2 = constraintAnchor.mTarget;
                if (constraintAnchor2 != null && constraintAnchorArr[1].mTarget != null) {
                    boolean isInHorizontalChain = constraintWidget7.isInHorizontalChain();
                    ConstraintWidget constraintWidget8 = this.mWidget;
                    if (isInHorizontalChain) {
                        dependencyNode2.mMargin = constraintWidget8.mListAnchors[0].getMargin();
                        dependencyNode.mMargin = -this.mWidget.mListAnchors[1].getMargin();
                        return;
                    }
                    DependencyNode target = WidgetRun.getTarget(constraintWidget8.mListAnchors[0]);
                    if (target != null) {
                        WidgetRun.addTarget(dependencyNode2, target, this.mWidget.mListAnchors[0].getMargin());
                    }
                    DependencyNode target2 = WidgetRun.getTarget(this.mWidget.mListAnchors[1]);
                    if (target2 != null) {
                        WidgetRun.addTarget(dependencyNode, target2, -this.mWidget.mListAnchors[1].getMargin());
                    }
                    dependencyNode2.delegateToWidgetRun = true;
                    dependencyNode.delegateToWidgetRun = true;
                    return;
                }
                if (constraintAnchor2 != null) {
                    DependencyNode target3 = WidgetRun.getTarget(constraintAnchor);
                    if (target3 != null) {
                        WidgetRun.addTarget(dependencyNode2, target3, this.mWidget.mListAnchors[0].getMargin());
                        WidgetRun.addTarget(dependencyNode, dependencyNode2, dimensionDependency.value);
                        return;
                    }
                    return;
                }
                ConstraintAnchor constraintAnchor3 = constraintAnchorArr[1];
                if (constraintAnchor3.mTarget != null) {
                    DependencyNode target4 = WidgetRun.getTarget(constraintAnchor3);
                    if (target4 != null) {
                        WidgetRun.addTarget(dependencyNode, target4, -this.mWidget.mListAnchors[1].getMargin());
                        WidgetRun.addTarget(dependencyNode2, dependencyNode, -dimensionDependency.value);
                        return;
                    }
                    return;
                }
                if ((constraintWidget7 instanceof HelperWidget) || constraintWidget7.mParent == null || constraintWidget7.getAnchor(7).mTarget != null) {
                    return;
                }
                ConstraintWidget constraintWidget9 = this.mWidget;
                WidgetRun.addTarget(dependencyNode2, constraintWidget9.mParent.mHorizontalRun.start, constraintWidget9.getX());
                WidgetRun.addTarget(dependencyNode, dependencyNode2, dimensionDependency.value);
                return;
            }
        }
        if (this.mDimensionBehavior == dimensionBehaviour4) {
            ConstraintWidget constraintWidget10 = this.mWidget;
            int i = constraintWidget10.mMatchConstraintDefaultWidth;
            if (i == 2) {
                ConstraintWidget constraintWidget11 = constraintWidget10.mParent;
                if (constraintWidget11 != null) {
                    DimensionDependency dimensionDependency2 = constraintWidget11.mVerticalRun.mDimension;
                    arrayList2.add(dimensionDependency2);
                    dimensionDependency2.mDependencies.add(dimensionDependency);
                    dimensionDependency.delegateToWidgetRun = true;
                    arrayList.add(dependencyNode2);
                    arrayList.add(dependencyNode);
                }
            } else if (i == 3) {
                if (constraintWidget10.mMatchConstraintDefaultHeight == 3) {
                    dependencyNode2.updateDelegate = this;
                    dependencyNode.updateDelegate = this;
                    VerticalWidgetRun verticalWidgetRun = constraintWidget10.mVerticalRun;
                    verticalWidgetRun.start.updateDelegate = this;
                    verticalWidgetRun.end.updateDelegate = this;
                    dimensionDependency.updateDelegate = this;
                    if (constraintWidget10.isInVerticalChain()) {
                        arrayList2.add(this.mWidget.mVerticalRun.mDimension);
                        this.mWidget.mVerticalRun.mDimension.mDependencies.add(dimensionDependency);
                        VerticalWidgetRun verticalWidgetRun2 = this.mWidget.mVerticalRun;
                        verticalWidgetRun2.mDimension.updateDelegate = this;
                        arrayList2.add(verticalWidgetRun2.start);
                        arrayList2.add(this.mWidget.mVerticalRun.end);
                        this.mWidget.mVerticalRun.start.mDependencies.add(dimensionDependency);
                        this.mWidget.mVerticalRun.end.mDependencies.add(dimensionDependency);
                    } else {
                        boolean isInHorizontalChain2 = this.mWidget.isInHorizontalChain();
                        ConstraintWidget constraintWidget12 = this.mWidget;
                        if (isInHorizontalChain2) {
                            constraintWidget12.mVerticalRun.mDimension.mTargets.add(dimensionDependency);
                            arrayList.add(this.mWidget.mVerticalRun.mDimension);
                        } else {
                            constraintWidget12.mVerticalRun.mDimension.mTargets.add(dimensionDependency);
                        }
                    }
                } else {
                    DimensionDependency dimensionDependency3 = constraintWidget10.mVerticalRun.mDimension;
                    arrayList2.add(dimensionDependency3);
                    dimensionDependency3.mDependencies.add(dimensionDependency);
                    this.mWidget.mVerticalRun.start.mDependencies.add(dimensionDependency);
                    this.mWidget.mVerticalRun.end.mDependencies.add(dimensionDependency);
                    dimensionDependency.delegateToWidgetRun = true;
                    arrayList.add(dependencyNode2);
                    arrayList.add(dependencyNode);
                    dependencyNode2.mTargets.add(dimensionDependency);
                    dependencyNode.mTargets.add(dimensionDependency);
                }
            }
        }
        ConstraintWidget constraintWidget13 = this.mWidget;
        ConstraintAnchor[] constraintAnchorArr2 = constraintWidget13.mListAnchors;
        ConstraintAnchor constraintAnchor4 = constraintAnchorArr2[0];
        ConstraintAnchor constraintAnchor5 = constraintAnchor4.mTarget;
        if (constraintAnchor5 != null && constraintAnchorArr2[1].mTarget != null) {
            boolean isInHorizontalChain3 = constraintWidget13.isInHorizontalChain();
            ConstraintWidget constraintWidget14 = this.mWidget;
            if (isInHorizontalChain3) {
                dependencyNode2.mMargin = constraintWidget14.mListAnchors[0].getMargin();
                dependencyNode.mMargin = -this.mWidget.mListAnchors[1].getMargin();
                return;
            }
            DependencyNode target5 = WidgetRun.getTarget(constraintWidget14.mListAnchors[0]);
            DependencyNode target6 = WidgetRun.getTarget(this.mWidget.mListAnchors[1]);
            if (target5 != null) {
                target5.addDependency(this);
            }
            if (target6 != null) {
                target6.addDependency(this);
            }
            this.mRunType = 4;
            return;
        }
        if (constraintAnchor5 != null) {
            DependencyNode target7 = WidgetRun.getTarget(constraintAnchor4);
            if (target7 != null) {
                WidgetRun.addTarget(dependencyNode2, target7, this.mWidget.mListAnchors[0].getMargin());
                addTarget(dependencyNode, dependencyNode2, 1, dimensionDependency);
                return;
            }
            return;
        }
        ConstraintAnchor constraintAnchor6 = constraintAnchorArr2[1];
        if (constraintAnchor6.mTarget != null) {
            DependencyNode target8 = WidgetRun.getTarget(constraintAnchor6);
            if (target8 != null) {
                WidgetRun.addTarget(dependencyNode, target8, -this.mWidget.mListAnchors[1].getMargin());
                addTarget(dependencyNode2, dependencyNode, -1, dimensionDependency);
                return;
            }
            return;
        }
        if ((constraintWidget13 instanceof HelperWidget) || (constraintWidget3 = constraintWidget13.mParent) == null) {
            return;
        }
        WidgetRun.addTarget(dependencyNode2, constraintWidget3.mHorizontalRun.start, constraintWidget13.getX());
        addTarget(dependencyNode, dependencyNode2, 1, dimensionDependency);
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public final void applyToWidget() {
        DependencyNode dependencyNode = this.start;
        if (dependencyNode.resolved) {
            this.mWidget.mX = dependencyNode.value;
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public final void clear() {
        this.mRunGroup = null;
        this.start.clear();
        this.end.clear();
        this.mDimension.clear();
        this.mResolved = false;
    }

    public final void reset() {
        this.mResolved = false;
        DependencyNode dependencyNode = this.start;
        dependencyNode.clear();
        dependencyNode.resolved = false;
        DependencyNode dependencyNode2 = this.end;
        dependencyNode2.clear();
        dependencyNode2.resolved = false;
        this.mDimension.resolved = false;
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public final boolean supportsWrapComputation() {
        return this.mDimensionBehavior != ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT || this.mWidget.mMatchConstraintDefaultWidth == 0;
    }

    public final String toString() {
        return "HorizontalRun " + this.mWidget.mDebugName;
    }

    /* JADX WARN: Code restructure failed: missing block: B:154:0x0245, code lost:
    
        if (r6 != 1) goto L125;
     */
    /* JADX WARN: Removed duplicated region for block: B:120:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x02ac  */
    @Override // androidx.constraintlayout.core.widgets.analyzer.Dependency
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void update(Dependency dependency) {
        float f;
        boolean z;
        float f2;
        float f3;
        float f4;
        int i;
        if (CameraSelector$$ExternalSyntheticOutline0.ordinal(this.mRunType) == 3) {
            ConstraintWidget constraintWidget = this.mWidget;
            updateRunCenter(constraintWidget.mLeft, constraintWidget.mRight, 0);
            return;
        }
        DimensionDependency dimensionDependency = this.mDimension;
        boolean z2 = dimensionDependency.resolved;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
        DependencyNode dependencyNode = this.start;
        DependencyNode dependencyNode2 = this.end;
        if (!z2 && this.mDimensionBehavior == dimensionBehaviour) {
            ConstraintWidget constraintWidget2 = this.mWidget;
            int i2 = constraintWidget2.mMatchConstraintDefaultWidth;
            if (i2 == 2) {
                f = 0.5f;
                ConstraintWidget constraintWidget3 = constraintWidget2.mParent;
                if (constraintWidget3 != null) {
                    if (constraintWidget3.mHorizontalRun.mDimension.resolved) {
                        dimensionDependency.resolve((int) ((r3.value * constraintWidget2.mMatchConstraintPercentWidth) + 0.5f));
                    }
                }
            } else if (i2 == 3) {
                int i3 = constraintWidget2.mMatchConstraintDefaultHeight;
                if (i3 == 0 || i3 == 3) {
                    VerticalWidgetRun verticalWidgetRun = constraintWidget2.mVerticalRun;
                    DependencyNode dependencyNode3 = verticalWidgetRun.start;
                    DependencyNode dependencyNode4 = verticalWidgetRun.end;
                    boolean z3 = constraintWidget2.mLeft.mTarget != null;
                    boolean z4 = constraintWidget2.mTop.mTarget != null;
                    boolean z5 = constraintWidget2.mRight.mTarget != null;
                    boolean z6 = constraintWidget2.mBottom.mTarget != null;
                    f = 0.5f;
                    int i4 = constraintWidget2.mDimensionRatioSide;
                    if (z3 && z4 && z5 && z6) {
                        float f5 = constraintWidget2.mDimensionRatio;
                        boolean z7 = dependencyNode3.resolved;
                        ArrayList arrayList = dependencyNode3.mTargets;
                        int[] iArr = sTempDimensions;
                        if (z7 && dependencyNode4.resolved) {
                            if (dependencyNode.readyToSolve && dependencyNode2.readyToSolve) {
                                computeInsetRatio(iArr, ((DependencyNode) dependencyNode.mTargets.get(0)).value + dependencyNode.mMargin, ((DependencyNode) dependencyNode2.mTargets.get(0)).value - dependencyNode2.mMargin, dependencyNode3.value + dependencyNode3.mMargin, dependencyNode4.value - dependencyNode4.mMargin, f5, i4);
                                dimensionDependency.resolve(iArr[0]);
                                this.mWidget.mVerticalRun.mDimension.resolve(iArr[1]);
                                return;
                            }
                            return;
                        }
                        if (dependencyNode.resolved && dependencyNode2.resolved) {
                            if (!dependencyNode3.readyToSolve || !dependencyNode4.readyToSolve) {
                                return;
                            }
                            computeInsetRatio(iArr, dependencyNode.value + dependencyNode.mMargin, dependencyNode2.value - dependencyNode2.mMargin, ((DependencyNode) arrayList.get(0)).value + dependencyNode3.mMargin, ((DependencyNode) dependencyNode4.mTargets.get(0)).value - dependencyNode4.mMargin, f5, i4);
                            dimensionDependency.resolve(iArr[0]);
                            this.mWidget.mVerticalRun.mDimension.resolve(iArr[1]);
                        }
                        if (!dependencyNode.readyToSolve || !dependencyNode2.readyToSolve || !dependencyNode3.readyToSolve || !dependencyNode4.readyToSolve) {
                            return;
                        }
                        computeInsetRatio(iArr, ((DependencyNode) dependencyNode.mTargets.get(0)).value + dependencyNode.mMargin, ((DependencyNode) dependencyNode2.mTargets.get(0)).value - dependencyNode2.mMargin, ((DependencyNode) arrayList.get(0)).value + dependencyNode3.mMargin, ((DependencyNode) dependencyNode4.mTargets.get(0)).value - dependencyNode4.mMargin, f5, i4);
                        dimensionDependency.resolve(iArr[0]);
                        this.mWidget.mVerticalRun.mDimension.resolve(iArr[1]);
                    } else if (z3 && z5) {
                        if (!dependencyNode.readyToSolve || !dependencyNode2.readyToSolve) {
                            return;
                        }
                        float f6 = constraintWidget2.mDimensionRatio;
                        int i5 = ((DependencyNode) dependencyNode.mTargets.get(0)).value + dependencyNode.mMargin;
                        int i6 = ((DependencyNode) dependencyNode2.mTargets.get(0)).value - dependencyNode2.mMargin;
                        if (i4 == -1 || i4 == 0) {
                            int limitedDimension = getLimitedDimension(i6 - i5, 0);
                            int i7 = (int) ((limitedDimension * f6) + 0.5f);
                            int limitedDimension2 = getLimitedDimension(i7, 1);
                            if (i7 != limitedDimension2) {
                                limitedDimension = (int) ((limitedDimension2 / f6) + 0.5f);
                            }
                            dimensionDependency.resolve(limitedDimension);
                            this.mWidget.mVerticalRun.mDimension.resolve(limitedDimension2);
                        } else if (i4 == 1) {
                            int limitedDimension3 = getLimitedDimension(i6 - i5, 0);
                            int i8 = (int) ((limitedDimension3 / f6) + 0.5f);
                            int limitedDimension4 = getLimitedDimension(i8, 1);
                            if (i8 != limitedDimension4) {
                                limitedDimension3 = (int) ((limitedDimension4 * f6) + 0.5f);
                            }
                            dimensionDependency.resolve(limitedDimension3);
                            this.mWidget.mVerticalRun.mDimension.resolve(limitedDimension4);
                        }
                    } else if (z4 && z6) {
                        if (!dependencyNode3.readyToSolve || !dependencyNode4.readyToSolve) {
                            return;
                        }
                        float f7 = constraintWidget2.mDimensionRatio;
                        int i9 = ((DependencyNode) dependencyNode3.mTargets.get(0)).value + dependencyNode3.mMargin;
                        int i10 = ((DependencyNode) dependencyNode4.mTargets.get(0)).value - dependencyNode4.mMargin;
                        if (i4 != -1) {
                            if (i4 == 0) {
                                int limitedDimension5 = getLimitedDimension(i10 - i9, 1);
                                int i11 = (int) ((limitedDimension5 * f7) + 0.5f);
                                int limitedDimension6 = getLimitedDimension(i11, 0);
                                if (i11 != limitedDimension6) {
                                    limitedDimension5 = (int) ((limitedDimension6 / f7) + 0.5f);
                                }
                                dimensionDependency.resolve(limitedDimension6);
                                this.mWidget.mVerticalRun.mDimension.resolve(limitedDimension5);
                            }
                        }
                        int limitedDimension7 = getLimitedDimension(i10 - i9, 1);
                        int i12 = (int) ((limitedDimension7 / f7) + 0.5f);
                        int limitedDimension8 = getLimitedDimension(i12, 0);
                        if (i12 != limitedDimension8) {
                            limitedDimension7 = (int) ((limitedDimension8 * f7) + 0.5f);
                        }
                        dimensionDependency.resolve(limitedDimension8);
                        this.mWidget.mVerticalRun.mDimension.resolve(limitedDimension7);
                    }
                } else {
                    int i13 = constraintWidget2.mDimensionRatioSide;
                    if (i13 == -1) {
                        f2 = constraintWidget2.mVerticalRun.mDimension.value;
                        f3 = constraintWidget2.mDimensionRatio;
                    } else if (i13 == 0) {
                        f4 = constraintWidget2.mVerticalRun.mDimension.value / constraintWidget2.mDimensionRatio;
                        i = (int) (f4 + 0.5f);
                        dimensionDependency.resolve(i);
                    } else if (i13 != 1) {
                        i = 0;
                        dimensionDependency.resolve(i);
                    } else {
                        f2 = constraintWidget2.mVerticalRun.mDimension.value;
                        f3 = constraintWidget2.mDimensionRatio;
                    }
                    f4 = f2 * f3;
                    i = (int) (f4 + 0.5f);
                    dimensionDependency.resolve(i);
                }
            }
            z = dependencyNode.readyToSolve;
            ArrayList arrayList2 = dependencyNode.mTargets;
            if (z) {
                return;
            }
            boolean z8 = dependencyNode2.readyToSolve;
            ArrayList arrayList3 = dependencyNode2.mTargets;
            if (z8) {
                if (dependencyNode.resolved && dependencyNode2.resolved && dimensionDependency.resolved) {
                    return;
                }
                if (!dimensionDependency.resolved && this.mDimensionBehavior == dimensionBehaviour) {
                    ConstraintWidget constraintWidget4 = this.mWidget;
                    if (constraintWidget4.mMatchConstraintDefaultWidth == 0 && !constraintWidget4.isInHorizontalChain()) {
                        DependencyNode dependencyNode5 = (DependencyNode) arrayList2.get(0);
                        DependencyNode dependencyNode6 = (DependencyNode) arrayList3.get(0);
                        int i14 = dependencyNode5.value + dependencyNode.mMargin;
                        int i15 = dependencyNode6.value + dependencyNode2.mMargin;
                        dependencyNode.resolve(i14);
                        dependencyNode2.resolve(i15);
                        dimensionDependency.resolve(i15 - i14);
                        return;
                    }
                }
                if (!dimensionDependency.resolved && this.mDimensionBehavior == dimensionBehaviour && this.matchConstraintsType == 1 && arrayList2.size() > 0 && arrayList3.size() > 0) {
                    int min = Math.min((((DependencyNode) arrayList3.get(0)).value + dependencyNode2.mMargin) - (((DependencyNode) arrayList2.get(0)).value + dependencyNode.mMargin), dimensionDependency.wrapValue);
                    ConstraintWidget constraintWidget5 = this.mWidget;
                    int i16 = constraintWidget5.mMatchConstraintMaxWidth;
                    int max = Math.max(constraintWidget5.mMatchConstraintMinWidth, min);
                    if (i16 > 0) {
                        max = Math.min(i16, max);
                    }
                    dimensionDependency.resolve(max);
                }
                if (dimensionDependency.resolved) {
                    DependencyNode dependencyNode7 = (DependencyNode) arrayList2.get(0);
                    DependencyNode dependencyNode8 = (DependencyNode) arrayList3.get(0);
                    int i17 = dependencyNode7.value;
                    int i18 = dependencyNode.mMargin + i17;
                    int i19 = dependencyNode8.value;
                    int i20 = dependencyNode2.mMargin + i19;
                    float f8 = this.mWidget.mHorizontalBiasPercent;
                    if (dependencyNode7 == dependencyNode8) {
                        f8 = f;
                    } else {
                        i17 = i18;
                        i19 = i20;
                    }
                    dependencyNode.resolve((int) ((((i19 - i17) - dimensionDependency.value) * f8) + i17 + f));
                    dependencyNode2.resolve(dependencyNode.value + dimensionDependency.value);
                    return;
                }
                return;
            }
            return;
        }
        f = 0.5f;
        z = dependencyNode.readyToSolve;
        ArrayList arrayList22 = dependencyNode.mTargets;
        if (z) {
        }
    }
}
