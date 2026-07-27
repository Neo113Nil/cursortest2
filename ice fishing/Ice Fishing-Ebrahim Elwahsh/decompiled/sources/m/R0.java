package m;

import androidx.appcompat.widget.Toolbar;

/* loaded from: classes.dex */
public final /* synthetic */ class R0 implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f39328n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Toolbar f39329u;

    public /* synthetic */ R0(Toolbar toolbar, int i) {
        this.f39328n = i;
        this.f39329u = toolbar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f39328n) {
            case 0:
                T0 t02 = this.f39329u.f4735v0;
                l.n nVar = t02 == null ? null : t02.f39331u;
                if (nVar != null) {
                    nVar.collapseActionView();
                    break;
                }
                break;
            default:
                this.f39329u.n();
                break;
        }
    }
}
