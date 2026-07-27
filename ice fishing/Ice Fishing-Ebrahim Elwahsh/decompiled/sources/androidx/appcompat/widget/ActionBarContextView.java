package androidx.appcompat.widget;

import O.C0343e0;
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
import com.bumptech.glide.f;
import com.google.android.material.datepicker.j;
import com.icefishing.icefishingliveapp.C5284R;
import g.AbstractC4518a;
import k.AbstractC4614b;
import l.l;
import l.z;
import m.C4723a;
import m.C4735g;
import m.C4743k;
import m.g1;

/* loaded from: classes.dex */
public class ActionBarContextView extends ViewGroup {

    /* renamed from: A, reason: collision with root package name */
    public boolean f4625A;

    /* renamed from: B, reason: collision with root package name */
    public CharSequence f4626B;

    /* renamed from: C, reason: collision with root package name */
    public CharSequence f4627C;

    /* renamed from: D, reason: collision with root package name */
    public View f4628D;

    /* renamed from: E, reason: collision with root package name */
    public View f4629E;

    /* renamed from: F, reason: collision with root package name */
    public View f4630F;

    /* renamed from: G, reason: collision with root package name */
    public LinearLayout f4631G;

    /* renamed from: H, reason: collision with root package name */
    public TextView f4632H;

    /* renamed from: I, reason: collision with root package name */
    public TextView f4633I;
    public final int J;

    /* renamed from: K, reason: collision with root package name */
    public final int f4634K;

    /* renamed from: L, reason: collision with root package name */
    public boolean f4635L;

    /* renamed from: M, reason: collision with root package name */
    public final int f4636M;

    /* renamed from: n, reason: collision with root package name */
    public final C4723a f4637n;

    /* renamed from: u, reason: collision with root package name */
    public final Context f4638u;

    /* renamed from: v, reason: collision with root package name */
    public ActionMenuView f4639v;

    /* renamed from: w, reason: collision with root package name */
    public C4743k f4640w;

    /* renamed from: x, reason: collision with root package name */
    public int f4641x;

    /* renamed from: y, reason: collision with root package name */
    public C0343e0 f4642y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f4643z;

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, C5284R.attr.actionModeStyle);
        int resourceId;
        this.f4637n = new C4723a(this);
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(C5284R.attr.actionBarPopupTheme, typedValue, true) || typedValue.resourceId == 0) {
            this.f4638u = context;
        } else {
            this.f4638u = new ContextThemeWrapper(context, typedValue.resourceId);
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC4518a.f37821d, C5284R.attr.actionModeStyle, 0);
        setBackground((!obtainStyledAttributes.hasValue(0) || (resourceId = obtainStyledAttributes.getResourceId(0, 0)) == 0) ? obtainStyledAttributes.getDrawable(0) : f.h(context, resourceId));
        this.J = obtainStyledAttributes.getResourceId(5, 0);
        this.f4634K = obtainStyledAttributes.getResourceId(4, 0);
        this.f4641x = obtainStyledAttributes.getLayoutDimension(3, 0);
        this.f4636M = obtainStyledAttributes.getResourceId(2, C5284R.layout.abc_action_mode_close_item_material);
        obtainStyledAttributes.recycle();
    }

    public static int f(int i, int i4, View view) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i, Integer.MIN_VALUE), i4);
        return Math.max(0, i - view.getMeasuredWidth());
    }

    public static int g(int i, int i4, int i9, View view, boolean z8) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i10 = ((i9 - measuredHeight) / 2) + i4;
        if (z8) {
            view.layout(i - measuredWidth, i10, i, measuredHeight + i10);
        } else {
            view.layout(i, i10, i + measuredWidth, measuredHeight + i10);
        }
        return z8 ? -measuredWidth : measuredWidth;
    }

    public final void c(AbstractC4614b abstractC4614b) {
        View view = this.f4628D;
        if (view == null) {
            View inflate = LayoutInflater.from(getContext()).inflate(this.f4636M, (ViewGroup) this, false);
            this.f4628D = inflate;
            addView(inflate);
        } else if (view.getParent() == null) {
            addView(this.f4628D);
        }
        View findViewById = this.f4628D.findViewById(C5284R.id.action_mode_close_button);
        this.f4629E = findViewById;
        findViewById.setOnClickListener(new j(10, abstractC4614b));
        l c4 = abstractC4614b.c();
        C4743k c4743k = this.f4640w;
        if (c4743k != null) {
            c4743k.f();
            C4735g c4735g = c4743k.f39439M;
            if (c4735g != null && c4735g.b()) {
                c4735g.i.dismiss();
            }
        }
        C4743k c4743k2 = new C4743k(getContext());
        this.f4640w = c4743k2;
        c4743k2.f39432E = true;
        c4743k2.f39433F = true;
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        c4.b(this.f4640w, this.f4638u);
        C4743k c4743k3 = this.f4640w;
        z zVar = c4743k3.f39428A;
        if (zVar == null) {
            z zVar2 = (z) c4743k3.f39446w.inflate(c4743k3.f39448y, (ViewGroup) this, false);
            c4743k3.f39428A = zVar2;
            zVar2.c(c4743k3.f39445v);
            c4743k3.d();
        }
        z zVar3 = c4743k3.f39428A;
        if (zVar != zVar3) {
            ((ActionMenuView) zVar3).setPresenter(c4743k3);
        }
        ActionMenuView actionMenuView = (ActionMenuView) zVar3;
        this.f4639v = actionMenuView;
        actionMenuView.setBackground(null);
        addView(this.f4639v, layoutParams);
    }

    public final void d() {
        if (this.f4631G == null) {
            LayoutInflater.from(getContext()).inflate(C5284R.layout.abc_action_bar_title_item, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f4631G = linearLayout;
            this.f4632H = (TextView) linearLayout.findViewById(C5284R.id.action_bar_title);
            this.f4633I = (TextView) this.f4631G.findViewById(C5284R.id.action_bar_subtitle);
            int i = this.J;
            if (i != 0) {
                this.f4632H.setTextAppearance(getContext(), i);
            }
            int i4 = this.f4634K;
            if (i4 != 0) {
                this.f4633I.setTextAppearance(getContext(), i4);
            }
        }
        this.f4632H.setText(this.f4626B);
        this.f4633I.setText(this.f4627C);
        boolean isEmpty = TextUtils.isEmpty(this.f4626B);
        boolean isEmpty2 = TextUtils.isEmpty(this.f4627C);
        this.f4633I.setVisibility(!isEmpty2 ? 0 : 8);
        this.f4631G.setVisibility((isEmpty && isEmpty2) ? 8 : 0);
        if (this.f4631G.getParent() == null) {
            addView(this.f4631G);
        }
    }

    public final void e() {
        removeAllViews();
        this.f4630F = null;
        this.f4639v = null;
        this.f4640w = null;
        View view = this.f4629E;
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
        return this.f4642y != null ? this.f4637n.f39375b : getVisibility();
    }

    public int getContentHeight() {
        return this.f4641x;
    }

    public CharSequence getSubtitle() {
        return this.f4627C;
    }

    public CharSequence getTitle() {
        return this.f4626B;
    }

    @Override // android.view.View
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public final void setVisibility(int i) {
        if (i != getVisibility()) {
            C0343e0 c0343e0 = this.f4642y;
            if (c0343e0 != null) {
                c0343e0.b();
            }
            super.setVisibility(i);
        }
    }

    public final C0343e0 i(int i, long j9) {
        C0343e0 c0343e0 = this.f4642y;
        if (c0343e0 != null) {
            c0343e0.b();
        }
        C4723a c4723a = this.f4637n;
        if (i != 0) {
            C0343e0 a9 = X.a(this);
            a9.a(0.0f);
            a9.c(j9);
            c4723a.f39376c.f4642y = a9;
            c4723a.f39375b = i;
            a9.d(c4723a);
            return a9;
        }
        if (getVisibility() != 0) {
            setAlpha(0.0f);
        }
        C0343e0 a10 = X.a(this);
        a10.a(1.0f);
        a10.c(j9);
        c4723a.f39376c.f4642y = a10;
        c4723a.f39375b = i;
        a10.d(c4723a);
        return a10;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(null, AbstractC4518a.f37818a, C5284R.attr.actionBarStyle, 0);
        setContentHeight(obtainStyledAttributes.getLayoutDimension(13, 0));
        obtainStyledAttributes.recycle();
        C4743k c4743k = this.f4640w;
        if (c4743k != null) {
            Configuration configuration2 = c4743k.f39444u.getResources().getConfiguration();
            int i = configuration2.screenWidthDp;
            int i4 = configuration2.screenHeightDp;
            c4743k.f39436I = (configuration2.smallestScreenWidthDp > 600 || i > 600 || (i > 960 && i4 > 720) || (i > 720 && i4 > 960)) ? 5 : (i >= 500 || (i > 640 && i4 > 480) || (i > 480 && i4 > 640)) ? 4 : i >= 360 ? 3 : 2;
            l lVar = c4743k.f39445v;
            if (lVar != null) {
                lVar.p(true);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C4743k c4743k = this.f4640w;
        if (c4743k != null) {
            c4743k.f();
            C4735g c4735g = this.f4640w.f39439M;
            if (c4735g == null || !c4735g.b()) {
                return;
            }
            c4735g.i.dismiss();
        }
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f4625A = false;
        }
        if (!this.f4625A) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f4625A = true;
            }
        }
        if (actionMasked != 10 && actionMasked != 3) {
            return true;
        }
        this.f4625A = false;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z8, int i, int i4, int i9, int i10) {
        boolean z9 = g1.f39419a;
        boolean z10 = getLayoutDirection() == 1;
        int paddingRight = z10 ? (i9 - i) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i10 - i4) - getPaddingTop()) - getPaddingBottom();
        View view = this.f4628D;
        if (view != null && view.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f4628D.getLayoutParams();
            int i11 = z10 ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i12 = z10 ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int i13 = z10 ? paddingRight - i11 : paddingRight + i11;
            int g9 = g(i13, paddingTop, paddingTop2, this.f4628D, z10) + i13;
            paddingRight = z10 ? g9 - i12 : g9 + i12;
        }
        LinearLayout linearLayout = this.f4631G;
        if (linearLayout != null && this.f4630F == null && linearLayout.getVisibility() != 8) {
            paddingRight += g(paddingRight, paddingTop, paddingTop2, this.f4631G, z10);
        }
        View view2 = this.f4630F;
        if (view2 != null) {
            g(paddingRight, paddingTop, paddingTop2, view2, z10);
        }
        int paddingLeft = z10 ? getPaddingLeft() : (i9 - i) - getPaddingRight();
        ActionMenuView actionMenuView = this.f4639v;
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
        int i9 = this.f4641x;
        if (i9 <= 0) {
            i9 = View.MeasureSpec.getSize(i4);
        }
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int i10 = i9 - paddingBottom;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i10, Integer.MIN_VALUE);
        View view = this.f4628D;
        if (view != null) {
            int f6 = f(paddingLeft, makeMeasureSpec, view);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f4628D.getLayoutParams();
            paddingLeft = f6 - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
        }
        ActionMenuView actionMenuView = this.f4639v;
        if (actionMenuView != null && actionMenuView.getParent() == this) {
            paddingLeft = f(paddingLeft, makeMeasureSpec, this.f4639v);
        }
        LinearLayout linearLayout = this.f4631G;
        if (linearLayout != null && this.f4630F == null) {
            if (this.f4635L) {
                this.f4631G.measure(View.MeasureSpec.makeMeasureSpec(0, 0), makeMeasureSpec);
                int measuredWidth = this.f4631G.getMeasuredWidth();
                boolean z8 = measuredWidth <= paddingLeft;
                if (z8) {
                    paddingLeft -= measuredWidth;
                }
                this.f4631G.setVisibility(z8 ? 0 : 8);
            } else {
                paddingLeft = f(paddingLeft, makeMeasureSpec, linearLayout);
            }
        }
        View view2 = this.f4630F;
        if (view2 != null) {
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            int i11 = layoutParams.width;
            int i12 = i11 != -2 ? 1073741824 : Integer.MIN_VALUE;
            if (i11 >= 0) {
                paddingLeft = Math.min(i11, paddingLeft);
            }
            int i13 = layoutParams.height;
            int i14 = i13 == -2 ? Integer.MIN_VALUE : 1073741824;
            if (i13 >= 0) {
                i10 = Math.min(i13, i10);
            }
            this.f4630F.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i12), View.MeasureSpec.makeMeasureSpec(i10, i14));
        }
        if (this.f4641x > 0) {
            setMeasuredDimension(size, i9);
            return;
        }
        int childCount = getChildCount();
        int i15 = 0;
        for (int i16 = 0; i16 < childCount; i16++) {
            int measuredHeight = getChildAt(i16).getMeasuredHeight() + paddingBottom;
            if (measuredHeight > i15) {
                i15 = measuredHeight;
            }
        }
        setMeasuredDimension(size, i15);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f4643z = false;
        }
        if (!this.f4643z) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f4643z = true;
            }
        }
        if (actionMasked != 1 && actionMasked != 3) {
            return true;
        }
        this.f4643z = false;
        return true;
    }

    public void setContentHeight(int i) {
        this.f4641x = i;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.f4630F;
        if (view2 != null) {
            removeView(view2);
        }
        this.f4630F = view;
        if (view != null && (linearLayout = this.f4631G) != null) {
            removeView(linearLayout);
            this.f4631G = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f4627C = charSequence;
        d();
    }

    public void setTitle(CharSequence charSequence) {
        this.f4626B = charSequence;
        d();
        X.p(this, charSequence);
    }

    public void setTitleOptional(boolean z8) {
        if (z8 != this.f4635L) {
            requestLayout();
        }
        this.f4635L = z8;
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
