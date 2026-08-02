package androidx.constraintlayout.core.widgets;

import androidx.camera.video.Recorder;
import androidx.constraintlayout.core.LinearSystem;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure$Measure;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure$Measurer;
import androidx.constraintlayout.core.widgets.analyzer.ChainRun;
import androidx.constraintlayout.core.widgets.analyzer.DependencyGraph;
import androidx.constraintlayout.core.widgets.analyzer.Direct;
import androidx.constraintlayout.core.widgets.analyzer.GuidelineReference;
import androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun;
import androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun;
import androidx.constraintlayout.core.widgets.analyzer.WidgetGroup;
import androidx.constraintlayout.core.widgets.analyzer.WidgetRun;
import androidx.recyclerview.widget.RecyclerView;
import com.plaid.internal.EnumC0170g;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class ConstraintWidgetContainer extends ConstraintWidget {
    public int mPaddingLeft;
    public int mPaddingTop;
    public int mPass;
    public ArrayList mChildren = new ArrayList();
    public Recorder.AnonymousClass3 mBasicMeasureSolver = new Recorder.AnonymousClass3(this);
    public DependencyGraph mDependencyGraph = new DependencyGraph(this);
    public BasicMeasure$Measurer mMeasurer = null;
    public boolean mIsRtl = false;
    public LinearSystem mSystem = new LinearSystem();
    public int mHorizontalChainsSize = 0;
    public int mVerticalChainsSize = 0;
    public ChainHead[] mVerticalChainsArray = new ChainHead[4];
    public ChainHead[] mHorizontalChainsArray = new ChainHead[4];
    public int mOptimizationLevel = EnumC0170g.SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE;
    public boolean mWidthMeasuredTooSmall = false;
    public boolean mHeightMeasuredTooSmall = false;
    public WeakReference mVerticalWrapMin = null;
    public WeakReference mHorizontalWrapMin = null;
    public WeakReference mVerticalWrapMax = null;
    public WeakReference mHorizontalWrapMax = null;
    public HashSet mWidgetsToAdd = new HashSet();
    public BasicMeasure$Measure mMeasure = new BasicMeasure$Measure();

    public final void add(ConstraintWidget constraintWidget) {
        this.mChildren.add(constraintWidget);
        ConstraintWidget constraintWidget2 = constraintWidget.mParent;
        if (constraintWidget2 != null) {
            ((ConstraintWidgetContainer) constraintWidget2).mChildren.remove(constraintWidget);
            constraintWidget.reset();
        }
        constraintWidget.mParent = this;
    }

    public final void addChain(ConstraintWidget constraintWidget, int i) {
        if (i == 0) {
            int i2 = this.mHorizontalChainsSize + 1;
            ChainHead[] chainHeadArr = this.mHorizontalChainsArray;
            if (i2 >= chainHeadArr.length) {
                this.mHorizontalChainsArray = (ChainHead[]) Arrays.copyOf(chainHeadArr, chainHeadArr.length * 2);
            }
            ChainHead[] chainHeadArr2 = this.mHorizontalChainsArray;
            int i3 = this.mHorizontalChainsSize;
            chainHeadArr2[i3] = new ChainHead(constraintWidget, 0, this.mIsRtl);
            this.mHorizontalChainsSize = i3 + 1;
            return;
        }
        if (i == 1) {
            int i4 = this.mVerticalChainsSize + 1;
            ChainHead[] chainHeadArr3 = this.mVerticalChainsArray;
            if (i4 >= chainHeadArr3.length) {
                this.mVerticalChainsArray = (ChainHead[]) Arrays.copyOf(chainHeadArr3, chainHeadArr3.length * 2);
            }
            ChainHead[] chainHeadArr4 = this.mVerticalChainsArray;
            int i5 = this.mVerticalChainsSize;
            chainHeadArr4[i5] = new ChainHead(constraintWidget, 1, this.mIsRtl);
            this.mVerticalChainsSize = i5 + 1;
        }
    }

    public final void addChildrenToSolver(LinearSystem linearSystem) {
        ConstraintWidgetContainer constraintWidgetContainer;
        LinearSystem linearSystem2;
        HashSet hashSet = this.mWidgetsToAdd;
        boolean optimizeFor = optimizeFor(64);
        addToSolver(linearSystem, optimizeFor);
        int size = this.mChildren.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            ConstraintWidget constraintWidget = (ConstraintWidget) this.mChildren.get(i);
            boolean[] zArr = constraintWidget.mIsInBarrier;
            zArr[0] = false;
            zArr[1] = false;
            if (constraintWidget instanceof Barrier) {
                z = true;
            }
        }
        if (z) {
            for (int i2 = 0; i2 < size; i2++) {
                ConstraintWidget constraintWidget2 = (ConstraintWidget) this.mChildren.get(i2);
                if (constraintWidget2 instanceof Barrier) {
                    Barrier barrier = (Barrier) constraintWidget2;
                    for (int i3 = 0; i3 < barrier.mWidgetsCount; i3++) {
                        ConstraintWidget constraintWidget3 = barrier.mWidgets[i3];
                        if (barrier.mAllowsGoneWidget || constraintWidget3.allowedInBarrier()) {
                            int i4 = barrier.mBarrierType;
                            if (i4 == 0 || i4 == 1) {
                                constraintWidget3.mIsInBarrier[0] = true;
                            } else if (i4 == 2 || i4 == 3) {
                                constraintWidget3.mIsInBarrier[1] = true;
                            }
                        }
                    }
                }
            }
        }
        hashSet.clear();
        for (int i5 = 0; i5 < size; i5++) {
            ConstraintWidget constraintWidget4 = (ConstraintWidget) this.mChildren.get(i5);
            constraintWidget4.getClass();
            boolean z2 = constraintWidget4 instanceof VirtualLayout;
            if (z2 || (constraintWidget4 instanceof Guideline)) {
                if (z2) {
                    hashSet.add(constraintWidget4);
                } else {
                    constraintWidget4.addToSolver(linearSystem, optimizeFor);
                }
            }
        }
        while (hashSet.size() > 0) {
            int size2 = hashSet.size();
            Iterator it = hashSet.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                VirtualLayout virtualLayout = (VirtualLayout) ((ConstraintWidget) it.next());
                for (int i6 = 0; i6 < virtualLayout.mWidgetsCount; i6++) {
                    if (hashSet.contains(virtualLayout.mWidgets[i6])) {
                        virtualLayout.addToSolver(linearSystem, optimizeFor);
                        hashSet.remove(virtualLayout);
                        break;
                    }
                }
            }
            if (size2 == hashSet.size()) {
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    ((ConstraintWidget) it2.next()).addToSolver(linearSystem, optimizeFor);
                }
                hashSet.clear();
            }
        }
        boolean z3 = LinearSystem.USE_DEPENDENCY_ORDERING;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
        if (z3) {
            HashSet hashSet2 = new HashSet();
            for (int i7 = 0; i7 < size; i7++) {
                ConstraintWidget constraintWidget5 = (ConstraintWidget) this.mChildren.get(i7);
                constraintWidget5.getClass();
                if (!(constraintWidget5 instanceof VirtualLayout) && !(constraintWidget5 instanceof Guideline)) {
                    hashSet2.add(constraintWidget5);
                }
            }
            constraintWidgetContainer = this;
            linearSystem2 = linearSystem;
            constraintWidgetContainer.addChildrenToSolverByDependency(this, linearSystem2, hashSet2, this.mListDimensionBehaviors[0] == dimensionBehaviour ? 0 : 1, false);
            Iterator it3 = hashSet2.iterator();
            while (it3.hasNext()) {
                ConstraintWidget constraintWidget6 = (ConstraintWidget) it3.next();
                Chain.checkMatchParent(constraintWidgetContainer, linearSystem2, constraintWidget6);
                constraintWidget6.addToSolver(linearSystem2, optimizeFor);
            }
        } else {
            constraintWidgetContainer = this;
            linearSystem2 = linearSystem;
            for (int i8 = 0; i8 < size; i8++) {
                ConstraintWidget constraintWidget7 = (ConstraintWidget) constraintWidgetContainer.mChildren.get(i8);
                if (constraintWidget7 instanceof ConstraintWidgetContainer) {
                    ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr = constraintWidget7.mListDimensionBehaviors;
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = dimensionBehaviourArr[0];
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = dimensionBehaviourArr[1];
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = ConstraintWidget.DimensionBehaviour.FIXED;
                    if (dimensionBehaviour2 == dimensionBehaviour) {
                        constraintWidget7.setHorizontalDimensionBehaviour(dimensionBehaviour4);
                    }
                    if (dimensionBehaviour3 == dimensionBehaviour) {
                        constraintWidget7.setVerticalDimensionBehaviour(dimensionBehaviour4);
                    }
                    constraintWidget7.addToSolver(linearSystem2, optimizeFor);
                    if (dimensionBehaviour2 == dimensionBehaviour) {
                        constraintWidget7.setHorizontalDimensionBehaviour(dimensionBehaviour2);
                    }
                    if (dimensionBehaviour3 == dimensionBehaviour) {
                        constraintWidget7.setVerticalDimensionBehaviour(dimensionBehaviour3);
                    }
                } else {
                    Chain.checkMatchParent(constraintWidgetContainer, linearSystem2, constraintWidget7);
                    if (!(constraintWidget7 instanceof VirtualLayout) && !(constraintWidget7 instanceof Guideline)) {
                        constraintWidget7.addToSolver(linearSystem2, optimizeFor);
                    }
                }
            }
        }
        if (constraintWidgetContainer.mHorizontalChainsSize > 0) {
            Chain.applyChainConstraints(constraintWidgetContainer, linearSystem2, null, 0);
        }
        if (constraintWidgetContainer.mVerticalChainsSize > 0) {
            Chain.applyChainConstraints(constraintWidgetContainer, linearSystem2, null, 1);
        }
    }

    public final boolean directMeasureWithOrientation(int i, boolean z) {
        boolean z2;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour;
        DependencyGraph dependencyGraph = this.mDependencyGraph;
        ArrayList arrayList = dependencyGraph.mRuns;
        ConstraintWidgetContainer constraintWidgetContainer = dependencyGraph.mWidgetcontainer;
        boolean z3 = false;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = constraintWidgetContainer.getDimensionBehaviour(0);
        ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = constraintWidgetContainer.getDimensionBehaviour(1);
        int x = constraintWidgetContainer.getX();
        int y = constraintWidgetContainer.getY();
        ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = ConstraintWidget.DimensionBehaviour.FIXED;
        if (z && (dimensionBehaviour2 == (dimensionBehaviour = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) || dimensionBehaviour3 == dimensionBehaviour)) {
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                WidgetRun widgetRun = (WidgetRun) it.next();
                if (widgetRun.orientation == i && !widgetRun.supportsWrapComputation()) {
                    z = false;
                    break;
                }
            }
            if (i == 0) {
                if (z && dimensionBehaviour2 == dimensionBehaviour) {
                    constraintWidgetContainer.setHorizontalDimensionBehaviour(dimensionBehaviour4);
                    constraintWidgetContainer.setWidth(dependencyGraph.computeWrap(constraintWidgetContainer, 0));
                    constraintWidgetContainer.mHorizontalRun.mDimension.resolve(constraintWidgetContainer.getWidth());
                }
            } else if (z && dimensionBehaviour3 == dimensionBehaviour) {
                constraintWidgetContainer.setVerticalDimensionBehaviour(dimensionBehaviour4);
                constraintWidgetContainer.setHeight(dependencyGraph.computeWrap(constraintWidgetContainer, 1));
                constraintWidgetContainer.mVerticalRun.mDimension.resolve(constraintWidgetContainer.getHeight());
            }
        }
        ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr = constraintWidgetContainer.mListDimensionBehaviors;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour5 = ConstraintWidget.DimensionBehaviour.MATCH_PARENT;
        if (i == 0) {
            ConstraintWidget.DimensionBehaviour dimensionBehaviour6 = dimensionBehaviourArr[0];
            if (dimensionBehaviour6 == dimensionBehaviour4 || dimensionBehaviour6 == dimensionBehaviour5) {
                int width = constraintWidgetContainer.getWidth() + x;
                constraintWidgetContainer.mHorizontalRun.end.resolve(width);
                constraintWidgetContainer.mHorizontalRun.mDimension.resolve(width - x);
                z2 = true;
            }
            z2 = false;
        } else {
            ConstraintWidget.DimensionBehaviour dimensionBehaviour7 = dimensionBehaviourArr[1];
            if (dimensionBehaviour7 == dimensionBehaviour4 || dimensionBehaviour7 == dimensionBehaviour5) {
                int height = constraintWidgetContainer.getHeight() + y;
                constraintWidgetContainer.mVerticalRun.end.resolve(height);
                constraintWidgetContainer.mVerticalRun.mDimension.resolve(height - y);
                z2 = true;
            }
            z2 = false;
        }
        dependencyGraph.measureWidgets();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            WidgetRun widgetRun2 = (WidgetRun) it2.next();
            if (widgetRun2.orientation == i && (widgetRun2.mWidget != constraintWidgetContainer || widgetRun2.mResolved)) {
                widgetRun2.applyToWidget();
            }
        }
        Iterator it3 = arrayList.iterator();
        while (true) {
            if (!it3.hasNext()) {
                z3 = true;
                break;
            }
            WidgetRun widgetRun3 = (WidgetRun) it3.next();
            if (widgetRun3.orientation == i && (z2 || widgetRun3.mWidget != constraintWidgetContainer)) {
                if (!widgetRun3.start.resolved) {
                    break;
                }
                if (!widgetRun3.end.resolved) {
                    break;
                }
                if (!(widgetRun3 instanceof ChainRun) && !widgetRun3.mDimension.resolved) {
                    break;
                }
            }
        }
        constraintWidgetContainer.setHorizontalDimensionBehaviour(dimensionBehaviour2);
        constraintWidgetContainer.setVerticalDimensionBehaviour(dimensionBehaviour3);
        return z3;
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public final void getSceneString(StringBuilder sb) {
        sb.append(this.stringId + ":{\n");
        StringBuilder sb2 = new StringBuilder("  actualWidth:");
        sb2.append(this.mWidth);
        sb.append(sb2.toString());
        sb.append("\n");
        sb.append("  actualHeight:" + this.mHeight);
        sb.append("\n");
        Iterator it = this.mChildren.iterator();
        while (it.hasNext()) {
            ((ConstraintWidget) it.next()).getSceneString(sb);
            sb.append(",\n");
        }
        sb.append("}");
    }

    /* JADX WARN: Removed duplicated region for block: B:273:0x0814  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x086f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:305:0x08f2  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x090e  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x091d  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x095b  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x095c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:328:0x091a  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x0853  */
    /* JADX WARN: Removed duplicated region for block: B:435:0x03bb  */
    /* JADX WARN: Removed duplicated region for block: B:447:0x03e1  */
    /* JADX WARN: Removed duplicated region for block: B:619:0x0641  */
    /* JADX WARN: Removed duplicated region for block: B:636:0x066e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:638:0x0676  */
    /* JADX WARN: Removed duplicated region for block: B:644:0x068b  */
    /* JADX WARN: Removed duplicated region for block: B:651:0x06a1  */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v6, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void layout() {
        LinearSystem linearSystem;
        int i;
        ConstraintAnchor constraintAnchor;
        ConstraintAnchor constraintAnchor2;
        int i2;
        LinearSystem linearSystem2;
        int i3;
        int i4;
        boolean z;
        char c;
        boolean z2;
        boolean z3;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour;
        boolean[] zArr;
        int i5;
        int max;
        int max2;
        ?? r13;
        int i6;
        WidgetGroup widgetGroup;
        WidgetGroup widgetGroup2;
        int i7;
        int i8;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2;
        WidgetGroup widgetGroup3;
        WidgetGroup widgetGroup4;
        boolean z4;
        ArrayList arrayList;
        ArrayList arrayList2;
        BasicMeasure$Measurer basicMeasure$Measurer;
        ArrayList arrayList3;
        int i9;
        ConstraintAnchor constraintAnchor3;
        LinearSystem linearSystem3 = this.mSystem;
        this.mX = 0;
        this.mY = 0;
        this.mWidthMeasuredTooSmall = false;
        this.mHeightMeasuredTooSmall = false;
        int size = this.mChildren.size();
        int max3 = Math.max(0, getWidth());
        int max4 = Math.max(0, getHeight());
        ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr = this.mListDimensionBehaviors;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = dimensionBehaviourArr[1];
        ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = dimensionBehaviourArr[0];
        int i10 = this.mPass;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour5 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
        ConstraintAnchor constraintAnchor4 = this.mTop;
        ConstraintAnchor constraintAnchor5 = this.mLeft;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour6 = ConstraintWidget.DimensionBehaviour.FIXED;
        if (i10 == 0 && Chain.enabled(this.mOptimizationLevel, 1)) {
            BasicMeasure$Measurer basicMeasure$Measurer2 = this.mMeasurer;
            ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr2 = this.mListDimensionBehaviors;
            ConstraintWidget.DimensionBehaviour dimensionBehaviour7 = dimensionBehaviourArr2[0];
            ConstraintWidget.DimensionBehaviour dimensionBehaviour8 = dimensionBehaviourArr2[1];
            resetFinalResolution();
            ArrayList arrayList4 = this.mChildren;
            int size2 = arrayList4.size();
            i = max4;
            for (int i11 = 0; i11 < size2; i11++) {
                ((ConstraintWidget) arrayList4.get(i11)).resetFinalResolution();
            }
            boolean z5 = this.mIsRtl;
            if (dimensionBehaviour7 == dimensionBehaviour6) {
                linearSystem = linearSystem3;
                setFinalHorizontal(0, getWidth());
            } else {
                linearSystem = linearSystem3;
                constraintAnchor5.setFinalValue(0);
                this.mX = 0;
            }
            boolean z6 = false;
            int i12 = 0;
            boolean z7 = false;
            while (i12 < size2) {
                boolean z8 = z6;
                ConstraintWidget constraintWidget = (ConstraintWidget) arrayList4.get(i12);
                int i13 = i12;
                if (constraintWidget instanceof Guideline) {
                    Guideline guideline = (Guideline) constraintWidget;
                    constraintAnchor3 = constraintAnchor5;
                    if (guideline.mOrientation == 1) {
                        int i14 = guideline.mRelativeBegin;
                        if (i14 != -1) {
                            guideline.setFinalValue(i14);
                        } else if (guideline.mRelativeEnd != -1 && isResolvedHorizontally()) {
                            guideline.setFinalValue(getWidth() - guideline.mRelativeEnd);
                        } else if (isResolvedHorizontally()) {
                            guideline.setFinalValue((int) ((guideline.mRelativePercent * getWidth()) + 0.5f));
                        }
                        z8 = true;
                    }
                } else {
                    constraintAnchor3 = constraintAnchor5;
                    if ((constraintWidget instanceof Barrier) && ((Barrier) constraintWidget).getOrientation() == 0) {
                        z6 = z8;
                        z7 = true;
                        i12 = i13 + 1;
                        constraintAnchor5 = constraintAnchor3;
                    }
                }
                z6 = z8;
                i12 = i13 + 1;
                constraintAnchor5 = constraintAnchor3;
            }
            constraintAnchor = constraintAnchor5;
            if (z6) {
                for (int i15 = 0; i15 < size2; i15 = i9 + 1) {
                    ConstraintWidget constraintWidget2 = (ConstraintWidget) arrayList4.get(i15);
                    if (constraintWidget2 instanceof Guideline) {
                        Guideline guideline2 = (Guideline) constraintWidget2;
                        i9 = i15;
                        if (guideline2.mOrientation == 1) {
                            Direct.horizontalSolvingPass(0, guideline2, basicMeasure$Measurer2, z5);
                        }
                    } else {
                        i9 = i15;
                    }
                }
            }
            Direct.horizontalSolvingPass(0, this, basicMeasure$Measurer2, z5);
            if (z7) {
                for (int i16 = 0; i16 < size2; i16++) {
                    ConstraintWidget constraintWidget3 = (ConstraintWidget) arrayList4.get(i16);
                    if (constraintWidget3 instanceof Barrier) {
                        Barrier barrier = (Barrier) constraintWidget3;
                        if (barrier.getOrientation() == 0 && barrier.allSolved()) {
                            Direct.horizontalSolvingPass(1, barrier, basicMeasure$Measurer2, z5);
                        }
                    }
                }
            }
            if (dimensionBehaviour8 == dimensionBehaviour6) {
                setFinalVertical(0, getHeight());
            } else {
                constraintAnchor4.setFinalValue(0);
                this.mY = 0;
            }
            int i17 = 0;
            boolean z9 = false;
            boolean z10 = false;
            while (i17 < size2) {
                ConstraintWidget constraintWidget4 = (ConstraintWidget) arrayList4.get(i17);
                int i18 = i17;
                if (constraintWidget4 instanceof Guideline) {
                    Guideline guideline3 = (Guideline) constraintWidget4;
                    if (guideline3.mOrientation == 0) {
                        int i19 = guideline3.mRelativeBegin;
                        if (i19 != -1) {
                            guideline3.setFinalValue(i19);
                        } else if (guideline3.mRelativeEnd != -1 && isResolvedVertically()) {
                            guideline3.setFinalValue(getHeight() - guideline3.mRelativeEnd);
                        } else if (isResolvedVertically()) {
                            guideline3.setFinalValue((int) ((guideline3.mRelativePercent * getHeight()) + 0.5f));
                        }
                        z9 = true;
                    }
                } else if ((constraintWidget4 instanceof Barrier) && ((Barrier) constraintWidget4).getOrientation() == 1) {
                    z10 = true;
                }
                i17 = i18 + 1;
            }
            if (z9) {
                for (int i20 = 0; i20 < size2; i20++) {
                    ConstraintWidget constraintWidget5 = (ConstraintWidget) arrayList4.get(i20);
                    if (constraintWidget5 instanceof Guideline) {
                        Guideline guideline4 = (Guideline) constraintWidget5;
                        if (guideline4.mOrientation == 0) {
                            Direct.verticalSolvingPass(1, guideline4, basicMeasure$Measurer2);
                        }
                    }
                }
            }
            Direct.verticalSolvingPass(0, this, basicMeasure$Measurer2);
            if (z10) {
                for (int i21 = 0; i21 < size2; i21++) {
                    ConstraintWidget constraintWidget6 = (ConstraintWidget) arrayList4.get(i21);
                    if (constraintWidget6 instanceof Barrier) {
                        Barrier barrier2 = (Barrier) constraintWidget6;
                        if (barrier2.getOrientation() == 1 && barrier2.allSolved()) {
                            Direct.verticalSolvingPass(1, barrier2, basicMeasure$Measurer2);
                        }
                    }
                }
            }
            for (int i22 = 0; i22 < size2; i22++) {
                ConstraintWidget constraintWidget7 = (ConstraintWidget) arrayList4.get(i22);
                if (constraintWidget7.isMeasureRequested() && Direct.canMeasure(constraintWidget7)) {
                    measure(constraintWidget7, basicMeasure$Measurer2, Direct.sMeasure);
                    if (!(constraintWidget7 instanceof Guideline)) {
                        Direct.horizontalSolvingPass(0, constraintWidget7, basicMeasure$Measurer2, z5);
                        Direct.verticalSolvingPass(0, constraintWidget7, basicMeasure$Measurer2);
                    } else if (((Guideline) constraintWidget7).mOrientation == 0) {
                        Direct.verticalSolvingPass(0, constraintWidget7, basicMeasure$Measurer2);
                    } else {
                        Direct.horizontalSolvingPass(0, constraintWidget7, basicMeasure$Measurer2, z5);
                    }
                }
            }
            for (int i23 = 0; i23 < size; i23++) {
                ConstraintWidget constraintWidget8 = (ConstraintWidget) this.mChildren.get(i23);
                if (constraintWidget8.isMeasureRequested() && !(constraintWidget8 instanceof Guideline) && !(constraintWidget8 instanceof Barrier) && !(constraintWidget8 instanceof VirtualLayout) && !constraintWidget8.mInVirtualLayout) {
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour9 = constraintWidget8.getDimensionBehaviour(0);
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour10 = constraintWidget8.getDimensionBehaviour(1);
                    if (dimensionBehaviour9 != dimensionBehaviour5 || constraintWidget8.mMatchConstraintDefaultWidth == 1 || dimensionBehaviour10 != dimensionBehaviour5 || constraintWidget8.mMatchConstraintDefaultHeight == 1) {
                        measure(constraintWidget8, this.mMeasurer, new BasicMeasure$Measure());
                    }
                }
            }
        } else {
            linearSystem = linearSystem3;
            i = max4;
            constraintAnchor = constraintAnchor5;
        }
        ConstraintWidget.DimensionBehaviour dimensionBehaviour11 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
        if (size <= 2 || !((dimensionBehaviour4 == dimensionBehaviour11 || dimensionBehaviour3 == dimensionBehaviour11) && Chain.enabled(this.mOptimizationLevel, 1024))) {
            constraintAnchor2 = constraintAnchor4;
            i2 = i;
            linearSystem2 = linearSystem;
        } else {
            BasicMeasure$Measurer basicMeasure$Measurer3 = this.mMeasurer;
            ArrayList arrayList5 = this.mChildren;
            int size3 = arrayList5.size();
            int i24 = 0;
            while (true) {
                if (i24 < size3) {
                    ConstraintWidget constraintWidget9 = (ConstraintWidget) arrayList5.get(i24);
                    ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr3 = this.mListDimensionBehaviors;
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour12 = dimensionBehaviourArr3[0];
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour13 = dimensionBehaviourArr3[1];
                    int i25 = i24;
                    ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr4 = constraintWidget9.mListDimensionBehaviors;
                    constraintAnchor2 = constraintAnchor4;
                    if (!Direct.validInGroup(dimensionBehaviour12, dimensionBehaviour13, dimensionBehaviourArr4[0], dimensionBehaviourArr4[1]) || (constraintWidget9 instanceof Flow)) {
                        break;
                    }
                    i24 = i25 + 1;
                    constraintAnchor4 = constraintAnchor2;
                } else {
                    constraintAnchor2 = constraintAnchor4;
                    int i26 = 0;
                    ArrayList arrayList6 = null;
                    ArrayList arrayList7 = null;
                    ArrayList arrayList8 = null;
                    ArrayList arrayList9 = null;
                    ArrayList arrayList10 = null;
                    ArrayList arrayList11 = null;
                    while (i26 < size3) {
                        int i27 = i26;
                        ConstraintWidget constraintWidget10 = (ConstraintWidget) arrayList5.get(i26);
                        ArrayList arrayList12 = arrayList6;
                        ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr5 = this.mListDimensionBehaviors;
                        ConstraintWidget.DimensionBehaviour dimensionBehaviour14 = dimensionBehaviourArr5[0];
                        ArrayList arrayList13 = arrayList7;
                        ConstraintWidget.DimensionBehaviour dimensionBehaviour15 = dimensionBehaviourArr5[1];
                        ArrayList arrayList14 = arrayList8;
                        ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr6 = constraintWidget10.mListDimensionBehaviors;
                        ArrayList arrayList15 = arrayList9;
                        if (!Direct.validInGroup(dimensionBehaviour14, dimensionBehaviour15, dimensionBehaviourArr6[0], dimensionBehaviourArr6[1])) {
                            measure(constraintWidget10, basicMeasure$Measurer3, this.mMeasure);
                        }
                        boolean z11 = constraintWidget10 instanceof Guideline;
                        if (z11) {
                            Guideline guideline5 = (Guideline) constraintWidget10;
                            if (guideline5.mOrientation == 0) {
                                arrayList8 = arrayList14 == null ? new ArrayList() : arrayList14;
                                arrayList8.add(guideline5);
                            } else {
                                arrayList8 = arrayList14;
                            }
                            z4 = z11;
                            if (guideline5.mOrientation == 1) {
                                arrayList = arrayList12 == null ? new ArrayList() : arrayList12;
                                arrayList.add(guideline5);
                            } else {
                                arrayList = arrayList12;
                            }
                        } else {
                            z4 = z11;
                            arrayList = arrayList12;
                            arrayList8 = arrayList14;
                        }
                        if (!(constraintWidget10 instanceof HelperWidget)) {
                            arrayList2 = arrayList;
                            basicMeasure$Measurer = basicMeasure$Measurer3;
                            arrayList7 = arrayList13;
                        } else if (constraintWidget10 instanceof Barrier) {
                            Barrier barrier3 = (Barrier) constraintWidget10;
                            if (barrier3.getOrientation() == 0) {
                                arrayList3 = arrayList13 == null ? new ArrayList() : arrayList13;
                                arrayList3.add(barrier3);
                            } else {
                                arrayList3 = arrayList13;
                            }
                            arrayList2 = arrayList;
                            basicMeasure$Measurer = basicMeasure$Measurer3;
                            if (barrier3.getOrientation() == 1) {
                                ArrayList arrayList16 = arrayList15 == null ? new ArrayList() : arrayList15;
                                arrayList16.add(barrier3);
                                arrayList15 = arrayList16;
                            }
                            arrayList7 = arrayList3;
                        } else {
                            arrayList2 = arrayList;
                            basicMeasure$Measurer = basicMeasure$Measurer3;
                            HelperWidget helperWidget = (HelperWidget) constraintWidget10;
                            arrayList7 = arrayList13 == null ? new ArrayList() : arrayList13;
                            arrayList7.add(helperWidget);
                            arrayList9 = arrayList15 == null ? new ArrayList() : arrayList15;
                            arrayList9.add(helperWidget);
                            if (constraintWidget10.mLeft.mTarget == null && constraintWidget10.mRight.mTarget == null && !z4 && !(constraintWidget10 instanceof Barrier)) {
                                if (arrayList10 == null) {
                                    arrayList10 = new ArrayList();
                                }
                                ArrayList arrayList17 = arrayList10;
                                arrayList17.add(constraintWidget10);
                                arrayList10 = arrayList17;
                            }
                            if (constraintWidget10.mTop.mTarget == null && constraintWidget10.mBottom.mTarget == null && constraintWidget10.mBaseline.mTarget == null && !z4 && !(constraintWidget10 instanceof Barrier)) {
                                if (arrayList11 == null) {
                                    arrayList11 = new ArrayList();
                                }
                                ArrayList arrayList18 = arrayList11;
                                arrayList18.add(constraintWidget10);
                                arrayList11 = arrayList18;
                            }
                            i26 = i27 + 1;
                            arrayList6 = arrayList2;
                            basicMeasure$Measurer3 = basicMeasure$Measurer;
                        }
                        arrayList9 = arrayList15;
                        if (constraintWidget10.mLeft.mTarget == null) {
                            if (arrayList10 == null) {
                            }
                            ArrayList arrayList172 = arrayList10;
                            arrayList172.add(constraintWidget10);
                            arrayList10 = arrayList172;
                        }
                        if (constraintWidget10.mTop.mTarget == null) {
                            if (arrayList11 == null) {
                            }
                            ArrayList arrayList182 = arrayList11;
                            arrayList182.add(constraintWidget10);
                            arrayList11 = arrayList182;
                        }
                        i26 = i27 + 1;
                        arrayList6 = arrayList2;
                        basicMeasure$Measurer3 = basicMeasure$Measurer;
                    }
                    ArrayList arrayList19 = arrayList6;
                    ArrayList arrayList20 = arrayList7;
                    ArrayList arrayList21 = arrayList8;
                    ArrayList arrayList22 = arrayList9;
                    ArrayList arrayList23 = new ArrayList();
                    if (arrayList19 != null) {
                        Iterator it = arrayList19.iterator();
                        while (it.hasNext()) {
                            Direct.findDependents((Guideline) it.next(), 0, arrayList23, null);
                        }
                    }
                    WidgetGroup widgetGroup5 = null;
                    int i28 = 0;
                    if (arrayList20 != null) {
                        Iterator it2 = arrayList20.iterator();
                        while (it2.hasNext()) {
                            HelperWidget helperWidget2 = (HelperWidget) it2.next();
                            WidgetGroup findDependents = Direct.findDependents(helperWidget2, i28, arrayList23, widgetGroup5);
                            helperWidget2.addDependents(i28, findDependents, arrayList23);
                            findDependents.cleanup(arrayList23);
                            widgetGroup5 = null;
                            i28 = 0;
                        }
                    }
                    HashSet hashSet = getAnchor(2).mDependents;
                    if (hashSet != null) {
                        Iterator it3 = hashSet.iterator();
                        while (it3.hasNext()) {
                            Direct.findDependents(((ConstraintAnchor) it3.next()).mOwner, 0, arrayList23, null);
                        }
                    }
                    HashSet hashSet2 = getAnchor(4).mDependents;
                    if (hashSet2 != null) {
                        Iterator it4 = hashSet2.iterator();
                        while (it4.hasNext()) {
                            Direct.findDependents(((ConstraintAnchor) it4.next()).mOwner, 0, arrayList23, null);
                        }
                    }
                    HashSet hashSet3 = getAnchor(7).mDependents;
                    if (hashSet3 != null) {
                        Iterator it5 = hashSet3.iterator();
                        while (it5.hasNext()) {
                            Direct.findDependents(((ConstraintAnchor) it5.next()).mOwner, 0, arrayList23, null);
                        }
                    }
                    WidgetGroup widgetGroup6 = null;
                    if (arrayList10 != null) {
                        Iterator it6 = arrayList10.iterator();
                        while (it6.hasNext()) {
                            Direct.findDependents((ConstraintWidget) it6.next(), 0, arrayList23, null);
                        }
                    }
                    if (arrayList21 != null) {
                        Iterator it7 = arrayList21.iterator();
                        while (it7.hasNext()) {
                            Direct.findDependents((Guideline) it7.next(), 1, arrayList23, null);
                        }
                    }
                    int i29 = 1;
                    if (arrayList22 != null) {
                        Iterator it8 = arrayList22.iterator();
                        while (it8.hasNext()) {
                            HelperWidget helperWidget3 = (HelperWidget) it8.next();
                            WidgetGroup findDependents2 = Direct.findDependents(helperWidget3, i29, arrayList23, widgetGroup6);
                            helperWidget3.addDependents(i29, findDependents2, arrayList23);
                            findDependents2.cleanup(arrayList23);
                            widgetGroup6 = null;
                            i29 = 1;
                        }
                    }
                    HashSet hashSet4 = getAnchor(3).mDependents;
                    if (hashSet4 != null) {
                        Iterator it9 = hashSet4.iterator();
                        while (it9.hasNext()) {
                            Direct.findDependents(((ConstraintAnchor) it9.next()).mOwner, 1, arrayList23, null);
                        }
                    }
                    HashSet hashSet5 = getAnchor(6).mDependents;
                    if (hashSet5 != null) {
                        Iterator it10 = hashSet5.iterator();
                        while (it10.hasNext()) {
                            Direct.findDependents(((ConstraintAnchor) it10.next()).mOwner, 1, arrayList23, null);
                        }
                    }
                    HashSet hashSet6 = getAnchor(5).mDependents;
                    if (hashSet6 != null) {
                        Iterator it11 = hashSet6.iterator();
                        while (it11.hasNext()) {
                            Direct.findDependents(((ConstraintAnchor) it11.next()).mOwner, 1, arrayList23, null);
                        }
                    }
                    HashSet hashSet7 = getAnchor(7).mDependents;
                    if (hashSet7 != null) {
                        Iterator it12 = hashSet7.iterator();
                        while (it12.hasNext()) {
                            Direct.findDependents(((ConstraintAnchor) it12.next()).mOwner, 1, arrayList23, null);
                        }
                    }
                    char c2 = 1;
                    if (arrayList11 != null) {
                        Iterator it13 = arrayList11.iterator();
                        while (it13.hasNext()) {
                            Direct.findDependents((ConstraintWidget) it13.next(), 1, arrayList23, null);
                        }
                    }
                    int i30 = 0;
                    while (i30 < size3) {
                        ConstraintWidget constraintWidget11 = (ConstraintWidget) arrayList5.get(i30);
                        ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr7 = constraintWidget11.mListDimensionBehaviors;
                        if (dimensionBehaviourArr7[0] == dimensionBehaviour5 && dimensionBehaviourArr7[c2] == dimensionBehaviour5) {
                            int i31 = constraintWidget11.horizontalGroup;
                            int size4 = arrayList23.size();
                            int i32 = 0;
                            while (true) {
                                if (i32 >= size4) {
                                    i8 = i30;
                                    dimensionBehaviour2 = dimensionBehaviour5;
                                    widgetGroup3 = null;
                                    break;
                                }
                                i8 = i30;
                                widgetGroup3 = (WidgetGroup) arrayList23.get(i32);
                                dimensionBehaviour2 = dimensionBehaviour5;
                                if (i31 == widgetGroup3.mId) {
                                    break;
                                }
                                i32++;
                                dimensionBehaviour5 = dimensionBehaviour2;
                                i30 = i8;
                            }
                            int i33 = constraintWidget11.verticalGroup;
                            int size5 = arrayList23.size();
                            int i34 = 0;
                            while (true) {
                                if (i34 >= size5) {
                                    widgetGroup4 = null;
                                    break;
                                }
                                widgetGroup4 = (WidgetGroup) arrayList23.get(i34);
                                if (i33 == widgetGroup4.mId) {
                                    break;
                                } else {
                                    i34++;
                                }
                            }
                            if (widgetGroup3 != null && widgetGroup4 != null) {
                                widgetGroup3.moveTo(0, widgetGroup4);
                                widgetGroup4.mOrientation = 2;
                                arrayList23.remove(widgetGroup3);
                            }
                        } else {
                            i8 = i30;
                            dimensionBehaviour2 = dimensionBehaviour5;
                        }
                        i30 = i8 + 1;
                        dimensionBehaviour5 = dimensionBehaviour2;
                        c2 = 1;
                    }
                    if (arrayList23.size() > 1) {
                        int i35 = 0;
                        if (this.mListDimensionBehaviors[0] == dimensionBehaviour11) {
                            Iterator it14 = arrayList23.iterator();
                            int i36 = 0;
                            widgetGroup = null;
                            while (it14.hasNext()) {
                                WidgetGroup widgetGroup7 = (WidgetGroup) it14.next();
                                if (widgetGroup7.mOrientation != 1) {
                                    LinearSystem linearSystem4 = linearSystem;
                                    int measureWrap = widgetGroup7.measureWrap(linearSystem4, i35);
                                    if (measureWrap > i36) {
                                        widgetGroup = widgetGroup7;
                                        i36 = measureWrap;
                                    }
                                    linearSystem = linearSystem4;
                                    i35 = 0;
                                }
                            }
                            linearSystem2 = linearSystem;
                            if (widgetGroup != null) {
                                setHorizontalDimensionBehaviour(dimensionBehaviour6);
                                setWidth(i36);
                                int i37 = 1;
                                if (this.mListDimensionBehaviors[1] == dimensionBehaviour11) {
                                    Iterator it15 = arrayList23.iterator();
                                    int i38 = 0;
                                    widgetGroup2 = null;
                                    while (it15.hasNext()) {
                                        WidgetGroup widgetGroup8 = (WidgetGroup) it15.next();
                                        if (widgetGroup8.mOrientation != 0) {
                                            int measureWrap2 = widgetGroup8.measureWrap(linearSystem2, i37);
                                            if (measureWrap2 > i38) {
                                                widgetGroup2 = widgetGroup8;
                                                i38 = measureWrap2;
                                            }
                                            i37 = 1;
                                        }
                                    }
                                    if (widgetGroup2 != null) {
                                        setVerticalDimensionBehaviour(dimensionBehaviour6);
                                        setHeight(i38);
                                        if (widgetGroup == null || widgetGroup2 != null) {
                                            if (dimensionBehaviour4 == dimensionBehaviour11) {
                                                if (max3 >= getWidth() || max3 <= 0) {
                                                    max3 = getWidth();
                                                } else {
                                                    setWidth(max3);
                                                    this.mWidthMeasuredTooSmall = true;
                                                }
                                            }
                                            if (dimensionBehaviour3 == dimensionBehaviour11) {
                                                i7 = i;
                                                if (i7 >= getHeight() || i7 <= 0) {
                                                    i3 = getHeight();
                                                    i4 = max3;
                                                    z = true;
                                                } else {
                                                    setHeight(i7);
                                                    this.mHeightMeasuredTooSmall = true;
                                                }
                                            } else {
                                                i7 = i;
                                            }
                                            i3 = i7;
                                            i4 = max3;
                                            z = true;
                                        }
                                    }
                                }
                                widgetGroup2 = null;
                                if (widgetGroup == null) {
                                }
                                if (dimensionBehaviour4 == dimensionBehaviour11) {
                                }
                                if (dimensionBehaviour3 == dimensionBehaviour11) {
                                }
                                i3 = i7;
                                i4 = max3;
                                z = true;
                            }
                        } else {
                            linearSystem2 = linearSystem;
                        }
                        widgetGroup = null;
                        int i372 = 1;
                        if (this.mListDimensionBehaviors[1] == dimensionBehaviour11) {
                        }
                        widgetGroup2 = null;
                        if (widgetGroup == null) {
                        }
                        if (dimensionBehaviour4 == dimensionBehaviour11) {
                        }
                        if (dimensionBehaviour3 == dimensionBehaviour11) {
                        }
                        i3 = i7;
                        i4 = max3;
                        z = true;
                    }
                }
            }
            linearSystem2 = linearSystem;
            i2 = i;
        }
        i4 = max3;
        i3 = i2;
        z = false;
        boolean z12 = optimizeFor(64) || optimizeFor(128);
        linearSystem2.getClass();
        linearSystem2.newgraphOptimizer = false;
        if (this.mOptimizationLevel == 0 || !z12) {
            c = 1;
        } else {
            c = 1;
            linearSystem2.newgraphOptimizer = true;
        }
        ArrayList arrayList24 = this.mChildren;
        ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr8 = this.mListDimensionBehaviors;
        boolean z13 = dimensionBehaviourArr8[0] == dimensionBehaviour11 || dimensionBehaviourArr8[c] == dimensionBehaviour11;
        this.mHorizontalChainsSize = 0;
        this.mVerticalChainsSize = 0;
        for (int i39 = 0; i39 < size; i39++) {
            ConstraintWidget constraintWidget12 = (ConstraintWidget) this.mChildren.get(i39);
            if (constraintWidget12 instanceof ConstraintWidgetContainer) {
                ((ConstraintWidgetContainer) constraintWidget12).layout();
            }
        }
        boolean optimizeFor = optimizeFor(64);
        boolean z14 = z;
        int i40 = 0;
        boolean z15 = true;
        while (z15) {
            int i41 = i40 + 1;
            try {
                linearSystem2.reset();
                z2 = z13;
                try {
                    this.mHorizontalChainsSize = 0;
                    this.mVerticalChainsSize = 0;
                    createObjectVariables(linearSystem2);
                    for (int i42 = 0; i42 < size; i42++) {
                        ((ConstraintWidget) this.mChildren.get(i42)).createObjectVariables(linearSystem2);
                    }
                    addChildrenToSolver(linearSystem2);
                    try {
                        WeakReference weakReference = this.mVerticalWrapMin;
                        if (weakReference == null || weakReference.get() == null) {
                            z3 = z14;
                        } else {
                            ConstraintAnchor constraintAnchor6 = constraintAnchor2;
                            try {
                                try {
                                    constraintAnchor2 = constraintAnchor6;
                                    z3 = z14;
                                } catch (Exception e) {
                                    e = e;
                                    constraintAnchor2 = constraintAnchor6;
                                    z3 = z14;
                                    z15 = true;
                                    e.printStackTrace();
                                    dimensionBehaviour = dimensionBehaviour6;
                                    System.out.println("EXCEPTION : " + e);
                                    boolean[] zArr2 = Chain.sFlags;
                                    if (z15) {
                                    }
                                    if (z2) {
                                    }
                                    i5 = size;
                                    max = Math.max(this.mMinWidth, getWidth());
                                    if (max > getWidth()) {
                                    }
                                    max2 = Math.max(this.mMinHeight, getHeight());
                                    if (max2 > getHeight()) {
                                    }
                                    if (!z3) {
                                    }
                                    z14 = z3;
                                    i6 = 8;
                                    if (i41 <= i6) {
                                    }
                                    i40 = i41;
                                    z13 = z2;
                                    dimensionBehaviour6 = dimensionBehaviour;
                                    size = i5;
                                }
                                try {
                                    linearSystem2.addGreaterThan(linearSystem2.createObjectVariable((ConstraintAnchor) this.mVerticalWrapMin.get()), linearSystem2.createObjectVariable(constraintAnchor6), 0, 5);
                                    this.mVerticalWrapMin = null;
                                } catch (Exception e2) {
                                    e = e2;
                                    z15 = true;
                                    e.printStackTrace();
                                    dimensionBehaviour = dimensionBehaviour6;
                                    System.out.println("EXCEPTION : " + e);
                                    boolean[] zArr22 = Chain.sFlags;
                                    if (z15) {
                                    }
                                    if (z2) {
                                    }
                                    i5 = size;
                                    max = Math.max(this.mMinWidth, getWidth());
                                    if (max > getWidth()) {
                                    }
                                    max2 = Math.max(this.mMinHeight, getHeight());
                                    if (max2 > getHeight()) {
                                    }
                                    if (!z3) {
                                    }
                                    z14 = z3;
                                    i6 = 8;
                                    if (i41 <= i6) {
                                    }
                                    i40 = i41;
                                    z13 = z2;
                                    dimensionBehaviour6 = dimensionBehaviour;
                                    size = i5;
                                }
                            } catch (Exception e3) {
                                e = e3;
                                constraintAnchor2 = constraintAnchor6;
                            }
                        }
                        WeakReference weakReference2 = this.mVerticalWrapMax;
                        if (weakReference2 != null && weakReference2.get() != null) {
                            linearSystem2.addGreaterThan(linearSystem2.createObjectVariable(this.mBottom), linearSystem2.createObjectVariable((ConstraintAnchor) this.mVerticalWrapMax.get()), 0, 5);
                            this.mVerticalWrapMax = null;
                        }
                        WeakReference weakReference3 = this.mHorizontalWrapMin;
                        if (weakReference3 != null && weakReference3.get() != null) {
                            ConstraintAnchor constraintAnchor7 = constraintAnchor;
                            try {
                                constraintAnchor = constraintAnchor7;
                                linearSystem2.addGreaterThan(linearSystem2.createObjectVariable((ConstraintAnchor) this.mHorizontalWrapMin.get()), linearSystem2.createObjectVariable(constraintAnchor7), 0, 5);
                                this.mHorizontalWrapMin = null;
                            } catch (Exception e4) {
                                e = e4;
                                constraintAnchor = constraintAnchor7;
                                z15 = true;
                                e.printStackTrace();
                                dimensionBehaviour = dimensionBehaviour6;
                                System.out.println("EXCEPTION : " + e);
                                boolean[] zArr222 = Chain.sFlags;
                                if (z15) {
                                }
                                if (z2) {
                                }
                                i5 = size;
                                max = Math.max(this.mMinWidth, getWidth());
                                if (max > getWidth()) {
                                }
                                max2 = Math.max(this.mMinHeight, getHeight());
                                if (max2 > getHeight()) {
                                }
                                if (!z3) {
                                }
                                z14 = z3;
                                i6 = 8;
                                if (i41 <= i6) {
                                }
                                i40 = i41;
                                z13 = z2;
                                dimensionBehaviour6 = dimensionBehaviour;
                                size = i5;
                            }
                        }
                        WeakReference weakReference4 = this.mHorizontalWrapMax;
                        if (weakReference4 != null && weakReference4.get() != null) {
                            try {
                            } catch (Exception e5) {
                                e = e5;
                            }
                            try {
                                linearSystem2.addGreaterThan(linearSystem2.createObjectVariable(this.mRight), linearSystem2.createObjectVariable((ConstraintAnchor) this.mHorizontalWrapMax.get()), 0, 5);
                                try {
                                    this.mHorizontalWrapMax = null;
                                } catch (Exception e6) {
                                    e = e6;
                                    z15 = true;
                                    e.printStackTrace();
                                    dimensionBehaviour = dimensionBehaviour6;
                                    System.out.println("EXCEPTION : " + e);
                                    boolean[] zArr2222 = Chain.sFlags;
                                    if (z15) {
                                    }
                                    if (z2) {
                                    }
                                    i5 = size;
                                    max = Math.max(this.mMinWidth, getWidth());
                                    if (max > getWidth()) {
                                    }
                                    max2 = Math.max(this.mMinHeight, getHeight());
                                    if (max2 > getHeight()) {
                                    }
                                    if (!z3) {
                                    }
                                    z14 = z3;
                                    i6 = 8;
                                    if (i41 <= i6) {
                                    }
                                    i40 = i41;
                                    z13 = z2;
                                    dimensionBehaviour6 = dimensionBehaviour;
                                    size = i5;
                                }
                            } catch (Exception e7) {
                                e = e7;
                                z15 = true;
                                e.printStackTrace();
                                dimensionBehaviour = dimensionBehaviour6;
                                System.out.println("EXCEPTION : " + e);
                                boolean[] zArr22222 = Chain.sFlags;
                                if (z15) {
                                }
                                if (z2) {
                                }
                                i5 = size;
                                max = Math.max(this.mMinWidth, getWidth());
                                if (max > getWidth()) {
                                }
                                max2 = Math.max(this.mMinHeight, getHeight());
                                if (max2 > getHeight()) {
                                }
                                if (!z3) {
                                }
                                z14 = z3;
                                i6 = 8;
                                if (i41 <= i6) {
                                }
                                i40 = i41;
                                z13 = z2;
                                dimensionBehaviour6 = dimensionBehaviour;
                                size = i5;
                            }
                        }
                        linearSystem2.minimize();
                        dimensionBehaviour = dimensionBehaviour6;
                        z15 = true;
                    } catch (Exception e8) {
                        e = e8;
                    }
                } catch (Exception e9) {
                    e = e9;
                    z3 = z14;
                    e.printStackTrace();
                    dimensionBehaviour = dimensionBehaviour6;
                    System.out.println("EXCEPTION : " + e);
                    boolean[] zArr222222 = Chain.sFlags;
                    if (z15) {
                    }
                    if (z2) {
                    }
                    i5 = size;
                    max = Math.max(this.mMinWidth, getWidth());
                    if (max > getWidth()) {
                    }
                    max2 = Math.max(this.mMinHeight, getHeight());
                    if (max2 > getHeight()) {
                    }
                    if (!z3) {
                    }
                    z14 = z3;
                    i6 = 8;
                    if (i41 <= i6) {
                    }
                    i40 = i41;
                    z13 = z2;
                    dimensionBehaviour6 = dimensionBehaviour;
                    size = i5;
                }
            } catch (Exception e10) {
                e = e10;
                z2 = z13;
            }
            boolean[] zArr2222222 = Chain.sFlags;
            if (z15) {
                zArr2222222[2] = false;
                boolean optimizeFor2 = optimizeFor(64);
                updateFromSolver(linearSystem2, optimizeFor2);
                int size6 = this.mChildren.size();
                int i43 = 0;
                z15 = false;
                while (i43 < size6) {
                    boolean[] zArr3 = zArr2222222;
                    ConstraintWidget constraintWidget13 = (ConstraintWidget) this.mChildren.get(i43);
                    constraintWidget13.updateFromSolver(linearSystem2, optimizeFor2);
                    int i44 = i43;
                    boolean z16 = optimizeFor2;
                    if (constraintWidget13.mWidthOverride != -1 || constraintWidget13.mHeightOverride != -1) {
                        z15 = true;
                    }
                    i43 = i44 + 1;
                    zArr2222222 = zArr3;
                    optimizeFor2 = z16;
                }
                zArr = zArr2222222;
            } else {
                zArr = zArr2222222;
                updateFromSolver(linearSystem2, optimizeFor);
                for (int i45 = 0; i45 < size; i45++) {
                    ((ConstraintWidget) this.mChildren.get(i45)).updateFromSolver(linearSystem2, optimizeFor);
                }
                z15 = false;
            }
            if (z2 || i41 >= 8) {
                i5 = size;
            } else if (zArr[2]) {
                int i46 = 0;
                int i47 = 0;
                int i48 = 0;
                while (i46 < size) {
                    ConstraintWidget constraintWidget14 = (ConstraintWidget) this.mChildren.get(i46);
                    i48 = Math.max(i48, constraintWidget14.getWidth() + constraintWidget14.mX);
                    i47 = Math.max(i47, constraintWidget14.getHeight() + constraintWidget14.mY);
                    i46++;
                    size = size;
                }
                i5 = size;
                int max5 = Math.max(this.mMinWidth, i48);
                int max6 = Math.max(this.mMinHeight, i47);
                if (dimensionBehaviour4 == dimensionBehaviour11 && getWidth() < max5) {
                    setWidth(max5);
                    this.mListDimensionBehaviors[0] = dimensionBehaviour11;
                    z15 = true;
                    z3 = true;
                }
                if (dimensionBehaviour3 == dimensionBehaviour11 && getHeight() < max6) {
                    setHeight(max6);
                    this.mListDimensionBehaviors[1] = dimensionBehaviour11;
                    z15 = true;
                    z3 = true;
                }
            } else {
                i5 = size;
            }
            max = Math.max(this.mMinWidth, getWidth());
            if (max > getWidth()) {
                setWidth(max);
                this.mListDimensionBehaviors[0] = dimensionBehaviour;
                z15 = true;
                z3 = true;
            }
            max2 = Math.max(this.mMinHeight, getHeight());
            if (max2 > getHeight()) {
                setHeight(max2);
                r13 = 1;
                this.mListDimensionBehaviors[1] = dimensionBehaviour;
                z15 = true;
                z3 = true;
            } else {
                r13 = 1;
            }
            if (!z3) {
                if (this.mListDimensionBehaviors[0] == dimensionBehaviour11 && i4 > 0 && getWidth() > i4) {
                    this.mWidthMeasuredTooSmall = r13;
                    this.mListDimensionBehaviors[0] = dimensionBehaviour;
                    setWidth(i4);
                    z15 = r13;
                    z3 = z15;
                }
                if (this.mListDimensionBehaviors[r13] == dimensionBehaviour11 && i3 > 0 && getHeight() > i3) {
                    this.mHeightMeasuredTooSmall = r13;
                    this.mListDimensionBehaviors[r13] = dimensionBehaviour;
                    setHeight(i3);
                    i6 = 8;
                    z14 = true;
                    z15 = true;
                    if (i41 <= i6) {
                        z15 = false;
                    }
                    i40 = i41;
                    z13 = z2;
                    dimensionBehaviour6 = dimensionBehaviour;
                    size = i5;
                }
            }
            z14 = z3;
            i6 = 8;
            if (i41 <= i6) {
            }
            i40 = i41;
            z13 = z2;
            dimensionBehaviour6 = dimensionBehaviour;
            size = i5;
        }
        boolean z17 = z14;
        this.mChildren = arrayList24;
        if (z17) {
            ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr9 = this.mListDimensionBehaviors;
            dimensionBehaviourArr9[0] = dimensionBehaviour4;
            dimensionBehaviourArr9[1] = dimensionBehaviour3;
        }
        resetSolverVariables(linearSystem2.mCache);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v2, types: [int] */
    /* JADX WARN: Type inference failed for: r14v47 */
    /* JADX WARN: Type inference failed for: r15v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r17v0 */
    /* JADX WARN: Type inference failed for: r17v1 */
    /* JADX WARN: Type inference failed for: r17v4 */
    public final void measure(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        ?? r17;
        boolean z;
        boolean z2;
        ConstraintWidgetContainer constraintWidgetContainer;
        ArrayList arrayList;
        BasicMeasure$Measurer basicMeasure$Measurer;
        int i8;
        int i9;
        boolean z3;
        int i10;
        int i11;
        BasicMeasure$Measurer basicMeasure$Measurer2;
        boolean z4;
        int i12;
        int i13;
        BasicMeasure$Measurer basicMeasure$Measurer3;
        int i14;
        boolean z5;
        HorizontalWidgetRun horizontalWidgetRun;
        VerticalWidgetRun verticalWidgetRun;
        boolean z6;
        int i15;
        int i16;
        ArrayList arrayList2;
        int i17;
        int i18;
        boolean z7;
        boolean z8;
        boolean z9;
        this.mPaddingLeft = i6;
        this.mPaddingTop = i7;
        Recorder.AnonymousClass3 anonymousClass3 = this.mBasicMeasureSolver;
        ConstraintWidgetContainer constraintWidgetContainer2 = (ConstraintWidgetContainer) anonymousClass3.this$0;
        ArrayList arrayList3 = (ArrayList) anonymousClass3.val$completer;
        BasicMeasure$Measurer basicMeasure$Measurer4 = this.mMeasurer;
        DependencyGraph dependencyGraph = this.mDependencyGraph;
        int size = this.mChildren.size();
        int width = getWidth();
        int height = getHeight();
        boolean enabled = Chain.enabled(i, 128);
        boolean z10 = enabled || Chain.enabled(i, 64);
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
        boolean z11 = false;
        if (z10) {
            int i19 = 0;
            while (i19 < size) {
                r17 = 1;
                ConstraintWidget constraintWidget = (ConstraintWidget) this.mChildren.get(i19);
                boolean z12 = z10;
                ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr = constraintWidget.mListDimensionBehaviors;
                boolean z13 = (dimensionBehaviourArr[0] == dimensionBehaviour) && (dimensionBehaviourArr[1] == dimensionBehaviour) && constraintWidget.mDimensionRatio > RecyclerView.DECELERATION_RATE;
                if ((constraintWidget.isInHorizontalChain() && z13) || ((constraintWidget.isInVerticalChain() && z13) || (constraintWidget instanceof VirtualLayout) || constraintWidget.isInHorizontalChain() || constraintWidget.isInVerticalChain())) {
                    z = false;
                    break;
                } else {
                    i19++;
                    z10 = z12;
                }
            }
        }
        r17 = 1;
        z = z10;
        boolean z14 = z & (((i2 == 1073741824 && i4 == 1073741824) || enabled) ? r17 : false);
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
        if (z14) {
            z2 = z14;
            int min = Math.min(this.mMaxDimension[0], i3);
            i8 = size;
            int min2 = Math.min(this.mMaxDimension[r17], i5);
            int i20 = 1073741824;
            if (i2 == 1073741824) {
                if (getWidth() != min) {
                    setWidth(min);
                    z6 = r17;
                    dependencyGraph.mNeedBuildGraph = z6;
                } else {
                    z6 = r17;
                }
                i20 = 1073741824;
            } else {
                z6 = r17;
            }
            if (i4 == i20) {
                if (getHeight() != min2) {
                    setHeight(min2);
                    dependencyGraph.mNeedBuildGraph = z6;
                }
                i20 = 1073741824;
            }
            if (i2 == i20 && i4 == i20) {
                ArrayList arrayList4 = dependencyGraph.mRuns;
                ConstraintWidgetContainer constraintWidgetContainer3 = dependencyGraph.mWidgetcontainer;
                if (dependencyGraph.mNeedBuildGraph || dependencyGraph.mNeedRedoMeasures) {
                    Iterator it = constraintWidgetContainer3.mChildren.iterator();
                    while (it.hasNext()) {
                        ArrayList arrayList5 = arrayList4;
                        ConstraintWidget constraintWidget2 = (ConstraintWidget) it.next();
                        constraintWidget2.ensureWidgetRuns();
                        constraintWidget2.measured = z11;
                        constraintWidget2.mHorizontalRun.reset();
                        constraintWidget2.mVerticalRun.reset();
                        arrayList4 = arrayList5;
                        it = it;
                        z11 = false;
                    }
                    arrayList2 = arrayList4;
                    constraintWidgetContainer3.ensureWidgetRuns();
                    i17 = 0;
                    constraintWidgetContainer3.measured = false;
                    constraintWidgetContainer3.mHorizontalRun.reset();
                    constraintWidgetContainer3.mVerticalRun.reset();
                    dependencyGraph.mNeedRedoMeasures = false;
                } else {
                    i17 = 0;
                    arrayList2 = arrayList4;
                }
                dependencyGraph.basicMeasureWidgets(dependencyGraph.mContainer);
                constraintWidgetContainer3.mX = i17;
                constraintWidgetContainer3.mY = i17;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = constraintWidgetContainer3.getDimensionBehaviour(i17);
                basicMeasure$Measurer = basicMeasure$Measurer4;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = constraintWidgetContainer3.getDimensionBehaviour(1);
                if (dependencyGraph.mNeedBuildGraph) {
                    dependencyGraph.buildGraph();
                }
                int x = constraintWidgetContainer3.getX();
                arrayList = arrayList3;
                int y = constraintWidgetContainer3.getY();
                constraintWidgetContainer = constraintWidgetContainer2;
                constraintWidgetContainer3.mHorizontalRun.start.resolve(x);
                constraintWidgetContainer3.mVerticalRun.start.resolve(y);
                dependencyGraph.measureWidgets();
                ConstraintWidget.DimensionBehaviour dimensionBehaviour5 = ConstraintWidget.DimensionBehaviour.FIXED;
                if (dimensionBehaviour3 == dimensionBehaviour2 || dimensionBehaviour4 == dimensionBehaviour2) {
                    if (enabled) {
                        Iterator it2 = arrayList2.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                if (!((WidgetRun) it2.next()).supportsWrapComputation()) {
                                    enabled = false;
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                    }
                    if (enabled && dimensionBehaviour3 == dimensionBehaviour2) {
                        constraintWidgetContainer3.setHorizontalDimensionBehaviour(dimensionBehaviour5);
                        i18 = y;
                        z7 = enabled;
                        constraintWidgetContainer3.setWidth(dependencyGraph.computeWrap(constraintWidgetContainer3, 0));
                        constraintWidgetContainer3.mHorizontalRun.mDimension.resolve(constraintWidgetContainer3.getWidth());
                    } else {
                        i18 = y;
                        z7 = enabled;
                    }
                    if (z7 && dimensionBehaviour4 == dimensionBehaviour2) {
                        constraintWidgetContainer3.setVerticalDimensionBehaviour(dimensionBehaviour5);
                        constraintWidgetContainer3.setHeight(dependencyGraph.computeWrap(constraintWidgetContainer3, 1));
                        constraintWidgetContainer3.mVerticalRun.mDimension.resolve(constraintWidgetContainer3.getHeight());
                    }
                } else {
                    i18 = y;
                }
                ConstraintWidget.DimensionBehaviour dimensionBehaviour6 = constraintWidgetContainer3.mListDimensionBehaviors[0];
                ConstraintWidget.DimensionBehaviour dimensionBehaviour7 = ConstraintWidget.DimensionBehaviour.MATCH_PARENT;
                if (dimensionBehaviour6 == dimensionBehaviour5 || dimensionBehaviour6 == dimensionBehaviour7) {
                    int width2 = constraintWidgetContainer3.getWidth() + x;
                    constraintWidgetContainer3.mHorizontalRun.end.resolve(width2);
                    constraintWidgetContainer3.mHorizontalRun.mDimension.resolve(width2 - x);
                    dependencyGraph.measureWidgets();
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour8 = constraintWidgetContainer3.mListDimensionBehaviors[1];
                    if (dimensionBehaviour8 == dimensionBehaviour5 || dimensionBehaviour8 == dimensionBehaviour7) {
                        int height2 = constraintWidgetContainer3.getHeight() + i18;
                        constraintWidgetContainer3.mVerticalRun.end.resolve(height2);
                        constraintWidgetContainer3.mVerticalRun.mDimension.resolve(height2 - i18);
                    }
                    dependencyGraph.measureWidgets();
                    z8 = true;
                } else {
                    z8 = false;
                }
                Iterator it3 = arrayList2.iterator();
                while (it3.hasNext()) {
                    WidgetRun widgetRun = (WidgetRun) it3.next();
                    if (widgetRun.mWidget != constraintWidgetContainer3 || widgetRun.mResolved) {
                        widgetRun.applyToWidget();
                    }
                }
                Iterator it4 = arrayList2.iterator();
                while (it4.hasNext()) {
                    WidgetRun widgetRun2 = (WidgetRun) it4.next();
                    if (z8 || widgetRun2.mWidget != constraintWidgetContainer3) {
                        if (!widgetRun2.start.resolved || ((!widgetRun2.end.resolved && !(widgetRun2 instanceof GuidelineReference)) || (!widgetRun2.mDimension.resolved && !(widgetRun2 instanceof ChainRun) && !(widgetRun2 instanceof GuidelineReference)))) {
                            z9 = false;
                            break;
                        }
                    }
                }
                z9 = true;
                constraintWidgetContainer3.setHorizontalDimensionBehaviour(dimensionBehaviour3);
                constraintWidgetContainer3.setVerticalDimensionBehaviour(dimensionBehaviour4);
                z3 = z9;
                i16 = 1073741824;
                i9 = 2;
            } else {
                constraintWidgetContainer = constraintWidgetContainer2;
                arrayList = arrayList3;
                basicMeasure$Measurer = basicMeasure$Measurer4;
                ConstraintWidgetContainer constraintWidgetContainer4 = dependencyGraph.mWidgetcontainer;
                if (dependencyGraph.mNeedBuildGraph) {
                    Iterator it5 = constraintWidgetContainer4.mChildren.iterator();
                    while (it5.hasNext()) {
                        ConstraintWidget constraintWidget3 = (ConstraintWidget) it5.next();
                        constraintWidget3.ensureWidgetRuns();
                        constraintWidget3.measured = false;
                        HorizontalWidgetRun horizontalWidgetRun2 = constraintWidget3.mHorizontalRun;
                        horizontalWidgetRun2.mDimension.resolved = false;
                        horizontalWidgetRun2.mResolved = false;
                        horizontalWidgetRun2.reset();
                        VerticalWidgetRun verticalWidgetRun2 = constraintWidget3.mVerticalRun;
                        verticalWidgetRun2.mDimension.resolved = false;
                        verticalWidgetRun2.mResolved = false;
                        verticalWidgetRun2.reset();
                    }
                    i15 = 0;
                    constraintWidgetContainer4.ensureWidgetRuns();
                    constraintWidgetContainer4.measured = false;
                    HorizontalWidgetRun horizontalWidgetRun3 = constraintWidgetContainer4.mHorizontalRun;
                    horizontalWidgetRun3.mDimension.resolved = false;
                    horizontalWidgetRun3.mResolved = false;
                    horizontalWidgetRun3.reset();
                    VerticalWidgetRun verticalWidgetRun3 = constraintWidgetContainer4.mVerticalRun;
                    verticalWidgetRun3.mDimension.resolved = false;
                    verticalWidgetRun3.mResolved = false;
                    verticalWidgetRun3.reset();
                    dependencyGraph.buildGraph();
                } else {
                    i15 = 0;
                }
                dependencyGraph.basicMeasureWidgets(dependencyGraph.mContainer);
                constraintWidgetContainer4.mX = i15;
                constraintWidgetContainer4.mY = i15;
                constraintWidgetContainer4.mHorizontalRun.start.resolve(i15);
                constraintWidgetContainer4.mVerticalRun.start.resolve(i15);
                i16 = 1073741824;
                if (i2 == 1073741824) {
                    z3 = directMeasureWithOrientation(i15, enabled);
                    i9 = 1;
                } else {
                    i9 = 0;
                    z3 = true;
                }
                if (i4 == 1073741824) {
                    z3 &= directMeasureWithOrientation(1, enabled);
                    i9++;
                }
            }
            if (z3) {
                updateFromRuns(i2 == i16, i4 == i16);
            }
        } else {
            z2 = z14;
            constraintWidgetContainer = constraintWidgetContainer2;
            arrayList = arrayList3;
            basicMeasure$Measurer = basicMeasure$Measurer4;
            i8 = size;
            i9 = 0;
            z3 = false;
        }
        if (z3 && i9 == 2) {
            return;
        }
        int i21 = this.mOptimizationLevel;
        if (i8 > 0) {
            int size2 = this.mChildren.size();
            boolean optimizeFor = optimizeFor(64);
            BasicMeasure$Measurer basicMeasure$Measurer5 = this.mMeasurer;
            for (int i22 = 0; i22 < size2; i22++) {
                ConstraintWidget constraintWidget4 = (ConstraintWidget) this.mChildren.get(i22);
                if (!(constraintWidget4 instanceof Guideline) && !(constraintWidget4 instanceof Barrier) && !constraintWidget4.mInVirtualLayout && (!optimizeFor || (horizontalWidgetRun = constraintWidget4.mHorizontalRun) == null || (verticalWidgetRun = constraintWidget4.mVerticalRun) == null || !horizontalWidgetRun.mDimension.resolved || !verticalWidgetRun.mDimension.resolved)) {
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour9 = constraintWidget4.getDimensionBehaviour(0);
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour10 = constraintWidget4.getDimensionBehaviour(1);
                    boolean z15 = dimensionBehaviour9 == dimensionBehaviour && constraintWidget4.mMatchConstraintDefaultWidth != 1 && dimensionBehaviour10 == dimensionBehaviour && constraintWidget4.mMatchConstraintDefaultHeight != 1;
                    if (!z15 && optimizeFor(1) && !(constraintWidget4 instanceof VirtualLayout)) {
                        if (dimensionBehaviour9 == dimensionBehaviour && constraintWidget4.mMatchConstraintDefaultWidth == 0 && dimensionBehaviour10 != dimensionBehaviour && !constraintWidget4.isInHorizontalChain()) {
                            z15 = true;
                        }
                        if (dimensionBehaviour10 == dimensionBehaviour && constraintWidget4.mMatchConstraintDefaultHeight == 0 && dimensionBehaviour9 != dimensionBehaviour && !constraintWidget4.isInHorizontalChain()) {
                            z15 = true;
                        }
                        if ((dimensionBehaviour9 == dimensionBehaviour || dimensionBehaviour10 == dimensionBehaviour) && constraintWidget4.mDimensionRatio > RecyclerView.DECELERATION_RATE) {
                            z15 = true;
                        }
                    }
                    if (!z15) {
                        anonymousClass3.measure(0, constraintWidget4, basicMeasure$Measurer5);
                    }
                }
            }
            i10 = 0;
            basicMeasure$Measurer5.didMeasures();
        } else {
            i10 = 0;
        }
        anonymousClass3.updateHierarchy(this);
        int size3 = arrayList.size();
        if (i8 > 0) {
            anonymousClass3.solveLinearSystem(this, i10, width, height);
        }
        if (size3 > 0) {
            ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr2 = this.mListDimensionBehaviors;
            int i23 = dimensionBehaviourArr2[i10] == dimensionBehaviour2 ? 1 : i10;
            int i24 = dimensionBehaviourArr2[1] == dimensionBehaviour2 ? 1 : i10;
            ConstraintWidgetContainer constraintWidgetContainer5 = constraintWidgetContainer;
            int max = Math.max(getWidth(), constraintWidgetContainer5.mMinWidth);
            int max2 = Math.max(getHeight(), constraintWidgetContainer5.mMinHeight);
            boolean z16 = i10;
            for (?? r14 = z16; r14 < size3; r14++) {
                ?? r15 = arrayList;
                ConstraintWidget constraintWidget5 = (ConstraintWidget) r15.get(r14);
                if (constraintWidget5 instanceof VirtualLayout) {
                    int width3 = constraintWidget5.getWidth();
                    int height3 = constraintWidget5.getHeight();
                    i12 = i24;
                    i13 = i23;
                    basicMeasure$Measurer3 = basicMeasure$Measurer;
                    boolean measure = z16 | anonymousClass3.measure(1, constraintWidget5, basicMeasure$Measurer3);
                    int width4 = constraintWidget5.getWidth();
                    int height4 = constraintWidget5.getHeight();
                    if (width4 != width3) {
                        constraintWidget5.setWidth(width4);
                        if (i13 != 0 && constraintWidget5.getX() + constraintWidget5.mWidth > max) {
                            max = Math.max(max, constraintWidget5.getAnchor(4).getMargin() + constraintWidget5.getX() + constraintWidget5.mWidth);
                        }
                        i14 = max;
                        z5 = true;
                    } else {
                        i14 = max;
                        z5 = measure;
                    }
                    if (height4 != height3) {
                        constraintWidget5.setHeight(height4);
                        if (i12 != 0 && constraintWidget5.getY() + constraintWidget5.mHeight > max2) {
                            max2 = Math.max(max2, constraintWidget5.getAnchor(5).getMargin() + constraintWidget5.getY() + constraintWidget5.mHeight);
                        }
                        z5 = true;
                    }
                    boolean z17 = ((VirtualLayout) constraintWidget5).mNeedsCallFromSolver | z5;
                    max = i14;
                    z16 = z17;
                } else {
                    i12 = i24;
                    i13 = i23;
                    basicMeasure$Measurer3 = basicMeasure$Measurer;
                }
                i23 = i13;
                basicMeasure$Measurer = basicMeasure$Measurer3;
                arrayList = r15;
                i24 = i12;
            }
            int i25 = i24;
            int i26 = i23;
            ArrayList arrayList6 = arrayList;
            int i27 = 0;
            while (true) {
                BasicMeasure$Measurer basicMeasure$Measurer6 = basicMeasure$Measurer;
                if (i27 >= 2) {
                    break;
                }
                int i28 = 0;
                while (i28 < size3) {
                    ConstraintWidget constraintWidget6 = (ConstraintWidget) arrayList6.get(i28);
                    if (((constraintWidget6 instanceof HelperWidget) && !(constraintWidget6 instanceof VirtualLayout)) || (constraintWidget6 instanceof Guideline) || constraintWidget6.mVisibility == 8 || ((z2 && constraintWidget6.mHorizontalRun.mDimension.resolved && constraintWidget6.mVerticalRun.mDimension.resolved) || (constraintWidget6 instanceof VirtualLayout))) {
                        i11 = size3;
                        basicMeasure$Measurer2 = basicMeasure$Measurer6;
                        z4 = z16;
                    } else {
                        int width5 = constraintWidget6.getWidth();
                        int height5 = constraintWidget6.getHeight();
                        i11 = size3;
                        int i29 = constraintWidget6.mBaselineDistance;
                        boolean measure2 = z16 | anonymousClass3.measure(i27 == 1 ? 2 : 1, constraintWidget6, basicMeasure$Measurer6);
                        basicMeasure$Measurer2 = basicMeasure$Measurer6;
                        int width6 = constraintWidget6.getWidth();
                        int height6 = constraintWidget6.getHeight();
                        if (width6 != width5) {
                            constraintWidget6.setWidth(width6);
                            if (i26 != 0 && constraintWidget6.getX() + constraintWidget6.mWidth > max) {
                                max = Math.max(max, constraintWidget6.getAnchor(4).getMargin() + constraintWidget6.getX() + constraintWidget6.mWidth);
                            }
                            z4 = true;
                        } else {
                            z4 = measure2;
                        }
                        if (height6 != height5) {
                            constraintWidget6.setHeight(height6);
                            if (i25 != 0 && constraintWidget6.getY() + constraintWidget6.mHeight > max2) {
                                max2 = Math.max(max2, constraintWidget6.getAnchor(5).getMargin() + constraintWidget6.getY() + constraintWidget6.mHeight);
                            }
                            z4 = true;
                        }
                        if (constraintWidget6.mHasBaseline && i29 != constraintWidget6.mBaselineDistance) {
                            z4 = true;
                        }
                    }
                    i28++;
                    size3 = i11;
                    z16 = z4;
                    basicMeasure$Measurer6 = basicMeasure$Measurer2;
                }
                int i30 = size3;
                basicMeasure$Measurer = basicMeasure$Measurer6;
                if (!z16) {
                    break;
                }
                i27++;
                anonymousClass3.solveLinearSystem(this, i27, width, height);
                size3 = i30;
                z16 = false;
            }
        }
        this.mOptimizationLevel = i21;
        LinearSystem.USE_DEPENDENCY_ORDERING = optimizeFor(512);
    }

    public final boolean optimizeFor(int i) {
        return (this.mOptimizationLevel & i) == i;
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public final void reset() {
        this.mSystem.reset();
        this.mPaddingLeft = 0;
        this.mPaddingTop = 0;
        this.mChildren.clear();
        super.reset();
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public final void resetSolverVariables(Recorder.AnonymousClass3 anonymousClass3) {
        super.resetSolverVariables(anonymousClass3);
        int size = this.mChildren.size();
        for (int i = 0; i < size; i++) {
            ((ConstraintWidget) this.mChildren.get(i)).resetSolverVariables(anonymousClass3);
        }
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public final void updateFromRuns(boolean z, boolean z2) {
        super.updateFromRuns(z, z2);
        int size = this.mChildren.size();
        for (int i = 0; i < size; i++) {
            ((ConstraintWidget) this.mChildren.get(i)).updateFromRuns(z, z2);
        }
    }

    public static void measure(ConstraintWidget constraintWidget, BasicMeasure$Measurer basicMeasure$Measurer, BasicMeasure$Measure basicMeasure$Measure) {
        int i;
        int i2;
        if (basicMeasure$Measurer == null) {
            return;
        }
        int i3 = constraintWidget.mVisibility;
        int[] iArr = constraintWidget.mResolvedMatchConstraintDefault;
        if (i3 != 8 && !(constraintWidget instanceof Guideline) && !(constraintWidget instanceof Barrier)) {
            ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr = constraintWidget.mListDimensionBehaviors;
            basicMeasure$Measure.horizontalBehavior = dimensionBehaviourArr[0];
            basicMeasure$Measure.verticalBehavior = dimensionBehaviourArr[1];
            basicMeasure$Measure.horizontalDimension = constraintWidget.getWidth();
            basicMeasure$Measure.verticalDimension = constraintWidget.getHeight();
            basicMeasure$Measure.measuredNeedsSolverPass = false;
            basicMeasure$Measure.measureStrategy = 0;
            ConstraintWidget.DimensionBehaviour dimensionBehaviour = basicMeasure$Measure.horizontalBehavior;
            ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
            boolean z = dimensionBehaviour == dimensionBehaviour2;
            boolean z2 = basicMeasure$Measure.verticalBehavior == dimensionBehaviour2;
            boolean z3 = z && constraintWidget.mDimensionRatio > RecyclerView.DECELERATION_RATE;
            boolean z4 = z2 && constraintWidget.mDimensionRatio > RecyclerView.DECELERATION_RATE;
            ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
            ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = ConstraintWidget.DimensionBehaviour.FIXED;
            if (z && constraintWidget.hasDanglingDimension(0) && constraintWidget.mMatchConstraintDefaultWidth == 0 && !z3) {
                basicMeasure$Measure.horizontalBehavior = dimensionBehaviour3;
                if (z2 && constraintWidget.mMatchConstraintDefaultHeight == 0) {
                    basicMeasure$Measure.horizontalBehavior = dimensionBehaviour4;
                }
                z = false;
            }
            if (z2 && constraintWidget.hasDanglingDimension(1) && constraintWidget.mMatchConstraintDefaultHeight == 0 && !z4) {
                basicMeasure$Measure.verticalBehavior = dimensionBehaviour3;
                if (z && constraintWidget.mMatchConstraintDefaultWidth == 0) {
                    basicMeasure$Measure.verticalBehavior = dimensionBehaviour4;
                }
                z2 = false;
            }
            if (constraintWidget.isResolvedHorizontally()) {
                basicMeasure$Measure.horizontalBehavior = dimensionBehaviour4;
                z = false;
            }
            if (constraintWidget.isResolvedVertically()) {
                basicMeasure$Measure.verticalBehavior = dimensionBehaviour4;
                z2 = false;
            }
            if (z3) {
                if (iArr[0] == 4) {
                    basicMeasure$Measure.horizontalBehavior = dimensionBehaviour4;
                } else if (!z2) {
                    if (basicMeasure$Measure.verticalBehavior == dimensionBehaviour4) {
                        i2 = basicMeasure$Measure.verticalDimension;
                    } else {
                        basicMeasure$Measure.horizontalBehavior = dimensionBehaviour3;
                        basicMeasure$Measurer.measure(constraintWidget, basicMeasure$Measure);
                        i2 = basicMeasure$Measure.measuredHeight;
                    }
                    basicMeasure$Measure.horizontalBehavior = dimensionBehaviour4;
                    basicMeasure$Measure.horizontalDimension = (int) (constraintWidget.mDimensionRatio * i2);
                }
            }
            if (z4) {
                if (iArr[1] == 4) {
                    basicMeasure$Measure.verticalBehavior = dimensionBehaviour4;
                } else if (!z) {
                    if (basicMeasure$Measure.horizontalBehavior == dimensionBehaviour4) {
                        i = basicMeasure$Measure.horizontalDimension;
                    } else {
                        basicMeasure$Measure.verticalBehavior = dimensionBehaviour3;
                        basicMeasure$Measurer.measure(constraintWidget, basicMeasure$Measure);
                        i = basicMeasure$Measure.measuredWidth;
                    }
                    basicMeasure$Measure.verticalBehavior = dimensionBehaviour4;
                    int i4 = constraintWidget.mDimensionRatioSide;
                    float f = constraintWidget.mDimensionRatio;
                    if (i4 == -1) {
                        basicMeasure$Measure.verticalDimension = (int) (i / f);
                    } else {
                        basicMeasure$Measure.verticalDimension = (int) (f * i);
                    }
                }
            }
            basicMeasure$Measurer.measure(constraintWidget, basicMeasure$Measure);
            constraintWidget.setWidth(basicMeasure$Measure.measuredWidth);
            constraintWidget.setHeight(basicMeasure$Measure.measuredHeight);
            constraintWidget.mHasBaseline = basicMeasure$Measure.measuredHasBaseline;
            constraintWidget.setBaselineDistance(basicMeasure$Measure.measuredBaseline);
            basicMeasure$Measure.measureStrategy = 0;
            return;
        }
        basicMeasure$Measure.measuredWidth = 0;
        basicMeasure$Measure.measuredHeight = 0;
    }
}
