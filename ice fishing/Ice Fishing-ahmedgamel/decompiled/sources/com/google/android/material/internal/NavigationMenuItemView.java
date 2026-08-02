package com.google.android.material.internal;

import A3.a;
import A3.f;
import A8.b;
import F.j;
import F.q;
import O.X;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.IceFishing.LiveIceFishing.C5248R;
import java.util.WeakHashMap;
import l.o;
import l.z;
import m.C4726t0;

/* loaded from: classes2.dex */
public class NavigationMenuItemView extends f implements z {

    /* renamed from: k0, reason: collision with root package name */
    public static final int[] f36793k0 = {R.attr.state_checked};

    /* renamed from: O, reason: collision with root package name */
    public int f36794O;

    /* renamed from: P, reason: collision with root package name */
    public boolean f36795P;

    /* renamed from: Q, reason: collision with root package name */
    public boolean f36796Q;

    /* renamed from: R, reason: collision with root package name */
    public final boolean f36797R;

    /* renamed from: S, reason: collision with root package name */
    public final CheckedTextView f36798S;

    /* renamed from: T, reason: collision with root package name */
    public FrameLayout f36799T;

    /* renamed from: U, reason: collision with root package name */
    public o f36800U;

    /* renamed from: V, reason: collision with root package name */
    public ColorStateList f36801V;

    /* renamed from: W, reason: collision with root package name */
    public boolean f36802W;

    /* renamed from: i0, reason: collision with root package name */
    public Drawable f36803i0;

    /* renamed from: j0, reason: collision with root package name */
    public final a f36804j0;

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f36797R = true;
        a aVar = new a(1, this);
        this.f36804j0 = aVar;
        setOrientation(0);
        LayoutInflater.from(context).inflate(C5248R.layout.design_navigation_menu_item, (ViewGroup) this, true);
        setIconSize(context.getResources().getDimensionPixelSize(C5248R.dimen.design_navigation_icon_size));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(C5248R.id.design_menu_item_text);
        this.f36798S = checkedTextView;
        checkedTextView.setDuplicateParentStateEnabled(true);
        X.o(checkedTextView, aVar);
    }

    private void setActionView(View view) {
        if (view != null) {
            if (this.f36799T == null) {
                this.f36799T = (FrameLayout) ((ViewStub) findViewById(C5248R.id.design_menu_item_action_area_stub)).inflate();
            }
            if (view.getParent() != null) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            this.f36799T.removeAllViews();
            this.f36799T.addView(view);
        }
    }

    @Override // l.z
    public final void b(o oVar) {
        StateListDrawable stateListDrawable;
        this.f36800U = oVar;
        int i = oVar.f38778n;
        if (i > 0) {
            setId(i);
        }
        setVisibility(oVar.isVisible() ? 0 : 8);
        if (getBackground() == null) {
            TypedValue typedValue = new TypedValue();
            if (getContext().getTheme().resolveAttribute(C5248R.attr.colorControlHighlight, typedValue, true)) {
                stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(f36793k0, new ColorDrawable(typedValue.data));
                stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
            } else {
                stateListDrawable = null;
            }
            WeakHashMap weakHashMap = X.f2142a;
            setBackground(stateListDrawable);
        }
        setCheckable(oVar.isCheckable());
        setChecked(oVar.isChecked());
        setEnabled(oVar.isEnabled());
        setTitle(oVar.f38782x);
        setIcon(oVar.getIcon());
        setActionView(oVar.getActionView());
        setContentDescription(oVar.J);
        b.v(this, oVar.f38766K);
        o oVar2 = this.f36800U;
        CharSequence charSequence = oVar2.f38782x;
        CheckedTextView checkedTextView = this.f36798S;
        if (charSequence == null && oVar2.getIcon() == null && this.f36800U.getActionView() != null) {
            checkedTextView.setVisibility(8);
            FrameLayout frameLayout = this.f36799T;
            if (frameLayout != null) {
                C4726t0 c4726t0 = (C4726t0) frameLayout.getLayoutParams();
                ((LinearLayout.LayoutParams) c4726t0).width = -1;
                this.f36799T.setLayoutParams(c4726t0);
                return;
            }
            return;
        }
        checkedTextView.setVisibility(0);
        FrameLayout frameLayout2 = this.f36799T;
        if (frameLayout2 != null) {
            C4726t0 c4726t02 = (C4726t0) frameLayout2.getLayoutParams();
            ((LinearLayout.LayoutParams) c4726t02).width = -2;
            this.f36799T.setLayoutParams(c4726t02);
        }
    }

    @Override // l.z
    public o getItemData() {
        return this.f36800U;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        o oVar = this.f36800U;
        if (oVar != null && oVar.isCheckable() && this.f36800U.isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f36793k0);
        }
        return onCreateDrawableState;
    }

    public void setCheckable(boolean z6) {
        refreshDrawableState();
        if (this.f36796Q != z6) {
            this.f36796Q = z6;
            this.f36804j0.h(this.f36798S, 2048);
        }
    }

    public void setChecked(boolean z6) {
        refreshDrawableState();
        CheckedTextView checkedTextView = this.f36798S;
        checkedTextView.setChecked(z6);
        checkedTextView.setTypeface(checkedTextView.getTypeface(), (z6 && this.f36797R) ? 1 : 0);
    }

    public void setHorizontalPadding(int i) {
        setPadding(i, getPaddingTop(), i, getPaddingBottom());
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            if (this.f36802W) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = drawable.mutate();
                H.a.h(drawable, this.f36801V);
            }
            int i = this.f36794O;
            drawable.setBounds(0, 0, i, i);
        } else if (this.f36795P) {
            if (this.f36803i0 == null) {
                Resources resources = getResources();
                Resources.Theme theme = getContext().getTheme();
                ThreadLocal threadLocal = q.f942a;
                Drawable a9 = j.a(resources, C5248R.drawable.navigation_empty_icon, theme);
                this.f36803i0 = a9;
                if (a9 != null) {
                    int i4 = this.f36794O;
                    a9.setBounds(0, 0, i4, i4);
                }
            }
            drawable = this.f36803i0;
        }
        this.f36798S.setCompoundDrawablesRelative(drawable, null, null, null);
    }

    public void setIconPadding(int i) {
        this.f36798S.setCompoundDrawablePadding(i);
    }

    public void setIconSize(int i) {
        this.f36794O = i;
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.f36801V = colorStateList;
        this.f36802W = colorStateList != null;
        o oVar = this.f36800U;
        if (oVar != null) {
            setIcon(oVar.getIcon());
        }
    }

    public void setMaxLines(int i) {
        this.f36798S.setMaxLines(i);
    }

    public void setNeedsEmptyIcon(boolean z6) {
        this.f36795P = z6;
    }

    public void setTextAppearance(int i) {
        this.f36798S.setTextAppearance(i);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.f36798S.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.f36798S.setText(charSequence);
    }
}
