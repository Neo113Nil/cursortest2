package androidx.core.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import androidx.camera.camera2.compat.Api35Compat;
import androidx.camera.video.Recorder;
import androidx.camera.view.PreviewView;
import androidx.core.view.DifferentialMotionFlingController;
import androidx.core.view.MotionEventCompat;
import androidx.core.view.NestedScrollingChild;
import androidx.core.view.NestedScrollingChildHelper;
import androidx.core.view.NestedScrollingParent3;
import androidx.core.view.NestedScrollingParentHelper;
import androidx.core.view.ScrollFeedbackProviderCompat$ScrollFeedbackProviderImpl;
import androidx.core.view.ScrollingView;
import androidx.core.view.ViewCompat;
import androidx.core.widget.EdgeEffectCompat;
import androidx.fragment.app.FragmentState;
import androidx.recyclerview.widget.RecyclerView;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.material.textfield.TextInputLayout;
import com.plaid.internal.EnumC0170g;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes3.dex */
public class NestedScrollView extends FrameLayout implements NestedScrollingParent3, NestedScrollingChild, ScrollingView {
    public int mActivePointerId;
    public final NestedScrollingChildHelper mChildHelper;
    public View mChildToScrollTo;
    public final DifferentialMotionFlingController mDifferentialMotionFlingController;
    public final EdgeEffect mEdgeGlowBottom;
    public final EdgeEffect mEdgeGlowTop;
    public boolean mFillViewport;
    public boolean mIsBeingDragged;
    public boolean mIsLaidOut;
    public boolean mIsLayoutDirty;
    public int mLastMotionY;
    public long mLastScroll;
    public int mLastScrollerY;
    public final int mMaximumVelocity;
    public final int mMinimumVelocity;
    public int mNestedYOffset;
    public OnScrollChangeListener mOnScrollChangeListener;
    public final NestedScrollingParentHelper mParentHelper;
    public final float mPhysicalCoeff;
    public SavedState mSavedState;
    public final int[] mScrollConsumed;
    public PreviewView.AnonymousClass1 mScrollFeedbackProvider;
    public final int[] mScrollOffset;
    public final OverScroller mScroller;
    public boolean mSmoothScrollingEnabled;
    public final Rect mTempRect;
    public final int mTouchSlop;
    public VelocityTracker mVelocityTracker;
    public float mVerticalScrollFactor;
    public static final float DECELERATION_RATE = (float) (Math.log(0.78d) / Math.log(0.9d));
    public static final TextInputLayout.AnonymousClass2 ACCESSIBILITY_DELEGATE = new TextInputLayout.AnonymousClass2(1);
    public static final int[] SCROLLVIEW_STYLEABLE = {R.attr.fillViewport};

    public interface OnScrollChangeListener {
        void onScrollChange(NestedScrollView nestedScrollView, int i);
    }

    public final class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new FragmentState.AnonymousClass1(15);
        public int scrollPosition;

        public final String toString() {
            StringBuilder sb = new StringBuilder("HorizontalScrollView.SavedState{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" scrollPosition=");
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.scrollPosition, "}", sb);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.scrollPosition);
        }
    }

    public NestedScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mTempRect = new Rect();
        this.mIsLayoutDirty = true;
        this.mIsLaidOut = false;
        this.mChildToScrollTo = null;
        this.mIsBeingDragged = false;
        this.mSmoothScrollingEnabled = true;
        this.mActivePointerId = -1;
        this.mScrollOffset = new int[2];
        this.mScrollConsumed = new int[2];
        this.mDifferentialMotionFlingController = new DifferentialMotionFlingController(getContext(), new Recorder.AnonymousClass6(this, 21));
        int i2 = Build.VERSION.SDK_INT;
        this.mEdgeGlowTop = i2 >= 31 ? EdgeEffectCompat.Api31Impl.create(context, attributeSet) : new EdgeEffect(context);
        this.mEdgeGlowBottom = i2 >= 31 ? EdgeEffectCompat.Api31Impl.create(context, attributeSet) : new EdgeEffect(context);
        this.mPhysicalCoeff = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        this.mScroller = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(PKIFailureInfo.transactionIdInUse);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.mTouchSlop = viewConfiguration.getScaledTouchSlop();
        this.mMinimumVelocity = viewConfiguration.getScaledMinimumFlingVelocity();
        this.mMaximumVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, SCROLLVIEW_STYLEABLE, i, 0);
        setFillViewport(obtainStyledAttributes.getBoolean(0, false));
        obtainStyledAttributes.recycle();
        this.mParentHelper = new NestedScrollingParentHelper();
        this.mChildHelper = new NestedScrollingChildHelper(this);
        setNestedScrollingEnabled(true);
        ViewCompat.setAccessibilityDelegate(this, ACCESSIBILITY_DELEGATE);
    }

    public static boolean isViewDescendantOf(View view, NestedScrollView nestedScrollView) {
        if (view == nestedScrollView) {
            return true;
        }
        Object parent = view.getParent();
        return (parent instanceof ViewGroup) && isViewDescendantOf((View) parent, nestedScrollView);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        if (getChildCount() <= 0) {
            super.addView(view);
        } else {
            a$$ExternalSyntheticBUOutline0.m$1("ScrollView can host only one direct child");
        }
    }

    public final boolean arrowScroll(int i) {
        View findFocus = findFocus();
        if (findFocus == this) {
            findFocus = null;
        }
        View view = findFocus;
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, view, i);
        int height = (int) (getHeight() * 0.5f);
        if (findNextFocus == null || !isWithinDeltaOfScreen(findNextFocus, height, getHeight())) {
            if (i == 33 && getScrollY() < height) {
                height = getScrollY();
            } else if (i == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                height = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getHeight() + getScrollY()) - getPaddingBottom()), height);
            }
            if (height == 0) {
                return false;
            }
            if (i != 130) {
                height = -height;
            }
            scrollBy(height, -1, null, 0, 1, true);
        } else {
            Rect rect = this.mTempRect;
            findNextFocus.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(findNextFocus, rect);
            scrollBy(computeScrollDeltaToGetChildRectOnScreen(rect), -1, null, 0, 1, true);
            findNextFocus.requestFocus(i);
        }
        if (view != null && view.isFocused() && !isWithinDeltaOfScreen(view, 0, getHeight())) {
            int descendantFocusability = getDescendantFocusability();
            setDescendantFocusability(PKIFailureInfo.unsupportedVersion);
            requestFocus();
            setDescendantFocusability(descendantFocusability);
        }
        return true;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ef  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void computeScroll() {
        int round;
        int i;
        OverScroller overScroller = this.mScroller;
        if (overScroller.isFinished()) {
            return;
        }
        overScroller.computeScrollOffset();
        int currY = overScroller.getCurrY();
        int i2 = currY - this.mLastScrollerY;
        int height = getHeight();
        EdgeEffect edgeEffect = this.mEdgeGlowTop;
        EdgeEffect edgeEffect2 = this.mEdgeGlowBottom;
        if (i2 <= 0 || EdgeEffectCompat.getDistance(edgeEffect) == RecyclerView.DECELERATION_RATE) {
            if (i2 < 0 && EdgeEffectCompat.getDistance(edgeEffect2) != RecyclerView.DECELERATION_RATE) {
                float f = height;
                round = Math.round(EdgeEffectCompat.onPullDistance(edgeEffect2, (i2 * 4.0f) / f, 0.5f) * (f / 4.0f));
                if (round != i2) {
                    edgeEffect2.finish();
                }
            }
            int i3 = i2;
            this.mLastScrollerY = currY;
            int[] iArr = this.mScrollConsumed;
            iArr[1] = 0;
            this.mChildHelper.dispatchNestedPreScroll(0, iArr, i3, 1, null);
            i = i3 - iArr[1];
            int scrollRange = getScrollRange();
            if (Build.VERSION.SDK_INT >= 35) {
                Api35Compat.setFrameContentVelocity(this, Math.abs(overScroller.getCurrVelocity()));
            }
            if (i != 0) {
                int scrollY = getScrollY();
                overScrollByCompat(i, getScrollX(), scrollY, scrollRange);
                int scrollY2 = getScrollY() - scrollY;
                int i4 = i - scrollY2;
                iArr[1] = 0;
                this.mChildHelper.dispatchNestedScrollInternal(0, this.mScrollOffset, scrollY2, 0, i4, iArr, 1);
                i = i4 - iArr[1];
            }
            if (i != 0) {
                int overScrollMode = getOverScrollMode();
                if (overScrollMode == 0 || (overScrollMode == 1 && scrollRange > 0)) {
                    if (i < 0) {
                        if (edgeEffect.isFinished()) {
                            edgeEffect.onAbsorb((int) overScroller.getCurrVelocity());
                        }
                    } else if (edgeEffect2.isFinished()) {
                        edgeEffect2.onAbsorb((int) overScroller.getCurrVelocity());
                    }
                }
                overScroller.abortAnimation();
                stopNestedScroll(1);
            }
            if (overScroller.isFinished()) {
                postInvalidateOnAnimation();
                return;
            } else {
                stopNestedScroll(1);
                return;
            }
        }
        round = Math.round(EdgeEffectCompat.onPullDistance(edgeEffect, ((-i2) * 4.0f) / height, 0.5f) * ((-height) / 4.0f));
        if (round != i2) {
            edgeEffect.finish();
        }
        i2 -= round;
        int i32 = i2;
        this.mLastScrollerY = currY;
        int[] iArr2 = this.mScrollConsumed;
        iArr2[1] = 0;
        this.mChildHelper.dispatchNestedPreScroll(0, iArr2, i32, 1, null);
        i = i32 - iArr2[1];
        int scrollRange2 = getScrollRange();
        if (Build.VERSION.SDK_INT >= 35) {
        }
        if (i != 0) {
        }
        if (i != 0) {
        }
        if (overScroller.isFinished()) {
        }
    }

    public final int computeScrollDeltaToGetChildRectOnScreen(Rect rect) {
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int i2 = rect.bottom < (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin ? i - verticalFadingEdgeLength : i;
        int i3 = rect.bottom;
        if (i3 > i2 && rect.top > scrollY) {
            return Math.min(rect.height() > height ? rect.top - scrollY : rect.bottom - i2, (childAt.getBottom() + layoutParams.bottomMargin) - i);
        }
        if (rect.top >= scrollY || i3 >= i2) {
            return 0;
        }
        return Math.max(rect.height() > height ? 0 - (i2 - rect.bottom) : 0 - (scrollY - rect.top), -getScrollY());
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int max = Math.max(0, bottom - height);
        return scrollY < 0 ? bottom - scrollY : scrollY > max ? (scrollY - max) + bottom : bottom;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || executeKeyEvent(keyEvent);
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.mChildHelper.dispatchNestedFling(f, f2, z);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f, float f2) {
        return this.mChildHelper.dispatchNestedPreFling(f, f2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return this.mChildHelper.dispatchNestedPreScroll(i, iArr, i2, 0, iArr2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.mChildHelper.dispatchNestedScrollInternal(i, iArr, i2, i3, i4, null, 0);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i;
        super.draw(canvas);
        int scrollY = getScrollY();
        EdgeEffect edgeEffect = this.mEdgeGlowTop;
        int i2 = 0;
        if (!edgeEffect.isFinished()) {
            int save = canvas.save();
            int width = getWidth();
            int height = getHeight();
            int min = Math.min(0, scrollY);
            if (getClipToPadding()) {
                width -= getPaddingRight() + getPaddingLeft();
                i = getPaddingLeft();
                height -= getPaddingBottom() + getPaddingTop();
                min += getPaddingTop();
            } else {
                i = 0;
            }
            canvas.translate(i, min);
            edgeEffect.setSize(width, height);
            if (edgeEffect.draw(canvas)) {
                postInvalidateOnAnimation();
            }
            canvas.restoreToCount(save);
        }
        EdgeEffect edgeEffect2 = this.mEdgeGlowBottom;
        if (edgeEffect2.isFinished()) {
            return;
        }
        int save2 = canvas.save();
        int width2 = getWidth();
        int height2 = getHeight();
        int max = Math.max(getScrollRange(), scrollY) + height2;
        if (getClipToPadding()) {
            width2 -= getPaddingRight() + getPaddingLeft();
            i2 = getPaddingLeft();
        }
        if (getClipToPadding()) {
            height2 -= getPaddingBottom() + getPaddingTop();
            max -= getPaddingBottom();
        }
        canvas.translate(i2 - width2, max);
        canvas.rotate(180.0f, width2, RecyclerView.DECELERATION_RATE);
        edgeEffect2.setSize(width2, height2);
        if (edgeEffect2.draw(canvas)) {
            postInvalidateOnAnimation();
        }
        canvas.restoreToCount(save2);
    }

    public final boolean executeKeyEvent(KeyEvent keyEvent) {
        this.mTempRect.setEmpty();
        int childCount = getChildCount();
        int i = EnumC0170g.SDK_ASSET_ILLUSTRATION_CONSUMER_VALUE;
        if (childCount > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            if (childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin > (getHeight() - getPaddingTop()) - getPaddingBottom()) {
                if (keyEvent.getAction() == 0) {
                    int keyCode = keyEvent.getKeyCode();
                    if (keyCode == 19) {
                        return keyEvent.isAltPressed() ? fullScroll(33) : arrowScroll(33);
                    }
                    if (keyCode == 20) {
                        return keyEvent.isAltPressed() ? fullScroll(EnumC0170g.SDK_ASSET_ILLUSTRATION_CONSUMER_VALUE) : arrowScroll(EnumC0170g.SDK_ASSET_ILLUSTRATION_CONSUMER_VALUE);
                    }
                    if (keyCode == 62) {
                        if (keyEvent.isShiftPressed()) {
                            i = 33;
                        }
                        pageScroll(i);
                        return false;
                    }
                    if (keyCode == 92) {
                        return fullScroll(33);
                    }
                    if (keyCode == 93) {
                        return fullScroll(EnumC0170g.SDK_ASSET_ILLUSTRATION_CONSUMER_VALUE);
                    }
                    if (keyCode == 122) {
                        pageScroll(33);
                        return false;
                    }
                    if (keyCode == 123) {
                        pageScroll(EnumC0170g.SDK_ASSET_ILLUSTRATION_CONSUMER_VALUE);
                        return false;
                    }
                }
                return false;
            }
        }
        if (isFocused() && keyEvent.getKeyCode() != 4) {
            View findFocus = findFocus();
            if (findFocus == this) {
                findFocus = null;
            }
            View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, EnumC0170g.SDK_ASSET_ILLUSTRATION_CONSUMER_VALUE);
            if (findNextFocus != null && findNextFocus != this && findNextFocus.requestFocus(EnumC0170g.SDK_ASSET_ILLUSTRATION_CONSUMER_VALUE)) {
                return true;
            }
        }
        return false;
    }

    public final void fling(int i) {
        if (getChildCount() > 0) {
            this.mScroller.fling(getScrollX(), getScrollY(), 0, i, 0, 0, PKIFailureInfo.systemUnavail, Integer.MAX_VALUE, 0, 0);
            this.mChildHelper.startNestedScroll(2, 1);
            this.mLastScrollerY = getScrollY();
            postInvalidateOnAnimation();
            if (Build.VERSION.SDK_INT >= 35) {
                Api35Compat.setFrameContentVelocity(this, Math.abs(this.mScroller.getCurrVelocity()));
            }
        }
    }

    public final boolean fullScroll(int i) {
        int childCount;
        boolean z = i == 130;
        int height = getHeight();
        Rect rect = this.mTempRect;
        rect.top = 0;
        rect.bottom = height;
        if (z && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            int paddingBottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
            rect.bottom = paddingBottom;
            rect.top = paddingBottom - height;
        }
        return scrollAndFocus(i, rect.top, rect.bottom);
    }

    @Override // android.view.View
    public final float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return RecyclerView.DECELERATION_RATE;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + layoutParams.bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return bottom / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    @Override // android.view.ViewGroup
    public final int getNestedScrollAxes() {
        return this.mParentHelper.getNestedScrollAxes();
    }

    public final int getScrollRange() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    @Override // android.view.View
    public final float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return RecyclerView.DECELERATION_RATE;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return scrollY / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public final float getVerticalScrollFactorCompat() {
        if (this.mVerticalScrollFactor == RecyclerView.DECELERATION_RATE) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (!context.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true)) {
                a$$ExternalSyntheticBUOutline0.m$1("Expected theme to define listPreferredItemHeight.");
                return RecyclerView.DECELERATION_RATE;
            }
            this.mVerticalScrollFactor = typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return this.mVerticalScrollFactor;
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return this.mChildHelper.hasNestedScrollingParent(0);
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.mChildHelper.mIsNestedScrollingEnabled;
    }

    public final boolean isWithinDeltaOfScreen(View view, int i, int i2) {
        Rect rect = this.mTempRect;
        view.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(view, rect);
        return rect.bottom + i >= getScrollY() && rect.top - i <= getScrollY() + i2;
    }

    @Override // android.view.ViewGroup
    public final void measureChild(View view, int i, int i2) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft(), layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override // android.view.ViewGroup
    public final void measureChildWithMargins(View view, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.mIsLaidOut = false;
    }

    @Override // android.view.View
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        int i;
        int i2;
        float f;
        if (motionEvent.getAction() == 8 && !this.mIsBeingDragged) {
            if (MotionEventCompat.isFromSource(motionEvent, 2)) {
                f = motionEvent.getAxisValue(9);
                i = 9;
                i2 = (int) motionEvent.getX();
            } else if (MotionEventCompat.isFromSource(motionEvent, 4194304)) {
                float axisValue = motionEvent.getAxisValue(26);
                i2 = getWidth() / 2;
                i = 26;
                f = axisValue;
            } else {
                i = 0;
                i2 = 0;
                f = 0.0f;
            }
            if (f != RecyclerView.DECELERATION_RATE) {
                scrollBy(-((int) (getVerticalScrollFactorCompat() * f)), i, motionEvent, i2, 1, MotionEventCompat.isFromSource(motionEvent, 8194));
                if (i == 0) {
                    return true;
                }
                this.mDifferentialMotionFlingController.onMotionEvent(motionEvent, i);
                return true;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        boolean z = true;
        if (action == 2 && this.mIsBeingDragged) {
            return true;
        }
        int i = action & 255;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    int i2 = this.mActivePointerId;
                    if (i2 != -1) {
                        int findPointerIndex = motionEvent.findPointerIndex(i2);
                        if (findPointerIndex == -1) {
                            Log.e("NestedScrollView", "Invalid pointerId=" + i2 + " in onInterceptTouchEvent");
                        } else {
                            int y = (int) motionEvent.getY(findPointerIndex);
                            if (Math.abs(y - this.mLastMotionY) > this.mTouchSlop && (2 & this.mParentHelper.getNestedScrollAxes()) == 0) {
                                this.mIsBeingDragged = true;
                                this.mLastMotionY = y;
                                if (this.mVelocityTracker == null) {
                                    this.mVelocityTracker = VelocityTracker.obtain();
                                }
                                this.mVelocityTracker.addMovement(motionEvent);
                                this.mNestedYOffset = 0;
                                ViewParent parent = getParent();
                                if (parent != null) {
                                    parent.requestDisallowInterceptTouchEvent(true);
                                }
                            }
                        }
                    }
                } else if (i != 3) {
                    if (i == 6) {
                        onSecondaryPointerUp(motionEvent);
                    }
                }
            }
            this.mIsBeingDragged = false;
            this.mActivePointerId = -1;
            VelocityTracker velocityTracker = this.mVelocityTracker;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.mVelocityTracker = null;
            }
            if (this.mScroller.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                postInvalidateOnAnimation();
            }
            stopNestedScroll(0);
        } else {
            int y2 = (int) motionEvent.getY();
            int x = (int) motionEvent.getX();
            int childCount = getChildCount();
            OverScroller overScroller = this.mScroller;
            if (childCount > 0) {
                int scrollY = getScrollY();
                View childAt = getChildAt(0);
                if (y2 >= childAt.getTop() - scrollY && y2 < childAt.getBottom() - scrollY && x >= childAt.getLeft() && x < childAt.getRight()) {
                    this.mLastMotionY = y2;
                    this.mActivePointerId = motionEvent.getPointerId(0);
                    VelocityTracker velocityTracker2 = this.mVelocityTracker;
                    if (velocityTracker2 == null) {
                        this.mVelocityTracker = VelocityTracker.obtain();
                    } else {
                        velocityTracker2.clear();
                    }
                    this.mVelocityTracker.addMovement(motionEvent);
                    overScroller.computeScrollOffset();
                    if (!stopGlowAnimations(motionEvent) && overScroller.isFinished()) {
                        z = false;
                    }
                    this.mIsBeingDragged = z;
                    this.mChildHelper.startNestedScroll(2, 0);
                }
            }
            if (!stopGlowAnimations(motionEvent) && overScroller.isFinished()) {
                z = false;
            }
            this.mIsBeingDragged = z;
            VelocityTracker velocityTracker3 = this.mVelocityTracker;
            if (velocityTracker3 != null) {
                velocityTracker3.recycle();
                this.mVelocityTracker = null;
            }
        }
        return this.mIsBeingDragged;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        super.onLayout(z, i, i2, i3, i4);
        int i6 = 0;
        this.mIsLayoutDirty = false;
        View view = this.mChildToScrollTo;
        if (view != null && isViewDescendantOf(view, this)) {
            View view2 = this.mChildToScrollTo;
            Rect rect = this.mTempRect;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int computeScrollDeltaToGetChildRectOnScreen = computeScrollDeltaToGetChildRectOnScreen(rect);
            if (computeScrollDeltaToGetChildRectOnScreen != 0) {
                scrollBy(0, computeScrollDeltaToGetChildRectOnScreen);
            }
        }
        this.mChildToScrollTo = null;
        if (!this.mIsLaidOut) {
            if (this.mSavedState != null) {
                scrollTo(getScrollX(), this.mSavedState.scrollPosition);
                this.mSavedState = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                i5 = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            } else {
                i5 = 0;
            }
            int paddingTop = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            if (paddingTop < i5 && scrollY >= 0) {
                i6 = paddingTop + scrollY > i5 ? i5 - paddingTop : scrollY;
            }
            if (i6 != scrollY) {
                scrollTo(getScrollX(), i6);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.mIsLaidOut = true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.mFillViewport && View.MeasureSpec.getMode(i2) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (z) {
            return false;
        }
        dispatchNestedFling(RecyclerView.DECELERATION_RATE, f2, true);
        fling((int) f2);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public boolean onNestedPreFling(View view, float f, float f2) {
        return this.mChildHelper.dispatchNestedPreFling(f, f2);
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr, int i3) {
        this.mChildHelper.dispatchNestedPreScroll(i, iArr, i2, i3, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        onNestedScrollInternal(i4, 0, null);
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public final void onNestedScrollAccepted(View view, View view2, int i, int i2) {
        NestedScrollingParentHelper nestedScrollingParentHelper = this.mParentHelper;
        if (i2 == 1) {
            nestedScrollingParentHelper.mNestedScrollAxesNonTouch = i;
        } else {
            nestedScrollingParentHelper.mNestedScrollAxesTouch = i;
        }
        this.mChildHelper.startNestedScroll(2, i2);
    }

    public final void onNestedScrollInternal(int i, int i2, int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.mChildHelper.dispatchNestedScrollInternal(0, null, scrollY2, 0, i - scrollY2, iArr, i2);
    }

    @Override // android.view.View
    public final void onOverScrolled(int i, int i2, boolean z, boolean z2) {
        super.scrollTo(i, i2);
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (i == 2) {
            i = EnumC0170g.SDK_ASSET_ILLUSTRATION_CONSUMER_VALUE;
        } else if (i == 1) {
            i = 33;
        }
        View findNextFocus = rect == null ? FocusFinder.getInstance().findNextFocus(this, null, i) : FocusFinder.getInstance().findNextFocusFromRect(this, rect, i);
        if (findNextFocus != null && isWithinDeltaOfScreen(findNextFocus, 0, getHeight())) {
            return findNextFocus.requestFocus(i, rect);
        }
        return false;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.mSavedState = savedState;
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.scrollPosition = getScrollY();
        return savedState;
    }

    @Override // android.view.View
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        OnScrollChangeListener onScrollChangeListener = this.mOnScrollChangeListener;
        if (onScrollChangeListener != null) {
            onScrollChangeListener.onScrollChange(this, i2);
        }
    }

    public final void onSecondaryPointerUp(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.mActivePointerId) {
            int i = actionIndex == 0 ? 1 : 0;
            this.mLastMotionY = (int) motionEvent.getY(i);
            this.mActivePointerId = motionEvent.getPointerId(i);
            VelocityTracker velocityTracker = this.mVelocityTracker;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        View findFocus = findFocus();
        if (findFocus == null || this == findFocus || !isWithinDeltaOfScreen(findFocus, 0, i4)) {
            return;
        }
        Rect rect = this.mTempRect;
        findFocus.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(findFocus, rect);
        int computeScrollDeltaToGetChildRectOnScreen = computeScrollDeltaToGetChildRectOnScreen(rect);
        if (computeScrollDeltaToGetChildRectOnScreen != 0) {
            if (this.mSmoothScrollingEnabled) {
                smoothScrollBy(0, computeScrollDeltaToGetChildRectOnScreen, false);
            } else {
                scrollBy(0, computeScrollDeltaToGetChildRectOnScreen);
            }
        }
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public final boolean onStartNestedScroll(View view, View view2, int i, int i2) {
        return (i & 2) != 0;
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public final void onStopNestedScroll(View view, int i) {
        NestedScrollingParentHelper nestedScrollingParentHelper = this.mParentHelper;
        if (i == 1) {
            nestedScrollingParentHelper.mNestedScrollAxesNonTouch = 0;
        } else {
            nestedScrollingParentHelper.mNestedScrollAxesTouch = 0;
        }
        stopNestedScroll(i);
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0144  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ViewParent parent;
        float onPullDistance;
        int round;
        if (this.mVelocityTracker == null) {
            this.mVelocityTracker = VelocityTracker.obtain();
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.mNestedYOffset = 0;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        float f = this.mNestedYOffset;
        float f2 = RecyclerView.DECELERATION_RATE;
        obtain.offsetLocation(RecyclerView.DECELERATION_RATE, f);
        NestedScrollingChildHelper nestedScrollingChildHelper = this.mChildHelper;
        if (actionMasked != 0) {
            EdgeEffect edgeEffect = this.mEdgeGlowTop;
            EdgeEffect edgeEffect2 = this.mEdgeGlowBottom;
            if (actionMasked == 1) {
                VelocityTracker velocityTracker = this.mVelocityTracker;
                velocityTracker.computeCurrentVelocity(IptcConstants.IMAGE_RESOURCE_BLOCK_PHOTOSHOP2_INFO, this.mMaximumVelocity);
                int yVelocity = (int) velocityTracker.getYVelocity(this.mActivePointerId);
                if (Math.abs(yVelocity) >= this.mMinimumVelocity) {
                    if (EdgeEffectCompat.getDistance(edgeEffect) != RecyclerView.DECELERATION_RATE) {
                        if (shouldAbsorb(edgeEffect, yVelocity)) {
                            edgeEffect.onAbsorb(yVelocity);
                        } else {
                            fling(-yVelocity);
                        }
                    } else if (EdgeEffectCompat.getDistance(edgeEffect2) != RecyclerView.DECELERATION_RATE) {
                        int i = -yVelocity;
                        if (shouldAbsorb(edgeEffect2, i)) {
                            edgeEffect2.onAbsorb(i);
                        } else {
                            fling(i);
                        }
                    } else {
                        int i2 = -yVelocity;
                        float f3 = i2;
                        if (!nestedScrollingChildHelper.dispatchNestedPreFling(RecyclerView.DECELERATION_RATE, f3)) {
                            dispatchNestedFling(RecyclerView.DECELERATION_RATE, f3, true);
                            fling(i2);
                        }
                    }
                } else if (this.mScroller.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    postInvalidateOnAnimation();
                }
                this.mActivePointerId = -1;
                this.mIsBeingDragged = false;
                VelocityTracker velocityTracker2 = this.mVelocityTracker;
                if (velocityTracker2 != null) {
                    velocityTracker2.recycle();
                    this.mVelocityTracker = null;
                }
                stopNestedScroll(0);
                edgeEffect.onRelease();
                edgeEffect2.onRelease();
            } else if (actionMasked == 2) {
                int findPointerIndex = motionEvent.findPointerIndex(this.mActivePointerId);
                if (findPointerIndex == -1) {
                    Log.e("NestedScrollView", "Invalid pointerId=" + this.mActivePointerId + " in onTouchEvent");
                } else {
                    int y = (int) motionEvent.getY(findPointerIndex);
                    int i3 = this.mLastMotionY - y;
                    float x = motionEvent.getX(findPointerIndex) / getWidth();
                    float height = i3 / getHeight();
                    if (EdgeEffectCompat.getDistance(edgeEffect) != RecyclerView.DECELERATION_RATE) {
                        onPullDistance = -EdgeEffectCompat.onPullDistance(edgeEffect, -height, x);
                        if (EdgeEffectCompat.getDistance(edgeEffect) == RecyclerView.DECELERATION_RATE) {
                            edgeEffect.onRelease();
                        }
                    } else {
                        if (EdgeEffectCompat.getDistance(edgeEffect2) != RecyclerView.DECELERATION_RATE) {
                            onPullDistance = EdgeEffectCompat.onPullDistance(edgeEffect2, height, 1.0f - x);
                            if (EdgeEffectCompat.getDistance(edgeEffect2) == RecyclerView.DECELERATION_RATE) {
                                edgeEffect2.onRelease();
                            }
                        }
                        round = Math.round(f2 * getHeight());
                        if (round != 0) {
                            invalidate();
                        }
                        int i4 = i3 - round;
                        if (!this.mIsBeingDragged) {
                            int abs = Math.abs(i4);
                            int i5 = this.mTouchSlop;
                            if (abs > i5) {
                                ViewParent parent2 = getParent();
                                if (parent2 != null) {
                                    parent2.requestDisallowInterceptTouchEvent(true);
                                }
                                this.mIsBeingDragged = true;
                                i4 = i4 > 0 ? i4 - i5 : i4 + i5;
                            }
                        }
                        if (this.mIsBeingDragged) {
                            int scrollBy = scrollBy(i4, 1, motionEvent, (int) motionEvent.getX(findPointerIndex), 0, false);
                            this.mLastMotionY = y - scrollBy;
                            this.mNestedYOffset += scrollBy;
                        }
                    }
                    f2 = onPullDistance;
                    round = Math.round(f2 * getHeight());
                    if (round != 0) {
                    }
                    int i42 = i3 - round;
                    if (!this.mIsBeingDragged) {
                    }
                    if (this.mIsBeingDragged) {
                    }
                }
            } else if (actionMasked == 3) {
                if (this.mIsBeingDragged && getChildCount() > 0) {
                    if (this.mScroller.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                        postInvalidateOnAnimation();
                    }
                }
                this.mActivePointerId = -1;
                this.mIsBeingDragged = false;
                VelocityTracker velocityTracker3 = this.mVelocityTracker;
                if (velocityTracker3 != null) {
                    velocityTracker3.recycle();
                    this.mVelocityTracker = null;
                }
                stopNestedScroll(0);
                edgeEffect.onRelease();
                edgeEffect2.onRelease();
            } else if (actionMasked == 5) {
                int actionIndex = motionEvent.getActionIndex();
                this.mLastMotionY = (int) motionEvent.getY(actionIndex);
                this.mActivePointerId = motionEvent.getPointerId(actionIndex);
            } else if (actionMasked == 6) {
                onSecondaryPointerUp(motionEvent);
                this.mLastMotionY = (int) motionEvent.getY(motionEvent.findPointerIndex(this.mActivePointerId));
            }
        } else {
            if (getChildCount() == 0) {
                return false;
            }
            if (this.mIsBeingDragged && (parent = getParent()) != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            OverScroller overScroller = this.mScroller;
            if (!overScroller.isFinished()) {
                overScroller.abortAnimation();
                stopNestedScroll(1);
            }
            int y2 = (int) motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            this.mLastMotionY = y2;
            this.mActivePointerId = pointerId;
            nestedScrollingChildHelper.startNestedScroll(2, 0);
        }
        VelocityTracker velocityTracker4 = this.mVelocityTracker;
        if (velocityTracker4 != null) {
            velocityTracker4.addMovement(obtain);
        }
        obtain.recycle();
        return true;
    }

    public final boolean overScrollByCompat(int i, int i2, int i3, int i4) {
        int i5;
        boolean z;
        int i6;
        boolean z2;
        getOverScrollMode();
        super.computeHorizontalScrollRange();
        super.computeHorizontalScrollExtent();
        computeVerticalScrollRange();
        super.computeVerticalScrollExtent();
        int i7 = i3 + i;
        if (i2 <= 0 && i2 >= 0) {
            i5 = i2;
            z = false;
        } else {
            i5 = 0;
            z = true;
        }
        if (i7 > i4) {
            i6 = i4;
        } else {
            if (i7 >= 0) {
                i6 = i7;
                z2 = false;
                if (z2 && !this.mChildHelper.hasNestedScrollingParent(1)) {
                    this.mScroller.springBack(i5, i6, 0, 0, 0, getScrollRange());
                }
                super.scrollTo(i5, i6);
                return !z || z2;
            }
            i6 = 0;
        }
        z2 = true;
        if (z2) {
            this.mScroller.springBack(i5, i6, 0, 0, 0, getScrollRange());
        }
        super.scrollTo(i5, i6);
        if (z) {
        }
    }

    public final void pageScroll(int i) {
        boolean z = i == 130;
        int height = getHeight();
        Rect rect = this.mTempRect;
        if (z) {
            rect.top = getScrollY() + height;
            int childCount = getChildCount();
            if (childCount > 0) {
                View childAt = getChildAt(childCount - 1);
                int paddingBottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
                if (rect.top + height > paddingBottom) {
                    rect.top = paddingBottom - height;
                }
            }
        } else {
            int scrollY = getScrollY() - height;
            rect.top = scrollY;
            if (scrollY < 0) {
                rect.top = 0;
            }
        }
        int i2 = rect.top;
        int i3 = height + i2;
        rect.bottom = i3;
        scrollAndFocus(i, i2, i3);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        if (this.mIsLayoutDirty) {
            this.mChildToScrollTo = view2;
        } else {
            Rect rect = this.mTempRect;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int computeScrollDeltaToGetChildRectOnScreen = computeScrollDeltaToGetChildRectOnScreen(rect);
            if (computeScrollDeltaToGetChildRectOnScreen != 0) {
                scrollBy(0, computeScrollDeltaToGetChildRectOnScreen);
            }
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        int computeScrollDeltaToGetChildRectOnScreen = computeScrollDeltaToGetChildRectOnScreen(rect);
        boolean z2 = computeScrollDeltaToGetChildRectOnScreen != 0;
        if (z2) {
            if (z) {
                scrollBy(0, computeScrollDeltaToGetChildRectOnScreen);
                return z2;
            }
            smoothScrollBy(0, computeScrollDeltaToGetChildRectOnScreen, false);
        }
        return z2;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        VelocityTracker velocityTracker;
        if (z && (velocityTracker = this.mVelocityTracker) != null) {
            velocityTracker.recycle();
            this.mVelocityTracker = null;
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        this.mIsLayoutDirty = true;
        super.requestLayout();
    }

    public final boolean scrollAndFocus(int i, int i2, int i3) {
        boolean z;
        int height = getHeight();
        int scrollY = getScrollY();
        int i4 = height + scrollY;
        boolean z2 = i == 33;
        ArrayList<View> focusables = getFocusables(2);
        int size = focusables.size();
        View view = null;
        boolean z3 = false;
        for (int i5 = 0; i5 < size; i5++) {
            View view2 = focusables.get(i5);
            int top = view2.getTop();
            int bottom = view2.getBottom();
            if (i2 < bottom && top < i3) {
                boolean z4 = i2 < top && bottom < i3;
                if (view == null) {
                    view = view2;
                    z3 = z4;
                } else {
                    boolean z5 = (z2 && top < view.getTop()) || (!z2 && bottom > view.getBottom());
                    if (z3) {
                        if (z4) {
                            if (!z5) {
                            }
                            view = view2;
                        }
                    } else if (z4) {
                        view = view2;
                        z3 = true;
                    } else {
                        if (!z5) {
                        }
                        view = view2;
                    }
                }
            }
        }
        View view3 = view == null ? this : view;
        if (i2 < scrollY || i3 > i4) {
            scrollBy(z2 ? i2 - scrollY : i3 - i4, -1, null, 0, 1, true);
            z = true;
        } else {
            z = false;
        }
        if (view3 != findFocus()) {
            view3.requestFocus(i);
        }
        return z;
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0148  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int scrollBy(int i, int i2, MotionEvent motionEvent, int i3, int i4, boolean z) {
        int i5;
        int i6;
        boolean z2;
        boolean z3;
        VelocityTracker velocityTracker;
        NestedScrollingChildHelper nestedScrollingChildHelper = this.mChildHelper;
        if (i4 == 1) {
            nestedScrollingChildHelper.startNestedScroll(2, i4);
        }
        boolean dispatchNestedPreScroll = this.mChildHelper.dispatchNestedPreScroll(0, this.mScrollConsumed, i, i4, this.mScrollOffset);
        int[] iArr = this.mScrollOffset;
        int[] iArr2 = this.mScrollConsumed;
        if (dispatchNestedPreScroll) {
            i5 = i - iArr2[1];
            i6 = iArr[1];
        } else {
            i5 = i;
            i6 = 0;
        }
        int scrollY = getScrollY();
        int scrollRange = getScrollRange();
        int overScrollMode = getOverScrollMode();
        boolean z4 = (overScrollMode == 0 || (overScrollMode == 1 && getScrollRange() > 0)) && !z;
        boolean z5 = overScrollByCompat(i5, 0, scrollY, scrollRange) && !nestedScrollingChildHelper.hasNestedScrollingParent(i4);
        int scrollY2 = getScrollY() - scrollY;
        if (motionEvent != null && scrollY2 != 0) {
            if (this.mScrollFeedbackProvider == null) {
                this.mScrollFeedbackProvider = new PreviewView.AnonymousClass1(this);
            }
            ((ScrollFeedbackProviderCompat$ScrollFeedbackProviderImpl) this.mScrollFeedbackProvider.this$0).onScrollProgress(motionEvent.getDeviceId(), motionEvent.getSource(), i2, scrollY2);
        }
        iArr2[1] = 0;
        this.mChildHelper.dispatchNestedScrollInternal(0, this.mScrollOffset, scrollY2, 0, i5 - scrollY2, iArr2, i4);
        int i7 = i6 + iArr[1];
        int i8 = i5 - iArr2[1];
        int i9 = scrollY + i8;
        EdgeEffect edgeEffect = this.mEdgeGlowBottom;
        EdgeEffect edgeEffect2 = this.mEdgeGlowTop;
        if (i9 < 0) {
            if (z4) {
                EdgeEffectCompat.onPullDistance(edgeEffect2, (-i8) / getHeight(), i3 / getWidth());
                if (motionEvent != null) {
                    if (this.mScrollFeedbackProvider == null) {
                        this.mScrollFeedbackProvider = new PreviewView.AnonymousClass1(this);
                    }
                    ((ScrollFeedbackProviderCompat$ScrollFeedbackProviderImpl) this.mScrollFeedbackProvider.this$0).onScrollLimit(motionEvent.getDeviceId(), motionEvent.getSource(), true, i2);
                }
                if (!edgeEffect.isFinished()) {
                    edgeEffect.onRelease();
                }
            }
        } else if (i9 > scrollRange && z4) {
            EdgeEffectCompat.onPullDistance(edgeEffect, i8 / getHeight(), 1.0f - (i3 / getWidth()));
            if (motionEvent != null) {
                if (this.mScrollFeedbackProvider == null) {
                    this.mScrollFeedbackProvider = new PreviewView.AnonymousClass1(this);
                }
                z2 = false;
                ((ScrollFeedbackProviderCompat$ScrollFeedbackProviderImpl) this.mScrollFeedbackProvider.this$0).onScrollLimit(motionEvent.getDeviceId(), motionEvent.getSource(), false, i2);
            } else {
                z2 = false;
            }
            if (!edgeEffect2.isFinished()) {
                edgeEffect2.onRelease();
            }
            if (edgeEffect2.isFinished() || !edgeEffect.isFinished()) {
                postInvalidateOnAnimation();
                z3 = z2;
            } else {
                z3 = z5;
            }
            if (z3 && i4 == 0 && (velocityTracker = this.mVelocityTracker) != null) {
                velocityTracker.clear();
            }
            if (i4 == 1) {
                stopNestedScroll(i4);
                edgeEffect2.onRelease();
                edgeEffect.onRelease();
            }
            return i7;
        }
        z2 = false;
        if (edgeEffect2.isFinished()) {
        }
        postInvalidateOnAnimation();
        z3 = z2;
        if (z3) {
            velocityTracker.clear();
        }
        if (i4 == 1) {
        }
        return i7;
    }

    @Override // android.view.View
    public final void scrollTo(int i, int i2) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            int width2 = childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int height2 = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            if (width >= width2 || i < 0) {
                i = 0;
            } else if (width + i > width2) {
                i = width2 - width;
            }
            if (height >= height2 || i2 < 0) {
                i2 = 0;
            } else if (height + i2 > height2) {
                i2 = height2 - height;
            }
            if (i == getScrollX() && i2 == getScrollY()) {
                return;
            }
            super.scrollTo(i, i2);
        }
    }

    public void setFillViewport(boolean z) {
        if (z != this.mFillViewport) {
            this.mFillViewport = z;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        this.mChildHelper.setNestedScrollingEnabled(z);
    }

    public void setOnScrollChangeListener(OnScrollChangeListener onScrollChangeListener) {
        this.mOnScrollChangeListener = onScrollChangeListener;
    }

    public void setSmoothScrollingEnabled(boolean z) {
        this.mSmoothScrollingEnabled = z;
    }

    public final boolean shouldAbsorb(EdgeEffect edgeEffect, int i) {
        if (i > 0) {
            return true;
        }
        float distance = EdgeEffectCompat.getDistance(edgeEffect) * getHeight();
        float abs = Math.abs(-i) * 0.35f;
        float f = this.mPhysicalCoeff * 0.015f;
        double log = Math.log(abs / f);
        double d = DECELERATION_RATE;
        return ((float) (Math.exp((d / (d - 1.0d)) * log) * ((double) f))) < distance;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return true;
    }

    public final void smoothScrollBy(int i, int i2, boolean z) {
        if (getChildCount() == 0) {
            return;
        }
        if (AnimationUtils.currentAnimationTimeMillis() - this.mLastScroll > 250) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int height = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            int max = Math.max(0, Math.min(i2 + scrollY, Math.max(0, height - height2))) - scrollY;
            this.mScroller.startScroll(getScrollX(), scrollY, 0, max, EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ROUTING_NUMBER_SEARCH_VALUE);
            if (z) {
                this.mChildHelper.startNestedScroll(2, 1);
            } else {
                stopNestedScroll(1);
            }
            this.mLastScrollerY = getScrollY();
            postInvalidateOnAnimation();
        } else {
            OverScroller overScroller = this.mScroller;
            if (!overScroller.isFinished()) {
                overScroller.abortAnimation();
                stopNestedScroll(1);
            }
            scrollBy(i, i2);
        }
        this.mLastScroll = AnimationUtils.currentAnimationTimeMillis();
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i) {
        return this.mChildHelper.startNestedScroll(i, 0);
    }

    public final boolean stopGlowAnimations(MotionEvent motionEvent) {
        boolean z;
        EdgeEffect edgeEffect = this.mEdgeGlowTop;
        if (EdgeEffectCompat.getDistance(edgeEffect) != RecyclerView.DECELERATION_RATE) {
            EdgeEffectCompat.onPullDistance(edgeEffect, RecyclerView.DECELERATION_RATE, motionEvent.getX() / getWidth());
            z = true;
        } else {
            z = false;
        }
        EdgeEffect edgeEffect2 = this.mEdgeGlowBottom;
        if (EdgeEffectCompat.getDistance(edgeEffect2) == RecyclerView.DECELERATION_RATE) {
            return z;
        }
        EdgeEffectCompat.onPullDistance(edgeEffect2, RecyclerView.DECELERATION_RATE, 1.0f - (motionEvent.getX() / getWidth()));
        return true;
    }

    public final void stopNestedScroll(int i) {
        this.mChildHelper.stopNestedScroll(i);
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5) {
        onNestedScrollInternal(i4, i5, null);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        stopNestedScroll(0);
    }

    @Override // androidx.core.view.NestedScrollingParent3
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        onNestedScrollInternal(i4, i5, iArr);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        return onStartNestedScroll(view, view2, i, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        onNestedPreScroll(view, i, i2, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        onStopNestedScroll(view, 0);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i) {
        if (getChildCount() <= 0) {
            super.addView(view, i);
        } else {
            a$$ExternalSyntheticBUOutline0.m$1("ScrollView can host only one direct child");
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        onNestedScrollAccepted(view, view2, i, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, layoutParams);
        } else {
            a$$ExternalSyntheticBUOutline0.m$1("ScrollView can host only one direct child");
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i, layoutParams);
        } else {
            a$$ExternalSyntheticBUOutline0.m$1("ScrollView can host only one direct child");
        }
    }

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.squareup.cash.R.attr.nestedScrollViewStyle);
    }

    public NestedScrollView(Context context) {
        this(context, null);
    }
}
