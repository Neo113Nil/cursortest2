package defpackage;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes3.dex */
public final class cgc extends won {
    public final rxi a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;

    public cgc(cc9 cc9Var, rxi rxiVar) {
        this.a = rxiVar;
        this.b = i(cc9Var.i);
        this.c = i(cc9Var.j);
        this.d = i(cc9Var.k);
        this.e = i(cc9Var.l);
    }

    @Override // defpackage.won
    public final void f(Rect rect, View view, RecyclerView recyclerView, kpn kpnVar) {
        rect.set(this.b, this.c, this.d, this.e);
    }

    public final int i(Integer num) {
        return num != null ? num.intValue() : eeh.b(this.a.t());
    }
}
