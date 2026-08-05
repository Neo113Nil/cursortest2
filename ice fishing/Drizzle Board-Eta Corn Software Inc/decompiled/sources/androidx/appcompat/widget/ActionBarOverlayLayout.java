package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;
import com.kolosta.rejin.jilosa.R;
import defpackage.CTE3lpUp;
import defpackage.LvHlPNBd;
import defpackage.Sjrx9cEN;
import defpackage.Wi7iiXC4;
import defpackage.ai0;
import defpackage.bn;
import defpackage.ci0;
import defpackage.dd0;
import defpackage.di0;
import defpackage.dw;
import defpackage.ei0;
import defpackage.ew;
import defpackage.fi0;
import defpackage.fw;
import defpackage.gi0;
import defpackage.hGvurcGl;
import defpackage.hg0;
import defpackage.hi0;
import defpackage.ii0;
import defpackage.m1;
import defpackage.os;
import defpackage.ra;
import defpackage.sa;
import defpackage.si0;
import defpackage.tef3qNMP;
import defpackage.wi0;
import defpackage.xc0;
import defpackage.yg0;
import defpackage.yr;
import defpackage.zf0;
import defpackage.zh0;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public class ActionBarOverlayLayout extends ViewGroup implements dw, ew {
    public static final int[] Mq3SeTnW = {R.attr.actionBarSize, android.R.attr.windowContentOverlay};
    public static final Rect SgZGMMPL;
    public static final wi0 euDDoUNr;
    public final Sjrx9cEN DK9slbsy;
    public wi0 Ey6iv0m0;
    public OverScroller FySoLYna;
    public wi0 I5GHvsYW;
    public wi0 KlHjfFWx;
    public int MdtA4re8;
    public int NCTxEWno;
    public int OnDfzHZD;
    public final Rect OxcuoDLp;
    public sa P7K7Inc8;
    public boolean Qr9iLBAD;
    public LvHlPNBd RXQxj5Oe;
    public final fw U0LaHZX7;
    public ActionBarContainer VgvYg0wo;
    public final tef3qNMP WYNAV5pd;
    public wi0 amk52bBQ;
    public Drawable b2ZJblxo;
    public boolean eVhOlqcC;
    public ViewPropertyAnimator gjV1z5T1;
    public final Wi7iiXC4 i7xS8jrb;
    public boolean jb9XjC4I;
    public boolean k3x7lurq;
    public final Rect lDXGDhIF;
    public final Sjrx9cEN lwWCatUu;
    public int ow5vqvCr;
    public final Rect sjUBp5pO;
    public ContentFrameLayout wxUZMvaN;
    public final Rect ygLcUYwZ;

    static {
        int i = Build.VERSION.SDK_INT;
        ii0 hi0Var = i >= 36 ? new hi0() : i >= 35 ? new gi0() : i >= 34 ? new fi0() : i >= 31 ? new ei0() : i >= 30 ? new di0() : i >= 29 ? new ci0() : new ai0();
        hi0Var.VgvYg0wo(bn.qoPGr6Ce(0, 1, 0, 1));
        euDDoUNr = hi0Var.NCTxEWno();
        SgZGMMPL = new Rect();
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.MdtA4re8 = 0;
        this.ygLcUYwZ = new Rect();
        this.lDXGDhIF = new Rect();
        this.sjUBp5pO = new Rect();
        this.OxcuoDLp = new Rect();
        new Rect();
        new Rect();
        new Rect();
        new Rect();
        wi0 wi0Var = wi0.NCTxEWno;
        this.amk52bBQ = wi0Var;
        this.KlHjfFWx = wi0Var;
        this.Ey6iv0m0 = wi0Var;
        this.I5GHvsYW = wi0Var;
        this.WYNAV5pd = new tef3qNMP(0, this);
        this.DK9slbsy = new Sjrx9cEN(this, 0);
        this.lwWCatUu = new Sjrx9cEN(this, 1);
        jb9XjC4I(context);
        this.U0LaHZX7 = new fw();
        Wi7iiXC4 wi7iiXC4 = new Wi7iiXC4(context);
        wi7iiXC4.setWillNotDraw(true);
        this.i7xS8jrb = wi7iiXC4;
        addView(wi7iiXC4);
    }

    public static boolean b2ZJblxo(View view, Rect rect, boolean z) {
        boolean z2;
        hGvurcGl hgvurcgl = (hGvurcGl) view.getLayoutParams();
        int i = ((ViewGroup.MarginLayoutParams) hgvurcgl).leftMargin;
        int i2 = rect.left;
        if (i != i2) {
            ((ViewGroup.MarginLayoutParams) hgvurcgl).leftMargin = i2;
            z2 = true;
        } else {
            z2 = false;
        }
        int i3 = ((ViewGroup.MarginLayoutParams) hgvurcgl).topMargin;
        int i4 = rect.top;
        if (i3 != i4) {
            ((ViewGroup.MarginLayoutParams) hgvurcgl).topMargin = i4;
            z2 = true;
        }
        int i5 = ((ViewGroup.MarginLayoutParams) hgvurcgl).rightMargin;
        int i6 = rect.right;
        if (i5 != i6) {
            ((ViewGroup.MarginLayoutParams) hgvurcgl).rightMargin = i6;
            z2 = true;
        }
        if (z) {
            int i7 = ((ViewGroup.MarginLayoutParams) hgvurcgl).bottomMargin;
            int i8 = rect.bottom;
            if (i7 != i8) {
                ((ViewGroup.MarginLayoutParams) hgvurcgl).bottomMargin = i8;
                return true;
            }
        }
        return z2;
    }

    @Override // defpackage.dw
    public final void MdtA4re8(View view, int i) {
        if (i == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // defpackage.dw
    public final void NCTxEWno(ViewGroup viewGroup, int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            onNestedScroll(viewGroup, i, i2, i3, i4);
        }
    }

    @Override // defpackage.dw
    public final boolean P7K7Inc8(View view, View view2, int i, int i2) {
        return i2 == 0 && onStartNestedScroll(view, view2, i);
    }

    public final void Qr9iLBAD() {
        removeCallbacks(this.DK9slbsy);
        removeCallbacks(this.lwWCatUu);
        ViewPropertyAnimator viewPropertyAnimator = this.gjV1z5T1;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    @Override // defpackage.ew
    public final void VgvYg0wo(ViewGroup viewGroup, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        NCTxEWno(viewGroup, i, i2, i3, i4, i5);
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof hGvurcGl;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i;
        super.draw(canvas);
        if (this.b2ZJblxo != null) {
            if (this.VgvYg0wo.getVisibility() == 0) {
                i = (int) (this.VgvYg0wo.getTranslationY() + this.VgvYg0wo.getBottom() + 0.5f);
            } else {
                i = 0;
            }
            this.b2ZJblxo.setBounds(0, i, getWidth(), this.b2ZJblxo.getIntrinsicHeight() + i);
            this.b2ZJblxo.draw(canvas);
        }
    }

    public final void eVhOlqcC(int i) {
        k3x7lurq();
        if (i == 2) {
            ((dd0) this.P7K7Inc8).getClass();
            Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
        } else if (i == 5) {
            ((dd0) this.P7K7Inc8).getClass();
            Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
        } else {
            if (i != 109) {
                return;
            }
            setOverlayMode(true);
        }
    }

    @Override // android.view.View
    public final boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new hGvurcGl(-1, -1);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new hGvurcGl(getContext(), attributeSet);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.VgvYg0wo;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        fw fwVar = this.U0LaHZX7;
        return fwVar.NCTxEWno | fwVar.qoPGr6Ce;
    }

    public CharSequence getTitle() {
        k3x7lurq();
        return ((dd0) this.P7K7Inc8).qoPGr6Ce.getTitle();
    }

    public final void jb9XjC4I(Context context) {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(Mq3SeTnW);
        this.NCTxEWno = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        this.b2ZJblxo = drawable;
        setWillNotDraw(drawable == null);
        obtainStyledAttributes.recycle();
        this.FySoLYna = new OverScroller(context);
    }

    public final void k3x7lurq() {
        sa wrapper;
        if (this.wxUZMvaN == null) {
            this.wxUZMvaN = (ContentFrameLayout) findViewById(R.id.action_bar_activity_content);
            this.VgvYg0wo = (ActionBarContainer) findViewById(R.id.action_bar_container);
            KeyEvent.Callback findViewById = findViewById(R.id.action_bar);
            if (findViewById instanceof sa) {
                wrapper = (sa) findViewById;
            } else {
                if (!(findViewById instanceof Toolbar)) {
                    m1.Ey6iv0m0("Can't make a decor toolbar out of ".concat(findViewById.getClass().getSimpleName()));
                    return;
                }
                wrapper = ((Toolbar) findViewById).getWrapper();
            }
            this.P7K7Inc8 = wrapper;
        }
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        k3x7lurq();
        wi0 VgvYg0wo = wi0.VgvYg0wo(windowInsets, this);
        int qoPGr6Ce = VgvYg0wo.qoPGr6Ce();
        si0 si0Var = VgvYg0wo.qoPGr6Ce;
        boolean b2ZJblxo = b2ZJblxo(this.VgvYg0wo, new Rect(qoPGr6Ce, si0Var.ow5vqvCr().NCTxEWno, VgvYg0wo.NCTxEWno(), si0Var.ow5vqvCr().wxUZMvaN), false);
        WeakHashMap weakHashMap = hg0.qoPGr6Ce;
        Rect rect = this.ygLcUYwZ;
        zf0.NCTxEWno(this, VgvYg0wo, rect);
        wi0 sjUBp5pO = si0Var.sjUBp5pO(rect.left, rect.top, rect.right, rect.bottom);
        this.amk52bBQ = sjUBp5pO;
        boolean z = true;
        if (!this.KlHjfFWx.equals(sjUBp5pO)) {
            this.KlHjfFWx = this.amk52bBQ;
            b2ZJblxo = true;
        }
        Rect rect2 = this.lDXGDhIF;
        if (rect2.equals(rect)) {
            z = b2ZJblxo;
        } else {
            rect2.set(rect);
        }
        if (z) {
            requestLayout();
        }
        return si0Var.qoPGr6Ce().qoPGr6Ce.MdtA4re8().qoPGr6Ce.NCTxEWno().wxUZMvaN();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        jb9XjC4I(getContext());
        WeakHashMap weakHashMap = hg0.qoPGr6Ce;
        requestApplyInsets();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Qr9iLBAD();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                hGvurcGl hgvurcgl = (hGvurcGl) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i6 = ((ViewGroup.MarginLayoutParams) hgvurcgl).leftMargin + paddingLeft;
                int i7 = ((ViewGroup.MarginLayoutParams) hgvurcgl).topMargin + paddingTop;
                childAt.layout(i6, i7, measuredWidth + i6, measuredHeight + i7);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x012d  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i, int i2) {
        int measuredHeight;
        k3x7lurq();
        measureChildWithMargins(this.VgvYg0wo, i, 0, i2, 0);
        hGvurcGl hgvurcgl = (hGvurcGl) this.VgvYg0wo.getLayoutParams();
        int max = Math.max(0, this.VgvYg0wo.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) hgvurcgl).leftMargin + ((ViewGroup.MarginLayoutParams) hgvurcgl).rightMargin);
        int max2 = Math.max(0, this.VgvYg0wo.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) hgvurcgl).topMargin + ((ViewGroup.MarginLayoutParams) hgvurcgl).bottomMargin);
        int combineMeasuredStates = View.combineMeasuredStates(0, this.VgvYg0wo.getMeasuredState());
        WeakHashMap weakHashMap = hg0.qoPGr6Ce;
        boolean z = (getWindowSystemUiVisibility() & 256) != 0;
        if (z) {
            measuredHeight = this.NCTxEWno;
            if (this.jb9XjC4I && this.VgvYg0wo.getTabContainer() != null) {
                measuredHeight += this.NCTxEWno;
            }
        } else {
            measuredHeight = this.VgvYg0wo.getVisibility() != 8 ? this.VgvYg0wo.getMeasuredHeight() : 0;
        }
        Rect rect = this.ygLcUYwZ;
        Rect rect2 = this.sjUBp5pO;
        rect2.set(rect);
        this.Ey6iv0m0 = this.amk52bBQ;
        if (!this.Qr9iLBAD && !z) {
            Wi7iiXC4 wi7iiXC4 = this.i7xS8jrb;
            wi0 wi0Var = euDDoUNr;
            Rect rect3 = this.OxcuoDLp;
            zf0.NCTxEWno(wi7iiXC4, wi0Var, rect3);
            if (!rect3.equals(SgZGMMPL)) {
                rect2.top += measuredHeight;
                rect2.bottom = rect2.bottom;
                this.Ey6iv0m0 = this.Ey6iv0m0.qoPGr6Ce.sjUBp5pO(0, measuredHeight, 0, 0);
                b2ZJblxo(this.wxUZMvaN, rect2, true);
                if (!this.I5GHvsYW.equals(this.Ey6iv0m0)) {
                    wi0 wi0Var2 = this.Ey6iv0m0;
                    this.I5GHvsYW = wi0Var2;
                    hg0.NCTxEWno(this.wxUZMvaN, wi0Var2);
                }
                measureChildWithMargins(this.wxUZMvaN, i, 0, i2, 0);
                hGvurcGl hgvurcgl2 = (hGvurcGl) this.wxUZMvaN.getLayoutParams();
                int max3 = Math.max(max, this.wxUZMvaN.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) hgvurcgl2).leftMargin + ((ViewGroup.MarginLayoutParams) hgvurcgl2).rightMargin);
                int max4 = Math.max(max2, this.wxUZMvaN.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) hgvurcgl2).topMargin + ((ViewGroup.MarginLayoutParams) hgvurcgl2).bottomMargin);
                int combineMeasuredStates2 = View.combineMeasuredStates(combineMeasuredStates, this.wxUZMvaN.getMeasuredState());
                setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + max3, getSuggestedMinimumWidth()), i, combineMeasuredStates2), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + max4, getSuggestedMinimumHeight()), i2, combineMeasuredStates2 << 16));
            }
        }
        bn qoPGr6Ce = bn.qoPGr6Ce(this.Ey6iv0m0.qoPGr6Ce(), this.Ey6iv0m0.qoPGr6Ce.ow5vqvCr().NCTxEWno + measuredHeight, this.Ey6iv0m0.NCTxEWno(), this.Ey6iv0m0.qoPGr6Ce.ow5vqvCr().wxUZMvaN);
        wi0 wi0Var3 = this.Ey6iv0m0;
        int i3 = Build.VERSION.SDK_INT;
        ii0 hi0Var = i3 >= 36 ? new hi0(wi0Var3) : i3 >= 35 ? new gi0(wi0Var3) : i3 >= 34 ? new fi0(wi0Var3) : i3 >= 31 ? new ei0(wi0Var3) : i3 >= 30 ? new di0(wi0Var3) : i3 >= 29 ? new ci0(wi0Var3) : new ai0(wi0Var3);
        hi0Var.VgvYg0wo(qoPGr6Ce);
        this.Ey6iv0m0 = hi0Var.NCTxEWno();
        b2ZJblxo(this.wxUZMvaN, rect2, true);
        if (!this.I5GHvsYW.equals(this.Ey6iv0m0)) {
        }
        measureChildWithMargins(this.wxUZMvaN, i, 0, i2, 0);
        hGvurcGl hgvurcgl22 = (hGvurcGl) this.wxUZMvaN.getLayoutParams();
        int max32 = Math.max(max, this.wxUZMvaN.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) hgvurcgl22).leftMargin + ((ViewGroup.MarginLayoutParams) hgvurcgl22).rightMargin);
        int max42 = Math.max(max2, this.wxUZMvaN.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) hgvurcgl22).topMargin + ((ViewGroup.MarginLayoutParams) hgvurcgl22).bottomMargin);
        int combineMeasuredStates22 = View.combineMeasuredStates(combineMeasuredStates, this.wxUZMvaN.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + max32, getSuggestedMinimumWidth()), i, combineMeasuredStates22), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + max42, getSuggestedMinimumHeight()), i2, combineMeasuredStates22 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (!this.eVhOlqcC || !z) {
            return false;
        }
        this.FySoLYna.fling(0, 0, 0, (int) f2, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        if (this.FySoLYna.getFinalY() > this.VgvYg0wo.getHeight()) {
            Qr9iLBAD();
            this.lwWCatUu.run();
        } else {
            Qr9iLBAD();
            this.DK9slbsy.run();
        }
        this.k3x7lurq = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        int i5 = this.ow5vqvCr + i2;
        this.ow5vqvCr = i5;
        setActionBarHideOffset(i5);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        zh0 zh0Var;
        yg0 yg0Var;
        this.U0LaHZX7.qoPGr6Ce = i;
        this.ow5vqvCr = getActionBarHideOffset();
        Qr9iLBAD();
        LvHlPNBd lvHlPNBd = this.RXQxj5Oe;
        if (lvHlPNBd == null || (yg0Var = (zh0Var = (zh0) lvHlPNBd).KlHjfFWx) == null) {
            return;
        }
        yg0Var.qoPGr6Ce();
        zh0Var.KlHjfFWx = null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        if ((i & 2) == 0 || this.VgvYg0wo.getVisibility() != 0) {
            return false;
        }
        return this.eVhOlqcC;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        if (!this.eVhOlqcC || this.k3x7lurq) {
            return;
        }
        if (this.ow5vqvCr <= this.VgvYg0wo.getHeight()) {
            Qr9iLBAD();
            postDelayed(this.DK9slbsy, 600L);
        } else {
            Qr9iLBAD();
            postDelayed(this.lwWCatUu, 600L);
        }
    }

    @Override // android.view.View
    public final void onWindowSystemUiVisibilityChanged(int i) {
        super.onWindowSystemUiVisibilityChanged(i);
        k3x7lurq();
        int i2 = this.OnDfzHZD ^ i;
        this.OnDfzHZD = i;
        boolean z = (i & 4) == 0;
        boolean z2 = (i & 256) != 0;
        LvHlPNBd lvHlPNBd = this.RXQxj5Oe;
        if (lvHlPNBd != null) {
            zh0 zh0Var = (zh0) lvHlPNBd;
            zh0Var.lDXGDhIF = !z2;
            if (z || !z2) {
                if (zh0Var.sjUBp5pO) {
                    zh0Var.sjUBp5pO = false;
                    zh0Var.P7K7Inc8(true);
                }
            } else if (!zh0Var.sjUBp5pO) {
                zh0Var.sjUBp5pO = true;
                zh0Var.P7K7Inc8(true);
            }
        }
        if ((i2 & 256) == 0 || this.RXQxj5Oe == null) {
            return;
        }
        WeakHashMap weakHashMap = hg0.qoPGr6Ce;
        requestApplyInsets();
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        this.MdtA4re8 = i;
        LvHlPNBd lvHlPNBd = this.RXQxj5Oe;
        if (lvHlPNBd != null) {
            ((zh0) lvHlPNBd).ygLcUYwZ = i;
        }
    }

    public final void ow5vqvCr(yr yrVar, os osVar) {
        k3x7lurq();
        dd0 dd0Var = (dd0) this.P7K7Inc8;
        Toolbar toolbar = dd0Var.qoPGr6Ce;
        CTE3lpUp cTE3lpUp = dd0Var.OnDfzHZD;
        if (cTE3lpUp == null) {
            cTE3lpUp = new CTE3lpUp(toolbar.getContext());
            dd0Var.OnDfzHZD = cTE3lpUp;
            cTE3lpUp.eVhOlqcC = R.id.action_menu_presenter;
        }
        cTE3lpUp.P7K7Inc8 = osVar;
        if (yrVar == null && toolbar.NCTxEWno == null) {
            return;
        }
        toolbar.P7K7Inc8();
        yr yrVar2 = toolbar.NCTxEWno.OxcuoDLp;
        if (yrVar2 == yrVar) {
            return;
        }
        if (yrVar2 != null) {
            yrVar2.amk52bBQ(toolbar.Xkz7p5xa);
            yrVar2.amk52bBQ(toolbar.fVMzMhyS);
        }
        if (toolbar.fVMzMhyS == null) {
            toolbar.fVMzMhyS = new xc0(toolbar);
        }
        cTE3lpUp.KlHjfFWx = true;
        Context context = toolbar.k3x7lurq;
        if (yrVar != null) {
            yrVar.NCTxEWno(cTE3lpUp, context);
            yrVar.NCTxEWno(toolbar.fVMzMhyS, toolbar.k3x7lurq);
        } else {
            cTE3lpUp.Qr9iLBAD(context, null);
            toolbar.fVMzMhyS.Qr9iLBAD(toolbar.k3x7lurq, null);
            cTE3lpUp.eVhOlqcC(true);
            toolbar.fVMzMhyS.eVhOlqcC(true);
        }
        toolbar.NCTxEWno.setPopupTheme(toolbar.ow5vqvCr);
        toolbar.NCTxEWno.setPresenter(cTE3lpUp);
        toolbar.Xkz7p5xa = cTE3lpUp;
        toolbar.Ey6iv0m0();
    }

    @Override // defpackage.dw
    public final void qoPGr6Ce(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            onNestedScrollAccepted(view, view2, i);
        }
    }

    public void setActionBarHideOffset(int i) {
        Qr9iLBAD();
        this.VgvYg0wo.setTranslationY(-Math.max(0, Math.min(i, this.VgvYg0wo.getHeight())));
    }

    public void setActionBarVisibilityCallback(LvHlPNBd lvHlPNBd) {
        this.RXQxj5Oe = lvHlPNBd;
        if (getWindowToken() != null) {
            ((zh0) this.RXQxj5Oe).ygLcUYwZ = this.MdtA4re8;
            int i = this.OnDfzHZD;
            if (i != 0) {
                onWindowSystemUiVisibilityChanged(i);
                WeakHashMap weakHashMap = hg0.qoPGr6Ce;
                requestApplyInsets();
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z) {
        this.jb9XjC4I = z;
    }

    public void setHideOnContentScrollEnabled(boolean z) {
        if (z != this.eVhOlqcC) {
            this.eVhOlqcC = z;
            if (z) {
                return;
            }
            Qr9iLBAD();
            setActionBarHideOffset(0);
        }
    }

    public void setIcon(int i) {
        k3x7lurq();
        dd0 dd0Var = (dd0) this.P7K7Inc8;
        dd0Var.wxUZMvaN = i != 0 ? ra.Ey6iv0m0(dd0Var.qoPGr6Ce.getContext(), i) : null;
        dd0Var.MdtA4re8();
    }

    public void setLogo(int i) {
        k3x7lurq();
        dd0 dd0Var = (dd0) this.P7K7Inc8;
        dd0Var.VgvYg0wo = i != 0 ? ra.Ey6iv0m0(dd0Var.qoPGr6Ce.getContext(), i) : null;
        dd0Var.MdtA4re8();
    }

    public void setOverlayMode(boolean z) {
        this.Qr9iLBAD = z;
    }

    public void setWindowCallback(Window.Callback callback) {
        k3x7lurq();
        ((dd0) this.P7K7Inc8).k3x7lurq = callback;
    }

    public void setWindowTitle(CharSequence charSequence) {
        k3x7lurq();
        dd0 dd0Var = (dd0) this.P7K7Inc8;
        if (dd0Var.b2ZJblxo) {
            return;
        }
        Toolbar toolbar = dd0Var.qoPGr6Ce;
        dd0Var.Qr9iLBAD = charSequence;
        if ((dd0Var.NCTxEWno & 8) != 0) {
            toolbar.setTitle(charSequence);
            if (dd0Var.b2ZJblxo) {
                hg0.k3x7lurq(toolbar.getRootView(), charSequence);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new hGvurcGl(layoutParams);
    }

    public void setIcon(Drawable drawable) {
        k3x7lurq();
        dd0 dd0Var = (dd0) this.P7K7Inc8;
        dd0Var.wxUZMvaN = drawable;
        dd0Var.MdtA4re8();
    }

    public void setShowingForActionMode(boolean z) {
    }

    public void setUiOptions(int i) {
    }

    public ActionBarOverlayLayout(Context context) {
        this(context, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
    }

    @Override // defpackage.dw
    public final void wxUZMvaN(int i, int i2, int[] iArr, int i3) {
    }
}
