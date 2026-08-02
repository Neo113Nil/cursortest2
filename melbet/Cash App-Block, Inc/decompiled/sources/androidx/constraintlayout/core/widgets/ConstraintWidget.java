package androidx.constraintlayout.core.widgets;

import androidx.camera.core.CameraSelector$$ExternalSyntheticOutline0;
import androidx.camera.video.Recorder;
import androidx.constraintlayout.core.ArrayRow;
import androidx.constraintlayout.core.LinearSystem;
import androidx.constraintlayout.core.SolverVariable;
import androidx.constraintlayout.core.state.WidgetFrame;
import androidx.constraintlayout.core.widgets.analyzer.ChainRun;
import androidx.constraintlayout.core.widgets.analyzer.DependencyNode;
import androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun;
import androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun;
import androidx.fragment.app.Fragment$5$$ExternalSyntheticOutline0;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.recyclerview.widget.RecyclerView;
import bo.app.a$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes3.dex */
public class ConstraintWidget {
    public final WidgetFrame frame;
    public ChainRun horizontalChainRun;
    public int horizontalGroup;
    public final boolean[] isTerminalWidget;
    public final ArrayList mAnchors;
    public boolean mAnimated;
    public final ConstraintAnchor mBaseline;
    public int mBaselineDistance;
    public final ConstraintAnchor mBottom;
    public final ConstraintAnchor mCenter;
    public final ConstraintAnchor mCenterX;
    public final ConstraintAnchor mCenterY;
    public float mCircleConstraintAngle;
    public Object mCompanionWidget;
    public String mDebugName;
    public float mDimensionRatio;
    public int mDimensionRatioSide;
    public boolean mHasBaseline;
    public int mHeight;
    public int mHeightOverride;
    public float mHorizontalBiasPercent;
    public int mHorizontalChainStyle;
    public ConstraintWidget mHorizontalNextWidget;
    public int mHorizontalResolution;
    public HorizontalWidgetRun mHorizontalRun;
    public boolean mHorizontalSolvingPass;
    public boolean mInPlaceholder;
    public boolean mInVirtualLayout;
    public final boolean[] mIsInBarrier;
    public int mLastHorizontalMeasureSpec;
    public int mLastVerticalMeasureSpec;
    public final ConstraintAnchor mLeft;
    public final ConstraintAnchor[] mListAnchors;
    public DimensionBehaviour[] mListDimensionBehaviors;
    public final ConstraintWidget[] mListNextMatchConstraintsWidget;
    public int mMatchConstraintDefaultHeight;
    public int mMatchConstraintDefaultWidth;
    public int mMatchConstraintMaxHeight;
    public int mMatchConstraintMaxWidth;
    public int mMatchConstraintMinHeight;
    public int mMatchConstraintMinWidth;
    public float mMatchConstraintPercentHeight;
    public float mMatchConstraintPercentWidth;
    public int[] mMaxDimension;
    public boolean mMeasureRequested;
    public int mMinHeight;
    public int mMinWidth;
    public final ConstraintWidget[] mNextChainWidget;
    public ConstraintWidget mParent;
    public float mResolvedDimensionRatio;
    public int mResolvedDimensionRatioSide;
    public boolean mResolvedHorizontal;
    public final int[] mResolvedMatchConstraintDefault;
    public boolean mResolvedVertical;
    public final ConstraintAnchor mRight;
    public final ConstraintAnchor mTop;
    public float mVerticalBiasPercent;
    public int mVerticalChainStyle;
    public ConstraintWidget mVerticalNextWidget;
    public int mVerticalResolution;
    public VerticalWidgetRun mVerticalRun;
    public boolean mVerticalSolvingPass;
    public int mVisibility;
    public final float[] mWeight;
    public int mWidth;
    public int mWidthOverride;
    public int mWrapBehaviorInParent;
    public int mX;
    public int mY;
    public boolean measured;
    public String stringId;
    public ChainRun verticalChainRun;
    public int verticalGroup;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class DimensionBehaviour {
        public static final /* synthetic */ DimensionBehaviour[] $VALUES;
        public static final DimensionBehaviour FIXED;
        public static final DimensionBehaviour MATCH_CONSTRAINT;
        public static final DimensionBehaviour MATCH_PARENT;
        public static final DimensionBehaviour WRAP_CONTENT;

        static {
            DimensionBehaviour dimensionBehaviour = new DimensionBehaviour("FIXED", 0);
            FIXED = dimensionBehaviour;
            DimensionBehaviour dimensionBehaviour2 = new DimensionBehaviour("WRAP_CONTENT", 1);
            WRAP_CONTENT = dimensionBehaviour2;
            DimensionBehaviour dimensionBehaviour3 = new DimensionBehaviour("MATCH_CONSTRAINT", 2);
            MATCH_CONSTRAINT = dimensionBehaviour3;
            DimensionBehaviour dimensionBehaviour4 = new DimensionBehaviour("MATCH_PARENT", 3);
            MATCH_PARENT = dimensionBehaviour4;
            $VALUES = new DimensionBehaviour[]{dimensionBehaviour, dimensionBehaviour2, dimensionBehaviour3, dimensionBehaviour4};
        }

        public static DimensionBehaviour valueOf(String str) {
            return (DimensionBehaviour) Enum.valueOf(DimensionBehaviour.class, str);
        }

        public static DimensionBehaviour[] values() {
            return (DimensionBehaviour[]) $VALUES.clone();
        }
    }

    public ConstraintWidget() {
        this.measured = false;
        this.mHorizontalRun = null;
        this.mVerticalRun = null;
        this.isTerminalWidget = new boolean[]{true, true};
        this.mMeasureRequested = true;
        this.mWidthOverride = -1;
        this.mHeightOverride = -1;
        this.frame = new WidgetFrame(this);
        this.mResolvedHorizontal = false;
        this.mResolvedVertical = false;
        this.mHorizontalSolvingPass = false;
        this.mVerticalSolvingPass = false;
        this.mHorizontalResolution = -1;
        this.mVerticalResolution = -1;
        this.mWrapBehaviorInParent = 0;
        this.mMatchConstraintDefaultWidth = 0;
        this.mMatchConstraintDefaultHeight = 0;
        this.mResolvedMatchConstraintDefault = new int[2];
        this.mMatchConstraintMinWidth = 0;
        this.mMatchConstraintMaxWidth = 0;
        this.mMatchConstraintPercentWidth = 1.0f;
        this.mMatchConstraintMinHeight = 0;
        this.mMatchConstraintMaxHeight = 0;
        this.mMatchConstraintPercentHeight = 1.0f;
        this.mResolvedDimensionRatioSide = -1;
        this.mResolvedDimensionRatio = 1.0f;
        this.mMaxDimension = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE};
        this.mCircleConstraintAngle = Float.NaN;
        this.mHasBaseline = false;
        this.mInVirtualLayout = false;
        this.mLastHorizontalMeasureSpec = 0;
        this.mLastVerticalMeasureSpec = 0;
        ConstraintAnchor constraintAnchor = new ConstraintAnchor(this, 2);
        this.mLeft = constraintAnchor;
        ConstraintAnchor constraintAnchor2 = new ConstraintAnchor(this, 3);
        this.mTop = constraintAnchor2;
        ConstraintAnchor constraintAnchor3 = new ConstraintAnchor(this, 4);
        this.mRight = constraintAnchor3;
        ConstraintAnchor constraintAnchor4 = new ConstraintAnchor(this, 5);
        this.mBottom = constraintAnchor4;
        ConstraintAnchor constraintAnchor5 = new ConstraintAnchor(this, 6);
        this.mBaseline = constraintAnchor5;
        this.mCenterX = new ConstraintAnchor(this, 8);
        this.mCenterY = new ConstraintAnchor(this, 9);
        ConstraintAnchor constraintAnchor6 = new ConstraintAnchor(this, 7);
        this.mCenter = constraintAnchor6;
        this.mListAnchors = new ConstraintAnchor[]{constraintAnchor, constraintAnchor3, constraintAnchor2, constraintAnchor4, constraintAnchor5, constraintAnchor6};
        this.mAnchors = new ArrayList();
        this.mIsInBarrier = new boolean[2];
        DimensionBehaviour dimensionBehaviour = DimensionBehaviour.FIXED;
        this.mListDimensionBehaviors = new DimensionBehaviour[]{dimensionBehaviour, dimensionBehaviour};
        this.mParent = null;
        this.mWidth = 0;
        this.mHeight = 0;
        this.mDimensionRatio = RecyclerView.DECELERATION_RATE;
        this.mDimensionRatioSide = -1;
        this.mX = 0;
        this.mY = 0;
        this.mBaselineDistance = 0;
        this.mHorizontalBiasPercent = 0.5f;
        this.mVerticalBiasPercent = 0.5f;
        this.mVisibility = 0;
        this.mAnimated = false;
        this.mDebugName = null;
        this.mHorizontalChainStyle = 0;
        this.mVerticalChainStyle = 0;
        this.mWeight = new float[]{-1.0f, -1.0f};
        this.mListNextMatchConstraintsWidget = new ConstraintWidget[]{null, null};
        this.mNextChainWidget = new ConstraintWidget[]{null, null};
        this.mHorizontalNextWidget = null;
        this.mVerticalNextWidget = null;
        this.horizontalGroup = -1;
        this.verticalGroup = -1;
        addAnchors();
    }

    public static void serializeAttribute(StringBuilder sb, String str, float f, float f2) {
        if (f == f2) {
            return;
        }
        sb.append(str);
        sb.append(" :   ");
        sb.append(f);
        sb.append(",\n");
    }

    public final void addAnchors() {
        ConstraintAnchor constraintAnchor = this.mLeft;
        ArrayList arrayList = this.mAnchors;
        arrayList.add(constraintAnchor);
        arrayList.add(this.mTop);
        arrayList.add(this.mRight);
        arrayList.add(this.mBottom);
        arrayList.add(this.mCenterX);
        arrayList.add(this.mCenterY);
        arrayList.add(this.mCenter);
        arrayList.add(this.mBaseline);
    }

    public final void addChildrenToSolverByDependency(ConstraintWidgetContainer constraintWidgetContainer, LinearSystem linearSystem, HashSet hashSet, int i, boolean z) {
        if (z) {
            if (!hashSet.contains(this)) {
                return;
            }
            Chain.checkMatchParent(constraintWidgetContainer, linearSystem, this);
            hashSet.remove(this);
            addToSolver(linearSystem, constraintWidgetContainer.optimizeFor(64));
        }
        if (i == 0) {
            HashSet hashSet2 = this.mLeft.mDependents;
            if (hashSet2 != null) {
                Iterator it = hashSet2.iterator();
                while (it.hasNext()) {
                    ((ConstraintAnchor) it.next()).mOwner.addChildrenToSolverByDependency(constraintWidgetContainer, linearSystem, hashSet, i, true);
                }
            }
            HashSet hashSet3 = this.mRight.mDependents;
            if (hashSet3 != null) {
                Iterator it2 = hashSet3.iterator();
                while (it2.hasNext()) {
                    ((ConstraintAnchor) it2.next()).mOwner.addChildrenToSolverByDependency(constraintWidgetContainer, linearSystem, hashSet, i, true);
                }
                return;
            }
            return;
        }
        HashSet hashSet4 = this.mTop.mDependents;
        if (hashSet4 != null) {
            Iterator it3 = hashSet4.iterator();
            while (it3.hasNext()) {
                ((ConstraintAnchor) it3.next()).mOwner.addChildrenToSolverByDependency(constraintWidgetContainer, linearSystem, hashSet, i, true);
            }
        }
        HashSet hashSet5 = this.mBottom.mDependents;
        if (hashSet5 != null) {
            Iterator it4 = hashSet5.iterator();
            while (it4.hasNext()) {
                ((ConstraintAnchor) it4.next()).mOwner.addChildrenToSolverByDependency(constraintWidgetContainer, linearSystem, hashSet, i, true);
            }
        }
        HashSet hashSet6 = this.mBaseline.mDependents;
        if (hashSet6 != null) {
            Iterator it5 = hashSet6.iterator();
            while (it5.hasNext()) {
                ((ConstraintAnchor) it5.next()).mOwner.addChildrenToSolverByDependency(constraintWidgetContainer, linearSystem, hashSet, i, true);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0048, code lost:
    
        if (r12 != 3) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:263:0x05e7, code lost:
    
        if (r60.mVisibility == r9) goto L382;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x040f  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0420  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0434  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x043d  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0456  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0471  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x04c2  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x04cf  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x04ff  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x054a  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x05ab  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x05b1  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0675  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x06d1  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x05ad  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x04da  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x04c9  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x041a  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x03f9  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:364:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02a7  */
    /* JADX WARN: Type inference failed for: r12v36 */
    /* JADX WARN: Type inference failed for: r12v37, types: [int] */
    /* JADX WARN: Type inference failed for: r12v42 */
    /* JADX WARN: Type inference failed for: r13v50, types: [androidx.constraintlayout.core.widgets.ConstraintWidgetContainer] */
    /* JADX WARN: Type inference failed for: r18v14 */
    /* JADX WARN: Type inference failed for: r18v15 */
    /* JADX WARN: Type inference failed for: r18v18 */
    /* JADX WARN: Type inference failed for: r18v2 */
    /* JADX WARN: Type inference failed for: r18v9, types: [boolean] */
    /* JADX WARN: Type inference failed for: r20v11 */
    /* JADX WARN: Type inference failed for: r20v13 */
    /* JADX WARN: Type inference failed for: r20v14 */
    /* JADX WARN: Type inference failed for: r20v2 */
    /* JADX WARN: Type inference failed for: r27v3 */
    /* JADX WARN: Type inference failed for: r27v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r27v7 */
    /* JADX WARN: Type inference failed for: r27v8 */
    /* JADX WARN: Type inference failed for: r27v9 */
    /* JADX WARN: Type inference failed for: r60v0, types: [androidx.constraintlayout.core.widgets.ConstraintWidget] */
    /* JADX WARN: Type inference failed for: r9v12, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void addToSolver(LinearSystem linearSystem, boolean z) {
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        ?? r20;
        ?? r18;
        int i;
        boolean z6;
        boolean z7;
        ConstraintWidget constraintWidget;
        ConstraintWidget constraintWidget2;
        boolean[] zArr;
        ConstraintAnchor constraintAnchor;
        boolean[] zArr2;
        ConstraintAnchor constraintAnchor2;
        boolean z8;
        boolean z9;
        int i2;
        int i3;
        float f;
        SolverVariable solverVariable;
        SolverVariable solverVariable2;
        boolean z10;
        int i4;
        int i5;
        boolean z11;
        int i6;
        boolean z12;
        boolean z13;
        ConstraintAnchor constraintAnchor3;
        boolean z14;
        boolean z15;
        SolverVariable solverVariable3;
        DimensionBehaviour dimensionBehaviour;
        SolverVariable solverVariable4;
        ConstraintAnchor constraintAnchor4;
        int i7;
        boolean z16;
        DimensionBehaviour dimensionBehaviour2;
        ConstraintAnchor constraintAnchor5;
        boolean z17;
        SolverVariable solverVariable5;
        ConstraintAnchor constraintAnchor6;
        SolverVariable solverVariable6;
        SolverVariable solverVariable7;
        boolean z18;
        boolean z19;
        boolean[] zArr3;
        SolverVariable solverVariable8;
        SolverVariable solverVariable9;
        SolverVariable solverVariable10;
        int i8;
        int i9;
        int i10;
        int i11;
        SolverVariable solverVariable11;
        SolverVariable solverVariable12;
        ?? r27;
        VerticalWidgetRun verticalWidgetRun;
        DependencyNode dependencyNode;
        ConstraintWidget constraintWidget3;
        HorizontalWidgetRun horizontalWidgetRun;
        DependencyNode dependencyNode2;
        int i12;
        boolean isInHorizontalChain;
        ?? r12;
        boolean isInVerticalChain;
        HorizontalWidgetRun horizontalWidgetRun2;
        VerticalWidgetRun verticalWidgetRun2;
        boolean z20;
        LinearSystem linearSystem2 = linearSystem;
        ConstraintAnchor constraintAnchor7 = this.mLeft;
        SolverVariable createObjectVariable = linearSystem2.createObjectVariable(constraintAnchor7);
        ConstraintAnchor constraintAnchor8 = this.mRight;
        SolverVariable createObjectVariable2 = linearSystem2.createObjectVariable(constraintAnchor8);
        ConstraintAnchor constraintAnchor9 = this.mTop;
        SolverVariable createObjectVariable3 = linearSystem2.createObjectVariable(constraintAnchor9);
        ConstraintAnchor constraintAnchor10 = this.mBottom;
        SolverVariable createObjectVariable4 = linearSystem2.createObjectVariable(constraintAnchor10);
        ConstraintAnchor constraintAnchor11 = this.mBaseline;
        SolverVariable createObjectVariable5 = linearSystem2.createObjectVariable(constraintAnchor11);
        ConstraintWidget constraintWidget4 = this.mParent;
        DimensionBehaviour dimensionBehaviour3 = DimensionBehaviour.WRAP_CONTENT;
        if (constraintWidget4 != null) {
            DimensionBehaviour[] dimensionBehaviourArr = constraintWidget4.mListDimensionBehaviors;
            r18 = 0;
            z3 = false;
            r18 = 0;
            z5 = dimensionBehaviourArr[0] == dimensionBehaviour3;
            boolean z21 = dimensionBehaviourArr[1] == dimensionBehaviour3;
            int i13 = this.mWrapBehaviorInParent;
            if (i13 != 1) {
                boolean z22 = true;
                if (i13 != 2) {
                    z2 = z22;
                } else {
                    z5 = false;
                }
                z4 = z21;
                r20 = z22;
            } else {
                r20 = 1;
                z4 = false;
            }
            i = this.mVisibility;
            boolean z23 = z4;
            boolean[] zArr4 = this.mIsInBarrier;
            if (i == 8 || this.mAnimated) {
                z6 = z5;
            } else {
                ArrayList arrayList = this.mAnchors;
                int size = arrayList.size();
                z6 = z5;
                int i14 = r18;
                while (true) {
                    if (i14 < size) {
                        int i15 = size;
                        HashSet hashSet = ((ConstraintAnchor) arrayList.get(i14)).mDependents;
                        if (hashSet != null && hashSet.size() > 0) {
                            break;
                        }
                        i14++;
                        size = i15;
                    } else if (!zArr4[r18] && !zArr4[r20]) {
                        return;
                    }
                }
            }
            z7 = this.mResolvedHorizontal;
            if (!z7 || this.mResolvedVertical) {
                if (z7) {
                    linearSystem2.addEquality(createObjectVariable, this.mX);
                    linearSystem2.addEquality(createObjectVariable2, this.mX + this.mWidth);
                    if (z6 && (constraintWidget2 = this.mParent) != null) {
                        ConstraintWidgetContainer constraintWidgetContainer = (ConstraintWidgetContainer) constraintWidget2;
                        WeakReference weakReference = constraintWidgetContainer.mHorizontalWrapMin;
                        if (weakReference == null || weakReference.get() == null || constraintAnchor7.getFinalValue() > ((ConstraintAnchor) constraintWidgetContainer.mHorizontalWrapMin.get()).getFinalValue()) {
                            constraintWidgetContainer.mHorizontalWrapMin = new WeakReference(constraintAnchor7);
                        }
                        WeakReference weakReference2 = constraintWidgetContainer.mHorizontalWrapMax;
                        if (weakReference2 == null || weakReference2.get() == null || constraintAnchor8.getFinalValue() > ((ConstraintAnchor) constraintWidgetContainer.mHorizontalWrapMax.get()).getFinalValue()) {
                            constraintWidgetContainer.mHorizontalWrapMax = new WeakReference(constraintAnchor8);
                        }
                    }
                }
                if (this.mResolvedVertical) {
                    linearSystem2.addEquality(createObjectVariable3, this.mY);
                    linearSystem2.addEquality(createObjectVariable4, this.mY + this.mHeight);
                    HashSet hashSet2 = constraintAnchor11.mDependents;
                    if (hashSet2 != null && hashSet2.size() > 0) {
                        linearSystem2.addEquality(createObjectVariable5, this.mY + this.mBaselineDistance);
                    }
                    if (z23 && (constraintWidget = this.mParent) != null) {
                        ConstraintWidgetContainer constraintWidgetContainer2 = (ConstraintWidgetContainer) constraintWidget;
                        WeakReference weakReference3 = constraintWidgetContainer2.mVerticalWrapMin;
                        if (weakReference3 == null || weakReference3.get() == null || constraintAnchor9.getFinalValue() > ((ConstraintAnchor) constraintWidgetContainer2.mVerticalWrapMin.get()).getFinalValue()) {
                            constraintWidgetContainer2.mVerticalWrapMin = new WeakReference(constraintAnchor9);
                        }
                        WeakReference weakReference4 = constraintWidgetContainer2.mVerticalWrapMax;
                        if (weakReference4 == null || weakReference4.get() == null || constraintAnchor10.getFinalValue() > ((ConstraintAnchor) constraintWidgetContainer2.mVerticalWrapMax.get()).getFinalValue()) {
                            constraintWidgetContainer2.mVerticalWrapMax = new WeakReference(constraintAnchor10);
                        }
                    }
                }
                if (this.mResolvedHorizontal && this.mResolvedVertical) {
                    boolean z24 = r18;
                    this.mResolvedHorizontal = z24;
                    this.mResolvedVertical = z24;
                    return;
                }
            }
            zArr = this.isTerminalWidget;
            if (z || (horizontalWidgetRun2 = this.mHorizontalRun) == null || (verticalWidgetRun2 = this.mVerticalRun) == null) {
                constraintAnchor = constraintAnchor11;
                zArr2 = zArr;
            } else {
                constraintAnchor = constraintAnchor11;
                DependencyNode dependencyNode3 = horizontalWidgetRun2.start;
                zArr2 = zArr;
                if (dependencyNode3.resolved && horizontalWidgetRun2.end.resolved && verticalWidgetRun2.start.resolved && verticalWidgetRun2.end.resolved) {
                    linearSystem2.addEquality(createObjectVariable, dependencyNode3.value);
                    linearSystem2.addEquality(createObjectVariable2, this.mHorizontalRun.end.value);
                    linearSystem2.addEquality(createObjectVariable3, this.mVerticalRun.start.value);
                    linearSystem2.addEquality(createObjectVariable4, this.mVerticalRun.end.value);
                    linearSystem2.addEquality(createObjectVariable5, this.mVerticalRun.baseline.value);
                    if (this.mParent != null) {
                        if (z6 && zArr2[0] && !isInHorizontalChain()) {
                            linearSystem2.addGreaterThan(linearSystem2.createObjectVariable(this.mParent.mRight), createObjectVariable2, 0, 8);
                        }
                        if (z23 && zArr2[r20] && !isInVerticalChain()) {
                            z20 = false;
                            linearSystem2.addGreaterThan(linearSystem2.createObjectVariable(this.mParent.mBottom), createObjectVariable4, 0, 8);
                            this.mResolvedHorizontal = z20;
                            this.mResolvedVertical = z20;
                            return;
                        }
                    }
                    z20 = false;
                    this.mResolvedHorizontal = z20;
                    this.mResolvedVertical = z20;
                    return;
                }
            }
            if (this.mParent == null) {
                if (isChainHead(0)) {
                    ((ConstraintWidgetContainer) this.mParent).addChain(this, 0);
                    isInHorizontalChain = r20;
                    r12 = isInHorizontalChain;
                } else {
                    isInHorizontalChain = isInHorizontalChain();
                    r12 = r20;
                }
                if (isChainHead(r12)) {
                    ((ConstraintWidgetContainer) this.mParent).addChain(this, r12);
                    isInVerticalChain = true;
                } else {
                    isInVerticalChain = isInVerticalChain();
                }
                if (!isInHorizontalChain && z6 && this.mVisibility != 8 && constraintAnchor7.mTarget == null && constraintAnchor8.mTarget == null) {
                    constraintAnchor2 = constraintAnchor7;
                    linearSystem2.addGreaterThan(linearSystem2.createObjectVariable(this.mParent.mRight), createObjectVariable2, 0, 1);
                } else {
                    constraintAnchor2 = constraintAnchor7;
                }
                if (!isInVerticalChain && z23 && this.mVisibility != 8 && constraintAnchor9.mTarget == null && constraintAnchor10.mTarget == null && constraintAnchor == null) {
                    linearSystem2.addGreaterThan(linearSystem2.createObjectVariable(this.mParent.mBottom), createObjectVariable4, 0, 1);
                }
                z8 = isInVerticalChain;
                z9 = isInHorizontalChain;
            } else {
                constraintAnchor2 = constraintAnchor7;
                z8 = false;
                z9 = false;
            }
            i2 = this.mWidth;
            i3 = this.mMinWidth;
            if (i2 >= i3) {
                i3 = i2;
            }
            int i16 = this.mHeight;
            boolean z25 = z8;
            int i17 = this.mMinHeight;
            int i18 = i16 >= i17 ? i17 : i16;
            DimensionBehaviour[] dimensionBehaviourArr2 = this.mListDimensionBehaviors;
            DimensionBehaviour dimensionBehaviour4 = dimensionBehaviourArr2[0];
            DimensionBehaviour dimensionBehaviour5 = DimensionBehaviour.MATCH_CONSTRAINT;
            boolean z26 = dimensionBehaviour4 == dimensionBehaviour5;
            DimensionBehaviour dimensionBehaviour6 = dimensionBehaviourArr2[1];
            boolean z27 = dimensionBehaviour6 == dimensionBehaviour5;
            int i19 = this.mDimensionRatioSide;
            this.mResolvedDimensionRatioSide = i19;
            f = this.mDimensionRatio;
            this.mResolvedDimensionRatio = f;
            int i20 = this.mMatchConstraintDefaultWidth;
            int i21 = this.mMatchConstraintDefaultHeight;
            if (f <= RecyclerView.DECELERATION_RATE) {
                solverVariable = createObjectVariable4;
                if (this.mVisibility != 8) {
                    i4 = (dimensionBehaviour4 == dimensionBehaviour5 && i20 == 0) ? 3 : i20;
                    int i22 = (dimensionBehaviour6 == dimensionBehaviour5 && i21 == 0) ? 3 : i21;
                    if (dimensionBehaviour4 == dimensionBehaviour5 && dimensionBehaviour6 == dimensionBehaviour5) {
                        solverVariable2 = createObjectVariable5;
                        if (i4 == 3 && i22 == 3) {
                            if (i19 == -1) {
                                if (z26 && !z27) {
                                    this.mResolvedDimensionRatioSide = 0;
                                } else if (!z26 && z27) {
                                    this.mResolvedDimensionRatioSide = 1;
                                    if (i19 == -1) {
                                        this.mResolvedDimensionRatio = 1.0f / f;
                                    }
                                }
                            }
                            if (this.mResolvedDimensionRatioSide == 0 && (!constraintAnchor9.isConnected() || !constraintAnchor10.isConnected())) {
                                this.mResolvedDimensionRatioSide = 1;
                            } else if (this.mResolvedDimensionRatioSide == 1 && (!constraintAnchor2.isConnected() || !constraintAnchor8.isConnected())) {
                                this.mResolvedDimensionRatioSide = 0;
                            }
                            if (this.mResolvedDimensionRatioSide == -1 && (!constraintAnchor9.isConnected() || !constraintAnchor10.isConnected() || !constraintAnchor2.isConnected() || !constraintAnchor8.isConnected())) {
                                if (constraintAnchor9.isConnected() && constraintAnchor10.isConnected()) {
                                    this.mResolvedDimensionRatioSide = 0;
                                } else if (constraintAnchor2.isConnected() && constraintAnchor8.isConnected()) {
                                    this.mResolvedDimensionRatio = 1.0f / this.mResolvedDimensionRatio;
                                    this.mResolvedDimensionRatioSide = 1;
                                }
                            }
                            if (this.mResolvedDimensionRatioSide == -1) {
                                int i23 = this.mMatchConstraintMinWidth;
                                if (i23 > 0 && this.mMatchConstraintMinHeight == 0) {
                                    this.mResolvedDimensionRatioSide = 0;
                                } else if (i23 == 0 && this.mMatchConstraintMinHeight > 0) {
                                    this.mResolvedDimensionRatio = 1.0f / this.mResolvedDimensionRatio;
                                    this.mResolvedDimensionRatioSide = 1;
                                }
                            }
                            z10 = z6;
                            z11 = true;
                            i5 = i22;
                            int[] iArr = this.mResolvedMatchConstraintDefault;
                            iArr[0] = i4;
                            iArr[1] = i5;
                            if (z11) {
                                i6 = -1;
                            } else {
                                int i24 = this.mResolvedDimensionRatioSide;
                                i6 = -1;
                                if (i24 == 0 || i24 == -1) {
                                    z12 = true;
                                    boolean z28 = !z11 && ((i12 = this.mResolvedDimensionRatioSide) == 1 || i12 == i6);
                                    z13 = this.mListDimensionBehaviors[0] != dimensionBehaviour3 && (this instanceof ConstraintWidgetContainer);
                                    if (z13) {
                                        i3 = 0;
                                    }
                                    constraintAnchor3 = this.mCenter;
                                    z14 = !constraintAnchor3.isConnected();
                                    z15 = zArr4[0];
                                    boolean z29 = zArr4[1];
                                    if (this.mHorizontalResolution != 2 && !this.mResolvedHorizontal) {
                                        if (z && (horizontalWidgetRun = this.mHorizontalRun) != null) {
                                            dependencyNode2 = horizontalWidgetRun.start;
                                            if (dependencyNode2.resolved && horizontalWidgetRun.end.resolved) {
                                                if (z) {
                                                    linearSystem2.addEquality(createObjectVariable, dependencyNode2.value);
                                                    linearSystem2.addEquality(createObjectVariable2, this.mHorizontalRun.end.value);
                                                    if (this.mParent != null && z10 && zArr2[0] && !isInHorizontalChain()) {
                                                        linearSystem2.addGreaterThan(linearSystem2.createObjectVariable(this.mParent.mRight), createObjectVariable2, 0, 8);
                                                    }
                                                }
                                            }
                                        }
                                        ConstraintWidget constraintWidget5 = this.mParent;
                                        SolverVariable createObjectVariable6 = constraintWidget5 == null ? linearSystem2.createObjectVariable(constraintWidget5.mRight) : null;
                                        ConstraintWidget constraintWidget6 = this.mParent;
                                        SolverVariable createObjectVariable7 = constraintWidget6 == null ? linearSystem2.createObjectVariable(constraintWidget6.mLeft) : null;
                                        boolean z30 = zArr2[0];
                                        DimensionBehaviour[] dimensionBehaviourArr3 = this.mListDimensionBehaviors;
                                        i7 = i4;
                                        boolean z31 = z9;
                                        z18 = z10;
                                        boolean z32 = z14;
                                        constraintAnchor4 = constraintAnchor3;
                                        dimensionBehaviour = dimensionBehaviour5;
                                        constraintAnchor5 = constraintAnchor;
                                        solverVariable5 = createObjectVariable3;
                                        constraintAnchor6 = constraintAnchor10;
                                        solverVariable4 = createObjectVariable2;
                                        dimensionBehaviour2 = dimensionBehaviour3;
                                        solverVariable6 = solverVariable;
                                        solverVariable7 = solverVariable2;
                                        solverVariable3 = createObjectVariable;
                                        linearSystem2 = linearSystem;
                                        zArr3 = zArr2;
                                        applyConstraints(linearSystem2, true, z18, z23, z30, createObjectVariable7, createObjectVariable6, dimensionBehaviourArr3[0], z13, this.mLeft, this.mRight, this.mX, i3, this.mMinWidth, this.mMaxDimension[0], this.mHorizontalBiasPercent, z12, dimensionBehaviourArr3[1] == dimensionBehaviour5, z31, z25, z15, i7, i5, this.mMatchConstraintMinWidth, this.mMatchConstraintMaxWidth, this.mMatchConstraintPercentWidth, z32);
                                        z17 = z25;
                                        z16 = z31;
                                        z23 = z23;
                                        z19 = z32;
                                        if (z && (verticalWidgetRun = this.mVerticalRun) != null) {
                                            dependencyNode = verticalWidgetRun.start;
                                            if (dependencyNode.resolved && verticalWidgetRun.end.resolved) {
                                                int i25 = dependencyNode.value;
                                                solverVariable8 = solverVariable5;
                                                linearSystem2.addEquality(solverVariable8, i25);
                                                solverVariable9 = solverVariable6;
                                                linearSystem2.addEquality(solverVariable9, this.mVerticalRun.end.value);
                                                solverVariable10 = solverVariable7;
                                                linearSystem2.addEquality(solverVariable10, this.mVerticalRun.baseline.value);
                                                constraintWidget3 = this.mParent;
                                                if (constraintWidget3 == null && !z17 && z23) {
                                                    i10 = 1;
                                                    if (zArr3[1]) {
                                                        i8 = 0;
                                                        i9 = 8;
                                                        linearSystem2.addGreaterThan(linearSystem2.createObjectVariable(constraintWidget3.mBottom), solverVariable9, 0, 8);
                                                    } else {
                                                        i8 = 0;
                                                        i9 = 8;
                                                    }
                                                } else {
                                                    i8 = 0;
                                                    i9 = 8;
                                                    i10 = 1;
                                                }
                                                i11 = i8;
                                                if ((this.mVerticalResolution == 2 ? i8 : i11) != 0 || this.mResolvedVertical) {
                                                    solverVariable11 = solverVariable8;
                                                    solverVariable12 = solverVariable9;
                                                } else {
                                                    int i26 = (this.mListDimensionBehaviors[i10] == dimensionBehaviour2 && (this instanceof ConstraintWidgetContainer)) ? i10 : i8;
                                                    int i27 = i26 != 0 ? i8 : i18;
                                                    ConstraintWidget constraintWidget7 = this.mParent;
                                                    SolverVariable createObjectVariable8 = constraintWidget7 != null ? linearSystem2.createObjectVariable(constraintWidget7.mBottom) : null;
                                                    ConstraintWidget constraintWidget8 = this.mParent;
                                                    SolverVariable createObjectVariable9 = constraintWidget8 != null ? linearSystem2.createObjectVariable(constraintWidget8.mTop) : null;
                                                    int i28 = this.mBaselineDistance;
                                                    if (i28 <= 0) {
                                                        r27 = z19;
                                                    }
                                                    ConstraintAnchor constraintAnchor12 = constraintAnchor5;
                                                    if (constraintAnchor12.mTarget != null) {
                                                        linearSystem2.addEquality(solverVariable10, solverVariable8, i28, i9);
                                                        linearSystem2.addEquality(solverVariable10, linearSystem2.createObjectVariable(constraintAnchor12.mTarget), constraintAnchor12.getMargin(), i9);
                                                        if (z23) {
                                                            linearSystem2.addGreaterThan(createObjectVariable8, linearSystem2.createObjectVariable(constraintAnchor6), i8, 5);
                                                        }
                                                        r27 = i8;
                                                    } else if (this.mVisibility == i9) {
                                                        linearSystem2.addEquality(solverVariable10, solverVariable8, constraintAnchor12.getMargin(), i9);
                                                        r27 = z19;
                                                    } else {
                                                        linearSystem2.addEquality(solverVariable10, solverVariable8, i28, i9);
                                                        r27 = z19;
                                                    }
                                                    boolean z33 = zArr3[i10];
                                                    DimensionBehaviour[] dimensionBehaviourArr4 = this.mListDimensionBehaviors;
                                                    int i29 = i8;
                                                    solverVariable11 = solverVariable8;
                                                    solverVariable12 = solverVariable9;
                                                    linearSystem2 = linearSystem;
                                                    applyConstraints(linearSystem2, false, z23, z18, z33, createObjectVariable9, createObjectVariable8, dimensionBehaviourArr4[i10], i26, this.mTop, this.mBottom, this.mY, i27, this.mMinHeight, this.mMaxDimension[i10], this.mVerticalBiasPercent, z28, dimensionBehaviourArr4[i29] == dimensionBehaviour ? 1 : i29, z17, z16, z29, i5, i7, this.mMatchConstraintMinHeight, this.mMatchConstraintMaxHeight, this.mMatchConstraintPercentHeight, r27);
                                                }
                                                if (z11) {
                                                    int i30 = this.mResolvedDimensionRatioSide;
                                                    float f2 = this.mResolvedDimensionRatio;
                                                    if (i30 == 1) {
                                                        ArrayRow createRow = linearSystem2.createRow();
                                                        createRow.variables.put(solverVariable12, -1.0f);
                                                        createRow.variables.put(solverVariable11, 1.0f);
                                                        createRow.variables.put(solverVariable4, f2);
                                                        createRow.variables.put(solverVariable3, -f2);
                                                        linearSystem2.addConstraint(createRow);
                                                    } else {
                                                        ArrayRow createRow2 = linearSystem2.createRow();
                                                        createRow2.variables.put(solverVariable4, -1.0f);
                                                        createRow2.variables.put(solverVariable3, 1.0f);
                                                        createRow2.variables.put(solverVariable12, f2);
                                                        createRow2.variables.put(solverVariable11, -f2);
                                                        linearSystem2.addConstraint(createRow2);
                                                    }
                                                }
                                                if (constraintAnchor4.isConnected()) {
                                                    ConstraintAnchor constraintAnchor13 = constraintAnchor4;
                                                    ConstraintWidget constraintWidget9 = constraintAnchor13.mTarget.mOwner;
                                                    float radians = (float) Math.toRadians(this.mCircleConstraintAngle + 90.0f);
                                                    int margin = constraintAnchor13.getMargin();
                                                    SolverVariable createObjectVariable10 = linearSystem2.createObjectVariable(getAnchor(2));
                                                    SolverVariable createObjectVariable11 = linearSystem2.createObjectVariable(getAnchor(3));
                                                    SolverVariable createObjectVariable12 = linearSystem2.createObjectVariable(getAnchor(4));
                                                    SolverVariable createObjectVariable13 = linearSystem2.createObjectVariable(getAnchor(5));
                                                    SolverVariable createObjectVariable14 = linearSystem2.createObjectVariable(constraintWidget9.getAnchor(2));
                                                    SolverVariable createObjectVariable15 = linearSystem2.createObjectVariable(constraintWidget9.getAnchor(3));
                                                    SolverVariable createObjectVariable16 = linearSystem2.createObjectVariable(constraintWidget9.getAnchor(4));
                                                    SolverVariable createObjectVariable17 = linearSystem2.createObjectVariable(constraintWidget9.getAnchor(5));
                                                    ArrayRow createRow3 = linearSystem2.createRow();
                                                    double d = radians;
                                                    double sin = Math.sin(d);
                                                    double d2 = margin;
                                                    createRow3.variables.put(createObjectVariable15, 0.5f);
                                                    createRow3.variables.put(createObjectVariable17, 0.5f);
                                                    createRow3.variables.put(createObjectVariable11, -0.5f);
                                                    createRow3.variables.put(createObjectVariable13, -0.5f);
                                                    createRow3.mConstantValue = -((float) (sin * d2));
                                                    linearSystem2.addConstraint(createRow3);
                                                    ArrayRow createRow4 = linearSystem2.createRow();
                                                    float cos = (float) (Math.cos(d) * d2);
                                                    createRow4.variables.put(createObjectVariable14, 0.5f);
                                                    createRow4.variables.put(createObjectVariable16, 0.5f);
                                                    createRow4.variables.put(createObjectVariable10, -0.5f);
                                                    createRow4.variables.put(createObjectVariable12, -0.5f);
                                                    createRow4.mConstantValue = -cos;
                                                    linearSystem2.addConstraint(createRow4);
                                                }
                                                this.mResolvedHorizontal = false;
                                                this.mResolvedVertical = false;
                                            }
                                        }
                                        solverVariable8 = solverVariable5;
                                        solverVariable9 = solverVariable6;
                                        solverVariable10 = solverVariable7;
                                        i8 = 0;
                                        i9 = 8;
                                        i10 = 1;
                                        i11 = 1;
                                        if ((this.mVerticalResolution == 2 ? i8 : i11) != 0) {
                                        }
                                        solverVariable11 = solverVariable8;
                                        solverVariable12 = solverVariable9;
                                        if (z11) {
                                        }
                                        if (constraintAnchor4.isConnected()) {
                                        }
                                        this.mResolvedHorizontal = false;
                                        this.mResolvedVertical = false;
                                    }
                                    solverVariable3 = createObjectVariable;
                                    dimensionBehaviour = dimensionBehaviour5;
                                    solverVariable4 = createObjectVariable2;
                                    constraintAnchor4 = constraintAnchor3;
                                    i7 = i4;
                                    z16 = z9;
                                    dimensionBehaviour2 = dimensionBehaviour3;
                                    constraintAnchor5 = constraintAnchor;
                                    z17 = z25;
                                    solverVariable5 = createObjectVariable3;
                                    constraintAnchor6 = constraintAnchor10;
                                    solverVariable6 = solverVariable;
                                    solverVariable7 = solverVariable2;
                                    z18 = z10;
                                    z19 = z14;
                                    zArr3 = zArr2;
                                    if (z) {
                                        dependencyNode = verticalWidgetRun.start;
                                        if (dependencyNode.resolved) {
                                            int i252 = dependencyNode.value;
                                            solverVariable8 = solverVariable5;
                                            linearSystem2.addEquality(solverVariable8, i252);
                                            solverVariable9 = solverVariable6;
                                            linearSystem2.addEquality(solverVariable9, this.mVerticalRun.end.value);
                                            solverVariable10 = solverVariable7;
                                            linearSystem2.addEquality(solverVariable10, this.mVerticalRun.baseline.value);
                                            constraintWidget3 = this.mParent;
                                            if (constraintWidget3 == null) {
                                            }
                                            i8 = 0;
                                            i9 = 8;
                                            i10 = 1;
                                            i11 = i8;
                                            if ((this.mVerticalResolution == 2 ? i8 : i11) != 0) {
                                            }
                                            solverVariable11 = solverVariable8;
                                            solverVariable12 = solverVariable9;
                                            if (z11) {
                                            }
                                            if (constraintAnchor4.isConnected()) {
                                            }
                                            this.mResolvedHorizontal = false;
                                            this.mResolvedVertical = false;
                                        }
                                    }
                                    solverVariable8 = solverVariable5;
                                    solverVariable9 = solverVariable6;
                                    solverVariable10 = solverVariable7;
                                    i8 = 0;
                                    i9 = 8;
                                    i10 = 1;
                                    i11 = 1;
                                    if ((this.mVerticalResolution == 2 ? i8 : i11) != 0) {
                                    }
                                    solverVariable11 = solverVariable8;
                                    solverVariable12 = solverVariable9;
                                    if (z11) {
                                    }
                                    if (constraintAnchor4.isConnected()) {
                                    }
                                    this.mResolvedHorizontal = false;
                                    this.mResolvedVertical = false;
                                }
                            }
                            z12 = false;
                            if (z11) {
                            }
                            if (this.mListDimensionBehaviors[0] != dimensionBehaviour3) {
                            }
                            if (z13) {
                            }
                            constraintAnchor3 = this.mCenter;
                            z14 = !constraintAnchor3.isConnected();
                            z15 = zArr4[0];
                            boolean z292 = zArr4[1];
                            if (this.mHorizontalResolution != 2) {
                                if (z) {
                                    dependencyNode2 = horizontalWidgetRun.start;
                                    if (dependencyNode2.resolved) {
                                        if (z) {
                                        }
                                    }
                                }
                                ConstraintWidget constraintWidget52 = this.mParent;
                                if (constraintWidget52 == null) {
                                }
                                ConstraintWidget constraintWidget62 = this.mParent;
                                if (constraintWidget62 == null) {
                                }
                                boolean z302 = zArr2[0];
                                DimensionBehaviour[] dimensionBehaviourArr32 = this.mListDimensionBehaviors;
                                i7 = i4;
                                boolean z312 = z9;
                                z18 = z10;
                                boolean z322 = z14;
                                constraintAnchor4 = constraintAnchor3;
                                dimensionBehaviour = dimensionBehaviour5;
                                constraintAnchor5 = constraintAnchor;
                                solverVariable5 = createObjectVariable3;
                                constraintAnchor6 = constraintAnchor10;
                                solverVariable4 = createObjectVariable2;
                                dimensionBehaviour2 = dimensionBehaviour3;
                                solverVariable6 = solverVariable;
                                solverVariable7 = solverVariable2;
                                solverVariable3 = createObjectVariable;
                                linearSystem2 = linearSystem;
                                zArr3 = zArr2;
                                applyConstraints(linearSystem2, true, z18, z23, z302, createObjectVariable7, createObjectVariable6, dimensionBehaviourArr32[0], z13, this.mLeft, this.mRight, this.mX, i3, this.mMinWidth, this.mMaxDimension[0], this.mHorizontalBiasPercent, z12, dimensionBehaviourArr32[1] == dimensionBehaviour5, z312, z25, z15, i7, i5, this.mMatchConstraintMinWidth, this.mMatchConstraintMaxWidth, this.mMatchConstraintPercentWidth, z322);
                                z17 = z25;
                                z16 = z312;
                                z23 = z23;
                                z19 = z322;
                                if (z) {
                                }
                                solverVariable8 = solverVariable5;
                                solverVariable9 = solverVariable6;
                                solverVariable10 = solverVariable7;
                                i8 = 0;
                                i9 = 8;
                                i10 = 1;
                                i11 = 1;
                                if ((this.mVerticalResolution == 2 ? i8 : i11) != 0) {
                                }
                                solverVariable11 = solverVariable8;
                                solverVariable12 = solverVariable9;
                                if (z11) {
                                }
                                if (constraintAnchor4.isConnected()) {
                                }
                                this.mResolvedHorizontal = false;
                                this.mResolvedVertical = false;
                            }
                            solverVariable3 = createObjectVariable;
                            dimensionBehaviour = dimensionBehaviour5;
                            solverVariable4 = createObjectVariable2;
                            constraintAnchor4 = constraintAnchor3;
                            i7 = i4;
                            z16 = z9;
                            dimensionBehaviour2 = dimensionBehaviour3;
                            constraintAnchor5 = constraintAnchor;
                            z17 = z25;
                            solverVariable5 = createObjectVariable3;
                            constraintAnchor6 = constraintAnchor10;
                            solverVariable6 = solverVariable;
                            solverVariable7 = solverVariable2;
                            z18 = z10;
                            z19 = z14;
                            zArr3 = zArr2;
                            if (z) {
                            }
                            solverVariable8 = solverVariable5;
                            solverVariable9 = solverVariable6;
                            solverVariable10 = solverVariable7;
                            i8 = 0;
                            i9 = 8;
                            i10 = 1;
                            i11 = 1;
                            if ((this.mVerticalResolution == 2 ? i8 : i11) != 0) {
                            }
                            solverVariable11 = solverVariable8;
                            solverVariable12 = solverVariable9;
                            if (z11) {
                            }
                            if (constraintAnchor4.isConnected()) {
                            }
                            this.mResolvedHorizontal = false;
                            this.mResolvedVertical = false;
                        }
                    } else {
                        solverVariable2 = createObjectVariable5;
                    }
                    if (dimensionBehaviour4 == dimensionBehaviour5 && i4 == 3) {
                        this.mResolvedDimensionRatioSide = 0;
                        i3 = (int) (i16 * f);
                        z10 = z6;
                        if (dimensionBehaviour6 == dimensionBehaviour5) {
                            z11 = true;
                            i5 = i22;
                            int[] iArr2 = this.mResolvedMatchConstraintDefault;
                            iArr2[0] = i4;
                            iArr2[1] = i5;
                            if (z11) {
                            }
                            z12 = false;
                            if (z11) {
                            }
                            if (this.mListDimensionBehaviors[0] != dimensionBehaviour3) {
                            }
                            if (z13) {
                            }
                            constraintAnchor3 = this.mCenter;
                            z14 = !constraintAnchor3.isConnected();
                            z15 = zArr4[0];
                            boolean z2922 = zArr4[1];
                            if (this.mHorizontalResolution != 2) {
                            }
                            solverVariable3 = createObjectVariable;
                            dimensionBehaviour = dimensionBehaviour5;
                            solverVariable4 = createObjectVariable2;
                            constraintAnchor4 = constraintAnchor3;
                            i7 = i4;
                            z16 = z9;
                            dimensionBehaviour2 = dimensionBehaviour3;
                            constraintAnchor5 = constraintAnchor;
                            z17 = z25;
                            solverVariable5 = createObjectVariable3;
                            constraintAnchor6 = constraintAnchor10;
                            solverVariable6 = solverVariable;
                            solverVariable7 = solverVariable2;
                            z18 = z10;
                            z19 = z14;
                            zArr3 = zArr2;
                            if (z) {
                            }
                            solverVariable8 = solverVariable5;
                            solverVariable9 = solverVariable6;
                            solverVariable10 = solverVariable7;
                            i8 = 0;
                            i9 = 8;
                            i10 = 1;
                            i11 = 1;
                            if ((this.mVerticalResolution == 2 ? i8 : i11) != 0) {
                            }
                            solverVariable11 = solverVariable8;
                            solverVariable12 = solverVariable9;
                            if (z11) {
                            }
                            if (constraintAnchor4.isConnected()) {
                            }
                            this.mResolvedHorizontal = false;
                            this.mResolvedVertical = false;
                        }
                        i4 = 4;
                        z11 = false;
                        i5 = i22;
                        int[] iArr22 = this.mResolvedMatchConstraintDefault;
                        iArr22[0] = i4;
                        iArr22[1] = i5;
                        if (z11) {
                        }
                        z12 = false;
                        if (z11) {
                        }
                        if (this.mListDimensionBehaviors[0] != dimensionBehaviour3) {
                        }
                        if (z13) {
                        }
                        constraintAnchor3 = this.mCenter;
                        z14 = !constraintAnchor3.isConnected();
                        z15 = zArr4[0];
                        boolean z29222 = zArr4[1];
                        if (this.mHorizontalResolution != 2) {
                        }
                        solverVariable3 = createObjectVariable;
                        dimensionBehaviour = dimensionBehaviour5;
                        solverVariable4 = createObjectVariable2;
                        constraintAnchor4 = constraintAnchor3;
                        i7 = i4;
                        z16 = z9;
                        dimensionBehaviour2 = dimensionBehaviour3;
                        constraintAnchor5 = constraintAnchor;
                        z17 = z25;
                        solverVariable5 = createObjectVariable3;
                        constraintAnchor6 = constraintAnchor10;
                        solverVariable6 = solverVariable;
                        solverVariable7 = solverVariable2;
                        z18 = z10;
                        z19 = z14;
                        zArr3 = zArr2;
                        if (z) {
                        }
                        solverVariable8 = solverVariable5;
                        solverVariable9 = solverVariable6;
                        solverVariable10 = solverVariable7;
                        i8 = 0;
                        i9 = 8;
                        i10 = 1;
                        i11 = 1;
                        if ((this.mVerticalResolution == 2 ? i8 : i11) != 0) {
                        }
                        solverVariable11 = solverVariable8;
                        solverVariable12 = solverVariable9;
                        if (z11) {
                        }
                        if (constraintAnchor4.isConnected()) {
                        }
                        this.mResolvedHorizontal = false;
                        this.mResolvedVertical = false;
                    }
                    if (dimensionBehaviour6 == dimensionBehaviour5) {
                        if (i22 == 3) {
                            this.mResolvedDimensionRatioSide = 1;
                            if (i19 == -1) {
                                this.mResolvedDimensionRatio = 1.0f / f;
                            }
                            i18 = (int) (this.mResolvedDimensionRatio * i2);
                            if (dimensionBehaviour4 != dimensionBehaviour5) {
                                z10 = z6;
                                i5 = 4;
                                z11 = false;
                                int[] iArr222 = this.mResolvedMatchConstraintDefault;
                                iArr222[0] = i4;
                                iArr222[1] = i5;
                                if (z11) {
                                }
                                z12 = false;
                                if (z11) {
                                }
                                if (this.mListDimensionBehaviors[0] != dimensionBehaviour3) {
                                }
                                if (z13) {
                                }
                                constraintAnchor3 = this.mCenter;
                                z14 = !constraintAnchor3.isConnected();
                                z15 = zArr4[0];
                                boolean z292222 = zArr4[1];
                                if (this.mHorizontalResolution != 2) {
                                }
                                solverVariable3 = createObjectVariable;
                                dimensionBehaviour = dimensionBehaviour5;
                                solverVariable4 = createObjectVariable2;
                                constraintAnchor4 = constraintAnchor3;
                                i7 = i4;
                                z16 = z9;
                                dimensionBehaviour2 = dimensionBehaviour3;
                                constraintAnchor5 = constraintAnchor;
                                z17 = z25;
                                solverVariable5 = createObjectVariable3;
                                constraintAnchor6 = constraintAnchor10;
                                solverVariable6 = solverVariable;
                                solverVariable7 = solverVariable2;
                                z18 = z10;
                                z19 = z14;
                                zArr3 = zArr2;
                                if (z) {
                                }
                                solverVariable8 = solverVariable5;
                                solverVariable9 = solverVariable6;
                                solverVariable10 = solverVariable7;
                                i8 = 0;
                                i9 = 8;
                                i10 = 1;
                                i11 = 1;
                                if ((this.mVerticalResolution == 2 ? i8 : i11) != 0) {
                                }
                                solverVariable11 = solverVariable8;
                                solverVariable12 = solverVariable9;
                                if (z11) {
                                }
                                if (constraintAnchor4.isConnected()) {
                                }
                                this.mResolvedHorizontal = false;
                                this.mResolvedVertical = false;
                            }
                        }
                        z10 = z6;
                        z11 = true;
                        i5 = i22;
                        int[] iArr2222 = this.mResolvedMatchConstraintDefault;
                        iArr2222[0] = i4;
                        iArr2222[1] = i5;
                        if (z11) {
                        }
                        z12 = false;
                        if (z11) {
                        }
                        if (this.mListDimensionBehaviors[0] != dimensionBehaviour3) {
                        }
                        if (z13) {
                        }
                        constraintAnchor3 = this.mCenter;
                        z14 = !constraintAnchor3.isConnected();
                        z15 = zArr4[0];
                        boolean z2922222 = zArr4[1];
                        if (this.mHorizontalResolution != 2) {
                        }
                        solverVariable3 = createObjectVariable;
                        dimensionBehaviour = dimensionBehaviour5;
                        solverVariable4 = createObjectVariable2;
                        constraintAnchor4 = constraintAnchor3;
                        i7 = i4;
                        z16 = z9;
                        dimensionBehaviour2 = dimensionBehaviour3;
                        constraintAnchor5 = constraintAnchor;
                        z17 = z25;
                        solverVariable5 = createObjectVariable3;
                        constraintAnchor6 = constraintAnchor10;
                        solverVariable6 = solverVariable;
                        solverVariable7 = solverVariable2;
                        z18 = z10;
                        z19 = z14;
                        zArr3 = zArr2;
                        if (z) {
                        }
                        solverVariable8 = solverVariable5;
                        solverVariable9 = solverVariable6;
                        solverVariable10 = solverVariable7;
                        i8 = 0;
                        i9 = 8;
                        i10 = 1;
                        i11 = 1;
                        if ((this.mVerticalResolution == 2 ? i8 : i11) != 0) {
                        }
                        solverVariable11 = solverVariable8;
                        solverVariable12 = solverVariable9;
                        if (z11) {
                        }
                        if (constraintAnchor4.isConnected()) {
                        }
                        this.mResolvedHorizontal = false;
                        this.mResolvedVertical = false;
                    }
                    z10 = z6;
                    z11 = true;
                    i5 = i22;
                    int[] iArr22222 = this.mResolvedMatchConstraintDefault;
                    iArr22222[0] = i4;
                    iArr22222[1] = i5;
                    if (z11) {
                    }
                    z12 = false;
                    if (z11) {
                    }
                    if (this.mListDimensionBehaviors[0] != dimensionBehaviour3) {
                    }
                    if (z13) {
                    }
                    constraintAnchor3 = this.mCenter;
                    z14 = !constraintAnchor3.isConnected();
                    z15 = zArr4[0];
                    boolean z29222222 = zArr4[1];
                    if (this.mHorizontalResolution != 2) {
                    }
                    solverVariable3 = createObjectVariable;
                    dimensionBehaviour = dimensionBehaviour5;
                    solverVariable4 = createObjectVariable2;
                    constraintAnchor4 = constraintAnchor3;
                    i7 = i4;
                    z16 = z9;
                    dimensionBehaviour2 = dimensionBehaviour3;
                    constraintAnchor5 = constraintAnchor;
                    z17 = z25;
                    solverVariable5 = createObjectVariable3;
                    constraintAnchor6 = constraintAnchor10;
                    solverVariable6 = solverVariable;
                    solverVariable7 = solverVariable2;
                    z18 = z10;
                    z19 = z14;
                    zArr3 = zArr2;
                    if (z) {
                    }
                    solverVariable8 = solverVariable5;
                    solverVariable9 = solverVariable6;
                    solverVariable10 = solverVariable7;
                    i8 = 0;
                    i9 = 8;
                    i10 = 1;
                    i11 = 1;
                    if ((this.mVerticalResolution == 2 ? i8 : i11) != 0) {
                    }
                    solverVariable11 = solverVariable8;
                    solverVariable12 = solverVariable9;
                    if (z11) {
                    }
                    if (constraintAnchor4.isConnected()) {
                    }
                    this.mResolvedHorizontal = false;
                    this.mResolvedVertical = false;
                }
            } else {
                solverVariable = createObjectVariable4;
            }
            solverVariable2 = createObjectVariable5;
            z10 = z6;
            i4 = i20;
            i5 = i21;
            z11 = false;
            int[] iArr222222 = this.mResolvedMatchConstraintDefault;
            iArr222222[0] = i4;
            iArr222222[1] = i5;
            if (z11) {
            }
            z12 = false;
            if (z11) {
            }
            if (this.mListDimensionBehaviors[0] != dimensionBehaviour3) {
            }
            if (z13) {
            }
            constraintAnchor3 = this.mCenter;
            z14 = !constraintAnchor3.isConnected();
            z15 = zArr4[0];
            boolean z292222222 = zArr4[1];
            if (this.mHorizontalResolution != 2) {
            }
            solverVariable3 = createObjectVariable;
            dimensionBehaviour = dimensionBehaviour5;
            solverVariable4 = createObjectVariable2;
            constraintAnchor4 = constraintAnchor3;
            i7 = i4;
            z16 = z9;
            dimensionBehaviour2 = dimensionBehaviour3;
            constraintAnchor5 = constraintAnchor;
            z17 = z25;
            solverVariable5 = createObjectVariable3;
            constraintAnchor6 = constraintAnchor10;
            solverVariable6 = solverVariable;
            solverVariable7 = solverVariable2;
            z18 = z10;
            z19 = z14;
            zArr3 = zArr2;
            if (z) {
            }
            solverVariable8 = solverVariable5;
            solverVariable9 = solverVariable6;
            solverVariable10 = solverVariable7;
            i8 = 0;
            i9 = 8;
            i10 = 1;
            i11 = 1;
            if ((this.mVerticalResolution == 2 ? i8 : i11) != 0) {
            }
            solverVariable11 = solverVariable8;
            solverVariable12 = solverVariable9;
            if (z11) {
            }
            if (constraintAnchor4.isConnected()) {
            }
            this.mResolvedHorizontal = false;
            this.mResolvedVertical = false;
        }
        z2 = true;
        z3 = false;
        z4 = z3 ? 1 : 0;
        z5 = z4;
        r18 = z3;
        r20 = z2;
        i = this.mVisibility;
        boolean z232 = z4;
        boolean[] zArr42 = this.mIsInBarrier;
        if (i == 8) {
        }
        z6 = z5;
        z7 = this.mResolvedHorizontal;
        if (!z7) {
        }
        if (z7) {
        }
        if (this.mResolvedVertical) {
        }
        if (this.mResolvedHorizontal) {
            boolean z242 = r18;
            this.mResolvedHorizontal = z242;
            this.mResolvedVertical = z242;
            return;
        }
        zArr = this.isTerminalWidget;
        if (z) {
        }
        constraintAnchor = constraintAnchor11;
        zArr2 = zArr;
        if (this.mParent == null) {
        }
        i2 = this.mWidth;
        i3 = this.mMinWidth;
        if (i2 >= i3) {
        }
        int i162 = this.mHeight;
        boolean z252 = z8;
        int i172 = this.mMinHeight;
        if (i162 >= i172) {
        }
        DimensionBehaviour[] dimensionBehaviourArr22 = this.mListDimensionBehaviors;
        DimensionBehaviour dimensionBehaviour42 = dimensionBehaviourArr22[0];
        DimensionBehaviour dimensionBehaviour52 = DimensionBehaviour.MATCH_CONSTRAINT;
        if (dimensionBehaviour42 == dimensionBehaviour52) {
        }
        DimensionBehaviour dimensionBehaviour62 = dimensionBehaviourArr22[1];
        if (dimensionBehaviour62 == dimensionBehaviour52) {
        }
        int i192 = this.mDimensionRatioSide;
        this.mResolvedDimensionRatioSide = i192;
        f = this.mDimensionRatio;
        this.mResolvedDimensionRatio = f;
        int i202 = this.mMatchConstraintDefaultWidth;
        int i212 = this.mMatchConstraintDefaultHeight;
        if (f <= RecyclerView.DECELERATION_RATE) {
        }
        solverVariable2 = createObjectVariable5;
        z10 = z6;
        i4 = i202;
        i5 = i212;
        z11 = false;
        int[] iArr2222222 = this.mResolvedMatchConstraintDefault;
        iArr2222222[0] = i4;
        iArr2222222[1] = i5;
        if (z11) {
        }
        z12 = false;
        if (z11) {
        }
        if (this.mListDimensionBehaviors[0] != dimensionBehaviour3) {
        }
        if (z13) {
        }
        constraintAnchor3 = this.mCenter;
        z14 = !constraintAnchor3.isConnected();
        z15 = zArr42[0];
        boolean z2922222222 = zArr42[1];
        if (this.mHorizontalResolution != 2) {
        }
        solverVariable3 = createObjectVariable;
        dimensionBehaviour = dimensionBehaviour52;
        solverVariable4 = createObjectVariable2;
        constraintAnchor4 = constraintAnchor3;
        i7 = i4;
        z16 = z9;
        dimensionBehaviour2 = dimensionBehaviour3;
        constraintAnchor5 = constraintAnchor;
        z17 = z252;
        solverVariable5 = createObjectVariable3;
        constraintAnchor6 = constraintAnchor10;
        solverVariable6 = solverVariable;
        solverVariable7 = solverVariable2;
        z18 = z10;
        z19 = z14;
        zArr3 = zArr2;
        if (z) {
        }
        solverVariable8 = solverVariable5;
        solverVariable9 = solverVariable6;
        solverVariable10 = solverVariable7;
        i8 = 0;
        i9 = 8;
        i10 = 1;
        i11 = 1;
        if ((this.mVerticalResolution == 2 ? i8 : i11) != 0) {
        }
        solverVariable11 = solverVariable8;
        solverVariable12 = solverVariable9;
        if (z11) {
        }
        if (constraintAnchor4.isConnected()) {
        }
        this.mResolvedHorizontal = false;
        this.mResolvedVertical = false;
    }

    public boolean allowedInBarrier() {
        return this.mVisibility != 8;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x03bb A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:107:0x03c8  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0410  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x041e  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x043f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0457  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x04a4  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x04b4 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0401  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x04d3 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:65:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void applyConstraints(LinearSystem linearSystem, boolean z, boolean z2, boolean z3, boolean z4, SolverVariable solverVariable, SolverVariable solverVariable2, DimensionBehaviour dimensionBehaviour, boolean z5, ConstraintAnchor constraintAnchor, ConstraintAnchor constraintAnchor2, int i, int i2, int i3, int i4, float f, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, int i5, int i6, int i7, int i8, float f2, boolean z11) {
        boolean z12;
        boolean z13;
        int i9;
        boolean z14;
        boolean z15;
        int i10;
        int i11;
        boolean z16;
        SolverVariable createObjectVariable;
        SolverVariable createObjectVariable2;
        ConstraintAnchor constraintAnchor3;
        SolverVariable solverVariable3;
        boolean z17;
        int i12;
        SolverVariable solverVariable4;
        SolverVariable solverVariable5;
        SolverVariable solverVariable6;
        SolverVariable solverVariable7;
        int i13;
        int i14;
        int i15;
        boolean z18;
        boolean z19;
        boolean z20;
        boolean z21;
        ConstraintWidget constraintWidget;
        int i16;
        int i17;
        ConstraintAnchor constraintAnchor4;
        boolean z22;
        int i18;
        boolean z23;
        int i19;
        int i20;
        HashSet hashSet;
        boolean z24;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        boolean z25;
        boolean z26;
        int i26;
        LinearSystem linearSystem2 = linearSystem;
        int i27 = i7;
        int i28 = i8;
        SolverVariable createObjectVariable3 = linearSystem2.createObjectVariable(constraintAnchor);
        SolverVariable createObjectVariable4 = linearSystem2.createObjectVariable(constraintAnchor2);
        SolverVariable createObjectVariable5 = linearSystem2.createObjectVariable(constraintAnchor.mTarget);
        SolverVariable createObjectVariable6 = linearSystem2.createObjectVariable(constraintAnchor2.mTarget);
        boolean isConnected = constraintAnchor.isConnected();
        boolean isConnected2 = constraintAnchor2.isConnected();
        boolean isConnected3 = this.mCenter.isConnected();
        int i29 = isConnected2 ? (isConnected ? 1 : 0) + 1 : isConnected ? 1 : 0;
        if (isConnected3) {
            i29++;
        }
        int i30 = i29;
        int i31 = z6 ? 3 : i5;
        int ordinal = dimensionBehaviour.ordinal();
        boolean z27 = (ordinal == 0 || ordinal == 1 || ordinal != 2 || i31 == 4) ? false : true;
        int i32 = this.mWidthOverride;
        if (i32 == -1 || !z) {
            i32 = i2;
            z12 = z27;
        } else {
            this.mWidthOverride = -1;
            z12 = false;
        }
        int i33 = this.mHeightOverride;
        if (i33 == -1 || z) {
            z13 = z12;
        } else {
            this.mHeightOverride = -1;
            i32 = i33;
            z13 = false;
        }
        boolean z28 = z13;
        if (this.mVisibility == 8) {
            z14 = false;
            i9 = 0;
        } else {
            i9 = i32;
            z14 = z28;
        }
        if (z11) {
            if (!isConnected && !isConnected2 && !isConnected3) {
                linearSystem2.addEquality(createObjectVariable3, i);
            } else if (isConnected && !isConnected2) {
                z15 = z14;
                i10 = 8;
                linearSystem2.addEquality(createObjectVariable3, createObjectVariable5, constraintAnchor.getMargin(), 8);
            }
            z15 = z14;
            i10 = 8;
        } else {
            z15 = z14;
            i10 = 8;
        }
        if (z15) {
            if (i30 == 2 || z6 || !(i31 == 1 || i31 == 0)) {
                if (i27 == -2) {
                    i27 = i9;
                }
                if (i28 == -2) {
                    i28 = i9;
                }
                if (i9 > 0 && i31 != 1) {
                    i9 = 0;
                }
                if (i27 > 0) {
                    linearSystem2.addGreaterThan(createObjectVariable4, createObjectVariable3, i27, 8);
                    i9 = Math.max(i9, i27);
                }
                if (i28 > 0) {
                    if (!z2 || i31 != 1) {
                        linearSystem2.addLowerThan(createObjectVariable4, createObjectVariable3, i28, 8);
                    }
                    i9 = Math.min(i9, i28);
                }
                if (i31 == 1) {
                    if (z2) {
                        linearSystem2.addEquality(createObjectVariable4, createObjectVariable3, i9, 8);
                    } else if (z8) {
                        linearSystem2.addEquality(createObjectVariable4, createObjectVariable3, i9, 5);
                        linearSystem2.addLowerThan(createObjectVariable4, createObjectVariable3, i9, 8);
                    } else {
                        linearSystem2.addEquality(createObjectVariable4, createObjectVariable3, i9, 5);
                        linearSystem2.addLowerThan(createObjectVariable4, createObjectVariable3, i9, 8);
                    }
                } else if (i31 == 2) {
                    int i34 = constraintAnchor.mType;
                    if (i34 == 3 || i34 == 5) {
                        createObjectVariable = linearSystem2.createObjectVariable(this.mParent.getAnchor(3));
                        createObjectVariable2 = linearSystem2.createObjectVariable(this.mParent.getAnchor(5));
                    } else {
                        createObjectVariable = linearSystem2.createObjectVariable(this.mParent.getAnchor(2));
                        createObjectVariable2 = linearSystem2.createObjectVariable(this.mParent.getAnchor(4));
                    }
                    ArrayRow createRow = linearSystem2.createRow();
                    int i35 = i27;
                    createRow.variables.put(createObjectVariable4, -1.0f);
                    createRow.variables.put(createObjectVariable3, 1.0f);
                    createRow.variables.put(createObjectVariable2, f2);
                    createRow.variables.put(createObjectVariable, -f2);
                    linearSystem2.addConstraint(createRow);
                    if (z2) {
                        z15 = false;
                    }
                    z16 = z4;
                    i11 = i35;
                } else {
                    i11 = i27;
                    z16 = true;
                }
            } else {
                int max = Math.max(i27, i9);
                if (i28 > 0) {
                    max = Math.min(i28, max);
                }
                linearSystem2.addEquality(createObjectVariable4, createObjectVariable3, max, 8);
                z16 = z4;
                i11 = i27;
                z15 = false;
            }
            if (z11 || z8) {
                boolean z29 = z16;
                if (i30 >= 2 && z2 && z29) {
                    linearSystem2.addGreaterThan(createObjectVariable3, solverVariable, 0, 8);
                    ConstraintAnchor constraintAnchor5 = this.mBaseline;
                    boolean z30 = z || constraintAnchor5.mTarget == null;
                    if (!z && (constraintAnchor3 = constraintAnchor5.mTarget) != null) {
                        ConstraintWidget constraintWidget2 = constraintAnchor3.mOwner;
                        if (constraintWidget2.mDimensionRatio != RecyclerView.DECELERATION_RATE) {
                            DimensionBehaviour[] dimensionBehaviourArr = constraintWidget2.mListDimensionBehaviors;
                            DimensionBehaviour dimensionBehaviour2 = dimensionBehaviourArr[0];
                            DimensionBehaviour dimensionBehaviour3 = DimensionBehaviour.MATCH_CONSTRAINT;
                            if (dimensionBehaviour2 == dimensionBehaviour3 && dimensionBehaviourArr[1] == dimensionBehaviour3) {
                                z30 = true;
                            }
                        }
                        z30 = false;
                    }
                    if (z30) {
                        linearSystem2.addGreaterThan(solverVariable2, createObjectVariable4, 0, 8);
                        return;
                    }
                    return;
                }
                return;
            }
            if (!isConnected && !isConnected2 && !isConnected3) {
                constraintAnchor4 = constraintAnchor2;
                solverVariable6 = createObjectVariable4;
                z17 = z16;
                solverVariable3 = createObjectVariable6;
            } else if (!isConnected || isConnected2) {
                if (isConnected || !isConnected2) {
                    solverVariable3 = createObjectVariable6;
                    if (isConnected && isConnected2) {
                        ConstraintWidget constraintWidget3 = constraintAnchor.mTarget.mOwner;
                        ConstraintWidget constraintWidget4 = constraintAnchor2.mTarget.mOwner;
                        z17 = z16;
                        ConstraintWidget constraintWidget5 = this.mParent;
                        int i36 = 6;
                        if (z15) {
                            if (i31 == 0) {
                                if (i28 != 0 || i11 != 0) {
                                    i24 = 5;
                                    i25 = 5;
                                    z25 = true;
                                    z26 = false;
                                    z19 = true;
                                } else if (createObjectVariable5.isFinalValue && solverVariable3.isFinalValue) {
                                    linearSystem2.addEquality(createObjectVariable3, createObjectVariable5, constraintAnchor.getMargin(), 8);
                                    linearSystem2.addEquality(createObjectVariable4, solverVariable3, -constraintAnchor2.getMargin(), 8);
                                    return;
                                } else {
                                    i24 = 8;
                                    i25 = 8;
                                    z25 = false;
                                    z26 = true;
                                    z19 = false;
                                }
                                if ((constraintWidget3 instanceof Barrier) || (constraintWidget4 instanceof Barrier)) {
                                    linearSystem2 = linearSystem;
                                    i12 = i31;
                                    solverVariable5 = createObjectVariable3;
                                    solverVariable6 = createObjectVariable4;
                                    z20 = z26;
                                    solverVariable4 = solverVariable2;
                                    i14 = i24;
                                    solverVariable7 = createObjectVariable5;
                                    i13 = 6;
                                    z18 = z25;
                                    i15 = 4;
                                    if (z19 || solverVariable7 != solverVariable3 || constraintWidget3 == constraintWidget5) {
                                        z21 = true;
                                    } else {
                                        z19 = false;
                                        z21 = false;
                                    }
                                    if (z18) {
                                        constraintWidget = constraintWidget4;
                                        i16 = i11;
                                        i17 = i12;
                                        constraintAnchor4 = constraintAnchor2;
                                        z22 = z2;
                                    } else {
                                        if (z15 || z7 || z9 || solverVariable7 != solverVariable || solverVariable3 != solverVariable4) {
                                            z22 = z2;
                                            z24 = z21;
                                            i21 = i14;
                                        } else {
                                            i13 = 8;
                                            z22 = false;
                                            i21 = 8;
                                            z24 = false;
                                        }
                                        SolverVariable solverVariable8 = solverVariable7;
                                        i16 = i11;
                                        i17 = i12;
                                        constraintWidget = constraintWidget4;
                                        constraintAnchor4 = constraintAnchor2;
                                        linearSystem2.addCentering(solverVariable5, solverVariable8, constraintAnchor.getMargin(), f, solverVariable3, solverVariable6, constraintAnchor2.getMargin(), i13);
                                        solverVariable7 = solverVariable8;
                                        i14 = i21;
                                        z21 = z24;
                                    }
                                    if (this.mVisibility != 8 && ((hashSet = constraintAnchor4.mDependents) == null || hashSet.size() <= 0)) {
                                        return;
                                    }
                                    if (z19) {
                                        if (z22 && solverVariable7 != solverVariable3 && !z15 && ((constraintWidget3 instanceof Barrier) || (constraintWidget instanceof Barrier))) {
                                            i14 = 6;
                                        }
                                        linearSystem2.addGreaterThan(solverVariable5, solverVariable7, constraintAnchor.getMargin(), i14);
                                        linearSystem2.addLowerThan(solverVariable6, solverVariable3, -constraintAnchor4.getMargin(), i14);
                                    }
                                    if (z22 || !z10 || (constraintWidget3 instanceof Barrier) || (constraintWidget instanceof Barrier) || constraintWidget == constraintWidget5) {
                                        i18 = i15;
                                        z23 = z21;
                                    } else {
                                        i18 = 6;
                                        i14 = 6;
                                        z23 = true;
                                    }
                                    if (z23) {
                                        if (z20 && (!z9 || z3)) {
                                            if (constraintWidget3 != constraintWidget5 && constraintWidget != constraintWidget5) {
                                                i36 = i18;
                                            }
                                            if ((constraintWidget3 instanceof Guideline) || (constraintWidget instanceof Guideline)) {
                                                i36 = 5;
                                            }
                                            if ((constraintWidget3 instanceof Barrier) || (constraintWidget instanceof Barrier)) {
                                                i36 = 5;
                                            }
                                            i18 = Math.max(z9 ? 5 : i36, i18);
                                        }
                                        if (z22) {
                                            i18 = Math.min(i14, i18);
                                            if (z6 && !z9 && (constraintWidget3 == constraintWidget5 || constraintWidget == constraintWidget5)) {
                                                i20 = 4;
                                                linearSystem2.addEquality(solverVariable5, solverVariable7, constraintAnchor.getMargin(), i20);
                                                linearSystem2.addEquality(solverVariable6, solverVariable3, -constraintAnchor4.getMargin(), i20);
                                            }
                                        }
                                        i20 = i18;
                                        linearSystem2.addEquality(solverVariable5, solverVariable7, constraintAnchor.getMargin(), i20);
                                        linearSystem2.addEquality(solverVariable6, solverVariable3, -constraintAnchor4.getMargin(), i20);
                                    }
                                    if (z22) {
                                        int margin = solverVariable == solverVariable7 ? constraintAnchor.getMargin() : 0;
                                        if (solverVariable7 != solverVariable) {
                                            linearSystem2.addGreaterThan(solverVariable5, solverVariable, margin, 5);
                                        }
                                    }
                                    if (z22 && z15 && i3 == 0 && i16 == 0) {
                                        if (z15 || i17 != 3) {
                                            i19 = 5;
                                            linearSystem2.addGreaterThan(solverVariable6, solverVariable5, 0, 5);
                                        } else {
                                            linearSystem2.addGreaterThan(solverVariable6, solverVariable5, 0, 8);
                                        }
                                    }
                                    i19 = 5;
                                } else {
                                    linearSystem2 = linearSystem;
                                    solverVariable5 = createObjectVariable3;
                                    solverVariable6 = createObjectVariable4;
                                    z20 = z26;
                                    i14 = i24;
                                    solverVariable7 = createObjectVariable5;
                                    i13 = 6;
                                    z18 = z25;
                                    i15 = i25;
                                    i12 = i31;
                                    solverVariable4 = solverVariable2;
                                    if (z19) {
                                    }
                                    z21 = true;
                                    if (z18) {
                                    }
                                    if (this.mVisibility != 8) {
                                    }
                                    if (z19) {
                                    }
                                    if (z22) {
                                    }
                                    i18 = i15;
                                    z23 = z21;
                                    if (z23) {
                                    }
                                    if (z22) {
                                    }
                                    if (z22) {
                                        if (z15) {
                                        }
                                        i19 = 5;
                                        linearSystem2.addGreaterThan(solverVariable6, solverVariable5, 0, 5);
                                    }
                                    i19 = 5;
                                }
                            } else {
                                if (i31 == 2) {
                                    if ((constraintWidget3 instanceof Barrier) || (constraintWidget4 instanceof Barrier)) {
                                        linearSystem2 = linearSystem;
                                        i12 = i31;
                                        solverVariable5 = createObjectVariable3;
                                        solverVariable6 = createObjectVariable4;
                                        solverVariable7 = createObjectVariable5;
                                        i13 = 6;
                                        i14 = 5;
                                    } else {
                                        linearSystem2 = linearSystem;
                                        i12 = i31;
                                        solverVariable5 = createObjectVariable3;
                                        solverVariable6 = createObjectVariable4;
                                        solverVariable7 = createObjectVariable5;
                                        i13 = 6;
                                        i14 = 5;
                                        i15 = 5;
                                        z18 = true;
                                        z19 = true;
                                        z20 = false;
                                        solverVariable4 = solverVariable2;
                                        if (z19) {
                                        }
                                        z21 = true;
                                        if (z18) {
                                        }
                                        if (this.mVisibility != 8) {
                                        }
                                        if (z19) {
                                        }
                                        if (z22) {
                                        }
                                        i18 = i15;
                                        z23 = z21;
                                        if (z23) {
                                        }
                                        if (z22) {
                                        }
                                        if (z22) {
                                        }
                                        i19 = 5;
                                    }
                                } else if (i31 == 1) {
                                    linearSystem2 = linearSystem;
                                    i12 = i31;
                                    solverVariable5 = createObjectVariable3;
                                    solverVariable6 = createObjectVariable4;
                                    solverVariable7 = createObjectVariable5;
                                    i13 = 6;
                                    i14 = 8;
                                } else if (i31 == 3) {
                                    i12 = i31;
                                    if (this.mResolvedDimensionRatioSide != -1) {
                                        if (z6) {
                                            if (i6 == 2 || i6 == 1) {
                                                i22 = 5;
                                                i23 = 4;
                                            } else {
                                                i22 = 8;
                                                i23 = 5;
                                            }
                                            i15 = i23;
                                            solverVariable5 = createObjectVariable3;
                                            solverVariable6 = createObjectVariable4;
                                            solverVariable7 = createObjectVariable5;
                                            i13 = 6;
                                            z18 = true;
                                            z19 = true;
                                            z20 = true;
                                            solverVariable4 = solverVariable2;
                                        } else if (i28 > 0) {
                                            linearSystem2 = linearSystem;
                                            solverVariable4 = solverVariable2;
                                            solverVariable5 = createObjectVariable3;
                                            solverVariable6 = createObjectVariable4;
                                            solverVariable7 = createObjectVariable5;
                                            i13 = 6;
                                            i14 = 5;
                                        } else {
                                            if (i28 != 0 || i11 != 0) {
                                                linearSystem2 = linearSystem;
                                                solverVariable4 = solverVariable2;
                                                solverVariable5 = createObjectVariable3;
                                                solverVariable6 = createObjectVariable4;
                                                solverVariable7 = createObjectVariable5;
                                                i13 = 6;
                                                i14 = 5;
                                                i15 = 4;
                                            } else if (z9) {
                                                i22 = (constraintWidget3 == constraintWidget5 || constraintWidget4 == constraintWidget5) ? 5 : 4;
                                                solverVariable4 = solverVariable2;
                                                solverVariable5 = createObjectVariable3;
                                                solverVariable6 = createObjectVariable4;
                                                solverVariable7 = createObjectVariable5;
                                                i13 = 6;
                                                i15 = 4;
                                                z18 = true;
                                                z19 = true;
                                                z20 = true;
                                            } else {
                                                linearSystem2 = linearSystem;
                                                solverVariable4 = solverVariable2;
                                                solverVariable5 = createObjectVariable3;
                                                solverVariable6 = createObjectVariable4;
                                                solverVariable7 = createObjectVariable5;
                                                i13 = 6;
                                                i14 = 5;
                                                i15 = 8;
                                            }
                                            z18 = true;
                                            z19 = true;
                                            z20 = true;
                                            if (z19) {
                                            }
                                            z21 = true;
                                            if (z18) {
                                            }
                                            if (this.mVisibility != 8) {
                                            }
                                            if (z19) {
                                            }
                                            if (z22) {
                                            }
                                            i18 = i15;
                                            z23 = z21;
                                            if (z23) {
                                            }
                                            if (z22) {
                                            }
                                            if (z22) {
                                            }
                                            i19 = 5;
                                        }
                                        i14 = i22;
                                        linearSystem2 = linearSystem;
                                        if (z19) {
                                        }
                                        z21 = true;
                                        if (z18) {
                                        }
                                        if (this.mVisibility != 8) {
                                        }
                                        if (z19) {
                                        }
                                        if (z22) {
                                        }
                                        i18 = i15;
                                        z23 = z21;
                                        if (z23) {
                                        }
                                        if (z22) {
                                        }
                                        if (z22) {
                                        }
                                        i19 = 5;
                                    } else if (z9) {
                                        linearSystem2 = linearSystem;
                                        solverVariable4 = solverVariable2;
                                        solverVariable5 = createObjectVariable3;
                                        solverVariable6 = createObjectVariable4;
                                        solverVariable7 = createObjectVariable5;
                                        i14 = 8;
                                        i13 = z2 ? 5 : 4;
                                    } else {
                                        linearSystem2 = linearSystem;
                                        solverVariable4 = solverVariable2;
                                        solverVariable5 = createObjectVariable3;
                                        solverVariable6 = createObjectVariable4;
                                        solverVariable7 = createObjectVariable5;
                                        i14 = 8;
                                        i13 = 8;
                                    }
                                    i15 = 5;
                                    z18 = true;
                                    z19 = true;
                                    z20 = true;
                                    if (z19) {
                                    }
                                    z21 = true;
                                    if (z18) {
                                    }
                                    if (this.mVisibility != 8) {
                                    }
                                    if (z19) {
                                    }
                                    if (z22) {
                                    }
                                    i18 = i15;
                                    z23 = z21;
                                    if (z23) {
                                    }
                                    if (z22) {
                                    }
                                    if (z22) {
                                    }
                                    i19 = 5;
                                } else {
                                    i12 = i31;
                                    linearSystem2 = linearSystem;
                                    solverVariable4 = solverVariable2;
                                    solverVariable5 = createObjectVariable3;
                                    solverVariable6 = createObjectVariable4;
                                    solverVariable7 = createObjectVariable5;
                                    i13 = 6;
                                    i14 = 5;
                                    i15 = 4;
                                    z18 = false;
                                    z19 = false;
                                }
                                i15 = 4;
                                z18 = true;
                                z19 = true;
                                z20 = false;
                                solverVariable4 = solverVariable2;
                                if (z19) {
                                }
                                z21 = true;
                                if (z18) {
                                }
                                if (this.mVisibility != 8) {
                                }
                                if (z19) {
                                }
                                if (z22) {
                                }
                                i18 = i15;
                                z23 = z21;
                                if (z23) {
                                }
                                if (z22) {
                                }
                                if (z22) {
                                }
                                i19 = 5;
                            }
                            i26 = i19;
                            if (z22 && z17) {
                                int margin2 = constraintAnchor4.mTarget != null ? constraintAnchor4.getMargin() : 0;
                                if (solverVariable3 != solverVariable2) {
                                    linearSystem2.addGreaterThan(solverVariable2, solverVariable6, margin2, i26);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        i12 = i31;
                        if (createObjectVariable5.isFinalValue && solverVariable3.isFinalValue) {
                            linearSystem.addCentering(createObjectVariable3, createObjectVariable5, constraintAnchor.getMargin(), f, solverVariable3, createObjectVariable4, constraintAnchor2.getMargin(), 8);
                            if (z2 && z17) {
                                int margin3 = constraintAnchor2.mTarget != null ? constraintAnchor2.getMargin() : 0;
                                if (solverVariable3 != solverVariable2) {
                                    linearSystem.addGreaterThan(solverVariable2, createObjectVariable4, margin3, 5);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        linearSystem2 = linearSystem;
                        solverVariable4 = solverVariable2;
                        solverVariable5 = createObjectVariable3;
                        solverVariable6 = createObjectVariable4;
                        solverVariable7 = createObjectVariable5;
                        i13 = 6;
                        i14 = 5;
                        i15 = 4;
                        z18 = true;
                        z19 = true;
                        z20 = false;
                        if (z19) {
                        }
                        z21 = true;
                        if (z18) {
                        }
                        if (this.mVisibility != 8) {
                        }
                        if (z19) {
                        }
                        if (z22) {
                        }
                        i18 = i15;
                        z23 = z21;
                        if (z23) {
                        }
                        if (z22) {
                        }
                        if (z22) {
                        }
                        i19 = 5;
                        i26 = i19;
                        if (z22) {
                            return;
                        } else {
                            return;
                        }
                    }
                } else {
                    solverVariable3 = createObjectVariable6;
                    linearSystem2.addEquality(createObjectVariable4, solverVariable3, -constraintAnchor2.getMargin(), 8);
                    if (z2) {
                        linearSystem2.addGreaterThan(createObjectVariable3, solverVariable, 0, 5);
                        constraintAnchor4 = constraintAnchor2;
                        i19 = 5;
                        solverVariable6 = createObjectVariable4;
                        z17 = z16;
                        z22 = z2;
                        i26 = i19;
                        if (z22) {
                        }
                    }
                }
                constraintAnchor4 = constraintAnchor2;
                solverVariable6 = createObjectVariable4;
                z17 = z16;
            } else {
                constraintAnchor4 = constraintAnchor2;
                solverVariable6 = createObjectVariable4;
                z17 = z16;
                solverVariable3 = createObjectVariable6;
                z22 = z2;
                i26 = (z2 && (constraintAnchor.mTarget.mOwner instanceof Barrier)) ? 8 : 5;
                if (z22) {
                }
            }
            i19 = 5;
            z22 = z2;
            i26 = i19;
            if (z22) {
            }
        } else if (z5) {
            linearSystem2.addEquality(createObjectVariable4, createObjectVariable3, 0, 3);
            if (i3 > 0) {
                linearSystem2.addGreaterThan(createObjectVariable4, createObjectVariable3, i3, i10);
            }
            if (i4 < Integer.MAX_VALUE) {
                linearSystem2.addLowerThan(createObjectVariable4, createObjectVariable3, i4, i10);
            }
        } else {
            linearSystem2.addEquality(createObjectVariable4, createObjectVariable3, i9, i10);
        }
        z16 = z4;
        i11 = i27;
        if (z11) {
        }
        boolean z292 = z16;
        if (i30 >= 2) {
        }
    }

    public final void connect(int i, ConstraintWidget constraintWidget, int i2, int i3) {
        boolean z;
        if (i == 7) {
            if (i2 != 7) {
                if (i2 == 2 || i2 == 4) {
                    connect(2, constraintWidget, i2, 0);
                    connect(4, constraintWidget, i2, 0);
                    getAnchor(7).connect(constraintWidget.getAnchor(i2), 0);
                    return;
                } else {
                    if (i2 == 3 || i2 == 5) {
                        connect(3, constraintWidget, i2, 0);
                        connect(5, constraintWidget, i2, 0);
                        getAnchor(7).connect(constraintWidget.getAnchor(i2), 0);
                        return;
                    }
                    return;
                }
            }
            ConstraintAnchor anchor = getAnchor(2);
            ConstraintAnchor anchor2 = getAnchor(4);
            ConstraintAnchor anchor3 = getAnchor(3);
            ConstraintAnchor anchor4 = getAnchor(5);
            boolean z2 = true;
            if ((anchor == null || !anchor.isConnected()) && (anchor2 == null || !anchor2.isConnected())) {
                connect(2, constraintWidget, 2, 0);
                connect(4, constraintWidget, 4, 0);
                z = true;
            } else {
                z = false;
            }
            if ((anchor3 == null || !anchor3.isConnected()) && (anchor4 == null || !anchor4.isConnected())) {
                connect(3, constraintWidget, 3, 0);
                connect(5, constraintWidget, 5, 0);
            } else {
                z2 = false;
            }
            if (z && z2) {
                getAnchor(7).connect(constraintWidget.getAnchor(7), 0);
                return;
            } else if (z) {
                getAnchor(8).connect(constraintWidget.getAnchor(8), 0);
                return;
            } else {
                if (z2) {
                    getAnchor(9).connect(constraintWidget.getAnchor(9), 0);
                    return;
                }
                return;
            }
        }
        if (i == 8 && (i2 == 2 || i2 == 4)) {
            ConstraintAnchor anchor5 = getAnchor(2);
            ConstraintAnchor anchor6 = constraintWidget.getAnchor(i2);
            ConstraintAnchor anchor7 = getAnchor(4);
            anchor5.connect(anchor6, 0);
            anchor7.connect(anchor6, 0);
            getAnchor(8).connect(anchor6, 0);
            return;
        }
        if (i == 9 && (i2 == 3 || i2 == 5)) {
            ConstraintAnchor anchor8 = constraintWidget.getAnchor(i2);
            getAnchor(3).connect(anchor8, 0);
            getAnchor(5).connect(anchor8, 0);
            getAnchor(9).connect(anchor8, 0);
            return;
        }
        if (i == 8 && i2 == 8) {
            getAnchor(2).connect(constraintWidget.getAnchor(2), 0);
            getAnchor(4).connect(constraintWidget.getAnchor(4), 0);
            getAnchor(8).connect(constraintWidget.getAnchor(i2), 0);
            return;
        }
        if (i == 9 && i2 == 9) {
            getAnchor(3).connect(constraintWidget.getAnchor(3), 0);
            getAnchor(5).connect(constraintWidget.getAnchor(5), 0);
            getAnchor(9).connect(constraintWidget.getAnchor(i2), 0);
            return;
        }
        ConstraintAnchor anchor9 = getAnchor(i);
        ConstraintAnchor anchor10 = constraintWidget.getAnchor(i2);
        if (anchor9.isValidConnection(anchor10)) {
            if (i == 6) {
                ConstraintAnchor anchor11 = getAnchor(3);
                ConstraintAnchor anchor12 = getAnchor(5);
                if (anchor11 != null) {
                    anchor11.reset();
                }
                if (anchor12 != null) {
                    anchor12.reset();
                }
            } else if (i == 3 || i == 5) {
                ConstraintAnchor anchor13 = getAnchor(6);
                if (anchor13 != null) {
                    anchor13.reset();
                }
                ConstraintAnchor anchor14 = getAnchor(7);
                if (anchor14.mTarget != anchor10) {
                    anchor14.reset();
                }
                ConstraintAnchor opposite = getAnchor(i).getOpposite();
                ConstraintAnchor anchor15 = getAnchor(9);
                if (anchor15.isConnected()) {
                    opposite.reset();
                    anchor15.reset();
                }
            } else if (i == 2 || i == 4) {
                ConstraintAnchor anchor16 = getAnchor(7);
                if (anchor16.mTarget != anchor10) {
                    anchor16.reset();
                }
                ConstraintAnchor opposite2 = getAnchor(i).getOpposite();
                ConstraintAnchor anchor17 = getAnchor(8);
                if (anchor17.isConnected()) {
                    opposite2.reset();
                    anchor17.reset();
                }
            }
            anchor9.connect(anchor10, i3);
        }
    }

    public void copy(ConstraintWidget constraintWidget, HashMap hashMap) {
        this.mHorizontalResolution = constraintWidget.mHorizontalResolution;
        this.mVerticalResolution = constraintWidget.mVerticalResolution;
        this.mMatchConstraintDefaultWidth = constraintWidget.mMatchConstraintDefaultWidth;
        this.mMatchConstraintDefaultHeight = constraintWidget.mMatchConstraintDefaultHeight;
        int[] iArr = constraintWidget.mResolvedMatchConstraintDefault;
        int i = iArr[0];
        int[] iArr2 = this.mResolvedMatchConstraintDefault;
        iArr2[0] = i;
        iArr2[1] = iArr[1];
        this.mMatchConstraintMinWidth = constraintWidget.mMatchConstraintMinWidth;
        this.mMatchConstraintMaxWidth = constraintWidget.mMatchConstraintMaxWidth;
        this.mMatchConstraintMinHeight = constraintWidget.mMatchConstraintMinHeight;
        this.mMatchConstraintMaxHeight = constraintWidget.mMatchConstraintMaxHeight;
        this.mMatchConstraintPercentHeight = constraintWidget.mMatchConstraintPercentHeight;
        this.mResolvedDimensionRatioSide = constraintWidget.mResolvedDimensionRatioSide;
        this.mResolvedDimensionRatio = constraintWidget.mResolvedDimensionRatio;
        int[] iArr3 = constraintWidget.mMaxDimension;
        this.mMaxDimension = Arrays.copyOf(iArr3, iArr3.length);
        this.mCircleConstraintAngle = constraintWidget.mCircleConstraintAngle;
        this.mHasBaseline = constraintWidget.mHasBaseline;
        this.mInPlaceholder = constraintWidget.mInPlaceholder;
        this.mLeft.reset();
        this.mTop.reset();
        this.mRight.reset();
        this.mBottom.reset();
        this.mBaseline.reset();
        this.mCenterX.reset();
        this.mCenterY.reset();
        this.mCenter.reset();
        this.mListDimensionBehaviors = (DimensionBehaviour[]) Arrays.copyOf(this.mListDimensionBehaviors, 2);
        this.mParent = this.mParent == null ? null : (ConstraintWidget) hashMap.get(constraintWidget.mParent);
        this.mWidth = constraintWidget.mWidth;
        this.mHeight = constraintWidget.mHeight;
        this.mDimensionRatio = constraintWidget.mDimensionRatio;
        this.mDimensionRatioSide = constraintWidget.mDimensionRatioSide;
        this.mX = constraintWidget.mX;
        this.mY = constraintWidget.mY;
        this.mBaselineDistance = constraintWidget.mBaselineDistance;
        this.mMinWidth = constraintWidget.mMinWidth;
        this.mMinHeight = constraintWidget.mMinHeight;
        this.mHorizontalBiasPercent = constraintWidget.mHorizontalBiasPercent;
        this.mVerticalBiasPercent = constraintWidget.mVerticalBiasPercent;
        this.mCompanionWidget = constraintWidget.mCompanionWidget;
        this.mVisibility = constraintWidget.mVisibility;
        this.mAnimated = constraintWidget.mAnimated;
        this.mDebugName = constraintWidget.mDebugName;
        this.mHorizontalChainStyle = constraintWidget.mHorizontalChainStyle;
        this.mVerticalChainStyle = constraintWidget.mVerticalChainStyle;
        float[] fArr = constraintWidget.mWeight;
        float f = fArr[0];
        float[] fArr2 = this.mWeight;
        fArr2[0] = f;
        fArr2[1] = fArr[1];
        ConstraintWidget[] constraintWidgetArr = constraintWidget.mListNextMatchConstraintsWidget;
        ConstraintWidget constraintWidget2 = constraintWidgetArr[0];
        ConstraintWidget[] constraintWidgetArr2 = this.mListNextMatchConstraintsWidget;
        constraintWidgetArr2[0] = constraintWidget2;
        constraintWidgetArr2[1] = constraintWidgetArr[1];
        ConstraintWidget[] constraintWidgetArr3 = constraintWidget.mNextChainWidget;
        ConstraintWidget constraintWidget3 = constraintWidgetArr3[0];
        ConstraintWidget[] constraintWidgetArr4 = this.mNextChainWidget;
        constraintWidgetArr4[0] = constraintWidget3;
        constraintWidgetArr4[1] = constraintWidgetArr3[1];
        ConstraintWidget constraintWidget4 = constraintWidget.mHorizontalNextWidget;
        this.mHorizontalNextWidget = constraintWidget4 == null ? null : (ConstraintWidget) hashMap.get(constraintWidget4);
        ConstraintWidget constraintWidget5 = constraintWidget.mVerticalNextWidget;
        this.mVerticalNextWidget = constraintWidget5 != null ? (ConstraintWidget) hashMap.get(constraintWidget5) : null;
    }

    public final void createObjectVariables(LinearSystem linearSystem) {
        linearSystem.createObjectVariable(this.mLeft);
        linearSystem.createObjectVariable(this.mTop);
        linearSystem.createObjectVariable(this.mRight);
        linearSystem.createObjectVariable(this.mBottom);
        if (this.mBaselineDistance > 0) {
            linearSystem.createObjectVariable(this.mBaseline);
        }
    }

    public final void ensureWidgetRuns() {
        if (this.mHorizontalRun == null) {
            HorizontalWidgetRun horizontalWidgetRun = new HorizontalWidgetRun(this);
            horizontalWidgetRun.start.mType = 4;
            horizontalWidgetRun.end.mType = 5;
            horizontalWidgetRun.orientation = 0;
            this.mHorizontalRun = horizontalWidgetRun;
        }
        if (this.mVerticalRun == null) {
            VerticalWidgetRun verticalWidgetRun = new VerticalWidgetRun(this);
            DependencyNode dependencyNode = new DependencyNode(verticalWidgetRun);
            verticalWidgetRun.baseline = dependencyNode;
            verticalWidgetRun.mBaselineDimension = null;
            verticalWidgetRun.start.mType = 6;
            verticalWidgetRun.end.mType = 7;
            dependencyNode.mType = 8;
            verticalWidgetRun.orientation = 1;
            this.mVerticalRun = verticalWidgetRun;
        }
    }

    public ConstraintAnchor getAnchor(int i) {
        switch (CameraSelector$$ExternalSyntheticOutline0.ordinal(i)) {
            case 0:
                return null;
            case 1:
                return this.mLeft;
            case 2:
                return this.mTop;
            case 3:
                return this.mRight;
            case 4:
                return this.mBottom;
            case 5:
                return this.mBaseline;
            case 6:
                return this.mCenter;
            case 7:
                return this.mCenterX;
            case 8:
                return this.mCenterY;
            default:
                a$$ExternalSyntheticBUOutline0.m$1((Object) Fragment$5$$ExternalSyntheticOutline0.name(i));
                return null;
        }
    }

    public final DimensionBehaviour getDimensionBehaviour(int i) {
        if (i == 0) {
            return this.mListDimensionBehaviors[0];
        }
        if (i == 1) {
            return this.mListDimensionBehaviors[1];
        }
        return null;
    }

    public final int getHeight() {
        if (this.mVisibility == 8) {
            return 0;
        }
        return this.mHeight;
    }

    public final ConstraintWidget getNextChainMember(int i) {
        ConstraintAnchor constraintAnchor;
        ConstraintAnchor constraintAnchor2;
        if (i != 0) {
            if (i == 1 && (constraintAnchor2 = (constraintAnchor = this.mBottom).mTarget) != null && constraintAnchor2.mTarget == constraintAnchor) {
                return constraintAnchor2.mOwner;
            }
            return null;
        }
        ConstraintAnchor constraintAnchor3 = this.mRight;
        ConstraintAnchor constraintAnchor4 = constraintAnchor3.mTarget;
        if (constraintAnchor4 == null || constraintAnchor4.mTarget != constraintAnchor3) {
            return null;
        }
        return constraintAnchor4.mOwner;
    }

    public final ConstraintWidget getPreviousChainMember(int i) {
        ConstraintAnchor constraintAnchor;
        ConstraintAnchor constraintAnchor2;
        if (i != 0) {
            if (i == 1 && (constraintAnchor2 = (constraintAnchor = this.mTop).mTarget) != null && constraintAnchor2.mTarget == constraintAnchor) {
                return constraintAnchor2.mOwner;
            }
            return null;
        }
        ConstraintAnchor constraintAnchor3 = this.mLeft;
        ConstraintAnchor constraintAnchor4 = constraintAnchor3.mTarget;
        if (constraintAnchor4 == null || constraintAnchor4.mTarget != constraintAnchor3) {
            return null;
        }
        return constraintAnchor4.mOwner;
    }

    public void getSceneString(StringBuilder sb) {
        sb.append("  " + this.stringId + ":{\n");
        StringBuilder sb2 = new StringBuilder("    actualWidth:");
        sb2.append(this.mWidth);
        sb.append(sb2.toString());
        sb.append("\n");
        sb.append("    actualHeight:" + this.mHeight);
        sb.append("\n");
        sb.append("    actualLeft:" + this.mX);
        sb.append("\n");
        sb.append("    actualTop:" + this.mY);
        sb.append("\n");
        getSceneString(sb, "left", this.mLeft);
        getSceneString(sb, "top", this.mTop);
        getSceneString(sb, "right", this.mRight);
        getSceneString(sb, "bottom", this.mBottom);
        getSceneString(sb, "baseline", this.mBaseline);
        getSceneString(sb, "centerX", this.mCenterX);
        getSceneString(sb, "centerY", this.mCenterY);
        int i = this.mWidth;
        int i2 = this.mMinWidth;
        int i3 = this.mMaxDimension[0];
        int i4 = this.mMatchConstraintMinWidth;
        int i5 = this.mMatchConstraintDefaultWidth;
        float f = this.mMatchConstraintPercentWidth;
        DimensionBehaviour dimensionBehaviour = this.mListDimensionBehaviors[0];
        float[] fArr = this.mWeight;
        float f2 = fArr[0];
        getSceneString(sb, "    width", i, i2, i3, i4, i5, f, dimensionBehaviour);
        int i6 = this.mHeight;
        int i7 = this.mMinHeight;
        int i8 = this.mMaxDimension[1];
        int i9 = this.mMatchConstraintMinHeight;
        int i10 = this.mMatchConstraintDefaultHeight;
        float f3 = this.mMatchConstraintPercentHeight;
        DimensionBehaviour dimensionBehaviour2 = this.mListDimensionBehaviors[1];
        float f4 = fArr[1];
        getSceneString(sb, "    height", i6, i7, i8, i9, i10, f3, dimensionBehaviour2);
        float f5 = this.mDimensionRatio;
        int i11 = this.mDimensionRatioSide;
        if (f5 != RecyclerView.DECELERATION_RATE) {
            sb.append("    dimensionRatio");
            sb.append(" :  [");
            sb.append(f5);
            sb.append(",");
            sb.append(i11);
            sb.append("");
            sb.append("],\n");
        }
        serializeAttribute(sb, "    horizontalBias", this.mHorizontalBiasPercent, 0.5f);
        serializeAttribute(sb, "    verticalBias", this.mVerticalBiasPercent, 0.5f);
        serializeAttribute(this.mHorizontalChainStyle, 0, "    horizontalChainStyle", sb);
        serializeAttribute(this.mVerticalChainStyle, 0, "    verticalChainStyle", sb);
        sb.append("  }");
    }

    public final int getWidth() {
        if (this.mVisibility == 8) {
            return 0;
        }
        return this.mWidth;
    }

    public final int getX() {
        ConstraintWidget constraintWidget = this.mParent;
        return (constraintWidget == null || !(constraintWidget instanceof ConstraintWidgetContainer)) ? this.mX : ((ConstraintWidgetContainer) constraintWidget).mPaddingLeft + this.mX;
    }

    public final int getY() {
        ConstraintWidget constraintWidget = this.mParent;
        return (constraintWidget == null || !(constraintWidget instanceof ConstraintWidgetContainer)) ? this.mY : ((ConstraintWidgetContainer) constraintWidget).mPaddingTop + this.mY;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003a A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean hasDanglingDimension(int i) {
        if (i == 0) {
            return (this.mLeft.mTarget != null ? 1 : 0) + (this.mRight.mTarget != null ? 1 : 0) < 2;
        }
        if ((this.mTop.mTarget != null ? 1 : 0) + (this.mBottom.mTarget != null ? 1 : 0) + (this.mBaseline.mTarget != null ? 1 : 0) < 2) {
        }
    }

    public final boolean hasResolvedTargets(int i, int i2) {
        ConstraintAnchor constraintAnchor;
        ConstraintAnchor constraintAnchor2;
        ConstraintAnchor constraintAnchor3;
        ConstraintAnchor constraintAnchor4;
        if (i == 0) {
            ConstraintAnchor constraintAnchor5 = this.mLeft;
            ConstraintAnchor constraintAnchor6 = constraintAnchor5.mTarget;
            if (constraintAnchor6 == null || !constraintAnchor6.mHasFinalValue || (constraintAnchor4 = (constraintAnchor3 = this.mRight).mTarget) == null || !constraintAnchor4.mHasFinalValue) {
                return false;
            }
            return (constraintAnchor4.getFinalValue() - constraintAnchor3.getMargin()) - (constraintAnchor5.getMargin() + constraintAnchor5.mTarget.getFinalValue()) >= i2;
        }
        ConstraintAnchor constraintAnchor7 = this.mTop;
        ConstraintAnchor constraintAnchor8 = constraintAnchor7.mTarget;
        if (constraintAnchor8 == null || !constraintAnchor8.mHasFinalValue || (constraintAnchor2 = (constraintAnchor = this.mBottom).mTarget) == null || !constraintAnchor2.mHasFinalValue) {
            return false;
        }
        return (constraintAnchor2.getFinalValue() - constraintAnchor.getMargin()) - (constraintAnchor7.getMargin() + constraintAnchor7.mTarget.getFinalValue()) >= i2;
    }

    public final void immediateConnect(int i, int i2, int i3, int i4, ConstraintWidget constraintWidget) {
        getAnchor(i).connect(constraintWidget.getAnchor(i2), i3, i4, true);
    }

    public final boolean isChainHead(int i) {
        ConstraintAnchor constraintAnchor;
        ConstraintAnchor constraintAnchor2;
        int i2 = i * 2;
        ConstraintAnchor[] constraintAnchorArr = this.mListAnchors;
        ConstraintAnchor constraintAnchor3 = constraintAnchorArr[i2];
        ConstraintAnchor constraintAnchor4 = constraintAnchor3.mTarget;
        return (constraintAnchor4 == null || constraintAnchor4.mTarget == constraintAnchor3 || (constraintAnchor2 = (constraintAnchor = constraintAnchorArr[i2 + 1]).mTarget) == null || constraintAnchor2.mTarget != constraintAnchor) ? false : true;
    }

    public final boolean isInHorizontalChain() {
        ConstraintAnchor constraintAnchor = this.mLeft;
        ConstraintAnchor constraintAnchor2 = constraintAnchor.mTarget;
        if (constraintAnchor2 != null && constraintAnchor2.mTarget == constraintAnchor) {
            return true;
        }
        ConstraintAnchor constraintAnchor3 = this.mRight;
        ConstraintAnchor constraintAnchor4 = constraintAnchor3.mTarget;
        return constraintAnchor4 != null && constraintAnchor4.mTarget == constraintAnchor3;
    }

    public final boolean isInVerticalChain() {
        ConstraintAnchor constraintAnchor = this.mTop;
        ConstraintAnchor constraintAnchor2 = constraintAnchor.mTarget;
        if (constraintAnchor2 != null && constraintAnchor2.mTarget == constraintAnchor) {
            return true;
        }
        ConstraintAnchor constraintAnchor3 = this.mBottom;
        ConstraintAnchor constraintAnchor4 = constraintAnchor3.mTarget;
        return constraintAnchor4 != null && constraintAnchor4.mTarget == constraintAnchor3;
    }

    public final boolean isMeasureRequested() {
        return this.mMeasureRequested && this.mVisibility != 8;
    }

    public boolean isResolvedHorizontally() {
        if (this.mResolvedHorizontal) {
            return true;
        }
        return this.mLeft.mHasFinalValue && this.mRight.mHasFinalValue;
    }

    public boolean isResolvedVertically() {
        if (this.mResolvedVertical) {
            return true;
        }
        return this.mTop.mHasFinalValue && this.mBottom.mHasFinalValue;
    }

    public void reset() {
        this.mLeft.reset();
        this.mTop.reset();
        this.mRight.reset();
        this.mBottom.reset();
        this.mBaseline.reset();
        this.mCenterX.reset();
        this.mCenterY.reset();
        this.mCenter.reset();
        this.mParent = null;
        this.mCircleConstraintAngle = Float.NaN;
        this.mWidth = 0;
        this.mHeight = 0;
        this.mDimensionRatio = RecyclerView.DECELERATION_RATE;
        this.mDimensionRatioSide = -1;
        this.mX = 0;
        this.mY = 0;
        this.mBaselineDistance = 0;
        this.mMinWidth = 0;
        this.mMinHeight = 0;
        this.mHorizontalBiasPercent = 0.5f;
        this.mVerticalBiasPercent = 0.5f;
        DimensionBehaviour[] dimensionBehaviourArr = this.mListDimensionBehaviors;
        DimensionBehaviour dimensionBehaviour = DimensionBehaviour.FIXED;
        dimensionBehaviourArr[0] = dimensionBehaviour;
        dimensionBehaviourArr[1] = dimensionBehaviour;
        this.mCompanionWidget = null;
        this.mVisibility = 0;
        this.mHorizontalChainStyle = 0;
        this.mVerticalChainStyle = 0;
        float[] fArr = this.mWeight;
        fArr[0] = -1.0f;
        fArr[1] = -1.0f;
        this.mHorizontalResolution = -1;
        this.mVerticalResolution = -1;
        int[] iArr = this.mMaxDimension;
        iArr[0] = Integer.MAX_VALUE;
        iArr[1] = Integer.MAX_VALUE;
        this.mMatchConstraintDefaultWidth = 0;
        this.mMatchConstraintDefaultHeight = 0;
        this.mMatchConstraintPercentWidth = 1.0f;
        this.mMatchConstraintPercentHeight = 1.0f;
        this.mMatchConstraintMaxWidth = Integer.MAX_VALUE;
        this.mMatchConstraintMaxHeight = Integer.MAX_VALUE;
        this.mMatchConstraintMinWidth = 0;
        this.mMatchConstraintMinHeight = 0;
        this.mResolvedDimensionRatioSide = -1;
        this.mResolvedDimensionRatio = 1.0f;
        boolean[] zArr = this.isTerminalWidget;
        zArr[0] = true;
        zArr[1] = true;
        this.mInVirtualLayout = false;
        boolean[] zArr2 = this.mIsInBarrier;
        zArr2[0] = false;
        zArr2[1] = false;
        this.mMeasureRequested = true;
        int[] iArr2 = this.mResolvedMatchConstraintDefault;
        iArr2[0] = 0;
        iArr2[1] = 0;
        this.mWidthOverride = -1;
        this.mHeightOverride = -1;
    }

    public final void resetAnchors() {
        ConstraintWidget constraintWidget = this.mParent;
        if (constraintWidget != null && (constraintWidget instanceof ConstraintWidgetContainer)) {
            ((ConstraintWidgetContainer) constraintWidget).getClass();
        }
        ArrayList arrayList = this.mAnchors;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((ConstraintAnchor) arrayList.get(i)).reset();
        }
    }

    public final void resetFinalResolution() {
        this.mResolvedHorizontal = false;
        this.mResolvedVertical = false;
        this.mHorizontalSolvingPass = false;
        this.mVerticalSolvingPass = false;
        ArrayList arrayList = this.mAnchors;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ConstraintAnchor constraintAnchor = (ConstraintAnchor) arrayList.get(i);
            constraintAnchor.mHasFinalValue = false;
            constraintAnchor.mFinalValue = 0;
        }
    }

    public void resetSolverVariables(Recorder.AnonymousClass3 anonymousClass3) {
        this.mLeft.resetSolverVariable();
        this.mTop.resetSolverVariable();
        this.mRight.resetSolverVariable();
        this.mBottom.resetSolverVariable();
        this.mBaseline.resetSolverVariable();
        this.mCenter.resetSolverVariable();
        this.mCenterX.resetSolverVariable();
        this.mCenterY.resetSolverVariable();
    }

    public final void setBaselineDistance(int i) {
        this.mBaselineDistance = i;
        this.mHasBaseline = i > 0;
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x0086 -> B:31:0x0087). Please report as a decompilation issue!!! */
    public final void setDimensionRatio(String str) {
        float f;
        int i = 0;
        if (str == null || str.length() == 0) {
            this.mDimensionRatio = RecyclerView.DECELERATION_RATE;
            return;
        }
        int length = str.length();
        int indexOf = str.indexOf(44);
        int i2 = -1;
        if (indexOf > 0 && indexOf < length - 1) {
            String substring = str.substring(0, indexOf);
            i2 = substring.equalsIgnoreCase("W") ? 0 : substring.equalsIgnoreCase("H") ? 1 : -1;
            r3 = indexOf + 1;
        }
        int indexOf2 = str.indexOf(58);
        if (indexOf2 < 0 || indexOf2 >= length - 1) {
            String substring2 = str.substring(r3);
            if (substring2.length() > 0) {
                f = Float.parseFloat(substring2);
            }
            f = i;
        } else {
            String substring3 = str.substring(r3, indexOf2);
            String substring4 = str.substring(indexOf2 + 1);
            if (substring3.length() > 0 && substring4.length() > 0) {
                float parseFloat = Float.parseFloat(substring3);
                float parseFloat2 = Float.parseFloat(substring4);
                if (parseFloat > RecyclerView.DECELERATION_RATE && parseFloat2 > RecyclerView.DECELERATION_RATE) {
                    f = i2 == 1 ? Math.abs(parseFloat2 / parseFloat) : Math.abs(parseFloat / parseFloat2);
                }
            }
            f = i;
        }
        i = (f > i ? 1 : (f == i ? 0 : -1));
        if (i > 0) {
            this.mDimensionRatio = f;
            this.mDimensionRatioSide = i2;
        }
    }

    public final void setFinalHorizontal(int i, int i2) {
        if (this.mResolvedHorizontal) {
            return;
        }
        this.mLeft.setFinalValue(i);
        this.mRight.setFinalValue(i2);
        this.mX = i;
        this.mWidth = i2 - i;
        this.mResolvedHorizontal = true;
    }

    public final void setFinalVertical(int i, int i2) {
        if (this.mResolvedVertical) {
            return;
        }
        this.mTop.setFinalValue(i);
        this.mBottom.setFinalValue(i2);
        this.mY = i;
        this.mHeight = i2 - i;
        if (this.mHasBaseline) {
            this.mBaseline.setFinalValue(i + this.mBaselineDistance);
        }
        this.mResolvedVertical = true;
    }

    public final void setHeight(int i) {
        this.mHeight = i;
        int i2 = this.mMinHeight;
        if (i < i2) {
            this.mHeight = i2;
        }
    }

    public final void setHorizontalDimensionBehaviour(DimensionBehaviour dimensionBehaviour) {
        this.mListDimensionBehaviors[0] = dimensionBehaviour;
    }

    public final void setHorizontalMatchStyle(float f, int i, int i2, int i3) {
        this.mMatchConstraintDefaultWidth = i;
        this.mMatchConstraintMinWidth = i2;
        if (i3 == Integer.MAX_VALUE) {
            i3 = 0;
        }
        this.mMatchConstraintMaxWidth = i3;
        this.mMatchConstraintPercentWidth = f;
        if (f <= RecyclerView.DECELERATION_RATE || f >= 1.0f || i != 0) {
            return;
        }
        this.mMatchConstraintDefaultWidth = 2;
    }

    public final void setVerticalDimensionBehaviour(DimensionBehaviour dimensionBehaviour) {
        this.mListDimensionBehaviors[1] = dimensionBehaviour;
    }

    public final void setVerticalMatchStyle(float f, int i, int i2, int i3) {
        this.mMatchConstraintDefaultHeight = i;
        this.mMatchConstraintMinHeight = i2;
        if (i3 == Integer.MAX_VALUE) {
            i3 = 0;
        }
        this.mMatchConstraintMaxHeight = i3;
        this.mMatchConstraintPercentHeight = f;
        if (f <= RecyclerView.DECELERATION_RATE || f >= 1.0f || i != 0) {
            return;
        }
        this.mMatchConstraintDefaultHeight = 2;
    }

    public final void setWidth(int i) {
        this.mWidth = i;
        int i2 = this.mMinWidth;
        if (i < i2) {
            this.mWidth = i2;
        }
    }

    public String toString() {
        StringBuilder m = Boxes$$ExternalSyntheticOutline1.m("");
        m.append(this.mDebugName != null ? JsonLogicResult$Success$$ExternalSyntheticOutline0.m(new StringBuilder("id: "), this.mDebugName, " ") : "");
        m.append("(");
        m.append(this.mX);
        m.append(", ");
        m.append(this.mY);
        m.append(") - (");
        m.append(this.mWidth);
        m.append(" x ");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.mHeight, ")", m);
    }

    public void updateFromRuns(boolean z, boolean z2) {
        int i;
        int i2;
        HorizontalWidgetRun horizontalWidgetRun = this.mHorizontalRun;
        boolean z3 = z & horizontalWidgetRun.mResolved;
        VerticalWidgetRun verticalWidgetRun = this.mVerticalRun;
        boolean z4 = z2 & verticalWidgetRun.mResolved;
        int i3 = horizontalWidgetRun.start.value;
        int i4 = verticalWidgetRun.start.value;
        int i5 = horizontalWidgetRun.end.value;
        int i6 = verticalWidgetRun.end.value;
        int i7 = i6 - i4;
        if (i5 - i3 < 0 || i7 < 0 || i3 == Integer.MIN_VALUE || i3 == Integer.MAX_VALUE || i4 == Integer.MIN_VALUE || i4 == Integer.MAX_VALUE || i5 == Integer.MIN_VALUE || i5 == Integer.MAX_VALUE || i6 == Integer.MIN_VALUE || i6 == Integer.MAX_VALUE) {
            i5 = 0;
            i6 = 0;
            i3 = 0;
            i4 = 0;
        }
        int i8 = i5 - i3;
        int i9 = i6 - i4;
        if (z3) {
            this.mX = i3;
        }
        if (z4) {
            this.mY = i4;
        }
        if (this.mVisibility == 8) {
            this.mWidth = 0;
            this.mHeight = 0;
            return;
        }
        DimensionBehaviour dimensionBehaviour = DimensionBehaviour.FIXED;
        if (z3) {
            if (this.mListDimensionBehaviors[0] == dimensionBehaviour && i8 < (i2 = this.mWidth)) {
                i8 = i2;
            }
            this.mWidth = i8;
            int i10 = this.mMinWidth;
            if (i8 < i10) {
                this.mWidth = i10;
            }
        }
        if (z4) {
            if (this.mListDimensionBehaviors[1] == dimensionBehaviour && i9 < (i = this.mHeight)) {
                i9 = i;
            }
            this.mHeight = i9;
            int i11 = this.mMinHeight;
            if (i9 < i11) {
                this.mHeight = i11;
            }
        }
    }

    public void updateFromSolver(LinearSystem linearSystem, boolean z) {
        int i;
        int i2;
        VerticalWidgetRun verticalWidgetRun;
        HorizontalWidgetRun horizontalWidgetRun;
        linearSystem.getClass();
        int objectVariableValue = LinearSystem.getObjectVariableValue(this.mLeft);
        int objectVariableValue2 = LinearSystem.getObjectVariableValue(this.mTop);
        int objectVariableValue3 = LinearSystem.getObjectVariableValue(this.mRight);
        int objectVariableValue4 = LinearSystem.getObjectVariableValue(this.mBottom);
        if (z && (horizontalWidgetRun = this.mHorizontalRun) != null) {
            DependencyNode dependencyNode = horizontalWidgetRun.start;
            if (dependencyNode.resolved) {
                DependencyNode dependencyNode2 = horizontalWidgetRun.end;
                if (dependencyNode2.resolved) {
                    objectVariableValue = dependencyNode.value;
                    objectVariableValue3 = dependencyNode2.value;
                }
            }
        }
        if (z && (verticalWidgetRun = this.mVerticalRun) != null) {
            DependencyNode dependencyNode3 = verticalWidgetRun.start;
            if (dependencyNode3.resolved) {
                DependencyNode dependencyNode4 = verticalWidgetRun.end;
                if (dependencyNode4.resolved) {
                    objectVariableValue2 = dependencyNode3.value;
                    objectVariableValue4 = dependencyNode4.value;
                }
            }
        }
        int i3 = objectVariableValue4 - objectVariableValue2;
        if (objectVariableValue3 - objectVariableValue < 0 || i3 < 0 || objectVariableValue == Integer.MIN_VALUE || objectVariableValue == Integer.MAX_VALUE || objectVariableValue2 == Integer.MIN_VALUE || objectVariableValue2 == Integer.MAX_VALUE || objectVariableValue3 == Integer.MIN_VALUE || objectVariableValue3 == Integer.MAX_VALUE || objectVariableValue4 == Integer.MIN_VALUE || objectVariableValue4 == Integer.MAX_VALUE) {
            objectVariableValue = 0;
            objectVariableValue2 = 0;
            objectVariableValue3 = 0;
            objectVariableValue4 = 0;
        }
        int i4 = objectVariableValue3 - objectVariableValue;
        int i5 = objectVariableValue4 - objectVariableValue2;
        this.mX = objectVariableValue;
        this.mY = objectVariableValue2;
        if (this.mVisibility == 8) {
            this.mWidth = 0;
            this.mHeight = 0;
            return;
        }
        DimensionBehaviour[] dimensionBehaviourArr = this.mListDimensionBehaviors;
        DimensionBehaviour dimensionBehaviour = dimensionBehaviourArr[0];
        DimensionBehaviour dimensionBehaviour2 = DimensionBehaviour.FIXED;
        if (dimensionBehaviour == dimensionBehaviour2 && i4 < (i2 = this.mWidth)) {
            i4 = i2;
        }
        if (dimensionBehaviourArr[1] == dimensionBehaviour2 && i5 < (i = this.mHeight)) {
            i5 = i;
        }
        this.mWidth = i4;
        this.mHeight = i5;
        int i6 = this.mMinHeight;
        if (i5 < i6) {
            this.mHeight = i6;
        }
        int i7 = this.mMinWidth;
        if (i4 < i7) {
            this.mWidth = i7;
        }
        int i8 = this.mMatchConstraintMaxWidth;
        DimensionBehaviour dimensionBehaviour3 = DimensionBehaviour.MATCH_CONSTRAINT;
        if (i8 > 0 && dimensionBehaviour == dimensionBehaviour3) {
            this.mWidth = Math.min(this.mWidth, i8);
        }
        int i9 = this.mMatchConstraintMaxHeight;
        if (i9 > 0 && this.mListDimensionBehaviors[1] == dimensionBehaviour3) {
            this.mHeight = Math.min(this.mHeight, i9);
        }
        int i10 = this.mWidth;
        if (i4 != i10) {
            this.mWidthOverride = i10;
        }
        int i11 = this.mHeight;
        if (i5 != i11) {
            this.mHeightOverride = i11;
        }
    }

    public static void serializeAttribute(int i, int i2, String str, StringBuilder sb) {
        if (i == i2) {
            return;
        }
        Boxes$$ExternalSyntheticOutline1.m(sb, str, " :   ", i, ",\n");
    }

    public ConstraintWidget(int i, int i2) {
        this.measured = false;
        this.mHorizontalRun = null;
        this.mVerticalRun = null;
        this.isTerminalWidget = new boolean[]{true, true};
        this.mMeasureRequested = true;
        this.mWidthOverride = -1;
        this.mHeightOverride = -1;
        this.frame = new WidgetFrame(this);
        this.mResolvedHorizontal = false;
        this.mResolvedVertical = false;
        this.mHorizontalSolvingPass = false;
        this.mVerticalSolvingPass = false;
        this.mHorizontalResolution = -1;
        this.mVerticalResolution = -1;
        this.mWrapBehaviorInParent = 0;
        this.mMatchConstraintDefaultWidth = 0;
        this.mMatchConstraintDefaultHeight = 0;
        this.mResolvedMatchConstraintDefault = new int[2];
        this.mMatchConstraintMinWidth = 0;
        this.mMatchConstraintMaxWidth = 0;
        this.mMatchConstraintPercentWidth = 1.0f;
        this.mMatchConstraintMinHeight = 0;
        this.mMatchConstraintMaxHeight = 0;
        this.mMatchConstraintPercentHeight = 1.0f;
        this.mResolvedDimensionRatioSide = -1;
        this.mResolvedDimensionRatio = 1.0f;
        this.mMaxDimension = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE};
        this.mCircleConstraintAngle = Float.NaN;
        this.mHasBaseline = false;
        this.mInVirtualLayout = false;
        this.mLastHorizontalMeasureSpec = 0;
        this.mLastVerticalMeasureSpec = 0;
        ConstraintAnchor constraintAnchor = new ConstraintAnchor(this, 2);
        this.mLeft = constraintAnchor;
        ConstraintAnchor constraintAnchor2 = new ConstraintAnchor(this, 3);
        this.mTop = constraintAnchor2;
        ConstraintAnchor constraintAnchor3 = new ConstraintAnchor(this, 4);
        this.mRight = constraintAnchor3;
        ConstraintAnchor constraintAnchor4 = new ConstraintAnchor(this, 5);
        this.mBottom = constraintAnchor4;
        ConstraintAnchor constraintAnchor5 = new ConstraintAnchor(this, 6);
        this.mBaseline = constraintAnchor5;
        this.mCenterX = new ConstraintAnchor(this, 8);
        this.mCenterY = new ConstraintAnchor(this, 9);
        ConstraintAnchor constraintAnchor6 = new ConstraintAnchor(this, 7);
        this.mCenter = constraintAnchor6;
        this.mListAnchors = new ConstraintAnchor[]{constraintAnchor, constraintAnchor3, constraintAnchor2, constraintAnchor4, constraintAnchor5, constraintAnchor6};
        this.mAnchors = new ArrayList();
        this.mIsInBarrier = new boolean[2];
        DimensionBehaviour dimensionBehaviour = DimensionBehaviour.FIXED;
        this.mListDimensionBehaviors = new DimensionBehaviour[]{dimensionBehaviour, dimensionBehaviour};
        this.mParent = null;
        this.mDimensionRatio = RecyclerView.DECELERATION_RATE;
        this.mDimensionRatioSide = -1;
        this.mBaselineDistance = 0;
        this.mHorizontalBiasPercent = 0.5f;
        this.mVerticalBiasPercent = 0.5f;
        this.mVisibility = 0;
        this.mAnimated = false;
        this.mDebugName = null;
        this.mHorizontalChainStyle = 0;
        this.mVerticalChainStyle = 0;
        this.mWeight = new float[]{-1.0f, -1.0f};
        this.mListNextMatchConstraintsWidget = new ConstraintWidget[]{null, null};
        this.mNextChainWidget = new ConstraintWidget[]{null, null};
        this.mHorizontalNextWidget = null;
        this.mVerticalNextWidget = null;
        this.horizontalGroup = -1;
        this.verticalGroup = -1;
        this.mX = 0;
        this.mY = 0;
        this.mWidth = i;
        this.mHeight = i2;
        addAnchors();
    }

    public static void getSceneString(StringBuilder sb, String str, int i, int i2, int i3, int i4, int i5, float f, DimensionBehaviour dimensionBehaviour) {
        sb.append(str);
        sb.append(" :  {\n");
        String obj = dimensionBehaviour.toString();
        if (!"FIXED".equals(obj)) {
            Boxes$$ExternalSyntheticOutline1.m(sb, "      behavior", " :   ", obj, ",\n");
        }
        serializeAttribute(i, 0, "      size", sb);
        serializeAttribute(i2, 0, "      min", sb);
        serializeAttribute(i3, Integer.MAX_VALUE, "      max", sb);
        serializeAttribute(i4, 0, "      matchMin", sb);
        serializeAttribute(i5, 0, "      matchDef", sb);
        serializeAttribute(sb, "      matchPercent", f, 1.0f);
        sb.append("    },\n");
    }

    public static void getSceneString(StringBuilder sb, String str, ConstraintAnchor constraintAnchor) {
        if (constraintAnchor.mTarget == null) {
            return;
        }
        sb.append("    ");
        sb.append(str);
        sb.append(" : [ '");
        sb.append(constraintAnchor.mTarget);
        sb.append("'");
        if (constraintAnchor.mGoneMargin != Integer.MIN_VALUE || constraintAnchor.mMargin != 0) {
            sb.append(",");
            sb.append(constraintAnchor.mMargin);
            if (constraintAnchor.mGoneMargin != Integer.MIN_VALUE) {
                sb.append(",");
                sb.append(constraintAnchor.mGoneMargin);
                sb.append(",");
            }
        }
        sb.append(" ] ,\n");
    }

    public final void connect(ConstraintAnchor constraintAnchor, ConstraintAnchor constraintAnchor2, int i) {
        if (constraintAnchor.mOwner == this) {
            connect(constraintAnchor.mType, constraintAnchor2.mOwner, constraintAnchor2.mType, i);
        }
    }
}
