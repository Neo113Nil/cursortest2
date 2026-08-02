package defpackage;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import ru.yandex.music.R;

/* loaded from: classes5.dex */
public final class ikq extends qon {
    public final l3l d;

    public ikq(l3l l3lVar) {
        this.d = l3lVar;
        s(true);
    }

    @Override // defpackage.qon
    public final int c() {
        return 1;
    }

    @Override // defpackage.qon
    public final long d(int i) {
        return 0L;
    }

    @Override // defpackage.qon
    public final void j(opn opnVar, int i) {
        this.d.getClass();
    }

    @Override // defpackage.qon
    public final opn m(ViewGroup viewGroup, int i) {
        this.d.getClass();
        return new t0f(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.view_feedback_topics_title, viewGroup, false));
    }
}
