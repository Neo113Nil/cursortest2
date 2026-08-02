package defpackage;

import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.google.android.material.datepicker.MaterialCalendarGridView;
import java.util.Calendar;
import ru.yandex.music.R;

/* loaded from: classes3.dex */
public final class vdi extends qon {
    public final cs3 d;
    public final mka e;
    public final int f;

    public vdi(ContextThemeWrapper contextThemeWrapper, cs3 cs3Var, mka mkaVar) {
        sdi sdiVar = cs3Var.a;
        sdi sdiVar2 = cs3Var.b;
        sdi sdiVar3 = cs3Var.d;
        if (sdiVar.a.compareTo(sdiVar3.a) > 0) {
            xq0.x("firstPage cannot be after currentPage");
            throw null;
        }
        if (sdiVar3.a.compareTo(sdiVar2.a) > 0) {
            xq0.x("currentPage cannot be after lastPage");
            throw null;
        }
        this.f = (contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) * tdi.d) + (hdh.A(contextThemeWrapper, android.R.attr.windowFullscreen) ? contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) : 0);
        this.d = cs3Var;
        this.e = mkaVar;
        s(true);
    }

    @Override // defpackage.qon
    public final int c() {
        return this.d.g;
    }

    @Override // defpackage.qon
    public final long d(int i) {
        Calendar a = fut.a(this.d.a.a);
        a.add(2, i);
        a.set(5, 1);
        Calendar a2 = fut.a(a);
        a2.get(2);
        a2.get(1);
        a2.getMaximum(7);
        a2.getActualMaximum(5);
        a2.getTimeInMillis();
        return a2.getTimeInMillis();
    }

    @Override // defpackage.qon
    public final void j(opn opnVar, int i) {
        udi udiVar = (udi) opnVar;
        cs3 cs3Var = this.d;
        Calendar a = fut.a(cs3Var.a.a);
        a.add(2, i);
        sdi sdiVar = new sdi(a);
        udiVar.u.setText(sdiVar.d());
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) udiVar.v.findViewById(R.id.month_grid);
        if (materialCalendarGridView.a() == null || !sdiVar.equals(materialCalendarGridView.a().a)) {
            new tdi(sdiVar, cs3Var);
            throw null;
        }
        materialCalendarGridView.invalidate();
        materialCalendarGridView.a().getClass();
        throw null;
    }

    @Override // defpackage.qon
    public final opn m(ViewGroup viewGroup, int i) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_month_labeled, viewGroup, false);
        if (!hdh.A(viewGroup.getContext(), android.R.attr.windowFullscreen)) {
            return new udi(linearLayout, false);
        }
        linearLayout.setLayoutParams(new zon(-1, this.f));
        return new udi(linearLayout, true);
    }
}
