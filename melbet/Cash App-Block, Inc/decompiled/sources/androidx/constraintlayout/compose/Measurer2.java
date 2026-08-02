package androidx.constraintlayout.compose;

import android.util.Log;
import androidx.camera.video.Recorder;
import androidx.collection.IntIntPair;
import androidx.compose.animation.BoundsAnimation$animate$1;
import androidx.compose.ui.layout.AlignmentLineKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.RulerKt;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.constraintlayout.core.LinearSystem;
import androidx.constraintlayout.core.state.ConstraintReference;
import androidx.constraintlayout.core.state.Dimension;
import androidx.constraintlayout.core.state.HelperReference;
import androidx.constraintlayout.core.state.Reference;
import androidx.constraintlayout.core.state.WidgetFrame;
import androidx.constraintlayout.core.state.helpers.GuidelineReference;
import androidx.constraintlayout.core.widgets.ChainHead;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.ConstraintWidgetContainer;
import androidx.constraintlayout.core.widgets.HelperWidget;
import androidx.constraintlayout.core.widgets.VirtualLayout;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure$Measure;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure$Measurer;
import androidx.constraintlayout.core.widgets.analyzer.DependencyGraph;
import androidx.recyclerview.widget.RecyclerView;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.profile.components.ProfilePhotoKt;
import com.squareup.util.cash.Countries;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.ranges.RangesKt___RangesKt;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes3.dex */
public final class Measurer2 implements BasicMeasure$Measurer {
    public float forcedScaleFactor;
    public final LinkedHashMap frameCache;
    public final int[] heightConstraintsHolder;
    public final LinkedHashMap lastMeasures;
    public Map placeables;
    public final ConstraintWidgetContainer root;
    public final State state;
    public final int[] widthConstraintsHolder;

    public Measurer2(Density density) {
        ConstraintWidgetContainer constraintWidgetContainer = new ConstraintWidgetContainer(0, 0);
        constraintWidgetContainer.mChildren = new ArrayList();
        constraintWidgetContainer.mBasicMeasureSolver = new Recorder.AnonymousClass3(constraintWidgetContainer);
        DependencyGraph dependencyGraph = new DependencyGraph(constraintWidgetContainer);
        constraintWidgetContainer.mDependencyGraph = dependencyGraph;
        constraintWidgetContainer.mMeasurer = null;
        constraintWidgetContainer.mIsRtl = false;
        constraintWidgetContainer.mSystem = new LinearSystem();
        constraintWidgetContainer.mHorizontalChainsSize = 0;
        constraintWidgetContainer.mVerticalChainsSize = 0;
        constraintWidgetContainer.mVerticalChainsArray = new ChainHead[4];
        constraintWidgetContainer.mHorizontalChainsArray = new ChainHead[4];
        constraintWidgetContainer.mOptimizationLevel = EnumC0170g.SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE;
        constraintWidgetContainer.mWidthMeasuredTooSmall = false;
        constraintWidgetContainer.mHeightMeasuredTooSmall = false;
        constraintWidgetContainer.mVerticalWrapMin = null;
        constraintWidgetContainer.mHorizontalWrapMin = null;
        constraintWidgetContainer.mVerticalWrapMax = null;
        constraintWidgetContainer.mHorizontalWrapMax = null;
        constraintWidgetContainer.mWidgetsToAdd = new HashSet();
        constraintWidgetContainer.mMeasure = new BasicMeasure$Measure();
        constraintWidgetContainer.mMeasurer = this;
        dependencyGraph.mMeasurer = this;
        this.root = constraintWidgetContainer;
        this.placeables = new LinkedHashMap();
        this.lastMeasures = new LinkedHashMap();
        this.frameCache = new LinkedHashMap();
        this.state = new State(density);
        this.widthConstraintsHolder = new int[2];
        this.heightConstraintsHolder = new int[2];
        this.forcedScaleFactor = Float.NaN;
    }

    public static void obtainConstraints(ConstraintWidget.DimensionBehaviour dimensionBehaviour, int i, int i2, int i3, boolean z, boolean z2, int i4, int[] iArr) {
        int ordinal = dimensionBehaviour.ordinal();
        if (ordinal == 0) {
            iArr[0] = i;
            iArr[1] = i;
            return;
        }
        if (ordinal == 1) {
            iArr[0] = 0;
            iArr[1] = i4;
            return;
        }
        if (ordinal == 2) {
            boolean z3 = z2 || ((i3 == 1 || i3 == 2) && (i3 == 2 || i2 != 1 || z));
            iArr[0] = z3 ? i : 0;
            if (!z3) {
                i = i4;
            }
            iArr[1] = i;
            return;
        }
        if (ordinal == 3) {
            iArr[0] = i4;
            iArr[1] = i4;
        } else {
            throw new IllegalStateException((dimensionBehaviour + " is not supported").toString());
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.BasicMeasure$Measurer
    public final void didMeasures() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00ad, code lost:
    
        if (r28.mMatchConstraintDefaultHeight == 0) goto L54;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:50:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x019f  */
    /* JADX WARN: Type inference failed for: r18v1 */
    /* JADX WARN: Type inference failed for: r18v2 */
    /* JADX WARN: Type inference failed for: r18v3 */
    @Override // androidx.constraintlayout.core.widgets.analyzer.BasicMeasure$Measurer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void measure(ConstraintWidget constraintWidget, BasicMeasure$Measure basicMeasure$Measure) {
        boolean z;
        boolean z2;
        int i;
        Object obj;
        ?? r18;
        Object obj2;
        String str = constraintWidget.stringId;
        LinkedHashMap linkedHashMap = this.lastMeasures;
        Integer[] numArr = (Integer[]) linkedHashMap.get(str);
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = basicMeasure$Measure.horizontalBehavior;
        int i2 = basicMeasure$Measure.horizontalDimension;
        int i3 = constraintWidget.mMatchConstraintDefaultWidth;
        int i4 = basicMeasure$Measure.measureStrategy;
        boolean z3 = true;
        if ((numArr != null ? numArr[1].intValue() : 0) != constraintWidget.getHeight()) {
            z3 = false;
        }
        boolean isResolvedHorizontally = constraintWidget.isResolvedHorizontally();
        State state = this.state;
        obtainConstraints(dimensionBehaviour, i2, i3, i4, z3, isResolvedHorizontally, Constraints.m1025getMaxWidthimpl(state.rootIncomingConstraints), this.widthConstraintsHolder);
        obtainConstraints(basicMeasure$Measure.verticalBehavior, basicMeasure$Measure.verticalDimension, constraintWidget.mMatchConstraintDefaultHeight, basicMeasure$Measure.measureStrategy, (numArr != null ? numArr[0].intValue() : 0) == constraintWidget.getWidth(), constraintWidget.isResolvedVertically(), Constraints.m1024getMaxHeightimpl(state.rootIncomingConstraints), this.heightConstraintsHolder);
        int[] iArr = this.widthConstraintsHolder;
        int i5 = iArr[0];
        int i6 = iArr[1];
        int[] iArr2 = this.heightConstraintsHolder;
        long Constraints = ConstraintsKt.Constraints(i5, i6, iArr2[0], iArr2[1]);
        int i7 = basicMeasure$Measure.measureStrategy;
        if (i7 != 1 && i7 != 2) {
            ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = basicMeasure$Measure.horizontalBehavior;
            ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
            if (dimensionBehaviour2 == dimensionBehaviour3) {
                if (constraintWidget.mMatchConstraintDefaultWidth == 0) {
                    if (basicMeasure$Measure.verticalBehavior == dimensionBehaviour3) {
                    }
                }
            }
        }
        long m1079measureWidgetyQShABA = m1079measureWidgetyQShABA(constraintWidget, Constraints);
        constraintWidget.mMeasureRequested = false;
        int i8 = (int) (m1079measureWidgetyQShABA >> 32);
        Integer valueOf = Integer.valueOf(i8);
        int i9 = constraintWidget.mMatchConstraintMinWidth;
        Integer valueOf2 = Integer.valueOf(i9);
        if (i9 <= 0) {
            valueOf2 = null;
        }
        int i10 = constraintWidget.mMatchConstraintMaxWidth;
        int intValue = ((Number) RangesKt___RangesKt.coerceIn(valueOf, valueOf2, i10 > 0 ? Integer.valueOf(i10) : null)).intValue();
        int i11 = (int) (m1079measureWidgetyQShABA & BodyPartID.bodyIdMax);
        Integer valueOf3 = Integer.valueOf(i11);
        int i12 = constraintWidget.mMatchConstraintMinHeight;
        Integer valueOf4 = Integer.valueOf(i12);
        if (i12 <= 0) {
            valueOf4 = null;
        }
        int i13 = constraintWidget.mMatchConstraintMaxHeight;
        int intValue2 = ((Number) RangesKt___RangesKt.coerceIn(valueOf3, valueOf4, i13 > 0 ? Integer.valueOf(i13) : null)).intValue();
        if (intValue != i8) {
            Constraints = ConstraintsKt.Constraints(intValue, intValue, Constraints.m1026getMinHeightimpl(Constraints), Constraints.m1024getMaxHeightimpl(Constraints));
            z = true;
        } else {
            z = false;
        }
        if (intValue2 != i11) {
            Constraints = ConstraintsKt.Constraints(Constraints.m1027getMinWidthimpl(Constraints), Constraints.m1025getMaxWidthimpl(Constraints), intValue2, intValue2);
            z2 = true;
        } else {
            z2 = z;
        }
        if (z2) {
            m1079measureWidgetyQShABA(constraintWidget, Constraints);
            constraintWidget.mMeasureRequested = false;
        }
        Placeable placeable = (Placeable) this.placeables.get(constraintWidget.mCompanionWidget);
        basicMeasure$Measure.measuredWidth = placeable != null ? placeable.width : constraintWidget.getWidth();
        basicMeasure$Measure.measuredHeight = placeable != null ? placeable.height : constraintWidget.getHeight();
        if (placeable != null) {
            ArrayList arrayList = state.mBaselineNeededWidgets;
            if (state.mDirtyBaselineNeededWidgets) {
                arrayList.clear();
                Iterator it = state.mBaselineNeeded.iterator();
                while (it.hasNext()) {
                    ConstraintWidget constraintWidget2 = ((Reference) state.mReferences.get(it.next())).getConstraintWidget();
                    if (constraintWidget2 != null) {
                        arrayList.add(constraintWidget2);
                    }
                }
                state.mDirtyBaselineNeededWidgets = false;
            }
            if (arrayList.contains(constraintWidget)) {
                i = placeable.get(AlignmentLineKt.FirstBaseline);
                basicMeasure$Measure.measuredHasBaseline = i == Integer.MIN_VALUE;
                basicMeasure$Measure.measuredBaseline = i;
                obj = linkedHashMap.get(str);
                if (obj != null) {
                    r18 = 0;
                    Integer[] numArr2 = {0, 0, Integer.valueOf(PKIFailureInfo.systemUnavail)};
                    linkedHashMap.put(str, numArr2);
                    obj2 = numArr2;
                } else {
                    r18 = 0;
                    obj2 = obj;
                }
                Integer[] numArr3 = (Integer[]) obj2;
                numArr3[r18] = Integer.valueOf(basicMeasure$Measure.measuredWidth);
                numArr3[1] = Integer.valueOf(basicMeasure$Measure.measuredHeight);
                numArr3[2] = Integer.valueOf(basicMeasure$Measure.measuredBaseline);
                basicMeasure$Measure.measuredNeedsSolverPass = (basicMeasure$Measure.measuredWidth == basicMeasure$Measure.horizontalDimension || basicMeasure$Measure.measuredHeight != basicMeasure$Measure.verticalDimension) ? true : r18;
            }
        }
        i = Integer.MIN_VALUE;
        basicMeasure$Measure.measuredHasBaseline = i == Integer.MIN_VALUE;
        basicMeasure$Measure.measuredBaseline = i;
        obj = linkedHashMap.get(str);
        if (obj != null) {
        }
        Integer[] numArr32 = (Integer[]) obj2;
        numArr32[r18] = Integer.valueOf(basicMeasure$Measure.measuredWidth);
        numArr32[1] = Integer.valueOf(basicMeasure$Measure.measuredHeight);
        numArr32[2] = Integer.valueOf(basicMeasure$Measure.measuredBaseline);
        basicMeasure$Measure.measuredNeedsSolverPass = (basicMeasure$Measure.measuredWidth == basicMeasure$Measure.horizontalDimension || basicMeasure$Measure.measuredHeight != basicMeasure$Measure.verticalDimension) ? true : r18;
    }

    /* renamed from: measureWidget-yQShABA, reason: not valid java name */
    public final long m1079measureWidgetyQShABA(ConstraintWidget constraintWidget, long j) {
        Object obj = constraintWidget.mCompanionWidget;
        String str = constraintWidget.stringId;
        int i = 0;
        if (constraintWidget instanceof VirtualLayout) {
            int i2 = Constraints.m1023getHasFixedWidthimpl(j) ? 1073741824 : Constraints.m1021getHasBoundedWidthimpl(j) ? Integer.MIN_VALUE : 0;
            if (Constraints.m1022getHasFixedHeightimpl(j)) {
                i = 1073741824;
            } else if (Constraints.m1020getHasBoundedHeightimpl(j)) {
                i = Integer.MIN_VALUE;
            }
            VirtualLayout virtualLayout = (VirtualLayout) constraintWidget;
            virtualLayout.measure(i2, Constraints.m1025getMaxWidthimpl(j), i, Constraints.m1024getMaxHeightimpl(j));
            return IntIntPair.m128constructorimpl(virtualLayout.mMeasuredWidth, virtualLayout.mMeasuredHeight);
        }
        if (obj instanceof Measurable) {
            Placeable mo833measureBRTryo0 = ((Measurable) obj).mo833measureBRTryo0(j);
            this.placeables.put(obj, mo833measureBRTryo0);
            return IntIntPair.m128constructorimpl(mo833measureBRTryo0.width, mo833measureBRTryo0.height);
        }
        Log.w("CCL", "Nothing to measure for widget: " + str);
        return IntIntPair.m128constructorimpl(0, 0);
    }

    public final void performLayout(Placeable.PlacementScope placementScope, List list, Map map) {
        String str;
        Placeable placeable;
        Placeable.PlacementScope placementScope2;
        String str2;
        this.placeables = map;
        LinkedHashMap linkedHashMap = this.frameCache;
        int i = 0;
        if (linkedHashMap.isEmpty()) {
            ArrayList arrayList = this.root.mChildren;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                ConstraintWidget constraintWidget = (ConstraintWidget) arrayList.get(i2);
                Object obj = constraintWidget.mCompanionWidget;
                if (obj instanceof Measurable) {
                    WidgetFrame widgetFrame = constraintWidget.frame;
                    ConstraintWidget constraintWidget2 = widgetFrame.widget;
                    if (constraintWidget2 != null) {
                        widgetFrame.left = constraintWidget2.getX();
                        widgetFrame.top = constraintWidget2.getY();
                        constraintWidget2.getX();
                        constraintWidget2.getY();
                        widgetFrame.updateAttributes(constraintWidget2.frame);
                    }
                    WidgetFrame widgetFrame2 = new WidgetFrame(widgetFrame);
                    Measurable measurable = (Measurable) obj;
                    Object layoutId = RulerKt.getLayoutId(measurable);
                    if (layoutId == null) {
                        measurable.getParentData();
                        layoutId = null;
                    }
                    if (layoutId == null || (str2 = layoutId.toString()) == null) {
                        str2 = "null";
                    }
                    linkedHashMap.put(str2, widgetFrame2);
                }
            }
        }
        int size2 = list.size();
        while (i < size2) {
            Measurable measurable2 = (Measurable) list.get(i);
            Object layoutId2 = RulerKt.getLayoutId(measurable2);
            if (layoutId2 == null) {
                measurable2.getParentData();
                layoutId2 = null;
            }
            if (layoutId2 == null || (str = layoutId2.toString()) == null) {
                str = "null";
            }
            WidgetFrame widgetFrame3 = (WidgetFrame) linkedHashMap.get(str);
            if (widgetFrame3 != null && (placeable = (Placeable) this.placeables.get(measurable2)) != null && widgetFrame3.visibility != 8) {
                if (Float.isNaN(widgetFrame3.rotationX) && Float.isNaN(widgetFrame3.rotationY) && Float.isNaN(widgetFrame3.rotationZ) && Float.isNaN(widgetFrame3.translationX) && Float.isNaN(widgetFrame3.translationY) && Float.isNaN(widgetFrame3.translationZ) && Float.isNaN(widgetFrame3.scaleX) && Float.isNaN(widgetFrame3.scaleY) && Float.isNaN(widgetFrame3.alpha)) {
                    Placeable.PlacementScope.m854place70tqf50$default(placementScope, placeable, (widgetFrame3.top & BodyPartID.bodyIdMax) | (widgetFrame3.left << 32));
                } else {
                    placementScope2 = placementScope;
                    placementScope2.placeWithLayer(placeable, widgetFrame3.left, widgetFrame3.top, Float.isNaN(widgetFrame3.translationZ) ? RecyclerView.DECELERATION_RATE : widgetFrame3.translationZ, new BoundsAnimation$animate$1(widgetFrame3, 19));
                    i++;
                    placementScope = placementScope2;
                }
            }
            placementScope2 = placementScope;
            i++;
            placementScope = placementScope2;
        }
    }

    /* renamed from: performMeasure-DjhGOtQ, reason: not valid java name */
    public final long m1080performMeasureDjhGOtQ(long j, LayoutDirection layoutDirection, ConstraintSet constraintSet, List list, LinkedHashMap linkedHashMap) {
        Dimension dimension;
        Dimension dimension2;
        HelperReference helperReference;
        HelperWidget helperWidget;
        HelperWidget helperWidget2;
        this.placeables = linkedHashMap;
        if (list.isEmpty()) {
            return Countries.IntSize(Constraints.m1027getMinWidthimpl(j), Constraints.m1026getMinHeightimpl(j));
        }
        boolean m1023getHasFixedWidthimpl = Constraints.m1023getHasFixedWidthimpl(j);
        String str = Dimension.WRAP_DIMENSION;
        if (m1023getHasFixedWidthimpl) {
            dimension = Dimension.createFixed(Constraints.m1025getMaxWidthimpl(j));
        } else {
            dimension = new Dimension(str);
            int m1027getMinWidthimpl = Constraints.m1027getMinWidthimpl(j);
            if (m1027getMinWidthimpl >= 0) {
                dimension.mMin = m1027getMinWidthimpl;
            }
        }
        State state = this.state;
        ConstraintReference constraintReference = state.mParent;
        HashMap hashMap = state.mHelperReferences;
        HashMap hashMap2 = state.mReferences;
        ConstraintReference constraintReference2 = state.mParent;
        constraintReference.mHorizontalDimension = dimension;
        if (Constraints.m1022getHasFixedHeightimpl(j)) {
            dimension2 = Dimension.createFixed(Constraints.m1024getMaxHeightimpl(j));
        } else {
            dimension2 = new Dimension(str);
            int m1026getMinHeightimpl = Constraints.m1026getMinHeightimpl(j);
            if (m1026getMinHeightimpl >= 0) {
                dimension2.mMin = m1026getMinHeightimpl;
            }
        }
        constraintReference2.mVerticalDimension = dimension2;
        Dimension dimension3 = constraintReference2.mHorizontalDimension;
        ConstraintWidgetContainer constraintWidgetContainer = this.root;
        dimension3.apply(constraintWidgetContainer, 0);
        constraintReference2.mVerticalDimension.apply(constraintWidgetContainer, 1);
        state.rootIncomingConstraints = j;
        state.mIsLtr = !(layoutDirection == LayoutDirection.Rtl);
        this.placeables.clear();
        this.lastMeasures.clear();
        this.frameCache.clear();
        if (constraintSet.isDirty(list)) {
            Iterator it = hashMap2.keySet().iterator();
            while (it.hasNext()) {
                ((Reference) hashMap2.get(it.next())).getConstraintWidget().reset();
            }
            hashMap2.clear();
            hashMap2.put(0, constraintReference2);
            hashMap.clear();
            state.mTags.clear();
            state.mBaselineNeeded.clear();
            state.mDirtyBaselineNeededWidgets = true;
            constraintSet.applyTo(state, list);
            ProfilePhotoKt.buildMapping(state, list);
            constraintWidgetContainer.mChildren.clear();
            constraintReference2.mHorizontalDimension.apply(constraintWidgetContainer, 0);
            constraintReference2.mVerticalDimension.apply(constraintWidgetContainer, 1);
            for (Object obj : hashMap.keySet()) {
                HelperWidget helperWidget3 = ((HelperReference) hashMap.get(obj)).getHelperWidget();
                if (helperWidget3 != null) {
                    Reference reference = (Reference) hashMap2.get(obj);
                    if (reference == null) {
                        reference = state.constraints(obj);
                    }
                    reference.setConstraintWidget(helperWidget3);
                }
            }
            for (Object obj2 : hashMap2.keySet()) {
                Reference reference2 = (Reference) hashMap2.get(obj2);
                if (reference2 != constraintReference2 && (reference2.getFacade() instanceof HelperReference) && (helperWidget2 = ((HelperReference) reference2.getFacade()).getHelperWidget()) != null) {
                    Reference reference3 = (Reference) hashMap2.get(obj2);
                    if (reference3 == null) {
                        reference3 = state.constraints(obj2);
                    }
                    reference3.setConstraintWidget(helperWidget2);
                }
            }
            Iterator it2 = hashMap2.keySet().iterator();
            while (it2.hasNext()) {
                Reference reference4 = (Reference) hashMap2.get(it2.next());
                if (reference4 != constraintReference2) {
                    ConstraintWidget constraintWidget = reference4.getConstraintWidget();
                    constraintWidget.mDebugName = reference4.getKey().toString();
                    constraintWidget.mParent = null;
                    if (reference4.getFacade() instanceof GuidelineReference) {
                        reference4.apply();
                    }
                    constraintWidgetContainer.add(constraintWidget);
                } else {
                    reference4.setConstraintWidget(constraintWidgetContainer);
                }
            }
            Iterator it3 = hashMap.keySet().iterator();
            while (it3.hasNext()) {
                HelperReference helperReference2 = (HelperReference) hashMap.get(it3.next());
                if (helperReference2.getHelperWidget() != null) {
                    Iterator it4 = helperReference2.mReferences.iterator();
                    while (it4.hasNext()) {
                        helperReference2.getHelperWidget().add(((Reference) hashMap2.get(it4.next())).getConstraintWidget());
                    }
                    helperReference2.apply();
                } else {
                    helperReference2.apply();
                }
            }
            Iterator it5 = hashMap2.keySet().iterator();
            while (it5.hasNext()) {
                Reference reference5 = (Reference) hashMap2.get(it5.next());
                if (reference5 != constraintReference2 && (reference5.getFacade() instanceof HelperReference) && (helperWidget = (helperReference = (HelperReference) reference5.getFacade()).getHelperWidget()) != null) {
                    Iterator it6 = helperReference.mReferences.iterator();
                    while (it6.hasNext()) {
                        Object next = it6.next();
                        Reference reference6 = (Reference) hashMap2.get(next);
                        if (reference6 != null) {
                            helperWidget.add(reference6.getConstraintWidget());
                        } else if (next instanceof Reference) {
                            helperWidget.add(((Reference) next).getConstraintWidget());
                        } else {
                            System.out.println("couldn't find reference for " + next);
                        }
                    }
                    reference5.apply();
                }
            }
            for (Object obj3 : hashMap2.keySet()) {
                Reference reference7 = (Reference) hashMap2.get(obj3);
                reference7.apply();
                ConstraintWidget constraintWidget2 = reference7.getConstraintWidget();
                if (constraintWidget2 != null && obj3 != null) {
                    constraintWidget2.stringId = obj3.toString();
                }
            }
        } else {
            ProfilePhotoKt.buildMapping(state, list);
        }
        constraintWidgetContainer.setWidth(Constraints.m1025getMaxWidthimpl(j));
        constraintWidgetContainer.setHeight(Constraints.m1024getMaxHeightimpl(j));
        this.forcedScaleFactor = Float.NaN;
        constraintWidgetContainer.mBasicMeasureSolver.updateHierarchy(constraintWidgetContainer);
        constraintWidgetContainer.mOptimizationLevel = EnumC0170g.SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE;
        LinearSystem.USE_DEPENDENCY_ORDERING = constraintWidgetContainer.optimizeFor(512);
        constraintWidgetContainer.measure(constraintWidgetContainer.mOptimizationLevel, 0, 0, 0, 0, 0, 0);
        return Countries.IntSize(constraintWidgetContainer.getWidth(), constraintWidgetContainer.getHeight());
    }
}
