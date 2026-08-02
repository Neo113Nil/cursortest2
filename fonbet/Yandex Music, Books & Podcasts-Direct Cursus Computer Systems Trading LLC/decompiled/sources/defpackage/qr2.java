package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.WeakHashMap;
import ru.yandex.music.R;

/* loaded from: classes3.dex */
public class qr2 extends HorizontalScrollView {
    public static final k5c G = new k5c(1);
    public static final ehm H = new ehm(16);
    public h2k A;
    public nr2 B;
    public pr2 C;
    public final ma D;
    public one E;
    public final dhm F;
    public final ArrayList a;
    public or2 b;
    public final mr2 c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public long h;
    public final int i;
    public ky9 j;
    public ColorStateList k;
    public final boolean l;
    public int m;
    public final int n;
    public final int o;
    public final int p;
    public final boolean q;
    public final boolean r;
    public final int s;
    public final sxi t;
    public final int u;
    public final int v;
    public int w;
    public jr2 x;
    public ValueAnimator y;
    public lgu z;

    public qr2(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = new ArrayList();
        this.h = 300L;
        this.j = ky9.a;
        this.m = Integer.MAX_VALUE;
        this.t = new sxi(this, ViewConfiguration.get(getContext()).getScaledTouchSlop());
        this.F = new dhm(12);
        setHorizontalScrollBarEnabled(false);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, xdn.d, i, R.style.Div_Tabs_IndicatorTabLayout);
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, xdn.a, 0, 0);
        int dimensionPixelSize = obtainStyledAttributes2.getDimensionPixelSize(3, 0);
        int dimensionPixelSize2 = obtainStyledAttributes2.getDimensionPixelSize(2, 0);
        this.l = obtainStyledAttributes2.getBoolean(6, false);
        this.v = obtainStyledAttributes2.getDimensionPixelSize(0, 0);
        this.q = obtainStyledAttributes2.getBoolean(1, true);
        this.r = obtainStyledAttributes2.getBoolean(5, false);
        this.s = obtainStyledAttributes2.getDimensionPixelSize(4, 0);
        obtainStyledAttributes2.recycle();
        mr2 mr2Var = new mr2(context, dimensionPixelSize, dimensionPixelSize2);
        this.c = mr2Var;
        super.addView(mr2Var, 0, new FrameLayout.LayoutParams(-2, -1));
        int dimensionPixelSize3 = obtainStyledAttributes.getDimensionPixelSize(11, 0);
        if (mr2Var.a != dimensionPixelSize3) {
            mr2Var.a = dimensionPixelSize3;
            WeakHashMap weakHashMap = wdu.a;
            mr2Var.postInvalidateOnAnimation();
        }
        int color = obtainStyledAttributes.getColor(8, 0);
        if (mr2Var.b != color) {
            if ((color >> 24) == 0) {
                mr2Var.b = -1;
            } else {
                mr2Var.b = color;
            }
            WeakHashMap weakHashMap2 = wdu.a;
            mr2Var.postInvalidateOnAnimation();
        }
        int color2 = obtainStyledAttributes.getColor(0, 0);
        if (mr2Var.c != color2) {
            if ((color2 >> 24) == 0) {
                mr2Var.c = -1;
            } else {
                mr2Var.c = color2;
            }
            WeakHashMap weakHashMap3 = wdu.a;
            mr2Var.postInvalidateOnAnimation();
        }
        Context context2 = getContext();
        ma maVar = new ma();
        maVar.c = context2;
        maVar.d = mr2Var;
        this.D = maVar;
        int dimensionPixelSize4 = obtainStyledAttributes.getDimensionPixelSize(16, 0);
        this.g = dimensionPixelSize4;
        this.f = dimensionPixelSize4;
        this.e = dimensionPixelSize4;
        this.d = dimensionPixelSize4;
        this.d = obtainStyledAttributes.getDimensionPixelSize(19, dimensionPixelSize4);
        this.e = obtainStyledAttributes.getDimensionPixelSize(20, dimensionPixelSize4);
        this.f = obtainStyledAttributes.getDimensionPixelSize(18, dimensionPixelSize4);
        this.g = obtainStyledAttributes.getDimensionPixelSize(17, dimensionPixelSize4);
        int resourceId = obtainStyledAttributes.getResourceId(24, R.style.Div_Tabs_IndicatorTabLayout_Text);
        this.i = resourceId;
        TypedArray obtainStyledAttributes3 = context.obtainStyledAttributes(resourceId, ken.y);
        try {
            this.k = obtainStyledAttributes3.getColorStateList(3);
            obtainStyledAttributes3.recycle();
            if (obtainStyledAttributes.hasValue(25)) {
                this.k = obtainStyledAttributes.getColorStateList(25);
            }
            if (obtainStyledAttributes.hasValue(23)) {
                this.k = f(this.k.getDefaultColor(), obtainStyledAttributes.getColor(23, 0));
            }
            this.n = obtainStyledAttributes.getDimensionPixelSize(14, -1);
            this.o = obtainStyledAttributes.getDimensionPixelSize(13, -1);
            this.u = obtainStyledAttributes.getDimensionPixelSize(1, 0);
            this.w = obtainStyledAttributes.getInt(15, 1);
            obtainStyledAttributes.recycle();
            this.p = getResources().getDimensionPixelSize(R.dimen.tab_scrollable_min_width);
            d();
        } catch (Throwable th) {
            obtainStyledAttributes3.recycle();
            throw th;
        }
    }

    public static ColorStateList f(int i, int i2) {
        return new ColorStateList(new int[][]{HorizontalScrollView.SELECTED_STATE_SET, HorizontalScrollView.EMPTY_STATE_SET}, new int[]{i2, i});
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getTabMaxWidth() {
        return this.m;
    }

    private int getTabMinWidth() {
        int i = this.n;
        if (i != -1) {
            return i;
        }
        if (this.w == 0) {
            return this.p;
        }
        return 0;
    }

    private int getTabScrollRange() {
        return Math.max(0, ((this.c.getWidth() - getWidth()) - getPaddingLeft()) - getPaddingRight());
    }

    private void setSelectedTabView(int i) {
        mr2 mr2Var = this.c;
        int childCount = mr2Var.getChildCount();
        int c = mr2Var.c(i);
        if (c >= childCount || mr2Var.getChildAt(c).isSelected()) {
            return;
        }
        int i2 = 0;
        while (i2 < childCount) {
            mr2Var.getChildAt(i2).setSelected(i2 == c);
            i2++;
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(View view) {
        throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
    }

    public final void b(or2 or2Var, boolean z) {
        if (or2Var.c != this) {
            xq0.x("Tab belongs to a different TabLayout.");
            return;
        }
        b2s b2sVar = or2Var.d;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
        layoutParams.width = -2;
        layoutParams.weight = 0.0f;
        mr2 mr2Var = this.c;
        mr2Var.addView(b2sVar, layoutParams);
        int childCount = mr2Var.getChildCount() - 1;
        ma maVar = this.D;
        mr2 mr2Var2 = (mr2) maVar.d;
        if (((Bitmap) maVar.e) != null && mr2Var2.getChildCount() != 1) {
            if (childCount == 0) {
                mr2Var2.addView(maVar.b(), 1);
            } else {
                mr2Var2.addView(maVar.b(), childCount);
            }
        }
        if (z) {
            b2sVar.setSelected(true);
        }
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        or2Var.b = size;
        arrayList.add(size, or2Var);
        int size2 = arrayList.size();
        for (int i = size + 1; i < size2; i++) {
            ((or2) arrayList.get(i)).b = i;
        }
        if (z) {
            qr2 qr2Var = or2Var.c;
            if (qr2Var != null) {
                qr2Var.k(or2Var, true);
            } else {
                xq0.x("Tab not attached to a TabLayout");
            }
        }
    }

    public final void c(int i) {
        if (i == -1) {
            return;
        }
        if (getWindowToken() != null && wyf.K(this)) {
            mr2 mr2Var = this.c;
            int childCount = mr2Var.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                if (mr2Var.getChildAt(i2).getWidth() > 0) {
                }
            }
            int scrollX = getScrollX();
            int e = e(i, 0.0f);
            if (scrollX != e) {
                if (this.y == null) {
                    ValueAnimator ofInt = ValueAnimator.ofInt(new int[0]);
                    this.y = ofInt;
                    ofInt.setInterpolator(G);
                    this.y.setDuration(this.h);
                    this.y.addUpdateListener(new hr2(0, this));
                }
                this.y.setIntValues(scrollX, e);
                this.y.start();
            }
            mr2Var.a(i, this.h);
            return;
        }
        m(i, 0.0f);
    }

    public final void d() {
        int i;
        int i2;
        if (this.w == 0) {
            i = Math.max(0, this.u - this.d);
            i2 = Math.max(0, this.v - this.f);
        } else {
            i = 0;
            i2 = 0;
        }
        WeakHashMap weakHashMap = wdu.a;
        mr2 mr2Var = this.c;
        mr2Var.setPaddingRelative(i, 0, i2, 0);
        if (this.w != 1) {
            mr2Var.setGravity(8388611);
        } else {
            mr2Var.setGravity(1);
        }
        for (int i3 = 0; i3 < mr2Var.getChildCount(); i3++) {
            View childAt = mr2Var.getChildAt(i3);
            if (childAt instanceof b2s) {
                childAt.setMinimumWidth(getTabMinWidth());
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
                layoutParams.width = -2;
                layoutParams.weight = 0.0f;
                childAt.requestLayout();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
        this.t.a(motionEvent);
        return dispatchTouchEvent;
    }

    public final int e(int i, float f) {
        if (this.w == 0) {
            mr2 mr2Var = this.c;
            View childAt = mr2Var.getChildAt(mr2Var.c(i));
            if (childAt != null) {
                int width = childAt.getWidth();
                if (this.r) {
                    return childAt.getLeft() - this.s;
                }
                int i2 = i + 1;
                return ((childAt.getWidth() / 2) + (childAt.getLeft() + ((int) (((width + ((i2 < mr2Var.getChildCount() ? mr2Var.getChildAt(i2) : null) != null ? r6.getWidth() : 0)) * f) * 0.5f)))) - (getWidth() / 2);
            }
        }
        return 0;
    }

    public b2s g(Context context) {
        return new b2s(context);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    @NonNull
    public pr2 getPageChangeListener() {
        if (this.C == null) {
            this.C = new pr2(this);
        }
        return this.C;
    }

    public int getSelectedTabPosition() {
        or2 or2Var = this.b;
        if (or2Var != null) {
            return or2Var.b;
        }
        return -1;
    }

    public int getSelectedTabTextColor() {
        return this.k.getColorForState(HorizontalScrollView.SELECTED_STATE_SET, -1);
    }

    public int getTabCount() {
        return this.a.size();
    }

    public int getTabMode() {
        return this.w;
    }

    public ColorStateList getTabTextColors() {
        return this.k;
    }

    public final or2 h() {
        or2 or2Var = (or2) H.f();
        if (or2Var == null) {
            or2Var = new or2();
            or2Var.b = -1;
        }
        or2Var.c = this;
        b2s b2sVar = (b2s) this.F.f();
        if (b2sVar == null) {
            b2sVar = g(getContext());
            b2sVar.getClass();
            WeakHashMap weakHashMap = wdu.a;
            b2sVar.setPaddingRelative(this.d, this.e, this.f, this.g);
            b2sVar.j = this.j;
            b2sVar.l = this.i;
            if (!b2sVar.isSelected()) {
                b2sVar.setTextAppearance(b2sVar.getContext(), b2sVar.l);
            }
            b2sVar.setInputFocusTracker(this.E);
            b2sVar.setTextColorList(this.k);
            b2sVar.setBoldTextOnSelection(this.l);
            b2sVar.setEllipsizeEnabled(this.q);
            b2sVar.setMaxWidthProvider(new n(2, this));
            b2sVar.setOnUpdateListener(new xq0());
        }
        b2sVar.setTab(or2Var);
        b2sVar.setFocusable(true);
        b2sVar.setMinimumWidth(getTabMinWidth());
        or2Var.d = b2sVar;
        return or2Var;
    }

    public final void i() {
        int currentItem;
        j();
        h2k h2kVar = this.A;
        if (h2kVar == null) {
            j();
            return;
        }
        int b = h2kVar.b();
        for (int i = 0; i < b; i++) {
            or2 h = h();
            this.A.getClass();
            h.a = null;
            b2s b2sVar = h.d;
            if (b2sVar != null) {
                or2 or2Var = b2sVar.p;
                b2sVar.setText(or2Var != null ? or2Var.a : null);
            }
            b(h, false);
        }
        lgu lguVar = this.z;
        if (lguVar == null || b <= 0 || (currentItem = lguVar.getCurrentItem()) == getSelectedTabPosition() || currentItem >= getTabCount()) {
            return;
        }
        k((or2) this.a.get(currentItem), true);
    }

    public final void j() {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            int i = mr2.w;
            mr2 mr2Var = this.c;
            int c = mr2Var.c(size);
            b2s b2sVar = (b2s) mr2Var.getChildAt(c);
            mr2Var.removeViewAt(c);
            ma maVar = this.D;
            mr2 mr2Var2 = (mr2) maVar.d;
            if (((Bitmap) maVar.e) != null && mr2Var2.getChildCount() != 0) {
                if (c == 0) {
                    mr2Var2.removeViewAt(0);
                } else {
                    mr2Var2.removeViewAt(c - 1);
                }
            }
            if (b2sVar != null) {
                b2sVar.setTab(null);
                b2sVar.setSelected(false);
                this.F.c(b2sVar);
            }
            requestLayout();
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            or2 or2Var = (or2) it.next();
            it.remove();
            or2Var.c = null;
            or2Var.d = null;
            or2Var.a = null;
            or2Var.b = -1;
            H.c(or2Var);
        }
        this.b = null;
    }

    public final void k(or2 or2Var, boolean z) {
        jr2 jr2Var;
        or2 or2Var2 = this.b;
        if (or2Var2 == or2Var) {
            if (or2Var2 != null) {
                jr2 jr2Var2 = this.x;
                if (jr2Var2 != null) {
                    jr2Var2.f(or2Var2);
                }
                c(or2Var.b);
                return;
            }
            return;
        }
        if (z) {
            int i = or2Var != null ? or2Var.b : -1;
            if (i != -1) {
                setSelectedTabView(i);
            }
            or2 or2Var3 = this.b;
            if ((or2Var3 == null || or2Var3.b == -1) && i != -1) {
                m(i, 0.0f);
            } else {
                c(i);
            }
        }
        this.b = or2Var;
        if (or2Var == null || (jr2Var = this.x) == null) {
            return;
        }
        jr2Var.k(or2Var);
    }

    public final void l(h2k h2kVar) {
        nr2 nr2Var;
        h2k h2kVar2 = this.A;
        if (h2kVar2 != null && (nr2Var = this.B) != null) {
            h2kVar2.a.unregisterObserver(nr2Var);
        }
        this.A = h2kVar;
        if (h2kVar != null) {
            if (this.B == null) {
                this.B = new nr2(0, this);
            }
            h2kVar.a.registerObserver(this.B);
        }
        i();
    }

    public final void m(int i, float f) {
        int round = Math.round(i + f);
        if (round >= 0) {
            mr2 mr2Var = this.c;
            if (round >= mr2Var.getChildCount()) {
                return;
            }
            ValueAnimator valueAnimator = mr2Var.m;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                mr2Var.m.cancel();
            }
            mr2Var.d = i;
            mr2Var.e = f;
            mr2Var.e();
            mr2Var.f();
            ValueAnimator valueAnimator2 = this.y;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.y.cancel();
            }
            scrollTo(e(i, f), 0);
            setSelectedTabView(round);
        }
    }

    public final void n(Bitmap bitmap, int i, int i2) {
        ma maVar = this.D;
        maVar.e = bitmap;
        maVar.a = i2;
        maVar.b = i;
        mr2 mr2Var = (mr2) maVar.d;
        if (mr2Var.s) {
            for (int childCount = mr2Var.getChildCount() - 2; childCount > 0; childCount -= 2) {
                mr2Var.removeViewAt(childCount);
            }
        }
        if (mr2Var.s) {
            mr2Var.s = false;
            mr2Var.f();
            mr2Var.e();
        }
        if (((Bitmap) maVar.e) != null) {
            int childCount2 = mr2Var.getChildCount();
            for (int i3 = 1; i3 < childCount2; i3++) {
                mr2Var.addView(maVar.b(), (i3 * 2) - 1);
            }
            if (!mr2Var.s) {
                mr2Var.s = true;
                mr2Var.f();
                mr2Var.e();
            }
        }
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int paddingBottom = getPaddingBottom() + getPaddingTop() + bg3.x(44, getResources().getDisplayMetrics());
        int mode = View.MeasureSpec.getMode(i2);
        if (mode == Integer.MIN_VALUE) {
            i2 = View.MeasureSpec.makeMeasureSpec(Math.min(paddingBottom, View.MeasureSpec.getSize(i2)), 1073741824);
        } else if (mode == 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(paddingBottom, 1073741824);
        }
        int size = View.MeasureSpec.getSize(i);
        if (View.MeasureSpec.getMode(i) != 0) {
            int i3 = this.o;
            if (i3 <= 0) {
                i3 = size - bg3.x(56, getResources().getDisplayMetrics());
            }
            this.m = i3;
        }
        super.onMeasure(i, i2);
        if (getChildCount() == 1) {
            View childAt = getChildAt(0);
            if (this.w != 1) {
                if (childAt.getMeasuredWidth() >= getMeasuredWidth()) {
                    return;
                }
            } else if (childAt.getMeasuredWidth() == getMeasuredWidth()) {
                return;
            }
            childAt.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), ViewGroup.getChildMeasureSpec(i2, getPaddingBottom() + getPaddingTop(), childAt.getLayoutParams().height));
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public final void onOverScrolled(int i, int i2, boolean z, boolean z2) {
        super.onOverScrolled(i, i2, z, z2);
        sxi sxiVar = this.t;
        if (sxiVar.b && z) {
            ViewGroup viewGroup = sxiVar.a;
            WeakHashMap weakHashMap = wdu.a;
            ndu.c(viewGroup, 0, 0, 1, 0, null);
        }
    }

    @Override // android.view.View
    public void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        this.t.b = false;
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        or2 or2Var;
        int i5;
        super.onSizeChanged(i, i2, i3, i4);
        if (i3 == 0 || i3 == i || (or2Var = this.b) == null || (i5 = or2Var.b) == -1) {
            return;
        }
        m(i5, 0.0f);
    }

    public void setAnimationDuration(long j) {
        this.h = j;
    }

    public void setAnimationType(ir2 ir2Var) {
        mr2 mr2Var = this.c;
        if (mr2Var.v != ir2Var) {
            mr2Var.v = ir2Var;
            ValueAnimator valueAnimator = mr2Var.m;
            if (valueAnimator == null || !valueAnimator.isRunning()) {
                return;
            }
            mr2Var.m.cancel();
        }
    }

    public void setFocusTracker(one oneVar) {
        this.E = oneVar;
    }

    public void setOnTabSelectedListener(jr2 jr2Var) {
        this.x = jr2Var;
    }

    public void setSelectedTabIndicatorColor(int i) {
        mr2 mr2Var = this.c;
        if (mr2Var.b != i) {
            if ((i >> 24) == 0) {
                mr2Var.b = -1;
            } else {
                mr2Var.b = i;
            }
            WeakHashMap weakHashMap = wdu.a;
            mr2Var.postInvalidateOnAnimation();
        }
    }

    public void setTabBackgroundColor(int i) {
        mr2 mr2Var = this.c;
        if (mr2Var.c != i) {
            if ((i >> 24) == 0) {
                mr2Var.c = -1;
            } else {
                mr2Var.c = i;
            }
            WeakHashMap weakHashMap = wdu.a;
            mr2Var.postInvalidateOnAnimation();
        }
    }

    public void setTabIndicatorCornersRadii(@NonNull float[] fArr) {
        mr2 mr2Var = this.c;
        if (Arrays.equals(mr2Var.i, fArr)) {
            return;
        }
        mr2Var.i = fArr;
        WeakHashMap weakHashMap = wdu.a;
        mr2Var.postInvalidateOnAnimation();
    }

    public void setTabIndicatorHeight(int i) {
        mr2 mr2Var = this.c;
        if (mr2Var.a != i) {
            mr2Var.a = i;
            WeakHashMap weakHashMap = wdu.a;
            mr2Var.postInvalidateOnAnimation();
        }
    }

    public void setTabItemSpacing(int i) {
        mr2 mr2Var = this.c;
        if (i != mr2Var.f) {
            mr2Var.f = i;
            int childCount = mr2Var.getChildCount();
            for (int i2 = 1; i2 < childCount; i2++) {
                View childAt = mr2Var.getChildAt(i2);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
                marginLayoutParams.leftMargin = mr2Var.f;
                mr2Var.updateViewLayout(childAt, marginLayoutParams);
            }
        }
    }

    public void setTabMode(int i) {
        if (i != this.w) {
            this.w = i;
            d();
        }
    }

    public void setTabTextColors(ColorStateList colorStateList) {
        if (this.k != colorStateList) {
            this.k = colorStateList;
            ArrayList arrayList = this.a;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                b2s b2sVar = ((or2) arrayList.get(i)).d;
                if (b2sVar != null) {
                    b2sVar.setTextColorList(this.k);
                }
            }
        }
    }

    public void setTabsEnabled(boolean z) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.a;
            if (i >= arrayList.size()) {
                return;
            }
            ((or2) arrayList.get(i)).d.setEnabled(z);
            i++;
        }
    }

    public void setupWithViewPager(lgu lguVar) {
        pr2 pr2Var;
        lgu lguVar2 = this.z;
        if (lguVar2 != null && (pr2Var = this.C) != null) {
            lguVar2.u(pr2Var);
        }
        if (lguVar == null) {
            this.z = null;
            setOnTabSelectedListener(null);
            l(null);
            return;
        }
        h2k adapter = lguVar.getAdapter();
        if (adapter == null) {
            xq0.x("ViewPager does not have a PagerAdapter set");
            return;
        }
        this.z = lguVar;
        if (this.C == null) {
            this.C = new pr2(this);
        }
        pr2 pr2Var2 = this.C;
        pr2Var2.c = 0;
        pr2Var2.b = 0;
        lguVar.b(pr2Var2);
        setOnTabSelectedListener(new efo(9, lguVar));
        l(adapter);
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return getTabScrollRange() > 0;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(View view, int i) {
        throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
    }

    public qr2(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public qr2(Context context) {
        this(context, null);
    }
}
