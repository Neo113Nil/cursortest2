package defpackage;

import androidx.appcompat.widget.SearchView;

/* loaded from: classes.dex */
public final class h8p implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ SearchView b;

    public /* synthetic */ h8p(SearchView searchView, int i) {
        this.a = i;
        this.b = searchView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.s();
                break;
            default:
                iw6 iw6Var = this.b.x0;
                if (iw6Var instanceof rqr) {
                    iw6Var.b(null);
                    break;
                }
                break;
        }
    }
}
