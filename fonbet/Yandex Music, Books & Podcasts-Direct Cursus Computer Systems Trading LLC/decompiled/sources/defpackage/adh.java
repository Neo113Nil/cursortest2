package defpackage;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.GridView;
import android.widget.ListAdapter;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;

/* loaded from: classes3.dex */
public final class adh<S> extends fsk {
    public int h;
    public cs3 i;
    public sdi j;
    public int k;
    public pt0 l;
    public RecyclerView m;
    public RecyclerView n;
    public View o;
    public View p;
    public View q;
    public View r;
    public MaterialButton s;
    public AccessibilityManager t;

    @Override // androidx.fragment.app.o
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.h = bundle.getInt("THEME_RES_ID_KEY");
        this.i = (cs3) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.j = (sdi) bundle.getParcelable("CURRENT_MONTH_KEY");
    }

    @Override // androidx.fragment.app.o
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        int i2;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(getContext(), this.h);
        this.l = new pt0(contextThemeWrapper, 10);
        LayoutInflater cloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        this.t = (AccessibilityManager) requireContext().getSystemService("accessibility");
        sdi sdiVar = this.i.a;
        int i3 = 0;
        int i4 = 1;
        if (hdh.A(contextThemeWrapper, R.attr.windowFullscreen)) {
            i = ru.yandex.music.R.layout.mtrl_calendar_vertical;
            i2 = 1;
        } else {
            i = ru.yandex.music.R.layout.mtrl_calendar_horizontal;
            i2 = 0;
        }
        View inflate = cloneInContext.inflate(i, viewGroup, false);
        Resources resources = requireContext().getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(ru.yandex.music.R.dimen.mtrl_calendar_navigation_bottom_padding) + resources.getDimensionPixelOffset(ru.yandex.music.R.dimen.mtrl_calendar_navigation_top_padding) + resources.getDimensionPixelSize(ru.yandex.music.R.dimen.mtrl_calendar_navigation_height);
        int dimensionPixelSize = resources.getDimensionPixelSize(ru.yandex.music.R.dimen.mtrl_calendar_days_of_week_height);
        int i5 = tdi.d;
        inflate.setMinimumHeight(dimensionPixelOffset + dimensionPixelSize + (resources.getDimensionPixelOffset(ru.yandex.music.R.dimen.mtrl_calendar_month_vertical_padding) * (i5 - 1)) + (resources.getDimensionPixelSize(ru.yandex.music.R.dimen.mtrl_calendar_day_height) * i5) + resources.getDimensionPixelOffset(ru.yandex.music.R.dimen.mtrl_calendar_bottom_padding));
        GridView gridView = (GridView) inflate.findViewById(ru.yandex.music.R.id.mtrl_calendar_days_of_week);
        wdu.q(gridView, new eb(i4));
        int i6 = this.i.e;
        gridView.setAdapter((ListAdapter) (i6 > 0 ? new yd7(i6) : new yd7()));
        gridView.setNumColumns(sdiVar.d);
        gridView.setEnabled(false);
        this.n = (RecyclerView) inflate.findViewById(ru.yandex.music.R.id.mtrl_calendar_months);
        this.n.setLayoutManager(new xch(this, getContext(), i2, i2));
        this.n.setTag("MONTHS_VIEW_GROUP_TAG");
        vdi vdiVar = new vdi(contextThemeWrapper, this.i, new mka(this));
        this.n.setAdapter(vdiVar);
        int integer = contextThemeWrapper.getResources().getInteger(ru.yandex.music.R.integer.mtrl_calendar_year_selector_span);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(ru.yandex.music.R.id.mtrl_calendar_year_selector_frame);
        this.m = recyclerView;
        if (recyclerView != null) {
            recyclerView.setHasFixedSize(true);
            this.m.setLayoutManager(new GridLayoutManager((Context) contextThemeWrapper, integer, 1, false));
            this.m.setAdapter(new mbw(this));
            this.m.s(new ych(this));
        }
        View findViewById = inflate.findViewById(ru.yandex.music.R.id.month_navigation_fragment_toggle);
        cs3 cs3Var = vdiVar.d;
        if (findViewById != null) {
            MaterialButton materialButton = (MaterialButton) inflate.findViewById(ru.yandex.music.R.id.month_navigation_fragment_toggle);
            this.s = materialButton;
            materialButton.setTag("SELECTOR_TOGGLE_TAG");
            wdu.q(this.s, new fu2(7, this));
            View findViewById2 = inflate.findViewById(ru.yandex.music.R.id.month_navigation_previous);
            this.o = findViewById2;
            findViewById2.setTag("NAVIGATION_PREV_TAG");
            View findViewById3 = inflate.findViewById(ru.yandex.music.R.id.month_navigation_next);
            this.p = findViewById3;
            findViewById3.setTag("NAVIGATION_NEXT_TAG");
            this.q = inflate.findViewById(ru.yandex.music.R.id.mtrl_calendar_year_selector_frame);
            this.r = inflate.findViewById(ru.yandex.music.R.id.mtrl_calendar_day_selector_frame);
            y(1);
            this.s.setText(this.j.d());
            this.n.t(new zch(this, vdiVar));
            this.s.setOnClickListener(new je(5, this));
            this.p.setOnClickListener(new wch(this, vdiVar, i4));
            this.o.setOnClickListener(new wch(this, vdiVar, i3));
            z(cs3Var.a.e(this.j));
        }
        if (!hdh.A(contextThemeWrapper, R.attr.windowFullscreen)) {
            new h3k().a(this.n);
        }
        this.n.z0(cs3Var.a.e(this.j));
        wdu.q(this.n, new eb(2));
        return inflate;
    }

    @Override // androidx.fragment.app.o
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("THEME_RES_ID_KEY", this.h);
        bundle.putParcelable("GRID_SELECTOR_KEY", null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.i);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.j);
    }

    public final void x(sdi sdiVar) {
        vdi vdiVar = (vdi) this.n.getAdapter();
        int e = vdiVar.d.a.e(sdiVar);
        AccessibilityManager accessibilityManager = this.t;
        if (accessibilityManager == null || !accessibilityManager.isEnabled()) {
            int e2 = e - vdiVar.d.a.e(this.j);
            boolean z = Math.abs(e2) > 3;
            boolean z2 = e2 > 0;
            this.j = sdiVar;
            if (z && z2) {
                this.n.z0(e - 3);
                this.n.post(new zs3(this, e, 3));
            } else {
                RecyclerView recyclerView = this.n;
                if (z) {
                    recyclerView.z0(e + 3);
                    this.n.post(new zs3(this, e, 3));
                } else {
                    recyclerView.post(new zs3(this, e, 3));
                }
            }
        } else {
            this.j = sdiVar;
            this.n.z0(e);
        }
        z(e);
    }

    public final void y(int i) {
        this.k = i;
        if (i == 2) {
            this.m.getLayoutManager().T0(this.j.c - ((mbw) this.m.getAdapter()).d.i.a.c);
            this.q.setVisibility(0);
            this.r.setVisibility(8);
            this.o.setVisibility(8);
            this.p.setVisibility(8);
            return;
        }
        if (i == 1) {
            this.q.setVisibility(8);
            this.r.setVisibility(0);
            this.o.setVisibility(0);
            this.p.setVisibility(0);
            x(this.j);
        }
    }

    public final void z(int i) {
        this.p.setEnabled(i + 1 < this.n.getAdapter().c());
        this.o.setEnabled(i - 1 >= 0);
    }
}
