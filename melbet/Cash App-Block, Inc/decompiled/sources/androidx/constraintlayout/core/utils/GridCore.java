package androidx.constraintlayout.core.utils;

import androidx.constraintlayout.core.LinearSystem;
import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.ConstraintWidgetContainer;
import androidx.constraintlayout.core.widgets.VirtualLayout;
import androidx.fragment.app.Fragment$5$$ExternalSyntheticOutline0;
import bo.app.ng$$ExternalSyntheticLambda0;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;

/* loaded from: classes3.dex */
public final class GridCore extends VirtualLayout {
    public ConstraintWidget[] mBoxWidgets;
    public String mColumnWeights;
    public int mColumns;
    public int mColumnsSet;
    public int[][] mConstraintMatrix;
    public ConstraintWidgetContainer mContainer;
    public boolean mExtraSpaceHandled;
    public int mFlags;
    public float mHorizontalGaps;
    public int mNextAvailableIndex;
    public int mOrientation;
    public boolean[][] mPositionMatrix;
    public String mRowWeights;
    public int mRows;
    public int mRowsSet;
    public String mSkips;
    public HashSet mSpanIds;
    public int mSpanIndex;
    public int[][] mSpanMatrix;
    public String mSpans;
    public float mVerticalGaps;

    public static void clearVerticalAttributes(ConstraintWidget constraintWidget) {
        constraintWidget.mWeight[1] = -1.0f;
        constraintWidget.mTop.reset();
        constraintWidget.mBottom.reset();
        constraintWidget.mBaseline.reset();
    }

    public static float[] parseWeights(int i, String str) {
        if (str == null || str.trim().isEmpty()) {
            return null;
        }
        String[] split = str.split(",");
        float[] fArr = new float[i];
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 < split.length) {
                try {
                    fArr[i2] = Float.parseFloat(split[i2]);
                } catch (Exception e) {
                    System.err.println("Error parsing `" + split[i2] + "`: " + e.getMessage());
                    fArr[i2] = 1.0f;
                }
            } else {
                fArr[i2] = 1.0f;
            }
        }
        return fArr;
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public final void addToSolver(LinearSystem linearSystem, boolean z) {
        int i;
        int i2;
        GridCore gridCore;
        int[][] iArr;
        int i3;
        super.addToSolver(linearSystem, z);
        int max = Math.max(this.mRows, this.mColumns);
        ConstraintWidget constraintWidget = this.mBoxWidgets[0];
        float[] parseWeights = parseWeights(this.mRows, this.mRowWeights);
        int i4 = this.mRows;
        ConstraintAnchor constraintAnchor = this.mBottom;
        ConstraintAnchor constraintAnchor2 = this.mTop;
        if (i4 == 1) {
            clearVerticalAttributes(constraintWidget);
            constraintWidget.mTop.connect(constraintAnchor2, 0);
            constraintWidget.mBottom.connect(constraintAnchor, 0);
        } else {
            int i5 = 0;
            while (true) {
                i = this.mRows;
                if (i5 >= i) {
                    break;
                }
                ConstraintWidget constraintWidget2 = this.mBoxWidgets[i5];
                clearVerticalAttributes(constraintWidget2);
                ConstraintAnchor constraintAnchor3 = constraintWidget2.mTop;
                if (parseWeights != null) {
                    constraintWidget2.mWeight[1] = parseWeights[i5];
                }
                if (i5 > 0) {
                    constraintAnchor3.connect(this.mBoxWidgets[i5 - 1].mBottom, 0);
                } else {
                    constraintAnchor3.connect(constraintAnchor2, 0);
                }
                int i6 = this.mRows - 1;
                ConstraintAnchor constraintAnchor4 = constraintWidget2.mBottom;
                if (i5 < i6) {
                    constraintAnchor4.connect(this.mBoxWidgets[i5 + 1].mTop, 0);
                } else {
                    constraintAnchor4.connect(constraintAnchor, 0);
                }
                if (i5 > 0) {
                    constraintAnchor3.mMargin = (int) this.mVerticalGaps;
                }
                i5++;
            }
            while (i < max) {
                ConstraintWidget constraintWidget3 = this.mBoxWidgets[i];
                clearVerticalAttributes(constraintWidget3);
                constraintWidget3.mTop.connect(constraintAnchor2, 0);
                constraintWidget3.mBottom.connect(constraintAnchor, 0);
                i++;
            }
        }
        int max2 = Math.max(this.mRows, this.mColumns);
        ConstraintWidget constraintWidget4 = this.mBoxWidgets[0];
        float[] parseWeights2 = parseWeights(this.mColumns, this.mColumnWeights);
        int i7 = this.mColumns;
        ConstraintAnchor constraintAnchor5 = this.mRight;
        ConstraintAnchor constraintAnchor6 = this.mLeft;
        if (i7 == 1) {
            float[] fArr = constraintWidget4.mWeight;
            ConstraintAnchor constraintAnchor7 = constraintWidget4.mRight;
            ConstraintAnchor constraintAnchor8 = constraintWidget4.mLeft;
            fArr[0] = -1.0f;
            constraintAnchor8.reset();
            constraintAnchor7.reset();
            constraintAnchor8.connect(constraintAnchor6, 0);
            constraintAnchor7.connect(constraintAnchor5, 0);
        } else {
            int i8 = 0;
            while (true) {
                i2 = this.mColumns;
                if (i8 >= i2) {
                    break;
                }
                ConstraintWidget constraintWidget5 = this.mBoxWidgets[i8];
                float[] fArr2 = constraintWidget5.mWeight;
                ConstraintAnchor constraintAnchor9 = constraintWidget5.mRight;
                ConstraintAnchor constraintAnchor10 = constraintWidget5.mLeft;
                fArr2[0] = -1.0f;
                constraintAnchor10.reset();
                constraintAnchor9.reset();
                if (parseWeights2 != null) {
                    constraintWidget5.mWeight[0] = parseWeights2[i8];
                }
                if (i8 > 0) {
                    constraintAnchor10.connect(this.mBoxWidgets[i8 - 1].mRight, 0);
                } else {
                    constraintAnchor10.connect(constraintAnchor6, 0);
                }
                if (i8 < this.mColumns - 1) {
                    constraintAnchor9.connect(this.mBoxWidgets[i8 + 1].mLeft, 0);
                } else {
                    constraintAnchor9.connect(constraintAnchor5, 0);
                }
                if (i8 > 0) {
                    constraintAnchor10.mMargin = (int) this.mHorizontalGaps;
                }
                i8++;
            }
            while (i2 < max2) {
                ConstraintWidget constraintWidget6 = this.mBoxWidgets[i2];
                float[] fArr3 = constraintWidget6.mWeight;
                ConstraintAnchor constraintAnchor11 = constraintWidget6.mRight;
                ConstraintAnchor constraintAnchor12 = constraintWidget6.mLeft;
                fArr3[0] = -1.0f;
                constraintAnchor12.reset();
                constraintAnchor11.reset();
                constraintAnchor12.connect(constraintAnchor6, 0);
                constraintAnchor11.connect(constraintAnchor5, 0);
                i2++;
            }
        }
        int i9 = 0;
        while (i9 < this.mWidgetsCount) {
            if (!this.mSpanIds.contains(this.mWidgets[i9].stringId)) {
                boolean z2 = false;
                int i10 = 0;
                while (true) {
                    if (z2) {
                        break;
                    }
                    i10 = this.mNextAvailableIndex;
                    if (i10 >= this.mRows * this.mColumns) {
                        i10 = -1;
                        break;
                    }
                    int rowByIndex = this.getRowByIndex(i10);
                    int colByIndex = this.getColByIndex(this.mNextAvailableIndex);
                    boolean[] zArr = this.mPositionMatrix[rowByIndex];
                    if (zArr[colByIndex]) {
                        zArr[colByIndex] = false;
                        z2 = true;
                    }
                    this.mNextAvailableIndex++;
                }
                int rowByIndex2 = this.getRowByIndex(i10);
                int colByIndex2 = this.getColByIndex(i10);
                if (i10 == -1) {
                    return;
                }
                if ((this.mFlags & 2) > 0 && (iArr = this.mSpanMatrix) != null && (i3 = this.mSpanIndex) < iArr.length) {
                    int[] iArr2 = iArr[i3];
                    if (iArr2[0] == i10) {
                        this.mPositionMatrix[rowByIndex2][colByIndex2] = true;
                        if (this.invalidatePositions(rowByIndex2, colByIndex2, iArr2[1], iArr2[2])) {
                            ConstraintWidget constraintWidget7 = this.mWidgets[i9];
                            int[] iArr3 = this.mSpanMatrix[this.mSpanIndex];
                            gridCore = this;
                            gridCore.connectWidget(rowByIndex2, colByIndex2, iArr3[1], iArr3[2], constraintWidget7);
                            gridCore.mSpanIndex++;
                            i9++;
                            this = gridCore;
                        }
                    }
                }
                gridCore = this;
                gridCore.connectWidget(rowByIndex2, colByIndex2, 1, 1, gridCore.mWidgets[i9]);
                i9++;
                this = gridCore;
            }
            gridCore = this;
            i9++;
            this = gridCore;
        }
    }

    public final void connectWidget(int i, int i2, int i3, int i4, ConstraintWidget constraintWidget) {
        constraintWidget.mLeft.connect(this.mBoxWidgets[i2].mLeft, 0);
        constraintWidget.mTop.connect(this.mBoxWidgets[i].mTop, 0);
        constraintWidget.mRight.connect(this.mBoxWidgets[(i2 + i4) - 1].mRight, 0);
        constraintWidget.mBottom.connect(this.mBoxWidgets[(i + i3) - 1].mBottom, 0);
    }

    public final int getColByIndex(int i) {
        return this.mOrientation == 1 ? i / this.mRows : i % this.mColumns;
    }

    public final int getRowByIndex(int i) {
        return this.mOrientation == 1 ? i % this.mRows : i / this.mColumns;
    }

    public final void handleSkips(int[][] iArr) {
        for (int[] iArr2 : iArr) {
            if (!invalidatePositions(getRowByIndex(iArr2[0]), getColByIndex(iArr2[0]), iArr2[1], iArr2[2])) {
                return;
            }
        }
    }

    public final void handleSpans(int[][] iArr) {
        if ((this.mFlags & 2) > 0) {
            return;
        }
        int i = 0;
        while (i < iArr.length) {
            int rowByIndex = this.getRowByIndex(iArr[i][0]);
            int colByIndex = this.getColByIndex(iArr[i][0]);
            int[] iArr2 = iArr[i];
            if (!this.invalidatePositions(rowByIndex, colByIndex, iArr2[1], iArr2[2])) {
                return;
            }
            ConstraintWidget constraintWidget = this.mWidgets[i];
            int[] iArr3 = iArr[i];
            GridCore gridCore = this;
            gridCore.connectWidget(rowByIndex, colByIndex, iArr3[1], iArr3[2], constraintWidget);
            gridCore.mSpanIds.add(gridCore.mWidgets[i].stringId);
            i++;
            this = gridCore;
        }
    }

    public final void initVariables() {
        boolean[][] zArr = (boolean[][]) Array.newInstance((Class<?>) Boolean.TYPE, this.mRows, this.mColumns);
        this.mPositionMatrix = zArr;
        for (boolean[] zArr2 : zArr) {
            Arrays.fill(zArr2, true);
        }
        int i = this.mWidgetsCount;
        if (i > 0) {
            int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, i, 4);
            this.mConstraintMatrix = iArr;
            for (int[] iArr2 : iArr) {
                Arrays.fill(iArr2, -1);
            }
        }
    }

    public final boolean invalidatePositions(int i, int i2, int i3, int i4) {
        for (int i5 = i; i5 < i + i3; i5++) {
            for (int i6 = i2; i6 < i2 + i4; i6++) {
                boolean[][] zArr = this.mPositionMatrix;
                if (i5 < zArr.length && i6 < zArr[0].length) {
                    boolean[] zArr2 = zArr[i5];
                    if (zArr2[i6]) {
                        zArr2[i6] = false;
                    }
                }
                return false;
            }
        }
        return true;
    }

    @Override // androidx.constraintlayout.core.widgets.VirtualLayout
    public final void measure(int i, int i2, int i3, int i4) {
        int[][] parseSpans;
        this.mContainer = (ConstraintWidgetContainer) this.mParent;
        if (this.mRows >= 1 && this.mColumns >= 1) {
            this.mNextAvailableIndex = 0;
            String str = this.mSkips;
            if (str != null && !str.trim().isEmpty() && (parseSpans = parseSpans(this.mSkips, false)) != null) {
                handleSkips(parseSpans);
            }
            String str2 = this.mSpans;
            if (str2 != null && !str2.trim().isEmpty()) {
                this.mSpanMatrix = parseSpans(this.mSpans, true);
            }
            int max = Math.max(this.mRows, this.mColumns);
            ConstraintWidget[] constraintWidgetArr = this.mBoxWidgets;
            ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
            if (constraintWidgetArr == null) {
                this.mBoxWidgets = new ConstraintWidget[max];
                int i5 = 0;
                while (true) {
                    ConstraintWidget[] constraintWidgetArr2 = this.mBoxWidgets;
                    if (i5 >= constraintWidgetArr2.length) {
                        break;
                    }
                    ConstraintWidget constraintWidget = new ConstraintWidget();
                    ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr = constraintWidget.mListDimensionBehaviors;
                    dimensionBehaviourArr[0] = dimensionBehaviour;
                    dimensionBehaviourArr[1] = dimensionBehaviour;
                    constraintWidget.stringId = String.valueOf(constraintWidget.hashCode());
                    constraintWidgetArr2[i5] = constraintWidget;
                    i5++;
                }
            } else if (max != constraintWidgetArr.length) {
                ConstraintWidget[] constraintWidgetArr3 = new ConstraintWidget[max];
                for (int i6 = 0; i6 < max; i6++) {
                    ConstraintWidget[] constraintWidgetArr4 = this.mBoxWidgets;
                    if (i6 < constraintWidgetArr4.length) {
                        constraintWidgetArr3[i6] = constraintWidgetArr4[i6];
                    } else {
                        ConstraintWidget constraintWidget2 = new ConstraintWidget();
                        ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr2 = constraintWidget2.mListDimensionBehaviors;
                        dimensionBehaviourArr2[0] = dimensionBehaviour;
                        dimensionBehaviourArr2[1] = dimensionBehaviour;
                        constraintWidget2.stringId = String.valueOf(constraintWidget2.hashCode());
                        constraintWidgetArr3[i6] = constraintWidget2;
                    }
                }
                while (true) {
                    ConstraintWidget[] constraintWidgetArr5 = this.mBoxWidgets;
                    if (max >= constraintWidgetArr5.length) {
                        break;
                    }
                    ConstraintWidget constraintWidget3 = constraintWidgetArr5[max];
                    this.mContainer.mChildren.remove(constraintWidget3);
                    constraintWidget3.reset();
                    max++;
                }
                this.mBoxWidgets = constraintWidgetArr3;
            }
            int[][] iArr = this.mSpanMatrix;
            if (iArr != null) {
                handleSpans(iArr);
            }
        }
        ConstraintWidgetContainer constraintWidgetContainer = this.mContainer;
        ConstraintWidget[] constraintWidgetArr6 = this.mBoxWidgets;
        constraintWidgetContainer.getClass();
        for (ConstraintWidget constraintWidget4 : constraintWidgetArr6) {
            constraintWidgetContainer.add(constraintWidget4);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x00ee, code lost:
    
        if (r11.mExtraSpaceHandled != false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00f0, code lost:
    
        r13 = r11.mColumns + r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00f3, code lost:
    
        if (r13 <= 50) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00f8, code lost:
    
        if (r11.mColumnsSet != r13) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00fb, code lost:
    
        r11.mColumnsSet = r13;
        updateActualRowsAndColumns();
        initVariables();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int[][] parseSpans(String str, boolean z) {
        int i;
        try {
            String[] split = str.split(",");
            Arrays.sort(split, new ng$$ExternalSyntheticLambda0(4));
            int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, split.length, 3);
            if (this.mRows != 1 && this.mColumns != 1) {
                for (int i2 = 0; i2 < split.length; i2++) {
                    String[] split2 = split[i2].trim().split(":");
                    String[] split3 = split2[1].split("x");
                    iArr[i2][0] = Integer.parseInt(split2[0]);
                    if ((this.mFlags & 1) > 0) {
                        iArr[i2][1] = Integer.parseInt(split3[1]);
                        iArr[i2][2] = Integer.parseInt(split3[0]);
                    } else {
                        iArr[i2][1] = Integer.parseInt(split3[0]);
                        iArr[i2][2] = Integer.parseInt(split3[1]);
                    }
                }
                return iArr;
            }
            int i3 = 0;
            int i4 = 0;
            for (int i5 = 0; i5 < split.length; i5++) {
                String[] split4 = split[i5].trim().split(":");
                iArr[i5][0] = Integer.parseInt(split4[0]);
                int[] iArr2 = iArr[i5];
                iArr2[1] = 1;
                iArr2[2] = 1;
                if (this.mColumns == 1) {
                    iArr2[1] = Integer.parseInt(split4[1]);
                    i3 += iArr[i5][1];
                    if (z) {
                        i3--;
                    }
                }
                if (this.mRows == 1) {
                    iArr[i5][2] = Integer.parseInt(split4[1]);
                    i4 += iArr[i5][2];
                    if (z) {
                        i4--;
                    }
                }
            }
            if (i3 != 0 && !this.mExtraSpaceHandled && (i = this.mRows + i3) <= 50 && this.mRowsSet != i) {
                this.mRowsSet = i;
                updateActualRowsAndColumns();
                initVariables();
            }
            this.mExtraSpaceHandled = true;
            return iArr;
        } catch (Exception unused) {
            return null;
        }
    }

    public final void updateActualRowsAndColumns() {
        int i;
        int i2 = this.mRowsSet;
        if (i2 != 0 && (i = this.mColumnsSet) != 0) {
            this.mRows = i2;
            this.mColumns = i;
            return;
        }
        int i3 = this.mColumnsSet;
        if (i3 > 0) {
            this.mColumns = i3;
            this.mRows = Fragment$5$$ExternalSyntheticOutline0.m(this.mWidgetsCount, i3, 1, i3);
        } else if (i2 > 0) {
            this.mRows = i2;
            this.mColumns = Fragment$5$$ExternalSyntheticOutline0.m(this.mWidgetsCount, i2, 1, i2);
        } else {
            int sqrt = (int) (Math.sqrt(this.mWidgetsCount) + 1.5d);
            this.mRows = sqrt;
            this.mColumns = Fragment$5$$ExternalSyntheticOutline0.m(this.mWidgetsCount, sqrt, 1, sqrt);
        }
    }
}
