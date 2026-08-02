package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.Locale;
import ru.yandex.music.R;

/* loaded from: classes3.dex */
public final class mbw extends qon {
    public final adh d;

    public mbw(adh adhVar) {
        this.d = adhVar;
    }

    @Override // defpackage.qon
    public final int c() {
        return this.d.i.f;
    }

    @Override // defpackage.qon
    public final void j(opn opnVar, int i) {
        adh adhVar = this.d;
        int i2 = adhVar.i.a.c + i;
        TextView textView = ((lbw) opnVar).u;
        textView.setText(String.format(Locale.getDefault(), "%d", Integer.valueOf(i2)));
        Context context = textView.getContext();
        textView.setContentDescription(fut.b().get(1) == i2 ? String.format(context.getString(R.string.mtrl_picker_navigate_to_current_year_description), Integer.valueOf(i2)) : String.format(context.getString(R.string.mtrl_picker_navigate_to_year_description), Integer.valueOf(i2)));
        pt0 pt0Var = adhVar.l;
        if (fut.b().get(1) == i2) {
            Object obj = pt0Var.b;
        } else {
            Object obj2 = pt0Var.a;
        }
        throw null;
    }

    @Override // defpackage.qon
    public final opn m(ViewGroup viewGroup, int i) {
        return new lbw((TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_year, viewGroup, false));
    }
}
