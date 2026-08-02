package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.core.LinearSystem;
import androidx.constraintlayout.core.Metrics;
import androidx.constraintlayout.core.widgets.Chain;
import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.ConstraintWidgetContainer;
import androidx.constraintlayout.core.widgets.HelperWidget;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure$Measure;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure$Measurer;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.constraintlayout.widget.Constraints;
import androidx.recyclerview.widget.RecyclerView;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.plaid.internal.EnumC0170g;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes3.dex */
public class ConstraintLayout extends ViewGroup {
    private static final boolean DEBUG = false;
    private static final boolean DEBUG_DRAW_CONSTRAINTS = false;
    public static final int DESIGN_INFO_ID = 0;
    private static final boolean OPTIMIZE_HEIGHT_CHANGE = false;
    private static final String TAG = "ConstraintLayout";
    private static final boolean USE_CONSTRAINTS_HELPER = true;
    public static final String VERSION = "ConstraintLayout-2.2.0-alpha04";
    private static SharedValues sSharedValues;
    SparseArray<View> mChildrenByIds;
    private ArrayList<ConstraintHelper> mConstraintHelpers;
    protected ConstraintLayoutStates mConstraintLayoutSpec;
    private ConstraintSet mConstraintSet;
    private int mConstraintSetId;
    private HashMap<String, Integer> mDesignIds;
    protected boolean mDirtyHierarchy;
    private int mLastMeasureHeight;
    int mLastMeasureHeightMode;
    int mLastMeasureHeightSize;
    private int mLastMeasureWidth;
    int mLastMeasureWidthMode;
    int mLastMeasureWidthSize;
    protected ConstraintWidgetContainer mLayoutWidget;
    private int mMaxHeight;
    private int mMaxWidth;
    Measurer mMeasurer;
    private Metrics mMetrics;
    private int mMinHeight;
    private int mMinWidth;
    private ArrayList<ValueModifier> mModifiers;
    private int mOnMeasureHeightMeasureSpec;
    private int mOnMeasureWidthMeasureSpec;
    private int mOptimizationLevel;
    private SparseArray<ConstraintWidget> mTempMapIdToWidget;

    public final class Measurer implements BasicMeasure$Measurer {
        public final ConstraintLayout mLayout;
        public int mLayoutHeightSpec;
        public int mLayoutWidthSpec;
        public int mPaddingBottom;
        public int mPaddingHeight;
        public int mPaddingTop;
        public int mPaddingWidth;

        public Measurer(ConstraintLayout constraintLayout) {
            this.mLayout = constraintLayout;
        }

        public static boolean isSimilarSpec(int i, int i2, int i3) {
            if (i == i2) {
                return true;
            }
            int mode = View.MeasureSpec.getMode(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            int size = View.MeasureSpec.getSize(i2);
            if (mode2 == 1073741824) {
                return (mode == Integer.MIN_VALUE || mode == 0) && i3 == size;
            }
            return false;
        }

        @Override // androidx.constraintlayout.core.widgets.analyzer.BasicMeasure$Measurer
        public final void didMeasures() {
            ConstraintLayout constraintLayout = this.mLayout;
            int childCount = constraintLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = constraintLayout.getChildAt(i);
                if (childAt instanceof Placeholder) {
                    Placeholder placeholder = (Placeholder) childAt;
                    if (placeholder.mContent != null) {
                        LayoutParams layoutParams = (LayoutParams) placeholder.getLayoutParams();
                        LayoutParams layoutParams2 = (LayoutParams) placeholder.mContent.getLayoutParams();
                        ConstraintWidget constraintWidget = layoutParams2.mWidget;
                        constraintWidget.mVisibility = 0;
                        ConstraintWidget constraintWidget2 = layoutParams.mWidget;
                        ConstraintWidget.DimensionBehaviour dimensionBehaviour = constraintWidget2.mListDimensionBehaviors[0];
                        ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.FIXED;
                        if (dimensionBehaviour != dimensionBehaviour2) {
                            constraintWidget2.setWidth(constraintWidget.getWidth());
                        }
                        ConstraintWidget constraintWidget3 = layoutParams.mWidget;
                        if (constraintWidget3.mListDimensionBehaviors[1] != dimensionBehaviour2) {
                            constraintWidget3.setHeight(layoutParams2.mWidget.getHeight());
                        }
                        layoutParams2.mWidget.mVisibility = 8;
                    }
                }
            }
            int size = constraintLayout.mConstraintHelpers.size();
            if (size > 0) {
                for (int i2 = 0; i2 < size; i2++) {
                    ((ConstraintHelper) constraintLayout.mConstraintHelpers.get(i2)).getClass();
                }
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:149:0x01b1  */
        /* JADX WARN: Removed duplicated region for block: B:150:0x01ac  */
        /* JADX WARN: Removed duplicated region for block: B:180:0x012f  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x00bf  */
        /* JADX WARN: Removed duplicated region for block: B:52:0x01aa  */
        /* JADX WARN: Removed duplicated region for block: B:54:0x01af  */
        /* JADX WARN: Removed duplicated region for block: B:72:0x01df A[ORIG_RETURN, RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:73:0x01e0  */
        @Override // androidx.constraintlayout.core.widgets.analyzer.BasicMeasure$Measurer
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void measure(ConstraintWidget constraintWidget, BasicMeasure$Measure basicMeasure$Measure) {
            int makeMeasureSpec;
            int i;
            int ordinal;
            int makeMeasureSpec2;
            ConstraintWidgetContainer constraintWidgetContainer;
            int max;
            int max2;
            ConstraintLayout constraintLayout;
            boolean z;
            int baseline;
            int i2;
            if (constraintWidget == null) {
                return;
            }
            ConstraintAnchor constraintAnchor = constraintWidget.mRight;
            ConstraintAnchor constraintAnchor2 = constraintWidget.mLeft;
            if (constraintWidget.mVisibility == 8 && !constraintWidget.mInPlaceholder) {
                basicMeasure$Measure.measuredWidth = 0;
                basicMeasure$Measure.measuredHeight = 0;
                basicMeasure$Measure.measuredBaseline = 0;
                return;
            }
            if (constraintWidget.mParent == null) {
                return;
            }
            ConstraintLayout constraintLayout2 = ConstraintLayout.this;
            ConstraintLayout.access$000(constraintLayout2);
            ConstraintWidget.DimensionBehaviour dimensionBehaviour = basicMeasure$Measure.horizontalBehavior;
            ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = basicMeasure$Measure.verticalBehavior;
            int i3 = basicMeasure$Measure.horizontalDimension;
            int i4 = basicMeasure$Measure.verticalDimension;
            int i5 = this.mPaddingTop + this.mPaddingBottom;
            int i6 = this.mPaddingWidth;
            View view = (View) constraintWidget.mCompanionWidget;
            int ordinal2 = dimensionBehaviour.ordinal();
            if (ordinal2 == 0) {
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
            } else if (ordinal2 == 1) {
                makeMeasureSpec = ViewGroup.getChildMeasureSpec(this.mLayoutWidthSpec, i6, -2);
            } else {
                if (ordinal2 != 2) {
                    if (ordinal2 != 3) {
                        i = 0;
                    } else {
                        int i7 = this.mLayoutWidthSpec;
                        int i8 = constraintAnchor2 != null ? constraintAnchor2.mMargin : 0;
                        if (constraintAnchor != null) {
                            i8 += constraintAnchor.mMargin;
                        }
                        i = ViewGroup.getChildMeasureSpec(i7, i6 + i8, -1);
                    }
                    ordinal = dimensionBehaviour2.ordinal();
                    if (ordinal != 0) {
                        makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
                    } else if (ordinal == 1) {
                        makeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.mLayoutHeightSpec, i5, -2);
                    } else if (ordinal == 2) {
                        makeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.mLayoutHeightSpec, i5, -2);
                        boolean z2 = constraintWidget.mMatchConstraintDefaultHeight == 1;
                        int i9 = basicMeasure$Measure.measureStrategy;
                        if (i9 == 1 || i9 == 2) {
                            boolean z3 = view.getMeasuredWidth() == constraintWidget.getWidth();
                            if (basicMeasure$Measure.measureStrategy == 2 || !z2 || ((z2 && z3) || (view instanceof Placeholder) || constraintWidget.isResolvedVertically())) {
                                makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(constraintWidget.getHeight(), 1073741824);
                            }
                        }
                    } else if (ordinal != 3) {
                        makeMeasureSpec2 = 0;
                    } else {
                        int i10 = this.mLayoutHeightSpec;
                        int i11 = constraintAnchor2 != null ? constraintWidget.mTop.mMargin : 0;
                        if (constraintAnchor != null) {
                            i11 += constraintWidget.mBottom.mMargin;
                        }
                        makeMeasureSpec2 = ViewGroup.getChildMeasureSpec(i10, i5 + i11, -1);
                    }
                    constraintWidgetContainer = (ConstraintWidgetContainer) constraintWidget.mParent;
                    if (constraintWidgetContainer == null && Chain.enabled(constraintLayout2.mOptimizationLevel, 256) && view.getMeasuredWidth() == constraintWidget.getWidth() && view.getMeasuredWidth() < constraintWidgetContainer.getWidth() && view.getMeasuredHeight() == constraintWidget.getHeight() && view.getMeasuredHeight() < constraintWidgetContainer.getHeight() && view.getBaseline() == constraintWidget.mBaselineDistance && !constraintWidget.isMeasureRequested() && isSimilarSpec(constraintWidget.mLastHorizontalMeasureSpec, i, constraintWidget.getWidth()) && isSimilarSpec(constraintWidget.mLastVerticalMeasureSpec, makeMeasureSpec2, constraintWidget.getHeight())) {
                        basicMeasure$Measure.measuredWidth = constraintWidget.getWidth();
                        basicMeasure$Measure.measuredHeight = constraintWidget.getHeight();
                        basicMeasure$Measure.measuredBaseline = constraintWidget.mBaselineDistance;
                        return;
                    }
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                    boolean z4 = dimensionBehaviour != dimensionBehaviour3;
                    boolean z5 = dimensionBehaviour2 != dimensionBehaviour3;
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = ConstraintWidget.DimensionBehaviour.FIXED;
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour5 = ConstraintWidget.DimensionBehaviour.MATCH_PARENT;
                    boolean z6 = dimensionBehaviour2 != dimensionBehaviour5 || dimensionBehaviour2 == dimensionBehaviour4;
                    boolean z7 = dimensionBehaviour != dimensionBehaviour5 || dimensionBehaviour == dimensionBehaviour4;
                    boolean z8 = !z4 && constraintWidget.mDimensionRatio > RecyclerView.DECELERATION_RATE;
                    boolean z9 = !z5 && constraintWidget.mDimensionRatio > RecyclerView.DECELERATION_RATE;
                    if (view != null) {
                        return;
                    }
                    LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
                    int i12 = basicMeasure$Measure.measureStrategy;
                    if (i12 != 1 && i12 != 2 && z4 && constraintWidget.mMatchConstraintDefaultWidth == 0 && z5 && constraintWidget.mMatchConstraintDefaultHeight == 0) {
                        constraintLayout = constraintLayout2;
                        z = false;
                        baseline = 0;
                        i2 = -1;
                        max = 0;
                        max2 = 0;
                    } else {
                        if ((view instanceof VirtualLayout) && (constraintWidget instanceof androidx.constraintlayout.core.widgets.VirtualLayout)) {
                            ((VirtualLayout) view).onMeasure((androidx.constraintlayout.core.widgets.VirtualLayout) constraintWidget, i, makeMeasureSpec2);
                        } else {
                            view.measure(i, makeMeasureSpec2);
                        }
                        constraintWidget.mLastHorizontalMeasureSpec = i;
                        constraintWidget.mLastVerticalMeasureSpec = makeMeasureSpec2;
                        constraintWidget.mMeasureRequested = false;
                        int measuredWidth = view.getMeasuredWidth();
                        int measuredHeight = view.getMeasuredHeight();
                        int baseline2 = view.getBaseline();
                        int i13 = constraintWidget.mMatchConstraintMinWidth;
                        max = i13 > 0 ? Math.max(i13, measuredWidth) : measuredWidth;
                        int i14 = constraintWidget.mMatchConstraintMaxWidth;
                        if (i14 > 0) {
                            max = Math.min(i14, max);
                        }
                        int i15 = constraintWidget.mMatchConstraintMinHeight;
                        max2 = i15 > 0 ? Math.max(i15, measuredHeight) : measuredHeight;
                        int i16 = makeMeasureSpec2;
                        int i17 = constraintWidget.mMatchConstraintMaxHeight;
                        if (i17 > 0) {
                            max2 = Math.min(i17, max2);
                        }
                        constraintLayout = constraintLayout2;
                        if (!Chain.enabled(constraintLayout2.mOptimizationLevel, 1)) {
                            if (z8 && z6) {
                                max = (int) ((max2 * constraintWidget.mDimensionRatio) + 0.5f);
                            } else if (z9 && z7) {
                                max2 = (int) ((max / constraintWidget.mDimensionRatio) + 0.5f);
                            }
                        }
                        if (measuredWidth == max && measuredHeight == max2) {
                            baseline = baseline2;
                            z = false;
                        } else {
                            if (measuredWidth != max) {
                                i = View.MeasureSpec.makeMeasureSpec(max, 1073741824);
                            }
                            int makeMeasureSpec3 = measuredHeight != max2 ? View.MeasureSpec.makeMeasureSpec(max2, 1073741824) : i16;
                            view.measure(i, makeMeasureSpec3);
                            constraintWidget.mLastHorizontalMeasureSpec = i;
                            constraintWidget.mLastVerticalMeasureSpec = makeMeasureSpec3;
                            z = false;
                            constraintWidget.mMeasureRequested = false;
                            int measuredWidth2 = view.getMeasuredWidth();
                            int measuredHeight2 = view.getMeasuredHeight();
                            baseline = view.getBaseline();
                            max = measuredWidth2;
                            max2 = measuredHeight2;
                        }
                        i2 = -1;
                    }
                    boolean z10 = baseline != i2 ? true : z;
                    basicMeasure$Measure.measuredNeedsSolverPass = (max == basicMeasure$Measure.horizontalDimension && max2 == basicMeasure$Measure.verticalDimension) ? z : true;
                    if (layoutParams.mNeedsBaseline) {
                        z10 = true;
                    }
                    if (z10 && baseline != -1 && constraintWidget.mBaselineDistance != baseline) {
                        basicMeasure$Measure.measuredNeedsSolverPass = true;
                    }
                    basicMeasure$Measure.measuredWidth = max;
                    basicMeasure$Measure.measuredHeight = max2;
                    basicMeasure$Measure.measuredHasBaseline = z10;
                    basicMeasure$Measure.measuredBaseline = baseline;
                    ConstraintLayout.access$000(constraintLayout);
                    return;
                }
                makeMeasureSpec = ViewGroup.getChildMeasureSpec(this.mLayoutWidthSpec, i6, -2);
                boolean z11 = constraintWidget.mMatchConstraintDefaultWidth == 1;
                int i18 = basicMeasure$Measure.measureStrategy;
                if (i18 == 1 || i18 == 2) {
                    boolean z12 = view.getMeasuredHeight() == constraintWidget.getHeight();
                    if (basicMeasure$Measure.measureStrategy == 2 || !z11 || ((z11 && z12) || (view instanceof Placeholder) || constraintWidget.isResolvedHorizontally())) {
                        makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(constraintWidget.getWidth(), 1073741824);
                    }
                }
            }
            i = makeMeasureSpec;
            ordinal = dimensionBehaviour2.ordinal();
            if (ordinal != 0) {
            }
            constraintWidgetContainer = (ConstraintWidgetContainer) constraintWidget.mParent;
            if (constraintWidgetContainer == null) {
            }
            ConstraintWidget.DimensionBehaviour dimensionBehaviour32 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
            if (dimensionBehaviour != dimensionBehaviour32) {
            }
            if (dimensionBehaviour2 != dimensionBehaviour32) {
            }
            ConstraintWidget.DimensionBehaviour dimensionBehaviour42 = ConstraintWidget.DimensionBehaviour.FIXED;
            ConstraintWidget.DimensionBehaviour dimensionBehaviour52 = ConstraintWidget.DimensionBehaviour.MATCH_PARENT;
            if (dimensionBehaviour2 != dimensionBehaviour52) {
            }
            if (dimensionBehaviour != dimensionBehaviour52) {
            }
            if (z4) {
            }
            if (z5) {
            }
            if (view != null) {
            }
        }
    }

    public interface ValueModifier {
    }

    public ConstraintLayout(Context context) {
        super(context);
        this.mChildrenByIds = new SparseArray<>();
        this.mConstraintHelpers = new ArrayList<>(4);
        this.mLayoutWidget = new ConstraintWidgetContainer();
        this.mMinWidth = 0;
        this.mMinHeight = 0;
        this.mMaxWidth = Integer.MAX_VALUE;
        this.mMaxHeight = Integer.MAX_VALUE;
        this.mDirtyHierarchy = true;
        this.mOptimizationLevel = EnumC0170g.SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE;
        this.mConstraintSet = null;
        this.mConstraintLayoutSpec = null;
        this.mConstraintSetId = -1;
        this.mDesignIds = new HashMap<>();
        this.mLastMeasureWidth = -1;
        this.mLastMeasureHeight = -1;
        this.mLastMeasureWidthSize = -1;
        this.mLastMeasureHeightSize = -1;
        this.mLastMeasureWidthMode = 0;
        this.mLastMeasureHeightMode = 0;
        this.mTempMapIdToWidget = new SparseArray<>();
        this.mMeasurer = new Measurer(this);
        this.mOnMeasureWidthMeasureSpec = 0;
        this.mOnMeasureHeightMeasureSpec = 0;
        init$1(null, 0, 0);
    }

    public static /* synthetic */ Metrics access$000(ConstraintLayout constraintLayout) {
        constraintLayout.getClass();
        return null;
    }

    public static SharedValues getSharedValues() {
        if (sSharedValues == null) {
            SharedValues sharedValues = new SharedValues();
            new SparseIntArray();
            sharedValues.mValuesListeners = new HashMap();
            sSharedValues = sharedValues;
        }
        return sSharedValues;
    }

    public void addValueModifier(ValueModifier valueModifier) {
        if (this.mModifiers == null) {
            this.mModifiers = new ArrayList<>();
        }
        this.mModifiers.add(valueModifier);
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0176  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void applyConstraintsFromLayoutParams(boolean z, View view, ConstraintWidget constraintWidget, LayoutParams layoutParams, SparseArray<ConstraintWidget> sparseArray) {
        ConstraintLayout constraintLayout;
        int i;
        ConstraintWidget constraintWidget2;
        int i2;
        int i3;
        int i4;
        ConstraintWidget constraintWidget3;
        int i5;
        int i6;
        int i7;
        ConstraintWidget constraintWidget4;
        int i8;
        int i9;
        int i10;
        int i11;
        ConstraintWidget constraintWidget5;
        int i12;
        LayoutParams layoutParams2;
        ConstraintWidget constraintWidget6;
        int i13;
        float f;
        int i14;
        ConstraintWidget constraintWidget7 = constraintWidget;
        layoutParams.validate();
        constraintWidget7.mVisibility = view.getVisibility();
        if (layoutParams.mIsInPlaceholder) {
            constraintWidget7.mInPlaceholder = true;
            constraintWidget7.mVisibility = 8;
        }
        constraintWidget7.mCompanionWidget = view;
        if (view instanceof ConstraintHelper) {
            constraintLayout = this;
            ((ConstraintHelper) view).resolveRtl(constraintWidget7, constraintLayout.mLayoutWidget.mIsRtl);
        } else {
            constraintLayout = this;
        }
        if (layoutParams.mIsGuideline) {
            androidx.constraintlayout.core.widgets.Guideline guideline = (androidx.constraintlayout.core.widgets.Guideline) constraintWidget7;
            int i15 = layoutParams.mResolvedGuideBegin;
            int i16 = layoutParams.mResolvedGuideEnd;
            float f2 = layoutParams.mResolvedGuidePercent;
            if (f2 != -1.0f) {
                if (f2 > -1.0f) {
                    guideline.mRelativePercent = f2;
                    guideline.mRelativeBegin = -1;
                    guideline.mRelativeEnd = -1;
                    return;
                }
                return;
            }
            if (i15 != -1) {
                if (i15 > -1) {
                    guideline.mRelativePercent = -1.0f;
                    guideline.mRelativeBegin = i15;
                    guideline.mRelativeEnd = -1;
                    return;
                }
                return;
            }
            if (i16 == -1 || i16 <= -1) {
                return;
            }
            guideline.mRelativePercent = -1.0f;
            guideline.mRelativeBegin = -1;
            guideline.mRelativeEnd = i16;
            return;
        }
        int i17 = layoutParams.mResolvedLeftToLeft;
        int i18 = layoutParams.mResolvedLeftToRight;
        int i19 = layoutParams.mResolvedRightToLeft;
        int i20 = layoutParams.mResolvedRightToRight;
        int i21 = layoutParams.mResolveGoneLeftMargin;
        int i22 = layoutParams.mResolveGoneRightMargin;
        float f3 = layoutParams.mResolvedHorizontalBias;
        int i23 = layoutParams.circleConstraint;
        if (i23 != -1) {
            ConstraintWidget constraintWidget8 = sparseArray.get(i23);
            if (constraintWidget8 != null) {
                float f4 = layoutParams.circleAngle;
                constraintWidget.immediateConnect(7, 7, layoutParams.circleRadius, 0, constraintWidget8);
                constraintWidget7 = constraintWidget;
                constraintWidget7.mCircleConstraintAngle = f4;
            }
            constraintWidget6 = constraintWidget7;
            layoutParams2 = layoutParams;
            i5 = 4;
            i4 = 2;
            i13 = 5;
            i11 = 3;
        } else {
            if (i17 != -1) {
                ConstraintWidget constraintWidget9 = sparseArray.get(i17);
                if (constraintWidget9 != null) {
                    i = 2;
                    constraintWidget7.immediateConnect(2, 2, ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin, i21, constraintWidget9);
                } else {
                    i = 2;
                }
            } else {
                i = 2;
                if (i18 != -1 && (constraintWidget2 = sparseArray.get(i18)) != null) {
                    constraintWidget.immediateConnect(2, 4, ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin, i21, constraintWidget2);
                    i2 = 2;
                    i3 = 4;
                    if (i19 == -1) {
                        ConstraintWidget constraintWidget10 = sparseArray.get(i19);
                        if (constraintWidget10 != null) {
                            constraintWidget.immediateConnect(i3, i2, ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, i22, constraintWidget10);
                        }
                        i4 = i2;
                    } else {
                        i4 = i2;
                        if (i20 != -1 && (constraintWidget3 = sparseArray.get(i20)) != null) {
                            constraintWidget.immediateConnect(i3, i3, ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, i22, constraintWidget3);
                        }
                    }
                    i5 = i3;
                    i6 = layoutParams.topToTop;
                    if (i6 == -1) {
                        ConstraintWidget constraintWidget11 = sparseArray.get(i6);
                        if (constraintWidget11 != null) {
                            i7 = 3;
                            constraintWidget.immediateConnect(3, 3, ((ViewGroup.MarginLayoutParams) layoutParams).topMargin, layoutParams.goneTopMargin, constraintWidget11);
                        } else {
                            i7 = 3;
                        }
                    } else {
                        i7 = 3;
                        int i24 = layoutParams.topToBottom;
                        if (i24 != -1 && (constraintWidget4 = sparseArray.get(i24)) != null) {
                            constraintWidget.immediateConnect(3, 5, ((ViewGroup.MarginLayoutParams) layoutParams).topMargin, layoutParams.goneTopMargin, constraintWidget4);
                            i8 = 3;
                            i9 = 5;
                            i10 = layoutParams.bottomToTop;
                            if (i10 != -1) {
                                ConstraintWidget constraintWidget12 = sparseArray.get(i10);
                                if (constraintWidget12 != null) {
                                    constraintWidget.immediateConnect(i9, i8, ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin, layoutParams.goneBottomMargin, constraintWidget12);
                                }
                                i11 = i8;
                            } else {
                                i11 = i8;
                                int i25 = layoutParams.bottomToBottom;
                                if (i25 != -1 && (constraintWidget5 = sparseArray.get(i25)) != null) {
                                    constraintWidget.immediateConnect(i9, i9, ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin, layoutParams.goneBottomMargin, constraintWidget5);
                                }
                            }
                            int i26 = i9;
                            i12 = layoutParams.baselineToBaseline;
                            if (i12 != -1) {
                                layoutParams2 = layoutParams;
                                constraintLayout.setWidgetBaseline(constraintWidget, layoutParams2, sparseArray, i12, 6);
                            } else {
                                layoutParams2 = layoutParams;
                                int i27 = layoutParams2.baselineToTop;
                                if (i27 != -1) {
                                    setWidgetBaseline(constraintWidget, layoutParams2, sparseArray, i27, i11);
                                } else {
                                    int i28 = layoutParams2.baselineToBottom;
                                    if (i28 != -1) {
                                        setWidgetBaseline(constraintWidget, layoutParams2, sparseArray, i28, i26);
                                        constraintWidget6 = constraintWidget;
                                        i13 = i26;
                                        if (f3 >= RecyclerView.DECELERATION_RATE) {
                                            constraintWidget6.mHorizontalBiasPercent = f3;
                                        }
                                        f = layoutParams2.verticalBias;
                                        if (f >= RecyclerView.DECELERATION_RATE) {
                                            constraintWidget6.mVerticalBiasPercent = f;
                                        }
                                    }
                                }
                            }
                            constraintWidget6 = constraintWidget;
                            i13 = i26;
                            if (f3 >= RecyclerView.DECELERATION_RATE) {
                            }
                            f = layoutParams2.verticalBias;
                            if (f >= RecyclerView.DECELERATION_RATE) {
                            }
                        }
                    }
                    i8 = i7;
                    i9 = 5;
                    i10 = layoutParams.bottomToTop;
                    if (i10 != -1) {
                    }
                    int i262 = i9;
                    i12 = layoutParams.baselineToBaseline;
                    if (i12 != -1) {
                    }
                    constraintWidget6 = constraintWidget;
                    i13 = i262;
                    if (f3 >= RecyclerView.DECELERATION_RATE) {
                    }
                    f = layoutParams2.verticalBias;
                    if (f >= RecyclerView.DECELERATION_RATE) {
                    }
                }
            }
            i2 = i;
            i3 = 4;
            if (i19 == -1) {
            }
            i5 = i3;
            i6 = layoutParams.topToTop;
            if (i6 == -1) {
            }
            i8 = i7;
            i9 = 5;
            i10 = layoutParams.bottomToTop;
            if (i10 != -1) {
            }
            int i2622 = i9;
            i12 = layoutParams.baselineToBaseline;
            if (i12 != -1) {
            }
            constraintWidget6 = constraintWidget;
            i13 = i2622;
            if (f3 >= RecyclerView.DECELERATION_RATE) {
            }
            f = layoutParams2.verticalBias;
            if (f >= RecyclerView.DECELERATION_RATE) {
            }
        }
        if (z && ((i14 = layoutParams2.editorAbsoluteX) != -1 || layoutParams2.editorAbsoluteY != -1)) {
            int i29 = layoutParams2.editorAbsoluteY;
            constraintWidget6.mX = i14;
            constraintWidget6.mY = i29;
        }
        boolean z2 = layoutParams2.mHorizontalDimensionFixed;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.FIXED;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.MATCH_PARENT;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
        if (z2) {
            constraintWidget6.setHorizontalDimensionBehaviour(dimensionBehaviour2);
            constraintWidget6.setWidth(((ViewGroup.MarginLayoutParams) layoutParams2).width);
            if (((ViewGroup.MarginLayoutParams) layoutParams2).width == -2) {
                constraintWidget6.setHorizontalDimensionBehaviour(dimensionBehaviour);
            }
        } else if (((ViewGroup.MarginLayoutParams) layoutParams2).width == -1) {
            if (layoutParams2.constrainedWidth) {
                constraintWidget6.setHorizontalDimensionBehaviour(dimensionBehaviour4);
            } else {
                constraintWidget6.setHorizontalDimensionBehaviour(dimensionBehaviour3);
            }
            constraintWidget6.getAnchor(i4).mMargin = ((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin;
            constraintWidget6.getAnchor(i5).mMargin = ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin;
        } else {
            constraintWidget6.setHorizontalDimensionBehaviour(dimensionBehaviour4);
            constraintWidget6.setWidth(0);
        }
        if (layoutParams2.mVerticalDimensionFixed) {
            constraintWidget6.setVerticalDimensionBehaviour(dimensionBehaviour2);
            constraintWidget6.setHeight(((ViewGroup.MarginLayoutParams) layoutParams2).height);
            if (((ViewGroup.MarginLayoutParams) layoutParams2).height == -2) {
                constraintWidget6.setVerticalDimensionBehaviour(dimensionBehaviour);
            }
        } else if (((ViewGroup.MarginLayoutParams) layoutParams2).height == -1) {
            if (layoutParams2.constrainedHeight) {
                constraintWidget6.setVerticalDimensionBehaviour(dimensionBehaviour4);
            } else {
                constraintWidget6.setVerticalDimensionBehaviour(dimensionBehaviour3);
            }
            constraintWidget6.getAnchor(i11).mMargin = ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin;
            constraintWidget6.getAnchor(i13).mMargin = ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin;
        } else {
            constraintWidget6.setVerticalDimensionBehaviour(dimensionBehaviour4);
            constraintWidget6.setHeight(0);
        }
        constraintWidget6.setDimensionRatio(layoutParams2.dimensionRatio);
        float f5 = layoutParams2.horizontalWeight;
        float[] fArr = constraintWidget6.mWeight;
        fArr[0] = f5;
        fArr[1] = layoutParams2.verticalWeight;
        constraintWidget6.mHorizontalChainStyle = layoutParams2.horizontalChainStyle;
        constraintWidget6.mVerticalChainStyle = layoutParams2.verticalChainStyle;
        int i30 = layoutParams2.wrapBehaviorInParent;
        if (i30 >= 0 && i30 <= 3) {
            constraintWidget6.mWrapBehaviorInParent = i30;
        }
        constraintWidget6.setHorizontalMatchStyle(layoutParams2.matchConstraintPercentWidth, layoutParams2.matchConstraintDefaultWidth, layoutParams2.matchConstraintMinWidth, layoutParams2.matchConstraintMaxWidth);
        constraintWidget6.setVerticalMatchStyle(layoutParams2.matchConstraintPercentHeight, layoutParams2.matchConstraintDefaultHeight, layoutParams2.matchConstraintMinHeight, layoutParams2.matchConstraintMaxHeight);
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        int size;
        ArrayList<ConstraintHelper> arrayList = this.mConstraintHelpers;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i = 0; i < size; i++) {
                this.mConstraintHelpers.get(i).getClass();
            }
        }
        super.dispatchDraw(canvas);
    }

    public boolean dynamicUpdateConstraints(int i, int i2) {
        Iterator it;
        if (this.mModifiers != null) {
            View.MeasureSpec.getSize(i);
            View.MeasureSpec.getSize(i2);
            Iterator<ValueModifier> it2 = this.mModifiers.iterator();
            do {
                if (it2.hasNext()) {
                    if (it2.next() == null) {
                        it = this.mLayoutWidget.mChildren.iterator();
                    } else {
                        a$$ExternalSyntheticBUOutline0.m$1();
                    }
                }
            } while (!it.hasNext());
            View view = (View) ((ConstraintWidget) it.next()).mCompanionWidget;
            view.getId();
            throw null;
        }
        return false;
    }

    public void fillMetrics(Metrics metrics) {
        this.mLayoutWidget.mSystem.getClass();
    }

    @Override // android.view.View
    public void forceLayout() {
        this.mDirtyHierarchy = true;
        this.mLastMeasureWidth = -1;
        this.mLastMeasureHeight = -1;
        this.mLastMeasureWidthSize = -1;
        this.mLastMeasureHeightSize = -1;
        this.mLastMeasureWidthMode = 0;
        this.mLastMeasureHeightMode = 0;
        super.forceLayout();
    }

    @Override // android.view.ViewGroup
    public LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-2);
    }

    @Override // android.view.ViewGroup
    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public Object getDesignInformation(int i, Object obj) {
        if (i != 0 || !(obj instanceof String)) {
            return null;
        }
        String str = (String) obj;
        HashMap<String, Integer> hashMap = this.mDesignIds;
        if (hashMap == null || !hashMap.containsKey(str)) {
            return null;
        }
        return this.mDesignIds.get(str);
    }

    public int getMaxHeight() {
        return this.mMaxHeight;
    }

    public int getMaxWidth() {
        return this.mMaxWidth;
    }

    public int getMinHeight() {
        return this.mMinHeight;
    }

    public int getMinWidth() {
        return this.mMinWidth;
    }

    public int getOptimizationLevel() {
        return this.mLayoutWidget.mOptimizationLevel;
    }

    public String getSceneString() {
        int id;
        StringBuilder sb = new StringBuilder();
        if (this.mLayoutWidget.stringId == null) {
            int id2 = getId();
            if (id2 != -1) {
                this.mLayoutWidget.stringId = getContext().getResources().getResourceEntryName(id2);
            } else {
                this.mLayoutWidget.stringId = "parent";
            }
        }
        ConstraintWidgetContainer constraintWidgetContainer = this.mLayoutWidget;
        if (constraintWidgetContainer.mDebugName == null) {
            constraintWidgetContainer.mDebugName = constraintWidgetContainer.stringId;
            Log.v(TAG, " setDebugName " + this.mLayoutWidget.mDebugName);
        }
        Iterator it = this.mLayoutWidget.mChildren.iterator();
        while (it.hasNext()) {
            ConstraintWidget constraintWidget = (ConstraintWidget) it.next();
            View view = (View) constraintWidget.mCompanionWidget;
            if (view != null) {
                if (constraintWidget.stringId == null && (id = view.getId()) != -1) {
                    constraintWidget.stringId = getContext().getResources().getResourceEntryName(id);
                }
                if (constraintWidget.mDebugName == null) {
                    constraintWidget.mDebugName = constraintWidget.stringId;
                    Log.v(TAG, " setDebugName " + constraintWidget.mDebugName);
                }
            }
        }
        this.mLayoutWidget.getSceneString(sb);
        return sb.toString();
    }

    public View getViewById(int i) {
        return this.mChildrenByIds.get(i);
    }

    public final ConstraintWidget getViewWidget(View view) {
        if (view == this) {
            return this.mLayoutWidget;
        }
        if (view == null) {
            return null;
        }
        if (view.getLayoutParams() instanceof LayoutParams) {
            return ((LayoutParams) view.getLayoutParams()).mWidget;
        }
        view.setLayoutParams(generateLayoutParams(view.getLayoutParams()));
        if (view.getLayoutParams() instanceof LayoutParams) {
            return ((LayoutParams) view.getLayoutParams()).mWidget;
        }
        return null;
    }

    public final void init$1(AttributeSet attributeSet, int i, int i2) {
        ConstraintWidgetContainer constraintWidgetContainer = this.mLayoutWidget;
        constraintWidgetContainer.mCompanionWidget = this;
        Measurer measurer = this.mMeasurer;
        constraintWidgetContainer.mMeasurer = measurer;
        constraintWidgetContainer.mDependencyGraph.mMeasurer = measurer;
        this.mChildrenByIds.put(getId(), this);
        this.mConstraintSet = null;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.ConstraintLayout_Layout, i, i2);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i3 = 0; i3 < indexCount; i3++) {
                int index = obtainStyledAttributes.getIndex(i3);
                if (index == 16) {
                    this.mMinWidth = obtainStyledAttributes.getDimensionPixelOffset(index, this.mMinWidth);
                } else if (index == 17) {
                    this.mMinHeight = obtainStyledAttributes.getDimensionPixelOffset(index, this.mMinHeight);
                } else if (index == 14) {
                    this.mMaxWidth = obtainStyledAttributes.getDimensionPixelOffset(index, this.mMaxWidth);
                } else if (index == 15) {
                    this.mMaxHeight = obtainStyledAttributes.getDimensionPixelOffset(index, this.mMaxHeight);
                } else if (index == 113) {
                    this.mOptimizationLevel = obtainStyledAttributes.getInt(index, this.mOptimizationLevel);
                } else if (index == 56) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            parseLayoutDescription(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.mConstraintLayoutSpec = null;
                        }
                    }
                } else if (index == 34) {
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, 0);
                    try {
                        ConstraintSet constraintSet = new ConstraintSet();
                        this.mConstraintSet = constraintSet;
                        constraintSet.load(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.mConstraintSet = null;
                    }
                    this.mConstraintSetId = resourceId2;
                }
            }
            obtainStyledAttributes.recycle();
        }
        ConstraintWidgetContainer constraintWidgetContainer2 = this.mLayoutWidget;
        constraintWidgetContainer2.mOptimizationLevel = this.mOptimizationLevel;
        LinearSystem.USE_DEPENDENCY_ORDERING = constraintWidgetContainer2.optimizeFor(512);
    }

    public boolean isRtl() {
        return (getContext().getApplicationInfo().flags & 4194304) != 0 && 1 == getLayoutDirection();
    }

    public void loadLayoutDescription(int i) {
        if (i == 0) {
            this.mConstraintLayoutSpec = null;
            return;
        }
        try {
            this.mConstraintLayoutSpec = new ConstraintLayoutStates(getContext(), this, i);
        } catch (Resources.NotFoundException unused) {
            this.mConstraintLayoutSpec = null;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View view;
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            ConstraintWidget constraintWidget = layoutParams.mWidget;
            if ((childAt.getVisibility() != 8 || layoutParams.mIsGuideline || layoutParams.mIsHelper) && !layoutParams.mIsInPlaceholder) {
                int x = constraintWidget.getX();
                int y = constraintWidget.getY();
                int width = constraintWidget.getWidth() + x;
                int height = constraintWidget.getHeight() + y;
                childAt.layout(x, y, width, height);
                if ((childAt instanceof Placeholder) && (view = ((Placeholder) childAt).mContent) != null) {
                    view.setVisibility(0);
                    view.layout(x, y, width, height);
                }
            }
        }
        int size = this.mConstraintHelpers.size();
        if (size > 0) {
            for (int i6 = 0; i6 < size; i6++) {
                this.mConstraintHelpers.get(i6).updatePostLayout();
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        boolean z;
        boolean z2;
        String str;
        int findId;
        int i3;
        boolean z3;
        int i4;
        boolean z4;
        boolean dynamicUpdateConstraints = this.mDirtyHierarchy | dynamicUpdateConstraints(i, i2);
        this.mDirtyHierarchy = dynamicUpdateConstraints;
        int i5 = 0;
        if (!dynamicUpdateConstraints) {
            int childCount = getChildCount();
            int i6 = 0;
            while (true) {
                if (i6 >= childCount) {
                    break;
                }
                if (getChildAt(i6).isLayoutRequested()) {
                    this.mDirtyHierarchy = true;
                    break;
                }
                i6++;
            }
        }
        this.mOnMeasureWidthMeasureSpec = i;
        this.mOnMeasureHeightMeasureSpec = i2;
        this.mLayoutWidget.mIsRtl = isRtl();
        if (this.mDirtyHierarchy) {
            this.mDirtyHierarchy = false;
            int childCount2 = getChildCount();
            int i7 = 0;
            while (true) {
                if (i7 >= childCount2) {
                    z = false;
                    break;
                } else {
                    if (getChildAt(i7).isLayoutRequested()) {
                        z = true;
                        break;
                    }
                    i7++;
                }
            }
            if (z) {
                int childCount3 = getChildCount();
                for (int i8 = 0; i8 < childCount3; i8++) {
                    ConstraintWidget viewWidget = getViewWidget(getChildAt(i8));
                    if (viewWidget != null) {
                        viewWidget.reset();
                    }
                }
                int i9 = -1;
                if (this.mConstraintSetId != -1) {
                    int i10 = 0;
                    while (i10 < childCount3) {
                        View childAt = getChildAt(i10);
                        if (childAt.getId() == this.mConstraintSetId && (childAt instanceof Constraints)) {
                            Constraints constraints = (Constraints) childAt;
                            if (constraints.mConstraintSet == null) {
                                constraints.mConstraintSet = new ConstraintSet();
                            }
                            ConstraintSet constraintSet = constraints.mConstraintSet;
                            constraintSet.getClass();
                            int childCount4 = constraints.getChildCount();
                            HashMap hashMap = constraintSet.mConstraints;
                            hashMap.clear();
                            int i11 = i5;
                            while (i11 < childCount4) {
                                View childAt2 = constraints.getChildAt(i11);
                                Constraints.LayoutParams layoutParams = (Constraints.LayoutParams) childAt2.getLayoutParams();
                                int id = childAt2.getId();
                                if (constraintSet.mForceId && id == i9) {
                                    OptionalProvider$$ExternalSyntheticLambda0.m$1("All children of ConstraintLayout must have ids to use ConstraintSet");
                                    return;
                                }
                                if (!hashMap.containsKey(Integer.valueOf(id))) {
                                    hashMap.put(Integer.valueOf(id), new ConstraintSet.Constraint());
                                }
                                ConstraintSet.Constraint constraint = (ConstraintSet.Constraint) hashMap.get(Integer.valueOf(id));
                                if (constraint == null) {
                                    i4 = i10;
                                    z4 = z;
                                } else {
                                    if (childAt2 instanceof ConstraintHelper) {
                                        ConstraintHelper constraintHelper = (ConstraintHelper) childAt2;
                                        ConstraintSet.Layout layout = constraint.layout;
                                        constraint.fillFromConstraints(id, layoutParams);
                                        i4 = i10;
                                        if (constraintHelper instanceof Barrier) {
                                            layout.mHelperType = 1;
                                            Barrier barrier = (Barrier) constraintHelper;
                                            layout.mBarrierDirection = barrier.mIndicatedType;
                                            z4 = z;
                                            layout.mReferenceIds = Arrays.copyOf(barrier.mIds, barrier.mCount);
                                            layout.mBarrierMargin = barrier.mBarrier.mMargin;
                                            constraint.fillFromConstraints(id, layoutParams);
                                        }
                                    } else {
                                        i4 = i10;
                                    }
                                    z4 = z;
                                    constraint.fillFromConstraints(id, layoutParams);
                                }
                                i11++;
                                i10 = i4;
                                z = z4;
                                i9 = -1;
                            }
                            i3 = i10;
                            z3 = z;
                            this.mConstraintSet = constraints.mConstraintSet;
                        } else {
                            i3 = i10;
                            z3 = z;
                        }
                        i10 = i3 + 1;
                        z = z3;
                        i5 = 0;
                        i9 = -1;
                    }
                }
                z2 = z;
                ConstraintSet constraintSet2 = this.mConstraintSet;
                if (constraintSet2 != null) {
                    constraintSet2.applyToInternal(this);
                }
                this.mLayoutWidget.mChildren.clear();
                int size = this.mConstraintHelpers.size();
                if (size > 0) {
                    for (int i12 = 0; i12 < size; i12++) {
                        ConstraintHelper constraintHelper2 = this.mConstraintHelpers.get(i12);
                        HashMap hashMap2 = constraintHelper2.mMap;
                        HelperWidget helperWidget = constraintHelper2.mHelperWidget;
                        if (helperWidget != null) {
                            helperWidget.mWidgetsCount = 0;
                            Arrays.fill(helperWidget.mWidgets, (Object) null);
                            for (int i13 = 0; i13 < constraintHelper2.mCount; i13++) {
                                int i14 = constraintHelper2.mIds[i13];
                                View viewById = getViewById(i14);
                                if (viewById == null && (findId = constraintHelper2.findId(this, (str = (String) hashMap2.get(Integer.valueOf(i14))))) != 0) {
                                    constraintHelper2.mIds[i13] = findId;
                                    hashMap2.put(Integer.valueOf(findId), str);
                                    viewById = getViewById(findId);
                                }
                                if (viewById != null) {
                                    constraintHelper2.mHelperWidget.add(getViewWidget(viewById));
                                }
                            }
                            constraintHelper2.mHelperWidget.updateConstraints();
                        }
                    }
                }
                for (int i15 = 0; i15 < childCount3; i15++) {
                    View childAt3 = getChildAt(i15);
                    if (childAt3 instanceof Placeholder) {
                        Placeholder placeholder = (Placeholder) childAt3;
                        if (placeholder.mContentId == -1) {
                            placeholder.setVisibility(placeholder.mEmptyVisibility);
                        }
                        View findViewById = findViewById(placeholder.mContentId);
                        placeholder.mContent = findViewById;
                        if (findViewById != null) {
                            ((LayoutParams) findViewById.getLayoutParams()).mIsInPlaceholder = true;
                            placeholder.mContent.setVisibility(0);
                            placeholder.setVisibility(0);
                        }
                    }
                }
                this.mTempMapIdToWidget.clear();
                this.mTempMapIdToWidget.put(0, this.mLayoutWidget);
                this.mTempMapIdToWidget.put(getId(), this.mLayoutWidget);
                for (int i16 = 0; i16 < childCount3; i16++) {
                    View childAt4 = getChildAt(i16);
                    this.mTempMapIdToWidget.put(childAt4.getId(), getViewWidget(childAt4));
                }
                for (int i17 = 0; i17 < childCount3; i17++) {
                    View childAt5 = getChildAt(i17);
                    ConstraintWidget viewWidget2 = getViewWidget(childAt5);
                    if (viewWidget2 != null) {
                        LayoutParams layoutParams2 = (LayoutParams) childAt5.getLayoutParams();
                        this.mLayoutWidget.add(viewWidget2);
                        applyConstraintsFromLayoutParams(false, childAt5, viewWidget2, layoutParams2, this.mTempMapIdToWidget);
                    }
                }
            } else {
                z2 = z;
            }
            if (z2) {
                ConstraintWidgetContainer constraintWidgetContainer = this.mLayoutWidget;
                constraintWidgetContainer.mBasicMeasureSolver.updateHierarchy(constraintWidgetContainer);
            }
        }
        this.mLayoutWidget.mSystem.getClass();
        resolveSystem(this.mLayoutWidget, this.mOptimizationLevel, i, i2);
        int width = this.mLayoutWidget.getWidth();
        int height = this.mLayoutWidget.getHeight();
        ConstraintWidgetContainer constraintWidgetContainer2 = this.mLayoutWidget;
        resolveMeasuredDimension(i, i2, width, height, constraintWidgetContainer2.mWidthMeasuredTooSmall, constraintWidgetContainer2.mHeightMeasuredTooSmall);
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        super.onViewAdded(view);
        ConstraintWidget viewWidget = getViewWidget(view);
        if ((view instanceof Guideline) && !(viewWidget instanceof androidx.constraintlayout.core.widgets.Guideline)) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            androidx.constraintlayout.core.widgets.Guideline guideline = new androidx.constraintlayout.core.widgets.Guideline();
            layoutParams.mWidget = guideline;
            layoutParams.mIsGuideline = true;
            guideline.setOrientation(layoutParams.orientation);
        }
        if (view instanceof ConstraintHelper) {
            ConstraintHelper constraintHelper = (ConstraintHelper) view;
            constraintHelper.validateParams();
            ((LayoutParams) view.getLayoutParams()).mIsHelper = true;
            if (!this.mConstraintHelpers.contains(constraintHelper)) {
                this.mConstraintHelpers.add(constraintHelper);
            }
        }
        this.mChildrenByIds.put(view.getId(), view);
        this.mDirtyHierarchy = true;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.mChildrenByIds.remove(view.getId());
        ConstraintWidget viewWidget = getViewWidget(view);
        this.mLayoutWidget.mChildren.remove(viewWidget);
        viewWidget.reset();
        this.mConstraintHelpers.remove(view);
        this.mDirtyHierarchy = true;
    }

    public void parseLayoutDescription(int i) {
        this.mConstraintLayoutSpec = new ConstraintLayoutStates(getContext(), this, i);
    }

    public void removeValueModifier(ValueModifier valueModifier) {
        if (valueModifier == null) {
            return;
        }
        this.mModifiers.remove(valueModifier);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        this.mDirtyHierarchy = true;
        this.mLastMeasureWidth = -1;
        this.mLastMeasureHeight = -1;
        this.mLastMeasureWidthSize = -1;
        this.mLastMeasureHeightSize = -1;
        this.mLastMeasureWidthMode = 0;
        this.mLastMeasureHeightMode = 0;
        super.requestLayout();
    }

    public void resolveMeasuredDimension(int i, int i2, int i3, int i4, boolean z, boolean z2) {
        Measurer measurer = this.mMeasurer;
        int i5 = measurer.mPaddingHeight;
        int resolveSizeAndState = View.resolveSizeAndState(i3 + measurer.mPaddingWidth, i, 0);
        int resolveSizeAndState2 = View.resolveSizeAndState(i4 + i5, i2, 0) & 16777215;
        int min = Math.min(this.mMaxWidth, resolveSizeAndState & 16777215);
        int min2 = Math.min(this.mMaxHeight, resolveSizeAndState2);
        if (z) {
            min |= 16777216;
        }
        if (z2) {
            min2 |= 16777216;
        }
        setMeasuredDimension(min, min2);
        this.mLastMeasureWidth = min;
        this.mLastMeasureHeight = min2;
    }

    public void resolveSystem(ConstraintWidgetContainer constraintWidgetContainer, int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        int size2 = View.MeasureSpec.getSize(i3);
        int max = Math.max(0, getPaddingTop());
        int max2 = Math.max(0, getPaddingBottom());
        int i4 = max + max2;
        int max3 = Math.max(0, getPaddingRight()) + Math.max(0, getPaddingLeft());
        int max4 = Math.max(0, getPaddingEnd()) + Math.max(0, getPaddingStart());
        if (max4 > 0) {
            max3 = max4;
        }
        Measurer measurer = this.mMeasurer;
        measurer.mPaddingTop = max;
        measurer.mPaddingBottom = max2;
        measurer.mPaddingWidth = max3;
        measurer.mPaddingHeight = i4;
        measurer.mLayoutWidthSpec = i2;
        measurer.mLayoutHeightSpec = i3;
        int max5 = Math.max(0, getPaddingStart());
        int max6 = Math.max(0, getPaddingEnd());
        if (max5 <= 0 && max6 <= 0) {
            max5 = Math.max(0, getPaddingLeft());
        } else if (isRtl()) {
            max5 = max6;
        }
        int i5 = size - max3;
        int i6 = size2 - i4;
        setSelfDimensionBehaviour(constraintWidgetContainer, mode, i5, mode2, i6);
        constraintWidgetContainer.measure(i, mode, i5, mode2, i6, max5, max);
    }

    public void setConstraintSet(ConstraintSet constraintSet) {
        this.mConstraintSet = constraintSet;
    }

    public void setDesignInformation(int i, Object obj, Object obj2) {
        if (i == 0 && (obj instanceof String) && (obj2 instanceof Integer)) {
            if (this.mDesignIds == null) {
                this.mDesignIds = new HashMap<>();
            }
            String str = (String) obj;
            int indexOf = str.indexOf("/");
            if (indexOf != -1) {
                str = str.substring(indexOf + 1);
            }
            this.mDesignIds.put(str, (Integer) obj2);
        }
    }

    @Override // android.view.View
    public void setId(int i) {
        this.mChildrenByIds.remove(getId());
        super.setId(i);
        this.mChildrenByIds.put(getId(), this);
    }

    public void setMaxHeight(int i) {
        if (i == this.mMaxHeight) {
            return;
        }
        this.mMaxHeight = i;
        requestLayout();
    }

    public void setMaxWidth(int i) {
        if (i == this.mMaxWidth) {
            return;
        }
        this.mMaxWidth = i;
        requestLayout();
    }

    public void setMinHeight(int i) {
        if (i == this.mMinHeight) {
            return;
        }
        this.mMinHeight = i;
        requestLayout();
    }

    public void setMinWidth(int i) {
        if (i == this.mMinWidth) {
            return;
        }
        this.mMinWidth = i;
        requestLayout();
    }

    public void setOnConstraintsChanged(ConstraintsChangedListener constraintsChangedListener) {
        ConstraintLayoutStates constraintLayoutStates = this.mConstraintLayoutSpec;
        if (constraintLayoutStates != null) {
            constraintLayoutStates.getClass();
        }
    }

    public void setOptimizationLevel(int i) {
        this.mOptimizationLevel = i;
        ConstraintWidgetContainer constraintWidgetContainer = this.mLayoutWidget;
        constraintWidgetContainer.mOptimizationLevel = i;
        LinearSystem.USE_DEPENDENCY_ORDERING = constraintWidgetContainer.optimizeFor(512);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void setSelfDimensionBehaviour(ConstraintWidgetContainer constraintWidgetContainer, int i, int i2, int i3, int i4) {
        ConstraintWidget.DimensionBehaviour dimensionBehaviour;
        int i5;
        int i6;
        Measurer measurer = this.mMeasurer;
        int i7 = measurer.mPaddingHeight;
        int i8 = measurer.mPaddingWidth;
        int childCount = getChildCount();
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.FIXED;
        if (i != Integer.MIN_VALUE) {
            if (i != 0) {
                if (i == 1073741824) {
                    i2 = Math.min(this.mMaxWidth - i8, i2);
                    dimensionBehaviour = dimensionBehaviour3;
                    if (i3 != Integer.MIN_VALUE) {
                        if (i3 == 0) {
                            if (childCount == 0) {
                                i4 = Math.max(0, this.mMinHeight);
                            }
                            i4 = 0;
                        } else if (i3 != 1073741824) {
                            dimensionBehaviour2 = dimensionBehaviour3;
                            i4 = 0;
                        } else {
                            i4 = Math.min(this.mMaxHeight - i7, i4);
                            dimensionBehaviour2 = dimensionBehaviour3;
                        }
                    } else if (childCount == 0) {
                        i4 = Math.max(0, this.mMinHeight);
                    }
                    if (i2 == constraintWidgetContainer.getWidth() || i4 != constraintWidgetContainer.getHeight()) {
                        constraintWidgetContainer.mDependencyGraph.mNeedRedoMeasures = true;
                    }
                    constraintWidgetContainer.mX = 0;
                    constraintWidgetContainer.mY = 0;
                    int i9 = this.mMaxWidth - i8;
                    int[] iArr = constraintWidgetContainer.mMaxDimension;
                    iArr[0] = i9;
                    iArr[1] = this.mMaxHeight - i7;
                    constraintWidgetContainer.mMinWidth = 0;
                    constraintWidgetContainer.mMinHeight = 0;
                    constraintWidgetContainer.setHorizontalDimensionBehaviour(dimensionBehaviour);
                    constraintWidgetContainer.setWidth(i2);
                    constraintWidgetContainer.setVerticalDimensionBehaviour(dimensionBehaviour2);
                    constraintWidgetContainer.setHeight(i4);
                    i5 = this.mMinWidth - i8;
                    if (i5 < 0) {
                        constraintWidgetContainer.mMinWidth = 0;
                    } else {
                        constraintWidgetContainer.mMinWidth = i5;
                    }
                    i6 = this.mMinHeight - i7;
                    if (i6 < 0) {
                        constraintWidgetContainer.mMinHeight = 0;
                        return;
                    } else {
                        constraintWidgetContainer.mMinHeight = i6;
                        return;
                    }
                }
                dimensionBehaviour = dimensionBehaviour3;
            } else if (childCount == 0) {
                i2 = Math.max(0, this.mMinWidth);
            } else {
                dimensionBehaviour = dimensionBehaviour2;
            }
            i2 = 0;
            if (i3 != Integer.MIN_VALUE) {
            }
            if (i2 == constraintWidgetContainer.getWidth()) {
            }
            constraintWidgetContainer.mDependencyGraph.mNeedRedoMeasures = true;
            constraintWidgetContainer.mX = 0;
            constraintWidgetContainer.mY = 0;
            int i92 = this.mMaxWidth - i8;
            int[] iArr2 = constraintWidgetContainer.mMaxDimension;
            iArr2[0] = i92;
            iArr2[1] = this.mMaxHeight - i7;
            constraintWidgetContainer.mMinWidth = 0;
            constraintWidgetContainer.mMinHeight = 0;
            constraintWidgetContainer.setHorizontalDimensionBehaviour(dimensionBehaviour);
            constraintWidgetContainer.setWidth(i2);
            constraintWidgetContainer.setVerticalDimensionBehaviour(dimensionBehaviour2);
            constraintWidgetContainer.setHeight(i4);
            i5 = this.mMinWidth - i8;
            if (i5 < 0) {
            }
            i6 = this.mMinHeight - i7;
            if (i6 < 0) {
            }
        } else if (childCount == 0) {
            i2 = Math.max(0, this.mMinWidth);
        }
        dimensionBehaviour = dimensionBehaviour2;
        if (i3 != Integer.MIN_VALUE) {
        }
        if (i2 == constraintWidgetContainer.getWidth()) {
        }
        constraintWidgetContainer.mDependencyGraph.mNeedRedoMeasures = true;
        constraintWidgetContainer.mX = 0;
        constraintWidgetContainer.mY = 0;
        int i922 = this.mMaxWidth - i8;
        int[] iArr22 = constraintWidgetContainer.mMaxDimension;
        iArr22[0] = i922;
        iArr22[1] = this.mMaxHeight - i7;
        constraintWidgetContainer.mMinWidth = 0;
        constraintWidgetContainer.mMinHeight = 0;
        constraintWidgetContainer.setHorizontalDimensionBehaviour(dimensionBehaviour);
        constraintWidgetContainer.setWidth(i2);
        constraintWidgetContainer.setVerticalDimensionBehaviour(dimensionBehaviour2);
        constraintWidgetContainer.setHeight(i4);
        i5 = this.mMinWidth - i8;
        if (i5 < 0) {
        }
        i6 = this.mMinHeight - i7;
        if (i6 < 0) {
        }
    }

    public void setState(int i, int i2, int i3) {
        ConstraintLayoutStates constraintLayoutStates = this.mConstraintLayoutSpec;
        if (constraintLayoutStates != null) {
            constraintLayoutStates.updateConstraints(i2, i3, i);
        }
    }

    public final void setWidgetBaseline(ConstraintWidget constraintWidget, LayoutParams layoutParams, SparseArray sparseArray, int i, int i2) {
        View view = this.mChildrenByIds.get(i);
        ConstraintWidget constraintWidget2 = (ConstraintWidget) sparseArray.get(i);
        if (constraintWidget2 == null || view == null || !(view.getLayoutParams() instanceof LayoutParams)) {
            return;
        }
        layoutParams.mNeedsBaseline = true;
        if (i2 == 6) {
            LayoutParams layoutParams2 = (LayoutParams) view.getLayoutParams();
            layoutParams2.mNeedsBaseline = true;
            layoutParams2.mWidget.mHasBaseline = true;
        }
        constraintWidget.getAnchor(6).connect(constraintWidget2.getAnchor(i2), layoutParams.baselineMargin, layoutParams.goneBaselineMargin, true);
        constraintWidget.mHasBaseline = true;
        constraintWidget.getAnchor(3).reset();
        constraintWidget.getAnchor(5).reset();
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new LayoutParams(layoutParams);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mChildrenByIds = new SparseArray<>();
        this.mConstraintHelpers = new ArrayList<>(4);
        this.mLayoutWidget = new ConstraintWidgetContainer();
        this.mMinWidth = 0;
        this.mMinHeight = 0;
        this.mMaxWidth = Integer.MAX_VALUE;
        this.mMaxHeight = Integer.MAX_VALUE;
        this.mDirtyHierarchy = true;
        this.mOptimizationLevel = EnumC0170g.SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE;
        this.mConstraintSet = null;
        this.mConstraintLayoutSpec = null;
        this.mConstraintSetId = -1;
        this.mDesignIds = new HashMap<>();
        this.mLastMeasureWidth = -1;
        this.mLastMeasureHeight = -1;
        this.mLastMeasureWidthSize = -1;
        this.mLastMeasureHeightSize = -1;
        this.mLastMeasureWidthMode = 0;
        this.mLastMeasureHeightMode = 0;
        this.mTempMapIdToWidget = new SparseArray<>();
        this.mMeasurer = new Measurer(this);
        this.mOnMeasureWidthMeasureSpec = 0;
        this.mOnMeasureHeightMeasureSpec = 0;
        init$1(attributeSet, 0, 0);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mChildrenByIds = new SparseArray<>();
        this.mConstraintHelpers = new ArrayList<>(4);
        this.mLayoutWidget = new ConstraintWidgetContainer();
        this.mMinWidth = 0;
        this.mMinHeight = 0;
        this.mMaxWidth = Integer.MAX_VALUE;
        this.mMaxHeight = Integer.MAX_VALUE;
        this.mDirtyHierarchy = true;
        this.mOptimizationLevel = EnumC0170g.SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE;
        this.mConstraintSet = null;
        this.mConstraintLayoutSpec = null;
        this.mConstraintSetId = -1;
        this.mDesignIds = new HashMap<>();
        this.mLastMeasureWidth = -1;
        this.mLastMeasureHeight = -1;
        this.mLastMeasureWidthSize = -1;
        this.mLastMeasureHeightSize = -1;
        this.mLastMeasureWidthMode = 0;
        this.mLastMeasureHeightMode = 0;
        this.mTempMapIdToWidget = new SparseArray<>();
        this.mMeasurer = new Measurer(this);
        this.mOnMeasureWidthMeasureSpec = 0;
        this.mOnMeasureHeightMeasureSpec = 0;
        init$1(attributeSet, i, 0);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.mChildrenByIds = new SparseArray<>();
        this.mConstraintHelpers = new ArrayList<>(4);
        this.mLayoutWidget = new ConstraintWidgetContainer();
        this.mMinWidth = 0;
        this.mMinHeight = 0;
        this.mMaxWidth = Integer.MAX_VALUE;
        this.mMaxHeight = Integer.MAX_VALUE;
        this.mDirtyHierarchy = true;
        this.mOptimizationLevel = EnumC0170g.SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE;
        this.mConstraintSet = null;
        this.mConstraintLayoutSpec = null;
        this.mConstraintSetId = -1;
        this.mDesignIds = new HashMap<>();
        this.mLastMeasureWidth = -1;
        this.mLastMeasureHeight = -1;
        this.mLastMeasureWidthSize = -1;
        this.mLastMeasureHeightSize = -1;
        this.mLastMeasureWidthMode = 0;
        this.mLastMeasureHeightMode = 0;
        this.mTempMapIdToWidget = new SparseArray<>();
        this.mMeasurer = new Measurer(this);
        this.mOnMeasureWidthMeasureSpec = 0;
        this.mOnMeasureHeightMeasureSpec = 0;
        init$1(attributeSet, i, i2);
    }

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {
        public final int baselineMargin;
        public int baselineToBaseline;
        public int baselineToBottom;
        public int baselineToTop;
        public int bottomToBottom;
        public int bottomToTop;
        public float circleAngle;
        public int circleConstraint;
        public int circleRadius;
        public boolean constrainedHeight;
        public boolean constrainedWidth;
        public String constraintTag;
        public String dimensionRatio;
        public int editorAbsoluteX;
        public int editorAbsoluteY;
        public int endToEnd;
        public int endToStart;
        public final int goneBaselineMargin;
        public int goneBottomMargin;
        public int goneEndMargin;
        public final int goneLeftMargin;
        public final int goneRightMargin;
        public int goneStartMargin;
        public int goneTopMargin;
        public int guideBegin;
        public int guideEnd;
        public float guidePercent;
        public final boolean guidelineUseRtl;
        public float horizontalBias;
        public int horizontalChainStyle;
        public float horizontalWeight;
        public int leftToLeft;
        public int leftToRight;
        public boolean mHorizontalDimensionFixed;
        public boolean mIsGuideline;
        public boolean mIsHelper;
        public boolean mIsInPlaceholder;
        public boolean mNeedsBaseline;
        public int mResolveGoneLeftMargin;
        public int mResolveGoneRightMargin;
        public int mResolvedGuideBegin;
        public int mResolvedGuideEnd;
        public float mResolvedGuidePercent;
        public float mResolvedHorizontalBias;
        public int mResolvedLeftToLeft;
        public int mResolvedLeftToRight;
        public int mResolvedRightToLeft;
        public int mResolvedRightToRight;
        public boolean mVerticalDimensionFixed;
        public ConstraintWidget mWidget;
        public int matchConstraintDefaultHeight;
        public int matchConstraintDefaultWidth;
        public int matchConstraintMaxHeight;
        public int matchConstraintMaxWidth;
        public int matchConstraintMinHeight;
        public int matchConstraintMinWidth;
        public float matchConstraintPercentHeight;
        public float matchConstraintPercentWidth;
        public int orientation;
        public int rightToLeft;
        public int rightToRight;
        public int startToEnd;
        public int startToStart;
        public int topToBottom;
        public int topToTop;
        public float verticalBias;
        public int verticalChainStyle;
        public float verticalWeight;
        public int wrapBehaviorInParent;

        public abstract class Table {
            public static final SparseIntArray sMap;

            static {
                SparseIntArray sparseIntArray = new SparseIntArray();
                sMap = sparseIntArray;
                sparseIntArray.append(98, 64);
                sparseIntArray.append(75, 65);
                sparseIntArray.append(84, 8);
                sparseIntArray.append(85, 9);
                sparseIntArray.append(87, 10);
                sparseIntArray.append(88, 11);
                sparseIntArray.append(94, 12);
                sparseIntArray.append(93, 13);
                sparseIntArray.append(65, 14);
                sparseIntArray.append(64, 15);
                sparseIntArray.append(60, 16);
                sparseIntArray.append(62, 52);
                sparseIntArray.append(61, 53);
                sparseIntArray.append(66, 2);
                sparseIntArray.append(68, 3);
                sparseIntArray.append(67, 4);
                sparseIntArray.append(103, 49);
                sparseIntArray.append(104, 50);
                sparseIntArray.append(72, 5);
                sparseIntArray.append(73, 6);
                sparseIntArray.append(74, 7);
                sparseIntArray.append(55, 67);
                sparseIntArray.append(0, 1);
                sparseIntArray.append(89, 17);
                sparseIntArray.append(90, 18);
                sparseIntArray.append(71, 19);
                sparseIntArray.append(70, 20);
                sparseIntArray.append(108, 21);
                sparseIntArray.append(111, 22);
                sparseIntArray.append(109, 23);
                sparseIntArray.append(106, 24);
                sparseIntArray.append(110, 25);
                sparseIntArray.append(107, 26);
                sparseIntArray.append(105, 55);
                sparseIntArray.append(112, 54);
                sparseIntArray.append(80, 29);
                sparseIntArray.append(95, 30);
                sparseIntArray.append(69, 44);
                sparseIntArray.append(82, 45);
                sparseIntArray.append(97, 46);
                sparseIntArray.append(81, 47);
                sparseIntArray.append(96, 48);
                sparseIntArray.append(58, 27);
                sparseIntArray.append(57, 28);
                sparseIntArray.append(99, 31);
                sparseIntArray.append(76, 32);
                sparseIntArray.append(101, 33);
                sparseIntArray.append(100, 34);
                sparseIntArray.append(102, 35);
                sparseIntArray.append(78, 36);
                sparseIntArray.append(77, 37);
                sparseIntArray.append(79, 38);
                sparseIntArray.append(83, 39);
                sparseIntArray.append(92, 40);
                sparseIntArray.append(86, 41);
                sparseIntArray.append(63, 42);
                sparseIntArray.append(59, 43);
                sparseIntArray.append(91, 51);
                sparseIntArray.append(114, 66);
            }
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.guideBegin = -1;
            this.guideEnd = -1;
            this.guidePercent = -1.0f;
            this.guidelineUseRtl = true;
            this.leftToLeft = -1;
            this.leftToRight = -1;
            this.rightToLeft = -1;
            this.rightToRight = -1;
            this.topToTop = -1;
            this.topToBottom = -1;
            this.bottomToTop = -1;
            this.bottomToBottom = -1;
            this.baselineToBaseline = -1;
            this.baselineToTop = -1;
            this.baselineToBottom = -1;
            this.circleConstraint = -1;
            this.circleRadius = 0;
            this.circleAngle = RecyclerView.DECELERATION_RATE;
            this.startToEnd = -1;
            this.startToStart = -1;
            this.endToStart = -1;
            this.endToEnd = -1;
            this.goneLeftMargin = PKIFailureInfo.systemUnavail;
            this.goneTopMargin = PKIFailureInfo.systemUnavail;
            this.goneRightMargin = PKIFailureInfo.systemUnavail;
            this.goneBottomMargin = PKIFailureInfo.systemUnavail;
            this.goneStartMargin = PKIFailureInfo.systemUnavail;
            this.goneEndMargin = PKIFailureInfo.systemUnavail;
            this.goneBaselineMargin = PKIFailureInfo.systemUnavail;
            this.baselineMargin = 0;
            this.horizontalBias = 0.5f;
            this.verticalBias = 0.5f;
            this.dimensionRatio = null;
            this.horizontalWeight = -1.0f;
            this.verticalWeight = -1.0f;
            this.horizontalChainStyle = 0;
            this.verticalChainStyle = 0;
            this.matchConstraintDefaultWidth = 0;
            this.matchConstraintDefaultHeight = 0;
            this.matchConstraintMinWidth = 0;
            this.matchConstraintMinHeight = 0;
            this.matchConstraintMaxWidth = 0;
            this.matchConstraintMaxHeight = 0;
            this.matchConstraintPercentWidth = 1.0f;
            this.matchConstraintPercentHeight = 1.0f;
            this.editorAbsoluteX = -1;
            this.editorAbsoluteY = -1;
            this.orientation = -1;
            this.constrainedWidth = false;
            this.constrainedHeight = false;
            this.constraintTag = null;
            this.wrapBehaviorInParent = 0;
            this.mHorizontalDimensionFixed = true;
            this.mVerticalDimensionFixed = true;
            this.mNeedsBaseline = false;
            this.mIsGuideline = false;
            this.mIsHelper = false;
            this.mIsInPlaceholder = false;
            this.mResolvedLeftToLeft = -1;
            this.mResolvedLeftToRight = -1;
            this.mResolvedRightToLeft = -1;
            this.mResolvedRightToRight = -1;
            this.mResolveGoneLeftMargin = PKIFailureInfo.systemUnavail;
            this.mResolveGoneRightMargin = PKIFailureInfo.systemUnavail;
            this.mResolvedHorizontalBias = 0.5f;
            this.mWidget = new ConstraintWidget();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.ConstraintLayout_Layout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                int i2 = Table.sMap.get(index);
                switch (i2) {
                    case 1:
                        this.orientation = obtainStyledAttributes.getInt(index, this.orientation);
                        break;
                    case 2:
                        int resourceId = obtainStyledAttributes.getResourceId(index, this.circleConstraint);
                        this.circleConstraint = resourceId;
                        if (resourceId == -1) {
                            this.circleConstraint = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 3:
                        this.circleRadius = obtainStyledAttributes.getDimensionPixelSize(index, this.circleRadius);
                        break;
                    case 4:
                        float f = obtainStyledAttributes.getFloat(index, this.circleAngle) % 360.0f;
                        this.circleAngle = f;
                        if (f < RecyclerView.DECELERATION_RATE) {
                            this.circleAngle = (360.0f - f) % 360.0f;
                            break;
                        } else {
                            break;
                        }
                    case 5:
                        this.guideBegin = obtainStyledAttributes.getDimensionPixelOffset(index, this.guideBegin);
                        break;
                    case 6:
                        this.guideEnd = obtainStyledAttributes.getDimensionPixelOffset(index, this.guideEnd);
                        break;
                    case 7:
                        this.guidePercent = obtainStyledAttributes.getFloat(index, this.guidePercent);
                        break;
                    case 8:
                        int resourceId2 = obtainStyledAttributes.getResourceId(index, this.leftToLeft);
                        this.leftToLeft = resourceId2;
                        if (resourceId2 == -1) {
                            this.leftToLeft = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 9:
                        int resourceId3 = obtainStyledAttributes.getResourceId(index, this.leftToRight);
                        this.leftToRight = resourceId3;
                        if (resourceId3 == -1) {
                            this.leftToRight = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 10:
                        int resourceId4 = obtainStyledAttributes.getResourceId(index, this.rightToLeft);
                        this.rightToLeft = resourceId4;
                        if (resourceId4 == -1) {
                            this.rightToLeft = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 11:
                        int resourceId5 = obtainStyledAttributes.getResourceId(index, this.rightToRight);
                        this.rightToRight = resourceId5;
                        if (resourceId5 == -1) {
                            this.rightToRight = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 12:
                        int resourceId6 = obtainStyledAttributes.getResourceId(index, this.topToTop);
                        this.topToTop = resourceId6;
                        if (resourceId6 == -1) {
                            this.topToTop = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 13:
                        int resourceId7 = obtainStyledAttributes.getResourceId(index, this.topToBottom);
                        this.topToBottom = resourceId7;
                        if (resourceId7 == -1) {
                            this.topToBottom = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 14:
                        int resourceId8 = obtainStyledAttributes.getResourceId(index, this.bottomToTop);
                        this.bottomToTop = resourceId8;
                        if (resourceId8 == -1) {
                            this.bottomToTop = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 15:
                        int resourceId9 = obtainStyledAttributes.getResourceId(index, this.bottomToBottom);
                        this.bottomToBottom = resourceId9;
                        if (resourceId9 == -1) {
                            this.bottomToBottom = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 16:
                        int resourceId10 = obtainStyledAttributes.getResourceId(index, this.baselineToBaseline);
                        this.baselineToBaseline = resourceId10;
                        if (resourceId10 == -1) {
                            this.baselineToBaseline = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 17:
                        int resourceId11 = obtainStyledAttributes.getResourceId(index, this.startToEnd);
                        this.startToEnd = resourceId11;
                        if (resourceId11 == -1) {
                            this.startToEnd = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 18:
                        int resourceId12 = obtainStyledAttributes.getResourceId(index, this.startToStart);
                        this.startToStart = resourceId12;
                        if (resourceId12 == -1) {
                            this.startToStart = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 19:
                        int resourceId13 = obtainStyledAttributes.getResourceId(index, this.endToStart);
                        this.endToStart = resourceId13;
                        if (resourceId13 == -1) {
                            this.endToStart = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 20:
                        int resourceId14 = obtainStyledAttributes.getResourceId(index, this.endToEnd);
                        this.endToEnd = resourceId14;
                        if (resourceId14 == -1) {
                            this.endToEnd = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 21:
                        this.goneLeftMargin = obtainStyledAttributes.getDimensionPixelSize(index, this.goneLeftMargin);
                        break;
                    case 22:
                        this.goneTopMargin = obtainStyledAttributes.getDimensionPixelSize(index, this.goneTopMargin);
                        break;
                    case 23:
                        this.goneRightMargin = obtainStyledAttributes.getDimensionPixelSize(index, this.goneRightMargin);
                        break;
                    case 24:
                        this.goneBottomMargin = obtainStyledAttributes.getDimensionPixelSize(index, this.goneBottomMargin);
                        break;
                    case 25:
                        this.goneStartMargin = obtainStyledAttributes.getDimensionPixelSize(index, this.goneStartMargin);
                        break;
                    case 26:
                        this.goneEndMargin = obtainStyledAttributes.getDimensionPixelSize(index, this.goneEndMargin);
                        break;
                    case 27:
                        this.constrainedWidth = obtainStyledAttributes.getBoolean(index, this.constrainedWidth);
                        break;
                    case 28:
                        this.constrainedHeight = obtainStyledAttributes.getBoolean(index, this.constrainedHeight);
                        break;
                    case 29:
                        this.horizontalBias = obtainStyledAttributes.getFloat(index, this.horizontalBias);
                        break;
                    case 30:
                        this.verticalBias = obtainStyledAttributes.getFloat(index, this.verticalBias);
                        break;
                    case 31:
                        int i3 = obtainStyledAttributes.getInt(index, 0);
                        this.matchConstraintDefaultWidth = i3;
                        if (i3 == 1) {
                            Log.e(ConstraintLayout.TAG, "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.");
                            break;
                        } else {
                            break;
                        }
                    case 32:
                        int i4 = obtainStyledAttributes.getInt(index, 0);
                        this.matchConstraintDefaultHeight = i4;
                        if (i4 == 1) {
                            Log.e(ConstraintLayout.TAG, "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.");
                            break;
                        } else {
                            break;
                        }
                    case 33:
                        try {
                            this.matchConstraintMinWidth = obtainStyledAttributes.getDimensionPixelSize(index, this.matchConstraintMinWidth);
                            break;
                        } catch (Exception unused) {
                            if (obtainStyledAttributes.getInt(index, this.matchConstraintMinWidth) == -2) {
                                this.matchConstraintMinWidth = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case 34:
                        try {
                            this.matchConstraintMaxWidth = obtainStyledAttributes.getDimensionPixelSize(index, this.matchConstraintMaxWidth);
                            break;
                        } catch (Exception unused2) {
                            if (obtainStyledAttributes.getInt(index, this.matchConstraintMaxWidth) == -2) {
                                this.matchConstraintMaxWidth = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case 35:
                        this.matchConstraintPercentWidth = Math.max(RecyclerView.DECELERATION_RATE, obtainStyledAttributes.getFloat(index, this.matchConstraintPercentWidth));
                        this.matchConstraintDefaultWidth = 2;
                        break;
                    case 36:
                        try {
                            this.matchConstraintMinHeight = obtainStyledAttributes.getDimensionPixelSize(index, this.matchConstraintMinHeight);
                            break;
                        } catch (Exception unused3) {
                            if (obtainStyledAttributes.getInt(index, this.matchConstraintMinHeight) == -2) {
                                this.matchConstraintMinHeight = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case 37:
                        try {
                            this.matchConstraintMaxHeight = obtainStyledAttributes.getDimensionPixelSize(index, this.matchConstraintMaxHeight);
                            break;
                        } catch (Exception unused4) {
                            if (obtainStyledAttributes.getInt(index, this.matchConstraintMaxHeight) == -2) {
                                this.matchConstraintMaxHeight = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case 38:
                        this.matchConstraintPercentHeight = Math.max(RecyclerView.DECELERATION_RATE, obtainStyledAttributes.getFloat(index, this.matchConstraintPercentHeight));
                        this.matchConstraintDefaultHeight = 2;
                        break;
                    default:
                        switch (i2) {
                            case 44:
                                ConstraintSet.parseDimensionRatioString(this, obtainStyledAttributes.getString(index));
                                break;
                            case 45:
                                this.horizontalWeight = obtainStyledAttributes.getFloat(index, this.horizontalWeight);
                                break;
                            case 46:
                                this.verticalWeight = obtainStyledAttributes.getFloat(index, this.verticalWeight);
                                break;
                            case 47:
                                this.horizontalChainStyle = obtainStyledAttributes.getInt(index, 0);
                                break;
                            case 48:
                                this.verticalChainStyle = obtainStyledAttributes.getInt(index, 0);
                                break;
                            case 49:
                                this.editorAbsoluteX = obtainStyledAttributes.getDimensionPixelOffset(index, this.editorAbsoluteX);
                                break;
                            case 50:
                                this.editorAbsoluteY = obtainStyledAttributes.getDimensionPixelOffset(index, this.editorAbsoluteY);
                                break;
                            case 51:
                                this.constraintTag = obtainStyledAttributes.getString(index);
                                break;
                            case 52:
                                int resourceId15 = obtainStyledAttributes.getResourceId(index, this.baselineToTop);
                                this.baselineToTop = resourceId15;
                                if (resourceId15 == -1) {
                                    this.baselineToTop = obtainStyledAttributes.getInt(index, -1);
                                    break;
                                } else {
                                    break;
                                }
                            case 53:
                                int resourceId16 = obtainStyledAttributes.getResourceId(index, this.baselineToBottom);
                                this.baselineToBottom = resourceId16;
                                if (resourceId16 == -1) {
                                    this.baselineToBottom = obtainStyledAttributes.getInt(index, -1);
                                    break;
                                } else {
                                    break;
                                }
                            case 54:
                                this.baselineMargin = obtainStyledAttributes.getDimensionPixelSize(index, this.baselineMargin);
                                break;
                            case 55:
                                this.goneBaselineMargin = obtainStyledAttributes.getDimensionPixelSize(index, this.goneBaselineMargin);
                                break;
                            default:
                                switch (i2) {
                                    case 64:
                                        ConstraintSet.parseDimensionConstraints(this, obtainStyledAttributes, index, 0);
                                        break;
                                    case 65:
                                        ConstraintSet.parseDimensionConstraints(this, obtainStyledAttributes, index, 1);
                                        break;
                                    case 66:
                                        this.wrapBehaviorInParent = obtainStyledAttributes.getInt(index, this.wrapBehaviorInParent);
                                        break;
                                    case 67:
                                        this.guidelineUseRtl = obtainStyledAttributes.getBoolean(index, this.guidelineUseRtl);
                                        break;
                                }
                        }
                }
            }
            obtainStyledAttributes.recycle();
            validate();
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x004a  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0051  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x0058  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x005e  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0064  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x007a  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x0082  */
        @Override // android.view.ViewGroup.MarginLayoutParams, android.view.ViewGroup.LayoutParams
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void resolveLayoutDirection(int i) {
            int i2;
            int i3;
            int i4;
            int i5;
            int i6 = ((ViewGroup.MarginLayoutParams) this).leftMargin;
            int i7 = ((ViewGroup.MarginLayoutParams) this).rightMargin;
            super.resolveLayoutDirection(i);
            boolean z = false;
            boolean z2 = 1 == getLayoutDirection();
            this.mResolvedRightToLeft = -1;
            this.mResolvedRightToRight = -1;
            this.mResolvedLeftToLeft = -1;
            this.mResolvedLeftToRight = -1;
            this.mResolveGoneLeftMargin = this.goneLeftMargin;
            this.mResolveGoneRightMargin = this.goneRightMargin;
            float f = this.horizontalBias;
            this.mResolvedHorizontalBias = f;
            int i8 = this.guideBegin;
            this.mResolvedGuideBegin = i8;
            int i9 = this.guideEnd;
            this.mResolvedGuideEnd = i9;
            float f2 = this.guidePercent;
            this.mResolvedGuidePercent = f2;
            int i10 = this.startToEnd;
            if (z2) {
                if (i10 != -1) {
                    this.mResolvedRightToLeft = i10;
                } else {
                    int i11 = this.startToStart;
                    if (i11 != -1) {
                        this.mResolvedRightToRight = i11;
                    }
                    i2 = this.endToStart;
                    if (i2 != -1) {
                        this.mResolvedLeftToRight = i2;
                        z = true;
                    }
                    i3 = this.endToEnd;
                    if (i3 != -1) {
                        this.mResolvedLeftToLeft = i3;
                        z = true;
                    }
                    i4 = this.goneStartMargin;
                    if (i4 != Integer.MIN_VALUE) {
                        this.mResolveGoneRightMargin = i4;
                    }
                    i5 = this.goneEndMargin;
                    if (i5 != Integer.MIN_VALUE) {
                        this.mResolveGoneLeftMargin = i5;
                    }
                    if (z) {
                        this.mResolvedHorizontalBias = 1.0f - f;
                    }
                    if (this.mIsGuideline && this.orientation == 1 && this.guidelineUseRtl) {
                        if (f2 == -1.0f) {
                            this.mResolvedGuidePercent = 1.0f - f2;
                            this.mResolvedGuideBegin = -1;
                            this.mResolvedGuideEnd = -1;
                        } else if (i8 != -1) {
                            this.mResolvedGuideEnd = i8;
                            this.mResolvedGuideBegin = -1;
                            this.mResolvedGuidePercent = -1.0f;
                        } else if (i9 != -1) {
                            this.mResolvedGuideBegin = i9;
                            this.mResolvedGuideEnd = -1;
                            this.mResolvedGuidePercent = -1.0f;
                        }
                    }
                }
                z = true;
                i2 = this.endToStart;
                if (i2 != -1) {
                }
                i3 = this.endToEnd;
                if (i3 != -1) {
                }
                i4 = this.goneStartMargin;
                if (i4 != Integer.MIN_VALUE) {
                }
                i5 = this.goneEndMargin;
                if (i5 != Integer.MIN_VALUE) {
                }
                if (z) {
                }
                if (this.mIsGuideline) {
                    if (f2 == -1.0f) {
                    }
                }
            } else {
                if (i10 != -1) {
                    this.mResolvedLeftToRight = i10;
                }
                int i12 = this.startToStart;
                if (i12 != -1) {
                    this.mResolvedLeftToLeft = i12;
                }
                int i13 = this.endToStart;
                if (i13 != -1) {
                    this.mResolvedRightToLeft = i13;
                }
                int i14 = this.endToEnd;
                if (i14 != -1) {
                    this.mResolvedRightToRight = i14;
                }
                int i15 = this.goneStartMargin;
                if (i15 != Integer.MIN_VALUE) {
                    this.mResolveGoneLeftMargin = i15;
                }
                int i16 = this.goneEndMargin;
                if (i16 != Integer.MIN_VALUE) {
                    this.mResolveGoneRightMargin = i16;
                }
            }
            if (this.endToStart == -1 && this.endToEnd == -1 && this.startToStart == -1 && i10 == -1) {
                int i17 = this.rightToLeft;
                if (i17 != -1) {
                    this.mResolvedRightToLeft = i17;
                    if (((ViewGroup.MarginLayoutParams) this).rightMargin <= 0 && i7 > 0) {
                        ((ViewGroup.MarginLayoutParams) this).rightMargin = i7;
                    }
                } else {
                    int i18 = this.rightToRight;
                    if (i18 != -1) {
                        this.mResolvedRightToRight = i18;
                        if (((ViewGroup.MarginLayoutParams) this).rightMargin <= 0 && i7 > 0) {
                            ((ViewGroup.MarginLayoutParams) this).rightMargin = i7;
                        }
                    }
                }
                int i19 = this.leftToLeft;
                if (i19 != -1) {
                    this.mResolvedLeftToLeft = i19;
                    if (((ViewGroup.MarginLayoutParams) this).leftMargin > 0 || i6 <= 0) {
                        return;
                    }
                    ((ViewGroup.MarginLayoutParams) this).leftMargin = i6;
                    return;
                }
                int i20 = this.leftToRight;
                if (i20 != -1) {
                    this.mResolvedLeftToRight = i20;
                    if (((ViewGroup.MarginLayoutParams) this).leftMargin > 0 || i6 <= 0) {
                        return;
                    }
                    ((ViewGroup.MarginLayoutParams) this).leftMargin = i6;
                }
            }
        }

        public final void validate() {
            this.mIsGuideline = false;
            this.mHorizontalDimensionFixed = true;
            this.mVerticalDimensionFixed = true;
            int i = ((ViewGroup.MarginLayoutParams) this).width;
            if (i == -2 && this.constrainedWidth) {
                this.mHorizontalDimensionFixed = false;
                if (this.matchConstraintDefaultWidth == 0) {
                    this.matchConstraintDefaultWidth = 1;
                }
            }
            int i2 = ((ViewGroup.MarginLayoutParams) this).height;
            if (i2 == -2 && this.constrainedHeight) {
                this.mVerticalDimensionFixed = false;
                if (this.matchConstraintDefaultHeight == 0) {
                    this.matchConstraintDefaultHeight = 1;
                }
            }
            if (i == 0 || i == -1) {
                this.mHorizontalDimensionFixed = false;
                if (i == 0 && this.matchConstraintDefaultWidth == 1) {
                    ((ViewGroup.MarginLayoutParams) this).width = -2;
                    this.constrainedWidth = true;
                }
            }
            if (i2 == 0 || i2 == -1) {
                this.mVerticalDimensionFixed = false;
                if (i2 == 0 && this.matchConstraintDefaultHeight == 1) {
                    ((ViewGroup.MarginLayoutParams) this).height = -2;
                    this.constrainedHeight = true;
                }
            }
            if (this.guidePercent == -1.0f && this.guideBegin == -1 && this.guideEnd == -1) {
                return;
            }
            this.mIsGuideline = true;
            this.mHorizontalDimensionFixed = true;
            this.mVerticalDimensionFixed = true;
            if (!(this.mWidget instanceof androidx.constraintlayout.core.widgets.Guideline)) {
                this.mWidget = new androidx.constraintlayout.core.widgets.Guideline();
            }
            ((androidx.constraintlayout.core.widgets.Guideline) this.mWidget).setOrientation(this.orientation);
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.guideBegin = -1;
            this.guideEnd = -1;
            this.guidePercent = -1.0f;
            this.guidelineUseRtl = true;
            this.leftToLeft = -1;
            this.leftToRight = -1;
            this.rightToLeft = -1;
            this.rightToRight = -1;
            this.topToTop = -1;
            this.topToBottom = -1;
            this.bottomToTop = -1;
            this.bottomToBottom = -1;
            this.baselineToBaseline = -1;
            this.baselineToTop = -1;
            this.baselineToBottom = -1;
            this.circleConstraint = -1;
            this.circleRadius = 0;
            this.circleAngle = RecyclerView.DECELERATION_RATE;
            this.startToEnd = -1;
            this.startToStart = -1;
            this.endToStart = -1;
            this.endToEnd = -1;
            this.goneLeftMargin = PKIFailureInfo.systemUnavail;
            this.goneTopMargin = PKIFailureInfo.systemUnavail;
            this.goneRightMargin = PKIFailureInfo.systemUnavail;
            this.goneBottomMargin = PKIFailureInfo.systemUnavail;
            this.goneStartMargin = PKIFailureInfo.systemUnavail;
            this.goneEndMargin = PKIFailureInfo.systemUnavail;
            this.goneBaselineMargin = PKIFailureInfo.systemUnavail;
            this.baselineMargin = 0;
            this.horizontalBias = 0.5f;
            this.verticalBias = 0.5f;
            this.dimensionRatio = null;
            this.horizontalWeight = -1.0f;
            this.verticalWeight = -1.0f;
            this.horizontalChainStyle = 0;
            this.verticalChainStyle = 0;
            this.matchConstraintDefaultWidth = 0;
            this.matchConstraintDefaultHeight = 0;
            this.matchConstraintMinWidth = 0;
            this.matchConstraintMinHeight = 0;
            this.matchConstraintMaxWidth = 0;
            this.matchConstraintMaxHeight = 0;
            this.matchConstraintPercentWidth = 1.0f;
            this.matchConstraintPercentHeight = 1.0f;
            this.editorAbsoluteX = -1;
            this.editorAbsoluteY = -1;
            this.orientation = -1;
            this.constrainedWidth = false;
            this.constrainedHeight = false;
            this.constraintTag = null;
            this.wrapBehaviorInParent = 0;
            this.mHorizontalDimensionFixed = true;
            this.mVerticalDimensionFixed = true;
            this.mNeedsBaseline = false;
            this.mIsGuideline = false;
            this.mIsHelper = false;
            this.mIsInPlaceholder = false;
            this.mResolvedLeftToLeft = -1;
            this.mResolvedLeftToRight = -1;
            this.mResolvedRightToLeft = -1;
            this.mResolvedRightToRight = -1;
            this.mResolveGoneLeftMargin = PKIFailureInfo.systemUnavail;
            this.mResolveGoneRightMargin = PKIFailureInfo.systemUnavail;
            this.mResolvedHorizontalBias = 0.5f;
            this.mWidget = new ConstraintWidget();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                ((ViewGroup.MarginLayoutParams) this).leftMargin = marginLayoutParams.leftMargin;
                ((ViewGroup.MarginLayoutParams) this).rightMargin = marginLayoutParams.rightMargin;
                ((ViewGroup.MarginLayoutParams) this).topMargin = marginLayoutParams.topMargin;
                ((ViewGroup.MarginLayoutParams) this).bottomMargin = marginLayoutParams.bottomMargin;
                setMarginStart(marginLayoutParams.getMarginStart());
                setMarginEnd(marginLayoutParams.getMarginEnd());
            }
            if (layoutParams instanceof LayoutParams) {
                LayoutParams layoutParams2 = (LayoutParams) layoutParams;
                this.guideBegin = layoutParams2.guideBegin;
                this.guideEnd = layoutParams2.guideEnd;
                this.guidePercent = layoutParams2.guidePercent;
                this.guidelineUseRtl = layoutParams2.guidelineUseRtl;
                this.leftToLeft = layoutParams2.leftToLeft;
                this.leftToRight = layoutParams2.leftToRight;
                this.rightToLeft = layoutParams2.rightToLeft;
                this.rightToRight = layoutParams2.rightToRight;
                this.topToTop = layoutParams2.topToTop;
                this.topToBottom = layoutParams2.topToBottom;
                this.bottomToTop = layoutParams2.bottomToTop;
                this.bottomToBottom = layoutParams2.bottomToBottom;
                this.baselineToBaseline = layoutParams2.baselineToBaseline;
                this.baselineToTop = layoutParams2.baselineToTop;
                this.baselineToBottom = layoutParams2.baselineToBottom;
                this.circleConstraint = layoutParams2.circleConstraint;
                this.circleRadius = layoutParams2.circleRadius;
                this.circleAngle = layoutParams2.circleAngle;
                this.startToEnd = layoutParams2.startToEnd;
                this.startToStart = layoutParams2.startToStart;
                this.endToStart = layoutParams2.endToStart;
                this.endToEnd = layoutParams2.endToEnd;
                this.goneLeftMargin = layoutParams2.goneLeftMargin;
                this.goneTopMargin = layoutParams2.goneTopMargin;
                this.goneRightMargin = layoutParams2.goneRightMargin;
                this.goneBottomMargin = layoutParams2.goneBottomMargin;
                this.goneStartMargin = layoutParams2.goneStartMargin;
                this.goneEndMargin = layoutParams2.goneEndMargin;
                this.goneBaselineMargin = layoutParams2.goneBaselineMargin;
                this.baselineMargin = layoutParams2.baselineMargin;
                this.horizontalBias = layoutParams2.horizontalBias;
                this.verticalBias = layoutParams2.verticalBias;
                this.dimensionRatio = layoutParams2.dimensionRatio;
                this.horizontalWeight = layoutParams2.horizontalWeight;
                this.verticalWeight = layoutParams2.verticalWeight;
                this.horizontalChainStyle = layoutParams2.horizontalChainStyle;
                this.verticalChainStyle = layoutParams2.verticalChainStyle;
                this.constrainedWidth = layoutParams2.constrainedWidth;
                this.constrainedHeight = layoutParams2.constrainedHeight;
                this.matchConstraintDefaultWidth = layoutParams2.matchConstraintDefaultWidth;
                this.matchConstraintDefaultHeight = layoutParams2.matchConstraintDefaultHeight;
                this.matchConstraintMinWidth = layoutParams2.matchConstraintMinWidth;
                this.matchConstraintMaxWidth = layoutParams2.matchConstraintMaxWidth;
                this.matchConstraintMinHeight = layoutParams2.matchConstraintMinHeight;
                this.matchConstraintMaxHeight = layoutParams2.matchConstraintMaxHeight;
                this.matchConstraintPercentWidth = layoutParams2.matchConstraintPercentWidth;
                this.matchConstraintPercentHeight = layoutParams2.matchConstraintPercentHeight;
                this.editorAbsoluteX = layoutParams2.editorAbsoluteX;
                this.editorAbsoluteY = layoutParams2.editorAbsoluteY;
                this.orientation = layoutParams2.orientation;
                this.mHorizontalDimensionFixed = layoutParams2.mHorizontalDimensionFixed;
                this.mVerticalDimensionFixed = layoutParams2.mVerticalDimensionFixed;
                this.mNeedsBaseline = layoutParams2.mNeedsBaseline;
                this.mIsGuideline = layoutParams2.mIsGuideline;
                this.mResolvedLeftToLeft = layoutParams2.mResolvedLeftToLeft;
                this.mResolvedLeftToRight = layoutParams2.mResolvedLeftToRight;
                this.mResolvedRightToLeft = layoutParams2.mResolvedRightToLeft;
                this.mResolvedRightToRight = layoutParams2.mResolvedRightToRight;
                this.mResolveGoneLeftMargin = layoutParams2.mResolveGoneLeftMargin;
                this.mResolveGoneRightMargin = layoutParams2.mResolveGoneRightMargin;
                this.mResolvedHorizontalBias = layoutParams2.mResolvedHorizontalBias;
                this.constraintTag = layoutParams2.constraintTag;
                this.wrapBehaviorInParent = layoutParams2.wrapBehaviorInParent;
                this.mWidget = layoutParams2.mWidget;
            }
        }

        public LayoutParams(int i) {
            super(i, -2);
            this.guideBegin = -1;
            this.guideEnd = -1;
            this.guidePercent = -1.0f;
            this.guidelineUseRtl = true;
            this.leftToLeft = -1;
            this.leftToRight = -1;
            this.rightToLeft = -1;
            this.rightToRight = -1;
            this.topToTop = -1;
            this.topToBottom = -1;
            this.bottomToTop = -1;
            this.bottomToBottom = -1;
            this.baselineToBaseline = -1;
            this.baselineToTop = -1;
            this.baselineToBottom = -1;
            this.circleConstraint = -1;
            this.circleRadius = 0;
            this.circleAngle = RecyclerView.DECELERATION_RATE;
            this.startToEnd = -1;
            this.startToStart = -1;
            this.endToStart = -1;
            this.endToEnd = -1;
            this.goneLeftMargin = PKIFailureInfo.systemUnavail;
            this.goneTopMargin = PKIFailureInfo.systemUnavail;
            this.goneRightMargin = PKIFailureInfo.systemUnavail;
            this.goneBottomMargin = PKIFailureInfo.systemUnavail;
            this.goneStartMargin = PKIFailureInfo.systemUnavail;
            this.goneEndMargin = PKIFailureInfo.systemUnavail;
            this.goneBaselineMargin = PKIFailureInfo.systemUnavail;
            this.baselineMargin = 0;
            this.horizontalBias = 0.5f;
            this.verticalBias = 0.5f;
            this.dimensionRatio = null;
            this.horizontalWeight = -1.0f;
            this.verticalWeight = -1.0f;
            this.horizontalChainStyle = 0;
            this.verticalChainStyle = 0;
            this.matchConstraintDefaultWidth = 0;
            this.matchConstraintDefaultHeight = 0;
            this.matchConstraintMinWidth = 0;
            this.matchConstraintMinHeight = 0;
            this.matchConstraintMaxWidth = 0;
            this.matchConstraintMaxHeight = 0;
            this.matchConstraintPercentWidth = 1.0f;
            this.matchConstraintPercentHeight = 1.0f;
            this.editorAbsoluteX = -1;
            this.editorAbsoluteY = -1;
            this.orientation = -1;
            this.constrainedWidth = false;
            this.constrainedHeight = false;
            this.constraintTag = null;
            this.wrapBehaviorInParent = 0;
            this.mHorizontalDimensionFixed = true;
            this.mVerticalDimensionFixed = true;
            this.mNeedsBaseline = false;
            this.mIsGuideline = false;
            this.mIsHelper = false;
            this.mIsInPlaceholder = false;
            this.mResolvedLeftToLeft = -1;
            this.mResolvedLeftToRight = -1;
            this.mResolvedRightToLeft = -1;
            this.mResolvedRightToRight = -1;
            this.mResolveGoneLeftMargin = PKIFailureInfo.systemUnavail;
            this.mResolveGoneRightMargin = PKIFailureInfo.systemUnavail;
            this.mResolvedHorizontalBias = 0.5f;
            this.mWidget = new ConstraintWidget();
        }
    }
}
