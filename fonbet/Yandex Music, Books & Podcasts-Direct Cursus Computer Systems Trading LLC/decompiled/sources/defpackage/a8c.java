package defpackage;

import android.view.ViewGroup;
import android.widget.TextView;
import ru.yandex.music.R;

/* loaded from: classes6.dex */
public final class a8c extends hq2 {
    @Override // defpackage.hq2, defpackage.qon
    public final void j(opn opnVar, int i) {
        z7c z7cVar = (z7c) opnVar;
        super.j(z7cVar, i);
        z7cVar.e((x7c) this.d.get(i));
    }

    @Override // defpackage.qon
    public final opn m(ViewGroup viewGroup, int i) {
        z7c z7cVar = new z7c(viewGroup, R.layout.view_row_feedback_topic);
        z7cVar.w = (TextView) z7cVar.a;
        return z7cVar;
    }
}
