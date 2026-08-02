package defpackage;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

/* loaded from: classes.dex */
public abstract class qon {
    public final qj a = new qj();
    public boolean b = false;
    public final int c = 1;

    public int b(qon qonVar, opn opnVar, int i) {
        if (qonVar == this) {
            return i;
        }
        return -1;
    }

    public abstract int c();

    public long d(int i) {
        return -1L;
    }

    public int f(int i) {
        return 0;
    }

    public final void g() {
        this.a.b();
    }

    public final void h(int i) {
        this.a.d(i, 1, null);
    }

    public abstract void j(opn opnVar, int i);

    public void k(opn opnVar, int i, List list) {
        j(opnVar, i);
    }

    public abstract opn m(ViewGroup viewGroup, int i);

    public void r(ron ronVar) {
        this.a.registerObserver(ronVar);
    }

    public final void s(boolean z) {
        if (this.a.a()) {
            xq0.q("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
        } else {
            this.b = z;
        }
    }

    public void t(ron ronVar) {
        this.a.unregisterObserver(ronVar);
    }

    public void n(RecyclerView recyclerView) {
    }

    public void o(opn opnVar) {
    }

    public void p(opn opnVar) {
    }

    public void q(opn opnVar) {
    }
}
