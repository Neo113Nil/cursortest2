package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.ConstraintWidgetContainer;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class ChainRun extends WidgetRun {
    public int mChainStyle;
    public final ArrayList mWidgets;

    public ChainRun(ConstraintWidget constraintWidget, int i) {
        super(constraintWidget);
        ConstraintWidget constraintWidget2;
        ArrayList arrayList = new ArrayList();
        this.mWidgets = arrayList;
        this.orientation = i;
        ConstraintWidget constraintWidget3 = this.mWidget;
        ConstraintWidget previousChainMember = constraintWidget3.getPreviousChainMember(i);
        while (true) {
            constraintWidget2 = constraintWidget3;
            constraintWidget3 = previousChainMember;
            if (constraintWidget3 == null) {
                break;
            } else {
                previousChainMember = constraintWidget3.getPreviousChainMember(this.orientation);
            }
        }
        this.mWidget = constraintWidget2;
        int i2 = this.orientation;
        arrayList.add(i2 == 0 ? constraintWidget2.mHorizontalRun : i2 == 1 ? constraintWidget2.mVerticalRun : null);
        ConstraintWidget nextChainMember = constraintWidget2.getNextChainMember(this.orientation);
        while (nextChainMember != null) {
            int i3 = this.orientation;
            arrayList.add(i3 == 0 ? nextChainMember.mHorizontalRun : i3 == 1 ? nextChainMember.mVerticalRun : null);
            nextChainMember = nextChainMember.getNextChainMember(this.orientation);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            WidgetRun widgetRun = (WidgetRun) it.next();
            int i4 = this.orientation;
            if (i4 == 0) {
                widgetRun.mWidget.horizontalChainRun = this;
            } else if (i4 == 1) {
                widgetRun.mWidget.verticalChainRun = this;
            }
        }
        if (this.orientation == 0 && ((ConstraintWidgetContainer) this.mWidget.mParent).mIsRtl && arrayList.size() > 1) {
            this.mWidget = ((WidgetRun) JsonLogicResult$Success$$ExternalSyntheticOutline0.m(1, arrayList)).mWidget;
        }
        int i5 = this.orientation;
        ConstraintWidget constraintWidget4 = this.mWidget;
        this.mChainStyle = i5 == 0 ? constraintWidget4.mHorizontalChainStyle : constraintWidget4.mVerticalChainStyle;
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public final void apply() {
        ArrayList arrayList = this.mWidgets;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((WidgetRun) it.next()).apply();
        }
        int size = arrayList.size();
        if (size < 1) {
            return;
        }
        ConstraintWidget constraintWidget = ((WidgetRun) arrayList.get(0)).mWidget;
        ConstraintWidget constraintWidget2 = ((WidgetRun) arrayList.get(size - 1)).mWidget;
        int i = this.orientation;
        DependencyNode dependencyNode = this.end;
        DependencyNode dependencyNode2 = this.start;
        if (i == 0) {
            ConstraintAnchor constraintAnchor = constraintWidget.mLeft;
            ConstraintAnchor constraintAnchor2 = constraintWidget2.mRight;
            DependencyNode target = WidgetRun.getTarget(constraintAnchor, 0);
            int margin = constraintAnchor.getMargin();
            ConstraintWidget firstVisibleWidget = getFirstVisibleWidget();
            if (firstVisibleWidget != null) {
                margin = firstVisibleWidget.mLeft.getMargin();
            }
            if (target != null) {
                WidgetRun.addTarget(dependencyNode2, target, margin);
            }
            DependencyNode target2 = WidgetRun.getTarget(constraintAnchor2, 0);
            int margin2 = constraintAnchor2.getMargin();
            ConstraintWidget lastVisibleWidget = getLastVisibleWidget();
            if (lastVisibleWidget != null) {
                margin2 = lastVisibleWidget.mRight.getMargin();
            }
            if (target2 != null) {
                WidgetRun.addTarget(dependencyNode, target2, -margin2);
            }
        } else {
            ConstraintAnchor constraintAnchor3 = constraintWidget.mTop;
            ConstraintAnchor constraintAnchor4 = constraintWidget2.mBottom;
            DependencyNode target3 = WidgetRun.getTarget(constraintAnchor3, 1);
            int margin3 = constraintAnchor3.getMargin();
            ConstraintWidget firstVisibleWidget2 = getFirstVisibleWidget();
            if (firstVisibleWidget2 != null) {
                margin3 = firstVisibleWidget2.mTop.getMargin();
            }
            if (target3 != null) {
                WidgetRun.addTarget(dependencyNode2, target3, margin3);
            }
            DependencyNode target4 = WidgetRun.getTarget(constraintAnchor4, 1);
            int margin4 = constraintAnchor4.getMargin();
            ConstraintWidget lastVisibleWidget2 = getLastVisibleWidget();
            if (lastVisibleWidget2 != null) {
                margin4 = lastVisibleWidget2.mBottom.getMargin();
            }
            if (target4 != null) {
                WidgetRun.addTarget(dependencyNode, target4, -margin4);
            }
        }
        dependencyNode2.updateDelegate = this;
        dependencyNode.updateDelegate = this;
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public final void applyToWidget() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.mWidgets;
            if (i >= arrayList.size()) {
                return;
            }
            ((WidgetRun) arrayList.get(i)).applyToWidget();
            i++;
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public final void clear() {
        this.mRunGroup = null;
        Iterator it = this.mWidgets.iterator();
        while (it.hasNext()) {
            ((WidgetRun) it.next()).clear();
        }
    }

    public final ConstraintWidget getFirstVisibleWidget() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.mWidgets;
            if (i >= arrayList.size()) {
                return null;
            }
            ConstraintWidget constraintWidget = ((WidgetRun) arrayList.get(i)).mWidget;
            if (constraintWidget.mVisibility != 8) {
                return constraintWidget;
            }
            i++;
        }
    }

    public final ConstraintWidget getLastVisibleWidget() {
        ArrayList arrayList = this.mWidgets;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ConstraintWidget constraintWidget = ((WidgetRun) arrayList.get(size)).mWidget;
            if (constraintWidget.mVisibility != 8) {
                return constraintWidget;
            }
        }
        return null;
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public final long getWrapDimension() {
        ArrayList arrayList = this.mWidgets;
        int size = arrayList.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            j = r4.end.mMargin + ((WidgetRun) arrayList.get(i)).getWrapDimension() + j + r4.start.mMargin;
        }
        return j;
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public final boolean supportsWrapComputation() {
        ArrayList arrayList = this.mWidgets;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (!((WidgetRun) arrayList.get(i)).supportsWrapComputation()) {
                return false;
            }
        }
        return true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChainRun ");
        sb.append(this.orientation == 0 ? "horizontal : " : "vertical : ");
        Iterator it = this.mWidgets.iterator();
        while (it.hasNext()) {
            WidgetRun widgetRun = (WidgetRun) it.next();
            sb.append("<");
            sb.append(widgetRun);
            sb.append("> ");
        }
        return sb.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:288:0x0392, code lost:
    
        r0 = r0 - r10;
     */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00e2  */
    @Override // androidx.constraintlayout.core.widgets.analyzer.Dependency
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void update(Dependency dependency) {
        int i;
        int i2;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour;
        boolean z;
        float f;
        int i3;
        int i4;
        int i5;
        int i6;
        float f2;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        boolean z2;
        int i14;
        int i15;
        DependencyNode dependencyNode = this.start;
        if (dependencyNode.resolved) {
            DependencyNode dependencyNode2 = this.end;
            if (dependencyNode2.resolved) {
                ConstraintWidget constraintWidget = this.mWidget.mParent;
                boolean z3 = constraintWidget instanceof ConstraintWidgetContainer ? ((ConstraintWidgetContainer) constraintWidget).mIsRtl : false;
                int i16 = dependencyNode2.value - dependencyNode.value;
                ArrayList arrayList = this.mWidgets;
                int size = arrayList.size();
                int i17 = 0;
                while (true) {
                    i = -1;
                    i2 = 8;
                    if (i17 >= size) {
                        i17 = -1;
                        break;
                    } else if (((WidgetRun) arrayList.get(i17)).mWidget.mVisibility != 8) {
                        break;
                    } else {
                        i17++;
                    }
                }
                int i18 = size - 1;
                int i19 = i18;
                while (true) {
                    if (i19 < 0) {
                        break;
                    }
                    if (((WidgetRun) arrayList.get(i19)).mWidget.mVisibility != 8) {
                        i = i19;
                        break;
                    }
                    i19--;
                }
                int i20 = 0;
                while (true) {
                    dimensionBehaviour = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                    if (i20 >= 2) {
                        z = z3;
                        f = 0.0f;
                        i3 = 0;
                        i4 = 0;
                        i5 = 0;
                        break;
                    }
                    f = 0.0f;
                    int i21 = 0;
                    i5 = 0;
                    i12 = 0;
                    i13 = 0;
                    while (i21 < size) {
                        WidgetRun widgetRun = (WidgetRun) arrayList.get(i21);
                        boolean z4 = z3;
                        ConstraintWidget constraintWidget2 = widgetRun.mWidget;
                        int i22 = i20;
                        if (constraintWidget2.mVisibility != i2) {
                            i13++;
                            if (i21 > 0 && i21 >= i17) {
                                i5 += widgetRun.start.mMargin;
                            }
                            DimensionDependency dimensionDependency = widgetRun.mDimension;
                            int i23 = dimensionDependency.value;
                            boolean z5 = widgetRun.mDimensionBehavior != dimensionBehaviour;
                            if (z5) {
                                int i24 = this.orientation;
                                z2 = z5;
                                if (i24 == 0 && !constraintWidget2.mHorizontalRun.mDimension.resolved) {
                                    return;
                                }
                                if (i24 == 1 && !constraintWidget2.mVerticalRun.mDimension.resolved) {
                                    return;
                                } else {
                                    i14 = i5;
                                }
                            } else {
                                z2 = z5;
                                i14 = i5;
                                if (widgetRun.matchConstraintsType == 1 && i22 == 0) {
                                    i15 = dimensionDependency.wrapValue;
                                    i12++;
                                } else if (dimensionDependency.resolved) {
                                    i15 = i23;
                                }
                                z2 = true;
                                if (z2) {
                                    i12++;
                                    float f3 = constraintWidget2.mWeight[this.orientation];
                                    if (f3 >= RecyclerView.DECELERATION_RATE) {
                                        f += f3;
                                    }
                                    i5 = i14;
                                } else {
                                    i5 = i14 + i15;
                                }
                                if (i21 < i18 && i21 < i) {
                                    i5 += -widgetRun.end.mMargin;
                                }
                            }
                            i15 = i23;
                            if (z2) {
                            }
                            if (i21 < i18) {
                                i5 += -widgetRun.end.mMargin;
                            }
                        }
                        i21++;
                        z3 = z4;
                        i20 = i22;
                        i2 = 8;
                    }
                    z = z3;
                    int i25 = i20;
                    if (i5 < i16 || i12 == 0) {
                        break;
                    }
                    i20 = i25 + 1;
                    z3 = z;
                    i2 = 8;
                }
                i3 = i12;
                i4 = i13;
                int i26 = dependencyNode.value;
                if (z) {
                    i26 = dependencyNode2.value;
                }
                float f4 = 0.5f;
                if (i5 > i16) {
                    i26 = z ? i26 + ((int) (((i5 - i16) / 2.0f) + 0.5f)) : i26 - ((int) (((i5 - i16) / 2.0f) + 0.5f));
                }
                if (i3 > 0) {
                    float f5 = i16 - i5;
                    int i27 = (int) ((f5 / i3) + 0.5f);
                    int i28 = 0;
                    int i29 = 0;
                    while (i28 < size) {
                        float f6 = f4;
                        WidgetRun widgetRun2 = (WidgetRun) arrayList.get(i28);
                        int i30 = i26;
                        ConstraintWidget constraintWidget3 = widgetRun2.mWidget;
                        int i31 = i3;
                        DimensionDependency dimensionDependency2 = widgetRun2.mDimension;
                        float f7 = f5;
                        int i32 = i27;
                        if (constraintWidget3.mVisibility == 8 || widgetRun2.mDimensionBehavior != dimensionBehaviour || dimensionDependency2.resolved) {
                            i11 = i28;
                        } else {
                            int i33 = f > RecyclerView.DECELERATION_RATE ? (int) (((constraintWidget3.mWeight[this.orientation] * f7) / f) + f6) : i32;
                            if (this.orientation == 0) {
                                i9 = constraintWidget3.mMatchConstraintMaxWidth;
                                i10 = constraintWidget3.mMatchConstraintMinWidth;
                            } else {
                                i9 = constraintWidget3.mMatchConstraintMaxHeight;
                                i10 = constraintWidget3.mMatchConstraintMinHeight;
                            }
                            i11 = i28;
                            int max = Math.max(i10, widgetRun2.matchConstraintsType == 1 ? Math.min(i33, dimensionDependency2.wrapValue) : i33);
                            if (i9 > 0) {
                                max = Math.min(i9, max);
                            }
                            if (max != i33) {
                                i29++;
                                i33 = max;
                            }
                            dimensionDependency2.resolve(i33);
                        }
                        i28 = i11 + 1;
                        i26 = i30;
                        f4 = f6;
                        i3 = i31;
                        f5 = f7;
                        i27 = i32;
                    }
                    i6 = i26;
                    f2 = f4;
                    int i34 = i3;
                    if (i29 > 0) {
                        i3 = i34 - i29;
                        i5 = 0;
                        for (int i35 = 0; i35 < size; i35++) {
                            WidgetRun widgetRun3 = (WidgetRun) arrayList.get(i35);
                            if (widgetRun3.mWidget.mVisibility != 8) {
                                if (i35 > 0 && i35 >= i17) {
                                    i5 += widgetRun3.start.mMargin;
                                }
                                i5 += widgetRun3.mDimension.value;
                                if (i35 < i18 && i35 < i) {
                                    i5 += -widgetRun3.end.mMargin;
                                }
                            }
                        }
                    } else {
                        i3 = i34;
                    }
                    i8 = 2;
                    if (this.mChainStyle == 2 && i29 == 0) {
                        i7 = 0;
                        this.mChainStyle = 0;
                    } else {
                        i7 = 0;
                    }
                } else {
                    i6 = i26;
                    f2 = 0.5f;
                    i7 = 0;
                    i8 = 2;
                }
                if (i5 > i16) {
                    this.mChainStyle = i8;
                }
                if (i4 > 0 && i3 == 0 && i17 == i) {
                    this.mChainStyle = i8;
                }
                int i36 = this.mChainStyle;
                if (i36 == 1) {
                    int i37 = i4 > 1 ? (i16 - i5) / (i4 - 1) : i4 == 1 ? (i16 - i5) / 2 : i7;
                    if (i3 > 0) {
                        i37 = i7;
                    }
                    int i38 = i6;
                    for (int i39 = i7; i39 < size; i39++) {
                        WidgetRun widgetRun4 = (WidgetRun) arrayList.get(z ? size - (i39 + 1) : i39);
                        ConstraintWidget constraintWidget4 = widgetRun4.mWidget;
                        DependencyNode dependencyNode3 = widgetRun4.end;
                        DependencyNode dependencyNode4 = widgetRun4.start;
                        if (constraintWidget4.mVisibility == 8) {
                            dependencyNode4.resolve(i38);
                            dependencyNode3.resolve(i38);
                        } else {
                            if (i39 > 0) {
                                i38 = z ? i38 - i37 : i38 + i37;
                            }
                            if (i39 > 0 && i39 >= i17) {
                                i38 = z ? i38 - dependencyNode4.mMargin : i38 + dependencyNode4.mMargin;
                            }
                            if (z) {
                                dependencyNode3.resolve(i38);
                            } else {
                                dependencyNode4.resolve(i38);
                            }
                            DimensionDependency dimensionDependency3 = widgetRun4.mDimension;
                            int i40 = dimensionDependency3.value;
                            if (widgetRun4.mDimensionBehavior == dimensionBehaviour && widgetRun4.matchConstraintsType == 1) {
                                i40 = dimensionDependency3.wrapValue;
                            }
                            i38 = z ? i38 - i40 : i38 + i40;
                            if (z) {
                                dependencyNode4.resolve(i38);
                            } else {
                                dependencyNode3.resolve(i38);
                            }
                            widgetRun4.mResolved = true;
                            if (i39 < i18 && i39 < i) {
                                i38 = z ? i38 - (-dependencyNode3.mMargin) : i38 + (-dependencyNode3.mMargin);
                            }
                        }
                    }
                    return;
                }
                if (i36 == 0) {
                    int i41 = (i16 - i5) / (i4 + 1);
                    if (i3 > 0) {
                        i41 = i7;
                    }
                    int i42 = i6;
                    for (int i43 = i7; i43 < size; i43++) {
                        WidgetRun widgetRun5 = (WidgetRun) arrayList.get(z ? size - (i43 + 1) : i43);
                        ConstraintWidget constraintWidget5 = widgetRun5.mWidget;
                        DependencyNode dependencyNode5 = widgetRun5.end;
                        DependencyNode dependencyNode6 = widgetRun5.start;
                        if (constraintWidget5.mVisibility == 8) {
                            dependencyNode6.resolve(i42);
                            dependencyNode5.resolve(i42);
                        } else {
                            int i44 = z ? i42 - i41 : i42 + i41;
                            if (i43 > 0 && i43 >= i17) {
                                i44 = z ? i44 - dependencyNode6.mMargin : i44 + dependencyNode6.mMargin;
                            }
                            if (z) {
                                dependencyNode5.resolve(i44);
                            } else {
                                dependencyNode6.resolve(i44);
                            }
                            DimensionDependency dimensionDependency4 = widgetRun5.mDimension;
                            int i45 = dimensionDependency4.value;
                            if (widgetRun5.mDimensionBehavior == dimensionBehaviour && widgetRun5.matchConstraintsType == 1) {
                                i45 = Math.min(i45, dimensionDependency4.wrapValue);
                            }
                            i42 = z ? i44 - i45 : i44 + i45;
                            if (z) {
                                dependencyNode6.resolve(i42);
                            } else {
                                dependencyNode5.resolve(i42);
                            }
                            if (i43 < i18 && i43 < i) {
                                i42 = z ? i42 - (-dependencyNode5.mMargin) : i42 + (-dependencyNode5.mMargin);
                            }
                        }
                    }
                    return;
                }
                if (i36 == 2) {
                    int i46 = this.orientation;
                    ConstraintWidget constraintWidget6 = this.mWidget;
                    float f8 = i46 == 0 ? constraintWidget6.mHorizontalBiasPercent : constraintWidget6.mVerticalBiasPercent;
                    if (z) {
                        f8 = 1.0f - f8;
                    }
                    int i47 = (int) (((i16 - i5) * f8) + f2);
                    if (i47 < 0 || i3 > 0) {
                        i47 = i7;
                    }
                    int i48 = z ? i6 - i47 : i6 + i47;
                    for (int i49 = i7; i49 < size; i49++) {
                        WidgetRun widgetRun6 = (WidgetRun) arrayList.get(z ? size - (i49 + 1) : i49);
                        ConstraintWidget constraintWidget7 = widgetRun6.mWidget;
                        DependencyNode dependencyNode7 = widgetRun6.end;
                        DependencyNode dependencyNode8 = widgetRun6.start;
                        if (constraintWidget7.mVisibility == 8) {
                            dependencyNode8.resolve(i48);
                            dependencyNode7.resolve(i48);
                        } else {
                            if (i49 > 0 && i49 >= i17) {
                                i48 = z ? i48 - dependencyNode8.mMargin : i48 + dependencyNode8.mMargin;
                            }
                            if (z) {
                                dependencyNode7.resolve(i48);
                            } else {
                                dependencyNode8.resolve(i48);
                            }
                            DimensionDependency dimensionDependency5 = widgetRun6.mDimension;
                            int i50 = dimensionDependency5.value;
                            if (widgetRun6.mDimensionBehavior == dimensionBehaviour && widgetRun6.matchConstraintsType == 1) {
                                i50 = dimensionDependency5.wrapValue;
                            }
                            i48 += i50;
                            if (z) {
                                dependencyNode8.resolve(i48);
                            } else {
                                dependencyNode7.resolve(i48);
                            }
                            if (i49 < i18 && i49 < i) {
                                i48 = z ? i48 - (-dependencyNode7.mMargin) : i48 + (-dependencyNode7.mMargin);
                            }
                        }
                    }
                }
            }
        }
    }
}
