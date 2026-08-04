package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;
import com.gamericefishpro.space.R;
import com.gamericefishpro.space.d4.a1;
import com.gamericefishpro.space.d4.b0;
import com.gamericefishpro.space.d4.b1;
import com.gamericefishpro.space.d4.c1;
import com.gamericefishpro.space.d4.d0;
import com.gamericefishpro.space.d4.d1;
import com.gamericefishpro.space.d4.l0;
import com.gamericefishpro.space.d4.l1;
import com.gamericefishpro.space.d4.m;
import com.gamericefishpro.space.d4.n;
import com.gamericefishpro.space.d4.o;
import com.gamericefishpro.space.d4.o1;
import com.gamericefishpro.space.d4.y0;
import com.gamericefishpro.space.d4.z0;
import com.gamericefishpro.space.i6.i;
import com.gamericefishpro.space.n.b;
import com.gamericefishpro.space.n.c;
import com.gamericefishpro.space.n.d;
import com.gamericefishpro.space.n.e;
import com.gamericefishpro.space.n.g2;
import com.gamericefishpro.space.n.p0;
import com.gamericefishpro.space.u6.f;
import java.lang.reflect.Field;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public class ActionBarOverlayLayout extends ViewGroup implements m, n {
    public static final int[] S = {R.attr.actionBarSize, android.R.attr.windowContentOverlay};
    public static final o1 T;
    public static final Rect U;
    public boolean A;
    public boolean B;
    public int C;
    public final Rect D;
    public final Rect E;
    public final Rect F;
    public final Rect G;
    public o1 H;
    public o1 I;
    public o1 J;
    public o1 K;
    public OverScroller L;
    public ViewPropertyAnimator M;
    public final i N;
    public final b O;
    public final b P;
    public final o Q;
    public final e R;
    public int d;
    public ContentFrameLayout e;
    public ActionBarContainer i;
    public p0 v;
    public Drawable w;
    public boolean y;
    public boolean z;

    static {
        d1 z0Var;
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            z0Var = new c1();
        } else if (i >= 31) {
            z0Var = new b1();
        } else if (i >= 30) {
            z0Var = new a1();
        } else {
            z0Var = i >= 29 ? new z0() : new y0();
        }
        z0Var.g(com.gamericefishpro.space.u3.b.b(0, 1, 0, 1));
        T = z0Var.b();
        U = new Rect();
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.D = new Rect();
        this.E = new Rect();
        this.F = new Rect();
        this.G = new Rect();
        new Rect();
        new Rect();
        new Rect();
        new Rect();
        o1 o1Var = o1.b;
        this.H = o1Var;
        this.I = o1Var;
        this.J = o1Var;
        this.K = o1Var;
        this.N = new i(1, this);
        this.O = new b(this, 0);
        this.P = new b(this, 1);
        i(context);
        this.Q = new o();
        e eVar = new e(context);
        eVar.setWillNotDraw(true);
        this.R = eVar;
        addView(eVar);
    }

    public static boolean d(View view, Rect rect, boolean z) {
        boolean z2;
        d dVar = (d) view.getLayoutParams();
        int i = ((ViewGroup.MarginLayoutParams) dVar).leftMargin;
        int i2 = rect.left;
        if (i != i2) {
            ((ViewGroup.MarginLayoutParams) dVar).leftMargin = i2;
            z2 = true;
        } else {
            z2 = false;
        }
        int i3 = ((ViewGroup.MarginLayoutParams) dVar).topMargin;
        int i4 = rect.top;
        if (i3 != i4) {
            ((ViewGroup.MarginLayoutParams) dVar).topMargin = i4;
            z2 = true;
        }
        int i5 = ((ViewGroup.MarginLayoutParams) dVar).rightMargin;
        int i6 = rect.right;
        if (i5 != i6) {
            ((ViewGroup.MarginLayoutParams) dVar).rightMargin = i6;
            z2 = true;
        }
        if (z) {
            int i7 = ((ViewGroup.MarginLayoutParams) dVar).bottomMargin;
            int i8 = rect.bottom;
            if (i7 != i8) {
                ((ViewGroup.MarginLayoutParams) dVar).bottomMargin = i8;
                return true;
            }
        }
        return z2;
    }

    @Override // com.gamericefishpro.space.d4.m
    public final void a(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            onNestedScrollAccepted(view, view2, i);
        }
    }

    @Override // com.gamericefishpro.space.d4.m
    public final void b(View view, int i) {
        if (i == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof d;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int translationY;
        super.draw(canvas);
        if (this.w != null) {
            if (this.i.getVisibility() == 0) {
                translationY = (int) (this.i.getTranslationY() + this.i.getBottom() + 0.5f);
            } else {
                translationY = 0;
            }
            this.w.setBounds(0, translationY, getWidth(), this.w.getIntrinsicHeight() + translationY);
            this.w.draw(canvas);
        }
    }

    public final void e() {
        removeCallbacks(this.O);
        removeCallbacks(this.P);
        ViewPropertyAnimator viewPropertyAnimator = this.M;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    @Override // com.gamericefishpro.space.d4.n
    public final void f(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        g(view, i, i2, i3, i4, i5);
    }

    @Override // android.view.View
    public final boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    @Override // com.gamericefishpro.space.d4.m
    public final void g(View view, int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            onNestedScroll(view, i, i2, i3, i4);
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new d(-1, -1);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new d(getContext(), attributeSet);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.i;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        o oVar = this.Q;
        return oVar.b | oVar.a;
    }

    public CharSequence getTitle() {
        j();
        return ((g2) this.v).a.getTitle();
    }

    @Override // com.gamericefishpro.space.d4.m
    public final boolean h(View view, View view2, int i, int i2) {
        return i2 == 0 && onStartNestedScroll(view, view2, i);
    }

    public final void i(Context context) {
        TypedArray typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(S);
        this.d = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(1);
        this.w = drawable;
        setWillNotDraw(drawable == null);
        typedArrayObtainStyledAttributes.recycle();
        this.L = new OverScroller(context);
    }

    public final void j() {
        p0 wrapper;
        if (this.e == null) {
            this.e = (ContentFrameLayout) findViewById(R.id.action_bar_activity_content);
            this.i = (ActionBarContainer) findViewById(R.id.action_bar_container);
            KeyEvent.Callback callbackFindViewById = findViewById(R.id.action_bar);
            if (callbackFindViewById instanceof p0) {
                wrapper = (p0) callbackFindViewById;
            } else {
                if (!(callbackFindViewById instanceof Toolbar)) {
                    throw new IllegalStateException("Can't make a decor toolbar out of ".concat(callbackFindViewById.getClass().getSimpleName()));
                }
                wrapper = ((Toolbar) callbackFindViewById).getWrapper();
            }
            this.v = wrapper;
        }
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        j();
        o1 o1VarD = o1.d(this, windowInsets);
        l1 l1Var = o1VarD.a;
        boolean zD = d(this.i, new Rect(l1Var.l().a, o1VarD.a(), l1Var.l().c, l1Var.l().d), false);
        Field field = l0.a;
        Rect rect = this.D;
        d0.b(this, o1VarD, rect);
        o1 o1VarN = l1Var.n(rect.left, rect.top, rect.right, rect.bottom);
        this.H = o1VarN;
        boolean z = true;
        if (!this.I.equals(o1VarN)) {
            this.I = this.H;
            zD = true;
        }
        Rect rect2 = this.E;
        if (rect2.equals(rect)) {
            z = zD;
        } else {
            rect2.set(rect);
        }
        if (z) {
            requestLayout();
        }
        return l1Var.a().a.c().a.b().c();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        i(getContext());
        Field field = l0.a;
        b0.c(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        e();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                d dVar = (d) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i6 = ((ViewGroup.MarginLayoutParams) dVar).leftMargin + paddingLeft;
                int i7 = ((ViewGroup.MarginLayoutParams) dVar).topMargin + paddingTop;
                childAt.layout(i6, i7, measuredWidth + i6, measuredHeight + i7);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:24:0x00db  */
    /* JADX WARN: Code duplicated, block: B:25:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:27:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:28:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:30:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:31:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:33:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:34:0x00ff  */
    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int measuredHeight;
        o1 o1Var;
        int i3;
        d1 y0Var;
        j();
        measureChildWithMargins(this.i, i, 0, i2, 0);
        d dVar = (d) this.i.getLayoutParams();
        int iMax = Math.max(0, this.i.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) dVar).leftMargin + ((ViewGroup.MarginLayoutParams) dVar).rightMargin);
        int iMax2 = Math.max(0, this.i.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) dVar).topMargin + ((ViewGroup.MarginLayoutParams) dVar).bottomMargin);
        int iCombineMeasuredStates = View.combineMeasuredStates(0, this.i.getMeasuredState());
        Field field = l0.a;
        boolean z = (getWindowSystemUiVisibility() & 256) != 0;
        if (z) {
            measuredHeight = this.d;
            if (this.z && this.i.getTabContainer() != null) {
                measuredHeight += this.d;
            }
        } else {
            measuredHeight = this.i.getVisibility() != 8 ? this.i.getMeasuredHeight() : 0;
        }
        Rect rect = this.D;
        Rect rect2 = this.F;
        rect2.set(rect);
        this.J = this.H;
        if (this.y || z) {
            com.gamericefishpro.space.u3.b bVarB = com.gamericefishpro.space.u3.b.b(this.J.a.l().a, this.J.a() + measuredHeight, this.J.a.l().c, this.J.a.l().d);
            o1Var = this.J;
            i3 = Build.VERSION.SDK_INT;
            if (i3 >= 34) {
                y0Var = new c1(o1Var);
            } else if (i3 >= 31) {
                y0Var = new b1(o1Var);
            } else if (i3 >= 30) {
                y0Var = new a1(o1Var);
            } else if (i3 >= 29) {
                y0Var = new z0(o1Var);
            } else {
                y0Var = new y0(o1Var);
            }
            y0Var.g(bVarB);
            this.J = y0Var.b();
        } else {
            e eVar = this.R;
            o1 o1Var2 = T;
            Rect rect3 = this.G;
            d0.b(eVar, o1Var2, rect3);
            if (rect3.equals(U)) {
                com.gamericefishpro.space.u3.b bVarB2 = com.gamericefishpro.space.u3.b.b(this.J.a.l().a, this.J.a() + measuredHeight, this.J.a.l().c, this.J.a.l().d);
                o1Var = this.J;
                i3 = Build.VERSION.SDK_INT;
                if (i3 >= 34) {
                    y0Var = new c1(o1Var);
                } else if (i3 >= 31) {
                    y0Var = new b1(o1Var);
                } else if (i3 >= 30) {
                    y0Var = new a1(o1Var);
                } else if (i3 >= 29) {
                    y0Var = new z0(o1Var);
                } else {
                    y0Var = new y0(o1Var);
                }
                y0Var.g(bVarB2);
                this.J = y0Var.b();
            } else {
                rect2.top += measuredHeight;
                rect2.bottom = rect2.bottom;
                this.J = this.J.a.n(0, measuredHeight, 0, 0);
            }
        }
        d(this.e, rect2, true);
        if (!this.K.equals(this.J)) {
            o1 o1Var3 = this.J;
            this.K = o1Var3;
            l0.b(this.e, o1Var3);
        }
        measureChildWithMargins(this.e, i, 0, i2, 0);
        d dVar2 = (d) this.e.getLayoutParams();
        int iMax3 = Math.max(iMax, this.e.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) dVar2).leftMargin + ((ViewGroup.MarginLayoutParams) dVar2).rightMargin);
        int iMax4 = Math.max(iMax2, this.e.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) dVar2).topMargin + ((ViewGroup.MarginLayoutParams) dVar2).bottomMargin);
        int iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.e.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + iMax3, getSuggestedMinimumWidth()), i, iCombineMeasuredStates2), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + iMax4, getSuggestedMinimumHeight()), i2, iCombineMeasuredStates2 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (!this.A || !z) {
            return false;
        }
        this.L.fling(0, 0, 0, (int) f2, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        if (this.L.getFinalY() > this.i.getHeight()) {
            e();
            this.P.run();
        } else {
            e();
            this.O.run();
        }
        this.B = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        int i5 = this.C + i2;
        this.C = i5;
        setActionBarHideOffset(i5);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        this.Q.a = i;
        this.C = getActionBarHideOffset();
        e();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        if ((i & 2) == 0 || this.i.getVisibility() != 0) {
            return false;
        }
        return this.A;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        if (!this.A || this.B) {
            return;
        }
        if (this.C <= this.i.getHeight()) {
            e();
            postDelayed(this.O, 600L);
        } else {
            e();
            postDelayed(this.P, 600L);
        }
    }

    @Override // android.view.View
    public final void onWindowSystemUiVisibilityChanged(int i) {
        super.onWindowSystemUiVisibilityChanged(i);
        j();
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
    }

    public void setActionBarHideOffset(int i) {
        e();
        this.i.setTranslationY(-Math.max(0, Math.min(i, this.i.getHeight())));
    }

    public void setActionBarVisibilityCallback(c cVar) {
        if (getWindowToken() != null) {
            throw null;
        }
    }

    public void setHasNonEmbeddedTabs(boolean z) {
        this.z = z;
    }

    public void setHideOnContentScrollEnabled(boolean z) {
        if (z != this.A) {
            this.A = z;
            if (z) {
                return;
            }
            e();
            setActionBarHideOffset(0);
        }
    }

    public void setIcon(int i) {
        j();
        g2 g2Var = (g2) this.v;
        g2Var.d = i != 0 ? f.x(g2Var.a.getContext(), i) : null;
        g2Var.c();
    }

    public void setLogo(int i) {
        j();
        g2 g2Var = (g2) this.v;
        g2Var.e = i != 0 ? f.x(g2Var.a.getContext(), i) : null;
        g2Var.c();
    }

    public void setOverlayMode(boolean z) {
        this.y = z;
    }

    public void setWindowCallback(Window.Callback callback) {
        j();
        ((g2) this.v).k = callback;
    }

    public void setWindowTitle(CharSequence charSequence) {
        j();
        g2 g2Var = (g2) this.v;
        if (g2Var.g) {
            return;
        }
        Toolbar toolbar = g2Var.a;
        g2Var.h = charSequence;
        if ((g2Var.b & 8) != 0) {
            toolbar.setTitle(charSequence);
            if (g2Var.g) {
                l0.m(toolbar.getRootView(), charSequence);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new d(layoutParams);
    }

    public void setIcon(Drawable drawable) {
        j();
        g2 g2Var = (g2) this.v;
        g2Var.d = drawable;
        g2Var.c();
    }

    public void setShowingForActionMode(boolean z) {
    }

    public void setUiOptions(int i) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
    }

    @Override // com.gamericefishpro.space.d4.m
    public final void c(View view, int i, int i2, int[] iArr, int i3) {
    }
}
