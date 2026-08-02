package defpackage;

import android.graphics.Canvas;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.x0;

/* loaded from: classes6.dex */
public final class qox0 extends RecyclerView.d {
    public final wls a;
    public int b = -1;
    public boolean c;
    public mr31 w;
    public View x;

    public qox0(wls wlsVar) {
        this.a = wlsVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.d
    public final void d(Canvas canvas, RecyclerView recyclerView, RecyclerView.k kVar) {
        if (kVar.g) {
            return;
        }
        int i = this.b;
        View view = null;
        if (i != -1) {
            x0 findViewHolderForAdapterPosition = recyclerView.findViewHolderForAdapterPosition(i);
            sb5 sb5Var = findViewHolderForAdapterPosition instanceof sb5 ? (sb5) findViewHolderForAdapterPosition : null;
            if (sb5Var != null) {
                view = sb5Var.Z();
            }
        }
        if (this.x != view || this.c) {
            this.x = view;
            this.c = false;
            this.a.invoke(view, this.w);
        }
    }
}
