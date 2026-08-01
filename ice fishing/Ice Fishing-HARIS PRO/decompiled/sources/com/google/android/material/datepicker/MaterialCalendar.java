package com.google.android.material.datepicker;

import O.K;
import android.R;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.GridView;
import android.widget.ListAdapter;
import android.widget.Scroller;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import java.util.ArrayList;
import k0.C0211z;
import k0.e0;

/* loaded from: classes.dex */
public final class MaterialCalendar<S> extends PickerFragment<S> {

    /* renamed from: X, reason: collision with root package name */
    public int f2466X;

    /* renamed from: Y, reason: collision with root package name */
    public b f2467Y;

    /* renamed from: Z, reason: collision with root package name */
    public k f2468Z;

    /* renamed from: a0, reason: collision with root package name */
    public int f2469a0;

    /* renamed from: b0, reason: collision with root package name */
    public c f2470b0;

    /* renamed from: c0, reason: collision with root package name */
    public RecyclerView f2471c0;

    /* renamed from: d0, reason: collision with root package name */
    public RecyclerView f2472d0;

    /* renamed from: e0, reason: collision with root package name */
    public View f2473e0;

    /* renamed from: f0, reason: collision with root package name */
    public View f2474f0;

    /* renamed from: g0, reason: collision with root package name */
    public View f2475g0;

    /* renamed from: h0, reason: collision with root package name */
    public View f2476h0;

    public final void M(k kVar) {
        o oVar = (o) this.f2472d0.getAdapter();
        int d2 = oVar.f2542d.f2504a.d(kVar);
        int d3 = d2 - oVar.f2542d.f2504a.d(this.f2468Z);
        boolean z2 = Math.abs(d3) > 3;
        boolean z3 = d3 > 0;
        this.f2468Z = kVar;
        if (z2 && z3) {
            this.f2472d0.f0(d2 - 3);
            this.f2472d0.post(new L.a(d2, 3, this));
        } else if (!z2) {
            this.f2472d0.post(new L.a(d2, 3, this));
        } else {
            this.f2472d0.f0(d2 + 3);
            this.f2472d0.post(new L.a(d2, 3, this));
        }
    }

    public final void N(int i) {
        this.f2469a0 = i;
        if (i == 2) {
            this.f2471c0.getLayoutManager().r0(this.f2468Z.f2530c - ((t) this.f2471c0.getAdapter()).f2546d.f2467Y.f2504a.f2530c);
            this.f2475g0.setVisibility(0);
            this.f2476h0.setVisibility(8);
            this.f2473e0.setVisibility(8);
            this.f2474f0.setVisibility(8);
            return;
        }
        if (i == 1) {
            this.f2475g0.setVisibility(8);
            this.f2476h0.setVisibility(0);
            this.f2473e0.setVisibility(0);
            this.f2474f0.setVisibility(0);
            M(this.f2468Z);
        }
    }

    @Override // Z.AbstractComponentCallbacksC0070s
    public final void t(Bundle bundle) {
        super.t(bundle);
        if (bundle == null) {
            bundle = this.f1603f;
        }
        this.f2466X = bundle.getInt("THEME_RES_ID_KEY");
        if (bundle.getParcelable("GRID_SELECTOR_KEY") != null) {
            throw new ClassCastException();
        }
        this.f2467Y = (b) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        if (bundle.getParcelable("DAY_VIEW_DECORATOR_KEY") != null) {
            throw new ClassCastException();
        }
        this.f2468Z = (k) bundle.getParcelable("CURRENT_MONTH_KEY");
    }

    @Override // Z.AbstractComponentCallbacksC0070s
    public final View u(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        int i2;
        C0211z c0211z;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(h(), this.f2466X);
        this.f2470b0 = new c(contextThemeWrapper);
        LayoutInflater cloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        k kVar = this.f2467Y.f2504a;
        if (MaterialDatePicker.T(contextThemeWrapper, R.attr.windowFullscreen)) {
            i = com.lumenpath.harispro.hrnavigator.R.layout.mtrl_calendar_vertical;
            i2 = 1;
        } else {
            i = com.lumenpath.harispro.hrnavigator.R.layout.mtrl_calendar_horizontal;
            i2 = 0;
        }
        View inflate = cloneInContext.inflate(i, viewGroup, false);
        Resources resources = H().getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(com.lumenpath.harispro.hrnavigator.R.dimen.mtrl_calendar_navigation_bottom_padding) + resources.getDimensionPixelOffset(com.lumenpath.harispro.hrnavigator.R.dimen.mtrl_calendar_navigation_top_padding) + resources.getDimensionPixelSize(com.lumenpath.harispro.hrnavigator.R.dimen.mtrl_calendar_navigation_height);
        int dimensionPixelSize = resources.getDimensionPixelSize(com.lumenpath.harispro.hrnavigator.R.dimen.mtrl_calendar_days_of_week_height);
        int i3 = l.f2534d;
        inflate.setMinimumHeight(dimensionPixelOffset + dimensionPixelSize + (resources.getDimensionPixelOffset(com.lumenpath.harispro.hrnavigator.R.dimen.mtrl_calendar_month_vertical_padding) * (i3 - 1)) + (resources.getDimensionPixelSize(com.lumenpath.harispro.hrnavigator.R.dimen.mtrl_calendar_day_height) * i3) + resources.getDimensionPixelOffset(com.lumenpath.harispro.hrnavigator.R.dimen.mtrl_calendar_bottom_padding));
        GridView gridView = (GridView) inflate.findViewById(com.lumenpath.harispro.hrnavigator.R.id.mtrl_calendar_days_of_week);
        K.l(gridView, new R.e(1));
        int i4 = this.f2467Y.e;
        gridView.setAdapter((ListAdapter) (i4 > 0 ? new e(i4) : new e()));
        gridView.setNumColumns(kVar.f2531d);
        gridView.setEnabled(false);
        this.f2472d0 = (RecyclerView) inflate.findViewById(com.lumenpath.harispro.hrnavigator.R.id.mtrl_calendar_months);
        this.f2472d0.setLayoutManager(new g(this, i2, i2));
        this.f2472d0.setTag("MONTHS_VIEW_GROUP_TAG");
        o oVar = new o(contextThemeWrapper, this.f2467Y, new B.b(21, this));
        this.f2472d0.setAdapter(oVar);
        int integer = contextThemeWrapper.getResources().getInteger(com.lumenpath.harispro.hrnavigator.R.integer.mtrl_calendar_year_selector_span);
        RecyclerView recyclerView3 = (RecyclerView) inflate.findViewById(com.lumenpath.harispro.hrnavigator.R.id.mtrl_calendar_year_selector_frame);
        this.f2471c0 = recyclerView3;
        if (recyclerView3 != null) {
            recyclerView3.setHasFixedSize(true);
            this.f2471c0.setLayoutManager(new GridLayoutManager(integer));
            this.f2471c0.setAdapter(new t(this));
            this.f2471c0.i(new h(this));
        }
        if (inflate.findViewById(com.lumenpath.harispro.hrnavigator.R.id.month_navigation_fragment_toggle) != null) {
            MaterialButton materialButton = (MaterialButton) inflate.findViewById(com.lumenpath.harispro.hrnavigator.R.id.month_navigation_fragment_toggle);
            materialButton.setTag("SELECTOR_TOGGLE_TAG");
            K.l(materialButton, new B0.m(4, this));
            View findViewById = inflate.findViewById(com.lumenpath.harispro.hrnavigator.R.id.month_navigation_previous);
            this.f2473e0 = findViewById;
            findViewById.setTag("NAVIGATION_PREV_TAG");
            View findViewById2 = inflate.findViewById(com.lumenpath.harispro.hrnavigator.R.id.month_navigation_next);
            this.f2474f0 = findViewById2;
            findViewById2.setTag("NAVIGATION_NEXT_TAG");
            this.f2475g0 = inflate.findViewById(com.lumenpath.harispro.hrnavigator.R.id.mtrl_calendar_year_selector_frame);
            this.f2476h0 = inflate.findViewById(com.lumenpath.harispro.hrnavigator.R.id.mtrl_calendar_day_selector_frame);
            N(1);
            materialButton.setText(this.f2468Z.c());
            this.f2472d0.j(new i(this, oVar, materialButton));
            materialButton.setOnClickListener(new B0.l(2, this));
            this.f2474f0.setOnClickListener(new f(this, oVar, 1));
            this.f2473e0.setOnClickListener(new f(this, oVar, 0));
        }
        if (!MaterialDatePicker.T(contextThemeWrapper, R.attr.windowFullscreen) && (recyclerView2 = (c0211z = new C0211z()).f3628a) != (recyclerView = this.f2472d0)) {
            e0 e0Var = c0211z.f3629b;
            if (recyclerView2 != null) {
                ArrayList arrayList = recyclerView2.f2154i0;
                if (arrayList != null) {
                    arrayList.remove(e0Var);
                }
                c0211z.f3628a.setOnFlingListener(null);
            }
            c0211z.f3628a = recyclerView;
            if (recyclerView != null) {
                if (recyclerView.getOnFlingListener() != null) {
                    throw new IllegalStateException("An instance of OnFlingListener already set.");
                }
                c0211z.f3628a.j(e0Var);
                c0211z.f3628a.setOnFlingListener(c0211z);
                new Scroller(c0211z.f3628a.getContext(), new DecelerateInterpolator());
                c0211z.f();
            }
        }
        this.f2472d0.f0(oVar.f2542d.f2504a.d(this.f2468Z));
        K.l(this.f2472d0, new R.e(2));
        return inflate;
    }

    @Override // Z.AbstractComponentCallbacksC0070s
    public final void z(Bundle bundle) {
        bundle.putInt("THEME_RES_ID_KEY", this.f2466X);
        bundle.putParcelable("GRID_SELECTOR_KEY", null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f2467Y);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.f2468Z);
    }
}
