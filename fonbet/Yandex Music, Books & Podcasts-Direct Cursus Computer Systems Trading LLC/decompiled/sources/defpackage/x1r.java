package defpackage;

import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class x1r extends dpn {
    public boolean a = false;
    public final /* synthetic */ h3k b;

    public x1r(h3k h3kVar) {
        this.b = h3kVar;
    }

    @Override // defpackage.dpn
    public final void a(RecyclerView recyclerView, int i) {
        if (i == 0 && this.a) {
            this.a = false;
            this.b.i();
        }
    }

    @Override // defpackage.dpn
    public final void b(RecyclerView recyclerView, int i, int i2) {
        if (i == 0 && i2 == 0) {
            return;
        }
        this.a = true;
    }
}
