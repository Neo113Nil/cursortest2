package androidx.appcompat.widget;

import B0.l;
import O.K;
import O.N;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.lumenpath.harispro.hrnavigator.R;
import g.AbstractC0155a;
import h0.f;
import k.AbstractC0177a;
import l.InterfaceC0212A;
import l.MenuC0229m;
import m.C0242a;
import m.C0254g;
import m.C0264l;
import m.h1;

/* loaded from: classes.dex */
public class ActionBarContextView extends ViewGroup {

    /* renamed from: a, reason: collision with root package name */
    public final C0242a f1777a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f1778b;

    /* renamed from: c, reason: collision with root package name */
    public ActionMenuView f1779c;

    /* renamed from: d, reason: collision with root package name */
    public C0264l f1780d;
    public int e;

    /* renamed from: f, reason: collision with root package name */
    public N f1781f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f1782g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f1783h;
    public CharSequence i;
    public CharSequence j;

    /* renamed from: k, reason: collision with root package name */
    public View f1784k;

    /* renamed from: l, reason: collision with root package name */
    public View f1785l;

    /* renamed from: m, reason: collision with root package name */
    public View f1786m;

    /* renamed from: n, reason: collision with root package name */
    public LinearLayout f1787n;

    /* renamed from: o, reason: collision with root package name */
    public TextView f1788o;

    /* renamed from: p, reason: collision with root package name */
    public TextView f1789p;

    /* renamed from: q, reason: collision with root package name */
    public final int f1790q;

    /* renamed from: r, reason: collision with root package name */
    public final int f1791r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f1792s;

    /* renamed from: t, reason: collision with root package name */
    public final int f1793t;

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.actionModeStyle);
        int resourceId;
        this.f1777a = new C0242a(this);
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(R.attr.actionBarPopupTheme, typedValue, true) || typedValue.resourceId == 0) {
            this.f1778b = context;
        } else {
            this.f1778b = new ContextThemeWrapper(context, typedValue.resourceId);
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0155a.f3037d, R.attr.actionModeStyle, 0);
        setBackground((!obtainStyledAttributes.hasValue(0) || (resourceId = obtainStyledAttributes.getResourceId(0, 0)) == 0) ? obtainStyledAttributes.getDrawable(0) : f.n(context, resourceId));
        this.f1790q = obtainStyledAttributes.getResourceId(5, 0);
        this.f1791r = obtainStyledAttributes.getResourceId(4, 0);
        this.e = obtainStyledAttributes.getLayoutDimension(3, 0);
        this.f1793t = obtainStyledAttributes.getResourceId(2, R.layout.abc_action_mode_close_item_material);
        obtainStyledAttributes.recycle();
    }

    public static int f(View view, int i, int i2) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i, Integer.MIN_VALUE), i2);
        return Math.max(0, i - view.getMeasuredWidth());
    }

    public static int g(View view, int i, int i2, int i3, boolean z2) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i4 = ((i3 - measuredHeight) / 2) + i2;
        if (z2) {
            view.layout(i - measuredWidth, i4, i, measuredHeight + i4);
        } else {
            view.layout(i, i4, i + measuredWidth, measuredHeight + i4);
        }
        return z2 ? -measuredWidth : measuredWidth;
    }

    public final void c(AbstractC0177a abstractC0177a) {
        View view = this.f1784k;
        if (view == null) {
            View inflate = LayoutInflater.from(getContext()).inflate(this.f1793t, (ViewGroup) this, false);
            this.f1784k = inflate;
            addView(inflate);
        } else if (view.getParent() == null) {
            addView(this.f1784k);
        }
        View findViewById = this.f1784k.findViewById(R.id.action_mode_close_button);
        this.f1785l = findViewById;
        findViewById.setOnClickListener(new l(4, abstractC0177a));
        MenuC0229m c2 = abstractC0177a.c();
        C0264l c0264l = this.f1780d;
        if (c0264l != null) {
            c0264l.c();
            C0254g c0254g = c0264l.f3976u;
            if (c0254g != null && c0254g.b()) {
                c0254g.i.dismiss();
            }
        }
        C0264l c0264l2 = new C0264l(getContext());
        this.f1780d = c0264l2;
        c0264l2.f3968m = true;
        c0264l2.f3969n = true;
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        c2.b(this.f1780d, this.f1778b);
        C0264l c0264l3 = this.f1780d;
        InterfaceC0212A interfaceC0212A = c0264l3.f3965h;
        if (interfaceC0212A == null) {
            InterfaceC0212A interfaceC0212A2 = (InterfaceC0212A) c0264l3.f3962d.inflate(c0264l3.f3963f, (ViewGroup) this, false);
            c0264l3.f3965h = interfaceC0212A2;
            interfaceC0212A2.a(c0264l3.f3961c);
            c0264l3.m(true);
        }
        InterfaceC0212A interfaceC0212A3 = c0264l3.f3965h;
        if (interfaceC0212A != interfaceC0212A3) {
            ((ActionMenuView) interfaceC0212A3).setPresenter(c0264l3);
        }
        ActionMenuView actionMenuView = (ActionMenuView) interfaceC0212A3;
        this.f1779c = actionMenuView;
        actionMenuView.setBackground(null);
        addView(this.f1779c, layoutParams);
    }

    public final void d() {
        if (this.f1787n == null) {
            LayoutInflater.from(getContext()).inflate(R.layout.abc_action_bar_title_item, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f1787n = linearLayout;
            this.f1788o = (TextView) linearLayout.findViewById(R.id.action_bar_title);
            this.f1789p = (TextView) this.f1787n.findViewById(R.id.action_bar_subtitle);
            int i = this.f1790q;
            if (i != 0) {
                this.f1788o.setTextAppearance(getContext(), i);
            }
            int i2 = this.f1791r;
            if (i2 != 0) {
                this.f1789p.setTextAppearance(getContext(), i2);
            }
        }
        this.f1788o.setText(this.i);
        this.f1789p.setText(this.j);
        boolean isEmpty = TextUtils.isEmpty(this.i);
        boolean isEmpty2 = TextUtils.isEmpty(this.j);
        this.f1789p.setVisibility(!isEmpty2 ? 0 : 8);
        this.f1787n.setVisibility((isEmpty && isEmpty2) ? 8 : 0);
        if (this.f1787n.getParent() == null) {
            addView(this.f1787n);
        }
    }

    public final void e() {
        removeAllViews();
        this.f1786m = null;
        this.f1779c = null;
        this.f1780d = null;
        View view = this.f1785l;
        if (view != null) {
            view.setOnClickListener(null);
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public int getAnimatedVisibility() {
        return this.f1781f != null ? this.f1777a.f3908b : getVisibility();
    }

    public int getContentHeight() {
        return this.e;
    }

    public CharSequence getSubtitle() {
        return this.j;
    }

    public CharSequence getTitle() {
        return this.i;
    }

    @Override // android.view.View
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public final void setVisibility(int i) {
        if (i != getVisibility()) {
            N n2 = this.f1781f;
            if (n2 != null) {
                n2.b();
            }
            super.setVisibility(i);
        }
    }

    public final N i(int i, long j) {
        N n2 = this.f1781f;
        if (n2 != null) {
            n2.b();
        }
        C0242a c0242a = this.f1777a;
        if (i != 0) {
            N a2 = K.a(this);
            a2.a(RecyclerView.f2111C0);
            a2.c(j);
            c0242a.f3909c.f1781f = a2;
            c0242a.f3908b = i;
            a2.d(c0242a);
            return a2;
        }
        if (getVisibility() != 0) {
            setAlpha(RecyclerView.f2111C0);
        }
        N a3 = K.a(this);
        a3.a(1.0f);
        a3.c(j);
        c0242a.f3909c.f1781f = a3;
        c0242a.f3908b = i;
        a3.d(c0242a);
        return a3;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(null, AbstractC0155a.f3034a, R.attr.actionBarStyle, 0);
        setContentHeight(obtainStyledAttributes.getLayoutDimension(13, 0));
        obtainStyledAttributes.recycle();
        C0264l c0264l = this.f1780d;
        if (c0264l != null) {
            Configuration configuration2 = c0264l.f3960b.getResources().getConfiguration();
            int i = configuration2.screenWidthDp;
            int i2 = configuration2.screenHeightDp;
            c0264l.f3972q = (configuration2.smallestScreenWidthDp > 600 || i > 600 || (i > 960 && i2 > 720) || (i > 720 && i2 > 960)) ? 5 : (i >= 500 || (i > 640 && i2 > 480) || (i > 480 && i2 > 640)) ? 4 : i >= 360 ? 3 : 2;
            MenuC0229m menuC0229m = c0264l.f3961c;
            if (menuC0229m != null) {
                menuC0229m.p(true);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C0264l c0264l = this.f1780d;
        if (c0264l != null) {
            c0264l.c();
            C0254g c0254g = this.f1780d.f3976u;
            if (c0254g == null || !c0254g.b()) {
                return;
            }
            c0254g.i.dismiss();
        }
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f1783h = false;
        }
        if (!this.f1783h) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f1783h = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f1783h = false;
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        boolean z3 = h1.f3952a;
        boolean z4 = getLayoutDirection() == 1;
        int paddingRight = z4 ? (i3 - i) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
        View view = this.f1784k;
        if (view != null && view.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f1784k.getLayoutParams();
            int i5 = z4 ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i6 = z4 ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int i7 = z4 ? paddingRight - i5 : paddingRight + i5;
            int g2 = g(this.f1784k, i7, paddingTop, paddingTop2, z4) + i7;
            paddingRight = z4 ? g2 - i6 : g2 + i6;
        }
        LinearLayout linearLayout = this.f1787n;
        if (linearLayout != null && this.f1786m == null && linearLayout.getVisibility() != 8) {
            paddingRight += g(this.f1787n, paddingRight, paddingTop, paddingTop2, z4);
        }
        View view2 = this.f1786m;
        if (view2 != null) {
            g(view2, paddingRight, paddingTop, paddingTop2, z4);
        }
        int paddingLeft = z4 ? getPaddingLeft() : (i3 - i) - getPaddingRight();
        ActionMenuView actionMenuView = this.f1779c;
        if (actionMenuView != null) {
            g(actionMenuView, paddingLeft, paddingTop, paddingTop2, !z4);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        if (View.MeasureSpec.getMode(i) != 1073741824) {
            throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_width=\"match_parent\" (or fill_parent)"));
        }
        if (View.MeasureSpec.getMode(i2) == 0) {
            throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_height=\"wrap_content\""));
        }
        int size = View.MeasureSpec.getSize(i);
        int i3 = this.e;
        if (i3 <= 0) {
            i3 = View.MeasureSpec.getSize(i2);
        }
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int i4 = i3 - paddingBottom;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE);
        View view = this.f1784k;
        if (view != null) {
            int f2 = f(view, paddingLeft, makeMeasureSpec);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f1784k.getLayoutParams();
            paddingLeft = f2 - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
        }
        ActionMenuView actionMenuView = this.f1779c;
        if (actionMenuView != null && actionMenuView.getParent() == this) {
            paddingLeft = f(this.f1779c, paddingLeft, makeMeasureSpec);
        }
        LinearLayout linearLayout = this.f1787n;
        if (linearLayout != null && this.f1786m == null) {
            if (this.f1792s) {
                this.f1787n.measure(View.MeasureSpec.makeMeasureSpec(0, 0), makeMeasureSpec);
                int measuredWidth = this.f1787n.getMeasuredWidth();
                boolean z2 = measuredWidth <= paddingLeft;
                if (z2) {
                    paddingLeft -= measuredWidth;
                }
                this.f1787n.setVisibility(z2 ? 0 : 8);
            } else {
                paddingLeft = f(linearLayout, paddingLeft, makeMeasureSpec);
            }
        }
        View view2 = this.f1786m;
        if (view2 != null) {
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            int i5 = layoutParams.width;
            int i6 = i5 != -2 ? 1073741824 : Integer.MIN_VALUE;
            if (i5 >= 0) {
                paddingLeft = Math.min(i5, paddingLeft);
            }
            int i7 = layoutParams.height;
            int i8 = i7 == -2 ? Integer.MIN_VALUE : 1073741824;
            if (i7 >= 0) {
                i4 = Math.min(i7, i4);
            }
            this.f1786m.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i6), View.MeasureSpec.makeMeasureSpec(i4, i8));
        }
        if (this.e > 0) {
            setMeasuredDimension(size, i3);
            return;
        }
        int childCount = getChildCount();
        int i9 = 0;
        for (int i10 = 0; i10 < childCount; i10++) {
            int measuredHeight = getChildAt(i10).getMeasuredHeight() + paddingBottom;
            if (measuredHeight > i9) {
                i9 = measuredHeight;
            }
        }
        setMeasuredDimension(size, i9);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f1782g = false;
        }
        if (!this.f1782g) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f1782g = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f1782g = false;
        }
        return true;
    }

    public void setContentHeight(int i) {
        this.e = i;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.f1786m;
        if (view2 != null) {
            removeView(view2);
        }
        this.f1786m = view;
        if (view != null && (linearLayout = this.f1787n) != null) {
            removeView(linearLayout);
            this.f1787n = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.j = charSequence;
        d();
    }

    public void setTitle(CharSequence charSequence) {
        this.i = charSequence;
        d();
        K.m(this, charSequence);
    }

    public void setTitleOptional(boolean z2) {
        if (z2 != this.f1792s) {
            requestLayout();
        }
        this.f1792s = z2;
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
