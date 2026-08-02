package androidx.constraintlayout.core.state;

import androidx.camera.core.CameraSelector$$ExternalSyntheticOutline0;
import androidx.compose.ui.layout.Measurable;
import androidx.constraintlayout.compose.State;
import androidx.constraintlayout.core.motion.CustomVariable;
import androidx.constraintlayout.core.state.helpers.Facade;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import java.util.HashMap;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes3.dex */
public class ConstraintReference implements Reference {
    public float mCircularAngle;
    public float mCircularDistance;
    public ConstraintWidget mConstraintWidget;
    public final HashMap mCustomColors;
    public HashMap mCustomFloats;
    public Dimension mHorizontalDimension;
    public Object mKey;
    public final State mState;
    public Dimension mVerticalDimension;
    public Measurable mView;
    public Facade mFacade = null;
    public int mHorizontalChainStyle = 0;
    public int mVerticalChainStyle = 0;
    public float mHorizontalChainWeight = -1.0f;
    public float mVerticalChainWeight = -1.0f;
    public float mHorizontalBias = 0.5f;
    public float mVerticalBias = 0.5f;
    public int mMarginLeft = 0;
    public int mMarginRight = 0;
    public int mMarginStart = 0;
    public int mMarginEnd = 0;
    public int mMarginTop = 0;
    public int mMarginBottom = 0;
    public int mMarginLeftGone = 0;
    public int mMarginRightGone = 0;
    public int mMarginStartGone = 0;
    public int mMarginEndGone = 0;
    public int mMarginTopGone = 0;
    public int mMarginBottomGone = 0;
    public int mMarginBaseline = 0;
    public int mMarginBaselineGone = 0;
    public float mPivotX = Float.NaN;
    public float mPivotY = Float.NaN;
    public float mRotationX = Float.NaN;
    public float mRotationY = Float.NaN;
    public float mRotationZ = Float.NaN;
    public float mTranslationX = Float.NaN;
    public float mTranslationY = Float.NaN;
    public float mTranslationZ = Float.NaN;
    public float mAlpha = Float.NaN;
    public float mScaleX = Float.NaN;
    public float mScaleY = Float.NaN;
    public int mVisibility = 0;
    public Object mLeftToLeft = null;
    public Object mLeftToRight = null;
    public Object mRightToLeft = null;
    public Object mRightToRight = null;
    public Object mStartToStart = null;
    public Object mStartToEnd = null;
    public Object mEndToStart = null;
    public Object mEndToEnd = null;
    public Object mTopToTop = null;
    public Object mTopToBottom = null;
    public ConstraintReference mTopToBaseline = null;
    public Object mBottomToTop = null;
    public Object mBottomToBottom = null;
    public ConstraintReference mBottomToBaseline = null;
    public Object mBaselineToBaseline = null;
    public Object mBaselineToTop = null;
    public Object mBaselineToBottom = null;
    public Object mCircularConstraint = null;
    public int mLast = 0;

    /* renamed from: androidx.constraintlayout.core.state.ConstraintReference$1, reason: invalid class name */
    public abstract /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$androidx$constraintlayout$core$state$State$Constraint;

        static {
            int[] iArr = new int[CameraSelector$$ExternalSyntheticOutline0.values(20).length];
            $SwitchMap$androidx$constraintlayout$core$state$State$Constraint = iArr;
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$core$state$State$Constraint[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$core$state$State$Constraint[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$core$state$State$Constraint[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$core$state$State$Constraint[4] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$core$state$State$Constraint[5] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$core$state$State$Constraint[6] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$core$state$State$Constraint[7] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$core$state$State$Constraint[8] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$core$state$State$Constraint[9] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$core$state$State$Constraint[10] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$core$state$State$Constraint[11] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$core$state$State$Constraint[12] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$core$state$State$Constraint[13] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$core$state$State$Constraint[16] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$core$state$State$Constraint[15] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$core$state$State$Constraint[14] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$core$state$State$Constraint[19] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$core$state$State$Constraint[17] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$core$state$State$Constraint[18] = 20;
            } catch (NoSuchFieldError unused20) {
            }
        }
    }

    final class IncorrectConstraintException extends Exception {
        @Override // java.lang.Throwable
        public final String getMessage() {
            throw null;
        }

        @Override // java.lang.Throwable
        public final String toString() {
            throw null;
        }
    }

    public ConstraintReference(State state) {
        String str = Dimension.FIXED_DIMENSION;
        Dimension dimension = new Dimension(str);
        String str2 = Dimension.WRAP_DIMENSION;
        dimension.mInitialValue = str2;
        this.mHorizontalDimension = dimension;
        Dimension dimension2 = new Dimension(str);
        dimension2.mInitialValue = str2;
        this.mVerticalDimension = dimension2;
        this.mCustomColors = new HashMap();
        this.mCustomFloats = new HashMap();
        this.mState = state;
    }

    @Override // androidx.constraintlayout.core.state.Reference
    public void apply() {
        if (this.mConstraintWidget == null) {
            return;
        }
        Facade facade = this.mFacade;
        if (facade != null) {
            facade.apply();
        }
        this.mHorizontalDimension.apply(this.mConstraintWidget, 0);
        this.mVerticalDimension.apply(this.mConstraintWidget, 1);
        this.mLeftToLeft = get(this.mLeftToLeft);
        this.mLeftToRight = get(this.mLeftToRight);
        this.mRightToLeft = get(this.mRightToLeft);
        this.mRightToRight = get(this.mRightToRight);
        this.mStartToStart = get(this.mStartToStart);
        this.mStartToEnd = get(this.mStartToEnd);
        this.mEndToStart = get(this.mEndToStart);
        this.mEndToEnd = get(this.mEndToEnd);
        this.mTopToTop = get(this.mTopToTop);
        this.mTopToBottom = get(this.mTopToBottom);
        this.mBottomToTop = get(this.mBottomToTop);
        this.mBottomToBottom = get(this.mBottomToBottom);
        this.mBaselineToBaseline = get(this.mBaselineToBaseline);
        this.mBaselineToTop = get(this.mBaselineToTop);
        this.mBaselineToBottom = get(this.mBaselineToBottom);
        applyConnection(this.mConstraintWidget, this.mLeftToLeft, 1);
        applyConnection(this.mConstraintWidget, this.mLeftToRight, 2);
        applyConnection(this.mConstraintWidget, this.mRightToLeft, 3);
        applyConnection(this.mConstraintWidget, this.mRightToRight, 4);
        applyConnection(this.mConstraintWidget, this.mStartToStart, 5);
        applyConnection(this.mConstraintWidget, this.mStartToEnd, 6);
        applyConnection(this.mConstraintWidget, this.mEndToStart, 7);
        applyConnection(this.mConstraintWidget, this.mEndToEnd, 8);
        applyConnection(this.mConstraintWidget, this.mTopToTop, 9);
        applyConnection(this.mConstraintWidget, this.mTopToBottom, 10);
        applyConnection(this.mConstraintWidget, this.mTopToBaseline, 11);
        applyConnection(this.mConstraintWidget, this.mBottomToTop, 12);
        applyConnection(this.mConstraintWidget, this.mBottomToBottom, 13);
        applyConnection(this.mConstraintWidget, this.mBottomToBaseline, 14);
        applyConnection(this.mConstraintWidget, this.mBaselineToBaseline, 15);
        applyConnection(this.mConstraintWidget, this.mBaselineToTop, 16);
        applyConnection(this.mConstraintWidget, this.mBaselineToBottom, 17);
        applyConnection(this.mConstraintWidget, this.mCircularConstraint, 20);
        int i = this.mHorizontalChainStyle;
        if (i != 0) {
            this.mConstraintWidget.mHorizontalChainStyle = i;
        }
        int i2 = this.mVerticalChainStyle;
        if (i2 != 0) {
            this.mConstraintWidget.mVerticalChainStyle = i2;
        }
        float f = this.mHorizontalChainWeight;
        if (f != -1.0f) {
            this.mConstraintWidget.mWeight[0] = f;
        }
        float f2 = this.mVerticalChainWeight;
        if (f2 != -1.0f) {
            this.mConstraintWidget.mWeight[1] = f2;
        }
        ConstraintWidget constraintWidget = this.mConstraintWidget;
        constraintWidget.mHorizontalBiasPercent = this.mHorizontalBias;
        constraintWidget.mVerticalBiasPercent = this.mVerticalBias;
        WidgetFrame widgetFrame = constraintWidget.frame;
        widgetFrame.pivotX = this.mPivotX;
        widgetFrame.pivotY = this.mPivotY;
        widgetFrame.rotationX = this.mRotationX;
        widgetFrame.rotationY = this.mRotationY;
        widgetFrame.rotationZ = this.mRotationZ;
        widgetFrame.translationX = this.mTranslationX;
        widgetFrame.translationY = this.mTranslationY;
        widgetFrame.translationZ = this.mTranslationZ;
        widgetFrame.scaleX = this.mScaleX;
        widgetFrame.scaleY = this.mScaleY;
        widgetFrame.alpha = this.mAlpha;
        int i3 = this.mVisibility;
        widgetFrame.visibility = i3;
        constraintWidget.mVisibility = i3;
        HashMap hashMap = this.mCustomColors;
        if (hashMap != null) {
            for (String str : hashMap.keySet()) {
                Integer num = (Integer) hashMap.get(str);
                WidgetFrame widgetFrame2 = this.mConstraintWidget.frame;
                int intValue = num.intValue();
                HashMap hashMap2 = widgetFrame2.mCustom;
                if (hashMap2.containsKey(str)) {
                    ((CustomVariable) hashMap2.get(str)).mIntegerValue = intValue;
                } else {
                    CustomVariable customVariable = new CustomVariable();
                    customVariable.mFloatValue = Float.NaN;
                    customVariable.mName = str;
                    customVariable.mType = 902;
                    customVariable.mIntegerValue = intValue;
                    hashMap2.put(str, customVariable);
                }
            }
        }
        HashMap hashMap3 = this.mCustomFloats;
        if (hashMap3 != null) {
            for (String str2 : hashMap3.keySet()) {
                float floatValue = ((Float) this.mCustomFloats.get(str2)).floatValue();
                HashMap hashMap4 = this.mConstraintWidget.frame.mCustom;
                if (hashMap4.containsKey(str2)) {
                    ((CustomVariable) hashMap4.get(str2)).mFloatValue = floatValue;
                } else {
                    CustomVariable customVariable2 = new CustomVariable();
                    customVariable2.mIntegerValue = PKIFailureInfo.systemUnavail;
                    customVariable2.mName = str2;
                    customVariable2.mType = 901;
                    customVariable2.mFloatValue = floatValue;
                    hashMap4.put(str2, customVariable2);
                }
            }
        }
    }

    public final void applyConnection(ConstraintWidget constraintWidget, Object obj, int i) {
        ConstraintWidget constraintWidget2 = obj instanceof Reference ? ((Reference) obj).getConstraintWidget() : null;
        if (constraintWidget2 == null) {
            return;
        }
        int i2 = AnonymousClass1.$SwitchMap$androidx$constraintlayout$core$state$State$Constraint[CameraSelector$$ExternalSyntheticOutline0.ordinal(i)];
        int ordinal = CameraSelector$$ExternalSyntheticOutline0.ordinal(i);
        if (ordinal == 19) {
            float f = this.mCircularAngle;
            constraintWidget.immediateConnect(7, 7, (int) this.mCircularDistance, 0, constraintWidget2);
            constraintWidget.mCircleConstraintAngle = f;
            return;
        }
        switch (ordinal) {
            case 0:
                constraintWidget.getAnchor(2).connect(constraintWidget2.getAnchor(2), this.mMarginLeft, this.mMarginLeftGone, false);
                break;
            case 1:
                constraintWidget.getAnchor(2).connect(constraintWidget2.getAnchor(4), this.mMarginLeft, this.mMarginLeftGone, false);
                break;
            case 2:
                constraintWidget.getAnchor(4).connect(constraintWidget2.getAnchor(2), this.mMarginRight, this.mMarginRightGone, false);
                break;
            case 3:
                constraintWidget.getAnchor(4).connect(constraintWidget2.getAnchor(4), this.mMarginRight, this.mMarginRightGone, false);
                break;
            case 4:
                constraintWidget.getAnchor(2).connect(constraintWidget2.getAnchor(2), this.mMarginStart, this.mMarginStartGone, false);
                break;
            case 5:
                constraintWidget.getAnchor(2).connect(constraintWidget2.getAnchor(4), this.mMarginStart, this.mMarginStartGone, false);
                break;
            case 6:
                constraintWidget.getAnchor(4).connect(constraintWidget2.getAnchor(2), this.mMarginEnd, this.mMarginEndGone, false);
                break;
            case 7:
                constraintWidget.getAnchor(4).connect(constraintWidget2.getAnchor(4), this.mMarginEnd, this.mMarginEndGone, false);
                break;
            case 8:
                constraintWidget.getAnchor(3).connect(constraintWidget2.getAnchor(3), this.mMarginTop, this.mMarginTopGone, false);
                break;
            case 9:
                constraintWidget.getAnchor(3).connect(constraintWidget2.getAnchor(5), this.mMarginTop, this.mMarginTopGone, false);
                break;
            case 10:
                constraintWidget.immediateConnect(3, 6, this.mMarginTop, this.mMarginTopGone, constraintWidget2);
                break;
            case 11:
                constraintWidget.getAnchor(5).connect(constraintWidget2.getAnchor(3), this.mMarginBottom, this.mMarginBottomGone, false);
                break;
            case 12:
                constraintWidget.getAnchor(5).connect(constraintWidget2.getAnchor(5), this.mMarginBottom, this.mMarginBottomGone, false);
                break;
            case 13:
                constraintWidget.immediateConnect(5, 6, this.mMarginBottom, this.mMarginBottomGone, constraintWidget2);
                break;
            case 14:
                constraintWidget.immediateConnect(6, 6, this.mMarginBaseline, this.mMarginBaselineGone, constraintWidget2);
                break;
            case 15:
                constraintWidget.immediateConnect(6, 3, this.mMarginBaseline, this.mMarginBaselineGone, constraintWidget2);
                break;
            case 16:
                constraintWidget.immediateConnect(6, 5, this.mMarginBaseline, this.mMarginBaselineGone, constraintWidget2);
                break;
        }
    }

    public final void bottomToBottom(Object obj) {
        this.mLast = 13;
        this.mBottomToBottom = obj;
    }

    public final void clear() {
        int i = this.mLast;
        if (i == 0) {
            this.mLeftToLeft = null;
            this.mLeftToRight = null;
            this.mMarginLeft = 0;
            this.mRightToLeft = null;
            this.mRightToRight = null;
            this.mMarginRight = 0;
            this.mStartToStart = null;
            this.mStartToEnd = null;
            this.mMarginStart = 0;
            this.mEndToStart = null;
            this.mEndToEnd = null;
            this.mMarginEnd = 0;
            this.mTopToTop = null;
            this.mTopToBottom = null;
            this.mMarginTop = 0;
            this.mBottomToTop = null;
            this.mBottomToBottom = null;
            this.mMarginBottom = 0;
            this.mBaselineToBaseline = null;
            this.mCircularConstraint = null;
            this.mHorizontalBias = 0.5f;
            this.mVerticalBias = 0.5f;
            this.mMarginLeftGone = 0;
            this.mMarginRightGone = 0;
            this.mMarginStartGone = 0;
            this.mMarginEndGone = 0;
            this.mMarginTopGone = 0;
            this.mMarginBottomGone = 0;
            return;
        }
        int ordinal = CameraSelector$$ExternalSyntheticOutline0.ordinal(i);
        if (ordinal == 19) {
            this.mCircularConstraint = null;
            return;
        }
        switch (ordinal) {
            case 0:
            case 1:
                this.mLeftToLeft = null;
                this.mLeftToRight = null;
                this.mMarginLeft = 0;
                this.mMarginLeftGone = 0;
                break;
            case 2:
            case 3:
                this.mRightToLeft = null;
                this.mRightToRight = null;
                this.mMarginRight = 0;
                this.mMarginRightGone = 0;
                break;
            case 4:
            case 5:
                this.mStartToStart = null;
                this.mStartToEnd = null;
                this.mMarginStart = 0;
                this.mMarginStartGone = 0;
                break;
            case 6:
            case 7:
                this.mEndToStart = null;
                this.mEndToEnd = null;
                this.mMarginEnd = 0;
                this.mMarginEndGone = 0;
                break;
            case 8:
            case 9:
            case 10:
                this.mTopToTop = null;
                this.mTopToBottom = null;
                this.mTopToBaseline = null;
                this.mMarginTop = 0;
                this.mMarginTopGone = 0;
                break;
            case 11:
            case 12:
            case 13:
                this.mBottomToTop = null;
                this.mBottomToBottom = null;
                this.mBottomToBaseline = null;
                this.mMarginBottom = 0;
                this.mMarginBottomGone = 0;
                break;
            case 14:
                this.mBaselineToBaseline = null;
                break;
        }
    }

    public final void clearHorizontal() {
        if (this.mStartToStart != null) {
            this.mLast = 5;
        } else {
            this.mLast = 6;
        }
        clear();
        if (this.mEndToStart != null) {
            this.mLast = 7;
        } else {
            this.mLast = 8;
        }
        clear();
        if (this.mLeftToLeft != null) {
            this.mLast = 1;
        } else {
            this.mLast = 2;
        }
        clear();
        if (this.mRightToLeft != null) {
            this.mLast = 3;
        } else {
            this.mLast = 4;
        }
        clear();
    }

    public final void clearVertical() {
        if (this.mTopToTop != null) {
            this.mLast = 9;
        } else {
            this.mLast = 10;
        }
        clear();
        this.mLast = 15;
        clear();
        if (this.mBottomToTop != null) {
            this.mLast = 12;
        } else {
            this.mLast = 13;
        }
        clear();
    }

    public final void endToEnd(Object obj) {
        this.mLast = 8;
        this.mEndToEnd = obj;
    }

    public final Object get(Object obj) {
        if (obj == null) {
            return null;
        }
        return !(obj instanceof ConstraintReference) ? (Reference) this.mState.mReferences.get(obj) : obj;
    }

    @Override // androidx.constraintlayout.core.state.Reference
    public ConstraintWidget getConstraintWidget() {
        if (this.mConstraintWidget == null) {
            ConstraintWidget constraintWidget = new ConstraintWidget(this.mHorizontalDimension.mValue, this.mVerticalDimension.mValue);
            this.mConstraintWidget = constraintWidget;
            constraintWidget.mCompanionWidget = this.mView;
        }
        return this.mConstraintWidget;
    }

    @Override // androidx.constraintlayout.core.state.Reference
    public final Facade getFacade() {
        return this.mFacade;
    }

    @Override // androidx.constraintlayout.core.state.Reference
    public final Object getKey() {
        return this.mKey;
    }

    public ConstraintReference margin(int i) {
        int i2 = this.mLast;
        if (i2 == 0) {
            this.mMarginLeft = i;
            this.mMarginRight = i;
            this.mMarginStart = i;
            this.mMarginEnd = i;
            this.mMarginTop = i;
            this.mMarginBottom = i;
            return this;
        }
        int ordinal = CameraSelector$$ExternalSyntheticOutline0.ordinal(i2);
        if (ordinal == 19) {
            this.mCircularDistance = i;
            return this;
        }
        switch (ordinal) {
            case 0:
            case 1:
                this.mMarginLeft = i;
                break;
            case 2:
            case 3:
                this.mMarginRight = i;
                break;
            case 4:
            case 5:
                this.mMarginStart = i;
                break;
            case 6:
            case 7:
                this.mMarginEnd = i;
                break;
            case 8:
            case 9:
            case 10:
                this.mMarginTop = i;
                break;
            case 11:
            case 12:
            case 13:
                this.mMarginBottom = i;
                break;
            case 14:
            case 15:
            case 16:
                this.mMarginBaseline = i;
                break;
        }
        return this;
    }

    public final void marginGone(int i) {
        int i2 = this.mLast;
        if (i2 == 0) {
            this.mMarginLeftGone = i;
            this.mMarginRightGone = i;
            this.mMarginStartGone = i;
            this.mMarginEndGone = i;
            this.mMarginTopGone = i;
            this.mMarginBottomGone = i;
            return;
        }
        switch (CameraSelector$$ExternalSyntheticOutline0.ordinal(i2)) {
            case 0:
            case 1:
                this.mMarginLeftGone = i;
                break;
            case 2:
            case 3:
                this.mMarginRightGone = i;
                break;
            case 4:
            case 5:
                this.mMarginStartGone = i;
                break;
            case 6:
            case 7:
                this.mMarginEndGone = i;
                break;
            case 8:
            case 9:
            case 10:
                this.mMarginTopGone = i;
                break;
            case 11:
            case 12:
            case 13:
                this.mMarginBottomGone = i;
                break;
            case 14:
            case 15:
            case 16:
                this.mMarginBaselineGone = i;
                break;
        }
    }

    @Override // androidx.constraintlayout.core.state.Reference
    public final void setConstraintWidget(ConstraintWidget constraintWidget) {
        if (constraintWidget == null) {
            return;
        }
        this.mConstraintWidget = constraintWidget;
        constraintWidget.mCompanionWidget = this.mView;
    }

    public final void startToStart(Object obj) {
        this.mLast = 5;
        this.mStartToStart = obj;
    }

    public final void topToTop(Object obj) {
        this.mLast = 9;
        this.mTopToTop = obj;
    }

    public final void marginGone(Float f) {
        marginGone(this.mState.convertDimension(f));
    }

    public ConstraintReference margin(Float f) {
        return margin(this.mState.convertDimension(f));
    }
}
