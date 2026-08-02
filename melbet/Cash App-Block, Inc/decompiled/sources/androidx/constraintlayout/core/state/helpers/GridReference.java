package androidx.constraintlayout.core.state.helpers;

import androidx.constraintlayout.compose.State;
import androidx.constraintlayout.core.state.HelperReference;
import androidx.constraintlayout.core.utils.GridCore;
import androidx.constraintlayout.core.widgets.HelperWidget;
import androidx.recyclerview.widget.RecyclerView;
import java.util.HashSet;

/* loaded from: classes3.dex */
public final class GridReference extends HelperReference {
    public String mColumnWeights;
    public int mColumnsSet;
    public int mFlags;
    public GridCore mGrid;
    public float mHorizontalGaps;
    public int mOrientation;
    public int mPaddingBottom;
    public int mPaddingEnd;
    public int mPaddingStart;
    public int mPaddingTop;
    public String mRowWeights;
    public int mRowsSet;
    public String mSkips;
    public String mSpans;
    public float mVerticalGaps;

    public GridReference(State state, int i) {
        super(state, i);
        this.mPaddingStart = 0;
        this.mPaddingEnd = 0;
        this.mPaddingTop = 0;
        this.mPaddingBottom = 0;
        if (i == 10) {
            this.mRowsSet = 1;
        } else if (i == 11) {
            this.mColumnsSet = 1;
        }
    }

    @Override // androidx.constraintlayout.core.state.HelperReference, androidx.constraintlayout.core.state.ConstraintReference, androidx.constraintlayout.core.state.Reference
    public final void apply() {
        getHelperWidget();
        GridCore gridCore = this.mGrid;
        int i = this.mOrientation;
        gridCore.getClass();
        if ((i == 0 || i == 1) && gridCore.mOrientation != i) {
            gridCore.mOrientation = i;
        }
        int i2 = this.mRowsSet;
        if (i2 != 0) {
            GridCore gridCore2 = this.mGrid;
            if (i2 > 50) {
                gridCore2.getClass();
            } else if (gridCore2.mRowsSet != i2) {
                gridCore2.mRowsSet = i2;
                gridCore2.updateActualRowsAndColumns();
                gridCore2.initVariables();
            }
        }
        int i3 = this.mColumnsSet;
        if (i3 != 0) {
            GridCore gridCore3 = this.mGrid;
            if (i3 > 50) {
                gridCore3.getClass();
            } else if (gridCore3.mColumnsSet != i3) {
                gridCore3.mColumnsSet = i3;
                gridCore3.updateActualRowsAndColumns();
                gridCore3.initVariables();
            }
        }
        float f = this.mHorizontalGaps;
        if (f != RecyclerView.DECELERATION_RATE) {
            GridCore gridCore4 = this.mGrid;
            if (f < RecyclerView.DECELERATION_RATE) {
                gridCore4.getClass();
            } else if (gridCore4.mHorizontalGaps != f) {
                gridCore4.mHorizontalGaps = f;
            }
        }
        float f2 = this.mVerticalGaps;
        if (f2 != RecyclerView.DECELERATION_RATE) {
            GridCore gridCore5 = this.mGrid;
            if (f2 < RecyclerView.DECELERATION_RATE) {
                gridCore5.getClass();
            } else if (gridCore5.mVerticalGaps != f2) {
                gridCore5.mVerticalGaps = f2;
            }
        }
        String str = this.mRowWeights;
        if (str != null && !str.isEmpty()) {
            GridCore gridCore6 = this.mGrid;
            String str2 = this.mRowWeights;
            String str3 = gridCore6.mRowWeights;
            if (str3 == null || !str3.equals(str2)) {
                gridCore6.mRowWeights = str2;
            }
        }
        String str4 = this.mColumnWeights;
        if (str4 != null && !str4.isEmpty()) {
            GridCore gridCore7 = this.mGrid;
            String str5 = this.mColumnWeights;
            String str6 = gridCore7.mColumnWeights;
            if (str6 == null || !str6.equals(str5)) {
                gridCore7.mColumnWeights = str5;
            }
        }
        String str7 = this.mSpans;
        if (str7 != null && !str7.isEmpty()) {
            GridCore gridCore8 = this.mGrid;
            String str8 = this.mSpans;
            String str9 = gridCore8.mSpans;
            if (str9 == null || !str9.equals(str8.toString())) {
                gridCore8.mExtraSpaceHandled = false;
                gridCore8.mSpans = str8.toString();
            }
        }
        String str10 = this.mSkips;
        if (str10 != null && !str10.isEmpty()) {
            GridCore gridCore9 = this.mGrid;
            String str11 = this.mSkips;
            String str12 = gridCore9.mSkips;
            if (str12 == null || !str12.equals(str11)) {
                gridCore9.mExtraSpaceHandled = false;
                gridCore9.mSkips = str11;
            }
        }
        GridCore gridCore10 = this.mGrid;
        gridCore10.mFlags = this.mFlags;
        int i4 = this.mPaddingStart;
        gridCore10.mPaddingStart = i4;
        gridCore10.mResolvedPaddingLeft = i4;
        gridCore10.mResolvedPaddingRight = i4;
        gridCore10.mPaddingEnd = this.mPaddingEnd;
        gridCore10.mPaddingTop = this.mPaddingTop;
        gridCore10.mPaddingBottom = this.mPaddingBottom;
        applyBase();
    }

    @Override // androidx.constraintlayout.core.state.HelperReference
    public final HelperWidget getHelperWidget() {
        int[][] parseSpans;
        int[][] parseSpans2;
        boolean[][] zArr;
        if (this.mGrid == null) {
            GridCore gridCore = new GridCore();
            gridCore.mExtraSpaceHandled = false;
            gridCore.mNextAvailableIndex = 0;
            gridCore.mSpanIds = new HashSet();
            gridCore.mSpanIndex = 0;
            gridCore.updateActualRowsAndColumns();
            int[][] iArr = gridCore.mConstraintMatrix;
            boolean z = iArr != null && iArr.length == gridCore.mWidgetsCount && (zArr = gridCore.mPositionMatrix) != null && zArr.length == gridCore.mRows && zArr[0].length == gridCore.mColumns;
            if (!z) {
                gridCore.initVariables();
            }
            if (z) {
                for (int i = 0; i < gridCore.mPositionMatrix.length; i++) {
                    int i2 = 0;
                    while (true) {
                        boolean[][] zArr2 = gridCore.mPositionMatrix;
                        if (i2 < zArr2[0].length) {
                            zArr2[i][i2] = true;
                            i2++;
                        }
                    }
                }
                for (int i3 = 0; i3 < gridCore.mConstraintMatrix.length; i3++) {
                    int i4 = 0;
                    while (true) {
                        int[][] iArr2 = gridCore.mConstraintMatrix;
                        if (i4 < iArr2[0].length) {
                            iArr2[i3][i4] = -1;
                            i4++;
                        }
                    }
                }
            }
            gridCore.mNextAvailableIndex = 0;
            String str = gridCore.mSkips;
            if (str != null && !str.trim().isEmpty() && (parseSpans2 = gridCore.parseSpans(gridCore.mSkips, false)) != null) {
                gridCore.handleSkips(parseSpans2);
            }
            String str2 = gridCore.mSpans;
            if (str2 != null && !str2.trim().isEmpty() && (parseSpans = gridCore.parseSpans(gridCore.mSpans, true)) != null) {
                gridCore.handleSpans(parseSpans);
            }
            this.mGrid = gridCore;
        }
        return this.mGrid;
    }
}
