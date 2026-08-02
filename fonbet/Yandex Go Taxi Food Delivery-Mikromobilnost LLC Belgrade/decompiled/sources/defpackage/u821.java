package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.x0;

/* loaded from: classes.dex */
public final class u821 extends RecyclerView.g {
    public final String a;
    public final opl b;
    public final urk c;

    public u821(String str, opl oplVar, urk urkVar) {
        this.a = str;
        this.b = oplVar;
        this.c = urkVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        View view;
        urk urkVar = this.c;
        int a = urkVar.a();
        x0 findViewHolderForLayoutPosition = recyclerView.findViewHolderForLayoutPosition(a);
        this.b.b.put(this.a, new zrs(a, (findViewHolderForLayoutPosition == null || (view = findViewHolderForLayoutPosition.a) == null) ? 0 : urkVar.t(view)));
    }
}
