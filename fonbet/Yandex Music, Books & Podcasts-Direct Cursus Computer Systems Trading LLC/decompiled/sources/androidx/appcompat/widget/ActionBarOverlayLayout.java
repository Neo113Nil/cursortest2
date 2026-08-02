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
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;
import androidx.annotation.NonNull;
import defpackage.aqv;
import defpackage.c9n;
import defpackage.dg;
import defpackage.dh7;
import defpackage.fyh;
import defpackage.hpv;
import defpackage.hqv;
import defpackage.hxh;
import defpackage.kqv;
import defpackage.ldu;
import defpackage.le;
import defpackage.me;
import defpackage.myi;
import defpackage.ndu;
import defpackage.ne;
import defpackage.nyi;
import defpackage.oe;
import defpackage.oyi;
import defpackage.pe;
import defpackage.pos;
import defpackage.wdu;
import defpackage.wpv;
import defpackage.xgu;
import defpackage.xpv;
import defpackage.xq0;
import defpackage.y2x;
import defpackage.ypv;
import defpackage.zne;
import defpackage.zos;
import defpackage.zpv;
import java.util.WeakHashMap;
import ru.yandex.music.R;

/* loaded from: classes.dex */
public class ActionBarOverlayLayout extends ViewGroup implements oyi, myi, nyi {
    public static final int[] C = {R.attr.actionBarSize, android.R.attr.windowContentOverlay};
    public static final kqv D;
    public static final Rect E;
    public final c9n A;
    public final pe B;
    public int a;
    public int b;
    public ContentFrameLayout c;
    public ActionBarContainer d;
    public dh7 e;
    public Drawable f;
    public boolean g;
    public boolean h;
    public boolean i;
    public boolean j;
    public int k;
    public int l;
    public final Rect m;
    public final Rect n;
    public final Rect o;
    public final Rect p;
    public kqv q;
    public kqv r;
    public kqv s;
    public kqv t;
    public ne u;
    public OverScroller v;
    public ViewPropertyAnimator w;
    public final le x;
    public final me y;
    public final me z;

    static {
        int i = Build.VERSION.SDK_INT;
        aqv zpvVar = i >= 34 ? new zpv() : i >= 30 ? new ypv() : i >= 29 ? new xpv() : new wpv();
        zpvVar.g(zne.c(0, 1, 0, 1));
        D = zpvVar.b();
        E = new Rect();
    }

    public ActionBarOverlayLayout(@NonNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = 0;
        this.m = new Rect();
        this.n = new Rect();
        this.o = new Rect();
        this.p = new Rect();
        new Rect();
        new Rect();
        new Rect();
        new Rect();
        kqv kqvVar = kqv.b;
        this.q = kqvVar;
        this.r = kqvVar;
        this.s = kqvVar;
        this.t = kqvVar;
        this.x = new le(0, this);
        this.y = new me(this, 0);
        this.z = new me(this, 1);
        e(context);
        this.A = new c9n(9, (byte) 0);
        pe peVar = new pe(context);
        peVar.setWillNotDraw(true);
        this.B = peVar;
        addView(peVar);
    }

    public static boolean a(View view, Rect rect, boolean z) {
        boolean z2;
        oe oeVar = (oe) view.getLayoutParams();
        int i = ((ViewGroup.MarginLayoutParams) oeVar).leftMargin;
        int i2 = rect.left;
        if (i != i2) {
            ((ViewGroup.MarginLayoutParams) oeVar).leftMargin = i2;
            z2 = true;
        } else {
            z2 = false;
        }
        int i3 = ((ViewGroup.MarginLayoutParams) oeVar).topMargin;
        int i4 = rect.top;
        if (i3 != i4) {
            ((ViewGroup.MarginLayoutParams) oeVar).topMargin = i4;
            z2 = true;
        }
        int i5 = ((ViewGroup.MarginLayoutParams) oeVar).rightMargin;
        int i6 = rect.right;
        if (i5 != i6) {
            ((ViewGroup.MarginLayoutParams) oeVar).rightMargin = i6;
            z2 = true;
        }
        if (z) {
            int i7 = ((ViewGroup.MarginLayoutParams) oeVar).bottomMargin;
            int i8 = rect.bottom;
            if (i7 != i8) {
                ((ViewGroup.MarginLayoutParams) oeVar).bottomMargin = i8;
                return true;
            }
        }
        return z2;
    }

    public final void b() {
        removeCallbacks(this.y);
        removeCallbacks(this.z);
        ViewPropertyAnimator viewPropertyAnimator = this.w;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    @Override // defpackage.myi
    public final void c(int i, View view) {
        if (i == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof oe;
    }

    @Override // defpackage.myi
    public final void d(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            onNestedScrollAccepted(view, view2, i);
        }
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i;
        super.draw(canvas);
        if (this.f != null) {
            if (this.d.getVisibility() == 0) {
                i = (int) (this.d.getTranslationY() + this.d.getBottom() + 0.5f);
            } else {
                i = 0;
            }
            this.f.setBounds(0, i, getWidth(), this.f.getIntrinsicHeight() + i);
            this.f.draw(canvas);
        }
    }

    public final void e(Context context) {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(C);
        this.a = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        this.f = drawable;
        setWillNotDraw(drawable == null);
        obtainStyledAttributes.recycle();
        this.v = new OverScroller(context);
    }

    public final void f(int i) {
        i();
        if (i == 2) {
            ((zos) this.e).getClass();
            Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
        } else if (i == 5) {
            ((zos) this.e).getClass();
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

    @Override // defpackage.myi
    public final void g(View view, int i, int i2, int[] iArr, int i3) {
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new oe(-1, -1);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new oe(getContext(), attributeSet);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.d;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        c9n c9nVar = this.A;
        return c9nVar.c | c9nVar.b;
    }

    public CharSequence getTitle() {
        i();
        return ((zos) this.e).a.getTitle();
    }

    @Override // defpackage.nyi
    public final void h(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        k(view, i, i2, i3, i4, i5);
    }

    public final void i() {
        dh7 wrapper;
        if (this.c == null) {
            this.c = (ContentFrameLayout) findViewById(R.id.action_bar_activity_content);
            this.d = (ActionBarContainer) findViewById(R.id.action_bar_container);
            KeyEvent.Callback findViewById = findViewById(R.id.action_bar);
            if (findViewById instanceof dh7) {
                wrapper = (dh7) findViewById;
            } else {
                if (!(findViewById instanceof Toolbar)) {
                    xq0.q("Can't make a decor toolbar out of ".concat(findViewById.getClass().getSimpleName()));
                    return;
                }
                wrapper = ((Toolbar) findViewById).getWrapper();
            }
            this.e = wrapper;
        }
    }

    public final void j(Menu menu, fyh fyhVar) {
        i();
        zos zosVar = (zos) this.e;
        Toolbar toolbar = zosVar.a;
        if (zosVar.m == null) {
            zosVar.m = new dg(toolbar.getContext());
        }
        dg dgVar = zosVar.m;
        dgVar.e = fyhVar;
        hxh hxhVar = (hxh) menu;
        if (hxhVar == null && toolbar.a == null) {
            return;
        }
        toolbar.f();
        hxh hxhVar2 = toolbar.a.p;
        if (hxhVar2 == hxhVar) {
            return;
        }
        if (hxhVar2 != null) {
            hxhVar2.r(toolbar.L);
            hxhVar2.r(toolbar.v0);
        }
        if (toolbar.v0 == null) {
            toolbar.v0 = new pos(toolbar);
        }
        dgVar.q = true;
        Context context = toolbar.j;
        if (hxhVar != null) {
            hxhVar.b(dgVar, context);
            hxhVar.b(toolbar.v0, toolbar.j);
        } else {
            dgVar.j(context, null);
            toolbar.v0.j(toolbar.j, null);
            dgVar.g();
            toolbar.v0.g();
        }
        toolbar.a.setPopupTheme(toolbar.k);
        toolbar.a.setPresenter(dgVar);
        toolbar.L = dgVar;
        toolbar.w();
    }

    @Override // defpackage.myi
    public final void k(View view, int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            onNestedScroll(view, i, i2, i3, i4);
        }
    }

    @Override // defpackage.myi
    public final boolean o(View view, View view2, int i, int i2) {
        return i2 == 0 && onStartNestedScroll(view, view2, i);
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        i();
        kqv h = kqv.h(this, windowInsets);
        boolean a = a(this.d, new Rect(h.b(), h.d(), h.c(), h.a()), false);
        WeakHashMap weakHashMap = wdu.a;
        Rect rect = this.m;
        ndu.b(this, h, rect);
        int i = rect.left;
        int i2 = rect.top;
        int i3 = rect.right;
        int i4 = rect.bottom;
        hqv hqvVar = h.a;
        kqv n = hqvVar.n(i, i2, i3, i4);
        this.q = n;
        boolean z = true;
        if (!this.r.equals(n)) {
            this.r = this.q;
            a = true;
        }
        Rect rect2 = this.n;
        if (rect2.equals(rect)) {
            z = a;
        } else {
            rect2.set(rect);
        }
        if (z) {
            requestLayout();
        }
        return hqvVar.a().a.c().a.b().g();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        e(getContext());
        WeakHashMap weakHashMap = wdu.a;
        ldu.c(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                oe oeVar = (oe) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i6 = ((ViewGroup.MarginLayoutParams) oeVar).leftMargin + paddingLeft;
                int i7 = ((ViewGroup.MarginLayoutParams) oeVar).topMargin + paddingTop;
                childAt.layout(i6, i7, measuredWidth + i6, measuredHeight + i7);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0106  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i, int i2) {
        int measuredHeight;
        i();
        measureChildWithMargins(this.d, i, 0, i2, 0);
        oe oeVar = (oe) this.d.getLayoutParams();
        int max = Math.max(0, this.d.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) oeVar).leftMargin + ((ViewGroup.MarginLayoutParams) oeVar).rightMargin);
        int max2 = Math.max(0, this.d.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) oeVar).topMargin + ((ViewGroup.MarginLayoutParams) oeVar).bottomMargin);
        int combineMeasuredStates = View.combineMeasuredStates(0, this.d.getMeasuredState());
        WeakHashMap weakHashMap = wdu.a;
        boolean z = (getWindowSystemUiVisibility() & 256) != 0;
        if (z) {
            measuredHeight = this.a;
            if (this.h && this.d.getTabContainer() != null) {
                measuredHeight += this.a;
            }
        } else {
            measuredHeight = this.d.getVisibility() != 8 ? this.d.getMeasuredHeight() : 0;
        }
        Rect rect = this.m;
        Rect rect2 = this.o;
        rect2.set(rect);
        this.s = this.q;
        if (!this.g && !z) {
            pe peVar = this.B;
            kqv kqvVar = D;
            Rect rect3 = this.p;
            ndu.b(peVar, kqvVar, rect3);
            if (!rect3.equals(E)) {
                rect2.top += measuredHeight;
                rect2.bottom = rect2.bottom;
                this.s = this.s.a.n(0, measuredHeight, 0, 0);
                a(this.c, rect2, true);
                if (!this.t.equals(this.s)) {
                    kqv kqvVar2 = this.s;
                    this.t = kqvVar2;
                    wdu.c(this.c, kqvVar2);
                }
                measureChildWithMargins(this.c, i, 0, i2, 0);
                oe oeVar2 = (oe) this.c.getLayoutParams();
                int max3 = Math.max(max, this.c.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) oeVar2).leftMargin + ((ViewGroup.MarginLayoutParams) oeVar2).rightMargin);
                int max4 = Math.max(max2, this.c.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) oeVar2).topMargin + ((ViewGroup.MarginLayoutParams) oeVar2).bottomMargin);
                int combineMeasuredStates2 = View.combineMeasuredStates(combineMeasuredStates, this.c.getMeasuredState());
                setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + max3, getSuggestedMinimumWidth()), i, combineMeasuredStates2), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + max4, getSuggestedMinimumHeight()), i2, combineMeasuredStates2 << 16));
            }
        }
        zne c = zne.c(this.s.b(), this.s.d() + measuredHeight, this.s.c(), this.s.a());
        kqv kqvVar3 = this.s;
        int i3 = Build.VERSION.SDK_INT;
        aqv zpvVar = i3 >= 34 ? new zpv(kqvVar3) : i3 >= 30 ? new ypv(kqvVar3) : i3 >= 29 ? new xpv(kqvVar3) : new wpv(kqvVar3);
        zpvVar.g(c);
        this.s = zpvVar.b();
        a(this.c, rect2, true);
        if (!this.t.equals(this.s)) {
        }
        measureChildWithMargins(this.c, i, 0, i2, 0);
        oe oeVar22 = (oe) this.c.getLayoutParams();
        int max32 = Math.max(max, this.c.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) oeVar22).leftMargin + ((ViewGroup.MarginLayoutParams) oeVar22).rightMargin);
        int max42 = Math.max(max2, this.c.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) oeVar22).topMargin + ((ViewGroup.MarginLayoutParams) oeVar22).bottomMargin);
        int combineMeasuredStates22 = View.combineMeasuredStates(combineMeasuredStates, this.c.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + max32, getSuggestedMinimumWidth()), i, combineMeasuredStates22), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + max42, getSuggestedMinimumHeight()), i2, combineMeasuredStates22 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (!this.i || !z) {
            return false;
        }
        this.v.fling(0, 0, 0, (int) f2, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        if (this.v.getFinalY() > this.d.getHeight()) {
            b();
            this.z.run();
        } else {
            b();
            this.y.run();
        }
        this.j = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        int i5 = this.k + i2;
        this.k = i5;
        setActionBarHideOffset(i5);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        hpv hpvVar;
        xgu xguVar;
        this.A.b = i;
        this.k = getActionBarHideOffset();
        b();
        ne neVar = this.u;
        if (neVar == null || (xguVar = (hpvVar = (hpv) neVar).t) == null) {
            return;
        }
        xguVar.a();
        hpvVar.t = null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        if ((i & 2) == 0 || this.d.getVisibility() != 0) {
            return false;
        }
        return this.i;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        if (!this.i || this.j) {
            return;
        }
        if (this.k <= this.d.getHeight()) {
            b();
            postDelayed(this.y, 600L);
        } else {
            b();
            postDelayed(this.z, 600L);
        }
    }

    @Override // android.view.View
    public final void onWindowSystemUiVisibilityChanged(int i) {
        super.onWindowSystemUiVisibilityChanged(i);
        i();
        int i2 = this.l ^ i;
        this.l = i;
        boolean z = (i & 4) == 0;
        boolean z2 = (i & 256) != 0;
        ne neVar = this.u;
        if (neVar != null) {
            hpv hpvVar = (hpv) neVar;
            hpvVar.o = !z2;
            if (z || !z2) {
                if (hpvVar.q) {
                    hpvVar.q = false;
                    hpvVar.z(true);
                }
            } else if (!hpvVar.q) {
                hpvVar.q = true;
                hpvVar.z(true);
            }
        }
        if ((i2 & 256) == 0 || this.u == null) {
            return;
        }
        WeakHashMap weakHashMap = wdu.a;
        ldu.c(this);
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        this.b = i;
        ne neVar = this.u;
        if (neVar != null) {
            ((hpv) neVar).n = i;
        }
    }

    public void setActionBarHideOffset(int i) {
        b();
        this.d.setTranslationY(-Math.max(0, Math.min(i, this.d.getHeight())));
    }

    public void setActionBarVisibilityCallback(ne neVar) {
        this.u = neVar;
        if (getWindowToken() != null) {
            ((hpv) this.u).n = this.b;
            int i = this.l;
            if (i != 0) {
                onWindowSystemUiVisibilityChanged(i);
                WeakHashMap weakHashMap = wdu.a;
                ldu.c(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z) {
        this.h = z;
    }

    public void setHideOnContentScrollEnabled(boolean z) {
        if (z != this.i) {
            this.i = z;
            if (z) {
                return;
            }
            b();
            setActionBarHideOffset(0);
        }
    }

    public void setIcon(int i) {
        i();
        zos zosVar = (zos) this.e;
        zosVar.d = i != 0 ? y2x.w(zosVar.a.getContext(), i) : null;
        zosVar.d();
    }

    public void setLogo(int i) {
        i();
        zos zosVar = (zos) this.e;
        zosVar.e = i != 0 ? y2x.w(zosVar.a.getContext(), i) : null;
        zosVar.d();
    }

    public void setOverlayMode(boolean z) {
        this.g = z;
    }

    public void setShowingForActionMode(boolean z) {
    }

    public void setUiOptions(int i) {
    }

    public void setWindowCallback(Window.Callback callback) {
        i();
        ((zos) this.e).k = callback;
    }

    public void setWindowTitle(CharSequence charSequence) {
        i();
        zos zosVar = (zos) this.e;
        if (zosVar.g) {
            return;
        }
        Toolbar toolbar = zosVar.a;
        zosVar.h = charSequence;
        if ((zosVar.b & 8) != 0) {
            toolbar.setTitle(charSequence);
            if (zosVar.g) {
                wdu.r(toolbar.getRootView(), charSequence);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new oe(layoutParams);
    }

    public void setIcon(Drawable drawable) {
        i();
        zos zosVar = (zos) this.e;
        zosVar.d = drawable;
        zosVar.d();
    }

    public ActionBarOverlayLayout(@NonNull Context context) {
        this(context, null);
    }
}
