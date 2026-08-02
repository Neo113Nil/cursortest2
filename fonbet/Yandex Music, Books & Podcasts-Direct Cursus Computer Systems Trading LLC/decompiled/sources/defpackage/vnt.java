package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes3.dex */
public final class vnt extends dpn {
    public final String a;
    public final b1a b;
    public final yon c;

    /* JADX WARN: Multi-variable type inference failed */
    public vnt(String str, b1a b1aVar, y09 y09Var) {
        this.a = str;
        this.b = b1aVar;
        this.c = (yon) y09Var;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [y09, yon] */
    @Override // defpackage.dpn
    public final void b(RecyclerView recyclerView, int i, int i2) {
        View view;
        ?? r3 = this.c;
        int o = r3.o();
        int i3 = 0;
        opn T = recyclerView.T(o, false);
        if (T != null && (view = T.a) != null) {
            i3 = r3.d(view);
        }
        this.b.b.put(this.a, new b1d(o, i3));
    }
}
