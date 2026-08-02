package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.ArrayLinkedVariables;
import androidx.constraintlayout.core.ArrayRow;
import androidx.constraintlayout.core.LinearSystem;
import androidx.constraintlayout.core.SolverVariable;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public abstract class Chain {
    public static final boolean[] sFlags = new boolean[3];

    /* JADX WARN: Code restructure failed: missing block: B:162:0x0290, code lost:
    
        if (r8.mOwner == r6) goto L191;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0115, code lost:
    
        if (r4.mOwner == r12) goto L76;
     */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0442 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:255:0x069b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:261:0x06a7  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x06b2  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x06bb  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x06c2  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x06d2  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x06d6 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:280:0x06f2 A[ADDED_TO_REGION, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:281:0x06be  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x06b5  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x04a5 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:358:0x0592 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:367:0x05a7  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:410:0x064a A[EDGE_INSN: B:410:0x064a->B:411:0x064a BREAK  A[LOOP:6: B:365:0x05a3->B:398:0x0645], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:413:0x0663  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x011f A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void applyChainConstraints(ConstraintWidgetContainer constraintWidgetContainer, LinearSystem linearSystem, ArrayList arrayList, int i) {
        int i2;
        ChainHead[] chainHeadArr;
        int i3;
        int i4;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        ConstraintWidget constraintWidget;
        float f;
        int i5;
        ArrayList arrayList2;
        ConstraintWidget constraintWidget2;
        ConstraintWidget constraintWidget3;
        ConstraintWidget constraintWidget4;
        LinearSystem linearSystem2;
        ConstraintAnchor constraintAnchor;
        ConstraintAnchor constraintAnchor2;
        ConstraintAnchor constraintAnchor3;
        ConstraintWidget constraintWidget5;
        SolverVariable solverVariable;
        ConstraintAnchor constraintAnchor4;
        SolverVariable solverVariable2;
        ConstraintWidget constraintWidget6;
        int i6;
        ConstraintAnchor[] constraintAnchorArr;
        ConstraintAnchor constraintAnchor5;
        SolverVariable solverVariable3;
        ConstraintWidget constraintWidget7;
        ConstraintAnchor[] constraintAnchorArr2;
        ConstraintWidget constraintWidget8;
        int i7;
        ConstraintAnchor constraintAnchor6;
        ConstraintAnchor[] constraintAnchorArr3;
        int i8;
        ConstraintAnchor constraintAnchor7;
        SolverVariable solverVariable4;
        SolverVariable solverVariable5;
        int size;
        int i9;
        ArrayList arrayList3;
        int i10;
        int i11;
        ConstraintWidget constraintWidget9;
        float f2;
        float f3;
        float f4;
        int i12;
        ConstraintWidget constraintWidget10;
        int i13;
        int i14;
        int i15;
        ConstraintWidget constraintWidget11;
        ConstraintAnchor constraintAnchor8;
        ConstraintWidget constraintWidget12;
        float f5;
        ConstraintWidgetContainer constraintWidgetContainer2 = constraintWidgetContainer;
        LinearSystem linearSystem3 = linearSystem;
        ArrayList arrayList4 = arrayList;
        if (i == 0) {
            i2 = constraintWidgetContainer2.mHorizontalChainsSize;
            chainHeadArr = constraintWidgetContainer2.mHorizontalChainsArray;
            i3 = 0;
        } else {
            i2 = constraintWidgetContainer2.mVerticalChainsSize;
            chainHeadArr = constraintWidgetContainer2.mVerticalChainsArray;
            i3 = 2;
        }
        int i16 = i2;
        ChainHead[] chainHeadArr2 = chainHeadArr;
        int i17 = 0;
        while (i17 < i16) {
            ChainHead chainHead = chainHeadArr2[i17];
            boolean z5 = chainHead.mDefined;
            ConstraintWidget constraintWidget13 = chainHead.mFirst;
            ConstraintAnchor[] constraintAnchorArr4 = constraintWidget13.mListAnchors;
            ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
            int i18 = 8;
            float f6 = RecyclerView.DECELERATION_RATE;
            if (z5) {
                i4 = i17;
            } else {
                int i19 = chainHead.mOrientation;
                int i20 = i19 * 2;
                ConstraintWidget constraintWidget14 = constraintWidget13;
                ConstraintWidget constraintWidget15 = constraintWidget14;
                boolean z6 = false;
                while (!z6) {
                    chainHead.mWidgetsCount++;
                    ConstraintWidget[] constraintWidgetArr = constraintWidget14.mNextChainWidget;
                    ConstraintAnchor[] constraintAnchorArr5 = constraintWidget14.mListAnchors;
                    constraintWidgetArr[i19] = null;
                    constraintWidget14.mListNextMatchConstraintsWidget[i19] = null;
                    if (constraintWidget14.mVisibility != i18) {
                        constraintWidget14.getDimensionBehaviour(i19);
                        constraintAnchorArr5[i20].getMargin();
                        int i21 = i20 + 1;
                        constraintAnchorArr5[i21].getMargin();
                        constraintAnchorArr5[i20].getMargin();
                        constraintAnchorArr5[i21].getMargin();
                        if (chainHead.mFirstVisibleWidget == null) {
                            chainHead.mFirstVisibleWidget = constraintWidget14;
                        }
                        chainHead.mLastVisibleWidget = constraintWidget14;
                        ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = constraintWidget14.mListDimensionBehaviors[i19];
                        if (dimensionBehaviour2 == dimensionBehaviour) {
                            int i22 = constraintWidget14.mResolvedMatchConstraintDefault[i19];
                            i14 = i17;
                            if (i22 == 0 || i22 == 3 || i22 == 2) {
                                chainHead.mWidgetsMatchCount++;
                                float f7 = constraintWidget14.mWeight[i19];
                                if (f7 > RecyclerView.DECELERATION_RATE) {
                                    f5 = f7;
                                    chainHead.mTotalWeight += f5;
                                } else {
                                    f5 = f7;
                                }
                                i15 = i19;
                                if (constraintWidget14.mVisibility != 8 && dimensionBehaviour2 == dimensionBehaviour && (i22 == 0 || i22 == 3)) {
                                    if (f5 < RecyclerView.DECELERATION_RATE) {
                                        chainHead.mHasUndefinedWeights = true;
                                    } else {
                                        chainHead.mHasDefinedWeights = true;
                                    }
                                    if (chainHead.mWeightedMatchConstraintsWidgets == null) {
                                        chainHead.mWeightedMatchConstraintsWidgets = new ArrayList();
                                    }
                                    chainHead.mWeightedMatchConstraintsWidgets.add(constraintWidget14);
                                }
                                if (chainHead.mFirstMatchConstraintWidget == null) {
                                    chainHead.mFirstMatchConstraintWidget = constraintWidget14;
                                }
                                ConstraintWidget constraintWidget16 = chainHead.mLastMatchConstraintWidget;
                                if (constraintWidget16 != null) {
                                    constraintWidget16.mListNextMatchConstraintsWidget[i15] = constraintWidget14;
                                }
                                chainHead.mLastMatchConstraintWidget = constraintWidget14;
                            } else {
                                i15 = i19;
                            }
                            if (i15 == 0) {
                                if (constraintWidget14.mMatchConstraintDefaultWidth == 0 && constraintWidget14.mMatchConstraintMinWidth == 0) {
                                    int i23 = constraintWidget14.mMatchConstraintMaxWidth;
                                }
                            } else if (constraintWidget14.mMatchConstraintDefaultHeight == 0 && constraintWidget14.mMatchConstraintMinHeight == 0) {
                                int i24 = constraintWidget14.mMatchConstraintMaxHeight;
                            }
                            constraintWidget11 = constraintWidget15;
                            if (constraintWidget11 != constraintWidget14) {
                                constraintWidget11.mNextChainWidget[i15] = constraintWidget14;
                            }
                            constraintAnchor8 = constraintAnchorArr5[i20 + 1].mTarget;
                            if (constraintAnchor8 != null) {
                                constraintWidget12 = constraintAnchor8.mOwner;
                                ConstraintAnchor constraintAnchor9 = constraintWidget12.mListAnchors[i20].mTarget;
                                if (constraintAnchor9 != null) {
                                }
                            }
                            constraintWidget12 = null;
                            if (constraintWidget12 != null) {
                                constraintWidget12 = constraintWidget14;
                                z6 = true;
                            }
                            constraintWidget15 = constraintWidget14;
                            i19 = i15;
                            i18 = 8;
                            constraintWidget14 = constraintWidget12;
                            i17 = i14;
                        }
                    }
                    i14 = i17;
                    i15 = i19;
                    constraintWidget11 = constraintWidget15;
                    if (constraintWidget11 != constraintWidget14) {
                    }
                    constraintAnchor8 = constraintAnchorArr5[i20 + 1].mTarget;
                    if (constraintAnchor8 != null) {
                    }
                    constraintWidget12 = null;
                    if (constraintWidget12 != null) {
                    }
                    constraintWidget15 = constraintWidget14;
                    i19 = i15;
                    i18 = 8;
                    constraintWidget14 = constraintWidget12;
                    i17 = i14;
                }
                i4 = i17;
                int i25 = i19;
                ConstraintWidget constraintWidget17 = chainHead.mFirstVisibleWidget;
                if (constraintWidget17 != null) {
                    constraintWidget17.mListAnchors[i20].getMargin();
                }
                ConstraintWidget constraintWidget18 = chainHead.mLastVisibleWidget;
                if (constraintWidget18 != null) {
                    constraintWidget18.mListAnchors[i20 + 1].getMargin();
                }
                chainHead.mLast = constraintWidget14;
                if (i25 == 0 && chainHead.mIsRtl) {
                    chainHead.mHead = constraintWidget14;
                } else {
                    chainHead.mHead = constraintWidget13;
                }
                chainHead.mHasComplexMatchWeights = chainHead.mHasDefinedWeights && chainHead.mHasUndefinedWeights;
            }
            chainHead.mDefined = true;
            if (arrayList4 == null || arrayList4.contains(constraintWidget13)) {
                ConstraintWidget constraintWidget19 = chainHead.mLast;
                ConstraintWidget constraintWidget20 = chainHead.mFirstVisibleWidget;
                ConstraintWidget constraintWidget21 = chainHead.mLastVisibleWidget;
                ConstraintWidget constraintWidget22 = chainHead.mHead;
                float f8 = chainHead.mTotalWeight;
                ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr = constraintWidgetContainer2.mListDimensionBehaviors;
                ConstraintAnchor[] constraintAnchorArr6 = constraintAnchorArr4;
                ConstraintAnchor[] constraintAnchorArr7 = constraintWidgetContainer2.mListAnchors;
                boolean z7 = dimensionBehaviourArr[i] == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                if (i == 0) {
                    int i26 = constraintWidget22.mHorizontalChainStyle;
                    boolean z8 = i26 == 0;
                    z = z7;
                    z3 = i26 == 1;
                    z4 = i26 == 2;
                    constraintWidget = constraintWidget13;
                    f = f8;
                    z2 = z8;
                } else {
                    z = z7;
                    int i27 = constraintWidget22.mVerticalChainStyle;
                    z2 = i27 == 0;
                    z3 = i27 == 1;
                    z4 = i27 == 2;
                    constraintWidget = constraintWidget13;
                    f = f8;
                }
                boolean z9 = z3;
                boolean z10 = false;
                while (!z10) {
                    ConstraintAnchor[] constraintAnchorArr8 = constraintWidget.mListAnchors;
                    ConstraintAnchor constraintAnchor10 = constraintAnchorArr8[i3];
                    int i28 = z4 ? 1 : 4;
                    int margin = constraintAnchor10.getMargin();
                    boolean z11 = z4;
                    boolean z12 = constraintWidget.mListDimensionBehaviors[i] == dimensionBehaviour && constraintWidget.mResolvedMatchConstraintDefault[i] == 0;
                    ConstraintAnchor constraintAnchor11 = constraintAnchor10.mTarget;
                    if (constraintAnchor11 != null && constraintWidget != constraintWidget13) {
                        margin = constraintAnchor11.getMargin() + margin;
                    }
                    int i29 = margin;
                    if (z11 && constraintWidget != constraintWidget13 && constraintWidget != constraintWidget20) {
                        i28 = 8;
                    }
                    ConstraintWidget constraintWidget23 = constraintWidget13;
                    ConstraintAnchor constraintAnchor12 = constraintAnchor10.mTarget;
                    if (constraintAnchor12 != null) {
                        SolverVariable solverVariable6 = constraintAnchor10.mSolverVariable;
                        SolverVariable solverVariable7 = constraintAnchor12.mSolverVariable;
                        if (constraintWidget == constraintWidget20) {
                            i12 = i16;
                            linearSystem3.addGreaterThan(solverVariable6, solverVariable7, i29, 6);
                        } else {
                            i12 = i16;
                            linearSystem3.addGreaterThan(solverVariable6, solverVariable7, i29, 8);
                        }
                        if (z12 && !z11) {
                            i28 = 5;
                        }
                        linearSystem3.addEquality(constraintAnchor10.mSolverVariable, constraintAnchor10.mTarget.mSolverVariable, i29, (constraintWidget == constraintWidget20 && z11 && constraintWidget.mIsInBarrier[i]) ? 5 : i28);
                    } else {
                        i12 = i16;
                    }
                    if (z) {
                        if (constraintWidget.mVisibility == 8 || constraintWidget.mListDimensionBehaviors[i] != dimensionBehaviour) {
                            i13 = 0;
                        } else {
                            i13 = 0;
                            linearSystem3.addGreaterThan(constraintAnchorArr8[i3 + 1].mSolverVariable, constraintAnchorArr8[i3].mSolverVariable, 0, 5);
                        }
                        linearSystem3.addGreaterThan(constraintAnchorArr8[i3].mSolverVariable, constraintAnchorArr7[i3].mSolverVariable, i13, 8);
                    }
                    ConstraintAnchor constraintAnchor13 = constraintAnchorArr8[i3 + 1].mTarget;
                    if (constraintAnchor13 != null) {
                        constraintWidget10 = constraintAnchor13.mOwner;
                        ConstraintAnchor constraintAnchor14 = constraintWidget10.mListAnchors[i3].mTarget;
                        if (constraintAnchor14 != null) {
                        }
                    }
                    constraintWidget10 = null;
                    if (constraintWidget10 != null) {
                        constraintWidget = constraintWidget10;
                    } else {
                        z10 = true;
                    }
                    constraintWidget13 = constraintWidget23;
                    z4 = z11;
                    i16 = i12;
                }
                boolean z13 = z4;
                i5 = i16;
                if (constraintWidget21 != null) {
                    int i30 = i3 + 1;
                    if (constraintWidget19.mListAnchors[i30].mTarget != null) {
                        ConstraintAnchor constraintAnchor15 = constraintWidget21.mListAnchors[i30];
                        if (constraintWidget21.mListDimensionBehaviors[i] == dimensionBehaviour && constraintWidget21.mResolvedMatchConstraintDefault[i] == 0 && !z13) {
                            ConstraintAnchor constraintAnchor16 = constraintAnchor15.mTarget;
                            if (constraintAnchor16.mOwner == constraintWidgetContainer2) {
                                linearSystem3.addEquality(constraintAnchor15.mSolverVariable, constraintAnchor16.mSolverVariable, -constraintAnchor15.getMargin(), 5);
                                linearSystem3.addLowerThan(constraintAnchor15.mSolverVariable, constraintWidget19.mListAnchors[i30].mTarget.mSolverVariable, -constraintAnchor15.getMargin(), 6);
                                if (z) {
                                    int i31 = i3 + 1;
                                    SolverVariable solverVariable8 = constraintAnchorArr7[i31].mSolverVariable;
                                    ConstraintAnchor constraintAnchor17 = constraintWidget19.mListAnchors[i31];
                                    linearSystem3.addGreaterThan(solverVariable8, constraintAnchor17.mSolverVariable, constraintAnchor17.getMargin(), 8);
                                }
                                arrayList2 = chainHead.mWeightedMatchConstraintsWidgets;
                                if (arrayList2 != null && (size = arrayList2.size()) > 1) {
                                    float f9 = (chainHead.mHasUndefinedWeights || chainHead.mHasComplexMatchWeights) ? f : chainHead.mWidgetsMatchCount;
                                    ConstraintWidget constraintWidget24 = null;
                                    float f10 = 0.0f;
                                    i9 = 0;
                                    while (i9 < size) {
                                        ConstraintWidget constraintWidget25 = (ConstraintWidget) arrayList2.get(i9);
                                        float[] fArr = constraintWidget25.mWeight;
                                        ConstraintAnchor[] constraintAnchorArr9 = constraintWidget25.mListAnchors;
                                        float f11 = fArr[i];
                                        if (f11 < f6) {
                                            if (chainHead.mHasComplexMatchWeights) {
                                                arrayList3 = arrayList2;
                                                linearSystem3.addEquality(constraintAnchorArr9[i3 + 1].mSolverVariable, constraintAnchorArr9[i3].mSolverVariable, 0, 4);
                                                i10 = i9;
                                                i11 = size;
                                                f3 = f6;
                                                f4 = f9;
                                                i9 = i10 + 1;
                                                f9 = f4;
                                                arrayList2 = arrayList3;
                                                size = i11;
                                                f6 = f3;
                                            } else {
                                                f11 = 1.0f;
                                            }
                                        }
                                        arrayList3 = arrayList2;
                                        if (f11 == f6) {
                                            i10 = i9;
                                            linearSystem3.addEquality(constraintAnchorArr9[i3 + 1].mSolverVariable, constraintAnchorArr9[i3].mSolverVariable, 0, 8);
                                            i11 = size;
                                            f3 = f6;
                                            f4 = f9;
                                            i9 = i10 + 1;
                                            f9 = f4;
                                            arrayList2 = arrayList3;
                                            size = i11;
                                            f6 = f3;
                                        } else {
                                            i10 = i9;
                                            if (constraintWidget24 != null) {
                                                ConstraintAnchor[] constraintAnchorArr10 = constraintWidget24.mListAnchors;
                                                SolverVariable solverVariable9 = constraintAnchorArr10[i3].mSolverVariable;
                                                int i32 = i3 + 1;
                                                SolverVariable solverVariable10 = constraintAnchorArr10[i32].mSolverVariable;
                                                SolverVariable solverVariable11 = constraintAnchorArr9[i3].mSolverVariable;
                                                SolverVariable solverVariable12 = constraintAnchorArr9[i32].mSolverVariable;
                                                i11 = size;
                                                ArrayRow createRow = linearSystem3.createRow();
                                                constraintWidget9 = constraintWidget25;
                                                float f12 = f6;
                                                createRow.mConstantValue = f12;
                                                f3 = f12;
                                                if (f9 == f12 || f10 == f11) {
                                                    f4 = f9;
                                                    f2 = f11;
                                                    createRow.variables.put(solverVariable9, 1.0f);
                                                    createRow.variables.put(solverVariable10, -1.0f);
                                                    createRow.variables.put(solverVariable12, 1.0f);
                                                    createRow.variables.put(solverVariable11, -1.0f);
                                                } else {
                                                    ArrayLinkedVariables arrayLinkedVariables = createRow.variables;
                                                    if (f10 == f3) {
                                                        f4 = f9;
                                                        arrayLinkedVariables.put(solverVariable9, 1.0f);
                                                        createRow.variables.put(solverVariable10, -1.0f);
                                                        f2 = f11;
                                                    } else {
                                                        f4 = f9;
                                                        f2 = f11;
                                                        if (f11 == f6) {
                                                            arrayLinkedVariables.put(solverVariable11, 1.0f);
                                                            createRow.variables.put(solverVariable12, -1.0f);
                                                        } else {
                                                            float f13 = (f10 / f4) / (f2 / f4);
                                                            arrayLinkedVariables.put(solverVariable9, 1.0f);
                                                            createRow.variables.put(solverVariable10, -1.0f);
                                                            createRow.variables.put(solverVariable12, f13);
                                                            createRow.variables.put(solverVariable11, -f13);
                                                        }
                                                    }
                                                }
                                                linearSystem3.addConstraint(createRow);
                                            } else {
                                                i11 = size;
                                                constraintWidget9 = constraintWidget25;
                                                f2 = f11;
                                                f3 = f6;
                                                f4 = f9;
                                            }
                                            constraintWidget24 = constraintWidget9;
                                            f10 = f2;
                                            i9 = i10 + 1;
                                            f9 = f4;
                                            arrayList2 = arrayList3;
                                            size = i11;
                                            f6 = f3;
                                        }
                                    }
                                }
                                if (constraintWidget20 != null || (constraintWidget20 != constraintWidget21 && !z13)) {
                                    constraintWidget2 = constraintWidget21;
                                    if (!z2 && constraintWidget20 != null) {
                                        int i33 = chainHead.mWidgetsMatchCount;
                                        boolean z14 = i33 > 0 && chainHead.mWidgetsCount == i33;
                                        ConstraintWidget constraintWidget26 = constraintWidget20;
                                        ConstraintWidget constraintWidget27 = constraintWidget26;
                                        while (true) {
                                            ConstraintAnchor[] constraintAnchorArr11 = constraintWidget27.mListAnchors;
                                            if (constraintWidget26 == null) {
                                                break;
                                            }
                                            ConstraintAnchor[] constraintAnchorArr12 = constraintWidget26.mListAnchors;
                                            ConstraintWidget constraintWidget28 = constraintWidget26.mNextChainWidget[i];
                                            while (true) {
                                                if (constraintWidget28 == null) {
                                                    i6 = 8;
                                                    break;
                                                }
                                                i6 = 8;
                                                if (constraintWidget28.mVisibility != 8) {
                                                    break;
                                                } else {
                                                    constraintWidget28 = constraintWidget28.mNextChainWidget[i];
                                                }
                                            }
                                            if (constraintWidget28 != null || constraintWidget26 == constraintWidget2) {
                                                ConstraintAnchor constraintAnchor18 = constraintAnchorArr12[i3];
                                                SolverVariable solverVariable13 = constraintAnchor18.mSolverVariable;
                                                ConstraintAnchor constraintAnchor19 = constraintAnchor18.mTarget;
                                                SolverVariable solverVariable14 = constraintAnchor19 != null ? constraintAnchor19.mSolverVariable : null;
                                                if (constraintWidget27 != constraintWidget26) {
                                                    solverVariable14 = constraintAnchorArr11[i3 + 1].mSolverVariable;
                                                } else if (constraintWidget26 == constraintWidget20) {
                                                    ConstraintAnchor constraintAnchor20 = constraintAnchorArr6[i3].mTarget;
                                                    solverVariable14 = constraintAnchor20 != null ? constraintAnchor20.mSolverVariable : null;
                                                }
                                                int margin2 = constraintAnchor18.getMargin();
                                                int i34 = i3 + 1;
                                                int margin3 = constraintAnchorArr12[i34].getMargin();
                                                if (constraintWidget28 != null) {
                                                    constraintAnchor5 = constraintWidget28.mListAnchors[i3];
                                                    constraintAnchorArr = constraintAnchorArr11;
                                                    solverVariable3 = constraintAnchor5.mSolverVariable;
                                                } else {
                                                    constraintAnchorArr = constraintAnchorArr11;
                                                    constraintAnchor5 = constraintWidget19.mListAnchors[i34].mTarget;
                                                    solverVariable3 = constraintAnchor5 != null ? constraintAnchor5.mSolverVariable : null;
                                                }
                                                SolverVariable solverVariable15 = constraintAnchorArr12[i34].mSolverVariable;
                                                if (constraintAnchor5 != null) {
                                                    margin3 += constraintAnchor5.getMargin();
                                                }
                                                int margin4 = constraintAnchorArr[i34].getMargin() + margin2;
                                                if (solverVariable13 == null || solverVariable14 == null || solverVariable3 == null || solverVariable15 == null) {
                                                    constraintWidget7 = constraintWidget28;
                                                    constraintAnchorArr2 = constraintAnchorArr6;
                                                    constraintWidget8 = constraintWidget27;
                                                    i7 = 8;
                                                } else {
                                                    if (constraintWidget26 == constraintWidget20) {
                                                        margin4 = constraintWidget20.mListAnchors[i3].getMargin();
                                                    }
                                                    int i35 = margin4;
                                                    if (constraintWidget26 == constraintWidget2) {
                                                        margin3 = constraintWidget2.mListAnchors[i34].getMargin();
                                                    }
                                                    constraintWidget7 = constraintWidget28;
                                                    constraintAnchorArr2 = constraintAnchorArr6;
                                                    constraintWidget8 = constraintWidget27;
                                                    i7 = 8;
                                                    linearSystem.addCentering(solverVariable13, solverVariable14, i35, 0.5f, solverVariable3, solverVariable15, margin3, z14 ? 8 : 5);
                                                }
                                            } else {
                                                constraintWidget7 = constraintWidget28;
                                                constraintAnchorArr2 = constraintAnchorArr6;
                                                constraintWidget8 = constraintWidget27;
                                                i7 = i6;
                                            }
                                            if (constraintWidget26.mVisibility != i7) {
                                                constraintWidget8 = constraintWidget26;
                                            }
                                            constraintWidget26 = constraintWidget7;
                                            constraintWidget27 = constraintWidget8;
                                            constraintAnchorArr6 = constraintAnchorArr2;
                                        }
                                    } else {
                                        int i36 = 8;
                                        if (z9 && constraintWidget20 != null) {
                                            int i37 = chainHead.mWidgetsMatchCount;
                                            boolean z15 = i37 <= 0 && chainHead.mWidgetsCount == i37;
                                            constraintWidget3 = constraintWidget20;
                                            constraintWidget4 = constraintWidget3;
                                            while (true) {
                                                ConstraintAnchor[] constraintAnchorArr13 = constraintWidget3.mListAnchors;
                                                if (constraintWidget4 != null) {
                                                    break;
                                                }
                                                ConstraintAnchor[] constraintAnchorArr14 = constraintWidget4.mListAnchors;
                                                ConstraintWidget constraintWidget29 = constraintWidget4.mNextChainWidget[i];
                                                while (constraintWidget29 != null && constraintWidget29.mVisibility == i36) {
                                                    constraintWidget29 = constraintWidget29.mNextChainWidget[i];
                                                }
                                                if (constraintWidget4 == constraintWidget20 || constraintWidget4 == constraintWidget2 || constraintWidget29 == null) {
                                                    constraintWidget5 = constraintWidget3;
                                                } else {
                                                    if (constraintWidget29 == constraintWidget2) {
                                                        constraintWidget29 = null;
                                                    }
                                                    ConstraintAnchor constraintAnchor21 = constraintAnchorArr14[i3];
                                                    SolverVariable solverVariable16 = constraintAnchor21.mSolverVariable;
                                                    int i38 = i3 + 1;
                                                    SolverVariable solverVariable17 = constraintAnchorArr13[i38].mSolverVariable;
                                                    int margin5 = constraintAnchor21.getMargin();
                                                    int margin6 = constraintAnchorArr14[i38].getMargin();
                                                    if (constraintWidget29 != null) {
                                                        constraintAnchor4 = constraintWidget29.mListAnchors[i3];
                                                        solverVariable = constraintAnchor4.mSolverVariable;
                                                        constraintWidget5 = constraintWidget3;
                                                        ConstraintAnchor constraintAnchor22 = constraintAnchor4.mTarget;
                                                        solverVariable2 = constraintAnchor22 != null ? constraintAnchor22.mSolverVariable : null;
                                                    } else {
                                                        constraintWidget5 = constraintWidget3;
                                                        ConstraintAnchor constraintAnchor23 = constraintWidget2.mListAnchors[i3];
                                                        solverVariable = constraintAnchor23 != null ? constraintAnchor23.mSolverVariable : null;
                                                        SolverVariable solverVariable18 = constraintAnchorArr14[i38].mSolverVariable;
                                                        constraintAnchor4 = constraintAnchor23;
                                                        solverVariable2 = solverVariable18;
                                                    }
                                                    if (constraintAnchor4 != null) {
                                                        margin6 += constraintAnchor4.getMargin();
                                                    }
                                                    int margin7 = constraintAnchorArr13[i38].getMargin() + margin5;
                                                    ConstraintWidget constraintWidget30 = constraintWidget29;
                                                    int i39 = margin6;
                                                    int i40 = z15 ? 8 : 4;
                                                    if (solverVariable16 == null || solverVariable17 == null || solverVariable == null || solverVariable2 == null) {
                                                        constraintWidget6 = constraintWidget30;
                                                    } else {
                                                        SolverVariable solverVariable19 = solverVariable;
                                                        constraintWidget6 = constraintWidget30;
                                                        linearSystem.addCentering(solverVariable16, solverVariable17, margin7, 0.5f, solverVariable19, solverVariable2, i39, i40);
                                                    }
                                                    constraintWidget29 = constraintWidget6;
                                                }
                                                i36 = 8;
                                                if (constraintWidget4.mVisibility != 8) {
                                                    constraintWidget5 = constraintWidget4;
                                                }
                                                constraintWidget4 = constraintWidget29;
                                                constraintWidget3 = constraintWidget5;
                                            }
                                            linearSystem2 = linearSystem;
                                            ConstraintAnchor constraintAnchor24 = constraintWidget20.mListAnchors[i3];
                                            constraintAnchor = constraintAnchorArr6[i3].mTarget;
                                            int i41 = i3 + 1;
                                            constraintAnchor2 = constraintWidget2.mListAnchors[i41];
                                            constraintAnchor3 = constraintWidget19.mListAnchors[i41].mTarget;
                                            if (constraintAnchor != null) {
                                                if (constraintWidget20 != constraintWidget2) {
                                                    linearSystem2.addEquality(constraintAnchor24.mSolverVariable, constraintAnchor.mSolverVariable, constraintAnchor24.getMargin(), 5);
                                                } else if (constraintAnchor3 != null) {
                                                    linearSystem2.addCentering(constraintAnchor24.mSolverVariable, constraintAnchor.mSolverVariable, constraintAnchor24.getMargin(), 0.5f, constraintAnchor2.mSolverVariable, constraintAnchor3.mSolverVariable, constraintAnchor2.getMargin(), 5);
                                                }
                                            }
                                            if (constraintAnchor3 != null && constraintWidget20 != constraintWidget2) {
                                                linearSystem2.addEquality(constraintAnchor2.mSolverVariable, constraintAnchor3.mSolverVariable, -constraintAnchor2.getMargin(), 5);
                                            }
                                            if ((!z2 || z9) && constraintWidget20 != null && constraintWidget20 != constraintWidget2) {
                                                ConstraintAnchor[] constraintAnchorArr15 = constraintWidget20.mListAnchors;
                                                constraintAnchor6 = constraintAnchorArr15[i3];
                                                if (constraintWidget2 == null) {
                                                    constraintWidget2 = constraintWidget20;
                                                }
                                                constraintAnchorArr3 = constraintWidget2.mListAnchors;
                                                i8 = i3 + 1;
                                                constraintAnchor7 = constraintAnchorArr3[i8];
                                                ConstraintAnchor constraintAnchor25 = constraintAnchor6.mTarget;
                                                solverVariable4 = constraintAnchor25 != null ? constraintAnchor25.mSolverVariable : null;
                                                ConstraintAnchor constraintAnchor26 = constraintAnchor7.mTarget;
                                                solverVariable5 = constraintAnchor26 != null ? constraintAnchor26.mSolverVariable : null;
                                                if (constraintWidget19 != constraintWidget2) {
                                                    ConstraintAnchor constraintAnchor27 = constraintWidget19.mListAnchors[i8].mTarget;
                                                    solverVariable5 = constraintAnchor27 != null ? constraintAnchor27.mSolverVariable : null;
                                                }
                                                if (constraintWidget20 == constraintWidget2) {
                                                    constraintAnchor7 = constraintAnchorArr15[i8];
                                                }
                                                if (solverVariable4 == null && solverVariable5 != null) {
                                                    linearSystem2.addCentering(constraintAnchor6.mSolverVariable, solverVariable4, constraintAnchor6.getMargin(), 0.5f, solverVariable5, constraintAnchor7.mSolverVariable, constraintAnchorArr3[i8].getMargin(), 5);
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    ConstraintAnchor constraintAnchor28 = constraintAnchorArr6[i3];
                                    int i42 = i3 + 1;
                                    ConstraintAnchor constraintAnchor29 = constraintWidget19.mListAnchors[i42];
                                    ConstraintAnchor constraintAnchor30 = constraintAnchor28.mTarget;
                                    SolverVariable solverVariable20 = constraintAnchor30 != null ? constraintAnchor30.mSolverVariable : null;
                                    ConstraintAnchor constraintAnchor31 = constraintAnchor29.mTarget;
                                    SolverVariable solverVariable21 = constraintAnchor31 != null ? constraintAnchor31.mSolverVariable : null;
                                    ConstraintAnchor constraintAnchor32 = constraintWidget20.mListAnchors[i3];
                                    if (constraintWidget21 != null) {
                                        constraintAnchor29 = constraintWidget21.mListAnchors[i42];
                                    }
                                    if (solverVariable20 == null || solverVariable21 == null) {
                                        constraintWidget2 = constraintWidget21;
                                    } else {
                                        float f14 = i == 0 ? constraintWidget22.mHorizontalBiasPercent : constraintWidget22.mVerticalBiasPercent;
                                        int margin8 = constraintAnchor32.getMargin();
                                        int margin9 = constraintAnchor29.getMargin();
                                        SolverVariable solverVariable22 = constraintAnchor32.mSolverVariable;
                                        SolverVariable solverVariable23 = constraintAnchor29.mSolverVariable;
                                        SolverVariable solverVariable24 = solverVariable20;
                                        constraintWidget2 = constraintWidget21;
                                        linearSystem3.addCentering(solverVariable22, solverVariable24, margin8, f14, solverVariable21, solverVariable23, margin9, 7);
                                    }
                                }
                                linearSystem2 = linearSystem;
                                if (!z2) {
                                }
                                ConstraintAnchor[] constraintAnchorArr152 = constraintWidget20.mListAnchors;
                                constraintAnchor6 = constraintAnchorArr152[i3];
                                if (constraintWidget2 == null) {
                                }
                                constraintAnchorArr3 = constraintWidget2.mListAnchors;
                                i8 = i3 + 1;
                                constraintAnchor7 = constraintAnchorArr3[i8];
                                ConstraintAnchor constraintAnchor252 = constraintAnchor6.mTarget;
                                if (constraintAnchor252 != null) {
                                }
                                ConstraintAnchor constraintAnchor262 = constraintAnchor7.mTarget;
                                if (constraintAnchor262 != null) {
                                }
                                if (constraintWidget19 != constraintWidget2) {
                                }
                                if (constraintWidget20 == constraintWidget2) {
                                }
                                if (solverVariable4 == null) {
                                    linearSystem2.addCentering(constraintAnchor6.mSolverVariable, solverVariable4, constraintAnchor6.getMargin(), 0.5f, solverVariable5, constraintAnchor7.mSolverVariable, constraintAnchorArr3[i8].getMargin(), 5);
                                }
                            }
                        }
                        if (z13) {
                            ConstraintAnchor constraintAnchor33 = constraintAnchor15.mTarget;
                            if (constraintAnchor33.mOwner == constraintWidgetContainer2) {
                                linearSystem3.addEquality(constraintAnchor15.mSolverVariable, constraintAnchor33.mSolverVariable, -constraintAnchor15.getMargin(), 4);
                            }
                        }
                        linearSystem3.addLowerThan(constraintAnchor15.mSolverVariable, constraintWidget19.mListAnchors[i30].mTarget.mSolverVariable, -constraintAnchor15.getMargin(), 6);
                        if (z) {
                        }
                        arrayList2 = chainHead.mWeightedMatchConstraintsWidgets;
                        if (arrayList2 != null) {
                            if (chainHead.mHasUndefinedWeights) {
                            }
                            ConstraintWidget constraintWidget242 = null;
                            float f102 = 0.0f;
                            i9 = 0;
                            while (i9 < size) {
                            }
                        }
                        if (constraintWidget20 != null) {
                        }
                        constraintWidget2 = constraintWidget21;
                        if (!z2) {
                        }
                        int i362 = 8;
                        if (z9) {
                            int i372 = chainHead.mWidgetsMatchCount;
                            if (i372 <= 0) {
                            }
                            constraintWidget3 = constraintWidget20;
                            constraintWidget4 = constraintWidget3;
                            while (true) {
                                ConstraintAnchor[] constraintAnchorArr132 = constraintWidget3.mListAnchors;
                                if (constraintWidget4 != null) {
                                }
                                constraintWidget4 = constraintWidget29;
                                constraintWidget3 = constraintWidget5;
                            }
                            linearSystem2 = linearSystem;
                            ConstraintAnchor constraintAnchor242 = constraintWidget20.mListAnchors[i3];
                            constraintAnchor = constraintAnchorArr6[i3].mTarget;
                            int i412 = i3 + 1;
                            constraintAnchor2 = constraintWidget2.mListAnchors[i412];
                            constraintAnchor3 = constraintWidget19.mListAnchors[i412].mTarget;
                            if (constraintAnchor != null) {
                            }
                            if (constraintAnchor3 != null) {
                                linearSystem2.addEquality(constraintAnchor2.mSolverVariable, constraintAnchor3.mSolverVariable, -constraintAnchor2.getMargin(), 5);
                            }
                            if (!z2) {
                            }
                            ConstraintAnchor[] constraintAnchorArr1522 = constraintWidget20.mListAnchors;
                            constraintAnchor6 = constraintAnchorArr1522[i3];
                            if (constraintWidget2 == null) {
                            }
                            constraintAnchorArr3 = constraintWidget2.mListAnchors;
                            i8 = i3 + 1;
                            constraintAnchor7 = constraintAnchorArr3[i8];
                            ConstraintAnchor constraintAnchor2522 = constraintAnchor6.mTarget;
                            if (constraintAnchor2522 != null) {
                            }
                            ConstraintAnchor constraintAnchor2622 = constraintAnchor7.mTarget;
                            if (constraintAnchor2622 != null) {
                            }
                            if (constraintWidget19 != constraintWidget2) {
                            }
                            if (constraintWidget20 == constraintWidget2) {
                            }
                            if (solverVariable4 == null) {
                            }
                        }
                        linearSystem2 = linearSystem;
                        if (!z2) {
                        }
                        ConstraintAnchor[] constraintAnchorArr15222 = constraintWidget20.mListAnchors;
                        constraintAnchor6 = constraintAnchorArr15222[i3];
                        if (constraintWidget2 == null) {
                        }
                        constraintAnchorArr3 = constraintWidget2.mListAnchors;
                        i8 = i3 + 1;
                        constraintAnchor7 = constraintAnchorArr3[i8];
                        ConstraintAnchor constraintAnchor25222 = constraintAnchor6.mTarget;
                        if (constraintAnchor25222 != null) {
                        }
                        ConstraintAnchor constraintAnchor26222 = constraintAnchor7.mTarget;
                        if (constraintAnchor26222 != null) {
                        }
                        if (constraintWidget19 != constraintWidget2) {
                        }
                        if (constraintWidget20 == constraintWidget2) {
                        }
                        if (solverVariable4 == null) {
                        }
                    }
                }
                if (z) {
                }
                arrayList2 = chainHead.mWeightedMatchConstraintsWidgets;
                if (arrayList2 != null) {
                }
                if (constraintWidget20 != null) {
                }
                constraintWidget2 = constraintWidget21;
                if (!z2) {
                }
                int i3622 = 8;
                if (z9) {
                }
                linearSystem2 = linearSystem;
                if (!z2) {
                }
                ConstraintAnchor[] constraintAnchorArr152222 = constraintWidget20.mListAnchors;
                constraintAnchor6 = constraintAnchorArr152222[i3];
                if (constraintWidget2 == null) {
                }
                constraintAnchorArr3 = constraintWidget2.mListAnchors;
                i8 = i3 + 1;
                constraintAnchor7 = constraintAnchorArr3[i8];
                ConstraintAnchor constraintAnchor252222 = constraintAnchor6.mTarget;
                if (constraintAnchor252222 != null) {
                }
                ConstraintAnchor constraintAnchor262222 = constraintAnchor7.mTarget;
                if (constraintAnchor262222 != null) {
                }
                if (constraintWidget19 != constraintWidget2) {
                }
                if (constraintWidget20 == constraintWidget2) {
                }
                if (solverVariable4 == null) {
                }
            } else {
                i5 = i16;
            }
            i17 = i4 + 1;
            constraintWidgetContainer2 = constraintWidgetContainer;
            linearSystem3 = linearSystem;
            arrayList4 = arrayList;
            i16 = i5;
        }
    }

    public static void checkMatchParent(ConstraintWidgetContainer constraintWidgetContainer, LinearSystem linearSystem, ConstraintWidget constraintWidget) {
        constraintWidget.mHorizontalResolution = -1;
        ConstraintAnchor constraintAnchor = constraintWidget.mBaseline;
        ConstraintAnchor constraintAnchor2 = constraintWidget.mBottom;
        ConstraintAnchor constraintAnchor3 = constraintWidget.mTop;
        ConstraintAnchor constraintAnchor4 = constraintWidget.mRight;
        ConstraintAnchor constraintAnchor5 = constraintWidget.mLeft;
        constraintWidget.mVerticalResolution = -1;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = constraintWidgetContainer.mListDimensionBehaviors[0];
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.MATCH_PARENT;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
        if (dimensionBehaviour != dimensionBehaviour3 && constraintWidget.mListDimensionBehaviors[0] == dimensionBehaviour2) {
            int i = constraintAnchor5.mMargin;
            int width = constraintWidgetContainer.getWidth() - constraintAnchor4.mMargin;
            constraintAnchor5.mSolverVariable = linearSystem.createObjectVariable(constraintAnchor5);
            constraintAnchor4.mSolverVariable = linearSystem.createObjectVariable(constraintAnchor4);
            linearSystem.addEquality(constraintAnchor5.mSolverVariable, i);
            linearSystem.addEquality(constraintAnchor4.mSolverVariable, width);
            constraintWidget.mHorizontalResolution = 2;
            constraintWidget.mX = i;
            int i2 = width - i;
            constraintWidget.mWidth = i2;
            int i3 = constraintWidget.mMinWidth;
            if (i2 < i3) {
                constraintWidget.mWidth = i3;
            }
        }
        if (constraintWidgetContainer.mListDimensionBehaviors[1] == dimensionBehaviour3 || constraintWidget.mListDimensionBehaviors[1] != dimensionBehaviour2) {
            return;
        }
        int i4 = constraintAnchor3.mMargin;
        int height = constraintWidgetContainer.getHeight() - constraintAnchor2.mMargin;
        constraintAnchor3.mSolverVariable = linearSystem.createObjectVariable(constraintAnchor3);
        constraintAnchor2.mSolverVariable = linearSystem.createObjectVariable(constraintAnchor2);
        linearSystem.addEquality(constraintAnchor3.mSolverVariable, i4);
        linearSystem.addEquality(constraintAnchor2.mSolverVariable, height);
        if (constraintWidget.mBaselineDistance > 0 || constraintWidget.mVisibility == 8) {
            SolverVariable createObjectVariable = linearSystem.createObjectVariable(constraintAnchor);
            constraintAnchor.mSolverVariable = createObjectVariable;
            linearSystem.addEquality(createObjectVariable, constraintWidget.mBaselineDistance + i4);
        }
        constraintWidget.mVerticalResolution = 2;
        constraintWidget.mY = i4;
        int i5 = height - i4;
        constraintWidget.mHeight = i5;
        int i6 = constraintWidget.mMinHeight;
        if (i5 < i6) {
            constraintWidget.mHeight = i6;
        }
    }

    public static final boolean enabled(int i, int i2) {
        return (i & i2) == i2;
    }
}
