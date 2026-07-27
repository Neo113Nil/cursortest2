package m;

import androidx.appcompat.widget.Toolbar;

/* loaded from: classes.dex */
public final /* synthetic */ class Q0 implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f39057n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Toolbar f39058u;

    public /* synthetic */ Q0(Toolbar toolbar, int i) {
        this.f39057n = i;
        this.f39058u = toolbar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f39057n) {
            case 0:
                S0 s02 = this.f39058u.f4620v0;
                l.o oVar = s02 == null ? null : s02.f39060u;
                if (oVar != null) {
                    oVar.collapseActionView();
                    break;
                }
                break;
            default:
                this.f39058u.n();
                break;
        }
    }
}
