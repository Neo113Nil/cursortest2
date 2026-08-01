package m;

import androidx.appcompat.widget.Toolbar;

/* loaded from: classes.dex */
public final /* synthetic */ class U0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3888a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Toolbar f3889b;

    public /* synthetic */ U0(Toolbar toolbar, int i) {
        this.f3888a = i;
        this.f3889b = toolbar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3888a) {
            case 0:
                X0 x02 = this.f3889b.f1856L;
                l.o oVar = x02 == null ? null : x02.f3902b;
                if (oVar != null) {
                    oVar.collapseActionView();
                    break;
                }
                break;
            default:
                this.f3889b.n();
                break;
        }
    }
}
