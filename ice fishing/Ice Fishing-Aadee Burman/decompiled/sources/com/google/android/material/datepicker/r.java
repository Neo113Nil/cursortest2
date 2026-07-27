package com.google.android.material.datepicker;

import android.R;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.icefishing.icefishinglive2.C5275R;
import java.util.Calendar;
import t0.AbstractC5003S;
import t0.AbstractC5027v;
import t0.C4991F;

/* loaded from: classes2.dex */
public final class r extends AbstractC5027v {

    /* renamed from: c, reason: collision with root package name */
    public final b f36013c;

    /* renamed from: d, reason: collision with root package name */
    public final I0.j f36014d;

    /* renamed from: e, reason: collision with root package name */
    public final int f36015e;

    public r(ContextThemeWrapper contextThemeWrapper, b bVar, I0.j jVar) {
        n nVar = bVar.f35935n;
        n nVar2 = bVar.f35938w;
        if (nVar.f35997n.compareTo(nVar2.f35997n) > 0) {
            throw new IllegalArgumentException("firstPage cannot be after currentPage");
        }
        if (nVar2.f35997n.compareTo(bVar.f35936u.f35997n) > 0) {
            throw new IllegalArgumentException("currentPage cannot be after lastPage");
        }
        this.f36015e = (contextThemeWrapper.getResources().getDimensionPixelSize(C5275R.dimen.mtrl_calendar_day_height) * o.f36004d) + (l.G(contextThemeWrapper, R.attr.windowFullscreen) ? contextThemeWrapper.getResources().getDimensionPixelSize(C5275R.dimen.mtrl_calendar_day_height) : 0);
        this.f36013c = bVar;
        this.f36014d = jVar;
        if (this.f40777a.a()) {
            throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
        }
        this.f40778b = true;
    }

    @Override // t0.AbstractC5027v
    public final int a() {
        return this.f36013c.f35941z;
    }

    @Override // t0.AbstractC5027v
    public final long b(int i) {
        Calendar a9 = v.a(this.f36013c.f35935n.f35997n);
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

    @Override // t0.AbstractC5027v
    public final void c(AbstractC5003S abstractC5003S, int i) {
        q qVar = (q) abstractC5003S;
        b bVar = this.f36013c;
        Calendar a9 = v.a(bVar.f35935n.f35997n);
        a9.add(2, i);
        n nVar = new n(a9);
        qVar.f36011t.setText(nVar.c());
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) qVar.f36012u.findViewById(C5275R.id.month_grid);
        if (materialCalendarGridView.a() == null || !nVar.equals(materialCalendarGridView.a().f36006a)) {
            new o(nVar, bVar);
            throw null;
        }
        materialCalendarGridView.invalidate();
        materialCalendarGridView.a().getClass();
        throw null;
    }

    @Override // t0.AbstractC5027v
    public final AbstractC5003S d(ViewGroup viewGroup) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(viewGroup.getContext()).inflate(C5275R.layout.mtrl_calendar_month_labeled, viewGroup, false);
        if (!l.G(viewGroup.getContext(), R.attr.windowFullscreen)) {
            return new q(linearLayout, false);
        }
        linearLayout.setLayoutParams(new C4991F(-1, this.f36015e));
        return new q(linearLayout, true);
    }
}
