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
import com.google.android.material.button.MaterialButton;
import com.icefishingapp.icefishing.C5275R;
import java.util.ArrayList;
import t0.C5005U;
import t0.C5026u;

/* loaded from: classes2.dex */
public final class j<S> extends s {

    /* renamed from: A0, reason: collision with root package name */
    public int f35958A0;

    /* renamed from: B0, reason: collision with root package name */
    public b f35959B0;
    public n C0;

    /* renamed from: D0, reason: collision with root package name */
    public int f35960D0;

    /* renamed from: E0, reason: collision with root package name */
    public c f35961E0;

    /* renamed from: F0, reason: collision with root package name */
    public RecyclerView f35962F0;

    /* renamed from: G0, reason: collision with root package name */
    public RecyclerView f35963G0;

    /* renamed from: H0, reason: collision with root package name */
    public View f35964H0;

    /* renamed from: I0, reason: collision with root package name */
    public View f35965I0;

    /* renamed from: J0, reason: collision with root package name */
    public View f35966J0;

    /* renamed from: K0, reason: collision with root package name */
    public View f35967K0;

    public final void C(n nVar) {
        r rVar = (r) this.f35963G0.getAdapter();
        int d2 = rVar.f36013c.f35935n.d(nVar);
        int d9 = d2 - rVar.f36013c.f35935n.d(this.C0);
        boolean z3 = Math.abs(d9) > 3;
        boolean z6 = d9 > 0;
        this.C0 = nVar;
        if (z3 && z6) {
            this.f35963G0.Y(d2 - 3);
            this.f35963G0.post(new L.a(this, d2, 12));
        } else if (!z3) {
            this.f35963G0.post(new L.a(this, d2, 12));
        } else {
            this.f35963G0.Y(d2 + 3);
            this.f35963G0.post(new L.a(this, d2, 12));
        }
    }

    public final void D(int i) {
        this.f35960D0 = i;
        if (i == 2) {
            this.f35962F0.getLayoutManager().n0(this.C0.f35999v - ((x) this.f35962F0.getAdapter()).f36019c.f35959B0.f35935n.f35999v);
            this.f35966J0.setVisibility(0);
            this.f35967K0.setVisibility(8);
            this.f35964H0.setVisibility(8);
            this.f35965I0.setVisibility(8);
            return;
        }
        if (i == 1) {
            this.f35966J0.setVisibility(8);
            this.f35967K0.setVisibility(0);
            this.f35964H0.setVisibility(0);
            this.f35965I0.setVisibility(0);
            C(this.C0);
        }
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0475s
    public final void o(Bundle bundle) {
        super.o(bundle);
        if (bundle == null) {
            bundle = this.f5068y;
        }
        this.f35958A0 = bundle.getInt("THEME_RES_ID_KEY");
        if (bundle.getParcelable("GRID_SELECTOR_KEY") != null) {
            throw new ClassCastException();
        }
        this.f35959B0 = (b) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        if (bundle.getParcelable("DAY_VIEW_DECORATOR_KEY") != null) {
            throw new ClassCastException();
        }
        this.C0 = (n) bundle.getParcelable("CURRENT_MONTH_KEY");
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0475s
    public final View p(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        int i;
        int i6;
        C5026u c5026u;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(d(), this.f35958A0);
        this.f35961E0 = new c(contextThemeWrapper);
        LayoutInflater cloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        n nVar = this.f35959B0.f35935n;
        if (l.G(contextThemeWrapper, R.attr.windowFullscreen)) {
            i = C5275R.layout.mtrl_calendar_vertical;
            i6 = 1;
        } else {
            i = C5275R.layout.mtrl_calendar_horizontal;
            i6 = 0;
        }
        View inflate = cloneInContext.inflate(i, viewGroup, false);
        Resources resources = y().getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(C5275R.dimen.mtrl_calendar_navigation_bottom_padding) + resources.getDimensionPixelOffset(C5275R.dimen.mtrl_calendar_navigation_top_padding) + resources.getDimensionPixelSize(C5275R.dimen.mtrl_calendar_navigation_height);
        int dimensionPixelSize = resources.getDimensionPixelSize(C5275R.dimen.mtrl_calendar_days_of_week_height);
        int i9 = o.f36004d;
        inflate.setMinimumHeight(dimensionPixelOffset + dimensionPixelSize + (resources.getDimensionPixelOffset(C5275R.dimen.mtrl_calendar_month_vertical_padding) * (i9 - 1)) + (resources.getDimensionPixelSize(C5275R.dimen.mtrl_calendar_day_height) * i9) + resources.getDimensionPixelOffset(C5275R.dimen.mtrl_calendar_bottom_padding));
        GridView gridView = (GridView) inflate.findViewById(C5275R.id.mtrl_calendar_days_of_week);
        X.o(gridView, new U.h(2));
        int i10 = this.f35959B0.f35939x;
        gridView.setAdapter((ListAdapter) (i10 > 0 ? new e(i10) : new e()));
        gridView.setNumColumns(nVar.f36000w);
        gridView.setEnabled(false);
        this.f35963G0 = (RecyclerView) inflate.findViewById(C5275R.id.mtrl_calendar_months);
        this.f35963G0.setLayoutManager(new g(this, i6, i6));
        this.f35963G0.setTag("MONTHS_VIEW_GROUP_TAG");
        r rVar = new r(contextThemeWrapper, this.f35959B0, new I0.j(18, this));
        this.f35963G0.setAdapter(rVar);
        int integer = contextThemeWrapper.getResources().getInteger(C5275R.integer.mtrl_calendar_year_selector_span);
        RecyclerView recyclerView3 = (RecyclerView) inflate.findViewById(C5275R.id.mtrl_calendar_year_selector_frame);
        this.f35962F0 = recyclerView3;
        if (recyclerView3 != null) {
            recyclerView3.setHasFixedSize(true);
            this.f35962F0.setLayoutManager(new GridLayoutManager(integer));
            this.f35962F0.setAdapter(new x(this));
            this.f35962F0.g(new h(this));
        }
        if (inflate.findViewById(C5275R.id.month_navigation_fragment_toggle) != null) {
            MaterialButton materialButton = (MaterialButton) inflate.findViewById(C5275R.id.month_navigation_fragment_toggle);
            materialButton.setTag("SELECTOR_TOGGLE_TAG");
            X.o(materialButton, new G0.g(1, this));
            View findViewById = inflate.findViewById(C5275R.id.month_navigation_previous);
            this.f35964H0 = findViewById;
            findViewById.setTag("NAVIGATION_PREV_TAG");
            View findViewById2 = inflate.findViewById(C5275R.id.month_navigation_next);
            this.f35965I0 = findViewById2;
            findViewById2.setTag("NAVIGATION_NEXT_TAG");
            this.f35966J0 = inflate.findViewById(C5275R.id.mtrl_calendar_year_selector_frame);
            this.f35967K0 = inflate.findViewById(C5275R.id.mtrl_calendar_day_selector_frame);
            D(1);
            materialButton.setText(this.C0.c());
            this.f35963G0.h(new i(this, rVar, materialButton));
            int i11 = 1;
            materialButton.setOnClickListener(new L3.q(i11, this));
            this.f35965I0.setOnClickListener(new f(this, rVar, i11));
            this.f35964H0.setOnClickListener(new f(this, rVar, 0));
        }
        if (!l.G(contextThemeWrapper, R.attr.windowFullscreen) && (recyclerView2 = (c5026u = new C5026u()).f40776a) != (recyclerView = this.f35963G0)) {
            C5005U c5005u = c5026u.f40777b;
            if (recyclerView2 != null) {
                ArrayList arrayList = recyclerView2.f5230K0;
                if (arrayList != null) {
                    arrayList.remove(c5005u);
                }
                c5026u.f40776a.setOnFlingListener(null);
            }
            c5026u.f40776a = recyclerView;
            if (recyclerView != null) {
                if (recyclerView.getOnFlingListener() != null) {
                    throw new IllegalStateException("An instance of OnFlingListener already set.");
                }
                c5026u.f40776a.h(c5005u);
                c5026u.f40776a.setOnFlingListener(c5026u);
                new Scroller(c5026u.f40776a.getContext(), new DecelerateInterpolator());
                c5026u.f();
            }
        }
        this.f35963G0.Y(rVar.f36013c.f35935n.d(this.C0));
        X.o(this.f35963G0, new U.h(3));
        return inflate;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0475s
    public final void t(Bundle bundle) {
        bundle.putInt("THEME_RES_ID_KEY", this.f35958A0);
        bundle.putParcelable("GRID_SELECTOR_KEY", null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f35959B0);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.C0);
    }
}
