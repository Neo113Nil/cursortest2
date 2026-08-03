package m;

import android.widget.AbsListView;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class m0 implements AbsListView.OnScrollListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o0 f4387a;

    public m0(o0 o0Var) {
        this.f4387a = o0Var;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i10) {
        o0 o0Var = this.f4387a;
        k0 k0Var = o0Var.f4413t;
        r rVar = o0Var.B;
        if (i10 != 1 || rVar.getInputMethodMode() == 2 || rVar.getContentView() == null) {
            return;
        }
        o0Var.f4417x.removeCallbacks(k0Var);
        k0Var.run();
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i10, int i11, int i12) {
    }
}
