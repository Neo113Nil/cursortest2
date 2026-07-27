package com.google.android.material.datepicker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import com.icefishing.icefishingliveapp.C5284R;
import java.util.Locale;
import t0.AbstractC5032P;
import t0.AbstractC5059v;

/* loaded from: classes2.dex */
public final class y extends AbstractC5059v {

    /* renamed from: c, reason: collision with root package name */
    public final k f36184c;

    public y(k kVar) {
        this.f36184c = kVar;
    }

    @Override // t0.AbstractC5059v
    public final int a() {
        return this.f36184c.f36124B0.f36103y;
    }

    @Override // t0.AbstractC5059v
    public final void c(AbstractC5032P abstractC5032P, int i) {
        k kVar = this.f36184c;
        int i4 = kVar.f36124B0.f36098n.f36164v + i;
        String format = String.format(Locale.getDefault(), "%d", Integer.valueOf(i4));
        TextView textView = ((x) abstractC5032P).f36183t;
        textView.setText(format);
        Context context = textView.getContext();
        textView.setContentDescription(w.b().get(1) == i4 ? String.format(context.getString(C5284R.string.mtrl_picker_navigate_to_current_year_description), Integer.valueOf(i4)) : String.format(context.getString(C5284R.string.mtrl_picker_navigate_to_year_description), Integer.valueOf(i4)));
        c cVar = kVar.f36126E0;
        if (w.b().get(1) == i4) {
            L2.i iVar = cVar.f36106b;
        } else {
            L2.i iVar2 = cVar.f36105a;
        }
        throw null;
    }

    @Override // t0.AbstractC5059v
    public final AbstractC5032P d(ViewGroup viewGroup) {
        return new x((TextView) LayoutInflater.from(viewGroup.getContext()).inflate(C5284R.layout.mtrl_calendar_year, viewGroup, false));
    }
}
