package com.google.android.material.internal;

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
import com.gamericefishpro.space.d4.l0;
import com.gamericefishpro.space.fa.a;
import com.gamericefishpro.space.fa.e;
import com.gamericefishpro.space.m.j;
import com.gamericefishpro.space.m.p;
import com.gamericefishpro.space.n.h2;
import com.gamericefishpro.space.n.z0;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public class NavigationMenuItemView extends e implements p {
    public static final int[] c0 = {R.attr.state_checked};
    public int O;
    public boolean P;
    public boolean Q;
    public final boolean R;
    public final CheckedTextView S;
    public FrameLayout T;
    public j U;
    public ColorStateList V;
    public boolean W;
    public Drawable a0;
    public final a b0;

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.R = true;
        a aVar = new a(this, 1);
        this.b0 = aVar;
        setOrientation(0);
        LayoutInflater.from(context).inflate(com.gamericefishpro.space.R.layout.design_navigation_menu_item, (ViewGroup) this, true);
        setIconSize(context.getResources().getDimensionPixelSize(com.gamericefishpro.space.R.dimen.design_navigation_icon_size));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(com.gamericefishpro.space.R.id.design_menu_item_text);
        this.S = checkedTextView;
        l0.l(checkedTextView, aVar);
    }

    private void setActionView(View view) {
        if (view != null) {
            if (this.T == null) {
                this.T = (FrameLayout) ((ViewStub) findViewById(com.gamericefishpro.space.R.id.design_menu_item_action_area_stub)).inflate();
            }
            if (view.getParent() != null) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            this.T.removeAllViews();
            this.T.addView(view);
        }
    }

    @Override // com.gamericefishpro.space.m.p
    public final void a(j jVar) {
        StateListDrawable stateListDrawable;
        this.U = jVar;
        int i = jVar.a;
        if (i > 0) {
            setId(i);
        }
        setVisibility(jVar.isVisible() ? 0 : 8);
        if (getBackground() == null) {
            TypedValue typedValue = new TypedValue();
            if (getContext().getTheme().resolveAttribute(com.gamericefishpro.space.R.attr.colorControlHighlight, typedValue, true)) {
                stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(c0, new ColorDrawable(typedValue.data));
                stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
            } else {
                stateListDrawable = null;
            }
            setBackground(stateListDrawable);
        }
        setCheckable(jVar.isCheckable());
        setChecked(jVar.isChecked());
        setEnabled(jVar.isEnabled());
        setTitle(jVar.e);
        setIcon(jVar.getIcon());
        View view = jVar.z;
        if (view == null) {
            view = null;
        }
        setActionView(view);
        setContentDescription(jVar.q);
        h2.a(this, jVar.r);
        j jVar2 = this.U;
        CharSequence charSequence = jVar2.e;
        CheckedTextView checkedTextView = this.S;
        if (charSequence == null && jVar2.getIcon() == null) {
            View view2 = this.U.z;
            if ((view2 != null ? view2 : null) != null) {
                checkedTextView.setVisibility(8);
                FrameLayout frameLayout = this.T;
                if (frameLayout != null) {
                    z0 z0Var = (z0) frameLayout.getLayoutParams();
                    ((LinearLayout.LayoutParams) z0Var).width = -1;
                    this.T.setLayoutParams(z0Var);
                    return;
                }
                return;
            }
        }
        checkedTextView.setVisibility(0);
        FrameLayout frameLayout2 = this.T;
        if (frameLayout2 != null) {
            z0 z0Var2 = (z0) frameLayout2.getLayoutParams();
            ((LinearLayout.LayoutParams) z0Var2).width = -2;
            this.T.setLayoutParams(z0Var2);
        }
    }

    @Override // com.gamericefishpro.space.m.p
    public j getItemData() {
        return this.U;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 1);
        j jVar = this.U;
        if (jVar != null && jVar.isCheckable() && this.U.isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, c0);
        }
        return iArrOnCreateDrawableState;
    }

    public void setCheckable(boolean z) {
        refreshDrawableState();
        if (this.Q != z) {
            this.Q = z;
            this.b0.h(this.S, 2048);
        }
    }

    public void setChecked(boolean z) {
        refreshDrawableState();
        CheckedTextView checkedTextView = this.S;
        checkedTextView.setChecked(z);
        checkedTextView.setTypeface(checkedTextView.getTypeface(), (z && this.R) ? 1 : 0);
    }

    public void setHorizontalPadding(int i) {
        setPadding(i, getPaddingTop(), i, getPaddingBottom());
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            if (this.W) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = drawable.mutate();
                drawable.setTintList(this.V);
            }
            int i = this.O;
            drawable.setBounds(0, 0, i, i);
        } else if (this.P) {
            if (this.a0 == null) {
                Resources resources = getResources();
                Resources.Theme theme = getContext().getTheme();
                ThreadLocal threadLocal = com.gamericefishpro.space.t3.j.a;
                Drawable drawable2 = resources.getDrawable(com.gamericefishpro.space.R.drawable.navigation_empty_icon, theme);
                this.a0 = drawable2;
                if (drawable2 != null) {
                    int i2 = this.O;
                    drawable2.setBounds(0, 0, i2, i2);
                }
            }
            drawable = this.a0;
        }
        this.S.setCompoundDrawablesRelative(drawable, null, null, null);
    }

    public void setIconPadding(int i) {
        this.S.setCompoundDrawablePadding(i);
    }

    public void setIconSize(int i) {
        this.O = i;
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.V = colorStateList;
        this.W = colorStateList != null;
        j jVar = this.U;
        if (jVar != null) {
            setIcon(jVar.getIcon());
        }
    }

    public void setMaxLines(int i) {
        this.S.setMaxLines(i);
    }

    public void setNeedsEmptyIcon(boolean z) {
        this.P = z;
    }

    public void setTextAppearance(int i) {
        this.S.setTextAppearance(i);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.S.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.S.setText(charSequence);
    }
}
