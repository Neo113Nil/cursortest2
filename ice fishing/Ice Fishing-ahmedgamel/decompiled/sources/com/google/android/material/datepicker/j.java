package com.google.android.material.datepicker;

import O.X;
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
import com.IceFishing.LiveIceFishing.C5248R;
import com.google.android.material.button.MaterialButton;
import java.util.ArrayList;
import t0.C5002S;
import t0.C5025u;

/* loaded from: classes2.dex */
public final class j<S> extends s {

    /* renamed from: A0, reason: collision with root package name */
    public RecyclerView f36726A0;

    /* renamed from: B0, reason: collision with root package name */
    public RecyclerView f36727B0;
    public View C0;

    /* renamed from: D0, reason: collision with root package name */
    public View f36728D0;

    /* renamed from: E0, reason: collision with root package name */
    public View f36729E0;

    /* renamed from: F0, reason: collision with root package name */
    public View f36730F0;

    /* renamed from: v0, reason: collision with root package name */
    public int f36731v0;

    /* renamed from: w0, reason: collision with root package name */
    public b f36732w0;

    /* renamed from: x0, reason: collision with root package name */
    public n f36733x0;

    /* renamed from: y0, reason: collision with root package name */
    public int f36734y0;

    /* renamed from: z0, reason: collision with root package name */
    public c f36735z0;

    public final void C(n nVar) {
        r rVar = (r) this.f36727B0.getAdapter();
        int d9 = rVar.f36781c.f36703n.d(nVar);
        int d10 = d9 - rVar.f36781c.f36703n.d(this.f36733x0);
        boolean z6 = Math.abs(d10) > 3;
        boolean z9 = d10 > 0;
        this.f36733x0 = nVar;
        if (z6 && z9) {
            this.f36727B0.Y(d9 - 3);
            this.f36727B0.post(new L.a(this, d9, 12));
        } else if (!z6) {
            this.f36727B0.post(new L.a(this, d9, 12));
        } else {
            this.f36727B0.Y(d9 + 3);
            this.f36727B0.post(new L.a(this, d9, 12));
        }
    }

    public final void D(int i) {
        this.f36734y0 = i;
        if (i == 2) {
            this.f36726A0.getLayoutManager().n0(this.f36733x0.f36767v - ((x) this.f36726A0.getAdapter()).f36787c.f36732w0.f36703n.f36767v);
            this.f36729E0.setVisibility(0);
            this.f36730F0.setVisibility(8);
            this.C0.setVisibility(8);
            this.f36728D0.setVisibility(8);
            return;
        }
        if (i == 1) {
            this.f36729E0.setVisibility(8);
            this.f36730F0.setVisibility(0);
            this.C0.setVisibility(0);
            this.f36728D0.setVisibility(0);
            C(this.f36733x0);
        }
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0479s
    public final void o(Bundle bundle) {
        super.o(bundle);
        if (bundle == null) {
            bundle = this.f5035y;
        }
        this.f36731v0 = bundle.getInt("THEME_RES_ID_KEY");
        if (bundle.getParcelable("GRID_SELECTOR_KEY") != null) {
            throw new ClassCastException();
        }
        this.f36732w0 = (b) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        if (bundle.getParcelable("DAY_VIEW_DECORATOR_KEY") != null) {
            throw new ClassCastException();
        }
        this.f36733x0 = (n) bundle.getParcelable("CURRENT_MONTH_KEY");
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0479s
    public final View p(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        int i;
        int i4;
        C5025u c5025u;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(d(), this.f36731v0);
        this.f36735z0 = new c(contextThemeWrapper);
        LayoutInflater cloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        n nVar = this.f36732w0.f36703n;
        if (l.G(contextThemeWrapper, R.attr.windowFullscreen)) {
            i = C5248R.layout.mtrl_calendar_vertical;
            i4 = 1;
        } else {
            i = C5248R.layout.mtrl_calendar_horizontal;
            i4 = 0;
        }
        View inflate = cloneInContext.inflate(i, viewGroup, false);
        Resources resources = y().getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(C5248R.dimen.mtrl_calendar_navigation_bottom_padding) + resources.getDimensionPixelOffset(C5248R.dimen.mtrl_calendar_navigation_top_padding) + resources.getDimensionPixelSize(C5248R.dimen.mtrl_calendar_navigation_height);
        int dimensionPixelSize = resources.getDimensionPixelSize(C5248R.dimen.mtrl_calendar_days_of_week_height);
        int i6 = o.f36772d;
        inflate.setMinimumHeight(dimensionPixelOffset + dimensionPixelSize + (resources.getDimensionPixelOffset(C5248R.dimen.mtrl_calendar_month_vertical_padding) * (i6 - 1)) + (resources.getDimensionPixelSize(C5248R.dimen.mtrl_calendar_day_height) * i6) + resources.getDimensionPixelOffset(C5248R.dimen.mtrl_calendar_bottom_padding));
        GridView gridView = (GridView) inflate.findViewById(C5248R.id.mtrl_calendar_days_of_week);
        X.o(gridView, new U.h(2));
        int i9 = this.f36732w0.f36707x;
        gridView.setAdapter((ListAdapter) (i9 > 0 ? new e(i9) : new e()));
        gridView.setNumColumns(nVar.f36768w);
        gridView.setEnabled(false);
        this.f36727B0 = (RecyclerView) inflate.findViewById(C5248R.id.mtrl_calendar_months);
        this.f36727B0.setLayoutManager(new g(this, i4, i4));
        this.f36727B0.setTag("MONTHS_VIEW_GROUP_TAG");
        r rVar = new r(contextThemeWrapper, this.f36732w0, new I0.j(23, this));
        this.f36727B0.setAdapter(rVar);
        int integer = contextThemeWrapper.getResources().getInteger(C5248R.integer.mtrl_calendar_year_selector_span);
        RecyclerView recyclerView3 = (RecyclerView) inflate.findViewById(C5248R.id.mtrl_calendar_year_selector_frame);
        this.f36726A0 = recyclerView3;
        if (recyclerView3 != null) {
            recyclerView3.setHasFixedSize(true);
            this.f36726A0.setLayoutManager(new GridLayoutManager(integer));
            this.f36726A0.setAdapter(new x(this));
            this.f36726A0.g(new h(this));
        }
        if (inflate.findViewById(C5248R.id.month_navigation_fragment_toggle) != null) {
            MaterialButton materialButton = (MaterialButton) inflate.findViewById(C5248R.id.month_navigation_fragment_toggle);
            materialButton.setTag("SELECTOR_TOGGLE_TAG");
            X.o(materialButton, new A3.a(3, this));
            View findViewById = inflate.findViewById(C5248R.id.month_navigation_previous);
            this.C0 = findViewById;
            findViewById.setTag("NAVIGATION_PREV_TAG");
            View findViewById2 = inflate.findViewById(C5248R.id.month_navigation_next);
            this.f36728D0 = findViewById2;
            findViewById2.setTag("NAVIGATION_NEXT_TAG");
            this.f36729E0 = inflate.findViewById(C5248R.id.mtrl_calendar_year_selector_frame);
            this.f36730F0 = inflate.findViewById(C5248R.id.mtrl_calendar_day_selector_frame);
            D(1);
            materialButton.setText(this.f36733x0.c());
            this.f36727B0.h(new i(this, rVar, materialButton));
            materialButton.setOnClickListener(new N3.n(8, this));
            this.f36728D0.setOnClickListener(new f(this, rVar, 1));
            this.C0.setOnClickListener(new f(this, rVar, 0));
        }
        if (!l.G(contextThemeWrapper, R.attr.windowFullscreen) && (recyclerView2 = (c5025u = new C5025u()).f40825a) != (recyclerView = this.f36727B0)) {
            C5002S c5002s = c5025u.f40826b;
            if (recyclerView2 != null) {
                ArrayList arrayList = recyclerView2.f5188F0;
                if (arrayList != null) {
                    arrayList.remove(c5002s);
                }
                c5025u.f40825a.setOnFlingListener(null);
            }
            c5025u.f40825a = recyclerView;
            if (recyclerView != null) {
                if (recyclerView.getOnFlingListener() != null) {
                    throw new IllegalStateException("An instance of OnFlingListener already set.");
                }
                c5025u.f40825a.h(c5002s);
                c5025u.f40825a.setOnFlingListener(c5025u);
                new Scroller(c5025u.f40825a.getContext(), new DecelerateInterpolator());
                c5025u.f();
            }
        }
        this.f36727B0.Y(rVar.f36781c.f36703n.d(this.f36733x0));
        X.o(this.f36727B0, new U.h(3));
        return inflate;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0479s
    public final void t(Bundle bundle) {
        bundle.putInt("THEME_RES_ID_KEY", this.f36731v0);
        bundle.putParcelable("GRID_SELECTOR_KEY", null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f36732w0);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.f36733x0);
    }
}
