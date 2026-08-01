package com.google.android.material.datepicker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import com.lumenpath.harispro.hrnavigator.R;
import java.util.Locale;
import k0.C;
import k0.b0;

/* loaded from: classes.dex */
public final class t extends C {

    /* renamed from: d, reason: collision with root package name */
    public final MaterialCalendar f2546d;

    public t(MaterialCalendar materialCalendar) {
        this.f2546d = materialCalendar;
    }

    @Override // k0.C
    public final int a() {
        return this.f2546d.f2467Y.f2508f;
    }

    @Override // k0.C
    public final void c(b0 b0Var, int i) {
        MaterialCalendar materialCalendar = this.f2546d;
        int i2 = materialCalendar.f2467Y.f2504a.f2530c + i;
        String format = String.format(Locale.getDefault(), "%d", Integer.valueOf(i2));
        TextView textView = ((s) b0Var).f2545u;
        textView.setText(format);
        Context context = textView.getContext();
        textView.setContentDescription(r.b().get(1) == i2 ? String.format(context.getString(R.string.mtrl_picker_navigate_to_current_year_description), Integer.valueOf(i2)) : String.format(context.getString(R.string.mtrl_picker_navigate_to_year_description), Integer.valueOf(i2)));
        c cVar = materialCalendar.f2470b0;
        if (r.b().get(1) == i2) {
            S0.e eVar = cVar.f2511b;
        } else {
            S0.e eVar2 = cVar.f2510a;
        }
        throw null;
    }

    @Override // k0.C
    public final b0 d(ViewGroup viewGroup) {
        return new s((TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_year, viewGroup, false));
    }
}
