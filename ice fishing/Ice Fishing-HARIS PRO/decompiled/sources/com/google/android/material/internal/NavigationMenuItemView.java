package com.google.android.material.internal;

import B0.m;
import L0.d;
import O.K;
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
import java.util.WeakHashMap;
import l.o;
import l.z;
import m.C0284v0;
import m.d1;

/* loaded from: classes.dex */
public class NavigationMenuItemView extends d implements z {

    /* renamed from: G, reason: collision with root package name */
    public static final int[] f2551G = {R.attr.state_checked};

    /* renamed from: A, reason: collision with root package name */
    public FrameLayout f2552A;

    /* renamed from: B, reason: collision with root package name */
    public o f2553B;

    /* renamed from: C, reason: collision with root package name */
    public ColorStateList f2554C;

    /* renamed from: D, reason: collision with root package name */
    public boolean f2555D;

    /* renamed from: E, reason: collision with root package name */
    public Drawable f2556E;

    /* renamed from: F, reason: collision with root package name */
    public final m f2557F;

    /* renamed from: v, reason: collision with root package name */
    public int f2558v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f2559w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f2560x;

    /* renamed from: y, reason: collision with root package name */
    public final boolean f2561y;

    /* renamed from: z, reason: collision with root package name */
    public final CheckedTextView f2562z;

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2561y = true;
        m mVar = new m(3, this);
        this.f2557F = mVar;
        setOrientation(0);
        LayoutInflater.from(context).inflate(com.lumenpath.harispro.hrnavigator.R.layout.design_navigation_menu_item, (ViewGroup) this, true);
        setIconSize(context.getResources().getDimensionPixelSize(com.lumenpath.harispro.hrnavigator.R.dimen.design_navigation_icon_size));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(com.lumenpath.harispro.hrnavigator.R.id.design_menu_item_text);
        this.f2562z = checkedTextView;
        checkedTextView.setDuplicateParentStateEnabled(true);
        K.l(checkedTextView, mVar);
    }

    private void setActionView(View view) {
        if (view != null) {
            if (this.f2552A == null) {
                this.f2552A = (FrameLayout) ((ViewStub) findViewById(com.lumenpath.harispro.hrnavigator.R.id.design_menu_item_action_area_stub)).inflate();
            }
            if (view.getParent() != null) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            this.f2552A.removeAllViews();
            this.f2552A.addView(view);
        }
    }

    @Override // l.z
    public final void c(o oVar) {
        StateListDrawable stateListDrawable;
        this.f2553B = oVar;
        int i = oVar.f3736a;
        if (i > 0) {
            setId(i);
        }
        setVisibility(oVar.isVisible() ? 0 : 8);
        if (getBackground() == null) {
            TypedValue typedValue = new TypedValue();
            if (getContext().getTheme().resolveAttribute(com.lumenpath.harispro.hrnavigator.R.attr.colorControlHighlight, typedValue, true)) {
                stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(f2551G, new ColorDrawable(typedValue.data));
                stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
            } else {
                stateListDrawable = null;
            }
            WeakHashMap weakHashMap = K.f747a;
            setBackground(stateListDrawable);
        }
        setCheckable(oVar.isCheckable());
        setChecked(oVar.isChecked());
        setEnabled(oVar.isEnabled());
        setTitle(oVar.e);
        setIcon(oVar.getIcon());
        setActionView(oVar.getActionView());
        setContentDescription(oVar.f3749q);
        d1.a(this, oVar.f3750r);
        o oVar2 = this.f2553B;
        CharSequence charSequence = oVar2.e;
        CheckedTextView checkedTextView = this.f2562z;
        if (charSequence == null && oVar2.getIcon() == null && this.f2553B.getActionView() != null) {
            checkedTextView.setVisibility(8);
            FrameLayout frameLayout = this.f2552A;
            if (frameLayout != null) {
                C0284v0 c0284v0 = (C0284v0) frameLayout.getLayoutParams();
                ((LinearLayout.LayoutParams) c0284v0).width = -1;
                this.f2552A.setLayoutParams(c0284v0);
                return;
            }
            return;
        }
        checkedTextView.setVisibility(0);
        FrameLayout frameLayout2 = this.f2552A;
        if (frameLayout2 != null) {
            C0284v0 c0284v02 = (C0284v0) frameLayout2.getLayoutParams();
            ((LinearLayout.LayoutParams) c0284v02).width = -2;
            this.f2552A.setLayoutParams(c0284v02);
        }
    }

    @Override // l.z
    public o getItemData() {
        return this.f2553B;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        o oVar = this.f2553B;
        if (oVar != null && oVar.isCheckable() && this.f2553B.isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f2551G);
        }
        return onCreateDrawableState;
    }

    public void setCheckable(boolean z2) {
        refreshDrawableState();
        if (this.f2560x != z2) {
            this.f2560x = z2;
            this.f2557F.h(this.f2562z, 2048);
        }
    }

    public void setChecked(boolean z2) {
        refreshDrawableState();
        CheckedTextView checkedTextView = this.f2562z;
        checkedTextView.setChecked(z2);
        checkedTextView.setTypeface(checkedTextView.getTypeface(), (z2 && this.f2561y) ? 1 : 0);
    }

    public void setHorizontalPadding(int i) {
        setPadding(i, getPaddingTop(), i, getPaddingBottom());
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            if (this.f2555D) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = drawable.mutate();
                drawable.setTintList(this.f2554C);
            }
            int i = this.f2558v;
            drawable.setBounds(0, 0, i, i);
        } else if (this.f2559w) {
            if (this.f2556E == null) {
                Resources resources = getResources();
                Resources.Theme theme = getContext().getTheme();
                ThreadLocal threadLocal = F.o.f221a;
                Drawable drawable2 = resources.getDrawable(com.lumenpath.harispro.hrnavigator.R.drawable.navigation_empty_icon, theme);
                this.f2556E = drawable2;
                if (drawable2 != null) {
                    int i2 = this.f2558v;
                    drawable2.setBounds(0, 0, i2, i2);
                }
            }
            drawable = this.f2556E;
        }
        this.f2562z.setCompoundDrawablesRelative(drawable, null, null, null);
    }

    public void setIconPadding(int i) {
        this.f2562z.setCompoundDrawablePadding(i);
    }

    public void setIconSize(int i) {
        this.f2558v = i;
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.f2554C = colorStateList;
        this.f2555D = colorStateList != null;
        o oVar = this.f2553B;
        if (oVar != null) {
            setIcon(oVar.getIcon());
        }
    }

    public void setMaxLines(int i) {
        this.f2562z.setMaxLines(i);
    }

    public void setNeedsEmptyIcon(boolean z2) {
        this.f2559w = z2;
    }

    public void setTextAppearance(int i) {
        this.f2562z.setTextAppearance(i);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.f2562z.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.f2562z.setText(charSequence);
    }
}
