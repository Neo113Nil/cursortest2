package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import ru.yandex.music.R;

/* loaded from: classes.dex */
public final class dbl extends qon {
    public final String[] d;
    public final float[] e;
    public int f;
    public final /* synthetic */ nbl g;

    public dbl(nbl nblVar, String[] strArr, float[] fArr) {
        this.g = nblVar;
        this.d = strArr;
        this.e = fArr;
    }

    @Override // defpackage.qon
    public final int c() {
        return this.d.length;
    }

    @Override // defpackage.qon
    public final void j(opn opnVar, int i) {
        hbl hblVar = (hbl) opnVar;
        View view = hblVar.v;
        View view2 = hblVar.a;
        String[] strArr = this.d;
        if (i < strArr.length) {
            hblVar.u.setText(strArr[i]);
        }
        if (i == this.f) {
            view2.setSelected(true);
            view.setVisibility(0);
        } else {
            view2.setSelected(false);
            view.setVisibility(4);
        }
        view2.setOnClickListener(new cbl(this, i, 0));
    }

    @Override // defpackage.qon
    public final opn m(ViewGroup viewGroup, int i) {
        return new hbl(LayoutInflater.from(this.g.getContext()).inflate(R.layout.exo_styled_sub_settings_list_item, viewGroup, false));
    }
}
