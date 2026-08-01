package com.google.android.material.datepicker;

import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.lumenpath.harispro.hrnavigator.R;
import java.util.Calendar;
import k0.C;
import k0.L;
import k0.b0;

/* loaded from: classes.dex */
public final class o extends C {

    /* renamed from: d, reason: collision with root package name */
    public final b f2542d;
    public final B.b e;

    /* renamed from: f, reason: collision with root package name */
    public final int f2543f;

    public o(ContextThemeWrapper contextThemeWrapper, b bVar, B.b bVar2) {
        k kVar = bVar.f2504a;
        k kVar2 = bVar.f2507d;
        if (kVar.f2528a.compareTo(kVar2.f2528a) > 0) {
            throw new IllegalArgumentException("firstPage cannot be after currentPage");
        }
        if (kVar2.f2528a.compareTo(bVar.f2505b.f2528a) > 0) {
            throw new IllegalArgumentException("currentPage cannot be after lastPage");
        }
        this.f2543f = (contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) * l.f2534d) + (MaterialDatePicker.T(contextThemeWrapper, android.R.attr.windowFullscreen) ? contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) : 0);
        this.f2542d = bVar;
        this.e = bVar2;
        if (this.f3370a.a()) {
            throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
        }
        this.f3371b = true;
    }

    @Override // k0.C
    public final int a() {
        return this.f2542d.f2509g;
    }

    @Override // k0.C
    public final long b(int i) {
        Calendar a2 = r.a(this.f2542d.f2504a.f2528a);
        a2.add(2, i);
        a2.set(5, 1);
        Calendar a3 = r.a(a2);
        a3.get(2);
        a3.get(1);
        a3.getMaximum(7);
        a3.getActualMaximum(5);
        a3.getTimeInMillis();
        return a3.getTimeInMillis();
    }

    @Override // k0.C
    public final void c(b0 b0Var, int i) {
        n nVar = (n) b0Var;
        b bVar = this.f2542d;
        Calendar a2 = r.a(bVar.f2504a.f2528a);
        a2.add(2, i);
        k kVar = new k(a2);
        nVar.f2540u.setText(kVar.c());
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) nVar.f2541v.findViewById(R.id.month_grid);
        if (materialCalendarGridView.a() == null || !kVar.equals(materialCalendarGridView.a().f2535a)) {
            new l(kVar, bVar);
            throw null;
        }
        materialCalendarGridView.invalidate();
        materialCalendarGridView.a().getClass();
        throw null;
    }

    @Override // k0.C
    public final b0 d(ViewGroup viewGroup) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_month_labeled, viewGroup, false);
        if (!MaterialDatePicker.T(viewGroup.getContext(), android.R.attr.windowFullscreen)) {
            return new n(linearLayout, false);
        }
        linearLayout.setLayoutParams(new L(-1, this.f2543f));
        return new n(linearLayout, true);
    }
}
