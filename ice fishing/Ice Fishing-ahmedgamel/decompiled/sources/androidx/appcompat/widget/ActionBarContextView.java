package androidx.appcompat.widget;

import L3.q;
import O.C0330e0;
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
import com.bumptech.glide.g;
import com.icefishingapp.icefishing.C5275R;
import g.AbstractC4518a;
import k.AbstractC4615b;
import l.InterfaceC4639A;
import l.m;
import m.C4675a;
import m.C4687g;
import m.C4695k;
import m.f1;

/* loaded from: classes.dex */
public class ActionBarContextView extends ViewGroup {

    /* renamed from: A, reason: collision with root package name */
    public boolean f4510A;

    /* renamed from: B, reason: collision with root package name */
    public CharSequence f4511B;

    /* renamed from: C, reason: collision with root package name */
    public CharSequence f4512C;

    /* renamed from: D, reason: collision with root package name */
    public View f4513D;

    /* renamed from: E, reason: collision with root package name */
    public View f4514E;

    /* renamed from: F, reason: collision with root package name */
    public View f4515F;

    /* renamed from: G, reason: collision with root package name */
    public LinearLayout f4516G;

    /* renamed from: H, reason: collision with root package name */
    public TextView f4517H;

    /* renamed from: I, reason: collision with root package name */
    public TextView f4518I;
    public final int J;

    /* renamed from: K, reason: collision with root package name */
    public final int f4519K;

    /* renamed from: L, reason: collision with root package name */
    public boolean f4520L;

    /* renamed from: M, reason: collision with root package name */
    public final int f4521M;

    /* renamed from: n, reason: collision with root package name */
    public final C4675a f4522n;

    /* renamed from: u, reason: collision with root package name */
    public final Context f4523u;

    /* renamed from: v, reason: collision with root package name */
    public ActionMenuView f4524v;

    /* renamed from: w, reason: collision with root package name */
    public C4695k f4525w;

    /* renamed from: x, reason: collision with root package name */
    public int f4526x;

    /* renamed from: y, reason: collision with root package name */
    public C0330e0 f4527y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f4528z;

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, C5275R.attr.actionModeStyle);
        int resourceId;
        this.f4522n = new C4675a(this);
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(C5275R.attr.actionBarPopupTheme, typedValue, true) || typedValue.resourceId == 0) {
            this.f4523u = context;
        } else {
            this.f4523u = new ContextThemeWrapper(context, typedValue.resourceId);
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC4518a.f37591d, C5275R.attr.actionModeStyle, 0);
        setBackground((!obtainStyledAttributes.hasValue(0) || (resourceId = obtainStyledAttributes.getResourceId(0, 0)) == 0) ? obtainStyledAttributes.getDrawable(0) : g.e(context, resourceId));
        this.J = obtainStyledAttributes.getResourceId(5, 0);
        this.f4519K = obtainStyledAttributes.getResourceId(4, 0);
        this.f4526x = obtainStyledAttributes.getLayoutDimension(3, 0);
        this.f4521M = obtainStyledAttributes.getResourceId(2, C5275R.layout.abc_action_mode_close_item_material);
        obtainStyledAttributes.recycle();
    }

    public static int f(int i, int i6, View view) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i, Integer.MIN_VALUE), i6);
        return Math.max(0, i - view.getMeasuredWidth());
    }

    public static int g(int i, int i6, int i9, View view, boolean z3) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i10 = ((i9 - measuredHeight) / 2) + i6;
        if (z3) {
            view.layout(i - measuredWidth, i10, i, measuredHeight + i10);
        } else {
            view.layout(i, i10, i + measuredWidth, measuredHeight + i10);
        }
        return z3 ? -measuredWidth : measuredWidth;
    }

    public final void c(AbstractC4615b abstractC4615b) {
        View view = this.f4513D;
        if (view == null) {
            View inflate = LayoutInflater.from(getContext()).inflate(this.f4521M, (ViewGroup) this, false);
            this.f4513D = inflate;
            addView(inflate);
        } else if (view.getParent() == null) {
            addView(this.f4513D);
        }
        View findViewById = this.f4513D.findViewById(C5275R.id.action_mode_close_button);
        this.f4514E = findViewById;
        findViewById.setOnClickListener(new q(5, abstractC4615b));
        m c9 = abstractC4615b.c();
        C4695k c4695k = this.f4525w;
        if (c4695k != null) {
            c4695k.f();
            C4687g c4687g = c4695k.f39168M;
            if (c4687g != null && c4687g.b()) {
                c4687g.i.dismiss();
            }
        }
        C4695k c4695k2 = new C4695k(getContext());
        this.f4525w = c4695k2;
        c4695k2.f39161E = true;
        c4695k2.f39162F = true;
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        c9.b(this.f4525w, this.f4523u);
        C4695k c4695k3 = this.f4525w;
        InterfaceC4639A interfaceC4639A = c4695k3.f39157A;
        if (interfaceC4639A == null) {
            InterfaceC4639A interfaceC4639A2 = (InterfaceC4639A) c4695k3.f39175w.inflate(c4695k3.f39177y, (ViewGroup) this, false);
            c4695k3.f39157A = interfaceC4639A2;
            interfaceC4639A2.c(c4695k3.f39174v);
            c4695k3.e();
        }
        InterfaceC4639A interfaceC4639A3 = c4695k3.f39157A;
        if (interfaceC4639A != interfaceC4639A3) {
            ((ActionMenuView) interfaceC4639A3).setPresenter(c4695k3);
        }
        ActionMenuView actionMenuView = (ActionMenuView) interfaceC4639A3;
        this.f4524v = actionMenuView;
        actionMenuView.setBackground(null);
        addView(this.f4524v, layoutParams);
    }

    public final void d() {
        if (this.f4516G == null) {
            LayoutInflater.from(getContext()).inflate(C5275R.layout.abc_action_bar_title_item, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f4516G = linearLayout;
            this.f4517H = (TextView) linearLayout.findViewById(C5275R.id.action_bar_title);
            this.f4518I = (TextView) this.f4516G.findViewById(C5275R.id.action_bar_subtitle);
            int i = this.J;
            if (i != 0) {
                this.f4517H.setTextAppearance(getContext(), i);
            }
            int i6 = this.f4519K;
            if (i6 != 0) {
                this.f4518I.setTextAppearance(getContext(), i6);
            }
        }
        this.f4517H.setText(this.f4511B);
        this.f4518I.setText(this.f4512C);
        boolean isEmpty = TextUtils.isEmpty(this.f4511B);
        boolean isEmpty2 = TextUtils.isEmpty(this.f4512C);
        this.f4518I.setVisibility(!isEmpty2 ? 0 : 8);
        this.f4516G.setVisibility((isEmpty && isEmpty2) ? 8 : 0);
        if (this.f4516G.getParent() == null) {
            addView(this.f4516G);
        }
    }

    public final void e() {
        removeAllViews();
        this.f4515F = null;
        this.f4524v = null;
        this.f4525w = null;
        View view = this.f4514E;
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
        return this.f4527y != null ? this.f4522n.f39106b : getVisibility();
    }

    public int getContentHeight() {
        return this.f4526x;
    }

    public CharSequence getSubtitle() {
        return this.f4512C;
    }

    public CharSequence getTitle() {
        return this.f4511B;
    }

    @Override // android.view.View
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public final void setVisibility(int i) {
        if (i != getVisibility()) {
            C0330e0 c0330e0 = this.f4527y;
            if (c0330e0 != null) {
                c0330e0.b();
            }
            super.setVisibility(i);
        }
    }

    public final C0330e0 i(int i, long j6) {
        C0330e0 c0330e0 = this.f4527y;
        if (c0330e0 != null) {
            c0330e0.b();
        }
        C4675a c4675a = this.f4522n;
        if (i != 0) {
            C0330e0 a9 = X.a(this);
            a9.a(0.0f);
            a9.c(j6);
            c4675a.f39107c.f4527y = a9;
            c4675a.f39106b = i;
            a9.d(c4675a);
            return a9;
        }
        if (getVisibility() != 0) {
            setAlpha(0.0f);
        }
        C0330e0 a10 = X.a(this);
        a10.a(1.0f);
        a10.c(j6);
        c4675a.f39107c.f4527y = a10;
        c4675a.f39106b = i;
        a10.d(c4675a);
        return a10;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(null, AbstractC4518a.f37588a, C5275R.attr.actionBarStyle, 0);
        setContentHeight(obtainStyledAttributes.getLayoutDimension(13, 0));
        obtainStyledAttributes.recycle();
        C4695k c4695k = this.f4525w;
        if (c4695k != null) {
            Configuration configuration2 = c4695k.f39173u.getResources().getConfiguration();
            int i = configuration2.screenWidthDp;
            int i6 = configuration2.screenHeightDp;
            c4695k.f39165I = (configuration2.smallestScreenWidthDp > 600 || i > 600 || (i > 960 && i6 > 720) || (i > 720 && i6 > 960)) ? 5 : (i >= 500 || (i > 640 && i6 > 480) || (i > 480 && i6 > 640)) ? 4 : i >= 360 ? 3 : 2;
            m mVar = c4695k.f39174v;
            if (mVar != null) {
                mVar.p(true);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C4695k c4695k = this.f4525w;
        if (c4695k != null) {
            c4695k.f();
            C4687g c4687g = this.f4525w.f39168M;
            if (c4687g == null || !c4687g.b()) {
                return;
            }
            c4687g.i.dismiss();
        }
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f4510A = false;
        }
        if (!this.f4510A) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f4510A = true;
            }
        }
        if (actionMasked != 10 && actionMasked != 3) {
            return true;
        }
        this.f4510A = false;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z3, int i, int i6, int i9, int i10) {
        boolean z6 = f1.f39146a;
        boolean z9 = getLayoutDirection() == 1;
        int paddingRight = z9 ? (i9 - i) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i10 - i6) - getPaddingTop()) - getPaddingBottom();
        View view = this.f4513D;
        if (view != null && view.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f4513D.getLayoutParams();
            int i11 = z9 ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i12 = z9 ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int i13 = z9 ? paddingRight - i11 : paddingRight + i11;
            int g4 = g(i13, paddingTop, paddingTop2, this.f4513D, z9) + i13;
            paddingRight = z9 ? g4 - i12 : g4 + i12;
        }
        LinearLayout linearLayout = this.f4516G;
        if (linearLayout != null && this.f4515F == null && linearLayout.getVisibility() != 8) {
            paddingRight += g(paddingRight, paddingTop, paddingTop2, this.f4516G, z9);
        }
        View view2 = this.f4515F;
        if (view2 != null) {
            g(paddingRight, paddingTop, paddingTop2, view2, z9);
        }
        int paddingLeft = z9 ? getPaddingLeft() : (i9 - i) - getPaddingRight();
        ActionMenuView actionMenuView = this.f4524v;
        if (actionMenuView != null) {
            g(paddingLeft, paddingTop, paddingTop2, actionMenuView, !z9);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i6) {
        if (View.MeasureSpec.getMode(i) != 1073741824) {
            throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_width=\"match_parent\" (or fill_parent)"));
        }
        if (View.MeasureSpec.getMode(i6) == 0) {
            throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_height=\"wrap_content\""));
        }
        int size = View.MeasureSpec.getSize(i);
        int i9 = this.f4526x;
        if (i9 <= 0) {
            i9 = View.MeasureSpec.getSize(i6);
        }
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int i10 = i9 - paddingBottom;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i10, Integer.MIN_VALUE);
        View view = this.f4513D;
        if (view != null) {
            int f3 = f(paddingLeft, makeMeasureSpec, view);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f4513D.getLayoutParams();
            paddingLeft = f3 - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
        }
        ActionMenuView actionMenuView = this.f4524v;
        if (actionMenuView != null && actionMenuView.getParent() == this) {
            paddingLeft = f(paddingLeft, makeMeasureSpec, this.f4524v);
        }
        LinearLayout linearLayout = this.f4516G;
        if (linearLayout != null && this.f4515F == null) {
            if (this.f4520L) {
                this.f4516G.measure(View.MeasureSpec.makeMeasureSpec(0, 0), makeMeasureSpec);
                int measuredWidth = this.f4516G.getMeasuredWidth();
                boolean z3 = measuredWidth <= paddingLeft;
                if (z3) {
                    paddingLeft -= measuredWidth;
                }
                this.f4516G.setVisibility(z3 ? 0 : 8);
            } else {
                paddingLeft = f(paddingLeft, makeMeasureSpec, linearLayout);
            }
        }
        View view2 = this.f4515F;
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
            this.f4515F.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i12), View.MeasureSpec.makeMeasureSpec(i10, i14));
        }
        if (this.f4526x > 0) {
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
            this.f4528z = false;
        }
        if (!this.f4528z) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f4528z = true;
            }
        }
        if (actionMasked != 1 && actionMasked != 3) {
            return true;
        }
        this.f4528z = false;
        return true;
    }

    public void setContentHeight(int i) {
        this.f4526x = i;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.f4515F;
        if (view2 != null) {
            removeView(view2);
        }
        this.f4515F = view;
        if (view != null && (linearLayout = this.f4516G) != null) {
            removeView(linearLayout);
            this.f4516G = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f4512C = charSequence;
        d();
    }

    public void setTitle(CharSequence charSequence) {
        this.f4511B = charSequence;
        d();
        X.p(this, charSequence);
    }

    public void setTitleOptional(boolean z3) {
        if (z3 != this.f4520L) {
            requestLayout();
        }
        this.f4520L = z3;
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
