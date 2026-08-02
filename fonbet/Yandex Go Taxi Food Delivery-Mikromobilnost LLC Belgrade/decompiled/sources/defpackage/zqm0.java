package defpackage;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes13.dex */
public final class zqm0 extends RecyclerView.d {
    public final int a;
    public final int b;

    public zqm0(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.d
    public final void c(Rect rect, View view, RecyclerView recyclerView, RecyclerView.k kVar) {
        if (jl40.l(view.getTag(), qoi0.a(uqm0.class))) {
            rect.top = this.b;
        } else if (jl40.l(view.getTag(), qoi0.a(vqm0.class)) && recyclerView.getChildAdapterPosition(view) == 0) {
            rect.top = this.a;
        } else {
            super.c(rect, view, recyclerView, kVar);
        }
    }
}
