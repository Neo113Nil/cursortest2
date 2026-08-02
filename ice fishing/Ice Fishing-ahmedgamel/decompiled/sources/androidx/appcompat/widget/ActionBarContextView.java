package androidx.appcompat.widget;

import N3.n;
import O.C0335e0;
import O.X;
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
import com.IceFishing.LiveIceFishing.C5248R;
import com.bumptech.glide.g;
import g.AbstractC4528a;
import k.AbstractC4625b;
import l.InterfaceC4650A;
import l.m;
import m.C4688a;
import m.C4700g;
import m.C4708k;
import m.g1;

/* loaded from: classes.dex */
public class ActionBarContextView extends ViewGroup {

    /* renamed from: A, reason: collision with root package name */
    public boolean f4478A;

    /* renamed from: B, reason: collision with root package name */
    public CharSequence f4479B;

    /* renamed from: C, reason: collision with root package name */
    public CharSequence f4480C;

    /* renamed from: D, reason: collision with root package name */
    public View f4481D;

    /* renamed from: E, reason: collision with root package name */
    public View f4482E;

    /* renamed from: F, reason: collision with root package name */
    public View f4483F;

    /* renamed from: G, reason: collision with root package name */
    public LinearLayout f4484G;

    /* renamed from: H, reason: collision with root package name */
    public TextView f4485H;

    /* renamed from: I, reason: collision with root package name */
    public TextView f4486I;
    public final int J;

    /* renamed from: K, reason: collision with root package name */
    public final int f4487K;

    /* renamed from: L, reason: collision with root package name */
    public boolean f4488L;

    /* renamed from: M, reason: collision with root package name */
    public final int f4489M;

    /* renamed from: n, reason: collision with root package name */
    public final C4688a f4490n;

    /* renamed from: u, reason: collision with root package name */
    public final Context f4491u;

    /* renamed from: v, reason: collision with root package name */
    public ActionMenuView f4492v;

    /* renamed from: w, reason: collision with root package name */
    public C4708k f4493w;

    /* renamed from: x, reason: collision with root package name */
    public int f4494x;

    /* renamed from: y, reason: collision with root package name */
    public C0335e0 f4495y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f4496z;

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, C5248R.attr.actionModeStyle);
        int resourceId;
        this.f4490n = new C4688a(this);
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(C5248R.attr.actionBarPopupTheme, typedValue, true) || typedValue.resourceId == 0) {
            this.f4491u = context;
        } else {
            this.f4491u = new ContextThemeWrapper(context, typedValue.resourceId);
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC4528a.f37553d, C5248R.attr.actionModeStyle, 0);
        setBackground((!obtainStyledAttributes.hasValue(0) || (resourceId = obtainStyledAttributes.getResourceId(0, 0)) == 0) ? obtainStyledAttributes.getDrawable(0) : g.h(context, resourceId));
        this.J = obtainStyledAttributes.getResourceId(5, 0);
        this.f4487K = obtainStyledAttributes.getResourceId(4, 0);
        this.f4494x = obtainStyledAttributes.getLayoutDimension(3, 0);
        this.f4489M = obtainStyledAttributes.getResourceId(2, C5248R.layout.abc_action_mode_close_item_material);
        obtainStyledAttributes.recycle();
    }

    public static int f(int i, int i4, View view) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i, Integer.MIN_VALUE), i4);
        return Math.max(0, i - view.getMeasuredWidth());
    }

    public static int g(int i, int i4, int i6, View view, boolean z6) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i9 = ((i6 - measuredHeight) / 2) + i4;
        if (z6) {
            view.layout(i - measuredWidth, i9, i, measuredHeight + i9);
        } else {
            view.layout(i, i9, i + measuredWidth, measuredHeight + i9);
        }
        return z6 ? -measuredWidth : measuredWidth;
    }

    public final void c(AbstractC4625b abstractC4625b) {
        View view = this.f4481D;
        if (view == null) {
            View inflate = LayoutInflater.from(getContext()).inflate(this.f4489M, (ViewGroup) this, false);
            this.f4481D = inflate;
            addView(inflate);
        } else if (view.getParent() == null) {
            addView(this.f4481D);
        }
        View findViewById = this.f4481D.findViewById(C5248R.id.action_mode_close_button);
        this.f4482E = findViewById;
        findViewById.setOnClickListener(new n(11, abstractC4625b));
        m c9 = abstractC4625b.c();
        C4708k c4708k = this.f4493w;
        if (c4708k != null) {
            c4708k.f();
            C4700g c4700g = c4708k.f39237M;
            if (c4700g != null && c4700g.b()) {
                c4700g.i.dismiss();
            }
        }
        C4708k c4708k2 = new C4708k(getContext());
        this.f4493w = c4708k2;
        c4708k2.f39230E = true;
        c4708k2.f39231F = true;
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        c9.b(this.f4493w, this.f4491u);
        C4708k c4708k3 = this.f4493w;
        InterfaceC4650A interfaceC4650A = c4708k3.f39226A;
        if (interfaceC4650A == null) {
            InterfaceC4650A interfaceC4650A2 = (InterfaceC4650A) c4708k3.f39244w.inflate(c4708k3.f39246y, (ViewGroup) this, false);
            c4708k3.f39226A = interfaceC4650A2;
            interfaceC4650A2.c(c4708k3.f39243v);
            c4708k3.e();
        }
        InterfaceC4650A interfaceC4650A3 = c4708k3.f39226A;
        if (interfaceC4650A != interfaceC4650A3) {
            ((ActionMenuView) interfaceC4650A3).setPresenter(c4708k3);
        }
        ActionMenuView actionMenuView = (ActionMenuView) interfaceC4650A3;
        this.f4492v = actionMenuView;
        actionMenuView.setBackground(null);
        addView(this.f4492v, layoutParams);
    }

    public final void d() {
        if (this.f4484G == null) {
            LayoutInflater.from(getContext()).inflate(C5248R.layout.abc_action_bar_title_item, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f4484G = linearLayout;
            this.f4485H = (TextView) linearLayout.findViewById(C5248R.id.action_bar_title);
            this.f4486I = (TextView) this.f4484G.findViewById(C5248R.id.action_bar_subtitle);
            int i = this.J;
            if (i != 0) {
                this.f4485H.setTextAppearance(getContext(), i);
            }
            int i4 = this.f4487K;
            if (i4 != 0) {
                this.f4486I.setTextAppearance(getContext(), i4);
            }
        }
        this.f4485H.setText(this.f4479B);
        this.f4486I.setText(this.f4480C);
        boolean isEmpty = TextUtils.isEmpty(this.f4479B);
        boolean isEmpty2 = TextUtils.isEmpty(this.f4480C);
        this.f4486I.setVisibility(!isEmpty2 ? 0 : 8);
        this.f4484G.setVisibility((isEmpty && isEmpty2) ? 8 : 0);
        if (this.f4484G.getParent() == null) {
            addView(this.f4484G);
        }
    }

    public final void e() {
        removeAllViews();
        this.f4483F = null;
        this.f4492v = null;
        this.f4493w = null;
        View view = this.f4482E;
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
        return this.f4495y != null ? this.f4490n.f39173b : getVisibility();
    }

    public int getContentHeight() {
        return this.f4494x;
    }

    public CharSequence getSubtitle() {
        return this.f4480C;
    }

    public CharSequence getTitle() {
        return this.f4479B;
    }

    @Override // android.view.View
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public final void setVisibility(int i) {
        if (i != getVisibility()) {
            C0335e0 c0335e0 = this.f4495y;
            if (c0335e0 != null) {
                c0335e0.b();
            }
            super.setVisibility(i);
        }
    }

    public final C0335e0 i(int i, long j6) {
        C0335e0 c0335e0 = this.f4495y;
        if (c0335e0 != null) {
            c0335e0.b();
        }
        C4688a c4688a = this.f4490n;
        if (i != 0) {
            C0335e0 a9 = X.a(this);
            a9.a(0.0f);
            a9.c(j6);
            c4688a.f39174c.f4495y = a9;
            c4688a.f39173b = i;
            a9.d(c4688a);
            return a9;
        }
        if (getVisibility() != 0) {
            setAlpha(0.0f);
        }
        C0335e0 a10 = X.a(this);
        a10.a(1.0f);
        a10.c(j6);
        c4688a.f39174c.f4495y = a10;
        c4688a.f39173b = i;
        a10.d(c4688a);
        return a10;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(null, AbstractC4528a.f37550a, C5248R.attr.actionBarStyle, 0);
        setContentHeight(obtainStyledAttributes.getLayoutDimension(13, 0));
        obtainStyledAttributes.recycle();
        C4708k c4708k = this.f4493w;
        if (c4708k != null) {
            Configuration configuration2 = c4708k.f39242u.getResources().getConfiguration();
            int i = configuration2.screenWidthDp;
            int i4 = configuration2.screenHeightDp;
            c4708k.f39234I = (configuration2.smallestScreenWidthDp > 600 || i > 600 || (i > 960 && i4 > 720) || (i > 720 && i4 > 960)) ? 5 : (i >= 500 || (i > 640 && i4 > 480) || (i > 480 && i4 > 640)) ? 4 : i >= 360 ? 3 : 2;
            m mVar = c4708k.f39243v;
            if (mVar != null) {
                mVar.p(true);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C4708k c4708k = this.f4493w;
        if (c4708k != null) {
            c4708k.f();
            C4700g c4700g = this.f4493w.f39237M;
            if (c4700g == null || !c4700g.b()) {
                return;
            }
            c4700g.i.dismiss();
        }
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f4478A = false;
        }
        if (!this.f4478A) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f4478A = true;
            }
        }
        if (actionMasked != 10 && actionMasked != 3) {
            return true;
        }
        this.f4478A = false;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z6, int i, int i4, int i6, int i9) {
        boolean z9 = g1.f39217a;
        boolean z10 = getLayoutDirection() == 1;
        int paddingRight = z10 ? (i6 - i) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i9 - i4) - getPaddingTop()) - getPaddingBottom();
        View view = this.f4481D;
        if (view != null && view.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f4481D.getLayoutParams();
            int i10 = z10 ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i11 = z10 ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int i12 = z10 ? paddingRight - i10 : paddingRight + i10;
            int g9 = g(i12, paddingTop, paddingTop2, this.f4481D, z10) + i12;
            paddingRight = z10 ? g9 - i11 : g9 + i11;
        }
        LinearLayout linearLayout = this.f4484G;
        if (linearLayout != null && this.f4483F == null && linearLayout.getVisibility() != 8) {
            paddingRight += g(paddingRight, paddingTop, paddingTop2, this.f4484G, z10);
        }
        View view2 = this.f4483F;
        if (view2 != null) {
            g(paddingRight, paddingTop, paddingTop2, view2, z10);
        }
        int paddingLeft = z10 ? getPaddingLeft() : (i6 - i) - getPaddingRight();
        ActionMenuView actionMenuView = this.f4492v;
        if (actionMenuView != null) {
            g(paddingLeft, paddingTop, paddingTop2, actionMenuView, !z10);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i4) {
        if (View.MeasureSpec.getMode(i) != 1073741824) {
            throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_width=\"match_parent\" (or fill_parent)"));
        }
        if (View.MeasureSpec.getMode(i4) == 0) {
            throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_height=\"wrap_content\""));
        }
        int size = View.MeasureSpec.getSize(i);
        int i6 = this.f4494x;
        if (i6 <= 0) {
            i6 = View.MeasureSpec.getSize(i4);
        }
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int i9 = i6 - paddingBottom;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i9, Integer.MIN_VALUE);
        View view = this.f4481D;
        if (view != null) {
            int f2 = f(paddingLeft, makeMeasureSpec, view);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f4481D.getLayoutParams();
            paddingLeft = f2 - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
        }
        ActionMenuView actionMenuView = this.f4492v;
        if (actionMenuView != null && actionMenuView.getParent() == this) {
            paddingLeft = f(paddingLeft, makeMeasureSpec, this.f4492v);
        }
        LinearLayout linearLayout = this.f4484G;
        if (linearLayout != null && this.f4483F == null) {
            if (this.f4488L) {
                this.f4484G.measure(View.MeasureSpec.makeMeasureSpec(0, 0), makeMeasureSpec);
                int measuredWidth = this.f4484G.getMeasuredWidth();
                boolean z6 = measuredWidth <= paddingLeft;
                if (z6) {
                    paddingLeft -= measuredWidth;
                }
                this.f4484G.setVisibility(z6 ? 0 : 8);
            } else {
                paddingLeft = f(paddingLeft, makeMeasureSpec, linearLayout);
            }
        }
        View view2 = this.f4483F;
        if (view2 != null) {
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            int i10 = layoutParams.width;
            int i11 = i10 != -2 ? 1073741824 : Integer.MIN_VALUE;
            if (i10 >= 0) {
                paddingLeft = Math.min(i10, paddingLeft);
            }
            int i12 = layoutParams.height;
            int i13 = i12 == -2 ? Integer.MIN_VALUE : 1073741824;
            if (i12 >= 0) {
                i9 = Math.min(i12, i9);
            }
            this.f4483F.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i11), View.MeasureSpec.makeMeasureSpec(i9, i13));
        }
        if (this.f4494x > 0) {
            setMeasuredDimension(size, i6);
            return;
        }
        int childCount = getChildCount();
        int i14 = 0;
        for (int i15 = 0; i15 < childCount; i15++) {
            int measuredHeight = getChildAt(i15).getMeasuredHeight() + paddingBottom;
            if (measuredHeight > i14) {
                i14 = measuredHeight;
            }
        }
        setMeasuredDimension(size, i14);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f4496z = false;
        }
        if (!this.f4496z) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f4496z = true;
            }
        }
        if (actionMasked != 1 && actionMasked != 3) {
            return true;
        }
        this.f4496z = false;
        return true;
    }

    public void setContentHeight(int i) {
        this.f4494x = i;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.f4483F;
        if (view2 != null) {
            removeView(view2);
        }
        this.f4483F = view;
        if (view != null && (linearLayout = this.f4484G) != null) {
            removeView(linearLayout);
            this.f4484G = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f4480C = charSequence;
        d();
    }

    public void setTitle(CharSequence charSequence) {
        this.f4479B = charSequence;
        d();
        X.p(this, charSequence);
    }

    public void setTitleOptional(boolean z6) {
        if (z6 != this.f4488L) {
            requestLayout();
        }
        this.f4488L = z6;
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
