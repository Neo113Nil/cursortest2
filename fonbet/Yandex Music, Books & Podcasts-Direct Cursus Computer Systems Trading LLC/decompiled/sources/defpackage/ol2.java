package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import java.util.List;
import ru.yandex.music.R;

/* loaded from: classes4.dex */
public final class ol2 extends qon implements Filterable {
    public final g0c d;
    public final il2 e;
    public volatile List f;
    public List g;
    public int h;
    public boolean i;
    public r9n j;
    public Object k;
    public boolean l;

    public ol2(g0c g0cVar) {
        g0cVar.getClass();
        this.d = g0cVar;
        this.e = new il2(this);
        c5b c5bVar = c5b.a;
        this.f = c5bVar;
        this.g = c5bVar;
        this.k = af0.J;
        this.l = true;
    }

    @Override // defpackage.qon
    public final int c() {
        int size = this.g.size() + (this.i ? 1 : 0);
        if (size == 0) {
            return 1;
        }
        return size;
    }

    @Override // defpackage.qon
    public final long d(int i) {
        switch (f(i)) {
            case 11:
                return ((hl2) this.g.get(i)).b.hashCode();
            case 12:
                return 2L;
            case 13:
                return 1L;
            default:
                wvs.p("Wrong item type");
                return 0L;
        }
    }

    @Override // defpackage.qon
    public final int f(int i) {
        if (this.g.isEmpty()) {
            return 13;
        }
        return (this.i && i == this.g.size()) ? 12 : 11;
    }

    @Override // android.widget.Filterable
    public final Filter getFilter() {
        return this.e;
    }

    @Override // defpackage.qon
    public final void j(opn opnVar, int i) {
        ((ll2) opnVar).u(i);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.jvm.functions.Function2] */
    @Override // defpackage.qon
    public final opn m(ViewGroup viewGroup, int i) {
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        switch (i) {
            case 11:
                View inflate = from.inflate(R.layout.paymentsdk_item_bank_app, viewGroup, false);
                inflate.getClass();
                return new kl2(this, inflate, this.k);
            case 12:
                View inflate2 = from.inflate(R.layout.paymentsdk_item_bank_app, viewGroup, false);
                inflate2.getClass();
                return new nl2(inflate2, this.j);
            case 13:
                View inflate3 = from.inflate(R.layout.paymentsdk_item_no_bank, viewGroup, false);
                inflate3.getClass();
                return new ml2(inflate3);
            default:
                wvs.p("Wrong view type");
                return null;
        }
    }
}
