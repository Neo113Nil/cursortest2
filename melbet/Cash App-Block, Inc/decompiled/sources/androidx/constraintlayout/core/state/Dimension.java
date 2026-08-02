package androidx.constraintlayout.core.state;

import androidx.constraintlayout.core.widgets.ConstraintWidget;

/* loaded from: classes3.dex */
public final class Dimension {
    public String mInitialValue;
    public static final String FIXED_DIMENSION = new String("FIXED_DIMENSION");
    public static final String WRAP_DIMENSION = new String("WRAP_DIMENSION");
    public static final String SPREAD_DIMENSION = new String("SPREAD_DIMENSION");
    public static final String PARENT_DIMENSION = new String("PARENT_DIMENSION");
    public static final String PERCENT_DIMENSION = new String("PERCENT_DIMENSION");
    public static final String RATIO_DIMENSION = new String("RATIO_DIMENSION");
    public int mMin = 0;
    public int mMax = Integer.MAX_VALUE;
    public float mPercent = 1.0f;
    public int mValue = 0;
    public String mRatioString = null;
    public boolean mIsSuggested = false;

    public Dimension(String str) {
        this.mInitialValue = str;
    }

    public static Dimension createFixed(int i) {
        Dimension dimension = new Dimension(FIXED_DIMENSION);
        dimension.mInitialValue = null;
        dimension.mValue = i;
        return dimension;
    }

    public static Dimension createSuggested(String str) {
        Dimension dimension = new Dimension();
        dimension.mMin = 0;
        dimension.mMax = Integer.MAX_VALUE;
        dimension.mPercent = 1.0f;
        dimension.mValue = 0;
        dimension.mRatioString = null;
        dimension.mInitialValue = str;
        dimension.mIsSuggested = true;
        return dimension;
    }

    public final void apply(ConstraintWidget constraintWidget, int i) {
        String str = this.mRatioString;
        if (str != null) {
            constraintWidget.setDimensionRatio(str);
        }
        boolean z = this.mIsSuggested;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.FIXED;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.MATCH_PARENT;
        String str2 = PARENT_DIMENSION;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
        int i2 = 2;
        String str3 = PERCENT_DIMENSION;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
        String str4 = WRAP_DIMENSION;
        if (i == 0) {
            if (z) {
                constraintWidget.setHorizontalDimensionBehaviour(dimensionBehaviour4);
                String str5 = this.mInitialValue;
                if (str5 == str4) {
                    i2 = 1;
                } else if (str5 != str3) {
                    i2 = 0;
                }
                constraintWidget.setHorizontalMatchStyle(this.mPercent, i2, this.mMin, this.mMax);
                return;
            }
            int i3 = this.mMin;
            if (i3 > 0) {
                if (i3 < 0) {
                    constraintWidget.mMinWidth = 0;
                } else {
                    constraintWidget.mMinWidth = i3;
                }
            }
            int i4 = this.mMax;
            if (i4 < Integer.MAX_VALUE) {
                constraintWidget.mMaxDimension[0] = i4;
            }
            String str6 = this.mInitialValue;
            if (str6 == str4) {
                constraintWidget.setHorizontalDimensionBehaviour(dimensionBehaviour3);
                return;
            }
            if (str6 == str2) {
                constraintWidget.setHorizontalDimensionBehaviour(dimensionBehaviour2);
                return;
            } else {
                if (str6 == null) {
                    constraintWidget.setHorizontalDimensionBehaviour(dimensionBehaviour);
                    constraintWidget.setWidth(this.mValue);
                    return;
                }
                return;
            }
        }
        if (z) {
            constraintWidget.setVerticalDimensionBehaviour(dimensionBehaviour4);
            String str7 = this.mInitialValue;
            if (str7 == str4) {
                i2 = 1;
            } else if (str7 != str3) {
                i2 = 0;
            }
            constraintWidget.setVerticalMatchStyle(this.mPercent, i2, this.mMin, this.mMax);
            return;
        }
        int i5 = this.mMin;
        if (i5 > 0) {
            if (i5 < 0) {
                constraintWidget.mMinHeight = 0;
            } else {
                constraintWidget.mMinHeight = i5;
            }
        }
        int i6 = this.mMax;
        if (i6 < Integer.MAX_VALUE) {
            constraintWidget.mMaxDimension[1] = i6;
        }
        String str8 = this.mInitialValue;
        if (str8 == str4) {
            constraintWidget.setVerticalDimensionBehaviour(dimensionBehaviour3);
            return;
        }
        if (str8 == str2) {
            constraintWidget.setVerticalDimensionBehaviour(dimensionBehaviour2);
        } else if (str8 == null) {
            constraintWidget.setVerticalDimensionBehaviour(dimensionBehaviour);
            constraintWidget.setHeight(this.mValue);
        }
    }
}
