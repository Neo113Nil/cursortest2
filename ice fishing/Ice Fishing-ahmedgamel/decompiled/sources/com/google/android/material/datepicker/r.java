package com.google.android.material.datepicker;

import android.R;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.IceFishing.LiveIceFishing.C5248R;
import java.util.Calendar;
import t0.AbstractC5000P;
import t0.AbstractC5026v;
import t0.C4988D;

/* loaded from: classes2.dex */
public final class r extends AbstractC5026v {

    /* renamed from: c, reason: collision with root package name */
    public final b f36781c;

    /* renamed from: d, reason: collision with root package name */
    public final I0.j f36782d;

    /* renamed from: e, reason: collision with root package name */
    public final int f36783e;

    public r(ContextThemeWrapper contextThemeWrapper, b bVar, I0.j jVar) {
        n nVar = bVar.f36703n;
        n nVar2 = bVar.f36706w;
        if (nVar.f36765n.compareTo(nVar2.f36765n) > 0) {
            throw new IllegalArgumentException("firstPage cannot be after currentPage");
        }
        if (nVar2.f36765n.compareTo(bVar.f36704u.f36765n) > 0) {
            throw new IllegalArgumentException("currentPage cannot be after lastPage");
        }
        this.f36783e = (contextThemeWrapper.getResources().getDimensionPixelSize(C5248R.dimen.mtrl_calendar_day_height) * o.f36772d) + (l.G(contextThemeWrapper, R.attr.windowFullscreen) ? contextThemeWrapper.getResources().getDimensionPixelSize(C5248R.dimen.mtrl_calendar_day_height) : 0);
        this.f36781c = bVar;
        this.f36782d = jVar;
        if (this.f40829a.a()) {
            throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
        }
        this.f40830b = true;
    }

    @Override // t0.AbstractC5026v
    public final int a() {
        return this.f36781c.f36709z;
    }

    @Override // t0.AbstractC5026v
    public final long b(int i) {
        Calendar a9 = v.a(this.f36781c.f36703n.f36765n);
        a9.add(2, i);
        a9.set(5, 1);
        Calendar a10 = v.a(a9);
        a10.get(2);
        a10.get(1);
        a10.getMaximum(7);
        a10.getActualMaximum(5);
        a10.getTimeInMillis();
        return a10.getTimeInMillis();
    }

    @Override // t0.AbstractC5026v
    public final void c(AbstractC5000P abstractC5000P, int i) {
        q qVar = (q) abstractC5000P;
        b bVar = this.f36781c;
        Calendar a9 = v.a(bVar.f36703n.f36765n);
        a9.add(2, i);
        n nVar = new n(a9);
        qVar.f36779t.setText(nVar.c());
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) qVar.f36780u.findViewById(C5248R.id.month_grid);
        if (materialCalendarGridView.a() == null || !nVar.equals(materialCalendarGridView.a().f36774a)) {
            new o(nVar, bVar);
            throw null;
        }
        materialCalendarGridView.invalidate();
        materialCalendarGridView.a().getClass();
        throw null;
    }

    @Override // t0.AbstractC5026v
    public final AbstractC5000P d(ViewGroup viewGroup) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(viewGroup.getContext()).inflate(C5248R.layout.mtrl_calendar_month_labeled, viewGroup, false);
        if (!l.G(viewGroup.getContext(), R.attr.windowFullscreen)) {
            return new q(linearLayout, false);
        }
        linearLayout.setLayoutParams(new C4988D(-1, this.f36783e));
        return new q(linearLayout, true);
    }
}
