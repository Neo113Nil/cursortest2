package m;

import androidx.appcompat.widget.Toolbar;

/* loaded from: classes.dex */
public final /* synthetic */ class Q0 implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f39125n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Toolbar f39126u;

    public /* synthetic */ Q0(Toolbar toolbar, int i) {
        this.f39125n = i;
        this.f39126u = toolbar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f39125n) {
            case 0:
                T0 t02 = this.f39126u.f4583q0;
                l.o oVar = t02 == null ? null : t02.f39129u;
                if (oVar != null) {
                    oVar.collapseActionView();
                    break;
                }
                break;
            default:
                this.f39126u.n();
                break;
        }
    }
}
