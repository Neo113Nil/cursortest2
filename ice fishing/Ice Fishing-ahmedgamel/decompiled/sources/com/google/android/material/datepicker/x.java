package com.google.android.material.datepicker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import com.IceFishing.LiveIceFishing.C5248R;
import java.util.Locale;
import t0.AbstractC5000P;
import t0.AbstractC5026v;

/* loaded from: classes2.dex */
public final class x extends AbstractC5026v {

    /* renamed from: c, reason: collision with root package name */
    public final j f36787c;

    public x(j jVar) {
        this.f36787c = jVar;
    }

    @Override // t0.AbstractC5026v
    public final int a() {
        return this.f36787c.f36732w0.f36708y;
    }

    @Override // t0.AbstractC5026v
    public final void c(AbstractC5000P abstractC5000P, int i) {
        j jVar = this.f36787c;
        int i4 = jVar.f36732w0.f36703n.f36767v + i;
        String format = String.format(Locale.getDefault(), "%d", Integer.valueOf(i4));
        TextView textView = ((w) abstractC5000P).f36786t;
        textView.setText(format);
        Context context = textView.getContext();
        textView.setContentDescription(v.b().get(1) == i4 ? String.format(context.getString(C5248R.string.mtrl_picker_navigate_to_current_year_description), Integer.valueOf(i4)) : String.format(context.getString(C5248R.string.mtrl_picker_navigate_to_year_description), Integer.valueOf(i4)));
        c cVar = jVar.f36735z0;
        if (v.b().get(1) == i4) {
            G3.e eVar = cVar.f36711b;
        } else {
            G3.e eVar2 = cVar.f36710a;
        }
        throw null;
    }

    @Override // t0.AbstractC5026v
    public final AbstractC5000P d(ViewGroup viewGroup) {
        return new w((TextView) LayoutInflater.from(viewGroup.getContext()).inflate(C5248R.layout.mtrl_calendar_year, viewGroup, false));
    }
}
