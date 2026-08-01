package com.google.android.material.datepicker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import com.icefishinggame.icefishinggamemultigames.C5275R;
import java.util.Locale;
import t0.AbstractC5003S;
import t0.AbstractC5027v;

/* loaded from: classes2.dex */
public final class x extends AbstractC5027v {

    /* renamed from: c, reason: collision with root package name */
    public final j f36019c;

    public x(j jVar) {
        this.f36019c = jVar;
    }

    @Override // t0.AbstractC5027v
    public final int a() {
        return this.f36019c.f35959B0.f35940y;
    }

    @Override // t0.AbstractC5027v
    public final void c(AbstractC5003S abstractC5003S, int i) {
        j jVar = this.f36019c;
        int i6 = jVar.f35959B0.f35935n.f35999v + i;
        String format = String.format(Locale.getDefault(), "%d", Integer.valueOf(i6));
        TextView textView = ((w) abstractC5003S).f36018t;
        textView.setText(format);
        Context context = textView.getContext();
        textView.setContentDescription(v.b().get(1) == i6 ? String.format(context.getString(C5275R.string.mtrl_picker_navigate_to_current_year_description), Integer.valueOf(i6)) : String.format(context.getString(C5275R.string.mtrl_picker_navigate_to_year_description), Integer.valueOf(i6)));
        c cVar = jVar.f35961E0;
        if (v.b().get(1) == i6) {
            M2.i iVar = cVar.f35943b;
        } else {
            M2.i iVar2 = cVar.f35942a;
        }
        throw null;
    }

    @Override // t0.AbstractC5027v
    public final AbstractC5003S d(ViewGroup viewGroup) {
        return new w((TextView) LayoutInflater.from(viewGroup.getContext()).inflate(C5275R.layout.mtrl_calendar_year, viewGroup, false));
    }
}
