package defpackage;

import android.widget.AbsListView;

/* loaded from: classes.dex */
public final class w9g implements AbsListView.OnScrollListener {
    public final /* synthetic */ y9g a;

    public w9g(y9g y9gVar) {
        this.a = y9gVar;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i) {
        y9g y9gVar = this.a;
        v9g v9gVar = y9gVar.r;
        or0 or0Var = y9gVar.z;
        if (i != 1 || or0Var.getInputMethodMode() == 2 || or0Var.getContentView() == null) {
            return;
        }
        y9gVar.v.removeCallbacks(v9gVar);
        v9gVar.run();
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
    }
}
