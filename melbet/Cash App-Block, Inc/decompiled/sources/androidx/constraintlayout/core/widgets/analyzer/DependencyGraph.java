package androidx.constraintlayout.core.widgets.analyzer;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.ConstraintWidgetContainer;
import androidx.constraintlayout.core.widgets.Guideline;
import androidx.constraintlayout.core.widgets.HelperWidget;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class DependencyGraph {
    public final ConstraintWidgetContainer mContainer;
    public final ArrayList mGroups;
    public final BasicMeasure$Measure mMeasure;
    public BasicMeasure$Measurer mMeasurer;
    public boolean mNeedBuildGraph = true;
    public boolean mNeedRedoMeasures = true;
    public final ArrayList mRuns = new ArrayList();
    public final ConstraintWidgetContainer mWidgetcontainer;

    public DependencyGraph(ConstraintWidgetContainer constraintWidgetContainer) {
        new ArrayList();
        this.mMeasurer = null;
        this.mMeasure = new BasicMeasure$Measure();
        this.mGroups = new ArrayList();
        this.mWidgetcontainer = constraintWidgetContainer;
        this.mContainer = constraintWidgetContainer;
    }

    public final void applyGroup(DependencyNode dependencyNode, int i, ArrayList arrayList, RunGroup runGroup) {
        WidgetRun widgetRun = dependencyNode.mRun;
        RunGroup runGroup2 = widgetRun.mRunGroup;
        DependencyNode dependencyNode2 = widgetRun.end;
        DependencyNode dependencyNode3 = widgetRun.start;
        if (runGroup2 == null) {
            ConstraintWidgetContainer constraintWidgetContainer = this.mWidgetcontainer;
            if (widgetRun == constraintWidgetContainer.mHorizontalRun || widgetRun == constraintWidgetContainer.mVerticalRun) {
                return;
            }
            if (runGroup == null) {
                runGroup = new RunGroup();
                runGroup.mFirstRun = null;
                runGroup.mRuns = new ArrayList();
                runGroup.mFirstRun = widgetRun;
                arrayList.add(runGroup);
            }
            widgetRun.mRunGroup = runGroup;
            runGroup.mRuns.add(widgetRun);
            Iterator it = dependencyNode3.mDependencies.iterator();
            while (it.hasNext()) {
                Dependency dependency = (Dependency) it.next();
                if (dependency instanceof DependencyNode) {
                    applyGroup((DependencyNode) dependency, i, arrayList, runGroup);
                }
            }
            Iterator it2 = dependencyNode2.mDependencies.iterator();
            while (it2.hasNext()) {
                Dependency dependency2 = (Dependency) it2.next();
                if (dependency2 instanceof DependencyNode) {
                    applyGroup((DependencyNode) dependency2, i, arrayList, runGroup);
                }
            }
            if (i == 1 && (widgetRun instanceof VerticalWidgetRun)) {
                Iterator it3 = ((VerticalWidgetRun) widgetRun).baseline.mDependencies.iterator();
                while (it3.hasNext()) {
                    Dependency dependency3 = (Dependency) it3.next();
                    if (dependency3 instanceof DependencyNode) {
                        applyGroup((DependencyNode) dependency3, i, arrayList, runGroup);
                    }
                }
            }
            Iterator it4 = dependencyNode3.mTargets.iterator();
            while (it4.hasNext()) {
                applyGroup((DependencyNode) it4.next(), i, arrayList, runGroup);
            }
            Iterator it5 = dependencyNode2.mTargets.iterator();
            while (it5.hasNext()) {
                applyGroup((DependencyNode) it5.next(), i, arrayList, runGroup);
            }
            if (i == 1 && (widgetRun instanceof VerticalWidgetRun)) {
                Iterator it6 = ((VerticalWidgetRun) widgetRun).baseline.mTargets.iterator();
                while (it6.hasNext()) {
                    applyGroup((DependencyNode) it6.next(), i, arrayList, runGroup);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:132:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0312  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void basicMeasureWidgets(ConstraintWidgetContainer constraintWidgetContainer) {
        Iterator it;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2;
        int i;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour3;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour4;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour5;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour6;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour7;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour8;
        Iterator it2 = constraintWidgetContainer.mChildren.iterator();
        while (it2.hasNext()) {
            ConstraintWidget constraintWidget = (ConstraintWidget) it2.next();
            ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr = constraintWidget.mListDimensionBehaviors;
            ConstraintAnchor[] constraintAnchorArr = constraintWidget.mListAnchors;
            ConstraintAnchor constraintAnchor = constraintWidget.mBottom;
            ConstraintAnchor constraintAnchor2 = constraintWidget.mTop;
            ConstraintAnchor constraintAnchor3 = constraintWidget.mRight;
            ConstraintAnchor constraintAnchor4 = constraintWidget.mLeft;
            ConstraintWidget.DimensionBehaviour dimensionBehaviour9 = dimensionBehaviourArr[0];
            ConstraintWidget.DimensionBehaviour dimensionBehaviour10 = dimensionBehaviourArr[1];
            if (constraintWidget.mVisibility == 8) {
                constraintWidget.measured = true;
            } else {
                float f = constraintWidget.mMatchConstraintPercentWidth;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour11 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                if (f < 1.0f && dimensionBehaviour9 == dimensionBehaviour11) {
                    constraintWidget.mMatchConstraintDefaultWidth = 2;
                }
                float f2 = constraintWidget.mMatchConstraintPercentHeight;
                if (f2 < 1.0f && dimensionBehaviour10 == dimensionBehaviour11) {
                    constraintWidget.mMatchConstraintDefaultHeight = 2;
                }
                float f3 = constraintWidget.mDimensionRatio;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour12 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour13 = ConstraintWidget.DimensionBehaviour.FIXED;
                if (f3 > RecyclerView.DECELERATION_RATE) {
                    if (dimensionBehaviour9 == dimensionBehaviour11 && (dimensionBehaviour10 == dimensionBehaviour12 || dimensionBehaviour10 == dimensionBehaviour13)) {
                        constraintWidget.mMatchConstraintDefaultWidth = 3;
                    } else if (dimensionBehaviour10 == dimensionBehaviour11 && (dimensionBehaviour9 == dimensionBehaviour12 || dimensionBehaviour9 == dimensionBehaviour13)) {
                        constraintWidget.mMatchConstraintDefaultHeight = 3;
                    } else if (dimensionBehaviour9 == dimensionBehaviour11 && dimensionBehaviour10 == dimensionBehaviour11) {
                        it = it2;
                        if (constraintWidget.mMatchConstraintDefaultWidth == 0) {
                            constraintWidget.mMatchConstraintDefaultWidth = 3;
                        }
                        if (constraintWidget.mMatchConstraintDefaultHeight == 0) {
                            constraintWidget.mMatchConstraintDefaultHeight = 3;
                        }
                        if (dimensionBehaviour9 == dimensionBehaviour11 && constraintWidget.mMatchConstraintDefaultWidth == 1 && (constraintAnchor4.mTarget == null || constraintAnchor3.mTarget == null)) {
                            dimensionBehaviour9 = dimensionBehaviour12;
                        }
                        if (dimensionBehaviour10 == dimensionBehaviour11 && constraintWidget.mMatchConstraintDefaultHeight == 1 && (constraintAnchor2.mTarget == null || constraintAnchor.mTarget == null)) {
                            dimensionBehaviour10 = dimensionBehaviour12;
                        }
                        HorizontalWidgetRun horizontalWidgetRun = constraintWidget.mHorizontalRun;
                        horizontalWidgetRun.mDimensionBehavior = dimensionBehaviour9;
                        int i2 = constraintWidget.mMatchConstraintDefaultWidth;
                        horizontalWidgetRun.matchConstraintsType = i2;
                        VerticalWidgetRun verticalWidgetRun = constraintWidget.mVerticalRun;
                        verticalWidgetRun.mDimensionBehavior = dimensionBehaviour10;
                        int i3 = constraintWidget.mMatchConstraintDefaultHeight;
                        verticalWidgetRun.matchConstraintsType = i3;
                        dimensionBehaviour = ConstraintWidget.DimensionBehaviour.MATCH_PARENT;
                        if ((dimensionBehaviour9 != dimensionBehaviour || dimensionBehaviour9 == dimensionBehaviour13 || dimensionBehaviour9 == dimensionBehaviour12) && (dimensionBehaviour10 == dimensionBehaviour || dimensionBehaviour10 == dimensionBehaviour13 || dimensionBehaviour10 == dimensionBehaviour12)) {
                            dimensionBehaviour2 = dimensionBehaviour10;
                            int width = constraintWidget.getWidth();
                            if (dimensionBehaviour9 == dimensionBehaviour) {
                                width = (constraintWidgetContainer.getWidth() - constraintAnchor4.mMargin) - constraintAnchor3.mMargin;
                                dimensionBehaviour9 = dimensionBehaviour13;
                            }
                            int height = constraintWidget.getHeight();
                            if (dimensionBehaviour2 != dimensionBehaviour) {
                                i = (constraintWidgetContainer.getHeight() - constraintAnchor2.mMargin) - constraintAnchor.mMargin;
                                dimensionBehaviour3 = dimensionBehaviour13;
                            } else {
                                i = height;
                                dimensionBehaviour3 = dimensionBehaviour2;
                            }
                            measure(constraintWidget, dimensionBehaviour9, width, dimensionBehaviour3, i);
                            constraintWidget.mHorizontalRun.mDimension.resolve(constraintWidget.getWidth());
                            constraintWidget.mVerticalRun.mDimension.resolve(constraintWidget.getHeight());
                            constraintWidget.measured = true;
                        } else {
                            if (dimensionBehaviour9 != dimensionBehaviour11 || (dimensionBehaviour10 != dimensionBehaviour12 && dimensionBehaviour10 != dimensionBehaviour13)) {
                                dimensionBehaviour4 = dimensionBehaviour10;
                                dimensionBehaviour5 = dimensionBehaviour12;
                            } else if (i2 == 3) {
                                if (dimensionBehaviour10 == dimensionBehaviour12) {
                                    measure(constraintWidget, dimensionBehaviour12, 0, dimensionBehaviour12, 0);
                                }
                                int height2 = constraintWidget.getHeight();
                                measure(constraintWidget, dimensionBehaviour13, (int) ((height2 * constraintWidget.mDimensionRatio) + 0.5f), dimensionBehaviour13, height2);
                                constraintWidget.mHorizontalRun.mDimension.resolve(constraintWidget.getWidth());
                                constraintWidget.mVerticalRun.mDimension.resolve(constraintWidget.getHeight());
                                constraintWidget.measured = true;
                            } else if (i2 == 1) {
                                measure(constraintWidget, dimensionBehaviour12, 0, dimensionBehaviour10, 0);
                                constraintWidget.mHorizontalRun.mDimension.wrapValue = constraintWidget.getWidth();
                            } else {
                                dimensionBehaviour5 = dimensionBehaviour12;
                                dimensionBehaviour4 = dimensionBehaviour10;
                                if (i2 == 2) {
                                    ConstraintWidget.DimensionBehaviour dimensionBehaviour14 = constraintWidgetContainer.mListDimensionBehaviors[0];
                                    if (dimensionBehaviour14 == dimensionBehaviour13 || dimensionBehaviour14 == dimensionBehaviour) {
                                        measure(constraintWidget, dimensionBehaviour13, (int) ((f * constraintWidgetContainer.getWidth()) + 0.5f), dimensionBehaviour4, constraintWidget.getHeight());
                                        constraintWidget.mHorizontalRun.mDimension.resolve(constraintWidget.getWidth());
                                        constraintWidget.mVerticalRun.mDimension.resolve(constraintWidget.getHeight());
                                        constraintWidget.measured = true;
                                    } else {
                                        dimensionBehaviour13 = dimensionBehaviour13;
                                    }
                                } else {
                                    dimensionBehaviour13 = dimensionBehaviour13;
                                    if (constraintAnchorArr[0].mTarget == null || constraintAnchorArr[1].mTarget == null) {
                                        measure(constraintWidget, dimensionBehaviour5, 0, dimensionBehaviour4, 0);
                                        constraintWidget.mHorizontalRun.mDimension.resolve(constraintWidget.getWidth());
                                        constraintWidget.mVerticalRun.mDimension.resolve(constraintWidget.getHeight());
                                        constraintWidget.measured = true;
                                    }
                                }
                            }
                            if (dimensionBehaviour4 != dimensionBehaviour11 || (dimensionBehaviour9 != dimensionBehaviour5 && dimensionBehaviour9 != dimensionBehaviour13)) {
                                ConstraintWidget.DimensionBehaviour dimensionBehaviour15 = dimensionBehaviour4;
                                dimensionBehaviour6 = dimensionBehaviour5;
                                dimensionBehaviour7 = dimensionBehaviour13;
                                dimensionBehaviour8 = dimensionBehaviour15;
                            } else if (i3 == 3) {
                                if (dimensionBehaviour9 == dimensionBehaviour5) {
                                    measure(constraintWidget, dimensionBehaviour5, 0, dimensionBehaviour5, 0);
                                }
                                int width2 = constraintWidget.getWidth();
                                float f4 = constraintWidget.mDimensionRatio;
                                if (constraintWidget.mDimensionRatioSide == -1) {
                                    f4 = 1.0f / f4;
                                }
                                measure(constraintWidget, dimensionBehaviour13, width2, dimensionBehaviour13, (int) ((width2 * f4) + 0.5f));
                                constraintWidget.mHorizontalRun.mDimension.resolve(constraintWidget.getWidth());
                                constraintWidget.mVerticalRun.mDimension.resolve(constraintWidget.getHeight());
                                constraintWidget.measured = true;
                            } else {
                                ConstraintWidget.DimensionBehaviour dimensionBehaviour16 = dimensionBehaviour13;
                                if (i3 == 1) {
                                    measure(constraintWidget, dimensionBehaviour9, 0, dimensionBehaviour5, 0);
                                    constraintWidget.mVerticalRun.mDimension.wrapValue = constraintWidget.getHeight();
                                } else {
                                    ConstraintWidget.DimensionBehaviour dimensionBehaviour17 = dimensionBehaviour5;
                                    ConstraintWidget.DimensionBehaviour dimensionBehaviour18 = dimensionBehaviour9;
                                    if (i3 == 2) {
                                        ConstraintWidget.DimensionBehaviour dimensionBehaviour19 = constraintWidgetContainer.mListDimensionBehaviors[1];
                                        if (dimensionBehaviour19 == dimensionBehaviour16 || dimensionBehaviour19 == dimensionBehaviour) {
                                            measure(constraintWidget, dimensionBehaviour18, constraintWidget.getWidth(), dimensionBehaviour16, (int) ((f2 * constraintWidgetContainer.getHeight()) + 0.5f));
                                            constraintWidget.mHorizontalRun.mDimension.resolve(constraintWidget.getWidth());
                                            constraintWidget.mVerticalRun.mDimension.resolve(constraintWidget.getHeight());
                                            constraintWidget.measured = true;
                                        } else {
                                            dimensionBehaviour8 = dimensionBehaviour4;
                                            dimensionBehaviour6 = dimensionBehaviour17;
                                            dimensionBehaviour9 = dimensionBehaviour18;
                                            dimensionBehaviour7 = dimensionBehaviour16;
                                        }
                                    } else {
                                        dimensionBehaviour9 = dimensionBehaviour18;
                                        dimensionBehaviour7 = dimensionBehaviour16;
                                        if (constraintAnchorArr[2].mTarget == null || constraintAnchorArr[3].mTarget == null) {
                                            measure(constraintWidget, dimensionBehaviour17, 0, dimensionBehaviour4, 0);
                                            constraintWidget.mHorizontalRun.mDimension.resolve(constraintWidget.getWidth());
                                            constraintWidget.mVerticalRun.mDimension.resolve(constraintWidget.getHeight());
                                            constraintWidget.measured = true;
                                        } else {
                                            dimensionBehaviour8 = dimensionBehaviour4;
                                            dimensionBehaviour6 = dimensionBehaviour17;
                                        }
                                    }
                                }
                            }
                            if (dimensionBehaviour9 == dimensionBehaviour11 && dimensionBehaviour8 == dimensionBehaviour11) {
                                if (i2 == 1 || i3 == 1) {
                                    measure(constraintWidget, dimensionBehaviour6, 0, dimensionBehaviour6, 0);
                                    constraintWidget.mHorizontalRun.mDimension.wrapValue = constraintWidget.getWidth();
                                    constraintWidget.mVerticalRun.mDimension.wrapValue = constraintWidget.getHeight();
                                } else if (i3 == 2 && i2 == 2) {
                                    ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr2 = constraintWidgetContainer.mListDimensionBehaviors;
                                    if (dimensionBehaviourArr2[0] == dimensionBehaviour7 && dimensionBehaviourArr2[1] == dimensionBehaviour7) {
                                        measure(constraintWidget, dimensionBehaviour7, (int) ((f * constraintWidgetContainer.getWidth()) + 0.5f), dimensionBehaviour7, (int) ((f2 * constraintWidgetContainer.getHeight()) + 0.5f));
                                        constraintWidget.mHorizontalRun.mDimension.resolve(constraintWidget.getWidth());
                                        constraintWidget.mVerticalRun.mDimension.resolve(constraintWidget.getHeight());
                                        constraintWidget.measured = true;
                                    }
                                }
                            }
                        }
                        it2 = it;
                    }
                }
                it = it2;
                if (dimensionBehaviour9 == dimensionBehaviour11) {
                    dimensionBehaviour9 = dimensionBehaviour12;
                }
                if (dimensionBehaviour10 == dimensionBehaviour11) {
                    dimensionBehaviour10 = dimensionBehaviour12;
                }
                HorizontalWidgetRun horizontalWidgetRun2 = constraintWidget.mHorizontalRun;
                horizontalWidgetRun2.mDimensionBehavior = dimensionBehaviour9;
                int i22 = constraintWidget.mMatchConstraintDefaultWidth;
                horizontalWidgetRun2.matchConstraintsType = i22;
                VerticalWidgetRun verticalWidgetRun2 = constraintWidget.mVerticalRun;
                verticalWidgetRun2.mDimensionBehavior = dimensionBehaviour10;
                int i32 = constraintWidget.mMatchConstraintDefaultHeight;
                verticalWidgetRun2.matchConstraintsType = i32;
                dimensionBehaviour = ConstraintWidget.DimensionBehaviour.MATCH_PARENT;
                if (dimensionBehaviour9 != dimensionBehaviour) {
                }
                dimensionBehaviour2 = dimensionBehaviour10;
                int width3 = constraintWidget.getWidth();
                if (dimensionBehaviour9 == dimensionBehaviour) {
                }
                int height3 = constraintWidget.getHeight();
                if (dimensionBehaviour2 != dimensionBehaviour) {
                }
                measure(constraintWidget, dimensionBehaviour9, width3, dimensionBehaviour3, i);
                constraintWidget.mHorizontalRun.mDimension.resolve(constraintWidget.getWidth());
                constraintWidget.mVerticalRun.mDimension.resolve(constraintWidget.getHeight());
                constraintWidget.measured = true;
                it2 = it;
            }
        }
    }

    public final void buildGraph() {
        ArrayList arrayList = this.mRuns;
        arrayList.clear();
        ConstraintWidgetContainer constraintWidgetContainer = this.mContainer;
        constraintWidgetContainer.mHorizontalRun.clear();
        constraintWidgetContainer.mVerticalRun.clear();
        arrayList.add(constraintWidgetContainer.mHorizontalRun);
        arrayList.add(constraintWidgetContainer.mVerticalRun);
        Iterator it = constraintWidgetContainer.mChildren.iterator();
        HashSet hashSet = null;
        while (it.hasNext()) {
            ConstraintWidget constraintWidget = (ConstraintWidget) it.next();
            if (constraintWidget instanceof Guideline) {
                GuidelineReference guidelineReference = new GuidelineReference(constraintWidget);
                constraintWidget.mHorizontalRun.clear();
                constraintWidget.mVerticalRun.clear();
                guidelineReference.orientation = ((Guideline) constraintWidget).mOrientation;
                arrayList.add(guidelineReference);
            } else {
                if (constraintWidget.isInHorizontalChain()) {
                    if (constraintWidget.horizontalChainRun == null) {
                        constraintWidget.horizontalChainRun = new ChainRun(constraintWidget, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(constraintWidget.horizontalChainRun);
                } else {
                    arrayList.add(constraintWidget.mHorizontalRun);
                }
                if (constraintWidget.isInVerticalChain()) {
                    if (constraintWidget.verticalChainRun == null) {
                        constraintWidget.verticalChainRun = new ChainRun(constraintWidget, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(constraintWidget.verticalChainRun);
                } else {
                    arrayList.add(constraintWidget.mVerticalRun);
                }
                if (constraintWidget instanceof HelperWidget) {
                    arrayList.add(new HelperReferences(constraintWidget));
                }
            }
        }
        if (hashSet != null) {
            arrayList.addAll(hashSet);
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((WidgetRun) it2.next()).clear();
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            WidgetRun widgetRun = (WidgetRun) it3.next();
            if (widgetRun.mWidget != constraintWidgetContainer) {
                widgetRun.apply();
            }
        }
        ArrayList arrayList2 = this.mGroups;
        arrayList2.clear();
        ConstraintWidgetContainer constraintWidgetContainer2 = this.mWidgetcontainer;
        findGroup(constraintWidgetContainer2.mHorizontalRun, 0, arrayList2);
        findGroup(constraintWidgetContainer2.mVerticalRun, 1, arrayList2);
        this.mNeedBuildGraph = false;
    }

    public final int computeWrap(ConstraintWidgetContainer constraintWidgetContainer, int i) {
        ArrayList arrayList;
        int i2;
        long max;
        float f;
        ConstraintWidgetContainer constraintWidgetContainer2 = constraintWidgetContainer;
        ArrayList arrayList2 = this.mGroups;
        int size = arrayList2.size();
        long j = 0;
        int i3 = 0;
        long j2 = 0;
        while (i3 < size) {
            WidgetRun widgetRun = ((RunGroup) arrayList2.get(i3)).mFirstRun;
            if (!(widgetRun instanceof ChainRun) ? !(i != 0 ? (widgetRun instanceof VerticalWidgetRun) : (widgetRun instanceof HorizontalWidgetRun)) : ((ChainRun) widgetRun).orientation != i) {
                DependencyNode dependencyNode = (i == 0 ? constraintWidgetContainer2.mHorizontalRun : constraintWidgetContainer2.mVerticalRun).start;
                DependencyNode dependencyNode2 = (i == 0 ? constraintWidgetContainer2.mHorizontalRun : constraintWidgetContainer2.mVerticalRun).end;
                DependencyNode dependencyNode3 = widgetRun.start;
                DependencyNode dependencyNode4 = widgetRun.end;
                boolean contains = dependencyNode3.mTargets.contains(dependencyNode);
                boolean contains2 = dependencyNode4.mTargets.contains(dependencyNode2);
                long wrapDimension = widgetRun.getWrapDimension();
                if (contains && contains2) {
                    long traverseStart = RunGroup.traverseStart(dependencyNode3, j);
                    arrayList = arrayList2;
                    long traverseEnd = RunGroup.traverseEnd(dependencyNode4, j);
                    long j3 = traverseStart - wrapDimension;
                    int i4 = dependencyNode4.mMargin;
                    i2 = i3;
                    if (j3 >= (-i4)) {
                        j3 += i4;
                    }
                    long j4 = dependencyNode3.mMargin;
                    long j5 = ((-traverseEnd) - wrapDimension) - j4;
                    if (j5 >= j4) {
                        j5 -= j4;
                    }
                    ConstraintWidget constraintWidget = widgetRun.mWidget;
                    if (i == 0) {
                        f = constraintWidget.mHorizontalBiasPercent;
                    } else if (i == 1) {
                        f = constraintWidget.mVerticalBiasPercent;
                    } else {
                        constraintWidget.getClass();
                        f = -1.0f;
                    }
                    float f2 = f > RecyclerView.DECELERATION_RATE ? (long) ((j3 / (1.0f - f)) + (j5 / f)) : 0L;
                    max = (dependencyNode3.mMargin + ((((long) ((f2 * f) + 0.5f)) + wrapDimension) + ((long) CameraState$Type$EnumUnboxingLocalUtility.m(1.0f, f, f2, 0.5f)))) - dependencyNode4.mMargin;
                } else {
                    arrayList = arrayList2;
                    i2 = i3;
                    max = contains ? Math.max(RunGroup.traverseStart(dependencyNode3, dependencyNode3.mMargin), dependencyNode3.mMargin + wrapDimension) : contains2 ? Math.max(-RunGroup.traverseEnd(dependencyNode4, dependencyNode4.mMargin), (-dependencyNode4.mMargin) + wrapDimension) : (widgetRun.getWrapDimension() + dependencyNode3.mMargin) - dependencyNode4.mMargin;
                }
            } else {
                arrayList = arrayList2;
                max = j;
                i2 = i3;
            }
            j2 = Math.max(j2, max);
            i3 = i2 + 1;
            arrayList2 = arrayList;
            constraintWidgetContainer2 = constraintWidgetContainer;
            j = 0;
        }
        return (int) j2;
    }

    public final void findGroup(WidgetRun widgetRun, int i, ArrayList arrayList) {
        DependencyNode dependencyNode = widgetRun.start;
        DependencyNode dependencyNode2 = widgetRun.end;
        Iterator it = dependencyNode.mDependencies.iterator();
        while (it.hasNext()) {
            Dependency dependency = (Dependency) it.next();
            if (dependency instanceof DependencyNode) {
                applyGroup((DependencyNode) dependency, i, arrayList, null);
            } else if (dependency instanceof WidgetRun) {
                applyGroup(((WidgetRun) dependency).start, i, arrayList, null);
            }
        }
        Iterator it2 = dependencyNode2.mDependencies.iterator();
        while (it2.hasNext()) {
            Dependency dependency2 = (Dependency) it2.next();
            if (dependency2 instanceof DependencyNode) {
                applyGroup((DependencyNode) dependency2, i, arrayList, null);
            } else if (dependency2 instanceof WidgetRun) {
                applyGroup(((WidgetRun) dependency2).end, i, arrayList, null);
            }
        }
        if (i == 1) {
            Iterator it3 = ((VerticalWidgetRun) widgetRun).baseline.mDependencies.iterator();
            while (it3.hasNext()) {
                Dependency dependency3 = (Dependency) it3.next();
                if (dependency3 instanceof DependencyNode) {
                    applyGroup((DependencyNode) dependency3, i, arrayList, null);
                }
            }
        }
    }

    public final void measure(ConstraintWidget constraintWidget, ConstraintWidget.DimensionBehaviour dimensionBehaviour, int i, ConstraintWidget.DimensionBehaviour dimensionBehaviour2, int i2) {
        BasicMeasure$Measure basicMeasure$Measure = this.mMeasure;
        basicMeasure$Measure.horizontalBehavior = dimensionBehaviour;
        basicMeasure$Measure.verticalBehavior = dimensionBehaviour2;
        basicMeasure$Measure.horizontalDimension = i;
        basicMeasure$Measure.verticalDimension = i2;
        this.mMeasurer.measure(constraintWidget, basicMeasure$Measure);
        constraintWidget.setWidth(basicMeasure$Measure.measuredWidth);
        constraintWidget.setHeight(basicMeasure$Measure.measuredHeight);
        constraintWidget.mHasBaseline = basicMeasure$Measure.measuredHasBaseline;
        constraintWidget.setBaselineDistance(basicMeasure$Measure.measuredBaseline);
    }

    public final void measureWidgets() {
        DependencyGraph dependencyGraph;
        BaselineDimensionDependency baselineDimensionDependency;
        Iterator it = this.mWidgetcontainer.mChildren.iterator();
        while (it.hasNext()) {
            ConstraintWidget constraintWidget = (ConstraintWidget) it.next();
            if (!constraintWidget.measured) {
                ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr = constraintWidget.mListDimensionBehaviors;
                boolean z = false;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour = dimensionBehaviourArr[0];
                ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = dimensionBehaviourArr[1];
                int i = constraintWidget.mMatchConstraintDefaultWidth;
                int i2 = constraintWidget.mMatchConstraintDefaultHeight;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                boolean z2 = dimensionBehaviour == dimensionBehaviour4 || (dimensionBehaviour == dimensionBehaviour3 && i == 1);
                if (dimensionBehaviour2 == dimensionBehaviour4 || (dimensionBehaviour2 == dimensionBehaviour3 && i2 == 1)) {
                    z = true;
                }
                DimensionDependency dimensionDependency = constraintWidget.mHorizontalRun.mDimension;
                boolean z3 = dimensionDependency.resolved;
                DimensionDependency dimensionDependency2 = constraintWidget.mVerticalRun.mDimension;
                boolean z4 = dimensionDependency2.resolved;
                boolean z5 = z2;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour5 = ConstraintWidget.DimensionBehaviour.FIXED;
                if (z3 && z4) {
                    dependencyGraph = this;
                    dependencyGraph.measure(constraintWidget, dimensionBehaviour5, dimensionDependency.value, dimensionBehaviour5, dimensionDependency2.value);
                    constraintWidget.measured = true;
                } else if (z3 && z) {
                    dependencyGraph = this;
                    dependencyGraph.measure(constraintWidget, dimensionBehaviour5, dimensionDependency.value, dimensionBehaviour4, dimensionDependency2.value);
                    VerticalWidgetRun verticalWidgetRun = constraintWidget.mVerticalRun;
                    if (dimensionBehaviour2 == dimensionBehaviour3) {
                        verticalWidgetRun.mDimension.wrapValue = constraintWidget.getHeight();
                    } else {
                        verticalWidgetRun.mDimension.resolve(constraintWidget.getHeight());
                        constraintWidget.measured = true;
                    }
                } else {
                    dependencyGraph = this;
                    if (z4 && z5) {
                        dependencyGraph.measure(constraintWidget, dimensionBehaviour4, dimensionDependency.value, dimensionBehaviour5, dimensionDependency2.value);
                        HorizontalWidgetRun horizontalWidgetRun = constraintWidget.mHorizontalRun;
                        if (dimensionBehaviour == dimensionBehaviour3) {
                            horizontalWidgetRun.mDimension.wrapValue = constraintWidget.getWidth();
                        } else {
                            horizontalWidgetRun.mDimension.resolve(constraintWidget.getWidth());
                            constraintWidget.measured = true;
                        }
                    }
                }
                if (constraintWidget.measured && (baselineDimensionDependency = constraintWidget.mVerticalRun.mBaselineDimension) != null) {
                    baselineDimensionDependency.resolve(constraintWidget.mBaselineDistance);
                }
                this = dependencyGraph;
            }
        }
    }
}
