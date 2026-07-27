package kotlin.text;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;

/* loaded from: classes.dex */
public abstract class CatchingFishAdMobXMLLayout extends ViewGroup {
    public int CatchingFishAnimationMockk;
    public boolean CatchingFishCloudMessaging;
    public int CatchingFishDaggerWebsocket;
    public int[] CatchingFishEspressoTesting;
    public float CatchingFishFragmentHandler;
    public int CatchingFishLayout;
    public int CatchingFishNavigation;
    public int[] CatchingFishOkHttp;
    public boolean CatchingFishReduxKtor;
    public int CatchingFishRoomDatabase;
    public int CatchingFishStateLiveData;
    public Drawable CatchingFishUnitTesting;
    public int CatchingFishViewModelFAB;
    public int CatchingFishViewModelScope;
    public int CatchingFishWorkManager;

    public CatchingFishAdMobXMLLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        this.CatchingFishReduxKtor = true;
        this.CatchingFishDaggerWebsocket = -1;
        this.CatchingFishWorkManager = 0;
        this.CatchingFishViewModelFAB = 8388659;
        int[] iArr = CatchingFishWidgetGlide.CatchingFishUnitTesting;
        CatchingFishAsyncTaskDagger CatchingFishRecyclerView = CatchingFishAsyncTaskDagger.CatchingFishRecyclerView(context, attributeSet, iArr, 0);
        CatchingFishFABCameraX.CatchingFishEspressoTesting(this, context, iArr, attributeSet, (TypedArray) CatchingFishRecyclerView.CatchingFishDaggerWebsocket, 0);
        TypedArray typedArray = (TypedArray) CatchingFishRecyclerView.CatchingFishDaggerWebsocket;
        int i2 = typedArray.getInt(1, -1);
        if (i2 >= 0) {
            setOrientation(i2);
        }
        int i3 = typedArray.getInt(0, -1);
        if (i3 >= 0) {
            setGravity(i3);
        }
        boolean z = typedArray.getBoolean(2, true);
        if (!z) {
            setBaselineAligned(z);
        }
        this.CatchingFishFragmentHandler = typedArray.getFloat(4, -1.0f);
        this.CatchingFishDaggerWebsocket = typedArray.getInt(3, -1);
        this.CatchingFishCloudMessaging = typedArray.getBoolean(7, false);
        setDividerDrawable(CatchingFishRecyclerView.CatchingFishMutableLiveData(5));
        this.CatchingFishRoomDatabase = typedArray.getInt(8, 0);
        this.CatchingFishNavigation = typedArray.getDimensionPixelSize(6, 0);
        CatchingFishRecyclerView.CatchingFishAnimation();
    }

    public final void CatchingFishDaggerWebsocket(Canvas canvas, int i) {
        this.CatchingFishUnitTesting.setBounds(i, getPaddingTop() + this.CatchingFishNavigation, this.CatchingFishAnimationMockk + i, (getHeight() - getPaddingBottom()) - this.CatchingFishNavigation);
        this.CatchingFishUnitTesting.draw(canvas);
    }

    public final boolean CatchingFishLayout(int i) {
        if (i == 0) {
            return (this.CatchingFishRoomDatabase & 1) != 0;
        }
        if (i == getChildCount()) {
            return (this.CatchingFishRoomDatabase & 4) != 0;
        }
        if ((this.CatchingFishRoomDatabase & 2) != 0) {
            for (int i2 = i - 1; i2 >= 0; i2--) {
                if (getChildAt(i2).getVisibility() != 8) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void CatchingFishReduxKtor(Canvas canvas, int i) {
        this.CatchingFishUnitTesting.setBounds(getPaddingLeft() + this.CatchingFishNavigation, i, (getWidth() - getPaddingRight()) - this.CatchingFishNavigation, this.CatchingFishStateLiveData + i);
        this.CatchingFishUnitTesting.draw(canvas);
    }

    @Override // android.view.ViewGroup
    /* renamed from: CatchingFishViewModelFAB, reason: merged with bridge method [inline-methods] */
    public CatchingFishWidgetDataStore generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof CatchingFishWidgetDataStore ? new CatchingFishWidgetDataStore((CatchingFishWidgetDataStore) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new CatchingFishWidgetDataStore((ViewGroup.MarginLayoutParams) layoutParams) : new CatchingFishWidgetDataStore(layoutParams);
    }

    @Override // android.view.ViewGroup
    /* renamed from: CatchingFishViewModelScope, reason: merged with bridge method [inline-methods] */
    public CatchingFishWidgetDataStore generateLayoutParams(AttributeSet attributeSet) {
        return new CatchingFishWidgetDataStore(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    /* renamed from: CatchingFishWorkManager, reason: merged with bridge method [inline-methods] */
    public CatchingFishWidgetDataStore generateDefaultLayoutParams() {
        int i = this.CatchingFishViewModelScope;
        if (i == 0) {
            return new CatchingFishWidgetDataStore(-2, -2);
        }
        if (i == 1) {
            return new CatchingFishWidgetDataStore(-1, -2);
        }
        return null;
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof CatchingFishWidgetDataStore;
    }

    @Override // android.view.View
    public int getBaseline() {
        int i;
        if (this.CatchingFishDaggerWebsocket < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i2 = this.CatchingFishDaggerWebsocket;
        if (childCount <= i2) {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
        View childAt = getChildAt(i2);
        int baseline = childAt.getBaseline();
        if (baseline == -1) {
            if (this.CatchingFishDaggerWebsocket == 0) {
                return -1;
            }
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
        }
        int i3 = this.CatchingFishWorkManager;
        if (this.CatchingFishViewModelScope == 1 && (i = this.CatchingFishViewModelFAB & 112) != 48) {
            if (i == 16) {
                i3 += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.CatchingFishLayout) / 2;
            } else if (i == 80) {
                i3 = ((getBottom() - getTop()) - getPaddingBottom()) - this.CatchingFishLayout;
            }
        }
        return i3 + ((LinearLayout.LayoutParams) ((CatchingFishWidgetDataStore) childAt.getLayoutParams())).topMargin + baseline;
    }

    public int getBaselineAlignedChildIndex() {
        return this.CatchingFishDaggerWebsocket;
    }

    public Drawable getDividerDrawable() {
        return this.CatchingFishUnitTesting;
    }

    public int getDividerPadding() {
        return this.CatchingFishNavigation;
    }

    public int getDividerWidth() {
        return this.CatchingFishAnimationMockk;
    }

    public int getGravity() {
        return this.CatchingFishViewModelFAB;
    }

    public int getOrientation() {
        return this.CatchingFishViewModelScope;
    }

    public int getShowDividers() {
        return this.CatchingFishRoomDatabase;
    }

    public int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.CatchingFishFragmentHandler;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int right;
        int left;
        int i;
        if (this.CatchingFishUnitTesting == null) {
            return;
        }
        int i2 = 0;
        if (this.CatchingFishViewModelScope == 1) {
            int virtualChildCount = getVirtualChildCount();
            while (i2 < virtualChildCount) {
                View childAt = getChildAt(i2);
                if (childAt != null && childAt.getVisibility() != 8 && CatchingFishLayout(i2)) {
                    CatchingFishReduxKtor(canvas, (childAt.getTop() - ((LinearLayout.LayoutParams) ((CatchingFishWidgetDataStore) childAt.getLayoutParams())).topMargin) - this.CatchingFishStateLiveData);
                }
                i2++;
            }
            if (CatchingFishLayout(virtualChildCount)) {
                View childAt2 = getChildAt(virtualChildCount - 1);
                CatchingFishReduxKtor(canvas, childAt2 == null ? (getHeight() - getPaddingBottom()) - this.CatchingFishStateLiveData : childAt2.getBottom() + ((LinearLayout.LayoutParams) ((CatchingFishWidgetDataStore) childAt2.getLayoutParams())).bottomMargin);
                return;
            }
            return;
        }
        int virtualChildCount2 = getVirtualChildCount();
        boolean z = CatchingFishMVVMGraphQL.CatchingFishParcelableFAB;
        boolean z2 = getLayoutDirection() == 1;
        while (i2 < virtualChildCount2) {
            View childAt3 = getChildAt(i2);
            if (childAt3 != null && childAt3.getVisibility() != 8 && CatchingFishLayout(i2)) {
                CatchingFishWidgetDataStore catchingFishWidgetDataStore = (CatchingFishWidgetDataStore) childAt3.getLayoutParams();
                CatchingFishDaggerWebsocket(canvas, z2 ? childAt3.getRight() + ((LinearLayout.LayoutParams) catchingFishWidgetDataStore).rightMargin : (childAt3.getLeft() - ((LinearLayout.LayoutParams) catchingFishWidgetDataStore).leftMargin) - this.CatchingFishAnimationMockk);
            }
            i2++;
        }
        if (CatchingFishLayout(virtualChildCount2)) {
            View childAt4 = getChildAt(virtualChildCount2 - 1);
            if (childAt4 != null) {
                CatchingFishWidgetDataStore catchingFishWidgetDataStore2 = (CatchingFishWidgetDataStore) childAt4.getLayoutParams();
                if (z2) {
                    left = childAt4.getLeft() - ((LinearLayout.LayoutParams) catchingFishWidgetDataStore2).leftMargin;
                    i = this.CatchingFishAnimationMockk;
                    right = left - i;
                } else {
                    right = childAt4.getRight() + ((LinearLayout.LayoutParams) catchingFishWidgetDataStore2).rightMargin;
                }
            } else if (z2) {
                right = getPaddingLeft();
            } else {
                left = getWidth() - getPaddingRight();
                i = this.CatchingFishAnimationMockk;
                right = left - i;
            }
            CatchingFishDaggerWebsocket(canvas, right);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0191  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        char c;
        int i14;
        int i15;
        int i16;
        int i17 = 8;
        char c2 = 2;
        if (this.CatchingFishViewModelScope == 1) {
            int paddingLeft = getPaddingLeft();
            int i18 = i3 - i;
            int paddingRight = i18 - getPaddingRight();
            int paddingRight2 = (i18 - paddingLeft) - getPaddingRight();
            int virtualChildCount = getVirtualChildCount();
            int i19 = this.CatchingFishViewModelFAB;
            int i20 = i19 & 112;
            int i21 = 8388615 & i19;
            int paddingTop = i20 != 16 ? i20 != 80 ? getPaddingTop() : ((getPaddingTop() + i4) - i2) - this.CatchingFishLayout : getPaddingTop() + (((i4 - i2) - this.CatchingFishLayout) / 2);
            int i22 = 0;
            while (i22 < virtualChildCount) {
                View childAt = getChildAt(i22);
                if (childAt == null || childAt.getVisibility() == i17) {
                    c = c2;
                } else {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight = childAt.getMeasuredHeight();
                    CatchingFishWidgetDataStore catchingFishWidgetDataStore = (CatchingFishWidgetDataStore) childAt.getLayoutParams();
                    c = c2;
                    int i23 = ((LinearLayout.LayoutParams) catchingFishWidgetDataStore).gravity;
                    if (i23 < 0) {
                        i23 = i21;
                    }
                    int absoluteGravity = Gravity.getAbsoluteGravity(i23, getLayoutDirection()) & 7;
                    if (absoluteGravity == 1) {
                        i14 = ((paddingRight2 - measuredWidth) / 2) + paddingLeft + ((LinearLayout.LayoutParams) catchingFishWidgetDataStore).leftMargin;
                        i15 = ((LinearLayout.LayoutParams) catchingFishWidgetDataStore).rightMargin;
                    } else if (absoluteGravity != 5) {
                        i16 = ((LinearLayout.LayoutParams) catchingFishWidgetDataStore).leftMargin + paddingLeft;
                        if (CatchingFishLayout(i22)) {
                            paddingTop += this.CatchingFishStateLiveData;
                        }
                        int i24 = paddingTop + ((LinearLayout.LayoutParams) catchingFishWidgetDataStore).topMargin;
                        childAt.layout(i16, i24, measuredWidth + i16, i24 + measuredHeight);
                        paddingTop = measuredHeight + ((LinearLayout.LayoutParams) catchingFishWidgetDataStore).bottomMargin + i24;
                    } else {
                        i14 = paddingRight - measuredWidth;
                        i15 = ((LinearLayout.LayoutParams) catchingFishWidgetDataStore).rightMargin;
                    }
                    i16 = i14 - i15;
                    if (CatchingFishLayout(i22)) {
                    }
                    int i242 = paddingTop + ((LinearLayout.LayoutParams) catchingFishWidgetDataStore).topMargin;
                    childAt.layout(i16, i242, measuredWidth + i16, i242 + measuredHeight);
                    paddingTop = measuredHeight + ((LinearLayout.LayoutParams) catchingFishWidgetDataStore).bottomMargin + i242;
                }
                i22++;
                c2 = c;
                i17 = 8;
            }
            return;
        }
        boolean z2 = CatchingFishMVVMGraphQL.CatchingFishParcelableFAB;
        boolean z3 = getLayoutDirection() == 1;
        int paddingTop2 = getPaddingTop();
        int i25 = i4 - i2;
        int paddingBottom = i25 - getPaddingBottom();
        int paddingBottom2 = (i25 - paddingTop2) - getPaddingBottom();
        int virtualChildCount2 = getVirtualChildCount();
        int i26 = this.CatchingFishViewModelFAB;
        int i27 = 8388615 & i26;
        int i28 = i26 & 112;
        boolean z4 = this.CatchingFishReduxKtor;
        int[] iArr = this.CatchingFishEspressoTesting;
        int[] iArr2 = this.CatchingFishOkHttp;
        int absoluteGravity2 = Gravity.getAbsoluteGravity(i27, getLayoutDirection());
        int paddingLeft2 = absoluteGravity2 != 1 ? absoluteGravity2 != 5 ? getPaddingLeft() : ((getPaddingLeft() + i3) - i) - this.CatchingFishLayout : getPaddingLeft() + (((i3 - i) - this.CatchingFishLayout) / 2);
        if (z3) {
            i6 = virtualChildCount2 - 1;
            i5 = -1;
        } else {
            i5 = 1;
            i6 = 0;
        }
        int i29 = 0;
        while (i29 < virtualChildCount2) {
            int i30 = (i5 * i29) + i6;
            View childAt2 = getChildAt(i30);
            if (childAt2 == null) {
                i7 = i6;
            } else {
                i7 = i6;
                if (childAt2.getVisibility() != 8) {
                    int measuredWidth2 = childAt2.getMeasuredWidth();
                    int measuredHeight2 = childAt2.getMeasuredHeight();
                    CatchingFishWidgetDataStore catchingFishWidgetDataStore2 = (CatchingFishWidgetDataStore) childAt2.getLayoutParams();
                    int i31 = paddingLeft2;
                    if (z4) {
                        i8 = paddingTop2;
                        if (((LinearLayout.LayoutParams) catchingFishWidgetDataStore2).height != -1) {
                            i9 = childAt2.getBaseline();
                            i10 = ((LinearLayout.LayoutParams) catchingFishWidgetDataStore2).gravity;
                            if (i10 < 0) {
                                i10 = i28;
                            }
                            i11 = i10 & 112;
                            if (i11 == 16) {
                                if (i11 == 48) {
                                    i12 = i8 + ((LinearLayout.LayoutParams) catchingFishWidgetDataStore2).topMargin;
                                    if (i9 != -1) {
                                        i12 = (iArr[1] - i9) + i12;
                                    }
                                } else if (i11 != 80) {
                                    i12 = i8;
                                } else {
                                    i12 = (paddingBottom - measuredHeight2) - ((LinearLayout.LayoutParams) catchingFishWidgetDataStore2).bottomMargin;
                                    if (i9 != -1) {
                                        i13 = iArr2[2] - (childAt2.getMeasuredHeight() - i9);
                                    }
                                }
                                int i32 = (CatchingFishLayout(i30) ? i31 + this.CatchingFishAnimationMockk : i31) + ((LinearLayout.LayoutParams) catchingFishWidgetDataStore2).leftMargin;
                                childAt2.layout(i32, i12, i32 + measuredWidth2, i12 + measuredHeight2);
                                paddingLeft2 = measuredWidth2 + ((LinearLayout.LayoutParams) catchingFishWidgetDataStore2).rightMargin + i32;
                                i29++;
                                i6 = i7;
                                paddingTop2 = i8;
                            } else {
                                i12 = ((paddingBottom2 - measuredHeight2) / 2) + i8 + ((LinearLayout.LayoutParams) catchingFishWidgetDataStore2).topMargin;
                                i13 = ((LinearLayout.LayoutParams) catchingFishWidgetDataStore2).bottomMargin;
                            }
                            i12 -= i13;
                            int i322 = (CatchingFishLayout(i30) ? i31 + this.CatchingFishAnimationMockk : i31) + ((LinearLayout.LayoutParams) catchingFishWidgetDataStore2).leftMargin;
                            childAt2.layout(i322, i12, i322 + measuredWidth2, i12 + measuredHeight2);
                            paddingLeft2 = measuredWidth2 + ((LinearLayout.LayoutParams) catchingFishWidgetDataStore2).rightMargin + i322;
                            i29++;
                            i6 = i7;
                            paddingTop2 = i8;
                        }
                    } else {
                        i8 = paddingTop2;
                    }
                    i9 = -1;
                    i10 = ((LinearLayout.LayoutParams) catchingFishWidgetDataStore2).gravity;
                    if (i10 < 0) {
                    }
                    i11 = i10 & 112;
                    if (i11 == 16) {
                    }
                    i12 -= i13;
                    int i3222 = (CatchingFishLayout(i30) ? i31 + this.CatchingFishAnimationMockk : i31) + ((LinearLayout.LayoutParams) catchingFishWidgetDataStore2).leftMargin;
                    childAt2.layout(i3222, i12, i3222 + measuredWidth2, i12 + measuredHeight2);
                    paddingLeft2 = measuredWidth2 + ((LinearLayout.LayoutParams) catchingFishWidgetDataStore2).rightMargin + i3222;
                    i29++;
                    i6 = i7;
                    paddingTop2 = i8;
                }
            }
            i8 = paddingTop2;
            i29++;
            i6 = i7;
            paddingTop2 = i8;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:222:0x04f8  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x053d  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0547  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0526  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0148  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        boolean z;
        int baseline;
        int i9;
        int i10;
        int[] iArr;
        int i11;
        int i12;
        boolean z2;
        boolean z3;
        CatchingFishWidgetDataStore catchingFishWidgetDataStore;
        int i13;
        int[] iArr2;
        int i14;
        View view;
        int i15;
        boolean z4;
        boolean z5;
        int max;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        boolean z6;
        int i24;
        int i25;
        int i26;
        View view2;
        boolean z7;
        boolean z8;
        CatchingFishAdMobXMLLayout catchingFishAdMobXMLLayout = this;
        int i27 = -2;
        int i28 = 0;
        int i29 = 1073741824;
        int i30 = 8;
        if (catchingFishAdMobXMLLayout.CatchingFishViewModelScope == 1) {
            catchingFishAdMobXMLLayout.CatchingFishLayout = 0;
            int virtualChildCount = catchingFishAdMobXMLLayout.getVirtualChildCount();
            int mode = View.MeasureSpec.getMode(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            int i31 = catchingFishAdMobXMLLayout.CatchingFishDaggerWebsocket;
            boolean z9 = catchingFishAdMobXMLLayout.CatchingFishCloudMessaging;
            int i32 = 0;
            int i33 = 0;
            int i34 = 0;
            boolean z10 = false;
            int i35 = 0;
            boolean z11 = false;
            boolean z12 = true;
            float f = 0.0f;
            int i36 = 0;
            while (i32 < virtualChildCount) {
                int i37 = mode;
                View childAt = catchingFishAdMobXMLLayout.getChildAt(i32);
                if (childAt == null) {
                    catchingFishAdMobXMLLayout.CatchingFishLayout = catchingFishAdMobXMLLayout.CatchingFishLayout;
                } else if (childAt.getVisibility() != i30) {
                    if (catchingFishAdMobXMLLayout.CatchingFishLayout(i32)) {
                        catchingFishAdMobXMLLayout.CatchingFishLayout += catchingFishAdMobXMLLayout.CatchingFishStateLiveData;
                    }
                    CatchingFishWidgetDataStore catchingFishWidgetDataStore2 = (CatchingFishWidgetDataStore) childAt.getLayoutParams();
                    float f2 = ((LinearLayout.LayoutParams) catchingFishWidgetDataStore2).weight;
                    f += f2;
                    if (mode2 == i29 && ((LinearLayout.LayoutParams) catchingFishWidgetDataStore2).height == 0 && f2 > 0.0f) {
                        int i38 = catchingFishAdMobXMLLayout.CatchingFishLayout;
                        catchingFishAdMobXMLLayout.CatchingFishLayout = Math.max(i38, ((LinearLayout.LayoutParams) catchingFishWidgetDataStore2).topMargin + i38 + ((LinearLayout.LayoutParams) catchingFishWidgetDataStore2).bottomMargin);
                        view2 = childAt;
                        i23 = mode2;
                        i24 = i31;
                        z6 = z9;
                        i25 = i32;
                        z10 = true;
                        i26 = i37;
                    } else {
                        if (((LinearLayout.LayoutParams) catchingFishWidgetDataStore2).height != 0 || f2 <= 0.0f) {
                            i20 = Integer.MIN_VALUE;
                        } else {
                            ((LinearLayout.LayoutParams) catchingFishWidgetDataStore2).height = i27;
                            i20 = 0;
                        }
                        if (f == 0.0f) {
                            i21 = i32;
                            i22 = catchingFishAdMobXMLLayout.CatchingFishLayout;
                        } else {
                            i21 = i32;
                            i22 = 0;
                        }
                        i23 = mode2;
                        z6 = z9;
                        i24 = i31;
                        i25 = i21;
                        i26 = i37;
                        catchingFishAdMobXMLLayout.measureChildWithMargins(childAt, i, 0, i2, i22);
                        if (i20 != Integer.MIN_VALUE) {
                            ((LinearLayout.LayoutParams) catchingFishWidgetDataStore2).height = i20;
                        }
                        int measuredHeight = childAt.getMeasuredHeight();
                        int i39 = catchingFishAdMobXMLLayout.CatchingFishLayout;
                        view2 = childAt;
                        catchingFishAdMobXMLLayout.CatchingFishLayout = Math.max(i39, i39 + measuredHeight + ((LinearLayout.LayoutParams) catchingFishWidgetDataStore2).topMargin + ((LinearLayout.LayoutParams) catchingFishWidgetDataStore2).bottomMargin);
                        if (z6) {
                            i36 = Math.max(measuredHeight, i36);
                        }
                    }
                    if (i24 >= 0 && i24 == i25 + 1) {
                        catchingFishAdMobXMLLayout.CatchingFishWorkManager = catchingFishAdMobXMLLayout.CatchingFishLayout;
                    }
                    if (i25 < i24 && ((LinearLayout.LayoutParams) catchingFishWidgetDataStore2).weight > 0.0f) {
                        throw new RuntimeException("A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex.");
                    }
                    if (i26 == 1073741824 || ((LinearLayout.LayoutParams) catchingFishWidgetDataStore2).width != -1) {
                        z7 = false;
                    } else {
                        z7 = true;
                        z11 = true;
                    }
                    int i40 = ((LinearLayout.LayoutParams) catchingFishWidgetDataStore2).leftMargin + ((LinearLayout.LayoutParams) catchingFishWidgetDataStore2).rightMargin;
                    int measuredWidth = view2.getMeasuredWidth() + i40;
                    i28 = Math.max(i28, measuredWidth);
                    int measuredState = view2.getMeasuredState();
                    boolean z13 = z7;
                    int combineMeasuredStates = View.combineMeasuredStates(i35, measuredState);
                    if (z12) {
                        i35 = combineMeasuredStates;
                        if (((LinearLayout.LayoutParams) catchingFishWidgetDataStore2).width == -1) {
                            z8 = true;
                            if (((LinearLayout.LayoutParams) catchingFishWidgetDataStore2).weight <= 0.0f) {
                                if (!z13) {
                                    i40 = measuredWidth;
                                }
                                i34 = Math.max(i34, i40);
                            } else {
                                if (!z13) {
                                    i40 = measuredWidth;
                                }
                                i33 = Math.max(i33, i40);
                            }
                            z12 = z8;
                            i32 = i25 + 1;
                            i31 = i24;
                            mode = i26;
                            z9 = z6;
                            mode2 = i23;
                            i27 = -2;
                            i29 = 1073741824;
                            i30 = 8;
                        }
                    } else {
                        i35 = combineMeasuredStates;
                    }
                    z8 = false;
                    if (((LinearLayout.LayoutParams) catchingFishWidgetDataStore2).weight <= 0.0f) {
                    }
                    z12 = z8;
                    i32 = i25 + 1;
                    i31 = i24;
                    mode = i26;
                    z9 = z6;
                    mode2 = i23;
                    i27 = -2;
                    i29 = 1073741824;
                    i30 = 8;
                }
                i23 = mode2;
                i24 = i31;
                z6 = z9;
                i25 = i32;
                i26 = i37;
                i32 = i25 + 1;
                i31 = i24;
                mode = i26;
                z9 = z6;
                mode2 = i23;
                i27 = -2;
                i29 = 1073741824;
                i30 = 8;
            }
            int i41 = mode;
            int i42 = mode2;
            boolean z14 = z9;
            int i43 = i35;
            int i44 = i2;
            if (catchingFishAdMobXMLLayout.CatchingFishLayout > 0 && catchingFishAdMobXMLLayout.CatchingFishLayout(virtualChildCount)) {
                catchingFishAdMobXMLLayout.CatchingFishLayout += catchingFishAdMobXMLLayout.CatchingFishStateLiveData;
            }
            if (z14 && (i42 == Integer.MIN_VALUE || i42 == 0)) {
                catchingFishAdMobXMLLayout.CatchingFishLayout = 0;
                for (int i45 = 0; i45 < virtualChildCount; i45++) {
                    View childAt2 = catchingFishAdMobXMLLayout.getChildAt(i45);
                    if (childAt2 == null) {
                        catchingFishAdMobXMLLayout.CatchingFishLayout = catchingFishAdMobXMLLayout.CatchingFishLayout;
                    } else if (childAt2.getVisibility() != 8) {
                        CatchingFishWidgetDataStore catchingFishWidgetDataStore3 = (CatchingFishWidgetDataStore) childAt2.getLayoutParams();
                        int i46 = catchingFishAdMobXMLLayout.CatchingFishLayout;
                        catchingFishAdMobXMLLayout.CatchingFishLayout = Math.max(i46, i46 + i36 + ((LinearLayout.LayoutParams) catchingFishWidgetDataStore3).topMargin + ((LinearLayout.LayoutParams) catchingFishWidgetDataStore3).bottomMargin);
                    }
                }
            }
            int paddingBottom = catchingFishAdMobXMLLayout.getPaddingBottom() + catchingFishAdMobXMLLayout.getPaddingTop() + catchingFishAdMobXMLLayout.CatchingFishLayout;
            catchingFishAdMobXMLLayout.CatchingFishLayout = paddingBottom;
            int resolveSizeAndState = View.resolveSizeAndState(Math.max(paddingBottom, catchingFishAdMobXMLLayout.getSuggestedMinimumHeight()), i44, 0);
            int i47 = (resolveSizeAndState & 16777215) - catchingFishAdMobXMLLayout.CatchingFishLayout;
            if (z10 || (i47 != 0 && f > 0.0f)) {
                float f3 = catchingFishAdMobXMLLayout.CatchingFishFragmentHandler;
                if (f3 > 0.0f) {
                    f = f3;
                }
                catchingFishAdMobXMLLayout.CatchingFishLayout = 0;
                int i48 = i43;
                int i49 = 0;
                while (i49 < virtualChildCount) {
                    View childAt3 = catchingFishAdMobXMLLayout.getChildAt(i49);
                    if (childAt3.getVisibility() == 8) {
                        i17 = i49;
                    } else {
                        CatchingFishWidgetDataStore catchingFishWidgetDataStore4 = (CatchingFishWidgetDataStore) childAt3.getLayoutParams();
                        float f4 = ((LinearLayout.LayoutParams) catchingFishWidgetDataStore4).weight;
                        if (f4 > 0.0f) {
                            int i50 = (int) ((i47 * f4) / f);
                            f -= f4;
                            i47 -= i50;
                            i17 = i49;
                            int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, catchingFishAdMobXMLLayout.getPaddingRight() + catchingFishAdMobXMLLayout.getPaddingLeft() + ((LinearLayout.LayoutParams) catchingFishWidgetDataStore4).leftMargin + ((LinearLayout.LayoutParams) catchingFishWidgetDataStore4).rightMargin, ((LinearLayout.LayoutParams) catchingFishWidgetDataStore4).width);
                            if (((LinearLayout.LayoutParams) catchingFishWidgetDataStore4).height == 0) {
                                i19 = 1073741824;
                                if (i42 == 1073741824) {
                                    if (i50 <= 0) {
                                        i50 = 0;
                                    }
                                    childAt3.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(i50, 1073741824));
                                    i48 = View.combineMeasuredStates(i48, childAt3.getMeasuredState() & (-256));
                                }
                            } else {
                                i19 = 1073741824;
                            }
                            int measuredHeight2 = childAt3.getMeasuredHeight() + i50;
                            if (measuredHeight2 < 0) {
                                measuredHeight2 = 0;
                            }
                            childAt3.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(measuredHeight2, i19));
                            i48 = View.combineMeasuredStates(i48, childAt3.getMeasuredState() & (-256));
                        } else {
                            i17 = i49;
                        }
                        int i51 = ((LinearLayout.LayoutParams) catchingFishWidgetDataStore4).leftMargin + ((LinearLayout.LayoutParams) catchingFishWidgetDataStore4).rightMargin;
                        int measuredWidth2 = childAt3.getMeasuredWidth() + i51;
                        i28 = Math.max(i28, measuredWidth2);
                        if (i41 != 1073741824) {
                            i18 = -1;
                            if (((LinearLayout.LayoutParams) catchingFishWidgetDataStore4).width == -1) {
                                measuredWidth2 = i51;
                            }
                        } else {
                            i18 = -1;
                        }
                        i33 = Math.max(i33, measuredWidth2);
                        boolean z15 = z12 && ((LinearLayout.LayoutParams) catchingFishWidgetDataStore4).width == i18;
                        int i52 = catchingFishAdMobXMLLayout.CatchingFishLayout;
                        catchingFishAdMobXMLLayout.CatchingFishLayout = Math.max(i52, childAt3.getMeasuredHeight() + i52 + ((LinearLayout.LayoutParams) catchingFishWidgetDataStore4).topMargin + ((LinearLayout.LayoutParams) catchingFishWidgetDataStore4).bottomMargin);
                        z12 = z15;
                    }
                    i49 = i17 + 1;
                }
                catchingFishAdMobXMLLayout.CatchingFishLayout = catchingFishAdMobXMLLayout.getPaddingBottom() + catchingFishAdMobXMLLayout.getPaddingTop() + catchingFishAdMobXMLLayout.CatchingFishLayout;
                i43 = i48;
            } else {
                i33 = Math.max(i33, i34);
                if (z14 && i42 != 1073741824) {
                    for (int i53 = 0; i53 < virtualChildCount; i53++) {
                        View childAt4 = catchingFishAdMobXMLLayout.getChildAt(i53);
                        if (childAt4 != null && childAt4.getVisibility() != 8 && ((LinearLayout.LayoutParams) ((CatchingFishWidgetDataStore) childAt4.getLayoutParams())).weight > 0.0f) {
                            childAt4.measure(View.MeasureSpec.makeMeasureSpec(childAt4.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(i36, 1073741824));
                        }
                    }
                }
            }
            if (z12 || i41 == 1073741824) {
                i33 = i28;
            }
            catchingFishAdMobXMLLayout.setMeasuredDimension(View.resolveSizeAndState(Math.max(catchingFishAdMobXMLLayout.getPaddingRight() + catchingFishAdMobXMLLayout.getPaddingLeft() + i33, catchingFishAdMobXMLLayout.getSuggestedMinimumWidth()), i, i43), resolveSizeAndState);
            if (z11) {
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(catchingFishAdMobXMLLayout.getMeasuredWidth(), 1073741824);
                int i54 = 0;
                while (i54 < virtualChildCount) {
                    View childAt5 = catchingFishAdMobXMLLayout.getChildAt(i54);
                    if (childAt5.getVisibility() != 8) {
                        CatchingFishWidgetDataStore catchingFishWidgetDataStore5 = (CatchingFishWidgetDataStore) childAt5.getLayoutParams();
                        if (((LinearLayout.LayoutParams) catchingFishWidgetDataStore5).width == -1) {
                            int i55 = ((LinearLayout.LayoutParams) catchingFishWidgetDataStore5).height;
                            ((LinearLayout.LayoutParams) catchingFishWidgetDataStore5).height = childAt5.getMeasuredHeight();
                            catchingFishAdMobXMLLayout.measureChildWithMargins(childAt5, makeMeasureSpec, 0, i44, 0);
                            ((LinearLayout.LayoutParams) catchingFishWidgetDataStore5).height = i55;
                        }
                    }
                    i54++;
                    i44 = i2;
                }
                return;
            }
            return;
        }
        int i56 = i;
        catchingFishAdMobXMLLayout.CatchingFishLayout = 0;
        int virtualChildCount2 = catchingFishAdMobXMLLayout.getVirtualChildCount();
        int mode3 = View.MeasureSpec.getMode(i56);
        int mode4 = View.MeasureSpec.getMode(i2);
        if (catchingFishAdMobXMLLayout.CatchingFishEspressoTesting == null || catchingFishAdMobXMLLayout.CatchingFishOkHttp == null) {
            catchingFishAdMobXMLLayout.CatchingFishEspressoTesting = new int[4];
            catchingFishAdMobXMLLayout.CatchingFishOkHttp = new int[4];
        }
        int[] iArr3 = catchingFishAdMobXMLLayout.CatchingFishEspressoTesting;
        int[] iArr4 = catchingFishAdMobXMLLayout.CatchingFishOkHttp;
        iArr3[3] = -1;
        char c = 2;
        iArr3[2] = -1;
        iArr3[1] = -1;
        iArr3[0] = -1;
        iArr4[3] = -1;
        iArr4[2] = -1;
        iArr4[1] = -1;
        iArr4[0] = -1;
        boolean z16 = catchingFishAdMobXMLLayout.CatchingFishReduxKtor;
        boolean z17 = catchingFishAdMobXMLLayout.CatchingFishCloudMessaging;
        boolean z18 = mode3 == 1073741824;
        float f5 = 0.0f;
        boolean z19 = true;
        int i57 = 0;
        int i58 = 0;
        int i59 = 0;
        int i60 = 0;
        int i61 = 0;
        int i62 = 0;
        boolean z20 = false;
        boolean z21 = false;
        while (i57 < virtualChildCount2) {
            char c2 = c;
            View childAt6 = catchingFishAdMobXMLLayout.getChildAt(i57);
            if (childAt6 == null) {
                catchingFishAdMobXMLLayout.CatchingFishLayout = catchingFishAdMobXMLLayout.CatchingFishLayout;
                i12 = i57;
                i16 = i59;
                iArr2 = iArr3;
                iArr = iArr4;
                z2 = z16;
                z3 = z17;
            } else {
                int i63 = i58;
                if (childAt6.getVisibility() == 8) {
                    i56 = i;
                    i12 = i57;
                    i16 = i59;
                    iArr = iArr4;
                    z2 = z16;
                    z3 = z17;
                    i58 = i63;
                    iArr2 = iArr3;
                } else {
                    if (catchingFishAdMobXMLLayout.CatchingFishLayout(i57)) {
                        catchingFishAdMobXMLLayout.CatchingFishLayout += catchingFishAdMobXMLLayout.CatchingFishAnimationMockk;
                    }
                    CatchingFishWidgetDataStore catchingFishWidgetDataStore6 = (CatchingFishWidgetDataStore) childAt6.getLayoutParams();
                    float f6 = ((LinearLayout.LayoutParams) catchingFishWidgetDataStore6).weight;
                    f5 += f6;
                    int i64 = i57;
                    if (mode3 == 1073741824 && ((LinearLayout.LayoutParams) catchingFishWidgetDataStore6).width == 0 && f6 > 0.0f) {
                        if (z18) {
                            catchingFishAdMobXMLLayout.CatchingFishLayout = ((LinearLayout.LayoutParams) catchingFishWidgetDataStore6).leftMargin + ((LinearLayout.LayoutParams) catchingFishWidgetDataStore6).rightMargin + catchingFishAdMobXMLLayout.CatchingFishLayout;
                        } else {
                            int i65 = catchingFishAdMobXMLLayout.CatchingFishLayout;
                            catchingFishAdMobXMLLayout.CatchingFishLayout = Math.max(i65, ((LinearLayout.LayoutParams) catchingFishWidgetDataStore6).leftMargin + i65 + ((LinearLayout.LayoutParams) catchingFishWidgetDataStore6).rightMargin);
                        }
                        if (z16) {
                            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
                            childAt6.measure(makeMeasureSpec2, makeMeasureSpec2);
                            view = childAt6;
                            z2 = z16;
                            z3 = z17;
                            i13 = i63;
                            i12 = i64;
                            catchingFishWidgetDataStore = catchingFishWidgetDataStore6;
                            iArr2 = iArr3;
                            iArr = iArr4;
                            i56 = i;
                            i14 = i59;
                            i11 = i60;
                        } else {
                            view = childAt6;
                            z2 = z16;
                            z3 = z17;
                            z21 = true;
                            i13 = i63;
                            i12 = i64;
                            i15 = 1073741824;
                            catchingFishWidgetDataStore = catchingFishWidgetDataStore6;
                            iArr2 = iArr3;
                            iArr = iArr4;
                            i56 = i;
                            i14 = i59;
                            i11 = i60;
                            if (mode4 == i15 && ((LinearLayout.LayoutParams) catchingFishWidgetDataStore).height == -1) {
                                z4 = true;
                                z20 = true;
                            } else {
                                z4 = false;
                            }
                            int i66 = ((LinearLayout.LayoutParams) catchingFishWidgetDataStore).topMargin + ((LinearLayout.LayoutParams) catchingFishWidgetDataStore).bottomMargin;
                            int measuredHeight3 = view.getMeasuredHeight() + i66;
                            i62 = View.combineMeasuredStates(i62, view.getMeasuredState());
                            if (z2) {
                                z5 = z4;
                            } else {
                                int baseline2 = view.getBaseline();
                                z5 = z4;
                                if (baseline2 != -1) {
                                    int i67 = ((LinearLayout.LayoutParams) catchingFishWidgetDataStore).gravity;
                                    if (i67 < 0) {
                                        i67 = catchingFishAdMobXMLLayout.CatchingFishViewModelFAB;
                                    }
                                    int i68 = (((i67 & 112) >> 4) & (-2)) >> 1;
                                    iArr2[i68] = Math.max(iArr2[i68], baseline2);
                                    iArr[i68] = Math.max(iArr[i68], measuredHeight3 - baseline2);
                                }
                            }
                            int max2 = Math.max(i13, measuredHeight3);
                            boolean z22 = !z19 && ((LinearLayout.LayoutParams) catchingFishWidgetDataStore).height == -1;
                            if (((LinearLayout.LayoutParams) catchingFishWidgetDataStore).weight <= 0.0f) {
                                if (!z5) {
                                    i66 = measuredHeight3;
                                }
                                i60 = Math.max(i11, i66);
                                max = i14;
                            } else {
                                if (!z5) {
                                    i66 = measuredHeight3;
                                }
                                max = Math.max(i14, i66);
                                i60 = i11;
                            }
                            int i69 = max;
                            i58 = max2;
                            i16 = i69;
                            z19 = z22;
                        }
                    } else {
                        if (((LinearLayout.LayoutParams) catchingFishWidgetDataStore6).width != 0 || f6 <= 0.0f) {
                            i10 = Integer.MIN_VALUE;
                        } else {
                            ((LinearLayout.LayoutParams) catchingFishWidgetDataStore6).width = -2;
                            i10 = 0;
                        }
                        iArr = iArr4;
                        i11 = i60;
                        i12 = i64;
                        z2 = z16;
                        z3 = z17;
                        int i70 = i10;
                        catchingFishWidgetDataStore = catchingFishWidgetDataStore6;
                        i13 = i63;
                        i56 = i;
                        iArr2 = iArr3;
                        i14 = i59;
                        catchingFishAdMobXMLLayout.measureChildWithMargins(childAt6, i56, f5 == 0.0f ? catchingFishAdMobXMLLayout.CatchingFishLayout : 0, i2, 0);
                        if (i70 != Integer.MIN_VALUE) {
                            ((LinearLayout.LayoutParams) catchingFishWidgetDataStore).width = i70;
                        }
                        int measuredWidth3 = childAt6.getMeasuredWidth();
                        if (z18) {
                            view = childAt6;
                            catchingFishAdMobXMLLayout.CatchingFishLayout = ((LinearLayout.LayoutParams) catchingFishWidgetDataStore).leftMargin + measuredWidth3 + ((LinearLayout.LayoutParams) catchingFishWidgetDataStore).rightMargin + catchingFishAdMobXMLLayout.CatchingFishLayout;
                        } else {
                            view = childAt6;
                            int i71 = catchingFishAdMobXMLLayout.CatchingFishLayout;
                            catchingFishAdMobXMLLayout.CatchingFishLayout = Math.max(i71, i71 + measuredWidth3 + ((LinearLayout.LayoutParams) catchingFishWidgetDataStore).leftMargin + ((LinearLayout.LayoutParams) catchingFishWidgetDataStore).rightMargin);
                        }
                        if (z3) {
                            i61 = Math.max(measuredWidth3, i61);
                        }
                    }
                    i15 = 1073741824;
                    if (mode4 == i15) {
                    }
                    z4 = false;
                    int i662 = ((LinearLayout.LayoutParams) catchingFishWidgetDataStore).topMargin + ((LinearLayout.LayoutParams) catchingFishWidgetDataStore).bottomMargin;
                    int measuredHeight32 = view.getMeasuredHeight() + i662;
                    i62 = View.combineMeasuredStates(i62, view.getMeasuredState());
                    if (z2) {
                    }
                    int max22 = Math.max(i13, measuredHeight32);
                    if (z19) {
                    }
                    if (((LinearLayout.LayoutParams) catchingFishWidgetDataStore).weight <= 0.0f) {
                    }
                    int i692 = max;
                    i58 = max22;
                    i16 = i692;
                    z19 = z22;
                }
            }
            i59 = i16;
            i57 = i12 + 1;
            c = c2;
            iArr3 = iArr2;
            iArr4 = iArr;
            z16 = z2;
            z17 = z3;
        }
        int[] iArr5 = iArr3;
        int[] iArr6 = iArr4;
        char c3 = c;
        boolean z23 = z16;
        boolean z24 = z17;
        int i72 = i58;
        int i73 = i59;
        int i74 = i60;
        if (catchingFishAdMobXMLLayout.CatchingFishLayout > 0 && catchingFishAdMobXMLLayout.CatchingFishLayout(virtualChildCount2)) {
            catchingFishAdMobXMLLayout.CatchingFishLayout += catchingFishAdMobXMLLayout.CatchingFishAnimationMockk;
        }
        int i75 = iArr5[1];
        int max3 = (i75 == -1 && iArr5[0] == -1 && iArr5[c3] == -1 && iArr5[3] == -1) ? i72 : Math.max(i72, Math.max(iArr6[3], Math.max(iArr6[0], Math.max(iArr6[1], iArr6[c3]))) + Math.max(iArr5[3], Math.max(iArr5[0], Math.max(i75, iArr5[c3]))));
        if (z24 && (mode3 == Integer.MIN_VALUE || mode3 == 0)) {
            catchingFishAdMobXMLLayout.CatchingFishLayout = 0;
            for (int i76 = 0; i76 < virtualChildCount2; i76++) {
                View childAt7 = catchingFishAdMobXMLLayout.getChildAt(i76);
                if (childAt7 == null) {
                    catchingFishAdMobXMLLayout.CatchingFishLayout = catchingFishAdMobXMLLayout.CatchingFishLayout;
                } else if (childAt7.getVisibility() != 8) {
                    CatchingFishWidgetDataStore catchingFishWidgetDataStore7 = (CatchingFishWidgetDataStore) childAt7.getLayoutParams();
                    if (z18) {
                        catchingFishAdMobXMLLayout.CatchingFishLayout = ((LinearLayout.LayoutParams) catchingFishWidgetDataStore7).leftMargin + i61 + ((LinearLayout.LayoutParams) catchingFishWidgetDataStore7).rightMargin + catchingFishAdMobXMLLayout.CatchingFishLayout;
                    } else {
                        int i77 = catchingFishAdMobXMLLayout.CatchingFishLayout;
                        catchingFishAdMobXMLLayout.CatchingFishLayout = Math.max(i77, i77 + i61 + ((LinearLayout.LayoutParams) catchingFishWidgetDataStore7).leftMargin + ((LinearLayout.LayoutParams) catchingFishWidgetDataStore7).rightMargin);
                    }
                }
            }
        }
        int paddingRight = catchingFishAdMobXMLLayout.getPaddingRight() + catchingFishAdMobXMLLayout.getPaddingLeft() + catchingFishAdMobXMLLayout.CatchingFishLayout;
        catchingFishAdMobXMLLayout.CatchingFishLayout = paddingRight;
        int resolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingRight, catchingFishAdMobXMLLayout.getSuggestedMinimumWidth()), i56, 0);
        int i78 = (resolveSizeAndState2 & 16777215) - catchingFishAdMobXMLLayout.CatchingFishLayout;
        if (z21 || (i78 != 0 && f5 > 0.0f)) {
            float f7 = catchingFishAdMobXMLLayout.CatchingFishFragmentHandler;
            if (f7 > 0.0f) {
                f5 = f7;
            }
            iArr5[3] = -1;
            iArr5[c3] = -1;
            iArr5[1] = -1;
            iArr5[0] = -1;
            iArr6[3] = -1;
            iArr6[c3] = -1;
            iArr6[1] = -1;
            iArr6[0] = -1;
            catchingFishAdMobXMLLayout.CatchingFishLayout = 0;
            max3 = -1;
            int i79 = 0;
            while (i79 < virtualChildCount2) {
                View childAt8 = catchingFishAdMobXMLLayout.getChildAt(i79);
                if (childAt8 == null || childAt8.getVisibility() == 8) {
                    i7 = resolveSizeAndState2;
                } else {
                    CatchingFishWidgetDataStore catchingFishWidgetDataStore8 = (CatchingFishWidgetDataStore) childAt8.getLayoutParams();
                    float f8 = ((LinearLayout.LayoutParams) catchingFishWidgetDataStore8).weight;
                    if (f8 > 0.0f) {
                        int i80 = (int) ((i78 * f8) / f5);
                        f5 -= f8;
                        i78 -= i80;
                        i7 = resolveSizeAndState2;
                        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i2, catchingFishAdMobXMLLayout.getPaddingBottom() + catchingFishAdMobXMLLayout.getPaddingTop() + ((LinearLayout.LayoutParams) catchingFishWidgetDataStore8).topMargin + ((LinearLayout.LayoutParams) catchingFishWidgetDataStore8).bottomMargin, ((LinearLayout.LayoutParams) catchingFishWidgetDataStore8).height);
                        if (((LinearLayout.LayoutParams) catchingFishWidgetDataStore8).width == 0) {
                            i9 = 1073741824;
                            if (mode3 == 1073741824) {
                                if (i80 <= 0) {
                                    i80 = 0;
                                }
                                childAt8.measure(View.MeasureSpec.makeMeasureSpec(i80, 1073741824), childMeasureSpec2);
                                i62 = View.combineMeasuredStates(i62, childAt8.getMeasuredState() & (-16777216));
                            }
                        } else {
                            i9 = 1073741824;
                        }
                        int measuredWidth4 = childAt8.getMeasuredWidth() + i80;
                        if (measuredWidth4 < 0) {
                            measuredWidth4 = 0;
                        }
                        childAt8.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth4, i9), childMeasureSpec2);
                        i62 = View.combineMeasuredStates(i62, childAt8.getMeasuredState() & (-16777216));
                    } else {
                        i7 = resolveSizeAndState2;
                    }
                    if (z18) {
                        catchingFishAdMobXMLLayout.CatchingFishLayout = childAt8.getMeasuredWidth() + ((LinearLayout.LayoutParams) catchingFishWidgetDataStore8).leftMargin + ((LinearLayout.LayoutParams) catchingFishWidgetDataStore8).rightMargin + catchingFishAdMobXMLLayout.CatchingFishLayout;
                    } else {
                        int i81 = catchingFishAdMobXMLLayout.CatchingFishLayout;
                        catchingFishAdMobXMLLayout.CatchingFishLayout = Math.max(i81, childAt8.getMeasuredWidth() + i81 + ((LinearLayout.LayoutParams) catchingFishWidgetDataStore8).leftMargin + ((LinearLayout.LayoutParams) catchingFishWidgetDataStore8).rightMargin);
                    }
                    boolean z25 = mode4 != 1073741824 && ((LinearLayout.LayoutParams) catchingFishWidgetDataStore8).height == -1;
                    int i82 = ((LinearLayout.LayoutParams) catchingFishWidgetDataStore8).topMargin + ((LinearLayout.LayoutParams) catchingFishWidgetDataStore8).bottomMargin;
                    int measuredHeight4 = childAt8.getMeasuredHeight() + i82;
                    max3 = Math.max(max3, measuredHeight4);
                    if (!z25) {
                        i82 = measuredHeight4;
                    }
                    int max4 = Math.max(i73, i82);
                    if (z19) {
                        i8 = -1;
                        if (((LinearLayout.LayoutParams) catchingFishWidgetDataStore8).height == -1) {
                            z = true;
                            if (!z23 && (baseline = childAt8.getBaseline()) != i8) {
                                int i83 = ((LinearLayout.LayoutParams) catchingFishWidgetDataStore8).gravity;
                                if (i83 < 0) {
                                    i83 = catchingFishAdMobXMLLayout.CatchingFishViewModelFAB;
                                }
                                int i84 = (((i83 & 112) >> 4) & (-2)) >> 1;
                                iArr5[i84] = Math.max(iArr5[i84], baseline);
                                iArr6[i84] = Math.max(iArr6[i84], measuredHeight4 - baseline);
                            }
                            z19 = z;
                            i73 = max4;
                        }
                    } else {
                        i8 = -1;
                    }
                    z = false;
                    if (!z23) {
                    }
                    z19 = z;
                    i73 = max4;
                }
                i79++;
                resolveSizeAndState2 = i7;
            }
            i3 = resolveSizeAndState2;
            i4 = -16777216;
            catchingFishAdMobXMLLayout.CatchingFishLayout = catchingFishAdMobXMLLayout.getPaddingRight() + catchingFishAdMobXMLLayout.getPaddingLeft() + catchingFishAdMobXMLLayout.CatchingFishLayout;
            int i85 = iArr5[1];
            if (i85 == -1 && iArr5[0] == -1 && iArr5[c3] == -1 && iArr5[3] == -1) {
                i5 = 0;
            } else {
                i5 = 0;
                max3 = Math.max(max3, Math.max(iArr6[3], Math.max(iArr6[0], Math.max(iArr6[1], iArr6[c3]))) + Math.max(iArr5[3], Math.max(iArr5[0], Math.max(i85, iArr5[c3]))));
            }
            i6 = i73;
        } else {
            i6 = Math.max(i73, i74);
            if (z24 && mode3 != 1073741824) {
                for (int i86 = 0; i86 < virtualChildCount2; i86++) {
                    View childAt9 = catchingFishAdMobXMLLayout.getChildAt(i86);
                    if (childAt9 != null && childAt9.getVisibility() != 8 && ((LinearLayout.LayoutParams) ((CatchingFishWidgetDataStore) childAt9.getLayoutParams())).weight > 0.0f) {
                        childAt9.measure(View.MeasureSpec.makeMeasureSpec(i61, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt9.getMeasuredHeight(), 1073741824));
                    }
                }
            }
            i3 = resolveSizeAndState2;
            i4 = -16777216;
            i5 = 0;
        }
        if (!z19 && mode4 != 1073741824) {
            max3 = i6;
        }
        catchingFishAdMobXMLLayout.setMeasuredDimension(i3 | (i62 & i4), View.resolveSizeAndState(Math.max(catchingFishAdMobXMLLayout.getPaddingBottom() + catchingFishAdMobXMLLayout.getPaddingTop() + max3, catchingFishAdMobXMLLayout.getSuggestedMinimumHeight()), i2, i62 << 16));
        if (z20) {
            int makeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(catchingFishAdMobXMLLayout.getMeasuredHeight(), 1073741824);
            int i87 = i5;
            while (i87 < virtualChildCount2) {
                View childAt10 = catchingFishAdMobXMLLayout.getChildAt(i87);
                if (childAt10.getVisibility() != 8) {
                    CatchingFishWidgetDataStore catchingFishWidgetDataStore9 = (CatchingFishWidgetDataStore) childAt10.getLayoutParams();
                    if (((LinearLayout.LayoutParams) catchingFishWidgetDataStore9).height == -1) {
                        int i88 = ((LinearLayout.LayoutParams) catchingFishWidgetDataStore9).width;
                        ((LinearLayout.LayoutParams) catchingFishWidgetDataStore9).width = childAt10.getMeasuredWidth();
                        catchingFishAdMobXMLLayout.measureChildWithMargins(childAt10, i56, 0, makeMeasureSpec3, 0);
                        ((LinearLayout.LayoutParams) catchingFishWidgetDataStore9).width = i88;
                    }
                }
                i87++;
                catchingFishAdMobXMLLayout = this;
                i56 = i;
            }
        }
    }

    public void setBaselineAligned(boolean z) {
        this.CatchingFishReduxKtor = z;
    }

    public void setBaselineAlignedChildIndex(int i) {
        if (i >= 0 && i < getChildCount()) {
            this.CatchingFishDaggerWebsocket = i;
            return;
        }
        throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable == this.CatchingFishUnitTesting) {
            return;
        }
        this.CatchingFishUnitTesting = drawable;
        if (drawable != null) {
            this.CatchingFishAnimationMockk = drawable.getIntrinsicWidth();
            this.CatchingFishStateLiveData = drawable.getIntrinsicHeight();
        } else {
            this.CatchingFishAnimationMockk = 0;
            this.CatchingFishStateLiveData = 0;
        }
        setWillNotDraw(drawable == null);
        requestLayout();
    }

    public void setDividerPadding(int i) {
        this.CatchingFishNavigation = i;
    }

    public void setGravity(int i) {
        if (this.CatchingFishViewModelFAB != i) {
            if ((8388615 & i) == 0) {
                i |= 8388611;
            }
            if ((i & 112) == 0) {
                i |= 48;
            }
            this.CatchingFishViewModelFAB = i;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i) {
        int i2 = i & 8388615;
        int i3 = this.CatchingFishViewModelFAB;
        if ((8388615 & i3) != i2) {
            this.CatchingFishViewModelFAB = i2 | ((-8388616) & i3);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z) {
        this.CatchingFishCloudMessaging = z;
    }

    public void setOrientation(int i) {
        if (this.CatchingFishViewModelScope != i) {
            this.CatchingFishViewModelScope = i;
            requestLayout();
        }
    }

    public void setShowDividers(int i) {
        if (i != this.CatchingFishRoomDatabase) {
            requestLayout();
        }
        this.CatchingFishRoomDatabase = i;
    }

    public void setVerticalGravity(int i) {
        int i2 = i & 112;
        int i3 = this.CatchingFishViewModelFAB;
        if ((i3 & 112) != i2) {
            this.CatchingFishViewModelFAB = i2 | (i3 & (-113));
            requestLayout();
        }
    }

    public void setWeightSum(float f) {
        this.CatchingFishFragmentHandler = Math.max(0.0f, f);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
