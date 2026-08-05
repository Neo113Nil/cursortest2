package androidx.core.widget;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.InputDevice;
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
import com.kolosta.rejin.jilosa.presentation.ui.PairShelfFragment;
import defpackage.aw;
import defpackage.bw;
import defpackage.cw;
import defpackage.ej0;
import defpackage.ew;
import defpackage.fn;
import defpackage.fw;
import defpackage.g9;
import defpackage.hg0;
import defpackage.hzgxAD8d;
import defpackage.jg0;
import defpackage.le;
import defpackage.m1;
import defpackage.mx;
import defpackage.nf0;
import defpackage.of0;
import defpackage.q90;
import defpackage.sj;
import defpackage.tg0;
import defpackage.wm;
import defpackage.y50;
import defpackage.yc;
import defpackage.yv;
import defpackage.zv;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public class NestedScrollView extends FrameLayout implements ew {
    public final fw DK9slbsy;
    public int Ey6iv0m0;
    public int FySoLYna;
    public final int[] I5GHvsYW;
    public final int KlHjfFWx;
    public long MdtA4re8;
    public final yc Mq3SeTnW;
    public final float NCTxEWno;
    public boolean OnDfzHZD;
    public final int OxcuoDLp;
    public final EdgeEffect P7K7Inc8;
    public y50 Qr9iLBAD;
    public final int[] RXQxj5Oe;
    public float U0LaHZX7;
    public final OverScroller VgvYg0wo;
    public bw WYNAV5pd;
    public final int amk52bBQ;
    public final EdgeEffect b2ZJblxo;
    public boolean eVhOlqcC;
    public int gjV1z5T1;
    public aw i7xS8jrb;
    public int jb9XjC4I;
    public boolean k3x7lurq;
    public boolean lDXGDhIF;
    public final cw lwWCatUu;
    public View ow5vqvCr;
    public boolean sjUBp5pO;
    public final Rect wxUZMvaN;
    public VelocityTracker ygLcUYwZ;
    public static final float euDDoUNr = (float) (Math.log(0.78d) / Math.log(0.9d));
    public static final yv SgZGMMPL = new yv();
    public static final int[] ytu5o6f4 = {R.attr.fillViewport};

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.kolosta.rejin.jilosa.R.attr.nestedScrollViewStyle);
        this.wxUZMvaN = new Rect();
        this.eVhOlqcC = true;
        this.k3x7lurq = false;
        this.ow5vqvCr = null;
        this.OnDfzHZD = false;
        this.sjUBp5pO = true;
        this.Ey6iv0m0 = -1;
        this.I5GHvsYW = new int[2];
        this.RXQxj5Oe = new int[2];
        this.Mq3SeTnW = new yc(getContext(), new tg0(21, this));
        int i = Build.VERSION.SDK_INT;
        this.P7K7Inc8 = i >= 31 ? le.qoPGr6Ce(context, attributeSet) : new EdgeEffect(context);
        this.b2ZJblxo = i >= 31 ? le.qoPGr6Ce(context, attributeSet) : new EdgeEffect(context);
        this.NCTxEWno = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        this.VgvYg0wo = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.OxcuoDLp = viewConfiguration.getScaledTouchSlop();
        this.amk52bBQ = viewConfiguration.getScaledMinimumFlingVelocity();
        this.KlHjfFWx = viewConfiguration.getScaledMaximumFlingVelocity();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ytu5o6f4, com.kolosta.rejin.jilosa.R.attr.nestedScrollViewStyle, 0);
        setFillViewport(obtainStyledAttributes.getBoolean(0, false));
        obtainStyledAttributes.recycle();
        this.DK9slbsy = new fw();
        this.lwWCatUu = new cw(this);
        setNestedScrollingEnabled(true);
        hg0.eVhOlqcC(this, SgZGMMPL);
    }

    private y50 getScrollFeedbackProvider() {
        y50 y50Var = this.Qr9iLBAD;
        if (y50Var != null) {
            return y50Var;
        }
        y50 y50Var2 = new y50(this);
        this.Qr9iLBAD = y50Var2;
        return y50Var2;
    }

    public static boolean ow5vqvCr(View view, NestedScrollView nestedScrollView) {
        if (view == nestedScrollView) {
            return true;
        }
        Object parent = view.getParent();
        return (parent instanceof ViewGroup) && ow5vqvCr((View) parent, nestedScrollView);
    }

    public final boolean Ey6iv0m0(EdgeEffect edgeEffect, int i) {
        if (i > 0) {
            return true;
        }
        float I5GHvsYW = ej0.I5GHvsYW(edgeEffect) * getHeight();
        float abs = Math.abs(-i) * 0.35f;
        float f = this.NCTxEWno * 0.015f;
        double log = Math.log(abs / f);
        double d = euDDoUNr;
        return ((float) (Math.exp((d / (d - 1.0d)) * log) * ((double) f))) < I5GHvsYW;
    }

    public final void FySoLYna(int i) {
        this.lwWCatUu.Qr9iLBAD(i);
    }

    public final void I5GHvsYW(int i, int i2, boolean z) {
        if (getChildCount() == 0) {
            return;
        }
        if (AnimationUtils.currentAnimationTimeMillis() - this.MdtA4re8 > 250) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int height = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            int max = Math.max(0, Math.min(i2 + scrollY, Math.max(0, height - height2))) - scrollY;
            this.VgvYg0wo.startScroll(getScrollX(), scrollY, 0, max, 250);
            if (z) {
                this.lwWCatUu.b2ZJblxo(2, 1);
            } else {
                FySoLYna(1);
            }
            this.gjV1z5T1 = getScrollY();
            postInvalidateOnAnimation();
        } else {
            OverScroller overScroller = this.VgvYg0wo;
            if (!overScroller.isFinished()) {
                overScroller.abortAnimation();
                FySoLYna(1);
            }
            scrollBy(i, i2);
        }
        this.MdtA4re8 = AnimationUtils.currentAnimationTimeMillis();
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0129  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int KlHjfFWx(int i, int i2, MotionEvent motionEvent, int i3, int i4, boolean z) {
        int i5;
        int i6;
        boolean z2;
        boolean z3;
        VelocityTracker velocityTracker;
        cw cwVar = this.lwWCatUu;
        if (i4 == 1) {
            cwVar.b2ZJblxo(2, i4);
        }
        boolean MdtA4re8 = this.lwWCatUu.MdtA4re8(0, i, i4, this.RXQxj5Oe, this.I5GHvsYW);
        int[] iArr = this.I5GHvsYW;
        int[] iArr2 = this.RXQxj5Oe;
        if (MdtA4re8) {
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
        boolean z5 = sjUBp5pO(i5, 0, scrollY, scrollRange) && !cwVar.P7K7Inc8(i4);
        int scrollY2 = getScrollY() - scrollY;
        if (motionEvent != null && scrollY2 != 0) {
            getScrollFeedbackProvider().qoPGr6Ce.onScrollProgress(motionEvent.getDeviceId(), motionEvent.getSource(), i2, scrollY2);
        }
        iArr2[1] = 0;
        this.lwWCatUu.wxUZMvaN(0, scrollY2, 0, i5 - scrollY2, this.I5GHvsYW, i4, iArr2);
        int i7 = i6 + iArr[1];
        int i8 = i5 - iArr2[1];
        int i9 = scrollY + i8;
        EdgeEffect edgeEffect = this.b2ZJblxo;
        EdgeEffect edgeEffect2 = this.P7K7Inc8;
        if (i9 < 0) {
            if (z4) {
                ej0.pRiPUEwG(edgeEffect2, (-i8) / getHeight(), i3 / getWidth());
                if (motionEvent != null) {
                    getScrollFeedbackProvider().qoPGr6Ce.onScrollLimit(motionEvent.getDeviceId(), motionEvent.getSource(), i2, true);
                }
                if (!edgeEffect.isFinished()) {
                    edgeEffect.onRelease();
                }
            }
        } else if (i9 > scrollRange && z4) {
            ej0.pRiPUEwG(edgeEffect, i8 / getHeight(), 1.0f - (i3 / getWidth()));
            if (motionEvent != null) {
                z2 = false;
                getScrollFeedbackProvider().qoPGr6Ce.onScrollLimit(motionEvent.getDeviceId(), motionEvent.getSource(), i2, false);
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
            if (z3 && i4 == 0 && (velocityTracker = this.ygLcUYwZ) != null) {
                velocityTracker.clear();
            }
            if (i4 == 1) {
                FySoLYna(i4);
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

    @Override // defpackage.dw
    public final void MdtA4re8(View view, int i) {
        fw fwVar = this.DK9slbsy;
        if (i == 1) {
            fwVar.NCTxEWno = 0;
        } else {
            fwVar.qoPGr6Ce = 0;
        }
        FySoLYna(i);
    }

    @Override // defpackage.dw
    public final void NCTxEWno(ViewGroup viewGroup, int i, int i2, int i3, int i4, int i5) {
        ygLcUYwZ(i4, i5, null);
    }

    public final boolean OnDfzHZD(View view, int i, int i2) {
        Rect rect = this.wxUZMvaN;
        view.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(view, rect);
        return rect.bottom + i >= getScrollY() && rect.top - i <= getScrollY() + i2;
    }

    public final void OxcuoDLp(int i) {
        boolean z = i == 130;
        int height = getHeight();
        Rect rect = this.wxUZMvaN;
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
        amk52bBQ(i, i2, i3);
    }

    @Override // defpackage.dw
    public final boolean P7K7Inc8(View view, View view2, int i, int i2) {
        return (i & 2) != 0;
    }

    public final int Qr9iLBAD(Rect rect) {
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

    public final boolean RXQxj5Oe(MotionEvent motionEvent) {
        boolean z;
        EdgeEffect edgeEffect = this.P7K7Inc8;
        if (ej0.I5GHvsYW(edgeEffect) != 0.0f) {
            ej0.pRiPUEwG(edgeEffect, 0.0f, motionEvent.getX() / getWidth());
            z = true;
        } else {
            z = false;
        }
        EdgeEffect edgeEffect2 = this.b2ZJblxo;
        if (ej0.I5GHvsYW(edgeEffect2) == 0.0f) {
            return z;
        }
        ej0.pRiPUEwG(edgeEffect2, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
        return true;
    }

    @Override // defpackage.ew
    public final void VgvYg0wo(ViewGroup viewGroup, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        ygLcUYwZ(i4, i5, iArr);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        if (getChildCount() <= 0) {
            super.addView(view);
        } else {
            m1.Ey6iv0m0("ScrollView can host only one direct child");
        }
    }

    public final boolean amk52bBQ(int i, int i2, int i3) {
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
            KlHjfFWx(z2 ? i2 - scrollY : i3 - i4, -1, null, 0, 1, true);
            z = true;
        } else {
            z = false;
        }
        if (view3 != findFocus()) {
            view3.requestFocus(i);
        }
        return z;
    }

    public final boolean b2ZJblxo(int i) {
        View findFocus = findFocus();
        if (findFocus == this) {
            findFocus = null;
        }
        View view = findFocus;
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, view, i);
        int maxScrollAmount = getMaxScrollAmount();
        if (findNextFocus == null || !OnDfzHZD(findNextFocus, maxScrollAmount, getHeight())) {
            if (i == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getHeight() + getScrollY()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            KlHjfFWx(maxScrollAmount, -1, null, 0, 1, true);
        } else {
            Rect rect = this.wxUZMvaN;
            findNextFocus.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(findNextFocus, rect);
            KlHjfFWx(Qr9iLBAD(rect), -1, null, 0, 1, true);
            findNextFocus.requestFocus(i);
        }
        if (view != null && view.isFocused() && !OnDfzHZD(view, 0, getHeight())) {
            int descendantFocusability = getDescendantFocusability();
            setDescendantFocusability(131072);
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
        OverScroller overScroller = this.VgvYg0wo;
        if (overScroller.isFinished()) {
            return;
        }
        overScroller.computeScrollOffset();
        int currY = overScroller.getCurrY();
        int i2 = currY - this.gjV1z5T1;
        int height = getHeight();
        EdgeEffect edgeEffect = this.P7K7Inc8;
        EdgeEffect edgeEffect2 = this.b2ZJblxo;
        if (i2 <= 0 || ej0.I5GHvsYW(edgeEffect) == 0.0f) {
            if (i2 < 0 && ej0.I5GHvsYW(edgeEffect2) != 0.0f) {
                float f = height;
                round = Math.round(ej0.pRiPUEwG(edgeEffect2, (i2 * 4.0f) / f, 0.5f) * (f / 4.0f));
                if (round != i2) {
                    edgeEffect2.finish();
                }
            }
            int i3 = i2;
            this.gjV1z5T1 = currY;
            int[] iArr = this.RXQxj5Oe;
            iArr[1] = 0;
            this.lwWCatUu.MdtA4re8(0, i3, 1, iArr, null);
            i = i3 - iArr[1];
            int scrollRange = getScrollRange();
            if (Build.VERSION.SDK_INT >= 35) {
                zv.qoPGr6Ce(this, Math.abs(overScroller.getCurrVelocity()));
            }
            if (i != 0) {
                int scrollY = getScrollY();
                sjUBp5pO(i, getScrollX(), scrollY, scrollRange);
                int scrollY2 = getScrollY() - scrollY;
                int i4 = i - scrollY2;
                iArr[1] = 0;
                this.lwWCatUu.wxUZMvaN(0, scrollY2, 0, i4, this.I5GHvsYW, 1, iArr);
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
                FySoLYna(1);
            }
            if (overScroller.isFinished()) {
                postInvalidateOnAnimation();
                return;
            } else {
                FySoLYna(1);
                return;
            }
        }
        round = Math.round(ej0.pRiPUEwG(edgeEffect, ((-i2) * 4.0f) / height, 0.5f) * ((-height) / 4.0f));
        if (round != i2) {
            edgeEffect.finish();
        }
        i2 -= round;
        int i32 = i2;
        this.gjV1z5T1 = currY;
        int[] iArr2 = this.RXQxj5Oe;
        iArr2[1] = 0;
        this.lwWCatUu.MdtA4re8(0, i32, 1, iArr2, null);
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
        return super.dispatchKeyEvent(keyEvent) || jb9XjC4I(keyEvent);
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.lwWCatUu.qoPGr6Ce(f, f2, z);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f, float f2) {
        return this.lwWCatUu.NCTxEWno(f, f2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return this.lwWCatUu.MdtA4re8(i, i2, 0, iArr, iArr2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.lwWCatUu.wxUZMvaN(i, i2, i3, i4, iArr, 0, null);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i;
        super.draw(canvas);
        int scrollY = getScrollY();
        EdgeEffect edgeEffect = this.P7K7Inc8;
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
        EdgeEffect edgeEffect2 = this.b2ZJblxo;
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
        canvas.rotate(180.0f, width2, 0.0f);
        edgeEffect2.setSize(width2, height2);
        if (edgeEffect2.draw(canvas)) {
            postInvalidateOnAnimation();
        }
        canvas.restoreToCount(save2);
    }

    public final void eVhOlqcC(int i) {
        if (getChildCount() > 0) {
            this.VgvYg0wo.fling(getScrollX(), getScrollY(), 0, i, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            this.lwWCatUu.b2ZJblxo(2, 1);
            this.gjV1z5T1 = getScrollY();
            postInvalidateOnAnimation();
            if (Build.VERSION.SDK_INT >= 35) {
                zv.qoPGr6Ce(this, Math.abs(this.VgvYg0wo.getCurrVelocity()));
            }
        }
    }

    @Override // android.view.View
    public float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
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

    public int getMaxScrollAmount() {
        return (int) (getHeight() * 0.5f);
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        fw fwVar = this.DK9slbsy;
        return fwVar.NCTxEWno | fwVar.qoPGr6Ce;
    }

    public int getScrollRange() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    @Override // android.view.View
    public float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return scrollY / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public float getVerticalScrollFactorCompat() {
        float f = this.U0LaHZX7;
        if (f != 0.0f) {
            return f;
        }
        TypedValue typedValue = new TypedValue();
        Context context = getContext();
        if (!context.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true)) {
            m1.Ey6iv0m0("Expected theme to define listPreferredItemHeight.");
            return 0.0f;
        }
        float dimension = typedValue.getDimension(context.getResources().getDisplayMetrics());
        this.U0LaHZX7 = dimension;
        return dimension;
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return this.lwWCatUu.P7K7Inc8(0);
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.lwWCatUu.wxUZMvaN;
    }

    public final boolean jb9XjC4I(KeyEvent keyEvent) {
        this.wxUZMvaN.setEmpty();
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            if (childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin > (getHeight() - getPaddingTop()) - getPaddingBottom()) {
                if (keyEvent.getAction() == 0) {
                    int keyCode = keyEvent.getKeyCode();
                    if (keyCode == 19) {
                        return keyEvent.isAltPressed() ? k3x7lurq(33) : b2ZJblxo(33);
                    }
                    if (keyCode == 20) {
                        return keyEvent.isAltPressed() ? k3x7lurq(130) : b2ZJblxo(130);
                    }
                    if (keyCode == 62) {
                        OxcuoDLp(keyEvent.isShiftPressed() ? 33 : 130);
                        return false;
                    }
                    if (keyCode == 92) {
                        return k3x7lurq(33);
                    }
                    if (keyCode == 93) {
                        return k3x7lurq(130);
                    }
                    if (keyCode == 122) {
                        OxcuoDLp(33);
                        return false;
                    }
                    if (keyCode == 123) {
                        OxcuoDLp(130);
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
            View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, 130);
            if (findNextFocus != null && findNextFocus != this && findNextFocus.requestFocus(130)) {
                return true;
            }
        }
        return false;
    }

    public final boolean k3x7lurq(int i) {
        int childCount;
        boolean z = i == 130;
        int height = getHeight();
        Rect rect = this.wxUZMvaN;
        rect.top = 0;
        rect.bottom = height;
        if (z && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            int paddingBottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
            rect.bottom = paddingBottom;
            rect.top = paddingBottom - height;
        }
        return amk52bBQ(i, rect.top, rect.bottom);
    }

    public final void lDXGDhIF(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.Ey6iv0m0) {
            int i = actionIndex == 0 ? 1 : 0;
            this.jb9XjC4I = (int) motionEvent.getY(i);
            this.Ey6iv0m0 = motionEvent.getPointerId(i);
            VelocityTracker velocityTracker = this.ygLcUYwZ;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
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
        this.k3x7lurq = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:142:0x0124, code lost:
    
        if (r7 >= 0) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x00d9, code lost:
    
        if (r8 >= 0) goto L50;
     */
    /* JADX WARN: Removed duplicated region for block: B:55:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x02a6  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float f;
        int i;
        int i2;
        boolean z;
        int i3;
        int i4;
        int i5;
        boolean z2;
        int[] iArr;
        float f2;
        float f3;
        long j;
        float f4;
        int i6;
        float sqrt;
        int[] iArr2;
        float f5;
        if (motionEvent.getAction() != 8 || this.OnDfzHZD) {
            return false;
        }
        if ((motionEvent.getSource() & 2) == 2) {
            float axisValue = motionEvent.getAxisValue(9);
            i2 = (int) motionEvent.getX();
            i = 9;
            f = axisValue;
        } else if ((motionEvent.getSource() & 4194304) == 4194304) {
            float axisValue2 = motionEvent.getAxisValue(26);
            i2 = getWidth() / 2;
            f = axisValue2;
            i = 26;
        } else {
            f = 0.0f;
            i = 0;
            i2 = 0;
        }
        if (f == 0.0f) {
            return false;
        }
        KlHjfFWx(-((int) (getVerticalScrollFactorCompat() * f)), i, motionEvent, i2, 1, (motionEvent.getSource() & 8194) == 8194);
        if (i != 0) {
            yc ycVar = this.Mq3SeTnW;
            NestedScrollView nestedScrollView = (NestedScrollView) ycVar.NCTxEWno.MdtA4re8;
            int[] iArr3 = ycVar.Qr9iLBAD;
            int source = motionEvent.getSource();
            int deviceId = motionEvent.getDeviceId();
            if (ycVar.P7K7Inc8 == source && ycVar.b2ZJblxo == deviceId && ycVar.VgvYg0wo == i) {
                z2 = false;
                z = true;
                i3 = 0;
            } else {
                Context context = ycVar.qoPGr6Ce;
                z = true;
                ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
                int deviceId2 = motionEvent.getDeviceId();
                int source2 = motionEvent.getSource();
                i3 = 0;
                int i7 = Build.VERSION.SDK_INT;
                if (i7 >= 34) {
                    Method method = jg0.qoPGr6Ce;
                    i4 = hzgxAD8d.P7K7Inc8(viewConfiguration, deviceId2, i, source2);
                } else {
                    Method method2 = jg0.qoPGr6Ce;
                    InputDevice device = InputDevice.getDevice(deviceId2);
                    if (device != null && device.getMotionRange(i, source2) != null) {
                        Resources resources = context.getResources();
                        int identifier = (source2 == 4194304 && i == 26) ? resources.getIdentifier("config_viewMinRotaryEncoderFlingVelocity", "dimen", "android") : -1;
                        Objects.requireNonNull(viewConfiguration);
                        if (identifier == -1) {
                            i4 = viewConfiguration.getScaledMinimumFlingVelocity();
                        } else if (identifier != 0) {
                            i4 = resources.getDimensionPixelSize(identifier);
                        }
                    }
                    i4 = Integer.MAX_VALUE;
                }
                iArr3[0] = i4;
                int deviceId3 = motionEvent.getDeviceId();
                int source3 = motionEvent.getSource();
                if (i7 >= 34) {
                    i5 = hzgxAD8d.VgvYg0wo(viewConfiguration, deviceId3, i, source3);
                } else {
                    InputDevice device2 = InputDevice.getDevice(deviceId3);
                    if (device2 != null && device2.getMotionRange(i, source3) != null) {
                        Resources resources2 = context.getResources();
                        int identifier2 = (source3 == 4194304 && i == 26) ? resources2.getIdentifier("config_viewMaxRotaryEncoderFlingVelocity", "dimen", "android") : -1;
                        Objects.requireNonNull(viewConfiguration);
                        if (identifier2 == -1) {
                            i5 = viewConfiguration.getScaledMaximumFlingVelocity();
                        } else if (identifier2 != 0) {
                            i5 = resources2.getDimensionPixelSize(identifier2);
                        }
                    }
                    i5 = Integer.MIN_VALUE;
                }
                iArr3[1] = i5;
                ycVar.P7K7Inc8 = source;
                ycVar.b2ZJblxo = deviceId;
                ycVar.VgvYg0wo = i;
                z2 = true;
            }
            int i8 = iArr3[i3];
            VelocityTracker velocityTracker = ycVar.MdtA4re8;
            if (i8 == Integer.MAX_VALUE) {
                if (velocityTracker == null) {
                    return z;
                }
                velocityTracker.recycle();
                ycVar.MdtA4re8 = null;
                return z;
            }
            if (velocityTracker == null) {
                velocityTracker = VelocityTracker.obtain();
                ycVar.MdtA4re8 = velocityTracker;
            }
            Map map = nf0.qoPGr6Ce;
            velocityTracker.addMovement(motionEvent);
            if (Build.VERSION.SDK_INT < 34 && motionEvent.getSource() == 4194304) {
                Map map2 = nf0.qoPGr6Ce;
                if (!map2.containsKey(velocityTracker)) {
                    map2.put(velocityTracker, new of0());
                }
                of0 of0Var = (of0) map2.get(velocityTracker);
                long[] jArr = of0Var.NCTxEWno;
                long eventTime = motionEvent.getEventTime();
                int i9 = of0Var.wxUZMvaN;
                if (i9 != 0 && eventTime - jArr[of0Var.VgvYg0wo] > 40) {
                    of0Var.wxUZMvaN = i3;
                    of0Var.MdtA4re8 = 0.0f;
                    i9 = 0;
                }
                int i10 = (of0Var.VgvYg0wo + 1) % 20;
                of0Var.VgvYg0wo = i10;
                if (i9 != 20) {
                    of0Var.wxUZMvaN = i9 + 1;
                }
                of0Var.qoPGr6Ce[i10] = motionEvent.getAxisValue(26);
                jArr[of0Var.VgvYg0wo] = eventTime;
            }
            float f6 = Float.MAX_VALUE;
            velocityTracker.computeCurrentVelocity(1000, Float.MAX_VALUE);
            of0 of0Var2 = (of0) nf0.qoPGr6Ce.get(velocityTracker);
            if (of0Var2 != null) {
                float[] fArr = of0Var2.qoPGr6Ce;
                long[] jArr2 = of0Var2.NCTxEWno;
                int i11 = of0Var2.wxUZMvaN;
                if (i11 < 2) {
                    iArr = iArr3;
                    f4 = Float.MAX_VALUE;
                } else {
                    int i12 = of0Var2.VgvYg0wo;
                    int i13 = ((i12 + 20) - (i11 - 1)) % 20;
                    long j2 = jArr2[i12];
                    while (true) {
                        j = jArr2[i13];
                        long j3 = j2 - j;
                        f4 = f6;
                        i6 = of0Var2.wxUZMvaN;
                        if (j3 <= 100) {
                            break;
                        }
                        of0Var2.wxUZMvaN = i6 - 1;
                        i13 = (i13 + 1) % 20;
                        f6 = f4;
                    }
                    if (i6 >= 2) {
                        if (i6 == 2) {
                            int i14 = (i13 + 1) % 20;
                            if (j != jArr2[i14]) {
                                iArr = iArr3;
                                sqrt = fArr[i14] / (r11 - j);
                            }
                        } else {
                            float f7 = 0.0f;
                            int i15 = 0;
                            int i16 = 0;
                            while (true) {
                                if (i15 >= of0Var2.wxUZMvaN - 1) {
                                    break;
                                }
                                int i17 = i15 + i13;
                                long j4 = jArr2[i17 % 20];
                                int i18 = (i17 + 1) % 20;
                                if (jArr2[i18] == j4) {
                                    iArr2 = iArr3;
                                } else {
                                    i16++;
                                    iArr2 = iArr3;
                                    float sqrt2 = (f7 < 0.0f ? -1.0f : 1.0f) * ((float) Math.sqrt(2.0f * Math.abs(f7)));
                                    float f8 = fArr[i18] / (jArr2[i18] - j4);
                                    float abs = (Math.abs(f8) * (f8 - sqrt2)) + f7;
                                    if (i16 == z) {
                                        abs *= 0.5f;
                                    }
                                    f7 = abs;
                                }
                                i15++;
                                iArr3 = iArr2;
                                z = true;
                            }
                            iArr = iArr3;
                            sqrt = ((float) Math.sqrt(Math.abs(r29) * 2.0f)) * (f7 < 0.0f ? -1.0f : 1.0f);
                        }
                        f5 = sqrt * 1000.0f;
                        of0Var2.MdtA4re8 = f5;
                        if (f5 >= (-Math.abs(f4))) {
                            of0Var2.MdtA4re8 = -Math.abs(f4);
                        } else if (of0Var2.MdtA4re8 > Math.abs(f4)) {
                            of0Var2.MdtA4re8 = Math.abs(f4);
                        }
                    }
                    iArr = iArr3;
                }
                sqrt = 0.0f;
                f5 = sqrt * 1000.0f;
                of0Var2.MdtA4re8 = f5;
                if (f5 >= (-Math.abs(f4))) {
                }
            } else {
                iArr = iArr3;
            }
            if (Build.VERSION.SDK_INT >= 34) {
                f2 = hzgxAD8d.NCTxEWno(velocityTracker, i);
            } else if (i == 0) {
                f2 = velocityTracker.getXVelocity();
            } else if (i == 1) {
                f2 = velocityTracker.getYVelocity();
            } else {
                of0 of0Var3 = (of0) nf0.qoPGr6Ce.get(velocityTracker);
                f2 = (of0Var3 == null || i != 26) ? 0.0f : of0Var3.MdtA4re8;
            }
            float f9 = f2 * (-nestedScrollView.getVerticalScrollFactorCompat());
            float signum = Math.signum(f9);
            if (z2 || (signum != Math.signum(ycVar.wxUZMvaN) && signum != 0.0f)) {
                nestedScrollView.VgvYg0wo.abortAnimation();
            }
            if (Math.abs(f9) >= iArr[0]) {
                float max = Math.max(-r3, Math.min(f9, iArr[1]));
                if (max == 0.0f) {
                    f3 = 0.0f;
                } else {
                    nestedScrollView.VgvYg0wo.abortAnimation();
                    nestedScrollView.eVhOlqcC((int) max);
                    f3 = max;
                }
                ycVar.wxUZMvaN = f3;
                return true;
            }
        }
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        boolean z = true;
        if (action == 2 && this.OnDfzHZD) {
            return true;
        }
        int i = action & 255;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    int i2 = this.Ey6iv0m0;
                    if (i2 != -1) {
                        int findPointerIndex = motionEvent.findPointerIndex(i2);
                        if (findPointerIndex == -1) {
                            Log.e("NestedScrollView", "Invalid pointerId=" + i2 + " in onInterceptTouchEvent");
                        } else {
                            int y = (int) motionEvent.getY(findPointerIndex);
                            if (Math.abs(y - this.jb9XjC4I) > this.OxcuoDLp && (2 & getNestedScrollAxes()) == 0) {
                                this.OnDfzHZD = true;
                                this.jb9XjC4I = y;
                                VelocityTracker velocityTracker = this.ygLcUYwZ;
                                if (velocityTracker == null) {
                                    velocityTracker = VelocityTracker.obtain();
                                    this.ygLcUYwZ = velocityTracker;
                                }
                                velocityTracker.addMovement(motionEvent);
                                this.FySoLYna = 0;
                                ViewParent parent = getParent();
                                if (parent != null) {
                                    parent.requestDisallowInterceptTouchEvent(true);
                                }
                            }
                        }
                    }
                } else if (i != 3) {
                    if (i == 6) {
                        lDXGDhIF(motionEvent);
                    }
                }
            }
            this.OnDfzHZD = false;
            this.Ey6iv0m0 = -1;
            VelocityTracker velocityTracker2 = this.ygLcUYwZ;
            if (velocityTracker2 != null) {
                velocityTracker2.recycle();
                this.ygLcUYwZ = null;
            }
            if (this.VgvYg0wo.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                postInvalidateOnAnimation();
            }
            FySoLYna(0);
        } else {
            int y2 = (int) motionEvent.getY();
            int x = (int) motionEvent.getX();
            int childCount = getChildCount();
            OverScroller overScroller = this.VgvYg0wo;
            if (childCount > 0) {
                int scrollY = getScrollY();
                View childAt = getChildAt(0);
                if (y2 >= childAt.getTop() - scrollY && y2 < childAt.getBottom() - scrollY && x >= childAt.getLeft() && x < childAt.getRight()) {
                    this.jb9XjC4I = y2;
                    this.Ey6iv0m0 = motionEvent.getPointerId(0);
                    VelocityTracker velocityTracker3 = this.ygLcUYwZ;
                    if (velocityTracker3 == null) {
                        this.ygLcUYwZ = VelocityTracker.obtain();
                    } else {
                        velocityTracker3.clear();
                    }
                    this.ygLcUYwZ.addMovement(motionEvent);
                    overScroller.computeScrollOffset();
                    if (!RXQxj5Oe(motionEvent) && overScroller.isFinished()) {
                        z = false;
                    }
                    this.OnDfzHZD = z;
                    this.lwWCatUu.b2ZJblxo(2, 0);
                }
            }
            if (!RXQxj5Oe(motionEvent) && overScroller.isFinished()) {
                z = false;
            }
            this.OnDfzHZD = z;
            VelocityTracker velocityTracker4 = this.ygLcUYwZ;
            if (velocityTracker4 != null) {
                velocityTracker4.recycle();
                this.ygLcUYwZ = null;
            }
        }
        return this.OnDfzHZD;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        super.onLayout(z, i, i2, i3, i4);
        int i6 = 0;
        this.eVhOlqcC = false;
        View view = this.ow5vqvCr;
        if (view != null && ow5vqvCr(view, this)) {
            View view2 = this.ow5vqvCr;
            Rect rect = this.wxUZMvaN;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int Qr9iLBAD = Qr9iLBAD(rect);
            if (Qr9iLBAD != 0) {
                scrollBy(0, Qr9iLBAD);
            }
        }
        this.ow5vqvCr = null;
        if (!this.k3x7lurq) {
            if (this.WYNAV5pd != null) {
                scrollTo(getScrollX(), this.WYNAV5pd.NCTxEWno);
                this.WYNAV5pd = null;
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
        this.k3x7lurq = true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.lDXGDhIF && View.MeasureSpec.getMode(i2) != 0 && getChildCount() > 0) {
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
        dispatchNestedFling(0.0f, f2, true);
        eVhOlqcC((int) f2);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        return this.lwWCatUu.NCTxEWno(f, f2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        this.lwWCatUu.MdtA4re8(i, i2, 0, iArr, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        ygLcUYwZ(i4, 0, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        qoPGr6Ce(view, view2, i, 0);
    }

    @Override // android.view.View
    public final void onOverScrolled(int i, int i2, boolean z, boolean z2) {
        super.scrollTo(i, i2);
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (i == 2) {
            i = 130;
        } else if (i == 1) {
            i = 33;
        }
        View findNextFocus = rect == null ? FocusFinder.getInstance().findNextFocus(this, null, i) : FocusFinder.getInstance().findNextFocusFromRect(this, rect, i);
        if (findNextFocus != null && OnDfzHZD(findNextFocus, 0, getHeight())) {
            return findNextFocus.requestFocus(i, rect);
        }
        return false;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof bw)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        bw bwVar = (bw) parcelable;
        super.onRestoreInstanceState(bwVar.getSuperState());
        this.WYNAV5pd = bwVar;
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        bw bwVar = new bw(super.onSaveInstanceState());
        bwVar.NCTxEWno = getScrollY();
        return bwVar;
    }

    @Override // android.view.View
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        aw awVar = this.i7xS8jrb;
        if (awVar != null) {
            PairShelfFragment pairShelfFragment = (PairShelfFragment) ((wm) awVar).NCTxEWno;
            List list = PairShelfFragment.f7oeun2L;
            if (pairShelfFragment.orhfF2Ya.qoPGr6Ce() == 0) {
                return;
            }
            sj sjVar = pairShelfFragment.pP9Y2m6O;
            sjVar.getClass();
            sjVar.OnDfzHZD.setAlpha(1.0f);
            q90 q90Var = pairShelfFragment.hGvurcGl;
            g9 g9Var = null;
            if (q90Var != null) {
                q90Var.b2ZJblxo(null);
            }
            pairShelfFragment.hGvurcGl = fn.Ey6iv0m0(ej0.FySoLYna(pairShelfFragment.lDXGDhIF()), null, new mx(pairShelfFragment, g9Var, 2), 3);
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        View findFocus = findFocus();
        if (findFocus == null || this == findFocus || !OnDfzHZD(findFocus, 0, i4)) {
            return;
        }
        Rect rect = this.wxUZMvaN;
        findFocus.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(findFocus, rect);
        int Qr9iLBAD = Qr9iLBAD(rect);
        if (Qr9iLBAD != 0) {
            if (this.sjUBp5pO) {
                I5GHvsYW(0, Qr9iLBAD, false);
            } else {
                scrollBy(0, Qr9iLBAD);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        return P7K7Inc8(view, view2, i, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        MdtA4re8(view, 0);
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
        float pRiPUEwG;
        int round;
        if (this.ygLcUYwZ == null) {
            this.ygLcUYwZ = VelocityTracker.obtain();
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.FySoLYna = 0;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        float f = 0.0f;
        obtain.offsetLocation(0.0f, this.FySoLYna);
        cw cwVar = this.lwWCatUu;
        if (actionMasked != 0) {
            EdgeEffect edgeEffect = this.P7K7Inc8;
            EdgeEffect edgeEffect2 = this.b2ZJblxo;
            if (actionMasked == 1) {
                VelocityTracker velocityTracker = this.ygLcUYwZ;
                velocityTracker.computeCurrentVelocity(1000, this.KlHjfFWx);
                int yVelocity = (int) velocityTracker.getYVelocity(this.Ey6iv0m0);
                if (Math.abs(yVelocity) >= this.amk52bBQ) {
                    if (ej0.I5GHvsYW(edgeEffect) != 0.0f) {
                        if (Ey6iv0m0(edgeEffect, yVelocity)) {
                            edgeEffect.onAbsorb(yVelocity);
                        } else {
                            eVhOlqcC(-yVelocity);
                        }
                    } else if (ej0.I5GHvsYW(edgeEffect2) != 0.0f) {
                        int i = -yVelocity;
                        if (Ey6iv0m0(edgeEffect2, i)) {
                            edgeEffect2.onAbsorb(i);
                        } else {
                            eVhOlqcC(i);
                        }
                    } else {
                        int i2 = -yVelocity;
                        float f2 = i2;
                        if (!cwVar.NCTxEWno(0.0f, f2)) {
                            dispatchNestedFling(0.0f, f2, true);
                            eVhOlqcC(i2);
                        }
                    }
                } else if (this.VgvYg0wo.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    postInvalidateOnAnimation();
                }
                this.Ey6iv0m0 = -1;
                this.OnDfzHZD = false;
                VelocityTracker velocityTracker2 = this.ygLcUYwZ;
                if (velocityTracker2 != null) {
                    velocityTracker2.recycle();
                    this.ygLcUYwZ = null;
                }
                FySoLYna(0);
                edgeEffect.onRelease();
                edgeEffect2.onRelease();
            } else if (actionMasked == 2) {
                int findPointerIndex = motionEvent.findPointerIndex(this.Ey6iv0m0);
                if (findPointerIndex == -1) {
                    Log.e("NestedScrollView", "Invalid pointerId=" + this.Ey6iv0m0 + " in onTouchEvent");
                } else {
                    int y = (int) motionEvent.getY(findPointerIndex);
                    int i3 = this.jb9XjC4I - y;
                    float x = motionEvent.getX(findPointerIndex) / getWidth();
                    float height = i3 / getHeight();
                    if (ej0.I5GHvsYW(edgeEffect) != 0.0f) {
                        pRiPUEwG = -ej0.pRiPUEwG(edgeEffect, -height, x);
                        if (ej0.I5GHvsYW(edgeEffect) == 0.0f) {
                            edgeEffect.onRelease();
                        }
                    } else {
                        if (ej0.I5GHvsYW(edgeEffect2) != 0.0f) {
                            pRiPUEwG = ej0.pRiPUEwG(edgeEffect2, height, 1.0f - x);
                            if (ej0.I5GHvsYW(edgeEffect2) == 0.0f) {
                                edgeEffect2.onRelease();
                            }
                        }
                        round = Math.round(f * getHeight());
                        if (round != 0) {
                            invalidate();
                        }
                        int i4 = i3 - round;
                        if (!this.OnDfzHZD) {
                            int abs = Math.abs(i4);
                            int i5 = this.OxcuoDLp;
                            if (abs > i5) {
                                ViewParent parent2 = getParent();
                                if (parent2 != null) {
                                    parent2.requestDisallowInterceptTouchEvent(true);
                                }
                                this.OnDfzHZD = true;
                                i4 = i4 > 0 ? i4 - i5 : i4 + i5;
                            }
                        }
                        if (this.OnDfzHZD) {
                            int KlHjfFWx = KlHjfFWx(i4, 1, motionEvent, (int) motionEvent.getX(findPointerIndex), 0, false);
                            this.jb9XjC4I = y - KlHjfFWx;
                            this.FySoLYna += KlHjfFWx;
                        }
                    }
                    f = pRiPUEwG;
                    round = Math.round(f * getHeight());
                    if (round != 0) {
                    }
                    int i42 = i3 - round;
                    if (!this.OnDfzHZD) {
                    }
                    if (this.OnDfzHZD) {
                    }
                }
            } else if (actionMasked == 3) {
                if (this.OnDfzHZD && getChildCount() > 0) {
                    if (this.VgvYg0wo.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                        postInvalidateOnAnimation();
                    }
                }
                this.Ey6iv0m0 = -1;
                this.OnDfzHZD = false;
                VelocityTracker velocityTracker3 = this.ygLcUYwZ;
                if (velocityTracker3 != null) {
                    velocityTracker3.recycle();
                    this.ygLcUYwZ = null;
                }
                FySoLYna(0);
                edgeEffect.onRelease();
                edgeEffect2.onRelease();
            } else if (actionMasked == 5) {
                int actionIndex = motionEvent.getActionIndex();
                this.jb9XjC4I = (int) motionEvent.getY(actionIndex);
                this.Ey6iv0m0 = motionEvent.getPointerId(actionIndex);
            } else if (actionMasked == 6) {
                lDXGDhIF(motionEvent);
                this.jb9XjC4I = (int) motionEvent.getY(motionEvent.findPointerIndex(this.Ey6iv0m0));
            }
        } else {
            if (getChildCount() == 0) {
                return false;
            }
            if (this.OnDfzHZD && (parent = getParent()) != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            OverScroller overScroller = this.VgvYg0wo;
            if (!overScroller.isFinished()) {
                overScroller.abortAnimation();
                FySoLYna(1);
            }
            int y2 = (int) motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            this.jb9XjC4I = y2;
            this.Ey6iv0m0 = pointerId;
            cwVar.b2ZJblxo(2, 0);
        }
        VelocityTracker velocityTracker4 = this.ygLcUYwZ;
        if (velocityTracker4 != null) {
            velocityTracker4.addMovement(obtain);
        }
        obtain.recycle();
        return true;
    }

    @Override // defpackage.dw
    public final void qoPGr6Ce(View view, View view2, int i, int i2) {
        fw fwVar = this.DK9slbsy;
        if (i2 == 1) {
            fwVar.NCTxEWno = i;
        } else {
            fwVar.qoPGr6Ce = i;
        }
        this.lwWCatUu.b2ZJblxo(2, i2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        if (this.eVhOlqcC) {
            this.ow5vqvCr = view2;
        } else {
            Rect rect = this.wxUZMvaN;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int Qr9iLBAD = Qr9iLBAD(rect);
            if (Qr9iLBAD != 0) {
                scrollBy(0, Qr9iLBAD);
            }
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        int Qr9iLBAD = Qr9iLBAD(rect);
        boolean z2 = Qr9iLBAD != 0;
        if (z2) {
            if (z) {
                scrollBy(0, Qr9iLBAD);
                return z2;
            }
            I5GHvsYW(0, Qr9iLBAD, false);
        }
        return z2;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        VelocityTracker velocityTracker;
        if (z && (velocityTracker = this.ygLcUYwZ) != null) {
            velocityTracker.recycle();
            this.ygLcUYwZ = null;
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        this.eVhOlqcC = true;
        super.requestLayout();
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
        if (z != this.lDXGDhIF) {
            this.lDXGDhIF = z;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        cw cwVar = this.lwWCatUu;
        if (cwVar.wxUZMvaN) {
            ViewGroup viewGroup = cwVar.MdtA4re8;
            WeakHashMap weakHashMap = hg0.qoPGr6Ce;
            viewGroup.stopNestedScroll();
        }
        cwVar.wxUZMvaN = z;
    }

    public void setOnScrollChangeListener(aw awVar) {
        this.i7xS8jrb = awVar;
    }

    public void setSmoothScrollingEnabled(boolean z) {
        this.sjUBp5pO = z;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return true;
    }

    public final boolean sjUBp5pO(int i, int i2, int i3, int i4) {
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
                if (z2 && !this.lwWCatUu.P7K7Inc8(1)) {
                    this.VgvYg0wo.springBack(i5, i6, 0, 0, 0, getScrollRange());
                }
                super.scrollTo(i5, i6);
                return !z || z2;
            }
            i6 = 0;
        }
        z2 = true;
        if (z2) {
            this.VgvYg0wo.springBack(i5, i6, 0, 0, 0, getScrollRange());
        }
        super.scrollTo(i5, i6);
        if (z) {
        }
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i) {
        return this.lwWCatUu.b2ZJblxo(i, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        FySoLYna(0);
    }

    @Override // defpackage.dw
    public final void wxUZMvaN(int i, int i2, int[] iArr, int i3) {
        this.lwWCatUu.MdtA4re8(i, i2, i3, iArr, null);
    }

    public final void ygLcUYwZ(int i, int i2, int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.lwWCatUu.wxUZMvaN(0, scrollY2, 0, i - scrollY2, null, i2, iArr);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i) {
        if (getChildCount() <= 0) {
            super.addView(view, i);
        } else {
            m1.Ey6iv0m0("ScrollView can host only one direct child");
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, layoutParams);
        } else {
            m1.Ey6iv0m0("ScrollView can host only one direct child");
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i, layoutParams);
        } else {
            m1.Ey6iv0m0("ScrollView can host only one direct child");
        }
    }

    public NestedScrollView(Context context) {
        this(context, null);
    }
}
