package com.google.android.material.internal;

import A8.b;
import F.j;
import F.q;
import G0.g;
import H.a;
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
import com.icefishing.icefishingbigwin.C5275R;
import java.util.WeakHashMap;
import l.o;
import l.z;
import m.C4713t0;
import y3.AbstractC5236d;

/* loaded from: classes2.dex */
public class NavigationMenuItemView extends AbstractC5236d implements z {

    /* renamed from: p0, reason: collision with root package name */
    public static final int[] f36025p0 = {R.attr.state_checked};

    /* renamed from: O, reason: collision with root package name */
    public int f36026O;

    /* renamed from: P, reason: collision with root package name */
    public boolean f36027P;

    /* renamed from: Q, reason: collision with root package name */
    public boolean f36028Q;

    /* renamed from: R, reason: collision with root package name */
    public final boolean f36029R;

    /* renamed from: S, reason: collision with root package name */
    public final CheckedTextView f36030S;

    /* renamed from: T, reason: collision with root package name */
    public FrameLayout f36031T;

    /* renamed from: U, reason: collision with root package name */
    public o f36032U;

    /* renamed from: V, reason: collision with root package name */
    public ColorStateList f36033V;

    /* renamed from: W, reason: collision with root package name */
    public boolean f36034W;

    /* renamed from: n0, reason: collision with root package name */
    public Drawable f36035n0;

    /* renamed from: o0, reason: collision with root package name */
    public final g f36036o0;

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f36029R = true;
        g gVar = new g(4, this);
        this.f36036o0 = gVar;
        setOrientation(0);
        LayoutInflater.from(context).inflate(C5275R.layout.design_navigation_menu_item, (ViewGroup) this, true);
        setIconSize(context.getResources().getDimensionPixelSize(C5275R.dimen.design_navigation_icon_size));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(C5275R.id.design_menu_item_text);
        this.f36030S = checkedTextView;
        checkedTextView.setDuplicateParentStateEnabled(true);
        X.o(checkedTextView, gVar);
    }

    private void setActionView(View view) {
        if (view != null) {
            if (this.f36031T == null) {
                this.f36031T = (FrameLayout) ((ViewStub) findViewById(C5275R.id.design_menu_item_action_area_stub)).inflate();
            }
            if (view.getParent() != null) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            this.f36031T.removeAllViews();
            this.f36031T.addView(view);
        }
    }

    @Override // l.z
    public final void b(o oVar) {
        StateListDrawable stateListDrawable;
        this.f36032U = oVar;
        int i = oVar.f38851n;
        if (i > 0) {
            setId(i);
        }
        setVisibility(oVar.isVisible() ? 0 : 8);
        if (getBackground() == null) {
            TypedValue typedValue = new TypedValue();
            if (getContext().getTheme().resolveAttribute(C5275R.attr.colorControlHighlight, typedValue, true)) {
                stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(f36025p0, new ColorDrawable(typedValue.data));
                stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
            } else {
                stateListDrawable = null;
            }
            WeakHashMap weakHashMap = X.f2054a;
            setBackground(stateListDrawable);
        }
        setCheckable(oVar.isCheckable());
        setChecked(oVar.isChecked());
        setEnabled(oVar.isEnabled());
        setTitle(oVar.f38855x);
        setIcon(oVar.getIcon());
        setActionView(oVar.getActionView());
        setContentDescription(oVar.J);
        b.t(this, oVar.f38839K);
        o oVar2 = this.f36032U;
        CharSequence charSequence = oVar2.f38855x;
        CheckedTextView checkedTextView = this.f36030S;
        if (charSequence == null && oVar2.getIcon() == null && this.f36032U.getActionView() != null) {
            checkedTextView.setVisibility(8);
            FrameLayout frameLayout = this.f36031T;
            if (frameLayout != null) {
                C4713t0 c4713t0 = (C4713t0) frameLayout.getLayoutParams();
                ((LinearLayout.LayoutParams) c4713t0).width = -1;
                this.f36031T.setLayoutParams(c4713t0);
                return;
            }
            return;
        }
        checkedTextView.setVisibility(0);
        FrameLayout frameLayout2 = this.f36031T;
        if (frameLayout2 != null) {
            C4713t0 c4713t02 = (C4713t0) frameLayout2.getLayoutParams();
            ((LinearLayout.LayoutParams) c4713t02).width = -2;
            this.f36031T.setLayoutParams(c4713t02);
        }
    }

    @Override // l.z
    public o getItemData() {
        return this.f36032U;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        o oVar = this.f36032U;
        if (oVar != null && oVar.isCheckable() && this.f36032U.isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f36025p0);
        }
        return onCreateDrawableState;
    }

    public void setCheckable(boolean z3) {
        refreshDrawableState();
        if (this.f36028Q != z3) {
            this.f36028Q = z3;
            this.f36036o0.h(this.f36030S, 2048);
        }
    }

    public void setChecked(boolean z3) {
        refreshDrawableState();
        CheckedTextView checkedTextView = this.f36030S;
        checkedTextView.setChecked(z3);
        checkedTextView.setTypeface(checkedTextView.getTypeface(), (z3 && this.f36029R) ? 1 : 0);
    }

    public void setHorizontalPadding(int i) {
        setPadding(i, getPaddingTop(), i, getPaddingBottom());
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            if (this.f36034W) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = drawable.mutate();
                a.h(drawable, this.f36033V);
            }
            int i = this.f36026O;
            drawable.setBounds(0, 0, i, i);
        } else if (this.f36027P) {
            if (this.f36035n0 == null) {
                Resources resources = getResources();
                Resources.Theme theme = getContext().getTheme();
                ThreadLocal threadLocal = q.f879a;
                Drawable a9 = j.a(resources, C5275R.drawable.navigation_empty_icon, theme);
                this.f36035n0 = a9;
                if (a9 != null) {
                    int i6 = this.f36026O;
                    a9.setBounds(0, 0, i6, i6);
                }
            }
            drawable = this.f36035n0;
        }
        this.f36030S.setCompoundDrawablesRelative(drawable, null, null, null);
    }

    public void setIconPadding(int i) {
        this.f36030S.setCompoundDrawablePadding(i);
    }

    public void setIconSize(int i) {
        this.f36026O = i;
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.f36033V = colorStateList;
        this.f36034W = colorStateList != null;
        o oVar = this.f36032U;
        if (oVar != null) {
            setIcon(oVar.getIcon());
        }
    }

    public void setMaxLines(int i) {
        this.f36030S.setMaxLines(i);
    }

    public void setNeedsEmptyIcon(boolean z3) {
        this.f36027P = z3;
    }

    public void setTextAppearance(int i) {
        this.f36030S.setTextAppearance(i);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.f36030S.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.f36030S.setText(charSequence);
    }
}
